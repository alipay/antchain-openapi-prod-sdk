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
                    'sdk_version': '1.15.18',
                    '_prod_code': 'REALPERSON',
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
                    'sdk_version': '1.15.18',
                    '_prod_code': 'REALPERSON',
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
        return TeaCore.from_map(
            realperson_models.QueryFacevrfServerResponse(),
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
        return TeaCore.from_map(
            realperson_models.QueryFacevrfServerResponse(),
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
        return TeaCore.from_map(
            realperson_models.CreateFacevrfServerResponse(),
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
        return TeaCore.from_map(
            realperson_models.CreateFacevrfServerResponse(),
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
        return TeaCore.from_map(
            realperson_models.ExecFacevrfServerResponse(),
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
        return TeaCore.from_map(
            realperson_models.ExecFacevrfServerResponse(),
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
        return TeaCore.from_map(
            realperson_models.GetFacevrfEvidenceResponse(),
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
        return TeaCore.from_map(
            realperson_models.GetFacevrfEvidenceResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckIndividualidTwometaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckIndividualidTwometaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckIndividualidThreemetaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckIndividualidThreemetaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckIndividualidFourmetaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckIndividualidFourmetaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckRouteThreemetaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckRouteThreemetaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CreateVoiceprintServermodeResponse(),
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
        return TeaCore.from_map(
            realperson_models.CreateVoiceprintServermodeResponse(),
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
        return TeaCore.from_map(
            realperson_models.VerifyVoiceprintServermodeResponse(),
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
        return TeaCore.from_map(
            realperson_models.VerifyVoiceprintServermodeResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckRouteTwometaResponse(),
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
        return TeaCore.from_map(
            realperson_models.CheckRouteTwometaResponse(),
            await self.do_request_async('1.0', 'di.realperson.route.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mobile_risk(
        self,
        request: realperson_models.QueryMobileRiskRequest,
    ) -> realperson_models.QueryMobileRiskResponse:
        """
        Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
        Summary: 移动风险设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mobile_risk_ex(request, headers, runtime)

    async def query_mobile_risk_async(
        self,
        request: realperson_models.QueryMobileRiskRequest,
    ) -> realperson_models.QueryMobileRiskResponse:
        """
        Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
        Summary: 移动风险设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mobile_risk_ex_async(request, headers, runtime)

    def query_mobile_risk_ex(
        self,
        request: realperson_models.QueryMobileRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryMobileRiskResponse:
        """
        Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
        Summary: 移动风险设备查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryMobileRiskResponse(),
            self.do_request('1.0', 'di.realperson.mobile.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mobile_risk_ex_async(
        self,
        request: realperson_models.QueryMobileRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryMobileRiskResponse:
        """
        Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
        Summary: 移动风险设备查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryMobileRiskResponse(),
            await self.do_request_async('1.0', 'di.realperson.mobile.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_facevrf_server(
        self,
        request: realperson_models.DetailFacevrfServerRequest,
    ) -> realperson_models.DetailFacevrfServerResponse:
        """
        Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
        Summary: 查询认证人、认证时间等相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_facevrf_server_ex(request, headers, runtime)

    async def detail_facevrf_server_async(
        self,
        request: realperson_models.DetailFacevrfServerRequest,
    ) -> realperson_models.DetailFacevrfServerResponse:
        """
        Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
        Summary: 查询认证人、认证时间等相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_facevrf_server_ex_async(request, headers, runtime)

    def detail_facevrf_server_ex(
        self,
        request: realperson_models.DetailFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.DetailFacevrfServerResponse:
        """
        Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
        Summary: 查询认证人、认证时间等相关信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.DetailFacevrfServerResponse(),
            self.do_request('1.0', 'di.realperson.facevrf.server.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_facevrf_server_ex_async(
        self,
        request: realperson_models.DetailFacevrfServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.DetailFacevrfServerResponse:
        """
        Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
        Summary: 查询认证人、认证时间等相关信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.DetailFacevrfServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.facevrf.server.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_anticheat_personal(
        self,
        request: realperson_models.CheckAnticheatPersonalRequest,
    ) -> realperson_models.CheckAnticheatPersonalResponse:
        """
        Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
        Summary: 个人反欺诈风险校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_anticheat_personal_ex(request, headers, runtime)

    async def check_anticheat_personal_async(
        self,
        request: realperson_models.CheckAnticheatPersonalRequest,
    ) -> realperson_models.CheckAnticheatPersonalResponse:
        """
        Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
        Summary: 个人反欺诈风险校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_anticheat_personal_ex_async(request, headers, runtime)

    def check_anticheat_personal_ex(
        self,
        request: realperson_models.CheckAnticheatPersonalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckAnticheatPersonalResponse:
        """
        Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
        Summary: 个人反欺诈风险校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckAnticheatPersonalResponse(),
            self.do_request('1.0', 'di.realperson.anticheat.personal.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_anticheat_personal_ex_async(
        self,
        request: realperson_models.CheckAnticheatPersonalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckAnticheatPersonalResponse:
        """
        Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
        Summary: 个人反欺诈风险校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckAnticheatPersonalResponse(),
            await self.do_request_async('1.0', 'di.realperson.anticheat.personal.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_twometa_hash(
        self,
        request: realperson_models.CheckTwometaHashRequest,
    ) -> realperson_models.CheckTwometaHashResponse:
        """
        Description: 二要素支持hash主体信息
        Summary: 个人二要素核验支持hash的主体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_twometa_hash_ex(request, headers, runtime)

    async def check_twometa_hash_async(
        self,
        request: realperson_models.CheckTwometaHashRequest,
    ) -> realperson_models.CheckTwometaHashResponse:
        """
        Description: 二要素支持hash主体信息
        Summary: 个人二要素核验支持hash的主体信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_twometa_hash_ex_async(request, headers, runtime)

    def check_twometa_hash_ex(
        self,
        request: realperson_models.CheckTwometaHashRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckTwometaHashResponse:
        """
        Description: 二要素支持hash主体信息
        Summary: 个人二要素核验支持hash的主体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckTwometaHashResponse(),
            self.do_request('1.0', 'di.realperson.twometa.hash.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_twometa_hash_ex_async(
        self,
        request: realperson_models.CheckTwometaHashRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckTwometaHashResponse:
        """
        Description: 二要素支持hash主体信息
        Summary: 个人二要素核验支持hash的主体信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckTwometaHashResponse(),
            await self.do_request_async('1.0', 'di.realperson.twometa.hash.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_threemeta_onlinetime(
        self,
        request: realperson_models.QueryThreemetaOnlinetimeRequest,
    ) -> realperson_models.QueryThreemetaOnlinetimeResponse:
        """
        Description: 对接运营商等数据源查询手机号码的在网时长
        Summary: 三要素在网时长查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_threemeta_onlinetime_ex(request, headers, runtime)

    async def query_threemeta_onlinetime_async(
        self,
        request: realperson_models.QueryThreemetaOnlinetimeRequest,
    ) -> realperson_models.QueryThreemetaOnlinetimeResponse:
        """
        Description: 对接运营商等数据源查询手机号码的在网时长
        Summary: 三要素在网时长查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_threemeta_onlinetime_ex_async(request, headers, runtime)

    def query_threemeta_onlinetime_ex(
        self,
        request: realperson_models.QueryThreemetaOnlinetimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryThreemetaOnlinetimeResponse:
        """
        Description: 对接运营商等数据源查询手机号码的在网时长
        Summary: 三要素在网时长查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryThreemetaOnlinetimeResponse(),
            self.do_request('1.0', 'di.realperson.threemeta.onlinetime.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_threemeta_onlinetime_ex_async(
        self,
        request: realperson_models.QueryThreemetaOnlinetimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryThreemetaOnlinetimeResponse:
        """
        Description: 对接运营商等数据源查询手机号码的在网时长
        Summary: 三要素在网时长查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryThreemetaOnlinetimeResponse(),
            await self.do_request_async('1.0', 'di.realperson.threemeta.onlinetime.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_facevrf_zim(
        self,
        request: realperson_models.InitFacevrfZimRequest,
    ) -> realperson_models.InitFacevrfZimResponse:
        """
        Description: 客户端初始化认证(OEM专用)
        Summary: 客户端初始化认证(OEM专用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_facevrf_zim_ex(request, headers, runtime)

    async def init_facevrf_zim_async(
        self,
        request: realperson_models.InitFacevrfZimRequest,
    ) -> realperson_models.InitFacevrfZimResponse:
        """
        Description: 客户端初始化认证(OEM专用)
        Summary: 客户端初始化认证(OEM专用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_facevrf_zim_ex_async(request, headers, runtime)

    def init_facevrf_zim_ex(
        self,
        request: realperson_models.InitFacevrfZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.InitFacevrfZimResponse:
        """
        Description: 客户端初始化认证(OEM专用)
        Summary: 客户端初始化认证(OEM专用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.InitFacevrfZimResponse(),
            self.do_request('1.0', 'di.realperson.facevrf.zim.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_facevrf_zim_ex_async(
        self,
        request: realperson_models.InitFacevrfZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.InitFacevrfZimResponse:
        """
        Description: 客户端初始化认证(OEM专用)
        Summary: 客户端初始化认证(OEM专用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.InitFacevrfZimResponse(),
            await self.do_request_async('1.0', 'di.realperson.facevrf.zim.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_facevrf_zim(
        self,
        request: realperson_models.VerifyFacevrfZimRequest,
    ) -> realperson_models.VerifyFacevrfZimResponse:
        """
        Description: 客户端人脸验证(OEM专用)
        Summary: 客户端人脸验证(OEM专用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_facevrf_zim_ex(request, headers, runtime)

    async def verify_facevrf_zim_async(
        self,
        request: realperson_models.VerifyFacevrfZimRequest,
    ) -> realperson_models.VerifyFacevrfZimResponse:
        """
        Description: 客户端人脸验证(OEM专用)
        Summary: 客户端人脸验证(OEM专用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_facevrf_zim_ex_async(request, headers, runtime)

    def verify_facevrf_zim_ex(
        self,
        request: realperson_models.VerifyFacevrfZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.VerifyFacevrfZimResponse:
        """
        Description: 客户端人脸验证(OEM专用)
        Summary: 客户端人脸验证(OEM专用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.VerifyFacevrfZimResponse(),
            self.do_request('1.0', 'di.realperson.facevrf.zim.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_facevrf_zim_ex_async(
        self,
        request: realperson_models.VerifyFacevrfZimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.VerifyFacevrfZimResponse:
        """
        Description: 客户端人脸验证(OEM专用)
        Summary: 客户端人脸验证(OEM专用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.VerifyFacevrfZimResponse(),
            await self.do_request_async('1.0', 'di.realperson.facevrf.zim.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_doc_individualcard(
        self,
        request: realperson_models.RecognizeDocIndividualcardRequest,
    ) -> realperson_models.RecognizeDocIndividualcardResponse:
        """
        Description: 卡证OCR
        Summary: 卡证OCR
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_doc_individualcard_ex(request, headers, runtime)

    async def recognize_doc_individualcard_async(
        self,
        request: realperson_models.RecognizeDocIndividualcardRequest,
    ) -> realperson_models.RecognizeDocIndividualcardResponse:
        """
        Description: 卡证OCR
        Summary: 卡证OCR
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_doc_individualcard_ex_async(request, headers, runtime)

    def recognize_doc_individualcard_ex(
        self,
        request: realperson_models.RecognizeDocIndividualcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.RecognizeDocIndividualcardResponse:
        """
        Description: 卡证OCR
        Summary: 卡证OCR
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.RecognizeDocIndividualcardResponse(),
            self.do_request('1.0', 'di.realperson.doc.individualcard.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_doc_individualcard_ex_async(
        self,
        request: realperson_models.RecognizeDocIndividualcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.RecognizeDocIndividualcardResponse:
        """
        Description: 卡证OCR
        Summary: 卡证OCR
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.RecognizeDocIndividualcardResponse(),
            await self.do_request_async('1.0', 'di.realperson.doc.individualcard.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_threemeta_bankcard(
        self,
        request: realperson_models.CheckThreemetaBankcardRequest,
    ) -> realperson_models.CheckThreemetaBankcardResponse:
        """
        Description: 个人银行卡三要素
        Summary: 个人银行卡三要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_threemeta_bankcard_ex(request, headers, runtime)

    async def check_threemeta_bankcard_async(
        self,
        request: realperson_models.CheckThreemetaBankcardRequest,
    ) -> realperson_models.CheckThreemetaBankcardResponse:
        """
        Description: 个人银行卡三要素
        Summary: 个人银行卡三要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_threemeta_bankcard_ex_async(request, headers, runtime)

    def check_threemeta_bankcard_ex(
        self,
        request: realperson_models.CheckThreemetaBankcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckThreemetaBankcardResponse:
        """
        Description: 个人银行卡三要素
        Summary: 个人银行卡三要素
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckThreemetaBankcardResponse(),
            self.do_request('1.0', 'di.realperson.threemeta.bankcard.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_threemeta_bankcard_ex_async(
        self,
        request: realperson_models.CheckThreemetaBankcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckThreemetaBankcardResponse:
        """
        Description: 个人银行卡三要素
        Summary: 个人银行卡三要素
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckThreemetaBankcardResponse(),
            await self.do_request_async('1.0', 'di.realperson.threemeta.bankcard.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deepsec_risk(
        self,
        request: realperson_models.QueryDeepsecRiskRequest,
    ) -> realperson_models.QueryDeepsecRiskResponse:
        """
        Description: deepsec终端安全风险标签查询
        Summary: deepsec终端安全风险标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deepsec_risk_ex(request, headers, runtime)

    async def query_deepsec_risk_async(
        self,
        request: realperson_models.QueryDeepsecRiskRequest,
    ) -> realperson_models.QueryDeepsecRiskResponse:
        """
        Description: deepsec终端安全风险标签查询
        Summary: deepsec终端安全风险标签查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deepsec_risk_ex_async(request, headers, runtime)

    def query_deepsec_risk_ex(
        self,
        request: realperson_models.QueryDeepsecRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryDeepsecRiskResponse:
        """
        Description: deepsec终端安全风险标签查询
        Summary: deepsec终端安全风险标签查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryDeepsecRiskResponse(),
            self.do_request('1.0', 'di.realperson.deepsec.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deepsec_risk_ex_async(
        self,
        request: realperson_models.QueryDeepsecRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryDeepsecRiskResponse:
        """
        Description: deepsec终端安全风险标签查询
        Summary: deepsec终端安全风险标签查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryDeepsecRiskResponse(),
            await self.do_request_async('1.0', 'di.realperson.deepsec.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deepsec_tsbmrq(
        self,
        request: realperson_models.QueryDeepsecTsbmrqRequest,
    ) -> realperson_models.QueryDeepsecTsbmrqResponse:
        """
        Description: deepsec终端安全api，用于apdid查询
        Summary: tsbmrq设备id查询入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deepsec_tsbmrq_ex(request, headers, runtime)

    async def query_deepsec_tsbmrq_async(
        self,
        request: realperson_models.QueryDeepsecTsbmrqRequest,
    ) -> realperson_models.QueryDeepsecTsbmrqResponse:
        """
        Description: deepsec终端安全api，用于apdid查询
        Summary: tsbmrq设备id查询入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deepsec_tsbmrq_ex_async(request, headers, runtime)

    def query_deepsec_tsbmrq_ex(
        self,
        request: realperson_models.QueryDeepsecTsbmrqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryDeepsecTsbmrqResponse:
        """
        Description: deepsec终端安全api，用于apdid查询
        Summary: tsbmrq设备id查询入口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryDeepsecTsbmrqResponse(),
            self.do_request('1.0', 'di.realperson.deepsec.tsbmrq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deepsec_tsbmrq_ex_async(
        self,
        request: realperson_models.QueryDeepsecTsbmrqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryDeepsecTsbmrqResponse:
        """
        Description: deepsec终端安全api，用于apdid查询
        Summary: tsbmrq设备id查询入口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryDeepsecTsbmrqResponse(),
            await self.do_request_async('1.0', 'di.realperson.deepsec.tsbmrq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_threemeta_phonereuse(
        self,
        request: realperson_models.QueryThreemetaPhonereuseRequest,
    ) -> realperson_models.QueryThreemetaPhonereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_threemeta_phonereuse_ex(request, headers, runtime)

    async def query_threemeta_phonereuse_async(
        self,
        request: realperson_models.QueryThreemetaPhonereuseRequest,
    ) -> realperson_models.QueryThreemetaPhonereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_threemeta_phonereuse_ex_async(request, headers, runtime)

    def query_threemeta_phonereuse_ex(
        self,
        request: realperson_models.QueryThreemetaPhonereuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryThreemetaPhonereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryThreemetaPhonereuseResponse(),
            self.do_request('1.0', 'di.realperson.threemeta.phonereuse.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_threemeta_phonereuse_ex_async(
        self,
        request: realperson_models.QueryThreemetaPhonereuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryThreemetaPhonereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryThreemetaPhonereuseResponse(),
            await self.do_request_async('1.0', 'di.realperson.threemeta.phonereuse.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tscenter_device(
        self,
        request: realperson_models.QueryTscenterDeviceRequest,
    ) -> realperson_models.QueryTscenterDeviceResponse:
        """
        Description: 查询设备信息
        Summary: 设备信息查询for蚁盾
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tscenter_device_ex(request, headers, runtime)

    async def query_tscenter_device_async(
        self,
        request: realperson_models.QueryTscenterDeviceRequest,
    ) -> realperson_models.QueryTscenterDeviceResponse:
        """
        Description: 查询设备信息
        Summary: 设备信息查询for蚁盾
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tscenter_device_ex_async(request, headers, runtime)

    def query_tscenter_device_ex(
        self,
        request: realperson_models.QueryTscenterDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryTscenterDeviceResponse:
        """
        Description: 查询设备信息
        Summary: 设备信息查询for蚁盾
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryTscenterDeviceResponse(),
            self.do_request('1.0', 'di.realperson.tscenter.device.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tscenter_device_ex_async(
        self,
        request: realperson_models.QueryTscenterDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryTscenterDeviceResponse:
        """
        Description: 查询设备信息
        Summary: 设备信息查询for蚁盾
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryTscenterDeviceResponse(),
            await self.do_request_async('1.0', 'di.realperson.tscenter.device.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_education_info(
        self,
        request: realperson_models.QueryEducationInfoRequest,
    ) -> realperson_models.QueryEducationInfoResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_education_info_ex(request, headers, runtime)

    async def query_education_info_async(
        self,
        request: realperson_models.QueryEducationInfoRequest,
    ) -> realperson_models.QueryEducationInfoResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_education_info_ex_async(request, headers, runtime)

    def query_education_info_ex(
        self,
        request: realperson_models.QueryEducationInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryEducationInfoResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryEducationInfoResponse(),
            self.do_request('1.0', 'di.realperson.education.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_education_info_ex_async(
        self,
        request: realperson_models.QueryEducationInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryEducationInfoResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryEducationInfoResponse(),
            await self.do_request_async('1.0', 'di.realperson.education.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_info(
        self,
        request: realperson_models.QueryDemoInfoRequest,
    ) -> realperson_models.QueryDemoInfoResponse:
        """
        Description: demo用记录查询
        Summary: demo用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_info_ex(request, headers, runtime)

    async def query_demo_info_async(
        self,
        request: realperson_models.QueryDemoInfoRequest,
    ) -> realperson_models.QueryDemoInfoResponse:
        """
        Description: demo用记录查询
        Summary: demo用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_info_ex_async(request, headers, runtime)

    def query_demo_info_ex(
        self,
        request: realperson_models.QueryDemoInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryDemoInfoResponse:
        """
        Description: demo用记录查询
        Summary: demo用记录查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryDemoInfoResponse(),
            self.do_request('1.0', 'di.realperson.demo.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_info_ex_async(
        self,
        request: realperson_models.QueryDemoInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryDemoInfoResponse:
        """
        Description: demo用记录查询
        Summary: demo用记录查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryDemoInfoResponse(),
            await self.do_request_async('1.0', 'di.realperson.demo.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_bankcard_twometa(
        self,
        request: realperson_models.CheckBankcardTwometaRequest,
    ) -> realperson_models.CheckBankcardTwometaResponse:
        """
        Description: 个人银行卡二要素
        Summary: 个人银行卡二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_bankcard_twometa_ex(request, headers, runtime)

    async def check_bankcard_twometa_async(
        self,
        request: realperson_models.CheckBankcardTwometaRequest,
    ) -> realperson_models.CheckBankcardTwometaResponse:
        """
        Description: 个人银行卡二要素
        Summary: 个人银行卡二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_bankcard_twometa_ex_async(request, headers, runtime)

    def check_bankcard_twometa_ex(
        self,
        request: realperson_models.CheckBankcardTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckBankcardTwometaResponse:
        """
        Description: 个人银行卡二要素
        Summary: 个人银行卡二要素
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckBankcardTwometaResponse(),
            self.do_request('1.0', 'di.realperson.bankcard.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_bankcard_twometa_ex_async(
        self,
        request: realperson_models.CheckBankcardTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckBankcardTwometaResponse:
        """
        Description: 个人银行卡二要素
        Summary: 个人银行卡二要素
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckBankcardTwometaResponse(),
            await self.do_request_async('1.0', 'di.realperson.bankcard.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_carrier_twometa(
        self,
        request: realperson_models.CheckCarrierTwometaRequest,
    ) -> realperson_models.CheckCarrierTwometaResponse:
        """
        Description: 个人运营商二要素
        Summary: 个人运营商二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_carrier_twometa_ex(request, headers, runtime)

    async def check_carrier_twometa_async(
        self,
        request: realperson_models.CheckCarrierTwometaRequest,
    ) -> realperson_models.CheckCarrierTwometaResponse:
        """
        Description: 个人运营商二要素
        Summary: 个人运营商二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_carrier_twometa_ex_async(request, headers, runtime)

    def check_carrier_twometa_ex(
        self,
        request: realperson_models.CheckCarrierTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckCarrierTwometaResponse:
        """
        Description: 个人运营商二要素
        Summary: 个人运营商二要素
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckCarrierTwometaResponse(),
            self.do_request('1.0', 'di.realperson.carrier.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_carrier_twometa_ex_async(
        self,
        request: realperson_models.CheckCarrierTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckCarrierTwometaResponse:
        """
        Description: 个人运营商二要素
        Summary: 个人运营商二要素
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckCarrierTwometaResponse(),
            await self.do_request_async('1.0', 'di.realperson.carrier.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_nfc_server(
        self,
        request: realperson_models.CreateNfcServerRequest,
    ) -> realperson_models.CreateNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_nfc_server_ex(request, headers, runtime)

    async def create_nfc_server_async(
        self,
        request: realperson_models.CreateNfcServerRequest,
    ) -> realperson_models.CreateNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_nfc_server_ex_async(request, headers, runtime)

    def create_nfc_server_ex(
        self,
        request: realperson_models.CreateNfcServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateNfcServerResponse(),
            self.do_request('1.0', 'di.realperson.nfc.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_nfc_server_ex_async(
        self,
        request: realperson_models.CreateNfcServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateNfcServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.nfc.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nfc_server(
        self,
        request: realperson_models.QueryNfcServerRequest,
    ) -> realperson_models.QueryNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nfc_server_ex(request, headers, runtime)

    async def query_nfc_server_async(
        self,
        request: realperson_models.QueryNfcServerRequest,
    ) -> realperson_models.QueryNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nfc_server_ex_async(request, headers, runtime)

    def query_nfc_server_ex(
        self,
        request: realperson_models.QueryNfcServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryNfcServerResponse(),
            self.do_request('1.0', 'di.realperson.nfc.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nfc_server_ex_async(
        self,
        request: realperson_models.QueryNfcServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryNfcServerResponse:
        """
        Description: NFC实证
        Summary: NFC实证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryNfcServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.nfc.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_socialrisk_detail(
        self,
        request: realperson_models.QuerySocialriskDetailRequest,
    ) -> realperson_models.QuerySocialriskDetailResponse:
        """
        Description: 社会安全风险
        Summary: 社会安全风险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_socialrisk_detail_ex(request, headers, runtime)

    async def query_socialrisk_detail_async(
        self,
        request: realperson_models.QuerySocialriskDetailRequest,
    ) -> realperson_models.QuerySocialriskDetailResponse:
        """
        Description: 社会安全风险
        Summary: 社会安全风险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_socialrisk_detail_ex_async(request, headers, runtime)

    def query_socialrisk_detail_ex(
        self,
        request: realperson_models.QuerySocialriskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QuerySocialriskDetailResponse:
        """
        Description: 社会安全风险
        Summary: 社会安全风险
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QuerySocialriskDetailResponse(),
            self.do_request('1.0', 'di.realperson.socialrisk.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_socialrisk_detail_ex_async(
        self,
        request: realperson_models.QuerySocialriskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QuerySocialriskDetailResponse:
        """
        Description: 社会安全风险
        Summary: 社会安全风险
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QuerySocialriskDetailResponse(),
            await self.do_request_async('1.0', 'di.realperson.socialrisk.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_carrier_netstatus(
        self,
        request: realperson_models.QueryCarrierNetstatusRequest,
    ) -> realperson_models.QueryCarrierNetstatusResponse:
        """
        Description: 运营商在网状态查询
        Summary: 运营商在网状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_carrier_netstatus_ex(request, headers, runtime)

    async def query_carrier_netstatus_async(
        self,
        request: realperson_models.QueryCarrierNetstatusRequest,
    ) -> realperson_models.QueryCarrierNetstatusResponse:
        """
        Description: 运营商在网状态查询
        Summary: 运营商在网状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_carrier_netstatus_ex_async(request, headers, runtime)

    def query_carrier_netstatus_ex(
        self,
        request: realperson_models.QueryCarrierNetstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarrierNetstatusResponse:
        """
        Description: 运营商在网状态查询
        Summary: 运营商在网状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarrierNetstatusResponse(),
            self.do_request('1.0', 'di.realperson.carrier.netstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_carrier_netstatus_ex_async(
        self,
        request: realperson_models.QueryCarrierNetstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarrierNetstatusResponse:
        """
        Description: 运营商在网状态查询
        Summary: 运营商在网状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarrierNetstatusResponse(),
            await self.do_request_async('1.0', 'di.realperson.carrier.netstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_socialrisk_brief(
        self,
        request: realperson_models.QuerySocialriskBriefRequest,
    ) -> realperson_models.QuerySocialriskBriefResponse:
        """
        Description: 社会安全风险（简版）
        Summary: 社会安全风险（简版）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_socialrisk_brief_ex(request, headers, runtime)

    async def query_socialrisk_brief_async(
        self,
        request: realperson_models.QuerySocialriskBriefRequest,
    ) -> realperson_models.QuerySocialriskBriefResponse:
        """
        Description: 社会安全风险（简版）
        Summary: 社会安全风险（简版）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_socialrisk_brief_ex_async(request, headers, runtime)

    def query_socialrisk_brief_ex(
        self,
        request: realperson_models.QuerySocialriskBriefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QuerySocialriskBriefResponse:
        """
        Description: 社会安全风险（简版）
        Summary: 社会安全风险（简版）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QuerySocialriskBriefResponse(),
            self.do_request('1.0', 'di.realperson.socialrisk.brief.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_socialrisk_brief_ex_async(
        self,
        request: realperson_models.QuerySocialriskBriefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QuerySocialriskBriefResponse:
        """
        Description: 社会安全风险（简版）
        Summary: 社会安全风险（简版）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QuerySocialriskBriefResponse(),
            await self.do_request_async('1.0', 'di.realperson.socialrisk.brief.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_socialrisk_tobrisk(
        self,
        request: realperson_models.QuerySocialriskTobriskRequest,
    ) -> realperson_models.QuerySocialriskTobriskResponse:
        """
        Description: 社会安全风险（tob风控版）
        Summary: 社会安全风险（tob风控版）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_socialrisk_tobrisk_ex(request, headers, runtime)

    async def query_socialrisk_tobrisk_async(
        self,
        request: realperson_models.QuerySocialriskTobriskRequest,
    ) -> realperson_models.QuerySocialriskTobriskResponse:
        """
        Description: 社会安全风险（tob风控版）
        Summary: 社会安全风险（tob风控版）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_socialrisk_tobrisk_ex_async(request, headers, runtime)

    def query_socialrisk_tobrisk_ex(
        self,
        request: realperson_models.QuerySocialriskTobriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QuerySocialriskTobriskResponse:
        """
        Description: 社会安全风险（tob风控版）
        Summary: 社会安全风险（tob风控版）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QuerySocialriskTobriskResponse(),
            self.do_request('1.0', 'di.realperson.socialrisk.tobrisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_socialrisk_tobrisk_ex_async(
        self,
        request: realperson_models.QuerySocialriskTobriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QuerySocialriskTobriskResponse:
        """
        Description: 社会安全风险（tob风控版）
        Summary: 社会安全风险（tob风控版）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QuerySocialriskTobriskResponse(),
            await self.do_request_async('1.0', 'di.realperson.socialrisk.tobrisk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_zolozmeta_threemetamobilereuse(
        self,
        request: realperson_models.QueryZolozmetaThreemetamobilereuseRequest,
    ) -> realperson_models.QueryZolozmetaThreemetamobilereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号-meta版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_zolozmeta_threemetamobilereuse_ex(request, headers, runtime)

    async def query_zolozmeta_threemetamobilereuse_async(
        self,
        request: realperson_models.QueryZolozmetaThreemetamobilereuseRequest,
    ) -> realperson_models.QueryZolozmetaThreemetamobilereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号-meta版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_zolozmeta_threemetamobilereuse_ex_async(request, headers, runtime)

    def query_zolozmeta_threemetamobilereuse_ex(
        self,
        request: realperson_models.QueryZolozmetaThreemetamobilereuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryZolozmetaThreemetamobilereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号-meta版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryZolozmetaThreemetamobilereuseResponse(),
            self.do_request('1.0', 'di.realperson.zolozmeta.threemetamobilereuse.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_zolozmeta_threemetamobilereuse_ex_async(
        self,
        request: realperson_models.QueryZolozmetaThreemetamobilereuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryZolozmetaThreemetamobilereuseResponse:
        """
        Description: 个人运营商二次放号
        Summary: 个人运营商二次放号-meta版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryZolozmetaThreemetamobilereuseResponse(),
            await self.do_request_async('1.0', 'di.realperson.zolozmeta.threemetamobilereuse.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            realperson_models.CreateAntcloudGatewayxFileUploadResponse(),
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
        return TeaCore.from_map(
            realperson_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
