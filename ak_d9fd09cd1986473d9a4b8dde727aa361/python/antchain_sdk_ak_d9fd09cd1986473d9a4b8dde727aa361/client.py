# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_d9fd09cd1986473d9a4b8dde727aa361 import models as ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models
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
        config: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.Config,
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
                    'sdk_version': '1.0.4',
                    '_prod_code': 'ak_d9fd09cd1986473d9a4b8dde727aa361',
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
                    'sdk_version': '1.0.4',
                    '_prod_code': 'ak_d9fd09cd1986473d9a4b8dde727aa361',
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

    def echo_demo_gateway_check(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.echo_demo_gateway_check_ex(request, headers, runtime)

    async def echo_demo_gateway_check_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.echo_demo_gateway_check_ex_async(request, headers, runtime)

    def echo_demo_gateway_check_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.gateway.check.echo',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                echo_demo_gateway_check_response = ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse(
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
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse(),
            self.do_request('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def echo_demo_gateway_check_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse:
        """
        Description: Demo接口，返回当输入的值
        Summary: 返回输入值
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.gateway.check.echo',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                echo_demo_gateway_check_response = ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse(
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
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.EchoDemoGatewayCheckResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_center_ability(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityResponse:
        """
        Description: 测试能力中心九期API打标&能力绑定API使用
        Summary: 能力中心九期测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_center_ability_ex(request, headers, runtime)

    async def bind_demo_center_ability_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityResponse:
        """
        Description: 测试能力中心九期API打标&能力绑定API使用
        Summary: 能力中心九期测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_center_ability_ex_async(request, headers, runtime)

    def bind_demo_center_ability_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityResponse:
        """
        Description: 测试能力中心九期API打标&能力绑定API使用
        Summary: 能力中心九期测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityResponse(),
            self.do_request('1.0', 'demo.center.ability.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_center_ability_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityResponse:
        """
        Description: 测试能力中心九期API打标&能力绑定API使用
        Summary: 能力中心九期测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoCenterAbilityResponse(),
            await self.do_request_async('1.0', 'demo.center.ability.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_more_ability_testabc(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcResponse:
        """
        Description: 测试API绑定多个标签时的情况
        Summary: API绑定多个标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_more_ability_testabc_ex(request, headers, runtime)

    async def bind_demo_more_ability_testabc_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcResponse:
        """
        Description: 测试API绑定多个标签时的情况
        Summary: API绑定多个标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_more_ability_testabc_ex_async(request, headers, runtime)

    def bind_demo_more_ability_testabc_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcResponse:
        """
        Description: 测试API绑定多个标签时的情况
        Summary: API绑定多个标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcResponse(),
            self.do_request('1.0', 'demo.more.ability.testabc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_more_ability_testabc_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcResponse:
        """
        Description: 测试API绑定多个标签时的情况
        Summary: API绑定多个标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.BindDemoMoreAbilityTestabcResponse(),
            await self.do_request_async('1.0', 'demo.more.ability.testabc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_international_demo_zoloz_facecompare(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareResponse:
        """
        Description: test zoloz 方法 update again
        Summary: test zoloz 方法
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_international_demo_zoloz_facecompare_ex(request, headers, runtime)

    async def match_international_demo_zoloz_facecompare_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareResponse:
        """
        Description: test zoloz 方法 update again
        Summary: test zoloz 方法
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_international_demo_zoloz_facecompare_ex_async(request, headers, runtime)

    def match_international_demo_zoloz_facecompare_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareResponse:
        """
        Description: test zoloz 方法 update again
        Summary: test zoloz 方法
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareResponse(),
            self.do_request('1.0', 'international.demo.zoloz.facecompare.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_international_demo_zoloz_facecompare_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareResponse:
        """
        Description: test zoloz 方法 update again
        Summary: test zoloz 方法
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.MatchInternationalDemoZolozFacecompareResponse(),
            await self.do_request_async('1.0', 'international.demo.zoloz.facecompare.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_international_demo_aaa_bbb(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbResponse:
        """
        Description: cj test 111
        Summary: cj test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_international_demo_aaa_bbb_ex(request, headers, runtime)

    async def query_international_demo_aaa_bbb_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbResponse:
        """
        Description: cj test 111
        Summary: cj test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_international_demo_aaa_bbb_ex_async(request, headers, runtime)

    def query_international_demo_aaa_bbb_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbResponse:
        """
        Description: cj test 111
        Summary: cj test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbResponse(),
            self.do_request('1.0', 'international.demo.aaa.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_international_demo_aaa_bbb_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbResponse:
        """
        Description: cj test 111
        Summary: cj test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.QueryInternationalDemoAaaBbbResponse(),
            await self.do_request_async('1.0', 'international.demo.aaa.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_international_demo_zoloz_health(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_international_demo_zoloz_health_ex(request, headers, runtime)

    async def check_international_demo_zoloz_health_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_international_demo_zoloz_health_ex_async(request, headers, runtime)

    def check_international_demo_zoloz_health_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthResponse(),
            self.do_request('1.0', 'international.demo.zoloz.health.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_international_demo_zoloz_health_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthResponse:
        """
        Description: 测试大安全接口
        Summary: 测试大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CheckInternationalDemoZolozHealthResponse(),
            await self.do_request_async('1.0', 'international.demo.zoloz.health.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_international_demo_aaa_bbb(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbResponse:
        """
        Description: demo get fr inter desc
        Summary: demo get fr inter
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_international_demo_aaa_bbb_ex(request, headers, runtime)

    async def get_international_demo_aaa_bbb_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbResponse:
        """
        Description: demo get fr inter desc
        Summary: demo get fr inter
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_international_demo_aaa_bbb_ex_async(request, headers, runtime)

    def get_international_demo_aaa_bbb_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbResponse:
        """
        Description: demo get fr inter desc
        Summary: demo get fr inter
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbResponse(),
            self.do_request('1.0', 'international.demo.aaa.bbb.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_international_demo_aaa_bbb_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbResponse:
        """
        Description: demo get fr inter desc
        Summary: demo get fr inter
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.GetInternationalDemoAaaBbbResponse(),
            await self.do_request_async('1.0', 'international.demo.aaa.bbb.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_9fd_09cd_1986473d_9a_4b_8dde_727aa_361_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
