# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_webtts import models as webtts_models
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
        config: webtts_models.Config,
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
            # 区块链response
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
                    'sdk_version': '1.0.7',
                    '_prod_code': 'WEBTTS',
                    '_prod_channel': 'default'
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
            # 区块链response
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
                    'sdk_version': '1.0.7',
                    '_prod_code': 'WEBTTS',
                    '_prod_channel': 'default'
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

    def withdraw_dac_vault(
        self,
        request: webtts_models.WithdrawDacVaultRequest,
    ) -> webtts_models.WithdrawDacVaultResponse:
        """
        Description: Withdraw Token
        Summary: Withdraw Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.withdraw_dac_vault_ex(request, headers, runtime)

    async def withdraw_dac_vault_async(
        self,
        request: webtts_models.WithdrawDacVaultRequest,
    ) -> webtts_models.WithdrawDacVaultResponse:
        """
        Description: Withdraw Token
        Summary: Withdraw Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.withdraw_dac_vault_ex_async(request, headers, runtime)

    def withdraw_dac_vault_ex(
        self,
        request: webtts_models.WithdrawDacVaultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.WithdrawDacVaultResponse:
        """
        Description: Withdraw Token
        Summary: Withdraw Token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.WithdrawDacVaultResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.vault.withdraw', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def withdraw_dac_vault_ex_async(
        self,
        request: webtts_models.WithdrawDacVaultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.WithdrawDacVaultResponse:
        """
        Description: Withdraw Token
        Summary: Withdraw Token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.WithdrawDacVaultResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.vault.withdraw', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_activate(
        self,
        request: webtts_models.OpenActivateRequest,
    ) -> webtts_models.OpenActivateResponse:
        """
        Description: 开通托管服务
        Summary: 开通托管服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_activate_ex(request, headers, runtime)

    async def open_activate_async(
        self,
        request: webtts_models.OpenActivateRequest,
    ) -> webtts_models.OpenActivateResponse:
        """
        Description: 开通托管服务
        Summary: 开通托管服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_activate_ex_async(request, headers, runtime)

    def open_activate_ex(
        self,
        request: webtts_models.OpenActivateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.OpenActivateResponse:
        """
        Description: 开通托管服务
        Summary: 开通托管服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.OpenActivateResponse(),
            self.do_request('1.0', 'antdigital.webtts.activate.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_activate_ex_async(
        self,
        request: webtts_models.OpenActivateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.OpenActivateResponse:
        """
        Description: 开通托管服务
        Summary: 开通托管服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.OpenActivateResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.activate.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_activate(
        self,
        request: webtts_models.StopActivateRequest,
    ) -> webtts_models.StopActivateResponse:
        """
        Description: 关闭托管服务
        Summary: 关闭托管服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_activate_ex(request, headers, runtime)

    async def stop_activate_async(
        self,
        request: webtts_models.StopActivateRequest,
    ) -> webtts_models.StopActivateResponse:
        """
        Description: 关闭托管服务
        Summary: 关闭托管服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_activate_ex_async(request, headers, runtime)

    def stop_activate_ex(
        self,
        request: webtts_models.StopActivateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.StopActivateResponse:
        """
        Description: 关闭托管服务
        Summary: 关闭托管服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.StopActivateResponse(),
            self.do_request('1.0', 'antdigital.webtts.activate.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_activate_ex_async(
        self,
        request: webtts_models.StopActivateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.StopActivateResponse:
        """
        Description: 关闭托管服务
        Summary: 关闭托管服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.StopActivateResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.activate.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_dac_blockchain(
        self,
        request: webtts_models.PagequeryDacBlockchainRequest,
    ) -> webtts_models.PagequeryDacBlockchainResponse:
        """
        Description: 分页查询支持的区块链
        Summary: 分页查询支持的区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_dac_blockchain_ex(request, headers, runtime)

    async def pagequery_dac_blockchain_async(
        self,
        request: webtts_models.PagequeryDacBlockchainRequest,
    ) -> webtts_models.PagequeryDacBlockchainResponse:
        """
        Description: 分页查询支持的区块链
        Summary: 分页查询支持的区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_dac_blockchain_ex_async(request, headers, runtime)

    def pagequery_dac_blockchain_ex(
        self,
        request: webtts_models.PagequeryDacBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacBlockchainResponse:
        """
        Description: 分页查询支持的区块链
        Summary: 分页查询支持的区块链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacBlockchainResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.blockchain.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_dac_blockchain_ex_async(
        self,
        request: webtts_models.PagequeryDacBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacBlockchainResponse:
        """
        Description: 分页查询支持的区块链
        Summary: 分页查询支持的区块链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacBlockchainResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.blockchain.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_dac_token(
        self,
        request: webtts_models.PagequeryDacTokenRequest,
    ) -> webtts_models.PagequeryDacTokenResponse:
        """
        Description: 分页查询支持的币种
        Summary: 分页查询支持的币种
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_dac_token_ex(request, headers, runtime)

    async def pagequery_dac_token_async(
        self,
        request: webtts_models.PagequeryDacTokenRequest,
    ) -> webtts_models.PagequeryDacTokenResponse:
        """
        Description: 分页查询支持的币种
        Summary: 分页查询支持的币种
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_dac_token_ex_async(request, headers, runtime)

    def pagequery_dac_token_ex(
        self,
        request: webtts_models.PagequeryDacTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacTokenResponse:
        """
        Description: 分页查询支持的币种
        Summary: 分页查询支持的币种
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacTokenResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.token.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_dac_token_ex_async(
        self,
        request: webtts_models.PagequeryDacTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacTokenResponse:
        """
        Description: 分页查询支持的币种
        Summary: 分页查询支持的币种
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacTokenResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.token.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dac_whitelist(
        self,
        request: webtts_models.AddDacWhitelistRequest,
    ) -> webtts_models.AddDacWhitelistResponse:
        """
        Description: 添加白名单服务
        Summary: 添加白名单服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dac_whitelist_ex(request, headers, runtime)

    async def add_dac_whitelist_async(
        self,
        request: webtts_models.AddDacWhitelistRequest,
    ) -> webtts_models.AddDacWhitelistResponse:
        """
        Description: 添加白名单服务
        Summary: 添加白名单服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dac_whitelist_ex_async(request, headers, runtime)

    def add_dac_whitelist_ex(
        self,
        request: webtts_models.AddDacWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.AddDacWhitelistResponse:
        """
        Description: 添加白名单服务
        Summary: 添加白名单服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.AddDacWhitelistResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.whitelist.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dac_whitelist_ex_async(
        self,
        request: webtts_models.AddDacWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.AddDacWhitelistResponse:
        """
        Description: 添加白名单服务
        Summary: 添加白名单服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.AddDacWhitelistResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.whitelist.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_dac_whitelist(
        self,
        request: webtts_models.CheckDacWhitelistRequest,
    ) -> webtts_models.CheckDacWhitelistResponse:
        """
        Description: 白名单地址检查
        Summary: 白名单地址检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_dac_whitelist_ex(request, headers, runtime)

    async def check_dac_whitelist_async(
        self,
        request: webtts_models.CheckDacWhitelistRequest,
    ) -> webtts_models.CheckDacWhitelistResponse:
        """
        Description: 白名单地址检查
        Summary: 白名单地址检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_dac_whitelist_ex_async(request, headers, runtime)

    def check_dac_whitelist_ex(
        self,
        request: webtts_models.CheckDacWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.CheckDacWhitelistResponse:
        """
        Description: 白名单地址检查
        Summary: 白名单地址检查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.CheckDacWhitelistResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.whitelist.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_dac_whitelist_ex_async(
        self,
        request: webtts_models.CheckDacWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.CheckDacWhitelistResponse:
        """
        Description: 白名单地址检查
        Summary: 白名单地址检查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.CheckDacWhitelistResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.whitelist.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dac_quota(
        self,
        request: webtts_models.QueryDacQuotaRequest,
    ) -> webtts_models.QueryDacQuotaResponse:
        """
        Description: Query customer quota and return the comparative balance between customer quota and customer balance
        查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
        Summary: 查询提现最大金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dac_quota_ex(request, headers, runtime)

    async def query_dac_quota_async(
        self,
        request: webtts_models.QueryDacQuotaRequest,
    ) -> webtts_models.QueryDacQuotaResponse:
        """
        Description: Query customer quota and return the comparative balance between customer quota and customer balance
        查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
        Summary: 查询提现最大金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dac_quota_ex_async(request, headers, runtime)

    def query_dac_quota_ex(
        self,
        request: webtts_models.QueryDacQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.QueryDacQuotaResponse:
        """
        Description: Query customer quota and return the comparative balance between customer quota and customer balance
        查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
        Summary: 查询提现最大金额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.QueryDacQuotaResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dac_quota_ex_async(
        self,
        request: webtts_models.QueryDacQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.QueryDacQuotaResponse:
        """
        Description: Query customer quota and return the comparative balance between customer quota and customer balance
        查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
        Summary: 查询提现最大金额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.QueryDacQuotaResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dac_custodyaddress(
        self,
        request: webtts_models.QueryDacCustodyaddressRequest,
    ) -> webtts_models.QueryDacCustodyaddressResponse:
        """
        Description: 查询指定用户和区块链的托管钱包地址
        Summary: 查询托管地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dac_custodyaddress_ex(request, headers, runtime)

    async def query_dac_custodyaddress_async(
        self,
        request: webtts_models.QueryDacCustodyaddressRequest,
    ) -> webtts_models.QueryDacCustodyaddressResponse:
        """
        Description: 查询指定用户和区块链的托管钱包地址
        Summary: 查询托管地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dac_custodyaddress_ex_async(request, headers, runtime)

    def query_dac_custodyaddress_ex(
        self,
        request: webtts_models.QueryDacCustodyaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.QueryDacCustodyaddressResponse:
        """
        Description: 查询指定用户和区块链的托管钱包地址
        Summary: 查询托管地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.QueryDacCustodyaddressResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.custodyaddress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dac_custodyaddress_ex_async(
        self,
        request: webtts_models.QueryDacCustodyaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.QueryDacCustodyaddressResponse:
        """
        Description: 查询指定用户和区块链的托管钱包地址
        Summary: 查询托管地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.QueryDacCustodyaddressResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.custodyaddress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dac_deposit(
        self,
        request: webtts_models.CreateDacDepositRequest,
    ) -> webtts_models.CreateDacDepositResponse:
        """
        Description: 创建deposit订单
        Summary: 创建deposit订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dac_deposit_ex(request, headers, runtime)

    async def create_dac_deposit_async(
        self,
        request: webtts_models.CreateDacDepositRequest,
    ) -> webtts_models.CreateDacDepositResponse:
        """
        Description: 创建deposit订单
        Summary: 创建deposit订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dac_deposit_ex_async(request, headers, runtime)

    def create_dac_deposit_ex(
        self,
        request: webtts_models.CreateDacDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.CreateDacDepositResponse:
        """
        Description: 创建deposit订单
        Summary: 创建deposit订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.CreateDacDepositResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.deposit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dac_deposit_ex_async(
        self,
        request: webtts_models.CreateDacDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.CreateDacDepositResponse:
        """
        Description: 创建deposit订单
        Summary: 创建deposit订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.CreateDacDepositResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.deposit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_dac_deposit(
        self,
        request: webtts_models.PagequeryDacDepositRequest,
    ) -> webtts_models.PagequeryDacDepositResponse:
        """
        Description: 分页查询deposit订单列表
        Summary: 分页查询deposit订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_dac_deposit_ex(request, headers, runtime)

    async def pagequery_dac_deposit_async(
        self,
        request: webtts_models.PagequeryDacDepositRequest,
    ) -> webtts_models.PagequeryDacDepositResponse:
        """
        Description: 分页查询deposit订单列表
        Summary: 分页查询deposit订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_dac_deposit_ex_async(request, headers, runtime)

    def pagequery_dac_deposit_ex(
        self,
        request: webtts_models.PagequeryDacDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacDepositResponse:
        """
        Description: 分页查询deposit订单列表
        Summary: 分页查询deposit订单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacDepositResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.deposit.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_dac_deposit_ex_async(
        self,
        request: webtts_models.PagequeryDacDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacDepositResponse:
        """
        Description: 分页查询deposit订单列表
        Summary: 分页查询deposit订单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacDepositResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.deposit.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dac_depositlimits(
        self,
        request: webtts_models.QueryDacDepositlimitsRequest,
    ) -> webtts_models.QueryDacDepositlimitsResponse:
        """
        Description: 查询最大/最小可以deposit的数量
        Summary: 查询最大/最小可以deposit的数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dac_depositlimits_ex(request, headers, runtime)

    async def query_dac_depositlimits_async(
        self,
        request: webtts_models.QueryDacDepositlimitsRequest,
    ) -> webtts_models.QueryDacDepositlimitsResponse:
        """
        Description: 查询最大/最小可以deposit的数量
        Summary: 查询最大/最小可以deposit的数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dac_depositlimits_ex_async(request, headers, runtime)

    def query_dac_depositlimits_ex(
        self,
        request: webtts_models.QueryDacDepositlimitsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.QueryDacDepositlimitsResponse:
        """
        Description: 查询最大/最小可以deposit的数量
        Summary: 查询最大/最小可以deposit的数量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.QueryDacDepositlimitsResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.depositlimits.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dac_depositlimits_ex_async(
        self,
        request: webtts_models.QueryDacDepositlimitsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.QueryDacDepositlimitsResponse:
        """
        Description: 查询最大/最小可以deposit的数量
        Summary: 查询最大/最小可以deposit的数量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.QueryDacDepositlimitsResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.depositlimits.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_dac_whitelist(
        self,
        request: webtts_models.PagequeryDacWhitelistRequest,
    ) -> webtts_models.PagequeryDacWhitelistResponse:
        """
        Description: 白名单分页列表查询
        Summary: 白名单分页列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_dac_whitelist_ex(request, headers, runtime)

    async def pagequery_dac_whitelist_async(
        self,
        request: webtts_models.PagequeryDacWhitelistRequest,
    ) -> webtts_models.PagequeryDacWhitelistResponse:
        """
        Description: 白名单分页列表查询
        Summary: 白名单分页列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_dac_whitelist_ex_async(request, headers, runtime)

    def pagequery_dac_whitelist_ex(
        self,
        request: webtts_models.PagequeryDacWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacWhitelistResponse:
        """
        Description: 白名单分页列表查询
        Summary: 白名单分页列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacWhitelistResponse(),
            self.do_request('1.0', 'antdigital.webtts.dac.whitelist.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_dac_whitelist_ex_async(
        self,
        request: webtts_models.PagequeryDacWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtts_models.PagequeryDacWhitelistResponse:
        """
        Description: 白名单分页列表查询
        Summary: 白名单分页列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtts_models.PagequeryDacWhitelistResponse(),
            await self.do_request_async('1.0', 'antdigital.webtts.dac.whitelist.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
