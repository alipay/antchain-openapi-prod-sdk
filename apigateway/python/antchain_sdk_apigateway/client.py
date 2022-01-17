# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_apigateway import models as apigateway_models
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
        config: apigateway_models.Config,
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
            # 注册中心详情
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
                    'sdk_version': '1.1.309'
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
            # 注册中心详情
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
                    'sdk_version': '1.1.309'
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

    def create_apigroup(
        self,
        request: apigateway_models.CreateApigroupRequest,
    ) -> apigateway_models.CreateApigroupResponse:
        """
        Description: 创建API分组
        Summary: 创建API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apigroup_ex(request, headers, runtime)

    async def create_apigroup_async(
        self,
        request: apigateway_models.CreateApigroupRequest,
    ) -> apigateway_models.CreateApigroupResponse:
        """
        Description: 创建API分组
        Summary: 创建API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apigroup_ex_async(request, headers, runtime)

    def create_apigroup_ex(
        self,
        request: apigateway_models.CreateApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApigroupResponse:
        """
        Description: 创建API分组
        Summary: 创建API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apigroup_ex_async(
        self,
        request: apigateway_models.CreateApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApigroupResponse:
        """
        Description: 创建API分组
        Summary: 创建API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_apigroup(
        self,
        request: apigateway_models.AllApigroupRequest,
    ) -> apigateway_models.AllApigroupResponse:
        """
        Description: 查询API分组列表
        Summary: 查询API分组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_apigroup_ex(request, headers, runtime)

    async def all_apigroup_async(
        self,
        request: apigateway_models.AllApigroupRequest,
    ) -> apigateway_models.AllApigroupResponse:
        """
        Description: 查询API分组列表
        Summary: 查询API分组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_apigroup_ex_async(request, headers, runtime)

    def all_apigroup_ex(
        self,
        request: apigateway_models.AllApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApigroupResponse:
        """
        Description: 查询API分组列表
        Summary: 查询API分组列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_apigroup_ex_async(
        self,
        request: apigateway_models.AllApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApigroupResponse:
        """
        Description: 查询API分组列表
        Summary: 查询API分组列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apigroup(
        self,
        request: apigateway_models.ListApigroupRequest,
    ) -> apigateway_models.ListApigroupResponse:
        """
        Description: 查询API分组分页列表
        Summary: 查询API分组分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apigroup_ex(request, headers, runtime)

    async def list_apigroup_async(
        self,
        request: apigateway_models.ListApigroupRequest,
    ) -> apigateway_models.ListApigroupResponse:
        """
        Description: 查询API分组分页列表
        Summary: 查询API分组分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apigroup_ex_async(request, headers, runtime)

    def list_apigroup_ex(
        self,
        request: apigateway_models.ListApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApigroupResponse:
        """
        Description: 查询API分组分页列表
        Summary: 查询API分组分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apigroup_ex_async(
        self,
        request: apigateway_models.ListApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApigroupResponse:
        """
        Description: 查询API分组分页列表
        Summary: 查询API分组分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sys(
        self,
        request: apigateway_models.CreateSysRequest,
    ) -> apigateway_models.CreateSysResponse:
        """
        Description: 创建后端集群
        Summary: 创建后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sys_ex(request, headers, runtime)

    async def create_sys_async(
        self,
        request: apigateway_models.CreateSysRequest,
    ) -> apigateway_models.CreateSysResponse:
        """
        Description: 创建后端集群
        Summary: 创建后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sys_ex_async(request, headers, runtime)

    def create_sys_ex(
        self,
        request: apigateway_models.CreateSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateSysResponse:
        """
        Description: 创建后端集群
        Summary: 创建后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateSysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sys_ex_async(
        self,
        request: apigateway_models.CreateSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateSysResponse:
        """
        Description: 创建后端集群
        Summary: 创建后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateSysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_sys(
        self,
        request: apigateway_models.AllSysRequest,
    ) -> apigateway_models.AllSysResponse:
        """
        Description: 查询后端集群列表
        Summary: 查询后端集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_sys_ex(request, headers, runtime)

    async def all_sys_async(
        self,
        request: apigateway_models.AllSysRequest,
    ) -> apigateway_models.AllSysResponse:
        """
        Description: 查询后端集群列表
        Summary: 查询后端集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_sys_ex_async(request, headers, runtime)

    def all_sys_ex(
        self,
        request: apigateway_models.AllSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllSysResponse:
        """
        Description: 查询后端集群列表
        Summary: 查询后端集群列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllSysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_sys_ex_async(
        self,
        request: apigateway_models.AllSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllSysResponse:
        """
        Description: 查询后端集群列表
        Summary: 查询后端集群列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllSysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sys(
        self,
        request: apigateway_models.ListSysRequest,
    ) -> apigateway_models.ListSysResponse:
        """
        Description: 查询后端集群分页列表
        Summary: 查询后端集群分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sys_ex(request, headers, runtime)

    async def list_sys_async(
        self,
        request: apigateway_models.ListSysRequest,
    ) -> apigateway_models.ListSysResponse:
        """
        Description: 查询后端集群分页列表
        Summary: 查询后端集群分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sys_ex_async(request, headers, runtime)

    def list_sys_ex(
        self,
        request: apigateway_models.ListSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListSysResponse:
        """
        Description: 查询后端集群分页列表
        Summary: 查询后端集群分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListSysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sys_ex_async(
        self,
        request: apigateway_models.ListSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListSysResponse:
        """
        Description: 查询后端集群分页列表
        Summary: 查询后端集群分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListSysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apigroup(
        self,
        request: apigateway_models.GetApigroupRequest,
    ) -> apigateway_models.GetApigroupResponse:
        """
        Description: 通过ID查询API分组
        Summary: 通过ID查询API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apigroup_ex(request, headers, runtime)

    async def get_apigroup_async(
        self,
        request: apigateway_models.GetApigroupRequest,
    ) -> apigateway_models.GetApigroupResponse:
        """
        Description: 通过ID查询API分组
        Summary: 通过ID查询API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apigroup_ex_async(request, headers, runtime)

    def get_apigroup_ex(
        self,
        request: apigateway_models.GetApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApigroupResponse:
        """
        Description: 通过ID查询API分组
        Summary: 通过ID查询API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apigroup_ex_async(
        self,
        request: apigateway_models.GetApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApigroupResponse:
        """
        Description: 通过ID查询API分组
        Summary: 通过ID查询API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apigroup(
        self,
        request: apigateway_models.UpdateApigroupRequest,
    ) -> apigateway_models.UpdateApigroupResponse:
        """
        Description: 更新API分组
        Summary: 更新API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apigroup_ex(request, headers, runtime)

    async def update_apigroup_async(
        self,
        request: apigateway_models.UpdateApigroupRequest,
    ) -> apigateway_models.UpdateApigroupResponse:
        """
        Description: 更新API分组
        Summary: 更新API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apigroup_ex_async(request, headers, runtime)

    def update_apigroup_ex(
        self,
        request: apigateway_models.UpdateApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApigroupResponse:
        """
        Description: 更新API分组
        Summary: 更新API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apigroup_ex_async(
        self,
        request: apigateway_models.UpdateApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApigroupResponse:
        """
        Description: 更新API分组
        Summary: 更新API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apigroup(
        self,
        request: apigateway_models.DeleteApigroupRequest,
    ) -> apigateway_models.DeleteApigroupResponse:
        """
        Description: 删除API分组
        Summary: 删除API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apigroup_ex(request, headers, runtime)

    async def delete_apigroup_async(
        self,
        request: apigateway_models.DeleteApigroupRequest,
    ) -> apigateway_models.DeleteApigroupResponse:
        """
        Description: 删除API分组
        Summary: 删除API分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apigroup_ex_async(request, headers, runtime)

    def delete_apigroup_ex(
        self,
        request: apigateway_models.DeleteApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApigroupResponse:
        """
        Description: 删除API分组
        Summary: 删除API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apigroup_ex_async(
        self,
        request: apigateway_models.DeleteApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApigroupResponse:
        """
        Description: 删除API分组
        Summary: 删除API分组
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_api(
        self,
        request: apigateway_models.CreateApiRequest,
    ) -> apigateway_models.CreateApiResponse:
        """
        Description: 创建API信息
        Summary: 创建API信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_api_ex(request, headers, runtime)

    async def create_api_async(
        self,
        request: apigateway_models.CreateApiRequest,
    ) -> apigateway_models.CreateApiResponse:
        """
        Description: 创建API信息
        Summary: 创建API信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_api_ex_async(request, headers, runtime)

    def create_api_ex(
        self,
        request: apigateway_models.CreateApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApiResponse:
        """
        Description: 创建API信息
        Summary: 创建API信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_api_ex_async(
        self,
        request: apigateway_models.CreateApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApiResponse:
        """
        Description: 创建API信息
        Summary: 创建API信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api(
        self,
        request: apigateway_models.UpdateApiRequest,
    ) -> apigateway_models.UpdateApiResponse:
        """
        Description: 更新API信息
        Summary: 更新API信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_ex(request, headers, runtime)

    async def update_api_async(
        self,
        request: apigateway_models.UpdateApiRequest,
    ) -> apigateway_models.UpdateApiResponse:
        """
        Description: 更新API信息
        Summary: 更新API信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_ex_async(request, headers, runtime)

    def update_api_ex(
        self,
        request: apigateway_models.UpdateApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiResponse:
        """
        Description: 更新API信息
        Summary: 更新API信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_ex_async(
        self,
        request: apigateway_models.UpdateApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiResponse:
        """
        Description: 更新API信息
        Summary: 更新API信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_api(
        self,
        request: apigateway_models.AllApiRequest,
    ) -> apigateway_models.AllApiResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_api_ex(request, headers, runtime)

    async def all_api_async(
        self,
        request: apigateway_models.AllApiRequest,
    ) -> apigateway_models.AllApiResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_api_ex_async(request, headers, runtime)

    def all_api_ex(
        self,
        request: apigateway_models.AllApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApiResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_api_ex_async(
        self,
        request: apigateway_models.AllApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApiResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_api(
        self,
        request: apigateway_models.ListApiRequest,
    ) -> apigateway_models.ListApiResponse:
        """
        Description: 查询API分页列表
        Summary: 查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_api_ex(request, headers, runtime)

    async def list_api_async(
        self,
        request: apigateway_models.ListApiRequest,
    ) -> apigateway_models.ListApiResponse:
        """
        Description: 查询API分页列表
        Summary: 查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_api_ex_async(request, headers, runtime)

    def list_api_ex(
        self,
        request: apigateway_models.ListApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApiResponse:
        """
        Description: 查询API分页列表
        Summary: 查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_api_ex_async(
        self,
        request: apigateway_models.ListApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApiResponse:
        """
        Description: 查询API分页列表
        Summary: 查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_api(
        self,
        request: apigateway_models.GetApiRequest,
    ) -> apigateway_models.GetApiResponse:
        """
        Description: 通过ID查询API
        Summary: 通过ID查询API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_api_ex(request, headers, runtime)

    async def get_api_async(
        self,
        request: apigateway_models.GetApiRequest,
    ) -> apigateway_models.GetApiResponse:
        """
        Description: 通过ID查询API
        Summary: 通过ID查询API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_api_ex_async(request, headers, runtime)

    def get_api_ex(
        self,
        request: apigateway_models.GetApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiResponse:
        """
        Description: 通过ID查询API
        Summary: 通过ID查询API
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_api_ex_async(
        self,
        request: apigateway_models.GetApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiResponse:
        """
        Description: 通过ID查询API
        Summary: 通过ID查询API
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_app(
        self,
        request: apigateway_models.CreateAppRequest,
    ) -> apigateway_models.CreateAppResponse:
        """
        Description: 创建App
        Summary: 创建App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_app_ex(request, headers, runtime)

    async def create_app_async(
        self,
        request: apigateway_models.CreateAppRequest,
    ) -> apigateway_models.CreateAppResponse:
        """
        Description: 创建App
        Summary: 创建App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_app_ex_async(request, headers, runtime)

    def create_app_ex(
        self,
        request: apigateway_models.CreateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateAppResponse:
        """
        Description: 创建App
        Summary: 创建App
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateAppResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_app_ex_async(
        self,
        request: apigateway_models.CreateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateAppResponse:
        """
        Description: 创建App
        Summary: 创建App
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateAppResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_app(
        self,
        request: apigateway_models.UpdateAppRequest,
    ) -> apigateway_models.UpdateAppResponse:
        """
        Description: 更新App信息
        Summary: 更新App信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_app_ex(request, headers, runtime)

    async def update_app_async(
        self,
        request: apigateway_models.UpdateAppRequest,
    ) -> apigateway_models.UpdateAppResponse:
        """
        Description: 更新App信息
        Summary: 更新App信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_app_ex_async(request, headers, runtime)

    def update_app_ex(
        self,
        request: apigateway_models.UpdateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateAppResponse:
        """
        Description: 更新App信息
        Summary: 更新App信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateAppResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_app_ex_async(
        self,
        request: apigateway_models.UpdateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateAppResponse:
        """
        Description: 更新App信息
        Summary: 更新App信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateAppResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_app(
        self,
        request: apigateway_models.AllAppRequest,
    ) -> apigateway_models.AllAppResponse:
        """
        Description: 查询App列表
        Summary: 查询App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_app_ex(request, headers, runtime)

    async def all_app_async(
        self,
        request: apigateway_models.AllAppRequest,
    ) -> apigateway_models.AllAppResponse:
        """
        Description: 查询App列表
        Summary: 查询App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_app_ex_async(request, headers, runtime)

    def all_app_ex(
        self,
        request: apigateway_models.AllAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAppResponse:
        """
        Description: 查询App列表
        Summary: 查询App列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAppResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_app_ex_async(
        self,
        request: apigateway_models.AllAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAppResponse:
        """
        Description: 查询App列表
        Summary: 查询App列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAppResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_app(
        self,
        request: apigateway_models.ListAppRequest,
    ) -> apigateway_models.ListAppResponse:
        """
        Description: 查询App分页列表
        Summary: 查询App分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_app_ex(request, headers, runtime)

    async def list_app_async(
        self,
        request: apigateway_models.ListAppRequest,
    ) -> apigateway_models.ListAppResponse:
        """
        Description: 查询App分页列表
        Summary: 查询App分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_app_ex_async(request, headers, runtime)

    def list_app_ex(
        self,
        request: apigateway_models.ListAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAppResponse:
        """
        Description: 查询App分页列表
        Summary: 查询App分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAppResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_app_ex_async(
        self,
        request: apigateway_models.ListAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAppResponse:
        """
        Description: 查询App分页列表
        Summary: 查询App分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAppResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_app(
        self,
        request: apigateway_models.GetAppRequest,
    ) -> apigateway_models.GetAppResponse:
        """
        Description: 通过ID查询App
        Summary: 通过ID查询App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_app_ex(request, headers, runtime)

    async def get_app_async(
        self,
        request: apigateway_models.GetAppRequest,
    ) -> apigateway_models.GetAppResponse:
        """
        Description: 通过ID查询App
        Summary: 通过ID查询App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_app_ex_async(request, headers, runtime)

    def get_app_ex(
        self,
        request: apigateway_models.GetAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetAppResponse:
        """
        Description: 通过ID查询App
        Summary: 通过ID查询App
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetAppResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_app_ex_async(
        self,
        request: apigateway_models.GetAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetAppResponse:
        """
        Description: 通过ID查询App
        Summary: 通过ID查询App
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetAppResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_authapp(
        self,
        request: apigateway_models.CreateAuthappRequest,
    ) -> apigateway_models.CreateAuthappResponse:
        """
        Description: 创建授权App
        Summary: 创建授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_authapp_ex(request, headers, runtime)

    async def create_authapp_async(
        self,
        request: apigateway_models.CreateAuthappRequest,
    ) -> apigateway_models.CreateAuthappResponse:
        """
        Description: 创建授权App
        Summary: 创建授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_authapp_ex_async(request, headers, runtime)

    def create_authapp_ex(
        self,
        request: apigateway_models.CreateAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateAuthappResponse:
        """
        Description: 创建授权App
        Summary: 创建授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_authapp_ex_async(
        self,
        request: apigateway_models.CreateAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateAuthappResponse:
        """
        Description: 创建授权App
        Summary: 创建授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_authapp(
        self,
        request: apigateway_models.UpdateAuthappRequest,
    ) -> apigateway_models.UpdateAuthappResponse:
        """
        Description: 更新授权App
        Summary: 更新授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_authapp_ex(request, headers, runtime)

    async def update_authapp_async(
        self,
        request: apigateway_models.UpdateAuthappRequest,
    ) -> apigateway_models.UpdateAuthappResponse:
        """
        Description: 更新授权App
        Summary: 更新授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_authapp_ex_async(request, headers, runtime)

    def update_authapp_ex(
        self,
        request: apigateway_models.UpdateAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateAuthappResponse:
        """
        Description: 更新授权App
        Summary: 更新授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_authapp_ex_async(
        self,
        request: apigateway_models.UpdateAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateAuthappResponse:
        """
        Description: 更新授权App
        Summary: 更新授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_authapp(
        self,
        request: apigateway_models.DeleteAuthappRequest,
    ) -> apigateway_models.DeleteAuthappResponse:
        """
        Description: 删除授权App
        Summary: 删除授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_authapp_ex(request, headers, runtime)

    async def delete_authapp_async(
        self,
        request: apigateway_models.DeleteAuthappRequest,
    ) -> apigateway_models.DeleteAuthappResponse:
        """
        Description: 删除授权App
        Summary: 删除授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_authapp_ex_async(request, headers, runtime)

    def delete_authapp_ex(
        self,
        request: apigateway_models.DeleteAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteAuthappResponse:
        """
        Description: 删除授权App
        Summary: 删除授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_authapp_ex_async(
        self,
        request: apigateway_models.DeleteAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteAuthappResponse:
        """
        Description: 删除授权App
        Summary: 删除授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_authapp(
        self,
        request: apigateway_models.AllAuthappRequest,
    ) -> apigateway_models.AllAuthappResponse:
        """
        Description: 查询授权App列表
        Summary: 查询授权App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_authapp_ex(request, headers, runtime)

    async def all_authapp_async(
        self,
        request: apigateway_models.AllAuthappRequest,
    ) -> apigateway_models.AllAuthappResponse:
        """
        Description: 查询授权App列表
        Summary: 查询授权App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_authapp_ex_async(request, headers, runtime)

    def all_authapp_ex(
        self,
        request: apigateway_models.AllAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAuthappResponse:
        """
        Description: 查询授权App列表
        Summary: 查询授权App列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_authapp_ex_async(
        self,
        request: apigateway_models.AllAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAuthappResponse:
        """
        Description: 查询授权App列表
        Summary: 查询授权App列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_authapp(
        self,
        request: apigateway_models.ListAuthappRequest,
    ) -> apigateway_models.ListAuthappResponse:
        """
        Description: 查询获取授权App分页列表
        Summary: 查询授权App分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_authapp_ex(request, headers, runtime)

    async def list_authapp_async(
        self,
        request: apigateway_models.ListAuthappRequest,
    ) -> apigateway_models.ListAuthappResponse:
        """
        Description: 查询获取授权App分页列表
        Summary: 查询授权App分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_authapp_ex_async(request, headers, runtime)

    def list_authapp_ex(
        self,
        request: apigateway_models.ListAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAuthappResponse:
        """
        Description: 查询获取授权App分页列表
        Summary: 查询授权App分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_authapp_ex_async(
        self,
        request: apigateway_models.ListAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAuthappResponse:
        """
        Description: 查询获取授权App分页列表
        Summary: 查询授权App分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_authapp(
        self,
        request: apigateway_models.GetAuthappRequest,
    ) -> apigateway_models.GetAuthappResponse:
        """
        Description: 通过ID查询授权App
        Summary: 通过ID查询授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_authapp_ex(request, headers, runtime)

    async def get_authapp_async(
        self,
        request: apigateway_models.GetAuthappRequest,
    ) -> apigateway_models.GetAuthappResponse:
        """
        Description: 通过ID查询授权App
        Summary: 通过ID查询授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_authapp_ex_async(request, headers, runtime)

    def get_authapp_ex(
        self,
        request: apigateway_models.GetAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetAuthappResponse:
        """
        Description: 通过ID查询授权App
        Summary: 通过ID查询授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_authapp_ex_async(
        self,
        request: apigateway_models.GetAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetAuthappResponse:
        """
        Description: 通过ID查询授权App
        Summary: 通过ID查询授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_router(
        self,
        request: apigateway_models.CreateRouterRequest,
    ) -> apigateway_models.CreateRouterResponse:
        """
        Description: 创建路由规则
        Summary: 创建路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_router_ex(request, headers, runtime)

    async def create_router_async(
        self,
        request: apigateway_models.CreateRouterRequest,
    ) -> apigateway_models.CreateRouterResponse:
        """
        Description: 创建路由规则
        Summary: 创建路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_router_ex_async(request, headers, runtime)

    def create_router_ex(
        self,
        request: apigateway_models.CreateRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateRouterResponse:
        """
        Description: 创建路由规则
        Summary: 创建路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateRouterResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_router_ex_async(
        self,
        request: apigateway_models.CreateRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateRouterResponse:
        """
        Description: 创建路由规则
        Summary: 创建路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateRouterResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_router(
        self,
        request: apigateway_models.UpdateRouterRequest,
    ) -> apigateway_models.UpdateRouterResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_router_ex(request, headers, runtime)

    async def update_router_async(
        self,
        request: apigateway_models.UpdateRouterRequest,
    ) -> apigateway_models.UpdateRouterResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_router_ex_async(request, headers, runtime)

    def update_router_ex(
        self,
        request: apigateway_models.UpdateRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateRouterResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateRouterResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_router_ex_async(
        self,
        request: apigateway_models.UpdateRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateRouterResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateRouterResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_router(
        self,
        request: apigateway_models.DeleteRouterRequest,
    ) -> apigateway_models.DeleteRouterResponse:
        """
        Description: 通过ID删除路由规则
        Summary: 通过ID删除路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_router_ex(request, headers, runtime)

    async def delete_router_async(
        self,
        request: apigateway_models.DeleteRouterRequest,
    ) -> apigateway_models.DeleteRouterResponse:
        """
        Description: 通过ID删除路由规则
        Summary: 通过ID删除路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_router_ex_async(request, headers, runtime)

    def delete_router_ex(
        self,
        request: apigateway_models.DeleteRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteRouterResponse:
        """
        Description: 通过ID删除路由规则
        Summary: 通过ID删除路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteRouterResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_router_ex_async(
        self,
        request: apigateway_models.DeleteRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteRouterResponse:
        """
        Description: 通过ID删除路由规则
        Summary: 通过ID删除路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteRouterResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_router(
        self,
        request: apigateway_models.AllRouterRequest,
    ) -> apigateway_models.AllRouterResponse:
        """
        Description: 查询路由信息列表
        Summary: 查询路由信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_router_ex(request, headers, runtime)

    async def all_router_async(
        self,
        request: apigateway_models.AllRouterRequest,
    ) -> apigateway_models.AllRouterResponse:
        """
        Description: 查询路由信息列表
        Summary: 查询路由信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_router_ex_async(request, headers, runtime)

    def all_router_ex(
        self,
        request: apigateway_models.AllRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRouterResponse:
        """
        Description: 查询路由信息列表
        Summary: 查询路由信息列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRouterResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_router_ex_async(
        self,
        request: apigateway_models.AllRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRouterResponse:
        """
        Description: 查询路由信息列表
        Summary: 查询路由信息列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRouterResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_router(
        self,
        request: apigateway_models.ListRouterRequest,
    ) -> apigateway_models.ListRouterResponse:
        """
        Description: 查询路由规则分页列表
        Summary: 查询路由规则分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_router_ex(request, headers, runtime)

    async def list_router_async(
        self,
        request: apigateway_models.ListRouterRequest,
    ) -> apigateway_models.ListRouterResponse:
        """
        Description: 查询路由规则分页列表
        Summary: 查询路由规则分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_router_ex_async(request, headers, runtime)

    def list_router_ex(
        self,
        request: apigateway_models.ListRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRouterResponse:
        """
        Description: 查询路由规则分页列表
        Summary: 查询路由规则分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRouterResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_router_ex_async(
        self,
        request: apigateway_models.ListRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRouterResponse:
        """
        Description: 查询路由规则分页列表
        Summary: 查询路由规则分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRouterResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_router(
        self,
        request: apigateway_models.GetRouterRequest,
    ) -> apigateway_models.GetRouterResponse:
        """
        Description: 通过ID查询路由规则
        Summary: 通过ID查询路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_router_ex(request, headers, runtime)

    async def get_router_async(
        self,
        request: apigateway_models.GetRouterRequest,
    ) -> apigateway_models.GetRouterResponse:
        """
        Description: 通过ID查询路由规则
        Summary: 通过ID查询路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_router_ex_async(request, headers, runtime)

    def get_router_ex(
        self,
        request: apigateway_models.GetRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetRouterResponse:
        """
        Description: 通过ID查询路由规则
        Summary: 通过ID查询路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetRouterResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_router_ex_async(
        self,
        request: apigateway_models.GetRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetRouterResponse:
        """
        Description: 通过ID查询路由规则
        Summary: 通过ID查询路由规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetRouterResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sys(
        self,
        request: apigateway_models.UpdateSysRequest,
    ) -> apigateway_models.UpdateSysResponse:
        """
        Description: 更新后端集群
        Summary: 更新后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sys_ex(request, headers, runtime)

    async def update_sys_async(
        self,
        request: apigateway_models.UpdateSysRequest,
    ) -> apigateway_models.UpdateSysResponse:
        """
        Description: 更新后端集群
        Summary: 更新后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sys_ex_async(request, headers, runtime)

    def update_sys_ex(
        self,
        request: apigateway_models.UpdateSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateSysResponse:
        """
        Description: 更新后端集群
        Summary: 更新后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateSysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sys_ex_async(
        self,
        request: apigateway_models.UpdateSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateSysResponse:
        """
        Description: 更新后端集群
        Summary: 更新后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateSysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sys(
        self,
        request: apigateway_models.DeleteSysRequest,
    ) -> apigateway_models.DeleteSysResponse:
        """
        Description: 通过ID删除后端集群
        Summary: 通过ID删除后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sys_ex(request, headers, runtime)

    async def delete_sys_async(
        self,
        request: apigateway_models.DeleteSysRequest,
    ) -> apigateway_models.DeleteSysResponse:
        """
        Description: 通过ID删除后端集群
        Summary: 通过ID删除后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sys_ex_async(request, headers, runtime)

    def delete_sys_ex(
        self,
        request: apigateway_models.DeleteSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteSysResponse:
        """
        Description: 通过ID删除后端集群
        Summary: 通过ID删除后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteSysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sys_ex_async(
        self,
        request: apigateway_models.DeleteSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteSysResponse:
        """
        Description: 通过ID删除后端集群
        Summary: 通过ID删除后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteSysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sys(
        self,
        request: apigateway_models.GetSysRequest,
    ) -> apigateway_models.GetSysResponse:
        """
        Description: 通过ID查询后端集群
        Summary: 通过ID查询后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sys_ex(request, headers, runtime)

    async def get_sys_async(
        self,
        request: apigateway_models.GetSysRequest,
    ) -> apigateway_models.GetSysResponse:
        """
        Description: 通过ID查询后端集群
        Summary: 通过ID查询后端集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sys_ex_async(request, headers, runtime)

    def get_sys_ex(
        self,
        request: apigateway_models.GetSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetSysResponse:
        """
        Description: 通过ID查询后端集群
        Summary: 通过ID查询后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetSysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sys_ex_async(
        self,
        request: apigateway_models.GetSysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetSysResponse:
        """
        Description: 通过ID查询后端集群
        Summary: 通过ID查询后端集群
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetSysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_apigroup_api(
        self,
        request: apigateway_models.AllApigroupApiRequest,
    ) -> apigateway_models.AllApigroupApiResponse:
        """
        Description: 通过API分组ID查询API列表
        Summary: 通过API分组ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_apigroup_api_ex(request, headers, runtime)

    async def all_apigroup_api_async(
        self,
        request: apigateway_models.AllApigroupApiRequest,
    ) -> apigateway_models.AllApigroupApiResponse:
        """
        Description: 通过API分组ID查询API列表
        Summary: 通过API分组ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_apigroup_api_ex_async(request, headers, runtime)

    def all_apigroup_api_ex(
        self,
        request: apigateway_models.AllApigroupApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApigroupApiResponse:
        """
        Description: 通过API分组ID查询API列表
        Summary: 通过API分组ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApigroupApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_apigroup_api_ex_async(
        self,
        request: apigateway_models.AllApigroupApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApigroupApiResponse:
        """
        Description: 通过API分组ID查询API列表
        Summary: 通过API分组ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApigroupApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_app(
        self,
        request: apigateway_models.DeleteAppRequest,
    ) -> apigateway_models.DeleteAppResponse:
        """
        Description: 通过ID删除App
        Summary: 通过ID删除App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_app_ex(request, headers, runtime)

    async def delete_app_async(
        self,
        request: apigateway_models.DeleteAppRequest,
    ) -> apigateway_models.DeleteAppResponse:
        """
        Description: 通过ID删除App
        Summary: 通过ID删除App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_app_ex_async(request, headers, runtime)

    def delete_app_ex(
        self,
        request: apigateway_models.DeleteAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteAppResponse:
        """
        Description: 通过ID删除App
        Summary: 通过ID删除App
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteAppResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_app_ex_async(
        self,
        request: apigateway_models.DeleteAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteAppResponse:
        """
        Description: 通过ID删除App
        Summary: 通过ID删除App
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteAppResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_api(
        self,
        request: apigateway_models.DeleteApiRequest,
    ) -> apigateway_models.DeleteApiResponse:
        """
        Description: 通过ID删除API
        Summary: 通过ID删除API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_api_ex(request, headers, runtime)

    async def delete_api_async(
        self,
        request: apigateway_models.DeleteApiRequest,
    ) -> apigateway_models.DeleteApiResponse:
        """
        Description: 通过ID删除API
        Summary: 通过ID删除API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_api_ex_async(request, headers, runtime)

    def delete_api_ex(
        self,
        request: apigateway_models.DeleteApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApiResponse:
        """
        Description: 通过ID删除API
        Summary: 通过ID删除API
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_api_ex_async(
        self,
        request: apigateway_models.DeleteApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApiResponse:
        """
        Description: 通过ID删除API
        Summary: 通过ID删除API
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apigroup_api(
        self,
        request: apigateway_models.ListApigroupApiRequest,
    ) -> apigateway_models.ListApigroupApiResponse:
        """
        Description: 通过API分组ID查询API分页列表
        Summary: 通过API分组ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apigroup_api_ex(request, headers, runtime)

    async def list_apigroup_api_async(
        self,
        request: apigateway_models.ListApigroupApiRequest,
    ) -> apigateway_models.ListApigroupApiResponse:
        """
        Description: 通过API分组ID查询API分页列表
        Summary: 通过API分组ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apigroup_api_ex_async(request, headers, runtime)

    def list_apigroup_api_ex(
        self,
        request: apigateway_models.ListApigroupApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApigroupApiResponse:
        """
        Description: 通过API分组ID查询API分页列表
        Summary: 通过API分组ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApigroupApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apigroup_api_ex_async(
        self,
        request: apigateway_models.ListApigroupApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApigroupApiResponse:
        """
        Description: 通过API分组ID查询API分页列表
        Summary: 通过API分组ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApigroupApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_authapp_api(
        self,
        request: apigateway_models.ListAuthappApiRequest,
    ) -> apigateway_models.ListAuthappApiResponse:
        """
        Description: 通过授权App ID查询API分页列表
        Summary: 通过授权App ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_authapp_api_ex(request, headers, runtime)

    async def list_authapp_api_async(
        self,
        request: apigateway_models.ListAuthappApiRequest,
    ) -> apigateway_models.ListAuthappApiResponse:
        """
        Description: 通过授权App ID查询API分页列表
        Summary: 通过授权App ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_authapp_api_ex_async(request, headers, runtime)

    def list_authapp_api_ex(
        self,
        request: apigateway_models.ListAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAuthappApiResponse:
        """
        Description: 通过授权App ID查询API分页列表
        Summary: 通过授权App ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAuthappApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_authapp_api_ex_async(
        self,
        request: apigateway_models.ListAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAuthappApiResponse:
        """
        Description: 通过授权App ID查询API分页列表
        Summary: 通过授权App ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAuthappApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_sys_api(
        self,
        request: apigateway_models.AllSysApiRequest,
    ) -> apigateway_models.AllSysApiResponse:
        """
        Description: 通过后端集群ID查询API列表
        Summary: 通过后端集群ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_sys_api_ex(request, headers, runtime)

    async def all_sys_api_async(
        self,
        request: apigateway_models.AllSysApiRequest,
    ) -> apigateway_models.AllSysApiResponse:
        """
        Description: 通过后端集群ID查询API列表
        Summary: 通过后端集群ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_sys_api_ex_async(request, headers, runtime)

    def all_sys_api_ex(
        self,
        request: apigateway_models.AllSysApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllSysApiResponse:
        """
        Description: 通过后端集群ID查询API列表
        Summary: 通过后端集群ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllSysApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_sys_api_ex_async(
        self,
        request: apigateway_models.AllSysApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllSysApiResponse:
        """
        Description: 通过后端集群ID查询API列表
        Summary: 通过后端集群ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllSysApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sys_api(
        self,
        request: apigateway_models.ListSysApiRequest,
    ) -> apigateway_models.ListSysApiResponse:
        """
        Description: 通过后端集群ID查询API分页列表
        Summary: 通过后端集群ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sys_api_ex(request, headers, runtime)

    async def list_sys_api_async(
        self,
        request: apigateway_models.ListSysApiRequest,
    ) -> apigateway_models.ListSysApiResponse:
        """
        Description: 通过后端集群ID查询API分页列表
        Summary: 通过后端集群ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sys_api_ex_async(request, headers, runtime)

    def list_sys_api_ex(
        self,
        request: apigateway_models.ListSysApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListSysApiResponse:
        """
        Description: 通过后端集群ID查询API分页列表
        Summary: 通过后端集群ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListSysApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sys_api_ex_async(
        self,
        request: apigateway_models.ListSysApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListSysApiResponse:
        """
        Description: 通过后端集群ID查询API分页列表
        Summary: 通过后端集群ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListSysApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_router_api(
        self,
        request: apigateway_models.AllRouterApiRequest,
    ) -> apigateway_models.AllRouterApiResponse:
        """
        Description: 通过路由规则ID查询API列表
        Summary: 通过路由规则ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_router_api_ex(request, headers, runtime)

    async def all_router_api_async(
        self,
        request: apigateway_models.AllRouterApiRequest,
    ) -> apigateway_models.AllRouterApiResponse:
        """
        Description: 通过路由规则ID查询API列表
        Summary: 通过路由规则ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_router_api_ex_async(request, headers, runtime)

    def all_router_api_ex(
        self,
        request: apigateway_models.AllRouterApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRouterApiResponse:
        """
        Description: 通过路由规则ID查询API列表
        Summary: 通过路由规则ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRouterApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_router_api_ex_async(
        self,
        request: apigateway_models.AllRouterApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRouterApiResponse:
        """
        Description: 通过路由规则ID查询API列表
        Summary: 通过路由规则ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRouterApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_router_api(
        self,
        request: apigateway_models.ListRouterApiRequest,
    ) -> apigateway_models.ListRouterApiResponse:
        """
        Description: 通过路由规则ID查询API分页列表
        Summary: 通过路由规则ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_router_api_ex(request, headers, runtime)

    async def list_router_api_async(
        self,
        request: apigateway_models.ListRouterApiRequest,
    ) -> apigateway_models.ListRouterApiResponse:
        """
        Description: 通过路由规则ID查询API分页列表
        Summary: 通过路由规则ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_router_api_ex_async(request, headers, runtime)

    def list_router_api_ex(
        self,
        request: apigateway_models.ListRouterApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRouterApiResponse:
        """
        Description: 通过路由规则ID查询API分页列表
        Summary: 通过路由规则ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRouterApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.router.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_router_api_ex_async(
        self,
        request: apigateway_models.ListRouterApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRouterApiResponse:
        """
        Description: 通过路由规则ID查询API分页列表
        Summary: 通过路由规则ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRouterApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.router.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api_versionno(
        self,
        request: apigateway_models.UpdateApiVersionnoRequest,
    ) -> apigateway_models.UpdateApiVersionnoResponse:
        """
        Description: 更新API版本号
        Summary: 更新API版本号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_versionno_ex(request, headers, runtime)

    async def update_api_versionno_async(
        self,
        request: apigateway_models.UpdateApiVersionnoRequest,
    ) -> apigateway_models.UpdateApiVersionnoResponse:
        """
        Description: 更新API版本号
        Summary: 更新API版本号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_versionno_ex_async(request, headers, runtime)

    def update_api_versionno_ex(
        self,
        request: apigateway_models.UpdateApiVersionnoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiVersionnoResponse:
        """
        Description: 更新API版本号
        Summary: 更新API版本号
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiVersionnoResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.versionno.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_versionno_ex_async(
        self,
        request: apigateway_models.UpdateApiVersionnoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiVersionnoResponse:
        """
        Description: 更新API版本号
        Summary: 更新API版本号
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiVersionnoResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.versionno.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_api(
        self,
        request: apigateway_models.OfflineApiRequest,
    ) -> apigateway_models.OfflineApiResponse:
        """
        Description: 下线API
        Summary: 下线API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_api_ex(request, headers, runtime)

    async def offline_api_async(
        self,
        request: apigateway_models.OfflineApiRequest,
    ) -> apigateway_models.OfflineApiResponse:
        """
        Description: 下线API
        Summary: 下线API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_api_ex_async(request, headers, runtime)

    def offline_api_ex(
        self,
        request: apigateway_models.OfflineApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.OfflineApiResponse:
        """
        Description: 下线API
        Summary: 下线API
        """
        UtilClient.validate_model(request)
        return apigateway_models.OfflineApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_api_ex_async(
        self,
        request: apigateway_models.OfflineApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.OfflineApiResponse:
        """
        Description: 下线API
        Summary: 下线API
        """
        UtilClient.validate_model(request)
        return apigateway_models.OfflineApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_authapp_api(
        self,
        request: apigateway_models.AllAuthappApiRequest,
    ) -> apigateway_models.AllAuthappApiResponse:
        """
        Description: 通过授权App ID查询API列表
        Summary: 通过授权App ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_authapp_api_ex(request, headers, runtime)

    async def all_authapp_api_async(
        self,
        request: apigateway_models.AllAuthappApiRequest,
    ) -> apigateway_models.AllAuthappApiResponse:
        """
        Description: 通过授权App ID查询API列表
        Summary: 通过授权App ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_authapp_api_ex_async(request, headers, runtime)

    def all_authapp_api_ex(
        self,
        request: apigateway_models.AllAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAuthappApiResponse:
        """
        Description: 通过授权App ID查询API列表
        Summary: 通过授权App ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAuthappApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_authapp_api_ex_async(
        self,
        request: apigateway_models.AllAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAuthappApiResponse:
        """
        Description: 通过授权App ID查询API列表
        Summary: 通过授权App ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAuthappApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_api_authapp(
        self,
        request: apigateway_models.MountApiAuthappRequest,
    ) -> apigateway_models.MountApiAuthappResponse:
        """
        Description: api挂载授权App
        Summary: api挂载授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_api_authapp_ex(request, headers, runtime)

    async def mount_api_authapp_async(
        self,
        request: apigateway_models.MountApiAuthappRequest,
    ) -> apigateway_models.MountApiAuthappResponse:
        """
        Description: api挂载授权App
        Summary: api挂载授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_api_authapp_ex_async(request, headers, runtime)

    def mount_api_authapp_ex(
        self,
        request: apigateway_models.MountApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountApiAuthappResponse:
        """
        Description: api挂载授权App
        Summary: api挂载授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountApiAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.authapp.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_api_authapp_ex_async(
        self,
        request: apigateway_models.MountApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountApiAuthappResponse:
        """
        Description: api挂载授权App
        Summary: api挂载授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountApiAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.authapp.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_api(
        self,
        request: apigateway_models.OnlineApiRequest,
    ) -> apigateway_models.OnlineApiResponse:
        """
        Description: 上线API
        Summary: 上线API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_api_ex(request, headers, runtime)

    async def online_api_async(
        self,
        request: apigateway_models.OnlineApiRequest,
    ) -> apigateway_models.OnlineApiResponse:
        """
        Description: 上线API
        Summary: 上线API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_api_ex_async(request, headers, runtime)

    def online_api_ex(
        self,
        request: apigateway_models.OnlineApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.OnlineApiResponse:
        """
        Description: 上线API
        Summary: 上线API
        """
        UtilClient.validate_model(request)
        return apigateway_models.OnlineApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_api_ex_async(
        self,
        request: apigateway_models.OnlineApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.OnlineApiResponse:
        """
        Description: 上线API
        Summary: 上线API
        """
        UtilClient.validate_model(request)
        return apigateway_models.OnlineApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_api_authapp(
        self,
        request: apigateway_models.AllApiAuthappRequest,
    ) -> apigateway_models.AllApiAuthappResponse:
        """
        Description: 通过API ID查询授权App列表
        Summary: 通过API ID查询授权App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_api_authapp_ex(request, headers, runtime)

    async def all_api_authapp_async(
        self,
        request: apigateway_models.AllApiAuthappRequest,
    ) -> apigateway_models.AllApiAuthappResponse:
        """
        Description: 通过API ID查询授权App列表
        Summary: 通过API ID查询授权App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_api_authapp_ex_async(request, headers, runtime)

    def all_api_authapp_ex(
        self,
        request: apigateway_models.AllApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApiAuthappResponse:
        """
        Description: 通过API ID查询授权App列表
        Summary: 通过API ID查询授权App列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApiAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.authapp.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_api_authapp_ex_async(
        self,
        request: apigateway_models.AllApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApiAuthappResponse:
        """
        Description: 通过API ID查询授权App列表
        Summary: 通过API ID查询授权App列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApiAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.authapp.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_api_authapp(
        self,
        request: apigateway_models.ListApiAuthappRequest,
    ) -> apigateway_models.ListApiAuthappResponse:
        """
        Description: 通过API ID查询授权App分页列表
        Summary: 通过API ID查询授权App分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_api_authapp_ex(request, headers, runtime)

    async def list_api_authapp_async(
        self,
        request: apigateway_models.ListApiAuthappRequest,
    ) -> apigateway_models.ListApiAuthappResponse:
        """
        Description: 通过API ID查询授权App分页列表
        Summary: 通过API ID查询授权App分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_api_authapp_ex_async(request, headers, runtime)

    def list_api_authapp_ex(
        self,
        request: apigateway_models.ListApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApiAuthappResponse:
        """
        Description: 通过API ID查询授权App分页列表
        Summary: 通过API ID查询授权App分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApiAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.authapp.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_api_authapp_ex_async(
        self,
        request: apigateway_models.ListApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApiAuthappResponse:
        """
        Description: 通过API ID查询授权App分页列表
        Summary: 通过API ID查询授权App分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApiAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.authapp.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_app_api(
        self,
        request: apigateway_models.AllAppApiRequest,
    ) -> apigateway_models.AllAppApiResponse:
        """
        Description: 通过App ID查询API列表
        Summary: 通过App ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_app_api_ex(request, headers, runtime)

    async def all_app_api_async(
        self,
        request: apigateway_models.AllAppApiRequest,
    ) -> apigateway_models.AllAppApiResponse:
        """
        Description: 通过App ID查询API列表
        Summary: 通过App ID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_app_api_ex_async(request, headers, runtime)

    def all_app_api_ex(
        self,
        request: apigateway_models.AllAppApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAppApiResponse:
        """
        Description: 通过App ID查询API列表
        Summary: 通过App ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAppApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_app_api_ex_async(
        self,
        request: apigateway_models.AllAppApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllAppApiResponse:
        """
        Description: 通过App ID查询API列表
        Summary: 通过App ID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllAppApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_app_api(
        self,
        request: apigateway_models.ListAppApiRequest,
    ) -> apigateway_models.ListAppApiResponse:
        """
        Description: 通过App ID查询API分页列表
        Summary: 通过App ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_app_api_ex(request, headers, runtime)

    async def list_app_api_async(
        self,
        request: apigateway_models.ListAppApiRequest,
    ) -> apigateway_models.ListAppApiResponse:
        """
        Description: 通过App ID查询API分页列表
        Summary: 通过App ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_app_api_ex_async(request, headers, runtime)

    def list_app_api_ex(
        self,
        request: apigateway_models.ListAppApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAppApiResponse:
        """
        Description: 通过App ID查询API分页列表
        Summary: 通过App ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAppApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_app_api_ex_async(
        self,
        request: apigateway_models.ListAppApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListAppApiResponse:
        """
        Description: 通过App ID查询API分页列表
        Summary: 通过App ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListAppApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_common_randomaksk(
        self,
        request: apigateway_models.GetCommonRandomakskRequest,
    ) -> apigateway_models.GetCommonRandomakskResponse:
        """
        Description: 获取随机密钥
        Summary: 获取随机密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_common_randomaksk_ex(request, headers, runtime)

    async def get_common_randomaksk_async(
        self,
        request: apigateway_models.GetCommonRandomakskRequest,
    ) -> apigateway_models.GetCommonRandomakskResponse:
        """
        Description: 获取随机密钥
        Summary: 获取随机密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_common_randomaksk_ex_async(request, headers, runtime)

    def get_common_randomaksk_ex(
        self,
        request: apigateway_models.GetCommonRandomakskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetCommonRandomakskResponse:
        """
        Description: 获取随机密钥
        Summary: 获取随机密钥
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetCommonRandomakskResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.common.randomaksk.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_common_randomaksk_ex_async(
        self,
        request: apigateway_models.GetCommonRandomakskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetCommonRandomakskResponse:
        """
        Description: 获取随机密钥
        Summary: 获取随机密钥
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetCommonRandomakskResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.common.randomaksk.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contact(
        self,
        request: apigateway_models.CreateContactRequest,
    ) -> apigateway_models.CreateContactResponse:
        """
        Description: 创建联系方式
        Summary: 创建联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contact_ex(request, headers, runtime)

    async def create_contact_async(
        self,
        request: apigateway_models.CreateContactRequest,
    ) -> apigateway_models.CreateContactResponse:
        """
        Description: 创建联系方式
        Summary: 创建联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contact_ex_async(request, headers, runtime)

    def create_contact_ex(
        self,
        request: apigateway_models.CreateContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateContactResponse:
        """
        Description: 创建联系方式
        Summary: 创建联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateContactResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.contact.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contact_ex_async(
        self,
        request: apigateway_models.CreateContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateContactResponse:
        """
        Description: 创建联系方式
        Summary: 创建联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateContactResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.contact.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_contact(
        self,
        request: apigateway_models.UpdateContactRequest,
    ) -> apigateway_models.UpdateContactResponse:
        """
        Description: 更新联系方式
        Summary: 更新联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_contact_ex(request, headers, runtime)

    async def update_contact_async(
        self,
        request: apigateway_models.UpdateContactRequest,
    ) -> apigateway_models.UpdateContactResponse:
        """
        Description: 更新联系方式
        Summary: 更新联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_contact_ex_async(request, headers, runtime)

    def update_contact_ex(
        self,
        request: apigateway_models.UpdateContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateContactResponse:
        """
        Description: 更新联系方式
        Summary: 更新联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateContactResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.contact.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_contact_ex_async(
        self,
        request: apigateway_models.UpdateContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateContactResponse:
        """
        Description: 更新联系方式
        Summary: 更新联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateContactResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.contact.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_contact(
        self,
        request: apigateway_models.DeleteContactRequest,
    ) -> apigateway_models.DeleteContactResponse:
        """
        Description: 删除联系方式
        Summary: 删除联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_contact_ex(request, headers, runtime)

    async def delete_contact_async(
        self,
        request: apigateway_models.DeleteContactRequest,
    ) -> apigateway_models.DeleteContactResponse:
        """
        Description: 删除联系方式
        Summary: 删除联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_contact_ex_async(request, headers, runtime)

    def delete_contact_ex(
        self,
        request: apigateway_models.DeleteContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteContactResponse:
        """
        Description: 删除联系方式
        Summary: 删除联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteContactResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.contact.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_contact_ex_async(
        self,
        request: apigateway_models.DeleteContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteContactResponse:
        """
        Description: 删除联系方式
        Summary: 删除联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteContactResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.contact.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contact(
        self,
        request: apigateway_models.GetContactRequest,
    ) -> apigateway_models.GetContactResponse:
        """
        Description: 通过ID查询联系方式
        Summary: 通过ID查询联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contact_ex(request, headers, runtime)

    async def get_contact_async(
        self,
        request: apigateway_models.GetContactRequest,
    ) -> apigateway_models.GetContactResponse:
        """
        Description: 通过ID查询联系方式
        Summary: 通过ID查询联系方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contact_ex_async(request, headers, runtime)

    def get_contact_ex(
        self,
        request: apigateway_models.GetContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetContactResponse:
        """
        Description: 通过ID查询联系方式
        Summary: 通过ID查询联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetContactResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.contact.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contact_ex_async(
        self,
        request: apigateway_models.GetContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetContactResponse:
        """
        Description: 通过ID查询联系方式
        Summary: 通过ID查询联系方式
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetContactResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.contact.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_contact(
        self,
        request: apigateway_models.ListContactRequest,
    ) -> apigateway_models.ListContactResponse:
        """
        Description: 查询联系方式分页列表
        Summary: 查询联系方式分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_contact_ex(request, headers, runtime)

    async def list_contact_async(
        self,
        request: apigateway_models.ListContactRequest,
    ) -> apigateway_models.ListContactResponse:
        """
        Description: 查询联系方式分页列表
        Summary: 查询联系方式分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_contact_ex_async(request, headers, runtime)

    def list_contact_ex(
        self,
        request: apigateway_models.ListContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListContactResponse:
        """
        Description: 查询联系方式分页列表
        Summary: 查询联系方式分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListContactResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.contact.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_contact_ex_async(
        self,
        request: apigateway_models.ListContactRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListContactResponse:
        """
        Description: 查询联系方式分页列表
        Summary: 查询联系方式分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListContactResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.contact.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_contact_authapp(
        self,
        request: apigateway_models.ListContactAuthappRequest,
    ) -> apigateway_models.ListContactAuthappResponse:
        """
        Description: 通过授权App ID查询联系方式列表
        Summary: 通过授权App ID查询联系方式列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_contact_authapp_ex(request, headers, runtime)

    async def list_contact_authapp_async(
        self,
        request: apigateway_models.ListContactAuthappRequest,
    ) -> apigateway_models.ListContactAuthappResponse:
        """
        Description: 通过授权App ID查询联系方式列表
        Summary: 通过授权App ID查询联系方式列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_contact_authapp_ex_async(request, headers, runtime)

    def list_contact_authapp_ex(
        self,
        request: apigateway_models.ListContactAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListContactAuthappResponse:
        """
        Description: 通过授权App ID查询联系方式列表
        Summary: 通过授权App ID查询联系方式列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListContactAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.contact.authapp.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_contact_authapp_ex_async(
        self,
        request: apigateway_models.ListContactAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListContactAuthappResponse:
        """
        Description: 通过授权App ID查询联系方式列表
        Summary: 通过授权App ID查询联系方式列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListContactAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.contact.authapp.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_api_authapp(
        self,
        request: apigateway_models.UnmountApiAuthappRequest,
    ) -> apigateway_models.UnmountApiAuthappResponse:
        """
        Description: api解除授权App
        Summary: api解除授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_api_authapp_ex(request, headers, runtime)

    async def unmount_api_authapp_async(
        self,
        request: apigateway_models.UnmountApiAuthappRequest,
    ) -> apigateway_models.UnmountApiAuthappResponse:
        """
        Description: api解除授权App
        Summary: api解除授权App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_api_authapp_ex_async(request, headers, runtime)

    def unmount_api_authapp_ex(
        self,
        request: apigateway_models.UnmountApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountApiAuthappResponse:
        """
        Description: api解除授权App
        Summary: api解除授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountApiAuthappResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.authapp.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_api_authapp_ex_async(
        self,
        request: apigateway_models.UnmountApiAuthappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountApiAuthappResponse:
        """
        Description: api解除授权App
        Summary: api解除授权App
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountApiAuthappResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.authapp.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_api_versionapi(
        self,
        request: apigateway_models.GetApiVersionapiRequest,
    ) -> apigateway_models.GetApiVersionapiResponse:
        """
        Description: 获取指定版本的api
        Summary: 获取指定版本的api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_api_versionapi_ex(request, headers, runtime)

    async def get_api_versionapi_async(
        self,
        request: apigateway_models.GetApiVersionapiRequest,
    ) -> apigateway_models.GetApiVersionapiResponse:
        """
        Description: 获取指定版本的api
        Summary: 获取指定版本的api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_api_versionapi_ex_async(request, headers, runtime)

    def get_api_versionapi_ex(
        self,
        request: apigateway_models.GetApiVersionapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiVersionapiResponse:
        """
        Description: 获取指定版本的api
        Summary: 获取指定版本的api
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiVersionapiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.versionapi.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_api_versionapi_ex_async(
        self,
        request: apigateway_models.GetApiVersionapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiVersionapiResponse:
        """
        Description: 获取指定版本的api
        Summary: 获取指定版本的api
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiVersionapiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.versionapi.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cors(
        self,
        request: apigateway_models.CreateCorsRequest,
    ) -> apigateway_models.CreateCorsResponse:
        """
        Description: 创建cors
        Summary: 创建cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cors_ex(request, headers, runtime)

    async def create_cors_async(
        self,
        request: apigateway_models.CreateCorsRequest,
    ) -> apigateway_models.CreateCorsResponse:
        """
        Description: 创建cors
        Summary: 创建cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cors_ex_async(request, headers, runtime)

    def create_cors_ex(
        self,
        request: apigateway_models.CreateCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateCorsResponse:
        """
        Description: 创建cors
        Summary: 创建cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateCorsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cors_ex_async(
        self,
        request: apigateway_models.CreateCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateCorsResponse:
        """
        Description: 创建cors
        Summary: 创建cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateCorsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cors(
        self,
        request: apigateway_models.UpdateCorsRequest,
    ) -> apigateway_models.UpdateCorsResponse:
        """
        Description: 编辑cors
        Summary: 编辑cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cors_ex(request, headers, runtime)

    async def update_cors_async(
        self,
        request: apigateway_models.UpdateCorsRequest,
    ) -> apigateway_models.UpdateCorsResponse:
        """
        Description: 编辑cors
        Summary: 编辑cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cors_ex_async(request, headers, runtime)

    def update_cors_ex(
        self,
        request: apigateway_models.UpdateCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateCorsResponse:
        """
        Description: 编辑cors
        Summary: 编辑cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateCorsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cors_ex_async(
        self,
        request: apigateway_models.UpdateCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateCorsResponse:
        """
        Description: 编辑cors
        Summary: 编辑cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateCorsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_cors(
        self,
        request: apigateway_models.DeleteCorsRequest,
    ) -> apigateway_models.DeleteCorsResponse:
        """
        Description: 删除cors
        Summary: 删除cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_cors_ex(request, headers, runtime)

    async def delete_cors_async(
        self,
        request: apigateway_models.DeleteCorsRequest,
    ) -> apigateway_models.DeleteCorsResponse:
        """
        Description: 删除cors
        Summary: 删除cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_cors_ex_async(request, headers, runtime)

    def delete_cors_ex(
        self,
        request: apigateway_models.DeleteCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteCorsResponse:
        """
        Description: 删除cors
        Summary: 删除cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteCorsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_cors_ex_async(
        self,
        request: apigateway_models.DeleteCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteCorsResponse:
        """
        Description: 删除cors
        Summary: 删除cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteCorsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_cors(
        self,
        request: apigateway_models.AllCorsRequest,
    ) -> apigateway_models.AllCorsResponse:
        """
        Description: 查询cors列表
        Summary: 查询cors列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_cors_ex(request, headers, runtime)

    async def all_cors_async(
        self,
        request: apigateway_models.AllCorsRequest,
    ) -> apigateway_models.AllCorsResponse:
        """
        Description: 查询cors列表
        Summary: 查询cors列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_cors_ex_async(request, headers, runtime)

    def all_cors_ex(
        self,
        request: apigateway_models.AllCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllCorsResponse:
        """
        Description: 查询cors列表
        Summary: 查询cors列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllCorsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_cors_ex_async(
        self,
        request: apigateway_models.AllCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllCorsResponse:
        """
        Description: 查询cors列表
        Summary: 查询cors列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllCorsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cors(
        self,
        request: apigateway_models.ListCorsRequest,
    ) -> apigateway_models.ListCorsResponse:
        """
        Description: 查询cors分页列表
        Summary: 查询cors分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cors_ex(request, headers, runtime)

    async def list_cors_async(
        self,
        request: apigateway_models.ListCorsRequest,
    ) -> apigateway_models.ListCorsResponse:
        """
        Description: 查询cors分页列表
        Summary: 查询cors分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cors_ex_async(request, headers, runtime)

    def list_cors_ex(
        self,
        request: apigateway_models.ListCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListCorsResponse:
        """
        Description: 查询cors分页列表
        Summary: 查询cors分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListCorsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cors_ex_async(
        self,
        request: apigateway_models.ListCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListCorsResponse:
        """
        Description: 查询cors分页列表
        Summary: 查询cors分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListCorsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cors(
        self,
        request: apigateway_models.GetCorsRequest,
    ) -> apigateway_models.GetCorsResponse:
        """
        Description: 根据ID查询cors
        Summary: 根据ID查询cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cors_ex(request, headers, runtime)

    async def get_cors_async(
        self,
        request: apigateway_models.GetCorsRequest,
    ) -> apigateway_models.GetCorsResponse:
        """
        Description: 根据ID查询cors
        Summary: 根据ID查询cors
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cors_ex_async(request, headers, runtime)

    def get_cors_ex(
        self,
        request: apigateway_models.GetCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetCorsResponse:
        """
        Description: 根据ID查询cors
        Summary: 根据ID查询cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetCorsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cors_ex_async(
        self,
        request: apigateway_models.GetCorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetCorsResponse:
        """
        Description: 根据ID查询cors
        Summary: 根据ID查询cors
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetCorsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_cors_api(
        self,
        request: apigateway_models.AllCorsApiRequest,
    ) -> apigateway_models.AllCorsApiResponse:
        """
        Description: 根据 cors ID 查询 API 列表
        Summary: 根据 cors ID 查询 API 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_cors_api_ex(request, headers, runtime)

    async def all_cors_api_async(
        self,
        request: apigateway_models.AllCorsApiRequest,
    ) -> apigateway_models.AllCorsApiResponse:
        """
        Description: 根据 cors ID 查询 API 列表
        Summary: 根据 cors ID 查询 API 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_cors_api_ex_async(request, headers, runtime)

    def all_cors_api_ex(
        self,
        request: apigateway_models.AllCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllCorsApiResponse:
        """
        Description: 根据 cors ID 查询 API 列表
        Summary: 根据 cors ID 查询 API 列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllCorsApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_cors_api_ex_async(
        self,
        request: apigateway_models.AllCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllCorsApiResponse:
        """
        Description: 根据 cors ID 查询 API 列表
        Summary: 根据 cors ID 查询 API 列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllCorsApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cors_api(
        self,
        request: apigateway_models.ListCorsApiRequest,
    ) -> apigateway_models.ListCorsApiResponse:
        """
        Description: 根据cors ID查询API分页列表
        Summary: 根据cors ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cors_api_ex(request, headers, runtime)

    async def list_cors_api_async(
        self,
        request: apigateway_models.ListCorsApiRequest,
    ) -> apigateway_models.ListCorsApiResponse:
        """
        Description: 根据cors ID查询API分页列表
        Summary: 根据cors ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cors_api_ex_async(request, headers, runtime)

    def list_cors_api_ex(
        self,
        request: apigateway_models.ListCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListCorsApiResponse:
        """
        Description: 根据cors ID查询API分页列表
        Summary: 根据cors ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListCorsApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cors_api_ex_async(
        self,
        request: apigateway_models.ListCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListCorsApiResponse:
        """
        Description: 根据cors ID查询API分页列表
        Summary: 根据cors ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListCorsApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_cors_api(
        self,
        request: apigateway_models.MountCorsApiRequest,
    ) -> apigateway_models.MountCorsApiResponse:
        """
        Description: 根据cors ID绑定API
        Summary: 根据cors ID绑定API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_cors_api_ex(request, headers, runtime)

    async def mount_cors_api_async(
        self,
        request: apigateway_models.MountCorsApiRequest,
    ) -> apigateway_models.MountCorsApiResponse:
        """
        Description: 根据cors ID绑定API
        Summary: 根据cors ID绑定API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_cors_api_ex_async(request, headers, runtime)

    def mount_cors_api_ex(
        self,
        request: apigateway_models.MountCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountCorsApiResponse:
        """
        Description: 根据cors ID绑定API
        Summary: 根据cors ID绑定API
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountCorsApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_cors_api_ex_async(
        self,
        request: apigateway_models.MountCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountCorsApiResponse:
        """
        Description: 根据cors ID绑定API
        Summary: 根据cors ID绑定API
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountCorsApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_cors_api(
        self,
        request: apigateway_models.UnmountCorsApiRequest,
    ) -> apigateway_models.UnmountCorsApiResponse:
        """
        Description: 根据cors ID 解绑API
        Summary: 根据cors ID 解绑API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_cors_api_ex(request, headers, runtime)

    async def unmount_cors_api_async(
        self,
        request: apigateway_models.UnmountCorsApiRequest,
    ) -> apigateway_models.UnmountCorsApiResponse:
        """
        Description: 根据cors ID 解绑API
        Summary: 根据cors ID 解绑API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_cors_api_ex_async(request, headers, runtime)

    def unmount_cors_api_ex(
        self,
        request: apigateway_models.UnmountCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountCorsApiResponse:
        """
        Description: 根据cors ID 解绑API
        Summary: 根据cors ID 解绑API
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountCorsApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.cors.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_cors_api_ex_async(
        self,
        request: apigateway_models.UnmountCorsApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountCorsApiResponse:
        """
        Description: 根据cors ID 解绑API
        Summary: 根据cors ID 解绑API
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountCorsApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.cors.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_test_http(
        self,
        request: apigateway_models.ExecTestHttpRequest,
    ) -> apigateway_models.ExecTestHttpResponse:
        """
        Description: API调试
        Summary: API调试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_test_http_ex(request, headers, runtime)

    async def exec_test_http_async(
        self,
        request: apigateway_models.ExecTestHttpRequest,
    ) -> apigateway_models.ExecTestHttpResponse:
        """
        Description: API调试
        Summary: API调试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_test_http_ex_async(request, headers, runtime)

    def exec_test_http_ex(
        self,
        request: apigateway_models.ExecTestHttpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExecTestHttpResponse:
        """
        Description: API调试
        Summary: API调试
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExecTestHttpResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.test.http.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_test_http_ex_async(
        self,
        request: apigateway_models.ExecTestHttpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExecTestHttpResponse:
        """
        Description: API调试
        Summary: API调试
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExecTestHttpResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.test.http.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api_authapplimit(
        self,
        request: apigateway_models.UpdateApiAuthapplimitRequest,
    ) -> apigateway_models.UpdateApiAuthapplimitResponse:
        """
        Description: 更新授权应用限流
        Summary: 更新授权应用限流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_authapplimit_ex(request, headers, runtime)

    async def update_api_authapplimit_async(
        self,
        request: apigateway_models.UpdateApiAuthapplimitRequest,
    ) -> apigateway_models.UpdateApiAuthapplimitResponse:
        """
        Description: 更新授权应用限流
        Summary: 更新授权应用限流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_authapplimit_ex_async(request, headers, runtime)

    def update_api_authapplimit_ex(
        self,
        request: apigateway_models.UpdateApiAuthapplimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiAuthapplimitResponse:
        """
        Description: 更新授权应用限流
        Summary: 更新授权应用限流
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiAuthapplimitResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.authapplimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_authapplimit_ex_async(
        self,
        request: apigateway_models.UpdateApiAuthapplimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiAuthapplimitResponse:
        """
        Description: 更新授权应用限流
        Summary: 更新授权应用限流
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiAuthapplimitResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.authapplimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_api_authapplimit(
        self,
        request: apigateway_models.GetApiAuthapplimitRequest,
    ) -> apigateway_models.GetApiAuthapplimitResponse:
        """
        Description: 查询授权应用限制
        Summary: 查询授权应用限制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_api_authapplimit_ex(request, headers, runtime)

    async def get_api_authapplimit_async(
        self,
        request: apigateway_models.GetApiAuthapplimitRequest,
    ) -> apigateway_models.GetApiAuthapplimitResponse:
        """
        Description: 查询授权应用限制
        Summary: 查询授权应用限制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_api_authapplimit_ex_async(request, headers, runtime)

    def get_api_authapplimit_ex(
        self,
        request: apigateway_models.GetApiAuthapplimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiAuthapplimitResponse:
        """
        Description: 查询授权应用限制
        Summary: 查询授权应用限制
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiAuthapplimitResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.authapplimit.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_api_authapplimit_ex_async(
        self,
        request: apigateway_models.GetApiAuthapplimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiAuthapplimitResponse:
        """
        Description: 查询授权应用限制
        Summary: 查询授权应用限制
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiAuthapplimitResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.authapplimit.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api_limitconfig(
        self,
        request: apigateway_models.UpdateApiLimitconfigRequest,
    ) -> apigateway_models.UpdateApiLimitconfigResponse:
        """
        Description: 编辑限流配置
        Summary: 编辑限流配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_limitconfig_ex(request, headers, runtime)

    async def update_api_limitconfig_async(
        self,
        request: apigateway_models.UpdateApiLimitconfigRequest,
    ) -> apigateway_models.UpdateApiLimitconfigResponse:
        """
        Description: 编辑限流配置
        Summary: 编辑限流配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_limitconfig_ex_async(request, headers, runtime)

    def update_api_limitconfig_ex(
        self,
        request: apigateway_models.UpdateApiLimitconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiLimitconfigResponse:
        """
        Description: 编辑限流配置
        Summary: 编辑限流配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiLimitconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.limitconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_limitconfig_ex_async(
        self,
        request: apigateway_models.UpdateApiLimitconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiLimitconfigResponse:
        """
        Description: 编辑限流配置
        Summary: 编辑限流配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiLimitconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.limitconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api_cacheinfo(
        self,
        request: apigateway_models.UpdateApiCacheinfoRequest,
    ) -> apigateway_models.UpdateApiCacheinfoResponse:
        """
        Description: 更新缓存信息
        Summary: 更新缓存信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_cacheinfo_ex(request, headers, runtime)

    async def update_api_cacheinfo_async(
        self,
        request: apigateway_models.UpdateApiCacheinfoRequest,
    ) -> apigateway_models.UpdateApiCacheinfoResponse:
        """
        Description: 更新缓存信息
        Summary: 更新缓存信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_cacheinfo_ex_async(request, headers, runtime)

    def update_api_cacheinfo_ex(
        self,
        request: apigateway_models.UpdateApiCacheinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiCacheinfoResponse:
        """
        Description: 更新缓存信息
        Summary: 更新缓存信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiCacheinfoResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.cacheinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_cacheinfo_ex_async(
        self,
        request: apigateway_models.UpdateApiCacheinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiCacheinfoResponse:
        """
        Description: 更新缓存信息
        Summary: 更新缓存信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiCacheinfoResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.cacheinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_monitor(
        self,
        request: apigateway_models.QueryMonitorRequest,
    ) -> apigateway_models.QueryMonitorResponse:
        """
        Description: 查询监控
        Summary: 查询监控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_monitor_ex(request, headers, runtime)

    async def query_monitor_async(
        self,
        request: apigateway_models.QueryMonitorRequest,
    ) -> apigateway_models.QueryMonitorResponse:
        """
        Description: 查询监控
        Summary: 查询监控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_monitor_ex_async(request, headers, runtime)

    def query_monitor_ex(
        self,
        request: apigateway_models.QueryMonitorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.QueryMonitorResponse:
        """
        Description: 查询监控
        Summary: 查询监控
        """
        UtilClient.validate_model(request)
        return apigateway_models.QueryMonitorResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.monitor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_monitor_ex_async(
        self,
        request: apigateway_models.QueryMonitorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.QueryMonitorResponse:
        """
        Description: 查询监控
        Summary: 查询监控
        """
        UtilClient.validate_model(request)
        return apigateway_models.QueryMonitorResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.monitor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resultcode(
        self,
        request: apigateway_models.QueryResultcodeRequest,
    ) -> apigateway_models.QueryResultcodeResponse:
        """
        Description: 查询结果码
        Summary: 查询结果码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resultcode_ex(request, headers, runtime)

    async def query_resultcode_async(
        self,
        request: apigateway_models.QueryResultcodeRequest,
    ) -> apigateway_models.QueryResultcodeResponse:
        """
        Description: 查询结果码
        Summary: 查询结果码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resultcode_ex_async(request, headers, runtime)

    def query_resultcode_ex(
        self,
        request: apigateway_models.QueryResultcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.QueryResultcodeResponse:
        """
        Description: 查询结果码
        Summary: 查询结果码
        """
        UtilClient.validate_model(request)
        return apigateway_models.QueryResultcodeResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.resultcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resultcode_ex_async(
        self,
        request: apigateway_models.QueryResultcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.QueryResultcodeResponse:
        """
        Description: 查询结果码
        Summary: 查询结果码
        """
        UtilClient.validate_model(request)
        return apigateway_models.QueryResultcodeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.resultcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_api_version(
        self,
        request: apigateway_models.OnlineApiVersionRequest,
    ) -> apigateway_models.OnlineApiVersionResponse:
        """
        Description: 上线指定版本api
        Summary: 上线指定版本api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_api_version_ex(request, headers, runtime)

    async def online_api_version_async(
        self,
        request: apigateway_models.OnlineApiVersionRequest,
    ) -> apigateway_models.OnlineApiVersionResponse:
        """
        Description: 上线指定版本api
        Summary: 上线指定版本api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_api_version_ex_async(request, headers, runtime)

    def online_api_version_ex(
        self,
        request: apigateway_models.OnlineApiVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.OnlineApiVersionResponse:
        """
        Description: 上线指定版本api
        Summary: 上线指定版本api
        """
        UtilClient.validate_model(request)
        return apigateway_models.OnlineApiVersionResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.version.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_api_version_ex_async(
        self,
        request: apigateway_models.OnlineApiVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.OnlineApiVersionResponse:
        """
        Description: 上线指定版本api
        Summary: 上线指定版本api
        """
        UtilClient.validate_model(request)
        return apigateway_models.OnlineApiVersionResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.version.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ldc(
        self,
        request: apigateway_models.CreateLdcRequest,
    ) -> apigateway_models.CreateLdcResponse:
        """
        Description: 创建LDC规则
        Summary: 创建LDC规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ldc_ex(request, headers, runtime)

    async def create_ldc_async(
        self,
        request: apigateway_models.CreateLdcRequest,
    ) -> apigateway_models.CreateLdcResponse:
        """
        Description: 创建LDC规则
        Summary: 创建LDC规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ldc_ex_async(request, headers, runtime)

    def create_ldc_ex(
        self,
        request: apigateway_models.CreateLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateLdcResponse:
        """
        Description: 创建LDC规则
        Summary: 创建LDC规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateLdcResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.ldc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ldc_ex_async(
        self,
        request: apigateway_models.CreateLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateLdcResponse:
        """
        Description: 创建LDC规则
        Summary: 创建LDC规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateLdcResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.ldc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ldc(
        self,
        request: apigateway_models.UpdateLdcRequest,
    ) -> apigateway_models.UpdateLdcResponse:
        """
        Description: 修改 LDC规则
        Summary: 修改 LDC规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ldc_ex(request, headers, runtime)

    async def update_ldc_async(
        self,
        request: apigateway_models.UpdateLdcRequest,
    ) -> apigateway_models.UpdateLdcResponse:
        """
        Description: 修改 LDC规则
        Summary: 修改 LDC规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ldc_ex_async(request, headers, runtime)

    def update_ldc_ex(
        self,
        request: apigateway_models.UpdateLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateLdcResponse:
        """
        Description: 修改 LDC规则
        Summary: 修改 LDC规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateLdcResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.ldc.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ldc_ex_async(
        self,
        request: apigateway_models.UpdateLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateLdcResponse:
        """
        Description: 修改 LDC规则
        Summary: 修改 LDC规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateLdcResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.ldc.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ldc(
        self,
        request: apigateway_models.DeleteLdcRequest,
    ) -> apigateway_models.DeleteLdcResponse:
        """
        Description: 删除LDC规则
        Summary: 删除LDC规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ldc_ex(request, headers, runtime)

    async def delete_ldc_async(
        self,
        request: apigateway_models.DeleteLdcRequest,
    ) -> apigateway_models.DeleteLdcResponse:
        """
        Description: 删除LDC规则
        Summary: 删除LDC规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ldc_ex_async(request, headers, runtime)

    def delete_ldc_ex(
        self,
        request: apigateway_models.DeleteLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteLdcResponse:
        """
        Description: 删除LDC规则
        Summary: 删除LDC规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteLdcResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.ldc.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ldc_ex_async(
        self,
        request: apigateway_models.DeleteLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteLdcResponse:
        """
        Description: 删除LDC规则
        Summary: 删除LDC规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteLdcResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.ldc.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ldc(
        self,
        request: apigateway_models.GetLdcRequest,
    ) -> apigateway_models.GetLdcResponse:
        """
        Description: 查询ldc规则
        Summary: 查询ldc规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ldc_ex(request, headers, runtime)

    async def get_ldc_async(
        self,
        request: apigateway_models.GetLdcRequest,
    ) -> apigateway_models.GetLdcResponse:
        """
        Description: 查询ldc规则
        Summary: 查询ldc规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ldc_ex_async(request, headers, runtime)

    def get_ldc_ex(
        self,
        request: apigateway_models.GetLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetLdcResponse:
        """
        Description: 查询ldc规则
        Summary: 查询ldc规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetLdcResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.ldc.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ldc_ex_async(
        self,
        request: apigateway_models.GetLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetLdcResponse:
        """
        Description: 查询ldc规则
        Summary: 查询ldc规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetLdcResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.ldc.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_ldc(
        self,
        request: apigateway_models.SaveLdcRequest,
    ) -> apigateway_models.SaveLdcResponse:
        """
        Description: 保存ldc规则
        Summary: 保存ldc规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_ldc_ex(request, headers, runtime)

    async def save_ldc_async(
        self,
        request: apigateway_models.SaveLdcRequest,
    ) -> apigateway_models.SaveLdcResponse:
        """
        Description: 保存ldc规则
        Summary: 保存ldc规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_ldc_ex_async(request, headers, runtime)

    def save_ldc_ex(
        self,
        request: apigateway_models.SaveLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.SaveLdcResponse:
        """
        Description: 保存ldc规则
        Summary: 保存ldc规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.SaveLdcResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.ldc.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_ldc_ex_async(
        self,
        request: apigateway_models.SaveLdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.SaveLdcResponse:
        """
        Description: 保存ldc规则
        Summary: 保存ldc规则
        """
        UtilClient.validate_model(request)
        return apigateway_models.SaveLdcResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.ldc.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_authapp_api(
        self,
        request: apigateway_models.MountAuthappApiRequest,
    ) -> apigateway_models.MountAuthappApiResponse:
        """
        Description: 授权APP绑定API
        Summary: 授权APP绑定API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_authapp_api_ex(request, headers, runtime)

    async def mount_authapp_api_async(
        self,
        request: apigateway_models.MountAuthappApiRequest,
    ) -> apigateway_models.MountAuthappApiResponse:
        """
        Description: 授权APP绑定API
        Summary: 授权APP绑定API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_authapp_api_ex_async(request, headers, runtime)

    def mount_authapp_api_ex(
        self,
        request: apigateway_models.MountAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountAuthappApiResponse:
        """
        Description: 授权APP绑定API
        Summary: 授权APP绑定API
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountAuthappApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_authapp_api_ex_async(
        self,
        request: apigateway_models.MountAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountAuthappApiResponse:
        """
        Description: 授权APP绑定API
        Summary: 授权APP绑定API
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountAuthappApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_authapp_api(
        self,
        request: apigateway_models.UnmountAuthappApiRequest,
    ) -> apigateway_models.UnmountAuthappApiResponse:
        """
        Description: 授权app解除绑定Api
        Summary: 授权app解除绑定Api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_authapp_api_ex(request, headers, runtime)

    async def unmount_authapp_api_async(
        self,
        request: apigateway_models.UnmountAuthappApiRequest,
    ) -> apigateway_models.UnmountAuthappApiResponse:
        """
        Description: 授权app解除绑定Api
        Summary: 授权app解除绑定Api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_authapp_api_ex_async(request, headers, runtime)

    def unmount_authapp_api_ex(
        self,
        request: apigateway_models.UnmountAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountAuthappApiResponse:
        """
        Description: 授权app解除绑定Api
        Summary: 授权app解除绑定Api
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountAuthappApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.authapp.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_authapp_api_ex_async(
        self,
        request: apigateway_models.UnmountAuthappApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountAuthappApiResponse:
        """
        Description: 授权app解除绑定Api
        Summary: 授权app解除绑定Api
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountAuthappApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.authapp.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_api(
        self,
        request: apigateway_models.ImportApiRequest,
    ) -> apigateway_models.ImportApiResponse:
        """
        Description: 导入 API
        Summary: 导入 API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_api_ex(request, headers, runtime)

    async def import_api_async(
        self,
        request: apigateway_models.ImportApiRequest,
    ) -> apigateway_models.ImportApiResponse:
        """
        Description: 导入 API
        Summary: 导入 API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_api_ex_async(request, headers, runtime)

    def import_api_ex(
        self,
        request: apigateway_models.ImportApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ImportApiResponse:
        """
        Description: 导入 API
        Summary: 导入 API
        """
        UtilClient.validate_model(request)
        return apigateway_models.ImportApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_api_ex_async(
        self,
        request: apigateway_models.ImportApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ImportApiResponse:
        """
        Description: 导入 API
        Summary: 导入 API
        """
        UtilClient.validate_model(request)
        return apigateway_models.ImportApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_api(
        self,
        request: apigateway_models.ExportApiRequest,
    ) -> apigateway_models.ExportApiResponse:
        """
        Description: api批量导出
        Summary: api批量导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_api_ex(request, headers, runtime)

    async def export_api_async(
        self,
        request: apigateway_models.ExportApiRequest,
    ) -> apigateway_models.ExportApiResponse:
        """
        Description: api批量导出
        Summary: api批量导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_api_ex_async(request, headers, runtime)

    def export_api_ex(
        self,
        request: apigateway_models.ExportApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExportApiResponse:
        """
        Description: api批量导出
        Summary: api批量导出
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExportApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_api_ex_async(
        self,
        request: apigateway_models.ExportApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExportApiResponse:
        """
        Description: api批量导出
        Summary: api批量导出
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExportApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_apigroup_api(
        self,
        request: apigateway_models.ExportApigroupApiRequest,
    ) -> apigateway_models.ExportApigroupApiResponse:
        """
        Description: 根据API分组ID导出API
        Summary: 根据API分组ID导出API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_apigroup_api_ex(request, headers, runtime)

    async def export_apigroup_api_async(
        self,
        request: apigateway_models.ExportApigroupApiRequest,
    ) -> apigateway_models.ExportApigroupApiResponse:
        """
        Description: 根据API分组ID导出API
        Summary: 根据API分组ID导出API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_apigroup_api_ex_async(request, headers, runtime)

    def export_apigroup_api_ex(
        self,
        request: apigateway_models.ExportApigroupApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExportApigroupApiResponse:
        """
        Description: 根据API分组ID导出API
        Summary: 根据API分组ID导出API
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExportApigroupApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.api.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_apigroup_api_ex_async(
        self,
        request: apigateway_models.ExportApigroupApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExportApigroupApiResponse:
        """
        Description: 根据API分组ID导出API
        Summary: 根据API分组ID导出API
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExportApigroupApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.api.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_parammapping(
        self,
        request: apigateway_models.CreateParammappingRequest,
    ) -> apigateway_models.CreateParammappingResponse:
        """
        Description: 创建参数映射
        Summary: 创建参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_parammapping_ex(request, headers, runtime)

    async def create_parammapping_async(
        self,
        request: apigateway_models.CreateParammappingRequest,
    ) -> apigateway_models.CreateParammappingResponse:
        """
        Description: 创建参数映射
        Summary: 创建参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_parammapping_ex_async(request, headers, runtime)

    def create_parammapping_ex(
        self,
        request: apigateway_models.CreateParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateParammappingResponse:
        """
        Description: 创建参数映射
        Summary: 创建参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateParammappingResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_parammapping_ex_async(
        self,
        request: apigateway_models.CreateParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateParammappingResponse:
        """
        Description: 创建参数映射
        Summary: 创建参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateParammappingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_parammapping(
        self,
        request: apigateway_models.UpdateParammappingRequest,
    ) -> apigateway_models.UpdateParammappingResponse:
        """
        Description:  更新参数映射
        Summary:  更新参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_parammapping_ex(request, headers, runtime)

    async def update_parammapping_async(
        self,
        request: apigateway_models.UpdateParammappingRequest,
    ) -> apigateway_models.UpdateParammappingResponse:
        """
        Description:  更新参数映射
        Summary:  更新参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_parammapping_ex_async(request, headers, runtime)

    def update_parammapping_ex(
        self,
        request: apigateway_models.UpdateParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateParammappingResponse:
        """
        Description:  更新参数映射
        Summary:  更新参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateParammappingResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_parammapping_ex_async(
        self,
        request: apigateway_models.UpdateParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateParammappingResponse:
        """
        Description:  更新参数映射
        Summary:  更新参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateParammappingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_parammapping(
        self,
        request: apigateway_models.DeleteParammappingRequest,
    ) -> apigateway_models.DeleteParammappingResponse:
        """
        Description: 删除参数映射
        Summary: 删除参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_parammapping_ex(request, headers, runtime)

    async def delete_parammapping_async(
        self,
        request: apigateway_models.DeleteParammappingRequest,
    ) -> apigateway_models.DeleteParammappingResponse:
        """
        Description: 删除参数映射
        Summary: 删除参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_parammapping_ex_async(request, headers, runtime)

    def delete_parammapping_ex(
        self,
        request: apigateway_models.DeleteParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteParammappingResponse:
        """
        Description: 删除参数映射
        Summary: 删除参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteParammappingResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_parammapping_ex_async(
        self,
        request: apigateway_models.DeleteParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteParammappingResponse:
        """
        Description: 删除参数映射
        Summary: 删除参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteParammappingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_parammapping(
        self,
        request: apigateway_models.ListParammappingRequest,
    ) -> apigateway_models.ListParammappingResponse:
        """
        Description: 查询参数映射分页列表
        Summary: 查询参数映射分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_parammapping_ex(request, headers, runtime)

    async def list_parammapping_async(
        self,
        request: apigateway_models.ListParammappingRequest,
    ) -> apigateway_models.ListParammappingResponse:
        """
        Description: 查询参数映射分页列表
        Summary: 查询参数映射分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_parammapping_ex_async(request, headers, runtime)

    def list_parammapping_ex(
        self,
        request: apigateway_models.ListParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListParammappingResponse:
        """
        Description: 查询参数映射分页列表
        Summary: 查询参数映射分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListParammappingResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_parammapping_ex_async(
        self,
        request: apigateway_models.ListParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListParammappingResponse:
        """
        Description: 查询参数映射分页列表
        Summary: 查询参数映射分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListParammappingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_parammapping(
        self,
        request: apigateway_models.AllParammappingRequest,
    ) -> apigateway_models.AllParammappingResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_parammapping_ex(request, headers, runtime)

    async def all_parammapping_async(
        self,
        request: apigateway_models.AllParammappingRequest,
    ) -> apigateway_models.AllParammappingResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_parammapping_ex_async(request, headers, runtime)

    def all_parammapping_ex(
        self,
        request: apigateway_models.AllParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllParammappingResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllParammappingResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_parammapping_ex_async(
        self,
        request: apigateway_models.AllParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllParammappingResponse:
        """
        Description: 查询API列表
        Summary: 查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllParammappingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_parammapping(
        self,
        request: apigateway_models.GetParammappingRequest,
    ) -> apigateway_models.GetParammappingResponse:
        """
        Description: 通过IDF查询参数映射
        Summary: 通过IDF查询参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_parammapping_ex(request, headers, runtime)

    async def get_parammapping_async(
        self,
        request: apigateway_models.GetParammappingRequest,
    ) -> apigateway_models.GetParammappingResponse:
        """
        Description: 通过IDF查询参数映射
        Summary: 通过IDF查询参数映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_parammapping_ex_async(request, headers, runtime)

    def get_parammapping_ex(
        self,
        request: apigateway_models.GetParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetParammappingResponse:
        """
        Description: 通过IDF查询参数映射
        Summary: 通过IDF查询参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetParammappingResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_parammapping_ex_async(
        self,
        request: apigateway_models.GetParammappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetParammappingResponse:
        """
        Description: 通过IDF查询参数映射
        Summary: 通过IDF查询参数映射
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetParammappingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_parammapping_api(
        self,
        request: apigateway_models.ListParammappingApiRequest,
    ) -> apigateway_models.ListParammappingApiResponse:
        """
        Description: 根据映射参数ID查询api分页列表
        Summary: 根据映射参数ID查询api分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_parammapping_api_ex(request, headers, runtime)

    async def list_parammapping_api_async(
        self,
        request: apigateway_models.ListParammappingApiRequest,
    ) -> apigateway_models.ListParammappingApiResponse:
        """
        Description: 根据映射参数ID查询api分页列表
        Summary: 根据映射参数ID查询api分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_parammapping_api_ex_async(request, headers, runtime)

    def list_parammapping_api_ex(
        self,
        request: apigateway_models.ListParammappingApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListParammappingApiResponse:
        """
        Description: 根据映射参数ID查询api分页列表
        Summary: 根据映射参数ID查询api分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListParammappingApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.parammapping.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_parammapping_api_ex_async(
        self,
        request: apigateway_models.ListParammappingApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListParammappingApiResponse:
        """
        Description: 根据映射参数ID查询api分页列表
        Summary: 根据映射参数ID查询api分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListParammappingApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.parammapping.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_apimodel(
        self,
        request: apigateway_models.AllApimodelRequest,
    ) -> apigateway_models.AllApimodelResponse:
        """
        Description: 查询模型列表
        Summary: 查询模型列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_apimodel_ex(request, headers, runtime)

    async def all_apimodel_async(
        self,
        request: apigateway_models.AllApimodelRequest,
    ) -> apigateway_models.AllApimodelResponse:
        """
        Description: 查询模型列表
        Summary: 查询模型列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_apimodel_ex_async(request, headers, runtime)

    def all_apimodel_ex(
        self,
        request: apigateway_models.AllApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApimodelResponse:
        """
        Description: 查询模型列表
        Summary: 查询模型列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_apimodel_ex_async(
        self,
        request: apigateway_models.AllApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApimodelResponse:
        """
        Description: 查询模型列表
        Summary: 查询模型列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apimodel(
        self,
        request: apigateway_models.ListApimodelRequest,
    ) -> apigateway_models.ListApimodelResponse:
        """
        Description: 查询api模板分页列表
        Summary: 查询模型分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apimodel_ex(request, headers, runtime)

    async def list_apimodel_async(
        self,
        request: apigateway_models.ListApimodelRequest,
    ) -> apigateway_models.ListApimodelResponse:
        """
        Description: 查询api模板分页列表
        Summary: 查询模型分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apimodel_ex_async(request, headers, runtime)

    def list_apimodel_ex(
        self,
        request: apigateway_models.ListApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApimodelResponse:
        """
        Description: 查询api模板分页列表
        Summary: 查询模型分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apimodel_ex_async(
        self,
        request: apigateway_models.ListApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApimodelResponse:
        """
        Description: 查询api模板分页列表
        Summary: 查询模型分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apimodel(
        self,
        request: apigateway_models.CreateApimodelRequest,
    ) -> apigateway_models.CreateApimodelResponse:
        """
        Description: 创建api模型
        Summary: 创建api模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apimodel_ex(request, headers, runtime)

    async def create_apimodel_async(
        self,
        request: apigateway_models.CreateApimodelRequest,
    ) -> apigateway_models.CreateApimodelResponse:
        """
        Description: 创建api模型
        Summary: 创建api模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apimodel_ex_async(request, headers, runtime)

    def create_apimodel_ex(
        self,
        request: apigateway_models.CreateApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApimodelResponse:
        """
        Description: 创建api模型
        Summary: 创建api模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apimodel_ex_async(
        self,
        request: apigateway_models.CreateApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApimodelResponse:
        """
        Description: 创建api模型
        Summary: 创建api模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apimodel(
        self,
        request: apigateway_models.DeleteApimodelRequest,
    ) -> apigateway_models.DeleteApimodelResponse:
        """
        Description: 删除api模型
        Summary: 删除api模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apimodel_ex(request, headers, runtime)

    async def delete_apimodel_async(
        self,
        request: apigateway_models.DeleteApimodelRequest,
    ) -> apigateway_models.DeleteApimodelResponse:
        """
        Description: 删除api模型
        Summary: 删除api模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apimodel_ex_async(request, headers, runtime)

    def delete_apimodel_ex(
        self,
        request: apigateway_models.DeleteApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApimodelResponse:
        """
        Description: 删除api模型
        Summary: 删除api模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apimodel_ex_async(
        self,
        request: apigateway_models.DeleteApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApimodelResponse:
        """
        Description: 删除api模型
        Summary: 删除api模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apimodel(
        self,
        request: apigateway_models.GetApimodelRequest,
    ) -> apigateway_models.GetApimodelResponse:
        """
        Description: 根据模型ID查询模型
        Summary: 根据模型ID查询模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apimodel_ex(request, headers, runtime)

    async def get_apimodel_async(
        self,
        request: apigateway_models.GetApimodelRequest,
    ) -> apigateway_models.GetApimodelResponse:
        """
        Description: 根据模型ID查询模型
        Summary: 根据模型ID查询模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apimodel_ex_async(request, headers, runtime)

    def get_apimodel_ex(
        self,
        request: apigateway_models.GetApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApimodelResponse:
        """
        Description: 根据模型ID查询模型
        Summary: 根据模型ID查询模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apimodel_ex_async(
        self,
        request: apigateway_models.GetApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApimodelResponse:
        """
        Description: 根据模型ID查询模型
        Summary: 根据模型ID查询模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apimodel(
        self,
        request: apigateway_models.UpdateApimodelRequest,
    ) -> apigateway_models.UpdateApimodelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apimodel_ex(request, headers, runtime)

    async def update_apimodel_async(
        self,
        request: apigateway_models.UpdateApimodelRequest,
    ) -> apigateway_models.UpdateApimodelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apimodel_ex_async(request, headers, runtime)

    def update_apimodel_ex(
        self,
        request: apigateway_models.UpdateApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApimodelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apimodel_ex_async(
        self,
        request: apigateway_models.UpdateApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApimodelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_apimodel_api(
        self,
        request: apigateway_models.AllApimodelApiRequest,
    ) -> apigateway_models.AllApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API列表
        Summary: 通过模型ID查询使用的API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_apimodel_api_ex(request, headers, runtime)

    async def all_apimodel_api_async(
        self,
        request: apigateway_models.AllApimodelApiRequest,
    ) -> apigateway_models.AllApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API列表
        Summary: 通过模型ID查询使用的API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_apimodel_api_ex_async(request, headers, runtime)

    def all_apimodel_api_ex(
        self,
        request: apigateway_models.AllApimodelApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API列表
        Summary: 通过模型ID查询使用的API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApimodelApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_apimodel_api_ex_async(
        self,
        request: apigateway_models.AllApimodelApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API列表
        Summary: 通过模型ID查询使用的API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApimodelApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apimodel_api(
        self,
        request: apigateway_models.ListApimodelApiRequest,
    ) -> apigateway_models.ListApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API分页列表
        Summary: 通过模型ID查询使用的API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apimodel_api_ex(request, headers, runtime)

    async def list_apimodel_api_async(
        self,
        request: apigateway_models.ListApimodelApiRequest,
    ) -> apigateway_models.ListApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API分页列表
        Summary: 通过模型ID查询使用的API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apimodel_api_ex_async(request, headers, runtime)

    def list_apimodel_api_ex(
        self,
        request: apigateway_models.ListApimodelApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API分页列表
        Summary: 通过模型ID查询使用的API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApimodelApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apimodel_api_ex_async(
        self,
        request: apigateway_models.ListApimodelApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApimodelApiResponse:
        """
        Description: 通过模型ID查询使用的API分页列表
        Summary: 通过模型ID查询使用的API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApimodelApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_externalauth(
        self,
        request: apigateway_models.CreateExternalauthRequest,
    ) -> apigateway_models.CreateExternalauthResponse:
        """
        Description: 创建外部授权
        Summary: 创建外部授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_externalauth_ex(request, headers, runtime)

    async def create_externalauth_async(
        self,
        request: apigateway_models.CreateExternalauthRequest,
    ) -> apigateway_models.CreateExternalauthResponse:
        """
        Description: 创建外部授权
        Summary: 创建外部授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_externalauth_ex_async(request, headers, runtime)

    def create_externalauth_ex(
        self,
        request: apigateway_models.CreateExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateExternalauthResponse:
        """
        Description: 创建外部授权
        Summary: 创建外部授权
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateExternalauthResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_externalauth_ex_async(
        self,
        request: apigateway_models.CreateExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateExternalauthResponse:
        """
        Description: 创建外部授权
        Summary: 创建外部授权
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateExternalauthResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_externalauth(
        self,
        request: apigateway_models.UpdateExternalauthRequest,
    ) -> apigateway_models.UpdateExternalauthResponse:
        """
        Description: 更新外部系统
        Summary: 更新外部系统
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_externalauth_ex(request, headers, runtime)

    async def update_externalauth_async(
        self,
        request: apigateway_models.UpdateExternalauthRequest,
    ) -> apigateway_models.UpdateExternalauthResponse:
        """
        Description: 更新外部系统
        Summary: 更新外部系统
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_externalauth_ex_async(request, headers, runtime)

    def update_externalauth_ex(
        self,
        request: apigateway_models.UpdateExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateExternalauthResponse:
        """
        Description: 更新外部系统
        Summary: 更新外部系统
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateExternalauthResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_externalauth_ex_async(
        self,
        request: apigateway_models.UpdateExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateExternalauthResponse:
        """
        Description: 更新外部系统
        Summary: 更新外部系统
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateExternalauthResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_externalauth(
        self,
        request: apigateway_models.DeleteExternalauthRequest,
    ) -> apigateway_models.DeleteExternalauthResponse:
        """
        Description: 删除外部授权
        Summary: 删除外部授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_externalauth_ex(request, headers, runtime)

    async def delete_externalauth_async(
        self,
        request: apigateway_models.DeleteExternalauthRequest,
    ) -> apigateway_models.DeleteExternalauthResponse:
        """
        Description: 删除外部授权
        Summary: 删除外部授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_externalauth_ex_async(request, headers, runtime)

    def delete_externalauth_ex(
        self,
        request: apigateway_models.DeleteExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteExternalauthResponse:
        """
        Description: 删除外部授权
        Summary: 删除外部授权
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteExternalauthResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_externalauth_ex_async(
        self,
        request: apigateway_models.DeleteExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteExternalauthResponse:
        """
        Description: 删除外部授权
        Summary: 删除外部授权
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteExternalauthResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_externalauth(
        self,
        request: apigateway_models.GetExternalauthRequest,
    ) -> apigateway_models.GetExternalauthResponse:
        """
        Description: 通过ID查询外部授权
        Summary: 通过ID查询外部授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_externalauth_ex(request, headers, runtime)

    async def get_externalauth_async(
        self,
        request: apigateway_models.GetExternalauthRequest,
    ) -> apigateway_models.GetExternalauthResponse:
        """
        Description: 通过ID查询外部授权
        Summary: 通过ID查询外部授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_externalauth_ex_async(request, headers, runtime)

    def get_externalauth_ex(
        self,
        request: apigateway_models.GetExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetExternalauthResponse:
        """
        Description: 通过ID查询外部授权
        Summary: 通过ID查询外部授权
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetExternalauthResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_externalauth_ex_async(
        self,
        request: apigateway_models.GetExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetExternalauthResponse:
        """
        Description: 通过ID查询外部授权
        Summary: 通过ID查询外部授权
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetExternalauthResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_externalauth(
        self,
        request: apigateway_models.ListExternalauthRequest,
    ) -> apigateway_models.ListExternalauthResponse:
        """
        Description: 查询外部授权分页列表
        Summary: 查询外部授权分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_externalauth_ex(request, headers, runtime)

    async def list_externalauth_async(
        self,
        request: apigateway_models.ListExternalauthRequest,
    ) -> apigateway_models.ListExternalauthResponse:
        """
        Description: 查询外部授权分页列表
        Summary: 查询外部授权分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_externalauth_ex_async(request, headers, runtime)

    def list_externalauth_ex(
        self,
        request: apigateway_models.ListExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListExternalauthResponse:
        """
        Description: 查询外部授权分页列表
        Summary: 查询外部授权分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListExternalauthResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_externalauth_ex_async(
        self,
        request: apigateway_models.ListExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListExternalauthResponse:
        """
        Description: 查询外部授权分页列表
        Summary: 查询外部授权分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListExternalauthResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_externalauth(
        self,
        request: apigateway_models.AllExternalauthRequest,
    ) -> apigateway_models.AllExternalauthResponse:
        """
        Description:  查询外部系统列表
        Summary:  查询外部系统列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_externalauth_ex(request, headers, runtime)

    async def all_externalauth_async(
        self,
        request: apigateway_models.AllExternalauthRequest,
    ) -> apigateway_models.AllExternalauthResponse:
        """
        Description:  查询外部系统列表
        Summary:  查询外部系统列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_externalauth_ex_async(request, headers, runtime)

    def all_externalauth_ex(
        self,
        request: apigateway_models.AllExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllExternalauthResponse:
        """
        Description:  查询外部系统列表
        Summary:  查询外部系统列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllExternalauthResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_externalauth_ex_async(
        self,
        request: apigateway_models.AllExternalauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllExternalauthResponse:
        """
        Description:  查询外部系统列表
        Summary:  查询外部系统列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllExternalauthResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_externalauth_api(
        self,
        request: apigateway_models.MountExternalauthApiRequest,
    ) -> apigateway_models.MountExternalauthApiResponse:
        """
        Description: 外部授权绑定api
        Summary: 外部授权绑定api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_externalauth_api_ex(request, headers, runtime)

    async def mount_externalauth_api_async(
        self,
        request: apigateway_models.MountExternalauthApiRequest,
    ) -> apigateway_models.MountExternalauthApiResponse:
        """
        Description: 外部授权绑定api
        Summary: 外部授权绑定api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_externalauth_api_ex_async(request, headers, runtime)

    def mount_externalauth_api_ex(
        self,
        request: apigateway_models.MountExternalauthApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountExternalauthApiResponse:
        """
        Description: 外部授权绑定api
        Summary: 外部授权绑定api
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountExternalauthApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_externalauth_api_ex_async(
        self,
        request: apigateway_models.MountExternalauthApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountExternalauthApiResponse:
        """
        Description: 外部授权绑定api
        Summary: 外部授权绑定api
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountExternalauthApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_externalauth_api(
        self,
        request: apigateway_models.UnmountExternalauthApiRequest,
    ) -> apigateway_models.UnmountExternalauthApiResponse:
        """
        Description: 外部授权解绑api
        Summary: 外部授权解绑api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_externalauth_api_ex(request, headers, runtime)

    async def unmount_externalauth_api_async(
        self,
        request: apigateway_models.UnmountExternalauthApiRequest,
    ) -> apigateway_models.UnmountExternalauthApiResponse:
        """
        Description: 外部授权解绑api
        Summary: 外部授权解绑api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_externalauth_api_ex_async(request, headers, runtime)

    def unmount_externalauth_api_ex(
        self,
        request: apigateway_models.UnmountExternalauthApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountExternalauthApiResponse:
        """
        Description: 外部授权解绑api
        Summary: 外部授权解绑api
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountExternalauthApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_externalauth_api_ex_async(
        self,
        request: apigateway_models.UnmountExternalauthApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountExternalauthApiResponse:
        """
        Description: 外部授权解绑api
        Summary: 外部授权解绑api
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountExternalauthApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apimodel_param(
        self,
        request: apigateway_models.DeleteApimodelParamRequest,
    ) -> apigateway_models.DeleteApimodelParamResponse:
        """
        Description: 删除模型参数
        Summary: 删除模型参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apimodel_param_ex(request, headers, runtime)

    async def delete_apimodel_param_async(
        self,
        request: apigateway_models.DeleteApimodelParamRequest,
    ) -> apigateway_models.DeleteApimodelParamResponse:
        """
        Description: 删除模型参数
        Summary: 删除模型参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apimodel_param_ex_async(request, headers, runtime)

    def delete_apimodel_param_ex(
        self,
        request: apigateway_models.DeleteApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApimodelParamResponse:
        """
        Description: 删除模型参数
        Summary: 删除模型参数
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApimodelParamResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.param.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apimodel_param_ex_async(
        self,
        request: apigateway_models.DeleteApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApimodelParamResponse:
        """
        Description: 删除模型参数
        Summary: 删除模型参数
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApimodelParamResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.param.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apimodel_param(
        self,
        request: apigateway_models.UpdateApimodelParamRequest,
    ) -> apigateway_models.UpdateApimodelParamResponse:
        """
        Description: 更新模型参数
        Summary: 更新模型参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apimodel_param_ex(request, headers, runtime)

    async def update_apimodel_param_async(
        self,
        request: apigateway_models.UpdateApimodelParamRequest,
    ) -> apigateway_models.UpdateApimodelParamResponse:
        """
        Description: 更新模型参数
        Summary: 更新模型参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apimodel_param_ex_async(request, headers, runtime)

    def update_apimodel_param_ex(
        self,
        request: apigateway_models.UpdateApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApimodelParamResponse:
        """
        Description: 更新模型参数
        Summary: 更新模型参数
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApimodelParamResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.param.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apimodel_param_ex_async(
        self,
        request: apigateway_models.UpdateApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApimodelParamResponse:
        """
        Description: 更新模型参数
        Summary: 更新模型参数
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApimodelParamResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.param.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apimodel_param(
        self,
        request: apigateway_models.CreateApimodelParamRequest,
    ) -> apigateway_models.CreateApimodelParamResponse:
        """
        Description: 新增模型参数
        Summary: 新增模型参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apimodel_param_ex(request, headers, runtime)

    async def create_apimodel_param_async(
        self,
        request: apigateway_models.CreateApimodelParamRequest,
    ) -> apigateway_models.CreateApimodelParamResponse:
        """
        Description: 新增模型参数
        Summary: 新增模型参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apimodel_param_ex_async(request, headers, runtime)

    def create_apimodel_param_ex(
        self,
        request: apigateway_models.CreateApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApimodelParamResponse:
        """
        Description: 新增模型参数
        Summary: 新增模型参数
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApimodelParamResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.param.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apimodel_param_ex_async(
        self,
        request: apigateway_models.CreateApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApimodelParamResponse:
        """
        Description: 新增模型参数
        Summary: 新增模型参数
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApimodelParamResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.param.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_externalauth_api(
        self,
        request: apigateway_models.ListExternalauthApiRequest,
    ) -> apigateway_models.ListExternalauthApiResponse:
        """
        Description: 通过外部授权ID查询API分页列表
        Summary: 通过外部授权ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_externalauth_api_ex(request, headers, runtime)

    async def list_externalauth_api_async(
        self,
        request: apigateway_models.ListExternalauthApiRequest,
    ) -> apigateway_models.ListExternalauthApiResponse:
        """
        Description: 通过外部授权ID查询API分页列表
        Summary: 通过外部授权ID查询API分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_externalauth_api_ex_async(request, headers, runtime)

    def list_externalauth_api_ex(
        self,
        request: apigateway_models.ListExternalauthApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListExternalauthApiResponse:
        """
        Description: 通过外部授权ID查询API分页列表
        Summary: 通过外部授权ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListExternalauthApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.externalauth.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_externalauth_api_ex_async(
        self,
        request: apigateway_models.ListExternalauthApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListExternalauthApiResponse:
        """
        Description: 通过外部授权ID查询API分页列表
        Summary: 通过外部授权ID查询API分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListExternalauthApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.externalauth.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_apimodel_param(
        self,
        request: apigateway_models.CheckApimodelParamRequest,
    ) -> apigateway_models.CheckApimodelParamResponse:
        """
        Description: 校检 模型引用是否死循环
        Summary: 校检 模型引用是否死循环
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_apimodel_param_ex(request, headers, runtime)

    async def check_apimodel_param_async(
        self,
        request: apigateway_models.CheckApimodelParamRequest,
    ) -> apigateway_models.CheckApimodelParamResponse:
        """
        Description: 校检 模型引用是否死循环
        Summary: 校检 模型引用是否死循环
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_apimodel_param_ex_async(request, headers, runtime)

    def check_apimodel_param_ex(
        self,
        request: apigateway_models.CheckApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckApimodelParamResponse:
        """
        Description: 校检 模型引用是否死循环
        Summary: 校检 模型引用是否死循环
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckApimodelParamResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.param.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_apimodel_param_ex_async(
        self,
        request: apigateway_models.CheckApimodelParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckApimodelParamResponse:
        """
        Description: 校检 模型引用是否死循环
        Summary: 校检 模型引用是否死循环
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckApimodelParamResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.param.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resolve_apimodel(
        self,
        request: apigateway_models.ResolveApimodelRequest,
    ) -> apigateway_models.ResolveApimodelResponse:
        """
        Description: 解析数据模型
        Summary: 解析数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resolve_apimodel_ex(request, headers, runtime)

    async def resolve_apimodel_async(
        self,
        request: apigateway_models.ResolveApimodelRequest,
    ) -> apigateway_models.ResolveApimodelResponse:
        """
        Description: 解析数据模型
        Summary: 解析数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resolve_apimodel_ex_async(request, headers, runtime)

    def resolve_apimodel_ex(
        self,
        request: apigateway_models.ResolveApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ResolveApimodelResponse:
        """
        Description: 解析数据模型
        Summary: 解析数据模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.ResolveApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.resolve', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resolve_apimodel_ex_async(
        self,
        request: apigateway_models.ResolveApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ResolveApimodelResponse:
        """
        Description: 解析数据模型
        Summary: 解析数据模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.ResolveApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.resolve', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_apimodel(
        self,
        request: apigateway_models.ImportApimodelRequest,
    ) -> apigateway_models.ImportApimodelResponse:
        """
        Description: 侯志波
        Summary: 导入数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_apimodel_ex(request, headers, runtime)

    async def import_apimodel_async(
        self,
        request: apigateway_models.ImportApimodelRequest,
    ) -> apigateway_models.ImportApimodelResponse:
        """
        Description: 侯志波
        Summary: 导入数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_apimodel_ex_async(request, headers, runtime)

    def import_apimodel_ex(
        self,
        request: apigateway_models.ImportApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ImportApimodelResponse:
        """
        Description: 侯志波
        Summary: 导入数据模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.ImportApimodelResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_apimodel_ex_async(
        self,
        request: apigateway_models.ImportApimodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ImportApimodelResponse:
        """
        Description: 侯志波
        Summary: 导入数据模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.ImportApimodelResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_apimodel_mgs(
        self,
        request: apigateway_models.ApplyApimodelMgsRequest,
    ) -> apigateway_models.ApplyApimodelMgsResponse:
        """
        Description: mgs模型转换 为网关模型
        Summary: （mgs模型数据迁移）转换 为网关模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_apimodel_mgs_ex(request, headers, runtime)

    async def apply_apimodel_mgs_async(
        self,
        request: apigateway_models.ApplyApimodelMgsRequest,
    ) -> apigateway_models.ApplyApimodelMgsResponse:
        """
        Description: mgs模型转换 为网关模型
        Summary: （mgs模型数据迁移）转换 为网关模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_apimodel_mgs_ex_async(request, headers, runtime)

    def apply_apimodel_mgs_ex(
        self,
        request: apigateway_models.ApplyApimodelMgsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ApplyApimodelMgsResponse:
        """
        Description: mgs模型转换 为网关模型
        Summary: （mgs模型数据迁移）转换 为网关模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.ApplyApimodelMgsResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.mgs.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_apimodel_mgs_ex_async(
        self,
        request: apigateway_models.ApplyApimodelMgsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ApplyApimodelMgsResponse:
        """
        Description: mgs模型转换 为网关模型
        Summary: （mgs模型数据迁移）转换 为网关模型
        """
        UtilClient.validate_model(request)
        return apigateway_models.ApplyApimodelMgsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.mgs.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_operator(
        self,
        request: apigateway_models.ListOperatorRequest,
    ) -> apigateway_models.ListOperatorResponse:
        """
        Description: 查询操作人分页列表
        Summary: 查询操作人分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_operator_ex(request, headers, runtime)

    async def list_operator_async(
        self,
        request: apigateway_models.ListOperatorRequest,
    ) -> apigateway_models.ListOperatorResponse:
        """
        Description: 查询操作人分页列表
        Summary: 查询操作人分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_operator_ex_async(request, headers, runtime)

    def list_operator_ex(
        self,
        request: apigateway_models.ListOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListOperatorResponse:
        """
        Description: 查询操作人分页列表
        Summary: 查询操作人分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListOperatorResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.operator.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_operator_ex_async(
        self,
        request: apigateway_models.ListOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListOperatorResponse:
        """
        Description: 查询操作人分页列表
        Summary: 查询操作人分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListOperatorResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.operator.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apigroup_authuserconfig(
        self,
        request: apigateway_models.UpdateApigroupAuthuserconfigRequest,
    ) -> apigateway_models.UpdateApigroupAuthuserconfigResponse:
        """
        Description: 更新api分组授权用户配置
        Summary: 更新api分组授权用户配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apigroup_authuserconfig_ex(request, headers, runtime)

    async def update_apigroup_authuserconfig_async(
        self,
        request: apigateway_models.UpdateApigroupAuthuserconfigRequest,
    ) -> apigateway_models.UpdateApigroupAuthuserconfigResponse:
        """
        Description: 更新api分组授权用户配置
        Summary: 更新api分组授权用户配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apigroup_authuserconfig_ex_async(request, headers, runtime)

    def update_apigroup_authuserconfig_ex(
        self,
        request: apigateway_models.UpdateApigroupAuthuserconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApigroupAuthuserconfigResponse:
        """
        Description: 更新api分组授权用户配置
        Summary: 更新api分组授权用户配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApigroupAuthuserconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuserconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apigroup_authuserconfig_ex_async(
        self,
        request: apigateway_models.UpdateApigroupAuthuserconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApigroupAuthuserconfigResponse:
        """
        Description: 更新api分组授权用户配置
        Summary: 更新api分组授权用户配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApigroupAuthuserconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuserconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apigroup_authuserconfig(
        self,
        request: apigateway_models.GetApigroupAuthuserconfigRequest,
    ) -> apigateway_models.GetApigroupAuthuserconfigResponse:
        """
        Description: 查询api分组授权用户配置
        Summary: 查询api分组授权用户配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apigroup_authuserconfig_ex(request, headers, runtime)

    async def get_apigroup_authuserconfig_async(
        self,
        request: apigateway_models.GetApigroupAuthuserconfigRequest,
    ) -> apigateway_models.GetApigroupAuthuserconfigResponse:
        """
        Description: 查询api分组授权用户配置
        Summary: 查询api分组授权用户配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apigroup_authuserconfig_ex_async(request, headers, runtime)

    def get_apigroup_authuserconfig_ex(
        self,
        request: apigateway_models.GetApigroupAuthuserconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApigroupAuthuserconfigResponse:
        """
        Description: 查询api分组授权用户配置
        Summary: 查询api分组授权用户配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApigroupAuthuserconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuserconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apigroup_authuserconfig_ex_async(
        self,
        request: apigateway_models.GetApigroupAuthuserconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApigroupAuthuserconfigResponse:
        """
        Description: 查询api分组授权用户配置
        Summary: 查询api分组授权用户配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApigroupAuthuserconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuserconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_apigroup_authuser(
        self,
        request: apigateway_models.AddApigroupAuthuserRequest,
    ) -> apigateway_models.AddApigroupAuthuserResponse:
        """
        Description: api分组添加用户
        Summary: api分组添加用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_apigroup_authuser_ex(request, headers, runtime)

    async def add_apigroup_authuser_async(
        self,
        request: apigateway_models.AddApigroupAuthuserRequest,
    ) -> apigateway_models.AddApigroupAuthuserResponse:
        """
        Description: api分组添加用户
        Summary: api分组添加用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_apigroup_authuser_ex_async(request, headers, runtime)

    def add_apigroup_authuser_ex(
        self,
        request: apigateway_models.AddApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AddApigroupAuthuserResponse:
        """
        Description: api分组添加用户
        Summary: api分组添加用户
        """
        UtilClient.validate_model(request)
        return apigateway_models.AddApigroupAuthuserResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuser.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_apigroup_authuser_ex_async(
        self,
        request: apigateway_models.AddApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AddApigroupAuthuserResponse:
        """
        Description: api分组添加用户
        Summary: api分组添加用户
        """
        UtilClient.validate_model(request)
        return apigateway_models.AddApigroupAuthuserResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuser.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_apigroup_authuser(
        self,
        request: apigateway_models.MountApigroupAuthuserRequest,
    ) -> apigateway_models.MountApigroupAuthuserResponse:
        """
        Description:  api分组授权用户使用权限
        Summary:  api分组授权用户使用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_apigroup_authuser_ex(request, headers, runtime)

    async def mount_apigroup_authuser_async(
        self,
        request: apigateway_models.MountApigroupAuthuserRequest,
    ) -> apigateway_models.MountApigroupAuthuserResponse:
        """
        Description:  api分组授权用户使用权限
        Summary:  api分组授权用户使用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_apigroup_authuser_ex_async(request, headers, runtime)

    def mount_apigroup_authuser_ex(
        self,
        request: apigateway_models.MountApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountApigroupAuthuserResponse:
        """
        Description:  api分组授权用户使用权限
        Summary:  api分组授权用户使用权限
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountApigroupAuthuserResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuser.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_apigroup_authuser_ex_async(
        self,
        request: apigateway_models.MountApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountApigroupAuthuserResponse:
        """
        Description:  api分组授权用户使用权限
        Summary:  api分组授权用户使用权限
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountApigroupAuthuserResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuser.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_apigroup_authuser(
        self,
        request: apigateway_models.UnmountApigroupAuthuserRequest,
    ) -> apigateway_models.UnmountApigroupAuthuserResponse:
        """
        Description:
        api解除用户使用权限
        Summary:  api解除用户使用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_apigroup_authuser_ex(request, headers, runtime)

    async def unmount_apigroup_authuser_async(
        self,
        request: apigateway_models.UnmountApigroupAuthuserRequest,
    ) -> apigateway_models.UnmountApigroupAuthuserResponse:
        """
        Description:
        api解除用户使用权限
        Summary:  api解除用户使用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_apigroup_authuser_ex_async(request, headers, runtime)

    def unmount_apigroup_authuser_ex(
        self,
        request: apigateway_models.UnmountApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountApigroupAuthuserResponse:
        """
        Description:
        api解除用户使用权限
        Summary:  api解除用户使用权限
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountApigroupAuthuserResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuser.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_apigroup_authuser_ex_async(
        self,
        request: apigateway_models.UnmountApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountApigroupAuthuserResponse:
        """
        Description:
        api解除用户使用权限
        Summary:  api解除用户使用权限
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountApigroupAuthuserResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuser.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apigroup_authuser(
        self,
        request: apigateway_models.ListApigroupAuthuserRequest,
    ) -> apigateway_models.ListApigroupAuthuserResponse:
        """
        Description: 查询api分组授权用户分页列表
        Summary: 查询api分组授权用户分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apigroup_authuser_ex(request, headers, runtime)

    async def list_apigroup_authuser_async(
        self,
        request: apigateway_models.ListApigroupAuthuserRequest,
    ) -> apigateway_models.ListApigroupAuthuserResponse:
        """
        Description: 查询api分组授权用户分页列表
        Summary: 查询api分组授权用户分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apigroup_authuser_ex_async(request, headers, runtime)

    def list_apigroup_authuser_ex(
        self,
        request: apigateway_models.ListApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApigroupAuthuserResponse:
        """
        Description: 查询api分组授权用户分页列表
        Summary: 查询api分组授权用户分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApigroupAuthuserResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apigroup_authuser_ex_async(
        self,
        request: apigateway_models.ListApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApigroupAuthuserResponse:
        """
        Description: 查询api分组授权用户分页列表
        Summary: 查询api分组授权用户分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApigroupAuthuserResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apigroup_authuser(
        self,
        request: apigateway_models.DeleteApigroupAuthuserRequest,
    ) -> apigateway_models.DeleteApigroupAuthuserResponse:
        """
        Description: api分组删除用户
        Summary: api分组删除用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apigroup_authuser_ex(request, headers, runtime)

    async def delete_apigroup_authuser_async(
        self,
        request: apigateway_models.DeleteApigroupAuthuserRequest,
    ) -> apigateway_models.DeleteApigroupAuthuserResponse:
        """
        Description: api分组删除用户
        Summary: api分组删除用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apigroup_authuser_ex_async(request, headers, runtime)

    def delete_apigroup_authuser_ex(
        self,
        request: apigateway_models.DeleteApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApigroupAuthuserResponse:
        """
        Description: api分组删除用户
        Summary: api分组删除用户
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApigroupAuthuserResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.authuser.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apigroup_authuser_ex_async(
        self,
        request: apigateway_models.DeleteApigroupAuthuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApigroupAuthuserResponse:
        """
        Description: api分组删除用户
        Summary: api分组删除用户
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApigroupAuthuserResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.authuser.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_api_apigroup(
        self,
        request: apigateway_models.VerifyApiApigroupRequest,
    ) -> apigateway_models.VerifyApiApigroupResponse:
        """
        Description: 校验是否有api分组权限
        Summary: 校验是否有api分组权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_api_apigroup_ex(request, headers, runtime)

    async def verify_api_apigroup_async(
        self,
        request: apigateway_models.VerifyApiApigroupRequest,
    ) -> apigateway_models.VerifyApiApigroupResponse:
        """
        Description: 校验是否有api分组权限
        Summary: 校验是否有api分组权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_api_apigroup_ex_async(request, headers, runtime)

    def verify_api_apigroup_ex(
        self,
        request: apigateway_models.VerifyApiApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.VerifyApiApigroupResponse:
        """
        Description: 校验是否有api分组权限
        Summary: 校验是否有api分组权限
        """
        UtilClient.validate_model(request)
        return apigateway_models.VerifyApiApigroupResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.apigroup.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_api_apigroup_ex_async(
        self,
        request: apigateway_models.VerifyApiApigroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.VerifyApiApigroupResponse:
        """
        Description: 校验是否有api分组权限
        Summary: 校验是否有api分组权限
        """
        UtilClient.validate_model(request)
        return apigateway_models.VerifyApiApigroupResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.apigroup.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_app_authapi(
        self,
        request: apigateway_models.UpdateAppAuthapiRequest,
    ) -> apigateway_models.UpdateAppAuthapiResponse:
        """
        Description: 修改app绑定api加密状态
        Summary: 修改app绑定api加密状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_app_authapi_ex(request, headers, runtime)

    async def update_app_authapi_async(
        self,
        request: apigateway_models.UpdateAppAuthapiRequest,
    ) -> apigateway_models.UpdateAppAuthapiResponse:
        """
        Description: 修改app绑定api加密状态
        Summary: 修改app绑定api加密状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_app_authapi_ex_async(request, headers, runtime)

    def update_app_authapi_ex(
        self,
        request: apigateway_models.UpdateAppAuthapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateAppAuthapiResponse:
        """
        Description: 修改app绑定api加密状态
        Summary: 修改app绑定api加密状态
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateAppAuthapiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.app.authapi.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_app_authapi_ex_async(
        self,
        request: apigateway_models.UpdateAppAuthapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateAppAuthapiResponse:
        """
        Description: 修改app绑定api加密状态
        Summary: 修改app绑定api加密状态
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateAppAuthapiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.app.authapi.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_gwconfig(
        self,
        request: apigateway_models.CreateGwconfigRequest,
    ) -> apigateway_models.CreateGwconfigResponse:
        """
        Description: 配置zone
        Summary: 全局配置zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_gwconfig_ex(request, headers, runtime)

    async def create_gwconfig_async(
        self,
        request: apigateway_models.CreateGwconfigRequest,
    ) -> apigateway_models.CreateGwconfigResponse:
        """
        Description: 配置zone
        Summary: 全局配置zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_gwconfig_ex_async(request, headers, runtime)

    def create_gwconfig_ex(
        self,
        request: apigateway_models.CreateGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateGwconfigResponse:
        """
        Description: 配置zone
        Summary: 全局配置zone
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateGwconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_gwconfig_ex_async(
        self,
        request: apigateway_models.CreateGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateGwconfigResponse:
        """
        Description: 配置zone
        Summary: 全局配置zone
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateGwconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_gwconfig(
        self,
        request: apigateway_models.GetGwconfigRequest,
    ) -> apigateway_models.GetGwconfigResponse:
        """
        Description: 查询全局网关配置
        Summary: 查询全局网关配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_gwconfig_ex(request, headers, runtime)

    async def get_gwconfig_async(
        self,
        request: apigateway_models.GetGwconfigRequest,
    ) -> apigateway_models.GetGwconfigResponse:
        """
        Description: 查询全局网关配置
        Summary: 查询全局网关配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_gwconfig_ex_async(request, headers, runtime)

    def get_gwconfig_ex(
        self,
        request: apigateway_models.GetGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetGwconfigResponse:
        """
        Description: 查询全局网关配置
        Summary: 查询全局网关配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetGwconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_gwconfig_ex_async(
        self,
        request: apigateway_models.GetGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetGwconfigResponse:
        """
        Description: 查询全局网关配置
        Summary: 查询全局网关配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetGwconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_gwconfig(
        self,
        request: apigateway_models.UpdateGwconfigRequest,
    ) -> apigateway_models.UpdateGwconfigResponse:
        """
        Description: 更新全局网关配置
        Summary: 更新全局网关配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_gwconfig_ex(request, headers, runtime)

    async def update_gwconfig_async(
        self,
        request: apigateway_models.UpdateGwconfigRequest,
    ) -> apigateway_models.UpdateGwconfigResponse:
        """
        Description: 更新全局网关配置
        Summary: 更新全局网关配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_gwconfig_ex_async(request, headers, runtime)

    def update_gwconfig_ex(
        self,
        request: apigateway_models.UpdateGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateGwconfigResponse:
        """
        Description: 更新全局网关配置
        Summary: 更新全局网关配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateGwconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_gwconfig_ex_async(
        self,
        request: apigateway_models.UpdateGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateGwconfigResponse:
        """
        Description: 更新全局网关配置
        Summary: 更新全局网关配置
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateGwconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_gwconfig(
        self,
        request: apigateway_models.AllGwconfigRequest,
    ) -> apigateway_models.AllGwconfigResponse:
        """
        Description: 查询全局网关列表
        Summary: 查询全局网关列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_gwconfig_ex(request, headers, runtime)

    async def all_gwconfig_async(
        self,
        request: apigateway_models.AllGwconfigRequest,
    ) -> apigateway_models.AllGwconfigResponse:
        """
        Description: 查询全局网关列表
        Summary: 查询全局网关列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_gwconfig_ex_async(request, headers, runtime)

    def all_gwconfig_ex(
        self,
        request: apigateway_models.AllGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllGwconfigResponse:
        """
        Description: 查询全局网关列表
        Summary: 查询全局网关列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllGwconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_gwconfig_ex_async(
        self,
        request: apigateway_models.AllGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllGwconfigResponse:
        """
        Description: 查询全局网关列表
        Summary: 查询全局网关列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllGwconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_instance(
        self,
        request: apigateway_models.GetInstanceRequest,
    ) -> apigateway_models.GetInstanceResponse:
        """
        Description: 查询instance_id
        Summary: 查询instance_id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_instance_ex(request, headers, runtime)

    async def get_instance_async(
        self,
        request: apigateway_models.GetInstanceRequest,
    ) -> apigateway_models.GetInstanceResponse:
        """
        Description: 查询instance_id
        Summary: 查询instance_id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_instance_ex_async(request, headers, runtime)

    def get_instance_ex(
        self,
        request: apigateway_models.GetInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetInstanceResponse:
        """
        Description: 查询instance_id
        Summary: 查询instance_id
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetInstanceResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_instance_ex_async(
        self,
        request: apigateway_models.GetInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetInstanceResponse:
        """
        Description: 查询instance_id
        Summary: 查询instance_id
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetInstanceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_gwconfig_delete(
        self,
        request: apigateway_models.CheckGwconfigDeleteRequest,
    ) -> apigateway_models.CheckGwconfigDeleteResponse:
        """
        Description: 删除zone、网关效验
        Summary: 删除zone、网关效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_gwconfig_delete_ex(request, headers, runtime)

    async def check_gwconfig_delete_async(
        self,
        request: apigateway_models.CheckGwconfigDeleteRequest,
    ) -> apigateway_models.CheckGwconfigDeleteResponse:
        """
        Description: 删除zone、网关效验
        Summary: 删除zone、网关效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_gwconfig_delete_ex_async(request, headers, runtime)

    def check_gwconfig_delete_ex(
        self,
        request: apigateway_models.CheckGwconfigDeleteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckGwconfigDeleteResponse:
        """
        Description: 删除zone、网关效验
        Summary: 删除zone、网关效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckGwconfigDeleteResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.delete.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_gwconfig_delete_ex_async(
        self,
        request: apigateway_models.CheckGwconfigDeleteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckGwconfigDeleteResponse:
        """
        Description: 删除zone、网关效验
        Summary: 删除zone、网关效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckGwconfigDeleteResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.delete.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_gwconfig_update(
        self,
        request: apigateway_models.CheckGwconfigUpdateRequest,
    ) -> apigateway_models.CheckGwconfigUpdateResponse:
        """
        Description: 更新zone、网关效验
        Summary: 更新zone、网关效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_gwconfig_update_ex(request, headers, runtime)

    async def check_gwconfig_update_async(
        self,
        request: apigateway_models.CheckGwconfigUpdateRequest,
    ) -> apigateway_models.CheckGwconfigUpdateResponse:
        """
        Description: 更新zone、网关效验
        Summary: 更新zone、网关效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_gwconfig_update_ex_async(request, headers, runtime)

    def check_gwconfig_update_ex(
        self,
        request: apigateway_models.CheckGwconfigUpdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckGwconfigUpdateResponse:
        """
        Description: 更新zone、网关效验
        Summary: 更新zone、网关效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckGwconfigUpdateResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.update.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_gwconfig_update_ex_async(
        self,
        request: apigateway_models.CheckGwconfigUpdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckGwconfigUpdateResponse:
        """
        Description: 更新zone、网关效验
        Summary: 更新zone、网关效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckGwconfigUpdateResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.update.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_api_gwconfig(
        self,
        request: apigateway_models.CreateApiGwconfigRequest,
    ) -> apigateway_models.CreateApiGwconfigResponse:
        """
        Description: 创建跨云互通代理模式
        Summary: 创建跨云互通代理模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_api_gwconfig_ex(request, headers, runtime)

    async def create_api_gwconfig_async(
        self,
        request: apigateway_models.CreateApiGwconfigRequest,
    ) -> apigateway_models.CreateApiGwconfigResponse:
        """
        Description: 创建跨云互通代理模式
        Summary: 创建跨云互通代理模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_api_gwconfig_ex_async(request, headers, runtime)

    def create_api_gwconfig_ex(
        self,
        request: apigateway_models.CreateApiGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApiGwconfigResponse:
        """
        Description: 创建跨云互通代理模式
        Summary: 创建跨云互通代理模式
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApiGwconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.gwconfig.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_api_gwconfig_ex_async(
        self,
        request: apigateway_models.CreateApiGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApiGwconfigResponse:
        """
        Description: 创建跨云互通代理模式
        Summary: 创建跨云互通代理模式
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApiGwconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.gwconfig.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api_gwconfig(
        self,
        request: apigateway_models.UpdateApiGwconfigRequest,
    ) -> apigateway_models.UpdateApiGwconfigResponse:
        """
        Description: 更新跨云互通API
        Summary: 更新跨云互通API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_gwconfig_ex(request, headers, runtime)

    async def update_api_gwconfig_async(
        self,
        request: apigateway_models.UpdateApiGwconfigRequest,
    ) -> apigateway_models.UpdateApiGwconfigResponse:
        """
        Description: 更新跨云互通API
        Summary: 更新跨云互通API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_gwconfig_ex_async(request, headers, runtime)

    def update_api_gwconfig_ex(
        self,
        request: apigateway_models.UpdateApiGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiGwconfigResponse:
        """
        Description: 更新跨云互通API
        Summary: 更新跨云互通API
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiGwconfigResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.gwconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_gwconfig_ex_async(
        self,
        request: apigateway_models.UpdateApiGwconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiGwconfigResponse:
        """
        Description: 更新跨云互通API
        Summary: 更新跨云互通API
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiGwconfigResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.gwconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_api(
        self,
        request: apigateway_models.CheckApiRequest,
    ) -> apigateway_models.CheckApiResponse:
        """
        Description: 录入api时的参数效验
        Summary: 录入api时的参数效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_api_ex(request, headers, runtime)

    async def check_api_async(
        self,
        request: apigateway_models.CheckApiRequest,
    ) -> apigateway_models.CheckApiResponse:
        """
        Description: 录入api时的参数效验
        Summary: 录入api时的参数效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_api_ex_async(request, headers, runtime)

    def check_api_ex(
        self,
        request: apigateway_models.CheckApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckApiResponse:
        """
        Description: 录入api时的参数效验
        Summary: 录入api时的参数效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_api_ex_async(
        self,
        request: apigateway_models.CheckApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckApiResponse:
        """
        Description: 录入api时的参数效验
        Summary: 录入api时的参数效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_sys_update(
        self,
        request: apigateway_models.CheckSysUpdateRequest,
    ) -> apigateway_models.CheckSysUpdateResponse:
        """
        Description: 系统集群修改校验
        Summary: 系统集群修改校验是否可修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_sys_update_ex(request, headers, runtime)

    async def check_sys_update_async(
        self,
        request: apigateway_models.CheckSysUpdateRequest,
    ) -> apigateway_models.CheckSysUpdateResponse:
        """
        Description: 系统集群修改校验
        Summary: 系统集群修改校验是否可修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_sys_update_ex_async(request, headers, runtime)

    def check_sys_update_ex(
        self,
        request: apigateway_models.CheckSysUpdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckSysUpdateResponse:
        """
        Description: 系统集群修改校验
        Summary: 系统集群修改校验是否可修改
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckSysUpdateResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.sys.update.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_sys_update_ex_async(
        self,
        request: apigateway_models.CheckSysUpdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckSysUpdateResponse:
        """
        Description: 系统集群修改校验
        Summary: 系统集群修改校验是否可修改
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckSysUpdateResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.sys.update.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_api_historyversionapi(
        self,
        request: apigateway_models.GetApiHistoryversionapiRequest,
    ) -> apigateway_models.GetApiHistoryversionapiResponse:
        """
        Description: api查看历史版本信息
        Summary: api查看历史版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_api_historyversionapi_ex(request, headers, runtime)

    async def get_api_historyversionapi_async(
        self,
        request: apigateway_models.GetApiHistoryversionapiRequest,
    ) -> apigateway_models.GetApiHistoryversionapiResponse:
        """
        Description: api查看历史版本信息
        Summary: api查看历史版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_api_historyversionapi_ex_async(request, headers, runtime)

    def get_api_historyversionapi_ex(
        self,
        request: apigateway_models.GetApiHistoryversionapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiHistoryversionapiResponse:
        """
        Description: api查看历史版本信息
        Summary: api查看历史版本信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiHistoryversionapiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.historyversionapi.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_api_historyversionapi_ex_async(
        self,
        request: apigateway_models.GetApiHistoryversionapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiHistoryversionapiResponse:
        """
        Description: api查看历史版本信息
        Summary: api查看历史版本信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiHistoryversionapiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.historyversionapi.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_strategy(
        self,
        request: apigateway_models.AllStrategyRequest,
    ) -> apigateway_models.AllStrategyResponse:
        """
        Description: 查询策略列表
        Summary: 查询策略列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_strategy_ex(request, headers, runtime)

    async def all_strategy_async(
        self,
        request: apigateway_models.AllStrategyRequest,
    ) -> apigateway_models.AllStrategyResponse:
        """
        Description: 查询策略列表
        Summary: 查询策略列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_strategy_ex_async(request, headers, runtime)

    def all_strategy_ex(
        self,
        request: apigateway_models.AllStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllStrategyResponse:
        """
        Description: 查询策略列表
        Summary: 查询策略列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_strategy_ex_async(
        self,
        request: apigateway_models.AllStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllStrategyResponse:
        """
        Description: 查询策略列表
        Summary: 查询策略列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_strategy_api(
        self,
        request: apigateway_models.AllStrategyApiRequest,
    ) -> apigateway_models.AllStrategyApiResponse:
        """
        Description: 根据strategyID查询API列表
        Summary: 根据strategyID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_strategy_api_ex(request, headers, runtime)

    async def all_strategy_api_async(
        self,
        request: apigateway_models.AllStrategyApiRequest,
    ) -> apigateway_models.AllStrategyApiResponse:
        """
        Description: 根据strategyID查询API列表
        Summary: 根据strategyID查询API列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_strategy_api_ex_async(request, headers, runtime)

    def all_strategy_api_ex(
        self,
        request: apigateway_models.AllStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllStrategyApiResponse:
        """
        Description: 根据strategyID查询API列表
        Summary: 根据strategyID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllStrategyApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_strategy_api_ex_async(
        self,
        request: apigateway_models.AllStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllStrategyApiResponse:
        """
        Description: 根据strategyID查询API列表
        Summary: 根据strategyID查询API列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllStrategyApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.api.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_strategy_api(
        self,
        request: apigateway_models.ListStrategyApiRequest,
    ) -> apigateway_models.ListStrategyApiResponse:
        """
        Description: 根据strategyID查询API分页
        Summary: 根据strategyID查询API分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_strategy_api_ex(request, headers, runtime)

    async def list_strategy_api_async(
        self,
        request: apigateway_models.ListStrategyApiRequest,
    ) -> apigateway_models.ListStrategyApiResponse:
        """
        Description: 根据strategyID查询API分页
        Summary: 根据strategyID查询API分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_strategy_api_ex_async(request, headers, runtime)

    def list_strategy_api_ex(
        self,
        request: apigateway_models.ListStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListStrategyApiResponse:
        """
        Description: 根据strategyID查询API分页
        Summary: 根据strategyID查询API分页
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListStrategyApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_strategy_api_ex_async(
        self,
        request: apigateway_models.ListStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListStrategyApiResponse:
        """
        Description: 根据strategyID查询API分页
        Summary: 根据strategyID查询API分页
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListStrategyApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.api.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_strategy_api(
        self,
        request: apigateway_models.MountStrategyApiRequest,
    ) -> apigateway_models.MountStrategyApiResponse:
        """
        Description:  根据strategy ID绑定API
        Summary:  根据strategy ID绑定API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_strategy_api_ex(request, headers, runtime)

    async def mount_strategy_api_async(
        self,
        request: apigateway_models.MountStrategyApiRequest,
    ) -> apigateway_models.MountStrategyApiResponse:
        """
        Description:  根据strategy ID绑定API
        Summary:  根据strategy ID绑定API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_strategy_api_ex_async(request, headers, runtime)

    def mount_strategy_api_ex(
        self,
        request: apigateway_models.MountStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountStrategyApiResponse:
        """
        Description:  根据strategy ID绑定API
        Summary:  根据strategy ID绑定API
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountStrategyApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_strategy_api_ex_async(
        self,
        request: apigateway_models.MountStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.MountStrategyApiResponse:
        """
        Description:  根据strategy ID绑定API
        Summary:  根据strategy ID绑定API
        """
        UtilClient.validate_model(request)
        return apigateway_models.MountStrategyApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.api.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_strategy_api(
        self,
        request: apigateway_models.UnmountStrategyApiRequest,
    ) -> apigateway_models.UnmountStrategyApiResponse:
        """
        Description: 根据strategyID 解绑API
        Summary: 根据strategyID 解绑API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_strategy_api_ex(request, headers, runtime)

    async def unmount_strategy_api_async(
        self,
        request: apigateway_models.UnmountStrategyApiRequest,
    ) -> apigateway_models.UnmountStrategyApiResponse:
        """
        Description: 根据strategyID 解绑API
        Summary: 根据strategyID 解绑API
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_strategy_api_ex_async(request, headers, runtime)

    def unmount_strategy_api_ex(
        self,
        request: apigateway_models.UnmountStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountStrategyApiResponse:
        """
        Description: 根据strategyID 解绑API
        Summary: 根据strategyID 解绑API
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountStrategyApiResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_strategy_api_ex_async(
        self,
        request: apigateway_models.UnmountStrategyApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UnmountStrategyApiResponse:
        """
        Description: 根据strategyID 解绑API
        Summary: 根据strategyID 解绑API
        """
        UtilClient.validate_model(request)
        return apigateway_models.UnmountStrategyApiResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.api.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_strategy(
        self,
        request: apigateway_models.CreateStrategyRequest,
    ) -> apigateway_models.CreateStrategyResponse:
        """
        Description:  创建策略
        Summary:  创建策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_strategy_ex(request, headers, runtime)

    async def create_strategy_async(
        self,
        request: apigateway_models.CreateStrategyRequest,
    ) -> apigateway_models.CreateStrategyResponse:
        """
        Description:  创建策略
        Summary:  创建策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_strategy_ex_async(request, headers, runtime)

    def create_strategy_ex(
        self,
        request: apigateway_models.CreateStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateStrategyResponse:
        """
        Description:  创建策略
        Summary:  创建策略
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_strategy_ex_async(
        self,
        request: apigateway_models.CreateStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateStrategyResponse:
        """
        Description:  创建策略
        Summary:  创建策略
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_strategy(
        self,
        request: apigateway_models.DeleteStrategyRequest,
    ) -> apigateway_models.DeleteStrategyResponse:
        """
        Description: 删除策略
        Summary: 删除策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_strategy_ex(request, headers, runtime)

    async def delete_strategy_async(
        self,
        request: apigateway_models.DeleteStrategyRequest,
    ) -> apigateway_models.DeleteStrategyResponse:
        """
        Description: 删除策略
        Summary: 删除策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_strategy_ex_async(request, headers, runtime)

    def delete_strategy_ex(
        self,
        request: apigateway_models.DeleteStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteStrategyResponse:
        """
        Description: 删除策略
        Summary: 删除策略
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_strategy_ex_async(
        self,
        request: apigateway_models.DeleteStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteStrategyResponse:
        """
        Description: 删除策略
        Summary: 删除策略
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_strategy(
        self,
        request: apigateway_models.GetStrategyRequest,
    ) -> apigateway_models.GetStrategyResponse:
        """
        Description: 根据ID查询strategy
        Summary: 根据ID查询strategy
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_strategy_ex(request, headers, runtime)

    async def get_strategy_async(
        self,
        request: apigateway_models.GetStrategyRequest,
    ) -> apigateway_models.GetStrategyResponse:
        """
        Description: 根据ID查询strategy
        Summary: 根据ID查询strategy
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_strategy_ex_async(request, headers, runtime)

    def get_strategy_ex(
        self,
        request: apigateway_models.GetStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetStrategyResponse:
        """
        Description: 根据ID查询strategy
        Summary: 根据ID查询strategy
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_strategy_ex_async(
        self,
        request: apigateway_models.GetStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetStrategyResponse:
        """
        Description: 根据ID查询strategy
        Summary: 根据ID查询strategy
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_strategy(
        self,
        request: apigateway_models.ListStrategyRequest,
    ) -> apigateway_models.ListStrategyResponse:
        """
        Description: 查询strategy分页列表
        Summary: 查询strategy分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_strategy_ex(request, headers, runtime)

    async def list_strategy_async(
        self,
        request: apigateway_models.ListStrategyRequest,
    ) -> apigateway_models.ListStrategyResponse:
        """
        Description: 查询strategy分页列表
        Summary: 查询strategy分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_strategy_ex_async(request, headers, runtime)

    def list_strategy_ex(
        self,
        request: apigateway_models.ListStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListStrategyResponse:
        """
        Description: 查询strategy分页列表
        Summary: 查询strategy分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_strategy_ex_async(
        self,
        request: apigateway_models.ListStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListStrategyResponse:
        """
        Description: 查询strategy分页列表
        Summary: 查询strategy分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_strategy(
        self,
        request: apigateway_models.UpdateStrategyRequest,
    ) -> apigateway_models.UpdateStrategyResponse:
        """
        Description:  编辑strategy
        Summary:  编辑strategy
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_strategy_ex(request, headers, runtime)

    async def update_strategy_async(
        self,
        request: apigateway_models.UpdateStrategyRequest,
    ) -> apigateway_models.UpdateStrategyResponse:
        """
        Description:  编辑strategy
        Summary:  编辑strategy
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_strategy_ex_async(request, headers, runtime)

    def update_strategy_ex(
        self,
        request: apigateway_models.UpdateStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateStrategyResponse:
        """
        Description:  编辑strategy
        Summary:  编辑strategy
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_strategy_ex_async(
        self,
        request: apigateway_models.UpdateStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateStrategyResponse:
        """
        Description:  编辑strategy
        Summary:  编辑strategy
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_home(
        self,
        request: apigateway_models.GetHomeRequest,
    ) -> apigateway_models.GetHomeResponse:
        """
        Description: 查询数量
        Summary: 查询数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_home_ex(request, headers, runtime)

    async def get_home_async(
        self,
        request: apigateway_models.GetHomeRequest,
    ) -> apigateway_models.GetHomeResponse:
        """
        Description: 查询数量
        Summary: 查询数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_home_ex_async(request, headers, runtime)

    def get_home_ex(
        self,
        request: apigateway_models.GetHomeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetHomeResponse:
        """
        Description: 查询数量
        Summary: 查询数量
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetHomeResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.home.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_home_ex_async(
        self,
        request: apigateway_models.GetHomeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetHomeResponse:
        """
        Description: 查询数量
        Summary: 查询数量
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetHomeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.home.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_apigroup_domain(
        self,
        request: apigateway_models.CheckApigroupDomainRequest,
    ) -> apigateway_models.CheckApigroupDomainResponse:
        """
        Description: 录入域名时的效验
        Summary: 录入域名时的效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_apigroup_domain_ex(request, headers, runtime)

    async def check_apigroup_domain_async(
        self,
        request: apigateway_models.CheckApigroupDomainRequest,
    ) -> apigateway_models.CheckApigroupDomainResponse:
        """
        Description: 录入域名时的效验
        Summary: 录入域名时的效验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_apigroup_domain_ex_async(request, headers, runtime)

    def check_apigroup_domain_ex(
        self,
        request: apigateway_models.CheckApigroupDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckApigroupDomainResponse:
        """
        Description: 录入域名时的效验
        Summary: 录入域名时的效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckApigroupDomainResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.domain.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_apigroup_domain_ex_async(
        self,
        request: apigateway_models.CheckApigroupDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CheckApigroupDomainResponse:
        """
        Description: 录入域名时的效验
        Summary: 录入域名时的效验
        """
        UtilClient.validate_model(request)
        return apigateway_models.CheckApigroupDomainResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.domain.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apigroup_domain(
        self,
        request: apigateway_models.GetApigroupDomainRequest,
    ) -> apigateway_models.GetApigroupDomainResponse:
        """
        Description: 查询域名后缀
        Summary: 查询域名后缀
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apigroup_domain_ex(request, headers, runtime)

    async def get_apigroup_domain_async(
        self,
        request: apigateway_models.GetApigroupDomainRequest,
    ) -> apigateway_models.GetApigroupDomainResponse:
        """
        Description: 查询域名后缀
        Summary: 查询域名后缀
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apigroup_domain_ex_async(request, headers, runtime)

    def get_apigroup_domain_ex(
        self,
        request: apigateway_models.GetApigroupDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApigroupDomainResponse:
        """
        Description: 查询域名后缀
        Summary: 查询域名后缀
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApigroupDomainResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apigroup.domain.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apigroup_domain_ex_async(
        self,
        request: apigateway_models.GetApigroupDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApigroupDomainResponse:
        """
        Description: 查询域名后缀
        Summary: 查询域名后缀
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApigroupDomainResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apigroup.domain.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_api_swagger(
        self,
        request: apigateway_models.GetApiSwaggerRequest,
    ) -> apigateway_models.GetApiSwaggerResponse:
        """
        Description: 查看api生成的swagger文档
        Summary: 查看api生成的swagger文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_api_swagger_ex(request, headers, runtime)

    async def get_api_swagger_async(
        self,
        request: apigateway_models.GetApiSwaggerRequest,
    ) -> apigateway_models.GetApiSwaggerResponse:
        """
        Description: 查看api生成的swagger文档
        Summary: 查看api生成的swagger文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_api_swagger_ex_async(request, headers, runtime)

    def get_api_swagger_ex(
        self,
        request: apigateway_models.GetApiSwaggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiSwaggerResponse:
        """
        Description: 查看api生成的swagger文档
        Summary: 查看api生成的swagger文档
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiSwaggerResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.swagger.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_api_swagger_ex_async(
        self,
        request: apigateway_models.GetApiSwaggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiSwaggerResponse:
        """
        Description: 查看api生成的swagger文档
        Summary: 查看api生成的swagger文档
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiSwaggerResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.swagger.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_api_swagger(
        self,
        request: apigateway_models.DownloadApiSwaggerRequest,
    ) -> apigateway_models.DownloadApiSwaggerResponse:
        """
        Description: api文档下载
        Summary: api文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_api_swagger_ex(request, headers, runtime)

    async def download_api_swagger_async(
        self,
        request: apigateway_models.DownloadApiSwaggerRequest,
    ) -> apigateway_models.DownloadApiSwaggerResponse:
        """
        Description: api文档下载
        Summary: api文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_api_swagger_ex_async(request, headers, runtime)

    def download_api_swagger_ex(
        self,
        request: apigateway_models.DownloadApiSwaggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DownloadApiSwaggerResponse:
        """
        Description: api文档下载
        Summary: api文档下载
        """
        UtilClient.validate_model(request)
        return apigateway_models.DownloadApiSwaggerResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.api.swagger.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_api_swagger_ex_async(
        self,
        request: apigateway_models.DownloadApiSwaggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DownloadApiSwaggerResponse:
        """
        Description: api文档下载
        Summary: api文档下载
        """
        UtilClient.validate_model(request)
        return apigateway_models.DownloadApiSwaggerResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.api.swagger.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_apimodel_codegen(
        self,
        request: apigateway_models.DownloadApimodelCodegenRequest,
    ) -> apigateway_models.DownloadApimodelCodegenResponse:
        """
        Description: 代码生成
        Summary: 代码生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_apimodel_codegen_ex(request, headers, runtime)

    async def download_apimodel_codegen_async(
        self,
        request: apigateway_models.DownloadApimodelCodegenRequest,
    ) -> apigateway_models.DownloadApimodelCodegenResponse:
        """
        Description: 代码生成
        Summary: 代码生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_apimodel_codegen_ex_async(request, headers, runtime)

    def download_apimodel_codegen_ex(
        self,
        request: apigateway_models.DownloadApimodelCodegenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DownloadApimodelCodegenResponse:
        """
        Description: 代码生成
        Summary: 代码生成
        """
        UtilClient.validate_model(request)
        return apigateway_models.DownloadApimodelCodegenResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.codegen.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_apimodel_codegen_ex_async(
        self,
        request: apigateway_models.DownloadApimodelCodegenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DownloadApimodelCodegenResponse:
        """
        Description: 代码生成
        Summary: 代码生成
        """
        UtilClient.validate_model(request)
        return apigateway_models.DownloadApimodelCodegenResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.codegen.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_gwconfig_gatewayswitch(
        self,
        request: apigateway_models.GetGwconfigGatewayswitchRequest,
    ) -> apigateway_models.GetGwconfigGatewayswitchResponse:
        """
        Description: 获取双网模块开关
        Summary: 获取双网模块开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_gwconfig_gatewayswitch_ex(request, headers, runtime)

    async def get_gwconfig_gatewayswitch_async(
        self,
        request: apigateway_models.GetGwconfigGatewayswitchRequest,
    ) -> apigateway_models.GetGwconfigGatewayswitchResponse:
        """
        Description: 获取双网模块开关
        Summary: 获取双网模块开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_gwconfig_gatewayswitch_ex_async(request, headers, runtime)

    def get_gwconfig_gatewayswitch_ex(
        self,
        request: apigateway_models.GetGwconfigGatewayswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetGwconfigGatewayswitchResponse:
        """
        Description: 获取双网模块开关
        Summary: 获取双网模块开关
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetGwconfigGatewayswitchResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.gatewayswitch.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_gwconfig_gatewayswitch_ex_async(
        self,
        request: apigateway_models.GetGwconfigGatewayswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetGwconfigGatewayswitchResponse:
        """
        Description: 获取双网模块开关
        Summary: 获取双网模块开关
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetGwconfigGatewayswitchResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.gatewayswitch.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_registry(
        self,
        request: apigateway_models.AllRegistryRequest,
    ) -> apigateway_models.AllRegistryResponse:
        """
        Description: 查询注册中心列表
        Summary: 查询注册中心列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_registry_ex(request, headers, runtime)

    async def all_registry_async(
        self,
        request: apigateway_models.AllRegistryRequest,
    ) -> apigateway_models.AllRegistryResponse:
        """
        Description: 查询注册中心列表
        Summary: 查询注册中心列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_registry_ex_async(request, headers, runtime)

    def all_registry_ex(
        self,
        request: apigateway_models.AllRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRegistryResponse:
        """
        Description: 查询注册中心列表
        Summary: 查询注册中心列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRegistryResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_registry_ex_async(
        self,
        request: apigateway_models.AllRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRegistryResponse:
        """
        Description: 查询注册中心列表
        Summary: 查询注册中心列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRegistryResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_registry_sys(
        self,
        request: apigateway_models.AllRegistrySysRequest,
    ) -> apigateway_models.AllRegistrySysResponse:
        """
        Description: 查询注册中心绑定的集群列表
        Summary: 查询注册中心绑定的集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_registry_sys_ex(request, headers, runtime)

    async def all_registry_sys_async(
        self,
        request: apigateway_models.AllRegistrySysRequest,
    ) -> apigateway_models.AllRegistrySysResponse:
        """
        Description: 查询注册中心绑定的集群列表
        Summary: 查询注册中心绑定的集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_registry_sys_ex_async(request, headers, runtime)

    def all_registry_sys_ex(
        self,
        request: apigateway_models.AllRegistrySysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRegistrySysResponse:
        """
        Description: 查询注册中心绑定的集群列表
        Summary: 查询注册中心绑定的集群列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRegistrySysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.sys.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_registry_sys_ex_async(
        self,
        request: apigateway_models.AllRegistrySysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllRegistrySysResponse:
        """
        Description: 查询注册中心绑定的集群列表
        Summary: 查询注册中心绑定的集群列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllRegistrySysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.sys.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_registry_sys(
        self,
        request: apigateway_models.ListRegistrySysRequest,
    ) -> apigateway_models.ListRegistrySysResponse:
        """
        Description: 分页查询注册中心绑定的集群列表
        Summary: 分页查询注册中心绑定的集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_registry_sys_ex(request, headers, runtime)

    async def list_registry_sys_async(
        self,
        request: apigateway_models.ListRegistrySysRequest,
    ) -> apigateway_models.ListRegistrySysResponse:
        """
        Description: 分页查询注册中心绑定的集群列表
        Summary: 分页查询注册中心绑定的集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_registry_sys_ex_async(request, headers, runtime)

    def list_registry_sys_ex(
        self,
        request: apigateway_models.ListRegistrySysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRegistrySysResponse:
        """
        Description: 分页查询注册中心绑定的集群列表
        Summary: 分页查询注册中心绑定的集群列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRegistrySysResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.sys.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_registry_sys_ex_async(
        self,
        request: apigateway_models.ListRegistrySysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRegistrySysResponse:
        """
        Description: 分页查询注册中心绑定的集群列表
        Summary: 分页查询注册中心绑定的集群列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRegistrySysResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.sys.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_registry(
        self,
        request: apigateway_models.CreateRegistryRequest,
    ) -> apigateway_models.CreateRegistryResponse:
        """
        Description: 创建注册中心
        Summary: 创建注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_registry_ex(request, headers, runtime)

    async def create_registry_async(
        self,
        request: apigateway_models.CreateRegistryRequest,
    ) -> apigateway_models.CreateRegistryResponse:
        """
        Description: 创建注册中心
        Summary: 创建注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_registry_ex_async(request, headers, runtime)

    def create_registry_ex(
        self,
        request: apigateway_models.CreateRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateRegistryResponse:
        """
        Description: 创建注册中心
        Summary: 创建注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateRegistryResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_registry_ex_async(
        self,
        request: apigateway_models.CreateRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateRegistryResponse:
        """
        Description: 创建注册中心
        Summary: 创建注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateRegistryResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_registry(
        self,
        request: apigateway_models.DeleteRegistryRequest,
    ) -> apigateway_models.DeleteRegistryResponse:
        """
        Description:  通过ID删除注册中心
        Summary:  通过ID删除注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_registry_ex(request, headers, runtime)

    async def delete_registry_async(
        self,
        request: apigateway_models.DeleteRegistryRequest,
    ) -> apigateway_models.DeleteRegistryResponse:
        """
        Description:  通过ID删除注册中心
        Summary:  通过ID删除注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_registry_ex_async(request, headers, runtime)

    def delete_registry_ex(
        self,
        request: apigateway_models.DeleteRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteRegistryResponse:
        """
        Description:  通过ID删除注册中心
        Summary:  通过ID删除注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteRegistryResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_registry_ex_async(
        self,
        request: apigateway_models.DeleteRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteRegistryResponse:
        """
        Description:  通过ID删除注册中心
        Summary:  通过ID删除注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteRegistryResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_registry(
        self,
        request: apigateway_models.GetRegistryRequest,
    ) -> apigateway_models.GetRegistryResponse:
        """
        Description: 通过ID查询注册中心
        Summary: 通过ID查询注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_registry_ex(request, headers, runtime)

    async def get_registry_async(
        self,
        request: apigateway_models.GetRegistryRequest,
    ) -> apigateway_models.GetRegistryResponse:
        """
        Description: 通过ID查询注册中心
        Summary: 通过ID查询注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_registry_ex_async(request, headers, runtime)

    def get_registry_ex(
        self,
        request: apigateway_models.GetRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetRegistryResponse:
        """
        Description: 通过ID查询注册中心
        Summary: 通过ID查询注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetRegistryResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_registry_ex_async(
        self,
        request: apigateway_models.GetRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetRegistryResponse:
        """
        Description: 通过ID查询注册中心
        Summary: 通过ID查询注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetRegistryResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_registry(
        self,
        request: apigateway_models.ListRegistryRequest,
    ) -> apigateway_models.ListRegistryResponse:
        """
        Description:  查询注册中心分页列表
        Summary:  查询注册中心分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_registry_ex(request, headers, runtime)

    async def list_registry_async(
        self,
        request: apigateway_models.ListRegistryRequest,
    ) -> apigateway_models.ListRegistryResponse:
        """
        Description:  查询注册中心分页列表
        Summary:  查询注册中心分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_registry_ex_async(request, headers, runtime)

    def list_registry_ex(
        self,
        request: apigateway_models.ListRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRegistryResponse:
        """
        Description:  查询注册中心分页列表
        Summary:  查询注册中心分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRegistryResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_registry_ex_async(
        self,
        request: apigateway_models.ListRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListRegistryResponse:
        """
        Description:  查询注册中心分页列表
        Summary:  查询注册中心分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListRegistryResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_registry(
        self,
        request: apigateway_models.UpdateRegistryRequest,
    ) -> apigateway_models.UpdateRegistryResponse:
        """
        Description: 更新注册中心
        Summary: 更新注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_registry_ex(request, headers, runtime)

    async def update_registry_async(
        self,
        request: apigateway_models.UpdateRegistryRequest,
    ) -> apigateway_models.UpdateRegistryResponse:
        """
        Description: 更新注册中心
        Summary: 更新注册中心
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_registry_ex_async(request, headers, runtime)

    def update_registry_ex(
        self,
        request: apigateway_models.UpdateRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateRegistryResponse:
        """
        Description: 更新注册中心
        Summary: 更新注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateRegistryResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.registry.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_registry_ex_async(
        self,
        request: apigateway_models.UpdateRegistryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateRegistryResponse:
        """
        Description: 更新注册中心
        Summary: 更新注册中心
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateRegistryResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.registry.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_apiflow(
        self,
        request: apigateway_models.ExecApiflowRequest,
    ) -> apigateway_models.ExecApiflowResponse:
        """
        Description: 执行流程编排
        Summary: 执行流程编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_apiflow_ex(request, headers, runtime)

    async def exec_apiflow_async(
        self,
        request: apigateway_models.ExecApiflowRequest,
    ) -> apigateway_models.ExecApiflowResponse:
        """
        Description: 执行流程编排
        Summary: 执行流程编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_apiflow_ex_async(request, headers, runtime)

    def exec_apiflow_ex(
        self,
        request: apigateway_models.ExecApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExecApiflowResponse:
        """
        Description: 执行流程编排
        Summary: 执行流程编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExecApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_apiflow_ex_async(
        self,
        request: apigateway_models.ExecApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ExecApiflowResponse:
        """
        Description: 执行流程编排
        Summary: 执行流程编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.ExecApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apiflow(
        self,
        request: apigateway_models.DeleteApiflowRequest,
    ) -> apigateway_models.DeleteApiflowResponse:
        """
        Description: 通过ID删除编排
        Summary: 通过ID删除编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apiflow_ex(request, headers, runtime)

    async def delete_apiflow_async(
        self,
        request: apigateway_models.DeleteApiflowRequest,
    ) -> apigateway_models.DeleteApiflowResponse:
        """
        Description: 通过ID删除编排
        Summary: 通过ID删除编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apiflow_ex_async(request, headers, runtime)

    def delete_apiflow_ex(
        self,
        request: apigateway_models.DeleteApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApiflowResponse:
        """
        Description: 通过ID删除编排
        Summary: 通过ID删除编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apiflow_ex_async(
        self,
        request: apigateway_models.DeleteApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.DeleteApiflowResponse:
        """
        Description: 通过ID删除编排
        Summary: 通过ID删除编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.DeleteApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_apiflow(
        self,
        request: apigateway_models.AllApiflowRequest,
    ) -> apigateway_models.AllApiflowResponse:
        """
        Description: 查询全部编排列表
        Summary: 查询全部编排列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_apiflow_ex(request, headers, runtime)

    async def all_apiflow_async(
        self,
        request: apigateway_models.AllApiflowRequest,
    ) -> apigateway_models.AllApiflowResponse:
        """
        Description: 查询全部编排列表
        Summary: 查询全部编排列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_apiflow_ex_async(request, headers, runtime)

    def all_apiflow_ex(
        self,
        request: apigateway_models.AllApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApiflowResponse:
        """
        Description: 查询全部编排列表
        Summary: 查询全部编排列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_apiflow_ex_async(
        self,
        request: apigateway_models.AllApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.AllApiflowResponse:
        """
        Description: 查询全部编排列表
        Summary: 查询全部编排列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.AllApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apiflow(
        self,
        request: apigateway_models.ListApiflowRequest,
    ) -> apigateway_models.ListApiflowResponse:
        """
        Description: 查询编排分页列表
        Summary: 查询编排分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apiflow_ex(request, headers, runtime)

    async def list_apiflow_async(
        self,
        request: apigateway_models.ListApiflowRequest,
    ) -> apigateway_models.ListApiflowResponse:
        """
        Description: 查询编排分页列表
        Summary: 查询编排分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apiflow_ex_async(request, headers, runtime)

    def list_apiflow_ex(
        self,
        request: apigateway_models.ListApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApiflowResponse:
        """
        Description: 查询编排分页列表
        Summary: 查询编排分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apiflow_ex_async(
        self,
        request: apigateway_models.ListApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ListApiflowResponse:
        """
        Description: 查询编排分页列表
        Summary: 查询编排分页列表
        """
        UtilClient.validate_model(request)
        return apigateway_models.ListApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apiflow(
        self,
        request: apigateway_models.CreateApiflowRequest,
    ) -> apigateway_models.CreateApiflowResponse:
        """
        Description: 创建API形式的编排
        Summary: 创建API形式的编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apiflow_ex(request, headers, runtime)

    async def create_apiflow_async(
        self,
        request: apigateway_models.CreateApiflowRequest,
    ) -> apigateway_models.CreateApiflowResponse:
        """
        Description: 创建API形式的编排
        Summary: 创建API形式的编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apiflow_ex_async(request, headers, runtime)

    def create_apiflow_ex(
        self,
        request: apigateway_models.CreateApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApiflowResponse:
        """
        Description: 创建API形式的编排
        Summary: 创建API形式的编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apiflow_ex_async(
        self,
        request: apigateway_models.CreateApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.CreateApiflowResponse:
        """
        Description: 创建API形式的编排
        Summary: 创建API形式的编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.CreateApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apiflow(
        self,
        request: apigateway_models.GetApiflowRequest,
    ) -> apigateway_models.GetApiflowResponse:
        """
        Description: 通过ID查询编排
        Summary: 通过ID查询编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apiflow_ex(request, headers, runtime)

    async def get_apiflow_async(
        self,
        request: apigateway_models.GetApiflowRequest,
    ) -> apigateway_models.GetApiflowResponse:
        """
        Description: 通过ID查询编排
        Summary: 通过ID查询编排
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apiflow_ex_async(request, headers, runtime)

    def get_apiflow_ex(
        self,
        request: apigateway_models.GetApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiflowResponse:
        """
        Description: 通过ID查询编排
        Summary: 通过ID查询编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apiflow_ex_async(
        self,
        request: apigateway_models.GetApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApiflowResponse:
        """
        Description: 通过ID查询编排
        Summary: 通过ID查询编排
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apiflow(
        self,
        request: apigateway_models.UpdateApiflowRequest,
    ) -> apigateway_models.UpdateApiflowResponse:
        """
        Description: 更新编排信息
        Summary: 更新编排信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apiflow_ex(request, headers, runtime)

    async def update_apiflow_async(
        self,
        request: apigateway_models.UpdateApiflowRequest,
    ) -> apigateway_models.UpdateApiflowResponse:
        """
        Description: 更新编排信息
        Summary: 更新编排信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apiflow_ex_async(request, headers, runtime)

    def update_apiflow_ex(
        self,
        request: apigateway_models.UpdateApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiflowResponse:
        """
        Description: 更新编排信息
        Summary: 更新编排信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiflowResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apiflow.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apiflow_ex_async(
        self,
        request: apigateway_models.UpdateApiflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.UpdateApiflowResponse:
        """
        Description: 更新编排信息
        Summary: 更新编排信息
        """
        UtilClient.validate_model(request)
        return apigateway_models.UpdateApiflowResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apiflow.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apimodel_json(
        self,
        request: apigateway_models.GetApimodelJsonRequest,
    ) -> apigateway_models.GetApimodelJsonResponse:
        """
        Description: 数据模型转json
        Summary: 数据模型转json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apimodel_json_ex(request, headers, runtime)

    async def get_apimodel_json_async(
        self,
        request: apigateway_models.GetApimodelJsonRequest,
    ) -> apigateway_models.GetApimodelJsonResponse:
        """
        Description: 数据模型转json
        Summary: 数据模型转json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apimodel_json_ex_async(request, headers, runtime)

    def get_apimodel_json_ex(
        self,
        request: apigateway_models.GetApimodelJsonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApimodelJsonResponse:
        """
        Description: 数据模型转json
        Summary: 数据模型转json
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApimodelJsonResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.json.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apimodel_json_ex_async(
        self,
        request: apigateway_models.GetApimodelJsonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetApimodelJsonResponse:
        """
        Description: 数据模型转json
        Summary: 数据模型转json
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetApimodelJsonResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.json.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_apimodel_json(
        self,
        request: apigateway_models.ReplaceApimodelJsonRequest,
    ) -> apigateway_models.ReplaceApimodelJsonResponse:
        """
        Description: 替换成apiflow所需的json
        Summary: 替换成apiflow所需的json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_apimodel_json_ex(request, headers, runtime)

    async def replace_apimodel_json_async(
        self,
        request: apigateway_models.ReplaceApimodelJsonRequest,
    ) -> apigateway_models.ReplaceApimodelJsonResponse:
        """
        Description: 替换成apiflow所需的json
        Summary: 替换成apiflow所需的json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_apimodel_json_ex_async(request, headers, runtime)

    def replace_apimodel_json_ex(
        self,
        request: apigateway_models.ReplaceApimodelJsonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ReplaceApimodelJsonResponse:
        """
        Description: 替换成apiflow所需的json
        Summary: 替换成apiflow所需的json
        """
        UtilClient.validate_model(request)
        return apigateway_models.ReplaceApimodelJsonResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.apimodel.json.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_apimodel_json_ex_async(
        self,
        request: apigateway_models.ReplaceApimodelJsonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.ReplaceApimodelJsonResponse:
        """
        Description: 替换成apiflow所需的json
        Summary: 替换成apiflow所需的json
        """
        UtilClient.validate_model(request)
        return apigateway_models.ReplaceApimodelJsonResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.apimodel.json.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_gwconfig_tripleswitch(
        self,
        request: apigateway_models.GetGwconfigTripleswitchRequest,
    ) -> apigateway_models.GetGwconfigTripleswitchResponse:
        """
        Description: 获取triple协议开关
        Summary: 获取triple协议开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_gwconfig_tripleswitch_ex(request, headers, runtime)

    async def get_gwconfig_tripleswitch_async(
        self,
        request: apigateway_models.GetGwconfigTripleswitchRequest,
    ) -> apigateway_models.GetGwconfigTripleswitchResponse:
        """
        Description: 获取triple协议开关
        Summary: 获取triple协议开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_gwconfig_tripleswitch_ex_async(request, headers, runtime)

    def get_gwconfig_tripleswitch_ex(
        self,
        request: apigateway_models.GetGwconfigTripleswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetGwconfigTripleswitchResponse:
        """
        Description: 获取triple协议开关
        Summary: 获取triple协议开关
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetGwconfigTripleswitchResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.tripleswitch.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_gwconfig_tripleswitch_ex_async(
        self,
        request: apigateway_models.GetGwconfigTripleswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.GetGwconfigTripleswitchResponse:
        """
        Description: 获取triple协议开关
        Summary: 获取triple协议开关
        """
        UtilClient.validate_model(request)
        return apigateway_models.GetGwconfigTripleswitchResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.tripleswitch.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwconfig_tripleswitch(
        self,
        request: apigateway_models.QueryGwconfigTripleswitchRequest,
    ) -> apigateway_models.QueryGwconfigTripleswitchResponse:
        """
        Description: 专有云triple查询开关
        Summary: 专有云triple查询开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwconfig_tripleswitch_ex(request, headers, runtime)

    async def query_gwconfig_tripleswitch_async(
        self,
        request: apigateway_models.QueryGwconfigTripleswitchRequest,
    ) -> apigateway_models.QueryGwconfigTripleswitchResponse:
        """
        Description: 专有云triple查询开关
        Summary: 专有云triple查询开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwconfig_tripleswitch_ex_async(request, headers, runtime)

    def query_gwconfig_tripleswitch_ex(
        self,
        request: apigateway_models.QueryGwconfigTripleswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.QueryGwconfigTripleswitchResponse:
        """
        Description: 专有云triple查询开关
        Summary: 专有云triple查询开关
        """
        UtilClient.validate_model(request)
        return apigateway_models.QueryGwconfigTripleswitchResponse().from_map(
            self.do_request('1.0', 'sofa.apigateway.gwconfig.tripleswitch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwconfig_tripleswitch_ex_async(
        self,
        request: apigateway_models.QueryGwconfigTripleswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> apigateway_models.QueryGwconfigTripleswitchResponse:
        """
        Description: 专有云triple查询开关
        Summary: 专有云triple查询开关
        """
        UtilClient.validate_model(request)
        return apigateway_models.QueryGwconfigTripleswitchResponse().from_map(
            await self.do_request_async('1.0', 'sofa.apigateway.gwconfig.tripleswitch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
