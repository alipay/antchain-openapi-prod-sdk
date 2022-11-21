# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_ff19a88a999c4b3587aa011598273c77 import models as ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models
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
        config: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.Config,
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
            # Demo类1
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
                    'sdk_version': '1.0.1',
                    '_prod_code': 'ak_ff19a88a999c4b3587aa011598273c77',
                    '_prod_channel': 'saas'
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
            # Demo类1
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
                    'sdk_version': '1.0.1',
                    '_prod_code': 'ak_ff19a88a999c4b3587aa011598273c77',
                    '_prod_channel': 'saas'
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

    def status_demo_gateway_check(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_demo_gateway_check_ex(request, headers, runtime)

    async def status_demo_gateway_check_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_demo_gateway_check_ex_async(request, headers, runtime)

    def status_demo_gateway_check_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_demo_gateway_check_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当前服务器当前状态1
        Summary: 检查服务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.StatusDemoGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def echo_demo_gateway_check(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.echo_demo_gateway_check_ex(request, headers, runtime)

    async def echo_demo_gateway_check_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.echo_demo_gateway_check_ex_async(request, headers, runtime)

    def echo_demo_gateway_check_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.gateway.check.echo',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                echo_demo_gateway_check_response = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return echo_demo_gateway_check_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def echo_demo_gateway_check_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.gateway.check.echo',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                echo_demo_gateway_check_response = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return echo_demo_gateway_check_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.EchoDemoGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_gateway_check(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_gateway_check_ex(request, headers, runtime)

    async def query_demo_gateway_check_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_gateway_check_ex_async(request, headers, runtime)

    def query_demo_gateway_check_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_gateway_check_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckResponse:
        """
        Description: ceshi
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_demo_check_eee(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_demo_check_eee_ex(request, headers, runtime)

    async def bind_demo_demo_check_eee_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_demo_check_eee_ex_async(request, headers, runtime)

    def bind_demo_demo_check_eee_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeResponse(),
            self.do_request('1.0', 'demo.demo.check.eee.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_demo_check_eee_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeResponse:
        """
        Description: s
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoDemoCheckEeeResponse(),
            await self.do_request_async('1.0', 'demo.demo.check.eee.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_gateway_abc_test(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_gateway_abc_test_ex(request, headers, runtime)

    async def bind_demo_gateway_abc_test_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_gateway_abc_test_ex_async(request, headers, runtime)

    def bind_demo_gateway_abc_test_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestResponse(),
            self.do_request('1.0', 'demo.gateway.abc.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_gateway_abc_test_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BindDemoGatewayAbcTestResponse(),
            await self.do_request_async('1.0', 'demo.gateway.abc.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_gateway_check_echotimeout(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_gateway_check_echotimeout_ex(request, headers, runtime)

    async def query_demo_gateway_check_echotimeout_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_gateway_check_echotimeout_ex_async(request, headers, runtime)

    def query_demo_gateway_check_echotimeout_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutResponse(),
            self.do_request('1.0', 'demo.gateway.check.echotimeout.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_gateway_check_echotimeout_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutResponse:
        """
        Description: 超时测试
        Summary: 超时
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotimeoutResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echotimeout.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_gateway_check_echoten(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_gateway_check_echoten_ex(request, headers, runtime)

    async def query_demo_gateway_check_echoten_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_gateway_check_echoten_ex_async(request, headers, runtime)

    def query_demo_gateway_check_echoten_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenResponse(),
            self.do_request('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_gateway_check_echoten_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoGatewayCheckEchotenResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_demo_bbp_insurance_user(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_demo_bbp_insurance_user_ex(request, headers, runtime)

    async def init_demo_bbp_insurance_user_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_demo_bbp_insurance_user_ex_async(request, headers, runtime)

    def init_demo_bbp_insurance_user_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserResponse(),
            self.do_request('1.0', 'demo.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_demo_bbp_insurance_user_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserResponse:
        """
        Description: 保司用户埋点信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoBbpInsuranceUserResponse(),
            await self.do_request_async('1.0', 'demo.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_demo_cjtest_cj(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_demo_cjtest_cj_ex(request, headers, runtime)

    async def update_demo_cjtest_cj_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_demo_cjtest_cj_ex_async(request, headers, runtime)

    def update_demo_cjtest_cj_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjResponse(),
            self.do_request('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_demo_cjtest_cj_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UpdateDemoCjtestCjResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_demo_com_cn_cc(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_demo_com_cn_cc_ex(request, headers, runtime)

    async def reset_demo_com_cn_cc_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_demo_com_cn_cc_ex_async(request, headers, runtime)

    def reset_demo_com_cn_cc_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcResponse(),
            self.do_request('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_demo_com_cn_cc_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoComCnCcResponse(),
            await self.do_request_async('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_demo_cjtest_source_file(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_demo_cjtest_source_file_ex(request, headers, runtime)

    async def upload_demo_cjtest_source_file_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_demo_cjtest_source_file_ex_async(request, headers, runtime)

    def upload_demo_cjtest_source_file_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.cjtest.source.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_demo_cjtest_source_file_response = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_demo_cjtest_source_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse(),
            self.do_request('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_demo_cjtest_source_file_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.cjtest.source.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_demo_cjtest_source_file_response = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_demo_cjtest_source_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.UploadDemoCjtestSourceFileResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_cjtest_cj_res(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_cjtest_cj_res_ex(request, headers, runtime)

    async def query_demo_cjtest_cj_res_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_cjtest_cj_res_ex_async(request, headers, runtime)

    def query_demo_cjtest_cj_res_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResResponse(),
            self.do_request('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_cjtest_cj_res_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResResponse:
        """
        Description: 测试返回值限制
        Summary: dev测试返回值限制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.QueryDemoCjtestCjResResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_demo_cjtest_api_authorize(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_demo_cjtest_api_authorize_ex(request, headers, runtime)

    async def reset_demo_cjtest_api_authorize_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_demo_cjtest_api_authorize_ex_async(request, headers, runtime)

    def reset_demo_cjtest_api_authorize_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeResponse(),
            self.do_request('1.0', 'demo.cjtest.api.authorize.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_demo_cjtest_api_authorize_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoCjtestApiAuthorizeResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.api.authorize.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_demo_gateway_road(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_demo_gateway_road_ex(request, headers, runtime)

    async def init_demo_gateway_road_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_demo_gateway_road_ex_async(request, headers, runtime)

    def init_demo_gateway_road_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadResponse(),
            self.do_request('1.0', 'demo.gateway.road.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_demo_gateway_road_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadResponse:
        """
        Description: 根据入参组合返回结果，Fr 自动化连通性测试。
        Summary: road.init（Fr AutoT）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.InitDemoGatewayRoadResponse(),
            await self.do_request_async('1.0', 'demo.gateway.road.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_demo_com_cn_test(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_demo_com_cn_test_ex(request, headers, runtime)

    async def import_demo_com_cn_test_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_demo_com_cn_test_ex_async(request, headers, runtime)

    def import_demo_com_cn_test_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.com.cn.test.import',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_demo_com_cn_test_response = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_demo_com_cn_test_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse(),
            self.do_request('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_demo_com_cn_test_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse:
        """
        Description: 1
        Summary: api简介
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.com.cn.test.import',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_demo_com_cn_test_response = ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_demo_com_cn_test_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ImportDemoComCnTestResponse(),
            await self.do_request_async('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_demo_saas_test_testc(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_demo_saas_test_testc_ex(request, headers, runtime)

    async def publish_demo_saas_test_testc_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_demo_saas_test_testc_ex_async(request, headers, runtime)

    def publish_demo_saas_test_testc_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcResponse(),
            self.do_request('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_demo_saas_test_testc_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.PublishDemoSaasTestTestcResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_demo_saas_test_testd(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_demo_saas_test_testd_ex(request, headers, runtime)

    async def reset_demo_saas_test_testd_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_demo_saas_test_testd_ex_async(request, headers, runtime)

    def reset_demo_saas_test_testd_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdResponse(),
            self.do_request('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_demo_saas_test_testd_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.ResetDemoSaasTestTestdResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_demo_saas_test_teste(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_demo_saas_test_teste_ex(request, headers, runtime)

    async def operate_demo_saas_test_teste_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_demo_saas_test_teste_ex_async(request, headers, runtime)

    def operate_demo_saas_test_teste_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteResponse(),
            self.do_request('1.0', 'demo.saas.test.teste.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_demo_saas_test_teste_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.OperateDemoSaasTestTesteResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.teste.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_demo_saas_test_testf(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_demo_saas_test_testf_ex(request, headers, runtime)

    async def batchcreate_demo_saas_test_testf_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_demo_saas_test_testf_ex_async(request, headers, runtime)

    def batchcreate_demo_saas_test_testf_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfResponse(),
            self.do_request('1.0', 'demo.saas.test.testf.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_demo_saas_test_testf_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.BatchcreateDemoSaasTestTestfResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testf.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_saas_test_testh(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_saas_test_testh_ex(request, headers, runtime)

    async def create_demo_saas_test_testh_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_saas_test_testh_ex_async(request, headers, runtime)

    def create_demo_saas_test_testh_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthResponse(),
            self.do_request('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_saas_test_testh_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTesthResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_saas_test_testi(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_saas_test_testi_ex(request, headers, runtime)

    async def create_demo_saas_test_testi_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_saas_test_testi_ex_async(request, headers, runtime)

    def create_demo_saas_test_testi_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiResponse(),
            self.do_request('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_saas_test_testi_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateDemoSaasTestTestiResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ff_19a_88a_999c_4b_3587aa_011598273c_77_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
