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
                    'sdk_version': '1.5.10',
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
                    'sdk_version': '1.5.10',
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
        Description: 终端安全-Android应用加固-启动加固任务
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
        Description: 终端安全-Android应用加固-启动加固任务
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
        Description: 终端安全-Android应用加固-启动加固任务
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
        Description: 终端安全-Android应用加固-启动加固任务
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

    def query_eaglepromo_marketingrisk(
        self,
        request: hk__securitytech_models.QueryEaglepromoMarketingriskRequest,
    ) -> hk__securitytech_models.QueryEaglepromoMarketingriskResponse:
        """
        Description: 终端安全 EaglePromo
        Summary: EaglePromo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_eaglepromo_marketingrisk_ex(request, headers, runtime)

    async def query_eaglepromo_marketingrisk_async(
        self,
        request: hk__securitytech_models.QueryEaglepromoMarketingriskRequest,
    ) -> hk__securitytech_models.QueryEaglepromoMarketingriskResponse:
        """
        Description: 终端安全 EaglePromo
        Summary: EaglePromo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_eaglepromo_marketingrisk_ex_async(request, headers, runtime)

    def query_eaglepromo_marketingrisk_ex(
        self,
        request: hk__securitytech_models.QueryEaglepromoMarketingriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryEaglepromoMarketingriskResponse:
        """
        Description: 终端安全 EaglePromo
        Summary: EaglePromo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryEaglepromoMarketingriskResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.eaglepromo.marketingrisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_eaglepromo_marketingrisk_ex_async(
        self,
        request: hk__securitytech_models.QueryEaglepromoMarketingriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryEaglepromoMarketingriskResponse:
        """
        Description: 终端安全 EaglePromo
        Summary: EaglePromo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryEaglepromoMarketingriskResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.eaglepromo.marketingrisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_amlcloud_analyze(
        self,
        request: hk__securitytech_models.SubmitAmlcloudAnalyzeRequest,
    ) -> hk__securitytech_models.SubmitAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 form
        Summary: aml analyze v2 form
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_amlcloud_analyze_ex(request, headers, runtime)

    async def submit_amlcloud_analyze_async(
        self,
        request: hk__securitytech_models.SubmitAmlcloudAnalyzeRequest,
    ) -> hk__securitytech_models.SubmitAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 form
        Summary: aml analyze v2 form
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_amlcloud_analyze_ex_async(request, headers, runtime)

    def submit_amlcloud_analyze_ex(
        self,
        request: hk__securitytech_models.SubmitAmlcloudAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 form
        Summary: aml analyze v2 form
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAmlcloudAnalyzeResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.amlcloud.analyze.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_amlcloud_analyze_ex_async(
        self,
        request: hk__securitytech_models.SubmitAmlcloudAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 form
        Summary: aml analyze v2 form
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAmlcloudAnalyzeResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.amlcloud.analyze.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_amlcloud_analyze(
        self,
        request: hk__securitytech_models.QueryAmlcloudAnalyzeRequest,
    ) -> hk__securitytech_models.QueryAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml analyze v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_amlcloud_analyze_ex(request, headers, runtime)

    async def query_amlcloud_analyze_async(
        self,
        request: hk__securitytech_models.QueryAmlcloudAnalyzeRequest,
    ) -> hk__securitytech_models.QueryAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml analyze v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_amlcloud_analyze_ex_async(request, headers, runtime)

    def query_amlcloud_analyze_ex(
        self,
        request: hk__securitytech_models.QueryAmlcloudAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml analyze v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlcloudAnalyzeResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.amlcloud.analyze.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_amlcloud_analyze_ex_async(
        self,
        request: hk__securitytech_models.QueryAmlcloudAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlcloudAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml analyze v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlcloudAnalyzeResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.amlcloud.analyze.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_amlcloud_checkcaseresult(
        self,
        request: hk__securitytech_models.QueryAmlcloudCheckcaseresultRequest,
    ) -> hk__securitytech_models.QueryAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml check v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_amlcloud_checkcaseresult_ex(request, headers, runtime)

    async def query_amlcloud_checkcaseresult_async(
        self,
        request: hk__securitytech_models.QueryAmlcloudCheckcaseresultRequest,
    ) -> hk__securitytech_models.QueryAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml check v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_amlcloud_checkcaseresult_ex_async(request, headers, runtime)

    def query_amlcloud_checkcaseresult_ex(
        self,
        request: hk__securitytech_models.QueryAmlcloudCheckcaseresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml check v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlcloudCheckcaseresultResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.amlcloud.checkcaseresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_amlcloud_checkcaseresult_ex_async(
        self,
        request: hk__securitytech_models.QueryAmlcloudCheckcaseresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
        Summary: aml check v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlcloudCheckcaseresultResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.amlcloud.checkcaseresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_amlcloud_checkcaseresult(
        self,
        request: hk__securitytech_models.SubmitAmlcloudCheckcaseresultRequest,
    ) -> hk__securitytech_models.SubmitAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 form
        Summary: aml check v2 form
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_amlcloud_checkcaseresult_ex(request, headers, runtime)

    async def submit_amlcloud_checkcaseresult_async(
        self,
        request: hk__securitytech_models.SubmitAmlcloudCheckcaseresultRequest,
    ) -> hk__securitytech_models.SubmitAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 form
        Summary: aml check v2 form
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_amlcloud_checkcaseresult_ex_async(request, headers, runtime)

    def submit_amlcloud_checkcaseresult_ex(
        self,
        request: hk__securitytech_models.SubmitAmlcloudCheckcaseresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 form
        Summary: aml check v2 form
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAmlcloudCheckcaseresultResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.amlcloud.checkcaseresult.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_amlcloud_checkcaseresult_ex_async(
        self,
        request: hk__securitytech_models.SubmitAmlcloudCheckcaseresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAmlcloudCheckcaseresultResponse:
        """
        Description: aml check v2 form
        Summary: aml check v2 form
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAmlcloudCheckcaseresultResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.amlcloud.checkcaseresult.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_amlclouduat_analyze(
        self,
        request: hk__securitytech_models.QueryAmlclouduatAnalyzeRequest,
    ) -> hk__securitytech_models.QueryAmlclouduatAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml analyze v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_amlclouduat_analyze_ex(request, headers, runtime)

    async def query_amlclouduat_analyze_async(
        self,
        request: hk__securitytech_models.QueryAmlclouduatAnalyzeRequest,
    ) -> hk__securitytech_models.QueryAmlclouduatAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml analyze v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_amlclouduat_analyze_ex_async(request, headers, runtime)

    def query_amlclouduat_analyze_ex(
        self,
        request: hk__securitytech_models.QueryAmlclouduatAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlclouduatAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml analyze v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlclouduatAnalyzeResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.amlclouduat.analyze.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_amlclouduat_analyze_ex_async(
        self,
        request: hk__securitytech_models.QueryAmlclouduatAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlclouduatAnalyzeResponse:
        """
        Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml analyze v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlclouduatAnalyzeResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.amlclouduat.analyze.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_amlclouduat_checkcaseresult(
        self,
        request: hk__securitytech_models.QueryAmlclouduatCheckcaseresultRequest,
    ) -> hk__securitytech_models.QueryAmlclouduatCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml check v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_amlclouduat_checkcaseresult_ex(request, headers, runtime)

    async def query_amlclouduat_checkcaseresult_async(
        self,
        request: hk__securitytech_models.QueryAmlclouduatCheckcaseresultRequest,
    ) -> hk__securitytech_models.QueryAmlclouduatCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml check v2 rest
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_amlclouduat_checkcaseresult_ex_async(request, headers, runtime)

    def query_amlclouduat_checkcaseresult_ex(
        self,
        request: hk__securitytech_models.QueryAmlclouduatCheckcaseresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlclouduatCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml check v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlclouduatCheckcaseresultResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.amlclouduat.checkcaseresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_amlclouduat_checkcaseresult_ex_async(
        self,
        request: hk__securitytech_models.QueryAmlclouduatCheckcaseresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryAmlclouduatCheckcaseresultResponse:
        """
        Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
        Summary: aml check v2 rest
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryAmlclouduatCheckcaseresultResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.amlclouduat.checkcaseresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_filetoken(
        self,
        request: hk__securitytech_models.GetAshieldFiletokenRequest,
    ) -> hk__securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_filetoken_ex(request, headers, runtime)

    async def get_ashield_filetoken_async(
        self,
        request: hk__securitytech_models.GetAshieldFiletokenRequest,
    ) -> hk__securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_filetoken_ex_async(request, headers, runtime)

    def get_ashield_filetoken_ex(
        self,
        request: hk__securitytech_models.GetAshieldFiletokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldFiletokenResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.ashield.filetoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_filetoken_ex_async(
        self,
        request: hk__securitytech_models.GetAshieldFiletokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldFiletokenResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.ashield.filetoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_hardeningtaskprocess(
        self,
        request: hk__securitytech_models.GetAshieldHardeningtaskprocessRequest,
    ) -> hk__securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_hardeningtaskprocess_ex(request, headers, runtime)

    async def get_ashield_hardeningtaskprocess_async(
        self,
        request: hk__securitytech_models.GetAshieldHardeningtaskprocessRequest,
    ) -> hk__securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_hardeningtaskprocess_ex_async(request, headers, runtime)

    def get_ashield_hardeningtaskprocess_ex(
        self,
        request: hk__securitytech_models.GetAshieldHardeningtaskprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldHardeningtaskprocessResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.ashield.hardeningtaskprocess.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_hardeningtaskprocess_ex_async(
        self,
        request: hk__securitytech_models.GetAshieldHardeningtaskprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldHardeningtaskprocessResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.ashield.hardeningtaskprocess.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_hardeningresult(
        self,
        request: hk__securitytech_models.GetAshieldHardeningresultRequest,
    ) -> hk__securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_hardeningresult_ex(request, headers, runtime)

    async def get_ashield_hardeningresult_async(
        self,
        request: hk__securitytech_models.GetAshieldHardeningresultRequest,
    ) -> hk__securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_hardeningresult_ex_async(request, headers, runtime)

    def get_ashield_hardeningresult_ex(
        self,
        request: hk__securitytech_models.GetAshieldHardeningresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldHardeningresultResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.ashield.hardeningresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_hardeningresult_ex_async(
        self,
        request: hk__securitytech_models.GetAshieldHardeningresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldHardeningresultResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.ashield.hardeningresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_hardeninglog(
        self,
        request: hk__securitytech_models.GetAshieldHardeninglogRequest,
    ) -> hk__securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_hardeninglog_ex(request, headers, runtime)

    async def get_ashield_hardeninglog_async(
        self,
        request: hk__securitytech_models.GetAshieldHardeninglogRequest,
    ) -> hk__securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_hardeninglog_ex_async(request, headers, runtime)

    def get_ashield_hardeninglog_ex(
        self,
        request: hk__securitytech_models.GetAshieldHardeninglogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldHardeninglogResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.ashield.hardeninglog.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_hardeninglog_ex_async(
        self,
        request: hk__securitytech_models.GetAshieldHardeninglogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.GetAshieldHardeninglogResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.ashield.hardeninglog.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_devicerisk_risklabel(
        self,
        request: hk__securitytech_models.QueryDeviceriskRisklabelRequest,
    ) -> hk__securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_devicerisk_risklabel_ex(request, headers, runtime)

    async def query_devicerisk_risklabel_async(
        self,
        request: hk__securitytech_models.QueryDeviceriskRisklabelRequest,
    ) -> hk__securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_devicerisk_risklabel_ex_async(request, headers, runtime)

    def query_devicerisk_risklabel_ex(
        self,
        request: hk__securitytech_models.QueryDeviceriskRisklabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryDeviceriskRisklabelResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.devicerisk.risklabel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_devicerisk_risklabel_ex_async(
        self,
        request: hk__securitytech_models.QueryDeviceriskRisklabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.QueryDeviceriskRisklabelResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.devicerisk.risklabel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ashield_periodhardeningtask(
        self,
        request: hk__securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
    ) -> hk__securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ashield_periodhardeningtask_ex(request, headers, runtime)

    async def submit_ashield_periodhardeningtask_async(
        self,
        request: hk__securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
    ) -> hk__securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ashield_periodhardeningtask_ex_async(request, headers, runtime)

    def submit_ashield_periodhardeningtask_ex(
        self,
        request: hk__securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAshieldPeriodhardeningtaskResponse(),
            self.do_request('1.0', 'hksecuritytech.gateway.ashield.periodhardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ashield_periodhardeningtask_ex_async(
        self,
        request: hk__securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> hk__securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            hk__securitytech_models.SubmitAshieldPeriodhardeningtaskResponse(),
            await self.do_request_async('1.0', 'hksecuritytech.gateway.ashield.periodhardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
