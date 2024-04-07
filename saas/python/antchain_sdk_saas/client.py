# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_saas import models as saas_models
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
        config: saas_models.Config,
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
            # api信息结构体
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
                    'sdk_version': '1.1.30',
                    '_prod_code': 'SAAS',
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
            # api信息结构体
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
                    'sdk_version': '1.1.30',
                    '_prod_code': 'SAAS',
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

    def run_market_service(
        self,
        request: saas_models.RunMarketServiceRequest,
    ) -> saas_models.RunMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_market_service_ex(request, headers, runtime)

    async def run_market_service_async(
        self,
        request: saas_models.RunMarketServiceRequest,
    ) -> saas_models.RunMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_market_service_ex_async(request, headers, runtime)

    def run_market_service_ex(
        self,
        request: saas_models.RunMarketServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.RunMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.RunMarketServiceResponse(),
            self.do_request('1.0', 'antchain.saas.market.service.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_market_service_ex_async(
        self,
        request: saas_models.RunMarketServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.RunMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.RunMarketServiceResponse(),
            await self.do_request_async('1.0', 'antchain.saas.market.service.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_market_solution(
        self,
        request: saas_models.QueryMarketSolutionRequest,
    ) -> saas_models.QueryMarketSolutionResponse:
        """
        Description: 查询解决方案，包括能力列表
        Summary: 查询解决方案，包括能力列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_market_solution_ex(request, headers, runtime)

    async def query_market_solution_async(
        self,
        request: saas_models.QueryMarketSolutionRequest,
    ) -> saas_models.QueryMarketSolutionResponse:
        """
        Description: 查询解决方案，包括能力列表
        Summary: 查询解决方案，包括能力列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_market_solution_ex_async(request, headers, runtime)

    def query_market_solution_ex(
        self,
        request: saas_models.QueryMarketSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryMarketSolutionResponse:
        """
        Description: 查询解决方案，包括能力列表
        Summary: 查询解决方案，包括能力列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryMarketSolutionResponse(),
            self.do_request('1.0', 'antchain.saas.market.solution.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_market_solution_ex_async(
        self,
        request: saas_models.QueryMarketSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryMarketSolutionResponse:
        """
        Description: 查询解决方案，包括能力列表
        Summary: 查询解决方案，包括能力列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryMarketSolutionResponse(),
            await self.do_request_async('1.0', 'antchain.saas.market.solution.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ability_withproduct(
        self,
        request: saas_models.QueryAbilityWithproductRequest,
    ) -> saas_models.QueryAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ability_withproduct_ex(request, headers, runtime)

    async def query_ability_withproduct_async(
        self,
        request: saas_models.QueryAbilityWithproductRequest,
    ) -> saas_models.QueryAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ability_withproduct_ex_async(request, headers, runtime)

    def query_ability_withproduct_ex(
        self,
        request: saas_models.QueryAbilityWithproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityWithproductResponse(),
            self.do_request('1.0', 'antchain.saas.ability.withproduct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ability_withproduct_ex_async(
        self,
        request: saas_models.QueryAbilityWithproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityWithproductResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.withproduct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ability(
        self,
        request: saas_models.PagequeryAbilityRequest,
    ) -> saas_models.PagequeryAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ability_ex(request, headers, runtime)

    async def pagequery_ability_async(
        self,
        request: saas_models.PagequeryAbilityRequest,
    ) -> saas_models.PagequeryAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ability_ex_async(request, headers, runtime)

    def pagequery_ability_ex(
        self,
        request: saas_models.PagequeryAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.PagequeryAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.PagequeryAbilityResponse(),
            self.do_request('1.0', 'antchain.saas.ability.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ability_ex_async(
        self,
        request: saas_models.PagequeryAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.PagequeryAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.PagequeryAbilityResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_ability(
        self,
        request: saas_models.BindAbilityRequest,
    ) -> saas_models.BindAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_ability_ex(request, headers, runtime)

    async def bind_ability_async(
        self,
        request: saas_models.BindAbilityRequest,
    ) -> saas_models.BindAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_ability_ex_async(request, headers, runtime)

    def bind_ability_ex(
        self,
        request: saas_models.BindAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.BindAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.BindAbilityResponse(),
            self.do_request('1.0', 'antchain.saas.ability.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_ability_ex_async(
        self,
        request: saas_models.BindAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.BindAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.BindAbilityResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ability_withapiname(
        self,
        request: saas_models.QueryAbilityWithapinameRequest,
    ) -> saas_models.QueryAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ability_withapiname_ex(request, headers, runtime)

    async def query_ability_withapiname_async(
        self,
        request: saas_models.QueryAbilityWithapinameRequest,
    ) -> saas_models.QueryAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ability_withapiname_ex_async(request, headers, runtime)

    def query_ability_withapiname_ex(
        self,
        request: saas_models.QueryAbilityWithapinameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityWithapinameResponse(),
            self.do_request('1.0', 'antchain.saas.ability.withapiname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ability_withapiname_ex_async(
        self,
        request: saas_models.QueryAbilityWithapinameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityWithapinameResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.withapiname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_ability(
        self,
        request: saas_models.CallbackAbilityRequest,
    ) -> saas_models.CallbackAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_ability_ex(request, headers, runtime)

    async def callback_ability_async(
        self,
        request: saas_models.CallbackAbilityRequest,
    ) -> saas_models.CallbackAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_ability_ex_async(request, headers, runtime)

    def callback_ability_ex(
        self,
        request: saas_models.CallbackAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.CallbackAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.CallbackAbilityResponse(),
            self.do_request('1.0', 'antchain.saas.ability.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_ability_ex_async(
        self,
        request: saas_models.CallbackAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.CallbackAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.CallbackAbilityResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_foundation_protobuf(
        self,
        request: saas_models.QueryFoundationProtobufRequest,
    ) -> saas_models.QueryFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_foundation_protobuf_ex(request, headers, runtime)

    async def query_foundation_protobuf_async(
        self,
        request: saas_models.QueryFoundationProtobufRequest,
    ) -> saas_models.QueryFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_foundation_protobuf_ex_async(request, headers, runtime)

    def query_foundation_protobuf_ex(
        self,
        request: saas_models.QueryFoundationProtobufRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryFoundationProtobufResponse(),
            self.do_request('1.0', 'antchain.saas.foundation.protobuf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_foundation_protobuf_ex_async(
        self,
        request: saas_models.QueryFoundationProtobufRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryFoundationProtobufResponse(),
            await self.do_request_async('1.0', 'antchain.saas.foundation.protobuf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ability_resultcode(
        self,
        request: saas_models.QueryAbilityResultcodeRequest,
    ) -> saas_models.QueryAbilityResultcodeResponse:
        """
        Description: 测试网关结果码和计量接口
        Summary: 网关结果码测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ability_resultcode_ex(request, headers, runtime)

    async def query_ability_resultcode_async(
        self,
        request: saas_models.QueryAbilityResultcodeRequest,
    ) -> saas_models.QueryAbilityResultcodeResponse:
        """
        Description: 测试网关结果码和计量接口
        Summary: 网关结果码测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ability_resultcode_ex_async(request, headers, runtime)

    def query_ability_resultcode_ex(
        self,
        request: saas_models.QueryAbilityResultcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityResultcodeResponse:
        """
        Description: 测试网关结果码和计量接口
        Summary: 网关结果码测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityResultcodeResponse(),
            self.do_request('1.0', 'antchain.saas.ability.resultcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ability_resultcode_ex_async(
        self,
        request: saas_models.QueryAbilityResultcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityResultcodeResponse:
        """
        Description: 测试网关结果码和计量接口
        Summary: 网关结果码测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityResultcodeResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.resultcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_ability_api(
        self,
        request: saas_models.BindAbilityApiRequest,
    ) -> saas_models.BindAbilityApiResponse:
        """
        Description: 绑定能力的api信息
        Summary: 绑定能力的api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_ability_api_ex(request, headers, runtime)

    async def bind_ability_api_async(
        self,
        request: saas_models.BindAbilityApiRequest,
    ) -> saas_models.BindAbilityApiResponse:
        """
        Description: 绑定能力的api信息
        Summary: 绑定能力的api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_ability_api_ex_async(request, headers, runtime)

    def bind_ability_api_ex(
        self,
        request: saas_models.BindAbilityApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.BindAbilityApiResponse:
        """
        Description: 绑定能力的api信息
        Summary: 绑定能力的api信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.BindAbilityApiResponse(),
            self.do_request('1.0', 'antchain.saas.ability.api.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_ability_api_ex_async(
        self,
        request: saas_models.BindAbilityApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.BindAbilityApiResponse:
        """
        Description: 绑定能力的api信息
        Summary: 绑定能力的api信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.BindAbilityApiResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.api.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ability_businesscode(
        self,
        request: saas_models.QueryAbilityBusinesscodeRequest,
    ) -> saas_models.QueryAbilityBusinesscodeResponse:
        """
        Description: 根据能力id查询能力信息
        Summary: 根据能力id查询能力信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ability_businesscode_ex(request, headers, runtime)

    async def query_ability_businesscode_async(
        self,
        request: saas_models.QueryAbilityBusinesscodeRequest,
    ) -> saas_models.QueryAbilityBusinesscodeResponse:
        """
        Description: 根据能力id查询能力信息
        Summary: 根据能力id查询能力信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ability_businesscode_ex_async(request, headers, runtime)

    def query_ability_businesscode_ex(
        self,
        request: saas_models.QueryAbilityBusinesscodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityBusinesscodeResponse:
        """
        Description: 根据能力id查询能力信息
        Summary: 根据能力id查询能力信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityBusinesscodeResponse(),
            self.do_request('1.0', 'antchain.saas.ability.businesscode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ability_businesscode_ex_async(
        self,
        request: saas_models.QueryAbilityBusinesscodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryAbilityBusinesscodeResponse:
        """
        Description: 根据能力id查询能力信息
        Summary: 根据能力id查询能力信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryAbilityBusinesscodeResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.businesscode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_business_product(
        self,
        request: saas_models.QueryBusinessProductRequest,
    ) -> saas_models.QueryBusinessProductResponse:
        """
        Description: 根据商业编码查询sdk依赖和api信息
        Summary: 根据商业编码查询sdk依赖和api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_business_product_ex(request, headers, runtime)

    async def query_business_product_async(
        self,
        request: saas_models.QueryBusinessProductRequest,
    ) -> saas_models.QueryBusinessProductResponse:
        """
        Description: 根据商业编码查询sdk依赖和api信息
        Summary: 根据商业编码查询sdk依赖和api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_business_product_ex_async(request, headers, runtime)

    def query_business_product_ex(
        self,
        request: saas_models.QueryBusinessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryBusinessProductResponse:
        """
        Description: 根据商业编码查询sdk依赖和api信息
        Summary: 根据商业编码查询sdk依赖和api信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryBusinessProductResponse(),
            self.do_request('1.0', 'antchain.saas.business.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_business_product_ex_async(
        self,
        request: saas_models.QueryBusinessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryBusinessProductResponse:
        """
        Description: 根据商业编码查询sdk依赖和api信息
        Summary: 根据商业编码查询sdk依赖和api信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryBusinessProductResponse(),
            await self.do_request_async('1.0', 'antchain.saas.business.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metering_rule(
        self,
        request: saas_models.QueryMeteringRuleRequest,
    ) -> saas_models.QueryMeteringRuleResponse:
        """
        Description: 查询计量规则信息
        Summary: 查询计量规则信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metering_rule_ex(request, headers, runtime)

    async def query_metering_rule_async(
        self,
        request: saas_models.QueryMeteringRuleRequest,
    ) -> saas_models.QueryMeteringRuleResponse:
        """
        Description: 查询计量规则信息
        Summary: 查询计量规则信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metering_rule_ex_async(request, headers, runtime)

    def query_metering_rule_ex(
        self,
        request: saas_models.QueryMeteringRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryMeteringRuleResponse:
        """
        Description: 查询计量规则信息
        Summary: 查询计量规则信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryMeteringRuleResponse(),
            self.do_request('1.0', 'antchain.saas.metering.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metering_rule_ex_async(
        self,
        request: saas_models.QueryMeteringRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryMeteringRuleResponse:
        """
        Description: 查询计量规则信息
        Summary: 查询计量规则信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryMeteringRuleResponse(),
            await self.do_request_async('1.0', 'antchain.saas.metering.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_metering_rule(
        self,
        request: saas_models.CreateMeteringRuleRequest,
    ) -> saas_models.CreateMeteringRuleResponse:
        """
        Description: 创建计量规则
        Summary: 创建计量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_metering_rule_ex(request, headers, runtime)

    async def create_metering_rule_async(
        self,
        request: saas_models.CreateMeteringRuleRequest,
    ) -> saas_models.CreateMeteringRuleResponse:
        """
        Description: 创建计量规则
        Summary: 创建计量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_metering_rule_ex_async(request, headers, runtime)

    def create_metering_rule_ex(
        self,
        request: saas_models.CreateMeteringRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.CreateMeteringRuleResponse:
        """
        Description: 创建计量规则
        Summary: 创建计量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.CreateMeteringRuleResponse(),
            self.do_request('1.0', 'antchain.saas.metering.rule.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_metering_rule_ex_async(
        self,
        request: saas_models.CreateMeteringRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.CreateMeteringRuleResponse:
        """
        Description: 创建计量规则
        Summary: 创建计量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.CreateMeteringRuleResponse(),
            await self.do_request_async('1.0', 'antchain.saas.metering.rule.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_metering_rule(
        self,
        request: saas_models.UpdateMeteringRuleRequest,
    ) -> saas_models.UpdateMeteringRuleResponse:
        """
        Description: 更新计量规则信息
        Summary: 更新计量规则信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_metering_rule_ex(request, headers, runtime)

    async def update_metering_rule_async(
        self,
        request: saas_models.UpdateMeteringRuleRequest,
    ) -> saas_models.UpdateMeteringRuleResponse:
        """
        Description: 更新计量规则信息
        Summary: 更新计量规则信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_metering_rule_ex_async(request, headers, runtime)

    def update_metering_rule_ex(
        self,
        request: saas_models.UpdateMeteringRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.UpdateMeteringRuleResponse:
        """
        Description: 更新计量规则信息
        Summary: 更新计量规则信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.UpdateMeteringRuleResponse(),
            self.do_request('1.0', 'antchain.saas.metering.rule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_metering_rule_ex_async(
        self,
        request: saas_models.UpdateMeteringRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.UpdateMeteringRuleResponse:
        """
        Description: 更新计量规则信息
        Summary: 更新计量规则信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.UpdateMeteringRuleResponse(),
            await self.do_request_async('1.0', 'antchain.saas.metering.rule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metering_item(
        self,
        request: saas_models.QueryMeteringItemRequest,
    ) -> saas_models.QueryMeteringItemResponse:
        """
        Description: 查询计量项信息
        Summary: 查询计量项信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metering_item_ex(request, headers, runtime)

    async def query_metering_item_async(
        self,
        request: saas_models.QueryMeteringItemRequest,
    ) -> saas_models.QueryMeteringItemResponse:
        """
        Description: 查询计量项信息
        Summary: 查询计量项信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metering_item_ex_async(request, headers, runtime)

    def query_metering_item_ex(
        self,
        request: saas_models.QueryMeteringItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryMeteringItemResponse:
        """
        Description: 查询计量项信息
        Summary: 查询计量项信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryMeteringItemResponse(),
            self.do_request('1.0', 'antchain.saas.metering.item.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metering_item_ex_async(
        self,
        request: saas_models.QueryMeteringItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.QueryMeteringItemResponse:
        """
        Description: 查询计量项信息
        Summary: 查询计量项信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.QueryMeteringItemResponse(),
            await self.do_request_async('1.0', 'antchain.saas.metering.item.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_metering_item(
        self,
        request: saas_models.CreateMeteringItemRequest,
    ) -> saas_models.CreateMeteringItemResponse:
        """
        Description: 新增计量项
        Summary: 新增计量项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_metering_item_ex(request, headers, runtime)

    async def create_metering_item_async(
        self,
        request: saas_models.CreateMeteringItemRequest,
    ) -> saas_models.CreateMeteringItemResponse:
        """
        Description: 新增计量项
        Summary: 新增计量项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_metering_item_ex_async(request, headers, runtime)

    def create_metering_item_ex(
        self,
        request: saas_models.CreateMeteringItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.CreateMeteringItemResponse:
        """
        Description: 新增计量项
        Summary: 新增计量项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.CreateMeteringItemResponse(),
            self.do_request('1.0', 'antchain.saas.metering.item.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_metering_item_ex_async(
        self,
        request: saas_models.CreateMeteringItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.CreateMeteringItemResponse:
        """
        Description: 新增计量项
        Summary: 新增计量项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.CreateMeteringItemResponse(),
            await self.do_request_async('1.0', 'antchain.saas.metering.item.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_metering_item(
        self,
        request: saas_models.UpdateMeteringItemRequest,
    ) -> saas_models.UpdateMeteringItemResponse:
        """
        Description: 更新计量规则
        Summary: 更新计量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_metering_item_ex(request, headers, runtime)

    async def update_metering_item_async(
        self,
        request: saas_models.UpdateMeteringItemRequest,
    ) -> saas_models.UpdateMeteringItemResponse:
        """
        Description: 更新计量规则
        Summary: 更新计量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_metering_item_ex_async(request, headers, runtime)

    def update_metering_item_ex(
        self,
        request: saas_models.UpdateMeteringItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.UpdateMeteringItemResponse:
        """
        Description: 更新计量规则
        Summary: 更新计量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.UpdateMeteringItemResponse(),
            self.do_request('1.0', 'antchain.saas.metering.item.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_metering_item_ex_async(
        self,
        request: saas_models.UpdateMeteringItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> saas_models.UpdateMeteringItemResponse:
        """
        Description: 更新计量规则
        Summary: 更新计量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            saas_models.UpdateMeteringItemResponse(),
            await self.do_request_async('1.0', 'antchain.saas.metering.item.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
