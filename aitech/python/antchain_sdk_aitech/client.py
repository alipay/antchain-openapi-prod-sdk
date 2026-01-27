# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_aitech import models as aitech_models
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
        config: aitech_models.Config,
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
            # 二维码详情
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
                    'sdk_version': '1.1.57',
                    '_prod_code': 'AITECH',
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
            # 二维码详情
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
                    'sdk_version': '1.1.57',
                    '_prod_code': 'AITECH',
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

    def apply_audit_image(
        self,
        request: aitech_models.ApplyAuditImageRequest,
    ) -> aitech_models.ApplyAuditImageResponse:
        """
        Description: LOGO/二维码审核
        Summary: LOGO/二维码审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_audit_image_ex(request, headers, runtime)

    async def apply_audit_image_async(
        self,
        request: aitech_models.ApplyAuditImageRequest,
    ) -> aitech_models.ApplyAuditImageResponse:
        """
        Description: LOGO/二维码审核
        Summary: LOGO/二维码审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_audit_image_ex_async(request, headers, runtime)

    def apply_audit_image_ex(
        self,
        request: aitech_models.ApplyAuditImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditImageResponse:
        """
        Description: LOGO/二维码审核
        Summary: LOGO/二维码审核
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditImageResponse(),
            self.do_request('1.0', 'aitech.comm.audit.image.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_audit_image_ex_async(
        self,
        request: aitech_models.ApplyAuditImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditImageResponse:
        """
        Description: LOGO/二维码审核
        Summary: LOGO/二维码审核
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditImageResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.image.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_sofa_audit(
        self,
        request: aitech_models.CallbackSofaAuditRequest,
    ) -> aitech_models.CallbackSofaAuditResponse:
        """
        Description: 主站审核能力回调
        Summary: 主站审核能力回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_sofa_audit_ex(request, headers, runtime)

    async def callback_sofa_audit_async(
        self,
        request: aitech_models.CallbackSofaAuditRequest,
    ) -> aitech_models.CallbackSofaAuditResponse:
        """
        Description: 主站审核能力回调
        Summary: 主站审核能力回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_sofa_audit_ex_async(request, headers, runtime)

    def callback_sofa_audit_ex(
        self,
        request: aitech_models.CallbackSofaAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackSofaAuditResponse:
        """
        Description: 主站审核能力回调
        Summary: 主站审核能力回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackSofaAuditResponse(),
            self.do_request('1.0', 'aitech.comm.sofa.audit.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_sofa_audit_ex_async(
        self,
        request: aitech_models.CallbackSofaAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackSofaAuditResponse:
        """
        Description: 主站审核能力回调
        Summary: 主站审核能力回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackSofaAuditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.sofa.audit.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_text(
        self,
        request: aitech_models.SubmitAuditTextRequest,
    ) -> aitech_models.SubmitAuditTextResponse:
        """
        Description: 文本审核入审
        Summary: 文本审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_text_ex(request, headers, runtime)

    async def submit_audit_text_async(
        self,
        request: aitech_models.SubmitAuditTextRequest,
    ) -> aitech_models.SubmitAuditTextResponse:
        """
        Description: 文本审核入审
        Summary: 文本审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_text_ex_async(request, headers, runtime)

    def submit_audit_text_ex(
        self,
        request: aitech_models.SubmitAuditTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditTextResponse:
        """
        Description: 文本审核入审
        Summary: 文本审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditTextResponse(),
            self.do_request('1.0', 'aitech.comm.audit.text.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_text_ex_async(
        self,
        request: aitech_models.SubmitAuditTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditTextResponse:
        """
        Description: 文本审核入审
        Summary: 文本审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditTextResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.text.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_text(
        self,
        request: aitech_models.QueryAuditTextRequest,
    ) -> aitech_models.QueryAuditTextResponse:
        """
        Description: 文本审核查询
        Summary: 文本审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_text_ex(request, headers, runtime)

    async def query_audit_text_async(
        self,
        request: aitech_models.QueryAuditTextRequest,
    ) -> aitech_models.QueryAuditTextResponse:
        """
        Description: 文本审核查询
        Summary: 文本审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_text_ex_async(request, headers, runtime)

    def query_audit_text_ex(
        self,
        request: aitech_models.QueryAuditTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditTextResponse:
        """
        Description: 文本审核查询
        Summary: 文本审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditTextResponse(),
            self.do_request('1.0', 'aitech.comm.audit.text.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_text_ex_async(
        self,
        request: aitech_models.QueryAuditTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditTextResponse:
        """
        Description: 文本审核查询
        Summary: 文本审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditTextResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.text.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_image(
        self,
        request: aitech_models.SubmitAuditImageRequest,
    ) -> aitech_models.SubmitAuditImageResponse:
        """
        Description: 图片审核入审
        Summary: 图片审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_image_ex(request, headers, runtime)

    async def submit_audit_image_async(
        self,
        request: aitech_models.SubmitAuditImageRequest,
    ) -> aitech_models.SubmitAuditImageResponse:
        """
        Description: 图片审核入审
        Summary: 图片审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_image_ex_async(request, headers, runtime)

    def submit_audit_image_ex(
        self,
        request: aitech_models.SubmitAuditImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditImageResponse:
        """
        Description: 图片审核入审
        Summary: 图片审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditImageResponse(),
            self.do_request('1.0', 'aitech.comm.audit.image.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_image_ex_async(
        self,
        request: aitech_models.SubmitAuditImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditImageResponse:
        """
        Description: 图片审核入审
        Summary: 图片审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditImageResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.image.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_image(
        self,
        request: aitech_models.QueryAuditImageRequest,
    ) -> aitech_models.QueryAuditImageResponse:
        """
        Description: 图片审核查询
        Summary: 图片审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_image_ex(request, headers, runtime)

    async def query_audit_image_async(
        self,
        request: aitech_models.QueryAuditImageRequest,
    ) -> aitech_models.QueryAuditImageResponse:
        """
        Description: 图片审核查询
        Summary: 图片审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_image_ex_async(request, headers, runtime)

    def query_audit_image_ex(
        self,
        request: aitech_models.QueryAuditImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditImageResponse:
        """
        Description: 图片审核查询
        Summary: 图片审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditImageResponse(),
            self.do_request('1.0', 'aitech.comm.audit.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_image_ex_async(
        self,
        request: aitech_models.QueryAuditImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditImageResponse:
        """
        Description: 图片审核查询
        Summary: 图片审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditImageResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_audio(
        self,
        request: aitech_models.SubmitAuditAudioRequest,
    ) -> aitech_models.SubmitAuditAudioResponse:
        """
        Description: 音频审核入审
        Summary: 音频审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_audio_ex(request, headers, runtime)

    async def submit_audit_audio_async(
        self,
        request: aitech_models.SubmitAuditAudioRequest,
    ) -> aitech_models.SubmitAuditAudioResponse:
        """
        Description: 音频审核入审
        Summary: 音频审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_audio_ex_async(request, headers, runtime)

    def submit_audit_audio_ex(
        self,
        request: aitech_models.SubmitAuditAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditAudioResponse:
        """
        Description: 音频审核入审
        Summary: 音频审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditAudioResponse(),
            self.do_request('1.0', 'aitech.comm.audit.audio.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_audio_ex_async(
        self,
        request: aitech_models.SubmitAuditAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditAudioResponse:
        """
        Description: 音频审核入审
        Summary: 音频审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditAudioResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.audio.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_audio(
        self,
        request: aitech_models.QueryAuditAudioRequest,
    ) -> aitech_models.QueryAuditAudioResponse:
        """
        Description: 音频审核查询
        Summary: 音频审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_audio_ex(request, headers, runtime)

    async def query_audit_audio_async(
        self,
        request: aitech_models.QueryAuditAudioRequest,
    ) -> aitech_models.QueryAuditAudioResponse:
        """
        Description: 音频审核查询
        Summary: 音频审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_audio_ex_async(request, headers, runtime)

    def query_audit_audio_ex(
        self,
        request: aitech_models.QueryAuditAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditAudioResponse:
        """
        Description: 音频审核查询
        Summary: 音频审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditAudioResponse(),
            self.do_request('1.0', 'aitech.comm.audit.audio.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_audio_ex_async(
        self,
        request: aitech_models.QueryAuditAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditAudioResponse:
        """
        Description: 音频审核查询
        Summary: 音频审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditAudioResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.audio.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_video(
        self,
        request: aitech_models.SubmitAuditVideoRequest,
    ) -> aitech_models.SubmitAuditVideoResponse:
        """
        Description: 视频审核入审
        Summary: 视频审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_video_ex(request, headers, runtime)

    async def submit_audit_video_async(
        self,
        request: aitech_models.SubmitAuditVideoRequest,
    ) -> aitech_models.SubmitAuditVideoResponse:
        """
        Description: 视频审核入审
        Summary: 视频审核入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_video_ex_async(request, headers, runtime)

    def submit_audit_video_ex(
        self,
        request: aitech_models.SubmitAuditVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditVideoResponse:
        """
        Description: 视频审核入审
        Summary: 视频审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditVideoResponse(),
            self.do_request('1.0', 'aitech.comm.audit.video.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_video_ex_async(
        self,
        request: aitech_models.SubmitAuditVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditVideoResponse:
        """
        Description: 视频审核入审
        Summary: 视频审核入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditVideoResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.video.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_video(
        self,
        request: aitech_models.QueryAuditVideoRequest,
    ) -> aitech_models.QueryAuditVideoResponse:
        """
        Description: 视频审核查询
        Summary: 视频审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_video_ex(request, headers, runtime)

    async def query_audit_video_async(
        self,
        request: aitech_models.QueryAuditVideoRequest,
    ) -> aitech_models.QueryAuditVideoResponse:
        """
        Description: 视频审核查询
        Summary: 视频审核查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_video_ex_async(request, headers, runtime)

    def query_audit_video_ex(
        self,
        request: aitech_models.QueryAuditVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditVideoResponse:
        """
        Description: 视频审核查询
        Summary: 视频审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditVideoResponse(),
            self.do_request('1.0', 'aitech.comm.audit.video.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_video_ex_async(
        self,
        request: aitech_models.QueryAuditVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditVideoResponse:
        """
        Description: 视频审核查询
        Summary: 视频审核查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditVideoResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.video.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_audit_text(
        self,
        request: aitech_models.ApplyAuditTextRequest,
    ) -> aitech_models.ApplyAuditTextResponse:
        """
        Description: 文本同步审核接口，调用阿里云内容安全审核增强版
        Summary: 文本同步审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_audit_text_ex(request, headers, runtime)

    async def apply_audit_text_async(
        self,
        request: aitech_models.ApplyAuditTextRequest,
    ) -> aitech_models.ApplyAuditTextResponse:
        """
        Description: 文本同步审核接口，调用阿里云内容安全审核增强版
        Summary: 文本同步审核
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_audit_text_ex_async(request, headers, runtime)

    def apply_audit_text_ex(
        self,
        request: aitech_models.ApplyAuditTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditTextResponse:
        """
        Description: 文本同步审核接口，调用阿里云内容安全审核增强版
        Summary: 文本同步审核
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditTextResponse(),
            self.do_request('1.0', 'aitech.comm.audit.text.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_audit_text_ex_async(
        self,
        request: aitech_models.ApplyAuditTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditTextResponse:
        """
        Description: 文本同步审核接口，调用阿里云内容安全审核增强版
        Summary: 文本同步审核
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditTextResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.text.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_audit_imagebase(
        self,
        request: aitech_models.ApplyAuditImagebaseRequest,
    ) -> aitech_models.ApplyAuditImagebaseResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片机审基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_audit_imagebase_ex(request, headers, runtime)

    async def apply_audit_imagebase_async(
        self,
        request: aitech_models.ApplyAuditImagebaseRequest,
    ) -> aitech_models.ApplyAuditImagebaseResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片机审基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_audit_imagebase_ex_async(request, headers, runtime)

    def apply_audit_imagebase_ex(
        self,
        request: aitech_models.ApplyAuditImagebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditImagebaseResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片机审基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditImagebaseResponse(),
            self.do_request('1.0', 'aitech.comm.audit.imagebase.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_audit_imagebase_ex_async(
        self,
        request: aitech_models.ApplyAuditImagebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditImagebaseResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片机审基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditImagebaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.imagebase.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_audit_imageadvanced(
        self,
        request: aitech_models.ApplyAuditImageadvancedRequest,
    ) -> aitech_models.ApplyAuditImageadvancedResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片审核增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_audit_imageadvanced_ex(request, headers, runtime)

    async def apply_audit_imageadvanced_async(
        self,
        request: aitech_models.ApplyAuditImageadvancedRequest,
    ) -> aitech_models.ApplyAuditImageadvancedResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片审核增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_audit_imageadvanced_ex_async(request, headers, runtime)

    def apply_audit_imageadvanced_ex(
        self,
        request: aitech_models.ApplyAuditImageadvancedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditImageadvancedResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片审核增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditImageadvancedResponse(),
            self.do_request('1.0', 'aitech.comm.audit.imageadvanced.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_audit_imageadvanced_ex_async(
        self,
        request: aitech_models.ApplyAuditImageadvancedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyAuditImageadvancedResponse:
        """
        Description: 同步接口，只调用机审能力
        Summary: 图片审核增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyAuditImageadvancedResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.imageadvanced.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_audiobase(
        self,
        request: aitech_models.SubmitAuditAudiobaseRequest,
    ) -> aitech_models.SubmitAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_audiobase_ex(request, headers, runtime)

    async def submit_audit_audiobase_async(
        self,
        request: aitech_models.SubmitAuditAudiobaseRequest,
    ) -> aitech_models.SubmitAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_audiobase_ex_async(request, headers, runtime)

    def submit_audit_audiobase_ex(
        self,
        request: aitech_models.SubmitAuditAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditAudiobaseResponse(),
            self.do_request('1.0', 'aitech.comm.audit.audiobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_audiobase_ex_async(
        self,
        request: aitech_models.SubmitAuditAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditAudiobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.audiobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_audiobase(
        self,
        request: aitech_models.QueryAuditAudiobaseRequest,
    ) -> aitech_models.QueryAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_audiobase_ex(request, headers, runtime)

    async def query_audit_audiobase_async(
        self,
        request: aitech_models.QueryAuditAudiobaseRequest,
    ) -> aitech_models.QueryAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_audiobase_ex_async(request, headers, runtime)

    def query_audit_audiobase_ex(
        self,
        request: aitech_models.QueryAuditAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditAudiobaseResponse(),
            self.do_request('1.0', 'aitech.comm.audit.audiobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_audiobase_ex_async(
        self,
        request: aitech_models.QueryAuditAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditAudiobaseResponse:
        """
        Description: 异步接口，只调用机审能力
        Summary: 音频审核通用版查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditAudiobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.audiobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_videobase(
        self,
        request: aitech_models.SubmitAuditVideobaseRequest,
    ) -> aitech_models.SubmitAuditVideobaseResponse:
        """
        Description: 异步通知，只调用机审能力
        Summary: 视频审核通用版入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_videobase_ex(request, headers, runtime)

    async def submit_audit_videobase_async(
        self,
        request: aitech_models.SubmitAuditVideobaseRequest,
    ) -> aitech_models.SubmitAuditVideobaseResponse:
        """
        Description: 异步通知，只调用机审能力
        Summary: 视频审核通用版入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_videobase_ex_async(request, headers, runtime)

    def submit_audit_videobase_ex(
        self,
        request: aitech_models.SubmitAuditVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditVideobaseResponse:
        """
        Description: 异步通知，只调用机审能力
        Summary: 视频审核通用版入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditVideobaseResponse(),
            self.do_request('1.0', 'aitech.comm.audit.videobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_videobase_ex_async(
        self,
        request: aitech_models.SubmitAuditVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditVideobaseResponse:
        """
        Description: 异步通知，只调用机审能力
        Summary: 视频审核通用版入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditVideobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.videobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_videobase(
        self,
        request: aitech_models.QueryAuditVideobaseRequest,
    ) -> aitech_models.QueryAuditVideobaseResponse:
        """
        Description: 异步查询
        Summary: 视频审核通用版查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_videobase_ex(request, headers, runtime)

    async def query_audit_videobase_async(
        self,
        request: aitech_models.QueryAuditVideobaseRequest,
    ) -> aitech_models.QueryAuditVideobaseResponse:
        """
        Description: 异步查询
        Summary: 视频审核通用版查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_videobase_ex_async(request, headers, runtime)

    def query_audit_videobase_ex(
        self,
        request: aitech_models.QueryAuditVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditVideobaseResponse:
        """
        Description: 异步查询
        Summary: 视频审核通用版查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditVideobaseResponse(),
            self.do_request('1.0', 'aitech.comm.audit.videobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_videobase_ex_async(
        self,
        request: aitech_models.QueryAuditVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditVideobaseResponse:
        """
        Description: 异步查询
        Summary: 视频审核通用版查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditVideobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.videobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_aliyun_audit(
        self,
        request: aitech_models.CallbackAliyunAuditRequest,
    ) -> aitech_models.CallbackAliyunAuditResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容审核回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_aliyun_audit_ex(request, headers, runtime)

    async def callback_aliyun_audit_async(
        self,
        request: aitech_models.CallbackAliyunAuditRequest,
    ) -> aitech_models.CallbackAliyunAuditResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容审核回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_aliyun_audit_ex_async(request, headers, runtime)

    def callback_aliyun_audit_ex(
        self,
        request: aitech_models.CallbackAliyunAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackAliyunAuditResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容审核回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackAliyunAuditResponse(),
            self.do_request('1.0', 'aitech.comm.aliyun.audit.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_aliyun_audit_ex_async(
        self,
        request: aitech_models.CallbackAliyunAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackAliyunAuditResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容审核回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackAliyunAuditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.aliyun.audit.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def transfer_audit_file(
        self,
        request: aitech_models.TransferAuditFileRequest,
    ) -> aitech_models.TransferAuditFileResponse:
        """
        Description: 外部文件转存
        Summary: 文件转存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.transfer_audit_file_ex(request, headers, runtime)

    async def transfer_audit_file_async(
        self,
        request: aitech_models.TransferAuditFileRequest,
    ) -> aitech_models.TransferAuditFileResponse:
        """
        Description: 外部文件转存
        Summary: 文件转存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.transfer_audit_file_ex_async(request, headers, runtime)

    def transfer_audit_file_ex(
        self,
        request: aitech_models.TransferAuditFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.TransferAuditFileResponse:
        """
        Description: 外部文件转存
        Summary: 文件转存接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.TransferAuditFileResponse(),
            self.do_request('1.0', 'aitech.comm.audit.file.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def transfer_audit_file_ex_async(
        self,
        request: aitech_models.TransferAuditFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.TransferAuditFileResponse:
        """
        Description: 外部文件转存
        Summary: 文件转存接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.TransferAuditFileResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.file.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_audit_file(
        self,
        request: aitech_models.DownloadAuditFileRequest,
    ) -> aitech_models.DownloadAuditFileResponse:
        """
        Description: 文件下载接口
        Summary: 文件下载接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_audit_file_ex(request, headers, runtime)

    async def download_audit_file_async(
        self,
        request: aitech_models.DownloadAuditFileRequest,
    ) -> aitech_models.DownloadAuditFileResponse:
        """
        Description: 文件下载接口
        Summary: 文件下载接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_audit_file_ex_async(request, headers, runtime)

    def download_audit_file_ex(
        self,
        request: aitech_models.DownloadAuditFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.DownloadAuditFileResponse:
        """
        Description: 文件下载接口
        Summary: 文件下载接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.DownloadAuditFileResponse(),
            self.do_request('1.0', 'aitech.comm.audit.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_audit_file_ex_async(
        self,
        request: aitech_models.DownloadAuditFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.DownloadAuditFileResponse:
        """
        Description: 文件下载接口
        Summary: 文件下载接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.DownloadAuditFileResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_audit_meiyou(
        self,
        request: aitech_models.SaveAuditMeiyouRequest,
    ) -> aitech_models.SaveAuditMeiyouResponse:
        """
        Description: 美柚待审核信息保存
        Summary: 美柚待审核信息保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_audit_meiyou_ex(request, headers, runtime)

    async def save_audit_meiyou_async(
        self,
        request: aitech_models.SaveAuditMeiyouRequest,
    ) -> aitech_models.SaveAuditMeiyouResponse:
        """
        Description: 美柚待审核信息保存
        Summary: 美柚待审核信息保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_audit_meiyou_ex_async(request, headers, runtime)

    def save_audit_meiyou_ex(
        self,
        request: aitech_models.SaveAuditMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SaveAuditMeiyouResponse:
        """
        Description: 美柚待审核信息保存
        Summary: 美柚待审核信息保存接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SaveAuditMeiyouResponse(),
            self.do_request('1.0', 'aitech.comm.audit.meiyou.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_audit_meiyou_ex_async(
        self,
        request: aitech_models.SaveAuditMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SaveAuditMeiyouResponse:
        """
        Description: 美柚待审核信息保存
        Summary: 美柚待审核信息保存接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SaveAuditMeiyouResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.meiyou.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_audit_meiyou(
        self,
        request: aitech_models.UpdateAuditMeiyouRequest,
    ) -> aitech_models.UpdateAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储请求
        Summary: 美柚审核信息存储请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_audit_meiyou_ex(request, headers, runtime)

    async def update_audit_meiyou_async(
        self,
        request: aitech_models.UpdateAuditMeiyouRequest,
    ) -> aitech_models.UpdateAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储请求
        Summary: 美柚审核信息存储请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_audit_meiyou_ex_async(request, headers, runtime)

    def update_audit_meiyou_ex(
        self,
        request: aitech_models.UpdateAuditMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储请求
        Summary: 美柚审核信息存储请求
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateAuditMeiyouResponse(),
            self.do_request('1.0', 'aitech.comm.audit.meiyou.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_audit_meiyou_ex_async(
        self,
        request: aitech_models.UpdateAuditMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储请求
        Summary: 美柚审核信息存储请求
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateAuditMeiyouResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.meiyou.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meiyou_audit(
        self,
        request: aitech_models.QueryMeiyouAuditRequest,
    ) -> aitech_models.QueryMeiyouAuditResponse:
        """
        Description: 美柚审核信息查询接口
        Summary: 美柚审核信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meiyou_audit_ex(request, headers, runtime)

    async def query_meiyou_audit_async(
        self,
        request: aitech_models.QueryMeiyouAuditRequest,
    ) -> aitech_models.QueryMeiyouAuditResponse:
        """
        Description: 美柚审核信息查询接口
        Summary: 美柚审核信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meiyou_audit_ex_async(request, headers, runtime)

    def query_meiyou_audit_ex(
        self,
        request: aitech_models.QueryMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAuditResponse:
        """
        Description: 美柚审核信息查询接口
        Summary: 美柚审核信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAuditResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.audit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meiyou_audit_ex_async(
        self,
        request: aitech_models.QueryMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAuditResponse:
        """
        Description: 美柚审核信息查询接口
        Summary: 美柚审核信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAuditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.audit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meiyou_audittopic(
        self,
        request: aitech_models.QueryMeiyouAudittopicRequest,
    ) -> aitech_models.QueryMeiyouAudittopicResponse:
        """
        Description: 美柚主题信息查询接口
        Summary: 美柚主题信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meiyou_audittopic_ex(request, headers, runtime)

    async def query_meiyou_audittopic_async(
        self,
        request: aitech_models.QueryMeiyouAudittopicRequest,
    ) -> aitech_models.QueryMeiyouAudittopicResponse:
        """
        Description: 美柚主题信息查询接口
        Summary: 美柚主题信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meiyou_audittopic_ex_async(request, headers, runtime)

    def query_meiyou_audittopic_ex(
        self,
        request: aitech_models.QueryMeiyouAudittopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAudittopicResponse:
        """
        Description: 美柚主题信息查询接口
        Summary: 美柚主题信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAudittopicResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.audittopic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meiyou_audittopic_ex_async(
        self,
        request: aitech_models.QueryMeiyouAudittopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAudittopicResponse:
        """
        Description: 美柚主题信息查询接口
        Summary: 美柚主题信息查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAudittopicResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.audittopic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_meiyou_audit(
        self,
        request: aitech_models.UpdateMeiyouAuditRequest,
    ) -> aitech_models.UpdateMeiyouAuditResponse:
        """
        Description: 更新美柚itag关联关系接口
        Summary: 更新美柚itag关联关系接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_meiyou_audit_ex(request, headers, runtime)

    async def update_meiyou_audit_async(
        self,
        request: aitech_models.UpdateMeiyouAuditRequest,
    ) -> aitech_models.UpdateMeiyouAuditResponse:
        """
        Description: 更新美柚itag关联关系接口
        Summary: 更新美柚itag关联关系接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_meiyou_audit_ex_async(request, headers, runtime)

    def update_meiyou_audit_ex(
        self,
        request: aitech_models.UpdateMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateMeiyouAuditResponse:
        """
        Description: 更新美柚itag关联关系接口
        Summary: 更新美柚itag关联关系接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateMeiyouAuditResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.audit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_meiyou_audit_ex_async(
        self,
        request: aitech_models.UpdateMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateMeiyouAuditResponse:
        """
        Description: 更新美柚itag关联关系接口
        Summary: 更新美柚itag关联关系接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateMeiyouAuditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.audit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meiyou_itagrelation(
        self,
        request: aitech_models.QueryMeiyouItagrelationRequest,
    ) -> aitech_models.QueryMeiyouItagrelationResponse:
        """
        Description: 查询美柚itag关联信息
        Summary: 查询美柚itag关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meiyou_itagrelation_ex(request, headers, runtime)

    async def query_meiyou_itagrelation_async(
        self,
        request: aitech_models.QueryMeiyouItagrelationRequest,
    ) -> aitech_models.QueryMeiyouItagrelationResponse:
        """
        Description: 查询美柚itag关联信息
        Summary: 查询美柚itag关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meiyou_itagrelation_ex_async(request, headers, runtime)

    def query_meiyou_itagrelation_ex(
        self,
        request: aitech_models.QueryMeiyouItagrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouItagrelationResponse:
        """
        Description: 查询美柚itag关联信息
        Summary: 查询美柚itag关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouItagrelationResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.itagrelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meiyou_itagrelation_ex_async(
        self,
        request: aitech_models.QueryMeiyouItagrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouItagrelationResponse:
        """
        Description: 查询美柚itag关联信息
        Summary: 查询美柚itag关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouItagrelationResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.itagrelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_meiyou_itagrelation(
        self,
        request: aitech_models.UpdateMeiyouItagrelationRequest,
    ) -> aitech_models.UpdateMeiyouItagrelationResponse:
        """
        Description: 更新美柚itag关联信息
        Summary: 更新美柚itag关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_meiyou_itagrelation_ex(request, headers, runtime)

    async def update_meiyou_itagrelation_async(
        self,
        request: aitech_models.UpdateMeiyouItagrelationRequest,
    ) -> aitech_models.UpdateMeiyouItagrelationResponse:
        """
        Description: 更新美柚itag关联信息
        Summary: 更新美柚itag关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_meiyou_itagrelation_ex_async(request, headers, runtime)

    def update_meiyou_itagrelation_ex(
        self,
        request: aitech_models.UpdateMeiyouItagrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateMeiyouItagrelationResponse:
        """
        Description: 更新美柚itag关联信息
        Summary: 更新美柚itag关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateMeiyouItagrelationResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.itagrelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_meiyou_itagrelation_ex_async(
        self,
        request: aitech_models.UpdateMeiyouItagrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateMeiyouItagrelationResponse:
        """
        Description: 更新美柚itag关联信息
        Summary: 更新美柚itag关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateMeiyouItagrelationResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.itagrelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meiyou_auditresult(
        self,
        request: aitech_models.QueryMeiyouAuditresultRequest,
    ) -> aitech_models.QueryMeiyouAuditresultResponse:
        """
        Description: 美柚审核结果查询
        Summary: 美柚审核结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meiyou_auditresult_ex(request, headers, runtime)

    async def query_meiyou_auditresult_async(
        self,
        request: aitech_models.QueryMeiyouAuditresultRequest,
    ) -> aitech_models.QueryMeiyouAuditresultResponse:
        """
        Description: 美柚审核结果查询
        Summary: 美柚审核结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meiyou_auditresult_ex_async(request, headers, runtime)

    def query_meiyou_auditresult_ex(
        self,
        request: aitech_models.QueryMeiyouAuditresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAuditresultResponse:
        """
        Description: 美柚审核结果查询
        Summary: 美柚审核结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAuditresultResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.auditresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meiyou_auditresult_ex_async(
        self,
        request: aitech_models.QueryMeiyouAuditresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAuditresultResponse:
        """
        Description: 美柚审核结果查询
        Summary: 美柚审核结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAuditresultResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.auditresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_meiyou_audit(
        self,
        request: aitech_models.PagequeryMeiyouAuditRequest,
    ) -> aitech_models.PagequeryMeiyouAuditResponse:
        """
        Description: 分页查询美柚审核信息接口
        Summary: 分页查询美柚审核信息接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_meiyou_audit_ex(request, headers, runtime)

    async def pagequery_meiyou_audit_async(
        self,
        request: aitech_models.PagequeryMeiyouAuditRequest,
    ) -> aitech_models.PagequeryMeiyouAuditResponse:
        """
        Description: 分页查询美柚审核信息接口
        Summary: 分页查询美柚审核信息接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_meiyou_audit_ex_async(request, headers, runtime)

    def pagequery_meiyou_audit_ex(
        self,
        request: aitech_models.PagequeryMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.PagequeryMeiyouAuditResponse:
        """
        Description: 分页查询美柚审核信息接口
        Summary: 分页查询美柚审核信息接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.PagequeryMeiyouAuditResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.audit.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_meiyou_audit_ex_async(
        self,
        request: aitech_models.PagequeryMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.PagequeryMeiyouAuditResponse:
        """
        Description: 分页查询美柚审核信息接口
        Summary: 分页查询美柚审核信息接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.PagequeryMeiyouAuditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.audit.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_meiyou(
        self,
        request: aitech_models.SubmitAuditMeiyouRequest,
    ) -> aitech_models.SubmitAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储（仅itask）
        Summary: 美柚审核信息存储（仅itask）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_meiyou_ex(request, headers, runtime)

    async def submit_audit_meiyou_async(
        self,
        request: aitech_models.SubmitAuditMeiyouRequest,
    ) -> aitech_models.SubmitAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储（仅itask）
        Summary: 美柚审核信息存储（仅itask）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_meiyou_ex_async(request, headers, runtime)

    def submit_audit_meiyou_ex(
        self,
        request: aitech_models.SubmitAuditMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储（仅itask）
        Summary: 美柚审核信息存储（仅itask）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditMeiyouResponse(),
            self.do_request('1.0', 'aitech.comm.audit.meiyou.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_meiyou_ex_async(
        self,
        request: aitech_models.SubmitAuditMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditMeiyouResponse:
        """
        Description: 美柚审核信息存储（仅itask）
        Summary: 美柚审核信息存储（仅itask）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditMeiyouResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.meiyou.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_audit_document(
        self,
        request: aitech_models.SubmitAuditDocumentRequest,
    ) -> aitech_models.SubmitAuditDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_audit_document_ex(request, headers, runtime)

    async def submit_audit_document_async(
        self,
        request: aitech_models.SubmitAuditDocumentRequest,
    ) -> aitech_models.SubmitAuditDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_audit_document_ex_async(request, headers, runtime)

    def submit_audit_document_ex(
        self,
        request: aitech_models.SubmitAuditDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditDocumentResponse(),
            self.do_request('1.0', 'aitech.comm.audit.document.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_audit_document_ex_async(
        self,
        request: aitech_models.SubmitAuditDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitAuditDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitAuditDocumentResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.document.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_audit_document(
        self,
        request: aitech_models.QueryAuditDocumentRequest,
    ) -> aitech_models.QueryAuditDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_audit_document_ex(request, headers, runtime)

    async def query_audit_document_async(
        self,
        request: aitech_models.QueryAuditDocumentRequest,
    ) -> aitech_models.QueryAuditDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_audit_document_ex_async(request, headers, runtime)

    def query_audit_document_ex(
        self,
        request: aitech_models.QueryAuditDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditDocumentResponse(),
            self.do_request('1.0', 'aitech.comm.audit.document.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_audit_document_ex_async(
        self,
        request: aitech_models.QueryAuditDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAuditDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAuditDocumentResponse(),
            await self.do_request_async('1.0', 'aitech.comm.audit.document.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aicoguardcloud_adbsink(
        self,
        request: aitech_models.QueryAicoguardcloudAdbsinkRequest,
    ) -> aitech_models.QueryAicoguardcloudAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aicoguardcloud_adbsink_ex(request, headers, runtime)

    async def query_aicoguardcloud_adbsink_async(
        self,
        request: aitech_models.QueryAicoguardcloudAdbsinkRequest,
    ) -> aitech_models.QueryAicoguardcloudAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aicoguardcloud_adbsink_ex_async(request, headers, runtime)

    def query_aicoguardcloud_adbsink_ex(
        self,
        request: aitech_models.QueryAicoguardcloudAdbsinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAicoguardcloudAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAicoguardcloudAdbsinkResponse(),
            self.do_request('1.0', 'aitech.comm.aicoguardcloud.adbsink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aicoguardcloud_adbsink_ex_async(
        self,
        request: aitech_models.QueryAicoguardcloudAdbsinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAicoguardcloudAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAicoguardcloudAdbsinkResponse(),
            await self.do_request_async('1.0', 'aitech.comm.aicoguardcloud.adbsink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guardcore_redgpt(
        self,
        request: aitech_models.QueryGuardcoreRedgptRequest,
    ) -> aitech_models.QueryGuardcoreRedgptResponse:
        """
        Description: 红色GPT流式调用网关接口
        Summary: 红色GPT网关方式调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guardcore_redgpt_ex(request, headers, runtime)

    async def query_guardcore_redgpt_async(
        self,
        request: aitech_models.QueryGuardcoreRedgptRequest,
    ) -> aitech_models.QueryGuardcoreRedgptResponse:
        """
        Description: 红色GPT流式调用网关接口
        Summary: 红色GPT网关方式调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guardcore_redgpt_ex_async(request, headers, runtime)

    def query_guardcore_redgpt_ex(
        self,
        request: aitech_models.QueryGuardcoreRedgptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardcoreRedgptResponse:
        """
        Description: 红色GPT流式调用网关接口
        Summary: 红色GPT网关方式调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardcoreRedgptResponse(),
            self.do_request('1.0', 'aitech.comm.guardcore.redgpt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guardcore_redgpt_ex_async(
        self,
        request: aitech_models.QueryGuardcoreRedgptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardcoreRedgptResponse:
        """
        Description: 红色GPT流式调用网关接口
        Summary: 红色GPT网关方式调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardcoreRedgptResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guardcore.redgpt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aicoguard_adbsink(
        self,
        request: aitech_models.QueryAicoguardAdbsinkRequest,
    ) -> aitech_models.QueryAicoguardAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aicoguard_adbsink_ex(request, headers, runtime)

    async def query_aicoguard_adbsink_async(
        self,
        request: aitech_models.QueryAicoguardAdbsinkRequest,
    ) -> aitech_models.QueryAicoguardAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aicoguard_adbsink_ex_async(request, headers, runtime)

    def query_aicoguard_adbsink_ex(
        self,
        request: aitech_models.QueryAicoguardAdbsinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAicoguardAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAicoguardAdbsinkResponse(),
            self.do_request('1.0', 'aitech.comm.aicoguard.adbsink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aicoguard_adbsink_ex_async(
        self,
        request: aitech_models.QueryAicoguardAdbsinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryAicoguardAdbsinkResponse:
        """
        Description: 阿里云ADB调用接口
        Summary: 阿里云ADB调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryAicoguardAdbsinkResponse(),
            await self.do_request_async('1.0', 'aitech.comm.aicoguard.adbsink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_guard_aliyun(
        self,
        request: aitech_models.CallbackGuardAliyunRequest,
    ) -> aitech_models.CallbackGuardAliyunResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容安全回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_guard_aliyun_ex(request, headers, runtime)

    async def callback_guard_aliyun_async(
        self,
        request: aitech_models.CallbackGuardAliyunRequest,
    ) -> aitech_models.CallbackGuardAliyunResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容安全回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_guard_aliyun_ex_async(request, headers, runtime)

    def callback_guard_aliyun_ex(
        self,
        request: aitech_models.CallbackGuardAliyunRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackGuardAliyunResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容安全回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackGuardAliyunResponse(),
            self.do_request('1.0', 'aitech.comm.guard.aliyun.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_guard_aliyun_ex_async(
        self,
        request: aitech_models.CallbackGuardAliyunRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackGuardAliyunResponse:
        """
        Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
        Summary: 阿里云内容安全回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackGuardAliyunResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.aliyun.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_guard_itask(
        self,
        request: aitech_models.CallbackGuardItaskRequest,
    ) -> aitech_models.CallbackGuardItaskResponse:
        """
        Description: 主站ITASK审核能力回调
        Summary: 主站ITASK审核能力回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_guard_itask_ex(request, headers, runtime)

    async def callback_guard_itask_async(
        self,
        request: aitech_models.CallbackGuardItaskRequest,
    ) -> aitech_models.CallbackGuardItaskResponse:
        """
        Description: 主站ITASK审核能力回调
        Summary: 主站ITASK审核能力回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_guard_itask_ex_async(request, headers, runtime)

    def callback_guard_itask_ex(
        self,
        request: aitech_models.CallbackGuardItaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackGuardItaskResponse:
        """
        Description: 主站ITASK审核能力回调
        Summary: 主站ITASK审核能力回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackGuardItaskResponse(),
            self.do_request('1.0', 'aitech.comm.guard.itask.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_guard_itask_ex_async(
        self,
        request: aitech_models.CallbackGuardItaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CallbackGuardItaskResponse:
        """
        Description: 主站ITASK审核能力回调
        Summary: 主站ITASK审核能力回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CallbackGuardItaskResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.itask.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_audio(
        self,
        request: aitech_models.QueryGuardAudioRequest,
    ) -> aitech_models.QueryGuardAudioResponse:
        """
        Description: 音频人审查询
        Summary: 音频人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_audio_ex(request, headers, runtime)

    async def query_guard_audio_async(
        self,
        request: aitech_models.QueryGuardAudioRequest,
    ) -> aitech_models.QueryGuardAudioResponse:
        """
        Description: 音频人审查询
        Summary: 音频人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_audio_ex_async(request, headers, runtime)

    def query_guard_audio_ex(
        self,
        request: aitech_models.QueryGuardAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardAudioResponse:
        """
        Description: 音频人审查询
        Summary: 音频人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardAudioResponse(),
            self.do_request('1.0', 'aitech.comm.guard.audio.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_audio_ex_async(
        self,
        request: aitech_models.QueryGuardAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardAudioResponse:
        """
        Description: 音频人审查询
        Summary: 音频人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardAudioResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.audio.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_audio(
        self,
        request: aitech_models.SubmitGuardAudioRequest,
    ) -> aitech_models.SubmitGuardAudioResponse:
        """
        Description: 音频人审入审
        Summary: 音频人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_audio_ex(request, headers, runtime)

    async def submit_guard_audio_async(
        self,
        request: aitech_models.SubmitGuardAudioRequest,
    ) -> aitech_models.SubmitGuardAudioResponse:
        """
        Description: 音频人审入审
        Summary: 音频人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_audio_ex_async(request, headers, runtime)

    def submit_guard_audio_ex(
        self,
        request: aitech_models.SubmitGuardAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardAudioResponse:
        """
        Description: 音频人审入审
        Summary: 音频人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardAudioResponse(),
            self.do_request('1.0', 'aitech.comm.guard.audio.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_audio_ex_async(
        self,
        request: aitech_models.SubmitGuardAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardAudioResponse:
        """
        Description: 音频人审入审
        Summary: 音频人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardAudioResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.audio.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_image(
        self,
        request: aitech_models.QueryGuardImageRequest,
    ) -> aitech_models.QueryGuardImageResponse:
        """
        Description: 图片人审查询
        Summary: 图片人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_image_ex(request, headers, runtime)

    async def query_guard_image_async(
        self,
        request: aitech_models.QueryGuardImageRequest,
    ) -> aitech_models.QueryGuardImageResponse:
        """
        Description: 图片人审查询
        Summary: 图片人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_image_ex_async(request, headers, runtime)

    def query_guard_image_ex(
        self,
        request: aitech_models.QueryGuardImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardImageResponse:
        """
        Description: 图片人审查询
        Summary: 图片人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardImageResponse(),
            self.do_request('1.0', 'aitech.comm.guard.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_image_ex_async(
        self,
        request: aitech_models.QueryGuardImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardImageResponse:
        """
        Description: 图片人审查询
        Summary: 图片人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardImageResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_image(
        self,
        request: aitech_models.SubmitGuardImageRequest,
    ) -> aitech_models.SubmitGuardImageResponse:
        """
        Description: 图片人审入审
        Summary: 图片人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_image_ex(request, headers, runtime)

    async def submit_guard_image_async(
        self,
        request: aitech_models.SubmitGuardImageRequest,
    ) -> aitech_models.SubmitGuardImageResponse:
        """
        Description: 图片人审入审
        Summary: 图片人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_image_ex_async(request, headers, runtime)

    def submit_guard_image_ex(
        self,
        request: aitech_models.SubmitGuardImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardImageResponse:
        """
        Description: 图片人审入审
        Summary: 图片人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardImageResponse(),
            self.do_request('1.0', 'aitech.comm.guard.image.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_image_ex_async(
        self,
        request: aitech_models.SubmitGuardImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardImageResponse:
        """
        Description: 图片人审入审
        Summary: 图片人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardImageResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.image.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_text(
        self,
        request: aitech_models.QueryGuardTextRequest,
    ) -> aitech_models.QueryGuardTextResponse:
        """
        Description: 文本人审查询
        Summary: 文本人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_text_ex(request, headers, runtime)

    async def query_guard_text_async(
        self,
        request: aitech_models.QueryGuardTextRequest,
    ) -> aitech_models.QueryGuardTextResponse:
        """
        Description: 文本人审查询
        Summary: 文本人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_text_ex_async(request, headers, runtime)

    def query_guard_text_ex(
        self,
        request: aitech_models.QueryGuardTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardTextResponse:
        """
        Description: 文本人审查询
        Summary: 文本人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardTextResponse(),
            self.do_request('1.0', 'aitech.comm.guard.text.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_text_ex_async(
        self,
        request: aitech_models.QueryGuardTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardTextResponse:
        """
        Description: 文本人审查询
        Summary: 文本人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardTextResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.text.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_text(
        self,
        request: aitech_models.SubmitGuardTextRequest,
    ) -> aitech_models.SubmitGuardTextResponse:
        """
        Description: 文本人审提交
        Summary: 文本人审提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_text_ex(request, headers, runtime)

    async def submit_guard_text_async(
        self,
        request: aitech_models.SubmitGuardTextRequest,
    ) -> aitech_models.SubmitGuardTextResponse:
        """
        Description: 文本人审提交
        Summary: 文本人审提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_text_ex_async(request, headers, runtime)

    def submit_guard_text_ex(
        self,
        request: aitech_models.SubmitGuardTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardTextResponse:
        """
        Description: 文本人审提交
        Summary: 文本人审提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardTextResponse(),
            self.do_request('1.0', 'aitech.comm.guard.text.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_text_ex_async(
        self,
        request: aitech_models.SubmitGuardTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardTextResponse:
        """
        Description: 文本人审提交
        Summary: 文本人审提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardTextResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.text.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_video(
        self,
        request: aitech_models.QueryGuardVideoRequest,
    ) -> aitech_models.QueryGuardVideoResponse:
        """
        Description: 视频人审查询
        Summary: 视频人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_video_ex(request, headers, runtime)

    async def query_guard_video_async(
        self,
        request: aitech_models.QueryGuardVideoRequest,
    ) -> aitech_models.QueryGuardVideoResponse:
        """
        Description: 视频人审查询
        Summary: 视频人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_video_ex_async(request, headers, runtime)

    def query_guard_video_ex(
        self,
        request: aitech_models.QueryGuardVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardVideoResponse:
        """
        Description: 视频人审查询
        Summary: 视频人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardVideoResponse(),
            self.do_request('1.0', 'aitech.comm.guard.video.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_video_ex_async(
        self,
        request: aitech_models.QueryGuardVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardVideoResponse:
        """
        Description: 视频人审查询
        Summary: 视频人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardVideoResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.video.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_video(
        self,
        request: aitech_models.SubmitGuardVideoRequest,
    ) -> aitech_models.SubmitGuardVideoResponse:
        """
        Description: 视频人审提交
        Summary: 视频人审提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_video_ex(request, headers, runtime)

    async def submit_guard_video_async(
        self,
        request: aitech_models.SubmitGuardVideoRequest,
    ) -> aitech_models.SubmitGuardVideoResponse:
        """
        Description: 视频人审提交
        Summary: 视频人审提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_video_ex_async(request, headers, runtime)

    def submit_guard_video_ex(
        self,
        request: aitech_models.SubmitGuardVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardVideoResponse:
        """
        Description: 视频人审提交
        Summary: 视频人审提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardVideoResponse(),
            self.do_request('1.0', 'aitech.comm.guard.video.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_video_ex_async(
        self,
        request: aitech_models.SubmitGuardVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardVideoResponse:
        """
        Description: 视频人审提交
        Summary: 视频人审提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardVideoResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.video.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_audiobase(
        self,
        request: aitech_models.QueryGuardAudiobaseRequest,
    ) -> aitech_models.QueryGuardAudiobaseResponse:
        """
        Description: 音频机审查询-基础版
        Summary: 音频机审查询-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_audiobase_ex(request, headers, runtime)

    async def query_guard_audiobase_async(
        self,
        request: aitech_models.QueryGuardAudiobaseRequest,
    ) -> aitech_models.QueryGuardAudiobaseResponse:
        """
        Description: 音频机审查询-基础版
        Summary: 音频机审查询-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_audiobase_ex_async(request, headers, runtime)

    def query_guard_audiobase_ex(
        self,
        request: aitech_models.QueryGuardAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardAudiobaseResponse:
        """
        Description: 音频机审查询-基础版
        Summary: 音频机审查询-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardAudiobaseResponse(),
            self.do_request('1.0', 'aitech.comm.guard.audiobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_audiobase_ex_async(
        self,
        request: aitech_models.QueryGuardAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardAudiobaseResponse:
        """
        Description: 音频机审查询-基础版
        Summary: 音频机审查询-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardAudiobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.audiobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_audiobase(
        self,
        request: aitech_models.SubmitGuardAudiobaseRequest,
    ) -> aitech_models.SubmitGuardAudiobaseResponse:
        """
        Description: 音频机审入审-基础版
        Summary: 音频机审入审-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_audiobase_ex(request, headers, runtime)

    async def submit_guard_audiobase_async(
        self,
        request: aitech_models.SubmitGuardAudiobaseRequest,
    ) -> aitech_models.SubmitGuardAudiobaseResponse:
        """
        Description: 音频机审入审-基础版
        Summary: 音频机审入审-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_audiobase_ex_async(request, headers, runtime)

    def submit_guard_audiobase_ex(
        self,
        request: aitech_models.SubmitGuardAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardAudiobaseResponse:
        """
        Description: 音频机审入审-基础版
        Summary: 音频机审入审-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardAudiobaseResponse(),
            self.do_request('1.0', 'aitech.comm.guard.audiobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_audiobase_ex_async(
        self,
        request: aitech_models.SubmitGuardAudiobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardAudiobaseResponse:
        """
        Description: 音频机审入审-基础版
        Summary: 音频机审入审-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardAudiobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.audiobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_guard_imagebase(
        self,
        request: aitech_models.ApplyGuardImagebaseRequest,
    ) -> aitech_models.ApplyGuardImagebaseResponse:
        """
        Description: 图片机审申请-基础版
        Summary: 图片机审申请-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_guard_imagebase_ex(request, headers, runtime)

    async def apply_guard_imagebase_async(
        self,
        request: aitech_models.ApplyGuardImagebaseRequest,
    ) -> aitech_models.ApplyGuardImagebaseResponse:
        """
        Description: 图片机审申请-基础版
        Summary: 图片机审申请-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_guard_imagebase_ex_async(request, headers, runtime)

    def apply_guard_imagebase_ex(
        self,
        request: aitech_models.ApplyGuardImagebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardImagebaseResponse:
        """
        Description: 图片机审申请-基础版
        Summary: 图片机审申请-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardImagebaseResponse(),
            self.do_request('1.0', 'aitech.comm.guard.imagebase.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_guard_imagebase_ex_async(
        self,
        request: aitech_models.ApplyGuardImagebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardImagebaseResponse:
        """
        Description: 图片机审申请-基础版
        Summary: 图片机审申请-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardImagebaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.imagebase.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_guard_imageadvanced(
        self,
        request: aitech_models.ApplyGuardImageadvancedRequest,
    ) -> aitech_models.ApplyGuardImageadvancedResponse:
        """
        Description: 图片机审申请-增强版
        Summary: 图片机审申请-增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_guard_imageadvanced_ex(request, headers, runtime)

    async def apply_guard_imageadvanced_async(
        self,
        request: aitech_models.ApplyGuardImageadvancedRequest,
    ) -> aitech_models.ApplyGuardImageadvancedResponse:
        """
        Description: 图片机审申请-增强版
        Summary: 图片机审申请-增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_guard_imageadvanced_ex_async(request, headers, runtime)

    def apply_guard_imageadvanced_ex(
        self,
        request: aitech_models.ApplyGuardImageadvancedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardImageadvancedResponse:
        """
        Description: 图片机审申请-增强版
        Summary: 图片机审申请-增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardImageadvancedResponse(),
            self.do_request('1.0', 'aitech.comm.guard.imageadvanced.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_guard_imageadvanced_ex_async(
        self,
        request: aitech_models.ApplyGuardImageadvancedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardImageadvancedResponse:
        """
        Description: 图片机审申请-增强版
        Summary: 图片机审申请-增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardImageadvancedResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.imageadvanced.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_guard_textbase(
        self,
        request: aitech_models.ApplyGuardTextbaseRequest,
    ) -> aitech_models.ApplyGuardTextbaseResponse:
        """
        Description: 文本机审申请-基础版
        Summary: 文本机审申请-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_guard_textbase_ex(request, headers, runtime)

    async def apply_guard_textbase_async(
        self,
        request: aitech_models.ApplyGuardTextbaseRequest,
    ) -> aitech_models.ApplyGuardTextbaseResponse:
        """
        Description: 文本机审申请-基础版
        Summary: 文本机审申请-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_guard_textbase_ex_async(request, headers, runtime)

    def apply_guard_textbase_ex(
        self,
        request: aitech_models.ApplyGuardTextbaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardTextbaseResponse:
        """
        Description: 文本机审申请-基础版
        Summary: 文本机审申请-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardTextbaseResponse(),
            self.do_request('1.0', 'aitech.comm.guard.textbase.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_guard_textbase_ex_async(
        self,
        request: aitech_models.ApplyGuardTextbaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardTextbaseResponse:
        """
        Description: 文本机审申请-基础版
        Summary: 文本机审申请-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardTextbaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.textbase.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_videobase(
        self,
        request: aitech_models.QueryGuardVideobaseRequest,
    ) -> aitech_models.QueryGuardVideobaseResponse:
        """
        Description: 视频机审查询-基础版
        Summary: 视频机审查询-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_videobase_ex(request, headers, runtime)

    async def query_guard_videobase_async(
        self,
        request: aitech_models.QueryGuardVideobaseRequest,
    ) -> aitech_models.QueryGuardVideobaseResponse:
        """
        Description: 视频机审查询-基础版
        Summary: 视频机审查询-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_videobase_ex_async(request, headers, runtime)

    def query_guard_videobase_ex(
        self,
        request: aitech_models.QueryGuardVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardVideobaseResponse:
        """
        Description: 视频机审查询-基础版
        Summary: 视频机审查询-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardVideobaseResponse(),
            self.do_request('1.0', 'aitech.comm.guard.videobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_videobase_ex_async(
        self,
        request: aitech_models.QueryGuardVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardVideobaseResponse:
        """
        Description: 视频机审查询-基础版
        Summary: 视频机审查询-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardVideobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.videobase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_videobase(
        self,
        request: aitech_models.SubmitGuardVideobaseRequest,
    ) -> aitech_models.SubmitGuardVideobaseResponse:
        """
        Description: 视频机审提交-基础版
        Summary: 视频机审提交-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_videobase_ex(request, headers, runtime)

    async def submit_guard_videobase_async(
        self,
        request: aitech_models.SubmitGuardVideobaseRequest,
    ) -> aitech_models.SubmitGuardVideobaseResponse:
        """
        Description: 视频机审提交-基础版
        Summary: 视频机审提交-基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_videobase_ex_async(request, headers, runtime)

    def submit_guard_videobase_ex(
        self,
        request: aitech_models.SubmitGuardVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardVideobaseResponse:
        """
        Description: 视频机审提交-基础版
        Summary: 视频机审提交-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardVideobaseResponse(),
            self.do_request('1.0', 'aitech.comm.guard.videobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_videobase_ex_async(
        self,
        request: aitech_models.SubmitGuardVideobaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardVideobaseResponse:
        """
        Description: 视频机审提交-基础版
        Summary: 视频机审提交-基础版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardVideobaseResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.videobase.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_guard_imagemultiply(
        self,
        request: aitech_models.ApplyGuardImagemultiplyRequest,
    ) -> aitech_models.ApplyGuardImagemultiplyResponse:
        """
        Description: 用于身份证、个人信息识别、防伪等
        Summary: 图片光鉴识别链路
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_guard_imagemultiply_ex(request, headers, runtime)

    async def apply_guard_imagemultiply_async(
        self,
        request: aitech_models.ApplyGuardImagemultiplyRequest,
    ) -> aitech_models.ApplyGuardImagemultiplyResponse:
        """
        Description: 用于身份证、个人信息识别、防伪等
        Summary: 图片光鉴识别链路
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_guard_imagemultiply_ex_async(request, headers, runtime)

    def apply_guard_imagemultiply_ex(
        self,
        request: aitech_models.ApplyGuardImagemultiplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardImagemultiplyResponse:
        """
        Description: 用于身份证、个人信息识别、防伪等
        Summary: 图片光鉴识别链路
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardImagemultiplyResponse(),
            self.do_request('1.0', 'aitech.comm.guard.imagemultiply.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_guard_imagemultiply_ex_async(
        self,
        request: aitech_models.ApplyGuardImagemultiplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.ApplyGuardImagemultiplyResponse:
        """
        Description: 用于身份证、个人信息识别、防伪等
        Summary: 图片光鉴识别链路
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.ApplyGuardImagemultiplyResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.imagemultiply.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_guard_answer(
        self,
        request: aitech_models.CheckGuardAnswerRequest,
    ) -> aitech_models.CheckGuardAnswerResponse:
        """
        Description: 输出文本风险检测
        Summary: 输出文本风险检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_guard_answer_ex(request, headers, runtime)

    async def check_guard_answer_async(
        self,
        request: aitech_models.CheckGuardAnswerRequest,
    ) -> aitech_models.CheckGuardAnswerResponse:
        """
        Description: 输出文本风险检测
        Summary: 输出文本风险检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_guard_answer_ex_async(request, headers, runtime)

    def check_guard_answer_ex(
        self,
        request: aitech_models.CheckGuardAnswerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CheckGuardAnswerResponse:
        """
        Description: 输出文本风险检测
        Summary: 输出文本风险检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CheckGuardAnswerResponse(),
            self.do_request('1.0', 'aitech.comm.guard.answer.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_guard_answer_ex_async(
        self,
        request: aitech_models.CheckGuardAnswerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.CheckGuardAnswerResponse:
        """
        Description: 输出文本风险检测
        Summary: 输出文本风险检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.CheckGuardAnswerResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.answer.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_meiyou_audit(
        self,
        request: aitech_models.SubmitMeiyouAuditRequest,
    ) -> aitech_models.SubmitMeiyouAuditResponse:
        """
        Description: 美柚待审核信息提交
        Summary: 美柚待审核信息提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_meiyou_audit_ex(request, headers, runtime)

    async def submit_meiyou_audit_async(
        self,
        request: aitech_models.SubmitMeiyouAuditRequest,
    ) -> aitech_models.SubmitMeiyouAuditResponse:
        """
        Description: 美柚待审核信息提交
        Summary: 美柚待审核信息提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_meiyou_audit_ex_async(request, headers, runtime)

    def submit_meiyou_audit_ex(
        self,
        request: aitech_models.SubmitMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitMeiyouAuditResponse:
        """
        Description: 美柚待审核信息提交
        Summary: 美柚待审核信息提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitMeiyouAuditResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.audit.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_meiyou_audit_ex_async(
        self,
        request: aitech_models.SubmitMeiyouAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitMeiyouAuditResponse:
        """
        Description: 美柚待审核信息提交
        Summary: 美柚待审核信息提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitMeiyouAuditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.audit.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meiyou_agentaudit(
        self,
        request: aitech_models.QueryMeiyouAgentauditRequest,
    ) -> aitech_models.QueryMeiyouAgentauditResponse:
        """
        Description: 查询美柚审核Agent节点信息
        Summary: 查询美柚审核Agent节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meiyou_agentaudit_ex(request, headers, runtime)

    async def query_meiyou_agentaudit_async(
        self,
        request: aitech_models.QueryMeiyouAgentauditRequest,
    ) -> aitech_models.QueryMeiyouAgentauditResponse:
        """
        Description: 查询美柚审核Agent节点信息
        Summary: 查询美柚审核Agent节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meiyou_agentaudit_ex_async(request, headers, runtime)

    def query_meiyou_agentaudit_ex(
        self,
        request: aitech_models.QueryMeiyouAgentauditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAgentauditResponse:
        """
        Description: 查询美柚审核Agent节点信息
        Summary: 查询美柚审核Agent节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAgentauditResponse(),
            self.do_request('1.0', 'aitech.comm.meiyou.agentaudit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meiyou_agentaudit_ex_async(
        self,
        request: aitech_models.QueryMeiyouAgentauditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryMeiyouAgentauditResponse:
        """
        Description: 查询美柚审核Agent节点信息
        Summary: 查询美柚审核Agent节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryMeiyouAgentauditResponse(),
            await self.do_request_async('1.0', 'aitech.comm.meiyou.agentaudit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_aicoguardcore_meiyou(
        self,
        request: aitech_models.UpdateAicoguardcoreMeiyouRequest,
    ) -> aitech_models.UpdateAicoguardcoreMeiyouResponse:
        """
        Description: 更新美柚审核Agent审核结果
        Summary: 更新美柚审核Agent审核结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_aicoguardcore_meiyou_ex(request, headers, runtime)

    async def update_aicoguardcore_meiyou_async(
        self,
        request: aitech_models.UpdateAicoguardcoreMeiyouRequest,
    ) -> aitech_models.UpdateAicoguardcoreMeiyouResponse:
        """
        Description: 更新美柚审核Agent审核结果
        Summary: 更新美柚审核Agent审核结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_aicoguardcore_meiyou_ex_async(request, headers, runtime)

    def update_aicoguardcore_meiyou_ex(
        self,
        request: aitech_models.UpdateAicoguardcoreMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateAicoguardcoreMeiyouResponse:
        """
        Description: 更新美柚审核Agent审核结果
        Summary: 更新美柚审核Agent审核结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateAicoguardcoreMeiyouResponse(),
            self.do_request('1.0', 'aitech.comm.aicoguardcore.meiyou.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_aicoguardcore_meiyou_ex_async(
        self,
        request: aitech_models.UpdateAicoguardcoreMeiyouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.UpdateAicoguardcoreMeiyouResponse:
        """
        Description: 更新美柚审核Agent审核结果
        Summary: 更新美柚审核Agent审核结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.UpdateAicoguardcoreMeiyouResponse(),
            await self.do_request_async('1.0', 'aitech.comm.aicoguardcore.meiyou.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_guard_document(
        self,
        request: aitech_models.SubmitGuardDocumentRequest,
    ) -> aitech_models.SubmitGuardDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_guard_document_ex(request, headers, runtime)

    async def submit_guard_document_async(
        self,
        request: aitech_models.SubmitGuardDocumentRequest,
    ) -> aitech_models.SubmitGuardDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_guard_document_ex_async(request, headers, runtime)

    def submit_guard_document_ex(
        self,
        request: aitech_models.SubmitGuardDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardDocumentResponse(),
            self.do_request('1.0', 'aitech.comm.guard.document.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_guard_document_ex_async(
        self,
        request: aitech_models.SubmitGuardDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.SubmitGuardDocumentResponse:
        """
        Description: 文档人审入审
        Summary: 文档人审入审
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.SubmitGuardDocumentResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.document.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_document(
        self,
        request: aitech_models.QueryGuardDocumentRequest,
    ) -> aitech_models.QueryGuardDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_document_ex(request, headers, runtime)

    async def query_guard_document_async(
        self,
        request: aitech_models.QueryGuardDocumentRequest,
    ) -> aitech_models.QueryGuardDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_document_ex_async(request, headers, runtime)

    def query_guard_document_ex(
        self,
        request: aitech_models.QueryGuardDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardDocumentResponse(),
            self.do_request('1.0', 'aitech.comm.guard.document.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_document_ex_async(
        self,
        request: aitech_models.QueryGuardDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QueryGuardDocumentResponse:
        """
        Description: 文档人审查询
        Summary: 文档人审查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QueryGuardDocumentResponse(),
            await self.do_request_async('1.0', 'aitech.comm.guard.document.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_security_question(
        self,
        request: aitech_models.QuerySecurityQuestionRequest,
    ) -> aitech_models.QuerySecurityQuestionResponse:
        """
        Description: 天鉴SaaS提问检测
        Summary: 天鉴SaaS提问检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_security_question_ex(request, headers, runtime)

    async def query_security_question_async(
        self,
        request: aitech_models.QuerySecurityQuestionRequest,
    ) -> aitech_models.QuerySecurityQuestionResponse:
        """
        Description: 天鉴SaaS提问检测
        Summary: 天鉴SaaS提问检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_security_question_ex_async(request, headers, runtime)

    def query_security_question_ex(
        self,
        request: aitech_models.QuerySecurityQuestionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QuerySecurityQuestionResponse:
        """
        Description: 天鉴SaaS提问检测
        Summary: 天鉴SaaS提问检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QuerySecurityQuestionResponse(),
            self.do_request('1.0', 'aitech.comm.security.question.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_security_question_ex_async(
        self,
        request: aitech_models.QuerySecurityQuestionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QuerySecurityQuestionResponse:
        """
        Description: 天鉴SaaS提问检测
        Summary: 天鉴SaaS提问检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QuerySecurityQuestionResponse(),
            await self.do_request_async('1.0', 'aitech.comm.security.question.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_security_answer(
        self,
        request: aitech_models.QuerySecurityAnswerRequest,
    ) -> aitech_models.QuerySecurityAnswerResponse:
        """
        Description: 天鉴SaaS回答检测
        Summary: 天鉴SaaS回答检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_security_answer_ex(request, headers, runtime)

    async def query_security_answer_async(
        self,
        request: aitech_models.QuerySecurityAnswerRequest,
    ) -> aitech_models.QuerySecurityAnswerResponse:
        """
        Description: 天鉴SaaS回答检测
        Summary: 天鉴SaaS回答检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_security_answer_ex_async(request, headers, runtime)

    def query_security_answer_ex(
        self,
        request: aitech_models.QuerySecurityAnswerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QuerySecurityAnswerResponse:
        """
        Description: 天鉴SaaS回答检测
        Summary: 天鉴SaaS回答检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QuerySecurityAnswerResponse(),
            self.do_request('1.0', 'aitech.comm.security.answer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_security_answer_ex_async(
        self,
        request: aitech_models.QuerySecurityAnswerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aitech_models.QuerySecurityAnswerResponse:
        """
        Description: 天鉴SaaS回答检测
        Summary: 天鉴SaaS回答检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aitech_models.QuerySecurityAnswerResponse(),
            await self.do_request_async('1.0', 'aitech.comm.security.answer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
