# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_245215eadadd4dc9bba177d6ba6d593d import models as ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models
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
        config: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.Config,
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
            # 字幕单句配置
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
                    'sdk_version': '1.3.4',
                    '_prod_code': 'ak_245215eadadd4dc9bba177d6ba6d593d',
                    '_prod_channel': 'saas'
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
            # 字幕单句配置
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
                    'sdk_version': '1.3.4',
                    '_prod_code': 'ak_245215eadadd4dc9bba177d6ba6d593d',
                    '_prod_channel': 'saas'
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

    def list_universalsaas_digitalhuman_video_voice(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceResponse:
        """
        Description: 数字人音色列表
        Summary: 数字人音色列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_video_voice_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_video_voice_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceResponse:
        """
        Description: 数字人音色列表
        Summary: 数字人音色列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_video_voice_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_video_voice_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceResponse:
        """
        Description: 数字人音色列表
        Summary: 数字人音色列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.video.voice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_video_voice_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceResponse:
        """
        Description: 数字人音色列表
        Summary: 数字人音色列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoVoiceResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.video.voice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_video_profile(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileResponse:
        """
        Description: 数字人短视频形象列表
        Summary: 数字人短视频形象列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_video_profile_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_video_profile_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileResponse:
        """
        Description: 数字人短视频形象列表
        Summary: 数字人短视频形象列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_video_profile_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_video_profile_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileResponse:
        """
        Description: 数字人短视频形象列表
        Summary: 数字人短视频形象列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.video.profile.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_video_profile_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileResponse:
        """
        Description: 数字人短视频形象列表
        Summary: 数字人短视频形象列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.ListUniversalsaasDigitalhumanVideoProfileResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.video.profile.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_universalsaas_digitalhuman_video_task(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务生成
        Summary: 视频合成任务生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_universalsaas_digitalhuman_video_task_ex(request, headers, runtime)

    async def create_universalsaas_digitalhuman_video_task_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务生成
        Summary: 视频合成任务生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_universalsaas_digitalhuman_video_task_ex_async(request, headers, runtime)

    def create_universalsaas_digitalhuman_video_task_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务生成
        Summary: 视频合成任务生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.video.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_universalsaas_digitalhuman_video_task_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务生成
        Summary: 视频合成任务生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVideoTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.video.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_video_task(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务查询
        Summary: 视频合成任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_video_task_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_video_task_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务查询
        Summary: 视频合成任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_video_task_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_video_task_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务查询
        Summary: 视频合成任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.video.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_video_task_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskResponse:
        """
        Description: 视频合成任务查询
        Summary: 视频合成任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVideoTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.video.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_universalsaas_digitalhuman_voice(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人短文本试听接口
        Summary: 数字人短文本试听接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_universalsaas_digitalhuman_voice_ex(request, headers, runtime)

    async def create_universalsaas_digitalhuman_voice_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人短文本试听接口
        Summary: 数字人短文本试听接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_universalsaas_digitalhuman_voice_ex_async(request, headers, runtime)

    def create_universalsaas_digitalhuman_voice_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人短文本试听接口
        Summary: 数字人短文本试听接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_universalsaas_digitalhuman_voice_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人短文本试听接口
        Summary: 数字人短文本试听接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_universalsaas_digitalhuman_avatar(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarResponse:
        """
        Description: 极速训练数字人分身，返回modelId
        Summary: 训练数字人分身
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_universalsaas_digitalhuman_avatar_ex(request, headers, runtime)

    async def clone_universalsaas_digitalhuman_avatar_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarResponse:
        """
        Description: 极速训练数字人分身，返回modelId
        Summary: 训练数字人分身
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_universalsaas_digitalhuman_avatar_ex_async(request, headers, runtime)

    def clone_universalsaas_digitalhuman_avatar_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarResponse:
        """
        Description: 极速训练数字人分身，返回modelId
        Summary: 训练数字人分身
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.avatar.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_universalsaas_digitalhuman_avatar_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarResponse:
        """
        Description: 极速训练数字人分身，返回modelId
        Summary: 训练数字人分身
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.avatar.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_universalsaas_digitalhuman_avatar_voice(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceResponse:
        """
        Description: 音色克隆
        Summary: 音色克隆
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_universalsaas_digitalhuman_avatar_voice_ex(request, headers, runtime)

    async def clone_universalsaas_digitalhuman_avatar_voice_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceResponse:
        """
        Description: 音色克隆
        Summary: 音色克隆
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_universalsaas_digitalhuman_avatar_voice_ex_async(request, headers, runtime)

    def clone_universalsaas_digitalhuman_avatar_voice_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceResponse:
        """
        Description: 音色克隆
        Summary: 音色克隆
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.avatar.voice.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_universalsaas_digitalhuman_avatar_voice_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceResponse:
        """
        Description: 音色克隆
        Summary: 音色克隆
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CloneUniversalsaasDigitalhumanAvatarVoiceResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.avatar.voice.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_clone_task(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskResponse:
        """
        Description: 训练数字人分身任务查询
        Summary: 训练数字人分身任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_clone_task_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_clone_task_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskResponse:
        """
        Description: 训练数字人分身任务查询
        Summary: 训练数字人分身任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_clone_task_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_clone_task_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskResponse:
        """
        Description: 训练数字人分身任务查询
        Summary: 训练数字人分身任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.clone.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_clone_task_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskResponse:
        """
        Description: 训练数字人分身任务查询
        Summary: 训练数字人分身任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanCloneTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.clone.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_universalsaas_digitalhuman_voice_task(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 数字人音频生成接口
        Summary: 数字人音频生成接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_universalsaas_digitalhuman_voice_task_ex(request, headers, runtime)

    async def create_universalsaas_digitalhuman_voice_task_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 数字人音频生成接口
        Summary: 数字人音频生成接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_universalsaas_digitalhuman_voice_task_ex_async(request, headers, runtime)

    def create_universalsaas_digitalhuman_voice_task_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 数字人音频生成接口
        Summary: 数字人音频生成接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_universalsaas_digitalhuman_voice_task_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 数字人音频生成接口
        Summary: 数字人音频生成接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CreateUniversalsaasDigitalhumanVoiceTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_voice_task(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 音频生成任务查询接口
        Summary: 音频生成任务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_voice_task_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_voice_task_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 音频生成任务查询接口
        Summary: 音频生成任务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_voice_task_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_voice_task_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 音频生成任务查询接口
        Summary: 音频生成任务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_voice_task_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskResponse:
        """
        Description: 音频生成任务查询接口
        Summary: 音频生成任务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceTaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_avatar_action(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionResponse:
        """
        Description: 获取数字人动作序列接口
        Summary: 获取数字人动作序列接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_avatar_action_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_avatar_action_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionResponse:
        """
        Description: 获取数字人动作序列接口
        Summary: 获取数字人动作序列接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_avatar_action_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_avatar_action_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionResponse:
        """
        Description: 获取数字人动作序列接口
        Summary: 获取数字人动作序列接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.avatar.action.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_avatar_action_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionResponse:
        """
        Description: 获取数字人动作序列接口
        Summary: 获取数字人动作序列接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAvatarActionResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.avatar.action.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_universalsaas_digitalhuman_order(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderResponse:
        """
        Description: 数字人订单上报接口
        Summary: 数字人订单上报接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_universalsaas_digitalhuman_order_ex(request, headers, runtime)

    async def submit_universalsaas_digitalhuman_order_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderResponse:
        """
        Description: 数字人订单上报接口
        Summary: 数字人订单上报接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_universalsaas_digitalhuman_order_ex_async(request, headers, runtime)

    def submit_universalsaas_digitalhuman_order_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderResponse:
        """
        Description: 数字人订单上报接口
        Summary: 数字人订单上报接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.order.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_universalsaas_digitalhuman_order_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderResponse:
        """
        Description: 数字人订单上报接口
        Summary: 数字人订单上报接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.SubmitUniversalsaasDigitalhumanOrderResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.order.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_universalsaas_digitalhuman_voice_noise(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务创建
        Summary: 音色检测任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_universalsaas_digitalhuman_voice_noise_ex(request, headers, runtime)

    async def count_universalsaas_digitalhuman_voice_noise_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务创建
        Summary: 音色检测任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_universalsaas_digitalhuman_voice_noise_ex_async(request, headers, runtime)

    def count_universalsaas_digitalhuman_voice_noise_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务创建
        Summary: 音色检测任务创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.noise.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_universalsaas_digitalhuman_voice_noise_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务创建
        Summary: 音色检测任务创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.CountUniversalsaasDigitalhumanVoiceNoiseResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.noise.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_voice_noise(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务查询接口
        Summary: 音色检测任务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_voice_noise_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_voice_noise_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务查询接口
        Summary: 音色检测任务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_voice_noise_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_voice_noise_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务查询接口
        Summary: 音色检测任务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.noise.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_voice_noise_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseResponse:
        """
        Description: 音色检测任务查询接口
        Summary: 音色检测任务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanVoiceNoiseResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.noise.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_universalsaas_digitalhuman_audio_captions(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务创建
        Summary: 音频字幕识别任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_universalsaas_digitalhuman_audio_captions_ex(request, headers, runtime)

    async def recognize_universalsaas_digitalhuman_audio_captions_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务创建
        Summary: 音频字幕识别任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_universalsaas_digitalhuman_audio_captions_ex_async(request, headers, runtime)

    def recognize_universalsaas_digitalhuman_audio_captions_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务创建
        Summary: 音频字幕识别任务创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.audio.captions.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_universalsaas_digitalhuman_audio_captions_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务创建
        Summary: 音频字幕识别任务创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.audio.captions.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_audio_captions(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务结果查询
        Summary: 音频字幕识别任务结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_audio_captions_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_audio_captions_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsRequest,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务结果查询
        Summary: 音频字幕识别任务结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_audio_captions_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_audio_captions_ex(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务结果查询
        Summary: 音频字幕识别任务结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.audio.captions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_audio_captions_ex_async(
        self,
        request: ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsResponse:
        """
        Description: 音频字幕识别任务结果查询
        Summary: 音频字幕识别任务结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__245215eadadd_4dc_9bba_177d_6ba_6d_593d_models.QueryUniversalsaasDigitalhumanAudioCaptionsResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.audio.captions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
