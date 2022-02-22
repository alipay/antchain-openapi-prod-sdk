# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_industry import models as industry_models
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
        config: industry_models.Config,
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
            # 银行卡信息
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
                    'sdk_version': '1.2.2'
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
            # 银行卡信息
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
                    'sdk_version': '1.2.2'
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

    def create_merchant_seller(
        self,
        request: industry_models.CreateMerchantSellerRequest,
    ) -> industry_models.CreateMerchantSellerResponse:
        """
        Description: 商业卖家商户注册
        Summary: 行业卖家商户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_merchant_seller_ex(request, headers, runtime)

    async def create_merchant_seller_async(
        self,
        request: industry_models.CreateMerchantSellerRequest,
    ) -> industry_models.CreateMerchantSellerResponse:
        """
        Description: 商业卖家商户注册
        Summary: 行业卖家商户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_merchant_seller_ex_async(request, headers, runtime)

    def create_merchant_seller_ex(
        self,
        request: industry_models.CreateMerchantSellerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.CreateMerchantSellerResponse:
        """
        Description: 商业卖家商户注册
        Summary: 行业卖家商户注册
        """
        UtilClient.validate_model(request)
        return industry_models.CreateMerchantSellerResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.merchant.seller.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_merchant_seller_ex_async(
        self,
        request: industry_models.CreateMerchantSellerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.CreateMerchantSellerResponse:
        """
        Description: 商业卖家商户注册
        Summary: 行业卖家商户注册
        """
        UtilClient.validate_model(request)
        return industry_models.CreateMerchantSellerResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.merchant.seller.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_sign(
        self,
        request: industry_models.QueryMerchantSignRequest,
    ) -> industry_models.QueryMerchantSignResponse:
        """
        Description: 行业卖家商户注册结果查询服务
        Summary: 行业卖家商户注册结果查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_sign_ex(request, headers, runtime)

    async def query_merchant_sign_async(
        self,
        request: industry_models.QueryMerchantSignRequest,
    ) -> industry_models.QueryMerchantSignResponse:
        """
        Description: 行业卖家商户注册结果查询服务
        Summary: 行业卖家商户注册结果查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_sign_ex_async(request, headers, runtime)

    def query_merchant_sign_ex(
        self,
        request: industry_models.QueryMerchantSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.QueryMerchantSignResponse:
        """
        Description: 行业卖家商户注册结果查询服务
        Summary: 行业卖家商户注册结果查询服务
        """
        UtilClient.validate_model(request)
        return industry_models.QueryMerchantSignResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.merchant.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_sign_ex_async(
        self,
        request: industry_models.QueryMerchantSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.QueryMerchantSignResponse:
        """
        Description: 行业卖家商户注册结果查询服务
        Summary: 行业卖家商户注册结果查询服务
        """
        UtilClient.validate_model(request)
        return industry_models.QueryMerchantSignResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.merchant.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_merchant_image(
        self,
        request: industry_models.UploadMerchantImageRequest,
    ) -> industry_models.UploadMerchantImageResponse:
        """
        Description: 行业商家图片上传
        Summary: 行业商家图片上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_merchant_image_ex(request, headers, runtime)

    async def upload_merchant_image_async(
        self,
        request: industry_models.UploadMerchantImageRequest,
    ) -> industry_models.UploadMerchantImageResponse:
        """
        Description: 行业商家图片上传
        Summary: 行业商家图片上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_merchant_image_ex_async(request, headers, runtime)

    def upload_merchant_image_ex(
        self,
        request: industry_models.UploadMerchantImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.UploadMerchantImageResponse:
        """
        Description: 行业商家图片上传
        Summary: 行业商家图片上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = industry_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.industry.merchant.image.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_merchant_image_response = industry_models.UploadMerchantImageResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_merchant_image_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return industry_models.UploadMerchantImageResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.merchant.image.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_merchant_image_ex_async(
        self,
        request: industry_models.UploadMerchantImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.UploadMerchantImageResponse:
        """
        Description: 行业商家图片上传
        Summary: 行业商家图片上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = industry_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.industry.merchant.image.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_merchant_image_response = industry_models.UploadMerchantImageResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_merchant_image_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return industry_models.UploadMerchantImageResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.merchant.image.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_merchant_agreement(
        self,
        request: industry_models.SignMerchantAgreementRequest,
    ) -> industry_models.SignMerchantAgreementResponse:
        """
        Description: 支付宝个人协议页面签约接口
        Summary: 支付宝个人协议页面签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_merchant_agreement_ex(request, headers, runtime)

    async def sign_merchant_agreement_async(
        self,
        request: industry_models.SignMerchantAgreementRequest,
    ) -> industry_models.SignMerchantAgreementResponse:
        """
        Description: 支付宝个人协议页面签约接口
        Summary: 支付宝个人协议页面签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_merchant_agreement_ex_async(request, headers, runtime)

    def sign_merchant_agreement_ex(
        self,
        request: industry_models.SignMerchantAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.SignMerchantAgreementResponse:
        """
        Description: 支付宝个人协议页面签约接口
        Summary: 支付宝个人协议页面签约接口
        """
        UtilClient.validate_model(request)
        return industry_models.SignMerchantAgreementResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.merchant.agreement.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_merchant_agreement_ex_async(
        self,
        request: industry_models.SignMerchantAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.SignMerchantAgreementResponse:
        """
        Description: 支付宝个人协议页面签约接口
        Summary: 支付宝个人协议页面签约接口
        """
        UtilClient.validate_model(request)
        return industry_models.SignMerchantAgreementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.merchant.agreement.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_merchant_info(
        self,
        request: industry_models.GetMerchantInfoRequest,
    ) -> industry_models.GetMerchantInfoResponse:
        """
        Description: 行业卖家商户信息查询
        Summary: 行业卖家商户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_merchant_info_ex(request, headers, runtime)

    async def get_merchant_info_async(
        self,
        request: industry_models.GetMerchantInfoRequest,
    ) -> industry_models.GetMerchantInfoResponse:
        """
        Description: 行业卖家商户信息查询
        Summary: 行业卖家商户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_merchant_info_ex_async(request, headers, runtime)

    def get_merchant_info_ex(
        self,
        request: industry_models.GetMerchantInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.GetMerchantInfoResponse:
        """
        Description: 行业卖家商户信息查询
        Summary: 行业卖家商户信息查询
        """
        UtilClient.validate_model(request)
        return industry_models.GetMerchantInfoResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.merchant.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_merchant_info_ex_async(
        self,
        request: industry_models.GetMerchantInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.GetMerchantInfoResponse:
        """
        Description: 行业卖家商户信息查询
        Summary: 行业卖家商户信息查询
        """
        UtilClient.validate_model(request)
        return industry_models.GetMerchantInfoResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.merchant.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_trade_page(
        self,
        request: industry_models.PayTradePageRequest,
    ) -> industry_models.PayTradePageResponse:
        """
        Description: 买家卖家收单交易，直接收款给卖家过渡户
        Summary: 买家卖家收单交易-电脑版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_trade_page_ex(request, headers, runtime)

    async def pay_trade_page_async(
        self,
        request: industry_models.PayTradePageRequest,
    ) -> industry_models.PayTradePageResponse:
        """
        Description: 买家卖家收单交易，直接收款给卖家过渡户
        Summary: 买家卖家收单交易-电脑版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_trade_page_ex_async(request, headers, runtime)

    def pay_trade_page_ex(
        self,
        request: industry_models.PayTradePageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.PayTradePageResponse:
        """
        Description: 买家卖家收单交易，直接收款给卖家过渡户
        Summary: 买家卖家收单交易-电脑版
        """
        UtilClient.validate_model(request)
        return industry_models.PayTradePageResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.trade.page.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_trade_page_ex_async(
        self,
        request: industry_models.PayTradePageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.PayTradePageResponse:
        """
        Description: 买家卖家收单交易，直接收款给卖家过渡户
        Summary: 买家卖家收单交易-电脑版
        """
        UtilClient.validate_model(request)
        return industry_models.PayTradePageResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.trade.page.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trade_order(
        self,
        request: industry_models.QueryTradeOrderRequest,
    ) -> industry_models.QueryTradeOrderResponse:
        """
        Description: 交易支付结果查询接口
        Summary: 交易结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trade_order_ex(request, headers, runtime)

    async def query_trade_order_async(
        self,
        request: industry_models.QueryTradeOrderRequest,
    ) -> industry_models.QueryTradeOrderResponse:
        """
        Description: 交易支付结果查询接口
        Summary: 交易结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trade_order_ex_async(request, headers, runtime)

    def query_trade_order_ex(
        self,
        request: industry_models.QueryTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.QueryTradeOrderResponse:
        """
        Description: 交易支付结果查询接口
        Summary: 交易结果查询
        """
        UtilClient.validate_model(request)
        return industry_models.QueryTradeOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.trade.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trade_order_ex_async(
        self,
        request: industry_models.QueryTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.QueryTradeOrderResponse:
        """
        Description: 交易支付结果查询接口
        Summary: 交易结果查询
        """
        UtilClient.validate_model(request)
        return industry_models.QueryTradeOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.trade.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_trade(
        self,
        request: industry_models.CreateTradeRequest,
    ) -> industry_models.CreateTradeResponse:
        """
        Description: 买家卖家收单
        Summary: 统一收单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_trade_ex(request, headers, runtime)

    async def create_trade_async(
        self,
        request: industry_models.CreateTradeRequest,
    ) -> industry_models.CreateTradeResponse:
        """
        Description: 买家卖家收单
        Summary: 统一收单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_trade_ex_async(request, headers, runtime)

    def create_trade_ex(
        self,
        request: industry_models.CreateTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.CreateTradeResponse:
        """
        Description: 买家卖家收单
        Summary: 统一收单创建
        """
        UtilClient.validate_model(request)
        return industry_models.CreateTradeResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.trade.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_trade_ex_async(
        self,
        request: industry_models.CreateTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.CreateTradeResponse:
        """
        Description: 买家卖家收单
        Summary: 统一收单创建
        """
        UtilClient.validate_model(request)
        return industry_models.CreateTradeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.trade.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_trade(
        self,
        request: industry_models.PayTradeRequest,
    ) -> industry_models.PayTradeResponse:
        """
        Description: 统一收单-支付
        Summary: 统一收单-支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_trade_ex(request, headers, runtime)

    async def pay_trade_async(
        self,
        request: industry_models.PayTradeRequest,
    ) -> industry_models.PayTradeResponse:
        """
        Description: 统一收单-支付
        Summary: 统一收单-支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_trade_ex_async(request, headers, runtime)

    def pay_trade_ex(
        self,
        request: industry_models.PayTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.PayTradeResponse:
        """
        Description: 统一收单-支付
        Summary: 统一收单-支付
        """
        UtilClient.validate_model(request)
        return industry_models.PayTradeResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.trade.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_trade_ex_async(
        self,
        request: industry_models.PayTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.PayTradeResponse:
        """
        Description: 统一收单-支付
        Summary: 统一收单-支付
        """
        UtilClient.validate_model(request)
        return industry_models.PayTradeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.trade.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade(
        self,
        request: industry_models.SyncTradeRequest,
    ) -> industry_models.SyncTradeResponse:
        """
        Description: 统一收单-同步
        Summary: 统一收单-同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_ex(request, headers, runtime)

    async def sync_trade_async(
        self,
        request: industry_models.SyncTradeRequest,
    ) -> industry_models.SyncTradeResponse:
        """
        Description: 统一收单-同步
        Summary: 统一收单-同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_ex_async(request, headers, runtime)

    def sync_trade_ex(
        self,
        request: industry_models.SyncTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.SyncTradeResponse:
        """
        Description: 统一收单-同步
        Summary: 统一收单-同步
        """
        UtilClient.validate_model(request)
        return industry_models.SyncTradeResponse().from_map(
            self.do_request('1.0', 'antcloud.industry.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_ex_async(
        self,
        request: industry_models.SyncTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.SyncTradeResponse:
        """
        Description: 统一收单-同步
        Summary: 统一收单-同步
        """
        UtilClient.validate_model(request)
        return industry_models.SyncTradeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.industry.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: industry_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> industry_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: industry_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> industry_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: industry_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return industry_models.CreateAntcloudGatewayxFileUploadResponse().from_map(
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: industry_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> industry_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return industry_models.CreateAntcloudGatewayxFileUploadResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
