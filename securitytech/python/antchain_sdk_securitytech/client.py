# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_securitytech import models as securitytech_models
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
        config: securitytech_models.Config,
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
            # 风险数据
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
                    'sdk_version': '1.2.28',
                    '_prod_code': 'SECURITYTECH',
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
            # 风险数据
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
                    'sdk_version': '1.2.28',
                    '_prod_code': 'SECURITYTECH',
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

    def run_general(
        self,
        request: securitytech_models.RunGeneralRequest,
    ) -> securitytech_models.RunGeneralResponse:
        """
        Description: 安全科技网关通用运行接口
        Summary: 安全科技网关通用运行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_general_ex(request, headers, runtime)

    async def run_general_async(
        self,
        request: securitytech_models.RunGeneralRequest,
    ) -> securitytech_models.RunGeneralResponse:
        """
        Description: 安全科技网关通用运行接口
        Summary: 安全科技网关通用运行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_general_ex_async(request, headers, runtime)

    def run_general_ex(
        self,
        request: securitytech_models.RunGeneralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RunGeneralResponse:
        """
        Description: 安全科技网关通用运行接口
        Summary: 安全科技网关通用运行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RunGeneralResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.general.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_general_ex_async(
        self,
        request: securitytech_models.RunGeneralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RunGeneralResponse:
        """
        Description: 安全科技网关通用运行接口
        Summary: 安全科技网关通用运行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RunGeneralResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.general.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_ekyt_insure(
        self,
        request: securitytech_models.ExecEkytInsureRequest,
    ) -> securitytech_models.ExecEkytInsureResponse:
        """
        Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
        Summary: 租赁住房保险产品，接口开放给租房平台
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_ekyt_insure_ex(request, headers, runtime)

    async def exec_ekyt_insure_async(
        self,
        request: securitytech_models.ExecEkytInsureRequest,
    ) -> securitytech_models.ExecEkytInsureResponse:
        """
        Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
        Summary: 租赁住房保险产品，接口开放给租房平台
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_ekyt_insure_ex_async(request, headers, runtime)

    def exec_ekyt_insure_ex(
        self,
        request: securitytech_models.ExecEkytInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ExecEkytInsureResponse:
        """
        Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
        Summary: 租赁住房保险产品，接口开放给租房平台
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ExecEkytInsureResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.insure.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_ekyt_insure_ex_async(
        self,
        request: securitytech_models.ExecEkytInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ExecEkytInsureResponse:
        """
        Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
        Summary: 租赁住房保险产品，接口开放给租房平台
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ExecEkytInsureResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.insure.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_bssecpic(
        self,
        request: securitytech_models.CreateBssecpicRequest,
    ) -> securitytech_models.CreateBssecpicResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_bssecpic_ex(request, headers, runtime)

    async def create_bssecpic_async(
        self,
        request: securitytech_models.CreateBssecpicRequest,
    ) -> securitytech_models.CreateBssecpicResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_bssecpic_ex_async(request, headers, runtime)

    def create_bssecpic_ex(
        self,
        request: securitytech_models.CreateBssecpicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.CreateBssecpicResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.CreateBssecpicResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.bssecpic.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_bssecpic_ex_async(
        self,
        request: securitytech_models.CreateBssecpicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.CreateBssecpicResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.CreateBssecpicResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.bssecpic.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blueshield_securitypicture(
        self,
        request: securitytech_models.CreateBlueshieldSecuritypictureRequest,
    ) -> securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blueshield_securitypicture_ex(request, headers, runtime)

    async def create_blueshield_securitypicture_async(
        self,
        request: securitytech_models.CreateBlueshieldSecuritypictureRequest,
    ) -> securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blueshield_securitypicture_ex_async(request, headers, runtime)

    def create_blueshield_securitypicture_ex(
        self,
        request: securitytech_models.CreateBlueshieldSecuritypictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.CreateBlueshieldSecuritypictureResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.blueshield.securitypicture.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blueshield_securitypicture_ex_async(
        self,
        request: securitytech_models.CreateBlueshieldSecuritypictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.CreateBlueshieldSecuritypictureResponse:
        """
        Description: 蓝盾安全图片生成
        Summary: 蓝盾安全图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.CreateBlueshieldSecuritypictureResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.blueshield.securitypicture.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceshield_native(
        self,
        request: securitytech_models.QueryFaceshieldNativeRequest,
    ) -> securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceshield_native_ex(request, headers, runtime)

    async def query_faceshield_native_async(
        self,
        request: securitytech_models.QueryFaceshieldNativeRequest,
    ) -> securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceshield_native_ex_async(request, headers, runtime)

    def query_faceshield_native_ex(
        self,
        request: securitytech_models.QueryFaceshieldNativeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryFaceshieldNativeResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.faceshield.native.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceshield_native_ex_async(
        self,
        request: securitytech_models.QueryFaceshieldNativeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryFaceshieldNativeResponse:
        """
        Description: 终端安全人脸盾Native查询
        Summary: 人脸盾Native查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryFaceshieldNativeResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.faceshield.native.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceshield_web(
        self,
        request: securitytech_models.QueryFaceshieldWebRequest,
    ) -> securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceshield_web_ex(request, headers, runtime)

    async def query_faceshield_web_async(
        self,
        request: securitytech_models.QueryFaceshieldWebRequest,
    ) -> securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceshield_web_ex_async(request, headers, runtime)

    def query_faceshield_web_ex(
        self,
        request: securitytech_models.QueryFaceshieldWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryFaceshieldWebResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.faceshield.web.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceshield_web_ex_async(
        self,
        request: securitytech_models.QueryFaceshieldWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryFaceshieldWebResponse:
        """
        Description: 终端安全人脸盾Web查询
        Summary: 人脸盾Web查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryFaceshieldWebResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.faceshield.web.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_iifaa_device(
        self,
        request: securitytech_models.InitIifaaDeviceRequest,
    ) -> securitytech_models.InitIifaaDeviceResponse:
        """
        Description: 设备激活
        Summary: 可信设备认证设备初始化，设备激活
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_iifaa_device_ex(request, headers, runtime)

    async def init_iifaa_device_async(
        self,
        request: securitytech_models.InitIifaaDeviceRequest,
    ) -> securitytech_models.InitIifaaDeviceResponse:
        """
        Description: 设备激活
        Summary: 可信设备认证设备初始化，设备激活
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_iifaa_device_ex_async(request, headers, runtime)

    def init_iifaa_device_ex(
        self,
        request: securitytech_models.InitIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.InitIifaaDeviceResponse:
        """
        Description: 设备激活
        Summary: 可信设备认证设备初始化，设备激活
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.InitIifaaDeviceResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.device.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_iifaa_device_ex_async(
        self,
        request: securitytech_models.InitIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.InitIifaaDeviceResponse:
        """
        Description: 设备激活
        Summary: 可信设备认证设备初始化，设备激活
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.InitIifaaDeviceResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.device.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_iifaa_device(
        self,
        request: securitytech_models.RecognizeIifaaDeviceRequest,
    ) -> securitytech_models.RecognizeIifaaDeviceResponse:
        """
        Description: 可信设备认证风险咨询，获取预认证数据
        Summary: 可信设备认证风险咨询，获取预认证数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_iifaa_device_ex(request, headers, runtime)

    async def recognize_iifaa_device_async(
        self,
        request: securitytech_models.RecognizeIifaaDeviceRequest,
    ) -> securitytech_models.RecognizeIifaaDeviceResponse:
        """
        Description: 可信设备认证风险咨询，获取预认证数据
        Summary: 可信设备认证风险咨询，获取预认证数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_iifaa_device_ex_async(request, headers, runtime)

    def recognize_iifaa_device_ex(
        self,
        request: securitytech_models.RecognizeIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RecognizeIifaaDeviceResponse:
        """
        Description: 可信设备认证风险咨询，获取预认证数据
        Summary: 可信设备认证风险咨询，获取预认证数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RecognizeIifaaDeviceResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.device.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_iifaa_device_ex_async(
        self,
        request: securitytech_models.RecognizeIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RecognizeIifaaDeviceResponse:
        """
        Description: 可信设备认证风险咨询，获取预认证数据
        Summary: 可信设备认证风险咨询，获取预认证数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RecognizeIifaaDeviceResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.device.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_iifaa_device(
        self,
        request: securitytech_models.VerifyIifaaDeviceRequest,
    ) -> securitytech_models.VerifyIifaaDeviceResponse:
        """
        Description: 可信设备认证，设备验证
        Summary: 可信设备认证，设备验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_iifaa_device_ex(request, headers, runtime)

    async def verify_iifaa_device_async(
        self,
        request: securitytech_models.VerifyIifaaDeviceRequest,
    ) -> securitytech_models.VerifyIifaaDeviceResponse:
        """
        Description: 可信设备认证，设备验证
        Summary: 可信设备认证，设备验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_iifaa_device_ex_async(request, headers, runtime)

    def verify_iifaa_device_ex(
        self,
        request: securitytech_models.VerifyIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.VerifyIifaaDeviceResponse:
        """
        Description: 可信设备认证，设备验证
        Summary: 可信设备认证，设备验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.VerifyIifaaDeviceResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.device.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_iifaa_device_ex_async(
        self,
        request: securitytech_models.VerifyIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.VerifyIifaaDeviceResponse:
        """
        Description: 可信设备认证，设备验证
        Summary: 可信设备认证，设备验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.VerifyIifaaDeviceResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.device.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_iifaa_corp(
        self,
        request: securitytech_models.RegisterIifaaCorpRequest,
    ) -> securitytech_models.RegisterIifaaCorpResponse:
        """
        Description: 可信设备认证，产商注册
        Summary: 可信设备认证，产商注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_iifaa_corp_ex(request, headers, runtime)

    async def register_iifaa_corp_async(
        self,
        request: securitytech_models.RegisterIifaaCorpRequest,
    ) -> securitytech_models.RegisterIifaaCorpResponse:
        """
        Description: 可信设备认证，产商注册
        Summary: 可信设备认证，产商注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_iifaa_corp_ex_async(request, headers, runtime)

    def register_iifaa_corp_ex(
        self,
        request: securitytech_models.RegisterIifaaCorpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RegisterIifaaCorpResponse:
        """
        Description: 可信设备认证，产商注册
        Summary: 可信设备认证，产商注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RegisterIifaaCorpResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.corp.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_iifaa_corp_ex_async(
        self,
        request: securitytech_models.RegisterIifaaCorpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RegisterIifaaCorpResponse:
        """
        Description: 可信设备认证，产商注册
        Summary: 可信设备认证，产商注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RegisterIifaaCorpResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.corp.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deprecate_iifaa_device(
        self,
        request: securitytech_models.DeprecateIifaaDeviceRequest,
    ) -> securitytech_models.DeprecateIifaaDeviceResponse:
        """
        Description: 可信设备认证，擦除设备信息
        Summary: 可信设备认证，擦除设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deprecate_iifaa_device_ex(request, headers, runtime)

    async def deprecate_iifaa_device_async(
        self,
        request: securitytech_models.DeprecateIifaaDeviceRequest,
    ) -> securitytech_models.DeprecateIifaaDeviceResponse:
        """
        Description: 可信设备认证，擦除设备信息
        Summary: 可信设备认证，擦除设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deprecate_iifaa_device_ex_async(request, headers, runtime)

    def deprecate_iifaa_device_ex(
        self,
        request: securitytech_models.DeprecateIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.DeprecateIifaaDeviceResponse:
        """
        Description: 可信设备认证，擦除设备信息
        Summary: 可信设备认证，擦除设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.DeprecateIifaaDeviceResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.device.deprecate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deprecate_iifaa_device_ex_async(
        self,
        request: securitytech_models.DeprecateIifaaDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.DeprecateIifaaDeviceResponse:
        """
        Description: 可信设备认证，擦除设备信息
        Summary: 可信设备认证，擦除设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.DeprecateIifaaDeviceResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.device.deprecate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def run_xhunter_spi(
        self,
        request: securitytech_models.RunXhunterSpiRequest,
    ) -> securitytech_models.RunXhunterSpiResponse:
        """
        Description: 巡检商业化
        Summary: 巡检商业化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_xhunter_spi_ex(request, headers, runtime)

    async def run_xhunter_spi_async(
        self,
        request: securitytech_models.RunXhunterSpiRequest,
    ) -> securitytech_models.RunXhunterSpiResponse:
        """
        Description: 巡检商业化
        Summary: 巡检商业化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_xhunter_spi_ex_async(request, headers, runtime)

    def run_xhunter_spi_ex(
        self,
        request: securitytech_models.RunXhunterSpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RunXhunterSpiResponse:
        """
        Description: 巡检商业化
        Summary: 巡检商业化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RunXhunterSpiResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.xhunter.spi.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_xhunter_spi_ex_async(
        self,
        request: securitytech_models.RunXhunterSpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RunXhunterSpiResponse:
        """
        Description: 巡检商业化
        Summary: 巡检商业化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RunXhunterSpiResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.xhunter.spi.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_iifaa_insure(
        self,
        request: securitytech_models.ExecIifaaInsureRequest,
    ) -> securitytech_models.ExecIifaaInsureResponse:
        """
        Description: 租凭住房保险产品，接口开放给租房平台
        Summary: 租凭住房保险产品，接口开放给租房平台
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_iifaa_insure_ex(request, headers, runtime)

    async def exec_iifaa_insure_async(
        self,
        request: securitytech_models.ExecIifaaInsureRequest,
    ) -> securitytech_models.ExecIifaaInsureResponse:
        """
        Description: 租凭住房保险产品，接口开放给租房平台
        Summary: 租凭住房保险产品，接口开放给租房平台
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_iifaa_insure_ex_async(request, headers, runtime)

    def exec_iifaa_insure_ex(
        self,
        request: securitytech_models.ExecIifaaInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ExecIifaaInsureResponse:
        """
        Description: 租凭住房保险产品，接口开放给租房平台
        Summary: 租凭住房保险产品，接口开放给租房平台
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ExecIifaaInsureResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.insure.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_iifaa_insure_ex_async(
        self,
        request: securitytech_models.ExecIifaaInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ExecIifaaInsureResponse:
        """
        Description: 租凭住房保险产品，接口开放给租房平台
        Summary: 租凭住房保险产品，接口开放给租房平台
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ExecIifaaInsureResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.insure.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cct_picture(
        self,
        request: securitytech_models.QueryCctPictureRequest,
    ) -> securitytech_models.QueryCctPictureResponse:
        """
        Description: 内容安全图片同步检测
        Summary: 内容安全图片同步检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cct_picture_ex(request, headers, runtime)

    async def query_cct_picture_async(
        self,
        request: securitytech_models.QueryCctPictureRequest,
    ) -> securitytech_models.QueryCctPictureResponse:
        """
        Description: 内容安全图片同步检测
        Summary: 内容安全图片同步检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cct_picture_ex_async(request, headers, runtime)

    def query_cct_picture_ex(
        self,
        request: securitytech_models.QueryCctPictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryCctPictureResponse:
        """
        Description: 内容安全图片同步检测
        Summary: 内容安全图片同步检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryCctPictureResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.cct.picture.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cct_picture_ex_async(
        self,
        request: securitytech_models.QueryCctPictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryCctPictureResponse:
        """
        Description: 内容安全图片同步检测
        Summary: 内容安全图片同步检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryCctPictureResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.cct.picture.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_cct_analyze(
        self,
        request: securitytech_models.RecognizeCctAnalyzeRequest,
    ) -> securitytech_models.RecognizeCctAnalyzeResponse:
        """
        Description: 内容安全主站同步检测
        Summary: 内容安全主站同步检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_cct_analyze_ex(request, headers, runtime)

    async def recognize_cct_analyze_async(
        self,
        request: securitytech_models.RecognizeCctAnalyzeRequest,
    ) -> securitytech_models.RecognizeCctAnalyzeResponse:
        """
        Description: 内容安全主站同步检测
        Summary: 内容安全主站同步检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_cct_analyze_ex_async(request, headers, runtime)

    def recognize_cct_analyze_ex(
        self,
        request: securitytech_models.RecognizeCctAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RecognizeCctAnalyzeResponse:
        """
        Description: 内容安全主站同步检测
        Summary: 内容安全主站同步检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RecognizeCctAnalyzeResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.cct.analyze.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_cct_analyze_ex_async(
        self,
        request: securitytech_models.RecognizeCctAnalyzeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.RecognizeCctAnalyzeResponse:
        """
        Description: 内容安全主站同步检测
        Summary: 内容安全主站同步检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.RecognizeCctAnalyzeResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.cct.analyze.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_risk_general(
        self,
        request: securitytech_models.QueryRiskGeneralRequest,
    ) -> securitytech_models.QueryRiskGeneralResponse:
        """
        Description: RAAS数据服务统一接口
        Summary: RAAS数据服务统一接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_general_ex(request, headers, runtime)

    async def query_risk_general_async(
        self,
        request: securitytech_models.QueryRiskGeneralRequest,
    ) -> securitytech_models.QueryRiskGeneralResponse:
        """
        Description: RAAS数据服务统一接口
        Summary: RAAS数据服务统一接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_general_ex_async(request, headers, runtime)

    def query_risk_general_ex(
        self,
        request: securitytech_models.QueryRiskGeneralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryRiskGeneralResponse:
        """
        Description: RAAS数据服务统一接口
        Summary: RAAS数据服务统一接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryRiskGeneralResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.risk.general.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_general_ex_async(
        self,
        request: securitytech_models.QueryRiskGeneralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryRiskGeneralResponse:
        """
        Description: RAAS数据服务统一接口
        Summary: RAAS数据服务统一接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryRiskGeneralResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.risk.general.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_devicerisk_finger(
        self,
        request: securitytech_models.QueryDeviceriskFingerRequest,
    ) -> securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备指纹查询
        Summary: 设备指纹查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_devicerisk_finger_ex(request, headers, runtime)

    async def query_devicerisk_finger_async(
        self,
        request: securitytech_models.QueryDeviceriskFingerRequest,
    ) -> securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备指纹查询
        Summary: 设备指纹查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_devicerisk_finger_ex_async(request, headers, runtime)

    def query_devicerisk_finger_ex(
        self,
        request: securitytech_models.QueryDeviceriskFingerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备指纹查询
        Summary: 设备指纹查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceriskFingerResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.devicerisk.finger.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_devicerisk_finger_ex_async(
        self,
        request: securitytech_models.QueryDeviceriskFingerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceriskFingerResponse:
        """
        Description: 设备指纹查询
        Summary: 设备指纹查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceriskFingerResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.devicerisk.finger.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_devicerisk_risklabel(
        self,
        request: securitytech_models.QueryDeviceriskRisklabelRequest,
    ) -> securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_devicerisk_risklabel_ex(request, headers, runtime)

    async def query_devicerisk_risklabel_async(
        self,
        request: securitytech_models.QueryDeviceriskRisklabelRequest,
    ) -> securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_devicerisk_risklabel_ex_async(request, headers, runtime)

    def query_devicerisk_risklabel_ex(
        self,
        request: securitytech_models.QueryDeviceriskRisklabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceriskRisklabelResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.devicerisk.risklabel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_devicerisk_risklabel_ex_async(
        self,
        request: securitytech_models.QueryDeviceriskRisklabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceriskRisklabelResponse:
        """
        Description: 风险标签查询
        Summary: 风险标签查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceriskRisklabelResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.devicerisk.risklabel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_devicerisk_devicerisk(
        self,
        request: securitytech_models.QueryDeviceriskDeviceriskRequest,
    ) -> securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_devicerisk_devicerisk_ex(request, headers, runtime)

    async def query_devicerisk_devicerisk_async(
        self,
        request: securitytech_models.QueryDeviceriskDeviceriskRequest,
    ) -> securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_devicerisk_devicerisk_ex_async(request, headers, runtime)

    def query_devicerisk_devicerisk_ex(
        self,
        request: securitytech_models.QueryDeviceriskDeviceriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceriskDeviceriskResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.devicerisk.devicerisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_devicerisk_devicerisk_ex_async(
        self,
        request: securitytech_models.QueryDeviceriskDeviceriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceriskDeviceriskResponse:
        """
        Description: 设备风险查询
        Summary: 设备风险查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceriskDeviceriskResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.devicerisk.devicerisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_devicerisk_report(
        self,
        request: securitytech_models.SubmitDeviceriskReportRequest,
    ) -> securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 设备信息上报
        Summary: 设备信息上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_devicerisk_report_ex(request, headers, runtime)

    async def submit_devicerisk_report_async(
        self,
        request: securitytech_models.SubmitDeviceriskReportRequest,
    ) -> securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 设备信息上报
        Summary: 设备信息上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_devicerisk_report_ex_async(request, headers, runtime)

    def submit_devicerisk_report_ex(
        self,
        request: securitytech_models.SubmitDeviceriskReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 设备信息上报
        Summary: 设备信息上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.SubmitDeviceriskReportResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.devicerisk.report.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_devicerisk_report_ex_async(
        self,
        request: securitytech_models.SubmitDeviceriskReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.SubmitDeviceriskReportResponse:
        """
        Description: 设备信息上报
        Summary: 设备信息上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.SubmitDeviceriskReportResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.devicerisk.report.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ekyt_driver(
        self,
        request: securitytech_models.QueryEkytDriverRequest,
    ) -> securitytech_models.QueryEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ekyt_driver_ex(request, headers, runtime)

    async def query_ekyt_driver_async(
        self,
        request: securitytech_models.QueryEkytDriverRequest,
    ) -> securitytech_models.QueryEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ekyt_driver_ex_async(request, headers, runtime)

    def query_ekyt_driver_ex(
        self,
        request: securitytech_models.QueryEkytDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryEkytDriverResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.driver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ekyt_driver_ex_async(
        self,
        request: securitytech_models.QueryEkytDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryEkytDriverResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.driver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_iifaa_devicekey(
        self,
        request: securitytech_models.ApplyIifaaDevicekeyRequest,
    ) -> securitytech_models.ApplyIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_iifaa_devicekey_ex(request, headers, runtime)

    async def apply_iifaa_devicekey_async(
        self,
        request: securitytech_models.ApplyIifaaDevicekeyRequest,
    ) -> securitytech_models.ApplyIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_iifaa_devicekey_ex_async(request, headers, runtime)

    def apply_iifaa_devicekey_ex(
        self,
        request: securitytech_models.ApplyIifaaDevicekeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ApplyIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ApplyIifaaDevicekeyResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.devicekey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_iifaa_devicekey_ex_async(
        self,
        request: securitytech_models.ApplyIifaaDevicekeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ApplyIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ApplyIifaaDevicekeyResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.devicekey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deviceplus_riskquery(
        self,
        request: securitytech_models.QueryDeviceplusRiskqueryRequest,
    ) -> securitytech_models.QueryDeviceplusRiskqueryResponse:
        """
        Description: 设备风险咨询
        Summary: 设备风险咨询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deviceplus_riskquery_ex(request, headers, runtime)

    async def query_deviceplus_riskquery_async(
        self,
        request: securitytech_models.QueryDeviceplusRiskqueryRequest,
    ) -> securitytech_models.QueryDeviceplusRiskqueryResponse:
        """
        Description: 设备风险咨询
        Summary: 设备风险咨询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deviceplus_riskquery_ex_async(request, headers, runtime)

    def query_deviceplus_riskquery_ex(
        self,
        request: securitytech_models.QueryDeviceplusRiskqueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceplusRiskqueryResponse:
        """
        Description: 设备风险咨询
        Summary: 设备风险咨询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceplusRiskqueryResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.deviceplus.riskquery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deviceplus_riskquery_ex_async(
        self,
        request: securitytech_models.QueryDeviceplusRiskqueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceplusRiskqueryResponse:
        """
        Description: 设备风险咨询
        Summary: 设备风险咨询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceplusRiskqueryResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.deviceplus.riskquery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deviceplus_mpaas(
        self,
        request: securitytech_models.QueryDeviceplusMpaasRequest,
    ) -> securitytech_models.QueryDeviceplusMpaasResponse:
        """
        Description: 设备风险咨询mpaas
        Summary: 设备风险咨询mpaas
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deviceplus_mpaas_ex(request, headers, runtime)

    async def query_deviceplus_mpaas_async(
        self,
        request: securitytech_models.QueryDeviceplusMpaasRequest,
    ) -> securitytech_models.QueryDeviceplusMpaasResponse:
        """
        Description: 设备风险咨询mpaas
        Summary: 设备风险咨询mpaas
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deviceplus_mpaas_ex_async(request, headers, runtime)

    def query_deviceplus_mpaas_ex(
        self,
        request: securitytech_models.QueryDeviceplusMpaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceplusMpaasResponse:
        """
        Description: 设备风险咨询mpaas
        Summary: 设备风险咨询mpaas
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceplusMpaasResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.deviceplus.mpaas.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deviceplus_mpaas_ex_async(
        self,
        request: securitytech_models.QueryDeviceplusMpaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryDeviceplusMpaasResponse:
        """
        Description: 设备风险咨询mpaas
        Summary: 设备风险咨询mpaas
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryDeviceplusMpaasResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.deviceplus.mpaas.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ashield_periodhardeningtask(
        self,
        request: securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
    ) -> securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ashield_periodhardeningtask_ex(request, headers, runtime)

    async def submit_ashield_periodhardeningtask_async(
        self,
        request: securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
    ) -> securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ashield_periodhardeningtask_ex_async(request, headers, runtime)

    def submit_ashield_periodhardeningtask_ex(
        self,
        request: securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.SubmitAshieldPeriodhardeningtaskResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ashield.periodhardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ashield_periodhardeningtask_ex_async(
        self,
        request: securitytech_models.SubmitAshieldPeriodhardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.SubmitAshieldPeriodhardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务(包月)
        Summary: 启动加固任务(包月)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.SubmitAshieldPeriodhardeningtaskResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ashield.periodhardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_filetoken(
        self,
        request: securitytech_models.GetAshieldFiletokenRequest,
    ) -> securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_filetoken_ex(request, headers, runtime)

    async def get_ashield_filetoken_async(
        self,
        request: securitytech_models.GetAshieldFiletokenRequest,
    ) -> securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_filetoken_ex_async(request, headers, runtime)

    def get_ashield_filetoken_ex(
        self,
        request: securitytech_models.GetAshieldFiletokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldFiletokenResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ashield.filetoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_filetoken_ex_async(
        self,
        request: securitytech_models.GetAshieldFiletokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldFiletokenResponse:
        """
        Description: 终端安全-Android应用加固-获取上传文件的临时URL
        Summary: 获取上传文件的临时URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldFiletokenResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ashield.filetoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ashield_hardeningtask(
        self,
        request: securitytech_models.SubmitAshieldHardeningtaskRequest,
    ) -> securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务
        Summary: 启动加固任务(按次计费)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ashield_hardeningtask_ex(request, headers, runtime)

    async def submit_ashield_hardeningtask_async(
        self,
        request: securitytech_models.SubmitAshieldHardeningtaskRequest,
    ) -> securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务
        Summary: 启动加固任务(按次计费)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ashield_hardeningtask_ex_async(request, headers, runtime)

    def submit_ashield_hardeningtask_ex(
        self,
        request: securitytech_models.SubmitAshieldHardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务
        Summary: 启动加固任务(按次计费)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.SubmitAshieldHardeningtaskResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ashield.hardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ashield_hardeningtask_ex_async(
        self,
        request: securitytech_models.SubmitAshieldHardeningtaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.SubmitAshieldHardeningtaskResponse:
        """
        Description: 终端安全-Android应用加固-启动加固任务
        Summary: 启动加固任务(按次计费)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.SubmitAshieldHardeningtaskResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ashield.hardeningtask.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_hardeningtaskprocess(
        self,
        request: securitytech_models.GetAshieldHardeningtaskprocessRequest,
    ) -> securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_hardeningtaskprocess_ex(request, headers, runtime)

    async def get_ashield_hardeningtaskprocess_async(
        self,
        request: securitytech_models.GetAshieldHardeningtaskprocessRequest,
    ) -> securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_hardeningtaskprocess_ex_async(request, headers, runtime)

    def get_ashield_hardeningtaskprocess_ex(
        self,
        request: securitytech_models.GetAshieldHardeningtaskprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldHardeningtaskprocessResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ashield.hardeningtaskprocess.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_hardeningtaskprocess_ex_async(
        self,
        request: securitytech_models.GetAshieldHardeningtaskprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldHardeningtaskprocessResponse:
        """
        Description: 终端安全-Android应用加固-查询加固任务进度
        Summary: 查询加固任务进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldHardeningtaskprocessResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ashield.hardeningtaskprocess.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_hardeningresult(
        self,
        request: securitytech_models.GetAshieldHardeningresultRequest,
    ) -> securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_hardeningresult_ex(request, headers, runtime)

    async def get_ashield_hardeningresult_async(
        self,
        request: securitytech_models.GetAshieldHardeningresultRequest,
    ) -> securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_hardeningresult_ex_async(request, headers, runtime)

    def get_ashield_hardeningresult_ex(
        self,
        request: securitytech_models.GetAshieldHardeningresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldHardeningresultResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ashield.hardeningresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_hardeningresult_ex_async(
        self,
        request: securitytech_models.GetAshieldHardeningresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldHardeningresultResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的产物下载链接
        Summary: 查询加固后的产物下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldHardeningresultResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ashield.hardeningresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ashield_hardeninglog(
        self,
        request: securitytech_models.GetAshieldHardeninglogRequest,
    ) -> securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ashield_hardeninglog_ex(request, headers, runtime)

    async def get_ashield_hardeninglog_async(
        self,
        request: securitytech_models.GetAshieldHardeninglogRequest,
    ) -> securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ashield_hardeninglog_ex_async(request, headers, runtime)

    def get_ashield_hardeninglog_ex(
        self,
        request: securitytech_models.GetAshieldHardeninglogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldHardeninglogResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ashield.hardeninglog.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ashield_hardeninglog_ex_async(
        self,
        request: securitytech_models.GetAshieldHardeninglogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.GetAshieldHardeninglogResponse:
        """
        Description: 终端安全-Android应用加固-查询加固后的日志下载链接
        Summary: 查询加固后的日志下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.GetAshieldHardeninglogResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ashield.hardeninglog.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_ekyt_trustsign(
        self,
        request: securitytech_models.InitEkytTrustsignRequest,
    ) -> securitytech_models.InitEkytTrustsignResponse:
        """
        Description: eKYT可信签约初始化
        Summary: eKYT可信签约-初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_ekyt_trustsign_ex(request, headers, runtime)

    async def init_ekyt_trustsign_async(
        self,
        request: securitytech_models.InitEkytTrustsignRequest,
    ) -> securitytech_models.InitEkytTrustsignResponse:
        """
        Description: eKYT可信签约初始化
        Summary: eKYT可信签约-初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_ekyt_trustsign_ex_async(request, headers, runtime)

    def init_ekyt_trustsign_ex(
        self,
        request: securitytech_models.InitEkytTrustsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.InitEkytTrustsignResponse:
        """
        Description: eKYT可信签约初始化
        Summary: eKYT可信签约-初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.InitEkytTrustsignResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.trustsign.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_ekyt_trustsign_ex_async(
        self,
        request: securitytech_models.InitEkytTrustsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.InitEkytTrustsignResponse:
        """
        Description: eKYT可信签约初始化
        Summary: eKYT可信签约-初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.InitEkytTrustsignResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.trustsign.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ekyt_trustsign(
        self,
        request: securitytech_models.QueryEkytTrustsignRequest,
    ) -> securitytech_models.QueryEkytTrustsignResponse:
        """
        Description: eKYT可信签约签约单查询
        Summary: eKYT可信签约-签约单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ekyt_trustsign_ex(request, headers, runtime)

    async def query_ekyt_trustsign_async(
        self,
        request: securitytech_models.QueryEkytTrustsignRequest,
    ) -> securitytech_models.QueryEkytTrustsignResponse:
        """
        Description: eKYT可信签约签约单查询
        Summary: eKYT可信签约-签约单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ekyt_trustsign_ex_async(request, headers, runtime)

    def query_ekyt_trustsign_ex(
        self,
        request: securitytech_models.QueryEkytTrustsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryEkytTrustsignResponse:
        """
        Description: eKYT可信签约签约单查询
        Summary: eKYT可信签约-签约单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryEkytTrustsignResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.trustsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ekyt_trustsign_ex_async(
        self,
        request: securitytech_models.QueryEkytTrustsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryEkytTrustsignResponse:
        """
        Description: eKYT可信签约签约单查询
        Summary: eKYT可信签约-签约单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryEkytTrustsignResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.trustsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_ekyt_faceverify(
        self,
        request: securitytech_models.InitEkytFaceverifyRequest,
    ) -> securitytech_models.InitEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身初始化
        Summary: eKYT人脸核身-初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_ekyt_faceverify_ex(request, headers, runtime)

    async def init_ekyt_faceverify_async(
        self,
        request: securitytech_models.InitEkytFaceverifyRequest,
    ) -> securitytech_models.InitEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身初始化
        Summary: eKYT人脸核身-初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_ekyt_faceverify_ex_async(request, headers, runtime)

    def init_ekyt_faceverify_ex(
        self,
        request: securitytech_models.InitEkytFaceverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.InitEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身初始化
        Summary: eKYT人脸核身-初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.InitEkytFaceverifyResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.faceverify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_ekyt_faceverify_ex_async(
        self,
        request: securitytech_models.InitEkytFaceverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.InitEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身初始化
        Summary: eKYT人脸核身-初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.InitEkytFaceverifyResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.faceverify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ekyt_faceverify(
        self,
        request: securitytech_models.QueryEkytFaceverifyRequest,
    ) -> securitytech_models.QueryEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身结果查询
        Summary: eKYT人脸核身-结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ekyt_faceverify_ex(request, headers, runtime)

    async def query_ekyt_faceverify_async(
        self,
        request: securitytech_models.QueryEkytFaceverifyRequest,
    ) -> securitytech_models.QueryEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身结果查询
        Summary: eKYT人脸核身-结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ekyt_faceverify_ex_async(request, headers, runtime)

    def query_ekyt_faceverify_ex(
        self,
        request: securitytech_models.QueryEkytFaceverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身结果查询
        Summary: eKYT人脸核身-结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryEkytFaceverifyResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.faceverify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ekyt_faceverify_ex_async(
        self,
        request: securitytech_models.QueryEkytFaceverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryEkytFaceverifyResponse:
        """
        Description: eKYT人脸核身结果查询
        Summary: eKYT人脸核身-结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryEkytFaceverifyResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.faceverify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_yhll(
        self,
        request: securitytech_models.ImportYhllRequest,
    ) -> securitytech_models.ImportYhllResponse:
        """
        Description: 友活来了创建任务api
        Summary: 友活来了创建任务api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_yhll_ex(request, headers, runtime)

    async def import_yhll_async(
        self,
        request: securitytech_models.ImportYhllRequest,
    ) -> securitytech_models.ImportYhllResponse:
        """
        Description: 友活来了创建任务api
        Summary: 友活来了创建任务api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_yhll_ex_async(request, headers, runtime)

    def import_yhll_ex(
        self,
        request: securitytech_models.ImportYhllRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ImportYhllResponse:
        """
        Description: 友活来了创建任务api
        Summary: 友活来了创建任务api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ImportYhllResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.yhll.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_yhll_ex_async(
        self,
        request: securitytech_models.ImportYhllRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.ImportYhllResponse:
        """
        Description: 友活来了创建任务api
        Summary: 友活来了创建任务api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.ImportYhllResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.yhll.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_yhll(
        self,
        request: securitytech_models.QueryYhllRequest,
    ) -> securitytech_models.QueryYhllResponse:
        """
        Description: 友活来了任务查询api
        Summary: 友活来了任务查询api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_yhll_ex(request, headers, runtime)

    async def query_yhll_async(
        self,
        request: securitytech_models.QueryYhllRequest,
    ) -> securitytech_models.QueryYhllResponse:
        """
        Description: 友活来了任务查询api
        Summary: 友活来了任务查询api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_yhll_ex_async(request, headers, runtime)

    def query_yhll_ex(
        self,
        request: securitytech_models.QueryYhllRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryYhllResponse:
        """
        Description: 友活来了任务查询api
        Summary: 友活来了任务查询api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryYhllResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.yhll.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_yhll_ex_async(
        self,
        request: securitytech_models.QueryYhllRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryYhllResponse:
        """
        Description: 友活来了任务查询api
        Summary: 友活来了任务查询api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryYhllResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.yhll.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_guard_ask(
        self,
        request: securitytech_models.QueryGuardAskRequest,
    ) -> securitytech_models.QueryGuardAskResponse:
        """
        Description: 天鉴ask接口
        Summary: 天鉴ask接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_guard_ask_ex(request, headers, runtime)

    async def query_guard_ask_async(
        self,
        request: securitytech_models.QueryGuardAskRequest,
    ) -> securitytech_models.QueryGuardAskResponse:
        """
        Description: 天鉴ask接口
        Summary: 天鉴ask接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_guard_ask_ex_async(request, headers, runtime)

    def query_guard_ask_ex(
        self,
        request: securitytech_models.QueryGuardAskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryGuardAskResponse:
        """
        Description: 天鉴ask接口
        Summary: 天鉴ask接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryGuardAskResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.guard.ask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_guard_ask_ex_async(
        self,
        request: securitytech_models.QueryGuardAskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> securitytech_models.QueryGuardAskResponse:
        """
        Description: 天鉴ask接口
        Summary: 天鉴ask接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            securitytech_models.QueryGuardAskResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.guard.ask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
