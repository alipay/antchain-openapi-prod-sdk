# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_gatewayx import models as gatewayx_models
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
        config: gatewayx_models.Config,
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
            # 消息发送结果
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
                    'sdk_version': '1.0.13',
                    '_prod_code': 'GATEWAYX',
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
            # 消息发送结果
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
                    'sdk_version': '1.0.13',
                    '_prod_code': 'GATEWAYX',
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

    def create_bizevent_message(
        self,
        request: gatewayx_models.CreateBizeventMessageRequest,
    ) -> gatewayx_models.CreateBizeventMessageResponse:
        """
        Description: 接收业务事件消息，并将相关消息投递给对应的接手方
        Summary: 事件消息创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_bizevent_message_ex(request, headers, runtime)

    async def create_bizevent_message_async(
        self,
        request: gatewayx_models.CreateBizeventMessageRequest,
    ) -> gatewayx_models.CreateBizeventMessageResponse:
        """
        Description: 接收业务事件消息，并将相关消息投递给对应的接手方
        Summary: 事件消息创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_bizevent_message_ex_async(request, headers, runtime)

    def create_bizevent_message_ex(
        self,
        request: gatewayx_models.CreateBizeventMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.CreateBizeventMessageResponse:
        """
        Description: 接收业务事件消息，并将相关消息投递给对应的接手方
        Summary: 事件消息创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.CreateBizeventMessageResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.bizevent.message.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_bizevent_message_ex_async(
        self,
        request: gatewayx_models.CreateBizeventMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.CreateBizeventMessageResponse:
        """
        Description: 接收业务事件消息，并将相关消息投递给对应的接手方
        Summary: 事件消息创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.CreateBizeventMessageResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.bizevent.message.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_file_upload(
        self,
        request: gatewayx_models.CreateFileUploadRequest,
    ) -> gatewayx_models.CreateFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_file_upload_ex(request, headers, runtime)

    async def create_file_upload_async(
        self,
        request: gatewayx_models.CreateFileUploadRequest,
    ) -> gatewayx_models.CreateFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_file_upload_ex_async(request, headers, runtime)

    def create_file_upload_ex(
        self,
        request: gatewayx_models.CreateFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.CreateFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.CreateFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_file_upload_ex_async(
        self,
        request: gatewayx_models.CreateFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.CreateFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.CreateFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_file_download(
        self,
        request: gatewayx_models.GetFileDownloadRequest,
    ) -> gatewayx_models.GetFileDownloadResponse:
        """
        Description: 创建HTTP GET获取的文件下载
        Summary: 下载地址获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_file_download_ex(request, headers, runtime)

    async def get_file_download_async(
        self,
        request: gatewayx_models.GetFileDownloadRequest,
    ) -> gatewayx_models.GetFileDownloadResponse:
        """
        Description: 创建HTTP GET获取的文件下载
        Summary: 下载地址获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_file_download_ex_async(request, headers, runtime)

    def get_file_download_ex(
        self,
        request: gatewayx_models.GetFileDownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.GetFileDownloadResponse:
        """
        Description: 创建HTTP GET获取的文件下载
        Summary: 下载地址获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.GetFileDownloadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.download.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_file_download_ex_async(
        self,
        request: gatewayx_models.GetFileDownloadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.GetFileDownloadResponse:
        """
        Description: 创建HTTP GET获取的文件下载
        Summary: 下载地址获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.GetFileDownloadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.download.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_message_failed(
        self,
        request: gatewayx_models.QueryMessageFailedRequest,
    ) -> gatewayx_models.QueryMessageFailedResponse:
        """
        Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
        Summary: 查询最后一次发送仍然失败的消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_message_failed_ex(request, headers, runtime)

    async def query_message_failed_async(
        self,
        request: gatewayx_models.QueryMessageFailedRequest,
    ) -> gatewayx_models.QueryMessageFailedResponse:
        """
        Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
        Summary: 查询最后一次发送仍然失败的消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_message_failed_ex_async(request, headers, runtime)

    def query_message_failed_ex(
        self,
        request: gatewayx_models.QueryMessageFailedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.QueryMessageFailedResponse:
        """
        Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
        Summary: 查询最后一次发送仍然失败的消息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.QueryMessageFailedResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.message.failed.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_message_failed_ex_async(
        self,
        request: gatewayx_models.QueryMessageFailedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.QueryMessageFailedResponse:
        """
        Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
        Summary: 查询最后一次发送仍然失败的消息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.QueryMessageFailedResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.message.failed.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_message_result(
        self,
        request: gatewayx_models.QueryMessageResultRequest,
    ) -> gatewayx_models.QueryMessageResultResponse:
        """
        Description: 消息发送结果查询
        Summary: 消息发送结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_message_result_ex(request, headers, runtime)

    async def query_message_result_async(
        self,
        request: gatewayx_models.QueryMessageResultRequest,
    ) -> gatewayx_models.QueryMessageResultResponse:
        """
        Description: 消息发送结果查询
        Summary: 消息发送结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_message_result_ex_async(request, headers, runtime)

    def query_message_result_ex(
        self,
        request: gatewayx_models.QueryMessageResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.QueryMessageResultResponse:
        """
        Description: 消息发送结果查询
        Summary: 消息发送结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.QueryMessageResultResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.message.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_message_result_ex_async(
        self,
        request: gatewayx_models.QueryMessageResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gatewayx_models.QueryMessageResultResponse:
        """
        Description: 消息发送结果查询
        Summary: 消息发送结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gatewayx_models.QueryMessageResultResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.message.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
