# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_bccr import models as bccr_models
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
        config: bccr_models.Config,
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
            # 监测提供商能力
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
                    'sdk_version': '1.12.0'
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
            # 监测提供商能力
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
                    'sdk_version': '1.12.0'
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

    def get_uploadurl(
        self,
        request: bccr_models.GetUploadurlRequest,
    ) -> bccr_models.GetUploadurlResponse:
        """
        Description: 调用接口获取版权开放平台授权访问oss链接
        Summary: 获取授权访问oss链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_uploadurl_ex(request, headers, runtime)

    async def get_uploadurl_async(
        self,
        request: bccr_models.GetUploadurlRequest,
    ) -> bccr_models.GetUploadurlResponse:
        """
        Description: 调用接口获取版权开放平台授权访问oss链接
        Summary: 获取授权访问oss链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_uploadurl_ex_async(request, headers, runtime)

    def get_uploadurl_ex(
        self,
        request: bccr_models.GetUploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetUploadurlResponse:
        """
        Description: 调用接口获取版权开放平台授权访问oss链接
        Summary: 获取授权访问oss链接
        """
        UtilClient.validate_model(request)
        return bccr_models.GetUploadurlResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.uploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_uploadurl_ex_async(
        self,
        request: bccr_models.GetUploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetUploadurlResponse:
        """
        Description: 调用接口获取版权开放平台授权访问oss链接
        Summary: 获取授权访问oss链接
        """
        UtilClient.validate_model(request)
        return bccr_models.GetUploadurlResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.uploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_hashregister(
        self,
        request: bccr_models.AddHashregisterRequest,
    ) -> bccr_models.AddHashregisterResponse:
        """
        Description: 版权开发平台hash登记
        Summary: 新增HASH版权登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_hashregister_ex(request, headers, runtime)

    async def add_hashregister_async(
        self,
        request: bccr_models.AddHashregisterRequest,
    ) -> bccr_models.AddHashregisterResponse:
        """
        Description: 版权开发平台hash登记
        Summary: 新增HASH版权登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_hashregister_ex_async(request, headers, runtime)

    def add_hashregister_ex(
        self,
        request: bccr_models.AddHashregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddHashregisterResponse:
        """
        Description: 版权开发平台hash登记
        Summary: 新增HASH版权登记
        """
        UtilClient.validate_model(request)
        return bccr_models.AddHashregisterResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.hashregister.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_hashregister_ex_async(
        self,
        request: bccr_models.AddHashregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddHashregisterResponse:
        """
        Description: 版权开发平台hash登记
        Summary: 新增HASH版权登记
        """
        UtilClient.validate_model(request)
        return bccr_models.AddHashregisterResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.hashregister.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_register(
        self,
        request: bccr_models.AddRegisterRequest,
    ) -> bccr_models.AddRegisterResponse:
        """
        Description: 版权平台新增版权登记
        Summary: 新增版权登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_register_ex(request, headers, runtime)

    async def add_register_async(
        self,
        request: bccr_models.AddRegisterRequest,
    ) -> bccr_models.AddRegisterResponse:
        """
        Description: 版权平台新增版权登记
        Summary: 新增版权登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_register_ex_async(request, headers, runtime)

    def add_register_ex(
        self,
        request: bccr_models.AddRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddRegisterResponse:
        """
        Description: 版权平台新增版权登记
        Summary: 新增版权登记
        """
        UtilClient.validate_model(request)
        return bccr_models.AddRegisterResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.register.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_register_ex_async(
        self,
        request: bccr_models.AddRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddRegisterResponse:
        """
        Description: 版权平台新增版权登记
        Summary: 新增版权登记
        """
        UtilClient.validate_model(request)
        return bccr_models.AddRegisterResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.register.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_registerstatus(
        self,
        request: bccr_models.QueryRegisterstatusRequest,
    ) -> bccr_models.QueryRegisterstatusResponse:
        """
        Description: 版权平台查询版权登记状态
        Summary: 查询版权登记状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_registerstatus_ex(request, headers, runtime)

    async def query_registerstatus_async(
        self,
        request: bccr_models.QueryRegisterstatusRequest,
    ) -> bccr_models.QueryRegisterstatusResponse:
        """
        Description: 版权平台查询版权登记状态
        Summary: 查询版权登记状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_registerstatus_ex_async(request, headers, runtime)

    def query_registerstatus_ex(
        self,
        request: bccr_models.QueryRegisterstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryRegisterstatusResponse:
        """
        Description: 版权平台查询版权登记状态
        Summary: 查询版权登记状态
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryRegisterstatusResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.registerstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_registerstatus_ex_async(
        self,
        request: bccr_models.QueryRegisterstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryRegisterstatusResponse:
        """
        Description: 版权平台查询版权登记状态
        Summary: 查询版权登记状态
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryRegisterstatusResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.registerstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_certificate(
        self,
        request: bccr_models.CreateCertificateRequest,
    ) -> bccr_models.CreateCertificateResponse:
        """
        Description: 版权平台生成版权登记证书
        Summary: 生成版权登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_certificate_ex(request, headers, runtime)

    async def create_certificate_async(
        self,
        request: bccr_models.CreateCertificateRequest,
    ) -> bccr_models.CreateCertificateResponse:
        """
        Description: 版权平台生成版权登记证书
        Summary: 生成版权登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_certificate_ex_async(request, headers, runtime)

    def create_certificate_ex(
        self,
        request: bccr_models.CreateCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateCertificateResponse:
        """
        Description: 版权平台生成版权登记证书
        Summary: 生成版权登记证书
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateCertificateResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.certificate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_certificate_ex_async(
        self,
        request: bccr_models.CreateCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateCertificateResponse:
        """
        Description: 版权平台生成版权登记证书
        Summary: 生成版权登记证书
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateCertificateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.certificate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_certificate(
        self,
        request: bccr_models.GetCertificateRequest,
    ) -> bccr_models.GetCertificateResponse:
        """
        Description: 版权平台获取版权登记证书
        Summary: 获取版权登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_certificate_ex(request, headers, runtime)

    async def get_certificate_async(
        self,
        request: bccr_models.GetCertificateRequest,
    ) -> bccr_models.GetCertificateResponse:
        """
        Description: 版权平台获取版权登记证书
        Summary: 获取版权登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_certificate_ex_async(request, headers, runtime)

    def get_certificate_ex(
        self,
        request: bccr_models.GetCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetCertificateResponse:
        """
        Description: 版权平台获取版权登记证书
        Summary: 获取版权登记证书
        """
        UtilClient.validate_model(request)
        return bccr_models.GetCertificateResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_certificate_ex_async(
        self,
        request: bccr_models.GetCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetCertificateResponse:
        """
        Description: 版权平台获取版权登记证书
        Summary: 获取版权登记证书
        """
        UtilClient.validate_model(request)
        return bccr_models.GetCertificateResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_monitor_task(
        self,
        request: bccr_models.CreateMonitorTaskRequest,
    ) -> bccr_models.CreateMonitorTaskResponse:
        """
        Description: 新增版权监测任务
        Summary: 新增版权监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_monitor_task_ex(request, headers, runtime)

    async def create_monitor_task_async(
        self,
        request: bccr_models.CreateMonitorTaskRequest,
    ) -> bccr_models.CreateMonitorTaskResponse:
        """
        Description: 新增版权监测任务
        Summary: 新增版权监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_monitor_task_ex_async(request, headers, runtime)

    def create_monitor_task_ex(
        self,
        request: bccr_models.CreateMonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateMonitorTaskResponse:
        """
        Description: 新增版权监测任务
        Summary: 新增版权监测
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateMonitorTaskResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.monitor.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_monitor_task_ex_async(
        self,
        request: bccr_models.CreateMonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateMonitorTaskResponse:
        """
        Description: 新增版权监测任务
        Summary: 新增版权监测
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateMonitorTaskResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.monitor.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_monitor_task(
        self,
        request: bccr_models.StopMonitorTaskRequest,
    ) -> bccr_models.StopMonitorTaskResponse:
        """
        Description: 停止版权监测任务
        Summary: 停止版权监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_monitor_task_ex(request, headers, runtime)

    async def stop_monitor_task_async(
        self,
        request: bccr_models.StopMonitorTaskRequest,
    ) -> bccr_models.StopMonitorTaskResponse:
        """
        Description: 停止版权监测任务
        Summary: 停止版权监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_monitor_task_ex_async(request, headers, runtime)

    def stop_monitor_task_ex(
        self,
        request: bccr_models.StopMonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.StopMonitorTaskResponse:
        """
        Description: 停止版权监测任务
        Summary: 停止版权监测
        """
        UtilClient.validate_model(request)
        return bccr_models.StopMonitorTaskResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.monitor.task.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_monitor_task_ex_async(
        self,
        request: bccr_models.StopMonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.StopMonitorTaskResponse:
        """
        Description: 停止版权监测任务
        Summary: 停止版权监测
        """
        UtilClient.validate_model(request)
        return bccr_models.StopMonitorTaskResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.monitor.task.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_monitor_task(
        self,
        request: bccr_models.QueryMonitorTaskRequest,
    ) -> bccr_models.QueryMonitorTaskResponse:
        """
        Description: 查询版权监测任务
        Summary: 查询版权监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_monitor_task_ex(request, headers, runtime)

    async def query_monitor_task_async(
        self,
        request: bccr_models.QueryMonitorTaskRequest,
    ) -> bccr_models.QueryMonitorTaskResponse:
        """
        Description: 查询版权监测任务
        Summary: 查询版权监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_monitor_task_ex_async(request, headers, runtime)

    def query_monitor_task_ex(
        self,
        request: bccr_models.QueryMonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryMonitorTaskResponse:
        """
        Description: 查询版权监测任务
        Summary: 查询版权监测
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryMonitorTaskResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.monitor.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_monitor_task_ex_async(
        self,
        request: bccr_models.QueryMonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryMonitorTaskResponse:
        """
        Description: 查询版权监测任务
        Summary: 查询版权监测
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryMonitorTaskResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.monitor.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_monitor_result(
        self,
        request: bccr_models.QueryMonitorResultRequest,
    ) -> bccr_models.QueryMonitorResultResponse:
        """
        Description: 查询版权任务监测结果
        Summary: 查询版权监测结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_monitor_result_ex(request, headers, runtime)

    async def query_monitor_result_async(
        self,
        request: bccr_models.QueryMonitorResultRequest,
    ) -> bccr_models.QueryMonitorResultResponse:
        """
        Description: 查询版权任务监测结果
        Summary: 查询版权监测结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_monitor_result_ex_async(request, headers, runtime)

    def query_monitor_result_ex(
        self,
        request: bccr_models.QueryMonitorResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryMonitorResultResponse:
        """
        Description: 查询版权任务监测结果
        Summary: 查询版权监测结果
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryMonitorResultResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.monitor.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_monitor_result_ex_async(
        self,
        request: bccr_models.QueryMonitorResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryMonitorResultResponse:
        """
        Description: 查询版权任务监测结果
        Summary: 查询版权监测结果
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryMonitorResultResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.monitor.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_monitor_provider(
        self,
        request: bccr_models.ListMonitorProviderRequest,
    ) -> bccr_models.ListMonitorProviderResponse:
        """
        Description: 获取传播监测能力服务商列表
        Summary: 获取传播监测能力服务商列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_monitor_provider_ex(request, headers, runtime)

    async def list_monitor_provider_async(
        self,
        request: bccr_models.ListMonitorProviderRequest,
    ) -> bccr_models.ListMonitorProviderResponse:
        """
        Description: 获取传播监测能力服务商列表
        Summary: 获取传播监测能力服务商列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_monitor_provider_ex_async(request, headers, runtime)

    def list_monitor_provider_ex(
        self,
        request: bccr_models.ListMonitorProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ListMonitorProviderResponse:
        """
        Description: 获取传播监测能力服务商列表
        Summary: 获取传播监测能力服务商列表
        """
        UtilClient.validate_model(request)
        return bccr_models.ListMonitorProviderResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.monitor.provider.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_monitor_provider_ex_async(
        self,
        request: bccr_models.ListMonitorProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ListMonitorProviderResponse:
        """
        Description: 获取传播监测能力服务商列表
        Summary: 获取传播监测能力服务商列表
        """
        UtilClient.validate_model(request)
        return bccr_models.ListMonitorProviderResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.monitor.provider.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_recodescreen(
        self,
        request: bccr_models.CreateRecodescreenRequest,
    ) -> bccr_models.CreateRecodescreenResponse:
        """
        Description: 创建录屏取证(废弃)
        Summary: 创建录屏取证(废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_recodescreen_ex(request, headers, runtime)

    async def create_recodescreen_async(
        self,
        request: bccr_models.CreateRecodescreenRequest,
    ) -> bccr_models.CreateRecodescreenResponse:
        """
        Description: 创建录屏取证(废弃)
        Summary: 创建录屏取证(废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_recodescreen_ex_async(request, headers, runtime)

    def create_recodescreen_ex(
        self,
        request: bccr_models.CreateRecodescreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateRecodescreenResponse:
        """
        Description: 创建录屏取证(废弃)
        Summary: 创建录屏取证(废弃)
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateRecodescreenResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.recodescreen.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_recodescreen_ex_async(
        self,
        request: bccr_models.CreateRecodescreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateRecodescreenResponse:
        """
        Description: 创建录屏取证(废弃)
        Summary: 创建录屏取证(废弃)
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateRecodescreenResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.recodescreen.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_recodescreen(
        self,
        request: bccr_models.QueryRecodescreenRequest,
    ) -> bccr_models.QueryRecodescreenResponse:
        """
        Description: 查询录屏取证(废弃)
        Summary: 查询录屏取证(废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_recodescreen_ex(request, headers, runtime)

    async def query_recodescreen_async(
        self,
        request: bccr_models.QueryRecodescreenRequest,
    ) -> bccr_models.QueryRecodescreenResponse:
        """
        Description: 查询录屏取证(废弃)
        Summary: 查询录屏取证(废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_recodescreen_ex_async(request, headers, runtime)

    def query_recodescreen_ex(
        self,
        request: bccr_models.QueryRecodescreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryRecodescreenResponse:
        """
        Description: 查询录屏取证(废弃)
        Summary: 查询录屏取证(废弃)
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryRecodescreenResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.recodescreen.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_recodescreen_ex_async(
        self,
        request: bccr_models.QueryRecodescreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryRecodescreenResponse:
        """
        Description: 查询录屏取证(废弃)
        Summary: 查询录屏取证(废弃)
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryRecodescreenResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.recodescreen.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user(
        self,
        request: bccr_models.QueryUserRequest,
    ) -> bccr_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_ex(request, headers, runtime)

    async def query_user_async(
        self,
        request: bccr_models.QueryUserRequest,
    ) -> bccr_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_ex_async(request, headers, runtime)

    def query_user_ex(
        self,
        request: bccr_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryUserResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_ex_async(
        self,
        request: bccr_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryUserResponse:
        """
        Description: 用户信息查询
        Summary: 用户信息查询
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryUserResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_list(
        self,
        request: bccr_models.QueryUserListRequest,
    ) -> bccr_models.QueryUserListResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_list_ex(request, headers, runtime)

    async def query_user_list_async(
        self,
        request: bccr_models.QueryUserListRequest,
    ) -> bccr_models.QueryUserListResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_list_ex_async(request, headers, runtime)

    def query_user_list_ex(
        self,
        request: bccr_models.QueryUserListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryUserListResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryUserListResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.user.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_list_ex_async(
        self,
        request: bccr_models.QueryUserListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryUserListResponse:
        """
        Description: 查询用户信息列表
        Summary: 查询用户信息列表
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryUserListResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.user.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_screenshot(
        self,
        request: bccr_models.CreateScreenshotRequest,
    ) -> bccr_models.CreateScreenshotResponse:
        """
        Description: 创建网页取证
        Summary: 创建网页取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_screenshot_ex(request, headers, runtime)

    async def create_screenshot_async(
        self,
        request: bccr_models.CreateScreenshotRequest,
    ) -> bccr_models.CreateScreenshotResponse:
        """
        Description: 创建网页取证
        Summary: 创建网页取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_screenshot_ex_async(request, headers, runtime)

    def create_screenshot_ex(
        self,
        request: bccr_models.CreateScreenshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateScreenshotResponse:
        """
        Description: 创建网页取证
        Summary: 创建网页取证
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateScreenshotResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.screenshot.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_screenshot_ex_async(
        self,
        request: bccr_models.CreateScreenshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateScreenshotResponse:
        """
        Description: 创建网页取证
        Summary: 创建网页取证
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateScreenshotResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.screenshot.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_screenshot(
        self,
        request: bccr_models.QueryScreenshotRequest,
    ) -> bccr_models.QueryScreenshotResponse:
        """
        Description: 查询网页取证
        Summary: 查询网页取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_screenshot_ex(request, headers, runtime)

    async def query_screenshot_async(
        self,
        request: bccr_models.QueryScreenshotRequest,
    ) -> bccr_models.QueryScreenshotResponse:
        """
        Description: 查询网页取证
        Summary: 查询网页取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_screenshot_ex_async(request, headers, runtime)

    def query_screenshot_ex(
        self,
        request: bccr_models.QueryScreenshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryScreenshotResponse:
        """
        Description: 查询网页取证
        Summary: 查询网页取证
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryScreenshotResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.screenshot.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_screenshot_ex_async(
        self,
        request: bccr_models.QueryScreenshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryScreenshotResponse:
        """
        Description: 查询网页取证
        Summary: 查询网页取证
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryScreenshotResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.screenshot.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_blockchain(
        self,
        request: bccr_models.VerifyBlockchainRequest,
    ) -> bccr_models.VerifyBlockchainResponse:
        """
        Description: 链上核验
        Summary: 链上核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_blockchain_ex(request, headers, runtime)

    async def verify_blockchain_async(
        self,
        request: bccr_models.VerifyBlockchainRequest,
    ) -> bccr_models.VerifyBlockchainResponse:
        """
        Description: 链上核验
        Summary: 链上核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_blockchain_ex_async(request, headers, runtime)

    def verify_blockchain_ex(
        self,
        request: bccr_models.VerifyBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.VerifyBlockchainResponse:
        """
        Description: 链上核验
        Summary: 链上核验
        """
        UtilClient.validate_model(request)
        return bccr_models.VerifyBlockchainResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.blockchain.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_blockchain_ex_async(
        self,
        request: bccr_models.VerifyBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.VerifyBlockchainResponse:
        """
        Description: 链上核验
        Summary: 链上核验
        """
        UtilClient.validate_model(request)
        return bccr_models.VerifyBlockchainResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.blockchain.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_recordscreen(
        self,
        request: bccr_models.CreateRecordscreenRequest,
    ) -> bccr_models.CreateRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_recordscreen_ex(request, headers, runtime)

    async def create_recordscreen_async(
        self,
        request: bccr_models.CreateRecordscreenRequest,
    ) -> bccr_models.CreateRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_recordscreen_ex_async(request, headers, runtime)

    def create_recordscreen_ex(
        self,
        request: bccr_models.CreateRecordscreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateRecordscreenResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.recordscreen.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_recordscreen_ex_async(
        self,
        request: bccr_models.CreateRecordscreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        UtilClient.validate_model(request)
        return bccr_models.CreateRecordscreenResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.recordscreen.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_recordscreen(
        self,
        request: bccr_models.QueryRecordscreenRequest,
    ) -> bccr_models.QueryRecordscreenResponse:
        """
        Description: 查询录屏取证
        Summary: 查询录屏取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_recordscreen_ex(request, headers, runtime)

    async def query_recordscreen_async(
        self,
        request: bccr_models.QueryRecordscreenRequest,
    ) -> bccr_models.QueryRecordscreenResponse:
        """
        Description: 查询录屏取证
        Summary: 查询录屏取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_recordscreen_ex_async(request, headers, runtime)

    def query_recordscreen_ex(
        self,
        request: bccr_models.QueryRecordscreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryRecordscreenResponse:
        """
        Description: 查询录屏取证
        Summary: 查询录屏取证
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryRecordscreenResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.recordscreen.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_recordscreen_ex_async(
        self,
        request: bccr_models.QueryRecordscreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryRecordscreenResponse:
        """
        Description: 查询录屏取证
        Summary: 查询录屏取证
        """
        UtilClient.validate_model(request)
        return bccr_models.QueryRecordscreenResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.recordscreen.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_notary(
        self,
        request: bccr_models.ListNotaryRequest,
    ) -> bccr_models.ListNotaryResponse:
        """
        Description: 获取支持的公证处列表
        Summary: 获取支持的公证处列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_notary_ex(request, headers, runtime)

    async def list_notary_async(
        self,
        request: bccr_models.ListNotaryRequest,
    ) -> bccr_models.ListNotaryResponse:
        """
        Description: 获取支持的公证处列表
        Summary: 获取支持的公证处列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_notary_ex_async(request, headers, runtime)

    def list_notary_ex(
        self,
        request: bccr_models.ListNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ListNotaryResponse:
        """
        Description: 获取支持的公证处列表
        Summary: 获取支持的公证处列表
        """
        UtilClient.validate_model(request)
        return bccr_models.ListNotaryResponse().from_map(
            self.do_request('1.0', 'blockchain.bccr.notary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_notary_ex_async(
        self,
        request: bccr_models.ListNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ListNotaryResponse:
        """
        Description: 获取支持的公证处列表
        Summary: 获取支持的公证处列表
        """
        UtilClient.validate_model(request)
        return bccr_models.ListNotaryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bccr.notary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
