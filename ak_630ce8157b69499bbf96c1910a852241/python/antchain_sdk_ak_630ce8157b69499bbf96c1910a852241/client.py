# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_630ce8157b69499bbf96c1910a852241 import models as ak__630ce_8157b_69499bbf_96c_1910a_852241_models
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
        config: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.Config,
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
            # 分页属性
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
                    '_prod_code': 'ak_630ce8157b69499bbf96c1910a852241',
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
            # 分页属性
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
                    '_prod_code': 'ak_630ce8157b69499bbf96c1910a852241',
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

    def create_baas_blockchain_instance_inner(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerResponse:
        """
        Description: 区块链实例创建（内部）
        Summary: 区块链创建（内部）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_blockchain_instance_inner_ex(request, headers, runtime)

    async def create_baas_blockchain_instance_inner_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerResponse:
        """
        Description: 区块链实例创建（内部）
        Summary: 区块链创建（内部）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_blockchain_instance_inner_ex_async(request, headers, runtime)

    def create_baas_blockchain_instance_inner_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerResponse:
        """
        Description: 区块链实例创建（内部）
        Summary: 区块链创建（内部）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerResponse(),
            self.do_request('1.0', 'baas.blockchain.instance.inner.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_blockchain_instance_inner_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerResponse:
        """
        Description: 区块链实例创建（内部）
        Summary: 区块链创建（内部）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasBlockchainInstanceInnerResponse(),
            await self.do_request_async('1.0', 'baas.blockchain.instance.inner.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_baas_chain_account_ant(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntResponse:
        """
        Description: 自动创建账户
        Summary: 自动创建账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_baas_chain_account_ant_ex(request, headers, runtime)

    async def apply_baas_chain_account_ant_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntResponse:
        """
        Description: 自动创建账户
        Summary: 自动创建账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_baas_chain_account_ant_ex_async(request, headers, runtime)

    def apply_baas_chain_account_ant_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntResponse:
        """
        Description: 自动创建账户
        Summary: 自动创建账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntResponse(),
            self.do_request('1.0', 'baas.chain.account.ant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_baas_chain_account_ant_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntResponse:
        """
        Description: 自动创建账户
        Summary: 自动创建账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainAccountAntResponse(),
            await self.do_request_async('1.0', 'baas.chain.account.ant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_chain_account_ant(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntResponse:
        """
        Description: 手工创建账户
        Summary: 手工创建账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_chain_account_ant_ex(request, headers, runtime)

    async def create_baas_chain_account_ant_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntResponse:
        """
        Description: 手工创建账户
        Summary: 手工创建账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_chain_account_ant_ex_async(request, headers, runtime)

    def create_baas_chain_account_ant_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntResponse:
        """
        Description: 手工创建账户
        Summary: 手工创建账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntResponse(),
            self.do_request('1.0', 'baas.chain.account.ant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_chain_account_ant_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntResponse:
        """
        Description: 手工创建账户
        Summary: 手工创建账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainAccountAntResponse(),
            await self.do_request_async('1.0', 'baas.chain.account.ant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def freeze_baas_chain_account_ant(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntResponse:
        """
        Description: 区块链链上账户冻结
        Summary: 区块链链上账户冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.freeze_baas_chain_account_ant_ex(request, headers, runtime)

    async def freeze_baas_chain_account_ant_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntResponse:
        """
        Description: 区块链链上账户冻结
        Summary: 区块链链上账户冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.freeze_baas_chain_account_ant_ex_async(request, headers, runtime)

    def freeze_baas_chain_account_ant_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntResponse:
        """
        Description: 区块链链上账户冻结
        Summary: 区块链链上账户冻结
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntResponse(),
            self.do_request('1.0', 'baas.chain.account.ant.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def freeze_baas_chain_account_ant_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntResponse:
        """
        Description: 区块链链上账户冻结
        Summary: 区块链链上账户冻结
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.FreezeBaasChainAccountAntResponse(),
            await self.do_request_async('1.0', 'baas.chain.account.ant.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_chain_account_ant(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntResponse:
        """
        Description: 查询链上账户列表
        Summary: 查询链上账户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_chain_account_ant_ex(request, headers, runtime)

    async def query_baas_chain_account_ant_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntResponse:
        """
        Description: 查询链上账户列表
        Summary: 查询链上账户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_chain_account_ant_ex_async(request, headers, runtime)

    def query_baas_chain_account_ant_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntResponse:
        """
        Description: 查询链上账户列表
        Summary: 查询链上账户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntResponse(),
            self.do_request('1.0', 'baas.chain.account.ant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_chain_account_ant_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntResponse:
        """
        Description: 查询链上账户列表
        Summary: 查询链上账户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainAccountAntResponse(),
            await self.do_request_async('1.0', 'baas.chain.account.ant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unfreeze_baas_chain_account_ant(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntResponse:
        """
        Description: 蚂蚁区块链账户解冻
        Summary: 蚂蚁区块链账户解冻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unfreeze_baas_chain_account_ant_ex(request, headers, runtime)

    async def unfreeze_baas_chain_account_ant_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntResponse:
        """
        Description: 蚂蚁区块链账户解冻
        Summary: 蚂蚁区块链账户解冻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unfreeze_baas_chain_account_ant_ex_async(request, headers, runtime)

    def unfreeze_baas_chain_account_ant_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntResponse:
        """
        Description: 蚂蚁区块链账户解冻
        Summary: 蚂蚁区块链账户解冻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntResponse(),
            self.do_request('1.0', 'baas.chain.account.ant.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unfreeze_baas_chain_account_ant_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntResponse:
        """
        Description: 蚂蚁区块链账户解冻
        Summary: 蚂蚁区块链账户解冻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UnfreezeBaasChainAccountAntResponse(),
            await self.do_request_async('1.0', 'baas.chain.account.ant.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baas_chain_name_ant(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntResponse:
        """
        Description: 更新区块链的名称
        Summary: 更新区块链的名称
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baas_chain_name_ant_ex(request, headers, runtime)

    async def update_baas_chain_name_ant_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntResponse:
        """
        Description: 更新区块链的名称
        Summary: 更新区块链的名称
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baas_chain_name_ant_ex_async(request, headers, runtime)

    def update_baas_chain_name_ant_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntResponse:
        """
        Description: 更新区块链的名称
        Summary: 更新区块链的名称
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntResponse(),
            self.do_request('1.0', 'baas.chain.name.ant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baas_chain_name_ant_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntResponse:
        """
        Description: 更新区块链的名称
        Summary: 更新区块链的名称
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainNameAntResponse(),
            await self.do_request_async('1.0', 'baas.chain.name.ant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_chain_subnet(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetResponse:
        """
        Description: 阿里云子链创建
        Summary: 阿里云子链创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_chain_subnet_ex(request, headers, runtime)

    async def create_baas_chain_subnet_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetResponse:
        """
        Description: 阿里云子链创建
        Summary: 阿里云子链创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_chain_subnet_ex_async(request, headers, runtime)

    def create_baas_chain_subnet_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetResponse:
        """
        Description: 阿里云子链创建
        Summary: 阿里云子链创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetResponse(),
            self.do_request('1.0', 'baas.chain.subnet.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_chain_subnet_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetResponse:
        """
        Description: 阿里云子链创建
        Summary: 阿里云子链创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasChainSubnetResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_baas_chain_subnet_create(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateResponse:
        """
        Description: 阿里云子链创建的前置检查
        Summary: 阿里云子链创建的前置检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_baas_chain_subnet_create_ex(request, headers, runtime)

    async def check_baas_chain_subnet_create_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateResponse:
        """
        Description: 阿里云子链创建的前置检查
        Summary: 阿里云子链创建的前置检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_baas_chain_subnet_create_ex_async(request, headers, runtime)

    def check_baas_chain_subnet_create_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateResponse:
        """
        Description: 阿里云子链创建的前置检查
        Summary: 阿里云子链创建的前置检查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateResponse(),
            self.do_request('1.0', 'baas.chain.subnet.create.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_baas_chain_subnet_create_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateResponse:
        """
        Description: 阿里云子链创建的前置检查
        Summary: 阿里云子链创建的前置检查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetCreateResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.create.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_baas_chain_subnet(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetResponse:
        """
        Description: 阿里云子链的启动
        Summary: 阿里云子链的启动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_baas_chain_subnet_ex(request, headers, runtime)

    async def exec_baas_chain_subnet_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetResponse:
        """
        Description: 阿里云子链的启动
        Summary: 阿里云子链的启动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_baas_chain_subnet_ex_async(request, headers, runtime)

    def exec_baas_chain_subnet_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetResponse:
        """
        Description: 阿里云子链的启动
        Summary: 阿里云子链的启动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetResponse(),
            self.do_request('1.0', 'baas.chain.subnet.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_baas_chain_subnet_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetResponse:
        """
        Description: 阿里云子链的启动
        Summary: 阿里云子链的启动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ExecBaasChainSubnetResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_baas_chain_subnet_member(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加
        Summary: 阿里云子链成员添加
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_baas_chain_subnet_member_ex(request, headers, runtime)

    async def add_baas_chain_subnet_member_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加
        Summary: 阿里云子链成员添加
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_baas_chain_subnet_member_ex_async(request, headers, runtime)

    def add_baas_chain_subnet_member_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加
        Summary: 阿里云子链成员添加
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberResponse(),
            self.do_request('1.0', 'baas.chain.subnet.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_baas_chain_subnet_member_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加
        Summary: 阿里云子链成员添加
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.AddBaasChainSubnetMemberResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_baas_chain_subnet_member(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加前校验
        Summary: 阿里云子链成员添加前校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_baas_chain_subnet_member_ex(request, headers, runtime)

    async def check_baas_chain_subnet_member_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加前校验
        Summary: 阿里云子链成员添加前校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_baas_chain_subnet_member_ex_async(request, headers, runtime)

    def check_baas_chain_subnet_member_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加前校验
        Summary: 阿里云子链成员添加前校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberResponse(),
            self.do_request('1.0', 'baas.chain.subnet.member.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_baas_chain_subnet_member_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员添加前校验
        Summary: 阿里云子链成员添加前校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CheckBaasChainSubnetMemberResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.member.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_baas_chain_subnet_member(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员删除
        Summary: 阿里云子链成员删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_baas_chain_subnet_member_ex(request, headers, runtime)

    async def delete_baas_chain_subnet_member_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员删除
        Summary: 阿里云子链成员删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_baas_chain_subnet_member_ex_async(request, headers, runtime)

    def delete_baas_chain_subnet_member_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员删除
        Summary: 阿里云子链成员删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberResponse(),
            self.do_request('1.0', 'baas.chain.subnet.member.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_baas_chain_subnet_member_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链成员删除
        Summary: 阿里云子链成员删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasChainSubnetMemberResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.member.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_chain_subnet_member(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链机构列表查询
        Summary: 阿里云子链机构列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_chain_subnet_member_ex(request, headers, runtime)

    async def query_baas_chain_subnet_member_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链机构列表查询
        Summary: 阿里云子链机构列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_chain_subnet_member_ex_async(request, headers, runtime)

    def query_baas_chain_subnet_member_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链机构列表查询
        Summary: 阿里云子链机构列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberResponse(),
            self.do_request('1.0', 'baas.chain.subnet.member.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_chain_subnet_member_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberResponse:
        """
        Description: 阿里云子链机构列表查询
        Summary: 阿里云子链机构列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetMemberResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.member.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baas_chain_subnet_name(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameResponse:
        """
        Description: 阿里云子链名称修改
        Summary: 阿里云子链名称修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baas_chain_subnet_name_ex(request, headers, runtime)

    async def update_baas_chain_subnet_name_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameResponse:
        """
        Description: 阿里云子链名称修改
        Summary: 阿里云子链名称修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baas_chain_subnet_name_ex_async(request, headers, runtime)

    def update_baas_chain_subnet_name_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameResponse:
        """
        Description: 阿里云子链名称修改
        Summary: 阿里云子链名称修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameResponse(),
            self.do_request('1.0', 'baas.chain.subnet.name.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baas_chain_subnet_name_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameResponse:
        """
        Description: 阿里云子链名称修改
        Summary: 阿里云子链名称修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasChainSubnetNameResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.name.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_chain_subnet(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetResponse:
        """
        Description: 阿里云子链列表查询
        Summary: 阿里云子链列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_chain_subnet_ex(request, headers, runtime)

    async def query_baas_chain_subnet_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetResponse:
        """
        Description: 阿里云子链列表查询
        Summary: 阿里云子链列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_chain_subnet_ex_async(request, headers, runtime)

    def query_baas_chain_subnet_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetResponse:
        """
        Description: 阿里云子链列表查询
        Summary: 阿里云子链列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetResponse(),
            self.do_request('1.0', 'baas.chain.subnet.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_chain_subnet_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetResponse:
        """
        Description: 阿里云子链列表查询
        Summary: 阿里云子链列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasChainSubnetResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_baas_chain_subnet_rest(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestResponse:
        """
        Description: 阿里云子链REST开通
        Summary: 阿里云子链REST开通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_baas_chain_subnet_rest_ex(request, headers, runtime)

    async def apply_baas_chain_subnet_rest_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestResponse:
        """
        Description: 阿里云子链REST开通
        Summary: 阿里云子链REST开通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_baas_chain_subnet_rest_ex_async(request, headers, runtime)

    def apply_baas_chain_subnet_rest_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestResponse:
        """
        Description: 阿里云子链REST开通
        Summary: 阿里云子链REST开通
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestResponse(),
            self.do_request('1.0', 'baas.chain.subnet.rest.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_baas_chain_subnet_rest_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestResponse:
        """
        Description: 阿里云子链REST开通
        Summary: 阿里云子链REST开通
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.ApplyBaasChainSubnetRestResponse(),
            await self.do_request_async('1.0', 'baas.chain.subnet.rest.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_union_chain(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainResponse:
        """
        Description: 获取联盟内的蚂蚁区块链列表
        Summary: 获取联盟内的蚂蚁区块链列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_union_chain_ex(request, headers, runtime)

    async def query_baas_union_chain_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainResponse:
        """
        Description: 获取联盟内的蚂蚁区块链列表
        Summary: 获取联盟内的蚂蚁区块链列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_union_chain_ex_async(request, headers, runtime)

    def query_baas_union_chain_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainResponse:
        """
        Description: 获取联盟内的蚂蚁区块链列表
        Summary: 获取联盟内的蚂蚁区块链列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainResponse(),
            self.do_request('1.0', 'baas.union.chain.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_union_chain_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainResponse:
        """
        Description: 获取联盟内的蚂蚁区块链列表
        Summary: 获取联盟内的蚂蚁区块链列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionChainResponse(),
            await self.do_request_async('1.0', 'baas.union.chain.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_union_union(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_union_union_ex(request, headers, runtime)

    async def create_baas_union_union_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_union_union_ex_async(request, headers, runtime)

    def create_baas_union_union_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionResponse(),
            self.do_request('1.0', 'baas.union.union.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_union_union_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.CreateBaasUnionUnionResponse(),
            await self.do_request_async('1.0', 'baas.union.union.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_baas_union_union(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionResponse:
        """
        Description: 删除联盟
        Summary: 删除联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_baas_union_union_ex(request, headers, runtime)

    async def delete_baas_union_union_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionResponse:
        """
        Description: 删除联盟
        Summary: 删除联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_baas_union_union_ex_async(request, headers, runtime)

    def delete_baas_union_union_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionResponse:
        """
        Description: 删除联盟
        Summary: 删除联盟
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionResponse(),
            self.do_request('1.0', 'baas.union.union.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_baas_union_union_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionResponse:
        """
        Description: 删除联盟
        Summary: 删除联盟
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.DeleteBaasUnionUnionResponse(),
            await self.do_request_async('1.0', 'baas.union.union.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_union_union(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionResponse:
        """
        Description: 联盟查询
        Summary: 联盟查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_union_union_ex(request, headers, runtime)

    async def query_baas_union_union_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionResponse:
        """
        Description: 联盟查询
        Summary: 联盟查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_union_union_ex_async(request, headers, runtime)

    def query_baas_union_union_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionResponse:
        """
        Description: 联盟查询
        Summary: 联盟查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionResponse(),
            self.do_request('1.0', 'baas.union.union.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_union_union_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionResponse:
        """
        Description: 联盟查询
        Summary: 联盟查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.QueryBaasUnionUnionResponse(),
            await self.do_request_async('1.0', 'baas.union.union.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baas_union_union(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionResponse:
        """
        Description: 联盟更新
        Summary: 联盟更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baas_union_union_ex(request, headers, runtime)

    async def update_baas_union_union_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionRequest,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionResponse:
        """
        Description: 联盟更新
        Summary: 联盟更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baas_union_union_ex_async(request, headers, runtime)

    def update_baas_union_union_ex(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionResponse:
        """
        Description: 联盟更新
        Summary: 联盟更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionResponse(),
            self.do_request('1.0', 'baas.union.union.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baas_union_union_ex_async(
        self,
        request: ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionResponse:
        """
        Description: 联盟更新
        Summary: 联盟更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__630ce_8157b_69499bbf_96c_1910a_852241_models.UpdateBaasUnionUnionResponse(),
            await self.do_request_async('1.0', 'baas.union.union.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
