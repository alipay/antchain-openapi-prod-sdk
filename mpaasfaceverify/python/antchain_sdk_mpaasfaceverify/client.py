# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_mpaasfaceverify import models as mpaasfaceverify_models
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
        config: mpaasfaceverify_models.Config,
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
                    'sdk_version': '1.1.9'
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
                    'sdk_version': '1.1.9'
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

    def init_faceauth(
        self,
        request: mpaasfaceverify_models.InitFaceauthRequest,
    ) -> mpaasfaceverify_models.InitFaceauthResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceauth_ex(request, headers, runtime)

    async def init_faceauth_async(
        self,
        request: mpaasfaceverify_models.InitFaceauthRequest,
    ) -> mpaasfaceverify_models.InitFaceauthResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceauth_ex_async(request, headers, runtime)

    def init_faceauth_ex(
        self,
        request: mpaasfaceverify_models.InitFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitFaceauthResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitFaceauthResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceauth_ex_async(
        self,
        request: mpaasfaceverify_models.InitFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitFaceauthResponse:
        """
        Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth(
        self,
        request: mpaasfaceverify_models.QueryFaceauthRequest,
    ) -> mpaasfaceverify_models.QueryFaceauthResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_ex(request, headers, runtime)

    async def query_faceauth_async(
        self,
        request: mpaasfaceverify_models.QueryFaceauthRequest,
    ) -> mpaasfaceverify_models.QueryFaceauthResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_ex_async(request, headers, runtime)

    def query_faceauth_ex(
        self,
        request: mpaasfaceverify_models.QueryFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.QueryFaceauthResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.QueryFaceauthResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_ex_async(
        self,
        request: mpaasfaceverify_models.QueryFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.QueryFaceauthResponse:
        """
        Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
        Summary: 实人认证查询
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.QueryFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_faceplus(
        self,
        request: mpaasfaceverify_models.InitFaceplusRequest,
    ) -> mpaasfaceverify_models.InitFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_faceplus_ex(request, headers, runtime)

    async def init_faceplus_async(
        self,
        request: mpaasfaceverify_models.InitFaceplusRequest,
    ) -> mpaasfaceverify_models.InitFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_faceplus_ex_async(request, headers, runtime)

    def init_faceplus_ex(
        self,
        request: mpaasfaceverify_models.InitFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitFaceplusResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.faceplus.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_faceplus_ex_async(
        self,
        request: mpaasfaceverify_models.InitFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitFaceplusResponse:
        """
        Description: 人脸双因子认证服务端初始化
        Summary: 人脸双因子认证服务端初始化
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitFaceplusResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.faceplus.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceplus(
        self,
        request: mpaasfaceverify_models.QueryFaceplusRequest,
    ) -> mpaasfaceverify_models.QueryFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceplus_ex(request, headers, runtime)

    async def query_faceplus_async(
        self,
        request: mpaasfaceverify_models.QueryFaceplusRequest,
    ) -> mpaasfaceverify_models.QueryFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceplus_ex_async(request, headers, runtime)

    def query_faceplus_ex(
        self,
        request: mpaasfaceverify_models.QueryFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.QueryFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.QueryFaceplusResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.faceplus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceplus_ex_async(
        self,
        request: mpaasfaceverify_models.QueryFaceplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.QueryFaceplusResponse:
        """
        Description: 人脸双因子认证服务端查询
        Summary: 人脸双因子认证服务端查询
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.QueryFaceplusResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.faceplus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceauth_file(
        self,
        request: mpaasfaceverify_models.QueryFaceauthFileRequest,
    ) -> mpaasfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceauth_file_ex(request, headers, runtime)

    async def query_faceauth_file_async(
        self,
        request: mpaasfaceverify_models.QueryFaceauthFileRequest,
    ) -> mpaasfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceauth_file_ex_async(request, headers, runtime)

    def query_faceauth_file_ex(
        self,
        request: mpaasfaceverify_models.QueryFaceauthFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.QueryFaceauthFileResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.faceauth.file.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceauth_file_ex_async(
        self,
        request: mpaasfaceverify_models.QueryFaceauthFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.QueryFaceauthFileResponse:
        """
        Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
        Summary: 获取认证资料
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.QueryFaceauthFileResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.faceauth.file.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_servermode(
        self,
        request: mpaasfaceverify_models.CertifyServermodeRequest,
    ) -> mpaasfaceverify_models.CertifyServermodeResponse:
        """
        Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
        Summary: 实人认证核验源服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_servermode_ex(request, headers, runtime)

    async def certify_servermode_async(
        self,
        request: mpaasfaceverify_models.CertifyServermodeRequest,
    ) -> mpaasfaceverify_models.CertifyServermodeResponse:
        """
        Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
        Summary: 实人认证核验源服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_servermode_ex_async(request, headers, runtime)

    def certify_servermode_ex(
        self,
        request: mpaasfaceverify_models.CertifyServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.CertifyServermodeResponse:
        """
        Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
        Summary: 实人认证核验源服务
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.CertifyServermodeResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.servermode.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_servermode_ex_async(
        self,
        request: mpaasfaceverify_models.CertifyServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.CertifyServermodeResponse:
        """
        Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
        Summary: 实人认证核验源服务
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.CertifyServermodeResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.servermode.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_certifyrecord_realperson(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRealpersonRequest,
    ) -> mpaasfaceverify_models.InitCertifyrecordRealpersonResponse:
        """
        Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 实人认证单据初始化服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_certifyrecord_realperson_ex(request, headers, runtime)

    async def init_certifyrecord_realperson_async(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRealpersonRequest,
    ) -> mpaasfaceverify_models.InitCertifyrecordRealpersonResponse:
        """
        Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 实人认证单据初始化服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_certifyrecord_realperson_ex_async(request, headers, runtime)

    def init_certifyrecord_realperson_ex(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitCertifyrecordRealpersonResponse:
        """
        Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 实人认证单据初始化服务
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitCertifyrecordRealpersonResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.certifyrecord.realperson.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_certifyrecord_realperson_ex_async(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitCertifyrecordRealpersonResponse:
        """
        Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 实人认证单据初始化服务
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitCertifyrecordRealpersonResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.certifyrecord.realperson.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_certifyrecord(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRequest,
    ) -> mpaasfaceverify_models.InitCertifyrecordResponse:
        """
        Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 认证单据初始化服务(无身份)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_certifyrecord_ex(request, headers, runtime)

    async def init_certifyrecord_async(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRequest,
    ) -> mpaasfaceverify_models.InitCertifyrecordResponse:
        """
        Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 认证单据初始化服务(无身份)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_certifyrecord_ex_async(request, headers, runtime)

    def init_certifyrecord_ex(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitCertifyrecordResponse:
        """
        Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 认证单据初始化服务(无身份)
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitCertifyrecordResponse().from_map(
            self.do_request('1.0', 'antfin.mpaasfaceverify.certifyrecord.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_certifyrecord_ex_async(
        self,
        request: mpaasfaceverify_models.InitCertifyrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mpaasfaceverify_models.InitCertifyrecordResponse:
        """
        Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
        Summary: 认证单据初始化服务(无身份)
        """
        UtilClient.validate_model(request)
        return mpaasfaceverify_models.InitCertifyrecordResponse().from_map(
            await self.do_request_async('1.0', 'antfin.mpaasfaceverify.certifyrecord.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
