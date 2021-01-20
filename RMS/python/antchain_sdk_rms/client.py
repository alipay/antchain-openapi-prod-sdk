# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from typing import Dict

from antchain_sdk_rms import models as rms_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from antchain_alipay_util.client import Client as AntchainUtilClient
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
        self._read_timeout = config.read_timeout
        self._connect_timeout = config.connect_timeout
        self._http_proxy = config.http_proxy
        self._https_proxy = config.https_proxy
        self._no_proxy = config.no_proxy
        self._socks_5proxy = config.socks_5proxy
        self._socks_5net_work = config.socks_5net_work
        self._max_idle_conns = config.max_idle_conns

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
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl,
            # AiExtraAttr
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.1.0'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'undefined'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl,
            # AiExtraAttr
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.1.0'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'undefined'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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

    def list_app(
        self,
        request: rms_models.ListAppRequest,
    ) -> rms_models.ListAppResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_app_ex(request, headers, runtime)

    async def list_app_async(
        self,
        request: rms_models.ListAppRequest,
    ) -> rms_models.ListAppResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_app_ex_async(request, headers, runtime)

    def list_app_ex(
        self,
        request: rms_models.ListAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAppResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAppResponse().from_map(
            self.do_request('1.0', 'antcloud.monitor.app.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_app_ex_async(
        self,
        request: rms_models.ListAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> rms_models.ListAppResponse:
        """
        Description: 获取应用列表
        Summary: 获取应用列表
        """
        UtilClient.validate_model(request)
        return rms_models.ListAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.monitor.app.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
