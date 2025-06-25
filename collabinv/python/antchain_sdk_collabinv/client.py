# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_collabinv import models as collabinv_models
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
        config: collabinv_models.Config,
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
            # 聊天消息
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
                    'sdk_version': '1.0.43',
                    '_prod_code': 'COLLABINV',
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
            # 聊天消息
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
                    'sdk_version': '1.0.43',
                    '_prod_code': 'COLLABINV',
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

    def query_agent_sse(
        self,
        request: collabinv_models.QueryAgentSseRequest,
    ) -> collabinv_models.QueryAgentSseResponse:
        """
        Description: sse查询
        Summary: sse查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_agent_sse_ex(request, headers, runtime)

    async def query_agent_sse_async(
        self,
        request: collabinv_models.QueryAgentSseRequest,
    ) -> collabinv_models.QueryAgentSseResponse:
        """
        Description: sse查询
        Summary: sse查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_agent_sse_ex_async(request, headers, runtime)

    def query_agent_sse_ex(
        self,
        request: collabinv_models.QueryAgentSseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryAgentSseResponse:
        """
        Description: sse查询
        Summary: sse查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryAgentSseResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.agent.sse.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_agent_sse_ex_async(
        self,
        request: collabinv_models.QueryAgentSseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryAgentSseResponse:
        """
        Description: sse查询
        Summary: sse查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryAgentSseResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.agent.sse.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_agent_conversation(
        self,
        request: collabinv_models.ListAgentConversationRequest,
    ) -> collabinv_models.ListAgentConversationResponse:
        """
        Description: 根据用户id查询用户会话列表
        Summary: 根据用户id查询用户会话列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_agent_conversation_ex(request, headers, runtime)

    async def list_agent_conversation_async(
        self,
        request: collabinv_models.ListAgentConversationRequest,
    ) -> collabinv_models.ListAgentConversationResponse:
        """
        Description: 根据用户id查询用户会话列表
        Summary: 根据用户id查询用户会话列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_agent_conversation_ex_async(request, headers, runtime)

    def list_agent_conversation_ex(
        self,
        request: collabinv_models.ListAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ListAgentConversationResponse:
        """
        Description: 根据用户id查询用户会话列表
        Summary: 根据用户id查询用户会话列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ListAgentConversationResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.agent.conversation.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_agent_conversation_ex_async(
        self,
        request: collabinv_models.ListAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ListAgentConversationResponse:
        """
        Description: 根据用户id查询用户会话列表
        Summary: 根据用户id查询用户会话列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ListAgentConversationResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.agent.conversation.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_agent_conversation(
        self,
        request: collabinv_models.DeleteAgentConversationRequest,
    ) -> collabinv_models.DeleteAgentConversationResponse:
        """
        Description: 根据用户Id会话ID删除会话
        Summary: 删除会话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_agent_conversation_ex(request, headers, runtime)

    async def delete_agent_conversation_async(
        self,
        request: collabinv_models.DeleteAgentConversationRequest,
    ) -> collabinv_models.DeleteAgentConversationResponse:
        """
        Description: 根据用户Id会话ID删除会话
        Summary: 删除会话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_agent_conversation_ex_async(request, headers, runtime)

    def delete_agent_conversation_ex(
        self,
        request: collabinv_models.DeleteAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.DeleteAgentConversationResponse:
        """
        Description: 根据用户Id会话ID删除会话
        Summary: 删除会话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.DeleteAgentConversationResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.agent.conversation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_agent_conversation_ex_async(
        self,
        request: collabinv_models.DeleteAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.DeleteAgentConversationResponse:
        """
        Description: 根据用户Id会话ID删除会话
        Summary: 删除会话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.DeleteAgentConversationResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.agent.conversation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_agent_conversation(
        self,
        request: collabinv_models.BatchdeleteAgentConversationRequest,
    ) -> collabinv_models.BatchdeleteAgentConversationResponse:
        """
        Description: 删除用户所有会话
        Summary: 删除用户所有会话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_agent_conversation_ex(request, headers, runtime)

    async def batchdelete_agent_conversation_async(
        self,
        request: collabinv_models.BatchdeleteAgentConversationRequest,
    ) -> collabinv_models.BatchdeleteAgentConversationResponse:
        """
        Description: 删除用户所有会话
        Summary: 删除用户所有会话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_agent_conversation_ex_async(request, headers, runtime)

    def batchdelete_agent_conversation_ex(
        self,
        request: collabinv_models.BatchdeleteAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.BatchdeleteAgentConversationResponse:
        """
        Description: 删除用户所有会话
        Summary: 删除用户所有会话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.BatchdeleteAgentConversationResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.agent.conversation.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_agent_conversation_ex_async(
        self,
        request: collabinv_models.BatchdeleteAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.BatchdeleteAgentConversationResponse:
        """
        Description: 删除用户所有会话
        Summary: 删除用户所有会话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.BatchdeleteAgentConversationResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.agent.conversation.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_agent_message(
        self,
        request: collabinv_models.ListAgentMessageRequest,
    ) -> collabinv_models.ListAgentMessageResponse:
        """
        Description: 获取会话消息列表
        Summary: 获取会话消息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_agent_message_ex(request, headers, runtime)

    async def list_agent_message_async(
        self,
        request: collabinv_models.ListAgentMessageRequest,
    ) -> collabinv_models.ListAgentMessageResponse:
        """
        Description: 获取会话消息列表
        Summary: 获取会话消息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_agent_message_ex_async(request, headers, runtime)

    def list_agent_message_ex(
        self,
        request: collabinv_models.ListAgentMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ListAgentMessageResponse:
        """
        Description: 获取会话消息列表
        Summary: 获取会话消息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ListAgentMessageResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.agent.message.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_agent_message_ex_async(
        self,
        request: collabinv_models.ListAgentMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ListAgentMessageResponse:
        """
        Description: 获取会话消息列表
        Summary: 获取会话消息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ListAgentMessageResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.agent.message.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_agent_conversation(
        self,
        request: collabinv_models.UpdateAgentConversationRequest,
    ) -> collabinv_models.UpdateAgentConversationResponse:
        """
        Description: 编辑会话信息
        Summary: 编辑会话信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_agent_conversation_ex(request, headers, runtime)

    async def update_agent_conversation_async(
        self,
        request: collabinv_models.UpdateAgentConversationRequest,
    ) -> collabinv_models.UpdateAgentConversationResponse:
        """
        Description: 编辑会话信息
        Summary: 编辑会话信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_agent_conversation_ex_async(request, headers, runtime)

    def update_agent_conversation_ex(
        self,
        request: collabinv_models.UpdateAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.UpdateAgentConversationResponse:
        """
        Description: 编辑会话信息
        Summary: 编辑会话信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.UpdateAgentConversationResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.agent.conversation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_agent_conversation_ex_async(
        self,
        request: collabinv_models.UpdateAgentConversationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.UpdateAgentConversationResponse:
        """
        Description: 编辑会话信息
        Summary: 编辑会话信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.UpdateAgentConversationResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.agent.conversation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_idmap_samplefile(
        self,
        request: collabinv_models.ImportIdmapSamplefileRequest,
    ) -> collabinv_models.ImportIdmapSamplefileResponse:
        """
        Description: idMapping碰撞
        Summary: idMapping碰撞
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_idmap_samplefile_ex(request, headers, runtime)

    async def import_idmap_samplefile_async(
        self,
        request: collabinv_models.ImportIdmapSamplefileRequest,
    ) -> collabinv_models.ImportIdmapSamplefileResponse:
        """
        Description: idMapping碰撞
        Summary: idMapping碰撞
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_idmap_samplefile_ex_async(request, headers, runtime)

    def import_idmap_samplefile_ex(
        self,
        request: collabinv_models.ImportIdmapSamplefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ImportIdmapSamplefileResponse:
        """
        Description: idMapping碰撞
        Summary: idMapping碰撞
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ImportIdmapSamplefileResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.idmap.samplefile.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_idmap_samplefile_ex_async(
        self,
        request: collabinv_models.ImportIdmapSamplefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ImportIdmapSamplefileResponse:
        """
        Description: idMapping碰撞
        Summary: idMapping碰撞
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ImportIdmapSamplefileResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.idmap.samplefile.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_indexresearch_brand(
        self,
        request: collabinv_models.QueryIndexresearchBrandRequest,
    ) -> collabinv_models.QueryIndexresearchBrandResponse:
        """
        Description: 投行研究，品牌调用
        Summary: 投行研究，品牌调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_indexresearch_brand_ex(request, headers, runtime)

    async def query_indexresearch_brand_async(
        self,
        request: collabinv_models.QueryIndexresearchBrandRequest,
    ) -> collabinv_models.QueryIndexresearchBrandResponse:
        """
        Description: 投行研究，品牌调用
        Summary: 投行研究，品牌调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_indexresearch_brand_ex_async(request, headers, runtime)

    def query_indexresearch_brand_ex(
        self,
        request: collabinv_models.QueryIndexresearchBrandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchBrandResponse:
        """
        Description: 投行研究，品牌调用
        Summary: 投行研究，品牌调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchBrandResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.indexresearch.brand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_indexresearch_brand_ex_async(
        self,
        request: collabinv_models.QueryIndexresearchBrandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchBrandResponse:
        """
        Description: 投行研究，品牌调用
        Summary: 投行研究，品牌调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchBrandResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.indexresearch.brand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_indexresearch_brandindex(
        self,
        request: collabinv_models.QueryIndexresearchBrandindexRequest,
    ) -> collabinv_models.QueryIndexresearchBrandindexResponse:
        """
        Description: 投行研究，查询品牌指标结果
        Summary: 查询品牌指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_indexresearch_brandindex_ex(request, headers, runtime)

    async def query_indexresearch_brandindex_async(
        self,
        request: collabinv_models.QueryIndexresearchBrandindexRequest,
    ) -> collabinv_models.QueryIndexresearchBrandindexResponse:
        """
        Description: 投行研究，查询品牌指标结果
        Summary: 查询品牌指标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_indexresearch_brandindex_ex_async(request, headers, runtime)

    def query_indexresearch_brandindex_ex(
        self,
        request: collabinv_models.QueryIndexresearchBrandindexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchBrandindexResponse:
        """
        Description: 投行研究，查询品牌指标结果
        Summary: 查询品牌指标
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchBrandindexResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.indexresearch.brandindex.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_indexresearch_brandindex_ex_async(
        self,
        request: collabinv_models.QueryIndexresearchBrandindexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchBrandindexResponse:
        """
        Description: 投行研究，查询品牌指标结果
        Summary: 查询品牌指标
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchBrandindexResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.indexresearch.brandindex.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_indexresearch_consumeindustry(
        self,
        request: collabinv_models.QueryIndexresearchConsumeindustryRequest,
    ) -> collabinv_models.QueryIndexresearchConsumeindustryResponse:
        """
        Description: 消费行业报告查询
        Summary: 消费行业报告查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_indexresearch_consumeindustry_ex(request, headers, runtime)

    async def query_indexresearch_consumeindustry_async(
        self,
        request: collabinv_models.QueryIndexresearchConsumeindustryRequest,
    ) -> collabinv_models.QueryIndexresearchConsumeindustryResponse:
        """
        Description: 消费行业报告查询
        Summary: 消费行业报告查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_indexresearch_consumeindustry_ex_async(request, headers, runtime)

    def query_indexresearch_consumeindustry_ex(
        self,
        request: collabinv_models.QueryIndexresearchConsumeindustryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchConsumeindustryResponse:
        """
        Description: 消费行业报告查询
        Summary: 消费行业报告查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchConsumeindustryResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.indexresearch.consumeindustry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_indexresearch_consumeindustry_ex_async(
        self,
        request: collabinv_models.QueryIndexresearchConsumeindustryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchConsumeindustryResponse:
        """
        Description: 消费行业报告查询
        Summary: 消费行业报告查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchConsumeindustryResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.indexresearch.consumeindustry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_indexresearch_industry(
        self,
        request: collabinv_models.QueryIndexresearchIndustryRequest,
    ) -> collabinv_models.QueryIndexresearchIndustryResponse:
        """
        Description: 消费行业报告行业查询
        Summary: 消费行业报告行业查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_indexresearch_industry_ex(request, headers, runtime)

    async def query_indexresearch_industry_async(
        self,
        request: collabinv_models.QueryIndexresearchIndustryRequest,
    ) -> collabinv_models.QueryIndexresearchIndustryResponse:
        """
        Description: 消费行业报告行业查询
        Summary: 消费行业报告行业查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_indexresearch_industry_ex_async(request, headers, runtime)

    def query_indexresearch_industry_ex(
        self,
        request: collabinv_models.QueryIndexresearchIndustryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchIndustryResponse:
        """
        Description: 消费行业报告行业查询
        Summary: 消费行业报告行业查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchIndustryResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.indexresearch.industry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_indexresearch_industry_ex_async(
        self,
        request: collabinv_models.QueryIndexresearchIndustryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryIndexresearchIndustryResponse:
        """
        Description: 消费行业报告行业查询
        Summary: 消费行业报告行业查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryIndexresearchIndustryResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.indexresearch.industry.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_location_internal(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_location_internal_ex(request, headers, runtime)

    async def query_location_internal_async(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_location_internal_ex_async(request, headers, runtime)

    def query_location_internal_ex(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationInternalResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.location.internal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_location_internal_ex_async(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationInternalResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.location.internal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_location_trade(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_location_trade_ex(request, headers, runtime)

    async def query_location_trade_async(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_location_trade_ex_async(request, headers, runtime)

    def query_location_trade_ex(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationTradeResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.location.trade.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_location_trade_ex_async(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationTradeResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.location.trade.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_model_samplefile(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_model_samplefile_ex(request, headers, runtime)

    async def push_model_samplefile_async(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_model_samplefile_ex_async(request, headers, runtime)

    def push_model_samplefile_ex(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.PushModelSamplefileResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.samplefile.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_model_samplefile_ex_async(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.PushModelSamplefileResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.samplefile.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_model_sampletask(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_model_sampletask_ex(request, headers, runtime)

    async def exec_model_sampletask_async(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_model_sampletask_ex_async(request, headers, runtime)

    def exec_model_sampletask_ex(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ExecModelSampletaskResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.sampletask.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_model_sampletask_ex_async(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ExecModelSampletaskResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.sampletask.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_sampletask(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_sampletask_ex(request, headers, runtime)

    async def query_model_sampletask_async(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_sampletask_ex_async(request, headers, runtime)

    def query_model_sampletask_ex(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelSampletaskResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.sampletask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_sampletask_ex_async(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelSampletaskResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.sampletask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_featureset(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_featureset_ex(request, headers, runtime)

    async def query_model_featureset_async(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_featureset_ex_async(request, headers, runtime)

    def query_model_featureset_ex(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelFeaturesetResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.featureset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_featureset_ex_async(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelFeaturesetResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.featureset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_model_instance(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_model_instance_ex(request, headers, runtime)

    async def submit_model_instance_async(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_model_instance_ex_async(request, headers, runtime)

    def submit_model_instance_ex(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.SubmitModelInstanceResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.instance.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_model_instance_ex_async(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.SubmitModelInstanceResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.instance.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_stats(
        self,
        request: collabinv_models.QueryModelStatsRequest,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_stats_ex(request, headers, runtime)

    async def query_model_stats_async(
        self,
        request: collabinv_models.QueryModelStatsRequest,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_stats_ex_async(request, headers, runtime)

    def query_model_stats_ex(
        self,
        request: collabinv_models.QueryModelStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelStatsResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.stats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_stats_ex_async(
        self,
        request: collabinv_models.QueryModelStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelStatsResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.stats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_commonscore(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_commonscore_ex(request, headers, runtime)

    async def query_model_commonscore_async(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_commonscore_ex_async(request, headers, runtime)

    def query_model_commonscore_ex(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelCommonscoreResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.commonscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_commonscore_ex_async(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelCommonscoreResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.commonscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_model_commonscore(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 通用查询批次，仅针对外部使用PIR场景
        Summary: 通用查询批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_model_commonscore_ex(request, headers, runtime)

    async def batchquery_model_commonscore_async(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 通用查询批次，仅针对外部使用PIR场景
        Summary: 通用查询批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_model_commonscore_ex_async(request, headers, runtime)

    def batchquery_model_commonscore_ex(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 通用查询批次，仅针对外部使用PIR场景
        Summary: 通用查询批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.BatchqueryModelCommonscoreResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.commonscore.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_model_commonscore_ex_async(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 通用查询批次，仅针对外部使用PIR场景
        Summary: 通用查询批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.BatchqueryModelCommonscoreResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.commonscore.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_multiscore(
        self,
        request: collabinv_models.QueryModelMultiscoreRequest,
    ) -> collabinv_models.QueryModelMultiscoreResponse:
        """
        Description: 多模型预测值
        Summary: 多模型预测值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_multiscore_ex(request, headers, runtime)

    async def query_model_multiscore_async(
        self,
        request: collabinv_models.QueryModelMultiscoreRequest,
    ) -> collabinv_models.QueryModelMultiscoreResponse:
        """
        Description: 多模型预测值
        Summary: 多模型预测值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_multiscore_ex_async(request, headers, runtime)

    def query_model_multiscore_ex(
        self,
        request: collabinv_models.QueryModelMultiscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelMultiscoreResponse:
        """
        Description: 多模型预测值
        Summary: 多模型预测值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelMultiscoreResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.multiscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_multiscore_ex_async(
        self,
        request: collabinv_models.QueryModelMultiscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelMultiscoreResponse:
        """
        Description: 多模型预测值
        Summary: 多模型预测值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelMultiscoreResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.multiscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_fusionmodel(
        self,
        request: collabinv_models.QueryModelFusionmodelRequest,
    ) -> collabinv_models.QueryModelFusionmodelResponse:
        """
        Description: 融合模型的调用
        Summary: 融合模型调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_fusionmodel_ex(request, headers, runtime)

    async def query_model_fusionmodel_async(
        self,
        request: collabinv_models.QueryModelFusionmodelRequest,
    ) -> collabinv_models.QueryModelFusionmodelResponse:
        """
        Description: 融合模型的调用
        Summary: 融合模型调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_fusionmodel_ex_async(request, headers, runtime)

    def query_model_fusionmodel_ex(
        self,
        request: collabinv_models.QueryModelFusionmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelFusionmodelResponse:
        """
        Description: 融合模型的调用
        Summary: 融合模型调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelFusionmodelResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.fusionmodel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_fusionmodel_ex_async(
        self,
        request: collabinv_models.QueryModelFusionmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelFusionmodelResponse:
        """
        Description: 融合模型的调用
        Summary: 融合模型调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelFusionmodelResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.fusionmodel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_workscore(
        self,
        request: collabinv_models.QueryModelWorkscoreRequest,
    ) -> collabinv_models.QueryModelWorkscoreResponse:
        """
        Description: 用工分
        Summary: 用工分调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_workscore_ex(request, headers, runtime)

    async def query_model_workscore_async(
        self,
        request: collabinv_models.QueryModelWorkscoreRequest,
    ) -> collabinv_models.QueryModelWorkscoreResponse:
        """
        Description: 用工分
        Summary: 用工分调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_workscore_ex_async(request, headers, runtime)

    def query_model_workscore_ex(
        self,
        request: collabinv_models.QueryModelWorkscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelWorkscoreResponse:
        """
        Description: 用工分
        Summary: 用工分调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelWorkscoreResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.workscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_workscore_ex_async(
        self,
        request: collabinv_models.QueryModelWorkscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelWorkscoreResponse:
        """
        Description: 用工分
        Summary: 用工分调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelWorkscoreResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.workscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
