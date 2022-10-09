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
            # 网页取证具体信息
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
                    'sdk_version': '1.16.24',
                    '_prod_code': 'BCCR',
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
            # 网页取证具体信息
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
                    'sdk_version': '1.16.24',
                    '_prod_code': 'BCCR',
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
        return TeaCore.from_map(
            bccr_models.GetUploadurlResponse(),
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
        return TeaCore.from_map(
            bccr_models.GetUploadurlResponse(),
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
        return TeaCore.from_map(
            bccr_models.AddHashregisterResponse(),
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
        return TeaCore.from_map(
            bccr_models.AddHashregisterResponse(),
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
        return TeaCore.from_map(
            bccr_models.AddRegisterResponse(),
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
        return TeaCore.from_map(
            bccr_models.AddRegisterResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryRegisterstatusResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryRegisterstatusResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateCertificateResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateCertificateResponse(),
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
        return TeaCore.from_map(
            bccr_models.GetCertificateResponse(),
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
        return TeaCore.from_map(
            bccr_models.GetCertificateResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateMonitorTaskResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateMonitorTaskResponse(),
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
        return TeaCore.from_map(
            bccr_models.StopMonitorTaskResponse(),
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
        return TeaCore.from_map(
            bccr_models.StopMonitorTaskResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryMonitorTaskResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryMonitorTaskResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryMonitorResultResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryMonitorResultResponse(),
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
        return TeaCore.from_map(
            bccr_models.ListMonitorProviderResponse(),
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
        return TeaCore.from_map(
            bccr_models.ListMonitorProviderResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateRecodescreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateRecodescreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryRecodescreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryRecodescreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryUserResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryUserResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryUserListResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryUserListResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateScreenshotResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateScreenshotResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryScreenshotResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryScreenshotResponse(),
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
        return TeaCore.from_map(
            bccr_models.VerifyBlockchainResponse(),
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
        return TeaCore.from_map(
            bccr_models.VerifyBlockchainResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateRecordscreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.CreateRecordscreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryRecordscreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.QueryRecordscreenResponse(),
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
        return TeaCore.from_map(
            bccr_models.ListNotaryResponse(),
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
        return TeaCore.from_map(
            bccr_models.ListNotaryResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_directmonitor_task(
        self,
        request: bccr_models.CreateDirectmonitorTaskRequest,
    ) -> bccr_models.CreateDirectmonitorTaskResponse:
        """
        Description: 新增版权定向监测任务
        Summary: 新增版权定向监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_directmonitor_task_ex(request, headers, runtime)

    async def create_directmonitor_task_async(
        self,
        request: bccr_models.CreateDirectmonitorTaskRequest,
    ) -> bccr_models.CreateDirectmonitorTaskResponse:
        """
        Description: 新增版权定向监测任务
        Summary: 新增版权定向监测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_directmonitor_task_ex_async(request, headers, runtime)

    def create_directmonitor_task_ex(
        self,
        request: bccr_models.CreateDirectmonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDirectmonitorTaskResponse:
        """
        Description: 新增版权定向监测任务
        Summary: 新增版权定向监测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDirectmonitorTaskResponse(),
            self.do_request('1.0', 'blockchain.bccr.directmonitor.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_directmonitor_task_ex_async(
        self,
        request: bccr_models.CreateDirectmonitorTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDirectmonitorTaskResponse:
        """
        Description: 新增版权定向监测任务
        Summary: 新增版权定向监测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDirectmonitorTaskResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.directmonitor.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_directmonitor_result(
        self,
        request: bccr_models.QueryDirectmonitorResultRequest,
    ) -> bccr_models.QueryDirectmonitorResultResponse:
        """
        Description: 查询版权定向监测结果
        Summary: 查询版权定向监测结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_directmonitor_result_ex(request, headers, runtime)

    async def query_directmonitor_result_async(
        self,
        request: bccr_models.QueryDirectmonitorResultRequest,
    ) -> bccr_models.QueryDirectmonitorResultResponse:
        """
        Description: 查询版权定向监测结果
        Summary: 查询版权定向监测结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_directmonitor_result_ex_async(request, headers, runtime)

    def query_directmonitor_result_ex(
        self,
        request: bccr_models.QueryDirectmonitorResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDirectmonitorResultResponse:
        """
        Description: 查询版权定向监测结果
        Summary: 查询版权定向监测结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDirectmonitorResultResponse(),
            self.do_request('1.0', 'blockchain.bccr.directmonitor.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_directmonitor_result_ex_async(
        self,
        request: bccr_models.QueryDirectmonitorResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDirectmonitorResultResponse:
        """
        Description: 查询版权定向监测结果
        Summary: 查询版权定向监测结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDirectmonitorResultResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.directmonitor.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dci_preregistration(
        self,
        request: bccr_models.CreateDciPreregistrationRequest,
    ) -> bccr_models.CreateDciPreregistrationResponse:
        """
        Description: DCI预登记
        Summary: dci预登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dci_preregistration_ex(request, headers, runtime)

    async def create_dci_preregistration_async(
        self,
        request: bccr_models.CreateDciPreregistrationRequest,
    ) -> bccr_models.CreateDciPreregistrationResponse:
        """
        Description: DCI预登记
        Summary: dci预登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dci_preregistration_ex_async(request, headers, runtime)

    def create_dci_preregistration_ex(
        self,
        request: bccr_models.CreateDciPreregistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDciPreregistrationResponse:
        """
        Description: DCI预登记
        Summary: dci预登记
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDciPreregistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.preregistration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dci_preregistration_ex_async(
        self,
        request: bccr_models.CreateDciPreregistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDciPreregistrationResponse:
        """
        Description: DCI预登记
        Summary: dci预登记
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDciPreregistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.preregistration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_preregistration(
        self,
        request: bccr_models.QueryDciPreregistrationRequest,
    ) -> bccr_models.QueryDciPreregistrationResponse:
        """
        Description: 查询dci预登记信息
        Summary: 查询dci预登记信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_preregistration_ex(request, headers, runtime)

    async def query_dci_preregistration_async(
        self,
        request: bccr_models.QueryDciPreregistrationRequest,
    ) -> bccr_models.QueryDciPreregistrationResponse:
        """
        Description: 查询dci预登记信息
        Summary: 查询dci预登记信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_preregistration_ex_async(request, headers, runtime)

    def query_dci_preregistration_ex(
        self,
        request: bccr_models.QueryDciPreregistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPreregistrationResponse:
        """
        Description: 查询dci预登记信息
        Summary: 查询dci预登记信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPreregistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.preregistration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_preregistration_ex_async(
        self,
        request: bccr_models.QueryDciPreregistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPreregistrationResponse:
        """
        Description: 查询dci预登记信息
        Summary: 查询dci预登记信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPreregistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.preregistration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dci_user(
        self,
        request: bccr_models.AddDciUserRequest,
    ) -> bccr_models.AddDciUserResponse:
        """
        Description: 注册dci账号
        Summary: 注册dci账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dci_user_ex(request, headers, runtime)

    async def add_dci_user_async(
        self,
        request: bccr_models.AddDciUserRequest,
    ) -> bccr_models.AddDciUserResponse:
        """
        Description: 注册dci账号
        Summary: 注册dci账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dci_user_ex_async(request, headers, runtime)

    def add_dci_user_ex(
        self,
        request: bccr_models.AddDciUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddDciUserResponse:
        """
        Description: 注册dci账号
        Summary: 注册dci账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.AddDciUserResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.user.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dci_user_ex_async(
        self,
        request: bccr_models.AddDciUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddDciUserResponse:
        """
        Description: 注册dci账号
        Summary: 注册dci账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.AddDciUserResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.user.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_dci_preregistration(
        self,
        request: bccr_models.RetryDciPreregistrationRequest,
    ) -> bccr_models.RetryDciPreregistrationResponse:
        """
        Description: dci预登记再确认
        Summary: dci预登记再确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_dci_preregistration_ex(request, headers, runtime)

    async def retry_dci_preregistration_async(
        self,
        request: bccr_models.RetryDciPreregistrationRequest,
    ) -> bccr_models.RetryDciPreregistrationResponse:
        """
        Description: dci预登记再确认
        Summary: dci预登记再确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_dci_preregistration_ex_async(request, headers, runtime)

    def retry_dci_preregistration_ex(
        self,
        request: bccr_models.RetryDciPreregistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RetryDciPreregistrationResponse:
        """
        Description: dci预登记再确认
        Summary: dci预登记再确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RetryDciPreregistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.preregistration.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_dci_preregistration_ex_async(
        self,
        request: bccr_models.RetryDciPreregistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RetryDciPreregistrationResponse:
        """
        Description: dci预登记再确认
        Summary: dci预登记再确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RetryDciPreregistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.preregistration.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_user(
        self,
        request: bccr_models.QueryDciUserRequest,
    ) -> bccr_models.QueryDciUserResponse:
        """
        Description: 查询dci账号信息
        Summary: 查询dci账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_user_ex(request, headers, runtime)

    async def query_dci_user_async(
        self,
        request: bccr_models.QueryDciUserRequest,
    ) -> bccr_models.QueryDciUserResponse:
        """
        Description: 查询dci账号信息
        Summary: 查询dci账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_user_ex_async(request, headers, runtime)

    def query_dci_user_ex(
        self,
        request: bccr_models.QueryDciUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciUserResponse:
        """
        Description: 查询dci账号信息
        Summary: 查询dci账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciUserResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_user_ex_async(
        self,
        request: bccr_models.QueryDciUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciUserResponse:
        """
        Description: 查询dci账号信息
        Summary: 查询dci账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciUserResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_preregpublication(
        self,
        request: bccr_models.QueryDciPreregpublicationRequest,
    ) -> bccr_models.QueryDciPreregpublicationResponse:
        """
        Description: Dci预登记公示地址查询
        Summary: Dci预登记公示地址查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_preregpublication_ex(request, headers, runtime)

    async def query_dci_preregpublication_async(
        self,
        request: bccr_models.QueryDciPreregpublicationRequest,
    ) -> bccr_models.QueryDciPreregpublicationResponse:
        """
        Description: Dci预登记公示地址查询
        Summary: Dci预登记公示地址查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_preregpublication_ex_async(request, headers, runtime)

    def query_dci_preregpublication_ex(
        self,
        request: bccr_models.QueryDciPreregpublicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPreregpublicationResponse:
        """
        Description: Dci预登记公示地址查询
        Summary: Dci预登记公示地址查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPreregpublicationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.preregpublication.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_preregpublication_ex_async(
        self,
        request: bccr_models.QueryDciPreregpublicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPreregpublicationResponse:
        """
        Description: Dci预登记公示地址查询
        Summary: Dci预登记公示地址查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPreregpublicationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.preregpublication.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dci_user(
        self,
        request: bccr_models.UpdateDciUserRequest,
    ) -> bccr_models.UpdateDciUserResponse:
        """
        Description: 更新dci账号信息
        Summary: 更新dci账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dci_user_ex(request, headers, runtime)

    async def update_dci_user_async(
        self,
        request: bccr_models.UpdateDciUserRequest,
    ) -> bccr_models.UpdateDciUserResponse:
        """
        Description: 更新dci账号信息
        Summary: 更新dci账号信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dci_user_ex_async(request, headers, runtime)

    def update_dci_user_ex(
        self,
        request: bccr_models.UpdateDciUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.UpdateDciUserResponse:
        """
        Description: 更新dci账号信息
        Summary: 更新dci账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.UpdateDciUserResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dci_user_ex_async(
        self,
        request: bccr_models.UpdateDciUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.UpdateDciUserResponse:
        """
        Description: 更新dci账号信息
        Summary: 更新dci账号信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.UpdateDciUserResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dci_registration(
        self,
        request: bccr_models.CreateDciRegistrationRequest,
    ) -> bccr_models.CreateDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dci_registration_ex(request, headers, runtime)

    async def create_dci_registration_async(
        self,
        request: bccr_models.CreateDciRegistrationRequest,
    ) -> bccr_models.CreateDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dci_registration_ex_async(request, headers, runtime)

    def create_dci_registration_ex(
        self,
        request: bccr_models.CreateDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dci_registration_ex_async(
        self,
        request: bccr_models.CreateDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_registrationsubmit(
        self,
        request: bccr_models.QueryDciRegistrationsubmitRequest,
    ) -> bccr_models.QueryDciRegistrationsubmitResponse:
        """
        Description: 查询数登提交状态
        Summary: 查询数登提交状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_registrationsubmit_ex(request, headers, runtime)

    async def query_dci_registrationsubmit_async(
        self,
        request: bccr_models.QueryDciRegistrationsubmitRequest,
    ) -> bccr_models.QueryDciRegistrationsubmitResponse:
        """
        Description: 查询数登提交状态
        Summary: 查询数登提交状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_registrationsubmit_ex_async(request, headers, runtime)

    def query_dci_registrationsubmit_ex(
        self,
        request: bccr_models.QueryDciRegistrationsubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciRegistrationsubmitResponse:
        """
        Description: 查询数登提交状态
        Summary: 查询数登提交状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciRegistrationsubmitResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationsubmit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_registrationsubmit_ex_async(
        self,
        request: bccr_models.QueryDciRegistrationsubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciRegistrationsubmitResponse:
        """
        Description: 查询数登提交状态
        Summary: 查询数登提交状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciRegistrationsubmitResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationsubmit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_registration(
        self,
        request: bccr_models.QueryDciRegistrationRequest,
    ) -> bccr_models.QueryDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_registration_ex(request, headers, runtime)

    async def query_dci_registration_async(
        self,
        request: bccr_models.QueryDciRegistrationRequest,
    ) -> bccr_models.QueryDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_registration_ex_async(request, headers, runtime)

    def query_dci_registration_ex(
        self,
        request: bccr_models.QueryDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_registration_ex_async(
        self,
        request: bccr_models.QueryDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dci_registrationcert(
        self,
        request: bccr_models.GetDciRegistrationcertRequest,
    ) -> bccr_models.GetDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dci_registrationcert_ex(request, headers, runtime)

    async def get_dci_registrationcert_async(
        self,
        request: bccr_models.GetDciRegistrationcertRequest,
    ) -> bccr_models.GetDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dci_registrationcert_ex_async(request, headers, runtime)

    def get_dci_registrationcert_ex(
        self,
        request: bccr_models.GetDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dci_registrationcert_ex_async(
        self,
        request: bccr_models.GetDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_contentsecurity(
        self,
        request: bccr_models.QueryDciContentsecurityRequest,
    ) -> bccr_models.QueryDciContentsecurityResponse:
        """
        Description: 查询内容安全审核详情
        Summary: 查询内容安全审核详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_contentsecurity_ex(request, headers, runtime)

    async def query_dci_contentsecurity_async(
        self,
        request: bccr_models.QueryDciContentsecurityRequest,
    ) -> bccr_models.QueryDciContentsecurityResponse:
        """
        Description: 查询内容安全审核详情
        Summary: 查询内容安全审核详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_contentsecurity_ex_async(request, headers, runtime)

    def query_dci_contentsecurity_ex(
        self,
        request: bccr_models.QueryDciContentsecurityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciContentsecurityResponse:
        """
        Description: 查询内容安全审核详情
        Summary: 查询内容安全审核详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciContentsecurityResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.contentsecurity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_contentsecurity_ex_async(
        self,
        request: bccr_models.QueryDciContentsecurityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciContentsecurityResponse:
        """
        Description: 查询内容安全审核详情
        Summary: 查询内容安全审核详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciContentsecurityResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.contentsecurity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dci_registrationcert(
        self,
        request: bccr_models.CreateDciRegistrationcertRequest,
    ) -> bccr_models.CreateDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dci_registrationcert_ex(request, headers, runtime)

    async def create_dci_registrationcert_async(
        self,
        request: bccr_models.CreateDciRegistrationcertRequest,
    ) -> bccr_models.CreateDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dci_registrationcert_ex_async(request, headers, runtime)

    def create_dci_registrationcert_ex(
        self,
        request: bccr_models.CreateDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dci_registrationcert_ex_async(
        self,
        request: bccr_models.CreateDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_registrationcert(
        self,
        request: bccr_models.QueryDciRegistrationcertRequest,
    ) -> bccr_models.QueryDciRegistrationcertResponse:
        """
        Description: 查询数字登记证书
        Summary: 查询数字登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_registrationcert_ex(request, headers, runtime)

    async def query_dci_registrationcert_async(
        self,
        request: bccr_models.QueryDciRegistrationcertRequest,
    ) -> bccr_models.QueryDciRegistrationcertResponse:
        """
        Description: 查询数字登记证书
        Summary: 查询数字登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_registrationcert_ex_async(request, headers, runtime)

    def query_dci_registrationcert_ex(
        self,
        request: bccr_models.QueryDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciRegistrationcertResponse:
        """
        Description: 查询数字登记证书
        Summary: 查询数字登记证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_registrationcert_ex_async(
        self,
        request: bccr_models.QueryDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciRegistrationcertResponse:
        """
        Description: 查询数字登记证书
        Summary: 查询数字登记证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dci_payurl(
        self,
        request: bccr_models.GetDciPayurlRequest,
    ) -> bccr_models.GetDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dci_payurl_ex(request, headers, runtime)

    async def get_dci_payurl_async(
        self,
        request: bccr_models.GetDciPayurlRequest,
    ) -> bccr_models.GetDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dci_payurl_ex_async(request, headers, runtime)

    def get_dci_payurl_ex(
        self,
        request: bccr_models.GetDciPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetDciPayurlResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.payurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dci_payurl_ex_async(
        self,
        request: bccr_models.GetDciPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetDciPayurlResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.payurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_pay(
        self,
        request: bccr_models.QueryDciPayRequest,
    ) -> bccr_models.QueryDciPayResponse:
        """
        Description: 查询支付
        Summary: 数登支付-查询支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_pay_ex(request, headers, runtime)

    async def query_dci_pay_async(
        self,
        request: bccr_models.QueryDciPayRequest,
    ) -> bccr_models.QueryDciPayResponse:
        """
        Description: 查询支付
        Summary: 数登支付-查询支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_pay_ex_async(request, headers, runtime)

    def query_dci_pay_ex(
        self,
        request: bccr_models.QueryDciPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPayResponse:
        """
        Description: 查询支付
        Summary: 数登支付-查询支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPayResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.pay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_pay_ex_async(
        self,
        request: bccr_models.QueryDciPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPayResponse:
        """
        Description: 查询支付
        Summary: 数登支付-查询支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPayResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.pay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_dci_payresult(
        self,
        request: bccr_models.CallbackDciPayresultRequest,
    ) -> bccr_models.CallbackDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_dci_payresult_ex(request, headers, runtime)

    async def callback_dci_payresult_async(
        self,
        request: bccr_models.CallbackDciPayresultRequest,
    ) -> bccr_models.CallbackDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_dci_payresult_ex_async(request, headers, runtime)

    def callback_dci_payresult_ex(
        self,
        request: bccr_models.CallbackDciPayresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CallbackDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CallbackDciPayresultResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.payresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_dci_payresult_ex_async(
        self,
        request: bccr_models.CallbackDciPayresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CallbackDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CallbackDciPayresultResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.payresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_dci_registration(
        self,
        request: bccr_models.RefuseDciRegistrationRequest,
    ) -> bccr_models.RefuseDciRegistrationResponse:
        """
        Description: dci数登审核失败结果回调
        Summary: dci数登审核失败结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_dci_registration_ex(request, headers, runtime)

    async def refuse_dci_registration_async(
        self,
        request: bccr_models.RefuseDciRegistrationRequest,
    ) -> bccr_models.RefuseDciRegistrationResponse:
        """
        Description: dci数登审核失败结果回调
        Summary: dci数登审核失败结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_dci_registration_ex_async(request, headers, runtime)

    def refuse_dci_registration_ex(
        self,
        request: bccr_models.RefuseDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RefuseDciRegistrationResponse:
        """
        Description: dci数登审核失败结果回调
        Summary: dci数登审核失败结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RefuseDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_dci_registration_ex_async(
        self,
        request: bccr_models.RefuseDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RefuseDciRegistrationResponse:
        """
        Description: dci数登审核失败结果回调
        Summary: dci数登审核失败结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RefuseDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_content(
        self,
        request: bccr_models.AddContentRequest,
    ) -> bccr_models.AddContentResponse:
        """
        Description: 添加发布视频内容
        Summary: 发布视频内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_content_ex(request, headers, runtime)

    async def add_content_async(
        self,
        request: bccr_models.AddContentRequest,
    ) -> bccr_models.AddContentResponse:
        """
        Description: 添加发布视频内容
        Summary: 发布视频内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_content_ex_async(request, headers, runtime)

    def add_content_ex(
        self,
        request: bccr_models.AddContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddContentResponse:
        """
        Description: 添加发布视频内容
        Summary: 发布视频内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.AddContentResponse(),
            self.do_request('1.0', 'blockchain.bccr.content.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_content_ex_async(
        self,
        request: bccr_models.AddContentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddContentResponse:
        """
        Description: 添加发布视频内容
        Summary: 发布视频内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.AddContentResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.content.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_content_status(
        self,
        request: bccr_models.QueryContentStatusRequest,
    ) -> bccr_models.QueryContentStatusResponse:
        """
        Description: 查询视频内容状态
        Summary: 查询视频内容状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_content_status_ex(request, headers, runtime)

    async def query_content_status_async(
        self,
        request: bccr_models.QueryContentStatusRequest,
    ) -> bccr_models.QueryContentStatusResponse:
        """
        Description: 查询视频内容状态
        Summary: 查询视频内容状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_content_status_ex_async(request, headers, runtime)

    def query_content_status_ex(
        self,
        request: bccr_models.QueryContentStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryContentStatusResponse:
        """
        Description: 查询视频内容状态
        Summary: 查询视频内容状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryContentStatusResponse(),
            self.do_request('1.0', 'blockchain.bccr.content.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_content_status_ex_async(
        self,
        request: bccr_models.QueryContentStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryContentStatusResponse:
        """
        Description: 查询视频内容状态
        Summary: 查询视频内容状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryContentStatusResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.content.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_content_statistics(
        self,
        request: bccr_models.QueryContentStatisticsRequest,
    ) -> bccr_models.QueryContentStatisticsResponse:
        """
        Description: 查询视频内容统计数据
        Summary: 查询视频内容统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_content_statistics_ex(request, headers, runtime)

    async def query_content_statistics_async(
        self,
        request: bccr_models.QueryContentStatisticsRequest,
    ) -> bccr_models.QueryContentStatisticsResponse:
        """
        Description: 查询视频内容统计数据
        Summary: 查询视频内容统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_content_statistics_ex_async(request, headers, runtime)

    def query_content_statistics_ex(
        self,
        request: bccr_models.QueryContentStatisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryContentStatisticsResponse:
        """
        Description: 查询视频内容统计数据
        Summary: 查询视频内容统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryContentStatisticsResponse(),
            self.do_request('1.0', 'blockchain.bccr.content.statistics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_content_statistics_ex_async(
        self,
        request: bccr_models.QueryContentStatisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryContentStatisticsResponse:
        """
        Description: 查询视频内容统计数据
        Summary: 查询视频内容统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryContentStatisticsResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.content.statistics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_good(
        self,
        request: bccr_models.PublishGoodRequest,
    ) -> bccr_models.PublishGoodResponse:
        """
        Description: 商品发布
        Summary: 商品发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_good_ex(request, headers, runtime)

    async def publish_good_async(
        self,
        request: bccr_models.PublishGoodRequest,
    ) -> bccr_models.PublishGoodResponse:
        """
        Description: 商品发布
        Summary: 商品发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_good_ex_async(request, headers, runtime)

    def publish_good_ex(
        self,
        request: bccr_models.PublishGoodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.PublishGoodResponse:
        """
        Description: 商品发布
        Summary: 商品发布
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.PublishGoodResponse(),
            self.do_request('1.0', 'blockchain.bccr.good.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_good_ex_async(
        self,
        request: bccr_models.PublishGoodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.PublishGoodResponse:
        """
        Description: 商品发布
        Summary: 商品发布
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.PublishGoodResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.good.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_goods_publish(
        self,
        request: bccr_models.QueryGoodsPublishRequest,
    ) -> bccr_models.QueryGoodsPublishResponse:
        """
        Description: 商品发布查询
        Summary: 商品发布查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_goods_publish_ex(request, headers, runtime)

    async def query_goods_publish_async(
        self,
        request: bccr_models.QueryGoodsPublishRequest,
    ) -> bccr_models.QueryGoodsPublishResponse:
        """
        Description: 商品发布查询
        Summary: 商品发布查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_goods_publish_ex_async(request, headers, runtime)

    def query_goods_publish_ex(
        self,
        request: bccr_models.QueryGoodsPublishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryGoodsPublishResponse:
        """
        Description: 商品发布查询
        Summary: 商品发布查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryGoodsPublishResponse(),
            self.do_request('1.0', 'blockchain.bccr.goods.publish.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_goods_publish_ex_async(
        self,
        request: bccr_models.QueryGoodsPublishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryGoodsPublishResponse:
        """
        Description: 商品发布查询
        Summary: 商品发布查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryGoodsPublishResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.goods.publish.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_goods(
        self,
        request: bccr_models.UpdateGoodsRequest,
    ) -> bccr_models.UpdateGoodsResponse:
        """
        Description: 商品更新
        Summary: 商品更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_goods_ex(request, headers, runtime)

    async def update_goods_async(
        self,
        request: bccr_models.UpdateGoodsRequest,
    ) -> bccr_models.UpdateGoodsResponse:
        """
        Description: 商品更新
        Summary: 商品更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_goods_ex_async(request, headers, runtime)

    def update_goods_ex(
        self,
        request: bccr_models.UpdateGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.UpdateGoodsResponse:
        """
        Description: 商品更新
        Summary: 商品更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.UpdateGoodsResponse(),
            self.do_request('1.0', 'blockchain.bccr.goods.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_goods_ex_async(
        self,
        request: bccr_models.UpdateGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.UpdateGoodsResponse:
        """
        Description: 商品更新
        Summary: 商品更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.UpdateGoodsResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.goods.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_goods(
        self,
        request: bccr_models.QueryGoodsRequest,
    ) -> bccr_models.QueryGoodsResponse:
        """
        Description: 商品查询
        Summary: 商品查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_goods_ex(request, headers, runtime)

    async def query_goods_async(
        self,
        request: bccr_models.QueryGoodsRequest,
    ) -> bccr_models.QueryGoodsResponse:
        """
        Description: 商品查询
        Summary: 商品查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_goods_ex_async(request, headers, runtime)

    def query_goods_ex(
        self,
        request: bccr_models.QueryGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryGoodsResponse:
        """
        Description: 商品查询
        Summary: 商品查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryGoodsResponse(),
            self.do_request('1.0', 'blockchain.bccr.goods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_goods_ex_async(
        self,
        request: bccr_models.QueryGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryGoodsResponse:
        """
        Description: 商品查询
        Summary: 商品查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryGoodsResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.goods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
