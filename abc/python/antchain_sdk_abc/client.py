# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_abc import models as abc_models
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
        config: abc_models.Config,
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
            # 子结构体
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
                    'sdk_version': '1.0.15',
                    '_prod_code': 'ABC',
                    '_prod_channel': 'undefined'
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
            # 子结构体
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
                    'sdk_version': '1.0.15',
                    '_prod_code': 'ABC',
                    '_prod_channel': 'undefined'
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

    def preview_demo(
        self,
        request: abc_models.PreviewDemoRequest,
    ) -> abc_models.PreviewDemoResponse:
        """
        Description: 录入演示111
        Summary: 录入演示API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_demo_ex(request, headers, runtime)

    async def preview_demo_async(
        self,
        request: abc_models.PreviewDemoRequest,
    ) -> abc_models.PreviewDemoResponse:
        """
        Description: 录入演示111
        Summary: 录入演示API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_demo_ex_async(request, headers, runtime)

    def preview_demo_ex(
        self,
        request: abc_models.PreviewDemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.PreviewDemoResponse:
        """
        Description: 录入演示111
        Summary: 录入演示API
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = abc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.abc.demo.preview',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                preview_demo_response = abc_models.PreviewDemoResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return preview_demo_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.PreviewDemoResponse(),
            self.do_request('1.0', 'antchain.abc.demo.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_demo_ex_async(
        self,
        request: abc_models.PreviewDemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.PreviewDemoResponse:
        """
        Description: 录入演示111
        Summary: 录入演示API
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = abc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.abc.demo.preview',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                preview_demo_response = abc_models.PreviewDemoResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return preview_demo_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.PreviewDemoResponse(),
            await self.do_request_async('1.0', 'antchain.abc.demo.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway(
        self,
        request: abc_models.QueryGatewayRequest,
    ) -> abc_models.QueryGatewayResponse:
        """
        Description: 测试导入api1
        Summary: 测试导入api1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_ex(request, headers, runtime)

    async def query_gateway_async(
        self,
        request: abc_models.QueryGatewayRequest,
    ) -> abc_models.QueryGatewayResponse:
        """
        Description: 测试导入api1
        Summary: 测试导入api1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_ex_async(request, headers, runtime)

    def query_gateway_ex(
        self,
        request: abc_models.QueryGatewayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryGatewayResponse:
        """
        Description: 测试导入api1
        Summary: 测试导入api1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryGatewayResponse(),
            self.do_request('1.0', 'antchain.abc.gateway.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_ex_async(
        self,
        request: abc_models.QueryGatewayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryGatewayResponse:
        """
        Description: 测试导入api1
        Summary: 测试导入api1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryGatewayResponse(),
            await self.do_request_async('1.0', 'antchain.abc.gateway.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_abcda_abcddaa(
        self,
        request: abc_models.QueryAbcdaAbcddaaRequest,
    ) -> abc_models.QueryAbcdaAbcddaaResponse:
        """
        Description: 调试a s dddd
        Summary: 调试1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_abcda_abcddaa_ex(request, headers, runtime)

    async def query_abcda_abcddaa_async(
        self,
        request: abc_models.QueryAbcdaAbcddaaRequest,
    ) -> abc_models.QueryAbcdaAbcddaaResponse:
        """
        Description: 调试a s dddd
        Summary: 调试1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_abcda_abcddaa_ex_async(request, headers, runtime)

    def query_abcda_abcddaa_ex(
        self,
        request: abc_models.QueryAbcdaAbcddaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryAbcdaAbcddaaResponse:
        """
        Description: 调试a s dddd
        Summary: 调试1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryAbcdaAbcddaaResponse(),
            self.do_request('1.0', 'antchain.abc.abcda.abcddaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_abcda_abcddaa_ex_async(
        self,
        request: abc_models.QueryAbcdaAbcddaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryAbcdaAbcddaaResponse:
        """
        Description: 调试a s dddd
        Summary: 调试1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryAbcdaAbcddaaResponse(),
            await self.do_request_async('1.0', 'antchain.abc.abcda.abcddaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_security_face(
        self,
        request: abc_models.MatchSecurityFaceRequest,
    ) -> abc_models.MatchSecurityFaceResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_security_face_ex(request, headers, runtime)

    async def match_security_face_async(
        self,
        request: abc_models.MatchSecurityFaceRequest,
    ) -> abc_models.MatchSecurityFaceResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_security_face_ex_async(request, headers, runtime)

    def match_security_face_ex(
        self,
        request: abc_models.MatchSecurityFaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.MatchSecurityFaceResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.MatchSecurityFaceResponse(),
            self.do_request('1.0', 'antchain.abc.security.face.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_security_face_ex_async(
        self,
        request: abc_models.MatchSecurityFaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.MatchSecurityFaceResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.MatchSecurityFaceResponse(),
            await self.do_request_async('1.0', 'antchain.abc.security.face.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_test_file(
        self,
        request: abc_models.UploadTestFileRequest,
    ) -> abc_models.UploadTestFileResponse:
        """
        Description: 文件上传测试接口
        Summary: 文件上传测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_test_file_ex(request, headers, runtime)

    async def upload_test_file_async(
        self,
        request: abc_models.UploadTestFileRequest,
    ) -> abc_models.UploadTestFileResponse:
        """
        Description: 文件上传测试接口
        Summary: 文件上传测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_test_file_ex_async(request, headers, runtime)

    def upload_test_file_ex(
        self,
        request: abc_models.UploadTestFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.UploadTestFileResponse:
        """
        Description: 文件上传测试接口
        Summary: 文件上传测试接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = abc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.abc.test.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_test_file_response = abc_models.UploadTestFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_test_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.UploadTestFileResponse(),
            self.do_request('1.0', 'antchain.abc.test.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_test_file_ex_async(
        self,
        request: abc_models.UploadTestFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.UploadTestFileResponse:
        """
        Description: 文件上传测试接口
        Summary: 文件上传测试接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = abc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.abc.test.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_test_file_response = abc_models.UploadTestFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_test_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.UploadTestFileResponse(),
            await self.do_request_async('1.0', 'antchain.abc.test.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_time_one(
        self,
        request: abc_models.QueryTimeOneRequest,
    ) -> abc_models.QueryTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_time_one_ex(request, headers, runtime)

    async def query_time_one_async(
        self,
        request: abc_models.QueryTimeOneRequest,
    ) -> abc_models.QueryTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_time_one_ex_async(request, headers, runtime)

    def query_time_one_ex(
        self,
        request: abc_models.QueryTimeOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeOneResponse(),
            self.do_request('1.0', 'antchain.abc.time.one.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_time_one_ex_async(
        self,
        request: abc_models.QueryTimeOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeOneResponse(),
            await self.do_request_async('1.0', 'antchain.abc.time.one.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_time_two(
        self,
        request: abc_models.QueryTimeTwoRequest,
    ) -> abc_models.QueryTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_time_two_ex(request, headers, runtime)

    async def query_time_two_async(
        self,
        request: abc_models.QueryTimeTwoRequest,
    ) -> abc_models.QueryTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_time_two_ex_async(request, headers, runtime)

    def query_time_two_ex(
        self,
        request: abc_models.QueryTimeTwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeTwoResponse(),
            self.do_request('1.0', 'antchain.abc.time.two.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_time_two_ex_async(
        self,
        request: abc_models.QueryTimeTwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeTwoResponse(),
            await self.do_request_async('1.0', 'antchain.abc.time.two.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_time_three(
        self,
        request: abc_models.QueryTimeThreeRequest,
    ) -> abc_models.QueryTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_time_three_ex(request, headers, runtime)

    async def query_time_three_async(
        self,
        request: abc_models.QueryTimeThreeRequest,
    ) -> abc_models.QueryTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_time_three_ex_async(request, headers, runtime)

    def query_time_three_ex(
        self,
        request: abc_models.QueryTimeThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeThreeResponse(),
            self.do_request('1.0', 'antchain.abc.time.three.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_time_three_ex_async(
        self,
        request: abc_models.QueryTimeThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeThreeResponse(),
            await self.do_request_async('1.0', 'antchain.abc.time.three.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_time_four(
        self,
        request: abc_models.QueryTimeFourRequest,
    ) -> abc_models.QueryTimeFourResponse:
        """
        Description: 压测接口4
        Summary: 压测接口4
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_time_four_ex(request, headers, runtime)

    async def query_time_four_async(
        self,
        request: abc_models.QueryTimeFourRequest,
    ) -> abc_models.QueryTimeFourResponse:
        """
        Description: 压测接口4
        Summary: 压测接口4
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_time_four_ex_async(request, headers, runtime)

    def query_time_four_ex(
        self,
        request: abc_models.QueryTimeFourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeFourResponse:
        """
        Description: 压测接口4
        Summary: 压测接口4
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeFourResponse(),
            self.do_request('1.0', 'antchain.abc.time.four.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_time_four_ex_async(
        self,
        request: abc_models.QueryTimeFourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeFourResponse:
        """
        Description: 压测接口4
        Summary: 压测接口4
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeFourResponse(),
            await self.do_request_async('1.0', 'antchain.abc.time.four.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_time_five(
        self,
        request: abc_models.QueryTimeFiveRequest,
    ) -> abc_models.QueryTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_time_five_ex(request, headers, runtime)

    async def query_time_five_async(
        self,
        request: abc_models.QueryTimeFiveRequest,
    ) -> abc_models.QueryTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_time_five_ex_async(request, headers, runtime)

    def query_time_five_ex(
        self,
        request: abc_models.QueryTimeFiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeFiveResponse(),
            self.do_request('1.0', 'antchain.abc.time.five.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_time_five_ex_async(
        self,
        request: abc_models.QueryTimeFiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryTimeFiveResponse(),
            await self.do_request_async('1.0', 'antchain.abc.time.five.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def createapi_existing_products(
        self,
        request: abc_models.CreateapiExistingProductsRequest,
    ) -> abc_models.CreateapiExistingProductsResponse:
        """
        Description: 已有产品创建api
        Summary: 已有产品创建api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.createapi_existing_products_ex(request, headers, runtime)

    async def createapi_existing_products_async(
        self,
        request: abc_models.CreateapiExistingProductsRequest,
    ) -> abc_models.CreateapiExistingProductsResponse:
        """
        Description: 已有产品创建api
        Summary: 已有产品创建api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.createapi_existing_products_ex_async(request, headers, runtime)

    def createapi_existing_products_ex(
        self,
        request: abc_models.CreateapiExistingProductsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.CreateapiExistingProductsResponse:
        """
        Description: 已有产品创建api
        Summary: 已有产品创建api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.CreateapiExistingProductsResponse(),
            self.do_request('1.0', 'antchain.abc.existing.products.createapi', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def createapi_existing_products_ex_async(
        self,
        request: abc_models.CreateapiExistingProductsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.CreateapiExistingProductsResponse:
        """
        Description: 已有产品创建api
        Summary: 已有产品创建api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.CreateapiExistingProductsResponse(),
            await self.do_request_async('1.0', 'antchain.abc.existing.products.createapi', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def a_pre_create_api(
        self,
        request: abc_models.APreCreateApiRequest,
    ) -> abc_models.APreCreateApiResponse:
        """
        Description: 已有产品下创建的api
        Summary: 已有产品下创建的api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.a_pre_create_api_ex(request, headers, runtime)

    async def a_pre_create_api_async(
        self,
        request: abc_models.APreCreateApiRequest,
    ) -> abc_models.APreCreateApiResponse:
        """
        Description: 已有产品下创建的api
        Summary: 已有产品下创建的api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.a_pre_create_api_ex_async(request, headers, runtime)

    def a_pre_create_api_ex(
        self,
        request: abc_models.APreCreateApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.APreCreateApiResponse:
        """
        Description: 已有产品下创建的api
        Summary: 已有产品下创建的api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.APreCreateApiResponse(),
            self.do_request('1.0', 'antchain.abc.pre.create.api.a', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def a_pre_create_api_ex_async(
        self,
        request: abc_models.APreCreateApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.APreCreateApiResponse:
        """
        Description: 已有产品下创建的api
        Summary: 已有产品下创建的api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.APreCreateApiResponse(),
            await self.do_request_async('1.0', 'antchain.abc.pre.create.api.a', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_test_create(
        self,
        request: abc_models.ApiTestCreateRequest,
    ) -> abc_models.ApiTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_test_create_ex(request, headers, runtime)

    async def api_test_create_async(
        self,
        request: abc_models.ApiTestCreateRequest,
    ) -> abc_models.ApiTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_test_create_ex_async(request, headers, runtime)

    def api_test_create_ex(
        self,
        request: abc_models.ApiTestCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.ApiTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.ApiTestCreateResponse(),
            self.do_request('1.0', 'antchain.abc.test.create.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_test_create_ex_async(
        self,
        request: abc_models.ApiTestCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.ApiTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.ApiTestCreateResponse(),
            await self.do_request_async('1.0', 'antchain.abc.test.create.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_approval_test(
        self,
        request: abc_models.QueryApprovalTestRequest,
    ) -> abc_models.QueryApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_approval_test_ex(request, headers, runtime)

    async def query_approval_test_async(
        self,
        request: abc_models.QueryApprovalTestRequest,
    ) -> abc_models.QueryApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_approval_test_ex_async(request, headers, runtime)

    def query_approval_test_ex(
        self,
        request: abc_models.QueryApprovalTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryApprovalTestResponse(),
            self.do_request('1.0', 'antchain.abc.approval.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_approval_test_ex_async(
        self,
        request: abc_models.QueryApprovalTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryApprovalTestResponse(),
            await self.do_request_async('1.0', 'antchain.abc.approval.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_one_limit(
        self,
        request: abc_models.QueryOneLimitRequest,
    ) -> abc_models.QueryOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_one_limit_ex(request, headers, runtime)

    async def query_one_limit_async(
        self,
        request: abc_models.QueryOneLimitRequest,
    ) -> abc_models.QueryOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_one_limit_ex_async(request, headers, runtime)

    def query_one_limit_ex(
        self,
        request: abc_models.QueryOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryOneLimitResponse(),
            self.do_request('1.0', 'antchain.abc.one.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_one_limit_ex_async(
        self,
        request: abc_models.QueryOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryOneLimitResponse(),
            await self.do_request_async('1.0', 'antchain.abc.one.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_one_limit(
        self,
        request: abc_models.ImportOneLimitRequest,
    ) -> abc_models.ImportOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_one_limit_ex(request, headers, runtime)

    async def import_one_limit_async(
        self,
        request: abc_models.ImportOneLimitRequest,
    ) -> abc_models.ImportOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_one_limit_ex_async(request, headers, runtime)

    def import_one_limit_ex(
        self,
        request: abc_models.ImportOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.ImportOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.ImportOneLimitResponse(),
            self.do_request('1.0', 'antchain.abc.one.limit.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_one_limit_ex_async(
        self,
        request: abc_models.ImportOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.ImportOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.ImportOneLimitResponse(),
            await self.do_request_async('1.0', 'antchain.abc.one.limit.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stabilize_one_limit(
        self,
        request: abc_models.StabilizeOneLimitRequest,
    ) -> abc_models.StabilizeOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stabilize_one_limit_ex(request, headers, runtime)

    async def stabilize_one_limit_async(
        self,
        request: abc_models.StabilizeOneLimitRequest,
    ) -> abc_models.StabilizeOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stabilize_one_limit_ex_async(request, headers, runtime)

    def stabilize_one_limit_ex(
        self,
        request: abc_models.StabilizeOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.StabilizeOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.StabilizeOneLimitResponse(),
            self.do_request('1.0', 'antchain.abc.one.limit.stabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stabilize_one_limit_ex_async(
        self,
        request: abc_models.StabilizeOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.StabilizeOneLimitResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.StabilizeOneLimitResponse(),
            await self.do_request_async('1.0', 'antchain.abc.one.limit.stabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unstabilize_one_limit(
        self,
        request: abc_models.UnstabilizeOneLimitRequest,
    ) -> abc_models.UnstabilizeOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unstabilize_one_limit_ex(request, headers, runtime)

    async def unstabilize_one_limit_async(
        self,
        request: abc_models.UnstabilizeOneLimitRequest,
    ) -> abc_models.UnstabilizeOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unstabilize_one_limit_ex_async(request, headers, runtime)

    def unstabilize_one_limit_ex(
        self,
        request: abc_models.UnstabilizeOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.UnstabilizeOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.UnstabilizeOneLimitResponse(),
            self.do_request('1.0', 'antchain.abc.one.limit.unstabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unstabilize_one_limit_ex_async(
        self,
        request: abc_models.UnstabilizeOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.UnstabilizeOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.UnstabilizeOneLimitResponse(),
            await self.do_request_async('1.0', 'antchain.abc.one.limit.unstabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gongxiang_testtest(
        self,
        request: abc_models.QueryGongxiangTesttestRequest,
    ) -> abc_models.QueryGongxiangTesttestResponse:
        """
        Description: 用于共享能力中心六期接入rasp回归验证
        Summary: 用于共享能力中心六期接入rasp回归验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gongxiang_testtest_ex(request, headers, runtime)

    async def query_gongxiang_testtest_async(
        self,
        request: abc_models.QueryGongxiangTesttestRequest,
    ) -> abc_models.QueryGongxiangTesttestResponse:
        """
        Description: 用于共享能力中心六期接入rasp回归验证
        Summary: 用于共享能力中心六期接入rasp回归验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gongxiang_testtest_ex_async(request, headers, runtime)

    def query_gongxiang_testtest_ex(
        self,
        request: abc_models.QueryGongxiangTesttestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryGongxiangTesttestResponse:
        """
        Description: 用于共享能力中心六期接入rasp回归验证
        Summary: 用于共享能力中心六期接入rasp回归验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryGongxiangTesttestResponse(),
            self.do_request('1.0', 'antchain.abc.gongxiang.testtest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gongxiang_testtest_ex_async(
        self,
        request: abc_models.QueryGongxiangTesttestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.QueryGongxiangTesttestResponse:
        """
        Description: 用于共享能力中心六期接入rasp回归验证
        Summary: 用于共享能力中心六期接入rasp回归验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.QueryGongxiangTesttestResponse(),
            await self.do_request_async('1.0', 'antchain.abc.gongxiang.testtest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: abc_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> abc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: abc_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> abc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: abc_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: abc_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> abc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            abc_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
