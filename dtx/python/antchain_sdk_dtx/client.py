# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_dtx import models as dtx_models
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
        config: dtx_models.Config,
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
            # 进行中事务数统计
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
                    'sdk_version': '1.0.166',
                    '_prod_code': 'DTX',
                    '_prod_channel': 'undefined'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'prodapigw-sofastack.cloud.alipay.com'),
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
            # 进行中事务数统计
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
                    'sdk_version': '1.0.166',
                    '_prod_code': 'DTX',
                    '_prod_channel': 'undefined'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'prodapigw-sofastack.cloud.alipay.com'),
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

    def create_apps(
        self,
        request: dtx_models.CreateAppsRequest,
    ) -> dtx_models.CreateAppsResponse:
        """
        Description: 创建应用
        Summary: 创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apps_ex(request, headers, runtime)

    async def create_apps_async(
        self,
        request: dtx_models.CreateAppsRequest,
    ) -> dtx_models.CreateAppsResponse:
        """
        Description: 创建应用
        Summary: 创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apps_ex_async(request, headers, runtime)

    def create_apps_ex(
        self,
        request: dtx_models.CreateAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsResponse:
        """
        Description: 创建应用
        Summary: 创建应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apps_ex_async(
        self,
        request: dtx_models.CreateAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsResponse:
        """
        Description: 创建应用
        Summary: 创建应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_recovery_initiators(
        self,
        request: dtx_models.CreateRecoveryInitiatorsRequest,
    ) -> dtx_models.CreateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入，新增发起方配置
        Summary: 发起方接入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_recovery_initiators_ex(request, headers, runtime)

    async def create_recovery_initiators_async(
        self,
        request: dtx_models.CreateRecoveryInitiatorsRequest,
    ) -> dtx_models.CreateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入，新增发起方配置
        Summary: 发起方接入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_recovery_initiators_ex_async(request, headers, runtime)

    def create_recovery_initiators_ex(
        self,
        request: dtx_models.CreateRecoveryInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入，新增发起方配置
        Summary: 发起方接入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateRecoveryInitiatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.initiators.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_recovery_initiators_ex_async(
        self,
        request: dtx_models.CreateRecoveryInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入，新增发起方配置
        Summary: 发起方接入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateRecoveryInitiatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.initiators.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_apps_stats(
        self,
        request: dtx_models.CountAppsStatsRequest,
    ) -> dtx_models.CountAppsStatsResponse:
        """
        Description: 根据app获取事务概览统计
        Summary: 获取bizType事务概览统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_apps_stats_ex(request, headers, runtime)

    async def count_apps_stats_async(
        self,
        request: dtx_models.CountAppsStatsRequest,
    ) -> dtx_models.CountAppsStatsResponse:
        """
        Description: 根据app获取事务概览统计
        Summary: 获取bizType事务概览统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_apps_stats_ex_async(request, headers, runtime)

    def count_apps_stats_ex(
        self,
        request: dtx_models.CountAppsStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CountAppsStatsResponse:
        """
        Description: 根据app获取事务概览统计
        Summary: 获取bizType事务概览统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CountAppsStatsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.stats.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_apps_stats_ex_async(
        self,
        request: dtx_models.CountAppsStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CountAppsStatsResponse:
        """
        Description: 根据app获取事务概览统计
        Summary: 获取bizType事务概览统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CountAppsStatsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.stats.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apps_biztypes(
        self,
        request: dtx_models.ListAppsBiztypesRequest,
    ) -> dtx_models.ListAppsBiztypesResponse:
        """
        Description: 获取bizType列表
        Summary: 获取bizType列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apps_biztypes_ex(request, headers, runtime)

    async def list_apps_biztypes_async(
        self,
        request: dtx_models.ListAppsBiztypesRequest,
    ) -> dtx_models.ListAppsBiztypesResponse:
        """
        Description: 获取bizType列表
        Summary: 获取bizType列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apps_biztypes_ex_async(request, headers, runtime)

    def list_apps_biztypes_ex(
        self,
        request: dtx_models.ListAppsBiztypesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListAppsBiztypesResponse:
        """
        Description: 获取bizType列表
        Summary: 获取bizType列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListAppsBiztypesResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.biztypes.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apps_biztypes_ex_async(
        self,
        request: dtx_models.ListAppsBiztypesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListAppsBiztypesResponse:
        """
        Description: 获取bizType列表
        Summary: 获取bizType列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListAppsBiztypesResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.biztypes.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_apps_configs(
        self,
        request: dtx_models.ExportAppsConfigsRequest,
    ) -> dtx_models.ExportAppsConfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 导出配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_apps_configs_ex(request, headers, runtime)

    async def export_apps_configs_async(
        self,
        request: dtx_models.ExportAppsConfigsRequest,
    ) -> dtx_models.ExportAppsConfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 导出配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_apps_configs_ex_async(request, headers, runtime)

    def export_apps_configs_ex(
        self,
        request: dtx_models.ExportAppsConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExportAppsConfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 导出配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExportAppsConfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.configs.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_apps_configs_ex_async(
        self,
        request: dtx_models.ExportAppsConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExportAppsConfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 导出配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExportAppsConfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.configs.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_apps_appnames(
        self,
        request: dtx_models.AllAppsAppnamesRequest,
    ) -> dtx_models.AllAppsAppnamesResponse:
        """
        Description: 获取应用名（app_name）列表
        Summary: 获取应用名（app_name）列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_apps_appnames_ex(request, headers, runtime)

    async def all_apps_appnames_async(
        self,
        request: dtx_models.AllAppsAppnamesRequest,
    ) -> dtx_models.AllAppsAppnamesResponse:
        """
        Description: 获取应用名（app_name）列表
        Summary: 获取应用名（app_name）列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_apps_appnames_ex_async(request, headers, runtime)

    def all_apps_appnames_ex(
        self,
        request: dtx_models.AllAppsAppnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllAppsAppnamesResponse:
        """
        Description: 获取应用名（app_name）列表
        Summary: 获取应用名（app_name）列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllAppsAppnamesResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.appnames.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_apps_appnames_ex_async(
        self,
        request: dtx_models.AllAppsAppnamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllAppsAppnamesResponse:
        """
        Description: 获取应用名（app_name）列表
        Summary: 获取应用名（app_name）列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllAppsAppnamesResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.appnames.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apps(
        self,
        request: dtx_models.ListAppsRequest,
    ) -> dtx_models.ListAppsResponse:
        """
        Description: 应用事务列表，分页
        Summary: 应用事务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apps_ex(request, headers, runtime)

    async def list_apps_async(
        self,
        request: dtx_models.ListAppsRequest,
    ) -> dtx_models.ListAppsResponse:
        """
        Description: 应用事务列表，分页
        Summary: 应用事务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apps_ex_async(request, headers, runtime)

    def list_apps_ex(
        self,
        request: dtx_models.ListAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListAppsResponse:
        """
        Description: 应用事务列表，分页
        Summary: 应用事务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListAppsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apps_ex_async(
        self,
        request: dtx_models.ListAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListAppsResponse:
        """
        Description: 应用事务列表，分页
        Summary: 应用事务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListAppsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_recovery_participators(
        self,
        request: dtx_models.GetRecoveryParticipatorsRequest,
    ) -> dtx_models.GetRecoveryParticipatorsResponse:
        """
        Description: 单个参与者详情
        Summary: 单个参与者详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_recovery_participators_ex(request, headers, runtime)

    async def get_recovery_participators_async(
        self,
        request: dtx_models.GetRecoveryParticipatorsRequest,
    ) -> dtx_models.GetRecoveryParticipatorsResponse:
        """
        Description: 单个参与者详情
        Summary: 单个参与者详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_recovery_participators_ex_async(request, headers, runtime)

    def get_recovery_participators_ex(
        self,
        request: dtx_models.GetRecoveryParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetRecoveryParticipatorsResponse:
        """
        Description: 单个参与者详情
        Summary: 单个参与者详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetRecoveryParticipatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.participators.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_recovery_participators_ex_async(
        self,
        request: dtx_models.GetRecoveryParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetRecoveryParticipatorsResponse:
        """
        Description: 单个参与者详情
        Summary: 单个参与者详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetRecoveryParticipatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.participators.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_apps_configs(
        self,
        request: dtx_models.ImportAppsConfigsRequest,
    ) -> dtx_models.ImportAppsConfigsResponse:
        """
        Description: 导出配置中需要有app、类型信息（发起方/参与者）
        Summary: 导入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_apps_configs_ex(request, headers, runtime)

    async def import_apps_configs_async(
        self,
        request: dtx_models.ImportAppsConfigsRequest,
    ) -> dtx_models.ImportAppsConfigsResponse:
        """
        Description: 导出配置中需要有app、类型信息（发起方/参与者）
        Summary: 导入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_apps_configs_ex_async(request, headers, runtime)

    def import_apps_configs_ex(
        self,
        request: dtx_models.ImportAppsConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ImportAppsConfigsResponse:
        """
        Description: 导出配置中需要有app、类型信息（发起方/参与者）
        Summary: 导入配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ImportAppsConfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.configs.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_apps_configs_ex_async(
        self,
        request: dtx_models.ImportAppsConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ImportAppsConfigsResponse:
        """
        Description: 导出配置中需要有app、类型信息（发起方/参与者）
        Summary: 导入配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ImportAppsConfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.configs.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_upload_url(
        self,
        request: dtx_models.GetUploadUrlRequest,
    ) -> dtx_models.GetUploadUrlResponse:
        """
        Description: 获取上传文件URL
        Summary: 获取上传文件URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_upload_url_ex(request, headers, runtime)

    async def get_upload_url_async(
        self,
        request: dtx_models.GetUploadUrlRequest,
    ) -> dtx_models.GetUploadUrlResponse:
        """
        Description: 获取上传文件URL
        Summary: 获取上传文件URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_upload_url_ex_async(request, headers, runtime)

    def get_upload_url_ex(
        self,
        request: dtx_models.GetUploadUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetUploadUrlResponse:
        """
        Description: 获取上传文件URL
        Summary: 获取上传文件URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetUploadUrlResponse(),
            self.do_request('1.0', 'sofa.dtx.upload.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_upload_url_ex_async(
        self,
        request: dtx_models.GetUploadUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetUploadUrlResponse:
        """
        Description: 获取上传文件URL
        Summary: 获取上传文件URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetUploadUrlResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.upload.url.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apps_biztype(
        self,
        request: dtx_models.QueryAppsBiztypeRequest,
    ) -> dtx_models.QueryAppsBiztypeResponse:
        """
        Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
        Summary: 查询bizType的调用关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apps_biztype_ex(request, headers, runtime)

    async def query_apps_biztype_async(
        self,
        request: dtx_models.QueryAppsBiztypeRequest,
    ) -> dtx_models.QueryAppsBiztypeResponse:
        """
        Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
        Summary: 查询bizType的调用关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apps_biztype_ex_async(request, headers, runtime)

    def query_apps_biztype_ex(
        self,
        request: dtx_models.QueryAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryAppsBiztypeResponse:
        """
        Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
        Summary: 查询bizType的调用关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryAppsBiztypeResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.biztype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apps_biztype_ex_async(
        self,
        request: dtx_models.QueryAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryAppsBiztypeResponse:
        """
        Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
        Summary: 查询bizType的调用关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryAppsBiztypeResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.biztype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_apps_recoverydsname(
        self,
        request: dtx_models.ListAppsRecoverydsnameRequest,
    ) -> dtx_models.ListAppsRecoverydsnameResponse:
        """
        Description: 创建发起者获取数据源
        Summary: 创建发起者获取数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_apps_recoverydsname_ex(request, headers, runtime)

    async def list_apps_recoverydsname_async(
        self,
        request: dtx_models.ListAppsRecoverydsnameRequest,
    ) -> dtx_models.ListAppsRecoverydsnameResponse:
        """
        Description: 创建发起者获取数据源
        Summary: 创建发起者获取数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_apps_recoverydsname_ex_async(request, headers, runtime)

    def list_apps_recoverydsname_ex(
        self,
        request: dtx_models.ListAppsRecoverydsnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListAppsRecoverydsnameResponse:
        """
        Description: 创建发起者获取数据源
        Summary: 创建发起者获取数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListAppsRecoverydsnameResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.recoverydsname.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_apps_recoverydsname_ex_async(
        self,
        request: dtx_models.ListAppsRecoverydsnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListAppsRecoverydsnameResponse:
        """
        Description: 创建发起者获取数据源
        Summary: 创建发起者获取数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListAppsRecoverydsnameResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.recoverydsname.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_apps_biztype(
        self,
        request: dtx_models.GetAppsBiztypeRequest,
    ) -> dtx_models.GetAppsBiztypeResponse:
        """
        Description: 单个biztype的关联关系，Saga则是状态机json定义
        Summary: 单个biztype的关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_apps_biztype_ex(request, headers, runtime)

    async def get_apps_biztype_async(
        self,
        request: dtx_models.GetAppsBiztypeRequest,
    ) -> dtx_models.GetAppsBiztypeResponse:
        """
        Description: 单个biztype的关联关系，Saga则是状态机json定义
        Summary: 单个biztype的关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_apps_biztype_ex_async(request, headers, runtime)

    def get_apps_biztype_ex(
        self,
        request: dtx_models.GetAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetAppsBiztypeResponse:
        """
        Description: 单个biztype的关联关系，Saga则是状态机json定义
        Summary: 单个biztype的关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetAppsBiztypeResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.biztype.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_apps_biztype_ex_async(
        self,
        request: dtx_models.GetAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetAppsBiztypeResponse:
        """
        Description: 单个biztype的关联关系，Saga则是状态机json定义
        Summary: 单个biztype的关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetAppsBiztypeResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.biztype.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apps_biztype(
        self,
        request: dtx_models.UpdateAppsBiztypeRequest,
    ) -> dtx_models.UpdateAppsBiztypeResponse:
        """
        Description: 事务更新
        Summary: 事务更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apps_biztype_ex(request, headers, runtime)

    async def update_apps_biztype_async(
        self,
        request: dtx_models.UpdateAppsBiztypeRequest,
    ) -> dtx_models.UpdateAppsBiztypeResponse:
        """
        Description: 事务更新
        Summary: 事务更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apps_biztype_ex_async(request, headers, runtime)

    def update_apps_biztype_ex(
        self,
        request: dtx_models.UpdateAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateAppsBiztypeResponse:
        """
        Description: 事务更新
        Summary: 事务更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateAppsBiztypeResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.biztype.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apps_biztype_ex_async(
        self,
        request: dtx_models.UpdateAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateAppsBiztypeResponse:
        """
        Description: 事务更新
        Summary: 事务更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateAppsBiztypeResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.biztype.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apps_configs(
        self,
        request: dtx_models.CreateAppsConfigsRequest,
    ) -> dtx_models.CreateAppsConfigsResponse:
        """
        Description: 新增应用配置（包括发起方和参与者）
        Summary: 新增应用配置（包括发起方和参与者）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apps_configs_ex(request, headers, runtime)

    async def create_apps_configs_async(
        self,
        request: dtx_models.CreateAppsConfigsRequest,
    ) -> dtx_models.CreateAppsConfigsResponse:
        """
        Description: 新增应用配置（包括发起方和参与者）
        Summary: 新增应用配置（包括发起方和参与者）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apps_configs_ex_async(request, headers, runtime)

    def create_apps_configs_ex(
        self,
        request: dtx_models.CreateAppsConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsConfigsResponse:
        """
        Description: 新增应用配置（包括发起方和参与者）
        Summary: 新增应用配置（包括发起方和参与者）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsConfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.configs.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apps_configs_ex_async(
        self,
        request: dtx_models.CreateAppsConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsConfigsResponse:
        """
        Description: 新增应用配置（包括发起方和参与者）
        Summary: 新增应用配置（包括发起方和参与者）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsConfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.configs.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_apps_newconfigs(
        self,
        request: dtx_models.ImportAppsNewconfigsRequest,
    ) -> dtx_models.ImportAppsNewconfigsResponse:
        """
        Description: 事务配置-导入配置
        Summary: 应用配置-导入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_apps_newconfigs_ex(request, headers, runtime)

    async def import_apps_newconfigs_async(
        self,
        request: dtx_models.ImportAppsNewconfigsRequest,
    ) -> dtx_models.ImportAppsNewconfigsResponse:
        """
        Description: 事务配置-导入配置
        Summary: 应用配置-导入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_apps_newconfigs_ex_async(request, headers, runtime)

    def import_apps_newconfigs_ex(
        self,
        request: dtx_models.ImportAppsNewconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ImportAppsNewconfigsResponse:
        """
        Description: 事务配置-导入配置
        Summary: 应用配置-导入配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ImportAppsNewconfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.newconfigs.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_apps_newconfigs_ex_async(
        self,
        request: dtx_models.ImportAppsNewconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ImportAppsNewconfigsResponse:
        """
        Description: 事务配置-导入配置
        Summary: 应用配置-导入配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ImportAppsNewconfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.newconfigs.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_apps_newconfigs(
        self,
        request: dtx_models.ExportAppsNewconfigsRequest,
    ) -> dtx_models.ExportAppsNewconfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 应用配置-导出配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_apps_newconfigs_ex(request, headers, runtime)

    async def export_apps_newconfigs_async(
        self,
        request: dtx_models.ExportAppsNewconfigsRequest,
    ) -> dtx_models.ExportAppsNewconfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 应用配置-导出配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_apps_newconfigs_ex_async(request, headers, runtime)

    def export_apps_newconfigs_ex(
        self,
        request: dtx_models.ExportAppsNewconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExportAppsNewconfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 应用配置-导出配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExportAppsNewconfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.newconfigs.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_apps_newconfigs_ex_async(
        self,
        request: dtx_models.ExportAppsNewconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExportAppsNewconfigsResponse:
        """
        Description: app+发起方/参与者 导出配置
        Summary: 应用配置-导出配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExportAppsNewconfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.newconfigs.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_tx_configs(
        self,
        request: dtx_models.ImportTxConfigsRequest,
    ) -> dtx_models.ImportTxConfigsResponse:
        """
        Description: 导出配置中需要有事务信息
        Summary: 事务配置-导入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_tx_configs_ex(request, headers, runtime)

    async def import_tx_configs_async(
        self,
        request: dtx_models.ImportTxConfigsRequest,
    ) -> dtx_models.ImportTxConfigsResponse:
        """
        Description: 导出配置中需要有事务信息
        Summary: 事务配置-导入配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_tx_configs_ex_async(request, headers, runtime)

    def import_tx_configs_ex(
        self,
        request: dtx_models.ImportTxConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ImportTxConfigsResponse:
        """
        Description: 导出配置中需要有事务信息
        Summary: 事务配置-导入配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ImportTxConfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.tx.configs.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_tx_configs_ex_async(
        self,
        request: dtx_models.ImportTxConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ImportTxConfigsResponse:
        """
        Description: 导出配置中需要有事务信息
        Summary: 事务配置-导入配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ImportTxConfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.tx.configs.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_tx_configs(
        self,
        request: dtx_models.ExportTxConfigsRequest,
    ) -> dtx_models.ExportTxConfigsResponse:
        """
        Description: 事务导出配置
        Summary: 事务配置-导出配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_tx_configs_ex(request, headers, runtime)

    async def export_tx_configs_async(
        self,
        request: dtx_models.ExportTxConfigsRequest,
    ) -> dtx_models.ExportTxConfigsResponse:
        """
        Description: 事务导出配置
        Summary: 事务配置-导出配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_tx_configs_ex_async(request, headers, runtime)

    def export_tx_configs_ex(
        self,
        request: dtx_models.ExportTxConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExportTxConfigsResponse:
        """
        Description: 事务导出配置
        Summary: 事务配置-导出配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExportTxConfigsResponse(),
            self.do_request('1.0', 'sofa.dtx.tx.configs.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_tx_configs_ex_async(
        self,
        request: dtx_models.ExportTxConfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExportTxConfigsResponse:
        """
        Description: 事务导出配置
        Summary: 事务配置-导出配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExportTxConfigsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.tx.configs.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_new_apps(
        self,
        request: dtx_models.ListNewAppsRequest,
    ) -> dtx_models.ListNewAppsResponse:
        """
        Description: 管控台1.1 应用配置列表
        Summary: 应用配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_new_apps_ex(request, headers, runtime)

    async def list_new_apps_async(
        self,
        request: dtx_models.ListNewAppsRequest,
    ) -> dtx_models.ListNewAppsResponse:
        """
        Description: 管控台1.1 应用配置列表
        Summary: 应用配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_new_apps_ex_async(request, headers, runtime)

    def list_new_apps_ex(
        self,
        request: dtx_models.ListNewAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListNewAppsResponse:
        """
        Description: 管控台1.1 应用配置列表
        Summary: 应用配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListNewAppsResponse(),
            self.do_request('1.0', 'sofa.dtx.new.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_new_apps_ex_async(
        self,
        request: dtx_models.ListNewAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListNewAppsResponse:
        """
        Description: 管控台1.1 应用配置列表
        Summary: 应用配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListNewAppsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.new.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apps_detail(
        self,
        request: dtx_models.QueryAppsDetailRequest,
    ) -> dtx_models.QueryAppsDetailResponse:
        """
        Description: 新应用详情界面
        Summary: 应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apps_detail_ex(request, headers, runtime)

    async def query_apps_detail_async(
        self,
        request: dtx_models.QueryAppsDetailRequest,
    ) -> dtx_models.QueryAppsDetailResponse:
        """
        Description: 新应用详情界面
        Summary: 应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apps_detail_ex_async(request, headers, runtime)

    def query_apps_detail_ex(
        self,
        request: dtx_models.QueryAppsDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryAppsDetailResponse:
        """
        Description: 新应用详情界面
        Summary: 应用详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryAppsDetailResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apps_detail_ex_async(
        self,
        request: dtx_models.QueryAppsDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryAppsDetailResponse:
        """
        Description: 新应用详情界面
        Summary: 应用详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryAppsDetailResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apps(
        self,
        request: dtx_models.DeleteAppsRequest,
    ) -> dtx_models.DeleteAppsResponse:
        """
        Description: 。
        Summary: 应用删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apps_ex(request, headers, runtime)

    async def delete_apps_async(
        self,
        request: dtx_models.DeleteAppsRequest,
    ) -> dtx_models.DeleteAppsResponse:
        """
        Description: 。
        Summary: 应用删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apps_ex_async(request, headers, runtime)

    def delete_apps_ex(
        self,
        request: dtx_models.DeleteAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsResponse:
        """
        Description: 。
        Summary: 应用删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apps_ex_async(
        self,
        request: dtx_models.DeleteAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsResponse:
        """
        Description: 。
        Summary: 应用删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apps_recovery(
        self,
        request: dtx_models.DeleteAppsRecoveryRequest,
    ) -> dtx_models.DeleteAppsRecoveryResponse:
        """
        Description: 发起方删除
        Summary: 发起方删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apps_recovery_ex(request, headers, runtime)

    async def delete_apps_recovery_async(
        self,
        request: dtx_models.DeleteAppsRecoveryRequest,
    ) -> dtx_models.DeleteAppsRecoveryResponse:
        """
        Description: 发起方删除
        Summary: 发起方删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apps_recovery_ex_async(request, headers, runtime)

    def delete_apps_recovery_ex(
        self,
        request: dtx_models.DeleteAppsRecoveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsRecoveryResponse:
        """
        Description: 发起方删除
        Summary: 发起方删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsRecoveryResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.recovery.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apps_recovery_ex_async(
        self,
        request: dtx_models.DeleteAppsRecoveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsRecoveryResponse:
        """
        Description: 发起方删除
        Summary: 发起方删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsRecoveryResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.recovery.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apps_action(
        self,
        request: dtx_models.DeleteAppsActionRequest,
    ) -> dtx_models.DeleteAppsActionResponse:
        """
        Description: 参与者删除
        Summary: 参与者删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apps_action_ex(request, headers, runtime)

    async def delete_apps_action_async(
        self,
        request: dtx_models.DeleteAppsActionRequest,
    ) -> dtx_models.DeleteAppsActionResponse:
        """
        Description: 参与者删除
        Summary: 参与者删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apps_action_ex_async(request, headers, runtime)

    def delete_apps_action_ex(
        self,
        request: dtx_models.DeleteAppsActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsActionResponse:
        """
        Description: 参与者删除
        Summary: 参与者删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsActionResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.action.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apps_action_ex_async(
        self,
        request: dtx_models.DeleteAppsActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsActionResponse:
        """
        Description: 参与者删除
        Summary: 参与者删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsActionResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.action.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_apps(
        self,
        request: dtx_models.BatchcreateAppsRequest,
    ) -> dtx_models.BatchcreateAppsResponse:
        """
        Description: 批量新增 app下的发起方、参与者
        Summary: 批量新增 app下的发起方、参与者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_apps_ex(request, headers, runtime)

    async def batchcreate_apps_async(
        self,
        request: dtx_models.BatchcreateAppsRequest,
    ) -> dtx_models.BatchcreateAppsResponse:
        """
        Description: 批量新增 app下的发起方、参与者
        Summary: 批量新增 app下的发起方、参与者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_apps_ex_async(request, headers, runtime)

    def batchcreate_apps_ex(
        self,
        request: dtx_models.BatchcreateAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.BatchcreateAppsResponse:
        """
        Description: 批量新增 app下的发起方、参与者
        Summary: 批量新增 app下的发起方、参与者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.BatchcreateAppsResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_apps_ex_async(
        self,
        request: dtx_models.BatchcreateAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.BatchcreateAppsResponse:
        """
        Description: 批量新增 app下的发起方、参与者
        Summary: 批量新增 app下的发起方、参与者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.BatchcreateAppsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apps_recovery(
        self,
        request: dtx_models.CreateAppsRecoveryRequest,
    ) -> dtx_models.CreateAppsRecoveryResponse:
        """
        Description: 单个发起方新增/编辑
        Summary: 单个发起方新增/编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apps_recovery_ex(request, headers, runtime)

    async def create_apps_recovery_async(
        self,
        request: dtx_models.CreateAppsRecoveryRequest,
    ) -> dtx_models.CreateAppsRecoveryResponse:
        """
        Description: 单个发起方新增/编辑
        Summary: 单个发起方新增/编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apps_recovery_ex_async(request, headers, runtime)

    def create_apps_recovery_ex(
        self,
        request: dtx_models.CreateAppsRecoveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsRecoveryResponse:
        """
        Description: 单个发起方新增/编辑
        Summary: 单个发起方新增/编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsRecoveryResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.recovery.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apps_recovery_ex_async(
        self,
        request: dtx_models.CreateAppsRecoveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsRecoveryResponse:
        """
        Description: 单个发起方新增/编辑
        Summary: 单个发起方新增/编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsRecoveryResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.recovery.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_apps_action(
        self,
        request: dtx_models.CreateAppsActionRequest,
    ) -> dtx_models.CreateAppsActionResponse:
        """
        Description: 参与者新增/编辑
        Summary: 参与者新增/编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_apps_action_ex(request, headers, runtime)

    async def create_apps_action_async(
        self,
        request: dtx_models.CreateAppsActionRequest,
    ) -> dtx_models.CreateAppsActionResponse:
        """
        Description: 参与者新增/编辑
        Summary: 参与者新增/编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_apps_action_ex_async(request, headers, runtime)

    def create_apps_action_ex(
        self,
        request: dtx_models.CreateAppsActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsActionResponse:
        """
        Description: 参与者新增/编辑
        Summary: 参与者新增/编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsActionResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.action.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_apps_action_ex_async(
        self,
        request: dtx_models.CreateAppsActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateAppsActionResponse:
        """
        Description: 参与者新增/编辑
        Summary: 参与者新增/编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateAppsActionResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.action.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_biztype_relation(
        self,
        request: dtx_models.CreateBiztypeRelationRequest,
    ) -> dtx_models.CreateBiztypeRelationResponse:
        """
        Description: 新建/编辑事务关联关系
        Summary: 新建/编辑事务关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_biztype_relation_ex(request, headers, runtime)

    async def create_biztype_relation_async(
        self,
        request: dtx_models.CreateBiztypeRelationRequest,
    ) -> dtx_models.CreateBiztypeRelationResponse:
        """
        Description: 新建/编辑事务关联关系
        Summary: 新建/编辑事务关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_biztype_relation_ex_async(request, headers, runtime)

    def create_biztype_relation_ex(
        self,
        request: dtx_models.CreateBiztypeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateBiztypeRelationResponse:
        """
        Description: 新建/编辑事务关联关系
        Summary: 新建/编辑事务关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateBiztypeRelationResponse(),
            self.do_request('1.0', 'sofa.dtx.biztype.relation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_biztype_relation_ex_async(
        self,
        request: dtx_models.CreateBiztypeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateBiztypeRelationResponse:
        """
        Description: 新建/编辑事务关联关系
        Summary: 新建/编辑事务关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateBiztypeRelationResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.biztype.relation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_apps_biztype(
        self,
        request: dtx_models.DeleteAppsBiztypeRequest,
    ) -> dtx_models.DeleteAppsBiztypeResponse:
        """
        Description: 删除biztype关联关系
        Summary: 删除biztype关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_apps_biztype_ex(request, headers, runtime)

    async def delete_apps_biztype_async(
        self,
        request: dtx_models.DeleteAppsBiztypeRequest,
    ) -> dtx_models.DeleteAppsBiztypeResponse:
        """
        Description: 删除biztype关联关系
        Summary: 删除biztype关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_apps_biztype_ex_async(request, headers, runtime)

    def delete_apps_biztype_ex(
        self,
        request: dtx_models.DeleteAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsBiztypeResponse:
        """
        Description: 删除biztype关联关系
        Summary: 删除biztype关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsBiztypeResponse(),
            self.do_request('1.0', 'sofa.dtx.apps.biztype.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_apps_biztype_ex_async(
        self,
        request: dtx_models.DeleteAppsBiztypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteAppsBiztypeResponse:
        """
        Description: 删除biztype关联关系
        Summary: 删除biztype关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteAppsBiztypeResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.apps.biztype.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_biztype_relation(
        self,
        request: dtx_models.QueryBiztypeRelationRequest,
    ) -> dtx_models.QueryBiztypeRelationResponse:
        """
        Description: 查询biztype与发起方，参与者的关联关系
        Summary: 查询biztype关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_biztype_relation_ex(request, headers, runtime)

    async def query_biztype_relation_async(
        self,
        request: dtx_models.QueryBiztypeRelationRequest,
    ) -> dtx_models.QueryBiztypeRelationResponse:
        """
        Description: 查询biztype与发起方，参与者的关联关系
        Summary: 查询biztype关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_biztype_relation_ex_async(request, headers, runtime)

    def query_biztype_relation_ex(
        self,
        request: dtx_models.QueryBiztypeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryBiztypeRelationResponse:
        """
        Description: 查询biztype与发起方，参与者的关联关系
        Summary: 查询biztype关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryBiztypeRelationResponse(),
            self.do_request('1.0', 'sofa.dtx.biztype.relation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_biztype_relation_ex_async(
        self,
        request: dtx_models.QueryBiztypeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryBiztypeRelationResponse:
        """
        Description: 查询biztype与发起方，参与者的关联关系
        Summary: 查询biztype关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryBiztypeRelationResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.biztype.relation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_transactions(
        self,
        request: dtx_models.DeleteTransactionsRequest,
    ) -> dtx_models.DeleteTransactionsResponse:
        """
        Description: 根据txid，删除进行中的事务
        Summary: 删除进行中的事务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_transactions_ex(request, headers, runtime)

    async def delete_transactions_async(
        self,
        request: dtx_models.DeleteTransactionsRequest,
    ) -> dtx_models.DeleteTransactionsResponse:
        """
        Description: 根据txid，删除进行中的事务
        Summary: 删除进行中的事务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_transactions_ex_async(request, headers, runtime)

    def delete_transactions_ex(
        self,
        request: dtx_models.DeleteTransactionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteTransactionsResponse:
        """
        Description: 根据txid，删除进行中的事务
        Summary: 删除进行中的事务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteTransactionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_transactions_ex_async(
        self,
        request: dtx_models.DeleteTransactionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteTransactionsResponse:
        """
        Description: 根据txid，删除进行中的事务
        Summary: 删除进行中的事务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteTransactionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_recovery_configuration(
        self,
        request: dtx_models.CreateRecoveryConfigurationRequest,
    ) -> dtx_models.CreateRecoveryConfigurationResponse:
        """
        Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
        Summary: 异库接入（包括发起方和参与者）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_recovery_configuration_ex(request, headers, runtime)

    async def create_recovery_configuration_async(
        self,
        request: dtx_models.CreateRecoveryConfigurationRequest,
    ) -> dtx_models.CreateRecoveryConfigurationResponse:
        """
        Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
        Summary: 异库接入（包括发起方和参与者）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_recovery_configuration_ex_async(request, headers, runtime)

    def create_recovery_configuration_ex(
        self,
        request: dtx_models.CreateRecoveryConfigurationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateRecoveryConfigurationResponse:
        """
        Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
        Summary: 异库接入（包括发起方和参与者）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateRecoveryConfigurationResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.configuration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_recovery_configuration_ex_async(
        self,
        request: dtx_models.CreateRecoveryConfigurationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateRecoveryConfigurationResponse:
        """
        Description: 异库模式下， 发起方和参与者的配置信息。
        role取值：1是发起方，2是参与者；
        activityMode取值：1是同库模式，2是异库模式；
        actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
        Summary: 异库接入（包括发起方和参与者）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateRecoveryConfigurationResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.configuration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_global_env(
        self,
        request: dtx_models.GetGlobalEnvRequest,
    ) -> dtx_models.GetGlobalEnvResponse:
        """
        Description: 获取当前环境信息，例如租户和环境
        Summary: 获取当前环境
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_global_env_ex(request, headers, runtime)

    async def get_global_env_async(
        self,
        request: dtx_models.GetGlobalEnvRequest,
    ) -> dtx_models.GetGlobalEnvResponse:
        """
        Description: 获取当前环境信息，例如租户和环境
        Summary: 获取当前环境
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_global_env_ex_async(request, headers, runtime)

    def get_global_env_ex(
        self,
        request: dtx_models.GetGlobalEnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetGlobalEnvResponse:
        """
        Description: 获取当前环境信息，例如租户和环境
        Summary: 获取当前环境
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetGlobalEnvResponse(),
            self.do_request('1.0', 'sofa.dtx.global.env.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_global_env_ex_async(
        self,
        request: dtx_models.GetGlobalEnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetGlobalEnvResponse:
        """
        Description: 获取当前环境信息，例如租户和环境
        Summary: 获取当前环境
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetGlobalEnvResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.global.env.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_middleware_instance(
        self,
        request: dtx_models.GetMiddlewareInstanceRequest,
    ) -> dtx_models.GetMiddlewareInstanceResponse:
        """
        Description: 获取instanceId
        Summary: 获取instanceId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_middleware_instance_ex(request, headers, runtime)

    async def get_middleware_instance_async(
        self,
        request: dtx_models.GetMiddlewareInstanceRequest,
    ) -> dtx_models.GetMiddlewareInstanceResponse:
        """
        Description: 获取instanceId
        Summary: 获取instanceId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_middleware_instance_ex_async(request, headers, runtime)

    def get_middleware_instance_ex(
        self,
        request: dtx_models.GetMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetMiddlewareInstanceResponse:
        """
        Description: 获取instanceId
        Summary: 获取instanceId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetMiddlewareInstanceResponse(),
            self.do_request('1.0', 'sofa.dtx.middleware.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_middleware_instance_ex_async(
        self,
        request: dtx_models.GetMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetMiddlewareInstanceResponse:
        """
        Description: 获取instanceId
        Summary: 获取instanceId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetMiddlewareInstanceResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.middleware.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_zone(
        self,
        request: dtx_models.AllZoneRequest,
    ) -> dtx_models.AllZoneResponse:
        """
        Description: 获取zone信息
        Summary: 获取zone信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_zone_ex(request, headers, runtime)

    async def all_zone_async(
        self,
        request: dtx_models.AllZoneRequest,
    ) -> dtx_models.AllZoneResponse:
        """
        Description: 获取zone信息
        Summary: 获取zone信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_zone_ex_async(request, headers, runtime)

    def all_zone_ex(
        self,
        request: dtx_models.AllZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllZoneResponse:
        """
        Description: 获取zone信息
        Summary: 获取zone信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllZoneResponse(),
            self.do_request('1.0', 'sofa.dtx.zone.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_zone_ex_async(
        self,
        request: dtx_models.AllZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllZoneResponse:
        """
        Description: 获取zone信息
        Summary: 获取zone信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllZoneResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.zone.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_recovery_initiators(
        self,
        request: dtx_models.UpdateRecoveryInitiatorsRequest,
    ) -> dtx_models.UpdateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入配置的修改
        Summary: 发起方编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_recovery_initiators_ex(request, headers, runtime)

    async def update_recovery_initiators_async(
        self,
        request: dtx_models.UpdateRecoveryInitiatorsRequest,
    ) -> dtx_models.UpdateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入配置的修改
        Summary: 发起方编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_recovery_initiators_ex_async(request, headers, runtime)

    def update_recovery_initiators_ex(
        self,
        request: dtx_models.UpdateRecoveryInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入配置的修改
        Summary: 发起方编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateRecoveryInitiatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.initiators.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_recovery_initiators_ex_async(
        self,
        request: dtx_models.UpdateRecoveryInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateRecoveryInitiatorsResponse:
        """
        Description: 发起方接入配置的修改
        Summary: 发起方编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateRecoveryInitiatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.initiators.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_biztypes_initiators(
        self,
        request: dtx_models.ListBiztypesInitiatorsRequest,
    ) -> dtx_models.ListBiztypesInitiatorsResponse:
        """
        Description: 应用作为参与者查询所有发起者
        Summary: 应用作为参与者查询所有发起者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_biztypes_initiators_ex(request, headers, runtime)

    async def list_biztypes_initiators_async(
        self,
        request: dtx_models.ListBiztypesInitiatorsRequest,
    ) -> dtx_models.ListBiztypesInitiatorsResponse:
        """
        Description: 应用作为参与者查询所有发起者
        Summary: 应用作为参与者查询所有发起者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_biztypes_initiators_ex_async(request, headers, runtime)

    def list_biztypes_initiators_ex(
        self,
        request: dtx_models.ListBiztypesInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListBiztypesInitiatorsResponse:
        """
        Description: 应用作为参与者查询所有发起者
        Summary: 应用作为参与者查询所有发起者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListBiztypesInitiatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.biztypes.initiators.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_biztypes_initiators_ex_async(
        self,
        request: dtx_models.ListBiztypesInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListBiztypesInitiatorsResponse:
        """
        Description: 应用作为参与者查询所有发起者
        Summary: 应用作为参与者查询所有发起者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListBiztypesInitiatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.biztypes.initiators.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_initiators_datasources(
        self,
        request: dtx_models.AllInitiatorsDatasourcesRequest,
    ) -> dtx_models.AllInitiatorsDatasourcesResponse:
        """
        Description: 根据app获取数据源列表
        Summary: 根据app获取数据源列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_initiators_datasources_ex(request, headers, runtime)

    async def all_initiators_datasources_async(
        self,
        request: dtx_models.AllInitiatorsDatasourcesRequest,
    ) -> dtx_models.AllInitiatorsDatasourcesResponse:
        """
        Description: 根据app获取数据源列表
        Summary: 根据app获取数据源列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_initiators_datasources_ex_async(request, headers, runtime)

    def all_initiators_datasources_ex(
        self,
        request: dtx_models.AllInitiatorsDatasourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllInitiatorsDatasourcesResponse:
        """
        Description: 根据app获取数据源列表
        Summary: 根据app获取数据源列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllInitiatorsDatasourcesResponse(),
            self.do_request('1.0', 'sofa.dtx.initiators.datasources.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_initiators_datasources_ex_async(
        self,
        request: dtx_models.AllInitiatorsDatasourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllInitiatorsDatasourcesResponse:
        """
        Description: 根据app获取数据源列表
        Summary: 根据app获取数据源列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllInitiatorsDatasourcesResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.initiators.datasources.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_initiators_tables(
        self,
        request: dtx_models.AllInitiatorsTablesRequest,
    ) -> dtx_models.AllInitiatorsTablesResponse:
        """
        Description: 根据app+dsName获取所有表
        Summary: 根据app+dsName获取所有表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_initiators_tables_ex(request, headers, runtime)

    async def all_initiators_tables_async(
        self,
        request: dtx_models.AllInitiatorsTablesRequest,
    ) -> dtx_models.AllInitiatorsTablesResponse:
        """
        Description: 根据app+dsName获取所有表
        Summary: 根据app+dsName获取所有表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_initiators_tables_ex_async(request, headers, runtime)

    def all_initiators_tables_ex(
        self,
        request: dtx_models.AllInitiatorsTablesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllInitiatorsTablesResponse:
        """
        Description: 根据app+dsName获取所有表
        Summary: 根据app+dsName获取所有表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllInitiatorsTablesResponse(),
            self.do_request('1.0', 'sofa.dtx.initiators.tables.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_initiators_tables_ex_async(
        self,
        request: dtx_models.AllInitiatorsTablesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllInitiatorsTablesResponse:
        """
        Description: 根据app+dsName获取所有表
        Summary: 根据app+dsName获取所有表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllInitiatorsTablesResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.initiators.tables.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def debug_initiators(
        self,
        request: dtx_models.DebugInitiatorsRequest,
    ) -> dtx_models.DebugInitiatorsResponse:
        """
        Description: 发起方联调
        Summary: 发起方联调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.debug_initiators_ex(request, headers, runtime)

    async def debug_initiators_async(
        self,
        request: dtx_models.DebugInitiatorsRequest,
    ) -> dtx_models.DebugInitiatorsResponse:
        """
        Description: 发起方联调
        Summary: 发起方联调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.debug_initiators_ex_async(request, headers, runtime)

    def debug_initiators_ex(
        self,
        request: dtx_models.DebugInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DebugInitiatorsResponse:
        """
        Description: 发起方联调
        Summary: 发起方联调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DebugInitiatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.initiators.debug', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def debug_initiators_ex_async(
        self,
        request: dtx_models.DebugInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DebugInitiatorsResponse:
        """
        Description: 发起方联调
        Summary: 发起方联调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DebugInitiatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.initiators.debug', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_recovery_initiators(
        self,
        request: dtx_models.GetRecoveryInitiatorsRequest,
    ) -> dtx_models.GetRecoveryInitiatorsResponse:
        """
        Description: 单个发起方详情
        Summary: 单个发起方详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_recovery_initiators_ex(request, headers, runtime)

    async def get_recovery_initiators_async(
        self,
        request: dtx_models.GetRecoveryInitiatorsRequest,
    ) -> dtx_models.GetRecoveryInitiatorsResponse:
        """
        Description: 单个发起方详情
        Summary: 单个发起方详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_recovery_initiators_ex_async(request, headers, runtime)

    def get_recovery_initiators_ex(
        self,
        request: dtx_models.GetRecoveryInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetRecoveryInitiatorsResponse:
        """
        Description: 单个发起方详情
        Summary: 单个发起方详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetRecoveryInitiatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.initiators.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_recovery_initiators_ex_async(
        self,
        request: dtx_models.GetRecoveryInitiatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetRecoveryInitiatorsResponse:
        """
        Description: 单个发起方详情
        Summary: 单个发起方详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetRecoveryInitiatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.initiators.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_recovery_participators(
        self,
        request: dtx_models.CreateRecoveryParticipatorsRequest,
    ) -> dtx_models.CreateRecoveryParticipatorsResponse:
        """
        Description: 参与者接入，录入参与者信息
        Summary: 参与者接入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_recovery_participators_ex(request, headers, runtime)

    async def create_recovery_participators_async(
        self,
        request: dtx_models.CreateRecoveryParticipatorsRequest,
    ) -> dtx_models.CreateRecoveryParticipatorsResponse:
        """
        Description: 参与者接入，录入参与者信息
        Summary: 参与者接入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_recovery_participators_ex_async(request, headers, runtime)

    def create_recovery_participators_ex(
        self,
        request: dtx_models.CreateRecoveryParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateRecoveryParticipatorsResponse:
        """
        Description: 参与者接入，录入参与者信息
        Summary: 参与者接入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateRecoveryParticipatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.participators.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_recovery_participators_ex_async(
        self,
        request: dtx_models.CreateRecoveryParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateRecoveryParticipatorsResponse:
        """
        Description: 参与者接入，录入参与者信息
        Summary: 参与者接入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateRecoveryParticipatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.participators.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_recovery_participators(
        self,
        request: dtx_models.UpdateRecoveryParticipatorsRequest,
    ) -> dtx_models.UpdateRecoveryParticipatorsResponse:
        """
        Description: 更新参与者配置信息
        Summary: 参与者编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_recovery_participators_ex(request, headers, runtime)

    async def update_recovery_participators_async(
        self,
        request: dtx_models.UpdateRecoveryParticipatorsRequest,
    ) -> dtx_models.UpdateRecoveryParticipatorsResponse:
        """
        Description: 更新参与者配置信息
        Summary: 参与者编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_recovery_participators_ex_async(request, headers, runtime)

    def update_recovery_participators_ex(
        self,
        request: dtx_models.UpdateRecoveryParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateRecoveryParticipatorsResponse:
        """
        Description: 更新参与者配置信息
        Summary: 参与者编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateRecoveryParticipatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.recovery.participators.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_recovery_participators_ex_async(
        self,
        request: dtx_models.UpdateRecoveryParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateRecoveryParticipatorsResponse:
        """
        Description: 更新参与者配置信息
        Summary: 参与者编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateRecoveryParticipatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.recovery.participators.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_biztypes_participators(
        self,
        request: dtx_models.ListBiztypesParticipatorsRequest,
    ) -> dtx_models.ListBiztypesParticipatorsResponse:
        """
        Description:  应用作为发起者查询所有参与者
        Summary:  应用作为发起者查询所有参与者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_biztypes_participators_ex(request, headers, runtime)

    async def list_biztypes_participators_async(
        self,
        request: dtx_models.ListBiztypesParticipatorsRequest,
    ) -> dtx_models.ListBiztypesParticipatorsResponse:
        """
        Description:  应用作为发起者查询所有参与者
        Summary:  应用作为发起者查询所有参与者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_biztypes_participators_ex_async(request, headers, runtime)

    def list_biztypes_participators_ex(
        self,
        request: dtx_models.ListBiztypesParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListBiztypesParticipatorsResponse:
        """
        Description:  应用作为发起者查询所有参与者
        Summary:  应用作为发起者查询所有参与者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListBiztypesParticipatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.biztypes.participators.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_biztypes_participators_ex_async(
        self,
        request: dtx_models.ListBiztypesParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListBiztypesParticipatorsResponse:
        """
        Description:  应用作为发起者查询所有参与者
        Summary:  应用作为发起者查询所有参与者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListBiztypesParticipatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.biztypes.participators.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_participators_actionames(
        self,
        request: dtx_models.AllParticipatorsActionamesRequest,
    ) -> dtx_models.AllParticipatorsActionamesResponse:
        """
        Description: 根据app获取所有的参与者名称
        Summary: 根据app获取所有的参与者名称
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_participators_actionames_ex(request, headers, runtime)

    async def all_participators_actionames_async(
        self,
        request: dtx_models.AllParticipatorsActionamesRequest,
    ) -> dtx_models.AllParticipatorsActionamesResponse:
        """
        Description: 根据app获取所有的参与者名称
        Summary: 根据app获取所有的参与者名称
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_participators_actionames_ex_async(request, headers, runtime)

    def all_participators_actionames_ex(
        self,
        request: dtx_models.AllParticipatorsActionamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllParticipatorsActionamesResponse:
        """
        Description: 根据app获取所有的参与者名称
        Summary: 根据app获取所有的参与者名称
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllParticipatorsActionamesResponse(),
            self.do_request('1.0', 'sofa.dtx.participators.actionames.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_participators_actionames_ex_async(
        self,
        request: dtx_models.AllParticipatorsActionamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AllParticipatorsActionamesResponse:
        """
        Description: 根据app获取所有的参与者名称
        Summary: 根据app获取所有的参与者名称
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AllParticipatorsActionamesResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.participators.actionames.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def debug_participators(
        self,
        request: dtx_models.DebugParticipatorsRequest,
    ) -> dtx_models.DebugParticipatorsResponse:
        """
        Description: 参与者联调
        Summary: 参与者联调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.debug_participators_ex(request, headers, runtime)

    async def debug_participators_async(
        self,
        request: dtx_models.DebugParticipatorsRequest,
    ) -> dtx_models.DebugParticipatorsResponse:
        """
        Description: 参与者联调
        Summary: 参与者联调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.debug_participators_ex_async(request, headers, runtime)

    def debug_participators_ex(
        self,
        request: dtx_models.DebugParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DebugParticipatorsResponse:
        """
        Description: 参与者联调
        Summary: 参与者联调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DebugParticipatorsResponse(),
            self.do_request('1.0', 'sofa.dtx.participators.debug', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def debug_participators_ex_async(
        self,
        request: dtx_models.DebugParticipatorsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DebugParticipatorsResponse:
        """
        Description: 参与者联调
        Summary: 参与者联调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DebugParticipatorsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.participators.debug', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_action_param(
        self,
        request: dtx_models.QueryActionParamRequest,
    ) -> dtx_models.QueryActionParamResponse:
        """
        Description: 提交回滚方法参数
        Summary: 获取action的调用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_action_param_ex(request, headers, runtime)

    async def query_action_param_async(
        self,
        request: dtx_models.QueryActionParamRequest,
    ) -> dtx_models.QueryActionParamResponse:
        """
        Description: 提交回滚方法参数
        Summary: 获取action的调用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_action_param_ex_async(request, headers, runtime)

    def query_action_param_ex(
        self,
        request: dtx_models.QueryActionParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryActionParamResponse:
        """
        Description: 提交回滚方法参数
        Summary: 获取action的调用参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryActionParamResponse(),
            self.do_request('1.0', 'sofa.dtx.action.param.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_action_param_ex_async(
        self,
        request: dtx_models.QueryActionParamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryActionParamResponse:
        """
        Description: 提交回滚方法参数
        Summary: 获取action的调用参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryActionParamResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.action.param.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def execute_switchover(
        self,
        request: dtx_models.ExecuteSwitchoverRequest,
    ) -> dtx_models.ExecuteSwitchoverResponse:
        """
        Description: 分布式事务-执行单元切换
        Summary: 分布式事务执行单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.execute_switchover_ex(request, headers, runtime)

    async def execute_switchover_async(
        self,
        request: dtx_models.ExecuteSwitchoverRequest,
    ) -> dtx_models.ExecuteSwitchoverResponse:
        """
        Description: 分布式事务-执行单元切换
        Summary: 分布式事务执行单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.execute_switchover_ex_async(request, headers, runtime)

    def execute_switchover_ex(
        self,
        request: dtx_models.ExecuteSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExecuteSwitchoverResponse:
        """
        Description: 分布式事务-执行单元切换
        Summary: 分布式事务执行单元切换
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExecuteSwitchoverResponse(),
            self.do_request('1.0', 'sofa.dtx.switchover.execute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def execute_switchover_ex_async(
        self,
        request: dtx_models.ExecuteSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExecuteSwitchoverResponse:
        """
        Description: 分布式事务-执行单元切换
        Summary: 分布式事务执行单元切换
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExecuteSwitchoverResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.switchover.execute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_switchover(
        self,
        request: dtx_models.CancelSwitchoverRequest,
    ) -> dtx_models.CancelSwitchoverResponse:
        """
        Description: 分布式事务-取消单元切换
        Summary: 分布式事务取消单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_switchover_ex(request, headers, runtime)

    async def cancel_switchover_async(
        self,
        request: dtx_models.CancelSwitchoverRequest,
    ) -> dtx_models.CancelSwitchoverResponse:
        """
        Description: 分布式事务-取消单元切换
        Summary: 分布式事务取消单元切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_switchover_ex_async(request, headers, runtime)

    def cancel_switchover_ex(
        self,
        request: dtx_models.CancelSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CancelSwitchoverResponse:
        """
        Description: 分布式事务-取消单元切换
        Summary: 分布式事务取消单元切换
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CancelSwitchoverResponse(),
            self.do_request('1.0', 'sofa.dtx.switchover.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_switchover_ex_async(
        self,
        request: dtx_models.CancelSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CancelSwitchoverResponse:
        """
        Description: 分布式事务-取消单元切换
        Summary: 分布式事务取消单元切换
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CancelSwitchoverResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.switchover.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_switchover(
        self,
        request: dtx_models.QuerySwitchoverRequest,
    ) -> dtx_models.QuerySwitchoverResponse:
        """
        Description: 分布式事务-查询单元切换状态
        Summary: 查询分布式事务单元切换状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_switchover_ex(request, headers, runtime)

    async def query_switchover_async(
        self,
        request: dtx_models.QuerySwitchoverRequest,
    ) -> dtx_models.QuerySwitchoverResponse:
        """
        Description: 分布式事务-查询单元切换状态
        Summary: 查询分布式事务单元切换状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_switchover_ex_async(request, headers, runtime)

    def query_switchover_ex(
        self,
        request: dtx_models.QuerySwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QuerySwitchoverResponse:
        """
        Description: 分布式事务-查询单元切换状态
        Summary: 查询分布式事务单元切换状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QuerySwitchoverResponse(),
            self.do_request('1.0', 'sofa.dtx.switchover.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_switchover_ex_async(
        self,
        request: dtx_models.QuerySwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QuerySwitchoverResponse:
        """
        Description: 分布式事务-查询单元切换状态
        Summary: 查询分布式事务单元切换状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QuerySwitchoverResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.switchover.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_biztypes_trends(
        self,
        request: dtx_models.CountBiztypesTrendsRequest,
    ) -> dtx_models.CountBiztypesTrendsResponse:
        """
        Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
        Summary: 事务趋势图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_biztypes_trends_ex(request, headers, runtime)

    async def count_biztypes_trends_async(
        self,
        request: dtx_models.CountBiztypesTrendsRequest,
    ) -> dtx_models.CountBiztypesTrendsResponse:
        """
        Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
        Summary: 事务趋势图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_biztypes_trends_ex_async(request, headers, runtime)

    def count_biztypes_trends_ex(
        self,
        request: dtx_models.CountBiztypesTrendsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CountBiztypesTrendsResponse:
        """
        Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
        Summary: 事务趋势图
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CountBiztypesTrendsResponse(),
            self.do_request('1.0', 'sofa.dtx.biztypes.trends.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_biztypes_trends_ex_async(
        self,
        request: dtx_models.CountBiztypesTrendsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CountBiztypesTrendsResponse:
        """
        Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
        Summary: 事务趋势图
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CountBiztypesTrendsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.biztypes.trends.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_global_stats(
        self,
        request: dtx_models.GetGlobalStatsRequest,
    ) -> dtx_models.GetGlobalStatsResponse:
        """
        Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
        Summary: 事务概览统计接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_global_stats_ex(request, headers, runtime)

    async def get_global_stats_async(
        self,
        request: dtx_models.GetGlobalStatsRequest,
    ) -> dtx_models.GetGlobalStatsResponse:
        """
        Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
        Summary: 事务概览统计接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_global_stats_ex_async(request, headers, runtime)

    def get_global_stats_ex(
        self,
        request: dtx_models.GetGlobalStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetGlobalStatsResponse:
        """
        Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
        Summary: 事务概览统计接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetGlobalStatsResponse(),
            self.do_request('1.0', 'sofa.dtx.global.stats.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_global_stats_ex_async(
        self,
        request: dtx_models.GetGlobalStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetGlobalStatsResponse:
        """
        Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
        Summary: 事务概览统计接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetGlobalStatsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.global.stats.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_transaction_debugs(
        self,
        request: dtx_models.ListTransactionDebugsRequest,
    ) -> dtx_models.ListTransactionDebugsResponse:
        """
        Description: 联调历史列表
        Summary: 联调历史列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_transaction_debugs_ex(request, headers, runtime)

    async def list_transaction_debugs_async(
        self,
        request: dtx_models.ListTransactionDebugsRequest,
    ) -> dtx_models.ListTransactionDebugsResponse:
        """
        Description: 联调历史列表
        Summary: 联调历史列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_transaction_debugs_ex_async(request, headers, runtime)

    def list_transaction_debugs_ex(
        self,
        request: dtx_models.ListTransactionDebugsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListTransactionDebugsResponse:
        """
        Description: 联调历史列表
        Summary: 联调历史列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListTransactionDebugsResponse(),
            self.do_request('1.0', 'sofa.dtx.transaction.debugs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_transaction_debugs_ex_async(
        self,
        request: dtx_models.ListTransactionDebugsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListTransactionDebugsResponse:
        """
        Description: 联调历史列表
        Summary: 联调历史列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListTransactionDebugsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transaction.debugs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_transactions_debugs(
        self,
        request: dtx_models.GetTransactionsDebugsRequest,
    ) -> dtx_models.GetTransactionsDebugsResponse:
        """
        Description: 单个联调记录详情
        Summary: 单个联调记录详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_transactions_debugs_ex(request, headers, runtime)

    async def get_transactions_debugs_async(
        self,
        request: dtx_models.GetTransactionsDebugsRequest,
    ) -> dtx_models.GetTransactionsDebugsResponse:
        """
        Description: 单个联调记录详情
        Summary: 单个联调记录详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_transactions_debugs_ex_async(request, headers, runtime)

    def get_transactions_debugs_ex(
        self,
        request: dtx_models.GetTransactionsDebugsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionsDebugsResponse:
        """
        Description: 单个联调记录详情
        Summary: 单个联调记录详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionsDebugsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.debugs.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_transactions_debugs_ex_async(
        self,
        request: dtx_models.GetTransactionsDebugsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionsDebugsResponse:
        """
        Description: 单个联调记录详情
        Summary: 单个联调记录详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionsDebugsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.debugs.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_transactions(
        self,
        request: dtx_models.QueryTransactionsRequest,
    ) -> dtx_models.QueryTransactionsResponse:
        """
        Description: 事务高级查询
        Summary: 事务高级查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_transactions_ex(request, headers, runtime)

    async def query_transactions_async(
        self,
        request: dtx_models.QueryTransactionsRequest,
    ) -> dtx_models.QueryTransactionsResponse:
        """
        Description: 事务高级查询
        Summary: 事务高级查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_transactions_ex_async(request, headers, runtime)

    def query_transactions_ex(
        self,
        request: dtx_models.QueryTransactionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryTransactionsResponse:
        """
        Description: 事务高级查询
        Summary: 事务高级查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryTransactionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_transactions_ex_async(
        self,
        request: dtx_models.QueryTransactionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.QueryTransactionsResponse:
        """
        Description: 事务高级查询
        Summary: 事务高级查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.QueryTransactionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_transactions(
        self,
        request: dtx_models.GetTransactionsRequest,
    ) -> dtx_models.GetTransactionsResponse:
        """
        Description: 单个事务详情
        Summary: 单个事务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_transactions_ex(request, headers, runtime)

    async def get_transactions_async(
        self,
        request: dtx_models.GetTransactionsRequest,
    ) -> dtx_models.GetTransactionsResponse:
        """
        Description: 单个事务详情
        Summary: 单个事务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_transactions_ex_async(request, headers, runtime)

    def get_transactions_ex(
        self,
        request: dtx_models.GetTransactionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionsResponse:
        """
        Description: 单个事务详情
        Summary: 单个事务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_transactions_ex_async(
        self,
        request: dtx_models.GetTransactionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionsResponse:
        """
        Description: 单个事务详情
        Summary: 单个事务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_transactions_corrections(
        self,
        request: dtx_models.CreateTransactionsCorrectionsRequest,
    ) -> dtx_models.CreateTransactionsCorrectionsResponse:
        """
        Description: 悬挂事务恢复
        Summary: 创建事务恢复
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_transactions_corrections_ex(request, headers, runtime)

    async def create_transactions_corrections_async(
        self,
        request: dtx_models.CreateTransactionsCorrectionsRequest,
    ) -> dtx_models.CreateTransactionsCorrectionsResponse:
        """
        Description: 悬挂事务恢复
        Summary: 创建事务恢复
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_transactions_corrections_ex_async(request, headers, runtime)

    def create_transactions_corrections_ex(
        self,
        request: dtx_models.CreateTransactionsCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateTransactionsCorrectionsResponse:
        """
        Description: 悬挂事务恢复
        Summary: 创建事务恢复
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateTransactionsCorrectionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.corrections.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_transactions_corrections_ex_async(
        self,
        request: dtx_models.CreateTransactionsCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.CreateTransactionsCorrectionsResponse:
        """
        Description: 悬挂事务恢复
        Summary: 创建事务恢复
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.CreateTransactionsCorrectionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.corrections.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_transactions_corrections(
        self,
        request: dtx_models.GetTransactionsCorrectionsRequest,
    ) -> dtx_models.GetTransactionsCorrectionsResponse:
        """
        Description: 单个事务恢复详情
        Summary: 单个事务恢复详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_transactions_corrections_ex(request, headers, runtime)

    async def get_transactions_corrections_async(
        self,
        request: dtx_models.GetTransactionsCorrectionsRequest,
    ) -> dtx_models.GetTransactionsCorrectionsResponse:
        """
        Description: 单个事务恢复详情
        Summary: 单个事务恢复详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_transactions_corrections_ex_async(request, headers, runtime)

    def get_transactions_corrections_ex(
        self,
        request: dtx_models.GetTransactionsCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionsCorrectionsResponse:
        """
        Description: 单个事务恢复详情
        Summary: 单个事务恢复详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionsCorrectionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.corrections.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_transactions_corrections_ex_async(
        self,
        request: dtx_models.GetTransactionsCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionsCorrectionsResponse:
        """
        Description: 单个事务恢复详情
        Summary: 单个事务恢复详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionsCorrectionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.corrections.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_transactions_corrections(
        self,
        request: dtx_models.ExecTransactionsCorrectionsRequest,
    ) -> dtx_models.ExecTransactionsCorrectionsResponse:
        """
        Description: 执行事务订正
        Summary: 执行事务订正
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_transactions_corrections_ex(request, headers, runtime)

    async def exec_transactions_corrections_async(
        self,
        request: dtx_models.ExecTransactionsCorrectionsRequest,
    ) -> dtx_models.ExecTransactionsCorrectionsResponse:
        """
        Description: 执行事务订正
        Summary: 执行事务订正
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_transactions_corrections_ex_async(request, headers, runtime)

    def exec_transactions_corrections_ex(
        self,
        request: dtx_models.ExecTransactionsCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExecTransactionsCorrectionsResponse:
        """
        Description: 执行事务订正
        Summary: 执行事务订正
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExecTransactionsCorrectionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transactions.corrections.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_transactions_corrections_ex_async(
        self,
        request: dtx_models.ExecTransactionsCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ExecTransactionsCorrectionsResponse:
        """
        Description: 执行事务订正
        Summary: 执行事务订正
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ExecTransactionsCorrectionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transactions.corrections.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_transaction_corrections(
        self,
        request: dtx_models.ListTransactionCorrectionsRequest,
    ) -> dtx_models.ListTransactionCorrectionsResponse:
        """
        Description: 事务订正列表
        Summary: 事务订正列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_transaction_corrections_ex(request, headers, runtime)

    async def list_transaction_corrections_async(
        self,
        request: dtx_models.ListTransactionCorrectionsRequest,
    ) -> dtx_models.ListTransactionCorrectionsResponse:
        """
        Description: 事务订正列表
        Summary: 事务订正列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_transaction_corrections_ex_async(request, headers, runtime)

    def list_transaction_corrections_ex(
        self,
        request: dtx_models.ListTransactionCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListTransactionCorrectionsResponse:
        """
        Description: 事务订正列表
        Summary: 事务订正列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListTransactionCorrectionsResponse(),
            self.do_request('1.0', 'sofa.dtx.transaction.corrections.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_transaction_corrections_ex_async(
        self,
        request: dtx_models.ListTransactionCorrectionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListTransactionCorrectionsResponse:
        """
        Description: 事务订正列表
        Summary: 事务订正列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListTransactionCorrectionsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transaction.corrections.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_transaction_apps(
        self,
        request: dtx_models.ListTransactionAppsRequest,
    ) -> dtx_models.ListTransactionAppsResponse:
        """
        Description: 发起方app列表
        Summary: 发起方app列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_transaction_apps_ex(request, headers, runtime)

    async def list_transaction_apps_async(
        self,
        request: dtx_models.ListTransactionAppsRequest,
    ) -> dtx_models.ListTransactionAppsResponse:
        """
        Description: 发起方app列表
        Summary: 发起方app列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_transaction_apps_ex_async(request, headers, runtime)

    def list_transaction_apps_ex(
        self,
        request: dtx_models.ListTransactionAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListTransactionAppsResponse:
        """
        Description: 发起方app列表
        Summary: 发起方app列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListTransactionAppsResponse(),
            self.do_request('1.0', 'sofa.dtx.transaction.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_transaction_apps_ex_async(
        self,
        request: dtx_models.ListTransactionAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListTransactionAppsResponse:
        """
        Description: 发起方app列表
        Summary: 发起方app列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListTransactionAppsResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transaction.apps.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_transaction_chart(
        self,
        request: dtx_models.GetTransactionChartRequest,
    ) -> dtx_models.GetTransactionChartResponse:
        """
        Description: 针对特定图，组装的特定数据结构 接口
        Summary: 事务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_transaction_chart_ex(request, headers, runtime)

    async def get_transaction_chart_async(
        self,
        request: dtx_models.GetTransactionChartRequest,
    ) -> dtx_models.GetTransactionChartResponse:
        """
        Description: 针对特定图，组装的特定数据结构 接口
        Summary: 事务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_transaction_chart_ex_async(request, headers, runtime)

    def get_transaction_chart_ex(
        self,
        request: dtx_models.GetTransactionChartRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionChartResponse:
        """
        Description: 针对特定图，组装的特定数据结构 接口
        Summary: 事务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionChartResponse(),
            self.do_request('1.0', 'sofa.dtx.transaction.chart.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_transaction_chart_ex_async(
        self,
        request: dtx_models.GetTransactionChartRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionChartResponse:
        """
        Description: 针对特定图，组装的特定数据结构 接口
        Summary: 事务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionChartResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transaction.chart.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_transaction_saga(
        self,
        request: dtx_models.GetTransactionSagaRequest,
    ) -> dtx_models.GetTransactionSagaResponse:
        """
        Description: 获取Saga状态机事务执行记录，返回状态图json
        Summary: 获取Saga状态机事务执行记录json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_transaction_saga_ex(request, headers, runtime)

    async def get_transaction_saga_async(
        self,
        request: dtx_models.GetTransactionSagaRequest,
    ) -> dtx_models.GetTransactionSagaResponse:
        """
        Description: 获取Saga状态机事务执行记录，返回状态图json
        Summary: 获取Saga状态机事务执行记录json
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_transaction_saga_ex_async(request, headers, runtime)

    def get_transaction_saga_ex(
        self,
        request: dtx_models.GetTransactionSagaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionSagaResponse:
        """
        Description: 获取Saga状态机事务执行记录，返回状态图json
        Summary: 获取Saga状态机事务执行记录json
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionSagaResponse(),
            self.do_request('1.0', 'sofa.dtx.transaction.saga.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_transaction_saga_ex_async(
        self,
        request: dtx_models.GetTransactionSagaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.GetTransactionSagaResponse:
        """
        Description: 获取Saga状态机事务执行记录，返回状态图json
        Summary: 获取Saga状态机事务执行记录json
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.GetTransactionSagaResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.transaction.saga.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_whitelist(
        self,
        request: dtx_models.ListWhitelistRequest,
    ) -> dtx_models.ListWhitelistResponse:
        """
        Description: 白名单列表
        Summary: 白名单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_whitelist_ex(request, headers, runtime)

    async def list_whitelist_async(
        self,
        request: dtx_models.ListWhitelistRequest,
    ) -> dtx_models.ListWhitelistResponse:
        """
        Description: 白名单列表
        Summary: 白名单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_whitelist_ex_async(request, headers, runtime)

    def list_whitelist_ex(
        self,
        request: dtx_models.ListWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListWhitelistResponse:
        """
        Description: 白名单列表
        Summary: 白名单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListWhitelistResponse(),
            self.do_request('1.0', 'sofa.dtx.whitelist.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_whitelist_ex_async(
        self,
        request: dtx_models.ListWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListWhitelistResponse:
        """
        Description: 白名单列表
        Summary: 白名单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListWhitelistResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.whitelist.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_whitelist(
        self,
        request: dtx_models.UpdateWhitelistRequest,
    ) -> dtx_models.UpdateWhitelistResponse:
        """
        Description: 白名单更新
        Summary: 白名单更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_whitelist_ex(request, headers, runtime)

    async def update_whitelist_async(
        self,
        request: dtx_models.UpdateWhitelistRequest,
    ) -> dtx_models.UpdateWhitelistResponse:
        """
        Description: 白名单更新
        Summary: 白名单更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_whitelist_ex_async(request, headers, runtime)

    def update_whitelist_ex(
        self,
        request: dtx_models.UpdateWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateWhitelistResponse:
        """
        Description: 白名单更新
        Summary: 白名单更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateWhitelistResponse(),
            self.do_request('1.0', 'sofa.dtx.whitelist.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_whitelist_ex_async(
        self,
        request: dtx_models.UpdateWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.UpdateWhitelistResponse:
        """
        Description: 白名单更新
        Summary: 白名单更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.UpdateWhitelistResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.whitelist.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_whitelist(
        self,
        request: dtx_models.AddWhitelistRequest,
    ) -> dtx_models.AddWhitelistResponse:
        """
        Description: 白名单添加
        Summary: 白名单添加
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_whitelist_ex(request, headers, runtime)

    async def add_whitelist_async(
        self,
        request: dtx_models.AddWhitelistRequest,
    ) -> dtx_models.AddWhitelistResponse:
        """
        Description: 白名单添加
        Summary: 白名单添加
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_whitelist_ex_async(request, headers, runtime)

    def add_whitelist_ex(
        self,
        request: dtx_models.AddWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AddWhitelistResponse:
        """
        Description: 白名单添加
        Summary: 白名单添加
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AddWhitelistResponse(),
            self.do_request('1.0', 'sofa.dtx.whitelist.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_whitelist_ex_async(
        self,
        request: dtx_models.AddWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.AddWhitelistResponse:
        """
        Description: 白名单添加
        Summary: 白名单添加
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.AddWhitelistResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.whitelist.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_whitelist(
        self,
        request: dtx_models.PushWhitelistRequest,
    ) -> dtx_models.PushWhitelistResponse:
        """
        Description: xts failover容灾推送
        Summary: 容灾推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_whitelist_ex(request, headers, runtime)

    async def push_whitelist_async(
        self,
        request: dtx_models.PushWhitelistRequest,
    ) -> dtx_models.PushWhitelistResponse:
        """
        Description: xts failover容灾推送
        Summary: 容灾推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_whitelist_ex_async(request, headers, runtime)

    def push_whitelist_ex(
        self,
        request: dtx_models.PushWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.PushWhitelistResponse:
        """
        Description: xts failover容灾推送
        Summary: 容灾推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.PushWhitelistResponse(),
            self.do_request('1.0', 'sofa.dtx.whitelist.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_whitelist_ex_async(
        self,
        request: dtx_models.PushWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.PushWhitelistResponse:
        """
        Description: xts failover容灾推送
        Summary: 容灾推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.PushWhitelistResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.whitelist.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_whitelist(
        self,
        request: dtx_models.DeleteWhitelistRequest,
    ) -> dtx_models.DeleteWhitelistResponse:
        """
        Description: 删除白名单
        Summary: 删除白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_whitelist_ex(request, headers, runtime)

    async def delete_whitelist_async(
        self,
        request: dtx_models.DeleteWhitelistRequest,
    ) -> dtx_models.DeleteWhitelistResponse:
        """
        Description: 删除白名单
        Summary: 删除白名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_whitelist_ex_async(request, headers, runtime)

    def delete_whitelist_ex(
        self,
        request: dtx_models.DeleteWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteWhitelistResponse:
        """
        Description: 删除白名单
        Summary: 删除白名单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteWhitelistResponse(),
            self.do_request('1.0', 'sofa.dtx.whitelist.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_whitelist_ex_async(
        self,
        request: dtx_models.DeleteWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.DeleteWhitelistResponse:
        """
        Description: 删除白名单
        Summary: 删除白名单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.DeleteWhitelistResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.whitelist.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_whitelist_zones(
        self,
        request: dtx_models.ListWhitelistZonesRequest,
    ) -> dtx_models.ListWhitelistZonesResponse:
        """
        Description: 弹性位配置列表
        Summary: 弹性位配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_whitelist_zones_ex(request, headers, runtime)

    async def list_whitelist_zones_async(
        self,
        request: dtx_models.ListWhitelistZonesRequest,
    ) -> dtx_models.ListWhitelistZonesResponse:
        """
        Description: 弹性位配置列表
        Summary: 弹性位配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_whitelist_zones_ex_async(request, headers, runtime)

    def list_whitelist_zones_ex(
        self,
        request: dtx_models.ListWhitelistZonesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListWhitelistZonesResponse:
        """
        Description: 弹性位配置列表
        Summary: 弹性位配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListWhitelistZonesResponse(),
            self.do_request('1.0', 'sofa.dtx.whitelist.zones.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_whitelist_zones_ex_async(
        self,
        request: dtx_models.ListWhitelistZonesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtx_models.ListWhitelistZonesResponse:
        """
        Description: 弹性位配置列表
        Summary: 弹性位配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtx_models.ListWhitelistZonesResponse(),
            await self.do_request_async('1.0', 'sofa.dtx.whitelist.zones.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
