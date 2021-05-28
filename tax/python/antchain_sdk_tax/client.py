# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_tax import models as tax_models
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
        config: tax_models.Config,
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
            # 发票明细
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
                    'sdk_version': '1.1.6'
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
            # 发票明细
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
                    'sdk_version': '1.1.6'
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

    def auth_corp(
        self,
        request: tax_models.AuthCorpRequest,
    ) -> tax_models.AuthCorpResponse:
        """
        Description: 目前仅用于广州区块链发票开通企业信息推送
        Summary: 区块链发票开通企业信息推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_corp_ex(request, headers, runtime)

    async def auth_corp_async(
        self,
        request: tax_models.AuthCorpRequest,
    ) -> tax_models.AuthCorpResponse:
        """
        Description: 目前仅用于广州区块链发票开通企业信息推送
        Summary: 区块链发票开通企业信息推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_corp_ex_async(request, headers, runtime)

    def auth_corp_ex(
        self,
        request: tax_models.AuthCorpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthCorpResponse:
        """
        Description: 目前仅用于广州区块链发票开通企业信息推送
        Summary: 区块链发票开通企业信息推送
        """
        UtilClient.validate_model(request)
        return tax_models.AuthCorpResponse().from_map(
            self.do_request('1.0', 'blockchain.tax.corp.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_corp_ex_async(
        self,
        request: tax_models.AuthCorpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthCorpResponse:
        """
        Description: 目前仅用于广州区块链发票开通企业信息推送
        Summary: 区块链发票开通企业信息推送
        """
        UtilClient.validate_model(request)
        return tax_models.AuthCorpResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.tax.corp.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_charge(
        self,
        request: tax_models.PushChargeRequest,
    ) -> tax_models.PushChargeResponse:
        """
        Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
        Summary: 计费推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_charge_ex(request, headers, runtime)

    async def push_charge_async(
        self,
        request: tax_models.PushChargeRequest,
    ) -> tax_models.PushChargeResponse:
        """
        Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
        Summary: 计费推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_charge_ex_async(request, headers, runtime)

    def push_charge_ex(
        self,
        request: tax_models.PushChargeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PushChargeResponse:
        """
        Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
        Summary: 计费推送
        """
        UtilClient.validate_model(request)
        return tax_models.PushChargeResponse().from_map(
            self.do_request('1.0', 'blockchain.tax.charge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_charge_ex_async(
        self,
        request: tax_models.PushChargeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PushChargeResponse:
        """
        Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
        Summary: 计费推送
        """
        UtilClient.validate_model(request)
        return tax_models.PushChargeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.tax.charge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_charge_auth(
        self,
        request: tax_models.QueryChargeAuthRequest,
    ) -> tax_models.QueryChargeAuthResponse:
        """
        Description: 查询计收费授权情况
        Summary: 查询计收费授权情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_charge_auth_ex(request, headers, runtime)

    async def query_charge_auth_async(
        self,
        request: tax_models.QueryChargeAuthRequest,
    ) -> tax_models.QueryChargeAuthResponse:
        """
        Description: 查询计收费授权情况
        Summary: 查询计收费授权情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_charge_auth_ex_async(request, headers, runtime)

    def query_charge_auth_ex(
        self,
        request: tax_models.QueryChargeAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryChargeAuthResponse:
        """
        Description: 查询计收费授权情况
        Summary: 查询计收费授权情况
        """
        UtilClient.validate_model(request)
        return tax_models.QueryChargeAuthResponse().from_map(
            self.do_request('1.0', 'blockchain.tax.charge.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_charge_auth_ex_async(
        self,
        request: tax_models.QueryChargeAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryChargeAuthResponse:
        """
        Description: 查询计收费授权情况
        Summary: 查询计收费授权情况
        """
        UtilClient.validate_model(request)
        return tax_models.QueryChargeAuthResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.tax.charge.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_icm_invoice(
        self,
        request: tax_models.PushIcmInvoiceRequest,
    ) -> tax_models.PushIcmInvoiceResponse:
        """
        Description: 目前仅用于广州区块链发票信息推送
        Summary:  区块链发票信息推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_icm_invoice_ex(request, headers, runtime)

    async def push_icm_invoice_async(
        self,
        request: tax_models.PushIcmInvoiceRequest,
    ) -> tax_models.PushIcmInvoiceResponse:
        """
        Description: 目前仅用于广州区块链发票信息推送
        Summary:  区块链发票信息推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_icm_invoice_ex_async(request, headers, runtime)

    def push_icm_invoice_ex(
        self,
        request: tax_models.PushIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PushIcmInvoiceResponse:
        """
        Description: 目前仅用于广州区块链发票信息推送
        Summary:  区块链发票信息推送
        """
        UtilClient.validate_model(request)
        return tax_models.PushIcmInvoiceResponse().from_map(
            self.do_request('1.0', 'blockchain.tax.icm.invoice.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_icm_invoice_ex_async(
        self,
        request: tax_models.PushIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PushIcmInvoiceResponse:
        """
        Description: 目前仅用于广州区块链发票信息推送
        Summary:  区块链发票信息推送
        """
        UtilClient.validate_model(request)
        return tax_models.PushIcmInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.tax.icm.invoice.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_icm_invoice(
        self,
        request: tax_models.QueryIcmInvoiceRequest,
    ) -> tax_models.QueryIcmInvoiceResponse:
        """
        Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
        Summary:  区块链发票信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_icm_invoice_ex(request, headers, runtime)

    async def query_icm_invoice_async(
        self,
        request: tax_models.QueryIcmInvoiceRequest,
    ) -> tax_models.QueryIcmInvoiceResponse:
        """
        Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
        Summary:  区块链发票信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_icm_invoice_ex_async(request, headers, runtime)

    def query_icm_invoice_ex(
        self,
        request: tax_models.QueryIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryIcmInvoiceResponse:
        """
        Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
        Summary:  区块链发票信息查询
        """
        UtilClient.validate_model(request)
        return tax_models.QueryIcmInvoiceResponse().from_map(
            self.do_request('1.0', 'blockchain.tax.icm.invoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_icm_invoice_ex_async(
        self,
        request: tax_models.QueryIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryIcmInvoiceResponse:
        """
        Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
        Summary:  区块链发票信息查询
        """
        UtilClient.validate_model(request)
        return tax_models.QueryIcmInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.tax.icm.invoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_icm_invoiceinfo(
        self,
        request: tax_models.PushIcmInvoiceinfoRequest,
    ) -> tax_models.PushIcmInvoiceinfoResponse:
        """
        Description: 标准发票推送
        Summary: 标准发票推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_icm_invoiceinfo_ex(request, headers, runtime)

    async def push_icm_invoiceinfo_async(
        self,
        request: tax_models.PushIcmInvoiceinfoRequest,
    ) -> tax_models.PushIcmInvoiceinfoResponse:
        """
        Description: 标准发票推送
        Summary: 标准发票推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_icm_invoiceinfo_ex_async(request, headers, runtime)

    def push_icm_invoiceinfo_ex(
        self,
        request: tax_models.PushIcmInvoiceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PushIcmInvoiceinfoResponse:
        """
        Description: 标准发票推送
        Summary: 标准发票推送
        """
        UtilClient.validate_model(request)
        return tax_models.PushIcmInvoiceinfoResponse().from_map(
            self.do_request('1.0', 'blockchain.tax.icm.invoiceinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_icm_invoiceinfo_ex_async(
        self,
        request: tax_models.PushIcmInvoiceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PushIcmInvoiceinfoResponse:
        """
        Description: 标准发票推送
        Summary: 标准发票推送
        """
        UtilClient.validate_model(request)
        return tax_models.PushIcmInvoiceinfoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.tax.icm.invoiceinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
