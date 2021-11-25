# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_acc import models as acc_models
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
        config: acc_models.Config,
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
            # 文件描述
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
                    'sdk_version': '1.1.51'
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
            # 文件描述
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
                    'sdk_version': '1.1.51'
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

    def verify_user_pwd(
        self,
        request: acc_models.VerifyUserPwdRequest,
    ) -> acc_models.VerifyUserPwdResponse:
        """
        Description: 账密登录(PWD_LOGIN)
        Summary: 账密登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_user_pwd_ex(request, headers, runtime)

    async def verify_user_pwd_async(
        self,
        request: acc_models.VerifyUserPwdRequest,
    ) -> acc_models.VerifyUserPwdResponse:
        """
        Description: 账密登录(PWD_LOGIN)
        Summary: 账密登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_user_pwd_ex_async(request, headers, runtime)

    def verify_user_pwd_ex(
        self,
        request: acc_models.VerifyUserPwdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyUserPwdResponse:
        """
        Description: 账密登录(PWD_LOGIN)
        Summary: 账密登录
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyUserPwdResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.pwd.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_user_pwd_ex_async(
        self,
        request: acc_models.VerifyUserPwdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyUserPwdResponse:
        """
        Description: 账密登录(PWD_LOGIN)
        Summary: 账密登录
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyUserPwdResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.pwd.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_user_sms(
        self,
        request: acc_models.ApplyUserSmsRequest,
    ) -> acc_models.ApplyUserSmsResponse:
        """
        Description: 短信登录申请
        Summary: 短信登录申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_user_sms_ex(request, headers, runtime)

    async def apply_user_sms_async(
        self,
        request: acc_models.ApplyUserSmsRequest,
    ) -> acc_models.ApplyUserSmsResponse:
        """
        Description: 短信登录申请
        Summary: 短信登录申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_user_sms_ex_async(request, headers, runtime)

    def apply_user_sms_ex(
        self,
        request: acc_models.ApplyUserSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.ApplyUserSmsResponse:
        """
        Description: 短信登录申请
        Summary: 短信登录申请
        """
        UtilClient.validate_model(request)
        return acc_models.ApplyUserSmsResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.sms.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_user_sms_ex_async(
        self,
        request: acc_models.ApplyUserSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.ApplyUserSmsResponse:
        """
        Description: 短信登录申请
        Summary: 短信登录申请
        """
        UtilClient.validate_model(request)
        return acc_models.ApplyUserSmsResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.sms.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_user_sms(
        self,
        request: acc_models.VerifyUserSmsRequest,
    ) -> acc_models.VerifyUserSmsResponse:
        """
        Description: 短信登录
        Summary: 短信登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_user_sms_ex(request, headers, runtime)

    async def verify_user_sms_async(
        self,
        request: acc_models.VerifyUserSmsRequest,
    ) -> acc_models.VerifyUserSmsResponse:
        """
        Description: 短信登录
        Summary: 短信登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_user_sms_ex_async(request, headers, runtime)

    def verify_user_sms_ex(
        self,
        request: acc_models.VerifyUserSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyUserSmsResponse:
        """
        Description: 短信登录
        Summary: 短信登录
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyUserSmsResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.sms.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_user_sms_ex_async(
        self,
        request: acc_models.VerifyUserSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyUserSmsResponse:
        """
        Description: 短信登录
        Summary: 短信登录
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyUserSmsResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.sms.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_user_ref(
        self,
        request: acc_models.AuthUserRefRequest,
    ) -> acc_models.AuthUserRefResponse:
        """
        Description: 关联登录
        Summary: 关联登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_user_ref_ex(request, headers, runtime)

    async def auth_user_ref_async(
        self,
        request: acc_models.AuthUserRefRequest,
    ) -> acc_models.AuthUserRefResponse:
        """
        Description: 关联登录
        Summary: 关联登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_user_ref_ex_async(request, headers, runtime)

    def auth_user_ref_ex(
        self,
        request: acc_models.AuthUserRefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AuthUserRefResponse:
        """
        Description: 关联登录
        Summary: 关联登录
        """
        UtilClient.validate_model(request)
        return acc_models.AuthUserRefResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.ref.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_user_ref_ex_async(
        self,
        request: acc_models.AuthUserRefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AuthUserRefResponse:
        """
        Description: 关联登录
        Summary: 关联登录
        """
        UtilClient.validate_model(request)
        return acc_models.AuthUserRefResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.ref.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_user_login(
        self,
        request: acc_models.CloseUserLoginRequest,
    ) -> acc_models.CloseUserLoginResponse:
        """
        Description: 退出登录
        Summary: 退出登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_user_login_ex(request, headers, runtime)

    async def close_user_login_async(
        self,
        request: acc_models.CloseUserLoginRequest,
    ) -> acc_models.CloseUserLoginResponse:
        """
        Description: 退出登录
        Summary: 退出登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_user_login_ex_async(request, headers, runtime)

    def close_user_login_ex(
        self,
        request: acc_models.CloseUserLoginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CloseUserLoginResponse:
        """
        Description: 退出登录
        Summary: 退出登录
        """
        UtilClient.validate_model(request)
        return acc_models.CloseUserLoginResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.login.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_user_login_ex_async(
        self,
        request: acc_models.CloseUserLoginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CloseUserLoginResponse:
        """
        Description: 退出登录
        Summary: 退出登录
        """
        UtilClient.validate_model(request)
        return acc_models.CloseUserLoginResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.login.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_user(
        self,
        request: acc_models.CreateUserRequest,
    ) -> acc_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_user_ex(request, headers, runtime)

    async def create_user_async(
        self,
        request: acc_models.CreateUserRequest,
    ) -> acc_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_user_ex_async(request, headers, runtime)

    def create_user_ex(
        self,
        request: acc_models.CreateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        UtilClient.validate_model(request)
        return acc_models.CreateUserResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_user_ex_async(
        self,
        request: acc_models.CreateUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateUserResponse:
        """
        Description: 用户注册
        Summary: 用户注册
        """
        UtilClient.validate_model(request)
        return acc_models.CreateUserResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_user_current(
        self,
        request: acc_models.GetUserCurrentRequest,
    ) -> acc_models.GetUserCurrentResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_user_current_ex(request, headers, runtime)

    async def get_user_current_async(
        self,
        request: acc_models.GetUserCurrentRequest,
    ) -> acc_models.GetUserCurrentResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_user_current_ex_async(request, headers, runtime)

    def get_user_current_ex(
        self,
        request: acc_models.GetUserCurrentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetUserCurrentResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        UtilClient.validate_model(request)
        return acc_models.GetUserCurrentResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.current.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_user_current_ex_async(
        self,
        request: acc_models.GetUserCurrentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetUserCurrentResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        UtilClient.validate_model(request)
        return acc_models.GetUserCurrentResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.current.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_firm(
        self,
        request: acc_models.VerifyFirmRequest,
    ) -> acc_models.VerifyFirmResponse:
        """
        Description: 企业认证
        Summary: 企业认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_firm_ex(request, headers, runtime)

    async def verify_firm_async(
        self,
        request: acc_models.VerifyFirmRequest,
    ) -> acc_models.VerifyFirmResponse:
        """
        Description: 企业认证
        Summary: 企业认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_firm_ex_async(request, headers, runtime)

    def verify_firm_ex(
        self,
        request: acc_models.VerifyFirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyFirmResponse:
        """
        Description: 企业认证
        Summary: 企业认证
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyFirmResponse().from_map(
            self.do_request('1.0', 'antchain.acc.firm.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_firm_ex_async(
        self,
        request: acc_models.VerifyFirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyFirmResponse:
        """
        Description: 企业认证
        Summary: 企业认证
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyFirmResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.firm.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_user(
        self,
        request: acc_models.VerifyUserRequest,
    ) -> acc_models.VerifyUserResponse:
        """
        Description: 个人认证
        Summary: 个人认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_user_ex(request, headers, runtime)

    async def verify_user_async(
        self,
        request: acc_models.VerifyUserRequest,
    ) -> acc_models.VerifyUserResponse:
        """
        Description: 个人认证
        Summary: 个人认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_user_ex_async(request, headers, runtime)

    def verify_user_ex(
        self,
        request: acc_models.VerifyUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyUserResponse:
        """
        Description: 个人认证
        Summary: 个人认证
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyUserResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_user_ex_async(
        self,
        request: acc_models.VerifyUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.VerifyUserResponse:
        """
        Description: 个人认证
        Summary: 个人认证
        """
        UtilClient.validate_model(request)
        return acc_models.VerifyUserResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_ocr_file(
        self,
        request: acc_models.RecognizeOcrFileRequest,
    ) -> acc_models.RecognizeOcrFileResponse:
        """
        Description: ocr_文件识别接口
        Summary: ocr_文件识别接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_ocr_file_ex(request, headers, runtime)

    async def recognize_ocr_file_async(
        self,
        request: acc_models.RecognizeOcrFileRequest,
    ) -> acc_models.RecognizeOcrFileResponse:
        """
        Description: ocr_文件识别接口
        Summary: ocr_文件识别接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_ocr_file_ex_async(request, headers, runtime)

    def recognize_ocr_file_ex(
        self,
        request: acc_models.RecognizeOcrFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.RecognizeOcrFileResponse:
        """
        Description: ocr_文件识别接口
        Summary: ocr_文件识别接口
        """
        UtilClient.validate_model(request)
        return acc_models.RecognizeOcrFileResponse().from_map(
            self.do_request('1.0', 'antchain.acc.ocr.file.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_ocr_file_ex_async(
        self,
        request: acc_models.RecognizeOcrFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.RecognizeOcrFileResponse:
        """
        Description: ocr_文件识别接口
        Summary: ocr_文件识别接口
        """
        UtilClient.validate_model(request)
        return acc_models.RecognizeOcrFileResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.ocr.file.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_certify_firmmeta(
        self,
        request: acc_models.CertifyCertifyFirmmetaRequest,
    ) -> acc_models.CertifyCertifyFirmmetaResponse:
        """
        Description: 输入企业的四要素进行认证。
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_certify_firmmeta_ex(request, headers, runtime)

    async def certify_certify_firmmeta_async(
        self,
        request: acc_models.CertifyCertifyFirmmetaRequest,
    ) -> acc_models.CertifyCertifyFirmmetaResponse:
        """
        Description: 输入企业的四要素进行认证。
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_certify_firmmeta_ex_async(request, headers, runtime)

    def certify_certify_firmmeta_ex(
        self,
        request: acc_models.CertifyCertifyFirmmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CertifyCertifyFirmmetaResponse:
        """
        Description: 输入企业的四要素进行认证。
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return acc_models.CertifyCertifyFirmmetaResponse().from_map(
            self.do_request('1.0', 'antchain.acc.certify.firmmeta.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_certify_firmmeta_ex_async(
        self,
        request: acc_models.CertifyCertifyFirmmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CertifyCertifyFirmmetaResponse:
        """
        Description: 输入企业的四要素进行认证。
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return acc_models.CertifyCertifyFirmmetaResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.certify.firmmeta.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_certify_personmeta(
        self,
        request: acc_models.CertifyCertifyPersonmetaRequest,
    ) -> acc_models.CertifyCertifyPersonmetaResponse:
        """
        Description: 输入个人的二要素进行认证。
        Summary: 个人二要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_certify_personmeta_ex(request, headers, runtime)

    async def certify_certify_personmeta_async(
        self,
        request: acc_models.CertifyCertifyPersonmetaRequest,
    ) -> acc_models.CertifyCertifyPersonmetaResponse:
        """
        Description: 输入个人的二要素进行认证。
        Summary: 个人二要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_certify_personmeta_ex_async(request, headers, runtime)

    def certify_certify_personmeta_ex(
        self,
        request: acc_models.CertifyCertifyPersonmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CertifyCertifyPersonmetaResponse:
        """
        Description: 输入个人的二要素进行认证。
        Summary: 个人二要素认证
        """
        UtilClient.validate_model(request)
        return acc_models.CertifyCertifyPersonmetaResponse().from_map(
            self.do_request('1.0', 'antchain.acc.certify.personmeta.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_certify_personmeta_ex_async(
        self,
        request: acc_models.CertifyCertifyPersonmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CertifyCertifyPersonmetaResponse:
        """
        Description: 输入个人的二要素进行认证。
        Summary: 个人二要素认证
        """
        UtilClient.validate_model(request)
        return acc_models.CertifyCertifyPersonmetaResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.certify.personmeta.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_certify_face(
        self,
        request: acc_models.CertifyCertifyFaceRequest,
    ) -> acc_models.CertifyCertifyFaceResponse:
        """
        Description: 人脸识别认证
        Summary: 人脸识别认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_certify_face_ex(request, headers, runtime)

    async def certify_certify_face_async(
        self,
        request: acc_models.CertifyCertifyFaceRequest,
    ) -> acc_models.CertifyCertifyFaceResponse:
        """
        Description: 人脸识别认证
        Summary: 人脸识别认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_certify_face_ex_async(request, headers, runtime)

    def certify_certify_face_ex(
        self,
        request: acc_models.CertifyCertifyFaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CertifyCertifyFaceResponse:
        """
        Description: 人脸识别认证
        Summary: 人脸识别认证
        """
        UtilClient.validate_model(request)
        return acc_models.CertifyCertifyFaceResponse().from_map(
            self.do_request('1.0', 'antchain.acc.certify.face.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_certify_face_ex_async(
        self,
        request: acc_models.CertifyCertifyFaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CertifyCertifyFaceResponse:
        """
        Description: 人脸识别认证
        Summary: 人脸识别认证
        """
        UtilClient.validate_model(request)
        return acc_models.CertifyCertifyFaceResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.certify.face.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_query_facecertify(
        self,
        request: acc_models.QueryQueryFacecertifyRequest,
    ) -> acc_models.QueryQueryFacecertifyResponse:
        """
        Description: 查询人脸识别结果
        Summary: 人脸识别结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_query_facecertify_ex(request, headers, runtime)

    async def query_query_facecertify_async(
        self,
        request: acc_models.QueryQueryFacecertifyRequest,
    ) -> acc_models.QueryQueryFacecertifyResponse:
        """
        Description: 查询人脸识别结果
        Summary: 人脸识别结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_query_facecertify_ex_async(request, headers, runtime)

    def query_query_facecertify_ex(
        self,
        request: acc_models.QueryQueryFacecertifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryQueryFacecertifyResponse:
        """
        Description: 查询人脸识别结果
        Summary: 人脸识别结果查询
        """
        UtilClient.validate_model(request)
        return acc_models.QueryQueryFacecertifyResponse().from_map(
            self.do_request('1.0', 'antchain.acc.query.facecertify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_query_facecertify_ex_async(
        self,
        request: acc_models.QueryQueryFacecertifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryQueryFacecertifyResponse:
        """
        Description: 查询人脸识别结果
        Summary: 人脸识别结果查询
        """
        UtilClient.validate_model(request)
        return acc_models.QueryQueryFacecertifyResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.query.facecertify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_switch_firmid(
        self,
        request: acc_models.SwitchSwitchFirmidRequest,
    ) -> acc_models.SwitchSwitchFirmidResponse:
        """
        Description: 每次切换企业，同步当前企业id
        Summary: 控制台切换企业同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_switch_firmid_ex(request, headers, runtime)

    async def switch_switch_firmid_async(
        self,
        request: acc_models.SwitchSwitchFirmidRequest,
    ) -> acc_models.SwitchSwitchFirmidResponse:
        """
        Description: 每次切换企业，同步当前企业id
        Summary: 控制台切换企业同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_switch_firmid_ex_async(request, headers, runtime)

    def switch_switch_firmid_ex(
        self,
        request: acc_models.SwitchSwitchFirmidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SwitchSwitchFirmidResponse:
        """
        Description: 每次切换企业，同步当前企业id
        Summary: 控制台切换企业同步
        """
        UtilClient.validate_model(request)
        return acc_models.SwitchSwitchFirmidResponse().from_map(
            self.do_request('1.0', 'antchain.acc.switch.firmid.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_switch_firmid_ex_async(
        self,
        request: acc_models.SwitchSwitchFirmidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SwitchSwitchFirmidResponse:
        """
        Description: 每次切换企业，同步当前企业id
        Summary: 控制台切换企业同步
        """
        UtilClient.validate_model(request)
        return acc_models.SwitchSwitchFirmidResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.switch.firmid.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_query_firmfinancial(
        self,
        request: acc_models.QueryQueryFirmfinancialRequest,
    ) -> acc_models.QueryQueryFirmfinancialResponse:
        """
        Description: 企业身份中心查询企业财报
        Summary: 查询企业财报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_query_firmfinancial_ex(request, headers, runtime)

    async def query_query_firmfinancial_async(
        self,
        request: acc_models.QueryQueryFirmfinancialRequest,
    ) -> acc_models.QueryQueryFirmfinancialResponse:
        """
        Description: 企业身份中心查询企业财报
        Summary: 查询企业财报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_query_firmfinancial_ex_async(request, headers, runtime)

    def query_query_firmfinancial_ex(
        self,
        request: acc_models.QueryQueryFirmfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryQueryFirmfinancialResponse:
        """
        Description: 企业身份中心查询企业财报
        Summary: 查询企业财报
        """
        UtilClient.validate_model(request)
        return acc_models.QueryQueryFirmfinancialResponse().from_map(
            self.do_request('1.0', 'antchain.acc.query.firmfinancial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_query_firmfinancial_ex_async(
        self,
        request: acc_models.QueryQueryFirmfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryQueryFirmfinancialResponse:
        """
        Description: 企业身份中心查询企业财报
        Summary: 查询企业财报
        """
        UtilClient.validate_model(request)
        return acc_models.QueryQueryFirmfinancialResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.query.firmfinancial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_switch_firmfinancial(
        self,
        request: acc_models.SwitchSwitchFirmfinancialRequest,
    ) -> acc_models.SwitchSwitchFirmfinancialResponse:
        """
        Description: 企业身份中心新增或删除企业财报
        Summary: 新增/删除企业财报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_switch_firmfinancial_ex(request, headers, runtime)

    async def switch_switch_firmfinancial_async(
        self,
        request: acc_models.SwitchSwitchFirmfinancialRequest,
    ) -> acc_models.SwitchSwitchFirmfinancialResponse:
        """
        Description: 企业身份中心新增或删除企业财报
        Summary: 新增/删除企业财报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_switch_firmfinancial_ex_async(request, headers, runtime)

    def switch_switch_firmfinancial_ex(
        self,
        request: acc_models.SwitchSwitchFirmfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SwitchSwitchFirmfinancialResponse:
        """
        Description: 企业身份中心新增或删除企业财报
        Summary: 新增/删除企业财报
        """
        UtilClient.validate_model(request)
        return acc_models.SwitchSwitchFirmfinancialResponse().from_map(
            self.do_request('1.0', 'antchain.acc.switch.firmfinancial.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_switch_firmfinancial_ex_async(
        self,
        request: acc_models.SwitchSwitchFirmfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SwitchSwitchFirmfinancialResponse:
        """
        Description: 企业身份中心新增或删除企业财报
        Summary: 新增/删除企业财报
        """
        UtilClient.validate_model(request)
        return acc_models.SwitchSwitchFirmfinancialResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.switch.firmfinancial.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did(
        self,
        request: acc_models.CreateDidRequest,
    ) -> acc_models.CreateDidResponse:
        """
        Description: 生成企业/个人did
        Summary: 生成企业/个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_ex(request, headers, runtime)

    async def create_did_async(
        self,
        request: acc_models.CreateDidRequest,
    ) -> acc_models.CreateDidResponse:
        """
        Description: 生成企业/个人did
        Summary: 生成企业/个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_ex_async(request, headers, runtime)

    def create_did_ex(
        self,
        request: acc_models.CreateDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateDidResponse:
        """
        Description: 生成企业/个人did
        Summary: 生成企业/个人did
        """
        UtilClient.validate_model(request)
        return acc_models.CreateDidResponse().from_map(
            self.do_request('1.0', 'antchain.acc.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_ex_async(
        self,
        request: acc_models.CreateDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateDidResponse:
        """
        Description: 生成企业/个人did
        Summary: 生成企业/个人did
        """
        UtilClient.validate_model(request)
        return acc_models.CreateDidResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_platform(
        self,
        request: acc_models.CreateContractPlatformRequest,
    ) -> acc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_platform_ex(request, headers, runtime)

    async def create_contract_platform_async(
        self,
        request: acc_models.CreateContractPlatformRequest,
    ) -> acc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_platform_ex_async(request, headers, runtime)

    def create_contract_platform_ex(
        self,
        request: acc_models.CreateContractPlatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractPlatformResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.platform.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_platform_ex_async(
        self,
        request: acc_models.CreateContractPlatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractPlatformResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.platform.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_document(
        self,
        request: acc_models.AddContractDocumentRequest,
    ) -> acc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_document_ex(request, headers, runtime)

    async def add_contract_document_async(
        self,
        request: acc_models.AddContractDocumentRequest,
    ) -> acc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_document_ex_async(request, headers, runtime)

    def add_contract_document_ex(
        self,
        request: acc_models.AddContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        UtilClient.validate_model(request)
        return acc_models.AddContractDocumentResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.document.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_document_ex_async(
        self,
        request: acc_models.AddContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        UtilClient.validate_model(request)
        return acc_models.AddContractDocumentResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.document.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_file(
        self,
        request: acc_models.AddContractFileRequest,
    ) -> acc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_file_ex(request, headers, runtime)

    async def add_contract_file_async(
        self,
        request: acc_models.AddContractFileRequest,
    ) -> acc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_file_ex_async(request, headers, runtime)

    def add_contract_file_ex(
        self,
        request: acc_models.AddContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        UtilClient.validate_model(request)
        return acc_models.AddContractFileResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.file.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_file_ex_async(
        self,
        request: acc_models.AddContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        UtilClient.validate_model(request)
        return acc_models.AddContractFileResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.file.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_contract_callbackkey(
        self,
        request: acc_models.ApplyContractCallbackkeyRequest,
    ) -> acc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_contract_callbackkey_ex(request, headers, runtime)

    async def apply_contract_callbackkey_async(
        self,
        request: acc_models.ApplyContractCallbackkeyRequest,
    ) -> acc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_contract_callbackkey_ex_async(request, headers, runtime)

    def apply_contract_callbackkey_ex(
        self,
        request: acc_models.ApplyContractCallbackkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        UtilClient.validate_model(request)
        return acc_models.ApplyContractCallbackkeyResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.callbackkey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_contract_callbackkey_ex_async(
        self,
        request: acc_models.ApplyContractCallbackkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        UtilClient.validate_model(request)
        return acc_models.ApplyContractCallbackkeyResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.callbackkey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_contract_sign(
        self,
        request: acc_models.AuthContractSignRequest,
    ) -> acc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_contract_sign_ex(request, headers, runtime)

    async def auth_contract_sign_async(
        self,
        request: acc_models.AuthContractSignRequest,
    ) -> acc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_contract_sign_ex_async(request, headers, runtime)

    def auth_contract_sign_ex(
        self,
        request: acc_models.AuthContractSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        UtilClient.validate_model(request)
        return acc_models.AuthContractSignResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.sign.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_contract_sign_ex_async(
        self,
        request: acc_models.AuthContractSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        UtilClient.validate_model(request)
        return acc_models.AuthContractSignResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.sign.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_template(
        self,
        request: acc_models.CreateContractTemplateRequest,
    ) -> acc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_template_ex(request, headers, runtime)

    async def create_contract_template_async(
        self,
        request: acc_models.CreateContractTemplateRequest,
    ) -> acc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_template_ex_async(request, headers, runtime)

    def create_contract_template_ex(
        self,
        request: acc_models.CreateContractTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractTemplateResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_template_ex_async(
        self,
        request: acc_models.CreateContractTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractTemplateResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_signflow(
        self,
        request: acc_models.CreateContractSignflowRequest,
    ) -> acc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_signflow_ex(request, headers, runtime)

    async def create_contract_signflow_async(
        self,
        request: acc_models.CreateContractSignflowRequest,
    ) -> acc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_signflow_ex_async(request, headers, runtime)

    def create_contract_signflow_ex(
        self,
        request: acc_models.CreateContractSignflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractSignflowResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.signflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_signflow_ex_async(
        self,
        request: acc_models.CreateContractSignflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractSignflowResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.signflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_fileuploadurl(
        self,
        request: acc_models.GetContractFileuploadurlRequest,
    ) -> acc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_fileuploadurl_ex(request, headers, runtime)

    async def get_contract_fileuploadurl_async(
        self,
        request: acc_models.GetContractFileuploadurlRequest,
    ) -> acc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_fileuploadurl_ex_async(request, headers, runtime)

    def get_contract_fileuploadurl_ex(
        self,
        request: acc_models.GetContractFileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        UtilClient.validate_model(request)
        return acc_models.GetContractFileuploadurlResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.fileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_fileuploadurl_ex_async(
        self,
        request: acc_models.GetContractFileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        UtilClient.validate_model(request)
        return acc_models.GetContractFileuploadurlResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.fileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_signfield(
        self,
        request: acc_models.AddContractSignfieldRequest,
    ) -> acc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_signfield_ex(request, headers, runtime)

    async def add_contract_signfield_async(
        self,
        request: acc_models.AddContractSignfieldRequest,
    ) -> acc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_signfield_ex_async(request, headers, runtime)

    def add_contract_signfield_ex(
        self,
        request: acc_models.AddContractSignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        UtilClient.validate_model(request)
        return acc_models.AddContractSignfieldResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.signfield.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_signfield_ex_async(
        self,
        request: acc_models.AddContractSignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        UtilClient.validate_model(request)
        return acc_models.AddContractSignfieldResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.signfield.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_handsignfield(
        self,
        request: acc_models.CreateContractHandsignfieldRequest,
    ) -> acc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_handsignfield_ex(request, headers, runtime)

    async def create_contract_handsignfield_async(
        self,
        request: acc_models.CreateContractHandsignfieldRequest,
    ) -> acc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_handsignfield_ex_async(request, headers, runtime)

    def create_contract_handsignfield_ex(
        self,
        request: acc_models.CreateContractHandsignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractHandsignfieldResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.handsignfield.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_handsignfield_ex_async(
        self,
        request: acc_models.CreateContractHandsignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractHandsignfieldResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.handsignfield.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_contract_flow(
        self,
        request: acc_models.StartContractFlowRequest,
    ) -> acc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_contract_flow_ex(request, headers, runtime)

    async def start_contract_flow_async(
        self,
        request: acc_models.StartContractFlowRequest,
    ) -> acc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_contract_flow_ex_async(request, headers, runtime)

    def start_contract_flow_ex(
        self,
        request: acc_models.StartContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        UtilClient.validate_model(request)
        return acc_models.StartContractFlowResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.flow.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_contract_flow_ex_async(
        self,
        request: acc_models.StartContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        UtilClient.validate_model(request)
        return acc_models.StartContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.flow.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_signurl(
        self,
        request: acc_models.GetContractSignurlRequest,
    ) -> acc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_signurl_ex(request, headers, runtime)

    async def get_contract_signurl_async(
        self,
        request: acc_models.GetContractSignurlRequest,
    ) -> acc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_signurl_ex_async(request, headers, runtime)

    def get_contract_signurl_ex(
        self,
        request: acc_models.GetContractSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        UtilClient.validate_model(request)
        return acc_models.GetContractSignurlResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.signurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_signurl_ex_async(
        self,
        request: acc_models.GetContractSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        UtilClient.validate_model(request)
        return acc_models.GetContractSignurlResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.signurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_contract_document(
        self,
        request: acc_models.DownloadContractDocumentRequest,
    ) -> acc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_contract_document_ex(request, headers, runtime)

    async def download_contract_document_async(
        self,
        request: acc_models.DownloadContractDocumentRequest,
    ) -> acc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_contract_document_ex_async(request, headers, runtime)

    def download_contract_document_ex(
        self,
        request: acc_models.DownloadContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        UtilClient.validate_model(request)
        return acc_models.DownloadContractDocumentResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.document.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_contract_document_ex_async(
        self,
        request: acc_models.DownloadContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        UtilClient.validate_model(request)
        return acc_models.DownloadContractDocumentResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.document.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_contract_flow(
        self,
        request: acc_models.SaveContractFlowRequest,
    ) -> acc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_contract_flow_ex(request, headers, runtime)

    async def save_contract_flow_async(
        self,
        request: acc_models.SaveContractFlowRequest,
    ) -> acc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_contract_flow_ex_async(request, headers, runtime)

    def save_contract_flow_ex(
        self,
        request: acc_models.SaveContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        UtilClient.validate_model(request)
        return acc_models.SaveContractFlowResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.flow.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_contract_flow_ex_async(
        self,
        request: acc_models.SaveContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        UtilClient.validate_model(request)
        return acc_models.SaveContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.flow.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_flow(
        self,
        request: acc_models.QueryContractFlowRequest,
    ) -> acc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_flow_ex(request, headers, runtime)

    async def query_contract_flow_async(
        self,
        request: acc_models.QueryContractFlowRequest,
    ) -> acc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_flow_ex_async(request, headers, runtime)

    def query_contract_flow_ex(
        self,
        request: acc_models.QueryContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractFlowResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.flow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_flow_ex_async(
        self,
        request: acc_models.QueryContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.flow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_file(
        self,
        request: acc_models.GetContractFileRequest,
    ) -> acc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_file_ex(request, headers, runtime)

    async def get_contract_file_async(
        self,
        request: acc_models.GetContractFileRequest,
    ) -> acc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_file_ex_async(request, headers, runtime)

    def get_contract_file_ex(
        self,
        request: acc_models.GetContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        UtilClient.validate_model(request)
        return acc_models.GetContractFileResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_file_ex_async(
        self,
        request: acc_models.GetContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        UtilClient.validate_model(request)
        return acc_models.GetContractFileResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_notary(
        self,
        request: acc_models.QueryContractNotaryRequest,
    ) -> acc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_notary_ex(request, headers, runtime)

    async def query_contract_notary_async(
        self,
        request: acc_models.QueryContractNotaryRequest,
    ) -> acc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_notary_ex_async(request, headers, runtime)

    def query_contract_notary_ex(
        self,
        request: acc_models.QueryContractNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractNotaryResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.notary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_notary_ex_async(
        self,
        request: acc_models.QueryContractNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractNotaryResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.notary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_accountsealimage(
        self,
        request: acc_models.CreateContractAccountsealimageRequest,
    ) -> acc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_accountsealimage_ex(request, headers, runtime)

    async def create_contract_accountsealimage_async(
        self,
        request: acc_models.CreateContractAccountsealimageRequest,
    ) -> acc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_accountsealimage_ex_async(request, headers, runtime)

    def create_contract_accountsealimage_ex(
        self,
        request: acc_models.CreateContractAccountsealimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractAccountsealimageResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.accountsealimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_accountsealimage_ex_async(
        self,
        request: acc_models.CreateContractAccountsealimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractAccountsealimageResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.accountsealimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_onestepflow(
        self,
        request: acc_models.CreateContractOnestepflowRequest,
    ) -> acc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_onestepflow_ex(request, headers, runtime)

    async def create_contract_onestepflow_async(
        self,
        request: acc_models.CreateContractOnestepflowRequest,
    ) -> acc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_onestepflow_ex_async(request, headers, runtime)

    def create_contract_onestepflow_ex(
        self,
        request: acc_models.CreateContractOnestepflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractOnestepflowResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.onestepflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_onestepflow_ex_async(
        self,
        request: acc_models.CreateContractOnestepflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractOnestepflowResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.onestepflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_flowsigner(
        self,
        request: acc_models.QueryContractFlowsignerRequest,
    ) -> acc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_flowsigner_ex(request, headers, runtime)

    async def query_contract_flowsigner_async(
        self,
        request: acc_models.QueryContractFlowsignerRequest,
    ) -> acc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_flowsigner_ex_async(request, headers, runtime)

    def query_contract_flowsigner_ex(
        self,
        request: acc_models.QueryContractFlowsignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractFlowsignerResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.flowsigner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_flowsigner_ex_async(
        self,
        request: acc_models.QueryContractFlowsignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractFlowsignerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.flowsigner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_signfields(
        self,
        request: acc_models.QueryContractSignfieldsRequest,
    ) -> acc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_signfields_ex(request, headers, runtime)

    async def query_contract_signfields_async(
        self,
        request: acc_models.QueryContractSignfieldsRequest,
    ) -> acc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_signfields_ex_async(request, headers, runtime)

    def query_contract_signfields_ex(
        self,
        request: acc_models.QueryContractSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractSignfieldsResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_signfields_ex_async(
        self,
        request: acc_models.QueryContractSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        UtilClient.validate_model(request)
        return acc_models.QueryContractSignfieldsResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_contract_signer(
        self,
        request: acc_models.DeleteContractSignerRequest,
    ) -> acc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_contract_signer_ex(request, headers, runtime)

    async def delete_contract_signer_async(
        self,
        request: acc_models.DeleteContractSignerRequest,
    ) -> acc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_contract_signer_ex_async(request, headers, runtime)

    def delete_contract_signer_ex(
        self,
        request: acc_models.DeleteContractSignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        UtilClient.validate_model(request)
        return acc_models.DeleteContractSignerResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.signer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_contract_signer_ex_async(
        self,
        request: acc_models.DeleteContractSignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        UtilClient.validate_model(request)
        return acc_models.DeleteContractSignerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.signer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_ecp_cloud(
        self,
        request: acc_models.SyncEcpCloudRequest,
    ) -> acc_models.SyncEcpCloudResponse:
        """
        Description: ecp同步金融云,内部通道
        Summary: ecp同步金融云,内部通道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_ecp_cloud_ex(request, headers, runtime)

    async def sync_ecp_cloud_async(
        self,
        request: acc_models.SyncEcpCloudRequest,
    ) -> acc_models.SyncEcpCloudResponse:
        """
        Description: ecp同步金融云,内部通道
        Summary: ecp同步金融云,内部通道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_ecp_cloud_ex_async(request, headers, runtime)

    def sync_ecp_cloud_ex(
        self,
        request: acc_models.SyncEcpCloudRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SyncEcpCloudResponse:
        """
        Description: ecp同步金融云,内部通道
        Summary: ecp同步金融云,内部通道
        """
        UtilClient.validate_model(request)
        return acc_models.SyncEcpCloudResponse().from_map(
            self.do_request('1.0', 'antchain.acc.ecp.cloud.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_ecp_cloud_ex_async(
        self,
        request: acc_models.SyncEcpCloudRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.SyncEcpCloudResponse:
        """
        Description: ecp同步金融云,内部通道
        Summary: ecp同步金融云,内部通道
        """
        UtilClient.validate_model(request)
        return acc_models.SyncEcpCloudResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.ecp.cloud.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_oauth_url(
        self,
        request: acc_models.CreateOauthUrlRequest,
    ) -> acc_models.CreateOauthUrlResponse:
        """
        Description: 生成url跳转登录
        Summary: 生成url跳转登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_oauth_url_ex(request, headers, runtime)

    async def create_oauth_url_async(
        self,
        request: acc_models.CreateOauthUrlRequest,
    ) -> acc_models.CreateOauthUrlResponse:
        """
        Description: 生成url跳转登录
        Summary: 生成url跳转登录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_oauth_url_ex_async(request, headers, runtime)

    def create_oauth_url_ex(
        self,
        request: acc_models.CreateOauthUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateOauthUrlResponse:
        """
        Description: 生成url跳转登录
        Summary: 生成url跳转登录
        """
        UtilClient.validate_model(request)
        return acc_models.CreateOauthUrlResponse().from_map(
            self.do_request('1.0', 'antchain.acc.oauth.url.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_oauth_url_ex_async(
        self,
        request: acc_models.CreateOauthUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateOauthUrlResponse:
        """
        Description: 生成url跳转登录
        Summary: 生成url跳转登录
        """
        UtilClient.validate_model(request)
        return acc_models.CreateOauthUrlResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.oauth.url.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_oauth_token(
        self,
        request: acc_models.GetOauthTokenRequest,
    ) -> acc_models.GetOauthTokenResponse:
        """
        Description: 获取token
        Summary: 获取token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_oauth_token_ex(request, headers, runtime)

    async def get_oauth_token_async(
        self,
        request: acc_models.GetOauthTokenRequest,
    ) -> acc_models.GetOauthTokenResponse:
        """
        Description: 获取token
        Summary: 获取token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_oauth_token_ex_async(request, headers, runtime)

    def get_oauth_token_ex(
        self,
        request: acc_models.GetOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetOauthTokenResponse:
        """
        Description: 获取token
        Summary: 获取token
        """
        UtilClient.validate_model(request)
        return acc_models.GetOauthTokenResponse().from_map(
            self.do_request('1.0', 'antchain.acc.oauth.token.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_oauth_token_ex_async(
        self,
        request: acc_models.GetOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetOauthTokenResponse:
        """
        Description: 获取token
        Summary: 获取token
        """
        UtilClient.validate_model(request)
        return acc_models.GetOauthTokenResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.oauth.token.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_oauth_tokendetail(
        self,
        request: acc_models.GetOauthTokendetailRequest,
    ) -> acc_models.GetOauthTokendetailResponse:
        """
        Description: token明细获取
        Summary: token明细获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_oauth_tokendetail_ex(request, headers, runtime)

    async def get_oauth_tokendetail_async(
        self,
        request: acc_models.GetOauthTokendetailRequest,
    ) -> acc_models.GetOauthTokendetailResponse:
        """
        Description: token明细获取
        Summary: token明细获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_oauth_tokendetail_ex_async(request, headers, runtime)

    def get_oauth_tokendetail_ex(
        self,
        request: acc_models.GetOauthTokendetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetOauthTokendetailResponse:
        """
        Description: token明细获取
        Summary: token明细获取
        """
        UtilClient.validate_model(request)
        return acc_models.GetOauthTokendetailResponse().from_map(
            self.do_request('1.0', 'antchain.acc.oauth.tokendetail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_oauth_tokendetail_ex_async(
        self,
        request: acc_models.GetOauthTokendetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.GetOauthTokendetailResponse:
        """
        Description: token明细获取
        Summary: token明细获取
        """
        UtilClient.validate_model(request)
        return acc_models.GetOauthTokendetailResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.oauth.tokendetail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_session_alive(
        self,
        request: acc_models.CheckSessionAliveRequest,
    ) -> acc_models.CheckSessionAliveResponse:
        """
        Description: session判活
        Summary: session判活
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_session_alive_ex(request, headers, runtime)

    async def check_session_alive_async(
        self,
        request: acc_models.CheckSessionAliveRequest,
    ) -> acc_models.CheckSessionAliveResponse:
        """
        Description: session判活
        Summary: session判活
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_session_alive_ex_async(request, headers, runtime)

    def check_session_alive_ex(
        self,
        request: acc_models.CheckSessionAliveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CheckSessionAliveResponse:
        """
        Description: session判活
        Summary: session判活
        """
        UtilClient.validate_model(request)
        return acc_models.CheckSessionAliveResponse().from_map(
            self.do_request('1.0', 'antchain.acc.session.alive.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_session_alive_ex_async(
        self,
        request: acc_models.CheckSessionAliveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CheckSessionAliveResponse:
        """
        Description: session判活
        Summary: session判活
        """
        UtilClient.validate_model(request)
        return acc_models.CheckSessionAliveResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.session.alive.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_partner_async(
        self,
        request: acc_models.NotifyPartnerAsyncRequest,
    ) -> acc_models.NotifyPartnerAsyncResponse:
        """
        Description: 外部合作伙伴异步通知接口
        Summary: 外部合作伙伴异步通知接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_partner_async_ex(request, headers, runtime)

    async def notify_partner_async_async(
        self,
        request: acc_models.NotifyPartnerAsyncRequest,
    ) -> acc_models.NotifyPartnerAsyncResponse:
        """
        Description: 外部合作伙伴异步通知接口
        Summary: 外部合作伙伴异步通知接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_partner_async_ex_async(request, headers, runtime)

    def notify_partner_async_ex(
        self,
        request: acc_models.NotifyPartnerAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.NotifyPartnerAsyncResponse:
        """
        Description: 外部合作伙伴异步通知接口
        Summary: 外部合作伙伴异步通知接口
        """
        UtilClient.validate_model(request)
        return acc_models.NotifyPartnerAsyncResponse().from_map(
            self.do_request('1.0', 'antchain.acc.partner.async.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_partner_async_ex_async(
        self,
        request: acc_models.NotifyPartnerAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.NotifyPartnerAsyncResponse:
        """
        Description: 外部合作伙伴异步通知接口
        Summary: 外部合作伙伴异步通知接口
        """
        UtilClient.validate_model(request)
        return acc_models.NotifyPartnerAsyncResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.partner.async.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_project_base(
        self,
        request: acc_models.CreateProjectBaseRequest,
    ) -> acc_models.CreateProjectBaseResponse:
        """
        Description: 创建一条项目基本信息
        Summary: 创建一条项目基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_project_base_ex(request, headers, runtime)

    async def create_project_base_async(
        self,
        request: acc_models.CreateProjectBaseRequest,
    ) -> acc_models.CreateProjectBaseResponse:
        """
        Description: 创建一条项目基本信息
        Summary: 创建一条项目基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_project_base_ex_async(request, headers, runtime)

    def create_project_base_ex(
        self,
        request: acc_models.CreateProjectBaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateProjectBaseResponse:
        """
        Description: 创建一条项目基本信息
        Summary: 创建一条项目基本信息
        """
        UtilClient.validate_model(request)
        return acc_models.CreateProjectBaseResponse().from_map(
            self.do_request('1.0', 'antchain.acc.project.base.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_project_base_ex_async(
        self,
        request: acc_models.CreateProjectBaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateProjectBaseResponse:
        """
        Description: 创建一条项目基本信息
        Summary: 创建一条项目基本信息
        """
        UtilClient.validate_model(request)
        return acc_models.CreateProjectBaseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.project.base.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_workers_base(
        self,
        request: acc_models.BatchcreateWorkersBaseRequest,
    ) -> acc_models.BatchcreateWorkersBaseResponse:
        """
        Description: 批量新增农民工基本信息
        Summary: 批量新增农民工基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_workers_base_ex(request, headers, runtime)

    async def batchcreate_workers_base_async(
        self,
        request: acc_models.BatchcreateWorkersBaseRequest,
    ) -> acc_models.BatchcreateWorkersBaseResponse:
        """
        Description: 批量新增农民工基本信息
        Summary: 批量新增农民工基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_workers_base_ex_async(request, headers, runtime)

    def batchcreate_workers_base_ex(
        self,
        request: acc_models.BatchcreateWorkersBaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.BatchcreateWorkersBaseResponse:
        """
        Description: 批量新增农民工基本信息
        Summary: 批量新增农民工基本信息
        """
        UtilClient.validate_model(request)
        return acc_models.BatchcreateWorkersBaseResponse().from_map(
            self.do_request('1.0', 'antchain.acc.workers.base.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_workers_base_ex_async(
        self,
        request: acc_models.BatchcreateWorkersBaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.BatchcreateWorkersBaseResponse:
        """
        Description: 批量新增农民工基本信息
        Summary: 批量新增农民工基本信息
        """
        UtilClient.validate_model(request)
        return acc_models.BatchcreateWorkersBaseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.workers.base.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_workers_attendance(
        self,
        request: acc_models.BatchcreateWorkersAttendanceRequest,
    ) -> acc_models.BatchcreateWorkersAttendanceResponse:
        """
        Description: 批量新增农民工考勤信息
        Summary: 批量新增农民工考勤信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_workers_attendance_ex(request, headers, runtime)

    async def batchcreate_workers_attendance_async(
        self,
        request: acc_models.BatchcreateWorkersAttendanceRequest,
    ) -> acc_models.BatchcreateWorkersAttendanceResponse:
        """
        Description: 批量新增农民工考勤信息
        Summary: 批量新增农民工考勤信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_workers_attendance_ex_async(request, headers, runtime)

    def batchcreate_workers_attendance_ex(
        self,
        request: acc_models.BatchcreateWorkersAttendanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.BatchcreateWorkersAttendanceResponse:
        """
        Description: 批量新增农民工考勤信息
        Summary: 批量新增农民工考勤信息
        """
        UtilClient.validate_model(request)
        return acc_models.BatchcreateWorkersAttendanceResponse().from_map(
            self.do_request('1.0', 'antchain.acc.workers.attendance.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_workers_attendance_ex_async(
        self,
        request: acc_models.BatchcreateWorkersAttendanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.BatchcreateWorkersAttendanceResponse:
        """
        Description: 批量新增农民工考勤信息
        Summary: 批量新增农民工考勤信息
        """
        UtilClient.validate_model(request)
        return acc_models.BatchcreateWorkersAttendanceResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.workers.attendance.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_workers_wage(
        self,
        request: acc_models.BatchcreateWorkersWageRequest,
    ) -> acc_models.BatchcreateWorkersWageResponse:
        """
        Description: 批量新增农民工工资发放信息
        Summary: 批量新增农民工工资发放信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_workers_wage_ex(request, headers, runtime)

    async def batchcreate_workers_wage_async(
        self,
        request: acc_models.BatchcreateWorkersWageRequest,
    ) -> acc_models.BatchcreateWorkersWageResponse:
        """
        Description: 批量新增农民工工资发放信息
        Summary: 批量新增农民工工资发放信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_workers_wage_ex_async(request, headers, runtime)

    def batchcreate_workers_wage_ex(
        self,
        request: acc_models.BatchcreateWorkersWageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.BatchcreateWorkersWageResponse:
        """
        Description: 批量新增农民工工资发放信息
        Summary: 批量新增农民工工资发放信息
        """
        UtilClient.validate_model(request)
        return acc_models.BatchcreateWorkersWageResponse().from_map(
            self.do_request('1.0', 'antchain.acc.workers.wage.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_workers_wage_ex_async(
        self,
        request: acc_models.BatchcreateWorkersWageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.BatchcreateWorkersWageResponse:
        """
        Description: 批量新增农民工工资发放信息
        Summary: 批量新增农民工工资发放信息
        """
        UtilClient.validate_model(request)
        return acc_models.BatchcreateWorkersWageResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.workers.wage.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_project_file(
        self,
        request: acc_models.CreateProjectFileRequest,
    ) -> acc_models.CreateProjectFileResponse:
        """
        Description: 创建一条项目文件信息
        Summary: 创建一条项目文件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_project_file_ex(request, headers, runtime)

    async def create_project_file_async(
        self,
        request: acc_models.CreateProjectFileRequest,
    ) -> acc_models.CreateProjectFileResponse:
        """
        Description: 创建一条项目文件信息
        Summary: 创建一条项目文件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_project_file_ex_async(request, headers, runtime)

    def create_project_file_ex(
        self,
        request: acc_models.CreateProjectFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateProjectFileResponse:
        """
        Description: 创建一条项目文件信息
        Summary: 创建一条项目文件信息
        """
        UtilClient.validate_model(request)
        return acc_models.CreateProjectFileResponse().from_map(
            self.do_request('1.0', 'antchain.acc.project.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_project_file_ex_async(
        self,
        request: acc_models.CreateProjectFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateProjectFileResponse:
        """
        Description: 创建一条项目文件信息
        Summary: 创建一条项目文件信息
        """
        UtilClient.validate_model(request)
        return acc_models.CreateProjectFileResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.project.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_base(
        self,
        request: acc_models.CreateContractBaseRequest,
    ) -> acc_models.CreateContractBaseResponse:
        """
        Description: 合同基本信息流入
        Summary: 合同基本信息流入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_base_ex(request, headers, runtime)

    async def create_contract_base_async(
        self,
        request: acc_models.CreateContractBaseRequest,
    ) -> acc_models.CreateContractBaseResponse:
        """
        Description: 合同基本信息流入
        Summary: 合同基本信息流入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_base_ex_async(request, headers, runtime)

    def create_contract_base_ex(
        self,
        request: acc_models.CreateContractBaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractBaseResponse:
        """
        Description: 合同基本信息流入
        Summary: 合同基本信息流入
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractBaseResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.base.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_base_ex_async(
        self,
        request: acc_models.CreateContractBaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractBaseResponse:
        """
        Description: 合同基本信息流入
        Summary: 合同基本信息流入
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractBaseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.base.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_impl(
        self,
        request: acc_models.CreateContractImplRequest,
    ) -> acc_models.CreateContractImplResponse:
        """
        Description: 合同收付款信息流入
        Summary: 合同收付款信息流入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_impl_ex(request, headers, runtime)

    async def create_contract_impl_async(
        self,
        request: acc_models.CreateContractImplRequest,
    ) -> acc_models.CreateContractImplResponse:
        """
        Description: 合同收付款信息流入
        Summary: 合同收付款信息流入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_impl_ex_async(request, headers, runtime)

    def create_contract_impl_ex(
        self,
        request: acc_models.CreateContractImplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractImplResponse:
        """
        Description: 合同收付款信息流入
        Summary: 合同收付款信息流入
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractImplResponse().from_map(
            self.do_request('1.0', 'antchain.acc.contract.impl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_impl_ex_async(
        self,
        request: acc_models.CreateContractImplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateContractImplResponse:
        """
        Description: 合同收付款信息流入
        Summary: 合同收付款信息流入
        """
        UtilClient.validate_model(request)
        return acc_models.CreateContractImplResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.contract.impl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_user_cert(
        self,
        request: acc_models.CreateUserCertRequest,
    ) -> acc_models.CreateUserCertResponse:
        """
        Description: 个人认证信息同步
        Summary: 个人认证信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_user_cert_ex(request, headers, runtime)

    async def create_user_cert_async(
        self,
        request: acc_models.CreateUserCertRequest,
    ) -> acc_models.CreateUserCertResponse:
        """
        Description: 个人认证信息同步
        Summary: 个人认证信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_user_cert_ex_async(request, headers, runtime)

    def create_user_cert_ex(
        self,
        request: acc_models.CreateUserCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateUserCertResponse:
        """
        Description: 个人认证信息同步
        Summary: 个人认证信息同步
        """
        UtilClient.validate_model(request)
        return acc_models.CreateUserCertResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.cert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_user_cert_ex_async(
        self,
        request: acc_models.CreateUserCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateUserCertResponse:
        """
        Description: 个人认证信息同步
        Summary: 个人认证信息同步
        """
        UtilClient.validate_model(request)
        return acc_models.CreateUserCertResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.cert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_user_info(
        self,
        request: acc_models.UpdateUserInfoRequest,
    ) -> acc_models.UpdateUserInfoResponse:
        """
        Description: 用户信息变更同步
        Summary: 用户信息变更同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_user_info_ex(request, headers, runtime)

    async def update_user_info_async(
        self,
        request: acc_models.UpdateUserInfoRequest,
    ) -> acc_models.UpdateUserInfoResponse:
        """
        Description: 用户信息变更同步
        Summary: 用户信息变更同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_user_info_ex_async(request, headers, runtime)

    def update_user_info_ex(
        self,
        request: acc_models.UpdateUserInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.UpdateUserInfoResponse:
        """
        Description: 用户信息变更同步
        Summary: 用户信息变更同步
        """
        UtilClient.validate_model(request)
        return acc_models.UpdateUserInfoResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_user_info_ex_async(
        self,
        request: acc_models.UpdateUserInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.UpdateUserInfoResponse:
        """
        Description: 用户信息变更同步
        Summary: 用户信息变更同步
        """
        UtilClient.validate_model(request)
        return acc_models.UpdateUserInfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_user_register(
        self,
        request: acc_models.CreateUserRegisterRequest,
    ) -> acc_models.CreateUserRegisterResponse:
        """
        Description: 用户注册信息同步
        Summary: 用户注册信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_user_register_ex(request, headers, runtime)

    async def create_user_register_async(
        self,
        request: acc_models.CreateUserRegisterRequest,
    ) -> acc_models.CreateUserRegisterResponse:
        """
        Description: 用户注册信息同步
        Summary: 用户注册信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_user_register_ex_async(request, headers, runtime)

    def create_user_register_ex(
        self,
        request: acc_models.CreateUserRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateUserRegisterResponse:
        """
        Description: 用户注册信息同步
        Summary: 用户注册信息同步
        """
        UtilClient.validate_model(request)
        return acc_models.CreateUserRegisterResponse().from_map(
            self.do_request('1.0', 'antchain.acc.user.register.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_user_register_ex_async(
        self,
        request: acc_models.CreateUserRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateUserRegisterResponse:
        """
        Description: 用户注册信息同步
        Summary: 用户注册信息同步
        """
        UtilClient.validate_model(request)
        return acc_models.CreateUserRegisterResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.user.register.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_firm_cert(
        self,
        request: acc_models.CreateFirmCertRequest,
    ) -> acc_models.CreateFirmCertResponse:
        """
        Description: 企业认证信息同步
        Summary: 企业认证信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_firm_cert_ex(request, headers, runtime)

    async def create_firm_cert_async(
        self,
        request: acc_models.CreateFirmCertRequest,
    ) -> acc_models.CreateFirmCertResponse:
        """
        Description: 企业认证信息同步
        Summary: 企业认证信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_firm_cert_ex_async(request, headers, runtime)

    def create_firm_cert_ex(
        self,
        request: acc_models.CreateFirmCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateFirmCertResponse:
        """
        Description: 企业认证信息同步
        Summary: 企业认证信息同步
        """
        UtilClient.validate_model(request)
        return acc_models.CreateFirmCertResponse().from_map(
            self.do_request('1.0', 'antchain.acc.firm.cert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_firm_cert_ex_async(
        self,
        request: acc_models.CreateFirmCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.CreateFirmCertResponse:
        """
        Description: 企业认证信息同步
        Summary: 企业认证信息同步
        """
        UtilClient.validate_model(request)
        return acc_models.CreateFirmCertResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.firm.cert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_firm_info(
        self,
        request: acc_models.UpdateFirmInfoRequest,
    ) -> acc_models.UpdateFirmInfoResponse:
        """
        Description: 企业信息变更同步
        Summary: 企业信息变更同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_firm_info_ex(request, headers, runtime)

    async def update_firm_info_async(
        self,
        request: acc_models.UpdateFirmInfoRequest,
    ) -> acc_models.UpdateFirmInfoResponse:
        """
        Description: 企业信息变更同步
        Summary: 企业信息变更同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_firm_info_ex_async(request, headers, runtime)

    def update_firm_info_ex(
        self,
        request: acc_models.UpdateFirmInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.UpdateFirmInfoResponse:
        """
        Description: 企业信息变更同步
        Summary: 企业信息变更同步
        """
        UtilClient.validate_model(request)
        return acc_models.UpdateFirmInfoResponse().from_map(
            self.do_request('1.0', 'antchain.acc.firm.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_firm_info_ex_async(
        self,
        request: acc_models.UpdateFirmInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.UpdateFirmInfoResponse:
        """
        Description: 企业信息变更同步
        Summary: 企业信息变更同步
        """
        UtilClient.validate_model(request)
        return acc_models.UpdateFirmInfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.firm.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chain_transaction(
        self,
        request: acc_models.QueryChainTransactionRequest,
    ) -> acc_models.QueryChainTransactionResponse:
        """
        Description: 查询链上信息
        Summary: 查询链上信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chain_transaction_ex(request, headers, runtime)

    async def query_chain_transaction_async(
        self,
        request: acc_models.QueryChainTransactionRequest,
    ) -> acc_models.QueryChainTransactionResponse:
        """
        Description: 查询链上信息
        Summary: 查询链上信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chain_transaction_ex_async(request, headers, runtime)

    def query_chain_transaction_ex(
        self,
        request: acc_models.QueryChainTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryChainTransactionResponse:
        """
        Description: 查询链上信息
        Summary: 查询链上信息
        """
        UtilClient.validate_model(request)
        return acc_models.QueryChainTransactionResponse().from_map(
            self.do_request('1.0', 'antchain.acc.chain.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chain_transaction_ex_async(
        self,
        request: acc_models.QueryChainTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acc_models.QueryChainTransactionResponse:
        """
        Description: 查询链上信息
        Summary: 查询链上信息
        """
        UtilClient.validate_model(request)
        return acc_models.QueryChainTransactionResponse().from_map(
            await self.do_request_async('1.0', 'antchain.acc.chain.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
