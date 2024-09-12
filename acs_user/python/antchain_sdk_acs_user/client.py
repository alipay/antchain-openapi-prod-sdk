# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_acs_user import models as acs__user_models
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
        config: acs__user_models.Config,
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
            # 功能点信息
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
                    'sdk_version': '1.3.3',
                    '_prod_code': 'ACS_USER',
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
            # 功能点信息
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
                    'sdk_version': '1.3.3',
                    '_prod_code': 'ACS_USER',
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

    def query_accessor(
        self,
        request: acs__user_models.QueryAccessorRequest,
    ) -> acs__user_models.QueryAccessorResponse:
        """
        Description: acsgw来根据ak查询accessor的信息
        Summary: 根据ak查询accessor信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_accessor_ex(request, headers, runtime)

    async def query_accessor_async(
        self,
        request: acs__user_models.QueryAccessorRequest,
    ) -> acs__user_models.QueryAccessorResponse:
        """
        Description: acsgw来根据ak查询accessor的信息
        Summary: 根据ak查询accessor信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_accessor_ex_async(request, headers, runtime)

    def query_accessor_ex(
        self,
        request: acs__user_models.QueryAccessorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.QueryAccessorResponse:
        """
        Description: acsgw来根据ak查询accessor的信息
        Summary: 根据ak查询accessor信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.QueryAccessorResponse(),
            self.do_request('1.0', 'acs.user.accessor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_accessor_ex_async(
        self,
        request: acs__user_models.QueryAccessorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.QueryAccessorResponse:
        """
        Description: acsgw来根据ak查询accessor的信息
        Summary: 根据ak查询accessor信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.QueryAccessorResponse(),
            await self.do_request_async('1.0', 'acs.user.accessor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_userwithrole(
        self,
        request: acs__user_models.ListUserwithroleRequest,
    ) -> acs__user_models.ListUserwithroleResponse:
        """
        Description: 查询所有的用户与权限关系列表
        Summary: 获取用户角色信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_userwithrole_ex(request, headers, runtime)

    async def list_userwithrole_async(
        self,
        request: acs__user_models.ListUserwithroleRequest,
    ) -> acs__user_models.ListUserwithroleResponse:
        """
        Description: 查询所有的用户与权限关系列表
        Summary: 获取用户角色信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_userwithrole_ex_async(request, headers, runtime)

    def list_userwithrole_ex(
        self,
        request: acs__user_models.ListUserwithroleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListUserwithroleResponse:
        """
        Description: 查询所有的用户与权限关系列表
        Summary: 获取用户角色信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListUserwithroleResponse(),
            self.do_request('1.0', 'acs.user.userwithrole.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_userwithrole_ex_async(
        self,
        request: acs__user_models.ListUserwithroleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListUserwithroleResponse:
        """
        Description: 查询所有的用户与权限关系列表
        Summary: 获取用户角色信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListUserwithroleResponse(),
            await self.do_request_async('1.0', 'acs.user.userwithrole.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_session_token(
        self,
        request: acs__user_models.VerifySessionTokenRequest,
    ) -> acs__user_models.VerifySessionTokenResponse:
        """
        Description: 私有化场景用户登录态验证
        Summary: 私有化场景用户登录态验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_session_token_ex(request, headers, runtime)

    async def verify_session_token_async(
        self,
        request: acs__user_models.VerifySessionTokenRequest,
    ) -> acs__user_models.VerifySessionTokenResponse:
        """
        Description: 私有化场景用户登录态验证
        Summary: 私有化场景用户登录态验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_session_token_ex_async(request, headers, runtime)

    def verify_session_token_ex(
        self,
        request: acs__user_models.VerifySessionTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.VerifySessionTokenResponse:
        """
        Description: 私有化场景用户登录态验证
        Summary: 私有化场景用户登录态验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.VerifySessionTokenResponse(),
            self.do_request('1.0', 'acs.user.session.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_session_token_ex_async(
        self,
        request: acs__user_models.VerifySessionTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.VerifySessionTokenResponse:
        """
        Description: 私有化场景用户登录态验证
        Summary: 私有化场景用户登录态验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.VerifySessionTokenResponse(),
            await self.do_request_async('1.0', 'acs.user.session.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def judge_authority(
        self,
        request: acs__user_models.JudgeAuthorityRequest,
    ) -> acs__user_models.JudgeAuthorityResponse:
        """
        Description: 用户权限校验
        Summary: 用户权限校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_authority_ex(request, headers, runtime)

    async def judge_authority_async(
        self,
        request: acs__user_models.JudgeAuthorityRequest,
    ) -> acs__user_models.JudgeAuthorityResponse:
        """
        Description: 用户权限校验
        Summary: 用户权限校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_authority_ex_async(request, headers, runtime)

    def judge_authority_ex(
        self,
        request: acs__user_models.JudgeAuthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.JudgeAuthorityResponse:
        """
        Description: 用户权限校验
        Summary: 用户权限校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.JudgeAuthorityResponse(),
            self.do_request('1.0', 'acs.user.authority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_authority_ex_async(
        self,
        request: acs__user_models.JudgeAuthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.JudgeAuthorityResponse:
        """
        Description: 用户权限校验
        Summary: 用户权限校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.JudgeAuthorityResponse(),
            await self.do_request_async('1.0', 'acs.user.authority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_policy(
        self,
        request: acs__user_models.ListPolicyRequest,
    ) -> acs__user_models.ListPolicyResponse:
        """
        Description: 查询某个用户的权限
        Summary: 用户权限查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_policy_ex(request, headers, runtime)

    async def list_policy_async(
        self,
        request: acs__user_models.ListPolicyRequest,
    ) -> acs__user_models.ListPolicyResponse:
        """
        Description: 查询某个用户的权限
        Summary: 用户权限查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_policy_ex_async(request, headers, runtime)

    def list_policy_ex(
        self,
        request: acs__user_models.ListPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListPolicyResponse:
        """
        Description: 查询某个用户的权限
        Summary: 用户权限查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListPolicyResponse(),
            self.do_request('1.0', 'acs.user.policy.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_policy_ex_async(
        self,
        request: acs__user_models.ListPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListPolicyResponse:
        """
        Description: 查询某个用户的权限
        Summary: 用户权限查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListPolicyResponse(),
            await self.do_request_async('1.0', 'acs.user.policy.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user(
        self,
        request: acs__user_models.QueryUserRequest,
    ) -> acs__user_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_ex(request, headers, runtime)

    async def query_user_async(
        self,
        request: acs__user_models.QueryUserRequest,
    ) -> acs__user_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_ex_async(request, headers, runtime)

    def query_user_ex(
        self,
        request: acs__user_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.QueryUserResponse(),
            self.do_request('1.0', 'acs.user.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_ex_async(
        self,
        request: acs__user_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.QueryUserResponse(),
            await self.do_request_async('1.0', 'acs.user.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_tenant(
        self,
        request: acs__user_models.CreateTenantRequest,
    ) -> acs__user_models.CreateTenantResponse:
        """
        Description: 租户创建
        Summary: 租户创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_tenant_ex(request, headers, runtime)

    async def create_tenant_async(
        self,
        request: acs__user_models.CreateTenantRequest,
    ) -> acs__user_models.CreateTenantResponse:
        """
        Description: 租户创建
        Summary: 租户创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_tenant_ex_async(request, headers, runtime)

    def create_tenant_ex(
        self,
        request: acs__user_models.CreateTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.CreateTenantResponse:
        """
        Description: 租户创建
        Summary: 租户创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.CreateTenantResponse(),
            self.do_request('1.0', 'acs.user.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_tenant_ex_async(
        self,
        request: acs__user_models.CreateTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.CreateTenantResponse:
        """
        Description: 租户创建
        Summary: 租户创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.CreateTenantResponse(),
            await self.do_request_async('1.0', 'acs.user.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_auth_action(
        self,
        request: acs__user_models.ListAuthActionRequest,
    ) -> acs__user_models.ListAuthActionResponse:
        """
        Description: 获取归属某个产品的有效权限点列表
        Summary: 获取归属某个产品的有效权限点列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_auth_action_ex(request, headers, runtime)

    async def list_auth_action_async(
        self,
        request: acs__user_models.ListAuthActionRequest,
    ) -> acs__user_models.ListAuthActionResponse:
        """
        Description: 获取归属某个产品的有效权限点列表
        Summary: 获取归属某个产品的有效权限点列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_auth_action_ex_async(request, headers, runtime)

    def list_auth_action_ex(
        self,
        request: acs__user_models.ListAuthActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListAuthActionResponse:
        """
        Description: 获取归属某个产品的有效权限点列表
        Summary: 获取归属某个产品的有效权限点列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListAuthActionResponse(),
            self.do_request('1.0', 'acs.user.auth.action.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_auth_action_ex_async(
        self,
        request: acs__user_models.ListAuthActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListAuthActionResponse:
        """
        Description: 获取归属某个产品的有效权限点列表
        Summary: 获取归属某个产品的有效权限点列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListAuthActionResponse(),
            await self.do_request_async('1.0', 'acs.user.auth.action.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_role(
        self,
        request: acs__user_models.ListRoleRequest,
    ) -> acs__user_models.ListRoleResponse:
        """
        Description: 查询角色列表
        Summary: 角色列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_role_ex(request, headers, runtime)

    async def list_role_async(
        self,
        request: acs__user_models.ListRoleRequest,
    ) -> acs__user_models.ListRoleResponse:
        """
        Description: 查询角色列表
        Summary: 角色列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_role_ex_async(request, headers, runtime)

    def list_role_ex(
        self,
        request: acs__user_models.ListRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListRoleResponse:
        """
        Description: 查询角色列表
        Summary: 角色列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListRoleResponse(),
            self.do_request('1.0', 'acs.user.role.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_role_ex_async(
        self,
        request: acs__user_models.ListRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.ListRoleResponse:
        """
        Description: 查询角色列表
        Summary: 角色列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.ListRoleResponse(),
            await self.do_request_async('1.0', 'acs.user.role.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_user(
        self,
        request: acs__user_models.CreateUserRequest,
    ) -> acs__user_models.CreateUserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_user_ex(request, headers, runtime)

    async def create_user_async(
        self,
        request: acs__user_models.CreateUserRequest,
    ) -> acs__user_models.CreateUserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_user_ex_async(request, headers, runtime)

    def create_user_ex(
        self,
        request: acs__user_models.CreateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.CreateUserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.CreateUserResponse(),
            self.do_request('1.0', 'acs.user.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_user_ex_async(
        self,
        request: acs__user_models.CreateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.CreateUserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.CreateUserResponse(),
            await self.do_request_async('1.0', 'acs.user.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_user(
        self,
        request: acs__user_models.UpdateUserRequest,
    ) -> acs__user_models.UpdateUserResponse:
        """
        Description: 更新用户角色
        Summary: 更新用户角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_user_ex(request, headers, runtime)

    async def update_user_async(
        self,
        request: acs__user_models.UpdateUserRequest,
    ) -> acs__user_models.UpdateUserResponse:
        """
        Description: 更新用户角色
        Summary: 更新用户角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_user_ex_async(request, headers, runtime)

    def update_user_ex(
        self,
        request: acs__user_models.UpdateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.UpdateUserResponse:
        """
        Description: 更新用户角色
        Summary: 更新用户角色
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.UpdateUserResponse(),
            self.do_request('1.0', 'acs.user.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_user_ex_async(
        self,
        request: acs__user_models.UpdateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.UpdateUserResponse:
        """
        Description: 更新用户角色
        Summary: 更新用户角色
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.UpdateUserResponse(),
            await self.do_request_async('1.0', 'acs.user.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_user(
        self,
        request: acs__user_models.DeleteUserRequest,
    ) -> acs__user_models.DeleteUserResponse:
        """
        Description: 删除用户
        Summary: 删除用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_user_ex(request, headers, runtime)

    async def delete_user_async(
        self,
        request: acs__user_models.DeleteUserRequest,
    ) -> acs__user_models.DeleteUserResponse:
        """
        Description: 删除用户
        Summary: 删除用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_user_ex_async(request, headers, runtime)

    def delete_user_ex(
        self,
        request: acs__user_models.DeleteUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.DeleteUserResponse:
        """
        Description: 删除用户
        Summary: 删除用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.DeleteUserResponse(),
            self.do_request('1.0', 'acs.user.user.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_user_ex_async(
        self,
        request: acs__user_models.DeleteUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acs__user_models.DeleteUserResponse:
        """
        Description: 删除用户
        Summary: 删除用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acs__user_models.DeleteUserResponse(),
            await self.do_request_async('1.0', 'acs.user.user.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
