# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_commercial import models as commercial_models
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
        config: commercial_models.Config,
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
            # 定价约束信息VO
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
                    'sdk_version': '1.0.26'
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
            # 定价约束信息VO
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
                    'sdk_version': '1.0.26'
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

    def query_billingcore_invoice(
        self,
        request: commercial_models.QueryBillingcoreInvoiceRequest,
    ) -> commercial_models.QueryBillingcoreInvoiceResponse:
        """
        Description: 发票信息查询
        Summary: 发票信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_billingcore_invoice_ex(request, headers, runtime)

    async def query_billingcore_invoice_async(
        self,
        request: commercial_models.QueryBillingcoreInvoiceRequest,
    ) -> commercial_models.QueryBillingcoreInvoiceResponse:
        """
        Description: 发票信息查询
        Summary: 发票信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_billingcore_invoice_ex_async(request, headers, runtime)

    def query_billingcore_invoice_ex(
        self,
        request: commercial_models.QueryBillingcoreInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreInvoiceResponse:
        """
        Description: 发票信息查询
        Summary: 发票信息查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreInvoiceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_billingcore_invoice_ex_async(
        self,
        request: commercial_models.QueryBillingcoreInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreInvoiceResponse:
        """
        Description: 发票信息查询
        Summary: 发票信息查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_billingcore_invoiceloc(
        self,
        request: commercial_models.QueryBillingcoreInvoicelocRequest,
    ) -> commercial_models.QueryBillingcoreInvoicelocResponse:
        """
        Description: 发票地址信息查询
        Summary: 发票地址信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_billingcore_invoiceloc_ex(request, headers, runtime)

    async def query_billingcore_invoiceloc_async(
        self,
        request: commercial_models.QueryBillingcoreInvoicelocRequest,
    ) -> commercial_models.QueryBillingcoreInvoicelocResponse:
        """
        Description: 发票地址信息查询
        Summary: 发票地址信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_billingcore_invoiceloc_ex_async(request, headers, runtime)

    def query_billingcore_invoiceloc_ex(
        self,
        request: commercial_models.QueryBillingcoreInvoicelocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreInvoicelocResponse:
        """
        Description: 发票地址信息查询
        Summary: 发票地址信息查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreInvoicelocResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoiceloc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_billingcore_invoiceloc_ex_async(
        self,
        request: commercial_models.QueryBillingcoreInvoicelocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreInvoicelocResponse:
        """
        Description: 发票地址信息查询
        Summary: 发票地址信息查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreInvoicelocResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoiceloc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_billingcore_invoice(
        self,
        request: commercial_models.AddBillingcoreInvoiceRequest,
    ) -> commercial_models.AddBillingcoreInvoiceResponse:
        """
        Description: 新增发票信息
        Summary: 新增发票信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_billingcore_invoice_ex(request, headers, runtime)

    async def add_billingcore_invoice_async(
        self,
        request: commercial_models.AddBillingcoreInvoiceRequest,
    ) -> commercial_models.AddBillingcoreInvoiceResponse:
        """
        Description: 新增发票信息
        Summary: 新增发票信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_billingcore_invoice_ex_async(request, headers, runtime)

    def add_billingcore_invoice_ex(
        self,
        request: commercial_models.AddBillingcoreInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddBillingcoreInvoiceResponse:
        """
        Description: 新增发票信息
        Summary: 新增发票信息
        """
        UtilClient.validate_model(request)
        return commercial_models.AddBillingcoreInvoiceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoice.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_billingcore_invoice_ex_async(
        self,
        request: commercial_models.AddBillingcoreInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddBillingcoreInvoiceResponse:
        """
        Description: 新增发票信息
        Summary: 新增发票信息
        """
        UtilClient.validate_model(request)
        return commercial_models.AddBillingcoreInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoice.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_billingcore_invoice(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceRequest,
    ) -> commercial_models.UpdateBillingcoreInvoiceResponse:
        """
        Description: 更新发票信息
        Summary: 更新发票信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_billingcore_invoice_ex(request, headers, runtime)

    async def update_billingcore_invoice_async(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceRequest,
    ) -> commercial_models.UpdateBillingcoreInvoiceResponse:
        """
        Description: 更新发票信息
        Summary: 更新发票信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_billingcore_invoice_ex_async(request, headers, runtime)

    def update_billingcore_invoice_ex(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateBillingcoreInvoiceResponse:
        """
        Description: 更新发票信息
        Summary: 更新发票信息
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateBillingcoreInvoiceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_billingcore_invoice_ex_async(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateBillingcoreInvoiceResponse:
        """
        Description: 更新发票信息
        Summary: 更新发票信息
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateBillingcoreInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_billingcore_invoiceaddress(
        self,
        request: commercial_models.AddBillingcoreInvoiceaddressRequest,
    ) -> commercial_models.AddBillingcoreInvoiceaddressResponse:
        """
        Description: 新增发票地址
        Summary: 新增发票地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_billingcore_invoiceaddress_ex(request, headers, runtime)

    async def add_billingcore_invoiceaddress_async(
        self,
        request: commercial_models.AddBillingcoreInvoiceaddressRequest,
    ) -> commercial_models.AddBillingcoreInvoiceaddressResponse:
        """
        Description: 新增发票地址
        Summary: 新增发票地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_billingcore_invoiceaddress_ex_async(request, headers, runtime)

    def add_billingcore_invoiceaddress_ex(
        self,
        request: commercial_models.AddBillingcoreInvoiceaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddBillingcoreInvoiceaddressResponse:
        """
        Description: 新增发票地址
        Summary: 新增发票地址
        """
        UtilClient.validate_model(request)
        return commercial_models.AddBillingcoreInvoiceaddressResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoiceaddress.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_billingcore_invoiceaddress_ex_async(
        self,
        request: commercial_models.AddBillingcoreInvoiceaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddBillingcoreInvoiceaddressResponse:
        """
        Description: 新增发票地址
        Summary: 新增发票地址
        """
        UtilClient.validate_model(request)
        return commercial_models.AddBillingcoreInvoiceaddressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoiceaddress.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_billingcore_invoiceaddress(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceaddressRequest,
    ) -> commercial_models.UpdateBillingcoreInvoiceaddressResponse:
        """
        Description: 更新发票地址信息
        Summary: 更新发票地址信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_billingcore_invoiceaddress_ex(request, headers, runtime)

    async def update_billingcore_invoiceaddress_async(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceaddressRequest,
    ) -> commercial_models.UpdateBillingcoreInvoiceaddressResponse:
        """
        Description: 更新发票地址信息
        Summary: 更新发票地址信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_billingcore_invoiceaddress_ex_async(request, headers, runtime)

    def update_billingcore_invoiceaddress_ex(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateBillingcoreInvoiceaddressResponse:
        """
        Description: 更新发票地址信息
        Summary: 更新发票地址信息
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateBillingcoreInvoiceaddressResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoiceaddress.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_billingcore_invoiceaddress_ex_async(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateBillingcoreInvoiceaddressResponse:
        """
        Description: 更新发票地址信息
        Summary: 更新发票地址信息
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateBillingcoreInvoiceaddressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoiceaddress.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_billingcore_invoiceemail(
        self,
        request: commercial_models.AddBillingcoreInvoiceemailRequest,
    ) -> commercial_models.AddBillingcoreInvoiceemailResponse:
        """
        Description: 新增发票电子邮箱
        Summary: 新增发票电子邮箱
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_billingcore_invoiceemail_ex(request, headers, runtime)

    async def add_billingcore_invoiceemail_async(
        self,
        request: commercial_models.AddBillingcoreInvoiceemailRequest,
    ) -> commercial_models.AddBillingcoreInvoiceemailResponse:
        """
        Description: 新增发票电子邮箱
        Summary: 新增发票电子邮箱
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_billingcore_invoiceemail_ex_async(request, headers, runtime)

    def add_billingcore_invoiceemail_ex(
        self,
        request: commercial_models.AddBillingcoreInvoiceemailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddBillingcoreInvoiceemailResponse:
        """
        Description: 新增发票电子邮箱
        Summary: 新增发票电子邮箱
        """
        UtilClient.validate_model(request)
        return commercial_models.AddBillingcoreInvoiceemailResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoiceemail.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_billingcore_invoiceemail_ex_async(
        self,
        request: commercial_models.AddBillingcoreInvoiceemailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddBillingcoreInvoiceemailResponse:
        """
        Description: 新增发票电子邮箱
        Summary: 新增发票电子邮箱
        """
        UtilClient.validate_model(request)
        return commercial_models.AddBillingcoreInvoiceemailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoiceemail.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_billingcore_invoiceemail(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceemailRequest,
    ) -> commercial_models.UpdateBillingcoreInvoiceemailResponse:
        """
        Description: 更新发票电子邮箱
        Summary: 更新发票电子邮箱
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_billingcore_invoiceemail_ex(request, headers, runtime)

    async def update_billingcore_invoiceemail_async(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceemailRequest,
    ) -> commercial_models.UpdateBillingcoreInvoiceemailResponse:
        """
        Description: 更新发票电子邮箱
        Summary: 更新发票电子邮箱
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_billingcore_invoiceemail_ex_async(request, headers, runtime)

    def update_billingcore_invoiceemail_ex(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceemailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateBillingcoreInvoiceemailResponse:
        """
        Description: 更新发票电子邮箱
        Summary: 更新发票电子邮箱
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateBillingcoreInvoiceemailResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.invoiceemail.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_billingcore_invoiceemail_ex_async(
        self,
        request: commercial_models.UpdateBillingcoreInvoiceemailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateBillingcoreInvoiceemailResponse:
        """
        Description: 更新发票电子邮箱
        Summary: 更新发票电子邮箱
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateBillingcoreInvoiceemailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.invoiceemail.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_billingcore_merchantinvoice(
        self,
        request: commercial_models.ApplyBillingcoreMerchantinvoiceRequest,
    ) -> commercial_models.ApplyBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票申请
        Summary: 商户开票申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_billingcore_merchantinvoice_ex(request, headers, runtime)

    async def apply_billingcore_merchantinvoice_async(
        self,
        request: commercial_models.ApplyBillingcoreMerchantinvoiceRequest,
    ) -> commercial_models.ApplyBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票申请
        Summary: 商户开票申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_billingcore_merchantinvoice_ex_async(request, headers, runtime)

    def apply_billingcore_merchantinvoice_ex(
        self,
        request: commercial_models.ApplyBillingcoreMerchantinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ApplyBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票申请
        Summary: 商户开票申请
        """
        UtilClient.validate_model(request)
        return commercial_models.ApplyBillingcoreMerchantinvoiceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.merchantinvoice.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_billingcore_merchantinvoice_ex_async(
        self,
        request: commercial_models.ApplyBillingcoreMerchantinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ApplyBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票申请
        Summary: 商户开票申请
        """
        UtilClient.validate_model(request)
        return commercial_models.ApplyBillingcoreMerchantinvoiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.merchantinvoice.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_billingcore_merchantinvoice(
        self,
        request: commercial_models.QueryBillingcoreMerchantinvoiceRequest,
    ) -> commercial_models.QueryBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票查询
        Summary: 商户开票查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_billingcore_merchantinvoice_ex(request, headers, runtime)

    async def query_billingcore_merchantinvoice_async(
        self,
        request: commercial_models.QueryBillingcoreMerchantinvoiceRequest,
    ) -> commercial_models.QueryBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票查询
        Summary: 商户开票查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_billingcore_merchantinvoice_ex_async(request, headers, runtime)

    def query_billingcore_merchantinvoice_ex(
        self,
        request: commercial_models.QueryBillingcoreMerchantinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票查询
        Summary: 商户开票查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreMerchantinvoiceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.merchantinvoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_billingcore_merchantinvoice_ex_async(
        self,
        request: commercial_models.QueryBillingcoreMerchantinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreMerchantinvoiceResponse:
        """
        Description: 商户开票查询
        Summary: 商户开票查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreMerchantinvoiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.merchantinvoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_billingcore_spbill(
        self,
        request: commercial_models.QueryBillingcoreSpbillRequest,
    ) -> commercial_models.QueryBillingcoreSpbillResponse:
        """
        Description: 查询服务商账单
        Summary: 查询服务商账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_billingcore_spbill_ex(request, headers, runtime)

    async def query_billingcore_spbill_async(
        self,
        request: commercial_models.QueryBillingcoreSpbillRequest,
    ) -> commercial_models.QueryBillingcoreSpbillResponse:
        """
        Description: 查询服务商账单
        Summary: 查询服务商账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_billingcore_spbill_ex_async(request, headers, runtime)

    def query_billingcore_spbill_ex(
        self,
        request: commercial_models.QueryBillingcoreSpbillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreSpbillResponse:
        """
        Description: 查询服务商账单
        Summary: 查询服务商账单
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreSpbillResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.spbill.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_billingcore_spbill_ex_async(
        self,
        request: commercial_models.QueryBillingcoreSpbillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryBillingcoreSpbillResponse:
        """
        Description: 查询服务商账单
        Summary: 查询服务商账单
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryBillingcoreSpbillResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.spbill.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_billingcore_spbill(
        self,
        request: commercial_models.PagequeryBillingcoreSpbillRequest,
    ) -> commercial_models.PagequeryBillingcoreSpbillResponse:
        """
        Description: 分页查询服务商账单
        Summary: 分页查询服务商账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_billingcore_spbill_ex(request, headers, runtime)

    async def pagequery_billingcore_spbill_async(
        self,
        request: commercial_models.PagequeryBillingcoreSpbillRequest,
    ) -> commercial_models.PagequeryBillingcoreSpbillResponse:
        """
        Description: 分页查询服务商账单
        Summary: 分页查询服务商账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_billingcore_spbill_ex_async(request, headers, runtime)

    def pagequery_billingcore_spbill_ex(
        self,
        request: commercial_models.PagequeryBillingcoreSpbillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.PagequeryBillingcoreSpbillResponse:
        """
        Description: 分页查询服务商账单
        Summary: 分页查询服务商账单
        """
        UtilClient.validate_model(request)
        return commercial_models.PagequeryBillingcoreSpbillResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.spbill.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_billingcore_spbill_ex_async(
        self,
        request: commercial_models.PagequeryBillingcoreSpbillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.PagequeryBillingcoreSpbillResponse:
        """
        Description: 分页查询服务商账单
        Summary: 分页查询服务商账单
        """
        UtilClient.validate_model(request)
        return commercial_models.PagequeryBillingcoreSpbillResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.spbill.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_billingcore_spinvoice(
        self,
        request: commercial_models.ApplyBillingcoreSpinvoiceRequest,
    ) -> commercial_models.ApplyBillingcoreSpinvoiceResponse:
        """
        Description: 服务商结算申请
        Summary: 服务商结算申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_billingcore_spinvoice_ex(request, headers, runtime)

    async def apply_billingcore_spinvoice_async(
        self,
        request: commercial_models.ApplyBillingcoreSpinvoiceRequest,
    ) -> commercial_models.ApplyBillingcoreSpinvoiceResponse:
        """
        Description: 服务商结算申请
        Summary: 服务商结算申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_billingcore_spinvoice_ex_async(request, headers, runtime)

    def apply_billingcore_spinvoice_ex(
        self,
        request: commercial_models.ApplyBillingcoreSpinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ApplyBillingcoreSpinvoiceResponse:
        """
        Description: 服务商结算申请
        Summary: 服务商结算申请
        """
        UtilClient.validate_model(request)
        return commercial_models.ApplyBillingcoreSpinvoiceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.billingcore.spinvoice.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_billingcore_spinvoice_ex_async(
        self,
        request: commercial_models.ApplyBillingcoreSpinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ApplyBillingcoreSpinvoiceResponse:
        """
        Description: 服务商结算申请
        Summary: 服务商结算申请
        """
        UtilClient.validate_model(request)
        return commercial_models.ApplyBillingcoreSpinvoiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.billingcore.spinvoice.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_commercialcore_catalog(
        self,
        request: commercial_models.AllCommercialcoreCatalogRequest,
    ) -> commercial_models.AllCommercialcoreCatalogResponse:
        """
        Description: 查询所有类目树
        Summary: 查询所有类目树
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_commercialcore_catalog_ex(request, headers, runtime)

    async def all_commercialcore_catalog_async(
        self,
        request: commercial_models.AllCommercialcoreCatalogRequest,
    ) -> commercial_models.AllCommercialcoreCatalogResponse:
        """
        Description: 查询所有类目树
        Summary: 查询所有类目树
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_commercialcore_catalog_ex_async(request, headers, runtime)

    def all_commercialcore_catalog_ex(
        self,
        request: commercial_models.AllCommercialcoreCatalogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AllCommercialcoreCatalogResponse:
        """
        Description: 查询所有类目树
        Summary: 查询所有类目树
        """
        UtilClient.validate_model(request)
        return commercial_models.AllCommercialcoreCatalogResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.catalog.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_commercialcore_catalog_ex_async(
        self,
        request: commercial_models.AllCommercialcoreCatalogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AllCommercialcoreCatalogResponse:
        """
        Description: 查询所有类目树
        Summary: 查询所有类目树
        """
        UtilClient.validate_model(request)
        return commercial_models.AllCommercialcoreCatalogResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.catalog.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_commercialcore_product(
        self,
        request: commercial_models.ListCommercialcoreProductRequest,
    ) -> commercial_models.ListCommercialcoreProductResponse:
        """
        Description: 根据类目id查询产品列表
        Summary: 查询产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_commercialcore_product_ex(request, headers, runtime)

    async def list_commercialcore_product_async(
        self,
        request: commercial_models.ListCommercialcoreProductRequest,
    ) -> commercial_models.ListCommercialcoreProductResponse:
        """
        Description: 根据类目id查询产品列表
        Summary: 查询产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_commercialcore_product_ex_async(request, headers, runtime)

    def list_commercialcore_product_ex(
        self,
        request: commercial_models.ListCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ListCommercialcoreProductResponse:
        """
        Description: 根据类目id查询产品列表
        Summary: 查询产品列表
        """
        UtilClient.validate_model(request)
        return commercial_models.ListCommercialcoreProductResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_commercialcore_product_ex_async(
        self,
        request: commercial_models.ListCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ListCommercialcoreProductResponse:
        """
        Description: 根据类目id查询产品列表
        Summary: 查询产品列表
        """
        UtilClient.validate_model(request)
        return commercial_models.ListCommercialcoreProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_commercialcore_commodity(
        self,
        request: commercial_models.ListCommercialcoreCommodityRequest,
    ) -> commercial_models.ListCommercialcoreCommodityResponse:
        """
        Description: 根据产品Code查询商品列表
        Summary: 查询商品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_commercialcore_commodity_ex(request, headers, runtime)

    async def list_commercialcore_commodity_async(
        self,
        request: commercial_models.ListCommercialcoreCommodityRequest,
    ) -> commercial_models.ListCommercialcoreCommodityResponse:
        """
        Description: 根据产品Code查询商品列表
        Summary: 查询商品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_commercialcore_commodity_ex_async(request, headers, runtime)

    def list_commercialcore_commodity_ex(
        self,
        request: commercial_models.ListCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ListCommercialcoreCommodityResponse:
        """
        Description: 根据产品Code查询商品列表
        Summary: 查询商品列表
        """
        UtilClient.validate_model(request)
        return commercial_models.ListCommercialcoreCommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.commodity.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_commercialcore_commodity_ex_async(
        self,
        request: commercial_models.ListCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ListCommercialcoreCommodityResponse:
        """
        Description: 根据产品Code查询商品列表
        Summary: 查询商品列表
        """
        UtilClient.validate_model(request)
        return commercial_models.ListCommercialcoreCommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.commodity.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_commercialcore_spec(
        self,
        request: commercial_models.ListCommercialcoreSpecRequest,
    ) -> commercial_models.ListCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格列表
        Summary: 查询规格列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_commercialcore_spec_ex(request, headers, runtime)

    async def list_commercialcore_spec_async(
        self,
        request: commercial_models.ListCommercialcoreSpecRequest,
    ) -> commercial_models.ListCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格列表
        Summary: 查询规格列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_commercialcore_spec_ex_async(request, headers, runtime)

    def list_commercialcore_spec_ex(
        self,
        request: commercial_models.ListCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ListCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格列表
        Summary: 查询规格列表
        """
        UtilClient.validate_model(request)
        return commercial_models.ListCommercialcoreSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.spec.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_commercialcore_spec_ex_async(
        self,
        request: commercial_models.ListCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ListCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格列表
        Summary: 查询规格列表
        """
        UtilClient.validate_model(request)
        return commercial_models.ListCommercialcoreSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.spec.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_commercialcore_spec(
        self,
        request: commercial_models.QueryCommercialcoreSpecRequest,
    ) -> commercial_models.QueryCommercialcoreSpecResponse:
        """
        Description: 根据规格code查询规格定价计划
        Summary: 查询规格定价计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_commercialcore_spec_ex(request, headers, runtime)

    async def query_commercialcore_spec_async(
        self,
        request: commercial_models.QueryCommercialcoreSpecRequest,
    ) -> commercial_models.QueryCommercialcoreSpecResponse:
        """
        Description: 根据规格code查询规格定价计划
        Summary: 查询规格定价计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_commercialcore_spec_ex_async(request, headers, runtime)

    def query_commercialcore_spec_ex(
        self,
        request: commercial_models.QueryCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryCommercialcoreSpecResponse:
        """
        Description: 根据规格code查询规格定价计划
        Summary: 查询规格定价计划
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryCommercialcoreSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.spec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_commercialcore_spec_ex_async(
        self,
        request: commercial_models.QueryCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryCommercialcoreSpecResponse:
        """
        Description: 根据规格code查询规格定价计划
        Summary: 查询规格定价计划
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryCommercialcoreSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.spec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_commercialcore_product(
        self,
        request: commercial_models.AddCommercialcoreProductRequest,
    ) -> commercial_models.AddCommercialcoreProductResponse:
        """
        Description: 新增产品
        Summary: 新增产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_commercialcore_product_ex(request, headers, runtime)

    async def add_commercialcore_product_async(
        self,
        request: commercial_models.AddCommercialcoreProductRequest,
    ) -> commercial_models.AddCommercialcoreProductResponse:
        """
        Description: 新增产品
        Summary: 新增产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_commercialcore_product_ex_async(request, headers, runtime)

    def add_commercialcore_product_ex(
        self,
        request: commercial_models.AddCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddCommercialcoreProductResponse:
        """
        Description: 新增产品
        Summary: 新增产品
        """
        UtilClient.validate_model(request)
        return commercial_models.AddCommercialcoreProductResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.product.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_commercialcore_product_ex_async(
        self,
        request: commercial_models.AddCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddCommercialcoreProductResponse:
        """
        Description: 新增产品
        Summary: 新增产品
        """
        UtilClient.validate_model(request)
        return commercial_models.AddCommercialcoreProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.product.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_commercialcore_product(
        self,
        request: commercial_models.UpdateCommercialcoreProductRequest,
    ) -> commercial_models.UpdateCommercialcoreProductResponse:
        """
        Description: 更新产品
        Summary: 更新产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_commercialcore_product_ex(request, headers, runtime)

    async def update_commercialcore_product_async(
        self,
        request: commercial_models.UpdateCommercialcoreProductRequest,
    ) -> commercial_models.UpdateCommercialcoreProductResponse:
        """
        Description: 更新产品
        Summary: 更新产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_commercialcore_product_ex_async(request, headers, runtime)

    def update_commercialcore_product_ex(
        self,
        request: commercial_models.UpdateCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateCommercialcoreProductResponse:
        """
        Description: 更新产品
        Summary: 更新产品
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateCommercialcoreProductResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.product.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_commercialcore_product_ex_async(
        self,
        request: commercial_models.UpdateCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateCommercialcoreProductResponse:
        """
        Description: 更新产品
        Summary: 更新产品
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateCommercialcoreProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.product.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_commercialcore_product(
        self,
        request: commercial_models.BatchqueryCommercialcoreProductRequest,
    ) -> commercial_models.BatchqueryCommercialcoreProductResponse:
        """
        Description: 查询产品code列表
        Summary: 查询产品code列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_commercialcore_product_ex(request, headers, runtime)

    async def batchquery_commercialcore_product_async(
        self,
        request: commercial_models.BatchqueryCommercialcoreProductRequest,
    ) -> commercial_models.BatchqueryCommercialcoreProductResponse:
        """
        Description: 查询产品code列表
        Summary: 查询产品code列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_commercialcore_product_ex_async(request, headers, runtime)

    def batchquery_commercialcore_product_ex(
        self,
        request: commercial_models.BatchqueryCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryCommercialcoreProductResponse:
        """
        Description: 查询产品code列表
        Summary: 查询产品code列表
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryCommercialcoreProductResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.product.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_commercialcore_product_ex_async(
        self,
        request: commercial_models.BatchqueryCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryCommercialcoreProductResponse:
        """
        Description: 查询产品code列表
        Summary: 查询产品code列表
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryCommercialcoreProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.product.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_commercialcore_product(
        self,
        request: commercial_models.QueryCommercialcoreProductRequest,
    ) -> commercial_models.QueryCommercialcoreProductResponse:
        """
        Description: 根据产品code查询产品信息
        Summary: 查询产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_commercialcore_product_ex(request, headers, runtime)

    async def query_commercialcore_product_async(
        self,
        request: commercial_models.QueryCommercialcoreProductRequest,
    ) -> commercial_models.QueryCommercialcoreProductResponse:
        """
        Description: 根据产品code查询产品信息
        Summary: 查询产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_commercialcore_product_ex_async(request, headers, runtime)

    def query_commercialcore_product_ex(
        self,
        request: commercial_models.QueryCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryCommercialcoreProductResponse:
        """
        Description: 根据产品code查询产品信息
        Summary: 查询产品
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryCommercialcoreProductResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_commercialcore_product_ex_async(
        self,
        request: commercial_models.QueryCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryCommercialcoreProductResponse:
        """
        Description: 根据产品code查询产品信息
        Summary: 查询产品
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryCommercialcoreProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_commercialcore_commodity(
        self,
        request: commercial_models.QueryCommercialcoreCommodityRequest,
    ) -> commercial_models.QueryCommercialcoreCommodityResponse:
        """
        Description: 根据产品code查询商品来源
        Summary: 查询商品来源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_commercialcore_commodity_ex(request, headers, runtime)

    async def query_commercialcore_commodity_async(
        self,
        request: commercial_models.QueryCommercialcoreCommodityRequest,
    ) -> commercial_models.QueryCommercialcoreCommodityResponse:
        """
        Description: 根据产品code查询商品来源
        Summary: 查询商品来源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_commercialcore_commodity_ex_async(request, headers, runtime)

    def query_commercialcore_commodity_ex(
        self,
        request: commercial_models.QueryCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryCommercialcoreCommodityResponse:
        """
        Description: 根据产品code查询商品来源
        Summary: 查询商品来源
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryCommercialcoreCommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.commodity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_commercialcore_commodity_ex_async(
        self,
        request: commercial_models.QueryCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryCommercialcoreCommodityResponse:
        """
        Description: 根据产品code查询商品来源
        Summary: 查询商品来源
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryCommercialcoreCommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.commodity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_commercialcore_commodity(
        self,
        request: commercial_models.AddCommercialcoreCommodityRequest,
    ) -> commercial_models.AddCommercialcoreCommodityResponse:
        """
        Description: 新增商品
        Summary: 新增商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_commercialcore_commodity_ex(request, headers, runtime)

    async def add_commercialcore_commodity_async(
        self,
        request: commercial_models.AddCommercialcoreCommodityRequest,
    ) -> commercial_models.AddCommercialcoreCommodityResponse:
        """
        Description: 新增商品
        Summary: 新增商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_commercialcore_commodity_ex_async(request, headers, runtime)

    def add_commercialcore_commodity_ex(
        self,
        request: commercial_models.AddCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddCommercialcoreCommodityResponse:
        """
        Description: 新增商品
        Summary: 新增商品
        """
        UtilClient.validate_model(request)
        return commercial_models.AddCommercialcoreCommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.commodity.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_commercialcore_commodity_ex_async(
        self,
        request: commercial_models.AddCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddCommercialcoreCommodityResponse:
        """
        Description: 新增商品
        Summary: 新增商品
        """
        UtilClient.validate_model(request)
        return commercial_models.AddCommercialcoreCommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.commodity.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_commercialcore_commodity(
        self,
        request: commercial_models.UpdateCommercialcoreCommodityRequest,
    ) -> commercial_models.UpdateCommercialcoreCommodityResponse:
        """
        Description: 更新商品
        Summary: 更新商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_commercialcore_commodity_ex(request, headers, runtime)

    async def update_commercialcore_commodity_async(
        self,
        request: commercial_models.UpdateCommercialcoreCommodityRequest,
    ) -> commercial_models.UpdateCommercialcoreCommodityResponse:
        """
        Description: 更新商品
        Summary: 更新商品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_commercialcore_commodity_ex_async(request, headers, runtime)

    def update_commercialcore_commodity_ex(
        self,
        request: commercial_models.UpdateCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateCommercialcoreCommodityResponse:
        """
        Description: 更新商品
        Summary: 更新商品
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateCommercialcoreCommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.commodity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_commercialcore_commodity_ex_async(
        self,
        request: commercial_models.UpdateCommercialcoreCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateCommercialcoreCommodityResponse:
        """
        Description: 更新商品
        Summary: 更新商品
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateCommercialcoreCommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.commodity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_commercialcore_spec(
        self,
        request: commercial_models.BatchqueryCommercialcoreSpecRequest,
    ) -> commercial_models.BatchqueryCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格售卖模式
        Summary: 查询规格售卖模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_commercialcore_spec_ex(request, headers, runtime)

    async def batchquery_commercialcore_spec_async(
        self,
        request: commercial_models.BatchqueryCommercialcoreSpecRequest,
    ) -> commercial_models.BatchqueryCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格售卖模式
        Summary: 查询规格售卖模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_commercialcore_spec_ex_async(request, headers, runtime)

    def batchquery_commercialcore_spec_ex(
        self,
        request: commercial_models.BatchqueryCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格售卖模式
        Summary: 查询规格售卖模式
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryCommercialcoreSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.spec.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_commercialcore_spec_ex_async(
        self,
        request: commercial_models.BatchqueryCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryCommercialcoreSpecResponse:
        """
        Description: 根据商品code查询规格售卖模式
        Summary: 查询规格售卖模式
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryCommercialcoreSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.spec.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_commercialcore_spec(
        self,
        request: commercial_models.AddCommercialcoreSpecRequest,
    ) -> commercial_models.AddCommercialcoreSpecResponse:
        """
        Description: 新增规格与定价计划
        Summary: 新增规格与定价计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_commercialcore_spec_ex(request, headers, runtime)

    async def add_commercialcore_spec_async(
        self,
        request: commercial_models.AddCommercialcoreSpecRequest,
    ) -> commercial_models.AddCommercialcoreSpecResponse:
        """
        Description: 新增规格与定价计划
        Summary: 新增规格与定价计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_commercialcore_spec_ex_async(request, headers, runtime)

    def add_commercialcore_spec_ex(
        self,
        request: commercial_models.AddCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddCommercialcoreSpecResponse:
        """
        Description: 新增规格与定价计划
        Summary: 新增规格与定价计划
        """
        UtilClient.validate_model(request)
        return commercial_models.AddCommercialcoreSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.spec.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_commercialcore_spec_ex_async(
        self,
        request: commercial_models.AddCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddCommercialcoreSpecResponse:
        """
        Description: 新增规格与定价计划
        Summary: 新增规格与定价计划
        """
        UtilClient.validate_model(request)
        return commercial_models.AddCommercialcoreSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.spec.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_commercialcore_spec(
        self,
        request: commercial_models.UpdateCommercialcoreSpecRequest,
    ) -> commercial_models.UpdateCommercialcoreSpecResponse:
        """
        Description: 更新规格
        Summary: 更新规格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_commercialcore_spec_ex(request, headers, runtime)

    async def update_commercialcore_spec_async(
        self,
        request: commercial_models.UpdateCommercialcoreSpecRequest,
    ) -> commercial_models.UpdateCommercialcoreSpecResponse:
        """
        Description: 更新规格
        Summary: 更新规格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_commercialcore_spec_ex_async(request, headers, runtime)

    def update_commercialcore_spec_ex(
        self,
        request: commercial_models.UpdateCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateCommercialcoreSpecResponse:
        """
        Description: 更新规格
        Summary: 更新规格
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateCommercialcoreSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.spec.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_commercialcore_spec_ex_async(
        self,
        request: commercial_models.UpdateCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.UpdateCommercialcoreSpecResponse:
        """
        Description: 更新规格
        Summary: 更新规格
        """
        UtilClient.validate_model(request)
        return commercial_models.UpdateCommercialcoreSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.spec.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_commercialcore_spec(
        self,
        request: commercial_models.AuthCommercialcoreSpecRequest,
    ) -> commercial_models.AuthCommercialcoreSpecResponse:
        """
        Description: 修改规格状态
        Summary: 修改规格状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_commercialcore_spec_ex(request, headers, runtime)

    async def auth_commercialcore_spec_async(
        self,
        request: commercial_models.AuthCommercialcoreSpecRequest,
    ) -> commercial_models.AuthCommercialcoreSpecResponse:
        """
        Description: 修改规格状态
        Summary: 修改规格状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_commercialcore_spec_ex_async(request, headers, runtime)

    def auth_commercialcore_spec_ex(
        self,
        request: commercial_models.AuthCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AuthCommercialcoreSpecResponse:
        """
        Description: 修改规格状态
        Summary: 修改规格状态
        """
        UtilClient.validate_model(request)
        return commercial_models.AuthCommercialcoreSpecResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.spec.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_commercialcore_spec_ex_async(
        self,
        request: commercial_models.AuthCommercialcoreSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AuthCommercialcoreSpecResponse:
        """
        Description: 修改规格状态
        Summary: 修改规格状态
        """
        UtilClient.validate_model(request)
        return commercial_models.AuthCommercialcoreSpecResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.spec.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_commercialcore_product(
        self,
        request: commercial_models.CheckCommercialcoreProductRequest,
    ) -> commercial_models.CheckCommercialcoreProductResponse:
        """
        Description: 产品code查重校验
        Summary: 产品code查重校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_commercialcore_product_ex(request, headers, runtime)

    async def check_commercialcore_product_async(
        self,
        request: commercial_models.CheckCommercialcoreProductRequest,
    ) -> commercial_models.CheckCommercialcoreProductResponse:
        """
        Description: 产品code查重校验
        Summary: 产品code查重校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_commercialcore_product_ex_async(request, headers, runtime)

    def check_commercialcore_product_ex(
        self,
        request: commercial_models.CheckCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CheckCommercialcoreProductResponse:
        """
        Description: 产品code查重校验
        Summary: 产品code查重校验
        """
        UtilClient.validate_model(request)
        return commercial_models.CheckCommercialcoreProductResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.commercialcore.product.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_commercialcore_product_ex_async(
        self,
        request: commercial_models.CheckCommercialcoreProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CheckCommercialcoreProductResponse:
        """
        Description: 产品code查重校验
        Summary: 产品code查重校验
        """
        UtilClient.validate_model(request)
        return commercial_models.CheckCommercialcoreProductResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.commercialcore.product.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_partnercore_sign(
        self,
        request: commercial_models.AddPartnercoreSignRequest,
    ) -> commercial_models.AddPartnercoreSignResponse:
        """
        Description: 新增签约接口
        Summary: 新增签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_partnercore_sign_ex(request, headers, runtime)

    async def add_partnercore_sign_async(
        self,
        request: commercial_models.AddPartnercoreSignRequest,
    ) -> commercial_models.AddPartnercoreSignResponse:
        """
        Description: 新增签约接口
        Summary: 新增签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_partnercore_sign_ex_async(request, headers, runtime)

    def add_partnercore_sign_ex(
        self,
        request: commercial_models.AddPartnercoreSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddPartnercoreSignResponse:
        """
        Description: 新增签约接口
        Summary: 新增签约接口
        """
        UtilClient.validate_model(request)
        return commercial_models.AddPartnercoreSignResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.partnercore.sign.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_partnercore_sign_ex_async(
        self,
        request: commercial_models.AddPartnercoreSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.AddPartnercoreSignResponse:
        """
        Description: 新增签约接口
        Summary: 新增签约接口
        """
        UtilClient.validate_model(request)
        return commercial_models.AddPartnercoreSignResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.partnercore.sign.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_partnercore_policy(
        self,
        request: commercial_models.QueryPartnercorePolicyRequest,
    ) -> commercial_models.QueryPartnercorePolicyResponse:
        """
        Description: 政策详情查询
        Summary: 政策详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_partnercore_policy_ex(request, headers, runtime)

    async def query_partnercore_policy_async(
        self,
        request: commercial_models.QueryPartnercorePolicyRequest,
    ) -> commercial_models.QueryPartnercorePolicyResponse:
        """
        Description: 政策详情查询
        Summary: 政策详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_partnercore_policy_ex_async(request, headers, runtime)

    def query_partnercore_policy_ex(
        self,
        request: commercial_models.QueryPartnercorePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryPartnercorePolicyResponse:
        """
        Description: 政策详情查询
        Summary: 政策详情查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryPartnercorePolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.partnercore.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_partnercore_policy_ex_async(
        self,
        request: commercial_models.QueryPartnercorePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryPartnercorePolicyResponse:
        """
        Description: 政策详情查询
        Summary: 政策详情查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryPartnercorePolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.partnercore.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_partnercore_policy(
        self,
        request: commercial_models.PagequeryPartnercorePolicyRequest,
    ) -> commercial_models.PagequeryPartnercorePolicyResponse:
        """
        Description: 政策分页查询
        Summary: 政策分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_partnercore_policy_ex(request, headers, runtime)

    async def pagequery_partnercore_policy_async(
        self,
        request: commercial_models.PagequeryPartnercorePolicyRequest,
    ) -> commercial_models.PagequeryPartnercorePolicyResponse:
        """
        Description: 政策分页查询
        Summary: 政策分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_partnercore_policy_ex_async(request, headers, runtime)

    def pagequery_partnercore_policy_ex(
        self,
        request: commercial_models.PagequeryPartnercorePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.PagequeryPartnercorePolicyResponse:
        """
        Description: 政策分页查询
        Summary: 政策分页查询
        """
        UtilClient.validate_model(request)
        return commercial_models.PagequeryPartnercorePolicyResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.partnercore.policy.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_partnercore_policy_ex_async(
        self,
        request: commercial_models.PagequeryPartnercorePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.PagequeryPartnercorePolicyResponse:
        """
        Description: 政策分页查询
        Summary: 政策分页查询
        """
        UtilClient.validate_model(request)
        return commercial_models.PagequeryPartnercorePolicyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.partnercore.policy.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_partnercore_sign(
        self,
        request: commercial_models.QueryPartnercoreSignRequest,
    ) -> commercial_models.QueryPartnercoreSignResponse:
        """
        Description: 签约信息查询
        Summary: 签约信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_partnercore_sign_ex(request, headers, runtime)

    async def query_partnercore_sign_async(
        self,
        request: commercial_models.QueryPartnercoreSignRequest,
    ) -> commercial_models.QueryPartnercoreSignResponse:
        """
        Description: 签约信息查询
        Summary: 签约信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_partnercore_sign_ex_async(request, headers, runtime)

    def query_partnercore_sign_ex(
        self,
        request: commercial_models.QueryPartnercoreSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryPartnercoreSignResponse:
        """
        Description: 签约信息查询
        Summary: 签约信息查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryPartnercoreSignResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.partnercore.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_partnercore_sign_ex_async(
        self,
        request: commercial_models.QueryPartnercoreSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryPartnercoreSignResponse:
        """
        Description: 签约信息查询
        Summary: 签约信息查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryPartnercoreSignResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.partnercore.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_tradecore_paidspecinstance(
        self,
        request: commercial_models.BatchqueryTradecorePaidspecinstanceRequest,
    ) -> commercial_models.BatchqueryTradecorePaidspecinstanceResponse:
        """
        Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
        Summary: 批量获取商户已购规格实例信息-控制台用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_tradecore_paidspecinstance_ex(request, headers, runtime)

    async def batchquery_tradecore_paidspecinstance_async(
        self,
        request: commercial_models.BatchqueryTradecorePaidspecinstanceRequest,
    ) -> commercial_models.BatchqueryTradecorePaidspecinstanceResponse:
        """
        Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
        Summary: 批量获取商户已购规格实例信息-控制台用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_tradecore_paidspecinstance_ex_async(request, headers, runtime)

    def batchquery_tradecore_paidspecinstance_ex(
        self,
        request: commercial_models.BatchqueryTradecorePaidspecinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryTradecorePaidspecinstanceResponse:
        """
        Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
        Summary: 批量获取商户已购规格实例信息-控制台用
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryTradecorePaidspecinstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.paidspecinstance.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_tradecore_paidspecinstance_ex_async(
        self,
        request: commercial_models.BatchqueryTradecorePaidspecinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryTradecorePaidspecinstanceResponse:
        """
        Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
        Summary: 批量获取商户已购规格实例信息-控制台用
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryTradecorePaidspecinstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.paidspecinstance.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_tradecore_soldspecinstance(
        self,
        request: commercial_models.BatchqueryTradecoreSoldspecinstanceRequest,
    ) -> commercial_models.BatchqueryTradecoreSoldspecinstanceResponse:
        """
        Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
        Summary: 获取已售给商户的规格实例信息-开发商用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_tradecore_soldspecinstance_ex(request, headers, runtime)

    async def batchquery_tradecore_soldspecinstance_async(
        self,
        request: commercial_models.BatchqueryTradecoreSoldspecinstanceRequest,
    ) -> commercial_models.BatchqueryTradecoreSoldspecinstanceResponse:
        """
        Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
        Summary: 获取已售给商户的规格实例信息-开发商用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_tradecore_soldspecinstance_ex_async(request, headers, runtime)

    def batchquery_tradecore_soldspecinstance_ex(
        self,
        request: commercial_models.BatchqueryTradecoreSoldspecinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryTradecoreSoldspecinstanceResponse:
        """
        Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
        Summary: 获取已售给商户的规格实例信息-开发商用
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryTradecoreSoldspecinstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.soldspecinstance.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_tradecore_soldspecinstance_ex_async(
        self,
        request: commercial_models.BatchqueryTradecoreSoldspecinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.BatchqueryTradecoreSoldspecinstanceResponse:
        """
        Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
        Summary: 获取已售给商户的规格实例信息-开发商用
        """
        UtilClient.validate_model(request)
        return commercial_models.BatchqueryTradecoreSoldspecinstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.soldspecinstance.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tradecore_merchantinfo(
        self,
        request: commercial_models.QueryTradecoreMerchantinfoRequest,
    ) -> commercial_models.QueryTradecoreMerchantinfoResponse:
        """
        Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
        Summary: 获取商户信息-开发商用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tradecore_merchantinfo_ex(request, headers, runtime)

    async def query_tradecore_merchantinfo_async(
        self,
        request: commercial_models.QueryTradecoreMerchantinfoRequest,
    ) -> commercial_models.QueryTradecoreMerchantinfoResponse:
        """
        Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
        Summary: 获取商户信息-开发商用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tradecore_merchantinfo_ex_async(request, headers, runtime)

    def query_tradecore_merchantinfo_ex(
        self,
        request: commercial_models.QueryTradecoreMerchantinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryTradecoreMerchantinfoResponse:
        """
        Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
        Summary: 获取商户信息-开发商用
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryTradecoreMerchantinfoResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.merchantinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tradecore_merchantinfo_ex_async(
        self,
        request: commercial_models.QueryTradecoreMerchantinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryTradecoreMerchantinfoResponse:
        """
        Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
        Summary: 获取商户信息-开发商用
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryTradecoreMerchantinfoResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.merchantinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_tradecore_pay(
        self,
        request: commercial_models.CreateTradecorePayRequest,
    ) -> commercial_models.CreateTradecorePayResponse:
        """
        Description: 创建支付单，调用支付宝接口获取收银台触发表单
        Summary: 支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_tradecore_pay_ex(request, headers, runtime)

    async def create_tradecore_pay_async(
        self,
        request: commercial_models.CreateTradecorePayRequest,
    ) -> commercial_models.CreateTradecorePayResponse:
        """
        Description: 创建支付单，调用支付宝接口获取收银台触发表单
        Summary: 支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_tradecore_pay_ex_async(request, headers, runtime)

    def create_tradecore_pay_ex(
        self,
        request: commercial_models.CreateTradecorePayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CreateTradecorePayResponse:
        """
        Description: 创建支付单，调用支付宝接口获取收银台触发表单
        Summary: 支付创建
        """
        UtilClient.validate_model(request)
        return commercial_models.CreateTradecorePayResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.pay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_tradecore_pay_ex_async(
        self,
        request: commercial_models.CreateTradecorePayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CreateTradecorePayResponse:
        """
        Description: 创建支付单，调用支付宝接口获取收银台触发表单
        Summary: 支付创建
        """
        UtilClient.validate_model(request)
        return commercial_models.CreateTradecorePayResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.pay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_tradecore_pay(
        self,
        request: commercial_models.ReceiveTradecorePayRequest,
    ) -> commercial_models.ReceiveTradecorePayResponse:
        """
        Description: 支付宝支付结果回调
        Summary: 支付结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_tradecore_pay_ex(request, headers, runtime)

    async def receive_tradecore_pay_async(
        self,
        request: commercial_models.ReceiveTradecorePayRequest,
    ) -> commercial_models.ReceiveTradecorePayResponse:
        """
        Description: 支付宝支付结果回调
        Summary: 支付结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_tradecore_pay_ex_async(request, headers, runtime)

    def receive_tradecore_pay_ex(
        self,
        request: commercial_models.ReceiveTradecorePayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ReceiveTradecorePayResponse:
        """
        Description: 支付宝支付结果回调
        Summary: 支付结果回调
        """
        UtilClient.validate_model(request)
        return commercial_models.ReceiveTradecorePayResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.pay.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_tradecore_pay_ex_async(
        self,
        request: commercial_models.ReceiveTradecorePayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.ReceiveTradecorePayResponse:
        """
        Description: 支付宝支付结果回调
        Summary: 支付结果回调
        """
        UtilClient.validate_model(request)
        return commercial_models.ReceiveTradecorePayResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.pay.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_tradecore_order(
        self,
        request: commercial_models.CancelTradecoreOrderRequest,
    ) -> commercial_models.CancelTradecoreOrderResponse:
        """
        Description: 订单取消
        Summary: 订单取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_tradecore_order_ex(request, headers, runtime)

    async def cancel_tradecore_order_async(
        self,
        request: commercial_models.CancelTradecoreOrderRequest,
    ) -> commercial_models.CancelTradecoreOrderResponse:
        """
        Description: 订单取消
        Summary: 订单取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_tradecore_order_ex_async(request, headers, runtime)

    def cancel_tradecore_order_ex(
        self,
        request: commercial_models.CancelTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CancelTradecoreOrderResponse:
        """
        Description: 订单取消
        Summary: 订单取消
        """
        UtilClient.validate_model(request)
        return commercial_models.CancelTradecoreOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.order.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_tradecore_order_ex_async(
        self,
        request: commercial_models.CancelTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CancelTradecoreOrderResponse:
        """
        Description: 订单取消
        Summary: 订单取消
        """
        UtilClient.validate_model(request)
        return commercial_models.CancelTradecoreOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.order.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_tradecore_order(
        self,
        request: commercial_models.CreateTradecoreOrderRequest,
    ) -> commercial_models.CreateTradecoreOrderResponse:
        """
        Description: 订单创建
        Summary: 订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_tradecore_order_ex(request, headers, runtime)

    async def create_tradecore_order_async(
        self,
        request: commercial_models.CreateTradecoreOrderRequest,
    ) -> commercial_models.CreateTradecoreOrderResponse:
        """
        Description: 订单创建
        Summary: 订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_tradecore_order_ex_async(request, headers, runtime)

    def create_tradecore_order_ex(
        self,
        request: commercial_models.CreateTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CreateTradecoreOrderResponse:
        """
        Description: 订单创建
        Summary: 订单创建
        """
        UtilClient.validate_model(request)
        return commercial_models.CreateTradecoreOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_tradecore_order_ex_async(
        self,
        request: commercial_models.CreateTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CreateTradecoreOrderResponse:
        """
        Description: 订单创建
        Summary: 订单创建
        """
        UtilClient.validate_model(request)
        return commercial_models.CreateTradecoreOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tradecore_order(
        self,
        request: commercial_models.QueryTradecoreOrderRequest,
    ) -> commercial_models.QueryTradecoreOrderResponse:
        """
        Description: 订单查询
        Summary: 订单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tradecore_order_ex(request, headers, runtime)

    async def query_tradecore_order_async(
        self,
        request: commercial_models.QueryTradecoreOrderRequest,
    ) -> commercial_models.QueryTradecoreOrderResponse:
        """
        Description: 订单查询
        Summary: 订单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tradecore_order_ex_async(request, headers, runtime)

    def query_tradecore_order_ex(
        self,
        request: commercial_models.QueryTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryTradecoreOrderResponse:
        """
        Description: 订单查询
        Summary: 订单查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryTradecoreOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tradecore_order_ex_async(
        self,
        request: commercial_models.QueryTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.QueryTradecoreOrderResponse:
        """
        Description: 订单查询
        Summary: 订单查询
        """
        UtilClient.validate_model(request)
        return commercial_models.QueryTradecoreOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_tradecore_order(
        self,
        request: commercial_models.PagequeryTradecoreOrderRequest,
    ) -> commercial_models.PagequeryTradecoreOrderResponse:
        """
        Description: 订单分页查询
        Summary: 订单分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_tradecore_order_ex(request, headers, runtime)

    async def pagequery_tradecore_order_async(
        self,
        request: commercial_models.PagequeryTradecoreOrderRequest,
    ) -> commercial_models.PagequeryTradecoreOrderResponse:
        """
        Description: 订单分页查询
        Summary: 订单分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_tradecore_order_ex_async(request, headers, runtime)

    def pagequery_tradecore_order_ex(
        self,
        request: commercial_models.PagequeryTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.PagequeryTradecoreOrderResponse:
        """
        Description: 订单分页查询
        Summary: 订单分页查询
        """
        UtilClient.validate_model(request)
        return commercial_models.PagequeryTradecoreOrderResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.order.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_tradecore_order_ex_async(
        self,
        request: commercial_models.PagequeryTradecoreOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.PagequeryTradecoreOrderResponse:
        """
        Description: 订单分页查询
        Summary: 订单分页查询
        """
        UtilClient.validate_model(request)
        return commercial_models.PagequeryTradecoreOrderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.order.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_tradecore_sp(
        self,
        request: commercial_models.CheckTradecoreSpRequest,
    ) -> commercial_models.CheckTradecoreSpResponse:
        """
        Description: 服务商信息校验
        Summary: 服务商信息校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_tradecore_sp_ex(request, headers, runtime)

    async def check_tradecore_sp_async(
        self,
        request: commercial_models.CheckTradecoreSpRequest,
    ) -> commercial_models.CheckTradecoreSpResponse:
        """
        Description: 服务商信息校验
        Summary: 服务商信息校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_tradecore_sp_ex_async(request, headers, runtime)

    def check_tradecore_sp_ex(
        self,
        request: commercial_models.CheckTradecoreSpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CheckTradecoreSpResponse:
        """
        Description: 服务商信息校验
        Summary: 服务商信息校验
        """
        UtilClient.validate_model(request)
        return commercial_models.CheckTradecoreSpResponse().from_map(
            self.do_request('1.0', 'antcloud.commercial.tradecore.sp.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_tradecore_sp_ex_async(
        self,
        request: commercial_models.CheckTradecoreSpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> commercial_models.CheckTradecoreSpResponse:
        """
        Description: 服务商信息校验
        Summary: 服务商信息校验
        """
        UtilClient.validate_model(request)
        return commercial_models.CheckTradecoreSpResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.commercial.tradecore.sp.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
