# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_propertychain import models as propertychain_models
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
        config: propertychain_models.Config,
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
            # 无分组设备
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
                    'sdk_version': '1.0.45'
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
            # 无分组设备
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
                    'sdk_version': '1.0.45'
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

    def create_user(
        self,
        request: propertychain_models.CreateUserRequest,
    ) -> propertychain_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_user_ex(request, headers, runtime)

    async def create_user_async(
        self,
        request: propertychain_models.CreateUserRequest,
    ) -> propertychain_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_user_ex_async(request, headers, runtime)

    def create_user_ex(
        self,
        request: propertychain_models.CreateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateUserResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_user_ex_async(
        self,
        request: propertychain_models.CreateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_transfer(
        self,
        request: propertychain_models.CreateTransferRequest,
    ) -> propertychain_models.CreateTransferResponse:
        """
        Description: 物权凭证转让/赠送
        Summary: 物权凭证转让/赠送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_transfer_ex(request, headers, runtime)

    async def create_transfer_async(
        self,
        request: propertychain_models.CreateTransferRequest,
    ) -> propertychain_models.CreateTransferResponse:
        """
        Description: 物权凭证转让/赠送
        Summary: 物权凭证转让/赠送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_transfer_ex_async(request, headers, runtime)

    def create_transfer_ex(
        self,
        request: propertychain_models.CreateTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateTransferResponse:
        """
        Description: 物权凭证转让/赠送
        Summary: 物权凭证转让/赠送
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateTransferResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.transfer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_transfer_ex_async(
        self,
        request: propertychain_models.CreateTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateTransferResponse:
        """
        Description: 物权凭证转让/赠送
        Summary: 物权凭证转让/赠送
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateTransferResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.transfer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_pickup(
        self,
        request: propertychain_models.CreatePickupRequest,
    ) -> propertychain_models.CreatePickupResponse:
        """
        Description: 创建提取码
        Summary: 创建提取码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_pickup_ex(request, headers, runtime)

    async def create_pickup_async(
        self,
        request: propertychain_models.CreatePickupRequest,
    ) -> propertychain_models.CreatePickupResponse:
        """
        Description: 创建提取码
        Summary: 创建提取码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_pickup_ex_async(request, headers, runtime)

    def create_pickup_ex(
        self,
        request: propertychain_models.CreatePickupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreatePickupResponse:
        """
        Description: 创建提取码
        Summary: 创建提取码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreatePickupResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.pickup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_pickup_ex_async(
        self,
        request: propertychain_models.CreatePickupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreatePickupResponse:
        """
        Description: 创建提取码
        Summary: 创建提取码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreatePickupResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.pickup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_pickup(
        self,
        request: propertychain_models.CancelPickupRequest,
    ) -> propertychain_models.CancelPickupResponse:
        """
        Description: 销毁提取码
        Summary: 销毁提取码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_pickup_ex(request, headers, runtime)

    async def cancel_pickup_async(
        self,
        request: propertychain_models.CancelPickupRequest,
    ) -> propertychain_models.CancelPickupResponse:
        """
        Description: 销毁提取码
        Summary: 销毁提取码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_pickup_ex_async(request, headers, runtime)

    def cancel_pickup_ex(
        self,
        request: propertychain_models.CancelPickupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelPickupResponse:
        """
        Description: 销毁提取码
        Summary: 销毁提取码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelPickupResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.pickup.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_pickup_ex_async(
        self,
        request: propertychain_models.CancelPickupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelPickupResponse:
        """
        Description: 销毁提取码
        Summary: 销毁提取码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelPickupResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.pickup.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_pickup(
        self,
        request: propertychain_models.DisablePickupRequest,
    ) -> propertychain_models.DisablePickupResponse:
        """
        Description: 核销提取码
        Summary: 核销提取码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_pickup_ex(request, headers, runtime)

    async def disable_pickup_async(
        self,
        request: propertychain_models.DisablePickupRequest,
    ) -> propertychain_models.DisablePickupResponse:
        """
        Description: 核销提取码
        Summary: 核销提取码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_pickup_ex_async(request, headers, runtime)

    def disable_pickup_ex(
        self,
        request: propertychain_models.DisablePickupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DisablePickupResponse:
        """
        Description: 核销提取码
        Summary: 核销提取码
        """
        UtilClient.validate_model(request)
        return propertychain_models.DisablePickupResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.pickup.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_pickup_ex_async(
        self,
        request: propertychain_models.DisablePickupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DisablePickupResponse:
        """
        Description: 核销提取码
        Summary: 核销提取码
        """
        UtilClient.validate_model(request)
        return propertychain_models.DisablePickupResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.pickup.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_league(
        self,
        request: propertychain_models.CreateLeagueRequest,
    ) -> propertychain_models.CreateLeagueResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_league_ex(request, headers, runtime)

    async def create_league_async(
        self,
        request: propertychain_models.CreateLeagueRequest,
    ) -> propertychain_models.CreateLeagueResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_league_ex_async(request, headers, runtime)

    def create_league_ex(
        self,
        request: propertychain_models.CreateLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateLeagueResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateLeagueResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_league_ex_async(
        self,
        request: propertychain_models.CreateLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateLeagueResponse:
        """
        Description: 创建联盟
        Summary: 创建联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateLeagueResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_league(
        self,
        request: propertychain_models.AddLeagueRequest,
    ) -> propertychain_models.AddLeagueResponse:
        """
        Description: 加入联盟
        Summary: 加入联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_league_ex(request, headers, runtime)

    async def add_league_async(
        self,
        request: propertychain_models.AddLeagueRequest,
    ) -> propertychain_models.AddLeagueResponse:
        """
        Description: 加入联盟
        Summary: 加入联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_league_ex_async(request, headers, runtime)

    def add_league_ex(
        self,
        request: propertychain_models.AddLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AddLeagueResponse:
        """
        Description: 加入联盟
        Summary: 加入联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.AddLeagueResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_league_ex_async(
        self,
        request: propertychain_models.AddLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AddLeagueResponse:
        """
        Description: 加入联盟
        Summary: 加入联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.AddLeagueResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_league(
        self,
        request: propertychain_models.ConfirmLeagueRequest,
    ) -> propertychain_models.ConfirmLeagueResponse:
        """
        Description: 审核加入联盟
        Summary: 审核加入联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_league_ex(request, headers, runtime)

    async def confirm_league_async(
        self,
        request: propertychain_models.ConfirmLeagueRequest,
    ) -> propertychain_models.ConfirmLeagueResponse:
        """
        Description: 审核加入联盟
        Summary: 审核加入联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_league_ex_async(request, headers, runtime)

    def confirm_league_ex(
        self,
        request: propertychain_models.ConfirmLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ConfirmLeagueResponse:
        """
        Description: 审核加入联盟
        Summary: 审核加入联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.ConfirmLeagueResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_league_ex_async(
        self,
        request: propertychain_models.ConfirmLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ConfirmLeagueResponse:
        """
        Description: 审核加入联盟
        Summary: 审核加入联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.ConfirmLeagueResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_league(
        self,
        request: propertychain_models.QueryLeagueRequest,
    ) -> propertychain_models.QueryLeagueResponse:
        """
        Description: 查询联盟
        Summary: 查询联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_league_ex(request, headers, runtime)

    async def query_league_async(
        self,
        request: propertychain_models.QueryLeagueRequest,
    ) -> propertychain_models.QueryLeagueResponse:
        """
        Description: 查询联盟
        Summary: 查询联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_league_ex_async(request, headers, runtime)

    def query_league_ex(
        self,
        request: propertychain_models.QueryLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryLeagueResponse:
        """
        Description: 查询联盟
        Summary: 查询联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryLeagueResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_league_ex_async(
        self,
        request: propertychain_models.QueryLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryLeagueResponse:
        """
        Description: 查询联盟
        Summary: 查询联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryLeagueResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_importasset(
        self,
        request: propertychain_models.CreateImportassetRequest,
    ) -> propertychain_models.CreateImportassetResponse:
        """
        Description: 创建资产信息
        Summary: 创建资产信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_importasset_ex(request, headers, runtime)

    async def create_importasset_async(
        self,
        request: propertychain_models.CreateImportassetRequest,
    ) -> propertychain_models.CreateImportassetResponse:
        """
        Description: 创建资产信息
        Summary: 创建资产信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_importasset_ex_async(request, headers, runtime)

    def create_importasset_ex(
        self,
        request: propertychain_models.CreateImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateImportassetResponse:
        """
        Description: 创建资产信息
        Summary: 创建资产信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_importasset_ex_async(
        self,
        request: propertychain_models.CreateImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateImportassetResponse:
        """
        Description: 创建资产信息
        Summary: 创建资产信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_importasset(
        self,
        request: propertychain_models.UpdateImportassetRequest,
    ) -> propertychain_models.UpdateImportassetResponse:
        """
        Description: 更新物权
        Summary: 更新物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_importasset_ex(request, headers, runtime)

    async def update_importasset_async(
        self,
        request: propertychain_models.UpdateImportassetRequest,
    ) -> propertychain_models.UpdateImportassetResponse:
        """
        Description: 更新物权
        Summary: 更新物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_importasset_ex_async(request, headers, runtime)

    def update_importasset_ex(
        self,
        request: propertychain_models.UpdateImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateImportassetResponse:
        """
        Description: 更新物权
        Summary: 更新物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_importasset_ex_async(
        self,
        request: propertychain_models.UpdateImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateImportassetResponse:
        """
        Description: 更新物权
        Summary: 更新物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_importasset(
        self,
        request: propertychain_models.CancelImportassetRequest,
    ) -> propertychain_models.CancelImportassetResponse:
        """
        Description: 注销物权
        Summary: 注销物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_importasset_ex(request, headers, runtime)

    async def cancel_importasset_async(
        self,
        request: propertychain_models.CancelImportassetRequest,
    ) -> propertychain_models.CancelImportassetResponse:
        """
        Description: 注销物权
        Summary: 注销物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_importasset_ex_async(request, headers, runtime)

    def cancel_importasset_ex(
        self,
        request: propertychain_models.CancelImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelImportassetResponse:
        """
        Description: 注销物权
        Summary: 注销物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_importasset_ex_async(
        self,
        request: propertychain_models.CancelImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelImportassetResponse:
        """
        Description: 注销物权
        Summary: 注销物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def freeze_importasset(
        self,
        request: propertychain_models.FreezeImportassetRequest,
    ) -> propertychain_models.FreezeImportassetResponse:
        """
        Description: 冻结物权
        Summary: 冻结物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.freeze_importasset_ex(request, headers, runtime)

    async def freeze_importasset_async(
        self,
        request: propertychain_models.FreezeImportassetRequest,
    ) -> propertychain_models.FreezeImportassetResponse:
        """
        Description: 冻结物权
        Summary: 冻结物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.freeze_importasset_ex_async(request, headers, runtime)

    def freeze_importasset_ex(
        self,
        request: propertychain_models.FreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.FreezeImportassetResponse:
        """
        Description: 冻结物权
        Summary: 冻结物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.FreezeImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def freeze_importasset_ex_async(
        self,
        request: propertychain_models.FreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.FreezeImportassetResponse:
        """
        Description: 冻结物权
        Summary: 冻结物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.FreezeImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unfreeze_importasset(
        self,
        request: propertychain_models.UnfreezeImportassetRequest,
    ) -> propertychain_models.UnfreezeImportassetResponse:
        """
        Description: 解冻物权
        Summary: 解冻物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unfreeze_importasset_ex(request, headers, runtime)

    async def unfreeze_importasset_async(
        self,
        request: propertychain_models.UnfreezeImportassetRequest,
    ) -> propertychain_models.UnfreezeImportassetResponse:
        """
        Description: 解冻物权
        Summary: 解冻物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unfreeze_importasset_ex_async(request, headers, runtime)

    def unfreeze_importasset_ex(
        self,
        request: propertychain_models.UnfreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UnfreezeImportassetResponse:
        """
        Description: 解冻物权
        Summary: 解冻物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.UnfreezeImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unfreeze_importasset_ex_async(
        self,
        request: propertychain_models.UnfreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UnfreezeImportassetResponse:
        """
        Description: 解冻物权
        Summary: 解冻物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.UnfreezeImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_importasset(
        self,
        request: propertychain_models.QueryImportassetRequest,
    ) -> propertychain_models.QueryImportassetResponse:
        """
        Description: 查询物权
        Summary: 查询物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_importasset_ex(request, headers, runtime)

    async def query_importasset_async(
        self,
        request: propertychain_models.QueryImportassetRequest,
    ) -> propertychain_models.QueryImportassetResponse:
        """
        Description: 查询物权
        Summary: 查询物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_importasset_ex_async(request, headers, runtime)

    def query_importasset_ex(
        self,
        request: propertychain_models.QueryImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryImportassetResponse:
        """
        Description: 查询物权
        Summary: 查询物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_importasset_ex_async(
        self,
        request: propertychain_models.QueryImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryImportassetResponse:
        """
        Description: 查询物权
        Summary: 查询物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_importasset(
        self,
        request: propertychain_models.AllImportassetRequest,
    ) -> propertychain_models.AllImportassetResponse:
        """
        Description: 物权列表
        Summary: 物权列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_importasset_ex(request, headers, runtime)

    async def all_importasset_async(
        self,
        request: propertychain_models.AllImportassetRequest,
    ) -> propertychain_models.AllImportassetResponse:
        """
        Description: 物权列表
        Summary: 物权列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_importasset_ex_async(request, headers, runtime)

    def all_importasset_ex(
        self,
        request: propertychain_models.AllImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AllImportassetResponse:
        """
        Description: 物权列表
        Summary: 物权列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.AllImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_importasset_ex_async(
        self,
        request: propertychain_models.AllImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AllImportassetResponse:
        """
        Description: 物权列表
        Summary: 物权列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.AllImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_importasset(
        self,
        request: propertychain_models.BatchqueryImportassetRequest,
    ) -> propertychain_models.BatchqueryImportassetResponse:
        """
        Description: 批量查询溯源信息
        Summary: 批量查询溯源信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_importasset_ex(request, headers, runtime)

    async def batchquery_importasset_async(
        self,
        request: propertychain_models.BatchqueryImportassetRequest,
    ) -> propertychain_models.BatchqueryImportassetResponse:
        """
        Description: 批量查询溯源信息
        Summary: 批量查询溯源信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_importasset_ex_async(request, headers, runtime)

    def batchquery_importasset_ex(
        self,
        request: propertychain_models.BatchqueryImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchqueryImportassetResponse:
        """
        Description: 批量查询溯源信息
        Summary: 批量查询溯源信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchqueryImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_importasset_ex_async(
        self,
        request: propertychain_models.BatchqueryImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchqueryImportassetResponse:
        """
        Description: 批量查询溯源信息
        Summary: 批量查询溯源信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchqueryImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_template(
        self,
        request: propertychain_models.CreateTemplateRequest,
    ) -> propertychain_models.CreateTemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_template_ex(request, headers, runtime)

    async def create_template_async(
        self,
        request: propertychain_models.CreateTemplateRequest,
    ) -> propertychain_models.CreateTemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_template_ex_async(request, headers, runtime)

    def create_template_ex(
        self,
        request: propertychain_models.CreateTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateTemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_template_ex_async(
        self,
        request: propertychain_models.CreateTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateTemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_template(
        self,
        request: propertychain_models.UpdateTemplateRequest,
    ) -> propertychain_models.UpdateTemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_template_ex(request, headers, runtime)

    async def update_template_async(
        self,
        request: propertychain_models.UpdateTemplateRequest,
    ) -> propertychain_models.UpdateTemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_template_ex_async(request, headers, runtime)

    def update_template_ex(
        self,
        request: propertychain_models.UpdateTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateTemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_template_ex_async(
        self,
        request: propertychain_models.UpdateTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateTemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_template(
        self,
        request: propertychain_models.QueryTemplateRequest,
    ) -> propertychain_models.QueryTemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_template_ex(request, headers, runtime)

    async def query_template_async(
        self,
        request: propertychain_models.QueryTemplateRequest,
    ) -> propertychain_models.QueryTemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_template_ex_async(request, headers, runtime)

    def query_template_ex(
        self,
        request: propertychain_models.QueryTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryTemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_template_ex_async(
        self,
        request: propertychain_models.QueryTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryTemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_template(
        self,
        request: propertychain_models.AllTemplateRequest,
    ) -> propertychain_models.AllTemplateResponse:
        """
        Description: 数据字典列表信息
        Summary: 数据字典列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_template_ex(request, headers, runtime)

    async def all_template_async(
        self,
        request: propertychain_models.AllTemplateRequest,
    ) -> propertychain_models.AllTemplateResponse:
        """
        Description: 数据字典列表信息
        Summary: 数据字典列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_template_ex_async(request, headers, runtime)

    def all_template_ex(
        self,
        request: propertychain_models.AllTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AllTemplateResponse:
        """
        Description: 数据字典列表信息
        Summary: 数据字典列表信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.AllTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_template_ex_async(
        self,
        request: propertychain_models.AllTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AllTemplateResponse:
        """
        Description: 数据字典列表信息
        Summary: 数据字典列表信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.AllTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_checkcode(
        self,
        request: propertychain_models.CreateCheckcodeRequest,
    ) -> propertychain_models.CreateCheckcodeResponse:
        """
        Description: 创建验权码
        Summary: 创建验权码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_checkcode_ex(request, headers, runtime)

    async def create_checkcode_async(
        self,
        request: propertychain_models.CreateCheckcodeRequest,
    ) -> propertychain_models.CreateCheckcodeResponse:
        """
        Description: 创建验权码
        Summary: 创建验权码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_checkcode_ex_async(request, headers, runtime)

    def create_checkcode_ex(
        self,
        request: propertychain_models.CreateCheckcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateCheckcodeResponse:
        """
        Description: 创建验权码
        Summary: 创建验权码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateCheckcodeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.checkcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_checkcode_ex_async(
        self,
        request: propertychain_models.CreateCheckcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateCheckcodeResponse:
        """
        Description: 创建验权码
        Summary: 创建验权码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateCheckcodeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.checkcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_checkcode(
        self,
        request: propertychain_models.CheckCheckcodeRequest,
    ) -> propertychain_models.CheckCheckcodeResponse:
        """
        Description: 校验验权码
        Summary: 校验验权码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_checkcode_ex(request, headers, runtime)

    async def check_checkcode_async(
        self,
        request: propertychain_models.CheckCheckcodeRequest,
    ) -> propertychain_models.CheckCheckcodeResponse:
        """
        Description: 校验验权码
        Summary: 校验验权码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_checkcode_ex_async(request, headers, runtime)

    def check_checkcode_ex(
        self,
        request: propertychain_models.CheckCheckcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CheckCheckcodeResponse:
        """
        Description: 校验验权码
        Summary: 校验验权码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CheckCheckcodeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.checkcode.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_checkcode_ex_async(
        self,
        request: propertychain_models.CheckCheckcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CheckCheckcodeResponse:
        """
        Description: 校验验权码
        Summary: 校验验权码
        """
        UtilClient.validate_model(request)
        return propertychain_models.CheckCheckcodeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.checkcode.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_assetpledge(
        self,
        request: propertychain_models.CreateAssetpledgeRequest,
    ) -> propertychain_models.CreateAssetpledgeResponse:
        """
        Description: 创建质押申请
        Summary: 创建质押申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_assetpledge_ex(request, headers, runtime)

    async def create_assetpledge_async(
        self,
        request: propertychain_models.CreateAssetpledgeRequest,
    ) -> propertychain_models.CreateAssetpledgeResponse:
        """
        Description: 创建质押申请
        Summary: 创建质押申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_assetpledge_ex_async(request, headers, runtime)

    def create_assetpledge_ex(
        self,
        request: propertychain_models.CreateAssetpledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateAssetpledgeResponse:
        """
        Description: 创建质押申请
        Summary: 创建质押申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateAssetpledgeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assetpledge.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_assetpledge_ex_async(
        self,
        request: propertychain_models.CreateAssetpledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateAssetpledgeResponse:
        """
        Description: 创建质押申请
        Summary: 创建质押申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateAssetpledgeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assetpledge.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def release_assetpledge(
        self,
        request: propertychain_models.ReleaseAssetpledgeRequest,
    ) -> propertychain_models.ReleaseAssetpledgeResponse:
        """
        Description: 质押放款
        Summary: 质押放款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.release_assetpledge_ex(request, headers, runtime)

    async def release_assetpledge_async(
        self,
        request: propertychain_models.ReleaseAssetpledgeRequest,
    ) -> propertychain_models.ReleaseAssetpledgeResponse:
        """
        Description: 质押放款
        Summary: 质押放款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.release_assetpledge_ex_async(request, headers, runtime)

    def release_assetpledge_ex(
        self,
        request: propertychain_models.ReleaseAssetpledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ReleaseAssetpledgeResponse:
        """
        Description: 质押放款
        Summary: 质押放款
        """
        UtilClient.validate_model(request)
        return propertychain_models.ReleaseAssetpledgeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assetpledge.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def release_assetpledge_ex_async(
        self,
        request: propertychain_models.ReleaseAssetpledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ReleaseAssetpledgeResponse:
        """
        Description: 质押放款
        Summary: 质押放款
        """
        UtilClient.validate_model(request)
        return propertychain_models.ReleaseAssetpledgeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assetpledge.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_assetpledge(
        self,
        request: propertychain_models.RepayAssetpledgeRequest,
    ) -> propertychain_models.RepayAssetpledgeResponse:
        """
        Description: 质押还款
        Summary: 质押还款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_assetpledge_ex(request, headers, runtime)

    async def repay_assetpledge_async(
        self,
        request: propertychain_models.RepayAssetpledgeRequest,
    ) -> propertychain_models.RepayAssetpledgeResponse:
        """
        Description: 质押还款
        Summary: 质押还款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_assetpledge_ex_async(request, headers, runtime)

    def repay_assetpledge_ex(
        self,
        request: propertychain_models.RepayAssetpledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.RepayAssetpledgeResponse:
        """
        Description: 质押还款
        Summary: 质押还款
        """
        UtilClient.validate_model(request)
        return propertychain_models.RepayAssetpledgeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assetpledge.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_assetpledge_ex_async(
        self,
        request: propertychain_models.RepayAssetpledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.RepayAssetpledgeResponse:
        """
        Description: 质押还款
        Summary: 质押还款
        """
        UtilClient.validate_model(request)
        return propertychain_models.RepayAssetpledgeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assetpledge.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_league_accountinfo(
        self,
        request: propertychain_models.GetLeagueAccountinfoRequest,
    ) -> propertychain_models.GetLeagueAccountinfoResponse:
        """
        Description: 查询账户信息
        Summary: 查询账户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_league_accountinfo_ex(request, headers, runtime)

    async def get_league_accountinfo_async(
        self,
        request: propertychain_models.GetLeagueAccountinfoRequest,
    ) -> propertychain_models.GetLeagueAccountinfoResponse:
        """
        Description: 查询账户信息
        Summary: 查询账户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_league_accountinfo_ex_async(request, headers, runtime)

    def get_league_accountinfo_ex(
        self,
        request: propertychain_models.GetLeagueAccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetLeagueAccountinfoResponse:
        """
        Description: 查询账户信息
        Summary: 查询账户信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetLeagueAccountinfoResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.accountinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_league_accountinfo_ex_async(
        self,
        request: propertychain_models.GetLeagueAccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetLeagueAccountinfoResponse:
        """
        Description: 查询账户信息
        Summary: 查询账户信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetLeagueAccountinfoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.accountinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_warehouse(
        self,
        request: propertychain_models.CreateWarehouseRequest,
    ) -> propertychain_models.CreateWarehouseResponse:
        """
        Description: 登记仓库
        Summary: 登记仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_warehouse_ex(request, headers, runtime)

    async def create_warehouse_async(
        self,
        request: propertychain_models.CreateWarehouseRequest,
    ) -> propertychain_models.CreateWarehouseResponse:
        """
        Description: 登记仓库
        Summary: 登记仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_warehouse_ex_async(request, headers, runtime)

    def create_warehouse_ex(
        self,
        request: propertychain_models.CreateWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateWarehouseResponse:
        """
        Description: 登记仓库
        Summary: 登记仓库
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateWarehouseResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_warehouse_ex_async(
        self,
        request: propertychain_models.CreateWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateWarehouseResponse:
        """
        Description: 登记仓库
        Summary: 登记仓库
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateWarehouseResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_league_role(
        self,
        request: propertychain_models.ListLeagueRoleRequest,
    ) -> propertychain_models.ListLeagueRoleResponse:
        """
        Description: 例举角色类型
        Summary: 例举角色类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_league_role_ex(request, headers, runtime)

    async def list_league_role_async(
        self,
        request: propertychain_models.ListLeagueRoleRequest,
    ) -> propertychain_models.ListLeagueRoleResponse:
        """
        Description: 例举角色类型
        Summary: 例举角色类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_league_role_ex_async(request, headers, runtime)

    def list_league_role_ex(
        self,
        request: propertychain_models.ListLeagueRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListLeagueRoleResponse:
        """
        Description: 例举角色类型
        Summary: 例举角色类型
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListLeagueRoleResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.role.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_league_role_ex_async(
        self,
        request: propertychain_models.ListLeagueRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListLeagueRoleResponse:
        """
        Description: 例举角色类型
        Summary: 例举角色类型
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListLeagueRoleResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.role.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_warehouse(
        self,
        request: propertychain_models.GetWarehouseRequest,
    ) -> propertychain_models.GetWarehouseResponse:
        """
        Description: 查询仓库详细信息
        Summary: 查询仓库详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_warehouse_ex(request, headers, runtime)

    async def get_warehouse_async(
        self,
        request: propertychain_models.GetWarehouseRequest,
    ) -> propertychain_models.GetWarehouseResponse:
        """
        Description: 查询仓库详细信息
        Summary: 查询仓库详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_warehouse_ex_async(request, headers, runtime)

    def get_warehouse_ex(
        self,
        request: propertychain_models.GetWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetWarehouseResponse:
        """
        Description: 查询仓库详细信息
        Summary: 查询仓库详细信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetWarehouseResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_warehouse_ex_async(
        self,
        request: propertychain_models.GetWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetWarehouseResponse:
        """
        Description: 查询仓库详细信息
        Summary: 查询仓库详细信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetWarehouseResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_warehouse(
        self,
        request: propertychain_models.UpdateWarehouseRequest,
    ) -> propertychain_models.UpdateWarehouseResponse:
        """
        Description: 更新库存信息
        Summary: 更新库存信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_warehouse_ex(request, headers, runtime)

    async def update_warehouse_async(
        self,
        request: propertychain_models.UpdateWarehouseRequest,
    ) -> propertychain_models.UpdateWarehouseResponse:
        """
        Description: 更新库存信息
        Summary: 更新库存信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_warehouse_ex_async(request, headers, runtime)

    def update_warehouse_ex(
        self,
        request: propertychain_models.UpdateWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateWarehouseResponse:
        """
        Description: 更新库存信息
        Summary: 更新库存信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateWarehouseResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_warehouse_ex_async(
        self,
        request: propertychain_models.UpdateWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateWarehouseResponse:
        """
        Description: 更新库存信息
        Summary: 更新库存信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateWarehouseResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_warehouse(
        self,
        request: propertychain_models.ListWarehouseRequest,
    ) -> propertychain_models.ListWarehouseResponse:
        """
        Description: 列举用户仓库列表
        Summary: 列举用户仓库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_warehouse_ex(request, headers, runtime)

    async def list_warehouse_async(
        self,
        request: propertychain_models.ListWarehouseRequest,
    ) -> propertychain_models.ListWarehouseResponse:
        """
        Description: 列举用户仓库列表
        Summary: 列举用户仓库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_warehouse_ex_async(request, headers, runtime)

    def list_warehouse_ex(
        self,
        request: propertychain_models.ListWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListWarehouseResponse:
        """
        Description: 列举用户仓库列表
        Summary: 列举用户仓库列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListWarehouseResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_warehouse_ex_async(
        self,
        request: propertychain_models.ListWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListWarehouseResponse:
        """
        Description: 列举用户仓库列表
        Summary: 列举用户仓库列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListWarehouseResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_league(
        self,
        request: propertychain_models.ListLeagueRequest,
    ) -> propertychain_models.ListLeagueResponse:
        """
        Description: 例举联盟
        Summary: 例举联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_league_ex(request, headers, runtime)

    async def list_league_async(
        self,
        request: propertychain_models.ListLeagueRequest,
    ) -> propertychain_models.ListLeagueResponse:
        """
        Description: 例举联盟
        Summary: 例举联盟
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_league_ex_async(request, headers, runtime)

    def list_league_ex(
        self,
        request: propertychain_models.ListLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListLeagueResponse:
        """
        Description: 例举联盟
        Summary: 例举联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListLeagueResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_league_ex_async(
        self,
        request: propertychain_models.ListLeagueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListLeagueResponse:
        """
        Description: 例举联盟
        Summary: 例举联盟
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListLeagueResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_warehouse_device(
        self,
        request: propertychain_models.QueryWarehouseDeviceRequest,
    ) -> propertychain_models.QueryWarehouseDeviceResponse:
        """
        Description: 列举某个仓库/仓位下的设备信息
        Summary: 列举某个仓库/仓位下的设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_warehouse_device_ex(request, headers, runtime)

    async def query_warehouse_device_async(
        self,
        request: propertychain_models.QueryWarehouseDeviceRequest,
    ) -> propertychain_models.QueryWarehouseDeviceResponse:
        """
        Description: 列举某个仓库/仓位下的设备信息
        Summary: 列举某个仓库/仓位下的设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_warehouse_device_ex_async(request, headers, runtime)

    def query_warehouse_device_ex(
        self,
        request: propertychain_models.QueryWarehouseDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryWarehouseDeviceResponse:
        """
        Description: 列举某个仓库/仓位下的设备信息
        Summary: 列举某个仓库/仓位下的设备信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryWarehouseDeviceResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.device.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_warehouse_device_ex_async(
        self,
        request: propertychain_models.QueryWarehouseDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryWarehouseDeviceResponse:
        """
        Description: 列举某个仓库/仓位下的设备信息
        Summary: 列举某个仓库/仓位下的设备信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryWarehouseDeviceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.device.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_league_apply(
        self,
        request: propertychain_models.CreateLeagueApplyRequest,
    ) -> propertychain_models.CreateLeagueApplyResponse:
        """
        Description: 创建联盟申请
        Summary: 创建联盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_league_apply_ex(request, headers, runtime)

    async def create_league_apply_async(
        self,
        request: propertychain_models.CreateLeagueApplyRequest,
    ) -> propertychain_models.CreateLeagueApplyResponse:
        """
        Description: 创建联盟申请
        Summary: 创建联盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_league_apply_ex_async(request, headers, runtime)

    def create_league_apply_ex(
        self,
        request: propertychain_models.CreateLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateLeagueApplyResponse:
        """
        Description: 创建联盟申请
        Summary: 创建联盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateLeagueApplyResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.apply.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_league_apply_ex_async(
        self,
        request: propertychain_models.CreateLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateLeagueApplyResponse:
        """
        Description: 创建联盟申请
        Summary: 创建联盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateLeagueApplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.apply.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_league_joinapply(
        self,
        request: propertychain_models.CreateLeagueJoinapplyRequest,
    ) -> propertychain_models.CreateLeagueJoinapplyResponse:
        """
        Description: 提交入盟申请
        Summary: 提交入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_league_joinapply_ex(request, headers, runtime)

    async def create_league_joinapply_async(
        self,
        request: propertychain_models.CreateLeagueJoinapplyRequest,
    ) -> propertychain_models.CreateLeagueJoinapplyResponse:
        """
        Description: 提交入盟申请
        Summary: 提交入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_league_joinapply_ex_async(request, headers, runtime)

    def create_league_joinapply_ex(
        self,
        request: propertychain_models.CreateLeagueJoinapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateLeagueJoinapplyResponse:
        """
        Description: 提交入盟申请
        Summary: 提交入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateLeagueJoinapplyResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.joinapply.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_league_joinapply_ex_async(
        self,
        request: propertychain_models.CreateLeagueJoinapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateLeagueJoinapplyResponse:
        """
        Description: 提交入盟申请
        Summary: 提交入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateLeagueJoinapplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.joinapply.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_league_apply(
        self,
        request: propertychain_models.CancelLeagueApplyRequest,
    ) -> propertychain_models.CancelLeagueApplyResponse:
        """
        Description: 撤销入盟申请
        Summary: 撤销入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_league_apply_ex(request, headers, runtime)

    async def cancel_league_apply_async(
        self,
        request: propertychain_models.CancelLeagueApplyRequest,
    ) -> propertychain_models.CancelLeagueApplyResponse:
        """
        Description: 撤销入盟申请
        Summary: 撤销入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_league_apply_ex_async(request, headers, runtime)

    def cancel_league_apply_ex(
        self,
        request: propertychain_models.CancelLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelLeagueApplyResponse:
        """
        Description: 撤销入盟申请
        Summary: 撤销入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelLeagueApplyResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.apply.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_league_apply_ex_async(
        self,
        request: propertychain_models.CancelLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelLeagueApplyResponse:
        """
        Description: 撤销入盟申请
        Summary: 撤销入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelLeagueApplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.apply.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_warehouse_storagelocation(
        self,
        request: propertychain_models.QueryWarehouseStoragelocationRequest,
    ) -> propertychain_models.QueryWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下的库位列表
        Summary: 列举仓库下的库位列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_warehouse_storagelocation_ex(request, headers, runtime)

    async def query_warehouse_storagelocation_async(
        self,
        request: propertychain_models.QueryWarehouseStoragelocationRequest,
    ) -> propertychain_models.QueryWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下的库位列表
        Summary: 列举仓库下的库位列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_warehouse_storagelocation_ex_async(request, headers, runtime)

    def query_warehouse_storagelocation_ex(
        self,
        request: propertychain_models.QueryWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下的库位列表
        Summary: 列举仓库下的库位列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryWarehouseStoragelocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storagelocation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_warehouse_storagelocation_ex_async(
        self,
        request: propertychain_models.QueryWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下的库位列表
        Summary: 列举仓库下的库位列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryWarehouseStoragelocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storagelocation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_league_apply(
        self,
        request: propertychain_models.AuthLeagueApplyRequest,
    ) -> propertychain_models.AuthLeagueApplyResponse:
        """
        Description: 盟主审核入盟申请
        Summary: 盟主审核入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_league_apply_ex(request, headers, runtime)

    async def auth_league_apply_async(
        self,
        request: propertychain_models.AuthLeagueApplyRequest,
    ) -> propertychain_models.AuthLeagueApplyResponse:
        """
        Description: 盟主审核入盟申请
        Summary: 盟主审核入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_league_apply_ex_async(request, headers, runtime)

    def auth_league_apply_ex(
        self,
        request: propertychain_models.AuthLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AuthLeagueApplyResponse:
        """
        Description: 盟主审核入盟申请
        Summary: 盟主审核入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.AuthLeagueApplyResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.apply.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_league_apply_ex_async(
        self,
        request: propertychain_models.AuthLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.AuthLeagueApplyResponse:
        """
        Description: 盟主审核入盟申请
        Summary: 盟主审核入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.AuthLeagueApplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.apply.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_warehouse(
        self,
        request: propertychain_models.DeleteWarehouseRequest,
    ) -> propertychain_models.DeleteWarehouseResponse:
        """
        Description: 删除仓库
        Summary: 删除仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_warehouse_ex(request, headers, runtime)

    async def delete_warehouse_async(
        self,
        request: propertychain_models.DeleteWarehouseRequest,
    ) -> propertychain_models.DeleteWarehouseResponse:
        """
        Description: 删除仓库
        Summary: 删除仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_warehouse_ex_async(request, headers, runtime)

    def delete_warehouse_ex(
        self,
        request: propertychain_models.DeleteWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DeleteWarehouseResponse:
        """
        Description: 删除仓库
        Summary: 删除仓库
        """
        UtilClient.validate_model(request)
        return propertychain_models.DeleteWarehouseResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_warehouse_ex_async(
        self,
        request: propertychain_models.DeleteWarehouseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DeleteWarehouseResponse:
        """
        Description: 删除仓库
        Summary: 删除仓库
        """
        UtilClient.validate_model(request)
        return propertychain_models.DeleteWarehouseResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_league_apply(
        self,
        request: propertychain_models.ListLeagueApplyRequest,
    ) -> propertychain_models.ListLeagueApplyResponse:
        """
        Description: 例举入盟申请
        Summary: 例举入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_league_apply_ex(request, headers, runtime)

    async def list_league_apply_async(
        self,
        request: propertychain_models.ListLeagueApplyRequest,
    ) -> propertychain_models.ListLeagueApplyResponse:
        """
        Description: 例举入盟申请
        Summary: 例举入盟申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_league_apply_ex_async(request, headers, runtime)

    def list_league_apply_ex(
        self,
        request: propertychain_models.ListLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListLeagueApplyResponse:
        """
        Description: 例举入盟申请
        Summary: 例举入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListLeagueApplyResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.league.apply.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_league_apply_ex_async(
        self,
        request: propertychain_models.ListLeagueApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListLeagueApplyResponse:
        """
        Description: 例举入盟申请
        Summary: 例举入盟申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListLeagueApplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.league.apply.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_warehouse_storaglocation(
        self,
        request: propertychain_models.CreateWarehouseStoraglocationRequest,
    ) -> propertychain_models.CreateWarehouseStoraglocationResponse:
        """
        Description: 登记库位信息
        Summary: 登记库位信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_warehouse_storaglocation_ex(request, headers, runtime)

    async def create_warehouse_storaglocation_async(
        self,
        request: propertychain_models.CreateWarehouseStoraglocationRequest,
    ) -> propertychain_models.CreateWarehouseStoraglocationResponse:
        """
        Description: 登记库位信息
        Summary: 登记库位信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_warehouse_storaglocation_ex_async(request, headers, runtime)

    def create_warehouse_storaglocation_ex(
        self,
        request: propertychain_models.CreateWarehouseStoraglocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateWarehouseStoraglocationResponse:
        """
        Description: 登记库位信息
        Summary: 登记库位信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateWarehouseStoraglocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storaglocation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_warehouse_storaglocation_ex_async(
        self,
        request: propertychain_models.CreateWarehouseStoraglocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateWarehouseStoraglocationResponse:
        """
        Description: 登记库位信息
        Summary: 登记库位信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateWarehouseStoraglocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storaglocation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_warehouse_storagelocation(
        self,
        request: propertychain_models.GetWarehouseStoragelocationRequest,
    ) -> propertychain_models.GetWarehouseStoragelocationResponse:
        """
        Description: 查询库位详细信息
        Summary: 查询库位详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_warehouse_storagelocation_ex(request, headers, runtime)

    async def get_warehouse_storagelocation_async(
        self,
        request: propertychain_models.GetWarehouseStoragelocationRequest,
    ) -> propertychain_models.GetWarehouseStoragelocationResponse:
        """
        Description: 查询库位详细信息
        Summary: 查询库位详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_warehouse_storagelocation_ex_async(request, headers, runtime)

    def get_warehouse_storagelocation_ex(
        self,
        request: propertychain_models.GetWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetWarehouseStoragelocationResponse:
        """
        Description: 查询库位详细信息
        Summary: 查询库位详细信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetWarehouseStoragelocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storagelocation.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_warehouse_storagelocation_ex_async(
        self,
        request: propertychain_models.GetWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetWarehouseStoragelocationResponse:
        """
        Description: 查询库位详细信息
        Summary: 查询库位详细信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetWarehouseStoragelocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storagelocation.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_warehouse_storagelocation(
        self,
        request: propertychain_models.UpdateWarehouseStoragelocationRequest,
    ) -> propertychain_models.UpdateWarehouseStoragelocationResponse:
        """
        Description:  更新库位信息
        Summary:  更新库位信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_warehouse_storagelocation_ex(request, headers, runtime)

    async def update_warehouse_storagelocation_async(
        self,
        request: propertychain_models.UpdateWarehouseStoragelocationRequest,
    ) -> propertychain_models.UpdateWarehouseStoragelocationResponse:
        """
        Description:  更新库位信息
        Summary:  更新库位信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_warehouse_storagelocation_ex_async(request, headers, runtime)

    def update_warehouse_storagelocation_ex(
        self,
        request: propertychain_models.UpdateWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateWarehouseStoragelocationResponse:
        """
        Description:  更新库位信息
        Summary:  更新库位信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateWarehouseStoragelocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storagelocation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_warehouse_storagelocation_ex_async(
        self,
        request: propertychain_models.UpdateWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateWarehouseStoragelocationResponse:
        """
        Description:  更新库位信息
        Summary:  更新库位信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateWarehouseStoragelocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storagelocation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_warehouse_storagelocation(
        self,
        request: propertychain_models.BatchqueryWarehouseStoragelocationRequest,
    ) -> propertychain_models.BatchqueryWarehouseStoragelocationResponse:
        """
        Description: 列举用户库位列表
        Summary: 列举用户库位列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_warehouse_storagelocation_ex(request, headers, runtime)

    async def batchquery_warehouse_storagelocation_async(
        self,
        request: propertychain_models.BatchqueryWarehouseStoragelocationRequest,
    ) -> propertychain_models.BatchqueryWarehouseStoragelocationResponse:
        """
        Description: 列举用户库位列表
        Summary: 列举用户库位列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_warehouse_storagelocation_ex_async(request, headers, runtime)

    def batchquery_warehouse_storagelocation_ex(
        self,
        request: propertychain_models.BatchqueryWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchqueryWarehouseStoragelocationResponse:
        """
        Description: 列举用户库位列表
        Summary: 列举用户库位列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchqueryWarehouseStoragelocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storagelocation.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_warehouse_storagelocation_ex_async(
        self,
        request: propertychain_models.BatchqueryWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchqueryWarehouseStoragelocationResponse:
        """
        Description: 列举用户库位列表
        Summary: 列举用户库位列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchqueryWarehouseStoragelocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storagelocation.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_warehouse_storagelocation(
        self,
        request: propertychain_models.ListWarehouseStoragelocationRequest,
    ) -> propertychain_models.ListWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下某状态的库位列表
        Summary: 列举仓库下某状态的库位列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_warehouse_storagelocation_ex(request, headers, runtime)

    async def list_warehouse_storagelocation_async(
        self,
        request: propertychain_models.ListWarehouseStoragelocationRequest,
    ) -> propertychain_models.ListWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下某状态的库位列表
        Summary: 列举仓库下某状态的库位列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_warehouse_storagelocation_ex_async(request, headers, runtime)

    def list_warehouse_storagelocation_ex(
        self,
        request: propertychain_models.ListWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下某状态的库位列表
        Summary: 列举仓库下某状态的库位列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListWarehouseStoragelocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storagelocation.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_warehouse_storagelocation_ex_async(
        self,
        request: propertychain_models.ListWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListWarehouseStoragelocationResponse:
        """
        Description: 列举仓库下某状态的库位列表
        Summary: 列举仓库下某状态的库位列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListWarehouseStoragelocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storagelocation.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_warehouse_storagelocation(
        self,
        request: propertychain_models.DeleteWarehouseStoragelocationRequest,
    ) -> propertychain_models.DeleteWarehouseStoragelocationResponse:
        """
        Description: 删除库位
        Summary: 删除库位
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_warehouse_storagelocation_ex(request, headers, runtime)

    async def delete_warehouse_storagelocation_async(
        self,
        request: propertychain_models.DeleteWarehouseStoragelocationRequest,
    ) -> propertychain_models.DeleteWarehouseStoragelocationResponse:
        """
        Description: 删除库位
        Summary: 删除库位
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_warehouse_storagelocation_ex_async(request, headers, runtime)

    def delete_warehouse_storagelocation_ex(
        self,
        request: propertychain_models.DeleteWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DeleteWarehouseStoragelocationResponse:
        """
        Description: 删除库位
        Summary: 删除库位
        """
        UtilClient.validate_model(request)
        return propertychain_models.DeleteWarehouseStoragelocationResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.warehouse.storagelocation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_warehouse_storagelocation_ex_async(
        self,
        request: propertychain_models.DeleteWarehouseStoragelocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DeleteWarehouseStoragelocationResponse:
        """
        Description: 删除库位
        Summary: 删除库位
        """
        UtilClient.validate_model(request)
        return propertychain_models.DeleteWarehouseStoragelocationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.warehouse.storagelocation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_assettemplate(
        self,
        request: propertychain_models.CreateAssettemplateRequest,
    ) -> propertychain_models.CreateAssettemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_assettemplate_ex(request, headers, runtime)

    async def create_assettemplate_async(
        self,
        request: propertychain_models.CreateAssettemplateRequest,
    ) -> propertychain_models.CreateAssettemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_assettemplate_ex_async(request, headers, runtime)

    def create_assettemplate_ex(
        self,
        request: propertychain_models.CreateAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateAssettemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateAssettemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assettemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_assettemplate_ex_async(
        self,
        request: propertychain_models.CreateAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateAssettemplateResponse:
        """
        Description: 创建数据字典
        Summary: 创建数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateAssettemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assettemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_assettemplate(
        self,
        request: propertychain_models.UpdateAssettemplateRequest,
    ) -> propertychain_models.UpdateAssettemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_assettemplate_ex(request, headers, runtime)

    async def update_assettemplate_async(
        self,
        request: propertychain_models.UpdateAssettemplateRequest,
    ) -> propertychain_models.UpdateAssettemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_assettemplate_ex_async(request, headers, runtime)

    def update_assettemplate_ex(
        self,
        request: propertychain_models.UpdateAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateAssettemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateAssettemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assettemplate.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_assettemplate_ex_async(
        self,
        request: propertychain_models.UpdateAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateAssettemplateResponse:
        """
        Description: 更新数据字典
        Summary: 更新数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateAssettemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assettemplate.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_assettemplate(
        self,
        request: propertychain_models.GetAssettemplateRequest,
    ) -> propertychain_models.GetAssettemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_assettemplate_ex(request, headers, runtime)

    async def get_assettemplate_async(
        self,
        request: propertychain_models.GetAssettemplateRequest,
    ) -> propertychain_models.GetAssettemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_assettemplate_ex_async(request, headers, runtime)

    def get_assettemplate_ex(
        self,
        request: propertychain_models.GetAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetAssettemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetAssettemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assettemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_assettemplate_ex_async(
        self,
        request: propertychain_models.GetAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetAssettemplateResponse:
        """
        Description: 查询数据字典
        Summary: 查询数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetAssettemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assettemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_assettemplate(
        self,
        request: propertychain_models.ListAssettemplateRequest,
    ) -> propertychain_models.ListAssettemplateResponse:
        """
        Description: 列举数据字典
        Summary: 列举数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_assettemplate_ex(request, headers, runtime)

    async def list_assettemplate_async(
        self,
        request: propertychain_models.ListAssettemplateRequest,
    ) -> propertychain_models.ListAssettemplateResponse:
        """
        Description: 列举数据字典
        Summary: 列举数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_assettemplate_ex_async(request, headers, runtime)

    def list_assettemplate_ex(
        self,
        request: propertychain_models.ListAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListAssettemplateResponse:
        """
        Description: 列举数据字典
        Summary: 列举数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListAssettemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assettemplate.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_assettemplate_ex_async(
        self,
        request: propertychain_models.ListAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListAssettemplateResponse:
        """
        Description: 列举数据字典
        Summary: 列举数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListAssettemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assettemplate.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_assettemplate(
        self,
        request: propertychain_models.DeleteAssettemplateRequest,
    ) -> propertychain_models.DeleteAssettemplateResponse:
        """
        Description: 删除数据字典
        Summary: 删除数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_assettemplate_ex(request, headers, runtime)

    async def delete_assettemplate_async(
        self,
        request: propertychain_models.DeleteAssettemplateRequest,
    ) -> propertychain_models.DeleteAssettemplateResponse:
        """
        Description: 删除数据字典
        Summary: 删除数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_assettemplate_ex_async(request, headers, runtime)

    def delete_assettemplate_ex(
        self,
        request: propertychain_models.DeleteAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DeleteAssettemplateResponse:
        """
        Description: 删除数据字典
        Summary: 删除数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.DeleteAssettemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assettemplate.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_assettemplate_ex_async(
        self,
        request: propertychain_models.DeleteAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DeleteAssettemplateResponse:
        """
        Description: 删除数据字典
        Summary: 删除数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.DeleteAssettemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assettemplate.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_assettemplate(
        self,
        request: propertychain_models.EnableAssettemplateRequest,
    ) -> propertychain_models.EnableAssettemplateResponse:
        """
        Description: 生效/失效数据字典
        Summary: 生效/失效数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_assettemplate_ex(request, headers, runtime)

    async def enable_assettemplate_async(
        self,
        request: propertychain_models.EnableAssettemplateRequest,
    ) -> propertychain_models.EnableAssettemplateResponse:
        """
        Description: 生效/失效数据字典
        Summary: 生效/失效数据字典
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_assettemplate_ex_async(request, headers, runtime)

    def enable_assettemplate_ex(
        self,
        request: propertychain_models.EnableAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.EnableAssettemplateResponse:
        """
        Description: 生效/失效数据字典
        Summary: 生效/失效数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.EnableAssettemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.assettemplate.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_assettemplate_ex_async(
        self,
        request: propertychain_models.EnableAssettemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.EnableAssettemplateResponse:
        """
        Description: 生效/失效数据字典
        Summary: 生效/失效数据字典
        """
        UtilClient.validate_model(request)
        return propertychain_models.EnableAssettemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.assettemplate.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_document_file(
        self,
        request: propertychain_models.UpdateDocumentFileRequest,
    ) -> propertychain_models.UpdateDocumentFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_document_file_ex(request, headers, runtime)

    async def update_document_file_async(
        self,
        request: propertychain_models.UpdateDocumentFileRequest,
    ) -> propertychain_models.UpdateDocumentFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_document_file_ex_async(request, headers, runtime)

    def update_document_file_ex(
        self,
        request: propertychain_models.UpdateDocumentFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateDocumentFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateDocumentFileResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.document.file.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_document_file_ex_async(
        self,
        request: propertychain_models.UpdateDocumentFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateDocumentFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateDocumentFileResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.document.file.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_document_file(
        self,
        request: propertychain_models.GetDocumentFileRequest,
    ) -> propertychain_models.GetDocumentFileResponse:
        """
        Description: 根据文件id查找文件
        Summary: 根据文件id查找文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_document_file_ex(request, headers, runtime)

    async def get_document_file_async(
        self,
        request: propertychain_models.GetDocumentFileRequest,
    ) -> propertychain_models.GetDocumentFileResponse:
        """
        Description: 根据文件id查找文件
        Summary: 根据文件id查找文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_document_file_ex_async(request, headers, runtime)

    def get_document_file_ex(
        self,
        request: propertychain_models.GetDocumentFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetDocumentFileResponse:
        """
        Description: 根据文件id查找文件
        Summary: 根据文件id查找文件
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetDocumentFileResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.document.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_document_file_ex_async(
        self,
        request: propertychain_models.GetDocumentFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.GetDocumentFileResponse:
        """
        Description: 根据文件id查找文件
        Summary: 根据文件id查找文件
        """
        UtilClient.validate_model(request)
        return propertychain_models.GetDocumentFileResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.document.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_user(
        self,
        request: propertychain_models.CancelUserRequest,
    ) -> propertychain_models.CancelUserResponse:
        """
        Description: 用户注销
        Summary: 用户注销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_user_ex(request, headers, runtime)

    async def cancel_user_async(
        self,
        request: propertychain_models.CancelUserRequest,
    ) -> propertychain_models.CancelUserResponse:
        """
        Description: 用户注销
        Summary: 用户注销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_user_ex_async(request, headers, runtime)

    def cancel_user_ex(
        self,
        request: propertychain_models.CancelUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelUserResponse:
        """
        Description: 用户注销
        Summary: 用户注销
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelUserResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.user.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_user_ex_async(
        self,
        request: propertychain_models.CancelUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelUserResponse:
        """
        Description: 用户注销
        Summary: 用户注销
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.user.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_user(
        self,
        request: propertychain_models.UpdateUserRequest,
    ) -> propertychain_models.UpdateUserResponse:
        """
        Description: 更新用户信息
        Summary: 更新用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_user_ex(request, headers, runtime)

    async def update_user_async(
        self,
        request: propertychain_models.UpdateUserRequest,
    ) -> propertychain_models.UpdateUserResponse:
        """
        Description: 更新用户信息
        Summary: 更新用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_user_ex_async(request, headers, runtime)

    def update_user_ex(
        self,
        request: propertychain_models.UpdateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateUserResponse:
        """
        Description: 更新用户信息
        Summary: 更新用户信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateUserResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_user_ex_async(
        self,
        request: propertychain_models.UpdateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.UpdateUserResponse:
        """
        Description: 更新用户信息
        Summary: 更新用户信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.UpdateUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_user(
        self,
        request: propertychain_models.ListUserRequest,
    ) -> propertychain_models.ListUserResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_user_ex(request, headers, runtime)

    async def list_user_async(
        self,
        request: propertychain_models.ListUserRequest,
    ) -> propertychain_models.ListUserResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_user_ex_async(request, headers, runtime)

    def list_user_ex(
        self,
        request: propertychain_models.ListUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListUserResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListUserResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.user.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_user_ex_async(
        self,
        request: propertychain_models.ListUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListUserResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.user.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_user(
        self,
        request: propertychain_models.MountUserRequest,
    ) -> propertychain_models.MountUserResponse:
        """
        Description: 映射用户信息
        Summary: 映射用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_user_ex(request, headers, runtime)

    async def mount_user_async(
        self,
        request: propertychain_models.MountUserRequest,
    ) -> propertychain_models.MountUserResponse:
        """
        Description: 映射用户信息
        Summary: 映射用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_user_ex_async(request, headers, runtime)

    def mount_user_ex(
        self,
        request: propertychain_models.MountUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.MountUserResponse:
        """
        Description: 映射用户信息
        Summary: 映射用户信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.MountUserResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.user.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_user_ex_async(
        self,
        request: propertychain_models.MountUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.MountUserResponse:
        """
        Description: 映射用户信息
        Summary: 映射用户信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.MountUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.user.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_importasset(
        self,
        request: propertychain_models.BatchcreateImportassetRequest,
    ) -> propertychain_models.BatchcreateImportassetResponse:
        """
        Description: 批量创建物权
        Summary: 批量创建物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_importasset_ex(request, headers, runtime)

    async def batchcreate_importasset_async(
        self,
        request: propertychain_models.BatchcreateImportassetRequest,
    ) -> propertychain_models.BatchcreateImportassetResponse:
        """
        Description: 批量创建物权
        Summary: 批量创建物权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_importasset_ex_async(request, headers, runtime)

    def batchcreate_importasset_ex(
        self,
        request: propertychain_models.BatchcreateImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchcreateImportassetResponse:
        """
        Description: 批量创建物权
        Summary: 批量创建物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchcreateImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_importasset_ex_async(
        self,
        request: propertychain_models.BatchcreateImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchcreateImportassetResponse:
        """
        Description: 批量创建物权
        Summary: 批量创建物权
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchcreateImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_importasset(
        self,
        request: propertychain_models.DescribeImportassetRequest,
    ) -> propertychain_models.DescribeImportassetResponse:
        """
        Description: 添加物权描述信息
        Summary: 添加物权描述信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_importasset_ex(request, headers, runtime)

    async def describe_importasset_async(
        self,
        request: propertychain_models.DescribeImportassetRequest,
    ) -> propertychain_models.DescribeImportassetResponse:
        """
        Description: 添加物权描述信息
        Summary: 添加物权描述信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_importasset_ex_async(request, headers, runtime)

    def describe_importasset_ex(
        self,
        request: propertychain_models.DescribeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DescribeImportassetResponse:
        """
        Description: 添加物权描述信息
        Summary: 添加物权描述信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.DescribeImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_importasset_ex_async(
        self,
        request: propertychain_models.DescribeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.DescribeImportassetResponse:
        """
        Description: 添加物权描述信息
        Summary: 添加物权描述信息
        """
        UtilClient.validate_model(request)
        return propertychain_models.DescribeImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchfreeze_importasset(
        self,
        request: propertychain_models.BatchfreezeImportassetRequest,
    ) -> propertychain_models.BatchfreezeImportassetResponse:
        """
        Description: 批量冻结
        Summary: 批量冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchfreeze_importasset_ex(request, headers, runtime)

    async def batchfreeze_importasset_async(
        self,
        request: propertychain_models.BatchfreezeImportassetRequest,
    ) -> propertychain_models.BatchfreezeImportassetResponse:
        """
        Description: 批量冻结
        Summary: 批量冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchfreeze_importasset_ex_async(request, headers, runtime)

    def batchfreeze_importasset_ex(
        self,
        request: propertychain_models.BatchfreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchfreezeImportassetResponse:
        """
        Description: 批量冻结
        Summary: 批量冻结
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchfreezeImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.batchfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchfreeze_importasset_ex_async(
        self,
        request: propertychain_models.BatchfreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchfreezeImportassetResponse:
        """
        Description: 批量冻结
        Summary: 批量冻结
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchfreezeImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.batchfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchunfreeze_importasset(
        self,
        request: propertychain_models.BatchunfreezeImportassetRequest,
    ) -> propertychain_models.BatchunfreezeImportassetResponse:
        """
        Description: 物权批量解冻
        Summary: 物权批量解冻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchunfreeze_importasset_ex(request, headers, runtime)

    async def batchunfreeze_importasset_async(
        self,
        request: propertychain_models.BatchunfreezeImportassetRequest,
    ) -> propertychain_models.BatchunfreezeImportassetResponse:
        """
        Description: 物权批量解冻
        Summary: 物权批量解冻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchunfreeze_importasset_ex_async(request, headers, runtime)

    def batchunfreeze_importasset_ex(
        self,
        request: propertychain_models.BatchunfreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchunfreezeImportassetResponse:
        """
        Description: 物权批量解冻
        Summary: 物权批量解冻
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchunfreezeImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.batchunfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchunfreeze_importasset_ex_async(
        self,
        request: propertychain_models.BatchunfreezeImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchunfreezeImportassetResponse:
        """
        Description: 物权批量解冻
        Summary: 物权批量解冻
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchunfreezeImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.batchunfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcancel_importasset(
        self,
        request: propertychain_models.BatchcancelImportassetRequest,
    ) -> propertychain_models.BatchcancelImportassetResponse:
        """
        Description: 物权批量撤销
        Summary: 物权批量撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcancel_importasset_ex(request, headers, runtime)

    async def batchcancel_importasset_async(
        self,
        request: propertychain_models.BatchcancelImportassetRequest,
    ) -> propertychain_models.BatchcancelImportassetResponse:
        """
        Description: 物权批量撤销
        Summary: 物权批量撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcancel_importasset_ex_async(request, headers, runtime)

    def batchcancel_importasset_ex(
        self,
        request: propertychain_models.BatchcancelImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchcancelImportassetResponse:
        """
        Description: 物权批量撤销
        Summary: 物权批量撤销
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchcancelImportassetResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.importasset.batchcancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcancel_importasset_ex_async(
        self,
        request: propertychain_models.BatchcancelImportassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchcancelImportassetResponse:
        """
        Description: 物权批量撤销
        Summary: 物权批量撤销
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchcancelImportassetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.importasset.batchcancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_transfer(
        self,
        request: propertychain_models.BatchcreateTransferRequest,
    ) -> propertychain_models.BatchcreateTransferResponse:
        """
        Description: 批量创建转让申请
        Summary: 批量创建转让申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_transfer_ex(request, headers, runtime)

    async def batchcreate_transfer_async(
        self,
        request: propertychain_models.BatchcreateTransferRequest,
    ) -> propertychain_models.BatchcreateTransferResponse:
        """
        Description: 批量创建转让申请
        Summary: 批量创建转让申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_transfer_ex_async(request, headers, runtime)

    def batchcreate_transfer_ex(
        self,
        request: propertychain_models.BatchcreateTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchcreateTransferResponse:
        """
        Description: 批量创建转让申请
        Summary: 批量创建转让申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchcreateTransferResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.transfer.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_transfer_ex_async(
        self,
        request: propertychain_models.BatchcreateTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.BatchcreateTransferResponse:
        """
        Description: 批量创建转让申请
        Summary: 批量创建转让申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.BatchcreateTransferResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.transfer.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cmport_profitrate(
        self,
        request: propertychain_models.CreateCmportProfitrateRequest,
    ) -> propertychain_models.CreateCmportProfitrateResponse:
        """
        Description: 创建分润比例配置
        Summary: 创建分润比例配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cmport_profitrate_ex(request, headers, runtime)

    async def create_cmport_profitrate_async(
        self,
        request: propertychain_models.CreateCmportProfitrateRequest,
    ) -> propertychain_models.CreateCmportProfitrateResponse:
        """
        Description: 创建分润比例配置
        Summary: 创建分润比例配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cmport_profitrate_ex_async(request, headers, runtime)

    def create_cmport_profitrate_ex(
        self,
        request: propertychain_models.CreateCmportProfitrateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateCmportProfitrateResponse:
        """
        Description: 创建分润比例配置
        Summary: 创建分润比例配置
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateCmportProfitrateResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.profitrate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cmport_profitrate_ex_async(
        self,
        request: propertychain_models.CreateCmportProfitrateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateCmportProfitrateResponse:
        """
        Description: 创建分润比例配置
        Summary: 创建分润比例配置
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateCmportProfitrateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.profitrate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_cmport_finance(
        self,
        request: propertychain_models.ApplyCmportFinanceRequest,
    ) -> propertychain_models.ApplyCmportFinanceResponse:
        """
        Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
        Summary: 融资申请信息落地到区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_cmport_finance_ex(request, headers, runtime)

    async def apply_cmport_finance_async(
        self,
        request: propertychain_models.ApplyCmportFinanceRequest,
    ) -> propertychain_models.ApplyCmportFinanceResponse:
        """
        Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
        Summary: 融资申请信息落地到区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_cmport_finance_ex_async(request, headers, runtime)

    def apply_cmport_finance_ex(
        self,
        request: propertychain_models.ApplyCmportFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ApplyCmportFinanceResponse:
        """
        Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
        Summary: 融资申请信息落地到区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.ApplyCmportFinanceResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.finance.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_cmport_finance_ex_async(
        self,
        request: propertychain_models.ApplyCmportFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ApplyCmportFinanceResponse:
        """
        Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
        Summary: 融资申请信息落地到区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.ApplyCmportFinanceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.finance.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cmport_enterprisestatement(
        self,
        request: propertychain_models.ListCmportEnterprisestatementRequest,
    ) -> propertychain_models.ListCmportEnterprisestatementResponse:
        """
        Description: 分润对账，企业到当前记账日期的累计利润信息
        Summary: 企业分润对账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cmport_enterprisestatement_ex(request, headers, runtime)

    async def list_cmport_enterprisestatement_async(
        self,
        request: propertychain_models.ListCmportEnterprisestatementRequest,
    ) -> propertychain_models.ListCmportEnterprisestatementResponse:
        """
        Description: 分润对账，企业到当前记账日期的累计利润信息
        Summary: 企业分润对账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cmport_enterprisestatement_ex_async(request, headers, runtime)

    def list_cmport_enterprisestatement_ex(
        self,
        request: propertychain_models.ListCmportEnterprisestatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportEnterprisestatementResponse:
        """
        Description: 分润对账，企业到当前记账日期的累计利润信息
        Summary: 企业分润对账单
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportEnterprisestatementResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.enterprisestatement.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cmport_enterprisestatement_ex_async(
        self,
        request: propertychain_models.ListCmportEnterprisestatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportEnterprisestatementResponse:
        """
        Description: 分润对账，企业到当前记账日期的累计利润信息
        Summary: 企业分润对账单
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportEnterprisestatementResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.enterprisestatement.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cmport_userstatement(
        self,
        request: propertychain_models.ListCmportUserstatementRequest,
    ) -> propertychain_models.ListCmportUserstatementResponse:
        """
        Description: 用户对账单
        Summary: 用户对账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cmport_userstatement_ex(request, headers, runtime)

    async def list_cmport_userstatement_async(
        self,
        request: propertychain_models.ListCmportUserstatementRequest,
    ) -> propertychain_models.ListCmportUserstatementResponse:
        """
        Description: 用户对账单
        Summary: 用户对账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cmport_userstatement_ex_async(request, headers, runtime)

    def list_cmport_userstatement_ex(
        self,
        request: propertychain_models.ListCmportUserstatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportUserstatementResponse:
        """
        Description: 用户对账单
        Summary: 用户对账单
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportUserstatementResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.userstatement.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cmport_userstatement_ex_async(
        self,
        request: propertychain_models.ListCmportUserstatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportUserstatementResponse:
        """
        Description: 用户对账单
        Summary: 用户对账单
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportUserstatementResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.userstatement.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cmport_userprofit(
        self,
        request: propertychain_models.ListCmportUserprofitRequest,
    ) -> propertychain_models.ListCmportUserprofitResponse:
        """
        Description: 用户明细清单
        Summary: 用户明细清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cmport_userprofit_ex(request, headers, runtime)

    async def list_cmport_userprofit_async(
        self,
        request: propertychain_models.ListCmportUserprofitRequest,
    ) -> propertychain_models.ListCmportUserprofitResponse:
        """
        Description: 用户明细清单
        Summary: 用户明细清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cmport_userprofit_ex_async(request, headers, runtime)

    def list_cmport_userprofit_ex(
        self,
        request: propertychain_models.ListCmportUserprofitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportUserprofitResponse:
        """
        Description: 用户明细清单
        Summary: 用户明细清单
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportUserprofitResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.userprofit.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cmport_userprofit_ex_async(
        self,
        request: propertychain_models.ListCmportUserprofitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportUserprofitResponse:
        """
        Description: 用户明细清单
        Summary: 用户明细清单
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportUserprofitResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.userprofit.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cmport_bankfee(
        self,
        request: propertychain_models.QueryCmportBankfeeRequest,
    ) -> propertychain_models.QueryCmportBankfeeResponse:
        """
        Description: 还款本息查询
        Summary: 还款本息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cmport_bankfee_ex(request, headers, runtime)

    async def query_cmport_bankfee_async(
        self,
        request: propertychain_models.QueryCmportBankfeeRequest,
    ) -> propertychain_models.QueryCmportBankfeeResponse:
        """
        Description: 还款本息查询
        Summary: 还款本息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cmport_bankfee_ex_async(request, headers, runtime)

    def query_cmport_bankfee_ex(
        self,
        request: propertychain_models.QueryCmportBankfeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryCmportBankfeeResponse:
        """
        Description: 还款本息查询
        Summary: 还款本息查询
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryCmportBankfeeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.bankfee.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cmport_bankfee_ex_async(
        self,
        request: propertychain_models.QueryCmportBankfeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.QueryCmportBankfeeResponse:
        """
        Description: 还款本息查询
        Summary: 还款本息查询
        """
        UtilClient.validate_model(request)
        return propertychain_models.QueryCmportBankfeeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.bankfee.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cmport_profitpartner(
        self,
        request: propertychain_models.CreateCmportProfitpartnerRequest,
    ) -> propertychain_models.CreateCmportProfitpartnerResponse:
        """
        Description: 创建分润归属配置
        Summary: 创建分润归属配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cmport_profitpartner_ex(request, headers, runtime)

    async def create_cmport_profitpartner_async(
        self,
        request: propertychain_models.CreateCmportProfitpartnerRequest,
    ) -> propertychain_models.CreateCmportProfitpartnerResponse:
        """
        Description: 创建分润归属配置
        Summary: 创建分润归属配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cmport_profitpartner_ex_async(request, headers, runtime)

    def create_cmport_profitpartner_ex(
        self,
        request: propertychain_models.CreateCmportProfitpartnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateCmportProfitpartnerResponse:
        """
        Description: 创建分润归属配置
        Summary: 创建分润归属配置
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateCmportProfitpartnerResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.profitpartner.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cmport_profitpartner_ex_async(
        self,
        request: propertychain_models.CreateCmportProfitpartnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CreateCmportProfitpartnerResponse:
        """
        Description: 创建分润归属配置
        Summary: 创建分润归属配置
        """
        UtilClient.validate_model(request)
        return propertychain_models.CreateCmportProfitpartnerResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.profitpartner.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_cmport_finance(
        self,
        request: propertychain_models.CancelCmportFinanceRequest,
    ) -> propertychain_models.CancelCmportFinanceResponse:
        """
        Description: 监管方（粮达网）撤销融资申请
        Summary: 撤销融资申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_cmport_finance_ex(request, headers, runtime)

    async def cancel_cmport_finance_async(
        self,
        request: propertychain_models.CancelCmportFinanceRequest,
    ) -> propertychain_models.CancelCmportFinanceResponse:
        """
        Description: 监管方（粮达网）撤销融资申请
        Summary: 撤销融资申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_cmport_finance_ex_async(request, headers, runtime)

    def cancel_cmport_finance_ex(
        self,
        request: propertychain_models.CancelCmportFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelCmportFinanceResponse:
        """
        Description: 监管方（粮达网）撤销融资申请
        Summary: 撤销融资申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelCmportFinanceResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.finance.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_cmport_finance_ex_async(
        self,
        request: propertychain_models.CancelCmportFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.CancelCmportFinanceResponse:
        """
        Description: 监管方（粮达网）撤销融资申请
        Summary: 撤销融资申请
        """
        UtilClient.validate_model(request)
        return propertychain_models.CancelCmportFinanceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.finance.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_cmport_bank(
        self,
        request: propertychain_models.NotifyCmportBankRequest,
    ) -> propertychain_models.NotifyCmportBankResponse:
        """
        Description: 银行融资审核结果同步
        Summary: 银行融资审核结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_cmport_bank_ex(request, headers, runtime)

    async def notify_cmport_bank_async(
        self,
        request: propertychain_models.NotifyCmportBankRequest,
    ) -> propertychain_models.NotifyCmportBankResponse:
        """
        Description: 银行融资审核结果同步
        Summary: 银行融资审核结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_cmport_bank_ex_async(request, headers, runtime)

    def notify_cmport_bank_ex(
        self,
        request: propertychain_models.NotifyCmportBankRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportBankResponse:
        """
        Description: 银行融资审核结果同步
        Summary: 银行融资审核结果同步
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportBankResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.bank.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_cmport_bank_ex_async(
        self,
        request: propertychain_models.NotifyCmportBankRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportBankResponse:
        """
        Description: 银行融资审核结果同步
        Summary: 银行融资审核结果同步
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportBankResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.bank.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_cmport_loan(
        self,
        request: propertychain_models.NotifyCmportLoanRequest,
    ) -> propertychain_models.NotifyCmportLoanResponse:
        """
        Description: 银行放款结果同步给区块链
        Summary: 银行放款结果同步给区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_cmport_loan_ex(request, headers, runtime)

    async def notify_cmport_loan_async(
        self,
        request: propertychain_models.NotifyCmportLoanRequest,
    ) -> propertychain_models.NotifyCmportLoanResponse:
        """
        Description: 银行放款结果同步给区块链
        Summary: 银行放款结果同步给区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_cmport_loan_ex_async(request, headers, runtime)

    def notify_cmport_loan_ex(
        self,
        request: propertychain_models.NotifyCmportLoanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportLoanResponse:
        """
        Description: 银行放款结果同步给区块链
        Summary: 银行放款结果同步给区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportLoanResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.loan.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_cmport_loan_ex_async(
        self,
        request: propertychain_models.NotifyCmportLoanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportLoanResponse:
        """
        Description: 银行放款结果同步给区块链
        Summary: 银行放款结果同步给区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportLoanResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.loan.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_cmport_repay(
        self,
        request: propertychain_models.NotifyCmportRepayRequest,
    ) -> propertychain_models.NotifyCmportRepayResponse:
        """
        Description: 还款结果同步给区块链
        Summary: 还款结果同步给区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_cmport_repay_ex(request, headers, runtime)

    async def notify_cmport_repay_async(
        self,
        request: propertychain_models.NotifyCmportRepayRequest,
    ) -> propertychain_models.NotifyCmportRepayResponse:
        """
        Description: 还款结果同步给区块链
        Summary: 还款结果同步给区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_cmport_repay_ex_async(request, headers, runtime)

    def notify_cmport_repay_ex(
        self,
        request: propertychain_models.NotifyCmportRepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportRepayResponse:
        """
        Description: 还款结果同步给区块链
        Summary: 还款结果同步给区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportRepayResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.repay.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_cmport_repay_ex_async(
        self,
        request: propertychain_models.NotifyCmportRepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportRepayResponse:
        """
        Description: 还款结果同步给区块链
        Summary: 还款结果同步给区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportRepayResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.repay.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cmport_bankfee(
        self,
        request: propertychain_models.ListCmportBankfeeRequest,
    ) -> propertychain_models.ListCmportBankfeeResponse:
        """
        Description: 还款本息查询-分页
        Summary: 还款本息查询-分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cmport_bankfee_ex(request, headers, runtime)

    async def list_cmport_bankfee_async(
        self,
        request: propertychain_models.ListCmportBankfeeRequest,
    ) -> propertychain_models.ListCmportBankfeeResponse:
        """
        Description: 还款本息查询-分页
        Summary: 还款本息查询-分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cmport_bankfee_ex_async(request, headers, runtime)

    def list_cmport_bankfee_ex(
        self,
        request: propertychain_models.ListCmportBankfeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportBankfeeResponse:
        """
        Description: 还款本息查询-分页
        Summary: 还款本息查询-分页
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportBankfeeResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.bankfee.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cmport_bankfee_ex_async(
        self,
        request: propertychain_models.ListCmportBankfeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.ListCmportBankfeeResponse:
        """
        Description: 还款本息查询-分页
        Summary: 还款本息查询-分页
        """
        UtilClient.validate_model(request)
        return propertychain_models.ListCmportBankfeeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.bankfee.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_cmport_logistics(
        self,
        request: propertychain_models.NotifyCmportLogisticsRequest,
    ) -> propertychain_models.NotifyCmportLogisticsResponse:
        """
        Description: 物流轨迹同步给区块链
        Summary: 物流轨迹同步给区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_cmport_logistics_ex(request, headers, runtime)

    async def notify_cmport_logistics_async(
        self,
        request: propertychain_models.NotifyCmportLogisticsRequest,
    ) -> propertychain_models.NotifyCmportLogisticsResponse:
        """
        Description: 物流轨迹同步给区块链
        Summary: 物流轨迹同步给区块链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_cmport_logistics_ex_async(request, headers, runtime)

    def notify_cmport_logistics_ex(
        self,
        request: propertychain_models.NotifyCmportLogisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportLogisticsResponse:
        """
        Description: 物流轨迹同步给区块链
        Summary: 物流轨迹同步给区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportLogisticsResponse().from_map(
            self.do_request('1.0', 'blockchain.propertychain.cmport.logistics.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_cmport_logistics_ex_async(
        self,
        request: propertychain_models.NotifyCmportLogisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> propertychain_models.NotifyCmportLogisticsResponse:
        """
        Description: 物流轨迹同步给区块链
        Summary: 物流轨迹同步给区块链
        """
        UtilClient.validate_model(request)
        return propertychain_models.NotifyCmportLogisticsResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.propertychain.cmport.logistics.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
