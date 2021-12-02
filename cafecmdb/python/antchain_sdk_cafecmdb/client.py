# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_cafecmdb import models as cafecmdb_models
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
        config: cafecmdb_models.Config,
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
            # 由于OP不支持MAP对象，此对象用来模拟Map中的Entry
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
                    'sdk_version': '1.0.27'
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
            # 由于OP不支持MAP对象，此对象用来模拟Map中的Entry
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
                    'sdk_version': '1.0.27'
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

    def query_item(
        self,
        request: cafecmdb_models.QueryItemRequest,
    ) -> cafecmdb_models.QueryItemResponse:
        """
        Description: 查询资源
        Summary: 查询资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_item_ex(request, headers, runtime)

    async def query_item_async(
        self,
        request: cafecmdb_models.QueryItemRequest,
    ) -> cafecmdb_models.QueryItemResponse:
        """
        Description: 查询资源
        Summary: 查询资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_item_ex_async(request, headers, runtime)

    def query_item_ex(
        self,
        request: cafecmdb_models.QueryItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryItemResponse:
        """
        Description: 查询资源
        Summary: 查询资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_item_ex_async(
        self,
        request: cafecmdb_models.QueryItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryItemResponse:
        """
        Description: 查询资源
        Summary: 查询资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_item(
        self,
        request: cafecmdb_models.CreateItemRequest,
    ) -> cafecmdb_models.CreateItemResponse:
        """
        Description: 创建资源
        Summary: 创建资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_item_ex(request, headers, runtime)

    async def create_item_async(
        self,
        request: cafecmdb_models.CreateItemRequest,
    ) -> cafecmdb_models.CreateItemResponse:
        """
        Description: 创建资源
        Summary: 创建资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_item_ex_async(request, headers, runtime)

    def create_item_ex(
        self,
        request: cafecmdb_models.CreateItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateItemResponse:
        """
        Description: 创建资源
        Summary: 创建资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_item_ex_async(
        self,
        request: cafecmdb_models.CreateItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateItemResponse:
        """
        Description: 创建资源
        Summary: 创建资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_item(
        self,
        request: cafecmdb_models.UpdateItemRequest,
    ) -> cafecmdb_models.UpdateItemResponse:
        """
        Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
        Summary: 更新资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_item_ex(request, headers, runtime)

    async def update_item_async(
        self,
        request: cafecmdb_models.UpdateItemRequest,
    ) -> cafecmdb_models.UpdateItemResponse:
        """
        Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
        Summary: 更新资源属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_item_ex_async(request, headers, runtime)

    def update_item_ex(
        self,
        request: cafecmdb_models.UpdateItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateItemResponse:
        """
        Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
        Summary: 更新资源属性
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_item_ex_async(
        self,
        request: cafecmdb_models.UpdateItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateItemResponse:
        """
        Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
        Summary: 更新资源属性
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_item(
        self,
        request: cafecmdb_models.DeleteItemRequest,
    ) -> cafecmdb_models.DeleteItemResponse:
        """
        Description: 删除单个资源
        Summary: 删除单个资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_item_ex(request, headers, runtime)

    async def delete_item_async(
        self,
        request: cafecmdb_models.DeleteItemRequest,
    ) -> cafecmdb_models.DeleteItemResponse:
        """
        Description: 删除单个资源
        Summary: 删除单个资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_item_ex_async(request, headers, runtime)

    def delete_item_ex(
        self,
        request: cafecmdb_models.DeleteItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteItemResponse:
        """
        Description: 删除单个资源
        Summary: 删除单个资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_item_ex_async(
        self,
        request: cafecmdb_models.DeleteItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteItemResponse:
        """
        Description: 删除单个资源
        Summary: 删除单个资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_item(
        self,
        request: cafecmdb_models.GetItemRequest,
    ) -> cafecmdb_models.GetItemResponse:
        """
        Description: 获取单个Item的详细信息
        Summary: 获取单个Item的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_item_ex(request, headers, runtime)

    async def get_item_async(
        self,
        request: cafecmdb_models.GetItemRequest,
    ) -> cafecmdb_models.GetItemResponse:
        """
        Description: 获取单个Item的详细信息
        Summary: 获取单个Item的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_item_ex_async(request, headers, runtime)

    def get_item_ex(
        self,
        request: cafecmdb_models.GetItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetItemResponse:
        """
        Description: 获取单个Item的详细信息
        Summary: 获取单个Item的详细信息
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_item_ex_async(
        self,
        request: cafecmdb_models.GetItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetItemResponse:
        """
        Description: 获取单个Item的详细信息
        Summary: 获取单个Item的详细信息
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_model(
        self,
        request: cafecmdb_models.GetModelRequest,
    ) -> cafecmdb_models.GetModelResponse:
        """
        Description: 获取单个模型
        Summary: 获取单个模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_model_ex(request, headers, runtime)

    async def get_model_async(
        self,
        request: cafecmdb_models.GetModelRequest,
    ) -> cafecmdb_models.GetModelResponse:
        """
        Description: 获取单个模型
        Summary: 获取单个模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_model_ex_async(request, headers, runtime)

    def get_model_ex(
        self,
        request: cafecmdb_models.GetModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelResponse:
        """
        Description: 获取单个模型
        Summary: 获取单个模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_model_ex_async(
        self,
        request: cafecmdb_models.GetModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelResponse:
        """
        Description: 获取单个模型
        Summary: 获取单个模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model(
        self,
        request: cafecmdb_models.QueryModelRequest,
    ) -> cafecmdb_models.QueryModelResponse:
        """
        Description: 查询模型
        Summary: 查询模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_ex(request, headers, runtime)

    async def query_model_async(
        self,
        request: cafecmdb_models.QueryModelRequest,
    ) -> cafecmdb_models.QueryModelResponse:
        """
        Description: 查询模型
        Summary: 查询模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_ex_async(request, headers, runtime)

    def query_model_ex(
        self,
        request: cafecmdb_models.QueryModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelResponse:
        """
        Description: 查询模型
        Summary: 查询模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_ex_async(
        self,
        request: cafecmdb_models.QueryModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelResponse:
        """
        Description: 查询模型
        Summary: 查询模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_model(
        self,
        request: cafecmdb_models.CreateModelRequest,
    ) -> cafecmdb_models.CreateModelResponse:
        """
        Description: 创建模型
        Summary: 创建模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_model_ex(request, headers, runtime)

    async def create_model_async(
        self,
        request: cafecmdb_models.CreateModelRequest,
    ) -> cafecmdb_models.CreateModelResponse:
        """
        Description: 创建模型
        Summary: 创建模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_model_ex_async(request, headers, runtime)

    def create_model_ex(
        self,
        request: cafecmdb_models.CreateModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelResponse:
        """
        Description: 创建模型
        Summary: 创建模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_model_ex_async(
        self,
        request: cafecmdb_models.CreateModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelResponse:
        """
        Description: 创建模型
        Summary: 创建模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_model(
        self,
        request: cafecmdb_models.UpdateModelRequest,
    ) -> cafecmdb_models.UpdateModelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_model_ex(request, headers, runtime)

    async def update_model_async(
        self,
        request: cafecmdb_models.UpdateModelRequest,
    ) -> cafecmdb_models.UpdateModelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_model_ex_async(request, headers, runtime)

    def update_model_ex(
        self,
        request: cafecmdb_models.UpdateModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_model_ex_async(
        self,
        request: cafecmdb_models.UpdateModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelResponse:
        """
        Description: 更新模型
        Summary: 更新模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_modelcategory(
        self,
        request: cafecmdb_models.GetModelcategoryRequest,
    ) -> cafecmdb_models.GetModelcategoryResponse:
        """
        Description: 获取单个模型分组
        Summary: 获取单个模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_modelcategory_ex(request, headers, runtime)

    async def get_modelcategory_async(
        self,
        request: cafecmdb_models.GetModelcategoryRequest,
    ) -> cafecmdb_models.GetModelcategoryResponse:
        """
        Description: 获取单个模型分组
        Summary: 获取单个模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_modelcategory_ex_async(request, headers, runtime)

    def get_modelcategory_ex(
        self,
        request: cafecmdb_models.GetModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelcategoryResponse:
        """
        Description: 获取单个模型分组
        Summary: 获取单个模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelcategoryResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelcategory.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_modelcategory_ex_async(
        self,
        request: cafecmdb_models.GetModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelcategoryResponse:
        """
        Description: 获取单个模型分组
        Summary: 获取单个模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelcategoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelcategory.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_model(
        self,
        request: cafecmdb_models.DeleteModelRequest,
    ) -> cafecmdb_models.DeleteModelResponse:
        """
        Description: 删除模型
        Summary: 删除模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_model_ex(request, headers, runtime)

    async def delete_model_async(
        self,
        request: cafecmdb_models.DeleteModelRequest,
    ) -> cafecmdb_models.DeleteModelResponse:
        """
        Description: 删除模型
        Summary: 删除模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_model_ex_async(request, headers, runtime)

    def delete_model_ex(
        self,
        request: cafecmdb_models.DeleteModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelResponse:
        """
        Description: 删除模型
        Summary: 删除模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_model_ex_async(
        self,
        request: cafecmdb_models.DeleteModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelResponse:
        """
        Description: 删除模型
        Summary: 删除模型
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_modelcategory(
        self,
        request: cafecmdb_models.QueryModelcategoryRequest,
    ) -> cafecmdb_models.QueryModelcategoryResponse:
        """
        Description: 查询模型分组
        Summary: 查询模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_modelcategory_ex(request, headers, runtime)

    async def query_modelcategory_async(
        self,
        request: cafecmdb_models.QueryModelcategoryRequest,
    ) -> cafecmdb_models.QueryModelcategoryResponse:
        """
        Description: 查询模型分组
        Summary: 查询模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_modelcategory_ex_async(request, headers, runtime)

    def query_modelcategory_ex(
        self,
        request: cafecmdb_models.QueryModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelcategoryResponse:
        """
        Description: 查询模型分组
        Summary: 查询模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelcategoryResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelcategory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_modelcategory_ex_async(
        self,
        request: cafecmdb_models.QueryModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelcategoryResponse:
        """
        Description: 查询模型分组
        Summary: 查询模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelcategoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelcategory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_modelcategory(
        self,
        request: cafecmdb_models.CreateModelcategoryRequest,
    ) -> cafecmdb_models.CreateModelcategoryResponse:
        """
        Description: 创建模型分组
        Summary: 创建模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_modelcategory_ex(request, headers, runtime)

    async def create_modelcategory_async(
        self,
        request: cafecmdb_models.CreateModelcategoryRequest,
    ) -> cafecmdb_models.CreateModelcategoryResponse:
        """
        Description: 创建模型分组
        Summary: 创建模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_modelcategory_ex_async(request, headers, runtime)

    def create_modelcategory_ex(
        self,
        request: cafecmdb_models.CreateModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelcategoryResponse:
        """
        Description: 创建模型分组
        Summary: 创建模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelcategoryResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelcategory.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_modelcategory_ex_async(
        self,
        request: cafecmdb_models.CreateModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelcategoryResponse:
        """
        Description: 创建模型分组
        Summary: 创建模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelcategoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelcategory.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_modelcategory(
        self,
        request: cafecmdb_models.UpdateModelcategoryRequest,
    ) -> cafecmdb_models.UpdateModelcategoryResponse:
        """
        Description: 更新模型分组
        Summary: 更新模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_modelcategory_ex(request, headers, runtime)

    async def update_modelcategory_async(
        self,
        request: cafecmdb_models.UpdateModelcategoryRequest,
    ) -> cafecmdb_models.UpdateModelcategoryResponse:
        """
        Description: 更新模型分组
        Summary: 更新模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_modelcategory_ex_async(request, headers, runtime)

    def update_modelcategory_ex(
        self,
        request: cafecmdb_models.UpdateModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelcategoryResponse:
        """
        Description: 更新模型分组
        Summary: 更新模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelcategoryResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelcategory.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_modelcategory_ex_async(
        self,
        request: cafecmdb_models.UpdateModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelcategoryResponse:
        """
        Description: 更新模型分组
        Summary: 更新模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelcategoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelcategory.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_modelcategory(
        self,
        request: cafecmdb_models.DeleteModelcategoryRequest,
    ) -> cafecmdb_models.DeleteModelcategoryResponse:
        """
        Description: 删除模型分组
        Summary: 删除模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_modelcategory_ex(request, headers, runtime)

    async def delete_modelcategory_async(
        self,
        request: cafecmdb_models.DeleteModelcategoryRequest,
    ) -> cafecmdb_models.DeleteModelcategoryResponse:
        """
        Description: 删除模型分组
        Summary: 删除模型分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_modelcategory_ex_async(request, headers, runtime)

    def delete_modelcategory_ex(
        self,
        request: cafecmdb_models.DeleteModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelcategoryResponse:
        """
        Description: 删除模型分组
        Summary: 删除模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelcategoryResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelcategory.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_modelcategory_ex_async(
        self,
        request: cafecmdb_models.DeleteModelcategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelcategoryResponse:
        """
        Description: 删除模型分组
        Summary: 删除模型分组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelcategoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelcategory.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_model_attribute(
        self,
        request: cafecmdb_models.GetModelAttributeRequest,
    ) -> cafecmdb_models.GetModelAttributeResponse:
        """
        Description: 获取单个模型字段
        Summary: 获取单个模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_model_attribute_ex(request, headers, runtime)

    async def get_model_attribute_async(
        self,
        request: cafecmdb_models.GetModelAttributeRequest,
    ) -> cafecmdb_models.GetModelAttributeResponse:
        """
        Description: 获取单个模型字段
        Summary: 获取单个模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_model_attribute_ex_async(request, headers, runtime)

    def get_model_attribute_ex(
        self,
        request: cafecmdb_models.GetModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelAttributeResponse:
        """
        Description: 获取单个模型字段
        Summary: 获取单个模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelAttributeResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.attribute.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_model_attribute_ex_async(
        self,
        request: cafecmdb_models.GetModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelAttributeResponse:
        """
        Description: 获取单个模型字段
        Summary: 获取单个模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelAttributeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.attribute.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_attribute(
        self,
        request: cafecmdb_models.QueryModelAttributeRequest,
    ) -> cafecmdb_models.QueryModelAttributeResponse:
        """
        Description: 查询模型字段
        Summary: 查询模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_attribute_ex(request, headers, runtime)

    async def query_model_attribute_async(
        self,
        request: cafecmdb_models.QueryModelAttributeRequest,
    ) -> cafecmdb_models.QueryModelAttributeResponse:
        """
        Description: 查询模型字段
        Summary: 查询模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_attribute_ex_async(request, headers, runtime)

    def query_model_attribute_ex(
        self,
        request: cafecmdb_models.QueryModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelAttributeResponse:
        """
        Description: 查询模型字段
        Summary: 查询模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelAttributeResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.attribute.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_attribute_ex_async(
        self,
        request: cafecmdb_models.QueryModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelAttributeResponse:
        """
        Description: 查询模型字段
        Summary: 查询模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelAttributeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.attribute.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_model_attribute(
        self,
        request: cafecmdb_models.CreateModelAttributeRequest,
    ) -> cafecmdb_models.CreateModelAttributeResponse:
        """
        Description: 创建模型字段
        Summary: 创建模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_model_attribute_ex(request, headers, runtime)

    async def create_model_attribute_async(
        self,
        request: cafecmdb_models.CreateModelAttributeRequest,
    ) -> cafecmdb_models.CreateModelAttributeResponse:
        """
        Description: 创建模型字段
        Summary: 创建模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_model_attribute_ex_async(request, headers, runtime)

    def create_model_attribute_ex(
        self,
        request: cafecmdb_models.CreateModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelAttributeResponse:
        """
        Description: 创建模型字段
        Summary: 创建模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelAttributeResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.attribute.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_model_attribute_ex_async(
        self,
        request: cafecmdb_models.CreateModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelAttributeResponse:
        """
        Description: 创建模型字段
        Summary: 创建模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelAttributeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.attribute.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_model_attribute(
        self,
        request: cafecmdb_models.UpdateModelAttributeRequest,
    ) -> cafecmdb_models.UpdateModelAttributeResponse:
        """
        Description: 更新模型字段
        Summary: 更新模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_model_attribute_ex(request, headers, runtime)

    async def update_model_attribute_async(
        self,
        request: cafecmdb_models.UpdateModelAttributeRequest,
    ) -> cafecmdb_models.UpdateModelAttributeResponse:
        """
        Description: 更新模型字段
        Summary: 更新模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_model_attribute_ex_async(request, headers, runtime)

    def update_model_attribute_ex(
        self,
        request: cafecmdb_models.UpdateModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelAttributeResponse:
        """
        Description: 更新模型字段
        Summary: 更新模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelAttributeResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.attribute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_model_attribute_ex_async(
        self,
        request: cafecmdb_models.UpdateModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelAttributeResponse:
        """
        Description: 更新模型字段
        Summary: 更新模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelAttributeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.attribute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_model_attribute(
        self,
        request: cafecmdb_models.DeleteModelAttributeRequest,
    ) -> cafecmdb_models.DeleteModelAttributeResponse:
        """
        Description: 删除模型字段
        Summary: 删除模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_model_attribute_ex(request, headers, runtime)

    async def delete_model_attribute_async(
        self,
        request: cafecmdb_models.DeleteModelAttributeRequest,
    ) -> cafecmdb_models.DeleteModelAttributeResponse:
        """
        Description: 删除模型字段
        Summary: 删除模型字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_model_attribute_ex_async(request, headers, runtime)

    def delete_model_attribute_ex(
        self,
        request: cafecmdb_models.DeleteModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelAttributeResponse:
        """
        Description: 删除模型字段
        Summary: 删除模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelAttributeResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.model.attribute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_model_attribute_ex_async(
        self,
        request: cafecmdb_models.DeleteModelAttributeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelAttributeResponse:
        """
        Description: 删除模型字段
        Summary: 删除模型字段
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelAttributeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.model.attribute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_item_id(
        self,
        request: cafecmdb_models.ExistItemIdRequest,
    ) -> cafecmdb_models.ExistItemIdResponse:
        """
        Description: id是否存在
        Summary: id是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_item_id_ex(request, headers, runtime)

    async def exist_item_id_async(
        self,
        request: cafecmdb_models.ExistItemIdRequest,
    ) -> cafecmdb_models.ExistItemIdResponse:
        """
        Description: id是否存在
        Summary: id是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_item_id_ex_async(request, headers, runtime)

    def exist_item_id_ex(
        self,
        request: cafecmdb_models.ExistItemIdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.ExistItemIdResponse:
        """
        Description: id是否存在
        Summary: id是否存在
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.ExistItemIdResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.id.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_item_id_ex_async(
        self,
        request: cafecmdb_models.ExistItemIdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.ExistItemIdResponse:
        """
        Description: id是否存在
        Summary: id是否存在
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.ExistItemIdResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.id.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_item_relations(
        self,
        request: cafecmdb_models.QueryItemRelationsRequest,
    ) -> cafecmdb_models.QueryItemRelationsResponse:
        """
        Description: 查询当前item的关系资源，注意区分上钻和下钻
        Summary: 查询当前item的关系资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_item_relations_ex(request, headers, runtime)

    async def query_item_relations_async(
        self,
        request: cafecmdb_models.QueryItemRelationsRequest,
    ) -> cafecmdb_models.QueryItemRelationsResponse:
        """
        Description: 查询当前item的关系资源，注意区分上钻和下钻
        Summary: 查询当前item的关系资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_item_relations_ex_async(request, headers, runtime)

    def query_item_relations_ex(
        self,
        request: cafecmdb_models.QueryItemRelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryItemRelationsResponse:
        """
        Description: 查询当前item的关系资源，注意区分上钻和下钻
        Summary: 查询当前item的关系资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryItemRelationsResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.relations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_item_relations_ex_async(
        self,
        request: cafecmdb_models.QueryItemRelationsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryItemRelationsResponse:
        """
        Description: 查询当前item的关系资源，注意区分上钻和下钻
        Summary: 查询当前item的关系资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryItemRelationsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.relations.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_item(
        self,
        request: cafecmdb_models.ImportItemRequest,
    ) -> cafecmdb_models.ImportItemResponse:
        """
        Description: 导入ITEM
        Summary: 导入ITEM
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_item_ex(request, headers, runtime)

    async def import_item_async(
        self,
        request: cafecmdb_models.ImportItemRequest,
    ) -> cafecmdb_models.ImportItemResponse:
        """
        Description: 导入ITEM
        Summary: 导入ITEM
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_item_ex_async(request, headers, runtime)

    def import_item_ex(
        self,
        request: cafecmdb_models.ImportItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.ImportItemResponse:
        """
        Description: 导入ITEM
        Summary: 导入ITEM
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.ImportItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_item_ex_async(
        self,
        request: cafecmdb_models.ImportItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.ImportItemResponse:
        """
        Description: 导入ITEM
        Summary: 导入ITEM
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.ImportItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_item(
        self,
        request: cafecmdb_models.ExportItemRequest,
    ) -> cafecmdb_models.ExportItemResponse:
        """
        Description: 导出资源
        Summary: 导出资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_item_ex(request, headers, runtime)

    async def export_item_async(
        self,
        request: cafecmdb_models.ExportItemRequest,
    ) -> cafecmdb_models.ExportItemResponse:
        """
        Description: 导出资源
        Summary: 导出资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_item_ex_async(request, headers, runtime)

    def export_item_ex(
        self,
        request: cafecmdb_models.ExportItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.ExportItemResponse:
        """
        Description: 导出资源
        Summary: 导出资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.ExportItemResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.item.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_item_ex_async(
        self,
        request: cafecmdb_models.ExportItemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.ExportItemResponse:
        """
        Description: 导出资源
        Summary: 导出资源
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.ExportItemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.item.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_modelrelationship(
        self,
        request: cafecmdb_models.GetModelrelationshipRequest,
    ) -> cafecmdb_models.GetModelrelationshipResponse:
        """
        Description: 获取单个模型关联
        Summary: 获取单个模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_modelrelationship_ex(request, headers, runtime)

    async def get_modelrelationship_async(
        self,
        request: cafecmdb_models.GetModelrelationshipRequest,
    ) -> cafecmdb_models.GetModelrelationshipResponse:
        """
        Description: 获取单个模型关联
        Summary: 获取单个模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_modelrelationship_ex_async(request, headers, runtime)

    def get_modelrelationship_ex(
        self,
        request: cafecmdb_models.GetModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelrelationshipResponse:
        """
        Description: 获取单个模型关联
        Summary: 获取单个模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelrelationshipResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelrelationship.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_modelrelationship_ex_async(
        self,
        request: cafecmdb_models.GetModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.GetModelrelationshipResponse:
        """
        Description: 获取单个模型关联
        Summary: 获取单个模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.GetModelrelationshipResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelrelationship.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_modelrelationship(
        self,
        request: cafecmdb_models.QueryModelrelationshipRequest,
    ) -> cafecmdb_models.QueryModelrelationshipResponse:
        """
        Description: 查询模型关联
        Summary: 查询模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_modelrelationship_ex(request, headers, runtime)

    async def query_modelrelationship_async(
        self,
        request: cafecmdb_models.QueryModelrelationshipRequest,
    ) -> cafecmdb_models.QueryModelrelationshipResponse:
        """
        Description: 查询模型关联
        Summary: 查询模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_modelrelationship_ex_async(request, headers, runtime)

    def query_modelrelationship_ex(
        self,
        request: cafecmdb_models.QueryModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelrelationshipResponse:
        """
        Description: 查询模型关联
        Summary: 查询模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelrelationshipResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelrelationship.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_modelrelationship_ex_async(
        self,
        request: cafecmdb_models.QueryModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryModelrelationshipResponse:
        """
        Description: 查询模型关联
        Summary: 查询模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryModelrelationshipResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelrelationship.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_modelrelationship(
        self,
        request: cafecmdb_models.CreateModelrelationshipRequest,
    ) -> cafecmdb_models.CreateModelrelationshipResponse:
        """
        Description: 创建模型关联
        Summary: 创建模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_modelrelationship_ex(request, headers, runtime)

    async def create_modelrelationship_async(
        self,
        request: cafecmdb_models.CreateModelrelationshipRequest,
    ) -> cafecmdb_models.CreateModelrelationshipResponse:
        """
        Description: 创建模型关联
        Summary: 创建模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_modelrelationship_ex_async(request, headers, runtime)

    def create_modelrelationship_ex(
        self,
        request: cafecmdb_models.CreateModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelrelationshipResponse:
        """
        Description: 创建模型关联
        Summary: 创建模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelrelationshipResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelrelationship.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_modelrelationship_ex_async(
        self,
        request: cafecmdb_models.CreateModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateModelrelationshipResponse:
        """
        Description: 创建模型关联
        Summary: 创建模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateModelrelationshipResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelrelationship.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_modelrelationship(
        self,
        request: cafecmdb_models.UpdateModelrelationshipRequest,
    ) -> cafecmdb_models.UpdateModelrelationshipResponse:
        """
        Description: 更新模型关联
        Summary: 更新模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_modelrelationship_ex(request, headers, runtime)

    async def update_modelrelationship_async(
        self,
        request: cafecmdb_models.UpdateModelrelationshipRequest,
    ) -> cafecmdb_models.UpdateModelrelationshipResponse:
        """
        Description: 更新模型关联
        Summary: 更新模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_modelrelationship_ex_async(request, headers, runtime)

    def update_modelrelationship_ex(
        self,
        request: cafecmdb_models.UpdateModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelrelationshipResponse:
        """
        Description: 更新模型关联
        Summary: 更新模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelrelationshipResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelrelationship.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_modelrelationship_ex_async(
        self,
        request: cafecmdb_models.UpdateModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateModelrelationshipResponse:
        """
        Description: 更新模型关联
        Summary: 更新模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateModelrelationshipResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelrelationship.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_modelrelationship(
        self,
        request: cafecmdb_models.DeleteModelrelationshipRequest,
    ) -> cafecmdb_models.DeleteModelrelationshipResponse:
        """
        Description: 删除模型关联
        Summary: 删除模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_modelrelationship_ex(request, headers, runtime)

    async def delete_modelrelationship_async(
        self,
        request: cafecmdb_models.DeleteModelrelationshipRequest,
    ) -> cafecmdb_models.DeleteModelrelationshipResponse:
        """
        Description: 删除模型关联
        Summary: 删除模型关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_modelrelationship_ex_async(request, headers, runtime)

    def delete_modelrelationship_ex(
        self,
        request: cafecmdb_models.DeleteModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelrelationshipResponse:
        """
        Description: 删除模型关联
        Summary: 删除模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelrelationshipResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.modelrelationship.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_modelrelationship_ex_async(
        self,
        request: cafecmdb_models.DeleteModelrelationshipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteModelrelationshipResponse:
        """
        Description: 删除模型关联
        Summary: 删除模型关联
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteModelrelationshipResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.modelrelationship.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_param(
        self,
        request: cafecmdb_models.PullParamRequest,
    ) -> cafecmdb_models.PullParamResponse:
        """
        Description: 拉取当前环境的参数表
        Summary: 拉取当前环境的参数表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_param_ex(request, headers, runtime)

    async def pull_param_async(
        self,
        request: cafecmdb_models.PullParamRequest,
    ) -> cafecmdb_models.PullParamResponse:
        """
        Description: 拉取当前环境的参数表
        Summary: 拉取当前环境的参数表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_param_ex_async(request, headers, runtime)

    def pull_param_ex(
        self,
        request: cafecmdb_models.PullParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.PullParamResponse:
        """
        Description: 拉取当前环境的参数表
        Summary: 拉取当前环境的参数表
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.PullParamResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.param.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_param_ex_async(
        self,
        request: cafecmdb_models.PullParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.PullParamResponse:
        """
        Description: 拉取当前环境的参数表
        Summary: 拉取当前环境的参数表
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.PullParamResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.param.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_param(
        self,
        request: cafecmdb_models.PushParamRequest,
    ) -> cafecmdb_models.PushParamResponse:
        """
        Description: 更新配置信息
        Summary: 更新配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_param_ex(request, headers, runtime)

    async def push_param_async(
        self,
        request: cafecmdb_models.PushParamRequest,
    ) -> cafecmdb_models.PushParamResponse:
        """
        Description: 更新配置信息
        Summary: 更新配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_param_ex_async(request, headers, runtime)

    def push_param_ex(
        self,
        request: cafecmdb_models.PushParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.PushParamResponse:
        """
        Description: 更新配置信息
        Summary: 更新配置信息
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.PushParamResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.param.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_param_ex_async(
        self,
        request: cafecmdb_models.PushParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.PushParamResponse:
        """
        Description: 更新配置信息
        Summary: 更新配置信息
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.PushParamResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.param.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_attributegroup(
        self,
        request: cafecmdb_models.CreateAttributegroupRequest,
    ) -> cafecmdb_models.CreateAttributegroupResponse:
        """
        Description: 创建字段组
        Summary: 创建字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_attributegroup_ex(request, headers, runtime)

    async def create_attributegroup_async(
        self,
        request: cafecmdb_models.CreateAttributegroupRequest,
    ) -> cafecmdb_models.CreateAttributegroupResponse:
        """
        Description: 创建字段组
        Summary: 创建字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_attributegroup_ex_async(request, headers, runtime)

    def create_attributegroup_ex(
        self,
        request: cafecmdb_models.CreateAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateAttributegroupResponse:
        """
        Description: 创建字段组
        Summary: 创建字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateAttributegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.attributegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_attributegroup_ex_async(
        self,
        request: cafecmdb_models.CreateAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.CreateAttributegroupResponse:
        """
        Description: 创建字段组
        Summary: 创建字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.CreateAttributegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.attributegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_attributegroup(
        self,
        request: cafecmdb_models.QueryAttributegroupRequest,
    ) -> cafecmdb_models.QueryAttributegroupResponse:
        """
        Description: 查询字段组
        Summary: 查询字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_attributegroup_ex(request, headers, runtime)

    async def query_attributegroup_async(
        self,
        request: cafecmdb_models.QueryAttributegroupRequest,
    ) -> cafecmdb_models.QueryAttributegroupResponse:
        """
        Description: 查询字段组
        Summary: 查询字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_attributegroup_ex_async(request, headers, runtime)

    def query_attributegroup_ex(
        self,
        request: cafecmdb_models.QueryAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryAttributegroupResponse:
        """
        Description: 查询字段组
        Summary: 查询字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryAttributegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.attributegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_attributegroup_ex_async(
        self,
        request: cafecmdb_models.QueryAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryAttributegroupResponse:
        """
        Description: 查询字段组
        Summary: 查询字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryAttributegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.attributegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_attributegroup(
        self,
        request: cafecmdb_models.DeleteAttributegroupRequest,
    ) -> cafecmdb_models.DeleteAttributegroupResponse:
        """
        Description: 删除字段组
        Summary: 删除字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_attributegroup_ex(request, headers, runtime)

    async def delete_attributegroup_async(
        self,
        request: cafecmdb_models.DeleteAttributegroupRequest,
    ) -> cafecmdb_models.DeleteAttributegroupResponse:
        """
        Description: 删除字段组
        Summary: 删除字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_attributegroup_ex_async(request, headers, runtime)

    def delete_attributegroup_ex(
        self,
        request: cafecmdb_models.DeleteAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteAttributegroupResponse:
        """
        Description: 删除字段组
        Summary: 删除字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteAttributegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.attributegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_attributegroup_ex_async(
        self,
        request: cafecmdb_models.DeleteAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.DeleteAttributegroupResponse:
        """
        Description: 删除字段组
        Summary: 删除字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.DeleteAttributegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.attributegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_attributegroup(
        self,
        request: cafecmdb_models.UpdateAttributegroupRequest,
    ) -> cafecmdb_models.UpdateAttributegroupResponse:
        """
        Description: 更新字段组
        Summary: 更新字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_attributegroup_ex(request, headers, runtime)

    async def update_attributegroup_async(
        self,
        request: cafecmdb_models.UpdateAttributegroupRequest,
    ) -> cafecmdb_models.UpdateAttributegroupResponse:
        """
        Description: 更新字段组
        Summary: 更新字段组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_attributegroup_ex_async(request, headers, runtime)

    def update_attributegroup_ex(
        self,
        request: cafecmdb_models.UpdateAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateAttributegroupResponse:
        """
        Description: 更新字段组
        Summary: 更新字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateAttributegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.attributegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_attributegroup_ex_async(
        self,
        request: cafecmdb_models.UpdateAttributegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.UpdateAttributegroupResponse:
        """
        Description: 更新字段组
        Summary: 更新字段组
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.UpdateAttributegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.attributegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_auditlog(
        self,
        request: cafecmdb_models.QueryAuditlogRequest,
    ) -> cafecmdb_models.QueryAuditlogResponse:
        """
        Description: 审计日志查询
        Summary: 审计日志查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_auditlog_ex(request, headers, runtime)

    async def query_auditlog_async(
        self,
        request: cafecmdb_models.QueryAuditlogRequest,
    ) -> cafecmdb_models.QueryAuditlogResponse:
        """
        Description: 审计日志查询
        Summary: 审计日志查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_auditlog_ex_async(request, headers, runtime)

    def query_auditlog_ex(
        self,
        request: cafecmdb_models.QueryAuditlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryAuditlogResponse:
        """
        Description: 审计日志查询
        Summary: 审计日志查询
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryAuditlogResponse().from_map(
            self.do_request('1.0', 'antcloud.cmdb.auditlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_auditlog_ex_async(
        self,
        request: cafecmdb_models.QueryAuditlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cafecmdb_models.QueryAuditlogResponse:
        """
        Description: 审计日志查询
        Summary: 审计日志查询
        """
        UtilClient.validate_model(request)
        return cafecmdb_models.QueryAuditlogResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.cmdb.auditlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
