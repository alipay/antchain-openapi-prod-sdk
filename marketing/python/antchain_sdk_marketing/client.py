# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_marketing import models as marketing_models
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
        config: marketing_models.Config,
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
            # 目录对象
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
                    'sdk_version': '1.2.0',
                    '_prod_code': 'MARKETING',
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
            # 目录对象
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
                    'sdk_version': '1.2.0',
                    '_prod_code': 'MARKETING',
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

    def query_coupon(
        self,
        request: marketing_models.QueryCouponRequest,
    ) -> marketing_models.QueryCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_coupon_ex(request, headers, runtime)

    async def query_coupon_async(
        self,
        request: marketing_models.QueryCouponRequest,
    ) -> marketing_models.QueryCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_coupon_ex_async(request, headers, runtime)

    def query_coupon_ex(
        self,
        request: marketing_models.QueryCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponResponse(),
            self.do_request('1.0', 'antcloud.marketing.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_coupon_ex_async(
        self,
        request: marketing_models.QueryCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponResponse:
        """
        Description: 优惠券列表查询接口
        Summary: 优惠券列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_coupon(
        self,
        request: marketing_models.SendCouponRequest,
    ) -> marketing_models.SendCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_coupon_ex(request, headers, runtime)

    async def send_coupon_async(
        self,
        request: marketing_models.SendCouponRequest,
    ) -> marketing_models.SendCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_coupon_ex_async(request, headers, runtime)

    def send_coupon_ex(
        self,
        request: marketing_models.SendCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SendCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SendCouponResponse(),
            self.do_request('1.0', 'antcloud.marketing.coupon.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_coupon_ex_async(
        self,
        request: marketing_models.SendCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SendCouponResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SendCouponResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.coupon.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lead_clue(
        self,
        request: marketing_models.CreateLeadClueRequest,
    ) -> marketing_models.CreateLeadClueResponse:
        """
        Description: 会员信息首次创建
        Summary: 线索数据同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lead_clue_ex(request, headers, runtime)

    async def create_lead_clue_async(
        self,
        request: marketing_models.CreateLeadClueRequest,
    ) -> marketing_models.CreateLeadClueResponse:
        """
        Description: 会员信息首次创建
        Summary: 线索数据同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lead_clue_ex_async(request, headers, runtime)

    def create_lead_clue_ex(
        self,
        request: marketing_models.CreateLeadClueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.CreateLeadClueResponse:
        """
        Description: 会员信息首次创建
        Summary: 线索数据同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.CreateLeadClueResponse(),
            self.do_request('1.0', 'antcloud.marketing.lead.clue.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lead_clue_ex_async(
        self,
        request: marketing_models.CreateLeadClueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.CreateLeadClueResponse:
        """
        Description: 会员信息首次创建
        Summary: 线索数据同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.CreateLeadClueResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.lead.clue.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_lead_business(
        self,
        request: marketing_models.AddLeadBusinessRequest,
    ) -> marketing_models.AddLeadBusinessResponse:
        """
        Description: 更新/添加商机
        Summary: 添加商机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_lead_business_ex(request, headers, runtime)

    async def add_lead_business_async(
        self,
        request: marketing_models.AddLeadBusinessRequest,
    ) -> marketing_models.AddLeadBusinessResponse:
        """
        Description: 更新/添加商机
        Summary: 添加商机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_lead_business_ex_async(request, headers, runtime)

    def add_lead_business_ex(
        self,
        request: marketing_models.AddLeadBusinessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.AddLeadBusinessResponse:
        """
        Description: 更新/添加商机
        Summary: 添加商机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.AddLeadBusinessResponse(),
            self.do_request('1.0', 'antcloud.marketing.lead.business.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_lead_business_ex_async(
        self,
        request: marketing_models.AddLeadBusinessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.AddLeadBusinessResponse:
        """
        Description: 更新/添加商机
        Summary: 添加商机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.AddLeadBusinessResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.lead.business.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_coupon_page(
        self,
        request: marketing_models.QueryCouponPageRequest,
    ) -> marketing_models.QueryCouponPageResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
        Summary: 分页查询优惠券列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_coupon_page_ex(request, headers, runtime)

    async def query_coupon_page_async(
        self,
        request: marketing_models.QueryCouponPageRequest,
    ) -> marketing_models.QueryCouponPageResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
        Summary: 分页查询优惠券列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_coupon_page_ex_async(request, headers, runtime)

    def query_coupon_page_ex(
        self,
        request: marketing_models.QueryCouponPageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponPageResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
        Summary: 分页查询优惠券列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponPageResponse(),
            self.do_request('1.0', 'antcloud.marketing.coupon.page.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_coupon_page_ex_async(
        self,
        request: marketing_models.QueryCouponPageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponPageResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
        Summary: 分页查询优惠券列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponPageResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.coupon.page.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_coupon_pagelist(
        self,
        request: marketing_models.QueryCouponPagelistRequest,
    ) -> marketing_models.QueryCouponPagelistResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
        Summary: 分页查询优惠券列表V2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_coupon_pagelist_ex(request, headers, runtime)

    async def query_coupon_pagelist_async(
        self,
        request: marketing_models.QueryCouponPagelistRequest,
    ) -> marketing_models.QueryCouponPagelistResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
        Summary: 分页查询优惠券列表V2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_coupon_pagelist_ex_async(request, headers, runtime)

    def query_coupon_pagelist_ex(
        self,
        request: marketing_models.QueryCouponPagelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponPagelistResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
        Summary: 分页查询优惠券列表V2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponPagelistResponse(),
            self.do_request('1.0', 'antcloud.marketing.coupon.pagelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_coupon_pagelist_ex_async(
        self,
        request: marketing_models.QueryCouponPagelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponPagelistResponse:
        """
        Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
        Summary: 分页查询优惠券列表V2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponPagelistResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.coupon.pagelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_youhui_template(
        self,
        request: marketing_models.QueryYouhuiTemplateRequest,
    ) -> marketing_models.QueryYouhuiTemplateResponse:
        """
        Description: 优惠模板详情
        Summary: 优惠模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_youhui_template_ex(request, headers, runtime)

    async def query_youhui_template_async(
        self,
        request: marketing_models.QueryYouhuiTemplateRequest,
    ) -> marketing_models.QueryYouhuiTemplateResponse:
        """
        Description: 优惠模板详情
        Summary: 优惠模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_youhui_template_ex_async(request, headers, runtime)

    def query_youhui_template_ex(
        self,
        request: marketing_models.QueryYouhuiTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryYouhuiTemplateResponse:
        """
        Description: 优惠模板详情
        Summary: 优惠模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryYouhuiTemplateResponse(),
            self.do_request('1.0', 'antcloud.marketing.youhui.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_youhui_template_ex_async(
        self,
        request: marketing_models.QueryYouhuiTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryYouhuiTemplateResponse:
        """
        Description: 优惠模板详情
        Summary: 优惠模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryYouhuiTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.youhui.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_coupon_annotated(
        self,
        request: marketing_models.SendCouponAnnotatedRequest,
    ) -> marketing_models.SendCouponAnnotatedResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口,含错误返回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_coupon_annotated_ex(request, headers, runtime)

    async def send_coupon_annotated_async(
        self,
        request: marketing_models.SendCouponAnnotatedRequest,
    ) -> marketing_models.SendCouponAnnotatedResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口,含错误返回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_coupon_annotated_ex_async(request, headers, runtime)

    def send_coupon_annotated_ex(
        self,
        request: marketing_models.SendCouponAnnotatedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SendCouponAnnotatedResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口,含错误返回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SendCouponAnnotatedResponse(),
            self.do_request('1.0', 'antcloud.marketing.coupon.annotated.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_coupon_annotated_ex_async(
        self,
        request: marketing_models.SendCouponAnnotatedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SendCouponAnnotatedResponse:
        """
        Description: 优惠券发放接口，基于模板ID发送优惠券
        Summary: 优惠券发放接口,含错误返回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SendCouponAnnotatedResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.coupon.annotated.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_doc(
        self,
        request: marketing_models.QueryDocRequest,
    ) -> marketing_models.QueryDocResponse:
        """
        Description: 获取文档内容
        Summary: 获取文档内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_doc_ex(request, headers, runtime)

    async def query_doc_async(
        self,
        request: marketing_models.QueryDocRequest,
    ) -> marketing_models.QueryDocResponse:
        """
        Description: 获取文档内容
        Summary: 获取文档内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_doc_ex_async(request, headers, runtime)

    def query_doc_ex(
        self,
        request: marketing_models.QueryDocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryDocResponse:
        """
        Description: 获取文档内容
        Summary: 获取文档内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryDocResponse(),
            self.do_request('1.0', 'antcloud.marketing.doc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_doc_ex_async(
        self,
        request: marketing_models.QueryDocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryDocResponse:
        """
        Description: 获取文档内容
        Summary: 获取文档内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryDocResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.doc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_doc_child(
        self,
        request: marketing_models.QueryDocChildRequest,
    ) -> marketing_models.QueryDocChildResponse:
        """
        Description: 根据内容库id和目录id查询子目录
        Summary: 根据内容库id和目录id查询子目录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_doc_child_ex(request, headers, runtime)

    async def query_doc_child_async(
        self,
        request: marketing_models.QueryDocChildRequest,
    ) -> marketing_models.QueryDocChildResponse:
        """
        Description: 根据内容库id和目录id查询子目录
        Summary: 根据内容库id和目录id查询子目录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_doc_child_ex_async(request, headers, runtime)

    def query_doc_child_ex(
        self,
        request: marketing_models.QueryDocChildRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryDocChildResponse:
        """
        Description: 根据内容库id和目录id查询子目录
        Summary: 根据内容库id和目录id查询子目录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryDocChildResponse(),
            self.do_request('1.0', 'antcloud.marketing.doc.child.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_doc_child_ex_async(
        self,
        request: marketing_models.QueryDocChildRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryDocChildResponse:
        """
        Description: 根据内容库id和目录id查询子目录
        Summary: 根据内容库id和目录id查询子目录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryDocChildResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.doc.child.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_coupon_avaliable(
        self,
        request: marketing_models.QueryCouponAvaliableRequest,
    ) -> marketing_models.QueryCouponAvaliableResponse:
        """
        Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
        Summary: 查询所有可用优惠券列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_coupon_avaliable_ex(request, headers, runtime)

    async def query_coupon_avaliable_async(
        self,
        request: marketing_models.QueryCouponAvaliableRequest,
    ) -> marketing_models.QueryCouponAvaliableResponse:
        """
        Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
        Summary: 查询所有可用优惠券列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_coupon_avaliable_ex_async(request, headers, runtime)

    def query_coupon_avaliable_ex(
        self,
        request: marketing_models.QueryCouponAvaliableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponAvaliableResponse:
        """
        Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
        Summary: 查询所有可用优惠券列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponAvaliableResponse(),
            self.do_request('1.0', 'antcloud.marketing.coupon.avaliable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_coupon_avaliable_ex_async(
        self,
        request: marketing_models.QueryCouponAvaliableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.QueryCouponAvaliableResponse:
        """
        Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
        Summary: 查询所有可用优惠券列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.QueryCouponAvaliableResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.coupon.avaliable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_activity_information(
        self,
        request: marketing_models.SubmitActivityInformationRequest,
    ) -> marketing_models.SubmitActivityInformationResponse:
        """
        Description: 提交活动情报数据
        Summary: 提交活动情报数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_activity_information_ex(request, headers, runtime)

    async def submit_activity_information_async(
        self,
        request: marketing_models.SubmitActivityInformationRequest,
    ) -> marketing_models.SubmitActivityInformationResponse:
        """
        Description: 提交活动情报数据
        Summary: 提交活动情报数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_activity_information_ex_async(request, headers, runtime)

    def submit_activity_information_ex(
        self,
        request: marketing_models.SubmitActivityInformationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SubmitActivityInformationResponse:
        """
        Description: 提交活动情报数据
        Summary: 提交活动情报数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SubmitActivityInformationResponse(),
            self.do_request('1.0', 'antcloud.marketing.activity.information.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_activity_information_ex_async(
        self,
        request: marketing_models.SubmitActivityInformationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SubmitActivityInformationResponse:
        """
        Description: 提交活动情报数据
        Summary: 提交活动情报数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SubmitActivityInformationResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.activity.information.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_activity_assets(
        self,
        request: marketing_models.SyncActivityAssetsRequest,
    ) -> marketing_models.SyncActivityAssetsResponse:
        """
        Description: 同步活动资产信息
        Summary: 同步活动资产信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_activity_assets_ex(request, headers, runtime)

    async def sync_activity_assets_async(
        self,
        request: marketing_models.SyncActivityAssetsRequest,
    ) -> marketing_models.SyncActivityAssetsResponse:
        """
        Description: 同步活动资产信息
        Summary: 同步活动资产信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_activity_assets_ex_async(request, headers, runtime)

    def sync_activity_assets_ex(
        self,
        request: marketing_models.SyncActivityAssetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SyncActivityAssetsResponse:
        """
        Description: 同步活动资产信息
        Summary: 同步活动资产信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SyncActivityAssetsResponse(),
            self.do_request('1.0', 'antcloud.marketing.activity.assets.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_activity_assets_ex_async(
        self,
        request: marketing_models.SyncActivityAssetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> marketing_models.SyncActivityAssetsResponse:
        """
        Description: 同步活动资产信息
        Summary: 同步活动资产信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            marketing_models.SyncActivityAssetsResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.activity.assets.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
