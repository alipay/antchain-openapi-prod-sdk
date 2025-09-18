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
            # 文件信息
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
                    'sdk_version': '1.6.3',
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
            # 文件信息
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
                    'sdk_version': '1.6.3',
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
        Description: 代扣签约创建
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
        Description: 代扣签约创建
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
        Description: 代扣签约创建
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
        Description: 代扣签约创建
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
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_antchain_ato_withhold_plan_ex(request, headers, runtime)

    async def repay_antchain_ato_withhold_plan_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoWithholdPlanResponse:
        """
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
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
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
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
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
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
            request.file_object = None
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
            request.file_object = None
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
        Description: 主动支付创建
        Summary: 主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_withhold_activepay_ex(request, headers, runtime)

    async def create_antchain_ato_withhold_activepay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdActivepayResponse:
        """
        Description: 主动支付创建
        Summary: 主动支付创建
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
        Description: 主动支付创建
        Summary: 主动支付创建
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
        Description: 主动支付创建
        Summary: 主动支付创建
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
        Description: 主动支付查询
        Summary: 主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_withhold_activepay_ex(request, headers, runtime)

    async def query_antchain_ato_withhold_activepay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdActivepayResponse:
        """
        Description: 主动支付查询
        Summary: 主动支付查询
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
        Description: 主动支付查询
        Summary: 主动支付查询
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
        Description: 主动支付查询
        Summary: 主动支付查询
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
        Description: 主动支付取消
        Summary: 主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_ato_withhold_activepay_ex(request, headers, runtime)

    async def cancel_antchain_ato_withhold_activepay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoWithholdActivepayResponse:
        """
        Description: 主动支付取消
        Summary: 主动支付取消
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
        Description: 主动支付取消
        Summary: 主动支付取消
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
        Description: 主动支付取消
        Summary: 主动支付取消
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

    def upload_antchain_ato_sign_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def upload_antchain_ato_sign_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def upload_antchain_ato_sign_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_ato_sign_flow_response = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_ato_sign_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_ato_sign_flow_response = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_ato_sign_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_withhold_refund(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_withhold_refund_ex(request, headers, runtime)

    async def create_antchain_ato_withhold_refund_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_withhold_refund_ex_async(request, headers, runtime)

    def create_antchain_ato_withhold_refund_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_withhold_refund_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoWithholdRefundResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_withhold_refund(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_withhold_refund_ex(request, headers, runtime)

    async def query_antchain_ato_withhold_refund_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_withhold_refund_ex_async(request, headers, runtime)

    def query_antchain_ato_withhold_refund_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_withhold_refund_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdRefundResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_ato_trade_userpromise(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_ato_trade_userpromise_ex(request, headers, runtime)

    async def update_antchain_ato_trade_userpromise_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_ato_trade_userpromise_ex_async(request, headers, runtime)

    def update_antchain_ato_trade_userpromise_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_ato_trade_userpromise_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_antchain_ato_inner_template_ex(request, headers, runtime)

    async def all_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def all_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AllAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antchain_ato_inner_template_ex(request, headers, runtime)

    async def list_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def list_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ListAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_antchain_ato_inner_template_ex(request, headers, runtime)

    async def detail_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def detail_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DetailAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_ato_inner_template_ex(request, headers, runtime)

    async def create_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def create_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_antchain_ato_inner_template_ex(request, headers, runtime)

    async def save_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def save_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SaveAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_antchain_ato_inner_template_ex(request, headers, runtime)

    async def publish_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def publish_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PublishAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_antchain_ato_inner_template_ex(request, headers, runtime)

    async def preview_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def preview_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PreviewAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_antchain_ato_inner_template_ex(request, headers, runtime)

    async def delete_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def delete_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.DeleteAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_antchain_ato_inner_template_ex(request, headers, runtime)

    async def clone_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def clone_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CloneAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_antchain_ato_fund_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_antchain_ato_fund_flow_ex(request, headers, runtime)

    async def notify_antchain_ato_fund_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_antchain_ato_fund_flow_ex_async(request, headers, runtime)

    def notify_antchain_ato_fund_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_antchain_ato_fund_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.NotifyAntchainAtoFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_inner_templateimage(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_inner_templateimage_ex(request, headers, runtime)

    async def query_antchain_ato_inner_templateimage_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_inner_templateimage_ex_async(request, headers, runtime)

    def query_antchain_ato_inner_templateimage_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_inner_templateimage_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateimageResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_front_indirectorder(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_front_indirectorder_ex(request, headers, runtime)

    async def sync_antchain_ato_front_indirectorder_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_front_indirectorder_ex_async(request, headers, runtime)

    def sync_antchain_ato_front_indirectorder_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderResponse(),
            self.do_request('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_front_indirectorder_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFrontIndirectorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_trade_indirectorder(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_indirectorder_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_indirectorder_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_indirectorder_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_indirectorder_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderResponse(),
            self.do_request('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_indirectorder_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeIndirectorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_antchain_ato_merchantexpand_merchant(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_antchain_ato_merchantexpand_merchant_ex(request, headers, runtime)

    async def register_antchain_ato_merchantexpand_merchant_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_antchain_ato_merchantexpand_merchant_ex_async(request, headers, runtime)

    def register_antchain_ato_merchantexpand_merchant_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_antchain_ato_merchantexpand_merchant_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RegisterAntchainAtoMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_ato_merchantexpand_file(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_ato_merchantexpand_file_ex(request, headers, runtime)

    async def upload_antchain_ato_merchantexpand_file_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_ato_merchantexpand_file_ex_async(request, headers, runtime)

    def upload_antchain_ato_merchantexpand_file_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_ato_merchantexpand_file_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoMerchantexpandFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_merchantexpand_merchant(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_merchantexpand_merchant_ex(request, headers, runtime)

    async def query_antchain_ato_merchantexpand_merchant_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_merchantexpand_merchant_ex_async(request, headers, runtime)

    def query_antchain_ato_merchantexpand_merchant_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_merchantexpand_merchant_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_inner_template_ex(request, headers, runtime)

    async def sync_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def sync_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_ato_inner_template_ex(request, headers, runtime)

    async def update_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def update_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_ato_sign_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_ato_sign_template_ex(request, headers, runtime)

    async def upload_antchain_ato_sign_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_ato_sign_template_ex_async(request, headers, runtime)

    def upload_antchain_ato_sign_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.template.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_ato_sign_template_response = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_ato_sign_template_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_ato_sign_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.template.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_ato_sign_template_response = ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_ato_sign_template_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_inner_template_ex(request, headers, runtime)

    async def query_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def query_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_inner_templateelementlink(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_inner_templateelementlink_ex(request, headers, runtime)

    async def query_antchain_ato_inner_templateelementlink_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_inner_templateelementlink_ex_async(request, headers, runtime)

    def query_antchain_ato_inner_templateelementlink_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_inner_templateelementlink_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoInnerTemplateelementlinkResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_ato_fund_credit(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_ato_fund_credit_ex(request, headers, runtime)

    async def upload_antchain_ato_fund_credit_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_ato_fund_credit_ex_async(request, headers, runtime)

    def upload_antchain_ato_fund_credit_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditResponse(),
            self.do_request('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_ato_fund_credit_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoFundCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_ato_sign_credit(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_ato_sign_credit_ex(request, headers, runtime)

    async def upload_antchain_ato_sign_credit_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_ato_sign_credit_ex_async(request, headers, runtime)

    def upload_antchain_ato_sign_credit_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditResponse(),
            self.do_request('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_ato_sign_credit_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UploadAntchainAtoSignCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_fund_credit(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_fund_credit_ex(request, headers, runtime)

    async def query_antchain_ato_fund_credit_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_fund_credit_ex_async(request, headers, runtime)

    def query_antchain_ato_fund_credit_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditResponse(),
            self.do_request('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_fund_credit_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_sign_credit(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_sign_credit_ex(request, headers, runtime)

    async def query_antchain_ato_sign_credit_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_sign_credit_ex_async(request, headers, runtime)

    def query_antchain_ato_sign_credit_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditResponse(),
            self.do_request('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_sign_credit_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoSignCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_ato_merchantexpand_merchant(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_ato_merchantexpand_merchant_ex(request, headers, runtime)

    async def update_antchain_ato_merchantexpand_merchant_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_ato_merchantexpand_merchant_ex_async(request, headers, runtime)

    def update_antchain_ato_merchantexpand_merchant_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_ato_merchantexpand_merchant_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antchain_ato_sign_flow(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_ato_sign_flow_ex(request, headers, runtime)

    async def cancel_antchain_ato_sign_flow_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antchain_ato_sign_flow_ex_async(request, headers, runtime)

    def cancel_antchain_ato_sign_flow_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antchain_ato_sign_flow_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.CancelAntchainAtoSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_antchain_ato_trade_userpromise(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_antchain_ato_trade_userpromise_ex(request, headers, runtime)

    async def replace_antchain_ato_trade_userpromise_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_antchain_ato_trade_userpromise_ex_async(request, headers, runtime)

    def replace_antchain_ato_trade_userpromise_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_antchain_ato_trade_userpromise_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ReplaceAntchainAtoTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antchain_ato_trade_financeprecheck(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antchain_ato_trade_financeprecheck_ex(request, headers, runtime)

    async def apply_antchain_ato_trade_financeprecheck_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antchain_ato_trade_financeprecheck_ex_async(request, headers, runtime)

    def apply_antchain_ato_trade_financeprecheck_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeprecheck.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antchain_ato_trade_financeprecheck_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoTradeFinanceprecheckResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeprecheck.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_fund_financeprecheckresult(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_fund_financeprecheckresult_ex(request, headers, runtime)

    async def sync_antchain_ato_fund_financeprecheckresult_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_fund_financeprecheckresult_ex_async(request, headers, runtime)

    def sync_antchain_ato_fund_financeprecheckresult_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultResponse(),
            self.do_request('1.0', 'antchain.ato.fund.financeprecheckresult.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_fund_financeprecheckresult_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoFundFinanceprecheckresultResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.financeprecheckresult.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_fund_compensateaccount(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_fund_compensateaccount_ex(request, headers, runtime)

    async def query_antchain_ato_fund_compensateaccount_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_fund_compensateaccount_ex_async(request, headers, runtime)

    def query_antchain_ato_fund_compensateaccount_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountResponse(),
            self.do_request('1.0', 'antchain.ato.fund.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_fund_compensateaccount_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundCompensateaccountResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_withhold_compensateaccount(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_withhold_compensateaccount_ex(request, headers, runtime)

    async def query_antchain_ato_withhold_compensateaccount_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_withhold_compensateaccount_ex_async(request, headers, runtime)

    def query_antchain_ato_withhold_compensateaccount_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_withhold_compensateaccount_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoWithholdCompensateaccountResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_sign_contractcertificate(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_sign_contractcertificate_ex(request, headers, runtime)

    async def get_antchain_ato_sign_contractcertificate_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_sign_contractcertificate_ex_async(request, headers, runtime)

    def get_antchain_ato_sign_contractcertificate_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.contractcertificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_sign_contractcertificate_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoSignContractcertificateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.contractcertificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def transfer_antchain_ato_trade_finance(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.transfer_antchain_ato_trade_finance_ex(request, headers, runtime)

    async def transfer_antchain_ato_trade_finance_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.transfer_antchain_ato_trade_finance_ex_async(request, headers, runtime)

    def transfer_antchain_ato_trade_finance_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.finance.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def transfer_antchain_ato_trade_finance_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.TransferAntchainAtoTradeFinanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.finance.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_ato_trade_order(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_ato_trade_order_ex(request, headers, runtime)

    async def update_antchain_ato_trade_order_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_ato_trade_order_ex_async(request, headers, runtime)

    def update_antchain_ato_trade_order_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderResponse(),
            self.do_request('1.0', 'antchain.ato.trade.order.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_ato_trade_order_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.UpdateAntchainAtoTradeOrderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.order.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_antchain_ato_trade_financeprecheck(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_antchain_ato_trade_financeprecheck_ex(request, headers, runtime)

    async def add_antchain_ato_trade_financeprecheck_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_antchain_ato_trade_financeprecheck_ex_async(request, headers, runtime)

    def add_antchain_ato_trade_financeprecheck_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeprecheck.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_antchain_ato_trade_financeprecheck_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoTradeFinanceprecheckResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeprecheck.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_trade_orderfinanceinfo(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_trade_orderfinanceinfo_ex(request, headers, runtime)

    async def get_antchain_ato_trade_orderfinanceinfo_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_trade_orderfinanceinfo_ex_async(request, headers, runtime)

    def get_antchain_ato_trade_orderfinanceinfo_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoResponse(),
            self.do_request('1.0', 'antchain.ato.trade.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_trade_orderfinanceinfo_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoTradeOrderfinanceinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_orderfinanceinfo(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_orderfinanceinfo_ex(request, headers, runtime)

    async def get_antchain_ato_fund_orderfinanceinfo_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_orderfinanceinfo_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_orderfinanceinfo_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_orderfinanceinfo_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundOrderfinanceinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_trade_userpromisedelay(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_userpromisedelay_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_userpromisedelay_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_userpromisedelay_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_userpromisedelay_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromisedelay.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_userpromisedelay_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradeUserpromisedelayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromisedelay.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pause_antchain_ato_trade_userpromise(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pause_antchain_ato_trade_userpromise_ex(request, headers, runtime)

    async def pause_antchain_ato_trade_userpromise_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pause_antchain_ato_trade_userpromise_ex_async(request, headers, runtime)

    def pause_antchain_ato_trade_userpromise_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pause_antchain_ato_trade_userpromise_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.PauseAntchainAtoTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_antchain_ato_trade_userpromise(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_antchain_ato_trade_userpromise_ex(request, headers, runtime)

    async def resume_antchain_ato_trade_userpromise_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_antchain_ato_trade_userpromise_ex_async(request, headers, runtime)

    def resume_antchain_ato_trade_userpromise_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_antchain_ato_trade_userpromise_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ResumeAntchainAtoTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_antchain_ato_merchantexpand_dividerelation(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_antchain_ato_merchantexpand_dividerelation_ex(request, headers, runtime)

    async def add_antchain_ato_merchantexpand_dividerelation_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_antchain_ato_merchantexpand_dividerelation_ex_async(request, headers, runtime)

    def add_antchain_ato_merchantexpand_dividerelation_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.dividerelation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_antchain_ato_merchantexpand_dividerelation_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoMerchantexpandDividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.dividerelation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_merchantexpand_dividerelation(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_merchantexpand_dividerelation_ex(request, headers, runtime)

    async def query_antchain_ato_merchantexpand_dividerelation_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_merchantexpand_dividerelation_ex_async(request, headers, runtime)

    def query_antchain_ato_merchantexpand_dividerelation_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.dividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_merchantexpand_dividerelation_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoMerchantexpandDividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.dividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_antchain_ato_inner_template(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_antchain_ato_inner_template_ex(request, headers, runtime)

    async def add_antchain_ato_inner_template_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_antchain_ato_inner_template_ex_async(request, headers, runtime)

    def add_antchain_ato_inner_template_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_antchain_ato_inner_template_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.AddAntchainAtoInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antchain_ato_fund_creditutilization(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antchain_ato_fund_creditutilization_ex(request, headers, runtime)

    async def apply_antchain_ato_fund_creditutilization_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antchain_ato_fund_creditutilization_ex_async(request, headers, runtime)

    def apply_antchain_ato_fund_creditutilization_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationResponse(),
            self.do_request('1.0', 'antchain.ato.fund.creditutilization.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antchain_ato_fund_creditutilization_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ApplyAntchainAtoFundCreditutilizationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.creditutilization.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_ato_fund_assetpackage(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_ato_fund_assetpackage_ex(request, headers, runtime)

    async def query_antchain_ato_fund_assetpackage_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_ato_fund_assetpackage_ex_async(request, headers, runtime)

    def query_antchain_ato_fund_assetpackage_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageResponse(),
            self.do_request('1.0', 'antchain.ato.fund.assetpackage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_ato_fund_assetpackage_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.QueryAntchainAtoFundAssetpackageResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.assetpackage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_antchain_ato_fund_plan(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_antchain_ato_fund_plan_ex(request, headers, runtime)

    async def repay_antchain_ato_fund_plan_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_antchain_ato_fund_plan_ex_async(request, headers, runtime)

    def repay_antchain_ato_fund_plan_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanResponse(),
            self.do_request('1.0', 'antchain.ato.fund.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_antchain_ato_fund_plan_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RepayAntchainAtoFundPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_ato_fund_compensatesignurl(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_ato_fund_compensatesignurl_ex(request, headers, runtime)

    async def get_antchain_ato_fund_compensatesignurl_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_ato_fund_compensatesignurl_ex_async(request, headers, runtime)

    def get_antchain_ato_fund_compensatesignurl_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlResponse(),
            self.do_request('1.0', 'antchain.ato.fund.compensatesignurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_ato_fund_compensatesignurl_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.GetAntchainAtoFundCompensatesignurlResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.compensatesignurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_antchain_ato_fund_compensate(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_antchain_ato_fund_compensate_ex(request, headers, runtime)

    async def confirm_antchain_ato_fund_compensate_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_antchain_ato_fund_compensate_ex_async(request, headers, runtime)

    def confirm_antchain_ato_fund_compensate_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateResponse(),
            self.do_request('1.0', 'antchain.ato.fund.compensate.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_antchain_ato_fund_compensate_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.ConfirmAntchainAtoFundCompensateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.compensate.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_antchain_ato_withhold_planpending(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_antchain_ato_withhold_planpending_ex(request, headers, runtime)

    async def retry_antchain_ato_withhold_planpending_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_antchain_ato_withhold_planpending_ex_async(request, headers, runtime)

    def retry_antchain_ato_withhold_planpending_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.planpending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_antchain_ato_withhold_planpending_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdPlanpendingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.planpending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_antchain_ato_withhold_dividepending(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_antchain_ato_withhold_dividepending_ex(request, headers, runtime)

    async def retry_antchain_ato_withhold_dividepending_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_antchain_ato_withhold_dividepending_ex_async(request, headers, runtime)

    def retry_antchain_ato_withhold_dividepending_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.dividepending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_antchain_ato_withhold_dividepending_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.RetryAntchainAtoWithholdDividependingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.dividepending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_antchain_ato_trade_promoorderinfo(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_antchain_ato_trade_promoorderinfo_ex(request, headers, runtime)

    async def sync_antchain_ato_trade_promoorderinfo_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoRequest,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_antchain_ato_trade_promoorderinfo_ex_async(request, headers, runtime)

    def sync_antchain_ato_trade_promoorderinfo_ex(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoResponse(),
            self.do_request('1.0', 'antchain.ato.trade.promoorderinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_antchain_ato_trade_promoorderinfo_ex_async(
        self,
        request: ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__195dff_03d_395462ea_294bafdba_69df_3f_models.SyncAntchainAtoTradePromoorderinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.promoorderinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
