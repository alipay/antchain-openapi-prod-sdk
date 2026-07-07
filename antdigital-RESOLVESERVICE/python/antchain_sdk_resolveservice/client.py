# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_resolveservice import models as resolveservice_models
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
        config: resolveservice_models.Config,
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
            'ignoreSSL': runtime.ignore_ssl
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'RESOLVESERVICE',
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
            'ignoreSSL': runtime.ignore_ssl
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'RESOLVESERVICE',
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

    def query_customer_overdue(
        self,
        request: resolveservice_models.QueryCustomerOverdueRequest,
    ) -> resolveservice_models.QueryCustomerOverdueResponse:
        """
        Description: 查询360客户是否逾期
        Summary: 查询360客户是否逾期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_overdue_ex(request, headers, runtime)

    async def query_customer_overdue_async(
        self,
        request: resolveservice_models.QueryCustomerOverdueRequest,
    ) -> resolveservice_models.QueryCustomerOverdueResponse:
        """
        Description: 查询360客户是否逾期
        Summary: 查询360客户是否逾期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_overdue_ex_async(request, headers, runtime)

    def query_customer_overdue_ex(
        self,
        request: resolveservice_models.QueryCustomerOverdueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerOverdueResponse:
        """
        Description: 查询360客户是否逾期
        Summary: 查询360客户是否逾期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerOverdueResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.customer.overdue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_overdue_ex_async(
        self,
        request: resolveservice_models.QueryCustomerOverdueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerOverdueResponse:
        """
        Description: 查询360客户是否逾期
        Summary: 查询360客户是否逾期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerOverdueResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.customer.overdue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_customer_repaylink(
        self,
        request: resolveservice_models.QueryCustomerRepaylinkRequest,
    ) -> resolveservice_models.QueryCustomerRepaylinkResponse:
        """
        Description: 查询360客户快捷还款预链接码
        Summary: 查询360客户快捷还款预链接码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_repaylink_ex(request, headers, runtime)

    async def query_customer_repaylink_async(
        self,
        request: resolveservice_models.QueryCustomerRepaylinkRequest,
    ) -> resolveservice_models.QueryCustomerRepaylinkResponse:
        """
        Description: 查询360客户快捷还款预链接码
        Summary: 查询360客户快捷还款预链接码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_repaylink_ex_async(request, headers, runtime)

    def query_customer_repaylink_ex(
        self,
        request: resolveservice_models.QueryCustomerRepaylinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerRepaylinkResponse:
        """
        Description: 查询360客户快捷还款预链接码
        Summary: 查询360客户快捷还款预链接码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerRepaylinkResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.customer.repaylink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_repaylink_ex_async(
        self,
        request: resolveservice_models.QueryCustomerRepaylinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerRepaylinkResponse:
        """
        Description: 查询360客户快捷还款预链接码
        Summary: 查询360客户快捷还款预链接码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerRepaylinkResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.customer.repaylink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_customer_wxleadlink(
        self,
        request: resolveservice_models.QueryCustomerWxleadlinkRequest,
    ) -> resolveservice_models.QueryCustomerWxleadlinkResponse:
        """
        Description: 查询360客户微信获客链接
        Summary: 查询360客户微信获客链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_wxleadlink_ex(request, headers, runtime)

    async def query_customer_wxleadlink_async(
        self,
        request: resolveservice_models.QueryCustomerWxleadlinkRequest,
    ) -> resolveservice_models.QueryCustomerWxleadlinkResponse:
        """
        Description: 查询360客户微信获客链接
        Summary: 查询360客户微信获客链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_wxleadlink_ex_async(request, headers, runtime)

    def query_customer_wxleadlink_ex(
        self,
        request: resolveservice_models.QueryCustomerWxleadlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerWxleadlinkResponse:
        """
        Description: 查询360客户微信获客链接
        Summary: 查询360客户微信获客链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerWxleadlinkResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.customer.wxleadlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_wxleadlink_ex_async(
        self,
        request: resolveservice_models.QueryCustomerWxleadlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerWxleadlinkResponse:
        """
        Description: 查询360客户微信获客链接
        Summary: 查询360客户微信获客链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerWxleadlinkResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.customer.wxleadlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_customer_transartificial(
        self,
        request: resolveservice_models.QueryCustomerTransartificialRequest,
    ) -> resolveservice_models.QueryCustomerTransartificialResponse:
        """
        Description: 查询360客户次日是否提前转人工
        Summary: 查询360客户次日是否提前转人工
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_transartificial_ex(request, headers, runtime)

    async def query_customer_transartificial_async(
        self,
        request: resolveservice_models.QueryCustomerTransartificialRequest,
    ) -> resolveservice_models.QueryCustomerTransartificialResponse:
        """
        Description: 查询360客户次日是否提前转人工
        Summary: 查询360客户次日是否提前转人工
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_transartificial_ex_async(request, headers, runtime)

    def query_customer_transartificial_ex(
        self,
        request: resolveservice_models.QueryCustomerTransartificialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerTransartificialResponse:
        """
        Description: 查询360客户次日是否提前转人工
        Summary: 查询360客户次日是否提前转人工
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerTransartificialResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.customer.transartificial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_transartificial_ex_async(
        self,
        request: resolveservice_models.QueryCustomerTransartificialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.QueryCustomerTransartificialResponse:
        """
        Description: 查询360客户次日是否提前转人工
        Summary: 查询360客户次日是否提前转人工
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.QueryCustomerTransartificialResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.customer.transartificial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_task_callresult(
        self,
        request: resolveservice_models.CallbackTaskCallresultRequest,
    ) -> resolveservice_models.CallbackTaskCallresultResponse:
        """
        Description: 94拨打结果回传
        Summary: 94拨打结果回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_task_callresult_ex(request, headers, runtime)

    async def callback_task_callresult_async(
        self,
        request: resolveservice_models.CallbackTaskCallresultRequest,
    ) -> resolveservice_models.CallbackTaskCallresultResponse:
        """
        Description: 94拨打结果回传
        Summary: 94拨打结果回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_task_callresult_ex_async(request, headers, runtime)

    def callback_task_callresult_ex(
        self,
        request: resolveservice_models.CallbackTaskCallresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.CallbackTaskCallresultResponse:
        """
        Description: 94拨打结果回传
        Summary: 94拨打结果回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.CallbackTaskCallresultResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.task.callresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_task_callresult_ex_async(
        self,
        request: resolveservice_models.CallbackTaskCallresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.CallbackTaskCallresultResponse:
        """
        Description: 94拨打结果回传
        Summary: 94拨打结果回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.CallbackTaskCallresultResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.task.callresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_task_smsresult(
        self,
        request: resolveservice_models.CallbackTaskSmsresultRequest,
    ) -> resolveservice_models.CallbackTaskSmsresultResponse:
        """
        Description: 94短信结果回传
        Summary: 94短信结果回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_task_smsresult_ex(request, headers, runtime)

    async def callback_task_smsresult_async(
        self,
        request: resolveservice_models.CallbackTaskSmsresultRequest,
    ) -> resolveservice_models.CallbackTaskSmsresultResponse:
        """
        Description: 94短信结果回传
        Summary: 94短信结果回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_task_smsresult_ex_async(request, headers, runtime)

    def callback_task_smsresult_ex(
        self,
        request: resolveservice_models.CallbackTaskSmsresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.CallbackTaskSmsresultResponse:
        """
        Description: 94短信结果回传
        Summary: 94短信结果回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.CallbackTaskSmsresultResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.task.smsresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_task_smsresult_ex_async(
        self,
        request: resolveservice_models.CallbackTaskSmsresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.CallbackTaskSmsresultResponse:
        """
        Description: 94短信结果回传
        Summary: 94短信结果回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.CallbackTaskSmsresultResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.task.smsresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_customer_internalmsg(
        self,
        request: resolveservice_models.PushCustomerInternalmsgRequest,
    ) -> resolveservice_models.PushCustomerInternalmsgResponse:
        """
        Description: 94回推360客户行为接口
        Summary: 94回推360客户行为接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_customer_internalmsg_ex(request, headers, runtime)

    async def push_customer_internalmsg_async(
        self,
        request: resolveservice_models.PushCustomerInternalmsgRequest,
    ) -> resolveservice_models.PushCustomerInternalmsgResponse:
        """
        Description: 94回推360客户行为接口
        Summary: 94回推360客户行为接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_customer_internalmsg_ex_async(request, headers, runtime)

    def push_customer_internalmsg_ex(
        self,
        request: resolveservice_models.PushCustomerInternalmsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.PushCustomerInternalmsgResponse:
        """
        Description: 94回推360客户行为接口
        Summary: 94回推360客户行为接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.PushCustomerInternalmsgResponse(),
            self.do_request('1.0', 'antdigital.resolveservice.customer.internalmsg.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_customer_internalmsg_ex_async(
        self,
        request: resolveservice_models.PushCustomerInternalmsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> resolveservice_models.PushCustomerInternalmsgResponse:
        """
        Description: 94回推360客户行为接口
        Summary: 94回推360客户行为接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            resolveservice_models.PushCustomerInternalmsgResponse(),
            await self.do_request_async('1.0', 'antdigital.resolveservice.customer.internalmsg.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
