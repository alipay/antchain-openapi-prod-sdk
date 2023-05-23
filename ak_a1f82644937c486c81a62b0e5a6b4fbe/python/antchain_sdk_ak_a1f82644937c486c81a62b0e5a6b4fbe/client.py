# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_a1f82644937c486c81a62b0e5a6b4fbe import models as ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models
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
        config: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.Config,
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_a1f82644937c486c81a62b0e5a6b4fbe',
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_a1f82644937c486c81a62b0e5a6b4fbe',
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

    def query_antchain_saas_ability_withproduct(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_saas_ability_withproduct_ex(request, headers, runtime)

    async def query_antchain_saas_ability_withproduct_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_saas_ability_withproduct_ex_async(request, headers, runtime)

    def query_antchain_saas_ability_withproduct_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductResponse(),
            self.do_request('1.0', 'antchain.saas.ability.withproduct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_saas_ability_withproduct_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductResponse:
        """
        Description: 查询本产品下所有的能力标签
        Summary: 查询本产品下所有的能力标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithproductResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.withproduct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_antchain_saas_ability(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_antchain_saas_ability_ex(request, headers, runtime)

    async def pagequery_antchain_saas_ability_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_antchain_saas_ability_ex_async(request, headers, runtime)

    def pagequery_antchain_saas_ability_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityResponse(),
            self.do_request('1.0', 'antchain.saas.ability.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_antchain_saas_ability_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityResponse:
        """
        Description: 分页查询能力数据
        Summary: 分页查询能力数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.PagequeryAntchainSaasAbilityResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_antchain_saas_ability(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_antchain_saas_ability_ex(request, headers, runtime)

    async def bind_antchain_saas_ability_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_antchain_saas_ability_ex_async(request, headers, runtime)

    def bind_antchain_saas_ability_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityResponse(),
            self.do_request('1.0', 'antchain.saas.ability.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_antchain_saas_ability_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityResponse:
        """
        Description: 绑定API
        Summary: 绑定能力与API关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.BindAntchainSaasAbilityResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_saas_ability_withapiname(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_saas_ability_withapiname_ex(request, headers, runtime)

    async def query_antchain_saas_ability_withapiname_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_saas_ability_withapiname_ex_async(request, headers, runtime)

    def query_antchain_saas_ability_withapiname_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameResponse(),
            self.do_request('1.0', 'antchain.saas.ability.withapiname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_saas_ability_withapiname_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameResponse:
        """
        Description: 根据api名称列表查询能力标签列表
        Summary: 根据api名称列表查询能力标签列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasAbilityWithapinameResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.withapiname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antchain_saas_ability(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antchain_saas_ability_ex(request, headers, runtime)

    async def callback_antchain_saas_ability_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antchain_saas_ability_ex_async(request, headers, runtime)

    def callback_antchain_saas_ability_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityResponse(),
            self.do_request('1.0', 'antchain.saas.ability.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antchain_saas_ability_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityResponse:
        """
        Description: api上线回调接口
        Summary: api上线回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.CallbackAntchainSaasAbilityResponse(),
            await self.do_request_async('1.0', 'antchain.saas.ability.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_saas_foundation_protobuf(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_saas_foundation_protobuf_ex(request, headers, runtime)

    async def query_antchain_saas_foundation_protobuf_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_saas_foundation_protobuf_ex_async(request, headers, runtime)

    def query_antchain_saas_foundation_protobuf_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufResponse(),
            self.do_request('1.0', 'antchain.saas.foundation.protobuf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_saas_foundation_protobuf_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufResponse:
        """
        Description: 根据产品码+api code查询api protobuf信息
        Summary: 查询api protobuf信息（勿删）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryAntchainSaasFoundationProtobufResponse(),
            await self.do_request_async('1.0', 'antchain.saas.foundation.protobuf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_datanetwork_test(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_datanetwork_test_ex(request, headers, runtime)

    async def query_demo_datanetwork_test_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestRequest,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_datanetwork_test_ex_async(request, headers, runtime)

    def query_demo_datanetwork_test_ex(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestResponse(),
            self.do_request('1.0', 'demo.datanetwork.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_datanetwork_test_ex_async(
        self,
        request: ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_a_1f_82644937c_486c_81a_62b_0e_5a_6b_4fbe_models.QueryDemoDatanetworkTestResponse(),
            await self.do_request_async('1.0', 'demo.datanetwork.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
