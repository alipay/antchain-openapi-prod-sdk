# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_catronus import models as catronus_models
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
        config: catronus_models.Config,
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
            # fixpath
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
                    'sdk_version': '1.0.80',
                    '_prod_code': 'CATRONUS',
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
            'ignoreSSL': runtime.ignore_ssl,
            # fixpath
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
                    'sdk_version': '1.0.80',
                    '_prod_code': 'CATRONUS',
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

    def create_risk_task(
        self,
        request: catronus_models.CreateRiskTaskRequest,
    ) -> catronus_models.CreateRiskTaskResponse:
        """
        Description: 创建风险工单/任务
        Summary: 创建风险工单/任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_risk_task_ex(request, headers, runtime)

    async def create_risk_task_async(
        self,
        request: catronus_models.CreateRiskTaskRequest,
    ) -> catronus_models.CreateRiskTaskResponse:
        """
        Description: 创建风险工单/任务
        Summary: 创建风险工单/任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_risk_task_ex_async(request, headers, runtime)

    def create_risk_task_ex(
        self,
        request: catronus_models.CreateRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateRiskTaskResponse:
        """
        Description: 创建风险工单/任务
        Summary: 创建风险工单/任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_risk_task_ex_async(
        self,
        request: catronus_models.CreateRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateRiskTaskResponse:
        """
        Description: 创建风险工单/任务
        Summary: 创建风险工单/任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk_tasks(
        self,
        request: catronus_models.QueryRiskTasksRequest,
    ) -> catronus_models.QueryRiskTasksResponse:
        """
        Description: 查询风险任务列表
        Summary: 查询风险任务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_tasks_ex(request, headers, runtime)

    async def query_risk_tasks_async(
        self,
        request: catronus_models.QueryRiskTasksRequest,
    ) -> catronus_models.QueryRiskTasksResponse:
        """
        Description: 查询风险任务列表
        Summary: 查询风险任务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_tasks_ex_async(request, headers, runtime)

    def query_risk_tasks_ex(
        self,
        request: catronus_models.QueryRiskTasksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRiskTasksResponse:
        """
        Description: 查询风险任务列表
        Summary: 查询风险任务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRiskTasksResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.tasks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_tasks_ex_async(
        self,
        request: catronus_models.QueryRiskTasksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRiskTasksResponse:
        """
        Description: 查询风险任务列表
        Summary: 查询风险任务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRiskTasksResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.tasks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_risk_task(
        self,
        request: catronus_models.GetRiskTaskRequest,
    ) -> catronus_models.GetRiskTaskResponse:
        """
        Description: 获取风险更单详情
        Summary: 获取风险更单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_risk_task_ex(request, headers, runtime)

    async def get_risk_task_async(
        self,
        request: catronus_models.GetRiskTaskRequest,
    ) -> catronus_models.GetRiskTaskResponse:
        """
        Description: 获取风险更单详情
        Summary: 获取风险更单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_risk_task_ex_async(request, headers, runtime)

    def get_risk_task_ex(
        self,
        request: catronus_models.GetRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRiskTaskResponse:
        """
        Description: 获取风险更单详情
        Summary: 获取风险更单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_risk_task_ex_async(
        self,
        request: catronus_models.GetRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRiskTaskResponse:
        """
        Description: 获取风险更单详情
        Summary: 获取风险更单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_risk_task(
        self,
        request: catronus_models.UpdateRiskTaskRequest,
    ) -> catronus_models.UpdateRiskTaskResponse:
        """
        Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
        Summary: 更新风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_risk_task_ex(request, headers, runtime)

    async def update_risk_task_async(
        self,
        request: catronus_models.UpdateRiskTaskRequest,
    ) -> catronus_models.UpdateRiskTaskResponse:
        """
        Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
        Summary: 更新风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_risk_task_ex_async(request, headers, runtime)

    def update_risk_task_ex(
        self,
        request: catronus_models.UpdateRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateRiskTaskResponse:
        """
        Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
        Summary: 更新风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_risk_task_ex_async(
        self,
        request: catronus_models.UpdateRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateRiskTaskResponse:
        """
        Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
        Summary: 更新风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_risk_task(
        self,
        request: catronus_models.ConfirmRiskTaskRequest,
    ) -> catronus_models.ConfirmRiskTaskResponse:
        """
        Description: 确认风险工单
        Summary: 确认风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_risk_task_ex(request, headers, runtime)

    async def confirm_risk_task_async(
        self,
        request: catronus_models.ConfirmRiskTaskRequest,
    ) -> catronus_models.ConfirmRiskTaskResponse:
        """
        Description: 确认风险工单
        Summary: 确认风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_risk_task_ex_async(request, headers, runtime)

    def confirm_risk_task_ex(
        self,
        request: catronus_models.ConfirmRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ConfirmRiskTaskResponse:
        """
        Description: 确认风险工单
        Summary: 确认风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ConfirmRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_risk_task_ex_async(
        self,
        request: catronus_models.ConfirmRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ConfirmRiskTaskResponse:
        """
        Description: 确认风险工单
        Summary: 确认风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ConfirmRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_risk_task(
        self,
        request: catronus_models.CancelRiskTaskRequest,
    ) -> catronus_models.CancelRiskTaskResponse:
        """
        Description: 撤销风险工单
        Summary: 撤销风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_risk_task_ex(request, headers, runtime)

    async def cancel_risk_task_async(
        self,
        request: catronus_models.CancelRiskTaskRequest,
    ) -> catronus_models.CancelRiskTaskResponse:
        """
        Description: 撤销风险工单
        Summary: 撤销风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_risk_task_ex_async(request, headers, runtime)

    def cancel_risk_task_ex(
        self,
        request: catronus_models.CancelRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CancelRiskTaskResponse:
        """
        Description: 撤销风险工单
        Summary: 撤销风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CancelRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_risk_task_ex_async(
        self,
        request: catronus_models.CancelRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CancelRiskTaskResponse:
        """
        Description: 撤销风险工单
        Summary: 撤销风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CancelRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_risk_task(
        self,
        request: catronus_models.RefuseRiskTaskRequest,
    ) -> catronus_models.RefuseRiskTaskResponse:
        """
        Description: 驳回风险工单
        Summary: 驳回风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_risk_task_ex(request, headers, runtime)

    async def refuse_risk_task_async(
        self,
        request: catronus_models.RefuseRiskTaskRequest,
    ) -> catronus_models.RefuseRiskTaskResponse:
        """
        Description: 驳回风险工单
        Summary: 驳回风险工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_risk_task_ex_async(request, headers, runtime)

    def refuse_risk_task_ex(
        self,
        request: catronus_models.RefuseRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.RefuseRiskTaskResponse:
        """
        Description: 驳回风险工单
        Summary: 驳回风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.RefuseRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_risk_task_ex_async(
        self,
        request: catronus_models.RefuseRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.RefuseRiskTaskResponse:
        """
        Description: 驳回风险工单
        Summary: 驳回风险工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.RefuseRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_risk_task(
        self,
        request: catronus_models.VerifyRiskTaskRequest,
    ) -> catronus_models.VerifyRiskTaskResponse:
        """
        Description: 确认风险工单修复
        Summary: 确认风险工单修复
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_risk_task_ex(request, headers, runtime)

    async def verify_risk_task_async(
        self,
        request: catronus_models.VerifyRiskTaskRequest,
    ) -> catronus_models.VerifyRiskTaskResponse:
        """
        Description: 确认风险工单修复
        Summary: 确认风险工单修复
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_risk_task_ex_async(request, headers, runtime)

    def verify_risk_task_ex(
        self,
        request: catronus_models.VerifyRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.VerifyRiskTaskResponse:
        """
        Description: 确认风险工单修复
        Summary: 确认风险工单修复
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.VerifyRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_risk_task_ex_async(
        self,
        request: catronus_models.VerifyRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.VerifyRiskTaskResponse:
        """
        Description: 确认风险工单修复
        Summary: 确认风险工单修复
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.VerifyRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_risk_task(
        self,
        request: catronus_models.SendRiskTaskRequest,
    ) -> catronus_models.SendRiskTaskResponse:
        """
        Description: 转派工单负责人
        Summary: 转派工单负责人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_risk_task_ex(request, headers, runtime)

    async def send_risk_task_async(
        self,
        request: catronus_models.SendRiskTaskRequest,
    ) -> catronus_models.SendRiskTaskResponse:
        """
        Description: 转派工单负责人
        Summary: 转派工单负责人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_risk_task_ex_async(request, headers, runtime)

    def send_risk_task_ex(
        self,
        request: catronus_models.SendRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.SendRiskTaskResponse:
        """
        Description: 转派工单负责人
        Summary: 转派工单负责人
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.SendRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_risk_task_ex_async(
        self,
        request: catronus_models.SendRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.SendRiskTaskResponse:
        """
        Description: 转派工单负责人
        Summary: 转派工单负责人
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.SendRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_risk_task(
        self,
        request: catronus_models.CloseRiskTaskRequest,
    ) -> catronus_models.CloseRiskTaskResponse:
        """
        Description: 确认风险工单修复，待安全Owner确认
        Summary: 确认风险工单修复
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_risk_task_ex(request, headers, runtime)

    async def close_risk_task_async(
        self,
        request: catronus_models.CloseRiskTaskRequest,
    ) -> catronus_models.CloseRiskTaskResponse:
        """
        Description: 确认风险工单修复，待安全Owner确认
        Summary: 确认风险工单修复
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_risk_task_ex_async(request, headers, runtime)

    def close_risk_task_ex(
        self,
        request: catronus_models.CloseRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CloseRiskTaskResponse:
        """
        Description: 确认风险工单修复，待安全Owner确认
        Summary: 确认风险工单修复
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CloseRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_risk_task_ex_async(
        self,
        request: catronus_models.CloseRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CloseRiskTaskResponse:
        """
        Description: 确认风险工单修复，待安全Owner确认
        Summary: 确认风险工单修复
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CloseRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_risk_statistics(
        self,
        request: catronus_models.GetRiskStatisticsRequest,
    ) -> catronus_models.GetRiskStatisticsResponse:
        """
        Description: 获取个人风险项统计
        Summary: 获取个人风险项统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_risk_statistics_ex(request, headers, runtime)

    async def get_risk_statistics_async(
        self,
        request: catronus_models.GetRiskStatisticsRequest,
    ) -> catronus_models.GetRiskStatisticsResponse:
        """
        Description: 获取个人风险项统计
        Summary: 获取个人风险项统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_risk_statistics_ex_async(request, headers, runtime)

    def get_risk_statistics_ex(
        self,
        request: catronus_models.GetRiskStatisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRiskStatisticsResponse:
        """
        Description: 获取个人风险项统计
        Summary: 获取个人风险项统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRiskStatisticsResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.statistics.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_risk_statistics_ex_async(
        self,
        request: catronus_models.GetRiskStatisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRiskStatisticsResponse:
        """
        Description: 获取个人风险项统计
        Summary: 获取个人风险项统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRiskStatisticsResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.statistics.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk_audits(
        self,
        request: catronus_models.QueryRiskAuditsRequest,
    ) -> catronus_models.QueryRiskAuditsResponse:
        """
        Description: 查询风险日志审计
        Summary: 查询风险日志审计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_audits_ex(request, headers, runtime)

    async def query_risk_audits_async(
        self,
        request: catronus_models.QueryRiskAuditsRequest,
    ) -> catronus_models.QueryRiskAuditsResponse:
        """
        Description: 查询风险日志审计
        Summary: 查询风险日志审计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_audits_ex_async(request, headers, runtime)

    def query_risk_audits_ex(
        self,
        request: catronus_models.QueryRiskAuditsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRiskAuditsResponse:
        """
        Description: 查询风险日志审计
        Summary: 查询风险日志审计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRiskAuditsResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.audits.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_audits_ex_async(
        self,
        request: catronus_models.QueryRiskAuditsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRiskAuditsResponse:
        """
        Description: 查询风险日志审计
        Summary: 查询风险日志审计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRiskAuditsResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.audits.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_risk_solution(
        self,
        request: catronus_models.CreateRiskSolutionRequest,
    ) -> catronus_models.CreateRiskSolutionResponse:
        """
        Description: 创建风险解决方案
        Summary: 创建风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_risk_solution_ex(request, headers, runtime)

    async def create_risk_solution_async(
        self,
        request: catronus_models.CreateRiskSolutionRequest,
    ) -> catronus_models.CreateRiskSolutionResponse:
        """
        Description: 创建风险解决方案
        Summary: 创建风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_risk_solution_ex_async(request, headers, runtime)

    def create_risk_solution_ex(
        self,
        request: catronus_models.CreateRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateRiskSolutionResponse:
        """
        Description: 创建风险解决方案
        Summary: 创建风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateRiskSolutionResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.solution.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_risk_solution_ex_async(
        self,
        request: catronus_models.CreateRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateRiskSolutionResponse:
        """
        Description: 创建风险解决方案
        Summary: 创建风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateRiskSolutionResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.solution.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk_solutions(
        self,
        request: catronus_models.QueryRiskSolutionsRequest,
    ) -> catronus_models.QueryRiskSolutionsResponse:
        """
        Description: 查询风险解决方案列表
        Summary: 查询风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_solutions_ex(request, headers, runtime)

    async def query_risk_solutions_async(
        self,
        request: catronus_models.QueryRiskSolutionsRequest,
    ) -> catronus_models.QueryRiskSolutionsResponse:
        """
        Description: 查询风险解决方案列表
        Summary: 查询风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_solutions_ex_async(request, headers, runtime)

    def query_risk_solutions_ex(
        self,
        request: catronus_models.QueryRiskSolutionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRiskSolutionsResponse:
        """
        Description: 查询风险解决方案列表
        Summary: 查询风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRiskSolutionsResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.solutions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_solutions_ex_async(
        self,
        request: catronus_models.QueryRiskSolutionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRiskSolutionsResponse:
        """
        Description: 查询风险解决方案列表
        Summary: 查询风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRiskSolutionsResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.solutions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_risk_solution(
        self,
        request: catronus_models.GetRiskSolutionRequest,
    ) -> catronus_models.GetRiskSolutionResponse:
        """
        Description: 获取风险解决方案详情
        Summary: 获取风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_risk_solution_ex(request, headers, runtime)

    async def get_risk_solution_async(
        self,
        request: catronus_models.GetRiskSolutionRequest,
    ) -> catronus_models.GetRiskSolutionResponse:
        """
        Description: 获取风险解决方案详情
        Summary: 获取风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_risk_solution_ex_async(request, headers, runtime)

    def get_risk_solution_ex(
        self,
        request: catronus_models.GetRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRiskSolutionResponse:
        """
        Description: 获取风险解决方案详情
        Summary: 获取风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRiskSolutionResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.solution.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_risk_solution_ex_async(
        self,
        request: catronus_models.GetRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRiskSolutionResponse:
        """
        Description: 获取风险解决方案详情
        Summary: 获取风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRiskSolutionResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.solution.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_risk_solution(
        self,
        request: catronus_models.UpdateRiskSolutionRequest,
    ) -> catronus_models.UpdateRiskSolutionResponse:
        """
        Description: 更新风险解决方案
        Summary: 更新风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_risk_solution_ex(request, headers, runtime)

    async def update_risk_solution_async(
        self,
        request: catronus_models.UpdateRiskSolutionRequest,
    ) -> catronus_models.UpdateRiskSolutionResponse:
        """
        Description: 更新风险解决方案
        Summary: 更新风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_risk_solution_ex_async(request, headers, runtime)

    def update_risk_solution_ex(
        self,
        request: catronus_models.UpdateRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateRiskSolutionResponse:
        """
        Description: 更新风险解决方案
        Summary: 更新风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateRiskSolutionResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.solution.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_risk_solution_ex_async(
        self,
        request: catronus_models.UpdateRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateRiskSolutionResponse:
        """
        Description: 更新风险解决方案
        Summary: 更新风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateRiskSolutionResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.solution.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_risk_solution(
        self,
        request: catronus_models.DeleteRiskSolutionRequest,
    ) -> catronus_models.DeleteRiskSolutionResponse:
        """
        Description: 删除风险解决方案
        Summary: 删除风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_risk_solution_ex(request, headers, runtime)

    async def delete_risk_solution_async(
        self,
        request: catronus_models.DeleteRiskSolutionRequest,
    ) -> catronus_models.DeleteRiskSolutionResponse:
        """
        Description: 删除风险解决方案
        Summary: 删除风险解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_risk_solution_ex_async(request, headers, runtime)

    def delete_risk_solution_ex(
        self,
        request: catronus_models.DeleteRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteRiskSolutionResponse:
        """
        Description: 删除风险解决方案
        Summary: 删除风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteRiskSolutionResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.solution.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_risk_solution_ex_async(
        self,
        request: catronus_models.DeleteRiskSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteRiskSolutionResponse:
        """
        Description: 删除风险解决方案
        Summary: 删除风险解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteRiskSolutionResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.solution.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_cluster(
        self,
        request: catronus_models.ImportClusterRequest,
    ) -> catronus_models.ImportClusterResponse:
        """
        Description: 纳管目标k8s集群
        Summary: 导入（纳管）集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_cluster_ex(request, headers, runtime)

    async def import_cluster_async(
        self,
        request: catronus_models.ImportClusterRequest,
    ) -> catronus_models.ImportClusterResponse:
        """
        Description: 纳管目标k8s集群
        Summary: 导入（纳管）集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_cluster_ex_async(request, headers, runtime)

    def import_cluster_ex(
        self,
        request: catronus_models.ImportClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ImportClusterResponse:
        """
        Description: 纳管目标k8s集群
        Summary: 导入（纳管）集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ImportClusterResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_cluster_ex_async(
        self,
        request: catronus_models.ImportClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ImportClusterResponse:
        """
        Description: 纳管目标k8s集群
        Summary: 导入（纳管）集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ImportClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_cluster(
        self,
        request: catronus_models.AddClusterRequest,
    ) -> catronus_models.AddClusterResponse:
        """
        Description: 手动新增集群
        Summary: 手动新增集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_cluster_ex(request, headers, runtime)

    async def add_cluster_async(
        self,
        request: catronus_models.AddClusterRequest,
    ) -> catronus_models.AddClusterResponse:
        """
        Description: 手动新增集群
        Summary: 手动新增集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_cluster_ex_async(request, headers, runtime)

    def add_cluster_ex(
        self,
        request: catronus_models.AddClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.AddClusterResponse:
        """
        Description: 手动新增集群
        Summary: 手动新增集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.AddClusterResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_cluster_ex_async(
        self,
        request: catronus_models.AddClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.AddClusterResponse:
        """
        Description: 手动新增集群
        Summary: 手动新增集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.AddClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster(
        self,
        request: catronus_models.QueryClusterRequest,
    ) -> catronus_models.QueryClusterResponse:
        """
        Description: 查询集群
        Summary: 查询集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_ex(request, headers, runtime)

    async def query_cluster_async(
        self,
        request: catronus_models.QueryClusterRequest,
    ) -> catronus_models.QueryClusterResponse:
        """
        Description: 查询集群
        Summary: 查询集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_ex_async(request, headers, runtime)

    def query_cluster_ex(
        self,
        request: catronus_models.QueryClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterResponse:
        """
        Description: 查询集群
        Summary: 查询集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_ex_async(
        self,
        request: catronus_models.QueryClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterResponse:
        """
        Description: 查询集群
        Summary: 查询集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_namespace(
        self,
        request: catronus_models.QueryClusterNamespaceRequest,
    ) -> catronus_models.QueryClusterNamespaceResponse:
        """
        Description: 查询集群namespace
        Summary: 查询集群namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_namespace_ex(request, headers, runtime)

    async def query_cluster_namespace_async(
        self,
        request: catronus_models.QueryClusterNamespaceRequest,
    ) -> catronus_models.QueryClusterNamespaceResponse:
        """
        Description: 查询集群namespace
        Summary: 查询集群namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_namespace_ex_async(request, headers, runtime)

    def query_cluster_namespace_ex(
        self,
        request: catronus_models.QueryClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterNamespaceResponse:
        """
        Description: 查询集群namespace
        Summary: 查询集群namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterNamespaceResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.namespace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_namespace_ex_async(
        self,
        request: catronus_models.QueryClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterNamespaceResponse:
        """
        Description: 查询集群namespace
        Summary: 查询集群namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.namespace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reclaim_cluster(
        self,
        request: catronus_models.ReclaimClusterRequest,
    ) -> catronus_models.ReclaimClusterResponse:
        """
        Description: 解绑集群
        Summary: 解绑集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reclaim_cluster_ex(request, headers, runtime)

    async def reclaim_cluster_async(
        self,
        request: catronus_models.ReclaimClusterRequest,
    ) -> catronus_models.ReclaimClusterResponse:
        """
        Description: 解绑集群
        Summary: 解绑集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reclaim_cluster_ex_async(request, headers, runtime)

    def reclaim_cluster_ex(
        self,
        request: catronus_models.ReclaimClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ReclaimClusterResponse:
        """
        Description: 解绑集群
        Summary: 解绑集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ReclaimClusterResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.reclaim', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reclaim_cluster_ex_async(
        self,
        request: catronus_models.ReclaimClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ReclaimClusterResponse:
        """
        Description: 解绑集群
        Summary: 解绑集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ReclaimClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.reclaim', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_brief(
        self,
        request: catronus_models.QueryClusterBriefRequest,
    ) -> catronus_models.QueryClusterBriefResponse:
        """
        Description: 获取集群安全简报列表
        Summary: 获取集群安全简报列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_brief_ex(request, headers, runtime)

    async def query_cluster_brief_async(
        self,
        request: catronus_models.QueryClusterBriefRequest,
    ) -> catronus_models.QueryClusterBriefResponse:
        """
        Description: 获取集群安全简报列表
        Summary: 获取集群安全简报列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_brief_ex_async(request, headers, runtime)

    def query_cluster_brief_ex(
        self,
        request: catronus_models.QueryClusterBriefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterBriefResponse:
        """
        Description: 获取集群安全简报列表
        Summary: 获取集群安全简报列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterBriefResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.brief.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_brief_ex_async(
        self,
        request: catronus_models.QueryClusterBriefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterBriefResponse:
        """
        Description: 获取集群安全简报列表
        Summary: 获取集群安全简报列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterBriefResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.brief.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_strategy_default(
        self,
        request: catronus_models.GetStrategyDefaultRequest,
    ) -> catronus_models.GetStrategyDefaultResponse:
        """
        Description: 获取默认策略
        Summary: 获取默认策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_strategy_default_ex(request, headers, runtime)

    async def get_strategy_default_async(
        self,
        request: catronus_models.GetStrategyDefaultRequest,
    ) -> catronus_models.GetStrategyDefaultResponse:
        """
        Description: 获取默认策略
        Summary: 获取默认策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_strategy_default_ex_async(request, headers, runtime)

    def get_strategy_default_ex(
        self,
        request: catronus_models.GetStrategyDefaultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetStrategyDefaultResponse:
        """
        Description: 获取默认策略
        Summary: 获取默认策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetStrategyDefaultResponse(),
            self.do_request('1.0', 'antcloud.catronus.strategy.default.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_strategy_default_ex_async(
        self,
        request: catronus_models.GetStrategyDefaultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetStrategyDefaultResponse:
        """
        Description: 获取默认策略
        Summary: 获取默认策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetStrategyDefaultResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.strategy.default.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_strategy(
        self,
        request: catronus_models.AddStrategyRequest,
    ) -> catronus_models.AddStrategyResponse:
        """
        Description: 设置安全策略
        Summary: 设置安全策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_strategy_ex(request, headers, runtime)

    async def add_strategy_async(
        self,
        request: catronus_models.AddStrategyRequest,
    ) -> catronus_models.AddStrategyResponse:
        """
        Description: 设置安全策略
        Summary: 设置安全策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_strategy_ex_async(request, headers, runtime)

    def add_strategy_ex(
        self,
        request: catronus_models.AddStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.AddStrategyResponse:
        """
        Description: 设置安全策略
        Summary: 设置安全策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.AddStrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.strategy.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_strategy_ex_async(
        self,
        request: catronus_models.AddStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.AddStrategyResponse:
        """
        Description: 设置安全策略
        Summary: 设置安全策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.AddStrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.strategy.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_strategy(
        self,
        request: catronus_models.BindStrategyRequest,
    ) -> catronus_models.BindStrategyResponse:
        """
        Description: 绑定集群
        Summary: 绑定集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_strategy_ex(request, headers, runtime)

    async def bind_strategy_async(
        self,
        request: catronus_models.BindStrategyRequest,
    ) -> catronus_models.BindStrategyResponse:
        """
        Description: 绑定集群
        Summary: 绑定集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_strategy_ex_async(request, headers, runtime)

    def bind_strategy_ex(
        self,
        request: catronus_models.BindStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.BindStrategyResponse:
        """
        Description: 绑定集群
        Summary: 绑定集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.BindStrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.strategy.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_strategy_ex_async(
        self,
        request: catronus_models.BindStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.BindStrategyResponse:
        """
        Description: 绑定集群
        Summary: 绑定集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.BindStrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.strategy.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risks(
        self,
        request: catronus_models.QueryRisksRequest,
    ) -> catronus_models.QueryRisksResponse:
        """
        Description: 风险列表
        Summary: 风险列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risks_ex(request, headers, runtime)

    async def query_risks_async(
        self,
        request: catronus_models.QueryRisksRequest,
    ) -> catronus_models.QueryRisksResponse:
        """
        Description: 风险列表
        Summary: 风险列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risks_ex_async(request, headers, runtime)

    def query_risks_ex(
        self,
        request: catronus_models.QueryRisksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRisksResponse:
        """
        Description: 风险列表
        Summary: 风险列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRisksResponse(),
            self.do_request('1.0', 'antcloud.catronus.risks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risks_ex_async(
        self,
        request: catronus_models.QueryRisksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryRisksResponse:
        """
        Description: 风险列表
        Summary: 风险列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryRisksResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_strategy(
        self,
        request: catronus_models.UpdateStrategyRequest,
    ) -> catronus_models.UpdateStrategyResponse:
        """
        Description: 更新策略
        Summary: 更新策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_strategy_ex(request, headers, runtime)

    async def update_strategy_async(
        self,
        request: catronus_models.UpdateStrategyRequest,
    ) -> catronus_models.UpdateStrategyResponse:
        """
        Description: 更新策略
        Summary: 更新策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_strategy_ex_async(request, headers, runtime)

    def update_strategy_ex(
        self,
        request: catronus_models.UpdateStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateStrategyResponse:
        """
        Description: 更新策略
        Summary: 更新策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateStrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_strategy_ex_async(
        self,
        request: catronus_models.UpdateStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateStrategyResponse:
        """
        Description: 更新策略
        Summary: 更新策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateStrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_strategy(
        self,
        request: catronus_models.QueryStrategyRequest,
    ) -> catronus_models.QueryStrategyResponse:
        """
        Description: 拉策略列表
        Summary: 拉策略列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_strategy_ex(request, headers, runtime)

    async def query_strategy_async(
        self,
        request: catronus_models.QueryStrategyRequest,
    ) -> catronus_models.QueryStrategyResponse:
        """
        Description: 拉策略列表
        Summary: 拉策略列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_strategy_ex_async(request, headers, runtime)

    def query_strategy_ex(
        self,
        request: catronus_models.QueryStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryStrategyResponse:
        """
        Description: 拉策略列表
        Summary: 拉策略列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryStrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.strategy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_strategy_ex_async(
        self,
        request: catronus_models.QueryStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryStrategyResponse:
        """
        Description: 拉策略列表
        Summary: 拉策略列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryStrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.strategy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scale_risk_task(
        self,
        request: catronus_models.ScaleRiskTaskRequest,
    ) -> catronus_models.ScaleRiskTaskResponse:
        """
        Description: 风险任务延期
        Summary: 风险任务延期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scale_risk_task_ex(request, headers, runtime)

    async def scale_risk_task_async(
        self,
        request: catronus_models.ScaleRiskTaskRequest,
    ) -> catronus_models.ScaleRiskTaskResponse:
        """
        Description: 风险任务延期
        Summary: 风险任务延期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scale_risk_task_ex_async(request, headers, runtime)

    def scale_risk_task_ex(
        self,
        request: catronus_models.ScaleRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ScaleRiskTaskResponse:
        """
        Description: 风险任务延期
        Summary: 风险任务延期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ScaleRiskTaskResponse(),
            self.do_request('1.0', 'antcloud.catronus.risk.task.scale', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scale_risk_task_ex_async(
        self,
        request: catronus_models.ScaleRiskTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ScaleRiskTaskResponse:
        """
        Description: 风险任务延期
        Summary: 风险任务延期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ScaleRiskTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.risk.task.scale', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_images(
        self,
        request: catronus_models.ListClusterImagesRequest,
    ) -> catronus_models.ListClusterImagesResponse:
        """
        Description: 查询集群镜像列表
        Summary: 查询集群镜像列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_images_ex(request, headers, runtime)

    async def list_cluster_images_async(
        self,
        request: catronus_models.ListClusterImagesRequest,
    ) -> catronus_models.ListClusterImagesResponse:
        """
        Description: 查询集群镜像列表
        Summary: 查询集群镜像列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_images_ex_async(request, headers, runtime)

    def list_cluster_images_ex(
        self,
        request: catronus_models.ListClusterImagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListClusterImagesResponse:
        """
        Description: 查询集群镜像列表
        Summary: 查询集群镜像列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListClusterImagesResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.images.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_images_ex_async(
        self,
        request: catronus_models.ListClusterImagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListClusterImagesResponse:
        """
        Description: 查询集群镜像列表
        Summary: 查询集群镜像列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListClusterImagesResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.images.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_cluster_quickscan(
        self,
        request: catronus_models.StartClusterQuickscanRequest,
    ) -> catronus_models.StartClusterQuickscanResponse:
        """
        Description: 主动触发快速扫描
        Summary: 主动触发快速扫描
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_cluster_quickscan_ex(request, headers, runtime)

    async def start_cluster_quickscan_async(
        self,
        request: catronus_models.StartClusterQuickscanRequest,
    ) -> catronus_models.StartClusterQuickscanResponse:
        """
        Description: 主动触发快速扫描
        Summary: 主动触发快速扫描
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_cluster_quickscan_ex_async(request, headers, runtime)

    def start_cluster_quickscan_ex(
        self,
        request: catronus_models.StartClusterQuickscanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.StartClusterQuickscanResponse:
        """
        Description: 主动触发快速扫描
        Summary: 主动触发快速扫描
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.StartClusterQuickscanResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.quickscan.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_cluster_quickscan_ex_async(
        self,
        request: catronus_models.StartClusterQuickscanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.StartClusterQuickscanResponse:
        """
        Description: 主动触发快速扫描
        Summary: 主动触发快速扫描
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.StartClusterQuickscanResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.quickscan.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_scan(
        self,
        request: catronus_models.QueryClusterScanRequest,
    ) -> catronus_models.QueryClusterScanResponse:
        """
        Description: 查询扫描结果
        Summary: 查询扫描结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_scan_ex(request, headers, runtime)

    async def query_cluster_scan_async(
        self,
        request: catronus_models.QueryClusterScanRequest,
    ) -> catronus_models.QueryClusterScanResponse:
        """
        Description: 查询扫描结果
        Summary: 查询扫描结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_scan_ex_async(request, headers, runtime)

    def query_cluster_scan_ex(
        self,
        request: catronus_models.QueryClusterScanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterScanResponse:
        """
        Description: 查询扫描结果
        Summary: 查询扫描结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterScanResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.scan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_scan_ex_async(
        self,
        request: catronus_models.QueryClusterScanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterScanResponse:
        """
        Description: 查询扫描结果
        Summary: 查询扫描结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterScanResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.scan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_runtime_policy(
        self,
        request: catronus_models.CreateRuntimePolicyRequest,
    ) -> catronus_models.CreateRuntimePolicyResponse:
        """
        Description: 创建运行时策略
        Summary: 创建运行时策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_runtime_policy_ex(request, headers, runtime)

    async def create_runtime_policy_async(
        self,
        request: catronus_models.CreateRuntimePolicyRequest,
    ) -> catronus_models.CreateRuntimePolicyResponse:
        """
        Description: 创建运行时策略
        Summary: 创建运行时策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_runtime_policy_ex_async(request, headers, runtime)

    def create_runtime_policy_ex(
        self,
        request: catronus_models.CreateRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateRuntimePolicyResponse:
        """
        Description: 创建运行时策略
        Summary: 创建运行时策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateRuntimePolicyResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtime.policy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_runtime_policy_ex_async(
        self,
        request: catronus_models.CreateRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateRuntimePolicyResponse:
        """
        Description: 创建运行时策略
        Summary: 创建运行时策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateRuntimePolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtime.policy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_runtime_policies(
        self,
        request: catronus_models.ListRuntimePoliciesRequest,
    ) -> catronus_models.ListRuntimePoliciesResponse:
        """
        Description: 查询运行时策略列表
        Summary: 查询运行时策略列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_runtime_policies_ex(request, headers, runtime)

    async def list_runtime_policies_async(
        self,
        request: catronus_models.ListRuntimePoliciesRequest,
    ) -> catronus_models.ListRuntimePoliciesResponse:
        """
        Description: 查询运行时策略列表
        Summary: 查询运行时策略列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_runtime_policies_ex_async(request, headers, runtime)

    def list_runtime_policies_ex(
        self,
        request: catronus_models.ListRuntimePoliciesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListRuntimePoliciesResponse:
        """
        Description: 查询运行时策略列表
        Summary: 查询运行时策略列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListRuntimePoliciesResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtime.policies.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_runtime_policies_ex_async(
        self,
        request: catronus_models.ListRuntimePoliciesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListRuntimePoliciesResponse:
        """
        Description: 查询运行时策略列表
        Summary: 查询运行时策略列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListRuntimePoliciesResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtime.policies.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_runtime_policy(
        self,
        request: catronus_models.UpdateRuntimePolicyRequest,
    ) -> catronus_models.UpdateRuntimePolicyResponse:
        """
        Description: 更新运行时策略
        Summary: 更新运行时策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_runtime_policy_ex(request, headers, runtime)

    async def update_runtime_policy_async(
        self,
        request: catronus_models.UpdateRuntimePolicyRequest,
    ) -> catronus_models.UpdateRuntimePolicyResponse:
        """
        Description: 更新运行时策略
        Summary: 更新运行时策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_runtime_policy_ex_async(request, headers, runtime)

    def update_runtime_policy_ex(
        self,
        request: catronus_models.UpdateRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateRuntimePolicyResponse:
        """
        Description: 更新运行时策略
        Summary: 更新运行时策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateRuntimePolicyResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtime.policy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_runtime_policy_ex_async(
        self,
        request: catronus_models.UpdateRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateRuntimePolicyResponse:
        """
        Description: 更新运行时策略
        Summary: 更新运行时策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateRuntimePolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtime.policy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_runtime_policy(
        self,
        request: catronus_models.DeleteRuntimePolicyRequest,
    ) -> catronus_models.DeleteRuntimePolicyResponse:
        """
        Description: 删除运行时策略
        Summary: 删除运行时策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_runtime_policy_ex(request, headers, runtime)

    async def delete_runtime_policy_async(
        self,
        request: catronus_models.DeleteRuntimePolicyRequest,
    ) -> catronus_models.DeleteRuntimePolicyResponse:
        """
        Description: 删除运行时策略
        Summary: 删除运行时策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_runtime_policy_ex_async(request, headers, runtime)

    def delete_runtime_policy_ex(
        self,
        request: catronus_models.DeleteRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteRuntimePolicyResponse:
        """
        Description: 删除运行时策略
        Summary: 删除运行时策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteRuntimePolicyResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtime.policy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_runtime_policy_ex_async(
        self,
        request: catronus_models.DeleteRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteRuntimePolicyResponse:
        """
        Description: 删除运行时策略
        Summary: 删除运行时策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteRuntimePolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtime.policy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_runtimepolicy_pods(
        self,
        request: catronus_models.ListRuntimepolicyPodsRequest,
    ) -> catronus_models.ListRuntimepolicyPodsResponse:
        """
        Description: 获取运行时策略目标Pods
        Summary: 获取运行时策略Pods
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_runtimepolicy_pods_ex(request, headers, runtime)

    async def list_runtimepolicy_pods_async(
        self,
        request: catronus_models.ListRuntimepolicyPodsRequest,
    ) -> catronus_models.ListRuntimepolicyPodsResponse:
        """
        Description: 获取运行时策略目标Pods
        Summary: 获取运行时策略Pods
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_runtimepolicy_pods_ex_async(request, headers, runtime)

    def list_runtimepolicy_pods_ex(
        self,
        request: catronus_models.ListRuntimepolicyPodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListRuntimepolicyPodsResponse:
        """
        Description: 获取运行时策略目标Pods
        Summary: 获取运行时策略Pods
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListRuntimepolicyPodsResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtimepolicy.pods.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_runtimepolicy_pods_ex_async(
        self,
        request: catronus_models.ListRuntimepolicyPodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListRuntimepolicyPodsResponse:
        """
        Description: 获取运行时策略目标Pods
        Summary: 获取运行时策略Pods
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListRuntimepolicyPodsResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtimepolicy.pods.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_runtimepolicy_nodes(
        self,
        request: catronus_models.ListRuntimepolicyNodesRequest,
    ) -> catronus_models.ListRuntimepolicyNodesResponse:
        """
        Description: 获取运行时策略Nodes
        Summary: 获取运行时策略Nodes
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_runtimepolicy_nodes_ex(request, headers, runtime)

    async def list_runtimepolicy_nodes_async(
        self,
        request: catronus_models.ListRuntimepolicyNodesRequest,
    ) -> catronus_models.ListRuntimepolicyNodesResponse:
        """
        Description: 获取运行时策略Nodes
        Summary: 获取运行时策略Nodes
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_runtimepolicy_nodes_ex_async(request, headers, runtime)

    def list_runtimepolicy_nodes_ex(
        self,
        request: catronus_models.ListRuntimepolicyNodesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListRuntimepolicyNodesResponse:
        """
        Description: 获取运行时策略Nodes
        Summary: 获取运行时策略Nodes
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListRuntimepolicyNodesResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtimepolicy.nodes.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_runtimepolicy_nodes_ex_async(
        self,
        request: catronus_models.ListRuntimepolicyNodesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.ListRuntimepolicyNodesResponse:
        """
        Description: 获取运行时策略Nodes
        Summary: 获取运行时策略Nodes
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.ListRuntimepolicyNodesResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtimepolicy.nodes.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_runtime_policy(
        self,
        request: catronus_models.GetRuntimePolicyRequest,
    ) -> catronus_models.GetRuntimePolicyResponse:
        """
        Description: 获取运行时策略详情
        Summary: 获取运行时策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_runtime_policy_ex(request, headers, runtime)

    async def get_runtime_policy_async(
        self,
        request: catronus_models.GetRuntimePolicyRequest,
    ) -> catronus_models.GetRuntimePolicyResponse:
        """
        Description: 获取运行时策略详情
        Summary: 获取运行时策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_runtime_policy_ex_async(request, headers, runtime)

    def get_runtime_policy_ex(
        self,
        request: catronus_models.GetRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRuntimePolicyResponse:
        """
        Description: 获取运行时策略详情
        Summary: 获取运行时策略详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRuntimePolicyResponse(),
            self.do_request('1.0', 'antcloud.catronus.runtime.policy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_runtime_policy_ex_async(
        self,
        request: catronus_models.GetRuntimePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetRuntimePolicyResponse:
        """
        Description: 获取运行时策略详情
        Summary: 获取运行时策略详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetRuntimePolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.runtime.policy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_baseline(
        self,
        request: catronus_models.QueryClusterBaselineRequest,
    ) -> catronus_models.QueryClusterBaselineResponse:
        """
        Description: 基线扫描结果查询
        Summary: 基线扫描结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_baseline_ex(request, headers, runtime)

    async def query_cluster_baseline_async(
        self,
        request: catronus_models.QueryClusterBaselineRequest,
    ) -> catronus_models.QueryClusterBaselineResponse:
        """
        Description: 基线扫描结果查询
        Summary: 基线扫描结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_baseline_ex_async(request, headers, runtime)

    def query_cluster_baseline_ex(
        self,
        request: catronus_models.QueryClusterBaselineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterBaselineResponse:
        """
        Description: 基线扫描结果查询
        Summary: 基线扫描结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterBaselineResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.baseline.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_baseline_ex_async(
        self,
        request: catronus_models.QueryClusterBaselineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryClusterBaselineResponse:
        """
        Description: 基线扫描结果查询
        Summary: 基线扫描结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryClusterBaselineResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.baseline.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_images_reposcan(
        self,
        request: catronus_models.SubmitImagesReposcanRequest,
    ) -> catronus_models.SubmitImagesReposcanResponse:
        """
        Description: 提交镜像扫描触发任务
        Summary: 提交镜像扫描触发任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_images_reposcan_ex(request, headers, runtime)

    async def submit_images_reposcan_async(
        self,
        request: catronus_models.SubmitImagesReposcanRequest,
    ) -> catronus_models.SubmitImagesReposcanResponse:
        """
        Description: 提交镜像扫描触发任务
        Summary: 提交镜像扫描触发任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_images_reposcan_ex_async(request, headers, runtime)

    def submit_images_reposcan_ex(
        self,
        request: catronus_models.SubmitImagesReposcanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.SubmitImagesReposcanResponse:
        """
        Description: 提交镜像扫描触发任务
        Summary: 提交镜像扫描触发任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.SubmitImagesReposcanResponse(),
            self.do_request('1.0', 'antcloud.catronus.images.reposcan.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_images_reposcan_ex_async(
        self,
        request: catronus_models.SubmitImagesReposcanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.SubmitImagesReposcanResponse:
        """
        Description: 提交镜像扫描触发任务
        Summary: 提交镜像扫描触发任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.SubmitImagesReposcanResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.images.reposcan.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_image_repo(
        self,
        request: catronus_models.CreateImageRepoRequest,
    ) -> catronus_models.CreateImageRepoResponse:
        """
        Description: 创建镜像仓库
        Summary: 创建镜像仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_image_repo_ex(request, headers, runtime)

    async def create_image_repo_async(
        self,
        request: catronus_models.CreateImageRepoRequest,
    ) -> catronus_models.CreateImageRepoResponse:
        """
        Description: 创建镜像仓库
        Summary: 创建镜像仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_image_repo_ex_async(request, headers, runtime)

    def create_image_repo_ex(
        self,
        request: catronus_models.CreateImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateImageRepoResponse:
        """
        Description: 创建镜像仓库
        Summary: 创建镜像仓库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateImageRepoResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.repo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_image_repo_ex_async(
        self,
        request: catronus_models.CreateImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateImageRepoResponse:
        """
        Description: 创建镜像仓库
        Summary: 创建镜像仓库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateImageRepoResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.repo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_image_repos(
        self,
        request: catronus_models.QueryImageReposRequest,
    ) -> catronus_models.QueryImageReposResponse:
        """
        Description: 查询镜像仓库列表
        Summary: 查询镜像仓库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_image_repos_ex(request, headers, runtime)

    async def query_image_repos_async(
        self,
        request: catronus_models.QueryImageReposRequest,
    ) -> catronus_models.QueryImageReposResponse:
        """
        Description: 查询镜像仓库列表
        Summary: 查询镜像仓库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_image_repos_ex_async(request, headers, runtime)

    def query_image_repos_ex(
        self,
        request: catronus_models.QueryImageReposRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImageReposResponse:
        """
        Description: 查询镜像仓库列表
        Summary: 查询镜像仓库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImageReposResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.repos.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_image_repos_ex_async(
        self,
        request: catronus_models.QueryImageReposRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImageReposResponse:
        """
        Description: 查询镜像仓库列表
        Summary: 查询镜像仓库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImageReposResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.repos.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_image_repo(
        self,
        request: catronus_models.DeleteImageRepoRequest,
    ) -> catronus_models.DeleteImageRepoResponse:
        """
        Description: 删除镜像仓库
        Summary: 删除镜像仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_image_repo_ex(request, headers, runtime)

    async def delete_image_repo_async(
        self,
        request: catronus_models.DeleteImageRepoRequest,
    ) -> catronus_models.DeleteImageRepoResponse:
        """
        Description: 删除镜像仓库
        Summary: 删除镜像仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_image_repo_ex_async(request, headers, runtime)

    def delete_image_repo_ex(
        self,
        request: catronus_models.DeleteImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteImageRepoResponse:
        """
        Description: 删除镜像仓库
        Summary: 删除镜像仓库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteImageRepoResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.repo.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_image_repo_ex_async(
        self,
        request: catronus_models.DeleteImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteImageRepoResponse:
        """
        Description: 删除镜像仓库
        Summary: 删除镜像仓库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteImageRepoResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.repo.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_image_riskdetailurl(
        self,
        request: catronus_models.GetImageRiskdetailurlRequest,
    ) -> catronus_models.GetImageRiskdetailurlResponse:
        """
        Description: 获取镜像漏洞详情地址
        Summary: 获取镜像漏洞详情地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_image_riskdetailurl_ex(request, headers, runtime)

    async def get_image_riskdetailurl_async(
        self,
        request: catronus_models.GetImageRiskdetailurlRequest,
    ) -> catronus_models.GetImageRiskdetailurlResponse:
        """
        Description: 获取镜像漏洞详情地址
        Summary: 获取镜像漏洞详情地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_image_riskdetailurl_ex_async(request, headers, runtime)

    def get_image_riskdetailurl_ex(
        self,
        request: catronus_models.GetImageRiskdetailurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetImageRiskdetailurlResponse:
        """
        Description: 获取镜像漏洞详情地址
        Summary: 获取镜像漏洞详情地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetImageRiskdetailurlResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.riskdetailurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_image_riskdetailurl_ex_async(
        self,
        request: catronus_models.GetImageRiskdetailurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetImageRiskdetailurlResponse:
        """
        Description: 获取镜像漏洞详情地址
        Summary: 获取镜像漏洞详情地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetImageRiskdetailurlResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.riskdetailurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_image_reposcanstrategy(
        self,
        request: catronus_models.CreateImageReposcanstrategyRequest,
    ) -> catronus_models.CreateImageReposcanstrategyResponse:
        """
        Description: 创建镜像仓库扫描策略
        Summary: 创建镜像仓库扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_image_reposcanstrategy_ex(request, headers, runtime)

    async def create_image_reposcanstrategy_async(
        self,
        request: catronus_models.CreateImageReposcanstrategyRequest,
    ) -> catronus_models.CreateImageReposcanstrategyResponse:
        """
        Description: 创建镜像仓库扫描策略
        Summary: 创建镜像仓库扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_image_reposcanstrategy_ex_async(request, headers, runtime)

    def create_image_reposcanstrategy_ex(
        self,
        request: catronus_models.CreateImageReposcanstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateImageReposcanstrategyResponse:
        """
        Description: 创建镜像仓库扫描策略
        Summary: 创建镜像仓库扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateImageReposcanstrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.reposcanstrategy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_image_reposcanstrategy_ex_async(
        self,
        request: catronus_models.CreateImageReposcanstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.CreateImageReposcanstrategyResponse:
        """
        Description: 创建镜像仓库扫描策略
        Summary: 创建镜像仓库扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.CreateImageReposcanstrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.reposcanstrategy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_imagerepo_projects(
        self,
        request: catronus_models.QueryImagerepoProjectsRequest,
    ) -> catronus_models.QueryImagerepoProjectsResponse:
        """
        Description: 查询仓库项目列表
        Summary: 查询仓库项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_imagerepo_projects_ex(request, headers, runtime)

    async def query_imagerepo_projects_async(
        self,
        request: catronus_models.QueryImagerepoProjectsRequest,
    ) -> catronus_models.QueryImagerepoProjectsResponse:
        """
        Description: 查询仓库项目列表
        Summary: 查询仓库项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_imagerepo_projects_ex_async(request, headers, runtime)

    def query_imagerepo_projects_ex(
        self,
        request: catronus_models.QueryImagerepoProjectsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImagerepoProjectsResponse:
        """
        Description: 查询仓库项目列表
        Summary: 查询仓库项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImagerepoProjectsResponse(),
            self.do_request('1.0', 'antcloud.catronus.imagerepo.projects.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_imagerepo_projects_ex_async(
        self,
        request: catronus_models.QueryImagerepoProjectsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImagerepoProjectsResponse:
        """
        Description: 查询仓库项目列表
        Summary: 查询仓库项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImagerepoProjectsResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.imagerepo.projects.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_imagerepo_repositories(
        self,
        request: catronus_models.QueryImagerepoRepositoriesRequest,
    ) -> catronus_models.QueryImagerepoRepositoriesResponse:
        """
        Description: 查询仓库列表
        Summary: 查询仓库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_imagerepo_repositories_ex(request, headers, runtime)

    async def query_imagerepo_repositories_async(
        self,
        request: catronus_models.QueryImagerepoRepositoriesRequest,
    ) -> catronus_models.QueryImagerepoRepositoriesResponse:
        """
        Description: 查询仓库列表
        Summary: 查询仓库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_imagerepo_repositories_ex_async(request, headers, runtime)

    def query_imagerepo_repositories_ex(
        self,
        request: catronus_models.QueryImagerepoRepositoriesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImagerepoRepositoriesResponse:
        """
        Description: 查询仓库列表
        Summary: 查询仓库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImagerepoRepositoriesResponse(),
            self.do_request('1.0', 'antcloud.catronus.imagerepo.repositories.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_imagerepo_repositories_ex_async(
        self,
        request: catronus_models.QueryImagerepoRepositoriesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImagerepoRepositoriesResponse:
        """
        Description: 查询仓库列表
        Summary: 查询仓库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImagerepoRepositoriesResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.imagerepo.repositories.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_image_repo(
        self,
        request: catronus_models.UpdateImageRepoRequest,
    ) -> catronus_models.UpdateImageRepoResponse:
        """
        Description: 更新镜像仓库
        Summary: 更新镜像仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_image_repo_ex(request, headers, runtime)

    async def update_image_repo_async(
        self,
        request: catronus_models.UpdateImageRepoRequest,
    ) -> catronus_models.UpdateImageRepoResponse:
        """
        Description: 更新镜像仓库
        Summary: 更新镜像仓库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_image_repo_ex_async(request, headers, runtime)

    def update_image_repo_ex(
        self,
        request: catronus_models.UpdateImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateImageRepoResponse:
        """
        Description: 更新镜像仓库
        Summary: 更新镜像仓库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateImageRepoResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.repo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_image_repo_ex_async(
        self,
        request: catronus_models.UpdateImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateImageRepoResponse:
        """
        Description: 更新镜像仓库
        Summary: 更新镜像仓库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateImageRepoResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.repo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_image_repo(
        self,
        request: catronus_models.GetImageRepoRequest,
    ) -> catronus_models.GetImageRepoResponse:
        """
        Description: 获取镜像仓库详情
        Summary: 获取镜像仓库详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_image_repo_ex(request, headers, runtime)

    async def get_image_repo_async(
        self,
        request: catronus_models.GetImageRepoRequest,
    ) -> catronus_models.GetImageRepoResponse:
        """
        Description: 获取镜像仓库详情
        Summary: 获取镜像仓库详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_image_repo_ex_async(request, headers, runtime)

    def get_image_repo_ex(
        self,
        request: catronus_models.GetImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetImageRepoResponse:
        """
        Description: 获取镜像仓库详情
        Summary: 获取镜像仓库详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetImageRepoResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.repo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_image_repo_ex_async(
        self,
        request: catronus_models.GetImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.GetImageRepoResponse:
        """
        Description: 获取镜像仓库详情
        Summary: 获取镜像仓库详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.GetImageRepoResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.repo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_image_repo(
        self,
        request: catronus_models.VerifyImageRepoRequest,
    ) -> catronus_models.VerifyImageRepoResponse:
        """
        Description: 校验仓库配置
        Summary: 校验仓库配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_image_repo_ex(request, headers, runtime)

    async def verify_image_repo_async(
        self,
        request: catronus_models.VerifyImageRepoRequest,
    ) -> catronus_models.VerifyImageRepoResponse:
        """
        Description: 校验仓库配置
        Summary: 校验仓库配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_image_repo_ex_async(request, headers, runtime)

    def verify_image_repo_ex(
        self,
        request: catronus_models.VerifyImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.VerifyImageRepoResponse:
        """
        Description: 校验仓库配置
        Summary: 校验仓库配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.VerifyImageRepoResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.repo.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_image_repo_ex_async(
        self,
        request: catronus_models.VerifyImageRepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.VerifyImageRepoResponse:
        """
        Description: 校验仓库配置
        Summary: 校验仓库配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.VerifyImageRepoResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.repo.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_image_reposcanstrategies(
        self,
        request: catronus_models.QueryImageReposcanstrategiesRequest,
    ) -> catronus_models.QueryImageReposcanstrategiesResponse:
        """
        Description: 查询镜像扫描策略
        Summary: 查询镜像扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_image_reposcanstrategies_ex(request, headers, runtime)

    async def query_image_reposcanstrategies_async(
        self,
        request: catronus_models.QueryImageReposcanstrategiesRequest,
    ) -> catronus_models.QueryImageReposcanstrategiesResponse:
        """
        Description: 查询镜像扫描策略
        Summary: 查询镜像扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_image_reposcanstrategies_ex_async(request, headers, runtime)

    def query_image_reposcanstrategies_ex(
        self,
        request: catronus_models.QueryImageReposcanstrategiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImageReposcanstrategiesResponse:
        """
        Description: 查询镜像扫描策略
        Summary: 查询镜像扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImageReposcanstrategiesResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.reposcanstrategies.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_image_reposcanstrategies_ex_async(
        self,
        request: catronus_models.QueryImageReposcanstrategiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.QueryImageReposcanstrategiesResponse:
        """
        Description: 查询镜像扫描策略
        Summary: 查询镜像扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.QueryImageReposcanstrategiesResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.reposcanstrategies.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_image_reposcanstrategy(
        self,
        request: catronus_models.DeleteImageReposcanstrategyRequest,
    ) -> catronus_models.DeleteImageReposcanstrategyResponse:
        """
        Description: 删除镜像扫描策略
        Summary: 删除镜像扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_image_reposcanstrategy_ex(request, headers, runtime)

    async def delete_image_reposcanstrategy_async(
        self,
        request: catronus_models.DeleteImageReposcanstrategyRequest,
    ) -> catronus_models.DeleteImageReposcanstrategyResponse:
        """
        Description: 删除镜像扫描策略
        Summary: 删除镜像扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_image_reposcanstrategy_ex_async(request, headers, runtime)

    def delete_image_reposcanstrategy_ex(
        self,
        request: catronus_models.DeleteImageReposcanstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteImageReposcanstrategyResponse:
        """
        Description: 删除镜像扫描策略
        Summary: 删除镜像扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteImageReposcanstrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.reposcanstrategy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_image_reposcanstrategy_ex_async(
        self,
        request: catronus_models.DeleteImageReposcanstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.DeleteImageReposcanstrategyResponse:
        """
        Description: 删除镜像扫描策略
        Summary: 删除镜像扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.DeleteImageReposcanstrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.reposcanstrategy.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_image_reposcanstrategy(
        self,
        request: catronus_models.UpdateImageReposcanstrategyRequest,
    ) -> catronus_models.UpdateImageReposcanstrategyResponse:
        """
        Description: 更新镜像仓库扫描策略
        Summary: 更新镜像仓库扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_image_reposcanstrategy_ex(request, headers, runtime)

    async def update_image_reposcanstrategy_async(
        self,
        request: catronus_models.UpdateImageReposcanstrategyRequest,
    ) -> catronus_models.UpdateImageReposcanstrategyResponse:
        """
        Description: 更新镜像仓库扫描策略
        Summary: 更新镜像仓库扫描策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_image_reposcanstrategy_ex_async(request, headers, runtime)

    def update_image_reposcanstrategy_ex(
        self,
        request: catronus_models.UpdateImageReposcanstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateImageReposcanstrategyResponse:
        """
        Description: 更新镜像仓库扫描策略
        Summary: 更新镜像仓库扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateImageReposcanstrategyResponse(),
            self.do_request('1.0', 'antcloud.catronus.image.reposcanstrategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_image_reposcanstrategy_ex_async(
        self,
        request: catronus_models.UpdateImageReposcanstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.UpdateImageReposcanstrategyResponse:
        """
        Description: 更新镜像仓库扫描策略
        Summary: 更新镜像仓库扫描策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.UpdateImageReposcanstrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.image.reposcanstrategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_cluster_baseline(
        self,
        request: catronus_models.SkipClusterBaselineRequest,
    ) -> catronus_models.SkipClusterBaselineResponse:
        """
        Description: 忽略某个baseline风险
        Summary: 忽略某个baseline风险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_cluster_baseline_ex(request, headers, runtime)

    async def skip_cluster_baseline_async(
        self,
        request: catronus_models.SkipClusterBaselineRequest,
    ) -> catronus_models.SkipClusterBaselineResponse:
        """
        Description: 忽略某个baseline风险
        Summary: 忽略某个baseline风险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_cluster_baseline_ex_async(request, headers, runtime)

    def skip_cluster_baseline_ex(
        self,
        request: catronus_models.SkipClusterBaselineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.SkipClusterBaselineResponse:
        """
        Description: 忽略某个baseline风险
        Summary: 忽略某个baseline风险
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.SkipClusterBaselineResponse(),
            self.do_request('1.0', 'antcloud.catronus.cluster.baseline.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_cluster_baseline_ex_async(
        self,
        request: catronus_models.SkipClusterBaselineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> catronus_models.SkipClusterBaselineResponse:
        """
        Description: 忽略某个baseline风险
        Summary: 忽略某个baseline风险
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            catronus_models.SkipClusterBaselineResponse(),
            await self.do_request_async('1.0', 'antcloud.catronus.cluster.baseline.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
