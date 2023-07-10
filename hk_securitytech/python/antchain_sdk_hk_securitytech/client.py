# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_hk_securitytech import models as hk__securitytech_models
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
        config: hk__securitytech_models.Config,
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
            # result.resultData
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
                    'sdk_version': '1.3.5',
                    '_prod_code': 'HK_SECURITYTECH',
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
            # result.resultData
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
                    'sdk_version': '1.3.5',
                    '_prod_code': 'HK_SECURITYTECH',
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

    def create_blueshield_securitypicture(
        self,
        request: hk__securitytech_models.CreateBlueshieldSecuritypictureRequest,
    ) -> hk__securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blueshield_securitypicture_ex(request, headers, runtime)

    async def create_blueshield_securitypicture_async(
        self,
        request: hk__securitytech_models.CreateBlueshieldSecuritypictureRequest,
    ) -> hk__securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blueshield_securitypicture_ex_async(request, headers, runtime)

    def create_blueshield_securitypicture_ex(
        self,
        request: hk__securitytech_models.CreateBlueshieldSecuritypictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.CreateBlueshieldSecuritypictureResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.blueshield.securitypicture.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blueshield_securitypicture_ex_async(
        self,
        request: hk__securitytech_models.CreateBlueshieldSecuritypictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.CreateBlueshieldSecuritypictureResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.blueshield.securitypicture.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceshield_native(
        self,
        request: hk__securitytech_models.QueryFaceshieldNativeRequest,
    ) -> hk__securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceshield_native_ex(request, headers, runtime)

    async def query_faceshield_native_async(
        self,
        request: hk__securitytech_models.QueryFaceshieldNativeRequest,
    ) -> hk__securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceshield_native_ex_async(request, headers, runtime)

    def query_faceshield_native_ex(
        self,
        request: hk__securitytech_models.QueryFaceshieldNativeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryFaceshieldNativeResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.faceshield.native.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceshield_native_ex_async(
        self,
        request: hk__securitytech_models.QueryFaceshieldNativeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryFaceshieldNativeResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.faceshield.native.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ashield_hardeningtask(
        self,
        request: hk__securitytech_models.SubmitAshieldHardeningtaskRequest,
    ) -> hk__securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 启动加固任务
        Summary: 启动加固任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ashield_hardeningtask_ex(request, headers, runtime)

    async def submit_ashield_hardeningtask_async(
        self,
        request: hk__securitytech_models.SubmitAshieldHardeningtaskRequest,
    ) -> hk__securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 启动加固任务
        Summary: 启动加固任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ashield_hardeningtask_ex_async(request, headers, runtime)

    def submit_ashield_hardeningtask_ex(
        self,
        request: hk__securitytech_models.SubmitAshieldHardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 启动加固任务
        Summary: 启动加固任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAshieldHardeningtaskResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.ashield.hardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ashield_hardeningtask_ex_async(
        self,
        request: hk__securitytech_models.SubmitAshieldHardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 启动加固任务
        Summary: 启动加固任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAshieldHardeningtaskResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.ashield.hardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_devicerisk_finger(
        self,
        request: hk__securitytech_models.QueryDeviceriskFingerRequest,
    ) -> hk__securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_devicerisk_finger_ex(request, headers, runtime)

    async def query_devicerisk_finger_async(
        self,
        request: hk__securitytech_models.QueryDeviceriskFingerRequest,
    ) -> hk__securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_devicerisk_finger_ex_async(request, headers, runtime)

    def query_devicerisk_finger_ex(
        self,
        request: hk__securitytech_models.QueryDeviceriskFingerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryDeviceriskFingerResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.devicerisk.finger.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_devicerisk_finger_ex_async(
        self,
        request: hk__securitytech_models.QueryDeviceriskFingerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryDeviceriskFingerResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.devicerisk.finger.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_devicerisk_devicerisk(
        self,
        request: hk__securitytech_models.QueryDeviceriskDeviceriskRequest,
    ) -> hk__securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 终端安全-设备风险查询
        Summary: 设备风险查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_devicerisk_devicerisk_ex(request, headers, runtime)

    async def query_devicerisk_devicerisk_async(
        self,
        request: hk__securitytech_models.QueryDeviceriskDeviceriskRequest,
    ) -> hk__securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 终端安全-设备风险查询
        Summary: 设备风险查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_devicerisk_devicerisk_ex_async(request, headers, runtime)

    def query_devicerisk_devicerisk_ex(
        self,
        request: hk__securitytech_models.QueryDeviceriskDeviceriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 终端安全-设备风险查询
        Summary: 设备风险查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryDeviceriskDeviceriskResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.devicerisk.devicerisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_devicerisk_devicerisk_ex_async(
        self,
        request: hk__securitytech_models.QueryDeviceriskDeviceriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 终端安全-设备风险查询
        Summary: 设备风险查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryDeviceriskDeviceriskResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.devicerisk.devicerisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceshield_web(
        self,
        request: hk__securitytech_models.QueryFaceshieldWebRequest,
    ) -> hk__securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceshield_web_ex(request, headers, runtime)

    async def query_faceshield_web_async(
        self,
        request: hk__securitytech_models.QueryFaceshieldWebRequest,
    ) -> hk__securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceshield_web_ex_async(request, headers, runtime)

    def query_faceshield_web_ex(
        self,
        request: hk__securitytech_models.QueryFaceshieldWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryFaceshieldWebResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.faceshield.web.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceshield_web_ex_async(
        self,
        request: hk__securitytech_models.QueryFaceshieldWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryFaceshieldWebResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.faceshield.web.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_devicerisk_report(
        self,
        request: hk__securitytech_models.SubmitDeviceriskReportRequest,
    ) -> hk__securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 终端安全 设备信息上报
        Summary: 设备信息上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_devicerisk_report_ex(request, headers, runtime)

    async def submit_devicerisk_report_async(
        self,
        request: hk__securitytech_models.SubmitDeviceriskReportRequest,
    ) -> hk__securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 终端安全 设备信息上报
        Summary: 设备信息上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_devicerisk_report_ex_async(request, headers, runtime)

    def submit_devicerisk_report_ex(
        self,
        request: hk__securitytech_models.SubmitDeviceriskReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 终端安全 设备信息上报
        Summary: 设备信息上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitDeviceriskReportResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.devicerisk.report.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_devicerisk_report_ex_async(
        self,
        request: hk__securitytech_models.SubmitDeviceriskReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 终端安全 设备信息上报
        Summary: 设备信息上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitDeviceriskReportResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.devicerisk.report.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
