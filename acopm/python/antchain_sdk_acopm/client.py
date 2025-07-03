# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_acopm import models as acopm_models
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
        config: acopm_models.Config,
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
            # RateLimitEffectScopeValueDTO
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
                    'sdk_version': '1.3.44',
                    '_prod_code': 'ACOPM',
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
            # RateLimitEffectScopeValueDTO
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
                    'sdk_version': '1.3.44',
                    '_prod_code': 'ACOPM',
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

    def list_product(
        self,
        request: acopm_models.ListProductRequest,
    ) -> acopm_models.ListProductResponse:
        """
        Description: 获取产品列表
        Summary: 获取产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_product_ex(request, headers, runtime)

    async def list_product_async(
        self,
        request: acopm_models.ListProductRequest,
    ) -> acopm_models.ListProductResponse:
        """
        Description: 获取产品列表
        Summary: 获取产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_product_ex_async(request, headers, runtime)

    def list_product_ex(
        self,
        request: acopm_models.ListProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ListProductResponse:
        """
        Description: 获取产品列表
        Summary: 获取产品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ListProductResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_product_ex_async(
        self,
        request: acopm_models.ListProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ListProductResponse:
        """
        Description: 获取产品列表
        Summary: 获取产品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ListProductResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_multisdk(
        self,
        request: acopm_models.CallbackMultisdkRequest,
    ) -> acopm_models.CallbackMultisdkResponse:
        """
        Description: 阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_multisdk_ex(request, headers, runtime)

    async def callback_multisdk_async(
        self,
        request: acopm_models.CallbackMultisdkRequest,
    ) -> acopm_models.CallbackMultisdkResponse:
        """
        Description: 阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_multisdk_ex_async(request, headers, runtime)

    def callback_multisdk_ex(
        self,
        request: acopm_models.CallbackMultisdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CallbackMultisdkResponse:
        """
        Description: 阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CallbackMultisdkResponse(),
            self.do_request('1.0', 'antcloud.acopm.multisdk.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_multisdk_ex_async(
        self,
        request: acopm_models.CallbackMultisdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CallbackMultisdkResponse:
        """
        Description: 阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CallbackMultisdkResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.multisdk.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_product(
        self,
        request: acopm_models.CreateProductRequest,
    ) -> acopm_models.CreateProductResponse:
        """
        Description: 创建产品
        Summary: 创建产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_product_ex(request, headers, runtime)

    async def create_product_async(
        self,
        request: acopm_models.CreateProductRequest,
    ) -> acopm_models.CreateProductResponse:
        """
        Description: 创建产品
        Summary: 创建产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_product_ex_async(request, headers, runtime)

    def create_product_ex(
        self,
        request: acopm_models.CreateProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CreateProductResponse:
        """
        Description: 创建产品
        Summary: 创建产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CreateProductResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_product_ex_async(
        self,
        request: acopm_models.CreateProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CreateProductResponse:
        """
        Description: 创建产品
        Summary: 创建产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CreateProductResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_product(
        self,
        request: acopm_models.InitProductRequest,
    ) -> acopm_models.InitProductResponse:
        """
        Description: api初始化
        Summary: api初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_product_ex(request, headers, runtime)

    async def init_product_async(
        self,
        request: acopm_models.InitProductRequest,
    ) -> acopm_models.InitProductResponse:
        """
        Description: api初始化
        Summary: api初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_product_ex_async(request, headers, runtime)

    def init_product_ex(
        self,
        request: acopm_models.InitProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.InitProductResponse:
        """
        Description: api初始化
        Summary: api初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.InitProductResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_product_ex_async(
        self,
        request: acopm_models.InitProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.InitProductResponse:
        """
        Description: api初始化
        Summary: api初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.InitProductResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_product(
        self,
        request: acopm_models.DeleteProductRequest,
    ) -> acopm_models.DeleteProductResponse:
        """
        Description: 删除产品
        Summary: 删除产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_product_ex(request, headers, runtime)

    async def delete_product_async(
        self,
        request: acopm_models.DeleteProductRequest,
    ) -> acopm_models.DeleteProductResponse:
        """
        Description: 删除产品
        Summary: 删除产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_product_ex_async(request, headers, runtime)

    def delete_product_ex(
        self,
        request: acopm_models.DeleteProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.DeleteProductResponse:
        """
        Description: 删除产品
        Summary: 删除产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.DeleteProductResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_product_ex_async(
        self,
        request: acopm_models.DeleteProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.DeleteProductResponse:
        """
        Description: 删除产品
        Summary: 删除产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.DeleteProductResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_product_sdk(
        self,
        request: acopm_models.PublishProductSdkRequest,
    ) -> acopm_models.PublishProductSdkResponse:
        """
        Description: 发布sdk
        Summary: 发布sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_product_sdk_ex(request, headers, runtime)

    async def publish_product_sdk_async(
        self,
        request: acopm_models.PublishProductSdkRequest,
    ) -> acopm_models.PublishProductSdkResponse:
        """
        Description: 发布sdk
        Summary: 发布sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_product_sdk_ex_async(request, headers, runtime)

    def publish_product_sdk_ex(
        self,
        request: acopm_models.PublishProductSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.PublishProductSdkResponse:
        """
        Description: 发布sdk
        Summary: 发布sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.PublishProductSdkResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.sdk.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_product_sdk_ex_async(
        self,
        request: acopm_models.PublishProductSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.PublishProductSdkResponse:
        """
        Description: 发布sdk
        Summary: 发布sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.PublishProductSdkResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.sdk.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sdk(
        self,
        request: acopm_models.GetSdkRequest,
    ) -> acopm_models.GetSdkResponse:
        """
        Description: 获取sdk元数据snapshot
        Summary: 获取sdk元数据snapshot
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sdk_ex(request, headers, runtime)

    async def get_sdk_async(
        self,
        request: acopm_models.GetSdkRequest,
    ) -> acopm_models.GetSdkResponse:
        """
        Description: 获取sdk元数据snapshot
        Summary: 获取sdk元数据snapshot
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sdk_ex_async(request, headers, runtime)

    def get_sdk_ex(
        self,
        request: acopm_models.GetSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.GetSdkResponse:
        """
        Description: 获取sdk元数据snapshot
        Summary: 获取sdk元数据snapshot
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.GetSdkResponse(),
            self.do_request('1.0', 'antcloud.acopm.sdk.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sdk_ex_async(
        self,
        request: acopm_models.GetSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.GetSdkResponse:
        """
        Description: 获取sdk元数据snapshot
        Summary: 获取sdk元数据snapshot
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.GetSdkResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.sdk.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_product_saassdk(
        self,
        request: acopm_models.PublishProductSaassdkRequest,
    ) -> acopm_models.PublishProductSaassdkResponse:
        """
        Description: 发布共享能力中心sdk
        Summary: 共享能力中心sdk发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_product_saassdk_ex(request, headers, runtime)

    async def publish_product_saassdk_async(
        self,
        request: acopm_models.PublishProductSaassdkRequest,
    ) -> acopm_models.PublishProductSaassdkResponse:
        """
        Description: 发布共享能力中心sdk
        Summary: 共享能力中心sdk发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_product_saassdk_ex_async(request, headers, runtime)

    def publish_product_saassdk_ex(
        self,
        request: acopm_models.PublishProductSaassdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.PublishProductSaassdkResponse:
        """
        Description: 发布共享能力中心sdk
        Summary: 共享能力中心sdk发布
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.PublishProductSaassdkResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.saassdk.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_product_saassdk_ex_async(
        self,
        request: acopm_models.PublishProductSaassdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.PublishProductSaassdkResponse:
        """
        Description: 发布共享能力中心sdk
        Summary: 共享能力中心sdk发布
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.PublishProductSaassdkResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.saassdk.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_product_saassdk(
        self,
        request: acopm_models.GetProductSaassdkRequest,
    ) -> acopm_models.GetProductSaassdkResponse:
        """
        Description: 共享能力中心获取sdk打包结果
        Summary: 共享能力中心获取sdk打包结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_product_saassdk_ex(request, headers, runtime)

    async def get_product_saassdk_async(
        self,
        request: acopm_models.GetProductSaassdkRequest,
    ) -> acopm_models.GetProductSaassdkResponse:
        """
        Description: 共享能力中心获取sdk打包结果
        Summary: 共享能力中心获取sdk打包结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_product_saassdk_ex_async(request, headers, runtime)

    def get_product_saassdk_ex(
        self,
        request: acopm_models.GetProductSaassdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.GetProductSaassdkResponse:
        """
        Description: 共享能力中心获取sdk打包结果
        Summary: 共享能力中心获取sdk打包结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.GetProductSaassdkResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.saassdk.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_product_saassdk_ex_async(
        self,
        request: acopm_models.GetProductSaassdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.GetProductSaassdkResponse:
        """
        Description: 共享能力中心获取sdk打包结果
        Summary: 共享能力中心获取sdk打包结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.GetProductSaassdkResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.saassdk.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_product_member(
        self,
        request: acopm_models.AddProductMemberRequest,
    ) -> acopm_models.AddProductMemberResponse:
        """
        Description: 同步产品成员权限
        Summary: 同步产品成员权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_product_member_ex(request, headers, runtime)

    async def add_product_member_async(
        self,
        request: acopm_models.AddProductMemberRequest,
    ) -> acopm_models.AddProductMemberResponse:
        """
        Description: 同步产品成员权限
        Summary: 同步产品成员权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_product_member_ex_async(request, headers, runtime)

    def add_product_member_ex(
        self,
        request: acopm_models.AddProductMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.AddProductMemberResponse:
        """
        Description: 同步产品成员权限
        Summary: 同步产品成员权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.AddProductMemberResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_product_member_ex_async(
        self,
        request: acopm_models.AddProductMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.AddProductMemberResponse:
        """
        Description: 同步产品成员权限
        Summary: 同步产品成员权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.AddProductMemberResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_ratelimit(
        self,
        request: acopm_models.QueryApiRatelimitRequest,
    ) -> acopm_models.QueryApiRatelimitResponse:
        """
        Description: 查询api限流信息
        Summary: 查询api限流信息（api）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_ratelimit_ex(request, headers, runtime)

    async def query_api_ratelimit_async(
        self,
        request: acopm_models.QueryApiRatelimitRequest,
    ) -> acopm_models.QueryApiRatelimitResponse:
        """
        Description: 查询api限流信息
        Summary: 查询api限流信息（api）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_ratelimit_ex_async(request, headers, runtime)

    def query_api_ratelimit_ex(
        self,
        request: acopm_models.QueryApiRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryApiRatelimitResponse:
        """
        Description: 查询api限流信息
        Summary: 查询api限流信息（api）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryApiRatelimitResponse(),
            self.do_request('1.0', 'antcloud.acopm.api.ratelimit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_ratelimit_ex_async(
        self,
        request: acopm_models.QueryApiRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryApiRatelimitResponse:
        """
        Description: 查询api限流信息
        Summary: 查询api限流信息（api）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryApiRatelimitResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.api.ratelimit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenant_ratelimit(
        self,
        request: acopm_models.QueryTenantRatelimitRequest,
    ) -> acopm_models.QueryTenantRatelimitResponse:
        """
        Description:  查询api限流信息
        Summary:  查询api限流信息（租户维度）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenant_ratelimit_ex(request, headers, runtime)

    async def query_tenant_ratelimit_async(
        self,
        request: acopm_models.QueryTenantRatelimitRequest,
    ) -> acopm_models.QueryTenantRatelimitResponse:
        """
        Description:  查询api限流信息
        Summary:  查询api限流信息（租户维度）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenant_ratelimit_ex_async(request, headers, runtime)

    def query_tenant_ratelimit_ex(
        self,
        request: acopm_models.QueryTenantRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryTenantRatelimitResponse:
        """
        Description:  查询api限流信息
        Summary:  查询api限流信息（租户维度）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryTenantRatelimitResponse(),
            self.do_request('1.0', 'antcloud.acopm.tenant.ratelimit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenant_ratelimit_ex_async(
        self,
        request: acopm_models.QueryTenantRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryTenantRatelimitResponse:
        """
        Description:  查询api限流信息
        Summary:  查询api限流信息（租户维度）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryTenantRatelimitResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.tenant.ratelimit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_api_ratelimit(
        self,
        request: acopm_models.UpdateApiRatelimitRequest,
    ) -> acopm_models.UpdateApiRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（api维度）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_api_ratelimit_ex(request, headers, runtime)

    async def update_api_ratelimit_async(
        self,
        request: acopm_models.UpdateApiRatelimitRequest,
    ) -> acopm_models.UpdateApiRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（api维度）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_api_ratelimit_ex_async(request, headers, runtime)

    def update_api_ratelimit_ex(
        self,
        request: acopm_models.UpdateApiRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateApiRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（api维度）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateApiRatelimitResponse(),
            self.do_request('1.0', 'antcloud.acopm.api.ratelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_api_ratelimit_ex_async(
        self,
        request: acopm_models.UpdateApiRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateApiRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（api维度）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateApiRatelimitResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.api.ratelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_tenant_ratelimit(
        self,
        request: acopm_models.UpdateTenantRatelimitRequest,
    ) -> acopm_models.UpdateTenantRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（租户维度）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_tenant_ratelimit_ex(request, headers, runtime)

    async def update_tenant_ratelimit_async(
        self,
        request: acopm_models.UpdateTenantRatelimitRequest,
    ) -> acopm_models.UpdateTenantRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（租户维度）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_tenant_ratelimit_ex_async(request, headers, runtime)

    def update_tenant_ratelimit_ex(
        self,
        request: acopm_models.UpdateTenantRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateTenantRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（租户维度）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateTenantRatelimitResponse(),
            self.do_request('1.0', 'antcloud.acopm.tenant.ratelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_tenant_ratelimit_ex_async(
        self,
        request: acopm_models.UpdateTenantRatelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateTenantRatelimitResponse:
        """
        Description: api限流更新
        Summary: api限流更新（租户维度）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateTenantRatelimitResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.tenant.ratelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_jiuzhou_plan(
        self,
        request: acopm_models.CallbackJiuzhouPlanRequest,
    ) -> acopm_models.CallbackJiuzhouPlanResponse:
        """
        Description: 九州工单回调接口
        Summary: 九州工单回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_jiuzhou_plan_ex(request, headers, runtime)

    async def callback_jiuzhou_plan_async(
        self,
        request: acopm_models.CallbackJiuzhouPlanRequest,
    ) -> acopm_models.CallbackJiuzhouPlanResponse:
        """
        Description: 九州工单回调接口
        Summary: 九州工单回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_jiuzhou_plan_ex_async(request, headers, runtime)

    def callback_jiuzhou_plan_ex(
        self,
        request: acopm_models.CallbackJiuzhouPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CallbackJiuzhouPlanResponse:
        """
        Description: 九州工单回调接口
        Summary: 九州工单回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CallbackJiuzhouPlanResponse(),
            self.do_request('1.0', 'antcloud.acopm.jiuzhou.plan.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_jiuzhou_plan_ex_async(
        self,
        request: acopm_models.CallbackJiuzhouPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CallbackJiuzhouPlanResponse:
        """
        Description: 九州工单回调接口
        Summary: 九州工单回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CallbackJiuzhouPlanResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.jiuzhou.plan.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_robot_intelligent(
        self,
        request: acopm_models.ExecRobotIntelligentRequest,
    ) -> acopm_models.ExecRobotIntelligentResponse:
        """
        Description: 智能排障机器人接口
        Summary: 排障机器人接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_robot_intelligent_ex(request, headers, runtime)

    async def exec_robot_intelligent_async(
        self,
        request: acopm_models.ExecRobotIntelligentRequest,
    ) -> acopm_models.ExecRobotIntelligentResponse:
        """
        Description: 智能排障机器人接口
        Summary: 排障机器人接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_robot_intelligent_ex_async(request, headers, runtime)

    def exec_robot_intelligent_ex(
        self,
        request: acopm_models.ExecRobotIntelligentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ExecRobotIntelligentResponse:
        """
        Description: 智能排障机器人接口
        Summary: 排障机器人接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ExecRobotIntelligentResponse(),
            self.do_request('1.0', 'antcloud.acopm.robot.intelligent.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_robot_intelligent_ex_async(
        self,
        request: acopm_models.ExecRobotIntelligentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ExecRobotIntelligentResponse:
        """
        Description: 智能排障机器人接口
        Summary: 排障机器人接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ExecRobotIntelligentResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.robot.intelligent.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apis_status(
        self,
        request: acopm_models.UpdateApisStatusRequest,
    ) -> acopm_models.UpdateApisStatusResponse:
        """
        Description: 生产环境api状态更新
        Summary: 生产环境api状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apis_status_ex(request, headers, runtime)

    async def update_apis_status_async(
        self,
        request: acopm_models.UpdateApisStatusRequest,
    ) -> acopm_models.UpdateApisStatusResponse:
        """
        Description: 生产环境api状态更新
        Summary: 生产环境api状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apis_status_ex_async(request, headers, runtime)

    def update_apis_status_ex(
        self,
        request: acopm_models.UpdateApisStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateApisStatusResponse:
        """
        Description: 生产环境api状态更新
        Summary: 生产环境api状态更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateApisStatusResponse(),
            self.do_request('1.0', 'antcloud.acopm.apis.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apis_status_ex_async(
        self,
        request: acopm_models.UpdateApisStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateApisStatusResponse:
        """
        Description: 生产环境api状态更新
        Summary: 生产环境api状态更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateApisStatusResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.apis.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sdk_api(
        self,
        request: acopm_models.QuerySdkApiRequest,
    ) -> acopm_models.QuerySdkApiResponse:
        """
        Description: 查询商业产品sdk版本api信息
        Summary: 查询商业产品sdk版本api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sdk_api_ex(request, headers, runtime)

    async def query_sdk_api_async(
        self,
        request: acopm_models.QuerySdkApiRequest,
    ) -> acopm_models.QuerySdkApiResponse:
        """
        Description: 查询商业产品sdk版本api信息
        Summary: 查询商业产品sdk版本api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sdk_api_ex_async(request, headers, runtime)

    def query_sdk_api_ex(
        self,
        request: acopm_models.QuerySdkApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QuerySdkApiResponse:
        """
        Description: 查询商业产品sdk版本api信息
        Summary: 查询商业产品sdk版本api信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QuerySdkApiResponse(),
            self.do_request('1.0', 'antcloud.acopm.sdk.api.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sdk_api_ex_async(
        self,
        request: acopm_models.QuerySdkApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QuerySdkApiResponse:
        """
        Description: 查询商业产品sdk版本api信息
        Summary: 查询商业产品sdk版本api信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QuerySdkApiResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.sdk.api.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_robot_baasplus(
        self,
        request: acopm_models.ExecRobotBaasplusRequest,
    ) -> acopm_models.ExecRobotBaasplusResponse:
        """
        Description: 企业认证排障
        Summary: 企业认证排障
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_robot_baasplus_ex(request, headers, runtime)

    async def exec_robot_baasplus_async(
        self,
        request: acopm_models.ExecRobotBaasplusRequest,
    ) -> acopm_models.ExecRobotBaasplusResponse:
        """
        Description: 企业认证排障
        Summary: 企业认证排障
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_robot_baasplus_ex_async(request, headers, runtime)

    def exec_robot_baasplus_ex(
        self,
        request: acopm_models.ExecRobotBaasplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ExecRobotBaasplusResponse:
        """
        Description: 企业认证排障
        Summary: 企业认证排障
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ExecRobotBaasplusResponse(),
            self.do_request('1.0', 'antcloud.acopm.robot.baasplus.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_robot_baasplus_ex_async(
        self,
        request: acopm_models.ExecRobotBaasplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ExecRobotBaasplusResponse:
        """
        Description: 企业认证排障
        Summary: 企业认证排障
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ExecRobotBaasplusResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.robot.baasplus.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_detail(
        self,
        request: acopm_models.QueryApiDetailRequest,
    ) -> acopm_models.QueryApiDetailResponse:
        """
        Description: api数据获取
        Summary: api数据获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_detail_ex(request, headers, runtime)

    async def query_api_detail_async(
        self,
        request: acopm_models.QueryApiDetailRequest,
    ) -> acopm_models.QueryApiDetailResponse:
        """
        Description: api数据获取
        Summary: api数据获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_detail_ex_async(request, headers, runtime)

    def query_api_detail_ex(
        self,
        request: acopm_models.QueryApiDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryApiDetailResponse:
        """
        Description: api数据获取
        Summary: api数据获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryApiDetailResponse(),
            self.do_request('1.0', 'antcloud.acopm.api.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_detail_ex_async(
        self,
        request: acopm_models.QueryApiDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryApiDetailResponse:
        """
        Description: api数据获取
        Summary: api数据获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryApiDetailResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.api.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_owner(
        self,
        request: acopm_models.QueryApiOwnerRequest,
    ) -> acopm_models.QueryApiOwnerResponse:
        """
        Description: 查询api负责人信息
        Summary: 查询api负责人信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_owner_ex(request, headers, runtime)

    async def query_api_owner_async(
        self,
        request: acopm_models.QueryApiOwnerRequest,
    ) -> acopm_models.QueryApiOwnerResponse:
        """
        Description: 查询api负责人信息
        Summary: 查询api负责人信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_owner_ex_async(request, headers, runtime)

    def query_api_owner_ex(
        self,
        request: acopm_models.QueryApiOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryApiOwnerResponse:
        """
        Description: 查询api负责人信息
        Summary: 查询api负责人信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryApiOwnerResponse(),
            self.do_request('1.0', 'antcloud.acopm.api.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_owner_ex_async(
        self,
        request: acopm_models.QueryApiOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryApiOwnerResponse:
        """
        Description: 查询api负责人信息
        Summary: 查询api负责人信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryApiOwnerResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.api.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_gw_cache(
        self,
        request: acopm_models.UpdateGwCacheRequest,
    ) -> acopm_models.UpdateGwCacheResponse:
        """
        Description: 请求刷新gw的缓存
        Summary: 网关运行态gw cache刷新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_gw_cache_ex(request, headers, runtime)

    async def update_gw_cache_async(
        self,
        request: acopm_models.UpdateGwCacheRequest,
    ) -> acopm_models.UpdateGwCacheResponse:
        """
        Description: 请求刷新gw的缓存
        Summary: 网关运行态gw cache刷新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_gw_cache_ex_async(request, headers, runtime)

    def update_gw_cache_ex(
        self,
        request: acopm_models.UpdateGwCacheRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateGwCacheResponse:
        """
        Description: 请求刷新gw的缓存
        Summary: 网关运行态gw cache刷新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateGwCacheResponse(),
            self.do_request('1.0', 'antcloud.acopm.gw.cache.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_gw_cache_ex_async(
        self,
        request: acopm_models.UpdateGwCacheRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateGwCacheResponse:
        """
        Description: 请求刷新gw的缓存
        Summary: 网关运行态gw cache刷新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateGwCacheResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.gw.cache.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_businessrule_operate(
        self,
        request: acopm_models.CreateBusinessruleOperateRequest,
    ) -> acopm_models.CreateBusinessruleOperateResponse:
        """
        Description: 商业化规则创建
        Summary: 商业化规则创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_businessrule_operate_ex(request, headers, runtime)

    async def create_businessrule_operate_async(
        self,
        request: acopm_models.CreateBusinessruleOperateRequest,
    ) -> acopm_models.CreateBusinessruleOperateResponse:
        """
        Description: 商业化规则创建
        Summary: 商业化规则创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_businessrule_operate_ex_async(request, headers, runtime)

    def create_businessrule_operate_ex(
        self,
        request: acopm_models.CreateBusinessruleOperateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CreateBusinessruleOperateResponse:
        """
        Description: 商业化规则创建
        Summary: 商业化规则创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CreateBusinessruleOperateResponse(),
            self.do_request('1.0', 'antcloud.acopm.businessrule.operate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_businessrule_operate_ex_async(
        self,
        request: acopm_models.CreateBusinessruleOperateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CreateBusinessruleOperateResponse:
        """
        Description: 商业化规则创建
        Summary: 商业化规则创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CreateBusinessruleOperateResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.businessrule.operate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_businessrule_operate(
        self,
        request: acopm_models.EnableBusinessruleOperateRequest,
    ) -> acopm_models.EnableBusinessruleOperateResponse:
        """
        Description: 生效商业化规则
        Summary: 生效商业化规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_businessrule_operate_ex(request, headers, runtime)

    async def enable_businessrule_operate_async(
        self,
        request: acopm_models.EnableBusinessruleOperateRequest,
    ) -> acopm_models.EnableBusinessruleOperateResponse:
        """
        Description: 生效商业化规则
        Summary: 生效商业化规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_businessrule_operate_ex_async(request, headers, runtime)

    def enable_businessrule_operate_ex(
        self,
        request: acopm_models.EnableBusinessruleOperateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.EnableBusinessruleOperateResponse:
        """
        Description: 生效商业化规则
        Summary: 生效商业化规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.EnableBusinessruleOperateResponse(),
            self.do_request('1.0', 'antcloud.acopm.businessrule.operate.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_businessrule_operate_ex_async(
        self,
        request: acopm_models.EnableBusinessruleOperateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.EnableBusinessruleOperateResponse:
        """
        Description: 生效商业化规则
        Summary: 生效商业化规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.EnableBusinessruleOperateResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.businessrule.operate.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_businessrule_match(
        self,
        request: acopm_models.QueryBusinessruleMatchRequest,
    ) -> acopm_models.QueryBusinessruleMatchResponse:
        """
        Description: 查询规则匹配情况
        Summary: 查询规则匹配情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_businessrule_match_ex(request, headers, runtime)

    async def query_businessrule_match_async(
        self,
        request: acopm_models.QueryBusinessruleMatchRequest,
    ) -> acopm_models.QueryBusinessruleMatchResponse:
        """
        Description: 查询规则匹配情况
        Summary: 查询规则匹配情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_businessrule_match_ex_async(request, headers, runtime)

    def query_businessrule_match_ex(
        self,
        request: acopm_models.QueryBusinessruleMatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryBusinessruleMatchResponse:
        """
        Description: 查询规则匹配情况
        Summary: 查询规则匹配情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryBusinessruleMatchResponse(),
            self.do_request('1.0', 'antcloud.acopm.businessrule.match.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_businessrule_match_ex_async(
        self,
        request: acopm_models.QueryBusinessruleMatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryBusinessruleMatchResponse:
        """
        Description: 查询规则匹配情况
        Summary: 查询规则匹配情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryBusinessruleMatchResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.businessrule.match.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_businessrule_services(
        self,
        request: acopm_models.QueryBusinessruleServicesRequest,
    ) -> acopm_models.QueryBusinessruleServicesResponse:
        """
        Description: 查询当前登录人有权限的服务列表
        Summary: 查询当前登录人有权限的服务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_businessrule_services_ex(request, headers, runtime)

    async def query_businessrule_services_async(
        self,
        request: acopm_models.QueryBusinessruleServicesRequest,
    ) -> acopm_models.QueryBusinessruleServicesResponse:
        """
        Description: 查询当前登录人有权限的服务列表
        Summary: 查询当前登录人有权限的服务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_businessrule_services_ex_async(request, headers, runtime)

    def query_businessrule_services_ex(
        self,
        request: acopm_models.QueryBusinessruleServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryBusinessruleServicesResponse:
        """
        Description: 查询当前登录人有权限的服务列表
        Summary: 查询当前登录人有权限的服务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryBusinessruleServicesResponse(),
            self.do_request('1.0', 'antcloud.acopm.businessrule.services.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_businessrule_services_ex_async(
        self,
        request: acopm_models.QueryBusinessruleServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.QueryBusinessruleServicesResponse:
        """
        Description: 查询当前登录人有权限的服务列表
        Summary: 查询当前登录人有权限的服务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.QueryBusinessruleServicesResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.businessrule.services.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_businessrule_services(
        self,
        request: acopm_models.GetBusinessruleServicesRequest,
    ) -> acopm_models.GetBusinessruleServicesResponse:
        """
        Description: 查询单个服务的参数/返回等元信息
        Summary: 查询单个服务的参数/返回等元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_businessrule_services_ex(request, headers, runtime)

    async def get_businessrule_services_async(
        self,
        request: acopm_models.GetBusinessruleServicesRequest,
    ) -> acopm_models.GetBusinessruleServicesResponse:
        """
        Description: 查询单个服务的参数/返回等元信息
        Summary: 查询单个服务的参数/返回等元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_businessrule_services_ex_async(request, headers, runtime)

    def get_businessrule_services_ex(
        self,
        request: acopm_models.GetBusinessruleServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.GetBusinessruleServicesResponse:
        """
        Description: 查询单个服务的参数/返回等元信息
        Summary: 查询单个服务的参数/返回等元信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.GetBusinessruleServicesResponse(),
            self.do_request('1.0', 'antcloud.acopm.businessrule.services.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_businessrule_services_ex_async(
        self,
        request: acopm_models.GetBusinessruleServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.GetBusinessruleServicesResponse:
        """
        Description: 查询单个服务的参数/返回等元信息
        Summary: 查询单个服务的参数/返回等元信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.GetBusinessruleServicesResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.businessrule.services.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_instance(
        self,
        request: acopm_models.UpdateInstanceRequest,
    ) -> acopm_models.UpdateInstanceResponse:
        """
        Description: 实例更新
        Summary: 实例更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_instance_ex(request, headers, runtime)

    async def update_instance_async(
        self,
        request: acopm_models.UpdateInstanceRequest,
    ) -> acopm_models.UpdateInstanceResponse:
        """
        Description: 实例更新
        Summary: 实例更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_instance_ex_async(request, headers, runtime)

    def update_instance_ex(
        self,
        request: acopm_models.UpdateInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateInstanceResponse:
        """
        Description: 实例更新
        Summary: 实例更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateInstanceResponse(),
            self.do_request('1.0', 'antcloud.acopm.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_instance_ex_async(
        self,
        request: acopm_models.UpdateInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateInstanceResponse:
        """
        Description: 实例更新
        Summary: 实例更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_instance_tenant(
        self,
        request: acopm_models.UpdateInstanceTenantRequest,
    ) -> acopm_models.UpdateInstanceTenantResponse:
        """
        Description: 租户实例更新
        Summary: 租户实例更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_instance_tenant_ex(request, headers, runtime)

    async def update_instance_tenant_async(
        self,
        request: acopm_models.UpdateInstanceTenantRequest,
    ) -> acopm_models.UpdateInstanceTenantResponse:
        """
        Description: 租户实例更新
        Summary: 租户实例更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_instance_tenant_ex_async(request, headers, runtime)

    def update_instance_tenant_ex(
        self,
        request: acopm_models.UpdateInstanceTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateInstanceTenantResponse:
        """
        Description: 租户实例更新
        Summary: 租户实例更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateInstanceTenantResponse(),
            self.do_request('1.0', 'antcloud.acopm.instance.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_instance_tenant_ex_async(
        self,
        request: acopm_models.UpdateInstanceTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.UpdateInstanceTenantResponse:
        """
        Description: 租户实例更新
        Summary: 租户实例更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.UpdateInstanceTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.instance.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_multi_sdk(
        self,
        request: acopm_models.CallbackMultiSdkRequest,
    ) -> acopm_models.CallbackMultiSdkResponse:
        """
        Description: 个人工作台-阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_multi_sdk_ex(request, headers, runtime)

    async def callback_multi_sdk_async(
        self,
        request: acopm_models.CallbackMultiSdkRequest,
    ) -> acopm_models.CallbackMultiSdkResponse:
        """
        Description: 个人工作台-阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_multi_sdk_ex_async(request, headers, runtime)

    def callback_multi_sdk_ex(
        self,
        request: acopm_models.CallbackMultiSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CallbackMultiSdkResponse:
        """
        Description: 个人工作台-阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CallbackMultiSdkResponse(),
            self.do_request('1.0', 'antcloud.acopm.multi.sdk.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_multi_sdk_ex_async(
        self,
        request: acopm_models.CallbackMultiSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.CallbackMultiSdkResponse:
        """
        Description: 个人工作台-阿里云Tea多语言SDK生成回调
        Summary: 阿里云Tea多语言SDK生成回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.CallbackMultiSdkResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.multi.sdk.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_product_redis(
        self,
        request: acopm_models.ResetProductRedisRequest,
    ) -> acopm_models.ResetProductRedisResponse:
        """
        Description: 产品码redis刷新
        Summary: 产品码redis刷新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_product_redis_ex(request, headers, runtime)

    async def reset_product_redis_async(
        self,
        request: acopm_models.ResetProductRedisRequest,
    ) -> acopm_models.ResetProductRedisResponse:
        """
        Description: 产品码redis刷新
        Summary: 产品码redis刷新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_product_redis_ex_async(request, headers, runtime)

    def reset_product_redis_ex(
        self,
        request: acopm_models.ResetProductRedisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ResetProductRedisResponse:
        """
        Description: 产品码redis刷新
        Summary: 产品码redis刷新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ResetProductRedisResponse(),
            self.do_request('1.0', 'antcloud.acopm.product.redis.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_product_redis_ex_async(
        self,
        request: acopm_models.ResetProductRedisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> acopm_models.ResetProductRedisResponse:
        """
        Description: 产品码redis刷新
        Summary: 产品码redis刷新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            acopm_models.ResetProductRedisResponse(),
            await self.do_request_async('1.0', 'antcloud.acopm.product.redis.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
