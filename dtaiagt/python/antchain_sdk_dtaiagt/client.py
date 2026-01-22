# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_dtaiagt import models as dtaiagt_models
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
        config: dtaiagt_models.Config,
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
            # Agent对话-对应的工具/工作流参数列表
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
                    'sdk_version': '3.1.1',
                    '_prod_code': 'DTAIAGT',
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
            # Agent对话-对应的工具/工作流参数列表
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
                    'sdk_version': '3.1.1',
                    '_prod_code': 'DTAIAGT',
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

    def start_openai_chat(
        self,
        request: dtaiagt_models.StartOpenaiChatRequest,
    ) -> dtaiagt_models.StartOpenaiChatResponse:
        """
        Description: 大模型流式/同步对话接口
        Summary: 大模型流式/同步对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_openai_chat_ex(request, headers, runtime)

    async def start_openai_chat_async(
        self,
        request: dtaiagt_models.StartOpenaiChatRequest,
    ) -> dtaiagt_models.StartOpenaiChatResponse:
        """
        Description: 大模型流式/同步对话接口
        Summary: 大模型流式/同步对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_openai_chat_ex_async(request, headers, runtime)

    def start_openai_chat_ex(
        self,
        request: dtaiagt_models.StartOpenaiChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartOpenaiChatResponse:
        """
        Description: 大模型流式/同步对话接口
        Summary: 大模型流式/同步对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartOpenaiChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.openai.chat.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_openai_chat_ex_async(
        self,
        request: dtaiagt_models.StartOpenaiChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartOpenaiChatResponse:
        """
        Description: 大模型流式/同步对话接口
        Summary: 大模型流式/同步对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartOpenaiChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.openai.chat.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_agent_chat(
        self,
        request: dtaiagt_models.StartAgentChatRequest,
    ) -> dtaiagt_models.StartAgentChatResponse:
        """
        Description: 智能体流式对话接口
        Summary: 智能体流式对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_agent_chat_ex(request, headers, runtime)

    async def start_agent_chat_async(
        self,
        request: dtaiagt_models.StartAgentChatRequest,
    ) -> dtaiagt_models.StartAgentChatResponse:
        """
        Description: 智能体流式对话接口
        Summary: 智能体流式对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_agent_chat_ex_async(request, headers, runtime)

    def start_agent_chat_ex(
        self,
        request: dtaiagt_models.StartAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartAgentChatResponse:
        """
        Description: 智能体流式对话接口
        Summary: 智能体流式对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_agent_chat_ex_async(
        self,
        request: dtaiagt_models.StartAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartAgentChatResponse:
        """
        Description: 智能体流式对话接口
        Summary: 智能体流式对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_agent_cchat(
        self,
        request: dtaiagt_models.StartAgentCchatRequest,
    ) -> dtaiagt_models.StartAgentCchatResponse:
        """
        Description: 智能体同步对话接口
        Summary: 智能体同步对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_agent_cchat_ex(request, headers, runtime)

    async def start_agent_cchat_async(
        self,
        request: dtaiagt_models.StartAgentCchatRequest,
    ) -> dtaiagt_models.StartAgentCchatResponse:
        """
        Description: 智能体同步对话接口
        Summary: 智能体同步对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_agent_cchat_ex_async(request, headers, runtime)

    def start_agent_cchat_ex(
        self,
        request: dtaiagt_models.StartAgentCchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartAgentCchatResponse:
        """
        Description: 智能体同步对话接口
        Summary: 智能体同步对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartAgentCchatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.cchat.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_agent_cchat_ex_async(
        self,
        request: dtaiagt_models.StartAgentCchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartAgentCchatResponse:
        """
        Description: 智能体同步对话接口
        Summary: 智能体同步对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartAgentCchatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.cchat.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_agent_chat(
        self,
        request: dtaiagt_models.CancelAgentChatRequest,
    ) -> dtaiagt_models.CancelAgentChatResponse:
        """
        Description: 取消对话接口
        Summary: 取消对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_agent_chat_ex(request, headers, runtime)

    async def cancel_agent_chat_async(
        self,
        request: dtaiagt_models.CancelAgentChatRequest,
    ) -> dtaiagt_models.CancelAgentChatResponse:
        """
        Description: 取消对话接口
        Summary: 取消对话接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_agent_chat_ex_async(request, headers, runtime)

    def cancel_agent_chat_ex(
        self,
        request: dtaiagt_models.CancelAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.CancelAgentChatResponse:
        """
        Description: 取消对话接口
        Summary: 取消对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.CancelAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_agent_chat_ex_async(
        self,
        request: dtaiagt_models.CancelAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.CancelAgentChatResponse:
        """
        Description: 取消对话接口
        Summary: 取消对话接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.CancelAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_alipay_library(
        self,
        request: dtaiagt_models.UploadAlipayLibraryRequest,
    ) -> dtaiagt_models.UploadAlipayLibraryResponse:
        """
        Description: 主站-知识库文件上传
        Summary: 主站-知识库文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_alipay_library_ex(request, headers, runtime)

    async def upload_alipay_library_async(
        self,
        request: dtaiagt_models.UploadAlipayLibraryRequest,
    ) -> dtaiagt_models.UploadAlipayLibraryResponse:
        """
        Description: 主站-知识库文件上传
        Summary: 主站-知识库文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_alipay_library_ex_async(request, headers, runtime)

    def upload_alipay_library_ex(
        self,
        request: dtaiagt_models.UploadAlipayLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadAlipayLibraryResponse:
        """
        Description: 主站-知识库文件上传
        Summary: 主站-知识库文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.alipay.library.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_alipay_library_response = dtaiagt_models.UploadAlipayLibraryResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_alipay_library_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadAlipayLibraryResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.alipay.library.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_alipay_library_ex_async(
        self,
        request: dtaiagt_models.UploadAlipayLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadAlipayLibraryResponse:
        """
        Description: 主站-知识库文件上传
        Summary: 主站-知识库文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.alipay.library.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_alipay_library_response = dtaiagt_models.UploadAlipayLibraryResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_alipay_library_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadAlipayLibraryResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.alipay.library.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_alipay_agentchat(
        self,
        request: dtaiagt_models.UploadAlipayAgentchatRequest,
    ) -> dtaiagt_models.UploadAlipayAgentchatResponse:
        """
        Description: 主站-Agent对话-上传文件
        Summary: 主站-Agent对话-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_alipay_agentchat_ex(request, headers, runtime)

    async def upload_alipay_agentchat_async(
        self,
        request: dtaiagt_models.UploadAlipayAgentchatRequest,
    ) -> dtaiagt_models.UploadAlipayAgentchatResponse:
        """
        Description: 主站-Agent对话-上传文件
        Summary: 主站-Agent对话-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_alipay_agentchat_ex_async(request, headers, runtime)

    def upload_alipay_agentchat_ex(
        self,
        request: dtaiagt_models.UploadAlipayAgentchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadAlipayAgentchatResponse:
        """
        Description: 主站-Agent对话-上传文件
        Summary: 主站-Agent对话-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.alipay.agentchat.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_alipay_agentchat_response = dtaiagt_models.UploadAlipayAgentchatResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_alipay_agentchat_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadAlipayAgentchatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.alipay.agentchat.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_alipay_agentchat_ex_async(
        self,
        request: dtaiagt_models.UploadAlipayAgentchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadAlipayAgentchatResponse:
        """
        Description: 主站-Agent对话-上传文件
        Summary: 主站-Agent对话-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.alipay.agentchat.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_alipay_agentchat_response = dtaiagt_models.UploadAlipayAgentchatResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_alipay_agentchat_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadAlipayAgentchatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.alipay.agentchat.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_mcp_mymcp(
        self,
        request: dtaiagt_models.PagequeryMcpMymcpRequest,
    ) -> dtaiagt_models.PagequeryMcpMymcpResponse:
        """
        Description: 查询已订阅的mcp清单
        Summary: 查询已订阅的mcp清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_mcp_mymcp_ex(request, headers, runtime)

    async def pagequery_mcp_mymcp_async(
        self,
        request: dtaiagt_models.PagequeryMcpMymcpRequest,
    ) -> dtaiagt_models.PagequeryMcpMymcpResponse:
        """
        Description: 查询已订阅的mcp清单
        Summary: 查询已订阅的mcp清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_mcp_mymcp_ex_async(request, headers, runtime)

    def pagequery_mcp_mymcp_ex(
        self,
        request: dtaiagt_models.PagequeryMcpMymcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.PagequeryMcpMymcpResponse:
        """
        Description: 查询已订阅的mcp清单
        Summary: 查询已订阅的mcp清单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.PagequeryMcpMymcpResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.mcp.mymcp.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_mcp_mymcp_ex_async(
        self,
        request: dtaiagt_models.PagequeryMcpMymcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.PagequeryMcpMymcpResponse:
        """
        Description: 查询已订阅的mcp清单
        Summary: 查询已订阅的mcp清单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.PagequeryMcpMymcpResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.mcp.mymcp.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_mcp_mymcp(
        self,
        request: dtaiagt_models.DetailMcpMymcpRequest,
    ) -> dtaiagt_models.DetailMcpMymcpResponse:
        """
        Description: mcp详情
        Summary: mcp详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_mcp_mymcp_ex(request, headers, runtime)

    async def detail_mcp_mymcp_async(
        self,
        request: dtaiagt_models.DetailMcpMymcpRequest,
    ) -> dtaiagt_models.DetailMcpMymcpResponse:
        """
        Description: mcp详情
        Summary: mcp详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_mcp_mymcp_ex_async(request, headers, runtime)

    def detail_mcp_mymcp_ex(
        self,
        request: dtaiagt_models.DetailMcpMymcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DetailMcpMymcpResponse:
        """
        Description: mcp详情
        Summary: mcp详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DetailMcpMymcpResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.mcp.mymcp.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_mcp_mymcp_ex_async(
        self,
        request: dtaiagt_models.DetailMcpMymcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DetailMcpMymcpResponse:
        """
        Description: mcp详情
        Summary: mcp详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DetailMcpMymcpResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.mcp.mymcp.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_library_doc(
        self,
        request: dtaiagt_models.ListLibraryDocRequest,
    ) -> dtaiagt_models.ListLibraryDocResponse:
        """
        Description: 知识库-文档分页查询
        Summary: 知识库-文档分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_library_doc_ex(request, headers, runtime)

    async def list_library_doc_async(
        self,
        request: dtaiagt_models.ListLibraryDocRequest,
    ) -> dtaiagt_models.ListLibraryDocResponse:
        """
        Description: 知识库-文档分页查询
        Summary: 知识库-文档分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_library_doc_ex_async(request, headers, runtime)

    def list_library_doc_ex(
        self,
        request: dtaiagt_models.ListLibraryDocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ListLibraryDocResponse:
        """
        Description: 知识库-文档分页查询
        Summary: 知识库-文档分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ListLibraryDocResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.library.doc.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_library_doc_ex_async(
        self,
        request: dtaiagt_models.ListLibraryDocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ListLibraryDocResponse:
        """
        Description: 知识库-文档分页查询
        Summary: 知识库-文档分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ListLibraryDocResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.library.doc.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_library_task(
        self,
        request: dtaiagt_models.ListLibraryTaskRequest,
    ) -> dtaiagt_models.ListLibraryTaskResponse:
        """
        Description: 知识库-任务列表
        Summary: 知识库-任务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_library_task_ex(request, headers, runtime)

    async def list_library_task_async(
        self,
        request: dtaiagt_models.ListLibraryTaskRequest,
    ) -> dtaiagt_models.ListLibraryTaskResponse:
        """
        Description: 知识库-任务列表
        Summary: 知识库-任务列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_library_task_ex_async(request, headers, runtime)

    def list_library_task_ex(
        self,
        request: dtaiagt_models.ListLibraryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ListLibraryTaskResponse:
        """
        Description: 知识库-任务列表
        Summary: 知识库-任务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ListLibraryTaskResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.library.task.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_library_task_ex_async(
        self,
        request: dtaiagt_models.ListLibraryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ListLibraryTaskResponse:
        """
        Description: 知识库-任务列表
        Summary: 知识库-任务列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ListLibraryTaskResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.library.task.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_library_docsplit(
        self,
        request: dtaiagt_models.ExecLibraryDocsplitRequest,
    ) -> dtaiagt_models.ExecLibraryDocsplitResponse:
        """
        Description: 知识库-文档切片
        Summary: 知识库-文档切片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_library_docsplit_ex(request, headers, runtime)

    async def exec_library_docsplit_async(
        self,
        request: dtaiagt_models.ExecLibraryDocsplitRequest,
    ) -> dtaiagt_models.ExecLibraryDocsplitResponse:
        """
        Description: 知识库-文档切片
        Summary: 知识库-文档切片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_library_docsplit_ex_async(request, headers, runtime)

    def exec_library_docsplit_ex(
        self,
        request: dtaiagt_models.ExecLibraryDocsplitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ExecLibraryDocsplitResponse:
        """
        Description: 知识库-文档切片
        Summary: 知识库-文档切片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ExecLibraryDocsplitResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.library.docsplit.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_library_docsplit_ex_async(
        self,
        request: dtaiagt_models.ExecLibraryDocsplitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ExecLibraryDocsplitResponse:
        """
        Description: 知识库-文档切片
        Summary: 知识库-文档切片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ExecLibraryDocsplitResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.library.docsplit.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_agent_chat(
        self,
        request: dtaiagt_models.ListAgentChatRequest,
    ) -> dtaiagt_models.ListAgentChatResponse:
        """
        Description: 查询Agent历史会话列表
        Summary: 查询Agent历史会话列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_agent_chat_ex(request, headers, runtime)

    async def list_agent_chat_async(
        self,
        request: dtaiagt_models.ListAgentChatRequest,
    ) -> dtaiagt_models.ListAgentChatResponse:
        """
        Description: 查询Agent历史会话列表
        Summary: 查询Agent历史会话列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_agent_chat_ex_async(request, headers, runtime)

    def list_agent_chat_ex(
        self,
        request: dtaiagt_models.ListAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ListAgentChatResponse:
        """
        Description: 查询Agent历史会话列表
        Summary: 查询Agent历史会话列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ListAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_agent_chat_ex_async(
        self,
        request: dtaiagt_models.ListAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.ListAgentChatResponse:
        """
        Description: 查询Agent历史会话列表
        Summary: 查询Agent历史会话列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.ListAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_agent_chat(
        self,
        request: dtaiagt_models.DetailAgentChatRequest,
    ) -> dtaiagt_models.DetailAgentChatResponse:
        """
        Description: 查看Agent历史会话详情
        Summary: 查看Agent历史会话详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_agent_chat_ex(request, headers, runtime)

    async def detail_agent_chat_async(
        self,
        request: dtaiagt_models.DetailAgentChatRequest,
    ) -> dtaiagt_models.DetailAgentChatResponse:
        """
        Description: 查看Agent历史会话详情
        Summary: 查看Agent历史会话详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_agent_chat_ex_async(request, headers, runtime)

    def detail_agent_chat_ex(
        self,
        request: dtaiagt_models.DetailAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DetailAgentChatResponse:
        """
        Description: 查看Agent历史会话详情
        Summary: 查看Agent历史会话详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DetailAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_agent_chat_ex_async(
        self,
        request: dtaiagt_models.DetailAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DetailAgentChatResponse:
        """
        Description: 查看Agent历史会话详情
        Summary: 查看Agent历史会话详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DetailAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_agent_chat(
        self,
        request: dtaiagt_models.DeleteAgentChatRequest,
    ) -> dtaiagt_models.DeleteAgentChatResponse:
        """
        Description: 删除Agent会话
        Summary: 删除Agent会话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_agent_chat_ex(request, headers, runtime)

    async def delete_agent_chat_async(
        self,
        request: dtaiagt_models.DeleteAgentChatRequest,
    ) -> dtaiagt_models.DeleteAgentChatResponse:
        """
        Description: 删除Agent会话
        Summary: 删除Agent会话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_agent_chat_ex_async(request, headers, runtime)

    def delete_agent_chat_ex(
        self,
        request: dtaiagt_models.DeleteAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DeleteAgentChatResponse:
        """
        Description: 删除Agent会话
        Summary: 删除Agent会话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DeleteAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_agent_chat_ex_async(
        self,
        request: dtaiagt_models.DeleteAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DeleteAgentChatResponse:
        """
        Description: 删除Agent会话
        Summary: 删除Agent会话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DeleteAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_agent_chat(
        self,
        request: dtaiagt_models.UpdateAgentChatRequest,
    ) -> dtaiagt_models.UpdateAgentChatResponse:
        """
        Description: Agent对话-点赞点踩反馈&删除消息评价
        Summary: Agent对话-赞/踩反馈&删除消息评价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_agent_chat_ex(request, headers, runtime)

    async def update_agent_chat_async(
        self,
        request: dtaiagt_models.UpdateAgentChatRequest,
    ) -> dtaiagt_models.UpdateAgentChatResponse:
        """
        Description: Agent对话-点赞点踩反馈&删除消息评价
        Summary: Agent对话-赞/踩反馈&删除消息评价
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_agent_chat_ex_async(request, headers, runtime)

    def update_agent_chat_ex(
        self,
        request: dtaiagt_models.UpdateAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UpdateAgentChatResponse:
        """
        Description: Agent对话-点赞点踩反馈&删除消息评价
        Summary: Agent对话-赞/踩反馈&删除消息评价
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UpdateAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_agent_chat_ex_async(
        self,
        request: dtaiagt_models.UpdateAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UpdateAgentChatResponse:
        """
        Description: Agent对话-点赞点踩反馈&删除消息评价
        Summary: Agent对话-赞/踩反馈&删除消息评价
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UpdateAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_agent_info(
        self,
        request: dtaiagt_models.DetailAgentInfoRequest,
    ) -> dtaiagt_models.DetailAgentInfoResponse:
        """
        Description: 获取 Agent 详情
        Summary: 获取 Agent 详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_agent_info_ex(request, headers, runtime)

    async def detail_agent_info_async(
        self,
        request: dtaiagt_models.DetailAgentInfoRequest,
    ) -> dtaiagt_models.DetailAgentInfoResponse:
        """
        Description: 获取 Agent 详情
        Summary: 获取 Agent 详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_agent_info_ex_async(request, headers, runtime)

    def detail_agent_info_ex(
        self,
        request: dtaiagt_models.DetailAgentInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DetailAgentInfoResponse:
        """
        Description: 获取 Agent 详情
        Summary: 获取 Agent 详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DetailAgentInfoResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.info.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_agent_info_ex_async(
        self,
        request: dtaiagt_models.DetailAgentInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DetailAgentInfoResponse:
        """
        Description: 获取 Agent 详情
        Summary: 获取 Agent 详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DetailAgentInfoResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.info.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_agent_chat(
        self,
        request: dtaiagt_models.StopAgentChatRequest,
    ) -> dtaiagt_models.StopAgentChatResponse:
        """
        Description: Agent停止对话
        Summary: Agent停止对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_agent_chat_ex(request, headers, runtime)

    async def stop_agent_chat_async(
        self,
        request: dtaiagt_models.StopAgentChatRequest,
    ) -> dtaiagt_models.StopAgentChatResponse:
        """
        Description: Agent停止对话
        Summary: Agent停止对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_agent_chat_ex_async(request, headers, runtime)

    def stop_agent_chat_ex(
        self,
        request: dtaiagt_models.StopAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StopAgentChatResponse:
        """
        Description: Agent停止对话
        Summary: Agent停止对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StopAgentChatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.chat.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_agent_chat_ex_async(
        self,
        request: dtaiagt_models.StopAgentChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StopAgentChatResponse:
        """
        Description: Agent停止对话
        Summary: Agent停止对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StopAgentChatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.chat.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_agent_portalchat(
        self,
        request: dtaiagt_models.UploadAgentPortalchatRequest,
    ) -> dtaiagt_models.UploadAgentPortalchatResponse:
        """
        Description: Agent对话-上传文件
        Summary: Agent对话-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_agent_portalchat_ex(request, headers, runtime)

    async def upload_agent_portalchat_async(
        self,
        request: dtaiagt_models.UploadAgentPortalchatRequest,
    ) -> dtaiagt_models.UploadAgentPortalchatResponse:
        """
        Description: Agent对话-上传文件
        Summary: Agent对话-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_agent_portalchat_ex_async(request, headers, runtime)

    def upload_agent_portalchat_ex(
        self,
        request: dtaiagt_models.UploadAgentPortalchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadAgentPortalchatResponse:
        """
        Description: Agent对话-上传文件
        Summary: Agent对话-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.agent.portalchat.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_agent_portalchat_response = dtaiagt_models.UploadAgentPortalchatResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_agent_portalchat_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadAgentPortalchatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.portalchat.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_agent_portalchat_ex_async(
        self,
        request: dtaiagt_models.UploadAgentPortalchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadAgentPortalchatResponse:
        """
        Description: Agent对话-上传文件
        Summary: Agent对话-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.agent.portalchat.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_agent_portalchat_response = dtaiagt_models.UploadAgentPortalchatResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_agent_portalchat_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadAgentPortalchatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.portalchat.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_library_doc(
        self,
        request: dtaiagt_models.DownloadLibraryDocRequest,
    ) -> dtaiagt_models.DownloadLibraryDocResponse:
        """
        Description: 知识库-文档库-文档下载
        Summary: 知识库-文档库-文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_library_doc_ex(request, headers, runtime)

    async def download_library_doc_async(
        self,
        request: dtaiagt_models.DownloadLibraryDocRequest,
    ) -> dtaiagt_models.DownloadLibraryDocResponse:
        """
        Description: 知识库-文档库-文档下载
        Summary: 知识库-文档库-文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_library_doc_ex_async(request, headers, runtime)

    def download_library_doc_ex(
        self,
        request: dtaiagt_models.DownloadLibraryDocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DownloadLibraryDocResponse:
        """
        Description: 知识库-文档库-文档下载
        Summary: 知识库-文档库-文档下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DownloadLibraryDocResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.library.doc.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_library_doc_ex_async(
        self,
        request: dtaiagt_models.DownloadLibraryDocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.DownloadLibraryDocResponse:
        """
        Description: 知识库-文档库-文档下载
        Summary: 知识库-文档库-文档下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.DownloadLibraryDocResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.library.doc.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_saas_library(
        self,
        request: dtaiagt_models.UploadSaasLibraryRequest,
    ) -> dtaiagt_models.UploadSaasLibraryResponse:
        """
        Description: SAAS-知识库文件上传
        Summary: SAAS-知识库文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_saas_library_ex(request, headers, runtime)

    async def upload_saas_library_async(
        self,
        request: dtaiagt_models.UploadSaasLibraryRequest,
    ) -> dtaiagt_models.UploadSaasLibraryResponse:
        """
        Description: SAAS-知识库文件上传
        Summary: SAAS-知识库文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_saas_library_ex_async(request, headers, runtime)

    def upload_saas_library_ex(
        self,
        request: dtaiagt_models.UploadSaasLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadSaasLibraryResponse:
        """
        Description: SAAS-知识库文件上传
        Summary: SAAS-知识库文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.saas.library.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_saas_library_response = dtaiagt_models.UploadSaasLibraryResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_saas_library_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadSaasLibraryResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.saas.library.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_saas_library_ex_async(
        self,
        request: dtaiagt_models.UploadSaasLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadSaasLibraryResponse:
        """
        Description: SAAS-知识库文件上传
        Summary: SAAS-知识库文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.saas.library.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_saas_library_response = dtaiagt_models.UploadSaasLibraryResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_saas_library_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadSaasLibraryResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.saas.library.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_saas_agentchat(
        self,
        request: dtaiagt_models.UploadSaasAgentchatRequest,
    ) -> dtaiagt_models.UploadSaasAgentchatResponse:
        """
        Description: SAAS-Agent对话-上传文件
        Summary: SAAS-Agent对话-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_saas_agentchat_ex(request, headers, runtime)

    async def upload_saas_agentchat_async(
        self,
        request: dtaiagt_models.UploadSaasAgentchatRequest,
    ) -> dtaiagt_models.UploadSaasAgentchatResponse:
        """
        Description: SAAS-Agent对话-上传文件
        Summary: SAAS-Agent对话-上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_saas_agentchat_ex_async(request, headers, runtime)

    def upload_saas_agentchat_ex(
        self,
        request: dtaiagt_models.UploadSaasAgentchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadSaasAgentchatResponse:
        """
        Description: SAAS-Agent对话-上传文件
        Summary: SAAS-Agent对话-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.saas.agentchat.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_saas_agentchat_response = dtaiagt_models.UploadSaasAgentchatResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_saas_agentchat_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadSaasAgentchatResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.saas.agentchat.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_saas_agentchat_ex_async(
        self,
        request: dtaiagt_models.UploadSaasAgentchatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.UploadSaasAgentchatResponse:
        """
        Description: SAAS-Agent对话-上传文件
        Summary: SAAS-Agent对话-上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.dtaiagt.saas.agentchat.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_saas_agentchat_response = dtaiagt_models.UploadSaasAgentchatResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_saas_agentchat_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.UploadSaasAgentchatResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.saas.agentchat.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_agent_task(
        self,
        request: dtaiagt_models.StartAgentTaskRequest,
    ) -> dtaiagt_models.StartAgentTaskResponse:
        """
        Description: 长任务对话，发起任务&重连任务
        Summary: 长任务对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_agent_task_ex(request, headers, runtime)

    async def start_agent_task_async(
        self,
        request: dtaiagt_models.StartAgentTaskRequest,
    ) -> dtaiagt_models.StartAgentTaskResponse:
        """
        Description: 长任务对话，发起任务&重连任务
        Summary: 长任务对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_agent_task_ex_async(request, headers, runtime)

    def start_agent_task_ex(
        self,
        request: dtaiagt_models.StartAgentTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartAgentTaskResponse:
        """
        Description: 长任务对话，发起任务&重连任务
        Summary: 长任务对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartAgentTaskResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.task.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_agent_task_ex_async(
        self,
        request: dtaiagt_models.StartAgentTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StartAgentTaskResponse:
        """
        Description: 长任务对话，发起任务&重连任务
        Summary: 长任务对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StartAgentTaskResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.task.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_agent_task(
        self,
        request: dtaiagt_models.StopAgentTaskRequest,
    ) -> dtaiagt_models.StopAgentTaskResponse:
        """
        Description: 终止任务
        Summary: 终止任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_agent_task_ex(request, headers, runtime)

    async def stop_agent_task_async(
        self,
        request: dtaiagt_models.StopAgentTaskRequest,
    ) -> dtaiagt_models.StopAgentTaskResponse:
        """
        Description: 终止任务
        Summary: 终止任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_agent_task_ex_async(request, headers, runtime)

    def stop_agent_task_ex(
        self,
        request: dtaiagt_models.StopAgentTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StopAgentTaskResponse:
        """
        Description: 终止任务
        Summary: 终止任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StopAgentTaskResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.task.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_agent_task_ex_async(
        self,
        request: dtaiagt_models.StopAgentTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.StopAgentTaskResponse:
        """
        Description: 终止任务
        Summary: 终止任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.StopAgentTaskResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.task.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_agent_task(
        self,
        request: dtaiagt_models.OperateAgentTaskRequest,
    ) -> dtaiagt_models.OperateAgentTaskResponse:
        """
        Description: 获取前序消息流
        Summary: 获取前序消息流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_agent_task_ex(request, headers, runtime)

    async def operate_agent_task_async(
        self,
        request: dtaiagt_models.OperateAgentTaskRequest,
    ) -> dtaiagt_models.OperateAgentTaskResponse:
        """
        Description: 获取前序消息流
        Summary: 获取前序消息流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_agent_task_ex_async(request, headers, runtime)

    def operate_agent_task_ex(
        self,
        request: dtaiagt_models.OperateAgentTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.OperateAgentTaskResponse:
        """
        Description: 获取前序消息流
        Summary: 获取前序消息流
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.OperateAgentTaskResponse(),
            self.do_request('1.0', 'antdigital.dtaiagt.agent.task.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_agent_task_ex_async(
        self,
        request: dtaiagt_models.OperateAgentTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.OperateAgentTaskResponse:
        """
        Description: 获取前序消息流
        Summary: 获取前序消息流
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.OperateAgentTaskResponse(),
            await self.do_request_async('1.0', 'antdigital.dtaiagt.agent.task.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> dtaiagt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> dtaiagt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: dtaiagt_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dtaiagt_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dtaiagt_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
