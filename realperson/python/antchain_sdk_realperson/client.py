# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_realperson import models as realperson_models
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
        config: realperson_models.Config,
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
            # 音频元数据
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
                    'sdk_version': '1.3.6'
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
            # 音频元数据
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
                    'sdk_version': '1.3.6'
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

    def query_facevrf_server(
        self,
        request: realperson_models.QueryFacevrfServerRequest,
    ) -> realperson_models.QueryFacevrfServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_facevrf_server_ex(request, headers, runtime)

    async def query_facevrf_server_async(
        self,
        request: realperson_models.QueryFacevrfServerRequest,
    ) -> realperson_models.QueryFacevrfServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_facevrf_server_ex_async(request, headers, runtime)

    def query_facevrf_server_ex(
        self,
        request: realperson_models.QueryFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryFacevrfServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        UtilClient.validate_model(request)
        return realperson_models.QueryFacevrfServerResponse().from_map(
            self.do_request('1.0', 'di.realperson.facevrf.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_facevrf_server_ex_async(
        self,
        request: realperson_models.QueryFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryFacevrfServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        UtilClient.validate_model(request)
        return realperson_models.QueryFacevrfServerResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.facevrf.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_facevrf_server(
        self,
        request: realperson_models.CreateFacevrfServerRequest,
    ) -> realperson_models.CreateFacevrfServerResponse:
        """
        Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
        Summary: 认证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_facevrf_server_ex(request, headers, runtime)

    async def create_facevrf_server_async(
        self,
        request: realperson_models.CreateFacevrfServerRequest,
    ) -> realperson_models.CreateFacevrfServerResponse:
        """
        Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
        Summary: 认证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_facevrf_server_ex_async(request, headers, runtime)

    def create_facevrf_server_ex(
        self,
        request: realperson_models.CreateFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateFacevrfServerResponse:
        """
        Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
        Summary: 认证创建
        """
        UtilClient.validate_model(request)
        return realperson_models.CreateFacevrfServerResponse().from_map(
            self.do_request('1.0', 'di.realperson.facevrf.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_facevrf_server_ex_async(
        self,
        request: realperson_models.CreateFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateFacevrfServerResponse:
        """
        Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
        Summary: 认证创建
        """
        UtilClient.validate_model(request)
        return realperson_models.CreateFacevrfServerResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.facevrf.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_facevrf_server(
        self,
        request: realperson_models.ExecFacevrfServerRequest,
    ) -> realperson_models.ExecFacevrfServerResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_facevrf_server_ex(request, headers, runtime)

    async def exec_facevrf_server_async(
        self,
        request: realperson_models.ExecFacevrfServerRequest,
    ) -> realperson_models.ExecFacevrfServerResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_facevrf_server_ex_async(request, headers, runtime)

    def exec_facevrf_server_ex(
        self,
        request: realperson_models.ExecFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFacevrfServerResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对
        """
        UtilClient.validate_model(request)
        return realperson_models.ExecFacevrfServerResponse().from_map(
            self.do_request('1.0', 'di.realperson.facevrf.server.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_facevrf_server_ex_async(
        self,
        request: realperson_models.ExecFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFacevrfServerResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对
        """
        UtilClient.validate_model(request)
        return realperson_models.ExecFacevrfServerResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.facevrf.server.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_facevrf_evidence(
        self,
        request: realperson_models.GetFacevrfEvidenceRequest,
    ) -> realperson_models.GetFacevrfEvidenceResponse:
        """
        Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
        Summary: 商户获取司法链上刷脸存证和统一证据ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_facevrf_evidence_ex(request, headers, runtime)

    async def get_facevrf_evidence_async(
        self,
        request: realperson_models.GetFacevrfEvidenceRequest,
    ) -> realperson_models.GetFacevrfEvidenceResponse:
        """
        Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
        Summary: 商户获取司法链上刷脸存证和统一证据ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_facevrf_evidence_ex_async(request, headers, runtime)

    def get_facevrf_evidence_ex(
        self,
        request: realperson_models.GetFacevrfEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.GetFacevrfEvidenceResponse:
        """
        Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
        Summary: 商户获取司法链上刷脸存证和统一证据ID
        """
        UtilClient.validate_model(request)
        return realperson_models.GetFacevrfEvidenceResponse().from_map(
            self.do_request('1.0', 'di.realperson.facevrf.evidence.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_facevrf_evidence_ex_async(
        self,
        request: realperson_models.GetFacevrfEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.GetFacevrfEvidenceResponse:
        """
        Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
        Summary: 商户获取司法链上刷脸存证和统一证据ID
        """
        UtilClient.validate_model(request)
        return realperson_models.GetFacevrfEvidenceResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.facevrf.evidence.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_individualid_twometa(
        self,
        request: realperson_models.CheckIndividualidTwometaRequest,
    ) -> realperson_models.CheckIndividualidTwometaResponse:
        """
        Description: 个人二要素认证
        Summary: 个人二要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_individualid_twometa_ex(request, headers, runtime)

    async def check_individualid_twometa_async(
        self,
        request: realperson_models.CheckIndividualidTwometaRequest,
    ) -> realperson_models.CheckIndividualidTwometaResponse:
        """
        Description: 个人二要素认证
        Summary: 个人二要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_individualid_twometa_ex_async(request, headers, runtime)

    def check_individualid_twometa_ex(
        self,
        request: realperson_models.CheckIndividualidTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIndividualidTwometaResponse:
        """
        Description: 个人二要素认证
        Summary: 个人二要素认证
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckIndividualidTwometaResponse().from_map(
            self.do_request('1.0', 'di.realperson.individualid.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_individualid_twometa_ex_async(
        self,
        request: realperson_models.CheckIndividualidTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIndividualidTwometaResponse:
        """
        Description: 个人二要素认证
        Summary: 个人二要素认证
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckIndividualidTwometaResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.individualid.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_individualid_threemeta(
        self,
        request: realperson_models.CheckIndividualidThreemetaRequest,
    ) -> realperson_models.CheckIndividualidThreemetaResponse:
        """
        Description: 个人三要素认证
        Summary: 个人三要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_individualid_threemeta_ex(request, headers, runtime)

    async def check_individualid_threemeta_async(
        self,
        request: realperson_models.CheckIndividualidThreemetaRequest,
    ) -> realperson_models.CheckIndividualidThreemetaResponse:
        """
        Description: 个人三要素认证
        Summary: 个人三要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_individualid_threemeta_ex_async(request, headers, runtime)

    def check_individualid_threemeta_ex(
        self,
        request: realperson_models.CheckIndividualidThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIndividualidThreemetaResponse:
        """
        Description: 个人三要素认证
        Summary: 个人三要素认证
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckIndividualidThreemetaResponse().from_map(
            self.do_request('1.0', 'di.realperson.individualid.threemeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_individualid_threemeta_ex_async(
        self,
        request: realperson_models.CheckIndividualidThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIndividualidThreemetaResponse:
        """
        Description: 个人三要素认证
        Summary: 个人三要素认证
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckIndividualidThreemetaResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.individualid.threemeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_individualid_fourmeta(
        self,
        request: realperson_models.CheckIndividualidFourmetaRequest,
    ) -> realperson_models.CheckIndividualidFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_individualid_fourmeta_ex(request, headers, runtime)

    async def check_individualid_fourmeta_async(
        self,
        request: realperson_models.CheckIndividualidFourmetaRequest,
    ) -> realperson_models.CheckIndividualidFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_individualid_fourmeta_ex_async(request, headers, runtime)

    def check_individualid_fourmeta_ex(
        self,
        request: realperson_models.CheckIndividualidFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIndividualidFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckIndividualidFourmetaResponse().from_map(
            self.do_request('1.0', 'di.realperson.individualid.fourmeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_individualid_fourmeta_ex_async(
        self,
        request: realperson_models.CheckIndividualidFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIndividualidFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckIndividualidFourmetaResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.individualid.fourmeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_route_threemeta(
        self,
        request: realperson_models.CheckRouteThreemetaRequest,
    ) -> realperson_models.CheckRouteThreemetaResponse:
        """
        Description: 个人三要素认证（场景路由）
        Summary: 个人三要素认证（场景路由）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_route_threemeta_ex(request, headers, runtime)

    async def check_route_threemeta_async(
        self,
        request: realperson_models.CheckRouteThreemetaRequest,
    ) -> realperson_models.CheckRouteThreemetaResponse:
        """
        Description: 个人三要素认证（场景路由）
        Summary: 个人三要素认证（场景路由）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_route_threemeta_ex_async(request, headers, runtime)

    def check_route_threemeta_ex(
        self,
        request: realperson_models.CheckRouteThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckRouteThreemetaResponse:
        """
        Description: 个人三要素认证（场景路由）
        Summary: 个人三要素认证（场景路由）
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckRouteThreemetaResponse().from_map(
            self.do_request('1.0', 'di.realperson.route.threemeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_route_threemeta_ex_async(
        self,
        request: realperson_models.CheckRouteThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckRouteThreemetaResponse:
        """
        Description: 个人三要素认证（场景路由）
        Summary: 个人三要素认证（场景路由）
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckRouteThreemetaResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.route.threemeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_voiceprint_servermode(
        self,
        request: realperson_models.CreateVoiceprintServermodeRequest,
    ) -> realperson_models.CreateVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹注册
        Summary: 纯服务端声纹注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_voiceprint_servermode_ex(request, headers, runtime)

    async def create_voiceprint_servermode_async(
        self,
        request: realperson_models.CreateVoiceprintServermodeRequest,
    ) -> realperson_models.CreateVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹注册
        Summary: 纯服务端声纹注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_voiceprint_servermode_ex_async(request, headers, runtime)

    def create_voiceprint_servermode_ex(
        self,
        request: realperson_models.CreateVoiceprintServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹注册
        Summary: 纯服务端声纹注册
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.voiceprint.servermode.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_voiceprint_servermode_response = realperson_models.CreateVoiceprintServermodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_voiceprint_servermode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return realperson_models.CreateVoiceprintServermodeResponse().from_map(
            self.do_request('1.0', 'di.realperson.voiceprint.servermode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_voiceprint_servermode_ex_async(
        self,
        request: realperson_models.CreateVoiceprintServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹注册
        Summary: 纯服务端声纹注册
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.voiceprint.servermode.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_voiceprint_servermode_response = realperson_models.CreateVoiceprintServermodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_voiceprint_servermode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return realperson_models.CreateVoiceprintServermodeResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.voiceprint.servermode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_voiceprint_servermode(
        self,
        request: realperson_models.VerifyVoiceprintServermodeRequest,
    ) -> realperson_models.VerifyVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹比对
        Summary: 纯服务端声纹比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_voiceprint_servermode_ex(request, headers, runtime)

    async def verify_voiceprint_servermode_async(
        self,
        request: realperson_models.VerifyVoiceprintServermodeRequest,
    ) -> realperson_models.VerifyVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹比对
        Summary: 纯服务端声纹比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_voiceprint_servermode_ex_async(request, headers, runtime)

    def verify_voiceprint_servermode_ex(
        self,
        request: realperson_models.VerifyVoiceprintServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.VerifyVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹比对
        Summary: 纯服务端声纹比对
        """
        UtilClient.validate_model(request)
        return realperson_models.VerifyVoiceprintServermodeResponse().from_map(
            self.do_request('1.0', 'di.realperson.voiceprint.servermode.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_voiceprint_servermode_ex_async(
        self,
        request: realperson_models.VerifyVoiceprintServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.VerifyVoiceprintServermodeResponse:
        """
        Description: 纯服务端声纹比对
        Summary: 纯服务端声纹比对
        """
        UtilClient.validate_model(request)
        return realperson_models.VerifyVoiceprintServermodeResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.voiceprint.servermode.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_route_twometa(
        self,
        request: realperson_models.CheckRouteTwometaRequest,
    ) -> realperson_models.CheckRouteTwometaResponse:
        """
        Description: 个人二要素认证（场景路由）
        Summary: 个人二要素认证（场景路由）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_route_twometa_ex(request, headers, runtime)

    async def check_route_twometa_async(
        self,
        request: realperson_models.CheckRouteTwometaRequest,
    ) -> realperson_models.CheckRouteTwometaResponse:
        """
        Description: 个人二要素认证（场景路由）
        Summary: 个人二要素认证（场景路由）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_route_twometa_ex_async(request, headers, runtime)

    def check_route_twometa_ex(
        self,
        request: realperson_models.CheckRouteTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckRouteTwometaResponse:
        """
        Description: 个人二要素认证（场景路由）
        Summary: 个人二要素认证（场景路由）
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckRouteTwometaResponse().from_map(
            self.do_request('1.0', 'di.realperson.route.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_route_twometa_ex_async(
        self,
        request: realperson_models.CheckRouteTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckRouteTwometaResponse:
        """
        Description: 个人二要素认证（场景路由）
        Summary: 个人二要素认证（场景路由）
        """
        UtilClient.validate_model(request)
        return realperson_models.CheckRouteTwometaResponse().from_map(
            await self.do_request_async('1.0', 'di.realperson.route.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: realperson_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> realperson_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: realperson_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> realperson_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: realperson_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return realperson_models.CreateAntcloudGatewayxFileUploadResponse().from_map(
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: realperson_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return realperson_models.CreateAntcloudGatewayxFileUploadResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
