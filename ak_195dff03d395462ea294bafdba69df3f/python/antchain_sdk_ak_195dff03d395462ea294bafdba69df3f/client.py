# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_195dff03d395462ea294bafdba69df3f import models as ak__195dff_03d_395462ea_294bafdba_69df_3f_models
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
        config: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.Config,
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
            # 主动支付单据
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
                    'sdk_version': '1.1.3',
                    '_prod_code': 'ak_195dff03d395462ea294bafdba69df3f',
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
            # 主动支付单据
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
                    'sdk_version': '1.1.3',
                    '_prod_code': 'ak_195dff03d395462ea294bafdba69df3f',
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
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_trade(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_trade_ex(request, headers, runtime)

    async def get_antchain_ato_trade_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_trade_ex_async(request, headers, runtime)

    def get_antchain_ato_trade_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_trade_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_realperson_facevrf(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_realperson_facevrf_ex(request, headers, runtime)

    async def create_antchain_ato_realperson_facevrf_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_realperson_facevrf_ex_async(request, headers, runtime)

    def create_antchain_ato_realperson_facevrf_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_realperson_facevrf_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_realperson_facevrf(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_realperson_facevrf_ex(request, headers, runtime)

    async def query_antchain_ato_realperson_facevrf_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_realperson_facevrf_ex_async(request, headers, runtime)

    def query_antchain_ato_realperson_facevrf_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_realperson_facevrf_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_antchain_ato_sign_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_antchain_ato_sign_template_ex(request, headers, runtime)

    async def all_antchain_ato_sign_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_antchain_ato_sign_template_ex_async(request, headers, runtime)

    def all_antchain_ato_sign_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_antchain_ato_sign_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_antchain_ato_sign_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def submit_antchain_ato_sign_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def submit_antchain_ato_sign_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_sign_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def get_antchain_ato_sign_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def get_antchain_ato_sign_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_withhold_sign(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_withhold_sign_ex(request, headers, runtime)

    async def create_antchain_ato_withhold_sign_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_withhold_sign_ex_async(request, headers, runtime)

    def create_antchain_ato_withhold_sign_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_withhold_sign_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_withhold_sign(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_withhold_sign_ex(request, headers, runtime)

    async def query_antchain_ato_withhold_sign_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_withhold_sign_ex_async(request, headers, runtime)

    def query_antchain_ato_withhold_sign_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_withhold_sign_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_antchain_ato_sign_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def auth_antchain_ato_sign_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def auth_antchain_ato_sign_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_antchain_ato_withhold_sign(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_antchain_ato_withhold_sign_ex(request, headers, runtime)

    async def unbind_antchain_ato_withhold_sign_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_antchain_ato_withhold_sign_ex_async(request, headers, runtime)

    def unbind_antchain_ato_withhold_sign_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_antchain_ato_withhold_sign_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UnbindAntchainAtoWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antchain_ato_withhold_plan(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def cancel_antchain_ato_withhold_plan_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antchain_ato_withhold_plan_ex_async(request, headers, runtime)

    def cancel_antchain_ato_withhold_plan_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antchain_ato_withhold_plan_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_antchain_ato_withhold_plan(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def repay_antchain_ato_withhold_plan_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_antchain_ato_withhold_plan_ex_async(request, headers, runtime)

    def repay_antchain_ato_withhold_plan_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_antchain_ato_withhold_plan_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_antchain_ato_front_sign(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_antchain_ato_front_sign_ex(request, headers, runtime)

    async def submit_antchain_ato_front_sign_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_antchain_ato_front_sign_ex_async(request, headers, runtime)

    def submit_antchain_ato_front_sign_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignResponse(),
            self.do_request('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_antchain_ato_front_sign_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SubmitAntchainAtoFrontSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_front_trade(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_front_trade_ex(request, headers, runtime)

    async def sync_antchain_ato_front_trade_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_front_trade_ex_async(request, headers, runtime)

    def sync_antchain_ato_front_trade_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeResponse(),
            self.do_request('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_front_trade_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_antchain_ato_withhold_plan(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def retry_antchain_ato_withhold_plan_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_antchain_ato_withhold_plan_ex_async(request, headers, runtime)

    def retry_antchain_ato_withhold_plan_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_antchain_ato_withhold_plan_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_antchain_ato_withhold_signasyncunsign(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_antchain_ato_withhold_signasyncunsign_ex(request, headers, runtime)

    async def confirm_antchain_ato_withhold_signasyncunsign_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_antchain_ato_withhold_signasyncunsign_ex_async(request, headers, runtime)

    def confirm_antchain_ato_withhold_signasyncunsign_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_antchain_ato_withhold_signasyncunsign_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoWithholdSignasyncunsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_ato_fund_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_ato_fund_flow_ex(request, headers, runtime)

    async def upload_antchain_ato_fund_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_ato_fund_flow_ex_async(request, headers, runtime)

    def upload_antchain_ato_fund_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.fund.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_ato_fund_flow_response = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_ato_fund_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_ato_fund_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.fund.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_ato_fund_flow_response = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_ato_fund_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_flow_ex(request, headers, runtime)

    async def get_antchain_ato_fund_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_flow_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_antchain_ato_fund_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_antchain_ato_fund_flow_ex(request, headers, runtime)

    async def refuse_antchain_ato_fund_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_antchain_ato_fund_flow_ex_async(request, headers, runtime)

    def refuse_antchain_ato_fund_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_antchain_ato_fund_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RefuseAntchainAtoFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_antchain_ato_fund_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_ato_fund_flow_ex(request, headers, runtime)

    async def auth_antchain_ato_fund_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_ato_fund_flow_ex_async(request, headers, runtime)

    def auth_antchain_ato_fund_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_ato_fund_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AuthAntchainAtoFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_withhold_activepay(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_withhold_activepay_ex(request, headers, runtime)

    async def create_antchain_ato_withhold_activepay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_withhold_activepay_ex_async(request, headers, runtime)

    def create_antchain_ato_withhold_activepay_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_withhold_activepay_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_withhold_activepay(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_withhold_activepay_ex(request, headers, runtime)

    async def query_antchain_ato_withhold_activepay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_withhold_activepay_ex_async(request, headers, runtime)

    def query_antchain_ato_withhold_activepay_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_withhold_activepay_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antchain_ato_withhold_activepay(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_ato_withhold_activepay_ex(request, headers, runtime)

    async def cancel_antchain_ato_withhold_activepay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antchain_ato_withhold_activepay_ex_async(request, headers, runtime)

    def cancel_antchain_ato_withhold_activepay_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antchain_ato_withhold_activepay_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antchain_ato_fund_plan(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_ato_fund_plan_ex(request, headers, runtime)

    async def cancel_antchain_ato_fund_plan_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antchain_ato_fund_plan_ex_async(request, headers, runtime)

    def cancel_antchain_ato_fund_plan_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanResponse(),
            self.do_request('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antchain_ato_fund_plan_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoFundPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antchain_ato_fund_notify(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antchain_ato_fund_notify_ex(request, headers, runtime)

    async def callback_antchain_ato_fund_notify_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antchain_ato_fund_notify_ex_async(request, headers, runtime)

    def callback_antchain_ato_fund_notify_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyResponse(),
            self.do_request('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antchain_ato_fund_notify_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CallbackAntchainAtoFundNotifyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_trade_financeloanapply(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_financeloanapply_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_financeloanapply_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_financeloanapply_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_financeloanapply_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_financeloanapply_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeFinanceloanapplyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_trade_merchantfulfillment(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_trade_merchantfulfillment_ex(request, headers, runtime)

    async def get_antchain_ato_trade_merchantfulfillment_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_trade_merchantfulfillment_ex_async(request, headers, runtime)

    def get_antchain_ato_trade_merchantfulfillment_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_trade_merchantfulfillment_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_merchantpromise(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_merchantpromise_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_merchantpromise_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_merchantpromise_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_merchantpromise_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_merchantpromise_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundMerchantpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_financeloanresults(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_financeloanresults_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_financeloanresults_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_financeloanresults_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_financeloanresults_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsResponse(),
            self.do_request('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_financeloanresults_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceloanresultsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_userpromise(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_userpromise_ex(request, headers, runtime)

    async def get_antchain_ato_fund_userpromise_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_userpromise_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_userpromise_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_userpromise_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_trade_userperformance(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_trade_userperformance_ex(request, headers, runtime)

    async def get_antchain_ato_trade_userperformance_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_trade_userperformance_ex_async(request, headers, runtime)

    def get_antchain_ato_trade_userperformance_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_trade_userperformance_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeUserperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_trade_merchantperformance(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_trade_merchantperformance_ex(request, headers, runtime)

    async def get_antchain_ato_trade_merchantperformance_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_trade_merchantperformance_ex_async(request, headers, runtime)

    def get_antchain_ato_trade_merchantperformance_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_trade_merchantperformance_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeMerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_userperformance(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_userperformance_ex(request, headers, runtime)

    async def get_antchain_ato_fund_userperformance_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_userperformance_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_userperformance_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_userperformance_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundUserperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_merchantperformance(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_merchantperformance_ex(request, headers, runtime)

    async def get_antchain_ato_fund_merchantperformance_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_merchantperformance_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_merchantperformance_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_merchantperformance_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundMerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_orderfullinfo(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_orderfullinfo_ex(request, headers, runtime)

    async def get_antchain_ato_fund_orderfullinfo_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_orderfullinfo_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_orderfullinfo_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_orderfullinfo_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfullinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
