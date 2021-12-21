# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_baasdt import models as baasdt_models
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
        config: baasdt_models.Config,
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
            # 交易日志
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
                    'sdk_version': '1.3.54'
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
            # 交易日志
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
                    'sdk_version': '1.3.54'
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

    def exec_card_create(
        self,
        request: baasdt_models.ExecCardCreateRequest,
    ) -> baasdt_models.ExecCardCreateResponse:
        """
        Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-创建卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_create_ex(request, headers, runtime)

    async def exec_card_create_async(
        self,
        request: baasdt_models.ExecCardCreateRequest,
    ) -> baasdt_models.ExecCardCreateResponse:
        """
        Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-创建卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_create_ex_async(request, headers, runtime)

    def exec_card_create_ex(
        self,
        request: baasdt_models.ExecCardCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardCreateResponse:
        """
        Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-创建卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardCreateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.create.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_create_ex_async(
        self,
        request: baasdt_models.ExecCardCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardCreateResponse:
        """
        Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-创建卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardCreateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.create.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_query(
        self,
        request: baasdt_models.ExecCardQueryRequest,
    ) -> baasdt_models.ExecCardQueryResponse:
        """
        Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-查询卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_query_ex(request, headers, runtime)

    async def exec_card_query_async(
        self,
        request: baasdt_models.ExecCardQueryRequest,
    ) -> baasdt_models.ExecCardQueryResponse:
        """
        Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-查询卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_query_ex_async(request, headers, runtime)

    def exec_card_query_ex(
        self,
        request: baasdt_models.ExecCardQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardQueryResponse:
        """
        Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-查询卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardQueryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.query.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_query_ex_async(
        self,
        request: baasdt_models.ExecCardQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardQueryResponse:
        """
        Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-查询卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardQueryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.query.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_bindname(
        self,
        request: baasdt_models.ExecCardBindnameRequest,
    ) -> baasdt_models.ExecCardBindnameResponse:
        """
        Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-记名卡发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_bindname_ex(request, headers, runtime)

    async def exec_card_bindname_async(
        self,
        request: baasdt_models.ExecCardBindnameRequest,
    ) -> baasdt_models.ExecCardBindnameResponse:
        """
        Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-记名卡发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_bindname_ex_async(request, headers, runtime)

    def exec_card_bindname_ex(
        self,
        request: baasdt_models.ExecCardBindnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardBindnameResponse:
        """
        Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-记名卡发行
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardBindnameResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.bindname.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_bindname_ex_async(
        self,
        request: baasdt_models.ExecCardBindnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardBindnameResponse:
        """
        Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-记名卡发行
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardBindnameResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.bindname.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_charge(
        self,
        request: baasdt_models.ExecCardChargeRequest,
    ) -> baasdt_models.ExecCardChargeResponse:
        """
        Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_charge_ex(request, headers, runtime)

    async def exec_card_charge_async(
        self,
        request: baasdt_models.ExecCardChargeRequest,
    ) -> baasdt_models.ExecCardChargeResponse:
        """
        Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_charge_ex_async(request, headers, runtime)

    def exec_card_charge_ex(
        self,
        request: baasdt_models.ExecCardChargeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardChargeResponse:
        """
        Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardChargeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.charge.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_charge_ex_async(
        self,
        request: baasdt_models.ExecCardChargeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardChargeResponse:
        """
        Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardChargeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.charge.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_writeoff(
        self,
        request: baasdt_models.ExecCardWriteoffRequest,
    ) -> baasdt_models.ExecCardWriteoffResponse:
        """
        Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-核销卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_writeoff_ex(request, headers, runtime)

    async def exec_card_writeoff_async(
        self,
        request: baasdt_models.ExecCardWriteoffRequest,
    ) -> baasdt_models.ExecCardWriteoffResponse:
        """
        Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-核销卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_writeoff_ex_async(request, headers, runtime)

    def exec_card_writeoff_ex(
        self,
        request: baasdt_models.ExecCardWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardWriteoffResponse:
        """
        Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-核销卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardWriteoffResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_writeoff_ex_async(
        self,
        request: baasdt_models.ExecCardWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardWriteoffResponse:
        """
        Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-核销卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardWriteoffResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_expired(
        self,
        request: baasdt_models.ExecCardExpiredRequest,
    ) -> baasdt_models.ExecCardExpiredResponse:
        """
        Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-过期卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_expired_ex(request, headers, runtime)

    async def exec_card_expired_async(
        self,
        request: baasdt_models.ExecCardExpiredRequest,
    ) -> baasdt_models.ExecCardExpiredResponse:
        """
        Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-过期卡密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_expired_ex_async(request, headers, runtime)

    def exec_card_expired_ex(
        self,
        request: baasdt_models.ExecCardExpiredRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardExpiredResponse:
        """
        Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-过期卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardExpiredResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.expired.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_expired_ex_async(
        self,
        request: baasdt_models.ExecCardExpiredRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardExpiredResponse:
        """
        Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-过期卡密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardExpiredResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.expired.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_forbidden(
        self,
        request: baasdt_models.ExecCardForbiddenRequest,
    ) -> baasdt_models.ExecCardForbiddenResponse:
        """
        Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-风控禁用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_forbidden_ex(request, headers, runtime)

    async def exec_card_forbidden_async(
        self,
        request: baasdt_models.ExecCardForbiddenRequest,
    ) -> baasdt_models.ExecCardForbiddenResponse:
        """
        Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-风控禁用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_forbidden_ex_async(request, headers, runtime)

    def exec_card_forbidden_ex(
        self,
        request: baasdt_models.ExecCardForbiddenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardForbiddenResponse:
        """
        Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-风控禁用
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardForbiddenResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.forbidden.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_forbidden_ex_async(
        self,
        request: baasdt_models.ExecCardForbiddenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardForbiddenResponse:
        """
        Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-风控禁用
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardForbiddenResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.forbidden.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_card_chargereset(
        self,
        request: baasdt_models.ExecCardChargeresetRequest,
    ) -> baasdt_models.ExecCardChargeresetResponse:
        """
        Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值重置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_card_chargereset_ex(request, headers, runtime)

    async def exec_card_chargereset_async(
        self,
        request: baasdt_models.ExecCardChargeresetRequest,
    ) -> baasdt_models.ExecCardChargeresetResponse:
        """
        Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值重置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_card_chargereset_ex_async(request, headers, runtime)

    def exec_card_chargereset_ex(
        self,
        request: baasdt_models.ExecCardChargeresetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardChargeresetResponse:
        """
        Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值重置
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardChargeresetResponse().from_map(
            self.do_request('1.0', 'baas.antdao.card.chargereset.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_card_chargereset_ex_async(
        self,
        request: baasdt_models.ExecCardChargeresetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCardChargeresetResponse:
        """
        Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-电子券卡密服务-充值重置
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCardChargeresetResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.card.chargereset.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumecard_account(
        self,
        request: baasdt_models.CreateConsumecardAccountRequest,
    ) -> baasdt_models.CreateConsumecardAccountResponse:
        """
        Description: 个人或机构账户注册
        Summary: 数字商品服务-消费卡服务-个人/机构注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumecard_account_ex(request, headers, runtime)

    async def create_consumecard_account_async(
        self,
        request: baasdt_models.CreateConsumecardAccountRequest,
    ) -> baasdt_models.CreateConsumecardAccountResponse:
        """
        Description: 个人或机构账户注册
        Summary: 数字商品服务-消费卡服务-个人/机构注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumecard_account_ex_async(request, headers, runtime)

    def create_consumecard_account_ex(
        self,
        request: baasdt_models.CreateConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardAccountResponse:
        """
        Description: 个人或机构账户注册
        Summary: 数字商品服务-消费卡服务-个人/机构注册
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumecard_account_ex_async(
        self,
        request: baasdt_models.CreateConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardAccountResponse:
        """
        Description: 个人或机构账户注册
        Summary: 数字商品服务-消费卡服务-个人/机构注册
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_consumecard_account(
        self,
        request: baasdt_models.OfflineConsumecardAccountRequest,
    ) -> baasdt_models.OfflineConsumecardAccountResponse:
        """
        Description: 个人/机构账户注销
        Summary: 数字商品服务-消费卡服务-个人/机构注销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_consumecard_account_ex(request, headers, runtime)

    async def offline_consumecard_account_async(
        self,
        request: baasdt_models.OfflineConsumecardAccountRequest,
    ) -> baasdt_models.OfflineConsumecardAccountResponse:
        """
        Description: 个人/机构账户注销
        Summary: 数字商品服务-消费卡服务-个人/机构注销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_consumecard_account_ex_async(request, headers, runtime)

    def offline_consumecard_account_ex(
        self,
        request: baasdt_models.OfflineConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OfflineConsumecardAccountResponse:
        """
        Description: 个人/机构账户注销
        Summary: 数字商品服务-消费卡服务-个人/机构注销
        """
        UtilClient.validate_model(request)
        return baasdt_models.OfflineConsumecardAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.account.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_consumecard_account_ex_async(
        self,
        request: baasdt_models.OfflineConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OfflineConsumecardAccountResponse:
        """
        Description: 个人/机构账户注销
        Summary: 数字商品服务-消费卡服务-个人/机构注销
        """
        UtilClient.validate_model(request)
        return baasdt_models.OfflineConsumecardAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.account.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reclaim_consumecard_wallet(
        self,
        request: baasdt_models.ReclaimConsumecardWalletRequest,
    ) -> baasdt_models.ReclaimConsumecardWalletResponse:
        """
        Description: 企业消费卡余额回退
        Summary: 数字商品服务-消费卡服务-企业消费卡回退
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reclaim_consumecard_wallet_ex(request, headers, runtime)

    async def reclaim_consumecard_wallet_async(
        self,
        request: baasdt_models.ReclaimConsumecardWalletRequest,
    ) -> baasdt_models.ReclaimConsumecardWalletResponse:
        """
        Description: 企业消费卡余额回退
        Summary: 数字商品服务-消费卡服务-企业消费卡回退
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reclaim_consumecard_wallet_ex_async(request, headers, runtime)

    def reclaim_consumecard_wallet_ex(
        self,
        request: baasdt_models.ReclaimConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReclaimConsumecardWalletResponse:
        """
        Description: 企业消费卡余额回退
        Summary: 数字商品服务-消费卡服务-企业消费卡回退
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReclaimConsumecardWalletResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.wallet.reclaim', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reclaim_consumecard_wallet_ex_async(
        self,
        request: baasdt_models.ReclaimConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReclaimConsumecardWalletResponse:
        """
        Description: 企业消费卡余额回退
        Summary: 数字商品服务-消费卡服务-企业消费卡回退
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReclaimConsumecardWalletResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.wallet.reclaim', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def freeze_consumecard_account(
        self,
        request: baasdt_models.FreezeConsumecardAccountRequest,
    ) -> baasdt_models.FreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户禁用
        Summary: 数字商品服务-消费卡服务-账户禁用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.freeze_consumecard_account_ex(request, headers, runtime)

    async def freeze_consumecard_account_async(
        self,
        request: baasdt_models.FreezeConsumecardAccountRequest,
    ) -> baasdt_models.FreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户禁用
        Summary: 数字商品服务-消费卡服务-账户禁用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.freeze_consumecard_account_ex_async(request, headers, runtime)

    def freeze_consumecard_account_ex(
        self,
        request: baasdt_models.FreezeConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.FreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户禁用
        Summary: 数字商品服务-消费卡服务-账户禁用
        """
        UtilClient.validate_model(request)
        return baasdt_models.FreezeConsumecardAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.account.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def freeze_consumecard_account_ex_async(
        self,
        request: baasdt_models.FreezeConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.FreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户禁用
        Summary: 数字商品服务-消费卡服务-账户禁用
        """
        UtilClient.validate_model(request)
        return baasdt_models.FreezeConsumecardAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.account.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unfreeze_consumecard_account(
        self,
        request: baasdt_models.UnfreezeConsumecardAccountRequest,
    ) -> baasdt_models.UnfreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户解禁
        Summary: 数字商品服务-消费卡服务-账户解禁
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unfreeze_consumecard_account_ex(request, headers, runtime)

    async def unfreeze_consumecard_account_async(
        self,
        request: baasdt_models.UnfreezeConsumecardAccountRequest,
    ) -> baasdt_models.UnfreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户解禁
        Summary: 数字商品服务-消费卡服务-账户解禁
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unfreeze_consumecard_account_ex_async(request, headers, runtime)

    def unfreeze_consumecard_account_ex(
        self,
        request: baasdt_models.UnfreezeConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UnfreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户解禁
        Summary: 数字商品服务-消费卡服务-账户解禁
        """
        UtilClient.validate_model(request)
        return baasdt_models.UnfreezeConsumecardAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.account.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unfreeze_consumecard_account_ex_async(
        self,
        request: baasdt_models.UnfreezeConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UnfreezeConsumecardAccountResponse:
        """
        Description: 个人/机构账户解禁
        Summary: 数字商品服务-消费卡服务-账户解禁
        """
        UtilClient.validate_model(request)
        return baasdt_models.UnfreezeConsumecardAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.account.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_consumecard_riskcontrol(
        self,
        request: baasdt_models.UpdateConsumecardRiskcontrolRequest,
    ) -> baasdt_models.UpdateConsumecardRiskcontrolResponse:
        """
        Description: 消费卡风控调整(特殊权限,暂不开放)
        Summary: 数字商品服务-消费卡服务-消费卡风控调整
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_consumecard_riskcontrol_ex(request, headers, runtime)

    async def update_consumecard_riskcontrol_async(
        self,
        request: baasdt_models.UpdateConsumecardRiskcontrolRequest,
    ) -> baasdt_models.UpdateConsumecardRiskcontrolResponse:
        """
        Description: 消费卡风控调整(特殊权限,暂不开放)
        Summary: 数字商品服务-消费卡服务-消费卡风控调整
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_consumecard_riskcontrol_ex_async(request, headers, runtime)

    def update_consumecard_riskcontrol_ex(
        self,
        request: baasdt_models.UpdateConsumecardRiskcontrolRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConsumecardRiskcontrolResponse:
        """
        Description: 消费卡风控调整(特殊权限,暂不开放)
        Summary: 数字商品服务-消费卡服务-消费卡风控调整
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConsumecardRiskcontrolResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.riskcontrol.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_consumecard_riskcontrol_ex_async(
        self,
        request: baasdt_models.UpdateConsumecardRiskcontrolRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConsumecardRiskcontrolResponse:
        """
        Description: 消费卡风控调整(特殊权限,暂不开放)
        Summary: 数字商品服务-消费卡服务-消费卡风控调整
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConsumecardRiskcontrolResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.riskcontrol.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_bill(
        self,
        request: baasdt_models.QueryConsumecardBillRequest,
    ) -> baasdt_models.QueryConsumecardBillResponse:
        """
        Description: 账单查询
        Summary: 数字商品服务-消费卡服务-账单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_bill_ex(request, headers, runtime)

    async def query_consumecard_bill_async(
        self,
        request: baasdt_models.QueryConsumecardBillRequest,
    ) -> baasdt_models.QueryConsumecardBillResponse:
        """
        Description: 账单查询
        Summary: 数字商品服务-消费卡服务-账单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_bill_ex_async(request, headers, runtime)

    def query_consumecard_bill_ex(
        self,
        request: baasdt_models.QueryConsumecardBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardBillResponse:
        """
        Description: 账单查询
        Summary: 数字商品服务-消费卡服务-账单查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardBillResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.bill.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_bill_ex_async(
        self,
        request: baasdt_models.QueryConsumecardBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardBillResponse:
        """
        Description: 账单查询
        Summary: 数字商品服务-消费卡服务-账单查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardBillResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.bill.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def charge_consumecard_wallet(
        self,
        request: baasdt_models.ChargeConsumecardWalletRequest,
    ) -> baasdt_models.ChargeConsumecardWalletResponse:
        """
        Description: 企业消费卡充值冻结
        Summary: 数字商品服务-消费卡服务-消费卡充值冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.charge_consumecard_wallet_ex(request, headers, runtime)

    async def charge_consumecard_wallet_async(
        self,
        request: baasdt_models.ChargeConsumecardWalletRequest,
    ) -> baasdt_models.ChargeConsumecardWalletResponse:
        """
        Description: 企业消费卡充值冻结
        Summary: 数字商品服务-消费卡服务-消费卡充值冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.charge_consumecard_wallet_ex_async(request, headers, runtime)

    def charge_consumecard_wallet_ex(
        self,
        request: baasdt_models.ChargeConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ChargeConsumecardWalletResponse:
        """
        Description: 企业消费卡充值冻结
        Summary: 数字商品服务-消费卡服务-消费卡充值冻结
        """
        UtilClient.validate_model(request)
        return baasdt_models.ChargeConsumecardWalletResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.wallet.charge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def charge_consumecard_wallet_ex_async(
        self,
        request: baasdt_models.ChargeConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ChargeConsumecardWalletResponse:
        """
        Description: 企业消费卡充值冻结
        Summary: 数字商品服务-消费卡服务-消费卡充值冻结
        """
        UtilClient.validate_model(request)
        return baasdt_models.ChargeConsumecardWalletResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.wallet.charge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_consumecard_account(
        self,
        request: baasdt_models.UpdateConsumecardAccountRequest,
    ) -> baasdt_models.UpdateConsumecardAccountResponse:
        """
        Description: 更账户信息
        Summary: 数字商品服务-消费卡服务-更新账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_consumecard_account_ex(request, headers, runtime)

    async def update_consumecard_account_async(
        self,
        request: baasdt_models.UpdateConsumecardAccountRequest,
    ) -> baasdt_models.UpdateConsumecardAccountResponse:
        """
        Description: 更账户信息
        Summary: 数字商品服务-消费卡服务-更新账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_consumecard_account_ex_async(request, headers, runtime)

    def update_consumecard_account_ex(
        self,
        request: baasdt_models.UpdateConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConsumecardAccountResponse:
        """
        Description: 更账户信息
        Summary: 数字商品服务-消费卡服务-更新账户
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConsumecardAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_consumecard_account_ex_async(
        self,
        request: baasdt_models.UpdateConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConsumecardAccountResponse:
        """
        Description: 更账户信息
        Summary: 数字商品服务-消费卡服务-更新账户
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConsumecardAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumecard_bill(
        self,
        request: baasdt_models.CreateConsumecardBillRequest,
    ) -> baasdt_models.CreateConsumecardBillResponse:
        """
        Description: 账单创建
        Summary: 数字商品服务-消费卡服务-账单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumecard_bill_ex(request, headers, runtime)

    async def create_consumecard_bill_async(
        self,
        request: baasdt_models.CreateConsumecardBillRequest,
    ) -> baasdt_models.CreateConsumecardBillResponse:
        """
        Description: 账单创建
        Summary: 数字商品服务-消费卡服务-账单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumecard_bill_ex_async(request, headers, runtime)

    def create_consumecard_bill_ex(
        self,
        request: baasdt_models.CreateConsumecardBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardBillResponse:
        """
        Description: 账单创建
        Summary: 数字商品服务-消费卡服务-账单创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardBillResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumecard_bill_ex_async(
        self,
        request: baasdt_models.CreateConsumecardBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardBillResponse:
        """
        Description: 账单创建
        Summary: 数字商品服务-消费卡服务-账单创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardBillResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_consumecard_billcreate(
        self,
        request: baasdt_models.ConfirmConsumecardBillcreateRequest,
    ) -> baasdt_models.ConfirmConsumecardBillcreateResponse:
        """
        Description: 账单创建确认成功或失败
        Summary: 数字商品服务-消费卡服务-账单创建确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_consumecard_billcreate_ex(request, headers, runtime)

    async def confirm_consumecard_billcreate_async(
        self,
        request: baasdt_models.ConfirmConsumecardBillcreateRequest,
    ) -> baasdt_models.ConfirmConsumecardBillcreateResponse:
        """
        Description: 账单创建确认成功或失败
        Summary: 数字商品服务-消费卡服务-账单创建确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_consumecard_billcreate_ex_async(request, headers, runtime)

    def confirm_consumecard_billcreate_ex(
        self,
        request: baasdt_models.ConfirmConsumecardBillcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmConsumecardBillcreateResponse:
        """
        Description: 账单创建确认成功或失败
        Summary: 数字商品服务-消费卡服务-账单创建确认
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmConsumecardBillcreateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billcreate.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_consumecard_billcreate_ex_async(
        self,
        request: baasdt_models.ConfirmConsumecardBillcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmConsumecardBillcreateResponse:
        """
        Description: 账单创建确认成功或失败
        Summary: 数字商品服务-消费卡服务-账单创建确认
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmConsumecardBillcreateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billcreate.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_consumecard_bill(
        self,
        request: baasdt_models.CancelConsumecardBillRequest,
    ) -> baasdt_models.CancelConsumecardBillResponse:
        """
        Description: 账单取消
        Summary: 数字商品服务-消费卡服务-取消账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_consumecard_bill_ex(request, headers, runtime)

    async def cancel_consumecard_bill_async(
        self,
        request: baasdt_models.CancelConsumecardBillRequest,
    ) -> baasdt_models.CancelConsumecardBillResponse:
        """
        Description: 账单取消
        Summary: 数字商品服务-消费卡服务-取消账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_consumecard_bill_ex_async(request, headers, runtime)

    def cancel_consumecard_bill_ex(
        self,
        request: baasdt_models.CancelConsumecardBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelConsumecardBillResponse:
        """
        Description: 账单取消
        Summary: 数字商品服务-消费卡服务-取消账单
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelConsumecardBillResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.bill.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_consumecard_bill_ex_async(
        self,
        request: baasdt_models.CancelConsumecardBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelConsumecardBillResponse:
        """
        Description: 账单取消
        Summary: 数字商品服务-消费卡服务-取消账单
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelConsumecardBillResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.bill.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_billpay(
        self,
        request: baasdt_models.ExecConsumecardBillpayRequest,
    ) -> baasdt_models.ExecConsumecardBillpayResponse:
        """
        Description: 账单支付
        Summary: 数字商品服务-消费卡服务-账单支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_billpay_ex(request, headers, runtime)

    async def exec_consumecard_billpay_async(
        self,
        request: baasdt_models.ExecConsumecardBillpayRequest,
    ) -> baasdt_models.ExecConsumecardBillpayResponse:
        """
        Description: 账单支付
        Summary: 数字商品服务-消费卡服务-账单支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_billpay_ex_async(request, headers, runtime)

    def exec_consumecard_billpay_ex(
        self,
        request: baasdt_models.ExecConsumecardBillpayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardBillpayResponse:
        """
        Description: 账单支付
        Summary: 数字商品服务-消费卡服务-账单支付
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardBillpayResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billpay.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_billpay_ex_async(
        self,
        request: baasdt_models.ExecConsumecardBillpayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardBillpayResponse:
        """
        Description: 账单支付
        Summary: 数字商品服务-消费卡服务-账单支付
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardBillpayResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billpay.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_orderwriteoff(
        self,
        request: baasdt_models.ExecConsumecardOrderwriteoffRequest,
    ) -> baasdt_models.ExecConsumecardOrderwriteoffResponse:
        """
        Description: 账单核销和交易核销，传入交易类型和订单Id
        Summary: 数字商品服务-消费卡服务-账单和交易核销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_orderwriteoff_ex(request, headers, runtime)

    async def exec_consumecard_orderwriteoff_async(
        self,
        request: baasdt_models.ExecConsumecardOrderwriteoffRequest,
    ) -> baasdt_models.ExecConsumecardOrderwriteoffResponse:
        """
        Description: 账单核销和交易核销，传入交易类型和订单Id
        Summary: 数字商品服务-消费卡服务-账单和交易核销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_orderwriteoff_ex_async(request, headers, runtime)

    def exec_consumecard_orderwriteoff_ex(
        self,
        request: baasdt_models.ExecConsumecardOrderwriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrderwriteoffResponse:
        """
        Description: 账单核销和交易核销，传入交易类型和订单Id
        Summary: 数字商品服务-消费卡服务-账单和交易核销
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrderwriteoffResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.orderwriteoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_orderwriteoff_ex_async(
        self,
        request: baasdt_models.ExecConsumecardOrderwriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrderwriteoffResponse:
        """
        Description: 账单核销和交易核销，传入交易类型和订单Id
        Summary: 数字商品服务-消费卡服务-账单和交易核销
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrderwriteoffResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.orderwriteoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_consumecard_billrefund(
        self,
        request: baasdt_models.ConfirmConsumecardBillrefundRequest,
    ) -> baasdt_models.ConfirmConsumecardBillrefundResponse:
        """
        Description: 处理买家的退款申请，接受退款或者拒绝退款
        Summary: 数字商品服务-消费卡服务-账单退款处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_consumecard_billrefund_ex(request, headers, runtime)

    async def confirm_consumecard_billrefund_async(
        self,
        request: baasdt_models.ConfirmConsumecardBillrefundRequest,
    ) -> baasdt_models.ConfirmConsumecardBillrefundResponse:
        """
        Description: 处理买家的退款申请，接受退款或者拒绝退款
        Summary: 数字商品服务-消费卡服务-账单退款处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_consumecard_billrefund_ex_async(request, headers, runtime)

    def confirm_consumecard_billrefund_ex(
        self,
        request: baasdt_models.ConfirmConsumecardBillrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmConsumecardBillrefundResponse:
        """
        Description: 处理买家的退款申请，接受退款或者拒绝退款
        Summary: 数字商品服务-消费卡服务-账单退款处理
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmConsumecardBillrefundResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billrefund.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_consumecard_billrefund_ex_async(
        self,
        request: baasdt_models.ConfirmConsumecardBillrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmConsumecardBillrefundResponse:
        """
        Description: 处理买家的退款申请，接受退款或者拒绝退款
        Summary: 数字商品服务-消费卡服务-账单退款处理
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmConsumecardBillrefundResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billrefund.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_account(
        self,
        request: baasdt_models.QueryConsumecardAccountRequest,
    ) -> baasdt_models.QueryConsumecardAccountResponse:
        """
        Description: 查询账户信息
        Summary: 数字商品服务-消费卡服务-查询账户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_account_ex(request, headers, runtime)

    async def query_consumecard_account_async(
        self,
        request: baasdt_models.QueryConsumecardAccountRequest,
    ) -> baasdt_models.QueryConsumecardAccountResponse:
        """
        Description: 查询账户信息
        Summary: 数字商品服务-消费卡服务-查询账户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_account_ex_async(request, headers, runtime)

    def query_consumecard_account_ex(
        self,
        request: baasdt_models.QueryConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardAccountResponse:
        """
        Description: 查询账户信息
        Summary: 数字商品服务-消费卡服务-查询账户信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_account_ex_async(
        self,
        request: baasdt_models.QueryConsumecardAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardAccountResponse:
        """
        Description: 查询账户信息
        Summary: 数字商品服务-消费卡服务-查询账户信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_consumecard_wallet(
        self,
        request: baasdt_models.OpenConsumecardWalletRequest,
    ) -> baasdt_models.OpenConsumecardWalletResponse:
        """
        Description: 开通钱包
        Summary: 数字商品服务-消费卡服务-开通钱包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_consumecard_wallet_ex(request, headers, runtime)

    async def open_consumecard_wallet_async(
        self,
        request: baasdt_models.OpenConsumecardWalletRequest,
    ) -> baasdt_models.OpenConsumecardWalletResponse:
        """
        Description: 开通钱包
        Summary: 数字商品服务-消费卡服务-开通钱包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_consumecard_wallet_ex_async(request, headers, runtime)

    def open_consumecard_wallet_ex(
        self,
        request: baasdt_models.OpenConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OpenConsumecardWalletResponse:
        """
        Description: 开通钱包
        Summary: 数字商品服务-消费卡服务-开通钱包
        """
        UtilClient.validate_model(request)
        return baasdt_models.OpenConsumecardWalletResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.wallet.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_consumecard_wallet_ex_async(
        self,
        request: baasdt_models.OpenConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OpenConsumecardWalletResponse:
        """
        Description: 开通钱包
        Summary: 数字商品服务-消费卡服务-开通钱包
        """
        UtilClient.validate_model(request)
        return baasdt_models.OpenConsumecardWalletResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.wallet.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_wallet(
        self,
        request: baasdt_models.QueryConsumecardWalletRequest,
    ) -> baasdt_models.QueryConsumecardWalletResponse:
        """
        Description: 查询钱包信息
        Summary: 数字商品服务-消费卡服务-查询钱包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_wallet_ex(request, headers, runtime)

    async def query_consumecard_wallet_async(
        self,
        request: baasdt_models.QueryConsumecardWalletRequest,
    ) -> baasdt_models.QueryConsumecardWalletResponse:
        """
        Description: 查询钱包信息
        Summary: 数字商品服务-消费卡服务-查询钱包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_wallet_ex_async(request, headers, runtime)

    def query_consumecard_wallet_ex(
        self,
        request: baasdt_models.QueryConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardWalletResponse:
        """
        Description: 查询钱包信息
        Summary: 数字商品服务-消费卡服务-查询钱包
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardWalletResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.wallet.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_wallet_ex_async(
        self,
        request: baasdt_models.QueryConsumecardWalletRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardWalletResponse:
        """
        Description: 查询钱包信息
        Summary: 数字商品服务-消费卡服务-查询钱包
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardWalletResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.wallet.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_walletchargetotoken(
        self,
        request: baasdt_models.ExecConsumecardWalletchargetotokenRequest,
    ) -> baasdt_models.ExecConsumecardWalletchargetotokenResponse:
        """
        Description: 充值并兑换token,资金托管员权限,运营平台无权限。
        Summary: 数字商品服务-消费卡服务-充值并兑换资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_walletchargetotoken_ex(request, headers, runtime)

    async def exec_consumecard_walletchargetotoken_async(
        self,
        request: baasdt_models.ExecConsumecardWalletchargetotokenRequest,
    ) -> baasdt_models.ExecConsumecardWalletchargetotokenResponse:
        """
        Description: 充值并兑换token,资金托管员权限,运营平台无权限。
        Summary: 数字商品服务-消费卡服务-充值并兑换资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_walletchargetotoken_ex_async(request, headers, runtime)

    def exec_consumecard_walletchargetotoken_ex(
        self,
        request: baasdt_models.ExecConsumecardWalletchargetotokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardWalletchargetotokenResponse:
        """
        Description: 充值并兑换token,资金托管员权限,运营平台无权限。
        Summary: 数字商品服务-消费卡服务-充值并兑换资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardWalletchargetotokenResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.walletchargetotoken.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_walletchargetotoken_ex_async(
        self,
        request: baasdt_models.ExecConsumecardWalletchargetotokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardWalletchargetotokenResponse:
        """
        Description: 充值并兑换token,资金托管员权限,运营平台无权限。
        Summary: 数字商品服务-消费卡服务-充值并兑换资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardWalletchargetotokenResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.walletchargetotoken.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_walletredeemtoken(
        self,
        request: baasdt_models.ExecConsumecardWalletredeemtokenRequest,
    ) -> baasdt_models.ExecConsumecardWalletredeemtokenResponse:
        """
        Description: 湮灭自己发行的token并提现
        Summary: 数字商品服务-消费卡服务-湮灭资产并提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_walletredeemtoken_ex(request, headers, runtime)

    async def exec_consumecard_walletredeemtoken_async(
        self,
        request: baasdt_models.ExecConsumecardWalletredeemtokenRequest,
    ) -> baasdt_models.ExecConsumecardWalletredeemtokenResponse:
        """
        Description: 湮灭自己发行的token并提现
        Summary: 数字商品服务-消费卡服务-湮灭资产并提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_walletredeemtoken_ex_async(request, headers, runtime)

    def exec_consumecard_walletredeemtoken_ex(
        self,
        request: baasdt_models.ExecConsumecardWalletredeemtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardWalletredeemtokenResponse:
        """
        Description: 湮灭自己发行的token并提现
        Summary: 数字商品服务-消费卡服务-湮灭资产并提现
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardWalletredeemtokenResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.walletredeemtoken.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_walletredeemtoken_ex_async(
        self,
        request: baasdt_models.ExecConsumecardWalletredeemtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardWalletredeemtokenResponse:
        """
        Description: 湮灭自己发行的token并提现
        Summary: 数字商品服务-消费卡服务-湮灭资产并提现
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardWalletredeemtokenResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.walletredeemtoken.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_consumecard_purchase(
        self,
        request: baasdt_models.StartConsumecardPurchaseRequest,
    ) -> baasdt_models.StartConsumecardPurchaseResponse:
        """
        Description: 买家发起交易
        Summary: 数字商品服务-消费卡服务-买家发起交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_consumecard_purchase_ex(request, headers, runtime)

    async def start_consumecard_purchase_async(
        self,
        request: baasdt_models.StartConsumecardPurchaseRequest,
    ) -> baasdt_models.StartConsumecardPurchaseResponse:
        """
        Description: 买家发起交易
        Summary: 数字商品服务-消费卡服务-买家发起交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_consumecard_purchase_ex_async(request, headers, runtime)

    def start_consumecard_purchase_ex(
        self,
        request: baasdt_models.StartConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.StartConsumecardPurchaseResponse:
        """
        Description: 买家发起交易
        Summary: 数字商品服务-消费卡服务-买家发起交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.StartConsumecardPurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchase.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_consumecard_purchase_ex_async(
        self,
        request: baasdt_models.StartConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.StartConsumecardPurchaseResponse:
        """
        Description: 买家发起交易
        Summary: 数字商品服务-消费卡服务-买家发起交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.StartConsumecardPurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchase.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_consumecard_buyerpurchase(
        self,
        request: baasdt_models.CancelConsumecardBuyerpurchaseRequest,
    ) -> baasdt_models.CancelConsumecardBuyerpurchaseResponse:
        """
        Description: 取消交易，买家发起
        Summary: 数字商品服务-消费卡服务-买家取消交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_consumecard_buyerpurchase_ex(request, headers, runtime)

    async def cancel_consumecard_buyerpurchase_async(
        self,
        request: baasdt_models.CancelConsumecardBuyerpurchaseRequest,
    ) -> baasdt_models.CancelConsumecardBuyerpurchaseResponse:
        """
        Description: 取消交易，买家发起
        Summary: 数字商品服务-消费卡服务-买家取消交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_consumecard_buyerpurchase_ex_async(request, headers, runtime)

    def cancel_consumecard_buyerpurchase_ex(
        self,
        request: baasdt_models.CancelConsumecardBuyerpurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelConsumecardBuyerpurchaseResponse:
        """
        Description: 取消交易，买家发起
        Summary: 数字商品服务-消费卡服务-买家取消交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelConsumecardBuyerpurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.buyerpurchase.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_consumecard_buyerpurchase_ex_async(
        self,
        request: baasdt_models.CancelConsumecardBuyerpurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelConsumecardBuyerpurchaseResponse:
        """
        Description: 取消交易，买家发起
        Summary: 数字商品服务-消费卡服务-买家取消交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelConsumecardBuyerpurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.buyerpurchase.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_consumecard_purchaserefund(
        self,
        request: baasdt_models.ApplyConsumecardPurchaserefundRequest,
    ) -> baasdt_models.ApplyConsumecardPurchaserefundResponse:
        """
        Description: 买家申请退款
        Summary: 数字商品服务-消费卡服务-买家申请退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_consumecard_purchaserefund_ex(request, headers, runtime)

    async def apply_consumecard_purchaserefund_async(
        self,
        request: baasdt_models.ApplyConsumecardPurchaserefundRequest,
    ) -> baasdt_models.ApplyConsumecardPurchaserefundResponse:
        """
        Description: 买家申请退款
        Summary: 数字商品服务-消费卡服务-买家申请退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_consumecard_purchaserefund_ex_async(request, headers, runtime)

    def apply_consumecard_purchaserefund_ex(
        self,
        request: baasdt_models.ApplyConsumecardPurchaserefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyConsumecardPurchaserefundResponse:
        """
        Description: 买家申请退款
        Summary: 数字商品服务-消费卡服务-买家申请退款
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyConsumecardPurchaserefundResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchaserefund.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_consumecard_purchaserefund_ex_async(
        self,
        request: baasdt_models.ApplyConsumecardPurchaserefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyConsumecardPurchaserefundResponse:
        """
        Description: 买家申请退款
        Summary: 数字商品服务-消费卡服务-买家申请退款
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyConsumecardPurchaserefundResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchaserefund.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_consumecard_purchasereplace(
        self,
        request: baasdt_models.ApplyConsumecardPurchasereplaceRequest,
    ) -> baasdt_models.ApplyConsumecardPurchasereplaceResponse:
        """
        Description: 买家申请售后
        Summary: 数字商品服务-消费卡服务-买家申请售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_consumecard_purchasereplace_ex(request, headers, runtime)

    async def apply_consumecard_purchasereplace_async(
        self,
        request: baasdt_models.ApplyConsumecardPurchasereplaceRequest,
    ) -> baasdt_models.ApplyConsumecardPurchasereplaceResponse:
        """
        Description: 买家申请售后
        Summary: 数字商品服务-消费卡服务-买家申请售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_consumecard_purchasereplace_ex_async(request, headers, runtime)

    def apply_consumecard_purchasereplace_ex(
        self,
        request: baasdt_models.ApplyConsumecardPurchasereplaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyConsumecardPurchasereplaceResponse:
        """
        Description: 买家申请售后
        Summary: 数字商品服务-消费卡服务-买家申请售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyConsumecardPurchasereplaceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchasereplace.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_consumecard_purchasereplace_ex_async(
        self,
        request: baasdt_models.ApplyConsumecardPurchasereplaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyConsumecardPurchasereplaceResponse:
        """
        Description: 买家申请售后
        Summary: 数字商品服务-消费卡服务-买家申请售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyConsumecardPurchasereplaceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchasereplace.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_purchasereceive(
        self,
        request: baasdt_models.ExecConsumecardPurchasereceiveRequest,
    ) -> baasdt_models.ExecConsumecardPurchasereceiveResponse:
        """
        Description: 买家确认收货
        Summary: 数字商品服务-消费卡服务-买家确认收货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_purchasereceive_ex(request, headers, runtime)

    async def exec_consumecard_purchasereceive_async(
        self,
        request: baasdt_models.ExecConsumecardPurchasereceiveRequest,
    ) -> baasdt_models.ExecConsumecardPurchasereceiveResponse:
        """
        Description: 买家确认收货
        Summary: 数字商品服务-消费卡服务-买家确认收货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_purchasereceive_ex_async(request, headers, runtime)

    def exec_consumecard_purchasereceive_ex(
        self,
        request: baasdt_models.ExecConsumecardPurchasereceiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardPurchasereceiveResponse:
        """
        Description: 买家确认收货
        Summary: 数字商品服务-消费卡服务-买家确认收货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardPurchasereceiveResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchasereceive.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_purchasereceive_ex_async(
        self,
        request: baasdt_models.ExecConsumecardPurchasereceiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardPurchasereceiveResponse:
        """
        Description: 买家确认收货
        Summary: 数字商品服务-消费卡服务-买家确认收货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardPurchasereceiveResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchasereceive.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_consumecard_purchase(
        self,
        request: baasdt_models.RefuseConsumecardPurchaseRequest,
    ) -> baasdt_models.RefuseConsumecardPurchaseResponse:
        """
        Description: 卖家拒绝交易
        Summary: 数字商品服务-消费卡服务-卖家拒绝交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_consumecard_purchase_ex(request, headers, runtime)

    async def refuse_consumecard_purchase_async(
        self,
        request: baasdt_models.RefuseConsumecardPurchaseRequest,
    ) -> baasdt_models.RefuseConsumecardPurchaseResponse:
        """
        Description: 卖家拒绝交易
        Summary: 数字商品服务-消费卡服务-卖家拒绝交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_consumecard_purchase_ex_async(request, headers, runtime)

    def refuse_consumecard_purchase_ex(
        self,
        request: baasdt_models.RefuseConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RefuseConsumecardPurchaseResponse:
        """
        Description: 卖家拒绝交易
        Summary: 数字商品服务-消费卡服务-卖家拒绝交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.RefuseConsumecardPurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchase.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_consumecard_purchase_ex_async(
        self,
        request: baasdt_models.RefuseConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RefuseConsumecardPurchaseResponse:
        """
        Description: 卖家拒绝交易
        Summary: 数字商品服务-消费卡服务-卖家拒绝交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.RefuseConsumecardPurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchase.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_purchaserefund(
        self,
        request: baasdt_models.SetConsumecardPurchaserefundRequest,
    ) -> baasdt_models.SetConsumecardPurchaserefundResponse:
        """
        Description: 卖家退款操作。可以同意退款和拒绝退款。
        Summary: 数字商品服务-消费卡服务-卖家退款操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_purchaserefund_ex(request, headers, runtime)

    async def set_consumecard_purchaserefund_async(
        self,
        request: baasdt_models.SetConsumecardPurchaserefundRequest,
    ) -> baasdt_models.SetConsumecardPurchaserefundResponse:
        """
        Description: 卖家退款操作。可以同意退款和拒绝退款。
        Summary: 数字商品服务-消费卡服务-卖家退款操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_purchaserefund_ex_async(request, headers, runtime)

    def set_consumecard_purchaserefund_ex(
        self,
        request: baasdt_models.SetConsumecardPurchaserefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardPurchaserefundResponse:
        """
        Description: 卖家退款操作。可以同意退款和拒绝退款。
        Summary: 数字商品服务-消费卡服务-卖家退款操作
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardPurchaserefundResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchaserefund.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_purchaserefund_ex_async(
        self,
        request: baasdt_models.SetConsumecardPurchaserefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardPurchaserefundResponse:
        """
        Description: 卖家退款操作。可以同意退款和拒绝退款。
        Summary: 数字商品服务-消费卡服务-卖家退款操作
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardPurchaserefundResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchaserefund.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_purchasereplace(
        self,
        request: baasdt_models.SetConsumecardPurchasereplaceRequest,
    ) -> baasdt_models.SetConsumecardPurchasereplaceResponse:
        """
        Description: 卖家换货操作。可以同意换货，拒绝换货
        Summary: 数字商品服务-消费卡服务-卖家换货操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_purchasereplace_ex(request, headers, runtime)

    async def set_consumecard_purchasereplace_async(
        self,
        request: baasdt_models.SetConsumecardPurchasereplaceRequest,
    ) -> baasdt_models.SetConsumecardPurchasereplaceResponse:
        """
        Description: 卖家换货操作。可以同意换货，拒绝换货
        Summary: 数字商品服务-消费卡服务-卖家换货操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_purchasereplace_ex_async(request, headers, runtime)

    def set_consumecard_purchasereplace_ex(
        self,
        request: baasdt_models.SetConsumecardPurchasereplaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardPurchasereplaceResponse:
        """
        Description: 卖家换货操作。可以同意换货，拒绝换货
        Summary: 数字商品服务-消费卡服务-卖家换货操作
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardPurchasereplaceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchasereplace.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_purchasereplace_ex_async(
        self,
        request: baasdt_models.SetConsumecardPurchasereplaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardPurchasereplaceResponse:
        """
        Description: 卖家换货操作。可以同意换货，拒绝换货
        Summary: 数字商品服务-消费卡服务-卖家换货操作
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardPurchasereplaceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchasereplace.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_consumecard_purchase(
        self,
        request: baasdt_models.ConfirmConsumecardPurchaseRequest,
    ) -> baasdt_models.ConfirmConsumecardPurchaseResponse:
        """
        Description: 卖家接单
        Summary: 数字商品服务-消费卡服务-卖家接单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_consumecard_purchase_ex(request, headers, runtime)

    async def confirm_consumecard_purchase_async(
        self,
        request: baasdt_models.ConfirmConsumecardPurchaseRequest,
    ) -> baasdt_models.ConfirmConsumecardPurchaseResponse:
        """
        Description: 卖家接单
        Summary: 数字商品服务-消费卡服务-卖家接单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_consumecard_purchase_ex_async(request, headers, runtime)

    def confirm_consumecard_purchase_ex(
        self,
        request: baasdt_models.ConfirmConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmConsumecardPurchaseResponse:
        """
        Description: 卖家接单
        Summary: 数字商品服务-消费卡服务-卖家接单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmConsumecardPurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchase.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_consumecard_purchase_ex_async(
        self,
        request: baasdt_models.ConfirmConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmConsumecardPurchaseResponse:
        """
        Description: 卖家接单
        Summary: 数字商品服务-消费卡服务-卖家接单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmConsumecardPurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchase.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_consumecard_purchase(
        self,
        request: baasdt_models.SendConsumecardPurchaseRequest,
    ) -> baasdt_models.SendConsumecardPurchaseResponse:
        """
        Description: 卖家发货
        Summary: 数字商品服务-消费卡服务-卖家发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_consumecard_purchase_ex(request, headers, runtime)

    async def send_consumecard_purchase_async(
        self,
        request: baasdt_models.SendConsumecardPurchaseRequest,
    ) -> baasdt_models.SendConsumecardPurchaseResponse:
        """
        Description: 卖家发货
        Summary: 数字商品服务-消费卡服务-卖家发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_consumecard_purchase_ex_async(request, headers, runtime)

    def send_consumecard_purchase_ex(
        self,
        request: baasdt_models.SendConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SendConsumecardPurchaseResponse:
        """
        Description: 卖家发货
        Summary: 数字商品服务-消费卡服务-卖家发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.SendConsumecardPurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchase.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_consumecard_purchase_ex_async(
        self,
        request: baasdt_models.SendConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SendConsumecardPurchaseResponse:
        """
        Description: 卖家发货
        Summary: 数字商品服务-消费卡服务-卖家发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.SendConsumecardPurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchase.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_consumecard_purchase(
        self,
        request: baasdt_models.ReplaceConsumecardPurchaseRequest,
    ) -> baasdt_models.ReplaceConsumecardPurchaseResponse:
        """
        Description: 卖家售后补发货
        Summary: 数字商品服务-消费卡服务-卖家售后补发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_consumecard_purchase_ex(request, headers, runtime)

    async def replace_consumecard_purchase_async(
        self,
        request: baasdt_models.ReplaceConsumecardPurchaseRequest,
    ) -> baasdt_models.ReplaceConsumecardPurchaseResponse:
        """
        Description: 卖家售后补发货
        Summary: 数字商品服务-消费卡服务-卖家售后补发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_consumecard_purchase_ex_async(request, headers, runtime)

    def replace_consumecard_purchase_ex(
        self,
        request: baasdt_models.ReplaceConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReplaceConsumecardPurchaseResponse:
        """
        Description: 卖家售后补发货
        Summary: 数字商品服务-消费卡服务-卖家售后补发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReplaceConsumecardPurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchase.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_consumecard_purchase_ex_async(
        self,
        request: baasdt_models.ReplaceConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReplaceConsumecardPurchaseResponse:
        """
        Description: 卖家售后补发货
        Summary: 数字商品服务-消费卡服务-卖家售后补发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReplaceConsumecardPurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchase.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumecard_goods(
        self,
        request: baasdt_models.CreateConsumecardGoodsRequest,
    ) -> baasdt_models.CreateConsumecardGoodsResponse:
        """
        Description: 发布商品
        Summary: 数字商品服务-消费卡服务-发布商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumecard_goods_ex(request, headers, runtime)

    async def create_consumecard_goods_async(
        self,
        request: baasdt_models.CreateConsumecardGoodsRequest,
    ) -> baasdt_models.CreateConsumecardGoodsResponse:
        """
        Description: 发布商品
        Summary: 数字商品服务-消费卡服务-发布商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumecard_goods_ex_async(request, headers, runtime)

    def create_consumecard_goods_ex(
        self,
        request: baasdt_models.CreateConsumecardGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardGoodsResponse:
        """
        Description: 发布商品
        Summary: 数字商品服务-消费卡服务-发布商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goods.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumecard_goods_ex_async(
        self,
        request: baasdt_models.CreateConsumecardGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardGoodsResponse:
        """
        Description: 发布商品
        Summary: 数字商品服务-消费卡服务-发布商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goods.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_consumecard_goods(
        self,
        request: baasdt_models.UpdateConsumecardGoodsRequest,
    ) -> baasdt_models.UpdateConsumecardGoodsResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-消费卡服务-更新商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_consumecard_goods_ex(request, headers, runtime)

    async def update_consumecard_goods_async(
        self,
        request: baasdt_models.UpdateConsumecardGoodsRequest,
    ) -> baasdt_models.UpdateConsumecardGoodsResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-消费卡服务-更新商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_consumecard_goods_ex_async(request, headers, runtime)

    def update_consumecard_goods_ex(
        self,
        request: baasdt_models.UpdateConsumecardGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConsumecardGoodsResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-消费卡服务-更新商品信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConsumecardGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goods.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_consumecard_goods_ex_async(
        self,
        request: baasdt_models.UpdateConsumecardGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConsumecardGoodsResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-消费卡服务-更新商品信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConsumecardGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goods.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_consumecard_goodstocustom(
        self,
        request: baasdt_models.OpenConsumecardGoodstocustomRequest,
    ) -> baasdt_models.OpenConsumecardGoodstocustomResponse:
        """
        Description: 商品开放购买权限给指定账户
        Summary: 数字商品服务-消费卡服务-开放购买权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_consumecard_goodstocustom_ex(request, headers, runtime)

    async def open_consumecard_goodstocustom_async(
        self,
        request: baasdt_models.OpenConsumecardGoodstocustomRequest,
    ) -> baasdt_models.OpenConsumecardGoodstocustomResponse:
        """
        Description: 商品开放购买权限给指定账户
        Summary: 数字商品服务-消费卡服务-开放购买权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_consumecard_goodstocustom_ex_async(request, headers, runtime)

    def open_consumecard_goodstocustom_ex(
        self,
        request: baasdt_models.OpenConsumecardGoodstocustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OpenConsumecardGoodstocustomResponse:
        """
        Description: 商品开放购买权限给指定账户
        Summary: 数字商品服务-消费卡服务-开放购买权限
        """
        UtilClient.validate_model(request)
        return baasdt_models.OpenConsumecardGoodstocustomResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodstocustom.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_consumecard_goodstocustom_ex_async(
        self,
        request: baasdt_models.OpenConsumecardGoodstocustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OpenConsumecardGoodstocustomResponse:
        """
        Description: 商品开放购买权限给指定账户
        Summary: 数字商品服务-消费卡服务-开放购买权限
        """
        UtilClient.validate_model(request)
        return baasdt_models.OpenConsumecardGoodstocustomResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodstocustom.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumecard_goodscategory(
        self,
        request: baasdt_models.CreateConsumecardGoodscategoryRequest,
    ) -> baasdt_models.CreateConsumecardGoodscategoryResponse:
        """
        Description: 新增商品类别
        Summary: 数字商品服务-消费卡服务-新增商品类别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumecard_goodscategory_ex(request, headers, runtime)

    async def create_consumecard_goodscategory_async(
        self,
        request: baasdt_models.CreateConsumecardGoodscategoryRequest,
    ) -> baasdt_models.CreateConsumecardGoodscategoryResponse:
        """
        Description: 新增商品类别
        Summary: 数字商品服务-消费卡服务-新增商品类别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumecard_goodscategory_ex_async(request, headers, runtime)

    def create_consumecard_goodscategory_ex(
        self,
        request: baasdt_models.CreateConsumecardGoodscategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardGoodscategoryResponse:
        """
        Description: 新增商品类别
        Summary: 数字商品服务-消费卡服务-新增商品类别
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardGoodscategoryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodscategory.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumecard_goodscategory_ex_async(
        self,
        request: baasdt_models.CreateConsumecardGoodscategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardGoodscategoryResponse:
        """
        Description: 新增商品类别
        Summary: 数字商品服务-消费卡服务-新增商品类别
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardGoodscategoryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodscategory.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_goodscustomprice(
        self,
        request: baasdt_models.SetConsumecardGoodscustompriceRequest,
    ) -> baasdt_models.SetConsumecardGoodscustompriceResponse:
        """
        Description: 设置商品一客一价
        Summary: 数字商品服务-消费卡服务-设置一客一价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_goodscustomprice_ex(request, headers, runtime)

    async def set_consumecard_goodscustomprice_async(
        self,
        request: baasdt_models.SetConsumecardGoodscustompriceRequest,
    ) -> baasdt_models.SetConsumecardGoodscustompriceResponse:
        """
        Description: 设置商品一客一价
        Summary: 数字商品服务-消费卡服务-设置一客一价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_goodscustomprice_ex_async(request, headers, runtime)

    def set_consumecard_goodscustomprice_ex(
        self,
        request: baasdt_models.SetConsumecardGoodscustompriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardGoodscustompriceResponse:
        """
        Description: 设置商品一客一价
        Summary: 数字商品服务-消费卡服务-设置一客一价
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardGoodscustompriceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodscustomprice.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_goodscustomprice_ex_async(
        self,
        request: baasdt_models.SetConsumecardGoodscustompriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardGoodscustompriceResponse:
        """
        Description: 设置商品一客一价
        Summary: 数字商品服务-消费卡服务-设置一客一价
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardGoodscustompriceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodscustomprice.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_consumecard_goodsimage(
        self,
        request: baasdt_models.UploadConsumecardGoodsimageRequest,
    ) -> baasdt_models.UploadConsumecardGoodsimageResponse:
        """
        Description: 上传图片获取URL
        Summary: 数字商品服务-消费卡服务-上传图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_consumecard_goodsimage_ex(request, headers, runtime)

    async def upload_consumecard_goodsimage_async(
        self,
        request: baasdt_models.UploadConsumecardGoodsimageRequest,
    ) -> baasdt_models.UploadConsumecardGoodsimageResponse:
        """
        Description: 上传图片获取URL
        Summary: 数字商品服务-消费卡服务-上传图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_consumecard_goodsimage_ex_async(request, headers, runtime)

    def upload_consumecard_goodsimage_ex(
        self,
        request: baasdt_models.UploadConsumecardGoodsimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadConsumecardGoodsimageResponse:
        """
        Description: 上传图片获取URL
        Summary: 数字商品服务-消费卡服务-上传图片
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadConsumecardGoodsimageResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodsimage.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_consumecard_goodsimage_ex_async(
        self,
        request: baasdt_models.UploadConsumecardGoodsimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadConsumecardGoodsimageResponse:
        """
        Description: 上传图片获取URL
        Summary: 数字商品服务-消费卡服务-上传图片
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadConsumecardGoodsimageResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodsimage.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_ordertrywithdraw(
        self,
        request: baasdt_models.ExecConsumecardOrdertrywithdrawRequest,
    ) -> baasdt_models.ExecConsumecardOrdertrywithdrawResponse:
        """
        Description: 机构订单提现试算
        Summary: 数字商品服务-消费卡服务-企业提现试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_ordertrywithdraw_ex(request, headers, runtime)

    async def exec_consumecard_ordertrywithdraw_async(
        self,
        request: baasdt_models.ExecConsumecardOrdertrywithdrawRequest,
    ) -> baasdt_models.ExecConsumecardOrdertrywithdrawResponse:
        """
        Description: 机构订单提现试算
        Summary: 数字商品服务-消费卡服务-企业提现试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_ordertrywithdraw_ex_async(request, headers, runtime)

    def exec_consumecard_ordertrywithdraw_ex(
        self,
        request: baasdt_models.ExecConsumecardOrdertrywithdrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrdertrywithdrawResponse:
        """
        Description: 机构订单提现试算
        Summary: 数字商品服务-消费卡服务-企业提现试算
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrdertrywithdrawResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.ordertrywithdraw.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_ordertrywithdraw_ex_async(
        self,
        request: baasdt_models.ExecConsumecardOrdertrywithdrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrdertrywithdrawResponse:
        """
        Description: 机构订单提现试算
        Summary: 数字商品服务-消费卡服务-企业提现试算
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrdertrywithdrawResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.ordertrywithdraw.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_orderwithdrawbyblocknum(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyblocknumRequest,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyblocknumResponse:
        """
        Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
        Summary: 数字商品服务-消费卡服务-根据区块提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_orderwithdrawbyblocknum_ex(request, headers, runtime)

    async def exec_consumecard_orderwithdrawbyblocknum_async(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyblocknumRequest,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyblocknumResponse:
        """
        Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
        Summary: 数字商品服务-消费卡服务-根据区块提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_orderwithdrawbyblocknum_ex_async(request, headers, runtime)

    def exec_consumecard_orderwithdrawbyblocknum_ex(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyblocknumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyblocknumResponse:
        """
        Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
        Summary: 数字商品服务-消费卡服务-根据区块提现
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrderwithdrawbyblocknumResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.orderwithdrawbyblocknum.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_orderwithdrawbyblocknum_ex_async(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyblocknumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyblocknumResponse:
        """
        Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
        Summary: 数字商品服务-消费卡服务-根据区块提现
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrderwithdrawbyblocknumResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.orderwithdrawbyblocknum.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_consumecard_orderwithdrawbyids(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyidsRequest,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyidsResponse:
        """
        Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
        Summary: 数字商品服务-消费卡服务-根据订单表提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_consumecard_orderwithdrawbyids_ex(request, headers, runtime)

    async def exec_consumecard_orderwithdrawbyids_async(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyidsRequest,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyidsResponse:
        """
        Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
        Summary: 数字商品服务-消费卡服务-根据订单表提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_consumecard_orderwithdrawbyids_ex_async(request, headers, runtime)

    def exec_consumecard_orderwithdrawbyids_ex(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyidsResponse:
        """
        Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
        Summary: 数字商品服务-消费卡服务-根据订单表提现
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrderwithdrawbyidsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.orderwithdrawbyids.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_consumecard_orderwithdrawbyids_ex_async(
        self,
        request: baasdt_models.ExecConsumecardOrderwithdrawbyidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecConsumecardOrderwithdrawbyidsResponse:
        """
        Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
        Summary: 数字商品服务-消费卡服务-根据订单表提现
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecConsumecardOrderwithdrawbyidsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.orderwithdrawbyids.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_consumecard_orderwithdrawresult(
        self,
        request: baasdt_models.GetConsumecardOrderwithdrawresultRequest,
    ) -> baasdt_models.GetConsumecardOrderwithdrawresultResponse:
        """
        Description: 根据提现单号获取提现结果
        Summary: 数字商品服务-消费卡服务-获取提现结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_consumecard_orderwithdrawresult_ex(request, headers, runtime)

    async def get_consumecard_orderwithdrawresult_async(
        self,
        request: baasdt_models.GetConsumecardOrderwithdrawresultRequest,
    ) -> baasdt_models.GetConsumecardOrderwithdrawresultResponse:
        """
        Description: 根据提现单号获取提现结果
        Summary: 数字商品服务-消费卡服务-获取提现结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_consumecard_orderwithdrawresult_ex_async(request, headers, runtime)

    def get_consumecard_orderwithdrawresult_ex(
        self,
        request: baasdt_models.GetConsumecardOrderwithdrawresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.GetConsumecardOrderwithdrawresultResponse:
        """
        Description: 根据提现单号获取提现结果
        Summary: 数字商品服务-消费卡服务-获取提现结果
        """
        UtilClient.validate_model(request)
        return baasdt_models.GetConsumecardOrderwithdrawresultResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.orderwithdrawresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_consumecard_orderwithdrawresult_ex_async(
        self,
        request: baasdt_models.GetConsumecardOrderwithdrawresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.GetConsumecardOrderwithdrawresultResponse:
        """
        Description: 根据提现单号获取提现结果
        Summary: 数字商品服务-消费卡服务-获取提现结果
        """
        UtilClient.validate_model(request)
        return baasdt_models.GetConsumecardOrderwithdrawresultResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.orderwithdrawresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_walletredeemable(
        self,
        request: baasdt_models.QueryConsumecardWalletredeemableRequest,
    ) -> baasdt_models.QueryConsumecardWalletredeemableResponse:
        """
        Description: 注销前需要回退资金,查询账户可回退金额
        Summary: 数字商品服务-消费卡服务-查询可回退金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_walletredeemable_ex(request, headers, runtime)

    async def query_consumecard_walletredeemable_async(
        self,
        request: baasdt_models.QueryConsumecardWalletredeemableRequest,
    ) -> baasdt_models.QueryConsumecardWalletredeemableResponse:
        """
        Description: 注销前需要回退资金,查询账户可回退金额
        Summary: 数字商品服务-消费卡服务-查询可回退金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_walletredeemable_ex_async(request, headers, runtime)

    def query_consumecard_walletredeemable_ex(
        self,
        request: baasdt_models.QueryConsumecardWalletredeemableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardWalletredeemableResponse:
        """
        Description: 注销前需要回退资金,查询账户可回退金额
        Summary: 数字商品服务-消费卡服务-查询可回退金额
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardWalletredeemableResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.walletredeemable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_walletredeemable_ex_async(
        self,
        request: baasdt_models.QueryConsumecardWalletredeemableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardWalletredeemableResponse:
        """
        Description: 注销前需要回退资金,查询账户可回退金额
        Summary: 数字商品服务-消费卡服务-查询可回退金额
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardWalletredeemableResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.walletredeemable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_goodscreateresult(
        self,
        request: baasdt_models.QueryConsumecardGoodscreateresultRequest,
    ) -> baasdt_models.QueryConsumecardGoodscreateresultResponse:
        """
        Description: 发布商品是异步流程，根据requestId查询商品发布结果
        Summary: 数字商品服务-消费卡服务-查询商品发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_goodscreateresult_ex(request, headers, runtime)

    async def query_consumecard_goodscreateresult_async(
        self,
        request: baasdt_models.QueryConsumecardGoodscreateresultRequest,
    ) -> baasdt_models.QueryConsumecardGoodscreateresultResponse:
        """
        Description: 发布商品是异步流程，根据requestId查询商品发布结果
        Summary: 数字商品服务-消费卡服务-查询商品发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_goodscreateresult_ex_async(request, headers, runtime)

    def query_consumecard_goodscreateresult_ex(
        self,
        request: baasdt_models.QueryConsumecardGoodscreateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodscreateresultResponse:
        """
        Description: 发布商品是异步流程，根据requestId查询商品发布结果
        Summary: 数字商品服务-消费卡服务-查询商品发布
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodscreateresultResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodscreateresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_goodscreateresult_ex_async(
        self,
        request: baasdt_models.QueryConsumecardGoodscreateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodscreateresultResponse:
        """
        Description: 发布商品是异步流程，根据requestId查询商品发布结果
        Summary: 数字商品服务-消费卡服务-查询商品发布
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodscreateresultResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodscreateresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_goods(
        self,
        request: baasdt_models.QueryConsumecardGoodsRequest,
    ) -> baasdt_models.QueryConsumecardGoodsResponse:
        """
        Description: 查询消费卡商品信息
        Summary: 数字商品服务-消费卡服务-查询商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_goods_ex(request, headers, runtime)

    async def query_consumecard_goods_async(
        self,
        request: baasdt_models.QueryConsumecardGoodsRequest,
    ) -> baasdt_models.QueryConsumecardGoodsResponse:
        """
        Description: 查询消费卡商品信息
        Summary: 数字商品服务-消费卡服务-查询商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_goods_ex_async(request, headers, runtime)

    def query_consumecard_goods_ex(
        self,
        request: baasdt_models.QueryConsumecardGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodsResponse:
        """
        Description: 查询消费卡商品信息
        Summary: 数字商品服务-消费卡服务-查询商品信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_goods_ex_async(
        self,
        request: baasdt_models.QueryConsumecardGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodsResponse:
        """
        Description: 查询消费卡商品信息
        Summary: 数字商品服务-消费卡服务-查询商品信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_consumecard_billrefund(
        self,
        request: baasdt_models.ApplyConsumecardBillrefundRequest,
    ) -> baasdt_models.ApplyConsumecardBillrefundResponse:
        """
        Description: 账单退款申请
        Summary: 数字商品服务-消费卡服务-账单退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_consumecard_billrefund_ex(request, headers, runtime)

    async def apply_consumecard_billrefund_async(
        self,
        request: baasdt_models.ApplyConsumecardBillrefundRequest,
    ) -> baasdt_models.ApplyConsumecardBillrefundResponse:
        """
        Description: 账单退款申请
        Summary: 数字商品服务-消费卡服务-账单退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_consumecard_billrefund_ex_async(request, headers, runtime)

    def apply_consumecard_billrefund_ex(
        self,
        request: baasdt_models.ApplyConsumecardBillrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyConsumecardBillrefundResponse:
        """
        Description: 账单退款申请
        Summary: 数字商品服务-消费卡服务-账单退款申请
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyConsumecardBillrefundResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billrefund.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_consumecard_billrefund_ex_async(
        self,
        request: baasdt_models.ApplyConsumecardBillrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyConsumecardBillrefundResponse:
        """
        Description: 账单退款申请
        Summary: 数字商品服务-消费卡服务-账单退款申请
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyConsumecardBillrefundResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billrefund.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_purchase(
        self,
        request: baasdt_models.QueryConsumecardPurchaseRequest,
    ) -> baasdt_models.QueryConsumecardPurchaseResponse:
        """
        Description: 查询交易信息
        Summary: 数字商品服务-消费卡服务-交易查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_purchase_ex(request, headers, runtime)

    async def query_consumecard_purchase_async(
        self,
        request: baasdt_models.QueryConsumecardPurchaseRequest,
    ) -> baasdt_models.QueryConsumecardPurchaseResponse:
        """
        Description: 查询交易信息
        Summary: 数字商品服务-消费卡服务-交易查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_purchase_ex_async(request, headers, runtime)

    def query_consumecard_purchase_ex(
        self,
        request: baasdt_models.QueryConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardPurchaseResponse:
        """
        Description: 查询交易信息
        Summary: 数字商品服务-消费卡服务-交易查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardPurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.purchase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_purchase_ex_async(
        self,
        request: baasdt_models.QueryConsumecardPurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardPurchaseResponse:
        """
        Description: 查询交易信息
        Summary: 数字商品服务-消费卡服务-交易查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardPurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.purchase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_block(
        self,
        request: baasdt_models.QueryConsumecardBlockRequest,
    ) -> baasdt_models.QueryConsumecardBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-消费卡服务-获取区块
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_block_ex(request, headers, runtime)

    async def query_consumecard_block_async(
        self,
        request: baasdt_models.QueryConsumecardBlockRequest,
    ) -> baasdt_models.QueryConsumecardBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-消费卡服务-获取区块
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_block_ex_async(request, headers, runtime)

    def query_consumecard_block_ex(
        self,
        request: baasdt_models.QueryConsumecardBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-消费卡服务-获取区块
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardBlockResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_block_ex_async(
        self,
        request: baasdt_models.QueryConsumecardBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-消费卡服务-获取区块
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardBlockResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_lastblocknumber(
        self,
        request: baasdt_models.QueryConsumecardLastblocknumberRequest,
    ) -> baasdt_models.QueryConsumecardLastblocknumberResponse:
        """
        Description: 查询最新区块高度
        Summary: 数字商品服务-消费卡服务-查最新区块高度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_lastblocknumber_ex(request, headers, runtime)

    async def query_consumecard_lastblocknumber_async(
        self,
        request: baasdt_models.QueryConsumecardLastblocknumberRequest,
    ) -> baasdt_models.QueryConsumecardLastblocknumberResponse:
        """
        Description: 查询最新区块高度
        Summary: 数字商品服务-消费卡服务-查最新区块高度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_lastblocknumber_ex_async(request, headers, runtime)

    def query_consumecard_lastblocknumber_ex(
        self,
        request: baasdt_models.QueryConsumecardLastblocknumberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardLastblocknumberResponse:
        """
        Description: 查询最新区块高度
        Summary: 数字商品服务-消费卡服务-查最新区块高度
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardLastblocknumberResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.lastblocknumber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_lastblocknumber_ex_async(
        self,
        request: baasdt_models.QueryConsumecardLastblocknumberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardLastblocknumberResponse:
        """
        Description: 查询最新区块高度
        Summary: 数字商品服务-消费卡服务-查最新区块高度
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardLastblocknumberResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.lastblocknumber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_goodsupdateresult(
        self,
        request: baasdt_models.QueryConsumecardGoodsupdateresultRequest,
    ) -> baasdt_models.QueryConsumecardGoodsupdateresultResponse:
        """
        Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
        Summary: 数字商品服务-消费卡服务-更新结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_goodsupdateresult_ex(request, headers, runtime)

    async def query_consumecard_goodsupdateresult_async(
        self,
        request: baasdt_models.QueryConsumecardGoodsupdateresultRequest,
    ) -> baasdt_models.QueryConsumecardGoodsupdateresultResponse:
        """
        Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
        Summary: 数字商品服务-消费卡服务-更新结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_goodsupdateresult_ex_async(request, headers, runtime)

    def query_consumecard_goodsupdateresult_ex(
        self,
        request: baasdt_models.QueryConsumecardGoodsupdateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodsupdateresultResponse:
        """
        Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
        Summary: 数字商品服务-消费卡服务-更新结果查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodsupdateresultResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodsupdateresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_goodsupdateresult_ex_async(
        self,
        request: baasdt_models.QueryConsumecardGoodsupdateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodsupdateresultResponse:
        """
        Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
        Summary: 数字商品服务-消费卡服务-更新结果查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodsupdateresultResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodsupdateresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_consumecard_sellerpurchase(
        self,
        request: baasdt_models.CancelConsumecardSellerpurchaseRequest,
    ) -> baasdt_models.CancelConsumecardSellerpurchaseResponse:
        """
        Description: 卖家取消交易
        Summary: 数字商品服务--消费卡服务-卖家取消交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_consumecard_sellerpurchase_ex(request, headers, runtime)

    async def cancel_consumecard_sellerpurchase_async(
        self,
        request: baasdt_models.CancelConsumecardSellerpurchaseRequest,
    ) -> baasdt_models.CancelConsumecardSellerpurchaseResponse:
        """
        Description: 卖家取消交易
        Summary: 数字商品服务--消费卡服务-卖家取消交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_consumecard_sellerpurchase_ex_async(request, headers, runtime)

    def cancel_consumecard_sellerpurchase_ex(
        self,
        request: baasdt_models.CancelConsumecardSellerpurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelConsumecardSellerpurchaseResponse:
        """
        Description: 卖家取消交易
        Summary: 数字商品服务--消费卡服务-卖家取消交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelConsumecardSellerpurchaseResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.sellerpurchase.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_consumecard_sellerpurchase_ex_async(
        self,
        request: baasdt_models.CancelConsumecardSellerpurchaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelConsumecardSellerpurchaseResponse:
        """
        Description: 卖家取消交易
        Summary: 数字商品服务--消费卡服务-卖家取消交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelConsumecardSellerpurchaseResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.sellerpurchase.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_commission(
        self,
        request: baasdt_models.SetConsumecardCommissionRequest,
    ) -> baasdt_models.SetConsumecardCommissionResponse:
        """
        Description: 配置商品和账单的手续费信息
        Summary: 数字商品服务-消费卡服务-配置手续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_commission_ex(request, headers, runtime)

    async def set_consumecard_commission_async(
        self,
        request: baasdt_models.SetConsumecardCommissionRequest,
    ) -> baasdt_models.SetConsumecardCommissionResponse:
        """
        Description: 配置商品和账单的手续费信息
        Summary: 数字商品服务-消费卡服务-配置手续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_commission_ex_async(request, headers, runtime)

    def set_consumecard_commission_ex(
        self,
        request: baasdt_models.SetConsumecardCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardCommissionResponse:
        """
        Description: 配置商品和账单的手续费信息
        Summary: 数字商品服务-消费卡服务-配置手续费
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardCommissionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commission.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_commission_ex_async(
        self,
        request: baasdt_models.SetConsumecardCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardCommissionResponse:
        """
        Description: 配置商品和账单的手续费信息
        Summary: 数字商品服务-消费卡服务-配置手续费
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardCommissionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commission.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_consumecard_commission(
        self,
        request: baasdt_models.RemoveConsumecardCommissionRequest,
    ) -> baasdt_models.RemoveConsumecardCommissionResponse:
        """
        Description: 删除手续费配置
        Summary: 数字商品服务-消费卡服务-删除手续费配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_consumecard_commission_ex(request, headers, runtime)

    async def remove_consumecard_commission_async(
        self,
        request: baasdt_models.RemoveConsumecardCommissionRequest,
    ) -> baasdt_models.RemoveConsumecardCommissionResponse:
        """
        Description: 删除手续费配置
        Summary: 数字商品服务-消费卡服务-删除手续费配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_consumecard_commission_ex_async(request, headers, runtime)

    def remove_consumecard_commission_ex(
        self,
        request: baasdt_models.RemoveConsumecardCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardCommissionResponse:
        """
        Description: 删除手续费配置
        Summary: 数字商品服务-消费卡服务-删除手续费配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardCommissionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commission.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_consumecard_commission_ex_async(
        self,
        request: baasdt_models.RemoveConsumecardCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardCommissionResponse:
        """
        Description: 删除手续费配置
        Summary: 数字商品服务-消费卡服务-删除手续费配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardCommissionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commission.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_commission(
        self,
        request: baasdt_models.QueryConsumecardCommissionRequest,
    ) -> baasdt_models.QueryConsumecardCommissionResponse:
        """
        Description: 查询手续费信息
        Summary: 数字商品服务-消费卡服务-查询手续费信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_commission_ex(request, headers, runtime)

    async def query_consumecard_commission_async(
        self,
        request: baasdt_models.QueryConsumecardCommissionRequest,
    ) -> baasdt_models.QueryConsumecardCommissionResponse:
        """
        Description: 查询手续费信息
        Summary: 数字商品服务-消费卡服务-查询手续费信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_commission_ex_async(request, headers, runtime)

    def query_consumecard_commission_ex(
        self,
        request: baasdt_models.QueryConsumecardCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardCommissionResponse:
        """
        Description: 查询手续费信息
        Summary: 数字商品服务-消费卡服务-查询手续费信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardCommissionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_commission_ex_async(
        self,
        request: baasdt_models.QueryConsumecardCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardCommissionResponse:
        """
        Description: 查询手续费信息
        Summary: 数字商品服务-消费卡服务-查询手续费信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardCommissionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_commissionmanager(
        self,
        request: baasdt_models.SetConsumecardCommissionmanagerRequest,
    ) -> baasdt_models.SetConsumecardCommissionmanagerResponse:
        """
        Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
        Summary: 数字商品服务-消费卡服务-设置手续费管理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_commissionmanager_ex(request, headers, runtime)

    async def set_consumecard_commissionmanager_async(
        self,
        request: baasdt_models.SetConsumecardCommissionmanagerRequest,
    ) -> baasdt_models.SetConsumecardCommissionmanagerResponse:
        """
        Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
        Summary: 数字商品服务-消费卡服务-设置手续费管理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_commissionmanager_ex_async(request, headers, runtime)

    def set_consumecard_commissionmanager_ex(
        self,
        request: baasdt_models.SetConsumecardCommissionmanagerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardCommissionmanagerResponse:
        """
        Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
        Summary: 数字商品服务-消费卡服务-设置手续费管理
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardCommissionmanagerResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commissionmanager.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_commissionmanager_ex_async(
        self,
        request: baasdt_models.SetConsumecardCommissionmanagerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardCommissionmanagerResponse:
        """
        Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
        Summary: 数字商品服务-消费卡服务-设置手续费管理
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardCommissionmanagerResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commissionmanager.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_goodsstatus(
        self,
        request: baasdt_models.SetConsumecardGoodsstatusRequest,
    ) -> baasdt_models.SetConsumecardGoodsstatusResponse:
        """
        Description: 设置商品状态，可以设置为上线或下线
        Summary: 数字商品服务-消费卡服务-设置商品状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_goodsstatus_ex(request, headers, runtime)

    async def set_consumecard_goodsstatus_async(
        self,
        request: baasdt_models.SetConsumecardGoodsstatusRequest,
    ) -> baasdt_models.SetConsumecardGoodsstatusResponse:
        """
        Description: 设置商品状态，可以设置为上线或下线
        Summary: 数字商品服务-消费卡服务-设置商品状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_goodsstatus_ex_async(request, headers, runtime)

    def set_consumecard_goodsstatus_ex(
        self,
        request: baasdt_models.SetConsumecardGoodsstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardGoodsstatusResponse:
        """
        Description: 设置商品状态，可以设置为上线或下线
        Summary: 数字商品服务-消费卡服务-设置商品状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardGoodsstatusResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodsstatus.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_goodsstatus_ex_async(
        self,
        request: baasdt_models.SetConsumecardGoodsstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardGoodsstatusResponse:
        """
        Description: 设置商品状态，可以设置为上线或下线
        Summary: 数字商品服务-消费卡服务-设置商品状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardGoodsstatusResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodsstatus.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumecard_receiptcontract(
        self,
        request: baasdt_models.CreateConsumecardReceiptcontractRequest,
    ) -> baasdt_models.CreateConsumecardReceiptcontractResponse:
        """
        Description: 个人用户来账付款协议签约
        Summary: 数字商品-消费卡服务-个人用户签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumecard_receiptcontract_ex(request, headers, runtime)

    async def create_consumecard_receiptcontract_async(
        self,
        request: baasdt_models.CreateConsumecardReceiptcontractRequest,
    ) -> baasdt_models.CreateConsumecardReceiptcontractResponse:
        """
        Description: 个人用户来账付款协议签约
        Summary: 数字商品-消费卡服务-个人用户签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumecard_receiptcontract_ex_async(request, headers, runtime)

    def create_consumecard_receiptcontract_ex(
        self,
        request: baasdt_models.CreateConsumecardReceiptcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardReceiptcontractResponse:
        """
        Description: 个人用户来账付款协议签约
        Summary: 数字商品-消费卡服务-个人用户签约
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardReceiptcontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.receiptcontract.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumecard_receiptcontract_ex_async(
        self,
        request: baasdt_models.CreateConsumecardReceiptcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardReceiptcontractResponse:
        """
        Description: 个人用户来账付款协议签约
        Summary: 数字商品-消费卡服务-个人用户签约
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardReceiptcontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.receiptcontract.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_consumecard_receiptcontract(
        self,
        request: baasdt_models.RemoveConsumecardReceiptcontractRequest,
    ) -> baasdt_models.RemoveConsumecardReceiptcontractResponse:
        """
        Description: 来账协议解约接口
        Summary: 数字商品-消费卡服务-个人协议解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_consumecard_receiptcontract_ex(request, headers, runtime)

    async def remove_consumecard_receiptcontract_async(
        self,
        request: baasdt_models.RemoveConsumecardReceiptcontractRequest,
    ) -> baasdt_models.RemoveConsumecardReceiptcontractResponse:
        """
        Description: 来账协议解约接口
        Summary: 数字商品-消费卡服务-个人协议解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_consumecard_receiptcontract_ex_async(request, headers, runtime)

    def remove_consumecard_receiptcontract_ex(
        self,
        request: baasdt_models.RemoveConsumecardReceiptcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardReceiptcontractResponse:
        """
        Description: 来账协议解约接口
        Summary: 数字商品-消费卡服务-个人协议解约
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardReceiptcontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.receiptcontract.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_consumecard_receiptcontract_ex_async(
        self,
        request: baasdt_models.RemoveConsumecardReceiptcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardReceiptcontractResponse:
        """
        Description: 来账协议解约接口
        Summary: 数字商品-消费卡服务-个人协议解约
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardReceiptcontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.receiptcontract.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_receiptcontract(
        self,
        request: baasdt_models.QueryConsumecardReceiptcontractRequest,
    ) -> baasdt_models.QueryConsumecardReceiptcontractResponse:
        """
        Description: 来账协议查询接口
        Summary: 数字商品-消费卡服务-个人协议查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_receiptcontract_ex(request, headers, runtime)

    async def query_consumecard_receiptcontract_async(
        self,
        request: baasdt_models.QueryConsumecardReceiptcontractRequest,
    ) -> baasdt_models.QueryConsumecardReceiptcontractResponse:
        """
        Description: 来账协议查询接口
        Summary: 数字商品-消费卡服务-个人协议查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_receiptcontract_ex_async(request, headers, runtime)

    def query_consumecard_receiptcontract_ex(
        self,
        request: baasdt_models.QueryConsumecardReceiptcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardReceiptcontractResponse:
        """
        Description: 来账协议查询接口
        Summary: 数字商品-消费卡服务-个人协议查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardReceiptcontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.receiptcontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_receiptcontract_ex_async(
        self,
        request: baasdt_models.QueryConsumecardReceiptcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardReceiptcontractResponse:
        """
        Description: 来账协议查询接口
        Summary: 数字商品-消费卡服务-个人协议查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardReceiptcontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.receiptcontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumecard_billingcontract(
        self,
        request: baasdt_models.CreateConsumecardBillingcontractRequest,
    ) -> baasdt_models.CreateConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约
        Summary: 数字商品-消费卡服务-商家用户签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumecard_billingcontract_ex(request, headers, runtime)

    async def create_consumecard_billingcontract_async(
        self,
        request: baasdt_models.CreateConsumecardBillingcontractRequest,
    ) -> baasdt_models.CreateConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约
        Summary: 数字商品-消费卡服务-商家用户签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumecard_billingcontract_ex_async(request, headers, runtime)

    def create_consumecard_billingcontract_ex(
        self,
        request: baasdt_models.CreateConsumecardBillingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约
        Summary: 数字商品-消费卡服务-商家用户签约
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardBillingcontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billingcontract.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumecard_billingcontract_ex_async(
        self,
        request: baasdt_models.CreateConsumecardBillingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约
        Summary: 数字商品-消费卡服务-商家用户签约
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConsumecardBillingcontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billingcontract.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_consumecard_billingcontract(
        self,
        request: baasdt_models.RemoveConsumecardBillingcontractRequest,
    ) -> baasdt_models.RemoveConsumecardBillingcontractResponse:
        """
        Description: 收单协议解约
        Summary: 数字商品-消费卡服务-商家协议解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_consumecard_billingcontract_ex(request, headers, runtime)

    async def remove_consumecard_billingcontract_async(
        self,
        request: baasdt_models.RemoveConsumecardBillingcontractRequest,
    ) -> baasdt_models.RemoveConsumecardBillingcontractResponse:
        """
        Description: 收单协议解约
        Summary: 数字商品-消费卡服务-商家协议解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_consumecard_billingcontract_ex_async(request, headers, runtime)

    def remove_consumecard_billingcontract_ex(
        self,
        request: baasdt_models.RemoveConsumecardBillingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardBillingcontractResponse:
        """
        Description: 收单协议解约
        Summary: 数字商品-消费卡服务-商家协议解约
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardBillingcontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billingcontract.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_consumecard_billingcontract_ex_async(
        self,
        request: baasdt_models.RemoveConsumecardBillingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardBillingcontractResponse:
        """
        Description: 收单协议解约
        Summary: 数字商品-消费卡服务-商家协议解约
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardBillingcontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billingcontract.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_billingcontract(
        self,
        request: baasdt_models.QueryConsumecardBillingcontractRequest,
    ) -> baasdt_models.QueryConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约查询
        Summary: 数字商品-消费卡服务-商家协议查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_billingcontract_ex(request, headers, runtime)

    async def query_consumecard_billingcontract_async(
        self,
        request: baasdt_models.QueryConsumecardBillingcontractRequest,
    ) -> baasdt_models.QueryConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约查询
        Summary: 数字商品-消费卡服务-商家协议查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_billingcontract_ex_async(request, headers, runtime)

    def query_consumecard_billingcontract_ex(
        self,
        request: baasdt_models.QueryConsumecardBillingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约查询
        Summary: 数字商品-消费卡服务-商家协议查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardBillingcontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.billingcontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_billingcontract_ex_async(
        self,
        request: baasdt_models.QueryConsumecardBillingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardBillingcontractResponse:
        """
        Description: 收单协议签约查询
        Summary: 数字商品-消费卡服务-商家协议查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardBillingcontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.billingcontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_consumecard_commissionparty(
        self,
        request: baasdt_models.AddConsumecardCommissionpartyRequest,
    ) -> baasdt_models.AddConsumecardCommissionpartyResponse:
        """
        Description: 增加一级分账方
        Summary: 数字商品服务-消费卡服务-增加一级分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_consumecard_commissionparty_ex(request, headers, runtime)

    async def add_consumecard_commissionparty_async(
        self,
        request: baasdt_models.AddConsumecardCommissionpartyRequest,
    ) -> baasdt_models.AddConsumecardCommissionpartyResponse:
        """
        Description: 增加一级分账方
        Summary: 数字商品服务-消费卡服务-增加一级分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_consumecard_commissionparty_ex_async(request, headers, runtime)

    def add_consumecard_commissionparty_ex(
        self,
        request: baasdt_models.AddConsumecardCommissionpartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddConsumecardCommissionpartyResponse:
        """
        Description: 增加一级分账方
        Summary: 数字商品服务-消费卡服务-增加一级分账方
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddConsumecardCommissionpartyResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commissionparty.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_consumecard_commissionparty_ex_async(
        self,
        request: baasdt_models.AddConsumecardCommissionpartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddConsumecardCommissionpartyResponse:
        """
        Description: 增加一级分账方
        Summary: 数字商品服务-消费卡服务-增加一级分账方
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddConsumecardCommissionpartyResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commissionparty.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_consumecard_commissionparty(
        self,
        request: baasdt_models.RemoveConsumecardCommissionpartyRequest,
    ) -> baasdt_models.RemoveConsumecardCommissionpartyResponse:
        """
        Description: 删除一级分账方
        Summary: 数字商品服务-消费卡服务-删除一级分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_consumecard_commissionparty_ex(request, headers, runtime)

    async def remove_consumecard_commissionparty_async(
        self,
        request: baasdt_models.RemoveConsumecardCommissionpartyRequest,
    ) -> baasdt_models.RemoveConsumecardCommissionpartyResponse:
        """
        Description: 删除一级分账方
        Summary: 数字商品服务-消费卡服务-删除一级分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_consumecard_commissionparty_ex_async(request, headers, runtime)

    def remove_consumecard_commissionparty_ex(
        self,
        request: baasdt_models.RemoveConsumecardCommissionpartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardCommissionpartyResponse:
        """
        Description: 删除一级分账方
        Summary: 数字商品服务-消费卡服务-删除一级分账方
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardCommissionpartyResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commissionparty.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_consumecard_commissionparty_ex_async(
        self,
        request: baasdt_models.RemoveConsumecardCommissionpartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardCommissionpartyResponse:
        """
        Description: 删除一级分账方
        Summary: 数字商品服务-消费卡服务-删除一级分账方
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardCommissionpartyResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commissionparty.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_consumecard_commissionperiod(
        self,
        request: baasdt_models.AddConsumecardCommissionperiodRequest,
    ) -> baasdt_models.AddConsumecardCommissionperiodResponse:
        """
        Description: 增加手续费周期
        Summary: 数字商品服务-消费卡服务-增加手续费周期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_consumecard_commissionperiod_ex(request, headers, runtime)

    async def add_consumecard_commissionperiod_async(
        self,
        request: baasdt_models.AddConsumecardCommissionperiodRequest,
    ) -> baasdt_models.AddConsumecardCommissionperiodResponse:
        """
        Description: 增加手续费周期
        Summary: 数字商品服务-消费卡服务-增加手续费周期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_consumecard_commissionperiod_ex_async(request, headers, runtime)

    def add_consumecard_commissionperiod_ex(
        self,
        request: baasdt_models.AddConsumecardCommissionperiodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddConsumecardCommissionperiodResponse:
        """
        Description: 增加手续费周期
        Summary: 数字商品服务-消费卡服务-增加手续费周期
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddConsumecardCommissionperiodResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commissionperiod.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_consumecard_commissionperiod_ex_async(
        self,
        request: baasdt_models.AddConsumecardCommissionperiodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddConsumecardCommissionperiodResponse:
        """
        Description: 增加手续费周期
        Summary: 数字商品服务-消费卡服务-增加手续费周期
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddConsumecardCommissionperiodResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commissionperiod.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_consumecard_commissionperiod(
        self,
        request: baasdt_models.RemoveConsumecardCommissionperiodRequest,
    ) -> baasdt_models.RemoveConsumecardCommissionperiodResponse:
        """
        Description: 删除手续费周期
        Summary: 数字商品服务-消费卡服务-删除手续费周期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_consumecard_commissionperiod_ex(request, headers, runtime)

    async def remove_consumecard_commissionperiod_async(
        self,
        request: baasdt_models.RemoveConsumecardCommissionperiodRequest,
    ) -> baasdt_models.RemoveConsumecardCommissionperiodResponse:
        """
        Description: 删除手续费周期
        Summary: 数字商品服务-消费卡服务-删除手续费周期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_consumecard_commissionperiod_ex_async(request, headers, runtime)

    def remove_consumecard_commissionperiod_ex(
        self,
        request: baasdt_models.RemoveConsumecardCommissionperiodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardCommissionperiodResponse:
        """
        Description: 删除手续费周期
        Summary: 数字商品服务-消费卡服务-删除手续费周期
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardCommissionperiodResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.commissionperiod.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_consumecard_commissionperiod_ex_async(
        self,
        request: baasdt_models.RemoveConsumecardCommissionperiodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardCommissionperiodResponse:
        """
        Description: 删除手续费周期
        Summary: 数字商品服务-消费卡服务-删除手续费周期
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardCommissionperiodResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.commissionperiod.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_counter(
        self,
        request: baasdt_models.QueryConsumecardCounterRequest,
    ) -> baasdt_models.QueryConsumecardCounterResponse:
        """
        Description: 查询统计信息
        Summary: 数字商品服务-消费卡服务-查询统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_counter_ex(request, headers, runtime)

    async def query_consumecard_counter_async(
        self,
        request: baasdt_models.QueryConsumecardCounterRequest,
    ) -> baasdt_models.QueryConsumecardCounterResponse:
        """
        Description: 查询统计信息
        Summary: 数字商品服务-消费卡服务-查询统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_counter_ex_async(request, headers, runtime)

    def query_consumecard_counter_ex(
        self,
        request: baasdt_models.QueryConsumecardCounterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardCounterResponse:
        """
        Description: 查询统计信息
        Summary: 数字商品服务-消费卡服务-查询统计信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardCounterResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.counter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_counter_ex_async(
        self,
        request: baasdt_models.QueryConsumecardCounterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardCounterResponse:
        """
        Description: 查询统计信息
        Summary: 数字商品服务-消费卡服务-查询统计信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardCounterResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.counter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumecard_productcode(
        self,
        request: baasdt_models.SetConsumecardProductcodeRequest,
    ) -> baasdt_models.SetConsumecardProductcodeResponse:
        """
        Description: 管理接口：配置场景码权限信息
        Summary: 数字商品服务-消费卡服务-场景码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumecard_productcode_ex(request, headers, runtime)

    async def set_consumecard_productcode_async(
        self,
        request: baasdt_models.SetConsumecardProductcodeRequest,
    ) -> baasdt_models.SetConsumecardProductcodeResponse:
        """
        Description: 管理接口：配置场景码权限信息
        Summary: 数字商品服务-消费卡服务-场景码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumecard_productcode_ex_async(request, headers, runtime)

    def set_consumecard_productcode_ex(
        self,
        request: baasdt_models.SetConsumecardProductcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardProductcodeResponse:
        """
        Description: 管理接口：配置场景码权限信息
        Summary: 数字商品服务-消费卡服务-场景码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardProductcodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.productcode.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumecard_productcode_ex_async(
        self,
        request: baasdt_models.SetConsumecardProductcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetConsumecardProductcodeResponse:
        """
        Description: 管理接口：配置场景码权限信息
        Summary: 数字商品服务-消费卡服务-场景码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetConsumecardProductcodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.productcode.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_productcode(
        self,
        request: baasdt_models.QueryConsumecardProductcodeRequest,
    ) -> baasdt_models.QueryConsumecardProductcodeResponse:
        """
        Description: 查询已配置的场景码信息
        Summary: 数字商品服务-消费卡服务-查询场景码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_productcode_ex(request, headers, runtime)

    async def query_consumecard_productcode_async(
        self,
        request: baasdt_models.QueryConsumecardProductcodeRequest,
    ) -> baasdt_models.QueryConsumecardProductcodeResponse:
        """
        Description: 查询已配置的场景码信息
        Summary: 数字商品服务-消费卡服务-查询场景码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_productcode_ex_async(request, headers, runtime)

    def query_consumecard_productcode_ex(
        self,
        request: baasdt_models.QueryConsumecardProductcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardProductcodeResponse:
        """
        Description: 查询已配置的场景码信息
        Summary: 数字商品服务-消费卡服务-查询场景码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardProductcodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.productcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_productcode_ex_async(
        self,
        request: baasdt_models.QueryConsumecardProductcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardProductcodeResponse:
        """
        Description: 查询已配置的场景码信息
        Summary: 数字商品服务-消费卡服务-查询场景码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardProductcodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.productcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_consumecard_productcode(
        self,
        request: baasdt_models.RemoveConsumecardProductcodeRequest,
    ) -> baasdt_models.RemoveConsumecardProductcodeResponse:
        """
        Description: 删除场景码配置
        Summary: 数字商品服务-消费卡服务-删除场景码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_consumecard_productcode_ex(request, headers, runtime)

    async def remove_consumecard_productcode_async(
        self,
        request: baasdt_models.RemoveConsumecardProductcodeRequest,
    ) -> baasdt_models.RemoveConsumecardProductcodeResponse:
        """
        Description: 删除场景码配置
        Summary: 数字商品服务-消费卡服务-删除场景码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_consumecard_productcode_ex_async(request, headers, runtime)

    def remove_consumecard_productcode_ex(
        self,
        request: baasdt_models.RemoveConsumecardProductcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardProductcodeResponse:
        """
        Description: 删除场景码配置
        Summary: 数字商品服务-消费卡服务-删除场景码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardProductcodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.productcode.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_consumecard_productcode_ex_async(
        self,
        request: baasdt_models.RemoveConsumecardProductcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveConsumecardProductcodeResponse:
        """
        Description: 删除场景码配置
        Summary: 数字商品服务-消费卡服务-删除场景码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveConsumecardProductcodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.productcode.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_consumecard_goodsimage(
        self,
        request: baasdt_models.QueryConsumecardGoodsimageRequest,
    ) -> baasdt_models.QueryConsumecardGoodsimageResponse:
        """
        Description: 根据图片不可访问URl 获取可以访问的临时URL
        Summary: 数字商品服务-消费卡服务-查询图片URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_consumecard_goodsimage_ex(request, headers, runtime)

    async def query_consumecard_goodsimage_async(
        self,
        request: baasdt_models.QueryConsumecardGoodsimageRequest,
    ) -> baasdt_models.QueryConsumecardGoodsimageResponse:
        """
        Description: 根据图片不可访问URl 获取可以访问的临时URL
        Summary: 数字商品服务-消费卡服务-查询图片URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_consumecard_goodsimage_ex_async(request, headers, runtime)

    def query_consumecard_goodsimage_ex(
        self,
        request: baasdt_models.QueryConsumecardGoodsimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodsimageResponse:
        """
        Description: 根据图片不可访问URl 获取可以访问的临时URL
        Summary: 数字商品服务-消费卡服务-查询图片URL
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodsimageResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.goodsimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_consumecard_goodsimage_ex_async(
        self,
        request: baasdt_models.QueryConsumecardGoodsimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConsumecardGoodsimageResponse:
        """
        Description: 根据图片不可访问URl 获取可以访问的临时URL
        Summary: 数字商品服务-消费卡服务-查询图片URL
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConsumecardGoodsimageResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.goodsimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_consumecard_file(
        self,
        request: baasdt_models.UploadConsumecardFileRequest,
    ) -> baasdt_models.UploadConsumecardFileResponse:
        """
        Description: 文件API，上传文件
        Summary: 数字商品服务-文件服务-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_consumecard_file_ex(request, headers, runtime)

    async def upload_consumecard_file_async(
        self,
        request: baasdt_models.UploadConsumecardFileRequest,
    ) -> baasdt_models.UploadConsumecardFileResponse:
        """
        Description: 文件API，上传文件
        Summary: 数字商品服务-文件服务-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_consumecard_file_ex_async(request, headers, runtime)

    def upload_consumecard_file_ex(
        self,
        request: baasdt_models.UploadConsumecardFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadConsumecardFileResponse:
        """
        Description: 文件API，上传文件
        Summary: 数字商品服务-文件服务-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = baasdt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='baas.antdao.consumecard.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_consumecard_file_response = baasdt_models.UploadConsumecardFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_consumecard_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return baasdt_models.UploadConsumecardFileResponse().from_map(
            self.do_request('1.0', 'baas.antdao.consumecard.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_consumecard_file_ex_async(
        self,
        request: baasdt_models.UploadConsumecardFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadConsumecardFileResponse:
        """
        Description: 文件API，上传文件
        Summary: 数字商品服务-文件服务-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = baasdt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='baas.antdao.consumecard.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_consumecard_file_response = baasdt_models.UploadConsumecardFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_consumecard_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return baasdt_models.UploadConsumecardFileResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.consumecard.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_coupon(
        self,
        request: baasdt_models.QueryCouponRequest,
    ) -> baasdt_models.QueryCouponResponse:
        """
        Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-查询电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_coupon_ex(request, headers, runtime)

    async def query_coupon_async(
        self,
        request: baasdt_models.QueryCouponRequest,
    ) -> baasdt_models.QueryCouponResponse:
        """
        Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-查询电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_coupon_ex_async(request, headers, runtime)

    def query_coupon_ex(
        self,
        request: baasdt_models.QueryCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCouponResponse:
        """
        Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-查询电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCouponResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_coupon_ex_async(
        self,
        request: baasdt_models.QueryCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCouponResponse:
        """
        Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-查询电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCouponResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_coupon(
        self,
        request: baasdt_models.CreateCouponRequest,
    ) -> baasdt_models.CreateCouponResponse:
        """
        Description: 创建单个电子券接口
        Summary: 数字商品服务-电子券服务-创建单个电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_coupon_ex(request, headers, runtime)

    async def create_coupon_async(
        self,
        request: baasdt_models.CreateCouponRequest,
    ) -> baasdt_models.CreateCouponResponse:
        """
        Description: 创建单个电子券接口
        Summary: 数字商品服务-电子券服务-创建单个电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_coupon_ex_async(request, headers, runtime)

    def create_coupon_ex(
        self,
        request: baasdt_models.CreateCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateCouponResponse:
        """
        Description: 创建单个电子券接口
        Summary: 数字商品服务-电子券服务-创建单个电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateCouponResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_coupon_ex_async(
        self,
        request: baasdt_models.CreateCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateCouponResponse:
        """
        Description: 创建单个电子券接口
        Summary: 数字商品服务-电子券服务-创建单个电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateCouponResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_forbidden(
        self,
        request: baasdt_models.ExecCouponForbiddenRequest,
    ) -> baasdt_models.ExecCouponForbiddenResponse:
        """
        Description: 将电子券更新为禁用状态，不能再进行其他状态更新
        Summary: 数字商品服务-电子券服务-电子券风控禁用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_forbidden_ex(request, headers, runtime)

    async def exec_coupon_forbidden_async(
        self,
        request: baasdt_models.ExecCouponForbiddenRequest,
    ) -> baasdt_models.ExecCouponForbiddenResponse:
        """
        Description: 将电子券更新为禁用状态，不能再进行其他状态更新
        Summary: 数字商品服务-电子券服务-电子券风控禁用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_forbidden_ex_async(request, headers, runtime)

    def exec_coupon_forbidden_ex(
        self,
        request: baasdt_models.ExecCouponForbiddenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponForbiddenResponse:
        """
        Description: 将电子券更新为禁用状态，不能再进行其他状态更新
        Summary: 数字商品服务-电子券服务-电子券风控禁用
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponForbiddenResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.forbidden.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_forbidden_ex_async(
        self,
        request: baasdt_models.ExecCouponForbiddenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponForbiddenResponse:
        """
        Description: 将电子券更新为禁用状态，不能再进行其他状态更新
        Summary: 数字商品服务-电子券服务-电子券风控禁用
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponForbiddenResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.forbidden.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_enable(
        self,
        request: baasdt_models.ExecCouponEnableRequest,
    ) -> baasdt_models.ExecCouponEnableResponse:
        """
        Description: 将电子券更新为可用状态
        Summary: 数字商品服务-电子券服务-电子券风控启用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_enable_ex(request, headers, runtime)

    async def exec_coupon_enable_async(
        self,
        request: baasdt_models.ExecCouponEnableRequest,
    ) -> baasdt_models.ExecCouponEnableResponse:
        """
        Description: 将电子券更新为可用状态
        Summary: 数字商品服务-电子券服务-电子券风控启用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_enable_ex_async(request, headers, runtime)

    def exec_coupon_enable_ex(
        self,
        request: baasdt_models.ExecCouponEnableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponEnableResponse:
        """
        Description: 将电子券更新为可用状态
        Summary: 数字商品服务-电子券服务-电子券风控启用
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponEnableResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.enable.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_enable_ex_async(
        self,
        request: baasdt_models.ExecCouponEnableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponEnableResponse:
        """
        Description: 将电子券更新为可用状态
        Summary: 数字商品服务-电子券服务-电子券风控启用
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponEnableResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.enable.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_expire(
        self,
        request: baasdt_models.ExecCouponExpireRequest,
    ) -> baasdt_models.ExecCouponExpireResponse:
        """
        Description: 将电子券状态更新为过期
        Summary: 数字商品服务-电子券服务-电子券过期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_expire_ex(request, headers, runtime)

    async def exec_coupon_expire_async(
        self,
        request: baasdt_models.ExecCouponExpireRequest,
    ) -> baasdt_models.ExecCouponExpireResponse:
        """
        Description: 将电子券状态更新为过期
        Summary: 数字商品服务-电子券服务-电子券过期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_expire_ex_async(request, headers, runtime)

    def exec_coupon_expire_ex(
        self,
        request: baasdt_models.ExecCouponExpireRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponExpireResponse:
        """
        Description: 将电子券状态更新为过期
        Summary: 数字商品服务-电子券服务-电子券过期
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponExpireResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.expire.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_expire_ex_async(
        self,
        request: baasdt_models.ExecCouponExpireRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponExpireResponse:
        """
        Description: 将电子券状态更新为过期
        Summary: 数字商品服务-电子券服务-电子券过期
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponExpireResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.expire.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_writeoff(
        self,
        request: baasdt_models.ExecCouponWriteoffRequest,
    ) -> baasdt_models.ExecCouponWriteoffResponse:
        """
        Description: 将电子券状态更新为核销
        Summary: 数字商品服务-电子券服务-电子券核销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_writeoff_ex(request, headers, runtime)

    async def exec_coupon_writeoff_async(
        self,
        request: baasdt_models.ExecCouponWriteoffRequest,
    ) -> baasdt_models.ExecCouponWriteoffResponse:
        """
        Description: 将电子券状态更新为核销
        Summary: 数字商品服务-电子券服务-电子券核销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_writeoff_ex_async(request, headers, runtime)

    def exec_coupon_writeoff_ex(
        self,
        request: baasdt_models.ExecCouponWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponWriteoffResponse:
        """
        Description: 将电子券状态更新为核销
        Summary: 数字商品服务-电子券服务-电子券核销
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponWriteoffResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_writeoff_ex_async(
        self,
        request: baasdt_models.ExecCouponWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponWriteoffResponse:
        """
        Description: 将电子券状态更新为核销
        Summary: 数字商品服务-电子券服务-电子券核销
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponWriteoffResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_timeout(
        self,
        request: baasdt_models.ExecCouponTimeoutRequest,
    ) -> baasdt_models.ExecCouponTimeoutResponse:
        """
        Description: 更新电子券的激活码状态为已超时
        Summary: 数字商品服务-电子券服务-券激活码超时
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_timeout_ex(request, headers, runtime)

    async def exec_coupon_timeout_async(
        self,
        request: baasdt_models.ExecCouponTimeoutRequest,
    ) -> baasdt_models.ExecCouponTimeoutResponse:
        """
        Description: 更新电子券的激活码状态为已超时
        Summary: 数字商品服务-电子券服务-券激活码超时
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_timeout_ex_async(request, headers, runtime)

    def exec_coupon_timeout_ex(
        self,
        request: baasdt_models.ExecCouponTimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponTimeoutResponse:
        """
        Description: 更新电子券的激活码状态为已超时
        Summary: 数字商品服务-电子券服务-券激活码超时
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponTimeoutResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.timeout.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_timeout_ex_async(
        self,
        request: baasdt_models.ExecCouponTimeoutRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponTimeoutResponse:
        """
        Description: 更新电子券的激活码状态为已超时
        Summary: 数字商品服务-电子券服务-券激活码超时
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponTimeoutResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.timeout.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_activate(
        self,
        request: baasdt_models.ExecCouponActivateRequest,
    ) -> baasdt_models.ExecCouponActivateResponse:
        """
        Description: 商户上传激活码，激活电子券
        Summary: 数字商品服务-电子券服务-激活电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_activate_ex(request, headers, runtime)

    async def exec_coupon_activate_async(
        self,
        request: baasdt_models.ExecCouponActivateRequest,
    ) -> baasdt_models.ExecCouponActivateResponse:
        """
        Description: 商户上传激活码，激活电子券
        Summary: 数字商品服务-电子券服务-激活电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_activate_ex_async(request, headers, runtime)

    def exec_coupon_activate_ex(
        self,
        request: baasdt_models.ExecCouponActivateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponActivateResponse:
        """
        Description: 商户上传激活码，激活电子券
        Summary: 数字商品服务-电子券服务-激活电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponActivateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.activate.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_activate_ex_async(
        self,
        request: baasdt_models.ExecCouponActivateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponActivateResponse:
        """
        Description: 商户上传激活码，激活电子券
        Summary: 数字商品服务-电子券服务-激活电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponActivateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.activate.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_transfer(
        self,
        request: baasdt_models.ExecCouponTransferRequest,
    ) -> baasdt_models.ExecCouponTransferResponse:
        """
        Description: 将电子券转让给其他用户
        Summary: 数字商品服务-电子券服务-电子券转让
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_transfer_ex(request, headers, runtime)

    async def exec_coupon_transfer_async(
        self,
        request: baasdt_models.ExecCouponTransferRequest,
    ) -> baasdt_models.ExecCouponTransferResponse:
        """
        Description: 将电子券转让给其他用户
        Summary: 数字商品服务-电子券服务-电子券转让
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_transfer_ex_async(request, headers, runtime)

    def exec_coupon_transfer_ex(
        self,
        request: baasdt_models.ExecCouponTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponTransferResponse:
        """
        Description: 将电子券转让给其他用户
        Summary: 数字商品服务-电子券服务-电子券转让
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponTransferResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_transfer_ex_async(
        self,
        request: baasdt_models.ExecCouponTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponTransferResponse:
        """
        Description: 将电子券转让给其他用户
        Summary: 数字商品服务-电子券服务-电子券转让
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponTransferResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_sign(
        self,
        request: baasdt_models.ExecCouponSignRequest,
    ) -> baasdt_models.ExecCouponSignResponse:
        """
        Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
        Summary: 数字商品服务-电子券服务-电子券记名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_sign_ex(request, headers, runtime)

    async def exec_coupon_sign_async(
        self,
        request: baasdt_models.ExecCouponSignRequest,
    ) -> baasdt_models.ExecCouponSignResponse:
        """
        Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
        Summary: 数字商品服务-电子券服务-电子券记名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_sign_ex_async(request, headers, runtime)

    def exec_coupon_sign_ex(
        self,
        request: baasdt_models.ExecCouponSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponSignResponse:
        """
        Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
        Summary: 数字商品服务-电子券服务-电子券记名
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponSignResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.sign.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_sign_ex_async(
        self,
        request: baasdt_models.ExecCouponSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponSignResponse:
        """
        Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
        Summary: 数字商品服务-电子券服务-电子券记名
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponSignResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.sign.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_coupon_bind(
        self,
        request: baasdt_models.ExecCouponBindRequest,
    ) -> baasdt_models.ExecCouponBindResponse:
        """
        Description: 绑定电子券，更新为“绑定”状态
        Summary: 数字商品服务-电子券服务-绑定电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_coupon_bind_ex(request, headers, runtime)

    async def exec_coupon_bind_async(
        self,
        request: baasdt_models.ExecCouponBindRequest,
    ) -> baasdt_models.ExecCouponBindResponse:
        """
        Description: 绑定电子券，更新为“绑定”状态
        Summary: 数字商品服务-电子券服务-绑定电子券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_coupon_bind_ex_async(request, headers, runtime)

    def exec_coupon_bind_ex(
        self,
        request: baasdt_models.ExecCouponBindRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponBindResponse:
        """
        Description: 绑定电子券，更新为“绑定”状态
        Summary: 数字商品服务-电子券服务-绑定电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponBindResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.bind.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_coupon_bind_ex_async(
        self,
        request: baasdt_models.ExecCouponBindRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecCouponBindResponse:
        """
        Description: 绑定电子券，更新为“绑定”状态
        Summary: 数字商品服务-电子券服务-绑定电子券
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecCouponBindResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.bind.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_coupon(
        self,
        request: baasdt_models.BatchcreateCouponRequest,
    ) -> baasdt_models.BatchcreateCouponResponse:
        """
        Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
        Summary: 数字商品服务-电子券服务-电子券批量创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_coupon_ex(request, headers, runtime)

    async def batchcreate_coupon_async(
        self,
        request: baasdt_models.BatchcreateCouponRequest,
    ) -> baasdt_models.BatchcreateCouponResponse:
        """
        Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
        Summary: 数字商品服务-电子券服务-电子券批量创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_coupon_ex_async(request, headers, runtime)

    def batchcreate_coupon_ex(
        self,
        request: baasdt_models.BatchcreateCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchcreateCouponResponse:
        """
        Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
        Summary: 数字商品服务-电子券服务-电子券批量创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchcreateCouponResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_coupon_ex_async(
        self,
        request: baasdt_models.BatchcreateCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchcreateCouponResponse:
        """
        Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
        Summary: 数字商品服务-电子券服务-电子券批量创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchcreateCouponResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_coupon_list(
        self,
        request: baasdt_models.CreateCouponListRequest,
    ) -> baasdt_models.CreateCouponListResponse:
        """
        Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
        Summary: 数字商品服务-电子券服务-电子券列表创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_coupon_list_ex(request, headers, runtime)

    async def create_coupon_list_async(
        self,
        request: baasdt_models.CreateCouponListRequest,
    ) -> baasdt_models.CreateCouponListResponse:
        """
        Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
        Summary: 数字商品服务-电子券服务-电子券列表创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_coupon_list_ex_async(request, headers, runtime)

    def create_coupon_list_ex(
        self,
        request: baasdt_models.CreateCouponListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateCouponListResponse:
        """
        Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
        Summary: 数字商品服务-电子券服务-电子券列表创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateCouponListResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.list.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_coupon_list_ex_async(
        self,
        request: baasdt_models.CreateCouponListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateCouponListResponse:
        """
        Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
        Summary: 数字商品服务-电子券服务-电子券列表创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateCouponListResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.list.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_coupon_collection(
        self,
        request: baasdt_models.CreateCouponCollectionRequest,
    ) -> baasdt_models.CreateCouponCollectionResponse:
        """
        Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
        Summary: 数字商品服务-电子券服务-创建电子券批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_coupon_collection_ex(request, headers, runtime)

    async def create_coupon_collection_async(
        self,
        request: baasdt_models.CreateCouponCollectionRequest,
    ) -> baasdt_models.CreateCouponCollectionResponse:
        """
        Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
        Summary: 数字商品服务-电子券服务-创建电子券批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_coupon_collection_ex_async(request, headers, runtime)

    def create_coupon_collection_ex(
        self,
        request: baasdt_models.CreateCouponCollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateCouponCollectionResponse:
        """
        Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
        Summary: 数字商品服务-电子券服务-创建电子券批次
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateCouponCollectionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.collection.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_coupon_collection_ex_async(
        self,
        request: baasdt_models.CreateCouponCollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateCouponCollectionResponse:
        """
        Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
        Summary: 数字商品服务-电子券服务-创建电子券批次
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateCouponCollectionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.collection.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_coupon_collection(
        self,
        request: baasdt_models.QueryCouponCollectionRequest,
    ) -> baasdt_models.QueryCouponCollectionResponse:
        """
        Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-电子券批次查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_coupon_collection_ex(request, headers, runtime)

    async def query_coupon_collection_async(
        self,
        request: baasdt_models.QueryCouponCollectionRequest,
    ) -> baasdt_models.QueryCouponCollectionResponse:
        """
        Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-电子券批次查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_coupon_collection_ex_async(request, headers, runtime)

    def query_coupon_collection_ex(
        self,
        request: baasdt_models.QueryCouponCollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCouponCollectionResponse:
        """
        Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-电子券批次查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCouponCollectionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.coupon.collection.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_coupon_collection_ex_async(
        self,
        request: baasdt_models.QueryCouponCollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCouponCollectionResponse:
        """
        Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
        Summary: 数字商品服务-电子券服务-电子券批次查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCouponCollectionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.coupon.collection.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_user(
        self,
        request: baasdt_models.QueryMerchantUserRequest,
    ) -> baasdt_models.QueryMerchantUserResponse:
        """
        Description: 查询调用商户下的用户信息
        Summary: 数字商品服务-商户管理-查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_user_ex(request, headers, runtime)

    async def query_merchant_user_async(
        self,
        request: baasdt_models.QueryMerchantUserRequest,
    ) -> baasdt_models.QueryMerchantUserResponse:
        """
        Description: 查询调用商户下的用户信息
        Summary: 数字商品服务-商户管理-查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_user_ex_async(request, headers, runtime)

    def query_merchant_user_ex(
        self,
        request: baasdt_models.QueryMerchantUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantUserResponse:
        """
        Description: 查询调用商户下的用户信息
        Summary: 数字商品服务-商户管理-查询用户信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantUserResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_user_ex_async(
        self,
        request: baasdt_models.QueryMerchantUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantUserResponse:
        """
        Description: 查询调用商户下的用户信息
        Summary: 数字商品服务-商户管理-查询用户信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantUserResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_merchant_user(
        self,
        request: baasdt_models.CreateMerchantUserRequest,
    ) -> baasdt_models.CreateMerchantUserResponse:
        """
        Description: 创建商户管理下的用户
        Summary: 数字商品服务-商户管理-商户创建用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_merchant_user_ex(request, headers, runtime)

    async def create_merchant_user_async(
        self,
        request: baasdt_models.CreateMerchantUserRequest,
    ) -> baasdt_models.CreateMerchantUserResponse:
        """
        Description: 创建商户管理下的用户
        Summary: 数字商品服务-商户管理-商户创建用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_merchant_user_ex_async(request, headers, runtime)

    def create_merchant_user_ex(
        self,
        request: baasdt_models.CreateMerchantUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateMerchantUserResponse:
        """
        Description: 创建商户管理下的用户
        Summary: 数字商品服务-商户管理-商户创建用户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateMerchantUserResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_merchant_user_ex_async(
        self,
        request: baasdt_models.CreateMerchantUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateMerchantUserResponse:
        """
        Description: 创建商户管理下的用户
        Summary: 数字商品服务-商户管理-商户创建用户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateMerchantUserResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant(
        self,
        request: baasdt_models.QueryMerchantRequest,
    ) -> baasdt_models.QueryMerchantResponse:
        """
        Description: 查询管理员创建的商户信息（可查询自身的商户信息）
        Summary: 数字商品服务-商户管理-查询商户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_ex(request, headers, runtime)

    async def query_merchant_async(
        self,
        request: baasdt_models.QueryMerchantRequest,
    ) -> baasdt_models.QueryMerchantResponse:
        """
        Description: 查询管理员创建的商户信息（可查询自身的商户信息）
        Summary: 数字商品服务-商户管理-查询商户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_ex_async(request, headers, runtime)

    def query_merchant_ex(
        self,
        request: baasdt_models.QueryMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantResponse:
        """
        Description: 查询管理员创建的商户信息（可查询自身的商户信息）
        Summary: 数字商品服务-商户管理-查询商户信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_ex_async(
        self,
        request: baasdt_models.QueryMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantResponse:
        """
        Description: 查询管理员创建的商户信息（可查询自身的商户信息）
        Summary: 数字商品服务-商户管理-查询商户信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_image(
        self,
        request: baasdt_models.UploadImageRequest,
    ) -> baasdt_models.UploadImageResponse:
        """
        Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
        Summary: 数字商品服务-OSS服务-上传图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_image_ex(request, headers, runtime)

    async def upload_image_async(
        self,
        request: baasdt_models.UploadImageRequest,
    ) -> baasdt_models.UploadImageResponse:
        """
        Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
        Summary: 数字商品服务-OSS服务-上传图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_image_ex_async(request, headers, runtime)

    def upload_image_ex(
        self,
        request: baasdt_models.UploadImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadImageResponse:
        """
        Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
        Summary: 数字商品服务-OSS服务-上传图片
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadImageResponse().from_map(
            self.do_request('1.0', 'baas.antdao.image.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_image_ex_async(
        self,
        request: baasdt_models.UploadImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadImageResponse:
        """
        Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
        Summary: 数字商品服务-OSS服务-上传图片
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadImageResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.image.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_pki_publickey(
        self,
        request: baasdt_models.GetPkiPublickeyRequest,
    ) -> baasdt_models.GetPkiPublickeyResponse:
        """
        Description: 获取kms中对应用户的公钥
        Summary: 数字商品服务-密钥管理-获取用户公钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_pki_publickey_ex(request, headers, runtime)

    async def get_pki_publickey_async(
        self,
        request: baasdt_models.GetPkiPublickeyRequest,
    ) -> baasdt_models.GetPkiPublickeyResponse:
        """
        Description: 获取kms中对应用户的公钥
        Summary: 数字商品服务-密钥管理-获取用户公钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_pki_publickey_ex_async(request, headers, runtime)

    def get_pki_publickey_ex(
        self,
        request: baasdt_models.GetPkiPublickeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.GetPkiPublickeyResponse:
        """
        Description: 获取kms中对应用户的公钥
        Summary: 数字商品服务-密钥管理-获取用户公钥
        """
        UtilClient.validate_model(request)
        return baasdt_models.GetPkiPublickeyResponse().from_map(
            self.do_request('1.0', 'baas.antdao.pki.publickey.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_pki_publickey_ex_async(
        self,
        request: baasdt_models.GetPkiPublickeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.GetPkiPublickeyResponse:
        """
        Description: 获取kms中对应用户的公钥
        Summary: 数字商品服务-密钥管理-获取用户公钥
        """
        UtilClient.validate_model(request)
        return baasdt_models.GetPkiPublickeyResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.pki.publickey.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_pki_encrypt(
        self,
        request: baasdt_models.ExecPkiEncryptRequest,
    ) -> baasdt_models.ExecPkiEncryptResponse:
        """
        Description: ECC公钥加密接口
        Summary: 数字商品服务-密钥管理-公钥加密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_pki_encrypt_ex(request, headers, runtime)

    async def exec_pki_encrypt_async(
        self,
        request: baasdt_models.ExecPkiEncryptRequest,
    ) -> baasdt_models.ExecPkiEncryptResponse:
        """
        Description: ECC公钥加密接口
        Summary: 数字商品服务-密钥管理-公钥加密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_pki_encrypt_ex_async(request, headers, runtime)

    def exec_pki_encrypt_ex(
        self,
        request: baasdt_models.ExecPkiEncryptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecPkiEncryptResponse:
        """
        Description: ECC公钥加密接口
        Summary: 数字商品服务-密钥管理-公钥加密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecPkiEncryptResponse().from_map(
            self.do_request('1.0', 'baas.antdao.pki.encrypt.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_pki_encrypt_ex_async(
        self,
        request: baasdt_models.ExecPkiEncryptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecPkiEncryptResponse:
        """
        Description: ECC公钥加密接口
        Summary: 数字商品服务-密钥管理-公钥加密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecPkiEncryptResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.pki.encrypt.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_pki_decrypt(
        self,
        request: baasdt_models.ExecPkiDecryptRequest,
    ) -> baasdt_models.ExecPkiDecryptResponse:
        """
        Description: ECC解密算法接口
        Summary: 数字商品服务-密钥管理-私钥解密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_pki_decrypt_ex(request, headers, runtime)

    async def exec_pki_decrypt_async(
        self,
        request: baasdt_models.ExecPkiDecryptRequest,
    ) -> baasdt_models.ExecPkiDecryptResponse:
        """
        Description: ECC解密算法接口
        Summary: 数字商品服务-密钥管理-私钥解密
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_pki_decrypt_ex_async(request, headers, runtime)

    def exec_pki_decrypt_ex(
        self,
        request: baasdt_models.ExecPkiDecryptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecPkiDecryptResponse:
        """
        Description: ECC解密算法接口
        Summary: 数字商品服务-密钥管理-私钥解密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecPkiDecryptResponse().from_map(
            self.do_request('1.0', 'baas.antdao.pki.decrypt.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_pki_decrypt_ex_async(
        self,
        request: baasdt_models.ExecPkiDecryptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecPkiDecryptResponse:
        """
        Description: ECC解密算法接口
        Summary: 数字商品服务-密钥管理-私钥解密
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecPkiDecryptResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.pki.decrypt.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_merchant_friend(
        self,
        request: baasdt_models.UpdateMerchantFriendRequest,
    ) -> baasdt_models.UpdateMerchantFriendResponse:
        """
        Description: 更新商户的友商信息
        Summary: 数字商品服务-商户管理-更新商户友商
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_merchant_friend_ex(request, headers, runtime)

    async def update_merchant_friend_async(
        self,
        request: baasdt_models.UpdateMerchantFriendRequest,
    ) -> baasdt_models.UpdateMerchantFriendResponse:
        """
        Description: 更新商户的友商信息
        Summary: 数字商品服务-商户管理-更新商户友商
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_merchant_friend_ex_async(request, headers, runtime)

    def update_merchant_friend_ex(
        self,
        request: baasdt_models.UpdateMerchantFriendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateMerchantFriendResponse:
        """
        Description: 更新商户的友商信息
        Summary: 数字商品服务-商户管理-更新商户友商
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateMerchantFriendResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.friend.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_merchant_friend_ex_async(
        self,
        request: baasdt_models.UpdateMerchantFriendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateMerchantFriendResponse:
        """
        Description: 更新商户的友商信息
        Summary: 数字商品服务-商户管理-更新商户友商
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateMerchantFriendResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.friend.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_equity(
        self,
        request: baasdt_models.CreateEquityRequest,
    ) -> baasdt_models.CreateEquityResponse:
        """
        Description: 商品供应商户发布一个商品
        Summary: 数字商品服务-商品服务-创建商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_equity_ex(request, headers, runtime)

    async def create_equity_async(
        self,
        request: baasdt_models.CreateEquityRequest,
    ) -> baasdt_models.CreateEquityResponse:
        """
        Description: 商品供应商户发布一个商品
        Summary: 数字商品服务-商品服务-创建商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_equity_ex_async(request, headers, runtime)

    def create_equity_ex(
        self,
        request: baasdt_models.CreateEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateEquityResponse:
        """
        Description: 商品供应商户发布一个商品
        Summary: 数字商品服务-商品服务-创建商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateEquityResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_equity_ex_async(
        self,
        request: baasdt_models.CreateEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateEquityResponse:
        """
        Description: 商品供应商户发布一个商品
        Summary: 数字商品服务-商品服务-创建商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateEquityResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_equity(
        self,
        request: baasdt_models.OfflineEquityRequest,
    ) -> baasdt_models.OfflineEquityResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
        Summary: 数字商品服务-商品服务-下线商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_equity_ex(request, headers, runtime)

    async def offline_equity_async(
        self,
        request: baasdt_models.OfflineEquityRequest,
    ) -> baasdt_models.OfflineEquityResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
        Summary: 数字商品服务-商品服务-下线商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_equity_ex_async(request, headers, runtime)

    def offline_equity_ex(
        self,
        request: baasdt_models.OfflineEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OfflineEquityResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
        Summary: 数字商品服务-商品服务-下线商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.OfflineEquityResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_equity_ex_async(
        self,
        request: baasdt_models.OfflineEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OfflineEquityResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
        Summary: 数字商品服务-商品服务-下线商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.OfflineEquityResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def freeze_equity(
        self,
        request: baasdt_models.FreezeEquityRequest,
    ) -> baasdt_models.FreezeEquityResponse:
        """
        Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
        Summary: 数字商品服务-商品服务-冻结商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.freeze_equity_ex(request, headers, runtime)

    async def freeze_equity_async(
        self,
        request: baasdt_models.FreezeEquityRequest,
    ) -> baasdt_models.FreezeEquityResponse:
        """
        Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
        Summary: 数字商品服务-商品服务-冻结商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.freeze_equity_ex_async(request, headers, runtime)

    def freeze_equity_ex(
        self,
        request: baasdt_models.FreezeEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.FreezeEquityResponse:
        """
        Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
        Summary: 数字商品服务-商品服务-冻结商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.FreezeEquityResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def freeze_equity_ex_async(
        self,
        request: baasdt_models.FreezeEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.FreezeEquityResponse:
        """
        Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
        Summary: 数字商品服务-商品服务-冻结商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.FreezeEquityResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_equity_merchant(
        self,
        request: baasdt_models.OpenEquityMerchantRequest,
    ) -> baasdt_models.OpenEquityMerchantResponse:
        """
        Description: 授权兑换—非公开商品商户配置
        Summary: 数字商品服务-商品服务-授权兑换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_equity_merchant_ex(request, headers, runtime)

    async def open_equity_merchant_async(
        self,
        request: baasdt_models.OpenEquityMerchantRequest,
    ) -> baasdt_models.OpenEquityMerchantResponse:
        """
        Description: 授权兑换—非公开商品商户配置
        Summary: 数字商品服务-商品服务-授权兑换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_equity_merchant_ex_async(request, headers, runtime)

    def open_equity_merchant_ex(
        self,
        request: baasdt_models.OpenEquityMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OpenEquityMerchantResponse:
        """
        Description: 授权兑换—非公开商品商户配置
        Summary: 数字商品服务-商品服务-授权兑换
        """
        UtilClient.validate_model(request)
        return baasdt_models.OpenEquityMerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.merchant.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_equity_merchant_ex_async(
        self,
        request: baasdt_models.OpenEquityMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OpenEquityMerchantResponse:
        """
        Description: 授权兑换—非公开商品商户配置
        Summary: 数字商品服务-商品服务-授权兑换
        """
        UtilClient.validate_model(request)
        return baasdt_models.OpenEquityMerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.merchant.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_equity_merchantuserprice(
        self,
        request: baasdt_models.AuthEquityMerchantuserpriceRequest,
    ) -> baasdt_models.AuthEquityMerchantuserpriceResponse:
        """
        Description: 用户兑换价格设置
        Summary: 数字商品服务-商品服务-用户兑换价格设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_equity_merchantuserprice_ex(request, headers, runtime)

    async def auth_equity_merchantuserprice_async(
        self,
        request: baasdt_models.AuthEquityMerchantuserpriceRequest,
    ) -> baasdt_models.AuthEquityMerchantuserpriceResponse:
        """
        Description: 用户兑换价格设置
        Summary: 数字商品服务-商品服务-用户兑换价格设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_equity_merchantuserprice_ex_async(request, headers, runtime)

    def auth_equity_merchantuserprice_ex(
        self,
        request: baasdt_models.AuthEquityMerchantuserpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AuthEquityMerchantuserpriceResponse:
        """
        Description: 用户兑换价格设置
        Summary: 数字商品服务-商品服务-用户兑换价格设置
        """
        UtilClient.validate_model(request)
        return baasdt_models.AuthEquityMerchantuserpriceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.merchantuserprice.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_equity_merchantuserprice_ex_async(
        self,
        request: baasdt_models.AuthEquityMerchantuserpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AuthEquityMerchantuserpriceResponse:
        """
        Description: 用户兑换价格设置
        Summary: 数字商品服务-商品服务-用户兑换价格设置
        """
        UtilClient.validate_model(request)
        return baasdt_models.AuthEquityMerchantuserpriceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.merchantuserprice.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_equity_defaultprice(
        self,
        request: baasdt_models.UpdateEquityDefaultpriceRequest,
    ) -> baasdt_models.UpdateEquityDefaultpriceResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品价格
        Summary: 数字商品服务-商品服务-更新商品价格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_equity_defaultprice_ex(request, headers, runtime)

    async def update_equity_defaultprice_async(
        self,
        request: baasdt_models.UpdateEquityDefaultpriceRequest,
    ) -> baasdt_models.UpdateEquityDefaultpriceResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品价格
        Summary: 数字商品服务-商品服务-更新商品价格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_equity_defaultprice_ex_async(request, headers, runtime)

    def update_equity_defaultprice_ex(
        self,
        request: baasdt_models.UpdateEquityDefaultpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityDefaultpriceResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品价格
        Summary: 数字商品服务-商品服务-更新商品价格
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityDefaultpriceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.defaultprice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_equity_defaultprice_ex_async(
        self,
        request: baasdt_models.UpdateEquityDefaultpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityDefaultpriceResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品价格
        Summary: 数字商品服务-商品服务-更新商品价格
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityDefaultpriceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.defaultprice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_equity_tenantprice(
        self,
        request: baasdt_models.UpdateEquityTenantpriceRequest,
    ) -> baasdt_models.UpdateEquityTenantpriceResponse:
        """
        Description: 更新商品自定义定价
        Summary: 数字商品服务-商品服务-更新自定义定价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_equity_tenantprice_ex(request, headers, runtime)

    async def update_equity_tenantprice_async(
        self,
        request: baasdt_models.UpdateEquityTenantpriceRequest,
    ) -> baasdt_models.UpdateEquityTenantpriceResponse:
        """
        Description: 更新商品自定义定价
        Summary: 数字商品服务-商品服务-更新自定义定价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_equity_tenantprice_ex_async(request, headers, runtime)

    def update_equity_tenantprice_ex(
        self,
        request: baasdt_models.UpdateEquityTenantpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityTenantpriceResponse:
        """
        Description: 更新商品自定义定价
        Summary: 数字商品服务-商品服务-更新自定义定价
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityTenantpriceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.tenantprice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_equity_tenantprice_ex_async(
        self,
        request: baasdt_models.UpdateEquityTenantpriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityTenantpriceResponse:
        """
        Description: 更新商品自定义定价
        Summary: 数字商品服务-商品服务-更新自定义定价
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityTenantpriceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.tenantprice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_equity_count(
        self,
        request: baasdt_models.AddEquityCountRequest,
    ) -> baasdt_models.AddEquityCountResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
        Summary: 数字商品服务-商品服务-增加权益库存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_equity_count_ex(request, headers, runtime)

    async def add_equity_count_async(
        self,
        request: baasdt_models.AddEquityCountRequest,
    ) -> baasdt_models.AddEquityCountResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
        Summary: 数字商品服务-商品服务-增加权益库存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_equity_count_ex_async(request, headers, runtime)

    def add_equity_count_ex(
        self,
        request: baasdt_models.AddEquityCountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddEquityCountResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
        Summary: 数字商品服务-商品服务-增加权益库存
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddEquityCountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.count.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_equity_count_ex_async(
        self,
        request: baasdt_models.AddEquityCountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddEquityCountResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
        Summary: 数字商品服务-商品服务-增加权益库存
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddEquityCountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.count.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_equity_exchangelimit(
        self,
        request: baasdt_models.UpdateEquityExchangelimitRequest,
    ) -> baasdt_models.UpdateEquityExchangelimitResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
        Summary: 数字商品服务-商品服务-更新兑换限制规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_equity_exchangelimit_ex(request, headers, runtime)

    async def update_equity_exchangelimit_async(
        self,
        request: baasdt_models.UpdateEquityExchangelimitRequest,
    ) -> baasdt_models.UpdateEquityExchangelimitResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
        Summary: 数字商品服务-商品服务-更新兑换限制规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_equity_exchangelimit_ex_async(request, headers, runtime)

    def update_equity_exchangelimit_ex(
        self,
        request: baasdt_models.UpdateEquityExchangelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityExchangelimitResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
        Summary: 数字商品服务-商品服务-更新兑换限制规则
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityExchangelimitResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.exchangelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_equity_exchangelimit_ex_async(
        self,
        request: baasdt_models.UpdateEquityExchangelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityExchangelimitResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
        Summary: 数字商品服务-商品服务-更新兑换限制规则
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityExchangelimitResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.exchangelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_equity_validtime(
        self,
        request: baasdt_models.UpdateEquityValidtimeRequest,
    ) -> baasdt_models.UpdateEquityValidtimeResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
        Summary: 数字商品服务-商品服务-更新有效期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_equity_validtime_ex(request, headers, runtime)

    async def update_equity_validtime_async(
        self,
        request: baasdt_models.UpdateEquityValidtimeRequest,
    ) -> baasdt_models.UpdateEquityValidtimeResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
        Summary: 数字商品服务-商品服务-更新有效期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_equity_validtime_ex_async(request, headers, runtime)

    def update_equity_validtime_ex(
        self,
        request: baasdt_models.UpdateEquityValidtimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityValidtimeResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
        Summary: 数字商品服务-商品服务-更新有效期
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityValidtimeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.validtime.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_equity_validtime_ex_async(
        self,
        request: baasdt_models.UpdateEquityValidtimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityValidtimeResponse:
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
        Summary: 数字商品服务-商品服务-更新有效期
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityValidtimeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.validtime.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_equity(
        self,
        request: baasdt_models.QueryEquityRequest,
    ) -> baasdt_models.QueryEquityResponse:
        """
        Description: 查询商品信息
        Summary: 数字商品服务-商品服务-查询商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_equity_ex(request, headers, runtime)

    async def query_equity_async(
        self,
        request: baasdt_models.QueryEquityRequest,
    ) -> baasdt_models.QueryEquityResponse:
        """
        Description: 查询商品信息
        Summary: 数字商品服务-商品服务-查询商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_equity_ex_async(request, headers, runtime)

    def query_equity_ex(
        self,
        request: baasdt_models.QueryEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryEquityResponse:
        """
        Description: 查询商品信息
        Summary: 数字商品服务-商品服务-查询商品信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryEquityResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_equity_ex_async(
        self,
        request: baasdt_models.QueryEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryEquityResponse:
        """
        Description: 查询商品信息
        Summary: 数字商品服务-商品服务-查询商品信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryEquityResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_exchange_byuser(
        self,
        request: baasdt_models.ExecExchangeByuserRequest,
    ) -> baasdt_models.ExecExchangeByuserResponse:
        """
        Description: 用户身份发起兑换
        Summary: 数字商品服务-兑换服务-用户身份发起兑换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_exchange_byuser_ex(request, headers, runtime)

    async def exec_exchange_byuser_async(
        self,
        request: baasdt_models.ExecExchangeByuserRequest,
    ) -> baasdt_models.ExecExchangeByuserResponse:
        """
        Description: 用户身份发起兑换
        Summary: 数字商品服务-兑换服务-用户身份发起兑换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_exchange_byuser_ex_async(request, headers, runtime)

    def exec_exchange_byuser_ex(
        self,
        request: baasdt_models.ExecExchangeByuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeByuserResponse:
        """
        Description: 用户身份发起兑换
        Summary: 数字商品服务-兑换服务-用户身份发起兑换
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeByuserResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.byuser.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_exchange_byuser_ex_async(
        self,
        request: baasdt_models.ExecExchangeByuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeByuserResponse:
        """
        Description: 用户身份发起兑换
        Summary: 数字商品服务-兑换服务-用户身份发起兑换
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeByuserResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.byuser.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_exchange_bymerchant(
        self,
        request: baasdt_models.ExecExchangeBymerchantRequest,
    ) -> baasdt_models.ExecExchangeBymerchantResponse:
        """
        Description: 商户身份发起兑换
        Summary: 数字商品服务-兑换服务-商户身份发起兑换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_exchange_bymerchant_ex(request, headers, runtime)

    async def exec_exchange_bymerchant_async(
        self,
        request: baasdt_models.ExecExchangeBymerchantRequest,
    ) -> baasdt_models.ExecExchangeBymerchantResponse:
        """
        Description: 商户身份发起兑换
        Summary: 数字商品服务-兑换服务-商户身份发起兑换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_exchange_bymerchant_ex_async(request, headers, runtime)

    def exec_exchange_bymerchant_ex(
        self,
        request: baasdt_models.ExecExchangeBymerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeBymerchantResponse:
        """
        Description: 商户身份发起兑换
        Summary: 数字商品服务-兑换服务-商户身份发起兑换
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeBymerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.bymerchant.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_exchange_bymerchant_ex_async(
        self,
        request: baasdt_models.ExecExchangeBymerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeBymerchantResponse:
        """
        Description: 商户身份发起兑换
        Summary: 数字商品服务-兑换服务-商户身份发起兑换
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeBymerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.bymerchant.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_exchange(
        self,
        request: baasdt_models.ConfirmExchangeRequest,
    ) -> baasdt_models.ConfirmExchangeResponse:
        """
        Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
        Summary: 数字商品服务-兑换服务-确认接单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_exchange_ex(request, headers, runtime)

    async def confirm_exchange_async(
        self,
        request: baasdt_models.ConfirmExchangeRequest,
    ) -> baasdt_models.ConfirmExchangeResponse:
        """
        Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
        Summary: 数字商品服务-兑换服务-确认接单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_exchange_ex_async(request, headers, runtime)

    def confirm_exchange_ex(
        self,
        request: baasdt_models.ConfirmExchangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmExchangeResponse:
        """
        Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
        Summary: 数字商品服务-兑换服务-确认接单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmExchangeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_exchange_ex_async(
        self,
        request: baasdt_models.ConfirmExchangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmExchangeResponse:
        """
        Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
        Summary: 数字商品服务-兑换服务-确认接单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmExchangeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_exchange_outofstore(
        self,
        request: baasdt_models.ExecExchangeOutofstoreRequest,
    ) -> baasdt_models.ExecExchangeOutofstoreResponse:
        """
        Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
        Summary: 数字商品服务-兑换服务-拒绝发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_exchange_outofstore_ex(request, headers, runtime)

    async def exec_exchange_outofstore_async(
        self,
        request: baasdt_models.ExecExchangeOutofstoreRequest,
    ) -> baasdt_models.ExecExchangeOutofstoreResponse:
        """
        Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
        Summary: 数字商品服务-兑换服务-拒绝发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_exchange_outofstore_ex_async(request, headers, runtime)

    def exec_exchange_outofstore_ex(
        self,
        request: baasdt_models.ExecExchangeOutofstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeOutofstoreResponse:
        """
        Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
        Summary: 数字商品服务-兑换服务-拒绝发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeOutofstoreResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.outofstore.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_exchange_outofstore_ex_async(
        self,
        request: baasdt_models.ExecExchangeOutofstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeOutofstoreResponse:
        """
        Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
        Summary: 数字商品服务-兑换服务-拒绝发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeOutofstoreResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.outofstore.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_exchange(
        self,
        request: baasdt_models.SendExchangeRequest,
    ) -> baasdt_models.SendExchangeResponse:
        """
        Description: 兑换发货
        Summary: 数字商品服务-兑换服务-兑换发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_exchange_ex(request, headers, runtime)

    async def send_exchange_async(
        self,
        request: baasdt_models.SendExchangeRequest,
    ) -> baasdt_models.SendExchangeResponse:
        """
        Description: 兑换发货
        Summary: 数字商品服务-兑换服务-兑换发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_exchange_ex_async(request, headers, runtime)

    def send_exchange_ex(
        self,
        request: baasdt_models.SendExchangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SendExchangeResponse:
        """
        Description: 兑换发货
        Summary: 数字商品服务-兑换服务-兑换发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.SendExchangeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_exchange_ex_async(
        self,
        request: baasdt_models.SendExchangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SendExchangeResponse:
        """
        Description: 兑换发货
        Summary: 数字商品服务-兑换服务-兑换发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.SendExchangeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_exchange_receivebyuser(
        self,
        request: baasdt_models.ExecExchangeReceivebyuserRequest,
    ) -> baasdt_models.ExecExchangeReceivebyuserResponse:
        """
        Description: 用户身份确认收货
        Summary: 数字商品服务-兑换服务-用户身份确认收货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_exchange_receivebyuser_ex(request, headers, runtime)

    async def exec_exchange_receivebyuser_async(
        self,
        request: baasdt_models.ExecExchangeReceivebyuserRequest,
    ) -> baasdt_models.ExecExchangeReceivebyuserResponse:
        """
        Description: 用户身份确认收货
        Summary: 数字商品服务-兑换服务-用户身份确认收货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_exchange_receivebyuser_ex_async(request, headers, runtime)

    def exec_exchange_receivebyuser_ex(
        self,
        request: baasdt_models.ExecExchangeReceivebyuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeReceivebyuserResponse:
        """
        Description: 用户身份确认收货
        Summary: 数字商品服务-兑换服务-用户身份确认收货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeReceivebyuserResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.receivebyuser.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_exchange_receivebyuser_ex_async(
        self,
        request: baasdt_models.ExecExchangeReceivebyuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeReceivebyuserResponse:
        """
        Description: 用户身份确认收货
        Summary: 数字商品服务-兑换服务-用户身份确认收货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeReceivebyuserResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.receivebyuser.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_expire(
        self,
        request: baasdt_models.ExecAssetExpireRequest,
    ) -> baasdt_models.ExecAssetExpireResponse:
        """
        Description: 资产过期
        Summary: 数字商品服务-资产服务-资产过期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_expire_ex(request, headers, runtime)

    async def exec_asset_expire_async(
        self,
        request: baasdt_models.ExecAssetExpireRequest,
    ) -> baasdt_models.ExecAssetExpireResponse:
        """
        Description: 资产过期
        Summary: 数字商品服务-资产服务-资产过期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_expire_ex_async(request, headers, runtime)

    def exec_asset_expire_ex(
        self,
        request: baasdt_models.ExecAssetExpireRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetExpireResponse:
        """
        Description: 资产过期
        Summary: 数字商品服务-资产服务-资产过期
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetExpireResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.expire.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_expire_ex_async(
        self,
        request: baasdt_models.ExecAssetExpireRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetExpireResponse:
        """
        Description: 资产过期
        Summary: 数字商品服务-资产服务-资产过期
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetExpireResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.expire.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_asset_instruction(
        self,
        request: baasdt_models.QueryAssetInstructionRequest,
    ) -> baasdt_models.QueryAssetInstructionResponse:
        """
        Description: 检索资产流转流水
        Summary: 数字商品服务-资产服务-查询资产流转流水
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_asset_instruction_ex(request, headers, runtime)

    async def query_asset_instruction_async(
        self,
        request: baasdt_models.QueryAssetInstructionRequest,
    ) -> baasdt_models.QueryAssetInstructionResponse:
        """
        Description: 检索资产流转流水
        Summary: 数字商品服务-资产服务-查询资产流转流水
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_asset_instruction_ex_async(request, headers, runtime)

    def query_asset_instruction_ex(
        self,
        request: baasdt_models.QueryAssetInstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryAssetInstructionResponse:
        """
        Description: 检索资产流转流水
        Summary: 数字商品服务-资产服务-查询资产流转流水
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryAssetInstructionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.instruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_asset_instruction_ex_async(
        self,
        request: baasdt_models.QueryAssetInstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryAssetInstructionResponse:
        """
        Description: 检索资产流转流水
        Summary: 数字商品服务-资产服务-查询资产流转流水
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryAssetInstructionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.instruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_exchange_instruction(
        self,
        request: baasdt_models.QueryExchangeInstructionRequest,
    ) -> baasdt_models.QueryExchangeInstructionResponse:
        """
        Description: 该接口废弃不用！！！
        查询商品兑换流水
        Summary: 数字商品服务-兑换服务-查询商品兑换流水
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_exchange_instruction_ex(request, headers, runtime)

    async def query_exchange_instruction_async(
        self,
        request: baasdt_models.QueryExchangeInstructionRequest,
    ) -> baasdt_models.QueryExchangeInstructionResponse:
        """
        Description: 该接口废弃不用！！！
        查询商品兑换流水
        Summary: 数字商品服务-兑换服务-查询商品兑换流水
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_exchange_instruction_ex_async(request, headers, runtime)

    def query_exchange_instruction_ex(
        self,
        request: baasdt_models.QueryExchangeInstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryExchangeInstructionResponse:
        """
        Description: 该接口废弃不用！！！
        查询商品兑换流水
        Summary: 数字商品服务-兑换服务-查询商品兑换流水
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryExchangeInstructionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.instruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_exchange_instruction_ex_async(
        self,
        request: baasdt_models.QueryExchangeInstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryExchangeInstructionResponse:
        """
        Description: 该接口废弃不用！！！
        查询商品兑换流水
        Summary: 数字商品服务-兑换服务-查询商品兑换流水
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryExchangeInstructionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.instruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_issue(
        self,
        request: baasdt_models.ExecAssetIssueRequest,
    ) -> baasdt_models.ExecAssetIssueResponse:
        """
        Description: 资产初始化发行
        Summary: 数字商品服务-资产服务-资产初始化发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_issue_ex(request, headers, runtime)

    async def exec_asset_issue_async(
        self,
        request: baasdt_models.ExecAssetIssueRequest,
    ) -> baasdt_models.ExecAssetIssueResponse:
        """
        Description: 资产初始化发行
        Summary: 数字商品服务-资产服务-资产初始化发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_issue_ex_async(request, headers, runtime)

    def exec_asset_issue_ex(
        self,
        request: baasdt_models.ExecAssetIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetIssueResponse:
        """
        Description: 资产初始化发行
        Summary: 数字商品服务-资产服务-资产初始化发行
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetIssueResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.issue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_issue_ex_async(
        self,
        request: baasdt_models.ExecAssetIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetIssueResponse:
        """
        Description: 资产初始化发行
        Summary: 数字商品服务-资产服务-资产初始化发行
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetIssueResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.issue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_redeem(
        self,
        request: baasdt_models.ExecAssetRedeemRequest,
    ) -> baasdt_models.ExecAssetRedeemResponse:
        """
        Description: 赎回资产
        Summary: 数字商品服务-资产服务-赎回资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_redeem_ex(request, headers, runtime)

    async def exec_asset_redeem_async(
        self,
        request: baasdt_models.ExecAssetRedeemRequest,
    ) -> baasdt_models.ExecAssetRedeemResponse:
        """
        Description: 赎回资产
        Summary: 数字商品服务-资产服务-赎回资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_redeem_ex_async(request, headers, runtime)

    def exec_asset_redeem_ex(
        self,
        request: baasdt_models.ExecAssetRedeemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetRedeemResponse:
        """
        Description: 赎回资产
        Summary: 数字商品服务-资产服务-赎回资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetRedeemResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.redeem.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_redeem_ex_async(
        self,
        request: baasdt_models.ExecAssetRedeemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetRedeemResponse:
        """
        Description: 赎回资产
        Summary: 数字商品服务-资产服务-赎回资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetRedeemResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.redeem.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_grant(
        self,
        request: baasdt_models.ExecAssetGrantRequest,
    ) -> baasdt_models.ExecAssetGrantResponse:
        """
        Description: 发放资产
        Summary: 数字商品服务-资产服务-发放资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_grant_ex(request, headers, runtime)

    async def exec_asset_grant_async(
        self,
        request: baasdt_models.ExecAssetGrantRequest,
    ) -> baasdt_models.ExecAssetGrantResponse:
        """
        Description: 发放资产
        Summary: 数字商品服务-资产服务-发放资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_grant_ex_async(request, headers, runtime)

    def exec_asset_grant_ex(
        self,
        request: baasdt_models.ExecAssetGrantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetGrantResponse:
        """
        Description: 发放资产
        Summary: 数字商品服务-资产服务-发放资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetGrantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.grant.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_grant_ex_async(
        self,
        request: baasdt_models.ExecAssetGrantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetGrantResponse:
        """
        Description: 发放资产
        Summary: 数字商品服务-资产服务-发放资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetGrantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.grant.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_grantrefund(
        self,
        request: baasdt_models.ExecAssetGrantrefundRequest,
    ) -> baasdt_models.ExecAssetGrantrefundResponse:
        """
        Description: 发放回退资产
        Summary: 数字商品服务-资产服务-发放回退资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_grantrefund_ex(request, headers, runtime)

    async def exec_asset_grantrefund_async(
        self,
        request: baasdt_models.ExecAssetGrantrefundRequest,
    ) -> baasdt_models.ExecAssetGrantrefundResponse:
        """
        Description: 发放回退资产
        Summary: 数字商品服务-资产服务-发放回退资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_grantrefund_ex_async(request, headers, runtime)

    def exec_asset_grantrefund_ex(
        self,
        request: baasdt_models.ExecAssetGrantrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetGrantrefundResponse:
        """
        Description: 发放回退资产
        Summary: 数字商品服务-资产服务-发放回退资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetGrantrefundResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.grantrefund.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_grantrefund_ex_async(
        self,
        request: baasdt_models.ExecAssetGrantrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetGrantrefundResponse:
        """
        Description: 发放回退资产
        Summary: 数字商品服务-资产服务-发放回退资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetGrantrefundResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.grantrefund.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_adjust(
        self,
        request: baasdt_models.ExecAssetAdjustRequest,
    ) -> baasdt_models.ExecAssetAdjustResponse:
        """
        Description: 风控调整资产
        Summary: 数字商品服务-资产服务-风控调整资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_adjust_ex(request, headers, runtime)

    async def exec_asset_adjust_async(
        self,
        request: baasdt_models.ExecAssetAdjustRequest,
    ) -> baasdt_models.ExecAssetAdjustResponse:
        """
        Description: 风控调整资产
        Summary: 数字商品服务-资产服务-风控调整资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_adjust_ex_async(request, headers, runtime)

    def exec_asset_adjust_ex(
        self,
        request: baasdt_models.ExecAssetAdjustRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetAdjustResponse:
        """
        Description: 风控调整资产
        Summary: 数字商品服务-资产服务-风控调整资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetAdjustResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.adjust.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_adjust_ex_async(
        self,
        request: baasdt_models.ExecAssetAdjustRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetAdjustResponse:
        """
        Description: 风控调整资产
        Summary: 数字商品服务-资产服务-风控调整资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetAdjustResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.adjust.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_asset(
        self,
        request: baasdt_models.QueryAssetRequest,
    ) -> baasdt_models.QueryAssetResponse:
        """
        Description: 资产查询
        Summary: 数字商品服务-资产服务-资产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_asset_ex(request, headers, runtime)

    async def query_asset_async(
        self,
        request: baasdt_models.QueryAssetRequest,
    ) -> baasdt_models.QueryAssetResponse:
        """
        Description: 资产查询
        Summary: 数字商品服务-资产服务-资产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_asset_ex_async(request, headers, runtime)

    def query_asset_ex(
        self,
        request: baasdt_models.QueryAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryAssetResponse:
        """
        Description: 资产查询
        Summary: 数字商品服务-资产服务-资产查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryAssetResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_asset_ex_async(
        self,
        request: baasdt_models.QueryAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryAssetResponse:
        """
        Description: 资产查询
        Summary: 数字商品服务-资产服务-资产查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryAssetResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_exchange_receivebymerchant(
        self,
        request: baasdt_models.ExecExchangeReceivebymerchantRequest,
    ) -> baasdt_models.ExecExchangeReceivebymerchantResponse:
        """
        Description: 商户身份确认收货
        Summary: 数字商品服务-兑换服务-商户身份确认收货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_exchange_receivebymerchant_ex(request, headers, runtime)

    async def exec_exchange_receivebymerchant_async(
        self,
        request: baasdt_models.ExecExchangeReceivebymerchantRequest,
    ) -> baasdt_models.ExecExchangeReceivebymerchantResponse:
        """
        Description: 商户身份确认收货
        Summary: 数字商品服务-兑换服务-商户身份确认收货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_exchange_receivebymerchant_ex_async(request, headers, runtime)

    def exec_exchange_receivebymerchant_ex(
        self,
        request: baasdt_models.ExecExchangeReceivebymerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeReceivebymerchantResponse:
        """
        Description: 商户身份确认收货
        Summary: 数字商品服务-兑换服务-商户身份确认收货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeReceivebymerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.receivebymerchant.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_exchange_receivebymerchant_ex_async(
        self,
        request: baasdt_models.ExecExchangeReceivebymerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeReceivebymerchantResponse:
        """
        Description: 商户身份确认收货
        Summary: 数字商品服务-兑换服务-商户身份确认收货
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeReceivebymerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.receivebymerchant.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_block(
        self,
        request: baasdt_models.QueryBlockRequest,
    ) -> baasdt_models.QueryBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_block_ex(request, headers, runtime)

    async def query_block_async(
        self,
        request: baasdt_models.QueryBlockRequest,
    ) -> baasdt_models.QueryBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_block_ex_async(request, headers, runtime)

    def query_block_ex(
        self,
        request: baasdt_models.QueryBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockResponse().from_map(
            self.do_request('1.0', 'baas.antdao.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_block_ex_async(
        self,
        request: baasdt_models.QueryBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_block_lastblocknumber(
        self,
        request: baasdt_models.QueryBlockLastblocknumberRequest,
    ) -> baasdt_models.QueryBlockLastblocknumberResponse:
        """
        Description: 获取区块链最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_block_lastblocknumber_ex(request, headers, runtime)

    async def query_block_lastblocknumber_async(
        self,
        request: baasdt_models.QueryBlockLastblocknumberRequest,
    ) -> baasdt_models.QueryBlockLastblocknumberResponse:
        """
        Description: 获取区块链最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_block_lastblocknumber_ex_async(request, headers, runtime)

    def query_block_lastblocknumber_ex(
        self,
        request: baasdt_models.QueryBlockLastblocknumberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockLastblocknumberResponse:
        """
        Description: 获取区块链最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockLastblocknumberResponse().from_map(
            self.do_request('1.0', 'baas.antdao.block.lastblocknumber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_block_lastblocknumber_ex_async(
        self,
        request: baasdt_models.QueryBlockLastblocknumberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockLastblocknumberResponse:
        """
        Description: 获取区块链最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockLastblocknumberResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.block.lastblocknumber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_equity(
        self,
        request: baasdt_models.UpdateEquityRequest,
    ) -> baasdt_models.UpdateEquityResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-商品服务-更新商品属性信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_equity_ex(request, headers, runtime)

    async def update_equity_async(
        self,
        request: baasdt_models.UpdateEquityRequest,
    ) -> baasdt_models.UpdateEquityResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-商品服务-更新商品属性信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_equity_ex_async(request, headers, runtime)

    def update_equity_ex(
        self,
        request: baasdt_models.UpdateEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-商品服务-更新商品属性信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_equity_ex_async(
        self,
        request: baasdt_models.UpdateEquityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityResponse:
        """
        Description: 更新商品信息
        Summary: 数字商品服务-商品服务-更新商品属性信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_equity_createresult(
        self,
        request: baasdt_models.QueryEquityCreateresultRequest,
    ) -> baasdt_models.QueryEquityCreateresultResponse:
        """
        Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
        Summary: 数字商品服务-商品服务-发布商品结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_equity_createresult_ex(request, headers, runtime)

    async def query_equity_createresult_async(
        self,
        request: baasdt_models.QueryEquityCreateresultRequest,
    ) -> baasdt_models.QueryEquityCreateresultResponse:
        """
        Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
        Summary: 数字商品服务-商品服务-发布商品结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_equity_createresult_ex_async(request, headers, runtime)

    def query_equity_createresult_ex(
        self,
        request: baasdt_models.QueryEquityCreateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryEquityCreateresultResponse:
        """
        Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
        Summary: 数字商品服务-商品服务-发布商品结果查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryEquityCreateresultResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.createresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_equity_createresult_ex_async(
        self,
        request: baasdt_models.QueryEquityCreateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryEquityCreateresultResponse:
        """
        Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
        Summary: 数字商品服务-商品服务-发布商品结果查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryEquityCreateresultResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.createresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_equity_instruction(
        self,
        request: baasdt_models.QueryEquityInstructionRequest,
    ) -> baasdt_models.QueryEquityInstructionResponse:
        """
        Description: 根据商品兑换流水交易号查询商品兑换流水详情
        Summary: 数字商品服务-商品服务-查询商品兑换流水
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_equity_instruction_ex(request, headers, runtime)

    async def query_equity_instruction_async(
        self,
        request: baasdt_models.QueryEquityInstructionRequest,
    ) -> baasdt_models.QueryEquityInstructionResponse:
        """
        Description: 根据商品兑换流水交易号查询商品兑换流水详情
        Summary: 数字商品服务-商品服务-查询商品兑换流水
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_equity_instruction_ex_async(request, headers, runtime)

    def query_equity_instruction_ex(
        self,
        request: baasdt_models.QueryEquityInstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryEquityInstructionResponse:
        """
        Description: 根据商品兑换流水交易号查询商品兑换流水详情
        Summary: 数字商品服务-商品服务-查询商品兑换流水
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryEquityInstructionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.instruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_equity_instruction_ex_async(
        self,
        request: baasdt_models.QueryEquityInstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryEquityInstructionResponse:
        """
        Description: 根据商品兑换流水交易号查询商品兑换流水详情
        Summary: 数字商品服务-商品服务-查询商品兑换流水
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryEquityInstructionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.instruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_image(
        self,
        request: baasdt_models.QueryImageRequest,
    ) -> baasdt_models.QueryImageResponse:
        """
        Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
        Summary: 数字商品服务-OSS服务-获取图片URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_image_ex(request, headers, runtime)

    async def query_image_async(
        self,
        request: baasdt_models.QueryImageRequest,
    ) -> baasdt_models.QueryImageResponse:
        """
        Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
        Summary: 数字商品服务-OSS服务-获取图片URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_image_ex_async(request, headers, runtime)

    def query_image_ex(
        self,
        request: baasdt_models.QueryImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryImageResponse:
        """
        Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
        Summary: 数字商品服务-OSS服务-获取图片URL
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryImageResponse().from_map(
            self.do_request('1.0', 'baas.antdao.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_image_ex_async(
        self,
        request: baasdt_models.QueryImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryImageResponse:
        """
        Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
        Summary: 数字商品服务-OSS服务-获取图片URL
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryImageResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_equity_status(
        self,
        request: baasdt_models.UpdateEquityStatusRequest,
    ) -> baasdt_models.UpdateEquityStatusResponse:
        """
        Description: 更新商品状态（可用，冻结，下线）
        Summary: 数字商品服务-商品服务-更新商品状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_equity_status_ex(request, headers, runtime)

    async def update_equity_status_async(
        self,
        request: baasdt_models.UpdateEquityStatusRequest,
    ) -> baasdt_models.UpdateEquityStatusResponse:
        """
        Description: 更新商品状态（可用，冻结，下线）
        Summary: 数字商品服务-商品服务-更新商品状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_equity_status_ex_async(request, headers, runtime)

    def update_equity_status_ex(
        self,
        request: baasdt_models.UpdateEquityStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityStatusResponse:
        """
        Description: 更新商品状态（可用，冻结，下线）
        Summary: 数字商品服务-商品服务-更新商品状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityStatusResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_equity_status_ex_async(
        self,
        request: baasdt_models.UpdateEquityStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateEquityStatusResponse:
        """
        Description: 更新商品状态（可用，冻结，下线）
        Summary: 数字商品服务-商品服务-更新商品状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateEquityStatusResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_merchant_provision(
        self,
        request: baasdt_models.SetMerchantProvisionRequest,
    ) -> baasdt_models.SetMerchantProvisionResponse:
        """
        Description: 设置备付金金额（CAS接口）
        Summary: 数字商品服务-商户管理-设置备付金金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_merchant_provision_ex(request, headers, runtime)

    async def set_merchant_provision_async(
        self,
        request: baasdt_models.SetMerchantProvisionRequest,
    ) -> baasdt_models.SetMerchantProvisionResponse:
        """
        Description: 设置备付金金额（CAS接口）
        Summary: 数字商品服务-商户管理-设置备付金金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_merchant_provision_ex_async(request, headers, runtime)

    def set_merchant_provision_ex(
        self,
        request: baasdt_models.SetMerchantProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetMerchantProvisionResponse:
        """
        Description: 设置备付金金额（CAS接口）
        Summary: 数字商品服务-商户管理-设置备付金金额
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetMerchantProvisionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.provision.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_merchant_provision_ex_async(
        self,
        request: baasdt_models.SetMerchantProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetMerchantProvisionResponse:
        """
        Description: 设置备付金金额（CAS接口）
        Summary: 数字商品服务-商户管理-设置备付金金额
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetMerchantProvisionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.provision.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_merchant_provision(
        self,
        request: baasdt_models.UpdateMerchantProvisionRequest,
    ) -> baasdt_models.UpdateMerchantProvisionResponse:
        """
        Description: 更新商户的备付金金额，由资金管理员操作
        Summary: 数字商品服务-商户管理-更新备付金金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_merchant_provision_ex(request, headers, runtime)

    async def update_merchant_provision_async(
        self,
        request: baasdt_models.UpdateMerchantProvisionRequest,
    ) -> baasdt_models.UpdateMerchantProvisionResponse:
        """
        Description: 更新商户的备付金金额，由资金管理员操作
        Summary: 数字商品服务-商户管理-更新备付金金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_merchant_provision_ex_async(request, headers, runtime)

    def update_merchant_provision_ex(
        self,
        request: baasdt_models.UpdateMerchantProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateMerchantProvisionResponse:
        """
        Description: 更新商户的备付金金额，由资金管理员操作
        Summary: 数字商品服务-商户管理-更新备付金金额
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateMerchantProvisionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.provision.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_merchant_provision_ex_async(
        self,
        request: baasdt_models.UpdateMerchantProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateMerchantProvisionResponse:
        """
        Description: 更新商户的备付金金额，由资金管理员操作
        Summary: 数字商品服务-商户管理-更新备付金金额
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateMerchantProvisionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.provision.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_equity_instructionwriteoff(
        self,
        request: baasdt_models.ExecEquityInstructionwriteoffRequest,
    ) -> baasdt_models.ExecEquityInstructionwriteoffResponse:
        """
        Description: 核销商品兑换交易，由资金管理员操作
        Summary: 数字商品服务-商品服务-核销商品兑换交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_equity_instructionwriteoff_ex(request, headers, runtime)

    async def exec_equity_instructionwriteoff_async(
        self,
        request: baasdt_models.ExecEquityInstructionwriteoffRequest,
    ) -> baasdt_models.ExecEquityInstructionwriteoffResponse:
        """
        Description: 核销商品兑换交易，由资金管理员操作
        Summary: 数字商品服务-商品服务-核销商品兑换交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_equity_instructionwriteoff_ex_async(request, headers, runtime)

    def exec_equity_instructionwriteoff_ex(
        self,
        request: baasdt_models.ExecEquityInstructionwriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecEquityInstructionwriteoffResponse:
        """
        Description: 核销商品兑换交易，由资金管理员操作
        Summary: 数字商品服务-商品服务-核销商品兑换交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecEquityInstructionwriteoffResponse().from_map(
            self.do_request('1.0', 'baas.antdao.equity.instructionwriteoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_equity_instructionwriteoff_ex_async(
        self,
        request: baasdt_models.ExecEquityInstructionwriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecEquityInstructionwriteoffResponse:
        """
        Description: 核销商品兑换交易，由资金管理员操作
        Summary: 数字商品服务-商品服务-核销商品兑换交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecEquityInstructionwriteoffResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.equity.instructionwriteoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_provisions(
        self,
        request: baasdt_models.QueryMerchantProvisionsRequest,
    ) -> baasdt_models.QueryMerchantProvisionsResponse:
        """
        Description: 查询租户的备付金列表
        Summary: 数字商品服务-商户管理-查租户备付金列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_provisions_ex(request, headers, runtime)

    async def query_merchant_provisions_async(
        self,
        request: baasdt_models.QueryMerchantProvisionsRequest,
    ) -> baasdt_models.QueryMerchantProvisionsResponse:
        """
        Description: 查询租户的备付金列表
        Summary: 数字商品服务-商户管理-查租户备付金列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_provisions_ex_async(request, headers, runtime)

    def query_merchant_provisions_ex(
        self,
        request: baasdt_models.QueryMerchantProvisionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantProvisionsResponse:
        """
        Description: 查询租户的备付金列表
        Summary: 数字商品服务-商户管理-查租户备付金列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantProvisionsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.provisions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_provisions_ex_async(
        self,
        request: baasdt_models.QueryMerchantProvisionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantProvisionsResponse:
        """
        Description: 查询租户的备付金列表
        Summary: 数字商品服务-商户管理-查租户备付金列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantProvisionsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.provisions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_exchangeableequitylist(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitylistRequest,
    ) -> baasdt_models.QueryMerchantExchangeableequitylistResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
        Summary: 数字商品服务-商户管理-查询可兑换商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_exchangeableequitylist_ex(request, headers, runtime)

    async def query_merchant_exchangeableequitylist_async(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitylistRequest,
    ) -> baasdt_models.QueryMerchantExchangeableequitylistResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
        Summary: 数字商品服务-商户管理-查询可兑换商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_exchangeableequitylist_ex_async(request, headers, runtime)

    def query_merchant_exchangeableequitylist_ex(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitylistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantExchangeableequitylistResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
        Summary: 数字商品服务-商户管理-查询可兑换商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantExchangeableequitylistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.exchangeableequitylist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_exchangeableequitylist_ex_async(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitylistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantExchangeableequitylistResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
        Summary: 数字商品服务-商户管理-查询可兑换商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantExchangeableequitylistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.exchangeableequitylist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_exchangeableequitydetail(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitydetailRequest,
    ) -> baasdt_models.QueryMerchantExchangeableequitydetailResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
        Summary: 数字商品服务-商户管理-查询可兑商品明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_exchangeableequitydetail_ex(request, headers, runtime)

    async def query_merchant_exchangeableequitydetail_async(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitydetailRequest,
    ) -> baasdt_models.QueryMerchantExchangeableequitydetailResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
        Summary: 数字商品服务-商户管理-查询可兑商品明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_exchangeableequitydetail_ex_async(request, headers, runtime)

    def query_merchant_exchangeableequitydetail_ex(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitydetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantExchangeableequitydetailResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
        Summary: 数字商品服务-商户管理-查询可兑商品明细
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantExchangeableequitydetailResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.exchangeableequitydetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_exchangeableequitydetail_ex_async(
        self,
        request: baasdt_models.QueryMerchantExchangeableequitydetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMerchantExchangeableequitydetailResponse:
        """
        Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
        Summary: 数字商品服务-商户管理-查询可兑商品明细
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMerchantExchangeableequitydetailResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.exchangeableequitydetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_create(
        self,
        request: baasdt_models.ExecAssetCreateRequest,
    ) -> baasdt_models.ExecAssetCreateResponse:
        """
        Description: 创建新资产
        Summary: 数字商品服务-资产服务-创建资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_create_ex(request, headers, runtime)

    async def exec_asset_create_async(
        self,
        request: baasdt_models.ExecAssetCreateRequest,
    ) -> baasdt_models.ExecAssetCreateResponse:
        """
        Description: 创建新资产
        Summary: 数字商品服务-资产服务-创建资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_create_ex_async(request, headers, runtime)

    def exec_asset_create_ex(
        self,
        request: baasdt_models.ExecAssetCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetCreateResponse:
        """
        Description: 创建新资产
        Summary: 数字商品服务-资产服务-创建资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetCreateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.create.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_create_ex_async(
        self,
        request: baasdt_models.ExecAssetCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetCreateResponse:
        """
        Description: 创建新资产
        Summary: 数字商品服务-资产服务-创建资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetCreateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.create.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_asset_generate(
        self,
        request: baasdt_models.ExecAssetGenerateRequest,
    ) -> baasdt_models.ExecAssetGenerateResponse:
        """
        Description: 资产铸币(不扣减备付金)，合约管理员操作
        Summary: 数字商品服务-资产服务-资产铸币
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_asset_generate_ex(request, headers, runtime)

    async def exec_asset_generate_async(
        self,
        request: baasdt_models.ExecAssetGenerateRequest,
    ) -> baasdt_models.ExecAssetGenerateResponse:
        """
        Description: 资产铸币(不扣减备付金)，合约管理员操作
        Summary: 数字商品服务-资产服务-资产铸币
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_asset_generate_ex_async(request, headers, runtime)

    def exec_asset_generate_ex(
        self,
        request: baasdt_models.ExecAssetGenerateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetGenerateResponse:
        """
        Description: 资产铸币(不扣减备付金)，合约管理员操作
        Summary: 数字商品服务-资产服务-资产铸币
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetGenerateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.asset.generate.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_asset_generate_ex_async(
        self,
        request: baasdt_models.ExecAssetGenerateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecAssetGenerateResponse:
        """
        Description: 资产铸币(不扣减备付金)，合约管理员操作
        Summary: 数字商品服务-资产服务-资产铸币
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecAssetGenerateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.asset.generate.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_merchant(
        self,
        request: baasdt_models.CreateMerchantRequest,
    ) -> baasdt_models.CreateMerchantResponse:
        """
        Description: 创建商户（合约管理员权限）
        Summary: 数字商品服务-商户管理-创建商户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_merchant_ex(request, headers, runtime)

    async def create_merchant_async(
        self,
        request: baasdt_models.CreateMerchantRequest,
    ) -> baasdt_models.CreateMerchantResponse:
        """
        Description: 创建商户（合约管理员权限）
        Summary: 数字商品服务-商户管理-创建商户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_merchant_ex_async(request, headers, runtime)

    def create_merchant_ex(
        self,
        request: baasdt_models.CreateMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateMerchantResponse:
        """
        Description: 创建商户（合约管理员权限）
        Summary: 数字商品服务-商户管理-创建商户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateMerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_merchant_ex_async(
        self,
        request: baasdt_models.CreateMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateMerchantResponse:
        """
        Description: 创建商户（合约管理员权限）
        Summary: 数字商品服务-商户管理-创建商户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateMerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_merchant_fundmanager(
        self,
        request: baasdt_models.SetMerchantFundmanagerRequest,
    ) -> baasdt_models.SetMerchantFundmanagerResponse:
        """
        Description: 设置商户的资金管理员，重要权限，谨慎操作！
        Summary: 数字商品服务-商户管理-设置资金管理员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_merchant_fundmanager_ex(request, headers, runtime)

    async def set_merchant_fundmanager_async(
        self,
        request: baasdt_models.SetMerchantFundmanagerRequest,
    ) -> baasdt_models.SetMerchantFundmanagerResponse:
        """
        Description: 设置商户的资金管理员，重要权限，谨慎操作！
        Summary: 数字商品服务-商户管理-设置资金管理员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_merchant_fundmanager_ex_async(request, headers, runtime)

    def set_merchant_fundmanager_ex(
        self,
        request: baasdt_models.SetMerchantFundmanagerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetMerchantFundmanagerResponse:
        """
        Description: 设置商户的资金管理员，重要权限，谨慎操作！
        Summary: 数字商品服务-商户管理-设置资金管理员
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetMerchantFundmanagerResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.fundmanager.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_merchant_fundmanager_ex_async(
        self,
        request: baasdt_models.SetMerchantFundmanagerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetMerchantFundmanagerResponse:
        """
        Description: 设置商户的资金管理员，重要权限，谨慎操作！
        Summary: 数字商品服务-商户管理-设置资金管理员
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetMerchantFundmanagerResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.fundmanager.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_merchant_provision(
        self,
        request: baasdt_models.CreateMerchantProvisionRequest,
    ) -> baasdt_models.CreateMerchantProvisionResponse:
        """
        Description: 创建备付金账户，合约管理员权限
        Summary: 数字商品服务-商户管理-创建备付金账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_merchant_provision_ex(request, headers, runtime)

    async def create_merchant_provision_async(
        self,
        request: baasdt_models.CreateMerchantProvisionRequest,
    ) -> baasdt_models.CreateMerchantProvisionResponse:
        """
        Description: 创建备付金账户，合约管理员权限
        Summary: 数字商品服务-商户管理-创建备付金账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_merchant_provision_ex_async(request, headers, runtime)

    def create_merchant_provision_ex(
        self,
        request: baasdt_models.CreateMerchantProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateMerchantProvisionResponse:
        """
        Description: 创建备付金账户，合约管理员权限
        Summary: 数字商品服务-商户管理-创建备付金账户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateMerchantProvisionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.merchant.provision.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_merchant_provision_ex_async(
        self,
        request: baasdt_models.CreateMerchantProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateMerchantProvisionResponse:
        """
        Description: 创建备付金账户，合约管理员权限
        Summary: 数字商品服务-商户管理-创建备付金账户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateMerchantProvisionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.merchant.provision.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_config_delegaterelation(
        self,
        request: baasdt_models.QueryConfigDelegaterelationRequest,
    ) -> baasdt_models.QueryConfigDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-管理服务-代理权限查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_config_delegaterelation_ex(request, headers, runtime)

    async def query_config_delegaterelation_async(
        self,
        request: baasdt_models.QueryConfigDelegaterelationRequest,
    ) -> baasdt_models.QueryConfigDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-管理服务-代理权限查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_config_delegaterelation_ex_async(request, headers, runtime)

    def query_config_delegaterelation_ex(
        self,
        request: baasdt_models.QueryConfigDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConfigDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-管理服务-代理权限查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConfigDelegaterelationResponse().from_map(
            self.do_request('1.0', 'baas.antdao.config.delegaterelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_config_delegaterelation_ex_async(
        self,
        request: baasdt_models.QueryConfigDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConfigDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-管理服务-代理权限查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConfigDelegaterelationResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.config.delegaterelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_config_delegaterelation(
        self,
        request: baasdt_models.UpdateConfigDelegaterelationRequest,
    ) -> baasdt_models.UpdateConfigDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-管理服务-设置代理权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_config_delegaterelation_ex(request, headers, runtime)

    async def update_config_delegaterelation_async(
        self,
        request: baasdt_models.UpdateConfigDelegaterelationRequest,
    ) -> baasdt_models.UpdateConfigDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-管理服务-设置代理权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_config_delegaterelation_ex_async(request, headers, runtime)

    def update_config_delegaterelation_ex(
        self,
        request: baasdt_models.UpdateConfigDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConfigDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-管理服务-设置代理权限
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConfigDelegaterelationResponse().from_map(
            self.do_request('1.0', 'baas.antdao.config.delegaterelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_config_delegaterelation_ex_async(
        self,
        request: baasdt_models.UpdateConfigDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConfigDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-管理服务-设置代理权限
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConfigDelegaterelationResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.config.delegaterelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_config_whitelist(
        self,
        request: baasdt_models.QueryConfigWhitelistRequest,
    ) -> baasdt_models.QueryConfigWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_config_whitelist_ex(request, headers, runtime)

    async def query_config_whitelist_async(
        self,
        request: baasdt_models.QueryConfigWhitelistRequest,
    ) -> baasdt_models.QueryConfigWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_config_whitelist_ex_async(request, headers, runtime)

    def query_config_whitelist_ex(
        self,
        request: baasdt_models.QueryConfigWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConfigWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConfigWhitelistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.config.whitelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_config_whitelist_ex_async(
        self,
        request: baasdt_models.QueryConfigWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryConfigWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryConfigWhitelistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.config.whitelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_config_whitelist(
        self,
        request: baasdt_models.UpdateConfigWhitelistRequest,
    ) -> baasdt_models.UpdateConfigWhitelistResponse:
        """
        Description: 设置接口访问白名单
        Summary: 数字商品服务-管理服务-设置访问白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_config_whitelist_ex(request, headers, runtime)

    async def update_config_whitelist_async(
        self,
        request: baasdt_models.UpdateConfigWhitelistRequest,
    ) -> baasdt_models.UpdateConfigWhitelistResponse:
        """
        Description: 设置接口访问白名单
        Summary: 数字商品服务-管理服务-设置访问白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_config_whitelist_ex_async(request, headers, runtime)

    def update_config_whitelist_ex(
        self,
        request: baasdt_models.UpdateConfigWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConfigWhitelistResponse:
        """
        Description: 设置接口访问白名单
        Summary: 数字商品服务-管理服务-设置访问白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConfigWhitelistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.config.whitelist.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_config_whitelist_ex_async(
        self,
        request: baasdt_models.UpdateConfigWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateConfigWhitelistResponse:
        """
        Description: 设置接口访问白名单
        Summary: 数字商品服务-管理服务-设置访问白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateConfigWhitelistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.config.whitelist.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_exchange_aftersale(
        self,
        request: baasdt_models.ApplyExchangeAftersaleRequest,
    ) -> baasdt_models.ApplyExchangeAftersaleResponse:
        """
        Description: 兑换单申请售后（采购商）
        Summary: 数字商品服务-兑换服务-申请售后(商家)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_exchange_aftersale_ex(request, headers, runtime)

    async def apply_exchange_aftersale_async(
        self,
        request: baasdt_models.ApplyExchangeAftersaleRequest,
    ) -> baasdt_models.ApplyExchangeAftersaleResponse:
        """
        Description: 兑换单申请售后（采购商）
        Summary: 数字商品服务-兑换服务-申请售后(商家)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_exchange_aftersale_ex_async(request, headers, runtime)

    def apply_exchange_aftersale_ex(
        self,
        request: baasdt_models.ApplyExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyExchangeAftersaleResponse:
        """
        Description: 兑换单申请售后（采购商）
        Summary: 数字商品服务-兑换服务-申请售后(商家)
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyExchangeAftersaleResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.aftersale.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_exchange_aftersale_ex_async(
        self,
        request: baasdt_models.ApplyExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyExchangeAftersaleResponse:
        """
        Description: 兑换单申请售后（采购商）
        Summary: 数字商品服务-兑换服务-申请售后(商家)
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyExchangeAftersaleResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.aftersale.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_exchange_agreeaftersale(
        self,
        request: baasdt_models.ExecExchangeAgreeaftersaleRequest,
    ) -> baasdt_models.ExecExchangeAgreeaftersaleResponse:
        """
        Description: 同意售后（供应商）
        Summary: 数字商品服务-兑换服务-同意售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_exchange_agreeaftersale_ex(request, headers, runtime)

    async def exec_exchange_agreeaftersale_async(
        self,
        request: baasdt_models.ExecExchangeAgreeaftersaleRequest,
    ) -> baasdt_models.ExecExchangeAgreeaftersaleResponse:
        """
        Description: 同意售后（供应商）
        Summary: 数字商品服务-兑换服务-同意售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_exchange_agreeaftersale_ex_async(request, headers, runtime)

    def exec_exchange_agreeaftersale_ex(
        self,
        request: baasdt_models.ExecExchangeAgreeaftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeAgreeaftersaleResponse:
        """
        Description: 同意售后（供应商）
        Summary: 数字商品服务-兑换服务-同意售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeAgreeaftersaleResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.agreeaftersale.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_exchange_agreeaftersale_ex_async(
        self,
        request: baasdt_models.ExecExchangeAgreeaftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecExchangeAgreeaftersaleResponse:
        """
        Description: 同意售后（供应商）
        Summary: 数字商品服务-兑换服务-同意售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecExchangeAgreeaftersaleResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.agreeaftersale.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_exchange_aftersale(
        self,
        request: baasdt_models.RefuseExchangeAftersaleRequest,
    ) -> baasdt_models.RefuseExchangeAftersaleResponse:
        """
        Description: 拒绝售后（供应商）
        Summary: 数字商品服务-兑换服务-拒绝售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_exchange_aftersale_ex(request, headers, runtime)

    async def refuse_exchange_aftersale_async(
        self,
        request: baasdt_models.RefuseExchangeAftersaleRequest,
    ) -> baasdt_models.RefuseExchangeAftersaleResponse:
        """
        Description: 拒绝售后（供应商）
        Summary: 数字商品服务-兑换服务-拒绝售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_exchange_aftersale_ex_async(request, headers, runtime)

    def refuse_exchange_aftersale_ex(
        self,
        request: baasdt_models.RefuseExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RefuseExchangeAftersaleResponse:
        """
        Description: 拒绝售后（供应商）
        Summary: 数字商品服务-兑换服务-拒绝售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.RefuseExchangeAftersaleResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.aftersale.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_exchange_aftersale_ex_async(
        self,
        request: baasdt_models.RefuseExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RefuseExchangeAftersaleResponse:
        """
        Description: 拒绝售后（供应商）
        Summary: 数字商品服务-兑换服务-拒绝售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.RefuseExchangeAftersaleResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.aftersale.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_exchange_aftersale(
        self,
        request: baasdt_models.SendExchangeAftersaleRequest,
    ) -> baasdt_models.SendExchangeAftersaleResponse:
        """
        Description: 重新发货（供应商）
        Summary: 数字商品服务-兑换服务-重新发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_exchange_aftersale_ex(request, headers, runtime)

    async def send_exchange_aftersale_async(
        self,
        request: baasdt_models.SendExchangeAftersaleRequest,
    ) -> baasdt_models.SendExchangeAftersaleResponse:
        """
        Description: 重新发货（供应商）
        Summary: 数字商品服务-兑换服务-重新发货
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_exchange_aftersale_ex_async(request, headers, runtime)

    def send_exchange_aftersale_ex(
        self,
        request: baasdt_models.SendExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SendExchangeAftersaleResponse:
        """
        Description: 重新发货（供应商）
        Summary: 数字商品服务-兑换服务-重新发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.SendExchangeAftersaleResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.aftersale.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_exchange_aftersale_ex_async(
        self,
        request: baasdt_models.SendExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SendExchangeAftersaleResponse:
        """
        Description: 重新发货（供应商）
        Summary: 数字商品服务-兑换服务-重新发货
        """
        UtilClient.validate_model(request)
        return baasdt_models.SendExchangeAftersaleResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.aftersale.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_exchange_aftersale(
        self,
        request: baasdt_models.ConfirmExchangeAftersaleRequest,
    ) -> baasdt_models.ConfirmExchangeAftersaleResponse:
        """
        Description: 商户确认售后（供应商）comfirmaftersale
        Summary:  数字商品服务-兑换服务-商户确认售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_exchange_aftersale_ex(request, headers, runtime)

    async def confirm_exchange_aftersale_async(
        self,
        request: baasdt_models.ConfirmExchangeAftersaleRequest,
    ) -> baasdt_models.ConfirmExchangeAftersaleResponse:
        """
        Description: 商户确认售后（供应商）comfirmaftersale
        Summary:  数字商品服务-兑换服务-商户确认售后
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_exchange_aftersale_ex_async(request, headers, runtime)

    def confirm_exchange_aftersale_ex(
        self,
        request: baasdt_models.ConfirmExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmExchangeAftersaleResponse:
        """
        Description: 商户确认售后（供应商）comfirmaftersale
        Summary:  数字商品服务-兑换服务-商户确认售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmExchangeAftersaleResponse().from_map(
            self.do_request('1.0', 'baas.antdao.exchange.aftersale.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_exchange_aftersale_ex_async(
        self,
        request: baasdt_models.ConfirmExchangeAftersaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmExchangeAftersaleResponse:
        """
        Description: 商户确认售后（供应商）comfirmaftersale
        Summary:  数字商品服务-兑换服务-商户确认售后
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmExchangeAftersaleResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.exchange.aftersale.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_data_deposit(
        self,
        request: baasdt_models.ExecDataDepositRequest,
    ) -> baasdt_models.ExecDataDepositResponse:
        """
        Description: 数字消费卡链上发布
        Summary: 数字商品服务-存证服务-消费卡链上发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_data_deposit_ex(request, headers, runtime)

    async def exec_data_deposit_async(
        self,
        request: baasdt_models.ExecDataDepositRequest,
    ) -> baasdt_models.ExecDataDepositResponse:
        """
        Description: 数字消费卡链上发布
        Summary: 数字商品服务-存证服务-消费卡链上发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_data_deposit_ex_async(request, headers, runtime)

    def exec_data_deposit_ex(
        self,
        request: baasdt_models.ExecDataDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecDataDepositResponse:
        """
        Description: 数字消费卡链上发布
        Summary: 数字商品服务-存证服务-消费卡链上发布
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecDataDepositResponse().from_map(
            self.do_request('1.0', 'baas.antdao.data.deposit.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_data_deposit_ex_async(
        self,
        request: baasdt_models.ExecDataDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecDataDepositResponse:
        """
        Description: 数字消费卡链上发布
        Summary: 数字商品服务-存证服务-消费卡链上发布
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecDataDepositResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.data.deposit.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_commission(
        self,
        request: baasdt_models.SetCommissionRequest,
    ) -> baasdt_models.SetCommissionResponse:
        """
        Description: 设置商品兑换手续费
        Summary: 数字商品服务-商品服务-设置商品手续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_commission_ex(request, headers, runtime)

    async def set_commission_async(
        self,
        request: baasdt_models.SetCommissionRequest,
    ) -> baasdt_models.SetCommissionResponse:
        """
        Description: 设置商品兑换手续费
        Summary: 数字商品服务-商品服务-设置商品手续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_commission_ex_async(request, headers, runtime)

    def set_commission_ex(
        self,
        request: baasdt_models.SetCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetCommissionResponse:
        """
        Description: 设置商品兑换手续费
        Summary: 数字商品服务-商品服务-设置商品手续费
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetCommissionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.commission.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_commission_ex_async(
        self,
        request: baasdt_models.SetCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetCommissionResponse:
        """
        Description: 设置商品兑换手续费
        Summary: 数字商品服务-商品服务-设置商品手续费
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetCommissionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.commission.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_commission(
        self,
        request: baasdt_models.QueryCommissionRequest,
    ) -> baasdt_models.QueryCommissionResponse:
        """
        Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
        Summary: 数字商品服务-商品服务-查询商品手续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_commission_ex(request, headers, runtime)

    async def query_commission_async(
        self,
        request: baasdt_models.QueryCommissionRequest,
    ) -> baasdt_models.QueryCommissionResponse:
        """
        Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
        Summary: 数字商品服务-商品服务-查询商品手续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_commission_ex_async(request, headers, runtime)

    def query_commission_ex(
        self,
        request: baasdt_models.QueryCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCommissionResponse:
        """
        Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
        Summary: 数字商品服务-商品服务-查询商品手续费
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCommissionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.commission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_commission_ex_async(
        self,
        request: baasdt_models.QueryCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCommissionResponse:
        """
        Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
        Summary: 数字商品服务-商品服务-查询商品手续费
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCommissionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.commission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_commission_merchant(
        self,
        request: baasdt_models.SetCommissionMerchantRequest,
    ) -> baasdt_models.SetCommissionMerchantResponse:
        """
        Description: 设置收取手续费的商户信息（合约管理员权限）
        Summary: 数字商品服务-商品服务-设置收手续费商户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_commission_merchant_ex(request, headers, runtime)

    async def set_commission_merchant_async(
        self,
        request: baasdt_models.SetCommissionMerchantRequest,
    ) -> baasdt_models.SetCommissionMerchantResponse:
        """
        Description: 设置收取手续费的商户信息（合约管理员权限）
        Summary: 数字商品服务-商品服务-设置收手续费商户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_commission_merchant_ex_async(request, headers, runtime)

    def set_commission_merchant_ex(
        self,
        request: baasdt_models.SetCommissionMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetCommissionMerchantResponse:
        """
        Description: 设置收取手续费的商户信息（合约管理员权限）
        Summary: 数字商品服务-商品服务-设置收手续费商户
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetCommissionMerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.commission.merchant.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_commission_merchant_ex_async(
        self,
        request: baasdt_models.SetCommissionMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetCommissionMerchantResponse:
        """
        Description: 设置收取手续费的商户信息（合约管理员权限）
        Summary: 数字商品服务-商品服务-设置收手续费商户
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetCommissionMerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.commission.merchant.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_commission_merchant(
        self,
        request: baasdt_models.QueryCommissionMerchantRequest,
    ) -> baasdt_models.QueryCommissionMerchantResponse:
        """
        Description: 查询收取手续费的商户信息
        Summary: 数字商品服务-商品服务-查询收手续费商户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_commission_merchant_ex(request, headers, runtime)

    async def query_commission_merchant_async(
        self,
        request: baasdt_models.QueryCommissionMerchantRequest,
    ) -> baasdt_models.QueryCommissionMerchantResponse:
        """
        Description: 查询收取手续费的商户信息
        Summary: 数字商品服务-商品服务-查询收手续费商户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_commission_merchant_ex_async(request, headers, runtime)

    def query_commission_merchant_ex(
        self,
        request: baasdt_models.QueryCommissionMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCommissionMerchantResponse:
        """
        Description: 查询收取手续费的商户信息
        Summary: 数字商品服务-商品服务-查询收手续费商户
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCommissionMerchantResponse().from_map(
            self.do_request('1.0', 'baas.antdao.commission.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_commission_merchant_ex_async(
        self,
        request: baasdt_models.QueryCommissionMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryCommissionMerchantResponse:
        """
        Description: 查询收取手续费的商户信息
        Summary: 数字商品服务-商品服务-查询收手续费商户
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryCommissionMerchantResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.commission.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_config_chainaccount(
        self,
        request: baasdt_models.CreateConfigChainaccountRequest,
    ) -> baasdt_models.CreateConfigChainaccountResponse:
        """
        Description: 单独创建对应的链ID的链上账户
        Summary: 数字商品服务-管理服务-创建链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_config_chainaccount_ex(request, headers, runtime)

    async def create_config_chainaccount_async(
        self,
        request: baasdt_models.CreateConfigChainaccountRequest,
    ) -> baasdt_models.CreateConfigChainaccountResponse:
        """
        Description: 单独创建对应的链ID的链上账户
        Summary: 数字商品服务-管理服务-创建链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_config_chainaccount_ex_async(request, headers, runtime)

    def create_config_chainaccount_ex(
        self,
        request: baasdt_models.CreateConfigChainaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConfigChainaccountResponse:
        """
        Description: 单独创建对应的链ID的链上账户
        Summary: 数字商品服务-管理服务-创建链上账户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConfigChainaccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.config.chainaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_config_chainaccount_ex_async(
        self,
        request: baasdt_models.CreateConfigChainaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateConfigChainaccountResponse:
        """
        Description: 单独创建对应的链ID的链上账户
        Summary: 数字商品服务-管理服务-创建链上账户
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateConfigChainaccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.config.chainaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_ip_packagetrade(
        self,
        request: baasdt_models.StartIpPackagetradeRequest,
    ) -> baasdt_models.StartIpPackagetradeResponse:
        """
        Description: 买家发起套餐交易
        Summary: 数字商品服务-IP授权服务-发起套餐交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_ip_packagetrade_ex(request, headers, runtime)

    async def start_ip_packagetrade_async(
        self,
        request: baasdt_models.StartIpPackagetradeRequest,
    ) -> baasdt_models.StartIpPackagetradeResponse:
        """
        Description: 买家发起套餐交易
        Summary: 数字商品服务-IP授权服务-发起套餐交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_ip_packagetrade_ex_async(request, headers, runtime)

    def start_ip_packagetrade_ex(
        self,
        request: baasdt_models.StartIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.StartIpPackagetradeResponse:
        """
        Description: 买家发起套餐交易
        Summary: 数字商品服务-IP授权服务-发起套餐交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.StartIpPackagetradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.packagetrade.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_ip_packagetrade_ex_async(
        self,
        request: baasdt_models.StartIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.StartIpPackagetradeResponse:
        """
        Description: 买家发起套餐交易
        Summary: 数字商品服务-IP授权服务-发起套餐交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.StartIpPackagetradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.packagetrade.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_ip_packagetrade(
        self,
        request: baasdt_models.CancelIpPackagetradeRequest,
    ) -> baasdt_models.CancelIpPackagetradeResponse:
        """
        Description: 交易发起方取消交易，包括套餐交易和定向授权
        Summary: 数字商品服务-IP授权服务-取消交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_ip_packagetrade_ex(request, headers, runtime)

    async def cancel_ip_packagetrade_async(
        self,
        request: baasdt_models.CancelIpPackagetradeRequest,
    ) -> baasdt_models.CancelIpPackagetradeResponse:
        """
        Description: 交易发起方取消交易，包括套餐交易和定向授权
        Summary: 数字商品服务-IP授权服务-取消交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_ip_packagetrade_ex_async(request, headers, runtime)

    def cancel_ip_packagetrade_ex(
        self,
        request: baasdt_models.CancelIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelIpPackagetradeResponse:
        """
        Description: 交易发起方取消交易，包括套餐交易和定向授权
        Summary: 数字商品服务-IP授权服务-取消交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelIpPackagetradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.packagetrade.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_ip_packagetrade_ex_async(
        self,
        request: baasdt_models.CancelIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelIpPackagetradeResponse:
        """
        Description: 交易发起方取消交易，包括套餐交易和定向授权
        Summary: 数字商品服务-IP授权服务-取消交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelIpPackagetradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.packagetrade.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ip_packagetradesales(
        self,
        request: baasdt_models.UploadIpPackagetradesalesRequest,
    ) -> baasdt_models.UploadIpPackagetradesalesResponse:
        """
        Description: 上传套餐交易销售数据
        Summary: 数字商品服务-IP授权服务-上传套餐数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ip_packagetradesales_ex(request, headers, runtime)

    async def upload_ip_packagetradesales_async(
        self,
        request: baasdt_models.UploadIpPackagetradesalesRequest,
    ) -> baasdt_models.UploadIpPackagetradesalesResponse:
        """
        Description: 上传套餐交易销售数据
        Summary: 数字商品服务-IP授权服务-上传套餐数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ip_packagetradesales_ex_async(request, headers, runtime)

    def upload_ip_packagetradesales_ex(
        self,
        request: baasdt_models.UploadIpPackagetradesalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpPackagetradesalesResponse:
        """
        Description: 上传套餐交易销售数据
        Summary: 数字商品服务-IP授权服务-上传套餐数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpPackagetradesalesResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.packagetradesales.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ip_packagetradesales_ex_async(
        self,
        request: baasdt_models.UploadIpPackagetradesalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpPackagetradesalesResponse:
        """
        Description: 上传套餐交易销售数据
        Summary: 数字商品服务-IP授权服务-上传套餐数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpPackagetradesalesResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.packagetradesales.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_ip_authtrade(
        self,
        request: baasdt_models.StartIpAuthtradeRequest,
    ) -> baasdt_models.StartIpAuthtradeResponse:
        """
        Description: 发起授权交易
        Summary: 数字商品服务-IP授权服务-发起授权交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_ip_authtrade_ex(request, headers, runtime)

    async def start_ip_authtrade_async(
        self,
        request: baasdt_models.StartIpAuthtradeRequest,
    ) -> baasdt_models.StartIpAuthtradeResponse:
        """
        Description: 发起授权交易
        Summary: 数字商品服务-IP授权服务-发起授权交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_ip_authtrade_ex_async(request, headers, runtime)

    def start_ip_authtrade_ex(
        self,
        request: baasdt_models.StartIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.StartIpAuthtradeResponse:
        """
        Description: 发起授权交易
        Summary: 数字商品服务-IP授权服务-发起授权交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.StartIpAuthtradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.authtrade.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_ip_authtrade_ex_async(
        self,
        request: baasdt_models.StartIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.StartIpAuthtradeResponse:
        """
        Description: 发起授权交易
        Summary: 数字商品服务-IP授权服务-发起授权交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.StartIpAuthtradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.authtrade.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ip_authtradesales(
        self,
        request: baasdt_models.UploadIpAuthtradesalesRequest,
    ) -> baasdt_models.UploadIpAuthtradesalesResponse:
        """
        Description: 上传授权模式交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ip_authtradesales_ex(request, headers, runtime)

    async def upload_ip_authtradesales_async(
        self,
        request: baasdt_models.UploadIpAuthtradesalesRequest,
    ) -> baasdt_models.UploadIpAuthtradesalesResponse:
        """
        Description: 上传授权模式交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ip_authtradesales_ex_async(request, headers, runtime)

    def upload_ip_authtradesales_ex(
        self,
        request: baasdt_models.UploadIpAuthtradesalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpAuthtradesalesResponse:
        """
        Description: 上传授权模式交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpAuthtradesalesResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.authtradesales.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ip_authtradesales_ex_async(
        self,
        request: baasdt_models.UploadIpAuthtradesalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpAuthtradesalesResponse:
        """
        Description: 上传授权模式交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpAuthtradesalesResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.authtradesales.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_ip_authtradebill(
        self,
        request: baasdt_models.CancelIpAuthtradebillRequest,
    ) -> baasdt_models.CancelIpAuthtradebillResponse:
        """
        Description: 取消授权模式下销售数据账单
        Summary: 数字商品服务-IP授权服务-取消授权账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_ip_authtradebill_ex(request, headers, runtime)

    async def cancel_ip_authtradebill_async(
        self,
        request: baasdt_models.CancelIpAuthtradebillRequest,
    ) -> baasdt_models.CancelIpAuthtradebillResponse:
        """
        Description: 取消授权模式下销售数据账单
        Summary: 数字商品服务-IP授权服务-取消授权账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_ip_authtradebill_ex_async(request, headers, runtime)

    def cancel_ip_authtradebill_ex(
        self,
        request: baasdt_models.CancelIpAuthtradebillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelIpAuthtradebillResponse:
        """
        Description: 取消授权模式下销售数据账单
        Summary: 数字商品服务-IP授权服务-取消授权账单
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelIpAuthtradebillResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.authtradebill.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_ip_authtradebill_ex_async(
        self,
        request: baasdt_models.CancelIpAuthtradebillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CancelIpAuthtradebillResponse:
        """
        Description: 取消授权模式下销售数据账单
        Summary: 数字商品服务-IP授权服务-取消授权账单
        """
        UtilClient.validate_model(request)
        return baasdt_models.CancelIpAuthtradebillResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.authtradebill.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_billstatus(
        self,
        request: baasdt_models.QueryIpBillstatusRequest,
    ) -> baasdt_models.QueryIpBillstatusResponse:
        """
        Description: 查询账单支付状态
        Summary: 数字商品服务-IP授权服务-查询账单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_billstatus_ex(request, headers, runtime)

    async def query_ip_billstatus_async(
        self,
        request: baasdt_models.QueryIpBillstatusRequest,
    ) -> baasdt_models.QueryIpBillstatusResponse:
        """
        Description: 查询账单支付状态
        Summary: 数字商品服务-IP授权服务-查询账单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_billstatus_ex_async(request, headers, runtime)

    def query_ip_billstatus_ex(
        self,
        request: baasdt_models.QueryIpBillstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpBillstatusResponse:
        """
        Description: 查询账单支付状态
        Summary: 数字商品服务-IP授权服务-查询账单状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpBillstatusResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.billstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_billstatus_ex_async(
        self,
        request: baasdt_models.QueryIpBillstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpBillstatusResponse:
        """
        Description: 查询账单支付状态
        Summary: 数字商品服务-IP授权服务-查询账单状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpBillstatusResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.billstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_orderlist(
        self,
        request: baasdt_models.QueryIpOrderlistRequest,
    ) -> baasdt_models.QueryIpOrderlistResponse:
        """
        Description: 查询订单信息，模糊查询和分页查询
        Summary: 数字商品服务-IP授权服务-查询订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_orderlist_ex(request, headers, runtime)

    async def query_ip_orderlist_async(
        self,
        request: baasdt_models.QueryIpOrderlistRequest,
    ) -> baasdt_models.QueryIpOrderlistResponse:
        """
        Description: 查询订单信息，模糊查询和分页查询
        Summary: 数字商品服务-IP授权服务-查询订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_orderlist_ex_async(request, headers, runtime)

    def query_ip_orderlist_ex(
        self,
        request: baasdt_models.QueryIpOrderlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderlistResponse:
        """
        Description: 查询订单信息，模糊查询和分页查询
        Summary: 数字商品服务-IP授权服务-查询订单列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderlistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.orderlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_orderlist_ex_async(
        self,
        request: baasdt_models.QueryIpOrderlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderlistResponse:
        """
        Description: 查询订单信息，模糊查询和分页查询
        Summary: 数字商品服务-IP授权服务-查询订单列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderlistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.orderlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ip_goods(
        self,
        request: baasdt_models.CreateIpGoodsRequest,
    ) -> baasdt_models.CreateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ip_goods_ex(request, headers, runtime)

    async def create_ip_goods_async(
        self,
        request: baasdt_models.CreateIpGoodsRequest,
    ) -> baasdt_models.CreateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ip_goods_ex_async(request, headers, runtime)

    def create_ip_goods_ex(
        self,
        request: baasdt_models.CreateIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goods.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ip_goods_ex_async(
        self,
        request: baasdt_models.CreateIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goods.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ip_channel(
        self,
        request: baasdt_models.AddIpChannelRequest,
    ) -> baasdt_models.AddIpChannelResponse:
        """
        Description: ip的渠道信息添加
        Summary: 数字商品服务-IP授权服务-渠道信息添加
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ip_channel_ex(request, headers, runtime)

    async def add_ip_channel_async(
        self,
        request: baasdt_models.AddIpChannelRequest,
    ) -> baasdt_models.AddIpChannelResponse:
        """
        Description: ip的渠道信息添加
        Summary: 数字商品服务-IP授权服务-渠道信息添加
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ip_channel_ex_async(request, headers, runtime)

    def add_ip_channel_ex(
        self,
        request: baasdt_models.AddIpChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddIpChannelResponse:
        """
        Description: ip的渠道信息添加
        Summary: 数字商品服务-IP授权服务-渠道信息添加
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddIpChannelResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.channel.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ip_channel_ex_async(
        self,
        request: baasdt_models.AddIpChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddIpChannelResponse:
        """
        Description: ip的渠道信息添加
        Summary: 数字商品服务-IP授权服务-渠道信息添加
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddIpChannelResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.channel.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_orderinfo(
        self,
        request: baasdt_models.QueryIpOrderinfoRequest,
    ) -> baasdt_models.QueryIpOrderinfoResponse:
        """
        Description: 查询订单详情，包含销售数据
        Summary: 数字商品服务-IP授权服务-查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_orderinfo_ex(request, headers, runtime)

    async def query_ip_orderinfo_async(
        self,
        request: baasdt_models.QueryIpOrderinfoRequest,
    ) -> baasdt_models.QueryIpOrderinfoResponse:
        """
        Description: 查询订单详情，包含销售数据
        Summary: 数字商品服务-IP授权服务-查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_orderinfo_ex_async(request, headers, runtime)

    def query_ip_orderinfo_ex(
        self,
        request: baasdt_models.QueryIpOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderinfoResponse:
        """
        Description: 查询订单详情，包含销售数据
        Summary: 数字商品服务-IP授权服务-查询订单详情
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderinfoResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.orderinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_orderinfo_ex_async(
        self,
        request: baasdt_models.QueryIpOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderinfoResponse:
        """
        Description: 查询订单详情，包含销售数据
        Summary: 数字商品服务-IP授权服务-查询订单详情
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderinfoResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.orderinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_goods(
        self,
        request: baasdt_models.BatchqueryIpGoodsRequest,
    ) -> baasdt_models.BatchqueryIpGoodsResponse:
        """
        Description: 批量查询ip简略信息
        Summary: 数字商品服务-IP授权服务-批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_goods_ex(request, headers, runtime)

    async def batchquery_ip_goods_async(
        self,
        request: baasdt_models.BatchqueryIpGoodsRequest,
    ) -> baasdt_models.BatchqueryIpGoodsResponse:
        """
        Description: 批量查询ip简略信息
        Summary: 数字商品服务-IP授权服务-批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_goods_ex_async(request, headers, runtime)

    def batchquery_ip_goods_ex(
        self,
        request: baasdt_models.BatchqueryIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpGoodsResponse:
        """
        Description: 批量查询ip简略信息
        Summary: 数字商品服务-IP授权服务-批量查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goods.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_goods_ex_async(
        self,
        request: baasdt_models.BatchqueryIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpGoodsResponse:
        """
        Description: 批量查询ip简略信息
        Summary: 数字商品服务-IP授权服务-批量查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goods.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_goodsdetailwithchannel(
        self,
        request: baasdt_models.QueryIpGoodsdetailwithchannelRequest,
    ) -> baasdt_models.QueryIpGoodsdetailwithchannelResponse:
        """
        Description: 根据渠道查询详细的信息
        Summary: 数字商品服务-IP授权服务-查询渠道详细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_goodsdetailwithchannel_ex(request, headers, runtime)

    async def query_ip_goodsdetailwithchannel_async(
        self,
        request: baasdt_models.QueryIpGoodsdetailwithchannelRequest,
    ) -> baasdt_models.QueryIpGoodsdetailwithchannelResponse:
        """
        Description: 根据渠道查询详细的信息
        Summary: 数字商品服务-IP授权服务-查询渠道详细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_goodsdetailwithchannel_ex_async(request, headers, runtime)

    def query_ip_goodsdetailwithchannel_ex(
        self,
        request: baasdt_models.QueryIpGoodsdetailwithchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpGoodsdetailwithchannelResponse:
        """
        Description: 根据渠道查询详细的信息
        Summary: 数字商品服务-IP授权服务-查询渠道详细
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpGoodsdetailwithchannelResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goodsdetailwithchannel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_goodsdetailwithchannel_ex_async(
        self,
        request: baasdt_models.QueryIpGoodsdetailwithchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpGoodsdetailwithchannelResponse:
        """
        Description: 根据渠道查询详细的信息
        Summary: 数字商品服务-IP授权服务-查询渠道详细
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpGoodsdetailwithchannelResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goodsdetailwithchannel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_detail(
        self,
        request: baasdt_models.QueryIpDetailRequest,
    ) -> baasdt_models.QueryIpDetailResponse:
        """
        Description: ip的所有信息 包括渠道和sku
        Summary: 数字商品服务-IP授权服务-IP详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_detail_ex(request, headers, runtime)

    async def query_ip_detail_async(
        self,
        request: baasdt_models.QueryIpDetailRequest,
    ) -> baasdt_models.QueryIpDetailResponse:
        """
        Description: ip的所有信息 包括渠道和sku
        Summary: 数字商品服务-IP授权服务-IP详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_detail_ex_async(request, headers, runtime)

    def query_ip_detail_ex(
        self,
        request: baasdt_models.QueryIpDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpDetailResponse:
        """
        Description: ip的所有信息 包括渠道和sku
        Summary: 数字商品服务-IP授权服务-IP详情查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpDetailResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_detail_ex_async(
        self,
        request: baasdt_models.QueryIpDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpDetailResponse:
        """
        Description: ip的所有信息 包括渠道和sku
        Summary: 数字商品服务-IP授权服务-IP详情查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpDetailResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ip_goods(
        self,
        request: baasdt_models.UpdateIpGoodsRequest,
    ) -> baasdt_models.UpdateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ip_goods_ex(request, headers, runtime)

    async def update_ip_goods_async(
        self,
        request: baasdt_models.UpdateIpGoodsRequest,
    ) -> baasdt_models.UpdateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ip_goods_ex_async(request, headers, runtime)

    def update_ip_goods_ex(
        self,
        request: baasdt_models.UpdateIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip更新
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goods.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ip_goods_ex_async(
        self,
        request: baasdt_models.UpdateIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpGoodsResponse:
        """
        Description: ip商品创建
        Summary: 数字商品服务-IP授权服务-ip更新
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goods.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ip_channel(
        self,
        request: baasdt_models.UpdateIpChannelRequest,
    ) -> baasdt_models.UpdateIpChannelResponse:
        """
        Description: ip的渠道信息修改
        Summary: 数字商品服务-IP授权服务-渠道信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ip_channel_ex(request, headers, runtime)

    async def update_ip_channel_async(
        self,
        request: baasdt_models.UpdateIpChannelRequest,
    ) -> baasdt_models.UpdateIpChannelResponse:
        """
        Description: ip的渠道信息修改
        Summary: 数字商品服务-IP授权服务-渠道信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ip_channel_ex_async(request, headers, runtime)

    def update_ip_channel_ex(
        self,
        request: baasdt_models.UpdateIpChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpChannelResponse:
        """
        Description: ip的渠道信息修改
        Summary: 数字商品服务-IP授权服务-渠道信息更新
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpChannelResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.channel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ip_channel_ex_async(
        self,
        request: baasdt_models.UpdateIpChannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpChannelResponse:
        """
        Description: ip的渠道信息修改
        Summary: 数字商品服务-IP授权服务-渠道信息更新
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpChannelResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.channel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_ip(
        self,
        request: baasdt_models.OnlineIpRequest,
    ) -> baasdt_models.OnlineIpResponse:
        """
        Description: ip上线
        Summary: 数字商品服务-IP授权服务-上架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_ip_ex(request, headers, runtime)

    async def online_ip_async(
        self,
        request: baasdt_models.OnlineIpRequest,
    ) -> baasdt_models.OnlineIpResponse:
        """
        Description: ip上线
        Summary: 数字商品服务-IP授权服务-上架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_ip_ex_async(request, headers, runtime)

    def online_ip_ex(
        self,
        request: baasdt_models.OnlineIpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OnlineIpResponse:
        """
        Description: ip上线
        Summary: 数字商品服务-IP授权服务-上架
        """
        UtilClient.validate_model(request)
        return baasdt_models.OnlineIpResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_ip_ex_async(
        self,
        request: baasdt_models.OnlineIpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OnlineIpResponse:
        """
        Description: ip上线
        Summary: 数字商品服务-IP授权服务-上架
        """
        UtilClient.validate_model(request)
        return baasdt_models.OnlineIpResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_ip(
        self,
        request: baasdt_models.OfflineIpRequest,
    ) -> baasdt_models.OfflineIpResponse:
        """
        Description: ip下线
        Summary: 数字商品服务-IP授权服务-下架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_ip_ex(request, headers, runtime)

    async def offline_ip_async(
        self,
        request: baasdt_models.OfflineIpRequest,
    ) -> baasdt_models.OfflineIpResponse:
        """
        Description: ip下线
        Summary: 数字商品服务-IP授权服务-下架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_ip_ex_async(request, headers, runtime)

    def offline_ip_ex(
        self,
        request: baasdt_models.OfflineIpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OfflineIpResponse:
        """
        Description: ip下线
        Summary: 数字商品服务-IP授权服务-下架
        """
        UtilClient.validate_model(request)
        return baasdt_models.OfflineIpResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_ip_ex_async(
        self,
        request: baasdt_models.OfflineIpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OfflineIpResponse:
        """
        Description: ip下线
        Summary: 数字商品服务-IP授权服务-下架
        """
        UtilClient.validate_model(request)
        return baasdt_models.OfflineIpResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ip_account(
        self,
        request: baasdt_models.CreateIpAccountRequest,
    ) -> baasdt_models.CreateIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
        Summary: 数字商品服务-IP授权服务-账户创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ip_account_ex(request, headers, runtime)

    async def create_ip_account_async(
        self,
        request: baasdt_models.CreateIpAccountRequest,
    ) -> baasdt_models.CreateIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
        Summary: 数字商品服务-IP授权服务-账户创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ip_account_ex_async(request, headers, runtime)

    def create_ip_account_ex(
        self,
        request: baasdt_models.CreateIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
        Summary: 数字商品服务-IP授权服务-账户创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ip_account_ex_async(
        self,
        request: baasdt_models.CreateIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
        Summary: 数字商品服务-IP授权服务-账户创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def freeze_ip_account(
        self,
        request: baasdt_models.FreezeIpAccountRequest,
    ) -> baasdt_models.FreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.freeze_ip_account_ex(request, headers, runtime)

    async def freeze_ip_account_async(
        self,
        request: baasdt_models.FreezeIpAccountRequest,
    ) -> baasdt_models.FreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户冻结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.freeze_ip_account_ex_async(request, headers, runtime)

    def freeze_ip_account_ex(
        self,
        request: baasdt_models.FreezeIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.FreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户冻结
        """
        UtilClient.validate_model(request)
        return baasdt_models.FreezeIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def freeze_ip_account_ex_async(
        self,
        request: baasdt_models.FreezeIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.FreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户冻结
        """
        UtilClient.validate_model(request)
        return baasdt_models.FreezeIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.freeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unfreeze_ip_account(
        self,
        request: baasdt_models.UnfreezeIpAccountRequest,
    ) -> baasdt_models.UnfreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户解冻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unfreeze_ip_account_ex(request, headers, runtime)

    async def unfreeze_ip_account_async(
        self,
        request: baasdt_models.UnfreezeIpAccountRequest,
    ) -> baasdt_models.UnfreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户解冻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unfreeze_ip_account_ex_async(request, headers, runtime)

    def unfreeze_ip_account_ex(
        self,
        request: baasdt_models.UnfreezeIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UnfreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户解冻
        """
        UtilClient.validate_model(request)
        return baasdt_models.UnfreezeIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unfreeze_ip_account_ex_async(
        self,
        request: baasdt_models.UnfreezeIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UnfreezeIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
        Summary: 数字商品服务-IP授权服务-账户解冻
        """
        UtilClient.validate_model(request)
        return baasdt_models.UnfreezeIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.unfreeze', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_account(
        self,
        request: baasdt_models.QueryIpAccountRequest,
    ) -> baasdt_models.QueryIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户查询。
        Summary: 数字商品服务-IP授权服务-账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_account_ex(request, headers, runtime)

    async def query_ip_account_async(
        self,
        request: baasdt_models.QueryIpAccountRequest,
    ) -> baasdt_models.QueryIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户查询。
        Summary: 数字商品服务-IP授权服务-账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_account_ex_async(request, headers, runtime)

    def query_ip_account_ex(
        self,
        request: baasdt_models.QueryIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户查询。
        Summary: 数字商品服务-IP授权服务-账户查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_account_ex_async(
        self,
        request: baasdt_models.QueryIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpAccountResponse:
        """
        Description: IP授权交易服务: IP采购商和版权方的账户查询。
        Summary: 数字商品服务-IP授权服务-账户查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_ip_account(
        self,
        request: baasdt_models.ApplyIpAccountRequest,
    ) -> baasdt_models.ApplyIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
        Summary: 数字商品服务-IP授权服务-版权方申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_ip_account_ex(request, headers, runtime)

    async def apply_ip_account_async(
        self,
        request: baasdt_models.ApplyIpAccountRequest,
    ) -> baasdt_models.ApplyIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
        Summary: 数字商品服务-IP授权服务-版权方申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_ip_account_ex_async(request, headers, runtime)

    def apply_ip_account_ex(
        self,
        request: baasdt_models.ApplyIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
        Summary: 数字商品服务-IP授权服务-版权方申请
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_ip_account_ex_async(
        self,
        request: baasdt_models.ApplyIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
        Summary: 数字商品服务-IP授权服务-版权方申请
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_ip_account(
        self,
        request: baasdt_models.CheckIpAccountRequest,
    ) -> baasdt_models.CheckIpAccountResponse:
        """
        Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
        Summary: 数字商品服务-IP授权服务-查申请进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_ip_account_ex(request, headers, runtime)

    async def check_ip_account_async(
        self,
        request: baasdt_models.CheckIpAccountRequest,
    ) -> baasdt_models.CheckIpAccountResponse:
        """
        Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
        Summary: 数字商品服务-IP授权服务-查申请进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_ip_account_ex_async(request, headers, runtime)

    def check_ip_account_ex(
        self,
        request: baasdt_models.CheckIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CheckIpAccountResponse:
        """
        Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
        Summary: 数字商品服务-IP授权服务-查申请进度
        """
        UtilClient.validate_model(request)
        return baasdt_models.CheckIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_ip_account_ex_async(
        self,
        request: baasdt_models.CheckIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CheckIpAccountResponse:
        """
        Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
        Summary: 数字商品服务-IP授权服务-查申请进度
        """
        UtilClient.validate_model(request)
        return baasdt_models.CheckIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_goods(
        self,
        request: baasdt_models.ConfirmIpGoodsRequest,
    ) -> baasdt_models.ConfirmIpGoodsResponse:
        """
        Description: ip商品审批
        Summary: 数字商品服务-IP授权服务-ip创建审批
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_goods_ex(request, headers, runtime)

    async def confirm_ip_goods_async(
        self,
        request: baasdt_models.ConfirmIpGoodsRequest,
    ) -> baasdt_models.ConfirmIpGoodsResponse:
        """
        Description: ip商品审批
        Summary: 数字商品服务-IP授权服务-ip创建审批
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_goods_ex_async(request, headers, runtime)

    def confirm_ip_goods_ex(
        self,
        request: baasdt_models.ConfirmIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpGoodsResponse:
        """
        Description: ip商品审批
        Summary: 数字商品服务-IP授权服务-ip创建审批
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goods.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_goods_ex_async(
        self,
        request: baasdt_models.ConfirmIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpGoodsResponse:
        """
        Description: ip商品审批
        Summary: 数字商品服务-IP授权服务-ip创建审批
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goods.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_approval(
        self,
        request: baasdt_models.BatchqueryIpApprovalRequest,
    ) -> baasdt_models.BatchqueryIpApprovalResponse:
        """
        Description: ip信息批量查询--给运营使用
        查询审批信息
        Summary: 数字商品服务-IP授权服务-审批信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_approval_ex(request, headers, runtime)

    async def batchquery_ip_approval_async(
        self,
        request: baasdt_models.BatchqueryIpApprovalRequest,
    ) -> baasdt_models.BatchqueryIpApprovalResponse:
        """
        Description: ip信息批量查询--给运营使用
        查询审批信息
        Summary: 数字商品服务-IP授权服务-审批信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_approval_ex_async(request, headers, runtime)

    def batchquery_ip_approval_ex(
        self,
        request: baasdt_models.BatchqueryIpApprovalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpApprovalResponse:
        """
        Description: ip信息批量查询--给运营使用
        查询审批信息
        Summary: 数字商品服务-IP授权服务-审批信息查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpApprovalResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.approval.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_approval_ex_async(
        self,
        request: baasdt_models.BatchqueryIpApprovalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpApprovalResponse:
        """
        Description: ip信息批量查询--给运营使用
        查询审批信息
        Summary: 数字商品服务-IP授权服务-审批信息查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpApprovalResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.approval.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_account(
        self,
        request: baasdt_models.ConfirmIpAccountRequest,
    ) -> baasdt_models.ConfirmIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核确认
        Summary: 数字商品服务-IP授权服务-运营审核确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_account_ex(request, headers, runtime)

    async def confirm_ip_account_async(
        self,
        request: baasdt_models.ConfirmIpAccountRequest,
    ) -> baasdt_models.ConfirmIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核确认
        Summary: 数字商品服务-IP授权服务-运营审核确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_account_ex_async(request, headers, runtime)

    def confirm_ip_account_ex(
        self,
        request: baasdt_models.ConfirmIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核确认
        Summary: 数字商品服务-IP授权服务-运营审核确认
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_account_ex_async(
        self,
        request: baasdt_models.ConfirmIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核确认
        Summary: 数字商品服务-IP授权服务-运营审核确认
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_ip_account(
        self,
        request: baasdt_models.RefuseIpAccountRequest,
    ) -> baasdt_models.RefuseIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核拒绝
        Summary: 数字商品服务-IP授权服务-运营审核拒绝
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_ip_account_ex(request, headers, runtime)

    async def refuse_ip_account_async(
        self,
        request: baasdt_models.RefuseIpAccountRequest,
    ) -> baasdt_models.RefuseIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核拒绝
        Summary: 数字商品服务-IP授权服务-运营审核拒绝
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_ip_account_ex_async(request, headers, runtime)

    def refuse_ip_account_ex(
        self,
        request: baasdt_models.RefuseIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RefuseIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核拒绝
        Summary: 数字商品服务-IP授权服务-运营审核拒绝
        """
        UtilClient.validate_model(request)
        return baasdt_models.RefuseIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_ip_account_ex_async(
        self,
        request: baasdt_models.RefuseIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RefuseIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-运营审核拒绝
        Summary: 数字商品服务-IP授权服务-运营审核拒绝
        """
        UtilClient.validate_model(request)
        return baasdt_models.RefuseIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_ip_account(
        self,
        request: baasdt_models.PullIpAccountRequest,
    ) -> baasdt_models.PullIpAccountResponse:
        """
        Description: 版权方进件信息的单个查询
        Summary: 数字商品服务-IP授权服务-申请信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_ip_account_ex(request, headers, runtime)

    async def pull_ip_account_async(
        self,
        request: baasdt_models.PullIpAccountRequest,
    ) -> baasdt_models.PullIpAccountResponse:
        """
        Description: 版权方进件信息的单个查询
        Summary: 数字商品服务-IP授权服务-申请信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_ip_account_ex_async(request, headers, runtime)

    def pull_ip_account_ex(
        self,
        request: baasdt_models.PullIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PullIpAccountResponse:
        """
        Description: 版权方进件信息的单个查询
        Summary: 数字商品服务-IP授权服务-申请信息查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.PullIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_ip_account_ex_async(
        self,
        request: baasdt_models.PullIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PullIpAccountResponse:
        """
        Description: 版权方进件信息的单个查询
        Summary: 数字商品服务-IP授权服务-申请信息查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.PullIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_mcc(
        self,
        request: baasdt_models.QueryIpMccRequest,
    ) -> baasdt_models.QueryIpMccResponse:
        """
        Description: 数字商品服务-IP授权服务-MCC列表查询
        Summary: 数字商品服务-IP授权服务-MCC查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_mcc_ex(request, headers, runtime)

    async def query_ip_mcc_async(
        self,
        request: baasdt_models.QueryIpMccRequest,
    ) -> baasdt_models.QueryIpMccResponse:
        """
        Description: 数字商品服务-IP授权服务-MCC列表查询
        Summary: 数字商品服务-IP授权服务-MCC查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_mcc_ex_async(request, headers, runtime)

    def query_ip_mcc_ex(
        self,
        request: baasdt_models.QueryIpMccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpMccResponse:
        """
        Description: 数字商品服务-IP授权服务-MCC列表查询
        Summary: 数字商品服务-IP授权服务-MCC查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpMccResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.mcc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_mcc_ex_async(
        self,
        request: baasdt_models.QueryIpMccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpMccResponse:
        """
        Description: 数字商品服务-IP授权服务-MCC列表查询
        Summary: 数字商品服务-IP授权服务-MCC查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpMccResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.mcc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_type(
        self,
        request: baasdt_models.QueryIpTypeRequest,
    ) -> baasdt_models.QueryIpTypeResponse:
        """
        Description: 查询ip type和受众人群
        Summary: 数字商品服务-IP授权服务-IP标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_type_ex(request, headers, runtime)

    async def query_ip_type_async(
        self,
        request: baasdt_models.QueryIpTypeRequest,
    ) -> baasdt_models.QueryIpTypeResponse:
        """
        Description: 查询ip type和受众人群
        Summary: 数字商品服务-IP授权服务-IP标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_type_ex_async(request, headers, runtime)

    def query_ip_type_ex(
        self,
        request: baasdt_models.QueryIpTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpTypeResponse:
        """
        Description: 查询ip type和受众人群
        Summary: 数字商品服务-IP授权服务-IP标签查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpTypeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.type.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_type_ex_async(
        self,
        request: baasdt_models.QueryIpTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpTypeResponse:
        """
        Description: 查询ip type和受众人群
        Summary: 数字商品服务-IP授权服务-IP标签查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpTypeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.type.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_approvalandchannel(
        self,
        request: baasdt_models.BatchqueryIpApprovalandchannelRequest,
    ) -> baasdt_models.BatchqueryIpApprovalandchannelResponse:
        """
        Description: ip审批信息批量查询（带上渠道信息）
        Summary: 数字商品服务-IP授权服务-审批批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_approvalandchannel_ex(request, headers, runtime)

    async def batchquery_ip_approvalandchannel_async(
        self,
        request: baasdt_models.BatchqueryIpApprovalandchannelRequest,
    ) -> baasdt_models.BatchqueryIpApprovalandchannelResponse:
        """
        Description: ip审批信息批量查询（带上渠道信息）
        Summary: 数字商品服务-IP授权服务-审批批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_approvalandchannel_ex_async(request, headers, runtime)

    def batchquery_ip_approvalandchannel_ex(
        self,
        request: baasdt_models.BatchqueryIpApprovalandchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpApprovalandchannelResponse:
        """
        Description: ip审批信息批量查询（带上渠道信息）
        Summary: 数字商品服务-IP授权服务-审批批量查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpApprovalandchannelResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.approvalandchannel.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_approvalandchannel_ex_async(
        self,
        request: baasdt_models.BatchqueryIpApprovalandchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpApprovalandchannelResponse:
        """
        Description: ip审批信息批量查询（带上渠道信息）
        Summary: 数字商品服务-IP授权服务-审批批量查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpApprovalandchannelResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.approvalandchannel.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_account(
        self,
        request: baasdt_models.BatchqueryIpAccountRequest,
    ) -> baasdt_models.BatchqueryIpAccountResponse:
        """
        Description: 版权方进件信息的批量查询
        Summary: 数字商品服务-IP授权服务-查询商家信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_account_ex(request, headers, runtime)

    async def batchquery_ip_account_async(
        self,
        request: baasdt_models.BatchqueryIpAccountRequest,
    ) -> baasdt_models.BatchqueryIpAccountResponse:
        """
        Description: 版权方进件信息的批量查询
        Summary: 数字商品服务-IP授权服务-查询商家信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_account_ex_async(request, headers, runtime)

    def batchquery_ip_account_ex(
        self,
        request: baasdt_models.BatchqueryIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpAccountResponse:
        """
        Description: 版权方进件信息的批量查询
        Summary: 数字商品服务-IP授权服务-查询商家信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_account_ex_async(
        self,
        request: baasdt_models.BatchqueryIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpAccountResponse:
        """
        Description: 版权方进件信息的批量查询
        Summary: 数字商品服务-IP授权服务-查询商家信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_seller(
        self,
        request: baasdt_models.BatchqueryIpSellerRequest,
    ) -> baasdt_models.BatchqueryIpSellerResponse:
        """
        Description: 账户列表查询
        Summary: 数字商品服务-IP授权服务-查账户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_seller_ex(request, headers, runtime)

    async def batchquery_ip_seller_async(
        self,
        request: baasdt_models.BatchqueryIpSellerRequest,
    ) -> baasdt_models.BatchqueryIpSellerResponse:
        """
        Description: 账户列表查询
        Summary: 数字商品服务-IP授权服务-查账户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_seller_ex_async(request, headers, runtime)

    def batchquery_ip_seller_ex(
        self,
        request: baasdt_models.BatchqueryIpSellerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpSellerResponse:
        """
        Description: 账户列表查询
        Summary: 数字商品服务-IP授权服务-查账户列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpSellerResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.seller.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_seller_ex_async(
        self,
        request: baasdt_models.BatchqueryIpSellerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpSellerResponse:
        """
        Description: 账户列表查询
        Summary: 数字商品服务-IP授权服务-查账户列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpSellerResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.seller.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_ip_code(
        self,
        request: baasdt_models.ApplyIpCodeRequest,
    ) -> baasdt_models.ApplyIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码申请
        Summary: 数字商品服务-IP授权服务-正版码申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_ip_code_ex(request, headers, runtime)

    async def apply_ip_code_async(
        self,
        request: baasdt_models.ApplyIpCodeRequest,
    ) -> baasdt_models.ApplyIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码申请
        Summary: 数字商品服务-IP授权服务-正版码申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_ip_code_ex_async(request, headers, runtime)

    def apply_ip_code_ex(
        self,
        request: baasdt_models.ApplyIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码申请
        Summary: 数字商品服务-IP授权服务-正版码申请
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_ip_code_ex_async(
        self,
        request: baasdt_models.ApplyIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码申请
        Summary: 数字商品服务-IP授权服务-正版码申请
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_code(
        self,
        request: baasdt_models.PagequeryIpCodeRequest,
    ) -> baasdt_models.PagequeryIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码分页查询: 小程序不可扫描的正版码分页查询。
        注意: 这个接口查到的为小程序不可扫描的码, 是原始编码!!!
        Summary: 数字商品服务-IP授权服务-正版码查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_code_ex(request, headers, runtime)

    async def pagequery_ip_code_async(
        self,
        request: baasdt_models.PagequeryIpCodeRequest,
    ) -> baasdt_models.PagequeryIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码分页查询: 小程序不可扫描的正版码分页查询。
        注意: 这个接口查到的为小程序不可扫描的码, 是原始编码!!!
        Summary: 数字商品服务-IP授权服务-正版码查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_code_ex_async(request, headers, runtime)

    def pagequery_ip_code_ex(
        self,
        request: baasdt_models.PagequeryIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码分页查询: 小程序不可扫描的正版码分页查询。
        注意: 这个接口查到的为小程序不可扫描的码, 是原始编码!!!
        Summary: 数字商品服务-IP授权服务-正版码查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_code_ex_async(
        self,
        request: baasdt_models.PagequeryIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码分页查询: 小程序不可扫描的正版码分页查询。
        注意: 这个接口查到的为小程序不可扫描的码, 是原始编码!!!
        Summary: 数字商品服务-IP授权服务-正版码查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_ip_code(
        self,
        request: baasdt_models.CheckIpCodeRequest,
    ) -> baasdt_models.CheckIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码校验
        Summary: 数字商品服务-IP授权服务-正版码校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_ip_code_ex(request, headers, runtime)

    async def check_ip_code_async(
        self,
        request: baasdt_models.CheckIpCodeRequest,
    ) -> baasdt_models.CheckIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码校验
        Summary: 数字商品服务-IP授权服务-正版码校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_ip_code_ex_async(request, headers, runtime)

    def check_ip_code_ex(
        self,
        request: baasdt_models.CheckIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CheckIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码校验
        Summary: 数字商品服务-IP授权服务-正版码校验
        """
        UtilClient.validate_model(request)
        return baasdt_models.CheckIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_ip_code_ex_async(
        self,
        request: baasdt_models.CheckIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CheckIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-正版码校验
        Summary: 数字商品服务-IP授权服务-正版码校验
        """
        UtilClient.validate_model(request)
        return baasdt_models.CheckIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_updateapproval(
        self,
        request: baasdt_models.ConfirmIpUpdateapprovalRequest,
    ) -> baasdt_models.ConfirmIpUpdateapprovalResponse:
        """
        Description: 对商品的更新进行审核
        Summary: 数字商品服务-IP授权服务-IP更新审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_updateapproval_ex(request, headers, runtime)

    async def confirm_ip_updateapproval_async(
        self,
        request: baasdt_models.ConfirmIpUpdateapprovalRequest,
    ) -> baasdt_models.ConfirmIpUpdateapprovalResponse:
        """
        Description: 对商品的更新进行审核
        Summary: 数字商品服务-IP授权服务-IP更新审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_updateapproval_ex_async(request, headers, runtime)

    def confirm_ip_updateapproval_ex(
        self,
        request: baasdt_models.ConfirmIpUpdateapprovalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpUpdateapprovalResponse:
        """
        Description: 对商品的更新进行审核
        Summary: 数字商品服务-IP授权服务-IP更新审核
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpUpdateapprovalResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.updateapproval.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_updateapproval_ex_async(
        self,
        request: baasdt_models.ConfirmIpUpdateapprovalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpUpdateapprovalResponse:
        """
        Description: 对商品的更新进行审核
        Summary: 数字商品服务-IP授权服务-IP更新审核
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpUpdateapprovalResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.updateapproval.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_sku(
        self,
        request: baasdt_models.SetIpSkuRequest,
    ) -> baasdt_models.SetIpSkuResponse:
        """
        Description: ip商品sku信息设置
        Summary: 数字商品服务-IP授权服务-sku设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_sku_ex(request, headers, runtime)

    async def set_ip_sku_async(
        self,
        request: baasdt_models.SetIpSkuRequest,
    ) -> baasdt_models.SetIpSkuResponse:
        """
        Description: ip商品sku信息设置
        Summary: 数字商品服务-IP授权服务-sku设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_sku_ex_async(request, headers, runtime)

    def set_ip_sku_ex(
        self,
        request: baasdt_models.SetIpSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpSkuResponse:
        """
        Description: ip商品sku信息设置
        Summary: 数字商品服务-IP授权服务-sku设置
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpSkuResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.sku.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_sku_ex_async(
        self,
        request: baasdt_models.SetIpSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpSkuResponse:
        """
        Description: ip商品sku信息设置
        Summary: 数字商品服务-IP授权服务-sku设置
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpSkuResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.sku.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_goodsupdate(
        self,
        request: baasdt_models.QueryIpGoodsupdateRequest,
    ) -> baasdt_models.QueryIpGoodsupdateResponse:
        """
        Description: 查询商品基础信息的更新数据
        Summary: 数字商品服务-IP授权服务-查询更新数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_goodsupdate_ex(request, headers, runtime)

    async def query_ip_goodsupdate_async(
        self,
        request: baasdt_models.QueryIpGoodsupdateRequest,
    ) -> baasdt_models.QueryIpGoodsupdateResponse:
        """
        Description: 查询商品基础信息的更新数据
        Summary: 数字商品服务-IP授权服务-查询更新数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_goodsupdate_ex_async(request, headers, runtime)

    def query_ip_goodsupdate_ex(
        self,
        request: baasdt_models.QueryIpGoodsupdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpGoodsupdateResponse:
        """
        Description: 查询商品基础信息的更新数据
        Summary: 数字商品服务-IP授权服务-查询更新数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpGoodsupdateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goodsupdate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_goodsupdate_ex_async(
        self,
        request: baasdt_models.QueryIpGoodsupdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpGoodsupdateResponse:
        """
        Description: 查询商品基础信息的更新数据
        Summary: 数字商品服务-IP授权服务-查询更新数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpGoodsupdateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goodsupdate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_bill(
        self,
        request: baasdt_models.PagequeryIpBillRequest,
    ) -> baasdt_models.PagequeryIpBillResponse:
        """
        Description: 查询账单信息，分页查询
        Summary: 数字商品服务-IP授权服务-查询账单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_bill_ex(request, headers, runtime)

    async def pagequery_ip_bill_async(
        self,
        request: baasdt_models.PagequeryIpBillRequest,
    ) -> baasdt_models.PagequeryIpBillResponse:
        """
        Description: 查询账单信息，分页查询
        Summary: 数字商品服务-IP授权服务-查询账单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_bill_ex_async(request, headers, runtime)

    def pagequery_ip_bill_ex(
        self,
        request: baasdt_models.PagequeryIpBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpBillResponse:
        """
        Description: 查询账单信息，分页查询
        Summary: 数字商品服务-IP授权服务-查询账单列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpBillResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.bill.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_bill_ex_async(
        self,
        request: baasdt_models.PagequeryIpBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpBillResponse:
        """
        Description: 查询账单信息，分页查询
        Summary: 数字商品服务-IP授权服务-查询账单列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpBillResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.bill.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_skuconfig(
        self,
        request: baasdt_models.QueryIpSkuconfigRequest,
    ) -> baasdt_models.QueryIpSkuconfigResponse:
        """
        Description: ip商品某个渠道默认sku查询
        Summary: 数字商品服务-IP授权服务-sku查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_skuconfig_ex(request, headers, runtime)

    async def query_ip_skuconfig_async(
        self,
        request: baasdt_models.QueryIpSkuconfigRequest,
    ) -> baasdt_models.QueryIpSkuconfigResponse:
        """
        Description: ip商品某个渠道默认sku查询
        Summary: 数字商品服务-IP授权服务-sku查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_skuconfig_ex_async(request, headers, runtime)

    def query_ip_skuconfig_ex(
        self,
        request: baasdt_models.QueryIpSkuconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpSkuconfigResponse:
        """
        Description: ip商品某个渠道默认sku查询
        Summary: 数字商品服务-IP授权服务-sku查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpSkuconfigResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.skuconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_skuconfig_ex_async(
        self,
        request: baasdt_models.QueryIpSkuconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpSkuconfigResponse:
        """
        Description: ip商品某个渠道默认sku查询
        Summary: 数字商品服务-IP授权服务-sku查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpSkuconfigResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.skuconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_ip_account(
        self,
        request: baasdt_models.ImportIpAccountRequest,
    ) -> baasdt_models.ImportIpAccountResponse:
        """
        Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
        Summary: 数字商品服务-IP授权服务-版权方导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_ip_account_ex(request, headers, runtime)

    async def import_ip_account_async(
        self,
        request: baasdt_models.ImportIpAccountRequest,
    ) -> baasdt_models.ImportIpAccountResponse:
        """
        Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
        Summary: 数字商品服务-IP授权服务-版权方导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_ip_account_ex_async(request, headers, runtime)

    def import_ip_account_ex(
        self,
        request: baasdt_models.ImportIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ImportIpAccountResponse:
        """
        Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
        Summary: 数字商品服务-IP授权服务-版权方导入
        """
        UtilClient.validate_model(request)
        return baasdt_models.ImportIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_ip_account_ex_async(
        self,
        request: baasdt_models.ImportIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ImportIpAccountResponse:
        """
        Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
        Summary: 数字商品服务-IP授权服务-版权方导入
        """
        UtilClient.validate_model(request)
        return baasdt_models.ImportIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_ip_sku(
        self,
        request: baasdt_models.RemoveIpSkuRequest,
    ) -> baasdt_models.RemoveIpSkuResponse:
        """
        Description: 商品特定渠道的sku信息清空
        Summary: 数字商品服务-IP授权服务-sku清空
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_ip_sku_ex(request, headers, runtime)

    async def remove_ip_sku_async(
        self,
        request: baasdt_models.RemoveIpSkuRequest,
    ) -> baasdt_models.RemoveIpSkuResponse:
        """
        Description: 商品特定渠道的sku信息清空
        Summary: 数字商品服务-IP授权服务-sku清空
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_ip_sku_ex_async(request, headers, runtime)

    def remove_ip_sku_ex(
        self,
        request: baasdt_models.RemoveIpSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveIpSkuResponse:
        """
        Description: 商品特定渠道的sku信息清空
        Summary: 数字商品服务-IP授权服务-sku清空
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveIpSkuResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.sku.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_ip_sku_ex_async(
        self,
        request: baasdt_models.RemoveIpSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveIpSkuResponse:
        """
        Description: 商品特定渠道的sku信息清空
        Summary: 数字商品服务-IP授权服务-sku清空
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveIpSkuResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.sku.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ip_superviseapprove(
        self,
        request: baasdt_models.CreateIpSuperviseapproveRequest,
    ) -> baasdt_models.CreateIpSuperviseapproveResponse:
        """
        Description: 创建监修报审
        Summary: 数字商品服务-IP授权服务-创建监修报审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ip_superviseapprove_ex(request, headers, runtime)

    async def create_ip_superviseapprove_async(
        self,
        request: baasdt_models.CreateIpSuperviseapproveRequest,
    ) -> baasdt_models.CreateIpSuperviseapproveResponse:
        """
        Description: 创建监修报审
        Summary: 数字商品服务-IP授权服务-创建监修报审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ip_superviseapprove_ex_async(request, headers, runtime)

    def create_ip_superviseapprove_ex(
        self,
        request: baasdt_models.CreateIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpSuperviseapproveResponse:
        """
        Description: 创建监修报审
        Summary: 数字商品服务-IP授权服务-创建监修报审
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpSuperviseapproveResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.superviseapprove.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ip_superviseapprove_ex_async(
        self,
        request: baasdt_models.CreateIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpSuperviseapproveResponse:
        """
        Description: 创建监修报审
        Summary: 数字商品服务-IP授权服务-创建监修报审
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpSuperviseapproveResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.superviseapprove.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_superviseapprove(
        self,
        request: baasdt_models.ConfirmIpSuperviseapproveRequest,
    ) -> baasdt_models.ConfirmIpSuperviseapproveResponse:
        """
        Description: 监修报审审批
        Summary: 数字商品服务-IP授权服务-监修报审审批
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_superviseapprove_ex(request, headers, runtime)

    async def confirm_ip_superviseapprove_async(
        self,
        request: baasdt_models.ConfirmIpSuperviseapproveRequest,
    ) -> baasdt_models.ConfirmIpSuperviseapproveResponse:
        """
        Description: 监修报审审批
        Summary: 数字商品服务-IP授权服务-监修报审审批
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_superviseapprove_ex_async(request, headers, runtime)

    def confirm_ip_superviseapprove_ex(
        self,
        request: baasdt_models.ConfirmIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpSuperviseapproveResponse:
        """
        Description: 监修报审审批
        Summary: 数字商品服务-IP授权服务-监修报审审批
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpSuperviseapproveResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.superviseapprove.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_superviseapprove_ex_async(
        self,
        request: baasdt_models.ConfirmIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpSuperviseapproveResponse:
        """
        Description: 监修报审审批
        Summary: 数字商品服务-IP授权服务-监修报审审批
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpSuperviseapproveResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.superviseapprove.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_ip_superviseapprove(
        self,
        request: baasdt_models.PushIpSuperviseapproveRequest,
    ) -> baasdt_models.PushIpSuperviseapproveResponse:
        """
        Description: 监修报审进度推进/重置
        Summary: 数字商品服务-IP授权服务-推进监修报审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_ip_superviseapprove_ex(request, headers, runtime)

    async def push_ip_superviseapprove_async(
        self,
        request: baasdt_models.PushIpSuperviseapproveRequest,
    ) -> baasdt_models.PushIpSuperviseapproveResponse:
        """
        Description: 监修报审进度推进/重置
        Summary: 数字商品服务-IP授权服务-推进监修报审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_ip_superviseapprove_ex_async(request, headers, runtime)

    def push_ip_superviseapprove_ex(
        self,
        request: baasdt_models.PushIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PushIpSuperviseapproveResponse:
        """
        Description: 监修报审进度推进/重置
        Summary: 数字商品服务-IP授权服务-推进监修报审
        """
        UtilClient.validate_model(request)
        return baasdt_models.PushIpSuperviseapproveResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.superviseapprove.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_ip_superviseapprove_ex_async(
        self,
        request: baasdt_models.PushIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PushIpSuperviseapproveResponse:
        """
        Description: 监修报审进度推进/重置
        Summary: 数字商品服务-IP授权服务-推进监修报审
        """
        UtilClient.validate_model(request)
        return baasdt_models.PushIpSuperviseapproveResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.superviseapprove.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_superviseapprove(
        self,
        request: baasdt_models.QueryIpSuperviseapproveRequest,
    ) -> baasdt_models.QueryIpSuperviseapproveResponse:
        """
        Description: 数字商品-IP授权交易-查询监修报审详情
        Summary: 数字商品服务-IP授权服务-查询监修报审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_superviseapprove_ex(request, headers, runtime)

    async def query_ip_superviseapprove_async(
        self,
        request: baasdt_models.QueryIpSuperviseapproveRequest,
    ) -> baasdt_models.QueryIpSuperviseapproveResponse:
        """
        Description: 数字商品-IP授权交易-查询监修报审详情
        Summary: 数字商品服务-IP授权服务-查询监修报审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_superviseapprove_ex_async(request, headers, runtime)

    def query_ip_superviseapprove_ex(
        self,
        request: baasdt_models.QueryIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpSuperviseapproveResponse:
        """
        Description: 数字商品-IP授权交易-查询监修报审详情
        Summary: 数字商品服务-IP授权服务-查询监修报审
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpSuperviseapproveResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.superviseapprove.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_superviseapprove_ex_async(
        self,
        request: baasdt_models.QueryIpSuperviseapproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpSuperviseapproveResponse:
        """
        Description: 数字商品-IP授权交易-查询监修报审详情
        Summary: 数字商品服务-IP授权服务-查询监修报审
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpSuperviseapproveResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.superviseapprove.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_ip_code(
        self,
        request: baasdt_models.ReceiveIpCodeRequest,
    ) -> baasdt_models.ReceiveIpCodeResponse:
        """
        Description: 领取正版码，如已被领取则返回被领取人昵称信息
        Summary: 数字商品服务-IP授权服务-正版码领取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_ip_code_ex(request, headers, runtime)

    async def receive_ip_code_async(
        self,
        request: baasdt_models.ReceiveIpCodeRequest,
    ) -> baasdt_models.ReceiveIpCodeResponse:
        """
        Description: 领取正版码，如已被领取则返回被领取人昵称信息
        Summary: 数字商品服务-IP授权服务-正版码领取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_ip_code_ex_async(request, headers, runtime)

    def receive_ip_code_ex(
        self,
        request: baasdt_models.ReceiveIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReceiveIpCodeResponse:
        """
        Description: 领取正版码，如已被领取则返回被领取人昵称信息
        Summary: 数字商品服务-IP授权服务-正版码领取
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReceiveIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_ip_code_ex_async(
        self,
        request: baasdt_models.ReceiveIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReceiveIpCodeResponse:
        """
        Description: 领取正版码，如已被领取则返回被领取人昵称信息
        Summary: 数字商品服务-IP授权服务-正版码领取
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReceiveIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_codeinfo(
        self,
        request: baasdt_models.PagequeryIpCodeinfoRequest,
    ) -> baasdt_models.PagequeryIpCodeinfoResponse:
        """
        Description: 已领取或以扫描过的正版码列表，分页查询
        Summary: 数字商品服务-IP授权服务-正版码列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_codeinfo_ex(request, headers, runtime)

    async def pagequery_ip_codeinfo_async(
        self,
        request: baasdt_models.PagequeryIpCodeinfoRequest,
    ) -> baasdt_models.PagequeryIpCodeinfoResponse:
        """
        Description: 已领取或以扫描过的正版码列表，分页查询
        Summary: 数字商品服务-IP授权服务-正版码列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_codeinfo_ex_async(request, headers, runtime)

    def pagequery_ip_codeinfo_ex(
        self,
        request: baasdt_models.PagequeryIpCodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpCodeinfoResponse:
        """
        Description: 已领取或以扫描过的正版码列表，分页查询
        Summary: 数字商品服务-IP授权服务-正版码列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpCodeinfoResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.codeinfo.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_codeinfo_ex_async(
        self,
        request: baasdt_models.PagequeryIpCodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpCodeinfoResponse:
        """
        Description: 已领取或以扫描过的正版码列表，分页查询
        Summary: 数字商品服务-IP授权服务-正版码列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpCodeinfoResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.codeinfo.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ip_valueadd(
        self,
        request: baasdt_models.CreateIpValueaddRequest,
    ) -> baasdt_models.CreateIpValueaddResponse:
        """
        Description: 创建增值服务
        Summary: 数字商品服务-IP授权服务-创建增值服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ip_valueadd_ex(request, headers, runtime)

    async def create_ip_valueadd_async(
        self,
        request: baasdt_models.CreateIpValueaddRequest,
    ) -> baasdt_models.CreateIpValueaddResponse:
        """
        Description: 创建增值服务
        Summary: 数字商品服务-IP授权服务-创建增值服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ip_valueadd_ex_async(request, headers, runtime)

    def create_ip_valueadd_ex(
        self,
        request: baasdt_models.CreateIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpValueaddResponse:
        """
        Description: 创建增值服务
        Summary: 数字商品服务-IP授权服务-创建增值服务
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpValueaddResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.valueadd.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ip_valueadd_ex_async(
        self,
        request: baasdt_models.CreateIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpValueaddResponse:
        """
        Description: 创建增值服务
        Summary: 数字商品服务-IP授权服务-创建增值服务
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpValueaddResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.valueadd.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ip_valueadd(
        self,
        request: baasdt_models.UpdateIpValueaddRequest,
    ) -> baasdt_models.UpdateIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-更新增值服务
        Summary: 数字商品服务-IP授权服务-更新增值服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ip_valueadd_ex(request, headers, runtime)

    async def update_ip_valueadd_async(
        self,
        request: baasdt_models.UpdateIpValueaddRequest,
    ) -> baasdt_models.UpdateIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-更新增值服务
        Summary: 数字商品服务-IP授权服务-更新增值服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ip_valueadd_ex_async(request, headers, runtime)

    def update_ip_valueadd_ex(
        self,
        request: baasdt_models.UpdateIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-更新增值服务
        Summary: 数字商品服务-IP授权服务-更新增值服务
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpValueaddResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.valueadd.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ip_valueadd_ex_async(
        self,
        request: baasdt_models.UpdateIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-更新增值服务
        Summary: 数字商品服务-IP授权服务-更新增值服务
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpValueaddResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.valueadd.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_valueaddsku(
        self,
        request: baasdt_models.SetIpValueaddskuRequest,
    ) -> baasdt_models.SetIpValueaddskuResponse:
        """
        Description: 数字商品-IP授权-设置增值服务sku
        Summary: 数字商品服务-IP授权服务-设置增值服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_valueaddsku_ex(request, headers, runtime)

    async def set_ip_valueaddsku_async(
        self,
        request: baasdt_models.SetIpValueaddskuRequest,
    ) -> baasdt_models.SetIpValueaddskuResponse:
        """
        Description: 数字商品-IP授权-设置增值服务sku
        Summary: 数字商品服务-IP授权服务-设置增值服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_valueaddsku_ex_async(request, headers, runtime)

    def set_ip_valueaddsku_ex(
        self,
        request: baasdt_models.SetIpValueaddskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpValueaddskuResponse:
        """
        Description: 数字商品-IP授权-设置增值服务sku
        Summary: 数字商品服务-IP授权服务-设置增值服务
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpValueaddskuResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.valueaddsku.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_valueaddsku_ex_async(
        self,
        request: baasdt_models.SetIpValueaddskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpValueaddskuResponse:
        """
        Description: 数字商品-IP授权-设置增值服务sku
        Summary: 数字商品服务-IP授权服务-设置增值服务
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpValueaddskuResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.valueaddsku.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_ip_valueadd(
        self,
        request: baasdt_models.OnlineIpValueaddRequest,
    ) -> baasdt_models.OnlineIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-增值服务上下架操作
        Summary: 数字商品服务-IP授权服务-服务上下架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_ip_valueadd_ex(request, headers, runtime)

    async def online_ip_valueadd_async(
        self,
        request: baasdt_models.OnlineIpValueaddRequest,
    ) -> baasdt_models.OnlineIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-增值服务上下架操作
        Summary: 数字商品服务-IP授权服务-服务上下架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_ip_valueadd_ex_async(request, headers, runtime)

    def online_ip_valueadd_ex(
        self,
        request: baasdt_models.OnlineIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OnlineIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-增值服务上下架操作
        Summary: 数字商品服务-IP授权服务-服务上下架
        """
        UtilClient.validate_model(request)
        return baasdt_models.OnlineIpValueaddResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.valueadd.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_ip_valueadd_ex_async(
        self,
        request: baasdt_models.OnlineIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.OnlineIpValueaddResponse:
        """
        Description: 数字商品服务-IP授权服务-增值服务上下架操作
        Summary: 数字商品服务-IP授权服务-服务上下架
        """
        UtilClient.validate_model(request)
        return baasdt_models.OnlineIpValueaddResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.valueadd.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_valueadd(
        self,
        request: baasdt_models.QueryIpValueaddRequest,
    ) -> baasdt_models.QueryIpValueaddResponse:
        """
        Description: 数字商品-IP授权交易-增值服务查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_valueadd_ex(request, headers, runtime)

    async def query_ip_valueadd_async(
        self,
        request: baasdt_models.QueryIpValueaddRequest,
    ) -> baasdt_models.QueryIpValueaddResponse:
        """
        Description: 数字商品-IP授权交易-增值服务查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_valueadd_ex_async(request, headers, runtime)

    def query_ip_valueadd_ex(
        self,
        request: baasdt_models.QueryIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpValueaddResponse:
        """
        Description: 数字商品-IP授权交易-增值服务查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpValueaddResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.valueadd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_valueadd_ex_async(
        self,
        request: baasdt_models.QueryIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpValueaddResponse:
        """
        Description: 数字商品-IP授权交易-增值服务查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpValueaddResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.valueadd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_valueadd(
        self,
        request: baasdt_models.PagequeryIpValueaddRequest,
    ) -> baasdt_models.PagequeryIpValueaddResponse:
        """
        Description: 增值服务批量查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_valueadd_ex(request, headers, runtime)

    async def pagequery_ip_valueadd_async(
        self,
        request: baasdt_models.PagequeryIpValueaddRequest,
    ) -> baasdt_models.PagequeryIpValueaddResponse:
        """
        Description: 增值服务批量查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_valueadd_ex_async(request, headers, runtime)

    def pagequery_ip_valueadd_ex(
        self,
        request: baasdt_models.PagequeryIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpValueaddResponse:
        """
        Description: 增值服务批量查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpValueaddResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.valueadd.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_valueadd_ex_async(
        self,
        request: baasdt_models.PagequeryIpValueaddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpValueaddResponse:
        """
        Description: 增值服务批量查询
        Summary: 数字商品服务-IP授权服务-增值服务查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpValueaddResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.valueadd.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ip_tradesales(
        self,
        request: baasdt_models.UploadIpTradesalesRequest,
    ) -> baasdt_models.UploadIpTradesalesResponse:
        """
        Description: 批量上传授权交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ip_tradesales_ex(request, headers, runtime)

    async def upload_ip_tradesales_async(
        self,
        request: baasdt_models.UploadIpTradesalesRequest,
    ) -> baasdt_models.UploadIpTradesalesResponse:
        """
        Description: 批量上传授权交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ip_tradesales_ex_async(request, headers, runtime)

    def upload_ip_tradesales_ex(
        self,
        request: baasdt_models.UploadIpTradesalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpTradesalesResponse:
        """
        Description: 批量上传授权交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpTradesalesResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.tradesales.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ip_tradesales_ex_async(
        self,
        request: baasdt_models.UploadIpTradesalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpTradesalesResponse:
        """
        Description: 批量上传授权交易的销售数据
        Summary: 数字商品服务-IP授权服务-上传销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpTradesalesResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.tradesales.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_ip_user(
        self,
        request: baasdt_models.AuthIpUserRequest,
    ) -> baasdt_models.AuthIpUserResponse:
        """
        Description: C端用户授权信息
        Summary: 数字商品服务-IP授权服务-C用户授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_ip_user_ex(request, headers, runtime)

    async def auth_ip_user_async(
        self,
        request: baasdt_models.AuthIpUserRequest,
    ) -> baasdt_models.AuthIpUserResponse:
        """
        Description: C端用户授权信息
        Summary: 数字商品服务-IP授权服务-C用户授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_ip_user_ex_async(request, headers, runtime)

    def auth_ip_user_ex(
        self,
        request: baasdt_models.AuthIpUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AuthIpUserResponse:
        """
        Description: C端用户授权信息
        Summary: 数字商品服务-IP授权服务-C用户授权
        """
        UtilClient.validate_model(request)
        return baasdt_models.AuthIpUserResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.user.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_ip_user_ex_async(
        self,
        request: baasdt_models.AuthIpUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AuthIpUserResponse:
        """
        Description: C端用户授权信息
        Summary: 数字商品服务-IP授权服务-C用户授权
        """
        UtilClient.validate_model(request)
        return baasdt_models.AuthIpUserResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.user.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_ip_goods(
        self,
        request: baasdt_models.RemoveIpGoodsRequest,
    ) -> baasdt_models.RemoveIpGoodsResponse:
        """
        Description: 数字商品服务-IP授权服务-删除ip商品
        Summary: 数字商品服务-IP授权服务-IP删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_ip_goods_ex(request, headers, runtime)

    async def remove_ip_goods_async(
        self,
        request: baasdt_models.RemoveIpGoodsRequest,
    ) -> baasdt_models.RemoveIpGoodsResponse:
        """
        Description: 数字商品服务-IP授权服务-删除ip商品
        Summary: 数字商品服务-IP授权服务-IP删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_ip_goods_ex_async(request, headers, runtime)

    def remove_ip_goods_ex(
        self,
        request: baasdt_models.RemoveIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveIpGoodsResponse:
        """
        Description: 数字商品服务-IP授权服务-删除ip商品
        Summary: 数字商品服务-IP授权服务-IP删除
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveIpGoodsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goods.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_ip_goods_ex_async(
        self,
        request: baasdt_models.RemoveIpGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.RemoveIpGoodsResponse:
        """
        Description: 数字商品服务-IP授权服务-删除ip商品
        Summary: 数字商品服务-IP授权服务-IP删除
        """
        UtilClient.validate_model(request)
        return baasdt_models.RemoveIpGoodsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goods.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_ip_num(
        self,
        request: baasdt_models.CountIpNumRequest,
    ) -> baasdt_models.CountIpNumResponse:
        """
        Description: 数字商品服务-IP授权服务-ip数量统计
        Summary: 数字商品服务-IP授权服务-ip数量统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_ip_num_ex(request, headers, runtime)

    async def count_ip_num_async(
        self,
        request: baasdt_models.CountIpNumRequest,
    ) -> baasdt_models.CountIpNumResponse:
        """
        Description: 数字商品服务-IP授权服务-ip数量统计
        Summary: 数字商品服务-IP授权服务-ip数量统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_ip_num_ex_async(request, headers, runtime)

    def count_ip_num_ex(
        self,
        request: baasdt_models.CountIpNumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CountIpNumResponse:
        """
        Description: 数字商品服务-IP授权服务-ip数量统计
        Summary: 数字商品服务-IP授权服务-ip数量统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.CountIpNumResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.num.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_ip_num_ex_async(
        self,
        request: baasdt_models.CountIpNumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CountIpNumResponse:
        """
        Description: 数字商品服务-IP授权服务-ip数量统计
        Summary: 数字商品服务-IP授权服务-ip数量统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.CountIpNumResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.num.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_ip_pv(
        self,
        request: baasdt_models.CountIpPvRequest,
    ) -> baasdt_models.CountIpPvResponse:
        """
        Description: 数字商品服务-IP授权服务-pv统计
        Summary: 数字商品服务-IP授权服务-pv统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_ip_pv_ex(request, headers, runtime)

    async def count_ip_pv_async(
        self,
        request: baasdt_models.CountIpPvRequest,
    ) -> baasdt_models.CountIpPvResponse:
        """
        Description: 数字商品服务-IP授权服务-pv统计
        Summary: 数字商品服务-IP授权服务-pv统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_ip_pv_ex_async(request, headers, runtime)

    def count_ip_pv_ex(
        self,
        request: baasdt_models.CountIpPvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CountIpPvResponse:
        """
        Description: 数字商品服务-IP授权服务-pv统计
        Summary: 数字商品服务-IP授权服务-pv统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.CountIpPvResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.pv.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_ip_pv_ex_async(
        self,
        request: baasdt_models.CountIpPvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CountIpPvResponse:
        """
        Description: 数字商品服务-IP授权服务-pv统计
        Summary: 数字商品服务-IP授权服务-pv统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.CountIpPvResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.pv.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_code(
        self,
        request: baasdt_models.QueryIpCodeRequest,
    ) -> baasdt_models.QueryIpCodeResponse:
        """
        Description: 查询正版码详细信息
        Summary: 数字商品服务-IP授权服务-查正版码详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_code_ex(request, headers, runtime)

    async def query_ip_code_async(
        self,
        request: baasdt_models.QueryIpCodeRequest,
    ) -> baasdt_models.QueryIpCodeResponse:
        """
        Description: 查询正版码详细信息
        Summary: 数字商品服务-IP授权服务-查正版码详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_code_ex_async(request, headers, runtime)

    def query_ip_code_ex(
        self,
        request: baasdt_models.QueryIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCodeResponse:
        """
        Description: 查询正版码详细信息
        Summary: 数字商品服务-IP授权服务-查正版码详情
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_code_ex_async(
        self,
        request: baasdt_models.QueryIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCodeResponse:
        """
        Description: 查询正版码详细信息
        Summary: 数字商品服务-IP授权服务-查正版码详情
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_ip_account(
        self,
        request: baasdt_models.CountIpAccountRequest,
    ) -> baasdt_models.CountIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-账户统计
        Summary: 数字商品服务-IP授权服务-账户统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_ip_account_ex(request, headers, runtime)

    async def count_ip_account_async(
        self,
        request: baasdt_models.CountIpAccountRequest,
    ) -> baasdt_models.CountIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-账户统计
        Summary: 数字商品服务-IP授权服务-账户统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_ip_account_ex_async(request, headers, runtime)

    def count_ip_account_ex(
        self,
        request: baasdt_models.CountIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CountIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-账户统计
        Summary: 数字商品服务-IP授权服务-账户统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.CountIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_ip_account_ex_async(
        self,
        request: baasdt_models.CountIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CountIpAccountResponse:
        """
        Description: 数字商品服务-IP授权服务-账户统计
        Summary: 数字商品服务-IP授权服务-账户统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.CountIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_orderstatistic(
        self,
        request: baasdt_models.QueryIpOrderstatisticRequest,
    ) -> baasdt_models.QueryIpOrderstatisticResponse:
        """
        Description: 查询渠道订单统计值
        Summary: 数字商品服务-IP授权服务-查询订单统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_orderstatistic_ex(request, headers, runtime)

    async def query_ip_orderstatistic_async(
        self,
        request: baasdt_models.QueryIpOrderstatisticRequest,
    ) -> baasdt_models.QueryIpOrderstatisticResponse:
        """
        Description: 查询渠道订单统计值
        Summary: 数字商品服务-IP授权服务-查询订单统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_orderstatistic_ex_async(request, headers, runtime)

    def query_ip_orderstatistic_ex(
        self,
        request: baasdt_models.QueryIpOrderstatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderstatisticResponse:
        """
        Description: 查询渠道订单统计值
        Summary: 数字商品服务-IP授权服务-查询订单统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderstatisticResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.orderstatistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_orderstatistic_ex_async(
        self,
        request: baasdt_models.QueryIpOrderstatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderstatisticResponse:
        """
        Description: 查询渠道订单统计值
        Summary: 数字商品服务-IP授权服务-查询订单统计
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderstatisticResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.orderstatistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ip_goodsgallery(
        self,
        request: baasdt_models.UpdateIpGoodsgalleryRequest,
    ) -> baasdt_models.UpdateIpGoodsgalleryResponse:
        """
        Description: 版权方更新IP图库
        Summary: 数字商品服务-IP授权服务-ip更新图库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ip_goodsgallery_ex(request, headers, runtime)

    async def update_ip_goodsgallery_async(
        self,
        request: baasdt_models.UpdateIpGoodsgalleryRequest,
    ) -> baasdt_models.UpdateIpGoodsgalleryResponse:
        """
        Description: 版权方更新IP图库
        Summary: 数字商品服务-IP授权服务-ip更新图库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ip_goodsgallery_ex_async(request, headers, runtime)

    def update_ip_goodsgallery_ex(
        self,
        request: baasdt_models.UpdateIpGoodsgalleryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpGoodsgalleryResponse:
        """
        Description: 版权方更新IP图库
        Summary: 数字商品服务-IP授权服务-ip更新图库
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpGoodsgalleryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goodsgallery.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ip_goodsgallery_ex_async(
        self,
        request: baasdt_models.UpdateIpGoodsgalleryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpGoodsgalleryResponse:
        """
        Description: 版权方更新IP图库
        Summary: 数字商品服务-IP授权服务-ip更新图库
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpGoodsgalleryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goodsgallery.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_goodsgallery(
        self,
        request: baasdt_models.QueryIpGoodsgalleryRequest,
    ) -> baasdt_models.QueryIpGoodsgalleryResponse:
        """
        Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
        Summary: 数字商品服务-IP授权服务-查询ip图库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_goodsgallery_ex(request, headers, runtime)

    async def query_ip_goodsgallery_async(
        self,
        request: baasdt_models.QueryIpGoodsgalleryRequest,
    ) -> baasdt_models.QueryIpGoodsgalleryResponse:
        """
        Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
        Summary: 数字商品服务-IP授权服务-查询ip图库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_goodsgallery_ex_async(request, headers, runtime)

    def query_ip_goodsgallery_ex(
        self,
        request: baasdt_models.QueryIpGoodsgalleryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpGoodsgalleryResponse:
        """
        Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
        Summary: 数字商品服务-IP授权服务-查询ip图库
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpGoodsgalleryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goodsgallery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_goodsgallery_ex_async(
        self,
        request: baasdt_models.QueryIpGoodsgalleryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpGoodsgalleryResponse:
        """
        Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
        Summary: 数字商品服务-IP授权服务-查询ip图库
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpGoodsgalleryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goodsgallery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_codeinfo(
        self,
        request: baasdt_models.SetIpCodeinfoRequest,
    ) -> baasdt_models.SetIpCodeinfoResponse:
        """
        Description: 配置正版码的商品信息和资源位信息
        Summary: 数字商品服务-IP授权服务-正版码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_codeinfo_ex(request, headers, runtime)

    async def set_ip_codeinfo_async(
        self,
        request: baasdt_models.SetIpCodeinfoRequest,
    ) -> baasdt_models.SetIpCodeinfoResponse:
        """
        Description: 配置正版码的商品信息和资源位信息
        Summary: 数字商品服务-IP授权服务-正版码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_codeinfo_ex_async(request, headers, runtime)

    def set_ip_codeinfo_ex(
        self,
        request: baasdt_models.SetIpCodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpCodeinfoResponse:
        """
        Description: 配置正版码的商品信息和资源位信息
        Summary: 数字商品服务-IP授权服务-正版码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpCodeinfoResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.codeinfo.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_codeinfo_ex_async(
        self,
        request: baasdt_models.SetIpCodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpCodeinfoResponse:
        """
        Description: 配置正版码的商品信息和资源位信息
        Summary: 数字商品服务-IP授权服务-正版码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpCodeinfoResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.codeinfo.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_galleryinstruction(
        self,
        request: baasdt_models.PagequeryIpGalleryinstructionRequest,
    ) -> baasdt_models.PagequeryIpGalleryinstructionResponse:
        """
        Description: 查询订单的图库下载记录
        Summary: 数字商品服务-IP授权服务-查询图库记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_galleryinstruction_ex(request, headers, runtime)

    async def pagequery_ip_galleryinstruction_async(
        self,
        request: baasdt_models.PagequeryIpGalleryinstructionRequest,
    ) -> baasdt_models.PagequeryIpGalleryinstructionResponse:
        """
        Description: 查询订单的图库下载记录
        Summary: 数字商品服务-IP授权服务-查询图库记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_galleryinstruction_ex_async(request, headers, runtime)

    def pagequery_ip_galleryinstruction_ex(
        self,
        request: baasdt_models.PagequeryIpGalleryinstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpGalleryinstructionResponse:
        """
        Description: 查询订单的图库下载记录
        Summary: 数字商品服务-IP授权服务-查询图库记录
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpGalleryinstructionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.galleryinstruction.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_galleryinstruction_ex_async(
        self,
        request: baasdt_models.PagequeryIpGalleryinstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpGalleryinstructionResponse:
        """
        Description: 查询订单的图库下载记录
        Summary: 数字商品服务-IP授权服务-查询图库记录
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpGalleryinstructionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.galleryinstruction.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_ordergallery(
        self,
        request: baasdt_models.ConfirmIpOrdergalleryRequest,
    ) -> baasdt_models.ConfirmIpOrdergalleryResponse:
        """
        Description: 版权方确认订单图库信息
        Summary: 数字商品服务-IP授权服务-订单图库确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_ordergallery_ex(request, headers, runtime)

    async def confirm_ip_ordergallery_async(
        self,
        request: baasdt_models.ConfirmIpOrdergalleryRequest,
    ) -> baasdt_models.ConfirmIpOrdergalleryResponse:
        """
        Description: 版权方确认订单图库信息
        Summary: 数字商品服务-IP授权服务-订单图库确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_ordergallery_ex_async(request, headers, runtime)

    def confirm_ip_ordergallery_ex(
        self,
        request: baasdt_models.ConfirmIpOrdergalleryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpOrdergalleryResponse:
        """
        Description: 版权方确认订单图库信息
        Summary: 数字商品服务-IP授权服务-订单图库确认
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpOrdergalleryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.ordergallery.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_ordergallery_ex_async(
        self,
        request: baasdt_models.ConfirmIpOrdergalleryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpOrdergalleryResponse:
        """
        Description: 版权方确认订单图库信息
        Summary: 数字商品服务-IP授权服务-订单图库确认
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpOrdergalleryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.ordergallery.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_authtrade(
        self,
        request: baasdt_models.ConfirmIpAuthtradeRequest,
    ) -> baasdt_models.ConfirmIpAuthtradeResponse:
        """
        Description: 审批IP定向授权交易。如果订单状态是“合作待确认”，则审批后状态为“合作拒绝”或者“合作通过”。如果订单状态是”订单待审核“，则审批后状态为“审核失败”或者“申请中”。
        Summary: 数字商品服务-IP授权服务-审批定向授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_authtrade_ex(request, headers, runtime)

    async def confirm_ip_authtrade_async(
        self,
        request: baasdt_models.ConfirmIpAuthtradeRequest,
    ) -> baasdt_models.ConfirmIpAuthtradeResponse:
        """
        Description: 审批IP定向授权交易。如果订单状态是“合作待确认”，则审批后状态为“合作拒绝”或者“合作通过”。如果订单状态是”订单待审核“，则审批后状态为“审核失败”或者“申请中”。
        Summary: 数字商品服务-IP授权服务-审批定向授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_authtrade_ex_async(request, headers, runtime)

    def confirm_ip_authtrade_ex(
        self,
        request: baasdt_models.ConfirmIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpAuthtradeResponse:
        """
        Description: 审批IP定向授权交易。如果订单状态是“合作待确认”，则审批后状态为“合作拒绝”或者“合作通过”。如果订单状态是”订单待审核“，则审批后状态为“审核失败”或者“申请中”。
        Summary: 数字商品服务-IP授权服务-审批定向授权
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpAuthtradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.authtrade.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_authtrade_ex_async(
        self,
        request: baasdt_models.ConfirmIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpAuthtradeResponse:
        """
        Description: 审批IP定向授权交易。如果订单状态是“合作待确认”，则审批后状态为“合作拒绝”或者“合作通过”。如果订单状态是”订单待审核“，则审批后状态为“审核失败”或者“申请中”。
        Summary: 数字商品服务-IP授权服务-审批定向授权
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpAuthtradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.authtrade.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_packagetrade(
        self,
        request: baasdt_models.ConfirmIpPackagetradeRequest,
    ) -> baasdt_models.ConfirmIpPackagetradeResponse:
        """
        Description: 审核套餐授权申请
        Summary: 数字商品服务-IP授权服务-审批套餐授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_packagetrade_ex(request, headers, runtime)

    async def confirm_ip_packagetrade_async(
        self,
        request: baasdt_models.ConfirmIpPackagetradeRequest,
    ) -> baasdt_models.ConfirmIpPackagetradeResponse:
        """
        Description: 审核套餐授权申请
        Summary: 数字商品服务-IP授权服务-审批套餐授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_packagetrade_ex_async(request, headers, runtime)

    def confirm_ip_packagetrade_ex(
        self,
        request: baasdt_models.ConfirmIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpPackagetradeResponse:
        """
        Description: 审核套餐授权申请
        Summary: 数字商品服务-IP授权服务-审批套餐授权
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpPackagetradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.packagetrade.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_packagetrade_ex_async(
        self,
        request: baasdt_models.ConfirmIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpPackagetradeResponse:
        """
        Description: 审核套餐授权申请
        Summary: 数字商品服务-IP授权服务-审批套餐授权
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpPackagetradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.packagetrade.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_ip_packagetrade(
        self,
        request: baasdt_models.ApplyIpPackagetradeRequest,
    ) -> baasdt_models.ApplyIpPackagetradeResponse:
        """
        Description: 商家申请套餐交易
        Summary: 数字商品服务-IP授权服务-申请套餐交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_ip_packagetrade_ex(request, headers, runtime)

    async def apply_ip_packagetrade_async(
        self,
        request: baasdt_models.ApplyIpPackagetradeRequest,
    ) -> baasdt_models.ApplyIpPackagetradeResponse:
        """
        Description: 商家申请套餐交易
        Summary: 数字商品服务-IP授权服务-申请套餐交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_ip_packagetrade_ex_async(request, headers, runtime)

    def apply_ip_packagetrade_ex(
        self,
        request: baasdt_models.ApplyIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpPackagetradeResponse:
        """
        Description: 商家申请套餐交易
        Summary: 数字商品服务-IP授权服务-申请套餐交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpPackagetradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.packagetrade.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_ip_packagetrade_ex_async(
        self,
        request: baasdt_models.ApplyIpPackagetradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpPackagetradeResponse:
        """
        Description: 商家申请套餐交易
        Summary: 数字商品服务-IP授权服务-申请套餐交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpPackagetradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.packagetrade.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_ip_authtrade(
        self,
        request: baasdt_models.ApplyIpAuthtradeRequest,
    ) -> baasdt_models.ApplyIpAuthtradeResponse:
        """
        Description: 版权方申请授权交易
        Summary: 数字商品服务-IP授权服务-申请授权交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_ip_authtrade_ex(request, headers, runtime)

    async def apply_ip_authtrade_async(
        self,
        request: baasdt_models.ApplyIpAuthtradeRequest,
    ) -> baasdt_models.ApplyIpAuthtradeResponse:
        """
        Description: 版权方申请授权交易
        Summary: 数字商品服务-IP授权服务-申请授权交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_ip_authtrade_ex_async(request, headers, runtime)

    def apply_ip_authtrade_ex(
        self,
        request: baasdt_models.ApplyIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpAuthtradeResponse:
        """
        Description: 版权方申请授权交易
        Summary: 数字商品服务-IP授权服务-申请授权交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpAuthtradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.authtrade.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_ip_authtrade_ex_async(
        self,
        request: baasdt_models.ApplyIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ApplyIpAuthtradeResponse:
        """
        Description: 版权方申请授权交易
        Summary: 数字商品服务-IP授权服务-申请授权交易
        """
        UtilClient.validate_model(request)
        return baasdt_models.ApplyIpAuthtradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.authtrade.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_codeinfo(
        self,
        request: baasdt_models.QueryIpCodeinfoRequest,
    ) -> baasdt_models.QueryIpCodeinfoResponse:
        """
        Description: 查询正版码的配置信息
        Summary: 数字商品服务-IP授权服务-查正版码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_codeinfo_ex(request, headers, runtime)

    async def query_ip_codeinfo_async(
        self,
        request: baasdt_models.QueryIpCodeinfoRequest,
    ) -> baasdt_models.QueryIpCodeinfoResponse:
        """
        Description: 查询正版码的配置信息
        Summary: 数字商品服务-IP授权服务-查正版码配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_codeinfo_ex_async(request, headers, runtime)

    def query_ip_codeinfo_ex(
        self,
        request: baasdt_models.QueryIpCodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCodeinfoResponse:
        """
        Description: 查询正版码的配置信息
        Summary: 数字商品服务-IP授权服务-查正版码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCodeinfoResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.codeinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_codeinfo_ex_async(
        self,
        request: baasdt_models.QueryIpCodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCodeinfoResponse:
        """
        Description: 查询正版码的配置信息
        Summary: 数字商品服务-IP授权服务-查正版码配置
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCodeinfoResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.codeinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_approvalwithupdate(
        self,
        request: baasdt_models.BatchqueryIpApprovalwithupdateRequest,
    ) -> baasdt_models.BatchqueryIpApprovalwithupdateResponse:
        """
        Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
        Summary: ip审批信息批量查询（带上更新信息）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_approvalwithupdate_ex(request, headers, runtime)

    async def batchquery_ip_approvalwithupdate_async(
        self,
        request: baasdt_models.BatchqueryIpApprovalwithupdateRequest,
    ) -> baasdt_models.BatchqueryIpApprovalwithupdateResponse:
        """
        Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
        Summary: ip审批信息批量查询（带上更新信息）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_approvalwithupdate_ex_async(request, headers, runtime)

    def batchquery_ip_approvalwithupdate_ex(
        self,
        request: baasdt_models.BatchqueryIpApprovalwithupdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpApprovalwithupdateResponse:
        """
        Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
        Summary: ip审批信息批量查询（带上更新信息）
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpApprovalwithupdateResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.approvalwithupdate.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_approvalwithupdate_ex_async(
        self,
        request: baasdt_models.BatchqueryIpApprovalwithupdateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpApprovalwithupdateResponse:
        """
        Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
        Summary: ip审批信息批量查询（带上更新信息）
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpApprovalwithupdateResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.approvalwithupdate.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ip_account(
        self,
        request: baasdt_models.UpdateIpAccountRequest,
    ) -> baasdt_models.UpdateIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-商家账户信息补充，版权方联系人修改，仅支持版权方联系人修改
        Summary: 数字商品服务-IP授权服务-账户信息补充
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ip_account_ex(request, headers, runtime)

    async def update_ip_account_async(
        self,
        request: baasdt_models.UpdateIpAccountRequest,
    ) -> baasdt_models.UpdateIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-商家账户信息补充，版权方联系人修改，仅支持版权方联系人修改
        Summary: 数字商品服务-IP授权服务-账户信息补充
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ip_account_ex_async(request, headers, runtime)

    def update_ip_account_ex(
        self,
        request: baasdt_models.UpdateIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-商家账户信息补充，版权方联系人修改，仅支持版权方联系人修改
        Summary: 数字商品服务-IP授权服务-账户信息补充
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpAccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ip_account_ex_async(
        self,
        request: baasdt_models.UpdateIpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateIpAccountResponse:
        """
        Description: 数字商品-IP授权交易服务-商家账户信息补充，版权方联系人修改，仅支持版权方联系人修改
        Summary: 数字商品服务-IP授权服务-账户信息补充
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateIpAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_accountsettlement(
        self,
        request: baasdt_models.QueryIpAccountsettlementRequest,
    ) -> baasdt_models.QueryIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-查询账户已经入驻的渠道列表
        Summary: 数字商品服务-IP-查询账户渠道列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_accountsettlement_ex(request, headers, runtime)

    async def query_ip_accountsettlement_async(
        self,
        request: baasdt_models.QueryIpAccountsettlementRequest,
    ) -> baasdt_models.QueryIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-查询账户已经入驻的渠道列表
        Summary: 数字商品服务-IP-查询账户渠道列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_accountsettlement_ex_async(request, headers, runtime)

    def query_ip_accountsettlement_ex(
        self,
        request: baasdt_models.QueryIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-查询账户已经入驻的渠道列表
        Summary: 数字商品服务-IP-查询账户渠道列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpAccountsettlementResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.accountsettlement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_accountsettlement_ex_async(
        self,
        request: baasdt_models.QueryIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-查询账户已经入驻的渠道列表
        Summary: 数字商品服务-IP-查询账户渠道列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpAccountsettlementResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.accountsettlement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ip_accountsettlement(
        self,
        request: baasdt_models.AddIpAccountsettlementRequest,
    ) -> baasdt_models.AddIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-版权方用户申请开通新渠道
        Summary: 数字商品-IP授权服务-申请开通新渠道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ip_accountsettlement_ex(request, headers, runtime)

    async def add_ip_accountsettlement_async(
        self,
        request: baasdt_models.AddIpAccountsettlementRequest,
    ) -> baasdt_models.AddIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-版权方用户申请开通新渠道
        Summary: 数字商品-IP授权服务-申请开通新渠道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ip_accountsettlement_ex_async(request, headers, runtime)

    def add_ip_accountsettlement_ex(
        self,
        request: baasdt_models.AddIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-版权方用户申请开通新渠道
        Summary: 数字商品-IP授权服务-申请开通新渠道
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddIpAccountsettlementResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.accountsettlement.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ip_accountsettlement_ex_async(
        self,
        request: baasdt_models.AddIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AddIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-版权方用户申请开通新渠道
        Summary: 数字商品-IP授权服务-申请开通新渠道
        """
        UtilClient.validate_model(request)
        return baasdt_models.AddIpAccountsettlementResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.accountsettlement.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_ip_ordercontract(
        self,
        request: baasdt_models.SignIpOrdercontractRequest,
    ) -> baasdt_models.SignIpOrdercontractResponse:
        """
        Description: 签署交易订单的区块链合同
        Summary: 数字商品服务-IP授权服务-签署订单合同
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_ip_ordercontract_ex(request, headers, runtime)

    async def sign_ip_ordercontract_async(
        self,
        request: baasdt_models.SignIpOrdercontractRequest,
    ) -> baasdt_models.SignIpOrdercontractResponse:
        """
        Description: 签署交易订单的区块链合同
        Summary: 数字商品服务-IP授权服务-签署订单合同
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_ip_ordercontract_ex_async(request, headers, runtime)

    def sign_ip_ordercontract_ex(
        self,
        request: baasdt_models.SignIpOrdercontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SignIpOrdercontractResponse:
        """
        Description: 签署交易订单的区块链合同
        Summary: 数字商品服务-IP授权服务-签署订单合同
        """
        UtilClient.validate_model(request)
        return baasdt_models.SignIpOrdercontractResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.ordercontract.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_ip_ordercontract_ex_async(
        self,
        request: baasdt_models.SignIpOrdercontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SignIpOrdercontractResponse:
        """
        Description: 签署交易订单的区块链合同
        Summary: 数字商品服务-IP授权服务-签署订单合同
        """
        UtilClient.validate_model(request)
        return baasdt_models.SignIpOrdercontractResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.ordercontract.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_ordergoodsids(
        self,
        request: baasdt_models.SetIpOrdergoodsidsRequest,
    ) -> baasdt_models.SetIpOrdergoodsidsResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_ordergoodsids_ex(request, headers, runtime)

    async def set_ip_ordergoodsids_async(
        self,
        request: baasdt_models.SetIpOrdergoodsidsRequest,
    ) -> baasdt_models.SetIpOrdergoodsidsResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_ordergoodsids_ex_async(request, headers, runtime)

    def set_ip_ordergoodsids_ex(
        self,
        request: baasdt_models.SetIpOrdergoodsidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpOrdergoodsidsResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpOrdergoodsidsResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.ordergoodsids.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_ordergoodsids_ex_async(
        self,
        request: baasdt_models.SetIpOrdergoodsidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpOrdergoodsidsResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpOrdergoodsidsResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.ordergoodsids.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_salesbyday(
        self,
        request: baasdt_models.PagequeryIpSalesbydayRequest,
    ) -> baasdt_models.PagequeryIpSalesbydayResponse:
        """
        Description: 分页查询商户和订单的T+1日销售数据汇总数据
        Summary: 数字商品服务-IP授权服务-查日销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_salesbyday_ex(request, headers, runtime)

    async def pagequery_ip_salesbyday_async(
        self,
        request: baasdt_models.PagequeryIpSalesbydayRequest,
    ) -> baasdt_models.PagequeryIpSalesbydayResponse:
        """
        Description: 分页查询商户和订单的T+1日销售数据汇总数据
        Summary: 数字商品服务-IP授权服务-查日销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_salesbyday_ex_async(request, headers, runtime)

    def pagequery_ip_salesbyday_ex(
        self,
        request: baasdt_models.PagequeryIpSalesbydayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpSalesbydayResponse:
        """
        Description: 分页查询商户和订单的T+1日销售数据汇总数据
        Summary: 数字商品服务-IP授权服务-查日销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpSalesbydayResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.salesbyday.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_salesbyday_ex_async(
        self,
        request: baasdt_models.PagequeryIpSalesbydayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpSalesbydayResponse:
        """
        Description: 分页查询商户和订单的T+1日销售数据汇总数据
        Summary: 数字商品服务-IP授权服务-查日销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpSalesbydayResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.salesbyday.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ip_copyright(
        self,
        request: baasdt_models.CreateIpCopyrightRequest,
    ) -> baasdt_models.CreateIpCopyrightResponse:
        """
        Description: 联动雀凿，为文件生成区块链证书，实现文件的版权保护
        Summary: 数字商品服务-IP授权服务-文件版权保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ip_copyright_ex(request, headers, runtime)

    async def create_ip_copyright_async(
        self,
        request: baasdt_models.CreateIpCopyrightRequest,
    ) -> baasdt_models.CreateIpCopyrightResponse:
        """
        Description: 联动雀凿，为文件生成区块链证书，实现文件的版权保护
        Summary: 数字商品服务-IP授权服务-文件版权保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ip_copyright_ex_async(request, headers, runtime)

    def create_ip_copyright_ex(
        self,
        request: baasdt_models.CreateIpCopyrightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpCopyrightResponse:
        """
        Description: 联动雀凿，为文件生成区块链证书，实现文件的版权保护
        Summary: 数字商品服务-IP授权服务-文件版权保护
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpCopyrightResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.copyright.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ip_copyright_ex_async(
        self,
        request: baasdt_models.CreateIpCopyrightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateIpCopyrightResponse:
        """
        Description: 联动雀凿，为文件生成区块链证书，实现文件的版权保护
        Summary: 数字商品服务-IP授权服务-文件版权保护
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateIpCopyrightResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.copyright.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_copyright(
        self,
        request: baasdt_models.QueryIpCopyrightRequest,
    ) -> baasdt_models.QueryIpCopyrightResponse:
        """
        Description: 数字商品-IP授权服务-文件版权状态查询
        Summary: 数字商品-IP授权服务-文件版权状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_copyright_ex(request, headers, runtime)

    async def query_ip_copyright_async(
        self,
        request: baasdt_models.QueryIpCopyrightRequest,
    ) -> baasdt_models.QueryIpCopyrightResponse:
        """
        Description: 数字商品-IP授权服务-文件版权状态查询
        Summary: 数字商品-IP授权服务-文件版权状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_copyright_ex_async(request, headers, runtime)

    def query_ip_copyright_ex(
        self,
        request: baasdt_models.QueryIpCopyrightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCopyrightResponse:
        """
        Description: 数字商品-IP授权服务-文件版权状态查询
        Summary: 数字商品-IP授权服务-文件版权状态查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCopyrightResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.copyright.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_copyright_ex_async(
        self,
        request: baasdt_models.QueryIpCopyrightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCopyrightResponse:
        """
        Description: 数字商品-IP授权服务-文件版权状态查询
        Summary: 数字商品-IP授权服务-文件版权状态查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCopyrightResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.copyright.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_ordermemo(
        self,
        request: baasdt_models.SetIpOrdermemoRequest,
    ) -> baasdt_models.SetIpOrdermemoResponse:
        """
        Description: 编辑订单备注
        Summary: 数字商品服务-IP授权服务-编辑订单备注
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_ordermemo_ex(request, headers, runtime)

    async def set_ip_ordermemo_async(
        self,
        request: baasdt_models.SetIpOrdermemoRequest,
    ) -> baasdt_models.SetIpOrdermemoResponse:
        """
        Description: 编辑订单备注
        Summary: 数字商品服务-IP授权服务-编辑订单备注
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_ordermemo_ex_async(request, headers, runtime)

    def set_ip_ordermemo_ex(
        self,
        request: baasdt_models.SetIpOrdermemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpOrdermemoResponse:
        """
        Description: 编辑订单备注
        Summary: 数字商品服务-IP授权服务-编辑订单备注
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpOrdermemoResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.ordermemo.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_ordermemo_ex_async(
        self,
        request: baasdt_models.SetIpOrdermemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpOrdermemoResponse:
        """
        Description: 编辑订单备注
        Summary: 数字商品服务-IP授权服务-编辑订单备注
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpOrdermemoResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.ordermemo.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_accountsettlement(
        self,
        request: baasdt_models.ConfirmIpAccountsettlementRequest,
    ) -> baasdt_models.ConfirmIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-确认开通版权方渠道
        Summary: 数字商品服务-IP-开通版权方渠道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_accountsettlement_ex(request, headers, runtime)

    async def confirm_ip_accountsettlement_async(
        self,
        request: baasdt_models.ConfirmIpAccountsettlementRequest,
    ) -> baasdt_models.ConfirmIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-确认开通版权方渠道
        Summary: 数字商品服务-IP-开通版权方渠道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_accountsettlement_ex_async(request, headers, runtime)

    def confirm_ip_accountsettlement_ex(
        self,
        request: baasdt_models.ConfirmIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-确认开通版权方渠道
        Summary: 数字商品服务-IP-开通版权方渠道
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpAccountsettlementResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.accountsettlement.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_accountsettlement_ex_async(
        self,
        request: baasdt_models.ConfirmIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpAccountsettlementResponse:
        """
        Description: 数字商品服务-IP-确认开通版权方渠道
        Summary: 数字商品服务-IP-开通版权方渠道
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpAccountsettlementResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.accountsettlement.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_sales(
        self,
        request: baasdt_models.PagequeryIpSalesRequest,
    ) -> baasdt_models.PagequeryIpSalesResponse:
        """
        Description: 分页查询订单的销售数据详情列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_sales_ex(request, headers, runtime)

    async def pagequery_ip_sales_async(
        self,
        request: baasdt_models.PagequeryIpSalesRequest,
    ) -> baasdt_models.PagequeryIpSalesResponse:
        """
        Description: 分页查询订单的销售数据详情列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_sales_ex_async(request, headers, runtime)

    def pagequery_ip_sales_ex(
        self,
        request: baasdt_models.PagequeryIpSalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpSalesResponse:
        """
        Description: 分页查询订单的销售数据详情列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpSalesResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.sales.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_sales_ex_async(
        self,
        request: baasdt_models.PagequeryIpSalesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpSalesResponse:
        """
        Description: 分页查询订单的销售数据详情列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpSalesResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.sales.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_accountsettlement(
        self,
        request: baasdt_models.BatchqueryIpAccountsettlementRequest,
    ) -> baasdt_models.BatchqueryIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-查询申请入驻该渠道的所有版权方列表
        Summary: 数字商品-IP授权服务-查询版权方列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_accountsettlement_ex(request, headers, runtime)

    async def batchquery_ip_accountsettlement_async(
        self,
        request: baasdt_models.BatchqueryIpAccountsettlementRequest,
    ) -> baasdt_models.BatchqueryIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-查询申请入驻该渠道的所有版权方列表
        Summary: 数字商品-IP授权服务-查询版权方列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_accountsettlement_ex_async(request, headers, runtime)

    def batchquery_ip_accountsettlement_ex(
        self,
        request: baasdt_models.BatchqueryIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-查询申请入驻该渠道的所有版权方列表
        Summary: 数字商品-IP授权服务-查询版权方列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpAccountsettlementResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.accountsettlement.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_accountsettlement_ex_async(
        self,
        request: baasdt_models.BatchqueryIpAccountsettlementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpAccountsettlementResponse:
        """
        Description: 数字商品-IP授权服务-查询申请入驻该渠道的所有版权方列表
        Summary: 数字商品-IP授权服务-查询版权方列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpAccountsettlementResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.accountsettlement.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_ip_code(
        self,
        request: baasdt_models.PullIpCodeRequest,
    ) -> baasdt_models.PullIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-可跳转正版码分页查询: 小程序可扫描的正版码分页查询。
        Summary: 数字商品服务-IP授权服务-天猫查正版码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_ip_code_ex(request, headers, runtime)

    async def pull_ip_code_async(
        self,
        request: baasdt_models.PullIpCodeRequest,
    ) -> baasdt_models.PullIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-可跳转正版码分页查询: 小程序可扫描的正版码分页查询。
        Summary: 数字商品服务-IP授权服务-天猫查正版码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_ip_code_ex_async(request, headers, runtime)

    def pull_ip_code_ex(
        self,
        request: baasdt_models.PullIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PullIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-可跳转正版码分页查询: 小程序可扫描的正版码分页查询。
        Summary: 数字商品服务-IP授权服务-天猫查正版码
        """
        UtilClient.validate_model(request)
        return baasdt_models.PullIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_ip_code_ex_async(
        self,
        request: baasdt_models.PullIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PullIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-可跳转正版码分页查询: 小程序可扫描的正版码分页查询。
        Summary: 数字商品服务-IP授权服务-天猫查正版码
        """
        UtilClient.validate_model(request)
        return baasdt_models.PullIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_ip_goodsinterest(
        self,
        request: baasdt_models.BatchqueryIpGoodsinterestRequest,
    ) -> baasdt_models.BatchqueryIpGoodsinterestResponse:
        """
        Description: 数字商品服务-IP-猜你喜欢的商品
        Summary: 数字商品服务-IP-查询用户感兴趣的商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_ip_goodsinterest_ex(request, headers, runtime)

    async def batchquery_ip_goodsinterest_async(
        self,
        request: baasdt_models.BatchqueryIpGoodsinterestRequest,
    ) -> baasdt_models.BatchqueryIpGoodsinterestResponse:
        """
        Description: 数字商品服务-IP-猜你喜欢的商品
        Summary: 数字商品服务-IP-查询用户感兴趣的商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_ip_goodsinterest_ex_async(request, headers, runtime)

    def batchquery_ip_goodsinterest_ex(
        self,
        request: baasdt_models.BatchqueryIpGoodsinterestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpGoodsinterestResponse:
        """
        Description: 数字商品服务-IP-猜你喜欢的商品
        Summary: 数字商品服务-IP-查询用户感兴趣的商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpGoodsinterestResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.goodsinterest.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_ip_goodsinterest_ex_async(
        self,
        request: baasdt_models.BatchqueryIpGoodsinterestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BatchqueryIpGoodsinterestResponse:
        """
        Description: 数字商品服务-IP-猜你喜欢的商品
        Summary: 数字商品服务-IP-查询用户感兴趣的商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.BatchqueryIpGoodsinterestResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.goodsinterest.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_twcaccount(
        self,
        request: baasdt_models.QueryIpTwcaccountRequest,
    ) -> baasdt_models.QueryIpTwcaccountResponse:
        """
        Description: 查询区块链合同账号信息
        Summary: 数字商品服务-IP授权服务-合同账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_twcaccount_ex(request, headers, runtime)

    async def query_ip_twcaccount_async(
        self,
        request: baasdt_models.QueryIpTwcaccountRequest,
    ) -> baasdt_models.QueryIpTwcaccountResponse:
        """
        Description: 查询区块链合同账号信息
        Summary: 数字商品服务-IP授权服务-合同账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_twcaccount_ex_async(request, headers, runtime)

    def query_ip_twcaccount_ex(
        self,
        request: baasdt_models.QueryIpTwcaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpTwcaccountResponse:
        """
        Description: 查询区块链合同账号信息
        Summary: 数字商品服务-IP授权服务-合同账户查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpTwcaccountResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.twcaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_twcaccount_ex_async(
        self,
        request: baasdt_models.QueryIpTwcaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpTwcaccountResponse:
        """
        Description: 查询区块链合同账号信息
        Summary: 数字商品服务-IP授权服务-合同账户查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpTwcaccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.twcaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_ip_shop(
        self,
        request: baasdt_models.BindIpShopRequest,
    ) -> baasdt_models.BindIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-授权URI: 获取授权URI, 用于淘宝店铺授权数据给IPforce
        Summary: 数字商品服务-IP授权服务-授权URI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_ip_shop_ex(request, headers, runtime)

    async def bind_ip_shop_async(
        self,
        request: baasdt_models.BindIpShopRequest,
    ) -> baasdt_models.BindIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-授权URI: 获取授权URI, 用于淘宝店铺授权数据给IPforce
        Summary: 数字商品服务-IP授权服务-授权URI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_ip_shop_ex_async(request, headers, runtime)

    def bind_ip_shop_ex(
        self,
        request: baasdt_models.BindIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BindIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-授权URI: 获取授权URI, 用于淘宝店铺授权数据给IPforce
        Summary: 数字商品服务-IP授权服务-授权URI
        """
        UtilClient.validate_model(request)
        return baasdt_models.BindIpShopResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.shop.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_ip_shop_ex_async(
        self,
        request: baasdt_models.BindIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.BindIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-授权URI: 获取授权URI, 用于淘宝店铺授权数据给IPforce
        Summary: 数字商品服务-IP授权服务-授权URI
        """
        UtilClient.validate_model(request)
        return baasdt_models.BindIpShopResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.shop.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_ip_shop(
        self,
        request: baasdt_models.AuthIpShopRequest,
    ) -> baasdt_models.AuthIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-店铺授权结果: 店铺登陆淘宝授权后的授权结果回调
        Summary: 数字商品服务-IP授权服务-店铺授权结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_ip_shop_ex(request, headers, runtime)

    async def auth_ip_shop_async(
        self,
        request: baasdt_models.AuthIpShopRequest,
    ) -> baasdt_models.AuthIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-店铺授权结果: 店铺登陆淘宝授权后的授权结果回调
        Summary: 数字商品服务-IP授权服务-店铺授权结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_ip_shop_ex_async(request, headers, runtime)

    def auth_ip_shop_ex(
        self,
        request: baasdt_models.AuthIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AuthIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-店铺授权结果: 店铺登陆淘宝授权后的授权结果回调
        Summary: 数字商品服务-IP授权服务-店铺授权结果
        """
        UtilClient.validate_model(request)
        return baasdt_models.AuthIpShopResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.shop.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_ip_shop_ex_async(
        self,
        request: baasdt_models.AuthIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.AuthIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-店铺授权结果: 店铺登陆淘宝授权后的授权结果回调
        Summary: 数字商品服务-IP授权服务-店铺授权结果
        """
        UtilClient.validate_model(request)
        return baasdt_models.AuthIpShopResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.shop.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_ip_shop(
        self,
        request: baasdt_models.ListIpShopRequest,
    ) -> baasdt_models.ListIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商户授权列表: 商户获取其店铺授权历史列表
        Summary: 数字商品服务-IP授权服务-商户授权列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_ip_shop_ex(request, headers, runtime)

    async def list_ip_shop_async(
        self,
        request: baasdt_models.ListIpShopRequest,
    ) -> baasdt_models.ListIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商户授权列表: 商户获取其店铺授权历史列表
        Summary: 数字商品服务-IP授权服务-商户授权列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_ip_shop_ex_async(request, headers, runtime)

    def list_ip_shop_ex(
        self,
        request: baasdt_models.ListIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ListIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商户授权列表: 商户获取其店铺授权历史列表
        Summary: 数字商品服务-IP授权服务-商户授权列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.ListIpShopResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.shop.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_ip_shop_ex_async(
        self,
        request: baasdt_models.ListIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ListIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商户授权列表: 商户获取其店铺授权历史列表
        Summary: 数字商品服务-IP授权服务-商户授权列表
        """
        UtilClient.validate_model(request)
        return baasdt_models.ListIpShopResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.shop.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_codecollect(
        self,
        request: baasdt_models.QueryIpCodecollectRequest,
    ) -> baasdt_models.QueryIpCodecollectResponse:
        """
        Description: 查询正版码收藏证书详情，主要包括该正版码对应的ip商品，流转信息，区块信息等
        Summary: 查询正版码收藏证书详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_codecollect_ex(request, headers, runtime)

    async def query_ip_codecollect_async(
        self,
        request: baasdt_models.QueryIpCodecollectRequest,
    ) -> baasdt_models.QueryIpCodecollectResponse:
        """
        Description: 查询正版码收藏证书详情，主要包括该正版码对应的ip商品，流转信息，区块信息等
        Summary: 查询正版码收藏证书详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_codecollect_ex_async(request, headers, runtime)

    def query_ip_codecollect_ex(
        self,
        request: baasdt_models.QueryIpCodecollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCodecollectResponse:
        """
        Description: 查询正版码收藏证书详情，主要包括该正版码对应的ip商品，流转信息，区块信息等
        Summary: 查询正版码收藏证书详情
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCodecollectResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.codecollect.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_codecollect_ex_async(
        self,
        request: baasdt_models.QueryIpCodecollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpCodecollectResponse:
        """
        Description: 查询正版码收藏证书详情，主要包括该正版码对应的ip商品，流转信息，区块信息等
        Summary: 查询正版码收藏证书详情
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpCodecollectResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.codecollect.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ip_shop(
        self,
        request: baasdt_models.GetIpShopRequest,
    ) -> baasdt_models.GetIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商品查询: 查询单个商品信息(淘宝开放平台数据)
        Summary: 数字商品服务-IP授权服务-商品查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ip_shop_ex(request, headers, runtime)

    async def get_ip_shop_async(
        self,
        request: baasdt_models.GetIpShopRequest,
    ) -> baasdt_models.GetIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商品查询: 查询单个商品信息(淘宝开放平台数据)
        Summary: 数字商品服务-IP授权服务-商品查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ip_shop_ex_async(request, headers, runtime)

    def get_ip_shop_ex(
        self,
        request: baasdt_models.GetIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.GetIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商品查询: 查询单个商品信息(淘宝开放平台数据)
        Summary: 数字商品服务-IP授权服务-商品查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.GetIpShopResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.shop.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ip_shop_ex_async(
        self,
        request: baasdt_models.GetIpShopRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.GetIpShopResponse:
        """
        Description: 数字商品服务-IP授权服务-商品查询: 查询单个商品信息(淘宝开放平台数据)
        Summary: 数字商品服务-IP授权服务-商品查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.GetIpShopResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.shop.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_ordergoodsid(
        self,
        request: baasdt_models.SetIpOrdergoodsidRequest,
    ) -> baasdt_models.SetIpOrdergoodsidResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_ordergoodsid_ex(request, headers, runtime)

    async def set_ip_ordergoodsid_async(
        self,
        request: baasdt_models.SetIpOrdergoodsidRequest,
    ) -> baasdt_models.SetIpOrdergoodsidResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_ordergoodsid_ex_async(request, headers, runtime)

    def set_ip_ordergoodsid_ex(
        self,
        request: baasdt_models.SetIpOrdergoodsidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpOrdergoodsidResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpOrdergoodsidResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.ordergoodsid.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_ordergoodsid_ex_async(
        self,
        request: baasdt_models.SetIpOrdergoodsidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpOrdergoodsidResponse:
        """
        Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
        Summary: 数字商品服务-IP授权服务-绑定商品ID
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpOrdergoodsidResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.ordergoodsid.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_ip_salescorrection(
        self,
        request: baasdt_models.SetIpSalescorrectionRequest,
    ) -> baasdt_models.SetIpSalescorrectionResponse:
        """
        Description: 商家校正授权订单的销售数据
        Summary: 数字商品服务-IP授权服务-校正销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_ip_salescorrection_ex(request, headers, runtime)

    async def set_ip_salescorrection_async(
        self,
        request: baasdt_models.SetIpSalescorrectionRequest,
    ) -> baasdt_models.SetIpSalescorrectionResponse:
        """
        Description: 商家校正授权订单的销售数据
        Summary: 数字商品服务-IP授权服务-校正销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_ip_salescorrection_ex_async(request, headers, runtime)

    def set_ip_salescorrection_ex(
        self,
        request: baasdt_models.SetIpSalescorrectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpSalescorrectionResponse:
        """
        Description: 商家校正授权订单的销售数据
        Summary: 数字商品服务-IP授权服务-校正销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpSalescorrectionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.salescorrection.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_ip_salescorrection_ex_async(
        self,
        request: baasdt_models.SetIpSalescorrectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.SetIpSalescorrectionResponse:
        """
        Description: 商家校正授权订单的销售数据
        Summary: 数字商品服务-IP授权服务-校正销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.SetIpSalescorrectionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.salescorrection.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_salessummary(
        self,
        request: baasdt_models.ConfirmIpSalessummaryRequest,
    ) -> baasdt_models.ConfirmIpSalessummaryResponse:
        """
        Description: 商户确认销售数据。版权方确认或者拒绝销售数据
        Summary: 数字商品服务-IP授权服务-确认销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_salessummary_ex(request, headers, runtime)

    async def confirm_ip_salessummary_async(
        self,
        request: baasdt_models.ConfirmIpSalessummaryRequest,
    ) -> baasdt_models.ConfirmIpSalessummaryResponse:
        """
        Description: 商户确认销售数据。版权方确认或者拒绝销售数据
        Summary: 数字商品服务-IP授权服务-确认销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_salessummary_ex_async(request, headers, runtime)

    def confirm_ip_salessummary_ex(
        self,
        request: baasdt_models.ConfirmIpSalessummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpSalessummaryResponse:
        """
        Description: 商户确认销售数据。版权方确认或者拒绝销售数据
        Summary: 数字商品服务-IP授权服务-确认销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpSalessummaryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.salessummary.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_salessummary_ex_async(
        self,
        request: baasdt_models.ConfirmIpSalessummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpSalessummaryResponse:
        """
        Description: 商户确认销售数据。版权方确认或者拒绝销售数据
        Summary: 数字商品服务-IP授权服务-确认销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpSalessummaryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.salessummary.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ip_saleseverylist(
        self,
        request: baasdt_models.UploadIpSaleseverylistRequest,
    ) -> baasdt_models.UploadIpSaleseverylistResponse:
        """
        Description: 上传授权订单的逐条销售数据
        Summary: 数字商品服务-IP授权服务-销售数据上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ip_saleseverylist_ex(request, headers, runtime)

    async def upload_ip_saleseverylist_async(
        self,
        request: baasdt_models.UploadIpSaleseverylistRequest,
    ) -> baasdt_models.UploadIpSaleseverylistResponse:
        """
        Description: 上传授权订单的逐条销售数据
        Summary: 数字商品服务-IP授权服务-销售数据上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ip_saleseverylist_ex_async(request, headers, runtime)

    def upload_ip_saleseverylist_ex(
        self,
        request: baasdt_models.UploadIpSaleseverylistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpSaleseverylistResponse:
        """
        Description: 上传授权订单的逐条销售数据
        Summary: 数字商品服务-IP授权服务-销售数据上传
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpSaleseverylistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.saleseverylist.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ip_saleseverylist_ex_async(
        self,
        request: baasdt_models.UploadIpSaleseverylistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpSaleseverylistResponse:
        """
        Description: 上传授权订单的逐条销售数据
        Summary: 数字商品服务-IP授权服务-销售数据上传
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpSaleseverylistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.saleseverylist.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_salessummary(
        self,
        request: baasdt_models.PagequeryIpSalessummaryRequest,
    ) -> baasdt_models.PagequeryIpSalessummaryResponse:
        """
        Description: 查询订单或者账单的销售数据汇总信息列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_salessummary_ex(request, headers, runtime)

    async def pagequery_ip_salessummary_async(
        self,
        request: baasdt_models.PagequeryIpSalessummaryRequest,
    ) -> baasdt_models.PagequeryIpSalessummaryResponse:
        """
        Description: 查询订单或者账单的销售数据汇总信息列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_salessummary_ex_async(request, headers, runtime)

    def pagequery_ip_salessummary_ex(
        self,
        request: baasdt_models.PagequeryIpSalessummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpSalessummaryResponse:
        """
        Description: 查询订单或者账单的销售数据汇总信息列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpSalessummaryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.salessummary.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_salessummary_ex_async(
        self,
        request: baasdt_models.PagequeryIpSalessummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpSalessummaryResponse:
        """
        Description: 查询订单或者账单的销售数据汇总信息列表
        Summary: 数字商品服务-IP授权服务-查询销售数据
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpSalessummaryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.salessummary.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reopen_ip_bill(
        self,
        request: baasdt_models.ReopenIpBillRequest,
    ) -> baasdt_models.ReopenIpBillResponse:
        """
        Description: 账单超时关闭的情况下，重新生成支付链接，变为待支付状态
        Summary: 数字商品服务-IP授权服务-刷新账单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reopen_ip_bill_ex(request, headers, runtime)

    async def reopen_ip_bill_async(
        self,
        request: baasdt_models.ReopenIpBillRequest,
    ) -> baasdt_models.ReopenIpBillResponse:
        """
        Description: 账单超时关闭的情况下，重新生成支付链接，变为待支付状态
        Summary: 数字商品服务-IP授权服务-刷新账单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reopen_ip_bill_ex_async(request, headers, runtime)

    def reopen_ip_bill_ex(
        self,
        request: baasdt_models.ReopenIpBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReopenIpBillResponse:
        """
        Description: 账单超时关闭的情况下，重新生成支付链接，变为待支付状态
        Summary: 数字商品服务-IP授权服务-刷新账单状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReopenIpBillResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.bill.reopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reopen_ip_bill_ex_async(
        self,
        request: baasdt_models.ReopenIpBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ReopenIpBillResponse:
        """
        Description: 账单超时关闭的情况下，重新生成支付链接，变为待支付状态
        Summary: 数字商品服务-IP授权服务-刷新账单状态
        """
        UtilClient.validate_model(request)
        return baasdt_models.ReopenIpBillResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.bill.reopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_ip_authtrade(
        self,
        request: baasdt_models.InitIpAuthtradeRequest,
    ) -> baasdt_models.InitIpAuthtradeResponse:
        """
        Description: 下单问询，商家申请合作授权
        Summary: 数字商品服务-IP授权服务-授权交易问询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_ip_authtrade_ex(request, headers, runtime)

    async def init_ip_authtrade_async(
        self,
        request: baasdt_models.InitIpAuthtradeRequest,
    ) -> baasdt_models.InitIpAuthtradeResponse:
        """
        Description: 下单问询，商家申请合作授权
        Summary: 数字商品服务-IP授权服务-授权交易问询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_ip_authtrade_ex_async(request, headers, runtime)

    def init_ip_authtrade_ex(
        self,
        request: baasdt_models.InitIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.InitIpAuthtradeResponse:
        """
        Description: 下单问询，商家申请合作授权
        Summary: 数字商品服务-IP授权服务-授权交易问询
        """
        UtilClient.validate_model(request)
        return baasdt_models.InitIpAuthtradeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.authtrade.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_ip_authtrade_ex_async(
        self,
        request: baasdt_models.InitIpAuthtradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.InitIpAuthtradeResponse:
        """
        Description: 下单问询，商家申请合作授权
        Summary: 数字商品服务-IP授权服务-授权交易问询
        """
        UtilClient.validate_model(request)
        return baasdt_models.InitIpAuthtradeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.authtrade.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ip_orderhistory(
        self,
        request: baasdt_models.QueryIpOrderhistoryRequest,
    ) -> baasdt_models.QueryIpOrderhistoryResponse:
        """
        Description: 查询订单历史信息
        Summary: 数字商品服务-IP授权服务-查询订单历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ip_orderhistory_ex(request, headers, runtime)

    async def query_ip_orderhistory_async(
        self,
        request: baasdt_models.QueryIpOrderhistoryRequest,
    ) -> baasdt_models.QueryIpOrderhistoryResponse:
        """
        Description: 查询订单历史信息
        Summary: 数字商品服务-IP授权服务-查询订单历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ip_orderhistory_ex_async(request, headers, runtime)

    def query_ip_orderhistory_ex(
        self,
        request: baasdt_models.QueryIpOrderhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderhistoryResponse:
        """
        Description: 查询订单历史信息
        Summary: 数字商品服务-IP授权服务-查询订单历史
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderhistoryResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.orderhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ip_orderhistory_ex_async(
        self,
        request: baasdt_models.QueryIpOrderhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryIpOrderhistoryResponse:
        """
        Description: 查询订单历史信息
        Summary: 数字商品服务-IP授权服务-查询订单历史
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryIpOrderhistoryResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.orderhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_ip_billpay(
        self,
        request: baasdt_models.ConfirmIpBillpayRequest,
    ) -> baasdt_models.ConfirmIpBillpayResponse:
        """
        Description: 版权方确认线下回款，生成版权方需要支付的手续费账单和支付链接
        Summary: 数字商品服务-IP授权服务-确认线下回款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_ip_billpay_ex(request, headers, runtime)

    async def confirm_ip_billpay_async(
        self,
        request: baasdt_models.ConfirmIpBillpayRequest,
    ) -> baasdt_models.ConfirmIpBillpayResponse:
        """
        Description: 版权方确认线下回款，生成版权方需要支付的手续费账单和支付链接
        Summary: 数字商品服务-IP授权服务-确认线下回款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_ip_billpay_ex_async(request, headers, runtime)

    def confirm_ip_billpay_ex(
        self,
        request: baasdt_models.ConfirmIpBillpayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpBillpayResponse:
        """
        Description: 版权方确认线下回款，生成版权方需要支付的手续费账单和支付链接
        Summary: 数字商品服务-IP授权服务-确认线下回款
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpBillpayResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.billpay.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_ip_billpay_ex_async(
        self,
        request: baasdt_models.ConfirmIpBillpayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ConfirmIpBillpayResponse:
        """
        Description: 版权方确认线下回款，生成版权方需要支付的手续费账单和支付链接
        Summary: 数字商品服务-IP授权服务-确认线下回款
        """
        UtilClient.validate_model(request)
        return baasdt_models.ConfirmIpBillpayResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.billpay.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_ip_code(
        self,
        request: baasdt_models.DisableIpCodeRequest,
    ) -> baasdt_models.DisableIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-单码失效: 将UNI码失效,不可逆。
        Summary: 数字商品服务-IP授权服务-单码失效
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_ip_code_ex(request, headers, runtime)

    async def disable_ip_code_async(
        self,
        request: baasdt_models.DisableIpCodeRequest,
    ) -> baasdt_models.DisableIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-单码失效: 将UNI码失效,不可逆。
        Summary: 数字商品服务-IP授权服务-单码失效
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_ip_code_ex_async(request, headers, runtime)

    def disable_ip_code_ex(
        self,
        request: baasdt_models.DisableIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.DisableIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-单码失效: 将UNI码失效,不可逆。
        Summary: 数字商品服务-IP授权服务-单码失效
        """
        UtilClient.validate_model(request)
        return baasdt_models.DisableIpCodeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.code.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_ip_code_ex_async(
        self,
        request: baasdt_models.DisableIpCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.DisableIpCodeResponse:
        """
        Description: 数字商品服务-IP授权服务-单码失效: 将UNI码失效,不可逆。
        Summary: 数字商品服务-IP授权服务-单码失效
        """
        UtilClient.validate_model(request)
        return baasdt_models.DisableIpCodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.code.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ip_codecirculation(
        self,
        request: baasdt_models.UploadIpCodecirculationRequest,
    ) -> baasdt_models.UploadIpCodecirculationResponse:
        """
        Description: 上传正版码的流转信息
        Summary: 数字商品服务-IP授权服务-上传流转信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ip_codecirculation_ex(request, headers, runtime)

    async def upload_ip_codecirculation_async(
        self,
        request: baasdt_models.UploadIpCodecirculationRequest,
    ) -> baasdt_models.UploadIpCodecirculationResponse:
        """
        Description: 上传正版码的流转信息
        Summary: 数字商品服务-IP授权服务-上传流转信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ip_codecirculation_ex_async(request, headers, runtime)

    def upload_ip_codecirculation_ex(
        self,
        request: baasdt_models.UploadIpCodecirculationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpCodecirculationResponse:
        """
        Description: 上传正版码的流转信息
        Summary: 数字商品服务-IP授权服务-上传流转信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpCodecirculationResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.codecirculation.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ip_codecirculation_ex_async(
        self,
        request: baasdt_models.UploadIpCodecirculationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UploadIpCodecirculationResponse:
        """
        Description: 上传正版码的流转信息
        Summary: 数字商品服务-IP授权服务-上传流转信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.UploadIpCodecirculationResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.codecirculation.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_ip_codecirculation(
        self,
        request: baasdt_models.PagequeryIpCodecirculationRequest,
    ) -> baasdt_models.PagequeryIpCodecirculationResponse:
        """
        Description: 分页查询正版码的流转信息
        Summary: 数字商品服务-IP授权服务-查询流转信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_ip_codecirculation_ex(request, headers, runtime)

    async def pagequery_ip_codecirculation_async(
        self,
        request: baasdt_models.PagequeryIpCodecirculationRequest,
    ) -> baasdt_models.PagequeryIpCodecirculationResponse:
        """
        Description: 分页查询正版码的流转信息
        Summary: 数字商品服务-IP授权服务-查询流转信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_ip_codecirculation_ex_async(request, headers, runtime)

    def pagequery_ip_codecirculation_ex(
        self,
        request: baasdt_models.PagequeryIpCodecirculationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpCodecirculationResponse:
        """
        Description: 分页查询正版码的流转信息
        Summary: 数字商品服务-IP授权服务-查询流转信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpCodecirculationResponse().from_map(
            self.do_request('1.0', 'baas.antdao.ip.codecirculation.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_ip_codecirculation_ex_async(
        self,
        request: baasdt_models.PagequeryIpCodecirculationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.PagequeryIpCodecirculationResponse:
        """
        Description: 分页查询正版码的流转信息
        Summary: 数字商品服务-IP授权服务-查询流转信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.PagequeryIpCodecirculationResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.ip.codecirculation.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_block(
        self,
        request: baasdt_models.QueryBlockanalysisBlockRequest,
    ) -> baasdt_models.QueryBlockanalysisBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_block_ex(request, headers, runtime)

    async def query_blockanalysis_block_async(
        self,
        request: baasdt_models.QueryBlockanalysisBlockRequest,
    ) -> baasdt_models.QueryBlockanalysisBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_block_ex_async(request, headers, runtime)

    def query_blockanalysis_block_ex(
        self,
        request: baasdt_models.QueryBlockanalysisBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisBlockResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_block_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisBlockResponse:
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisBlockResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_lastblocknumber(
        self,
        request: baasdt_models.QueryBlockanalysisLastblocknumberRequest,
    ) -> baasdt_models.QueryBlockanalysisLastblocknumberResponse:
        """
        Description: 获取最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_lastblocknumber_ex(request, headers, runtime)

    async def query_blockanalysis_lastblocknumber_async(
        self,
        request: baasdt_models.QueryBlockanalysisLastblocknumberRequest,
    ) -> baasdt_models.QueryBlockanalysisLastblocknumberResponse:
        """
        Description: 获取最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_lastblocknumber_ex_async(request, headers, runtime)

    def query_blockanalysis_lastblocknumber_ex(
        self,
        request: baasdt_models.QueryBlockanalysisLastblocknumberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisLastblocknumberResponse:
        """
        Description: 获取最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisLastblocknumberResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.lastblocknumber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_lastblocknumber_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisLastblocknumberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisLastblocknumberResponse:
        """
        Description: 获取最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisLastblocknumberResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.lastblocknumber.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_openedequities(
        self,
        request: baasdt_models.QueryBlockanalysisOpenedequitiesRequest,
    ) -> baasdt_models.QueryBlockanalysisOpenedequitiesResponse:
        """
        Description: 获取公开的或者已授权的权益商品信息
        Summary: 数字商品服务-拉块服务-获取已授权商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_openedequities_ex(request, headers, runtime)

    async def query_blockanalysis_openedequities_async(
        self,
        request: baasdt_models.QueryBlockanalysisOpenedequitiesRequest,
    ) -> baasdt_models.QueryBlockanalysisOpenedequitiesResponse:
        """
        Description: 获取公开的或者已授权的权益商品信息
        Summary: 数字商品服务-拉块服务-获取已授权商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_openedequities_ex_async(request, headers, runtime)

    def query_blockanalysis_openedequities_ex(
        self,
        request: baasdt_models.QueryBlockanalysisOpenedequitiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisOpenedequitiesResponse:
        """
        Description: 获取公开的或者已授权的权益商品信息
        Summary: 数字商品服务-拉块服务-获取已授权商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisOpenedequitiesResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.openedequities.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_openedequities_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisOpenedequitiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisOpenedequitiesResponse:
        """
        Description: 获取公开的或者已授权的权益商品信息
        Summary: 数字商品服务-拉块服务-获取已授权商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisOpenedequitiesResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.openedequities.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_userpriceupdatedequities(
        self,
        request: baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesRequest,
    ) -> baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesResponse:
        """
        Description: 查询已设置过用户价格的有效权益商品信息
        Summary: 数字商品服务-拉块服务-已设用户价格商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_userpriceupdatedequities_ex(request, headers, runtime)

    async def query_blockanalysis_userpriceupdatedequities_async(
        self,
        request: baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesRequest,
    ) -> baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesResponse:
        """
        Description: 查询已设置过用户价格的有效权益商品信息
        Summary: 数字商品服务-拉块服务-已设用户价格商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_userpriceupdatedequities_ex_async(request, headers, runtime)

    def query_blockanalysis_userpriceupdatedequities_ex(
        self,
        request: baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesResponse:
        """
        Description: 查询已设置过用户价格的有效权益商品信息
        Summary: 数字商品服务-拉块服务-已设用户价格商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.userpriceupdatedequities.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_userpriceupdatedequities_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesResponse:
        """
        Description: 查询已设置过用户价格的有效权益商品信息
        Summary: 数字商品服务-拉块服务-已设用户价格商品
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisUserpriceupdatedequitiesResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.userpriceupdatedequities.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_unwriteoffvalue(
        self,
        request: baasdt_models.QueryBlockanalysisUnwriteoffvalueRequest,
    ) -> baasdt_models.QueryBlockanalysisUnwriteoffvalueResponse:
        """
        Description: 查询商户的可提现资产价值(单位:分)
        Summary: 数字商品服务-拉块服务-查询可提现资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_unwriteoffvalue_ex(request, headers, runtime)

    async def query_blockanalysis_unwriteoffvalue_async(
        self,
        request: baasdt_models.QueryBlockanalysisUnwriteoffvalueRequest,
    ) -> baasdt_models.QueryBlockanalysisUnwriteoffvalueResponse:
        """
        Description: 查询商户的可提现资产价值(单位:分)
        Summary: 数字商品服务-拉块服务-查询可提现资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_unwriteoffvalue_ex_async(request, headers, runtime)

    def query_blockanalysis_unwriteoffvalue_ex(
        self,
        request: baasdt_models.QueryBlockanalysisUnwriteoffvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisUnwriteoffvalueResponse:
        """
        Description: 查询商户的可提现资产价值(单位:分)
        Summary: 数字商品服务-拉块服务-查询可提现资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisUnwriteoffvalueResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.unwriteoffvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_unwriteoffvalue_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisUnwriteoffvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisUnwriteoffvalueResponse:
        """
        Description: 查询商户的可提现资产价值(单位:分)
        Summary: 数字商品服务-拉块服务-查询可提现资产
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisUnwriteoffvalueResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.unwriteoffvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockanalysis_delegaterelation(
        self,
        request: baasdt_models.UpdateBlockanalysisDelegaterelationRequest,
    ) -> baasdt_models.UpdateBlockanalysisDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-拉块服务-设置代理权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockanalysis_delegaterelation_ex(request, headers, runtime)

    async def update_blockanalysis_delegaterelation_async(
        self,
        request: baasdt_models.UpdateBlockanalysisDelegaterelationRequest,
    ) -> baasdt_models.UpdateBlockanalysisDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-拉块服务-设置代理权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockanalysis_delegaterelation_ex_async(request, headers, runtime)

    def update_blockanalysis_delegaterelation_ex(
        self,
        request: baasdt_models.UpdateBlockanalysisDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateBlockanalysisDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-拉块服务-设置代理权限
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateBlockanalysisDelegaterelationResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.delegaterelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockanalysis_delegaterelation_ex_async(
        self,
        request: baasdt_models.UpdateBlockanalysisDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateBlockanalysisDelegaterelationResponse:
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-拉块服务-设置代理权限
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateBlockanalysisDelegaterelationResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.delegaterelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockanalysis_whitelist(
        self,
        request: baasdt_models.UpdateBlockanalysisWhitelistRequest,
    ) -> baasdt_models.UpdateBlockanalysisWhitelistResponse:
        """
        Description: 设置接口访问白名单。
        Summary: 数字商品服务-拉块服务-设置访问白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockanalysis_whitelist_ex(request, headers, runtime)

    async def update_blockanalysis_whitelist_async(
        self,
        request: baasdt_models.UpdateBlockanalysisWhitelistRequest,
    ) -> baasdt_models.UpdateBlockanalysisWhitelistResponse:
        """
        Description: 设置接口访问白名单。
        Summary: 数字商品服务-拉块服务-设置访问白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockanalysis_whitelist_ex_async(request, headers, runtime)

    def update_blockanalysis_whitelist_ex(
        self,
        request: baasdt_models.UpdateBlockanalysisWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateBlockanalysisWhitelistResponse:
        """
        Description: 设置接口访问白名单。
        Summary: 数字商品服务-拉块服务-设置访问白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateBlockanalysisWhitelistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.whitelist.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockanalysis_whitelist_ex_async(
        self,
        request: baasdt_models.UpdateBlockanalysisWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.UpdateBlockanalysisWhitelistResponse:
        """
        Description: 设置接口访问白名单。
        Summary: 数字商品服务-拉块服务-设置访问白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.UpdateBlockanalysisWhitelistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.whitelist.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_delegaterelation(
        self,
        request: baasdt_models.QueryBlockanalysisDelegaterelationRequest,
    ) -> baasdt_models.QueryBlockanalysisDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-拉块服务-代理权限查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_delegaterelation_ex(request, headers, runtime)

    async def query_blockanalysis_delegaterelation_async(
        self,
        request: baasdt_models.QueryBlockanalysisDelegaterelationRequest,
    ) -> baasdt_models.QueryBlockanalysisDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-拉块服务-代理权限查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_delegaterelation_ex_async(request, headers, runtime)

    def query_blockanalysis_delegaterelation_ex(
        self,
        request: baasdt_models.QueryBlockanalysisDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-拉块服务-代理权限查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisDelegaterelationResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.delegaterelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_delegaterelation_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisDelegaterelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisDelegaterelationResponse:
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-拉块服务-代理权限查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisDelegaterelationResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.delegaterelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_whitelist(
        self,
        request: baasdt_models.QueryBlockanalysisWhitelistRequest,
    ) -> baasdt_models.QueryBlockanalysisWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_whitelist_ex(request, headers, runtime)

    async def query_blockanalysis_whitelist_async(
        self,
        request: baasdt_models.QueryBlockanalysisWhitelistRequest,
    ) -> baasdt_models.QueryBlockanalysisWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_whitelist_ex_async(request, headers, runtime)

    def query_blockanalysis_whitelist_ex(
        self,
        request: baasdt_models.QueryBlockanalysisWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisWhitelistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.whitelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_whitelist_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisWhitelistResponse:
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisWhitelistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.whitelist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_transaction(
        self,
        request: baasdt_models.QueryBlockanalysisTransactionRequest,
    ) -> baasdt_models.QueryBlockanalysisTransactionResponse:
        """
        Description: 根据交易hash获取交易信息
        Summary: 数字商品服务-拉块服务-获取交易信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_transaction_ex(request, headers, runtime)

    async def query_blockanalysis_transaction_async(
        self,
        request: baasdt_models.QueryBlockanalysisTransactionRequest,
    ) -> baasdt_models.QueryBlockanalysisTransactionResponse:
        """
        Description: 根据交易hash获取交易信息
        Summary: 数字商品服务-拉块服务-获取交易信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_transaction_ex_async(request, headers, runtime)

    def query_blockanalysis_transaction_ex(
        self,
        request: baasdt_models.QueryBlockanalysisTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisTransactionResponse:
        """
        Description: 根据交易hash获取交易信息
        Summary: 数字商品服务-拉块服务-获取交易信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisTransactionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_transaction_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisTransactionResponse:
        """
        Description: 根据交易hash获取交易信息
        Summary: 数字商品服务-拉块服务-获取交易信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisTransactionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_equityauthlist(
        self,
        request: baasdt_models.QueryBlockanalysisEquityauthlistRequest,
    ) -> baasdt_models.QueryBlockanalysisEquityauthlistResponse:
        """
        Description: 获取商品的授权信息列表(一客一价信息)
        Summary: 数字商品服务-拉块服务-获取商品授权信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_equityauthlist_ex(request, headers, runtime)

    async def query_blockanalysis_equityauthlist_async(
        self,
        request: baasdt_models.QueryBlockanalysisEquityauthlistRequest,
    ) -> baasdt_models.QueryBlockanalysisEquityauthlistResponse:
        """
        Description: 获取商品的授权信息列表(一客一价信息)
        Summary: 数字商品服务-拉块服务-获取商品授权信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_equityauthlist_ex_async(request, headers, runtime)

    def query_blockanalysis_equityauthlist_ex(
        self,
        request: baasdt_models.QueryBlockanalysisEquityauthlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisEquityauthlistResponse:
        """
        Description: 获取商品的授权信息列表(一客一价信息)
        Summary: 数字商品服务-拉块服务-获取商品授权信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisEquityauthlistResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.equityauthlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_equityauthlist_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisEquityauthlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisEquityauthlistResponse:
        """
        Description: 获取商品的授权信息列表(一客一价信息)
        Summary: 数字商品服务-拉块服务-获取商品授权信息
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisEquityauthlistResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.equityauthlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockanalysis_nextblock(
        self,
        request: baasdt_models.QueryBlockanalysisNextblockRequest,
    ) -> baasdt_models.QueryBlockanalysisNextblockResponse:
        """
        Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
        Summary: 数字商品服务-拉块服务-获取下个相关区块
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockanalysis_nextblock_ex(request, headers, runtime)

    async def query_blockanalysis_nextblock_async(
        self,
        request: baasdt_models.QueryBlockanalysisNextblockRequest,
    ) -> baasdt_models.QueryBlockanalysisNextblockResponse:
        """
        Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
        Summary: 数字商品服务-拉块服务-获取下个相关区块
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockanalysis_nextblock_ex_async(request, headers, runtime)

    def query_blockanalysis_nextblock_ex(
        self,
        request: baasdt_models.QueryBlockanalysisNextblockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisNextblockResponse:
        """
        Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
        Summary: 数字商品服务-拉块服务-获取下个相关区块
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisNextblockResponse().from_map(
            self.do_request('1.0', 'baas.antdao.blockanalysis.nextblock.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockanalysis_nextblock_ex_async(
        self,
        request: baasdt_models.QueryBlockanalysisNextblockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryBlockanalysisNextblockResponse:
        """
        Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
        Summary: 数字商品服务-拉块服务-获取下个相关区块
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryBlockanalysisNextblockResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.blockanalysis.nextblock.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mypoints_sku(
        self,
        request: baasdt_models.QueryMypointsSkuRequest,
    ) -> baasdt_models.QueryMypointsSkuResponse:
        """
        Description: 可订购的SKU列表查询
        Summary: 数字商品服务-商品服务-商品列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mypoints_sku_ex(request, headers, runtime)

    async def query_mypoints_sku_async(
        self,
        request: baasdt_models.QueryMypointsSkuRequest,
    ) -> baasdt_models.QueryMypointsSkuResponse:
        """
        Description: 可订购的SKU列表查询
        Summary: 数字商品服务-商品服务-商品列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mypoints_sku_ex_async(request, headers, runtime)

    def query_mypoints_sku_ex(
        self,
        request: baasdt_models.QueryMypointsSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsSkuResponse:
        """
        Description: 可订购的SKU列表查询
        Summary: 数字商品服务-商品服务-商品列表查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsSkuResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.sku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mypoints_sku_ex_async(
        self,
        request: baasdt_models.QueryMypointsSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsSkuResponse:
        """
        Description: 可订购的SKU列表查询
        Summary: 数字商品服务-商品服务-商品列表查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsSkuResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.sku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mypoints_merchantbalance(
        self,
        request: baasdt_models.QueryMypointsMerchantbalanceRequest,
    ) -> baasdt_models.QueryMypointsMerchantbalanceResponse:
        """
        Description: 查询商户的积分库和预算库
        Summary: 数字商品服务-商品服务-积分预算库查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mypoints_merchantbalance_ex(request, headers, runtime)

    async def query_mypoints_merchantbalance_async(
        self,
        request: baasdt_models.QueryMypointsMerchantbalanceRequest,
    ) -> baasdt_models.QueryMypointsMerchantbalanceResponse:
        """
        Description: 查询商户的积分库和预算库
        Summary: 数字商品服务-商品服务-积分预算库查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mypoints_merchantbalance_ex_async(request, headers, runtime)

    def query_mypoints_merchantbalance_ex(
        self,
        request: baasdt_models.QueryMypointsMerchantbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsMerchantbalanceResponse:
        """
        Description: 查询商户的积分库和预算库
        Summary: 数字商品服务-商品服务-积分预算库查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsMerchantbalanceResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.merchantbalance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mypoints_merchantbalance_ex_async(
        self,
        request: baasdt_models.QueryMypointsMerchantbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsMerchantbalanceResponse:
        """
        Description: 查询商户的积分库和预算库
        Summary: 数字商品服务-商品服务-积分预算库查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsMerchantbalanceResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.merchantbalance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_mypoints_preordersku(
        self,
        request: baasdt_models.ExecMypointsPreorderskuRequest,
    ) -> baasdt_models.ExecMypointsPreorderskuResponse:
        """
        Description: 预下单商品
        Summary: 数字商品服务-商品服务-商品预下单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_mypoints_preordersku_ex(request, headers, runtime)

    async def exec_mypoints_preordersku_async(
        self,
        request: baasdt_models.ExecMypointsPreorderskuRequest,
    ) -> baasdt_models.ExecMypointsPreorderskuResponse:
        """
        Description: 预下单商品
        Summary: 数字商品服务-商品服务-商品预下单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_mypoints_preordersku_ex_async(request, headers, runtime)

    def exec_mypoints_preordersku_ex(
        self,
        request: baasdt_models.ExecMypointsPreorderskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecMypointsPreorderskuResponse:
        """
        Description: 预下单商品
        Summary: 数字商品服务-商品服务-商品预下单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecMypointsPreorderskuResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.preordersku.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_mypoints_preordersku_ex_async(
        self,
        request: baasdt_models.ExecMypointsPreorderskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecMypointsPreorderskuResponse:
        """
        Description: 预下单商品
        Summary: 数字商品服务-商品服务-商品预下单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecMypointsPreorderskuResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.preordersku.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_mypoints_ordersku(
        self,
        request: baasdt_models.ExecMypointsOrderskuRequest,
    ) -> baasdt_models.ExecMypointsOrderskuResponse:
        """
        Description: 商品下单
        Summary: 数字商品服务-商品服务-商品下单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_mypoints_ordersku_ex(request, headers, runtime)

    async def exec_mypoints_ordersku_async(
        self,
        request: baasdt_models.ExecMypointsOrderskuRequest,
    ) -> baasdt_models.ExecMypointsOrderskuResponse:
        """
        Description: 商品下单
        Summary: 数字商品服务-商品服务-商品下单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_mypoints_ordersku_ex_async(request, headers, runtime)

    def exec_mypoints_ordersku_ex(
        self,
        request: baasdt_models.ExecMypointsOrderskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecMypointsOrderskuResponse:
        """
        Description: 商品下单
        Summary: 数字商品服务-商品服务-商品下单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecMypointsOrderskuResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.ordersku.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_mypoints_ordersku_ex_async(
        self,
        request: baasdt_models.ExecMypointsOrderskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.ExecMypointsOrderskuResponse:
        """
        Description: 商品下单
        Summary: 数字商品服务-商品服务-商品下单
        """
        UtilClient.validate_model(request)
        return baasdt_models.ExecMypointsOrderskuResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.ordersku.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mypoints_skufee(
        self,
        request: baasdt_models.QueryMypointsSkufeeRequest,
    ) -> baasdt_models.QueryMypointsSkufeeResponse:
        """
        Description: 根据商品ID，查询批量购买的费率
        Summary: 数字商品服务-商品服务-商品费率查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mypoints_skufee_ex(request, headers, runtime)

    async def query_mypoints_skufee_async(
        self,
        request: baasdt_models.QueryMypointsSkufeeRequest,
    ) -> baasdt_models.QueryMypointsSkufeeResponse:
        """
        Description: 根据商品ID，查询批量购买的费率
        Summary: 数字商品服务-商品服务-商品费率查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mypoints_skufee_ex_async(request, headers, runtime)

    def query_mypoints_skufee_ex(
        self,
        request: baasdt_models.QueryMypointsSkufeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsSkufeeResponse:
        """
        Description: 根据商品ID，查询批量购买的费率
        Summary: 数字商品服务-商品服务-商品费率查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsSkufeeResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.skufee.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mypoints_skufee_ex_async(
        self,
        request: baasdt_models.QueryMypointsSkufeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsSkufeeResponse:
        """
        Description: 根据商品ID，查询批量购买的费率
        Summary: 数字商品服务-商品服务-商品费率查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsSkufeeResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.skufee.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mypoints_preorderinstruction(
        self,
        request: baasdt_models.QueryMypointsPreorderinstructionRequest,
    ) -> baasdt_models.QueryMypointsPreorderinstructionResponse:
        """
        Description: 查询集分宝SKU的预下单流水记录
        Summary: 数字商品服务-商品服务-预下单流水查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mypoints_preorderinstruction_ex(request, headers, runtime)

    async def query_mypoints_preorderinstruction_async(
        self,
        request: baasdt_models.QueryMypointsPreorderinstructionRequest,
    ) -> baasdt_models.QueryMypointsPreorderinstructionResponse:
        """
        Description: 查询集分宝SKU的预下单流水记录
        Summary: 数字商品服务-商品服务-预下单流水查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mypoints_preorderinstruction_ex_async(request, headers, runtime)

    def query_mypoints_preorderinstruction_ex(
        self,
        request: baasdt_models.QueryMypointsPreorderinstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsPreorderinstructionResponse:
        """
        Description: 查询集分宝SKU的预下单流水记录
        Summary: 数字商品服务-商品服务-预下单流水查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsPreorderinstructionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.preorderinstruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mypoints_preorderinstruction_ex_async(
        self,
        request: baasdt_models.QueryMypointsPreorderinstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsPreorderinstructionResponse:
        """
        Description: 查询集分宝SKU的预下单流水记录
        Summary: 数字商品服务-商品服务-预下单流水查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsPreorderinstructionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.preorderinstruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mypoints_orderinstruction(
        self,
        request: baasdt_models.QueryMypointsOrderinstructionRequest,
    ) -> baasdt_models.QueryMypointsOrderinstructionResponse:
        """
        Description: 查询下单流水信息
        Summary: 数字商品服务-商品服务-商品下单流水查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mypoints_orderinstruction_ex(request, headers, runtime)

    async def query_mypoints_orderinstruction_async(
        self,
        request: baasdt_models.QueryMypointsOrderinstructionRequest,
    ) -> baasdt_models.QueryMypointsOrderinstructionResponse:
        """
        Description: 查询下单流水信息
        Summary: 数字商品服务-商品服务-商品下单流水查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mypoints_orderinstruction_ex_async(request, headers, runtime)

    def query_mypoints_orderinstruction_ex(
        self,
        request: baasdt_models.QueryMypointsOrderinstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsOrderinstructionResponse:
        """
        Description: 查询下单流水信息
        Summary: 数字商品服务-商品服务-商品下单流水查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsOrderinstructionResponse().from_map(
            self.do_request('1.0', 'baas.antdao.mypoints.orderinstruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mypoints_orderinstruction_ex_async(
        self,
        request: baasdt_models.QueryMypointsOrderinstructionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.QueryMypointsOrderinstructionResponse:
        """
        Description: 查询下单流水信息
        Summary: 数字商品服务-商品服务-商品下单流水查询
        """
        UtilClient.validate_model(request)
        return baasdt_models.QueryMypointsOrderinstructionResponse().from_map(
            await self.do_request_async('1.0', 'baas.antdao.mypoints.orderinstruction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: baasdt_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> baasdt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: baasdt_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> baasdt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: baasdt_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateAntcloudGatewayxFileUploadResponse().from_map(
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: baasdt_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return baasdt_models.CreateAntcloudGatewayxFileUploadResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
