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
            # 相似位置信息
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
                    'sdk_version': '1.19.12',
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
            # 相似位置信息
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
                    'sdk_version': '1.19.12',
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
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_registrationsubmit_ex(request, headers, runtime)

    async def query_dci_registrationsubmit_async(
        self,
        request: bccr_models.QueryDciRegistrationsubmitRequest,
    ) -> bccr_models.QueryDciRegistrationsubmitResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
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
        Description: 已废弃接口
        Summary: 已废弃接口
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
        Description: 已废弃接口
        Summary: 已废弃接口
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
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_registrationcert_ex(request, headers, runtime)

    async def query_dci_registrationcert_async(
        self,
        request: bccr_models.QueryDciRegistrationcertRequest,
    ) -> bccr_models.QueryDciRegistrationcertResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
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
        Description: 已废弃接口
        Summary: 已废弃接口
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
        Description: 已废弃接口
        Summary: 已废弃接口
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
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_pay_ex(request, headers, runtime)

    async def query_dci_pay_async(
        self,
        request: bccr_models.QueryDciPayRequest,
    ) -> bccr_models.QueryDciPayResponse:
        """
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
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
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
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
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
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
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_dci_registration_ex(request, headers, runtime)

    async def refuse_dci_registration_async(
        self,
        request: bccr_models.RefuseDciRegistrationRequest,
    ) -> bccr_models.RefuseDciRegistrationResponse:
        """
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
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
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
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
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RefuseDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_notary_bidreason(
        self,
        request: bccr_models.QueryNotaryBidreasonRequest,
    ) -> bccr_models.QueryNotaryBidreasonResponse:
        """
        Description: 版权平台获取申办事由配置
        Summary: 获取申办事由配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_notary_bidreason_ex(request, headers, runtime)

    async def query_notary_bidreason_async(
        self,
        request: bccr_models.QueryNotaryBidreasonRequest,
    ) -> bccr_models.QueryNotaryBidreasonResponse:
        """
        Description: 版权平台获取申办事由配置
        Summary: 获取申办事由配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_notary_bidreason_ex_async(request, headers, runtime)

    def query_notary_bidreason_ex(
        self,
        request: bccr_models.QueryNotaryBidreasonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryBidreasonResponse:
        """
        Description: 版权平台获取申办事由配置
        Summary: 获取申办事由配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryBidreasonResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.bidreason.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_notary_bidreason_ex_async(
        self,
        request: bccr_models.QueryNotaryBidreasonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryBidreasonResponse:
        """
        Description: 版权平台获取申办事由配置
        Summary: 获取申办事由配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryBidreasonResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.bidreason.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_notary_documenttosign(
        self,
        request: bccr_models.QueryNotaryDocumenttosignRequest,
    ) -> bccr_models.QueryNotaryDocumenttosignResponse:
        """
        Description: 获取签署文件
        Summary: 获取签署文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_notary_documenttosign_ex(request, headers, runtime)

    async def query_notary_documenttosign_async(
        self,
        request: bccr_models.QueryNotaryDocumenttosignRequest,
    ) -> bccr_models.QueryNotaryDocumenttosignResponse:
        """
        Description: 获取签署文件
        Summary: 获取签署文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_notary_documenttosign_ex_async(request, headers, runtime)

    def query_notary_documenttosign_ex(
        self,
        request: bccr_models.QueryNotaryDocumenttosignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryDocumenttosignResponse:
        """
        Description: 获取签署文件
        Summary: 获取签署文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryDocumenttosignResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.documenttosign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_notary_documenttosign_ex_async(
        self,
        request: bccr_models.QueryNotaryDocumenttosignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryDocumenttosignResponse:
        """
        Description: 获取签署文件
        Summary: 获取签署文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryDocumenttosignResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.documenttosign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_notary_order(
        self,
        request: bccr_models.ApplyNotaryOrderRequest,
    ) -> bccr_models.ApplyNotaryOrderResponse:
        """
        Description: 提交申办订单
        Summary: 提交申办订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_notary_order_ex(request, headers, runtime)

    async def apply_notary_order_async(
        self,
        request: bccr_models.ApplyNotaryOrderRequest,
    ) -> bccr_models.ApplyNotaryOrderResponse:
        """
        Description: 提交申办订单
        Summary: 提交申办订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_notary_order_ex_async(request, headers, runtime)

    def apply_notary_order_ex(
        self,
        request: bccr_models.ApplyNotaryOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ApplyNotaryOrderResponse:
        """
        Description: 提交申办订单
        Summary: 提交申办订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ApplyNotaryOrderResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.order.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_notary_order_ex_async(
        self,
        request: bccr_models.ApplyNotaryOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ApplyNotaryOrderResponse:
        """
        Description: 提交申办订单
        Summary: 提交申办订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ApplyNotaryOrderResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.order.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_notary_payurl(
        self,
        request: bccr_models.QueryNotaryPayurlRequest,
    ) -> bccr_models.QueryNotaryPayurlResponse:
        """
        Description: 公证出证重新获取支付链接
        Summary: 重新获取支付链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_notary_payurl_ex(request, headers, runtime)

    async def query_notary_payurl_async(
        self,
        request: bccr_models.QueryNotaryPayurlRequest,
    ) -> bccr_models.QueryNotaryPayurlResponse:
        """
        Description: 公证出证重新获取支付链接
        Summary: 重新获取支付链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_notary_payurl_ex_async(request, headers, runtime)

    def query_notary_payurl_ex(
        self,
        request: bccr_models.QueryNotaryPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryPayurlResponse:
        """
        Description: 公证出证重新获取支付链接
        Summary: 重新获取支付链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryPayurlResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.payurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_notary_payurl_ex_async(
        self,
        request: bccr_models.QueryNotaryPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryPayurlResponse:
        """
        Description: 公证出证重新获取支付链接
        Summary: 重新获取支付链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryPayurlResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.payurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_notary_feedetail(
        self,
        request: bccr_models.QueryNotaryFeedetailRequest,
    ) -> bccr_models.QueryNotaryFeedetailResponse:
        """
        Description: 公证出证获取收费标准和明细
        Summary: 获取收费标准和明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_notary_feedetail_ex(request, headers, runtime)

    async def query_notary_feedetail_async(
        self,
        request: bccr_models.QueryNotaryFeedetailRequest,
    ) -> bccr_models.QueryNotaryFeedetailResponse:
        """
        Description: 公证出证获取收费标准和明细
        Summary: 获取收费标准和明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_notary_feedetail_ex_async(request, headers, runtime)

    def query_notary_feedetail_ex(
        self,
        request: bccr_models.QueryNotaryFeedetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryFeedetailResponse:
        """
        Description: 公证出证获取收费标准和明细
        Summary: 获取收费标准和明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryFeedetailResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.feedetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_notary_feedetail_ex_async(
        self,
        request: bccr_models.QueryNotaryFeedetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryFeedetailResponse:
        """
        Description: 公证出证获取收费标准和明细
        Summary: 获取收费标准和明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryFeedetailResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.feedetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_notary_order(
        self,
        request: bccr_models.QueryNotaryOrderRequest,
    ) -> bccr_models.QueryNotaryOrderResponse:
        """
        Description: 公证出证查询申办订单接口
        Summary: 查询申办订单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_notary_order_ex(request, headers, runtime)

    async def query_notary_order_async(
        self,
        request: bccr_models.QueryNotaryOrderRequest,
    ) -> bccr_models.QueryNotaryOrderResponse:
        """
        Description: 公证出证查询申办订单接口
        Summary: 查询申办订单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_notary_order_ex_async(request, headers, runtime)

    def query_notary_order_ex(
        self,
        request: bccr_models.QueryNotaryOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryOrderResponse:
        """
        Description: 公证出证查询申办订单接口
        Summary: 查询申办订单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryOrderResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_notary_order_ex_async(
        self,
        request: bccr_models.QueryNotaryOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryNotaryOrderResponse:
        """
        Description: 公证出证查询申办订单接口
        Summary: 查询申办订单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryNotaryOrderResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_notary_attachment(
        self,
        request: bccr_models.UploadNotaryAttachmentRequest,
    ) -> bccr_models.UploadNotaryAttachmentResponse:
        """
        Description: 公证出证申请出证材料补齐
        Summary: 申请出证材料补齐
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_notary_attachment_ex(request, headers, runtime)

    async def upload_notary_attachment_async(
        self,
        request: bccr_models.UploadNotaryAttachmentRequest,
    ) -> bccr_models.UploadNotaryAttachmentResponse:
        """
        Description: 公证出证申请出证材料补齐
        Summary: 申请出证材料补齐
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_notary_attachment_ex_async(request, headers, runtime)

    def upload_notary_attachment_ex(
        self,
        request: bccr_models.UploadNotaryAttachmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.UploadNotaryAttachmentResponse:
        """
        Description: 公证出证申请出证材料补齐
        Summary: 申请出证材料补齐
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.UploadNotaryAttachmentResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.attachment.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_notary_attachment_ex_async(
        self,
        request: bccr_models.UploadNotaryAttachmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.UploadNotaryAttachmentResponse:
        """
        Description: 公证出证申请出证材料补齐
        Summary: 申请出证材料补齐
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.UploadNotaryAttachmentResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.attachment.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_notary_order(
        self,
        request: bccr_models.OperateNotaryOrderRequest,
    ) -> bccr_models.OperateNotaryOrderResponse:
        """
        Description: 公证出证更新申办状态
        Summary: 更新申办状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_notary_order_ex(request, headers, runtime)

    async def operate_notary_order_async(
        self,
        request: bccr_models.OperateNotaryOrderRequest,
    ) -> bccr_models.OperateNotaryOrderResponse:
        """
        Description: 公证出证更新申办状态
        Summary: 更新申办状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_notary_order_ex_async(request, headers, runtime)

    def operate_notary_order_ex(
        self,
        request: bccr_models.OperateNotaryOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.OperateNotaryOrderResponse:
        """
        Description: 公证出证更新申办状态
        Summary: 更新申办状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.OperateNotaryOrderResponse(),
            self.do_request('1.0', 'blockchain.bccr.notary.order.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_notary_order_ex_async(
        self,
        request: bccr_models.OperateNotaryOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.OperateNotaryOrderResponse:
        """
        Description: 公证出证更新申办状态
        Summary: 更新申办状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.OperateNotaryOrderResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.notary.order.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_preview(
        self,
        request: bccr_models.QueryDciPreviewRequest,
    ) -> bccr_models.QueryDciPreviewResponse:
        """
        Description: 查询DCI作品预览结果
        Summary: 查询DCI作品预览结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_preview_ex(request, headers, runtime)

    async def query_dci_preview_async(
        self,
        request: bccr_models.QueryDciPreviewRequest,
    ) -> bccr_models.QueryDciPreviewResponse:
        """
        Description: 查询DCI作品预览结果
        Summary: 查询DCI作品预览结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_preview_ex_async(request, headers, runtime)

    def query_dci_preview_ex(
        self,
        request: bccr_models.QueryDciPreviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPreviewResponse:
        """
        Description: 查询DCI作品预览结果
        Summary: 查询DCI作品预览结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPreviewResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.preview.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_preview_ex_async(
        self,
        request: bccr_models.QueryDciPreviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciPreviewResponse:
        """
        Description: 查询DCI作品预览结果
        Summary: 查询DCI作品预览结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciPreviewResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.preview.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_dci_registration(
        self,
        request: bccr_models.RetryDciRegistrationRequest,
    ) -> bccr_models.RetryDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_dci_registration_ex(request, headers, runtime)

    async def retry_dci_registration_async(
        self,
        request: bccr_models.RetryDciRegistrationRequest,
    ) -> bccr_models.RetryDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_dci_registration_ex_async(request, headers, runtime)

    def retry_dci_registration_ex(
        self,
        request: bccr_models.RetryDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RetryDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RetryDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_dci_registration_ex_async(
        self,
        request: bccr_models.RetryDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RetryDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RetryDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_dci_registration(
        self,
        request: bccr_models.CloseDciRegistrationRequest,
    ) -> bccr_models.CloseDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_dci_registration_ex(request, headers, runtime)

    async def close_dci_registration_async(
        self,
        request: bccr_models.CloseDciRegistrationRequest,
    ) -> bccr_models.CloseDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_dci_registration_ex_async(request, headers, runtime)

    def close_dci_registration_ex(
        self,
        request: bccr_models.CloseDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CloseDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CloseDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_dci_registration_ex_async(
        self,
        request: bccr_models.CloseDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CloseDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CloseDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dci_usernocert(
        self,
        request: bccr_models.AddDciUsernocertRequest,
    ) -> bccr_models.AddDciUsernocertResponse:
        """
        Description: dci用户无需证件注册
        Summary: dci用户无需证件注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dci_usernocert_ex(request, headers, runtime)

    async def add_dci_usernocert_async(
        self,
        request: bccr_models.AddDciUsernocertRequest,
    ) -> bccr_models.AddDciUsernocertResponse:
        """
        Description: dci用户无需证件注册
        Summary: dci用户无需证件注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dci_usernocert_ex_async(request, headers, runtime)

    def add_dci_usernocert_ex(
        self,
        request: bccr_models.AddDciUsernocertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddDciUsernocertResponse:
        """
        Description: dci用户无需证件注册
        Summary: dci用户无需证件注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.AddDciUsernocertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.usernocert.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dci_usernocert_ex_async(
        self,
        request: bccr_models.AddDciUsernocertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.AddDciUsernocertResponse:
        """
        Description: dci用户无需证件注册
        Summary: dci用户无需证件注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.AddDciUsernocertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.usernocert.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_similarfile(
        self,
        request: bccr_models.QueryDciSimilarfileRequest,
    ) -> bccr_models.QueryDciSimilarfileResponse:
        """
        Description: 查询相似作品下载链接
        Summary: 查询相似作品下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_similarfile_ex(request, headers, runtime)

    async def query_dci_similarfile_async(
        self,
        request: bccr_models.QueryDciSimilarfileRequest,
    ) -> bccr_models.QueryDciSimilarfileResponse:
        """
        Description: 查询相似作品下载链接
        Summary: 查询相似作品下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_similarfile_ex_async(request, headers, runtime)

    def query_dci_similarfile_ex(
        self,
        request: bccr_models.QueryDciSimilarfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciSimilarfileResponse:
        """
        Description: 查询相似作品下载链接
        Summary: 查询相似作品下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciSimilarfileResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.similarfile.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_similarfile_ex_async(
        self,
        request: bccr_models.QueryDciSimilarfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciSimilarfileResponse:
        """
        Description: 查询相似作品下载链接
        Summary: 查询相似作品下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciSimilarfileResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.similarfile.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dci_promotion(
        self,
        request: bccr_models.ApplyDciPromotionRequest,
    ) -> bccr_models.ApplyDciPromotionResponse:
        """
        Description: 申请渠道推广
        Summary: 申请渠道推广
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dci_promotion_ex(request, headers, runtime)

    async def apply_dci_promotion_async(
        self,
        request: bccr_models.ApplyDciPromotionRequest,
    ) -> bccr_models.ApplyDciPromotionResponse:
        """
        Description: 申请渠道推广
        Summary: 申请渠道推广
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dci_promotion_ex_async(request, headers, runtime)

    def apply_dci_promotion_ex(
        self,
        request: bccr_models.ApplyDciPromotionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ApplyDciPromotionResponse:
        """
        Description: 申请渠道推广
        Summary: 申请渠道推广
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ApplyDciPromotionResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.promotion.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dci_promotion_ex_async(
        self,
        request: bccr_models.ApplyDciPromotionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ApplyDciPromotionResponse:
        """
        Description: 申请渠道推广
        Summary: 申请渠道推广
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ApplyDciPromotionResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.promotion.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_userbyphone(
        self,
        request: bccr_models.QueryDciUserbyphoneRequest,
    ) -> bccr_models.QueryDciUserbyphoneResponse:
        """
        Description: 根据手机号查询dci用户
        Summary: 根据手机号查询dci用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_userbyphone_ex(request, headers, runtime)

    async def query_dci_userbyphone_async(
        self,
        request: bccr_models.QueryDciUserbyphoneRequest,
    ) -> bccr_models.QueryDciUserbyphoneResponse:
        """
        Description: 根据手机号查询dci用户
        Summary: 根据手机号查询dci用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_userbyphone_ex_async(request, headers, runtime)

    def query_dci_userbyphone_ex(
        self,
        request: bccr_models.QueryDciUserbyphoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciUserbyphoneResponse:
        """
        Description: 根据手机号查询dci用户
        Summary: 根据手机号查询dci用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciUserbyphoneResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.userbyphone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_userbyphone_ex_async(
        self,
        request: bccr_models.QueryDciUserbyphoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciUserbyphoneResponse:
        """
        Description: 根据手机号查询dci用户
        Summary: 根据手机号查询dci用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciUserbyphoneResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.userbyphone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_trade_sale(
        self,
        request: bccr_models.QueryTradeSaleRequest,
    ) -> bccr_models.QueryTradeSaleResponse:
        """
        Description: 支持交易的已进行用途登记的商品查询
        Summary: 支持交易的商品查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_trade_sale_ex(request, headers, runtime)

    async def query_trade_sale_async(
        self,
        request: bccr_models.QueryTradeSaleRequest,
    ) -> bccr_models.QueryTradeSaleResponse:
        """
        Description: 支持交易的已进行用途登记的商品查询
        Summary: 支持交易的商品查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_trade_sale_ex_async(request, headers, runtime)

    def query_trade_sale_ex(
        self,
        request: bccr_models.QueryTradeSaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryTradeSaleResponse:
        """
        Description: 支持交易的已进行用途登记的商品查询
        Summary: 支持交易的商品查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryTradeSaleResponse(),
            self.do_request('1.0', 'blockchain.bccr.trade.sale.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_trade_sale_ex_async(
        self,
        request: bccr_models.QueryTradeSaleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryTradeSaleResponse:
        """
        Description: 支持交易的已进行用途登记的商品查询
        Summary: 支持交易的商品查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryTradeSaleResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.trade.sale.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_trade_usage(
        self,
        request: bccr_models.RegisterTradeUsageRequest,
    ) -> bccr_models.RegisterTradeUsageResponse:
        """
        Description: 商品交易用途登记
        Summary: 商品交易用途登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_trade_usage_ex(request, headers, runtime)

    async def register_trade_usage_async(
        self,
        request: bccr_models.RegisterTradeUsageRequest,
    ) -> bccr_models.RegisterTradeUsageResponse:
        """
        Description: 商品交易用途登记
        Summary: 商品交易用途登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_trade_usage_ex_async(request, headers, runtime)

    def register_trade_usage_ex(
        self,
        request: bccr_models.RegisterTradeUsageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RegisterTradeUsageResponse:
        """
        Description: 商品交易用途登记
        Summary: 商品交易用途登记
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RegisterTradeUsageResponse(),
            self.do_request('1.0', 'blockchain.bccr.trade.usage.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_trade_usage_ex_async(
        self,
        request: bccr_models.RegisterTradeUsageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.RegisterTradeUsageResponse:
        """
        Description: 商品交易用途登记
        Summary: 商品交易用途登记
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.RegisterTradeUsageResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.trade.usage.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_evidence_user(
        self,
        request: bccr_models.CreateEvidenceUserRequest,
    ) -> bccr_models.CreateEvidenceUserResponse:
        """
        Description: 创建取证用户
        Summary: 创建取证用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_evidence_user_ex(request, headers, runtime)

    async def create_evidence_user_async(
        self,
        request: bccr_models.CreateEvidenceUserRequest,
    ) -> bccr_models.CreateEvidenceUserResponse:
        """
        Description: 创建取证用户
        Summary: 创建取证用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_evidence_user_ex_async(request, headers, runtime)

    def create_evidence_user_ex(
        self,
        request: bccr_models.CreateEvidenceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceUserResponse:
        """
        Description: 创建取证用户
        Summary: 创建取证用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceUserResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_evidence_user_ex_async(
        self,
        request: bccr_models.CreateEvidenceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceUserResponse:
        """
        Description: 创建取证用户
        Summary: 创建取证用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceUserResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_evidence_screenshot(
        self,
        request: bccr_models.CreateEvidenceScreenshotRequest,
    ) -> bccr_models.CreateEvidenceScreenshotResponse:
        """
        Description: 创建网页截图
        Summary: 创建网页截图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_evidence_screenshot_ex(request, headers, runtime)

    async def create_evidence_screenshot_async(
        self,
        request: bccr_models.CreateEvidenceScreenshotRequest,
    ) -> bccr_models.CreateEvidenceScreenshotResponse:
        """
        Description: 创建网页截图
        Summary: 创建网页截图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_evidence_screenshot_ex_async(request, headers, runtime)

    def create_evidence_screenshot_ex(
        self,
        request: bccr_models.CreateEvidenceScreenshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceScreenshotResponse:
        """
        Description: 创建网页截图
        Summary: 创建网页截图
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceScreenshotResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.screenshot.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_evidence_screenshot_ex_async(
        self,
        request: bccr_models.CreateEvidenceScreenshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceScreenshotResponse:
        """
        Description: 创建网页截图
        Summary: 创建网页截图
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceScreenshotResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.screenshot.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_evidence_register(
        self,
        request: bccr_models.CreateEvidenceRegisterRequest,
    ) -> bccr_models.CreateEvidenceRegisterResponse:
        """
        Description: 创建网页截图存证
        Summary: 创建网页截图存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_evidence_register_ex(request, headers, runtime)

    async def create_evidence_register_async(
        self,
        request: bccr_models.CreateEvidenceRegisterRequest,
    ) -> bccr_models.CreateEvidenceRegisterResponse:
        """
        Description: 创建网页截图存证
        Summary: 创建网页截图存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_evidence_register_ex_async(request, headers, runtime)

    def create_evidence_register_ex(
        self,
        request: bccr_models.CreateEvidenceRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceRegisterResponse:
        """
        Description: 创建网页截图存证
        Summary: 创建网页截图存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceRegisterResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.register.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_evidence_register_ex_async(
        self,
        request: bccr_models.CreateEvidenceRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceRegisterResponse:
        """
        Description: 创建网页截图存证
        Summary: 创建网页截图存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceRegisterResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.register.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_evidence_recordscreen(
        self,
        request: bccr_models.CreateEvidenceRecordscreenRequest,
    ) -> bccr_models.CreateEvidenceRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_evidence_recordscreen_ex(request, headers, runtime)

    async def create_evidence_recordscreen_async(
        self,
        request: bccr_models.CreateEvidenceRecordscreenRequest,
    ) -> bccr_models.CreateEvidenceRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_evidence_recordscreen_ex_async(request, headers, runtime)

    def create_evidence_recordscreen_ex(
        self,
        request: bccr_models.CreateEvidenceRecordscreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceRecordscreenResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.recordscreen.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_evidence_recordscreen_ex_async(
        self,
        request: bccr_models.CreateEvidenceRecordscreenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceRecordscreenResponse:
        """
        Description: 创建录屏取证
        Summary: 创建录屏取证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceRecordscreenResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.recordscreen.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_trade_usage(
        self,
        request: bccr_models.CancelTradeUsageRequest,
    ) -> bccr_models.CancelTradeUsageResponse:
        """
        Description: 商品交易用途撤销
        Summary: 商品交易用途撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_trade_usage_ex(request, headers, runtime)

    async def cancel_trade_usage_async(
        self,
        request: bccr_models.CancelTradeUsageRequest,
    ) -> bccr_models.CancelTradeUsageResponse:
        """
        Description: 商品交易用途撤销
        Summary: 商品交易用途撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_trade_usage_ex_async(request, headers, runtime)

    def cancel_trade_usage_ex(
        self,
        request: bccr_models.CancelTradeUsageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CancelTradeUsageResponse:
        """
        Description: 商品交易用途撤销
        Summary: 商品交易用途撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CancelTradeUsageResponse(),
            self.do_request('1.0', 'blockchain.bccr.trade.usage.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_trade_usage_ex_async(
        self,
        request: bccr_models.CancelTradeUsageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CancelTradeUsageResponse:
        """
        Description: 商品交易用途撤销
        Summary: 商品交易用途撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CancelTradeUsageResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.trade.usage.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_evidence_live(
        self,
        request: bccr_models.CreateEvidenceLiveRequest,
    ) -> bccr_models.CreateEvidenceLiveResponse:
        """
        Description: 录屏取证
        Summary: 创建自动化直播取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_evidence_live_ex(request, headers, runtime)

    async def create_evidence_live_async(
        self,
        request: bccr_models.CreateEvidenceLiveRequest,
    ) -> bccr_models.CreateEvidenceLiveResponse:
        """
        Description: 录屏取证
        Summary: 创建自动化直播取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_evidence_live_ex_async(request, headers, runtime)

    def create_evidence_live_ex(
        self,
        request: bccr_models.CreateEvidenceLiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceLiveResponse:
        """
        Description: 录屏取证
        Summary: 创建自动化直播取证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceLiveResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.live.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_evidence_live_ex_async(
        self,
        request: bccr_models.CreateEvidenceLiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceLiveResponse:
        """
        Description: 录屏取证
        Summary: 创建自动化直播取证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceLiveResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.live.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_evidence_vod(
        self,
        request: bccr_models.CreateEvidenceVodRequest,
    ) -> bccr_models.CreateEvidenceVodResponse:
        """
        Description: 根据点播网站url发起点播取证
        Summary: 发起点播取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_evidence_vod_ex(request, headers, runtime)

    async def create_evidence_vod_async(
        self,
        request: bccr_models.CreateEvidenceVodRequest,
    ) -> bccr_models.CreateEvidenceVodResponse:
        """
        Description: 根据点播网站url发起点播取证
        Summary: 发起点播取证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_evidence_vod_ex_async(request, headers, runtime)

    def create_evidence_vod_ex(
        self,
        request: bccr_models.CreateEvidenceVodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceVodResponse:
        """
        Description: 根据点播网站url发起点播取证
        Summary: 发起点播取证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceVodResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.vod.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_evidence_vod_ex_async(
        self,
        request: bccr_models.CreateEvidenceVodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateEvidenceVodResponse:
        """
        Description: 根据点播网站url发起点播取证
        Summary: 发起点播取证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateEvidenceVodResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.vod.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_usage(
        self,
        request: bccr_models.GetTradeUsageRequest,
    ) -> bccr_models.GetTradeUsageResponse:
        """
        Description: 商品交易用途登记结果查询，目前仅用于测试
        Summary: 商品交易用途登记结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_usage_ex(request, headers, runtime)

    async def get_trade_usage_async(
        self,
        request: bccr_models.GetTradeUsageRequest,
    ) -> bccr_models.GetTradeUsageResponse:
        """
        Description: 商品交易用途登记结果查询，目前仅用于测试
        Summary: 商品交易用途登记结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_usage_ex_async(request, headers, runtime)

    def get_trade_usage_ex(
        self,
        request: bccr_models.GetTradeUsageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetTradeUsageResponse:
        """
        Description: 商品交易用途登记结果查询，目前仅用于测试
        Summary: 商品交易用途登记结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetTradeUsageResponse(),
            self.do_request('1.0', 'blockchain.bccr.trade.usage.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_usage_ex_async(
        self,
        request: bccr_models.GetTradeUsageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetTradeUsageResponse:
        """
        Description: 商品交易用途登记结果查询，目前仅用于测试
        Summary: 商品交易用途登记结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetTradeUsageResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.trade.usage.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_evidence_info(
        self,
        request: bccr_models.GetEvidenceInfoRequest,
    ) -> bccr_models.GetEvidenceInfoResponse:
        """
        Description: 查询取证信息
        Summary: 查询取证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_evidence_info_ex(request, headers, runtime)

    async def get_evidence_info_async(
        self,
        request: bccr_models.GetEvidenceInfoRequest,
    ) -> bccr_models.GetEvidenceInfoResponse:
        """
        Description: 查询取证信息
        Summary: 查询取证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_evidence_info_ex_async(request, headers, runtime)

    def get_evidence_info_ex(
        self,
        request: bccr_models.GetEvidenceInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetEvidenceInfoResponse:
        """
        Description: 查询取证信息
        Summary: 查询取证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetEvidenceInfoResponse(),
            self.do_request('1.0', 'blockchain.bccr.evidence.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_evidence_info_ex_async(
        self,
        request: bccr_models.GetEvidenceInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.GetEvidenceInfoResponse:
        """
        Description: 查询取证信息
        Summary: 查询取证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.GetEvidenceInfoResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.evidence.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_dci(
        self,
        request: bccr_models.ReplaceDciRequest,
    ) -> bccr_models.ReplaceDciResponse:
        """
        Description: DCI变更
        Summary: DCI变更
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_dci_ex(request, headers, runtime)

    async def replace_dci_async(
        self,
        request: bccr_models.ReplaceDciRequest,
    ) -> bccr_models.ReplaceDciResponse:
        """
        Description: DCI变更
        Summary: DCI变更
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_dci_ex_async(request, headers, runtime)

    def replace_dci_ex(
        self,
        request: bccr_models.ReplaceDciRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ReplaceDciResponse:
        """
        Description: DCI变更
        Summary: DCI变更
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ReplaceDciResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_dci_ex_async(
        self,
        request: bccr_models.ReplaceDciRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ReplaceDciResponse:
        """
        Description: DCI变更
        Summary: DCI变更
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ReplaceDciResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_dci_feedback(
        self,
        request: bccr_models.SubmitDciFeedbackRequest,
    ) -> bccr_models.SubmitDciFeedbackResponse:
        """
        Description: 提交作品申诉
        Summary: 提交作品申诉
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_dci_feedback_ex(request, headers, runtime)

    async def submit_dci_feedback_async(
        self,
        request: bccr_models.SubmitDciFeedbackRequest,
    ) -> bccr_models.SubmitDciFeedbackResponse:
        """
        Description: 提交作品申诉
        Summary: 提交作品申诉
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_dci_feedback_ex_async(request, headers, runtime)

    def submit_dci_feedback_ex(
        self,
        request: bccr_models.SubmitDciFeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.SubmitDciFeedbackResponse:
        """
        Description: 提交作品申诉
        Summary: 提交作品申诉
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.SubmitDciFeedbackResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.feedback.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_dci_feedback_ex_async(
        self,
        request: bccr_models.SubmitDciFeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.SubmitDciFeedbackResponse:
        """
        Description: 提交作品申诉
        Summary: 提交作品申诉
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.SubmitDciFeedbackResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.feedback.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dci_feedback(
        self,
        request: bccr_models.QueryDciFeedbackRequest,
    ) -> bccr_models.QueryDciFeedbackResponse:
        """
        Description: 查询申诉结果
        Summary: 查询申诉结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dci_feedback_ex(request, headers, runtime)

    async def query_dci_feedback_async(
        self,
        request: bccr_models.QueryDciFeedbackRequest,
    ) -> bccr_models.QueryDciFeedbackResponse:
        """
        Description: 查询申诉结果
        Summary: 查询申诉结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dci_feedback_ex_async(request, headers, runtime)

    def query_dci_feedback_ex(
        self,
        request: bccr_models.QueryDciFeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciFeedbackResponse:
        """
        Description: 查询申诉结果
        Summary: 查询申诉结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciFeedbackResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.feedback.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dci_feedback_ex_async(
        self,
        request: bccr_models.QueryDciFeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryDciFeedbackResponse:
        """
        Description: 查询申诉结果
        Summary: 查询申诉结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryDciFeedbackResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.feedback.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_trade_cover(
        self,
        request: bccr_models.ExecTradeCoverRequest,
    ) -> bccr_models.ExecTradeCoverResponse:
        """
        Description: 交易商品抽取封面
        Summary: 交易商品抽取封面
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_trade_cover_ex(request, headers, runtime)

    async def exec_trade_cover_async(
        self,
        request: bccr_models.ExecTradeCoverRequest,
    ) -> bccr_models.ExecTradeCoverResponse:
        """
        Description: 交易商品抽取封面
        Summary: 交易商品抽取封面
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_trade_cover_ex_async(request, headers, runtime)

    def exec_trade_cover_ex(
        self,
        request: bccr_models.ExecTradeCoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ExecTradeCoverResponse:
        """
        Description: 交易商品抽取封面
        Summary: 交易商品抽取封面
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ExecTradeCoverResponse(),
            self.do_request('1.0', 'blockchain.bccr.trade.cover.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_trade_cover_ex_async(
        self,
        request: bccr_models.ExecTradeCoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.ExecTradeCoverResponse:
        """
        Description: 交易商品抽取封面
        Summary: 交易商品抽取封面
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.ExecTradeCoverResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.trade.cover.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_order(
        self,
        request: bccr_models.CreateOrderRequest,
    ) -> bccr_models.CreateOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_order_ex(request, headers, runtime)

    async def create_order_async(
        self,
        request: bccr_models.CreateOrderRequest,
    ) -> bccr_models.CreateOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_order_ex_async(request, headers, runtime)

    def create_order_ex(
        self,
        request: bccr_models.CreateOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateOrderResponse(),
            self.do_request('1.0', 'blockchain.bccr.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_order_ex_async(
        self,
        request: bccr_models.CreateOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.CreateOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.CreateOrderResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_order_payurl(
        self,
        request: bccr_models.QueryOrderPayurlRequest,
    ) -> bccr_models.QueryOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_order_payurl_ex(request, headers, runtime)

    async def query_order_payurl_async(
        self,
        request: bccr_models.QueryOrderPayurlRequest,
    ) -> bccr_models.QueryOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_order_payurl_ex_async(request, headers, runtime)

    def query_order_payurl_ex(
        self,
        request: bccr_models.QueryOrderPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryOrderPayurlResponse(),
            self.do_request('1.0', 'blockchain.bccr.order.payurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_order_payurl_ex_async(
        self,
        request: bccr_models.QueryOrderPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryOrderPayurlResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.order.payurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_content_batchstatistics(
        self,
        request: bccr_models.QueryContentBatchstatisticsRequest,
    ) -> bccr_models.QueryContentBatchstatisticsResponse:
        """
        Description: 批量查询视频内容统计数据
        Summary: 批量查询视频统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_content_batchstatistics_ex(request, headers, runtime)

    async def query_content_batchstatistics_async(
        self,
        request: bccr_models.QueryContentBatchstatisticsRequest,
    ) -> bccr_models.QueryContentBatchstatisticsResponse:
        """
        Description: 批量查询视频内容统计数据
        Summary: 批量查询视频统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_content_batchstatistics_ex_async(request, headers, runtime)

    def query_content_batchstatistics_ex(
        self,
        request: bccr_models.QueryContentBatchstatisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryContentBatchstatisticsResponse:
        """
        Description: 批量查询视频内容统计数据
        Summary: 批量查询视频统计信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryContentBatchstatisticsResponse(),
            self.do_request('1.0', 'blockchain.bccr.content.batchstatistics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_content_batchstatistics_ex_async(
        self,
        request: bccr_models.QueryContentBatchstatisticsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bccr_models.QueryContentBatchstatisticsResponse:
        """
        Description: 批量查询视频内容统计数据
        Summary: 批量查询视频统计信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bccr_models.QueryContentBatchstatisticsResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.content.batchstatistics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
