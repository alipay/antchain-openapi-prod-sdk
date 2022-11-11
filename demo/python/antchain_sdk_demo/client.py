# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_demo import models as demo_models
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
        config: demo_models.Config,
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
            'keepAliveDurationMillis': self._keep_alive_duration_millis,
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
            # Demo类
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
                    'sdk_version': '1.0.120'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'centre-openapi.antchain.antgroup.com'),
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
            'keepAliveDurationMillis': self._keep_alive_duration_millis,
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
            # Demo类
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
                    'sdk_version': '1.0.120'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'centre-openapi.antchain.antgroup.com'),
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

    def bind_qwe_qwe(
        self,
        request: demo_models.BindQweQweRequest,
    ) -> demo_models.BindQweQweResponse:
        """
        Description: 123
        Summary: 123
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_qwe_qwe_ex(request, headers, runtime)

    async def bind_qwe_qwe_async(
        self,
        request: demo_models.BindQweQweRequest,
    ) -> demo_models.BindQweQweResponse:
        """
        Description: 123
        Summary: 123
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_qwe_qwe_ex_async(request, headers, runtime)

    def bind_qwe_qwe_ex(
        self,
        request: demo_models.BindQweQweRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindQweQweResponse:
        """
        Description: 123
        Summary: 123
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindQweQweResponse(),
            self.do_request('1.0', 'demo.qwe.qwe.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_qwe_qwe_ex_async(
        self,
        request: demo_models.BindQweQweRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindQweQweResponse:
        """
        Description: 123
        Summary: 123
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindQweQweResponse(),
            await self.do_request_async('1.0', 'demo.qwe.qwe.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_sdf_sss_sss(
        self,
        request: demo_models.BindSdfSssSssRequest,
    ) -> demo_models.BindSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_sdf_sss_sss_ex(request, headers, runtime)

    async def bind_sdf_sss_sss_async(
        self,
        request: demo_models.BindSdfSssSssRequest,
    ) -> demo_models.BindSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_sdf_sss_sss_ex_async(request, headers, runtime)

    def bind_sdf_sss_sss_ex(
        self,
        request: demo_models.BindSdfSssSssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindSdfSssSssResponse(),
            self.do_request('1.0', 'demo.sdf.sss.sss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_sdf_sss_sss_ex_async(
        self,
        request: demo_models.BindSdfSssSssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindSdfSssSssResponse(),
            await self.do_request_async('1.0', 'demo.sdf.sss.sss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def status_gateway_check(
        self,
        request: demo_models.StatusGatewayCheckRequest,
    ) -> demo_models.StatusGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_gateway_check_ex(request, headers, runtime)

    async def status_gateway_check_async(
        self,
        request: demo_models.StatusGatewayCheckRequest,
    ) -> demo_models.StatusGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_gateway_check_ex_async(request, headers, runtime)

    def status_gateway_check_ex(
        self,
        request: demo_models.StatusGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.StatusGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.StatusGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_gateway_check_ex_async(
        self,
        request: demo_models.StatusGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.StatusGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.StatusGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def echo_gateway_check(
        self,
        request: demo_models.EchoGatewayCheckRequest,
    ) -> demo_models.EchoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        测试下
        Summary: 返回输入值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.echo_gateway_check_ex(request, headers, runtime)

    async def echo_gateway_check_async(
        self,
        request: demo_models.EchoGatewayCheckRequest,
    ) -> demo_models.EchoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        测试下
        Summary: 返回输入值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.echo_gateway_check_ex_async(request, headers, runtime)

    def echo_gateway_check_ex(
        self,
        request: demo_models.EchoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.EchoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        测试下
        Summary: 返回输入值
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demo_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.gateway.check.echo',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'OK'):
                echo_gateway_check_response = demo_models.EchoGatewayCheckResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return echo_gateway_check_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.EchoGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def echo_gateway_check_ex_async(
        self,
        request: demo_models.EchoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.EchoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        测试下
        Summary: 返回输入值
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demo_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.gateway.check.echo',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'OK'):
                echo_gateway_check_response = demo_models.EchoGatewayCheckResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return echo_gateway_check_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.EchoGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_check(
        self,
        request: demo_models.QueryGatewayCheckRequest,
    ) -> demo_models.QueryGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_check_ex(request, headers, runtime)

    async def query_gateway_check_async(
        self,
        request: demo_models.QueryGatewayCheckRequest,
    ) -> demo_models.QueryGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_check_ex_async(request, headers, runtime)

    def query_gateway_check_ex(
        self,
        request: demo_models.QueryGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_check_ex_async(
        self,
        request: demo_models.QueryGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_test(
        self,
        request: demo_models.QueryGatewayTestRequest,
    ) -> demo_models.QueryGatewayTestResponse:
        """
        Description: 测试用aaa
        Summary: 测试001
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_test_ex(request, headers, runtime)

    async def query_gateway_test_async(
        self,
        request: demo_models.QueryGatewayTestRequest,
    ) -> demo_models.QueryGatewayTestResponse:
        """
        Description: 测试用aaa
        Summary: 测试001
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_test_ex_async(request, headers, runtime)

    def query_gateway_test_ex(
        self,
        request: demo_models.QueryGatewayTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayTestResponse:
        """
        Description: 测试用aaa
        Summary: 测试001
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayTestResponse(),
            self.do_request('1.0', 'demo.gateway.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_test_ex_async(
        self,
        request: demo_models.QueryGatewayTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayTestResponse:
        """
        Description: 测试用aaa
        Summary: 测试001
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayTestResponse(),
            await self.do_request_async('1.0', 'demo.gateway.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_sss_ss_ss(
        self,
        request: demo_models.BindSssSsSsRequest,
    ) -> demo_models.BindSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_sss_ss_ss_ex(request, headers, runtime)

    async def bind_sss_ss_ss_async(
        self,
        request: demo_models.BindSssSsSsRequest,
    ) -> demo_models.BindSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_sss_ss_ss_ex_async(request, headers, runtime)

    def bind_sss_ss_ss_ex(
        self,
        request: demo_models.BindSssSsSsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindSssSsSsResponse(),
            self.do_request('1.0', 'demo.sss.ss.ss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_sss_ss_ss_ex_async(
        self,
        request: demo_models.BindSssSsSsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindSssSsSsResponse(),
            await self.do_request_async('1.0', 'demo.sss.ss.ss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_my(
        self,
        request: demo_models.QueryGatewayMyRequest,
    ) -> demo_models.QueryGatewayMyResponse:
        """
        Description: aaa
        Summary: 测试demo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_my_ex(request, headers, runtime)

    async def query_gateway_my_async(
        self,
        request: demo_models.QueryGatewayMyRequest,
    ) -> demo_models.QueryGatewayMyResponse:
        """
        Description: aaa
        Summary: 测试demo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_my_ex_async(request, headers, runtime)

    def query_gateway_my_ex(
        self,
        request: demo_models.QueryGatewayMyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayMyResponse:
        """
        Description: aaa
        Summary: 测试demo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayMyResponse(),
            self.do_request('1.0', 'demo.gateway.my.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_my_ex_async(
        self,
        request: demo_models.QueryGatewayMyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayMyResponse:
        """
        Description: aaa
        Summary: 测试demo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayMyResponse(),
            await self.do_request_async('1.0', 'demo.gateway.my.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_check_eee(
        self,
        request: demo_models.BindDemoCheckEeeRequest,
    ) -> demo_models.BindDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_check_eee_ex(request, headers, runtime)

    async def bind_demo_check_eee_async(
        self,
        request: demo_models.BindDemoCheckEeeRequest,
    ) -> demo_models.BindDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_check_eee_ex_async(request, headers, runtime)

    def bind_demo_check_eee_ex(
        self,
        request: demo_models.BindDemoCheckEeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindDemoCheckEeeResponse(),
            self.do_request('1.0', 'demo.demo.check.eee.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_check_eee_ex_async(
        self,
        request: demo_models.BindDemoCheckEeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindDemoCheckEeeResponse(),
            await self.do_request_async('1.0', 'demo.demo.check.eee.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_gateway_abc_test(
        self,
        request: demo_models.BindGatewayAbcTestRequest,
    ) -> demo_models.BindGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_gateway_abc_test_ex(request, headers, runtime)

    async def bind_gateway_abc_test_async(
        self,
        request: demo_models.BindGatewayAbcTestRequest,
    ) -> demo_models.BindGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_gateway_abc_test_ex_async(request, headers, runtime)

    def bind_gateway_abc_test_ex(
        self,
        request: demo_models.BindGatewayAbcTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindGatewayAbcTestResponse(),
            self.do_request('1.0', 'demo.gateway.abc.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_gateway_abc_test_ex_async(
        self,
        request: demo_models.BindGatewayAbcTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindGatewayAbcTestResponse(),
            await self.do_request_async('1.0', 'demo.gateway.abc.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_test_test_test(
        self,
        request: demo_models.BindTestTestTestRequest,
    ) -> demo_models.BindTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_test_test_test_ex(request, headers, runtime)

    async def bind_test_test_test_async(
        self,
        request: demo_models.BindTestTestTestRequest,
    ) -> demo_models.BindTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_test_test_test_ex_async(request, headers, runtime)

    def bind_test_test_test_ex(
        self,
        request: demo_models.BindTestTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindTestTestTestResponse(),
            self.do_request('1.0', 'demo.test.test.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_test_test_test_ex_async(
        self,
        request: demo_models.BindTestTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindTestTestTestResponse(),
            await self.do_request_async('1.0', 'demo.test.test.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_check_echotimeout(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutRequest,
    ) -> demo_models.QueryGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_check_echotimeout_ex(request, headers, runtime)

    async def query_gateway_check_echotimeout_async(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutRequest,
    ) -> demo_models.QueryGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_check_echotimeout_ex_async(request, headers, runtime)

    def query_gateway_check_echotimeout_ex(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckEchotimeoutResponse(),
            self.do_request('1.0', 'demo.gateway.check.echotimeout.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_check_echotimeout_ex_async(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckEchotimeoutResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echotimeout.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_check_echoten(
        self,
        request: demo_models.QueryGatewayCheckEchotenRequest,
    ) -> demo_models.QueryGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_check_echoten_ex(request, headers, runtime)

    async def query_gateway_check_echoten_async(
        self,
        request: demo_models.QueryGatewayCheckEchotenRequest,
    ) -> demo_models.QueryGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_check_echoten_ex_async(request, headers, runtime)

    def query_gateway_check_echoten_ex(
        self,
        request: demo_models.QueryGatewayCheckEchotenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckEchotenResponse(),
            self.do_request('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_check_echoten_ex_async(
        self,
        request: demo_models.QueryGatewayCheckEchotenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckEchotenResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ad_asd_asd(
        self,
        request: demo_models.QueryAdAsdAsdRequest,
    ) -> demo_models.QueryAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ad_asd_asd_ex(request, headers, runtime)

    async def query_ad_asd_asd_async(
        self,
        request: demo_models.QueryAdAsdAsdRequest,
    ) -> demo_models.QueryAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ad_asd_asd_ex_async(request, headers, runtime)

    def query_ad_asd_asd_ex(
        self,
        request: demo_models.QueryAdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAdAsdAsdResponse(),
            self.do_request('1.0', 'demo.ad.asd.asd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ad_asd_asd_ex_async(
        self,
        request: demo_models.QueryAdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAdAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.ad.asd.asd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_asd_asd(
        self,
        request: demo_models.BindAsdAsdRequest,
    ) -> demo_models.BindAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_asd_asd_ex(request, headers, runtime)

    async def bind_asd_asd_async(
        self,
        request: demo_models.BindAsdAsdRequest,
    ) -> demo_models.BindAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_asd_asd_ex_async(request, headers, runtime)

    def bind_asd_asd_ex(
        self,
        request: demo_models.BindAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAsdAsdResponse(),
            self.do_request('1.0', 'demo.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_asd_asd_ex_async(
        self,
        request: demo_models.BindAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cjtest_cj(
        self,
        request: demo_models.UpdateCjtestCjRequest,
    ) -> demo_models.UpdateCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cjtest_cj_ex(request, headers, runtime)

    async def update_cjtest_cj_async(
        self,
        request: demo_models.UpdateCjtestCjRequest,
    ) -> demo_models.UpdateCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cjtest_cj_ex_async(request, headers, runtime)

    def update_cjtest_cj_ex(
        self,
        request: demo_models.UpdateCjtestCjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.UpdateCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.UpdateCjtestCjResponse(),
            self.do_request('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cjtest_cj_ex_async(
        self,
        request: demo_models.UpdateCjtestCjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.UpdateCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.UpdateCjtestCjResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_cjtest_source_file(
        self,
        request: demo_models.UploadCjtestSourceFileRequest,
    ) -> demo_models.UploadCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_cjtest_source_file_ex(request, headers, runtime)

    async def upload_cjtest_source_file_async(
        self,
        request: demo_models.UploadCjtestSourceFileRequest,
    ) -> demo_models.UploadCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_cjtest_source_file_ex_async(request, headers, runtime)

    def upload_cjtest_source_file_ex(
        self,
        request: demo_models.UploadCjtestSourceFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.UploadCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demo_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.cjtest.source.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'OK'):
                upload_cjtest_source_file_response = demo_models.UploadCjtestSourceFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_cjtest_source_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.UploadCjtestSourceFileResponse(),
            self.do_request('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_cjtest_source_file_ex_async(
        self,
        request: demo_models.UploadCjtestSourceFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.UploadCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demo_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.cjtest.source.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'OK'):
                upload_cjtest_source_file_response = demo_models.UploadCjtestSourceFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_cjtest_source_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.UploadCjtestSourceFileResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cjtest_cj_res(
        self,
        request: demo_models.QueryCjtestCjResRequest,
    ) -> demo_models.QueryCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cjtest_cj_res_ex(request, headers, runtime)

    async def query_cjtest_cj_res_async(
        self,
        request: demo_models.QueryCjtestCjResRequest,
    ) -> demo_models.QueryCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cjtest_cj_res_ex_async(request, headers, runtime)

    def query_cjtest_cj_res_ex(
        self,
        request: demo_models.QueryCjtestCjResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryCjtestCjResResponse(),
            self.do_request('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cjtest_cj_res_ex_async(
        self,
        request: demo_models.QueryCjtestCjResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryCjtestCjResResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_cjtest_api_authorize(
        self,
        request: demo_models.ResetCjtestApiAuthorizeRequest,
    ) -> demo_models.ResetCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_cjtest_api_authorize_ex(request, headers, runtime)

    async def reset_cjtest_api_authorize_async(
        self,
        request: demo_models.ResetCjtestApiAuthorizeRequest,
    ) -> demo_models.ResetCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_cjtest_api_authorize_ex_async(request, headers, runtime)

    def reset_cjtest_api_authorize_ex(
        self,
        request: demo_models.ResetCjtestApiAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ResetCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ResetCjtestApiAuthorizeResponse(),
            self.do_request('1.0', 'demo.cjtest.api.authorize.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_cjtest_api_authorize_ex_async(
        self,
        request: demo_models.ResetCjtestApiAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ResetCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ResetCjtestApiAuthorizeResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.api.authorize.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_gateway_road(
        self,
        request: demo_models.InitGatewayRoadRequest,
    ) -> demo_models.InitGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_gateway_road_ex(request, headers, runtime)

    async def init_gateway_road_async(
        self,
        request: demo_models.InitGatewayRoadRequest,
    ) -> demo_models.InitGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_gateway_road_ex_async(request, headers, runtime)

    def init_gateway_road_ex(
        self,
        request: demo_models.InitGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.InitGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.InitGatewayRoadResponse(),
            self.do_request('1.0', 'demo.gateway.road.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_gateway_road_ex_async(
        self,
        request: demo_models.InitGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.InitGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.InitGatewayRoadResponse(),
            await self.do_request_async('1.0', 'demo.gateway.road.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_gateway_road(
        self,
        request: demo_models.UpdateGatewayRoadRequest,
    ) -> demo_models.UpdateGatewayRoadResponse:
        """
        Description: 修改入参msg后返回，Fr 自动化连通性测试。
        Summary: road.upd（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_gateway_road_ex(request, headers, runtime)

    async def update_gateway_road_async(
        self,
        request: demo_models.UpdateGatewayRoadRequest,
    ) -> demo_models.UpdateGatewayRoadResponse:
        """
        Description: 修改入参msg后返回，Fr 自动化连通性测试。
        Summary: road.upd（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_gateway_road_ex_async(request, headers, runtime)

    def update_gateway_road_ex(
        self,
        request: demo_models.UpdateGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.UpdateGatewayRoadResponse:
        """
        Description: 修改入参msg后返回，Fr 自动化连通性测试。
        Summary: road.upd（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.UpdateGatewayRoadResponse(),
            self.do_request('1.0', 'demo.gateway.road.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_gateway_road_ex_async(
        self,
        request: demo_models.UpdateGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.UpdateGatewayRoadResponse:
        """
        Description: 修改入参msg后返回，Fr 自动化连通性测试。
        Summary: road.upd（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.UpdateGatewayRoadResponse(),
            await self.do_request_async('1.0', 'demo.gateway.road.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_road(
        self,
        request: demo_models.QueryGatewayRoadRequest,
    ) -> demo_models.QueryGatewayRoadResponse:
        """
        Description: 简单查询处理，Fr 自动化连通性测试。
        Summary: road.query（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_road_ex(request, headers, runtime)

    async def query_gateway_road_async(
        self,
        request: demo_models.QueryGatewayRoadRequest,
    ) -> demo_models.QueryGatewayRoadResponse:
        """
        Description: 简单查询处理，Fr 自动化连通性测试。
        Summary: road.query（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_road_ex_async(request, headers, runtime)

    def query_gateway_road_ex(
        self,
        request: demo_models.QueryGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayRoadResponse:
        """
        Description: 简单查询处理，Fr 自动化连通性测试。
        Summary: road.query（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayRoadResponse(),
            self.do_request('1.0', 'demo.gateway.road.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_road_ex_async(
        self,
        request: demo_models.QueryGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayRoadResponse:
        """
        Description: 简单查询处理，Fr 自动化连通性测试。
        Summary: road.query（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayRoadResponse(),
            await self.do_request_async('1.0', 'demo.gateway.road.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_gateway_road(
        self,
        request: demo_models.ExecGatewayRoadRequest,
    ) -> demo_models.ExecGatewayRoadResponse:
        """
        Description: 简单执行返回处理结果，Fr 自动化连通性测试。
        Summary: road.exec（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_gateway_road_ex(request, headers, runtime)

    async def exec_gateway_road_async(
        self,
        request: demo_models.ExecGatewayRoadRequest,
    ) -> demo_models.ExecGatewayRoadResponse:
        """
        Description: 简单执行返回处理结果，Fr 自动化连通性测试。
        Summary: road.exec（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_gateway_road_ex_async(request, headers, runtime)

    def exec_gateway_road_ex(
        self,
        request: demo_models.ExecGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ExecGatewayRoadResponse:
        """
        Description: 简单执行返回处理结果，Fr 自动化连通性测试。
        Summary: road.exec（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ExecGatewayRoadResponse(),
            self.do_request('1.0', 'demo.gateway.road.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_gateway_road_ex_async(
        self,
        request: demo_models.ExecGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ExecGatewayRoadResponse:
        """
        Description: 简单执行返回处理结果，Fr 自动化连通性测试。
        Summary: road.exec（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ExecGatewayRoadResponse(),
            await self.do_request_async('1.0', 'demo.gateway.road.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_asd_asd_asd(
        self,
        request: demo_models.BindAsdAsdAsdRequest,
    ) -> demo_models.BindAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_asd_asd_asd_ex(request, headers, runtime)

    async def bind_asd_asd_asd_async(
        self,
        request: demo_models.BindAsdAsdAsdRequest,
    ) -> demo_models.BindAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_asd_asd_asd_ex_async(request, headers, runtime)

    def bind_asd_asd_asd_ex(
        self,
        request: demo_models.BindAsdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAsdAsdAsdResponse(),
            self.do_request('1.0', 'demo.asd.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_asd_asd_asd_ex_async(
        self,
        request: demo_models.BindAsdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAsdAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.asd.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_aaa_bbb(
        self,
        request: demo_models.QueryTestAaaBbbRequest,
    ) -> demo_models.QueryTestAaaBbbResponse:
        """
        Description: 共享能力主链路回归验证
        Summary: 共享能力回归验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_aaa_bbb_ex(request, headers, runtime)

    async def query_test_aaa_bbb_async(
        self,
        request: demo_models.QueryTestAaaBbbRequest,
    ) -> demo_models.QueryTestAaaBbbResponse:
        """
        Description: 共享能力主链路回归验证
        Summary: 共享能力回归验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_aaa_bbb_ex_async(request, headers, runtime)

    def query_test_aaa_bbb_ex(
        self,
        request: demo_models.QueryTestAaaBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestAaaBbbResponse:
        """
        Description: 共享能力主链路回归验证
        Summary: 共享能力回归验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestAaaBbbResponse(),
            self.do_request('1.0', 'demo.test.aaa.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_aaa_bbb_ex_async(
        self,
        request: demo_models.QueryTestAaaBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestAaaBbbResponse:
        """
        Description: 共享能力主链路回归验证
        Summary: 共享能力回归验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestAaaBbbResponse(),
            await self.do_request_async('1.0', 'demo.test.aaa.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_bbp_insurance_user(
        self,
        request: demo_models.InitBbpInsuranceUserRequest,
    ) -> demo_models.InitBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_bbp_insurance_user_ex(request, headers, runtime)

    async def init_bbp_insurance_user_async(
        self,
        request: demo_models.InitBbpInsuranceUserRequest,
    ) -> demo_models.InitBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_bbp_insurance_user_ex_async(request, headers, runtime)

    def init_bbp_insurance_user_ex(
        self,
        request: demo_models.InitBbpInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.InitBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.InitBbpInsuranceUserResponse(),
            self.do_request('1.0', 'demo.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_bbp_insurance_user_ex_async(
        self,
        request: demo_models.InitBbpInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.InitBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.InitBbpInsuranceUserResponse(),
            await self.do_request_async('1.0', 'demo.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_testobject_bbb(
        self,
        request: demo_models.QueryTestTestobjectBbbRequest,
    ) -> demo_models.QueryTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_testobject_bbb_ex(request, headers, runtime)

    async def query_test_testobject_bbb_async(
        self,
        request: demo_models.QueryTestTestobjectBbbRequest,
    ) -> demo_models.QueryTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_testobject_bbb_ex_async(request, headers, runtime)

    def query_test_testobject_bbb_ex(
        self,
        request: demo_models.QueryTestTestobjectBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTestobjectBbbResponse(),
            self.do_request('1.0', 'demo.test.testobject.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_testobject_bbb_ex_async(
        self,
        request: demo_models.QueryTestTestobjectBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTestobjectBbbResponse(),
            await self.do_request_async('1.0', 'demo.test.testobject.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_gateway_test(
        self,
        request: demo_models.QueryTestGatewayTestRequest,
    ) -> demo_models.QueryTestGatewayTestResponse:
        """
        Description: 测试使用1
        Summary: 测试创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_gateway_test_ex(request, headers, runtime)

    async def query_test_gateway_test_async(
        self,
        request: demo_models.QueryTestGatewayTestRequest,
    ) -> demo_models.QueryTestGatewayTestResponse:
        """
        Description: 测试使用1
        Summary: 测试创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_gateway_test_ex_async(request, headers, runtime)

    def query_test_gateway_test_ex(
        self,
        request: demo_models.QueryTestGatewayTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestGatewayTestResponse:
        """
        Description: 测试使用1
        Summary: 测试创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestGatewayTestResponse(),
            self.do_request('1.0', 'demo.test.gateway.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_gateway_test_ex_async(
        self,
        request: demo_models.QueryTestGatewayTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestGatewayTestResponse:
        """
        Description: 测试使用1
        Summary: 测试创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestGatewayTestResponse(),
            await self.do_request_async('1.0', 'demo.test.gateway.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gongxiang_test_demo(
        self,
        request: demo_models.QueryGongxiangTestDemoRequest,
    ) -> demo_models.QueryGongxiangTestDemoResponse:
        """
        Description: 共享能力中心六期回归验证创建使用
        Summary: 共享能力中心六期回归验证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gongxiang_test_demo_ex(request, headers, runtime)

    async def query_gongxiang_test_demo_async(
        self,
        request: demo_models.QueryGongxiangTestDemoRequest,
    ) -> demo_models.QueryGongxiangTestDemoResponse:
        """
        Description: 共享能力中心六期回归验证创建使用
        Summary: 共享能力中心六期回归验证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gongxiang_test_demo_ex_async(request, headers, runtime)

    def query_gongxiang_test_demo_ex(
        self,
        request: demo_models.QueryGongxiangTestDemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGongxiangTestDemoResponse:
        """
        Description: 共享能力中心六期回归验证创建使用
        Summary: 共享能力中心六期回归验证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGongxiangTestDemoResponse(),
            self.do_request('1.0', 'demo.gongxiang.test.demo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gongxiang_test_demo_ex_async(
        self,
        request: demo_models.QueryGongxiangTestDemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGongxiangTestDemoResponse:
        """
        Description: 共享能力中心六期回归验证创建使用
        Summary: 共享能力中心六期回归验证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGongxiangTestDemoResponse(),
            await self.do_request_async('1.0', 'demo.gongxiang.test.demo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_test_bizevent_message(
        self,
        request: demo_models.RegisterTestBizeventMessageRequest,
    ) -> demo_models.RegisterTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_test_bizevent_message_ex(request, headers, runtime)

    async def register_test_bizevent_message_async(
        self,
        request: demo_models.RegisterTestBizeventMessageRequest,
    ) -> demo_models.RegisterTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_test_bizevent_message_ex_async(request, headers, runtime)

    def register_test_bizevent_message_ex(
        self,
        request: demo_models.RegisterTestBizeventMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.RegisterTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.RegisterTestBizeventMessageResponse(),
            self.do_request('1.0', 'demo.test.bizevent.message.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_test_bizevent_message_ex_async(
        self,
        request: demo_models.RegisterTestBizeventMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.RegisterTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.RegisterTestBizeventMessageResponse(),
            await self.do_request_async('1.0', 'demo.test.bizevent.message.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_gongxaing_test(
        self,
        request: demo_models.BindGongxaingTestRequest,
    ) -> demo_models.BindGongxaingTestResponse:
        """
        Description: 共享能力六期回归验证
        Summary: 共享能力六期回归验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_gongxaing_test_ex(request, headers, runtime)

    async def bind_gongxaing_test_async(
        self,
        request: demo_models.BindGongxaingTestRequest,
    ) -> demo_models.BindGongxaingTestResponse:
        """
        Description: 共享能力六期回归验证
        Summary: 共享能力六期回归验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_gongxaing_test_ex_async(request, headers, runtime)

    def bind_gongxaing_test_ex(
        self,
        request: demo_models.BindGongxaingTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindGongxaingTestResponse:
        """
        Description: 共享能力六期回归验证
        Summary: 共享能力六期回归验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindGongxaingTestResponse(),
            self.do_request('1.0', 'demo.gongxaing.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_gongxaing_test_ex_async(
        self,
        request: demo_models.BindGongxaingTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindGongxaingTestResponse:
        """
        Description: 共享能力六期回归验证
        Summary: 共享能力六期回归验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindGongxaingTestResponse(),
            await self.do_request_async('1.0', 'demo.gongxaing.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_aaa_bbb_ccc(
        self,
        request: demo_models.BindAaaBbbCccRequest,
    ) -> demo_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建
        Summary: 自动化测试创建1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_aaa_bbb_ccc_ex(request, headers, runtime)

    async def bind_aaa_bbb_ccc_async(
        self,
        request: demo_models.BindAaaBbbCccRequest,
    ) -> demo_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建
        Summary: 自动化测试创建1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def bind_aaa_bbb_ccc_ex(
        self,
        request: demo_models.BindAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建
        Summary: 自动化测试创建1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAaaBbbCccResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_aaa_bbb_ccc_ex_async(
        self,
        request: demo_models.BindAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建
        Summary: 自动化测试创建1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_masterstation_masterdata(
        self,
        request: demo_models.QueryMasterstationMasterdataRequest,
    ) -> demo_models.QueryMasterstationMasterdataResponse:
        """
        Description: 查询主数据
        Summary: 查询主数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_masterstation_masterdata_ex(request, headers, runtime)

    async def query_masterstation_masterdata_async(
        self,
        request: demo_models.QueryMasterstationMasterdataRequest,
    ) -> demo_models.QueryMasterstationMasterdataResponse:
        """
        Description: 查询主数据
        Summary: 查询主数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_masterstation_masterdata_ex_async(request, headers, runtime)

    def query_masterstation_masterdata_ex(
        self,
        request: demo_models.QueryMasterstationMasterdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryMasterstationMasterdataResponse:
        """
        Description: 查询主数据
        Summary: 查询主数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryMasterstationMasterdataResponse(),
            self.do_request('1.0', 'demo.masterstation.masterdata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_masterstation_masterdata_ex_async(
        self,
        request: demo_models.QueryMasterstationMasterdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryMasterstationMasterdataResponse:
        """
        Description: 查询主数据
        Summary: 查询主数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryMasterstationMasterdataResponse(),
            await self.do_request_async('1.0', 'demo.masterstation.masterdata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aaa_bbb_ccc(
        self,
        request: demo_models.QueryAaaBbbCccRequest,
    ) -> demo_models.QueryAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aaa_bbb_ccc_ex(request, headers, runtime)

    async def query_aaa_bbb_ccc_async(
        self,
        request: demo_models.QueryAaaBbbCccRequest,
    ) -> demo_models.QueryAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def query_aaa_bbb_ccc_ex(
        self,
        request: demo_models.QueryAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAaaBbbCccResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aaa_bbb_ccc_ex_async(
        self,
        request: demo_models.QueryAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_abc_abc_abc(
        self,
        request: demo_models.QueryAbcAbcAbcRequest,
    ) -> demo_models.QueryAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_abc_abc_abc_ex(request, headers, runtime)

    async def query_abc_abc_abc_async(
        self,
        request: demo_models.QueryAbcAbcAbcRequest,
    ) -> demo_models.QueryAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_abc_abc_abc_ex_async(request, headers, runtime)

    def query_abc_abc_abc_ex(
        self,
        request: demo_models.QueryAbcAbcAbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAbcAbcAbcResponse(),
            self.do_request('1.0', 'demo.abc.abc.abc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_abc_abc_abc_ex_async(
        self,
        request: demo_models.QueryAbcAbcAbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAbcAbcAbcResponse(),
            await self.do_request_async('1.0', 'demo.abc.abc.abc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_com_cn_cc(
        self,
        request: demo_models.ResetComCnCcRequest,
    ) -> demo_models.ResetComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_com_cn_cc_ex(request, headers, runtime)

    async def reset_com_cn_cc_async(
        self,
        request: demo_models.ResetComCnCcRequest,
    ) -> demo_models.ResetComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_com_cn_cc_ex_async(request, headers, runtime)

    def reset_com_cn_cc_ex(
        self,
        request: demo_models.ResetComCnCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ResetComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ResetComCnCcResponse(),
            self.do_request('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_com_cn_cc_ex_async(
        self,
        request: demo_models.ResetComCnCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ResetComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ResetComCnCcResponse(),
            await self.do_request_async('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_com_cn_test(
        self,
        request: demo_models.ImportComCnTestRequest,
    ) -> demo_models.ImportComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_com_cn_test_ex(request, headers, runtime)

    async def import_com_cn_test_async(
        self,
        request: demo_models.ImportComCnTestRequest,
    ) -> demo_models.ImportComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_com_cn_test_ex_async(request, headers, runtime)

    def import_com_cn_test_ex(
        self,
        request: demo_models.ImportComCnTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ImportComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demo_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.com.cn.test.import',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'OK'):
                import_com_cn_test_response = demo_models.ImportComCnTestResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_com_cn_test_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ImportComCnTestResponse(),
            self.do_request('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_com_cn_test_ex_async(
        self,
        request: demo_models.ImportComCnTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ImportComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demo_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.com.cn.test.import',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'OK'):
                import_com_cn_test_response = demo_models.ImportComCnTestResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_com_cn_test_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ImportComCnTestResponse(),
            await self.do_request_async('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: demo_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> demo_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: demo_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> demo_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: demo_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: demo_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
