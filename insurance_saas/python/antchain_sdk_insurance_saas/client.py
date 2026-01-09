# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_insurance_saas import models as insurance__saas_models
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
        config: insurance__saas_models.Config,
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
            # 文件结构
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
                    'sdk_version': '1.11.3',
                    '_prod_code': 'INSURANCE_SAAS',
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
            # 文件结构
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
                    'sdk_version': '1.11.3',
                    '_prod_code': 'INSURANCE_SAAS',
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

    def query_inquiry(
        self,
        request: insurance__saas_models.QueryInquiryRequest,
    ) -> insurance__saas_models.QueryInquiryResponse:
        """
        Description: 保险询报价结果查询
        Summary: 保险询报价结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inquiry_ex(request, headers, runtime)

    async def query_inquiry_async(
        self,
        request: insurance__saas_models.QueryInquiryRequest,
    ) -> insurance__saas_models.QueryInquiryResponse:
        """
        Description: 保险询报价结果查询
        Summary: 保险询报价结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inquiry_ex_async(request, headers, runtime)

    def query_inquiry_ex(
        self,
        request: insurance__saas_models.QueryInquiryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInquiryResponse:
        """
        Description: 保险询报价结果查询
        Summary: 保险询报价结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInquiryResponse(),
            self.do_request('1.0', 'antcloud.insurance.inquiry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inquiry_ex_async(
        self,
        request: insurance__saas_models.QueryInquiryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInquiryResponse:
        """
        Description: 保险询报价结果查询
        Summary: 保险询报价结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInquiryResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.inquiry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inquiry(
        self,
        request: insurance__saas_models.SubmitInquiryRequest,
    ) -> insurance__saas_models.SubmitInquiryResponse:
        """
        Description: 保险产品询价
        Summary: 保险产品询价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inquiry_ex(request, headers, runtime)

    async def submit_inquiry_async(
        self,
        request: insurance__saas_models.SubmitInquiryRequest,
    ) -> insurance__saas_models.SubmitInquiryResponse:
        """
        Description: 保险产品询价
        Summary: 保险产品询价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inquiry_ex_async(request, headers, runtime)

    def submit_inquiry_ex(
        self,
        request: insurance__saas_models.SubmitInquiryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SubmitInquiryResponse:
        """
        Description: 保险产品询价
        Summary: 保险产品询价
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SubmitInquiryResponse(),
            self.do_request('1.0', 'antcloud.insurance.inquiry.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inquiry_ex_async(
        self,
        request: insurance__saas_models.SubmitInquiryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SubmitInquiryResponse:
        """
        Description: 保险产品询价
        Summary: 保险产品询价
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SubmitInquiryResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.inquiry.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_data_disaster(
        self,
        request: insurance__saas_models.QueryDataDisasterRequest,
    ) -> insurance__saas_models.QueryDataDisasterResponse:
        """
        Description: 历史灾害查询
        Summary: 历史灾害数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_data_disaster_ex(request, headers, runtime)

    async def query_data_disaster_async(
        self,
        request: insurance__saas_models.QueryDataDisasterRequest,
    ) -> insurance__saas_models.QueryDataDisasterResponse:
        """
        Description: 历史灾害查询
        Summary: 历史灾害数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_data_disaster_ex_async(request, headers, runtime)

    def query_data_disaster_ex(
        self,
        request: insurance__saas_models.QueryDataDisasterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryDataDisasterResponse:
        """
        Description: 历史灾害查询
        Summary: 历史灾害数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryDataDisasterResponse(),
            self.do_request('1.0', 'antcloud.insurance.data.disaster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_data_disaster_ex_async(
        self,
        request: insurance__saas_models.QueryDataDisasterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryDataDisasterResponse:
        """
        Description: 历史灾害查询
        Summary: 历史灾害数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryDataDisasterResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.data.disaster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_data_weather(
        self,
        request: insurance__saas_models.QueryDataWeatherRequest,
    ) -> insurance__saas_models.QueryDataWeatherResponse:
        """
        Description: 实时天气预警
        Summary: 实时天气预警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_data_weather_ex(request, headers, runtime)

    async def query_data_weather_async(
        self,
        request: insurance__saas_models.QueryDataWeatherRequest,
    ) -> insurance__saas_models.QueryDataWeatherResponse:
        """
        Description: 实时天气预警
        Summary: 实时天气预警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_data_weather_ex_async(request, headers, runtime)

    def query_data_weather_ex(
        self,
        request: insurance__saas_models.QueryDataWeatherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryDataWeatherResponse:
        """
        Description: 实时天气预警
        Summary: 实时天气预警
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryDataWeatherResponse(),
            self.do_request('1.0', 'antcloud.insurance.data.weather.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_data_weather_ex_async(
        self,
        request: insurance__saas_models.QueryDataWeatherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryDataWeatherResponse:
        """
        Description: 实时天气预警
        Summary: 实时天气预警
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryDataWeatherResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.data.weather.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_quote(
        self,
        request: insurance__saas_models.SyncQuoteRequest,
    ) -> insurance__saas_models.SyncQuoteResponse:
        """
        Description: 报价接口同步接口
        Summary: 报价接口同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_quote_ex(request, headers, runtime)

    async def sync_quote_async(
        self,
        request: insurance__saas_models.SyncQuoteRequest,
    ) -> insurance__saas_models.SyncQuoteResponse:
        """
        Description: 报价接口同步接口
        Summary: 报价接口同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_quote_ex_async(request, headers, runtime)

    def sync_quote_ex(
        self,
        request: insurance__saas_models.SyncQuoteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SyncQuoteResponse:
        """
        Description: 报价接口同步接口
        Summary: 报价接口同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SyncQuoteResponse(),
            self.do_request('1.0', 'antcloud.insurance.quote.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_quote_ex_async(
        self,
        request: insurance__saas_models.SyncQuoteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SyncQuoteResponse:
        """
        Description: 报价接口同步接口
        Summary: 报价接口同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SyncQuoteResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.quote.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_underwriting(
        self,
        request: insurance__saas_models.ApplyUnderwritingRequest,
    ) -> insurance__saas_models.ApplyUnderwritingResponse:
        """
        Description: 承保自核申请接口
        Summary: 承保自核申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_underwriting_ex(request, headers, runtime)

    async def apply_underwriting_async(
        self,
        request: insurance__saas_models.ApplyUnderwritingRequest,
    ) -> insurance__saas_models.ApplyUnderwritingResponse:
        """
        Description: 承保自核申请接口
        Summary: 承保自核申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_underwriting_ex_async(request, headers, runtime)

    def apply_underwriting_ex(
        self,
        request: insurance__saas_models.ApplyUnderwritingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyUnderwritingResponse:
        """
        Description: 承保自核申请接口
        Summary: 承保自核申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyUnderwritingResponse(),
            self.do_request('1.0', 'antcloud.insurance.underwriting.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_underwriting_ex_async(
        self,
        request: insurance__saas_models.ApplyUnderwritingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyUnderwritingResponse:
        """
        Description: 承保自核申请接口
        Summary: 承保自核申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyUnderwritingResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.underwriting.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_underwriting(
        self,
        request: insurance__saas_models.QueryUnderwritingRequest,
    ) -> insurance__saas_models.QueryUnderwritingResponse:
        """
        Description: 承保自核结果查询接口
        Summary: 承保自核结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_underwriting_ex(request, headers, runtime)

    async def query_underwriting_async(
        self,
        request: insurance__saas_models.QueryUnderwritingRequest,
    ) -> insurance__saas_models.QueryUnderwritingResponse:
        """
        Description: 承保自核结果查询接口
        Summary: 承保自核结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_underwriting_ex_async(request, headers, runtime)

    def query_underwriting_ex(
        self,
        request: insurance__saas_models.QueryUnderwritingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryUnderwritingResponse:
        """
        Description: 承保自核结果查询接口
        Summary: 承保自核结果查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryUnderwritingResponse(),
            self.do_request('1.0', 'antcloud.insurance.underwriting.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_underwriting_ex_async(
        self,
        request: insurance__saas_models.QueryUnderwritingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryUnderwritingResponse:
        """
        Description: 承保自核结果查询接口
        Summary: 承保自核结果查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryUnderwritingResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.underwriting.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_policy_file(
        self,
        request: insurance__saas_models.QueryPolicyFileRequest,
    ) -> insurance__saas_models.QueryPolicyFileResponse:
        """
        Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
        Summary: 保险科技保单附件查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_policy_file_ex(request, headers, runtime)

    async def query_policy_file_async(
        self,
        request: insurance__saas_models.QueryPolicyFileRequest,
    ) -> insurance__saas_models.QueryPolicyFileResponse:
        """
        Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
        Summary: 保险科技保单附件查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_policy_file_ex_async(request, headers, runtime)

    def query_policy_file_ex(
        self,
        request: insurance__saas_models.QueryPolicyFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryPolicyFileResponse:
        """
        Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
        Summary: 保险科技保单附件查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryPolicyFileResponse(),
            self.do_request('1.0', 'antcloud.insurance.policy.file.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_policy_file_ex_async(
        self,
        request: insurance__saas_models.QueryPolicyFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryPolicyFileResponse:
        """
        Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
        Summary: 保险科技保单附件查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryPolicyFileResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.policy.file.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insure(
        self,
        request: insurance__saas_models.ApplyInsureRequest,
    ) -> insurance__saas_models.ApplyInsureResponse:
        """
        Description: 保险SaaS投保申请接口
        Summary: 投保申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insure_ex(request, headers, runtime)

    async def apply_insure_async(
        self,
        request: insurance__saas_models.ApplyInsureRequest,
    ) -> insurance__saas_models.ApplyInsureResponse:
        """
        Description: 保险SaaS投保申请接口
        Summary: 投保申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insure_ex_async(request, headers, runtime)

    def apply_insure_ex(
        self,
        request: insurance__saas_models.ApplyInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyInsureResponse:
        """
        Description: 保险SaaS投保申请接口
        Summary: 投保申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyInsureResponse(),
            self.do_request('1.0', 'antcloud.insurance.insure.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insure_ex_async(
        self,
        request: insurance__saas_models.ApplyInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyInsureResponse:
        """
        Description: 保险SaaS投保申请接口
        Summary: 投保申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyInsureResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.insure.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_policy_result(
        self,
        request: insurance__saas_models.NotifyPolicyResultRequest,
    ) -> insurance__saas_models.NotifyPolicyResultResponse:
        """
        Description: 保单结果同步，注意：基于投保信息的保单结果同步。
        Summary: 保单结果同步（依赖投保申请）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_policy_result_ex(request, headers, runtime)

    async def notify_policy_result_async(
        self,
        request: insurance__saas_models.NotifyPolicyResultRequest,
    ) -> insurance__saas_models.NotifyPolicyResultResponse:
        """
        Description: 保单结果同步，注意：基于投保信息的保单结果同步。
        Summary: 保单结果同步（依赖投保申请）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_policy_result_ex_async(request, headers, runtime)

    def notify_policy_result_ex(
        self,
        request: insurance__saas_models.NotifyPolicyResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyPolicyResultResponse:
        """
        Description: 保单结果同步，注意：基于投保信息的保单结果同步。
        Summary: 保单结果同步（依赖投保申请）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyPolicyResultResponse(),
            self.do_request('1.0', 'antcloud.insurance.policy.result.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_policy_result_ex_async(
        self,
        request: insurance__saas_models.NotifyPolicyResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyPolicyResultResponse:
        """
        Description: 保单结果同步，注意：基于投保信息的保单结果同步。
        Summary: 保单结果同步（依赖投保申请）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyPolicyResultResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.policy.result.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_claim(
        self,
        request: insurance__saas_models.ApplyClaimRequest,
    ) -> insurance__saas_models.ApplyClaimResponse:
        """
        Description: 报案接口
        Summary: 保险科技 报案接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_claim_ex(request, headers, runtime)

    async def apply_claim_async(
        self,
        request: insurance__saas_models.ApplyClaimRequest,
    ) -> insurance__saas_models.ApplyClaimResponse:
        """
        Description: 报案接口
        Summary: 保险科技 报案接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_claim_ex_async(request, headers, runtime)

    def apply_claim_ex(
        self,
        request: insurance__saas_models.ApplyClaimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyClaimResponse:
        """
        Description: 报案接口
        Summary: 保险科技 报案接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyClaimResponse(),
            self.do_request('1.0', 'antcloud.insurance.claim.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_claim_ex_async(
        self,
        request: insurance__saas_models.ApplyClaimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyClaimResponse:
        """
        Description: 报案接口
        Summary: 保险科技 报案接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyClaimResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.claim.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_claim(
        self,
        request: insurance__saas_models.CancelClaimRequest,
    ) -> insurance__saas_models.CancelClaimResponse:
        """
        Description: 报案撤销（场景端）
        Summary: 报案撤销（场景端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_claim_ex(request, headers, runtime)

    async def cancel_claim_async(
        self,
        request: insurance__saas_models.CancelClaimRequest,
    ) -> insurance__saas_models.CancelClaimResponse:
        """
        Description: 报案撤销（场景端）
        Summary: 报案撤销（场景端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_claim_ex_async(request, headers, runtime)

    def cancel_claim_ex(
        self,
        request: insurance__saas_models.CancelClaimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.CancelClaimResponse:
        """
        Description: 报案撤销（场景端）
        Summary: 报案撤销（场景端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.CancelClaimResponse(),
            self.do_request('1.0', 'antcloud.insurance.claim.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_claim_ex_async(
        self,
        request: insurance__saas_models.CancelClaimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.CancelClaimResponse:
        """
        Description: 报案撤销（场景端）
        Summary: 报案撤销（场景端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.CancelClaimResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.claim.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_claim_material(
        self,
        request: insurance__saas_models.UpdateClaimMaterialRequest,
    ) -> insurance__saas_models.UpdateClaimMaterialResponse:
        """
        Description: 报案材料更新（场景端）
        Summary: 报案材料更新（场景端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_claim_material_ex(request, headers, runtime)

    async def update_claim_material_async(
        self,
        request: insurance__saas_models.UpdateClaimMaterialRequest,
    ) -> insurance__saas_models.UpdateClaimMaterialResponse:
        """
        Description: 报案材料更新（场景端）
        Summary: 报案材料更新（场景端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_claim_material_ex_async(request, headers, runtime)

    def update_claim_material_ex(
        self,
        request: insurance__saas_models.UpdateClaimMaterialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.UpdateClaimMaterialResponse:
        """
        Description: 报案材料更新（场景端）
        Summary: 报案材料更新（场景端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.UpdateClaimMaterialResponse(),
            self.do_request('1.0', 'antcloud.insurance.claim.material.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_claim_material_ex_async(
        self,
        request: insurance__saas_models.UpdateClaimMaterialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.UpdateClaimMaterialResponse:
        """
        Description: 报案材料更新（场景端）
        Summary: 报案材料更新（场景端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.UpdateClaimMaterialResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.claim.material.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_claim_settle(
        self,
        request: insurance__saas_models.ConfirmClaimSettleRequest,
    ) -> insurance__saas_models.ConfirmClaimSettleResponse:
        """
        Description: 理赔结果确认（场景端）
        Summary: 理赔结果确认（场景端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_claim_settle_ex(request, headers, runtime)

    async def confirm_claim_settle_async(
        self,
        request: insurance__saas_models.ConfirmClaimSettleRequest,
    ) -> insurance__saas_models.ConfirmClaimSettleResponse:
        """
        Description: 理赔结果确认（场景端）
        Summary: 理赔结果确认（场景端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_claim_settle_ex_async(request, headers, runtime)

    def confirm_claim_settle_ex(
        self,
        request: insurance__saas_models.ConfirmClaimSettleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ConfirmClaimSettleResponse:
        """
        Description: 理赔结果确认（场景端）
        Summary: 理赔结果确认（场景端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ConfirmClaimSettleResponse(),
            self.do_request('1.0', 'antcloud.insurance.claim.settle.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_claim_settle_ex_async(
        self,
        request: insurance__saas_models.ConfirmClaimSettleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ConfirmClaimSettleResponse:
        """
        Description: 理赔结果确认（场景端）
        Summary: 理赔结果确认（场景端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ConfirmClaimSettleResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.claim.settle.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_claim_settle(
        self,
        request: insurance__saas_models.FinishClaimSettleRequest,
    ) -> insurance__saas_models.FinishClaimSettleResponse:
        """
        Description: 理赔结案通知（保司端）
        Summary: 理赔结案通知（保司端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_claim_settle_ex(request, headers, runtime)

    async def finish_claim_settle_async(
        self,
        request: insurance__saas_models.FinishClaimSettleRequest,
    ) -> insurance__saas_models.FinishClaimSettleResponse:
        """
        Description: 理赔结案通知（保司端）
        Summary: 理赔结案通知（保司端）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_claim_settle_ex_async(request, headers, runtime)

    def finish_claim_settle_ex(
        self,
        request: insurance__saas_models.FinishClaimSettleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.FinishClaimSettleResponse:
        """
        Description: 理赔结案通知（保司端）
        Summary: 理赔结案通知（保司端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.FinishClaimSettleResponse(),
            self.do_request('1.0', 'antcloud.insurance.claim.settle.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_claim_settle_ex_async(
        self,
        request: insurance__saas_models.FinishClaimSettleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.FinishClaimSettleResponse:
        """
        Description: 理赔结案通知（保司端）
        Summary: 理赔结案通知（保司端）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.FinishClaimSettleResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.claim.settle.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_endorsement_strategy(
        self,
        request: insurance__saas_models.ApplyEndorsementStrategyRequest,
    ) -> insurance__saas_models.ApplyEndorsementStrategyResponse:
        """
        Description: 保险批改自核接口
        Summary: 保险批改自核接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_endorsement_strategy_ex(request, headers, runtime)

    async def apply_endorsement_strategy_async(
        self,
        request: insurance__saas_models.ApplyEndorsementStrategyRequest,
    ) -> insurance__saas_models.ApplyEndorsementStrategyResponse:
        """
        Description: 保险批改自核接口
        Summary: 保险批改自核接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_endorsement_strategy_ex_async(request, headers, runtime)

    def apply_endorsement_strategy_ex(
        self,
        request: insurance__saas_models.ApplyEndorsementStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyEndorsementStrategyResponse:
        """
        Description: 保险批改自核接口
        Summary: 保险批改自核接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyEndorsementStrategyResponse(),
            self.do_request('1.0', 'antcloud.insurance.endorsement.strategy.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_endorsement_strategy_ex_async(
        self,
        request: insurance__saas_models.ApplyEndorsementStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyEndorsementStrategyResponse:
        """
        Description: 保险批改自核接口
        Summary: 保险批改自核接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyEndorsementStrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.endorsement.strategy.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_policy_result(
        self,
        request: insurance__saas_models.SyncPolicyResultRequest,
    ) -> insurance__saas_models.SyncPolicyResultResponse:
        """
        Description: 保单信息离线同步
        Summary: 保单信息离线同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_policy_result_ex(request, headers, runtime)

    async def sync_policy_result_async(
        self,
        request: insurance__saas_models.SyncPolicyResultRequest,
    ) -> insurance__saas_models.SyncPolicyResultResponse:
        """
        Description: 保单信息离线同步
        Summary: 保单信息离线同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_policy_result_ex_async(request, headers, runtime)

    def sync_policy_result_ex(
        self,
        request: insurance__saas_models.SyncPolicyResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SyncPolicyResultResponse:
        """
        Description: 保单信息离线同步
        Summary: 保单信息离线同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SyncPolicyResultResponse(),
            self.do_request('1.0', 'antcloud.insurance.policy.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_policy_result_ex_async(
        self,
        request: insurance__saas_models.SyncPolicyResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SyncPolicyResultResponse:
        """
        Description: 保单信息离线同步
        Summary: 保单信息离线同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SyncPolicyResultResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.policy.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insure_result(
        self,
        request: insurance__saas_models.QueryInsureResultRequest,
    ) -> insurance__saas_models.QueryInsureResultResponse:
        """
        Description: 基于通知单号查询保险投保结果
        Summary: 保险投保结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insure_result_ex(request, headers, runtime)

    async def query_insure_result_async(
        self,
        request: insurance__saas_models.QueryInsureResultRequest,
    ) -> insurance__saas_models.QueryInsureResultResponse:
        """
        Description: 基于通知单号查询保险投保结果
        Summary: 保险投保结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insure_result_ex_async(request, headers, runtime)

    def query_insure_result_ex(
        self,
        request: insurance__saas_models.QueryInsureResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInsureResultResponse:
        """
        Description: 基于通知单号查询保险投保结果
        Summary: 保险投保结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInsureResultResponse(),
            self.do_request('1.0', 'antcloud.insurance.insure.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insure_result_ex_async(
        self,
        request: insurance__saas_models.QueryInsureResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInsureResultResponse:
        """
        Description: 基于通知单号查询保险投保结果
        Summary: 保险投保结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInsureResultResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.insure.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insure_test(
        self,
        request: insurance__saas_models.ApplyInsureTestRequest,
    ) -> insurance__saas_models.ApplyInsureTestResponse:
        """
        Description: 投保测试接口
        Summary: 投保测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insure_test_ex(request, headers, runtime)

    async def apply_insure_test_async(
        self,
        request: insurance__saas_models.ApplyInsureTestRequest,
    ) -> insurance__saas_models.ApplyInsureTestResponse:
        """
        Description: 投保测试接口
        Summary: 投保测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insure_test_ex_async(request, headers, runtime)

    def apply_insure_test_ex(
        self,
        request: insurance__saas_models.ApplyInsureTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyInsureTestResponse:
        """
        Description: 投保测试接口
        Summary: 投保测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyInsureTestResponse(),
            self.do_request('1.0', 'antcloud.insurance.insure.test.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insure_test_ex_async(
        self,
        request: insurance__saas_models.ApplyInsureTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ApplyInsureTestResponse:
        """
        Description: 投保测试接口
        Summary: 投保测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ApplyInsureTestResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.insure.test.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_investigate_case(
        self,
        request: insurance__saas_models.SubmitInvestigateCaseRequest,
    ) -> insurance__saas_models.SubmitInvestigateCaseResponse:
        """
        Description: 本接口用于调查报案数据的提交
        Summary: 调查报案提交接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_investigate_case_ex(request, headers, runtime)

    async def submit_investigate_case_async(
        self,
        request: insurance__saas_models.SubmitInvestigateCaseRequest,
    ) -> insurance__saas_models.SubmitInvestigateCaseResponse:
        """
        Description: 本接口用于调查报案数据的提交
        Summary: 调查报案提交接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_investigate_case_ex_async(request, headers, runtime)

    def submit_investigate_case_ex(
        self,
        request: insurance__saas_models.SubmitInvestigateCaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SubmitInvestigateCaseResponse:
        """
        Description: 本接口用于调查报案数据的提交
        Summary: 调查报案提交接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SubmitInvestigateCaseResponse(),
            self.do_request('1.0', 'antcloud.insurance.investigate.case.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_investigate_case_ex_async(
        self,
        request: insurance__saas_models.SubmitInvestigateCaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.SubmitInvestigateCaseResponse:
        """
        Description: 本接口用于调查报案数据的提交
        Summary: 调查报案提交接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.SubmitInvestigateCaseResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.investigate.case.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_reverse_commission(
        self,
        request: insurance__saas_models.QueryReverseCommissionRequest,
    ) -> insurance__saas_models.QueryReverseCommissionResponse:
        """
        Description: 回销结果查询接口
        Summary: 回销结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_reverse_commission_ex(request, headers, runtime)

    async def query_reverse_commission_async(
        self,
        request: insurance__saas_models.QueryReverseCommissionRequest,
    ) -> insurance__saas_models.QueryReverseCommissionResponse:
        """
        Description: 回销结果查询接口
        Summary: 回销结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_reverse_commission_ex_async(request, headers, runtime)

    def query_reverse_commission_ex(
        self,
        request: insurance__saas_models.QueryReverseCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryReverseCommissionResponse:
        """
        Description: 回销结果查询接口
        Summary: 回销结果查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryReverseCommissionResponse(),
            self.do_request('1.0', 'antcloud.insurance.reverse.commission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_reverse_commission_ex_async(
        self,
        request: insurance__saas_models.QueryReverseCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryReverseCommissionResponse:
        """
        Description: 回销结果查询接口
        Summary: 回销结果查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryReverseCommissionResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.reverse.commission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_embedcard_url(
        self,
        request: insurance__saas_models.GetEmbedcardUrlRequest,
    ) -> insurance__saas_models.GetEmbedcardUrlResponse:
        """
        Description: 嵌入式保险服务卡片url链接获取
        Summary: 嵌入式保险服务卡片url链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_embedcard_url_ex(request, headers, runtime)

    async def get_embedcard_url_async(
        self,
        request: insurance__saas_models.GetEmbedcardUrlRequest,
    ) -> insurance__saas_models.GetEmbedcardUrlResponse:
        """
        Description: 嵌入式保险服务卡片url链接获取
        Summary: 嵌入式保险服务卡片url链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_embedcard_url_ex_async(request, headers, runtime)

    def get_embedcard_url_ex(
        self,
        request: insurance__saas_models.GetEmbedcardUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetEmbedcardUrlResponse:
        """
        Description: 嵌入式保险服务卡片url链接获取
        Summary: 嵌入式保险服务卡片url链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetEmbedcardUrlResponse(),
            self.do_request('1.0', 'antcloud.insurance.embedcard.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_embedcard_url_ex_async(
        self,
        request: insurance__saas_models.GetEmbedcardUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetEmbedcardUrlResponse:
        """
        Description: 嵌入式保险服务卡片url链接获取
        Summary: 嵌入式保险服务卡片url链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetEmbedcardUrlResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.embedcard.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def issue_embedcard_paysuc(
        self,
        request: insurance__saas_models.IssueEmbedcardPaysucRequest,
    ) -> insurance__saas_models.IssueEmbedcardPaysucResponse:
        """
        Description: 嵌入式保险服务打款成功出单接口
        Summary: 嵌入式保险服务打款成功出单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.issue_embedcard_paysuc_ex(request, headers, runtime)

    async def issue_embedcard_paysuc_async(
        self,
        request: insurance__saas_models.IssueEmbedcardPaysucRequest,
    ) -> insurance__saas_models.IssueEmbedcardPaysucResponse:
        """
        Description: 嵌入式保险服务打款成功出单接口
        Summary: 嵌入式保险服务打款成功出单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.issue_embedcard_paysuc_ex_async(request, headers, runtime)

    def issue_embedcard_paysuc_ex(
        self,
        request: insurance__saas_models.IssueEmbedcardPaysucRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.IssueEmbedcardPaysucResponse:
        """
        Description: 嵌入式保险服务打款成功出单接口
        Summary: 嵌入式保险服务打款成功出单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.IssueEmbedcardPaysucResponse(),
            self.do_request('1.0', 'antcloud.insurance.embedcard.paysuc.issue', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def issue_embedcard_paysuc_ex_async(
        self,
        request: insurance__saas_models.IssueEmbedcardPaysucRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.IssueEmbedcardPaysucResponse:
        """
        Description: 嵌入式保险服务打款成功出单接口
        Summary: 嵌入式保险服务打款成功出单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.IssueEmbedcardPaysucResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.embedcard.paysuc.issue', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_embedoemautoinsurance_url(
        self,
        request: insurance__saas_models.GetEmbedoemautoinsuranceUrlRequest,
    ) -> insurance__saas_models.GetEmbedoemautoinsuranceUrlResponse:
        """
        Description: 嵌入式主机厂车险url链接获取
        Summary: 嵌入式主机厂车险url链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_embedoemautoinsurance_url_ex(request, headers, runtime)

    async def get_embedoemautoinsurance_url_async(
        self,
        request: insurance__saas_models.GetEmbedoemautoinsuranceUrlRequest,
    ) -> insurance__saas_models.GetEmbedoemautoinsuranceUrlResponse:
        """
        Description: 嵌入式主机厂车险url链接获取
        Summary: 嵌入式主机厂车险url链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_embedoemautoinsurance_url_ex_async(request, headers, runtime)

    def get_embedoemautoinsurance_url_ex(
        self,
        request: insurance__saas_models.GetEmbedoemautoinsuranceUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetEmbedoemautoinsuranceUrlResponse:
        """
        Description: 嵌入式主机厂车险url链接获取
        Summary: 嵌入式主机厂车险url链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetEmbedoemautoinsuranceUrlResponse(),
            self.do_request('1.0', 'antcloud.insurance.embedoemautoinsurance.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_embedoemautoinsurance_url_ex_async(
        self,
        request: insurance__saas_models.GetEmbedoemautoinsuranceUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetEmbedoemautoinsuranceUrlResponse:
        """
        Description: 嵌入式主机厂车险url链接获取
        Summary: 嵌入式主机厂车险url链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetEmbedoemautoinsuranceUrlResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.embedoemautoinsurance.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rightplatform_url(
        self,
        request: insurance__saas_models.GetRightplatformUrlRequest,
    ) -> insurance__saas_models.GetRightplatformUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rightplatform_url_ex(request, headers, runtime)

    async def get_rightplatform_url_async(
        self,
        request: insurance__saas_models.GetRightplatformUrlRequest,
    ) -> insurance__saas_models.GetRightplatformUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rightplatform_url_ex_async(request, headers, runtime)

    def get_rightplatform_url_ex(
        self,
        request: insurance__saas_models.GetRightplatformUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetRightplatformUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetRightplatformUrlResponse(),
            self.do_request('1.0', 'antcloud.insurance.rightplatform.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rightplatform_url_ex_async(
        self,
        request: insurance__saas_models.GetRightplatformUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetRightplatformUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetRightplatformUrlResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.rightplatform.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_rightplatform_applyinfo(
        self,
        request: insurance__saas_models.UpdateRightplatformApplyinfoRequest,
    ) -> insurance__saas_models.UpdateRightplatformApplyinfoResponse:
        """
        Description: 更新申请额度状态&投保人信息
        Summary: 更新申请额度状态&投保人信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_rightplatform_applyinfo_ex(request, headers, runtime)

    async def update_rightplatform_applyinfo_async(
        self,
        request: insurance__saas_models.UpdateRightplatformApplyinfoRequest,
    ) -> insurance__saas_models.UpdateRightplatformApplyinfoResponse:
        """
        Description: 更新申请额度状态&投保人信息
        Summary: 更新申请额度状态&投保人信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_rightplatform_applyinfo_ex_async(request, headers, runtime)

    def update_rightplatform_applyinfo_ex(
        self,
        request: insurance__saas_models.UpdateRightplatformApplyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.UpdateRightplatformApplyinfoResponse:
        """
        Description: 更新申请额度状态&投保人信息
        Summary: 更新申请额度状态&投保人信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.UpdateRightplatformApplyinfoResponse(),
            self.do_request('1.0', 'antcloud.insurance.rightplatform.applyinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_rightplatform_applyinfo_ex_async(
        self,
        request: insurance__saas_models.UpdateRightplatformApplyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.UpdateRightplatformApplyinfoResponse:
        """
        Description: 更新申请额度状态&投保人信息
        Summary: 更新申请额度状态&投保人信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.UpdateRightplatformApplyinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.rightplatform.applyinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_interest_scenesubject(
        self,
        request: insurance__saas_models.NotifyInterestScenesubjectRequest,
    ) -> insurance__saas_models.NotifyInterestScenesubjectResponse:
        """
        Description: 场景方标的信息通知
        Summary: 场景方标的信息通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_interest_scenesubject_ex(request, headers, runtime)

    async def notify_interest_scenesubject_async(
        self,
        request: insurance__saas_models.NotifyInterestScenesubjectRequest,
    ) -> insurance__saas_models.NotifyInterestScenesubjectResponse:
        """
        Description: 场景方标的信息通知
        Summary: 场景方标的信息通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_interest_scenesubject_ex_async(request, headers, runtime)

    def notify_interest_scenesubject_ex(
        self,
        request: insurance__saas_models.NotifyInterestScenesubjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyInterestScenesubjectResponse:
        """
        Description: 场景方标的信息通知
        Summary: 场景方标的信息通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyInterestScenesubjectResponse(),
            self.do_request('1.0', 'antcloud.insurance.interest.scenesubject.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_interest_scenesubject_ex_async(
        self,
        request: insurance__saas_models.NotifyInterestScenesubjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyInterestScenesubjectResponse:
        """
        Description: 场景方标的信息通知
        Summary: 场景方标的信息通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyInterestScenesubjectResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.interest.scenesubject.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_interest_suppliersubject(
        self,
        request: insurance__saas_models.QueryInterestSuppliersubjectRequest,
    ) -> insurance__saas_models.QueryInterestSuppliersubjectResponse:
        """
        Description: 权益服务商标的信息查询
        Summary: 权益服务商标的信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_interest_suppliersubject_ex(request, headers, runtime)

    async def query_interest_suppliersubject_async(
        self,
        request: insurance__saas_models.QueryInterestSuppliersubjectRequest,
    ) -> insurance__saas_models.QueryInterestSuppliersubjectResponse:
        """
        Description: 权益服务商标的信息查询
        Summary: 权益服务商标的信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_interest_suppliersubject_ex_async(request, headers, runtime)

    def query_interest_suppliersubject_ex(
        self,
        request: insurance__saas_models.QueryInterestSuppliersubjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInterestSuppliersubjectResponse:
        """
        Description: 权益服务商标的信息查询
        Summary: 权益服务商标的信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInterestSuppliersubjectResponse(),
            self.do_request('1.0', 'antcloud.insurance.interest.suppliersubject.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_interest_suppliersubject_ex_async(
        self,
        request: insurance__saas_models.QueryInterestSuppliersubjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInterestSuppliersubjectResponse:
        """
        Description: 权益服务商标的信息查询
        Summary: 权益服务商标的信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInterestSuppliersubjectResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.interest.suppliersubject.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_interest_supplierpolicy(
        self,
        request: insurance__saas_models.NotifyInterestSupplierpolicyRequest,
    ) -> insurance__saas_models.NotifyInterestSupplierpolicyResponse:
        """
        Description: 权益服务商投保后通知保单信息
        Summary: 权益服务商投保后通知保单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_interest_supplierpolicy_ex(request, headers, runtime)

    async def notify_interest_supplierpolicy_async(
        self,
        request: insurance__saas_models.NotifyInterestSupplierpolicyRequest,
    ) -> insurance__saas_models.NotifyInterestSupplierpolicyResponse:
        """
        Description: 权益服务商投保后通知保单信息
        Summary: 权益服务商投保后通知保单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_interest_supplierpolicy_ex_async(request, headers, runtime)

    def notify_interest_supplierpolicy_ex(
        self,
        request: insurance__saas_models.NotifyInterestSupplierpolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyInterestSupplierpolicyResponse:
        """
        Description: 权益服务商投保后通知保单信息
        Summary: 权益服务商投保后通知保单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyInterestSupplierpolicyResponse(),
            self.do_request('1.0', 'antcloud.insurance.interest.supplierpolicy.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_interest_supplierpolicy_ex_async(
        self,
        request: insurance__saas_models.NotifyInterestSupplierpolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyInterestSupplierpolicyResponse:
        """
        Description: 权益服务商投保后通知保单信息
        Summary: 权益服务商投保后通知保单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyInterestSupplierpolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.interest.supplierpolicy.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_interest_url(
        self,
        request: insurance__saas_models.GetInterestUrlRequest,
    ) -> insurance__saas_models.GetInterestUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_interest_url_ex(request, headers, runtime)

    async def get_interest_url_async(
        self,
        request: insurance__saas_models.GetInterestUrlRequest,
    ) -> insurance__saas_models.GetInterestUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_interest_url_ex_async(request, headers, runtime)

    def get_interest_url_ex(
        self,
        request: insurance__saas_models.GetInterestUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetInterestUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetInterestUrlResponse(),
            self.do_request('1.0', 'antcloud.insurance.interest.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_interest_url_ex_async(
        self,
        request: insurance__saas_models.GetInterestUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetInterestUrlResponse:
        """
        Description: 场景方获取权益链接
        Summary: 场景方获取权益链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetInterestUrlResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.interest.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_interest_sceneorder(
        self,
        request: insurance__saas_models.QueryInterestSceneorderRequest,
    ) -> insurance__saas_models.QueryInterestSceneorderResponse:
        """
        Description: 场景方订单信息查询
        Summary: 场景方订单信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_interest_sceneorder_ex(request, headers, runtime)

    async def query_interest_sceneorder_async(
        self,
        request: insurance__saas_models.QueryInterestSceneorderRequest,
    ) -> insurance__saas_models.QueryInterestSceneorderResponse:
        """
        Description: 场景方订单信息查询
        Summary: 场景方订单信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_interest_sceneorder_ex_async(request, headers, runtime)

    def query_interest_sceneorder_ex(
        self,
        request: insurance__saas_models.QueryInterestSceneorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInterestSceneorderResponse:
        """
        Description: 场景方订单信息查询
        Summary: 场景方订单信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInterestSceneorderResponse(),
            self.do_request('1.0', 'antcloud.insurance.interest.sceneorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_interest_sceneorder_ex_async(
        self,
        request: insurance__saas_models.QueryInterestSceneorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryInterestSceneorderResponse:
        """
        Description: 场景方订单信息查询
        Summary: 场景方订单信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryInterestSceneorderResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.interest.sceneorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_interest_supplierorder(
        self,
        request: insurance__saas_models.NotifyInterestSupplierorderRequest,
    ) -> insurance__saas_models.NotifyInterestSupplierorderResponse:
        """
        Description: 权益服务商订单状态通知
        Summary: 权益服务商订单状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_interest_supplierorder_ex(request, headers, runtime)

    async def notify_interest_supplierorder_async(
        self,
        request: insurance__saas_models.NotifyInterestSupplierorderRequest,
    ) -> insurance__saas_models.NotifyInterestSupplierorderResponse:
        """
        Description: 权益服务商订单状态通知
        Summary: 权益服务商订单状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_interest_supplierorder_ex_async(request, headers, runtime)

    def notify_interest_supplierorder_ex(
        self,
        request: insurance__saas_models.NotifyInterestSupplierorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyInterestSupplierorderResponse:
        """
        Description: 权益服务商订单状态通知
        Summary: 权益服务商订单状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyInterestSupplierorderResponse(),
            self.do_request('1.0', 'antcloud.insurance.interest.supplierorder.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_interest_supplierorder_ex_async(
        self,
        request: insurance__saas_models.NotifyInterestSupplierorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.NotifyInterestSupplierorderResponse:
        """
        Description: 权益服务商订单状态通知
        Summary: 权益服务商订单状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.NotifyInterestSupplierorderResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.interest.supplierorder.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_lead_market(
        self,
        request: insurance__saas_models.ReceiveLeadMarketRequest,
    ) -> insurance__saas_models.ReceiveLeadMarketResponse:
        """
        Description: 车险线索营销结果接收
        Summary: 车险线索营销结果接收
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_lead_market_ex(request, headers, runtime)

    async def receive_lead_market_async(
        self,
        request: insurance__saas_models.ReceiveLeadMarketRequest,
    ) -> insurance__saas_models.ReceiveLeadMarketResponse:
        """
        Description: 车险线索营销结果接收
        Summary: 车险线索营销结果接收
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_lead_market_ex_async(request, headers, runtime)

    def receive_lead_market_ex(
        self,
        request: insurance__saas_models.ReceiveLeadMarketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ReceiveLeadMarketResponse:
        """
        Description: 车险线索营销结果接收
        Summary: 车险线索营销结果接收
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ReceiveLeadMarketResponse(),
            self.do_request('1.0', 'antcloud.insurance.lead.market.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_lead_market_ex_async(
        self,
        request: insurance__saas_models.ReceiveLeadMarketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.ReceiveLeadMarketResponse:
        """
        Description: 车险线索营销结果接收
        Summary: 车险线索营销结果接收
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.ReceiveLeadMarketResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.lead.market.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_marketing_insureurl(
        self,
        request: insurance__saas_models.GetMarketingInsureurlRequest,
    ) -> insurance__saas_models.GetMarketingInsureurlResponse:
        """
        Description: 营销投保短链获取
        Summary: 营销投保短链获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_marketing_insureurl_ex(request, headers, runtime)

    async def get_marketing_insureurl_async(
        self,
        request: insurance__saas_models.GetMarketingInsureurlRequest,
    ) -> insurance__saas_models.GetMarketingInsureurlResponse:
        """
        Description: 营销投保短链获取
        Summary: 营销投保短链获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_marketing_insureurl_ex_async(request, headers, runtime)

    def get_marketing_insureurl_ex(
        self,
        request: insurance__saas_models.GetMarketingInsureurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetMarketingInsureurlResponse:
        """
        Description: 营销投保短链获取
        Summary: 营销投保短链获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetMarketingInsureurlResponse(),
            self.do_request('1.0', 'antcloud.insurance.marketing.insureurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_marketing_insureurl_ex_async(
        self,
        request: insurance__saas_models.GetMarketingInsureurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.GetMarketingInsureurlResponse:
        """
        Description: 营销投保短链获取
        Summary: 营销投保短链获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.GetMarketingInsureurlResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.marketing.insureurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_marketing_event(
        self,
        request: insurance__saas_models.CallbackMarketingEventRequest,
    ) -> insurance__saas_models.CallbackMarketingEventResponse:
        """
        Description: 营销保单出单信息事件回传
        Summary: 营销保单出单信息事件回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_marketing_event_ex(request, headers, runtime)

    async def callback_marketing_event_async(
        self,
        request: insurance__saas_models.CallbackMarketingEventRequest,
    ) -> insurance__saas_models.CallbackMarketingEventResponse:
        """
        Description: 营销保单出单信息事件回传
        Summary: 营销保单出单信息事件回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_marketing_event_ex_async(request, headers, runtime)

    def callback_marketing_event_ex(
        self,
        request: insurance__saas_models.CallbackMarketingEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.CallbackMarketingEventResponse:
        """
        Description: 营销保单出单信息事件回传
        Summary: 营销保单出单信息事件回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.CallbackMarketingEventResponse(),
            self.do_request('1.0', 'antcloud.insurance.marketing.event.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_marketing_event_ex_async(
        self,
        request: insurance__saas_models.CallbackMarketingEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.CallbackMarketingEventResponse:
        """
        Description: 营销保单出单信息事件回传
        Summary: 营销保单出单信息事件回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.CallbackMarketingEventResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.marketing.event.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_marketing_policycancel(
        self,
        request: insurance__saas_models.CallbackMarketingPolicycancelRequest,
    ) -> insurance__saas_models.CallbackMarketingPolicycancelResponse:
        """
        Description: 营销退保信息回传
        Summary: 营销退保事件回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_marketing_policycancel_ex(request, headers, runtime)

    async def callback_marketing_policycancel_async(
        self,
        request: insurance__saas_models.CallbackMarketingPolicycancelRequest,
    ) -> insurance__saas_models.CallbackMarketingPolicycancelResponse:
        """
        Description: 营销退保信息回传
        Summary: 营销退保事件回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_marketing_policycancel_ex_async(request, headers, runtime)

    def callback_marketing_policycancel_ex(
        self,
        request: insurance__saas_models.CallbackMarketingPolicycancelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.CallbackMarketingPolicycancelResponse:
        """
        Description: 营销退保信息回传
        Summary: 营销退保事件回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.CallbackMarketingPolicycancelResponse(),
            self.do_request('1.0', 'antcloud.insurance.marketing.policycancel.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_marketing_policycancel_ex_async(
        self,
        request: insurance__saas_models.CallbackMarketingPolicycancelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.CallbackMarketingPolicycancelResponse:
        """
        Description: 营销退保信息回传
        Summary: 营销退保事件回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.CallbackMarketingPolicycancelResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.marketing.policycancel.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lead_market(
        self,
        request: insurance__saas_models.QueryLeadMarketRequest,
    ) -> insurance__saas_models.QueryLeadMarketResponse:
        """
        Description: 车险线索查询
        Summary: 车险线索查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lead_market_ex(request, headers, runtime)

    async def query_lead_market_async(
        self,
        request: insurance__saas_models.QueryLeadMarketRequest,
    ) -> insurance__saas_models.QueryLeadMarketResponse:
        """
        Description: 车险线索查询
        Summary: 车险线索查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lead_market_ex_async(request, headers, runtime)

    def query_lead_market_ex(
        self,
        request: insurance__saas_models.QueryLeadMarketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryLeadMarketResponse:
        """
        Description: 车险线索查询
        Summary: 车险线索查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryLeadMarketResponse(),
            self.do_request('1.0', 'antcloud.insurance.lead.market.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lead_market_ex_async(
        self,
        request: insurance__saas_models.QueryLeadMarketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurance__saas_models.QueryLeadMarketResponse:
        """
        Description: 车险线索查询
        Summary: 车险线索查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurance__saas_models.QueryLeadMarketResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.lead.market.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
