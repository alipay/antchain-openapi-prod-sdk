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
            # host
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
                    'sdk_version': '1.1.39',
                    '_prod_code': 'DEMO',
                    '_prod_channel': 'undefined'
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
            # host
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
                    'sdk_version': '1.1.39',
                    '_prod_code': 'DEMO',
                    '_prod_channel': 'undefined'
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
        Description: Demo接口，返回当前输入的值
        Summary: 返回输入值1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.echo_gateway_check_ex(request, headers, runtime)

    async def echo_gateway_check_async(
        self,
        request: demo_models.EchoGatewayCheckRequest,
    ) -> demo_models.EchoGatewayCheckResponse:
        """
        Description: Demo接口，返回当前输入的值
        Summary: 返回输入值1
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
        Description: Demo接口，返回当前输入的值
        Summary: 返回输入值1
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
            request.file_object = None
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
        Description: Demo接口，返回当前输入的值
        Summary: 返回输入值1
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
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.EchoGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        Description: 简介简介简介s
        Summary: 简介简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ad_asd_asd_ex(request, headers, runtime)

    async def query_ad_asd_asd_async(
        self,
        request: demo_models.QueryAdAsdAsdRequest,
    ) -> demo_models.QueryAdAsdAsdResponse:
        """
        Description: 简介简介简介s
        Summary: 简介简介
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
        Description: 简介简介简介s
        Summary: 简介简介
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
        Description: 简介简介简介s
        Summary: 简介简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAdAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.ad.asd.asd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_gateway_embed(
        self,
        request: demo_models.QueryGatewayEmbedRequest,
    ) -> demo_models.QueryGatewayEmbedResponse:
        """
        Description: 近端网关测试接口
        Summary: 近端网关测试接口（勿删）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_embed_ex(request, headers, runtime)

    async def query_gateway_embed_async(
        self,
        request: demo_models.QueryGatewayEmbedRequest,
    ) -> demo_models.QueryGatewayEmbedResponse:
        """
        Description: 近端网关测试接口
        Summary: 近端网关测试接口（勿删）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_embed_ex_async(request, headers, runtime)

    def query_gateway_embed_ex(
        self,
        request: demo_models.QueryGatewayEmbedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayEmbedResponse:
        """
        Description: 近端网关测试接口
        Summary: 近端网关测试接口（勿删）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayEmbedResponse(),
            self.do_request('1.0', 'demo.gateway.embed.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_embed_ex_async(
        self,
        request: demo_models.QueryGatewayEmbedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayEmbedResponse:
        """
        Description: 近端网关测试接口
        Summary: 近端网关测试接口（勿删）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayEmbedResponse(),
            await self.do_request_async('1.0', 'demo.gateway.embed.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_gateway_road(
        self,
        request: demo_models.UpdateGatewayRoadRequest,
    ) -> demo_models.UpdateGatewayRoadResponse:
        """
        Description: 更新入参后返回结果，Fr 自动化连通性测试。
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
        Description: 更新入参后返回结果，Fr 自动化连通性测试。
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
        Description: 更新入参后返回结果，Fr 自动化连通性测试。
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
        Description: 更新入参后返回结果，Fr 自动化连通性测试。
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
        Description: 查询并返回结果，Fr 自动化连通性测试。
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
        Description: 查询并返回结果，Fr 自动化连通性测试。
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
        Description: 查询并返回结果，Fr 自动化连通性测试。
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
        Description: 查询并返回结果，Fr 自动化连通性测试。
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
        Description: 执行计算后返回，Fr 自动化连通性测试。
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
        Description: 执行计算后返回，Fr 自动化连通性测试。
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
        Description: 执行计算后返回，Fr 自动化连通性测试。
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
        Description: 执行计算后返回，Fr 自动化连通性测试。
        Summary: road.exec（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ExecGatewayRoadResponse(),
            await self.do_request_async('1.0', 'demo.gateway.road.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadtest_time_three(
        self,
        request: demo_models.QueryLoadtestTimeThreeRequest,
    ) -> demo_models.QueryLoadtestTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadtest_time_three_ex(request, headers, runtime)

    async def query_loadtest_time_three_async(
        self,
        request: demo_models.QueryLoadtestTimeThreeRequest,
    ) -> demo_models.QueryLoadtestTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadtest_time_three_ex_async(request, headers, runtime)

    def query_loadtest_time_three_ex(
        self,
        request: demo_models.QueryLoadtestTimeThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeThreeResponse(),
            self.do_request('1.0', 'demo.loadtest.time.three.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadtest_time_three_ex_async(
        self,
        request: demo_models.QueryLoadtestTimeThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeThreeResponse:
        """
        Description: 压测接口3
        Summary: 压测接口3
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeThreeResponse(),
            await self.do_request_async('1.0', 'demo.loadtest.time.three.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_instanceid_rule(
        self,
        request: demo_models.QueryInstanceidRuleRequest,
    ) -> demo_models.QueryInstanceidRuleResponse:
        """
        Description: test
        Summary: 自动化测试工程使用，勿删勿改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_instanceid_rule_ex(request, headers, runtime)

    async def query_instanceid_rule_async(
        self,
        request: demo_models.QueryInstanceidRuleRequest,
    ) -> demo_models.QueryInstanceidRuleResponse:
        """
        Description: test
        Summary: 自动化测试工程使用，勿删勿改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_instanceid_rule_ex_async(request, headers, runtime)

    def query_instanceid_rule_ex(
        self,
        request: demo_models.QueryInstanceidRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryInstanceidRuleResponse:
        """
        Description: test
        Summary: 自动化测试工程使用，勿删勿改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryInstanceidRuleResponse(),
            self.do_request('1.0', 'demo.instanceid.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_instanceid_rule_ex_async(
        self,
        request: demo_models.QueryInstanceidRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryInstanceidRuleResponse:
        """
        Description: test
        Summary: 自动化测试工程使用，勿删勿改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryInstanceidRuleResponse(),
            await self.do_request_async('1.0', 'demo.instanceid.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_check_echotimeoutok(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutokRequest,
    ) -> demo_models.QueryGatewayCheckEchotimeoutokResponse:
        """
        Description: 设置下游耗时
        Summary: 超时（加密）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_check_echotimeoutok_ex(request, headers, runtime)

    async def query_gateway_check_echotimeoutok_async(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutokRequest,
    ) -> demo_models.QueryGatewayCheckEchotimeoutokResponse:
        """
        Description: 设置下游耗时
        Summary: 超时（加密）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_check_echotimeoutok_ex_async(request, headers, runtime)

    def query_gateway_check_echotimeoutok_ex(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutokRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckEchotimeoutokResponse:
        """
        Description: 设置下游耗时
        Summary: 超时（加密）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckEchotimeoutokResponse(),
            self.do_request('1.0', 'demo.gateway.check.echotimeoutok.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_check_echotimeoutok_ex_async(
        self,
        request: demo_models.QueryGatewayCheckEchotimeoutokRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryGatewayCheckEchotimeoutokResponse:
        """
        Description: 设置下游耗时
        Summary: 超时（加密）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryGatewayCheckEchotimeoutokResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echotimeoutok.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_business_and_instance(
        self,
        request: demo_models.MatchBusinessAndInstanceRequest,
    ) -> demo_models.MatchBusinessAndInstanceResponse:
        """
        Description: 双百&门户&网关，停服决策测试使用
        Summary: 商业化规则测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_business_and_instance_ex(request, headers, runtime)

    async def match_business_and_instance_async(
        self,
        request: demo_models.MatchBusinessAndInstanceRequest,
    ) -> demo_models.MatchBusinessAndInstanceResponse:
        """
        Description: 双百&门户&网关，停服决策测试使用
        Summary: 商业化规则测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_business_and_instance_ex_async(request, headers, runtime)

    def match_business_and_instance_ex(
        self,
        request: demo_models.MatchBusinessAndInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.MatchBusinessAndInstanceResponse:
        """
        Description: 双百&门户&网关，停服决策测试使用
        Summary: 商业化规则测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.MatchBusinessAndInstanceResponse(),
            self.do_request('1.0', 'demo.business.and.instance.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_business_and_instance_ex_async(
        self,
        request: demo_models.MatchBusinessAndInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.MatchBusinessAndInstanceResponse:
        """
        Description: 双百&门户&网关，停服决策测试使用
        Summary: 商业化规则测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.MatchBusinessAndInstanceResponse(),
            await self.do_request_async('1.0', 'demo.business.and.instance.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stream_test(
        self,
        request: demo_models.QueryStreamTestRequest,
    ) -> demo_models.QueryStreamTestResponse:
        """
        Description: 流失查询测试
        Summary: 流失查询测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stream_test_ex(request, headers, runtime)

    async def query_stream_test_async(
        self,
        request: demo_models.QueryStreamTestRequest,
    ) -> demo_models.QueryStreamTestResponse:
        """
        Description: 流失查询测试
        Summary: 流失查询测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stream_test_ex_async(request, headers, runtime)

    def query_stream_test_ex(
        self,
        request: demo_models.QueryStreamTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamTestResponse:
        """
        Description: 流失查询测试
        Summary: 流失查询测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamTestResponse(),
            self.do_request('1.0', 'demo.stream.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stream_test_ex_async(
        self,
        request: demo_models.QueryStreamTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamTestResponse:
        """
        Description: 流失查询测试
        Summary: 流失查询测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamTestResponse(),
            await self.do_request_async('1.0', 'demo.stream.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_catche_limit(
        self,
        request: demo_models.QueryTestCatcheLimitRequest,
    ) -> demo_models.QueryTestCatcheLimitResponse:
        """
        Description: 网关性能优化测试
        Summary: 性能优化测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_catche_limit_ex(request, headers, runtime)

    async def query_test_catche_limit_async(
        self,
        request: demo_models.QueryTestCatcheLimitRequest,
    ) -> demo_models.QueryTestCatcheLimitResponse:
        """
        Description: 网关性能优化测试
        Summary: 性能优化测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_catche_limit_ex_async(request, headers, runtime)

    def query_test_catche_limit_ex(
        self,
        request: demo_models.QueryTestCatcheLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestCatcheLimitResponse:
        """
        Description: 网关性能优化测试
        Summary: 性能优化测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestCatcheLimitResponse(),
            self.do_request('1.0', 'demo.test.catche.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_catche_limit_ex_async(
        self,
        request: demo_models.QueryTestCatcheLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestCatcheLimitResponse:
        """
        Description: 网关性能优化测试
        Summary: 性能优化测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestCatcheLimitResponse(),
            await self.do_request_async('1.0', 'demo.test.catche.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_for_limit(
        self,
        request: demo_models.QueryTestForLimitRequest,
    ) -> demo_models.QueryTestForLimitResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_for_limit_ex(request, headers, runtime)

    async def query_test_for_limit_async(
        self,
        request: demo_models.QueryTestForLimitRequest,
    ) -> demo_models.QueryTestForLimitResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_for_limit_ex_async(request, headers, runtime)

    def query_test_for_limit_ex(
        self,
        request: demo_models.QueryTestForLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestForLimitResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestForLimitResponse(),
            self.do_request('1.0', 'demo.test.for.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_for_limit_ex_async(
        self,
        request: demo_models.QueryTestForLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestForLimitResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestForLimitResponse(),
            await self.do_request_async('1.0', 'demo.test.for.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_test_test(
        self,
        request: demo_models.QueryTestTestTestRequest,
    ) -> demo_models.QueryTestTestTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_test_test_ex(request, headers, runtime)

    async def query_test_test_test_async(
        self,
        request: demo_models.QueryTestTestTestRequest,
    ) -> demo_models.QueryTestTestTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_test_test_ex_async(request, headers, runtime)

    def query_test_test_test_ex(
        self,
        request: demo_models.QueryTestTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTestTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTestTestResponse(),
            self.do_request('1.0', 'demo.test.test.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_test_test_ex_async(
        self,
        request: demo_models.QueryTestTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTestTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTestTestResponse(),
            await self.do_request_async('1.0', 'demo.test.test.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_abc(
        self,
        request: demo_models.QueryABCRequest,
    ) -> demo_models.QueryABCResponse:
        """
        Description: a
        Summary: abcde
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_abcex(request, headers, runtime)

    async def query_abc_async(
        self,
        request: demo_models.QueryABCRequest,
    ) -> demo_models.QueryABCResponse:
        """
        Description: a
        Summary: abcde
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_abcex_async(request, headers, runtime)

    def query_abcex(
        self,
        request: demo_models.QueryABCRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryABCResponse:
        """
        Description: a
        Summary: abcde
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryABCResponse(),
            self.do_request('1.0', 'demo.a.b.c.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_abcex_async(
        self,
        request: demo_models.QueryABCRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryABCResponse:
        """
        Description: a
        Summary: abcde
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryABCResponse(),
            await self.do_request_async('1.0', 'demo.a.b.c.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_embed_user(
        self,
        request: demo_models.QueryTestEmbedUserRequest,
    ) -> demo_models.QueryTestEmbedUserResponse:
        """
        Description: 近端接口测试
        Summary: 近端接口测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_embed_user_ex(request, headers, runtime)

    async def query_test_embed_user_async(
        self,
        request: demo_models.QueryTestEmbedUserRequest,
    ) -> demo_models.QueryTestEmbedUserResponse:
        """
        Description: 近端接口测试
        Summary: 近端接口测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_embed_user_ex_async(request, headers, runtime)

    def query_test_embed_user_ex(
        self,
        request: demo_models.QueryTestEmbedUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestEmbedUserResponse:
        """
        Description: 近端接口测试
        Summary: 近端接口测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestEmbedUserResponse(),
            self.do_request('1.0', 'demo.test.embed.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_embed_user_ex_async(
        self,
        request: demo_models.QueryTestEmbedUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestEmbedUserResponse:
        """
        Description: 近端接口测试
        Summary: 近端接口测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestEmbedUserResponse(),
            await self.do_request_async('1.0', 'demo.test.embed.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aas_sa_sa(
        self,
        request: demo_models.QueryAasSaSaRequest,
    ) -> demo_models.QueryAasSaSaResponse:
        """
        Description: sss
        Summary: sss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aas_sa_sa_ex(request, headers, runtime)

    async def query_aas_sa_sa_async(
        self,
        request: demo_models.QueryAasSaSaRequest,
    ) -> demo_models.QueryAasSaSaResponse:
        """
        Description: sss
        Summary: sss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aas_sa_sa_ex_async(request, headers, runtime)

    def query_aas_sa_sa_ex(
        self,
        request: demo_models.QueryAasSaSaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAasSaSaResponse:
        """
        Description: sss
        Summary: sss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAasSaSaResponse(),
            self.do_request('1.0', 'demo.aas.sa.sa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aas_sa_sa_ex_async(
        self,
        request: demo_models.QueryAasSaSaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAasSaSaResponse:
        """
        Description: sss
        Summary: sss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAasSaSaResponse(),
            await self.do_request_async('1.0', 'demo.aas.sa.sa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_white_list(
        self,
        request: demo_models.QueryApiWhiteListRequest,
    ) -> demo_models.QueryApiWhiteListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_white_list_ex(request, headers, runtime)

    async def query_api_white_list_async(
        self,
        request: demo_models.QueryApiWhiteListRequest,
    ) -> demo_models.QueryApiWhiteListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_white_list_ex_async(request, headers, runtime)

    def query_api_white_list_ex(
        self,
        request: demo_models.QueryApiWhiteListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApiWhiteListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApiWhiteListResponse(),
            self.do_request('1.0', 'demo.api.white.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_white_list_ex_async(
        self,
        request: demo_models.QueryApiWhiteListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApiWhiteListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApiWhiteListResponse(),
            await self.do_request_async('1.0', 'demo.api.white.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_black_list(
        self,
        request: demo_models.QueryApiBlackListRequest,
    ) -> demo_models.QueryApiBlackListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_black_list_ex(request, headers, runtime)

    async def query_api_black_list_async(
        self,
        request: demo_models.QueryApiBlackListRequest,
    ) -> demo_models.QueryApiBlackListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_black_list_ex_async(request, headers, runtime)

    def query_api_black_list_ex(
        self,
        request: demo_models.QueryApiBlackListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApiBlackListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApiBlackListResponse(),
            self.do_request('1.0', 'demo.api.black.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_black_list_ex_async(
        self,
        request: demo_models.QueryApiBlackListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApiBlackListResponse:
        """
        Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
        Summary: 自动化测试需要，【请勿做任何改动！】
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApiBlackListResponse(),
            await self.do_request_async('1.0', 'demo.api.black.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_white_list(
        self,
        request: demo_models.QueryIpWhiteListRequest,
    ) -> demo_models.QueryIpWhiteListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问白名单测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_white_list_ex(request, headers, runtime)

    async def query_ip_white_list_async(
        self,
        request: demo_models.QueryIpWhiteListRequest,
    ) -> demo_models.QueryIpWhiteListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问白名单测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_white_list_ex_async(request, headers, runtime)

    def query_ip_white_list_ex(
        self,
        request: demo_models.QueryIpWhiteListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryIpWhiteListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问白名单测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryIpWhiteListResponse(),
            self.do_request('1.0', 'demo.ip.white.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_white_list_ex_async(
        self,
        request: demo_models.QueryIpWhiteListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryIpWhiteListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问白名单测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryIpWhiteListResponse(),
            await self.do_request_async('1.0', 'demo.ip.white.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_black_list(
        self,
        request: demo_models.QueryIpBlackListRequest,
    ) -> demo_models.QueryIpBlackListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问黑名单测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_black_list_ex(request, headers, runtime)

    async def query_ip_black_list_async(
        self,
        request: demo_models.QueryIpBlackListRequest,
    ) -> demo_models.QueryIpBlackListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问黑名单测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_black_list_ex_async(request, headers, runtime)

    def query_ip_black_list_ex(
        self,
        request: demo_models.QueryIpBlackListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryIpBlackListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问黑名单测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryIpBlackListResponse(),
            self.do_request('1.0', 'demo.ip.black.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_black_list_ex_async(
        self,
        request: demo_models.QueryIpBlackListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryIpBlackListResponse:
        """
        Description: ip访问白名单测试
        Summary: 【自动化】ip访问黑名单测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryIpBlackListResponse(),
            await self.do_request_async('1.0', 'demo.ip.black.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_retry(
        self,
        request: demo_models.QueryIpRetryRequest,
    ) -> demo_models.QueryIpRetryResponse:
        """
        Description: 重试策略
        Summary: 【自动化】重试策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_retry_ex(request, headers, runtime)

    async def query_ip_retry_async(
        self,
        request: demo_models.QueryIpRetryRequest,
    ) -> demo_models.QueryIpRetryResponse:
        """
        Description: 重试策略
        Summary: 【自动化】重试策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_retry_ex_async(request, headers, runtime)

    def query_ip_retry_ex(
        self,
        request: demo_models.QueryIpRetryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryIpRetryResponse:
        """
        Description: 重试策略
        Summary: 【自动化】重试策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryIpRetryResponse(),
            self.do_request('1.0', 'demo.ip.retry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_retry_ex_async(
        self,
        request: demo_models.QueryIpRetryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryIpRetryResponse:
        """
        Description: 重试策略
        Summary: 【自动化】重试策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryIpRetryResponse(),
            await self.do_request_async('1.0', 'demo.ip.retry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_time_testa(
        self,
        request: demo_models.QueryTestTimeTestaRequest,
    ) -> demo_models.QueryTestTimeTestaResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_time_testa_ex(request, headers, runtime)

    async def query_test_time_testa_async(
        self,
        request: demo_models.QueryTestTimeTestaRequest,
    ) -> demo_models.QueryTestTimeTestaResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_time_testa_ex_async(request, headers, runtime)

    def query_test_time_testa_ex(
        self,
        request: demo_models.QueryTestTimeTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTimeTestaResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTimeTestaResponse(),
            self.do_request('1.0', 'demo.test.time.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_time_testa_ex_async(
        self,
        request: demo_models.QueryTestTimeTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTimeTestaResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTimeTestaResponse(),
            await self.do_request_async('1.0', 'demo.test.time.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_oas_rest(
        self,
        request: demo_models.QueryOasRestRequest,
    ) -> demo_models.QueryOasRestResponse:
        """
        Description: oas 测试使用
        Summary: oas 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_oas_rest_ex(request, headers, runtime)

    async def query_oas_rest_async(
        self,
        request: demo_models.QueryOasRestRequest,
    ) -> demo_models.QueryOasRestResponse:
        """
        Description: oas 测试使用
        Summary: oas 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_oas_rest_ex_async(request, headers, runtime)

    def query_oas_rest_ex(
        self,
        request: demo_models.QueryOasRestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryOasRestResponse:
        """
        Description: oas 测试使用
        Summary: oas 测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryOasRestResponse(),
            self.do_request('1.0', 'demo.oas.rest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_oas_rest_ex_async(
        self,
        request: demo_models.QueryOasRestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryOasRestResponse:
        """
        Description: oas 测试使用
        Summary: oas 测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryOasRestResponse(),
            await self.do_request_async('1.0', 'demo.oas.rest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_content_type(
        self,
        request: demo_models.QueryTestContentTypeRequest,
    ) -> demo_models.QueryTestContentTypeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_content_type_ex(request, headers, runtime)

    async def query_test_content_type_async(
        self,
        request: demo_models.QueryTestContentTypeRequest,
    ) -> demo_models.QueryTestContentTypeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_content_type_ex_async(request, headers, runtime)

    def query_test_content_type_ex(
        self,
        request: demo_models.QueryTestContentTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypeResponse(),
            self.do_request('1.0', 'demo.test.content.type.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_content_type_ex_async(
        self,
        request: demo_models.QueryTestContentTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypeResponse(),
            await self.do_request_async('1.0', 'demo.test.content.type.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_content_typeone(
        self,
        request: demo_models.QueryTestContentTypeoneRequest,
    ) -> demo_models.QueryTestContentTypeoneResponse:
        """
        Description: 自动化测试contentType
        Summary: 自动化测试contentType
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_content_typeone_ex(request, headers, runtime)

    async def query_test_content_typeone_async(
        self,
        request: demo_models.QueryTestContentTypeoneRequest,
    ) -> demo_models.QueryTestContentTypeoneResponse:
        """
        Description: 自动化测试contentType
        Summary: 自动化测试contentType
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_content_typeone_ex_async(request, headers, runtime)

    def query_test_content_typeone_ex(
        self,
        request: demo_models.QueryTestContentTypeoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypeoneResponse:
        """
        Description: 自动化测试contentType
        Summary: 自动化测试contentType
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypeoneResponse(),
            self.do_request('1.0', 'demo.test.content.typeone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_content_typeone_ex_async(
        self,
        request: demo_models.QueryTestContentTypeoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypeoneResponse:
        """
        Description: 自动化测试contentType
        Summary: 自动化测试contentType
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypeoneResponse(),
            await self.do_request_async('1.0', 'demo.test.content.typeone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_content_typetwo(
        self,
        request: demo_models.QueryTestContentTypetwoRequest,
    ) -> demo_models.QueryTestContentTypetwoResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_content_typetwo_ex(request, headers, runtime)

    async def query_test_content_typetwo_async(
        self,
        request: demo_models.QueryTestContentTypetwoRequest,
    ) -> demo_models.QueryTestContentTypetwoResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_content_typetwo_ex_async(request, headers, runtime)

    def query_test_content_typetwo_ex(
        self,
        request: demo_models.QueryTestContentTypetwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypetwoResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypetwoResponse(),
            self.do_request('1.0', 'demo.test.content.typetwo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_content_typetwo_ex_async(
        self,
        request: demo_models.QueryTestContentTypetwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypetwoResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypetwoResponse(),
            await self.do_request_async('1.0', 'demo.test.content.typetwo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_content_typethree(
        self,
        request: demo_models.QueryTestContentTypethreeRequest,
    ) -> demo_models.QueryTestContentTypethreeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_content_typethree_ex(request, headers, runtime)

    async def query_test_content_typethree_async(
        self,
        request: demo_models.QueryTestContentTypethreeRequest,
    ) -> demo_models.QueryTestContentTypethreeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_content_typethree_ex_async(request, headers, runtime)

    def query_test_content_typethree_ex(
        self,
        request: demo_models.QueryTestContentTypethreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypethreeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypethreeResponse(),
            self.do_request('1.0', 'demo.test.content.typethree.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_content_typethree_ex_async(
        self,
        request: demo_models.QueryTestContentTypethreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypethreeResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypethreeResponse(),
            await self.do_request_async('1.0', 'demo.test.content.typethree.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_content_typefour(
        self,
        request: demo_models.QueryTestContentTypefourRequest,
    ) -> demo_models.QueryTestContentTypefourResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_content_typefour_ex(request, headers, runtime)

    async def query_test_content_typefour_async(
        self,
        request: demo_models.QueryTestContentTypefourRequest,
    ) -> demo_models.QueryTestContentTypefourResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_content_typefour_ex_async(request, headers, runtime)

    def query_test_content_typefour_ex(
        self,
        request: demo_models.QueryTestContentTypefourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypefourResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypefourResponse(),
            self.do_request('1.0', 'demo.test.content.typefour.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_content_typefour_ex_async(
        self,
        request: demo_models.QueryTestContentTypefourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypefourResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypefourResponse(),
            await self.do_request_async('1.0', 'demo.test.content.typefour.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_content_typefive(
        self,
        request: demo_models.QueryTestContentTypefiveRequest,
    ) -> demo_models.QueryTestContentTypefiveResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_content_typefive_ex(request, headers, runtime)

    async def query_test_content_typefive_async(
        self,
        request: demo_models.QueryTestContentTypefiveRequest,
    ) -> demo_models.QueryTestContentTypefiveResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_content_typefive_ex_async(request, headers, runtime)

    def query_test_content_typefive_ex(
        self,
        request: demo_models.QueryTestContentTypefiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypefiveResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypefiveResponse(),
            self.do_request('1.0', 'demo.test.content.typefive.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_content_typefive_ex_async(
        self,
        request: demo_models.QueryTestContentTypefiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestContentTypefiveResponse:
        """
        Description: 自动化contenttype兼容测试
        Summary: 自动化contenttype兼容测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestContentTypefiveResponse(),
            await self.do_request_async('1.0', 'demo.test.content.typefive.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_agent_financial_risk(
        self,
        request: demo_models.QueryAgentFinancialRiskRequest,
    ) -> demo_models.QueryAgentFinancialRiskResponse:
        """
        Description: 金融场景风险分析
        Summary: 金融场景风险分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_agent_financial_risk_ex(request, headers, runtime)

    async def query_agent_financial_risk_async(
        self,
        request: demo_models.QueryAgentFinancialRiskRequest,
    ) -> demo_models.QueryAgentFinancialRiskResponse:
        """
        Description: 金融场景风险分析
        Summary: 金融场景风险分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_agent_financial_risk_ex_async(request, headers, runtime)

    def query_agent_financial_risk_ex(
        self,
        request: demo_models.QueryAgentFinancialRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAgentFinancialRiskResponse:
        """
        Description: 金融场景风险分析
        Summary: 金融场景风险分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAgentFinancialRiskResponse(),
            self.do_request('1.0', 'demo.agent.financial.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_agent_financial_risk_ex_async(
        self,
        request: demo_models.QueryAgentFinancialRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAgentFinancialRiskResponse:
        """
        Description: 金融场景风险分析
        Summary: 金融场景风险分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAgentFinancialRiskResponse(),
            await self.do_request_async('1.0', 'demo.agent.financial.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stream_testmethod(
        self,
        request: demo_models.QueryStreamTestmethodRequest,
    ) -> demo_models.QueryStreamTestmethodResponse:
        """
        Description: 流式处理
        Summary: 流式处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stream_testmethod_ex(request, headers, runtime)

    async def query_stream_testmethod_async(
        self,
        request: demo_models.QueryStreamTestmethodRequest,
    ) -> demo_models.QueryStreamTestmethodResponse:
        """
        Description: 流式处理
        Summary: 流式处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stream_testmethod_ex_async(request, headers, runtime)

    def query_stream_testmethod_ex(
        self,
        request: demo_models.QueryStreamTestmethodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamTestmethodResponse:
        """
        Description: 流式处理
        Summary: 流式处理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamTestmethodResponse(),
            self.do_request('1.0', 'demo.stream.testmethod.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stream_testmethod_ex_async(
        self,
        request: demo_models.QueryStreamTestmethodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamTestmethodResponse:
        """
        Description: 流式处理
        Summary: 流式处理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamTestmethodResponse(),
            await self.do_request_async('1.0', 'demo.stream.testmethod.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stream_timeout(
        self,
        request: demo_models.QueryStreamTimeoutRequest,
    ) -> demo_models.QueryStreamTimeoutResponse:
        """
        Description: 模拟下游超时情况
        Summary: 流式超时测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stream_timeout_ex(request, headers, runtime)

    async def query_stream_timeout_async(
        self,
        request: demo_models.QueryStreamTimeoutRequest,
    ) -> demo_models.QueryStreamTimeoutResponse:
        """
        Description: 模拟下游超时情况
        Summary: 流式超时测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stream_timeout_ex_async(request, headers, runtime)

    def query_stream_timeout_ex(
        self,
        request: demo_models.QueryStreamTimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamTimeoutResponse:
        """
        Description: 模拟下游超时情况
        Summary: 流式超时测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamTimeoutResponse(),
            self.do_request('1.0', 'demo.stream.timeout.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stream_timeout_ex_async(
        self,
        request: demo_models.QueryStreamTimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamTimeoutResponse:
        """
        Description: 模拟下游超时情况
        Summary: 流式超时测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamTimeoutResponse(),
            await self.do_request_async('1.0', 'demo.stream.timeout.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stream_nonjson(
        self,
        request: demo_models.QueryStreamNonjsonRequest,
    ) -> demo_models.QueryStreamNonjsonResponse:
        """
        Description: 模拟下游返回非json的情况
        Summary: 流式下游返回非json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stream_nonjson_ex(request, headers, runtime)

    async def query_stream_nonjson_async(
        self,
        request: demo_models.QueryStreamNonjsonRequest,
    ) -> demo_models.QueryStreamNonjsonResponse:
        """
        Description: 模拟下游返回非json的情况
        Summary: 流式下游返回非json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stream_nonjson_ex_async(request, headers, runtime)

    def query_stream_nonjson_ex(
        self,
        request: demo_models.QueryStreamNonjsonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamNonjsonResponse:
        """
        Description: 模拟下游返回非json的情况
        Summary: 流式下游返回非json
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamNonjsonResponse(),
            self.do_request('1.0', 'demo.stream.nonjson.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stream_nonjson_ex_async(
        self,
        request: demo_models.QueryStreamNonjsonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamNonjsonResponse:
        """
        Description: 模拟下游返回非json的情况
        Summary: 流式下游返回非json
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamNonjsonResponse(),
            await self.do_request_async('1.0', 'demo.stream.nonjson.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stream_special_characters(
        self,
        request: demo_models.QueryStreamSpecialCharactersRequest,
    ) -> demo_models.QueryStreamSpecialCharactersResponse:
        """
        Description: 流式出参包含特殊字符
        Summary: 流式出参包含特殊字符
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stream_special_characters_ex(request, headers, runtime)

    async def query_stream_special_characters_async(
        self,
        request: demo_models.QueryStreamSpecialCharactersRequest,
    ) -> demo_models.QueryStreamSpecialCharactersResponse:
        """
        Description: 流式出参包含特殊字符
        Summary: 流式出参包含特殊字符
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stream_special_characters_ex_async(request, headers, runtime)

    def query_stream_special_characters_ex(
        self,
        request: demo_models.QueryStreamSpecialCharactersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamSpecialCharactersResponse:
        """
        Description: 流式出参包含特殊字符
        Summary: 流式出参包含特殊字符
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamSpecialCharactersResponse(),
            self.do_request('1.0', 'demo.stream.special.characters.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stream_special_characters_ex_async(
        self,
        request: demo_models.QueryStreamSpecialCharactersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamSpecialCharactersResponse:
        """
        Description: 流式出参包含特殊字符
        Summary: 流式出参包含特殊字符
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamSpecialCharactersResponse(),
            await self.do_request_async('1.0', 'demo.stream.special.characters.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stream_nonstream(
        self,
        request: demo_models.QueryStreamNonstreamRequest,
    ) -> demo_models.QueryStreamNonstreamResponse:
        """
        Description: 非流式返回
        Summary: 非流式返回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stream_nonstream_ex(request, headers, runtime)

    async def query_stream_nonstream_async(
        self,
        request: demo_models.QueryStreamNonstreamRequest,
    ) -> demo_models.QueryStreamNonstreamResponse:
        """
        Description: 非流式返回
        Summary: 非流式返回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stream_nonstream_ex_async(request, headers, runtime)

    def query_stream_nonstream_ex(
        self,
        request: demo_models.QueryStreamNonstreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamNonstreamResponse:
        """
        Description: 非流式返回
        Summary: 非流式返回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamNonstreamResponse(),
            self.do_request('1.0', 'demo.stream.nonstream.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stream_nonstream_ex_async(
        self,
        request: demo_models.QueryStreamNonstreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryStreamNonstreamResponse:
        """
        Description: 非流式返回
        Summary: 非流式返回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryStreamNonstreamResponse(),
            await self.do_request_async('1.0', 'demo.stream.nonstream.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadtest_time_one(
        self,
        request: demo_models.QueryLoadtestTimeOneRequest,
    ) -> demo_models.QueryLoadtestTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadtest_time_one_ex(request, headers, runtime)

    async def query_loadtest_time_one_async(
        self,
        request: demo_models.QueryLoadtestTimeOneRequest,
    ) -> demo_models.QueryLoadtestTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadtest_time_one_ex_async(request, headers, runtime)

    def query_loadtest_time_one_ex(
        self,
        request: demo_models.QueryLoadtestTimeOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeOneResponse(),
            self.do_request('1.0', 'demo.loadtest.time.one.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadtest_time_one_ex_async(
        self,
        request: demo_models.QueryLoadtestTimeOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeOneResponse:
        """
        Description: 压测接口1
        Summary: 压测接口1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeOneResponse(),
            await self.do_request_async('1.0', 'demo.loadtest.time.one.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadtest_time_two(
        self,
        request: demo_models.QueryLoadtestTimeTwoRequest,
    ) -> demo_models.QueryLoadtestTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadtest_time_two_ex(request, headers, runtime)

    async def query_loadtest_time_two_async(
        self,
        request: demo_models.QueryLoadtestTimeTwoRequest,
    ) -> demo_models.QueryLoadtestTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadtest_time_two_ex_async(request, headers, runtime)

    def query_loadtest_time_two_ex(
        self,
        request: demo_models.QueryLoadtestTimeTwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeTwoResponse(),
            self.do_request('1.0', 'demo.loadtest.time.two.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadtest_time_two_ex_async(
        self,
        request: demo_models.QueryLoadtestTimeTwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeTwoResponse:
        """
        Description: 压测接口2
        Summary: 压测接口2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeTwoResponse(),
            await self.do_request_async('1.0', 'demo.loadtest.time.two.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadtest_time_four(
        self,
        request: demo_models.QueryLoadtestTimeFourRequest,
    ) -> demo_models.QueryLoadtestTimeFourResponse:
        """
        Description: 压测接口4，用于压测
        Summary: 压测接口4
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadtest_time_four_ex(request, headers, runtime)

    async def query_loadtest_time_four_async(
        self,
        request: demo_models.QueryLoadtestTimeFourRequest,
    ) -> demo_models.QueryLoadtestTimeFourResponse:
        """
        Description: 压测接口4，用于压测
        Summary: 压测接口4
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadtest_time_four_ex_async(request, headers, runtime)

    def query_loadtest_time_four_ex(
        self,
        request: demo_models.QueryLoadtestTimeFourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeFourResponse:
        """
        Description: 压测接口4，用于压测
        Summary: 压测接口4
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeFourResponse(),
            self.do_request('1.0', 'demo.loadtest.time.four.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadtest_time_four_ex_async(
        self,
        request: demo_models.QueryLoadtestTimeFourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeFourResponse:
        """
        Description: 压测接口4，用于压测
        Summary: 压测接口4
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeFourResponse(),
            await self.do_request_async('1.0', 'demo.loadtest.time.four.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadtest_time_five(
        self,
        request: demo_models.QueryLoadtestTimeFiveRequest,
    ) -> demo_models.QueryLoadtestTimeFiveResponse:
        """
        Description: 压测接口5，用于压测
        Summary: 压测接口5
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadtest_time_five_ex(request, headers, runtime)

    async def query_loadtest_time_five_async(
        self,
        request: demo_models.QueryLoadtestTimeFiveRequest,
    ) -> demo_models.QueryLoadtestTimeFiveResponse:
        """
        Description: 压测接口5，用于压测
        Summary: 压测接口5
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadtest_time_five_ex_async(request, headers, runtime)

    def query_loadtest_time_five_ex(
        self,
        request: demo_models.QueryLoadtestTimeFiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeFiveResponse:
        """
        Description: 压测接口5，用于压测
        Summary: 压测接口5
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeFiveResponse(),
            self.do_request('1.0', 'demo.loadtest.time.five.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadtest_time_five_ex_async(
        self,
        request: demo_models.QueryLoadtestTimeFiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryLoadtestTimeFiveResponse:
        """
        Description: 压测接口5，用于压测
        Summary: 压测接口5
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryLoadtestTimeFiveResponse(),
            await self.do_request_async('1.0', 'demo.loadtest.time.five.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_aicoguardcore_aicoguardrails_question(
        self,
        request: demo_models.CheckAicoguardcoreAicoguardrailsQuestionRequest,
    ) -> demo_models.CheckAicoguardcoreAicoguardrailsQuestionResponse:
        """
        Description: 大模型护栏多轮对话提问检测 测试
        Summary: 大模型护栏多轮对话提问检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_aicoguardcore_aicoguardrails_question_ex(request, headers, runtime)

    async def check_aicoguardcore_aicoguardrails_question_async(
        self,
        request: demo_models.CheckAicoguardcoreAicoguardrailsQuestionRequest,
    ) -> demo_models.CheckAicoguardcoreAicoguardrailsQuestionResponse:
        """
        Description: 大模型护栏多轮对话提问检测 测试
        Summary: 大模型护栏多轮对话提问检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_aicoguardcore_aicoguardrails_question_ex_async(request, headers, runtime)

    def check_aicoguardcore_aicoguardrails_question_ex(
        self,
        request: demo_models.CheckAicoguardcoreAicoguardrailsQuestionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CheckAicoguardcoreAicoguardrailsQuestionResponse:
        """
        Description: 大模型护栏多轮对话提问检测 测试
        Summary: 大模型护栏多轮对话提问检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CheckAicoguardcoreAicoguardrailsQuestionResponse(),
            self.do_request('1.0', 'demo.aicoguardcore.aicoguardrails.question.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_aicoguardcore_aicoguardrails_question_ex_async(
        self,
        request: demo_models.CheckAicoguardcoreAicoguardrailsQuestionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CheckAicoguardcoreAicoguardrailsQuestionResponse:
        """
        Description: 大模型护栏多轮对话提问检测 测试
        Summary: 大模型护栏多轮对话提问检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CheckAicoguardcoreAicoguardrailsQuestionResponse(),
            await self.do_request_async('1.0', 'demo.aicoguardcore.aicoguardrails.question.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_time_menhu(
        self,
        request: demo_models.QueryTestTimeMenhuRequest,
    ) -> demo_models.QueryTestTimeMenhuResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_time_menhu_ex(request, headers, runtime)

    async def query_test_time_menhu_async(
        self,
        request: demo_models.QueryTestTimeMenhuRequest,
    ) -> demo_models.QueryTestTimeMenhuResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_time_menhu_ex_async(request, headers, runtime)

    def query_test_time_menhu_ex(
        self,
        request: demo_models.QueryTestTimeMenhuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTimeMenhuResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTimeMenhuResponse(),
            self.do_request('1.0', 'demo.test.time.menhu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_time_menhu_ex_async(
        self,
        request: demo_models.QueryTestTimeMenhuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTimeMenhuResponse:
        """
        Description: 个人工作台二期测试
        Summary: 个人工作台二期测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTimeMenhuResponse(),
            await self.do_request_async('1.0', 'demo.test.time.menhu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_aaa_bbb_ccc(
        self,
        request: demo_models.BindAaaBbbCccRequest,
    ) -> demo_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_aaa_bbb_ccc_ex(request, headers, runtime)

    async def bind_aaa_bbb_ccc_async(
        self,
        request: demo_models.BindAaaBbbCccRequest,
    ) -> demo_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
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
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
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
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aaa_bbb_ccc(
        self,
        request: demo_models.QueryAaaBbbCccRequest,
    ) -> demo_models.QueryAaaBbbCccResponse:
        """
        Description: 自动化测试创建111
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
        Description: 自动化测试创建111
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
        Description: 自动化测试创建111
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
        Description: 自动化测试创建111
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

    def bind_aaa_bbb_ccd(
        self,
        request: demo_models.BindAaaBbbCcdRequest,
    ) -> demo_models.BindAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_aaa_bbb_ccd_ex(request, headers, runtime)

    async def bind_aaa_bbb_ccd_async(
        self,
        request: demo_models.BindAaaBbbCcdRequest,
    ) -> demo_models.BindAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_aaa_bbb_ccd_ex_async(request, headers, runtime)

    def bind_aaa_bbb_ccd_ex(
        self,
        request: demo_models.BindAaaBbbCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAaaBbbCcdResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_aaa_bbb_ccd_ex_async(
        self,
        request: demo_models.BindAaaBbbCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.BindAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.BindAaaBbbCcdResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
