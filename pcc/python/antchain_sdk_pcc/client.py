# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_pcc import models as pcc_models
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
        config: pcc_models.Config,
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
            # 约束条件列表
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
                    'sdk_version': '1.3.7'
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
            # 约束条件列表
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
                    'sdk_version': '1.3.7'
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

    def query_product(
        self,
        request: pcc_models.QueryProductRequest,
    ) -> pcc_models.QueryProductResponse:
        """
        Description: 产品列表查询接口
        Summary: 产品列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_product_ex(request, headers, runtime)

    async def query_product_async(
        self,
        request: pcc_models.QueryProductRequest,
    ) -> pcc_models.QueryProductResponse:
        """
        Description: 产品列表查询接口
        Summary: 产品列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_product_ex_async(request, headers, runtime)

    def query_product_ex(
        self,
        request: pcc_models.QueryProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.QueryProductResponse:
        """
        Description: 产品列表查询接口
        Summary: 产品列表查询接口
        """
        UtilClient.validate_model(request)
        return pcc_models.QueryProductResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_product_ex_async(
        self,
        request: pcc_models.QueryProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.QueryProductResponse:
        """
        Description: 产品列表查询接口
        Summary: 产品列表查询接口
        """
        UtilClient.validate_model(request)
        return pcc_models.QueryProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_commodity_config(
        self,
        request: pcc_models.ExportCommodityConfigRequest,
    ) -> pcc_models.ExportCommodityConfigResponse:
        """
        Description: 导出商品配置数据，用于同步线上数据到线下
        Summary: 导出商品配置数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_commodity_config_ex(request, headers, runtime)

    async def export_commodity_config_async(
        self,
        request: pcc_models.ExportCommodityConfigRequest,
    ) -> pcc_models.ExportCommodityConfigResponse:
        """
        Description: 导出商品配置数据，用于同步线上数据到线下
        Summary: 导出商品配置数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_commodity_config_ex_async(request, headers, runtime)

    def export_commodity_config_ex(
        self,
        request: pcc_models.ExportCommodityConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.ExportCommodityConfigResponse:
        """
        Description: 导出商品配置数据，用于同步线上数据到线下
        Summary: 导出商品配置数据
        """
        UtilClient.validate_model(request)
        return pcc_models.ExportCommodityConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.commodity.config.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_commodity_config_ex_async(
        self,
        request: pcc_models.ExportCommodityConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.ExportCommodityConfigResponse:
        """
        Description: 导出商品配置数据，用于同步线上数据到线下
        Summary: 导出商品配置数据
        """
        UtilClient.validate_model(request)
        return pcc_models.ExportCommodityConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.commodity.config.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_commodity(
        self,
        request: pcc_models.PagequeryCommodityRequest,
    ) -> pcc_models.PagequeryCommodityResponse:
        """
        Description: 分页查询智科商品列表
        Summary: 分页查询智科商品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_commodity_ex(request, headers, runtime)

    async def pagequery_commodity_async(
        self,
        request: pcc_models.PagequeryCommodityRequest,
    ) -> pcc_models.PagequeryCommodityResponse:
        """
        Description: 分页查询智科商品列表
        Summary: 分页查询智科商品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_commodity_ex_async(request, headers, runtime)

    def pagequery_commodity_ex(
        self,
        request: pcc_models.PagequeryCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.PagequeryCommodityResponse:
        """
        Description: 分页查询智科商品列表
        Summary: 分页查询智科商品列表
        """
        UtilClient.validate_model(request)
        return pcc_models.PagequeryCommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.commodity.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_commodity_ex_async(
        self,
        request: pcc_models.PagequeryCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.PagequeryCommodityResponse:
        """
        Description: 分页查询智科商品列表
        Summary: 分页查询智科商品列表
        """
        UtilClient.validate_model(request)
        return pcc_models.PagequeryCommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.commodity.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_product(
        self,
        request: pcc_models.ImportProductRequest,
    ) -> pcc_models.ImportProductResponse:
        """
        Description: 外部调用创建l3
        Summary: 外部调用创建l3
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_product_ex(request, headers, runtime)

    async def import_product_async(
        self,
        request: pcc_models.ImportProductRequest,
    ) -> pcc_models.ImportProductResponse:
        """
        Description: 外部调用创建l3
        Summary: 外部调用创建l3
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_product_ex_async(request, headers, runtime)

    def import_product_ex(
        self,
        request: pcc_models.ImportProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.ImportProductResponse:
        """
        Description: 外部调用创建l3
        Summary: 外部调用创建l3
        """
        UtilClient.validate_model(request)
        return pcc_models.ImportProductResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.product.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_product_ex_async(
        self,
        request: pcc_models.ImportProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.ImportProductResponse:
        """
        Description: 外部调用创建l3
        Summary: 外部调用创建l3
        """
        UtilClient.validate_model(request)
        return pcc_models.ImportProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.product.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_commodity(
        self,
        request: pcc_models.QueryCommodityRequest,
    ) -> pcc_models.QueryCommodityResponse:
        """
        Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
        Summary: 按照商品名称模糊搜索商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_commodity_ex(request, headers, runtime)

    async def query_commodity_async(
        self,
        request: pcc_models.QueryCommodityRequest,
    ) -> pcc_models.QueryCommodityResponse:
        """
        Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
        Summary: 按照商品名称模糊搜索商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_commodity_ex_async(request, headers, runtime)

    def query_commodity_ex(
        self,
        request: pcc_models.QueryCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.QueryCommodityResponse:
        """
        Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
        Summary: 按照商品名称模糊搜索商品
        """
        UtilClient.validate_model(request)
        return pcc_models.QueryCommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.commodity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_commodity_ex_async(
        self,
        request: pcc_models.QueryCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.QueryCommodityResponse:
        """
        Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
        Summary: 按照商品名称模糊搜索商品
        """
        UtilClient.validate_model(request)
        return pcc_models.QueryCommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.commodity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_commodity_access(
        self,
        request: pcc_models.BindCommodityAccessRequest,
    ) -> pcc_models.BindCommodityAccessResponse:
        """
        Description: 商品绑定服务接入码access_code
        Summary: 商品绑定服务接入码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_commodity_access_ex(request, headers, runtime)

    async def bind_commodity_access_async(
        self,
        request: pcc_models.BindCommodityAccessRequest,
    ) -> pcc_models.BindCommodityAccessResponse:
        """
        Description: 商品绑定服务接入码access_code
        Summary: 商品绑定服务接入码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_commodity_access_ex_async(request, headers, runtime)

    def bind_commodity_access_ex(
        self,
        request: pcc_models.BindCommodityAccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.BindCommodityAccessResponse:
        """
        Description: 商品绑定服务接入码access_code
        Summary: 商品绑定服务接入码
        """
        UtilClient.validate_model(request)
        return pcc_models.BindCommodityAccessResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.commodity.access.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_commodity_access_ex_async(
        self,
        request: pcc_models.BindCommodityAccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.BindCommodityAccessResponse:
        """
        Description: 商品绑定服务接入码access_code
        Summary: 商品绑定服务接入码
        """
        UtilClient.validate_model(request)
        return pcc_models.BindCommodityAccessResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.commodity.access.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_product_line(
        self,
        request: pcc_models.QueryProductLineRequest,
    ) -> pcc_models.QueryProductLineResponse:
        """
        Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
        Summary: 查询产品树
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_product_line_ex(request, headers, runtime)

    async def query_product_line_async(
        self,
        request: pcc_models.QueryProductLineRequest,
    ) -> pcc_models.QueryProductLineResponse:
        """
        Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
        Summary: 查询产品树
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_product_line_ex_async(request, headers, runtime)

    def query_product_line_ex(
        self,
        request: pcc_models.QueryProductLineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.QueryProductLineResponse:
        """
        Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
        Summary: 查询产品树
        """
        UtilClient.validate_model(request)
        return pcc_models.QueryProductLineResponse().from_map(
            self.do_request('1.0', 'antcloud.pcc.product.line.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_product_line_ex_async(
        self,
        request: pcc_models.QueryProductLineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> pcc_models.QueryProductLineResponse:
        """
        Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
        Summary: 查询产品树
        """
        UtilClient.validate_model(request)
        return pcc_models.QueryProductLineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.pcc.product.line.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
