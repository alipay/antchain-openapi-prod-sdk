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
                    'sdk_version': '1.0.309',
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
                    'sdk_version': '1.0.309',
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
        Description: 文件测试1
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
        Description: 文件测试1
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
        Description: 文件测试1
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
        Description: 文件测试1
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

    def init_cjtest_acopm_res(
        self,
        request: demo_models.InitCjtestAcopmResRequest,
    ) -> demo_models.InitCjtestAcopmResResponse:
        """
        Description: cj test
        Summary: cj test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_cjtest_acopm_res_ex(request, headers, runtime)

    async def init_cjtest_acopm_res_async(
        self,
        request: demo_models.InitCjtestAcopmResRequest,
    ) -> demo_models.InitCjtestAcopmResResponse:
        """
        Description: cj test
        Summary: cj test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_cjtest_acopm_res_ex_async(request, headers, runtime)

    def init_cjtest_acopm_res_ex(
        self,
        request: demo_models.InitCjtestAcopmResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.InitCjtestAcopmResResponse:
        """
        Description: cj test
        Summary: cj test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.InitCjtestAcopmResResponse(),
            self.do_request('1.0', 'demo.cjtest.acopm.res.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_cjtest_acopm_res_ex_async(
        self,
        request: demo_models.InitCjtestAcopmResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.InitCjtestAcopmResResponse:
        """
        Description: cj test
        Summary: cj test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.InitCjtestAcopmResResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.acopm.res.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def create_auto_test_code(
        self,
        request: demo_models.CreateAutoTestCodeRequest,
    ) -> demo_models.CreateAutoTestCodeResponse:
        """
        Description: 测试自动生成回归测试代码
        Summary: 测试自动生成回归测试代码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_auto_test_code_ex(request, headers, runtime)

    async def create_auto_test_code_async(
        self,
        request: demo_models.CreateAutoTestCodeRequest,
    ) -> demo_models.CreateAutoTestCodeResponse:
        """
        Description: 测试自动生成回归测试代码
        Summary: 测试自动生成回归测试代码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_auto_test_code_ex_async(request, headers, runtime)

    def create_auto_test_code_ex(
        self,
        request: demo_models.CreateAutoTestCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CreateAutoTestCodeResponse:
        """
        Description: 测试自动生成回归测试代码
        Summary: 测试自动生成回归测试代码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CreateAutoTestCodeResponse(),
            self.do_request('1.0', 'demo.auto.test.code.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_auto_test_code_ex_async(
        self,
        request: demo_models.CreateAutoTestCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CreateAutoTestCodeResponse:
        """
        Description: 测试自动生成回归测试代码
        Summary: 测试自动生成回归测试代码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CreateAutoTestCodeResponse(),
            await self.do_request_async('1.0', 'demo.auto.test.code.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_abc_abc(
        self,
        request: demo_models.QueryDemoAbcAbcRequest,
    ) -> demo_models.QueryDemoAbcAbcResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_abc_abc_ex(request, headers, runtime)

    async def query_demo_abc_abc_async(
        self,
        request: demo_models.QueryDemoAbcAbcRequest,
    ) -> demo_models.QueryDemoAbcAbcResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_abc_abc_ex_async(request, headers, runtime)

    def query_demo_abc_abc_ex(
        self,
        request: demo_models.QueryDemoAbcAbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryDemoAbcAbcResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryDemoAbcAbcResponse(),
            self.do_request('1.0', 'demo.demo.abc.abc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_abc_abc_ex_async(
        self,
        request: demo_models.QueryDemoAbcAbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryDemoAbcAbcResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryDemoAbcAbcResponse(),
            await self.do_request_async('1.0', 'demo.demo.abc.abc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xxxx_testx_aaa(
        self,
        request: demo_models.QueryXxxxTestxAaaRequest,
    ) -> demo_models.QueryXxxxTestxAaaResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xxxx_testx_aaa_ex(request, headers, runtime)

    async def query_xxxx_testx_aaa_async(
        self,
        request: demo_models.QueryXxxxTestxAaaRequest,
    ) -> demo_models.QueryXxxxTestxAaaResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xxxx_testx_aaa_ex_async(request, headers, runtime)

    def query_xxxx_testx_aaa_ex(
        self,
        request: demo_models.QueryXxxxTestxAaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryXxxxTestxAaaResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryXxxxTestxAaaResponse(),
            self.do_request('1.0', 'demo.xxxx.testx.aaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xxxx_testx_aaa_ex_async(
        self,
        request: demo_models.QueryXxxxTestxAaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryXxxxTestxAaaResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryXxxxTestxAaaResponse(),
            await self.do_request_async('1.0', 'demo.xxxx.testx.aaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_testa_testa(
        self,
        request: demo_models.QueryTestTestaTestaRequest,
    ) -> demo_models.QueryTestTestaTestaResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_testa_testa_ex(request, headers, runtime)

    async def query_test_testa_testa_async(
        self,
        request: demo_models.QueryTestTestaTestaRequest,
    ) -> demo_models.QueryTestTestaTestaResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_testa_testa_ex_async(request, headers, runtime)

    def query_test_testa_testa_ex(
        self,
        request: demo_models.QueryTestTestaTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTestaTestaResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTestaTestaResponse(),
            self.do_request('1.0', 'demo.test.testa.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_testa_testa_ex_async(
        self,
        request: demo_models.QueryTestTestaTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestTestaTestaResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestTestaTestaResponse(),
            await self.do_request_async('1.0', 'demo.test.testa.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_instanceid_rule(
        self,
        request: demo_models.QueryInstanceidRuleRequest,
    ) -> demo_models.QueryInstanceidRuleResponse:
        """
        Description: test
        Summary: test
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
        Summary: test
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
        Summary: test
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
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryInstanceidRuleResponse(),
            await self.do_request_async('1.0', 'demo.instanceid.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_business_test(
        self,
        request: demo_models.QueryBusinessTestRequest,
    ) -> demo_models.QueryBusinessTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_business_test_ex(request, headers, runtime)

    async def query_business_test_async(
        self,
        request: demo_models.QueryBusinessTestRequest,
    ) -> demo_models.QueryBusinessTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_business_test_ex_async(request, headers, runtime)

    def query_business_test_ex(
        self,
        request: demo_models.QueryBusinessTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryBusinessTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryBusinessTestResponse(),
            self.do_request('1.0', 'demo.business.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_business_test_ex_async(
        self,
        request: demo_models.QueryBusinessTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryBusinessTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryBusinessTestResponse(),
            await self.do_request_async('1.0', 'demo.business.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_business_code_test(
        self,
        request: demo_models.QueryBusinessCodeTestRequest,
    ) -> demo_models.QueryBusinessCodeTestResponse:
        """
        Description: 测试使用
        Summary: testuse1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_business_code_test_ex(request, headers, runtime)

    async def query_business_code_test_async(
        self,
        request: demo_models.QueryBusinessCodeTestRequest,
    ) -> demo_models.QueryBusinessCodeTestResponse:
        """
        Description: 测试使用
        Summary: testuse1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_business_code_test_ex_async(request, headers, runtime)

    def query_business_code_test_ex(
        self,
        request: demo_models.QueryBusinessCodeTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryBusinessCodeTestResponse:
        """
        Description: 测试使用
        Summary: testuse1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryBusinessCodeTestResponse(),
            self.do_request('1.0', 'demo.business.code.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_business_code_test_ex_async(
        self,
        request: demo_models.QueryBusinessCodeTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryBusinessCodeTestResponse:
        """
        Description: 测试使用
        Summary: testuse1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryBusinessCodeTestResponse(),
            await self.do_request_async('1.0', 'demo.business.code.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_develop_test_use(
        self,
        request: demo_models.QueryDevelopTestUseRequest,
    ) -> demo_models.QueryDevelopTestUseResponse:
        """
        Description: 研发自测使用API
        Summary: 研发自测使用API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_develop_test_use_ex(request, headers, runtime)

    async def query_develop_test_use_async(
        self,
        request: demo_models.QueryDevelopTestUseRequest,
    ) -> demo_models.QueryDevelopTestUseResponse:
        """
        Description: 研发自测使用API
        Summary: 研发自测使用API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_develop_test_use_ex_async(request, headers, runtime)

    def query_develop_test_use_ex(
        self,
        request: demo_models.QueryDevelopTestUseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryDevelopTestUseResponse:
        """
        Description: 研发自测使用API
        Summary: 研发自测使用API
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryDevelopTestUseResponse(),
            self.do_request('1.0', 'demo.develop.test.use.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_develop_test_use_ex_async(
        self,
        request: demo_models.QueryDevelopTestUseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryDevelopTestUseResponse:
        """
        Description: 研发自测使用API
        Summary: 研发自测使用API
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryDevelopTestUseResponse(),
            await self.do_request_async('1.0', 'demo.develop.test.use.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_develop_test_test(
        self,
        request: demo_models.VerifyDevelopTestTestRequest,
    ) -> demo_models.VerifyDevelopTestTestResponse:
        """
        Description: 资损防控研发自测使用API
        Summary: 研发自测使用API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_develop_test_test_ex(request, headers, runtime)

    async def verify_develop_test_test_async(
        self,
        request: demo_models.VerifyDevelopTestTestRequest,
    ) -> demo_models.VerifyDevelopTestTestResponse:
        """
        Description: 资损防控研发自测使用API
        Summary: 研发自测使用API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_develop_test_test_ex_async(request, headers, runtime)

    def verify_develop_test_test_ex(
        self,
        request: demo_models.VerifyDevelopTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.VerifyDevelopTestTestResponse:
        """
        Description: 资损防控研发自测使用API
        Summary: 研发自测使用API
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.VerifyDevelopTestTestResponse(),
            self.do_request('1.0', 'demo.develop.test.test.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_develop_test_test_ex_async(
        self,
        request: demo_models.VerifyDevelopTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.VerifyDevelopTestTestResponse:
        """
        Description: 资损防控研发自测使用API
        Summary: 研发自测使用API
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.VerifyDevelopTestTestResponse(),
            await self.do_request_async('1.0', 'demo.develop.test.test.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_pre_ob_write(
        self,
        request: demo_models.ImportPreObWriteRequest,
    ) -> demo_models.ImportPreObWriteResponse:
        """
        Description: 用于测试预发环境RDS切OB之后的同步功能
        Summary: 预发RDS切OB测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_pre_ob_write_ex(request, headers, runtime)

    async def import_pre_ob_write_async(
        self,
        request: demo_models.ImportPreObWriteRequest,
    ) -> demo_models.ImportPreObWriteResponse:
        """
        Description: 用于测试预发环境RDS切OB之后的同步功能
        Summary: 预发RDS切OB测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_pre_ob_write_ex_async(request, headers, runtime)

    def import_pre_ob_write_ex(
        self,
        request: demo_models.ImportPreObWriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ImportPreObWriteResponse:
        """
        Description: 用于测试预发环境RDS切OB之后的同步功能
        Summary: 预发RDS切OB测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ImportPreObWriteResponse(),
            self.do_request('1.0', 'demo.pre.ob.write.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_pre_ob_write_ex_async(
        self,
        request: demo_models.ImportPreObWriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.ImportPreObWriteResponse:
        """
        Description: 用于测试预发环境RDS切OB之后的同步功能
        Summary: 预发RDS切OB测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.ImportPreObWriteResponse(),
            await self.do_request_async('1.0', 'demo.pre.ob.write.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def operate_shanghai_pre_test(
        self,
        request: demo_models.OperateShanghaiPreTestRequest,
    ) -> demo_models.OperateShanghaiPreTestResponse:
        """
        Description: 用于上海非金生产环境的同步测试
        Summary: 上海非金生产环境测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_shanghai_pre_test_ex(request, headers, runtime)

    async def operate_shanghai_pre_test_async(
        self,
        request: demo_models.OperateShanghaiPreTestRequest,
    ) -> demo_models.OperateShanghaiPreTestResponse:
        """
        Description: 用于上海非金生产环境的同步测试
        Summary: 上海非金生产环境测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_shanghai_pre_test_ex_async(request, headers, runtime)

    def operate_shanghai_pre_test_ex(
        self,
        request: demo_models.OperateShanghaiPreTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.OperateShanghaiPreTestResponse:
        """
        Description: 用于上海非金生产环境的同步测试
        Summary: 上海非金生产环境测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.OperateShanghaiPreTestResponse(),
            self.do_request('1.0', 'demo.shanghai.pre.test.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_shanghai_pre_test_ex_async(
        self,
        request: demo_models.OperateShanghaiPreTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.OperateShanghaiPreTestResponse:
        """
        Description: 用于上海非金生产环境的同步测试
        Summary: 上海非金生产环境测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.OperateShanghaiPreTestResponse(),
            await self.do_request_async('1.0', 'demo.shanghai.pre.test.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cjtest_cj_res(
        self,
        request: demo_models.QueryCjtestCjResRequest,
    ) -> demo_models.QueryCjtestCjResResponse:
        """
        Description: cj test
        Summary: cj test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cjtest_cj_res_ex(request, headers, runtime)

    async def query_cjtest_cj_res_async(
        self,
        request: demo_models.QueryCjtestCjResRequest,
    ) -> demo_models.QueryCjtestCjResResponse:
        """
        Description: cj test
        Summary: cj test1
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
        Description: cj test
        Summary: cj test1
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
        Description: cj test
        Summary: cj test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryCjtestCjResResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_acopm_ato_withhold(
        self,
        request: demo_models.QueryAcopmAtoWithholdRequest,
    ) -> demo_models.QueryAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_acopm_ato_withhold_ex(request, headers, runtime)

    async def query_acopm_ato_withhold_async(
        self,
        request: demo_models.QueryAcopmAtoWithholdRequest,
    ) -> demo_models.QueryAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_acopm_ato_withhold_ex_async(request, headers, runtime)

    def query_acopm_ato_withhold_ex(
        self,
        request: demo_models.QueryAcopmAtoWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAcopmAtoWithholdResponse(),
            self.do_request('1.0', 'demo.acopm.ato.withhold.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_acopm_ato_withhold_ex_async(
        self,
        request: demo_models.QueryAcopmAtoWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryAcopmAtoWithholdResponse(),
            await self.do_request_async('1.0', 'demo.acopm.ato.withhold.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apdevcenter_testobject_testsub(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubRequest,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apdevcenter_testobject_testsub_ex(request, headers, runtime)

    async def query_apdevcenter_testobject_testsub_async(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubRequest,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apdevcenter_testobject_testsub_ex_async(request, headers, runtime)

    def query_apdevcenter_testobject_testsub_ex(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApdevcenterTestobjectTestsubResponse(),
            self.do_request('1.0', 'demo.apdevcenter.testobject.testsub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apdevcenter_testobject_testsub_ex_async(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApdevcenterTestobjectTestsubResponse(),
            await self.do_request_async('1.0', 'demo.apdevcenter.testobject.testsub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apdevcenter_testobject_testsuba(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubaRequest,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apdevcenter_testobject_testsuba_ex(request, headers, runtime)

    async def query_apdevcenter_testobject_testsuba_async(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubaRequest,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apdevcenter_testobject_testsuba_ex_async(request, headers, runtime)

    def query_apdevcenter_testobject_testsuba_ex(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApdevcenterTestobjectTestsubaResponse(),
            self.do_request('1.0', 'demo.apdevcenter.testobject.testsuba.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apdevcenter_testobject_testsuba_ex_async(
        self,
        request: demo_models.QueryApdevcenterTestobjectTestsubaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryApdevcenterTestobjectTestsubaResponse(),
            await self.do_request_async('1.0', 'demo.apdevcenter.testobject.testsuba.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_test_filesystem_fileinfo(
        self,
        request: demo_models.QueryTestFilesystemFileinfoRequest,
    ) -> demo_models.QueryTestFilesystemFileinfoResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_test_filesystem_fileinfo_ex(request, headers, runtime)

    async def query_test_filesystem_fileinfo_async(
        self,
        request: demo_models.QueryTestFilesystemFileinfoRequest,
    ) -> demo_models.QueryTestFilesystemFileinfoResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_test_filesystem_fileinfo_ex_async(request, headers, runtime)

    def query_test_filesystem_fileinfo_ex(
        self,
        request: demo_models.QueryTestFilesystemFileinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestFilesystemFileinfoResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestFilesystemFileinfoResponse(),
            self.do_request('1.0', 'demo.test.filesystem.fileinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_test_filesystem_fileinfo_ex_async(
        self,
        request: demo_models.QueryTestFilesystemFileinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestFilesystemFileinfoResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestFilesystemFileinfoResponse(),
            await self.do_request_async('1.0', 'demo.test.filesystem.fileinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_testproduct_testobject_testsubaaa(
        self,
        request: demo_models.QueryTestproductTestobjectTestsubaaaRequest,
    ) -> demo_models.QueryTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_testproduct_testobject_testsubaaa_ex(request, headers, runtime)

    async def query_testproduct_testobject_testsubaaa_async(
        self,
        request: demo_models.QueryTestproductTestobjectTestsubaaaRequest,
    ) -> demo_models.QueryTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_testproduct_testobject_testsubaaa_ex_async(request, headers, runtime)

    def query_testproduct_testobject_testsubaaa_ex(
        self,
        request: demo_models.QueryTestproductTestobjectTestsubaaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestproductTestobjectTestsubaaaResponse(),
            self.do_request('1.0', 'demo.testproduct.testobject.testsubaaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_testproduct_testobject_testsubaaa_ex_async(
        self,
        request: demo_models.QueryTestproductTestobjectTestsubaaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryTestproductTestobjectTestsubaaaResponse(),
            await self.do_request_async('1.0', 'demo.testproduct.testobject.testsubaaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def create_auto_generate_code(
        self,
        request: demo_models.CreateAutoGenerateCodeRequest,
    ) -> demo_models.CreateAutoGenerateCodeResponse:
        """
        Description: 用于测试自动化脚本自动生成的功能
        Summary: 自动生成自动化脚本测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_auto_generate_code_ex(request, headers, runtime)

    async def create_auto_generate_code_async(
        self,
        request: demo_models.CreateAutoGenerateCodeRequest,
    ) -> demo_models.CreateAutoGenerateCodeResponse:
        """
        Description: 用于测试自动化脚本自动生成的功能
        Summary: 自动生成自动化脚本测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_auto_generate_code_ex_async(request, headers, runtime)

    def create_auto_generate_code_ex(
        self,
        request: demo_models.CreateAutoGenerateCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CreateAutoGenerateCodeResponse:
        """
        Description: 用于测试自动化脚本自动生成的功能
        Summary: 自动生成自动化脚本测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CreateAutoGenerateCodeResponse(),
            self.do_request('1.0', 'demo.auto.generate.code.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_auto_generate_code_ex_async(
        self,
        request: demo_models.CreateAutoGenerateCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.CreateAutoGenerateCodeResponse:
        """
        Description: 用于测试自动化脚本自动生成的功能
        Summary: 自动生成自动化脚本测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.CreateAutoGenerateCodeResponse(),
            await self.do_request_async('1.0', 'demo.auto.generate.code.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pre_test_use(
        self,
        request: demo_models.QueryPreTestUseRequest,
    ) -> demo_models.QueryPreTestUseResponse:
        """
        Description: 用于测试预发环境ob数据同步
        Summary: 用于测试ob数据同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pre_test_use_ex(request, headers, runtime)

    async def query_pre_test_use_async(
        self,
        request: demo_models.QueryPreTestUseRequest,
    ) -> demo_models.QueryPreTestUseResponse:
        """
        Description: 用于测试预发环境ob数据同步
        Summary: 用于测试ob数据同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pre_test_use_ex_async(request, headers, runtime)

    def query_pre_test_use_ex(
        self,
        request: demo_models.QueryPreTestUseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryPreTestUseResponse:
        """
        Description: 用于测试预发环境ob数据同步
        Summary: 用于测试ob数据同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryPreTestUseResponse(),
            self.do_request('1.0', 'demo.pre.test.use.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pre_test_use_ex_async(
        self,
        request: demo_models.QueryPreTestUseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demo_models.QueryPreTestUseResponse:
        """
        Description: 用于测试预发环境ob数据同步
        Summary: 用于测试ob数据同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demo_models.QueryPreTestUseResponse(),
            await self.do_request_async('1.0', 'demo.pre.test.use.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
