# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from typing import Dict

from antchain_sdk_iam import models as iam_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from antchain_alipay_util.client import Client as AntchainUtilClient
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
        config: iam_models.Config,
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
            # 阿里云资源结构体
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '3.12.2'
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
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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
            # 阿里云资源结构体
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '3.12.2'
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
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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

    def get_role(
        self,
        request: iam_models.GetRoleRequest,
    ) -> iam_models.GetRoleResponse:
        """
        Description: 获取Role
        Summary: 获取角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_role_ex(request, headers, runtime)

    async def get_role_async(
        self,
        request: iam_models.GetRoleRequest,
    ) -> iam_models.GetRoleResponse:
        """
        Description: 获取Role
        Summary: 获取角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_role_ex_async(request, headers, runtime)

    def get_role_ex(
        self,
        request: iam_models.GetRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetRoleResponse:
        """
        Description: 获取Role
        Summary: 获取角色
        """
        UtilClient.validate_model(request)
        return iam_models.GetRoleResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_role_ex_async(
        self,
        request: iam_models.GetRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetRoleResponse:
        """
        Description: 获取Role
        Summary: 获取角色
        """
        UtilClient.validate_model(request)
        return iam_models.GetRoleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_policy(
        self,
        request: iam_models.QueryPolicyRequest,
    ) -> iam_models.QueryPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略
        Summary: 查询授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_policy_ex(request, headers, runtime)

    async def query_policy_async(
        self,
        request: iam_models.QueryPolicyRequest,
    ) -> iam_models.QueryPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略
        Summary: 查询授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_policy_ex_async(request, headers, runtime)

    def query_policy_ex(
        self,
        request: iam_models.QueryPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略
        Summary: 查询授权
        """
        UtilClient.validate_model(request)
        return iam_models.QueryPolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_policy_ex_async(
        self,
        request: iam_models.QueryPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略
        Summary: 查询授权
        """
        UtilClient.validate_model(request)
        return iam_models.QueryPolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_group(
        self,
        request: iam_models.QueryGroupRequest,
    ) -> iam_models.QueryGroupResponse:
        """
        Description: 查询租户下的权限组
        Summary: 查询授权组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_group_ex(request, headers, runtime)

    async def query_group_async(
        self,
        request: iam_models.QueryGroupRequest,
    ) -> iam_models.QueryGroupResponse:
        """
        Description: 查询租户下的权限组
        Summary: 查询授权组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_group_ex_async(request, headers, runtime)

    def query_group_ex(
        self,
        request: iam_models.QueryGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryGroupResponse:
        """
        Description: 查询租户下的权限组
        Summary: 查询授权组
        """
        UtilClient.validate_model(request)
        return iam_models.QueryGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_group_ex_async(
        self,
        request: iam_models.QueryGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryGroupResponse:
        """
        Description: 查询租户下的权限组
        Summary: 查询授权组
        """
        UtilClient.validate_model(request)
        return iam_models.QueryGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_policy(
        self,
        request: iam_models.CreatePolicyRequest,
    ) -> iam_models.CreatePolicyResponse:
        """
        Description: 创建授权策略
        Summary: 创建授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_policy_ex(request, headers, runtime)

    async def create_policy_async(
        self,
        request: iam_models.CreatePolicyRequest,
    ) -> iam_models.CreatePolicyResponse:
        """
        Description: 创建授权策略
        Summary: 创建授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_policy_ex_async(request, headers, runtime)

    def create_policy_ex(
        self,
        request: iam_models.CreatePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreatePolicyResponse:
        """
        Description: 创建授权策略
        Summary: 创建授权策略
        """
        UtilClient.validate_model(request)
        return iam_models.CreatePolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.policy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_policy_ex_async(
        self,
        request: iam_models.CreatePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreatePolicyResponse:
        """
        Description: 创建授权策略
        Summary: 创建授权策略
        """
        UtilClient.validate_model(request)
        return iam_models.CreatePolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.policy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_policy(
        self,
        request: iam_models.DeletePolicyRequest,
    ) -> iam_models.DeletePolicyResponse:
        """
        Description: 删除授权策略
        Summary: 删除授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_policy_ex(request, headers, runtime)

    async def delete_policy_async(
        self,
        request: iam_models.DeletePolicyRequest,
    ) -> iam_models.DeletePolicyResponse:
        """
        Description: 删除授权策略
        Summary: 删除授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_policy_ex_async(request, headers, runtime)

    def delete_policy_ex(
        self,
        request: iam_models.DeletePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeletePolicyResponse:
        """
        Description: 删除授权策略
        Summary: 删除授权策略
        """
        UtilClient.validate_model(request)
        return iam_models.DeletePolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.policy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_policy_ex_async(
        self,
        request: iam_models.DeletePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeletePolicyResponse:
        """
        Description: 删除授权策略
        Summary: 删除授权策略
        """
        UtilClient.validate_model(request)
        return iam_models.DeletePolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.policy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def attach_policy(
        self,
        request: iam_models.AttachPolicyRequest,
    ) -> iam_models.AttachPolicyResponse:
        """
        Description: 授权策略赋予某个对象
        Summary: 添加授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.attach_policy_ex(request, headers, runtime)

    async def attach_policy_async(
        self,
        request: iam_models.AttachPolicyRequest,
    ) -> iam_models.AttachPolicyResponse:
        """
        Description: 授权策略赋予某个对象
        Summary: 添加授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.attach_policy_ex_async(request, headers, runtime)

    def attach_policy_ex(
        self,
        request: iam_models.AttachPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AttachPolicyResponse:
        """
        Description: 授权策略赋予某个对象
        Summary: 添加授权
        """
        UtilClient.validate_model(request)
        return iam_models.AttachPolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.policy.attach', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def attach_policy_ex_async(
        self,
        request: iam_models.AttachPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AttachPolicyResponse:
        """
        Description: 授权策略赋予某个对象
        Summary: 添加授权
        """
        UtilClient.validate_model(request)
        return iam_models.AttachPolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.policy.attach', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detach_policy(
        self,
        request: iam_models.DetachPolicyRequest,
    ) -> iam_models.DetachPolicyResponse:
        """
        Description: 解除授权对象的授权策略
        Summary: 解除授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detach_policy_ex(request, headers, runtime)

    async def detach_policy_async(
        self,
        request: iam_models.DetachPolicyRequest,
    ) -> iam_models.DetachPolicyResponse:
        """
        Description: 解除授权对象的授权策略
        Summary: 解除授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detach_policy_ex_async(request, headers, runtime)

    def detach_policy_ex(
        self,
        request: iam_models.DetachPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DetachPolicyResponse:
        """
        Description: 解除授权对象的授权策略
        Summary: 解除授权
        """
        UtilClient.validate_model(request)
        return iam_models.DetachPolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.policy.detach', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detach_policy_ex_async(
        self,
        request: iam_models.DetachPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DetachPolicyResponse:
        """
        Description: 解除授权对象的授权策略
        Summary: 解除授权
        """
        UtilClient.validate_model(request)
        return iam_models.DetachPolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.policy.detach', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_policy(
        self,
        request: iam_models.ListPolicyRequest,
    ) -> iam_models.ListPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
        Summary: 查询授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_policy_ex(request, headers, runtime)

    async def list_policy_async(
        self,
        request: iam_models.ListPolicyRequest,
    ) -> iam_models.ListPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
        Summary: 查询授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_policy_ex_async(request, headers, runtime)

    def list_policy_ex(
        self,
        request: iam_models.ListPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
        Summary: 查询授权
        """
        UtilClient.validate_model(request)
        return iam_models.ListPolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.policy.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_policy_ex_async(
        self,
        request: iam_models.ListPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListPolicyResponse:
        """
        Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
        Summary: 查询授权
        """
        UtilClient.validate_model(request)
        return iam_models.ListPolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.policy.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def judge_authority(
        self,
        request: iam_models.JudgeAuthorityRequest,
    ) -> iam_models.JudgeAuthorityResponse:
        """
        Description: 授权对象的权限校验
        Summary: 校验权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_authority_ex(request, headers, runtime)

    async def judge_authority_async(
        self,
        request: iam_models.JudgeAuthorityRequest,
    ) -> iam_models.JudgeAuthorityResponse:
        """
        Description: 授权对象的权限校验
        Summary: 校验权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_authority_ex_async(request, headers, runtime)

    def judge_authority_ex(
        self,
        request: iam_models.JudgeAuthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeAuthorityResponse:
        """
        Description: 授权对象的权限校验
        Summary: 校验权限
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeAuthorityResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.authority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_authority_ex_async(
        self,
        request: iam_models.JudgeAuthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeAuthorityResponse:
        """
        Description: 授权对象的权限校验
        Summary: 校验权限
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeAuthorityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.authority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_product_action(
        self,
        request: iam_models.CreateProductActionRequest,
    ) -> iam_models.CreateProductActionResponse:
        """
        Description: 添加产品操作元数据
        Summary: 创建产品操作点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_product_action_ex(request, headers, runtime)

    async def create_product_action_async(
        self,
        request: iam_models.CreateProductActionRequest,
    ) -> iam_models.CreateProductActionResponse:
        """
        Description: 添加产品操作元数据
        Summary: 创建产品操作点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_product_action_ex_async(request, headers, runtime)

    def create_product_action_ex(
        self,
        request: iam_models.CreateProductActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateProductActionResponse:
        """
        Description: 添加产品操作元数据
        Summary: 创建产品操作点
        """
        UtilClient.validate_model(request)
        return iam_models.CreateProductActionResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.product.action.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_product_action_ex_async(
        self,
        request: iam_models.CreateProductActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateProductActionResponse:
        """
        Description: 添加产品操作元数据
        Summary: 创建产品操作点
        """
        UtilClient.validate_model(request)
        return iam_models.CreateProductActionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.product.action.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_oauth_token(
        self,
        request: iam_models.VerifyOauthTokenRequest,
    ) -> iam_models.VerifyOauthTokenResponse:
        """
        Description: 校验token合法性
        Summary: 校验token合法性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_oauth_token_ex(request, headers, runtime)

    async def verify_oauth_token_async(
        self,
        request: iam_models.VerifyOauthTokenRequest,
    ) -> iam_models.VerifyOauthTokenResponse:
        """
        Description: 校验token合法性
        Summary: 校验token合法性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_oauth_token_ex_async(request, headers, runtime)

    def verify_oauth_token_ex(
        self,
        request: iam_models.VerifyOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.VerifyOauthTokenResponse:
        """
        Description: 校验token合法性
        Summary: 校验token合法性
        """
        UtilClient.validate_model(request)
        return iam_models.VerifyOauthTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.oauth.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_oauth_token_ex_async(
        self,
        request: iam_models.VerifyOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.VerifyOauthTokenResponse:
        """
        Description: 校验token合法性
        Summary: 校验token合法性
        """
        UtilClient.validate_model(request)
        return iam_models.VerifyOauthTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.oauth.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_session_token(
        self,
        request: iam_models.VerifySessionTokenRequest,
    ) -> iam_models.VerifySessionTokenResponse:
        """
        Description: 校验中枢登录态合法性
        Summary: 校验中枢登录态合法性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_session_token_ex(request, headers, runtime)

    async def verify_session_token_async(
        self,
        request: iam_models.VerifySessionTokenRequest,
    ) -> iam_models.VerifySessionTokenResponse:
        """
        Description: 校验中枢登录态合法性
        Summary: 校验中枢登录态合法性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_session_token_ex_async(request, headers, runtime)

    def verify_session_token_ex(
        self,
        request: iam_models.VerifySessionTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.VerifySessionTokenResponse:
        """
        Description: 校验中枢登录态合法性
        Summary: 校验中枢登录态合法性
        """
        UtilClient.validate_model(request)
        return iam_models.VerifySessionTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.session.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_session_token_ex_async(
        self,
        request: iam_models.VerifySessionTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.VerifySessionTokenResponse:
        """
        Description: 校验中枢登录态合法性
        Summary: 校验中枢登录态合法性
        """
        UtilClient.validate_model(request)
        return iam_models.VerifySessionTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.session.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_role_operator(
        self,
        request: iam_models.ListRoleOperatorRequest,
    ) -> iam_models.ListRoleOperatorResponse:
        """
        Description: 获取授予角色的操作员列表
        Summary: 授予角色的操作员列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_role_operator_ex(request, headers, runtime)

    async def list_role_operator_async(
        self,
        request: iam_models.ListRoleOperatorRequest,
    ) -> iam_models.ListRoleOperatorResponse:
        """
        Description: 获取授予角色的操作员列表
        Summary: 授予角色的操作员列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_role_operator_ex_async(request, headers, runtime)

    def list_role_operator_ex(
        self,
        request: iam_models.ListRoleOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListRoleOperatorResponse:
        """
        Description: 获取授予角色的操作员列表
        Summary: 授予角色的操作员列表
        """
        UtilClient.validate_model(request)
        return iam_models.ListRoleOperatorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.operator.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_role_operator_ex_async(
        self,
        request: iam_models.ListRoleOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListRoleOperatorResponse:
        """
        Description: 获取授予角色的操作员列表
        Summary: 授予角色的操作员列表
        """
        UtilClient.validate_model(request)
        return iam_models.ListRoleOperatorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.operator.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_trustlogin_url(
        self,
        request: iam_models.ApplyTrustloginUrlRequest,
    ) -> iam_models.ApplyTrustloginUrlResponse:
        """
        Description: 申请信任登录URL
        Summary: 申请信任登录URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_trustlogin_url_ex(request, headers, runtime)

    async def apply_trustlogin_url_async(
        self,
        request: iam_models.ApplyTrustloginUrlRequest,
    ) -> iam_models.ApplyTrustloginUrlResponse:
        """
        Description: 申请信任登录URL
        Summary: 申请信任登录URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_trustlogin_url_ex_async(request, headers, runtime)

    def apply_trustlogin_url_ex(
        self,
        request: iam_models.ApplyTrustloginUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ApplyTrustloginUrlResponse:
        """
        Description: 申请信任登录URL
        Summary: 申请信任登录URL
        """
        UtilClient.validate_model(request)
        return iam_models.ApplyTrustloginUrlResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.trustlogin.url.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_trustlogin_url_ex_async(
        self,
        request: iam_models.ApplyTrustloginUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ApplyTrustloginUrlResponse:
        """
        Description: 申请信任登录URL
        Summary: 申请信任登录URL
        """
        UtilClient.validate_model(request)
        return iam_models.ApplyTrustloginUrlResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.trustlogin.url.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def assume_sts(
        self,
        request: iam_models.AssumeStsRequest,
    ) -> iam_models.AssumeStsResponse:
        """
        Description: 扮演虚拟身份，获取安全令牌
        Summary: 扮演虚拟身份，获取安全令牌
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.assume_sts_ex(request, headers, runtime)

    async def assume_sts_async(
        self,
        request: iam_models.AssumeStsRequest,
    ) -> iam_models.AssumeStsResponse:
        """
        Description: 扮演虚拟身份，获取安全令牌
        Summary: 扮演虚拟身份，获取安全令牌
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.assume_sts_ex_async(request, headers, runtime)

    def assume_sts_ex(
        self,
        request: iam_models.AssumeStsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AssumeStsResponse:
        """
        Description: 扮演虚拟身份，获取安全令牌
        Summary: 扮演虚拟身份，获取安全令牌
        """
        UtilClient.validate_model(request)
        return iam_models.AssumeStsResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.sts.assume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def assume_sts_ex_async(
        self,
        request: iam_models.AssumeStsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AssumeStsResponse:
        """
        Description: 扮演虚拟身份，获取安全令牌
        Summary: 扮演虚拟身份，获取安全令牌
        """
        UtilClient.validate_model(request)
        return iam_models.AssumeStsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.sts.assume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sts_actor(
        self,
        request: iam_models.CreateStsActorRequest,
    ) -> iam_models.CreateStsActorResponse:
        """
        Description: 创建虚拟身份
        Summary: 创建虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sts_actor_ex(request, headers, runtime)

    async def create_sts_actor_async(
        self,
        request: iam_models.CreateStsActorRequest,
    ) -> iam_models.CreateStsActorResponse:
        """
        Description: 创建虚拟身份
        Summary: 创建虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sts_actor_ex_async(request, headers, runtime)

    def create_sts_actor_ex(
        self,
        request: iam_models.CreateStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateStsActorResponse:
        """
        Description: 创建虚拟身份
        Summary: 创建虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.CreateStsActorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.sts.actor.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sts_actor_ex_async(
        self,
        request: iam_models.CreateStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateStsActorResponse:
        """
        Description: 创建虚拟身份
        Summary: 创建虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.CreateStsActorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.sts.actor.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sts_actor(
        self,
        request: iam_models.DeleteStsActorRequest,
    ) -> iam_models.DeleteStsActorResponse:
        """
        Description: 删除虚拟身份
        Summary: 删除虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sts_actor_ex(request, headers, runtime)

    async def delete_sts_actor_async(
        self,
        request: iam_models.DeleteStsActorRequest,
    ) -> iam_models.DeleteStsActorResponse:
        """
        Description: 删除虚拟身份
        Summary: 删除虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sts_actor_ex_async(request, headers, runtime)

    def delete_sts_actor_ex(
        self,
        request: iam_models.DeleteStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteStsActorResponse:
        """
        Description: 删除虚拟身份
        Summary: 删除虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteStsActorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.sts.actor.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sts_actor_ex_async(
        self,
        request: iam_models.DeleteStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteStsActorResponse:
        """
        Description: 删除虚拟身份
        Summary: 删除虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteStsActorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.sts.actor.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sts_actor(
        self,
        request: iam_models.GetStsActorRequest,
    ) -> iam_models.GetStsActorResponse:
        """
        Description: 唯一查询虚拟身份
        Summary: 唯一查询虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sts_actor_ex(request, headers, runtime)

    async def get_sts_actor_async(
        self,
        request: iam_models.GetStsActorRequest,
    ) -> iam_models.GetStsActorResponse:
        """
        Description: 唯一查询虚拟身份
        Summary: 唯一查询虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sts_actor_ex_async(request, headers, runtime)

    def get_sts_actor_ex(
        self,
        request: iam_models.GetStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetStsActorResponse:
        """
        Description: 唯一查询虚拟身份
        Summary: 唯一查询虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.GetStsActorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.sts.actor.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sts_actor_ex_async(
        self,
        request: iam_models.GetStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetStsActorResponse:
        """
        Description: 唯一查询虚拟身份
        Summary: 唯一查询虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.GetStsActorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.sts.actor.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sts_actor(
        self,
        request: iam_models.ListStsActorRequest,
    ) -> iam_models.ListStsActorResponse:
        """
        Description: 获取租户内的虚拟身份
        Summary: 获取租户内的虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sts_actor_ex(request, headers, runtime)

    async def list_sts_actor_async(
        self,
        request: iam_models.ListStsActorRequest,
    ) -> iam_models.ListStsActorResponse:
        """
        Description: 获取租户内的虚拟身份
        Summary: 获取租户内的虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sts_actor_ex_async(request, headers, runtime)

    def list_sts_actor_ex(
        self,
        request: iam_models.ListStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListStsActorResponse:
        """
        Description: 获取租户内的虚拟身份
        Summary: 获取租户内的虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.ListStsActorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.sts.actor.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sts_actor_ex_async(
        self,
        request: iam_models.ListStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListStsActorResponse:
        """
        Description: 获取租户内的虚拟身份
        Summary: 获取租户内的虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.ListStsActorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.sts.actor.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sts_actor(
        self,
        request: iam_models.UpdateStsActorRequest,
    ) -> iam_models.UpdateStsActorResponse:
        """
        Description: 更新虚拟身份
        Summary: 更新虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sts_actor_ex(request, headers, runtime)

    async def update_sts_actor_async(
        self,
        request: iam_models.UpdateStsActorRequest,
    ) -> iam_models.UpdateStsActorResponse:
        """
        Description: 更新虚拟身份
        Summary: 更新虚拟身份
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sts_actor_ex_async(request, headers, runtime)

    def update_sts_actor_ex(
        self,
        request: iam_models.UpdateStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateStsActorResponse:
        """
        Description: 更新虚拟身份
        Summary: 更新虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateStsActorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.sts.actor.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sts_actor_ex_async(
        self,
        request: iam_models.UpdateStsActorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateStsActorResponse:
        """
        Description: 更新虚拟身份
        Summary: 更新虚拟身份
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateStsActorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.sts.actor.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_role(
        self,
        request: iam_models.QueryRoleRequest,
    ) -> iam_models.QueryRoleResponse:
        """
        Description: 查询租户内可见的角色
        Summary: 角色查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_role_ex(request, headers, runtime)

    async def query_role_async(
        self,
        request: iam_models.QueryRoleRequest,
    ) -> iam_models.QueryRoleResponse:
        """
        Description: 查询租户内可见的角色
        Summary: 角色查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_role_ex_async(request, headers, runtime)

    def query_role_ex(
        self,
        request: iam_models.QueryRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryRoleResponse:
        """
        Description: 查询租户内可见的角色
        Summary: 角色查询
        """
        UtilClient.validate_model(request)
        return iam_models.QueryRoleResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_role_ex_async(
        self,
        request: iam_models.QueryRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryRoleResponse:
        """
        Description: 查询租户内可见的角色
        Summary: 角色查询
        """
        UtilClient.validate_model(request)
        return iam_models.QueryRoleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_iaasaccount_baseinfo(
        self,
        request: iam_models.GetIaasaccountBaseinfoRequest,
    ) -> iam_models.GetIaasaccountBaseinfoResponse:
        """
        Description: 获取租户Iaas账号基本信息
        Summary: 获取租户Iaas账号基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_iaasaccount_baseinfo_ex(request, headers, runtime)

    async def get_iaasaccount_baseinfo_async(
        self,
        request: iam_models.GetIaasaccountBaseinfoRequest,
    ) -> iam_models.GetIaasaccountBaseinfoResponse:
        """
        Description: 获取租户Iaas账号基本信息
        Summary: 获取租户Iaas账号基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_iaasaccount_baseinfo_ex_async(request, headers, runtime)

    def get_iaasaccount_baseinfo_ex(
        self,
        request: iam_models.GetIaasaccountBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetIaasaccountBaseinfoResponse:
        """
        Description: 获取租户Iaas账号基本信息
        Summary: 获取租户Iaas账号基本信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetIaasaccountBaseinfoResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.iaasaccount.baseinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_iaasaccount_baseinfo_ex_async(
        self,
        request: iam_models.GetIaasaccountBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetIaasaccountBaseinfoResponse:
        """
        Description: 获取租户Iaas账号基本信息
        Summary: 获取租户Iaas账号基本信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetIaasaccountBaseinfoResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.iaasaccount.baseinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_password(
        self,
        request: iam_models.VerifyPasswordRequest,
    ) -> iam_models.VerifyPasswordResponse:
        """
        Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
        Summary: 校验密码是否正确
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_password_ex(request, headers, runtime)

    async def verify_password_async(
        self,
        request: iam_models.VerifyPasswordRequest,
    ) -> iam_models.VerifyPasswordResponse:
        """
        Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
        Summary: 校验密码是否正确
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_password_ex_async(request, headers, runtime)

    def verify_password_ex(
        self,
        request: iam_models.VerifyPasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.VerifyPasswordResponse:
        """
        Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
        Summary: 校验密码是否正确
        """
        UtilClient.validate_model(request)
        return iam_models.VerifyPasswordResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.password.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_password_ex_async(
        self,
        request: iam_models.VerifyPasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.VerifyPasswordResponse:
        """
        Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
        Summary: 校验密码是否正确
        """
        UtilClient.validate_model(request)
        return iam_models.VerifyPasswordResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.password.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_operator_status(
        self,
        request: iam_models.UpdateOperatorStatusRequest,
    ) -> iam_models.UpdateOperatorStatusResponse:
        """
        Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
        Summary: 更新操作员状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_operator_status_ex(request, headers, runtime)

    async def update_operator_status_async(
        self,
        request: iam_models.UpdateOperatorStatusRequest,
    ) -> iam_models.UpdateOperatorStatusResponse:
        """
        Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
        Summary: 更新操作员状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_operator_status_ex_async(request, headers, runtime)

    def update_operator_status_ex(
        self,
        request: iam_models.UpdateOperatorStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateOperatorStatusResponse:
        """
        Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
        Summary: 更新操作员状态
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateOperatorStatusResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.operator.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_operator_status_ex_async(
        self,
        request: iam_models.UpdateOperatorStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateOperatorStatusResponse:
        """
        Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
        Summary: 更新操作员状态
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateOperatorStatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.operator.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def freeze_operator(
        self,
        request: iam_models.FreezeOperatorRequest,
    ) -> iam_models.FreezeOperatorResponse:
        """
        Description: 冻结操作员
        Summary: 冻结操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.freeze_operator_ex(request, headers, runtime)

    async def freeze_operator_async(
        self,
        request: iam_models.FreezeOperatorRequest,
    ) -> iam_models.FreezeOperatorResponse:
        """
        Description: 冻结操作员
        Summary: 冻结操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.freeze_operator_ex_async(request, headers, runtime)

    def freeze_operator_ex(
        self,
        request: iam_models.FreezeOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.FreezeOperatorResponse:
        """
        Description: 冻结操作员
        Summary: 冻结操作员
        """
        UtilClient.validate_model(request)
        return iam_models.FreezeOperatorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.operator.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def freeze_operator_ex_async(
        self,
        request: iam_models.FreezeOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.FreezeOperatorResponse:
        """
        Description: 冻结操作员
        Summary: 冻结操作员
        """
        UtilClient.validate_model(request)
        return iam_models.FreezeOperatorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.operator.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unfreeze_operator(
        self,
        request: iam_models.UnfreezeOperatorRequest,
    ) -> iam_models.UnfreezeOperatorResponse:
        """
        Description: 解冻操作员
        Summary: 解冻操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unfreeze_operator_ex(request, headers, runtime)

    async def unfreeze_operator_async(
        self,
        request: iam_models.UnfreezeOperatorRequest,
    ) -> iam_models.UnfreezeOperatorResponse:
        """
        Description: 解冻操作员
        Summary: 解冻操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unfreeze_operator_ex_async(request, headers, runtime)

    def unfreeze_operator_ex(
        self,
        request: iam_models.UnfreezeOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UnfreezeOperatorResponse:
        """
        Description: 解冻操作员
        Summary: 解冻操作员
        """
        UtilClient.validate_model(request)
        return iam_models.UnfreezeOperatorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.operator.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unfreeze_operator_ex_async(
        self,
        request: iam_models.UnfreezeOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UnfreezeOperatorResponse:
        """
        Description: 解冻操作员
        Summary: 解冻操作员
        """
        UtilClient.validate_model(request)
        return iam_models.UnfreezeOperatorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.operator.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_internal_master(
        self,
        request: iam_models.GetInternalMasterRequest,
    ) -> iam_models.GetInternalMasterResponse:
        """
        Description: 获取主账号信息
        Summary: 获取主账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_internal_master_ex(request, headers, runtime)

    async def get_internal_master_async(
        self,
        request: iam_models.GetInternalMasterRequest,
    ) -> iam_models.GetInternalMasterResponse:
        """
        Description: 获取主账号信息
        Summary: 获取主账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_internal_master_ex_async(request, headers, runtime)

    def get_internal_master_ex(
        self,
        request: iam_models.GetInternalMasterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetInternalMasterResponse:
        """
        Description: 获取主账号信息
        Summary: 获取主账号信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetInternalMasterResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.internal.master.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_internal_master_ex_async(
        self,
        request: iam_models.GetInternalMasterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetInternalMasterResponse:
        """
        Description: 获取主账号信息
        Summary: 获取主账号信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetInternalMasterResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.internal.master.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_aliyun_user(
        self,
        request: iam_models.GetAliyunUserRequest,
    ) -> iam_models.GetAliyunUserResponse:
        """
        Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
        Summary: 获取阿里云用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_aliyun_user_ex(request, headers, runtime)

    async def get_aliyun_user_async(
        self,
        request: iam_models.GetAliyunUserRequest,
    ) -> iam_models.GetAliyunUserResponse:
        """
        Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
        Summary: 获取阿里云用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_aliyun_user_ex_async(request, headers, runtime)

    def get_aliyun_user_ex(
        self,
        request: iam_models.GetAliyunUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetAliyunUserResponse:
        """
        Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
        Summary: 获取阿里云用户信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetAliyunUserResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.aliyun.user.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_aliyun_user_ex_async(
        self,
        request: iam_models.GetAliyunUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetAliyunUserResponse:
        """
        Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
        Summary: 获取阿里云用户信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetAliyunUserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.aliyun.user.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def judge_aliyun_authority(
        self,
        request: iam_models.JudgeAliyunAuthorityRequest,
    ) -> iam_models.JudgeAliyunAuthorityResponse:
        """
        Description: 阿里云RAM权限校验
        Summary: 阿里云RAM权限校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_aliyun_authority_ex(request, headers, runtime)

    async def judge_aliyun_authority_async(
        self,
        request: iam_models.JudgeAliyunAuthorityRequest,
    ) -> iam_models.JudgeAliyunAuthorityResponse:
        """
        Description: 阿里云RAM权限校验
        Summary: 阿里云RAM权限校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_aliyun_authority_ex_async(request, headers, runtime)

    def judge_aliyun_authority_ex(
        self,
        request: iam_models.JudgeAliyunAuthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeAliyunAuthorityResponse:
        """
        Description: 阿里云RAM权限校验
        Summary: 阿里云RAM权限校验
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeAliyunAuthorityResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.aliyun.authority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_aliyun_authority_ex_async(
        self,
        request: iam_models.JudgeAliyunAuthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeAliyunAuthorityResponse:
        """
        Description: 阿里云RAM权限校验
        Summary: 阿里云RAM权限校验
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeAliyunAuthorityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.aliyun.authority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_session_accessor(
        self,
        request: iam_models.GetSessionAccessorRequest,
    ) -> iam_models.GetSessionAccessorResponse:
        """
        Description: 根据登录态获取ak
        Summary: 根据登录态获取ak
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_session_accessor_ex(request, headers, runtime)

    async def get_session_accessor_async(
        self,
        request: iam_models.GetSessionAccessorRequest,
    ) -> iam_models.GetSessionAccessorResponse:
        """
        Description: 根据登录态获取ak
        Summary: 根据登录态获取ak
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_session_accessor_ex_async(request, headers, runtime)

    def get_session_accessor_ex(
        self,
        request: iam_models.GetSessionAccessorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetSessionAccessorResponse:
        """
        Description: 根据登录态获取ak
        Summary: 根据登录态获取ak
        """
        UtilClient.validate_model(request)
        return iam_models.GetSessionAccessorResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.session.accessor.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_session_accessor_ex_async(
        self,
        request: iam_models.GetSessionAccessorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetSessionAccessorResponse:
        """
        Description: 根据登录态获取ak
        Summary: 根据登录态获取ak
        """
        UtilClient.validate_model(request)
        return iam_models.GetSessionAccessorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.session.accessor.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_password(
        self,
        request: iam_models.UpdatePasswordRequest,
    ) -> iam_models.UpdatePasswordResponse:
        """
        Description: 更新密码
        Summary: 更新密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_password_ex(request, headers, runtime)

    async def update_password_async(
        self,
        request: iam_models.UpdatePasswordRequest,
    ) -> iam_models.UpdatePasswordResponse:
        """
        Description: 更新密码
        Summary: 更新密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_password_ex_async(request, headers, runtime)

    def update_password_ex(
        self,
        request: iam_models.UpdatePasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdatePasswordResponse:
        """
        Description: 更新密码
        Summary: 更新密码
        """
        UtilClient.validate_model(request)
        return iam_models.UpdatePasswordResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.password.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_password_ex_async(
        self,
        request: iam_models.UpdatePasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdatePasswordResponse:
        """
        Description: 更新密码
        Summary: 更新密码
        """
        UtilClient.validate_model(request)
        return iam_models.UpdatePasswordResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.password.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def judge_multiauthority(
        self,
        request: iam_models.JudgeMultiauthorityRequest,
    ) -> iam_models.JudgeMultiauthorityResponse:
        """
        Description: 蚂蚁侧批量鉴权
        Summary: 蚂蚁侧批量鉴权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_multiauthority_ex(request, headers, runtime)

    async def judge_multiauthority_async(
        self,
        request: iam_models.JudgeMultiauthorityRequest,
    ) -> iam_models.JudgeMultiauthorityResponse:
        """
        Description: 蚂蚁侧批量鉴权
        Summary: 蚂蚁侧批量鉴权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_multiauthority_ex_async(request, headers, runtime)

    def judge_multiauthority_ex(
        self,
        request: iam_models.JudgeMultiauthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeMultiauthorityResponse:
        """
        Description: 蚂蚁侧批量鉴权
        Summary: 蚂蚁侧批量鉴权
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeMultiauthorityResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.multiauthority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_multiauthority_ex_async(
        self,
        request: iam_models.JudgeMultiauthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeMultiauthorityResponse:
        """
        Description: 蚂蚁侧批量鉴权
        Summary: 蚂蚁侧批量鉴权
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeMultiauthorityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.multiauthority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def judge_aliyun_multiauthority(
        self,
        request: iam_models.JudgeAliyunMultiauthorityRequest,
    ) -> iam_models.JudgeAliyunMultiauthorityResponse:
        """
        Description: 阿里云批量鉴权
        Summary: 阿里云批量鉴权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_aliyun_multiauthority_ex(request, headers, runtime)

    async def judge_aliyun_multiauthority_async(
        self,
        request: iam_models.JudgeAliyunMultiauthorityRequest,
    ) -> iam_models.JudgeAliyunMultiauthorityResponse:
        """
        Description: 阿里云批量鉴权
        Summary: 阿里云批量鉴权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_aliyun_multiauthority_ex_async(request, headers, runtime)

    def judge_aliyun_multiauthority_ex(
        self,
        request: iam_models.JudgeAliyunMultiauthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeAliyunMultiauthorityResponse:
        """
        Description: 阿里云批量鉴权
        Summary: 阿里云批量鉴权
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeAliyunMultiauthorityResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.aliyun.multiauthority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_aliyun_multiauthority_ex_async(
        self,
        request: iam_models.JudgeAliyunMultiauthorityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.JudgeAliyunMultiauthorityResponse:
        """
        Description: 阿里云批量鉴权
        Summary: 阿里云批量鉴权
        """
        UtilClient.validate_model(request)
        return iam_models.JudgeAliyunMultiauthorityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.aliyun.multiauthority.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_accessor_current(
        self,
        request: iam_models.GetAccessorCurrentRequest,
    ) -> iam_models.GetAccessorCurrentResponse:
        """
        Description: 辰霖
        Summary: 获取当前AK关联的用户实体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_accessor_current_ex(request, headers, runtime)

    async def get_accessor_current_async(
        self,
        request: iam_models.GetAccessorCurrentRequest,
    ) -> iam_models.GetAccessorCurrentResponse:
        """
        Description: 辰霖
        Summary: 获取当前AK关联的用户实体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_accessor_current_ex_async(request, headers, runtime)

    def get_accessor_current_ex(
        self,
        request: iam_models.GetAccessorCurrentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetAccessorCurrentResponse:
        """
        Description: 辰霖
        Summary: 获取当前AK关联的用户实体信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetAccessorCurrentResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.accessor.current.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_accessor_current_ex_async(
        self,
        request: iam_models.GetAccessorCurrentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetAccessorCurrentResponse:
        """
        Description: 辰霖
        Summary: 获取当前AK关联的用户实体信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetAccessorCurrentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.accessor.current.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_serviceaccount(
        self,
        request: iam_models.GetServiceaccountRequest,
    ) -> iam_models.GetServiceaccountResponse:
        """
        Description: 获取单个服务账号信息
        Summary: 获取单个服务账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_serviceaccount_ex(request, headers, runtime)

    async def get_serviceaccount_async(
        self,
        request: iam_models.GetServiceaccountRequest,
    ) -> iam_models.GetServiceaccountResponse:
        """
        Description: 获取单个服务账号信息
        Summary: 获取单个服务账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_serviceaccount_ex_async(request, headers, runtime)

    def get_serviceaccount_ex(
        self,
        request: iam_models.GetServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetServiceaccountResponse:
        """
        Description: 获取单个服务账号信息
        Summary: 获取单个服务账号信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetServiceaccountResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.serviceaccount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_serviceaccount_ex_async(
        self,
        request: iam_models.GetServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetServiceaccountResponse:
        """
        Description: 获取单个服务账号信息
        Summary: 获取单个服务账号信息
        """
        UtilClient.validate_model(request)
        return iam_models.GetServiceaccountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.serviceaccount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_serviceaccount(
        self,
        request: iam_models.CreateServiceaccountRequest,
    ) -> iam_models.CreateServiceaccountResponse:
        """
        Description: 创建服务账号
        Summary: 创建服务账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_serviceaccount_ex(request, headers, runtime)

    async def create_serviceaccount_async(
        self,
        request: iam_models.CreateServiceaccountRequest,
    ) -> iam_models.CreateServiceaccountResponse:
        """
        Description: 创建服务账号
        Summary: 创建服务账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_serviceaccount_ex_async(request, headers, runtime)

    def create_serviceaccount_ex(
        self,
        request: iam_models.CreateServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateServiceaccountResponse:
        """
        Description: 创建服务账号
        Summary: 创建服务账号
        """
        UtilClient.validate_model(request)
        return iam_models.CreateServiceaccountResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.serviceaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_serviceaccount_ex_async(
        self,
        request: iam_models.CreateServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateServiceaccountResponse:
        """
        Description: 创建服务账号
        Summary: 创建服务账号
        """
        UtilClient.validate_model(request)
        return iam_models.CreateServiceaccountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.serviceaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_serviceaccount(
        self,
        request: iam_models.DeleteServiceaccountRequest,
    ) -> iam_models.DeleteServiceaccountResponse:
        """
        Description: 删除服务账号
        Summary: 删除服务账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_serviceaccount_ex(request, headers, runtime)

    async def delete_serviceaccount_async(
        self,
        request: iam_models.DeleteServiceaccountRequest,
    ) -> iam_models.DeleteServiceaccountResponse:
        """
        Description: 删除服务账号
        Summary: 删除服务账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_serviceaccount_ex_async(request, headers, runtime)

    def delete_serviceaccount_ex(
        self,
        request: iam_models.DeleteServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteServiceaccountResponse:
        """
        Description: 删除服务账号
        Summary: 删除服务账号
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteServiceaccountResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.serviceaccount.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_serviceaccount_ex_async(
        self,
        request: iam_models.DeleteServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteServiceaccountResponse:
        """
        Description: 删除服务账号
        Summary: 删除服务账号
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteServiceaccountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.serviceaccount.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_serviceaccount(
        self,
        request: iam_models.UpdateServiceaccountRequest,
    ) -> iam_models.UpdateServiceaccountResponse:
        """
        Description: 更新服务账号信息
        Summary: 更新服务账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_serviceaccount_ex(request, headers, runtime)

    async def update_serviceaccount_async(
        self,
        request: iam_models.UpdateServiceaccountRequest,
    ) -> iam_models.UpdateServiceaccountResponse:
        """
        Description: 更新服务账号信息
        Summary: 更新服务账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_serviceaccount_ex_async(request, headers, runtime)

    def update_serviceaccount_ex(
        self,
        request: iam_models.UpdateServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateServiceaccountResponse:
        """
        Description: 更新服务账号信息
        Summary: 更新服务账号信息
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateServiceaccountResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.serviceaccount.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_serviceaccount_ex_async(
        self,
        request: iam_models.UpdateServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateServiceaccountResponse:
        """
        Description: 更新服务账号信息
        Summary: 更新服务账号信息
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateServiceaccountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.serviceaccount.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_tenant_member(
        self,
        request: iam_models.RemoveTenantMemberRequest,
    ) -> iam_models.RemoveTenantMemberResponse:
        """
        Description: 移除租户成员
        Summary: 移除租户成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_tenant_member_ex(request, headers, runtime)

    async def remove_tenant_member_async(
        self,
        request: iam_models.RemoveTenantMemberRequest,
    ) -> iam_models.RemoveTenantMemberResponse:
        """
        Description: 移除租户成员
        Summary: 移除租户成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_tenant_member_ex_async(request, headers, runtime)

    def remove_tenant_member_ex(
        self,
        request: iam_models.RemoveTenantMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.RemoveTenantMemberResponse:
        """
        Description: 移除租户成员
        Summary: 移除租户成员
        """
        UtilClient.validate_model(request)
        return iam_models.RemoveTenantMemberResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.tenant.member.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_tenant_member_ex_async(
        self,
        request: iam_models.RemoveTenantMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.RemoveTenantMemberResponse:
        """
        Description: 移除租户成员
        Summary: 移除租户成员
        """
        UtilClient.validate_model(request)
        return iam_models.RemoveTenantMemberResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.tenant.member.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_group(
        self,
        request: iam_models.CreateGroupRequest,
    ) -> iam_models.CreateGroupResponse:
        """
        Description: 创建成员组
        Summary: 创建成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_group_ex(request, headers, runtime)

    async def create_group_async(
        self,
        request: iam_models.CreateGroupRequest,
    ) -> iam_models.CreateGroupResponse:
        """
        Description: 创建成员组
        Summary: 创建成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_group_ex_async(request, headers, runtime)

    def create_group_ex(
        self,
        request: iam_models.CreateGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateGroupResponse:
        """
        Description: 创建成员组
        Summary: 创建成员组
        """
        UtilClient.validate_model(request)
        return iam_models.CreateGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_group_ex_async(
        self,
        request: iam_models.CreateGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateGroupResponse:
        """
        Description: 创建成员组
        Summary: 创建成员组
        """
        UtilClient.validate_model(request)
        return iam_models.CreateGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_group(
        self,
        request: iam_models.DeleteGroupRequest,
    ) -> iam_models.DeleteGroupResponse:
        """
        Description: 删除成员组
        Summary: 删除成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_group_ex(request, headers, runtime)

    async def delete_group_async(
        self,
        request: iam_models.DeleteGroupRequest,
    ) -> iam_models.DeleteGroupResponse:
        """
        Description: 删除成员组
        Summary: 删除成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_group_ex_async(request, headers, runtime)

    def delete_group_ex(
        self,
        request: iam_models.DeleteGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteGroupResponse:
        """
        Description: 删除成员组
        Summary: 删除成员组
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_group_ex_async(
        self,
        request: iam_models.DeleteGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteGroupResponse:
        """
        Description: 删除成员组
        Summary: 删除成员组
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_group(
        self,
        request: iam_models.UpdateGroupRequest,
    ) -> iam_models.UpdateGroupResponse:
        """
        Description: 更新成员组
        Summary: 更新成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_group_ex(request, headers, runtime)

    async def update_group_async(
        self,
        request: iam_models.UpdateGroupRequest,
    ) -> iam_models.UpdateGroupResponse:
        """
        Description: 更新成员组
        Summary: 更新成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_group_ex_async(request, headers, runtime)

    def update_group_ex(
        self,
        request: iam_models.UpdateGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateGroupResponse:
        """
        Description: 更新成员组
        Summary: 更新成员组
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_group_ex_async(
        self,
        request: iam_models.UpdateGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateGroupResponse:
        """
        Description: 更新成员组
        Summary: 更新成员组
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_group_member(
        self,
        request: iam_models.AddGroupMemberRequest,
    ) -> iam_models.AddGroupMemberResponse:
        """
        Description: 添加成员组成员
        Summary: 添加成员组成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_group_member_ex(request, headers, runtime)

    async def add_group_member_async(
        self,
        request: iam_models.AddGroupMemberRequest,
    ) -> iam_models.AddGroupMemberResponse:
        """
        Description: 添加成员组成员
        Summary: 添加成员组成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_group_member_ex_async(request, headers, runtime)

    def add_group_member_ex(
        self,
        request: iam_models.AddGroupMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AddGroupMemberResponse:
        """
        Description: 添加成员组成员
        Summary: 添加成员组成员
        """
        UtilClient.validate_model(request)
        return iam_models.AddGroupMemberResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_group_member_ex_async(
        self,
        request: iam_models.AddGroupMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AddGroupMemberResponse:
        """
        Description: 添加成员组成员
        Summary: 添加成员组成员
        """
        UtilClient.validate_model(request)
        return iam_models.AddGroupMemberResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_group_member(
        self,
        request: iam_models.RemoveGroupMemberRequest,
    ) -> iam_models.RemoveGroupMemberResponse:
        """
        Description: 移除成员组成员
        Summary: 移除成员组成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_group_member_ex(request, headers, runtime)

    async def remove_group_member_async(
        self,
        request: iam_models.RemoveGroupMemberRequest,
    ) -> iam_models.RemoveGroupMemberResponse:
        """
        Description: 移除成员组成员
        Summary: 移除成员组成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_group_member_ex_async(request, headers, runtime)

    def remove_group_member_ex(
        self,
        request: iam_models.RemoveGroupMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.RemoveGroupMemberResponse:
        """
        Description: 移除成员组成员
        Summary: 移除成员组成员
        """
        UtilClient.validate_model(request)
        return iam_models.RemoveGroupMemberResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.member.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_group_member_ex_async(
        self,
        request: iam_models.RemoveGroupMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.RemoveGroupMemberResponse:
        """
        Description: 移除成员组成员
        Summary: 移除成员组成员
        """
        UtilClient.validate_model(request)
        return iam_models.RemoveGroupMemberResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.member.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_group(
        self,
        request: iam_models.GetGroupRequest,
    ) -> iam_models.GetGroupResponse:
        """
        Description: 成员组基本信息查询
        Summary: 成员组基本信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_group_ex(request, headers, runtime)

    async def get_group_async(
        self,
        request: iam_models.GetGroupRequest,
    ) -> iam_models.GetGroupResponse:
        """
        Description: 成员组基本信息查询
        Summary: 成员组基本信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_group_ex_async(request, headers, runtime)

    def get_group_ex(
        self,
        request: iam_models.GetGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetGroupResponse:
        """
        Description: 成员组基本信息查询
        Summary: 成员组基本信息查询
        """
        UtilClient.validate_model(request)
        return iam_models.GetGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_group_ex_async(
        self,
        request: iam_models.GetGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.GetGroupResponse:
        """
        Description: 成员组基本信息查询
        Summary: 成员组基本信息查询
        """
        UtilClient.validate_model(request)
        return iam_models.GetGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_group_member(
        self,
        request: iam_models.QueryGroupMemberRequest,
    ) -> iam_models.QueryGroupMemberResponse:
        """
        Description: 成员组成员查询
        Summary: 成员组成员查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_group_member_ex(request, headers, runtime)

    async def query_group_member_async(
        self,
        request: iam_models.QueryGroupMemberRequest,
    ) -> iam_models.QueryGroupMemberResponse:
        """
        Description: 成员组成员查询
        Summary: 成员组成员查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_group_member_ex_async(request, headers, runtime)

    def query_group_member_ex(
        self,
        request: iam_models.QueryGroupMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryGroupMemberResponse:
        """
        Description: 成员组成员查询
        Summary: 成员组成员查询
        """
        UtilClient.validate_model(request)
        return iam_models.QueryGroupMemberResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.group.member.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_group_member_ex_async(
        self,
        request: iam_models.QueryGroupMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.QueryGroupMemberResponse:
        """
        Description: 成员组成员查询
        Summary: 成员组成员查询
        """
        UtilClient.validate_model(request)
        return iam_models.QueryGroupMemberResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.group.member.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_operator_group(
        self,
        request: iam_models.ListOperatorGroupRequest,
    ) -> iam_models.ListOperatorGroupResponse:
        """
        Description: 获取用户所在成员组
        Summary: 获取用户所在成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_operator_group_ex(request, headers, runtime)

    async def list_operator_group_async(
        self,
        request: iam_models.ListOperatorGroupRequest,
    ) -> iam_models.ListOperatorGroupResponse:
        """
        Description: 获取用户所在成员组
        Summary: 获取用户所在成员组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_operator_group_ex_async(request, headers, runtime)

    def list_operator_group_ex(
        self,
        request: iam_models.ListOperatorGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListOperatorGroupResponse:
        """
        Description: 获取用户所在成员组
        Summary: 获取用户所在成员组
        """
        UtilClient.validate_model(request)
        return iam_models.ListOperatorGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.operator.group.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_operator_group_ex_async(
        self,
        request: iam_models.ListOperatorGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.ListOperatorGroupResponse:
        """
        Description: 获取用户所在成员组
        Summary: 获取用户所在成员组
        """
        UtilClient.validate_model(request)
        return iam_models.ListOperatorGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.operator.group.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_role_action(
        self,
        request: iam_models.AddRoleActionRequest,
    ) -> iam_models.AddRoleActionResponse:
        """
        Description: 为角色添加权限码
        Summary: 为角色添加权限码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_role_action_ex(request, headers, runtime)

    async def add_role_action_async(
        self,
        request: iam_models.AddRoleActionRequest,
    ) -> iam_models.AddRoleActionResponse:
        """
        Description: 为角色添加权限码
        Summary: 为角色添加权限码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_role_action_ex_async(request, headers, runtime)

    def add_role_action_ex(
        self,
        request: iam_models.AddRoleActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AddRoleActionResponse:
        """
        Description: 为角色添加权限码
        Summary: 为角色添加权限码
        """
        UtilClient.validate_model(request)
        return iam_models.AddRoleActionResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.action.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_role_action_ex_async(
        self,
        request: iam_models.AddRoleActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.AddRoleActionResponse:
        """
        Description: 为角色添加权限码
        Summary: 为角色添加权限码
        """
        UtilClient.validate_model(request)
        return iam_models.AddRoleActionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.action.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_role_action(
        self,
        request: iam_models.RemoveRoleActionRequest,
    ) -> iam_models.RemoveRoleActionResponse:
        """
        Description: 移除角色权限
        Summary: 移除角色权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_role_action_ex(request, headers, runtime)

    async def remove_role_action_async(
        self,
        request: iam_models.RemoveRoleActionRequest,
    ) -> iam_models.RemoveRoleActionResponse:
        """
        Description: 移除角色权限
        Summary: 移除角色权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_role_action_ex_async(request, headers, runtime)

    def remove_role_action_ex(
        self,
        request: iam_models.RemoveRoleActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.RemoveRoleActionResponse:
        """
        Description: 移除角色权限
        Summary: 移除角色权限
        """
        UtilClient.validate_model(request)
        return iam_models.RemoveRoleActionResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.action.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_role_action_ex_async(
        self,
        request: iam_models.RemoveRoleActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.RemoveRoleActionResponse:
        """
        Description: 移除角色权限
        Summary: 移除角色权限
        """
        UtilClient.validate_model(request)
        return iam_models.RemoveRoleActionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.action.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_role(
        self,
        request: iam_models.CreateRoleRequest,
    ) -> iam_models.CreateRoleResponse:
        """
        Description: 创建自定义角色
        Summary: 创建自定义角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_role_ex(request, headers, runtime)

    async def create_role_async(
        self,
        request: iam_models.CreateRoleRequest,
    ) -> iam_models.CreateRoleResponse:
        """
        Description: 创建自定义角色
        Summary: 创建自定义角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_role_ex_async(request, headers, runtime)

    def create_role_ex(
        self,
        request: iam_models.CreateRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateRoleResponse:
        """
        Description: 创建自定义角色
        Summary: 创建自定义角色
        """
        UtilClient.validate_model(request)
        return iam_models.CreateRoleResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_role_ex_async(
        self,
        request: iam_models.CreateRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.CreateRoleResponse:
        """
        Description: 创建自定义角色
        Summary: 创建自定义角色
        """
        UtilClient.validate_model(request)
        return iam_models.CreateRoleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_role(
        self,
        request: iam_models.DeleteRoleRequest,
    ) -> iam_models.DeleteRoleResponse:
        """
        Description: 删除角色
        Summary: 删除角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_role_ex(request, headers, runtime)

    async def delete_role_async(
        self,
        request: iam_models.DeleteRoleRequest,
    ) -> iam_models.DeleteRoleResponse:
        """
        Description: 删除角色
        Summary: 删除角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_role_ex_async(request, headers, runtime)

    def delete_role_ex(
        self,
        request: iam_models.DeleteRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteRoleResponse:
        """
        Description: 删除角色
        Summary: 删除角色
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteRoleResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_role_ex_async(
        self,
        request: iam_models.DeleteRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.DeleteRoleResponse:
        """
        Description: 删除角色
        Summary: 删除角色
        """
        UtilClient.validate_model(request)
        return iam_models.DeleteRoleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_role(
        self,
        request: iam_models.UpdateRoleRequest,
    ) -> iam_models.UpdateRoleResponse:
        """
        Description: 更新角色
        Summary: 更新角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_role_ex(request, headers, runtime)

    async def update_role_async(
        self,
        request: iam_models.UpdateRoleRequest,
    ) -> iam_models.UpdateRoleResponse:
        """
        Description: 更新角色
        Summary: 更新角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_role_ex_async(request, headers, runtime)

    def update_role_ex(
        self,
        request: iam_models.UpdateRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateRoleResponse:
        """
        Description: 更新角色
        Summary: 更新角色
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateRoleResponse().from_map(
            self.do_request('1.0', 'antcloud.iam.role.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_role_ex_async(
        self,
        request: iam_models.UpdateRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iam_models.UpdateRoleResponse:
        """
        Description: 更新角色
        Summary: 更新角色
        """
        UtilClient.validate_model(request)
        return iam_models.UpdateRoleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.iam.role.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
