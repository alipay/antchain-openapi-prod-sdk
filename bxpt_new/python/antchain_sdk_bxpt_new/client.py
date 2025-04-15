# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_bxpt_new import models as bxpt__new_models
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
        config: bxpt__new_models.Config,
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
                    'sdk_version': '1.2.21',
                    '_prod_code': 'BXPT_NEW',
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
                    'sdk_version': '1.2.21',
                    '_prod_code': 'BXPT_NEW',
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

    def exec_dataproduct(
        self,
        request: bxpt__new_models.ExecDataproductRequest,
    ) -> bxpt__new_models.ExecDataproductResponse:
        """
        Description: 保险数据产品服务调用
        Summary: 保险数据产品服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_dataproduct_ex(request, headers, runtime)

    async def exec_dataproduct_async(
        self,
        request: bxpt__new_models.ExecDataproductRequest,
    ) -> bxpt__new_models.ExecDataproductResponse:
        """
        Description: 保险数据产品服务调用
        Summary: 保险数据产品服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_dataproduct_ex_async(request, headers, runtime)

    def exec_dataproduct_ex(
        self,
        request: bxpt__new_models.ExecDataproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.ExecDataproductResponse:
        """
        Description: 保险数据产品服务调用
        Summary: 保险数据产品服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.ExecDataproductResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.dataproduct.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_dataproduct_ex_async(
        self,
        request: bxpt__new_models.ExecDataproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.ExecDataproductResponse:
        """
        Description: 保险数据产品服务调用
        Summary: 保险数据产品服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.ExecDataproductResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.dataproduct.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_dataproduct_async(
        self,
        request: bxpt__new_models.ExecDataproductAsyncRequest,
    ) -> bxpt__new_models.ExecDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步调用
        Summary: 保险数据产品服务异步调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_dataproduct_async_ex(request, headers, runtime)

    async def exec_dataproduct_async_async(
        self,
        request: bxpt__new_models.ExecDataproductAsyncRequest,
    ) -> bxpt__new_models.ExecDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步调用
        Summary: 保险数据产品服务异步调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_dataproduct_async_ex_async(request, headers, runtime)

    def exec_dataproduct_async_ex(
        self,
        request: bxpt__new_models.ExecDataproductAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.ExecDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步调用
        Summary: 保险数据产品服务异步调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.ExecDataproductAsyncResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.dataproduct.async.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_dataproduct_async_ex_async(
        self,
        request: bxpt__new_models.ExecDataproductAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.ExecDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步调用
        Summary: 保险数据产品服务异步调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.ExecDataproductAsyncResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.dataproduct.async.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dataproduct_async(
        self,
        request: bxpt__new_models.QueryDataproductAsyncRequest,
    ) -> bxpt__new_models.QueryDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步结果查询
        Summary: 保险数据产品服务异步结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dataproduct_async_ex(request, headers, runtime)

    async def query_dataproduct_async_async(
        self,
        request: bxpt__new_models.QueryDataproductAsyncRequest,
    ) -> bxpt__new_models.QueryDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步结果查询
        Summary: 保险数据产品服务异步结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dataproduct_async_ex_async(request, headers, runtime)

    def query_dataproduct_async_ex(
        self,
        request: bxpt__new_models.QueryDataproductAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.QueryDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步结果查询
        Summary: 保险数据产品服务异步结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.QueryDataproductAsyncResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.dataproduct.async.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dataproduct_async_ex_async(
        self,
        request: bxpt__new_models.QueryDataproductAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.QueryDataproductAsyncResponse:
        """
        Description: 保险数据产品服务异步结果查询
        Summary: 保险数据产品服务异步结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.QueryDataproductAsyncResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.dataproduct.async.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_drrdata_subscription(
        self,
        request: bxpt__new_models.SubmitDrrdataSubscriptionRequest,
    ) -> bxpt__new_models.SubmitDrrdataSubscriptionResponse:
        """
        Description: 退运险物理轨迹订阅提交
        Summary: 退运险物理轨迹订阅提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_drrdata_subscription_ex(request, headers, runtime)

    async def submit_drrdata_subscription_async(
        self,
        request: bxpt__new_models.SubmitDrrdataSubscriptionRequest,
    ) -> bxpt__new_models.SubmitDrrdataSubscriptionResponse:
        """
        Description: 退运险物理轨迹订阅提交
        Summary: 退运险物理轨迹订阅提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_drrdata_subscription_ex_async(request, headers, runtime)

    def submit_drrdata_subscription_ex(
        self,
        request: bxpt__new_models.SubmitDrrdataSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.SubmitDrrdataSubscriptionResponse:
        """
        Description: 退运险物理轨迹订阅提交
        Summary: 退运险物理轨迹订阅提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.SubmitDrrdataSubscriptionResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.drrdata.subscription.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_drrdata_subscription_ex_async(
        self,
        request: bxpt__new_models.SubmitDrrdataSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.SubmitDrrdataSubscriptionResponse:
        """
        Description: 退运险物理轨迹订阅提交
        Summary: 退运险物理轨迹订阅提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.SubmitDrrdataSubscriptionResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.drrdata.subscription.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_drrdata_track(
        self,
        request: bxpt__new_models.ReceiveDrrdataTrackRequest,
    ) -> bxpt__new_models.ReceiveDrrdataTrackResponse:
        """
        Description: 退运险物理轨迹数据接收
        Summary: 退运险物理轨迹数据接收
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_drrdata_track_ex(request, headers, runtime)

    async def receive_drrdata_track_async(
        self,
        request: bxpt__new_models.ReceiveDrrdataTrackRequest,
    ) -> bxpt__new_models.ReceiveDrrdataTrackResponse:
        """
        Description: 退运险物理轨迹数据接收
        Summary: 退运险物理轨迹数据接收
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_drrdata_track_ex_async(request, headers, runtime)

    def receive_drrdata_track_ex(
        self,
        request: bxpt__new_models.ReceiveDrrdataTrackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.ReceiveDrrdataTrackResponse:
        """
        Description: 退运险物理轨迹数据接收
        Summary: 退运险物理轨迹数据接收
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.ReceiveDrrdataTrackResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.drrdata.track.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_drrdata_track_ex_async(
        self,
        request: bxpt__new_models.ReceiveDrrdataTrackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.ReceiveDrrdataTrackResponse:
        """
        Description: 退运险物理轨迹数据接收
        Summary: 退运险物理轨迹数据接收
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.ReceiveDrrdataTrackResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.drrdata.track.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_drrdata_riafd(
        self,
        request: bxpt__new_models.QueryDrrdataRiafdRequest,
    ) -> bxpt__new_models.QueryDrrdataRiafdResponse:
        """
        Description: 退运险反欺诈服务api
        Summary: 退运险反欺诈服务api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_drrdata_riafd_ex(request, headers, runtime)

    async def query_drrdata_riafd_async(
        self,
        request: bxpt__new_models.QueryDrrdataRiafdRequest,
    ) -> bxpt__new_models.QueryDrrdataRiafdResponse:
        """
        Description: 退运险反欺诈服务api
        Summary: 退运险反欺诈服务api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_drrdata_riafd_ex_async(request, headers, runtime)

    def query_drrdata_riafd_ex(
        self,
        request: bxpt__new_models.QueryDrrdataRiafdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.QueryDrrdataRiafdResponse:
        """
        Description: 退运险反欺诈服务api
        Summary: 退运险反欺诈服务api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.QueryDrrdataRiafdResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.drrdata.riafd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_drrdata_riafd_ex_async(
        self,
        request: bxpt__new_models.QueryDrrdataRiafdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.QueryDrrdataRiafdResponse:
        """
        Description: 退运险反欺诈服务api
        Summary: 退运险反欺诈服务api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.QueryDrrdataRiafdResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.drrdata.riafd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_datapromotion_decision(
        self,
        request: bxpt__new_models.QueryDatapromotionDecisionRequest,
    ) -> bxpt__new_models.QueryDatapromotionDecisionResponse:
        """
        Description: 保险数据营销决策查询
        Summary: 保险数据营销决策查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_datapromotion_decision_ex(request, headers, runtime)

    async def query_datapromotion_decision_async(
        self,
        request: bxpt__new_models.QueryDatapromotionDecisionRequest,
    ) -> bxpt__new_models.QueryDatapromotionDecisionResponse:
        """
        Description: 保险数据营销决策查询
        Summary: 保险数据营销决策查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_datapromotion_decision_ex_async(request, headers, runtime)

    def query_datapromotion_decision_ex(
        self,
        request: bxpt__new_models.QueryDatapromotionDecisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.QueryDatapromotionDecisionResponse:
        """
        Description: 保险数据营销决策查询
        Summary: 保险数据营销决策查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.QueryDatapromotionDecisionResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.datapromotion.decision.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_datapromotion_decision_ex_async(
        self,
        request: bxpt__new_models.QueryDatapromotionDecisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.QueryDatapromotionDecisionResponse:
        """
        Description: 保险数据营销决策查询
        Summary: 保险数据营销决策查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.QueryDatapromotionDecisionResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.datapromotion.decision.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_datapromotion_traffic(
        self,
        request: bxpt__new_models.PushDatapromotionTrafficRequest,
    ) -> bxpt__new_models.PushDatapromotionTrafficResponse:
        """
        Description: 保险数据营销流量推送
        Summary: 保险数据营销流量推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_datapromotion_traffic_ex(request, headers, runtime)

    async def push_datapromotion_traffic_async(
        self,
        request: bxpt__new_models.PushDatapromotionTrafficRequest,
    ) -> bxpt__new_models.PushDatapromotionTrafficResponse:
        """
        Description: 保险数据营销流量推送
        Summary: 保险数据营销流量推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_datapromotion_traffic_ex_async(request, headers, runtime)

    def push_datapromotion_traffic_ex(
        self,
        request: bxpt__new_models.PushDatapromotionTrafficRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.PushDatapromotionTrafficResponse:
        """
        Description: 保险数据营销流量推送
        Summary: 保险数据营销流量推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.PushDatapromotionTrafficResponse(),
            self.do_request('1.0', 'antcloud.bxptnew.datapromotion.traffic.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_datapromotion_traffic_ex_async(
        self,
        request: bxpt__new_models.PushDatapromotionTrafficRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bxpt__new_models.PushDatapromotionTrafficResponse:
        """
        Description: 保险数据营销流量推送
        Summary: 保险数据营销流量推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bxpt__new_models.PushDatapromotionTrafficResponse(),
            await self.do_request_async('1.0', 'antcloud.bxptnew.datapromotion.traffic.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
