# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_rms import models as rms_models
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
        config: rms_models.Config,
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
            # condition
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
                    'sdk_version': '1.3.273'
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
            # condition
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
                    'sdk_version': '1.3.273'
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

    def query_rms_agentloglocate(
        self,
        request: rms_models.QueryRmsAgentloglocateRequest,
    ) -> rms_models.QueryRmsAgentloglocateResponse:
        """
        Description: /agent/logLocate
        Summary: /agent/logLocate
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_agentloglocate_ex(request, headers, runtime)

    async def query_rms_agentloglocate_async(
        self,
        request: rms_models.QueryRmsAgentloglocateRequest,
    ) -> rms_models.QueryRmsAgentloglocateResponse:
        """
        Description: /agent/logLocate
        Summary: /agent/logLocate
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_agentloglocate_ex_async(request, headers, runtime)

    def query_rms_agentloglocate_ex(
        self,
        request: rms_models.QueryRmsAgentloglocateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAgentloglocateResponse:
        """
        Description: /agent/logLocate
        Summary: /agent/logLocate
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAgentloglocateResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.agentloglocate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_agentloglocate_ex_async(
        self,
        request: rms_models.QueryRmsAgentloglocateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAgentloglocateResponse:
        """
        Description: /agent/logLocate
        Summary: /agent/logLocate
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAgentloglocateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.agentloglocate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_agenttail(
        self,
        request: rms_models.QueryRmsAgenttailRequest,
    ) -> rms_models.QueryRmsAgenttailResponse:
        """
        Description: /agent/tail
        Summary: /agent/tail
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_agenttail_ex(request, headers, runtime)

    async def query_rms_agenttail_async(
        self,
        request: rms_models.QueryRmsAgenttailRequest,
    ) -> rms_models.QueryRmsAgenttailResponse:
        """
        Description: /agent/tail
        Summary: /agent/tail
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_agenttail_ex_async(request, headers, runtime)

    def query_rms_agenttail_ex(
        self,
        request: rms_models.QueryRmsAgenttailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAgenttailResponse:
        """
        Description: /agent/tail
        Summary: /agent/tail
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAgenttailResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.agenttail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_agenttail_ex_async(
        self,
        request: rms_models.QueryRmsAgenttailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAgenttailResponse:
        """
        Description: /agent/tail
        Summary: /agent/tail
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAgenttailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.agenttail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_agentbrowser(
        self,
        request: rms_models.QueryRmsAgentbrowserRequest,
    ) -> rms_models.QueryRmsAgentbrowserResponse:
        """
        Description: /agent/browser
        Summary: /agent/browser
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_agentbrowser_ex(request, headers, runtime)

    async def query_rms_agentbrowser_async(
        self,
        request: rms_models.QueryRmsAgentbrowserRequest,
    ) -> rms_models.QueryRmsAgentbrowserResponse:
        """
        Description: /agent/browser
        Summary: /agent/browser
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_agentbrowser_ex_async(request, headers, runtime)

    def query_rms_agentbrowser_ex(
        self,
        request: rms_models.QueryRmsAgentbrowserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAgentbrowserResponse:
        """
        Description: /agent/browser
        Summary: /agent/browser
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAgentbrowserResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.agentbrowser.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_agentbrowser_ex_async(
        self,
        request: rms_models.QueryRmsAgentbrowserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAgentbrowserResponse:
        """
        Description: /agent/browser
        Summary: /agent/browser
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAgentbrowserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.agentbrowser.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_alarmhistorytype(
        self,
        request: rms_models.QueryRmsAlarmhistorytypeRequest,
    ) -> rms_models.QueryRmsAlarmhistorytypeResponse:
        """
        Description: rms.alarmhistorytype.query
        Summary: alarmTypeStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_alarmhistorytype_ex(request, headers, runtime)

    async def query_rms_alarmhistorytype_async(
        self,
        request: rms_models.QueryRmsAlarmhistorytypeRequest,
    ) -> rms_models.QueryRmsAlarmhistorytypeResponse:
        """
        Description: rms.alarmhistorytype.query
        Summary: alarmTypeStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_alarmhistorytype_ex_async(request, headers, runtime)

    def query_rms_alarmhistorytype_ex(
        self,
        request: rms_models.QueryRmsAlarmhistorytypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistorytypeResponse:
        """
        Description: rms.alarmhistorytype.query
        Summary: alarmTypeStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistorytypeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.alarmhistorytype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_alarmhistorytype_ex_async(
        self,
        request: rms_models.QueryRmsAlarmhistorytypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistorytypeResponse:
        """
        Description: rms.alarmhistorytype.query
        Summary: alarmTypeStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistorytypeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.alarmhistorytype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_alarmhistorylevel(
        self,
        request: rms_models.QueryRmsAlarmhistorylevelRequest,
    ) -> rms_models.QueryRmsAlarmhistorylevelResponse:
        """
        Description: alarmLevelStats
        Summary: alarmLevelStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_alarmhistorylevel_ex(request, headers, runtime)

    async def query_rms_alarmhistorylevel_async(
        self,
        request: rms_models.QueryRmsAlarmhistorylevelRequest,
    ) -> rms_models.QueryRmsAlarmhistorylevelResponse:
        """
        Description: alarmLevelStats
        Summary: alarmLevelStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_alarmhistorylevel_ex_async(request, headers, runtime)

    def query_rms_alarmhistorylevel_ex(
        self,
        request: rms_models.QueryRmsAlarmhistorylevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistorylevelResponse:
        """
        Description: alarmLevelStats
        Summary: alarmLevelStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistorylevelResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.alarmhistorylevel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_alarmhistorylevel_ex_async(
        self,
        request: rms_models.QueryRmsAlarmhistorylevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistorylevelResponse:
        """
        Description: alarmLevelStats
        Summary: alarmLevelStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistorylevelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.alarmhistorylevel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_notifyhistory(
        self,
        request: rms_models.QueryRmsNotifyhistoryRequest,
    ) -> rms_models.QueryRmsNotifyhistoryResponse:
        """
        Description: /stats/notify/history
        Summary: notifyHistoryStatsV2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_notifyhistory_ex(request, headers, runtime)

    async def query_rms_notifyhistory_async(
        self,
        request: rms_models.QueryRmsNotifyhistoryRequest,
    ) -> rms_models.QueryRmsNotifyhistoryResponse:
        """
        Description: /stats/notify/history
        Summary: notifyHistoryStatsV2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_notifyhistory_ex_async(request, headers, runtime)

    def query_rms_notifyhistory_ex(
        self,
        request: rms_models.QueryRmsNotifyhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsNotifyhistoryResponse:
        """
        Description: /stats/notify/history
        Summary: notifyHistoryStatsV2
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsNotifyhistoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.notifyhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_notifyhistory_ex_async(
        self,
        request: rms_models.QueryRmsNotifyhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsNotifyhistoryResponse:
        """
        Description: /stats/notify/history
        Summary: notifyHistoryStatsV2
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsNotifyhistoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.notifyhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_stackentity(
        self,
        request: rms_models.QueryRmsStackentityRequest,
    ) -> rms_models.QueryRmsStackentityResponse:
        """
        Description: /stats/stack/entity
        Summary: stackEntityStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_stackentity_ex(request, headers, runtime)

    async def query_rms_stackentity_async(
        self,
        request: rms_models.QueryRmsStackentityRequest,
    ) -> rms_models.QueryRmsStackentityResponse:
        """
        Description: /stats/stack/entity
        Summary: stackEntityStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_stackentity_ex_async(request, headers, runtime)

    def query_rms_stackentity_ex(
        self,
        request: rms_models.QueryRmsStackentityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsStackentityResponse:
        """
        Description: /stats/stack/entity
        Summary: stackEntityStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsStackentityResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.stackentity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_stackentity_ex_async(
        self,
        request: rms_models.QueryRmsStackentityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsStackentityResponse:
        """
        Description: /stats/stack/entity
        Summary: stackEntityStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsStackentityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.stackentity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_alarmhistoryappcount(
        self,
        request: rms_models.QueryRmsAlarmhistoryappcountRequest,
    ) -> rms_models.QueryRmsAlarmhistoryappcountResponse:
        """
        Description: /stats/alarm/history/appCount
        Summary: alarmHistoryAppCount
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_alarmhistoryappcount_ex(request, headers, runtime)

    async def query_rms_alarmhistoryappcount_async(
        self,
        request: rms_models.QueryRmsAlarmhistoryappcountRequest,
    ) -> rms_models.QueryRmsAlarmhistoryappcountResponse:
        """
        Description: /stats/alarm/history/appCount
        Summary: alarmHistoryAppCount
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_alarmhistoryappcount_ex_async(request, headers, runtime)

    def query_rms_alarmhistoryappcount_ex(
        self,
        request: rms_models.QueryRmsAlarmhistoryappcountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistoryappcountResponse:
        """
        Description: /stats/alarm/history/appCount
        Summary: alarmHistoryAppCount
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistoryappcountResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.alarmhistoryappcount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_alarmhistoryappcount_ex_async(
        self,
        request: rms_models.QueryRmsAlarmhistoryappcountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistoryappcountResponse:
        """
        Description: /stats/alarm/history/appCount
        Summary: alarmHistoryAppCount
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistoryappcountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.alarmhistoryappcount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_alarmhistoryappstats(
        self,
        request: rms_models.QueryRmsAlarmhistoryappstatsRequest,
    ) -> rms_models.QueryRmsAlarmhistoryappstatsResponse:
        """
        Description: /alarm/history/appStats
        Summary: alarmHistoryAppStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_alarmhistoryappstats_ex(request, headers, runtime)

    async def query_rms_alarmhistoryappstats_async(
        self,
        request: rms_models.QueryRmsAlarmhistoryappstatsRequest,
    ) -> rms_models.QueryRmsAlarmhistoryappstatsResponse:
        """
        Description: /alarm/history/appStats
        Summary: alarmHistoryAppStats
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_alarmhistoryappstats_ex_async(request, headers, runtime)

    def query_rms_alarmhistoryappstats_ex(
        self,
        request: rms_models.QueryRmsAlarmhistoryappstatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistoryappstatsResponse:
        """
        Description: /alarm/history/appStats
        Summary: alarmHistoryAppStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistoryappstatsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.alarmhistoryappstats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_alarmhistoryappstats_ex_async(
        self,
        request: rms_models.QueryRmsAlarmhistoryappstatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAlarmhistoryappstatsResponse:
        """
        Description: /alarm/history/appStats
        Summary: alarmHistoryAppStats
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAlarmhistoryappstatsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.alarmhistoryappstats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_appstatspageable(
        self,
        request: rms_models.QueryRmsAppstatspageableRequest,
    ) -> rms_models.QueryRmsAppstatspageableResponse:
        """
        Description: /alarm/history/appStatsPageable
        Summary: appstatspageable
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_appstatspageable_ex(request, headers, runtime)

    async def query_rms_appstatspageable_async(
        self,
        request: rms_models.QueryRmsAppstatspageableRequest,
    ) -> rms_models.QueryRmsAppstatspageableResponse:
        """
        Description: /alarm/history/appStatsPageable
        Summary: appstatspageable
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_appstatspageable_ex_async(request, headers, runtime)

    def query_rms_appstatspageable_ex(
        self,
        request: rms_models.QueryRmsAppstatspageableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAppstatspageableResponse:
        """
        Description: /alarm/history/appStatsPageable
        Summary: appstatspageable
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAppstatspageableResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.appstatspageable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_appstatspageable_ex_async(
        self,
        request: rms_models.QueryRmsAppstatspageableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsAppstatspageableResponse:
        """
        Description: /alarm/history/appStatsPageable
        Summary: appstatspageable
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsAppstatspageableResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.appstatspageable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_logreaderror(
        self,
        request: rms_models.QueryRmsLogreaderrorRequest,
    ) -> rms_models.QueryRmsLogreaderrorResponse:
        """
        Description: /logread/error
        Summary: /logread/error
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_logreaderror_ex(request, headers, runtime)

    async def query_rms_logreaderror_async(
        self,
        request: rms_models.QueryRmsLogreaderrorRequest,
    ) -> rms_models.QueryRmsLogreaderrorResponse:
        """
        Description: /logread/error
        Summary: /logread/error
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_logreaderror_ex_async(request, headers, runtime)

    def query_rms_logreaderror_ex(
        self,
        request: rms_models.QueryRmsLogreaderrorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsLogreaderrorResponse:
        """
        Description: /logread/error
        Summary: /logread/error
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsLogreaderrorResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.logreaderror.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_logreaderror_ex_async(
        self,
        request: rms_models.QueryRmsLogreaderrorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsLogreaderrorResponse:
        """
        Description: /logread/error
        Summary: /logread/error
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsLogreaderrorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.logreaderror.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_universalread(
        self,
        request: rms_models.QueryRmsUniversalreadRequest,
    ) -> rms_models.QueryRmsUniversalreadResponse:
        """
        Description: /universal/read
        Summary: /universal/read
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_universalread_ex(request, headers, runtime)

    async def query_rms_universalread_async(
        self,
        request: rms_models.QueryRmsUniversalreadRequest,
    ) -> rms_models.QueryRmsUniversalreadResponse:
        """
        Description: /universal/read
        Summary: /universal/read
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_universalread_ex_async(request, headers, runtime)

    def query_rms_universalread_ex(
        self,
        request: rms_models.QueryRmsUniversalreadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsUniversalreadResponse:
        """
        Description: /universal/read
        Summary: /universal/read
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsUniversalreadResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.universalread.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_universalread_ex_async(
        self,
        request: rms_models.QueryRmsUniversalreadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsUniversalreadResponse:
        """
        Description: /universal/read
        Summary: /universal/read
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsUniversalreadResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.universalread.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_universalwrite(
        self,
        request: rms_models.QueryRmsUniversalwriteRequest,
    ) -> rms_models.QueryRmsUniversalwriteResponse:
        """
        Description: /universal/write
        Summary: /universal/write
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_universalwrite_ex(request, headers, runtime)

    async def query_rms_universalwrite_async(
        self,
        request: rms_models.QueryRmsUniversalwriteRequest,
    ) -> rms_models.QueryRmsUniversalwriteResponse:
        """
        Description: /universal/write
        Summary: /universal/write
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_universalwrite_ex_async(request, headers, runtime)

    def query_rms_universalwrite_ex(
        self,
        request: rms_models.QueryRmsUniversalwriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsUniversalwriteResponse:
        """
        Description: /universal/write
        Summary: /universal/write
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsUniversalwriteResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.universalwrite.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_universalwrite_ex_async(
        self,
        request: rms_models.QueryRmsUniversalwriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsUniversalwriteResponse:
        """
        Description: /universal/write
        Summary: /universal/write
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsUniversalwriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.universalwrite.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_rms_plugin(
        self,
        request: rms_models.CreateRmsPluginRequest,
    ) -> rms_models.CreateRmsPluginResponse:
        """
        Description: /modeling/plugin/create
        Summary: create
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_rms_plugin_ex(request, headers, runtime)

    async def create_rms_plugin_async(
        self,
        request: rms_models.CreateRmsPluginRequest,
    ) -> rms_models.CreateRmsPluginResponse:
        """
        Description: /modeling/plugin/create
        Summary: create
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_rms_plugin_ex_async(request, headers, runtime)

    def create_rms_plugin_ex(
        self,
        request: rms_models.CreateRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateRmsPluginResponse:
        """
        Description: /modeling/plugin/create
        Summary: create
        """
        UtilClient.validate_model(request)
        return rms_models.CreateRmsPluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugin.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_rms_plugin_ex_async(
        self,
        request: rms_models.CreateRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateRmsPluginResponse:
        """
        Description: /modeling/plugin/create
        Summary: create
        """
        UtilClient.validate_model(request)
        return rms_models.CreateRmsPluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugin.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_rms_plugin(
        self,
        request: rms_models.DeleteRmsPluginRequest,
    ) -> rms_models.DeleteRmsPluginResponse:
        """
        Description: /modeling/plugin/delete
        Summary: delete
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_rms_plugin_ex(request, headers, runtime)

    async def delete_rms_plugin_async(
        self,
        request: rms_models.DeleteRmsPluginRequest,
    ) -> rms_models.DeleteRmsPluginResponse:
        """
        Description: /modeling/plugin/delete
        Summary: delete
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_rms_plugin_ex_async(request, headers, runtime)

    def delete_rms_plugin_ex(
        self,
        request: rms_models.DeleteRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteRmsPluginResponse:
        """
        Description: /modeling/plugin/delete
        Summary: delete
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteRmsPluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugin.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_rms_plugin_ex_async(
        self,
        request: rms_models.DeleteRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteRmsPluginResponse:
        """
        Description: /modeling/plugin/delete
        Summary: delete
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteRmsPluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugin.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_rms_plugin(
        self,
        request: rms_models.CloseRmsPluginRequest,
    ) -> rms_models.CloseRmsPluginResponse:
        """
        Description: /modeling/plugin/close
        Summary: close
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_rms_plugin_ex(request, headers, runtime)

    async def close_rms_plugin_async(
        self,
        request: rms_models.CloseRmsPluginRequest,
    ) -> rms_models.CloseRmsPluginResponse:
        """
        Description: /modeling/plugin/close
        Summary: close
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_rms_plugin_ex_async(request, headers, runtime)

    def close_rms_plugin_ex(
        self,
        request: rms_models.CloseRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CloseRmsPluginResponse:
        """
        Description: /modeling/plugin/close
        Summary: close
        """
        UtilClient.validate_model(request)
        return rms_models.CloseRmsPluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugin.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_rms_plugin_ex_async(
        self,
        request: rms_models.CloseRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CloseRmsPluginResponse:
        """
        Description: /modeling/plugin/close
        Summary: close
        """
        UtilClient.validate_model(request)
        return rms_models.CloseRmsPluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugin.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_rms_plugin(
        self,
        request: rms_models.OpenRmsPluginRequest,
    ) -> rms_models.OpenRmsPluginResponse:
        """
        Description: /modeling/plugin/open
        Summary: open
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_rms_plugin_ex(request, headers, runtime)

    async def open_rms_plugin_async(
        self,
        request: rms_models.OpenRmsPluginRequest,
    ) -> rms_models.OpenRmsPluginResponse:
        """
        Description: /modeling/plugin/open
        Summary: open
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_rms_plugin_ex_async(request, headers, runtime)

    def open_rms_plugin_ex(
        self,
        request: rms_models.OpenRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.OpenRmsPluginResponse:
        """
        Description: /modeling/plugin/open
        Summary: open
        """
        UtilClient.validate_model(request)
        return rms_models.OpenRmsPluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugin.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_rms_plugin_ex_async(
        self,
        request: rms_models.OpenRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.OpenRmsPluginResponse:
        """
        Description: /modeling/plugin/open
        Summary: open
        """
        UtilClient.validate_model(request)
        return rms_models.OpenRmsPluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugin.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_rms_plugin(
        self,
        request: rms_models.UpdateRmsPluginRequest,
    ) -> rms_models.UpdateRmsPluginResponse:
        """
        Description: /modeling/plugin/update
        Summary: update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_rms_plugin_ex(request, headers, runtime)

    async def update_rms_plugin_async(
        self,
        request: rms_models.UpdateRmsPluginRequest,
    ) -> rms_models.UpdateRmsPluginResponse:
        """
        Description: /modeling/plugin/update
        Summary: update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_rms_plugin_ex_async(request, headers, runtime)

    def update_rms_plugin_ex(
        self,
        request: rms_models.UpdateRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateRmsPluginResponse:
        """
        Description: /modeling/plugin/update
        Summary: update
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateRmsPluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugin.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_rms_plugin_ex_async(
        self,
        request: rms_models.UpdateRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateRmsPluginResponse:
        """
        Description: /modeling/plugin/update
        Summary: update
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateRmsPluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugin.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_pluginbytype(
        self,
        request: rms_models.QueryRmsPluginbytypeRequest,
    ) -> rms_models.QueryRmsPluginbytypeResponse:
        """
        Description: /modeling/plugin/queryByPluginType
        Summary: queryByPluginType
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_pluginbytype_ex(request, headers, runtime)

    async def query_rms_pluginbytype_async(
        self,
        request: rms_models.QueryRmsPluginbytypeRequest,
    ) -> rms_models.QueryRmsPluginbytypeResponse:
        """
        Description: /modeling/plugin/queryByPluginType
        Summary: queryByPluginType
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_pluginbytype_ex_async(request, headers, runtime)

    def query_rms_pluginbytype_ex(
        self,
        request: rms_models.QueryRmsPluginbytypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPluginbytypeResponse:
        """
        Description: /modeling/plugin/queryByPluginType
        Summary: queryByPluginType
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPluginbytypeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.pluginbytype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_pluginbytype_ex_async(
        self,
        request: rms_models.QueryRmsPluginbytypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPluginbytypeResponse:
        """
        Description: /modeling/plugin/queryByPluginType
        Summary: queryByPluginType
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPluginbytypeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.pluginbytype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_pluginbyfolder(
        self,
        request: rms_models.QueryRmsPluginbyfolderRequest,
    ) -> rms_models.QueryRmsPluginbyfolderResponse:
        """
        Description: /modeling/plugin/queryByFolder
        Summary: queryByFolder
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_pluginbyfolder_ex(request, headers, runtime)

    async def query_rms_pluginbyfolder_async(
        self,
        request: rms_models.QueryRmsPluginbyfolderRequest,
    ) -> rms_models.QueryRmsPluginbyfolderResponse:
        """
        Description: /modeling/plugin/queryByFolder
        Summary: queryByFolder
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_pluginbyfolder_ex_async(request, headers, runtime)

    def query_rms_pluginbyfolder_ex(
        self,
        request: rms_models.QueryRmsPluginbyfolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPluginbyfolderResponse:
        """
        Description: /modeling/plugin/queryByFolder
        Summary: queryByFolder
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPluginbyfolderResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.pluginbyfolder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_pluginbyfolder_ex_async(
        self,
        request: rms_models.QueryRmsPluginbyfolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPluginbyfolderResponse:
        """
        Description: /modeling/plugin/queryByFolder
        Summary: queryByFolder
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPluginbyfolderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.pluginbyfolder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_plugin(
        self,
        request: rms_models.QueryRmsPluginRequest,
    ) -> rms_models.QueryRmsPluginResponse:
        """
        Description: /modeling/plugin/query
        Summary: query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_plugin_ex(request, headers, runtime)

    async def query_rms_plugin_async(
        self,
        request: rms_models.QueryRmsPluginRequest,
    ) -> rms_models.QueryRmsPluginResponse:
        """
        Description: /modeling/plugin/query
        Summary: query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_plugin_ex_async(request, headers, runtime)

    def query_rms_plugin_ex(
        self,
        request: rms_models.QueryRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPluginResponse:
        """
        Description: /modeling/plugin/query
        Summary: query
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_plugin_ex_async(
        self,
        request: rms_models.QueryRmsPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPluginResponse:
        """
        Description: /modeling/plugin/query
        Summary: query
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_plugintest(
        self,
        request: rms_models.QueryRmsPlugintestRequest,
    ) -> rms_models.QueryRmsPlugintestResponse:
        """
        Description: /modeling/plugin/querytest
        Summary: querytest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_plugintest_ex(request, headers, runtime)

    async def query_rms_plugintest_async(
        self,
        request: rms_models.QueryRmsPlugintestRequest,
    ) -> rms_models.QueryRmsPlugintestResponse:
        """
        Description: /modeling/plugin/querytest
        Summary: querytest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_plugintest_ex_async(request, headers, runtime)

    def query_rms_plugintest_ex(
        self,
        request: rms_models.QueryRmsPlugintestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPlugintestResponse:
        """
        Description: /modeling/plugin/querytest
        Summary: querytest
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPlugintestResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.plugintest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_plugintest_ex_async(
        self,
        request: rms_models.QueryRmsPlugintestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPlugintestResponse:
        """
        Description: /modeling/plugin/querytest
        Summary: querytest
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPlugintestResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.plugintest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_path(
        self,
        request: rms_models.QueryRmsPathRequest,
    ) -> rms_models.QueryRmsPathResponse:
        """
        Description: /modeling/folder/path
        Summary: queryPath
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_path_ex(request, headers, runtime)

    async def query_rms_path_async(
        self,
        request: rms_models.QueryRmsPathRequest,
    ) -> rms_models.QueryRmsPathResponse:
        """
        Description: /modeling/folder/path
        Summary: queryPath
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_path_ex_async(request, headers, runtime)

    def query_rms_path_ex(
        self,
        request: rms_models.QueryRmsPathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPathResponse:
        """
        Description: /modeling/folder/path
        Summary: queryPath
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPathResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.path.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_path_ex_async(
        self,
        request: rms_models.QueryRmsPathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsPathResponse:
        """
        Description: /modeling/folder/path
        Summary: queryPath
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsPathResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.path.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_rms_universalcleankey(
        self,
        request: rms_models.ExecRmsUniversalcleankeyRequest,
    ) -> rms_models.ExecRmsUniversalcleankeyResponse:
        """
        Description: /{tenantId}/webapi/cleankey
        Summary: cleankey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_rms_universalcleankey_ex(request, headers, runtime)

    async def exec_rms_universalcleankey_async(
        self,
        request: rms_models.ExecRmsUniversalcleankeyRequest,
    ) -> rms_models.ExecRmsUniversalcleankeyResponse:
        """
        Description: /{tenantId}/webapi/cleankey
        Summary: cleankey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_rms_universalcleankey_ex_async(request, headers, runtime)

    def exec_rms_universalcleankey_ex(
        self,
        request: rms_models.ExecRmsUniversalcleankeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ExecRmsUniversalcleankeyResponse:
        """
        Description: /{tenantId}/webapi/cleankey
        Summary: cleankey
        """
        UtilClient.validate_model(request)
        return rms_models.ExecRmsUniversalcleankeyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.universalcleankey.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_rms_universalcleankey_ex_async(
        self,
        request: rms_models.ExecRmsUniversalcleankeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ExecRmsUniversalcleankeyResponse:
        """
        Description: /{tenantId}/webapi/cleankey
        Summary: cleankey
        """
        UtilClient.validate_model(request)
        return rms_models.ExecRmsUniversalcleankeyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.universalcleankey.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_universal(
        self,
        request: rms_models.QueryRmsUniversalRequest,
    ) -> rms_models.QueryRmsUniversalResponse:
        """
        Description: /{tenantId}/universalQuery
        Summary: universalQuery
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_universal_ex(request, headers, runtime)

    async def query_rms_universal_async(
        self,
        request: rms_models.QueryRmsUniversalRequest,
    ) -> rms_models.QueryRmsUniversalResponse:
        """
        Description: /{tenantId}/universalQuery
        Summary: universalQuery
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_universal_ex_async(request, headers, runtime)

    def query_rms_universal_ex(
        self,
        request: rms_models.QueryRmsUniversalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsUniversalResponse:
        """
        Description: /{tenantId}/universalQuery
        Summary: universalQuery
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsUniversalResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.universal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_universal_ex_async(
        self,
        request: rms_models.QueryRmsUniversalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsUniversalResponse:
        """
        Description: /{tenantId}/universalQuery
        Summary: universalQuery
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsUniversalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.universal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rms_tracespan(
        self,
        request: rms_models.QueryRmsTracespanRequest,
    ) -> rms_models.QueryRmsTracespanResponse:
        """
        Description: 链路搜索
        Summary: 链路搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rms_tracespan_ex(request, headers, runtime)

    async def query_rms_tracespan_async(
        self,
        request: rms_models.QueryRmsTracespanRequest,
    ) -> rms_models.QueryRmsTracespanResponse:
        """
        Description: 链路搜索
        Summary: 链路搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rms_tracespan_ex_async(request, headers, runtime)

    def query_rms_tracespan_ex(
        self,
        request: rms_models.QueryRmsTracespanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsTracespanResponse:
        """
        Description: 链路搜索
        Summary: 链路搜索
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsTracespanResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.tracespan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rms_tracespan_ex_async(
        self,
        request: rms_models.QueryRmsTracespanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryRmsTracespanResponse:
        """
        Description: 链路搜索
        Summary: 链路搜索
        """
        UtilClient.validate_model(request)
        return rms_models.QueryRmsTracespanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.tracespan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rms_tracespanqueryconfig(
        self,
        request: rms_models.GetRmsTracespanqueryconfigRequest,
    ) -> rms_models.GetRmsTracespanqueryconfigResponse:
        """
        Description: 查询链路搜索页面的配置
        Summary: 查询链路搜索页面的配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rms_tracespanqueryconfig_ex(request, headers, runtime)

    async def get_rms_tracespanqueryconfig_async(
        self,
        request: rms_models.GetRmsTracespanqueryconfigRequest,
    ) -> rms_models.GetRmsTracespanqueryconfigResponse:
        """
        Description: 查询链路搜索页面的配置
        Summary: 查询链路搜索页面的配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rms_tracespanqueryconfig_ex_async(request, headers, runtime)

    def get_rms_tracespanqueryconfig_ex(
        self,
        request: rms_models.GetRmsTracespanqueryconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetRmsTracespanqueryconfigResponse:
        """
        Description: 查询链路搜索页面的配置
        Summary: 查询链路搜索页面的配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetRmsTracespanqueryconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.tracespanqueryconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rms_tracespanqueryconfig_ex_async(
        self,
        request: rms_models.GetRmsTracespanqueryconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetRmsTracespanqueryconfigResponse:
        """
        Description: 查询链路搜索页面的配置
        Summary: 查询链路搜索页面的配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetRmsTracespanqueryconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.tracespanqueryconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_rms_tracetree(
        self,
        request: rms_models.DescribeRmsTracetreeRequest,
    ) -> rms_models.DescribeRmsTracetreeResponse:
        """
        Description: 单链路树状图查询
        Summary: 单链路树状图查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_rms_tracetree_ex(request, headers, runtime)

    async def describe_rms_tracetree_async(
        self,
        request: rms_models.DescribeRmsTracetreeRequest,
    ) -> rms_models.DescribeRmsTracetreeResponse:
        """
        Description: 单链路树状图查询
        Summary: 单链路树状图查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_rms_tracetree_ex_async(request, headers, runtime)

    def describe_rms_tracetree_ex(
        self,
        request: rms_models.DescribeRmsTracetreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DescribeRmsTracetreeResponse:
        """
        Description: 单链路树状图查询
        Summary: 单链路树状图查询
        """
        UtilClient.validate_model(request)
        return rms_models.DescribeRmsTracetreeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.tracetree.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_rms_tracetree_ex_async(
        self,
        request: rms_models.DescribeRmsTracetreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DescribeRmsTracetreeResponse:
        """
        Description: 单链路树状图查询
        Summary: 单链路树状图查询
        """
        UtilClient.validate_model(request)
        return rms_models.DescribeRmsTracetreeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.tracetree.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_completecommodity(
        self,
        request: rms_models.CallbackSpiCompletecommodityRequest,
    ) -> rms_models.CallbackSpiCompletecommodityResponse:
        """
        Description: 南天门 - 商品补全接口
        Summary: 南天门 - 商品补全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_completecommodity_ex(request, headers, runtime)

    async def callback_spi_completecommodity_async(
        self,
        request: rms_models.CallbackSpiCompletecommodityRequest,
    ) -> rms_models.CallbackSpiCompletecommodityResponse:
        """
        Description: 南天门 - 商品补全接口
        Summary: 南天门 - 商品补全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_completecommodity_ex_async(request, headers, runtime)

    def callback_spi_completecommodity_ex(
        self,
        request: rms_models.CallbackSpiCompletecommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiCompletecommodityResponse:
        """
        Description: 南天门 - 商品补全接口
        Summary: 南天门 - 商品补全接口
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiCompletecommodityResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.spi.completecommodity.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_completecommodity_ex_async(
        self,
        request: rms_models.CallbackSpiCompletecommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiCompletecommodityResponse:
        """
        Description: 南天门 - 商品补全接口
        Summary: 南天门 - 商品补全接口
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiCompletecommodityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.spi.completecommodity.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_payordercallback(
        self,
        request: rms_models.CallbackSpiPayordercallbackRequest,
    ) -> rms_models.CallbackSpiPayordercallbackResponse:
        """
        Description: 南天门 - 支付后回调
        Summary: 南天门 - 支付后回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_payordercallback_ex(request, headers, runtime)

    async def callback_spi_payordercallback_async(
        self,
        request: rms_models.CallbackSpiPayordercallbackRequest,
    ) -> rms_models.CallbackSpiPayordercallbackResponse:
        """
        Description: 南天门 - 支付后回调
        Summary: 南天门 - 支付后回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_payordercallback_ex_async(request, headers, runtime)

    def callback_spi_payordercallback_ex(
        self,
        request: rms_models.CallbackSpiPayordercallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiPayordercallbackResponse:
        """
        Description: 南天门 - 支付后回调
        Summary: 南天门 - 支付后回调
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiPayordercallbackResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.spi.payordercallback.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_payordercallback_ex_async(
        self,
        request: rms_models.CallbackSpiPayordercallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiPayordercallbackResponse:
        """
        Description: 南天门 - 支付后回调
        Summary: 南天门 - 支付后回调
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiPayordercallbackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.spi.payordercallback.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_completeorderparam(
        self,
        request: rms_models.CallbackSpiCompleteorderparamRequest,
    ) -> rms_models.CallbackSpiCompleteorderparamResponse:
        """
        Description: 南天门 - 补全订单
        Summary: 南天门 - 补全订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_completeorderparam_ex(request, headers, runtime)

    async def callback_spi_completeorderparam_async(
        self,
        request: rms_models.CallbackSpiCompleteorderparamRequest,
    ) -> rms_models.CallbackSpiCompleteorderparamResponse:
        """
        Description: 南天门 - 补全订单
        Summary: 南天门 - 补全订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_completeorderparam_ex_async(request, headers, runtime)

    def callback_spi_completeorderparam_ex(
        self,
        request: rms_models.CallbackSpiCompleteorderparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiCompleteorderparamResponse:
        """
        Description: 南天门 - 补全订单
        Summary: 南天门 - 补全订单
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiCompleteorderparamResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.spi.completeorderparam.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_completeorderparam_ex_async(
        self,
        request: rms_models.CallbackSpiCompleteorderparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiCompleteorderparamResponse:
        """
        Description: 南天门 - 补全订单
        Summary: 南天门 - 补全订单
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiCompleteorderparamResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.spi.completeorderparam.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_verify(
        self,
        request: rms_models.CallbackSpiVerifyRequest,
    ) -> rms_models.CallbackSpiVerifyResponse:
        """
        Description: 南天门 - 订单校验回调
        Summary: 南天门 - 订单校验回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_verify_ex(request, headers, runtime)

    async def callback_spi_verify_async(
        self,
        request: rms_models.CallbackSpiVerifyRequest,
    ) -> rms_models.CallbackSpiVerifyResponse:
        """
        Description: 南天门 - 订单校验回调
        Summary: 南天门 - 订单校验回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_verify_ex_async(request, headers, runtime)

    def callback_spi_verify_ex(
        self,
        request: rms_models.CallbackSpiVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiVerifyResponse:
        """
        Description: 南天门 - 订单校验回调
        Summary: 南天门 - 订单校验回调
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiVerifyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.spi.verify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_verify_ex_async(
        self,
        request: rms_models.CallbackSpiVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiVerifyResponse:
        """
        Description: 南天门 - 订单校验回调
        Summary: 南天门 - 订单校验回调
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiVerifyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.spi.verify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_refund(
        self,
        request: rms_models.CallbackSpiRefundRequest,
    ) -> rms_models.CallbackSpiRefundResponse:
        """
        Description: 南天门 - 退款
        Summary: 南天门 - 退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_refund_ex(request, headers, runtime)

    async def callback_spi_refund_async(
        self,
        request: rms_models.CallbackSpiRefundRequest,
    ) -> rms_models.CallbackSpiRefundResponse:
        """
        Description: 南天门 - 退款
        Summary: 南天门 - 退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_refund_ex_async(request, headers, runtime)

    def callback_spi_refund_ex(
        self,
        request: rms_models.CallbackSpiRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiRefundResponse:
        """
        Description: 南天门 - 退款
        Summary: 南天门 - 退款
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiRefundResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.spi.refund.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_refund_ex_async(
        self,
        request: rms_models.CallbackSpiRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiRefundResponse:
        """
        Description: 南天门 - 退款
        Summary: 南天门 - 退款
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiRefundResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.spi.refund.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_spi_lifecycle(
        self,
        request: rms_models.CallbackSpiLifecycleRequest,
    ) -> rms_models.CallbackSpiLifecycleResponse:
        """
        Description: 南天门 - 商品实例生命周期回调
        Summary: 南天门 - 商品实例生命周期回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_spi_lifecycle_ex(request, headers, runtime)

    async def callback_spi_lifecycle_async(
        self,
        request: rms_models.CallbackSpiLifecycleRequest,
    ) -> rms_models.CallbackSpiLifecycleResponse:
        """
        Description: 南天门 - 商品实例生命周期回调
        Summary: 南天门 - 商品实例生命周期回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_spi_lifecycle_ex_async(request, headers, runtime)

    def callback_spi_lifecycle_ex(
        self,
        request: rms_models.CallbackSpiLifecycleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiLifecycleResponse:
        """
        Description: 南天门 - 商品实例生命周期回调
        Summary: 南天门 - 商品实例生命周期回调
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiLifecycleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.spi.lifecycle.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_spi_lifecycle_ex_async(
        self,
        request: rms_models.CallbackSpiLifecycleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CallbackSpiLifecycleResponse:
        """
        Description: 南天门 - 商品实例生命周期回调
        Summary: 南天门 - 商品实例生命周期回调
        """
        UtilClient.validate_model(request)
        return rms_models.CallbackSpiLifecycleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.spi.lifecycle.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_rms_timeseriesmetrics(
        self,
        request: rms_models.DescribeRmsTimeseriesmetricsRequest,
    ) -> rms_models.DescribeRmsTimeseriesmetricsResponse:
        """
        Description: 查询时序指标
        Summary: 查询时序指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_rms_timeseriesmetrics_ex(request, headers, runtime)

    async def describe_rms_timeseriesmetrics_async(
        self,
        request: rms_models.DescribeRmsTimeseriesmetricsRequest,
    ) -> rms_models.DescribeRmsTimeseriesmetricsResponse:
        """
        Description: 查询时序指标
        Summary: 查询时序指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_rms_timeseriesmetrics_ex_async(request, headers, runtime)

    def describe_rms_timeseriesmetrics_ex(
        self,
        request: rms_models.DescribeRmsTimeseriesmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DescribeRmsTimeseriesmetricsResponse:
        """
        Description: 查询时序指标
        Summary: 查询时序指标
        """
        UtilClient.validate_model(request)
        return rms_models.DescribeRmsTimeseriesmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.timeseriesmetrics.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_rms_timeseriesmetrics_ex_async(
        self,
        request: rms_models.DescribeRmsTimeseriesmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DescribeRmsTimeseriesmetricsResponse:
        """
        Description: 查询时序指标
        Summary: 查询时序指标
        """
        UtilClient.validate_model(request)
        return rms_models.DescribeRmsTimeseriesmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.timeseriesmetrics.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_rms_topology(
        self,
        request: rms_models.DescribeRmsTopologyRequest,
    ) -> rms_models.DescribeRmsTopologyResponse:
        """
        Description: 获取调用拓扑
        Summary: 获取调用拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_rms_topology_ex(request, headers, runtime)

    async def describe_rms_topology_async(
        self,
        request: rms_models.DescribeRmsTopologyRequest,
    ) -> rms_models.DescribeRmsTopologyResponse:
        """
        Description: 获取调用拓扑
        Summary: 获取调用拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_rms_topology_ex_async(request, headers, runtime)

    def describe_rms_topology_ex(
        self,
        request: rms_models.DescribeRmsTopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DescribeRmsTopologyResponse:
        """
        Description: 获取调用拓扑
        Summary: 获取调用拓扑
        """
        UtilClient.validate_model(request)
        return rms_models.DescribeRmsTopologyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.rms.topology.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_rms_topology_ex_async(
        self,
        request: rms_models.DescribeRmsTopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DescribeRmsTopologyResponse:
        """
        Description: 获取调用拓扑
        Summary: 获取调用拓扑
        """
        UtilClient.validate_model(request)
        return rms_models.DescribeRmsTopologyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.rms.topology.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics(
        self,
        request: rms_models.QueryMetricsRequest,
    ) -> rms_models.QueryMetricsResponse:
        """
        Description: 监控指标数据查询
        Summary: 监控指标数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_ex(request, headers, runtime)

    async def query_metrics_async(
        self,
        request: rms_models.QueryMetricsRequest,
    ) -> rms_models.QueryMetricsResponse:
        """
        Description: 监控指标数据查询
        Summary: 监控指标数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_ex_async(request, headers, runtime)

    def query_metrics_ex(
        self,
        request: rms_models.QueryMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryMetricsResponse:
        """
        Description: 监控指标数据查询
        Summary: 监控指标数据查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryMetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_ex_async(
        self,
        request: rms_models.QueryMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryMetricsResponse:
        """
        Description: 监控指标数据查询
        Summary: 监控指标数据查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryMetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_span(
        self,
        request: rms_models.QueryTraceSpanRequest,
    ) -> rms_models.QueryTraceSpanResponse:
        """
        Description: 链路Span查询搜索
        Summary: 链路查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_span_ex(request, headers, runtime)

    async def query_trace_span_async(
        self,
        request: rms_models.QueryTraceSpanRequest,
    ) -> rms_models.QueryTraceSpanResponse:
        """
        Description: 链路Span查询搜索
        Summary: 链路查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_span_ex_async(request, headers, runtime)

    def query_trace_span_ex(
        self,
        request: rms_models.QueryTraceSpanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceSpanResponse:
        """
        Description: 链路Span查询搜索
        Summary: 链路查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceSpanResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.span.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_span_ex_async(
        self,
        request: rms_models.QueryTraceSpanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceSpanResponse:
        """
        Description: 链路Span查询搜索
        Summary: 链路查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceSpanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.span.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_app_name(
        self,
        request: rms_models.ListAppNameRequest,
    ) -> rms_models.ListAppNameResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_app_name_ex(request, headers, runtime)

    async def list_app_name_async(
        self,
        request: rms_models.ListAppNameRequest,
    ) -> rms_models.ListAppNameResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_app_name_ex_async(request, headers, runtime)

    def list_app_name_ex(
        self,
        request: rms_models.ListAppNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAppNameResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAppNameResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.name.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_app_name_ex_async(
        self,
        request: rms_models.ListAppNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAppNameResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAppNameResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.name.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_customplugin(
        self,
        request: rms_models.CreateCustompluginRequest,
    ) -> rms_models.CreateCustompluginResponse:
        """
        Description: 创建自定义监控指标
        Summary: 创建自定义监控指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_customplugin_ex(request, headers, runtime)

    async def create_customplugin_async(
        self,
        request: rms_models.CreateCustompluginRequest,
    ) -> rms_models.CreateCustompluginResponse:
        """
        Description: 创建自定义监控指标
        Summary: 创建自定义监控指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_customplugin_ex_async(request, headers, runtime)

    def create_customplugin_ex(
        self,
        request: rms_models.CreateCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateCustompluginResponse:
        """
        Description: 创建自定义监控指标
        Summary: 创建自定义监控指标
        """
        UtilClient.validate_model(request)
        return rms_models.CreateCustompluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.customplugin.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_customplugin_ex_async(
        self,
        request: rms_models.CreateCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateCustompluginResponse:
        """
        Description: 创建自定义监控指标
        Summary: 创建自定义监控指标
        """
        UtilClient.validate_model(request)
        return rms_models.CreateCustompluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.customplugin.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_customplugin(
        self,
        request: rms_models.DeleteCustompluginRequest,
    ) -> rms_models.DeleteCustompluginResponse:
        """
        Description: 删除自定义监控指标
        Summary: 删除自定义监控指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_customplugin_ex(request, headers, runtime)

    async def delete_customplugin_async(
        self,
        request: rms_models.DeleteCustompluginRequest,
    ) -> rms_models.DeleteCustompluginResponse:
        """
        Description: 删除自定义监控指标
        Summary: 删除自定义监控指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_customplugin_ex_async(request, headers, runtime)

    def delete_customplugin_ex(
        self,
        request: rms_models.DeleteCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteCustompluginResponse:
        """
        Description: 删除自定义监控指标
        Summary: 删除自定义监控指标
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteCustompluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.customplugin.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_customplugin_ex_async(
        self,
        request: rms_models.DeleteCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteCustompluginResponse:
        """
        Description: 删除自定义监控指标
        Summary: 删除自定义监控指标
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteCustompluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.customplugin.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_folder(
        self,
        request: rms_models.CreateFolderRequest,
    ) -> rms_models.CreateFolderResponse:
        """
        Description: 自定义监控 - 添加文件夹
        Summary: 自定义监控 - 添加文件夹
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_folder_ex(request, headers, runtime)

    async def create_folder_async(
        self,
        request: rms_models.CreateFolderRequest,
    ) -> rms_models.CreateFolderResponse:
        """
        Description: 自定义监控 - 添加文件夹
        Summary: 自定义监控 - 添加文件夹
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_folder_ex_async(request, headers, runtime)

    def create_folder_ex(
        self,
        request: rms_models.CreateFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateFolderResponse:
        """
        Description: 自定义监控 - 添加文件夹
        Summary: 自定义监控 - 添加文件夹
        """
        UtilClient.validate_model(request)
        return rms_models.CreateFolderResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.folder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_folder_ex_async(
        self,
        request: rms_models.CreateFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateFolderResponse:
        """
        Description: 自定义监控 - 添加文件夹
        Summary: 自定义监控 - 添加文件夹
        """
        UtilClient.validate_model(request)
        return rms_models.CreateFolderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.folder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_folder(
        self,
        request: rms_models.UpdateFolderRequest,
    ) -> rms_models.UpdateFolderResponse:
        """
        Description: 自定义监控 - 文件夹更新
        Summary: 自定义监控 - 文件夹更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_folder_ex(request, headers, runtime)

    async def update_folder_async(
        self,
        request: rms_models.UpdateFolderRequest,
    ) -> rms_models.UpdateFolderResponse:
        """
        Description: 自定义监控 - 文件夹更新
        Summary: 自定义监控 - 文件夹更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_folder_ex_async(request, headers, runtime)

    def update_folder_ex(
        self,
        request: rms_models.UpdateFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateFolderResponse:
        """
        Description: 自定义监控 - 文件夹更新
        Summary: 自定义监控 - 文件夹更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateFolderResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.folder.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_folder_ex_async(
        self,
        request: rms_models.UpdateFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateFolderResponse:
        """
        Description: 自定义监控 - 文件夹更新
        Summary: 自定义监控 - 文件夹更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateFolderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.folder.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_config(
        self,
        request: rms_models.QueryTraceConfigRequest,
    ) -> rms_models.QueryTraceConfigResponse:
        """
        Description: 链路查询时可选参数的配置查询
        Summary: 链路查询时可选参数的配置查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_config_ex(request, headers, runtime)

    async def query_trace_config_async(
        self,
        request: rms_models.QueryTraceConfigRequest,
    ) -> rms_models.QueryTraceConfigResponse:
        """
        Description: 链路查询时可选参数的配置查询
        Summary: 链路查询时可选参数的配置查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_config_ex_async(request, headers, runtime)

    def query_trace_config_ex(
        self,
        request: rms_models.QueryTraceConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceConfigResponse:
        """
        Description: 链路查询时可选参数的配置查询
        Summary: 链路查询时可选参数的配置查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_config_ex_async(
        self,
        request: rms_models.QueryTraceConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceConfigResponse:
        """
        Description: 链路查询时可选参数的配置查询
        Summary: 链路查询时可选参数的配置查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_folder_path(
        self,
        request: rms_models.QueryFolderPathRequest,
    ) -> rms_models.QueryFolderPathResponse:
        """
        Description: 查询文件夹路径
        Summary: 查询文件夹路径
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_folder_path_ex(request, headers, runtime)

    async def query_folder_path_async(
        self,
        request: rms_models.QueryFolderPathRequest,
    ) -> rms_models.QueryFolderPathResponse:
        """
        Description: 查询文件夹路径
        Summary: 查询文件夹路径
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_folder_path_ex_async(request, headers, runtime)

    def query_folder_path_ex(
        self,
        request: rms_models.QueryFolderPathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryFolderPathResponse:
        """
        Description: 查询文件夹路径
        Summary: 查询文件夹路径
        """
        UtilClient.validate_model(request)
        return rms_models.QueryFolderPathResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.folder.path.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_folder_path_ex_async(
        self,
        request: rms_models.QueryFolderPathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryFolderPathResponse:
        """
        Description: 查询文件夹路径
        Summary: 查询文件夹路径
        """
        UtilClient.validate_model(request)
        return rms_models.QueryFolderPathResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.folder.path.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_detail(
        self,
        request: rms_models.QueryTraceDetailRequest,
    ) -> rms_models.QueryTraceDetailResponse:
        """
        Description: 查询链路详情
        Summary: 查询链路详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_detail_ex(request, headers, runtime)

    async def query_trace_detail_async(
        self,
        request: rms_models.QueryTraceDetailRequest,
    ) -> rms_models.QueryTraceDetailResponse:
        """
        Description: 查询链路详情
        Summary: 查询链路详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_detail_ex_async(request, headers, runtime)

    def query_trace_detail_ex(
        self,
        request: rms_models.QueryTraceDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceDetailResponse:
        """
        Description: 查询链路详情
        Summary: 查询链路详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceDetailResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_detail_ex_async(
        self,
        request: rms_models.QueryTraceDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceDetailResponse:
        """
        Description: 查询链路详情
        Summary: 查询链路详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceDetailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_topology(
        self,
        request: rms_models.QueryTraceTopologyRequest,
    ) -> rms_models.QueryTraceTopologyResponse:
        """
        Description: 获取链路拓扑图
        Summary: 获取链路拓扑图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_topology_ex(request, headers, runtime)

    async def query_trace_topology_async(
        self,
        request: rms_models.QueryTraceTopologyRequest,
    ) -> rms_models.QueryTraceTopologyResponse:
        """
        Description: 获取链路拓扑图
        Summary: 获取链路拓扑图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_topology_ex_async(request, headers, runtime)

    def query_trace_topology_ex(
        self,
        request: rms_models.QueryTraceTopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceTopologyResponse:
        """
        Description: 获取链路拓扑图
        Summary: 获取链路拓扑图
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceTopologyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.topology.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_topology_ex_async(
        self,
        request: rms_models.QueryTraceTopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceTopologyResponse:
        """
        Description: 获取链路拓扑图
        Summary: 获取链路拓扑图
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceTopologyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.topology.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_metrics(
        self,
        request: rms_models.QueryTraceMetricsRequest,
    ) -> rms_models.QueryTraceMetricsResponse:
        """
        Description: 查询链路关联指标
        Summary: 查询链路关联指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_metrics_ex(request, headers, runtime)

    async def query_trace_metrics_async(
        self,
        request: rms_models.QueryTraceMetricsRequest,
    ) -> rms_models.QueryTraceMetricsResponse:
        """
        Description: 查询链路关联指标
        Summary: 查询链路关联指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_metrics_ex_async(request, headers, runtime)

    def query_trace_metrics_ex(
        self,
        request: rms_models.QueryTraceMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceMetricsResponse:
        """
        Description: 查询链路关联指标
        Summary: 查询链路关联指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceMetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_metrics_ex_async(
        self,
        request: rms_models.QueryTraceMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceMetricsResponse:
        """
        Description: 查询链路关联指标
        Summary: 查询链路关联指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceMetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_customplugin(
        self,
        request: rms_models.GetCustompluginRequest,
    ) -> rms_models.GetCustompluginResponse:
        """
        Description: 获取自定义监控指标详情
        Summary: 获取自定义监控指标详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_customplugin_ex(request, headers, runtime)

    async def get_customplugin_async(
        self,
        request: rms_models.GetCustompluginRequest,
    ) -> rms_models.GetCustompluginResponse:
        """
        Description: 获取自定义监控指标详情
        Summary: 获取自定义监控指标详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_customplugin_ex_async(request, headers, runtime)

    def get_customplugin_ex(
        self,
        request: rms_models.GetCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetCustompluginResponse:
        """
        Description: 获取自定义监控指标详情
        Summary: 获取自定义监控指标详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetCustompluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.customplugin.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_customplugin_ex_async(
        self,
        request: rms_models.GetCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetCustompluginResponse:
        """
        Description: 获取自定义监控指标详情
        Summary: 获取自定义监控指标详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetCustompluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.customplugin.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app(
        self,
        request: rms_models.QueryAppRequest,
    ) -> rms_models.QueryAppResponse:
        """
        Description: 查询应用监控
        Summary: 查询应用监控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_ex(request, headers, runtime)

    async def query_app_async(
        self,
        request: rms_models.QueryAppRequest,
    ) -> rms_models.QueryAppResponse:
        """
        Description: 查询应用监控
        Summary: 查询应用监控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_ex_async(request, headers, runtime)

    def query_app_ex(
        self,
        request: rms_models.QueryAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppResponse:
        """
        Description: 查询应用监控
        Summary: 查询应用监控
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_ex_async(
        self,
        request: rms_models.QueryAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppResponse:
        """
        Description: 查询应用监控
        Summary: 查询应用监控
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_user_favorite(
        self,
        request: rms_models.GetUserFavoriteRequest,
    ) -> rms_models.GetUserFavoriteResponse:
        """
        Description: 获取用户收藏资源状态
        Summary: 获取用户收藏资源状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_user_favorite_ex(request, headers, runtime)

    async def get_user_favorite_async(
        self,
        request: rms_models.GetUserFavoriteRequest,
    ) -> rms_models.GetUserFavoriteResponse:
        """
        Description: 获取用户收藏资源状态
        Summary: 获取用户收藏资源状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_user_favorite_ex_async(request, headers, runtime)

    def get_user_favorite_ex(
        self,
        request: rms_models.GetUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetUserFavoriteResponse:
        """
        Description: 获取用户收藏资源状态
        Summary: 获取用户收藏资源状态
        """
        UtilClient.validate_model(request)
        return rms_models.GetUserFavoriteResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.favorite.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_user_favorite_ex_async(
        self,
        request: rms_models.GetUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetUserFavoriteResponse:
        """
        Description: 获取用户收藏资源状态
        Summary: 获取用户收藏资源状态
        """
        UtilClient.validate_model(request)
        return rms_models.GetUserFavoriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.favorite.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_folder(
        self,
        request: rms_models.QueryFolderRequest,
    ) -> rms_models.QueryFolderResponse:
        """
        Description: 查询文件夹列表
        Summary: 查询文件夹列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_folder_ex(request, headers, runtime)

    async def query_folder_async(
        self,
        request: rms_models.QueryFolderRequest,
    ) -> rms_models.QueryFolderResponse:
        """
        Description: 查询文件夹列表
        Summary: 查询文件夹列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_folder_ex_async(request, headers, runtime)

    def query_folder_ex(
        self,
        request: rms_models.QueryFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryFolderResponse:
        """
        Description: 查询文件夹列表
        Summary: 查询文件夹列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryFolderResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.folder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_folder_ex_async(
        self,
        request: rms_models.QueryFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryFolderResponse:
        """
        Description: 查询文件夹列表
        Summary: 查询文件夹列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryFolderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.folder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_customplugin(
        self,
        request: rms_models.QueryCustompluginRequest,
    ) -> rms_models.QueryCustompluginResponse:
        """
        Description:  查询自定义监控配置列表
        Summary:  查询自定义监控配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customplugin_ex(request, headers, runtime)

    async def query_customplugin_async(
        self,
        request: rms_models.QueryCustompluginRequest,
    ) -> rms_models.QueryCustompluginResponse:
        """
        Description:  查询自定义监控配置列表
        Summary:  查询自定义监控配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customplugin_ex_async(request, headers, runtime)

    def query_customplugin_ex(
        self,
        request: rms_models.QueryCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryCustompluginResponse:
        """
        Description:  查询自定义监控配置列表
        Summary:  查询自定义监控配置列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryCustompluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.customplugin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customplugin_ex_async(
        self,
        request: rms_models.QueryCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryCustompluginResponse:
        """
        Description:  查询自定义监控配置列表
        Summary:  查询自定义监控配置列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryCustompluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.customplugin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_favorite(
        self,
        request: rms_models.QueryUserFavoriteRequest,
    ) -> rms_models.QueryUserFavoriteResponse:
        """
        Description: 查询用户收藏列表
        Summary: 查询用户收藏列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_favorite_ex(request, headers, runtime)

    async def query_user_favorite_async(
        self,
        request: rms_models.QueryUserFavoriteRequest,
    ) -> rms_models.QueryUserFavoriteResponse:
        """
        Description: 查询用户收藏列表
        Summary: 查询用户收藏列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_favorite_ex_async(request, headers, runtime)

    def query_user_favorite_ex(
        self,
        request: rms_models.QueryUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUserFavoriteResponse:
        """
        Description: 查询用户收藏列表
        Summary: 查询用户收藏列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUserFavoriteResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.favorite.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_favorite_ex_async(
        self,
        request: rms_models.QueryUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUserFavoriteResponse:
        """
        Description: 查询用户收藏列表
        Summary: 查询用户收藏列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUserFavoriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.favorite.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm_pause(
        self,
        request: rms_models.QueryAlarmPauseRequest,
    ) -> rms_models.QueryAlarmPauseResponse:
        """
        Description: 告警暂停列表查询
        Summary: 告警暂停列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_pause_ex(request, headers, runtime)

    async def query_alarm_pause_async(
        self,
        request: rms_models.QueryAlarmPauseRequest,
    ) -> rms_models.QueryAlarmPauseResponse:
        """
        Description: 告警暂停列表查询
        Summary: 告警暂停列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_pause_ex_async(request, headers, runtime)

    def query_alarm_pause_ex(
        self,
        request: rms_models.QueryAlarmPauseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmPauseResponse:
        """
        Description: 告警暂停列表查询
        Summary: 告警暂停列表查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmPauseResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.pause.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_pause_ex_async(
        self,
        request: rms_models.QueryAlarmPauseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmPauseResponse:
        """
        Description: 告警暂停列表查询
        Summary: 告警暂停列表查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmPauseResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.pause.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_alarm_app(
        self,
        request: rms_models.CountAlarmAppRequest,
    ) -> rms_models.CountAlarmAppResponse:
        """
        Description: 获取告警应用统计信息
        Summary: 获取告警应用统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_alarm_app_ex(request, headers, runtime)

    async def count_alarm_app_async(
        self,
        request: rms_models.CountAlarmAppRequest,
    ) -> rms_models.CountAlarmAppResponse:
        """
        Description: 获取告警应用统计信息
        Summary: 获取告警应用统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_alarm_app_ex_async(request, headers, runtime)

    def count_alarm_app_ex(
        self,
        request: rms_models.CountAlarmAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CountAlarmAppResponse:
        """
        Description: 获取告警应用统计信息
        Summary: 获取告警应用统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.CountAlarmAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.app.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_alarm_app_ex_async(
        self,
        request: rms_models.CountAlarmAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CountAlarmAppResponse:
        """
        Description: 获取告警应用统计信息
        Summary: 获取告警应用统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.CountAlarmAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.app.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm_apprelation(
        self,
        request: rms_models.QueryAlarmApprelationRequest,
    ) -> rms_models.QueryAlarmApprelationResponse:
        """
        Description: 查询告警应用关联Map
        Summary: 查询告警应用关联Map
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_apprelation_ex(request, headers, runtime)

    async def query_alarm_apprelation_async(
        self,
        request: rms_models.QueryAlarmApprelationRequest,
    ) -> rms_models.QueryAlarmApprelationResponse:
        """
        Description: 查询告警应用关联Map
        Summary: 查询告警应用关联Map
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_apprelation_ex_async(request, headers, runtime)

    def query_alarm_apprelation_ex(
        self,
        request: rms_models.QueryAlarmApprelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmApprelationResponse:
        """
        Description: 查询告警应用关联Map
        Summary: 查询告警应用关联Map
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmApprelationResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.apprelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_apprelation_ex_async(
        self,
        request: rms_models.QueryAlarmApprelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmApprelationResponse:
        """
        Description: 查询告警应用关联Map
        Summary: 查询告警应用关联Map
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmApprelationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.apprelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_stack_generatedconfig(
        self,
        request: rms_models.BatchqueryStackGeneratedconfigRequest,
    ) -> rms_models.BatchqueryStackGeneratedconfigResponse:
        """
        Description: 批量查询栈配置
        Summary: 批量查询栈配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_stack_generatedconfig_ex(request, headers, runtime)

    async def batchquery_stack_generatedconfig_async(
        self,
        request: rms_models.BatchqueryStackGeneratedconfigRequest,
    ) -> rms_models.BatchqueryStackGeneratedconfigResponse:
        """
        Description: 批量查询栈配置
        Summary: 批量查询栈配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_stack_generatedconfig_ex_async(request, headers, runtime)

    def batchquery_stack_generatedconfig_ex(
        self,
        request: rms_models.BatchqueryStackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryStackGeneratedconfigResponse:
        """
        Description: 批量查询栈配置
        Summary: 批量查询栈配置
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryStackGeneratedconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.stack.generatedconfig.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_stack_generatedconfig_ex_async(
        self,
        request: rms_models.BatchqueryStackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryStackGeneratedconfigResponse:
        """
        Description: 批量查询栈配置
        Summary: 批量查询栈配置
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryStackGeneratedconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.stack.generatedconfig.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dashboard(
        self,
        request: rms_models.ListDashboardRequest,
    ) -> rms_models.ListDashboardResponse:
        """
        Description: 获取大盘列表
        Summary: 获取大盘列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dashboard_ex(request, headers, runtime)

    async def list_dashboard_async(
        self,
        request: rms_models.ListDashboardRequest,
    ) -> rms_models.ListDashboardResponse:
        """
        Description: 获取大盘列表
        Summary: 获取大盘列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dashboard_ex_async(request, headers, runtime)

    def list_dashboard_ex(
        self,
        request: rms_models.ListDashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListDashboardResponse:
        """
        Description: 获取大盘列表
        Summary: 获取大盘列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListDashboardResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.dashboard.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dashboard_ex_async(
        self,
        request: rms_models.ListDashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListDashboardResponse:
        """
        Description: 获取大盘列表
        Summary: 获取大盘列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListDashboardResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.dashboard.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stack_generatedconfig(
        self,
        request: rms_models.QueryStackGeneratedconfigRequest,
    ) -> rms_models.QueryStackGeneratedconfigResponse:
        """
        Description: 查询技术栈配置详情
        Summary: 查询技术栈配置详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stack_generatedconfig_ex(request, headers, runtime)

    async def query_stack_generatedconfig_async(
        self,
        request: rms_models.QueryStackGeneratedconfigRequest,
    ) -> rms_models.QueryStackGeneratedconfigResponse:
        """
        Description: 查询技术栈配置详情
        Summary: 查询技术栈配置详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stack_generatedconfig_ex_async(request, headers, runtime)

    def query_stack_generatedconfig_ex(
        self,
        request: rms_models.QueryStackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryStackGeneratedconfigResponse:
        """
        Description: 查询技术栈配置详情
        Summary: 查询技术栈配置详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryStackGeneratedconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.stack.generatedconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stack_generatedconfig_ex_async(
        self,
        request: rms_models.QueryStackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryStackGeneratedconfigResponse:
        """
        Description: 查询技术栈配置详情
        Summary: 查询技术栈配置详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryStackGeneratedconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.stack.generatedconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stack_monitoritem(
        self,
        request: rms_models.QueryStackMonitoritemRequest,
    ) -> rms_models.QueryStackMonitoritemResponse:
        """
        Description: 查询监控项
        Summary: 查询监控项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stack_monitoritem_ex(request, headers, runtime)

    async def query_stack_monitoritem_async(
        self,
        request: rms_models.QueryStackMonitoritemRequest,
    ) -> rms_models.QueryStackMonitoritemResponse:
        """
        Description: 查询监控项
        Summary: 查询监控项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stack_monitoritem_ex_async(request, headers, runtime)

    def query_stack_monitoritem_ex(
        self,
        request: rms_models.QueryStackMonitoritemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryStackMonitoritemResponse:
        """
        Description: 查询监控项
        Summary: 查询监控项
        """
        UtilClient.validate_model(request)
        return rms_models.QueryStackMonitoritemResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.stack.monitoritem.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stack_monitoritem_ex_async(
        self,
        request: rms_models.QueryStackMonitoritemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryStackMonitoritemResponse:
        """
        Description: 查询监控项
        Summary: 查询监控项
        """
        UtilClient.validate_model(request)
        return rms_models.QueryStackMonitoritemResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.stack.monitoritem.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_usergroup(
        self,
        request: rms_models.QueryUsergroupRequest,
    ) -> rms_models.QueryUsergroupResponse:
        """
        Description: 分页查询通知组
        Summary: 分页查询通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_usergroup_ex(request, headers, runtime)

    async def query_usergroup_async(
        self,
        request: rms_models.QueryUsergroupRequest,
    ) -> rms_models.QueryUsergroupResponse:
        """
        Description: 分页查询通知组
        Summary: 分页查询通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_usergroup_ex_async(request, headers, runtime)

    def query_usergroup_ex(
        self,
        request: rms_models.QueryUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUsergroupResponse:
        """
        Description: 分页查询通知组
        Summary: 分页查询通知组
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUsergroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.usergroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_usergroup_ex_async(
        self,
        request: rms_models.QueryUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUsergroupResponse:
        """
        Description: 分页查询通知组
        Summary: 分页查询通知组
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUsergroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.usergroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_usergroup(
        self,
        request: rms_models.CreateUsergroupRequest,
    ) -> rms_models.CreateUsergroupResponse:
        """
        Description: 创建通知组
        Summary: 创建通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_usergroup_ex(request, headers, runtime)

    async def create_usergroup_async(
        self,
        request: rms_models.CreateUsergroupRequest,
    ) -> rms_models.CreateUsergroupResponse:
        """
        Description: 创建通知组
        Summary: 创建通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_usergroup_ex_async(request, headers, runtime)

    def create_usergroup_ex(
        self,
        request: rms_models.CreateUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateUsergroupResponse:
        """
        Description: 创建通知组
        Summary: 创建通知组
        """
        UtilClient.validate_model(request)
        return rms_models.CreateUsergroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.usergroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_usergroup_ex_async(
        self,
        request: rms_models.CreateUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateUsergroupResponse:
        """
        Description: 创建通知组
        Summary: 创建通知组
        """
        UtilClient.validate_model(request)
        return rms_models.CreateUsergroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.usergroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_usergroup(
        self,
        request: rms_models.UpdateUsergroupRequest,
    ) -> rms_models.UpdateUsergroupResponse:
        """
        Description: 更新通知组
        Summary: 更新通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_usergroup_ex(request, headers, runtime)

    async def update_usergroup_async(
        self,
        request: rms_models.UpdateUsergroupRequest,
    ) -> rms_models.UpdateUsergroupResponse:
        """
        Description: 更新通知组
        Summary: 更新通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_usergroup_ex_async(request, headers, runtime)

    def update_usergroup_ex(
        self,
        request: rms_models.UpdateUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateUsergroupResponse:
        """
        Description: 更新通知组
        Summary: 更新通知组
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateUsergroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.usergroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_usergroup_ex_async(
        self,
        request: rms_models.UpdateUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateUsergroupResponse:
        """
        Description: 更新通知组
        Summary: 更新通知组
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateUsergroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.usergroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_usergroup(
        self,
        request: rms_models.DeleteUsergroupRequest,
    ) -> rms_models.DeleteUsergroupResponse:
        """
        Description: 删除通知组
        Summary: 删除通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_usergroup_ex(request, headers, runtime)

    async def delete_usergroup_async(
        self,
        request: rms_models.DeleteUsergroupRequest,
    ) -> rms_models.DeleteUsergroupResponse:
        """
        Description: 删除通知组
        Summary: 删除通知组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_usergroup_ex_async(request, headers, runtime)

    def delete_usergroup_ex(
        self,
        request: rms_models.DeleteUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUsergroupResponse:
        """
        Description: 删除通知组
        Summary: 删除通知组
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUsergroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.usergroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_usergroup_ex_async(
        self,
        request: rms_models.DeleteUsergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUsergroupResponse:
        """
        Description: 删除通知组
        Summary: 删除通知组
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUsergroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.usergroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm_trend(
        self,
        request: rms_models.QueryAlarmTrendRequest,
    ) -> rms_models.QueryAlarmTrendResponse:
        """
        Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
        Summary: 查询过去某一时段内的告警趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_trend_ex(request, headers, runtime)

    async def query_alarm_trend_async(
        self,
        request: rms_models.QueryAlarmTrendRequest,
    ) -> rms_models.QueryAlarmTrendResponse:
        """
        Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
        Summary: 查询过去某一时段内的告警趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_trend_ex_async(request, headers, runtime)

    def query_alarm_trend_ex(
        self,
        request: rms_models.QueryAlarmTrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmTrendResponse:
        """
        Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
        Summary: 查询过去某一时段内的告警趋势
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmTrendResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.trend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_trend_ex_async(
        self,
        request: rms_models.QueryAlarmTrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmTrendResponse:
        """
        Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
        Summary: 查询过去某一时段内的告警趋势
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmTrendResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.trend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm_history(
        self,
        request: rms_models.QueryAlarmHistoryRequest,
    ) -> rms_models.QueryAlarmHistoryResponse:
        """
        Description: 查询过去某一时段的告警详情
        Summary: 查询过去某一时段的告警详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_history_ex(request, headers, runtime)

    async def query_alarm_history_async(
        self,
        request: rms_models.QueryAlarmHistoryRequest,
    ) -> rms_models.QueryAlarmHistoryResponse:
        """
        Description: 查询过去某一时段的告警详情
        Summary: 查询过去某一时段的告警详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_history_ex_async(request, headers, runtime)

    def query_alarm_history_ex(
        self,
        request: rms_models.QueryAlarmHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmHistoryResponse:
        """
        Description: 查询过去某一时段的告警详情
        Summary: 查询过去某一时段的告警详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmHistoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.history.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_history_ex_async(
        self,
        request: rms_models.QueryAlarmHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmHistoryResponse:
        """
        Description: 查询过去某一时段的告警详情
        Summary: 查询过去某一时段的告警详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmHistoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.history.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm_subscription(
        self,
        request: rms_models.QueryAlarmSubscriptionRequest,
    ) -> rms_models.QueryAlarmSubscriptionResponse:
        """
        Description: 查询告警订阅
        Summary: 查询告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_subscription_ex(request, headers, runtime)

    async def query_alarm_subscription_async(
        self,
        request: rms_models.QueryAlarmSubscriptionRequest,
    ) -> rms_models.QueryAlarmSubscriptionResponse:
        """
        Description: 查询告警订阅
        Summary: 查询告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_subscription_ex_async(request, headers, runtime)

    def query_alarm_subscription_ex(
        self,
        request: rms_models.QueryAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmSubscriptionResponse:
        """
        Description: 查询告警订阅
        Summary: 查询告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmSubscriptionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.subscription.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_subscription_ex_async(
        self,
        request: rms_models.QueryAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmSubscriptionResponse:
        """
        Description: 查询告警订阅
        Summary: 查询告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmSubscriptionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.subscription.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stack_alarmrule(
        self,
        request: rms_models.QueryStackAlarmruleRequest,
    ) -> rms_models.QueryStackAlarmruleResponse:
        """
        Description: 查询某个应用监控的告警套餐
        Summary: 查询某个应用监控的告警套餐
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stack_alarmrule_ex(request, headers, runtime)

    async def query_stack_alarmrule_async(
        self,
        request: rms_models.QueryStackAlarmruleRequest,
    ) -> rms_models.QueryStackAlarmruleResponse:
        """
        Description: 查询某个应用监控的告警套餐
        Summary: 查询某个应用监控的告警套餐
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stack_alarmrule_ex_async(request, headers, runtime)

    def query_stack_alarmrule_ex(
        self,
        request: rms_models.QueryStackAlarmruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryStackAlarmruleResponse:
        """
        Description: 查询某个应用监控的告警套餐
        Summary: 查询某个应用监控的告警套餐
        """
        UtilClient.validate_model(request)
        return rms_models.QueryStackAlarmruleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.stack.alarmrule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stack_alarmrule_ex_async(
        self,
        request: rms_models.QueryStackAlarmruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryStackAlarmruleResponse:
        """
        Description: 查询某个应用监控的告警套餐
        Summary: 查询某个应用监控的告警套餐
        """
        UtilClient.validate_model(request)
        return rms_models.QueryStackAlarmruleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.stack.alarmrule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_customplugin(
        self,
        request: rms_models.UpdateCustompluginRequest,
    ) -> rms_models.UpdateCustompluginResponse:
        """
        Description: 修改自定义监控指标
        Summary: 修改自定义监控指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_customplugin_ex(request, headers, runtime)

    async def update_customplugin_async(
        self,
        request: rms_models.UpdateCustompluginRequest,
    ) -> rms_models.UpdateCustompluginResponse:
        """
        Description: 修改自定义监控指标
        Summary: 修改自定义监控指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_customplugin_ex_async(request, headers, runtime)

    def update_customplugin_ex(
        self,
        request: rms_models.UpdateCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateCustompluginResponse:
        """
        Description: 修改自定义监控指标
        Summary: 修改自定义监控指标
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateCustompluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.customplugin.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_customplugin_ex_async(
        self,
        request: rms_models.UpdateCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateCustompluginResponse:
        """
        Description: 修改自定义监控指标
        Summary: 修改自定义监控指标
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateCustompluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.customplugin.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_agent(
        self,
        request: rms_models.QueryAgentRequest,
    ) -> rms_models.QueryAgentResponse:
        """
        Description: 查询 agent 安装信息列表
        Summary: 查询 agent 安装信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_agent_ex(request, headers, runtime)

    async def query_agent_async(
        self,
        request: rms_models.QueryAgentRequest,
    ) -> rms_models.QueryAgentResponse:
        """
        Description: 查询 agent 安装信息列表
        Summary: 查询 agent 安装信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_agent_ex_async(request, headers, runtime)

    def query_agent_ex(
        self,
        request: rms_models.QueryAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAgentResponse:
        """
        Description: 查询 agent 安装信息列表
        Summary: 查询 agent 安装信息列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAgentResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_agent_ex_async(
        self,
        request: rms_models.QueryAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAgentResponse:
        """
        Description: 查询 agent 安装信息列表
        Summary: 查询 agent 安装信息列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAgentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def install_agent(
        self,
        request: rms_models.InstallAgentRequest,
    ) -> rms_models.InstallAgentResponse:
        """
        Description: 安装 agent 组件
        Summary: 安装 agent 组件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.install_agent_ex(request, headers, runtime)

    async def install_agent_async(
        self,
        request: rms_models.InstallAgentRequest,
    ) -> rms_models.InstallAgentResponse:
        """
        Description: 安装 agent 组件
        Summary: 安装 agent 组件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.install_agent_ex_async(request, headers, runtime)

    def install_agent_ex(
        self,
        request: rms_models.InstallAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.InstallAgentResponse:
        """
        Description: 安装 agent 组件
        Summary: 安装 agent 组件
        """
        UtilClient.validate_model(request)
        return rms_models.InstallAgentResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.install', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def install_agent_ex_async(
        self,
        request: rms_models.InstallAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.InstallAgentResponse:
        """
        Description: 安装 agent 组件
        Summary: 安装 agent 组件
        """
        UtilClient.validate_model(request)
        return rms_models.InstallAgentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.install', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_agent_version(
        self,
        request: rms_models.GetAgentVersionRequest,
    ) -> rms_models.GetAgentVersionResponse:
        """
        Description: 获取需要安装的 agent 版本
        Summary: 获取需要安装的 agent 版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_agent_version_ex(request, headers, runtime)

    async def get_agent_version_async(
        self,
        request: rms_models.GetAgentVersionRequest,
    ) -> rms_models.GetAgentVersionResponse:
        """
        Description: 获取需要安装的 agent 版本
        Summary: 获取需要安装的 agent 版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_agent_version_ex_async(request, headers, runtime)

    def get_agent_version_ex(
        self,
        request: rms_models.GetAgentVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAgentVersionResponse:
        """
        Description: 获取需要安装的 agent 版本
        Summary: 获取需要安装的 agent 版本
        """
        UtilClient.validate_model(request)
        return rms_models.GetAgentVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.version.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_agent_version_ex_async(
        self,
        request: rms_models.GetAgentVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAgentVersionResponse:
        """
        Description: 获取需要安装的 agent 版本
        Summary: 获取需要安装的 agent 版本
        """
        UtilClient.validate_model(request)
        return rms_models.GetAgentVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.version.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_agent_version(
        self,
        request: rms_models.EnableAgentVersionRequest,
    ) -> rms_models.EnableAgentVersionResponse:
        """
        Description:  设置默认最新agent版本
        Summary:  设置默认最新agent版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_agent_version_ex(request, headers, runtime)

    async def enable_agent_version_async(
        self,
        request: rms_models.EnableAgentVersionRequest,
    ) -> rms_models.EnableAgentVersionResponse:
        """
        Description:  设置默认最新agent版本
        Summary:  设置默认最新agent版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_agent_version_ex_async(request, headers, runtime)

    def enable_agent_version_ex(
        self,
        request: rms_models.EnableAgentVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.EnableAgentVersionResponse:
        """
        Description:  设置默认最新agent版本
        Summary:  设置默认最新agent版本
        """
        UtilClient.validate_model(request)
        return rms_models.EnableAgentVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.version.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_agent_version_ex_async(
        self,
        request: rms_models.EnableAgentVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.EnableAgentVersionResponse:
        """
        Description:  设置默认最新agent版本
        Summary:  设置默认最新agent版本
        """
        UtilClient.validate_model(request)
        return rms_models.EnableAgentVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.version.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspace(
        self,
        request: rms_models.GetWorkspaceRequest,
    ) -> rms_models.GetWorkspaceResponse:
        """
        Description: 获取当前工作空间
        Summary: 获取当前工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspace_ex(request, headers, runtime)

    async def get_workspace_async(
        self,
        request: rms_models.GetWorkspaceRequest,
    ) -> rms_models.GetWorkspaceResponse:
        """
        Description: 获取当前工作空间
        Summary: 获取当前工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspace_ex_async(request, headers, runtime)

    def get_workspace_ex(
        self,
        request: rms_models.GetWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetWorkspaceResponse:
        """
        Description: 获取当前工作空间
        Summary: 获取当前工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.GetWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspace_ex_async(
        self,
        request: rms_models.GetWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetWorkspaceResponse:
        """
        Description: 获取当前工作空间
        Summary: 获取当前工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.GetWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tenant(
        self,
        request: rms_models.GetTenantRequest,
    ) -> rms_models.GetTenantResponse:
        """
        Description: 获取当前租户
        Summary: 获取当前租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tenant_ex(request, headers, runtime)

    async def get_tenant_async(
        self,
        request: rms_models.GetTenantRequest,
    ) -> rms_models.GetTenantResponse:
        """
        Description: 获取当前租户
        Summary: 获取当前租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tenant_ex_async(request, headers, runtime)

    def get_tenant_ex(
        self,
        request: rms_models.GetTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTenantResponse:
        """
        Description: 获取当前租户
        Summary: 获取当前租户
        """
        UtilClient.validate_model(request)
        return rms_models.GetTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tenant_ex_async(
        self,
        request: rms_models.GetTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTenantResponse:
        """
        Description: 获取当前租户
        Summary: 获取当前租户
        """
        UtilClient.validate_model(request)
        return rms_models.GetTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_kernelstack_generatedconfig(
        self,
        request: rms_models.QueryKernelstackGeneratedconfigRequest,
    ) -> rms_models.QueryKernelstackGeneratedconfigResponse:
        """
        Description: 查询核心态监控配置
        Summary: 查询核心态监控配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_kernelstack_generatedconfig_ex(request, headers, runtime)

    async def query_kernelstack_generatedconfig_async(
        self,
        request: rms_models.QueryKernelstackGeneratedconfigRequest,
    ) -> rms_models.QueryKernelstackGeneratedconfigResponse:
        """
        Description: 查询核心态监控配置
        Summary: 查询核心态监控配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_kernelstack_generatedconfig_ex_async(request, headers, runtime)

    def query_kernelstack_generatedconfig_ex(
        self,
        request: rms_models.QueryKernelstackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryKernelstackGeneratedconfigResponse:
        """
        Description: 查询核心态监控配置
        Summary: 查询核心态监控配置
        """
        UtilClient.validate_model(request)
        return rms_models.QueryKernelstackGeneratedconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.kernelstack.generatedconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_kernelstack_generatedconfig_ex_async(
        self,
        request: rms_models.QueryKernelstackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryKernelstackGeneratedconfigResponse:
        """
        Description: 查询核心态监控配置
        Summary: 查询核心态监控配置
        """
        UtilClient.validate_model(request)
        return rms_models.QueryKernelstackGeneratedconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.kernelstack.generatedconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_aliyun_status(
        self,
        request: rms_models.GetAliyunStatusRequest,
    ) -> rms_models.GetAliyunStatusResponse:
        """
        Description: 获取阿里云开通状态
        Summary: 获取阿里云开通状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_aliyun_status_ex(request, headers, runtime)

    async def get_aliyun_status_async(
        self,
        request: rms_models.GetAliyunStatusRequest,
    ) -> rms_models.GetAliyunStatusResponse:
        """
        Description: 获取阿里云开通状态
        Summary: 获取阿里云开通状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_aliyun_status_ex_async(request, headers, runtime)

    def get_aliyun_status_ex(
        self,
        request: rms_models.GetAliyunStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAliyunStatusResponse:
        """
        Description: 获取阿里云开通状态
        Summary: 获取阿里云开通状态
        """
        UtilClient.validate_model(request)
        return rms_models.GetAliyunStatusResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.aliyun.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_aliyun_status_ex_async(
        self,
        request: rms_models.GetAliyunStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAliyunStatusResponse:
        """
        Description: 获取阿里云开通状态
        Summary: 获取阿里云开通状态
        """
        UtilClient.validate_model(request)
        return rms_models.GetAliyunStatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.aliyun.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_workspace(
        self,
        request: rms_models.OpenWorkspaceRequest,
    ) -> rms_models.OpenWorkspaceResponse:
        """
        Description: 监控工作空间开通
        Summary: 监控工作空间开通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_workspace_ex(request, headers, runtime)

    async def open_workspace_async(
        self,
        request: rms_models.OpenWorkspaceRequest,
    ) -> rms_models.OpenWorkspaceResponse:
        """
        Description: 监控工作空间开通
        Summary: 监控工作空间开通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_workspace_ex_async(request, headers, runtime)

    def open_workspace_ex(
        self,
        request: rms_models.OpenWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.OpenWorkspaceResponse:
        """
        Description: 监控工作空间开通
        Summary: 监控工作空间开通
        """
        UtilClient.validate_model(request)
        return rms_models.OpenWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.workspace.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_workspace_ex_async(
        self,
        request: rms_models.OpenWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.OpenWorkspaceResponse:
        """
        Description: 监控工作空间开通
        Summary: 监控工作空间开通
        """
        UtilClient.validate_model(request)
        return rms_models.OpenWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.workspace.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_stack_generatedconfig(
        self,
        request: rms_models.UpdateStackGeneratedconfigRequest,
    ) -> rms_models.UpdateStackGeneratedconfigResponse:
        """
        Description: 更新技术栈配置
        Summary: 更新技术栈配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_stack_generatedconfig_ex(request, headers, runtime)

    async def update_stack_generatedconfig_async(
        self,
        request: rms_models.UpdateStackGeneratedconfigRequest,
    ) -> rms_models.UpdateStackGeneratedconfigResponse:
        """
        Description: 更新技术栈配置
        Summary: 更新技术栈配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_stack_generatedconfig_ex_async(request, headers, runtime)

    def update_stack_generatedconfig_ex(
        self,
        request: rms_models.UpdateStackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateStackGeneratedconfigResponse:
        """
        Description: 更新技术栈配置
        Summary: 更新技术栈配置
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateStackGeneratedconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.stack.generatedconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_stack_generatedconfig_ex_async(
        self,
        request: rms_models.UpdateStackGeneratedconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateStackGeneratedconfigResponse:
        """
        Description: 更新技术栈配置
        Summary: 更新技术栈配置
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateStackGeneratedconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.stack.generatedconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user(
        self,
        request: rms_models.QueryUserRequest,
    ) -> rms_models.QueryUserResponse:
        """
        Description: 查询用户列表
        Summary: 查询用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_ex(request, headers, runtime)

    async def query_user_async(
        self,
        request: rms_models.QueryUserRequest,
    ) -> rms_models.QueryUserResponse:
        """
        Description: 查询用户列表
        Summary: 查询用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_ex_async(request, headers, runtime)

    def query_user_ex(
        self,
        request: rms_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUserResponse:
        """
        Description: 查询用户列表
        Summary: 查询用户列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUserResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_ex_async(
        self,
        request: rms_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUserResponse:
        """
        Description: 查询用户列表
        Summary: 查询用户列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_auth(
        self,
        request: rms_models.ListAuthRequest,
    ) -> rms_models.ListAuthResponse:
        """
        Description: 获取用户权限列表
        Summary: 获取用户权限列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_auth_ex(request, headers, runtime)

    async def list_auth_async(
        self,
        request: rms_models.ListAuthRequest,
    ) -> rms_models.ListAuthResponse:
        """
        Description: 获取用户权限列表
        Summary: 获取用户权限列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_auth_ex_async(request, headers, runtime)

    def list_auth_ex(
        self,
        request: rms_models.ListAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAuthResponse:
        """
        Description: 获取用户权限列表
        Summary: 获取用户权限列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAuthResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.auth.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_auth_ex_async(
        self,
        request: rms_models.ListAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAuthResponse:
        """
        Description: 获取用户权限列表
        Summary: 获取用户权限列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAuthResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.auth.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_auth(
        self,
        request: rms_models.DeleteAuthRequest,
    ) -> rms_models.DeleteAuthResponse:
        """
        Description: 删除用户权限
        Summary: 删除用户权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_auth_ex(request, headers, runtime)

    async def delete_auth_async(
        self,
        request: rms_models.DeleteAuthRequest,
    ) -> rms_models.DeleteAuthResponse:
        """
        Description: 删除用户权限
        Summary: 删除用户权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_auth_ex_async(request, headers, runtime)

    def delete_auth_ex(
        self,
        request: rms_models.DeleteAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAuthResponse:
        """
        Description: 删除用户权限
        Summary: 删除用户权限
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAuthResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.auth.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_auth_ex_async(
        self,
        request: rms_models.DeleteAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAuthResponse:
        """
        Description: 删除用户权限
        Summary: 删除用户权限
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAuthResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.auth.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_auth(
        self,
        request: rms_models.CreateAuthRequest,
    ) -> rms_models.CreateAuthResponse:
        """
        Description: 新建用户权限
        Summary: 新建用户权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_auth_ex(request, headers, runtime)

    async def create_auth_async(
        self,
        request: rms_models.CreateAuthRequest,
    ) -> rms_models.CreateAuthResponse:
        """
        Description: 新建用户权限
        Summary: 新建用户权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_auth_ex_async(request, headers, runtime)

    def create_auth_ex(
        self,
        request: rms_models.CreateAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAuthResponse:
        """
        Description: 新建用户权限
        Summary: 新建用户权限
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAuthResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.auth.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_auth_ex_async(
        self,
        request: rms_models.CreateAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAuthResponse:
        """
        Description: 新建用户权限
        Summary: 新建用户权限
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAuthResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.auth.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_user_favorite(
        self,
        request: rms_models.BatchcreateUserFavoriteRequest,
    ) -> rms_models.BatchcreateUserFavoriteResponse:
        """
        Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
        Summary: 用户添加收藏资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_user_favorite_ex(request, headers, runtime)

    async def batchcreate_user_favorite_async(
        self,
        request: rms_models.BatchcreateUserFavoriteRequest,
    ) -> rms_models.BatchcreateUserFavoriteResponse:
        """
        Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
        Summary: 用户添加收藏资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_user_favorite_ex_async(request, headers, runtime)

    def batchcreate_user_favorite_ex(
        self,
        request: rms_models.BatchcreateUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUserFavoriteResponse:
        """
        Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
        Summary: 用户添加收藏资源
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUserFavoriteResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.favorite.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_user_favorite_ex_async(
        self,
        request: rms_models.BatchcreateUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUserFavoriteResponse:
        """
        Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
        Summary: 用户添加收藏资源
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUserFavoriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.favorite.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_user_favorite(
        self,
        request: rms_models.BatchdeleteUserFavoriteRequest,
    ) -> rms_models.BatchdeleteUserFavoriteResponse:
        """
        Description: 批量取消收藏
        Summary: 批量取消收藏
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_user_favorite_ex(request, headers, runtime)

    async def batchdelete_user_favorite_async(
        self,
        request: rms_models.BatchdeleteUserFavoriteRequest,
    ) -> rms_models.BatchdeleteUserFavoriteResponse:
        """
        Description: 批量取消收藏
        Summary: 批量取消收藏
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_user_favorite_ex_async(request, headers, runtime)

    def batchdelete_user_favorite_ex(
        self,
        request: rms_models.BatchdeleteUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteUserFavoriteResponse:
        """
        Description: 批量取消收藏
        Summary: 批量取消收藏
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteUserFavoriteResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.favorite.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_user_favorite_ex_async(
        self,
        request: rms_models.BatchdeleteUserFavoriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteUserFavoriteResponse:
        """
        Description: 批量取消收藏
        Summary: 批量取消收藏
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteUserFavoriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.favorite.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_operation(
        self,
        request: rms_models.QueryUserOperationRequest,
    ) -> rms_models.QueryUserOperationResponse:
        """
        Description: 分页查询用户的操作历史
        Summary: 查询用户的操作历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_operation_ex(request, headers, runtime)

    async def query_user_operation_async(
        self,
        request: rms_models.QueryUserOperationRequest,
    ) -> rms_models.QueryUserOperationResponse:
        """
        Description: 分页查询用户的操作历史
        Summary: 查询用户的操作历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_operation_ex_async(request, headers, runtime)

    def query_user_operation_ex(
        self,
        request: rms_models.QueryUserOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUserOperationResponse:
        """
        Description: 分页查询用户的操作历史
        Summary: 查询用户的操作历史
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUserOperationResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.operation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_operation_ex_async(
        self,
        request: rms_models.QueryUserOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUserOperationResponse:
        """
        Description: 分页查询用户的操作历史
        Summary: 查询用户的操作历史
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUserOperationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.operation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_alarm_subscription(
        self,
        request: rms_models.CreateAlarmSubscriptionRequest,
    ) -> rms_models.CreateAlarmSubscriptionResponse:
        """
        Description: 新增告警订阅
        Summary: 新增告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_alarm_subscription_ex(request, headers, runtime)

    async def create_alarm_subscription_async(
        self,
        request: rms_models.CreateAlarmSubscriptionRequest,
    ) -> rms_models.CreateAlarmSubscriptionResponse:
        """
        Description: 新增告警订阅
        Summary: 新增告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_alarm_subscription_ex_async(request, headers, runtime)

    def create_alarm_subscription_ex(
        self,
        request: rms_models.CreateAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAlarmSubscriptionResponse:
        """
        Description: 新增告警订阅
        Summary: 新增告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAlarmSubscriptionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.subscription.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_alarm_subscription_ex_async(
        self,
        request: rms_models.CreateAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAlarmSubscriptionResponse:
        """
        Description: 新增告警订阅
        Summary: 新增告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAlarmSubscriptionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.subscription.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_alarm_subscription(
        self,
        request: rms_models.DeleteAlarmSubscriptionRequest,
    ) -> rms_models.DeleteAlarmSubscriptionResponse:
        """
        Description: 取消告警订阅 (删除)
        Summary: 取消告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_alarm_subscription_ex(request, headers, runtime)

    async def delete_alarm_subscription_async(
        self,
        request: rms_models.DeleteAlarmSubscriptionRequest,
    ) -> rms_models.DeleteAlarmSubscriptionResponse:
        """
        Description: 取消告警订阅 (删除)
        Summary: 取消告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_alarm_subscription_ex_async(request, headers, runtime)

    def delete_alarm_subscription_ex(
        self,
        request: rms_models.DeleteAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAlarmSubscriptionResponse:
        """
        Description: 取消告警订阅 (删除)
        Summary: 取消告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAlarmSubscriptionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.subscription.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_alarm_subscription_ex_async(
        self,
        request: rms_models.DeleteAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAlarmSubscriptionResponse:
        """
        Description: 取消告警订阅 (删除)
        Summary: 取消告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAlarmSubscriptionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.subscription.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pause_alarm(
        self,
        request: rms_models.PauseAlarmRequest,
    ) -> rms_models.PauseAlarmResponse:
        """
        Description: 暂停告警
        Summary: 暂停告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pause_alarm_ex(request, headers, runtime)

    async def pause_alarm_async(
        self,
        request: rms_models.PauseAlarmRequest,
    ) -> rms_models.PauseAlarmResponse:
        """
        Description: 暂停告警
        Summary: 暂停告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pause_alarm_ex_async(request, headers, runtime)

    def pause_alarm_ex(
        self,
        request: rms_models.PauseAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PauseAlarmResponse:
        """
        Description: 暂停告警
        Summary: 暂停告警
        """
        UtilClient.validate_model(request)
        return rms_models.PauseAlarmResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pause_alarm_ex_async(
        self,
        request: rms_models.PauseAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PauseAlarmResponse:
        """
        Description: 暂停告警
        Summary: 暂停告警
        """
        UtilClient.validate_model(request)
        return rms_models.PauseAlarmResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_alarm(
        self,
        request: rms_models.ResumeAlarmRequest,
    ) -> rms_models.ResumeAlarmResponse:
        """
        Description: 恢复告警
        Summary: 恢复告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_alarm_ex(request, headers, runtime)

    async def resume_alarm_async(
        self,
        request: rms_models.ResumeAlarmRequest,
    ) -> rms_models.ResumeAlarmResponse:
        """
        Description: 恢复告警
        Summary: 恢复告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_alarm_ex_async(request, headers, runtime)

    def resume_alarm_ex(
        self,
        request: rms_models.ResumeAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ResumeAlarmResponse:
        """
        Description: 恢复告警
        Summary: 恢复告警
        """
        UtilClient.validate_model(request)
        return rms_models.ResumeAlarmResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_alarm_ex_async(
        self,
        request: rms_models.ResumeAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ResumeAlarmResponse:
        """
        Description: 恢复告警
        Summary: 恢复告警
        """
        UtilClient.validate_model(request)
        return rms_models.ResumeAlarmResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_log_tail(
        self,
        request: rms_models.GetLogTailRequest,
    ) -> rms_models.GetLogTailResponse:
        """
        Description: 拉取日志，返回LogTail
        Summary: 拉取日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_log_tail_ex(request, headers, runtime)

    async def get_log_tail_async(
        self,
        request: rms_models.GetLogTailRequest,
    ) -> rms_models.GetLogTailResponse:
        """
        Description: 拉取日志，返回LogTail
        Summary: 拉取日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_log_tail_ex_async(request, headers, runtime)

    def get_log_tail_ex(
        self,
        request: rms_models.GetLogTailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetLogTailResponse:
        """
        Description: 拉取日志，返回LogTail
        Summary: 拉取日志
        """
        UtilClient.validate_model(request)
        return rms_models.GetLogTailResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.log.tail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_log_tail_ex_async(
        self,
        request: rms_models.GetLogTailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetLogTailResponse:
        """
        Description: 拉取日志，返回LogTail
        Summary: 拉取日志
        """
        UtilClient.validate_model(request)
        return rms_models.GetLogTailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.log.tail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_log_browser(
        self,
        request: rms_models.GetLogBrowserRequest,
    ) -> rms_models.GetLogBrowserResponse:
        """
        Description: 获取文件浏览结果
        Summary: 获取文件浏览结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_log_browser_ex(request, headers, runtime)

    async def get_log_browser_async(
        self,
        request: rms_models.GetLogBrowserRequest,
    ) -> rms_models.GetLogBrowserResponse:
        """
        Description: 获取文件浏览结果
        Summary: 获取文件浏览结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_log_browser_ex_async(request, headers, runtime)

    def get_log_browser_ex(
        self,
        request: rms_models.GetLogBrowserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetLogBrowserResponse:
        """
        Description: 获取文件浏览结果
        Summary: 获取文件浏览结果
        """
        UtilClient.validate_model(request)
        return rms_models.GetLogBrowserResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.log.browser.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_log_browser_ex_async(
        self,
        request: rms_models.GetLogBrowserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetLogBrowserResponse:
        """
        Description: 获取文件浏览结果
        Summary: 获取文件浏览结果
        """
        UtilClient.validate_model(request)
        return rms_models.GetLogBrowserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.log.browser.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_folder(
        self,
        request: rms_models.DeleteFolderRequest,
    ) -> rms_models.DeleteFolderResponse:
        """
        Description: 按ID删除文件夹
        Summary: 删除文件夹
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_folder_ex(request, headers, runtime)

    async def delete_folder_async(
        self,
        request: rms_models.DeleteFolderRequest,
    ) -> rms_models.DeleteFolderResponse:
        """
        Description: 按ID删除文件夹
        Summary: 删除文件夹
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_folder_ex_async(request, headers, runtime)

    def delete_folder_ex(
        self,
        request: rms_models.DeleteFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteFolderResponse:
        """
        Description: 按ID删除文件夹
        Summary: 删除文件夹
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteFolderResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.folder.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_folder_ex_async(
        self,
        request: rms_models.DeleteFolderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteFolderResponse:
        """
        Description: 按ID删除文件夹
        Summary: 删除文件夹
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteFolderResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.folder.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_app_overview(
        self,
        request: rms_models.GetAppOverviewRequest,
    ) -> rms_models.GetAppOverviewResponse:
        """
        Description: 获取总览页应用统计信息
        Summary: 获取总览页应用统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_app_overview_ex(request, headers, runtime)

    async def get_app_overview_async(
        self,
        request: rms_models.GetAppOverviewRequest,
    ) -> rms_models.GetAppOverviewResponse:
        """
        Description: 获取总览页应用统计信息
        Summary: 获取总览页应用统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_app_overview_ex_async(request, headers, runtime)

    def get_app_overview_ex(
        self,
        request: rms_models.GetAppOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAppOverviewResponse:
        """
        Description: 获取总览页应用统计信息
        Summary: 获取总览页应用统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.GetAppOverviewResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_app_overview_ex_async(
        self,
        request: rms_models.GetAppOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAppOverviewResponse:
        """
        Description: 获取总览页应用统计信息
        Summary: 获取总览页应用统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.GetAppOverviewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_history(
        self,
        request: rms_models.QueryUnifiedalarmHistoryRequest,
    ) -> rms_models.QueryUnifiedalarmHistoryResponse:
        """
        Description: 查询统一告警历史记录
        Summary: 查询统一告警历史记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_history_ex(request, headers, runtime)

    async def query_unifiedalarm_history_async(
        self,
        request: rms_models.QueryUnifiedalarmHistoryRequest,
    ) -> rms_models.QueryUnifiedalarmHistoryResponse:
        """
        Description: 查询统一告警历史记录
        Summary: 查询统一告警历史记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_history_ex_async(request, headers, runtime)

    def query_unifiedalarm_history_ex(
        self,
        request: rms_models.QueryUnifiedalarmHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmHistoryResponse:
        """
        Description: 查询统一告警历史记录
        Summary: 查询统一告警历史记录
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmHistoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.history.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_history_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmHistoryResponse:
        """
        Description: 查询统一告警历史记录
        Summary: 查询统一告警历史记录
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmHistoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.history.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_alarm_test(
        self,
        request: rms_models.GetAlarmTestRequest,
    ) -> rms_models.GetAlarmTestResponse:
        """
        Description: 测试演示
        Summary: 测试演示
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_alarm_test_ex(request, headers, runtime)

    async def get_alarm_test_async(
        self,
        request: rms_models.GetAlarmTestRequest,
    ) -> rms_models.GetAlarmTestResponse:
        """
        Description: 测试演示
        Summary: 测试演示
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_alarm_test_ex_async(request, headers, runtime)

    def get_alarm_test_ex(
        self,
        request: rms_models.GetAlarmTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAlarmTestResponse:
        """
        Description: 测试演示
        Summary: 测试演示
        """
        UtilClient.validate_model(request)
        return rms_models.GetAlarmTestResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.test.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_alarm_test_ex_async(
        self,
        request: rms_models.GetAlarmTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAlarmTestResponse:
        """
        Description: 测试演示
        Summary: 测试演示
        """
        UtilClient.validate_model(request)
        return rms_models.GetAlarmTestResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.test.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarmwebhook(
        self,
        request: rms_models.QueryAlarmwebhookRequest,
    ) -> rms_models.QueryAlarmwebhookResponse:
        """
        Description: 获取webhook列表
        Summary: 获取webhook列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarmwebhook_ex(request, headers, runtime)

    async def query_alarmwebhook_async(
        self,
        request: rms_models.QueryAlarmwebhookRequest,
    ) -> rms_models.QueryAlarmwebhookResponse:
        """
        Description: 获取webhook列表
        Summary: 获取webhook列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarmwebhook_ex_async(request, headers, runtime)

    def query_alarmwebhook_ex(
        self,
        request: rms_models.QueryAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmwebhookResponse:
        """
        Description: 获取webhook列表
        Summary: 获取webhook列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmwebhookResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarmwebhook.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarmwebhook_ex_async(
        self,
        request: rms_models.QueryAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmwebhookResponse:
        """
        Description: 获取webhook列表
        Summary: 获取webhook列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmwebhookResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarmwebhook.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_unifiedalarm_rule(
        self,
        request: rms_models.CreateUnifiedalarmRuleRequest,
    ) -> rms_models.CreateUnifiedalarmRuleResponse:
        """
        Description: 创建告警规则
        Summary: 创建告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_unifiedalarm_rule_ex(request, headers, runtime)

    async def create_unifiedalarm_rule_async(
        self,
        request: rms_models.CreateUnifiedalarmRuleRequest,
    ) -> rms_models.CreateUnifiedalarmRuleResponse:
        """
        Description: 创建告警规则
        Summary: 创建告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_unifiedalarm_rule_ex_async(request, headers, runtime)

    def create_unifiedalarm_rule_ex(
        self,
        request: rms_models.CreateUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateUnifiedalarmRuleResponse:
        """
        Description: 创建告警规则
        Summary: 创建告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.CreateUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.CreateUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateUnifiedalarmRuleResponse:
        """
        Description: 创建告警规则
        Summary: 创建告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.CreateUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_unifiedalarm_rule(
        self,
        request: rms_models.UpdateUnifiedalarmRuleRequest,
    ) -> rms_models.UpdateUnifiedalarmRuleResponse:
        """
        Description: 更新告警规则
        Summary: 更新告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_unifiedalarm_rule_ex(request, headers, runtime)

    async def update_unifiedalarm_rule_async(
        self,
        request: rms_models.UpdateUnifiedalarmRuleRequest,
    ) -> rms_models.UpdateUnifiedalarmRuleResponse:
        """
        Description: 更新告警规则
        Summary: 更新告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_unifiedalarm_rule_ex_async(request, headers, runtime)

    def update_unifiedalarm_rule_ex(
        self,
        request: rms_models.UpdateUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateUnifiedalarmRuleResponse:
        """
        Description: 更新告警规则
        Summary: 更新告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.UpdateUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateUnifiedalarmRuleResponse:
        """
        Description: 更新告警规则
        Summary: 更新告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_rule(
        self,
        request: rms_models.QueryUnifiedalarmRuleRequest,
    ) -> rms_models.QueryUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则列表
        Summary: 查询告警规则列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_rule_ex(request, headers, runtime)

    async def query_unifiedalarm_rule_async(
        self,
        request: rms_models.QueryUnifiedalarmRuleRequest,
    ) -> rms_models.QueryUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则列表
        Summary: 查询告警规则列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_rule_ex_async(request, headers, runtime)

    def query_unifiedalarm_rule_ex(
        self,
        request: rms_models.QueryUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则列表
        Summary: 查询告警规则列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则列表
        Summary: 查询告警规则列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unifiedalarm_rule(
        self,
        request: rms_models.GetUnifiedalarmRuleRequest,
    ) -> rms_models.GetUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则详情
        Summary: 查询告警规则详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unifiedalarm_rule_ex(request, headers, runtime)

    async def get_unifiedalarm_rule_async(
        self,
        request: rms_models.GetUnifiedalarmRuleRequest,
    ) -> rms_models.GetUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则详情
        Summary: 查询告警规则详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unifiedalarm_rule_ex_async(request, headers, runtime)

    def get_unifiedalarm_rule_ex(
        self,
        request: rms_models.GetUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则详情
        Summary: 查询告警规则详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.GetUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetUnifiedalarmRuleResponse:
        """
        Description: 查询告警规则详情
        Summary: 查询告警规则详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_unifiedalarm_rule(
        self,
        request: rms_models.DeleteUnifiedalarmRuleRequest,
    ) -> rms_models.DeleteUnifiedalarmRuleResponse:
        """
        Description: 删除告警规则
        Summary: 删除告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_unifiedalarm_rule_ex(request, headers, runtime)

    async def delete_unifiedalarm_rule_async(
        self,
        request: rms_models.DeleteUnifiedalarmRuleRequest,
    ) -> rms_models.DeleteUnifiedalarmRuleResponse:
        """
        Description: 删除告警规则
        Summary: 删除告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_unifiedalarm_rule_ex_async(request, headers, runtime)

    def delete_unifiedalarm_rule_ex(
        self,
        request: rms_models.DeleteUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUnifiedalarmRuleResponse:
        """
        Description: 删除告警规则
        Summary: 删除告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.DeleteUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUnifiedalarmRuleResponse:
        """
        Description: 删除告警规则
        Summary: 删除告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_notifyhistory(
        self,
        request: rms_models.QueryUnifiedalarmNotifyhistoryRequest,
    ) -> rms_models.QueryUnifiedalarmNotifyhistoryResponse:
        """
        Description: 查询告警消息历史
        Summary: 查询告警消息历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_notifyhistory_ex(request, headers, runtime)

    async def query_unifiedalarm_notifyhistory_async(
        self,
        request: rms_models.QueryUnifiedalarmNotifyhistoryRequest,
    ) -> rms_models.QueryUnifiedalarmNotifyhistoryResponse:
        """
        Description: 查询告警消息历史
        Summary: 查询告警消息历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_notifyhistory_ex_async(request, headers, runtime)

    def query_unifiedalarm_notifyhistory_ex(
        self,
        request: rms_models.QueryUnifiedalarmNotifyhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmNotifyhistoryResponse:
        """
        Description: 查询告警消息历史
        Summary: 查询告警消息历史
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmNotifyhistoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.notifyhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_notifyhistory_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmNotifyhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmNotifyhistoryResponse:
        """
        Description: 查询告警消息历史
        Summary: 查询告警消息历史
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmNotifyhistoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.notifyhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_unifiedalarm_sub(
        self,
        request: rms_models.BatchcreateUnifiedalarmSubRequest,
    ) -> rms_models.BatchcreateUnifiedalarmSubResponse:
        """
        Description: 批量订阅告警
        Summary: 批量订阅告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_unifiedalarm_sub_ex(request, headers, runtime)

    async def batchcreate_unifiedalarm_sub_async(
        self,
        request: rms_models.BatchcreateUnifiedalarmSubRequest,
    ) -> rms_models.BatchcreateUnifiedalarmSubResponse:
        """
        Description: 批量订阅告警
        Summary: 批量订阅告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_unifiedalarm_sub_ex_async(request, headers, runtime)

    def batchcreate_unifiedalarm_sub_ex(
        self,
        request: rms_models.BatchcreateUnifiedalarmSubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUnifiedalarmSubResponse:
        """
        Description: 批量订阅告警
        Summary: 批量订阅告警
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUnifiedalarmSubResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.sub.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_unifiedalarm_sub_ex_async(
        self,
        request: rms_models.BatchcreateUnifiedalarmSubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUnifiedalarmSubResponse:
        """
        Description: 批量订阅告警
        Summary: 批量订阅告警
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUnifiedalarmSubResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.sub.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_unifiedalarm_sub(
        self,
        request: rms_models.DeleteUnifiedalarmSubRequest,
    ) -> rms_models.DeleteUnifiedalarmSubResponse:
        """
        Description: 取消订阅
        Summary: 批量取消订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_unifiedalarm_sub_ex(request, headers, runtime)

    async def delete_unifiedalarm_sub_async(
        self,
        request: rms_models.DeleteUnifiedalarmSubRequest,
    ) -> rms_models.DeleteUnifiedalarmSubResponse:
        """
        Description: 取消订阅
        Summary: 批量取消订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_unifiedalarm_sub_ex_async(request, headers, runtime)

    def delete_unifiedalarm_sub_ex(
        self,
        request: rms_models.DeleteUnifiedalarmSubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUnifiedalarmSubResponse:
        """
        Description: 取消订阅
        Summary: 批量取消订阅
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUnifiedalarmSubResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.sub.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_unifiedalarm_sub_ex_async(
        self,
        request: rms_models.DeleteUnifiedalarmSubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUnifiedalarmSubResponse:
        """
        Description: 取消订阅
        Summary: 批量取消订阅
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUnifiedalarmSubResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.sub.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_sub(
        self,
        request: rms_models.QueryUnifiedalarmSubRequest,
    ) -> rms_models.QueryUnifiedalarmSubResponse:
        """
        Description: 查询告警订阅关系列表
        Summary: 查询告警订阅关系列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_sub_ex(request, headers, runtime)

    async def query_unifiedalarm_sub_async(
        self,
        request: rms_models.QueryUnifiedalarmSubRequest,
    ) -> rms_models.QueryUnifiedalarmSubResponse:
        """
        Description: 查询告警订阅关系列表
        Summary: 查询告警订阅关系列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_sub_ex_async(request, headers, runtime)

    def query_unifiedalarm_sub_ex(
        self,
        request: rms_models.QueryUnifiedalarmSubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmSubResponse:
        """
        Description: 查询告警订阅关系列表
        Summary: 查询告警订阅关系列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmSubResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.sub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_sub_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmSubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmSubResponse:
        """
        Description: 查询告警订阅关系列表
        Summary: 查询告警订阅关系列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmSubResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.sub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_unifiedalarm_tpl(
        self,
        request: rms_models.CreateUnifiedalarmTplRequest,
    ) -> rms_models.CreateUnifiedalarmTplResponse:
        """
        Description: 创建告警规则模板
        Summary: 创建告警规则模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_unifiedalarm_tpl_ex(request, headers, runtime)

    async def create_unifiedalarm_tpl_async(
        self,
        request: rms_models.CreateUnifiedalarmTplRequest,
    ) -> rms_models.CreateUnifiedalarmTplResponse:
        """
        Description: 创建告警规则模板
        Summary: 创建告警规则模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_unifiedalarm_tpl_ex_async(request, headers, runtime)

    def create_unifiedalarm_tpl_ex(
        self,
        request: rms_models.CreateUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateUnifiedalarmTplResponse:
        """
        Description: 创建告警规则模板
        Summary: 创建告警规则模板
        """
        UtilClient.validate_model(request)
        return rms_models.CreateUnifiedalarmTplResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.tpl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_unifiedalarm_tpl_ex_async(
        self,
        request: rms_models.CreateUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateUnifiedalarmTplResponse:
        """
        Description: 创建告警规则模板
        Summary: 创建告警规则模板
        """
        UtilClient.validate_model(request)
        return rms_models.CreateUnifiedalarmTplResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.tpl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_unifiedalarm_tpl(
        self,
        request: rms_models.UpdateUnifiedalarmTplRequest,
    ) -> rms_models.UpdateUnifiedalarmTplResponse:
        """
        Description: 更新告警规则模板
        Summary: 更新告警规则模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_unifiedalarm_tpl_ex(request, headers, runtime)

    async def update_unifiedalarm_tpl_async(
        self,
        request: rms_models.UpdateUnifiedalarmTplRequest,
    ) -> rms_models.UpdateUnifiedalarmTplResponse:
        """
        Description: 更新告警规则模板
        Summary: 更新告警规则模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_unifiedalarm_tpl_ex_async(request, headers, runtime)

    def update_unifiedalarm_tpl_ex(
        self,
        request: rms_models.UpdateUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateUnifiedalarmTplResponse:
        """
        Description: 更新告警规则模板
        Summary: 更新告警规则模板
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateUnifiedalarmTplResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.tpl.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_unifiedalarm_tpl_ex_async(
        self,
        request: rms_models.UpdateUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateUnifiedalarmTplResponse:
        """
        Description: 更新告警规则模板
        Summary: 更新告警规则模板
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateUnifiedalarmTplResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.tpl.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_tpl(
        self,
        request: rms_models.QueryUnifiedalarmTplRequest,
    ) -> rms_models.QueryUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板列表
        Summary: 查询告警规则模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_tpl_ex(request, headers, runtime)

    async def query_unifiedalarm_tpl_async(
        self,
        request: rms_models.QueryUnifiedalarmTplRequest,
    ) -> rms_models.QueryUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板列表
        Summary: 查询告警规则模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_tpl_ex_async(request, headers, runtime)

    def query_unifiedalarm_tpl_ex(
        self,
        request: rms_models.QueryUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板列表
        Summary: 查询告警规则模板列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmTplResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.tpl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_tpl_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板列表
        Summary: 查询告警规则模板列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmTplResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.tpl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unifiedalarm_tpl(
        self,
        request: rms_models.GetUnifiedalarmTplRequest,
    ) -> rms_models.GetUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板详情
        Summary: 查询告警规则模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unifiedalarm_tpl_ex(request, headers, runtime)

    async def get_unifiedalarm_tpl_async(
        self,
        request: rms_models.GetUnifiedalarmTplRequest,
    ) -> rms_models.GetUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板详情
        Summary: 查询告警规则模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unifiedalarm_tpl_ex_async(request, headers, runtime)

    def get_unifiedalarm_tpl_ex(
        self,
        request: rms_models.GetUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板详情
        Summary: 查询告警规则模板详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetUnifiedalarmTplResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.tpl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unifiedalarm_tpl_ex_async(
        self,
        request: rms_models.GetUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetUnifiedalarmTplResponse:
        """
        Description: 查询告警规则模板详情
        Summary: 查询告警规则模板详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetUnifiedalarmTplResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.tpl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_unifiedalarm_tpl(
        self,
        request: rms_models.DeleteUnifiedalarmTplRequest,
    ) -> rms_models.DeleteUnifiedalarmTplResponse:
        """
        Description: 删除告警规则模板
        Summary: 删除告警规则模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_unifiedalarm_tpl_ex(request, headers, runtime)

    async def delete_unifiedalarm_tpl_async(
        self,
        request: rms_models.DeleteUnifiedalarmTplRequest,
    ) -> rms_models.DeleteUnifiedalarmTplResponse:
        """
        Description: 删除告警规则模板
        Summary: 删除告警规则模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_unifiedalarm_tpl_ex_async(request, headers, runtime)

    def delete_unifiedalarm_tpl_ex(
        self,
        request: rms_models.DeleteUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUnifiedalarmTplResponse:
        """
        Description: 删除告警规则模板
        Summary: 删除告警规则模板
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUnifiedalarmTplResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.tpl.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_unifiedalarm_tpl_ex_async(
        self,
        request: rms_models.DeleteUnifiedalarmTplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteUnifiedalarmTplResponse:
        """
        Description: 删除告警规则模板
        Summary: 删除告警规则模板
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteUnifiedalarmTplResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.tpl.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_unifiedalarm_rule(
        self,
        request: rms_models.SwitchUnifiedalarmRuleRequest,
    ) -> rms_models.SwitchUnifiedalarmRuleResponse:
        """
        Description: 暂停/开启告警规则
        Summary: 暂停告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_unifiedalarm_rule_ex(request, headers, runtime)

    async def switch_unifiedalarm_rule_async(
        self,
        request: rms_models.SwitchUnifiedalarmRuleRequest,
    ) -> rms_models.SwitchUnifiedalarmRuleResponse:
        """
        Description: 暂停/开启告警规则
        Summary: 暂停告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_unifiedalarm_rule_ex_async(request, headers, runtime)

    def switch_unifiedalarm_rule_ex(
        self,
        request: rms_models.SwitchUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SwitchUnifiedalarmRuleResponse:
        """
        Description: 暂停/开启告警规则
        Summary: 暂停告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.SwitchUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.SwitchUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SwitchUnifiedalarmRuleResponse:
        """
        Description: 暂停/开启告警规则
        Summary: 暂停告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.SwitchUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_alarm_subscription(
        self,
        request: rms_models.ListAlarmSubscriptionRequest,
    ) -> rms_models.ListAlarmSubscriptionResponse:
        """
        Description: 根据资源类型获取告警订阅列表
        Summary: 获取告警订阅列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_alarm_subscription_ex(request, headers, runtime)

    async def list_alarm_subscription_async(
        self,
        request: rms_models.ListAlarmSubscriptionRequest,
    ) -> rms_models.ListAlarmSubscriptionResponse:
        """
        Description: 根据资源类型获取告警订阅列表
        Summary: 获取告警订阅列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_alarm_subscription_ex_async(request, headers, runtime)

    def list_alarm_subscription_ex(
        self,
        request: rms_models.ListAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAlarmSubscriptionResponse:
        """
        Description: 根据资源类型获取告警订阅列表
        Summary: 获取告警订阅列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAlarmSubscriptionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.subscription.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_alarm_subscription_ex_async(
        self,
        request: rms_models.ListAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAlarmSubscriptionResponse:
        """
        Description: 根据资源类型获取告警订阅列表
        Summary: 获取告警订阅列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAlarmSubscriptionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.subscription.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_alarm_subscription(
        self,
        request: rms_models.UpdateAlarmSubscriptionRequest,
    ) -> rms_models.UpdateAlarmSubscriptionResponse:
        """
        Description: 更新告警订阅
        Summary: 更新告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_alarm_subscription_ex(request, headers, runtime)

    async def update_alarm_subscription_async(
        self,
        request: rms_models.UpdateAlarmSubscriptionRequest,
    ) -> rms_models.UpdateAlarmSubscriptionResponse:
        """
        Description: 更新告警订阅
        Summary: 更新告警订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_alarm_subscription_ex_async(request, headers, runtime)

    def update_alarm_subscription_ex(
        self,
        request: rms_models.UpdateAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAlarmSubscriptionResponse:
        """
        Description: 更新告警订阅
        Summary: 更新告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAlarmSubscriptionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.subscription.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_alarm_subscription_ex_async(
        self,
        request: rms_models.UpdateAlarmSubscriptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAlarmSubscriptionResponse:
        """
        Description: 更新告警订阅
        Summary: 更新告警订阅
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAlarmSubscriptionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.subscription.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_customplugin(
        self,
        request: rms_models.ListCustompluginRequest,
    ) -> rms_models.ListCustompluginResponse:
        """
        Description: 查询 custom plugin 列表
        Summary: 查询 custom plugin 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_customplugin_ex(request, headers, runtime)

    async def list_customplugin_async(
        self,
        request: rms_models.ListCustompluginRequest,
    ) -> rms_models.ListCustompluginResponse:
        """
        Description: 查询 custom plugin 列表
        Summary: 查询 custom plugin 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_customplugin_ex_async(request, headers, runtime)

    def list_customplugin_ex(
        self,
        request: rms_models.ListCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListCustompluginResponse:
        """
        Description: 查询 custom plugin 列表
        Summary: 查询 custom plugin 列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListCustompluginResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.customplugin.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_customplugin_ex_async(
        self,
        request: rms_models.ListCustompluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListCustompluginResponse:
        """
        Description: 查询 custom plugin 列表
        Summary: 查询 custom plugin 列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListCustompluginResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.customplugin.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_event(
        self,
        request: rms_models.QueryUnifiedalarmEventRequest,
    ) -> rms_models.QueryUnifiedalarmEventResponse:
        """
        Description: 查询事件列表
        Summary: 查询事件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_event_ex(request, headers, runtime)

    async def query_unifiedalarm_event_async(
        self,
        request: rms_models.QueryUnifiedalarmEventRequest,
    ) -> rms_models.QueryUnifiedalarmEventResponse:
        """
        Description: 查询事件列表
        Summary: 查询事件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_event_ex_async(request, headers, runtime)

    def query_unifiedalarm_event_ex(
        self,
        request: rms_models.QueryUnifiedalarmEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmEventResponse:
        """
        Description: 查询事件列表
        Summary: 查询事件列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmEventResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_event_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmEventResponse:
        """
        Description: 查询事件列表
        Summary: 查询事件列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmEventResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_metrics(
        self,
        request: rms_models.QueryUnifiedalarmMetricsRequest,
    ) -> rms_models.QueryUnifiedalarmMetricsResponse:
        """
        Description: 告警指标查询
        Summary: 告警指标查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_metrics_ex(request, headers, runtime)

    async def query_unifiedalarm_metrics_async(
        self,
        request: rms_models.QueryUnifiedalarmMetricsRequest,
    ) -> rms_models.QueryUnifiedalarmMetricsResponse:
        """
        Description: 告警指标查询
        Summary: 告警指标查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_metrics_ex_async(request, headers, runtime)

    def query_unifiedalarm_metrics_ex(
        self,
        request: rms_models.QueryUnifiedalarmMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmMetricsResponse:
        """
        Description: 告警指标查询
        Summary: 告警指标查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmMetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_metrics_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmMetricsResponse:
        """
        Description: 告警指标查询
        Summary: 告警指标查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmMetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_unifiedalarm_history(
        self,
        request: rms_models.BatchcreateUnifiedalarmHistoryRequest,
    ) -> rms_models.BatchcreateUnifiedalarmHistoryResponse:
        """
        Description: 批量创建告警历史
        Summary: 批量创建告警历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_unifiedalarm_history_ex(request, headers, runtime)

    async def batchcreate_unifiedalarm_history_async(
        self,
        request: rms_models.BatchcreateUnifiedalarmHistoryRequest,
    ) -> rms_models.BatchcreateUnifiedalarmHistoryResponse:
        """
        Description: 批量创建告警历史
        Summary: 批量创建告警历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_unifiedalarm_history_ex_async(request, headers, runtime)

    def batchcreate_unifiedalarm_history_ex(
        self,
        request: rms_models.BatchcreateUnifiedalarmHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUnifiedalarmHistoryResponse:
        """
        Description: 批量创建告警历史
        Summary: 批量创建告警历史
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUnifiedalarmHistoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.history.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_unifiedalarm_history_ex_async(
        self,
        request: rms_models.BatchcreateUnifiedalarmHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUnifiedalarmHistoryResponse:
        """
        Description: 批量创建告警历史
        Summary: 批量创建告警历史
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUnifiedalarmHistoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.history.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_unifiedalarm_rule(
        self,
        request: rms_models.BatchcreateUnifiedalarmRuleRequest,
    ) -> rms_models.BatchcreateUnifiedalarmRuleResponse:
        """
        Description: 根据模板批量创建规则
        Summary: 根据模板批量创建规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_unifiedalarm_rule_ex(request, headers, runtime)

    async def batchcreate_unifiedalarm_rule_async(
        self,
        request: rms_models.BatchcreateUnifiedalarmRuleRequest,
    ) -> rms_models.BatchcreateUnifiedalarmRuleResponse:
        """
        Description: 根据模板批量创建规则
        Summary: 根据模板批量创建规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_unifiedalarm_rule_ex_async(request, headers, runtime)

    def batchcreate_unifiedalarm_rule_ex(
        self,
        request: rms_models.BatchcreateUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUnifiedalarmRuleResponse:
        """
        Description: 根据模板批量创建规则
        Summary: 根据模板批量创建规则
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.BatchcreateUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateUnifiedalarmRuleResponse:
        """
        Description: 根据模板批量创建规则
        Summary: 根据模板批量创建规则
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_eventstat(
        self,
        request: rms_models.QueryUnifiedalarmEventstatRequest,
    ) -> rms_models.QueryUnifiedalarmEventstatResponse:
        """
        Description: 告警事件统计信息
        Summary: 告警事件统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_eventstat_ex(request, headers, runtime)

    async def query_unifiedalarm_eventstat_async(
        self,
        request: rms_models.QueryUnifiedalarmEventstatRequest,
    ) -> rms_models.QueryUnifiedalarmEventstatResponse:
        """
        Description: 告警事件统计信息
        Summary: 告警事件统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_eventstat_ex_async(request, headers, runtime)

    def query_unifiedalarm_eventstat_ex(
        self,
        request: rms_models.QueryUnifiedalarmEventstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmEventstatResponse:
        """
        Description: 告警事件统计信息
        Summary: 告警事件统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmEventstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.eventstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_eventstat_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmEventstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmEventstatResponse:
        """
        Description: 告警事件统计信息
        Summary: 告警事件统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmEventstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.eventstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_notifystat(
        self,
        request: rms_models.QueryUnifiedalarmNotifystatRequest,
    ) -> rms_models.QueryUnifiedalarmNotifystatResponse:
        """
        Description: 通知历史统计
        Summary: 通知历史统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_notifystat_ex(request, headers, runtime)

    async def query_unifiedalarm_notifystat_async(
        self,
        request: rms_models.QueryUnifiedalarmNotifystatRequest,
    ) -> rms_models.QueryUnifiedalarmNotifystatResponse:
        """
        Description: 通知历史统计
        Summary: 通知历史统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_notifystat_ex_async(request, headers, runtime)

    def query_unifiedalarm_notifystat_ex(
        self,
        request: rms_models.QueryUnifiedalarmNotifystatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmNotifystatResponse:
        """
        Description: 通知历史统计
        Summary: 通知历史统计
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmNotifystatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.notifystat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_notifystat_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmNotifystatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmNotifystatResponse:
        """
        Description: 通知历史统计
        Summary: 通知历史统计
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmNotifystatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.notifystat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meta_node(
        self,
        request: rms_models.QueryMetaNodeRequest,
    ) -> rms_models.QueryMetaNodeResponse:
        """
        Description: 查询主机ip列表
        Summary: 查询主机ip列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meta_node_ex(request, headers, runtime)

    async def query_meta_node_async(
        self,
        request: rms_models.QueryMetaNodeRequest,
    ) -> rms_models.QueryMetaNodeResponse:
        """
        Description: 查询主机ip列表
        Summary: 查询主机ip列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meta_node_ex_async(request, headers, runtime)

    def query_meta_node_ex(
        self,
        request: rms_models.QueryMetaNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryMetaNodeResponse:
        """
        Description: 查询主机ip列表
        Summary: 查询主机ip列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryMetaNodeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.meta.node.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meta_node_ex_async(
        self,
        request: rms_models.QueryMetaNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryMetaNodeResponse:
        """
        Description: 查询主机ip列表
        Summary: 查询主机ip列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryMetaNodeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.meta.node.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_unifiedalarm_rule(
        self,
        request: rms_models.BatchdeleteUnifiedalarmRuleRequest,
    ) -> rms_models.BatchdeleteUnifiedalarmRuleResponse:
        """
        Description: 批量删除告警规则
        Summary: 批量删除告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_unifiedalarm_rule_ex(request, headers, runtime)

    async def batchdelete_unifiedalarm_rule_async(
        self,
        request: rms_models.BatchdeleteUnifiedalarmRuleRequest,
    ) -> rms_models.BatchdeleteUnifiedalarmRuleResponse:
        """
        Description: 批量删除告警规则
        Summary: 批量删除告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_unifiedalarm_rule_ex_async(request, headers, runtime)

    def batchdelete_unifiedalarm_rule_ex(
        self,
        request: rms_models.BatchdeleteUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteUnifiedalarmRuleResponse:
        """
        Description: 批量删除告警规则
        Summary: 批量删除告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteUnifiedalarmRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rule.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_unifiedalarm_rule_ex_async(
        self,
        request: rms_models.BatchdeleteUnifiedalarmRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteUnifiedalarmRuleResponse:
        """
        Description: 批量删除告警规则
        Summary: 批量删除告警规则
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteUnifiedalarmRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rule.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_xdashboard(
        self,
        request: rms_models.CreateXdashboardRequest,
    ) -> rms_models.CreateXdashboardResponse:
        """
        Description: dashboard创建
        Summary: dashboard创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_xdashboard_ex(request, headers, runtime)

    async def create_xdashboard_async(
        self,
        request: rms_models.CreateXdashboardRequest,
    ) -> rms_models.CreateXdashboardResponse:
        """
        Description: dashboard创建
        Summary: dashboard创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_xdashboard_ex_async(request, headers, runtime)

    def create_xdashboard_ex(
        self,
        request: rms_models.CreateXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateXdashboardResponse:
        """
        Description: dashboard创建
        Summary: dashboard创建
        """
        UtilClient.validate_model(request)
        return rms_models.CreateXdashboardResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_xdashboard_ex_async(
        self,
        request: rms_models.CreateXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateXdashboardResponse:
        """
        Description: dashboard创建
        Summary: dashboard创建
        """
        UtilClient.validate_model(request)
        return rms_models.CreateXdashboardResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_xdashboard(
        self,
        request: rms_models.UpdateXdashboardRequest,
    ) -> rms_models.UpdateXdashboardResponse:
        """
        Description: dashboard更新
        Summary: dashboard更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_xdashboard_ex(request, headers, runtime)

    async def update_xdashboard_async(
        self,
        request: rms_models.UpdateXdashboardRequest,
    ) -> rms_models.UpdateXdashboardResponse:
        """
        Description: dashboard更新
        Summary: dashboard更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_xdashboard_ex_async(request, headers, runtime)

    def update_xdashboard_ex(
        self,
        request: rms_models.UpdateXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateXdashboardResponse:
        """
        Description: dashboard更新
        Summary: dashboard更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateXdashboardResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_xdashboard_ex_async(
        self,
        request: rms_models.UpdateXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateXdashboardResponse:
        """
        Description: dashboard更新
        Summary: dashboard更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateXdashboardResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xdashboard(
        self,
        request: rms_models.QueryXdashboardRequest,
    ) -> rms_models.QueryXdashboardResponse:
        """
        Description: dashboard查询
        Summary: dashboard查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xdashboard_ex(request, headers, runtime)

    async def query_xdashboard_async(
        self,
        request: rms_models.QueryXdashboardRequest,
    ) -> rms_models.QueryXdashboardResponse:
        """
        Description: dashboard查询
        Summary: dashboard查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xdashboard_ex_async(request, headers, runtime)

    def query_xdashboard_ex(
        self,
        request: rms_models.QueryXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdashboardResponse:
        """
        Description: dashboard查询
        Summary: dashboard查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdashboardResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xdashboard_ex_async(
        self,
        request: rms_models.QueryXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdashboardResponse:
        """
        Description: dashboard查询
        Summary: dashboard查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdashboardResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_xdashboard_directory(
        self,
        request: rms_models.ListXdashboardDirectoryRequest,
    ) -> rms_models.ListXdashboardDirectoryResponse:
        """
        Description: dashboard目录列表
        Summary: dashboard目录列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_xdashboard_directory_ex(request, headers, runtime)

    async def list_xdashboard_directory_async(
        self,
        request: rms_models.ListXdashboardDirectoryRequest,
    ) -> rms_models.ListXdashboardDirectoryResponse:
        """
        Description: dashboard目录列表
        Summary: dashboard目录列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_xdashboard_directory_ex_async(request, headers, runtime)

    def list_xdashboard_directory_ex(
        self,
        request: rms_models.ListXdashboardDirectoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListXdashboardDirectoryResponse:
        """
        Description: dashboard目录列表
        Summary: dashboard目录列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListXdashboardDirectoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.directory.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_xdashboard_directory_ex_async(
        self,
        request: rms_models.ListXdashboardDirectoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListXdashboardDirectoryResponse:
        """
        Description: dashboard目录列表
        Summary: dashboard目录列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListXdashboardDirectoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.directory.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_xdashboard(
        self,
        request: rms_models.DeleteXdashboardRequest,
    ) -> rms_models.DeleteXdashboardResponse:
        """
        Description: dashboard删除。
        单个dashboard删除或者整个目录删除
        Summary: dashboard删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_xdashboard_ex(request, headers, runtime)

    async def delete_xdashboard_async(
        self,
        request: rms_models.DeleteXdashboardRequest,
    ) -> rms_models.DeleteXdashboardResponse:
        """
        Description: dashboard删除。
        单个dashboard删除或者整个目录删除
        Summary: dashboard删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_xdashboard_ex_async(request, headers, runtime)

    def delete_xdashboard_ex(
        self,
        request: rms_models.DeleteXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteXdashboardResponse:
        """
        Description: dashboard删除。
        单个dashboard删除或者整个目录删除
        Summary: dashboard删除
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteXdashboardResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_xdashboard_ex_async(
        self,
        request: rms_models.DeleteXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteXdashboardResponse:
        """
        Description: dashboard删除。
        单个dashboard删除或者整个目录删除
        Summary: dashboard删除
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteXdashboardResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetric_instant(
        self,
        request: rms_models.QueryXmetricInstantRequest,
    ) -> rms_models.QueryXmetricInstantResponse:
        """
        Description: instant query
        Summary: instant query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetric_instant_ex(request, headers, runtime)

    async def query_xmetric_instant_async(
        self,
        request: rms_models.QueryXmetricInstantRequest,
    ) -> rms_models.QueryXmetricInstantResponse:
        """
        Description: instant query
        Summary: instant query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetric_instant_ex_async(request, headers, runtime)

    def query_xmetric_instant_ex(
        self,
        request: rms_models.QueryXmetricInstantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricInstantResponse:
        """
        Description: instant query
        Summary: instant query
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricInstantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetric.instant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetric_instant_ex_async(
        self,
        request: rms_models.QueryXmetricInstantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricInstantResponse:
        """
        Description: instant query
        Summary: instant query
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricInstantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetric.instant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetric_range(
        self,
        request: rms_models.QueryXmetricRangeRequest,
    ) -> rms_models.QueryXmetricRangeResponse:
        """
        Description: range query
        Summary: range query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetric_range_ex(request, headers, runtime)

    async def query_xmetric_range_async(
        self,
        request: rms_models.QueryXmetricRangeRequest,
    ) -> rms_models.QueryXmetricRangeResponse:
        """
        Description: range query
        Summary: range query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetric_range_ex_async(request, headers, runtime)

    def query_xmetric_range_ex(
        self,
        request: rms_models.QueryXmetricRangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricRangeResponse:
        """
        Description: range query
        Summary: range query
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricRangeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetric.range.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetric_range_ex_async(
        self,
        request: rms_models.QueryXmetricRangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricRangeResponse:
        """
        Description: range query
        Summary: range query
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricRangeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetric.range.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetricdatasource_instant(
        self,
        request: rms_models.QueryXmetricdatasourceInstantRequest,
    ) -> rms_models.QueryXmetricdatasourceInstantResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetricdatasource_instant_ex(request, headers, runtime)

    async def query_xmetricdatasource_instant_async(
        self,
        request: rms_models.QueryXmetricdatasourceInstantRequest,
    ) -> rms_models.QueryXmetricdatasourceInstantResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetricdatasource_instant_ex_async(request, headers, runtime)

    def query_xmetricdatasource_instant_ex(
        self,
        request: rms_models.QueryXmetricdatasourceInstantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricdatasourceInstantResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricdatasourceInstantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetricdatasource.instant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetricdatasource_instant_ex_async(
        self,
        request: rms_models.QueryXmetricdatasourceInstantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricdatasourceInstantResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricdatasourceInstantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetricdatasource.instant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetricdatasource_range(
        self,
        request: rms_models.QueryXmetricdatasourceRangeRequest,
    ) -> rms_models.QueryXmetricdatasourceRangeResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetricdatasource_range_ex(request, headers, runtime)

    async def query_xmetricdatasource_range_async(
        self,
        request: rms_models.QueryXmetricdatasourceRangeRequest,
    ) -> rms_models.QueryXmetricdatasourceRangeResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetricdatasource_range_ex_async(request, headers, runtime)

    def query_xmetricdatasource_range_ex(
        self,
        request: rms_models.QueryXmetricdatasourceRangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricdatasourceRangeResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricdatasourceRangeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetricdatasource.range.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetricdatasource_range_ex_async(
        self,
        request: rms_models.QueryXmetricdatasourceRangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricdatasourceRangeResponse:
        """
        Description: datasource metric
        Summary: datasource metric
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricdatasourceRangeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetricdatasource.range.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetrictag_key(
        self,
        request: rms_models.QueryXmetrictagKeyRequest,
    ) -> rms_models.QueryXmetrictagKeyResponse:
        """
        Description: metric tag keys
        Summary: metric tag keys
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetrictag_key_ex(request, headers, runtime)

    async def query_xmetrictag_key_async(
        self,
        request: rms_models.QueryXmetrictagKeyRequest,
    ) -> rms_models.QueryXmetrictagKeyResponse:
        """
        Description: metric tag keys
        Summary: metric tag keys
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetrictag_key_ex_async(request, headers, runtime)

    def query_xmetrictag_key_ex(
        self,
        request: rms_models.QueryXmetrictagKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetrictagKeyResponse:
        """
        Description: metric tag keys
        Summary: metric tag keys
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetrictagKeyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetrictag.key.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetrictag_key_ex_async(
        self,
        request: rms_models.QueryXmetrictagKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetrictagKeyResponse:
        """
        Description: metric tag keys
        Summary: metric tag keys
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetrictagKeyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetrictag.key.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetrictag_value(
        self,
        request: rms_models.QueryXmetrictagValueRequest,
    ) -> rms_models.QueryXmetrictagValueResponse:
        """
        Description: metric tag values
        Summary: metric tag values
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetrictag_value_ex(request, headers, runtime)

    async def query_xmetrictag_value_async(
        self,
        request: rms_models.QueryXmetrictagValueRequest,
    ) -> rms_models.QueryXmetrictagValueResponse:
        """
        Description: metric tag values
        Summary: metric tag values
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetrictag_value_ex_async(request, headers, runtime)

    def query_xmetrictag_value_ex(
        self,
        request: rms_models.QueryXmetrictagValueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetrictagValueResponse:
        """
        Description: metric tag values
        Summary: metric tag values
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetrictagValueResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetrictag.value.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetrictag_value_ex_async(
        self,
        request: rms_models.QueryXmetrictagValueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetrictagValueResponse:
        """
        Description: metric tag values
        Summary: metric tag values
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetrictagValueResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetrictag.value.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_logservice_desenstypes(
        self,
        request: rms_models.ListLogserviceDesenstypesRequest,
    ) -> rms_models.ListLogserviceDesenstypesResponse:
        """
        Description: 日志脱敏类型列表查询
        Summary: 日志脱敏类型列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_logservice_desenstypes_ex(request, headers, runtime)

    async def list_logservice_desenstypes_async(
        self,
        request: rms_models.ListLogserviceDesenstypesRequest,
    ) -> rms_models.ListLogserviceDesenstypesResponse:
        """
        Description: 日志脱敏类型列表查询
        Summary: 日志脱敏类型列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_logservice_desenstypes_ex_async(request, headers, runtime)

    def list_logservice_desenstypes_ex(
        self,
        request: rms_models.ListLogserviceDesenstypesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListLogserviceDesenstypesResponse:
        """
        Description: 日志脱敏类型列表查询
        Summary: 日志脱敏类型列表查询
        """
        UtilClient.validate_model(request)
        return rms_models.ListLogserviceDesenstypesResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.logservice.desenstypes.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_logservice_desenstypes_ex_async(
        self,
        request: rms_models.ListLogserviceDesenstypesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListLogserviceDesenstypesResponse:
        """
        Description: 日志脱敏类型列表查询
        Summary: 日志脱敏类型列表查询
        """
        UtilClient.validate_model(request)
        return rms_models.ListLogserviceDesenstypesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.logservice.desenstypes.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_logservice_desensconfig(
        self,
        request: rms_models.GetLogserviceDesensconfigRequest,
    ) -> rms_models.GetLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置查询
        Summary: 日志脱敏配置查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_logservice_desensconfig_ex(request, headers, runtime)

    async def get_logservice_desensconfig_async(
        self,
        request: rms_models.GetLogserviceDesensconfigRequest,
    ) -> rms_models.GetLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置查询
        Summary: 日志脱敏配置查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_logservice_desensconfig_ex_async(request, headers, runtime)

    def get_logservice_desensconfig_ex(
        self,
        request: rms_models.GetLogserviceDesensconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置查询
        Summary: 日志脱敏配置查询
        """
        UtilClient.validate_model(request)
        return rms_models.GetLogserviceDesensconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.logservice.desensconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_logservice_desensconfig_ex_async(
        self,
        request: rms_models.GetLogserviceDesensconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置查询
        Summary: 日志脱敏配置查询
        """
        UtilClient.validate_model(request)
        return rms_models.GetLogserviceDesensconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.logservice.desensconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_logservice_desensconfig(
        self,
        request: rms_models.UpdateLogserviceDesensconfigRequest,
    ) -> rms_models.UpdateLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置更新
        Summary: 日志脱敏配置更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_logservice_desensconfig_ex(request, headers, runtime)

    async def update_logservice_desensconfig_async(
        self,
        request: rms_models.UpdateLogserviceDesensconfigRequest,
    ) -> rms_models.UpdateLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置更新
        Summary: 日志脱敏配置更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_logservice_desensconfig_ex_async(request, headers, runtime)

    def update_logservice_desensconfig_ex(
        self,
        request: rms_models.UpdateLogserviceDesensconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置更新
        Summary: 日志脱敏配置更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateLogserviceDesensconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.logservice.desensconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_logservice_desensconfig_ex_async(
        self,
        request: rms_models.UpdateLogserviceDesensconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateLogserviceDesensconfigResponse:
        """
        Description: 日志脱敏配置更新
        Summary: 日志脱敏配置更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateLogserviceDesensconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.logservice.desensconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_user(
        self,
        request: rms_models.DetailUserRequest,
    ) -> rms_models.DetailUserResponse:
        """
        Description: 获取登录用户信息
        Summary: 获取登录用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_user_ex(request, headers, runtime)

    async def detail_user_async(
        self,
        request: rms_models.DetailUserRequest,
    ) -> rms_models.DetailUserResponse:
        """
        Description: 获取登录用户信息
        Summary: 获取登录用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_user_ex_async(request, headers, runtime)

    def detail_user_ex(
        self,
        request: rms_models.DetailUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DetailUserResponse:
        """
        Description: 获取登录用户信息
        Summary: 获取登录用户信息
        """
        UtilClient.validate_model(request)
        return rms_models.DetailUserResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_user_ex_async(
        self,
        request: rms_models.DetailUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DetailUserResponse:
        """
        Description: 获取登录用户信息
        Summary: 获取登录用户信息
        """
        UtilClient.validate_model(request)
        return rms_models.DetailUserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_user(
        self,
        request: rms_models.AuthUserRequest,
    ) -> rms_models.AuthUserResponse:
        """
        Description: 通过登录名获取鉴权
        Summary: 通过登录名获取鉴权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_user_ex(request, headers, runtime)

    async def auth_user_async(
        self,
        request: rms_models.AuthUserRequest,
    ) -> rms_models.AuthUserResponse:
        """
        Description: 通过登录名获取鉴权
        Summary: 通过登录名获取鉴权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_user_ex_async(request, headers, runtime)

    def auth_user_ex(
        self,
        request: rms_models.AuthUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AuthUserResponse:
        """
        Description: 通过登录名获取鉴权
        Summary: 通过登录名获取鉴权
        """
        UtilClient.validate_model(request)
        return rms_models.AuthUserResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.user.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_user_ex_async(
        self,
        request: rms_models.AuthUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AuthUserResponse:
        """
        Description: 通过登录名获取鉴权
        Summary: 通过登录名获取鉴权
        """
        UtilClient.validate_model(request)
        return rms_models.AuthUserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.user.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_logpath_metrics(
        self,
        request: rms_models.QueryLogpathMetricsRequest,
    ) -> rms_models.QueryLogpathMetricsResponse:
        """
        Description: 获取持久化日志路径级别的监控数据
        Summary: 持久化日志监控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_logpath_metrics_ex(request, headers, runtime)

    async def query_logpath_metrics_async(
        self,
        request: rms_models.QueryLogpathMetricsRequest,
    ) -> rms_models.QueryLogpathMetricsResponse:
        """
        Description: 获取持久化日志路径级别的监控数据
        Summary: 持久化日志监控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_logpath_metrics_ex_async(request, headers, runtime)

    def query_logpath_metrics_ex(
        self,
        request: rms_models.QueryLogpathMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryLogpathMetricsResponse:
        """
        Description: 获取持久化日志路径级别的监控数据
        Summary: 持久化日志监控
        """
        UtilClient.validate_model(request)
        return rms_models.QueryLogpathMetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.logpath.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_logpath_metrics_ex_async(
        self,
        request: rms_models.QueryLogpathMetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryLogpathMetricsResponse:
        """
        Description: 获取持久化日志路径级别的监控数据
        Summary: 持久化日志监控
        """
        UtilClient.validate_model(request)
        return rms_models.QueryLogpathMetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.logpath.metrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetric_name(
        self,
        request: rms_models.QueryXmetricNameRequest,
    ) -> rms_models.QueryXmetricNameResponse:
        """
        Description: query metric names
        Summary: query metric names
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetric_name_ex(request, headers, runtime)

    async def query_xmetric_name_async(
        self,
        request: rms_models.QueryXmetricNameRequest,
    ) -> rms_models.QueryXmetricNameResponse:
        """
        Description: query metric names
        Summary: query metric names
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetric_name_ex_async(request, headers, runtime)

    def query_xmetric_name_ex(
        self,
        request: rms_models.QueryXmetricNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricNameResponse:
        """
        Description: query metric names
        Summary: query metric names
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricNameResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetric.name.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetric_name_ex_async(
        self,
        request: rms_models.QueryXmetricNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricNameResponse:
        """
        Description: query metric names
        Summary: query metric names
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricNameResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetric.name.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_alarmwebhook(
        self,
        request: rms_models.CreateAlarmwebhookRequest,
    ) -> rms_models.CreateAlarmwebhookResponse:
        """
        Description: 创建alarmwebhook
        Summary: 创建alarmwebhook
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_alarmwebhook_ex(request, headers, runtime)

    async def create_alarmwebhook_async(
        self,
        request: rms_models.CreateAlarmwebhookRequest,
    ) -> rms_models.CreateAlarmwebhookResponse:
        """
        Description: 创建alarmwebhook
        Summary: 创建alarmwebhook
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_alarmwebhook_ex_async(request, headers, runtime)

    def create_alarmwebhook_ex(
        self,
        request: rms_models.CreateAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAlarmwebhookResponse:
        """
        Description: 创建alarmwebhook
        Summary: 创建alarmwebhook
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAlarmwebhookResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarmwebhook.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_alarmwebhook_ex_async(
        self,
        request: rms_models.CreateAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAlarmwebhookResponse:
        """
        Description: 创建alarmwebhook
        Summary: 创建alarmwebhook
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAlarmwebhookResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarmwebhook.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_xdatasource(
        self,
        request: rms_models.CreateXdatasourceRequest,
    ) -> rms_models.CreateXdatasourceResponse:
        """
        Description: datasource 创建
        Summary: datasource 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_xdatasource_ex(request, headers, runtime)

    async def create_xdatasource_async(
        self,
        request: rms_models.CreateXdatasourceRequest,
    ) -> rms_models.CreateXdatasourceResponse:
        """
        Description: datasource 创建
        Summary: datasource 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_xdatasource_ex_async(request, headers, runtime)

    def create_xdatasource_ex(
        self,
        request: rms_models.CreateXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateXdatasourceResponse:
        """
        Description: datasource 创建
        Summary: datasource 创建
        """
        UtilClient.validate_model(request)
        return rms_models.CreateXdatasourceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_xdatasource_ex_async(
        self,
        request: rms_models.CreateXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateXdatasourceResponse:
        """
        Description: datasource 创建
        Summary: datasource 创建
        """
        UtilClient.validate_model(request)
        return rms_models.CreateXdatasourceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_xdatasource(
        self,
        request: rms_models.UpdateXdatasourceRequest,
    ) -> rms_models.UpdateXdatasourceResponse:
        """
        Description:
        Summary: datasource update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_xdatasource_ex(request, headers, runtime)

    async def update_xdatasource_async(
        self,
        request: rms_models.UpdateXdatasourceRequest,
    ) -> rms_models.UpdateXdatasourceResponse:
        """
        Description:
        Summary: datasource update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_xdatasource_ex_async(request, headers, runtime)

    def update_xdatasource_ex(
        self,
        request: rms_models.UpdateXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateXdatasourceResponse:
        """
        Description:
        Summary: datasource update
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateXdatasourceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_xdatasource_ex_async(
        self,
        request: rms_models.UpdateXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateXdatasourceResponse:
        """
        Description:
        Summary: datasource update
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateXdatasourceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_xdatasource(
        self,
        request: rms_models.GetXdatasourceRequest,
    ) -> rms_models.GetXdatasourceResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_xdatasource_ex(request, headers, runtime)

    async def get_xdatasource_async(
        self,
        request: rms_models.GetXdatasourceRequest,
    ) -> rms_models.GetXdatasourceResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_xdatasource_ex_async(request, headers, runtime)

    def get_xdatasource_ex(
        self,
        request: rms_models.GetXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetXdatasourceResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.GetXdatasourceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_xdatasource_ex_async(
        self,
        request: rms_models.GetXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetXdatasourceResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.GetXdatasourceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_xdatasource(
        self,
        request: rms_models.DeleteXdatasourceRequest,
    ) -> rms_models.DeleteXdatasourceResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_xdatasource_ex(request, headers, runtime)

    async def delete_xdatasource_async(
        self,
        request: rms_models.DeleteXdatasourceRequest,
    ) -> rms_models.DeleteXdatasourceResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_xdatasource_ex_async(request, headers, runtime)

    def delete_xdatasource_ex(
        self,
        request: rms_models.DeleteXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteXdatasourceResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteXdatasourceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_xdatasource_ex_async(
        self,
        request: rms_models.DeleteXdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteXdatasourceResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteXdatasourceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_xdatasource_directory(
        self,
        request: rms_models.ListXdatasourceDirectoryRequest,
    ) -> rms_models.ListXdatasourceDirectoryResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_xdatasource_directory_ex(request, headers, runtime)

    async def list_xdatasource_directory_async(
        self,
        request: rms_models.ListXdatasourceDirectoryRequest,
    ) -> rms_models.ListXdatasourceDirectoryResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_xdatasource_directory_ex_async(request, headers, runtime)

    def list_xdatasource_directory_ex(
        self,
        request: rms_models.ListXdatasourceDirectoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListXdatasourceDirectoryResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.ListXdatasourceDirectoryResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.directory.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_xdatasource_directory_ex_async(
        self,
        request: rms_models.ListXdatasourceDirectoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListXdatasourceDirectoryResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.ListXdatasourceDirectoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.directory.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_alarmwebhook(
        self,
        request: rms_models.UpdateAlarmwebhookRequest,
    ) -> rms_models.UpdateAlarmwebhookResponse:
        """
        Description: 更新alarmwebhook
        Summary: 更新alarmwebhook
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_alarmwebhook_ex(request, headers, runtime)

    async def update_alarmwebhook_async(
        self,
        request: rms_models.UpdateAlarmwebhookRequest,
    ) -> rms_models.UpdateAlarmwebhookResponse:
        """
        Description: 更新alarmwebhook
        Summary: 更新alarmwebhook
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_alarmwebhook_ex_async(request, headers, runtime)

    def update_alarmwebhook_ex(
        self,
        request: rms_models.UpdateAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAlarmwebhookResponse:
        """
        Description: 更新alarmwebhook
        Summary: 更新alarmwebhook
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAlarmwebhookResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarmwebhook.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_alarmwebhook_ex_async(
        self,
        request: rms_models.UpdateAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAlarmwebhookResponse:
        """
        Description: 更新alarmwebhook
        Summary: 更新alarmwebhook
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAlarmwebhookResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarmwebhook.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_alarmwebhook(
        self,
        request: rms_models.DeleteAlarmwebhookRequest,
    ) -> rms_models.DeleteAlarmwebhookResponse:
        """
        Description: 删除alarmwebhook
        Summary: 删除alarmwebhook
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_alarmwebhook_ex(request, headers, runtime)

    async def delete_alarmwebhook_async(
        self,
        request: rms_models.DeleteAlarmwebhookRequest,
    ) -> rms_models.DeleteAlarmwebhookResponse:
        """
        Description: 删除alarmwebhook
        Summary: 删除alarmwebhook
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_alarmwebhook_ex_async(request, headers, runtime)

    def delete_alarmwebhook_ex(
        self,
        request: rms_models.DeleteAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAlarmwebhookResponse:
        """
        Description: 删除alarmwebhook
        Summary: 删除alarmwebhook
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAlarmwebhookResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarmwebhook.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_alarmwebhook_ex_async(
        self,
        request: rms_models.DeleteAlarmwebhookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAlarmwebhookResponse:
        """
        Description: 删除alarmwebhook
        Summary: 删除alarmwebhook
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAlarmwebhookResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarmwebhook.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xdatasource_table(
        self,
        request: rms_models.QueryXdatasourceTableRequest,
    ) -> rms_models.QueryXdatasourceTableResponse:
        """
        Description: datasource table
        Summary: datasource table
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xdatasource_table_ex(request, headers, runtime)

    async def query_xdatasource_table_async(
        self,
        request: rms_models.QueryXdatasourceTableRequest,
    ) -> rms_models.QueryXdatasourceTableResponse:
        """
        Description: datasource table
        Summary: datasource table
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xdatasource_table_ex_async(request, headers, runtime)

    def query_xdatasource_table_ex(
        self,
        request: rms_models.QueryXdatasourceTableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourceTableResponse:
        """
        Description: datasource table
        Summary: datasource table
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourceTableResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.table.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xdatasource_table_ex_async(
        self,
        request: rms_models.QueryXdatasourceTableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourceTableResponse:
        """
        Description: datasource table
        Summary: datasource table
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourceTableResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.table.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_alarm_overview(
        self,
        request: rms_models.GetAlarmOverviewRequest,
    ) -> rms_models.GetAlarmOverviewResponse:
        """
        Description: 告警总览
        Summary: 告警总览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_alarm_overview_ex(request, headers, runtime)

    async def get_alarm_overview_async(
        self,
        request: rms_models.GetAlarmOverviewRequest,
    ) -> rms_models.GetAlarmOverviewResponse:
        """
        Description: 告警总览
        Summary: 告警总览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_alarm_overview_ex_async(request, headers, runtime)

    def get_alarm_overview_ex(
        self,
        request: rms_models.GetAlarmOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAlarmOverviewResponse:
        """
        Description: 告警总览
        Summary: 告警总览
        """
        UtilClient.validate_model(request)
        return rms_models.GetAlarmOverviewResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_alarm_overview_ex_async(
        self,
        request: rms_models.GetAlarmOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAlarmOverviewResponse:
        """
        Description: 告警总览
        Summary: 告警总览
        """
        UtilClient.validate_model(request)
        return rms_models.GetAlarmOverviewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_alarmstats(
        self,
        request: rms_models.QueryAppAlarmstatsRequest,
    ) -> rms_models.QueryAppAlarmstatsResponse:
        """
        Description: 查询应用的告警数据
        Summary: 查询应用的告警数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_alarmstats_ex(request, headers, runtime)

    async def query_app_alarmstats_async(
        self,
        request: rms_models.QueryAppAlarmstatsRequest,
    ) -> rms_models.QueryAppAlarmstatsResponse:
        """
        Description: 查询应用的告警数据
        Summary: 查询应用的告警数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_alarmstats_ex_async(request, headers, runtime)

    def query_app_alarmstats_ex(
        self,
        request: rms_models.QueryAppAlarmstatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppAlarmstatsResponse:
        """
        Description: 查询应用的告警数据
        Summary: 查询应用的告警数据
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppAlarmstatsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.alarmstats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_alarmstats_ex_async(
        self,
        request: rms_models.QueryAppAlarmstatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppAlarmstatsResponse:
        """
        Description: 查询应用的告警数据
        Summary: 查询应用的告警数据
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppAlarmstatsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.alarmstats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarmhistory_alarmtrends(
        self,
        request: rms_models.QueryAlarmhistoryAlarmtrendsRequest,
    ) -> rms_models.QueryAlarmhistoryAlarmtrendsResponse:
        """
        Description: 告警趋势
        Summary: 告警趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarmhistory_alarmtrends_ex(request, headers, runtime)

    async def query_alarmhistory_alarmtrends_async(
        self,
        request: rms_models.QueryAlarmhistoryAlarmtrendsRequest,
    ) -> rms_models.QueryAlarmhistoryAlarmtrendsResponse:
        """
        Description: 告警趋势
        Summary: 告警趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarmhistory_alarmtrends_ex_async(request, headers, runtime)

    def query_alarmhistory_alarmtrends_ex(
        self,
        request: rms_models.QueryAlarmhistoryAlarmtrendsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmhistoryAlarmtrendsResponse:
        """
        Description: 告警趋势
        Summary: 告警趋势
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmhistoryAlarmtrendsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarmhistory.alarmtrends.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarmhistory_alarmtrends_ex_async(
        self,
        request: rms_models.QueryAlarmhistoryAlarmtrendsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmhistoryAlarmtrendsResponse:
        """
        Description: 告警趋势
        Summary: 告警趋势
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmhistoryAlarmtrendsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarmhistory.alarmtrends.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspace_config(
        self,
        request: rms_models.GetWorkspaceConfigRequest,
    ) -> rms_models.GetWorkspaceConfigResponse:
        """
        Description: 获取workspace的配置
        Summary: 获取workspace的配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspace_config_ex(request, headers, runtime)

    async def get_workspace_config_async(
        self,
        request: rms_models.GetWorkspaceConfigRequest,
    ) -> rms_models.GetWorkspaceConfigResponse:
        """
        Description: 获取workspace的配置
        Summary: 获取workspace的配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspace_config_ex_async(request, headers, runtime)

    def get_workspace_config_ex(
        self,
        request: rms_models.GetWorkspaceConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetWorkspaceConfigResponse:
        """
        Description: 获取workspace的配置
        Summary: 获取workspace的配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetWorkspaceConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.workspace.config.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspace_config_ex_async(
        self,
        request: rms_models.GetWorkspaceConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetWorkspaceConfigResponse:
        """
        Description: 获取workspace的配置
        Summary: 获取workspace的配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetWorkspaceConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.workspace.config.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_agent_versionstrategy(
        self,
        request: rms_models.SetAgentVersionstrategyRequest,
    ) -> rms_models.SetAgentVersionstrategyResponse:
        """
        Description: Agent版本策略配置
        Summary: Agent版本策略配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_agent_versionstrategy_ex(request, headers, runtime)

    async def set_agent_versionstrategy_async(
        self,
        request: rms_models.SetAgentVersionstrategyRequest,
    ) -> rms_models.SetAgentVersionstrategyResponse:
        """
        Description: Agent版本策略配置
        Summary: Agent版本策略配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_agent_versionstrategy_ex_async(request, headers, runtime)

    def set_agent_versionstrategy_ex(
        self,
        request: rms_models.SetAgentVersionstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SetAgentVersionstrategyResponse:
        """
        Description: Agent版本策略配置
        Summary: Agent版本策略配置
        """
        UtilClient.validate_model(request)
        return rms_models.SetAgentVersionstrategyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.versionstrategy.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_agent_versionstrategy_ex_async(
        self,
        request: rms_models.SetAgentVersionstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SetAgentVersionstrategyResponse:
        """
        Description: Agent版本策略配置
        Summary: Agent版本策略配置
        """
        UtilClient.validate_model(request)
        return rms_models.SetAgentVersionstrategyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.versionstrategy.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_agent_versionstrategy(
        self,
        request: rms_models.GetAgentVersionstrategyRequest,
    ) -> rms_models.GetAgentVersionstrategyResponse:
        """
        Description: 获取agent版本策略详情
        Summary: 获取agent版本策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_agent_versionstrategy_ex(request, headers, runtime)

    async def get_agent_versionstrategy_async(
        self,
        request: rms_models.GetAgentVersionstrategyRequest,
    ) -> rms_models.GetAgentVersionstrategyResponse:
        """
        Description: 获取agent版本策略详情
        Summary: 获取agent版本策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_agent_versionstrategy_ex_async(request, headers, runtime)

    def get_agent_versionstrategy_ex(
        self,
        request: rms_models.GetAgentVersionstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAgentVersionstrategyResponse:
        """
        Description: 获取agent版本策略详情
        Summary: 获取agent版本策略详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetAgentVersionstrategyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.versionstrategy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_agent_versionstrategy_ex_async(
        self,
        request: rms_models.GetAgentVersionstrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAgentVersionstrategyResponse:
        """
        Description: 获取agent版本策略详情
        Summary: 获取agent版本策略详情
        """
        UtilClient.validate_model(request)
        return rms_models.GetAgentVersionstrategyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.versionstrategy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_system_time(
        self,
        request: rms_models.GetSystemTimeRequest,
    ) -> rms_models.GetSystemTimeResponse:
        """
        Description: 获取服务器系统时间
        Summary: 获取服务器系统时间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_system_time_ex(request, headers, runtime)

    async def get_system_time_async(
        self,
        request: rms_models.GetSystemTimeRequest,
    ) -> rms_models.GetSystemTimeResponse:
        """
        Description: 获取服务器系统时间
        Summary: 获取服务器系统时间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_system_time_ex_async(request, headers, runtime)

    def get_system_time_ex(
        self,
        request: rms_models.GetSystemTimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetSystemTimeResponse:
        """
        Description: 获取服务器系统时间
        Summary: 获取服务器系统时间
        """
        UtilClient.validate_model(request)
        return rms_models.GetSystemTimeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.system.time.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_system_time_ex_async(
        self,
        request: rms_models.GetSystemTimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetSystemTimeResponse:
        """
        Description: 获取服务器系统时间
        Summary: 获取服务器系统时间
        """
        UtilClient.validate_model(request)
        return rms_models.GetSystemTimeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.system.time.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_xdatasource_move(
        self,
        request: rms_models.ExecXdatasourceMoveRequest,
    ) -> rms_models.ExecXdatasourceMoveResponse:
        """
        Description: move datasource
        Summary: move datasource
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_xdatasource_move_ex(request, headers, runtime)

    async def exec_xdatasource_move_async(
        self,
        request: rms_models.ExecXdatasourceMoveRequest,
    ) -> rms_models.ExecXdatasourceMoveResponse:
        """
        Description: move datasource
        Summary: move datasource
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_xdatasource_move_ex_async(request, headers, runtime)

    def exec_xdatasource_move_ex(
        self,
        request: rms_models.ExecXdatasourceMoveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ExecXdatasourceMoveResponse:
        """
        Description: move datasource
        Summary: move datasource
        """
        UtilClient.validate_model(request)
        return rms_models.ExecXdatasourceMoveResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.move.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_xdatasource_move_ex_async(
        self,
        request: rms_models.ExecXdatasourceMoveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ExecXdatasourceMoveResponse:
        """
        Description: move datasource
        Summary: move datasource
        """
        UtilClient.validate_model(request)
        return rms_models.ExecXdatasourceMoveResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.move.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetadata_tag(
        self,
        request: rms_models.QueryXmetadataTagRequest,
    ) -> rms_models.QueryXmetadataTagResponse:
        """
        Description: metadata default tags
        Summary: default tags
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetadata_tag_ex(request, headers, runtime)

    async def query_xmetadata_tag_async(
        self,
        request: rms_models.QueryXmetadataTagRequest,
    ) -> rms_models.QueryXmetadataTagResponse:
        """
        Description: metadata default tags
        Summary: default tags
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetadata_tag_ex_async(request, headers, runtime)

    def query_xmetadata_tag_ex(
        self,
        request: rms_models.QueryXmetadataTagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetadataTagResponse:
        """
        Description: metadata default tags
        Summary: default tags
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetadataTagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetadata.tag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetadata_tag_ex_async(
        self,
        request: rms_models.QueryXmetadataTagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetadataTagResponse:
        """
        Description: metadata default tags
        Summary: default tags
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetadataTagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetadata.tag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xdatasource_search(
        self,
        request: rms_models.QueryXdatasourceSearchRequest,
    ) -> rms_models.QueryXdatasourceSearchResponse:
        """
        Description: search datasource
        Summary: search datasource
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xdatasource_search_ex(request, headers, runtime)

    async def query_xdatasource_search_async(
        self,
        request: rms_models.QueryXdatasourceSearchRequest,
    ) -> rms_models.QueryXdatasourceSearchResponse:
        """
        Description: search datasource
        Summary: search datasource
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xdatasource_search_ex_async(request, headers, runtime)

    def query_xdatasource_search_ex(
        self,
        request: rms_models.QueryXdatasourceSearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourceSearchResponse:
        """
        Description: search datasource
        Summary: search datasource
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourceSearchResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.search.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xdatasource_search_ex_async(
        self,
        request: rms_models.QueryXdatasourceSearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourceSearchResponse:
        """
        Description: search datasource
        Summary: search datasource
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourceSearchResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.search.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_setup_config(
        self,
        request: rms_models.QuerySetupConfigRequest,
    ) -> rms_models.QuerySetupConfigResponse:
        """
        Description:
        Summary: query setup config
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_setup_config_ex(request, headers, runtime)

    async def query_setup_config_async(
        self,
        request: rms_models.QuerySetupConfigRequest,
    ) -> rms_models.QuerySetupConfigResponse:
        """
        Description:
        Summary: query setup config
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_setup_config_ex_async(request, headers, runtime)

    def query_setup_config_ex(
        self,
        request: rms_models.QuerySetupConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QuerySetupConfigResponse:
        """
        Description:
        Summary: query setup config
        """
        UtilClient.validate_model(request)
        return rms_models.QuerySetupConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.setup.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_setup_config_ex_async(
        self,
        request: rms_models.QuerySetupConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QuerySetupConfigResponse:
        """
        Description:
        Summary: query setup config
        """
        UtilClient.validate_model(request)
        return rms_models.QuerySetupConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.setup.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_setup_config(
        self,
        request: rms_models.UpdateSetupConfigRequest,
    ) -> rms_models.UpdateSetupConfigResponse:
        """
        Description:
        Summary: update or insert
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_setup_config_ex(request, headers, runtime)

    async def update_setup_config_async(
        self,
        request: rms_models.UpdateSetupConfigRequest,
    ) -> rms_models.UpdateSetupConfigResponse:
        """
        Description:
        Summary: update or insert
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_setup_config_ex_async(request, headers, runtime)

    def update_setup_config_ex(
        self,
        request: rms_models.UpdateSetupConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateSetupConfigResponse:
        """
        Description:
        Summary: update or insert
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateSetupConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.setup.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_setup_config_ex_async(
        self,
        request: rms_models.UpdateSetupConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateSetupConfigResponse:
        """
        Description:
        Summary: update or insert
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateSetupConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.setup.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_setup_config(
        self,
        request: rms_models.DeleteSetupConfigRequest,
    ) -> rms_models.DeleteSetupConfigResponse:
        """
        Description:
        Summary: delete config
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_setup_config_ex(request, headers, runtime)

    async def delete_setup_config_async(
        self,
        request: rms_models.DeleteSetupConfigRequest,
    ) -> rms_models.DeleteSetupConfigResponse:
        """
        Description:
        Summary: delete config
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_setup_config_ex_async(request, headers, runtime)

    def delete_setup_config_ex(
        self,
        request: rms_models.DeleteSetupConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteSetupConfigResponse:
        """
        Description:
        Summary: delete config
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteSetupConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.setup.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_setup_config_ex_async(
        self,
        request: rms_models.DeleteSetupConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteSetupConfigResponse:
        """
        Description:
        Summary: delete config
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteSetupConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.setup.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_workspace_setting(
        self,
        request: rms_models.UpdateWorkspaceSettingRequest,
    ) -> rms_models.UpdateWorkspaceSettingResponse:
        """
        Description: 告警开关配置更新
        Summary: 告警开关配置更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_workspace_setting_ex(request, headers, runtime)

    async def update_workspace_setting_async(
        self,
        request: rms_models.UpdateWorkspaceSettingRequest,
    ) -> rms_models.UpdateWorkspaceSettingResponse:
        """
        Description: 告警开关配置更新
        Summary: 告警开关配置更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_workspace_setting_ex_async(request, headers, runtime)

    def update_workspace_setting_ex(
        self,
        request: rms_models.UpdateWorkspaceSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateWorkspaceSettingResponse:
        """
        Description: 告警开关配置更新
        Summary: 告警开关配置更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateWorkspaceSettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.workspace.setting.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_workspace_setting_ex_async(
        self,
        request: rms_models.UpdateWorkspaceSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateWorkspaceSettingResponse:
        """
        Description: 告警开关配置更新
        Summary: 告警开关配置更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateWorkspaceSettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.workspace.setting.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_xsite_config(
        self,
        request: rms_models.ExportXsiteConfigRequest,
    ) -> rms_models.ExportXsiteConfigResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_xsite_config_ex(request, headers, runtime)

    async def export_xsite_config_async(
        self,
        request: rms_models.ExportXsiteConfigRequest,
    ) -> rms_models.ExportXsiteConfigResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_xsite_config_ex_async(request, headers, runtime)

    def export_xsite_config_ex(
        self,
        request: rms_models.ExportXsiteConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ExportXsiteConfigResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.ExportXsiteConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xsite.config.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_xsite_config_ex_async(
        self,
        request: rms_models.ExportXsiteConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ExportXsiteConfigResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.ExportXsiteConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xsite.config.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_xsite_config(
        self,
        request: rms_models.ImportXsiteConfigRequest,
    ) -> rms_models.ImportXsiteConfigResponse:
        """
        Description:
        Summary: import
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_xsite_config_ex(request, headers, runtime)

    async def import_xsite_config_async(
        self,
        request: rms_models.ImportXsiteConfigRequest,
    ) -> rms_models.ImportXsiteConfigResponse:
        """
        Description:
        Summary: import
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_xsite_config_ex_async(request, headers, runtime)

    def import_xsite_config_ex(
        self,
        request: rms_models.ImportXsiteConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ImportXsiteConfigResponse:
        """
        Description:
        Summary: import
        """
        UtilClient.validate_model(request)
        return rms_models.ImportXsiteConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xsite.config.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_xsite_config_ex_async(
        self,
        request: rms_models.ImportXsiteConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ImportXsiteConfigResponse:
        """
        Description:
        Summary: import
        """
        UtilClient.validate_model(request)
        return rms_models.ImportXsiteConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xsite.config.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xdatasource_tree(
        self,
        request: rms_models.QueryXdatasourceTreeRequest,
    ) -> rms_models.QueryXdatasourceTreeResponse:
        """
        Description:
        Summary: tree
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xdatasource_tree_ex(request, headers, runtime)

    async def query_xdatasource_tree_async(
        self,
        request: rms_models.QueryXdatasourceTreeRequest,
    ) -> rms_models.QueryXdatasourceTreeResponse:
        """
        Description:
        Summary: tree
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xdatasource_tree_ex_async(request, headers, runtime)

    def query_xdatasource_tree_ex(
        self,
        request: rms_models.QueryXdatasourceTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourceTreeResponse:
        """
        Description:
        Summary: tree
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourceTreeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.tree.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xdatasource_tree_ex_async(
        self,
        request: rms_models.QueryXdatasourceTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourceTreeResponse:
        """
        Description:
        Summary: tree
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourceTreeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.tree.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xdashboard_tree(
        self,
        request: rms_models.QueryXdashboardTreeRequest,
    ) -> rms_models.QueryXdashboardTreeResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xdashboard_tree_ex(request, headers, runtime)

    async def query_xdashboard_tree_async(
        self,
        request: rms_models.QueryXdashboardTreeRequest,
    ) -> rms_models.QueryXdashboardTreeResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xdashboard_tree_ex_async(request, headers, runtime)

    def query_xdashboard_tree_ex(
        self,
        request: rms_models.QueryXdashboardTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdashboardTreeResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdashboardTreeResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.tree.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xdashboard_tree_ex_async(
        self,
        request: rms_models.QueryXdashboardTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdashboardTreeResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdashboardTreeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.tree.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_xdashboard(
        self,
        request: rms_models.GetXdashboardRequest,
    ) -> rms_models.GetXdashboardResponse:
        """
        Description:
        Summary: dashboard查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_xdashboard_ex(request, headers, runtime)

    async def get_xdashboard_async(
        self,
        request: rms_models.GetXdashboardRequest,
    ) -> rms_models.GetXdashboardResponse:
        """
        Description:
        Summary: dashboard查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_xdashboard_ex_async(request, headers, runtime)

    def get_xdashboard_ex(
        self,
        request: rms_models.GetXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetXdashboardResponse:
        """
        Description:
        Summary: dashboard查询
        """
        UtilClient.validate_model(request)
        return rms_models.GetXdashboardResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdashboard.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_xdashboard_ex_async(
        self,
        request: rms_models.GetXdashboardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetXdashboardResponse:
        """
        Description:
        Summary: dashboard查询
        """
        UtilClient.validate_model(request)
        return rms_models.GetXdashboardResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdashboard.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xdatasource_prometheus(
        self,
        request: rms_models.QueryXdatasourcePrometheusRequest,
    ) -> rms_models.QueryXdatasourcePrometheusResponse:
        """
        Description:
        Summary: prometheus metrics
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xdatasource_prometheus_ex(request, headers, runtime)

    async def query_xdatasource_prometheus_async(
        self,
        request: rms_models.QueryXdatasourcePrometheusRequest,
    ) -> rms_models.QueryXdatasourcePrometheusResponse:
        """
        Description:
        Summary: prometheus metrics
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xdatasource_prometheus_ex_async(request, headers, runtime)

    def query_xdatasource_prometheus_ex(
        self,
        request: rms_models.QueryXdatasourcePrometheusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourcePrometheusResponse:
        """
        Description:
        Summary: prometheus metrics
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourcePrometheusResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xdatasource.prometheus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xdatasource_prometheus_ex_async(
        self,
        request: rms_models.QueryXdatasourcePrometheusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXdatasourcePrometheusResponse:
        """
        Description:
        Summary: prometheus metrics
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXdatasourcePrometheusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xdatasource.prometheus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_node_overview(
        self,
        request: rms_models.GetNodeOverviewRequest,
    ) -> rms_models.GetNodeOverviewResponse:
        """
        Description:  获取总览页主机统计信息
        Summary:  获取总览页主机统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_node_overview_ex(request, headers, runtime)

    async def get_node_overview_async(
        self,
        request: rms_models.GetNodeOverviewRequest,
    ) -> rms_models.GetNodeOverviewResponse:
        """
        Description:  获取总览页主机统计信息
        Summary:  获取总览页主机统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_node_overview_ex_async(request, headers, runtime)

    def get_node_overview_ex(
        self,
        request: rms_models.GetNodeOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetNodeOverviewResponse:
        """
        Description:  获取总览页主机统计信息
        Summary:  获取总览页主机统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.GetNodeOverviewResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.node.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_node_overview_ex_async(
        self,
        request: rms_models.GetNodeOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetNodeOverviewResponse:
        """
        Description:  获取总览页主机统计信息
        Summary:  获取总览页主机统计信息
        """
        UtilClient.validate_model(request)
        return rms_models.GetNodeOverviewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.node.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_config_overview(
        self,
        request: rms_models.GetConfigOverviewRequest,
    ) -> rms_models.GetConfigOverviewResponse:
        """
        Description: 总览页配置信息统计
        Summary: 总览页配置信息统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_config_overview_ex(request, headers, runtime)

    async def get_config_overview_async(
        self,
        request: rms_models.GetConfigOverviewRequest,
    ) -> rms_models.GetConfigOverviewResponse:
        """
        Description: 总览页配置信息统计
        Summary: 总览页配置信息统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_config_overview_ex_async(request, headers, runtime)

    def get_config_overview_ex(
        self,
        request: rms_models.GetConfigOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetConfigOverviewResponse:
        """
        Description: 总览页配置信息统计
        Summary: 总览页配置信息统计
        """
        UtilClient.validate_model(request)
        return rms_models.GetConfigOverviewResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.config.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_config_overview_ex_async(
        self,
        request: rms_models.GetConfigOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetConfigOverviewResponse:
        """
        Description: 总览页配置信息统计
        Summary: 总览页配置信息统计
        """
        UtilClient.validate_model(request)
        return rms_models.GetConfigOverviewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.config.overview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspace_setting(
        self,
        request: rms_models.GetWorkspaceSettingRequest,
    ) -> rms_models.GetWorkspaceSettingResponse:
        """
        Description: 获取workspace具体配置
        Summary: 获取workspace具体配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspace_setting_ex(request, headers, runtime)

    async def get_workspace_setting_async(
        self,
        request: rms_models.GetWorkspaceSettingRequest,
    ) -> rms_models.GetWorkspaceSettingResponse:
        """
        Description: 获取workspace具体配置
        Summary: 获取workspace具体配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspace_setting_ex_async(request, headers, runtime)

    def get_workspace_setting_ex(
        self,
        request: rms_models.GetWorkspaceSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetWorkspaceSettingResponse:
        """
        Description: 获取workspace具体配置
        Summary: 获取workspace具体配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetWorkspaceSettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.workspace.setting.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspace_setting_ex_async(
        self,
        request: rms_models.GetWorkspaceSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetWorkspaceSettingResponse:
        """
        Description: 获取workspace具体配置
        Summary: 获取workspace具体配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetWorkspaceSettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.workspace.setting.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_trace_workspacesetting(
        self,
        request: rms_models.ListTraceWorkspacesettingRequest,
    ) -> rms_models.ListTraceWorkspacesettingResponse:
        """
        Description: 获取链路工作空间配置
        Summary: 获取链路工作空间配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_trace_workspacesetting_ex(request, headers, runtime)

    async def list_trace_workspacesetting_async(
        self,
        request: rms_models.ListTraceWorkspacesettingRequest,
    ) -> rms_models.ListTraceWorkspacesettingResponse:
        """
        Description: 获取链路工作空间配置
        Summary: 获取链路工作空间配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_trace_workspacesetting_ex_async(request, headers, runtime)

    def list_trace_workspacesetting_ex(
        self,
        request: rms_models.ListTraceWorkspacesettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListTraceWorkspacesettingResponse:
        """
        Description: 获取链路工作空间配置
        Summary: 获取链路工作空间配置
        """
        UtilClient.validate_model(request)
        return rms_models.ListTraceWorkspacesettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.workspacesetting.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_trace_workspacesetting_ex_async(
        self,
        request: rms_models.ListTraceWorkspacesettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListTraceWorkspacesettingResponse:
        """
        Description: 获取链路工作空间配置
        Summary: 获取链路工作空间配置
        """
        UtilClient.validate_model(request)
        return rms_models.ListTraceWorkspacesettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.workspacesetting.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_trace_workspacesetting(
        self,
        request: rms_models.UpdateTraceWorkspacesettingRequest,
    ) -> rms_models.UpdateTraceWorkspacesettingResponse:
        """
        Description: 链路工作空间配置更新
        Summary: 链路工作空间配置更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_trace_workspacesetting_ex(request, headers, runtime)

    async def update_trace_workspacesetting_async(
        self,
        request: rms_models.UpdateTraceWorkspacesettingRequest,
    ) -> rms_models.UpdateTraceWorkspacesettingResponse:
        """
        Description: 链路工作空间配置更新
        Summary: 链路工作空间配置更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_trace_workspacesetting_ex_async(request, headers, runtime)

    def update_trace_workspacesetting_ex(
        self,
        request: rms_models.UpdateTraceWorkspacesettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraceWorkspacesettingResponse:
        """
        Description: 链路工作空间配置更新
        Summary: 链路工作空间配置更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraceWorkspacesettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.workspacesetting.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_trace_workspacesetting_ex_async(
        self,
        request: rms_models.UpdateTraceWorkspacesettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraceWorkspacesettingResponse:
        """
        Description: 链路工作空间配置更新
        Summary: 链路工作空间配置更新
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraceWorkspacesettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.workspacesetting.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_app_setting(
        self,
        request: rms_models.ListAppSettingRequest,
    ) -> rms_models.ListAppSettingResponse:
        """
        Description: APP配置列表
        Summary: APP配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_app_setting_ex(request, headers, runtime)

    async def list_app_setting_async(
        self,
        request: rms_models.ListAppSettingRequest,
    ) -> rms_models.ListAppSettingResponse:
        """
        Description: APP配置列表
        Summary: APP配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_app_setting_ex_async(request, headers, runtime)

    def list_app_setting_ex(
        self,
        request: rms_models.ListAppSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAppSettingResponse:
        """
        Description: APP配置列表
        Summary: APP配置列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAppSettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.setting.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_app_setting_ex_async(
        self,
        request: rms_models.ListAppSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAppSettingResponse:
        """
        Description: APP配置列表
        Summary: APP配置列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAppSettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.setting.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_app_setting(
        self,
        request: rms_models.UpdateAppSettingRequest,
    ) -> rms_models.UpdateAppSettingResponse:
        """
        Description: 创建APP配置信息
        Summary: 创建APP配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_app_setting_ex(request, headers, runtime)

    async def update_app_setting_async(
        self,
        request: rms_models.UpdateAppSettingRequest,
    ) -> rms_models.UpdateAppSettingResponse:
        """
        Description: 创建APP配置信息
        Summary: 创建APP配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_app_setting_ex_async(request, headers, runtime)

    def update_app_setting_ex(
        self,
        request: rms_models.UpdateAppSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAppSettingResponse:
        """
        Description: 创建APP配置信息
        Summary: 创建APP配置信息
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAppSettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.setting.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_app_setting_ex_async(
        self,
        request: rms_models.UpdateAppSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAppSettingResponse:
        """
        Description: 创建APP配置信息
        Summary: 创建APP配置信息
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAppSettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.setting.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_app_setting(
        self,
        request: rms_models.GetAppSettingRequest,
    ) -> rms_models.GetAppSettingResponse:
        """
        Description: 获取APP配置信息
        Summary: 获取APP配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_app_setting_ex(request, headers, runtime)

    async def get_app_setting_async(
        self,
        request: rms_models.GetAppSettingRequest,
    ) -> rms_models.GetAppSettingResponse:
        """
        Description: 获取APP配置信息
        Summary: 获取APP配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_app_setting_ex_async(request, headers, runtime)

    def get_app_setting_ex(
        self,
        request: rms_models.GetAppSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAppSettingResponse:
        """
        Description: 获取APP配置信息
        Summary: 获取APP配置信息
        """
        UtilClient.validate_model(request)
        return rms_models.GetAppSettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.setting.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_app_setting_ex_async(
        self,
        request: rms_models.GetAppSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetAppSettingResponse:
        """
        Description: 获取APP配置信息
        Summary: 获取APP配置信息
        """
        UtilClient.validate_model(request)
        return rms_models.GetAppSettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.setting.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_eventdetail(
        self,
        request: rms_models.QueryUnifiedalarmEventdetailRequest,
    ) -> rms_models.QueryUnifiedalarmEventdetailResponse:
        """
        Description: 查询某一告警事件相关的告警列表
        Summary: 查询某一告警事件相关的告警列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_eventdetail_ex(request, headers, runtime)

    async def query_unifiedalarm_eventdetail_async(
        self,
        request: rms_models.QueryUnifiedalarmEventdetailRequest,
    ) -> rms_models.QueryUnifiedalarmEventdetailResponse:
        """
        Description: 查询某一告警事件相关的告警列表
        Summary: 查询某一告警事件相关的告警列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_eventdetail_ex_async(request, headers, runtime)

    def query_unifiedalarm_eventdetail_ex(
        self,
        request: rms_models.QueryUnifiedalarmEventdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmEventdetailResponse:
        """
        Description: 查询某一告警事件相关的告警列表
        Summary: 查询某一告警事件相关的告警列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmEventdetailResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.eventdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_eventdetail_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmEventdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmEventdetailResponse:
        """
        Description: 查询某一告警事件相关的告警列表
        Summary: 查询某一告警事件相关的告警列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmEventdetailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.eventdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_monitorlist(
        self,
        request: rms_models.QueryUnifiedalarmMonitorlistRequest,
    ) -> rms_models.QueryUnifiedalarmMonitorlistResponse:
        """
        Description: 查询应用的告警指标清单
        Summary: 查询应用的告警指标清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_monitorlist_ex(request, headers, runtime)

    async def query_unifiedalarm_monitorlist_async(
        self,
        request: rms_models.QueryUnifiedalarmMonitorlistRequest,
    ) -> rms_models.QueryUnifiedalarmMonitorlistResponse:
        """
        Description: 查询应用的告警指标清单
        Summary: 查询应用的告警指标清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_monitorlist_ex_async(request, headers, runtime)

    def query_unifiedalarm_monitorlist_ex(
        self,
        request: rms_models.QueryUnifiedalarmMonitorlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmMonitorlistResponse:
        """
        Description: 查询应用的告警指标清单
        Summary: 查询应用的告警指标清单
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmMonitorlistResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.monitorlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_monitorlist_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmMonitorlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmMonitorlistResponse:
        """
        Description: 查询应用的告警指标清单
        Summary: 查询应用的告警指标清单
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmMonitorlistResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.monitorlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_xmetric_table(
        self,
        request: rms_models.QueryXmetricTableRequest,
    ) -> rms_models.QueryXmetricTableResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_xmetric_table_ex(request, headers, runtime)

    async def query_xmetric_table_async(
        self,
        request: rms_models.QueryXmetricTableRequest,
    ) -> rms_models.QueryXmetricTableResponse:
        """
        Description:
        Summary:
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_xmetric_table_ex_async(request, headers, runtime)

    def query_xmetric_table_ex(
        self,
        request: rms_models.QueryXmetricTableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricTableResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricTableResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.xmetric.table.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_xmetric_table_ex_async(
        self,
        request: rms_models.QueryXmetricTableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryXmetricTableResponse:
        """
        Description:
        Summary:
        """
        UtilClient.validate_model(request)
        return rms_models.QueryXmetricTableResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.xmetric.table.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appsqlmetrics(
        self,
        request: rms_models.QueryTraceAppsqlmetricsRequest,
    ) -> rms_models.QueryTraceAppsqlmetricsResponse:
        """
        Description: 查询应用的SQL调用指标
        Summary: 查询应用的SQL调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appsqlmetrics_ex(request, headers, runtime)

    async def query_trace_appsqlmetrics_async(
        self,
        request: rms_models.QueryTraceAppsqlmetricsRequest,
    ) -> rms_models.QueryTraceAppsqlmetricsResponse:
        """
        Description: 查询应用的SQL调用指标
        Summary: 查询应用的SQL调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appsqlmetrics_ex_async(request, headers, runtime)

    def query_trace_appsqlmetrics_ex(
        self,
        request: rms_models.QueryTraceAppsqlmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppsqlmetricsResponse:
        """
        Description: 查询应用的SQL调用指标
        Summary: 查询应用的SQL调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppsqlmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appsqlmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appsqlmetrics_ex_async(
        self,
        request: rms_models.QueryTraceAppsqlmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppsqlmetricsResponse:
        """
        Description: 查询应用的SQL调用指标
        Summary: 查询应用的SQL调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppsqlmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appsqlmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appsqlstat(
        self,
        request: rms_models.QueryTraceAppsqlstatRequest,
    ) -> rms_models.QueryTraceAppsqlstatResponse:
        """
        Description: 查询应用的SQL请求调用明细
        Summary: 查询应用的SQL请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appsqlstat_ex(request, headers, runtime)

    async def query_trace_appsqlstat_async(
        self,
        request: rms_models.QueryTraceAppsqlstatRequest,
    ) -> rms_models.QueryTraceAppsqlstatResponse:
        """
        Description: 查询应用的SQL请求调用明细
        Summary: 查询应用的SQL请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appsqlstat_ex_async(request, headers, runtime)

    def query_trace_appsqlstat_ex(
        self,
        request: rms_models.QueryTraceAppsqlstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppsqlstatResponse:
        """
        Description: 查询应用的SQL请求调用明细
        Summary: 查询应用的SQL请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppsqlstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appsqlstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appsqlstat_ex_async(
        self,
        request: rms_models.QueryTraceAppsqlstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppsqlstatResponse:
        """
        Description: 查询应用的SQL请求调用明细
        Summary: 查询应用的SQL请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppsqlstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appsqlstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appnosqlmetrics(
        self,
        request: rms_models.QueryTraceAppnosqlmetricsRequest,
    ) -> rms_models.QueryTraceAppnosqlmetricsResponse:
        """
        Description: 查询应用的NoSQL调用指标
        Summary: 查询应用的NoSQL调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appnosqlmetrics_ex(request, headers, runtime)

    async def query_trace_appnosqlmetrics_async(
        self,
        request: rms_models.QueryTraceAppnosqlmetricsRequest,
    ) -> rms_models.QueryTraceAppnosqlmetricsResponse:
        """
        Description: 查询应用的NoSQL调用指标
        Summary: 查询应用的NoSQL调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appnosqlmetrics_ex_async(request, headers, runtime)

    def query_trace_appnosqlmetrics_ex(
        self,
        request: rms_models.QueryTraceAppnosqlmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppnosqlmetricsResponse:
        """
        Description: 查询应用的NoSQL调用指标
        Summary: 查询应用的NoSQL调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppnosqlmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appnosqlmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appnosqlmetrics_ex_async(
        self,
        request: rms_models.QueryTraceAppnosqlmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppnosqlmetricsResponse:
        """
        Description: 查询应用的NoSQL调用指标
        Summary: 查询应用的NoSQL调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppnosqlmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appnosqlmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appmqconsumemetrics(
        self,
        request: rms_models.QueryTraceAppmqconsumemetricsRequest,
    ) -> rms_models.QueryTraceAppmqconsumemetricsResponse:
        """
        Description: 查询应用的MQ消费调用指标
        Summary: 查询应用的MQ消费调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appmqconsumemetrics_ex(request, headers, runtime)

    async def query_trace_appmqconsumemetrics_async(
        self,
        request: rms_models.QueryTraceAppmqconsumemetricsRequest,
    ) -> rms_models.QueryTraceAppmqconsumemetricsResponse:
        """
        Description: 查询应用的MQ消费调用指标
        Summary: 查询应用的MQ消费调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appmqconsumemetrics_ex_async(request, headers, runtime)

    def query_trace_appmqconsumemetrics_ex(
        self,
        request: rms_models.QueryTraceAppmqconsumemetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqconsumemetricsResponse:
        """
        Description: 查询应用的MQ消费调用指标
        Summary: 查询应用的MQ消费调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqconsumemetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appmqconsumemetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appmqconsumemetrics_ex_async(
        self,
        request: rms_models.QueryTraceAppmqconsumemetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqconsumemetricsResponse:
        """
        Description: 查询应用的MQ消费调用指标
        Summary: 查询应用的MQ消费调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqconsumemetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appmqconsumemetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apprpcclientmetrics(
        self,
        request: rms_models.QueryTraceApprpcclientmetricsRequest,
    ) -> rms_models.QueryTraceApprpcclientmetricsResponse:
        """
        Description: 查询应用的RPC客户端调用指标
        Summary: 查询应用的RPC客户端调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apprpcclientmetrics_ex(request, headers, runtime)

    async def query_trace_apprpcclientmetrics_async(
        self,
        request: rms_models.QueryTraceApprpcclientmetricsRequest,
    ) -> rms_models.QueryTraceApprpcclientmetricsResponse:
        """
        Description: 查询应用的RPC客户端调用指标
        Summary: 查询应用的RPC客户端调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apprpcclientmetrics_ex_async(request, headers, runtime)

    def query_trace_apprpcclientmetrics_ex(
        self,
        request: rms_models.QueryTraceApprpcclientmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcclientmetricsResponse:
        """
        Description: 查询应用的RPC客户端调用指标
        Summary: 查询应用的RPC客户端调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcclientmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apprpcclientmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apprpcclientmetrics_ex_async(
        self,
        request: rms_models.QueryTraceApprpcclientmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcclientmetricsResponse:
        """
        Description: 查询应用的RPC客户端调用指标
        Summary: 查询应用的RPC客户端调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcclientmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apprpcclientmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apprpcservermetrics(
        self,
        request: rms_models.QueryTraceApprpcservermetricsRequest,
    ) -> rms_models.QueryTraceApprpcservermetricsResponse:
        """
        Description: 查询应用的RPC服务端指标
        Summary:  查询应用的RPC服务端指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apprpcservermetrics_ex(request, headers, runtime)

    async def query_trace_apprpcservermetrics_async(
        self,
        request: rms_models.QueryTraceApprpcservermetricsRequest,
    ) -> rms_models.QueryTraceApprpcservermetricsResponse:
        """
        Description: 查询应用的RPC服务端指标
        Summary:  查询应用的RPC服务端指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apprpcservermetrics_ex_async(request, headers, runtime)

    def query_trace_apprpcservermetrics_ex(
        self,
        request: rms_models.QueryTraceApprpcservermetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcservermetricsResponse:
        """
        Description: 查询应用的RPC服务端指标
        Summary:  查询应用的RPC服务端指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcservermetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apprpcservermetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apprpcservermetrics_ex_async(
        self,
        request: rms_models.QueryTraceApprpcservermetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcservermetricsResponse:
        """
        Description: 查询应用的RPC服务端指标
        Summary:  查询应用的RPC服务端指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcservermetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apprpcservermetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apphttpclientmetrics(
        self,
        request: rms_models.QueryTraceApphttpclientmetricsRequest,
    ) -> rms_models.QueryTraceApphttpclientmetricsResponse:
        """
        Description: 查询应用的HTTP客户端调用指标
        Summary: 查询应用的HTTP客户端调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apphttpclientmetrics_ex(request, headers, runtime)

    async def query_trace_apphttpclientmetrics_async(
        self,
        request: rms_models.QueryTraceApphttpclientmetricsRequest,
    ) -> rms_models.QueryTraceApphttpclientmetricsResponse:
        """
        Description: 查询应用的HTTP客户端调用指标
        Summary: 查询应用的HTTP客户端调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apphttpclientmetrics_ex_async(request, headers, runtime)

    def query_trace_apphttpclientmetrics_ex(
        self,
        request: rms_models.QueryTraceApphttpclientmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpclientmetricsResponse:
        """
        Description: 查询应用的HTTP客户端调用指标
        Summary: 查询应用的HTTP客户端调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpclientmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apphttpclientmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apphttpclientmetrics_ex_async(
        self,
        request: rms_models.QueryTraceApphttpclientmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpclientmetricsResponse:
        """
        Description: 查询应用的HTTP客户端调用指标
        Summary: 查询应用的HTTP客户端调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpclientmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apphttpclientmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apphttpservermetrics(
        self,
        request: rms_models.QueryTraceApphttpservermetricsRequest,
    ) -> rms_models.QueryTraceApphttpservermetricsResponse:
        """
        Description: 查询应用的HTTP服务端指标
        Summary: 查询应用的HTTP服务端指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apphttpservermetrics_ex(request, headers, runtime)

    async def query_trace_apphttpservermetrics_async(
        self,
        request: rms_models.QueryTraceApphttpservermetricsRequest,
    ) -> rms_models.QueryTraceApphttpservermetricsResponse:
        """
        Description: 查询应用的HTTP服务端指标
        Summary: 查询应用的HTTP服务端指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apphttpservermetrics_ex_async(request, headers, runtime)

    def query_trace_apphttpservermetrics_ex(
        self,
        request: rms_models.QueryTraceApphttpservermetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpservermetricsResponse:
        """
        Description: 查询应用的HTTP服务端指标
        Summary: 查询应用的HTTP服务端指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpservermetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apphttpservermetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apphttpservermetrics_ex_async(
        self,
        request: rms_models.QueryTraceApphttpservermetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpservermetricsResponse:
        """
        Description: 查询应用的HTTP服务端指标
        Summary: 查询应用的HTTP服务端指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpservermetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apphttpservermetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appnosqlstat(
        self,
        request: rms_models.QueryTraceAppnosqlstatRequest,
    ) -> rms_models.QueryTraceAppnosqlstatResponse:
        """
        Description: 查询应用的NoSQL请求调用明细
        Summary: 查询应用的NoSQL请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appnosqlstat_ex(request, headers, runtime)

    async def query_trace_appnosqlstat_async(
        self,
        request: rms_models.QueryTraceAppnosqlstatRequest,
    ) -> rms_models.QueryTraceAppnosqlstatResponse:
        """
        Description: 查询应用的NoSQL请求调用明细
        Summary: 查询应用的NoSQL请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appnosqlstat_ex_async(request, headers, runtime)

    def query_trace_appnosqlstat_ex(
        self,
        request: rms_models.QueryTraceAppnosqlstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppnosqlstatResponse:
        """
        Description: 查询应用的NoSQL请求调用明细
        Summary: 查询应用的NoSQL请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppnosqlstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appnosqlstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appnosqlstat_ex_async(
        self,
        request: rms_models.QueryTraceAppnosqlstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppnosqlstatResponse:
        """
        Description: 查询应用的NoSQL请求调用明细
        Summary: 查询应用的NoSQL请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppnosqlstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appnosqlstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appmqconsumestat(
        self,
        request: rms_models.QueryTraceAppmqconsumestatRequest,
    ) -> rms_models.QueryTraceAppmqconsumestatResponse:
        """
        Description: 查询应用的MQ消费调用明细
        Summary: 查询应用的MQ消费调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appmqconsumestat_ex(request, headers, runtime)

    async def query_trace_appmqconsumestat_async(
        self,
        request: rms_models.QueryTraceAppmqconsumestatRequest,
    ) -> rms_models.QueryTraceAppmqconsumestatResponse:
        """
        Description: 查询应用的MQ消费调用明细
        Summary: 查询应用的MQ消费调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appmqconsumestat_ex_async(request, headers, runtime)

    def query_trace_appmqconsumestat_ex(
        self,
        request: rms_models.QueryTraceAppmqconsumestatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqconsumestatResponse:
        """
        Description: 查询应用的MQ消费调用明细
        Summary: 查询应用的MQ消费调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqconsumestatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appmqconsumestat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appmqconsumestat_ex_async(
        self,
        request: rms_models.QueryTraceAppmqconsumestatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqconsumestatResponse:
        """
        Description: 查询应用的MQ消费调用明细
        Summary: 查询应用的MQ消费调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqconsumestatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appmqconsumestat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apphttpclientstat(
        self,
        request: rms_models.QueryTraceApphttpclientstatRequest,
    ) -> rms_models.QueryTraceApphttpclientstatResponse:
        """
        Description: 查询应用的HTTP客户端请求调用明细
        Summary: 查询应用的HTTP客户端请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apphttpclientstat_ex(request, headers, runtime)

    async def query_trace_apphttpclientstat_async(
        self,
        request: rms_models.QueryTraceApphttpclientstatRequest,
    ) -> rms_models.QueryTraceApphttpclientstatResponse:
        """
        Description: 查询应用的HTTP客户端请求调用明细
        Summary: 查询应用的HTTP客户端请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apphttpclientstat_ex_async(request, headers, runtime)

    def query_trace_apphttpclientstat_ex(
        self,
        request: rms_models.QueryTraceApphttpclientstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpclientstatResponse:
        """
        Description: 查询应用的HTTP客户端请求调用明细
        Summary: 查询应用的HTTP客户端请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpclientstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apphttpclientstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apphttpclientstat_ex_async(
        self,
        request: rms_models.QueryTraceApphttpclientstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpclientstatResponse:
        """
        Description: 查询应用的HTTP客户端请求调用明细
        Summary: 查询应用的HTTP客户端请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpclientstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apphttpclientstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apphttpserverstat(
        self,
        request: rms_models.QueryTraceApphttpserverstatRequest,
    ) -> rms_models.QueryTraceApphttpserverstatResponse:
        """
        Description: 查询应用的HTTP服务端调用明细
        Summary: 查询应用的HTTP服务端调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apphttpserverstat_ex(request, headers, runtime)

    async def query_trace_apphttpserverstat_async(
        self,
        request: rms_models.QueryTraceApphttpserverstatRequest,
    ) -> rms_models.QueryTraceApphttpserverstatResponse:
        """
        Description: 查询应用的HTTP服务端调用明细
        Summary: 查询应用的HTTP服务端调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apphttpserverstat_ex_async(request, headers, runtime)

    def query_trace_apphttpserverstat_ex(
        self,
        request: rms_models.QueryTraceApphttpserverstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpserverstatResponse:
        """
        Description: 查询应用的HTTP服务端调用明细
        Summary: 查询应用的HTTP服务端调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpserverstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apphttpserverstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apphttpserverstat_ex_async(
        self,
        request: rms_models.QueryTraceApphttpserverstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpserverstatResponse:
        """
        Description: 查询应用的HTTP服务端调用明细
        Summary: 查询应用的HTTP服务端调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpserverstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apphttpserverstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apprpcclientstat(
        self,
        request: rms_models.QueryTraceApprpcclientstatRequest,
    ) -> rms_models.QueryTraceApprpcclientstatResponse:
        """
        Description: 查询应用的RPC客户端请求调用明细
        Summary: 查询应用的RPC客户端请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apprpcclientstat_ex(request, headers, runtime)

    async def query_trace_apprpcclientstat_async(
        self,
        request: rms_models.QueryTraceApprpcclientstatRequest,
    ) -> rms_models.QueryTraceApprpcclientstatResponse:
        """
        Description: 查询应用的RPC客户端请求调用明细
        Summary: 查询应用的RPC客户端请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apprpcclientstat_ex_async(request, headers, runtime)

    def query_trace_apprpcclientstat_ex(
        self,
        request: rms_models.QueryTraceApprpcclientstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcclientstatResponse:
        """
        Description: 查询应用的RPC客户端请求调用明细
        Summary: 查询应用的RPC客户端请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcclientstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apprpcclientstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apprpcclientstat_ex_async(
        self,
        request: rms_models.QueryTraceApprpcclientstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcclientstatResponse:
        """
        Description: 查询应用的RPC客户端请求调用明细
        Summary: 查询应用的RPC客户端请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcclientstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apprpcclientstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apprpcserverstat(
        self,
        request: rms_models.QueryTraceApprpcserverstatRequest,
    ) -> rms_models.QueryTraceApprpcserverstatResponse:
        """
        Description: 查询应用的RPC服务端调用明细
        Summary: 查询应用的RPC服务端调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apprpcserverstat_ex(request, headers, runtime)

    async def query_trace_apprpcserverstat_async(
        self,
        request: rms_models.QueryTraceApprpcserverstatRequest,
    ) -> rms_models.QueryTraceApprpcserverstatResponse:
        """
        Description: 查询应用的RPC服务端调用明细
        Summary: 查询应用的RPC服务端调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apprpcserverstat_ex_async(request, headers, runtime)

    def query_trace_apprpcserverstat_ex(
        self,
        request: rms_models.QueryTraceApprpcserverstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcserverstatResponse:
        """
        Description: 查询应用的RPC服务端调用明细
        Summary: 查询应用的RPC服务端调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcserverstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apprpcserverstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apprpcserverstat_ex_async(
        self,
        request: rms_models.QueryTraceApprpcserverstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApprpcserverstatResponse:
        """
        Description: 查询应用的RPC服务端调用明细
        Summary: 查询应用的RPC服务端调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApprpcserverstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apprpcserverstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trace_workspacesetting(
        self,
        request: rms_models.GetTraceWorkspacesettingRequest,
    ) -> rms_models.GetTraceWorkspacesettingResponse:
        """
        Description: 获取链路单工作空间配置
        Summary: 获取链路单工作空间配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trace_workspacesetting_ex(request, headers, runtime)

    async def get_trace_workspacesetting_async(
        self,
        request: rms_models.GetTraceWorkspacesettingRequest,
    ) -> rms_models.GetTraceWorkspacesettingResponse:
        """
        Description: 获取链路单工作空间配置
        Summary: 获取链路单工作空间配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trace_workspacesetting_ex_async(request, headers, runtime)

    def get_trace_workspacesetting_ex(
        self,
        request: rms_models.GetTraceWorkspacesettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraceWorkspacesettingResponse:
        """
        Description: 获取链路单工作空间配置
        Summary: 获取链路单工作空间配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraceWorkspacesettingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.workspacesetting.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trace_workspacesetting_ex_async(
        self,
        request: rms_models.GetTraceWorkspacesettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraceWorkspacesettingResponse:
        """
        Description: 获取链路单工作空间配置
        Summary: 获取链路单工作空间配置
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraceWorkspacesettingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.workspacesetting.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appmqproducemetrics(
        self,
        request: rms_models.QueryTraceAppmqproducemetricsRequest,
    ) -> rms_models.QueryTraceAppmqproducemetricsResponse:
        """
        Description: 查询应用的MQ生产调用指标
        Summary: 查询应用的MQ生产调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appmqproducemetrics_ex(request, headers, runtime)

    async def query_trace_appmqproducemetrics_async(
        self,
        request: rms_models.QueryTraceAppmqproducemetricsRequest,
    ) -> rms_models.QueryTraceAppmqproducemetricsResponse:
        """
        Description: 查询应用的MQ生产调用指标
        Summary: 查询应用的MQ生产调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appmqproducemetrics_ex_async(request, headers, runtime)

    def query_trace_appmqproducemetrics_ex(
        self,
        request: rms_models.QueryTraceAppmqproducemetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqproducemetricsResponse:
        """
        Description: 查询应用的MQ生产调用指标
        Summary: 查询应用的MQ生产调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqproducemetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appmqproducemetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appmqproducemetrics_ex_async(
        self,
        request: rms_models.QueryTraceAppmqproducemetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqproducemetricsResponse:
        """
        Description: 查询应用的MQ生产调用指标
        Summary: 查询应用的MQ生产调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqproducemetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appmqproducemetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appmqproducestat(
        self,
        request: rms_models.QueryTraceAppmqproducestatRequest,
    ) -> rms_models.QueryTraceAppmqproducestatResponse:
        """
        Description: 查询应用的MQ生产调用明细
        Summary: 查询应用的MQ生产调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appmqproducestat_ex(request, headers, runtime)

    async def query_trace_appmqproducestat_async(
        self,
        request: rms_models.QueryTraceAppmqproducestatRequest,
    ) -> rms_models.QueryTraceAppmqproducestatResponse:
        """
        Description: 查询应用的MQ生产调用明细
        Summary: 查询应用的MQ生产调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appmqproducestat_ex_async(request, headers, runtime)

    def query_trace_appmqproducestat_ex(
        self,
        request: rms_models.QueryTraceAppmqproducestatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqproducestatResponse:
        """
        Description: 查询应用的MQ生产调用明细
        Summary: 查询应用的MQ生产调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqproducestatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appmqproducestat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appmqproducestat_ex_async(
        self,
        request: rms_models.QueryTraceAppmqproducestatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppmqproducestatResponse:
        """
        Description: 查询应用的MQ生产调用明细
        Summary: 查询应用的MQ生产调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppmqproducestatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appmqproducestat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_measurement_status(
        self,
        request: rms_models.GetMeasurementStatusRequest,
    ) -> rms_models.GetMeasurementStatusResponse:
        """
        Description: 计量计费是否开启
        Summary: 计量计费是否开启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_measurement_status_ex(request, headers, runtime)

    async def get_measurement_status_async(
        self,
        request: rms_models.GetMeasurementStatusRequest,
    ) -> rms_models.GetMeasurementStatusResponse:
        """
        Description: 计量计费是否开启
        Summary: 计量计费是否开启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_measurement_status_ex_async(request, headers, runtime)

    def get_measurement_status_ex(
        self,
        request: rms_models.GetMeasurementStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetMeasurementStatusResponse:
        """
        Description: 计量计费是否开启
        Summary: 计量计费是否开启
        """
        UtilClient.validate_model(request)
        return rms_models.GetMeasurementStatusResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.measurement.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_measurement_status_ex_async(
        self,
        request: rms_models.GetMeasurementStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetMeasurementStatusResponse:
        """
        Description: 计量计费是否开启
        Summary: 计量计费是否开启
        """
        UtilClient.validate_model(request)
        return rms_models.GetMeasurementStatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.measurement.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_logservice_apps(
        self,
        request: rms_models.QueryLogserviceAppsRequest,
    ) -> rms_models.QueryLogserviceAppsResponse:
        """
        Description: 日志查询页面获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_logservice_apps_ex(request, headers, runtime)

    async def query_logservice_apps_async(
        self,
        request: rms_models.QueryLogserviceAppsRequest,
    ) -> rms_models.QueryLogserviceAppsResponse:
        """
        Description: 日志查询页面获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_logservice_apps_ex_async(request, headers, runtime)

    def query_logservice_apps_ex(
        self,
        request: rms_models.QueryLogserviceAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryLogserviceAppsResponse:
        """
        Description: 日志查询页面获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryLogserviceAppsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.logservice.apps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_logservice_apps_ex_async(
        self,
        request: rms_models.QueryLogserviceAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryLogserviceAppsResponse:
        """
        Description: 日志查询页面获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return rms_models.QueryLogserviceAppsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.logservice.apps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_apphttpserverstatusmetrics(
        self,
        request: rms_models.QueryTraceApphttpserverstatusmetricsRequest,
    ) -> rms_models.QueryTraceApphttpserverstatusmetricsResponse:
        """
        Description: 查询应用的HTTP服务端状态指标
        Summary: 查询应用的HTTP服务端状态指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_apphttpserverstatusmetrics_ex(request, headers, runtime)

    async def query_trace_apphttpserverstatusmetrics_async(
        self,
        request: rms_models.QueryTraceApphttpserverstatusmetricsRequest,
    ) -> rms_models.QueryTraceApphttpserverstatusmetricsResponse:
        """
        Description: 查询应用的HTTP服务端状态指标
        Summary: 查询应用的HTTP服务端状态指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_apphttpserverstatusmetrics_ex_async(request, headers, runtime)

    def query_trace_apphttpserverstatusmetrics_ex(
        self,
        request: rms_models.QueryTraceApphttpserverstatusmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpserverstatusmetricsResponse:
        """
        Description: 查询应用的HTTP服务端状态指标
        Summary: 查询应用的HTTP服务端状态指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpserverstatusmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.apphttpserverstatusmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_apphttpserverstatusmetrics_ex_async(
        self,
        request: rms_models.QueryTraceApphttpserverstatusmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceApphttpserverstatusmetricsResponse:
        """
        Description: 查询应用的HTTP服务端状态指标
        Summary: 查询应用的HTTP服务端状态指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceApphttpserverstatusmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.apphttpserverstatusmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_alarmrules(
        self,
        request: rms_models.QueryAppAlarmrulesRequest,
    ) -> rms_models.QueryAppAlarmrulesResponse:
        """
        Description: 查询应用的告警指标，或应用已经配置。
        Summary: 查询应用的告警指标清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_alarmrules_ex(request, headers, runtime)

    async def query_app_alarmrules_async(
        self,
        request: rms_models.QueryAppAlarmrulesRequest,
    ) -> rms_models.QueryAppAlarmrulesResponse:
        """
        Description: 查询应用的告警指标，或应用已经配置。
        Summary: 查询应用的告警指标清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_alarmrules_ex_async(request, headers, runtime)

    def query_app_alarmrules_ex(
        self,
        request: rms_models.QueryAppAlarmrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppAlarmrulesResponse:
        """
        Description: 查询应用的告警指标，或应用已经配置。
        Summary: 查询应用的告警指标清单
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppAlarmrulesResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.alarmrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_alarmrules_ex_async(
        self,
        request: rms_models.QueryAppAlarmrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppAlarmrulesResponse:
        """
        Description: 查询应用的告警指标，或应用已经配置。
        Summary: 查询应用的告警指标清单
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppAlarmrulesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.alarmrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_compactdetail(
        self,
        request: rms_models.QueryTraceCompactdetailRequest,
    ) -> rms_models.QueryTraceCompactdetailResponse:
        """
        Description: 查询链路紧凑详情
        Summary: 查询链路紧凑详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_compactdetail_ex(request, headers, runtime)

    async def query_trace_compactdetail_async(
        self,
        request: rms_models.QueryTraceCompactdetailRequest,
    ) -> rms_models.QueryTraceCompactdetailResponse:
        """
        Description: 查询链路紧凑详情
        Summary: 查询链路紧凑详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_compactdetail_ex_async(request, headers, runtime)

    def query_trace_compactdetail_ex(
        self,
        request: rms_models.QueryTraceCompactdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceCompactdetailResponse:
        """
        Description: 查询链路紧凑详情
        Summary: 查询链路紧凑详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceCompactdetailResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.compactdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_compactdetail_ex_async(
        self,
        request: rms_models.QueryTraceCompactdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceCompactdetailResponse:
        """
        Description: 查询链路紧凑详情
        Summary: 查询链路紧凑详情
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceCompactdetailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.compactdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appexceptionmetrics(
        self,
        request: rms_models.QueryTraceAppexceptionmetricsRequest,
    ) -> rms_models.QueryTraceAppexceptionmetricsResponse:
        """
        Description: 查询应用的异常调用指标
        Summary: 查询应用的异常调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appexceptionmetrics_ex(request, headers, runtime)

    async def query_trace_appexceptionmetrics_async(
        self,
        request: rms_models.QueryTraceAppexceptionmetricsRequest,
    ) -> rms_models.QueryTraceAppexceptionmetricsResponse:
        """
        Description: 查询应用的异常调用指标
        Summary: 查询应用的异常调用指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appexceptionmetrics_ex_async(request, headers, runtime)

    def query_trace_appexceptionmetrics_ex(
        self,
        request: rms_models.QueryTraceAppexceptionmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppexceptionmetricsResponse:
        """
        Description: 查询应用的异常调用指标
        Summary: 查询应用的异常调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppexceptionmetricsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appexceptionmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appexceptionmetrics_ex_async(
        self,
        request: rms_models.QueryTraceAppexceptionmetricsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppexceptionmetricsResponse:
        """
        Description: 查询应用的异常调用指标
        Summary: 查询应用的异常调用指标
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppexceptionmetricsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appexceptionmetrics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_appexceptionstat(
        self,
        request: rms_models.QueryTraceAppexceptionstatRequest,
    ) -> rms_models.QueryTraceAppexceptionstatResponse:
        """
        Description: 查询应用的异常请求调用明细
        Summary: 查询应用的异常请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_appexceptionstat_ex(request, headers, runtime)

    async def query_trace_appexceptionstat_async(
        self,
        request: rms_models.QueryTraceAppexceptionstatRequest,
    ) -> rms_models.QueryTraceAppexceptionstatResponse:
        """
        Description: 查询应用的异常请求调用明细
        Summary: 查询应用的异常请求调用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_appexceptionstat_ex_async(request, headers, runtime)

    def query_trace_appexceptionstat_ex(
        self,
        request: rms_models.QueryTraceAppexceptionstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppexceptionstatResponse:
        """
        Description: 查询应用的异常请求调用明细
        Summary: 查询应用的异常请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppexceptionstatResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.appexceptionstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_appexceptionstat_ex_async(
        self,
        request: rms_models.QueryTraceAppexceptionstatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceAppexceptionstatResponse:
        """
        Description: 查询应用的异常请求调用明细
        Summary: 查询应用的异常请求调用明细
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceAppexceptionstatResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.appexceptionstat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedalarm_rulebinding(
        self,
        request: rms_models.QueryUnifiedalarmRulebindingRequest,
    ) -> rms_models.QueryUnifiedalarmRulebindingResponse:
        """
        Description: 查询告警绑定关系
        Summary: 罗予
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedalarm_rulebinding_ex(request, headers, runtime)

    async def query_unifiedalarm_rulebinding_async(
        self,
        request: rms_models.QueryUnifiedalarmRulebindingRequest,
    ) -> rms_models.QueryUnifiedalarmRulebindingResponse:
        """
        Description: 查询告警绑定关系
        Summary: 罗予
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedalarm_rulebinding_ex_async(request, headers, runtime)

    def query_unifiedalarm_rulebinding_ex(
        self,
        request: rms_models.QueryUnifiedalarmRulebindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmRulebindingResponse:
        """
        Description: 查询告警绑定关系
        Summary: 罗予
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmRulebindingResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.unifiedalarm.rulebinding.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedalarm_rulebinding_ex_async(
        self,
        request: rms_models.QueryUnifiedalarmRulebindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryUnifiedalarmRulebindingResponse:
        """
        Description: 查询告警绑定关系
        Summary: 罗予
        """
        UtilClient.validate_model(request)
        return rms_models.QueryUnifiedalarmRulebindingResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.unifiedalarm.rulebinding.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ops_check(
        self,
        request: rms_models.QueryOpsCheckRequest,
    ) -> rms_models.QueryOpsCheckResponse:
        """
        Description: 监控数据诊断列表查询
        Summary: 监控数据诊断列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ops_check_ex(request, headers, runtime)

    async def query_ops_check_async(
        self,
        request: rms_models.QueryOpsCheckRequest,
    ) -> rms_models.QueryOpsCheckResponse:
        """
        Description: 监控数据诊断列表查询
        Summary: 监控数据诊断列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ops_check_ex_async(request, headers, runtime)

    def query_ops_check_ex(
        self,
        request: rms_models.QueryOpsCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryOpsCheckResponse:
        """
        Description: 监控数据诊断列表查询
        Summary: 监控数据诊断列表查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryOpsCheckResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.ops.check.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ops_check_ex_async(
        self,
        request: rms_models.QueryOpsCheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryOpsCheckResponse:
        """
        Description: 监控数据诊断列表查询
        Summary: 监控数据诊断列表查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryOpsCheckResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.ops.check.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ops_appcheck(
        self,
        request: rms_models.QueryOpsAppcheckRequest,
    ) -> rms_models.QueryOpsAppcheckResponse:
        """
        Description: 应用诊断
        Summary: 应用诊断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ops_appcheck_ex(request, headers, runtime)

    async def query_ops_appcheck_async(
        self,
        request: rms_models.QueryOpsAppcheckRequest,
    ) -> rms_models.QueryOpsAppcheckResponse:
        """
        Description: 应用诊断
        Summary: 应用诊断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ops_appcheck_ex_async(request, headers, runtime)

    def query_ops_appcheck_ex(
        self,
        request: rms_models.QueryOpsAppcheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryOpsAppcheckResponse:
        """
        Description: 应用诊断
        Summary: 应用诊断
        """
        UtilClient.validate_model(request)
        return rms_models.QueryOpsAppcheckResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.ops.appcheck.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ops_appcheck_ex_async(
        self,
        request: rms_models.QueryOpsAppcheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryOpsAppcheckResponse:
        """
        Description: 应用诊断
        Summary: 应用诊断
        """
        UtilClient.validate_model(request)
        return rms_models.QueryOpsAppcheckResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.ops.appcheck.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_alarm_dingdingrobot(
        self,
        request: rms_models.CreateAlarmDingdingrobotRequest,
    ) -> rms_models.CreateAlarmDingdingrobotResponse:
        """
        Description: 添加钉钉机器人
        Summary: 添加钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_alarm_dingdingrobot_ex(request, headers, runtime)

    async def create_alarm_dingdingrobot_async(
        self,
        request: rms_models.CreateAlarmDingdingrobotRequest,
    ) -> rms_models.CreateAlarmDingdingrobotResponse:
        """
        Description: 添加钉钉机器人
        Summary: 添加钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_alarm_dingdingrobot_ex_async(request, headers, runtime)

    def create_alarm_dingdingrobot_ex(
        self,
        request: rms_models.CreateAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAlarmDingdingrobotResponse:
        """
        Description: 添加钉钉机器人
        Summary: 添加钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAlarmDingdingrobotResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.dingdingrobot.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_alarm_dingdingrobot_ex_async(
        self,
        request: rms_models.CreateAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateAlarmDingdingrobotResponse:
        """
        Description: 添加钉钉机器人
        Summary: 添加钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.CreateAlarmDingdingrobotResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.dingdingrobot.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alarm_dingdingrobot(
        self,
        request: rms_models.QueryAlarmDingdingrobotRequest,
    ) -> rms_models.QueryAlarmDingdingrobotResponse:
        """
        Description: 查询钉钉机器人
        Summary: 查询钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alarm_dingdingrobot_ex(request, headers, runtime)

    async def query_alarm_dingdingrobot_async(
        self,
        request: rms_models.QueryAlarmDingdingrobotRequest,
    ) -> rms_models.QueryAlarmDingdingrobotResponse:
        """
        Description: 查询钉钉机器人
        Summary: 查询钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alarm_dingdingrobot_ex_async(request, headers, runtime)

    def query_alarm_dingdingrobot_ex(
        self,
        request: rms_models.QueryAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmDingdingrobotResponse:
        """
        Description: 查询钉钉机器人
        Summary: 查询钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmDingdingrobotResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.dingdingrobot.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alarm_dingdingrobot_ex_async(
        self,
        request: rms_models.QueryAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAlarmDingdingrobotResponse:
        """
        Description: 查询钉钉机器人
        Summary: 查询钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAlarmDingdingrobotResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.dingdingrobot.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_alarm_dingdingrobot(
        self,
        request: rms_models.DeleteAlarmDingdingrobotRequest,
    ) -> rms_models.DeleteAlarmDingdingrobotResponse:
        """
        Description: 删除钉钉机器人
        Summary: 删除钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_alarm_dingdingrobot_ex(request, headers, runtime)

    async def delete_alarm_dingdingrobot_async(
        self,
        request: rms_models.DeleteAlarmDingdingrobotRequest,
    ) -> rms_models.DeleteAlarmDingdingrobotResponse:
        """
        Description: 删除钉钉机器人
        Summary: 删除钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_alarm_dingdingrobot_ex_async(request, headers, runtime)

    def delete_alarm_dingdingrobot_ex(
        self,
        request: rms_models.DeleteAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAlarmDingdingrobotResponse:
        """
        Description: 删除钉钉机器人
        Summary: 删除钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAlarmDingdingrobotResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.dingdingrobot.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_alarm_dingdingrobot_ex_async(
        self,
        request: rms_models.DeleteAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteAlarmDingdingrobotResponse:
        """
        Description: 删除钉钉机器人
        Summary: 删除钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteAlarmDingdingrobotResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.dingdingrobot.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_alarm_dingdingrobot(
        self,
        request: rms_models.UpdateAlarmDingdingrobotRequest,
    ) -> rms_models.UpdateAlarmDingdingrobotResponse:
        """
        Description: 更新钉钉机器人
        Summary: 更新钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_alarm_dingdingrobot_ex(request, headers, runtime)

    async def update_alarm_dingdingrobot_async(
        self,
        request: rms_models.UpdateAlarmDingdingrobotRequest,
    ) -> rms_models.UpdateAlarmDingdingrobotResponse:
        """
        Description: 更新钉钉机器人
        Summary: 更新钉钉机器人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_alarm_dingdingrobot_ex_async(request, headers, runtime)

    def update_alarm_dingdingrobot_ex(
        self,
        request: rms_models.UpdateAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAlarmDingdingrobotResponse:
        """
        Description: 更新钉钉机器人
        Summary: 更新钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAlarmDingdingrobotResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.alarm.dingdingrobot.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_alarm_dingdingrobot_ex_async(
        self,
        request: rms_models.UpdateAlarmDingdingrobotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAlarmDingdingrobotResponse:
        """
        Description: 更新钉钉机器人
        Summary: 更新钉钉机器人
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAlarmDingdingrobotResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.alarm.dingdingrobot.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apps_alarmrulecount(
        self,
        request: rms_models.QueryAppsAlarmrulecountRequest,
    ) -> rms_models.QueryAppsAlarmrulecountResponse:
        """
        Description: 查询应用告警统计
        Summary: 查询应用告警统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apps_alarmrulecount_ex(request, headers, runtime)

    async def query_apps_alarmrulecount_async(
        self,
        request: rms_models.QueryAppsAlarmrulecountRequest,
    ) -> rms_models.QueryAppsAlarmrulecountResponse:
        """
        Description: 查询应用告警统计
        Summary: 查询应用告警统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apps_alarmrulecount_ex_async(request, headers, runtime)

    def query_apps_alarmrulecount_ex(
        self,
        request: rms_models.QueryAppsAlarmrulecountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppsAlarmrulecountResponse:
        """
        Description: 查询应用告警统计
        Summary: 查询应用告警统计
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppsAlarmrulecountResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.apps.alarmrulecount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apps_alarmrulecount_ex_async(
        self,
        request: rms_models.QueryAppsAlarmrulecountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppsAlarmrulecountResponse:
        """
        Description: 查询应用告警统计
        Summary: 查询应用告警统计
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppsAlarmrulecountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.apps.alarmrulecount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apps_unifiedalarmstats(
        self,
        request: rms_models.QueryAppsUnifiedalarmstatsRequest,
    ) -> rms_models.QueryAppsUnifiedalarmstatsResponse:
        """
        Description: 根据app维度查询统一告警状态
        Summary: 根据app维度查询统一告警状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apps_unifiedalarmstats_ex(request, headers, runtime)

    async def query_apps_unifiedalarmstats_async(
        self,
        request: rms_models.QueryAppsUnifiedalarmstatsRequest,
    ) -> rms_models.QueryAppsUnifiedalarmstatsResponse:
        """
        Description: 根据app维度查询统一告警状态
        Summary: 根据app维度查询统一告警状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apps_unifiedalarmstats_ex_async(request, headers, runtime)

    def query_apps_unifiedalarmstats_ex(
        self,
        request: rms_models.QueryAppsUnifiedalarmstatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppsUnifiedalarmstatsResponse:
        """
        Description: 根据app维度查询统一告警状态
        Summary: 根据app维度查询统一告警状态
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppsUnifiedalarmstatsResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.apps.unifiedalarmstats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apps_unifiedalarmstats_ex_async(
        self,
        request: rms_models.QueryAppsUnifiedalarmstatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryAppsUnifiedalarmstatsResponse:
        """
        Description: 根据app维度查询统一告警状态
        Summary: 根据app维度查询统一告警状态
        """
        UtilClient.validate_model(request)
        return rms_models.QueryAppsUnifiedalarmstatsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.apps.unifiedalarmstats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_ops_alarm(
        self,
        request: rms_models.SwitchOpsAlarmRequest,
    ) -> rms_models.SwitchOpsAlarmResponse:
        """
        Description: 开启监控数据诊断告警
        Summary: 开启监控数据诊断告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_ops_alarm_ex(request, headers, runtime)

    async def switch_ops_alarm_async(
        self,
        request: rms_models.SwitchOpsAlarmRequest,
    ) -> rms_models.SwitchOpsAlarmResponse:
        """
        Description: 开启监控数据诊断告警
        Summary: 开启监控数据诊断告警
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_ops_alarm_ex_async(request, headers, runtime)

    def switch_ops_alarm_ex(
        self,
        request: rms_models.SwitchOpsAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SwitchOpsAlarmResponse:
        """
        Description: 开启监控数据诊断告警
        Summary: 开启监控数据诊断告警
        """
        UtilClient.validate_model(request)
        return rms_models.SwitchOpsAlarmResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.ops.alarm.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_ops_alarm_ex_async(
        self,
        request: rms_models.SwitchOpsAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SwitchOpsAlarmResponse:
        """
        Description: 开启监控数据诊断告警
        Summary: 开启监控数据诊断告警
        """
        UtilClient.validate_model(request)
        return rms_models.SwitchOpsAlarmResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.ops.alarm.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_tenant(
        self,
        request: rms_models.AllTraasmetaTenantRequest,
    ) -> rms_models.AllTraasmetaTenantResponse:
        """
        Description: 获取所有租户
        Summary: 获取所有租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_tenant_ex(request, headers, runtime)

    async def all_traasmeta_tenant_async(
        self,
        request: rms_models.AllTraasmetaTenantRequest,
    ) -> rms_models.AllTraasmetaTenantResponse:
        """
        Description: 获取所有租户
        Summary: 获取所有租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_tenant_ex_async(request, headers, runtime)

    def all_traasmeta_tenant_ex(
        self,
        request: rms_models.AllTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaTenantResponse:
        """
        Description: 获取所有租户
        Summary: 获取所有租户
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_tenant_ex_async(
        self,
        request: rms_models.AllTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaTenantResponse:
        """
        Description: 获取所有租户
        Summary: 获取所有租户
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_region(
        self,
        request: rms_models.AllTraasmetaRegionRequest,
    ) -> rms_models.AllTraasmetaRegionResponse:
        """
        Description: 获取所有region
        Summary: 获取所有region
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_region_ex(request, headers, runtime)

    async def all_traasmeta_region_async(
        self,
        request: rms_models.AllTraasmetaRegionRequest,
    ) -> rms_models.AllTraasmetaRegionResponse:
        """
        Description: 获取所有region
        Summary: 获取所有region
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_region_ex_async(request, headers, runtime)

    def all_traasmeta_region_ex(
        self,
        request: rms_models.AllTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaRegionResponse:
        """
        Description: 获取所有region
        Summary: 获取所有region
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_region_ex_async(
        self,
        request: rms_models.AllTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaRegionResponse:
        """
        Description: 获取所有region
        Summary: 获取所有region
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_tenant(
        self,
        request: rms_models.PagequeryTraasmetaTenantRequest,
    ) -> rms_models.PagequeryTraasmetaTenantResponse:
        """
        Description: 租户分页查询
        Summary: 租户分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_tenant_ex(request, headers, runtime)

    async def pagequery_traasmeta_tenant_async(
        self,
        request: rms_models.PagequeryTraasmetaTenantRequest,
    ) -> rms_models.PagequeryTraasmetaTenantResponse:
        """
        Description: 租户分页查询
        Summary: 租户分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_tenant_ex_async(request, headers, runtime)

    def pagequery_traasmeta_tenant_ex(
        self,
        request: rms_models.PagequeryTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaTenantResponse:
        """
        Description: 租户分页查询
        Summary: 租户分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_tenant_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaTenantResponse:
        """
        Description: 租户分页查询
        Summary: 租户分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_tenant(
        self,
        request: rms_models.GetTraasmetaTenantRequest,
    ) -> rms_models.GetTraasmetaTenantResponse:
        """
        Description: 获取单个租户
        Summary: 获取单个租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_tenant_ex(request, headers, runtime)

    async def get_traasmeta_tenant_async(
        self,
        request: rms_models.GetTraasmetaTenantRequest,
    ) -> rms_models.GetTraasmetaTenantResponse:
        """
        Description: 获取单个租户
        Summary: 获取单个租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_tenant_ex_async(request, headers, runtime)

    def get_traasmeta_tenant_ex(
        self,
        request: rms_models.GetTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaTenantResponse:
        """
        Description: 获取单个租户
        Summary: 获取单个租户
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_tenant_ex_async(
        self,
        request: rms_models.GetTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaTenantResponse:
        """
        Description: 获取单个租户
        Summary: 获取单个租户
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_tenant(
        self,
        request: rms_models.QueryTraasmetaTenantRequest,
    ) -> rms_models.QueryTraasmetaTenantResponse:
        """
        Description: 租户查询
        Summary: 租户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_tenant_ex(request, headers, runtime)

    async def query_traasmeta_tenant_async(
        self,
        request: rms_models.QueryTraasmetaTenantRequest,
    ) -> rms_models.QueryTraasmetaTenantResponse:
        """
        Description: 租户查询
        Summary: 租户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_tenant_ex_async(request, headers, runtime)

    def query_traasmeta_tenant_ex(
        self,
        request: rms_models.QueryTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaTenantResponse:
        """
        Description: 租户查询
        Summary: 租户查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_tenant_ex_async(
        self,
        request: rms_models.QueryTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaTenantResponse:
        """
        Description: 租户查询
        Summary: 租户查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_tenant(
        self,
        request: rms_models.BatchqueryTraasmetaTenantRequest,
    ) -> rms_models.BatchqueryTraasmetaTenantResponse:
        """
        Description: 批量查询租户
        Summary: 批量查询租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_tenant_ex(request, headers, runtime)

    async def batchquery_traasmeta_tenant_async(
        self,
        request: rms_models.BatchqueryTraasmetaTenantRequest,
    ) -> rms_models.BatchqueryTraasmetaTenantResponse:
        """
        Description: 批量查询租户
        Summary: 批量查询租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_tenant_ex_async(request, headers, runtime)

    def batchquery_traasmeta_tenant_ex(
        self,
        request: rms_models.BatchqueryTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaTenantResponse:
        """
        Description: 批量查询租户
        Summary: 批量查询租户
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_tenant_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaTenantResponse:
        """
        Description: 批量查询租户
        Summary: 批量查询租户
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_tenant(
        self,
        request: rms_models.CreateTraasmetaTenantRequest,
    ) -> rms_models.CreateTraasmetaTenantResponse:
        """
        Description: 创建tenant
        Summary: 创建tenant
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_tenant_ex(request, headers, runtime)

    async def create_traasmeta_tenant_async(
        self,
        request: rms_models.CreateTraasmetaTenantRequest,
    ) -> rms_models.CreateTraasmetaTenantResponse:
        """
        Description: 创建tenant
        Summary: 创建tenant
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_tenant_ex_async(request, headers, runtime)

    def create_traasmeta_tenant_ex(
        self,
        request: rms_models.CreateTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaTenantResponse:
        """
        Description: 创建tenant
        Summary: 创建tenant
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_tenant_ex_async(
        self,
        request: rms_models.CreateTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaTenantResponse:
        """
        Description: 创建tenant
        Summary: 创建tenant
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_tenant(
        self,
        request: rms_models.BatchcreateTraasmetaTenantRequest,
    ) -> rms_models.BatchcreateTraasmetaTenantResponse:
        """
        Description: 批量创建租户
        Summary: 批量创建租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_tenant_ex(request, headers, runtime)

    async def batchcreate_traasmeta_tenant_async(
        self,
        request: rms_models.BatchcreateTraasmetaTenantRequest,
    ) -> rms_models.BatchcreateTraasmetaTenantResponse:
        """
        Description: 批量创建租户
        Summary: 批量创建租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_tenant_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_tenant_ex(
        self,
        request: rms_models.BatchcreateTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaTenantResponse:
        """
        Description: 批量创建租户
        Summary: 批量创建租户
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_tenant_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaTenantResponse:
        """
        Description: 批量创建租户
        Summary: 批量创建租户
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_tenant(
        self,
        request: rms_models.UpdateTraasmetaTenantRequest,
    ) -> rms_models.UpdateTraasmetaTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_tenant_ex(request, headers, runtime)

    async def update_traasmeta_tenant_async(
        self,
        request: rms_models.UpdateTraasmetaTenantRequest,
    ) -> rms_models.UpdateTraasmetaTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_tenant_ex_async(request, headers, runtime)

    def update_traasmeta_tenant_ex(
        self,
        request: rms_models.UpdateTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_tenant_ex_async(
        self,
        request: rms_models.UpdateTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_tenant(
        self,
        request: rms_models.DeleteTraasmetaTenantRequest,
    ) -> rms_models.DeleteTraasmetaTenantResponse:
        """
        Description: 删除租户
        Summary: 删除租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_tenant_ex(request, headers, runtime)

    async def delete_traasmeta_tenant_async(
        self,
        request: rms_models.DeleteTraasmetaTenantRequest,
    ) -> rms_models.DeleteTraasmetaTenantResponse:
        """
        Description: 删除租户
        Summary: 删除租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_tenant_ex_async(request, headers, runtime)

    def delete_traasmeta_tenant_ex(
        self,
        request: rms_models.DeleteTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaTenantResponse:
        """
        Description: 删除租户
        Summary: 删除租户
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_tenant_ex_async(
        self,
        request: rms_models.DeleteTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaTenantResponse:
        """
        Description: 删除租户
        Summary: 删除租户
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_tenant(
        self,
        request: rms_models.BatchdeleteTraasmetaTenantRequest,
    ) -> rms_models.BatchdeleteTraasmetaTenantResponse:
        """
        Description: 批量删除租户
        Summary: 批量删除租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_tenant_ex(request, headers, runtime)

    async def batchdelete_traasmeta_tenant_async(
        self,
        request: rms_models.BatchdeleteTraasmetaTenantRequest,
    ) -> rms_models.BatchdeleteTraasmetaTenantResponse:
        """
        Description: 批量删除租户
        Summary: 批量删除租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_tenant_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_tenant_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaTenantResponse:
        """
        Description: 批量删除租户
        Summary: 批量删除租户
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaTenantResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.tenant.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_tenant_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaTenantResponse:
        """
        Description: 批量删除租户
        Summary: 批量删除租户
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaTenantResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.tenant.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_region(
        self,
        request: rms_models.GetTraasmetaRegionRequest,
    ) -> rms_models.GetTraasmetaRegionResponse:
        """
        Description: 获取单个地域
        Summary: 获取单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_region_ex(request, headers, runtime)

    async def get_traasmeta_region_async(
        self,
        request: rms_models.GetTraasmetaRegionRequest,
    ) -> rms_models.GetTraasmetaRegionResponse:
        """
        Description: 获取单个地域
        Summary: 获取单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_region_ex_async(request, headers, runtime)

    def get_traasmeta_region_ex(
        self,
        request: rms_models.GetTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaRegionResponse:
        """
        Description: 获取单个地域
        Summary: 获取单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_region_ex_async(
        self,
        request: rms_models.GetTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaRegionResponse:
        """
        Description: 获取单个地域
        Summary: 获取单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_zone(
        self,
        request: rms_models.AllTraasmetaZoneRequest,
    ) -> rms_models.AllTraasmetaZoneResponse:
        """
        Description: 获取所有机房
        Summary: 获取所有机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_zone_ex(request, headers, runtime)

    async def all_traasmeta_zone_async(
        self,
        request: rms_models.AllTraasmetaZoneRequest,
    ) -> rms_models.AllTraasmetaZoneResponse:
        """
        Description: 获取所有机房
        Summary: 获取所有机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_zone_ex_async(request, headers, runtime)

    def all_traasmeta_zone_ex(
        self,
        request: rms_models.AllTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaZoneResponse:
        """
        Description: 获取所有机房
        Summary: 获取所有机房
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_zone_ex_async(
        self,
        request: rms_models.AllTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaZoneResponse:
        """
        Description: 获取所有机房
        Summary: 获取所有机房
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_zone(
        self,
        request: rms_models.GetTraasmetaZoneRequest,
    ) -> rms_models.GetTraasmetaZoneResponse:
        """
        Description: 获取单个机房
        Summary: 获取单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_zone_ex(request, headers, runtime)

    async def get_traasmeta_zone_async(
        self,
        request: rms_models.GetTraasmetaZoneRequest,
    ) -> rms_models.GetTraasmetaZoneResponse:
        """
        Description: 获取单个机房
        Summary: 获取单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_zone_ex_async(request, headers, runtime)

    def get_traasmeta_zone_ex(
        self,
        request: rms_models.GetTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaZoneResponse:
        """
        Description: 获取单个机房
        Summary: 获取单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_zone_ex_async(
        self,
        request: rms_models.GetTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaZoneResponse:
        """
        Description: 获取单个机房
        Summary: 获取单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_region(
        self,
        request: rms_models.CreateTraasmetaRegionRequest,
    ) -> rms_models.CreateTraasmetaRegionResponse:
        """
        Description: 创建单个地域
        Summary: 创建单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_region_ex(request, headers, runtime)

    async def create_traasmeta_region_async(
        self,
        request: rms_models.CreateTraasmetaRegionRequest,
    ) -> rms_models.CreateTraasmetaRegionResponse:
        """
        Description: 创建单个地域
        Summary: 创建单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_region_ex_async(request, headers, runtime)

    def create_traasmeta_region_ex(
        self,
        request: rms_models.CreateTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaRegionResponse:
        """
        Description: 创建单个地域
        Summary: 创建单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_region_ex_async(
        self,
        request: rms_models.CreateTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaRegionResponse:
        """
        Description: 创建单个地域
        Summary: 创建单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_agent_label(
        self,
        request: rms_models.UpdateAgentLabelRequest,
    ) -> rms_models.UpdateAgentLabelResponse:
        """
        Description: 批量修改agent是否开启告警标记
        Summary: agent批量打标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_agent_label_ex(request, headers, runtime)

    async def update_agent_label_async(
        self,
        request: rms_models.UpdateAgentLabelRequest,
    ) -> rms_models.UpdateAgentLabelResponse:
        """
        Description: 批量修改agent是否开启告警标记
        Summary: agent批量打标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_agent_label_ex_async(request, headers, runtime)

    def update_agent_label_ex(
        self,
        request: rms_models.UpdateAgentLabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAgentLabelResponse:
        """
        Description: 批量修改agent是否开启告警标记
        Summary: agent批量打标
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAgentLabelResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.agent.label.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_agent_label_ex_async(
        self,
        request: rms_models.UpdateAgentLabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateAgentLabelResponse:
        """
        Description: 批量修改agent是否开启告警标记
        Summary: agent批量打标
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateAgentLabelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.agent.label.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_zone(
        self,
        request: rms_models.CreateTraasmetaZoneRequest,
    ) -> rms_models.CreateTraasmetaZoneResponse:
        """
        Description: 创建单个机房
        Summary: 创建单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_zone_ex(request, headers, runtime)

    async def create_traasmeta_zone_async(
        self,
        request: rms_models.CreateTraasmetaZoneRequest,
    ) -> rms_models.CreateTraasmetaZoneResponse:
        """
        Description: 创建单个机房
        Summary: 创建单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_zone_ex_async(request, headers, runtime)

    def create_traasmeta_zone_ex(
        self,
        request: rms_models.CreateTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaZoneResponse:
        """
        Description: 创建单个机房
        Summary: 创建单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_zone_ex_async(
        self,
        request: rms_models.CreateTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaZoneResponse:
        """
        Description: 创建单个机房
        Summary: 创建单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_region(
        self,
        request: rms_models.DeleteTraasmetaRegionRequest,
    ) -> rms_models.DeleteTraasmetaRegionResponse:
        """
        Description: 删除单个地域
        Summary: 删除单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_region_ex(request, headers, runtime)

    async def delete_traasmeta_region_async(
        self,
        request: rms_models.DeleteTraasmetaRegionRequest,
    ) -> rms_models.DeleteTraasmetaRegionResponse:
        """
        Description: 删除单个地域
        Summary: 删除单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_region_ex_async(request, headers, runtime)

    def delete_traasmeta_region_ex(
        self,
        request: rms_models.DeleteTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaRegionResponse:
        """
        Description: 删除单个地域
        Summary: 删除单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_region_ex_async(
        self,
        request: rms_models.DeleteTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaRegionResponse:
        """
        Description: 删除单个地域
        Summary: 删除单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_zone(
        self,
        request: rms_models.DeleteTraasmetaZoneRequest,
    ) -> rms_models.DeleteTraasmetaZoneResponse:
        """
        Description: 删除单个机房
        Summary: 删除单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_zone_ex(request, headers, runtime)

    async def delete_traasmeta_zone_async(
        self,
        request: rms_models.DeleteTraasmetaZoneRequest,
    ) -> rms_models.DeleteTraasmetaZoneResponse:
        """
        Description: 删除单个机房
        Summary: 删除单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_zone_ex_async(request, headers, runtime)

    def delete_traasmeta_zone_ex(
        self,
        request: rms_models.DeleteTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaZoneResponse:
        """
        Description: 删除单个机房
        Summary: 删除单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_zone_ex_async(
        self,
        request: rms_models.DeleteTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaZoneResponse:
        """
        Description: 删除单个机房
        Summary: 删除单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_region(
        self,
        request: rms_models.UpdateTraasmetaRegionRequest,
    ) -> rms_models.UpdateTraasmetaRegionResponse:
        """
        Description: 更新单个地域
        Summary: 更新单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_region_ex(request, headers, runtime)

    async def update_traasmeta_region_async(
        self,
        request: rms_models.UpdateTraasmetaRegionRequest,
    ) -> rms_models.UpdateTraasmetaRegionResponse:
        """
        Description: 更新单个地域
        Summary: 更新单个地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_region_ex_async(request, headers, runtime)

    def update_traasmeta_region_ex(
        self,
        request: rms_models.UpdateTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaRegionResponse:
        """
        Description: 更新单个地域
        Summary: 更新单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_region_ex_async(
        self,
        request: rms_models.UpdateTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaRegionResponse:
        """
        Description: 更新单个地域
        Summary: 更新单个地域
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_zone(
        self,
        request: rms_models.UpdateTraasmetaZoneRequest,
    ) -> rms_models.UpdateTraasmetaZoneResponse:
        """
        Description: 更新单个机房
        Summary: 更新单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_zone_ex(request, headers, runtime)

    async def update_traasmeta_zone_async(
        self,
        request: rms_models.UpdateTraasmetaZoneRequest,
    ) -> rms_models.UpdateTraasmetaZoneResponse:
        """
        Description: 更新单个机房
        Summary: 更新单个机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_zone_ex_async(request, headers, runtime)

    def update_traasmeta_zone_ex(
        self,
        request: rms_models.UpdateTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaZoneResponse:
        """
        Description: 更新单个机房
        Summary: 更新单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_zone_ex_async(
        self,
        request: rms_models.UpdateTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaZoneResponse:
        """
        Description: 更新单个机房
        Summary: 更新单个机房
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_region(
        self,
        request: rms_models.QueryTraasmetaRegionRequest,
    ) -> rms_models.QueryTraasmetaRegionResponse:
        """
        Description: 地域查询
        Summary: 地域查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_region_ex(request, headers, runtime)

    async def query_traasmeta_region_async(
        self,
        request: rms_models.QueryTraasmetaRegionRequest,
    ) -> rms_models.QueryTraasmetaRegionResponse:
        """
        Description: 地域查询
        Summary: 地域查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_region_ex_async(request, headers, runtime)

    def query_traasmeta_region_ex(
        self,
        request: rms_models.QueryTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaRegionResponse:
        """
        Description: 地域查询
        Summary: 地域查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_region_ex_async(
        self,
        request: rms_models.QueryTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaRegionResponse:
        """
        Description: 地域查询
        Summary: 地域查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_zone(
        self,
        request: rms_models.QueryTraasmetaZoneRequest,
    ) -> rms_models.QueryTraasmetaZoneResponse:
        """
        Description: 机房查询
        Summary: 机房查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_zone_ex(request, headers, runtime)

    async def query_traasmeta_zone_async(
        self,
        request: rms_models.QueryTraasmetaZoneRequest,
    ) -> rms_models.QueryTraasmetaZoneResponse:
        """
        Description: 机房查询
        Summary: 机房查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_zone_ex_async(request, headers, runtime)

    def query_traasmeta_zone_ex(
        self,
        request: rms_models.QueryTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaZoneResponse:
        """
        Description: 机房查询
        Summary: 机房查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_zone_ex_async(
        self,
        request: rms_models.QueryTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaZoneResponse:
        """
        Description: 机房查询
        Summary: 机房查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_region(
        self,
        request: rms_models.PagequeryTraasmetaRegionRequest,
    ) -> rms_models.PagequeryTraasmetaRegionResponse:
        """
        Description: 地域分页查询
        Summary: 地域分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_region_ex(request, headers, runtime)

    async def pagequery_traasmeta_region_async(
        self,
        request: rms_models.PagequeryTraasmetaRegionRequest,
    ) -> rms_models.PagequeryTraasmetaRegionResponse:
        """
        Description: 地域分页查询
        Summary: 地域分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_region_ex_async(request, headers, runtime)

    def pagequery_traasmeta_region_ex(
        self,
        request: rms_models.PagequeryTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaRegionResponse:
        """
        Description: 地域分页查询
        Summary: 地域分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_region_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaRegionResponse:
        """
        Description: 地域分页查询
        Summary: 地域分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_zone(
        self,
        request: rms_models.PagequeryTraasmetaZoneRequest,
    ) -> rms_models.PagequeryTraasmetaZoneResponse:
        """
        Description: 机房分页查询
        Summary: 机房分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_zone_ex(request, headers, runtime)

    async def pagequery_traasmeta_zone_async(
        self,
        request: rms_models.PagequeryTraasmetaZoneRequest,
    ) -> rms_models.PagequeryTraasmetaZoneResponse:
        """
        Description: 机房分页查询
        Summary: 机房分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_zone_ex_async(request, headers, runtime)

    def pagequery_traasmeta_zone_ex(
        self,
        request: rms_models.PagequeryTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaZoneResponse:
        """
        Description: 机房分页查询
        Summary: 机房分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_zone_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaZoneResponse:
        """
        Description: 机房分页查询
        Summary: 机房分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_region(
        self,
        request: rms_models.BatchqueryTraasmetaRegionRequest,
    ) -> rms_models.BatchqueryTraasmetaRegionResponse:
        """
        Description: 批量查询地域
        Summary: 批量查询地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_region_ex(request, headers, runtime)

    async def batchquery_traasmeta_region_async(
        self,
        request: rms_models.BatchqueryTraasmetaRegionRequest,
    ) -> rms_models.BatchqueryTraasmetaRegionResponse:
        """
        Description: 批量查询地域
        Summary: 批量查询地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_region_ex_async(request, headers, runtime)

    def batchquery_traasmeta_region_ex(
        self,
        request: rms_models.BatchqueryTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaRegionResponse:
        """
        Description: 批量查询地域
        Summary: 批量查询地域
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_region_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaRegionResponse:
        """
        Description: 批量查询地域
        Summary: 批量查询地域
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_region(
        self,
        request: rms_models.BatchcreateTraasmetaRegionRequest,
    ) -> rms_models.BatchcreateTraasmetaRegionResponse:
        """
        Description: 批量创建地域
        Summary: 批量创建地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_region_ex(request, headers, runtime)

    async def batchcreate_traasmeta_region_async(
        self,
        request: rms_models.BatchcreateTraasmetaRegionRequest,
    ) -> rms_models.BatchcreateTraasmetaRegionResponse:
        """
        Description: 批量创建地域
        Summary: 批量创建地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_region_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_region_ex(
        self,
        request: rms_models.BatchcreateTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaRegionResponse:
        """
        Description: 批量创建地域
        Summary: 批量创建地域
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_region_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaRegionResponse:
        """
        Description: 批量创建地域
        Summary: 批量创建地域
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_zone(
        self,
        request: rms_models.BatchcreateTraasmetaZoneRequest,
    ) -> rms_models.BatchcreateTraasmetaZoneResponse:
        """
        Description: 批量创建机房
        Summary: 批量创建机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_zone_ex(request, headers, runtime)

    async def batchcreate_traasmeta_zone_async(
        self,
        request: rms_models.BatchcreateTraasmetaZoneRequest,
    ) -> rms_models.BatchcreateTraasmetaZoneResponse:
        """
        Description: 批量创建机房
        Summary: 批量创建机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_zone_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_zone_ex(
        self,
        request: rms_models.BatchcreateTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaZoneResponse:
        """
        Description: 批量创建机房
        Summary: 批量创建机房
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_zone_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaZoneResponse:
        """
        Description: 批量创建机房
        Summary: 批量创建机房
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_zone(
        self,
        request: rms_models.BatchqueryTraasmetaZoneRequest,
    ) -> rms_models.BatchqueryTraasmetaZoneResponse:
        """
        Description: 批量查询机房
        Summary: 批量查询机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_zone_ex(request, headers, runtime)

    async def batchquery_traasmeta_zone_async(
        self,
        request: rms_models.BatchqueryTraasmetaZoneRequest,
    ) -> rms_models.BatchqueryTraasmetaZoneResponse:
        """
        Description: 批量查询机房
        Summary: 批量查询机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_zone_ex_async(request, headers, runtime)

    def batchquery_traasmeta_zone_ex(
        self,
        request: rms_models.BatchqueryTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaZoneResponse:
        """
        Description: 批量查询机房
        Summary: 批量查询机房
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_zone_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaZoneResponse:
        """
        Description: 批量查询机房
        Summary: 批量查询机房
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_region(
        self,
        request: rms_models.BatchdeleteTraasmetaRegionRequest,
    ) -> rms_models.BatchdeleteTraasmetaRegionResponse:
        """
        Description: 批量删除地域
        Summary: 批量删除地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_region_ex(request, headers, runtime)

    async def batchdelete_traasmeta_region_async(
        self,
        request: rms_models.BatchdeleteTraasmetaRegionRequest,
    ) -> rms_models.BatchdeleteTraasmetaRegionResponse:
        """
        Description: 批量删除地域
        Summary: 批量删除地域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_region_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_region_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaRegionResponse:
        """
        Description: 批量删除地域
        Summary: 批量删除地域
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.region.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_region_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaRegionResponse:
        """
        Description: 批量删除地域
        Summary: 批量删除地域
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.region.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_zone(
        self,
        request: rms_models.BatchdeleteTraasmetaZoneRequest,
    ) -> rms_models.BatchdeleteTraasmetaZoneResponse:
        """
        Description: 批量删除机房
        Summary: 批量删除机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_zone_ex(request, headers, runtime)

    async def batchdelete_traasmeta_zone_async(
        self,
        request: rms_models.BatchdeleteTraasmetaZoneRequest,
    ) -> rms_models.BatchdeleteTraasmetaZoneResponse:
        """
        Description: 批量删除机房
        Summary: 批量删除机房
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_zone_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_zone_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaZoneResponse:
        """
        Description: 批量删除机房
        Summary: 批量删除机房
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.zone.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_zone_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaZoneResponse:
        """
        Description: 批量删除机房
        Summary: 批量删除机房
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.zone.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_app(
        self,
        request: rms_models.AllTraasmetaAppRequest,
    ) -> rms_models.AllTraasmetaAppResponse:
        """
        Description: 获取所有应用
        Summary: 获取所有应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_app_ex(request, headers, runtime)

    async def all_traasmeta_app_async(
        self,
        request: rms_models.AllTraasmetaAppRequest,
    ) -> rms_models.AllTraasmetaAppResponse:
        """
        Description: 获取所有应用
        Summary: 获取所有应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_app_ex_async(request, headers, runtime)

    def all_traasmeta_app_ex(
        self,
        request: rms_models.AllTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaAppResponse:
        """
        Description: 获取所有应用
        Summary: 获取所有应用
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_app_ex_async(
        self,
        request: rms_models.AllTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaAppResponse:
        """
        Description: 获取所有应用
        Summary: 获取所有应用
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_appgroup(
        self,
        request: rms_models.AllTraasmetaAppgroupRequest,
    ) -> rms_models.AllTraasmetaAppgroupResponse:
        """
        Description: 获取所有应用分组
        Summary: 获取所有应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_appgroup_ex(request, headers, runtime)

    async def all_traasmeta_appgroup_async(
        self,
        request: rms_models.AllTraasmetaAppgroupRequest,
    ) -> rms_models.AllTraasmetaAppgroupResponse:
        """
        Description: 获取所有应用分组
        Summary: 获取所有应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_appgroup_ex_async(request, headers, runtime)

    def all_traasmeta_appgroup_ex(
        self,
        request: rms_models.AllTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaAppgroupResponse:
        """
        Description: 获取所有应用分组
        Summary: 获取所有应用分组
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.AllTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaAppgroupResponse:
        """
        Description: 获取所有应用分组
        Summary: 获取所有应用分组
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_appserver(
        self,
        request: rms_models.AllTraasmetaAppserverRequest,
    ) -> rms_models.AllTraasmetaAppserverResponse:
        """
        Description: 获取所有应用服务器
        Summary: 获取所有应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_appserver_ex(request, headers, runtime)

    async def all_traasmeta_appserver_async(
        self,
        request: rms_models.AllTraasmetaAppserverRequest,
    ) -> rms_models.AllTraasmetaAppserverResponse:
        """
        Description: 获取所有应用服务器
        Summary: 获取所有应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_appserver_ex_async(request, headers, runtime)

    def all_traasmeta_appserver_ex(
        self,
        request: rms_models.AllTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaAppserverResponse:
        """
        Description: 获取所有应用服务器
        Summary: 获取所有应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_appserver_ex_async(
        self,
        request: rms_models.AllTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaAppserverResponse:
        """
        Description: 获取所有应用服务器
        Summary: 获取所有应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_apptag(
        self,
        request: rms_models.AllTraasmetaApptagRequest,
    ) -> rms_models.AllTraasmetaApptagResponse:
        """
        Description: 获取所有应用标签
        Summary: 获取所有应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_apptag_ex(request, headers, runtime)

    async def all_traasmeta_apptag_async(
        self,
        request: rms_models.AllTraasmetaApptagRequest,
    ) -> rms_models.AllTraasmetaApptagResponse:
        """
        Description: 获取所有应用标签
        Summary: 获取所有应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_apptag_ex_async(request, headers, runtime)

    def all_traasmeta_apptag_ex(
        self,
        request: rms_models.AllTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaApptagResponse:
        """
        Description: 获取所有应用标签
        Summary: 获取所有应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_apptag_ex_async(
        self,
        request: rms_models.AllTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaApptagResponse:
        """
        Description: 获取所有应用标签
        Summary: 获取所有应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_workspace(
        self,
        request: rms_models.AllTraasmetaWorkspaceRequest,
    ) -> rms_models.AllTraasmetaWorkspaceResponse:
        """
        Description: 获取所有工作空间
        Summary: 获取所有工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_workspace_ex(request, headers, runtime)

    async def all_traasmeta_workspace_async(
        self,
        request: rms_models.AllTraasmetaWorkspaceRequest,
    ) -> rms_models.AllTraasmetaWorkspaceResponse:
        """
        Description: 获取所有工作空间
        Summary: 获取所有工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_workspace_ex_async(request, headers, runtime)

    def all_traasmeta_workspace_ex(
        self,
        request: rms_models.AllTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaWorkspaceResponse:
        """
        Description: 获取所有工作空间
        Summary: 获取所有工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_workspace_ex_async(
        self,
        request: rms_models.AllTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaWorkspaceResponse:
        """
        Description: 获取所有工作空间
        Summary: 获取所有工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_workspacegroup(
        self,
        request: rms_models.AllTraasmetaWorkspacegroupRequest,
    ) -> rms_models.AllTraasmetaWorkspacegroupResponse:
        """
        Description: 获取所有工作空间组
        Summary: 获取所有工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def all_traasmeta_workspacegroup_async(
        self,
        request: rms_models.AllTraasmetaWorkspacegroupRequest,
    ) -> rms_models.AllTraasmetaWorkspacegroupResponse:
        """
        Description: 获取所有工作空间组
        Summary: 获取所有工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def all_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.AllTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaWorkspacegroupResponse:
        """
        Description: 获取所有工作空间组
        Summary: 获取所有工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.AllTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaWorkspacegroupResponse:
        """
        Description: 获取所有工作空间组
        Summary: 获取所有工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_workspacegroup(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspacegroupRequest,
    ) -> rms_models.BatchcreateTraasmetaWorkspacegroupResponse:
        """
        Description: 批量创建工作空间组
        Summary: 批量创建工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def batchcreate_traasmeta_workspacegroup_async(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspacegroupRequest,
    ) -> rms_models.BatchcreateTraasmetaWorkspacegroupResponse:
        """
        Description: 批量创建工作空间组
        Summary: 批量创建工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaWorkspacegroupResponse:
        """
        Description: 批量创建工作空间组
        Summary: 批量创建工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaWorkspacegroupResponse:
        """
        Description: 批量创建工作空间组
        Summary: 批量创建工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_app(
        self,
        request: rms_models.BatchcreateTraasmetaAppRequest,
    ) -> rms_models.BatchcreateTraasmetaAppResponse:
        """
        Description: 批量创建应用
        Summary: 批量创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_app_ex(request, headers, runtime)

    async def batchcreate_traasmeta_app_async(
        self,
        request: rms_models.BatchcreateTraasmetaAppRequest,
    ) -> rms_models.BatchcreateTraasmetaAppResponse:
        """
        Description: 批量创建应用
        Summary: 批量创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_app_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_app_ex(
        self,
        request: rms_models.BatchcreateTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaAppResponse:
        """
        Description: 批量创建应用
        Summary: 批量创建应用
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_app_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaAppResponse:
        """
        Description: 批量创建应用
        Summary: 批量创建应用
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_appgroup(
        self,
        request: rms_models.BatchcreateTraasmetaAppgroupRequest,
    ) -> rms_models.BatchcreateTraasmetaAppgroupResponse:
        """
        Description: 批量创建应用组
        Summary: 批量创建应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_appgroup_ex(request, headers, runtime)

    async def batchcreate_traasmeta_appgroup_async(
        self,
        request: rms_models.BatchcreateTraasmetaAppgroupRequest,
    ) -> rms_models.BatchcreateTraasmetaAppgroupResponse:
        """
        Description: 批量创建应用组
        Summary: 批量创建应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_appgroup_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_appgroup_ex(
        self,
        request: rms_models.BatchcreateTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaAppgroupResponse:
        """
        Description: 批量创建应用组
        Summary: 批量创建应用组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaAppgroupResponse:
        """
        Description: 批量创建应用组
        Summary: 批量创建应用组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_appserver(
        self,
        request: rms_models.BatchcreateTraasmetaAppserverRequest,
    ) -> rms_models.BatchcreateTraasmetaAppserverResponse:
        """
        Description: 批量创建应用服务器
        Summary: 批量创建应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_appserver_ex(request, headers, runtime)

    async def batchcreate_traasmeta_appserver_async(
        self,
        request: rms_models.BatchcreateTraasmetaAppserverRequest,
    ) -> rms_models.BatchcreateTraasmetaAppserverResponse:
        """
        Description: 批量创建应用服务器
        Summary: 批量创建应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_appserver_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_appserver_ex(
        self,
        request: rms_models.BatchcreateTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaAppserverResponse:
        """
        Description: 批量创建应用服务器
        Summary: 批量创建应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_appserver_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaAppserverResponse:
        """
        Description: 批量创建应用服务器
        Summary: 批量创建应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_apptag(
        self,
        request: rms_models.BatchcreateTraasmetaApptagRequest,
    ) -> rms_models.BatchcreateTraasmetaApptagResponse:
        """
        Description: 批量创建应用标签
        Summary: 批量创建应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_apptag_ex(request, headers, runtime)

    async def batchcreate_traasmeta_apptag_async(
        self,
        request: rms_models.BatchcreateTraasmetaApptagRequest,
    ) -> rms_models.BatchcreateTraasmetaApptagResponse:
        """
        Description: 批量创建应用标签
        Summary: 批量创建应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_apptag_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_apptag_ex(
        self,
        request: rms_models.BatchcreateTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaApptagResponse:
        """
        Description: 批量创建应用标签
        Summary: 批量创建应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_apptag_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaApptagResponse:
        """
        Description: 批量创建应用标签
        Summary: 批量创建应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_workspace(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspaceRequest,
    ) -> rms_models.BatchcreateTraasmetaWorkspaceResponse:
        """
        Description: 批量创建工作空间
        Summary: 批量创建工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_workspace_ex(request, headers, runtime)

    async def batchcreate_traasmeta_workspace_async(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspaceRequest,
    ) -> rms_models.BatchcreateTraasmetaWorkspaceResponse:
        """
        Description: 批量创建工作空间
        Summary: 批量创建工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_workspace_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_workspace_ex(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaWorkspaceResponse:
        """
        Description: 批量创建工作空间
        Summary: 批量创建工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_workspace_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaWorkspaceResponse:
        """
        Description: 批量创建工作空间
        Summary: 批量创建工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_app(
        self,
        request: rms_models.BatchdeleteTraasmetaAppRequest,
    ) -> rms_models.BatchdeleteTraasmetaAppResponse:
        """
        Description: 批量删除应用
        Summary: 批量删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_app_ex(request, headers, runtime)

    async def batchdelete_traasmeta_app_async(
        self,
        request: rms_models.BatchdeleteTraasmetaAppRequest,
    ) -> rms_models.BatchdeleteTraasmetaAppResponse:
        """
        Description: 批量删除应用
        Summary: 批量删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_app_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_app_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaAppResponse:
        """
        Description: 批量删除应用
        Summary: 批量删除应用
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_app_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaAppResponse:
        """
        Description: 批量删除应用
        Summary: 批量删除应用
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_workspace(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspaceRequest,
    ) -> rms_models.BatchdeleteTraasmetaWorkspaceResponse:
        """
        Description: 批量删除工作空间
        Summary: 批量删除工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_workspace_ex(request, headers, runtime)

    async def batchdelete_traasmeta_workspace_async(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspaceRequest,
    ) -> rms_models.BatchdeleteTraasmetaWorkspaceResponse:
        """
        Description: 批量删除工作空间
        Summary: 批量删除工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_workspace_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_workspace_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaWorkspaceResponse:
        """
        Description: 批量删除工作空间
        Summary: 批量删除工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_workspace_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaWorkspaceResponse:
        """
        Description: 批量删除工作空间
        Summary: 批量删除工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_apptag(
        self,
        request: rms_models.BatchdeleteTraasmetaApptagRequest,
    ) -> rms_models.BatchdeleteTraasmetaApptagResponse:
        """
        Description: 批量删除应用标签
        Summary: 批量删除应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_apptag_ex(request, headers, runtime)

    async def batchdelete_traasmeta_apptag_async(
        self,
        request: rms_models.BatchdeleteTraasmetaApptagRequest,
    ) -> rms_models.BatchdeleteTraasmetaApptagResponse:
        """
        Description: 批量删除应用标签
        Summary: 批量删除应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_apptag_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_apptag_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaApptagResponse:
        """
        Description: 批量删除应用标签
        Summary: 批量删除应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_apptag_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaApptagResponse:
        """
        Description: 批量删除应用标签
        Summary: 批量删除应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_appserver(
        self,
        request: rms_models.BatchdeleteTraasmetaAppserverRequest,
    ) -> rms_models.BatchdeleteTraasmetaAppserverResponse:
        """
        Description: 批量删除应用服务器
        Summary: 批量删除应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_appserver_ex(request, headers, runtime)

    async def batchdelete_traasmeta_appserver_async(
        self,
        request: rms_models.BatchdeleteTraasmetaAppserverRequest,
    ) -> rms_models.BatchdeleteTraasmetaAppserverResponse:
        """
        Description: 批量删除应用服务器
        Summary: 批量删除应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_appserver_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_appserver_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaAppserverResponse:
        """
        Description: 批量删除应用服务器
        Summary: 批量删除应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_appserver_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaAppserverResponse:
        """
        Description: 批量删除应用服务器
        Summary: 批量删除应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_appgroup(
        self,
        request: rms_models.BatchdeleteTraasmetaAppgroupRequest,
    ) -> rms_models.BatchdeleteTraasmetaAppgroupResponse:
        """
        Description: 批量删除应用组
        Summary: 批量删除应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_appgroup_ex(request, headers, runtime)

    async def batchdelete_traasmeta_appgroup_async(
        self,
        request: rms_models.BatchdeleteTraasmetaAppgroupRequest,
    ) -> rms_models.BatchdeleteTraasmetaAppgroupResponse:
        """
        Description: 批量删除应用组
        Summary: 批量删除应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_appgroup_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_appgroup_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaAppgroupResponse:
        """
        Description: 批量删除应用组
        Summary: 批量删除应用组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaAppgroupResponse:
        """
        Description: 批量删除应用组
        Summary: 批量删除应用组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_workspacegroup(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspacegroupRequest,
    ) -> rms_models.BatchdeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 批量删除工作空间组
        Summary: 批量删除工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def batchdelete_traasmeta_workspacegroup_async(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspacegroupRequest,
    ) -> rms_models.BatchdeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 批量删除工作空间组
        Summary: 批量删除工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 批量删除工作空间组
        Summary: 批量删除工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 批量删除工作空间组
        Summary: 批量删除工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_workspacegroup(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspacegroupRequest,
    ) -> rms_models.BatchqueryTraasmetaWorkspacegroupResponse:
        """
        Description: 批量查询工作空间组
        Summary: 批量查询工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def batchquery_traasmeta_workspacegroup_async(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspacegroupRequest,
    ) -> rms_models.BatchqueryTraasmetaWorkspacegroupResponse:
        """
        Description: 批量查询工作空间组
        Summary: 批量查询工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def batchquery_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaWorkspacegroupResponse:
        """
        Description: 批量查询工作空间组
        Summary: 批量查询工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaWorkspacegroupResponse:
        """
        Description: 批量查询工作空间组
        Summary: 批量查询工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_workspace(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspaceRequest,
    ) -> rms_models.BatchqueryTraasmetaWorkspaceResponse:
        """
        Description: 批量查询工作空间
        Summary: 批量查询工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_workspace_ex(request, headers, runtime)

    async def batchquery_traasmeta_workspace_async(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspaceRequest,
    ) -> rms_models.BatchqueryTraasmetaWorkspaceResponse:
        """
        Description: 批量查询工作空间
        Summary: 批量查询工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_workspace_ex_async(request, headers, runtime)

    def batchquery_traasmeta_workspace_ex(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaWorkspaceResponse:
        """
        Description: 批量查询工作空间
        Summary: 批量查询工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_workspace_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaWorkspaceResponse:
        """
        Description: 批量查询工作空间
        Summary: 批量查询工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_apptag(
        self,
        request: rms_models.BatchqueryTraasmetaApptagRequest,
    ) -> rms_models.BatchqueryTraasmetaApptagResponse:
        """
        Description: 批量查询应用标签
        Summary: 批量查询应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_apptag_ex(request, headers, runtime)

    async def batchquery_traasmeta_apptag_async(
        self,
        request: rms_models.BatchqueryTraasmetaApptagRequest,
    ) -> rms_models.BatchqueryTraasmetaApptagResponse:
        """
        Description: 批量查询应用标签
        Summary: 批量查询应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_apptag_ex_async(request, headers, runtime)

    def batchquery_traasmeta_apptag_ex(
        self,
        request: rms_models.BatchqueryTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaApptagResponse:
        """
        Description: 批量查询应用标签
        Summary: 批量查询应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_apptag_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaApptagResponse:
        """
        Description: 批量查询应用标签
        Summary: 批量查询应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_appserver(
        self,
        request: rms_models.BatchqueryTraasmetaAppserverRequest,
    ) -> rms_models.BatchqueryTraasmetaAppserverResponse:
        """
        Description: 批量查询应用服务器
        Summary: 批量查询应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_appserver_ex(request, headers, runtime)

    async def batchquery_traasmeta_appserver_async(
        self,
        request: rms_models.BatchqueryTraasmetaAppserverRequest,
    ) -> rms_models.BatchqueryTraasmetaAppserverResponse:
        """
        Description: 批量查询应用服务器
        Summary: 批量查询应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_appserver_ex_async(request, headers, runtime)

    def batchquery_traasmeta_appserver_ex(
        self,
        request: rms_models.BatchqueryTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaAppserverResponse:
        """
        Description: 批量查询应用服务器
        Summary: 批量查询应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_appserver_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaAppserverResponse:
        """
        Description: 批量查询应用服务器
        Summary: 批量查询应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_appgroup(
        self,
        request: rms_models.BatchqueryTraasmetaAppgroupRequest,
    ) -> rms_models.BatchqueryTraasmetaAppgroupResponse:
        """
        Description: 批量查询应用组
        Summary: 批量查询应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_appgroup_ex(request, headers, runtime)

    async def batchquery_traasmeta_appgroup_async(
        self,
        request: rms_models.BatchqueryTraasmetaAppgroupRequest,
    ) -> rms_models.BatchqueryTraasmetaAppgroupResponse:
        """
        Description: 批量查询应用组
        Summary: 批量查询应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_appgroup_ex_async(request, headers, runtime)

    def batchquery_traasmeta_appgroup_ex(
        self,
        request: rms_models.BatchqueryTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaAppgroupResponse:
        """
        Description: 批量查询应用组
        Summary: 批量查询应用组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaAppgroupResponse:
        """
        Description: 批量查询应用组
        Summary: 批量查询应用组
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_app(
        self,
        request: rms_models.BatchqueryTraasmetaAppRequest,
    ) -> rms_models.BatchqueryTraasmetaAppResponse:
        """
        Description: 批量查询应用
        Summary: 批量查询应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_app_ex(request, headers, runtime)

    async def batchquery_traasmeta_app_async(
        self,
        request: rms_models.BatchqueryTraasmetaAppRequest,
    ) -> rms_models.BatchqueryTraasmetaAppResponse:
        """
        Description: 批量查询应用
        Summary: 批量查询应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_app_ex_async(request, headers, runtime)

    def batchquery_traasmeta_app_ex(
        self,
        request: rms_models.BatchqueryTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaAppResponse:
        """
        Description: 批量查询应用
        Summary: 批量查询应用
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_app_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaAppResponse:
        """
        Description: 批量查询应用
        Summary: 批量查询应用
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_app(
        self,
        request: rms_models.DeleteTraasmetaAppRequest,
    ) -> rms_models.DeleteTraasmetaAppResponse:
        """
        Description: 删除单个应用
        Summary: 删除单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_app_ex(request, headers, runtime)

    async def delete_traasmeta_app_async(
        self,
        request: rms_models.DeleteTraasmetaAppRequest,
    ) -> rms_models.DeleteTraasmetaAppResponse:
        """
        Description: 删除单个应用
        Summary: 删除单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_app_ex_async(request, headers, runtime)

    def delete_traasmeta_app_ex(
        self,
        request: rms_models.DeleteTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaAppResponse:
        """
        Description: 删除单个应用
        Summary: 删除单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_app_ex_async(
        self,
        request: rms_models.DeleteTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaAppResponse:
        """
        Description: 删除单个应用
        Summary: 删除单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_appgroup(
        self,
        request: rms_models.DeleteTraasmetaAppgroupRequest,
    ) -> rms_models.DeleteTraasmetaAppgroupResponse:
        """
        Description: 删除单个应用组
        Summary: 删除单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_appgroup_ex(request, headers, runtime)

    async def delete_traasmeta_appgroup_async(
        self,
        request: rms_models.DeleteTraasmetaAppgroupRequest,
    ) -> rms_models.DeleteTraasmetaAppgroupResponse:
        """
        Description: 删除单个应用组
        Summary: 删除单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_appgroup_ex_async(request, headers, runtime)

    def delete_traasmeta_appgroup_ex(
        self,
        request: rms_models.DeleteTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaAppgroupResponse:
        """
        Description: 删除单个应用组
        Summary: 删除单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.DeleteTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaAppgroupResponse:
        """
        Description: 删除单个应用组
        Summary: 删除单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_appserver(
        self,
        request: rms_models.DeleteTraasmetaAppserverRequest,
    ) -> rms_models.DeleteTraasmetaAppserverResponse:
        """
        Description: 删除单个应用服务器
        Summary: 删除单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_appserver_ex(request, headers, runtime)

    async def delete_traasmeta_appserver_async(
        self,
        request: rms_models.DeleteTraasmetaAppserverRequest,
    ) -> rms_models.DeleteTraasmetaAppserverResponse:
        """
        Description: 删除单个应用服务器
        Summary: 删除单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_appserver_ex_async(request, headers, runtime)

    def delete_traasmeta_appserver_ex(
        self,
        request: rms_models.DeleteTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaAppserverResponse:
        """
        Description: 删除单个应用服务器
        Summary: 删除单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_appserver_ex_async(
        self,
        request: rms_models.DeleteTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaAppserverResponse:
        """
        Description: 删除单个应用服务器
        Summary: 删除单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_apptag(
        self,
        request: rms_models.DeleteTraasmetaApptagRequest,
    ) -> rms_models.DeleteTraasmetaApptagResponse:
        """
        Description: 删除单个应用标签
        Summary: 删除单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_apptag_ex(request, headers, runtime)

    async def delete_traasmeta_apptag_async(
        self,
        request: rms_models.DeleteTraasmetaApptagRequest,
    ) -> rms_models.DeleteTraasmetaApptagResponse:
        """
        Description: 删除单个应用标签
        Summary: 删除单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_apptag_ex_async(request, headers, runtime)

    def delete_traasmeta_apptag_ex(
        self,
        request: rms_models.DeleteTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaApptagResponse:
        """
        Description: 删除单个应用标签
        Summary: 删除单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_apptag_ex_async(
        self,
        request: rms_models.DeleteTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaApptagResponse:
        """
        Description: 删除单个应用标签
        Summary: 删除单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_workspace(
        self,
        request: rms_models.DeleteTraasmetaWorkspaceRequest,
    ) -> rms_models.DeleteTraasmetaWorkspaceResponse:
        """
        Description: 删除单个工作空间
        Summary: 删除单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_workspace_ex(request, headers, runtime)

    async def delete_traasmeta_workspace_async(
        self,
        request: rms_models.DeleteTraasmetaWorkspaceRequest,
    ) -> rms_models.DeleteTraasmetaWorkspaceResponse:
        """
        Description: 删除单个工作空间
        Summary: 删除单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_workspace_ex_async(request, headers, runtime)

    def delete_traasmeta_workspace_ex(
        self,
        request: rms_models.DeleteTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaWorkspaceResponse:
        """
        Description: 删除单个工作空间
        Summary: 删除单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_workspace_ex_async(
        self,
        request: rms_models.DeleteTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaWorkspaceResponse:
        """
        Description: 删除单个工作空间
        Summary: 删除单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_workspacegroup(
        self,
        request: rms_models.DeleteTraasmetaWorkspacegroupRequest,
    ) -> rms_models.DeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 删除单个工作空间组
        Summary: 删除单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def delete_traasmeta_workspacegroup_async(
        self,
        request: rms_models.DeleteTraasmetaWorkspacegroupRequest,
    ) -> rms_models.DeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 删除单个工作空间组
        Summary: 删除单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def delete_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.DeleteTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 删除单个工作空间组
        Summary: 删除单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.DeleteTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaWorkspacegroupResponse:
        """
        Description: 删除单个工作空间组
        Summary: 删除单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_app(
        self,
        request: rms_models.GetTraasmetaAppRequest,
    ) -> rms_models.GetTraasmetaAppResponse:
        """
        Description: 获取单个应用
        Summary: 获取单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_app_ex(request, headers, runtime)

    async def get_traasmeta_app_async(
        self,
        request: rms_models.GetTraasmetaAppRequest,
    ) -> rms_models.GetTraasmetaAppResponse:
        """
        Description: 获取单个应用
        Summary: 获取单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_app_ex_async(request, headers, runtime)

    def get_traasmeta_app_ex(
        self,
        request: rms_models.GetTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaAppResponse:
        """
        Description: 获取单个应用
        Summary: 获取单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_app_ex_async(
        self,
        request: rms_models.GetTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaAppResponse:
        """
        Description: 获取单个应用
        Summary: 获取单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_appgroup(
        self,
        request: rms_models.GetTraasmetaAppgroupRequest,
    ) -> rms_models.GetTraasmetaAppgroupResponse:
        """
        Description: 获取单个应用组
        Summary: 获取单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_appgroup_ex(request, headers, runtime)

    async def get_traasmeta_appgroup_async(
        self,
        request: rms_models.GetTraasmetaAppgroupRequest,
    ) -> rms_models.GetTraasmetaAppgroupResponse:
        """
        Description: 获取单个应用组
        Summary: 获取单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_appgroup_ex_async(request, headers, runtime)

    def get_traasmeta_appgroup_ex(
        self,
        request: rms_models.GetTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaAppgroupResponse:
        """
        Description: 获取单个应用组
        Summary: 获取单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.GetTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaAppgroupResponse:
        """
        Description: 获取单个应用组
        Summary: 获取单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_appserver(
        self,
        request: rms_models.GetTraasmetaAppserverRequest,
    ) -> rms_models.GetTraasmetaAppserverResponse:
        """
        Description: 获取单个应用服务器
        Summary: 获取单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_appserver_ex(request, headers, runtime)

    async def get_traasmeta_appserver_async(
        self,
        request: rms_models.GetTraasmetaAppserverRequest,
    ) -> rms_models.GetTraasmetaAppserverResponse:
        """
        Description: 获取单个应用服务器
        Summary: 获取单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_appserver_ex_async(request, headers, runtime)

    def get_traasmeta_appserver_ex(
        self,
        request: rms_models.GetTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaAppserverResponse:
        """
        Description: 获取单个应用服务器
        Summary: 获取单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_appserver_ex_async(
        self,
        request: rms_models.GetTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaAppserverResponse:
        """
        Description: 获取单个应用服务器
        Summary: 获取单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_apptag(
        self,
        request: rms_models.GetTraasmetaApptagRequest,
    ) -> rms_models.GetTraasmetaApptagResponse:
        """
        Description: 获取单个应用标签
        Summary: 获取单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_apptag_ex(request, headers, runtime)

    async def get_traasmeta_apptag_async(
        self,
        request: rms_models.GetTraasmetaApptagRequest,
    ) -> rms_models.GetTraasmetaApptagResponse:
        """
        Description: 获取单个应用标签
        Summary: 获取单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_apptag_ex_async(request, headers, runtime)

    def get_traasmeta_apptag_ex(
        self,
        request: rms_models.GetTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaApptagResponse:
        """
        Description: 获取单个应用标签
        Summary: 获取单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_apptag_ex_async(
        self,
        request: rms_models.GetTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaApptagResponse:
        """
        Description: 获取单个应用标签
        Summary: 获取单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_workspace(
        self,
        request: rms_models.GetTraasmetaWorkspaceRequest,
    ) -> rms_models.GetTraasmetaWorkspaceResponse:
        """
        Description: 获取单个工作空间
        Summary: 获取单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_workspace_ex(request, headers, runtime)

    async def get_traasmeta_workspace_async(
        self,
        request: rms_models.GetTraasmetaWorkspaceRequest,
    ) -> rms_models.GetTraasmetaWorkspaceResponse:
        """
        Description: 获取单个工作空间
        Summary: 获取单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_workspace_ex_async(request, headers, runtime)

    def get_traasmeta_workspace_ex(
        self,
        request: rms_models.GetTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaWorkspaceResponse:
        """
        Description: 获取单个工作空间
        Summary: 获取单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_workspace_ex_async(
        self,
        request: rms_models.GetTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaWorkspaceResponse:
        """
        Description: 获取单个工作空间
        Summary: 获取单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_workspacegroup(
        self,
        request: rms_models.GetTraasmetaWorkspacegroupRequest,
    ) -> rms_models.GetTraasmetaWorkspacegroupResponse:
        """
        Description: 获取单个工作空间组
        Summary: 获取单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def get_traasmeta_workspacegroup_async(
        self,
        request: rms_models.GetTraasmetaWorkspacegroupRequest,
    ) -> rms_models.GetTraasmetaWorkspacegroupResponse:
        """
        Description: 获取单个工作空间组
        Summary: 获取单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def get_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.GetTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaWorkspacegroupResponse:
        """
        Description: 获取单个工作空间组
        Summary: 获取单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.GetTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaWorkspacegroupResponse:
        """
        Description: 获取单个工作空间组
        Summary: 获取单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_workspacegroup(
        self,
        request: rms_models.PagequeryTraasmetaWorkspacegroupRequest,
    ) -> rms_models.PagequeryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组分页查询
        Summary: 工作空间组分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def pagequery_traasmeta_workspacegroup_async(
        self,
        request: rms_models.PagequeryTraasmetaWorkspacegroupRequest,
    ) -> rms_models.PagequeryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组分页查询
        Summary: 工作空间组分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def pagequery_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.PagequeryTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组分页查询
        Summary: 工作空间组分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组分页查询
        Summary: 工作空间组分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_workspace(
        self,
        request: rms_models.PagequeryTraasmetaWorkspaceRequest,
    ) -> rms_models.PagequeryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间分页查询
        Summary: 工作空间分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_workspace_ex(request, headers, runtime)

    async def pagequery_traasmeta_workspace_async(
        self,
        request: rms_models.PagequeryTraasmetaWorkspaceRequest,
    ) -> rms_models.PagequeryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间分页查询
        Summary: 工作空间分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_workspace_ex_async(request, headers, runtime)

    def pagequery_traasmeta_workspace_ex(
        self,
        request: rms_models.PagequeryTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间分页查询
        Summary: 工作空间分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_workspace_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间分页查询
        Summary: 工作空间分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_apptag(
        self,
        request: rms_models.PagequeryTraasmetaApptagRequest,
    ) -> rms_models.PagequeryTraasmetaApptagResponse:
        """
        Description: 应用标签分页查询
        Summary: 应用标签分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_apptag_ex(request, headers, runtime)

    async def pagequery_traasmeta_apptag_async(
        self,
        request: rms_models.PagequeryTraasmetaApptagRequest,
    ) -> rms_models.PagequeryTraasmetaApptagResponse:
        """
        Description: 应用标签分页查询
        Summary: 应用标签分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_apptag_ex_async(request, headers, runtime)

    def pagequery_traasmeta_apptag_ex(
        self,
        request: rms_models.PagequeryTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaApptagResponse:
        """
        Description: 应用标签分页查询
        Summary: 应用标签分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_apptag_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaApptagResponse:
        """
        Description: 应用标签分页查询
        Summary: 应用标签分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_appserver(
        self,
        request: rms_models.PagequeryTraasmetaAppserverRequest,
    ) -> rms_models.PagequeryTraasmetaAppserverResponse:
        """
        Description: 应用服务器分页查询
        Summary: 应用服务器分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_appserver_ex(request, headers, runtime)

    async def pagequery_traasmeta_appserver_async(
        self,
        request: rms_models.PagequeryTraasmetaAppserverRequest,
    ) -> rms_models.PagequeryTraasmetaAppserverResponse:
        """
        Description: 应用服务器分页查询
        Summary: 应用服务器分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_appserver_ex_async(request, headers, runtime)

    def pagequery_traasmeta_appserver_ex(
        self,
        request: rms_models.PagequeryTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaAppserverResponse:
        """
        Description: 应用服务器分页查询
        Summary: 应用服务器分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_appserver_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaAppserverResponse:
        """
        Description: 应用服务器分页查询
        Summary: 应用服务器分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_appgroup(
        self,
        request: rms_models.PagequeryTraasmetaAppgroupRequest,
    ) -> rms_models.PagequeryTraasmetaAppgroupResponse:
        """
        Description: 应用组分页查询
        Summary: 应用组分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_appgroup_ex(request, headers, runtime)

    async def pagequery_traasmeta_appgroup_async(
        self,
        request: rms_models.PagequeryTraasmetaAppgroupRequest,
    ) -> rms_models.PagequeryTraasmetaAppgroupResponse:
        """
        Description: 应用组分页查询
        Summary: 应用组分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_appgroup_ex_async(request, headers, runtime)

    def pagequery_traasmeta_appgroup_ex(
        self,
        request: rms_models.PagequeryTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaAppgroupResponse:
        """
        Description: 应用组分页查询
        Summary: 应用组分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaAppgroupResponse:
        """
        Description: 应用组分页查询
        Summary: 应用组分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_app(
        self,
        request: rms_models.PagequeryTraasmetaAppRequest,
    ) -> rms_models.PagequeryTraasmetaAppResponse:
        """
        Description: 应用分页查询
        Summary: 应用分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_app_ex(request, headers, runtime)

    async def pagequery_traasmeta_app_async(
        self,
        request: rms_models.PagequeryTraasmetaAppRequest,
    ) -> rms_models.PagequeryTraasmetaAppResponse:
        """
        Description: 应用分页查询
        Summary: 应用分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_app_ex_async(request, headers, runtime)

    def pagequery_traasmeta_app_ex(
        self,
        request: rms_models.PagequeryTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaAppResponse:
        """
        Description: 应用分页查询
        Summary: 应用分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_app_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaAppResponse:
        """
        Description: 应用分页查询
        Summary: 应用分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_workspacegroup(
        self,
        request: rms_models.QueryTraasmetaWorkspacegroupRequest,
    ) -> rms_models.QueryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组查询
        Summary: 工作空间组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def query_traasmeta_workspacegroup_async(
        self,
        request: rms_models.QueryTraasmetaWorkspacegroupRequest,
    ) -> rms_models.QueryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组查询
        Summary: 工作空间组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def query_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.QueryTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组查询
        Summary: 工作空间组查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.QueryTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaWorkspacegroupResponse:
        """
        Description: 工作空间组查询
        Summary: 工作空间组查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_workspace(
        self,
        request: rms_models.QueryTraasmetaWorkspaceRequest,
    ) -> rms_models.QueryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间查询
        Summary: 工作空间查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_workspace_ex(request, headers, runtime)

    async def query_traasmeta_workspace_async(
        self,
        request: rms_models.QueryTraasmetaWorkspaceRequest,
    ) -> rms_models.QueryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间查询
        Summary: 工作空间查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_workspace_ex_async(request, headers, runtime)

    def query_traasmeta_workspace_ex(
        self,
        request: rms_models.QueryTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间查询
        Summary: 工作空间查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_workspace_ex_async(
        self,
        request: rms_models.QueryTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaWorkspaceResponse:
        """
        Description: 工作空间查询
        Summary: 工作空间查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_apptag(
        self,
        request: rms_models.QueryTraasmetaApptagRequest,
    ) -> rms_models.QueryTraasmetaApptagResponse:
        """
        Description: 应用标签查询
        Summary: 应用标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_apptag_ex(request, headers, runtime)

    async def query_traasmeta_apptag_async(
        self,
        request: rms_models.QueryTraasmetaApptagRequest,
    ) -> rms_models.QueryTraasmetaApptagResponse:
        """
        Description: 应用标签查询
        Summary: 应用标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_apptag_ex_async(request, headers, runtime)

    def query_traasmeta_apptag_ex(
        self,
        request: rms_models.QueryTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaApptagResponse:
        """
        Description: 应用标签查询
        Summary: 应用标签查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_apptag_ex_async(
        self,
        request: rms_models.QueryTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaApptagResponse:
        """
        Description: 应用标签查询
        Summary: 应用标签查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_appserver(
        self,
        request: rms_models.QueryTraasmetaAppserverRequest,
    ) -> rms_models.QueryTraasmetaAppserverResponse:
        """
        Description: 应用服务器查询
        Summary: 应用服务器查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_appserver_ex(request, headers, runtime)

    async def query_traasmeta_appserver_async(
        self,
        request: rms_models.QueryTraasmetaAppserverRequest,
    ) -> rms_models.QueryTraasmetaAppserverResponse:
        """
        Description: 应用服务器查询
        Summary: 应用服务器查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_appserver_ex_async(request, headers, runtime)

    def query_traasmeta_appserver_ex(
        self,
        request: rms_models.QueryTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaAppserverResponse:
        """
        Description: 应用服务器查询
        Summary: 应用服务器查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_appserver_ex_async(
        self,
        request: rms_models.QueryTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaAppserverResponse:
        """
        Description: 应用服务器查询
        Summary: 应用服务器查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_appgroup(
        self,
        request: rms_models.QueryTraasmetaAppgroupRequest,
    ) -> rms_models.QueryTraasmetaAppgroupResponse:
        """
        Description: 应用组查询
        Summary: 应用组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_appgroup_ex(request, headers, runtime)

    async def query_traasmeta_appgroup_async(
        self,
        request: rms_models.QueryTraasmetaAppgroupRequest,
    ) -> rms_models.QueryTraasmetaAppgroupResponse:
        """
        Description: 应用组查询
        Summary: 应用组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_appgroup_ex_async(request, headers, runtime)

    def query_traasmeta_appgroup_ex(
        self,
        request: rms_models.QueryTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaAppgroupResponse:
        """
        Description: 应用组查询
        Summary: 应用组查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.QueryTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaAppgroupResponse:
        """
        Description: 应用组查询
        Summary: 应用组查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_app(
        self,
        request: rms_models.QueryTraasmetaAppRequest,
    ) -> rms_models.QueryTraasmetaAppResponse:
        """
        Description: 应用查询
        Summary: 应用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_app_ex(request, headers, runtime)

    async def query_traasmeta_app_async(
        self,
        request: rms_models.QueryTraasmetaAppRequest,
    ) -> rms_models.QueryTraasmetaAppResponse:
        """
        Description: 应用查询
        Summary: 应用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_app_ex_async(request, headers, runtime)

    def query_traasmeta_app_ex(
        self,
        request: rms_models.QueryTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaAppResponse:
        """
        Description: 应用查询
        Summary: 应用查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_app_ex_async(
        self,
        request: rms_models.QueryTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaAppResponse:
        """
        Description: 应用查询
        Summary: 应用查询
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_app(
        self,
        request: rms_models.UpdateTraasmetaAppRequest,
    ) -> rms_models.UpdateTraasmetaAppResponse:
        """
        Description: 更新单个应用
        Summary: 更新单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_app_ex(request, headers, runtime)

    async def update_traasmeta_app_async(
        self,
        request: rms_models.UpdateTraasmetaAppRequest,
    ) -> rms_models.UpdateTraasmetaAppResponse:
        """
        Description: 更新单个应用
        Summary: 更新单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_app_ex_async(request, headers, runtime)

    def update_traasmeta_app_ex(
        self,
        request: rms_models.UpdateTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaAppResponse:
        """
        Description: 更新单个应用
        Summary: 更新单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_app_ex_async(
        self,
        request: rms_models.UpdateTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaAppResponse:
        """
        Description: 更新单个应用
        Summary: 更新单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_app(
        self,
        request: rms_models.CreateTraasmetaAppRequest,
    ) -> rms_models.CreateTraasmetaAppResponse:
        """
        Description: 创建单个应用
        Summary: 创建单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_app_ex(request, headers, runtime)

    async def create_traasmeta_app_async(
        self,
        request: rms_models.CreateTraasmetaAppRequest,
    ) -> rms_models.CreateTraasmetaAppResponse:
        """
        Description: 创建单个应用
        Summary: 创建单个应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_app_ex_async(request, headers, runtime)

    def create_traasmeta_app_ex(
        self,
        request: rms_models.CreateTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaAppResponse:
        """
        Description: 创建单个应用
        Summary: 创建单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_app_ex_async(
        self,
        request: rms_models.CreateTraasmetaAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaAppResponse:
        """
        Description: 创建单个应用
        Summary: 创建单个应用
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_workspacegroup(
        self,
        request: rms_models.UpdateTraasmetaWorkspacegroupRequest,
    ) -> rms_models.UpdateTraasmetaWorkspacegroupResponse:
        """
        Description: 更新单个工作空间组
        Summary: 更新单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def update_traasmeta_workspacegroup_async(
        self,
        request: rms_models.UpdateTraasmetaWorkspacegroupRequest,
    ) -> rms_models.UpdateTraasmetaWorkspacegroupResponse:
        """
        Description: 更新单个工作空间组
        Summary: 更新单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def update_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.UpdateTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaWorkspacegroupResponse:
        """
        Description: 更新单个工作空间组
        Summary: 更新单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.UpdateTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaWorkspacegroupResponse:
        """
        Description: 更新单个工作空间组
        Summary: 更新单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_appgroup(
        self,
        request: rms_models.UpdateTraasmetaAppgroupRequest,
    ) -> rms_models.UpdateTraasmetaAppgroupResponse:
        """
        Description: 更新单个应用组
        Summary: 更新单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_appgroup_ex(request, headers, runtime)

    async def update_traasmeta_appgroup_async(
        self,
        request: rms_models.UpdateTraasmetaAppgroupRequest,
    ) -> rms_models.UpdateTraasmetaAppgroupResponse:
        """
        Description: 更新单个应用组
        Summary: 更新单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_appgroup_ex_async(request, headers, runtime)

    def update_traasmeta_appgroup_ex(
        self,
        request: rms_models.UpdateTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaAppgroupResponse:
        """
        Description: 更新单个应用组
        Summary: 更新单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.UpdateTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaAppgroupResponse:
        """
        Description: 更新单个应用组
        Summary: 更新单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_appgroup(
        self,
        request: rms_models.CreateTraasmetaAppgroupRequest,
    ) -> rms_models.CreateTraasmetaAppgroupResponse:
        """
        Description: 创建单个应用组
        Summary: 创建单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_appgroup_ex(request, headers, runtime)

    async def create_traasmeta_appgroup_async(
        self,
        request: rms_models.CreateTraasmetaAppgroupRequest,
    ) -> rms_models.CreateTraasmetaAppgroupResponse:
        """
        Description: 创建单个应用组
        Summary: 创建单个应用组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_appgroup_ex_async(request, headers, runtime)

    def create_traasmeta_appgroup_ex(
        self,
        request: rms_models.CreateTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaAppgroupResponse:
        """
        Description: 创建单个应用组
        Summary: 创建单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_appgroup_ex_async(
        self,
        request: rms_models.CreateTraasmetaAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaAppgroupResponse:
        """
        Description: 创建单个应用组
        Summary: 创建单个应用组
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_workspace(
        self,
        request: rms_models.CreateTraasmetaWorkspaceRequest,
    ) -> rms_models.CreateTraasmetaWorkspaceResponse:
        """
        Description: 创建单个工作空间
        Summary: 创建单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_workspace_ex(request, headers, runtime)

    async def create_traasmeta_workspace_async(
        self,
        request: rms_models.CreateTraasmetaWorkspaceRequest,
    ) -> rms_models.CreateTraasmetaWorkspaceResponse:
        """
        Description: 创建单个工作空间
        Summary: 创建单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_workspace_ex_async(request, headers, runtime)

    def create_traasmeta_workspace_ex(
        self,
        request: rms_models.CreateTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaWorkspaceResponse:
        """
        Description: 创建单个工作空间
        Summary: 创建单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_workspace_ex_async(
        self,
        request: rms_models.CreateTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaWorkspaceResponse:
        """
        Description: 创建单个工作空间
        Summary: 创建单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_workspace(
        self,
        request: rms_models.UpdateTraasmetaWorkspaceRequest,
    ) -> rms_models.UpdateTraasmetaWorkspaceResponse:
        """
        Description: 更新单个工作空间
        Summary: 更新单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_workspace_ex(request, headers, runtime)

    async def update_traasmeta_workspace_async(
        self,
        request: rms_models.UpdateTraasmetaWorkspaceRequest,
    ) -> rms_models.UpdateTraasmetaWorkspaceResponse:
        """
        Description: 更新单个工作空间
        Summary: 更新单个工作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_workspace_ex_async(request, headers, runtime)

    def update_traasmeta_workspace_ex(
        self,
        request: rms_models.UpdateTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaWorkspaceResponse:
        """
        Description: 更新单个工作空间
        Summary: 更新单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_workspace_ex_async(
        self,
        request: rms_models.UpdateTraasmetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaWorkspaceResponse:
        """
        Description: 更新单个工作空间
        Summary: 更新单个工作空间
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_apptag(
        self,
        request: rms_models.UpdateTraasmetaApptagRequest,
    ) -> rms_models.UpdateTraasmetaApptagResponse:
        """
        Description: 更新单个应用标签
        Summary: 更新单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_apptag_ex(request, headers, runtime)

    async def update_traasmeta_apptag_async(
        self,
        request: rms_models.UpdateTraasmetaApptagRequest,
    ) -> rms_models.UpdateTraasmetaApptagResponse:
        """
        Description: 更新单个应用标签
        Summary: 更新单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_apptag_ex_async(request, headers, runtime)

    def update_traasmeta_apptag_ex(
        self,
        request: rms_models.UpdateTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaApptagResponse:
        """
        Description: 更新单个应用标签
        Summary: 更新单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_apptag_ex_async(
        self,
        request: rms_models.UpdateTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaApptagResponse:
        """
        Description: 更新单个应用标签
        Summary: 更新单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_apptag(
        self,
        request: rms_models.CreateTraasmetaApptagRequest,
    ) -> rms_models.CreateTraasmetaApptagResponse:
        """
        Description: 创建单个应用标签
        Summary: 创建单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_apptag_ex(request, headers, runtime)

    async def create_traasmeta_apptag_async(
        self,
        request: rms_models.CreateTraasmetaApptagRequest,
    ) -> rms_models.CreateTraasmetaApptagResponse:
        """
        Description: 创建单个应用标签
        Summary: 创建单个应用标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_apptag_ex_async(request, headers, runtime)

    def create_traasmeta_apptag_ex(
        self,
        request: rms_models.CreateTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaApptagResponse:
        """
        Description: 创建单个应用标签
        Summary: 创建单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaApptagResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.apptag.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_apptag_ex_async(
        self,
        request: rms_models.CreateTraasmetaApptagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaApptagResponse:
        """
        Description: 创建单个应用标签
        Summary: 创建单个应用标签
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaApptagResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.apptag.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_appserver(
        self,
        request: rms_models.CreateTraasmetaAppserverRequest,
    ) -> rms_models.CreateTraasmetaAppserverResponse:
        """
        Description: 创建单个应用服务器
        Summary: 创建单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_appserver_ex(request, headers, runtime)

    async def create_traasmeta_appserver_async(
        self,
        request: rms_models.CreateTraasmetaAppserverRequest,
    ) -> rms_models.CreateTraasmetaAppserverResponse:
        """
        Description: 创建单个应用服务器
        Summary: 创建单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_appserver_ex_async(request, headers, runtime)

    def create_traasmeta_appserver_ex(
        self,
        request: rms_models.CreateTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaAppserverResponse:
        """
        Description: 创建单个应用服务器
        Summary: 创建单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_appserver_ex_async(
        self,
        request: rms_models.CreateTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaAppserverResponse:
        """
        Description: 创建单个应用服务器
        Summary: 创建单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_appserver(
        self,
        request: rms_models.UpdateTraasmetaAppserverRequest,
    ) -> rms_models.UpdateTraasmetaAppserverResponse:
        """
        Description: 更新单个应用服务器
        Summary: 更新单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_appserver_ex(request, headers, runtime)

    async def update_traasmeta_appserver_async(
        self,
        request: rms_models.UpdateTraasmetaAppserverRequest,
    ) -> rms_models.UpdateTraasmetaAppserverResponse:
        """
        Description: 更新单个应用服务器
        Summary: 更新单个应用服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_appserver_ex_async(request, headers, runtime)

    def update_traasmeta_appserver_ex(
        self,
        request: rms_models.UpdateTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaAppserverResponse:
        """
        Description: 更新单个应用服务器
        Summary: 更新单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaAppserverResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.appserver.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_appserver_ex_async(
        self,
        request: rms_models.UpdateTraasmetaAppserverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaAppserverResponse:
        """
        Description: 更新单个应用服务器
        Summary: 更新单个应用服务器
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaAppserverResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.appserver.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_setup_model(
        self,
        request: rms_models.GetSetupModelRequest,
    ) -> rms_models.GetSetupModelResponse:
        """
        Description: 获取SetupModel
        Summary: 获取SetupModel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_setup_model_ex(request, headers, runtime)

    async def get_setup_model_async(
        self,
        request: rms_models.GetSetupModelRequest,
    ) -> rms_models.GetSetupModelResponse:
        """
        Description: 获取SetupModel
        Summary: 获取SetupModel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_setup_model_ex_async(request, headers, runtime)

    def get_setup_model_ex(
        self,
        request: rms_models.GetSetupModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetSetupModelResponse:
        """
        Description: 获取SetupModel
        Summary: 获取SetupModel
        """
        UtilClient.validate_model(request)
        return rms_models.GetSetupModelResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.setup.model.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_setup_model_ex_async(
        self,
        request: rms_models.GetSetupModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetSetupModelResponse:
        """
        Description: 获取SetupModel
        Summary: 获取SetupModel
        """
        UtilClient.validate_model(request)
        return rms_models.GetSetupModelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.setup.model.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_workspacegroup(
        self,
        request: rms_models.CreateTraasmetaWorkspacegroupRequest,
    ) -> rms_models.CreateTraasmetaWorkspacegroupResponse:
        """
        Description: 创建单个工作空间组
        Summary: 创建单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_workspacegroup_ex(request, headers, runtime)

    async def create_traasmeta_workspacegroup_async(
        self,
        request: rms_models.CreateTraasmetaWorkspacegroupRequest,
    ) -> rms_models.CreateTraasmetaWorkspacegroupResponse:
        """
        Description: 创建单个工作空间组
        Summary: 创建单个工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_workspacegroup_ex_async(request, headers, runtime)

    def create_traasmeta_workspacegroup_ex(
        self,
        request: rms_models.CreateTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaWorkspacegroupResponse:
        """
        Description: 创建单个工作空间组
        Summary: 创建单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.workspacegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_workspacegroup_ex_async(
        self,
        request: rms_models.CreateTraasmetaWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaWorkspacegroupResponse:
        """
        Description: 创建单个工作空间组
        Summary: 创建单个工作空间组
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.workspacegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_cell(
        self,
        request: rms_models.GetTraasmetaCellRequest,
    ) -> rms_models.GetTraasmetaCellResponse:
        """
        Description: 获取单个cell
        Summary: 获取单个cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_cell_ex(request, headers, runtime)

    async def get_traasmeta_cell_async(
        self,
        request: rms_models.GetTraasmetaCellRequest,
    ) -> rms_models.GetTraasmetaCellResponse:
        """
        Description: 获取单个cell
        Summary: 获取单个cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_cell_ex_async(request, headers, runtime)

    def get_traasmeta_cell_ex(
        self,
        request: rms_models.GetTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaCellResponse:
        """
        Description: 获取单个cell
        Summary: 获取单个cell
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_cell_ex_async(
        self,
        request: rms_models.GetTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaCellResponse:
        """
        Description: 获取单个cell
        Summary: 获取单个cell
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_cell(
        self,
        request: rms_models.PagequeryTraasmetaCellRequest,
    ) -> rms_models.PagequeryTraasmetaCellResponse:
        """
        Description: 分页查询
        Summary: 分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_cell_ex(request, headers, runtime)

    async def pagequery_traasmeta_cell_async(
        self,
        request: rms_models.PagequeryTraasmetaCellRequest,
    ) -> rms_models.PagequeryTraasmetaCellResponse:
        """
        Description: 分页查询
        Summary: 分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_cell_ex_async(request, headers, runtime)

    def pagequery_traasmeta_cell_ex(
        self,
        request: rms_models.PagequeryTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaCellResponse:
        """
        Description: 分页查询
        Summary: 分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_cell_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaCellResponse:
        """
        Description: 分页查询
        Summary: 分页查询
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_traasmeta_hostmachine(
        self,
        request: rms_models.GetTraasmetaHostmachineRequest,
    ) -> rms_models.GetTraasmetaHostmachineResponse:
        """
        Description: 获取单个主机
        Summary: 获取单个主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_traasmeta_hostmachine_ex(request, headers, runtime)

    async def get_traasmeta_hostmachine_async(
        self,
        request: rms_models.GetTraasmetaHostmachineRequest,
    ) -> rms_models.GetTraasmetaHostmachineResponse:
        """
        Description: 获取单个主机
        Summary: 获取单个主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def get_traasmeta_hostmachine_ex(
        self,
        request: rms_models.GetTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaHostmachineResponse:
        """
        Description: 获取单个主机
        Summary: 获取单个主机
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.GetTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.GetTraasmetaHostmachineResponse:
        """
        Description: 获取单个主机
        Summary: 获取单个主机
        """
        UtilClient.validate_model(request)
        return rms_models.GetTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_traasmeta_hostmachine(
        self,
        request: rms_models.PagequeryTraasmetaHostmachineRequest,
    ) -> rms_models.PagequeryTraasmetaHostmachineResponse:
        """
        Description: 分页查询主机
        Summary: 分页查询主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_traasmeta_hostmachine_ex(request, headers, runtime)

    async def pagequery_traasmeta_hostmachine_async(
        self,
        request: rms_models.PagequeryTraasmetaHostmachineRequest,
    ) -> rms_models.PagequeryTraasmetaHostmachineResponse:
        """
        Description: 分页查询主机
        Summary: 分页查询主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def pagequery_traasmeta_hostmachine_ex(
        self,
        request: rms_models.PagequeryTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaHostmachineResponse:
        """
        Description: 分页查询主机
        Summary: 分页查询主机
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.PagequeryTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.PagequeryTraasmetaHostmachineResponse:
        """
        Description: 分页查询主机
        Summary: 分页查询主机
        """
        UtilClient.validate_model(request)
        return rms_models.PagequeryTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trace_detailtopology(
        self,
        request: rms_models.QueryTraceDetailtopologyRequest,
    ) -> rms_models.QueryTraceDetailtopologyResponse:
        """
        Description: 获取单链路详细拓扑
        Summary: 获取单链路详细拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trace_detailtopology_ex(request, headers, runtime)

    async def query_trace_detailtopology_async(
        self,
        request: rms_models.QueryTraceDetailtopologyRequest,
    ) -> rms_models.QueryTraceDetailtopologyResponse:
        """
        Description: 获取单链路详细拓扑
        Summary: 获取单链路详细拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trace_detailtopology_ex_async(request, headers, runtime)

    def query_trace_detailtopology_ex(
        self,
        request: rms_models.QueryTraceDetailtopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceDetailtopologyResponse:
        """
        Description: 获取单链路详细拓扑
        Summary: 获取单链路详细拓扑
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceDetailtopologyResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.trace.detailtopology.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trace_detailtopology_ex_async(
        self,
        request: rms_models.QueryTraceDetailtopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraceDetailtopologyResponse:
        """
        Description: 获取单链路详细拓扑
        Summary: 获取单链路详细拓扑
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraceDetailtopologyResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.trace.detailtopology.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_tenantconfig_spi(
        self,
        request: rms_models.SaveTenantconfigSpiRequest,
    ) -> rms_models.SaveTenantconfigSpiResponse:
        """
        Description: spi配置-保存spi
        Summary: spi配置-保存spi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_tenantconfig_spi_ex(request, headers, runtime)

    async def save_tenantconfig_spi_async(
        self,
        request: rms_models.SaveTenantconfigSpiRequest,
    ) -> rms_models.SaveTenantconfigSpiResponse:
        """
        Description: spi配置-保存spi
        Summary: spi配置-保存spi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_tenantconfig_spi_ex_async(request, headers, runtime)

    def save_tenantconfig_spi_ex(
        self,
        request: rms_models.SaveTenantconfigSpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SaveTenantconfigSpiResponse:
        """
        Description: spi配置-保存spi
        Summary: spi配置-保存spi
        """
        UtilClient.validate_model(request)
        return rms_models.SaveTenantconfigSpiResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.tenantconfig.spi.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_tenantconfig_spi_ex_async(
        self,
        request: rms_models.SaveTenantconfigSpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SaveTenantconfigSpiResponse:
        """
        Description: spi配置-保存spi
        Summary: spi配置-保存spi
        """
        UtilClient.validate_model(request)
        return rms_models.SaveTenantconfigSpiResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.tenantconfig.spi.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenantconfig_spi(
        self,
        request: rms_models.QueryTenantconfigSpiRequest,
    ) -> rms_models.QueryTenantconfigSpiResponse:
        """
        Description: spi配置-查询spi
        Summary: spi配置-查询spi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenantconfig_spi_ex(request, headers, runtime)

    async def query_tenantconfig_spi_async(
        self,
        request: rms_models.QueryTenantconfigSpiRequest,
    ) -> rms_models.QueryTenantconfigSpiResponse:
        """
        Description: spi配置-查询spi
        Summary: spi配置-查询spi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenantconfig_spi_ex_async(request, headers, runtime)

    def query_tenantconfig_spi_ex(
        self,
        request: rms_models.QueryTenantconfigSpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTenantconfigSpiResponse:
        """
        Description: spi配置-查询spi
        Summary: spi配置-查询spi
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTenantconfigSpiResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.tenantconfig.spi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenantconfig_spi_ex_async(
        self,
        request: rms_models.QueryTenantconfigSpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTenantconfigSpiResponse:
        """
        Description: spi配置-查询spi
        Summary: spi配置-查询spi
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTenantconfigSpiResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.tenantconfig.spi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_oneconsole_workspace(
        self,
        request: rms_models.ListOneconsoleWorkspaceRequest,
    ) -> rms_models.ListOneconsoleWorkspaceResponse:
        """
        Description: 获取当前用户能够访问的workspace
        Summary: 获取当前用户能够访问的workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_oneconsole_workspace_ex(request, headers, runtime)

    async def list_oneconsole_workspace_async(
        self,
        request: rms_models.ListOneconsoleWorkspaceRequest,
    ) -> rms_models.ListOneconsoleWorkspaceResponse:
        """
        Description: 获取当前用户能够访问的workspace
        Summary: 获取当前用户能够访问的workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_oneconsole_workspace_ex_async(request, headers, runtime)

    def list_oneconsole_workspace_ex(
        self,
        request: rms_models.ListOneconsoleWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListOneconsoleWorkspaceResponse:
        """
        Description: 获取当前用户能够访问的workspace
        Summary: 获取当前用户能够访问的workspace
        """
        UtilClient.validate_model(request)
        return rms_models.ListOneconsoleWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.oneconsole.workspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_oneconsole_workspace_ex_async(
        self,
        request: rms_models.ListOneconsoleWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListOneconsoleWorkspaceResponse:
        """
        Description: 获取当前用户能够访问的workspace
        Summary: 获取当前用户能够访问的workspace
        """
        UtilClient.validate_model(request)
        return rms_models.ListOneconsoleWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.oneconsole.workspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_tenantconfig(
        self,
        request: rms_models.DeleteTenantconfigRequest,
    ) -> rms_models.DeleteTenantconfigResponse:
        """
        Description: spi配置-删除
        Summary: spi配置-删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_tenantconfig_ex(request, headers, runtime)

    async def delete_tenantconfig_async(
        self,
        request: rms_models.DeleteTenantconfigRequest,
    ) -> rms_models.DeleteTenantconfigResponse:
        """
        Description: spi配置-删除
        Summary: spi配置-删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_tenantconfig_ex_async(request, headers, runtime)

    def delete_tenantconfig_ex(
        self,
        request: rms_models.DeleteTenantconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTenantconfigResponse:
        """
        Description: spi配置-删除
        Summary: spi配置-删除
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTenantconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.tenantconfig.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_tenantconfig_ex_async(
        self,
        request: rms_models.DeleteTenantconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTenantconfigResponse:
        """
        Description: spi配置-删除
        Summary: spi配置-删除
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTenantconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.tenantconfig.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenantconfig_token(
        self,
        request: rms_models.QueryTenantconfigTokenRequest,
    ) -> rms_models.QueryTenantconfigTokenResponse:
        """
        Description: spi配置-查询token
        Summary: spi配置-查询token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenantconfig_token_ex(request, headers, runtime)

    async def query_tenantconfig_token_async(
        self,
        request: rms_models.QueryTenantconfigTokenRequest,
    ) -> rms_models.QueryTenantconfigTokenResponse:
        """
        Description: spi配置-查询token
        Summary: spi配置-查询token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenantconfig_token_ex_async(request, headers, runtime)

    def query_tenantconfig_token_ex(
        self,
        request: rms_models.QueryTenantconfigTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTenantconfigTokenResponse:
        """
        Description: spi配置-查询token
        Summary: spi配置-查询token
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTenantconfigTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.tenantconfig.token.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenantconfig_token_ex_async(
        self,
        request: rms_models.QueryTenantconfigTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTenantconfigTokenResponse:
        """
        Description: spi配置-查询token
        Summary: spi配置-查询token
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTenantconfigTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.tenantconfig.token.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_tenantconfig_token(
        self,
        request: rms_models.SaveTenantconfigTokenRequest,
    ) -> rms_models.SaveTenantconfigTokenResponse:
        """
        Description: spi配置-保存token
        Summary: spi配置-保存token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_tenantconfig_token_ex(request, headers, runtime)

    async def save_tenantconfig_token_async(
        self,
        request: rms_models.SaveTenantconfigTokenRequest,
    ) -> rms_models.SaveTenantconfigTokenResponse:
        """
        Description: spi配置-保存token
        Summary: spi配置-保存token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_tenantconfig_token_ex_async(request, headers, runtime)

    def save_tenantconfig_token_ex(
        self,
        request: rms_models.SaveTenantconfigTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SaveTenantconfigTokenResponse:
        """
        Description: spi配置-保存token
        Summary: spi配置-保存token
        """
        UtilClient.validate_model(request)
        return rms_models.SaveTenantconfigTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.tenantconfig.token.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_tenantconfig_token_ex_async(
        self,
        request: rms_models.SaveTenantconfigTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.SaveTenantconfigTokenResponse:
        """
        Description: spi配置-保存token
        Summary: spi配置-保存token
        """
        UtilClient.validate_model(request)
        return rms_models.SaveTenantconfigTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.tenantconfig.token.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_entity(
        self,
        request: rms_models.QueryTraasmetaEntityRequest,
    ) -> rms_models.QueryTraasmetaEntityResponse:
        """
        Description: 查询元数据实体基本信息
        Summary: 查询元数据实体基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_entity_ex(request, headers, runtime)

    async def query_traasmeta_entity_async(
        self,
        request: rms_models.QueryTraasmetaEntityRequest,
    ) -> rms_models.QueryTraasmetaEntityResponse:
        """
        Description: 查询元数据实体基本信息
        Summary: 查询元数据实体基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_entity_ex_async(request, headers, runtime)

    def query_traasmeta_entity_ex(
        self,
        request: rms_models.QueryTraasmetaEntityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaEntityResponse:
        """
        Description: 查询元数据实体基本信息
        Summary: 查询元数据实体基本信息
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaEntityResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.entity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_entity_ex_async(
        self,
        request: rms_models.QueryTraasmetaEntityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaEntityResponse:
        """
        Description: 查询元数据实体基本信息
        Summary: 查询元数据实体基本信息
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaEntityResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.entity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_traasmeta_entityfield(
        self,
        request: rms_models.ListTraasmetaEntityfieldRequest,
    ) -> rms_models.ListTraasmetaEntityfieldResponse:
        """
        Description: 获取实体字段列表
        Summary: 获取实体字段列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_traasmeta_entityfield_ex(request, headers, runtime)

    async def list_traasmeta_entityfield_async(
        self,
        request: rms_models.ListTraasmetaEntityfieldRequest,
    ) -> rms_models.ListTraasmetaEntityfieldResponse:
        """
        Description: 获取实体字段列表
        Summary: 获取实体字段列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_traasmeta_entityfield_ex_async(request, headers, runtime)

    def list_traasmeta_entityfield_ex(
        self,
        request: rms_models.ListTraasmetaEntityfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListTraasmetaEntityfieldResponse:
        """
        Description: 获取实体字段列表
        Summary: 获取实体字段列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListTraasmetaEntityfieldResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.entityfield.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_traasmeta_entityfield_ex_async(
        self,
        request: rms_models.ListTraasmetaEntityfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListTraasmetaEntityfieldResponse:
        """
        Description: 获取实体字段列表
        Summary: 获取实体字段列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListTraasmetaEntityfieldResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.entityfield.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_entitytopo(
        self,
        request: rms_models.QueryTraasmetaEntitytopoRequest,
    ) -> rms_models.QueryTraasmetaEntitytopoResponse:
        """
        Description: 查询实体拓扑
        Summary: 查询实体拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_entitytopo_ex(request, headers, runtime)

    async def query_traasmeta_entitytopo_async(
        self,
        request: rms_models.QueryTraasmetaEntitytopoRequest,
    ) -> rms_models.QueryTraasmetaEntitytopoResponse:
        """
        Description: 查询实体拓扑
        Summary: 查询实体拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_entitytopo_ex_async(request, headers, runtime)

    def query_traasmeta_entitytopo_ex(
        self,
        request: rms_models.QueryTraasmetaEntitytopoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaEntitytopoResponse:
        """
        Description: 查询实体拓扑
        Summary: 查询实体拓扑
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaEntitytopoResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.entitytopo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_entitytopo_ex_async(
        self,
        request: rms_models.QueryTraasmetaEntitytopoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaEntitytopoResponse:
        """
        Description: 查询实体拓扑
        Summary: 查询实体拓扑
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaEntitytopoResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.entitytopo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_hostmachine(
        self,
        request: rms_models.AllTraasmetaHostmachineRequest,
    ) -> rms_models.AllTraasmetaHostmachineResponse:
        """
        Description: 获取所有主机
        Summary: 获取所有主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_hostmachine_ex(request, headers, runtime)

    async def all_traasmeta_hostmachine_async(
        self,
        request: rms_models.AllTraasmetaHostmachineRequest,
    ) -> rms_models.AllTraasmetaHostmachineResponse:
        """
        Description: 获取所有主机
        Summary: 获取所有主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def all_traasmeta_hostmachine_ex(
        self,
        request: rms_models.AllTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaHostmachineResponse:
        """
        Description: 获取所有主机
        Summary: 获取所有主机
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.AllTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaHostmachineResponse:
        """
        Description: 获取所有主机
        Summary: 获取所有主机
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_hostmachine(
        self,
        request: rms_models.BatchcreateTraasmetaHostmachineRequest,
    ) -> rms_models.BatchcreateTraasmetaHostmachineResponse:
        """
        Description: 批量创建主机
        Summary: 批量创建主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_hostmachine_ex(request, headers, runtime)

    async def batchcreate_traasmeta_hostmachine_async(
        self,
        request: rms_models.BatchcreateTraasmetaHostmachineRequest,
    ) -> rms_models.BatchcreateTraasmetaHostmachineResponse:
        """
        Description: 批量创建主机
        Summary: 批量创建主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_hostmachine_ex(
        self,
        request: rms_models.BatchcreateTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaHostmachineResponse:
        """
        Description: 批量创建主机
        Summary: 批量创建主机
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaHostmachineResponse:
        """
        Description: 批量创建主机
        Summary: 批量创建主机
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_hostmachine(
        self,
        request: rms_models.BatchdeleteTraasmetaHostmachineRequest,
    ) -> rms_models.BatchdeleteTraasmetaHostmachineResponse:
        """
        Description: 批量删除主机
        Summary: 批量删除主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_hostmachine_ex(request, headers, runtime)

    async def batchdelete_traasmeta_hostmachine_async(
        self,
        request: rms_models.BatchdeleteTraasmetaHostmachineRequest,
    ) -> rms_models.BatchdeleteTraasmetaHostmachineResponse:
        """
        Description: 批量删除主机
        Summary: 批量删除主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_hostmachine_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaHostmachineResponse:
        """
        Description: 批量删除主机
        Summary: 批量删除主机
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaHostmachineResponse:
        """
        Description: 批量删除主机
        Summary: 批量删除主机
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_hostmachine(
        self,
        request: rms_models.BatchqueryTraasmetaHostmachineRequest,
    ) -> rms_models.BatchqueryTraasmetaHostmachineResponse:
        """
        Description: 批量查询主机
        Summary: 批量查询主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_hostmachine_ex(request, headers, runtime)

    async def batchquery_traasmeta_hostmachine_async(
        self,
        request: rms_models.BatchqueryTraasmetaHostmachineRequest,
    ) -> rms_models.BatchqueryTraasmetaHostmachineResponse:
        """
        Description: 批量查询主机
        Summary: 批量查询主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def batchquery_traasmeta_hostmachine_ex(
        self,
        request: rms_models.BatchqueryTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaHostmachineResponse:
        """
        Description: 批量查询主机
        Summary: 批量查询主机
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaHostmachineResponse:
        """
        Description: 批量查询主机
        Summary: 批量查询主机
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_hostmachine(
        self,
        request: rms_models.CreateTraasmetaHostmachineRequest,
    ) -> rms_models.CreateTraasmetaHostmachineResponse:
        """
        Description: 创建单个主机
        Summary: 创建单个主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_hostmachine_ex(request, headers, runtime)

    async def create_traasmeta_hostmachine_async(
        self,
        request: rms_models.CreateTraasmetaHostmachineRequest,
    ) -> rms_models.CreateTraasmetaHostmachineResponse:
        """
        Description: 创建单个主机
        Summary: 创建单个主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def create_traasmeta_hostmachine_ex(
        self,
        request: rms_models.CreateTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaHostmachineResponse:
        """
        Description: 创建单个主机
        Summary: 创建单个主机
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.CreateTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaHostmachineResponse:
        """
        Description: 创建单个主机
        Summary: 创建单个主机
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_hostmachine(
        self,
        request: rms_models.DeleteTraasmetaHostmachineRequest,
    ) -> rms_models.DeleteTraasmetaHostmachineResponse:
        """
        Description: 删除主机
        Summary: 删除主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_hostmachine_ex(request, headers, runtime)

    async def delete_traasmeta_hostmachine_async(
        self,
        request: rms_models.DeleteTraasmetaHostmachineRequest,
    ) -> rms_models.DeleteTraasmetaHostmachineResponse:
        """
        Description: 删除主机
        Summary: 删除主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def delete_traasmeta_hostmachine_ex(
        self,
        request: rms_models.DeleteTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaHostmachineResponse:
        """
        Description: 删除主机
        Summary: 删除主机
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.DeleteTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaHostmachineResponse:
        """
        Description: 删除主机
        Summary: 删除主机
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_hostmachine(
        self,
        request: rms_models.QueryTraasmetaHostmachineRequest,
    ) -> rms_models.QueryTraasmetaHostmachineResponse:
        """
        Description: 查询主机
        Summary: 查询主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_hostmachine_ex(request, headers, runtime)

    async def query_traasmeta_hostmachine_async(
        self,
        request: rms_models.QueryTraasmetaHostmachineRequest,
    ) -> rms_models.QueryTraasmetaHostmachineResponse:
        """
        Description: 查询主机
        Summary: 查询主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def query_traasmeta_hostmachine_ex(
        self,
        request: rms_models.QueryTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaHostmachineResponse:
        """
        Description: 查询主机
        Summary: 查询主机
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.QueryTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaHostmachineResponse:
        """
        Description: 查询主机
        Summary: 查询主机
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_hostmachine(
        self,
        request: rms_models.UpdateTraasmetaHostmachineRequest,
    ) -> rms_models.UpdateTraasmetaHostmachineResponse:
        """
        Description: 更新主机
        Summary: 更新主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_hostmachine_ex(request, headers, runtime)

    async def update_traasmeta_hostmachine_async(
        self,
        request: rms_models.UpdateTraasmetaHostmachineRequest,
    ) -> rms_models.UpdateTraasmetaHostmachineResponse:
        """
        Description: 更新主机
        Summary: 更新主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_hostmachine_ex_async(request, headers, runtime)

    def update_traasmeta_hostmachine_ex(
        self,
        request: rms_models.UpdateTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaHostmachineResponse:
        """
        Description: 更新主机
        Summary: 更新主机
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaHostmachineResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.hostmachine.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_hostmachine_ex_async(
        self,
        request: rms_models.UpdateTraasmetaHostmachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaHostmachineResponse:
        """
        Description: 更新主机
        Summary: 更新主机
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaHostmachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.hostmachine.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_traasmeta_cell(
        self,
        request: rms_models.BatchcreateTraasmetaCellRequest,
    ) -> rms_models.BatchcreateTraasmetaCellResponse:
        """
        Description: 批量创建cell
        Summary: 批量创建cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_traasmeta_cell_ex(request, headers, runtime)

    async def batchcreate_traasmeta_cell_async(
        self,
        request: rms_models.BatchcreateTraasmetaCellRequest,
    ) -> rms_models.BatchcreateTraasmetaCellResponse:
        """
        Description: 批量创建cell
        Summary: 批量创建cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_traasmeta_cell_ex_async(request, headers, runtime)

    def batchcreate_traasmeta_cell_ex(
        self,
        request: rms_models.BatchcreateTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaCellResponse:
        """
        Description: 批量创建cell
        Summary: 批量创建cell
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_traasmeta_cell_ex_async(
        self,
        request: rms_models.BatchcreateTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchcreateTraasmetaCellResponse:
        """
        Description: 批量创建cell
        Summary: 批量创建cell
        """
        UtilClient.validate_model(request)
        return rms_models.BatchcreateTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_traasmeta_cell(
        self,
        request: rms_models.BatchdeleteTraasmetaCellRequest,
    ) -> rms_models.BatchdeleteTraasmetaCellResponse:
        """
        Description: 批量删除cell
        Summary: 批量删除cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_traasmeta_cell_ex(request, headers, runtime)

    async def batchdelete_traasmeta_cell_async(
        self,
        request: rms_models.BatchdeleteTraasmetaCellRequest,
    ) -> rms_models.BatchdeleteTraasmetaCellResponse:
        """
        Description: 批量删除cell
        Summary: 批量删除cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_traasmeta_cell_ex_async(request, headers, runtime)

    def batchdelete_traasmeta_cell_ex(
        self,
        request: rms_models.BatchdeleteTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaCellResponse:
        """
        Description: 批量删除cell
        Summary: 批量删除cell
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_traasmeta_cell_ex_async(
        self,
        request: rms_models.BatchdeleteTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchdeleteTraasmetaCellResponse:
        """
        Description: 批量删除cell
        Summary: 批量删除cell
        """
        UtilClient.validate_model(request)
        return rms_models.BatchdeleteTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_traasmeta_cell(
        self,
        request: rms_models.BatchqueryTraasmetaCellRequest,
    ) -> rms_models.BatchqueryTraasmetaCellResponse:
        """
        Description: 批量查询cell
        Summary: 批量查询cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_traasmeta_cell_ex(request, headers, runtime)

    async def batchquery_traasmeta_cell_async(
        self,
        request: rms_models.BatchqueryTraasmetaCellRequest,
    ) -> rms_models.BatchqueryTraasmetaCellResponse:
        """
        Description: 批量查询cell
        Summary: 批量查询cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_traasmeta_cell_ex_async(request, headers, runtime)

    def batchquery_traasmeta_cell_ex(
        self,
        request: rms_models.BatchqueryTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaCellResponse:
        """
        Description: 批量查询cell
        Summary: 批量查询cell
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_traasmeta_cell_ex_async(
        self,
        request: rms_models.BatchqueryTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.BatchqueryTraasmetaCellResponse:
        """
        Description: 批量查询cell
        Summary: 批量查询cell
        """
        UtilClient.validate_model(request)
        return rms_models.BatchqueryTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_traasmeta_cell(
        self,
        request: rms_models.UpdateTraasmetaCellRequest,
    ) -> rms_models.UpdateTraasmetaCellResponse:
        """
        Description: 更新cell
        Summary: 更新cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_traasmeta_cell_ex(request, headers, runtime)

    async def update_traasmeta_cell_async(
        self,
        request: rms_models.UpdateTraasmetaCellRequest,
    ) -> rms_models.UpdateTraasmetaCellResponse:
        """
        Description: 更新cell
        Summary: 更新cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_traasmeta_cell_ex_async(request, headers, runtime)

    def update_traasmeta_cell_ex(
        self,
        request: rms_models.UpdateTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaCellResponse:
        """
        Description: 更新cell
        Summary: 更新cell
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_traasmeta_cell_ex_async(
        self,
        request: rms_models.UpdateTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.UpdateTraasmetaCellResponse:
        """
        Description: 更新cell
        Summary: 更新cell
        """
        UtilClient.validate_model(request)
        return rms_models.UpdateTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_traasmeta_cell(
        self,
        request: rms_models.CreateTraasmetaCellRequest,
    ) -> rms_models.CreateTraasmetaCellResponse:
        """
        Description: 创建单个cell
        Summary: 创建单个cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_traasmeta_cell_ex(request, headers, runtime)

    async def create_traasmeta_cell_async(
        self,
        request: rms_models.CreateTraasmetaCellRequest,
    ) -> rms_models.CreateTraasmetaCellResponse:
        """
        Description: 创建单个cell
        Summary: 创建单个cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_traasmeta_cell_ex_async(request, headers, runtime)

    def create_traasmeta_cell_ex(
        self,
        request: rms_models.CreateTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaCellResponse:
        """
        Description: 创建单个cell
        Summary: 创建单个cell
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_traasmeta_cell_ex_async(
        self,
        request: rms_models.CreateTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.CreateTraasmetaCellResponse:
        """
        Description: 创建单个cell
        Summary: 创建单个cell
        """
        UtilClient.validate_model(request)
        return rms_models.CreateTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_traasmeta_cell(
        self,
        request: rms_models.DeleteTraasmetaCellRequest,
    ) -> rms_models.DeleteTraasmetaCellResponse:
        """
        Description: 删除单个cell
        Summary: 删除单个cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_traasmeta_cell_ex(request, headers, runtime)

    async def delete_traasmeta_cell_async(
        self,
        request: rms_models.DeleteTraasmetaCellRequest,
    ) -> rms_models.DeleteTraasmetaCellResponse:
        """
        Description: 删除单个cell
        Summary: 删除单个cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_traasmeta_cell_ex_async(request, headers, runtime)

    def delete_traasmeta_cell_ex(
        self,
        request: rms_models.DeleteTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaCellResponse:
        """
        Description: 删除单个cell
        Summary: 删除单个cell
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_traasmeta_cell_ex_async(
        self,
        request: rms_models.DeleteTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.DeleteTraasmetaCellResponse:
        """
        Description: 删除单个cell
        Summary: 删除单个cell
        """
        UtilClient.validate_model(request)
        return rms_models.DeleteTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_traasmeta_cell(
        self,
        request: rms_models.AllTraasmetaCellRequest,
    ) -> rms_models.AllTraasmetaCellResponse:
        """
        Description: 获取所有cell
        Summary: 获取所有cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_traasmeta_cell_ex(request, headers, runtime)

    async def all_traasmeta_cell_async(
        self,
        request: rms_models.AllTraasmetaCellRequest,
    ) -> rms_models.AllTraasmetaCellResponse:
        """
        Description: 获取所有cell
        Summary: 获取所有cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_traasmeta_cell_ex_async(request, headers, runtime)

    def all_traasmeta_cell_ex(
        self,
        request: rms_models.AllTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaCellResponse:
        """
        Description: 获取所有cell
        Summary: 获取所有cell
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_traasmeta_cell_ex_async(
        self,
        request: rms_models.AllTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.AllTraasmetaCellResponse:
        """
        Description: 获取所有cell
        Summary: 获取所有cell
        """
        UtilClient.validate_model(request)
        return rms_models.AllTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_traasmeta_cell(
        self,
        request: rms_models.QueryTraasmetaCellRequest,
    ) -> rms_models.QueryTraasmetaCellResponse:
        """
        Description: 查询cell
        Summary: 查询cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_traasmeta_cell_ex(request, headers, runtime)

    async def query_traasmeta_cell_async(
        self,
        request: rms_models.QueryTraasmetaCellRequest,
    ) -> rms_models.QueryTraasmetaCellResponse:
        """
        Description: 查询cell
        Summary: 查询cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_traasmeta_cell_ex_async(request, headers, runtime)

    def query_traasmeta_cell_ex(
        self,
        request: rms_models.QueryTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaCellResponse:
        """
        Description: 查询cell
        Summary: 查询cell
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.traasmeta.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_traasmeta_cell_ex_async(
        self,
        request: rms_models.QueryTraasmetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.QueryTraasmetaCellResponse:
        """
        Description: 查询cell
        Summary: 查询cell
        """
        UtilClient.validate_model(request)
        return rms_models.QueryTraasmetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.traasmeta.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
