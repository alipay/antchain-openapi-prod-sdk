# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_testjzq import models as testjzq_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from alibabacloud_rpc_util.client import Client as RPCUtilClient


class Client:
    _endpoint: str = None
    _region_id: str = None
    _access_key_id: str = None
    _access_key_secret: str = None
    _protocol: str = None
    _user_agent: str = None
    _read_timeout: int = None
    _connect_timeout: int = None
    _http_proxy: str = None
    _https_proxy: str = None
    _socks_5proxy: str = None
    _socks_5net_work: str = None
    _no_proxy: str = None
    _max_idle_conns: int = None
    _security_token: str = None
    _max_idle_time_millis: int = None
    _keep_alive_duration_millis: int = None
    _max_requests: int = None
    _max_requests_per_host: int = None

    def __init__(
        self, 
        config: testjzq_models.Config,
    ):
        """
        Init client with Config
        @param config: config contains the necessary information to create a client
        """
        if UtilClient.is_unset(config):
            raise TeaException({
                'code': 'ParameterMissing',
                'message': "'config' can not be unset"
            })
        self._access_key_id = config.access_key_id
        self._access_key_secret = config.access_key_secret
        self._security_token = config.security_token
        self._endpoint = config.endpoint
        self._protocol = config.protocol
        self._user_agent = config.user_agent
        self._read_timeout = UtilClient.default_number(config.read_timeout, 20000)
        self._connect_timeout = UtilClient.default_number(config.connect_timeout, 20000)
        self._http_proxy = config.http_proxy
        self._https_proxy = config.https_proxy
        self._no_proxy = config.no_proxy
        self._socks_5proxy = config.socks_5proxy
        self._socks_5net_work = config.socks_5net_work
        self._max_idle_conns = UtilClient.default_number(config.max_idle_conns, 60000)
        self._max_idle_time_millis = UtilClient.default_number(config.max_idle_time_millis, 5)
        self._keep_alive_duration_millis = UtilClient.default_number(config.keep_alive_duration_millis, 5000)
        self._max_requests = UtilClient.default_number(config.max_requests, 100)
        self._max_requests_per_host = UtilClient.default_number(config.max_requests_per_host, 100)

    def do_request(
        self,
        version: str,
        action: str,
        protocol: str,
        method: str,
        pathname: str,
        request: dict,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dict:
        """
        Encapsulate the request and invoke the network
        @param action: api name
        @param protocol: http or https
        @param method: e.g. GET
        @param pathname: pathname of every api
        @param request: which contains request params
        @param runtime: which controls some details of call api, such as retry times
        @return: the response
        """
        runtime.validate()
        _runtime = {
            'timeouted': 'retry',
            'readTimeout': UtilClient.default_number(runtime.read_timeout, self._read_timeout),
            'connectTimeout': UtilClient.default_number(runtime.connect_timeout, self._connect_timeout),
            'httpProxy': UtilClient.default_string(runtime.http_proxy, self._http_proxy),
            'httpsProxy': UtilClient.default_string(runtime.https_proxy, self._https_proxy),
            'noProxy': UtilClient.default_string(runtime.no_proxy, self._no_proxy),
            'maxIdleConns': UtilClient.default_number(runtime.max_idle_conns, self._max_idle_conns),
            'maxIdleTimeMillis': self._max_idle_time_millis,
            'keepAliveDuration': self._keep_alive_duration_millis,
            'maxRequests': self._max_requests,
            'maxRequestsPerHost': self._max_requests_per_host,
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl,
            # ceshi
        }
        _last_request = None
        _last_exception = None
        _now = time.time()
        _retry_times = 0
        while TeaCore.allow_retry(_runtime.get('retry'), _retry_times, _now):
            if _retry_times > 0:
                _backoff_time = TeaCore.get_backoff_time(_runtime.get('backoff'), _retry_times)
                if _backoff_time > 0:
                    TeaCore.sleep(_backoff_time)
            _retry_times = _retry_times + 1
            try:
                _request = TeaRequest()
                _request.protocol = UtilClient.default_string(self._protocol, protocol)
                _request.method = method
                _request.pathname = pathname
                _request.query = {
                    'method': action,
                    'version': version,
                    'sign_type': 'HmacSHA1',
                    'req_time': AntchainUtils.get_timestamp(),
                    'req_msg_id': AntchainUtils.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.0.16',
                    '_prod_code': 'TESTJZQ',
                    '_prod_channel': 'default'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtils.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtils.has_error(raw, self._access_key_secret):
                    raise TeaException({
                        'message': resp.get('result_msg'),
                        'data': resp,
                        'code': resp.get('result_code')
                    })
                return resp
            except Exception as e:
                if TeaCore.is_retryable(e):
                    _last_exception = e
                    continue
                raise e
        raise UnretryableException(_last_request, _last_exception)

    async def do_request_async(
        self,
        version: str,
        action: str,
        protocol: str,
        method: str,
        pathname: str,
        request: dict,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dict:
        """
        Encapsulate the request and invoke the network
        @param action: api name
        @param protocol: http or https
        @param method: e.g. GET
        @param pathname: pathname of every api
        @param request: which contains request params
        @param runtime: which controls some details of call api, such as retry times
        @return: the response
        """
        runtime.validate()
        _runtime = {
            'timeouted': 'retry',
            'readTimeout': UtilClient.default_number(runtime.read_timeout, self._read_timeout),
            'connectTimeout': UtilClient.default_number(runtime.connect_timeout, self._connect_timeout),
            'httpProxy': UtilClient.default_string(runtime.http_proxy, self._http_proxy),
            'httpsProxy': UtilClient.default_string(runtime.https_proxy, self._https_proxy),
            'noProxy': UtilClient.default_string(runtime.no_proxy, self._no_proxy),
            'maxIdleConns': UtilClient.default_number(runtime.max_idle_conns, self._max_idle_conns),
            'maxIdleTimeMillis': self._max_idle_time_millis,
            'keepAliveDuration': self._keep_alive_duration_millis,
            'maxRequests': self._max_requests,
            'maxRequestsPerHost': self._max_requests_per_host,
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl,
            # ceshi
        }
        _last_request = None
        _last_exception = None
        _now = time.time()
        _retry_times = 0
        while TeaCore.allow_retry(_runtime.get('retry'), _retry_times, _now):
            if _retry_times > 0:
                _backoff_time = TeaCore.get_backoff_time(_runtime.get('backoff'), _retry_times)
                if _backoff_time > 0:
                    TeaCore.sleep(_backoff_time)
            _retry_times = _retry_times + 1
            try:
                _request = TeaRequest()
                _request.protocol = UtilClient.default_string(self._protocol, protocol)
                _request.method = method
                _request.pathname = pathname
                _request.query = {
                    'method': action,
                    'version': version,
                    'sign_type': 'HmacSHA1',
                    'req_time': AntchainUtils.get_timestamp(),
                    'req_msg_id': AntchainUtils.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.0.16',
                    '_prod_code': 'TESTJZQ',
                    '_prod_channel': 'default'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtils.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtils.has_error(raw, self._access_key_secret):
                    raise TeaException({
                        'message': resp.get('result_msg'),
                        'data': resp,
                        'code': resp.get('result_code')
                    })
                return resp
            except Exception as e:
                if TeaCore.is_retryable(e):
                    _last_exception = e
                    continue
                raise e
        raise UnretryableException(_last_request, _last_exception)

    def api_create_file(
        self,
        request: testjzq_models.ApiCreateFileRequest,
    ) -> testjzq_models.ApiCreateFileResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_create_file_ex(request, headers, runtime)

    async def api_create_file_async(
        self,
        request: testjzq_models.ApiCreateFileRequest,
    ) -> testjzq_models.ApiCreateFileResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_create_file_ex_async(request, headers, runtime)

    def api_create_file_ex(
        self,
        request: testjzq_models.ApiCreateFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ApiCreateFileResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = testjzq_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.testjzq.create.file.api',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                api_create_file_response = testjzq_models.ApiCreateFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return api_create_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ApiCreateFileResponse(),
            self.do_request('1.0', 'antdigital.testjzq.create.file.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_create_file_ex_async(
        self,
        request: testjzq_models.ApiCreateFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ApiCreateFileResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = testjzq_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.testjzq.create.file.api',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                api_create_file_response = testjzq_models.ApiCreateFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return api_create_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ApiCreateFileResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.create.file.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def test_add_struct(
        self,
        request: testjzq_models.TestAddStructRequest,
    ) -> testjzq_models.TestAddStructResponse:
        """
        Description: 测试结构体的部署同步
        Summary: 测试结构体的部署同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.test_add_struct_ex(request, headers, runtime)

    async def test_add_struct_async(
        self,
        request: testjzq_models.TestAddStructRequest,
    ) -> testjzq_models.TestAddStructResponse:
        """
        Description: 测试结构体的部署同步
        Summary: 测试结构体的部署同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.test_add_struct_ex_async(request, headers, runtime)

    def test_add_struct_ex(
        self,
        request: testjzq_models.TestAddStructRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.TestAddStructResponse:
        """
        Description: 测试结构体的部署同步
        Summary: 测试结构体的部署同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.TestAddStructResponse(),
            self.do_request('1.0', 'antdigital.testjzq.add.struct.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def test_add_struct_ex_async(
        self,
        request: testjzq_models.TestAddStructRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.TestAddStructResponse:
        """
        Description: 测试结构体的部署同步
        Summary: 测试结构体的部署同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.TestAddStructResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.add.struct.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def a_demo_test(
        self,
        request: testjzq_models.ADemoTestRequest,
    ) -> testjzq_models.ADemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.a_demo_test_ex(request, headers, runtime)

    async def a_demo_test_async(
        self,
        request: testjzq_models.ADemoTestRequest,
    ) -> testjzq_models.ADemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.a_demo_test_ex_async(request, headers, runtime)

    def a_demo_test_ex(
        self,
        request: testjzq_models.ADemoTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ADemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ADemoTestResponse(),
            self.do_request('1.0', 'antdigital.testjzq.demo.test.a', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def a_demo_test_ex_async(
        self,
        request: testjzq_models.ADemoTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ADemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ADemoTestResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.demo.test.a', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def b_demo_test(
        self,
        request: testjzq_models.BDemoTestRequest,
    ) -> testjzq_models.BDemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.b_demo_test_ex(request, headers, runtime)

    async def b_demo_test_async(
        self,
        request: testjzq_models.BDemoTestRequest,
    ) -> testjzq_models.BDemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.b_demo_test_ex_async(request, headers, runtime)

    def b_demo_test_ex(
        self,
        request: testjzq_models.BDemoTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.BDemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.BDemoTestResponse(),
            self.do_request('1.0', 'antdigital.testjzq.demo.test.b', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def b_demo_test_ex_async(
        self,
        request: testjzq_models.BDemoTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.BDemoTestResponse:
        """
        Description: 111
        Summary: 111
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.BDemoTestResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.demo.test.b', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def c_demo_test(
        self,
        request: testjzq_models.CDemoTestRequest,
    ) -> testjzq_models.CDemoTestResponse:
        """
        Description: ccccc
        Summary: ccccc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.c_demo_test_ex(request, headers, runtime)

    async def c_demo_test_async(
        self,
        request: testjzq_models.CDemoTestRequest,
    ) -> testjzq_models.CDemoTestResponse:
        """
        Description: ccccc
        Summary: ccccc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.c_demo_test_ex_async(request, headers, runtime)

    def c_demo_test_ex(
        self,
        request: testjzq_models.CDemoTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.CDemoTestResponse:
        """
        Description: ccccc
        Summary: ccccc
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.CDemoTestResponse(),
            self.do_request('1.0', 'antdigital.testjzq.demo.test.c', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def c_demo_test_ex_async(
        self,
        request: testjzq_models.CDemoTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.CDemoTestResponse:
        """
        Description: ccccc
        Summary: ccccc
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.CDemoTestResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.demo.test.c', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def q_qq(
        self,
        request: testjzq_models.QQQRequest,
    ) -> testjzq_models.QQQResponse:
        """
        Description: aaaaa
        Summary: aaaaa
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.q_qqex(request, headers, runtime)

    async def q_qq_async(
        self,
        request: testjzq_models.QQQRequest,
    ) -> testjzq_models.QQQResponse:
        """
        Description: aaaaa
        Summary: aaaaa
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.q_qqex_async(request, headers, runtime)

    def q_qqex(
        self,
        request: testjzq_models.QQQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.QQQResponse:
        """
        Description: aaaaa
        Summary: aaaaa
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.QQQResponse(),
            self.do_request('1.0', 'antdigital.testjzq.q.q.q', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def q_qqex_async(
        self,
        request: testjzq_models.QQQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.QQQResponse:
        """
        Description: aaaaa
        Summary: aaaaa
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.QQQResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.q.q.q', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def zz_zz(
        self,
        request: testjzq_models.ZzZZRequest,
    ) -> testjzq_models.ZzZZResponse:
        """
        Description: zzzzzzz
        Summary: zzzzzzz
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.zz_zzex(request, headers, runtime)

    async def zz_zz_async(
        self,
        request: testjzq_models.ZzZZRequest,
    ) -> testjzq_models.ZzZZResponse:
        """
        Description: zzzzzzz
        Summary: zzzzzzz
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.zz_zzex_async(request, headers, runtime)

    def zz_zzex(
        self,
        request: testjzq_models.ZzZZRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ZzZZResponse:
        """
        Description: zzzzzzz
        Summary: zzzzzzz
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ZzZZResponse(),
            self.do_request('1.0', 'antdigital.testjzq.z.z.zz', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def zz_zzex_async(
        self,
        request: testjzq_models.ZzZZRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ZzZZResponse:
        """
        Description: zzzzzzz
        Summary: zzzzzzz
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ZzZZResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.z.z.zz', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_pre_acceptance(
        self,
        request: testjzq_models.ApiPreAcceptanceRequest,
    ) -> testjzq_models.ApiPreAcceptanceResponse:
        """
        Description: 预发验收创建api
        Summary: 预发验收创建api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_pre_acceptance_ex(request, headers, runtime)

    async def api_pre_acceptance_async(
        self,
        request: testjzq_models.ApiPreAcceptanceRequest,
    ) -> testjzq_models.ApiPreAcceptanceResponse:
        """
        Description: 预发验收创建api
        Summary: 预发验收创建api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_pre_acceptance_ex_async(request, headers, runtime)

    def api_pre_acceptance_ex(
        self,
        request: testjzq_models.ApiPreAcceptanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ApiPreAcceptanceResponse:
        """
        Description: 预发验收创建api
        Summary: 预发验收创建api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ApiPreAcceptanceResponse(),
            self.do_request('1.0', 'antdigital.testjzq.pre.acceptance.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_pre_acceptance_ex_async(
        self,
        request: testjzq_models.ApiPreAcceptanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.ApiPreAcceptanceResponse:
        """
        Description: 预发验收创建api
        Summary: 预发验收创建api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.ApiPreAcceptanceResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.pre.acceptance.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def aaa_pre_test_api(
        self,
        request: testjzq_models.AaaPreTestApiRequest,
    ) -> testjzq_models.AaaPreTestApiResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.aaa_pre_test_api_ex(request, headers, runtime)

    async def aaa_pre_test_api_async(
        self,
        request: testjzq_models.AaaPreTestApiRequest,
    ) -> testjzq_models.AaaPreTestApiResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.aaa_pre_test_api_ex_async(request, headers, runtime)

    def aaa_pre_test_api_ex(
        self,
        request: testjzq_models.AaaPreTestApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.AaaPreTestApiResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.AaaPreTestApiResponse(),
            self.do_request('1.0', 'antdigital.testjzq.pre.test.api.aaa', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def aaa_pre_test_api_ex_async(
        self,
        request: testjzq_models.AaaPreTestApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.AaaPreTestApiResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.AaaPreTestApiResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.pre.test.api.aaa', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ss(
        self,
        request: testjzq_models.QuerySsRequest,
    ) -> testjzq_models.QuerySsResponse:
        """
        Description: 测试流程使用
        Summary: 测试流程使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ss_ex(request, headers, runtime)

    async def query_ss_async(
        self,
        request: testjzq_models.QuerySsRequest,
    ) -> testjzq_models.QuerySsResponse:
        """
        Description: 测试流程使用
        Summary: 测试流程使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ss_ex_async(request, headers, runtime)

    def query_ss_ex(
        self,
        request: testjzq_models.QuerySsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.QuerySsResponse:
        """
        Description: 测试流程使用
        Summary: 测试流程使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.QuerySsResponse(),
            self.do_request('1.0', 'antdigital.testjzq.ss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ss_ex_async(
        self,
        request: testjzq_models.QuerySsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.QuerySsResponse:
        """
        Description: 测试流程使用
        Summary: 测试流程使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.QuerySsResponse(),
            await self.do_request_async('1.0', 'antdigital.testjzq.ss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: testjzq_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> testjzq_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: testjzq_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> testjzq_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: testjzq_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: testjzq_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> testjzq_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            testjzq_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
