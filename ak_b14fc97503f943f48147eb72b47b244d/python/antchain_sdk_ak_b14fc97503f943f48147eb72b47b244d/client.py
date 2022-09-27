# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_b14fc97503f943f48147eb72b47b244d import models as ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models
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
        config: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.Config,
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_b14fc97503f943f48147eb72b47b244d',
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_b14fc97503f943f48147eb72b47b244d',
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
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_bbp_customer_ex(request, headers, runtime)

    async def auth_antchain_bbp_customer_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_bbp_customer_ex_async(request, headers, runtime)

    def auth_antchain_bbp_customer_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_bbp_customer_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.AuthAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_bbp_customer(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_bbp_customer_ex(request, headers, runtime)

    async def create_antchain_bbp_customer_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_bbp_customer_ex_async(request, headers, runtime)

    def create_antchain_bbp_customer_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_bbp_customer_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CreateAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_bbp_customer(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_bbp_customer_ex(request, headers, runtime)

    async def query_antchain_bbp_customer_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_bbp_customer_ex_async(request, headers, runtime)

    def query_antchain_bbp_customer_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_bbp_customer_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.QueryAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_antchain_bbp_did_account(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_antchain_bbp_did_account_ex(request, headers, runtime)

    async def match_antchain_bbp_did_account_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_antchain_bbp_did_account_ex_async(request, headers, runtime)

    def match_antchain_bbp_did_account_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountResponse(),
            self.do_request('1.0', 'antchain.bbp.did.account.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_antchain_bbp_did_account_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.MatchAntchainBbpDidAccountResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.did.account.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_antchain_bbp_insurance(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_antchain_bbp_insurance_ex(request, headers, runtime)

    async def operate_antchain_bbp_insurance_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_antchain_bbp_insurance_ex_async(request, headers, runtime)

    def operate_antchain_bbp_insurance_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_antchain_bbp_insurance_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.OperateAntchainBbpInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_bbp_insurance(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_bbp_insurance_ex(request, headers, runtime)

    async def sync_antchain_bbp_insurance_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_bbp_insurance_ex_async(request, headers, runtime)

    def sync_antchain_bbp_insurance_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_bbp_insurance_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.SyncAntchainBbpInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_bbp_insurance(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_bbp_insurance_ex(request, headers, runtime)

    async def upload_antchain_bbp_insurance_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_bbp_insurance_ex_async(request, headers, runtime)

    def upload_antchain_bbp_insurance_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_bbp_insurance_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.UploadAntchainBbpInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_antchain_bbp_insurance_user(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_antchain_bbp_insurance_user_ex(request, headers, runtime)

    async def init_antchain_bbp_insurance_user_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_antchain_bbp_insurance_user_ex_async(request, headers, runtime)

    def init_antchain_bbp_insurance_user_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_antchain_bbp_insurance_user_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpInsuranceUserResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_antchain_bbp_verify(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_antchain_bbp_verify_ex(request, headers, runtime)

    async def check_antchain_bbp_verify_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_antchain_bbp_verify_ex_async(request, headers, runtime)

    def check_antchain_bbp_verify_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyResponse(),
            self.do_request('1.0', 'antchain.bbp.verify.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_antchain_bbp_verify_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.CheckAntchainBbpVerifyResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.verify.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_antchain_bbp_verify(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_antchain_bbp_verify_ex(request, headers, runtime)

    async def init_antchain_bbp_verify_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_antchain_bbp_verify_ex_async(request, headers, runtime)

    def init_antchain_bbp_verify_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyResponse(),
            self.do_request('1.0', 'antchain.bbp.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_antchain_bbp_verify_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.InitAntchainBbpVerifyResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_antchain_bbp_verify(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_antchain_bbp_verify_ex(request, headers, runtime)

    async def start_antchain_bbp_verify_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyRequest,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_antchain_bbp_verify_ex_async(request, headers, runtime)

    def start_antchain_bbp_verify_ex(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyResponse(),
            self.do_request('1.0', 'antchain.bbp.verify.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_antchain_bbp_verify_ex_async(
        self,
        request: ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_b_14fc_97503f_943f_48147eb_72b_47b_244d_models.StartAntchainBbpVerifyResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.verify.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
