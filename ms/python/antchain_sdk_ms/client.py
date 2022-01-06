# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ms import models as ms_models
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
        config: ms_models.Config,
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
            # 动态资源的属性
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
                    'sdk_version': '3.4.0'
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
            # 动态资源的属性
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
                    'sdk_version': '3.4.0'
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

    def persistpush_ms_ddcs(
        self,
        request: ms_models.PersistpushMsDdcsRequest,
    ) -> ms_models.PersistpushMsDdcsResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.persistpush_ms_ddcs_ex(request, headers, runtime)

    async def persistpush_ms_ddcs_async(
        self,
        request: ms_models.PersistpushMsDdcsRequest,
    ) -> ms_models.PersistpushMsDdcsResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.persistpush_ms_ddcs_ex_async(request, headers, runtime)

    def persistpush_ms_ddcs_ex(
        self,
        request: ms_models.PersistpushMsDdcsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.PersistpushMsDdcsResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        UtilClient.validate_model(request)
        return ms_models.PersistpushMsDdcsResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.persistpush', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def persistpush_ms_ddcs_ex_async(
        self,
        request: ms_models.PersistpushMsDdcsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.PersistpushMsDdcsResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        UtilClient.validate_model(request)
        return ms_models.PersistpushMsDdcsResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.persistpush', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def queryclients_ms_ddcs(
        self,
        request: ms_models.QueryclientsMsDdcsRequest,
    ) -> ms_models.QueryclientsMsDdcsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.queryclients_ms_ddcs_ex(request, headers, runtime)

    async def queryclients_ms_ddcs_async(
        self,
        request: ms_models.QueryclientsMsDdcsRequest,
    ) -> ms_models.QueryclientsMsDdcsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.queryclients_ms_ddcs_ex_async(request, headers, runtime)

    def queryclients_ms_ddcs_ex(
        self,
        request: ms_models.QueryclientsMsDdcsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryclientsMsDdcsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        UtilClient.validate_model(request)
        return ms_models.QueryclientsMsDdcsResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.queryclients', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def queryclients_ms_ddcs_ex_async(
        self,
        request: ms_models.QueryclientsMsDdcsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryclientsMsDdcsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        UtilClient.validate_model(request)
        return ms_models.QueryclientsMsDdcsResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.queryclients', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ms_ddcs_resource(
        self,
        request: ms_models.AddMsDdcsResourceRequest,
    ) -> ms_models.AddMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ms_ddcs_resource_ex(request, headers, runtime)

    async def add_ms_ddcs_resource_async(
        self,
        request: ms_models.AddMsDdcsResourceRequest,
    ) -> ms_models.AddMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ms_ddcs_resource_ex_async(request, headers, runtime)

    def add_ms_ddcs_resource_ex(
        self,
        request: ms_models.AddMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddMsDdcsResourceResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.resource.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ms_ddcs_resource_ex_async(
        self,
        request: ms_models.AddMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddMsDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.resource.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ms_ddcs_resource(
        self,
        request: ms_models.UpdateMsDdcsResourceRequest,
    ) -> ms_models.UpdateMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ms_ddcs_resource_ex(request, headers, runtime)

    async def update_ms_ddcs_resource_async(
        self,
        request: ms_models.UpdateMsDdcsResourceRequest,
    ) -> ms_models.UpdateMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ms_ddcs_resource_ex_async(request, headers, runtime)

    def update_ms_ddcs_resource_ex(
        self,
        request: ms_models.UpdateMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateMsDdcsResourceResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.resource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ms_ddcs_resource_ex_async(
        self,
        request: ms_models.UpdateMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateMsDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.resource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ms_ddcs_resource(
        self,
        request: ms_models.DeleteMsDdcsResourceRequest,
    ) -> ms_models.DeleteMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ms_ddcs_resource_ex(request, headers, runtime)

    async def delete_ms_ddcs_resource_async(
        self,
        request: ms_models.DeleteMsDdcsResourceRequest,
    ) -> ms_models.DeleteMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ms_ddcs_resource_ex_async(request, headers, runtime)

    def delete_ms_ddcs_resource_ex(
        self,
        request: ms_models.DeleteMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteMsDdcsResourceResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.resource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ms_ddcs_resource_ex_async(
        self,
        request: ms_models.DeleteMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteMsDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.resource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ms_ddcs_attribute(
        self,
        request: ms_models.AddMsDdcsAttributeRequest,
    ) -> ms_models.AddMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ms_ddcs_attribute_ex(request, headers, runtime)

    async def add_ms_ddcs_attribute_async(
        self,
        request: ms_models.AddMsDdcsAttributeRequest,
    ) -> ms_models.AddMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ms_ddcs_attribute_ex_async(request, headers, runtime)

    def add_ms_ddcs_attribute_ex(
        self,
        request: ms_models.AddMsDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        UtilClient.validate_model(request)
        return ms_models.AddMsDdcsAttributeResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.attribute.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ms_ddcs_attribute_ex_async(
        self,
        request: ms_models.AddMsDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        UtilClient.validate_model(request)
        return ms_models.AddMsDdcsAttributeResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.attribute.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ms_ddcs_attribute(
        self,
        request: ms_models.UpdateMsDdcsAttributeRequest,
    ) -> ms_models.UpdateMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ms_ddcs_attribute_ex(request, headers, runtime)

    async def update_ms_ddcs_attribute_async(
        self,
        request: ms_models.UpdateMsDdcsAttributeRequest,
    ) -> ms_models.UpdateMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ms_ddcs_attribute_ex_async(request, headers, runtime)

    def update_ms_ddcs_attribute_ex(
        self,
        request: ms_models.UpdateMsDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateMsDdcsAttributeResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.attribute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ms_ddcs_attribute_ex_async(
        self,
        request: ms_models.UpdateMsDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateMsDdcsAttributeResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.attribute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ms_ddcs_attribute(
        self,
        request: ms_models.DeleteMsDdcsAttributeRequest,
    ) -> ms_models.DeleteMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ms_ddcs_attribute_ex(request, headers, runtime)

    async def delete_ms_ddcs_attribute_async(
        self,
        request: ms_models.DeleteMsDdcsAttributeRequest,
    ) -> ms_models.DeleteMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ms_ddcs_attribute_ex_async(request, headers, runtime)

    def delete_ms_ddcs_attribute_ex(
        self,
        request: ms_models.DeleteMsDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteMsDdcsAttributeResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.attribute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ms_ddcs_attribute_ex_async(
        self,
        request: ms_models.DeleteMsDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteMsDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteMsDdcsAttributeResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.attribute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def search_ms_ddcs_resource(
        self,
        request: ms_models.SearchMsDdcsResourceRequest,
    ) -> ms_models.SearchMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.search_ms_ddcs_resource_ex(request, headers, runtime)

    async def search_ms_ddcs_resource_async(
        self,
        request: ms_models.SearchMsDdcsResourceRequest,
    ) -> ms_models.SearchMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.search_ms_ddcs_resource_ex_async(request, headers, runtime)

    def search_ms_ddcs_resource_ex(
        self,
        request: ms_models.SearchMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        UtilClient.validate_model(request)
        return ms_models.SearchMsDdcsResourceResponse().from_map(
            self.do_request('1.0', 'ms.ddcs.resource.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def search_ms_ddcs_resource_ex_async(
        self,
        request: ms_models.SearchMsDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchMsDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        UtilClient.validate_model(request)
        return ms_models.SearchMsDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'ms.ddcs.resource.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ms_dss_task(
        self,
        request: ms_models.AddMsDssTaskRequest,
    ) -> ms_models.AddMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ms_dss_task_ex(request, headers, runtime)

    async def add_ms_dss_task_async(
        self,
        request: ms_models.AddMsDssTaskRequest,
    ) -> ms_models.AddMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ms_dss_task_ex_async(request, headers, runtime)

    def add_ms_dss_task_ex(
        self,
        request: ms_models.AddMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddMsDssTaskResponse().from_map(
            self.do_request('1.0', 'ms.dss.task.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ms_dss_task_ex_async(
        self,
        request: ms_models.AddMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddMsDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'ms.dss.task.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ms_dss_task(
        self,
        request: ms_models.UpdateMsDssTaskRequest,
    ) -> ms_models.UpdateMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ms_dss_task_ex(request, headers, runtime)

    async def update_ms_dss_task_async(
        self,
        request: ms_models.UpdateMsDssTaskRequest,
    ) -> ms_models.UpdateMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ms_dss_task_ex_async(request, headers, runtime)

    def update_ms_dss_task_ex(
        self,
        request: ms_models.UpdateMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateMsDssTaskResponse().from_map(
            self.do_request('1.0', 'ms.dss.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ms_dss_task_ex_async(
        self,
        request: ms_models.UpdateMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateMsDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'ms.dss.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ms_dss_task(
        self,
        request: ms_models.DeleteMsDssTaskRequest,
    ) -> ms_models.DeleteMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ms_dss_task_ex(request, headers, runtime)

    async def delete_ms_dss_task_async(
        self,
        request: ms_models.DeleteMsDssTaskRequest,
    ) -> ms_models.DeleteMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ms_dss_task_ex_async(request, headers, runtime)

    def delete_ms_dss_task_ex(
        self,
        request: ms_models.DeleteMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteMsDssTaskResponse().from_map(
            self.do_request('1.0', 'ms.dss.task.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ms_dss_task_ex_async(
        self,
        request: ms_models.DeleteMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteMsDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'ms.dss.task.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def search_ms_dss_task(
        self,
        request: ms_models.SearchMsDssTaskRequest,
    ) -> ms_models.SearchMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.search_ms_dss_task_ex(request, headers, runtime)

    async def search_ms_dss_task_async(
        self,
        request: ms_models.SearchMsDssTaskRequest,
    ) -> ms_models.SearchMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.search_ms_dss_task_ex_async(request, headers, runtime)

    def search_ms_dss_task_ex(
        self,
        request: ms_models.SearchMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.SearchMsDssTaskResponse().from_map(
            self.do_request('1.0', 'ms.dss.task.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def search_ms_dss_task_ex_async(
        self,
        request: ms_models.SearchMsDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchMsDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.SearchMsDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'ms.dss.task.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ms_dss_task_strategy(
        self,
        request: ms_models.QueryMsDssTaskStrategyRequest,
    ) -> ms_models.QueryMsDssTaskStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ms_dss_task_strategy_ex(request, headers, runtime)

    async def query_ms_dss_task_strategy_async(
        self,
        request: ms_models.QueryMsDssTaskStrategyRequest,
    ) -> ms_models.QueryMsDssTaskStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ms_dss_task_strategy_ex_async(request, headers, runtime)

    def query_ms_dss_task_strategy_ex(
        self,
        request: ms_models.QueryMsDssTaskStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryMsDssTaskStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        UtilClient.validate_model(request)
        return ms_models.QueryMsDssTaskStrategyResponse().from_map(
            self.do_request('1.0', 'ms.dss.task.strategy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ms_dss_task_strategy_ex_async(
        self,
        request: ms_models.QueryMsDssTaskStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryMsDssTaskStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        UtilClient.validate_model(request)
        return ms_models.QueryMsDssTaskStrategyResponse().from_map(
            await self.do_request_async('1.0', 'ms.dss.task.strategy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dss_idc(
        self,
        request: ms_models.ListDssIdcRequest,
    ) -> ms_models.ListDssIdcResponse:
        """
        Description: 微服务-分布式调度任务-机房信息(独占版)
        Summary: 获取部署调度任务的所有机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dss_idc_ex(request, headers, runtime)

    async def list_dss_idc_async(
        self,
        request: ms_models.ListDssIdcRequest,
    ) -> ms_models.ListDssIdcResponse:
        """
        Description: 微服务-分布式调度任务-机房信息(独占版)
        Summary: 获取部署调度任务的所有机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dss_idc_ex_async(request, headers, runtime)

    def list_dss_idc_ex(
        self,
        request: ms_models.ListDssIdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListDssIdcResponse:
        """
        Description: 微服务-分布式调度任务-机房信息(独占版)
        Summary: 获取部署调度任务的所有机房
        """
        UtilClient.validate_model(request)
        return ms_models.ListDssIdcResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.idc.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dss_idc_ex_async(
        self,
        request: ms_models.ListDssIdcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListDssIdcResponse:
        """
        Description: 微服务-分布式调度任务-机房信息(独占版)
        Summary: 获取部署调度任务的所有机房
        """
        UtilClient.validate_model(request)
        return ms_models.ListDssIdcResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.idc.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dss_schedule(
        self,
        request: ms_models.AddDssScheduleRequest,
    ) -> ms_models.AddDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-增加任务(独占版)
        Summary: 独占版添加调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dss_schedule_ex(request, headers, runtime)

    async def add_dss_schedule_async(
        self,
        request: ms_models.AddDssScheduleRequest,
    ) -> ms_models.AddDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-增加任务(独占版)
        Summary: 独占版添加调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dss_schedule_ex_async(request, headers, runtime)

    def add_dss_schedule_ex(
        self,
        request: ms_models.AddDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-增加任务(独占版)
        Summary: 独占版添加调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddDssScheduleResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.schedule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dss_schedule_ex_async(
        self,
        request: ms_models.AddDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-增加任务(独占版)
        Summary: 独占版添加调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddDssScheduleResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.schedule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dss_schedule(
        self,
        request: ms_models.UpdateDssScheduleRequest,
    ) -> ms_models.UpdateDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-更新任务(独占版)
        Summary: 更新调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dss_schedule_ex(request, headers, runtime)

    async def update_dss_schedule_async(
        self,
        request: ms_models.UpdateDssScheduleRequest,
    ) -> ms_models.UpdateDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-更新任务(独占版)
        Summary: 更新调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dss_schedule_ex_async(request, headers, runtime)

    def update_dss_schedule_ex(
        self,
        request: ms_models.UpdateDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-更新任务(独占版)
        Summary: 更新调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDssScheduleResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.schedule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dss_schedule_ex_async(
        self,
        request: ms_models.UpdateDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-更新任务(独占版)
        Summary: 更新调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDssScheduleResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.schedule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dss_schedule(
        self,
        request: ms_models.QueryDssScheduleRequest,
    ) -> ms_models.QueryDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-查询调度任务(独占版)
        Summary: 分页查询调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dss_schedule_ex(request, headers, runtime)

    async def query_dss_schedule_async(
        self,
        request: ms_models.QueryDssScheduleRequest,
    ) -> ms_models.QueryDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-查询调度任务(独占版)
        Summary: 分页查询调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dss_schedule_ex_async(request, headers, runtime)

    def query_dss_schedule_ex(
        self,
        request: ms_models.QueryDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-查询调度任务(独占版)
        Summary: 分页查询调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssScheduleResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.schedule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dss_schedule_ex_async(
        self,
        request: ms_models.QueryDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-查询调度任务(独占版)
        Summary: 分页查询调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssScheduleResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.schedule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def persistpush_ddcs_data(
        self,
        request: ms_models.PersistpushDdcsDataRequest,
    ) -> ms_models.PersistpushDdcsDataResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.persistpush_ddcs_data_ex(request, headers, runtime)

    async def persistpush_ddcs_data_async(
        self,
        request: ms_models.PersistpushDdcsDataRequest,
    ) -> ms_models.PersistpushDdcsDataResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.persistpush_ddcs_data_ex_async(request, headers, runtime)

    def persistpush_ddcs_data_ex(
        self,
        request: ms_models.PersistpushDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.PersistpushDdcsDataResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        UtilClient.validate_model(request)
        return ms_models.PersistpushDdcsDataResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.data.persistpush', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def persistpush_ddcs_data_ex_async(
        self,
        request: ms_models.PersistpushDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.PersistpushDdcsDataResponse:
        """
        Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
        Summary: 动态配置持久化推送
        """
        UtilClient.validate_model(request)
        return ms_models.PersistpushDdcsDataResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.data.persistpush', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ddcs_clients(
        self,
        request: ms_models.QueryDdcsClientsRequest,
    ) -> ms_models.QueryDdcsClientsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ddcs_clients_ex(request, headers, runtime)

    async def query_ddcs_clients_async(
        self,
        request: ms_models.QueryDdcsClientsRequest,
    ) -> ms_models.QueryDdcsClientsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ddcs_clients_ex_async(request, headers, runtime)

    def query_ddcs_clients_ex(
        self,
        request: ms_models.QueryDdcsClientsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsClientsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsClientsResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.clients.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ddcs_clients_ex_async(
        self,
        request: ms_models.QueryDdcsClientsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsClientsResponse:
        """
        Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
        Summary: 查询动态配置订阅客户端
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsClientsResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.clients.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ddcs_resource(
        self,
        request: ms_models.AddDdcsResourceRequest,
    ) -> ms_models.AddDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ddcs_resource_ex(request, headers, runtime)

    async def add_ddcs_resource_async(
        self,
        request: ms_models.AddDdcsResourceRequest,
    ) -> ms_models.AddDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ddcs_resource_ex_async(request, headers, runtime)

    def add_ddcs_resource_ex(
        self,
        request: ms_models.AddDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsResourceResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.resource.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ddcs_resource_ex_async(
        self,
        request: ms_models.AddDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsResourceResponse:
        """
        Description: 微服务-动态配置-添加动态资源
        Summary: 添加 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.resource.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ddcs_resource(
        self,
        request: ms_models.UpdateDdcsResourceRequest,
    ) -> ms_models.UpdateDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ddcs_resource_ex(request, headers, runtime)

    async def update_ddcs_resource_async(
        self,
        request: ms_models.UpdateDdcsResourceRequest,
    ) -> ms_models.UpdateDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ddcs_resource_ex_async(request, headers, runtime)

    def update_ddcs_resource_ex(
        self,
        request: ms_models.UpdateDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsResourceResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.resource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ddcs_resource_ex_async(
        self,
        request: ms_models.UpdateDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsResourceResponse:
        """
        Description: 微服务-动态配置-编辑动态资源
        Summary: 编辑 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.resource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ddcs_resource(
        self,
        request: ms_models.DeleteDdcsResourceRequest,
    ) -> ms_models.DeleteDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ddcs_resource_ex(request, headers, runtime)

    async def delete_ddcs_resource_async(
        self,
        request: ms_models.DeleteDdcsResourceRequest,
    ) -> ms_models.DeleteDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ddcs_resource_ex_async(request, headers, runtime)

    def delete_ddcs_resource_ex(
        self,
        request: ms_models.DeleteDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsResourceResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.resource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ddcs_resource_ex_async(
        self,
        request: ms_models.DeleteDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsResourceResponse:
        """
        Description: 微服务-动态配置-删除动态资源
        Summary: 删除 DDCS 资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.resource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ddcs_attribute(
        self,
        request: ms_models.AddDdcsAttributeRequest,
    ) -> ms_models.AddDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ddcs_attribute_ex(request, headers, runtime)

    async def add_ddcs_attribute_async(
        self,
        request: ms_models.AddDdcsAttributeRequest,
    ) -> ms_models.AddDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ddcs_attribute_ex_async(request, headers, runtime)

    def add_ddcs_attribute_ex(
        self,
        request: ms_models.AddDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsAttributeResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.attribute.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ddcs_attribute_ex_async(
        self,
        request: ms_models.AddDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-添加属性
        Summary: 添加属性
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsAttributeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.attribute.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ddcs_attribute(
        self,
        request: ms_models.UpdateDdcsAttributeRequest,
    ) -> ms_models.UpdateDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ddcs_attribute_ex(request, headers, runtime)

    async def update_ddcs_attribute_async(
        self,
        request: ms_models.UpdateDdcsAttributeRequest,
    ) -> ms_models.UpdateDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ddcs_attribute_ex_async(request, headers, runtime)

    def update_ddcs_attribute_ex(
        self,
        request: ms_models.UpdateDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsAttributeResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.attribute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ddcs_attribute_ex_async(
        self,
        request: ms_models.UpdateDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-编辑属性
        Summary: 编辑属性
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsAttributeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.attribute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ddcs_attribute(
        self,
        request: ms_models.DeleteDdcsAttributeRequest,
    ) -> ms_models.DeleteDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ddcs_attribute_ex(request, headers, runtime)

    async def delete_ddcs_attribute_async(
        self,
        request: ms_models.DeleteDdcsAttributeRequest,
    ) -> ms_models.DeleteDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ddcs_attribute_ex_async(request, headers, runtime)

    def delete_ddcs_attribute_ex(
        self,
        request: ms_models.DeleteDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsAttributeResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.attribute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ddcs_attribute_ex_async(
        self,
        request: ms_models.DeleteDdcsAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsAttributeResponse:
        """
        Description: 微服务-动态配置-删除属性
        Summary: 删除属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsAttributeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.attribute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def search_ddcs_resource(
        self,
        request: ms_models.SearchDdcsResourceRequest,
    ) -> ms_models.SearchDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.search_ddcs_resource_ex(request, headers, runtime)

    async def search_ddcs_resource_async(
        self,
        request: ms_models.SearchDdcsResourceRequest,
    ) -> ms_models.SearchDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.search_ddcs_resource_ex_async(request, headers, runtime)

    def search_ddcs_resource_ex(
        self,
        request: ms_models.SearchDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        UtilClient.validate_model(request)
        return ms_models.SearchDdcsResourceResponse().from_map(
            self.do_request('1.0', 'sofa.ms.ddcs.resource.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def search_ddcs_resource_ex_async(
        self,
        request: ms_models.SearchDdcsResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchDdcsResourceResponse:
        """
        Description: 微服务-动态配置-查找动态配置
        Summary: 查找动态资源
        """
        UtilClient.validate_model(request)
        return ms_models.SearchDdcsResourceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.ddcs.resource.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dss_task(
        self,
        request: ms_models.AddDssTaskRequest,
    ) -> ms_models.AddDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dss_task_ex(request, headers, runtime)

    async def add_dss_task_async(
        self,
        request: ms_models.AddDssTaskRequest,
    ) -> ms_models.AddDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dss_task_ex_async(request, headers, runtime)

    def add_dss_task_ex(
        self,
        request: ms_models.AddDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddDssTaskResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.task.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dss_task_ex_async(
        self,
        request: ms_models.AddDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-添加调度任务
        Summary: 添加调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.task.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dss_task(
        self,
        request: ms_models.UpdateDssTaskRequest,
    ) -> ms_models.UpdateDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dss_task_ex(request, headers, runtime)

    async def update_dss_task_async(
        self,
        request: ms_models.UpdateDssTaskRequest,
    ) -> ms_models.UpdateDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dss_task_ex_async(request, headers, runtime)

    def update_dss_task_ex(
        self,
        request: ms_models.UpdateDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDssTaskResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dss_task_ex_async(
        self,
        request: ms_models.UpdateDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-编辑调度任务
        Summary: 编辑调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dss_task(
        self,
        request: ms_models.DeleteDssTaskRequest,
    ) -> ms_models.DeleteDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dss_task_ex(request, headers, runtime)

    async def delete_dss_task_async(
        self,
        request: ms_models.DeleteDssTaskRequest,
    ) -> ms_models.DeleteDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dss_task_ex_async(request, headers, runtime)

    def delete_dss_task_ex(
        self,
        request: ms_models.DeleteDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDssTaskResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.task.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dss_task_ex_async(
        self,
        request: ms_models.DeleteDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-删除任务
        Summary: 删除调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.task.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def search_dss_task(
        self,
        request: ms_models.SearchDssTaskRequest,
    ) -> ms_models.SearchDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.search_dss_task_ex(request, headers, runtime)

    async def search_dss_task_async(
        self,
        request: ms_models.SearchDssTaskRequest,
    ) -> ms_models.SearchDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.search_dss_task_ex_async(request, headers, runtime)

    def search_dss_task_ex(
        self,
        request: ms_models.SearchDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.SearchDssTaskResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.task.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def search_dss_task_ex_async(
        self,
        request: ms_models.SearchDssTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SearchDssTaskResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务
        Summary: 查找调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.SearchDssTaskResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.task.search', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dss_strategy(
        self,
        request: ms_models.QueryDssStrategyRequest,
    ) -> ms_models.QueryDssStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dss_strategy_ex(request, headers, runtime)

    async def query_dss_strategy_async(
        self,
        request: ms_models.QueryDssStrategyRequest,
    ) -> ms_models.QueryDssStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dss_strategy_ex_async(request, headers, runtime)

    def query_dss_strategy_ex(
        self,
        request: ms_models.QueryDssStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssStrategyResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.strategy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dss_strategy_ex_async(
        self,
        request: ms_models.QueryDssStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssStrategyResponse:
        """
        Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
        Summary: 通过策略名称查询策略
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssStrategyResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.strategy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dss_schedule(
        self,
        request: ms_models.DeleteDssScheduleRequest,
    ) -> ms_models.DeleteDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-删除任务(独占版)
        Summary: 删除调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dss_schedule_ex(request, headers, runtime)

    async def delete_dss_schedule_async(
        self,
        request: ms_models.DeleteDssScheduleRequest,
    ) -> ms_models.DeleteDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-删除任务(独占版)
        Summary: 删除调度任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dss_schedule_ex_async(request, headers, runtime)

    def delete_dss_schedule_ex(
        self,
        request: ms_models.DeleteDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-删除任务(独占版)
        Summary: 删除调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDssScheduleResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.schedule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dss_schedule_ex_async(
        self,
        request: ms_models.DeleteDssScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDssScheduleResponse:
        """
        Description: 微服务-分布式调度任务-删除任务(独占版)
        Summary: 删除调度任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDssScheduleResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.schedule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def execute_dss_switchover(
        self,
        request: ms_models.ExecuteDssSwitchoverRequest,
    ) -> ms_models.ExecuteDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-执行单元切换
        Summary: 定时任务执行单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.execute_dss_switchover_ex(request, headers, runtime)

    async def execute_dss_switchover_async(
        self,
        request: ms_models.ExecuteDssSwitchoverRequest,
    ) -> ms_models.ExecuteDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-执行单元切换
        Summary: 定时任务执行单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.execute_dss_switchover_ex_async(request, headers, runtime)

    def execute_dss_switchover_ex(
        self,
        request: ms_models.ExecuteDssSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExecuteDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-执行单元切换
        Summary: 定时任务执行单元切换
        """
        UtilClient.validate_model(request)
        return ms_models.ExecuteDssSwitchoverResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.switchover.execute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def execute_dss_switchover_ex_async(
        self,
        request: ms_models.ExecuteDssSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExecuteDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-执行单元切换
        Summary: 定时任务执行单元切换
        """
        UtilClient.validate_model(request)
        return ms_models.ExecuteDssSwitchoverResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.switchover.execute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_dss_switchover(
        self,
        request: ms_models.CancelDssSwitchoverRequest,
    ) -> ms_models.CancelDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-取消单元切换
        Summary: 定时任务取消单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_dss_switchover_ex(request, headers, runtime)

    async def cancel_dss_switchover_async(
        self,
        request: ms_models.CancelDssSwitchoverRequest,
    ) -> ms_models.CancelDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-取消单元切换
        Summary: 定时任务取消单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_dss_switchover_ex_async(request, headers, runtime)

    def cancel_dss_switchover_ex(
        self,
        request: ms_models.CancelDssSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.CancelDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-取消单元切换
        Summary: 定时任务取消单元切换
        """
        UtilClient.validate_model(request)
        return ms_models.CancelDssSwitchoverResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.switchover.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_dss_switchover_ex_async(
        self,
        request: ms_models.CancelDssSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.CancelDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-取消单元切换
        Summary: 定时任务取消单元切换
        """
        UtilClient.validate_model(request)
        return ms_models.CancelDssSwitchoverResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.switchover.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dss_switchover(
        self,
        request: ms_models.QueryDssSwitchoverRequest,
    ) -> ms_models.QueryDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-查询单元切换状态
        Summary: 查询定时任务单元切换状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dss_switchover_ex(request, headers, runtime)

    async def query_dss_switchover_async(
        self,
        request: ms_models.QueryDssSwitchoverRequest,
    ) -> ms_models.QueryDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-查询单元切换状态
        Summary: 查询定时任务单元切换状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dss_switchover_ex_async(request, headers, runtime)

    def query_dss_switchover_ex(
        self,
        request: ms_models.QueryDssSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-查询单元切换状态
        Summary: 查询定时任务单元切换状态
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssSwitchoverResponse().from_map(
            self.do_request('1.0', 'sofa.ms.dss.switchover.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dss_switchover_ex_async(
        self,
        request: ms_models.QueryDssSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssSwitchoverResponse:
        """
        Description: 微服务-分布式调度任务-查询单元切换状态
        Summary: 查询定时任务单元切换状态
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssSwitchoverResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.dss.switchover.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def logout_registry_service(
        self,
        request: ms_models.LogoutRegistryServiceRequest,
    ) -> ms_models.LogoutRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-注销服务
        Summary: 注销服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.logout_registry_service_ex(request, headers, runtime)

    async def logout_registry_service_async(
        self,
        request: ms_models.LogoutRegistryServiceRequest,
    ) -> ms_models.LogoutRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-注销服务
        Summary: 注销服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.logout_registry_service_ex_async(request, headers, runtime)

    def logout_registry_service_ex(
        self,
        request: ms_models.LogoutRegistryServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.LogoutRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-注销服务
        Summary: 注销服务
        """
        UtilClient.validate_model(request)
        return ms_models.LogoutRegistryServiceResponse().from_map(
            self.do_request('1.0', 'sofa.ms.registry.service.logout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def logout_registry_service_ex_async(
        self,
        request: ms_models.LogoutRegistryServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.LogoutRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-注销服务
        Summary: 注销服务
        """
        UtilClient.validate_model(request)
        return ms_models.LogoutRegistryServiceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.ms.registry.service.logout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_registry_service(
        self,
        request: ms_models.OnlineRegistryServiceRequest,
    ) -> ms_models.OnlineRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-服务挂流
        Summary: 服务挂流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_registry_service_ex(request, headers, runtime)

    async def online_registry_service_async(
        self,
        request: ms_models.OnlineRegistryServiceRequest,
    ) -> ms_models.OnlineRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-服务挂流
        Summary: 服务挂流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_registry_service_ex_async(request, headers, runtime)

    def online_registry_service_ex(
        self,
        request: ms_models.OnlineRegistryServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.OnlineRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-服务挂流
        Summary: 服务挂流
        """
        UtilClient.validate_model(request)
        return ms_models.OnlineRegistryServiceResponse().from_map(
            self.do_request('2.0', 'sofa.ms.registry.service.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_registry_service_ex_async(
        self,
        request: ms_models.OnlineRegistryServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.OnlineRegistryServiceResponse:
        """
        Description: 微服务-服务注册中心-服务挂流
        Summary: 服务挂流
        """
        UtilClient.validate_model(request)
        return ms_models.OnlineRegistryServiceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.registry.service.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofa_osp_instance(
        self,
        request: ms_models.ListSofaOspInstanceRequest,
    ) -> ms_models.ListSofaOspInstanceResponse:
        """
        Description: 查询实例标识
        Summary: 查询实例标识
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofa_osp_instance_ex(request, headers, runtime)

    async def list_sofa_osp_instance_async(
        self,
        request: ms_models.ListSofaOspInstanceRequest,
    ) -> ms_models.ListSofaOspInstanceResponse:
        """
        Description: 查询实例标识
        Summary: 查询实例标识
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofa_osp_instance_ex_async(request, headers, runtime)

    def list_sofa_osp_instance_ex(
        self,
        request: ms_models.ListSofaOspInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSofaOspInstanceResponse:
        """
        Description: 查询实例标识
        Summary: 查询实例标识
        """
        UtilClient.validate_model(request)
        return ms_models.ListSofaOspInstanceResponse().from_map(
            self.do_request('1.0', 'sofa.osp.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofa_osp_instance_ex_async(
        self,
        request: ms_models.ListSofaOspInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSofaOspInstanceResponse:
        """
        Description: 查询实例标识
        Summary: 查询实例标识
        """
        UtilClient.validate_model(request)
        return ms_models.ListSofaOspInstanceResponse().from_map(
            await self.do_request_async('1.0', 'sofa.osp.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sofa_osp_cell(
        self,
        request: ms_models.AddSofaOspCellRequest,
    ) -> ms_models.AddSofaOspCellResponse:
        """
        Description: 新增某个实例下的单元
        Summary: 新增单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sofa_osp_cell_ex(request, headers, runtime)

    async def add_sofa_osp_cell_async(
        self,
        request: ms_models.AddSofaOspCellRequest,
    ) -> ms_models.AddSofaOspCellResponse:
        """
        Description: 新增某个实例下的单元
        Summary: 新增单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sofa_osp_cell_ex_async(request, headers, runtime)

    def add_sofa_osp_cell_ex(
        self,
        request: ms_models.AddSofaOspCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSofaOspCellResponse:
        """
        Description: 新增某个实例下的单元
        Summary: 新增单元
        """
        UtilClient.validate_model(request)
        return ms_models.AddSofaOspCellResponse().from_map(
            self.do_request('1.0', 'sofa.osp.cell.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sofa_osp_cell_ex_async(
        self,
        request: ms_models.AddSofaOspCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSofaOspCellResponse:
        """
        Description: 新增某个实例下的单元
        Summary: 新增单元
        """
        UtilClient.validate_model(request)
        return ms_models.AddSofaOspCellResponse().from_map(
            await self.do_request_async('1.0', 'sofa.osp.cell.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofa_osp_cell(
        self,
        request: ms_models.DeleteSofaOspCellRequest,
    ) -> ms_models.DeleteSofaOspCellResponse:
        """
        Description: 删除某个实例下的单元
        Summary: 删除单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofa_osp_cell_ex(request, headers, runtime)

    async def delete_sofa_osp_cell_async(
        self,
        request: ms_models.DeleteSofaOspCellRequest,
    ) -> ms_models.DeleteSofaOspCellResponse:
        """
        Description: 删除某个实例下的单元
        Summary: 删除单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofa_osp_cell_ex_async(request, headers, runtime)

    def delete_sofa_osp_cell_ex(
        self,
        request: ms_models.DeleteSofaOspCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSofaOspCellResponse:
        """
        Description: 删除某个实例下的单元
        Summary: 删除单元
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSofaOspCellResponse().from_map(
            self.do_request('1.0', 'sofa.osp.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofa_osp_cell_ex_async(
        self,
        request: ms_models.DeleteSofaOspCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSofaOspCellResponse:
        """
        Description: 删除某个实例下的单元
        Summary: 删除单元
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSofaOspCellResponse().from_map(
            await self.do_request_async('1.0', 'sofa.osp.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofa_osp_cell(
        self,
        request: ms_models.QuerySofaOspCellRequest,
    ) -> ms_models.QuerySofaOspCellResponse:
        """
        Description: 查询某个实例下的单元列表
        Summary: 查询单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofa_osp_cell_ex(request, headers, runtime)

    async def query_sofa_osp_cell_async(
        self,
        request: ms_models.QuerySofaOspCellRequest,
    ) -> ms_models.QuerySofaOspCellResponse:
        """
        Description: 查询某个实例下的单元列表
        Summary: 查询单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofa_osp_cell_ex_async(request, headers, runtime)

    def query_sofa_osp_cell_ex(
        self,
        request: ms_models.QuerySofaOspCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySofaOspCellResponse:
        """
        Description: 查询某个实例下的单元列表
        Summary: 查询单元列表
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySofaOspCellResponse().from_map(
            self.do_request('1.0', 'sofa.osp.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofa_osp_cell_ex_async(
        self,
        request: ms_models.QuerySofaOspCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySofaOspCellResponse:
        """
        Description: 查询某个实例下的单元列表
        Summary: 查询单元列表
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySofaOspCellResponse().from_map(
            await self.do_request_async('1.0', 'sofa.osp.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service(
        self,
        request: ms_models.QueryServiceRequest,
    ) -> ms_models.QueryServiceResponse:
        """
        Description: Query service records.
        Summary: query service record
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_ex(request, headers, runtime)

    async def query_service_async(
        self,
        request: ms_models.QueryServiceRequest,
    ) -> ms_models.QueryServiceResponse:
        """
        Description: Query service records.
        Summary: query service record
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_ex_async(request, headers, runtime)

    def query_service_ex(
        self,
        request: ms_models.QueryServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryServiceResponse:
        """
        Description: Query service records.
        Summary: query service record
        """
        UtilClient.validate_model(request)
        return ms_models.QueryServiceResponse().from_map(
            self.do_request('2.0', 'sofa.ms.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_ex_async(
        self,
        request: ms_models.QueryServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryServiceResponse:
        """
        Description: Query service records.
        Summary: query service record
        """
        UtilClient.validate_model(request)
        return ms_models.QueryServiceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_publisher(
        self,
        request: ms_models.QueryServicePublisherRequest,
    ) -> ms_models.QueryServicePublisherResponse:
        """
        Description: Query service publishers.
        Summary: query service publishers
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_publisher_ex(request, headers, runtime)

    async def query_service_publisher_async(
        self,
        request: ms_models.QueryServicePublisherRequest,
    ) -> ms_models.QueryServicePublisherResponse:
        """
        Description: Query service publishers.
        Summary: query service publishers
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_publisher_ex_async(request, headers, runtime)

    def query_service_publisher_ex(
        self,
        request: ms_models.QueryServicePublisherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryServicePublisherResponse:
        """
        Description: Query service publishers.
        Summary: query service publishers
        """
        UtilClient.validate_model(request)
        return ms_models.QueryServicePublisherResponse().from_map(
            self.do_request('2.0', 'sofa.ms.service.publisher.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_publisher_ex_async(
        self,
        request: ms_models.QueryServicePublisherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryServicePublisherResponse:
        """
        Description: Query service publishers.
        Summary: query service publishers
        """
        UtilClient.validate_model(request)
        return ms_models.QueryServicePublisherResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.service.publisher.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_subscriber(
        self,
        request: ms_models.QueryServiceSubscriberRequest,
    ) -> ms_models.QueryServiceSubscriberResponse:
        """
        Description: Query service subscribers.
        Summary: query service subscribers
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_subscriber_ex(request, headers, runtime)

    async def query_service_subscriber_async(
        self,
        request: ms_models.QueryServiceSubscriberRequest,
    ) -> ms_models.QueryServiceSubscriberResponse:
        """
        Description: Query service subscribers.
        Summary: query service subscribers
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_subscriber_ex_async(request, headers, runtime)

    def query_service_subscriber_ex(
        self,
        request: ms_models.QueryServiceSubscriberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryServiceSubscriberResponse:
        """
        Description: Query service subscribers.
        Summary: query service subscribers
        """
        UtilClient.validate_model(request)
        return ms_models.QueryServiceSubscriberResponse().from_map(
            self.do_request('2.0', 'sofa.ms.service.subscriber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_subscriber_ex_async(
        self,
        request: ms_models.QueryServiceSubscriberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryServiceSubscriberResponse:
        """
        Description: Query service subscribers.
        Summary: query service subscribers
        """
        UtilClient.validate_model(request)
        return ms_models.QueryServiceSubscriberResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.service.subscriber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_service_client(
        self,
        request: ms_models.AddServiceClientRequest,
    ) -> ms_models.AddServiceClientResponse:
        """
        Description: Client operation, like logout all services published from the client.
        Summary: Client operation
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_service_client_ex(request, headers, runtime)

    async def add_service_client_async(
        self,
        request: ms_models.AddServiceClientRequest,
    ) -> ms_models.AddServiceClientResponse:
        """
        Description: Client operation, like logout all services published from the client.
        Summary: Client operation
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_service_client_ex_async(request, headers, runtime)

    def add_service_client_ex(
        self,
        request: ms_models.AddServiceClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddServiceClientResponse:
        """
        Description: Client operation, like logout all services published from the client.
        Summary: Client operation
        """
        UtilClient.validate_model(request)
        return ms_models.AddServiceClientResponse().from_map(
            self.do_request('2.0', 'sofa.ms.service.client.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_service_client_ex_async(
        self,
        request: ms_models.AddServiceClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddServiceClientResponse:
        """
        Description: Client operation, like logout all services published from the client.
        Summary: Client operation
        """
        UtilClient.validate_model(request)
        return ms_models.AddServiceClientResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.service.client.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ddcs_resources(
        self,
        request: ms_models.QueryDdcsResourcesRequest,
    ) -> ms_models.QueryDdcsResourcesResponse:
        """
        Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
        Summary: 模糊查询资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ddcs_resources_ex(request, headers, runtime)

    async def query_ddcs_resources_async(
        self,
        request: ms_models.QueryDdcsResourcesRequest,
    ) -> ms_models.QueryDdcsResourcesResponse:
        """
        Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
        Summary: 模糊查询资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ddcs_resources_ex_async(request, headers, runtime)

    def query_ddcs_resources_ex(
        self,
        request: ms_models.QueryDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsResourcesResponse:
        """
        Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
        Summary: 模糊查询资源
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsResourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.resources.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ddcs_resources_ex_async(
        self,
        request: ms_models.QueryDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsResourcesResponse:
        """
        Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
        Summary: 模糊查询资源
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsResourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.resources.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ddcs_data(
        self,
        request: ms_models.AddDdcsDataRequest,
    ) -> ms_models.AddDdcsDataResponse:
        """
        Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
        Summary: 推送属性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ddcs_data_ex(request, headers, runtime)

    async def add_ddcs_data_async(
        self,
        request: ms_models.AddDdcsDataRequest,
    ) -> ms_models.AddDdcsDataResponse:
        """
        Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
        Summary: 推送属性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ddcs_data_ex_async(request, headers, runtime)

    def add_ddcs_data_ex(
        self,
        request: ms_models.AddDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsDataResponse:
        """
        Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
        Summary: 推送属性值
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsDataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.data.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ddcs_data_ex_async(
        self,
        request: ms_models.AddDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsDataResponse:
        """
        Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
        Summary: 推送属性值
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsDataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.data.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ddcs_resources(
        self,
        request: ms_models.AddDdcsResourcesRequest,
    ) -> ms_models.AddDdcsResourcesResponse:
        """
        Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
        Summary: 新增资源元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ddcs_resources_ex(request, headers, runtime)

    async def add_ddcs_resources_async(
        self,
        request: ms_models.AddDdcsResourcesRequest,
    ) -> ms_models.AddDdcsResourcesResponse:
        """
        Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
        Summary: 新增资源元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ddcs_resources_ex_async(request, headers, runtime)

    def add_ddcs_resources_ex(
        self,
        request: ms_models.AddDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsResourcesResponse:
        """
        Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
        Summary: 新增资源元数据
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsResourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.resources.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ddcs_resources_ex_async(
        self,
        request: ms_models.AddDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsResourcesResponse:
        """
        Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
        Summary: 新增资源元数据
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsResourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.resources.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ddcs_resources(
        self,
        request: ms_models.UpdateDdcsResourcesRequest,
    ) -> ms_models.UpdateDdcsResourcesResponse:
        """
        Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
        Summary: 更新资源元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ddcs_resources_ex(request, headers, runtime)

    async def update_ddcs_resources_async(
        self,
        request: ms_models.UpdateDdcsResourcesRequest,
    ) -> ms_models.UpdateDdcsResourcesResponse:
        """
        Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
        Summary: 更新资源元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ddcs_resources_ex_async(request, headers, runtime)

    def update_ddcs_resources_ex(
        self,
        request: ms_models.UpdateDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsResourcesResponse:
        """
        Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
        Summary: 更新资源元信息
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsResourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.resources.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ddcs_resources_ex_async(
        self,
        request: ms_models.UpdateDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsResourcesResponse:
        """
        Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
        Summary: 更新资源元信息
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsResourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.resources.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ddcs_resources(
        self,
        request: ms_models.DeleteDdcsResourcesRequest,
    ) -> ms_models.DeleteDdcsResourcesResponse:
        """
        Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
        Summary: 根据资源ID删除资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ddcs_resources_ex(request, headers, runtime)

    async def delete_ddcs_resources_async(
        self,
        request: ms_models.DeleteDdcsResourcesRequest,
    ) -> ms_models.DeleteDdcsResourcesResponse:
        """
        Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
        Summary: 根据资源ID删除资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ddcs_resources_ex_async(request, headers, runtime)

    def delete_ddcs_resources_ex(
        self,
        request: ms_models.DeleteDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsResourcesResponse:
        """
        Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
        Summary: 根据资源ID删除资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsResourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.resources.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ddcs_resources_ex_async(
        self,
        request: ms_models.DeleteDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsResourcesResponse:
        """
        Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
        Summary: 根据资源ID删除资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsResourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.resources.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ddcs_resources(
        self,
        request: ms_models.GetDdcsResourcesRequest,
    ) -> ms_models.GetDdcsResourcesResponse:
        """
        Description: 根据资源 ID 获取对应的资源元信息。
        Summary: 根据资源自增长 ID 获取资源元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ddcs_resources_ex(request, headers, runtime)

    async def get_ddcs_resources_async(
        self,
        request: ms_models.GetDdcsResourcesRequest,
    ) -> ms_models.GetDdcsResourcesResponse:
        """
        Description: 根据资源 ID 获取对应的资源元信息。
        Summary: 根据资源自增长 ID 获取资源元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ddcs_resources_ex_async(request, headers, runtime)

    def get_ddcs_resources_ex(
        self,
        request: ms_models.GetDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDdcsResourcesResponse:
        """
        Description: 根据资源 ID 获取对应的资源元信息。
        Summary: 根据资源自增长 ID 获取资源元信息
        """
        UtilClient.validate_model(request)
        return ms_models.GetDdcsResourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.resources.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ddcs_resources_ex_async(
        self,
        request: ms_models.GetDdcsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDdcsResourcesResponse:
        """
        Description: 根据资源 ID 获取对应的资源元信息。
        Summary: 根据资源自增长 ID 获取资源元信息
        """
        UtilClient.validate_model(request)
        return ms_models.GetDdcsResourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.resources.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ddcs_attributes(
        self,
        request: ms_models.AddDdcsAttributesRequest,
    ) -> ms_models.AddDdcsAttributesResponse:
        """
        Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
        Summary: 新增属性元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ddcs_attributes_ex(request, headers, runtime)

    async def add_ddcs_attributes_async(
        self,
        request: ms_models.AddDdcsAttributesRequest,
    ) -> ms_models.AddDdcsAttributesResponse:
        """
        Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
        Summary: 新增属性元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ddcs_attributes_ex_async(request, headers, runtime)

    def add_ddcs_attributes_ex(
        self,
        request: ms_models.AddDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsAttributesResponse:
        """
        Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
        Summary: 新增属性元信息
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsAttributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.attributes.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ddcs_attributes_ex_async(
        self,
        request: ms_models.AddDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsAttributesResponse:
        """
        Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
        Summary: 新增属性元信息
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsAttributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.attributes.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ddcs_attributes(
        self,
        request: ms_models.UpdateDdcsAttributesRequest,
    ) -> ms_models.UpdateDdcsAttributesResponse:
        """
        Description: 根据属性 ID 更新属性元信息。
        Summary: 更新属性元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ddcs_attributes_ex(request, headers, runtime)

    async def update_ddcs_attributes_async(
        self,
        request: ms_models.UpdateDdcsAttributesRequest,
    ) -> ms_models.UpdateDdcsAttributesResponse:
        """
        Description: 根据属性 ID 更新属性元信息。
        Summary: 更新属性元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ddcs_attributes_ex_async(request, headers, runtime)

    def update_ddcs_attributes_ex(
        self,
        request: ms_models.UpdateDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsAttributesResponse:
        """
        Description: 根据属性 ID 更新属性元信息。
        Summary: 更新属性元信息
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsAttributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.attributes.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ddcs_attributes_ex_async(
        self,
        request: ms_models.UpdateDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdcsAttributesResponse:
        """
        Description: 根据属性 ID 更新属性元信息。
        Summary: 更新属性元信息
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdcsAttributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.attributes.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_ddcs_attributes(
        self,
        request: ms_models.DeleteDdcsAttributesRequest,
    ) -> ms_models.DeleteDdcsAttributesResponse:
        """
        Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
        Summary: 删除属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_ddcs_attributes_ex(request, headers, runtime)

    async def delete_ddcs_attributes_async(
        self,
        request: ms_models.DeleteDdcsAttributesRequest,
    ) -> ms_models.DeleteDdcsAttributesResponse:
        """
        Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
        Summary: 删除属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_ddcs_attributes_ex_async(request, headers, runtime)

    def delete_ddcs_attributes_ex(
        self,
        request: ms_models.DeleteDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsAttributesResponse:
        """
        Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
        Summary: 删除属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsAttributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.attributes.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_ddcs_attributes_ex_async(
        self,
        request: ms_models.DeleteDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdcsAttributesResponse:
        """
        Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
        Summary: 删除属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdcsAttributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.attributes.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ddcs_attributes(
        self,
        request: ms_models.GetDdcsAttributesRequest,
    ) -> ms_models.GetDdcsAttributesResponse:
        """
        Description: 根据属性 ID 获取对应的属性信息。
        Summary: 获取属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ddcs_attributes_ex(request, headers, runtime)

    async def get_ddcs_attributes_async(
        self,
        request: ms_models.GetDdcsAttributesRequest,
    ) -> ms_models.GetDdcsAttributesResponse:
        """
        Description: 根据属性 ID 获取对应的属性信息。
        Summary: 获取属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ddcs_attributes_ex_async(request, headers, runtime)

    def get_ddcs_attributes_ex(
        self,
        request: ms_models.GetDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDdcsAttributesResponse:
        """
        Description: 根据属性 ID 获取对应的属性信息。
        Summary: 获取属性
        """
        UtilClient.validate_model(request)
        return ms_models.GetDdcsAttributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.attributes.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ddcs_attributes_ex_async(
        self,
        request: ms_models.GetDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDdcsAttributesResponse:
        """
        Description: 根据属性 ID 获取对应的属性信息。
        Summary: 获取属性
        """
        UtilClient.validate_model(request)
        return ms_models.GetDdcsAttributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.attributes.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ddcs_attributes(
        self,
        request: ms_models.QueryDdcsAttributesRequest,
    ) -> ms_models.QueryDdcsAttributesResponse:
        """
        Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
        Summary: 根据资源和属性名称获取属性信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ddcs_attributes_ex(request, headers, runtime)

    async def query_ddcs_attributes_async(
        self,
        request: ms_models.QueryDdcsAttributesRequest,
    ) -> ms_models.QueryDdcsAttributesResponse:
        """
        Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
        Summary: 根据资源和属性名称获取属性信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ddcs_attributes_ex_async(request, headers, runtime)

    def query_ddcs_attributes_ex(
        self,
        request: ms_models.QueryDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsAttributesResponse:
        """
        Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
        Summary: 根据资源和属性名称获取属性信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsAttributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.attributes.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ddcs_attributes_ex_async(
        self,
        request: ms_models.QueryDdcsAttributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsAttributesResponse:
        """
        Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
        Summary: 根据资源和属性名称获取属性信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsAttributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.attributes.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dds_job(
        self,
        request: ms_models.GetDdsJobRequest,
    ) -> ms_models.GetDdsJobResponse:
        """
        Description: query job by specific id
        Summary: query job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dds_job_ex(request, headers, runtime)

    async def get_dds_job_async(
        self,
        request: ms_models.GetDdsJobRequest,
    ) -> ms_models.GetDdsJobResponse:
        """
        Description: query job by specific id
        Summary: query job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dds_job_ex_async(request, headers, runtime)

    def get_dds_job_ex(
        self,
        request: ms_models.GetDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDdsJobResponse:
        """
        Description: query job by specific id
        Summary: query job
        """
        UtilClient.validate_model(request)
        return ms_models.GetDdsJobResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dds.job.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dds_job_ex_async(
        self,
        request: ms_models.GetDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDdsJobResponse:
        """
        Description: query job by specific id
        Summary: query job
        """
        UtilClient.validate_model(request)
        return ms_models.GetDdsJobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dds.job.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dds_job(
        self,
        request: ms_models.AddDdsJobRequest,
    ) -> ms_models.AddDdsJobResponse:
        """
        Description: add job
        Summary: add job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dds_job_ex(request, headers, runtime)

    async def add_dds_job_async(
        self,
        request: ms_models.AddDdsJobRequest,
    ) -> ms_models.AddDdsJobResponse:
        """
        Description: add job
        Summary: add job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dds_job_ex_async(request, headers, runtime)

    def add_dds_job_ex(
        self,
        request: ms_models.AddDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdsJobResponse:
        """
        Description: add job
        Summary: add job
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdsJobResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dds.job.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dds_job_ex_async(
        self,
        request: ms_models.AddDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdsJobResponse:
        """
        Description: add job
        Summary: add job
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdsJobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dds.job.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dds_job(
        self,
        request: ms_models.UpdateDdsJobRequest,
    ) -> ms_models.UpdateDdsJobResponse:
        """
        Description: modify job by specific id
        Summary: modify job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dds_job_ex(request, headers, runtime)

    async def update_dds_job_async(
        self,
        request: ms_models.UpdateDdsJobRequest,
    ) -> ms_models.UpdateDdsJobResponse:
        """
        Description: modify job by specific id
        Summary: modify job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dds_job_ex_async(request, headers, runtime)

    def update_dds_job_ex(
        self,
        request: ms_models.UpdateDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdsJobResponse:
        """
        Description: modify job by specific id
        Summary: modify job
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdsJobResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dds.job.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dds_job_ex_async(
        self,
        request: ms_models.UpdateDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdsJobResponse:
        """
        Description: modify job by specific id
        Summary: modify job
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdsJobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dds.job.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dds_job(
        self,
        request: ms_models.DeleteDdsJobRequest,
    ) -> ms_models.DeleteDdsJobResponse:
        """
        Description: delete job by specific id
        Summary: delete job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dds_job_ex(request, headers, runtime)

    async def delete_dds_job_async(
        self,
        request: ms_models.DeleteDdsJobRequest,
    ) -> ms_models.DeleteDdsJobResponse:
        """
        Description: delete job by specific id
        Summary: delete job
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dds_job_ex_async(request, headers, runtime)

    def delete_dds_job_ex(
        self,
        request: ms_models.DeleteDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdsJobResponse:
        """
        Description: delete job by specific id
        Summary: delete job
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdsJobResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dds.job.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dds_job_ex_async(
        self,
        request: ms_models.DeleteDdsJobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDdsJobResponse:
        """
        Description: delete job by specific id
        Summary: delete job
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDdsJobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dds.job.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dds_job_status(
        self,
        request: ms_models.UpdateDdsJobStatusRequest,
    ) -> ms_models.UpdateDdsJobStatusResponse:
        """
        Description: update status by specific id
        Summary: update status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dds_job_status_ex(request, headers, runtime)

    async def update_dds_job_status_async(
        self,
        request: ms_models.UpdateDdsJobStatusRequest,
    ) -> ms_models.UpdateDdsJobStatusResponse:
        """
        Description: update status by specific id
        Summary: update status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dds_job_status_ex_async(request, headers, runtime)

    def update_dds_job_status_ex(
        self,
        request: ms_models.UpdateDdsJobStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdsJobStatusResponse:
        """
        Description: update status by specific id
        Summary: update status
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdsJobStatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dds.job.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dds_job_status_ex_async(
        self,
        request: ms_models.UpdateDdsJobStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDdsJobStatusResponse:
        """
        Description: update status by specific id
        Summary: update status
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDdsJobStatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dds.job.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ddcs_graydata(
        self,
        request: ms_models.AddDdcsGraydataRequest,
    ) -> ms_models.AddDdcsGraydataResponse:
        """
        Description: 按 IP 灰度推送属性值。
        Summary: 按IP灰度推送属性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ddcs_graydata_ex(request, headers, runtime)

    async def add_ddcs_graydata_async(
        self,
        request: ms_models.AddDdcsGraydataRequest,
    ) -> ms_models.AddDdcsGraydataResponse:
        """
        Description: 按 IP 灰度推送属性值。
        Summary: 按IP灰度推送属性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ddcs_graydata_ex_async(request, headers, runtime)

    def add_ddcs_graydata_ex(
        self,
        request: ms_models.AddDdcsGraydataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsGraydataResponse:
        """
        Description: 按 IP 灰度推送属性值。
        Summary: 按IP灰度推送属性值
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsGraydataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.graydata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ddcs_graydata_ex_async(
        self,
        request: ms_models.AddDdcsGraydataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDdcsGraydataResponse:
        """
        Description: 按 IP 灰度推送属性值。
        Summary: 按IP灰度推送属性值
        """
        UtilClient.validate_model(request)
        return ms_models.AddDdcsGraydataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.graydata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ddcs_data(
        self,
        request: ms_models.QueryDdcsDataRequest,
    ) -> ms_models.QueryDdcsDataResponse:
        """
        Description: 查询属性最后一次的推送值。
        Summary: 查询属性最后一次推送值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ddcs_data_ex(request, headers, runtime)

    async def query_ddcs_data_async(
        self,
        request: ms_models.QueryDdcsDataRequest,
    ) -> ms_models.QueryDdcsDataResponse:
        """
        Description: 查询属性最后一次的推送值。
        Summary: 查询属性最后一次推送值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ddcs_data_ex_async(request, headers, runtime)

    def query_ddcs_data_ex(
        self,
        request: ms_models.QueryDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsDataResponse:
        """
        Description: 查询属性最后一次的推送值。
        Summary: 查询属性最后一次推送值
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsDataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ddcs_data_ex_async(
        self,
        request: ms_models.QueryDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsDataResponse:
        """
        Description: 查询属性最后一次的推送值。
        Summary: 查询属性最后一次推送值
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsDataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dds_jobs(
        self,
        request: ms_models.QueryDdsJobsRequest,
    ) -> ms_models.QueryDdsJobsResponse:
        """
        Description: query jobs
        Summary: query jobs
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dds_jobs_ex(request, headers, runtime)

    async def query_dds_jobs_async(
        self,
        request: ms_models.QueryDdsJobsRequest,
    ) -> ms_models.QueryDdsJobsResponse:
        """
        Description: query jobs
        Summary: query jobs
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dds_jobs_ex_async(request, headers, runtime)

    def query_dds_jobs_ex(
        self,
        request: ms_models.QueryDdsJobsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdsJobsResponse:
        """
        Description: query jobs
        Summary: query jobs
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdsJobsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dds.jobs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dds_jobs_ex_async(
        self,
        request: ms_models.QueryDdsJobsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdsJobsResponse:
        """
        Description: query jobs
        Summary: query jobs
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdsJobsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dds.jobs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ddcs_clientvalue(
        self,
        request: ms_models.QueryDdcsClientvalueRequest,
    ) -> ms_models.QueryDdcsClientvalueResponse:
        """
        Description: 查询属性下指定客户端的内存值。
        Summary: 查询属性下指定客户端的内存值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ddcs_clientvalue_ex(request, headers, runtime)

    async def query_ddcs_clientvalue_async(
        self,
        request: ms_models.QueryDdcsClientvalueRequest,
    ) -> ms_models.QueryDdcsClientvalueResponse:
        """
        Description: 查询属性下指定客户端的内存值。
        Summary: 查询属性下指定客户端的内存值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ddcs_clientvalue_ex_async(request, headers, runtime)

    def query_ddcs_clientvalue_ex(
        self,
        request: ms_models.QueryDdcsClientvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsClientvalueResponse:
        """
        Description: 查询属性下指定客户端的内存值。
        Summary: 查询属性下指定客户端的内存值
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsClientvalueResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.clientvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ddcs_clientvalue_ex_async(
        self,
        request: ms_models.QueryDdcsClientvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsClientvalueResponse:
        """
        Description: 查询属性下指定客户端的内存值。
        Summary: 查询属性下指定客户端的内存值
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsClientvalueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.clientvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ddcs_pushhistory(
        self,
        request: ms_models.QueryDdcsPushhistoryRequest,
    ) -> ms_models.QueryDdcsPushhistoryResponse:
        """
        Description: 查询属性推送历史
        Summary: 查询属性推送历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ddcs_pushhistory_ex(request, headers, runtime)

    async def query_ddcs_pushhistory_async(
        self,
        request: ms_models.QueryDdcsPushhistoryRequest,
    ) -> ms_models.QueryDdcsPushhistoryResponse:
        """
        Description: 查询属性推送历史
        Summary: 查询属性推送历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ddcs_pushhistory_ex_async(request, headers, runtime)

    def query_ddcs_pushhistory_ex(
        self,
        request: ms_models.QueryDdcsPushhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsPushhistoryResponse:
        """
        Description: 查询属性推送历史
        Summary: 查询属性推送历史
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsPushhistoryResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.pushhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ddcs_pushhistory_ex_async(
        self,
        request: ms_models.QueryDdcsPushhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDdcsPushhistoryResponse:
        """
        Description: 查询属性推送历史
        Summary: 查询属性推送历史
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDdcsPushhistoryResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.pushhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dss_zone(
        self,
        request: ms_models.QueryDssZoneRequest,
    ) -> ms_models.QueryDssZoneResponse:
        """
        Description: LDC模式部署获取所有zone
        Summary: LDC模式部署获取所有zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dss_zone_ex(request, headers, runtime)

    async def query_dss_zone_async(
        self,
        request: ms_models.QueryDssZoneRequest,
    ) -> ms_models.QueryDssZoneResponse:
        """
        Description: LDC模式部署获取所有zone
        Summary: LDC模式部署获取所有zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dss_zone_ex_async(request, headers, runtime)

    def query_dss_zone_ex(
        self,
        request: ms_models.QueryDssZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssZoneResponse:
        """
        Description: LDC模式部署获取所有zone
        Summary: LDC模式部署获取所有zone
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssZoneResponse().from_map(
            self.do_request('2.0', 'sofa.ms.dss.zone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dss_zone_ex_async(
        self,
        request: ms_models.QueryDssZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDssZoneResponse:
        """
        Description: LDC模式部署获取所有zone
        Summary: LDC模式部署获取所有zone
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDssZoneResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.dss.zone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_ddcs_data(
        self,
        request: ms_models.RollbackDdcsDataRequest,
    ) -> ms_models.RollbackDdcsDataResponse:
        """
        Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
        Summary: 回滚最近一次动态配置推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_ddcs_data_ex(request, headers, runtime)

    async def rollback_ddcs_data_async(
        self,
        request: ms_models.RollbackDdcsDataRequest,
    ) -> ms_models.RollbackDdcsDataResponse:
        """
        Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
        Summary: 回滚最近一次动态配置推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_ddcs_data_ex_async(request, headers, runtime)

    def rollback_ddcs_data_ex(
        self,
        request: ms_models.RollbackDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.RollbackDdcsDataResponse:
        """
        Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
        Summary: 回滚最近一次动态配置推送
        """
        UtilClient.validate_model(request)
        return ms_models.RollbackDdcsDataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.ddcs.data.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_ddcs_data_ex_async(
        self,
        request: ms_models.RollbackDdcsDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.RollbackDdcsDataResponse:
        """
        Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
        Summary: 回滚最近一次动态配置推送
        """
        UtilClient.validate_model(request)
        return ms_models.RollbackDdcsDataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.ddcs.data.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authrulegroups(
        self,
        request: ms_models.ListSgAuthrulegroupsRequest,
    ) -> ms_models.ListSgAuthrulegroupsResponse:
        """
        Description: 根据服务接口查询服务鉴权规则
        Summary: 根据服务接口查询服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authrulegroups_ex(request, headers, runtime)

    async def list_sg_authrulegroups_async(
        self,
        request: ms_models.ListSgAuthrulegroupsRequest,
    ) -> ms_models.ListSgAuthrulegroupsResponse:
        """
        Description: 根据服务接口查询服务鉴权规则
        Summary: 根据服务接口查询服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authrulegroups_ex_async(request, headers, runtime)

    def list_sg_authrulegroups_ex(
        self,
        request: ms_models.ListSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthrulegroupsResponse:
        """
        Description: 根据服务接口查询服务鉴权规则
        Summary: 根据服务接口查询服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authrulegroups_ex_async(
        self,
        request: ms_models.ListSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthrulegroupsResponse:
        """
        Description: 根据服务接口查询服务鉴权规则
        Summary: 根据服务接口查询服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_formconfig(
        self,
        request: ms_models.QuerySgFormconfigRequest,
    ) -> ms_models.QuerySgFormconfigResponse:
        """
        Description: 查询表单元数据，支持哪些鉴权规则
        Summary: 查询表单元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_formconfig_ex(request, headers, runtime)

    async def query_sg_formconfig_async(
        self,
        request: ms_models.QuerySgFormconfigRequest,
    ) -> ms_models.QuerySgFormconfigResponse:
        """
        Description: 查询表单元数据，支持哪些鉴权规则
        Summary: 查询表单元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_formconfig_ex_async(request, headers, runtime)

    def query_sg_formconfig_ex(
        self,
        request: ms_models.QuerySgFormconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgFormconfigResponse:
        """
        Description: 查询表单元数据，支持哪些鉴权规则
        Summary: 查询表单元数据
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgFormconfigResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.formconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_formconfig_ex_async(
        self,
        request: ms_models.QuerySgFormconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgFormconfigResponse:
        """
        Description: 查询表单元数据，支持哪些鉴权规则
        Summary: 查询表单元数据
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgFormconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.formconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_sg_authrules(
        self,
        request: ms_models.ReinitSgAuthrulesRequest,
    ) -> ms_models.ReinitSgAuthrulesResponse:
        """
        Description: 清空黑白名单下所有鉴权规则
        Summary: 清空黑白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_sg_authrules_ex(request, headers, runtime)

    async def reinit_sg_authrules_async(
        self,
        request: ms_models.ReinitSgAuthrulesRequest,
    ) -> ms_models.ReinitSgAuthrulesResponse:
        """
        Description: 清空黑白名单下所有鉴权规则
        Summary: 清空黑白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_sg_authrules_ex_async(request, headers, runtime)

    def reinit_sg_authrules_ex(
        self,
        request: ms_models.ReinitSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ReinitSgAuthrulesResponse:
        """
        Description: 清空黑白名单下所有鉴权规则
        Summary: 清空黑白名单
        """
        UtilClient.validate_model(request)
        return ms_models.ReinitSgAuthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrules.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_sg_authrules_ex_async(
        self,
        request: ms_models.ReinitSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ReinitSgAuthrulesResponse:
        """
        Description: 清空黑白名单下所有鉴权规则
        Summary: 清空黑白名单
        """
        UtilClient.validate_model(request)
        return ms_models.ReinitSgAuthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrules.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_sg_authrulegroups(
        self,
        request: ms_models.SaveSgAuthrulegroupsRequest,
    ) -> ms_models.SaveSgAuthrulegroupsResponse:
        """
        Description: 创建服务鉴权规则
        Summary: 创建服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_sg_authrulegroups_ex(request, headers, runtime)

    async def save_sg_authrulegroups_async(
        self,
        request: ms_models.SaveSgAuthrulegroupsRequest,
    ) -> ms_models.SaveSgAuthrulegroupsResponse:
        """
        Description: 创建服务鉴权规则
        Summary: 创建服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_sg_authrulegroups_ex_async(request, headers, runtime)

    def save_sg_authrulegroups_ex(
        self,
        request: ms_models.SaveSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SaveSgAuthrulegroupsResponse:
        """
        Description: 创建服务鉴权规则
        Summary: 创建服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.SaveSgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_sg_authrulegroups_ex_async(
        self,
        request: ms_models.SaveSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SaveSgAuthrulegroupsResponse:
        """
        Description: 创建服务鉴权规则
        Summary: 创建服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.SaveSgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_sg_servicepublishers(
        self,
        request: ms_models.SyncSgServicepublishersRequest,
    ) -> ms_models.SyncSgServicepublishersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_sg_servicepublishers_ex(request, headers, runtime)

    async def sync_sg_servicepublishers_async(
        self,
        request: ms_models.SyncSgServicepublishersRequest,
    ) -> ms_models.SyncSgServicepublishersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_sg_servicepublishers_ex_async(request, headers, runtime)

    def sync_sg_servicepublishers_ex(
        self,
        request: ms_models.SyncSgServicepublishersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServicepublishersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServicepublishersResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepublishers.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_sg_servicepublishers_ex_async(
        self,
        request: ms_models.SyncSgServicepublishersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServicepublishersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServicepublishersResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepublishers.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_sg_servicesubscribers(
        self,
        request: ms_models.SyncSgServicesubscribersRequest,
    ) -> ms_models.SyncSgServicesubscribersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_sg_servicesubscribers_ex(request, headers, runtime)

    async def sync_sg_servicesubscribers_async(
        self,
        request: ms_models.SyncSgServicesubscribersRequest,
    ) -> ms_models.SyncSgServicesubscribersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_sg_servicesubscribers_ex_async(request, headers, runtime)

    def sync_sg_servicesubscribers_ex(
        self,
        request: ms_models.SyncSgServicesubscribersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServicesubscribersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServicesubscribersResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesubscribers.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_sg_servicesubscribers_ex_async(
        self,
        request: ms_models.SyncSgServicesubscribersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServicesubscribersResponse:
        """
        Description: 微服务-同步服务发布者信息
        Summary: 同步服务发布者信息
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServicesubscribersResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesubscribers.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_sg_serviceclients(
        self,
        request: ms_models.SyncSgServiceclientsRequest,
    ) -> ms_models.SyncSgServiceclientsResponse:
        """
        Description: 微服务-同步客户端下线事件
        Summary: 同步客户端下线事件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_sg_serviceclients_ex(request, headers, runtime)

    async def sync_sg_serviceclients_async(
        self,
        request: ms_models.SyncSgServiceclientsRequest,
    ) -> ms_models.SyncSgServiceclientsResponse:
        """
        Description: 微服务-同步客户端下线事件
        Summary: 同步客户端下线事件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_sg_serviceclients_ex_async(request, headers, runtime)

    def sync_sg_serviceclients_ex(
        self,
        request: ms_models.SyncSgServiceclientsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServiceclientsResponse:
        """
        Description: 微服务-同步客户端下线事件
        Summary: 同步客户端下线事件
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServiceclientsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceclients.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_sg_serviceclients_ex_async(
        self,
        request: ms_models.SyncSgServiceclientsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServiceclientsResponse:
        """
        Description: 微服务-同步客户端下线事件
        Summary: 同步客户端下线事件
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServiceclientsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceclients.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_sg_serviceheartbeats(
        self,
        request: ms_models.SyncSgServiceheartbeatsRequest,
    ) -> ms_models.SyncSgServiceheartbeatsResponse:
        """
        Description: 微服务-同步心跳数据
        Summary: 同步心跳数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_sg_serviceheartbeats_ex(request, headers, runtime)

    async def sync_sg_serviceheartbeats_async(
        self,
        request: ms_models.SyncSgServiceheartbeatsRequest,
    ) -> ms_models.SyncSgServiceheartbeatsResponse:
        """
        Description: 微服务-同步心跳数据
        Summary: 同步心跳数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_sg_serviceheartbeats_ex_async(request, headers, runtime)

    def sync_sg_serviceheartbeats_ex(
        self,
        request: ms_models.SyncSgServiceheartbeatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServiceheartbeatsResponse:
        """
        Description: 微服务-同步心跳数据
        Summary: 同步心跳数据
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServiceheartbeatsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceheartbeats.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_sg_serviceheartbeats_ex_async(
        self,
        request: ms_models.SyncSgServiceheartbeatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SyncSgServiceheartbeatsResponse:
        """
        Description: 微服务-同步心跳数据
        Summary: 同步心跳数据
        """
        UtilClient.validate_model(request)
        return ms_models.SyncSgServiceheartbeatsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceheartbeats.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicepublishers(
        self,
        request: ms_models.QuerySgServicepublishersRequest,
    ) -> ms_models.QuerySgServicepublishersResponse:
        """
        Description: 分页查询发布者信息
        Summary: 分页查询发布者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicepublishers_ex(request, headers, runtime)

    async def query_sg_servicepublishers_async(
        self,
        request: ms_models.QuerySgServicepublishersRequest,
    ) -> ms_models.QuerySgServicepublishersResponse:
        """
        Description: 分页查询发布者信息
        Summary: 分页查询发布者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicepublishers_ex_async(request, headers, runtime)

    def query_sg_servicepublishers_ex(
        self,
        request: ms_models.QuerySgServicepublishersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepublishersResponse:
        """
        Description: 分页查询发布者信息
        Summary: 分页查询发布者
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepublishersResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepublishers.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicepublishers_ex_async(
        self,
        request: ms_models.QuerySgServicepublishersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepublishersResponse:
        """
        Description: 分页查询发布者信息
        Summary: 分页查询发布者
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepublishersResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepublishers.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicesubscribers(
        self,
        request: ms_models.QuerySgServicesubscribersRequest,
    ) -> ms_models.QuerySgServicesubscribersResponse:
        """
        Description: 分页查询消费者
        Summary: 分页查询消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicesubscribers_ex(request, headers, runtime)

    async def query_sg_servicesubscribers_async(
        self,
        request: ms_models.QuerySgServicesubscribersRequest,
    ) -> ms_models.QuerySgServicesubscribersResponse:
        """
        Description: 分页查询消费者
        Summary: 分页查询消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicesubscribers_ex_async(request, headers, runtime)

    def query_sg_servicesubscribers_ex(
        self,
        request: ms_models.QuerySgServicesubscribersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubscribersResponse:
        """
        Description: 分页查询消费者
        Summary: 分页查询消费者
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubscribersResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesubscribers.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicesubscribers_ex_async(
        self,
        request: ms_models.QuerySgServicesubscribersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubscribersResponse:
        """
        Description: 分页查询消费者
        Summary: 分页查询消费者
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubscribersResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesubscribers.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_serviceratelimitrules(
        self,
        request: ms_models.QuerySgServiceratelimitrulesRequest,
    ) -> ms_models.QuerySgServiceratelimitrulesResponse:
        """
        Description: 根据dataId查询服务限流规则
        Summary: 根据dataId查询服务限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_serviceratelimitrules_ex(request, headers, runtime)

    async def query_sg_serviceratelimitrules_async(
        self,
        request: ms_models.QuerySgServiceratelimitrulesRequest,
    ) -> ms_models.QuerySgServiceratelimitrulesResponse:
        """
        Description: 根据dataId查询服务限流规则
        Summary: 根据dataId查询服务限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_serviceratelimitrules_ex_async(request, headers, runtime)

    def query_sg_serviceratelimitrules_ex(
        self,
        request: ms_models.QuerySgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServiceratelimitrulesResponse:
        """
        Description: 根据dataId查询服务限流规则
        Summary: 根据dataId查询服务限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServiceratelimitrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceratelimitrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_serviceratelimitrules_ex_async(
        self,
        request: ms_models.QuerySgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServiceratelimitrulesResponse:
        """
        Description: 根据dataId查询服务限流规则
        Summary: 根据dataId查询服务限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServiceratelimitrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceratelimitrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_serviceratelimitrules(
        self,
        request: ms_models.AddSgServiceratelimitrulesRequest,
    ) -> ms_models.AddSgServiceratelimitrulesResponse:
        """
        Description: 新增限流规则
        Summary: 新增限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_serviceratelimitrules_ex(request, headers, runtime)

    async def add_sg_serviceratelimitrules_async(
        self,
        request: ms_models.AddSgServiceratelimitrulesRequest,
    ) -> ms_models.AddSgServiceratelimitrulesResponse:
        """
        Description: 新增限流规则
        Summary: 新增限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_serviceratelimitrules_ex_async(request, headers, runtime)

    def add_sg_serviceratelimitrules_ex(
        self,
        request: ms_models.AddSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgServiceratelimitrulesResponse:
        """
        Description: 新增限流规则
        Summary: 新增限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgServiceratelimitrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceratelimitrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_serviceratelimitrules_ex_async(
        self,
        request: ms_models.AddSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgServiceratelimitrulesResponse:
        """
        Description: 新增限流规则
        Summary: 新增限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgServiceratelimitrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceratelimitrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_serviceratelimitrules(
        self,
        request: ms_models.UpdateSgServiceratelimitrulesRequest,
    ) -> ms_models.UpdateSgServiceratelimitrulesResponse:
        """
        Description: 更新服务限流规则
        Summary: 更新服务限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_serviceratelimitrules_ex(request, headers, runtime)

    async def update_sg_serviceratelimitrules_async(
        self,
        request: ms_models.UpdateSgServiceratelimitrulesRequest,
    ) -> ms_models.UpdateSgServiceratelimitrulesResponse:
        """
        Description: 更新服务限流规则
        Summary: 更新服务限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_serviceratelimitrules_ex_async(request, headers, runtime)

    def update_sg_serviceratelimitrules_ex(
        self,
        request: ms_models.UpdateSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgServiceratelimitrulesResponse:
        """
        Description: 更新服务限流规则
        Summary: 更新服务限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgServiceratelimitrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceratelimitrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_serviceratelimitrules_ex_async(
        self,
        request: ms_models.UpdateSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgServiceratelimitrulesResponse:
        """
        Description: 更新服务限流规则
        Summary: 更新服务限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgServiceratelimitrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceratelimitrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_serviceratelimitrules(
        self,
        request: ms_models.DeleteSgServiceratelimitrulesRequest,
    ) -> ms_models.DeleteSgServiceratelimitrulesResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_serviceratelimitrules_ex(request, headers, runtime)

    async def delete_sg_serviceratelimitrules_async(
        self,
        request: ms_models.DeleteSgServiceratelimitrulesRequest,
    ) -> ms_models.DeleteSgServiceratelimitrulesResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_serviceratelimitrules_ex_async(request, headers, runtime)

    def delete_sg_serviceratelimitrules_ex(
        self,
        request: ms_models.DeleteSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgServiceratelimitrulesResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgServiceratelimitrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceratelimitrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_serviceratelimitrules_ex_async(
        self,
        request: ms_models.DeleteSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgServiceratelimitrulesResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgServiceratelimitrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceratelimitrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_serviceratelimitrulestatus(
        self,
        request: ms_models.UpdateSgServiceratelimitrulestatusRequest,
    ) -> ms_models.UpdateSgServiceratelimitrulestatusResponse:
        """
        Description: 禁用/启用限流规则
        Summary: 禁用/启用限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_serviceratelimitrulestatus_ex(request, headers, runtime)

    async def update_sg_serviceratelimitrulestatus_async(
        self,
        request: ms_models.UpdateSgServiceratelimitrulestatusRequest,
    ) -> ms_models.UpdateSgServiceratelimitrulestatusResponse:
        """
        Description: 禁用/启用限流规则
        Summary: 禁用/启用限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_serviceratelimitrulestatus_ex_async(request, headers, runtime)

    def update_sg_serviceratelimitrulestatus_ex(
        self,
        request: ms_models.UpdateSgServiceratelimitrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgServiceratelimitrulestatusResponse:
        """
        Description: 禁用/启用限流规则
        Summary: 禁用/启用限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgServiceratelimitrulestatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceratelimitrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_serviceratelimitrulestatus_ex_async(
        self,
        request: ms_models.UpdateSgServiceratelimitrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgServiceratelimitrulestatusResponse:
        """
        Description: 禁用/启用限流规则
        Summary: 禁用/启用限流规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgServiceratelimitrulestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceratelimitrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_routerrulegroups(
        self,
        request: ms_models.AddSgRouterrulegroupsRequest,
    ) -> ms_models.AddSgRouterrulegroupsResponse:
        """
        Description: 添加服务路由规则
        Summary: 添加服务路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_routerrulegroups_ex(request, headers, runtime)

    async def add_sg_routerrulegroups_async(
        self,
        request: ms_models.AddSgRouterrulegroupsRequest,
    ) -> ms_models.AddSgRouterrulegroupsResponse:
        """
        Description: 添加服务路由规则
        Summary: 添加服务路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_routerrulegroups_ex_async(request, headers, runtime)

    def add_sg_routerrulegroups_ex(
        self,
        request: ms_models.AddSgRouterrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgRouterrulegroupsResponse:
        """
        Description: 添加服务路由规则
        Summary: 添加服务路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgRouterrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulegroups.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_routerrulegroups_ex_async(
        self,
        request: ms_models.AddSgRouterrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgRouterrulegroupsResponse:
        """
        Description: 添加服务路由规则
        Summary: 添加服务路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgRouterrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulegroups.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sg_routerrules(
        self,
        request: ms_models.GetSgRouterrulesRequest,
    ) -> ms_models.GetSgRouterrulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sg_routerrules_ex(request, headers, runtime)

    async def get_sg_routerrules_async(
        self,
        request: ms_models.GetSgRouterrulesRequest,
    ) -> ms_models.GetSgRouterrulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sg_routerrules_ex_async(request, headers, runtime)

    def get_sg_routerrules_ex(
        self,
        request: ms_models.GetSgRouterrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgRouterrulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgRouterrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrules.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sg_routerrules_ex_async(
        self,
        request: ms_models.GetSgRouterrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgRouterrulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgRouterrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrules.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_routerrulegroups(
        self,
        request: ms_models.UpdateSgRouterrulegroupsRequest,
    ) -> ms_models.UpdateSgRouterrulegroupsResponse:
        """
        Description: 更新服务路由规则
        Summary: 更新服务路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_routerrulegroups_ex(request, headers, runtime)

    async def update_sg_routerrulegroups_async(
        self,
        request: ms_models.UpdateSgRouterrulegroupsRequest,
    ) -> ms_models.UpdateSgRouterrulegroupsResponse:
        """
        Description: 更新服务路由规则
        Summary: 更新服务路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_routerrulegroups_ex_async(request, headers, runtime)

    def update_sg_routerrulegroups_ex(
        self,
        request: ms_models.UpdateSgRouterrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgRouterrulegroupsResponse:
        """
        Description: 更新服务路由规则
        Summary: 更新服务路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgRouterrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulegroups.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_routerrulegroups_ex_async(
        self,
        request: ms_models.UpdateSgRouterrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgRouterrulegroupsResponse:
        """
        Description: 更新服务路由规则
        Summary: 更新服务路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgRouterrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulegroups.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_routerrules(
        self,
        request: ms_models.EnableSgRouterrulesRequest,
    ) -> ms_models.EnableSgRouterrulesResponse:
        """
        Description: 微服务-启用路由器规则组
        Summary: 启用路由器规则组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_routerrules_ex(request, headers, runtime)

    async def enable_sg_routerrules_async(
        self,
        request: ms_models.EnableSgRouterrulesRequest,
    ) -> ms_models.EnableSgRouterrulesResponse:
        """
        Description: 微服务-启用路由器规则组
        Summary: 启用路由器规则组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_routerrules_ex_async(request, headers, runtime)

    def enable_sg_routerrules_ex(
        self,
        request: ms_models.EnableSgRouterrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgRouterrulesResponse:
        """
        Description: 微服务-启用路由器规则组
        Summary: 启用路由器规则组
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgRouterrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrules.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_routerrules_ex_async(
        self,
        request: ms_models.EnableSgRouterrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgRouterrulesResponse:
        """
        Description: 微服务-启用路由器规则组
        Summary: 启用路由器规则组
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgRouterrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrules.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_routerruleversions(
        self,
        request: ms_models.ListSgRouterruleversionsRequest,
    ) -> ms_models.ListSgRouterruleversionsResponse:
        """
        Description: 获取路由规则组版本列表
        Summary: 获取路由规则组版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_routerruleversions_ex(request, headers, runtime)

    async def list_sg_routerruleversions_async(
        self,
        request: ms_models.ListSgRouterruleversionsRequest,
    ) -> ms_models.ListSgRouterruleversionsResponse:
        """
        Description: 获取路由规则组版本列表
        Summary: 获取路由规则组版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_routerruleversions_ex_async(request, headers, runtime)

    def list_sg_routerruleversions_ex(
        self,
        request: ms_models.ListSgRouterruleversionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleversionsResponse:
        """
        Description: 获取路由规则组版本列表
        Summary: 获取路由规则组版本列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleversionsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerruleversions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_routerruleversions_ex_async(
        self,
        request: ms_models.ListSgRouterruleversionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleversionsResponse:
        """
        Description: 获取路由规则组版本列表
        Summary: 获取路由规则组版本列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleversionsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerruleversions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_routerrulestatus(
        self,
        request: ms_models.QuerySgRouterrulestatusRequest,
    ) -> ms_models.QuerySgRouterrulestatusResponse:
        """
        Description: 获取路由规则状态
        Summary: 获取路由规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_routerrulestatus_ex(request, headers, runtime)

    async def query_sg_routerrulestatus_async(
        self,
        request: ms_models.QuerySgRouterrulestatusRequest,
    ) -> ms_models.QuerySgRouterrulestatusResponse:
        """
        Description: 获取路由规则状态
        Summary: 获取路由规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_routerrulestatus_ex_async(request, headers, runtime)

    def query_sg_routerrulestatus_ex(
        self,
        request: ms_models.QuerySgRouterrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgRouterrulestatusResponse:
        """
        Description: 获取路由规则状态
        Summary: 获取路由规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgRouterrulestatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_routerrulestatus_ex_async(
        self,
        request: ms_models.QuerySgRouterrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgRouterrulestatusResponse:
        """
        Description: 获取路由规则状态
        Summary: 获取路由规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgRouterrulestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_authrules(
        self,
        request: ms_models.DeleteSgAuthrulesRequest,
    ) -> ms_models.DeleteSgAuthrulesResponse:
        """
        Description: 删除鉴权规则
        Summary: 删除鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_authrules_ex(request, headers, runtime)

    async def delete_sg_authrules_async(
        self,
        request: ms_models.DeleteSgAuthrulesRequest,
    ) -> ms_models.DeleteSgAuthrulesResponse:
        """
        Description: 删除鉴权规则
        Summary: 删除鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_authrules_ex_async(request, headers, runtime)

    def delete_sg_authrules_ex(
        self,
        request: ms_models.DeleteSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgAuthrulesResponse:
        """
        Description: 删除鉴权规则
        Summary: 删除鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgAuthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_authrules_ex_async(
        self,
        request: ms_models.DeleteSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgAuthrulesResponse:
        """
        Description: 删除鉴权规则
        Summary: 删除鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgAuthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_routerruleappnames(
        self,
        request: ms_models.ListSgRouterruleappnamesRequest,
    ) -> ms_models.ListSgRouterruleappnamesResponse:
        """
        Description: 微服务-通过DataId获取AppNames
        Summary: 通过DataId获取AppNames
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_routerruleappnames_ex(request, headers, runtime)

    async def list_sg_routerruleappnames_async(
        self,
        request: ms_models.ListSgRouterruleappnamesRequest,
    ) -> ms_models.ListSgRouterruleappnamesResponse:
        """
        Description: 微服务-通过DataId获取AppNames
        Summary: 通过DataId获取AppNames
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_routerruleappnames_ex_async(request, headers, runtime)

    def list_sg_routerruleappnames_ex(
        self,
        request: ms_models.ListSgRouterruleappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleappnamesResponse:
        """
        Description: 微服务-通过DataId获取AppNames
        Summary: 通过DataId获取AppNames
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleappnamesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerruleappnames.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_routerruleappnames_ex_async(
        self,
        request: ms_models.ListSgRouterruleappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleappnamesResponse:
        """
        Description: 微服务-通过DataId获取AppNames
        Summary: 通过DataId获取AppNames
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleappnamesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerruleappnames.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_authrulegroups(
        self,
        request: ms_models.EnableSgAuthrulegroupsRequest,
    ) -> ms_models.EnableSgAuthrulegroupsResponse:
        """
        Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
        Summary: 启用服务鉴权黑、白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_authrulegroups_ex(request, headers, runtime)

    async def enable_sg_authrulegroups_async(
        self,
        request: ms_models.EnableSgAuthrulegroupsRequest,
    ) -> ms_models.EnableSgAuthrulegroupsResponse:
        """
        Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
        Summary: 启用服务鉴权黑、白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_authrulegroups_ex_async(request, headers, runtime)

    def enable_sg_authrulegroups_ex(
        self,
        request: ms_models.EnableSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgAuthrulegroupsResponse:
        """
        Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
        Summary: 启用服务鉴权黑、白名单
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_authrulegroups_ex_async(
        self,
        request: ms_models.EnableSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgAuthrulegroupsResponse:
        """
        Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
        Summary: 启用服务鉴权黑、白名单
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sg_routerrulesnapshots(
        self,
        request: ms_models.GetSgRouterrulesnapshotsRequest,
    ) -> ms_models.GetSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-获取快照最后一个
        Summary: 获取快照最后一个
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sg_routerrulesnapshots_ex(request, headers, runtime)

    async def get_sg_routerrulesnapshots_async(
        self,
        request: ms_models.GetSgRouterrulesnapshotsRequest,
    ) -> ms_models.GetSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-获取快照最后一个
        Summary: 获取快照最后一个
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sg_routerrulesnapshots_ex_async(request, headers, runtime)

    def get_sg_routerrulesnapshots_ex(
        self,
        request: ms_models.GetSgRouterrulesnapshotsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-获取快照最后一个
        Summary: 获取快照最后一个
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgRouterrulesnapshotsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulesnapshots.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sg_routerrulesnapshots_ex_async(
        self,
        request: ms_models.GetSgRouterrulesnapshotsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-获取快照最后一个
        Summary: 获取快照最后一个
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgRouterrulesnapshotsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulesnapshots.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_sg_routerrulesnapshots(
        self,
        request: ms_models.RollbackSgRouterrulesnapshotsRequest,
    ) -> ms_models.RollbackSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-回滚快照最后一个
        Summary: 回滚快照最后一个
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_sg_routerrulesnapshots_ex(request, headers, runtime)

    async def rollback_sg_routerrulesnapshots_async(
        self,
        request: ms_models.RollbackSgRouterrulesnapshotsRequest,
    ) -> ms_models.RollbackSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-回滚快照最后一个
        Summary: 回滚快照最后一个
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_sg_routerrulesnapshots_ex_async(request, headers, runtime)

    def rollback_sg_routerrulesnapshots_ex(
        self,
        request: ms_models.RollbackSgRouterrulesnapshotsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.RollbackSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-回滚快照最后一个
        Summary: 回滚快照最后一个
        """
        UtilClient.validate_model(request)
        return ms_models.RollbackSgRouterrulesnapshotsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulesnapshots.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_sg_routerrulesnapshots_ex_async(
        self,
        request: ms_models.RollbackSgRouterrulesnapshotsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.RollbackSgRouterrulesnapshotsResponse:
        """
        Description: 微服务-回滚快照最后一个
        Summary: 回滚快照最后一个
        """
        UtilClient.validate_model(request)
        return ms_models.RollbackSgRouterrulesnapshotsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulesnapshots.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_routerruledispatchlogs(
        self,
        request: ms_models.QuerySgRouterruledispatchlogsRequest,
    ) -> ms_models.QuerySgRouterruledispatchlogsResponse:
        """
        Description: 微服务-获取调度日志
        Summary: 获取调度日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_routerruledispatchlogs_ex(request, headers, runtime)

    async def query_sg_routerruledispatchlogs_async(
        self,
        request: ms_models.QuerySgRouterruledispatchlogsRequest,
    ) -> ms_models.QuerySgRouterruledispatchlogsResponse:
        """
        Description: 微服务-获取调度日志
        Summary: 获取调度日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_routerruledispatchlogs_ex_async(request, headers, runtime)

    def query_sg_routerruledispatchlogs_ex(
        self,
        request: ms_models.QuerySgRouterruledispatchlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgRouterruledispatchlogsResponse:
        """
        Description: 微服务-获取调度日志
        Summary: 获取调度日志
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgRouterruledispatchlogsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerruledispatchlogs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_routerruledispatchlogs_ex_async(
        self,
        request: ms_models.QuerySgRouterruledispatchlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgRouterruledispatchlogsResponse:
        """
        Description: 微服务-获取调度日志
        Summary: 获取调度日志
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgRouterruledispatchlogsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerruledispatchlogs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_authrules(
        self,
        request: ms_models.AddSgAuthrulesRequest,
    ) -> ms_models.AddSgAuthrulesResponse:
        """
        Description: 添加一条白、黑名单规则
        Summary: 添加一条鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_authrules_ex(request, headers, runtime)

    async def add_sg_authrules_async(
        self,
        request: ms_models.AddSgAuthrulesRequest,
    ) -> ms_models.AddSgAuthrulesResponse:
        """
        Description: 添加一条白、黑名单规则
        Summary: 添加一条鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_authrules_ex_async(request, headers, runtime)

    def add_sg_authrules_ex(
        self,
        request: ms_models.AddSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgAuthrulesResponse:
        """
        Description: 添加一条白、黑名单规则
        Summary: 添加一条鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgAuthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_authrules_ex_async(
        self,
        request: ms_models.AddSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgAuthrulesResponse:
        """
        Description: 添加一条白、黑名单规则
        Summary: 添加一条鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgAuthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_authrules(
        self,
        request: ms_models.UpdateSgAuthrulesRequest,
    ) -> ms_models.UpdateSgAuthrulesResponse:
        """
        Description: 更新一条服务鉴权规则
        Summary: 更新一条服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_authrules_ex(request, headers, runtime)

    async def update_sg_authrules_async(
        self,
        request: ms_models.UpdateSgAuthrulesRequest,
    ) -> ms_models.UpdateSgAuthrulesResponse:
        """
        Description: 更新一条服务鉴权规则
        Summary: 更新一条服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_authrules_ex_async(request, headers, runtime)

    def update_sg_authrules_ex(
        self,
        request: ms_models.UpdateSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgAuthrulesResponse:
        """
        Description: 更新一条服务鉴权规则
        Summary: 更新一条服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgAuthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_authrules_ex_async(
        self,
        request: ms_models.UpdateSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgAuthrulesResponse:
        """
        Description: 更新一条服务鉴权规则
        Summary: 更新一条服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgAuthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sg_authrulegroups(
        self,
        request: ms_models.DisableSgAuthrulegroupsRequest,
    ) -> ms_models.DisableSgAuthrulegroupsResponse:
        """
        Description: 禁止一份服务鉴权黑、白名单
        Summary: 禁止一份服务鉴权黑、白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sg_authrulegroups_ex(request, headers, runtime)

    async def disable_sg_authrulegroups_async(
        self,
        request: ms_models.DisableSgAuthrulegroupsRequest,
    ) -> ms_models.DisableSgAuthrulegroupsResponse:
        """
        Description: 禁止一份服务鉴权黑、白名单
        Summary: 禁止一份服务鉴权黑、白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sg_authrulegroups_ex_async(request, headers, runtime)

    def disable_sg_authrulegroups_ex(
        self,
        request: ms_models.DisableSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgAuthrulegroupsResponse:
        """
        Description: 禁止一份服务鉴权黑、白名单
        Summary: 禁止一份服务鉴权黑、白名单
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sg_authrulegroups_ex_async(
        self,
        request: ms_models.DisableSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgAuthrulegroupsResponse:
        """
        Description: 禁止一份服务鉴权黑、白名单
        Summary: 禁止一份服务鉴权黑、白名单
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_apprelations(
        self,
        request: ms_models.QuerySgApprelationsRequest,
    ) -> ms_models.QuerySgApprelationsResponse:
        """
        Description: 获取应用关联数据
        Summary: 获取应用关联数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_apprelations_ex(request, headers, runtime)

    async def query_sg_apprelations_async(
        self,
        request: ms_models.QuerySgApprelationsRequest,
    ) -> ms_models.QuerySgApprelationsResponse:
        """
        Description: 获取应用关联数据
        Summary: 获取应用关联数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_apprelations_ex_async(request, headers, runtime)

    def query_sg_apprelations_ex(
        self,
        request: ms_models.QuerySgApprelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgApprelationsResponse:
        """
        Description: 获取应用关联数据
        Summary: 获取应用关联数据
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgApprelationsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.apprelations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_apprelations_ex_async(
        self,
        request: ms_models.QuerySgApprelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgApprelationsResponse:
        """
        Description: 获取应用关联数据
        Summary: 获取应用关联数据
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgApprelationsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.apprelations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_authrules(
        self,
        request: ms_models.EnableSgAuthrulesRequest,
    ) -> ms_models.EnableSgAuthrulesResponse:
        """
        Description: 启用服务鉴权规则
        Summary: 启用服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_authrules_ex(request, headers, runtime)

    async def enable_sg_authrules_async(
        self,
        request: ms_models.EnableSgAuthrulesRequest,
    ) -> ms_models.EnableSgAuthrulesResponse:
        """
        Description: 启用服务鉴权规则
        Summary: 启用服务鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_authrules_ex_async(request, headers, runtime)

    def enable_sg_authrules_ex(
        self,
        request: ms_models.EnableSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgAuthrulesResponse:
        """
        Description: 启用服务鉴权规则
        Summary: 启用服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgAuthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrules.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_authrules_ex_async(
        self,
        request: ms_models.EnableSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgAuthrulesResponse:
        """
        Description: 启用服务鉴权规则
        Summary: 启用服务鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgAuthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrules.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sg_authrules(
        self,
        request: ms_models.DisableSgAuthrulesRequest,
    ) -> ms_models.DisableSgAuthrulesResponse:
        """
        Description: 禁用黑、白名单中的一条规则
        Summary: 禁用黑、白名单中的一条规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sg_authrules_ex(request, headers, runtime)

    async def disable_sg_authrules_async(
        self,
        request: ms_models.DisableSgAuthrulesRequest,
    ) -> ms_models.DisableSgAuthrulesResponse:
        """
        Description: 禁用黑、白名单中的一条规则
        Summary: 禁用黑、白名单中的一条规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sg_authrules_ex_async(request, headers, runtime)

    def disable_sg_authrules_ex(
        self,
        request: ms_models.DisableSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgAuthrulesResponse:
        """
        Description: 禁用黑、白名单中的一条规则
        Summary: 禁用黑、白名单中的一条规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgAuthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrules.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sg_authrules_ex_async(
        self,
        request: ms_models.DisableSgAuthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgAuthrulesResponse:
        """
        Description: 禁用黑、白名单中的一条规则
        Summary: 禁用黑、白名单中的一条规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgAuthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrules.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicepubrelations(
        self,
        request: ms_models.QuerySgServicepubrelationsRequest,
    ) -> ms_models.QuerySgServicepubrelationsResponse:
        """
        Description: 获取服务发布者关系
        Summary: 获取服务发布者关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicepubrelations_ex(request, headers, runtime)

    async def query_sg_servicepubrelations_async(
        self,
        request: ms_models.QuerySgServicepubrelationsRequest,
    ) -> ms_models.QuerySgServicepubrelationsResponse:
        """
        Description: 获取服务发布者关系
        Summary: 获取服务发布者关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicepubrelations_ex_async(request, headers, runtime)

    def query_sg_servicepubrelations_ex(
        self,
        request: ms_models.QuerySgServicepubrelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepubrelationsResponse:
        """
        Description: 获取服务发布者关系
        Summary: 获取服务发布者关系
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepubrelationsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepubrelations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicepubrelations_ex_async(
        self,
        request: ms_models.QuerySgServicepubrelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepubrelationsResponse:
        """
        Description: 获取服务发布者关系
        Summary: 获取服务发布者关系
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepubrelationsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepubrelations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_sg_authrulegroups(
        self,
        request: ms_models.RetrySgAuthrulegroupsRequest,
    ) -> ms_models.RetrySgAuthrulegroupsResponse:
        """
        Description: 服务鉴权规则下发失败，重新下发规则
        Summary: 服务鉴权规则下发失败，重新下发规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_sg_authrulegroups_ex(request, headers, runtime)

    async def retry_sg_authrulegroups_async(
        self,
        request: ms_models.RetrySgAuthrulegroupsRequest,
    ) -> ms_models.RetrySgAuthrulegroupsResponse:
        """
        Description: 服务鉴权规则下发失败，重新下发规则
        Summary: 服务鉴权规则下发失败，重新下发规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_sg_authrulegroups_ex_async(request, headers, runtime)

    def retry_sg_authrulegroups_ex(
        self,
        request: ms_models.RetrySgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.RetrySgAuthrulegroupsResponse:
        """
        Description: 服务鉴权规则下发失败，重新下发规则
        Summary: 服务鉴权规则下发失败，重新下发规则
        """
        UtilClient.validate_model(request)
        return ms_models.RetrySgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_sg_authrulegroups_ex_async(
        self,
        request: ms_models.RetrySgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.RetrySgAuthrulegroupsResponse:
        """
        Description: 服务鉴权规则下发失败，重新下发规则
        Summary: 服务鉴权规则下发失败，重新下发规则
        """
        UtilClient.validate_model(request)
        return ms_models.RetrySgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicesubrelations(
        self,
        request: ms_models.QuerySgServicesubrelationsRequest,
    ) -> ms_models.QuerySgServicesubrelationsResponse:
        """
        Description: 获取服务消费者数据
        Summary: 获取服务消费者数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicesubrelations_ex(request, headers, runtime)

    async def query_sg_servicesubrelations_async(
        self,
        request: ms_models.QuerySgServicesubrelationsRequest,
    ) -> ms_models.QuerySgServicesubrelationsResponse:
        """
        Description: 获取服务消费者数据
        Summary: 获取服务消费者数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicesubrelations_ex_async(request, headers, runtime)

    def query_sg_servicesubrelations_ex(
        self,
        request: ms_models.QuerySgServicesubrelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubrelationsResponse:
        """
        Description: 获取服务消费者数据
        Summary: 获取服务消费者数据
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubrelationsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesubrelations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicesubrelations_ex_async(
        self,
        request: ms_models.QuerySgServicesubrelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubrelationsResponse:
        """
        Description: 获取服务消费者数据
        Summary: 获取服务消费者数据
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubrelationsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesubrelations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sg_relationswitch(
        self,
        request: ms_models.GetSgRelationswitchRequest,
    ) -> ms_models.GetSgRelationswitchResponse:
        """
        Description: 微服务-显示关系切换
        Summary: 显示关系切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sg_relationswitch_ex(request, headers, runtime)

    async def get_sg_relationswitch_async(
        self,
        request: ms_models.GetSgRelationswitchRequest,
    ) -> ms_models.GetSgRelationswitchResponse:
        """
        Description: 微服务-显示关系切换
        Summary: 显示关系切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sg_relationswitch_ex_async(request, headers, runtime)

    def get_sg_relationswitch_ex(
        self,
        request: ms_models.GetSgRelationswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgRelationswitchResponse:
        """
        Description: 微服务-显示关系切换
        Summary: 显示关系切换
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgRelationswitchResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.relationswitch.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sg_relationswitch_ex_async(
        self,
        request: ms_models.GetSgRelationswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgRelationswitchResponse:
        """
        Description: 微服务-显示关系切换
        Summary: 显示关系切换
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgRelationswitchResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.relationswitch.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_middleware_instance(
        self,
        request: ms_models.GetMiddlewareInstanceRequest,
    ) -> ms_models.GetMiddlewareInstanceResponse:
        """
        Description: 微服务-获取InstanceId
        Summary: 获取InstanceId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_middleware_instance_ex(request, headers, runtime)

    async def get_middleware_instance_async(
        self,
        request: ms_models.GetMiddlewareInstanceRequest,
    ) -> ms_models.GetMiddlewareInstanceResponse:
        """
        Description: 微服务-获取InstanceId
        Summary: 获取InstanceId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_middleware_instance_ex_async(request, headers, runtime)

    def get_middleware_instance_ex(
        self,
        request: ms_models.GetMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetMiddlewareInstanceResponse:
        """
        Description: 微服务-获取InstanceId
        Summary: 获取InstanceId
        """
        UtilClient.validate_model(request)
        return ms_models.GetMiddlewareInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.ms.middleware.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_middleware_instance_ex_async(
        self,
        request: ms_models.GetMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetMiddlewareInstanceResponse:
        """
        Description: 微服务-获取InstanceId
        Summary: 获取InstanceId
        """
        UtilClient.validate_model(request)
        return ms_models.GetMiddlewareInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.middleware.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sg_envconfig(
        self,
        request: ms_models.GetSgEnvconfigRequest,
    ) -> ms_models.GetSgEnvconfigResponse:
        """
        Description: 微服务-获取获取环境配置
        Summary: 获取获取环境配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sg_envconfig_ex(request, headers, runtime)

    async def get_sg_envconfig_async(
        self,
        request: ms_models.GetSgEnvconfigRequest,
    ) -> ms_models.GetSgEnvconfigResponse:
        """
        Description: 微服务-获取获取环境配置
        Summary: 获取获取环境配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sg_envconfig_ex_async(request, headers, runtime)

    def get_sg_envconfig_ex(
        self,
        request: ms_models.GetSgEnvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgEnvconfigResponse:
        """
        Description: 微服务-获取获取环境配置
        Summary: 获取获取环境配置
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgEnvconfigResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.envconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sg_envconfig_ex_async(
        self,
        request: ms_models.GetSgEnvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgEnvconfigResponse:
        """
        Description: 微服务-获取获取环境配置
        Summary: 获取获取环境配置
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgEnvconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.envconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_serviceapps(
        self,
        request: ms_models.ListSgServiceappsRequest,
    ) -> ms_models.ListSgServiceappsResponse:
        """
        Description: 获取发布服务的应用列表
        Summary: 获取发布服务的应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_serviceapps_ex(request, headers, runtime)

    async def list_sg_serviceapps_async(
        self,
        request: ms_models.ListSgServiceappsRequest,
    ) -> ms_models.ListSgServiceappsResponse:
        """
        Description: 获取发布服务的应用列表
        Summary: 获取发布服务的应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_serviceapps_ex_async(request, headers, runtime)

    def list_sg_serviceapps_ex(
        self,
        request: ms_models.ListSgServiceappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServiceappsResponse:
        """
        Description: 获取发布服务的应用列表
        Summary: 获取发布服务的应用列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServiceappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_serviceapps_ex_async(
        self,
        request: ms_models.ListSgServiceappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServiceappsResponse:
        """
        Description: 获取发布服务的应用列表
        Summary: 获取发布服务的应用列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServiceappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicekeyword(
        self,
        request: ms_models.QuerySgServicekeywordRequest,
    ) -> ms_models.QuerySgServicekeywordResponse:
        """
        Description: 获取服务候选词
        Summary: 获取服务候选词
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicekeyword_ex(request, headers, runtime)

    async def query_sg_servicekeyword_async(
        self,
        request: ms_models.QuerySgServicekeywordRequest,
    ) -> ms_models.QuerySgServicekeywordResponse:
        """
        Description: 获取服务候选词
        Summary: 获取服务候选词
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicekeyword_ex_async(request, headers, runtime)

    def query_sg_servicekeyword_ex(
        self,
        request: ms_models.QuerySgServicekeywordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicekeywordResponse:
        """
        Description: 获取服务候选词
        Summary: 获取服务候选词
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicekeywordResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicekeyword.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicekeyword_ex_async(
        self,
        request: ms_models.QuerySgServicekeywordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicekeywordResponse:
        """
        Description: 获取服务候选词
        Summary: 获取服务候选词
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicekeywordResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicekeyword.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_services(
        self,
        request: ms_models.QuerySgServicesRequest,
    ) -> ms_models.QuerySgServicesResponse:
        """
        Description: 微服务-根据关键词搜索
        Summary: 根据关键词搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_services_ex(request, headers, runtime)

    async def query_sg_services_async(
        self,
        request: ms_models.QuerySgServicesRequest,
    ) -> ms_models.QuerySgServicesResponse:
        """
        Description: 微服务-根据关键词搜索
        Summary: 根据关键词搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_services_ex_async(request, headers, runtime)

    def query_sg_services_ex(
        self,
        request: ms_models.QuerySgServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesResponse:
        """
        Description: 微服务-根据关键词搜索
        Summary: 根据关键词搜索
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.services.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_services_ex_async(
        self,
        request: ms_models.QuerySgServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesResponse:
        """
        Description: 微服务-根据关键词搜索
        Summary: 根据关键词搜索
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.services.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicepubkeys(
        self,
        request: ms_models.QuerySgServicepubkeysRequest,
    ) -> ms_models.QuerySgServicepubkeysResponse:
        """
        Description: 根据ip搜索服务提供方
        Summary: 根据ip搜索服务提供方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicepubkeys_ex(request, headers, runtime)

    async def query_sg_servicepubkeys_async(
        self,
        request: ms_models.QuerySgServicepubkeysRequest,
    ) -> ms_models.QuerySgServicepubkeysResponse:
        """
        Description: 根据ip搜索服务提供方
        Summary: 根据ip搜索服务提供方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicepubkeys_ex_async(request, headers, runtime)

    def query_sg_servicepubkeys_ex(
        self,
        request: ms_models.QuerySgServicepubkeysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepubkeysResponse:
        """
        Description: 根据ip搜索服务提供方
        Summary: 根据ip搜索服务提供方
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepubkeysResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepubkeys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicepubkeys_ex_async(
        self,
        request: ms_models.QuerySgServicepubkeysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepubkeysResponse:
        """
        Description: 根据ip搜索服务提供方
        Summary: 根据ip搜索服务提供方
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepubkeysResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepubkeys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicesubkeys(
        self,
        request: ms_models.QuerySgServicesubkeysRequest,
    ) -> ms_models.QuerySgServicesubkeysResponse:
        """
        Description: 根据ip搜索消费者
        Summary: 根据ip搜索消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicesubkeys_ex(request, headers, runtime)

    async def query_sg_servicesubkeys_async(
        self,
        request: ms_models.QuerySgServicesubkeysRequest,
    ) -> ms_models.QuerySgServicesubkeysResponse:
        """
        Description: 根据ip搜索消费者
        Summary: 根据ip搜索消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicesubkeys_ex_async(request, headers, runtime)

    def query_sg_servicesubkeys_ex(
        self,
        request: ms_models.QuerySgServicesubkeysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubkeysResponse:
        """
        Description: 根据ip搜索消费者
        Summary: 根据ip搜索消费者
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubkeysResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesubkeys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicesubkeys_ex_async(
        self,
        request: ms_models.QuerySgServicesubkeysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubkeysResponse:
        """
        Description: 根据ip搜索消费者
        Summary: 根据ip搜索消费者
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubkeysResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesubkeys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicepubs(
        self,
        request: ms_models.QuerySgServicepubsRequest,
    ) -> ms_models.QuerySgServicepubsResponse:
        """
        Description: 获取发布者服务详情
        Summary: 获取发布者服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicepubs_ex(request, headers, runtime)

    async def query_sg_servicepubs_async(
        self,
        request: ms_models.QuerySgServicepubsRequest,
    ) -> ms_models.QuerySgServicepubsResponse:
        """
        Description: 获取发布者服务详情
        Summary: 获取发布者服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicepubs_ex_async(request, headers, runtime)

    def query_sg_servicepubs_ex(
        self,
        request: ms_models.QuerySgServicepubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepubsResponse:
        """
        Description: 获取发布者服务详情
        Summary: 获取发布者服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepubsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepubs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicepubs_ex_async(
        self,
        request: ms_models.QuerySgServicepubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicepubsResponse:
        """
        Description: 获取发布者服务详情
        Summary: 获取发布者服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicepubsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepubs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicesubs(
        self,
        request: ms_models.QuerySgServicesubsRequest,
    ) -> ms_models.QuerySgServicesubsResponse:
        """
        Description: 获取订阅者服务详情
        Summary: 获取订阅者服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicesubs_ex(request, headers, runtime)

    async def query_sg_servicesubs_async(
        self,
        request: ms_models.QuerySgServicesubsRequest,
    ) -> ms_models.QuerySgServicesubsResponse:
        """
        Description: 获取订阅者服务详情
        Summary: 获取订阅者服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicesubs_ex_async(request, headers, runtime)

    def query_sg_servicesubs_ex(
        self,
        request: ms_models.QuerySgServicesubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubsResponse:
        """
        Description: 获取订阅者服务详情
        Summary: 获取订阅者服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesubs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicesubs_ex_async(
        self,
        request: ms_models.QuerySgServicesubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesubsResponse:
        """
        Description: 获取订阅者服务详情
        Summary: 获取订阅者服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesubsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesubs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_servicepubs(
        self,
        request: ms_models.ListSgServicepubsRequest,
    ) -> ms_models.ListSgServicepubsResponse:
        """
        Description: 微服务-通过DataId和IP获取pub服务详情
        Summary: 通过DataId和IP获取pub服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_servicepubs_ex(request, headers, runtime)

    async def list_sg_servicepubs_async(
        self,
        request: ms_models.ListSgServicepubsRequest,
    ) -> ms_models.ListSgServicepubsResponse:
        """
        Description: 微服务-通过DataId和IP获取pub服务详情
        Summary: 通过DataId和IP获取pub服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_servicepubs_ex_async(request, headers, runtime)

    def list_sg_servicepubs_ex(
        self,
        request: ms_models.ListSgServicepubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServicepubsResponse:
        """
        Description: 微服务-通过DataId和IP获取pub服务详情
        Summary: 通过DataId和IP获取pub服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServicepubsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepubs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_servicepubs_ex_async(
        self,
        request: ms_models.ListSgServicepubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServicepubsResponse:
        """
        Description: 微服务-通过DataId和IP获取pub服务详情
        Summary: 通过DataId和IP获取pub服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServicepubsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepubs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_servicesubs(
        self,
        request: ms_models.ListSgServicesubsRequest,
    ) -> ms_models.ListSgServicesubsResponse:
        """
        Description: 微服务-通过DataId和IP获取sub服务详情
        Summary: 通过DataId和IP获取sub服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_servicesubs_ex(request, headers, runtime)

    async def list_sg_servicesubs_async(
        self,
        request: ms_models.ListSgServicesubsRequest,
    ) -> ms_models.ListSgServicesubsResponse:
        """
        Description: 微服务-通过DataId和IP获取sub服务详情
        Summary: 通过DataId和IP获取sub服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_servicesubs_ex_async(request, headers, runtime)

    def list_sg_servicesubs_ex(
        self,
        request: ms_models.ListSgServicesubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServicesubsResponse:
        """
        Description: 微服务-通过DataId和IP获取sub服务详情
        Summary: 通过DataId和IP获取sub服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServicesubsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesubs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_servicesubs_ex_async(
        self,
        request: ms_models.ListSgServicesubsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServicesubsResponse:
        """
        Description: 微服务-通过DataId和IP获取sub服务详情
        Summary: 通过DataId和IP获取sub服务详情
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServicesubsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesubs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_servicesummarys(
        self,
        request: ms_models.QuerySgServicesummarysRequest,
    ) -> ms_models.QuerySgServicesummarysResponse:
        """
        Description: 微服务-获取服务汇总信息
        Summary: 获取服务汇总信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_servicesummarys_ex(request, headers, runtime)

    async def query_sg_servicesummarys_async(
        self,
        request: ms_models.QuerySgServicesummarysRequest,
    ) -> ms_models.QuerySgServicesummarysResponse:
        """
        Description: 微服务-获取服务汇总信息
        Summary: 获取服务汇总信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_servicesummarys_ex_async(request, headers, runtime)

    def query_sg_servicesummarys_ex(
        self,
        request: ms_models.QuerySgServicesummarysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesummarysResponse:
        """
        Description: 微服务-获取服务汇总信息
        Summary: 获取服务汇总信息
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesummarysResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicesummarys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_servicesummarys_ex_async(
        self,
        request: ms_models.QuerySgServicesummarysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgServicesummarysResponse:
        """
        Description: 微服务-获取服务汇总信息
        Summary: 获取服务汇总信息
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgServicesummarysResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicesummarys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sg_serviceparams(
        self,
        request: ms_models.DisableSgServiceparamsRequest,
    ) -> ms_models.DisableSgServiceparamsResponse:
        """
        Description: 禁用一个服务下某个服务提供者
        Summary: 禁用一个服务下某个服务提供者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sg_serviceparams_ex(request, headers, runtime)

    async def disable_sg_serviceparams_async(
        self,
        request: ms_models.DisableSgServiceparamsRequest,
    ) -> ms_models.DisableSgServiceparamsResponse:
        """
        Description: 禁用一个服务下某个服务提供者
        Summary: 禁用一个服务下某个服务提供者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sg_serviceparams_ex_async(request, headers, runtime)

    def disable_sg_serviceparams_ex(
        self,
        request: ms_models.DisableSgServiceparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgServiceparamsResponse:
        """
        Description: 禁用一个服务下某个服务提供者
        Summary: 禁用一个服务下某个服务提供者
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgServiceparamsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceparams.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sg_serviceparams_ex_async(
        self,
        request: ms_models.DisableSgServiceparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgServiceparamsResponse:
        """
        Description: 禁用一个服务下某个服务提供者
        Summary: 禁用一个服务下某个服务提供者
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgServiceparamsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceparams.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_serviceparams(
        self,
        request: ms_models.EnableSgServiceparamsRequest,
    ) -> ms_models.EnableSgServiceparamsResponse:
        """
        Description: 启动一个服务下某个服务提供者
        Summary: 启动一个服务下某个服务提供者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_serviceparams_ex(request, headers, runtime)

    async def enable_sg_serviceparams_async(
        self,
        request: ms_models.EnableSgServiceparamsRequest,
    ) -> ms_models.EnableSgServiceparamsResponse:
        """
        Description: 启动一个服务下某个服务提供者
        Summary: 启动一个服务下某个服务提供者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_serviceparams_ex_async(request, headers, runtime)

    def enable_sg_serviceparams_ex(
        self,
        request: ms_models.EnableSgServiceparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgServiceparamsResponse:
        """
        Description: 启动一个服务下某个服务提供者
        Summary: 启动一个服务下某个服务提供者
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgServiceparamsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceparams.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_serviceparams_ex_async(
        self,
        request: ms_models.EnableSgServiceparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgServiceparamsResponse:
        """
        Description: 启动一个服务下某个服务提供者
        Summary: 启动一个服务下某个服务提供者
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgServiceparamsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceparams.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_sg_serviceparamweight(
        self,
        request: ms_models.SetSgServiceparamweightRequest,
    ) -> ms_models.SetSgServiceparamweightResponse:
        """
        Description: 设置服务提供者权重
        Summary: 设置服务提供者权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_sg_serviceparamweight_ex(request, headers, runtime)

    async def set_sg_serviceparamweight_async(
        self,
        request: ms_models.SetSgServiceparamweightRequest,
    ) -> ms_models.SetSgServiceparamweightResponse:
        """
        Description: 设置服务提供者权重
        Summary: 设置服务提供者权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_sg_serviceparamweight_ex_async(request, headers, runtime)

    def set_sg_serviceparamweight_ex(
        self,
        request: ms_models.SetSgServiceparamweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SetSgServiceparamweightResponse:
        """
        Description: 设置服务提供者权重
        Summary: 设置服务提供者权重
        """
        UtilClient.validate_model(request)
        return ms_models.SetSgServiceparamweightResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceparamweight.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_sg_serviceparamweight_ex_async(
        self,
        request: ms_models.SetSgServiceparamweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SetSgServiceparamweightResponse:
        """
        Description: 设置服务提供者权重
        Summary: 设置服务提供者权重
        """
        UtilClient.validate_model(request)
        return ms_models.SetSgServiceparamweightResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceparamweight.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_sg_serviceparams(
        self,
        request: ms_models.ReinitSgServiceparamsRequest,
    ) -> ms_models.ReinitSgServiceparamsResponse:
        """
        Description: 恢复服务提供者默认设置
        Summary: 恢复服务提供者默认设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_sg_serviceparams_ex(request, headers, runtime)

    async def reinit_sg_serviceparams_async(
        self,
        request: ms_models.ReinitSgServiceparamsRequest,
    ) -> ms_models.ReinitSgServiceparamsResponse:
        """
        Description: 恢复服务提供者默认设置
        Summary: 恢复服务提供者默认设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_sg_serviceparams_ex_async(request, headers, runtime)

    def reinit_sg_serviceparams_ex(
        self,
        request: ms_models.ReinitSgServiceparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ReinitSgServiceparamsResponse:
        """
        Description: 恢复服务提供者默认设置
        Summary: 恢复服务提供者默认设置
        """
        UtilClient.validate_model(request)
        return ms_models.ReinitSgServiceparamsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceparams.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_sg_serviceparams_ex_async(
        self,
        request: ms_models.ReinitSgServiceparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ReinitSgServiceparamsResponse:
        """
        Description: 恢复服务提供者默认设置
        Summary: 恢复服务提供者默认设置
        """
        UtilClient.validate_model(request)
        return ms_models.ReinitSgServiceparamsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceparams.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_sg_serviceparam(
        self,
        request: ms_models.BatchquerySgServiceparamRequest,
    ) -> ms_models.BatchquerySgServiceparamResponse:
        """
        Description: 微服务-查询全部服务参数信息
        Summary: 查询全部服务参数信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_sg_serviceparam_ex(request, headers, runtime)

    async def batchquery_sg_serviceparam_async(
        self,
        request: ms_models.BatchquerySgServiceparamRequest,
    ) -> ms_models.BatchquerySgServiceparamResponse:
        """
        Description: 微服务-查询全部服务参数信息
        Summary: 查询全部服务参数信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_sg_serviceparam_ex_async(request, headers, runtime)

    def batchquery_sg_serviceparam_ex(
        self,
        request: ms_models.BatchquerySgServiceparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.BatchquerySgServiceparamResponse:
        """
        Description: 微服务-查询全部服务参数信息
        Summary: 查询全部服务参数信息
        """
        UtilClient.validate_model(request)
        return ms_models.BatchquerySgServiceparamResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceparam.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_sg_serviceparam_ex_async(
        self,
        request: ms_models.BatchquerySgServiceparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.BatchquerySgServiceparamResponse:
        """
        Description: 微服务-查询全部服务参数信息
        Summary: 查询全部服务参数信息
        """
        UtilClient.validate_model(request)
        return ms_models.BatchquerySgServiceparamResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceparam.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_sidecar(
        self,
        request: ms_models.QueryMeshSidecarRequest,
    ) -> ms_models.QueryMeshSidecarResponse:
        """
        Description: 查询注入了指定类型的sidecar 的Pod 实例
        Summary: sidecar实例查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_sidecar_ex(request, headers, runtime)

    async def query_mesh_sidecar_async(
        self,
        request: ms_models.QueryMeshSidecarRequest,
    ) -> ms_models.QueryMeshSidecarResponse:
        """
        Description: 查询注入了指定类型的sidecar 的Pod 实例
        Summary: sidecar实例查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_sidecar_ex_async(request, headers, runtime)

    def query_mesh_sidecar_ex(
        self,
        request: ms_models.QueryMeshSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryMeshSidecarResponse:
        """
        Description: 查询注入了指定类型的sidecar 的Pod 实例
        Summary: sidecar实例查询
        """
        UtilClient.validate_model(request)
        return ms_models.QueryMeshSidecarResponse().from_map(
            self.do_request('2.0', 'sofa.ms.mesh.sidecar.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_sidecar_ex_async(
        self,
        request: ms_models.QueryMeshSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryMeshSidecarResponse:
        """
        Description: 查询注入了指定类型的sidecar 的Pod 实例
        Summary: sidecar实例查询
        """
        UtilClient.validate_model(request)
        return ms_models.QueryMeshSidecarResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.mesh.sidecar.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_guardian_guardianconfig(
        self,
        request: ms_models.GetGuardianGuardianconfigRequest,
    ) -> ms_models.GetGuardianGuardianconfigResponse:
        """
        Description: 微服务-配置获取
        Summary: 配置获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_guardian_guardianconfig_ex(request, headers, runtime)

    async def get_guardian_guardianconfig_async(
        self,
        request: ms_models.GetGuardianGuardianconfigRequest,
    ) -> ms_models.GetGuardianGuardianconfigResponse:
        """
        Description: 微服务-配置获取
        Summary: 配置获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_guardian_guardianconfig_ex_async(request, headers, runtime)

    def get_guardian_guardianconfig_ex(
        self,
        request: ms_models.GetGuardianGuardianconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetGuardianGuardianconfigResponse:
        """
        Description: 微服务-配置获取
        Summary: 配置获取
        """
        UtilClient.validate_model(request)
        return ms_models.GetGuardianGuardianconfigResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_guardian_guardianconfig_ex_async(
        self,
        request: ms_models.GetGuardianGuardianconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetGuardianGuardianconfigResponse:
        """
        Description: 微服务-配置获取
        Summary: 配置获取
        """
        UtilClient.validate_model(request)
        return ms_models.GetGuardianGuardianconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_guardian_guardianapps(
        self,
        request: ms_models.AllGuardianGuardianappsRequest,
    ) -> ms_models.AllGuardianGuardianappsResponse:
        """
        Description: 微服务-获取app列表
        Summary: 获取app列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_guardian_guardianapps_ex(request, headers, runtime)

    async def all_guardian_guardianapps_async(
        self,
        request: ms_models.AllGuardianGuardianappsRequest,
    ) -> ms_models.AllGuardianGuardianappsResponse:
        """
        Description: 微服务-获取app列表
        Summary: 获取app列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_guardian_guardianapps_ex_async(request, headers, runtime)

    def all_guardian_guardianapps_ex(
        self,
        request: ms_models.AllGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllGuardianGuardianappsResponse:
        """
        Description: 微服务-获取app列表
        Summary: 获取app列表
        """
        UtilClient.validate_model(request)
        return ms_models.AllGuardianGuardianappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianapps.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_guardian_guardianapps_ex_async(
        self,
        request: ms_models.AllGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllGuardianGuardianappsResponse:
        """
        Description: 微服务-获取app列表
        Summary: 获取app列表
        """
        UtilClient.validate_model(request)
        return ms_models.AllGuardianGuardianappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianapps.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_guardian_guardianappnames(
        self,
        request: ms_models.AllGuardianGuardianappnamesRequest,
    ) -> ms_models.AllGuardianGuardianappnamesResponse:
        """
        Description: 微服务-查询appName列表
        Summary: 查询appName列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_guardian_guardianappnames_ex(request, headers, runtime)

    async def all_guardian_guardianappnames_async(
        self,
        request: ms_models.AllGuardianGuardianappnamesRequest,
    ) -> ms_models.AllGuardianGuardianappnamesResponse:
        """
        Description: 微服务-查询appName列表
        Summary: 查询appName列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_guardian_guardianappnames_ex_async(request, headers, runtime)

    def all_guardian_guardianappnames_ex(
        self,
        request: ms_models.AllGuardianGuardianappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllGuardianGuardianappnamesResponse:
        """
        Description: 微服务-查询appName列表
        Summary: 查询appName列表
        """
        UtilClient.validate_model(request)
        return ms_models.AllGuardianGuardianappnamesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianappnames.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_guardian_guardianappnames_ex_async(
        self,
        request: ms_models.AllGuardianGuardianappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllGuardianGuardianappnamesResponse:
        """
        Description: 微服务-查询appName列表
        Summary: 查询appName列表
        """
        UtilClient.validate_model(request)
        return ms_models.AllGuardianGuardianappnamesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianappnames.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guardian_guardianapps(
        self,
        request: ms_models.QueryGuardianGuardianappsRequest,
    ) -> ms_models.QueryGuardianGuardianappsResponse:
        """
        Description: 微服务-分页查询app
        Summary: 分页查询app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guardian_guardianapps_ex(request, headers, runtime)

    async def query_guardian_guardianapps_async(
        self,
        request: ms_models.QueryGuardianGuardianappsRequest,
    ) -> ms_models.QueryGuardianGuardianappsResponse:
        """
        Description: 微服务-分页查询app
        Summary: 分页查询app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guardian_guardianapps_ex_async(request, headers, runtime)

    def query_guardian_guardianapps_ex(
        self,
        request: ms_models.QueryGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryGuardianGuardianappsResponse:
        """
        Description: 微服务-分页查询app
        Summary: 分页查询app
        """
        UtilClient.validate_model(request)
        return ms_models.QueryGuardianGuardianappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianapps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guardian_guardianapps_ex_async(
        self,
        request: ms_models.QueryGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryGuardianGuardianappsResponse:
        """
        Description: 微服务-分页查询app
        Summary: 分页查询app
        """
        UtilClient.validate_model(request)
        return ms_models.QueryGuardianGuardianappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianapps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_guardian_guardianapps(
        self,
        request: ms_models.GetGuardianGuardianappsRequest,
    ) -> ms_models.GetGuardianGuardianappsResponse:
        """
        Description: ms -根据appName获取app
        Summary: 根据appName获取app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_guardian_guardianapps_ex(request, headers, runtime)

    async def get_guardian_guardianapps_async(
        self,
        request: ms_models.GetGuardianGuardianappsRequest,
    ) -> ms_models.GetGuardianGuardianappsResponse:
        """
        Description: ms -根据appName获取app
        Summary: 根据appName获取app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_guardian_guardianapps_ex_async(request, headers, runtime)

    def get_guardian_guardianapps_ex(
        self,
        request: ms_models.GetGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetGuardianGuardianappsResponse:
        """
        Description: ms -根据appName获取app
        Summary: 根据appName获取app
        """
        UtilClient.validate_model(request)
        return ms_models.GetGuardianGuardianappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianapps.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_guardian_guardianapps_ex_async(
        self,
        request: ms_models.GetGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetGuardianGuardianappsResponse:
        """
        Description: ms -根据appName获取app
        Summary: 根据appName获取app
        """
        UtilClient.validate_model(request)
        return ms_models.GetGuardianGuardianappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianapps.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_guardian_guardianapps(
        self,
        request: ms_models.AddGuardianGuardianappsRequest,
    ) -> ms_models.AddGuardianGuardianappsResponse:
        """
        Description: ms-添加 监控App
        Summary: 添加 监控App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_guardian_guardianapps_ex(request, headers, runtime)

    async def add_guardian_guardianapps_async(
        self,
        request: ms_models.AddGuardianGuardianappsRequest,
    ) -> ms_models.AddGuardianGuardianappsResponse:
        """
        Description: ms-添加 监控App
        Summary: 添加 监控App
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_guardian_guardianapps_ex_async(request, headers, runtime)

    def add_guardian_guardianapps_ex(
        self,
        request: ms_models.AddGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddGuardianGuardianappsResponse:
        """
        Description: ms-添加 监控App
        Summary: 添加 监控App
        """
        UtilClient.validate_model(request)
        return ms_models.AddGuardianGuardianappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianapps.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_guardian_guardianapps_ex_async(
        self,
        request: ms_models.AddGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddGuardianGuardianappsResponse:
        """
        Description: ms-添加 监控App
        Summary: 添加 监控App
        """
        UtilClient.validate_model(request)
        return ms_models.AddGuardianGuardianappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianapps.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_guardian_guardianapps(
        self,
        request: ms_models.UpdateGuardianGuardianappsRequest,
    ) -> ms_models.UpdateGuardianGuardianappsResponse:
        """
        Description: ws-更新监控app
        Summary: 更新监控app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_guardian_guardianapps_ex(request, headers, runtime)

    async def update_guardian_guardianapps_async(
        self,
        request: ms_models.UpdateGuardianGuardianappsRequest,
    ) -> ms_models.UpdateGuardianGuardianappsResponse:
        """
        Description: ws-更新监控app
        Summary: 更新监控app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_guardian_guardianapps_ex_async(request, headers, runtime)

    def update_guardian_guardianapps_ex(
        self,
        request: ms_models.UpdateGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardianappsResponse:
        """
        Description: ws-更新监控app
        Summary: 更新监控app
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardianappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianapps.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_guardian_guardianapps_ex_async(
        self,
        request: ms_models.UpdateGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardianappsResponse:
        """
        Description: ws-更新监控app
        Summary: 更新监控app
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardianappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianapps.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_guardian_guardianapps(
        self,
        request: ms_models.DeleteGuardianGuardianappsRequest,
    ) -> ms_models.DeleteGuardianGuardianappsResponse:
        """
        Description: ms- 删除监控 app
        Summary: 删除监控 app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_guardian_guardianapps_ex(request, headers, runtime)

    async def delete_guardian_guardianapps_async(
        self,
        request: ms_models.DeleteGuardianGuardianappsRequest,
    ) -> ms_models.DeleteGuardianGuardianappsResponse:
        """
        Description: ms- 删除监控 app
        Summary: 删除监控 app
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_guardian_guardianapps_ex_async(request, headers, runtime)

    def delete_guardian_guardianapps_ex(
        self,
        request: ms_models.DeleteGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteGuardianGuardianappsResponse:
        """
        Description: ms- 删除监控 app
        Summary: 删除监控 app
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteGuardianGuardianappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianapps.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_guardian_guardianapps_ex_async(
        self,
        request: ms_models.DeleteGuardianGuardianappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteGuardianGuardianappsResponse:
        """
        Description: ms- 删除监控 app
        Summary: 删除监控 app
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteGuardianGuardianappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianapps.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guardian_guardianrules(
        self,
        request: ms_models.QueryGuardianGuardianrulesRequest,
    ) -> ms_models.QueryGuardianGuardianrulesResponse:
        """
        Description: ms - 规则配置分页
        Summary: 规则配置分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guardian_guardianrules_ex(request, headers, runtime)

    async def query_guardian_guardianrules_async(
        self,
        request: ms_models.QueryGuardianGuardianrulesRequest,
    ) -> ms_models.QueryGuardianGuardianrulesResponse:
        """
        Description: ms - 规则配置分页
        Summary: 规则配置分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guardian_guardianrules_ex_async(request, headers, runtime)

    def query_guardian_guardianrules_ex(
        self,
        request: ms_models.QueryGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryGuardianGuardianrulesResponse:
        """
        Description: ms - 规则配置分页
        Summary: 规则配置分页
        """
        UtilClient.validate_model(request)
        return ms_models.QueryGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guardian_guardianrules_ex_async(
        self,
        request: ms_models.QueryGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryGuardianGuardianrulesResponse:
        """
        Description: ms - 规则配置分页
        Summary: 规则配置分页
        """
        UtilClient.validate_model(request)
        return ms_models.QueryGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_guardian_guardianrules(
        self,
        request: ms_models.GetGuardianGuardianrulesRequest,
    ) -> ms_models.GetGuardianGuardianrulesResponse:
        """
        Description: ms-根据id获取规则
        Summary: 根据id获取规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_guardian_guardianrules_ex(request, headers, runtime)

    async def get_guardian_guardianrules_async(
        self,
        request: ms_models.GetGuardianGuardianrulesRequest,
    ) -> ms_models.GetGuardianGuardianrulesResponse:
        """
        Description: ms-根据id获取规则
        Summary: 根据id获取规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_guardian_guardianrules_ex_async(request, headers, runtime)

    def get_guardian_guardianrules_ex(
        self,
        request: ms_models.GetGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetGuardianGuardianrulesResponse:
        """
        Description: ms-根据id获取规则
        Summary: 根据id获取规则
        """
        UtilClient.validate_model(request)
        return ms_models.GetGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_guardian_guardianrules_ex_async(
        self,
        request: ms_models.GetGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetGuardianGuardianrulesResponse:
        """
        Description: ms-根据id获取规则
        Summary: 根据id获取规则
        """
        UtilClient.validate_model(request)
        return ms_models.GetGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_guardian_guardianrules(
        self,
        request: ms_models.AddGuardianGuardianrulesRequest,
    ) -> ms_models.AddGuardianGuardianrulesResponse:
        """
        Description: ms-添加规则
        Summary: 添加规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_guardian_guardianrules_ex(request, headers, runtime)

    async def add_guardian_guardianrules_async(
        self,
        request: ms_models.AddGuardianGuardianrulesRequest,
    ) -> ms_models.AddGuardianGuardianrulesResponse:
        """
        Description: ms-添加规则
        Summary: 添加规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_guardian_guardianrules_ex_async(request, headers, runtime)

    def add_guardian_guardianrules_ex(
        self,
        request: ms_models.AddGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddGuardianGuardianrulesResponse:
        """
        Description: ms-添加规则
        Summary: 添加规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_guardian_guardianrules_ex_async(
        self,
        request: ms_models.AddGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddGuardianGuardianrulesResponse:
        """
        Description: ms-添加规则
        Summary: 添加规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_guardian_guardianrules(
        self,
        request: ms_models.UpdateGuardianGuardianrulesRequest,
    ) -> ms_models.UpdateGuardianGuardianrulesResponse:
        """
        Description: ms-更新规则
        Summary: 更新规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_guardian_guardianrules_ex(request, headers, runtime)

    async def update_guardian_guardianrules_async(
        self,
        request: ms_models.UpdateGuardianGuardianrulesRequest,
    ) -> ms_models.UpdateGuardianGuardianrulesResponse:
        """
        Description: ms-更新规则
        Summary: 更新规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_guardian_guardianrules_ex_async(request, headers, runtime)

    def update_guardian_guardianrules_ex(
        self,
        request: ms_models.UpdateGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardianrulesResponse:
        """
        Description: ms-更新规则
        Summary: 更新规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_guardian_guardianrules_ex_async(
        self,
        request: ms_models.UpdateGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardianrulesResponse:
        """
        Description: ms-更新规则
        Summary: 更新规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_guardian_guardianrulestatus(
        self,
        request: ms_models.UpdateGuardianGuardianrulestatusRequest,
    ) -> ms_models.UpdateGuardianGuardianrulestatusResponse:
        """
        Description: ms-更新规则状态
        Summary: 更新规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_guardian_guardianrulestatus_ex(request, headers, runtime)

    async def update_guardian_guardianrulestatus_async(
        self,
        request: ms_models.UpdateGuardianGuardianrulestatusRequest,
    ) -> ms_models.UpdateGuardianGuardianrulestatusResponse:
        """
        Description: ms-更新规则状态
        Summary: 更新规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_guardian_guardianrulestatus_ex_async(request, headers, runtime)

    def update_guardian_guardianrulestatus_ex(
        self,
        request: ms_models.UpdateGuardianGuardianrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardianrulestatusResponse:
        """
        Description: ms-更新规则状态
        Summary: 更新规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardianrulestatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_guardian_guardianrulestatus_ex_async(
        self,
        request: ms_models.UpdateGuardianGuardianrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardianrulestatusResponse:
        """
        Description: ms-更新规则状态
        Summary: 更新规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardianrulestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_guardian_guardianrules(
        self,
        request: ms_models.DeleteGuardianGuardianrulesRequest,
    ) -> ms_models.DeleteGuardianGuardianrulesResponse:
        """
        Description: ms-删除规则
        Summary: 删除规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_guardian_guardianrules_ex(request, headers, runtime)

    async def delete_guardian_guardianrules_async(
        self,
        request: ms_models.DeleteGuardianGuardianrulesRequest,
    ) -> ms_models.DeleteGuardianGuardianrulesResponse:
        """
        Description: ms-删除规则
        Summary: 删除规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_guardian_guardianrules_ex_async(request, headers, runtime)

    def delete_guardian_guardianrules_ex(
        self,
        request: ms_models.DeleteGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteGuardianGuardianrulesResponse:
        """
        Description: ms-删除规则
        Summary: 删除规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_guardian_guardianrules_ex_async(
        self,
        request: ms_models.DeleteGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteGuardianGuardianrulesResponse:
        """
        Description: ms-删除规则
        Summary: 删除规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guardian_guardianrulepushhistorys(
        self,
        request: ms_models.QueryGuardianGuardianrulepushhistorysRequest,
    ) -> ms_models.QueryGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-分页查询推送历史
        Summary: 分页查询推送历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guardian_guardianrulepushhistorys_ex(request, headers, runtime)

    async def query_guardian_guardianrulepushhistorys_async(
        self,
        request: ms_models.QueryGuardianGuardianrulepushhistorysRequest,
    ) -> ms_models.QueryGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-分页查询推送历史
        Summary: 分页查询推送历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guardian_guardianrulepushhistorys_ex_async(request, headers, runtime)

    def query_guardian_guardianrulepushhistorys_ex(
        self,
        request: ms_models.QueryGuardianGuardianrulepushhistorysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-分页查询推送历史
        Summary: 分页查询推送历史
        """
        UtilClient.validate_model(request)
        return ms_models.QueryGuardianGuardianrulepushhistorysResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrulepushhistorys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guardian_guardianrulepushhistorys_ex_async(
        self,
        request: ms_models.QueryGuardianGuardianrulepushhistorysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-分页查询推送历史
        Summary: 分页查询推送历史
        """
        UtilClient.validate_model(request)
        return ms_models.QueryGuardianGuardianrulepushhistorysResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrulepushhistorys.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_guardian_guardianrulepushhistorys(
        self,
        request: ms_models.ListGuardianGuardianrulepushhistorysRequest,
    ) -> ms_models.ListGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-查询推送历史
        Summary: 查询推送历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_guardian_guardianrulepushhistorys_ex(request, headers, runtime)

    async def list_guardian_guardianrulepushhistorys_async(
        self,
        request: ms_models.ListGuardianGuardianrulepushhistorysRequest,
    ) -> ms_models.ListGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-查询推送历史
        Summary: 查询推送历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_guardian_guardianrulepushhistorys_ex_async(request, headers, runtime)

    def list_guardian_guardianrulepushhistorys_ex(
        self,
        request: ms_models.ListGuardianGuardianrulepushhistorysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-查询推送历史
        Summary: 查询推送历史
        """
        UtilClient.validate_model(request)
        return ms_models.ListGuardianGuardianrulepushhistorysResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrulepushhistorys.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_guardian_guardianrulepushhistorys_ex_async(
        self,
        request: ms_models.ListGuardianGuardianrulepushhistorysRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListGuardianGuardianrulepushhistorysResponse:
        """
        Description: ms-查询推送历史
        Summary: 查询推送历史
        """
        UtilClient.validate_model(request)
        return ms_models.ListGuardianGuardianrulepushhistorysResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrulepushhistorys.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_guardian_guardiangrayrules(
        self,
        request: ms_models.AddGuardianGuardiangrayrulesRequest,
    ) -> ms_models.AddGuardianGuardiangrayrulesResponse:
        """
        Description: ms-灰度推送
        Summary: 灰度推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_guardian_guardiangrayrules_ex(request, headers, runtime)

    async def add_guardian_guardiangrayrules_async(
        self,
        request: ms_models.AddGuardianGuardiangrayrulesRequest,
    ) -> ms_models.AddGuardianGuardiangrayrulesResponse:
        """
        Description: ms-灰度推送
        Summary: 灰度推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_guardian_guardiangrayrules_ex_async(request, headers, runtime)

    def add_guardian_guardiangrayrules_ex(
        self,
        request: ms_models.AddGuardianGuardiangrayrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddGuardianGuardiangrayrulesResponse:
        """
        Description: ms-灰度推送
        Summary: 灰度推送
        """
        UtilClient.validate_model(request)
        return ms_models.AddGuardianGuardiangrayrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardiangrayrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_guardian_guardiangrayrules_ex_async(
        self,
        request: ms_models.AddGuardianGuardiangrayrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddGuardianGuardiangrayrulesResponse:
        """
        Description: ms-灰度推送
        Summary: 灰度推送
        """
        UtilClient.validate_model(request)
        return ms_models.AddGuardianGuardiangrayrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardiangrayrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_guardian_guardiangrayrulestatus(
        self,
        request: ms_models.UpdateGuardianGuardiangrayrulestatusRequest,
    ) -> ms_models.UpdateGuardianGuardiangrayrulestatusResponse:
        """
        Description: ms-更改规则灰度状态
        Summary: 更改规则灰度状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_guardian_guardiangrayrulestatus_ex(request, headers, runtime)

    async def update_guardian_guardiangrayrulestatus_async(
        self,
        request: ms_models.UpdateGuardianGuardiangrayrulestatusRequest,
    ) -> ms_models.UpdateGuardianGuardiangrayrulestatusResponse:
        """
        Description: ms-更改规则灰度状态
        Summary: 更改规则灰度状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_guardian_guardiangrayrulestatus_ex_async(request, headers, runtime)

    def update_guardian_guardiangrayrulestatus_ex(
        self,
        request: ms_models.UpdateGuardianGuardiangrayrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardiangrayrulestatusResponse:
        """
        Description: ms-更改规则灰度状态
        Summary: 更改规则灰度状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardiangrayrulestatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardiangrayrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_guardian_guardiangrayrulestatus_ex_async(
        self,
        request: ms_models.UpdateGuardianGuardiangrayrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateGuardianGuardiangrayrulestatusResponse:
        """
        Description: ms-更改规则灰度状态
        Summary: 更改规则灰度状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateGuardianGuardiangrayrulestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardiangrayrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_drm_drmapps(
        self,
        request: ms_models.AllDrmDrmappsRequest,
    ) -> ms_models.AllDrmDrmappsResponse:
        """
        Description: ms-查询实例App name
        Summary: 查询实例App name
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_drm_drmapps_ex(request, headers, runtime)

    async def all_drm_drmapps_async(
        self,
        request: ms_models.AllDrmDrmappsRequest,
    ) -> ms_models.AllDrmDrmappsResponse:
        """
        Description: ms-查询实例App name
        Summary: 查询实例App name
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_drm_drmapps_ex_async(request, headers, runtime)

    def all_drm_drmapps_ex(
        self,
        request: ms_models.AllDrmDrmappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllDrmDrmappsResponse:
        """
        Description: ms-查询实例App name
        Summary: 查询实例App name
        """
        UtilClient.validate_model(request)
        return ms_models.AllDrmDrmappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmapps.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_drm_drmapps_ex_async(
        self,
        request: ms_models.AllDrmDrmappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllDrmDrmappsResponse:
        """
        Description: ms-查询实例App name
        Summary: 查询实例App name
        """
        UtilClient.validate_model(request)
        return ms_models.AllDrmDrmappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmapps.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_drm_drmresources(
        self,
        request: ms_models.QueryDrmDrmresourcesRequest,
    ) -> ms_models.QueryDrmDrmresourcesResponse:
        """
        Description: ms-分页查询Drm资源
        Summary: 分页查询Drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_drm_drmresources_ex(request, headers, runtime)

    async def query_drm_drmresources_async(
        self,
        request: ms_models.QueryDrmDrmresourcesRequest,
    ) -> ms_models.QueryDrmDrmresourcesResponse:
        """
        Description: ms-分页查询Drm资源
        Summary: 分页查询Drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_drm_drmresources_ex_async(request, headers, runtime)

    def query_drm_drmresources_ex(
        self,
        request: ms_models.QueryDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmresourcesResponse:
        """
        Description: ms-分页查询Drm资源
        Summary: 分页查询Drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmresourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresources.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_drm_drmresources_ex_async(
        self,
        request: ms_models.QueryDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmresourcesResponse:
        """
        Description: ms-分页查询Drm资源
        Summary: 分页查询Drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmresourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresources.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_drm_drmresources(
        self,
        request: ms_models.AddDrmDrmresourcesRequest,
    ) -> ms_models.AddDrmDrmresourcesResponse:
        """
        Description: ms-添加drm资源
        Summary: 添加drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_drm_drmresources_ex(request, headers, runtime)

    async def add_drm_drmresources_async(
        self,
        request: ms_models.AddDrmDrmresourcesRequest,
    ) -> ms_models.AddDrmDrmresourcesResponse:
        """
        Description: ms-添加drm资源
        Summary: 添加drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_drm_drmresources_ex_async(request, headers, runtime)

    def add_drm_drmresources_ex(
        self,
        request: ms_models.AddDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmresourcesResponse:
        """
        Description: ms-添加drm资源
        Summary: 添加drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmresourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresources.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_drm_drmresources_ex_async(
        self,
        request: ms_models.AddDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmresourcesResponse:
        """
        Description: ms-添加drm资源
        Summary: 添加drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmresourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresources.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_drm_drmresources(
        self,
        request: ms_models.UpdateDrmDrmresourcesRequest,
    ) -> ms_models.UpdateDrmDrmresourcesResponse:
        """
        Description: ms-更新drm资源
        Summary: 更新drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_drm_drmresources_ex(request, headers, runtime)

    async def update_drm_drmresources_async(
        self,
        request: ms_models.UpdateDrmDrmresourcesRequest,
    ) -> ms_models.UpdateDrmDrmresourcesResponse:
        """
        Description: ms-更新drm资源
        Summary: 更新drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_drm_drmresources_ex_async(request, headers, runtime)

    def update_drm_drmresources_ex(
        self,
        request: ms_models.UpdateDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDrmDrmresourcesResponse:
        """
        Description: ms-更新drm资源
        Summary: 更新drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDrmDrmresourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresources.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_drm_drmresources_ex_async(
        self,
        request: ms_models.UpdateDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDrmDrmresourcesResponse:
        """
        Description: ms-更新drm资源
        Summary: 更新drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDrmDrmresourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresources.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_drm_drmattributes(
        self,
        request: ms_models.AddDrmDrmattributesRequest,
    ) -> ms_models.AddDrmDrmattributesResponse:
        """
        Description: ms-添加drm属性
        Summary: 添加drm属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_drm_drmattributes_ex(request, headers, runtime)

    async def add_drm_drmattributes_async(
        self,
        request: ms_models.AddDrmDrmattributesRequest,
    ) -> ms_models.AddDrmDrmattributesResponse:
        """
        Description: ms-添加drm属性
        Summary: 添加drm属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_drm_drmattributes_ex_async(request, headers, runtime)

    def add_drm_drmattributes_ex(
        self,
        request: ms_models.AddDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmattributesResponse:
        """
        Description: ms-添加drm属性
        Summary: 添加drm属性
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmattributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmattributes.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_drm_drmattributes_ex_async(
        self,
        request: ms_models.AddDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmattributesResponse:
        """
        Description: ms-添加drm属性
        Summary: 添加drm属性
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmattributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmattributes.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_drm_drmattributes(
        self,
        request: ms_models.UpdateDrmDrmattributesRequest,
    ) -> ms_models.UpdateDrmDrmattributesResponse:
        """
        Description: ms-更新drm资源属性
        Summary: 更新drm资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_drm_drmattributes_ex(request, headers, runtime)

    async def update_drm_drmattributes_async(
        self,
        request: ms_models.UpdateDrmDrmattributesRequest,
    ) -> ms_models.UpdateDrmDrmattributesResponse:
        """
        Description: ms-更新drm资源属性
        Summary: 更新drm资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_drm_drmattributes_ex_async(request, headers, runtime)

    def update_drm_drmattributes_ex(
        self,
        request: ms_models.UpdateDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDrmDrmattributesResponse:
        """
        Description: ms-更新drm资源属性
        Summary: 更新drm资源属性
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDrmDrmattributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmattributes.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_drm_drmattributes_ex_async(
        self,
        request: ms_models.UpdateDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDrmDrmattributesResponse:
        """
        Description: ms-更新drm资源属性
        Summary: 更新drm资源属性
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDrmDrmattributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmattributes.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_drm_drmresources(
        self,
        request: ms_models.DeleteDrmDrmresourcesRequest,
    ) -> ms_models.DeleteDrmDrmresourcesResponse:
        """
        Description: ms-Delete resource
        Summary: Delete resource
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_drm_drmresources_ex(request, headers, runtime)

    async def delete_drm_drmresources_async(
        self,
        request: ms_models.DeleteDrmDrmresourcesRequest,
    ) -> ms_models.DeleteDrmDrmresourcesResponse:
        """
        Description: ms-Delete resource
        Summary: Delete resource
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_drm_drmresources_ex_async(request, headers, runtime)

    def delete_drm_drmresources_ex(
        self,
        request: ms_models.DeleteDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDrmDrmresourcesResponse:
        """
        Description: ms-Delete resource
        Summary: Delete resource
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDrmDrmresourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresources.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_drm_drmresources_ex_async(
        self,
        request: ms_models.DeleteDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDrmDrmresourcesResponse:
        """
        Description: ms-Delete resource
        Summary: Delete resource
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDrmDrmresourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresources.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_drm_drmattributes(
        self,
        request: ms_models.DeleteDrmDrmattributesRequest,
    ) -> ms_models.DeleteDrmDrmattributesResponse:
        """
        Description: ms-删除drm资源属性
        Summary: 删除drm资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_drm_drmattributes_ex(request, headers, runtime)

    async def delete_drm_drmattributes_async(
        self,
        request: ms_models.DeleteDrmDrmattributesRequest,
    ) -> ms_models.DeleteDrmDrmattributesResponse:
        """
        Description: ms-删除drm资源属性
        Summary: 删除drm资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_drm_drmattributes_ex_async(request, headers, runtime)

    def delete_drm_drmattributes_ex(
        self,
        request: ms_models.DeleteDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDrmDrmattributesResponse:
        """
        Description: ms-删除drm资源属性
        Summary: 删除drm资源属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDrmDrmattributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmattributes.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_drm_drmattributes_ex_async(
        self,
        request: ms_models.DeleteDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDrmDrmattributesResponse:
        """
        Description: ms-删除drm资源属性
        Summary: 删除drm资源属性
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDrmDrmattributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmattributes.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_drm_drmattributes(
        self,
        request: ms_models.GetDrmDrmattributesRequest,
    ) -> ms_models.GetDrmDrmattributesResponse:
        """
        Description: ms-获取drm资源属性
        Summary: 获取drm资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_drm_drmattributes_ex(request, headers, runtime)

    async def get_drm_drmattributes_async(
        self,
        request: ms_models.GetDrmDrmattributesRequest,
    ) -> ms_models.GetDrmDrmattributesResponse:
        """
        Description: ms-获取drm资源属性
        Summary: 获取drm资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_drm_drmattributes_ex_async(request, headers, runtime)

    def get_drm_drmattributes_ex(
        self,
        request: ms_models.GetDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDrmDrmattributesResponse:
        """
        Description: ms-获取drm资源属性
        Summary: 获取drm资源属性
        """
        UtilClient.validate_model(request)
        return ms_models.GetDrmDrmattributesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmattributes.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_drm_drmattributes_ex_async(
        self,
        request: ms_models.GetDrmDrmattributesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDrmDrmattributesResponse:
        """
        Description: ms-获取drm资源属性
        Summary: 获取drm资源属性
        """
        UtilClient.validate_model(request)
        return ms_models.GetDrmDrmattributesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmattributes.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_drm_drmclients(
        self,
        request: ms_models.QueryDrmDrmclientsRequest,
    ) -> ms_models.QueryDrmDrmclientsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_drm_drmclients_ex(request, headers, runtime)

    async def query_drm_drmclients_async(
        self,
        request: ms_models.QueryDrmDrmclientsRequest,
    ) -> ms_models.QueryDrmDrmclientsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_drm_drmclients_ex_async(request, headers, runtime)

    def query_drm_drmclients_ex(
        self,
        request: ms_models.QueryDrmDrmclientsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmclientsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmclientsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmclients.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_drm_drmclients_ex_async(
        self,
        request: ms_models.QueryDrmDrmclientsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmclientsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmclientsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmclients.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_drm_drmhosts(
        self,
        request: ms_models.QueryDrmDrmhostsRequest,
    ) -> ms_models.QueryDrmDrmhostsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_drm_drmhosts_ex(request, headers, runtime)

    async def query_drm_drmhosts_async(
        self,
        request: ms_models.QueryDrmDrmhostsRequest,
    ) -> ms_models.QueryDrmDrmhostsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_drm_drmhosts_ex_async(request, headers, runtime)

    def query_drm_drmhosts_ex(
        self,
        request: ms_models.QueryDrmDrmhostsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmhostsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmhostsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmhosts.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_drm_drmhosts_ex_async(
        self,
        request: ms_models.QueryDrmDrmhostsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmhostsResponse:
        """
        Description: ms-搜索客户端信息
        Summary: 搜索客户端信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmhostsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmhosts.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_drm_drmpushlogs(
        self,
        request: ms_models.ListDrmDrmpushlogsRequest,
    ) -> ms_models.ListDrmDrmpushlogsResponse:
        """
        Description: ms-分页搜索推送日志
        Summary: 分页搜索推送日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_drm_drmpushlogs_ex(request, headers, runtime)

    async def list_drm_drmpushlogs_async(
        self,
        request: ms_models.ListDrmDrmpushlogsRequest,
    ) -> ms_models.ListDrmDrmpushlogsResponse:
        """
        Description: ms-分页搜索推送日志
        Summary: 分页搜索推送日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_drm_drmpushlogs_ex_async(request, headers, runtime)

    def list_drm_drmpushlogs_ex(
        self,
        request: ms_models.ListDrmDrmpushlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListDrmDrmpushlogsResponse:
        """
        Description: ms-分页搜索推送日志
        Summary: 分页搜索推送日志
        """
        UtilClient.validate_model(request)
        return ms_models.ListDrmDrmpushlogsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmpushlogs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_drm_drmpushlogs_ex_async(
        self,
        request: ms_models.ListDrmDrmpushlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListDrmDrmpushlogsResponse:
        """
        Description: ms-分页搜索推送日志
        Summary: 分页搜索推送日志
        """
        UtilClient.validate_model(request)
        return ms_models.ListDrmDrmpushlogsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmpushlogs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_drm_drmpushlogs(
        self,
        request: ms_models.QueryDrmDrmpushlogsRequest,
    ) -> ms_models.QueryDrmDrmpushlogsResponse:
        """
        Description: ms-按条件分页查询推送日志
        Summary: 按条件分页查询推送日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_drm_drmpushlogs_ex(request, headers, runtime)

    async def query_drm_drmpushlogs_async(
        self,
        request: ms_models.QueryDrmDrmpushlogsRequest,
    ) -> ms_models.QueryDrmDrmpushlogsResponse:
        """
        Description: ms-按条件分页查询推送日志
        Summary: 按条件分页查询推送日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_drm_drmpushlogs_ex_async(request, headers, runtime)

    def query_drm_drmpushlogs_ex(
        self,
        request: ms_models.QueryDrmDrmpushlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmpushlogsResponse:
        """
        Description: ms-按条件分页查询推送日志
        Summary: 按条件分页查询推送日志
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmpushlogsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmpushlogs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_drm_drmpushlogs_ex_async(
        self,
        request: ms_models.QueryDrmDrmpushlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmpushlogsResponse:
        """
        Description: ms-按条件分页查询推送日志
        Summary: 按条件分页查询推送日志
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmpushlogsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmpushlogs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_drm_drmdata(
        self,
        request: ms_models.AddDrmDrmdataRequest,
    ) -> ms_models.AddDrmDrmdataResponse:
        """
        Description: ms-推送drm配置
        Summary: 推送drm配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_drm_drmdata_ex(request, headers, runtime)

    async def add_drm_drmdata_async(
        self,
        request: ms_models.AddDrmDrmdataRequest,
    ) -> ms_models.AddDrmDrmdataResponse:
        """
        Description: ms-推送drm配置
        Summary: 推送drm配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_drm_drmdata_ex_async(request, headers, runtime)

    def add_drm_drmdata_ex(
        self,
        request: ms_models.AddDrmDrmdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmdataResponse:
        """
        Description: ms-推送drm配置
        Summary: 推送drm配置
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmdataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmdata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_drm_drmdata_ex_async(
        self,
        request: ms_models.AddDrmDrmdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmdataResponse:
        """
        Description: ms-推送drm配置
        Summary: 推送drm配置
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmdataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmdata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_drm_drmgraydata(
        self,
        request: ms_models.AddDrmDrmgraydataRequest,
    ) -> ms_models.AddDrmDrmgraydataResponse:
        """
        Description: ms-灰度推送数据
        Summary: 灰度推送数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_drm_drmgraydata_ex(request, headers, runtime)

    async def add_drm_drmgraydata_async(
        self,
        request: ms_models.AddDrmDrmgraydataRequest,
    ) -> ms_models.AddDrmDrmgraydataResponse:
        """
        Description: ms-灰度推送数据
        Summary: 灰度推送数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_drm_drmgraydata_ex_async(request, headers, runtime)

    def add_drm_drmgraydata_ex(
        self,
        request: ms_models.AddDrmDrmgraydataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmgraydataResponse:
        """
        Description: ms-灰度推送数据
        Summary: 灰度推送数据
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmgraydataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmgraydata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_drm_drmgraydata_ex_async(
        self,
        request: ms_models.AddDrmDrmgraydataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmgraydataResponse:
        """
        Description: ms-灰度推送数据
        Summary: 灰度推送数据
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmgraydataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmgraydata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_drm_drmcells(
        self,
        request: ms_models.AllDrmDrmcellsRequest,
    ) -> ms_models.AllDrmDrmcellsResponse:
        """
        Description: ms-获取实例的单元格
        Summary: 获取实例的单元格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_drm_drmcells_ex(request, headers, runtime)

    async def all_drm_drmcells_async(
        self,
        request: ms_models.AllDrmDrmcellsRequest,
    ) -> ms_models.AllDrmDrmcellsResponse:
        """
        Description: ms-获取实例的单元格
        Summary: 获取实例的单元格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_drm_drmcells_ex_async(request, headers, runtime)

    def all_drm_drmcells_ex(
        self,
        request: ms_models.AllDrmDrmcellsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllDrmDrmcellsResponse:
        """
        Description: ms-获取实例的单元格
        Summary: 获取实例的单元格
        """
        UtilClient.validate_model(request)
        return ms_models.AllDrmDrmcellsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmcells.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_drm_drmcells_ex_async(
        self,
        request: ms_models.AllDrmDrmcellsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllDrmDrmcellsResponse:
        """
        Description: ms-获取实例的单元格
        Summary: 获取实例的单元格
        """
        UtilClient.validate_model(request)
        return ms_models.AllDrmDrmcellsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmcells.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_drm_drmdatacells(
        self,
        request: ms_models.ListDrmDrmdatacellsRequest,
    ) -> ms_models.ListDrmDrmdatacellsResponse:
        """
        Description: ms-获取Drm数据单元信息
        Summary: 获取Drm数据单元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_drm_drmdatacells_ex(request, headers, runtime)

    async def list_drm_drmdatacells_async(
        self,
        request: ms_models.ListDrmDrmdatacellsRequest,
    ) -> ms_models.ListDrmDrmdatacellsResponse:
        """
        Description: ms-获取Drm数据单元信息
        Summary: 获取Drm数据单元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_drm_drmdatacells_ex_async(request, headers, runtime)

    def list_drm_drmdatacells_ex(
        self,
        request: ms_models.ListDrmDrmdatacellsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListDrmDrmdatacellsResponse:
        """
        Description: ms-获取Drm数据单元信息
        Summary: 获取Drm数据单元信息
        """
        UtilClient.validate_model(request)
        return ms_models.ListDrmDrmdatacellsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmdatacells.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_drm_drmdatacells_ex_async(
        self,
        request: ms_models.ListDrmDrmdatacellsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListDrmDrmdatacellsResponse:
        """
        Description: ms-获取Drm数据单元信息
        Summary: 获取Drm数据单元信息
        """
        UtilClient.validate_model(request)
        return ms_models.ListDrmDrmdatacellsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmdatacells.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_drm_drmresourcetpls(
        self,
        request: ms_models.AddDrmDrmresourcetplsRequest,
    ) -> ms_models.AddDrmDrmresourcetplsResponse:
        """
        Description: ms-添加Tpl类型drm资源
        Summary: 添加Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_drm_drmresourcetpls_ex(request, headers, runtime)

    async def add_drm_drmresourcetpls_async(
        self,
        request: ms_models.AddDrmDrmresourcetplsRequest,
    ) -> ms_models.AddDrmDrmresourcetplsResponse:
        """
        Description: ms-添加Tpl类型drm资源
        Summary: 添加Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_drm_drmresourcetpls_ex_async(request, headers, runtime)

    def add_drm_drmresourcetpls_ex(
        self,
        request: ms_models.AddDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmresourcetplsResponse:
        """
        Description: ms-添加Tpl类型drm资源
        Summary: 添加Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmresourcetplsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresourcetpls.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_drm_drmresourcetpls_ex_async(
        self,
        request: ms_models.AddDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmresourcetplsResponse:
        """
        Description: ms-添加Tpl类型drm资源
        Summary: 添加Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmresourcetplsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresourcetpls.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_drm_drmresourcetpls(
        self,
        request: ms_models.UpdateDrmDrmresourcetplsRequest,
    ) -> ms_models.UpdateDrmDrmresourcetplsResponse:
        """
        Description: ms-更新Tpl类型drm资源
        Summary: 更新Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_drm_drmresourcetpls_ex(request, headers, runtime)

    async def update_drm_drmresourcetpls_async(
        self,
        request: ms_models.UpdateDrmDrmresourcetplsRequest,
    ) -> ms_models.UpdateDrmDrmresourcetplsResponse:
        """
        Description: ms-更新Tpl类型drm资源
        Summary: 更新Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_drm_drmresourcetpls_ex_async(request, headers, runtime)

    def update_drm_drmresourcetpls_ex(
        self,
        request: ms_models.UpdateDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDrmDrmresourcetplsResponse:
        """
        Description: ms-更新Tpl类型drm资源
        Summary: 更新Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDrmDrmresourcetplsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresourcetpls.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_drm_drmresourcetpls_ex_async(
        self,
        request: ms_models.UpdateDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateDrmDrmresourcetplsResponse:
        """
        Description: ms-更新Tpl类型drm资源
        Summary: 更新Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateDrmDrmresourcetplsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresourcetpls.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_drm_drmresourcetpls(
        self,
        request: ms_models.DeleteDrmDrmresourcetplsRequest,
    ) -> ms_models.DeleteDrmDrmresourcetplsResponse:
        """
        Description: ms-删除Tpl类型drm资源
        Summary: 删除Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_drm_drmresourcetpls_ex(request, headers, runtime)

    async def delete_drm_drmresourcetpls_async(
        self,
        request: ms_models.DeleteDrmDrmresourcetplsRequest,
    ) -> ms_models.DeleteDrmDrmresourcetplsResponse:
        """
        Description: ms-删除Tpl类型drm资源
        Summary: 删除Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_drm_drmresourcetpls_ex_async(request, headers, runtime)

    def delete_drm_drmresourcetpls_ex(
        self,
        request: ms_models.DeleteDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDrmDrmresourcetplsResponse:
        """
        Description: ms-删除Tpl类型drm资源
        Summary: 删除Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDrmDrmresourcetplsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresourcetpls.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_drm_drmresourcetpls_ex_async(
        self,
        request: ms_models.DeleteDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteDrmDrmresourcetplsResponse:
        """
        Description: ms-删除Tpl类型drm资源
        Summary: 删除Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteDrmDrmresourcetplsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresourcetpls.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_drm_drmresourcetpls(
        self,
        request: ms_models.QueryDrmDrmresourcetplsRequest,
    ) -> ms_models.QueryDrmDrmresourcetplsResponse:
        """
        Description: ms -分页查询Tpl类型drm资源
        Summary: 分页查询Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_drm_drmresourcetpls_ex(request, headers, runtime)

    async def query_drm_drmresourcetpls_async(
        self,
        request: ms_models.QueryDrmDrmresourcetplsRequest,
    ) -> ms_models.QueryDrmDrmresourcetplsResponse:
        """
        Description: ms -分页查询Tpl类型drm资源
        Summary: 分页查询Tpl类型drm资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_drm_drmresourcetpls_ex_async(request, headers, runtime)

    def query_drm_drmresourcetpls_ex(
        self,
        request: ms_models.QueryDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmresourcetplsResponse:
        """
        Description: ms -分页查询Tpl类型drm资源
        Summary: 分页查询Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmresourcetplsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresourcetpls.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_drm_drmresourcetpls_ex_async(
        self,
        request: ms_models.QueryDrmDrmresourcetplsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryDrmDrmresourcetplsResponse:
        """
        Description: ms -分页查询Tpl类型drm资源
        Summary: 分页查询Tpl类型drm资源
        """
        UtilClient.validate_model(request)
        return ms_models.QueryDrmDrmresourcetplsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresourcetpls.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_drm_drmresourcetplinstances(
        self,
        request: ms_models.AddDrmDrmresourcetplinstancesRequest,
    ) -> ms_models.AddDrmDrmresourcetplinstancesResponse:
        """
        Description: ms -创建资源Tpl实例
        Summary: 创建资源Tpl实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_drm_drmresourcetplinstances_ex(request, headers, runtime)

    async def add_drm_drmresourcetplinstances_async(
        self,
        request: ms_models.AddDrmDrmresourcetplinstancesRequest,
    ) -> ms_models.AddDrmDrmresourcetplinstancesResponse:
        """
        Description: ms -创建资源Tpl实例
        Summary: 创建资源Tpl实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_drm_drmresourcetplinstances_ex_async(request, headers, runtime)

    def add_drm_drmresourcetplinstances_ex(
        self,
        request: ms_models.AddDrmDrmresourcetplinstancesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmresourcetplinstancesResponse:
        """
        Description: ms -创建资源Tpl实例
        Summary: 创建资源Tpl实例
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmresourcetplinstancesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresourcetplinstances.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_drm_drmresourcetplinstances_ex_async(
        self,
        request: ms_models.AddDrmDrmresourcetplinstancesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddDrmDrmresourcetplinstancesResponse:
        """
        Description: ms -创建资源Tpl实例
        Summary: 创建资源Tpl实例
        """
        UtilClient.validate_model(request)
        return ms_models.AddDrmDrmresourcetplinstancesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresourcetplinstances.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_rc_syncbucket(
        self,
        request: ms_models.AddRcSyncbucketRequest,
    ) -> ms_models.AddRcSyncbucketResponse:
        """
        Description: 一键创建注册中心同步任务
        Summary: 一键创建注册中心同步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_rc_syncbucket_ex(request, headers, runtime)

    async def add_rc_syncbucket_async(
        self,
        request: ms_models.AddRcSyncbucketRequest,
    ) -> ms_models.AddRcSyncbucketResponse:
        """
        Description: 一键创建注册中心同步任务
        Summary: 一键创建注册中心同步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_rc_syncbucket_ex_async(request, headers, runtime)

    def add_rc_syncbucket_ex(
        self,
        request: ms_models.AddRcSyncbucketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddRcSyncbucketResponse:
        """
        Description: 一键创建注册中心同步任务
        Summary: 一键创建注册中心同步任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddRcSyncbucketResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.syncbucket.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_rc_syncbucket_ex_async(
        self,
        request: ms_models.AddRcSyncbucketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddRcSyncbucketResponse:
        """
        Description: 一键创建注册中心同步任务
        Summary: 一键创建注册中心同步任务
        """
        UtilClient.validate_model(request)
        return ms_models.AddRcSyncbucketResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.syncbucket.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rc_synccluster(
        self,
        request: ms_models.QueryRcSyncclusterRequest,
    ) -> ms_models.QueryRcSyncclusterResponse:
        """
        Description: 查询注册中心同步集群信息
        Summary: 查询注册中心同步集群信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rc_synccluster_ex(request, headers, runtime)

    async def query_rc_synccluster_async(
        self,
        request: ms_models.QueryRcSyncclusterRequest,
    ) -> ms_models.QueryRcSyncclusterResponse:
        """
        Description: 查询注册中心同步集群信息
        Summary: 查询注册中心同步集群信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rc_synccluster_ex_async(request, headers, runtime)

    def query_rc_synccluster_ex(
        self,
        request: ms_models.QueryRcSyncclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryRcSyncclusterResponse:
        """
        Description: 查询注册中心同步集群信息
        Summary: 查询注册中心同步集群信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryRcSyncclusterResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.synccluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rc_synccluster_ex_async(
        self,
        request: ms_models.QueryRcSyncclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryRcSyncclusterResponse:
        """
        Description: 查询注册中心同步集群信息
        Summary: 查询注册中心同步集群信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryRcSyncclusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.synccluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rc_synctask(
        self,
        request: ms_models.QueryRcSynctaskRequest,
    ) -> ms_models.QueryRcSynctaskResponse:
        """
        Description: 查询集群同步任务信息
        Summary: 查询集群同步任务信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rc_synctask_ex(request, headers, runtime)

    async def query_rc_synctask_async(
        self,
        request: ms_models.QueryRcSynctaskRequest,
    ) -> ms_models.QueryRcSynctaskResponse:
        """
        Description: 查询集群同步任务信息
        Summary: 查询集群同步任务信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rc_synctask_ex_async(request, headers, runtime)

    def query_rc_synctask_ex(
        self,
        request: ms_models.QueryRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryRcSynctaskResponse:
        """
        Description: 查询集群同步任务信息
        Summary: 查询集群同步任务信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryRcSynctaskResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.synctask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rc_synctask_ex_async(
        self,
        request: ms_models.QueryRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryRcSynctaskResponse:
        """
        Description: 查询集群同步任务信息
        Summary: 查询集群同步任务信息
        """
        UtilClient.validate_model(request)
        return ms_models.QueryRcSynctaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.synctask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rc_syncdata(
        self,
        request: ms_models.QueryRcSyncdataRequest,
    ) -> ms_models.QueryRcSyncdataResponse:
        """
        Description: 查询某个服务具体同步的数据
        Summary: 查询某个服务具体同步的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rc_syncdata_ex(request, headers, runtime)

    async def query_rc_syncdata_async(
        self,
        request: ms_models.QueryRcSyncdataRequest,
    ) -> ms_models.QueryRcSyncdataResponse:
        """
        Description: 查询某个服务具体同步的数据
        Summary: 查询某个服务具体同步的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rc_syncdata_ex_async(request, headers, runtime)

    def query_rc_syncdata_ex(
        self,
        request: ms_models.QueryRcSyncdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryRcSyncdataResponse:
        """
        Description: 查询某个服务具体同步的数据
        Summary: 查询某个服务具体同步的数据
        """
        UtilClient.validate_model(request)
        return ms_models.QueryRcSyncdataResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.syncdata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rc_syncdata_ex_async(
        self,
        request: ms_models.QueryRcSyncdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryRcSyncdataResponse:
        """
        Description: 查询某个服务具体同步的数据
        Summary: 查询某个服务具体同步的数据
        """
        UtilClient.validate_model(request)
        return ms_models.QueryRcSyncdataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.syncdata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_rc_synctask(
        self,
        request: ms_models.StartRcSynctaskRequest,
    ) -> ms_models.StartRcSynctaskResponse:
        """
        Description: 开启任务
        Summary: 开启任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_rc_synctask_ex(request, headers, runtime)

    async def start_rc_synctask_async(
        self,
        request: ms_models.StartRcSynctaskRequest,
    ) -> ms_models.StartRcSynctaskResponse:
        """
        Description: 开启任务
        Summary: 开启任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_rc_synctask_ex_async(request, headers, runtime)

    def start_rc_synctask_ex(
        self,
        request: ms_models.StartRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.StartRcSynctaskResponse:
        """
        Description: 开启任务
        Summary: 开启任务
        """
        UtilClient.validate_model(request)
        return ms_models.StartRcSynctaskResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.synctask.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_rc_synctask_ex_async(
        self,
        request: ms_models.StartRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.StartRcSynctaskResponse:
        """
        Description: 开启任务
        Summary: 开启任务
        """
        UtilClient.validate_model(request)
        return ms_models.StartRcSynctaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.synctask.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_rc_synctask(
        self,
        request: ms_models.StopRcSynctaskRequest,
    ) -> ms_models.StopRcSynctaskResponse:
        """
        Description: 停止任务
        Summary: 停止任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_rc_synctask_ex(request, headers, runtime)

    async def stop_rc_synctask_async(
        self,
        request: ms_models.StopRcSynctaskRequest,
    ) -> ms_models.StopRcSynctaskResponse:
        """
        Description: 停止任务
        Summary: 停止任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_rc_synctask_ex_async(request, headers, runtime)

    def stop_rc_synctask_ex(
        self,
        request: ms_models.StopRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.StopRcSynctaskResponse:
        """
        Description: 停止任务
        Summary: 停止任务
        """
        UtilClient.validate_model(request)
        return ms_models.StopRcSynctaskResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.synctask.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_rc_synctask_ex_async(
        self,
        request: ms_models.StopRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.StopRcSynctaskResponse:
        """
        Description: 停止任务
        Summary: 停止任务
        """
        UtilClient.validate_model(request)
        return ms_models.StopRcSynctaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.synctask.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_drm_drmresources(
        self,
        request: ms_models.ExportDrmDrmresourcesRequest,
    ) -> ms_models.ExportDrmDrmresourcesResponse:
        """
        Description: 当前workspace下所有资源元信息
        Summary: 导出资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_drm_drmresources_ex(request, headers, runtime)

    async def export_drm_drmresources_async(
        self,
        request: ms_models.ExportDrmDrmresourcesRequest,
    ) -> ms_models.ExportDrmDrmresourcesResponse:
        """
        Description: 当前workspace下所有资源元信息
        Summary: 导出资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_drm_drmresources_ex_async(request, headers, runtime)

    def export_drm_drmresources_ex(
        self,
        request: ms_models.ExportDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportDrmDrmresourcesResponse:
        """
        Description: 当前workspace下所有资源元信息
        Summary: 导出资源
        """
        UtilClient.validate_model(request)
        return ms_models.ExportDrmDrmresourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresources.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_drm_drmresources_ex_async(
        self,
        request: ms_models.ExportDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportDrmDrmresourcesResponse:
        """
        Description: 当前workspace下所有资源元信息
        Summary: 导出资源
        """
        UtilClient.validate_model(request)
        return ms_models.ExportDrmDrmresourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresources.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_drm_drmresources(
        self,
        request: ms_models.ImportDrmDrmresourcesRequest,
    ) -> ms_models.ImportDrmDrmresourcesResponse:
        """
        Description: 导入drm资源元信息
        Summary: 导入drm资源元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_drm_drmresources_ex(request, headers, runtime)

    async def import_drm_drmresources_async(
        self,
        request: ms_models.ImportDrmDrmresourcesRequest,
    ) -> ms_models.ImportDrmDrmresourcesResponse:
        """
        Description: 导入drm资源元信息
        Summary: 导入drm资源元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_drm_drmresources_ex_async(request, headers, runtime)

    def import_drm_drmresources_ex(
        self,
        request: ms_models.ImportDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportDrmDrmresourcesResponse:
        """
        Description: 导入drm资源元信息
        Summary: 导入drm资源元信息
        """
        UtilClient.validate_model(request)
        return ms_models.ImportDrmDrmresourcesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmresources.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_drm_drmresources_ex_async(
        self,
        request: ms_models.ImportDrmDrmresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportDrmDrmresourcesResponse:
        """
        Description: 导入drm资源元信息
        Summary: 导入drm资源元信息
        """
        UtilClient.validate_model(request)
        return ms_models.ImportDrmDrmresourcesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmresources.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_guardian_guardianrules(
        self,
        request: ms_models.ImportGuardianGuardianrulesRequest,
    ) -> ms_models.ImportGuardianGuardianrulesResponse:
        """
        Description: 导入guardian规则
        Summary: 导入guardian规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_guardian_guardianrules_ex(request, headers, runtime)

    async def import_guardian_guardianrules_async(
        self,
        request: ms_models.ImportGuardianGuardianrulesRequest,
    ) -> ms_models.ImportGuardianGuardianrulesResponse:
        """
        Description: 导入guardian规则
        Summary: 导入guardian规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_guardian_guardianrules_ex_async(request, headers, runtime)

    def import_guardian_guardianrules_ex(
        self,
        request: ms_models.ImportGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportGuardianGuardianrulesResponse:
        """
        Description: 导入guardian规则
        Summary: 导入guardian规则
        """
        UtilClient.validate_model(request)
        return ms_models.ImportGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_guardian_guardianrules_ex_async(
        self,
        request: ms_models.ImportGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportGuardianGuardianrulesResponse:
        """
        Description: 导入guardian规则
        Summary: 导入guardian规则
        """
        UtilClient.validate_model(request)
        return ms_models.ImportGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_guardian_guardianrules(
        self,
        request: ms_models.ExportGuardianGuardianrulesRequest,
    ) -> ms_models.ExportGuardianGuardianrulesResponse:
        """
        Description: 导出guardian路由规则
        Summary: 导出guardian路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_guardian_guardianrules_ex(request, headers, runtime)

    async def export_guardian_guardianrules_async(
        self,
        request: ms_models.ExportGuardianGuardianrulesRequest,
    ) -> ms_models.ExportGuardianGuardianrulesResponse:
        """
        Description: 导出guardian路由规则
        Summary: 导出guardian路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_guardian_guardianrules_ex_async(request, headers, runtime)

    def export_guardian_guardianrules_ex(
        self,
        request: ms_models.ExportGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportGuardianGuardianrulesResponse:
        """
        Description: 导出guardian路由规则
        Summary: 导出guardian路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.ExportGuardianGuardianrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.guardian.guardianrules.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_guardian_guardianrules_ex_async(
        self,
        request: ms_models.ExportGuardianGuardianrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportGuardianGuardianrulesResponse:
        """
        Description: 导出guardian路由规则
        Summary: 导出guardian路由规则
        """
        UtilClient.validate_model(request)
        return ms_models.ExportGuardianGuardianrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.guardian.guardianrules.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_drm_uploadurl(
        self,
        request: ms_models.GetDrmUploadurlRequest,
    ) -> ms_models.GetDrmUploadurlResponse:
        """
        Description: 获取上传地址
        Summary: 获取上传地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_drm_uploadurl_ex(request, headers, runtime)

    async def get_drm_uploadurl_async(
        self,
        request: ms_models.GetDrmUploadurlRequest,
    ) -> ms_models.GetDrmUploadurlResponse:
        """
        Description: 获取上传地址
        Summary: 获取上传地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_drm_uploadurl_ex_async(request, headers, runtime)

    def get_drm_uploadurl_ex(
        self,
        request: ms_models.GetDrmUploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDrmUploadurlResponse:
        """
        Description: 获取上传地址
        Summary: 获取上传地址
        """
        UtilClient.validate_model(request)
        return ms_models.GetDrmUploadurlResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.uploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_drm_uploadurl_ex_async(
        self,
        request: ms_models.GetDrmUploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetDrmUploadurlResponse:
        """
        Description: 获取上传地址
        Summary: 获取上传地址
        """
        UtilClient.validate_model(request)
        return ms_models.GetDrmUploadurlResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.uploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_oms(
        self,
        request: ms_models.CallbackSpiOmsRequest,
    ) -> ms_models.CallbackSpiOmsResponse:
        """
        Description: 南天门计费回调
        Summary: 南天门计费回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_oms_ex(request, headers, runtime)

    async def callback_spi_oms_async(
        self,
        request: ms_models.CallbackSpiOmsRequest,
    ) -> ms_models.CallbackSpiOmsResponse:
        """
        Description: 南天门计费回调
        Summary: 南天门计费回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_oms_ex_async(request, headers, runtime)

    def callback_spi_oms_ex(
        self,
        request: ms_models.CallbackSpiOmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.CallbackSpiOmsResponse:
        """
        Description: 南天门计费回调
        Summary: 南天门计费回调
        """
        UtilClient.validate_model(request)
        return ms_models.CallbackSpiOmsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.spi.oms.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_oms_ex_async(
        self,
        request: ms_models.CallbackSpiOmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.CallbackSpiOmsResponse:
        """
        Description: 南天门计费回调
        Summary: 南天门计费回调
        """
        UtilClient.validate_model(request)
        return ms_models.CallbackSpiOmsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.spi.oms.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_drm_drmldccells(
        self,
        request: ms_models.AllDrmDrmldccellsRequest,
    ) -> ms_models.AllDrmDrmldccellsResponse:
        """
        Description: ms-查询实例下所有cells
        Summary: 查询实例下所有cells
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_drm_drmldccells_ex(request, headers, runtime)

    async def all_drm_drmldccells_async(
        self,
        request: ms_models.AllDrmDrmldccellsRequest,
    ) -> ms_models.AllDrmDrmldccellsResponse:
        """
        Description: ms-查询实例下所有cells
        Summary: 查询实例下所有cells
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_drm_drmldccells_ex_async(request, headers, runtime)

    def all_drm_drmldccells_ex(
        self,
        request: ms_models.AllDrmDrmldccellsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllDrmDrmldccellsResponse:
        """
        Description: ms-查询实例下所有cells
        Summary: 查询实例下所有cells
        """
        UtilClient.validate_model(request)
        return ms_models.AllDrmDrmldccellsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.drm.drmldccells.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_drm_drmldccells_ex_async(
        self,
        request: ms_models.AllDrmDrmldccellsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllDrmDrmldccellsResponse:
        """
        Description: ms-查询实例下所有cells
        Summary: 查询实例下所有cells
        """
        UtilClient.validate_model(request)
        return ms_models.AllDrmDrmldccellsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.drm.drmldccells.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_sg_servicepublishers(
        self,
        request: ms_models.OfflineSgServicepublishersRequest,
    ) -> ms_models.OfflineSgServicepublishersResponse:
        """
        Description: 提供给 paas 平台，发布时先调用下线接口，再发布
        Summary: 服务下线接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_sg_servicepublishers_ex(request, headers, runtime)

    async def offline_sg_servicepublishers_async(
        self,
        request: ms_models.OfflineSgServicepublishersRequest,
    ) -> ms_models.OfflineSgServicepublishersResponse:
        """
        Description: 提供给 paas 平台，发布时先调用下线接口，再发布
        Summary: 服务下线接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_sg_servicepublishers_ex_async(request, headers, runtime)

    def offline_sg_servicepublishers_ex(
        self,
        request: ms_models.OfflineSgServicepublishersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.OfflineSgServicepublishersResponse:
        """
        Description: 提供给 paas 平台，发布时先调用下线接口，再发布
        Summary: 服务下线接口
        """
        UtilClient.validate_model(request)
        return ms_models.OfflineSgServicepublishersResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.servicepublishers.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_sg_servicepublishers_ex_async(
        self,
        request: ms_models.OfflineSgServicepublishersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.OfflineSgServicepublishersResponse:
        """
        Description: 提供给 paas 平台，发布时先调用下线接口，再发布
        Summary: 服务下线接口
        """
        UtilClient.validate_model(request)
        return ms_models.OfflineSgServicepublishersResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.servicepublishers.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_rc_synctask(
        self,
        request: ms_models.DeleteRcSynctaskRequest,
    ) -> ms_models.DeleteRcSynctaskResponse:
        """
        Description: 删除任务
        Summary: 删除任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_rc_synctask_ex(request, headers, runtime)

    async def delete_rc_synctask_async(
        self,
        request: ms_models.DeleteRcSynctaskRequest,
    ) -> ms_models.DeleteRcSynctaskResponse:
        """
        Description: 删除任务
        Summary: 删除任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_rc_synctask_ex_async(request, headers, runtime)

    def delete_rc_synctask_ex(
        self,
        request: ms_models.DeleteRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteRcSynctaskResponse:
        """
        Description: 删除任务
        Summary: 删除任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteRcSynctaskResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.synctask.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_rc_synctask_ex_async(
        self,
        request: ms_models.DeleteRcSynctaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteRcSynctaskResponse:
        """
        Description: 删除任务
        Summary: 删除任务
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteRcSynctaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.synctask.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_downgradegroups(
        self,
        request: ms_models.QuerySgDowngradegroupsRequest,
    ) -> ms_models.QuerySgDowngradegroupsResponse:
        """
        Description: 查询降级规则组列表
        Summary: 查询降级规则组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_downgradegroups_ex(request, headers, runtime)

    async def query_sg_downgradegroups_async(
        self,
        request: ms_models.QuerySgDowngradegroupsRequest,
    ) -> ms_models.QuerySgDowngradegroupsResponse:
        """
        Description: 查询降级规则组列表
        Summary: 查询降级规则组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_downgradegroups_ex_async(request, headers, runtime)

    def query_sg_downgradegroups_ex(
        self,
        request: ms_models.QuerySgDowngradegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgDowngradegroupsResponse:
        """
        Description: 查询降级规则组列表
        Summary: 查询降级规则组列表
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgDowngradegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgradegroups.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_downgradegroups_ex_async(
        self,
        request: ms_models.QuerySgDowngradegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgDowngradegroupsResponse:
        """
        Description: 查询降级规则组列表
        Summary: 查询降级规则组列表
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgDowngradegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgradegroups.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_downgrades(
        self,
        request: ms_models.DeleteSgDowngradesRequest,
    ) -> ms_models.DeleteSgDowngradesResponse:
        """
        Description: 删除降级规则
        Summary: 删除降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_downgrades_ex(request, headers, runtime)

    async def delete_sg_downgrades_async(
        self,
        request: ms_models.DeleteSgDowngradesRequest,
    ) -> ms_models.DeleteSgDowngradesResponse:
        """
        Description: 删除降级规则
        Summary: 删除降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_downgrades_ex_async(request, headers, runtime)

    def delete_sg_downgrades_ex(
        self,
        request: ms_models.DeleteSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgDowngradesResponse:
        """
        Description: 删除降级规则
        Summary: 删除降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgDowngradesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgrades.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_downgrades_ex_async(
        self,
        request: ms_models.DeleteSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgDowngradesResponse:
        """
        Description: 删除降级规则
        Summary: 删除降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgDowngradesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgrades.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_downgrades(
        self,
        request: ms_models.AddSgDowngradesRequest,
    ) -> ms_models.AddSgDowngradesResponse:
        """
        Description: 新增降级规则
        Summary: 新增降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_downgrades_ex(request, headers, runtime)

    async def add_sg_downgrades_async(
        self,
        request: ms_models.AddSgDowngradesRequest,
    ) -> ms_models.AddSgDowngradesResponse:
        """
        Description: 新增降级规则
        Summary: 新增降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_downgrades_ex_async(request, headers, runtime)

    def add_sg_downgrades_ex(
        self,
        request: ms_models.AddSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgDowngradesResponse:
        """
        Description: 新增降级规则
        Summary: 新增降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgDowngradesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgrades.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_downgrades_ex_async(
        self,
        request: ms_models.AddSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgDowngradesResponse:
        """
        Description: 新增降级规则
        Summary: 新增降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgDowngradesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgrades.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_downgrades(
        self,
        request: ms_models.UpdateSgDowngradesRequest,
    ) -> ms_models.UpdateSgDowngradesResponse:
        """
        Description: 更新降级规则
        Summary: 更新降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_downgrades_ex(request, headers, runtime)

    async def update_sg_downgrades_async(
        self,
        request: ms_models.UpdateSgDowngradesRequest,
    ) -> ms_models.UpdateSgDowngradesResponse:
        """
        Description: 更新降级规则
        Summary: 更新降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_downgrades_ex_async(request, headers, runtime)

    def update_sg_downgrades_ex(
        self,
        request: ms_models.UpdateSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgDowngradesResponse:
        """
        Description: 更新降级规则
        Summary: 更新降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgDowngradesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgrades.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_downgrades_ex_async(
        self,
        request: ms_models.UpdateSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgDowngradesResponse:
        """
        Description: 更新降级规则
        Summary: 更新降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgDowngradesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgrades.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_downgradegroups(
        self,
        request: ms_models.EnableSgDowngradegroupsRequest,
    ) -> ms_models.EnableSgDowngradegroupsResponse:
        """
        Description: 全局开启降级规则
        Summary: 全局开启降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_downgradegroups_ex(request, headers, runtime)

    async def enable_sg_downgradegroups_async(
        self,
        request: ms_models.EnableSgDowngradegroupsRequest,
    ) -> ms_models.EnableSgDowngradegroupsResponse:
        """
        Description: 全局开启降级规则
        Summary: 全局开启降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_downgradegroups_ex_async(request, headers, runtime)

    def enable_sg_downgradegroups_ex(
        self,
        request: ms_models.EnableSgDowngradegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgDowngradegroupsResponse:
        """
        Description: 全局开启降级规则
        Summary: 全局开启降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgDowngradegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgradegroups.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_downgradegroups_ex_async(
        self,
        request: ms_models.EnableSgDowngradegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgDowngradegroupsResponse:
        """
        Description: 全局开启降级规则
        Summary: 全局开启降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgDowngradegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgradegroups.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sg_downgradegroups(
        self,
        request: ms_models.DisableSgDowngradegroupsRequest,
    ) -> ms_models.DisableSgDowngradegroupsResponse:
        """
        Description: 全局关闭降级规则
        Summary: 全局关闭降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sg_downgradegroups_ex(request, headers, runtime)

    async def disable_sg_downgradegroups_async(
        self,
        request: ms_models.DisableSgDowngradegroupsRequest,
    ) -> ms_models.DisableSgDowngradegroupsResponse:
        """
        Description: 全局关闭降级规则
        Summary: 全局关闭降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sg_downgradegroups_ex_async(request, headers, runtime)

    def disable_sg_downgradegroups_ex(
        self,
        request: ms_models.DisableSgDowngradegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgDowngradegroupsResponse:
        """
        Description: 全局关闭降级规则
        Summary: 全局关闭降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgDowngradegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgradegroups.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sg_downgradegroups_ex_async(
        self,
        request: ms_models.DisableSgDowngradegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgDowngradegroupsResponse:
        """
        Description: 全局关闭降级规则
        Summary: 全局关闭降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgDowngradegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgradegroups.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_downgrades(
        self,
        request: ms_models.EnableSgDowngradesRequest,
    ) -> ms_models.EnableSgDowngradesResponse:
        """
        Description: 开启一条降级规则
        Summary: 开启一条降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_downgrades_ex(request, headers, runtime)

    async def enable_sg_downgrades_async(
        self,
        request: ms_models.EnableSgDowngradesRequest,
    ) -> ms_models.EnableSgDowngradesResponse:
        """
        Description: 开启一条降级规则
        Summary: 开启一条降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_downgrades_ex_async(request, headers, runtime)

    def enable_sg_downgrades_ex(
        self,
        request: ms_models.EnableSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgDowngradesResponse:
        """
        Description: 开启一条降级规则
        Summary: 开启一条降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgDowngradesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgrades.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_downgrades_ex_async(
        self,
        request: ms_models.EnableSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgDowngradesResponse:
        """
        Description: 开启一条降级规则
        Summary: 开启一条降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgDowngradesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgrades.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sg_downgrades(
        self,
        request: ms_models.DisableSgDowngradesRequest,
    ) -> ms_models.DisableSgDowngradesResponse:
        """
        Description: 关闭一条降级规则
        Summary: 关闭一条降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sg_downgrades_ex(request, headers, runtime)

    async def disable_sg_downgrades_async(
        self,
        request: ms_models.DisableSgDowngradesRequest,
    ) -> ms_models.DisableSgDowngradesResponse:
        """
        Description: 关闭一条降级规则
        Summary: 关闭一条降级规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sg_downgrades_ex_async(request, headers, runtime)

    def disable_sg_downgrades_ex(
        self,
        request: ms_models.DisableSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgDowngradesResponse:
        """
        Description: 关闭一条降级规则
        Summary: 关闭一条降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgDowngradesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.downgrades.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sg_downgrades_ex_async(
        self,
        request: ms_models.DisableSgDowngradesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgDowngradesResponse:
        """
        Description: 关闭一条降级规则
        Summary: 关闭一条降级规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgDowngradesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.downgrades.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_circuitbreakerrules(
        self,
        request: ms_models.EnableSgCircuitbreakerrulesRequest,
    ) -> ms_models.EnableSgCircuitbreakerrulesResponse:
        """
        Description: 生效熔断规则
        Summary: 生效熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def enable_sg_circuitbreakerrules_async(
        self,
        request: ms_models.EnableSgCircuitbreakerrulesRequest,
    ) -> ms_models.EnableSgCircuitbreakerrulesResponse:
        """
        Description: 生效熔断规则
        Summary: 生效熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def enable_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.EnableSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgCircuitbreakerrulesResponse:
        """
        Description: 生效熔断规则
        Summary: 生效熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.EnableSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgCircuitbreakerrulesResponse:
        """
        Description: 生效熔断规则
        Summary: 生效熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sg_circuitbreakerrules(
        self,
        request: ms_models.QuerySgCircuitbreakerrulesRequest,
    ) -> ms_models.QuerySgCircuitbreakerrulesResponse:
        """
        Description: 根据实例id和服务id获取所有荣富安规则
        Summary: 熔断规则查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def query_sg_circuitbreakerrules_async(
        self,
        request: ms_models.QuerySgCircuitbreakerrulesRequest,
    ) -> ms_models.QuerySgCircuitbreakerrulesResponse:
        """
        Description: 根据实例id和服务id获取所有荣富安规则
        Summary: 熔断规则查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def query_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.QuerySgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgCircuitbreakerrulesResponse:
        """
        Description: 根据实例id和服务id获取所有荣富安规则
        Summary: 熔断规则查询
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.QuerySgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QuerySgCircuitbreakerrulesResponse:
        """
        Description: 根据实例id和服务id获取所有荣富安规则
        Summary: 熔断规则查询
        """
        UtilClient.validate_model(request)
        return ms_models.QuerySgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_circuitbreakerrules(
        self,
        request: ms_models.ListSgCircuitbreakerrulesRequest,
    ) -> ms_models.ListSgCircuitbreakerrulesResponse:
        """
        Description: 获取租户下服务熔断规则
        Summary: 服务熔断查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def list_sg_circuitbreakerrules_async(
        self,
        request: ms_models.ListSgCircuitbreakerrulesRequest,
    ) -> ms_models.ListSgCircuitbreakerrulesResponse:
        """
        Description: 获取租户下服务熔断规则
        Summary: 服务熔断查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def list_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.ListSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgCircuitbreakerrulesResponse:
        """
        Description: 获取租户下服务熔断规则
        Summary: 服务熔断查询
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.ListSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgCircuitbreakerrulesResponse:
        """
        Description: 获取租户下服务熔断规则
        Summary: 服务熔断查询
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_circuitbreakerrules(
        self,
        request: ms_models.UpdateSgCircuitbreakerrulesRequest,
    ) -> ms_models.UpdateSgCircuitbreakerrulesResponse:
        """
        Description: 更新熔断规则
        Summary: 更新熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def update_sg_circuitbreakerrules_async(
        self,
        request: ms_models.UpdateSgCircuitbreakerrulesRequest,
    ) -> ms_models.UpdateSgCircuitbreakerrulesResponse:
        """
        Description: 更新熔断规则
        Summary: 更新熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def update_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.UpdateSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgCircuitbreakerrulesResponse:
        """
        Description: 更新熔断规则
        Summary: 更新熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.UpdateSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgCircuitbreakerrulesResponse:
        """
        Description: 更新熔断规则
        Summary: 更新熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_circuitbreakerrules(
        self,
        request: ms_models.DeleteSgCircuitbreakerrulesRequest,
    ) -> ms_models.DeleteSgCircuitbreakerrulesResponse:
        """
        Description: 删除熔断规则
        Summary: 删除熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def delete_sg_circuitbreakerrules_async(
        self,
        request: ms_models.DeleteSgCircuitbreakerrulesRequest,
    ) -> ms_models.DeleteSgCircuitbreakerrulesResponse:
        """
        Description: 删除熔断规则
        Summary: 删除熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def delete_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.DeleteSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgCircuitbreakerrulesResponse:
        """
        Description: 删除熔断规则
        Summary: 删除熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.DeleteSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgCircuitbreakerrulesResponse:
        """
        Description: 删除熔断规则
        Summary: 删除熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_circuitbreakerrules(
        self,
        request: ms_models.AddSgCircuitbreakerrulesRequest,
    ) -> ms_models.AddSgCircuitbreakerrulesResponse:
        """
        Description: 添加熔断规则
        Summary: 添加熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def add_sg_circuitbreakerrules_async(
        self,
        request: ms_models.AddSgCircuitbreakerrulesRequest,
    ) -> ms_models.AddSgCircuitbreakerrulesResponse:
        """
        Description: 添加熔断规则
        Summary: 添加熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def add_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.AddSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgCircuitbreakerrulesResponse:
        """
        Description: 添加熔断规则
        Summary: 添加熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.AddSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgCircuitbreakerrulesResponse:
        """
        Description: 添加熔断规则
        Summary: 添加熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_sg_circuitbreakerrules(
        self,
        request: ms_models.SetSgCircuitbreakerrulesRequest,
    ) -> ms_models.SetSgCircuitbreakerrulesResponse:
        """
        Description: 设置熔断规则运行模式
        Summary: 设置熔断规则运行模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def set_sg_circuitbreakerrules_async(
        self,
        request: ms_models.SetSgCircuitbreakerrulesRequest,
    ) -> ms_models.SetSgCircuitbreakerrulesResponse:
        """
        Description: 设置熔断规则运行模式
        Summary: 设置熔断规则运行模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def set_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.SetSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SetSgCircuitbreakerrulesResponse:
        """
        Description: 设置熔断规则运行模式
        Summary: 设置熔断规则运行模式
        """
        UtilClient.validate_model(request)
        return ms_models.SetSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.SetSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.SetSgCircuitbreakerrulesResponse:
        """
        Description: 设置熔断规则运行模式
        Summary: 设置熔断规则运行模式
        """
        UtilClient.validate_model(request)
        return ms_models.SetSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_rc_synccluster(
        self,
        request: ms_models.ReinitRcSyncclusterRequest,
    ) -> ms_models.ReinitRcSyncclusterResponse:
        """
        Description: 重新初始化注册中心同步集群信息
        Summary: 重新初始化注册中心同步集群信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_rc_synccluster_ex(request, headers, runtime)

    async def reinit_rc_synccluster_async(
        self,
        request: ms_models.ReinitRcSyncclusterRequest,
    ) -> ms_models.ReinitRcSyncclusterResponse:
        """
        Description: 重新初始化注册中心同步集群信息
        Summary: 重新初始化注册中心同步集群信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_rc_synccluster_ex_async(request, headers, runtime)

    def reinit_rc_synccluster_ex(
        self,
        request: ms_models.ReinitRcSyncclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ReinitRcSyncclusterResponse:
        """
        Description: 重新初始化注册中心同步集群信息
        Summary: 重新初始化注册中心同步集群信息
        """
        UtilClient.validate_model(request)
        return ms_models.ReinitRcSyncclusterResponse().from_map(
            self.do_request('2.0', 'sofa.ms.rc.synccluster.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_rc_synccluster_ex_async(
        self,
        request: ms_models.ReinitRcSyncclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ReinitRcSyncclusterResponse:
        """
        Description: 重新初始化注册中心同步集群信息
        Summary: 重新初始化注册中心同步集群信息
        """
        UtilClient.validate_model(request)
        return ms_models.ReinitRcSyncclusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.rc.synccluster.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_transparentproxy_node(
        self,
        request: ms_models.AddTransparentproxyNodeRequest,
    ) -> ms_models.AddTransparentproxyNodeResponse:
        """
        Description: 在指定应用上添加透明劫持节点。
        Summary: 添加透明劫持节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_transparentproxy_node_ex(request, headers, runtime)

    async def add_transparentproxy_node_async(
        self,
        request: ms_models.AddTransparentproxyNodeRequest,
    ) -> ms_models.AddTransparentproxyNodeResponse:
        """
        Description: 在指定应用上添加透明劫持节点。
        Summary: 添加透明劫持节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_transparentproxy_node_ex_async(request, headers, runtime)

    def add_transparentproxy_node_ex(
        self,
        request: ms_models.AddTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddTransparentproxyNodeResponse:
        """
        Description: 在指定应用上添加透明劫持节点。
        Summary: 添加透明劫持节点
        """
        UtilClient.validate_model(request)
        return ms_models.AddTransparentproxyNodeResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.node.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_transparentproxy_node_ex_async(
        self,
        request: ms_models.AddTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddTransparentproxyNodeResponse:
        """
        Description: 在指定应用上添加透明劫持节点。
        Summary: 添加透明劫持节点
        """
        UtilClient.validate_model(request)
        return ms_models.AddTransparentproxyNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.node.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_transparentproxy_app(
        self,
        request: ms_models.DeleteTransparentproxyAppRequest,
    ) -> ms_models.DeleteTransparentproxyAppResponse:
        """
        Description: 根据应用 ID，删除对应的透明劫持应用。
        Summary: 删除透明劫持应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_transparentproxy_app_ex(request, headers, runtime)

    async def delete_transparentproxy_app_async(
        self,
        request: ms_models.DeleteTransparentproxyAppRequest,
    ) -> ms_models.DeleteTransparentproxyAppResponse:
        """
        Description: 根据应用 ID，删除对应的透明劫持应用。
        Summary: 删除透明劫持应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_transparentproxy_app_ex_async(request, headers, runtime)

    def delete_transparentproxy_app_ex(
        self,
        request: ms_models.DeleteTransparentproxyAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteTransparentproxyAppResponse:
        """
        Description: 根据应用 ID，删除对应的透明劫持应用。
        Summary: 删除透明劫持应用
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteTransparentproxyAppResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_transparentproxy_app_ex_async(
        self,
        request: ms_models.DeleteTransparentproxyAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteTransparentproxyAppResponse:
        """
        Description: 根据应用 ID，删除对应的透明劫持应用。
        Summary: 删除透明劫持应用
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteTransparentproxyAppResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_transparentproxy_app(
        self,
        request: ms_models.QueryTransparentproxyAppRequest,
    ) -> ms_models.QueryTransparentproxyAppResponse:
        """
        Description: 查询指定环境下服务治理中的透明劫持应用列表。
        Summary: 服务治理透明劫持应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_transparentproxy_app_ex(request, headers, runtime)

    async def query_transparentproxy_app_async(
        self,
        request: ms_models.QueryTransparentproxyAppRequest,
    ) -> ms_models.QueryTransparentproxyAppResponse:
        """
        Description: 查询指定环境下服务治理中的透明劫持应用列表。
        Summary: 服务治理透明劫持应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_transparentproxy_app_ex_async(request, headers, runtime)

    def query_transparentproxy_app_ex(
        self,
        request: ms_models.QueryTransparentproxyAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxyAppResponse:
        """
        Description: 查询指定环境下服务治理中的透明劫持应用列表。
        Summary: 服务治理透明劫持应用列表
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxyAppResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_transparentproxy_app_ex_async(
        self,
        request: ms_models.QueryTransparentproxyAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxyAppResponse:
        """
        Description: 查询指定环境下服务治理中的透明劫持应用列表。
        Summary: 服务治理透明劫持应用列表
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxyAppResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_transparentproxy_config(
        self,
        request: ms_models.UpdateTransparentproxyConfigRequest,
    ) -> ms_models.UpdateTransparentproxyConfigResponse:
        """
        Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
        Summary: 透明劫持规则配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_transparentproxy_config_ex(request, headers, runtime)

    async def update_transparentproxy_config_async(
        self,
        request: ms_models.UpdateTransparentproxyConfigRequest,
    ) -> ms_models.UpdateTransparentproxyConfigResponse:
        """
        Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
        Summary: 透明劫持规则配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_transparentproxy_config_ex_async(request, headers, runtime)

    def update_transparentproxy_config_ex(
        self,
        request: ms_models.UpdateTransparentproxyConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateTransparentproxyConfigResponse:
        """
        Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
        Summary: 透明劫持规则配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateTransparentproxyConfigResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_transparentproxy_config_ex_async(
        self,
        request: ms_models.UpdateTransparentproxyConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateTransparentproxyConfigResponse:
        """
        Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
        Summary: 透明劫持规则配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateTransparentproxyConfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_transparentproxy_log(
        self,
        request: ms_models.QueryTransparentproxyLogRequest,
    ) -> ms_models.QueryTransparentproxyLogResponse:
        """
        Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
        Summary: 查询透明劫持应用治理日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_transparentproxy_log_ex(request, headers, runtime)

    async def query_transparentproxy_log_async(
        self,
        request: ms_models.QueryTransparentproxyLogRequest,
    ) -> ms_models.QueryTransparentproxyLogResponse:
        """
        Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
        Summary: 查询透明劫持应用治理日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_transparentproxy_log_ex_async(request, headers, runtime)

    def query_transparentproxy_log_ex(
        self,
        request: ms_models.QueryTransparentproxyLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxyLogResponse:
        """
        Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
        Summary: 查询透明劫持应用治理日志
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxyLogResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_transparentproxy_log_ex_async(
        self,
        request: ms_models.QueryTransparentproxyLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxyLogResponse:
        """
        Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
        Summary: 查询透明劫持应用治理日志
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxyLogResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_transparentproxy_app(
        self,
        request: ms_models.AddTransparentproxyAppRequest,
    ) -> ms_models.AddTransparentproxyAppResponse:
        """
        Description: 添加一个透明劫持应用。
        Summary: 添加透明劫持应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_transparentproxy_app_ex(request, headers, runtime)

    async def add_transparentproxy_app_async(
        self,
        request: ms_models.AddTransparentproxyAppRequest,
    ) -> ms_models.AddTransparentproxyAppResponse:
        """
        Description: 添加一个透明劫持应用。
        Summary: 添加透明劫持应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_transparentproxy_app_ex_async(request, headers, runtime)

    def add_transparentproxy_app_ex(
        self,
        request: ms_models.AddTransparentproxyAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddTransparentproxyAppResponse:
        """
        Description: 添加一个透明劫持应用。
        Summary: 添加透明劫持应用
        """
        UtilClient.validate_model(request)
        return ms_models.AddTransparentproxyAppResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.app.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_transparentproxy_app_ex_async(
        self,
        request: ms_models.AddTransparentproxyAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddTransparentproxyAppResponse:
        """
        Description: 添加一个透明劫持应用。
        Summary: 添加透明劫持应用
        """
        UtilClient.validate_model(request)
        return ms_models.AddTransparentproxyAppResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.app.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_transparentproxy_node(
        self,
        request: ms_models.DeleteTransparentproxyNodeRequest,
    ) -> ms_models.DeleteTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，删除对应的透明劫持应用节点。
        Summary: 删除透明劫持应用节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_transparentproxy_node_ex(request, headers, runtime)

    async def delete_transparentproxy_node_async(
        self,
        request: ms_models.DeleteTransparentproxyNodeRequest,
    ) -> ms_models.DeleteTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，删除对应的透明劫持应用节点。
        Summary: 删除透明劫持应用节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_transparentproxy_node_ex_async(request, headers, runtime)

    def delete_transparentproxy_node_ex(
        self,
        request: ms_models.DeleteTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，删除对应的透明劫持应用节点。
        Summary: 删除透明劫持应用节点
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteTransparentproxyNodeResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.node.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_transparentproxy_node_ex_async(
        self,
        request: ms_models.DeleteTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，删除对应的透明劫持应用节点。
        Summary: 删除透明劫持应用节点
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteTransparentproxyNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.node.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_transparentproxy_node(
        self,
        request: ms_models.QueryTransparentproxyNodeRequest,
    ) -> ms_models.QueryTransparentproxyNodeResponse:
        """
        Description: 查询透明劫持应用的节点列表。
        Summary: 查询透明劫持应用的节点列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_transparentproxy_node_ex(request, headers, runtime)

    async def query_transparentproxy_node_async(
        self,
        request: ms_models.QueryTransparentproxyNodeRequest,
    ) -> ms_models.QueryTransparentproxyNodeResponse:
        """
        Description: 查询透明劫持应用的节点列表。
        Summary: 查询透明劫持应用的节点列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_transparentproxy_node_ex_async(request, headers, runtime)

    def query_transparentproxy_node_ex(
        self,
        request: ms_models.QueryTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxyNodeResponse:
        """
        Description: 查询透明劫持应用的节点列表。
        Summary: 查询透明劫持应用的节点列表
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxyNodeResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.node.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_transparentproxy_node_ex_async(
        self,
        request: ms_models.QueryTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxyNodeResponse:
        """
        Description: 查询透明劫持应用的节点列表。
        Summary: 查询透明劫持应用的节点列表
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxyNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.node.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_transparentproxy_protocolconfig(
        self,
        request: ms_models.UpdateTransparentproxyProtocolconfigRequest,
    ) -> ms_models.UpdateTransparentproxyProtocolconfigResponse:
        """
        Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
        Summary: 更新透明劫持应用治理配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_transparentproxy_protocolconfig_ex(request, headers, runtime)

    async def update_transparentproxy_protocolconfig_async(
        self,
        request: ms_models.UpdateTransparentproxyProtocolconfigRequest,
    ) -> ms_models.UpdateTransparentproxyProtocolconfigResponse:
        """
        Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
        Summary: 更新透明劫持应用治理配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_transparentproxy_protocolconfig_ex_async(request, headers, runtime)

    def update_transparentproxy_protocolconfig_ex(
        self,
        request: ms_models.UpdateTransparentproxyProtocolconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateTransparentproxyProtocolconfigResponse:
        """
        Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
        Summary: 更新透明劫持应用治理配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateTransparentproxyProtocolconfigResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.protocolconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_transparentproxy_protocolconfig_ex_async(
        self,
        request: ms_models.UpdateTransparentproxyProtocolconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateTransparentproxyProtocolconfigResponse:
        """
        Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
        Summary: 更新透明劫持应用治理配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateTransparentproxyProtocolconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.protocolconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_transparentproxy_node(
        self,
        request: ms_models.EnableTransparentproxyNodeRequest,
    ) -> ms_models.EnableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
        Summary: 打开节点透明劫持开关（批量）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_transparentproxy_node_ex(request, headers, runtime)

    async def enable_transparentproxy_node_async(
        self,
        request: ms_models.EnableTransparentproxyNodeRequest,
    ) -> ms_models.EnableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
        Summary: 打开节点透明劫持开关（批量）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_transparentproxy_node_ex_async(request, headers, runtime)

    def enable_transparentproxy_node_ex(
        self,
        request: ms_models.EnableTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
        Summary: 打开节点透明劫持开关（批量）
        """
        UtilClient.validate_model(request)
        return ms_models.EnableTransparentproxyNodeResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.node.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_transparentproxy_node_ex_async(
        self,
        request: ms_models.EnableTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
        Summary: 打开节点透明劫持开关（批量）
        """
        UtilClient.validate_model(request)
        return ms_models.EnableTransparentproxyNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.node.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_transparentproxy_node(
        self,
        request: ms_models.DisableTransparentproxyNodeRequest,
    ) -> ms_models.DisableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
        Summary: 关闭透明劫持节点开关（批量）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_transparentproxy_node_ex(request, headers, runtime)

    async def disable_transparentproxy_node_async(
        self,
        request: ms_models.DisableTransparentproxyNodeRequest,
    ) -> ms_models.DisableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
        Summary: 关闭透明劫持节点开关（批量）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_transparentproxy_node_ex_async(request, headers, runtime)

    def disable_transparentproxy_node_ex(
        self,
        request: ms_models.DisableTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
        Summary: 关闭透明劫持节点开关（批量）
        """
        UtilClient.validate_model(request)
        return ms_models.DisableTransparentproxyNodeResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.node.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_transparentproxy_node_ex_async(
        self,
        request: ms_models.DisableTransparentproxyNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableTransparentproxyNodeResponse:
        """
        Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
        Summary: 关闭透明劫持节点开关（批量）
        """
        UtilClient.validate_model(request)
        return ms_models.DisableTransparentproxyNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.node.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_sg_circuitbreakerrules(
        self,
        request: ms_models.AllSgCircuitbreakerrulesRequest,
    ) -> ms_models.AllSgCircuitbreakerrulesResponse:
        """
        Description: 查询所有的服务熔断的appName及对应的规则数
        Summary: 服务熔断查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def all_sg_circuitbreakerrules_async(
        self,
        request: ms_models.AllSgCircuitbreakerrulesRequest,
    ) -> ms_models.AllSgCircuitbreakerrulesResponse:
        """
        Description: 查询所有的服务熔断的appName及对应的规则数
        Summary: 服务熔断查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def all_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.AllSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllSgCircuitbreakerrulesResponse:
        """
        Description: 查询所有的服务熔断的appName及对应的规则数
        Summary: 服务熔断查询
        """
        UtilClient.validate_model(request)
        return ms_models.AllSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.AllSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AllSgCircuitbreakerrulesResponse:
        """
        Description: 查询所有的服务熔断的appName及对应的规则数
        Summary: 服务熔断查询
        """
        UtilClient.validate_model(request)
        return ms_models.AllSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sg_circuitbreakerrules(
        self,
        request: ms_models.GetSgCircuitbreakerrulesRequest,
    ) -> ms_models.GetSgCircuitbreakerrulesResponse:
        """
        Description: 通过appName查询熔断规则
        Summary: 通过appName查询熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sg_circuitbreakerrules_ex(request, headers, runtime)

    async def get_sg_circuitbreakerrules_async(
        self,
        request: ms_models.GetSgCircuitbreakerrulesRequest,
    ) -> ms_models.GetSgCircuitbreakerrulesResponse:
        """
        Description: 通过appName查询熔断规则
        Summary: 通过appName查询熔断规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sg_circuitbreakerrules_ex_async(request, headers, runtime)

    def get_sg_circuitbreakerrules_ex(
        self,
        request: ms_models.GetSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgCircuitbreakerrulesResponse:
        """
        Description: 通过appName查询熔断规则
        Summary: 通过appName查询熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgCircuitbreakerrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.circuitbreakerrules.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sg_circuitbreakerrules_ex_async(
        self,
        request: ms_models.GetSgCircuitbreakerrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSgCircuitbreakerrulesResponse:
        """
        Description: 通过appName查询熔断规则
        Summary: 通过appName查询熔断规则
        """
        UtilClient.validate_model(request)
        return ms_models.GetSgCircuitbreakerrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.circuitbreakerrules.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_transparentproxy_sidecarlink(
        self,
        request: ms_models.QueryTransparentproxySidecarlinkRequest,
    ) -> ms_models.QueryTransparentproxySidecarlinkResponse:
        """
        Description: 透明劫持sidecar脚本链接查询接口
        Summary: 透明劫持sidecar脚本链接查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_transparentproxy_sidecarlink_ex(request, headers, runtime)

    async def query_transparentproxy_sidecarlink_async(
        self,
        request: ms_models.QueryTransparentproxySidecarlinkRequest,
    ) -> ms_models.QueryTransparentproxySidecarlinkResponse:
        """
        Description: 透明劫持sidecar脚本链接查询接口
        Summary: 透明劫持sidecar脚本链接查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_transparentproxy_sidecarlink_ex_async(request, headers, runtime)

    def query_transparentproxy_sidecarlink_ex(
        self,
        request: ms_models.QueryTransparentproxySidecarlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxySidecarlinkResponse:
        """
        Description: 透明劫持sidecar脚本链接查询接口
        Summary: 透明劫持sidecar脚本链接查询接口
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxySidecarlinkResponse().from_map(
            self.do_request('2.0', 'sofa.ms.transparentproxy.sidecarlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_transparentproxy_sidecarlink_ex_async(
        self,
        request: ms_models.QueryTransparentproxySidecarlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.QueryTransparentproxySidecarlinkResponse:
        """
        Description: 透明劫持sidecar脚本链接查询接口
        Summary: 透明劫持sidecar脚本链接查询接口
        """
        UtilClient.validate_model(request)
        return ms_models.QueryTransparentproxySidecarlinkResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.transparentproxy.sidecarlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authruledataids(
        self,
        request: ms_models.ListSgAuthruledataidsRequest,
    ) -> ms_models.ListSgAuthruledataidsResponse:
        """
        Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的服务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authruledataids_ex(request, headers, runtime)

    async def list_sg_authruledataids_async(
        self,
        request: ms_models.ListSgAuthruledataidsRequest,
    ) -> ms_models.ListSgAuthruledataidsResponse:
        """
        Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的服务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authruledataids_ex_async(request, headers, runtime)

    def list_sg_authruledataids_ex(
        self,
        request: ms_models.ListSgAuthruledataidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruledataidsResponse:
        """
        Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的服务ID
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruledataidsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authruledataids.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authruledataids_ex_async(
        self,
        request: ms_models.ListSgAuthruledataidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruledataidsResponse:
        """
        Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的服务ID
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruledataidsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authruledataids.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authruleappnames(
        self,
        request: ms_models.ListSgAuthruleappnamesRequest,
    ) -> ms_models.ListSgAuthruleappnamesResponse:
        """
        Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的应用名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authruleappnames_ex(request, headers, runtime)

    async def list_sg_authruleappnames_async(
        self,
        request: ms_models.ListSgAuthruleappnamesRequest,
    ) -> ms_models.ListSgAuthruleappnamesResponse:
        """
        Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的应用名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authruleappnames_ex_async(request, headers, runtime)

    def list_sg_authruleappnames_ex(
        self,
        request: ms_models.ListSgAuthruleappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruleappnamesResponse:
        """
        Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的应用名
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruleappnamesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authruleappnames.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authruleappnames_ex_async(
        self,
        request: ms_models.ListSgAuthruleappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruleappnamesResponse:
        """
        Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
        Summary: 查找出所有包含鉴权规则组的应用名
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruleappnamesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authruleappnames.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authruleactiveappnames(
        self,
        request: ms_models.ListSgAuthruleactiveappnamesRequest,
    ) -> ms_models.ListSgAuthruleactiveappnamesResponse:
        """
        Description: 查找出目前存活的应用名称列表
        Summary: 查找出目前存活的应用名称列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authruleactiveappnames_ex(request, headers, runtime)

    async def list_sg_authruleactiveappnames_async(
        self,
        request: ms_models.ListSgAuthruleactiveappnamesRequest,
    ) -> ms_models.ListSgAuthruleactiveappnamesResponse:
        """
        Description: 查找出目前存活的应用名称列表
        Summary: 查找出目前存活的应用名称列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authruleactiveappnames_ex_async(request, headers, runtime)

    def list_sg_authruleactiveappnames_ex(
        self,
        request: ms_models.ListSgAuthruleactiveappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruleactiveappnamesResponse:
        """
        Description: 查找出目前存活的应用名称列表
        Summary: 查找出目前存活的应用名称列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruleactiveappnamesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authruleactiveappnames.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authruleactiveappnames_ex_async(
        self,
        request: ms_models.ListSgAuthruleactiveappnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruleactiveappnamesResponse:
        """
        Description: 查找出目前存活的应用名称列表
        Summary: 查找出目前存活的应用名称列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruleactiveappnamesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authruleactiveappnames.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authruleactivedataids(
        self,
        request: ms_models.ListSgAuthruleactivedataidsRequest,
    ) -> ms_models.ListSgAuthruleactivedataidsResponse:
        """
        Description: 查找该应用下存活的服务列表
        Summary: 查找该应用下存活的服务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authruleactivedataids_ex(request, headers, runtime)

    async def list_sg_authruleactivedataids_async(
        self,
        request: ms_models.ListSgAuthruleactivedataidsRequest,
    ) -> ms_models.ListSgAuthruleactivedataidsResponse:
        """
        Description: 查找该应用下存活的服务列表
        Summary: 查找该应用下存活的服务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authruleactivedataids_ex_async(request, headers, runtime)

    def list_sg_authruleactivedataids_ex(
        self,
        request: ms_models.ListSgAuthruleactivedataidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruleactivedataidsResponse:
        """
        Description: 查找该应用下存活的服务列表
        Summary: 查找该应用下存活的服务列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruleactivedataidsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authruleactivedataids.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authruleactivedataids_ex_async(
        self,
        request: ms_models.ListSgAuthruleactivedataidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthruleactivedataidsResponse:
        """
        Description: 查找该应用下存活的服务列表
        Summary: 查找该应用下存活的服务列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthruleactivedataidsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authruleactivedataids.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authrulegroupapps(
        self,
        request: ms_models.ListSgAuthrulegroupappsRequest,
    ) -> ms_models.ListSgAuthrulegroupappsResponse:
        """
        Description: 应用级服务鉴权列表搜索
        Summary: 应用级服务鉴权列表搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authrulegroupapps_ex(request, headers, runtime)

    async def list_sg_authrulegroupapps_async(
        self,
        request: ms_models.ListSgAuthrulegroupappsRequest,
    ) -> ms_models.ListSgAuthrulegroupappsResponse:
        """
        Description: 应用级服务鉴权列表搜索
        Summary: 应用级服务鉴权列表搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authrulegroupapps_ex_async(request, headers, runtime)

    def list_sg_authrulegroupapps_ex(
        self,
        request: ms_models.ListSgAuthrulegroupappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthrulegroupappsResponse:
        """
        Description: 应用级服务鉴权列表搜索
        Summary: 应用级服务鉴权列表搜索
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthrulegroupappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroupapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authrulegroupapps_ex_async(
        self,
        request: ms_models.ListSgAuthrulegroupappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthrulegroupappsResponse:
        """
        Description: 应用级服务鉴权列表搜索
        Summary: 应用级服务鉴权列表搜索
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthrulegroupappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroupapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_authrulegroupservices(
        self,
        request: ms_models.ListSgAuthrulegroupservicesRequest,
    ) -> ms_models.ListSgAuthrulegroupservicesResponse:
        """
        Description: 服务级服务鉴权列表搜索
        Summary: 服务级服务鉴权列表搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_authrulegroupservices_ex(request, headers, runtime)

    async def list_sg_authrulegroupservices_async(
        self,
        request: ms_models.ListSgAuthrulegroupservicesRequest,
    ) -> ms_models.ListSgAuthrulegroupservicesResponse:
        """
        Description: 服务级服务鉴权列表搜索
        Summary: 服务级服务鉴权列表搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_authrulegroupservices_ex_async(request, headers, runtime)

    def list_sg_authrulegroupservices_ex(
        self,
        request: ms_models.ListSgAuthrulegroupservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthrulegroupservicesResponse:
        """
        Description: 服务级服务鉴权列表搜索
        Summary: 服务级服务鉴权列表搜索
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthrulegroupservicesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroupservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_authrulegroupservices_ex_async(
        self,
        request: ms_models.ListSgAuthrulegroupservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuthrulegroupservicesResponse:
        """
        Description: 服务级服务鉴权列表搜索
        Summary: 服务级服务鉴权列表搜索
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuthrulegroupservicesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroupservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_authrulegroupsbatch(
        self,
        request: ms_models.AddSgAuthrulegroupsbatchRequest,
    ) -> ms_models.AddSgAuthrulegroupsbatchResponse:
        """
        Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
        Summary: 添加鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_authrulegroupsbatch_ex(request, headers, runtime)

    async def add_sg_authrulegroupsbatch_async(
        self,
        request: ms_models.AddSgAuthrulegroupsbatchRequest,
    ) -> ms_models.AddSgAuthrulegroupsbatchResponse:
        """
        Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
        Summary: 添加鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_authrulegroupsbatch_ex_async(request, headers, runtime)

    def add_sg_authrulegroupsbatch_ex(
        self,
        request: ms_models.AddSgAuthrulegroupsbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgAuthrulegroupsbatchResponse:
        """
        Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
        Summary: 添加鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgAuthrulegroupsbatchResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroupsbatch.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_authrulegroupsbatch_ex_async(
        self,
        request: ms_models.AddSgAuthrulegroupsbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgAuthrulegroupsbatchResponse:
        """
        Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
        Summary: 添加鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgAuthrulegroupsbatchResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroupsbatch.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_authrulegroupsbatch(
        self,
        request: ms_models.EnableSgAuthrulegroupsbatchRequest,
    ) -> ms_models.EnableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量开启鉴权规则
        Summary: 批量开启鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_authrulegroupsbatch_ex(request, headers, runtime)

    async def enable_sg_authrulegroupsbatch_async(
        self,
        request: ms_models.EnableSgAuthrulegroupsbatchRequest,
    ) -> ms_models.EnableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量开启鉴权规则
        Summary: 批量开启鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_authrulegroupsbatch_ex_async(request, headers, runtime)

    def enable_sg_authrulegroupsbatch_ex(
        self,
        request: ms_models.EnableSgAuthrulegroupsbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量开启鉴权规则
        Summary: 批量开启鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgAuthrulegroupsbatchResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroupsbatch.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_authrulegroupsbatch_ex_async(
        self,
        request: ms_models.EnableSgAuthrulegroupsbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量开启鉴权规则
        Summary: 批量开启鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgAuthrulegroupsbatchResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroupsbatch.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sg_authrulegroupsbatch(
        self,
        request: ms_models.DisableSgAuthrulegroupsbatchRequest,
    ) -> ms_models.DisableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量关闭鉴权规则
        Summary: 批量关闭鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sg_authrulegroupsbatch_ex(request, headers, runtime)

    async def disable_sg_authrulegroupsbatch_async(
        self,
        request: ms_models.DisableSgAuthrulegroupsbatchRequest,
    ) -> ms_models.DisableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量关闭鉴权规则
        Summary: 批量关闭鉴权规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sg_authrulegroupsbatch_ex_async(request, headers, runtime)

    def disable_sg_authrulegroupsbatch_ex(
        self,
        request: ms_models.DisableSgAuthrulegroupsbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量关闭鉴权规则
        Summary: 批量关闭鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgAuthrulegroupsbatchResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroupsbatch.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sg_authrulegroupsbatch_ex_async(
        self,
        request: ms_models.DisableSgAuthrulegroupsbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DisableSgAuthrulegroupsbatchResponse:
        """
        Description: 批量关闭鉴权规则
        Summary: 批量关闭鉴权规则
        """
        UtilClient.validate_model(request)
        return ms_models.DisableSgAuthrulegroupsbatchResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroupsbatch.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_sg_authrulegroups(
        self,
        request: ms_models.ExportSgAuthrulegroupsRequest,
    ) -> ms_models.ExportSgAuthrulegroupsResponse:
        """
        Description: 导出鉴权规则数据
        Summary: 导出鉴权规则数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_sg_authrulegroups_ex(request, headers, runtime)

    async def export_sg_authrulegroups_async(
        self,
        request: ms_models.ExportSgAuthrulegroupsRequest,
    ) -> ms_models.ExportSgAuthrulegroupsResponse:
        """
        Description: 导出鉴权规则数据
        Summary: 导出鉴权规则数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_sg_authrulegroups_ex_async(request, headers, runtime)

    def export_sg_authrulegroups_ex(
        self,
        request: ms_models.ExportSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportSgAuthrulegroupsResponse:
        """
        Description: 导出鉴权规则数据
        Summary: 导出鉴权规则数据
        """
        UtilClient.validate_model(request)
        return ms_models.ExportSgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_sg_authrulegroups_ex_async(
        self,
        request: ms_models.ExportSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportSgAuthrulegroupsResponse:
        """
        Description: 导出鉴权规则数据
        Summary: 导出鉴权规则数据
        """
        UtilClient.validate_model(request)
        return ms_models.ExportSgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_sg_authrulegroups(
        self,
        request: ms_models.ImportSgAuthrulegroupsRequest,
    ) -> ms_models.ImportSgAuthrulegroupsResponse:
        """
        Description: 导入鉴权规则数据
        Summary: 导入鉴权规则数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_sg_authrulegroups_ex(request, headers, runtime)

    async def import_sg_authrulegroups_async(
        self,
        request: ms_models.ImportSgAuthrulegroupsRequest,
    ) -> ms_models.ImportSgAuthrulegroupsResponse:
        """
        Description: 导入鉴权规则数据
        Summary: 导入鉴权规则数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_sg_authrulegroups_ex_async(request, headers, runtime)

    def import_sg_authrulegroups_ex(
        self,
        request: ms_models.ImportSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportSgAuthrulegroupsResponse:
        """
        Description: 导入鉴权规则数据
        Summary: 导入鉴权规则数据
        """
        UtilClient.validate_model(request)
        return ms_models.ImportSgAuthrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.authrulegroups.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_sg_authrulegroups_ex_async(
        self,
        request: ms_models.ImportSgAuthrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportSgAuthrulegroupsResponse:
        """
        Description: 导入鉴权规则数据
        Summary: 导入鉴权规则数据
        """
        UtilClient.validate_model(request)
        return ms_models.ImportSgAuthrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.authrulegroups.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_sg_resource(
        self,
        request: ms_models.ImportSgResourceRequest,
    ) -> ms_models.ImportSgResourceResponse:
        """
        Description: 资源以文件形式导入导出
        Summary: 资源以文件形式导入导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_sg_resource_ex(request, headers, runtime)

    async def import_sg_resource_async(
        self,
        request: ms_models.ImportSgResourceRequest,
    ) -> ms_models.ImportSgResourceResponse:
        """
        Description: 资源以文件形式导入导出
        Summary: 资源以文件形式导入导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_sg_resource_ex_async(request, headers, runtime)

    def import_sg_resource_ex(
        self,
        request: ms_models.ImportSgResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportSgResourceResponse:
        """
        Description: 资源以文件形式导入导出
        Summary: 资源以文件形式导入导出
        """
        UtilClient.validate_model(request)
        return ms_models.ImportSgResourceResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.resource.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_sg_resource_ex_async(
        self,
        request: ms_models.ImportSgResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ImportSgResourceResponse:
        """
        Description: 资源以文件形式导入导出
        Summary: 资源以文件形式导入导出
        """
        UtilClient.validate_model(request)
        return ms_models.ImportSgResourceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.resource.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_sg_resource(
        self,
        request: ms_models.ExportSgResourceRequest,
    ) -> ms_models.ExportSgResourceResponse:
        """
        Description: 资源以文件形式导出
        Summary: 资源以文件形式导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_sg_resource_ex(request, headers, runtime)

    async def export_sg_resource_async(
        self,
        request: ms_models.ExportSgResourceRequest,
    ) -> ms_models.ExportSgResourceResponse:
        """
        Description: 资源以文件形式导出
        Summary: 资源以文件形式导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_sg_resource_ex_async(request, headers, runtime)

    def export_sg_resource_ex(
        self,
        request: ms_models.ExportSgResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportSgResourceResponse:
        """
        Description: 资源以文件形式导出
        Summary: 资源以文件形式导出
        """
        UtilClient.validate_model(request)
        return ms_models.ExportSgResourceResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.resource.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_sg_resource_ex_async(
        self,
        request: ms_models.ExportSgResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ExportSgResourceResponse:
        """
        Description: 资源以文件形式导出
        Summary: 资源以文件形式导出
        """
        UtilClient.validate_model(request)
        return ms_models.ExportSgResourceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.resource.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_undisplay_components(
        self,
        request: ms_models.ListUndisplayComponentsRequest,
    ) -> ms_models.ListUndisplayComponentsResponse:
        """
        Description: 获取不展示的UI列表
        Summary: 前端屏蔽UI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_undisplay_components_ex(request, headers, runtime)

    async def list_undisplay_components_async(
        self,
        request: ms_models.ListUndisplayComponentsRequest,
    ) -> ms_models.ListUndisplayComponentsResponse:
        """
        Description: 获取不展示的UI列表
        Summary: 前端屏蔽UI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_undisplay_components_ex_async(request, headers, runtime)

    def list_undisplay_components_ex(
        self,
        request: ms_models.ListUndisplayComponentsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListUndisplayComponentsResponse:
        """
        Description: 获取不展示的UI列表
        Summary: 前端屏蔽UI
        """
        UtilClient.validate_model(request)
        return ms_models.ListUndisplayComponentsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.undisplay.components.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_undisplay_components_ex_async(
        self,
        request: ms_models.ListUndisplayComponentsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListUndisplayComponentsResponse:
        """
        Description: 获取不展示的UI列表
        Summary: 前端屏蔽UI
        """
        UtilClient.validate_model(request)
        return ms_models.ListUndisplayComponentsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.undisplay.components.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_listauthrules(
        self,
        request: ms_models.UpdateSgListauthrulesRequest,
    ) -> ms_models.UpdateSgListauthrulesResponse:
        """
        Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
        Summary: 列表使用的更新服务鉴权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_listauthrules_ex(request, headers, runtime)

    async def update_sg_listauthrules_async(
        self,
        request: ms_models.UpdateSgListauthrulesRequest,
    ) -> ms_models.UpdateSgListauthrulesResponse:
        """
        Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
        Summary: 列表使用的更新服务鉴权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_listauthrules_ex_async(request, headers, runtime)

    def update_sg_listauthrules_ex(
        self,
        request: ms_models.UpdateSgListauthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgListauthrulesResponse:
        """
        Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
        Summary: 列表使用的更新服务鉴权接口
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgListauthrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.listauthrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_listauthrules_ex_async(
        self,
        request: ms_models.UpdateSgListauthrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgListauthrulesResponse:
        """
        Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
        Summary: 列表使用的更新服务鉴权接口
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgListauthrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.listauthrules.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_serviceratelimitrules(
        self,
        request: ms_models.ListSgServiceratelimitrulesRequest,
    ) -> ms_models.ListSgServiceratelimitrulesResponse:
        """
        Description: 按照条件分页查询限流规则列表数据
        Summary: 限流规则列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_serviceratelimitrules_ex(request, headers, runtime)

    async def list_sg_serviceratelimitrules_async(
        self,
        request: ms_models.ListSgServiceratelimitrulesRequest,
    ) -> ms_models.ListSgServiceratelimitrulesResponse:
        """
        Description: 按照条件分页查询限流规则列表数据
        Summary: 限流规则列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_serviceratelimitrules_ex_async(request, headers, runtime)

    def list_sg_serviceratelimitrules_ex(
        self,
        request: ms_models.ListSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServiceratelimitrulesResponse:
        """
        Description: 按照条件分页查询限流规则列表数据
        Summary: 限流规则列表查询
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServiceratelimitrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.serviceratelimitrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_serviceratelimitrules_ex_async(
        self,
        request: ms_models.ListSgServiceratelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgServiceratelimitrulesResponse:
        """
        Description: 按照条件分页查询限流规则列表数据
        Summary: 限流规则列表查询
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgServiceratelimitrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.serviceratelimitrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_faultinjectapps(
        self,
        request: ms_models.ListSgFaultinjectappsRequest,
    ) -> ms_models.ListSgFaultinjectappsResponse:
        """
        Description: 查询故障注入一级列表
        Summary: 查询故障注入一级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_faultinjectapps_ex(request, headers, runtime)

    async def list_sg_faultinjectapps_async(
        self,
        request: ms_models.ListSgFaultinjectappsRequest,
    ) -> ms_models.ListSgFaultinjectappsResponse:
        """
        Description: 查询故障注入一级列表
        Summary: 查询故障注入一级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_faultinjectapps_ex_async(request, headers, runtime)

    def list_sg_faultinjectapps_ex(
        self,
        request: ms_models.ListSgFaultinjectappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectappsResponse:
        """
        Description: 查询故障注入一级列表
        Summary: 查询故障注入一级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_faultinjectapps_ex_async(
        self,
        request: ms_models.ListSgFaultinjectappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectappsResponse:
        """
        Description: 查询故障注入一级列表
        Summary: 查询故障注入一级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_faultinjectrules(
        self,
        request: ms_models.ListSgFaultinjectrulesRequest,
    ) -> ms_models.ListSgFaultinjectrulesResponse:
        """
        Description: 分页查询故障注入二级列表
        Summary: 分页查询故障注入二级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_faultinjectrules_ex(request, headers, runtime)

    async def list_sg_faultinjectrules_async(
        self,
        request: ms_models.ListSgFaultinjectrulesRequest,
    ) -> ms_models.ListSgFaultinjectrulesResponse:
        """
        Description: 分页查询故障注入二级列表
        Summary: 分页查询故障注入二级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_faultinjectrules_ex_async(request, headers, runtime)

    def list_sg_faultinjectrules_ex(
        self,
        request: ms_models.ListSgFaultinjectrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectrulesResponse:
        """
        Description: 分页查询故障注入二级列表
        Summary: 分页查询故障注入二级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_faultinjectrules_ex_async(
        self,
        request: ms_models.ListSgFaultinjectrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectrulesResponse:
        """
        Description: 分页查询故障注入二级列表
        Summary: 分页查询故障注入二级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_faultinjectallapps(
        self,
        request: ms_models.ListSgFaultinjectallappsRequest,
    ) -> ms_models.ListSgFaultinjectallappsResponse:
        """
        Description: 查询已添加故障注入规则的应用
        Summary: 查询已添加故障注入规则的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_faultinjectallapps_ex(request, headers, runtime)

    async def list_sg_faultinjectallapps_async(
        self,
        request: ms_models.ListSgFaultinjectallappsRequest,
    ) -> ms_models.ListSgFaultinjectallappsResponse:
        """
        Description: 查询已添加故障注入规则的应用
        Summary: 查询已添加故障注入规则的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_faultinjectallapps_ex_async(request, headers, runtime)

    def list_sg_faultinjectallapps_ex(
        self,
        request: ms_models.ListSgFaultinjectallappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectallappsResponse:
        """
        Description: 查询已添加故障注入规则的应用
        Summary: 查询已添加故障注入规则的应用
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectallappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectallapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_faultinjectallapps_ex_async(
        self,
        request: ms_models.ListSgFaultinjectallappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectallappsResponse:
        """
        Description: 查询已添加故障注入规则的应用
        Summary: 查询已添加故障注入规则的应用
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectallappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectallapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_faultinjectallservices(
        self,
        request: ms_models.ListSgFaultinjectallservicesRequest,
    ) -> ms_models.ListSgFaultinjectallservicesResponse:
        """
        Description: 查询已添加故障注入规则的服务
        Summary: 查询已添加故障注入规则的服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_faultinjectallservices_ex(request, headers, runtime)

    async def list_sg_faultinjectallservices_async(
        self,
        request: ms_models.ListSgFaultinjectallservicesRequest,
    ) -> ms_models.ListSgFaultinjectallservicesResponse:
        """
        Description: 查询已添加故障注入规则的服务
        Summary: 查询已添加故障注入规则的服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_faultinjectallservices_ex_async(request, headers, runtime)

    def list_sg_faultinjectallservices_ex(
        self,
        request: ms_models.ListSgFaultinjectallservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectallservicesResponse:
        """
        Description: 查询已添加故障注入规则的服务
        Summary: 查询已添加故障注入规则的服务
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectallservicesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectallservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_faultinjectallservices_ex_async(
        self,
        request: ms_models.ListSgFaultinjectallservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaultinjectallservicesResponse:
        """
        Description: 查询已添加故障注入规则的服务
        Summary: 查询已添加故障注入规则的服务
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaultinjectallservicesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectallservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_faultinjectrule(
        self,
        request: ms_models.UpdateSgFaultinjectruleRequest,
    ) -> ms_models.UpdateSgFaultinjectruleResponse:
        """
        Description: 更新故障注入规则
        Summary: 更新故障注入规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_faultinjectrule_ex(request, headers, runtime)

    async def update_sg_faultinjectrule_async(
        self,
        request: ms_models.UpdateSgFaultinjectruleRequest,
    ) -> ms_models.UpdateSgFaultinjectruleResponse:
        """
        Description: 更新故障注入规则
        Summary: 更新故障注入规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_faultinjectrule_ex_async(request, headers, runtime)

    def update_sg_faultinjectrule_ex(
        self,
        request: ms_models.UpdateSgFaultinjectruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgFaultinjectruleResponse:
        """
        Description: 更新故障注入规则
        Summary: 更新故障注入规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgFaultinjectruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_faultinjectrule_ex_async(
        self,
        request: ms_models.UpdateSgFaultinjectruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgFaultinjectruleResponse:
        """
        Description: 更新故障注入规则
        Summary: 更新故障注入规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgFaultinjectruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_faultinjectrule(
        self,
        request: ms_models.AddSgFaultinjectruleRequest,
    ) -> ms_models.AddSgFaultinjectruleResponse:
        """
        Description: 新增故障注入规则
        Summary: 新增故障注入规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_faultinjectrule_ex(request, headers, runtime)

    async def add_sg_faultinjectrule_async(
        self,
        request: ms_models.AddSgFaultinjectruleRequest,
    ) -> ms_models.AddSgFaultinjectruleResponse:
        """
        Description: 新增故障注入规则
        Summary: 新增故障注入规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_faultinjectrule_ex_async(request, headers, runtime)

    def add_sg_faultinjectrule_ex(
        self,
        request: ms_models.AddSgFaultinjectruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgFaultinjectruleResponse:
        """
        Description: 新增故障注入规则
        Summary: 新增故障注入规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgFaultinjectruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_faultinjectrule_ex_async(
        self,
        request: ms_models.AddSgFaultinjectruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgFaultinjectruleResponse:
        """
        Description: 新增故障注入规则
        Summary: 新增故障注入规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgFaultinjectruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_faultinjectrulestatus(
        self,
        request: ms_models.UpdateSgFaultinjectrulestatusRequest,
    ) -> ms_models.UpdateSgFaultinjectrulestatusResponse:
        """
        Description: 更新故障注入规则状态
        Summary: 更新故障注入规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_faultinjectrulestatus_ex(request, headers, runtime)

    async def update_sg_faultinjectrulestatus_async(
        self,
        request: ms_models.UpdateSgFaultinjectrulestatusRequest,
    ) -> ms_models.UpdateSgFaultinjectrulestatusResponse:
        """
        Description: 更新故障注入规则状态
        Summary: 更新故障注入规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_faultinjectrulestatus_ex_async(request, headers, runtime)

    def update_sg_faultinjectrulestatus_ex(
        self,
        request: ms_models.UpdateSgFaultinjectrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgFaultinjectrulestatusResponse:
        """
        Description: 更新故障注入规则状态
        Summary: 更新故障注入规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgFaultinjectrulestatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_faultinjectrulestatus_ex_async(
        self,
        request: ms_models.UpdateSgFaultinjectrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgFaultinjectrulestatusResponse:
        """
        Description: 更新故障注入规则状态
        Summary: 更新故障注入规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgFaultinjectrulestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_faultinjectrule(
        self,
        request: ms_models.DeleteSgFaultinjectruleRequest,
    ) -> ms_models.DeleteSgFaultinjectruleResponse:
        """
        Description: 删除故障注入规则
        Summary: 删除故障注入规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_faultinjectrule_ex(request, headers, runtime)

    async def delete_sg_faultinjectrule_async(
        self,
        request: ms_models.DeleteSgFaultinjectruleRequest,
    ) -> ms_models.DeleteSgFaultinjectruleResponse:
        """
        Description: 删除故障注入规则
        Summary: 删除故障注入规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_faultinjectrule_ex_async(request, headers, runtime)

    def delete_sg_faultinjectrule_ex(
        self,
        request: ms_models.DeleteSgFaultinjectruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgFaultinjectruleResponse:
        """
        Description: 删除故障注入规则
        Summary: 删除故障注入规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgFaultinjectruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faultinjectrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_faultinjectrule_ex_async(
        self,
        request: ms_models.DeleteSgFaultinjectruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgFaultinjectruleResponse:
        """
        Description: 删除故障注入规则
        Summary: 删除故障注入规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgFaultinjectruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faultinjectrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_apps(
        self,
        request: ms_models.ListSgAppsRequest,
    ) -> ms_models.ListSgAppsResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_apps_ex(request, headers, runtime)

    async def list_sg_apps_async(
        self,
        request: ms_models.ListSgAppsRequest,
    ) -> ms_models.ListSgAppsResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_apps_ex_async(request, headers, runtime)

    def list_sg_apps_ex(
        self,
        request: ms_models.ListSgAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAppsResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAppsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_apps_ex_async(
        self,
        request: ms_models.ListSgAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAppsResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAppsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_routerrulegroupapps(
        self,
        request: ms_models.ListSgRouterrulegroupappsRequest,
    ) -> ms_models.ListSgRouterrulegroupappsResponse:
        """
        Description: 查询服务路由一级列表
        Summary: 查询服务路由一级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_routerrulegroupapps_ex(request, headers, runtime)

    async def list_sg_routerrulegroupapps_async(
        self,
        request: ms_models.ListSgRouterrulegroupappsRequest,
    ) -> ms_models.ListSgRouterrulegroupappsResponse:
        """
        Description: 查询服务路由一级列表
        Summary: 查询服务路由一级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_routerrulegroupapps_ex_async(request, headers, runtime)

    def list_sg_routerrulegroupapps_ex(
        self,
        request: ms_models.ListSgRouterrulegroupappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterrulegroupappsResponse:
        """
        Description: 查询服务路由一级列表
        Summary: 查询服务路由一级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterrulegroupappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulegroupapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_routerrulegroupapps_ex_async(
        self,
        request: ms_models.ListSgRouterrulegroupappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterrulegroupappsResponse:
        """
        Description: 查询服务路由一级列表
        Summary: 查询服务路由一级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterrulegroupappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulegroupapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_routerrulegroups(
        self,
        request: ms_models.ListSgRouterrulegroupsRequest,
    ) -> ms_models.ListSgRouterrulegroupsResponse:
        """
        Description: 查询服务路由二级例表
        Summary: 查询服务路由二级例表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_routerrulegroups_ex(request, headers, runtime)

    async def list_sg_routerrulegroups_async(
        self,
        request: ms_models.ListSgRouterrulegroupsRequest,
    ) -> ms_models.ListSgRouterrulegroupsResponse:
        """
        Description: 查询服务路由二级例表
        Summary: 查询服务路由二级例表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_routerrulegroups_ex_async(request, headers, runtime)

    def list_sg_routerrulegroups_ex(
        self,
        request: ms_models.ListSgRouterrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterrulegroupsResponse:
        """
        Description: 查询服务路由二级例表
        Summary: 查询服务路由二级例表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterrulegroupsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulegroups.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_routerrulegroups_ex_async(
        self,
        request: ms_models.ListSgRouterrulegroupsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterrulegroupsResponse:
        """
        Description: 查询服务路由二级例表
        Summary: 查询服务路由二级例表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterrulegroupsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulegroups.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_routerruleallapps(
        self,
        request: ms_models.ListSgRouterruleallappsRequest,
    ) -> ms_models.ListSgRouterruleallappsResponse:
        """
        Description: 查询已存在服务路由规则的应用接口
        Summary: 查询已存在服务路由规则的应用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_routerruleallapps_ex(request, headers, runtime)

    async def list_sg_routerruleallapps_async(
        self,
        request: ms_models.ListSgRouterruleallappsRequest,
    ) -> ms_models.ListSgRouterruleallappsResponse:
        """
        Description: 查询已存在服务路由规则的应用接口
        Summary: 查询已存在服务路由规则的应用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_routerruleallapps_ex_async(request, headers, runtime)

    def list_sg_routerruleallapps_ex(
        self,
        request: ms_models.ListSgRouterruleallappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleallappsResponse:
        """
        Description: 查询已存在服务路由规则的应用接口
        Summary: 查询已存在服务路由规则的应用接口
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleallappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerruleallapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_routerruleallapps_ex_async(
        self,
        request: ms_models.ListSgRouterruleallappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleallappsResponse:
        """
        Description: 查询已存在服务路由规则的应用接口
        Summary: 查询已存在服务路由规则的应用接口
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleallappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerruleallapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_routerruleallservices(
        self,
        request: ms_models.ListSgRouterruleallservicesRequest,
    ) -> ms_models.ListSgRouterruleallservicesResponse:
        """
        Description: 查询已存在服务路由规则的服务接口
        Summary: 查询已存在服务路由规则的服务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_routerruleallservices_ex(request, headers, runtime)

    async def list_sg_routerruleallservices_async(
        self,
        request: ms_models.ListSgRouterruleallservicesRequest,
    ) -> ms_models.ListSgRouterruleallservicesResponse:
        """
        Description: 查询已存在服务路由规则的服务接口
        Summary: 查询已存在服务路由规则的服务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_routerruleallservices_ex_async(request, headers, runtime)

    def list_sg_routerruleallservices_ex(
        self,
        request: ms_models.ListSgRouterruleallservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleallservicesResponse:
        """
        Description: 查询已存在服务路由规则的服务接口
        Summary: 查询已存在服务路由规则的服务接口
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleallservicesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerruleallservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_routerruleallservices_ex_async(
        self,
        request: ms_models.ListSgRouterruleallservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgRouterruleallservicesResponse:
        """
        Description: 查询已存在服务路由规则的服务接口
        Summary: 查询已存在服务路由规则的服务接口
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgRouterruleallservicesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerruleallservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_routerrulegroupstatus(
        self,
        request: ms_models.UpdateSgRouterrulegroupstatusRequest,
    ) -> ms_models.UpdateSgRouterrulegroupstatusResponse:
        """
        Description: 更新路由规则组状态
        Summary: 更新路由规则组状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_routerrulegroupstatus_ex(request, headers, runtime)

    async def update_sg_routerrulegroupstatus_async(
        self,
        request: ms_models.UpdateSgRouterrulegroupstatusRequest,
    ) -> ms_models.UpdateSgRouterrulegroupstatusResponse:
        """
        Description: 更新路由规则组状态
        Summary: 更新路由规则组状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_routerrulegroupstatus_ex_async(request, headers, runtime)

    def update_sg_routerrulegroupstatus_ex(
        self,
        request: ms_models.UpdateSgRouterrulegroupstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgRouterrulegroupstatusResponse:
        """
        Description: 更新路由规则组状态
        Summary: 更新路由规则组状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgRouterrulegroupstatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulegroupstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_routerrulegroupstatus_ex_async(
        self,
        request: ms_models.UpdateSgRouterrulegroupstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgRouterrulegroupstatusResponse:
        """
        Description: 更新路由规则组状态
        Summary: 更新路由规则组状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgRouterrulegroupstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulegroupstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_routerrulegroup(
        self,
        request: ms_models.DeleteSgRouterrulegroupRequest,
    ) -> ms_models.DeleteSgRouterrulegroupResponse:
        """
        Description: 删除路由规则组
        Summary: 删除路由规则组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_routerrulegroup_ex(request, headers, runtime)

    async def delete_sg_routerrulegroup_async(
        self,
        request: ms_models.DeleteSgRouterrulegroupRequest,
    ) -> ms_models.DeleteSgRouterrulegroupResponse:
        """
        Description: 删除路由规则组
        Summary: 删除路由规则组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_routerrulegroup_ex_async(request, headers, runtime)

    def delete_sg_routerrulegroup_ex(
        self,
        request: ms_models.DeleteSgRouterrulegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgRouterrulegroupResponse:
        """
        Description: 删除路由规则组
        Summary: 删除路由规则组
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgRouterrulegroupResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.routerrulegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_routerrulegroup_ex_async(
        self,
        request: ms_models.DeleteSgRouterrulegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgRouterrulegroupResponse:
        """
        Description: 删除路由规则组
        Summary: 删除路由规则组
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgRouterrulegroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.routerrulegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_faulttoleranceapps(
        self,
        request: ms_models.ListSgFaulttoleranceappsRequest,
    ) -> ms_models.ListSgFaulttoleranceappsResponse:
        """
        Description: 故障隔离App列表及其规则数量
        Summary: 故障隔离App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_faulttoleranceapps_ex(request, headers, runtime)

    async def list_sg_faulttoleranceapps_async(
        self,
        request: ms_models.ListSgFaulttoleranceappsRequest,
    ) -> ms_models.ListSgFaulttoleranceappsResponse:
        """
        Description: 故障隔离App列表及其规则数量
        Summary: 故障隔离App列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_faulttoleranceapps_ex_async(request, headers, runtime)

    def list_sg_faulttoleranceapps_ex(
        self,
        request: ms_models.ListSgFaulttoleranceappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaulttoleranceappsResponse:
        """
        Description: 故障隔离App列表及其规则数量
        Summary: 故障隔离App列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaulttoleranceappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faulttoleranceapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_faulttoleranceapps_ex_async(
        self,
        request: ms_models.ListSgFaulttoleranceappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaulttoleranceappsResponse:
        """
        Description: 故障隔离App列表及其规则数量
        Summary: 故障隔离App列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaulttoleranceappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faulttoleranceapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_faulttolerancerules(
        self,
        request: ms_models.ListSgFaulttolerancerulesRequest,
    ) -> ms_models.ListSgFaulttolerancerulesResponse:
        """
        Description: 故障隔离规则列表
        Summary: 故障隔离规则列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_faulttolerancerules_ex(request, headers, runtime)

    async def list_sg_faulttolerancerules_async(
        self,
        request: ms_models.ListSgFaulttolerancerulesRequest,
    ) -> ms_models.ListSgFaulttolerancerulesResponse:
        """
        Description: 故障隔离规则列表
        Summary: 故障隔离规则列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_faulttolerancerules_ex_async(request, headers, runtime)

    def list_sg_faulttolerancerules_ex(
        self,
        request: ms_models.ListSgFaulttolerancerulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaulttolerancerulesResponse:
        """
        Description: 故障隔离规则列表
        Summary: 故障隔离规则列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaulttolerancerulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faulttolerancerules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_faulttolerancerules_ex_async(
        self,
        request: ms_models.ListSgFaulttolerancerulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgFaulttolerancerulesResponse:
        """
        Description: 故障隔离规则列表
        Summary: 故障隔离规则列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgFaulttolerancerulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faulttolerancerules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_faulttolerancerule(
        self,
        request: ms_models.AddSgFaulttoleranceruleRequest,
    ) -> ms_models.AddSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则新增
        Summary: 故障隔离规则新增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_faulttolerancerule_ex(request, headers, runtime)

    async def add_sg_faulttolerancerule_async(
        self,
        request: ms_models.AddSgFaulttoleranceruleRequest,
    ) -> ms_models.AddSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则新增
        Summary: 故障隔离规则新增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_faulttolerancerule_ex_async(request, headers, runtime)

    def add_sg_faulttolerancerule_ex(
        self,
        request: ms_models.AddSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则新增
        Summary: 故障隔离规则新增
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgFaulttoleranceruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faulttolerancerule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_faulttolerancerule_ex_async(
        self,
        request: ms_models.AddSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则新增
        Summary: 故障隔离规则新增
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgFaulttoleranceruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faulttolerancerule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_faulttolerancerule(
        self,
        request: ms_models.UpdateSgFaulttoleranceruleRequest,
    ) -> ms_models.UpdateSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则更新
        Summary: 故障隔离规则更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_faulttolerancerule_ex(request, headers, runtime)

    async def update_sg_faulttolerancerule_async(
        self,
        request: ms_models.UpdateSgFaulttoleranceruleRequest,
    ) -> ms_models.UpdateSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则更新
        Summary: 故障隔离规则更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_faulttolerancerule_ex_async(request, headers, runtime)

    def update_sg_faulttolerancerule_ex(
        self,
        request: ms_models.UpdateSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则更新
        Summary: 故障隔离规则更新
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgFaulttoleranceruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faulttolerancerule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_faulttolerancerule_ex_async(
        self,
        request: ms_models.UpdateSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则更新
        Summary: 故障隔离规则更新
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgFaulttoleranceruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faulttolerancerule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_faulttolerancerule(
        self,
        request: ms_models.DeleteSgFaulttoleranceruleRequest,
    ) -> ms_models.DeleteSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则删除
        Summary: 故障隔离规则删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_faulttolerancerule_ex(request, headers, runtime)

    async def delete_sg_faulttolerancerule_async(
        self,
        request: ms_models.DeleteSgFaulttoleranceruleRequest,
    ) -> ms_models.DeleteSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则删除
        Summary: 故障隔离规则删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_faulttolerancerule_ex_async(request, headers, runtime)

    def delete_sg_faulttolerancerule_ex(
        self,
        request: ms_models.DeleteSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则删除
        Summary: 故障隔离规则删除
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgFaulttoleranceruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faulttolerancerule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_faulttolerancerule_ex_async(
        self,
        request: ms_models.DeleteSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则删除
        Summary: 故障隔离规则删除
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgFaulttoleranceruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faulttolerancerule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sg_faulttolerancerule(
        self,
        request: ms_models.EnableSgFaulttoleranceruleRequest,
    ) -> ms_models.EnableSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则启用
        Summary: 故障隔离规则启用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sg_faulttolerancerule_ex(request, headers, runtime)

    async def enable_sg_faulttolerancerule_async(
        self,
        request: ms_models.EnableSgFaulttoleranceruleRequest,
    ) -> ms_models.EnableSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则启用
        Summary: 故障隔离规则启用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sg_faulttolerancerule_ex_async(request, headers, runtime)

    def enable_sg_faulttolerancerule_ex(
        self,
        request: ms_models.EnableSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则启用
        Summary: 故障隔离规则启用
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgFaulttoleranceruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.faulttolerancerule.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sg_faulttolerancerule_ex_async(
        self,
        request: ms_models.EnableSgFaulttoleranceruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSgFaulttoleranceruleResponse:
        """
        Description: 故障隔离规则启用
        Summary: 故障隔离规则启用
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSgFaulttoleranceruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.faulttolerancerule.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_auditlogs(
        self,
        request: ms_models.ListSgAuditlogsRequest,
    ) -> ms_models.ListSgAuditlogsResponse:
        """
        Description: 分页查询审计日志
        Summary: 分页查询审计日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_auditlogs_ex(request, headers, runtime)

    async def list_sg_auditlogs_async(
        self,
        request: ms_models.ListSgAuditlogsRequest,
    ) -> ms_models.ListSgAuditlogsResponse:
        """
        Description: 分页查询审计日志
        Summary: 分页查询审计日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_auditlogs_ex_async(request, headers, runtime)

    def list_sg_auditlogs_ex(
        self,
        request: ms_models.ListSgAuditlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuditlogsResponse:
        """
        Description: 分页查询审计日志
        Summary: 分页查询审计日志
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuditlogsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.auditlogs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_auditlogs_ex_async(
        self,
        request: ms_models.ListSgAuditlogsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgAuditlogsResponse:
        """
        Description: 分页查询审计日志
        Summary: 分页查询审计日志
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgAuditlogsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.auditlogs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_meshcluster(
        self,
        request: ms_models.ListSgMeshclusterRequest,
    ) -> ms_models.ListSgMeshclusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_meshcluster_ex(request, headers, runtime)

    async def list_sg_meshcluster_async(
        self,
        request: ms_models.ListSgMeshclusterRequest,
    ) -> ms_models.ListSgMeshclusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_meshcluster_ex_async(request, headers, runtime)

    def list_sg_meshcluster_ex(
        self,
        request: ms_models.ListSgMeshclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgMeshclusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgMeshclusterResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.meshcluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_meshcluster_ex_async(
        self,
        request: ms_models.ListSgMeshclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgMeshclusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgMeshclusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.meshcluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_meshcluster(
        self,
        request: ms_models.AddSgMeshclusterRequest,
    ) -> ms_models.AddSgMeshclusterResponse:
        """
        Description: 新增集群
        Summary: 新增集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_meshcluster_ex(request, headers, runtime)

    async def add_sg_meshcluster_async(
        self,
        request: ms_models.AddSgMeshclusterRequest,
    ) -> ms_models.AddSgMeshclusterResponse:
        """
        Description: 新增集群
        Summary: 新增集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_meshcluster_ex_async(request, headers, runtime)

    def add_sg_meshcluster_ex(
        self,
        request: ms_models.AddSgMeshclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgMeshclusterResponse:
        """
        Description: 新增集群
        Summary: 新增集群
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgMeshclusterResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.meshcluster.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_meshcluster_ex_async(
        self,
        request: ms_models.AddSgMeshclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgMeshclusterResponse:
        """
        Description: 新增集群
        Summary: 新增集群
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgMeshclusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.meshcluster.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_meshclusterstatus(
        self,
        request: ms_models.UpdateSgMeshclusterstatusRequest,
    ) -> ms_models.UpdateSgMeshclusterstatusResponse:
        """
        Description: 更新集群状态
        Summary: 更新集群状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_meshclusterstatus_ex(request, headers, runtime)

    async def update_sg_meshclusterstatus_async(
        self,
        request: ms_models.UpdateSgMeshclusterstatusRequest,
    ) -> ms_models.UpdateSgMeshclusterstatusResponse:
        """
        Description: 更新集群状态
        Summary: 更新集群状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_meshclusterstatus_ex_async(request, headers, runtime)

    def update_sg_meshclusterstatus_ex(
        self,
        request: ms_models.UpdateSgMeshclusterstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgMeshclusterstatusResponse:
        """
        Description: 更新集群状态
        Summary: 更新集群状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgMeshclusterstatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.meshclusterstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_meshclusterstatus_ex_async(
        self,
        request: ms_models.UpdateSgMeshclusterstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgMeshclusterstatusResponse:
        """
        Description: 更新集群状态
        Summary: 更新集群状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgMeshclusterstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.meshclusterstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_meshcluster(
        self,
        request: ms_models.DeleteSgMeshclusterRequest,
    ) -> ms_models.DeleteSgMeshclusterResponse:
        """
        Description: 删除集群
        Summary: 删除集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_meshcluster_ex(request, headers, runtime)

    async def delete_sg_meshcluster_async(
        self,
        request: ms_models.DeleteSgMeshclusterRequest,
    ) -> ms_models.DeleteSgMeshclusterResponse:
        """
        Description: 删除集群
        Summary: 删除集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_meshcluster_ex_async(request, headers, runtime)

    def delete_sg_meshcluster_ex(
        self,
        request: ms_models.DeleteSgMeshclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgMeshclusterResponse:
        """
        Description: 删除集群
        Summary: 删除集群
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgMeshclusterResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.meshcluster.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_meshcluster_ex_async(
        self,
        request: ms_models.DeleteSgMeshclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgMeshclusterResponse:
        """
        Description: 删除集群
        Summary: 删除集群
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgMeshclusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.meshcluster.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_sidecarinject(
        self,
        request: ms_models.ListSgSidecarinjectRequest,
    ) -> ms_models.ListSgSidecarinjectResponse:
        """
        Description: 查询sideCar注入配置列表
        Summary: 查询sideCar注入配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_sidecarinject_ex(request, headers, runtime)

    async def list_sg_sidecarinject_async(
        self,
        request: ms_models.ListSgSidecarinjectRequest,
    ) -> ms_models.ListSgSidecarinjectResponse:
        """
        Description: 查询sideCar注入配置列表
        Summary: 查询sideCar注入配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_sidecarinject_ex_async(request, headers, runtime)

    def list_sg_sidecarinject_ex(
        self,
        request: ms_models.ListSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgSidecarinjectResponse:
        """
        Description: 查询sideCar注入配置列表
        Summary: 查询sideCar注入配置列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgSidecarinjectResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.sidecarinject.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_sidecarinject_ex_async(
        self,
        request: ms_models.ListSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgSidecarinjectResponse:
        """
        Description: 查询sideCar注入配置列表
        Summary: 查询sideCar注入配置列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgSidecarinjectResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.sidecarinject.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_sidecarinject(
        self,
        request: ms_models.AddSgSidecarinjectRequest,
    ) -> ms_models.AddSgSidecarinjectResponse:
        """
        Description: 新增sideCar注入配置
        Summary: 新增sideCar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_sidecarinject_ex(request, headers, runtime)

    async def add_sg_sidecarinject_async(
        self,
        request: ms_models.AddSgSidecarinjectRequest,
    ) -> ms_models.AddSgSidecarinjectResponse:
        """
        Description: 新增sideCar注入配置
        Summary: 新增sideCar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_sidecarinject_ex_async(request, headers, runtime)

    def add_sg_sidecarinject_ex(
        self,
        request: ms_models.AddSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgSidecarinjectResponse:
        """
        Description: 新增sideCar注入配置
        Summary: 新增sideCar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgSidecarinjectResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.sidecarinject.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_sidecarinject_ex_async(
        self,
        request: ms_models.AddSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgSidecarinjectResponse:
        """
        Description: 新增sideCar注入配置
        Summary: 新增sideCar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgSidecarinjectResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.sidecarinject.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_sidecarinject(
        self,
        request: ms_models.UpdateSgSidecarinjectRequest,
    ) -> ms_models.UpdateSgSidecarinjectResponse:
        """
        Description: 更新sidecar注入配置
        Summary: 更新sidecar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_sidecarinject_ex(request, headers, runtime)

    async def update_sg_sidecarinject_async(
        self,
        request: ms_models.UpdateSgSidecarinjectRequest,
    ) -> ms_models.UpdateSgSidecarinjectResponse:
        """
        Description: 更新sidecar注入配置
        Summary: 更新sidecar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_sidecarinject_ex_async(request, headers, runtime)

    def update_sg_sidecarinject_ex(
        self,
        request: ms_models.UpdateSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgSidecarinjectResponse:
        """
        Description: 更新sidecar注入配置
        Summary: 更新sidecar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgSidecarinjectResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.sidecarinject.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_sidecarinject_ex_async(
        self,
        request: ms_models.UpdateSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgSidecarinjectResponse:
        """
        Description: 更新sidecar注入配置
        Summary: 更新sidecar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgSidecarinjectResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.sidecarinject.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_sidecarinject(
        self,
        request: ms_models.DeleteSgSidecarinjectRequest,
    ) -> ms_models.DeleteSgSidecarinjectResponse:
        """
        Description: 删除sideCar注入配置
        Summary: 删除sideCar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_sidecarinject_ex(request, headers, runtime)

    async def delete_sg_sidecarinject_async(
        self,
        request: ms_models.DeleteSgSidecarinjectRequest,
    ) -> ms_models.DeleteSgSidecarinjectResponse:
        """
        Description: 删除sideCar注入配置
        Summary: 删除sideCar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_sidecarinject_ex_async(request, headers, runtime)

    def delete_sg_sidecarinject_ex(
        self,
        request: ms_models.DeleteSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgSidecarinjectResponse:
        """
        Description: 删除sideCar注入配置
        Summary: 删除sideCar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgSidecarinjectResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.sidecarinject.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_sidecarinject_ex_async(
        self,
        request: ms_models.DeleteSgSidecarinjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgSidecarinjectResponse:
        """
        Description: 删除sideCar注入配置
        Summary: 删除sideCar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgSidecarinjectResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.sidecarinject.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_sidecarinjectstatus(
        self,
        request: ms_models.UpdateSgSidecarinjectstatusRequest,
    ) -> ms_models.UpdateSgSidecarinjectstatusResponse:
        """
        Description: 开通/关闭sideCar注入配置
        Summary: 开通/关闭sideCar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_sidecarinjectstatus_ex(request, headers, runtime)

    async def update_sg_sidecarinjectstatus_async(
        self,
        request: ms_models.UpdateSgSidecarinjectstatusRequest,
    ) -> ms_models.UpdateSgSidecarinjectstatusResponse:
        """
        Description: 开通/关闭sideCar注入配置
        Summary: 开通/关闭sideCar注入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_sidecarinjectstatus_ex_async(request, headers, runtime)

    def update_sg_sidecarinjectstatus_ex(
        self,
        request: ms_models.UpdateSgSidecarinjectstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgSidecarinjectstatusResponse:
        """
        Description: 开通/关闭sideCar注入配置
        Summary: 开通/关闭sideCar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgSidecarinjectstatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.sidecarinjectstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_sidecarinjectstatus_ex_async(
        self,
        request: ms_models.UpdateSgSidecarinjectstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgSidecarinjectstatusResponse:
        """
        Description: 开通/关闭sideCar注入配置
        Summary: 开通/关闭sideCar注入配置
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgSidecarinjectstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.sidecarinjectstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_trafficmirrorapps(
        self,
        request: ms_models.ListSgTrafficmirrorappsRequest,
    ) -> ms_models.ListSgTrafficmirrorappsResponse:
        """
        Description: 流量镜像分页查询一级列表
        Summary: 流量镜像分页查询一级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_trafficmirrorapps_ex(request, headers, runtime)

    async def list_sg_trafficmirrorapps_async(
        self,
        request: ms_models.ListSgTrafficmirrorappsRequest,
    ) -> ms_models.ListSgTrafficmirrorappsResponse:
        """
        Description: 流量镜像分页查询一级列表
        Summary: 流量镜像分页查询一级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_trafficmirrorapps_ex_async(request, headers, runtime)

    def list_sg_trafficmirrorapps_ex(
        self,
        request: ms_models.ListSgTrafficmirrorappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorappsResponse:
        """
        Description: 流量镜像分页查询一级列表
        Summary: 流量镜像分页查询一级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_trafficmirrorapps_ex_async(
        self,
        request: ms_models.ListSgTrafficmirrorappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorappsResponse:
        """
        Description: 流量镜像分页查询一级列表
        Summary: 流量镜像分页查询一级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_trafficmirrorrules(
        self,
        request: ms_models.ListSgTrafficmirrorrulesRequest,
    ) -> ms_models.ListSgTrafficmirrorrulesResponse:
        """
        Description: 流量镜像分页查询二级列表
        Summary: 流量镜像分页查询二级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_trafficmirrorrules_ex(request, headers, runtime)

    async def list_sg_trafficmirrorrules_async(
        self,
        request: ms_models.ListSgTrafficmirrorrulesRequest,
    ) -> ms_models.ListSgTrafficmirrorrulesResponse:
        """
        Description: 流量镜像分页查询二级列表
        Summary: 流量镜像分页查询二级列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_trafficmirrorrules_ex_async(request, headers, runtime)

    def list_sg_trafficmirrorrules_ex(
        self,
        request: ms_models.ListSgTrafficmirrorrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorrulesResponse:
        """
        Description: 流量镜像分页查询二级列表
        Summary: 流量镜像分页查询二级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_trafficmirrorrules_ex_async(
        self,
        request: ms_models.ListSgTrafficmirrorrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorrulesResponse:
        """
        Description: 流量镜像分页查询二级列表
        Summary: 流量镜像分页查询二级列表
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_trafficmirrorallapps(
        self,
        request: ms_models.ListSgTrafficmirrorallappsRequest,
    ) -> ms_models.ListSgTrafficmirrorallappsResponse:
        """
        Description: 查询已添加规则的应用
        Summary: 查询已添加规则的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_trafficmirrorallapps_ex(request, headers, runtime)

    async def list_sg_trafficmirrorallapps_async(
        self,
        request: ms_models.ListSgTrafficmirrorallappsRequest,
    ) -> ms_models.ListSgTrafficmirrorallappsResponse:
        """
        Description: 查询已添加规则的应用
        Summary: 查询已添加规则的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_trafficmirrorallapps_ex_async(request, headers, runtime)

    def list_sg_trafficmirrorallapps_ex(
        self,
        request: ms_models.ListSgTrafficmirrorallappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorallappsResponse:
        """
        Description: 查询已添加规则的应用
        Summary: 查询已添加规则的应用
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorallappsResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorallapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_trafficmirrorallapps_ex_async(
        self,
        request: ms_models.ListSgTrafficmirrorallappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorallappsResponse:
        """
        Description: 查询已添加规则的应用
        Summary: 查询已添加规则的应用
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorallappsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorallapps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sg_trafficmirrorservices(
        self,
        request: ms_models.ListSgTrafficmirrorservicesRequest,
    ) -> ms_models.ListSgTrafficmirrorservicesResponse:
        """
        Description: 查询已添加规则的服务
        Summary: 查询已添加规则的服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sg_trafficmirrorservices_ex(request, headers, runtime)

    async def list_sg_trafficmirrorservices_async(
        self,
        request: ms_models.ListSgTrafficmirrorservicesRequest,
    ) -> ms_models.ListSgTrafficmirrorservicesResponse:
        """
        Description: 查询已添加规则的服务
        Summary: 查询已添加规则的服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sg_trafficmirrorservices_ex_async(request, headers, runtime)

    def list_sg_trafficmirrorservices_ex(
        self,
        request: ms_models.ListSgTrafficmirrorservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorservicesResponse:
        """
        Description: 查询已添加规则的服务
        Summary: 查询已添加规则的服务
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorservicesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sg_trafficmirrorservices_ex_async(
        self,
        request: ms_models.ListSgTrafficmirrorservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSgTrafficmirrorservicesResponse:
        """
        Description: 查询已添加规则的服务
        Summary: 查询已添加规则的服务
        """
        UtilClient.validate_model(request)
        return ms_models.ListSgTrafficmirrorservicesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorservices.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sg_trafficmirrorrule(
        self,
        request: ms_models.AddSgTrafficmirrorruleRequest,
    ) -> ms_models.AddSgTrafficmirrorruleResponse:
        """
        Description: 新增流量镜像规则
        Summary: 新增流量镜像规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sg_trafficmirrorrule_ex(request, headers, runtime)

    async def add_sg_trafficmirrorrule_async(
        self,
        request: ms_models.AddSgTrafficmirrorruleRequest,
    ) -> ms_models.AddSgTrafficmirrorruleResponse:
        """
        Description: 新增流量镜像规则
        Summary: 新增流量镜像规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sg_trafficmirrorrule_ex_async(request, headers, runtime)

    def add_sg_trafficmirrorrule_ex(
        self,
        request: ms_models.AddSgTrafficmirrorruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgTrafficmirrorruleResponse:
        """
        Description: 新增流量镜像规则
        Summary: 新增流量镜像规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgTrafficmirrorruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sg_trafficmirrorrule_ex_async(
        self,
        request: ms_models.AddSgTrafficmirrorruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSgTrafficmirrorruleResponse:
        """
        Description: 新增流量镜像规则
        Summary: 新增流量镜像规则
        """
        UtilClient.validate_model(request)
        return ms_models.AddSgTrafficmirrorruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_trafficmirrorrulestatus(
        self,
        request: ms_models.UpdateSgTrafficmirrorrulestatusRequest,
    ) -> ms_models.UpdateSgTrafficmirrorrulestatusResponse:
        """
        Description: 更新流量镜像规则状态
        Summary: 更新流量镜像规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_trafficmirrorrulestatus_ex(request, headers, runtime)

    async def update_sg_trafficmirrorrulestatus_async(
        self,
        request: ms_models.UpdateSgTrafficmirrorrulestatusRequest,
    ) -> ms_models.UpdateSgTrafficmirrorrulestatusResponse:
        """
        Description: 更新流量镜像规则状态
        Summary: 更新流量镜像规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_trafficmirrorrulestatus_ex_async(request, headers, runtime)

    def update_sg_trafficmirrorrulestatus_ex(
        self,
        request: ms_models.UpdateSgTrafficmirrorrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgTrafficmirrorrulestatusResponse:
        """
        Description: 更新流量镜像规则状态
        Summary: 更新流量镜像规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgTrafficmirrorrulestatusResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_trafficmirrorrulestatus_ex_async(
        self,
        request: ms_models.UpdateSgTrafficmirrorrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgTrafficmirrorrulestatusResponse:
        """
        Description: 更新流量镜像规则状态
        Summary: 更新流量镜像规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgTrafficmirrorrulestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sg_trafficmirrorrule(
        self,
        request: ms_models.DeleteSgTrafficmirrorruleRequest,
    ) -> ms_models.DeleteSgTrafficmirrorruleResponse:
        """
        Description: 删除流量镜像规则
        Summary: 删除流量镜像规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sg_trafficmirrorrule_ex(request, headers, runtime)

    async def delete_sg_trafficmirrorrule_async(
        self,
        request: ms_models.DeleteSgTrafficmirrorruleRequest,
    ) -> ms_models.DeleteSgTrafficmirrorruleResponse:
        """
        Description: 删除流量镜像规则
        Summary: 删除流量镜像规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sg_trafficmirrorrule_ex_async(request, headers, runtime)

    def delete_sg_trafficmirrorrule_ex(
        self,
        request: ms_models.DeleteSgTrafficmirrorruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgTrafficmirrorruleResponse:
        """
        Description: 删除流量镜像规则
        Summary: 删除流量镜像规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgTrafficmirrorruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sg_trafficmirrorrule_ex_async(
        self,
        request: ms_models.DeleteSgTrafficmirrorruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSgTrafficmirrorruleResponse:
        """
        Description: 删除流量镜像规则
        Summary: 删除流量镜像规则
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSgTrafficmirrorruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sg_trafficmirrorrule(
        self,
        request: ms_models.UpdateSgTrafficmirrorruleRequest,
    ) -> ms_models.UpdateSgTrafficmirrorruleResponse:
        """
        Description: 更新流量镜像规则
        Summary: 更新流量镜像规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sg_trafficmirrorrule_ex(request, headers, runtime)

    async def update_sg_trafficmirrorrule_async(
        self,
        request: ms_models.UpdateSgTrafficmirrorruleRequest,
    ) -> ms_models.UpdateSgTrafficmirrorruleResponse:
        """
        Description: 更新流量镜像规则
        Summary: 更新流量镜像规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sg_trafficmirrorrule_ex_async(request, headers, runtime)

    def update_sg_trafficmirrorrule_ex(
        self,
        request: ms_models.UpdateSgTrafficmirrorruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgTrafficmirrorruleResponse:
        """
        Description: 更新流量镜像规则
        Summary: 更新流量镜像规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgTrafficmirrorruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.sg.trafficmirrorrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sg_trafficmirrorrule_ex_async(
        self,
        request: ms_models.UpdateSgTrafficmirrorruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSgTrafficmirrorruleResponse:
        """
        Description: 更新流量镜像规则
        Summary: 更新流量镜像规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSgTrafficmirrorruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.sg.trafficmirrorrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_safe_communicationrules(
        self,
        request: ms_models.ListSafeCommunicationrulesRequest,
    ) -> ms_models.ListSafeCommunicationrulesResponse:
        """
        Description: 查询通信安全规则列表接口
        Summary: 查询列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_safe_communicationrules_ex(request, headers, runtime)

    async def list_safe_communicationrules_async(
        self,
        request: ms_models.ListSafeCommunicationrulesRequest,
    ) -> ms_models.ListSafeCommunicationrulesResponse:
        """
        Description: 查询通信安全规则列表接口
        Summary: 查询列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_safe_communicationrules_ex_async(request, headers, runtime)

    def list_safe_communicationrules_ex(
        self,
        request: ms_models.ListSafeCommunicationrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSafeCommunicationrulesResponse:
        """
        Description: 查询通信安全规则列表接口
        Summary: 查询列表接口
        """
        UtilClient.validate_model(request)
        return ms_models.ListSafeCommunicationrulesResponse().from_map(
            self.do_request('2.0', 'sofa.ms.safe.communicationrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_safe_communicationrules_ex_async(
        self,
        request: ms_models.ListSafeCommunicationrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.ListSafeCommunicationrulesResponse:
        """
        Description: 查询通信安全规则列表接口
        Summary: 查询列表接口
        """
        UtilClient.validate_model(request)
        return ms_models.ListSafeCommunicationrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.safe.communicationrules.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_safe_communicationrule(
        self,
        request: ms_models.GetSafeCommunicationruleRequest,
    ) -> ms_models.GetSafeCommunicationruleResponse:
        """
        Description: 获取rule规则详情
        Summary: 获取规则详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_safe_communicationrule_ex(request, headers, runtime)

    async def get_safe_communicationrule_async(
        self,
        request: ms_models.GetSafeCommunicationruleRequest,
    ) -> ms_models.GetSafeCommunicationruleResponse:
        """
        Description: 获取rule规则详情
        Summary: 获取规则详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_safe_communicationrule_ex_async(request, headers, runtime)

    def get_safe_communicationrule_ex(
        self,
        request: ms_models.GetSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSafeCommunicationruleResponse:
        """
        Description: 获取rule规则详情
        Summary: 获取规则详情
        """
        UtilClient.validate_model(request)
        return ms_models.GetSafeCommunicationruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.safe.communicationrule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_safe_communicationrule_ex_async(
        self,
        request: ms_models.GetSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.GetSafeCommunicationruleResponse:
        """
        Description: 获取rule规则详情
        Summary: 获取规则详情
        """
        UtilClient.validate_model(request)
        return ms_models.GetSafeCommunicationruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.safe.communicationrule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_safe_communicationrule(
        self,
        request: ms_models.AddSafeCommunicationruleRequest,
    ) -> ms_models.AddSafeCommunicationruleResponse:
        """
        Description: 新增通信规则接口
        Summary: 新增通信规则接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_safe_communicationrule_ex(request, headers, runtime)

    async def add_safe_communicationrule_async(
        self,
        request: ms_models.AddSafeCommunicationruleRequest,
    ) -> ms_models.AddSafeCommunicationruleResponse:
        """
        Description: 新增通信规则接口
        Summary: 新增通信规则接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_safe_communicationrule_ex_async(request, headers, runtime)

    def add_safe_communicationrule_ex(
        self,
        request: ms_models.AddSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSafeCommunicationruleResponse:
        """
        Description: 新增通信规则接口
        Summary: 新增通信规则接口
        """
        UtilClient.validate_model(request)
        return ms_models.AddSafeCommunicationruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.safe.communicationrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_safe_communicationrule_ex_async(
        self,
        request: ms_models.AddSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.AddSafeCommunicationruleResponse:
        """
        Description: 新增通信规则接口
        Summary: 新增通信规则接口
        """
        UtilClient.validate_model(request)
        return ms_models.AddSafeCommunicationruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.safe.communicationrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_safe_communicationrule(
        self,
        request: ms_models.UpdateSafeCommunicationruleRequest,
    ) -> ms_models.UpdateSafeCommunicationruleResponse:
        """
        Description: 修改通信安全规则
        Summary: 修改通信安全规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_safe_communicationrule_ex(request, headers, runtime)

    async def update_safe_communicationrule_async(
        self,
        request: ms_models.UpdateSafeCommunicationruleRequest,
    ) -> ms_models.UpdateSafeCommunicationruleResponse:
        """
        Description: 修改通信安全规则
        Summary: 修改通信安全规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_safe_communicationrule_ex_async(request, headers, runtime)

    def update_safe_communicationrule_ex(
        self,
        request: ms_models.UpdateSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSafeCommunicationruleResponse:
        """
        Description: 修改通信安全规则
        Summary: 修改通信安全规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSafeCommunicationruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.safe.communicationrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_safe_communicationrule_ex_async(
        self,
        request: ms_models.UpdateSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.UpdateSafeCommunicationruleResponse:
        """
        Description: 修改通信安全规则
        Summary: 修改通信安全规则
        """
        UtilClient.validate_model(request)
        return ms_models.UpdateSafeCommunicationruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.safe.communicationrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_safe_communicationrule(
        self,
        request: ms_models.DeleteSafeCommunicationruleRequest,
    ) -> ms_models.DeleteSafeCommunicationruleResponse:
        """
        Description: 删除通信规则接口
        Summary: 删除通信规则接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_safe_communicationrule_ex(request, headers, runtime)

    async def delete_safe_communicationrule_async(
        self,
        request: ms_models.DeleteSafeCommunicationruleRequest,
    ) -> ms_models.DeleteSafeCommunicationruleResponse:
        """
        Description: 删除通信规则接口
        Summary: 删除通信规则接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_safe_communicationrule_ex_async(request, headers, runtime)

    def delete_safe_communicationrule_ex(
        self,
        request: ms_models.DeleteSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSafeCommunicationruleResponse:
        """
        Description: 删除通信规则接口
        Summary: 删除通信规则接口
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSafeCommunicationruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.safe.communicationrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_safe_communicationrule_ex_async(
        self,
        request: ms_models.DeleteSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.DeleteSafeCommunicationruleResponse:
        """
        Description: 删除通信规则接口
        Summary: 删除通信规则接口
        """
        UtilClient.validate_model(request)
        return ms_models.DeleteSafeCommunicationruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.safe.communicationrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_safe_communicationrule(
        self,
        request: ms_models.EnableSafeCommunicationruleRequest,
    ) -> ms_models.EnableSafeCommunicationruleResponse:
        """
        Description: 修改通信规则生效状态
        Summary: 修改通信规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_safe_communicationrule_ex(request, headers, runtime)

    async def enable_safe_communicationrule_async(
        self,
        request: ms_models.EnableSafeCommunicationruleRequest,
    ) -> ms_models.EnableSafeCommunicationruleResponse:
        """
        Description: 修改通信规则生效状态
        Summary: 修改通信规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_safe_communicationrule_ex_async(request, headers, runtime)

    def enable_safe_communicationrule_ex(
        self,
        request: ms_models.EnableSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSafeCommunicationruleResponse:
        """
        Description: 修改通信规则生效状态
        Summary: 修改通信规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSafeCommunicationruleResponse().from_map(
            self.do_request('2.0', 'sofa.ms.safe.communicationrule.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_safe_communicationrule_ex_async(
        self,
        request: ms_models.EnableSafeCommunicationruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ms_models.EnableSafeCommunicationruleResponse:
        """
        Description: 修改通信规则生效状态
        Summary: 修改通信规则状态
        """
        UtilClient.validate_model(request)
        return ms_models.EnableSafeCommunicationruleResponse().from_map(
            await self.do_request_async('2.0', 'sofa.ms.safe.communicationrule.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
