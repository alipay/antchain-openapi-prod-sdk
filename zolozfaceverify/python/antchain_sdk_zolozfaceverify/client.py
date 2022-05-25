# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_zolozfaceverify import models as zolozfaceverify_models
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
        config: zolozfaceverify_models.Config,
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
            # 计量详细结果
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
                    'sdk_version': '1.5.0'
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
            # 计量详细结果
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
                    'sdk_version': '1.5.0'
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

    def exec_faceauth_algorithm(
        self,
        request: zolozfaceverify_models.ExecFaceauthAlgorithmRequest,
    ) -> zolozfaceverify_models.ExecFaceauthAlgorithmResponse:
        """
        Description: 金融云计算能力输出给主站使用
        Summary: 金融云计算能力输出给主站使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_faceauth_algorithm_ex(request, headers, runtime)

    async def exec_faceauth_algorithm_async(
        self,
        request: zolozfaceverify_models.ExecFaceauthAlgorithmRequest,
    ) -> zolozfaceverify_models.ExecFaceauthAlgorithmResponse:
        """
        Description: 金融云计算能力输出给主站使用
        Summary: 金融云计算能力输出给主站使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_faceauth_algorithm_ex_async(request, headers, runtime)

    def exec_faceauth_algorithm_ex(
        self,
        request: zolozfaceverify_models.ExecFaceauthAlgorithmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.ExecFaceauthAlgorithmResponse:
        """
        Description: 金融云计算能力输出给主站使用
        Summary: 金融云计算能力输出给主站使用
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.ExecFaceauthAlgorithmResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.algorithm.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_faceauth_algorithm_ex_async(
        self,
        request: zolozfaceverify_models.ExecFaceauthAlgorithmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.ExecFaceauthAlgorithmResponse:
        """
        Description: 金融云计算能力输出给主站使用
        Summary: 金融云计算能力输出给主站使用
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.ExecFaceauthAlgorithmResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.algorithm.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def face_faceauth_initialize(
        self,
        request: zolozfaceverify_models.FaceFaceauthInitializeRequest,
    ) -> zolozfaceverify_models.FaceFaceauthInitializeResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.face_faceauth_initialize_ex(request, headers, runtime)

    async def face_faceauth_initialize_async(
        self,
        request: zolozfaceverify_models.FaceFaceauthInitializeRequest,
    ) -> zolozfaceverify_models.FaceFaceauthInitializeResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.face_faceauth_initialize_ex_async(request, headers, runtime)

    def face_faceauth_initialize_ex(
        self,
        request: zolozfaceverify_models.FaceFaceauthInitializeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.FaceFaceauthInitializeResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.FaceFaceauthInitializeResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.initialize.face', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def face_faceauth_initialize_ex_async(
        self,
        request: zolozfaceverify_models.FaceFaceauthInitializeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.FaceFaceauthInitializeResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.FaceFaceauthInitializeResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.initialize.face', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def face_faceauth_query(
        self,
        request: zolozfaceverify_models.FaceFaceauthQueryRequest,
    ) -> zolozfaceverify_models.FaceFaceauthQueryResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.face_faceauth_query_ex(request, headers, runtime)

    async def face_faceauth_query_async(
        self,
        request: zolozfaceverify_models.FaceFaceauthQueryRequest,
    ) -> zolozfaceverify_models.FaceFaceauthQueryResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.face_faceauth_query_ex_async(request, headers, runtime)

    def face_faceauth_query_ex(
        self,
        request: zolozfaceverify_models.FaceFaceauthQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.FaceFaceauthQueryResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.FaceFaceauthQueryResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.query.face', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def face_faceauth_query_ex_async(
        self,
        request: zolozfaceverify_models.FaceFaceauthQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.FaceFaceauthQueryResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.FaceFaceauthQueryResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.query.face', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def identity_faceauth_servermode(
        self,
        request: zolozfaceverify_models.IdentityFaceauthServermodeRequest,
    ) -> zolozfaceverify_models.IdentityFaceauthServermodeResponse:
        """
        Description: 人脸纯服务端模式比对
        Summary: 人脸纯服务端模式比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.identity_faceauth_servermode_ex(request, headers, runtime)

    async def identity_faceauth_servermode_async(
        self,
        request: zolozfaceverify_models.IdentityFaceauthServermodeRequest,
    ) -> zolozfaceverify_models.IdentityFaceauthServermodeResponse:
        """
        Description: 人脸纯服务端模式比对
        Summary: 人脸纯服务端模式比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.identity_faceauth_servermode_ex_async(request, headers, runtime)

    def identity_faceauth_servermode_ex(
        self,
        request: zolozfaceverify_models.IdentityFaceauthServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.IdentityFaceauthServermodeResponse:
        """
        Description: 人脸纯服务端模式比对
        Summary: 人脸纯服务端模式比对
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.IdentityFaceauthServermodeResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.servermode.identity', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def identity_faceauth_servermode_ex_async(
        self,
        request: zolozfaceverify_models.IdentityFaceauthServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.IdentityFaceauthServermodeResponse:
        """
        Description: 人脸纯服务端模式比对
        Summary: 人脸纯服务端模式比对
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.IdentityFaceauthServermodeResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.servermode.identity', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def initialize_faceauth_web(
        self,
        request: zolozfaceverify_models.InitializeFaceauthWebRequest,
    ) -> zolozfaceverify_models.InitializeFaceauthWebResponse:
        """
        Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: H5实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.initialize_faceauth_web_ex(request, headers, runtime)

    async def initialize_faceauth_web_async(
        self,
        request: zolozfaceverify_models.InitializeFaceauthWebRequest,
    ) -> zolozfaceverify_models.InitializeFaceauthWebResponse:
        """
        Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: H5实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.initialize_faceauth_web_ex_async(request, headers, runtime)

    def initialize_faceauth_web_ex(
        self,
        request: zolozfaceverify_models.InitializeFaceauthWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitializeFaceauthWebResponse:
        """
        Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: H5实人认证初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitializeFaceauthWebResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.web.initialize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def initialize_faceauth_web_ex_async(
        self,
        request: zolozfaceverify_models.InitializeFaceauthWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitializeFaceauthWebResponse:
        """
        Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: H5实人认证初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitializeFaceauthWebResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.web.initialize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_web(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebRequest,
    ) -> zolozfaceverify_models.QueryFaceauthWebResponse:
        """
        Description: H5实人认证查询
        Summary: H5实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_web_ex(request, headers, runtime)

    async def query_faceauth_web_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebRequest,
    ) -> zolozfaceverify_models.QueryFaceauthWebResponse:
        """
        Description: H5实人认证查询
        Summary: H5实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_web_ex_async(request, headers, runtime)

    def query_faceauth_web_ex(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthWebResponse:
        """
        Description: H5实人认证查询
        Summary: H5实人认证查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthWebResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.web.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_web_ex_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthWebResponse:
        """
        Description: H5实人认证查询
        Summary: H5实人认证查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthWebResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.web.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_metering(
        self,
        request: zolozfaceverify_models.QueryFaceauthMeteringRequest,
    ) -> zolozfaceverify_models.QueryFaceauthMeteringResponse:
        """
        Description: 提供给业务方刷脸认证计量查询接口
        Summary: 提供给业务方刷脸认证计量查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_metering_ex(request, headers, runtime)

    async def query_faceauth_metering_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthMeteringRequest,
    ) -> zolozfaceverify_models.QueryFaceauthMeteringResponse:
        """
        Description: 提供给业务方刷脸认证计量查询接口
        Summary: 提供给业务方刷脸认证计量查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_metering_ex_async(request, headers, runtime)

    def query_faceauth_metering_ex(
        self,
        request: zolozfaceverify_models.QueryFaceauthMeteringRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthMeteringResponse:
        """
        Description: 提供给业务方刷脸认证计量查询接口
        Summary: 提供给业务方刷脸认证计量查询接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthMeteringResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.metering.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_metering_ex_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthMeteringRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthMeteringResponse:
        """
        Description: 提供给业务方刷脸认证计量查询接口
        Summary: 提供给业务方刷脸认证计量查询接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthMeteringResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.metering.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_faceauth_face_lite(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceLiteRequest,
    ) -> zolozfaceverify_models.InitFaceauthFaceLiteResponse:
        """
        Description: 极简模式初始化接口，返回zimId和协议
        Summary: 极简模式初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceauth_face_lite_ex(request, headers, runtime)

    async def init_faceauth_face_lite_async(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceLiteRequest,
    ) -> zolozfaceverify_models.InitFaceauthFaceLiteResponse:
        """
        Description: 极简模式初始化接口，返回zimId和协议
        Summary: 极简模式初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceauth_face_lite_ex_async(request, headers, runtime)

    def init_faceauth_face_lite_ex(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceLiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthFaceLiteResponse:
        """
        Description: 极简模式初始化接口，返回zimId和协议
        Summary: 极简模式初始化接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthFaceLiteResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.face.lite.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceauth_face_lite_ex_async(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceLiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthFaceLiteResponse:
        """
        Description: 极简模式初始化接口，返回zimId和协议
        Summary: 极简模式初始化接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthFaceLiteResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.face.lite.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_data(
        self,
        request: zolozfaceverify_models.QueryFaceauthDataRequest,
    ) -> zolozfaceverify_models.QueryFaceauthDataResponse:
        """
        Description: 数据查询，排查case
        Summary: 数据查询，排查case
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_data_ex(request, headers, runtime)

    async def query_faceauth_data_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthDataRequest,
    ) -> zolozfaceverify_models.QueryFaceauthDataResponse:
        """
        Description: 数据查询，排查case
        Summary: 数据查询，排查case
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_data_ex_async(request, headers, runtime)

    def query_faceauth_data_ex(
        self,
        request: zolozfaceverify_models.QueryFaceauthDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthDataResponse:
        """
        Description: 数据查询，排查case
        Summary: 数据查询，排查case
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthDataResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_data_ex_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthDataResponse:
        """
        Description: 数据查询，排查case
        Summary: 数据查询，排查case
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthDataResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_authentication_customer_faceability(
        self,
        request: zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityRequest,
    ) -> zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityResponse:
        """
        Description: 提供人脸特征提取、人脸区域识别等能力接口
        Summary: 提供人脸特征提取、人脸区域识别等能力接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_authentication_customer_faceability_ex(request, headers, runtime)

    async def exec_authentication_customer_faceability_async(
        self,
        request: zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityRequest,
    ) -> zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityResponse:
        """
        Description: 提供人脸特征提取、人脸区域识别等能力接口
        Summary: 提供人脸特征提取、人脸区域识别等能力接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_authentication_customer_faceability_ex_async(request, headers, runtime)

    def exec_authentication_customer_faceability_ex(
        self,
        request: zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityResponse:
        """
        Description: 提供人脸特征提取、人脸区域识别等能力接口
        Summary: 提供人脸特征提取、人脸区域识别等能力接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.authentication.customer.faceability.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_authentication_customer_faceability_ex_async(
        self,
        request: zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityResponse:
        """
        Description: 提供人脸特征提取、人脸区域识别等能力接口
        Summary: 提供人脸特征提取、人脸区域识别等能力接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.ExecAuthenticationCustomerFaceabilityResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.authentication.customer.faceability.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_faceauth_zim(
        self,
        request: zolozfaceverify_models.InitFaceauthZimRequest,
    ) -> zolozfaceverify_models.InitFaceauthZimResponse:
        """
        Description: 客户端接口初始化认证
        Summary: 客户端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceauth_zim_ex(request, headers, runtime)

    async def init_faceauth_zim_async(
        self,
        request: zolozfaceverify_models.InitFaceauthZimRequest,
    ) -> zolozfaceverify_models.InitFaceauthZimResponse:
        """
        Description: 客户端接口初始化认证
        Summary: 客户端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceauth_zim_ex_async(request, headers, runtime)

    def init_faceauth_zim_ex(
        self,
        request: zolozfaceverify_models.InitFaceauthZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthZimResponse:
        """
        Description: 客户端接口初始化认证
        Summary: 客户端初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthZimResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.zim.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceauth_zim_ex_async(
        self,
        request: zolozfaceverify_models.InitFaceauthZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthZimResponse:
        """
        Description: 客户端接口初始化认证
        Summary: 客户端初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthZimResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.zim.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_faceauth_zim(
        self,
        request: zolozfaceverify_models.VerifyFaceauthZimRequest,
    ) -> zolozfaceverify_models.VerifyFaceauthZimResponse:
        """
        Description: 提供客户端活体检测与人脸比对服务
        Summary: 客户端人脸验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_faceauth_zim_ex(request, headers, runtime)

    async def verify_faceauth_zim_async(
        self,
        request: zolozfaceverify_models.VerifyFaceauthZimRequest,
    ) -> zolozfaceverify_models.VerifyFaceauthZimResponse:
        """
        Description: 提供客户端活体检测与人脸比对服务
        Summary: 客户端人脸验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_faceauth_zim_ex_async(request, headers, runtime)

    def verify_faceauth_zim_ex(
        self,
        request: zolozfaceverify_models.VerifyFaceauthZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.VerifyFaceauthZimResponse:
        """
        Description: 提供客户端活体检测与人脸比对服务
        Summary: 客户端人脸验证
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.VerifyFaceauthZimResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.zim.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_faceauth_zim_ex_async(
        self,
        request: zolozfaceverify_models.VerifyFaceauthZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.VerifyFaceauthZimResponse:
        """
        Description: 提供客户端活体检测与人脸比对服务
        Summary: 客户端人脸验证
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.VerifyFaceauthZimResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.zim.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_faceauth_ocr(
        self,
        request: zolozfaceverify_models.RecognizeFaceauthOcrRequest,
    ) -> zolozfaceverify_models.RecognizeFaceauthOcrResponse:
        """
        Description: OCR识别接口，开放给阿里云场景
        Summary: OCR识别接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_faceauth_ocr_ex(request, headers, runtime)

    async def recognize_faceauth_ocr_async(
        self,
        request: zolozfaceverify_models.RecognizeFaceauthOcrRequest,
    ) -> zolozfaceverify_models.RecognizeFaceauthOcrResponse:
        """
        Description: OCR识别接口，开放给阿里云场景
        Summary: OCR识别接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_faceauth_ocr_ex_async(request, headers, runtime)

    def recognize_faceauth_ocr_ex(
        self,
        request: zolozfaceverify_models.RecognizeFaceauthOcrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.RecognizeFaceauthOcrResponse:
        """
        Description: OCR识别接口，开放给阿里云场景
        Summary: OCR识别接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.RecognizeFaceauthOcrResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.ocr.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_faceauth_ocr_ex_async(
        self,
        request: zolozfaceverify_models.RecognizeFaceauthOcrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.RecognizeFaceauthOcrResponse:
        """
        Description: OCR识别接口，开放给阿里云场景
        Summary: OCR识别接口
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.RecognizeFaceauthOcrResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.ocr.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_faceauth_websdk(
        self,
        request: zolozfaceverify_models.InitFaceauthWebsdkRequest,
    ) -> zolozfaceverify_models.InitFaceauthWebsdkResponse:
        """
        Description: Web实人认证初始化
        Summary: Web实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceauth_websdk_ex(request, headers, runtime)

    async def init_faceauth_websdk_async(
        self,
        request: zolozfaceverify_models.InitFaceauthWebsdkRequest,
    ) -> zolozfaceverify_models.InitFaceauthWebsdkResponse:
        """
        Description: Web实人认证初始化
        Summary: Web实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceauth_websdk_ex_async(request, headers, runtime)

    def init_faceauth_websdk_ex(
        self,
        request: zolozfaceverify_models.InitFaceauthWebsdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthWebsdkResponse:
        """
        Description: Web实人认证初始化
        Summary: Web实人认证初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthWebsdkResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.websdk.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceauth_websdk_ex_async(
        self,
        request: zolozfaceverify_models.InitFaceauthWebsdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthWebsdkResponse:
        """
        Description: Web实人认证初始化
        Summary: Web实人认证初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthWebsdkResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.websdk.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_websdk(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebsdkRequest,
    ) -> zolozfaceverify_models.QueryFaceauthWebsdkResponse:
        """
        Description: Web实人认证查询
        Summary: Web实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_websdk_ex(request, headers, runtime)

    async def query_faceauth_websdk_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebsdkRequest,
    ) -> zolozfaceverify_models.QueryFaceauthWebsdkResponse:
        """
        Description: Web实人认证查询
        Summary: Web实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_websdk_ex_async(request, headers, runtime)

    def query_faceauth_websdk_ex(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebsdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthWebsdkResponse:
        """
        Description: Web实人认证查询
        Summary: Web实人认证查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthWebsdkResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.websdk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_websdk_ex_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthWebsdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthWebsdkResponse:
        """
        Description: Web实人认证查询
        Summary: Web实人认证查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthWebsdkResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.websdk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_file(
        self,
        request: zolozfaceverify_models.QueryFaceauthFileRequest,
    ) -> zolozfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_file_ex(request, headers, runtime)

    async def query_faceauth_file_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthFileRequest,
    ) -> zolozfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_file_ex_async(request, headers, runtime)

    def query_faceauth_file_ex(
        self,
        request: zolozfaceverify_models.QueryFaceauthFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthFileResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.file.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_file_ex_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthFileResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.file.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_faceauth_faceplus(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceplusRequest,
    ) -> zolozfaceverify_models.InitFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceauth_faceplus_ex(request, headers, runtime)

    async def init_faceauth_faceplus_async(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceplusRequest,
    ) -> zolozfaceverify_models.InitFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceauth_faceplus_ex_async(request, headers, runtime)

    def init_faceauth_faceplus_ex(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthFaceplusResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.faceplus.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceauth_faceplus_ex_async(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthFaceplusResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.faceplus.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_faceplus(
        self,
        request: zolozfaceverify_models.QueryFaceauthFaceplusRequest,
    ) -> zolozfaceverify_models.QueryFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_faceplus_ex(request, headers, runtime)

    async def query_faceauth_faceplus_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthFaceplusRequest,
    ) -> zolozfaceverify_models.QueryFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_faceplus_ex_async(request, headers, runtime)

    def query_faceauth_faceplus_ex(
        self,
        request: zolozfaceverify_models.QueryFaceauthFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthFaceplusResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.faceplus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_faceplus_ex_async(
        self,
        request: zolozfaceverify_models.QueryFaceauthFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.QueryFaceauthFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.QueryFaceauthFaceplusResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.faceplus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_faceauth_face_wish(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceWishRequest,
    ) -> zolozfaceverify_models.InitFaceauthFaceWishResponse:
        """
        Description: 意愿核身认证服务端初始化
        Summary: 意愿核身认证服务端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceauth_face_wish_ex(request, headers, runtime)

    async def init_faceauth_face_wish_async(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceWishRequest,
    ) -> zolozfaceverify_models.InitFaceauthFaceWishResponse:
        """
        Description: 意愿核身认证服务端初始化
        Summary: 意愿核身认证服务端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceauth_face_wish_ex_async(request, headers, runtime)

    def init_faceauth_face_wish_ex(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceWishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthFaceWishResponse:
        """
        Description: 意愿核身认证服务端初始化
        Summary: 意愿核身认证服务端初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthFaceWishResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.face.wish.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceauth_face_wish_ex_async(
        self,
        request: zolozfaceverify_models.InitFaceauthFaceWishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.InitFaceauthFaceWishResponse:
        """
        Description: 意愿核身认证服务端初始化
        Summary: 意愿核身认证服务端初始化
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.InitFaceauthFaceWishResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.face.wish.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_faceauth_video(
        self,
        request: zolozfaceverify_models.VerifyFaceauthVideoRequest,
    ) -> zolozfaceverify_models.VerifyFaceauthVideoResponse:
        """
        Description: 人脸视频认证
        Summary: 人脸视频认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_faceauth_video_ex(request, headers, runtime)

    async def verify_faceauth_video_async(
        self,
        request: zolozfaceverify_models.VerifyFaceauthVideoRequest,
    ) -> zolozfaceverify_models.VerifyFaceauthVideoResponse:
        """
        Description: 人脸视频认证
        Summary: 人脸视频认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_faceauth_video_ex_async(request, headers, runtime)

    def verify_faceauth_video_ex(
        self,
        request: zolozfaceverify_models.VerifyFaceauthVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.VerifyFaceauthVideoResponse:
        """
        Description: 人脸视频认证
        Summary: 人脸视频认证
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.VerifyFaceauthVideoResponse().from_map(
            self.do_request('1.0', 'faceverifyzoloz.faceauth.video.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_faceauth_video_ex_async(
        self,
        request: zolozfaceverify_models.VerifyFaceauthVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> zolozfaceverify_models.VerifyFaceauthVideoResponse:
        """
        Description: 人脸视频认证
        Summary: 人脸视频认证
        """
        UtilClient.validate_model(request)
        return zolozfaceverify_models.VerifyFaceauthVideoResponse().from_map(
            await self.do_request_async('1.0', 'faceverifyzoloz.faceauth.video.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
