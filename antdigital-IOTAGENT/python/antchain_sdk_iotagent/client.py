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
                    'sdk_version': '1.2.14',
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
                    'sdk_version': '1.2.14',
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
        Description: sse聊天
        Summary: sse聊天
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.chat_blockchain_bot_iotagent_session_ex(request, headers, runtime)

    async def chat_blockchain_bot_iotagent_session_async(
        self,
        request: iotagent_models.ChatBlockchainBotIotagentSessionRequest,
    ) -> iotagent_models.ChatBlockchainBotIotagentSessionResponse:
        """
        Description: sse聊天
        Summary: sse聊天
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
        Description: sse聊天
        Summary: sse聊天
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
        Description: sse聊天
        Summary: sse聊天
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
