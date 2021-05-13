# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_appex import models as appex_models
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
        config: appex_models.Config,
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
            # NameValuePair
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
                    'sdk_version': '1.2.20'
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
            # NameValuePair
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
                    'sdk_version': '1.2.20'
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

    def create_user_did(
        self,
        request: appex_models.CreateUserDidRequest,
    ) -> appex_models.CreateUserDidResponse:
        """
        Description: 区块链身份创建
        Summary: 区块链身份创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_user_did_ex(request, headers, runtime)

    async def create_user_did_async(
        self,
        request: appex_models.CreateUserDidRequest,
    ) -> appex_models.CreateUserDidResponse:
        """
        Description: 区块链身份创建
        Summary: 区块链身份创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_user_did_ex_async(request, headers, runtime)

    def create_user_did_ex(
        self,
        request: appex_models.CreateUserDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUserDidResponse:
        """
        Description: 区块链身份创建
        Summary: 区块链身份创建
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUserDidResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.user.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_user_did_ex_async(
        self,
        request: appex_models.CreateUserDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUserDidResponse:
        """
        Description: 区块链身份创建
        Summary: 区块链身份创建
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUserDidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.user.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_union_apply(
        self,
        request: appex_models.CreateUnionApplyRequest,
    ) -> appex_models.CreateUnionApplyResponse:
        """
        Description: 协作联盟创建申请
        Summary: 协作联盟创建申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_union_apply_ex(request, headers, runtime)

    async def create_union_apply_async(
        self,
        request: appex_models.CreateUnionApplyRequest,
    ) -> appex_models.CreateUnionApplyResponse:
        """
        Description: 协作联盟创建申请
        Summary: 协作联盟创建申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_union_apply_ex_async(request, headers, runtime)

    def create_union_apply_ex(
        self,
        request: appex_models.CreateUnionApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUnionApplyResponse:
        """
        Description: 协作联盟创建申请
        Summary: 协作联盟创建申请
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUnionApplyResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.apply.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_union_apply_ex_async(
        self,
        request: appex_models.CreateUnionApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUnionApplyResponse:
        """
        Description: 协作联盟创建申请
        Summary: 协作联盟创建申请
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUnionApplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.apply.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_union_apply(
        self,
        request: appex_models.ConfirmUnionApplyRequest,
    ) -> appex_models.ConfirmUnionApplyResponse:
        """
        Description: 联盟创建申请审核，仅内部租户可调用
        Summary: 联盟创建申请审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_union_apply_ex(request, headers, runtime)

    async def confirm_union_apply_async(
        self,
        request: appex_models.ConfirmUnionApplyRequest,
    ) -> appex_models.ConfirmUnionApplyResponse:
        """
        Description: 联盟创建申请审核，仅内部租户可调用
        Summary: 联盟创建申请审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_union_apply_ex_async(request, headers, runtime)

    def confirm_union_apply_ex(
        self,
        request: appex_models.ConfirmUnionApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ConfirmUnionApplyResponse:
        """
        Description: 联盟创建申请审核，仅内部租户可调用
        Summary: 联盟创建申请审核
        """
        UtilClient.validate_model(request)
        return appex_models.ConfirmUnionApplyResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.apply.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_union_apply_ex_async(
        self,
        request: appex_models.ConfirmUnionApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ConfirmUnionApplyResponse:
        """
        Description: 联盟创建申请审核，仅内部租户可调用
        Summary: 联盟创建申请审核
        """
        UtilClient.validate_model(request)
        return appex_models.ConfirmUnionApplyResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.apply.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_union_channel(
        self,
        request: appex_models.CreateUnionChannelRequest,
    ) -> appex_models.CreateUnionChannelResponse:
        """
        Description: 在联盟中创建信息通道Channel
        Summary: 在联盟中创建信息通道Channel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_union_channel_ex(request, headers, runtime)

    async def create_union_channel_async(
        self,
        request: appex_models.CreateUnionChannelRequest,
    ) -> appex_models.CreateUnionChannelResponse:
        """
        Description: 在联盟中创建信息通道Channel
        Summary: 在联盟中创建信息通道Channel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_union_channel_ex_async(request, headers, runtime)

    def create_union_channel_ex(
        self,
        request: appex_models.CreateUnionChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUnionChannelResponse:
        """
        Description: 在联盟中创建信息通道Channel
        Summary: 在联盟中创建信息通道Channel
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUnionChannelResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.channel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_union_channel_ex_async(
        self,
        request: appex_models.CreateUnionChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUnionChannelResponse:
        """
        Description: 在联盟中创建信息通道Channel
        Summary: 在联盟中创建信息通道Channel
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUnionChannelResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.channel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_user_channel(
        self,
        request: appex_models.ListUserChannelRequest,
    ) -> appex_models.ListUserChannelResponse:
        """
        Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
        Summary: 成员查询自己拥有访问权限的channel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_user_channel_ex(request, headers, runtime)

    async def list_user_channel_async(
        self,
        request: appex_models.ListUserChannelRequest,
    ) -> appex_models.ListUserChannelResponse:
        """
        Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
        Summary: 成员查询自己拥有访问权限的channel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_user_channel_ex_async(request, headers, runtime)

    def list_user_channel_ex(
        self,
        request: appex_models.ListUserChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListUserChannelResponse:
        """
        Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
        Summary: 成员查询自己拥有访问权限的channel
        """
        UtilClient.validate_model(request)
        return appex_models.ListUserChannelResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.user.channel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_user_channel_ex_async(
        self,
        request: appex_models.ListUserChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListUserChannelResponse:
        """
        Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
        Summary: 成员查询自己拥有访问权限的channel
        """
        UtilClient.validate_model(request)
        return appex_models.ListUserChannelResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.user.channel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_union_pubchannel(
        self,
        request: appex_models.ListUnionPubchannelRequest,
    ) -> appex_models.ListUnionPubchannelResponse:
        """
        Description: 联盟公开Channel查询
        Summary: 联盟公开Channel查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_union_pubchannel_ex(request, headers, runtime)

    async def list_union_pubchannel_async(
        self,
        request: appex_models.ListUnionPubchannelRequest,
    ) -> appex_models.ListUnionPubchannelResponse:
        """
        Description: 联盟公开Channel查询
        Summary: 联盟公开Channel查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_union_pubchannel_ex_async(request, headers, runtime)

    def list_union_pubchannel_ex(
        self,
        request: appex_models.ListUnionPubchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListUnionPubchannelResponse:
        """
        Description: 联盟公开Channel查询
        Summary: 联盟公开Channel查询
        """
        UtilClient.validate_model(request)
        return appex_models.ListUnionPubchannelResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.pubchannel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_union_pubchannel_ex_async(
        self,
        request: appex_models.ListUnionPubchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListUnionPubchannelResponse:
        """
        Description: 联盟公开Channel查询
        Summary: 联盟公开Channel查询
        """
        UtilClient.validate_model(request)
        return appex_models.ListUnionPubchannelResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.pubchannel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_channel_user(
        self,
        request: appex_models.AuthChannelUserRequest,
    ) -> appex_models.AuthChannelUserResponse:
        """
        Description: Channel授权给用户
        Summary: Channel授权给用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_channel_user_ex(request, headers, runtime)

    async def auth_channel_user_async(
        self,
        request: appex_models.AuthChannelUserRequest,
    ) -> appex_models.AuthChannelUserResponse:
        """
        Description: Channel授权给用户
        Summary: Channel授权给用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_channel_user_ex_async(request, headers, runtime)

    def auth_channel_user_ex(
        self,
        request: appex_models.AuthChannelUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.AuthChannelUserResponse:
        """
        Description: Channel授权给用户
        Summary: Channel授权给用户
        """
        UtilClient.validate_model(request)
        return appex_models.AuthChannelUserResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.channel.user.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_channel_user_ex_async(
        self,
        request: appex_models.AuthChannelUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.AuthChannelUserResponse:
        """
        Description: Channel授权给用户
        Summary: Channel授权给用户
        """
        UtilClient.validate_model(request)
        return appex_models.AuthChannelUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.channel.user.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_channel_user(
        self,
        request: appex_models.CancelChannelUserRequest,
    ) -> appex_models.CancelChannelUserResponse:
        """
        Description: 取消用户访问Channel的权限
        Summary: 取消用户访问Channel的权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_channel_user_ex(request, headers, runtime)

    async def cancel_channel_user_async(
        self,
        request: appex_models.CancelChannelUserRequest,
    ) -> appex_models.CancelChannelUserResponse:
        """
        Description: 取消用户访问Channel的权限
        Summary: 取消用户访问Channel的权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_channel_user_ex_async(request, headers, runtime)

    def cancel_channel_user_ex(
        self,
        request: appex_models.CancelChannelUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CancelChannelUserResponse:
        """
        Description: 取消用户访问Channel的权限
        Summary: 取消用户访问Channel的权限
        """
        UtilClient.validate_model(request)
        return appex_models.CancelChannelUserResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.channel.user.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_channel_user_ex_async(
        self,
        request: appex_models.CancelChannelUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CancelChannelUserResponse:
        """
        Description: 取消用户访问Channel的权限
        Summary: 取消用户访问Channel的权限
        """
        UtilClient.validate_model(request)
        return appex_models.CancelChannelUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.channel.user.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_union_form(
        self,
        request: appex_models.CreateUnionFormRequest,
    ) -> appex_models.CreateUnionFormResponse:
        """
        Description: 单据加密上链
        Summary: 单据加密上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_union_form_ex(request, headers, runtime)

    async def create_union_form_async(
        self,
        request: appex_models.CreateUnionFormRequest,
    ) -> appex_models.CreateUnionFormResponse:
        """
        Description: 单据加密上链
        Summary: 单据加密上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_union_form_ex_async(request, headers, runtime)

    def create_union_form_ex(
        self,
        request: appex_models.CreateUnionFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUnionFormResponse:
        """
        Description: 单据加密上链
        Summary: 单据加密上链
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUnionFormResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.form.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_union_form_ex_async(
        self,
        request: appex_models.CreateUnionFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateUnionFormResponse:
        """
        Description: 单据加密上链
        Summary: 单据加密上链
        """
        UtilClient.validate_model(request)
        return appex_models.CreateUnionFormResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.form.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_union_form(
        self,
        request: appex_models.QueryUnionFormRequest,
    ) -> appex_models.QueryUnionFormResponse:
        """
        Description: 查询单个表单
        Summary: 查询单个表单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_union_form_ex(request, headers, runtime)

    async def query_union_form_async(
        self,
        request: appex_models.QueryUnionFormRequest,
    ) -> appex_models.QueryUnionFormResponse:
        """
        Description: 查询单个表单
        Summary: 查询单个表单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_union_form_ex_async(request, headers, runtime)

    def query_union_form_ex(
        self,
        request: appex_models.QueryUnionFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QueryUnionFormResponse:
        """
        Description: 查询单个表单
        Summary: 查询单个表单
        """
        UtilClient.validate_model(request)
        return appex_models.QueryUnionFormResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.form.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_union_form_ex_async(
        self,
        request: appex_models.QueryUnionFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QueryUnionFormResponse:
        """
        Description: 查询单个表单
        Summary: 查询单个表单
        """
        UtilClient.validate_model(request)
        return appex_models.QueryUnionFormResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.form.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_channel_userform(
        self,
        request: appex_models.ListChannelUserformRequest,
    ) -> appex_models.ListChannelUserformResponse:
        """
        Description: 通道中用户可以访问的表单列表
        Summary: 通道中用户可以访问的表单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_channel_userform_ex(request, headers, runtime)

    async def list_channel_userform_async(
        self,
        request: appex_models.ListChannelUserformRequest,
    ) -> appex_models.ListChannelUserformResponse:
        """
        Description: 通道中用户可以访问的表单列表
        Summary: 通道中用户可以访问的表单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_channel_userform_ex_async(request, headers, runtime)

    def list_channel_userform_ex(
        self,
        request: appex_models.ListChannelUserformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListChannelUserformResponse:
        """
        Description: 通道中用户可以访问的表单列表
        Summary: 通道中用户可以访问的表单列表
        """
        UtilClient.validate_model(request)
        return appex_models.ListChannelUserformResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.channel.userform.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_channel_userform_ex_async(
        self,
        request: appex_models.ListChannelUserformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListChannelUserformResponse:
        """
        Description: 通道中用户可以访问的表单列表
        Summary: 通道中用户可以访问的表单列表
        """
        UtilClient.validate_model(request)
        return appex_models.ListChannelUserformResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.channel.userform.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_object(
        self,
        request: appex_models.CreateObjectRequest,
    ) -> appex_models.CreateObjectResponse:
        """
        Description: 物上链，链上数字物体创建
        Summary: 物权上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_object_ex(request, headers, runtime)

    async def create_object_async(
        self,
        request: appex_models.CreateObjectRequest,
    ) -> appex_models.CreateObjectResponse:
        """
        Description: 物上链，链上数字物体创建
        Summary: 物权上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_object_ex_async(request, headers, runtime)

    def create_object_ex(
        self,
        request: appex_models.CreateObjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateObjectResponse:
        """
        Description: 物上链，链上数字物体创建
        Summary: 物权上链
        """
        UtilClient.validate_model(request)
        return appex_models.CreateObjectResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.object.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_object_ex_async(
        self,
        request: appex_models.CreateObjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateObjectResponse:
        """
        Description: 物上链，链上数字物体创建
        Summary: 物权上链
        """
        UtilClient.validate_model(request)
        return appex_models.CreateObjectResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.object.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_object_transfer(
        self,
        request: appex_models.CreateObjectTransferRequest,
    ) -> appex_models.CreateObjectTransferResponse:
        """
        Description: 数据归属权流转
        Summary: 数据归属权流转
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_object_transfer_ex(request, headers, runtime)

    async def create_object_transfer_async(
        self,
        request: appex_models.CreateObjectTransferRequest,
    ) -> appex_models.CreateObjectTransferResponse:
        """
        Description: 数据归属权流转
        Summary: 数据归属权流转
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_object_transfer_ex_async(request, headers, runtime)

    def create_object_transfer_ex(
        self,
        request: appex_models.CreateObjectTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateObjectTransferResponse:
        """
        Description: 数据归属权流转
        Summary: 数据归属权流转
        """
        UtilClient.validate_model(request)
        return appex_models.CreateObjectTransferResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.object.transfer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_object_transfer_ex_async(
        self,
        request: appex_models.CreateObjectTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateObjectTransferResponse:
        """
        Description: 数据归属权流转
        Summary: 数据归属权流转
        """
        UtilClient.validate_model(request)
        return appex_models.CreateObjectTransferResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.object.transfer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_object_transfer(
        self,
        request: appex_models.ListObjectTransferRequest,
    ) -> appex_models.ListObjectTransferResponse:
        """
        Description: 数据归属权流转记录查询
        Summary: 数据归属权流转记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_object_transfer_ex(request, headers, runtime)

    async def list_object_transfer_async(
        self,
        request: appex_models.ListObjectTransferRequest,
    ) -> appex_models.ListObjectTransferResponse:
        """
        Description: 数据归属权流转记录查询
        Summary: 数据归属权流转记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_object_transfer_ex_async(request, headers, runtime)

    def list_object_transfer_ex(
        self,
        request: appex_models.ListObjectTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListObjectTransferResponse:
        """
        Description: 数据归属权流转记录查询
        Summary: 数据归属权流转记录查询
        """
        UtilClient.validate_model(request)
        return appex_models.ListObjectTransferResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.object.transfer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_object_transfer_ex_async(
        self,
        request: appex_models.ListObjectTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListObjectTransferResponse:
        """
        Description: 数据归属权流转记录查询
        Summary: 数据归属权流转记录查询
        """
        UtilClient.validate_model(request)
        return appex_models.ListObjectTransferResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.object.transfer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_statusflow_template(
        self,
        request: appex_models.CreateStatusflowTemplateRequest,
    ) -> appex_models.CreateStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版新增
        Summary: 状态流驱动模版新增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_statusflow_template_ex(request, headers, runtime)

    async def create_statusflow_template_async(
        self,
        request: appex_models.CreateStatusflowTemplateRequest,
    ) -> appex_models.CreateStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版新增
        Summary: 状态流驱动模版新增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_statusflow_template_ex_async(request, headers, runtime)

    def create_statusflow_template_ex(
        self,
        request: appex_models.CreateStatusflowTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版新增
        Summary: 状态流驱动模版新增
        """
        UtilClient.validate_model(request)
        return appex_models.CreateStatusflowTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.statusflow.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_statusflow_template_ex_async(
        self,
        request: appex_models.CreateStatusflowTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版新增
        Summary: 状态流驱动模版新增
        """
        UtilClient.validate_model(request)
        return appex_models.CreateStatusflowTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.statusflow.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_statusflow_template(
        self,
        request: appex_models.DeleteStatusflowTemplateRequest,
    ) -> appex_models.DeleteStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版删除
        Summary: 状态流驱动模版删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_statusflow_template_ex(request, headers, runtime)

    async def delete_statusflow_template_async(
        self,
        request: appex_models.DeleteStatusflowTemplateRequest,
    ) -> appex_models.DeleteStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版删除
        Summary: 状态流驱动模版删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_statusflow_template_ex_async(request, headers, runtime)

    def delete_statusflow_template_ex(
        self,
        request: appex_models.DeleteStatusflowTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.DeleteStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版删除
        Summary: 状态流驱动模版删除
        """
        UtilClient.validate_model(request)
        return appex_models.DeleteStatusflowTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.statusflow.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_statusflow_template_ex_async(
        self,
        request: appex_models.DeleteStatusflowTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.DeleteStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版删除
        Summary: 状态流驱动模版删除
        """
        UtilClient.validate_model(request)
        return appex_models.DeleteStatusflowTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.statusflow.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_statusflow_template(
        self,
        request: appex_models.QueryStatusflowTemplateRequest,
    ) -> appex_models.QueryStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版查询
        Summary: 状态流驱动模版查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_statusflow_template_ex(request, headers, runtime)

    async def query_statusflow_template_async(
        self,
        request: appex_models.QueryStatusflowTemplateRequest,
    ) -> appex_models.QueryStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版查询
        Summary: 状态流驱动模版查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_statusflow_template_ex_async(request, headers, runtime)

    def query_statusflow_template_ex(
        self,
        request: appex_models.QueryStatusflowTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QueryStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版查询
        Summary: 状态流驱动模版查询
        """
        UtilClient.validate_model(request)
        return appex_models.QueryStatusflowTemplateResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.statusflow.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_statusflow_template_ex_async(
        self,
        request: appex_models.QueryStatusflowTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QueryStatusflowTemplateResponse:
        """
        Description: 状态流驱动模版查询
        Summary: 状态流驱动模版查询
        """
        UtilClient.validate_model(request)
        return appex_models.QueryStatusflowTemplateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.statusflow.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_datastatus_drive(
        self,
        request: appex_models.StartDatastatusDriveRequest,
    ) -> appex_models.StartDatastatusDriveResponse:
        """
        Description: 数据状态驱动
        Summary: 数据状态驱动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_datastatus_drive_ex(request, headers, runtime)

    async def start_datastatus_drive_async(
        self,
        request: appex_models.StartDatastatusDriveRequest,
    ) -> appex_models.StartDatastatusDriveResponse:
        """
        Description: 数据状态驱动
        Summary: 数据状态驱动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_datastatus_drive_ex_async(request, headers, runtime)

    def start_datastatus_drive_ex(
        self,
        request: appex_models.StartDatastatusDriveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.StartDatastatusDriveResponse:
        """
        Description: 数据状态驱动
        Summary: 数据状态驱动
        """
        UtilClient.validate_model(request)
        return appex_models.StartDatastatusDriveResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.datastatus.drive.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_datastatus_drive_ex_async(
        self,
        request: appex_models.StartDatastatusDriveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.StartDatastatusDriveResponse:
        """
        Description: 数据状态驱动
        Summary: 数据状态驱动
        """
        UtilClient.validate_model(request)
        return appex_models.StartDatastatusDriveResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.datastatus.drive.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_datastatus_drive(
        self,
        request: appex_models.ListDatastatusDriveRequest,
    ) -> appex_models.ListDatastatusDriveResponse:
        """
        Description: 查询数据状态流转记录
        Summary: 查询数据状态流转记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_datastatus_drive_ex(request, headers, runtime)

    async def list_datastatus_drive_async(
        self,
        request: appex_models.ListDatastatusDriveRequest,
    ) -> appex_models.ListDatastatusDriveResponse:
        """
        Description: 查询数据状态流转记录
        Summary: 查询数据状态流转记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_datastatus_drive_ex_async(request, headers, runtime)

    def list_datastatus_drive_ex(
        self,
        request: appex_models.ListDatastatusDriveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListDatastatusDriveResponse:
        """
        Description: 查询数据状态流转记录
        Summary: 查询数据状态流转记录
        """
        UtilClient.validate_model(request)
        return appex_models.ListDatastatusDriveResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.datastatus.drive.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_datastatus_drive_ex_async(
        self,
        request: appex_models.ListDatastatusDriveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ListDatastatusDriveResponse:
        """
        Description: 查询数据状态流转记录
        Summary: 查询数据状态流转记录
        """
        UtilClient.validate_model(request)
        return appex_models.ListDatastatusDriveResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.datastatus.drive.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_asynform_form(
        self,
        request: appex_models.CreateAsynformFormRequest,
    ) -> appex_models.CreateAsynformFormResponse:
        """
        Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
        Summary: 单据加密异步上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_asynform_form_ex(request, headers, runtime)

    async def create_asynform_form_async(
        self,
        request: appex_models.CreateAsynformFormRequest,
    ) -> appex_models.CreateAsynformFormResponse:
        """
        Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
        Summary: 单据加密异步上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_asynform_form_ex_async(request, headers, runtime)

    def create_asynform_form_ex(
        self,
        request: appex_models.CreateAsynformFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateAsynformFormResponse:
        """
        Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
        Summary: 单据加密异步上链
        """
        UtilClient.validate_model(request)
        return appex_models.CreateAsynformFormResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.asynform.form.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_asynform_form_ex_async(
        self,
        request: appex_models.CreateAsynformFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.CreateAsynformFormResponse:
        """
        Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
        Summary: 单据加密异步上链
        """
        UtilClient.validate_model(request)
        return appex_models.CreateAsynformFormResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.asynform.form.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_union_form(
        self,
        request: appex_models.PagequeryUnionFormRequest,
    ) -> appex_models.PagequeryUnionFormResponse:
        """
        Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
        Summary: 单据分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_union_form_ex(request, headers, runtime)

    async def pagequery_union_form_async(
        self,
        request: appex_models.PagequeryUnionFormRequest,
    ) -> appex_models.PagequeryUnionFormResponse:
        """
        Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
        Summary: 单据分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_union_form_ex_async(request, headers, runtime)

    def pagequery_union_form_ex(
        self,
        request: appex_models.PagequeryUnionFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.PagequeryUnionFormResponse:
        """
        Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
        Summary: 单据分页查询
        """
        UtilClient.validate_model(request)
        return appex_models.PagequeryUnionFormResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.union.form.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_union_form_ex_async(
        self,
        request: appex_models.PagequeryUnionFormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.PagequeryUnionFormResponse:
        """
        Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
        Summary: 单据分页查询
        """
        UtilClient.validate_model(request)
        return appex_models.PagequeryUnionFormResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.union.form.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_asynform_status(
        self,
        request: appex_models.QueryAsynformStatusRequest,
    ) -> appex_models.QueryAsynformStatusResponse:
        """
        Description: 单据上链状态查询，异步上链后查询交易是否成功上链
        Summary: 单据上链状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_asynform_status_ex(request, headers, runtime)

    async def query_asynform_status_async(
        self,
        request: appex_models.QueryAsynformStatusRequest,
    ) -> appex_models.QueryAsynformStatusResponse:
        """
        Description: 单据上链状态查询，异步上链后查询交易是否成功上链
        Summary: 单据上链状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_asynform_status_ex_async(request, headers, runtime)

    def query_asynform_status_ex(
        self,
        request: appex_models.QueryAsynformStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QueryAsynformStatusResponse:
        """
        Description: 单据上链状态查询，异步上链后查询交易是否成功上链
        Summary: 单据上链状态查询
        """
        UtilClient.validate_model(request)
        return appex_models.QueryAsynformStatusResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.asynform.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_asynform_status_ex_async(
        self,
        request: appex_models.QueryAsynformStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QueryAsynformStatusResponse:
        """
        Description: 单据上链状态查询，异步上链后查询交易是否成功上链
        Summary: 单据上链状态查询
        """
        UtilClient.validate_model(request)
        return appex_models.QueryAsynformStatusResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.asynform.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_solution_fastnotary(
        self,
        request: appex_models.QuerySolutionFastnotaryRequest,
    ) -> appex_models.QuerySolutionFastnotaryResponse:
        """
        Description: 结构化存证查询
        Summary: 结构化存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_solution_fastnotary_ex(request, headers, runtime)

    async def query_solution_fastnotary_async(
        self,
        request: appex_models.QuerySolutionFastnotaryRequest,
    ) -> appex_models.QuerySolutionFastnotaryResponse:
        """
        Description: 结构化存证查询
        Summary: 结构化存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_solution_fastnotary_ex_async(request, headers, runtime)

    def query_solution_fastnotary_ex(
        self,
        request: appex_models.QuerySolutionFastnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QuerySolutionFastnotaryResponse:
        """
        Description: 结构化存证查询
        Summary: 结构化存证查询
        """
        UtilClient.validate_model(request)
        return appex_models.QuerySolutionFastnotaryResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.fastnotary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_solution_fastnotary_ex_async(
        self,
        request: appex_models.QuerySolutionFastnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QuerySolutionFastnotaryResponse:
        """
        Description: 结构化存证查询
        Summary: 结构化存证查询
        """
        UtilClient.validate_model(request)
        return appex_models.QuerySolutionFastnotaryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.fastnotary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_solution_fastnotary(
        self,
        request: appex_models.SaveSolutionFastnotaryRequest,
    ) -> appex_models.SaveSolutionFastnotaryResponse:
        """
        Description: 发起结构化存证
        Summary: 发起结构化存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_solution_fastnotary_ex(request, headers, runtime)

    async def save_solution_fastnotary_async(
        self,
        request: appex_models.SaveSolutionFastnotaryRequest,
    ) -> appex_models.SaveSolutionFastnotaryResponse:
        """
        Description: 发起结构化存证
        Summary: 发起结构化存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_solution_fastnotary_ex_async(request, headers, runtime)

    def save_solution_fastnotary_ex(
        self,
        request: appex_models.SaveSolutionFastnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.SaveSolutionFastnotaryResponse:
        """
        Description: 发起结构化存证
        Summary: 发起结构化存证
        """
        UtilClient.validate_model(request)
        return appex_models.SaveSolutionFastnotaryResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.fastnotary.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_solution_fastnotary_ex_async(
        self,
        request: appex_models.SaveSolutionFastnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.SaveSolutionFastnotaryResponse:
        """
        Description: 发起结构化存证
        Summary: 发起结构化存证
        """
        UtilClient.validate_model(request)
        return appex_models.SaveSolutionFastnotaryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.fastnotary.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_solution_filenotary(
        self,
        request: appex_models.InitSolutionFilenotaryRequest,
    ) -> appex_models.InitSolutionFilenotaryResponse:
        """
        Description: 初始化文件存证
        Summary: 初始化文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_solution_filenotary_ex(request, headers, runtime)

    async def init_solution_filenotary_async(
        self,
        request: appex_models.InitSolutionFilenotaryRequest,
    ) -> appex_models.InitSolutionFilenotaryResponse:
        """
        Description: 初始化文件存证
        Summary: 初始化文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_solution_filenotary_ex_async(request, headers, runtime)

    def init_solution_filenotary_ex(
        self,
        request: appex_models.InitSolutionFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.InitSolutionFilenotaryResponse:
        """
        Description: 初始化文件存证
        Summary: 初始化文件存证
        """
        UtilClient.validate_model(request)
        return appex_models.InitSolutionFilenotaryResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.filenotary.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_solution_filenotary_ex_async(
        self,
        request: appex_models.InitSolutionFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.InitSolutionFilenotaryResponse:
        """
        Description: 初始化文件存证
        Summary: 初始化文件存证
        """
        UtilClient.validate_model(request)
        return appex_models.InitSolutionFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.filenotary.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_solution_filenotary(
        self,
        request: appex_models.SyncSolutionFilenotaryRequest,
    ) -> appex_models.SyncSolutionFilenotaryResponse:
        """
        Description: 通知文件上传完成
        Summary: 通知文件上传完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_solution_filenotary_ex(request, headers, runtime)

    async def sync_solution_filenotary_async(
        self,
        request: appex_models.SyncSolutionFilenotaryRequest,
    ) -> appex_models.SyncSolutionFilenotaryResponse:
        """
        Description: 通知文件上传完成
        Summary: 通知文件上传完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_solution_filenotary_ex_async(request, headers, runtime)

    def sync_solution_filenotary_ex(
        self,
        request: appex_models.SyncSolutionFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.SyncSolutionFilenotaryResponse:
        """
        Description: 通知文件上传完成
        Summary: 通知文件上传完成
        """
        UtilClient.validate_model(request)
        return appex_models.SyncSolutionFilenotaryResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.filenotary.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_solution_filenotary_ex_async(
        self,
        request: appex_models.SyncSolutionFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.SyncSolutionFilenotaryResponse:
        """
        Description: 通知文件上传完成
        Summary: 通知文件上传完成
        """
        UtilClient.validate_model(request)
        return appex_models.SyncSolutionFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.filenotary.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_solution_filenotarystatus(
        self,
        request: appex_models.GetSolutionFilenotarystatusRequest,
    ) -> appex_models.GetSolutionFilenotarystatusResponse:
        """
        Description: 获取文件存证的状态
        Summary: 获取文件存证的状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_solution_filenotarystatus_ex(request, headers, runtime)

    async def get_solution_filenotarystatus_async(
        self,
        request: appex_models.GetSolutionFilenotarystatusRequest,
    ) -> appex_models.GetSolutionFilenotarystatusResponse:
        """
        Description: 获取文件存证的状态
        Summary: 获取文件存证的状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_solution_filenotarystatus_ex_async(request, headers, runtime)

    def get_solution_filenotarystatus_ex(
        self,
        request: appex_models.GetSolutionFilenotarystatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.GetSolutionFilenotarystatusResponse:
        """
        Description: 获取文件存证的状态
        Summary: 获取文件存证的状态
        """
        UtilClient.validate_model(request)
        return appex_models.GetSolutionFilenotarystatusResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.filenotarystatus.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_solution_filenotarystatus_ex_async(
        self,
        request: appex_models.GetSolutionFilenotarystatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.GetSolutionFilenotarystatusResponse:
        """
        Description: 获取文件存证的状态
        Summary: 获取文件存证的状态
        """
        UtilClient.validate_model(request)
        return appex_models.GetSolutionFilenotarystatusResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.filenotarystatus.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_solution_filenotary(
        self,
        request: appex_models.QuerySolutionFilenotaryRequest,
    ) -> appex_models.QuerySolutionFilenotaryResponse:
        """
        Description: 查询文件存证
        Summary: 查询文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_solution_filenotary_ex(request, headers, runtime)

    async def query_solution_filenotary_async(
        self,
        request: appex_models.QuerySolutionFilenotaryRequest,
    ) -> appex_models.QuerySolutionFilenotaryResponse:
        """
        Description: 查询文件存证
        Summary: 查询文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_solution_filenotary_ex_async(request, headers, runtime)

    def query_solution_filenotary_ex(
        self,
        request: appex_models.QuerySolutionFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QuerySolutionFilenotaryResponse:
        """
        Description: 查询文件存证
        Summary: 查询文件存证
        """
        UtilClient.validate_model(request)
        return appex_models.QuerySolutionFilenotaryResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.filenotary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_solution_filenotary_ex_async(
        self,
        request: appex_models.QuerySolutionFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QuerySolutionFilenotaryResponse:
        """
        Description: 查询文件存证
        Summary: 查询文件存证
        """
        UtilClient.validate_model(request)
        return appex_models.QuerySolutionFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.filenotary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_service(
        self,
        request: appex_models.ExecContractServiceRequest,
    ) -> appex_models.ExecContractServiceResponse:
        """
        Description: 合约服务调用
        Summary: 合约服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_service_ex(request, headers, runtime)

    async def exec_contract_service_async(
        self,
        request: appex_models.ExecContractServiceRequest,
    ) -> appex_models.ExecContractServiceResponse:
        """
        Description: 合约服务调用
        Summary: 合约服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_service_ex_async(request, headers, runtime)

    def exec_contract_service_ex(
        self,
        request: appex_models.ExecContractServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ExecContractServiceResponse:
        """
        Description: 合约服务调用
        Summary: 合约服务调用
        """
        UtilClient.validate_model(request)
        return appex_models.ExecContractServiceResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.contract.service.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_service_ex_async(
        self,
        request: appex_models.ExecContractServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.ExecContractServiceResponse:
        """
        Description: 合约服务调用
        Summary: 合约服务调用
        """
        UtilClient.validate_model(request)
        return appex_models.ExecContractServiceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.contract.service.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_solution_bms(
        self,
        request: appex_models.InitSolutionBmsRequest,
    ) -> appex_models.InitSolutionBmsResponse:
        """
        Description: 速搭平台支持openapi创建应用
        Summary: 创建合约应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_solution_bms_ex(request, headers, runtime)

    async def init_solution_bms_async(
        self,
        request: appex_models.InitSolutionBmsRequest,
    ) -> appex_models.InitSolutionBmsResponse:
        """
        Description: 速搭平台支持openapi创建应用
        Summary: 创建合约应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_solution_bms_ex_async(request, headers, runtime)

    def init_solution_bms_ex(
        self,
        request: appex_models.InitSolutionBmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.InitSolutionBmsResponse:
        """
        Description: 速搭平台支持openapi创建应用
        Summary: 创建合约应用
        """
        UtilClient.validate_model(request)
        return appex_models.InitSolutionBmsResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.bms.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_solution_bms_ex_async(
        self,
        request: appex_models.InitSolutionBmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.InitSolutionBmsResponse:
        """
        Description: 速搭平台支持openapi创建应用
        Summary: 创建合约应用
        """
        UtilClient.validate_model(request)
        return appex_models.InitSolutionBmsResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.bms.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_solution_bms(
        self,
        request: appex_models.QuerySolutionBmsRequest,
    ) -> appex_models.QuerySolutionBmsResponse:
        """
        Description: 获取合约临时oss url
        Summary: 获取合约临时oss url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_solution_bms_ex(request, headers, runtime)

    async def query_solution_bms_async(
        self,
        request: appex_models.QuerySolutionBmsRequest,
    ) -> appex_models.QuerySolutionBmsResponse:
        """
        Description: 获取合约临时oss url
        Summary: 获取合约临时oss url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_solution_bms_ex_async(request, headers, runtime)

    def query_solution_bms_ex(
        self,
        request: appex_models.QuerySolutionBmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QuerySolutionBmsResponse:
        """
        Description: 获取合约临时oss url
        Summary: 获取合约临时oss url
        """
        UtilClient.validate_model(request)
        return appex_models.QuerySolutionBmsResponse().from_map(
            self.do_request('1.0', 'blockchain.appex.solution.bms.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_solution_bms_ex_async(
        self,
        request: appex_models.QuerySolutionBmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> appex_models.QuerySolutionBmsResponse:
        """
        Description: 获取合约临时oss url
        Summary: 获取合约临时oss url
        """
        UtilClient.validate_model(request)
        return appex_models.QuerySolutionBmsResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.appex.solution.bms.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
