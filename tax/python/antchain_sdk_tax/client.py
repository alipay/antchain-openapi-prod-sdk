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
            # 规则
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
                    'sdk_version': '1.8.42',
                    '_prod_code': 'TAX',
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
            # 规则
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
                    'sdk_version': '1.8.42',
                    '_prod_code': 'TAX',
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
        return TeaCore.from_map(
            tax_models.AuthCorpResponse(),
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
        return TeaCore.from_map(
            tax_models.AuthCorpResponse(),
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
        return TeaCore.from_map(
            tax_models.PushChargeResponse(),
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
        return TeaCore.from_map(
            tax_models.PushChargeResponse(),
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
        return TeaCore.from_map(
            tax_models.QueryChargeAuthResponse(),
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
        return TeaCore.from_map(
            tax_models.QueryChargeAuthResponse(),
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
        return TeaCore.from_map(
            tax_models.PushIcmInvoiceResponse(),
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
        return TeaCore.from_map(
            tax_models.PushIcmInvoiceResponse(),
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
        return TeaCore.from_map(
            tax_models.QueryIcmInvoiceResponse(),
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
        return TeaCore.from_map(
            tax_models.QueryIcmInvoiceResponse(),
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
        return TeaCore.from_map(
            tax_models.PushIcmInvoiceinfoResponse(),
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
        return TeaCore.from_map(
            tax_models.PushIcmInvoiceinfoResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.invoiceinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_icm_invoice(
        self,
        request: tax_models.DescribeIcmInvoiceRequest,
    ) -> tax_models.DescribeIcmInvoiceResponse:
        """
        Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
        Summary: 获取数据的上链信息描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_icm_invoice_ex(request, headers, runtime)

    async def describe_icm_invoice_async(
        self,
        request: tax_models.DescribeIcmInvoiceRequest,
    ) -> tax_models.DescribeIcmInvoiceResponse:
        """
        Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
        Summary: 获取数据的上链信息描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_icm_invoice_ex_async(request, headers, runtime)

    def describe_icm_invoice_ex(
        self,
        request: tax_models.DescribeIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.DescribeIcmInvoiceResponse:
        """
        Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
        Summary: 获取数据的上链信息描述
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.DescribeIcmInvoiceResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.invoice.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_icm_invoice_ex_async(
        self,
        request: tax_models.DescribeIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.DescribeIcmInvoiceResponse:
        """
        Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
        Summary: 获取数据的上链信息描述
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.DescribeIcmInvoiceResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.invoice.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_icm_invoice(
        self,
        request: tax_models.AuthIcmInvoiceRequest,
    ) -> tax_models.AuthIcmInvoiceResponse:
        """
        Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
        Summary: 区块链银行授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_icm_invoice_ex(request, headers, runtime)

    async def auth_icm_invoice_async(
        self,
        request: tax_models.AuthIcmInvoiceRequest,
    ) -> tax_models.AuthIcmInvoiceResponse:
        """
        Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
        Summary: 区块链银行授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_icm_invoice_ex_async(request, headers, runtime)

    def auth_icm_invoice_ex(
        self,
        request: tax_models.AuthIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthIcmInvoiceResponse:
        """
        Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
        Summary: 区块链银行授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthIcmInvoiceResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.invoice.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_icm_invoice_ex_async(
        self,
        request: tax_models.AuthIcmInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthIcmInvoiceResponse:
        """
        Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
        Summary: 区块链银行授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthIcmInvoiceResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.invoice.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_icm_realperson(
        self,
        request: tax_models.AuthIcmRealpersonRequest,
    ) -> tax_models.AuthIcmRealpersonResponse:
        """
        Description: 个人数据使用授权
        Summary: 个人数据使用授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_icm_realperson_ex(request, headers, runtime)

    async def auth_icm_realperson_async(
        self,
        request: tax_models.AuthIcmRealpersonRequest,
    ) -> tax_models.AuthIcmRealpersonResponse:
        """
        Description: 个人数据使用授权
        Summary: 个人数据使用授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_icm_realperson_ex_async(request, headers, runtime)

    def auth_icm_realperson_ex(
        self,
        request: tax_models.AuthIcmRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthIcmRealpersonResponse:
        """
        Description: 个人数据使用授权
        Summary: 个人数据使用授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthIcmRealpersonResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.realperson.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_icm_realperson_ex_async(
        self,
        request: tax_models.AuthIcmRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthIcmRealpersonResponse:
        """
        Description: 个人数据使用授权
        Summary: 个人数据使用授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthIcmRealpersonResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.realperson.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_icm_syncgathering(
        self,
        request: tax_models.ExecIcmSyncgatheringRequest,
    ) -> tax_models.ExecIcmSyncgatheringResponse:
        """
        Description: 采集，不限制同步 异步
        Summary: 采集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_icm_syncgathering_ex(request, headers, runtime)

    async def exec_icm_syncgathering_async(
        self,
        request: tax_models.ExecIcmSyncgatheringRequest,
    ) -> tax_models.ExecIcmSyncgatheringResponse:
        """
        Description: 采集，不限制同步 异步
        Summary: 采集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_icm_syncgathering_ex_async(request, headers, runtime)

    def exec_icm_syncgathering_ex(
        self,
        request: tax_models.ExecIcmSyncgatheringRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecIcmSyncgatheringResponse:
        """
        Description: 采集，不限制同步 异步
        Summary: 采集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecIcmSyncgatheringResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.syncgathering.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_icm_syncgathering_ex_async(
        self,
        request: tax_models.ExecIcmSyncgatheringRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecIcmSyncgatheringResponse:
        """
        Description: 采集，不限制同步 异步
        Summary: 采集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecIcmSyncgatheringResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.syncgathering.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_authteplate(
        self,
        request: tax_models.QueryApiAuthteplateRequest,
    ) -> tax_models.QueryApiAuthteplateResponse:
        """
        Description: 获取授权模版和token
        Summary: 获取授权模版和token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_authteplate_ex(request, headers, runtime)

    async def query_api_authteplate_async(
        self,
        request: tax_models.QueryApiAuthteplateRequest,
    ) -> tax_models.QueryApiAuthteplateResponse:
        """
        Description: 获取授权模版和token
        Summary: 获取授权模版和token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_authteplate_ex_async(request, headers, runtime)

    def query_api_authteplate_ex(
        self,
        request: tax_models.QueryApiAuthteplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiAuthteplateResponse:
        """
        Description: 获取授权模版和token
        Summary: 获取授权模版和token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiAuthteplateResponse(),
            self.do_request('1.0', 'blockchain.tax.api.authteplate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_authteplate_ex_async(
        self,
        request: tax_models.QueryApiAuthteplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiAuthteplateResponse:
        """
        Description: 获取授权模版和token
        Summary: 获取授权模版和token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiAuthteplateResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.authteplate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_api_authtemplate(
        self,
        request: tax_models.ExecApiAuthtemplateRequest,
    ) -> tax_models.ExecApiAuthtemplateResponse:
        """
        Description: 提交
        Summary: 提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_api_authtemplate_ex(request, headers, runtime)

    async def exec_api_authtemplate_async(
        self,
        request: tax_models.ExecApiAuthtemplateRequest,
    ) -> tax_models.ExecApiAuthtemplateResponse:
        """
        Description: 提交
        Summary: 提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_api_authtemplate_ex_async(request, headers, runtime)

    def exec_api_authtemplate_ex(
        self,
        request: tax_models.ExecApiAuthtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecApiAuthtemplateResponse:
        """
        Description: 提交
        Summary: 提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecApiAuthtemplateResponse(),
            self.do_request('1.0', 'blockchain.tax.api.authtemplate.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_api_authtemplate_ex_async(
        self,
        request: tax_models.ExecApiAuthtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecApiAuthtemplateResponse:
        """
        Description: 提交
        Summary: 提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecApiAuthtemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.authtemplate.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_authtemplatedefine(
        self,
        request: tax_models.QueryApiAuthtemplatedefineRequest,
    ) -> tax_models.QueryApiAuthtemplatedefineResponse:
        """
        Description: 获取要素信息
        Summary: 获取要素信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_authtemplatedefine_ex(request, headers, runtime)

    async def query_api_authtemplatedefine_async(
        self,
        request: tax_models.QueryApiAuthtemplatedefineRequest,
    ) -> tax_models.QueryApiAuthtemplatedefineResponse:
        """
        Description: 获取要素信息
        Summary: 获取要素信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_authtemplatedefine_ex_async(request, headers, runtime)

    def query_api_authtemplatedefine_ex(
        self,
        request: tax_models.QueryApiAuthtemplatedefineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiAuthtemplatedefineResponse:
        """
        Description: 获取要素信息
        Summary: 获取要素信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiAuthtemplatedefineResponse(),
            self.do_request('1.0', 'blockchain.tax.api.authtemplatedefine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_authtemplatedefine_ex_async(
        self,
        request: tax_models.QueryApiAuthtemplatedefineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiAuthtemplatedefineResponse:
        """
        Description: 获取要素信息
        Summary: 获取要素信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiAuthtemplatedefineResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.authtemplatedefine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_authtemplateresult(
        self,
        request: tax_models.QueryApiAuthtemplateresultRequest,
    ) -> tax_models.QueryApiAuthtemplateresultResponse:
        """
        Description: 获取授权结果
        Summary: 获取授权结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_authtemplateresult_ex(request, headers, runtime)

    async def query_api_authtemplateresult_async(
        self,
        request: tax_models.QueryApiAuthtemplateresultRequest,
    ) -> tax_models.QueryApiAuthtemplateresultResponse:
        """
        Description: 获取授权结果
        Summary: 获取授权结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_authtemplateresult_ex_async(request, headers, runtime)

    def query_api_authtemplateresult_ex(
        self,
        request: tax_models.QueryApiAuthtemplateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiAuthtemplateresultResponse:
        """
        Description: 获取授权结果
        Summary: 获取授权结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiAuthtemplateresultResponse(),
            self.do_request('1.0', 'blockchain.tax.api.authtemplateresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_authtemplateresult_ex_async(
        self,
        request: tax_models.QueryApiAuthtemplateresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiAuthtemplateresultResponse:
        """
        Description: 获取授权结果
        Summary: 获取授权结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiAuthtemplateresultResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.authtemplateresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_icm_enterprise(
        self,
        request: tax_models.AuthIcmEnterpriseRequest,
    ) -> tax_models.AuthIcmEnterpriseResponse:
        """
        Description: 授权接口
        Summary: 授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_icm_enterprise_ex(request, headers, runtime)

    async def auth_icm_enterprise_async(
        self,
        request: tax_models.AuthIcmEnterpriseRequest,
    ) -> tax_models.AuthIcmEnterpriseResponse:
        """
        Description: 授权接口
        Summary: 授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_icm_enterprise_ex_async(request, headers, runtime)

    def auth_icm_enterprise_ex(
        self,
        request: tax_models.AuthIcmEnterpriseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthIcmEnterpriseResponse:
        """
        Description: 授权接口
        Summary: 授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthIcmEnterpriseResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.enterprise.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_icm_enterprise_ex_async(
        self,
        request: tax_models.AuthIcmEnterpriseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthIcmEnterpriseResponse:
        """
        Description: 授权接口
        Summary: 授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthIcmEnterpriseResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.enterprise.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_api_authurl(
        self,
        request: tax_models.CreateApiAuthurlRequest,
    ) -> tax_models.CreateApiAuthurlResponse:
        """
        Description: 该接口为支持授权链接的生成
        Summary: 可信授权链接获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_api_authurl_ex(request, headers, runtime)

    async def create_api_authurl_async(
        self,
        request: tax_models.CreateApiAuthurlRequest,
    ) -> tax_models.CreateApiAuthurlResponse:
        """
        Description: 该接口为支持授权链接的生成
        Summary: 可信授权链接获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_api_authurl_ex_async(request, headers, runtime)

    def create_api_authurl_ex(
        self,
        request: tax_models.CreateApiAuthurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.CreateApiAuthurlResponse:
        """
        Description: 该接口为支持授权链接的生成
        Summary: 可信授权链接获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.CreateApiAuthurlResponse(),
            self.do_request('1.0', 'blockchain.tax.api.authurl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_api_authurl_ex_async(
        self,
        request: tax_models.CreateApiAuthurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.CreateApiAuthurlResponse:
        """
        Description: 该接口为支持授权链接的生成
        Summary: 可信授权链接获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.CreateApiAuthurlResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.authurl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_icm_simpleauth(
        self,
        request: tax_models.MatchIcmSimpleauthRequest,
    ) -> tax_models.MatchIcmSimpleauthResponse:
        """
        Description: 极简授权-判断该企业是否支持要素授权
        Summary: 极简授权-判断该企业是否支持要素授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_icm_simpleauth_ex(request, headers, runtime)

    async def match_icm_simpleauth_async(
        self,
        request: tax_models.MatchIcmSimpleauthRequest,
    ) -> tax_models.MatchIcmSimpleauthResponse:
        """
        Description: 极简授权-判断该企业是否支持要素授权
        Summary: 极简授权-判断该企业是否支持要素授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_icm_simpleauth_ex_async(request, headers, runtime)

    def match_icm_simpleauth_ex(
        self,
        request: tax_models.MatchIcmSimpleauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.MatchIcmSimpleauthResponse:
        """
        Description: 极简授权-判断该企业是否支持要素授权
        Summary: 极简授权-判断该企业是否支持要素授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.MatchIcmSimpleauthResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.simpleauth.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_icm_simpleauth_ex_async(
        self,
        request: tax_models.MatchIcmSimpleauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.MatchIcmSimpleauthResponse:
        """
        Description: 极简授权-判断该企业是否支持要素授权
        Summary: 极简授权-判断该企业是否支持要素授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.MatchIcmSimpleauthResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.simpleauth.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_icm_simpleauth(
        self,
        request: tax_models.QueryIcmSimpleauthRequest,
    ) -> tax_models.QueryIcmSimpleauthResponse:
        """
        Description: 极简授权-获取数据，用于获取指标类的数据
        Summary: 极简授权-获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_icm_simpleauth_ex(request, headers, runtime)

    async def query_icm_simpleauth_async(
        self,
        request: tax_models.QueryIcmSimpleauthRequest,
    ) -> tax_models.QueryIcmSimpleauthResponse:
        """
        Description: 极简授权-获取数据，用于获取指标类的数据
        Summary: 极简授权-获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_icm_simpleauth_ex_async(request, headers, runtime)

    def query_icm_simpleauth_ex(
        self,
        request: tax_models.QueryIcmSimpleauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryIcmSimpleauthResponse:
        """
        Description: 极简授权-获取数据，用于获取指标类的数据
        Summary: 极简授权-获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryIcmSimpleauthResponse(),
            self.do_request('1.0', 'blockchain.tax.icm.simpleauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_icm_simpleauth_ex_async(
        self,
        request: tax_models.QueryIcmSimpleauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryIcmSimpleauthResponse:
        """
        Description: 极简授权-获取数据，用于获取指标类的数据
        Summary: 极简授权-获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryIcmSimpleauthResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.icm.simpleauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_simpleauthasync(
        self,
        request: tax_models.QueryApiSimpleauthasyncRequest,
    ) -> tax_models.QueryApiSimpleauthasyncResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_simpleauthasync_ex(request, headers, runtime)

    async def query_api_simpleauthasync_async(
        self,
        request: tax_models.QueryApiSimpleauthasyncRequest,
    ) -> tax_models.QueryApiSimpleauthasyncResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_simpleauthasync_ex_async(request, headers, runtime)

    def query_api_simpleauthasync_ex(
        self,
        request: tax_models.QueryApiSimpleauthasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiSimpleauthasyncResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiSimpleauthasyncResponse(),
            self.do_request('1.0', 'blockchain.tax.api.simpleauthasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_simpleauthasync_ex_async(
        self,
        request: tax_models.QueryApiSimpleauthasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiSimpleauthasyncResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiSimpleauthasyncResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.simpleauthasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_risk_evaluation(
        self,
        request: tax_models.AuthRiskEvaluationRequest,
    ) -> tax_models.AuthRiskEvaluationResponse:
        """
        Description: 授权接口
        Summary: 授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_risk_evaluation_ex(request, headers, runtime)

    async def auth_risk_evaluation_async(
        self,
        request: tax_models.AuthRiskEvaluationRequest,
    ) -> tax_models.AuthRiskEvaluationResponse:
        """
        Description: 授权接口
        Summary: 授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_risk_evaluation_ex_async(request, headers, runtime)

    def auth_risk_evaluation_ex(
        self,
        request: tax_models.AuthRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthRiskEvaluationResponse:
        """
        Description: 授权接口
        Summary: 授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthRiskEvaluationResponse(),
            self.do_request('1.0', 'blockchain.tax.risk.evaluation.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_risk_evaluation_ex_async(
        self,
        request: tax_models.AuthRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.AuthRiskEvaluationResponse:
        """
        Description: 授权接口
        Summary: 授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.AuthRiskEvaluationResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.risk.evaluation.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk_evaluation(
        self,
        request: tax_models.QueryRiskEvaluationRequest,
    ) -> tax_models.QueryRiskEvaluationResponse:
        """
        Description: 查询
        Summary: 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_evaluation_ex(request, headers, runtime)

    async def query_risk_evaluation_async(
        self,
        request: tax_models.QueryRiskEvaluationRequest,
    ) -> tax_models.QueryRiskEvaluationResponse:
        """
        Description: 查询
        Summary: 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_evaluation_ex_async(request, headers, runtime)

    def query_risk_evaluation_ex(
        self,
        request: tax_models.QueryRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryRiskEvaluationResponse:
        """
        Description: 查询
        Summary: 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryRiskEvaluationResponse(),
            self.do_request('1.0', 'blockchain.tax.risk.evaluation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_evaluation_ex_async(
        self,
        request: tax_models.QueryRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryRiskEvaluationResponse:
        """
        Description: 查询
        Summary: 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryRiskEvaluationResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.risk.evaluation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_api_simpleauthasyncpolling(
        self,
        request: tax_models.PullApiSimpleauthasyncpollingRequest,
    ) -> tax_models.PullApiSimpleauthasyncpollingResponse:
        """
        Description: 极简授权-异步查询数据-轮询拉取结果
        Summary: 极简授权-异步查询数据-轮询拉取结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_api_simpleauthasyncpolling_ex(request, headers, runtime)

    async def pull_api_simpleauthasyncpolling_async(
        self,
        request: tax_models.PullApiSimpleauthasyncpollingRequest,
    ) -> tax_models.PullApiSimpleauthasyncpollingResponse:
        """
        Description: 极简授权-异步查询数据-轮询拉取结果
        Summary: 极简授权-异步查询数据-轮询拉取结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_api_simpleauthasyncpolling_ex_async(request, headers, runtime)

    def pull_api_simpleauthasyncpolling_ex(
        self,
        request: tax_models.PullApiSimpleauthasyncpollingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PullApiSimpleauthasyncpollingResponse:
        """
        Description: 极简授权-异步查询数据-轮询拉取结果
        Summary: 极简授权-异步查询数据-轮询拉取结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.PullApiSimpleauthasyncpollingResponse(),
            self.do_request('1.0', 'blockchain.tax.api.simpleauthasyncpolling.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_api_simpleauthasyncpolling_ex_async(
        self,
        request: tax_models.PullApiSimpleauthasyncpollingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PullApiSimpleauthasyncpollingResponse:
        """
        Description: 极简授权-异步查询数据-轮询拉取结果
        Summary: 极简授权-异步查询数据-轮询拉取结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.PullApiSimpleauthasyncpollingResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.simpleauthasyncpolling.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_simpleauthstandard(
        self,
        request: tax_models.QueryApiSimpleauthstandardRequest,
    ) -> tax_models.QueryApiSimpleauthstandardResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_simpleauthstandard_ex(request, headers, runtime)

    async def query_api_simpleauthstandard_async(
        self,
        request: tax_models.QueryApiSimpleauthstandardRequest,
    ) -> tax_models.QueryApiSimpleauthstandardResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_simpleauthstandard_ex_async(request, headers, runtime)

    def query_api_simpleauthstandard_ex(
        self,
        request: tax_models.QueryApiSimpleauthstandardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiSimpleauthstandardResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiSimpleauthstandardResponse(),
            self.do_request('1.0', 'blockchain.tax.api.simpleauthstandard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_simpleauthstandard_ex_async(
        self,
        request: tax_models.QueryApiSimpleauthstandardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiSimpleauthstandardResponse:
        """
        Description: 极简授权异步查询接口
        Summary: 极简授权-异步获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiSimpleauthstandardResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.simpleauthstandard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_api_simpleauthmark(
        self,
        request: tax_models.ExecApiSimpleauthmarkRequest,
    ) -> tax_models.ExecApiSimpleauthmarkResponse:
        """
        Description: 给对应的税号进行打标
        Summary: 要素授权打标接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_api_simpleauthmark_ex(request, headers, runtime)

    async def exec_api_simpleauthmark_async(
        self,
        request: tax_models.ExecApiSimpleauthmarkRequest,
    ) -> tax_models.ExecApiSimpleauthmarkResponse:
        """
        Description: 给对应的税号进行打标
        Summary: 要素授权打标接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_api_simpleauthmark_ex_async(request, headers, runtime)

    def exec_api_simpleauthmark_ex(
        self,
        request: tax_models.ExecApiSimpleauthmarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecApiSimpleauthmarkResponse:
        """
        Description: 给对应的税号进行打标
        Summary: 要素授权打标接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecApiSimpleauthmarkResponse(),
            self.do_request('1.0', 'blockchain.tax.api.simpleauthmark.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_api_simpleauthmark_ex_async(
        self,
        request: tax_models.ExecApiSimpleauthmarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecApiSimpleauthmarkResponse:
        """
        Description: 给对应的税号进行打标
        Summary: 要素授权打标接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecApiSimpleauthmarkResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.simpleauthmark.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_api_simpleauthmark(
        self,
        request: tax_models.SubmitApiSimpleauthmarkRequest,
    ) -> tax_models.SubmitApiSimpleauthmarkResponse:
        """
        Description: 提交打标结果，仅限内部使用
        Summary: 提交打标结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_api_simpleauthmark_ex(request, headers, runtime)

    async def submit_api_simpleauthmark_async(
        self,
        request: tax_models.SubmitApiSimpleauthmarkRequest,
    ) -> tax_models.SubmitApiSimpleauthmarkResponse:
        """
        Description: 提交打标结果，仅限内部使用
        Summary: 提交打标结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_api_simpleauthmark_ex_async(request, headers, runtime)

    def submit_api_simpleauthmark_ex(
        self,
        request: tax_models.SubmitApiSimpleauthmarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.SubmitApiSimpleauthmarkResponse:
        """
        Description: 提交打标结果，仅限内部使用
        Summary: 提交打标结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.SubmitApiSimpleauthmarkResponse(),
            self.do_request('1.0', 'blockchain.tax.api.simpleauthmark.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_api_simpleauthmark_ex_async(
        self,
        request: tax_models.SubmitApiSimpleauthmarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.SubmitApiSimpleauthmarkResponse:
        """
        Description: 提交打标结果，仅限内部使用
        Summary: 提交打标结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.SubmitApiSimpleauthmarkResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.simpleauthmark.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_api_simpleauthmark(
        self,
        request: tax_models.PullApiSimpleauthmarkRequest,
    ) -> tax_models.PullApiSimpleauthmarkResponse:
        """
        Description: blockchain.tax.api.simpleauthmark.exec
        Summary: 数据打标拉取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_api_simpleauthmark_ex(request, headers, runtime)

    async def pull_api_simpleauthmark_async(
        self,
        request: tax_models.PullApiSimpleauthmarkRequest,
    ) -> tax_models.PullApiSimpleauthmarkResponse:
        """
        Description: blockchain.tax.api.simpleauthmark.exec
        Summary: 数据打标拉取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_api_simpleauthmark_ex_async(request, headers, runtime)

    def pull_api_simpleauthmark_ex(
        self,
        request: tax_models.PullApiSimpleauthmarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PullApiSimpleauthmarkResponse:
        """
        Description: blockchain.tax.api.simpleauthmark.exec
        Summary: 数据打标拉取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.PullApiSimpleauthmarkResponse(),
            self.do_request('1.0', 'blockchain.tax.api.simpleauthmark.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_api_simpleauthmark_ex_async(
        self,
        request: tax_models.PullApiSimpleauthmarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PullApiSimpleauthmarkResponse:
        """
        Description: blockchain.tax.api.simpleauthmark.exec
        Summary: 数据打标拉取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.PullApiSimpleauthmarkResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.simpleauthmark.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_risk_evaluation(
        self,
        request: tax_models.SyncRiskEvaluationRequest,
    ) -> tax_models.SyncRiskEvaluationResponse:
        """
        Description: 查询-同步返回提额数据
        Summary: 查询-同步提额数据返回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_risk_evaluation_ex(request, headers, runtime)

    async def sync_risk_evaluation_async(
        self,
        request: tax_models.SyncRiskEvaluationRequest,
    ) -> tax_models.SyncRiskEvaluationResponse:
        """
        Description: 查询-同步返回提额数据
        Summary: 查询-同步提额数据返回
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_risk_evaluation_ex_async(request, headers, runtime)

    def sync_risk_evaluation_ex(
        self,
        request: tax_models.SyncRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.SyncRiskEvaluationResponse:
        """
        Description: 查询-同步返回提额数据
        Summary: 查询-同步提额数据返回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.SyncRiskEvaluationResponse(),
            self.do_request('1.0', 'blockchain.tax.risk.evaluation.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_risk_evaluation_ex_async(
        self,
        request: tax_models.SyncRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.SyncRiskEvaluationResponse:
        """
        Description: 查询-同步返回提额数据
        Summary: 查询-同步提额数据返回
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.SyncRiskEvaluationResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.risk.evaluation.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_simpleauth_identitystate(
        self,
        request: tax_models.QuerySimpleauthIdentitystateRequest,
    ) -> tax_models.QuerySimpleauthIdentitystateResponse:
        """
        Description: 纳税人状态查询
        Summary: 纳税人状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_simpleauth_identitystate_ex(request, headers, runtime)

    async def query_simpleauth_identitystate_async(
        self,
        request: tax_models.QuerySimpleauthIdentitystateRequest,
    ) -> tax_models.QuerySimpleauthIdentitystateResponse:
        """
        Description: 纳税人状态查询
        Summary: 纳税人状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_simpleauth_identitystate_ex_async(request, headers, runtime)

    def query_simpleauth_identitystate_ex(
        self,
        request: tax_models.QuerySimpleauthIdentitystateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QuerySimpleauthIdentitystateResponse:
        """
        Description: 纳税人状态查询
        Summary: 纳税人状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QuerySimpleauthIdentitystateResponse(),
            self.do_request('1.0', 'blockchain.tax.simpleauth.identitystate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_simpleauth_identitystate_ex_async(
        self,
        request: tax_models.QuerySimpleauthIdentitystateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QuerySimpleauthIdentitystateResponse:
        """
        Description: 纳税人状态查询
        Summary: 纳税人状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QuerySimpleauthIdentitystateResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.simpleauth.identitystate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_haiguanasync(
        self,
        request: tax_models.QueryApiHaiguanasyncRequest,
    ) -> tax_models.QueryApiHaiguanasyncResponse:
        """
        Description: 海关-异步查询数据
        Summary: 海关-异步查询数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_haiguanasync_ex(request, headers, runtime)

    async def query_api_haiguanasync_async(
        self,
        request: tax_models.QueryApiHaiguanasyncRequest,
    ) -> tax_models.QueryApiHaiguanasyncResponse:
        """
        Description: 海关-异步查询数据
        Summary: 海关-异步查询数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_haiguanasync_ex_async(request, headers, runtime)

    def query_api_haiguanasync_ex(
        self,
        request: tax_models.QueryApiHaiguanasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiHaiguanasyncResponse:
        """
        Description: 海关-异步查询数据
        Summary: 海关-异步查询数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiHaiguanasyncResponse(),
            self.do_request('1.0', 'blockchain.tax.api.haiguanasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_haiguanasync_ex_async(
        self,
        request: tax_models.QueryApiHaiguanasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiHaiguanasyncResponse:
        """
        Description: 海关-异步查询数据
        Summary: 海关-异步查询数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiHaiguanasyncResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.haiguanasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_api_haiguanasyncpolling(
        self,
        request: tax_models.PullApiHaiguanasyncpollingRequest,
    ) -> tax_models.PullApiHaiguanasyncpollingResponse:
        """
        Description: 海关-异步查询数据-轮询拉取数据
        Summary: 海关-异步查询数据-轮询拉取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_api_haiguanasyncpolling_ex(request, headers, runtime)

    async def pull_api_haiguanasyncpolling_async(
        self,
        request: tax_models.PullApiHaiguanasyncpollingRequest,
    ) -> tax_models.PullApiHaiguanasyncpollingResponse:
        """
        Description: 海关-异步查询数据-轮询拉取数据
        Summary: 海关-异步查询数据-轮询拉取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_api_haiguanasyncpolling_ex_async(request, headers, runtime)

    def pull_api_haiguanasyncpolling_ex(
        self,
        request: tax_models.PullApiHaiguanasyncpollingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PullApiHaiguanasyncpollingResponse:
        """
        Description: 海关-异步查询数据-轮询拉取数据
        Summary: 海关-异步查询数据-轮询拉取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.PullApiHaiguanasyncpollingResponse(),
            self.do_request('1.0', 'blockchain.tax.api.haiguanasyncpolling.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_api_haiguanasyncpolling_ex_async(
        self,
        request: tax_models.PullApiHaiguanasyncpollingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.PullApiHaiguanasyncpollingResponse:
        """
        Description: 海关-异步查询数据-轮询拉取数据
        Summary: 海关-异步查询数据-轮询拉取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.PullApiHaiguanasyncpollingResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.haiguanasyncpolling.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_risk_evaluation(
        self,
        request: tax_models.StartRiskEvaluationRequest,
    ) -> tax_models.StartRiskEvaluationResponse:
        """
        Description: 提额资质评估授权并查询,支持省级查询
        Summary: 提额资质评估授权并查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_risk_evaluation_ex(request, headers, runtime)

    async def start_risk_evaluation_async(
        self,
        request: tax_models.StartRiskEvaluationRequest,
    ) -> tax_models.StartRiskEvaluationResponse:
        """
        Description: 提额资质评估授权并查询,支持省级查询
        Summary: 提额资质评估授权并查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_risk_evaluation_ex_async(request, headers, runtime)

    def start_risk_evaluation_ex(
        self,
        request: tax_models.StartRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.StartRiskEvaluationResponse:
        """
        Description: 提额资质评估授权并查询,支持省级查询
        Summary: 提额资质评估授权并查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.StartRiskEvaluationResponse(),
            self.do_request('1.0', 'blockchain.tax.risk.evaluation.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_risk_evaluation_ex_async(
        self,
        request: tax_models.StartRiskEvaluationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.StartRiskEvaluationResponse:
        """
        Description: 提额资质评估授权并查询,支持省级查询
        Summary: 提额资质评估授权并查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.StartRiskEvaluationResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.risk.evaluation.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterprise_electronicasync(
        self,
        request: tax_models.QueryEnterpriseElectronicasyncRequest,
    ) -> tax_models.QueryEnterpriseElectronicasyncResponse:
        """
        Description: 电力异步接口
        Summary: 电力异步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterprise_electronicasync_ex(request, headers, runtime)

    async def query_enterprise_electronicasync_async(
        self,
        request: tax_models.QueryEnterpriseElectronicasyncRequest,
    ) -> tax_models.QueryEnterpriseElectronicasyncResponse:
        """
        Description: 电力异步接口
        Summary: 电力异步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterprise_electronicasync_ex_async(request, headers, runtime)

    def query_enterprise_electronicasync_ex(
        self,
        request: tax_models.QueryEnterpriseElectronicasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryEnterpriseElectronicasyncResponse:
        """
        Description: 电力异步接口
        Summary: 电力异步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryEnterpriseElectronicasyncResponse(),
            self.do_request('1.0', 'blockchain.tax.enterprise.electronicasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterprise_electronicasync_ex_async(
        self,
        request: tax_models.QueryEnterpriseElectronicasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryEnterpriseElectronicasyncResponse:
        """
        Description: 电力异步接口
        Summary: 电力异步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryEnterpriseElectronicasyncResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.enterprise.electronicasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_api_dataprocess(
        self,
        request: tax_models.QueryApiDataprocessRequest,
    ) -> tax_models.QueryApiDataprocessResponse:
        """
        Description: 查询指定账户的数据
        Summary: 查询指定账户的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_api_dataprocess_ex(request, headers, runtime)

    async def query_api_dataprocess_async(
        self,
        request: tax_models.QueryApiDataprocessRequest,
    ) -> tax_models.QueryApiDataprocessResponse:
        """
        Description: 查询指定账户的数据
        Summary: 查询指定账户的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_api_dataprocess_ex_async(request, headers, runtime)

    def query_api_dataprocess_ex(
        self,
        request: tax_models.QueryApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiDataprocessResponse:
        """
        Description: 查询指定账户的数据
        Summary: 查询指定账户的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiDataprocessResponse(),
            self.do_request('1.0', 'blockchain.tax.api.dataprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_api_dataprocess_ex_async(
        self,
        request: tax_models.QueryApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryApiDataprocessResponse:
        """
        Description: 查询指定账户的数据
        Summary: 查询指定账户的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryApiDataprocessResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.dataprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_api_dataprocess(
        self,
        request: tax_models.InitApiDataprocessRequest,
    ) -> tax_models.InitApiDataprocessResponse:
        """
        Description: 校验当前目标查询数据初始化接口
        Summary: 校验当前目标查询数据初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_api_dataprocess_ex(request, headers, runtime)

    async def init_api_dataprocess_async(
        self,
        request: tax_models.InitApiDataprocessRequest,
    ) -> tax_models.InitApiDataprocessResponse:
        """
        Description: 校验当前目标查询数据初始化接口
        Summary: 校验当前目标查询数据初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_api_dataprocess_ex_async(request, headers, runtime)

    def init_api_dataprocess_ex(
        self,
        request: tax_models.InitApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.InitApiDataprocessResponse:
        """
        Description: 校验当前目标查询数据初始化接口
        Summary: 校验当前目标查询数据初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.InitApiDataprocessResponse(),
            self.do_request('1.0', 'blockchain.tax.api.dataprocess.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_api_dataprocess_ex_async(
        self,
        request: tax_models.InitApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.InitApiDataprocessResponse:
        """
        Description: 校验当前目标查询数据初始化接口
        Summary: 校验当前目标查询数据初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.InitApiDataprocessResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.dataprocess.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def judge_api_dataprocess(
        self,
        request: tax_models.JudgeApiDataprocessRequest,
    ) -> tax_models.JudgeApiDataprocessResponse:
        """
        Description: 数据流转目标客户是否可用接口
        Summary: 数据流转目标客户是否可用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_api_dataprocess_ex(request, headers, runtime)

    async def judge_api_dataprocess_async(
        self,
        request: tax_models.JudgeApiDataprocessRequest,
    ) -> tax_models.JudgeApiDataprocessResponse:
        """
        Description: 数据流转目标客户是否可用接口
        Summary: 数据流转目标客户是否可用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_api_dataprocess_ex_async(request, headers, runtime)

    def judge_api_dataprocess_ex(
        self,
        request: tax_models.JudgeApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.JudgeApiDataprocessResponse:
        """
        Description: 数据流转目标客户是否可用接口
        Summary: 数据流转目标客户是否可用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.JudgeApiDataprocessResponse(),
            self.do_request('1.0', 'blockchain.tax.api.dataprocess.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_api_dataprocess_ex_async(
        self,
        request: tax_models.JudgeApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.JudgeApiDataprocessResponse:
        """
        Description: 数据流转目标客户是否可用接口
        Summary: 数据流转目标客户是否可用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.JudgeApiDataprocessResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.dataprocess.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_api_dataprocess(
        self,
        request: tax_models.ExecApiDataprocessRequest,
    ) -> tax_models.ExecApiDataprocessResponse:
        """
        Description: 初始化与查询合并统一执行接口
        Summary: 初始化与查询合并统一执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_api_dataprocess_ex(request, headers, runtime)

    async def exec_api_dataprocess_async(
        self,
        request: tax_models.ExecApiDataprocessRequest,
    ) -> tax_models.ExecApiDataprocessResponse:
        """
        Description: 初始化与查询合并统一执行接口
        Summary: 初始化与查询合并统一执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_api_dataprocess_ex_async(request, headers, runtime)

    def exec_api_dataprocess_ex(
        self,
        request: tax_models.ExecApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecApiDataprocessResponse:
        """
        Description: 初始化与查询合并统一执行接口
        Summary: 初始化与查询合并统一执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecApiDataprocessResponse(),
            self.do_request('1.0', 'blockchain.tax.api.dataprocess.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_api_dataprocess_ex_async(
        self,
        request: tax_models.ExecApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.ExecApiDataprocessResponse:
        """
        Description: 初始化与查询合并统一执行接口
        Summary: 初始化与查询合并统一执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.ExecApiDataprocessResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.dataprocess.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def run_api_dataprocess(
        self,
        request: tax_models.RunApiDataprocessRequest,
    ) -> tax_models.RunApiDataprocessResponse:
        """
        Description: 数据流转通用执行接口
        Summary: 数据流转通用执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_api_dataprocess_ex(request, headers, runtime)

    async def run_api_dataprocess_async(
        self,
        request: tax_models.RunApiDataprocessRequest,
    ) -> tax_models.RunApiDataprocessResponse:
        """
        Description: 数据流转通用执行接口
        Summary: 数据流转通用执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_api_dataprocess_ex_async(request, headers, runtime)

    def run_api_dataprocess_ex(
        self,
        request: tax_models.RunApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.RunApiDataprocessResponse:
        """
        Description: 数据流转通用执行接口
        Summary: 数据流转通用执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.RunApiDataprocessResponse(),
            self.do_request('1.0', 'blockchain.tax.api.dataprocess.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_api_dataprocess_ex_async(
        self,
        request: tax_models.RunApiDataprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.RunApiDataprocessResponse:
        """
        Description: 数据流转通用执行接口
        Summary: 数据流转通用执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.RunApiDataprocessResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.api.dataprocess.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdata_personalincome(
        self,
        request: tax_models.QueryPdataPersonalincomeRequest,
    ) -> tax_models.QueryPdataPersonalincomeResponse:
        """
        Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
        Summary: 收入评估服务A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdata_personalincome_ex(request, headers, runtime)

    async def query_pdata_personalincome_async(
        self,
        request: tax_models.QueryPdataPersonalincomeRequest,
    ) -> tax_models.QueryPdataPersonalincomeResponse:
        """
        Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
        Summary: 收入评估服务A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdata_personalincome_ex_async(request, headers, runtime)

    def query_pdata_personalincome_ex(
        self,
        request: tax_models.QueryPdataPersonalincomeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataPersonalincomeResponse:
        """
        Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
        Summary: 收入评估服务A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataPersonalincomeResponse(),
            self.do_request('1.0', 'blockchain.tax.pdata.personalincome.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdata_personalincome_ex_async(
        self,
        request: tax_models.QueryPdataPersonalincomeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataPersonalincomeResponse:
        """
        Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
        Summary: 收入评估服务A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataPersonalincomeResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.pdata.personalincome.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdata_socialincome(
        self,
        request: tax_models.QueryPdataSocialincomeRequest,
    ) -> tax_models.QueryPdataSocialincomeResponse:
        """
        Description: 收入评估服务B
        Summary: 收入评估服务B
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdata_socialincome_ex(request, headers, runtime)

    async def query_pdata_socialincome_async(
        self,
        request: tax_models.QueryPdataSocialincomeRequest,
    ) -> tax_models.QueryPdataSocialincomeResponse:
        """
        Description: 收入评估服务B
        Summary: 收入评估服务B
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdata_socialincome_ex_async(request, headers, runtime)

    def query_pdata_socialincome_ex(
        self,
        request: tax_models.QueryPdataSocialincomeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataSocialincomeResponse:
        """
        Description: 收入评估服务B
        Summary: 收入评估服务B
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataSocialincomeResponse(),
            self.do_request('1.0', 'blockchain.tax.pdata.socialincome.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdata_socialincome_ex_async(
        self,
        request: tax_models.QueryPdataSocialincomeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataSocialincomeResponse:
        """
        Description: 收入评估服务B
        Summary: 收入评估服务B
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataSocialincomeResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.pdata.socialincome.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_pdata_marriage(
        self,
        request: tax_models.CheckPdataMarriageRequest,
    ) -> tax_models.CheckPdataMarriageResponse:
        """
        Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
        Summary: 婚姻状况查验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_pdata_marriage_ex(request, headers, runtime)

    async def check_pdata_marriage_async(
        self,
        request: tax_models.CheckPdataMarriageRequest,
    ) -> tax_models.CheckPdataMarriageResponse:
        """
        Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
        Summary: 婚姻状况查验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_pdata_marriage_ex_async(request, headers, runtime)

    def check_pdata_marriage_ex(
        self,
        request: tax_models.CheckPdataMarriageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.CheckPdataMarriageResponse:
        """
        Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
        Summary: 婚姻状况查验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.CheckPdataMarriageResponse(),
            self.do_request('1.0', 'blockchain.tax.pdata.marriage.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_pdata_marriage_ex_async(
        self,
        request: tax_models.CheckPdataMarriageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.CheckPdataMarriageResponse:
        """
        Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
        Summary: 婚姻状况查验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.CheckPdataMarriageResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.pdata.marriage.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdata_risk(
        self,
        request: tax_models.QueryPdataRiskRequest,
    ) -> tax_models.QueryPdataRiskResponse:
        """
        Description: 断卡行动风险识别服务
        Summary: 断卡行动风险识别服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdata_risk_ex(request, headers, runtime)

    async def query_pdata_risk_async(
        self,
        request: tax_models.QueryPdataRiskRequest,
    ) -> tax_models.QueryPdataRiskResponse:
        """
        Description: 断卡行动风险识别服务
        Summary: 断卡行动风险识别服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdata_risk_ex_async(request, headers, runtime)

    def query_pdata_risk_ex(
        self,
        request: tax_models.QueryPdataRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataRiskResponse:
        """
        Description: 断卡行动风险识别服务
        Summary: 断卡行动风险识别服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataRiskResponse(),
            self.do_request('1.0', 'blockchain.tax.pdata.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdata_risk_ex_async(
        self,
        request: tax_models.QueryPdataRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataRiskResponse:
        """
        Description: 断卡行动风险识别服务
        Summary: 断卡行动风险识别服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataRiskResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.pdata.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdata_underwrite(
        self,
        request: tax_models.QueryPdataUnderwriteRequest,
    ) -> tax_models.QueryPdataUnderwriteResponse:
        """
        Description: 核保医疗查询
        Summary: 核保医疗查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdata_underwrite_ex(request, headers, runtime)

    async def query_pdata_underwrite_async(
        self,
        request: tax_models.QueryPdataUnderwriteRequest,
    ) -> tax_models.QueryPdataUnderwriteResponse:
        """
        Description: 核保医疗查询
        Summary: 核保医疗查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdata_underwrite_ex_async(request, headers, runtime)

    def query_pdata_underwrite_ex(
        self,
        request: tax_models.QueryPdataUnderwriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataUnderwriteResponse:
        """
        Description: 核保医疗查询
        Summary: 核保医疗查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataUnderwriteResponse(),
            self.do_request('1.0', 'blockchain.tax.pdata.underwrite.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdata_underwrite_ex_async(
        self,
        request: tax_models.QueryPdataUnderwriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPdataUnderwriteResponse:
        """
        Description: 核保医疗查询
        Summary: 核保医疗查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPdataUnderwriteResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.pdata.underwrite.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_portraiteconomy(
        self,
        request: tax_models.QueryPortraiteconomyRequest,
    ) -> tax_models.QueryPortraiteconomyResponse:
        """
        Description: 经济画像
        Summary: 财富洞察经济画像
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_portraiteconomy_ex(request, headers, runtime)

    async def query_portraiteconomy_async(
        self,
        request: tax_models.QueryPortraiteconomyRequest,
    ) -> tax_models.QueryPortraiteconomyResponse:
        """
        Description: 经济画像
        Summary: 财富洞察经济画像
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_portraiteconomy_ex_async(request, headers, runtime)

    def query_portraiteconomy_ex(
        self,
        request: tax_models.QueryPortraiteconomyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPortraiteconomyResponse:
        """
        Description: 经济画像
        Summary: 财富洞察经济画像
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPortraiteconomyResponse(),
            self.do_request('1.0', 'blockchain.tax.portraiteconomy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_portraiteconomy_ex_async(
        self,
        request: tax_models.QueryPortraiteconomyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tax_models.QueryPortraiteconomyResponse:
        """
        Description: 经济画像
        Summary: 财富洞察经济画像
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tax_models.QueryPortraiteconomyResponse(),
            await self.do_request_async('1.0', 'blockchain.tax.portraiteconomy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
