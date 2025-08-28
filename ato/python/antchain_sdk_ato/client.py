# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ato import models as ato_models
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
        config: ato_models.Config,
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
                    'sdk_version': '1.15.69',
                    '_prod_code': 'ATO',
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
                    'sdk_version': '1.15.69',
                    '_prod_code': 'ATO',
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

    def transfer_broker_userdata(
        self,
        request: ato_models.TransferBrokerUserdataRequest,
    ) -> ato_models.TransferBrokerUserdataResponse:
        """
        Description: 数据提供方可以通过此接口传输数据，触达给消费方
        Summary: 用户信息传输代理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.transfer_broker_userdata_ex(request, headers, runtime)

    async def transfer_broker_userdata_async(
        self,
        request: ato_models.TransferBrokerUserdataRequest,
    ) -> ato_models.TransferBrokerUserdataResponse:
        """
        Description: 数据提供方可以通过此接口传输数据，触达给消费方
        Summary: 用户信息传输代理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.transfer_broker_userdata_ex_async(request, headers, runtime)

    def transfer_broker_userdata_ex(
        self,
        request: ato_models.TransferBrokerUserdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.TransferBrokerUserdataResponse:
        """
        Description: 数据提供方可以通过此接口传输数据，触达给消费方
        Summary: 用户信息传输代理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.TransferBrokerUserdataResponse(),
            self.do_request('1.0', 'antchain.ato.broker.userdata.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def transfer_broker_userdata_ex_async(
        self,
        request: ato_models.TransferBrokerUserdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.TransferBrokerUserdataResponse:
        """
        Description: 数据提供方可以通过此接口传输数据，触达给消费方
        Summary: 用户信息传输代理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.TransferBrokerUserdataResponse(),
            await self.do_request_async('1.0', 'antchain.ato.broker.userdata.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_fundmngdemo(
        self,
        request: ato_models.QueryInnerFundmngdemoRequest,
    ) -> ato_models.QueryInnerFundmngdemoResponse:
        """
        Description: 资方管理系统demo
        Summary: 资方管理系统demo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_fundmngdemo_ex(request, headers, runtime)

    async def query_inner_fundmngdemo_async(
        self,
        request: ato_models.QueryInnerFundmngdemoRequest,
    ) -> ato_models.QueryInnerFundmngdemoResponse:
        """
        Description: 资方管理系统demo
        Summary: 资方管理系统demo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_fundmngdemo_ex_async(request, headers, runtime)

    def query_inner_fundmngdemo_ex(
        self,
        request: ato_models.QueryInnerFundmngdemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngdemoResponse:
        """
        Description: 资方管理系统demo
        Summary: 资方管理系统demo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngdemoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngdemo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_fundmngdemo_ex_async(
        self,
        request: ato_models.QueryInnerFundmngdemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngdemoResponse:
        """
        Description: 资方管理系统demo
        Summary: 资方管理系统demo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngdemoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngdemo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_fundmngfinanceorder(
        self,
        request: ato_models.PagequeryInnerFundmngfinanceorderRequest,
    ) -> ato_models.PagequeryInnerFundmngfinanceorderResponse:
        """
        Description: 资方管理系统融资订单列表
        Summary: 资方管理系统融资订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_fundmngfinanceorder_ex(request, headers, runtime)

    async def pagequery_inner_fundmngfinanceorder_async(
        self,
        request: ato_models.PagequeryInnerFundmngfinanceorderRequest,
    ) -> ato_models.PagequeryInnerFundmngfinanceorderResponse:
        """
        Description: 资方管理系统融资订单列表
        Summary: 资方管理系统融资订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_fundmngfinanceorder_ex_async(request, headers, runtime)

    def pagequery_inner_fundmngfinanceorder_ex(
        self,
        request: ato_models.PagequeryInnerFundmngfinanceorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFundmngfinanceorderResponse:
        """
        Description: 资方管理系统融资订单列表
        Summary: 资方管理系统融资订单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFundmngfinanceorderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngfinanceorder.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_fundmngfinanceorder_ex_async(
        self,
        request: ato_models.PagequeryInnerFundmngfinanceorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFundmngfinanceorderResponse:
        """
        Description: 资方管理系统融资订单列表
        Summary: 资方管理系统融资订单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFundmngfinanceorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngfinanceorder.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_fundmngdatadownload(
        self,
        request: ato_models.SubmitInnerFundmngdatadownloadRequest,
    ) -> ato_models.SubmitInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研系分设计-提交数据下载申请
        Summary: 资方免研-提交数据下载申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_fundmngdatadownload_ex(request, headers, runtime)

    async def submit_inner_fundmngdatadownload_async(
        self,
        request: ato_models.SubmitInnerFundmngdatadownloadRequest,
    ) -> ato_models.SubmitInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研系分设计-提交数据下载申请
        Summary: 资方免研-提交数据下载申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_fundmngdatadownload_ex_async(request, headers, runtime)

    def submit_inner_fundmngdatadownload_ex(
        self,
        request: ato_models.SubmitInnerFundmngdatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研系分设计-提交数据下载申请
        Summary: 资方免研-提交数据下载申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerFundmngdatadownloadResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngdatadownload.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_fundmngdatadownload_ex_async(
        self,
        request: ato_models.SubmitInnerFundmngdatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研系分设计-提交数据下载申请
        Summary: 资方免研-提交数据下载申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerFundmngdatadownloadResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngdatadownload.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_fundmngdatadownload(
        self,
        request: ato_models.PagequeryInnerFundmngdatadownloadRequest,
    ) -> ato_models.PagequeryInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-查询数据下载列表
        Summary: 资方免研-查询数据下载列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_fundmngdatadownload_ex(request, headers, runtime)

    async def pagequery_inner_fundmngdatadownload_async(
        self,
        request: ato_models.PagequeryInnerFundmngdatadownloadRequest,
    ) -> ato_models.PagequeryInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-查询数据下载列表
        Summary: 资方免研-查询数据下载列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_fundmngdatadownload_ex_async(request, headers, runtime)

    def pagequery_inner_fundmngdatadownload_ex(
        self,
        request: ato_models.PagequeryInnerFundmngdatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-查询数据下载列表
        Summary: 资方免研-查询数据下载列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFundmngdatadownloadResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngdatadownload.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_fundmngdatadownload_ex_async(
        self,
        request: ato_models.PagequeryInnerFundmngdatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-查询数据下载列表
        Summary: 资方免研-查询数据下载列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFundmngdatadownloadResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngdatadownload.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_inner_fundmngdatadownload(
        self,
        request: ato_models.DeleteInnerFundmngdatadownloadRequest,
    ) -> ato_models.DeleteInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-删除下载任务
        Summary: 资方免研-删除下载任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_inner_fundmngdatadownload_ex(request, headers, runtime)

    async def delete_inner_fundmngdatadownload_async(
        self,
        request: ato_models.DeleteInnerFundmngdatadownloadRequest,
    ) -> ato_models.DeleteInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-删除下载任务
        Summary: 资方免研-删除下载任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_inner_fundmngdatadownload_ex_async(request, headers, runtime)

    def delete_inner_fundmngdatadownload_ex(
        self,
        request: ato_models.DeleteInnerFundmngdatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-删除下载任务
        Summary: 资方免研-删除下载任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerFundmngdatadownloadResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngdatadownload.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_inner_fundmngdatadownload_ex_async(
        self,
        request: ato_models.DeleteInnerFundmngdatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerFundmngdatadownloadResponse:
        """
        Description: 资方免研-删除下载任务
        Summary: 资方免研-删除下载任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerFundmngdatadownloadResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngdatadownload.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_fundmngmerchantpayitem(
        self,
        request: ato_models.QueryInnerFundmngmerchantpayitemRequest,
    ) -> ato_models.QueryInnerFundmngmerchantpayitemResponse:
        """
        Description: 商户付款项目查询
        Summary: 商户付款项目查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_fundmngmerchantpayitem_ex(request, headers, runtime)

    async def query_inner_fundmngmerchantpayitem_async(
        self,
        request: ato_models.QueryInnerFundmngmerchantpayitemRequest,
    ) -> ato_models.QueryInnerFundmngmerchantpayitemResponse:
        """
        Description: 商户付款项目查询
        Summary: 商户付款项目查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_fundmngmerchantpayitem_ex_async(request, headers, runtime)

    def query_inner_fundmngmerchantpayitem_ex(
        self,
        request: ato_models.QueryInnerFundmngmerchantpayitemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngmerchantpayitemResponse:
        """
        Description: 商户付款项目查询
        Summary: 商户付款项目查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngmerchantpayitemResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngmerchantpayitem.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_fundmngmerchantpayitem_ex_async(
        self,
        request: ato_models.QueryInnerFundmngmerchantpayitemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngmerchantpayitemResponse:
        """
        Description: 商户付款项目查询
        Summary: 商户付款项目查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngmerchantpayitemResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngmerchantpayitem.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_fundmngmerchantpromise(
        self,
        request: ato_models.CreateInnerFundmngmerchantpromiseRequest,
    ) -> ato_models.CreateInnerFundmngmerchantpromiseResponse:
        """
        Description: 商户履约承诺创建
        Summary: 商户履约承诺创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_fundmngmerchantpromise_ex(request, headers, runtime)

    async def create_inner_fundmngmerchantpromise_async(
        self,
        request: ato_models.CreateInnerFundmngmerchantpromiseRequest,
    ) -> ato_models.CreateInnerFundmngmerchantpromiseResponse:
        """
        Description: 商户履约承诺创建
        Summary: 商户履约承诺创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_fundmngmerchantpromise_ex_async(request, headers, runtime)

    def create_inner_fundmngmerchantpromise_ex(
        self,
        request: ato_models.CreateInnerFundmngmerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFundmngmerchantpromiseResponse:
        """
        Description: 商户履约承诺创建
        Summary: 商户履约承诺创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFundmngmerchantpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngmerchantpromise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_fundmngmerchantpromise_ex_async(
        self,
        request: ato_models.CreateInnerFundmngmerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFundmngmerchantpromiseResponse:
        """
        Description: 商户履约承诺创建
        Summary: 商户履约承诺创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFundmngmerchantpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngmerchantpromise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_fundmngloanapply(
        self,
        request: ato_models.QueryInnerFundmngloanapplyRequest,
    ) -> ato_models.QueryInnerFundmngloanapplyResponse:
        """
        Description: 资方放款申请查询
        Summary: 资方放款申请查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_fundmngloanapply_ex(request, headers, runtime)

    async def query_inner_fundmngloanapply_async(
        self,
        request: ato_models.QueryInnerFundmngloanapplyRequest,
    ) -> ato_models.QueryInnerFundmngloanapplyResponse:
        """
        Description: 资方放款申请查询
        Summary: 资方放款申请查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_fundmngloanapply_ex_async(request, headers, runtime)

    def query_inner_fundmngloanapply_ex(
        self,
        request: ato_models.QueryInnerFundmngloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngloanapplyResponse:
        """
        Description: 资方放款申请查询
        Summary: 资方放款申请查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngloanapplyResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngloanapply.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_fundmngloanapply_ex_async(
        self,
        request: ato_models.QueryInnerFundmngloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngloanapplyResponse:
        """
        Description: 资方放款申请查询
        Summary: 资方放款申请查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngloanapplyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngloanapply.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_fundmngaccountinfo(
        self,
        request: ato_models.QueryInnerFundmngaccountinfoRequest,
    ) -> ato_models.QueryInnerFundmngaccountinfoResponse:
        """
        Description: 资方账户信息查询
        Summary: 资方账户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_fundmngaccountinfo_ex(request, headers, runtime)

    async def query_inner_fundmngaccountinfo_async(
        self,
        request: ato_models.QueryInnerFundmngaccountinfoRequest,
    ) -> ato_models.QueryInnerFundmngaccountinfoResponse:
        """
        Description: 资方账户信息查询
        Summary: 资方账户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_fundmngaccountinfo_ex_async(request, headers, runtime)

    def query_inner_fundmngaccountinfo_ex(
        self,
        request: ato_models.QueryInnerFundmngaccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngaccountinfoResponse:
        """
        Description: 资方账户信息查询
        Summary: 资方账户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngaccountinfoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngaccountinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_fundmngaccountinfo_ex_async(
        self,
        request: ato_models.QueryInnerFundmngaccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngaccountinfoResponse:
        """
        Description: 资方账户信息查询
        Summary: 资方账户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngaccountinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngaccountinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_fundmngloanresults(
        self,
        request: ato_models.SyncInnerFundmngloanresultsRequest,
    ) -> ato_models.SyncInnerFundmngloanresultsResponse:
        """
        Description: 放款结果同步
        Summary: 放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_fundmngloanresults_ex(request, headers, runtime)

    async def sync_inner_fundmngloanresults_async(
        self,
        request: ato_models.SyncInnerFundmngloanresultsRequest,
    ) -> ato_models.SyncInnerFundmngloanresultsResponse:
        """
        Description: 放款结果同步
        Summary: 放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_fundmngloanresults_ex_async(request, headers, runtime)

    def sync_inner_fundmngloanresults_ex(
        self,
        request: ato_models.SyncInnerFundmngloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerFundmngloanresultsResponse:
        """
        Description: 放款结果同步
        Summary: 放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerFundmngloanresultsResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_fundmngloanresults_ex_async(
        self,
        request: ato_models.SyncInnerFundmngloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerFundmngloanresultsResponse:
        """
        Description: 放款结果同步
        Summary: 放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerFundmngloanresultsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_fundmngcredit(
        self,
        request: ato_models.CreateInnerFundmngcreditRequest,
    ) -> ato_models.CreateInnerFundmngcreditResponse:
        """
        Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
        Summary: 资产凭证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_fundmngcredit_ex(request, headers, runtime)

    async def create_inner_fundmngcredit_async(
        self,
        request: ato_models.CreateInnerFundmngcreditRequest,
    ) -> ato_models.CreateInnerFundmngcreditResponse:
        """
        Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
        Summary: 资产凭证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_fundmngcredit_ex_async(request, headers, runtime)

    def create_inner_fundmngcredit_ex(
        self,
        request: ato_models.CreateInnerFundmngcreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFundmngcreditResponse:
        """
        Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
        Summary: 资产凭证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFundmngcreditResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngcredit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_fundmngcredit_ex_async(
        self,
        request: ato_models.CreateInnerFundmngcreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFundmngcreditResponse:
        """
        Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
        Summary: 资产凭证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFundmngcreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngcredit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_fundmngcredit(
        self,
        request: ato_models.QueryInnerFundmngcreditRequest,
    ) -> ato_models.QueryInnerFundmngcreditResponse:
        """
        Description: 可以根据订单号查询资产凭证信息
        Summary: 资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_fundmngcredit_ex(request, headers, runtime)

    async def query_inner_fundmngcredit_async(
        self,
        request: ato_models.QueryInnerFundmngcreditRequest,
    ) -> ato_models.QueryInnerFundmngcreditResponse:
        """
        Description: 可以根据订单号查询资产凭证信息
        Summary: 资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_fundmngcredit_ex_async(request, headers, runtime)

    def query_inner_fundmngcredit_ex(
        self,
        request: ato_models.QueryInnerFundmngcreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngcreditResponse:
        """
        Description: 可以根据订单号查询资产凭证信息
        Summary: 资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngcreditResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngcredit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_fundmngcredit_ex_async(
        self,
        request: ato_models.QueryInnerFundmngcreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngcreditResponse:
        """
        Description: 可以根据订单号查询资产凭证信息
        Summary: 资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngcreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngcredit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_fundmngorder(
        self,
        request: ato_models.DetailInnerFundmngorderRequest,
    ) -> ato_models.DetailInnerFundmngorderResponse:
        """
        Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
        Summary: 资方管理系统订单详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_fundmngorder_ex(request, headers, runtime)

    async def detail_inner_fundmngorder_async(
        self,
        request: ato_models.DetailInnerFundmngorderRequest,
    ) -> ato_models.DetailInnerFundmngorderResponse:
        """
        Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
        Summary: 资方管理系统订单详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_fundmngorder_ex_async(request, headers, runtime)

    def detail_inner_fundmngorder_ex(
        self,
        request: ato_models.DetailInnerFundmngorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerFundmngorderResponse:
        """
        Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
        Summary: 资方管理系统订单详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerFundmngorderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngorder.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_fundmngorder_ex_async(
        self,
        request: ato_models.DetailInnerFundmngorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerFundmngorderResponse:
        """
        Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
        Summary: 资方管理系统订单详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerFundmngorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngorder.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_fundmngmerchantperformance(
        self,
        request: ato_models.QueryInnerFundmngmerchantperformanceRequest,
    ) -> ato_models.QueryInnerFundmngmerchantperformanceResponse:
        """
        Description: （资方控制台）商户履约查询
        Summary: 商户履约查询(资方控制台)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_fundmngmerchantperformance_ex(request, headers, runtime)

    async def query_inner_fundmngmerchantperformance_async(
        self,
        request: ato_models.QueryInnerFundmngmerchantperformanceRequest,
    ) -> ato_models.QueryInnerFundmngmerchantperformanceResponse:
        """
        Description: （资方控制台）商户履约查询
        Summary: 商户履约查询(资方控制台)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_fundmngmerchantperformance_ex_async(request, headers, runtime)

    def query_inner_fundmngmerchantperformance_ex(
        self,
        request: ato_models.QueryInnerFundmngmerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngmerchantperformanceResponse:
        """
        Description: （资方控制台）商户履约查询
        Summary: 商户履约查询(资方控制台)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngmerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.fundmngmerchantperformance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_fundmngmerchantperformance_ex_async(
        self,
        request: ato_models.QueryInnerFundmngmerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFundmngmerchantperformanceResponse:
        """
        Description: （资方控制台）商户履约查询
        Summary: 商户履约查询(资方控制台)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFundmngmerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.fundmngmerchantperformance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_splitting(
        self,
        request: ato_models.SyncFundSplittingRequest,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_splitting_ex(request, headers, runtime)

    async def sync_fund_splitting_async(
        self,
        request: ato_models.SyncFundSplittingRequest,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_splitting_ex_async(request, headers, runtime)

    def sync_fund_splitting_ex(
        self,
        request: ato_models.SyncFundSplittingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundSplittingResponse(),
            self.do_request('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_splitting_ex_async(
        self,
        request: ato_models.SyncFundSplittingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundSplittingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_orderfinancial(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_orderfinancial_ex(request, headers, runtime)

    async def sync_fund_orderfinancial_async(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_orderfinancial_ex_async(request, headers, runtime)

    def sync_fund_orderfinancial_ex(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfinancialResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_orderfinancial_ex_async(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfinancialResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_withholdingcontract(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_withholdingcontract_ex(request, headers, runtime)

    async def sync_fund_withholdingcontract_async(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_withholdingcontract_ex_async(request, headers, runtime)

    def sync_fund_withholdingcontract_ex(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundWithholdingcontractResponse(),
            self.do_request('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_withholdingcontract_ex_async(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundWithholdingcontractResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_orderfulfillment(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_orderfulfillment_ex(request, headers, runtime)

    async def sync_fund_orderfulfillment_async(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_orderfulfillment_ex_async(request, headers, runtime)

    def sync_fund_orderfulfillment_ex(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_orderfulfillment_ex_async(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_orderfulfillment(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_orderfulfillment_ex(request, headers, runtime)

    async def get_fund_orderfulfillment_async(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_orderfulfillment_ex_async(request, headers, runtime)

    def get_fund_orderfulfillment_ex(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_orderfulfillment_ex_async(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_fund_flow(
        self,
        request: ato_models.UploadFundFlowRequest,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_fund_flow_ex(request, headers, runtime)

    async def upload_fund_flow_async(
        self,
        request: ato_models.UploadFundFlowRequest,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_fund_flow_ex_async(request, headers, runtime)

    def upload_fund_flow_ex(
        self,
        request: ato_models.UploadFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.fund.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_fund_flow_response = ato_models.UploadFundFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_fund_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_fund_flow_ex_async(
        self,
        request: ato_models.UploadFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.fund.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_fund_flow_response = ato_models.UploadFundFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_fund_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_flow(
        self,
        request: ato_models.GetFundFlowRequest,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_flow_ex(request, headers, runtime)

    async def get_fund_flow_async(
        self,
        request: ato_models.GetFundFlowRequest,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_flow_ex_async(request, headers, runtime)

    def get_fund_flow_ex(
        self,
        request: ato_models.GetFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_flow_ex_async(
        self,
        request: ato_models.GetFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_fund_flow(
        self,
        request: ato_models.RefuseFundFlowRequest,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_fund_flow_ex(request, headers, runtime)

    async def refuse_fund_flow_async(
        self,
        request: ato_models.RefuseFundFlowRequest,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_fund_flow_ex_async(request, headers, runtime)

    def refuse_fund_flow_ex(
        self,
        request: ato_models.RefuseFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefuseFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_fund_flow_ex_async(
        self,
        request: ato_models.RefuseFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefuseFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_fund_flow(
        self,
        request: ato_models.AuthFundFlowRequest,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_fund_flow_ex(request, headers, runtime)

    async def auth_fund_flow_async(
        self,
        request: ato_models.AuthFundFlowRequest,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_fund_flow_ex_async(request, headers, runtime)

    def auth_fund_flow_ex(
        self,
        request: ato_models.AuthFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_fund_flow_ex_async(
        self,
        request: ato_models.AuthFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_fund_plan(
        self,
        request: ato_models.CancelFundPlanRequest,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_fund_plan_ex(request, headers, runtime)

    async def cancel_fund_plan_async(
        self,
        request: ato_models.CancelFundPlanRequest,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_fund_plan_ex_async(request, headers, runtime)

    def cancel_fund_plan_ex(
        self,
        request: ato_models.CancelFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelFundPlanResponse(),
            self.do_request('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_fund_plan_ex_async(
        self,
        request: ato_models.CancelFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelFundPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_fund_notify(
        self,
        request: ato_models.CallbackFundNotifyRequest,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_fund_notify_ex(request, headers, runtime)

    async def callback_fund_notify_async(
        self,
        request: ato_models.CallbackFundNotifyRequest,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_fund_notify_ex_async(request, headers, runtime)

    def callback_fund_notify_ex(
        self,
        request: ato_models.CallbackFundNotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CallbackFundNotifyResponse(),
            self.do_request('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_fund_notify_ex_async(
        self,
        request: ato_models.CallbackFundNotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CallbackFundNotifyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_merchantpromise(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_merchantpromise_ex(request, headers, runtime)

    async def sync_fund_merchantpromise_async(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_merchantpromise_ex_async(request, headers, runtime)

    def sync_fund_merchantpromise_ex(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundMerchantpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_merchantpromise_ex_async(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundMerchantpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_financeloanresults(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_financeloanresults_ex(request, headers, runtime)

    async def sync_fund_financeloanresults_async(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_financeloanresults_ex_async(request, headers, runtime)

    def sync_fund_financeloanresults_ex(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundFinanceloanresultsResponse(),
            self.do_request('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_financeloanresults_ex_async(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundFinanceloanresultsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_userpromise(
        self,
        request: ato_models.GetFundUserpromiseRequest,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_userpromise_ex(request, headers, runtime)

    async def get_fund_userpromise_async(
        self,
        request: ato_models.GetFundUserpromiseRequest,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_userpromise_ex_async(request, headers, runtime)

    def get_fund_userpromise_ex(
        self,
        request: ato_models.GetFundUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_userpromise_ex_async(
        self,
        request: ato_models.GetFundUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_userperformance(
        self,
        request: ato_models.GetFundUserperformanceRequest,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_userperformance_ex(request, headers, runtime)

    async def get_fund_userperformance_async(
        self,
        request: ato_models.GetFundUserperformanceRequest,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_userperformance_ex_async(request, headers, runtime)

    def get_fund_userperformance_ex(
        self,
        request: ato_models.GetFundUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_userperformance_ex_async(
        self,
        request: ato_models.GetFundUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_merchantperformance(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_merchantperformance_ex(request, headers, runtime)

    async def get_fund_merchantperformance_async(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_merchantperformance_ex_async(request, headers, runtime)

    def get_fund_merchantperformance_ex(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundMerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_merchantperformance_ex_async(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundMerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_orderfullinfo(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_orderfullinfo_ex(request, headers, runtime)

    async def get_fund_orderfullinfo_async(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_orderfullinfo_ex_async(request, headers, runtime)

    def get_fund_orderfullinfo_ex(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfullinfoResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_orderfullinfo_ex_async(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfullinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_fund_flow(
        self,
        request: ato_models.NotifyFundFlowRequest,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_fund_flow_ex(request, headers, runtime)

    async def notify_fund_flow_async(
        self,
        request: ato_models.NotifyFundFlowRequest,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_fund_flow_ex_async(request, headers, runtime)

    def notify_fund_flow_ex(
        self,
        request: ato_models.NotifyFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.NotifyFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_fund_flow_ex_async(
        self,
        request: ato_models.NotifyFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.NotifyFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_fund_credit(
        self,
        request: ato_models.UploadFundCreditRequest,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_fund_credit_ex(request, headers, runtime)

    async def upload_fund_credit_async(
        self,
        request: ato_models.UploadFundCreditRequest,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_fund_credit_ex_async(request, headers, runtime)

    def upload_fund_credit_ex(
        self,
        request: ato_models.UploadFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundCreditResponse(),
            self.do_request('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_fund_credit_ex_async(
        self,
        request: ato_models.UploadFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_credit(
        self,
        request: ato_models.QueryFundCreditRequest,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_credit_ex(request, headers, runtime)

    async def query_fund_credit_async(
        self,
        request: ato_models.QueryFundCreditRequest,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_credit_ex_async(request, headers, runtime)

    def query_fund_credit_ex(
        self,
        request: ato_models.QueryFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditResponse(),
            self.do_request('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_credit_ex_async(
        self,
        request: ato_models.QueryFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_financeprecheckresult(
        self,
        request: ato_models.SyncFundFinanceprecheckresultRequest,
    ) -> ato_models.SyncFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_financeprecheckresult_ex(request, headers, runtime)

    async def sync_fund_financeprecheckresult_async(
        self,
        request: ato_models.SyncFundFinanceprecheckresultRequest,
    ) -> ato_models.SyncFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_financeprecheckresult_ex_async(request, headers, runtime)

    def sync_fund_financeprecheckresult_ex(
        self,
        request: ato_models.SyncFundFinanceprecheckresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundFinanceprecheckresultResponse(),
            self.do_request('1.0', 'antchain.ato.fund.financeprecheckresult.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_financeprecheckresult_ex_async(
        self,
        request: ato_models.SyncFundFinanceprecheckresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundFinanceprecheckresultResponse:
        """
        Description: 融资预审结果同步
        Summary: 融资预审结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundFinanceprecheckresultResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.financeprecheckresult.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_compensateaccount(
        self,
        request: ato_models.QueryFundCompensateaccountRequest,
    ) -> ato_models.QueryFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_compensateaccount_ex(request, headers, runtime)

    async def query_fund_compensateaccount_async(
        self,
        request: ato_models.QueryFundCompensateaccountRequest,
    ) -> ato_models.QueryFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_compensateaccount_ex_async(request, headers, runtime)

    def query_fund_compensateaccount_ex(
        self,
        request: ato_models.QueryFundCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCompensateaccountResponse(),
            self.do_request('1.0', 'antchain.ato.fund.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_compensateaccount_ex_async(
        self,
        request: ato_models.QueryFundCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCompensateaccountResponse:
        """
        Description: 资方查询代偿户余额
        Summary: 代偿户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCompensateaccountResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_orderfinanceinfo(
        self,
        request: ato_models.GetFundOrderfinanceinfoRequest,
    ) -> ato_models.GetFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_orderfinanceinfo_ex(request, headers, runtime)

    async def get_fund_orderfinanceinfo_async(
        self,
        request: ato_models.GetFundOrderfinanceinfoRequest,
    ) -> ato_models.GetFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_orderfinanceinfo_ex_async(request, headers, runtime)

    def get_fund_orderfinanceinfo_ex(
        self,
        request: ato_models.GetFundOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfinanceinfoResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_orderfinanceinfo_ex_async(
        self,
        request: ato_models.GetFundOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfinanceinfoResponse:
        """
        Description: 资方查询订单融资信息
        Summary: 资方查询订单融资信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfinanceinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_fund_dividerelation(
        self,
        request: ato_models.AddFundDividerelationRequest,
    ) -> ato_models.AddFundDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_fund_dividerelation_ex(request, headers, runtime)

    async def add_fund_dividerelation_async(
        self,
        request: ato_models.AddFundDividerelationRequest,
    ) -> ato_models.AddFundDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_fund_dividerelation_ex_async(request, headers, runtime)

    def add_fund_dividerelation_ex(
        self,
        request: ato_models.AddFundDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddFundDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddFundDividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.fund.dividerelation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_fund_dividerelation_ex_async(
        self,
        request: ato_models.AddFundDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddFundDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddFundDividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.dividerelation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_dividerelation(
        self,
        request: ato_models.QueryFundDividerelationRequest,
    ) -> ato_models.QueryFundDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_dividerelation_ex(request, headers, runtime)

    async def query_fund_dividerelation_async(
        self,
        request: ato_models.QueryFundDividerelationRequest,
    ) -> ato_models.QueryFundDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_dividerelation_ex_async(request, headers, runtime)

    def query_fund_dividerelation_ex(
        self,
        request: ato_models.QueryFundDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundDividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.fund.dividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_dividerelation_ex_async(
        self,
        request: ato_models.QueryFundDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundDividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.dividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_fund_creditutilization(
        self,
        request: ato_models.ApplyFundCreditutilizationRequest,
    ) -> ato_models.ApplyFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_fund_creditutilization_ex(request, headers, runtime)

    async def apply_fund_creditutilization_async(
        self,
        request: ato_models.ApplyFundCreditutilizationRequest,
    ) -> ato_models.ApplyFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_fund_creditutilization_ex_async(request, headers, runtime)

    def apply_fund_creditutilization_ex(
        self,
        request: ato_models.ApplyFundCreditutilizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ApplyFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ApplyFundCreditutilizationResponse(),
            self.do_request('1.0', 'antchain.ato.fund.creditutilization.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_fund_creditutilization_ex_async(
        self,
        request: ato_models.ApplyFundCreditutilizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ApplyFundCreditutilizationResponse:
        """
        Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
        Summary: 用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ApplyFundCreditutilizationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.creditutilization.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_fund_assertorder(
        self,
        request: ato_models.ApplyFundAssertorderRequest,
    ) -> ato_models.ApplyFundAssertorderResponse:
        """
        Description: 小贷融资用信申请订单履约信息
        Summary: 用信申请订单履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_fund_assertorder_ex(request, headers, runtime)

    async def apply_fund_assertorder_async(
        self,
        request: ato_models.ApplyFundAssertorderRequest,
    ) -> ato_models.ApplyFundAssertorderResponse:
        """
        Description: 小贷融资用信申请订单履约信息
        Summary: 用信申请订单履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_fund_assertorder_ex_async(request, headers, runtime)

    def apply_fund_assertorder_ex(
        self,
        request: ato_models.ApplyFundAssertorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ApplyFundAssertorderResponse:
        """
        Description: 小贷融资用信申请订单履约信息
        Summary: 用信申请订单履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ApplyFundAssertorderResponse(),
            self.do_request('1.0', 'antchain.ato.fund.assertorder.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_fund_assertorder_ex_async(
        self,
        request: ato_models.ApplyFundAssertorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ApplyFundAssertorderResponse:
        """
        Description: 小贷融资用信申请订单履约信息
        Summary: 用信申请订单履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ApplyFundAssertorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.assertorder.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_assertorder(
        self,
        request: ato_models.QueryFundAssertorderRequest,
    ) -> ato_models.QueryFundAssertorderResponse:
        """
        Description: 用信查询订单履约信息
        Summary: 用信查询订单履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_assertorder_ex(request, headers, runtime)

    async def query_fund_assertorder_async(
        self,
        request: ato_models.QueryFundAssertorderRequest,
    ) -> ato_models.QueryFundAssertorderResponse:
        """
        Description: 用信查询订单履约信息
        Summary: 用信查询订单履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_assertorder_ex_async(request, headers, runtime)

    def query_fund_assertorder_ex(
        self,
        request: ato_models.QueryFundAssertorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundAssertorderResponse:
        """
        Description: 用信查询订单履约信息
        Summary: 用信查询订单履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundAssertorderResponse(),
            self.do_request('1.0', 'antchain.ato.fund.assertorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_assertorder_ex_async(
        self,
        request: ato_models.QueryFundAssertorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundAssertorderResponse:
        """
        Description: 用信查询订单履约信息
        Summary: 用信查询订单履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundAssertorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.assertorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_creditgranting(
        self,
        request: ato_models.SyncFundCreditgrantingRequest,
    ) -> ato_models.SyncFundCreditgrantingResponse:
        """
        Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
        Summary: 授信结果同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_creditgranting_ex(request, headers, runtime)

    async def sync_fund_creditgranting_async(
        self,
        request: ato_models.SyncFundCreditgrantingRequest,
    ) -> ato_models.SyncFundCreditgrantingResponse:
        """
        Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
        Summary: 授信结果同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_creditgranting_ex_async(request, headers, runtime)

    def sync_fund_creditgranting_ex(
        self,
        request: ato_models.SyncFundCreditgrantingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundCreditgrantingResponse:
        """
        Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
        Summary: 授信结果同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundCreditgrantingResponse(),
            self.do_request('1.0', 'antchain.ato.fund.creditgranting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_creditgranting_ex_async(
        self,
        request: ato_models.SyncFundCreditgrantingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundCreditgrantingResponse:
        """
        Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
        Summary: 授信结果同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundCreditgrantingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.creditgranting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_fund_creditgranting(
        self,
        request: ato_models.AuthFundCreditgrantingRequest,
    ) -> ato_models.AuthFundCreditgrantingResponse:
        """
        Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
        Summary: 授信授权申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_fund_creditgranting_ex(request, headers, runtime)

    async def auth_fund_creditgranting_async(
        self,
        request: ato_models.AuthFundCreditgrantingRequest,
    ) -> ato_models.AuthFundCreditgrantingResponse:
        """
        Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
        Summary: 授信授权申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_fund_creditgranting_ex_async(request, headers, runtime)

    def auth_fund_creditgranting_ex(
        self,
        request: ato_models.AuthFundCreditgrantingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthFundCreditgrantingResponse:
        """
        Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
        Summary: 授信授权申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthFundCreditgrantingResponse(),
            self.do_request('1.0', 'antchain.ato.fund.creditgranting.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_fund_creditgranting_ex_async(
        self,
        request: ato_models.AuthFundCreditgrantingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthFundCreditgrantingResponse:
        """
        Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
        Summary: 授信授权申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthFundCreditgrantingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.creditgranting.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_assertreport(
        self,
        request: ato_models.QueryFundAssertreportRequest,
    ) -> ato_models.QueryFundAssertreportResponse:
        """
        Description: 小贷融资查询资产报告
        Summary: 查询资产报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_assertreport_ex(request, headers, runtime)

    async def query_fund_assertreport_async(
        self,
        request: ato_models.QueryFundAssertreportRequest,
    ) -> ato_models.QueryFundAssertreportResponse:
        """
        Description: 小贷融资查询资产报告
        Summary: 查询资产报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_assertreport_ex_async(request, headers, runtime)

    def query_fund_assertreport_ex(
        self,
        request: ato_models.QueryFundAssertreportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundAssertreportResponse:
        """
        Description: 小贷融资查询资产报告
        Summary: 查询资产报告
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundAssertreportResponse(),
            self.do_request('1.0', 'antchain.ato.fund.assertreport.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_assertreport_ex_async(
        self,
        request: ato_models.QueryFundAssertreportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundAssertreportResponse:
        """
        Description: 小贷融资查询资产报告
        Summary: 查询资产报告
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundAssertreportResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.assertreport.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_creditgranting(
        self,
        request: ato_models.QueryFundCreditgrantingRequest,
    ) -> ato_models.QueryFundCreditgrantingResponse:
        """
        Description: 本接口用于查询授信结果
        Summary: 授信结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_creditgranting_ex(request, headers, runtime)

    async def query_fund_creditgranting_async(
        self,
        request: ato_models.QueryFundCreditgrantingRequest,
    ) -> ato_models.QueryFundCreditgrantingResponse:
        """
        Description: 本接口用于查询授信结果
        Summary: 授信结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_creditgranting_ex_async(request, headers, runtime)

    def query_fund_creditgranting_ex(
        self,
        request: ato_models.QueryFundCreditgrantingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditgrantingResponse:
        """
        Description: 本接口用于查询授信结果
        Summary: 授信结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditgrantingResponse(),
            self.do_request('1.0', 'antchain.ato.fund.creditgranting.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_creditgranting_ex_async(
        self,
        request: ato_models.QueryFundCreditgrantingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditgrantingResponse:
        """
        Description: 本接口用于查询授信结果
        Summary: 授信结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditgrantingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.creditgranting.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_creditauth(
        self,
        request: ato_models.QueryFundCreditauthRequest,
    ) -> ato_models.QueryFundCreditauthResponse:
        """
        Description: 授权信息查询
        Summary: 授权信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_creditauth_ex(request, headers, runtime)

    async def query_fund_creditauth_async(
        self,
        request: ato_models.QueryFundCreditauthRequest,
    ) -> ato_models.QueryFundCreditauthResponse:
        """
        Description: 授权信息查询
        Summary: 授权信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_creditauth_ex_async(request, headers, runtime)

    def query_fund_creditauth_ex(
        self,
        request: ato_models.QueryFundCreditauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditauthResponse:
        """
        Description: 授权信息查询
        Summary: 授权信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditauthResponse(),
            self.do_request('1.0', 'antchain.ato.fund.creditauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_creditauth_ex_async(
        self,
        request: ato_models.QueryFundCreditauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditauthResponse:
        """
        Description: 授权信息查询
        Summary: 授权信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditauthResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.creditauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_assetpackage(
        self,
        request: ato_models.QueryFundAssetpackageRequest,
    ) -> ato_models.QueryFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_assetpackage_ex(request, headers, runtime)

    async def query_fund_assetpackage_async(
        self,
        request: ato_models.QueryFundAssetpackageRequest,
    ) -> ato_models.QueryFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_assetpackage_ex_async(request, headers, runtime)

    def query_fund_assetpackage_ex(
        self,
        request: ato_models.QueryFundAssetpackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundAssetpackageResponse(),
            self.do_request('1.0', 'antchain.ato.fund.assetpackage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_assetpackage_ex_async(
        self,
        request: ato_models.QueryFundAssetpackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundAssetpackageResponse:
        """
        Description: 资产包详情查询
        Summary: 资产包详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundAssetpackageResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.assetpackage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_fund_usercancel(
        self,
        request: ato_models.ConfirmFundUsercancelRequest,
    ) -> ato_models.ConfirmFundUsercancelResponse:
        """
        Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
        Summary: 允许用户取消(确认用户取消)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_fund_usercancel_ex(request, headers, runtime)

    async def confirm_fund_usercancel_async(
        self,
        request: ato_models.ConfirmFundUsercancelRequest,
    ) -> ato_models.ConfirmFundUsercancelResponse:
        """
        Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
        Summary: 允许用户取消(确认用户取消)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_fund_usercancel_ex_async(request, headers, runtime)

    def confirm_fund_usercancel_ex(
        self,
        request: ato_models.ConfirmFundUsercancelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmFundUsercancelResponse:
        """
        Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
        Summary: 允许用户取消(确认用户取消)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmFundUsercancelResponse(),
            self.do_request('1.0', 'antchain.ato.fund.usercancel.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_fund_usercancel_ex_async(
        self,
        request: ato_models.ConfirmFundUsercancelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmFundUsercancelResponse:
        """
        Description: 调用说明：
        1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
        Summary: 允许用户取消(确认用户取消)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmFundUsercancelResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.usercancel.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_fund_plan(
        self,
        request: ato_models.RepayFundPlanRequest,
    ) -> ato_models.RepayFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_fund_plan_ex(request, headers, runtime)

    async def repay_fund_plan_async(
        self,
        request: ato_models.RepayFundPlanRequest,
    ) -> ato_models.RepayFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_fund_plan_ex_async(request, headers, runtime)

    def repay_fund_plan_ex(
        self,
        request: ato_models.RepayFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RepayFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RepayFundPlanResponse(),
            self.do_request('1.0', 'antchain.ato.fund.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_fund_plan_ex_async(
        self,
        request: ato_models.RepayFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RepayFundPlanResponse:
        """
        Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
        Summary: 商户履约其他方式还款（单期取消）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RepayFundPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_compensatesignurl(
        self,
        request: ato_models.GetFundCompensatesignurlRequest,
    ) -> ato_models.GetFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_compensatesignurl_ex(request, headers, runtime)

    async def get_fund_compensatesignurl_async(
        self,
        request: ato_models.GetFundCompensatesignurlRequest,
    ) -> ato_models.GetFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_compensatesignurl_ex_async(request, headers, runtime)

    def get_fund_compensatesignurl_ex(
        self,
        request: ato_models.GetFundCompensatesignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundCompensatesignurlResponse(),
            self.do_request('1.0', 'antchain.ato.fund.compensatesignurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_compensatesignurl_ex_async(
        self,
        request: ato_models.GetFundCompensatesignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundCompensatesignurlResponse:
        """
        Description: 资方代偿签约链接获取
        Summary: 资方代偿签约链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundCompensatesignurlResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.compensatesignurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_fund_compensate(
        self,
        request: ato_models.ConfirmFundCompensateRequest,
    ) -> ato_models.ConfirmFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_fund_compensate_ex(request, headers, runtime)

    async def confirm_fund_compensate_async(
        self,
        request: ato_models.ConfirmFundCompensateRequest,
    ) -> ato_models.ConfirmFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_fund_compensate_ex_async(request, headers, runtime)

    def confirm_fund_compensate_ex(
        self,
        request: ato_models.ConfirmFundCompensateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmFundCompensateResponse(),
            self.do_request('1.0', 'antchain.ato.fund.compensate.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_fund_compensate_ex_async(
        self,
        request: ato_models.ConfirmFundCompensateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmFundCompensateResponse:
        """
        Description: 转账代偿签约结果确认
        Summary: 转账代偿签约结果确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmFundCompensateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.compensate.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_product(
        self,
        request: ato_models.GetInnerProductRequest,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_product_ex(request, headers, runtime)

    async def get_inner_product_async(
        self,
        request: ato_models.GetInnerProductRequest,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_product_ex_async(request, headers, runtime)

    def get_inner_product_ex(
        self,
        request: ato_models.GetInnerProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerProductResponse(),
            self.do_request('1.0', 'antchain.ato.inner.product.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_product_ex_async(
        self,
        request: ato_models.GetInnerProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerProductResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.product.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_tenant(
        self,
        request: ato_models.GetInnerTenantRequest,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_tenant_ex(request, headers, runtime)

    async def get_inner_tenant_async(
        self,
        request: ato_models.GetInnerTenantRequest,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_tenant_ex_async(request, headers, runtime)

    def get_inner_tenant_ex(
        self,
        request: ato_models.GetInnerTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTenantResponse(),
            self.do_request('1.0', 'antchain.ato.inner.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_tenant_ex_async(
        self,
        request: ato_models.GetInnerTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTenantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_meterforwholeorder(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_meterforwholeorder_ex(request, headers, runtime)

    async def sync_inner_meterforwholeorder_async(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_meterforwholeorder_ex_async(request, headers, runtime)

    def sync_inner_meterforwholeorder_ex(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforwholeorderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.meterforwholeorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_meterforwholeorder_ex_async(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforwholeorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.meterforwholeorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_meterforagsign(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_meterforagsign_ex(request, headers, runtime)

    async def sync_inner_meterforagsign_async(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_meterforagsign_ex_async(request, headers, runtime)

    def sync_inner_meterforagsign_ex(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforagsignResponse(),
            self.do_request('1.0', 'antchain.ato.inner.meterforagsign.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_meterforagsign_ex_async(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforagsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.meterforagsign.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_inner_template(
        self,
        request: ato_models.AllInnerTemplateRequest,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_inner_template_ex(request, headers, runtime)

    async def all_inner_template_async(
        self,
        request: ato_models.AllInnerTemplateRequest,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_inner_template_ex_async(request, headers, runtime)

    def all_inner_template_ex(
        self,
        request: ato_models.AllInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_inner_template_ex_async(
        self,
        request: ato_models.AllInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_inner_template(
        self,
        request: ato_models.ListInnerTemplateRequest,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_inner_template_ex(request, headers, runtime)

    async def list_inner_template_async(
        self,
        request: ato_models.ListInnerTemplateRequest,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_inner_template_ex_async(request, headers, runtime)

    def list_inner_template_ex(
        self,
        request: ato_models.ListInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ListInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_inner_template_ex_async(
        self,
        request: ato_models.ListInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ListInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_template(
        self,
        request: ato_models.DetailInnerTemplateRequest,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_template_ex(request, headers, runtime)

    async def detail_inner_template_async(
        self,
        request: ato_models.DetailInnerTemplateRequest,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_template_ex_async(request, headers, runtime)

    def detail_inner_template_ex(
        self,
        request: ato_models.DetailInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_template_ex_async(
        self,
        request: ato_models.DetailInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_template(
        self,
        request: ato_models.CreateInnerTemplateRequest,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_template_ex(request, headers, runtime)

    async def create_inner_template_async(
        self,
        request: ato_models.CreateInnerTemplateRequest,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_template_ex_async(request, headers, runtime)

    def create_inner_template_ex(
        self,
        request: ato_models.CreateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_template_ex_async(
        self,
        request: ato_models.CreateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_inner_template(
        self,
        request: ato_models.SaveInnerTemplateRequest,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_inner_template_ex(request, headers, runtime)

    async def save_inner_template_async(
        self,
        request: ato_models.SaveInnerTemplateRequest,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_inner_template_ex_async(request, headers, runtime)

    def save_inner_template_ex(
        self,
        request: ato_models.SaveInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_inner_template_ex_async(
        self,
        request: ato_models.SaveInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_inner_signfields(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_inner_signfields_ex(request, headers, runtime)

    async def save_inner_signfields_async(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_inner_signfields_ex_async(request, headers, runtime)

    def save_inner_signfields_ex(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerSignfieldsResponse(),
            self.do_request('1.0', 'antchain.ato.inner.signfields.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_inner_signfields_ex_async(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerSignfieldsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.signfields.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_inner_template(
        self,
        request: ato_models.PublishInnerTemplateRequest,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_inner_template_ex(request, headers, runtime)

    async def publish_inner_template_async(
        self,
        request: ato_models.PublishInnerTemplateRequest,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_inner_template_ex_async(request, headers, runtime)

    def publish_inner_template_ex(
        self,
        request: ato_models.PublishInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PublishInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_inner_template_ex_async(
        self,
        request: ato_models.PublishInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PublishInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_inner_template(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_inner_template_ex(request, headers, runtime)

    async def preview_inner_template_async(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_inner_template_ex_async(request, headers, runtime)

    def preview_inner_template_ex(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PreviewInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_inner_template_ex_async(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PreviewInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_inner_template(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_inner_template_ex(request, headers, runtime)

    async def delete_inner_template_async(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_inner_template_ex_async(request, headers, runtime)

    def delete_inner_template_ex(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_inner_template_ex_async(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_inner_template(
        self,
        request: ato_models.CloneInnerTemplateRequest,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_inner_template_ex(request, headers, runtime)

    async def clone_inner_template_async(
        self,
        request: ato_models.CloneInnerTemplateRequest,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_inner_template_ex_async(request, headers, runtime)

    def clone_inner_template_ex(
        self,
        request: ato_models.CloneInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_inner_template_ex_async(
        self,
        request: ato_models.CloneInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_inner_file(
        self,
        request: ato_models.UploadInnerFileRequest,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_inner_file_ex(request, headers, runtime)

    async def upload_inner_file_async(
        self,
        request: ato_models.UploadInnerFileRequest,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_inner_file_ex_async(request, headers, runtime)

    def upload_inner_file_ex(
        self,
        request: ato_models.UploadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadInnerFileResponse(),
            self.do_request('1.0', 'antchain.ato.inner.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_inner_file_ex_async(
        self,
        request: ato_models.UploadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadInnerFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_inner_file(
        self,
        request: ato_models.DownloadInnerFileRequest,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_inner_file_ex(request, headers, runtime)

    async def download_inner_file_async(
        self,
        request: ato_models.DownloadInnerFileRequest,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_inner_file_ex_async(request, headers, runtime)

    def download_inner_file_ex(
        self,
        request: ato_models.DownloadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DownloadInnerFileResponse(),
            self.do_request('1.0', 'antchain.ato.inner.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_inner_file_ex_async(
        self,
        request: ato_models.DownloadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DownloadInnerFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_templateofficeurl(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_templateofficeurl_ex(request, headers, runtime)

    async def get_inner_templateofficeurl_async(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_templateofficeurl_ex_async(request, headers, runtime)

    def get_inner_templateofficeurl_ex(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTemplateofficeurlResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateofficeurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_templateofficeurl_ex_async(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTemplateofficeurlResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateofficeurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refresh_inner_templatetoken(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refresh_inner_templatetoken_ex(request, headers, runtime)

    async def refresh_inner_templatetoken_async(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refresh_inner_templatetoken_ex_async(request, headers, runtime)

    def refresh_inner_templatetoken_ex(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefreshInnerTemplatetokenResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatetoken.refresh', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refresh_inner_templatetoken_ex_async(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefreshInnerTemplatetokenResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatetoken.refresh', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_templatetextarea(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_templatetextarea_ex(request, headers, runtime)

    async def create_inner_templatetextarea_async(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_templatetextarea_ex_async(request, headers, runtime)

    def create_inner_templatetextarea_ex(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplatetextareaResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatetextarea.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_templatetextarea_ex_async(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplatetextareaResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatetextarea.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateimage(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateimage_ex(request, headers, runtime)

    async def query_inner_templateimage_async(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateimage_ex_async(request, headers, runtime)

    def query_inner_templateimage_ex(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateimageResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateimage_ex_async(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateimageResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_funddividerelation(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_funddividerelation_ex(request, headers, runtime)

    async def create_inner_funddividerelation_async(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_funddividerelation_ex_async(request, headers, runtime)

    def create_inner_funddividerelation_ex(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_funddividerelation_ex_async(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_funddividerelation(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_funddividerelation_ex(request, headers, runtime)

    async def submit_inner_funddividerelation_async(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_funddividerelation_ex_async(request, headers, runtime)

    def submit_inner_funddividerelation_ex(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_funddividerelation_ex_async(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_funddividerelation(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_funddividerelation_ex(request, headers, runtime)

    async def query_inner_funddividerelation_async(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_funddividerelation_ex_async(request, headers, runtime)

    def query_inner_funddividerelation_ex(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_funddividerelation_ex_async(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_funddividerelation(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_funddividerelation_ex(request, headers, runtime)

    async def pagequery_inner_funddividerelation_async(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_funddividerelation_ex_async(request, headers, runtime)

    def pagequery_inner_funddividerelation_ex(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_funddividerelation_ex_async(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_merchantagreement(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_merchantagreement_ex(request, headers, runtime)

    async def create_inner_merchantagreement_async(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_merchantagreement_ex_async(request, headers, runtime)

    def create_inner_merchantagreement_ex(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantagreementResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagreement.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_merchantagreement_ex_async(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantagreementResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagreement.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_merchantagreement(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_merchantagreement_ex(request, headers, runtime)

    async def query_inner_merchantagreement_async(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_merchantagreement_ex_async(request, headers, runtime)

    def query_inner_merchantagreement_ex(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantagreementResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_merchantagreement_ex_async(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantagreementResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_merchantagreement(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_merchantagreement_ex(request, headers, runtime)

    async def pagequery_inner_merchantagreement_async(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_merchantagreement_ex_async(request, headers, runtime)

    def pagequery_inner_merchantagreement_ex(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagreementResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagreement.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_merchantagreement_ex_async(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagreementResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagreement.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_merchantpayexpand(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_merchantpayexpand_ex(request, headers, runtime)

    async def create_inner_merchantpayexpand_async(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def create_inner_merchantpayexpand_ex(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_merchantpayexpand(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_merchantpayexpand_ex(request, headers, runtime)

    async def submit_inner_merchantpayexpand_async(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def submit_inner_merchantpayexpand_ex(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_merchantpayexpand(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_merchantpayexpand_ex(request, headers, runtime)

    async def query_inner_merchantpayexpand_async(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def query_inner_merchantpayexpand_ex(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_merchantagent(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_merchantagent_ex(request, headers, runtime)

    async def pagequery_inner_merchantagent_async(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_merchantagent_ex_async(request, headers, runtime)

    def pagequery_inner_merchantagent_ex(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagentResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagent.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_merchantagent_ex_async(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagent.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_inner_templatefileaddress(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_inner_templatefileaddress_ex(request, headers, runtime)

    async def clone_inner_templatefileaddress_async(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_inner_templatefileaddress_ex_async(request, headers, runtime)

    def clone_inner_templatefileaddress_ex(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplatefileaddressResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatefileaddress.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_inner_templatefileaddress_ex_async(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplatefileaddressResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatefileaddress.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_signfields(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_signfields_ex(request, headers, runtime)

    async def query_inner_signfields_async(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_signfields_ex_async(request, headers, runtime)

    def query_inner_signfields_ex(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSignfieldsResponse(),
            self.do_request('1.0', 'antchain.ato.inner.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_signfields_ex_async(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSignfieldsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_template(
        self,
        request: ato_models.SyncInnerTemplateRequest,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_template_ex(request, headers, runtime)

    async def sync_inner_template_async(
        self,
        request: ato_models.SyncInnerTemplateRequest,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_template_ex_async(request, headers, runtime)

    def sync_inner_template_ex(
        self,
        request: ato_models.SyncInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_template_ex_async(
        self,
        request: ato_models.SyncInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_template(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_template_ex(request, headers, runtime)

    async def update_inner_template_async(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_template_ex_async(request, headers, runtime)

    def update_inner_template_ex(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_template_ex_async(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_template(
        self,
        request: ato_models.QueryInnerTemplateRequest,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_template_ex(request, headers, runtime)

    async def query_inner_template_async(
        self,
        request: ato_models.QueryInnerTemplateRequest,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_template_ex_async(request, headers, runtime)

    def query_inner_template_ex(
        self,
        request: ato_models.QueryInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_template_ex_async(
        self,
        request: ato_models.QueryInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateelementlink(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateelementlink_ex(request, headers, runtime)

    async def query_inner_templateelementlink_async(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateelementlink_ex_async(request, headers, runtime)

    def query_inner_templateelementlink_ex(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateelementlinkResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateelementlink_ex_async(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateelementlinkResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateversion(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateversion_ex(request, headers, runtime)

    async def query_inner_templateversion_async(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateversion_ex_async(request, headers, runtime)

    def query_inner_templateversion_ex(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateversionResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateversion_ex_async(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateversionResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_ordermsg(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_ordermsg_ex(request, headers, runtime)

    async def pagequery_inner_ordermsg_async(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_ordermsg_ex_async(request, headers, runtime)

    def pagequery_inner_ordermsg_ex(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerOrdermsgResponse(),
            self.do_request('1.0', 'antchain.ato.inner.ordermsg.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_ordermsg_ex_async(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerOrdermsgResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.ordermsg.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_inner_ordermsg(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_inner_ordermsg_ex(request, headers, runtime)

    async def retry_inner_ordermsg_async(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_inner_ordermsg_ex_async(request, headers, runtime)

    def retry_inner_ordermsg_ex(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryInnerOrdermsgResponse(),
            self.do_request('1.0', 'antchain.ato.inner.ordermsg.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_inner_ordermsg_ex_async(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryInnerOrdermsgResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.ordermsg.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_authorization(
        self,
        request: ato_models.QueryInnerAuthorizationRequest,
    ) -> ato_models.QueryInnerAuthorizationResponse:
        """
        Description: 法务协议授权-  签署合同代扣前置授权查询接口
        Summary: 签署合同代扣前置授权查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_authorization_ex(request, headers, runtime)

    async def query_inner_authorization_async(
        self,
        request: ato_models.QueryInnerAuthorizationRequest,
    ) -> ato_models.QueryInnerAuthorizationResponse:
        """
        Description: 法务协议授权-  签署合同代扣前置授权查询接口
        Summary: 签署合同代扣前置授权查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_authorization_ex_async(request, headers, runtime)

    def query_inner_authorization_ex(
        self,
        request: ato_models.QueryInnerAuthorizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerAuthorizationResponse:
        """
        Description: 法务协议授权-  签署合同代扣前置授权查询接口
        Summary: 签署合同代扣前置授权查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerAuthorizationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.authorization.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_authorization_ex_async(
        self,
        request: ato_models.QueryInnerAuthorizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerAuthorizationResponse:
        """
        Description: 法务协议授权-  签署合同代扣前置授权查询接口
        Summary: 签署合同代扣前置授权查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerAuthorizationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.authorization.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_inner_authorization(
        self,
        request: ato_models.SignInnerAuthorizationRequest,
    ) -> ato_models.SignInnerAuthorizationResponse:
        """
        Description: 法务协议授权 - 签署合同代扣前置同意授权接口
        Summary: 签署合同代扣前置同意授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_inner_authorization_ex(request, headers, runtime)

    async def sign_inner_authorization_async(
        self,
        request: ato_models.SignInnerAuthorizationRequest,
    ) -> ato_models.SignInnerAuthorizationResponse:
        """
        Description: 法务协议授权 - 签署合同代扣前置同意授权接口
        Summary: 签署合同代扣前置同意授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_inner_authorization_ex_async(request, headers, runtime)

    def sign_inner_authorization_ex(
        self,
        request: ato_models.SignInnerAuthorizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SignInnerAuthorizationResponse:
        """
        Description: 法务协议授权 - 签署合同代扣前置同意授权接口
        Summary: 签署合同代扣前置同意授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SignInnerAuthorizationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.authorization.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_inner_authorization_ex_async(
        self,
        request: ato_models.SignInnerAuthorizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SignInnerAuthorizationResponse:
        """
        Description: 法务协议授权 - 签署合同代扣前置同意授权接口
        Summary: 签署合同代扣前置同意授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SignInnerAuthorizationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.authorization.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_supplemental(
        self,
        request: ato_models.QueryInnerSupplementalRequest,
    ) -> ato_models.QueryInnerSupplementalResponse:
        """
        Description: 小程序法务授权 - 商户补充协议状态查询接口
        Summary: 商户补充协议状态查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_supplemental_ex(request, headers, runtime)

    async def query_inner_supplemental_async(
        self,
        request: ato_models.QueryInnerSupplementalRequest,
    ) -> ato_models.QueryInnerSupplementalResponse:
        """
        Description: 小程序法务授权 - 商户补充协议状态查询接口
        Summary: 商户补充协议状态查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_supplemental_ex_async(request, headers, runtime)

    def query_inner_supplemental_ex(
        self,
        request: ato_models.QueryInnerSupplementalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSupplementalResponse:
        """
        Description: 小程序法务授权 - 商户补充协议状态查询接口
        Summary: 商户补充协议状态查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSupplementalResponse(),
            self.do_request('1.0', 'antchain.ato.inner.supplemental.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_supplemental_ex_async(
        self,
        request: ato_models.QueryInnerSupplementalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSupplementalResponse:
        """
        Description: 小程序法务授权 - 商户补充协议状态查询接口
        Summary: 商户补充协议状态查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSupplementalResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.supplemental.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_inner_supplemental(
        self,
        request: ato_models.SignInnerSupplementalRequest,
    ) -> ato_models.SignInnerSupplementalResponse:
        """
        Description: 法务协议授权 - 商户补充协议状态同意接口
        Summary: 商户补充协议状态同意接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_inner_supplemental_ex(request, headers, runtime)

    async def sign_inner_supplemental_async(
        self,
        request: ato_models.SignInnerSupplementalRequest,
    ) -> ato_models.SignInnerSupplementalResponse:
        """
        Description: 法务协议授权 - 商户补充协议状态同意接口
        Summary: 商户补充协议状态同意接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_inner_supplemental_ex_async(request, headers, runtime)

    def sign_inner_supplemental_ex(
        self,
        request: ato_models.SignInnerSupplementalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SignInnerSupplementalResponse:
        """
        Description: 法务协议授权 - 商户补充协议状态同意接口
        Summary: 商户补充协议状态同意接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SignInnerSupplementalResponse(),
            self.do_request('1.0', 'antchain.ato.inner.supplemental.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_inner_supplemental_ex_async(
        self,
        request: ato_models.SignInnerSupplementalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SignInnerSupplementalResponse:
        """
        Description: 法务协议授权 - 商户补充协议状态同意接口
        Summary: 商户补充协议状态同意接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SignInnerSupplementalResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.supplemental.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_withholdplan(
        self,
        request: ato_models.QueryInnerWithholdplanRequest,
    ) -> ato_models.QueryInnerWithholdplanResponse:
        """
        Description: 查询代扣计划
        Summary: 代扣计划查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_withholdplan_ex(request, headers, runtime)

    async def query_inner_withholdplan_async(
        self,
        request: ato_models.QueryInnerWithholdplanRequest,
    ) -> ato_models.QueryInnerWithholdplanResponse:
        """
        Description: 查询代扣计划
        Summary: 代扣计划查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_withholdplan_ex_async(request, headers, runtime)

    def query_inner_withholdplan_ex(
        self,
        request: ato_models.QueryInnerWithholdplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerWithholdplanResponse:
        """
        Description: 查询代扣计划
        Summary: 代扣计划查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerWithholdplanResponse(),
            self.do_request('1.0', 'antchain.ato.inner.withholdplan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_withholdplan_ex_async(
        self,
        request: ato_models.QueryInnerWithholdplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerWithholdplanResponse:
        """
        Description: 查询代扣计划
        Summary: 代扣计划查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerWithholdplanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.withholdplan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_withholdsign(
        self,
        request: ato_models.CreateInnerWithholdsignRequest,
    ) -> ato_models.CreateInnerWithholdsignResponse:
        """
        Description: 创建代扣协议
        Summary: 创建代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_withholdsign_ex(request, headers, runtime)

    async def create_inner_withholdsign_async(
        self,
        request: ato_models.CreateInnerWithholdsignRequest,
    ) -> ato_models.CreateInnerWithholdsignResponse:
        """
        Description: 创建代扣协议
        Summary: 创建代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_withholdsign_ex_async(request, headers, runtime)

    def create_inner_withholdsign_ex(
        self,
        request: ato_models.CreateInnerWithholdsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerWithholdsignResponse:
        """
        Description: 创建代扣协议
        Summary: 创建代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerWithholdsignResponse(),
            self.do_request('1.0', 'antchain.ato.inner.withholdsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_withholdsign_ex_async(
        self,
        request: ato_models.CreateInnerWithholdsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerWithholdsignResponse:
        """
        Description: 创建代扣协议
        Summary: 创建代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerWithholdsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.withholdsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_withholdsign(
        self,
        request: ato_models.QueryInnerWithholdsignRequest,
    ) -> ato_models.QueryInnerWithholdsignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_withholdsign_ex(request, headers, runtime)

    async def query_inner_withholdsign_async(
        self,
        request: ato_models.QueryInnerWithholdsignRequest,
    ) -> ato_models.QueryInnerWithholdsignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_withholdsign_ex_async(request, headers, runtime)

    def query_inner_withholdsign_ex(
        self,
        request: ato_models.QueryInnerWithholdsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerWithholdsignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerWithholdsignResponse(),
            self.do_request('1.0', 'antchain.ato.inner.withholdsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_withholdsign_ex_async(
        self,
        request: ato_models.QueryInnerWithholdsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerWithholdsignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerWithholdsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.withholdsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_merchantstaticdata(
        self,
        request: ato_models.GetInnerMerchantstaticdataRequest,
    ) -> ato_models.GetInnerMerchantstaticdataResponse:
        """
        Description: 获取商户进件静态枚举数据
        Summary: 获取商户进件静态枚举数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_merchantstaticdata_ex(request, headers, runtime)

    async def get_inner_merchantstaticdata_async(
        self,
        request: ato_models.GetInnerMerchantstaticdataRequest,
    ) -> ato_models.GetInnerMerchantstaticdataResponse:
        """
        Description: 获取商户进件静态枚举数据
        Summary: 获取商户进件静态枚举数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_merchantstaticdata_ex_async(request, headers, runtime)

    def get_inner_merchantstaticdata_ex(
        self,
        request: ato_models.GetInnerMerchantstaticdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerMerchantstaticdataResponse:
        """
        Description: 获取商户进件静态枚举数据
        Summary: 获取商户进件静态枚举数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerMerchantstaticdataResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantstaticdata.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_merchantstaticdata_ex_async(
        self,
        request: ato_models.GetInnerMerchantstaticdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerMerchantstaticdataResponse:
        """
        Description: 获取商户进件静态枚举数据
        Summary: 获取商户进件静态枚举数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerMerchantstaticdataResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantstaticdata.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_funddividemerchant(
        self,
        request: ato_models.GetInnerFunddividemerchantRequest,
    ) -> ato_models.GetInnerFunddividemerchantResponse:
        """
        Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
        Summary: 间连查询已有绑定关系分账方数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_funddividemerchant_ex(request, headers, runtime)

    async def get_inner_funddividemerchant_async(
        self,
        request: ato_models.GetInnerFunddividemerchantRequest,
    ) -> ato_models.GetInnerFunddividemerchantResponse:
        """
        Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
        Summary: 间连查询已有绑定关系分账方数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_funddividemerchant_ex_async(request, headers, runtime)

    def get_inner_funddividemerchant_ex(
        self,
        request: ato_models.GetInnerFunddividemerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerFunddividemerchantResponse:
        """
        Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
        Summary: 间连查询已有绑定关系分账方数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerFunddividemerchantResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividemerchant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_funddividemerchant_ex_async(
        self,
        request: ato_models.GetInnerFunddividemerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerFunddividemerchantResponse:
        """
        Description: 查询已有绑定关系分账方数据
        包括分账方名称，社会统一信用代码
        Summary: 间连查询已有绑定关系分账方数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerFunddividemerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividemerchant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_insuresign(
        self,
        request: ato_models.QueryInnerInsuresignRequest,
    ) -> ato_models.QueryInnerInsuresignResponse:
        """
        Description: 查询商户和保司协议签署信息
        Summary: 查询商户和保司协议签署信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_insuresign_ex(request, headers, runtime)

    async def query_inner_insuresign_async(
        self,
        request: ato_models.QueryInnerInsuresignRequest,
    ) -> ato_models.QueryInnerInsuresignResponse:
        """
        Description: 查询商户和保司协议签署信息
        Summary: 查询商户和保司协议签署信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_insuresign_ex_async(request, headers, runtime)

    def query_inner_insuresign_ex(
        self,
        request: ato_models.QueryInnerInsuresignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerInsuresignResponse:
        """
        Description: 查询商户和保司协议签署信息
        Summary: 查询商户和保司协议签署信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerInsuresignResponse(),
            self.do_request('1.0', 'antchain.ato.inner.insuresign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_insuresign_ex_async(
        self,
        request: ato_models.QueryInnerInsuresignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerInsuresignResponse:
        """
        Description: 查询商户和保司协议签署信息
        Summary: 查询商户和保司协议签署信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerInsuresignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.insuresign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_insuresign(
        self,
        request: ato_models.CreateInnerInsuresignRequest,
    ) -> ato_models.CreateInnerInsuresignResponse:
        """
        Description: 生成商户和保司签约链接
        Summary: 生成商户和保司签约链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_insuresign_ex(request, headers, runtime)

    async def create_inner_insuresign_async(
        self,
        request: ato_models.CreateInnerInsuresignRequest,
    ) -> ato_models.CreateInnerInsuresignResponse:
        """
        Description: 生成商户和保司签约链接
        Summary: 生成商户和保司签约链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_insuresign_ex_async(request, headers, runtime)

    def create_inner_insuresign_ex(
        self,
        request: ato_models.CreateInnerInsuresignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerInsuresignResponse:
        """
        Description: 生成商户和保司签约链接
        Summary: 生成商户和保司签约链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerInsuresignResponse(),
            self.do_request('1.0', 'antchain.ato.inner.insuresign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_insuresign_ex_async(
        self,
        request: ato_models.CreateInnerInsuresignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerInsuresignResponse:
        """
        Description: 生成商户和保司签约链接
        Summary: 生成商户和保司签约链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerInsuresignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.insuresign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_insureorder(
        self,
        request: ato_models.PagequeryInnerInsureorderRequest,
    ) -> ato_models.PagequeryInnerInsureorderResponse:
        """
        Description: 查询保单信息
        Summary: 查询保单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_insureorder_ex(request, headers, runtime)

    async def pagequery_inner_insureorder_async(
        self,
        request: ato_models.PagequeryInnerInsureorderRequest,
    ) -> ato_models.PagequeryInnerInsureorderResponse:
        """
        Description: 查询保单信息
        Summary: 查询保单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_insureorder_ex_async(request, headers, runtime)

    def pagequery_inner_insureorder_ex(
        self,
        request: ato_models.PagequeryInnerInsureorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerInsureorderResponse:
        """
        Description: 查询保单信息
        Summary: 查询保单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerInsureorderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.insureorder.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_insureorder_ex_async(
        self,
        request: ato_models.PagequeryInnerInsureorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerInsureorderResponse:
        """
        Description: 查询保单信息
        Summary: 查询保单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerInsureorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.insureorder.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_product(
        self,
        request: ato_models.PagequeryInnerProductRequest,
    ) -> ato_models.PagequeryInnerProductResponse:
        """
        Description: 商户控制台商品列表
        Summary: 商品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_product_ex(request, headers, runtime)

    async def pagequery_inner_product_async(
        self,
        request: ato_models.PagequeryInnerProductRequest,
    ) -> ato_models.PagequeryInnerProductResponse:
        """
        Description: 商户控制台商品列表
        Summary: 商品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_product_ex_async(request, headers, runtime)

    def pagequery_inner_product_ex(
        self,
        request: ato_models.PagequeryInnerProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerProductResponse:
        """
        Description: 商户控制台商品列表
        Summary: 商品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerProductResponse(),
            self.do_request('1.0', 'antchain.ato.inner.product.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_product_ex_async(
        self,
        request: ato_models.PagequeryInnerProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerProductResponse:
        """
        Description: 商户控制台商品列表
        Summary: 商品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerProductResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.product.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_homepagenotice(
        self,
        request: ato_models.GetInnerHomepagenoticeRequest,
    ) -> ato_models.GetInnerHomepagenoticeResponse:
        """
        Description: 商户控制台首页通知栏
        Summary: 首页通知栏
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_homepagenotice_ex(request, headers, runtime)

    async def get_inner_homepagenotice_async(
        self,
        request: ato_models.GetInnerHomepagenoticeRequest,
    ) -> ato_models.GetInnerHomepagenoticeResponse:
        """
        Description: 商户控制台首页通知栏
        Summary: 首页通知栏
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_homepagenotice_ex_async(request, headers, runtime)

    def get_inner_homepagenotice_ex(
        self,
        request: ato_models.GetInnerHomepagenoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerHomepagenoticeResponse:
        """
        Description: 商户控制台首页通知栏
        Summary: 首页通知栏
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerHomepagenoticeResponse(),
            self.do_request('1.0', 'antchain.ato.inner.homepagenotice.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_homepagenotice_ex_async(
        self,
        request: ato_models.GetInnerHomepagenoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerHomepagenoticeResponse:
        """
        Description: 商户控制台首页通知栏
        Summary: 首页通知栏
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerHomepagenoticeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.homepagenotice.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_notice(
        self,
        request: ato_models.PagequeryInnerNoticeRequest,
    ) -> ato_models.PagequeryInnerNoticeResponse:
        """
        Description: 商户控制台通知列表
        Summary: 通知列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_notice_ex(request, headers, runtime)

    async def pagequery_inner_notice_async(
        self,
        request: ato_models.PagequeryInnerNoticeRequest,
    ) -> ato_models.PagequeryInnerNoticeResponse:
        """
        Description: 商户控制台通知列表
        Summary: 通知列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_notice_ex_async(request, headers, runtime)

    def pagequery_inner_notice_ex(
        self,
        request: ato_models.PagequeryInnerNoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerNoticeResponse:
        """
        Description: 商户控制台通知列表
        Summary: 通知列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerNoticeResponse(),
            self.do_request('1.0', 'antchain.ato.inner.notice.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_notice_ex_async(
        self,
        request: ato_models.PagequeryInnerNoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerNoticeResponse:
        """
        Description: 商户控制台通知列表
        Summary: 通知列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerNoticeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.notice.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_notice(
        self,
        request: ato_models.DetailInnerNoticeRequest,
    ) -> ato_models.DetailInnerNoticeResponse:
        """
        Description: 商户控制台通知详情
        Summary: 通知详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_notice_ex(request, headers, runtime)

    async def detail_inner_notice_async(
        self,
        request: ato_models.DetailInnerNoticeRequest,
    ) -> ato_models.DetailInnerNoticeResponse:
        """
        Description: 商户控制台通知详情
        Summary: 通知详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_notice_ex_async(request, headers, runtime)

    def detail_inner_notice_ex(
        self,
        request: ato_models.DetailInnerNoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerNoticeResponse:
        """
        Description: 商户控制台通知详情
        Summary: 通知详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerNoticeResponse(),
            self.do_request('1.0', 'antchain.ato.inner.notice.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_notice_ex_async(
        self,
        request: ato_models.DetailInnerNoticeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerNoticeResponse:
        """
        Description: 商户控制台通知详情
        Summary: 通知详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerNoticeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.notice.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_order(
        self,
        request: ato_models.PagequeryInnerOrderRequest,
    ) -> ato_models.PagequeryInnerOrderResponse:
        """
        Description: 商户控制台订单列表
        Summary: 订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_order_ex(request, headers, runtime)

    async def pagequery_inner_order_async(
        self,
        request: ato_models.PagequeryInnerOrderRequest,
    ) -> ato_models.PagequeryInnerOrderResponse:
        """
        Description: 商户控制台订单列表
        Summary: 订单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_order_ex_async(request, headers, runtime)

    def pagequery_inner_order_ex(
        self,
        request: ato_models.PagequeryInnerOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerOrderResponse:
        """
        Description: 商户控制台订单列表
        Summary: 订单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerOrderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.order.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_order_ex_async(
        self,
        request: ato_models.PagequeryInnerOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerOrderResponse:
        """
        Description: 商户控制台订单列表
        Summary: 订单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerOrderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.order.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_order(
        self,
        request: ato_models.DetailInnerOrderRequest,
    ) -> ato_models.DetailInnerOrderResponse:
        """
        Description: 订单详情
        Summary: 订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_order_ex(request, headers, runtime)

    async def detail_inner_order_async(
        self,
        request: ato_models.DetailInnerOrderRequest,
    ) -> ato_models.DetailInnerOrderResponse:
        """
        Description: 订单详情
        Summary: 订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_order_ex_async(request, headers, runtime)

    def detail_inner_order_ex(
        self,
        request: ato_models.DetailInnerOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerOrderResponse:
        """
        Description: 订单详情
        Summary: 订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerOrderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.order.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_order_ex_async(
        self,
        request: ato_models.DetailInnerOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerOrderResponse:
        """
        Description: 订单详情
        Summary: 订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerOrderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.order.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def render_inner_templateinstance(
        self,
        request: ato_models.RenderInnerTemplateinstanceRequest,
    ) -> ato_models.RenderInnerTemplateinstanceResponse:
        """
        Description: 合同模板实例化渲染，文本域赋值
        Summary: 合同模板实例化渲染
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.render_inner_templateinstance_ex(request, headers, runtime)

    async def render_inner_templateinstance_async(
        self,
        request: ato_models.RenderInnerTemplateinstanceRequest,
    ) -> ato_models.RenderInnerTemplateinstanceResponse:
        """
        Description: 合同模板实例化渲染，文本域赋值
        Summary: 合同模板实例化渲染
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.render_inner_templateinstance_ex_async(request, headers, runtime)

    def render_inner_templateinstance_ex(
        self,
        request: ato_models.RenderInnerTemplateinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RenderInnerTemplateinstanceResponse:
        """
        Description: 合同模板实例化渲染，文本域赋值
        Summary: 合同模板实例化渲染
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RenderInnerTemplateinstanceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateinstance.render', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def render_inner_templateinstance_ex_async(
        self,
        request: ato_models.RenderInnerTemplateinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RenderInnerTemplateinstanceResponse:
        """
        Description: 合同模板实例化渲染，文本域赋值
        Summary: 合同模板实例化渲染
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RenderInnerTemplateinstanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateinstance.render', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_inner_marketingscore(
        self,
        request: ato_models.BatchqueryInnerMarketingscoreRequest,
    ) -> ato_models.BatchqueryInnerMarketingscoreResponse:
        """
        Description: 批量查询营销分
        Summary: 批量查询营销分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_inner_marketingscore_ex(request, headers, runtime)

    async def batchquery_inner_marketingscore_async(
        self,
        request: ato_models.BatchqueryInnerMarketingscoreRequest,
    ) -> ato_models.BatchqueryInnerMarketingscoreResponse:
        """
        Description: 批量查询营销分
        Summary: 批量查询营销分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_inner_marketingscore_ex_async(request, headers, runtime)

    def batchquery_inner_marketingscore_ex(
        self,
        request: ato_models.BatchqueryInnerMarketingscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchqueryInnerMarketingscoreResponse:
        """
        Description: 批量查询营销分
        Summary: 批量查询营销分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchqueryInnerMarketingscoreResponse(),
            self.do_request('1.0', 'antchain.ato.inner.marketingscore.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_inner_marketingscore_ex_async(
        self,
        request: ato_models.BatchqueryInnerMarketingscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchqueryInnerMarketingscoreResponse:
        """
        Description: 批量查询营销分
        Summary: 批量查询营销分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchqueryInnerMarketingscoreResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.marketingscore.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_customerservice(
        self,
        request: ato_models.CreateInnerCustomerserviceRequest,
    ) -> ato_models.CreateInnerCustomerserviceResponse:
        """
        Description: 创建客服信息
        Summary: 创建客服信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_customerservice_ex(request, headers, runtime)

    async def create_inner_customerservice_async(
        self,
        request: ato_models.CreateInnerCustomerserviceRequest,
    ) -> ato_models.CreateInnerCustomerserviceResponse:
        """
        Description: 创建客服信息
        Summary: 创建客服信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_customerservice_ex_async(request, headers, runtime)

    def create_inner_customerservice_ex(
        self,
        request: ato_models.CreateInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerCustomerserviceResponse:
        """
        Description: 创建客服信息
        Summary: 创建客服信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerCustomerserviceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.customerservice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_customerservice_ex_async(
        self,
        request: ato_models.CreateInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerCustomerserviceResponse:
        """
        Description: 创建客服信息
        Summary: 创建客服信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerCustomerserviceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.customerservice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_customerservice(
        self,
        request: ato_models.UpdateInnerCustomerserviceRequest,
    ) -> ato_models.UpdateInnerCustomerserviceResponse:
        """
        Description: 更新客服信息
        Summary: 更新客服信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_customerservice_ex(request, headers, runtime)

    async def update_inner_customerservice_async(
        self,
        request: ato_models.UpdateInnerCustomerserviceRequest,
    ) -> ato_models.UpdateInnerCustomerserviceResponse:
        """
        Description: 更新客服信息
        Summary: 更新客服信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_customerservice_ex_async(request, headers, runtime)

    def update_inner_customerservice_ex(
        self,
        request: ato_models.UpdateInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerCustomerserviceResponse:
        """
        Description: 更新客服信息
        Summary: 更新客服信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerCustomerserviceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.customerservice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_customerservice_ex_async(
        self,
        request: ato_models.UpdateInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerCustomerserviceResponse:
        """
        Description: 更新客服信息
        Summary: 更新客服信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerCustomerserviceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.customerservice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_customerservice(
        self,
        request: ato_models.PagequeryInnerCustomerserviceRequest,
    ) -> ato_models.PagequeryInnerCustomerserviceResponse:
        """
        Description: 分页查询客服信息
        Summary:  分页查询客服信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_customerservice_ex(request, headers, runtime)

    async def pagequery_inner_customerservice_async(
        self,
        request: ato_models.PagequeryInnerCustomerserviceRequest,
    ) -> ato_models.PagequeryInnerCustomerserviceResponse:
        """
        Description: 分页查询客服信息
        Summary:  分页查询客服信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_customerservice_ex_async(request, headers, runtime)

    def pagequery_inner_customerservice_ex(
        self,
        request: ato_models.PagequeryInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerCustomerserviceResponse:
        """
        Description: 分页查询客服信息
        Summary:  分页查询客服信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerCustomerserviceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.customerservice.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_customerservice_ex_async(
        self,
        request: ato_models.PagequeryInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerCustomerserviceResponse:
        """
        Description: 分页查询客服信息
        Summary:  分页查询客服信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerCustomerserviceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.customerservice.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_customerservice(
        self,
        request: ato_models.DetailInnerCustomerserviceRequest,
    ) -> ato_models.DetailInnerCustomerserviceResponse:
        """
        Description: 获取客服信息详情
        Summary: 获取客服信息详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_customerservice_ex(request, headers, runtime)

    async def detail_inner_customerservice_async(
        self,
        request: ato_models.DetailInnerCustomerserviceRequest,
    ) -> ato_models.DetailInnerCustomerserviceResponse:
        """
        Description: 获取客服信息详情
        Summary: 获取客服信息详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_customerservice_ex_async(request, headers, runtime)

    def detail_inner_customerservice_ex(
        self,
        request: ato_models.DetailInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerCustomerserviceResponse:
        """
        Description: 获取客服信息详情
        Summary: 获取客服信息详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerCustomerserviceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.customerservice.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_customerservice_ex_async(
        self,
        request: ato_models.DetailInnerCustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerCustomerserviceResponse:
        """
        Description: 获取客服信息详情
        Summary: 获取客服信息详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerCustomerserviceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.customerservice.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_customerservicetemplate(
        self,
        request: ato_models.GetInnerCustomerservicetemplateRequest,
    ) -> ato_models.GetInnerCustomerservicetemplateResponse:
        """
        Description: 获取代理商客服信息模版
        Summary: 获取代理商客服信息模版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_customerservicetemplate_ex(request, headers, runtime)

    async def get_inner_customerservicetemplate_async(
        self,
        request: ato_models.GetInnerCustomerservicetemplateRequest,
    ) -> ato_models.GetInnerCustomerservicetemplateResponse:
        """
        Description: 获取代理商客服信息模版
        Summary: 获取代理商客服信息模版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_customerservicetemplate_ex_async(request, headers, runtime)

    def get_inner_customerservicetemplate_ex(
        self,
        request: ato_models.GetInnerCustomerservicetemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerCustomerservicetemplateResponse:
        """
        Description: 获取代理商客服信息模版
        Summary: 获取代理商客服信息模版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerCustomerservicetemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.customerservicetemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_customerservicetemplate_ex_async(
        self,
        request: ato_models.GetInnerCustomerservicetemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerCustomerservicetemplateResponse:
        """
        Description: 获取代理商客服信息模版
        Summary: 获取代理商客服信息模版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerCustomerservicetemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.customerservicetemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateinstance(
        self,
        request: ato_models.QueryInnerTemplateinstanceRequest,
    ) -> ato_models.QueryInnerTemplateinstanceResponse:
        """
        Description: 获取模板实例化后的模板信息，包括pdf下载链接
        Summary: 获取模板实例化后的模板信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateinstance_ex(request, headers, runtime)

    async def query_inner_templateinstance_async(
        self,
        request: ato_models.QueryInnerTemplateinstanceRequest,
    ) -> ato_models.QueryInnerTemplateinstanceResponse:
        """
        Description: 获取模板实例化后的模板信息，包括pdf下载链接
        Summary: 获取模板实例化后的模板信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateinstance_ex_async(request, headers, runtime)

    def query_inner_templateinstance_ex(
        self,
        request: ato_models.QueryInnerTemplateinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateinstanceResponse:
        """
        Description: 获取模板实例化后的模板信息，包括pdf下载链接
        Summary: 获取模板实例化后的模板信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateinstanceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateinstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateinstance_ex_async(
        self,
        request: ato_models.QueryInnerTemplateinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateinstanceResponse:
        """
        Description: 获取模板实例化后的模板信息，包括pdf下载链接
        Summary: 获取模板实例化后的模板信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateinstanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateinstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_tenantindirectmainclass(
        self,
        request: ato_models.QueryInnerTenantindirectmainclassRequest,
    ) -> ato_models.QueryInnerTenantindirectmainclassResponse:
        """
        Description: 查询租户类目信息详情
        Summary: 查询租户类目信息详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_tenantindirectmainclass_ex(request, headers, runtime)

    async def query_inner_tenantindirectmainclass_async(
        self,
        request: ato_models.QueryInnerTenantindirectmainclassRequest,
    ) -> ato_models.QueryInnerTenantindirectmainclassResponse:
        """
        Description: 查询租户类目信息详情
        Summary: 查询租户类目信息详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_tenantindirectmainclass_ex_async(request, headers, runtime)

    def query_inner_tenantindirectmainclass_ex(
        self,
        request: ato_models.QueryInnerTenantindirectmainclassRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTenantindirectmainclassResponse:
        """
        Description: 查询租户类目信息详情
        Summary: 查询租户类目信息详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTenantindirectmainclassResponse(),
            self.do_request('1.0', 'antchain.ato.inner.tenantindirectmainclass.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_tenantindirectmainclass_ex_async(
        self,
        request: ato_models.QueryInnerTenantindirectmainclassRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTenantindirectmainclassResponse:
        """
        Description: 查询租户类目信息详情
        Summary: 查询租户类目信息详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTenantindirectmainclassResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.tenantindirectmainclass.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_tenantindirectmainclass(
        self,
        request: ato_models.UpdateInnerTenantindirectmainclassRequest,
    ) -> ato_models.UpdateInnerTenantindirectmainclassResponse:
        """
        Description: 修改租户间联类目类目信息
        Summary: 修改租户间联类目类目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_tenantindirectmainclass_ex(request, headers, runtime)

    async def update_inner_tenantindirectmainclass_async(
        self,
        request: ato_models.UpdateInnerTenantindirectmainclassRequest,
    ) -> ato_models.UpdateInnerTenantindirectmainclassResponse:
        """
        Description: 修改租户间联类目类目信息
        Summary: 修改租户间联类目类目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_tenantindirectmainclass_ex_async(request, headers, runtime)

    def update_inner_tenantindirectmainclass_ex(
        self,
        request: ato_models.UpdateInnerTenantindirectmainclassRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerTenantindirectmainclassResponse:
        """
        Description: 修改租户间联类目类目信息
        Summary: 修改租户间联类目类目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerTenantindirectmainclassResponse(),
            self.do_request('1.0', 'antchain.ato.inner.tenantindirectmainclass.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_tenantindirectmainclass_ex_async(
        self,
        request: ato_models.UpdateInnerTenantindirectmainclassRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerTenantindirectmainclassResponse:
        """
        Description: 修改租户间联类目类目信息
        Summary: 修改租户间联类目类目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerTenantindirectmainclassResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.tenantindirectmainclass.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_templatesyncreview(
        self,
        request: ato_models.SubmitInnerTemplatesyncreviewRequest,
    ) -> ato_models.SubmitInnerTemplatesyncreviewResponse:
        """
        Description: 模板同步上线时强管控字段校验未通过提交后台审核
        Summary: 模板同步上线审核提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_templatesyncreview_ex(request, headers, runtime)

    async def submit_inner_templatesyncreview_async(
        self,
        request: ato_models.SubmitInnerTemplatesyncreviewRequest,
    ) -> ato_models.SubmitInnerTemplatesyncreviewResponse:
        """
        Description: 模板同步上线时强管控字段校验未通过提交后台审核
        Summary: 模板同步上线审核提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_templatesyncreview_ex_async(request, headers, runtime)

    def submit_inner_templatesyncreview_ex(
        self,
        request: ato_models.SubmitInnerTemplatesyncreviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerTemplatesyncreviewResponse:
        """
        Description: 模板同步上线时强管控字段校验未通过提交后台审核
        Summary: 模板同步上线审核提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerTemplatesyncreviewResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatesyncreview.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_templatesyncreview_ex_async(
        self,
        request: ato_models.SubmitInnerTemplatesyncreviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerTemplatesyncreviewResponse:
        """
        Description: 模板同步上线时强管控字段校验未通过提交后台审核
        Summary: 模板同步上线审核提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerTemplatesyncreviewResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatesyncreview.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_pendingevent(
        self,
        request: ato_models.SubmitInnerPendingeventRequest,
    ) -> ato_models.SubmitInnerPendingeventResponse:
        """
        Description: 待办事件处理
        Summary: 待办事件处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_pendingevent_ex(request, headers, runtime)

    async def submit_inner_pendingevent_async(
        self,
        request: ato_models.SubmitInnerPendingeventRequest,
    ) -> ato_models.SubmitInnerPendingeventResponse:
        """
        Description: 待办事件处理
        Summary: 待办事件处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_pendingevent_ex_async(request, headers, runtime)

    def submit_inner_pendingevent_ex(
        self,
        request: ato_models.SubmitInnerPendingeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerPendingeventResponse:
        """
        Description: 待办事件处理
        Summary: 待办事件处理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerPendingeventResponse(),
            self.do_request('1.0', 'antchain.ato.inner.pendingevent.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_pendingevent_ex_async(
        self,
        request: ato_models.SubmitInnerPendingeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerPendingeventResponse:
        """
        Description: 待办事件处理
        Summary: 待办事件处理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerPendingeventResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.pendingevent.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_pendingevent(
        self,
        request: ato_models.DetailInnerPendingeventRequest,
    ) -> ato_models.DetailInnerPendingeventResponse:
        """
        Description: 待办事件详情查询
        Summary: 待办事件详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_pendingevent_ex(request, headers, runtime)

    async def detail_inner_pendingevent_async(
        self,
        request: ato_models.DetailInnerPendingeventRequest,
    ) -> ato_models.DetailInnerPendingeventResponse:
        """
        Description: 待办事件详情查询
        Summary: 待办事件详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_pendingevent_ex_async(request, headers, runtime)

    def detail_inner_pendingevent_ex(
        self,
        request: ato_models.DetailInnerPendingeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerPendingeventResponse:
        """
        Description: 待办事件详情查询
        Summary: 待办事件详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerPendingeventResponse(),
            self.do_request('1.0', 'antchain.ato.inner.pendingevent.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_pendingevent_ex_async(
        self,
        request: ato_models.DetailInnerPendingeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerPendingeventResponse:
        """
        Description: 待办事件详情查询
        Summary: 待办事件详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerPendingeventResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.pendingevent.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_inner_template(
        self,
        request: ato_models.AddInnerTemplateRequest,
    ) -> ato_models.AddInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_inner_template_ex(request, headers, runtime)

    async def add_inner_template_async(
        self,
        request: ato_models.AddInnerTemplateRequest,
    ) -> ato_models.AddInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_inner_template_ex_async(request, headers, runtime)

    def add_inner_template_ex(
        self,
        request: ato_models.AddInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_inner_template_ex_async(
        self,
        request: ato_models.AddInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddInnerTemplateResponse:
        """
        Description: 合同模板制作根据已有模板新增合同模板文件
        Summary: 根据已有模板新增合同模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_pendingevent(
        self,
        request: ato_models.PagequeryInnerPendingeventRequest,
    ) -> ato_models.PagequeryInnerPendingeventResponse:
        """
        Description: 查询待办列表
        Summary: 查询待办列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_pendingevent_ex(request, headers, runtime)

    async def pagequery_inner_pendingevent_async(
        self,
        request: ato_models.PagequeryInnerPendingeventRequest,
    ) -> ato_models.PagequeryInnerPendingeventResponse:
        """
        Description: 查询待办列表
        Summary: 查询待办列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_pendingevent_ex_async(request, headers, runtime)

    def pagequery_inner_pendingevent_ex(
        self,
        request: ato_models.PagequeryInnerPendingeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerPendingeventResponse:
        """
        Description: 查询待办列表
        Summary: 查询待办列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerPendingeventResponse(),
            self.do_request('1.0', 'antchain.ato.inner.pendingevent.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_pendingevent_ex_async(
        self,
        request: ato_models.PagequeryInnerPendingeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerPendingeventResponse:
        """
        Description: 查询待办列表
        Summary: 查询待办列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerPendingeventResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.pendingevent.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_merchantpayexpand(
        self,
        request: ato_models.UpdateInnerMerchantpayexpandRequest,
    ) -> ato_models.UpdateInnerMerchantpayexpandResponse:
        """
        Description: 修改进件信息
        Summary: 修改进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_merchantpayexpand_ex(request, headers, runtime)

    async def update_inner_merchantpayexpand_async(
        self,
        request: ato_models.UpdateInnerMerchantpayexpandRequest,
    ) -> ato_models.UpdateInnerMerchantpayexpandResponse:
        """
        Description: 修改进件信息
        Summary: 修改进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def update_inner_merchantpayexpand_ex(
        self,
        request: ato_models.UpdateInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerMerchantpayexpandResponse:
        """
        Description: 修改进件信息
        Summary: 修改进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.UpdateInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerMerchantpayexpandResponse:
        """
        Description: 修改进件信息
        Summary: 修改进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_tenantaccountinfo(
        self,
        request: ato_models.QueryInnerTenantaccountinfoRequest,
    ) -> ato_models.QueryInnerTenantaccountinfoResponse:
        """
        Description: 查询租户账号信息
        Summary: 查询租户账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_tenantaccountinfo_ex(request, headers, runtime)

    async def query_inner_tenantaccountinfo_async(
        self,
        request: ato_models.QueryInnerTenantaccountinfoRequest,
    ) -> ato_models.QueryInnerTenantaccountinfoResponse:
        """
        Description: 查询租户账号信息
        Summary: 查询租户账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_tenantaccountinfo_ex_async(request, headers, runtime)

    def query_inner_tenantaccountinfo_ex(
        self,
        request: ato_models.QueryInnerTenantaccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTenantaccountinfoResponse:
        """
        Description: 查询租户账号信息
        Summary: 查询租户账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTenantaccountinfoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.tenantaccountinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_tenantaccountinfo_ex_async(
        self,
        request: ato_models.QueryInnerTenantaccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTenantaccountinfoResponse:
        """
        Description: 查询租户账号信息
        Summary: 查询租户账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTenantaccountinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.tenantaccountinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_tenantaccountinfo(
        self,
        request: ato_models.CreateInnerTenantaccountinfoRequest,
    ) -> ato_models.CreateInnerTenantaccountinfoResponse:
        """
        Description: 创建租户账号信息
        Summary: 创建租户账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_tenantaccountinfo_ex(request, headers, runtime)

    async def create_inner_tenantaccountinfo_async(
        self,
        request: ato_models.CreateInnerTenantaccountinfoRequest,
    ) -> ato_models.CreateInnerTenantaccountinfoResponse:
        """
        Description: 创建租户账号信息
        Summary: 创建租户账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_tenantaccountinfo_ex_async(request, headers, runtime)

    def create_inner_tenantaccountinfo_ex(
        self,
        request: ato_models.CreateInnerTenantaccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTenantaccountinfoResponse:
        """
        Description: 创建租户账号信息
        Summary: 创建租户账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTenantaccountinfoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.tenantaccountinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_tenantaccountinfo_ex_async(
        self,
        request: ato_models.CreateInnerTenantaccountinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTenantaccountinfoResponse:
        """
        Description: 创建租户账号信息
        Summary: 创建租户账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTenantaccountinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.tenantaccountinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_agentcustomerservice(
        self,
        request: ato_models.GetInnerAgentcustomerserviceRequest,
    ) -> ato_models.GetInnerAgentcustomerserviceResponse:
        """
        Description: 查询代理商客服人员信息
        Summary: 查询代理商客服人员信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_agentcustomerservice_ex(request, headers, runtime)

    async def get_inner_agentcustomerservice_async(
        self,
        request: ato_models.GetInnerAgentcustomerserviceRequest,
    ) -> ato_models.GetInnerAgentcustomerserviceResponse:
        """
        Description: 查询代理商客服人员信息
        Summary: 查询代理商客服人员信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_agentcustomerservice_ex_async(request, headers, runtime)

    def get_inner_agentcustomerservice_ex(
        self,
        request: ato_models.GetInnerAgentcustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerAgentcustomerserviceResponse:
        """
        Description: 查询代理商客服人员信息
        Summary: 查询代理商客服人员信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerAgentcustomerserviceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agentcustomerservice.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_agentcustomerservice_ex_async(
        self,
        request: ato_models.GetInnerAgentcustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerAgentcustomerserviceResponse:
        """
        Description: 查询代理商客服人员信息
        Summary: 查询代理商客服人员信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerAgentcustomerserviceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agentcustomerservice.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_inner_agentcustomerservice(
        self,
        request: ato_models.SaveInnerAgentcustomerserviceRequest,
    ) -> ato_models.SaveInnerAgentcustomerserviceResponse:
        """
        Description: 保存代理商客服人员信息
        Summary: 保存代理商客服人员信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_inner_agentcustomerservice_ex(request, headers, runtime)

    async def save_inner_agentcustomerservice_async(
        self,
        request: ato_models.SaveInnerAgentcustomerserviceRequest,
    ) -> ato_models.SaveInnerAgentcustomerserviceResponse:
        """
        Description: 保存代理商客服人员信息
        Summary: 保存代理商客服人员信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_inner_agentcustomerservice_ex_async(request, headers, runtime)

    def save_inner_agentcustomerservice_ex(
        self,
        request: ato_models.SaveInnerAgentcustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerAgentcustomerserviceResponse:
        """
        Description: 保存代理商客服人员信息
        Summary: 保存代理商客服人员信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerAgentcustomerserviceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agentcustomerservice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_inner_agentcustomerservice_ex_async(
        self,
        request: ato_models.SaveInnerAgentcustomerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerAgentcustomerserviceResponse:
        """
        Description: 保存代理商客服人员信息
        Summary: 保存代理商客服人员信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerAgentcustomerserviceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agentcustomerservice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_logger(
        self,
        request: ato_models.QueryInnerLoggerRequest,
    ) -> ato_models.QueryInnerLoggerResponse:
        """
        Description: 查询sls日志
        Summary: 查询sls日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_logger_ex(request, headers, runtime)

    async def query_inner_logger_async(
        self,
        request: ato_models.QueryInnerLoggerRequest,
    ) -> ato_models.QueryInnerLoggerResponse:
        """
        Description: 查询sls日志
        Summary: 查询sls日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_logger_ex_async(request, headers, runtime)

    def query_inner_logger_ex(
        self,
        request: ato_models.QueryInnerLoggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerLoggerResponse:
        """
        Description: 查询sls日志
        Summary: 查询sls日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerLoggerResponse(),
            self.do_request('1.0', 'antchain.ato.inner.logger.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_logger_ex_async(
        self,
        request: ato_models.QueryInnerLoggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerLoggerResponse:
        """
        Description: 查询sls日志
        Summary: 查询sls日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerLoggerResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.logger.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_datadownload(
        self,
        request: ato_models.SubmitInnerDatadownloadRequest,
    ) -> ato_models.SubmitInnerDatadownloadResponse:
        """
        Description: 离线数据下载
        Summary: 离线数据下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_datadownload_ex(request, headers, runtime)

    async def submit_inner_datadownload_async(
        self,
        request: ato_models.SubmitInnerDatadownloadRequest,
    ) -> ato_models.SubmitInnerDatadownloadResponse:
        """
        Description: 离线数据下载
        Summary: 离线数据下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_datadownload_ex_async(request, headers, runtime)

    def submit_inner_datadownload_ex(
        self,
        request: ato_models.SubmitInnerDatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerDatadownloadResponse:
        """
        Description: 离线数据下载
        Summary: 离线数据下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerDatadownloadResponse(),
            self.do_request('1.0', 'antchain.ato.inner.datadownload.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_datadownload_ex_async(
        self,
        request: ato_models.SubmitInnerDatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerDatadownloadResponse:
        """
        Description: 离线数据下载
        Summary: 离线数据下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerDatadownloadResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.datadownload.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_datadownload(
        self,
        request: ato_models.PagequeryInnerDatadownloadRequest,
    ) -> ato_models.PagequeryInnerDatadownloadResponse:
        """
        Description: 查询数据下载列表
        Summary: 查询数据下载列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_datadownload_ex(request, headers, runtime)

    async def pagequery_inner_datadownload_async(
        self,
        request: ato_models.PagequeryInnerDatadownloadRequest,
    ) -> ato_models.PagequeryInnerDatadownloadResponse:
        """
        Description: 查询数据下载列表
        Summary: 查询数据下载列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_datadownload_ex_async(request, headers, runtime)

    def pagequery_inner_datadownload_ex(
        self,
        request: ato_models.PagequeryInnerDatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerDatadownloadResponse:
        """
        Description: 查询数据下载列表
        Summary: 查询数据下载列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerDatadownloadResponse(),
            self.do_request('1.0', 'antchain.ato.inner.datadownload.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_datadownload_ex_async(
        self,
        request: ato_models.PagequeryInnerDatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerDatadownloadResponse:
        """
        Description: 查询数据下载列表
        Summary: 查询数据下载列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerDatadownloadResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.datadownload.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_inner_datadownload(
        self,
        request: ato_models.DeleteInnerDatadownloadRequest,
    ) -> ato_models.DeleteInnerDatadownloadResponse:
        """
        Description: 删除下载任务
        Summary: 删除下载任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_inner_datadownload_ex(request, headers, runtime)

    async def delete_inner_datadownload_async(
        self,
        request: ato_models.DeleteInnerDatadownloadRequest,
    ) -> ato_models.DeleteInnerDatadownloadResponse:
        """
        Description: 删除下载任务
        Summary: 删除下载任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_inner_datadownload_ex_async(request, headers, runtime)

    def delete_inner_datadownload_ex(
        self,
        request: ato_models.DeleteInnerDatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerDatadownloadResponse:
        """
        Description: 删除下载任务
        Summary: 删除下载任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerDatadownloadResponse(),
            self.do_request('1.0', 'antchain.ato.inner.datadownload.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_inner_datadownload_ex_async(
        self,
        request: ato_models.DeleteInnerDatadownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerDatadownloadResponse:
        """
        Description: 删除下载任务
        Summary: 删除下载任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerDatadownloadResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.datadownload.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_companyinfo(
        self,
        request: ato_models.PagequeryInnerCompanyinfoRequest,
    ) -> ato_models.PagequeryInnerCompanyinfoResponse:
        """
        Description: 分页查询公司信息
        Summary: 分页查询公司信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_companyinfo_ex(request, headers, runtime)

    async def pagequery_inner_companyinfo_async(
        self,
        request: ato_models.PagequeryInnerCompanyinfoRequest,
    ) -> ato_models.PagequeryInnerCompanyinfoResponse:
        """
        Description: 分页查询公司信息
        Summary: 分页查询公司信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_companyinfo_ex_async(request, headers, runtime)

    def pagequery_inner_companyinfo_ex(
        self,
        request: ato_models.PagequeryInnerCompanyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerCompanyinfoResponse:
        """
        Description: 分页查询公司信息
        Summary: 分页查询公司信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerCompanyinfoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.companyinfo.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_companyinfo_ex_async(
        self,
        request: ato_models.PagequeryInnerCompanyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerCompanyinfoResponse:
        """
        Description: 分页查询公司信息
        Summary: 分页查询公司信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerCompanyinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.companyinfo.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_expandprocess(
        self,
        request: ato_models.QueryInnerExpandprocessRequest,
    ) -> ato_models.QueryInnerExpandprocessResponse:
        """
        Description: 查询商户进件流程节点
        Summary: 查询商户进件流程节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_expandprocess_ex(request, headers, runtime)

    async def query_inner_expandprocess_async(
        self,
        request: ato_models.QueryInnerExpandprocessRequest,
    ) -> ato_models.QueryInnerExpandprocessResponse:
        """
        Description: 查询商户进件流程节点
        Summary: 查询商户进件流程节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_expandprocess_ex_async(request, headers, runtime)

    def query_inner_expandprocess_ex(
        self,
        request: ato_models.QueryInnerExpandprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerExpandprocessResponse:
        """
        Description: 查询商户进件流程节点
        Summary: 查询商户进件流程节点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerExpandprocessResponse(),
            self.do_request('1.0', 'antchain.ato.inner.expandprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_expandprocess_ex_async(
        self,
        request: ato_models.QueryInnerExpandprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerExpandprocessResponse:
        """
        Description: 查询商户进件流程节点
        Summary: 查询商户进件流程节点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerExpandprocessResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.expandprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_knowledge_baseinfo(
        self,
        request: ato_models.QueryKnowledgeBaseinfoRequest,
    ) -> ato_models.QueryKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_knowledge_baseinfo_ex(request, headers, runtime)

    async def query_knowledge_baseinfo_async(
        self,
        request: ato_models.QueryKnowledgeBaseinfoRequest,
    ) -> ato_models.QueryKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_knowledge_baseinfo_ex_async(request, headers, runtime)

    def query_knowledge_baseinfo_ex(
        self,
        request: ato_models.QueryKnowledgeBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryKnowledgeBaseinfoResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.baseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_knowledge_baseinfo_ex_async(
        self,
        request: ato_models.QueryKnowledgeBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryKnowledgeBaseinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.baseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_knowledge_category(
        self,
        request: ato_models.CreateKnowledgeCategoryRequest,
    ) -> ato_models.CreateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_knowledge_category_ex(request, headers, runtime)

    async def create_knowledge_category_async(
        self,
        request: ato_models.CreateKnowledgeCategoryRequest,
    ) -> ato_models.CreateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_knowledge_category_ex_async(request, headers, runtime)

    def create_knowledge_category_ex(
        self,
        request: ato_models.CreateKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_knowledge_category_ex_async(
        self,
        request: ato_models.CreateKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_knowledge_category(
        self,
        request: ato_models.PagequeryKnowledgeCategoryRequest,
    ) -> ato_models.PagequeryKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-查询知识库信息列表
        Summary: 商家自定义知识库-查询知识库信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_knowledge_category_ex(request, headers, runtime)

    async def pagequery_knowledge_category_async(
        self,
        request: ato_models.PagequeryKnowledgeCategoryRequest,
    ) -> ato_models.PagequeryKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-查询知识库信息列表
        Summary: 商家自定义知识库-查询知识库信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_knowledge_category_ex_async(request, headers, runtime)

    def pagequery_knowledge_category_ex(
        self,
        request: ato_models.PagequeryKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-查询知识库信息列表
        Summary: 商家自定义知识库-查询知识库信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_knowledge_category_ex_async(
        self,
        request: ato_models.PagequeryKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-查询知识库信息列表
        Summary: 商家自定义知识库-查询知识库信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_knowledge_category(
        self,
        request: ato_models.AddKnowledgeCategoryRequest,
    ) -> ato_models.AddKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_knowledge_category_ex(request, headers, runtime)

    async def add_knowledge_category_async(
        self,
        request: ato_models.AddKnowledgeCategoryRequest,
    ) -> ato_models.AddKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_knowledge_category_ex_async(request, headers, runtime)

    def add_knowledge_category_ex(
        self,
        request: ato_models.AddKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_knowledge_category_ex_async(
        self,
        request: ato_models.AddKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_knowledge_category(
        self,
        request: ato_models.BatchdeleteKnowledgeCategoryRequest,
    ) -> ato_models.BatchdeleteKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_knowledge_category_ex(request, headers, runtime)

    async def batchdelete_knowledge_category_async(
        self,
        request: ato_models.BatchdeleteKnowledgeCategoryRequest,
    ) -> ato_models.BatchdeleteKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_knowledge_category_ex_async(request, headers, runtime)

    def batchdelete_knowledge_category_ex(
        self,
        request: ato_models.BatchdeleteKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchdeleteKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchdeleteKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_knowledge_category_ex_async(
        self,
        request: ato_models.BatchdeleteKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchdeleteKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchdeleteKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_knowledge_category(
        self,
        request: ato_models.UpdateKnowledgeCategoryRequest,
    ) -> ato_models.UpdateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_knowledge_category_ex(request, headers, runtime)

    async def update_knowledge_category_async(
        self,
        request: ato_models.UpdateKnowledgeCategoryRequest,
    ) -> ato_models.UpdateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_knowledge_category_ex_async(request, headers, runtime)

    def update_knowledge_category_ex(
        self,
        request: ato_models.UpdateKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_knowledge_category_ex_async(
        self,
        request: ato_models.UpdateKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_knowledge_category(
        self,
        request: ato_models.OperateKnowledgeCategoryRequest,
    ) -> ato_models.OperateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识点流程撤回/上线/下线
        Summary: 商家自定义知识库-知识点相关功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_knowledge_category_ex(request, headers, runtime)

    async def operate_knowledge_category_async(
        self,
        request: ato_models.OperateKnowledgeCategoryRequest,
    ) -> ato_models.OperateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识点流程撤回/上线/下线
        Summary: 商家自定义知识库-知识点相关功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_knowledge_category_ex_async(request, headers, runtime)

    def operate_knowledge_category_ex(
        self,
        request: ato_models.OperateKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识点流程撤回/上线/下线
        Summary: 商家自定义知识库-知识点相关功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_knowledge_category_ex_async(
        self,
        request: ato_models.OperateKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateKnowledgeCategoryResponse:
        """
        Description: 商家自定义知识库-知识点流程撤回/上线/下线
        Summary: 商家自定义知识库-知识点相关功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_knowledge_baseinfo(
        self,
        request: ato_models.SubmitKnowledgeBaseinfoRequest,
    ) -> ato_models.SubmitKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_knowledge_baseinfo_ex(request, headers, runtime)

    async def submit_knowledge_baseinfo_async(
        self,
        request: ato_models.SubmitKnowledgeBaseinfoRequest,
    ) -> ato_models.SubmitKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_knowledge_baseinfo_ex_async(request, headers, runtime)

    def submit_knowledge_baseinfo_ex(
        self,
        request: ato_models.SubmitKnowledgeBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitKnowledgeBaseinfoResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.baseinfo.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_knowledge_baseinfo_ex_async(
        self,
        request: ato_models.SubmitKnowledgeBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitKnowledgeBaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitKnowledgeBaseinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.baseinfo.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_knowledge_category(
        self,
        request: ato_models.SubmitKnowledgeCategoryRequest,
    ) -> ato_models.SubmitKnowledgeCategoryResponse:
        """
        Description: 商户知识库-知识点全量提交
        Summary: 商户知识库-知识点全量提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_knowledge_category_ex(request, headers, runtime)

    async def submit_knowledge_category_async(
        self,
        request: ato_models.SubmitKnowledgeCategoryRequest,
    ) -> ato_models.SubmitKnowledgeCategoryResponse:
        """
        Description: 商户知识库-知识点全量提交
        Summary: 商户知识库-知识点全量提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_knowledge_category_ex_async(request, headers, runtime)

    def submit_knowledge_category_ex(
        self,
        request: ato_models.SubmitKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitKnowledgeCategoryResponse:
        """
        Description: 商户知识库-知识点全量提交
        Summary: 商户知识库-知识点全量提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitKnowledgeCategoryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.category.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_knowledge_category_ex_async(
        self,
        request: ato_models.SubmitKnowledgeCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitKnowledgeCategoryResponse:
        """
        Description: 商户知识库-知识点全量提交
        Summary: 商户知识库-知识点全量提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitKnowledgeCategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.category.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_knowledge_categorylibrary(
        self,
        request: ato_models.QueryKnowledgeCategorylibraryRequest,
    ) -> ato_models.QueryKnowledgeCategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_knowledge_categorylibrary_ex(request, headers, runtime)

    async def query_knowledge_categorylibrary_async(
        self,
        request: ato_models.QueryKnowledgeCategorylibraryRequest,
    ) -> ato_models.QueryKnowledgeCategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_knowledge_categorylibrary_ex_async(request, headers, runtime)

    def query_knowledge_categorylibrary_ex(
        self,
        request: ato_models.QueryKnowledgeCategorylibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryKnowledgeCategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryKnowledgeCategorylibraryResponse(),
            self.do_request('1.0', 'antchain.ato.knowledge.categorylibrary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_knowledge_categorylibrary_ex_async(
        self,
        request: ato_models.QueryKnowledgeCategorylibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryKnowledgeCategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryKnowledgeCategorylibraryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.knowledge.categorylibrary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_knowledgebaseinfo(
        self,
        request: ato_models.SubmitInnerKnowledgebaseinfoRequest,
    ) -> ato_models.SubmitInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_knowledgebaseinfo_ex(request, headers, runtime)

    async def submit_inner_knowledgebaseinfo_async(
        self,
        request: ato_models.SubmitInnerKnowledgebaseinfoRequest,
    ) -> ato_models.SubmitInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_knowledgebaseinfo_ex_async(request, headers, runtime)

    def submit_inner_knowledgebaseinfo_ex(
        self,
        request: ato_models.SubmitInnerKnowledgebaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerKnowledgebaseinfoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgebaseinfo.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_knowledgebaseinfo_ex_async(
        self,
        request: ato_models.SubmitInnerKnowledgebaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息维护
        Summary: 商家自定义知识库-基础信息维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerKnowledgebaseinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgebaseinfo.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_knowledgebaseinfo(
        self,
        request: ato_models.QueryInnerKnowledgebaseinfoRequest,
    ) -> ato_models.QueryInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_knowledgebaseinfo_ex(request, headers, runtime)

    async def query_inner_knowledgebaseinfo_async(
        self,
        request: ato_models.QueryInnerKnowledgebaseinfoRequest,
    ) -> ato_models.QueryInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_knowledgebaseinfo_ex_async(request, headers, runtime)

    def query_inner_knowledgebaseinfo_ex(
        self,
        request: ato_models.QueryInnerKnowledgebaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerKnowledgebaseinfoResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgebaseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_knowledgebaseinfo_ex_async(
        self,
        request: ato_models.QueryInnerKnowledgebaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerKnowledgebaseinfoResponse:
        """
        Description: 商家自定义知识库-基础信息查询
        Summary: 商家自定义知识库-基础信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerKnowledgebaseinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgebaseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_knowledgecategory(
        self,
        request: ato_models.SubmitInnerKnowledgecategoryRequest,
    ) -> ato_models.SubmitInnerKnowledgecategoryResponse:
        """
        Description: 户知识库-知识点全量提交
        Summary: 户知识库-知识点全量提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_knowledgecategory_ex(request, headers, runtime)

    async def submit_inner_knowledgecategory_async(
        self,
        request: ato_models.SubmitInnerKnowledgecategoryRequest,
    ) -> ato_models.SubmitInnerKnowledgecategoryResponse:
        """
        Description: 户知识库-知识点全量提交
        Summary: 户知识库-知识点全量提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_knowledgecategory_ex_async(request, headers, runtime)

    def submit_inner_knowledgecategory_ex(
        self,
        request: ato_models.SubmitInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerKnowledgecategoryResponse:
        """
        Description: 户知识库-知识点全量提交
        Summary: 户知识库-知识点全量提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.SubmitInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerKnowledgecategoryResponse:
        """
        Description: 户知识库-知识点全量提交
        Summary: 户知识库-知识点全量提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_knowledgecategorylibrary(
        self,
        request: ato_models.QueryInnerKnowledgecategorylibraryRequest,
    ) -> ato_models.QueryInnerKnowledgecategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_knowledgecategorylibrary_ex(request, headers, runtime)

    async def query_inner_knowledgecategorylibrary_async(
        self,
        request: ato_models.QueryInnerKnowledgecategorylibraryRequest,
    ) -> ato_models.QueryInnerKnowledgecategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_knowledgecategorylibrary_ex_async(request, headers, runtime)

    def query_inner_knowledgecategorylibrary_ex(
        self,
        request: ato_models.QueryInnerKnowledgecategorylibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerKnowledgecategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerKnowledgecategorylibraryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategorylibrary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_knowledgecategorylibrary_ex_async(
        self,
        request: ato_models.QueryInnerKnowledgecategorylibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerKnowledgecategorylibraryResponse:
        """
        Description: 商家自定义知识库-查询知识库id
        Summary: 商家自定义知识库-查询知识库id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerKnowledgecategorylibraryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategorylibrary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_knowledgecategory(
        self,
        request: ato_models.CreateInnerKnowledgecategoryRequest,
    ) -> ato_models.CreateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_knowledgecategory_ex(request, headers, runtime)

    async def create_inner_knowledgecategory_async(
        self,
        request: ato_models.CreateInnerKnowledgecategoryRequest,
    ) -> ato_models.CreateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_knowledgecategory_ex_async(request, headers, runtime)

    def create_inner_knowledgecategory_ex(
        self,
        request: ato_models.CreateInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.CreateInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-创建用户自定义知识库
        Summary: 商家自定义知识库-创建用户自定义知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_inner_knowledgecategory(
        self,
        request: ato_models.BatchdeleteInnerKnowledgecategoryRequest,
    ) -> ato_models.BatchdeleteInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_inner_knowledgecategory_ex(request, headers, runtime)

    async def batchdelete_inner_knowledgecategory_async(
        self,
        request: ato_models.BatchdeleteInnerKnowledgecategoryRequest,
    ) -> ato_models.BatchdeleteInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_inner_knowledgecategory_ex_async(request, headers, runtime)

    def batchdelete_inner_knowledgecategory_ex(
        self,
        request: ato_models.BatchdeleteInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchdeleteInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchdeleteInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.BatchdeleteInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchdeleteInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识库信息批量删除
        Summary: 商家自定义知识库-知识库信息批量删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchdeleteInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_inner_knowledgecategory(
        self,
        request: ato_models.OperateInnerKnowledgecategoryRequest,
    ) -> ato_models.OperateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识点相关功能
        Summary: 商家自定义知识库-知识点相关功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_inner_knowledgecategory_ex(request, headers, runtime)

    async def operate_inner_knowledgecategory_async(
        self,
        request: ato_models.OperateInnerKnowledgecategoryRequest,
    ) -> ato_models.OperateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识点相关功能
        Summary: 商家自定义知识库-知识点相关功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_inner_knowledgecategory_ex_async(request, headers, runtime)

    def operate_inner_knowledgecategory_ex(
        self,
        request: ato_models.OperateInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识点相关功能
        Summary: 商家自定义知识库-知识点相关功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.OperateInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-知识点相关功能
        Summary: 商家自定义知识库-知识点相关功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_inner_knowledgecategory(
        self,
        request: ato_models.AddInnerKnowledgecategoryRequest,
    ) -> ato_models.AddInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_inner_knowledgecategory_ex(request, headers, runtime)

    async def add_inner_knowledgecategory_async(
        self,
        request: ato_models.AddInnerKnowledgecategoryRequest,
    ) -> ato_models.AddInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_inner_knowledgecategory_ex_async(request, headers, runtime)

    def add_inner_knowledgecategory_ex(
        self,
        request: ato_models.AddInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.AddInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-新增知识知识库信息
        Summary: 商家自定义知识库-新增知识知识库信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_knowledgecategory(
        self,
        request: ato_models.PagequeryInnerKnowledgecategoryRequest,
    ) -> ato_models.PagequeryInnerKnowledgecategoryResponse:
        """
        Description:
        商家自定义知识库-查询知识库信息列表
        Summary:  商家自定义知识库-查询知识库信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_knowledgecategory_ex(request, headers, runtime)

    async def pagequery_inner_knowledgecategory_async(
        self,
        request: ato_models.PagequeryInnerKnowledgecategoryRequest,
    ) -> ato_models.PagequeryInnerKnowledgecategoryResponse:
        """
        Description:
        商家自定义知识库-查询知识库信息列表
        Summary:  商家自定义知识库-查询知识库信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_knowledgecategory_ex_async(request, headers, runtime)

    def pagequery_inner_knowledgecategory_ex(
        self,
        request: ato_models.PagequeryInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerKnowledgecategoryResponse:
        """
        Description:
        商家自定义知识库-查询知识库信息列表
        Summary:  商家自定义知识库-查询知识库信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.PagequeryInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerKnowledgecategoryResponse:
        """
        Description:
        商家自定义知识库-查询知识库信息列表
        Summary:  商家自定义知识库-查询知识库信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_knowledgecategory(
        self,
        request: ato_models.UpdateInnerKnowledgecategoryRequest,
    ) -> ato_models.UpdateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_knowledgecategory_ex(request, headers, runtime)

    async def update_inner_knowledgecategory_async(
        self,
        request: ato_models.UpdateInnerKnowledgecategoryRequest,
    ) -> ato_models.UpdateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_knowledgecategory_ex_async(request, headers, runtime)

    def update_inner_knowledgecategory_ex(
        self,
        request: ato_models.UpdateInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerKnowledgecategoryResponse(),
            self.do_request('1.0', 'antchain.ato.inner.knowledgecategory.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_knowledgecategory_ex_async(
        self,
        request: ato_models.UpdateInnerKnowledgecategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerKnowledgecategoryResponse:
        """
        Description: 商家自定义知识库-编辑知识点
        Summary: 商家自定义知识库-编辑知识点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerKnowledgecategoryResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.knowledgecategory.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_saleschannel(
        self,
        request: ato_models.CreateInnerSaleschannelRequest,
    ) -> ato_models.CreateInnerSaleschannelResponse:
        """
        Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
        Summary: 分销渠道创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_saleschannel_ex(request, headers, runtime)

    async def create_inner_saleschannel_async(
        self,
        request: ato_models.CreateInnerSaleschannelRequest,
    ) -> ato_models.CreateInnerSaleschannelResponse:
        """
        Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
        Summary: 分销渠道创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_saleschannel_ex_async(request, headers, runtime)

    def create_inner_saleschannel_ex(
        self,
        request: ato_models.CreateInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerSaleschannelResponse:
        """
        Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
        Summary: 分销渠道创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerSaleschannelResponse(),
            self.do_request('1.0', 'antchain.ato.inner.saleschannel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_saleschannel_ex_async(
        self,
        request: ato_models.CreateInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerSaleschannelResponse:
        """
        Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
        Summary: 分销渠道创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerSaleschannelResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.saleschannel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_saleschannel(
        self,
        request: ato_models.QueryInnerSaleschannelRequest,
    ) -> ato_models.QueryInnerSaleschannelResponse:
        """
        Description: 查询分销渠道code、名称、级别等信息
        Summary: 分销渠道查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_saleschannel_ex(request, headers, runtime)

    async def query_inner_saleschannel_async(
        self,
        request: ato_models.QueryInnerSaleschannelRequest,
    ) -> ato_models.QueryInnerSaleschannelResponse:
        """
        Description: 查询分销渠道code、名称、级别等信息
        Summary: 分销渠道查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_saleschannel_ex_async(request, headers, runtime)

    def query_inner_saleschannel_ex(
        self,
        request: ato_models.QueryInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSaleschannelResponse:
        """
        Description: 查询分销渠道code、名称、级别等信息
        Summary: 分销渠道查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSaleschannelResponse(),
            self.do_request('1.0', 'antchain.ato.inner.saleschannel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_saleschannel_ex_async(
        self,
        request: ato_models.QueryInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSaleschannelResponse:
        """
        Description: 查询分销渠道code、名称、级别等信息
        Summary: 分销渠道查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSaleschannelResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.saleschannel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_saleschannel(
        self,
        request: ato_models.UpdateInnerSaleschannelRequest,
    ) -> ato_models.UpdateInnerSaleschannelResponse:
        """
        Description: 分销渠道更新，当前支持修改渠道名称
        Summary: 分销渠道更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_saleschannel_ex(request, headers, runtime)

    async def update_inner_saleschannel_async(
        self,
        request: ato_models.UpdateInnerSaleschannelRequest,
    ) -> ato_models.UpdateInnerSaleschannelResponse:
        """
        Description: 分销渠道更新，当前支持修改渠道名称
        Summary: 分销渠道更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_saleschannel_ex_async(request, headers, runtime)

    def update_inner_saleschannel_ex(
        self,
        request: ato_models.UpdateInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerSaleschannelResponse:
        """
        Description: 分销渠道更新，当前支持修改渠道名称
        Summary: 分销渠道更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerSaleschannelResponse(),
            self.do_request('1.0', 'antchain.ato.inner.saleschannel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_saleschannel_ex_async(
        self,
        request: ato_models.UpdateInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerSaleschannelResponse:
        """
        Description: 分销渠道更新，当前支持修改渠道名称
        Summary: 分销渠道更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerSaleschannelResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.saleschannel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_inner_saleschannel(
        self,
        request: ato_models.DeleteInnerSaleschannelRequest,
    ) -> ato_models.DeleteInnerSaleschannelResponse:
        """
        Description: 删除所选的分销渠道
        Summary: 分销渠道删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_inner_saleschannel_ex(request, headers, runtime)

    async def delete_inner_saleschannel_async(
        self,
        request: ato_models.DeleteInnerSaleschannelRequest,
    ) -> ato_models.DeleteInnerSaleschannelResponse:
        """
        Description: 删除所选的分销渠道
        Summary: 分销渠道删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_inner_saleschannel_ex_async(request, headers, runtime)

    def delete_inner_saleschannel_ex(
        self,
        request: ato_models.DeleteInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerSaleschannelResponse:
        """
        Description: 删除所选的分销渠道
        Summary: 分销渠道删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerSaleschannelResponse(),
            self.do_request('1.0', 'antchain.ato.inner.saleschannel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_inner_saleschannel_ex_async(
        self,
        request: ato_models.DeleteInnerSaleschannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerSaleschannelResponse:
        """
        Description: 删除所选的分销渠道
        Summary: 分销渠道删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerSaleschannelResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.saleschannel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_inner_templatetextarea(
        self,
        request: ato_models.BatchcreateInnerTemplatetextareaRequest,
    ) -> ato_models.BatchcreateInnerTemplatetextareaResponse:
        """
        Description: 批量创建文本域（组件）
        Summary: 批量创建文本域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_inner_templatetextarea_ex(request, headers, runtime)

    async def batchcreate_inner_templatetextarea_async(
        self,
        request: ato_models.BatchcreateInnerTemplatetextareaRequest,
    ) -> ato_models.BatchcreateInnerTemplatetextareaResponse:
        """
        Description: 批量创建文本域（组件）
        Summary: 批量创建文本域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_inner_templatetextarea_ex_async(request, headers, runtime)

    def batchcreate_inner_templatetextarea_ex(
        self,
        request: ato_models.BatchcreateInnerTemplatetextareaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchcreateInnerTemplatetextareaResponse:
        """
        Description: 批量创建文本域（组件）
        Summary: 批量创建文本域
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchcreateInnerTemplatetextareaResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatetextarea.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_inner_templatetextarea_ex_async(
        self,
        request: ato_models.BatchcreateInnerTemplatetextareaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.BatchcreateInnerTemplatetextareaResponse:
        """
        Description: 批量创建文本域（组件）
        Summary: 批量创建文本域
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.BatchcreateInnerTemplatetextareaResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatetextarea.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_agreementterminate(
        self,
        request: ato_models.PagequeryInnerAgreementterminateRequest,
    ) -> ato_models.PagequeryInnerAgreementterminateResponse:
        """
        Description: 异步解约申请列表
        Summary: 异步解约申请列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_agreementterminate_ex(request, headers, runtime)

    async def pagequery_inner_agreementterminate_async(
        self,
        request: ato_models.PagequeryInnerAgreementterminateRequest,
    ) -> ato_models.PagequeryInnerAgreementterminateResponse:
        """
        Description: 异步解约申请列表
        Summary: 异步解约申请列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_agreementterminate_ex_async(request, headers, runtime)

    def pagequery_inner_agreementterminate_ex(
        self,
        request: ato_models.PagequeryInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerAgreementterminateResponse:
        """
        Description: 异步解约申请列表
        Summary: 异步解约申请列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerAgreementterminateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminate.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_agreementterminate_ex_async(
        self,
        request: ato_models.PagequeryInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerAgreementterminateResponse:
        """
        Description: 异步解约申请列表
        Summary: 异步解约申请列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerAgreementterminateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminate.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_agreementterminate(
        self,
        request: ato_models.DetailInnerAgreementterminateRequest,
    ) -> ato_models.DetailInnerAgreementterminateResponse:
        """
        Description: 解约申请记录详情
        Summary: 解约申请记录详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_agreementterminate_ex(request, headers, runtime)

    async def detail_inner_agreementterminate_async(
        self,
        request: ato_models.DetailInnerAgreementterminateRequest,
    ) -> ato_models.DetailInnerAgreementterminateResponse:
        """
        Description: 解约申请记录详情
        Summary: 解约申请记录详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_agreementterminate_ex_async(request, headers, runtime)

    def detail_inner_agreementterminate_ex(
        self,
        request: ato_models.DetailInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerAgreementterminateResponse:
        """
        Description: 解约申请记录详情
        Summary: 解约申请记录详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerAgreementterminateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminate.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_agreementterminate_ex_async(
        self,
        request: ato_models.DetailInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerAgreementterminateResponse:
        """
        Description: 解约申请记录详情
        Summary: 解约申请记录详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerAgreementterminateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminate.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_inner_agreementterminate(
        self,
        request: ato_models.OperateInnerAgreementterminateRequest,
    ) -> ato_models.OperateInnerAgreementterminateResponse:
        """
        Description: 代扣解约申请处理
        Summary: 代扣解约申请处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_inner_agreementterminate_ex(request, headers, runtime)

    async def operate_inner_agreementterminate_async(
        self,
        request: ato_models.OperateInnerAgreementterminateRequest,
    ) -> ato_models.OperateInnerAgreementterminateResponse:
        """
        Description: 代扣解约申请处理
        Summary: 代扣解约申请处理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_inner_agreementterminate_ex_async(request, headers, runtime)

    def operate_inner_agreementterminate_ex(
        self,
        request: ato_models.OperateInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateInnerAgreementterminateResponse:
        """
        Description: 代扣解约申请处理
        Summary: 代扣解约申请处理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateInnerAgreementterminateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminate.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_inner_agreementterminate_ex_async(
        self,
        request: ato_models.OperateInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateInnerAgreementterminateResponse:
        """
        Description: 代扣解约申请处理
        Summary: 代扣解约申请处理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateInnerAgreementterminateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminate.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def charge_inner_agreementterminateevidence(
        self,
        request: ato_models.ChargeInnerAgreementterminateevidenceRequest,
    ) -> ato_models.ChargeInnerAgreementterminateevidenceResponse:
        """
        Description: 商户补充拒绝举证材料
        Summary: 商户补充拒绝举证材料
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.charge_inner_agreementterminateevidence_ex(request, headers, runtime)

    async def charge_inner_agreementterminateevidence_async(
        self,
        request: ato_models.ChargeInnerAgreementterminateevidenceRequest,
    ) -> ato_models.ChargeInnerAgreementterminateevidenceResponse:
        """
        Description: 商户补充拒绝举证材料
        Summary: 商户补充拒绝举证材料
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.charge_inner_agreementterminateevidence_ex_async(request, headers, runtime)

    def charge_inner_agreementterminateevidence_ex(
        self,
        request: ato_models.ChargeInnerAgreementterminateevidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ChargeInnerAgreementterminateevidenceResponse:
        """
        Description: 商户补充拒绝举证材料
        Summary: 商户补充拒绝举证材料
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ChargeInnerAgreementterminateevidenceResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminateevidence.charge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def charge_inner_agreementterminateevidence_ex_async(
        self,
        request: ato_models.ChargeInnerAgreementterminateevidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ChargeInnerAgreementterminateevidenceResponse:
        """
        Description: 商户补充拒绝举证材料
        Summary: 商户补充拒绝举证材料
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ChargeInnerAgreementterminateevidenceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminateevidence.charge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_inner_agreementterminatezfbdirect(
        self,
        request: ato_models.OperateInnerAgreementterminatezfbdirectRequest,
    ) -> ato_models.OperateInnerAgreementterminatezfbdirectResponse:
        """
        Description: 代扣异步解约-支付宝是否直接解约
        Summary: 代扣异步解约-支付宝是否直接解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_inner_agreementterminatezfbdirect_ex(request, headers, runtime)

    async def operate_inner_agreementterminatezfbdirect_async(
        self,
        request: ato_models.OperateInnerAgreementterminatezfbdirectRequest,
    ) -> ato_models.OperateInnerAgreementterminatezfbdirectResponse:
        """
        Description: 代扣异步解约-支付宝是否直接解约
        Summary: 代扣异步解约-支付宝是否直接解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_inner_agreementterminatezfbdirect_ex_async(request, headers, runtime)

    def operate_inner_agreementterminatezfbdirect_ex(
        self,
        request: ato_models.OperateInnerAgreementterminatezfbdirectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateInnerAgreementterminatezfbdirectResponse:
        """
        Description: 代扣异步解约-支付宝是否直接解约
        Summary: 代扣异步解约-支付宝是否直接解约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateInnerAgreementterminatezfbdirectResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminatezfbdirect.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_inner_agreementterminatezfbdirect_ex_async(
        self,
        request: ato_models.OperateInnerAgreementterminatezfbdirectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.OperateInnerAgreementterminatezfbdirectResponse:
        """
        Description: 代扣异步解约-支付宝是否直接解约
        Summary: 代扣异步解约-支付宝是否直接解约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.OperateInnerAgreementterminatezfbdirectResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminatezfbdirect.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_agreementterminateconfig(
        self,
        request: ato_models.QueryInnerAgreementterminateconfigRequest,
    ) -> ato_models.QueryInnerAgreementterminateconfigResponse:
        """
        Description: 解约申请配置详情
        Summary: 解约申请配置详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_agreementterminateconfig_ex(request, headers, runtime)

    async def query_inner_agreementterminateconfig_async(
        self,
        request: ato_models.QueryInnerAgreementterminateconfigRequest,
    ) -> ato_models.QueryInnerAgreementterminateconfigResponse:
        """
        Description: 解约申请配置详情
        Summary: 解约申请配置详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_agreementterminateconfig_ex_async(request, headers, runtime)

    def query_inner_agreementterminateconfig_ex(
        self,
        request: ato_models.QueryInnerAgreementterminateconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerAgreementterminateconfigResponse:
        """
        Description: 解约申请配置详情
        Summary: 解约申请配置详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerAgreementterminateconfigResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminateconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_agreementterminateconfig_ex_async(
        self,
        request: ato_models.QueryInnerAgreementterminateconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerAgreementterminateconfigResponse:
        """
        Description: 解约申请配置详情
        Summary: 解约申请配置详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerAgreementterminateconfigResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminateconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_inner_agreementterminate(
        self,
        request: ato_models.CountInnerAgreementterminateRequest,
    ) -> ato_models.CountInnerAgreementterminateResponse:
        """
        Description: 解约申请商户各状态统计
        Summary: 解约申请商户各状态统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_inner_agreementterminate_ex(request, headers, runtime)

    async def count_inner_agreementterminate_async(
        self,
        request: ato_models.CountInnerAgreementterminateRequest,
    ) -> ato_models.CountInnerAgreementterminateResponse:
        """
        Description: 解约申请商户各状态统计
        Summary: 解约申请商户各状态统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_inner_agreementterminate_ex_async(request, headers, runtime)

    def count_inner_agreementterminate_ex(
        self,
        request: ato_models.CountInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CountInnerAgreementterminateResponse:
        """
        Description: 解约申请商户各状态统计
        Summary: 解约申请商户各状态统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CountInnerAgreementterminateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.agreementterminate.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_inner_agreementterminate_ex_async(
        self,
        request: ato_models.CountInnerAgreementterminateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CountInnerAgreementterminateResponse:
        """
        Description: 解约申请商户各状态统计
        Summary: 解约申请商户各状态统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CountInnerAgreementterminateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.agreementterminate.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_insure(
        self,
        request: ato_models.CreateInsureRequest,
    ) -> ato_models.CreateInsureResponse:
        """
        Description: 一键投保
        Summary: 投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_insure_ex(request, headers, runtime)

    async def create_insure_async(
        self,
        request: ato_models.CreateInsureRequest,
    ) -> ato_models.CreateInsureResponse:
        """
        Description: 一键投保
        Summary: 投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_insure_ex_async(request, headers, runtime)

    def create_insure_ex(
        self,
        request: ato_models.CreateInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInsureResponse:
        """
        Description: 一键投保
        Summary: 投保
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInsureResponse(),
            self.do_request('1.0', 'antchain.ato.insure.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_insure_ex_async(
        self,
        request: ato_models.CreateInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInsureResponse:
        """
        Description: 一键投保
        Summary: 投保
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInsureResponse(),
            await self.do_request_async('1.0', 'antchain.ato.insure.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insure(
        self,
        request: ato_models.QueryInsureRequest,
    ) -> ato_models.QueryInsureResponse:
        """
        Description: 保单查询
        Summary: 保单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insure_ex(request, headers, runtime)

    async def query_insure_async(
        self,
        request: ato_models.QueryInsureRequest,
    ) -> ato_models.QueryInsureResponse:
        """
        Description: 保单查询
        Summary: 保单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insure_ex_async(request, headers, runtime)

    def query_insure_ex(
        self,
        request: ato_models.QueryInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInsureResponse:
        """
        Description: 保单查询
        Summary: 保单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInsureResponse(),
            self.do_request('1.0', 'antchain.ato.insure.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insure_ex_async(
        self,
        request: ato_models.QueryInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInsureResponse:
        """
        Description: 保单查询
        Summary: 保单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInsureResponse(),
            await self.do_request_async('1.0', 'antchain.ato.insure.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_insure_pay(
        self,
        request: ato_models.RetryInsurePayRequest,
    ) -> ato_models.RetryInsurePayResponse:
        """
        Description: 保险代扣重试
        Summary: 保险代扣重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_insure_pay_ex(request, headers, runtime)

    async def retry_insure_pay_async(
        self,
        request: ato_models.RetryInsurePayRequest,
    ) -> ato_models.RetryInsurePayResponse:
        """
        Description: 保险代扣重试
        Summary: 保险代扣重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_insure_pay_ex_async(request, headers, runtime)

    def retry_insure_pay_ex(
        self,
        request: ato_models.RetryInsurePayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryInsurePayResponse:
        """
        Description: 保险代扣重试
        Summary: 保险代扣重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryInsurePayResponse(),
            self.do_request('1.0', 'antchain.ato.insure.pay.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_insure_pay_ex_async(
        self,
        request: ato_models.RetryInsurePayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryInsurePayResponse:
        """
        Description: 保险代扣重试
        Summary: 保险代扣重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryInsurePayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.insure.pay.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_merchantexpand_merchant(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_merchantexpand_merchant_ex(request, headers, runtime)

    async def register_merchantexpand_merchant_async(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_merchantexpand_merchant_ex_async(request, headers, runtime)

    def register_merchantexpand_merchant_ex(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RegisterMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_merchantexpand_merchant_ex_async(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RegisterMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_merchantexpand_file(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_merchantexpand_file_ex(request, headers, runtime)

    async def upload_merchantexpand_file_async(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_merchantexpand_file_ex_async(request, headers, runtime)

    def upload_merchantexpand_file_ex(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadMerchantexpandFileResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_merchantexpand_file_ex_async(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadMerchantexpandFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchantexpand_merchant(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchantexpand_merchant_ex(request, headers, runtime)

    async def query_merchantexpand_merchant_async(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchantexpand_merchant_ex_async(request, headers, runtime)

    def query_merchantexpand_merchant_ex(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchantexpand_merchant_ex_async(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_merchantexpand_merchant(
        self,
        request: ato_models.UpdateMerchantexpandMerchantRequest,
    ) -> ato_models.UpdateMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_merchantexpand_merchant_ex(request, headers, runtime)

    async def update_merchantexpand_merchant_async(
        self,
        request: ato_models.UpdateMerchantexpandMerchantRequest,
    ) -> ato_models.UpdateMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_merchantexpand_merchant_ex_async(request, headers, runtime)

    def update_merchantexpand_merchant_ex(
        self,
        request: ato_models.UpdateMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_merchantexpand_merchant_ex_async(
        self,
        request: ato_models.UpdateMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateMerchantexpandMerchantResponse:
        """
        Description: 商家信息修改
        Summary: 商家信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_merchantexpand_dividerelation(
        self,
        request: ato_models.AddMerchantexpandDividerelationRequest,
    ) -> ato_models.AddMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_merchantexpand_dividerelation_ex(request, headers, runtime)

    async def add_merchantexpand_dividerelation_async(
        self,
        request: ato_models.AddMerchantexpandDividerelationRequest,
    ) -> ato_models.AddMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_merchantexpand_dividerelation_ex_async(request, headers, runtime)

    def add_merchantexpand_dividerelation_ex(
        self,
        request: ato_models.AddMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddMerchantexpandDividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.dividerelation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_merchantexpand_dividerelation_ex_async(
        self,
        request: ato_models.AddMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddMerchantexpandDividerelationResponse:
        """
        Description: 添加分账绑定关系
        Summary: 添加分账绑定关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddMerchantexpandDividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.dividerelation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchantexpand_dividerelation(
        self,
        request: ato_models.QueryMerchantexpandDividerelationRequest,
    ) -> ato_models.QueryMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchantexpand_dividerelation_ex(request, headers, runtime)

    async def query_merchantexpand_dividerelation_async(
        self,
        request: ato_models.QueryMerchantexpandDividerelationRequest,
    ) -> ato_models.QueryMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchantexpand_dividerelation_ex_async(request, headers, runtime)

    def query_merchantexpand_dividerelation_ex(
        self,
        request: ato_models.QueryMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryMerchantexpandDividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.dividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchantexpand_dividerelation_ex_async(
        self,
        request: ato_models.QueryMerchantexpandDividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryMerchantexpandDividerelationResponse:
        """
        Description: 分账绑定关系查询
        Summary: 分账绑定关系查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryMerchantexpandDividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.dividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_realperson_facevrf(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_realperson_facevrf_ex(request, headers, runtime)

    async def create_realperson_facevrf_async(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_realperson_facevrf_ex_async(request, headers, runtime)

    def create_realperson_facevrf_ex(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_realperson_facevrf_ex_async(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_realperson_facevrf(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_realperson_facevrf_ex(request, headers, runtime)

    async def query_realperson_facevrf_async(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_realperson_facevrf_ex_async(request, headers, runtime)

    def query_realperson_facevrf_ex(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_realperson_facevrf_ex_async(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk(
        self,
        request: ato_models.QueryRiskRequest,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_ex(request, headers, runtime)

    async def query_risk_async(
        self,
        request: ato_models.QueryRiskRequest,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_ex_async(request, headers, runtime)

    def query_risk_ex(
        self,
        request: ato_models.QueryRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRiskResponse(),
            self.do_request('1.0', 'antchain.ato.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_ex_async(
        self,
        request: ato_models.QueryRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRiskResponse(),
            await self.do_request_async('1.0', 'antchain.ato.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk_go(
        self,
        request: ato_models.QueryRiskGoRequest,
    ) -> ato_models.QueryRiskGoResponse:
        """
        Description: 云 api 发起风控分析，获取风险评估
        Summary: 云 api 发起风控分析，获取风险评估
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_go_ex(request, headers, runtime)

    async def query_risk_go_async(
        self,
        request: ato_models.QueryRiskGoRequest,
    ) -> ato_models.QueryRiskGoResponse:
        """
        Description: 云 api 发起风控分析，获取风险评估
        Summary: 云 api 发起风控分析，获取风险评估
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_go_ex_async(request, headers, runtime)

    def query_risk_go_ex(
        self,
        request: ato_models.QueryRiskGoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRiskGoResponse:
        """
        Description: 云 api 发起风控分析，获取风险评估
        Summary: 云 api 发起风控分析，获取风险评估
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRiskGoResponse(),
            self.do_request('1.0', 'antchain.ato.risk.go.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_go_ex_async(
        self,
        request: ato_models.QueryRiskGoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRiskGoResponse:
        """
        Description: 云 api 发起风控分析，获取风险评估
        Summary: 云 api 发起风控分析，获取风险评估
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRiskGoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.risk.go.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_inner_riskcall(
        self,
        request: ato_models.UploadInnerRiskcallRequest,
    ) -> ato_models.UploadInnerRiskcallResponse:
        """
        Description: 小程序云调用，上报计量信息
        Summary: 小程序云调用，上报计量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_inner_riskcall_ex(request, headers, runtime)

    async def upload_inner_riskcall_async(
        self,
        request: ato_models.UploadInnerRiskcallRequest,
    ) -> ato_models.UploadInnerRiskcallResponse:
        """
        Description: 小程序云调用，上报计量信息
        Summary: 小程序云调用，上报计量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_inner_riskcall_ex_async(request, headers, runtime)

    def upload_inner_riskcall_ex(
        self,
        request: ato_models.UploadInnerRiskcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadInnerRiskcallResponse:
        """
        Description: 小程序云调用，上报计量信息
        Summary: 小程序云调用，上报计量信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadInnerRiskcallResponse(),
            self.do_request('1.0', 'antchain.ato.inner.riskcall.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_inner_riskcall_ex_async(
        self,
        request: ato_models.UploadInnerRiskcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadInnerRiskcallResponse:
        """
        Description: 小程序云调用，上报计量信息
        Summary: 小程序云调用，上报计量信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadInnerRiskcallResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.riskcall.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_sign_template(
        self,
        request: ato_models.AllSignTemplateRequest,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_sign_template_ex(request, headers, runtime)

    async def all_sign_template_async(
        self,
        request: ato_models.AllSignTemplateRequest,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_sign_template_ex_async(request, headers, runtime)

    def all_sign_template_ex(
        self,
        request: ato_models.AllSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_sign_template_ex_async(
        self,
        request: ato_models.AllSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_sign_flow(
        self,
        request: ato_models.SubmitSignFlowRequest,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_sign_flow_ex(request, headers, runtime)

    async def submit_sign_flow_async(
        self,
        request: ato_models.SubmitSignFlowRequest,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_sign_flow_ex_async(request, headers, runtime)

    def submit_sign_flow_ex(
        self,
        request: ato_models.SubmitSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_sign_flow_ex_async(
        self,
        request: ato_models.SubmitSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sign_flow(
        self,
        request: ato_models.GetSignFlowRequest,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sign_flow_ex(request, headers, runtime)

    async def get_sign_flow_async(
        self,
        request: ato_models.GetSignFlowRequest,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sign_flow_ex_async(request, headers, runtime)

    def get_sign_flow_ex(
        self,
        request: ato_models.GetSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sign_flow_ex_async(
        self,
        request: ato_models.GetSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_sign_flow(
        self,
        request: ato_models.AuthSignFlowRequest,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_sign_flow_ex(request, headers, runtime)

    async def auth_sign_flow_async(
        self,
        request: ato_models.AuthSignFlowRequest,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_sign_flow_ex_async(request, headers, runtime)

    def auth_sign_flow_ex(
        self,
        request: ato_models.AuthSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_sign_flow_ex_async(
        self,
        request: ato_models.AuthSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_front_sign(
        self,
        request: ato_models.SubmitFrontSignRequest,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_front_sign_ex(request, headers, runtime)

    async def submit_front_sign_async(
        self,
        request: ato_models.SubmitFrontSignRequest,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_front_sign_ex_async(request, headers, runtime)

    def submit_front_sign_ex(
        self,
        request: ato_models.SubmitFrontSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitFrontSignResponse(),
            self.do_request('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_front_sign_ex_async(
        self,
        request: ato_models.SubmitFrontSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitFrontSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_sign_flow(
        self,
        request: ato_models.UploadSignFlowRequest,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_sign_flow_ex(request, headers, runtime)

    async def upload_sign_flow_async(
        self,
        request: ato_models.UploadSignFlowRequest,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_sign_flow_ex_async(request, headers, runtime)

    def upload_sign_flow_ex(
        self,
        request: ato_models.UploadSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_flow_response = ato_models.UploadSignFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_sign_flow_ex_async(
        self,
        request: ato_models.UploadSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_flow_response = ato_models.UploadSignFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_sign_template(
        self,
        request: ato_models.UploadSignTemplateRequest,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_sign_template_ex(request, headers, runtime)

    async def upload_sign_template_async(
        self,
        request: ato_models.UploadSignTemplateRequest,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_sign_template_ex_async(request, headers, runtime)

    def upload_sign_template_ex(
        self,
        request: ato_models.UploadSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.template.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_template_response = ato_models.UploadSignTemplateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_template_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_sign_template_ex_async(
        self,
        request: ato_models.UploadSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.template.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_template_response = ato_models.UploadSignTemplateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_template_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_sign_credit(
        self,
        request: ato_models.UploadSignCreditRequest,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_sign_credit_ex(request, headers, runtime)

    async def upload_sign_credit_async(
        self,
        request: ato_models.UploadSignCreditRequest,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_sign_credit_ex_async(request, headers, runtime)

    def upload_sign_credit_ex(
        self,
        request: ato_models.UploadSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignCreditResponse(),
            self.do_request('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_sign_credit_ex_async(
        self,
        request: ato_models.UploadSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sign_credit(
        self,
        request: ato_models.QuerySignCreditRequest,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sign_credit_ex(request, headers, runtime)

    async def query_sign_credit_async(
        self,
        request: ato_models.QuerySignCreditRequest,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sign_credit_ex_async(request, headers, runtime)

    def query_sign_credit_ex(
        self,
        request: ato_models.QuerySignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QuerySignCreditResponse(),
            self.do_request('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sign_credit_ex_async(
        self,
        request: ato_models.QuerySignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QuerySignCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_sign_flow(
        self,
        request: ato_models.CancelSignFlowRequest,
    ) -> ato_models.CancelSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_sign_flow_ex(request, headers, runtime)

    async def cancel_sign_flow_async(
        self,
        request: ato_models.CancelSignFlowRequest,
    ) -> ato_models.CancelSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_sign_flow_ex_async(request, headers, runtime)

    def cancel_sign_flow_ex(
        self,
        request: ato_models.CancelSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_sign_flow_ex_async(
        self,
        request: ato_models.CancelSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelSignFlowResponse:
        """
        Description: 撤销签署流程
        Summary: 撤销签署流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sign_contractcertificate(
        self,
        request: ato_models.GetSignContractcertificateRequest,
    ) -> ato_models.GetSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sign_contractcertificate_ex(request, headers, runtime)

    async def get_sign_contractcertificate_async(
        self,
        request: ato_models.GetSignContractcertificateRequest,
    ) -> ato_models.GetSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sign_contractcertificate_ex_async(request, headers, runtime)

    def get_sign_contractcertificate_ex(
        self,
        request: ato_models.GetSignContractcertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetSignContractcertificateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.contractcertificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sign_contractcertificate_ex_async(
        self,
        request: ato_models.GetSignContractcertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetSignContractcertificateResponse:
        """
        Description: 获取合同存证证明
        Summary: 获取合同存证证明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetSignContractcertificateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.contractcertificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade(
        self,
        request: ato_models.SyncTradeRequest,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_ex(request, headers, runtime)

    async def sync_trade_async(
        self,
        request: ato_models.SyncTradeRequest,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_ex_async(request, headers, runtime)

    def sync_trade_ex(
        self,
        request: ato_models.SyncTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_ex_async(
        self,
        request: ato_models.SyncTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade(
        self,
        request: ato_models.GetTradeRequest,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_ex(request, headers, runtime)

    async def get_trade_async(
        self,
        request: ato_models.GetTradeRequest,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_ex_async(request, headers, runtime)

    def get_trade_ex(
        self,
        request: ato_models.GetTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_ex_async(
        self,
        request: ato_models.GetTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_front_trade(
        self,
        request: ato_models.SyncFrontTradeRequest,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_front_trade_ex(request, headers, runtime)

    async def sync_front_trade_async(
        self,
        request: ato_models.SyncFrontTradeRequest,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_front_trade_ex_async(request, headers, runtime)

    def sync_front_trade_ex(
        self,
        request: ato_models.SyncFrontTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontTradeResponse(),
            self.do_request('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_front_trade_ex_async(
        self,
        request: ato_models.SyncFrontTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_financeloanapply(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_financeloanapply_ex(request, headers, runtime)

    async def sync_trade_financeloanapply_async(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_financeloanapply_ex_async(request, headers, runtime)

    def sync_trade_financeloanapply_ex(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeFinanceloanapplyResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_financeloanapply_ex_async(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeFinanceloanapplyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_merchantfulfillment(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_merchantfulfillment_ex(request, headers, runtime)

    async def get_trade_merchantfulfillment_async(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_merchantfulfillment_ex_async(request, headers, runtime)

    def get_trade_merchantfulfillment_ex(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_merchantfulfillment_ex_async(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_userperformance(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_userperformance_ex(request, headers, runtime)

    async def get_trade_userperformance_async(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_userperformance_ex_async(request, headers, runtime)

    def get_trade_userperformance_ex(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeUserperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_userperformance_ex_async(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeUserperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_merchantperformance(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_merchantperformance_ex(request, headers, runtime)

    async def get_trade_merchantperformance_async(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_merchantperformance_ex_async(request, headers, runtime)

    def get_trade_merchantperformance_ex(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_merchantperformance_ex_async(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_trade_userpromise(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_trade_userpromise_ex(request, headers, runtime)

    async def update_trade_userpromise_async(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_trade_userpromise_ex_async(request, headers, runtime)

    def update_trade_userpromise_ex(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_trade_userpromise_ex_async(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_front_indirectorder(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_front_indirectorder_ex(request, headers, runtime)

    async def sync_front_indirectorder_async(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_front_indirectorder_ex_async(request, headers, runtime)

    def sync_front_indirectorder_ex(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontIndirectorderResponse(),
            self.do_request('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_front_indirectorder_ex_async(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontIndirectorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_indirectorder(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_indirectorder_ex(request, headers, runtime)

    async def sync_trade_indirectorder_async(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_indirectorder_ex_async(request, headers, runtime)

    def sync_trade_indirectorder_ex(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeIndirectorderResponse(),
            self.do_request('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_indirectorder_ex_async(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeIndirectorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_trade_userpromise(
        self,
        request: ato_models.ReplaceTradeUserpromiseRequest,
    ) -> ato_models.ReplaceTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_trade_userpromise_ex(request, headers, runtime)

    async def replace_trade_userpromise_async(
        self,
        request: ato_models.ReplaceTradeUserpromiseRequest,
    ) -> ato_models.ReplaceTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_trade_userpromise_ex_async(request, headers, runtime)

    def replace_trade_userpromise_ex(
        self,
        request: ato_models.ReplaceTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ReplaceTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ReplaceTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_trade_userpromise_ex_async(
        self,
        request: ato_models.ReplaceTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ReplaceTradeUserpromiseResponse:
        """
        Description: 用户履约承诺替换更新
        Summary: 用户履约承诺替换更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ReplaceTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_trade_financeprecheck(
        self,
        request: ato_models.ApplyTradeFinanceprecheckRequest,
    ) -> ato_models.ApplyTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_trade_financeprecheck_ex(request, headers, runtime)

    async def apply_trade_financeprecheck_async(
        self,
        request: ato_models.ApplyTradeFinanceprecheckRequest,
    ) -> ato_models.ApplyTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_trade_financeprecheck_ex_async(request, headers, runtime)

    def apply_trade_financeprecheck_ex(
        self,
        request: ato_models.ApplyTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ApplyTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ApplyTradeFinanceprecheckResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeprecheck.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_trade_financeprecheck_ex_async(
        self,
        request: ato_models.ApplyTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ApplyTradeFinanceprecheckResponse:
        """
        Description: 订单融资预审申请接口
        Summary: 订单融资预审申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ApplyTradeFinanceprecheckResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeprecheck.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def transfer_trade_finance(
        self,
        request: ato_models.TransferTradeFinanceRequest,
    ) -> ato_models.TransferTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.transfer_trade_finance_ex(request, headers, runtime)

    async def transfer_trade_finance_async(
        self,
        request: ato_models.TransferTradeFinanceRequest,
    ) -> ato_models.TransferTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.transfer_trade_finance_ex_async(request, headers, runtime)

    def transfer_trade_finance_ex(
        self,
        request: ato_models.TransferTradeFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.TransferTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.TransferTradeFinanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.finance.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def transfer_trade_finance_ex_async(
        self,
        request: ato_models.TransferTradeFinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.TransferTradeFinanceResponse:
        """
        Description: 非融转融资
        Summary: 非融转融资
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.TransferTradeFinanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.finance.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_trade_order(
        self,
        request: ato_models.UpdateTradeOrderRequest,
    ) -> ato_models.UpdateTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_trade_order_ex(request, headers, runtime)

    async def update_trade_order_async(
        self,
        request: ato_models.UpdateTradeOrderRequest,
    ) -> ato_models.UpdateTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_trade_order_ex_async(request, headers, runtime)

    def update_trade_order_ex(
        self,
        request: ato_models.UpdateTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateTradeOrderResponse(),
            self.do_request('1.0', 'antchain.ato.trade.order.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_trade_order_ex_async(
        self,
        request: ato_models.UpdateTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateTradeOrderResponse:
        """
        Description: 更新订单信息
        Summary: 更新订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateTradeOrderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.order.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_trade_financeprecheck(
        self,
        request: ato_models.AddTradeFinanceprecheckRequest,
    ) -> ato_models.AddTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_trade_financeprecheck_ex(request, headers, runtime)

    async def add_trade_financeprecheck_async(
        self,
        request: ato_models.AddTradeFinanceprecheckRequest,
    ) -> ato_models.AddTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_trade_financeprecheck_ex_async(request, headers, runtime)

    def add_trade_financeprecheck_ex(
        self,
        request: ato_models.AddTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddTradeFinanceprecheckResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeprecheck.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_trade_financeprecheck_ex_async(
        self,
        request: ato_models.AddTradeFinanceprecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AddTradeFinanceprecheckResponse:
        """
        Description: 融资订单追加预审资金方
        Summary: 融资订单追加预审资金方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AddTradeFinanceprecheckResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeprecheck.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_orderfinanceinfo(
        self,
        request: ato_models.GetTradeOrderfinanceinfoRequest,
    ) -> ato_models.GetTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_orderfinanceinfo_ex(request, headers, runtime)

    async def get_trade_orderfinanceinfo_async(
        self,
        request: ato_models.GetTradeOrderfinanceinfoRequest,
    ) -> ato_models.GetTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_orderfinanceinfo_ex_async(request, headers, runtime)

    def get_trade_orderfinanceinfo_ex(
        self,
        request: ato_models.GetTradeOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeOrderfinanceinfoResponse(),
            self.do_request('1.0', 'antchain.ato.trade.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_orderfinanceinfo_ex_async(
        self,
        request: ato_models.GetTradeOrderfinanceinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeOrderfinanceinfoResponse:
        """
        Description: 订单融资信息查询接口
        Summary: 订单融资信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeOrderfinanceinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.orderfinanceinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_userpromisedelay(
        self,
        request: ato_models.SyncTradeUserpromisedelayRequest,
    ) -> ato_models.SyncTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_userpromisedelay_ex(request, headers, runtime)

    async def sync_trade_userpromisedelay_async(
        self,
        request: ato_models.SyncTradeUserpromisedelayRequest,
    ) -> ato_models.SyncTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_userpromisedelay_ex_async(request, headers, runtime)

    def sync_trade_userpromisedelay_ex(
        self,
        request: ato_models.SyncTradeUserpromisedelayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeUserpromisedelayResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromisedelay.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_userpromisedelay_ex_async(
        self,
        request: ato_models.SyncTradeUserpromisedelayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeUserpromisedelayResponse:
        """
        Description: 订单代扣计划延期
        Summary: 订单代扣计划延期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeUserpromisedelayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromisedelay.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pause_trade_userpromise(
        self,
        request: ato_models.PauseTradeUserpromiseRequest,
    ) -> ato_models.PauseTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pause_trade_userpromise_ex(request, headers, runtime)

    async def pause_trade_userpromise_async(
        self,
        request: ato_models.PauseTradeUserpromiseRequest,
    ) -> ato_models.PauseTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pause_trade_userpromise_ex_async(request, headers, runtime)

    def pause_trade_userpromise_ex(
        self,
        request: ato_models.PauseTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PauseTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PauseTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pause_trade_userpromise_ex_async(
        self,
        request: ato_models.PauseTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PauseTradeUserpromiseResponse:
        """
        Description: 订单代扣计划暂停
        Summary: 订单代扣计划暂停
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PauseTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_trade_userpromise(
        self,
        request: ato_models.ResumeTradeUserpromiseRequest,
    ) -> ato_models.ResumeTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_trade_userpromise_ex(request, headers, runtime)

    async def resume_trade_userpromise_async(
        self,
        request: ato_models.ResumeTradeUserpromiseRequest,
    ) -> ato_models.ResumeTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_trade_userpromise_ex_async(request, headers, runtime)

    def resume_trade_userpromise_ex(
        self,
        request: ato_models.ResumeTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ResumeTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ResumeTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_trade_userpromise_ex_async(
        self,
        request: ato_models.ResumeTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ResumeTradeUserpromiseResponse:
        """
        Description: 代扣计划重启
        Summary: 代扣计划重启
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ResumeTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_promoorderinfo(
        self,
        request: ato_models.SyncTradePromoorderinfoRequest,
    ) -> ato_models.SyncTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_promoorderinfo_ex(request, headers, runtime)

    async def sync_trade_promoorderinfo_async(
        self,
        request: ato_models.SyncTradePromoorderinfoRequest,
    ) -> ato_models.SyncTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_promoorderinfo_ex_async(request, headers, runtime)

    def sync_trade_promoorderinfo_ex(
        self,
        request: ato_models.SyncTradePromoorderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradePromoorderinfoResponse(),
            self.do_request('1.0', 'antchain.ato.trade.promoorderinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_promoorderinfo_ex_async(
        self,
        request: ato_models.SyncTradePromoorderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradePromoorderinfoResponse:
        """
        Description: 订单信息同步
        Summary: 订单信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradePromoorderinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.promoorderinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_sign(
        self,
        request: ato_models.CreateWithholdSignRequest,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约创建
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_sign_ex(request, headers, runtime)

    async def create_withhold_sign_async(
        self,
        request: ato_models.CreateWithholdSignRequest,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约创建
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_sign_ex_async(request, headers, runtime)

    def create_withhold_sign_ex(
        self,
        request: ato_models.CreateWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约创建
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_sign_ex_async(
        self,
        request: ato_models.CreateWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约创建
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_sign(
        self,
        request: ato_models.QueryWithholdSignRequest,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_sign_ex(request, headers, runtime)

    async def query_withhold_sign_async(
        self,
        request: ato_models.QueryWithholdSignRequest,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_sign_ex_async(request, headers, runtime)

    def query_withhold_sign_ex(
        self,
        request: ato_models.QueryWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_sign_ex_async(
        self,
        request: ato_models.QueryWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_withhold_sign(
        self,
        request: ato_models.UnbindWithholdSignRequest,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_withhold_sign_ex(request, headers, runtime)

    async def unbind_withhold_sign_async(
        self,
        request: ato_models.UnbindWithholdSignRequest,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_withhold_sign_ex_async(request, headers, runtime)

    def unbind_withhold_sign_ex(
        self,
        request: ato_models.UnbindWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UnbindWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_withhold_sign_ex_async(
        self,
        request: ato_models.UnbindWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UnbindWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_withhold_plan(
        self,
        request: ato_models.CancelWithholdPlanRequest,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_withhold_plan_ex(request, headers, runtime)

    async def cancel_withhold_plan_async(
        self,
        request: ato_models.CancelWithholdPlanRequest,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_withhold_plan_ex_async(request, headers, runtime)

    def cancel_withhold_plan_ex(
        self,
        request: ato_models.CancelWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_withhold_plan_ex_async(
        self,
        request: ato_models.CancelWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_withhold_plan(
        self,
        request: ato_models.RepayWithholdPlanRequest,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_withhold_plan_ex(request, headers, runtime)

    async def repay_withhold_plan_async(
        self,
        request: ato_models.RepayWithholdPlanRequest,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_withhold_plan_ex_async(request, headers, runtime)

    def repay_withhold_plan_ex(
        self,
        request: ato_models.RepayWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RepayWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_withhold_plan_ex_async(
        self,
        request: ato_models.RepayWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 重要说明：
        1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期多期代扣取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RepayWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_withhold_plan(
        self,
        request: ato_models.RetryWithholdPlanRequest,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_withhold_plan_ex(request, headers, runtime)

    async def retry_withhold_plan_async(
        self,
        request: ato_models.RetryWithholdPlanRequest,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_withhold_plan_ex_async(request, headers, runtime)

    def retry_withhold_plan_ex(
        self,
        request: ato_models.RetryWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_withhold_plan_ex_async(
        self,
        request: ato_models.RetryWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_withhold_signasyncunsign(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_withhold_signasyncunsign_ex(request, headers, runtime)

    async def confirm_withhold_signasyncunsign_async(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_withhold_signasyncunsign_ex_async(request, headers, runtime)

    def confirm_withhold_signasyncunsign_ex(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmWithholdSignasyncunsignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_withhold_signasyncunsign_ex_async(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmWithholdSignasyncunsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_activepay(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 主动支付创建
        Summary: 主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_activepay_ex(request, headers, runtime)

    async def create_withhold_activepay_async(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 主动支付创建
        Summary: 主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_activepay_ex_async(request, headers, runtime)

    def create_withhold_activepay_ex(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 主动支付创建
        Summary: 主动支付创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_activepay_ex_async(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 主动支付创建
        Summary: 主动支付创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_activepay(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 主动支付查询
        Summary: 主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_activepay_ex(request, headers, runtime)

    async def query_withhold_activepay_async(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 主动支付查询
        Summary: 主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_activepay_ex_async(request, headers, runtime)

    def query_withhold_activepay_ex(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 主动支付查询
        Summary: 主动支付查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_activepay_ex_async(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 主动支付查询
        Summary: 主动支付查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_withhold_activepay(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 主动支付取消
        Summary: 主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_withhold_activepay_ex(request, headers, runtime)

    async def cancel_withhold_activepay_async(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 主动支付取消
        Summary: 主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_withhold_activepay_ex_async(request, headers, runtime)

    def cancel_withhold_activepay_ex(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 主动支付取消
        Summary: 主动支付取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_withhold_activepay_ex_async(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 主动支付取消
        Summary: 主动支付取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_refund(
        self,
        request: ato_models.CreateWithholdRefundRequest,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_refund_ex(request, headers, runtime)

    async def create_withhold_refund_async(
        self,
        request: ato_models.CreateWithholdRefundRequest,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_refund_ex_async(request, headers, runtime)

    def create_withhold_refund_ex(
        self,
        request: ato_models.CreateWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdRefundResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_refund_ex_async(
        self,
        request: ato_models.CreateWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdRefundResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_refund(
        self,
        request: ato_models.QueryWithholdRefundRequest,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_refund_ex(request, headers, runtime)

    async def query_withhold_refund_async(
        self,
        request: ato_models.QueryWithholdRefundRequest,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_refund_ex_async(request, headers, runtime)

    def query_withhold_refund_ex(
        self,
        request: ato_models.QueryWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdRefundResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_refund_ex_async(
        self,
        request: ato_models.QueryWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdRefundResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_compensateaccount(
        self,
        request: ato_models.QueryWithholdCompensateaccountRequest,
    ) -> ato_models.QueryWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_compensateaccount_ex(request, headers, runtime)

    async def query_withhold_compensateaccount_async(
        self,
        request: ato_models.QueryWithholdCompensateaccountRequest,
    ) -> ato_models.QueryWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_compensateaccount_ex_async(request, headers, runtime)

    def query_withhold_compensateaccount_ex(
        self,
        request: ato_models.QueryWithholdCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdCompensateaccountResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_compensateaccount_ex_async(
        self,
        request: ato_models.QueryWithholdCompensateaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdCompensateaccountResponse:
        """
        Description: 代偿户账户查询
        Summary: 代偿户账户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdCompensateaccountResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.compensateaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_withhold_planpending(
        self,
        request: ato_models.RetryWithholdPlanpendingRequest,
    ) -> ato_models.RetryWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_withhold_planpending_ex(request, headers, runtime)

    async def retry_withhold_planpending_async(
        self,
        request: ato_models.RetryWithholdPlanpendingRequest,
    ) -> ato_models.RetryWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_withhold_planpending_ex_async(request, headers, runtime)

    def retry_withhold_planpending_ex(
        self,
        request: ato_models.RetryWithholdPlanpendingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdPlanpendingResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.planpending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_withhold_planpending_ex_async(
        self,
        request: ato_models.RetryWithholdPlanpendingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdPlanpendingResponse:
        """
        Description: 重试pending状态的代扣计划
        Summary: 重试pending状态的代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdPlanpendingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.planpending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_withhold_dividepending(
        self,
        request: ato_models.RetryWithholdDividependingRequest,
    ) -> ato_models.RetryWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_withhold_dividepending_ex(request, headers, runtime)

    async def retry_withhold_dividepending_async(
        self,
        request: ato_models.RetryWithholdDividependingRequest,
    ) -> ato_models.RetryWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_withhold_dividepending_ex_async(request, headers, runtime)

    def retry_withhold_dividepending_ex(
        self,
        request: ato_models.RetryWithholdDividependingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdDividependingResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.dividepending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_withhold_dividepending_ex_async(
        self,
        request: ato_models.RetryWithholdDividependingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdDividependingResponse:
        """
        Description: 分账pending重试
        Summary: 分账pending重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdDividependingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.dividepending.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
