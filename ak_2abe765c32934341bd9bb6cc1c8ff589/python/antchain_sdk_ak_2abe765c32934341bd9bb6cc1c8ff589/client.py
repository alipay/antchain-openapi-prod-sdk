# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_2abe765c32934341bd9bb6cc1c8ff589 import models as ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models
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
        config: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.Config,
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
            # 订单包含的单个商品模型
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_2abe765c32934341bd9bb6cc1c8ff589',
                    '_prod_channel': 'saas'
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
            # 订单包含的单个商品模型
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_2abe765c32934341bd9bb6cc1c8ff589',
                    '_prod_channel': 'saas'
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

    def sync_antchain_ato_trade(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_trade(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_trade_ex(request, headers, runtime)

    async def get_antchain_ato_trade_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_trade_ex_async(request, headers, runtime)

    def get_antchain_ato_trade_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_trade_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_realperson_facevrf(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_realperson_facevrf_ex(request, headers, runtime)

    async def create_antchain_ato_realperson_facevrf_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_realperson_facevrf_ex_async(request, headers, runtime)

    def create_antchain_ato_realperson_facevrf_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_realperson_facevrf_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_realperson_facevrf(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_realperson_facevrf_ex(request, headers, runtime)

    async def query_antchain_ato_realperson_facevrf_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_realperson_facevrf_ex_async(request, headers, runtime)

    def query_antchain_ato_realperson_facevrf_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_realperson_facevrf_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_antchain_ato_sign_template(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_antchain_ato_sign_template_ex(request, headers, runtime)

    async def all_antchain_ato_sign_template_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_antchain_ato_sign_template_ex_async(request, headers, runtime)

    def all_antchain_ato_sign_template_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_antchain_ato_sign_template_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AllAntchainAtoSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_antchain_ato_sign_flow(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程
        Summary: 提交电子合同的签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def submit_antchain_ato_sign_flow_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程
        Summary: 提交电子合同的签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def submit_antchain_ato_sign_flow_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程
        Summary: 提交电子合同的签署流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程
        Summary: 提交电子合同的签署流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SubmitAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_sign_flow(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def get_antchain_ato_sign_flow_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def get_antchain_ato_sign_flow_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_splitting(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 分账流水同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_splitting_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_splitting_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 分账流水同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_splitting_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_splitting_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 分账流水同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingResponse(),
            self.do_request('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_splitting_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 分账流水同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundSplittingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_orderfinancial(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 订单融资结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_orderfinancial_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_orderfinancial_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 订单融资结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_orderfinancial_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_orderfinancial_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 订单融资结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_orderfinancial_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 订单融资结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfinancialResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_repaymentplan(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanResponse:
        """
        Description: 将返回订单实人认证通过后的、商家同步的还款计划
        Summary: 获取商家同步的还款计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_repaymentplan_ex(request, headers, runtime)

    async def get_antchain_ato_fund_repaymentplan_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanResponse:
        """
        Description: 将返回订单实人认证通过后的、商家同步的还款计划
        Summary: 获取商家同步的还款计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_repaymentplan_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_repaymentplan_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanResponse:
        """
        Description: 将返回订单实人认证通过后的、商家同步的还款计划
        Summary: 获取商家同步的还款计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanResponse(),
            self.do_request('1.0', 'antchain.ato.fund.repaymentplan.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_repaymentplan_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanResponse:
        """
        Description: 将返回订单实人认证通过后的、商家同步的还款计划
        Summary: 获取商家同步的还款计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundRepaymentplanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.repaymentplan.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_withholdingcontract(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 同步租赁订单的代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_withholdingcontract_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_withholdingcontract_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 同步租赁订单的代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_withholdingcontract_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_withholdingcontract_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 同步租赁订单的代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractResponse(),
            self.do_request('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_withholdingcontract_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 同步租赁订单的代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundWithholdingcontractResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_orderfulfillment(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 同步订单还款履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_orderfulfillment_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_orderfulfillment_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 同步订单还款履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_orderfulfillment_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_orderfulfillment_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 同步订单还款履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_orderfulfillment_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 同步订单还款履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoFundOrderfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_orderfulfillment(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 获取订单的履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_orderfulfillment_ex(request, headers, runtime)

    async def get_antchain_ato_fund_orderfulfillment_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 获取订单的履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_orderfulfillment_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_orderfulfillment_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 获取订单的履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_orderfulfillment_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 获取订单的履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.GetAntchainAtoFundOrderfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_withhold_sign(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_withhold_sign_ex(request, headers, runtime)

    async def create_antchain_ato_withhold_sign_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_withhold_sign_ex_async(request, headers, runtime)

    def create_antchain_ato_withhold_sign_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_withhold_sign_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CreateAntchainAtoWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_withhold_sign(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_withhold_sign_ex(request, headers, runtime)

    async def query_antchain_ato_withhold_sign_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_withhold_sign_ex_async(request, headers, runtime)

    def query_antchain_ato_withhold_sign_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_withhold_sign_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.QueryAntchainAtoWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_trade_full(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullResponse:
        """
        Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
        Summary: 同步商家的订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_full_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_full_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullResponse:
        """
        Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
        Summary: 同步商家的订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_full_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_full_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullResponse:
        """
        Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
        Summary: 同步商家的订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullResponse(),
            self.do_request('1.0', 'antchain.ato.trade.full.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_full_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullResponse:
        """
        Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
        Summary: 同步商家的订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.SyncAntchainAtoTradeFullResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.full.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_antchain_ato_sign_flow(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def auth_antchain_ato_sign_flow_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def auth_antchain_ato_sign_flow_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.AuthAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_antchain_ato_withhold_sign(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_antchain_ato_withhold_sign_ex(request, headers, runtime)

    async def unbind_antchain_ato_withhold_sign_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_antchain_ato_withhold_sign_ex_async(request, headers, runtime)

    def unbind_antchain_ato_withhold_sign_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_antchain_ato_withhold_sign_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.UnbindAntchainAtoWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antchain_ato_withhold_plan(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def cancel_antchain_ato_withhold_plan_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antchain_ato_withhold_plan_ex_async(request, headers, runtime)

    def cancel_antchain_ato_withhold_plan_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antchain_ato_withhold_plan_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.CancelAntchainAtoWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_antchain_ato_withhold_plan(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def repay_antchain_ato_withhold_plan_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_antchain_ato_withhold_plan_ex_async(request, headers, runtime)

    def repay_antchain_ato_withhold_plan_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_antchain_ato_withhold_plan_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RepayAntchainAtoWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_antchain_ato_withhold_plan(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def retry_antchain_ato_withhold_plan_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanRequest,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_antchain_ato_withhold_plan_ex_async(request, headers, runtime)

    def retry_antchain_ato_withhold_plan_ex(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_antchain_ato_withhold_plan_ex_async(
        self,
        request: ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__2abe_765c_32934341bd_9bb_6cc_1c_8ff_589_models.RetryAntchainAtoWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
