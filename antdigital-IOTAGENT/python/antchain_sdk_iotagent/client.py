# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_iotagent import models as iotagent_models
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
        config: iotagent_models.Config,
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
            # 版本范围边界定义
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
                    'sdk_version': '1.5.1',
                    '_prod_code': 'IOTAGENT',
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
            # 版本范围边界定义
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
                    'sdk_version': '1.5.1',
                    '_prod_code': 'IOTAGENT',
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

    def query_blockchain_bot_iotagent_userids(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridsRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridsResponse:
        """
        Description: 查询租户下的userid
        Summary: 查询租户下的userid
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_userids_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_userids_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridsRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridsResponse:
        """
        Description: 查询租户下的userid
        Summary: 查询租户下的userid
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_userids_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_userids_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridsResponse:
        """
        Description: 查询租户下的userid
        Summary: 查询租户下的userid
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentUseridsResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.userids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_userids_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridsResponse:
        """
        Description: 查询租户下的userid
        Summary: 查询租户下的userid
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentUseridsResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.userids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def test_blockchain_bot_iotagent_plugin(
        self,
        request: iotagent_models.TestBlockchainBotIotagentPluginRequest,
    ) -> iotagent_models.TestBlockchainBotIotagentPluginResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.test_blockchain_bot_iotagent_plugin_ex(request, headers, runtime)

    async def test_blockchain_bot_iotagent_plugin_async(
        self,
        request: iotagent_models.TestBlockchainBotIotagentPluginRequest,
    ) -> iotagent_models.TestBlockchainBotIotagentPluginResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.test_blockchain_bot_iotagent_plugin_ex_async(request, headers, runtime)

    def test_blockchain_bot_iotagent_plugin_ex(
        self,
        request: iotagent_models.TestBlockchainBotIotagentPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.TestBlockchainBotIotagentPluginResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = iotagent_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='blockchain.bot.iotagent.plugin.test',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                test_blockchain_bot_iotagent_plugin_response = iotagent_models.TestBlockchainBotIotagentPluginResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return test_blockchain_bot_iotagent_plugin_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.TestBlockchainBotIotagentPluginResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.plugin.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def test_blockchain_bot_iotagent_plugin_ex_async(
        self,
        request: iotagent_models.TestBlockchainBotIotagentPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.TestBlockchainBotIotagentPluginResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = iotagent_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='blockchain.bot.iotagent.plugin.test',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                test_blockchain_bot_iotagent_plugin_response = iotagent_models.TestBlockchainBotIotagentPluginResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return test_blockchain_bot_iotagent_plugin_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.TestBlockchainBotIotagentPluginResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.plugin.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_ioa_agent(
        self,
        request: iotagent_models.QueryBlockchainBotIoaAgentRequest,
    ) -> iotagent_models.QueryBlockchainBotIoaAgentResponse:
        """
        Description: 获取智能体信息
        Summary: 获取智能体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_ioa_agent_ex(request, headers, runtime)

    async def query_blockchain_bot_ioa_agent_async(
        self,
        request: iotagent_models.QueryBlockchainBotIoaAgentRequest,
    ) -> iotagent_models.QueryBlockchainBotIoaAgentResponse:
        """
        Description: 获取智能体信息
        Summary: 获取智能体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_ioa_agent_ex_async(request, headers, runtime)

    def query_blockchain_bot_ioa_agent_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIoaAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIoaAgentResponse:
        """
        Description: 获取智能体信息
        Summary: 获取智能体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIoaAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.ioa.agent.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_ioa_agent_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIoaAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIoaAgentResponse:
        """
        Description: 获取智能体信息
        Summary: 获取智能体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIoaAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.ioa.agent.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_blockchain_bot_ioa_agent(
        self,
        request: iotagent_models.SaveBlockchainBotIoaAgentRequest,
    ) -> iotagent_models.SaveBlockchainBotIoaAgentResponse:
        """
        Description: 更新智能体信息
        Summary: 更新智能体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_blockchain_bot_ioa_agent_ex(request, headers, runtime)

    async def save_blockchain_bot_ioa_agent_async(
        self,
        request: iotagent_models.SaveBlockchainBotIoaAgentRequest,
    ) -> iotagent_models.SaveBlockchainBotIoaAgentResponse:
        """
        Description: 更新智能体信息
        Summary: 更新智能体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_blockchain_bot_ioa_agent_ex_async(request, headers, runtime)

    def save_blockchain_bot_ioa_agent_ex(
        self,
        request: iotagent_models.SaveBlockchainBotIoaAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.SaveBlockchainBotIoaAgentResponse:
        """
        Description: 更新智能体信息
        Summary: 更新智能体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.SaveBlockchainBotIoaAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.ioa.agent.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_blockchain_bot_ioa_agent_ex_async(
        self,
        request: iotagent_models.SaveBlockchainBotIoaAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.SaveBlockchainBotIoaAgentResponse:
        """
        Description: 更新智能体信息
        Summary: 更新智能体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.SaveBlockchainBotIoaAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.ioa.agent.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_ioa_templates(
        self,
        request: iotagent_models.QueryBlockchainBotIoaTemplatesRequest,
    ) -> iotagent_models.QueryBlockchainBotIoaTemplatesResponse:
        """
        Description: 查询用户可选的模板列表详情
        Summary: 查询用户可选的模板列表详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_ioa_templates_ex(request, headers, runtime)

    async def query_blockchain_bot_ioa_templates_async(
        self,
        request: iotagent_models.QueryBlockchainBotIoaTemplatesRequest,
    ) -> iotagent_models.QueryBlockchainBotIoaTemplatesResponse:
        """
        Description: 查询用户可选的模板列表详情
        Summary: 查询用户可选的模板列表详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_ioa_templates_ex_async(request, headers, runtime)

    def query_blockchain_bot_ioa_templates_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIoaTemplatesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIoaTemplatesResponse:
        """
        Description: 查询用户可选的模板列表详情
        Summary: 查询用户可选的模板列表详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIoaTemplatesResponse(),
            self.do_request('1.0', 'blockchain.bot.ioa.templates.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_ioa_templates_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIoaTemplatesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIoaTemplatesResponse:
        """
        Description: 查询用户可选的模板列表详情
        Summary: 查询用户可选的模板列表详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIoaTemplatesResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.ioa.templates.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_agentchat_history(
        self,
        request: iotagent_models.QueryBlockchainBotAgentchatHistoryRequest,
    ) -> iotagent_models.QueryBlockchainBotAgentchatHistoryResponse:
        """
        Description: 查询聊天记录
        Summary: 查询聊天记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_agentchat_history_ex(request, headers, runtime)

    async def query_blockchain_bot_agentchat_history_async(
        self,
        request: iotagent_models.QueryBlockchainBotAgentchatHistoryRequest,
    ) -> iotagent_models.QueryBlockchainBotAgentchatHistoryResponse:
        """
        Description: 查询聊天记录
        Summary: 查询聊天记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_agentchat_history_ex_async(request, headers, runtime)

    def query_blockchain_bot_agentchat_history_ex(
        self,
        request: iotagent_models.QueryBlockchainBotAgentchatHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotAgentchatHistoryResponse:
        """
        Description: 查询聊天记录
        Summary: 查询聊天记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotAgentchatHistoryResponse(),
            self.do_request('1.0', 'blockchain.bot.agentchat.history.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_agentchat_history_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotAgentchatHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotAgentchatHistoryResponse:
        """
        Description: 查询聊天记录
        Summary: 查询聊天记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotAgentchatHistoryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.agentchat.history.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_agent_sessions(
        self,
        request: iotagent_models.QueryBlockchainBotAgentSessionsRequest,
    ) -> iotagent_models.QueryBlockchainBotAgentSessionsResponse:
        """
        Description: 查询 Session 列表
        Summary: 查询 Session 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_agent_sessions_ex(request, headers, runtime)

    async def query_blockchain_bot_agent_sessions_async(
        self,
        request: iotagent_models.QueryBlockchainBotAgentSessionsRequest,
    ) -> iotagent_models.QueryBlockchainBotAgentSessionsResponse:
        """
        Description: 查询 Session 列表
        Summary: 查询 Session 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_agent_sessions_ex_async(request, headers, runtime)

    def query_blockchain_bot_agent_sessions_ex(
        self,
        request: iotagent_models.QueryBlockchainBotAgentSessionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotAgentSessionsResponse:
        """
        Description: 查询 Session 列表
        Summary: 查询 Session 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotAgentSessionsResponse(),
            self.do_request('1.0', 'blockchain.bot.agent.sessions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_agent_sessions_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotAgentSessionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotAgentSessionsResponse:
        """
        Description: 查询 Session 列表
        Summary: 查询 Session 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotAgentSessionsResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.agent.sessions.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_aidevice(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentAideviceRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentAideviceResponse:
        """
        Description: 查询ai设备可用状态
        Summary: 查询ai设备可用状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_aidevice_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_aidevice_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentAideviceRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentAideviceResponse:
        """
        Description: 查询ai设备可用状态
        Summary: 查询ai设备可用状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_aidevice_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_aidevice_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentAideviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentAideviceResponse:
        """
        Description: 查询ai设备可用状态
        Summary: 查询ai设备可用状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentAideviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.aidevice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_aidevice_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentAideviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentAideviceResponse:
        """
        Description: 查询ai设备可用状态
        Summary: 查询ai设备可用状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentAideviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.aidevice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_thingmodelrange(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodelrangeRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodelrangeResponse:
        """
        Description: 查询物模型上报数据时间范围
        Summary: 查询物模型上报数据时间范围
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_thingmodelrange_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_thingmodelrange_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodelrangeRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodelrangeResponse:
        """
        Description: 查询物模型上报数据时间范围
        Summary: 查询物模型上报数据时间范围
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_thingmodelrange_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_thingmodelrange_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodelrangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodelrangeResponse:
        """
        Description: 查询物模型上报数据时间范围
        Summary: 查询物模型上报数据时间范围
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentThingmodelrangeResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.thingmodelrange.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_thingmodelrange_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodelrangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodelrangeResponse:
        """
        Description: 查询物模型上报数据时间范围
        Summary: 查询物模型上报数据时间范围
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentThingmodelrangeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.thingmodelrange.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_thingmodeldata(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodeldataRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodeldataResponse:
        """
        Description: 查询物模型上报数据
        Summary: 查询物模型上报数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_thingmodeldata_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_thingmodeldata_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodeldataRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodeldataResponse:
        """
        Description: 查询物模型上报数据
        Summary: 查询物模型上报数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_thingmodeldata_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_thingmodeldata_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodeldataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodeldataResponse:
        """
        Description: 查询物模型上报数据
        Summary: 查询物模型上报数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentThingmodeldataResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.thingmodeldata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_thingmodeldata_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentThingmodeldataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentThingmodeldataResponse:
        """
        Description: 查询物模型上报数据
        Summary: 查询物模型上报数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentThingmodeldataResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.thingmodeldata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def getsignurl_blockchain_bot_iotagent_plugincontract(
        self,
        request: iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractRequest,
    ) -> iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约URL获取接口
        Summary: IoT智能体插件签约URL获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.getsignurl_blockchain_bot_iotagent_plugincontract_ex(request, headers, runtime)

    async def getsignurl_blockchain_bot_iotagent_plugincontract_async(
        self,
        request: iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractRequest,
    ) -> iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约URL获取接口
        Summary: IoT智能体插件签约URL获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.getsignurl_blockchain_bot_iotagent_plugincontract_ex_async(request, headers, runtime)

    def getsignurl_blockchain_bot_iotagent_plugincontract_ex(
        self,
        request: iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约URL获取接口
        Summary: IoT智能体插件签约URL获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.plugincontract.getsignurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def getsignurl_blockchain_bot_iotagent_plugincontract_ex_async(
        self,
        request: iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约URL获取接口
        Summary: IoT智能体插件签约URL获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.GetsignurlBlockchainBotIotagentPlugincontractResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.plugincontract.getsignurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_plugincontract(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentPlugincontractRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约查询接口
        Summary: IoT智能体插件签约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_plugincontract_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_plugincontract_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentPlugincontractRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约查询接口
        Summary: IoT智能体插件签约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_plugincontract_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_plugincontract_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentPlugincontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约查询接口
        Summary: IoT智能体插件签约查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentPlugincontractResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.plugincontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_plugincontract_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentPlugincontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentPlugincontractResponse:
        """
        Description: IoT智能体插件签约查询接口
        Summary: IoT智能体插件签约查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentPlugincontractResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.plugincontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_userid(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridResponse:
        """
        Description: 根据tenant获取tenant下的userId
        Summary: 根据tenant获取tenant下的userId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_userid_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_userid_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridResponse:
        """
        Description: 根据tenant获取tenant下的userId
        Summary: 根据tenant获取tenant下的userId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_userid_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_userid_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridResponse:
        """
        Description: 根据tenant获取tenant下的userId
        Summary: 根据tenant获取tenant下的userId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentUseridResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.userid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_userid_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentUseridRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentUseridResponse:
        """
        Description: 根据tenant获取tenant下的userId
        Summary: 根据tenant获取tenant下的userId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentUseridResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.userid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_feature(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentFeatureRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentFeatureResponse:
        """
        Description: 根据tenant获取featureId
        Summary: 根据tenant获取featureId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_feature_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_feature_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentFeatureRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentFeatureResponse:
        """
        Description: 根据tenant获取featureId
        Summary: 根据tenant获取featureId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_feature_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_feature_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentFeatureResponse:
        """
        Description: 根据tenant获取featureId
        Summary: 根据tenant获取featureId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentFeatureResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.feature.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_feature_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentFeatureResponse:
        """
        Description: 根据tenant获取featureId
        Summary: 根据tenant获取featureId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentFeatureResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.feature.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotagent_agent(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体创建
        Summary: 智能体创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotagent_agent_ex(request, headers, runtime)

    async def create_blockchain_bot_iotagent_agent_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体创建
        Summary: 智能体创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotagent_agent_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotagent_agent_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体创建
        Summary: 智能体创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotagentAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agent.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotagent_agent_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体创建
        Summary: 智能体创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotagentAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agent.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockchain_bot_iotagent_agent(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体更新
        Summary: 智能体更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockchain_bot_iotagent_agent_ex(request, headers, runtime)

    async def update_blockchain_bot_iotagent_agent_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体更新
        Summary: 智能体更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockchain_bot_iotagent_agent_ex_async(request, headers, runtime)

    def update_blockchain_bot_iotagent_agent_ex(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体更新
        Summary: 智能体更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotagentAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agent.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockchain_bot_iotagent_agent_ex_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体更新
        Summary: 智能体更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotagentAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agent.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_iotagent_agent(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体删除
        Summary: 智能体删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_iotagent_agent_ex(request, headers, runtime)

    async def delete_blockchain_bot_iotagent_agent_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体删除
        Summary: 智能体删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_iotagent_agent_ex_async(request, headers, runtime)

    def delete_blockchain_bot_iotagent_agent_ex(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体删除
        Summary: 智能体删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotagentAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agent.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_iotagent_agent_ex_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体删除
        Summary: 智能体删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotagentAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agent.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotagent_agent(
        self,
        request: iotagent_models.ListBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体列表
        Summary: 智能体列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotagent_agent_ex(request, headers, runtime)

    async def list_blockchain_bot_iotagent_agent_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体列表
        Summary: 智能体列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotagent_agent_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotagent_agent_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体列表
        Summary: 智能体列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agent.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotagent_agent_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体列表
        Summary: 智能体列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agent.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotagent_agentteam(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentteamRequest,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队创建
        Summary: 智能体团队创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotagent_agentteam_ex(request, headers, runtime)

    async def create_blockchain_bot_iotagent_agentteam_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentteamRequest,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队创建
        Summary: 智能体团队创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotagent_agentteam_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotagent_agentteam_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentteamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队创建
        Summary: 智能体团队创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotagentAgentteamResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agentteam.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotagent_agentteam_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentAgentteamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队创建
        Summary: 智能体团队创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotagentAgentteamResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agentteam.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockchain_bot_iotagent_agentteam(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentteamRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队编辑
        Summary: 智能体团队编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockchain_bot_iotagent_agentteam_ex(request, headers, runtime)

    async def update_blockchain_bot_iotagent_agentteam_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentteamRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队编辑
        Summary: 智能体团队编辑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockchain_bot_iotagent_agentteam_ex_async(request, headers, runtime)

    def update_blockchain_bot_iotagent_agentteam_ex(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentteamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队编辑
        Summary: 智能体团队编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotagentAgentteamResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agentteam.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockchain_bot_iotagent_agentteam_ex_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotagentAgentteamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotagentAgentteamResponse:
        """
        Description: 智能体团队编辑
        Summary: 智能体团队编辑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotagentAgentteamResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agentteam.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_blockchain_bot_iotagent_agent(
        self,
        request: iotagent_models.DetailBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.DetailBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体详情
        Summary: 智能体详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_blockchain_bot_iotagent_agent_ex(request, headers, runtime)

    async def detail_blockchain_bot_iotagent_agent_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotagentAgentRequest,
    ) -> iotagent_models.DetailBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体详情
        Summary: 智能体详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_blockchain_bot_iotagent_agent_ex_async(request, headers, runtime)

    def detail_blockchain_bot_iotagent_agent_ex(
        self,
        request: iotagent_models.DetailBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体详情
        Summary: 智能体详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotagentAgentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.agent.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_blockchain_bot_iotagent_agent_ex_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotagentAgentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotagentAgentResponse:
        """
        Description: 智能体详情
        Summary: 智能体详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotagentAgentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.agent.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.CreateBlockchainBotIotagentSessionResponse:
        """
        Description: session创建
        Summary: session创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def create_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.CreateBlockchainBotIotagentSessionResponse:
        """
        Description: session创建
        Summary: session创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotagentSessionResponse:
        """
        Description: session创建
        Summary: session创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotagentSessionResponse:
        """
        Description: session创建
        Summary: session创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rename_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.RenameBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.RenameBlockchainBotIotagentSessionResponse:
        """
        Description: seesion名字修改
        Summary: seesion名字修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rename_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def rename_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.RenameBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.RenameBlockchainBotIotagentSessionResponse:
        """
        Description: seesion名字修改
        Summary: seesion名字修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rename_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def rename_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.RenameBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.RenameBlockchainBotIotagentSessionResponse:
        """
        Description: seesion名字修改
        Summary: seesion名字修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.RenameBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.rename', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rename_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.RenameBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.RenameBlockchainBotIotagentSessionResponse:
        """
        Description: seesion名字修改
        Summary: seesion名字修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.RenameBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.rename', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotagentSessionResponse:
        """
        Description: session删除
        Summary: session删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def delete_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotagentSessionResponse:
        """
        Description: session删除
        Summary: session删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def delete_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotagentSessionResponse:
        """
        Description: session删除
        Summary: session删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotagentSessionResponse:
        """
        Description: session删除
        Summary: session删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def history_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.HistoryBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.HistoryBlockchainBotIotagentSessionResponse:
        """
        Description: session对话历史
        Summary: session对话历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.history_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def history_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.HistoryBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.HistoryBlockchainBotIotagentSessionResponse:
        """
        Description: session对话历史
        Summary: session对话历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.history_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def history_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.HistoryBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.HistoryBlockchainBotIotagentSessionResponse:
        """
        Description: session对话历史
        Summary: session对话历史
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.HistoryBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.history', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def history_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.HistoryBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.HistoryBlockchainBotIotagentSessionResponse:
        """
        Description: session对话历史
        Summary: session对话历史
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.HistoryBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.history', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.ListBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentSessionResponse:
        """
        Description: session 列表
        Summary: session 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def list_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentSessionResponse:
        """
        Description: session 列表
        Summary: session 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentSessionResponse:
        """
        Description: session 列表
        Summary: session 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentSessionResponse:
        """
        Description: session 列表
        Summary: session 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def chat_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.ChatBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ChatBlockchainBotIotagentSessionResponse:
        """
        Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.chat_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def chat_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.ChatBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ChatBlockchainBotIotagentSessionResponse:
        """
        Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.chat_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def chat_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.ChatBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ChatBlockchainBotIotagentSessionResponse:
        """
        Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ChatBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.chat', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def chat_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.ChatBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ChatBlockchainBotIotagentSessionResponse:
        """
        Description: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        Summary: chat 新建/续接双模式（系分 §8.1 v5）：不带 resume 新建 Turn；带 resume 续接原 Turn，可仅补发输出或携 DECIDE/ANSWER/CANCEL 命令
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ChatBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.chat', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def interrupt_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.InterruptBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.InterruptBlockchainBotIotagentSessionResponse:
        """
        Description: 会话打断
        Summary: 会话打断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.interrupt_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def interrupt_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.InterruptBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.InterruptBlockchainBotIotagentSessionResponse:
        """
        Description: 会话打断
        Summary: 会话打断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.interrupt_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def interrupt_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.InterruptBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.InterruptBlockchainBotIotagentSessionResponse:
        """
        Description: 会话打断
        Summary: 会话打断
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.InterruptBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.interrupt', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def interrupt_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.InterruptBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.InterruptBlockchainBotIotagentSessionResponse:
        """
        Description: 会话打断
        Summary: 会话打断
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.InterruptBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.interrupt', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_blockchain_bot_iotagent_message(
        self,
        request: iotagent_models.PushBlockchainBotIotagentMessageRequest,
    ) -> iotagent_models.PushBlockchainBotIotagentMessageResponse:
        """
        Description: 智能体消息/指令推送
        Summary: 智能体消息/指令推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_blockchain_bot_iotagent_message_ex(request, headers, runtime)

    async def push_blockchain_bot_iotagent_message_async(
        self,
        request: iotagent_models.PushBlockchainBotIotagentMessageRequest,
    ) -> iotagent_models.PushBlockchainBotIotagentMessageResponse:
        """
        Description: 智能体消息/指令推送
        Summary: 智能体消息/指令推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_blockchain_bot_iotagent_message_ex_async(request, headers, runtime)

    def push_blockchain_bot_iotagent_message_ex(
        self,
        request: iotagent_models.PushBlockchainBotIotagentMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PushBlockchainBotIotagentMessageResponse:
        """
        Description: 智能体消息/指令推送
        Summary: 智能体消息/指令推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PushBlockchainBotIotagentMessageResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.message.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_blockchain_bot_iotagent_message_ex_async(
        self,
        request: iotagent_models.PushBlockchainBotIotagentMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PushBlockchainBotIotagentMessageResponse:
        """
        Description: 智能体消息/指令推送
        Summary: 智能体消息/指令推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PushBlockchainBotIotagentMessageResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.message.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def querypushstatus_blockchain_bot_iotagent_message(
        self,
        request: iotagent_models.QuerypushstatusBlockchainBotIotagentMessageRequest,
    ) -> iotagent_models.QuerypushstatusBlockchainBotIotagentMessageResponse:
        """
        Description: 查询智能体消息/指令推送状态
        Summary: 查询智能体消息/指令推送状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.querypushstatus_blockchain_bot_iotagent_message_ex(request, headers, runtime)

    async def querypushstatus_blockchain_bot_iotagent_message_async(
        self,
        request: iotagent_models.QuerypushstatusBlockchainBotIotagentMessageRequest,
    ) -> iotagent_models.QuerypushstatusBlockchainBotIotagentMessageResponse:
        """
        Description: 查询智能体消息/指令推送状态
        Summary: 查询智能体消息/指令推送状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.querypushstatus_blockchain_bot_iotagent_message_ex_async(request, headers, runtime)

    def querypushstatus_blockchain_bot_iotagent_message_ex(
        self,
        request: iotagent_models.QuerypushstatusBlockchainBotIotagentMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QuerypushstatusBlockchainBotIotagentMessageResponse:
        """
        Description: 查询智能体消息/指令推送状态
        Summary: 查询智能体消息/指令推送状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QuerypushstatusBlockchainBotIotagentMessageResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.message.querypushstatus', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def querypushstatus_blockchain_bot_iotagent_message_ex_async(
        self,
        request: iotagent_models.QuerypushstatusBlockchainBotIotagentMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QuerypushstatusBlockchainBotIotagentMessageResponse:
        """
        Description: 查询智能体消息/指令推送状态
        Summary: 查询智能体消息/指令推送状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QuerypushstatusBlockchainBotIotagentMessageResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.message.querypushstatus', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def listfiles_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.ListfilesBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ListfilesBlockchainBotIotagentSessionResponse:
        """
        Description: session下的文件列表
        Summary: session下的文件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.listfiles_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def listfiles_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.ListfilesBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ListfilesBlockchainBotIotagentSessionResponse:
        """
        Description: session下的文件列表
        Summary: session下的文件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.listfiles_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def listfiles_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.ListfilesBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListfilesBlockchainBotIotagentSessionResponse:
        """
        Description: session下的文件列表
        Summary: session下的文件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListfilesBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.listfiles', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def listfiles_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.ListfilesBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListfilesBlockchainBotIotagentSessionResponse:
        """
        Description: session下的文件列表
        Summary: session下的文件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListfilesBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.listfiles', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def fliedownload_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.FliedownloadBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.FliedownloadBlockchainBotIotagentSessionResponse:
        """
        Description: 文件下载
        Summary: 文件下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.fliedownload_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def fliedownload_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.FliedownloadBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.FliedownloadBlockchainBotIotagentSessionResponse:
        """
        Description: 文件下载
        Summary: 文件下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.fliedownload_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def fliedownload_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.FliedownloadBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FliedownloadBlockchainBotIotagentSessionResponse:
        """
        Description: 文件下载
        Summary: 文件下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FliedownloadBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.fliedownload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def fliedownload_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.FliedownloadBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FliedownloadBlockchainBotIotagentSessionResponse:
        """
        Description: 文件下载
        Summary: 文件下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FliedownloadBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.fliedownload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def filepreview_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.FilepreviewBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.FilepreviewBlockchainBotIotagentSessionResponse:
        """
        Description: 文件预览
        Summary: 文件预览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.filepreview_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def filepreview_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.FilepreviewBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.FilepreviewBlockchainBotIotagentSessionResponse:
        """
        Description: 文件预览
        Summary: 文件预览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.filepreview_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def filepreview_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.FilepreviewBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FilepreviewBlockchainBotIotagentSessionResponse:
        """
        Description: 文件预览
        Summary: 文件预览
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FilepreviewBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.filepreview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def filepreview_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.FilepreviewBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FilepreviewBlockchainBotIotagentSessionResponse:
        """
        Description: 文件预览
        Summary: 文件预览
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FilepreviewBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.filepreview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_blockchain_bot_iotagent_audioscribe(
        self,
        request: iotagent_models.PushBlockchainBotIotagentAudioscribeRequest,
    ) -> iotagent_models.PushBlockchainBotIotagentAudioscribeResponse:
        """
        Description: 插件接口
        Summary: 插件接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_blockchain_bot_iotagent_audioscribe_ex(request, headers, runtime)

    async def push_blockchain_bot_iotagent_audioscribe_async(
        self,
        request: iotagent_models.PushBlockchainBotIotagentAudioscribeRequest,
    ) -> iotagent_models.PushBlockchainBotIotagentAudioscribeResponse:
        """
        Description: 插件接口
        Summary: 插件接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_blockchain_bot_iotagent_audioscribe_ex_async(request, headers, runtime)

    def push_blockchain_bot_iotagent_audioscribe_ex(
        self,
        request: iotagent_models.PushBlockchainBotIotagentAudioscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PushBlockchainBotIotagentAudioscribeResponse:
        """
        Description: 插件接口
        Summary: 插件接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = iotagent_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='blockchain.bot.iotagent.audioscribe.push',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                push_blockchain_bot_iotagent_audioscribe_response = iotagent_models.PushBlockchainBotIotagentAudioscribeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return push_blockchain_bot_iotagent_audioscribe_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PushBlockchainBotIotagentAudioscribeResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.audioscribe.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_blockchain_bot_iotagent_audioscribe_ex_async(
        self,
        request: iotagent_models.PushBlockchainBotIotagentAudioscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PushBlockchainBotIotagentAudioscribeResponse:
        """
        Description: 插件接口
        Summary: 插件接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = iotagent_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='blockchain.bot.iotagent.audioscribe.push',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                push_blockchain_bot_iotagent_audioscribe_response = iotagent_models.PushBlockchainBotIotagentAudioscribeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return push_blockchain_bot_iotagent_audioscribe_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PushBlockchainBotIotagentAudioscribeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.audioscribe.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_blockchain_bot_iotagent_plugin(
        self,
        request: iotagent_models.ExecBlockchainBotIotagentPluginRequest,
    ) -> iotagent_models.ExecBlockchainBotIotagentPluginResponse:
        """
        Description: 插件通用HTTP接口
        Summary: 插件通用HTTP接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_blockchain_bot_iotagent_plugin_ex(request, headers, runtime)

    async def exec_blockchain_bot_iotagent_plugin_async(
        self,
        request: iotagent_models.ExecBlockchainBotIotagentPluginRequest,
    ) -> iotagent_models.ExecBlockchainBotIotagentPluginResponse:
        """
        Description: 插件通用HTTP接口
        Summary: 插件通用HTTP接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_blockchain_bot_iotagent_plugin_ex_async(request, headers, runtime)

    def exec_blockchain_bot_iotagent_plugin_ex(
        self,
        request: iotagent_models.ExecBlockchainBotIotagentPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ExecBlockchainBotIotagentPluginResponse:
        """
        Description: 插件通用HTTP接口
        Summary: 插件通用HTTP接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ExecBlockchainBotIotagentPluginResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.plugin.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_blockchain_bot_iotagent_plugin_ex_async(
        self,
        request: iotagent_models.ExecBlockchainBotIotagentPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ExecBlockchainBotIotagentPluginResponse:
        """
        Description: 插件通用HTTP接口
        Summary: 插件通用HTTP接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ExecBlockchainBotIotagentPluginResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.plugin.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_blockchain_bot_iotagent_workspace(
        self,
        request: iotagent_models.PushBlockchainBotIotagentWorkspaceRequest,
    ) -> iotagent_models.PushBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传
        Summary: 文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_blockchain_bot_iotagent_workspace_ex(request, headers, runtime)

    async def push_blockchain_bot_iotagent_workspace_async(
        self,
        request: iotagent_models.PushBlockchainBotIotagentWorkspaceRequest,
    ) -> iotagent_models.PushBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传
        Summary: 文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_blockchain_bot_iotagent_workspace_ex_async(request, headers, runtime)

    def push_blockchain_bot_iotagent_workspace_ex(
        self,
        request: iotagent_models.PushBlockchainBotIotagentWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PushBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传
        Summary: 文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PushBlockchainBotIotagentWorkspaceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.workspace.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_blockchain_bot_iotagent_workspace_ex_async(
        self,
        request: iotagent_models.PushBlockchainBotIotagentWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PushBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传
        Summary: 文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PushBlockchainBotIotagentWorkspaceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.workspace.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_blockchain_bot_iotagent_workspace(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentWorkspaceRequest,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传确认
        Summary: 文件上传确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_blockchain_bot_iotagent_workspace_ex(request, headers, runtime)

    async def confirm_blockchain_bot_iotagent_workspace_async(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentWorkspaceRequest,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传确认
        Summary: 文件上传确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_blockchain_bot_iotagent_workspace_ex_async(request, headers, runtime)

    def confirm_blockchain_bot_iotagent_workspace_ex(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传确认
        Summary: 文件上传确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ConfirmBlockchainBotIotagentWorkspaceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.workspace.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_blockchain_bot_iotagent_workspace_ex_async(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentWorkspaceResponse:
        """
        Description: 文件上传确认
        Summary: 文件上传确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ConfirmBlockchainBotIotagentWorkspaceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.workspace.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def status_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.StatusBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.StatusBlockchainBotIotagentMusicResponse:
        """
        Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        Summary: 查询设备的云音乐登录状态及用户/VIP 信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def status_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.StatusBlockchainBotIotagentMusicResponse:
        """
        Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        Summary: 查询设备的云音乐登录状态及用户/VIP 信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def status_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.StatusBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotagentMusicResponse:
        """
        Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        Summary: 查询设备的云音乐登录状态及用户/VIP 信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotagentMusicResponse:
        """
        Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        Summary: 查询设备的云音乐登录状态及用户/VIP 信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def loginurl_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.LoginurlBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LoginurlBlockchainBotIotagentMusicResponse:
        """
        Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.loginurl_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def loginurl_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.LoginurlBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LoginurlBlockchainBotIotagentMusicResponse:
        """
        Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.loginurl_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def loginurl_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.LoginurlBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LoginurlBlockchainBotIotagentMusicResponse:
        """
        Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LoginurlBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.loginurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def loginurl_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.LoginurlBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LoginurlBlockchainBotIotagentMusicResponse:
        """
        Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LoginurlBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.loginurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def playhistory_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.PlayhistoryBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.PlayhistoryBlockchainBotIotagentMusicResponse:
        """
        Description: 查询云音乐播放历史
        Summary: 查询云音乐播放历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.playhistory_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def playhistory_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.PlayhistoryBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.PlayhistoryBlockchainBotIotagentMusicResponse:
        """
        Description: 查询云音乐播放历史
        Summary: 查询云音乐播放历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.playhistory_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def playhistory_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.PlayhistoryBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PlayhistoryBlockchainBotIotagentMusicResponse:
        """
        Description: 查询云音乐播放历史
        Summary: 查询云音乐播放历史
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PlayhistoryBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.playhistory', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def playhistory_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.PlayhistoryBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.PlayhistoryBlockchainBotIotagentMusicResponse:
        """
        Description: 查询云音乐播放历史
        Summary: 查询云音乐播放历史
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.PlayhistoryBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.playhistory', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def favorites_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.FavoritesBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.FavoritesBlockchainBotIotagentMusicResponse:
        """
        Description: 分页查询红心歌曲
        Summary: 分页查询红心歌曲
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.favorites_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def favorites_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.FavoritesBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.FavoritesBlockchainBotIotagentMusicResponse:
        """
        Description: 分页查询红心歌曲
        Summary: 分页查询红心歌曲
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.favorites_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def favorites_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.FavoritesBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FavoritesBlockchainBotIotagentMusicResponse:
        """
        Description: 分页查询红心歌曲
        Summary: 分页查询红心歌曲
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FavoritesBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.favorites', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def favorites_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.FavoritesBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FavoritesBlockchainBotIotagentMusicResponse:
        """
        Description: 分页查询红心歌曲
        Summary: 分页查询红心歌曲
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FavoritesBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.favorites', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def lyrics_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.LyricsBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LyricsBlockchainBotIotagentMusicResponse:
        """
        Description: 查询指定歌曲的歌词。
        Summary: 查询指定歌曲的歌词。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.lyrics_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def lyrics_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.LyricsBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LyricsBlockchainBotIotagentMusicResponse:
        """
        Description: 查询指定歌曲的歌词。
        Summary: 查询指定歌曲的歌词。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.lyrics_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def lyrics_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.LyricsBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LyricsBlockchainBotIotagentMusicResponse:
        """
        Description: 查询指定歌曲的歌词。
        Summary: 查询指定歌曲的歌词。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LyricsBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.lyrics', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def lyrics_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.LyricsBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LyricsBlockchainBotIotagentMusicResponse:
        """
        Description: 查询指定歌曲的歌词。
        Summary: 查询指定歌曲的歌词。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LyricsBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.lyrics', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def like_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.LikeBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LikeBlockchainBotIotagentMusicResponse:
        """
        Description: 对一首歌进行红心/取消红心操作。
        Summary: 对一首歌进行红心/取消红心操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.like_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def like_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.LikeBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LikeBlockchainBotIotagentMusicResponse:
        """
        Description: 对一首歌进行红心/取消红心操作。
        Summary: 对一首歌进行红心/取消红心操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.like_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def like_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.LikeBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LikeBlockchainBotIotagentMusicResponse:
        """
        Description: 对一首歌进行红心/取消红心操作。
        Summary: 对一首歌进行红心/取消红心操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LikeBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.like', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def like_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.LikeBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LikeBlockchainBotIotagentMusicResponse:
        """
        Description: 对一首歌进行红心/取消红心操作。
        Summary: 对一首歌进行红心/取消红心操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LikeBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.like', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def logout_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.LogoutBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LogoutBlockchainBotIotagentMusicResponse:
        """
        Description: 退出云音乐登录，清理 token
        Summary: 退出云音乐登录，清理 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.logout_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def logout_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.LogoutBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.LogoutBlockchainBotIotagentMusicResponse:
        """
        Description: 退出云音乐登录，清理 token
        Summary: 退出云音乐登录，清理 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.logout_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def logout_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.LogoutBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LogoutBlockchainBotIotagentMusicResponse:
        """
        Description: 退出云音乐登录，清理 token
        Summary: 退出云音乐登录，清理 token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LogoutBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.logout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def logout_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.LogoutBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.LogoutBlockchainBotIotagentMusicResponse:
        """
        Description: 退出云音乐登录，清理 token
        Summary: 退出云音乐登录，清理 token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.LogoutBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.logout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_blockchain_bot_iotagent_music(
        self,
        request: iotagent_models.CallbackBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.CallbackBlockchainBotIotagentMusicResponse:
        """
        Description: 云音乐回调接口
        Summary: 云音乐回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_blockchain_bot_iotagent_music_ex(request, headers, runtime)

    async def callback_blockchain_bot_iotagent_music_async(
        self,
        request: iotagent_models.CallbackBlockchainBotIotagentMusicRequest,
    ) -> iotagent_models.CallbackBlockchainBotIotagentMusicResponse:
        """
        Description: 云音乐回调接口
        Summary: 云音乐回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_blockchain_bot_iotagent_music_ex_async(request, headers, runtime)

    def callback_blockchain_bot_iotagent_music_ex(
        self,
        request: iotagent_models.CallbackBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CallbackBlockchainBotIotagentMusicResponse:
        """
        Description: 云音乐回调接口
        Summary: 云音乐回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CallbackBlockchainBotIotagentMusicResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.music.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_blockchain_bot_iotagent_music_ex_async(
        self,
        request: iotagent_models.CallbackBlockchainBotIotagentMusicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CallbackBlockchainBotIotagentMusicResponse:
        """
        Description: 云音乐回调接口
        Summary: 云音乐回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CallbackBlockchainBotIotagentMusicResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.music.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def usage_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.UsageBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.UsageBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.usage_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def usage_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.UsageBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.UsageBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.usage_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def usage_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.UsageBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UsageBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UsageBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.usage', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def usage_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.UsageBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UsageBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UsageBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.usage', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def action_blockchain_bot_iotagent_sessioncontext(
        self,
        request: iotagent_models.ActionBlockchainBotIotagentSessioncontextRequest,
    ) -> iotagent_models.ActionBlockchainBotIotagentSessioncontextResponse:
        """
        Description: 会话上下文处理操作
        Summary: 会话上下文处理操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.action_blockchain_bot_iotagent_sessioncontext_ex(request, headers, runtime)

    async def action_blockchain_bot_iotagent_sessioncontext_async(
        self,
        request: iotagent_models.ActionBlockchainBotIotagentSessioncontextRequest,
    ) -> iotagent_models.ActionBlockchainBotIotagentSessioncontextResponse:
        """
        Description: 会话上下文处理操作
        Summary: 会话上下文处理操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.action_blockchain_bot_iotagent_sessioncontext_ex_async(request, headers, runtime)

    def action_blockchain_bot_iotagent_sessioncontext_ex(
        self,
        request: iotagent_models.ActionBlockchainBotIotagentSessioncontextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ActionBlockchainBotIotagentSessioncontextResponse:
        """
        Description: 会话上下文处理操作
        Summary: 会话上下文处理操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ActionBlockchainBotIotagentSessioncontextResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.sessioncontext.action', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def action_blockchain_bot_iotagent_sessioncontext_ex_async(
        self,
        request: iotagent_models.ActionBlockchainBotIotagentSessioncontextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ActionBlockchainBotIotagentSessioncontextResponse:
        """
        Description: 会话上下文处理操作
        Summary: 会话上下文处理操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ActionBlockchainBotIotagentSessioncontextResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.sessioncontext.action', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotagent_sessioncontextaction(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentSessioncontextactionRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentSessioncontextactionResponse:
        """
        Description: 查询上下文压缩操作结果
        Summary: 查询上下文压缩操作结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotagent_sessioncontextaction_ex(request, headers, runtime)

    async def query_blockchain_bot_iotagent_sessioncontextaction_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentSessioncontextactionRequest,
    ) -> iotagent_models.QueryBlockchainBotIotagentSessioncontextactionResponse:
        """
        Description: 查询上下文压缩操作结果
        Summary: 查询上下文压缩操作结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotagent_sessioncontextaction_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotagent_sessioncontextaction_ex(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentSessioncontextactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentSessioncontextactionResponse:
        """
        Description: 查询上下文压缩操作结果
        Summary: 查询上下文压缩操作结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentSessioncontextactionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.sessioncontextaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotagent_sessioncontextaction_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotIotagentSessioncontextactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotIotagentSessioncontextactionResponse:
        """
        Description: 查询上下文压缩操作结果
        Summary: 查询上下文压缩操作结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotIotagentSessioncontextactionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.sessioncontextaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_agent_dailysummary(
        self,
        request: iotagent_models.QueryBlockchainBotAgentDailysummaryRequest,
    ) -> iotagent_models.QueryBlockchainBotAgentDailysummaryResponse:
        """
        Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_agent_dailysummary_ex(request, headers, runtime)

    async def query_blockchain_bot_agent_dailysummary_async(
        self,
        request: iotagent_models.QueryBlockchainBotAgentDailysummaryRequest,
    ) -> iotagent_models.QueryBlockchainBotAgentDailysummaryResponse:
        """
        Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_agent_dailysummary_ex_async(request, headers, runtime)

    def query_blockchain_bot_agent_dailysummary_ex(
        self,
        request: iotagent_models.QueryBlockchainBotAgentDailysummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotAgentDailysummaryResponse:
        """
        Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotAgentDailysummaryResponse(),
            self.do_request('1.0', 'blockchain.bot.agent.dailysummary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_agent_dailysummary_ex_async(
        self,
        request: iotagent_models.QueryBlockchainBotAgentDailysummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QueryBlockchainBotAgentDailysummaryResponse:
        """
        Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QueryBlockchainBotAgentDailysummaryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.agent.dailysummary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def generate_blockchain_bot_agent_dailysummary(
        self,
        request: iotagent_models.GenerateBlockchainBotAgentDailysummaryRequest,
    ) -> iotagent_models.GenerateBlockchainBotAgentDailysummaryResponse:
        """
        Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.generate_blockchain_bot_agent_dailysummary_ex(request, headers, runtime)

    async def generate_blockchain_bot_agent_dailysummary_async(
        self,
        request: iotagent_models.GenerateBlockchainBotAgentDailysummaryRequest,
    ) -> iotagent_models.GenerateBlockchainBotAgentDailysummaryResponse:
        """
        Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.generate_blockchain_bot_agent_dailysummary_ex_async(request, headers, runtime)

    def generate_blockchain_bot_agent_dailysummary_ex(
        self,
        request: iotagent_models.GenerateBlockchainBotAgentDailysummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.GenerateBlockchainBotAgentDailysummaryResponse:
        """
        Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.GenerateBlockchainBotAgentDailysummaryResponse(),
            self.do_request('1.0', 'blockchain.bot.agent.dailysummary.generate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def generate_blockchain_bot_agent_dailysummary_ex_async(
        self,
        request: iotagent_models.GenerateBlockchainBotAgentDailysummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.GenerateBlockchainBotAgentDailysummaryResponse:
        """
        Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.GenerateBlockchainBotAgentDailysummaryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.agent.dailysummary.generate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def trajectory_blockchain_bot_iotagent_session(
        self,
        request: iotagent_models.TrajectoryBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.TrajectoryBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.trajectory_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def trajectory_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.TrajectoryBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.TrajectoryBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.trajectory_blockchain_bot_iotagent_session_ex_async(request, headers, runtime)

    def trajectory_blockchain_bot_iotagent_session_ex(
        self,
        request: iotagent_models.TrajectoryBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.TrajectoryBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.TrajectoryBlockchainBotIotagentSessionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.trajectory', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def trajectory_blockchain_bot_iotagent_session_ex_async(
        self,
        request: iotagent_models.TrajectoryBlockchainBotIotagentSessionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.TrajectoryBlockchainBotIotagentSessionResponse:
        """
        Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.TrajectoryBlockchainBotIotagentSessionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.trajectory', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def steps_blockchain_bot_iotagent_session_trajectory(
        self,
        request: iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryRequest,
    ) -> iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryResponse:
        """
        Description: 查询单轮/操作的执行步骤详情，展开执行树
        Summary: 查询单轮/操作的执行步骤详情，展开执行树
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.steps_blockchain_bot_iotagent_session_trajectory_ex(request, headers, runtime)

    async def steps_blockchain_bot_iotagent_session_trajectory_async(
        self,
        request: iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryRequest,
    ) -> iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryResponse:
        """
        Description: 查询单轮/操作的执行步骤详情，展开执行树
        Summary: 查询单轮/操作的执行步骤详情，展开执行树
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.steps_blockchain_bot_iotagent_session_trajectory_ex_async(request, headers, runtime)

    def steps_blockchain_bot_iotagent_session_trajectory_ex(
        self,
        request: iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryResponse:
        """
        Description: 查询单轮/操作的执行步骤详情，展开执行树
        Summary: 查询单轮/操作的执行步骤详情，展开执行树
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.session.trajectory.steps', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def steps_blockchain_bot_iotagent_session_trajectory_ex_async(
        self,
        request: iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryResponse:
        """
        Description: 查询单轮/操作的执行步骤详情，展开执行树
        Summary: 查询单轮/操作的执行步骤详情，展开执行树
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StepsBlockchainBotIotagentSessionTrajectoryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.session.trajectory.steps', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def uploadurl_blockchain_bot_iotagent_files(
        self,
        request: iotagent_models.UploadurlBlockchainBotIotagentFilesRequest,
    ) -> iotagent_models.UploadurlBlockchainBotIotagentFilesResponse:
        """
        Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.uploadurl_blockchain_bot_iotagent_files_ex(request, headers, runtime)

    async def uploadurl_blockchain_bot_iotagent_files_async(
        self,
        request: iotagent_models.UploadurlBlockchainBotIotagentFilesRequest,
    ) -> iotagent_models.UploadurlBlockchainBotIotagentFilesResponse:
        """
        Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.uploadurl_blockchain_bot_iotagent_files_ex_async(request, headers, runtime)

    def uploadurl_blockchain_bot_iotagent_files_ex(
        self,
        request: iotagent_models.UploadurlBlockchainBotIotagentFilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UploadurlBlockchainBotIotagentFilesResponse:
        """
        Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UploadurlBlockchainBotIotagentFilesResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.files.uploadurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def uploadurl_blockchain_bot_iotagent_files_ex_async(
        self,
        request: iotagent_models.UploadurlBlockchainBotIotagentFilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UploadurlBlockchainBotIotagentFilesResponse:
        """
        Description: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        Summary: 文件上传地址签发（预签名 PUT 直传 OSS）；scene=SESSION_FILE 会话附件 / SKILL_PACKAGE 租户暂存（SKILL 上传复用）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UploadurlBlockchainBotIotagentFilesResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.files.uploadurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_blockchain_bot_iotagent_files(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentFilesRequest,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentFilesResponse:
        """
        Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_blockchain_bot_iotagent_files_ex(request, headers, runtime)

    async def confirm_blockchain_bot_iotagent_files_async(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentFilesRequest,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentFilesResponse:
        """
        Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_blockchain_bot_iotagent_files_ex_async(request, headers, runtime)

    def confirm_blockchain_bot_iotagent_files_ex(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentFilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentFilesResponse:
        """
        Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ConfirmBlockchainBotIotagentFilesResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.files.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_blockchain_bot_iotagent_files_ex_async(
        self,
        request: iotagent_models.ConfirmBlockchainBotIotagentFilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ConfirmBlockchainBotIotagentFilesResponse:
        """
        Description: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        Summary: 直传文件确认：HEAD 校验大小/类型后激活（INGESTING→ACTIVE），重复确认幂等
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ConfirmBlockchainBotIotagentFilesResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.files.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def fileurl_blockchain_bot_iotagent_files(
        self,
        request: iotagent_models.FileurlBlockchainBotIotagentFilesRequest,
    ) -> iotagent_models.FileurlBlockchainBotIotagentFilesResponse:
        """
        Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.fileurl_blockchain_bot_iotagent_files_ex(request, headers, runtime)

    async def fileurl_blockchain_bot_iotagent_files_async(
        self,
        request: iotagent_models.FileurlBlockchainBotIotagentFilesRequest,
    ) -> iotagent_models.FileurlBlockchainBotIotagentFilesResponse:
        """
        Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.fileurl_blockchain_bot_iotagent_files_ex_async(request, headers, runtime)

    def fileurl_blockchain_bot_iotagent_files_ex(
        self,
        request: iotagent_models.FileurlBlockchainBotIotagentFilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FileurlBlockchainBotIotagentFilesResponse:
        """
        Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FileurlBlockchainBotIotagentFilesResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.files.fileurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def fileurl_blockchain_bot_iotagent_files_ex_async(
        self,
        request: iotagent_models.FileurlBlockchainBotIotagentFilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.FileurlBlockchainBotIotagentFilesResponse:
        """
        Description: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        Summary: 为已确认（ACTIVE）的直传文件签发短期预签名下载 URL（TTL 默认24h）：会话附件引用与 SKILL 导入 sourceUrl 复用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.FileurlBlockchainBotIotagentFilesResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.files.fileurl', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def mount_blockchain_bot_iotagent_kb(
        self,
        request: iotagent_models.MountBlockchainBotIotagentKbRequest,
    ) -> iotagent_models.MountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        Summary: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.mount_blockchain_bot_iotagent_kb_ex(request, headers, runtime)

    async def mount_blockchain_bot_iotagent_kb_async(
        self,
        request: iotagent_models.MountBlockchainBotIotagentKbRequest,
    ) -> iotagent_models.MountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        Summary: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.mount_blockchain_bot_iotagent_kb_ex_async(request, headers, runtime)

    def mount_blockchain_bot_iotagent_kb_ex(
        self,
        request: iotagent_models.MountBlockchainBotIotagentKbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.MountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        Summary: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.MountBlockchainBotIotagentKbResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.kb.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def mount_blockchain_bot_iotagent_kb_ex_async(
        self,
        request: iotagent_models.MountBlockchainBotIotagentKbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.MountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        Summary: 知识库挂载管理（IR）：Agent 挂载知识库（幂等）；携 instance_id 时校验 KB 对该实例可见；挂载关系不回写 plugin_list
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.MountBlockchainBotIotagentKbResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.kb.mount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unmount_blockchain_bot_iotagent_kb(
        self,
        request: iotagent_models.UnmountBlockchainBotIotagentKbRequest,
    ) -> iotagent_models.UnmountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        Summary: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unmount_blockchain_bot_iotagent_kb_ex(request, headers, runtime)

    async def unmount_blockchain_bot_iotagent_kb_async(
        self,
        request: iotagent_models.UnmountBlockchainBotIotagentKbRequest,
    ) -> iotagent_models.UnmountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        Summary: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unmount_blockchain_bot_iotagent_kb_ex_async(request, headers, runtime)

    def unmount_blockchain_bot_iotagent_kb_ex(
        self,
        request: iotagent_models.UnmountBlockchainBotIotagentKbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UnmountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        Summary: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UnmountBlockchainBotIotagentKbResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.kb.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unmount_blockchain_bot_iotagent_kb_ex_async(
        self,
        request: iotagent_models.UnmountBlockchainBotIotagentKbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UnmountBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        Summary: 知识库挂载管理（IR）：Agent 解绑知识库（幂等）；解绑不删除 KB 资产、不影响其他 Agent 挂载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UnmountBlockchainBotIotagentKbResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.kb.unmount', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotagent_kb(
        self,
        request: iotagent_models.ListBlockchainBotIotagentKbRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        Summary: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotagent_kb_ex(request, headers, runtime)

    async def list_blockchain_bot_iotagent_kb_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentKbRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        Summary: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotagent_kb_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotagent_kb_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotagentKbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        Summary: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentKbResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.kb.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotagent_kb_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentKbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentKbResponse:
        """
        Description: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        Summary: 知识库挂载管理（IR）：查询 Agent 当前挂载的 kbIds（管理视角全集；运行期实际可用由挂载∩可见∩有效派生）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentKbResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.kb.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotagent_model(
        self,
        request: iotagent_models.ListBlockchainBotIotagentModelRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentModelResponse:
        """
        Description: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        Summary: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotagent_model_ex(request, headers, runtime)

    async def list_blockchain_bot_iotagent_model_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentModelRequest,
    ) -> iotagent_models.ListBlockchainBotIotagentModelResponse:
        """
        Description: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        Summary: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotagent_model_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotagent_model_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotagentModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentModelResponse:
        """
        Description: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        Summary: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentModelResponse(),
            self.do_request('1.0', 'blockchain.bot.iotagent.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotagent_model_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotagentModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotagentModelResponse:
        """
        Description: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        Summary: 全局模型目录查询（IR）：按全局 ai_model 目录返回启用模型（modelKey/供应商/能力位/思考等级/默认标记），不按租户隔离；可选 capability 过滤；列表可见≠提交可用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotagentModelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotagent.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def querycontract_blockchain_bot_aiotdatalink_antfinanceassistant(
        self,
        request: iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        Summary: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.querycontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex(request, headers, runtime)

    async def querycontract_blockchain_bot_aiotdatalink_antfinanceassistant_async(
        self,
        request: iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        Summary: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.querycontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(request, headers, runtime)

    def querycontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex(
        self,
        request: iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        Summary: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            self.do_request('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.querycontract', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def querycontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(
        self,
        request: iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        Summary: 蚂小财签约状态查询，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.querycontract', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def signcontract_blockchain_bot_aiotdatalink_antfinanceassistant(
        self,
        request: iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        Summary: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.signcontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex(request, headers, runtime)

    async def signcontract_blockchain_bot_aiotdatalink_antfinanceassistant_async(
        self,
        request: iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        Summary: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.signcontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(request, headers, runtime)

    def signcontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex(
        self,
        request: iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        Summary: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            self.do_request('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.signcontract', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def signcontract_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(
        self,
        request: iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        Summary: 蚂小财签约，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.signcontract', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def chat_blockchain_bot_aiotdatalink_antfinanceassistant(
        self,
        request: iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.chat_blockchain_bot_aiotdatalink_antfinanceassistant_ex(request, headers, runtime)

    async def chat_blockchain_bot_aiotdatalink_antfinanceassistant_async(
        self,
        request: iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.chat_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(request, headers, runtime)

    def chat_blockchain_bot_aiotdatalink_antfinanceassistant_ex(
        self,
        request: iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            self.do_request('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.chat', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def chat_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(
        self,
        request: iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.chat', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def streamchat_blockchain_bot_aiotdatalink_antfinanceassistant(
        self,
        request: iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.streamchat_blockchain_bot_aiotdatalink_antfinanceassistant_ex(request, headers, runtime)

    async def streamchat_blockchain_bot_aiotdatalink_antfinanceassistant_async(
        self,
        request: iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
    ) -> iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.streamchat_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(request, headers, runtime)

    def streamchat_blockchain_bot_aiotdatalink_antfinanceassistant_ex(
        self,
        request: iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            self.do_request('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.streamchat', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def streamchat_blockchain_bot_aiotdatalink_antfinanceassistant_ex_async(
        self,
        request: iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse:
        """
        Description: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        Summary: 蚂小财对话流式接口，参考RPC接口文档：https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiotdatalink.antfinanceassistant.streamchat', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotsuccess_product(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductResponse:
        """
        Description: P01 创建产品，一次性返回明文产品密钥
        Summary: P01 创建产品，一次性返回明文产品密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotsuccess_product_ex(request, headers, runtime)

    async def create_blockchain_bot_iotsuccess_product_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductResponse:
        """
        Description: P01 创建产品，一次性返回明文产品密钥
        Summary: P01 创建产品，一次性返回明文产品密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotsuccess_product_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotsuccess_product_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductResponse:
        """
        Description: P01 创建产品，一次性返回明文产品密钥
        Summary: P01 创建产品，一次性返回明文产品密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotsuccess_product_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductResponse:
        """
        Description: P01 创建产品，一次性返回明文产品密钥
        Summary: P01 创建产品，一次性返回明文产品密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_blockchain_bot_iotsuccess_product(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductResponse:
        """
        Description: P02 产品详情，不含产品密钥
        Summary: P02 产品详情，不含产品密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_blockchain_bot_iotsuccess_product_ex(request, headers, runtime)

    async def detail_blockchain_bot_iotsuccess_product_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductResponse:
        """
        Description: P02 产品详情，不含产品密钥
        Summary: P02 产品详情，不含产品密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_blockchain_bot_iotsuccess_product_ex_async(request, headers, runtime)

    def detail_blockchain_bot_iotsuccess_product_ex(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductResponse:
        """
        Description: P02 产品详情，不含产品密钥
        Summary: P02 产品详情，不含产品密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotsuccessProductResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_blockchain_bot_iotsuccess_product_ex_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductResponse:
        """
        Description: P02 产品详情，不含产品密钥
        Summary: P02 产品详情，不含产品密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotsuccessProductResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockchain_bot_iotsuccess_product(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductResponse:
        """
        Description: P03 更新产品，至少一个可更新字段
        Summary: P03 更新产品，至少一个可更新字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockchain_bot_iotsuccess_product_ex(request, headers, runtime)

    async def update_blockchain_bot_iotsuccess_product_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductResponse:
        """
        Description: P03 更新产品，至少一个可更新字段
        Summary: P03 更新产品，至少一个可更新字段
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockchain_bot_iotsuccess_product_ex_async(request, headers, runtime)

    def update_blockchain_bot_iotsuccess_product_ex(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductResponse:
        """
        Description: P03 更新产品，至少一个可更新字段
        Summary: P03 更新产品，至少一个可更新字段
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockchain_bot_iotsuccess_product_ex_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductResponse:
        """
        Description: P03 更新产品，至少一个可更新字段
        Summary: P03 更新产品，至少一个可更新字段
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductResponse:
        """
        Description: P04 当前租户产品列表
        Summary: P04 当前租户产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductResponse:
        """
        Description: P04 当前租户产品列表
        Summary: P04 当前租户产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductResponse:
        """
        Description: P04 当前租户产品列表
        Summary: P04 当前租户产品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductResponse:
        """
        Description: P04 当前租户产品列表
        Summary: P04 当前租户产品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_category(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductCategoryRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductCategoryResponse:
        """
        Description: P05 可选品类与服务形态、入网及激活组合
        Summary: P05 可选品类与服务形态、入网及激活组合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_category_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_category_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductCategoryRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductCategoryResponse:
        """
        Description: P05 可选品类与服务形态、入网及激活组合
        Summary: P05 可选品类与服务形态、入网及激活组合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_category_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_category_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductCategoryResponse:
        """
        Description: P05 可选品类与服务形态、入网及激活组合
        Summary: P05 可选品类与服务形态、入网及激活组合
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductCategoryResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.category.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_category_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductCategoryResponse:
        """
        Description: P05 可选品类与服务形态、入网及激活组合
        Summary: P05 可选品类与服务形态、入网及激活组合
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductCategoryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.category.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_template_global(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalResponse:
        """
        Description: T01 只读全局模板基线
        Summary: T01 只读全局模板基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_template_global_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_template_global_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalResponse:
        """
        Description: T01 只读全局模板基线
        Summary: T01 只读全局模板基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_template_global_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_template_global_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalResponse:
        """
        Description: T01 只读全局模板基线
        Summary: T01 只读全局模板基线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.global.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_template_global_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalResponse:
        """
        Description: T01 只读全局模板基线
        Summary: T01 只读全局模板基线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductTemplateGlobalResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.global.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotsuccess_product_template(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T02 从零或全局模板创建产品模板
        Summary: T02 从零或全局模板创建产品模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotsuccess_product_template_ex(request, headers, runtime)

    async def create_blockchain_bot_iotsuccess_product_template_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T02 从零或全局模板创建产品模板
        Summary: T02 从零或全局模板创建产品模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotsuccess_product_template_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotsuccess_product_template_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T02 从零或全局模板创建产品模板
        Summary: T02 从零或全局模板创建产品模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductTemplateResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotsuccess_product_template_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T02 从零或全局模板创建产品模板
        Summary: T02 从零或全局模板创建产品模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductTemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_template(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T03 产品模板列表与默认标记
        Summary: T03 产品模板列表与默认标记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_template_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_template_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T03 产品模板列表与默认标记
        Summary: T03 产品模板列表与默认标记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_template_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_template_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T03 产品模板列表与默认标记
        Summary: T03 产品模板列表与默认标记
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductTemplateResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_template_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T03 产品模板列表与默认标记
        Summary: T03 产品模板列表与默认标记
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductTemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_blockchain_bot_iotsuccess_product_template(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T04 模板全部配置
        Summary: T04 模板全部配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_blockchain_bot_iotsuccess_product_template_ex(request, headers, runtime)

    async def detail_blockchain_bot_iotsuccess_product_template_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T04 模板全部配置
        Summary: T04 模板全部配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_blockchain_bot_iotsuccess_product_template_ex_async(request, headers, runtime)

    def detail_blockchain_bot_iotsuccess_product_template_ex(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T04 模板全部配置
        Summary: T04 模板全部配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotsuccessProductTemplateResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_blockchain_bot_iotsuccess_product_template_ex_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T04 模板全部配置
        Summary: T04 模板全部配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotsuccessProductTemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockchain_bot_iotsuccess_product_template(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T05 更新模板语言、音色、角色、模型及语音参数
        Summary: T05 更新模板语言、音色、角色、模型及语音参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockchain_bot_iotsuccess_product_template_ex(request, headers, runtime)

    async def update_blockchain_bot_iotsuccess_product_template_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T05 更新模板语言、音色、角色、模型及语音参数
        Summary: T05 更新模板语言、音色、角色、模型及语音参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockchain_bot_iotsuccess_product_template_ex_async(request, headers, runtime)

    def update_blockchain_bot_iotsuccess_product_template_ex(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T05 更新模板语言、音色、角色、模型及语音参数
        Summary: T05 更新模板语言、音色、角色、模型及语音参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockchain_bot_iotsuccess_product_template_ex_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T05 更新模板语言、音色、角色、模型及语音参数
        Summary: T05 更新模板语言、音色、角色、模型及语音参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductTemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_iotsuccess_product_template(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T06 默认模板需先切换，最后一个模板不可删
        Summary: T06 默认模板需先切换，最后一个模板不可删
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_iotsuccess_product_template_ex(request, headers, runtime)

    async def delete_blockchain_bot_iotsuccess_product_template_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T06 默认模板需先切换，最后一个模板不可删
        Summary: T06 默认模板需先切换，最后一个模板不可删
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_iotsuccess_product_template_ex_async(request, headers, runtime)

    def delete_blockchain_bot_iotsuccess_product_template_ex(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T06 默认模板需先切换，最后一个模板不可删
        Summary: T06 默认模板需先切换，最后一个模板不可删
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_iotsuccess_product_template_ex_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T06 默认模板需先切换，最后一个模板不可删
        Summary: T06 默认模板需先切换，最后一个模板不可删
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductTemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def default_blockchain_bot_iotsuccess_product_template(
        self,
        request: iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T07 设置唯一默认，只影响新激活设备
        Summary: T07 设置唯一默认，只影响新激活设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.default_blockchain_bot_iotsuccess_product_template_ex(request, headers, runtime)

    async def default_blockchain_bot_iotsuccess_product_template_async(
        self,
        request: iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateRequest,
    ) -> iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T07 设置唯一默认，只影响新激活设备
        Summary: T07 设置唯一默认，只影响新激活设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.default_blockchain_bot_iotsuccess_product_template_ex_async(request, headers, runtime)

    def default_blockchain_bot_iotsuccess_product_template_ex(
        self,
        request: iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T07 设置唯一默认，只影响新激活设备
        Summary: T07 设置唯一默认，只影响新激活设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.template.default', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def default_blockchain_bot_iotsuccess_product_template_ex_async(
        self,
        request: iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateResponse:
        """
        Description: T07 设置唯一默认，只影响新激活设备
        Summary: T07 设置唯一默认，只影响新激活设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DefaultBlockchainBotIotsuccessProductTemplateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.template.default', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_voice(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductVoiceRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductVoiceResponse:
        """
        Description: T08 按语言筛选可选音色
        Summary: T08 按语言筛选可选音色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_voice_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_voice_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductVoiceRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductVoiceResponse:
        """
        Description: T08 按语言筛选可选音色
        Summary: T08 按语言筛选可选音色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_voice_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_voice_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductVoiceResponse:
        """
        Description: T08 按语言筛选可选音色
        Summary: T08 按语言筛选可选音色
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductVoiceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.voice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_voice_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductVoiceResponse:
        """
        Description: T08 按语言筛选可选音色
        Summary: T08 按语言筛选可选音色
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductVoiceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.voice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_model(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductModelRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductModelResponse:
        """
        Description: T09 按产品授权和地区筛选模型
        Summary: T09 按产品授权和地区筛选模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_model_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_model_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductModelRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductModelResponse:
        """
        Description: T09 按产品授权和地区筛选模型
        Summary: T09 按产品授权和地区筛选模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_model_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_model_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductModelResponse:
        """
        Description: T09 按产品授权和地区筛选模型
        Summary: T09 按产品授权和地区筛选模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductModelResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_model_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductModelResponse:
        """
        Description: T09 按产品授权和地区筛选模型
        Summary: T09 按产品授权和地区筛选模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductModelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_plugin_store(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreResponse:
        """
        Description: G01 官方、本租户及显式授权插件目录
        Summary: G01 官方、本租户及显式授权插件目录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_plugin_store_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_plugin_store_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreResponse:
        """
        Description: G01 官方、本租户及显式授权插件目录
        Summary: G01 官方、本租户及显式授权插件目录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_plugin_store_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_plugin_store_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreResponse:
        """
        Description: G01 官方、本租户及显式授权插件目录
        Summary: G01 官方、本租户及显式授权插件目录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.plugin.store.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_plugin_store_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreResponse:
        """
        Description: G01 官方、本租户及显式授权插件目录
        Summary: G01 官方、本租户及显式授权插件目录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductPluginStoreResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.plugin.store.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_plugin_binding(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingResponse:
        """
        Description: G02 产品已绑定插件与生效状态
        Summary: G02 产品已绑定插件与生效状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_plugin_binding_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_plugin_binding_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingResponse:
        """
        Description: G02 产品已绑定插件与生效状态
        Summary: G02 产品已绑定插件与生效状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_plugin_binding_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_plugin_binding_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingResponse:
        """
        Description: G02 产品已绑定插件与生效状态
        Summary: G02 产品已绑定插件与生效状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.plugin.binding.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_plugin_binding_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingResponse:
        """
        Description: G02 产品已绑定插件与生效状态
        Summary: G02 产品已绑定插件与生效状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductPluginBindingResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.plugin.binding.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_blockchain_bot_iotsuccess_product_plugin(
        self,
        request: iotagent_models.BindBlockchainBotIotsuccessProductPluginRequest,
    ) -> iotagent_models.BindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_blockchain_bot_iotsuccess_product_plugin_ex(request, headers, runtime)

    async def bind_blockchain_bot_iotsuccess_product_plugin_async(
        self,
        request: iotagent_models.BindBlockchainBotIotsuccessProductPluginRequest,
    ) -> iotagent_models.BindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_blockchain_bot_iotsuccess_product_plugin_ex_async(request, headers, runtime)

    def bind_blockchain_bot_iotsuccess_product_plugin_ex(
        self,
        request: iotagent_models.BindBlockchainBotIotsuccessProductPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.BindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.BindBlockchainBotIotsuccessProductPluginResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.plugin.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_blockchain_bot_iotsuccess_product_plugin_ex_async(
        self,
        request: iotagent_models.BindBlockchainBotIotsuccessProductPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.BindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        Summary: G03 多选原子绑定，下次交互生效，KB句柄映射kbIds
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.BindBlockchainBotIotsuccessProductPluginResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.plugin.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_blockchain_bot_iotsuccess_product_plugin(
        self,
        request: iotagent_models.UnbindBlockchainBotIotsuccessProductPluginRequest,
    ) -> iotagent_models.UnbindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G04 高风险解绑，必须显式confirm=true
        Summary: G04 高风险解绑，必须显式confirm=true
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_blockchain_bot_iotsuccess_product_plugin_ex(request, headers, runtime)

    async def unbind_blockchain_bot_iotsuccess_product_plugin_async(
        self,
        request: iotagent_models.UnbindBlockchainBotIotsuccessProductPluginRequest,
    ) -> iotagent_models.UnbindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G04 高风险解绑，必须显式confirm=true
        Summary: G04 高风险解绑，必须显式confirm=true
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_blockchain_bot_iotsuccess_product_plugin_ex_async(request, headers, runtime)

    def unbind_blockchain_bot_iotsuccess_product_plugin_ex(
        self,
        request: iotagent_models.UnbindBlockchainBotIotsuccessProductPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UnbindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G04 高风险解绑，必须显式confirm=true
        Summary: G04 高风险解绑，必须显式confirm=true
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UnbindBlockchainBotIotsuccessProductPluginResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.plugin.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_blockchain_bot_iotsuccess_product_plugin_ex_async(
        self,
        request: iotagent_models.UnbindBlockchainBotIotsuccessProductPluginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UnbindBlockchainBotIotsuccessProductPluginResponse:
        """
        Description: G04 高风险解绑，必须显式confirm=true
        Summary: G04 高风险解绑，必须显式confirm=true
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UnbindBlockchainBotIotsuccessProductPluginResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.plugin.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_blockchain_bot_iotsuccess_product_skill(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductSkillRequest,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G05 上传并解析Skill包，返回现有插件创建结果
        Summary: G05 上传并解析Skill包，返回现有插件创建结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_blockchain_bot_iotsuccess_product_skill_ex(request, headers, runtime)

    async def upload_blockchain_bot_iotsuccess_product_skill_async(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductSkillRequest,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G05 上传并解析Skill包，返回现有插件创建结果
        Summary: G05 上传并解析Skill包，返回现有插件创建结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_blockchain_bot_iotsuccess_product_skill_ex_async(request, headers, runtime)

    def upload_blockchain_bot_iotsuccess_product_skill_ex(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductSkillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G05 上传并解析Skill包，返回现有插件创建结果
        Summary: G05 上传并解析Skill包，返回现有插件创建结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UploadBlockchainBotIotsuccessProductSkillResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.skill.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_blockchain_bot_iotsuccess_product_skill_ex_async(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductSkillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G05 上传并解析Skill包，返回现有插件创建结果
        Summary: G05 上传并解析Skill包，返回现有插件创建结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UploadBlockchainBotIotsuccessProductSkillResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.skill.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def status_blockchain_bot_iotsuccess_product_skill(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductSkillRequest,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G06 按pluginId查询已有Skill资产状态
        Summary: G06 按pluginId查询已有Skill资产状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_blockchain_bot_iotsuccess_product_skill_ex(request, headers, runtime)

    async def status_blockchain_bot_iotsuccess_product_skill_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductSkillRequest,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G06 按pluginId查询已有Skill资产状态
        Summary: G06 按pluginId查询已有Skill资产状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_blockchain_bot_iotsuccess_product_skill_ex_async(request, headers, runtime)

    def status_blockchain_bot_iotsuccess_product_skill_ex(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductSkillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G06 按pluginId查询已有Skill资产状态
        Summary: G06 按pluginId查询已有Skill资产状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotsuccessProductSkillResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.skill.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_blockchain_bot_iotsuccess_product_skill_ex_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductSkillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductSkillResponse:
        """
        Description: G06 按pluginId查询已有Skill资产状态
        Summary: G06 按pluginId查询已有Skill资产状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotsuccessProductSkillResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.skill.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotsuccess_product_mcp(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G07 创建MCP站点，保存前校验
        Summary: G07 创建MCP站点，保存前校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotsuccess_product_mcp_ex(request, headers, runtime)

    async def create_blockchain_bot_iotsuccess_product_mcp_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G07 创建MCP站点，保存前校验
        Summary: G07 创建MCP站点，保存前校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotsuccess_product_mcp_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotsuccess_product_mcp_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G07 创建MCP站点，保存前校验
        Summary: G07 创建MCP站点，保存前校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductMcpResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.mcp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotsuccess_product_mcp_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G07 创建MCP站点，保存前校验
        Summary: G07 创建MCP站点，保存前校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductMcpResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.mcp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockchain_bot_iotsuccess_product_mcp(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G08 更新本租户MCP，headers整体替换，省略保持
        Summary: G08 更新本租户MCP，headers整体替换，省略保持
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockchain_bot_iotsuccess_product_mcp_ex(request, headers, runtime)

    async def update_blockchain_bot_iotsuccess_product_mcp_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G08 更新本租户MCP，headers整体替换，省略保持
        Summary: G08 更新本租户MCP，headers整体替换，省略保持
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockchain_bot_iotsuccess_product_mcp_ex_async(request, headers, runtime)

    def update_blockchain_bot_iotsuccess_product_mcp_ex(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G08 更新本租户MCP，headers整体替换，省略保持
        Summary: G08 更新本租户MCP，headers整体替换，省略保持
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductMcpResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.mcp.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockchain_bot_iotsuccess_product_mcp_ex_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G08 更新本租户MCP，headers整体替换，省略保持
        Summary: G08 更新本租户MCP，headers整体替换，省略保持
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductMcpResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.mcp.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_iotsuccess_product_mcp(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G09 被产品或智能体引用不可删除
        Summary: G09 被产品或智能体引用不可删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_iotsuccess_product_mcp_ex(request, headers, runtime)

    async def delete_blockchain_bot_iotsuccess_product_mcp_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G09 被产品或智能体引用不可删除
        Summary: G09 被产品或智能体引用不可删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_iotsuccess_product_mcp_ex_async(request, headers, runtime)

    def delete_blockchain_bot_iotsuccess_product_mcp_ex(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G09 被产品或智能体引用不可删除
        Summary: G09 被产品或智能体引用不可删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductMcpResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.mcp.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_iotsuccess_product_mcp_ex_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G09 被产品或智能体引用不可删除
        Summary: G09 被产品或智能体引用不可删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductMcpResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.mcp.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def validate_blockchain_bot_iotsuccess_product_mcp(
        self,
        request: iotagent_models.ValidateBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.ValidateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G10 校验wss可达与鉴权，不持久化输入
        Summary: G10 校验wss可达与鉴权，不持久化输入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.validate_blockchain_bot_iotsuccess_product_mcp_ex(request, headers, runtime)

    async def validate_blockchain_bot_iotsuccess_product_mcp_async(
        self,
        request: iotagent_models.ValidateBlockchainBotIotsuccessProductMcpRequest,
    ) -> iotagent_models.ValidateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G10 校验wss可达与鉴权，不持久化输入
        Summary: G10 校验wss可达与鉴权，不持久化输入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.validate_blockchain_bot_iotsuccess_product_mcp_ex_async(request, headers, runtime)

    def validate_blockchain_bot_iotsuccess_product_mcp_ex(
        self,
        request: iotagent_models.ValidateBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ValidateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G10 校验wss可达与鉴权，不持久化输入
        Summary: G10 校验wss可达与鉴权，不持久化输入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ValidateBlockchainBotIotsuccessProductMcpResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.mcp.validate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def validate_blockchain_bot_iotsuccess_product_mcp_ex_async(
        self,
        request: iotagent_models.ValidateBlockchainBotIotsuccessProductMcpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ValidateBlockchainBotIotsuccessProductMcpResponse:
        """
        Description: G10 校验wss可达与鉴权，不持久化输入
        Summary: G10 校验wss可达与鉴权，不持久化输入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ValidateBlockchainBotIotsuccessProductMcpResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.mcp.validate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_blockchain_bot_iotsuccess_product_device(
        self,
        request: iotagent_models.ImportBlockchainBotIotsuccessProductDeviceRequest,
    ) -> iotagent_models.ImportBlockchainBotIotsuccessProductDeviceResponse:
        """
        Description: D01 调用已有设备导入，返回成功/已有/无效名单
        Summary: D01 调用已有设备导入，返回成功/已有/无效名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_blockchain_bot_iotsuccess_product_device_ex(request, headers, runtime)

    async def import_blockchain_bot_iotsuccess_product_device_async(
        self,
        request: iotagent_models.ImportBlockchainBotIotsuccessProductDeviceRequest,
    ) -> iotagent_models.ImportBlockchainBotIotsuccessProductDeviceResponse:
        """
        Description: D01 调用已有设备导入，返回成功/已有/无效名单
        Summary: D01 调用已有设备导入，返回成功/已有/无效名单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_blockchain_bot_iotsuccess_product_device_ex_async(request, headers, runtime)

    def import_blockchain_bot_iotsuccess_product_device_ex(
        self,
        request: iotagent_models.ImportBlockchainBotIotsuccessProductDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ImportBlockchainBotIotsuccessProductDeviceResponse:
        """
        Description: D01 调用已有设备导入，返回成功/已有/无效名单
        Summary: D01 调用已有设备导入，返回成功/已有/无效名单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ImportBlockchainBotIotsuccessProductDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.device.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_blockchain_bot_iotsuccess_product_device_ex_async(
        self,
        request: iotagent_models.ImportBlockchainBotIotsuccessProductDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ImportBlockchainBotIotsuccessProductDeviceResponse:
        """
        Description: D01 调用已有设备导入，返回成功/已有/无效名单
        Summary: D01 调用已有设备导入，返回成功/已有/无效名单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ImportBlockchainBotIotsuccessProductDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.device.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def status_blockchain_bot_iotsuccess_product_device_import(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportRequest,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_blockchain_bot_iotsuccess_product_device_import_ex(request, headers, runtime)

    async def status_blockchain_bot_iotsuccess_product_device_import_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportRequest,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_blockchain_bot_iotsuccess_product_device_import_ex_async(request, headers, runtime)

    def status_blockchain_bot_iotsuccess_product_device_import_ex(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.device.import.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_blockchain_bot_iotsuccess_product_device_import_ex_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotsuccessProductDeviceImportResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.device.import.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_iotsuccess_product_knowledgebase(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K01 创建知识库
        Summary: K01 创建知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_iotsuccess_product_knowledgebase_ex(request, headers, runtime)

    async def create_blockchain_bot_iotsuccess_product_knowledgebase_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K01 创建知识库
        Summary: K01 创建知识库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(request, headers, runtime)

    def create_blockchain_bot_iotsuccess_product_knowledgebase_ex(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K01 创建知识库
        Summary: K01 创建知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(
        self,
        request: iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K01 创建知识库
        Summary: K01 创建知识库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_knowledgebase(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K02 按名称类型分页
        Summary: K02 按名称类型分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_knowledgebase_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_knowledgebase_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K02 按名称类型分页
        Summary: K02 按名称类型分页
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_knowledgebase_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K02 按名称类型分页
        Summary: K02 按名称类型分页
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K02 按名称类型分页
        Summary: K02 按名称类型分页
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_blockchain_bot_iotsuccess_product_knowledgebase(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K03 基本信息、内容统计、关联产品
        Summary: K03 基本信息、内容统计、关联产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_blockchain_bot_iotsuccess_product_knowledgebase_ex(request, headers, runtime)

    async def detail_blockchain_bot_iotsuccess_product_knowledgebase_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K03 基本信息、内容统计、关联产品
        Summary: K03 基本信息、内容统计、关联产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(request, headers, runtime)

    def detail_blockchain_bot_iotsuccess_product_knowledgebase_ex(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K03 基本信息、内容统计、关联产品
        Summary: K03 基本信息、内容统计、关联产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(
        self,
        request: iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K03 基本信息、内容统计、关联产品
        Summary: K03 基本信息、内容统计、关联产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DetailBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_blockchain_bot_iotsuccess_product_knowledgebase(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K04 更新名称描述
        Summary: K04 更新名称描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_blockchain_bot_iotsuccess_product_knowledgebase_ex(request, headers, runtime)

    async def update_blockchain_bot_iotsuccess_product_knowledgebase_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K04 更新名称描述
        Summary: K04 更新名称描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(request, headers, runtime)

    def update_blockchain_bot_iotsuccess_product_knowledgebase_ex(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K04 更新名称描述
        Summary: K04 更新名称描述
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(
        self,
        request: iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K04 更新名称描述
        Summary: K04 更新名称描述
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UpdateBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_iotsuccess_product_knowledgebase(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K05 被产品绑定不可删
        Summary: K05 被产品绑定不可删
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_iotsuccess_product_knowledgebase_ex(request, headers, runtime)

    async def delete_blockchain_bot_iotsuccess_product_knowledgebase_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K05 被产品绑定不可删
        Summary: K05 被产品绑定不可删
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(request, headers, runtime)

    def delete_blockchain_bot_iotsuccess_product_knowledgebase_ex(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K05 被产品绑定不可删
        Summary: K05 被产品绑定不可删
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_iotsuccess_product_knowledgebase_ex_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse:
        """
        Description: K05 被产品绑定不可删
        Summary: K05 被产品绑定不可删
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_blockchain_bot_iotsuccess_product_knowledgebase_content(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K06 创建已有知识文档并交给现有解析链
        Summary: K06 创建已有知识文档并交给现有解析链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_blockchain_bot_iotsuccess_product_knowledgebase_content_ex(request, headers, runtime)

    async def upload_blockchain_bot_iotsuccess_product_knowledgebase_content_async(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K06 创建已有知识文档并交给现有解析链
        Summary: K06 创建已有知识文档并交给现有解析链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_blockchain_bot_iotsuccess_product_knowledgebase_content_ex_async(request, headers, runtime)

    def upload_blockchain_bot_iotsuccess_product_knowledgebase_content_ex(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K06 创建已有知识文档并交给现有解析链
        Summary: K06 创建已有知识文档并交给现有解析链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.content.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_blockchain_bot_iotsuccess_product_knowledgebase_content_ex_async(
        self,
        request: iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K06 创建已有知识文档并交给现有解析链
        Summary: K06 创建已有知识文档并交给现有解析链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.UploadBlockchainBotIotsuccessProductKnowledgebaseContentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.content.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def status_blockchain_bot_iotsuccess_product_knowledgebase_content(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K07 按kbId/docId查询已有文档解析状态
        Summary: K07 按kbId/docId查询已有文档解析状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_blockchain_bot_iotsuccess_product_knowledgebase_content_ex(request, headers, runtime)

    async def status_blockchain_bot_iotsuccess_product_knowledgebase_content_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K07 按kbId/docId查询已有文档解析状态
        Summary: K07 按kbId/docId查询已有文档解析状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_blockchain_bot_iotsuccess_product_knowledgebase_content_ex_async(request, headers, runtime)

    def status_blockchain_bot_iotsuccess_product_knowledgebase_content_ex(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K07 按kbId/docId查询已有文档解析状态
        Summary: K07 按kbId/docId查询已有文档解析状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.content.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_blockchain_bot_iotsuccess_product_knowledgebase_content_ex_async(
        self,
        request: iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K07 按kbId/docId查询已有文档解析状态
        Summary: K07 按kbId/docId查询已有文档解析状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIotsuccessProductKnowledgebaseContentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.content.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_iotsuccess_product_knowledgebase_content(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K08 调用已有文档删除与索引清理
        Summary: K08 调用已有文档删除与索引清理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_iotsuccess_product_knowledgebase_content_ex(request, headers, runtime)

    async def delete_blockchain_bot_iotsuccess_product_knowledgebase_content_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K08 调用已有文档删除与索引清理
        Summary: K08 调用已有文档删除与索引清理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_iotsuccess_product_knowledgebase_content_ex_async(request, headers, runtime)

    def delete_blockchain_bot_iotsuccess_product_knowledgebase_content_ex(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K08 调用已有文档删除与索引清理
        Summary: K08 调用已有文档删除与索引清理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.content.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_iotsuccess_product_knowledgebase_content_ex_async(
        self,
        request: iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse:
        """
        Description: K08 调用已有文档删除与索引清理
        Summary: K08 调用已有文档删除与索引清理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.DeleteBlockchainBotIotsuccessProductKnowledgebaseContentResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.content.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_blockchain_bot_iotsuccess_product_knowledgebase_trigger(
        self,
        request: iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest,
    ) -> iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse:
        """
        Description: K09 关键词、意图、实体组合触发
        Summary: K09 关键词、意图、实体组合触发
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_blockchain_bot_iotsuccess_product_knowledgebase_trigger_ex(request, headers, runtime)

    async def set_blockchain_bot_iotsuccess_product_knowledgebase_trigger_async(
        self,
        request: iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest,
    ) -> iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse:
        """
        Description: K09 关键词、意图、实体组合触发
        Summary: K09 关键词、意图、实体组合触发
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_blockchain_bot_iotsuccess_product_knowledgebase_trigger_ex_async(request, headers, runtime)

    def set_blockchain_bot_iotsuccess_product_knowledgebase_trigger_ex(
        self,
        request: iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse:
        """
        Description: K09 关键词、意图、实体组合触发
        Summary: K09 关键词、意图、实体组合触发
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.trigger.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_blockchain_bot_iotsuccess_product_knowledgebase_trigger_ex_async(
        self,
        request: iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse:
        """
        Description: K09 关键词、意图、实体组合触发
        Summary: K09 关键词、意图、实体组合触发
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.SetBlockchainBotIotsuccessProductKnowledgebaseTriggerResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.trigger.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def test_blockchain_bot_iotsuccess_product_knowledgebase_recall(
        self,
        request: iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest,
    ) -> iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse:
        """
        Description: K10 已生效版本召回测试
        Summary: K10 已生效版本召回测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.test_blockchain_bot_iotsuccess_product_knowledgebase_recall_ex(request, headers, runtime)

    async def test_blockchain_bot_iotsuccess_product_knowledgebase_recall_async(
        self,
        request: iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest,
    ) -> iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse:
        """
        Description: K10 已生效版本召回测试
        Summary: K10 已生效版本召回测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.test_blockchain_bot_iotsuccess_product_knowledgebase_recall_ex_async(request, headers, runtime)

    def test_blockchain_bot_iotsuccess_product_knowledgebase_recall_ex(
        self,
        request: iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse:
        """
        Description: K10 已生效版本召回测试
        Summary: K10 已生效版本召回测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.recall.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def test_blockchain_bot_iotsuccess_product_knowledgebase_recall_ex_async(
        self,
        request: iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse:
        """
        Description: K10 已生效版本召回测试
        Summary: K10 已生效版本召回测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.TestBlockchainBotIotsuccessProductKnowledgebaseRecallResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.knowledgebase.recall.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_license(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductLicenseRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductLicenseResponse:
        """
        Description: Q01 License码、激活状态、设备、消耗与剩余
        Summary: Q01 License码、激活状态、设备、消耗与剩余
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_license_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_license_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductLicenseRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductLicenseResponse:
        """
        Description: Q01 License码、激活状态、设备、消耗与剩余
        Summary: Q01 License码、激活状态、设备、消耗与剩余
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_license_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_license_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductLicenseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductLicenseResponse:
        """
        Description: Q01 License码、激活状态、设备、消耗与剩余
        Summary: Q01 License码、激活状态、设备、消耗与剩余
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductLicenseResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.license.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_license_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductLicenseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductLicenseResponse:
        """
        Description: Q01 License码、激活状态、设备、消耗与剩余
        Summary: Q01 License码、激活状态、设备、消耗与剩余
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductLicenseResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.license.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def overview_blockchain_bot_iotsuccess_product_quota(
        self,
        request: iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaRequest,
    ) -> iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaResponse:
        """
        Description: Q02 额度总览，带单位和数据时间
        Summary: Q02 额度总览，带单位和数据时间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.overview_blockchain_bot_iotsuccess_product_quota_ex(request, headers, runtime)

    async def overview_blockchain_bot_iotsuccess_product_quota_async(
        self,
        request: iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaRequest,
    ) -> iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaResponse:
        """
        Description: Q02 额度总览，带单位和数据时间
        Summary: Q02 额度总览，带单位和数据时间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.overview_blockchain_bot_iotsuccess_product_quota_ex_async(request, headers, runtime)

    def overview_blockchain_bot_iotsuccess_product_quota_ex(
        self,
        request: iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaResponse:
        """
        Description: Q02 额度总览，带单位和数据时间
        Summary: Q02 额度总览，带单位和数据时间
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.quota.overview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def overview_blockchain_bot_iotsuccess_product_quota_ex_async(
        self,
        request: iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaResponse:
        """
        Description: Q02 额度总览，带单位和数据时间
        Summary: Q02 额度总览，带单位和数据时间
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.OverviewBlockchainBotIotsuccessProductQuotaResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.quota.overview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_blockchain_bot_iotsuccess_product_quota_consumption(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionResponse:
        """
        Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_blockchain_bot_iotsuccess_product_quota_consumption_ex(request, headers, runtime)

    async def list_blockchain_bot_iotsuccess_product_quota_consumption_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionRequest,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionResponse:
        """
        Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_blockchain_bot_iotsuccess_product_quota_consumption_ex_async(request, headers, runtime)

    def list_blockchain_bot_iotsuccess_product_quota_consumption_ex(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionResponse:
        """
        Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotsuccess.product.quota.consumption.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_blockchain_bot_iotsuccess_product_quota_consumption_ex_async(
        self,
        request: iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionResponse:
        """
        Description: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        Summary: Q03 UTC+8日周月聚合，范围左闭右开不超过366天
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.ListBlockchainBotIotsuccessProductQuotaConsumptionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotsuccess.product.quota.consumption.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def status_blockchain_bot_ioa_product_device_import(
        self,
        request: iotagent_models.StatusBlockchainBotIoaProductDeviceImportRequest,
    ) -> iotagent_models.StatusBlockchainBotIoaProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_blockchain_bot_ioa_product_device_import_ex(request, headers, runtime)

    async def status_blockchain_bot_ioa_product_device_import_async(
        self,
        request: iotagent_models.StatusBlockchainBotIoaProductDeviceImportRequest,
    ) -> iotagent_models.StatusBlockchainBotIoaProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_blockchain_bot_ioa_product_device_import_ex_async(request, headers, runtime)

    def status_blockchain_bot_ioa_product_device_import_ex(
        self,
        request: iotagent_models.StatusBlockchainBotIoaProductDeviceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIoaProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIoaProductDeviceImportResponse(),
            self.do_request('1.0', 'blockchain.bot.ioa.product.device.import.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_blockchain_bot_ioa_product_device_import_ex_async(
        self,
        request: iotagent_models.StatusBlockchainBotIoaProductDeviceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.StatusBlockchainBotIoaProductDeviceImportResponse:
        """
        Description: D02 按产品和MAC查询当前注册状态
        Summary: D02 按产品和MAC查询当前注册状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.StatusBlockchainBotIoaProductDeviceImportResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.ioa.product.device.import.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: iotagent_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> iotagent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: iotagent_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> iotagent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: iotagent_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: iotagent_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> iotagent_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            iotagent_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
