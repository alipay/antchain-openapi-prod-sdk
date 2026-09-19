# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_aiosproduct import models as aiosproduct_models
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
        config: aiosproduct_models.Config,
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
            'ignoreSSL': runtime.ignore_ssl
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
                    'sdk_version': '1.0.16',
                    '_prod_code': 'AIOSPRODUCT',
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
            'ignoreSSL': runtime.ignore_ssl
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
                    'sdk_version': '1.0.16',
                    '_prod_code': 'AIOSPRODUCT',
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

    def query_gwdefault_chatstream(
        self,
        request: aiosproduct_models.QueryGwdefaultChatstreamRequest,
    ) -> aiosproduct_models.QueryGwdefaultChatstreamResponse:
        """
        Description: AIOS GwDefault流式输出
        Summary: AIOS GwDefault流式输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwdefault_chatstream_ex(request, headers, runtime)

    async def query_gwdefault_chatstream_async(
        self,
        request: aiosproduct_models.QueryGwdefaultChatstreamRequest,
    ) -> aiosproduct_models.QueryGwdefaultChatstreamResponse:
        """
        Description: AIOS GwDefault流式输出
        Summary: AIOS GwDefault流式输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwdefault_chatstream_ex_async(request, headers, runtime)

    def query_gwdefault_chatstream_ex(
        self,
        request: aiosproduct_models.QueryGwdefaultChatstreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwdefaultChatstreamResponse:
        """
        Description: AIOS GwDefault流式输出
        Summary: AIOS GwDefault流式输出
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwdefaultChatstreamResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwdefault.chatstream.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwdefault_chatstream_ex_async(
        self,
        request: aiosproduct_models.QueryGwdefaultChatstreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwdefaultChatstreamResponse:
        """
        Description: AIOS GwDefault流式输出
        Summary: AIOS GwDefault流式输出
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwdefaultChatstreamResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwdefault.chatstream.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwdefault_chat(
        self,
        request: aiosproduct_models.QueryGwdefaultChatRequest,
    ) -> aiosproduct_models.QueryGwdefaultChatResponse:
        """
        Description: AIOS同步对话
        Summary: AIOS同步对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwdefault_chat_ex(request, headers, runtime)

    async def query_gwdefault_chat_async(
        self,
        request: aiosproduct_models.QueryGwdefaultChatRequest,
    ) -> aiosproduct_models.QueryGwdefaultChatResponse:
        """
        Description: AIOS同步对话
        Summary: AIOS同步对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwdefault_chat_ex_async(request, headers, runtime)

    def query_gwdefault_chat_ex(
        self,
        request: aiosproduct_models.QueryGwdefaultChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwdefaultChatResponse:
        """
        Description: AIOS同步对话
        Summary: AIOS同步对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwdefaultChatResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwdefault.chat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwdefault_chat_ex_async(
        self,
        request: aiosproduct_models.QueryGwdefaultChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwdefaultChatResponse:
        """
        Description: AIOS同步对话
        Summary: AIOS同步对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwdefaultChatResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwdefault.chat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_chatstream(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatstreamRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatstreamResponse:
        """
        Description: AIOS 少儿保险 流式对话
        Summary: AIOS 少儿保险 流式对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_chatstream_ex(request, headers, runtime)

    async def query_gwchildinsurance_chatstream_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatstreamRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatstreamResponse:
        """
        Description: AIOS 少儿保险 流式对话
        Summary: AIOS 少儿保险 流式对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_chatstream_ex_async(request, headers, runtime)

    def query_gwchildinsurance_chatstream_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatstreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatstreamResponse:
        """
        Description: AIOS 少儿保险 流式对话
        Summary: AIOS 少儿保险 流式对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceChatstreamResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.chatstream.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_chatstream_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatstreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatstreamResponse:
        """
        Description: AIOS 少儿保险 流式对话
        Summary: AIOS 少儿保险 流式对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceChatstreamResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.chatstream.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_chat(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatResponse:
        """
        Description: AIOS 少儿保险 非流式对话
        Summary: AIOS 少儿保险 非流式对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_chat_ex(request, headers, runtime)

    async def query_gwchildinsurance_chat_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatResponse:
        """
        Description: AIOS 少儿保险 非流式对话
        Summary: AIOS 少儿保险 非流式对话
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_chat_ex_async(request, headers, runtime)

    def query_gwchildinsurance_chat_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatResponse:
        """
        Description: AIOS 少儿保险 非流式对话
        Summary: AIOS 少儿保险 非流式对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceChatResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.chat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_chat_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceChatResponse:
        """
        Description: AIOS 少儿保险 非流式对话
        Summary: AIOS 少儿保险 非流式对话
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceChatResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.chat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_profilelatest(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfilelatestRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfilelatestResponse:
        """
        Description: 少儿保险最近档案查询
        Summary: 少儿保险最近档案查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_profilelatest_ex(request, headers, runtime)

    async def query_gwchildinsurance_profilelatest_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfilelatestRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfilelatestResponse:
        """
        Description: 少儿保险最近档案查询
        Summary: 少儿保险最近档案查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_profilelatest_ex_async(request, headers, runtime)

    def query_gwchildinsurance_profilelatest_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfilelatestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfilelatestResponse:
        """
        Description: 少儿保险最近档案查询
        Summary: 少儿保险最近档案查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceProfilelatestResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.profilelatest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_profilelatest_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfilelatestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfilelatestResponse:
        """
        Description: 少儿保险最近档案查询
        Summary: 少儿保险最近档案查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceProfilelatestResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.profilelatest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_profiledetail(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfiledetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfiledetailResponse:
        """
        Description: 少儿保险当前会话档案查询
        Summary: 少儿保险当前会话档案查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_profiledetail_ex(request, headers, runtime)

    async def query_gwchildinsurance_profiledetail_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfiledetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfiledetailResponse:
        """
        Description: 少儿保险当前会话档案查询
        Summary: 少儿保险当前会话档案查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_profiledetail_ex_async(request, headers, runtime)

    def query_gwchildinsurance_profiledetail_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfiledetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfiledetailResponse:
        """
        Description: 少儿保险当前会话档案查询
        Summary: 少儿保险当前会话档案查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceProfiledetailResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.profiledetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_profiledetail_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceProfiledetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceProfiledetailResponse:
        """
        Description: 少儿保险当前会话档案查询
        Summary: 少儿保险当前会话档案查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceProfiledetailResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.profiledetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_gwchildinsurance_profile(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceProfileRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceProfileResponse:
        """
        Description: 少儿保险家庭与孩子档案保存
        Summary: 少儿保险家庭与孩子档案保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_gwchildinsurance_profile_ex(request, headers, runtime)

    async def save_gwchildinsurance_profile_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceProfileRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceProfileResponse:
        """
        Description: 少儿保险家庭与孩子档案保存
        Summary: 少儿保险家庭与孩子档案保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_gwchildinsurance_profile_ex_async(request, headers, runtime)

    def save_gwchildinsurance_profile_ex(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceProfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceProfileResponse:
        """
        Description: 少儿保险家庭与孩子档案保存
        Summary: 少儿保险家庭与孩子档案保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceProfileResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.profile.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_gwchildinsurance_profile_ex_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceProfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceProfileResponse:
        """
        Description: 少儿保险家庭与孩子档案保存
        Summary: 少儿保险家庭与孩子档案保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceProfileResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.profile.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_solutionkycdetail(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailResponse:
        """
        Description: 少儿保险 KYC 查询
        Summary: 少儿保险 KYC 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_solutionkycdetail_ex(request, headers, runtime)

    async def query_gwchildinsurance_solutionkycdetail_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailResponse:
        """
        Description: 少儿保险 KYC 查询
        Summary: 少儿保险 KYC 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_solutionkycdetail_ex_async(request, headers, runtime)

    def query_gwchildinsurance_solutionkycdetail_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailResponse:
        """
        Description: 少儿保险 KYC 查询
        Summary: 少儿保险 KYC 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.solutionkycdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_solutionkycdetail_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailResponse:
        """
        Description: 少儿保险 KYC 查询
        Summary: 少儿保险 KYC 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceSolutionkycdetailResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.solutionkycdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_gwchildinsurance_solutionkyc(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceSolutionkycRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceSolutionkycResponse:
        """
        Description: 少儿保险 KYC 保存
        Summary: 少儿保险 KYC 保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_gwchildinsurance_solutionkyc_ex(request, headers, runtime)

    async def save_gwchildinsurance_solutionkyc_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceSolutionkycRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceSolutionkycResponse:
        """
        Description: 少儿保险 KYC 保存
        Summary: 少儿保险 KYC 保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_gwchildinsurance_solutionkyc_ex_async(request, headers, runtime)

    def save_gwchildinsurance_solutionkyc_ex(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceSolutionkycRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceSolutionkycResponse:
        """
        Description: 少儿保险 KYC 保存
        Summary: 少儿保险 KYC 保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceSolutionkycResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.solutionkyc.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_gwchildinsurance_solutionkyc_ex_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceSolutionkycRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceSolutionkycResponse:
        """
        Description: 少儿保险 KYC 保存
        Summary: 少儿保险 KYC 保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceSolutionkycResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.solutionkyc.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwmcpdefault_chat(
        self,
        request: aiosproduct_models.QueryGwmcpdefaultChatRequest,
    ) -> aiosproduct_models.QueryGwmcpdefaultChatResponse:
        """
        Description: mcp网关调用
        Summary: mcp网关调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwmcpdefault_chat_ex(request, headers, runtime)

    async def query_gwmcpdefault_chat_async(
        self,
        request: aiosproduct_models.QueryGwmcpdefaultChatRequest,
    ) -> aiosproduct_models.QueryGwmcpdefaultChatResponse:
        """
        Description: mcp网关调用
        Summary: mcp网关调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwmcpdefault_chat_ex_async(request, headers, runtime)

    def query_gwmcpdefault_chat_ex(
        self,
        request: aiosproduct_models.QueryGwmcpdefaultChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwmcpdefaultChatResponse:
        """
        Description: mcp网关调用
        Summary: mcp网关调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwmcpdefaultChatResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwmcpdefault.chat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwmcpdefault_chat_ex_async(
        self,
        request: aiosproduct_models.QueryGwmcpdefaultChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwmcpdefaultChatResponse:
        """
        Description: mcp网关调用
        Summary: mcp网关调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwmcpdefaultChatResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwmcpdefault.chat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_gwchildinsurance_planningtargets(
        self,
        request: aiosproduct_models.SaveGwchildinsurancePlanningtargetsRequest,
    ) -> aiosproduct_models.SaveGwchildinsurancePlanningtargetsResponse:
        """
        Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_gwchildinsurance_planningtargets_ex(request, headers, runtime)

    async def save_gwchildinsurance_planningtargets_async(
        self,
        request: aiosproduct_models.SaveGwchildinsurancePlanningtargetsRequest,
    ) -> aiosproduct_models.SaveGwchildinsurancePlanningtargetsResponse:
        """
        Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_gwchildinsurance_planningtargets_ex_async(request, headers, runtime)

    def save_gwchildinsurance_planningtargets_ex(
        self,
        request: aiosproduct_models.SaveGwchildinsurancePlanningtargetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsurancePlanningtargetsResponse:
        """
        Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsurancePlanningtargetsResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.planningtargets.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_gwchildinsurance_planningtargets_ex_async(
        self,
        request: aiosproduct_models.SaveGwchildinsurancePlanningtargetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsurancePlanningtargetsResponse:
        """
        Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsurancePlanningtargetsResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.planningtargets.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_planningtargets(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetsRequest,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetsResponse:
        """
        Description: 查询指定用户和会话当前生效的少儿保险规划目标。
        Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_planningtargets_ex(request, headers, runtime)

    async def query_gwchildinsurance_planningtargets_async(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetsRequest,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetsResponse:
        """
        Description: 查询指定用户和会话当前生效的少儿保险规划目标。
        Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_planningtargets_ex_async(request, headers, runtime)

    def query_gwchildinsurance_planningtargets_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetsResponse:
        """
        Description: 查询指定用户和会话当前生效的少儿保险规划目标。
        Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsurancePlanningtargetsResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.planningtargets.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_planningtargets_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetsResponse:
        """
        Description: 查询指定用户和会话当前生效的少儿保险规划目标。
        Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsurancePlanningtargetsResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.planningtargets.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_planningtargetslatest(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestRequest,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestResponse:
        """
        Description: 查询最近选择的孩子
        Summary: 查询最近选择的孩子
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_planningtargetslatest_ex(request, headers, runtime)

    async def query_gwchildinsurance_planningtargetslatest_async(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestRequest,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestResponse:
        """
        Description: 查询最近选择的孩子
        Summary: 查询最近选择的孩子
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_planningtargetslatest_ex_async(request, headers, runtime)

    def query_gwchildinsurance_planningtargetslatest_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestResponse:
        """
        Description: 查询最近选择的孩子
        Summary: 查询最近选择的孩子
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.planningtargetslatest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_planningtargetslatest_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestResponse:
        """
        Description: 查询最近选择的孩子
        Summary: 查询最近选择的孩子
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsurancePlanningtargetslatestResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.planningtargetslatest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_recommendationplandetail(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailResponse:
        """
        Description: 查询推荐方案详情
        Summary: 查询推荐方案详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_recommendationplandetail_ex(request, headers, runtime)

    async def query_gwchildinsurance_recommendationplandetail_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailResponse:
        """
        Description: 查询推荐方案详情
        Summary: 查询推荐方案详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_recommendationplandetail_ex_async(request, headers, runtime)

    def query_gwchildinsurance_recommendationplandetail_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailResponse:
        """
        Description: 查询推荐方案详情
        Summary: 查询推荐方案详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplandetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_recommendationplandetail_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailResponse:
        """
        Description: 查询推荐方案详情
        Summary: 查询推荐方案详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceRecommendationplandetailResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplandetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_gwchildinsurance_recommendationplanadjust(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustResponse:
        """
        Description: 保存H5调整后的方案版本
        Summary: 保存H5调整后的方案版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_gwchildinsurance_recommendationplanadjust_ex(request, headers, runtime)

    async def save_gwchildinsurance_recommendationplanadjust_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustResponse:
        """
        Description: 保存H5调整后的方案版本
        Summary: 保存H5调整后的方案版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_gwchildinsurance_recommendationplanadjust_ex_async(request, headers, runtime)

    def save_gwchildinsurance_recommendationplanadjust_ex(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustResponse:
        """
        Description: 保存H5调整后的方案版本
        Summary: 保存H5调整后的方案版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplanadjust.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_gwchildinsurance_recommendationplanadjust_ex_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustResponse:
        """
        Description: 保存H5调整后的方案版本
        Summary: 保存H5调整后的方案版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceRecommendationplanadjustResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplanadjust.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_gwchildinsurance_recommendationplanconfirm(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmResponse:
        """
        Description: 确认方案及最终价格
        Summary: 确认方案及最终价格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_gwchildinsurance_recommendationplanconfirm_ex(request, headers, runtime)

    async def save_gwchildinsurance_recommendationplanconfirm_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmResponse:
        """
        Description: 确认方案及最终价格
        Summary: 确认方案及最终价格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_gwchildinsurance_recommendationplanconfirm_ex_async(request, headers, runtime)

    def save_gwchildinsurance_recommendationplanconfirm_ex(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmResponse:
        """
        Description: 确认方案及最终价格
        Summary: 确认方案及最终价格
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplanconfirm.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_gwchildinsurance_recommendationplanconfirm_ex_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmResponse:
        """
        Description: 确认方案及最终价格
        Summary: 确认方案及最终价格
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceRecommendationplanconfirmResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplanconfirm.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_recommendationplanhistory(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryResponse:
        """
        Description: 查询历史推荐方案
        Summary: 查询历史推荐方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_recommendationplanhistory_ex(request, headers, runtime)

    async def query_gwchildinsurance_recommendationplanhistory_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryResponse:
        """
        Description: 查询历史推荐方案
        Summary: 查询历史推荐方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_recommendationplanhistory_ex_async(request, headers, runtime)

    def query_gwchildinsurance_recommendationplanhistory_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryResponse:
        """
        Description: 查询历史推荐方案
        Summary: 查询历史推荐方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplanhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_recommendationplanhistory_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryResponse:
        """
        Description: 查询历史推荐方案
        Summary: 查询历史推荐方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceRecommendationplanhistoryResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationplanhistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_gwchildinsurance_activetarget(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceActivetargetRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子设置
        Summary: 少儿保险当前孩子设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_gwchildinsurance_activetarget_ex(request, headers, runtime)

    async def save_gwchildinsurance_activetarget_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceActivetargetRequest,
    ) -> aiosproduct_models.SaveGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子设置
        Summary: 少儿保险当前孩子设置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_gwchildinsurance_activetarget_ex_async(request, headers, runtime)

    def save_gwchildinsurance_activetarget_ex(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceActivetargetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子设置
        Summary: 少儿保险当前孩子设置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceActivetargetResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.activetarget.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_gwchildinsurance_activetarget_ex_async(
        self,
        request: aiosproduct_models.SaveGwchildinsuranceActivetargetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.SaveGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子设置
        Summary: 少儿保险当前孩子设置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.SaveGwchildinsuranceActivetargetResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.activetarget.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_activetarget(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceActivetargetRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子查询
        Summary: 少儿保险当前孩子查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_activetarget_ex(request, headers, runtime)

    async def query_gwchildinsurance_activetarget_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceActivetargetRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子查询
        Summary: 少儿保险当前孩子查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_activetarget_ex_async(request, headers, runtime)

    def query_gwchildinsurance_activetarget_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceActivetargetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子查询
        Summary: 少儿保险当前孩子查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceActivetargetResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.activetarget.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_activetarget_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceActivetargetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceActivetargetResponse:
        """
        Description: 少儿保险当前孩子查询
        Summary: 少儿保险当前孩子查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceActivetargetResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.activetarget.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_recommendationcandidate(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 少儿保险推荐候选详情查询
        Summary: 少儿保险推荐候选详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_recommendationcandidate_ex(request, headers, runtime)

    async def query_gwchildinsurance_recommendationcandidate_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 少儿保险推荐候选详情查询
        Summary: 少儿保险推荐候选详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_recommendationcandidate_ex_async(request, headers, runtime)

    def query_gwchildinsurance_recommendationcandidate_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 少儿保险推荐候选详情查询
        Summary: 少儿保险推荐候选详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_recommendationcandidate_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 少儿保险推荐候选详情查询
        Summary: 少儿保险推荐候选详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceRecommendationcandidateResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_gwchildinsurance_recommendationcandidate(
        self,
        request: aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateRequest,
    ) -> aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 选择预览
        Summary: 选择预览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_gwchildinsurance_recommendationcandidate_ex(request, headers, runtime)

    async def reset_gwchildinsurance_recommendationcandidate_async(
        self,
        request: aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateRequest,
    ) -> aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 选择预览
        Summary: 选择预览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_gwchildinsurance_recommendationcandidate_ex_async(request, headers, runtime)

    def reset_gwchildinsurance_recommendationcandidate_ex(
        self,
        request: aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 选择预览
        Summary: 选择预览
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_gwchildinsurance_recommendationcandidate_ex_async(
        self,
        request: aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateResponse:
        """
        Description: 选择预览
        Summary: 选择预览
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.ResetGwchildinsuranceRecommendationcandidateResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_compareproductlist(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistResponse:
        """
        Description: 商品对比列表查询
        Summary: 商品对比列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_compareproductlist_ex(request, headers, runtime)

    async def query_gwchildinsurance_compareproductlist_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistResponse:
        """
        Description: 商品对比列表查询
        Summary: 商品对比列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_compareproductlist_ex_async(request, headers, runtime)

    def query_gwchildinsurance_compareproductlist_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistResponse:
        """
        Description: 商品对比列表查询
        Summary: 商品对比列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductlistResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_compareproductlist_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistResponse:
        """
        Description: 商品对比列表查询
        Summary: 商品对比列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductlistResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_compareproductdetail(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductdetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductdetailResponse:
        """
        Description: 商品对比详情查询
        Summary: 商品对比详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_compareproductdetail_ex(request, headers, runtime)

    async def query_gwchildinsurance_compareproductdetail_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductdetailRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductdetailResponse:
        """
        Description: 商品对比详情查询
        Summary: 商品对比详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_compareproductdetail_ex_async(request, headers, runtime)

    def query_gwchildinsurance_compareproductdetail_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductdetailResponse:
        """
        Description: 商品对比详情查询
        Summary: 商品对比详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductdetailResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_compareproductdetail_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductdetailResponse:
        """
        Description: 商品对比详情查询
        Summary: 商品对比详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductdetailResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_compareproductlistids(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsResponse:
        """
        Description: 产品对比 ID 列表查询
        Summary: 产品对比 ID 列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_compareproductlistids_ex(request, headers, runtime)

    async def query_gwchildinsurance_compareproductlistids_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsResponse:
        """
        Description: 产品对比 ID 列表查询
        Summary: 产品对比 ID 列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_compareproductlistids_ex_async(request, headers, runtime)

    def query_gwchildinsurance_compareproductlistids_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsResponse:
        """
        Description: 产品对比 ID 列表查询
        Summary: 产品对比 ID 列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductlistids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_compareproductlistids_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsResponse:
        """
        Description: 产品对比 ID 列表查询
        Summary: 产品对比 ID 列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductlistidsResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductlistids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwchildinsurance_compareproductbyids(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsResponse:
        """
        Description: 按 ID 获取产品对比数据
        Summary: 按 ID 获取产品对比数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwchildinsurance_compareproductbyids_ex(request, headers, runtime)

    async def query_gwchildinsurance_compareproductbyids_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsRequest,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsResponse:
        """
        Description: 按 ID 获取产品对比数据
        Summary: 按 ID 获取产品对比数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwchildinsurance_compareproductbyids_ex_async(request, headers, runtime)

    def query_gwchildinsurance_compareproductbyids_ex(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsResponse:
        """
        Description: 按 ID 获取产品对比数据
        Summary: 按 ID 获取产品对比数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductbyids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwchildinsurance_compareproductbyids_ex_async(
        self,
        request: aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsResponse:
        """
        Description: 按 ID 获取产品对比数据
        Summary: 按 ID 获取产品对比数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.QueryGwchildinsuranceCompareproductbyidsResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.compareproductbyids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_gwchildinsurance_optionalresponsibilityplan(
        self,
        request: aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanRequest,
    ) -> aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划详情查询
        Summary: 可选责任计划详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_gwchildinsurance_optionalresponsibilityplan_ex(request, headers, runtime)

    async def detail_gwchildinsurance_optionalresponsibilityplan_async(
        self,
        request: aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanRequest,
    ) -> aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划详情查询
        Summary: 可选责任计划详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_gwchildinsurance_optionalresponsibilityplan_ex_async(request, headers, runtime)

    def detail_gwchildinsurance_optionalresponsibilityplan_ex(
        self,
        request: aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划详情查询
        Summary: 可选责任计划详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_gwchildinsurance_optionalresponsibilityplan_ex_async(
        self,
        request: aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划详情查询
        Summary: 可选责任计划详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.DetailGwchildinsuranceOptionalresponsibilityplanResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resolve_gwchildinsurance_optionalresponsibilityplan(
        self,
        request: aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanRequest,
    ) -> aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划按因子反查
        Summary: 可选责任计划按因子反查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resolve_gwchildinsurance_optionalresponsibilityplan_ex(request, headers, runtime)

    async def resolve_gwchildinsurance_optionalresponsibilityplan_async(
        self,
        request: aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanRequest,
    ) -> aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划按因子反查
        Summary: 可选责任计划按因子反查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resolve_gwchildinsurance_optionalresponsibilityplan_ex_async(request, headers, runtime)

    def resolve_gwchildinsurance_optionalresponsibilityplan_ex(
        self,
        request: aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划按因子反查
        Summary: 可选责任计划按因子反查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanResponse(),
            self.do_request('1.0', 'antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.resolve', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resolve_gwchildinsurance_optionalresponsibilityplan_ex_async(
        self,
        request: aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanResponse:
        """
        Description: 可选责任计划按因子反查
        Summary: 可选责任计划按因子反查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            aiosproduct_models.ResolveGwchildinsuranceOptionalresponsibilityplanResponse(),
            await self.do_request_async('1.0', 'antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.resolve', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
