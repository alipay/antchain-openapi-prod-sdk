# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_acm import models as acm_models
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
        config: acm_models.Config,
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
            # 访问IaaS层的身份
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
                    '_prod_code': 'acm',
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
            # 访问IaaS层的身份
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
                    '_prod_code': 'acm',
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

    def get_customer(
        self,
        request: acm_models.GetCustomerRequest,
    ) -> acm_models.GetCustomerResponse:
        """
        Description: 查询企业详情
        Summary: 获取企业
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_customer_ex(request, headers, runtime)

    async def get_customer_async(
        self,
        request: acm_models.GetCustomerRequest,
    ) -> acm_models.GetCustomerResponse:
        """
        Description: 查询企业详情
        Summary: 获取企业
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_customer_ex_async(request, headers, runtime)

    def get_customer_ex(
        self,
        request: acm_models.GetCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetCustomerResponse:
        """
        Description: 查询企业详情
        Summary: 获取企业
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetCustomerResponse(),
            self.do_request('1.0', 'antcloud.acm.customer.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_customer_ex_async(
        self,
        request: acm_models.GetCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetCustomerResponse:
        """
        Description: 查询企业详情
        Summary: 获取企业
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetCustomerResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.customer.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_operator(
        self,
        request: acm_models.GetOperatorRequest,
    ) -> acm_models.GetOperatorResponse:
        """
        Description: 查询一个操作员的详情
        Summary: 获取操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_operator_ex(request, headers, runtime)

    async def get_operator_async(
        self,
        request: acm_models.GetOperatorRequest,
    ) -> acm_models.GetOperatorResponse:
        """
        Description: 查询一个操作员的详情
        Summary: 获取操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_operator_ex_async(request, headers, runtime)

    def get_operator_ex(
        self,
        request: acm_models.GetOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetOperatorResponse:
        """
        Description: 查询一个操作员的详情
        Summary: 获取操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetOperatorResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_operator_ex_async(
        self,
        request: acm_models.GetOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetOperatorResponse:
        """
        Description: 查询一个操作员的详情
        Summary: 获取操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetOperatorResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_operator(
        self,
        request: acm_models.QueryOperatorRequest,
    ) -> acm_models.QueryOperatorResponse:
        """
        Description: 查询操作员列表
        Summary: 查询操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_operator_ex(request, headers, runtime)

    async def query_operator_async(
        self,
        request: acm_models.QueryOperatorRequest,
    ) -> acm_models.QueryOperatorResponse:
        """
        Description: 查询操作员列表
        Summary: 查询操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_operator_ex_async(request, headers, runtime)

    def query_operator_ex(
        self,
        request: acm_models.QueryOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryOperatorResponse:
        """
        Description: 查询操作员列表
        Summary: 查询操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryOperatorResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_operator_ex_async(
        self,
        request: acm_models.QueryOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryOperatorResponse:
        """
        Description: 查询操作员列表
        Summary: 查询操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryOperatorResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def search_operator(
        self,
        request: acm_models.SearchOperatorRequest,
    ) -> acm_models.SearchOperatorResponse:
        """
        Description: 搜索操作员
        Summary: 搜索操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.search_operator_ex(request, headers, runtime)

    async def search_operator_async(
        self,
        request: acm_models.SearchOperatorRequest,
    ) -> acm_models.SearchOperatorResponse:
        """
        Description: 搜索操作员
        Summary: 搜索操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.search_operator_ex_async(request, headers, runtime)

    def search_operator_ex(
        self,
        request: acm_models.SearchOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.SearchOperatorResponse:
        """
        Description: 搜索操作员
        Summary: 搜索操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.SearchOperatorResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def search_operator_ex_async(
        self,
        request: acm_models.SearchOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.SearchOperatorResponse:
        """
        Description: 搜索操作员
        Summary: 搜索操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.SearchOperatorResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_operator(
        self,
        request: acm_models.CreateOperatorRequest,
    ) -> acm_models.CreateOperatorResponse:
        """
        Description: 创建操作员
        Summary: 创建操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_operator_ex(request, headers, runtime)

    async def create_operator_async(
        self,
        request: acm_models.CreateOperatorRequest,
    ) -> acm_models.CreateOperatorResponse:
        """
        Description: 创建操作员
        Summary: 创建操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_operator_ex_async(request, headers, runtime)

    def create_operator_ex(
        self,
        request: acm_models.CreateOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateOperatorResponse:
        """
        Description: 创建操作员
        Summary: 创建操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateOperatorResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_operator_ex_async(
        self,
        request: acm_models.CreateOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateOperatorResponse:
        """
        Description: 创建操作员
        Summary: 创建操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateOperatorResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_operator(
        self,
        request: acm_models.UpdateOperatorRequest,
    ) -> acm_models.UpdateOperatorResponse:
        """
        Description: 更新操作员
        Summary: 更新操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_operator_ex(request, headers, runtime)

    async def update_operator_async(
        self,
        request: acm_models.UpdateOperatorRequest,
    ) -> acm_models.UpdateOperatorResponse:
        """
        Description: 更新操作员
        Summary: 更新操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_operator_ex_async(request, headers, runtime)

    def update_operator_ex(
        self,
        request: acm_models.UpdateOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.UpdateOperatorResponse:
        """
        Description: 更新操作员
        Summary: 更新操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.UpdateOperatorResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_operator_ex_async(
        self,
        request: acm_models.UpdateOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.UpdateOperatorResponse:
        """
        Description: 更新操作员
        Summary: 更新操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.UpdateOperatorResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_operator(
        self,
        request: acm_models.DeleteOperatorRequest,
    ) -> acm_models.DeleteOperatorResponse:
        """
        Description: 删除操作员
        Summary: 删除操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_operator_ex(request, headers, runtime)

    async def delete_operator_async(
        self,
        request: acm_models.DeleteOperatorRequest,
    ) -> acm_models.DeleteOperatorResponse:
        """
        Description: 删除操作员
        Summary: 删除操作员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_operator_ex_async(request, headers, runtime)

    def delete_operator_ex(
        self,
        request: acm_models.DeleteOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.DeleteOperatorResponse:
        """
        Description: 删除操作员
        Summary: 删除操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.DeleteOperatorResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_operator_ex_async(
        self,
        request: acm_models.DeleteOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.DeleteOperatorResponse:
        """
        Description: 删除操作员
        Summary: 删除操作员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.DeleteOperatorResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_tenant_member(
        self,
        request: acm_models.AddTenantMemberRequest,
    ) -> acm_models.AddTenantMemberResponse:
        """
        Description: 添加租户成员
        Summary: 添加租户成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_tenant_member_ex(request, headers, runtime)

    async def add_tenant_member_async(
        self,
        request: acm_models.AddTenantMemberRequest,
    ) -> acm_models.AddTenantMemberResponse:
        """
        Description: 添加租户成员
        Summary: 添加租户成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_tenant_member_ex_async(request, headers, runtime)

    def add_tenant_member_ex(
        self,
        request: acm_models.AddTenantMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.AddTenantMemberResponse:
        """
        Description: 添加租户成员
        Summary: 添加租户成员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.AddTenantMemberResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_tenant_member_ex_async(
        self,
        request: acm_models.AddTenantMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.AddTenantMemberResponse:
        """
        Description: 添加租户成员
        Summary: 添加租户成员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.AddTenantMemberResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_tenant(
        self,
        request: acm_models.CreateTenantRequest,
    ) -> acm_models.CreateTenantResponse:
        """
        Description: 初始化租户
        Summary: 初始化租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_tenant_ex(request, headers, runtime)

    async def create_tenant_async(
        self,
        request: acm_models.CreateTenantRequest,
    ) -> acm_models.CreateTenantResponse:
        """
        Description: 初始化租户
        Summary: 初始化租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_tenant_ex_async(request, headers, runtime)

    def create_tenant_ex(
        self,
        request: acm_models.CreateTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateTenantResponse:
        """
        Description: 初始化租户
        Summary: 初始化租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_tenant_ex_async(
        self,
        request: acm_models.CreateTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateTenantResponse:
        """
        Description: 初始化租户
        Summary: 初始化租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tenant(
        self,
        request: acm_models.GetTenantRequest,
    ) -> acm_models.GetTenantResponse:
        """
        Description: 查询租户详情
        Summary: 获取用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tenant_ex(request, headers, runtime)

    async def get_tenant_async(
        self,
        request: acm_models.GetTenantRequest,
    ) -> acm_models.GetTenantResponse:
        """
        Description: 查询租户详情
        Summary: 获取用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tenant_ex_async(request, headers, runtime)

    def get_tenant_ex(
        self,
        request: acm_models.GetTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetTenantResponse:
        """
        Description: 查询租户详情
        Summary: 获取用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tenant_ex_async(
        self,
        request: acm_models.GetTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetTenantResponse:
        """
        Description: 查询租户详情
        Summary: 获取用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenant(
        self,
        request: acm_models.QueryTenantRequest,
    ) -> acm_models.QueryTenantResponse:
        """
        Description: 查询租户列表
        Summary: 查询租户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenant_ex(request, headers, runtime)

    async def query_tenant_async(
        self,
        request: acm_models.QueryTenantRequest,
    ) -> acm_models.QueryTenantResponse:
        """
        Description: 查询租户列表
        Summary: 查询租户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenant_ex_async(request, headers, runtime)

    def query_tenant_ex(
        self,
        request: acm_models.QueryTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryTenantResponse:
        """
        Description: 查询租户列表
        Summary: 查询租户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenant_ex_async(
        self,
        request: acm_models.QueryTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryTenantResponse:
        """
        Description: 查询租户列表
        Summary: 查询租户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antpassport_tenant(
        self,
        request: acm_models.GetAntpassportTenantRequest,
    ) -> acm_models.GetAntpassportTenantResponse:
        """
        Description: 根据蚂蚁通行证uid查询租户id
        Summary: 查询租户ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antpassport_tenant_ex(request, headers, runtime)

    async def get_antpassport_tenant_async(
        self,
        request: acm_models.GetAntpassportTenantRequest,
    ) -> acm_models.GetAntpassportTenantResponse:
        """
        Description: 根据蚂蚁通行证uid查询租户id
        Summary: 查询租户ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antpassport_tenant_ex_async(request, headers, runtime)

    def get_antpassport_tenant_ex(
        self,
        request: acm_models.GetAntpassportTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetAntpassportTenantResponse:
        """
        Description: 根据蚂蚁通行证uid查询租户id
        Summary: 查询租户ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetAntpassportTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.antpassport.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antpassport_tenant_ex_async(
        self,
        request: acm_models.GetAntpassportTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetAntpassportTenantResponse:
        """
        Description: 根据蚂蚁通行证uid查询租户id
        Summary: 查询租户ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetAntpassportTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.antpassport.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_currentid(
        self,
        request: acm_models.GetCurrentidRequest,
    ) -> acm_models.GetCurrentidResponse:
        """
        Description: 获取调用接口所使用AccessKey对应的身份实体信息
        Summary: 获取调用接口所使用AccessKey对应的身份实体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_currentid_ex(request, headers, runtime)

    async def get_currentid_async(
        self,
        request: acm_models.GetCurrentidRequest,
    ) -> acm_models.GetCurrentidResponse:
        """
        Description: 获取调用接口所使用AccessKey对应的身份实体信息
        Summary: 获取调用接口所使用AccessKey对应的身份实体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_currentid_ex_async(request, headers, runtime)

    def get_currentid_ex(
        self,
        request: acm_models.GetCurrentidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetCurrentidResponse:
        """
        Description: 获取调用接口所使用AccessKey对应的身份实体信息
        Summary: 获取调用接口所使用AccessKey对应的身份实体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetCurrentidResponse(),
            self.do_request('1.0', 'antcloud.acm.currentid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_currentid_ex_async(
        self,
        request: acm_models.GetCurrentidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetCurrentidResponse:
        """
        Description: 获取调用接口所使用AccessKey对应的身份实体信息
        Summary: 获取调用接口所使用AccessKey对应的身份实体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetCurrentidResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.currentid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tenant_dingtoken(
        self,
        request: acm_models.GetTenantDingtokenRequest,
    ) -> acm_models.GetTenantDingtokenResponse:
        """
        Description: 获取租户对应的钉钉授权token信息，内部接口
        Summary: 获取租户的钉钉授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tenant_dingtoken_ex(request, headers, runtime)

    async def get_tenant_dingtoken_async(
        self,
        request: acm_models.GetTenantDingtokenRequest,
    ) -> acm_models.GetTenantDingtokenResponse:
        """
        Description: 获取租户对应的钉钉授权token信息，内部接口
        Summary: 获取租户的钉钉授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tenant_dingtoken_ex_async(request, headers, runtime)

    def get_tenant_dingtoken_ex(
        self,
        request: acm_models.GetTenantDingtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetTenantDingtokenResponse:
        """
        Description: 获取租户对应的钉钉授权token信息，内部接口
        Summary: 获取租户的钉钉授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetTenantDingtokenResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.dingtoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tenant_dingtoken_ex_async(
        self,
        request: acm_models.GetTenantDingtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetTenantDingtokenResponse:
        """
        Description: 获取租户对应的钉钉授权token信息，内部接口
        Summary: 获取租户的钉钉授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetTenantDingtokenResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.dingtoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_admin(
        self,
        request: acm_models.QueryAdminRequest,
    ) -> acm_models.QueryAdminResponse:
        """
        Description: 分页查询管理员，内部接口
        Summary: 分页查询管理员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_admin_ex(request, headers, runtime)

    async def query_admin_async(
        self,
        request: acm_models.QueryAdminRequest,
    ) -> acm_models.QueryAdminResponse:
        """
        Description: 分页查询管理员，内部接口
        Summary: 分页查询管理员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_admin_ex_async(request, headers, runtime)

    def query_admin_ex(
        self,
        request: acm_models.QueryAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryAdminResponse:
        """
        Description: 分页查询管理员，内部接口
        Summary: 分页查询管理员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryAdminResponse(),
            self.do_request('1.0', 'antcloud.acm.admin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_admin_ex_async(
        self,
        request: acm_models.QueryAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryAdminResponse:
        """
        Description: 分页查询管理员，内部接口
        Summary: 分页查询管理员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryAdminResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.admin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tenant_iaasaccount(
        self,
        request: acm_models.GetTenantIaasaccountRequest,
    ) -> acm_models.GetTenantIaasaccountResponse:
        """
        Description: 获取租户的IaaS账号
        Summary: 获取租户的IaaS账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tenant_iaasaccount_ex(request, headers, runtime)

    async def get_tenant_iaasaccount_async(
        self,
        request: acm_models.GetTenantIaasaccountRequest,
    ) -> acm_models.GetTenantIaasaccountResponse:
        """
        Description: 获取租户的IaaS账号
        Summary: 获取租户的IaaS账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tenant_iaasaccount_ex_async(request, headers, runtime)

    def get_tenant_iaasaccount_ex(
        self,
        request: acm_models.GetTenantIaasaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetTenantIaasaccountResponse:
        """
        Description: 获取租户的IaaS账号
        Summary: 获取租户的IaaS账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetTenantIaasaccountResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.iaasaccount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tenant_iaasaccount_ex_async(
        self,
        request: acm_models.GetTenantIaasaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetTenantIaasaccountResponse:
        """
        Description: 获取租户的IaaS账号
        Summary: 获取租户的IaaS账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetTenantIaasaccountResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.iaasaccount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_customer(
        self,
        request: acm_models.ListCustomerRequest,
    ) -> acm_models.ListCustomerResponse:
        """
        Description: 查询企业列表(内部接口,私有云开放)
        Summary: 查询企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_customer_ex(request, headers, runtime)

    async def list_customer_async(
        self,
        request: acm_models.ListCustomerRequest,
    ) -> acm_models.ListCustomerResponse:
        """
        Description: 查询企业列表(内部接口,私有云开放)
        Summary: 查询企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_customer_ex_async(request, headers, runtime)

    def list_customer_ex(
        self,
        request: acm_models.ListCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.ListCustomerResponse:
        """
        Description: 查询企业列表(内部接口,私有云开放)
        Summary: 查询企业列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.ListCustomerResponse(),
            self.do_request('1.0', 'antcloud.acm.customer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_customer_ex_async(
        self,
        request: acm_models.ListCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.ListCustomerResponse:
        """
        Description: 查询企业列表(内部接口,私有云开放)
        Summary: 查询企业列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.ListCustomerResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.customer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_alipay_tenant(
        self,
        request: acm_models.CheckAlipayTenantRequest,
    ) -> acm_models.CheckAlipayTenantResponse:
        """
        Description: 支付宝账号证书信息校验及校验、入驻、打标
        Summary: 支付宝账号证书信息校验、入驻、打标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_alipay_tenant_ex(request, headers, runtime)

    async def check_alipay_tenant_async(
        self,
        request: acm_models.CheckAlipayTenantRequest,
    ) -> acm_models.CheckAlipayTenantResponse:
        """
        Description: 支付宝账号证书信息校验及校验、入驻、打标
        Summary: 支付宝账号证书信息校验、入驻、打标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_alipay_tenant_ex_async(request, headers, runtime)

    def check_alipay_tenant_ex(
        self,
        request: acm_models.CheckAlipayTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CheckAlipayTenantResponse:
        """
        Description: 支付宝账号证书信息校验及校验、入驻、打标
        Summary: 支付宝账号证书信息校验、入驻、打标
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CheckAlipayTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.alipay.tenant.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_alipay_tenant_ex_async(
        self,
        request: acm_models.CheckAlipayTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CheckAlipayTenantResponse:
        """
        Description: 支付宝账号证书信息校验及校验、入驻、打标
        Summary: 支付宝账号证书信息校验、入驻、打标
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CheckAlipayTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.alipay.tenant.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenant_status(
        self,
        request: acm_models.QueryTenantStatusRequest,
    ) -> acm_models.QueryTenantStatusResponse:
        """
        Description: 租户入住状态查询
        Summary: 租户入住状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenant_status_ex(request, headers, runtime)

    async def query_tenant_status_async(
        self,
        request: acm_models.QueryTenantStatusRequest,
    ) -> acm_models.QueryTenantStatusResponse:
        """
        Description: 租户入住状态查询
        Summary: 租户入住状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenant_status_ex_async(request, headers, runtime)

    def query_tenant_status_ex(
        self,
        request: acm_models.QueryTenantStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryTenantStatusResponse:
        """
        Description: 租户入住状态查询
        Summary: 租户入住状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryTenantStatusResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenant_status_ex_async(
        self,
        request: acm_models.QueryTenantStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryTenantStatusResponse:
        """
        Description: 租户入住状态查询
        Summary: 租户入住状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryTenantStatusResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_tenant(
        self,
        request: acm_models.CreateAntchainTenantRequest,
    ) -> acm_models.CreateAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_tenant_ex(request, headers, runtime)

    async def create_antchain_tenant_async(
        self,
        request: acm_models.CreateAntchainTenantRequest,
    ) -> acm_models.CreateAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_tenant_ex_async(request, headers, runtime)

    def create_antchain_tenant_ex(
        self,
        request: acm_models.CreateAntchainTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateAntchainTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.antchain.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_tenant_ex_async(
        self,
        request: acm_models.CreateAntchainTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateAntchainTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.antchain.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_customer_identity(
        self,
        request: acm_models.UpdateCustomerIdentityRequest,
    ) -> acm_models.UpdateCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_customer_identity_ex(request, headers, runtime)

    async def update_customer_identity_async(
        self,
        request: acm_models.UpdateCustomerIdentityRequest,
    ) -> acm_models.UpdateCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_customer_identity_ex_async(request, headers, runtime)

    def update_customer_identity_ex(
        self,
        request: acm_models.UpdateCustomerIdentityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.UpdateCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.UpdateCustomerIdentityResponse(),
            self.do_request('1.0', 'antcloud.acm.customer.identity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_customer_identity_ex_async(
        self,
        request: acm_models.UpdateCustomerIdentityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.UpdateCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.UpdateCustomerIdentityResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.customer.identity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_master_tenant(
        self,
        request: acm_models.GetMasterTenantRequest,
    ) -> acm_models.GetMasterTenantResponse:
        """
        Description: 使用用户ID或用户CODE查询用户信息
        Summary: 使用用户ID或用户CODE查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_master_tenant_ex(request, headers, runtime)

    async def get_master_tenant_async(
        self,
        request: acm_models.GetMasterTenantRequest,
    ) -> acm_models.GetMasterTenantResponse:
        """
        Description: 使用用户ID或用户CODE查询用户信息
        Summary: 使用用户ID或用户CODE查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_master_tenant_ex_async(request, headers, runtime)

    def get_master_tenant_ex(
        self,
        request: acm_models.GetMasterTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetMasterTenantResponse:
        """
        Description: 使用用户ID或用户CODE查询用户信息
        Summary: 使用用户ID或用户CODE查询用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetMasterTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.master.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_master_tenant_ex_async(
        self,
        request: acm_models.GetMasterTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetMasterTenantResponse:
        """
        Description: 使用用户ID或用户CODE查询用户信息
        Summary: 使用用户ID或用户CODE查询用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetMasterTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.master.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_loginname(
        self,
        request: acm_models.CheckLoginnameRequest,
    ) -> acm_models.CheckLoginnameResponse:
        """
        Description: 检查邮箱是否可以用来注册
        Summary: 检查邮箱是否可以用来注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_loginname_ex(request, headers, runtime)

    async def check_loginname_async(
        self,
        request: acm_models.CheckLoginnameRequest,
    ) -> acm_models.CheckLoginnameResponse:
        """
        Description: 检查邮箱是否可以用来注册
        Summary: 检查邮箱是否可以用来注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_loginname_ex_async(request, headers, runtime)

    def check_loginname_ex(
        self,
        request: acm_models.CheckLoginnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CheckLoginnameResponse:
        """
        Description: 检查邮箱是否可以用来注册
        Summary: 检查邮箱是否可以用来注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CheckLoginnameResponse(),
            self.do_request('1.0', 'antcloud.acm.loginname.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_loginname_ex_async(
        self,
        request: acm_models.CheckLoginnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CheckLoginnameResponse:
        """
        Description: 检查邮箱是否可以用来注册
        Summary: 检查邮箱是否可以用来注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CheckLoginnameResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.loginname.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenant_tag(
        self,
        request: acm_models.QueryTenantTagRequest,
    ) -> acm_models.QueryTenantTagResponse:
        """
        Description: 查询租户的标签
        Summary: 查询租户的标签列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenant_tag_ex(request, headers, runtime)

    async def query_tenant_tag_async(
        self,
        request: acm_models.QueryTenantTagRequest,
    ) -> acm_models.QueryTenantTagResponse:
        """
        Description: 查询租户的标签
        Summary: 查询租户的标签列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenant_tag_ex_async(request, headers, runtime)

    def query_tenant_tag_ex(
        self,
        request: acm_models.QueryTenantTagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryTenantTagResponse:
        """
        Description: 查询租户的标签
        Summary: 查询租户的标签列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryTenantTagResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.tag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenant_tag_ex_async(
        self,
        request: acm_models.QueryTenantTagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.QueryTenantTagResponse:
        """
        Description: 查询租户的标签
        Summary: 查询租户的标签列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.QueryTenantTagResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.tag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_tenant_businesstag(
        self,
        request: acm_models.AddTenantBusinesstagRequest,
    ) -> acm_models.AddTenantBusinesstagResponse:
        """
        Description: 租户增加业务标签
        Summary: 租户增加业务标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_tenant_businesstag_ex(request, headers, runtime)

    async def add_tenant_businesstag_async(
        self,
        request: acm_models.AddTenantBusinesstagRequest,
    ) -> acm_models.AddTenantBusinesstagResponse:
        """
        Description: 租户增加业务标签
        Summary: 租户增加业务标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_tenant_businesstag_ex_async(request, headers, runtime)

    def add_tenant_businesstag_ex(
        self,
        request: acm_models.AddTenantBusinesstagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.AddTenantBusinesstagResponse:
        """
        Description: 租户增加业务标签
        Summary: 租户增加业务标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.AddTenantBusinesstagResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.businesstag.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_tenant_businesstag_ex_async(
        self,
        request: acm_models.AddTenantBusinesstagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.AddTenantBusinesstagResponse:
        """
        Description: 租户增加业务标签
        Summary: 租户增加业务标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.AddTenantBusinesstagResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.businesstag.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_tenant_businesstag(
        self,
        request: acm_models.RemoveTenantBusinesstagRequest,
    ) -> acm_models.RemoveTenantBusinesstagResponse:
        """
        Description: 删除业务标签
        Summary: 删除业务标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_tenant_businesstag_ex(request, headers, runtime)

    async def remove_tenant_businesstag_async(
        self,
        request: acm_models.RemoveTenantBusinesstagRequest,
    ) -> acm_models.RemoveTenantBusinesstagResponse:
        """
        Description: 删除业务标签
        Summary: 删除业务标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_tenant_businesstag_ex_async(request, headers, runtime)

    def remove_tenant_businesstag_ex(
        self,
        request: acm_models.RemoveTenantBusinesstagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.RemoveTenantBusinesstagResponse:
        """
        Description: 删除业务标签
        Summary: 删除业务标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.RemoveTenantBusinesstagResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.businesstag.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_tenant_businesstag_ex_async(
        self,
        request: acm_models.RemoveTenantBusinesstagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.RemoveTenantBusinesstagResponse:
        """
        Description: 删除业务标签
        Summary: 删除业务标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.RemoveTenantBusinesstagResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.businesstag.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_operator_activeemail(
        self,
        request: acm_models.SendOperatorActiveemailRequest,
    ) -> acm_models.SendOperatorActiveemailResponse:
        """
        Description: 用户发送操作员的激活邮件
        Summary: 操作员发送激活邮件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_operator_activeemail_ex(request, headers, runtime)

    async def send_operator_activeemail_async(
        self,
        request: acm_models.SendOperatorActiveemailRequest,
    ) -> acm_models.SendOperatorActiveemailResponse:
        """
        Description: 用户发送操作员的激活邮件
        Summary: 操作员发送激活邮件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_operator_activeemail_ex_async(request, headers, runtime)

    def send_operator_activeemail_ex(
        self,
        request: acm_models.SendOperatorActiveemailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.SendOperatorActiveemailResponse:
        """
        Description: 用户发送操作员的激活邮件
        Summary: 操作员发送激活邮件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.SendOperatorActiveemailResponse(),
            self.do_request('1.0', 'antcloud.acm.operator.activeemail.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_operator_activeemail_ex_async(
        self,
        request: acm_models.SendOperatorActiveemailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.SendOperatorActiveemailResponse:
        """
        Description: 用户发送操作员的激活邮件
        Summary: 操作员发送激活邮件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.SendOperatorActiveemailResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.operator.activeemail.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_tenant_info(
        self,
        request: acm_models.SyncTenantInfoRequest,
    ) -> acm_models.SyncTenantInfoResponse:
        """
        Description: 账号信息同步
        Summary: 账号信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_tenant_info_ex(request, headers, runtime)

    async def sync_tenant_info_async(
        self,
        request: acm_models.SyncTenantInfoRequest,
    ) -> acm_models.SyncTenantInfoResponse:
        """
        Description: 账号信息同步
        Summary: 账号信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_tenant_info_ex_async(request, headers, runtime)

    def sync_tenant_info_ex(
        self,
        request: acm_models.SyncTenantInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.SyncTenantInfoResponse:
        """
        Description: 账号信息同步
        Summary: 账号信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.SyncTenantInfoResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.info.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_tenant_info_ex_async(
        self,
        request: acm_models.SyncTenantInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.SyncTenantInfoResponse:
        """
        Description: 账号信息同步
        Summary: 账号信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.SyncTenantInfoResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.info.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_oauth_serviceaccount(
        self,
        request: acm_models.CreateOauthServiceaccountRequest,
    ) -> acm_models.CreateOauthServiceaccountResponse:
        """
        Description: 三方授权创建服务账号
        Summary: 三方授权创建服务账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_oauth_serviceaccount_ex(request, headers, runtime)

    async def create_oauth_serviceaccount_async(
        self,
        request: acm_models.CreateOauthServiceaccountRequest,
    ) -> acm_models.CreateOauthServiceaccountResponse:
        """
        Description: 三方授权创建服务账号
        Summary: 三方授权创建服务账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_oauth_serviceaccount_ex_async(request, headers, runtime)

    def create_oauth_serviceaccount_ex(
        self,
        request: acm_models.CreateOauthServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateOauthServiceaccountResponse:
        """
        Description: 三方授权创建服务账号
        Summary: 三方授权创建服务账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateOauthServiceaccountResponse(),
            self.do_request('1.0', 'antcloud.acm.oauth.serviceaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_oauth_serviceaccount_ex_async(
        self,
        request: acm_models.CreateOauthServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateOauthServiceaccountResponse:
        """
        Description: 三方授权创建服务账号
        Summary: 三方授权创建服务账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateOauthServiceaccountResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.oauth.serviceaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_oauth_serviceaccount(
        self,
        request: acm_models.GetOauthServiceaccountRequest,
    ) -> acm_models.GetOauthServiceaccountResponse:
        """
        Description: 三方授权获取服务账号信息
        Summary: 三方授权获取服务账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_oauth_serviceaccount_ex(request, headers, runtime)

    async def get_oauth_serviceaccount_async(
        self,
        request: acm_models.GetOauthServiceaccountRequest,
    ) -> acm_models.GetOauthServiceaccountResponse:
        """
        Description: 三方授权获取服务账号信息
        Summary: 三方授权获取服务账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_oauth_serviceaccount_ex_async(request, headers, runtime)

    def get_oauth_serviceaccount_ex(
        self,
        request: acm_models.GetOauthServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetOauthServiceaccountResponse:
        """
        Description: 三方授权获取服务账号信息
        Summary: 三方授权获取服务账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetOauthServiceaccountResponse(),
            self.do_request('1.0', 'antcloud.acm.oauth.serviceaccount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_oauth_serviceaccount_ex_async(
        self,
        request: acm_models.GetOauthServiceaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetOauthServiceaccountResponse:
        """
        Description: 三方授权获取服务账号信息
        Summary: 三方授权获取服务账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetOauthServiceaccountResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.oauth.serviceaccount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_oauth_mobilelogin(
        self,
        request: acm_models.EnableOauthMobileloginRequest,
    ) -> acm_models.EnableOauthMobileloginResponse:
        """
        Description: 三方授权开通手机号登陆
        Summary: 三方授权开通手机号登陆
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_oauth_mobilelogin_ex(request, headers, runtime)

    async def enable_oauth_mobilelogin_async(
        self,
        request: acm_models.EnableOauthMobileloginRequest,
    ) -> acm_models.EnableOauthMobileloginResponse:
        """
        Description: 三方授权开通手机号登陆
        Summary: 三方授权开通手机号登陆
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_oauth_mobilelogin_ex_async(request, headers, runtime)

    def enable_oauth_mobilelogin_ex(
        self,
        request: acm_models.EnableOauthMobileloginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.EnableOauthMobileloginResponse:
        """
        Description: 三方授权开通手机号登陆
        Summary: 三方授权开通手机号登陆
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.EnableOauthMobileloginResponse(),
            self.do_request('1.0', 'antcloud.acm.oauth.mobilelogin.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_oauth_mobilelogin_ex_async(
        self,
        request: acm_models.EnableOauthMobileloginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.EnableOauthMobileloginResponse:
        """
        Description: 三方授权开通手机号登陆
        Summary: 三方授权开通手机号登陆
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.EnableOauthMobileloginResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.oauth.mobilelogin.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_oauth_mobilelogin(
        self,
        request: acm_models.DisableOauthMobileloginRequest,
    ) -> acm_models.DisableOauthMobileloginResponse:
        """
        Description: 三方授权关闭手机号登陆
        Summary: 三方授权关闭手机号登陆
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_oauth_mobilelogin_ex(request, headers, runtime)

    async def disable_oauth_mobilelogin_async(
        self,
        request: acm_models.DisableOauthMobileloginRequest,
    ) -> acm_models.DisableOauthMobileloginResponse:
        """
        Description: 三方授权关闭手机号登陆
        Summary: 三方授权关闭手机号登陆
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_oauth_mobilelogin_ex_async(request, headers, runtime)

    def disable_oauth_mobilelogin_ex(
        self,
        request: acm_models.DisableOauthMobileloginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.DisableOauthMobileloginResponse:
        """
        Description: 三方授权关闭手机号登陆
        Summary: 三方授权关闭手机号登陆
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.DisableOauthMobileloginResponse(),
            self.do_request('1.0', 'antcloud.acm.oauth.mobilelogin.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_oauth_mobilelogin_ex_async(
        self,
        request: acm_models.DisableOauthMobileloginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.DisableOauthMobileloginResponse:
        """
        Description: 三方授权关闭手机号登陆
        Summary: 三方授权关闭手机号登陆
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.DisableOauthMobileloginResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.oauth.mobilelogin.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_serviceaccount_oneparty(
        self,
        request: acm_models.CreateServiceaccountOnepartyRequest,
    ) -> acm_models.CreateServiceaccountOnepartyResponse:
        """
        Description: 提供给一方化平台代客创建服务账号（ak sk）
        Summary: 一方化会员服务账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_serviceaccount_oneparty_ex(request, headers, runtime)

    async def create_serviceaccount_oneparty_async(
        self,
        request: acm_models.CreateServiceaccountOnepartyRequest,
    ) -> acm_models.CreateServiceaccountOnepartyResponse:
        """
        Description: 提供给一方化平台代客创建服务账号（ak sk）
        Summary: 一方化会员服务账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_serviceaccount_oneparty_ex_async(request, headers, runtime)

    def create_serviceaccount_oneparty_ex(
        self,
        request: acm_models.CreateServiceaccountOnepartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateServiceaccountOnepartyResponse:
        """
        Description: 提供给一方化平台代客创建服务账号（ak sk）
        Summary: 一方化会员服务账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateServiceaccountOnepartyResponse(),
            self.do_request('1.0', 'antcloud.acm.serviceaccount.oneparty.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_serviceaccount_oneparty_ex_async(
        self,
        request: acm_models.CreateServiceaccountOnepartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.CreateServiceaccountOnepartyResponse:
        """
        Description: 提供给一方化平台代客创建服务账号（ak sk）
        Summary: 一方化会员服务账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.CreateServiceaccountOnepartyResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.serviceaccount.oneparty.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_serviceaccount_oneparty(
        self,
        request: acm_models.GetServiceaccountOnepartyRequest,
    ) -> acm_models.GetServiceaccountOnepartyResponse:
        """
        Description: 一方化会员服务账号查询（ak sk）
        Summary: 一方化会员服务账号查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_serviceaccount_oneparty_ex(request, headers, runtime)

    async def get_serviceaccount_oneparty_async(
        self,
        request: acm_models.GetServiceaccountOnepartyRequest,
    ) -> acm_models.GetServiceaccountOnepartyResponse:
        """
        Description: 一方化会员服务账号查询（ak sk）
        Summary: 一方化会员服务账号查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_serviceaccount_oneparty_ex_async(request, headers, runtime)

    def get_serviceaccount_oneparty_ex(
        self,
        request: acm_models.GetServiceaccountOnepartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetServiceaccountOnepartyResponse:
        """
        Description: 一方化会员服务账号查询（ak sk）
        Summary: 一方化会员服务账号查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetServiceaccountOnepartyResponse(),
            self.do_request('1.0', 'antcloud.acm.serviceaccount.oneparty.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_serviceaccount_oneparty_ex_async(
        self,
        request: acm_models.GetServiceaccountOnepartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.GetServiceaccountOnepartyResponse:
        """
        Description: 一方化会员服务账号查询（ak sk）
        Summary: 一方化会员服务账号查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.GetServiceaccountOnepartyResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.serviceaccount.oneparty.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_trustlogin_token(
        self,
        request: acm_models.ApplyTrustloginTokenRequest,
    ) -> acm_models.ApplyTrustloginTokenResponse:
        """
        Description: token用于三方会员免密登录，与数科官网token不通用
        Summary: 三方会员免密登录token申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_trustlogin_token_ex(request, headers, runtime)

    async def apply_trustlogin_token_async(
        self,
        request: acm_models.ApplyTrustloginTokenRequest,
    ) -> acm_models.ApplyTrustloginTokenResponse:
        """
        Description: token用于三方会员免密登录，与数科官网token不通用
        Summary: 三方会员免密登录token申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_trustlogin_token_ex_async(request, headers, runtime)

    def apply_trustlogin_token_ex(
        self,
        request: acm_models.ApplyTrustloginTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.ApplyTrustloginTokenResponse:
        """
        Description: token用于三方会员免密登录，与数科官网token不通用
        Summary: 三方会员免密登录token申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.ApplyTrustloginTokenResponse(),
            self.do_request('1.0', 'antcloud.acm.trustlogin.token.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_trustlogin_token_ex_async(
        self,
        request: acm_models.ApplyTrustloginTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.ApplyTrustloginTokenResponse:
        """
        Description: token用于三方会员免密登录，与数科官网token不通用
        Summary: 三方会员免密登录token申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.ApplyTrustloginTokenResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.trustlogin.token.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_trustlogin_token(
        self,
        request: acm_models.VerifyTrustloginTokenRequest,
    ) -> acm_models.VerifyTrustloginTokenResponse:
        """
        Description: 三方会员免密登录token校验，与数科官网token不通用
        Summary: 三方会员免密登录token校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_trustlogin_token_ex(request, headers, runtime)

    async def verify_trustlogin_token_async(
        self,
        request: acm_models.VerifyTrustloginTokenRequest,
    ) -> acm_models.VerifyTrustloginTokenResponse:
        """
        Description: 三方会员免密登录token校验，与数科官网token不通用
        Summary: 三方会员免密登录token校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_trustlogin_token_ex_async(request, headers, runtime)

    def verify_trustlogin_token_ex(
        self,
        request: acm_models.VerifyTrustloginTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.VerifyTrustloginTokenResponse:
        """
        Description: 三方会员免密登录token校验，与数科官网token不通用
        Summary: 三方会员免密登录token校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.VerifyTrustloginTokenResponse(),
            self.do_request('1.0', 'antcloud.acm.trustlogin.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_trustlogin_token_ex_async(
        self,
        request: acm_models.VerifyTrustloginTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acm_models.VerifyTrustloginTokenResponse:
        """
        Description: 三方会员免密登录token校验，与数科官网token不通用
        Summary: 三方会员免密登录token校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acm_models.VerifyTrustloginTokenResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.trustlogin.token.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
