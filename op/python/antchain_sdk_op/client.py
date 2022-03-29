# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_op import models as op_models
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
        config: op_models.Config,
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
            # 数组元素类型
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
                    'sdk_version': '3.2.3'
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
            # 数组元素类型
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
                    'sdk_version': '3.2.3'
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

    def query_apiservice(
        self,
        request: op_models.QueryApiserviceRequest,
    ) -> op_models.QueryApiserviceResponse:
        """
        Description: 查询api详情
        Summary: 查询api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apiservice_ex(request, headers, runtime)

    async def query_apiservice_async(
        self,
        request: op_models.QueryApiserviceRequest,
    ) -> op_models.QueryApiserviceResponse:
        """
        Description: 查询api详情
        Summary: 查询api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apiservice_ex_async(request, headers, runtime)

    def query_apiservice_ex(
        self,
        request: op_models.QueryApiserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.QueryApiserviceResponse:
        """
        Description: 查询api详情
        Summary: 查询api
        """
        UtilClient.validate_model(request)
        return op_models.QueryApiserviceResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.apiservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apiservice_ex_async(
        self,
        request: op_models.QueryApiserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.QueryApiserviceResponse:
        """
        Description: 查询api详情
        Summary: 查询api
        """
        UtilClient.validate_model(request)
        return op_models.QueryApiserviceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.apiservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_apiservice(
        self,
        request: op_models.ImportApiserviceRequest,
    ) -> op_models.ImportApiserviceResponse:
        """
        Description: 导入api信息
        Summary: 导入api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_apiservice_ex(request, headers, runtime)

    async def import_apiservice_async(
        self,
        request: op_models.ImportApiserviceRequest,
    ) -> op_models.ImportApiserviceResponse:
        """
        Description: 导入api信息
        Summary: 导入api信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_apiservice_ex_async(request, headers, runtime)

    def import_apiservice_ex(
        self,
        request: op_models.ImportApiserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportApiserviceResponse:
        """
        Description: 导入api信息
        Summary: 导入api信息
        """
        UtilClient.validate_model(request)
        return op_models.ImportApiserviceResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.apiservice.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_apiservice_ex_async(
        self,
        request: op_models.ImportApiserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportApiserviceResponse:
        """
        Description: 导入api信息
        Summary: 导入api信息
        """
        UtilClient.validate_model(request)
        return op_models.ImportApiserviceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.apiservice.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apiservice_product(
        self,
        request: op_models.CreateApiserviceProductRequest,
    ) -> op_models.CreateApiserviceProductResponse:
        """
        Description: 调用apicore创建产品
        Summary: 创建产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apiservice_product_ex(request, headers, runtime)

    async def create_apiservice_product_async(
        self,
        request: op_models.CreateApiserviceProductRequest,
    ) -> op_models.CreateApiserviceProductResponse:
        """
        Description: 调用apicore创建产品
        Summary: 创建产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apiservice_product_ex_async(request, headers, runtime)

    def create_apiservice_product_ex(
        self,
        request: op_models.CreateApiserviceProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateApiserviceProductResponse:
        """
        Description: 调用apicore创建产品
        Summary: 创建产品
        """
        UtilClient.validate_model(request)
        return op_models.CreateApiserviceProductResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.apiservice.product.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apiservice_product_ex_async(
        self,
        request: op_models.CreateApiserviceProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateApiserviceProductResponse:
        """
        Description: 调用apicore创建产品
        Summary: 创建产品
        """
        UtilClient.validate_model(request)
        return op_models.CreateApiserviceProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.apiservice.product.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apiservice_group(
        self,
        request: op_models.CreateApiserviceGroupRequest,
    ) -> op_models.CreateApiserviceGroupResponse:
        """
        Description: 创建分组
        Summary: 创建分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apiservice_group_ex(request, headers, runtime)

    async def create_apiservice_group_async(
        self,
        request: op_models.CreateApiserviceGroupRequest,
    ) -> op_models.CreateApiserviceGroupResponse:
        """
        Description: 创建分组
        Summary: 创建分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apiservice_group_ex_async(request, headers, runtime)

    def create_apiservice_group_ex(
        self,
        request: op_models.CreateApiserviceGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateApiserviceGroupResponse:
        """
        Description: 创建分组
        Summary: 创建分组
        """
        UtilClient.validate_model(request)
        return op_models.CreateApiserviceGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.apiservice.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apiservice_group_ex_async(
        self,
        request: op_models.CreateApiserviceGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateApiserviceGroupResponse:
        """
        Description: 创建分组
        Summary: 创建分组
        """
        UtilClient.validate_model(request)
        return op_models.CreateApiserviceGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.apiservice.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apiservice_suite(
        self,
        request: op_models.CreateApiserviceSuiteRequest,
    ) -> op_models.CreateApiserviceSuiteResponse:
        """
        Description: 创建suite
        Summary: 创建suite
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apiservice_suite_ex(request, headers, runtime)

    async def create_apiservice_suite_async(
        self,
        request: op_models.CreateApiserviceSuiteRequest,
    ) -> op_models.CreateApiserviceSuiteResponse:
        """
        Description: 创建suite
        Summary: 创建suite
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apiservice_suite_ex_async(request, headers, runtime)

    def create_apiservice_suite_ex(
        self,
        request: op_models.CreateApiserviceSuiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateApiserviceSuiteResponse:
        """
        Description: 创建suite
        Summary: 创建suite
        """
        UtilClient.validate_model(request)
        return op_models.CreateApiserviceSuiteResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.apiservice.suite.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apiservice_suite_ex_async(
        self,
        request: op_models.CreateApiserviceSuiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateApiserviceSuiteResponse:
        """
        Description: 创建suite
        Summary: 创建suite
        """
        UtilClient.validate_model(request)
        return op_models.CreateApiserviceSuiteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.apiservice.suite.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_spec(
        self,
        request: op_models.ImportSpecRequest,
    ) -> op_models.ImportSpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_spec_ex(request, headers, runtime)

    async def import_spec_async(
        self,
        request: op_models.ImportSpecRequest,
    ) -> op_models.ImportSpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_spec_ex_async(request, headers, runtime)

    def import_spec_ex(
        self,
        request: op_models.ImportSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportSpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        UtilClient.validate_model(request)
        return op_models.ImportSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.spec.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_spec_ex_async(
        self,
        request: op_models.ImportSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportSpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        UtilClient.validate_model(request)
        return op_models.ImportSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.spec.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_spec(
        self,
        request: op_models.ExportSpecRequest,
    ) -> op_models.ExportSpecResponse:
        """
        Description: 导出Spec
        Summary: 导出Spec
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_spec_ex(request, headers, runtime)

    async def export_spec_async(
        self,
        request: op_models.ExportSpecRequest,
    ) -> op_models.ExportSpecResponse:
        """
        Description: 导出Spec
        Summary: 导出Spec
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_spec_ex_async(request, headers, runtime)

    def export_spec_ex(
        self,
        request: op_models.ExportSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ExportSpecResponse:
        """
        Description: 导出Spec
        Summary: 导出Spec
        """
        UtilClient.validate_model(request)
        return op_models.ExportSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.spec.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_spec_ex_async(
        self,
        request: op_models.ExportSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ExportSpecResponse:
        """
        Description: 导出Spec
        Summary: 导出Spec
        """
        UtilClient.validate_model(request)
        return op_models.ExportSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.spec.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_provider(
        self,
        request: op_models.GetProviderRequest,
    ) -> op_models.GetProviderResponse:
        """
        Description: 获取OpenAPI提供方详情
        Summary: 获取OpenAPI提供方详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_provider_ex(request, headers, runtime)

    async def get_provider_async(
        self,
        request: op_models.GetProviderRequest,
    ) -> op_models.GetProviderResponse:
        """
        Description: 获取OpenAPI提供方详情
        Summary: 获取OpenAPI提供方详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_provider_ex_async(request, headers, runtime)

    def get_provider_ex(
        self,
        request: op_models.GetProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.GetProviderResponse:
        """
        Description: 获取OpenAPI提供方详情
        Summary: 获取OpenAPI提供方详情
        """
        UtilClient.validate_model(request)
        return op_models.GetProviderResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.provider.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_provider_ex_async(
        self,
        request: op_models.GetProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.GetProviderResponse:
        """
        Description: 获取OpenAPI提供方详情
        Summary: 获取OpenAPI提供方详情
        """
        UtilClient.validate_model(request)
        return op_models.GetProviderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.provider.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_channelapi(
        self,
        request: op_models.ImportChannelapiRequest,
    ) -> op_models.ImportChannelapiResponse:
        """
        Description: 渠道API导入
        Summary: 渠道API导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_channelapi_ex(request, headers, runtime)

    async def import_channelapi_async(
        self,
        request: op_models.ImportChannelapiRequest,
    ) -> op_models.ImportChannelapiResponse:
        """
        Description: 渠道API导入
        Summary: 渠道API导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_channelapi_ex_async(request, headers, runtime)

    def import_channelapi_ex(
        self,
        request: op_models.ImportChannelapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportChannelapiResponse:
        """
        Description: 渠道API导入
        Summary: 渠道API导入
        """
        UtilClient.validate_model(request)
        return op_models.ImportChannelapiResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.channelapi.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_channelapi_ex_async(
        self,
        request: op_models.ImportChannelapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportChannelapiResponse:
        """
        Description: 渠道API导入
        Summary: 渠道API导入
        """
        UtilClient.validate_model(request)
        return op_models.ImportChannelapiResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.channelapi.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def service_gateway_check(
        self,
        request: op_models.ServiceGatewayCheckRequest,
    ) -> op_models.ServiceGatewayCheckResponse:
        """
        Description: 检测金融云网关目前的健康状态
        Summary: 网关健康检查1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.service_gateway_check_ex(request, headers, runtime)

    async def service_gateway_check_async(
        self,
        request: op_models.ServiceGatewayCheckRequest,
    ) -> op_models.ServiceGatewayCheckResponse:
        """
        Description: 检测金融云网关目前的健康状态
        Summary: 网关健康检查1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.service_gateway_check_ex_async(request, headers, runtime)

    def service_gateway_check_ex(
        self,
        request: op_models.ServiceGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ServiceGatewayCheckResponse:
        """
        Description: 检测金融云网关目前的健康状态
        Summary: 网关健康检查1
        """
        UtilClient.validate_model(request)
        return op_models.ServiceGatewayCheckResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.gateway.check.service', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def service_gateway_check_ex_async(
        self,
        request: op_models.ServiceGatewayCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ServiceGatewayCheckResponse:
        """
        Description: 检测金融云网关目前的健康状态
        Summary: 网关健康检查1
        """
        UtilClient.validate_model(request)
        return op_models.ServiceGatewayCheckResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.gateway.check.service', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_gateway_spec(
        self,
        request: op_models.ImportGatewaySpecRequest,
    ) -> op_models.ImportGatewaySpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_gateway_spec_ex(request, headers, runtime)

    async def import_gateway_spec_async(
        self,
        request: op_models.ImportGatewaySpecRequest,
    ) -> op_models.ImportGatewaySpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_gateway_spec_ex_async(request, headers, runtime)

    def import_gateway_spec_ex(
        self,
        request: op_models.ImportGatewaySpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportGatewaySpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        UtilClient.validate_model(request)
        return op_models.ImportGatewaySpecResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.gateway.spec.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_gateway_spec_ex_async(
        self,
        request: op_models.ImportGatewaySpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportGatewaySpecResponse:
        """
        Description: 通过XML Spec形式导入产品的API配置
        Summary: 导入API配置
        """
        UtilClient.validate_model(request)
        return op_models.ImportGatewaySpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.gateway.spec.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_gateway_clusterhost(
        self,
        request: op_models.UpdateGatewayClusterhostRequest,
    ) -> op_models.UpdateGatewayClusterhostResponse:
        """
        Description: 更新集群路由host
        Summary: 更新集群路由host
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_gateway_clusterhost_ex(request, headers, runtime)

    async def update_gateway_clusterhost_async(
        self,
        request: op_models.UpdateGatewayClusterhostRequest,
    ) -> op_models.UpdateGatewayClusterhostResponse:
        """
        Description: 更新集群路由host
        Summary: 更新集群路由host
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_gateway_clusterhost_ex_async(request, headers, runtime)

    def update_gateway_clusterhost_ex(
        self,
        request: op_models.UpdateGatewayClusterhostRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.UpdateGatewayClusterhostResponse:
        """
        Description: 更新集群路由host
        Summary: 更新集群路由host
        """
        UtilClient.validate_model(request)
        return op_models.UpdateGatewayClusterhostResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.gateway.clusterhost.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_gateway_clusterhost_ex_async(
        self,
        request: op_models.UpdateGatewayClusterhostRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.UpdateGatewayClusterhostResponse:
        """
        Description: 更新集群路由host
        Summary: 更新集群路由host
        """
        UtilClient.validate_model(request)
        return op_models.UpdateGatewayClusterhostResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.gateway.clusterhost.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_gateway_staticrouter(
        self,
        request: op_models.CreateGatewayStaticrouterRequest,
    ) -> op_models.CreateGatewayStaticrouterResponse:
        """
        Description: 创建静态路由
        Summary: 创建静态路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_gateway_staticrouter_ex(request, headers, runtime)

    async def create_gateway_staticrouter_async(
        self,
        request: op_models.CreateGatewayStaticrouterRequest,
    ) -> op_models.CreateGatewayStaticrouterResponse:
        """
        Description: 创建静态路由
        Summary: 创建静态路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_gateway_staticrouter_ex_async(request, headers, runtime)

    def create_gateway_staticrouter_ex(
        self,
        request: op_models.CreateGatewayStaticrouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateGatewayStaticrouterResponse:
        """
        Description: 创建静态路由
        Summary: 创建静态路由
        """
        UtilClient.validate_model(request)
        return op_models.CreateGatewayStaticrouterResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.gateway.staticrouter.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_gateway_staticrouter_ex_async(
        self,
        request: op_models.CreateGatewayStaticrouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.CreateGatewayStaticrouterResponse:
        """
        Description: 创建静态路由
        Summary: 创建静态路由
        """
        UtilClient.validate_model(request)
        return op_models.CreateGatewayStaticrouterResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.gateway.staticrouter.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_clusterhost(
        self,
        request: op_models.QueryGatewayClusterhostRequest,
    ) -> op_models.QueryGatewayClusterhostResponse:
        """
        Description: 查询集群路由host
        Summary: 查询集群路由host
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_clusterhost_ex(request, headers, runtime)

    async def query_gateway_clusterhost_async(
        self,
        request: op_models.QueryGatewayClusterhostRequest,
    ) -> op_models.QueryGatewayClusterhostResponse:
        """
        Description: 查询集群路由host
        Summary: 查询集群路由host
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_clusterhost_ex_async(request, headers, runtime)

    def query_gateway_clusterhost_ex(
        self,
        request: op_models.QueryGatewayClusterhostRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.QueryGatewayClusterhostResponse:
        """
        Description: 查询集群路由host
        Summary: 查询集群路由host
        """
        UtilClient.validate_model(request)
        return op_models.QueryGatewayClusterhostResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.gateway.clusterhost.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_clusterhost_ex_async(
        self,
        request: op_models.QueryGatewayClusterhostRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.QueryGatewayClusterhostResponse:
        """
        Description: 查询集群路由host
        Summary: 查询集群路由host
        """
        UtilClient.validate_model(request)
        return op_models.QueryGatewayClusterhostResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.gateway.clusterhost.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_sdk(
        self,
        request: op_models.ImportSdkRequest,
    ) -> op_models.ImportSdkResponse:
        """
        Description: 导入SDK信息
        Summary: 导入SDK信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_sdk_ex(request, headers, runtime)

    async def import_sdk_async(
        self,
        request: op_models.ImportSdkRequest,
    ) -> op_models.ImportSdkResponse:
        """
        Description: 导入SDK信息
        Summary: 导入SDK信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_sdk_ex_async(request, headers, runtime)

    def import_sdk_ex(
        self,
        request: op_models.ImportSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportSdkResponse:
        """
        Description: 导入SDK信息
        Summary: 导入SDK信息
        """
        UtilClient.validate_model(request)
        return op_models.ImportSdkResponse().from_map(
            self.do_request('1.0', 'antcloud.openapi.sdk.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_sdk_ex_async(
        self,
        request: op_models.ImportSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> op_models.ImportSdkResponse:
        """
        Description: 导入SDK信息
        Summary: 导入SDK信息
        """
        UtilClient.validate_model(request)
        return op_models.ImportSdkResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.openapi.sdk.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
