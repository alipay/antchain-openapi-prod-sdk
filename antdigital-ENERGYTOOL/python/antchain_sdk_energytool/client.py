# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_energytool import models as energytool_models
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
        config: energytool_models.Config,
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
            # 文档切片信息
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
                    'sdk_version': '1.1.2',
                    '_prod_code': 'ENERGYTOOL',
                    '_prod_channel': 'default'
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
            # 文档切片信息
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
                    'sdk_version': '1.1.2',
                    '_prod_code': 'ENERGYTOOL',
                    '_prod_channel': 'default'
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

    def query_realtime_priceforecast(
        self,
        request: energytool_models.QueryRealtimePriceforecastRequest,
    ) -> energytool_models.QueryRealtimePriceforecastResponse:
        """
        Description: 电力交易实时电价预测服务
        Summary: 电力交易实时电价预测服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_realtime_priceforecast_ex(request, headers, runtime)

    async def query_realtime_priceforecast_async(
        self,
        request: energytool_models.QueryRealtimePriceforecastRequest,
    ) -> energytool_models.QueryRealtimePriceforecastResponse:
        """
        Description: 电力交易实时电价预测服务
        Summary: 电力交易实时电价预测服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_realtime_priceforecast_ex_async(request, headers, runtime)

    def query_realtime_priceforecast_ex(
        self,
        request: energytool_models.QueryRealtimePriceforecastRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryRealtimePriceforecastResponse:
        """
        Description: 电力交易实时电价预测服务
        Summary: 电力交易实时电价预测服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryRealtimePriceforecastResponse(),
            self.do_request('1.0', 'antcloud.energytool.realtime.priceforecast.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_realtime_priceforecast_ex_async(
        self,
        request: energytool_models.QueryRealtimePriceforecastRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryRealtimePriceforecastResponse:
        """
        Description: 电力交易实时电价预测服务
        Summary: 电力交易实时电价预测服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryRealtimePriceforecastResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.realtime.priceforecast.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_biddingspace(
        self,
        request: energytool_models.QueryBiddingspaceRequest,
    ) -> energytool_models.QueryBiddingspaceResponse:
        """
        Description: 电力交易竞价空间分析
        Summary: 电力交易竞价空间分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_biddingspace_ex(request, headers, runtime)

    async def query_biddingspace_async(
        self,
        request: energytool_models.QueryBiddingspaceRequest,
    ) -> energytool_models.QueryBiddingspaceResponse:
        """
        Description: 电力交易竞价空间分析
        Summary: 电力交易竞价空间分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_biddingspace_ex_async(request, headers, runtime)

    def query_biddingspace_ex(
        self,
        request: energytool_models.QueryBiddingspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryBiddingspaceResponse:
        """
        Description: 电力交易竞价空间分析
        Summary: 电力交易竞价空间分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryBiddingspaceResponse(),
            self.do_request('1.0', 'antcloud.energytool.biddingspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_biddingspace_ex_async(
        self,
        request: energytool_models.QueryBiddingspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryBiddingspaceResponse:
        """
        Description: 电力交易竞价空间分析
        Summary: 电力交易竞价空间分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryBiddingspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.biddingspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_similarday(
        self,
        request: energytool_models.QuerySimilardayRequest,
    ) -> energytool_models.QuerySimilardayResponse:
        """
        Description: 电力交易相似日竞价空间分析
        Summary: 电力交易相似日竞价空间分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_similarday_ex(request, headers, runtime)

    async def query_similarday_async(
        self,
        request: energytool_models.QuerySimilardayRequest,
    ) -> energytool_models.QuerySimilardayResponse:
        """
        Description: 电力交易相似日竞价空间分析
        Summary: 电力交易相似日竞价空间分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_similarday_ex_async(request, headers, runtime)

    def query_similarday_ex(
        self,
        request: energytool_models.QuerySimilardayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QuerySimilardayResponse:
        """
        Description: 电力交易相似日竞价空间分析
        Summary: 电力交易相似日竞价空间分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QuerySimilardayResponse(),
            self.do_request('1.0', 'antcloud.energytool.similarday.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_similarday_ex_async(
        self,
        request: energytool_models.QuerySimilardayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QuerySimilardayResponse:
        """
        Description: 电力交易相似日竞价空间分析
        Summary: 电力交易相似日竞价空间分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QuerySimilardayResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.similarday.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aheadrealtime_pricecompare(
        self,
        request: energytool_models.QueryAheadrealtimePricecompareRequest,
    ) -> energytool_models.QueryAheadrealtimePricecompareResponse:
        """
        Description: 电力交易日前实时电价对比分析
        Summary: 电力交易日前实时电价对比分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aheadrealtime_pricecompare_ex(request, headers, runtime)

    async def query_aheadrealtime_pricecompare_async(
        self,
        request: energytool_models.QueryAheadrealtimePricecompareRequest,
    ) -> energytool_models.QueryAheadrealtimePricecompareResponse:
        """
        Description: 电力交易日前实时电价对比分析
        Summary: 电力交易日前实时电价对比分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aheadrealtime_pricecompare_ex_async(request, headers, runtime)

    def query_aheadrealtime_pricecompare_ex(
        self,
        request: energytool_models.QueryAheadrealtimePricecompareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryAheadrealtimePricecompareResponse:
        """
        Description: 电力交易日前实时电价对比分析
        Summary: 电力交易日前实时电价对比分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryAheadrealtimePricecompareResponse(),
            self.do_request('1.0', 'antcloud.energytool.aheadrealtime.pricecompare.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aheadrealtime_pricecompare_ex_async(
        self,
        request: energytool_models.QueryAheadrealtimePricecompareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryAheadrealtimePricecompareResponse:
        """
        Description: 电力交易日前实时电价对比分析
        Summary: 电力交易日前实时电价对比分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryAheadrealtimePricecompareResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.aheadrealtime.pricecompare.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aheadrealtime_pricediffprediction(
        self,
        request: energytool_models.QueryAheadrealtimePricediffpredictionRequest,
    ) -> energytool_models.QueryAheadrealtimePricediffpredictionResponse:
        """
        Description: 电力交易日前与实时价差预测
        Summary: 电力交易日前与实时价差预测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aheadrealtime_pricediffprediction_ex(request, headers, runtime)

    async def query_aheadrealtime_pricediffprediction_async(
        self,
        request: energytool_models.QueryAheadrealtimePricediffpredictionRequest,
    ) -> energytool_models.QueryAheadrealtimePricediffpredictionResponse:
        """
        Description: 电力交易日前与实时价差预测
        Summary: 电力交易日前与实时价差预测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aheadrealtime_pricediffprediction_ex_async(request, headers, runtime)

    def query_aheadrealtime_pricediffprediction_ex(
        self,
        request: energytool_models.QueryAheadrealtimePricediffpredictionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryAheadrealtimePricediffpredictionResponse:
        """
        Description: 电力交易日前与实时价差预测
        Summary: 电力交易日前与实时价差预测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryAheadrealtimePricediffpredictionResponse(),
            self.do_request('1.0', 'antcloud.energytool.aheadrealtime.pricediffprediction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aheadrealtime_pricediffprediction_ex_async(
        self,
        request: energytool_models.QueryAheadrealtimePricediffpredictionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryAheadrealtimePricediffpredictionResponse:
        """
        Description: 电力交易日前与实时价差预测
        Summary: 电力交易日前与实时价差预测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryAheadrealtimePricediffpredictionResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.aheadrealtime.pricediffprediction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_weather_warning(
        self,
        request: energytool_models.QueryWeatherWarningRequest,
    ) -> energytool_models.QueryWeatherWarningResponse:
        """
        Description: 气象预警信息查询
        Summary: 气象预警信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_weather_warning_ex(request, headers, runtime)

    async def query_weather_warning_async(
        self,
        request: energytool_models.QueryWeatherWarningRequest,
    ) -> energytool_models.QueryWeatherWarningResponse:
        """
        Description: 气象预警信息查询
        Summary: 气象预警信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_weather_warning_ex_async(request, headers, runtime)

    def query_weather_warning_ex(
        self,
        request: energytool_models.QueryWeatherWarningRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryWeatherWarningResponse:
        """
        Description: 气象预警信息查询
        Summary: 气象预警信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryWeatherWarningResponse(),
            self.do_request('1.0', 'antcloud.energytool.weather.warning.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_weather_warning_ex_async(
        self,
        request: energytool_models.QueryWeatherWarningRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryWeatherWarningResponse:
        """
        Description: 气象预警信息查询
        Summary: 气象预警信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryWeatherWarningResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.weather.warning.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_km_version(
        self,
        request: energytool_models.QueryKmVersionRequest,
    ) -> energytool_models.QueryKmVersionResponse:
        """
        Description: 知识版本查询
        Summary: 知识版本查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_km_version_ex(request, headers, runtime)

    async def query_km_version_async(
        self,
        request: energytool_models.QueryKmVersionRequest,
    ) -> energytool_models.QueryKmVersionResponse:
        """
        Description: 知识版本查询
        Summary: 知识版本查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_km_version_ex_async(request, headers, runtime)

    def query_km_version_ex(
        self,
        request: energytool_models.QueryKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryKmVersionResponse:
        """
        Description: 知识版本查询
        Summary: 知识版本查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryKmVersionResponse(),
            self.do_request('1.0', 'antcloud.energytool.km.version.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_km_version_ex_async(
        self,
        request: energytool_models.QueryKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryKmVersionResponse:
        """
        Description: 知识版本查询
        Summary: 知识版本查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryKmVersionResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.km.version.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_km_version(
        self,
        request: energytool_models.SyncKmVersionRequest,
    ) -> energytool_models.SyncKmVersionResponse:
        """
        Description: 同步版本内容详情
        Summary: 同步版本内容详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_km_version_ex(request, headers, runtime)

    async def sync_km_version_async(
        self,
        request: energytool_models.SyncKmVersionRequest,
    ) -> energytool_models.SyncKmVersionResponse:
        """
        Description: 同步版本内容详情
        Summary: 同步版本内容详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_km_version_ex_async(request, headers, runtime)

    def sync_km_version_ex(
        self,
        request: energytool_models.SyncKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.SyncKmVersionResponse:
        """
        Description: 同步版本内容详情
        Summary: 同步版本内容详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.SyncKmVersionResponse(),
            self.do_request('1.0', 'antcloud.energytool.km.version.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_km_version_ex_async(
        self,
        request: energytool_models.SyncKmVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.SyncKmVersionResponse:
        """
        Description: 同步版本内容详情
        Summary: 同步版本内容详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.SyncKmVersionResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.km.version.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_km_document(
        self,
        request: energytool_models.SyncKmDocumentRequest,
    ) -> energytool_models.SyncKmDocumentResponse:
        """
        Description: 获取文档详情
        Summary: 获取文档详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_km_document_ex(request, headers, runtime)

    async def sync_km_document_async(
        self,
        request: energytool_models.SyncKmDocumentRequest,
    ) -> energytool_models.SyncKmDocumentResponse:
        """
        Description: 获取文档详情
        Summary: 获取文档详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_km_document_ex_async(request, headers, runtime)

    def sync_km_document_ex(
        self,
        request: energytool_models.SyncKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.SyncKmDocumentResponse:
        """
        Description: 获取文档详情
        Summary: 获取文档详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.SyncKmDocumentResponse(),
            self.do_request('1.0', 'antcloud.energytool.km.document.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_km_document_ex_async(
        self,
        request: energytool_models.SyncKmDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.SyncKmDocumentResponse:
        """
        Description: 获取文档详情
        Summary: 获取文档详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.SyncKmDocumentResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.km.document.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_km_rag(
        self,
        request: energytool_models.QueryKmRagRequest,
    ) -> energytool_models.QueryKmRagResponse:
        """
        Description: 知识图谱对外开放rag检索
        Summary: 知识图谱对外开放rag检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_km_rag_ex(request, headers, runtime)

    async def query_km_rag_async(
        self,
        request: energytool_models.QueryKmRagRequest,
    ) -> energytool_models.QueryKmRagResponse:
        """
        Description: 知识图谱对外开放rag检索
        Summary: 知识图谱对外开放rag检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_km_rag_ex_async(request, headers, runtime)

    def query_km_rag_ex(
        self,
        request: energytool_models.QueryKmRagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryKmRagResponse:
        """
        Description: 知识图谱对外开放rag检索
        Summary: 知识图谱对外开放rag检索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryKmRagResponse(),
            self.do_request('1.0', 'antcloud.energytool.km.rag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_km_rag_ex_async(
        self,
        request: energytool_models.QueryKmRagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryKmRagResponse:
        """
        Description: 知识图谱对外开放rag检索
        Summary: 知识图谱对外开放rag检索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryKmRagResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.km.rag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_panoraindex_policy(
        self,
        request: energytool_models.QueryPanoraindexPolicyRequest,
    ) -> energytool_models.QueryPanoraindexPolicyResponse:
        """
        Description: 能源数采对外开放api
        Summary: 能源数采对外开放api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_panoraindex_policy_ex(request, headers, runtime)

    async def query_panoraindex_policy_async(
        self,
        request: energytool_models.QueryPanoraindexPolicyRequest,
    ) -> energytool_models.QueryPanoraindexPolicyResponse:
        """
        Description: 能源数采对外开放api
        Summary: 能源数采对外开放api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_panoraindex_policy_ex_async(request, headers, runtime)

    def query_panoraindex_policy_ex(
        self,
        request: energytool_models.QueryPanoraindexPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryPanoraindexPolicyResponse:
        """
        Description: 能源数采对外开放api
        Summary: 能源数采对外开放api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryPanoraindexPolicyResponse(),
            self.do_request('1.0', 'antcloud.energytool.panoraindex.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_panoraindex_policy_ex_async(
        self,
        request: energytool_models.QueryPanoraindexPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryPanoraindexPolicyResponse:
        """
        Description: 能源数采对外开放api
        Summary: 能源数采对外开放api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryPanoraindexPolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.panoraindex.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traderesult(
        self,
        request: energytool_models.QueryTraderesultRequest,
    ) -> energytool_models.QueryTraderesultResponse:
        """
        Description: 虚拟交易团队接入appaccesscenter
        Summary: 虚拟交易团队接入appaccesscenter
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traderesult_ex(request, headers, runtime)

    async def query_traderesult_async(
        self,
        request: energytool_models.QueryTraderesultRequest,
    ) -> energytool_models.QueryTraderesultResponse:
        """
        Description: 虚拟交易团队接入appaccesscenter
        Summary: 虚拟交易团队接入appaccesscenter
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traderesult_ex_async(request, headers, runtime)

    def query_traderesult_ex(
        self,
        request: energytool_models.QueryTraderesultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryTraderesultResponse:
        """
        Description: 虚拟交易团队接入appaccesscenter
        Summary: 虚拟交易团队接入appaccesscenter
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryTraderesultResponse(),
            self.do_request('1.0', 'antcloud.energytool.traderesult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traderesult_ex_async(
        self,
        request: energytool_models.QueryTraderesultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryTraderesultResponse:
        """
        Description: 虚拟交易团队接入appaccesscenter
        Summary: 虚拟交易团队接入appaccesscenter
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryTraderesultResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.traderesult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_electric_marketprice(
        self,
        request: energytool_models.QueryElectricMarketpriceRequest,
    ) -> energytool_models.QueryElectricMarketpriceResponse:
        """
        Description: 电力行情主数据接口
        Summary: 电力行情主数据接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_electric_marketprice_ex(request, headers, runtime)

    async def query_electric_marketprice_async(
        self,
        request: energytool_models.QueryElectricMarketpriceRequest,
    ) -> energytool_models.QueryElectricMarketpriceResponse:
        """
        Description: 电力行情主数据接口
        Summary: 电力行情主数据接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_electric_marketprice_ex_async(request, headers, runtime)

    def query_electric_marketprice_ex(
        self,
        request: energytool_models.QueryElectricMarketpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryElectricMarketpriceResponse:
        """
        Description: 电力行情主数据接口
        Summary: 电力行情主数据接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryElectricMarketpriceResponse(),
            self.do_request('1.0', 'antcloud.energytool.electric.marketprice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_electric_marketprice_ex_async(
        self,
        request: energytool_models.QueryElectricMarketpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> energytool_models.QueryElectricMarketpriceResponse:
        """
        Description: 电力行情主数据接口
        Summary: 电力行情主数据接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            energytool_models.QueryElectricMarketpriceResponse(),
            await self.do_request_async('1.0', 'antcloud.energytool.electric.marketprice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
