# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_trade import models as trade_models
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
        config: trade_models.Config,
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
            # 商品属性结构
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
                    'sdk_version': '3.6.3'
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
            # 商品属性结构
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
                    'sdk_version': '3.6.3'
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

    def query_instance_capacity(
        self,
        request: trade_models.QueryInstanceCapacityRequest,
    ) -> trade_models.QueryInstanceCapacityResponse:
        """
        Description: 查询租户实例容量信息
        Summary: 查询租户实例容量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_instance_capacity_ex(request, headers, runtime)

    async def query_instance_capacity_async(
        self,
        request: trade_models.QueryInstanceCapacityRequest,
    ) -> trade_models.QueryInstanceCapacityResponse:
        """
        Description: 查询租户实例容量信息
        Summary: 查询租户实例容量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_instance_capacity_ex_async(request, headers, runtime)

    def query_instance_capacity_ex(
        self,
        request: trade_models.QueryInstanceCapacityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryInstanceCapacityResponse:
        """
        Description: 查询租户实例容量信息
        Summary: 查询租户实例容量信息
        """
        UtilClient.validate_model(request)
        return trade_models.QueryInstanceCapacityResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.instance.capacity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_instance_capacity_ex_async(
        self,
        request: trade_models.QueryInstanceCapacityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryInstanceCapacityResponse:
        """
        Description: 查询租户实例容量信息
        Summary: 查询租户实例容量信息
        """
        UtilClient.validate_model(request)
        return trade_models.QueryInstanceCapacityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.instance.capacity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_marketing_coupon(
        self,
        request: trade_models.QueryMarketingCouponRequest,
    ) -> trade_models.QueryMarketingCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_marketing_coupon_ex(request, headers, runtime)

    async def query_marketing_coupon_async(
        self,
        request: trade_models.QueryMarketingCouponRequest,
    ) -> trade_models.QueryMarketingCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_marketing_coupon_ex_async(request, headers, runtime)

    def query_marketing_coupon_ex(
        self,
        request: trade_models.QueryMarketingCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryMarketingCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryMarketingCouponResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.marketing.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_marketing_coupon_ex_async(
        self,
        request: trade_models.QueryMarketingCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryMarketingCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryMarketingCouponResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.marketing.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_marketing_coupon(
        self,
        request: trade_models.SendMarketingCouponRequest,
    ) -> trade_models.SendMarketingCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_marketing_coupon_ex(request, headers, runtime)

    async def send_marketing_coupon_async(
        self,
        request: trade_models.SendMarketingCouponRequest,
    ) -> trade_models.SendMarketingCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_marketing_coupon_ex_async(request, headers, runtime)

    def send_marketing_coupon_ex(
        self,
        request: trade_models.SendMarketingCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.SendMarketingCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        UtilClient.validate_model(request)
        return trade_models.SendMarketingCouponResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.marketing.coupon.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_marketing_coupon_ex_async(
        self,
        request: trade_models.SendMarketingCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.SendMarketingCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        UtilClient.validate_model(request)
        return trade_models.SendMarketingCouponResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.marketing.coupon.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_order_after(
        self,
        request: trade_models.CreateOrderAfterRequest,
    ) -> trade_models.CreateOrderAfterResponse:
        """
        Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
        Summary: 开通类商品自动下单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_order_after_ex(request, headers, runtime)

    async def create_order_after_async(
        self,
        request: trade_models.CreateOrderAfterRequest,
    ) -> trade_models.CreateOrderAfterResponse:
        """
        Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
        Summary: 开通类商品自动下单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_order_after_ex_async(request, headers, runtime)

    def create_order_after_ex(
        self,
        request: trade_models.CreateOrderAfterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateOrderAfterResponse:
        """
        Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
        Summary: 开通类商品自动下单接口
        """
        UtilClient.validate_model(request)
        return trade_models.CreateOrderAfterResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.order.after.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_order_after_ex_async(
        self,
        request: trade_models.CreateOrderAfterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateOrderAfterResponse:
        """
        Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
        Summary: 开通类商品自动下单接口
        """
        UtilClient.validate_model(request)
        return trade_models.CreateOrderAfterResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.order.after.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_order_workflow(
        self,
        request: trade_models.CreateOrderWorkflowRequest,
    ) -> trade_models.CreateOrderWorkflowResponse:
        """
        Description: 流程编排，创建商品开通接口
        Summary: 能力编排-商品开通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_order_workflow_ex(request, headers, runtime)

    async def create_order_workflow_async(
        self,
        request: trade_models.CreateOrderWorkflowRequest,
    ) -> trade_models.CreateOrderWorkflowResponse:
        """
        Description: 流程编排，创建商品开通接口
        Summary: 能力编排-商品开通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_order_workflow_ex_async(request, headers, runtime)

    def create_order_workflow_ex(
        self,
        request: trade_models.CreateOrderWorkflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateOrderWorkflowResponse:
        """
        Description: 流程编排，创建商品开通接口
        Summary: 能力编排-商品开通
        """
        UtilClient.validate_model(request)
        return trade_models.CreateOrderWorkflowResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.order.workflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_order_workflow_ex_async(
        self,
        request: trade_models.CreateOrderWorkflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateOrderWorkflowResponse:
        """
        Description: 流程编排，创建商品开通接口
        Summary: 能力编排-商品开通
        """
        UtilClient.validate_model(request)
        return trade_models.CreateOrderWorkflowResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.order.workflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_combo(
        self,
        request: trade_models.GetComboRequest,
    ) -> trade_models.GetComboResponse:
        """
        Description: 获取套餐详情接口
        Summary: 获取套餐详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_combo_ex(request, headers, runtime)

    async def get_combo_async(
        self,
        request: trade_models.GetComboRequest,
    ) -> trade_models.GetComboResponse:
        """
        Description: 获取套餐详情接口
        Summary: 获取套餐详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_combo_ex_async(request, headers, runtime)

    def get_combo_ex(
        self,
        request: trade_models.GetComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.GetComboResponse:
        """
        Description: 获取套餐详情接口
        Summary: 获取套餐详情
        """
        UtilClient.validate_model(request)
        return trade_models.GetComboResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.combo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_combo_ex_async(
        self,
        request: trade_models.GetComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.GetComboResponse:
        """
        Description: 获取套餐详情接口
        Summary: 获取套餐详情
        """
        UtilClient.validate_model(request)
        return trade_models.GetComboResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.combo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_combo_price(
        self,
        request: trade_models.QueryComboPriceRequest,
    ) -> trade_models.QueryComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_combo_price_ex(request, headers, runtime)

    async def query_combo_price_async(
        self,
        request: trade_models.QueryComboPriceRequest,
    ) -> trade_models.QueryComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_combo_price_ex_async(request, headers, runtime)

    def query_combo_price_ex(
        self,
        request: trade_models.QueryComboPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryComboPriceResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.combo.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_combo_price_ex_async(
        self,
        request: trade_models.QueryComboPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryComboPriceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.combo.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_combo_order(
        self,
        request: trade_models.CreateComboOrderRequest,
    ) -> trade_models.CreateComboOrderResponse:
        """
        Description: 套餐下单接口，支持部分渠道的自动支付
        Summary: 套餐下单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_combo_order_ex(request, headers, runtime)

    async def create_combo_order_async(
        self,
        request: trade_models.CreateComboOrderRequest,
    ) -> trade_models.CreateComboOrderResponse:
        """
        Description: 套餐下单接口，支持部分渠道的自动支付
        Summary: 套餐下单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_combo_order_ex_async(request, headers, runtime)

    def create_combo_order_ex(
        self,
        request: trade_models.CreateComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateComboOrderResponse:
        """
        Description: 套餐下单接口，支持部分渠道的自动支付
        Summary: 套餐下单接口
        """
        UtilClient.validate_model(request)
        return trade_models.CreateComboOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.combo.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_combo_order_ex_async(
        self,
        request: trade_models.CreateComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateComboOrderResponse:
        """
        Description: 套餐下单接口，支持部分渠道的自动支付
        Summary: 套餐下单接口
        """
        UtilClient.validate_model(request)
        return trade_models.CreateComboOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.combo.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_combo_order(
        self,
        request: trade_models.QueryComboOrderRequest,
    ) -> trade_models.QueryComboOrderResponse:
        """
        Description: 套餐订单列表分页查询接口
        Summary: 套餐订单列表分页查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_combo_order_ex(request, headers, runtime)

    async def query_combo_order_async(
        self,
        request: trade_models.QueryComboOrderRequest,
    ) -> trade_models.QueryComboOrderResponse:
        """
        Description: 套餐订单列表分页查询接口
        Summary: 套餐订单列表分页查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_combo_order_ex_async(request, headers, runtime)

    def query_combo_order_ex(
        self,
        request: trade_models.QueryComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryComboOrderResponse:
        """
        Description: 套餐订单列表分页查询接口
        Summary: 套餐订单列表分页查询接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryComboOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.combo.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_combo_order_ex_async(
        self,
        request: trade_models.QueryComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryComboOrderResponse:
        """
        Description: 套餐订单列表分页查询接口
        Summary: 套餐订单列表分页查询接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryComboOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.combo.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_combo(
        self,
        request: trade_models.QueryComboRequest,
    ) -> trade_models.QueryComboResponse:
        """
        Description: 查询套餐列表，支持分页查询
        Summary: 查询套餐列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_combo_ex(request, headers, runtime)

    async def query_combo_async(
        self,
        request: trade_models.QueryComboRequest,
    ) -> trade_models.QueryComboResponse:
        """
        Description: 查询套餐列表，支持分页查询
        Summary: 查询套餐列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_combo_ex_async(request, headers, runtime)

    def query_combo_ex(
        self,
        request: trade_models.QueryComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryComboResponse:
        """
        Description: 查询套餐列表，支持分页查询
        Summary: 查询套餐列表
        """
        UtilClient.validate_model(request)
        return trade_models.QueryComboResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.combo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_combo_ex_async(
        self,
        request: trade_models.QueryComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryComboResponse:
        """
        Description: 查询套餐列表，支持分页查询
        Summary: 查询套餐列表
        """
        UtilClient.validate_model(request)
        return trade_models.QueryComboResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.combo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_combo_order(
        self,
        request: trade_models.PayComboOrderRequest,
    ) -> trade_models.PayComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_combo_order_ex(request, headers, runtime)

    async def pay_combo_order_async(
        self,
        request: trade_models.PayComboOrderRequest,
    ) -> trade_models.PayComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_combo_order_ex_async(request, headers, runtime)

    def pay_combo_order_ex(
        self,
        request: trade_models.PayComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.PayComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        UtilClient.validate_model(request)
        return trade_models.PayComboOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.combo.order.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_combo_order_ex_async(
        self,
        request: trade_models.PayComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.PayComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        UtilClient.validate_model(request)
        return trade_models.PayComboOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.combo.order.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_order(
        self,
        request: trade_models.CreateOrderRequest,
    ) -> trade_models.CreateOrderResponse:
        """
        Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
        Summary: 通用下单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_order_ex(request, headers, runtime)

    async def create_order_async(
        self,
        request: trade_models.CreateOrderRequest,
    ) -> trade_models.CreateOrderResponse:
        """
        Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
        Summary: 通用下单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_order_ex_async(request, headers, runtime)

    def create_order_ex(
        self,
        request: trade_models.CreateOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateOrderResponse:
        """
        Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
        Summary: 通用下单接口
        """
        UtilClient.validate_model(request)
        return trade_models.CreateOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_order_ex_async(
        self,
        request: trade_models.CreateOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.CreateOrderResponse:
        """
        Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
        Summary: 通用下单接口
        """
        UtilClient.validate_model(request)
        return trade_models.CreateOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_price_personalized(
        self,
        request: trade_models.ExistPricePersonalizedRequest,
    ) -> trade_models.ExistPricePersonalizedResponse:
        """
        Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
        Summary: 判断租户是否存在个性化定价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_price_personalized_ex(request, headers, runtime)

    async def exist_price_personalized_async(
        self,
        request: trade_models.ExistPricePersonalizedRequest,
    ) -> trade_models.ExistPricePersonalizedResponse:
        """
        Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
        Summary: 判断租户是否存在个性化定价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_price_personalized_ex_async(request, headers, runtime)

    def exist_price_personalized_ex(
        self,
        request: trade_models.ExistPricePersonalizedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.ExistPricePersonalizedResponse:
        """
        Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
        Summary: 判断租户是否存在个性化定价
        """
        UtilClient.validate_model(request)
        return trade_models.ExistPricePersonalizedResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.price.personalized.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_price_personalized_ex_async(
        self,
        request: trade_models.ExistPricePersonalizedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.ExistPricePersonalizedResponse:
        """
        Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
        Summary: 判断租户是否存在个性化定价
        """
        UtilClient.validate_model(request)
        return trade_models.ExistPricePersonalizedResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.price.personalized.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_price(
        self,
        request: trade_models.QueryPriceRequest,
    ) -> trade_models.QueryPriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
        Summary: 商品询价接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_price_ex(request, headers, runtime)

    async def query_price_async(
        self,
        request: trade_models.QueryPriceRequest,
    ) -> trade_models.QueryPriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
        Summary: 商品询价接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_price_ex_async(request, headers, runtime)

    def query_price_ex(
        self,
        request: trade_models.QueryPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryPriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
        Summary: 商品询价接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryPriceResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_price_ex_async(
        self,
        request: trade_models.QueryPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryPriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
        Summary: 商品询价接口
        """
        UtilClient.validate_model(request)
        return trade_models.QueryPriceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_wareslife_instance(
        self,
        request: trade_models.QueryWareslifeInstanceRequest,
    ) -> trade_models.QueryWareslifeInstanceResponse:
        """
        Description: 实例接口查询
        Summary: 实例接口查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_wareslife_instance_ex(request, headers, runtime)

    async def query_wareslife_instance_async(
        self,
        request: trade_models.QueryWareslifeInstanceRequest,
    ) -> trade_models.QueryWareslifeInstanceResponse:
        """
        Description: 实例接口查询
        Summary: 实例接口查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_wareslife_instance_ex_async(request, headers, runtime)

    def query_wareslife_instance_ex(
        self,
        request: trade_models.QueryWareslifeInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryWareslifeInstanceResponse:
        """
        Description: 实例接口查询
        Summary: 实例接口查询
        """
        UtilClient.validate_model(request)
        return trade_models.QueryWareslifeInstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.trade.wareslife.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_wareslife_instance_ex_async(
        self,
        request: trade_models.QueryWareslifeInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> trade_models.QueryWareslifeInstanceResponse:
        """
        Description: 实例接口查询
        Summary: 实例接口查询
        """
        UtilClient.validate_model(request)
        return trade_models.QueryWareslifeInstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.trade.wareslife.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
