# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_yuqing import models as yuqing_models
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
        config: yuqing_models.Config,
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
            # 钉钉链接消息
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
                    'sdk_version': '1.2.21',
                    '_prod_code': 'YUQING',
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
            # 钉钉链接消息
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
                    'sdk_version': '1.2.21',
                    '_prod_code': 'YUQING',
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

    def query_messages(
        self,
        request: yuqing_models.QueryMessagesRequest,
    ) -> yuqing_models.QueryMessagesResponse:
        """
        Description: 查询舆情列表
        Summary: 查询舆情列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_messages_ex(request, headers, runtime)

    async def query_messages_async(
        self,
        request: yuqing_models.QueryMessagesRequest,
    ) -> yuqing_models.QueryMessagesResponse:
        """
        Description: 查询舆情列表
        Summary: 查询舆情列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_messages_ex_async(request, headers, runtime)

    def query_messages_ex(
        self,
        request: yuqing_models.QueryMessagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryMessagesResponse:
        """
        Description: 查询舆情列表
        Summary: 查询舆情列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryMessagesResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.messages.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_messages_ex_async(
        self,
        request: yuqing_models.QueryMessagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryMessagesResponse:
        """
        Description: 查询舆情列表
        Summary: 查询舆情列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryMessagesResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.messages.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_analysis_submit(
        self,
        request: yuqing_models.SaveAnalysisSubmitRequest,
    ) -> yuqing_models.SaveAnalysisSubmitResponse:
        """
        Description: 舆情分析任务提交
        Summary: 舆情分析任务提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_analysis_submit_ex(request, headers, runtime)

    async def save_analysis_submit_async(
        self,
        request: yuqing_models.SaveAnalysisSubmitRequest,
    ) -> yuqing_models.SaveAnalysisSubmitResponse:
        """
        Description: 舆情分析任务提交
        Summary: 舆情分析任务提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_analysis_submit_ex_async(request, headers, runtime)

    def save_analysis_submit_ex(
        self,
        request: yuqing_models.SaveAnalysisSubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveAnalysisSubmitResponse:
        """
        Description: 舆情分析任务提交
        Summary: 舆情分析任务提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveAnalysisSubmitResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.analysis.submit.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_analysis_submit_ex_async(
        self,
        request: yuqing_models.SaveAnalysisSubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveAnalysisSubmitResponse:
        """
        Description: 舆情分析任务提交
        Summary: 舆情分析任务提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveAnalysisSubmitResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.analysis.submit.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_analysis_query(
        self,
        request: yuqing_models.QueryAnalysisQueryRequest,
    ) -> yuqing_models.QueryAnalysisQueryResponse:
        """
        Description: 舆情分析任务查询
        Summary: 舆情分析任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_analysis_query_ex(request, headers, runtime)

    async def query_analysis_query_async(
        self,
        request: yuqing_models.QueryAnalysisQueryRequest,
    ) -> yuqing_models.QueryAnalysisQueryResponse:
        """
        Description: 舆情分析任务查询
        Summary: 舆情分析任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_analysis_query_ex_async(request, headers, runtime)

    def query_analysis_query_ex(
        self,
        request: yuqing_models.QueryAnalysisQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryAnalysisQueryResponse:
        """
        Description: 舆情分析任务查询
        Summary: 舆情分析任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryAnalysisQueryResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.analysis.query.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_analysis_query_ex_async(
        self,
        request: yuqing_models.QueryAnalysisQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryAnalysisQueryResponse:
        """
        Description: 舆情分析任务查询
        Summary: 舆情分析任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryAnalysisQueryResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.analysis.query.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_product_open(
        self,
        request: yuqing_models.SaveProductOpenRequest,
    ) -> yuqing_models.SaveProductOpenResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_product_open_ex(request, headers, runtime)

    async def save_product_open_async(
        self,
        request: yuqing_models.SaveProductOpenRequest,
    ) -> yuqing_models.SaveProductOpenResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_product_open_ex_async(request, headers, runtime)

    def save_product_open_ex(
        self,
        request: yuqing_models.SaveProductOpenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveProductOpenResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveProductOpenResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.product.open.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_product_open_ex_async(
        self,
        request: yuqing_models.SaveProductOpenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveProductOpenResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveProductOpenResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.product.open.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_product_top(
        self,
        request: yuqing_models.SaveProductTopRequest,
    ) -> yuqing_models.SaveProductTopResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_product_top_ex(request, headers, runtime)

    async def save_product_top_async(
        self,
        request: yuqing_models.SaveProductTopRequest,
    ) -> yuqing_models.SaveProductTopResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_product_top_ex_async(request, headers, runtime)

    def save_product_top_ex(
        self,
        request: yuqing_models.SaveProductTopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveProductTopResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveProductTopResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.product.top.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_product_top_ex_async(
        self,
        request: yuqing_models.SaveProductTopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveProductTopResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveProductTopResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.product.top.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_product_operate(
        self,
        request: yuqing_models.SetProductOperateRequest,
    ) -> yuqing_models.SetProductOperateResponse:
        """
        Description: 产品操作接口
        Summary: 产品操作接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_product_operate_ex(request, headers, runtime)

    async def set_product_operate_async(
        self,
        request: yuqing_models.SetProductOperateRequest,
    ) -> yuqing_models.SetProductOperateResponse:
        """
        Description: 产品操作接口
        Summary: 产品操作接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_product_operate_ex_async(request, headers, runtime)

    def set_product_operate_ex(
        self,
        request: yuqing_models.SetProductOperateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SetProductOperateResponse:
        """
        Description: 产品操作接口
        Summary: 产品操作接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SetProductOperateResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.product.operate.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_product_operate_ex_async(
        self,
        request: yuqing_models.SetProductOperateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SetProductOperateResponse:
        """
        Description: 产品操作接口
        Summary: 产品操作接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SetProductOperateResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.product.operate.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_product_notice(
        self,
        request: yuqing_models.SendProductNoticeRequest,
    ) -> yuqing_models.SendProductNoticeResponse:
        """
        Description: 发送提醒
        Summary: 发送提醒
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_product_notice_ex(request, headers, runtime)

    async def send_product_notice_async(
        self,
        request: yuqing_models.SendProductNoticeRequest,
    ) -> yuqing_models.SendProductNoticeResponse:
        """
        Description: 发送提醒
        Summary: 发送提醒
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_product_notice_ex_async(request, headers, runtime)

    def send_product_notice_ex(
        self,
        request: yuqing_models.SendProductNoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SendProductNoticeResponse:
        """
        Description: 发送提醒
        Summary: 发送提醒
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SendProductNoticeResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.product.notice.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_product_notice_ex_async(
        self,
        request: yuqing_models.SendProductNoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SendProductNoticeResponse:
        """
        Description: 发送提醒
        Summary: 发送提醒
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SendProductNoticeResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.product.notice.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_deepanalysis_submit(
        self,
        request: yuqing_models.SaveDeepanalysisSubmitRequest,
    ) -> yuqing_models.SaveDeepanalysisSubmitResponse:
        """
        Description: 创建深度分析
        Summary: 创建深度分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_deepanalysis_submit_ex(request, headers, runtime)

    async def save_deepanalysis_submit_async(
        self,
        request: yuqing_models.SaveDeepanalysisSubmitRequest,
    ) -> yuqing_models.SaveDeepanalysisSubmitResponse:
        """
        Description: 创建深度分析
        Summary: 创建深度分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_deepanalysis_submit_ex_async(request, headers, runtime)

    def save_deepanalysis_submit_ex(
        self,
        request: yuqing_models.SaveDeepanalysisSubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveDeepanalysisSubmitResponse:
        """
        Description: 创建深度分析
        Summary: 创建深度分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveDeepanalysisSubmitResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.deepanalysis.submit.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_deepanalysis_submit_ex_async(
        self,
        request: yuqing_models.SaveDeepanalysisSubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SaveDeepanalysisSubmitResponse:
        """
        Description: 创建深度分析
        Summary: 创建深度分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SaveDeepanalysisSubmitResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.deepanalysis.submit.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deepanalysis_query(
        self,
        request: yuqing_models.QueryDeepanalysisQueryRequest,
    ) -> yuqing_models.QueryDeepanalysisQueryResponse:
        """
        Description: 查询深度分析
        Summary: 查询深度分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deepanalysis_query_ex(request, headers, runtime)

    async def query_deepanalysis_query_async(
        self,
        request: yuqing_models.QueryDeepanalysisQueryRequest,
    ) -> yuqing_models.QueryDeepanalysisQueryResponse:
        """
        Description: 查询深度分析
        Summary: 查询深度分析
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deepanalysis_query_ex_async(request, headers, runtime)

    def query_deepanalysis_query_ex(
        self,
        request: yuqing_models.QueryDeepanalysisQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryDeepanalysisQueryResponse:
        """
        Description: 查询深度分析
        Summary: 查询深度分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryDeepanalysisQueryResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.deepanalysis.query.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deepanalysis_query_ex_async(
        self,
        request: yuqing_models.QueryDeepanalysisQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryDeepanalysisQueryResponse:
        """
        Description: 查询深度分析
        Summary: 查询深度分析
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryDeepanalysisQueryResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.deepanalysis.query.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_message(
        self,
        request: yuqing_models.GetMessageRequest,
    ) -> yuqing_models.GetMessageResponse:
        """
        Description: 获取单个與情
        Summary: 获取单个
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_message_ex(request, headers, runtime)

    async def get_message_async(
        self,
        request: yuqing_models.GetMessageRequest,
    ) -> yuqing_models.GetMessageResponse:
        """
        Description: 获取单个與情
        Summary: 获取单个
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_message_ex_async(request, headers, runtime)

    def get_message_ex(
        self,
        request: yuqing_models.GetMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetMessageResponse:
        """
        Description: 获取单个與情
        Summary: 获取单个
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetMessageResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.message.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_message_ex_async(
        self,
        request: yuqing_models.GetMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetMessageResponse:
        """
        Description: 获取单个與情
        Summary: 获取单个
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetMessageResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.message.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_project(
        self,
        request: yuqing_models.QueryProjectRequest,
    ) -> yuqing_models.QueryProjectResponse:
        """
        Description: 查询與情项目
        Summary: 查询與情项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_project_ex(request, headers, runtime)

    async def query_project_async(
        self,
        request: yuqing_models.QueryProjectRequest,
    ) -> yuqing_models.QueryProjectResponse:
        """
        Description: 查询與情项目
        Summary: 查询與情项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_project_ex_async(request, headers, runtime)

    def query_project_ex(
        self,
        request: yuqing_models.QueryProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryProjectResponse:
        """
        Description: 查询與情项目
        Summary: 查询與情项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryProjectResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_project_ex_async(
        self,
        request: yuqing_models.QueryProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryProjectResponse:
        """
        Description: 查询與情项目
        Summary: 查询與情项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryProjectResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_project(
        self,
        request: yuqing_models.CreateProjectRequest,
    ) -> yuqing_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_project_ex(request, headers, runtime)

    async def create_project_async(
        self,
        request: yuqing_models.CreateProjectRequest,
    ) -> yuqing_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_project_ex_async(request, headers, runtime)

    def create_project_ex(
        self,
        request: yuqing_models.CreateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.CreateProjectResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_project_ex_async(
        self,
        request: yuqing_models.CreateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.CreateProjectResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_project(
        self,
        request: yuqing_models.DeleteProjectRequest,
    ) -> yuqing_models.DeleteProjectResponse:
        """
        Description: 删除项目
        Summary: 删除项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_project_ex(request, headers, runtime)

    async def delete_project_async(
        self,
        request: yuqing_models.DeleteProjectRequest,
    ) -> yuqing_models.DeleteProjectResponse:
        """
        Description: 删除项目
        Summary: 删除项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_project_ex_async(request, headers, runtime)

    def delete_project_ex(
        self,
        request: yuqing_models.DeleteProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.DeleteProjectResponse:
        """
        Description: 删除项目
        Summary: 删除项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.DeleteProjectResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.project.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_project_ex_async(
        self,
        request: yuqing_models.DeleteProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.DeleteProjectResponse:
        """
        Description: 删除项目
        Summary: 删除项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.DeleteProjectResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.project.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm(
        self,
        request: yuqing_models.QueryAlarmRequest,
    ) -> yuqing_models.QueryAlarmResponse:
        """
        Description: 查询预警消息列表
        Summary: 查询预警消息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_ex(request, headers, runtime)

    async def query_alarm_async(
        self,
        request: yuqing_models.QueryAlarmRequest,
    ) -> yuqing_models.QueryAlarmResponse:
        """
        Description: 查询预警消息列表
        Summary: 查询预警消息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_ex_async(request, headers, runtime)

    def query_alarm_ex(
        self,
        request: yuqing_models.QueryAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryAlarmResponse:
        """
        Description: 查询预警消息列表
        Summary: 查询预警消息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryAlarmResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.alarm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_ex_async(
        self,
        request: yuqing_models.QueryAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryAlarmResponse:
        """
        Description: 查询预警消息列表
        Summary: 查询预警消息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryAlarmResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.alarm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_hotspot_message(
        self,
        request: yuqing_models.QueryHotspotMessageRequest,
    ) -> yuqing_models.QueryHotspotMessageResponse:
        """
        Description: 根据接口获取热搜数据
        Summary: 與情热搜接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_hotspot_message_ex(request, headers, runtime)

    async def query_hotspot_message_async(
        self,
        request: yuqing_models.QueryHotspotMessageRequest,
    ) -> yuqing_models.QueryHotspotMessageResponse:
        """
        Description: 根据接口获取热搜数据
        Summary: 與情热搜接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_hotspot_message_ex_async(request, headers, runtime)

    def query_hotspot_message_ex(
        self,
        request: yuqing_models.QueryHotspotMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryHotspotMessageResponse:
        """
        Description: 根据接口获取热搜数据
        Summary: 與情热搜接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryHotspotMessageResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.hotspot.message.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_hotspot_message_ex_async(
        self,
        request: yuqing_models.QueryHotspotMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.QueryHotspotMessageResponse:
        """
        Description: 根据接口获取热搜数据
        Summary: 與情热搜接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.QueryHotspotMessageResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.hotspot.message.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_messages_history(
        self,
        request: yuqing_models.SubmitMessagesHistoryRequest,
    ) -> yuqing_models.SubmitMessagesHistoryResponse:
        """
        Description: 與情历史数据异步查询接口
        Summary: 與情历史数据异步查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_messages_history_ex(request, headers, runtime)

    async def submit_messages_history_async(
        self,
        request: yuqing_models.SubmitMessagesHistoryRequest,
    ) -> yuqing_models.SubmitMessagesHistoryResponse:
        """
        Description: 與情历史数据异步查询接口
        Summary: 與情历史数据异步查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_messages_history_ex_async(request, headers, runtime)

    def submit_messages_history_ex(
        self,
        request: yuqing_models.SubmitMessagesHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SubmitMessagesHistoryResponse:
        """
        Description: 與情历史数据异步查询接口
        Summary: 與情历史数据异步查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SubmitMessagesHistoryResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.messages.history.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_messages_history_ex_async(
        self,
        request: yuqing_models.SubmitMessagesHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SubmitMessagesHistoryResponse:
        """
        Description: 與情历史数据异步查询接口
        Summary: 與情历史数据异步查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SubmitMessagesHistoryResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.messages.history.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_messages_history(
        self,
        request: yuqing_models.GetMessagesHistoryRequest,
    ) -> yuqing_models.GetMessagesHistoryResponse:
        """
        Description: 获取历史與情消息
        Summary: 获取历史與情消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_messages_history_ex(request, headers, runtime)

    async def get_messages_history_async(
        self,
        request: yuqing_models.GetMessagesHistoryRequest,
    ) -> yuqing_models.GetMessagesHistoryResponse:
        """
        Description: 获取历史與情消息
        Summary: 获取历史與情消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_messages_history_ex_async(request, headers, runtime)

    def get_messages_history_ex(
        self,
        request: yuqing_models.GetMessagesHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetMessagesHistoryResponse:
        """
        Description: 获取历史與情消息
        Summary: 获取历史與情消息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetMessagesHistoryResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.messages.history.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_messages_history_ex_async(
        self,
        request: yuqing_models.GetMessagesHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetMessagesHistoryResponse:
        """
        Description: 获取历史與情消息
        Summary: 获取历史與情消息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetMessagesHistoryResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.messages.history.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_hotspot_task(
        self,
        request: yuqing_models.SubmitHotspotTaskRequest,
    ) -> yuqing_models.SubmitHotspotTaskResponse:
        """
        Description: 提交实时热搜任务
        Summary: 提交实时热搜任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_hotspot_task_ex(request, headers, runtime)

    async def submit_hotspot_task_async(
        self,
        request: yuqing_models.SubmitHotspotTaskRequest,
    ) -> yuqing_models.SubmitHotspotTaskResponse:
        """
        Description: 提交实时热搜任务
        Summary: 提交实时热搜任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_hotspot_task_ex_async(request, headers, runtime)

    def submit_hotspot_task_ex(
        self,
        request: yuqing_models.SubmitHotspotTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SubmitHotspotTaskResponse:
        """
        Description: 提交实时热搜任务
        Summary: 提交实时热搜任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SubmitHotspotTaskResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.hotspot.task.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_hotspot_task_ex_async(
        self,
        request: yuqing_models.SubmitHotspotTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.SubmitHotspotTaskResponse:
        """
        Description: 提交实时热搜任务
        Summary: 提交实时热搜任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.SubmitHotspotTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.hotspot.task.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_hotspot_task(
        self,
        request: yuqing_models.GetHotspotTaskRequest,
    ) -> yuqing_models.GetHotspotTaskResponse:
        """
        Description: 获取实时热搜任务结果
        Summary: 获取实时热搜任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_hotspot_task_ex(request, headers, runtime)

    async def get_hotspot_task_async(
        self,
        request: yuqing_models.GetHotspotTaskRequest,
    ) -> yuqing_models.GetHotspotTaskResponse:
        """
        Description: 获取实时热搜任务结果
        Summary: 获取实时热搜任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_hotspot_task_ex_async(request, headers, runtime)

    def get_hotspot_task_ex(
        self,
        request: yuqing_models.GetHotspotTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetHotspotTaskResponse:
        """
        Description: 获取实时热搜任务结果
        Summary: 获取实时热搜任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetHotspotTaskResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.hotspot.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_hotspot_task_ex_async(
        self,
        request: yuqing_models.GetHotspotTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetHotspotTaskResponse:
        """
        Description: 获取实时热搜任务结果
        Summary: 获取实时热搜任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetHotspotTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.hotspot.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sts_token(
        self,
        request: yuqing_models.GetStsTokenRequest,
    ) -> yuqing_models.GetStsTokenResponse:
        """
        Description: 获取stsToken，作用于通用SAAS业务
        Summary: 获取stsToken
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sts_token_ex(request, headers, runtime)

    async def get_sts_token_async(
        self,
        request: yuqing_models.GetStsTokenRequest,
    ) -> yuqing_models.GetStsTokenResponse:
        """
        Description: 获取stsToken，作用于通用SAAS业务
        Summary: 获取stsToken
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sts_token_ex_async(request, headers, runtime)

    def get_sts_token_ex(
        self,
        request: yuqing_models.GetStsTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetStsTokenResponse:
        """
        Description: 获取stsToken，作用于通用SAAS业务
        Summary: 获取stsToken
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetStsTokenResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.sts.token.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sts_token_ex_async(
        self,
        request: yuqing_models.GetStsTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.GetStsTokenResponse:
        """
        Description: 获取stsToken，作用于通用SAAS业务
        Summary: 获取stsToken
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.GetStsTokenResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.sts.token.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_common_interface(
        self,
        request: yuqing_models.OperateCommonInterfaceRequest,
    ) -> yuqing_models.OperateCommonInterfaceResponse:
        """
        Description: 通用操作接口
        Summary: 通用操作接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_common_interface_ex(request, headers, runtime)

    async def operate_common_interface_async(
        self,
        request: yuqing_models.OperateCommonInterfaceRequest,
    ) -> yuqing_models.OperateCommonInterfaceResponse:
        """
        Description: 通用操作接口
        Summary: 通用操作接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_common_interface_ex_async(request, headers, runtime)

    def operate_common_interface_ex(
        self,
        request: yuqing_models.OperateCommonInterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.OperateCommonInterfaceResponse:
        """
        Description: 通用操作接口
        Summary: 通用操作接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.OperateCommonInterfaceResponse(),
            self.do_request('1.0', 'universalsaas.yuqing.common.interface.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_common_interface_ex_async(
        self,
        request: yuqing_models.OperateCommonInterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yuqing_models.OperateCommonInterfaceResponse:
        """
        Description: 通用操作接口
        Summary: 通用操作接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yuqing_models.OperateCommonInterfaceResponse(),
            await self.do_request_async('1.0', 'universalsaas.yuqing.common.interface.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
