# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_1fef8815252948ebb01da07898dd0fb2 import models as ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models
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
        config: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.Config,
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
            # 键值对，兼容map用
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_1fef8815252948ebb01da07898dd0fb2',
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
            # 键值对，兼容map用
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_1fef8815252948ebb01da07898dd0fb2',
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

    def auth_antchain_bbp_customer(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_bbp_customer_ex(request, headers, runtime)

    async def auth_antchain_bbp_customer_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_bbp_customer_ex_async(request, headers, runtime)

    def auth_antchain_bbp_customer_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_bbp_customer_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.AuthAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_bbp_customer(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_bbp_customer_ex(request, headers, runtime)

    async def create_antchain_bbp_customer_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_bbp_customer_ex_async(request, headers, runtime)

    def create_antchain_bbp_customer_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_bbp_customer_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.CreateAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_bbp_customer(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_bbp_customer_ex(request, headers, runtime)

    async def query_antchain_bbp_customer_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_bbp_customer_ex_async(request, headers, runtime)

    def query_antchain_bbp_customer_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_bbp_customer_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antchain_bbp_contract_rule(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antchain_bbp_contract_rule_ex(request, headers, runtime)

    async def apply_antchain_bbp_contract_rule_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antchain_bbp_contract_rule_ex_async(request, headers, runtime)

    def apply_antchain_bbp_contract_rule_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.rule.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antchain_bbp_contract_rule_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ApplyAntchainBbpContractRuleResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.rule.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_bbp_contract_rule(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_bbp_contract_rule_ex(request, headers, runtime)

    async def get_antchain_bbp_contract_rule_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_bbp_contract_rule_ex_async(request, headers, runtime)

    def get_antchain_bbp_contract_rule_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_bbp_contract_rule_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.GetAntchainBbpContractRuleResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_antchain_bbp_contract_reconciliation(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_antchain_bbp_contract_reconciliation_ex(request, headers, runtime)

    async def exec_antchain_bbp_contract_reconciliation_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_antchain_bbp_contract_reconciliation_ex_async(request, headers, runtime)

    def exec_antchain_bbp_contract_reconciliation_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.reconciliation.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_antchain_bbp_contract_reconciliation_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ExecAntchainBbpContractReconciliationResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.reconciliation.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_antchain_bbp_contract_reconciliation(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_antchain_bbp_contract_reconciliation_ex(request, headers, runtime)

    async def confirm_antchain_bbp_contract_reconciliation_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_antchain_bbp_contract_reconciliation_ex_async(request, headers, runtime)

    def confirm_antchain_bbp_contract_reconciliation_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.reconciliation.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_antchain_bbp_contract_reconciliation_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ConfirmAntchainBbpContractReconciliationResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.reconciliation.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_bbp_contract_reconciliation(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_bbp_contract_reconciliation_ex(request, headers, runtime)

    async def query_antchain_bbp_contract_reconciliation_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_bbp_contract_reconciliation_ex_async(request, headers, runtime)

    def query_antchain_bbp_contract_reconciliation_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.reconciliation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_bbp_contract_reconciliation_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryAntchainBbpContractReconciliationResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.reconciliation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_saas_test_testa(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_saas_test_testa_ex(request, headers, runtime)

    async def query_demo_saas_test_testa_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_saas_test_testa_ex_async(request, headers, runtime)

    def query_demo_saas_test_testa_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaResponse(),
            self.do_request('1.0', 'demo.saas.test.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_saas_test_testa_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.QueryDemoSaasTestTestaResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_demo_saas_test_testd(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_demo_saas_test_testd_ex(request, headers, runtime)

    async def reset_demo_saas_test_testd_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdRequest,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_demo_saas_test_testd_ex_async(request, headers, runtime)

    def reset_demo_saas_test_testd_ex(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdResponse(),
            self.do_request('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_demo_saas_test_testd_ex_async(
        self,
        request: ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__1fef_8815252948ebb_01da_07898dd_0fb_2_models.ResetDemoSaasTestTestdResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
