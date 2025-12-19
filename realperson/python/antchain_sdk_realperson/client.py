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
            # 卡证OCR图片坐标
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
                    'sdk_version': '1.22.12',
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
            # 卡证OCR图片坐标
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
                    'sdk_version': '1.22.12',
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
            request.file_object = None
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
            request.file_object = None
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
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.doc.individualcard.recognize',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                recognize_doc_individualcard_response = realperson_models.RecognizeDocIndividualcardResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return recognize_doc_individualcard_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
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
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.doc.individualcard.recognize',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                recognize_doc_individualcard_response = realperson_models.RecognizeDocIndividualcardResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return recognize_doc_individualcard_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
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

    def exec_facevrf_servermode(
        self,
        request: realperson_models.ExecFacevrfServermodeRequest,
    ) -> realperson_models.ExecFacevrfServermodeResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对V2版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_facevrf_servermode_ex(request, headers, runtime)

    async def exec_facevrf_servermode_async(
        self,
        request: realperson_models.ExecFacevrfServermodeRequest,
    ) -> realperson_models.ExecFacevrfServermodeResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对V2版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_facevrf_servermode_ex_async(request, headers, runtime)

    def exec_facevrf_servermode_ex(
        self,
        request: realperson_models.ExecFacevrfServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFacevrfServermodeResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对V2版本
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.facevrf.servermode.exec',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                exec_facevrf_servermode_response = realperson_models.ExecFacevrfServermodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return exec_facevrf_servermode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ExecFacevrfServermodeResponse(),
            self.do_request('1.0', 'di.realperson.facevrf.servermode.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_facevrf_servermode_ex_async(
        self,
        request: realperson_models.ExecFacevrfServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFacevrfServermodeResponse:
        """
        Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对V2版本
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.facevrf.servermode.exec',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                exec_facevrf_servermode_response = realperson_models.ExecFacevrfServermodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return exec_facevrf_servermode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ExecFacevrfServermodeResponse(),
            await self.do_request_async('1.0', 'di.realperson.facevrf.servermode.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bank_liveness(
        self,
        request: realperson_models.QueryBankLivenessRequest,
    ) -> realperson_models.QueryBankLivenessResponse:
        """
        Description: 银行活跃度
        Summary: 银行活跃度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bank_liveness_ex(request, headers, runtime)

    async def query_bank_liveness_async(
        self,
        request: realperson_models.QueryBankLivenessRequest,
    ) -> realperson_models.QueryBankLivenessResponse:
        """
        Description: 银行活跃度
        Summary: 银行活跃度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bank_liveness_ex_async(request, headers, runtime)

    def query_bank_liveness_ex(
        self,
        request: realperson_models.QueryBankLivenessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryBankLivenessResponse:
        """
        Description: 银行活跃度
        Summary: 银行活跃度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryBankLivenessResponse(),
            self.do_request('1.0', 'di.realperson.bank.liveness.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bank_liveness_ex_async(
        self,
        request: realperson_models.QueryBankLivenessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryBankLivenessResponse:
        """
        Description: 银行活跃度
        Summary: 银行活跃度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryBankLivenessResponse(),
            await self.do_request_async('1.0', 'di.realperson.bank.liveness.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_console_domain(
        self,
        request: realperson_models.CreateConsoleDomainRequest,
    ) -> realperson_models.CreateConsoleDomainResponse:
        """
        Description: 用于阿里云渠道小程序域名的绑定
        Summary: 新增场景与域名映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_console_domain_ex(request, headers, runtime)

    async def create_console_domain_async(
        self,
        request: realperson_models.CreateConsoleDomainRequest,
    ) -> realperson_models.CreateConsoleDomainResponse:
        """
        Description: 用于阿里云渠道小程序域名的绑定
        Summary: 新增场景与域名映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_console_domain_ex_async(request, headers, runtime)

    def create_console_domain_ex(
        self,
        request: realperson_models.CreateConsoleDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateConsoleDomainResponse:
        """
        Description: 用于阿里云渠道小程序域名的绑定
        Summary: 新增场景与域名映射
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateConsoleDomainResponse(),
            self.do_request('1.0', 'di.realperson.console.domain.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_console_domain_ex_async(
        self,
        request: realperson_models.CreateConsoleDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateConsoleDomainResponse:
        """
        Description: 用于阿里云渠道小程序域名的绑定
        Summary: 新增场景与域名映射
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateConsoleDomainResponse(),
            await self.do_request_async('1.0', 'di.realperson.console.domain.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_console_domain(
        self,
        request: realperson_models.DeleteConsoleDomainRequest,
    ) -> realperson_models.DeleteConsoleDomainResponse:
        """
        Description: 阿里云控制台删除场景与域名映射
        Summary: 删除场景与域名映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_console_domain_ex(request, headers, runtime)

    async def delete_console_domain_async(
        self,
        request: realperson_models.DeleteConsoleDomainRequest,
    ) -> realperson_models.DeleteConsoleDomainResponse:
        """
        Description: 阿里云控制台删除场景与域名映射
        Summary: 删除场景与域名映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_console_domain_ex_async(request, headers, runtime)

    def delete_console_domain_ex(
        self,
        request: realperson_models.DeleteConsoleDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.DeleteConsoleDomainResponse:
        """
        Description: 阿里云控制台删除场景与域名映射
        Summary: 删除场景与域名映射
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.DeleteConsoleDomainResponse(),
            self.do_request('1.0', 'di.realperson.console.domain.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_console_domain_ex_async(
        self,
        request: realperson_models.DeleteConsoleDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.DeleteConsoleDomainResponse:
        """
        Description: 阿里云控制台删除场景与域名映射
        Summary: 删除场景与域名映射
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.DeleteConsoleDomainResponse(),
            await self.do_request_async('1.0', 'di.realperson.console.domain.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_carrier_repairmobile(
        self,
        request: realperson_models.InitCarrierRepairmobileRequest,
    ) -> realperson_models.InitCarrierRepairmobileResponse:
        """
        Description: 失联修复初始化
        Summary: 失联修复初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_carrier_repairmobile_ex(request, headers, runtime)

    async def init_carrier_repairmobile_async(
        self,
        request: realperson_models.InitCarrierRepairmobileRequest,
    ) -> realperson_models.InitCarrierRepairmobileResponse:
        """
        Description: 失联修复初始化
        Summary: 失联修复初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_carrier_repairmobile_ex_async(request, headers, runtime)

    def init_carrier_repairmobile_ex(
        self,
        request: realperson_models.InitCarrierRepairmobileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.InitCarrierRepairmobileResponse:
        """
        Description: 失联修复初始化
        Summary: 失联修复初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.InitCarrierRepairmobileResponse(),
            self.do_request('1.0', 'di.realperson.carrier.repairmobile.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_carrier_repairmobile_ex_async(
        self,
        request: realperson_models.InitCarrierRepairmobileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.InitCarrierRepairmobileResponse:
        """
        Description: 失联修复初始化
        Summary: 失联修复初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.InitCarrierRepairmobileResponse(),
            await self.do_request_async('1.0', 'di.realperson.carrier.repairmobile.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_carrier_repairmobile(
        self,
        request: realperson_models.QueryCarrierRepairmobileRequest,
    ) -> realperson_models.QueryCarrierRepairmobileResponse:
        """
        Description: 失联修复查询修复结果
        Summary: 失联修复查询修复结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_carrier_repairmobile_ex(request, headers, runtime)

    async def query_carrier_repairmobile_async(
        self,
        request: realperson_models.QueryCarrierRepairmobileRequest,
    ) -> realperson_models.QueryCarrierRepairmobileResponse:
        """
        Description: 失联修复查询修复结果
        Summary: 失联修复查询修复结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_carrier_repairmobile_ex_async(request, headers, runtime)

    def query_carrier_repairmobile_ex(
        self,
        request: realperson_models.QueryCarrierRepairmobileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarrierRepairmobileResponse:
        """
        Description: 失联修复查询修复结果
        Summary: 失联修复查询修复结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarrierRepairmobileResponse(),
            self.do_request('1.0', 'di.realperson.carrier.repairmobile.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_carrier_repairmobile_ex_async(
        self,
        request: realperson_models.QueryCarrierRepairmobileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarrierRepairmobileResponse:
        """
        Description: 失联修复查询修复结果
        Summary: 失联修复查询修复结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarrierRepairmobileResponse(),
            await self.do_request_async('1.0', 'di.realperson.carrier.repairmobile.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_carrier_repairmobile(
        self,
        request: realperson_models.BindCarrierRepairmobileRequest,
    ) -> realperson_models.BindCarrierRepairmobileResponse:
        """
        Description: 失联修复小号绑定
        Summary: 失联修复小号绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_carrier_repairmobile_ex(request, headers, runtime)

    async def bind_carrier_repairmobile_async(
        self,
        request: realperson_models.BindCarrierRepairmobileRequest,
    ) -> realperson_models.BindCarrierRepairmobileResponse:
        """
        Description: 失联修复小号绑定
        Summary: 失联修复小号绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_carrier_repairmobile_ex_async(request, headers, runtime)

    def bind_carrier_repairmobile_ex(
        self,
        request: realperson_models.BindCarrierRepairmobileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.BindCarrierRepairmobileResponse:
        """
        Description: 失联修复小号绑定
        Summary: 失联修复小号绑定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.BindCarrierRepairmobileResponse(),
            self.do_request('1.0', 'di.realperson.carrier.repairmobile.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_carrier_repairmobile_ex_async(
        self,
        request: realperson_models.BindCarrierRepairmobileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.BindCarrierRepairmobileResponse:
        """
        Description: 失联修复小号绑定
        Summary: 失联修复小号绑定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.BindCarrierRepairmobileResponse(),
            await self.do_request_async('1.0', 'di.realperson.carrier.repairmobile.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_ext_orgdata(
        self,
        request: realperson_models.ApplyExtOrgdataRequest,
    ) -> realperson_models.ApplyExtOrgdataResponse:
        """
        Description: 外部机构数据上报
        Summary: 外部机构数据上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_ext_orgdata_ex(request, headers, runtime)

    async def apply_ext_orgdata_async(
        self,
        request: realperson_models.ApplyExtOrgdataRequest,
    ) -> realperson_models.ApplyExtOrgdataResponse:
        """
        Description: 外部机构数据上报
        Summary: 外部机构数据上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_ext_orgdata_ex_async(request, headers, runtime)

    def apply_ext_orgdata_ex(
        self,
        request: realperson_models.ApplyExtOrgdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ApplyExtOrgdataResponse:
        """
        Description: 外部机构数据上报
        Summary: 外部机构数据上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ApplyExtOrgdataResponse(),
            self.do_request('1.0', 'di.realperson.ext.orgdata.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_ext_orgdata_ex_async(
        self,
        request: realperson_models.ApplyExtOrgdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ApplyExtOrgdataResponse:
        """
        Description: 外部机构数据上报
        Summary: 外部机构数据上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ApplyExtOrgdataResponse(),
            await self.do_request_async('1.0', 'di.realperson.ext.orgdata.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_faceverify_server(
        self,
        request: realperson_models.CreateFaceverifyServerRequest,
    ) -> realperson_models.CreateFaceverifyServerResponse:
        """
        Description: 数科刷脸服务端初始化接口
        Summary: 数科刷脸服务端初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_faceverify_server_ex(request, headers, runtime)

    async def create_faceverify_server_async(
        self,
        request: realperson_models.CreateFaceverifyServerRequest,
    ) -> realperson_models.CreateFaceverifyServerResponse:
        """
        Description: 数科刷脸服务端初始化接口
        Summary: 数科刷脸服务端初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_faceverify_server_ex_async(request, headers, runtime)

    def create_faceverify_server_ex(
        self,
        request: realperson_models.CreateFaceverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateFaceverifyServerResponse:
        """
        Description: 数科刷脸服务端初始化接口
        Summary: 数科刷脸服务端初始化接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.faceverify.server.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_faceverify_server_response = realperson_models.CreateFaceverifyServerResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_faceverify_server_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateFaceverifyServerResponse(),
            self.do_request('1.0', 'di.realperson.faceverify.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_faceverify_server_ex_async(
        self,
        request: realperson_models.CreateFaceverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateFaceverifyServerResponse:
        """
        Description: 数科刷脸服务端初始化接口
        Summary: 数科刷脸服务端初始化接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.faceverify.server.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_faceverify_server_response = realperson_models.CreateFaceverifyServerResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_faceverify_server_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateFaceverifyServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.faceverify.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceverify_server(
        self,
        request: realperson_models.QueryFaceverifyServerRequest,
    ) -> realperson_models.QueryFaceverifyServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceverify_server_ex(request, headers, runtime)

    async def query_faceverify_server_async(
        self,
        request: realperson_models.QueryFaceverifyServerRequest,
    ) -> realperson_models.QueryFaceverifyServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceverify_server_ex_async(request, headers, runtime)

    def query_faceverify_server_ex(
        self,
        request: realperson_models.QueryFaceverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryFaceverifyServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryFaceverifyServerResponse(),
            self.do_request('1.0', 'di.realperson.faceverify.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceverify_server_ex_async(
        self,
        request: realperson_models.QueryFaceverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryFaceverifyServerResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 认证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryFaceverifyServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.faceverify.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bank_livenessplus(
        self,
        request: realperson_models.QueryBankLivenessplusRequest,
    ) -> realperson_models.QueryBankLivenessplusResponse:
        """
        Description: 个人银行卡状态增强版
        Summary: 个人银行卡状态增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bank_livenessplus_ex(request, headers, runtime)

    async def query_bank_livenessplus_async(
        self,
        request: realperson_models.QueryBankLivenessplusRequest,
    ) -> realperson_models.QueryBankLivenessplusResponse:
        """
        Description: 个人银行卡状态增强版
        Summary: 个人银行卡状态增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bank_livenessplus_ex_async(request, headers, runtime)

    def query_bank_livenessplus_ex(
        self,
        request: realperson_models.QueryBankLivenessplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryBankLivenessplusResponse:
        """
        Description: 个人银行卡状态增强版
        Summary: 个人银行卡状态增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryBankLivenessplusResponse(),
            self.do_request('1.0', 'di.realperson.bank.livenessplus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bank_livenessplus_ex_async(
        self,
        request: realperson_models.QueryBankLivenessplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryBankLivenessplusResponse:
        """
        Description: 个人银行卡状态增强版
        Summary: 个人银行卡状态增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryBankLivenessplusResponse(),
            await self.do_request_async('1.0', 'di.realperson.bank.livenessplus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_faceverify_servermode(
        self,
        request: realperson_models.ExecFaceverifyServermodeRequest,
    ) -> realperson_models.ExecFaceverifyServermodeResponse:
        """
        Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_faceverify_servermode_ex(request, headers, runtime)

    async def exec_faceverify_servermode_async(
        self,
        request: realperson_models.ExecFaceverifyServermodeRequest,
    ) -> realperson_models.ExecFaceverifyServermodeResponse:
        """
        Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对基础版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_faceverify_servermode_ex_async(request, headers, runtime)

    def exec_faceverify_servermode_ex(
        self,
        request: realperson_models.ExecFaceverifyServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFaceverifyServermodeResponse:
        """
        Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对基础版
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.faceverify.servermode.exec',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                exec_faceverify_servermode_response = realperson_models.ExecFaceverifyServermodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return exec_faceverify_servermode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ExecFaceverifyServermodeResponse(),
            self.do_request('1.0', 'di.realperson.faceverify.servermode.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_faceverify_servermode_ex_async(
        self,
        request: realperson_models.ExecFaceverifyServermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFaceverifyServermodeResponse:
        """
        Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
        Summary: 纯服务端比对基础版
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.faceverify.servermode.exec',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                exec_faceverify_servermode_response = realperson_models.ExecFaceverifyServermodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return exec_faceverify_servermode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ExecFaceverifyServermodeResponse(),
            await self.do_request_async('1.0', 'di.realperson.faceverify.servermode.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_alipayverify_server(
        self,
        request: realperson_models.CreateAlipayverifyServerRequest,
    ) -> realperson_models.CreateAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证初始化接口
        Summary: 支付宝实人认证初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_alipayverify_server_ex(request, headers, runtime)

    async def create_alipayverify_server_async(
        self,
        request: realperson_models.CreateAlipayverifyServerRequest,
    ) -> realperson_models.CreateAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证初始化接口
        Summary: 支付宝实人认证初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_alipayverify_server_ex_async(request, headers, runtime)

    def create_alipayverify_server_ex(
        self,
        request: realperson_models.CreateAlipayverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证初始化接口
        Summary: 支付宝实人认证初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateAlipayverifyServerResponse(),
            self.do_request('1.0', 'di.realperson.alipayverify.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_alipayverify_server_ex_async(
        self,
        request: realperson_models.CreateAlipayverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CreateAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证初始化接口
        Summary: 支付宝实人认证初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CreateAlipayverifyServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.alipayverify.server.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alipayverify_server(
        self,
        request: realperson_models.QueryAlipayverifyServerRequest,
    ) -> realperson_models.QueryAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证查询接口
        Summary: 支付宝实人认证查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alipayverify_server_ex(request, headers, runtime)

    async def query_alipayverify_server_async(
        self,
        request: realperson_models.QueryAlipayverifyServerRequest,
    ) -> realperson_models.QueryAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证查询接口
        Summary: 支付宝实人认证查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alipayverify_server_ex_async(request, headers, runtime)

    def query_alipayverify_server_ex(
        self,
        request: realperson_models.QueryAlipayverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证查询接口
        Summary: 支付宝实人认证查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryAlipayverifyServerResponse(),
            self.do_request('1.0', 'di.realperson.alipayverify.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alipayverify_server_ex_async(
        self,
        request: realperson_models.QueryAlipayverifyServerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryAlipayverifyServerResponse:
        """
        Description: 支付宝实人认证查询接口
        Summary: 支付宝实人认证查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryAlipayverifyServerResponse(),
            await self.do_request_async('1.0', 'di.realperson.alipayverify.server.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_car_twometa(
        self,
        request: realperson_models.CheckCarTwometaRequest,
    ) -> realperson_models.CheckCarTwometaResponse:
        """
        Description: 车辆资产验证
        Summary: 车辆资产验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_car_twometa_ex(request, headers, runtime)

    async def check_car_twometa_async(
        self,
        request: realperson_models.CheckCarTwometaRequest,
    ) -> realperson_models.CheckCarTwometaResponse:
        """
        Description: 车辆资产验证
        Summary: 车辆资产验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_car_twometa_ex_async(request, headers, runtime)

    def check_car_twometa_ex(
        self,
        request: realperson_models.CheckCarTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckCarTwometaResponse:
        """
        Description: 车辆资产验证
        Summary: 车辆资产验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckCarTwometaResponse(),
            self.do_request('1.0', 'di.realperson.car.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_car_twometa_ex_async(
        self,
        request: realperson_models.CheckCarTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckCarTwometaResponse:
        """
        Description: 车辆资产验证
        Summary: 车辆资产验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckCarTwometaResponse(),
            await self.do_request_async('1.0', 'di.realperson.car.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_education_background(
        self,
        request: realperson_models.QueryEducationBackgroundRequest,
    ) -> realperson_models.QueryEducationBackgroundResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_education_background_ex(request, headers, runtime)

    async def query_education_background_async(
        self,
        request: realperson_models.QueryEducationBackgroundRequest,
    ) -> realperson_models.QueryEducationBackgroundResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_education_background_ex_async(request, headers, runtime)

    def query_education_background_ex(
        self,
        request: realperson_models.QueryEducationBackgroundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryEducationBackgroundResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryEducationBackgroundResponse(),
            self.do_request('1.0', 'di.realperson.education.background.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_education_background_ex_async(
        self,
        request: realperson_models.QueryEducationBackgroundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryEducationBackgroundResponse:
        """
        Description: 学历验证
        Summary: 学历验证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryEducationBackgroundResponse(),
            await self.do_request_async('1.0', 'di.realperson.education.background.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bank_livenessfour(
        self,
        request: realperson_models.QueryBankLivenessfourRequest,
    ) -> realperson_models.QueryBankLivenessfourResponse:
        """
        Description: 个人银行卡状态验证 V4.0
        Summary: 个人银行卡状态验证 V4.0
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bank_livenessfour_ex(request, headers, runtime)

    async def query_bank_livenessfour_async(
        self,
        request: realperson_models.QueryBankLivenessfourRequest,
    ) -> realperson_models.QueryBankLivenessfourResponse:
        """
        Description: 个人银行卡状态验证 V4.0
        Summary: 个人银行卡状态验证 V4.0
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bank_livenessfour_ex_async(request, headers, runtime)

    def query_bank_livenessfour_ex(
        self,
        request: realperson_models.QueryBankLivenessfourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryBankLivenessfourResponse:
        """
        Description: 个人银行卡状态验证 V4.0
        Summary: 个人银行卡状态验证 V4.0
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryBankLivenessfourResponse(),
            self.do_request('1.0', 'di.realperson.bank.livenessfour.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bank_livenessfour_ex_async(
        self,
        request: realperson_models.QueryBankLivenessfourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryBankLivenessfourResponse:
        """
        Description: 个人银行卡状态验证 V4.0
        Summary: 个人银行卡状态验证 V4.0
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryBankLivenessfourResponse(),
            await self.do_request_async('1.0', 'di.realperson.bank.livenessfour.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_faceverify_servermaterial(
        self,
        request: realperson_models.QueryFaceverifyServermaterialRequest,
    ) -> realperson_models.QueryFaceverifyServermaterialResponse:
        """
        Description: 查询认证的材料信息
        Summary: 认证材料查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_faceverify_servermaterial_ex(request, headers, runtime)

    async def query_faceverify_servermaterial_async(
        self,
        request: realperson_models.QueryFaceverifyServermaterialRequest,
    ) -> realperson_models.QueryFaceverifyServermaterialResponse:
        """
        Description: 查询认证的材料信息
        Summary: 认证材料查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_faceverify_servermaterial_ex_async(request, headers, runtime)

    def query_faceverify_servermaterial_ex(
        self,
        request: realperson_models.QueryFaceverifyServermaterialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryFaceverifyServermaterialResponse:
        """
        Description: 查询认证的材料信息
        Summary: 认证材料查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryFaceverifyServermaterialResponse(),
            self.do_request('1.0', 'di.realperson.faceverify.servermaterial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_faceverify_servermaterial_ex_async(
        self,
        request: realperson_models.QueryFaceverifyServermaterialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryFaceverifyServermaterialResponse:
        """
        Description: 查询认证的材料信息
        Summary: 认证材料查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryFaceverifyServermaterialResponse(),
            await self.do_request_async('1.0', 'di.realperson.faceverify.servermaterial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scalein_image(
        self,
        request: realperson_models.ScaleinImageRequest,
    ) -> realperson_models.ScaleinImageResponse:
        """
        Description: 图片压缩接口
        Summary: 图片压缩接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scalein_image_ex(request, headers, runtime)

    async def scalein_image_async(
        self,
        request: realperson_models.ScaleinImageRequest,
    ) -> realperson_models.ScaleinImageResponse:
        """
        Description: 图片压缩接口
        Summary: 图片压缩接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scalein_image_ex_async(request, headers, runtime)

    def scalein_image_ex(
        self,
        request: realperson_models.ScaleinImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ScaleinImageResponse:
        """
        Description: 图片压缩接口
        Summary: 图片压缩接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.image.scalein',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                scalein_image_response = realperson_models.ScaleinImageResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return scalein_image_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ScaleinImageResponse(),
            self.do_request('1.0', 'di.realperson.image.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scalein_image_ex_async(
        self,
        request: realperson_models.ScaleinImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ScaleinImageResponse:
        """
        Description: 图片压缩接口
        Summary: 图片压缩接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.image.scalein',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                scalein_image_response = realperson_models.ScaleinImageResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return scalein_image_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ScaleinImageResponse(),
            await self.do_request_async('1.0', 'di.realperson.image.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_ocr_individualcard(
        self,
        request: realperson_models.RecognizeOcrIndividualcardRequest,
    ) -> realperson_models.RecognizeOcrIndividualcardResponse:
        """
        Description: 要素卡证OCR
        Summary: 要素卡证OCR
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_ocr_individualcard_ex(request, headers, runtime)

    async def recognize_ocr_individualcard_async(
        self,
        request: realperson_models.RecognizeOcrIndividualcardRequest,
    ) -> realperson_models.RecognizeOcrIndividualcardResponse:
        """
        Description: 要素卡证OCR
        Summary: 要素卡证OCR
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_ocr_individualcard_ex_async(request, headers, runtime)

    def recognize_ocr_individualcard_ex(
        self,
        request: realperson_models.RecognizeOcrIndividualcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.RecognizeOcrIndividualcardResponse:
        """
        Description: 要素卡证OCR
        Summary: 要素卡证OCR
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.ocr.individualcard.recognize',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                recognize_ocr_individualcard_response = realperson_models.RecognizeOcrIndividualcardResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return recognize_ocr_individualcard_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.RecognizeOcrIndividualcardResponse(),
            self.do_request('1.0', 'di.realperson.ocr.individualcard.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_ocr_individualcard_ex_async(
        self,
        request: realperson_models.RecognizeOcrIndividualcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.RecognizeOcrIndividualcardResponse:
        """
        Description: 要素卡证OCR
        Summary: 要素卡证OCR
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = realperson_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='di.realperson.ocr.individualcard.recognize',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                recognize_ocr_individualcard_response = realperson_models.RecognizeOcrIndividualcardResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return recognize_ocr_individualcard_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.RecognizeOcrIndividualcardResponse(),
            await self.do_request_async('1.0', 'di.realperson.ocr.individualcard.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_idcard_fourmeta(
        self,
        request: realperson_models.CheckIdcardFourmetaRequest,
    ) -> realperson_models.CheckIdcardFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_idcard_fourmeta_ex(request, headers, runtime)

    async def check_idcard_fourmeta_async(
        self,
        request: realperson_models.CheckIdcardFourmetaRequest,
    ) -> realperson_models.CheckIdcardFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_idcard_fourmeta_ex_async(request, headers, runtime)

    def check_idcard_fourmeta_ex(
        self,
        request: realperson_models.CheckIdcardFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIdcardFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckIdcardFourmetaResponse(),
            self.do_request('1.0', 'di.realperson.idcard.fourmeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_idcard_fourmeta_ex_async(
        self,
        request: realperson_models.CheckIdcardFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.CheckIdcardFourmetaResponse:
        """
        Description: 个人四要素认证
        Summary: 个人四要素认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.CheckIdcardFourmetaResponse(),
            await self.do_request_async('1.0', 'di.realperson.idcard.fourmeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_carinfo_detail(
        self,
        request: realperson_models.QueryCarinfoDetailRequest,
    ) -> realperson_models.QueryCarinfoDetailResponse:
        """
        Description: 车辆资产验证详版
        Summary: 车辆资产验证详版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_carinfo_detail_ex(request, headers, runtime)

    async def query_carinfo_detail_async(
        self,
        request: realperson_models.QueryCarinfoDetailRequest,
    ) -> realperson_models.QueryCarinfoDetailResponse:
        """
        Description: 车辆资产验证详版
        Summary: 车辆资产验证详版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_carinfo_detail_ex_async(request, headers, runtime)

    def query_carinfo_detail_ex(
        self,
        request: realperson_models.QueryCarinfoDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoDetailResponse:
        """
        Description: 车辆资产验证详版
        Summary: 车辆资产验证详版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoDetailResponse(),
            self.do_request('1.0', 'di.realperson.carinfo.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_carinfo_detail_ex_async(
        self,
        request: realperson_models.QueryCarinfoDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoDetailResponse:
        """
        Description: 车辆资产验证详版
        Summary: 车辆资产验证详版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoDetailResponse(),
            await self.do_request_async('1.0', 'di.realperson.carinfo.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_carinfo_brief(
        self,
        request: realperson_models.QueryCarinfoBriefRequest,
    ) -> realperson_models.QueryCarinfoBriefResponse:
        """
        Description: 车辆资产验证简版
        Summary: 车辆资产验证简版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_carinfo_brief_ex(request, headers, runtime)

    async def query_carinfo_brief_async(
        self,
        request: realperson_models.QueryCarinfoBriefRequest,
    ) -> realperson_models.QueryCarinfoBriefResponse:
        """
        Description: 车辆资产验证简版
        Summary: 车辆资产验证简版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_carinfo_brief_ex_async(request, headers, runtime)

    def query_carinfo_brief_ex(
        self,
        request: realperson_models.QueryCarinfoBriefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoBriefResponse:
        """
        Description: 车辆资产验证简版
        Summary: 车辆资产验证简版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoBriefResponse(),
            self.do_request('1.0', 'di.realperson.carinfo.brief.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_carinfo_brief_ex_async(
        self,
        request: realperson_models.QueryCarinfoBriefRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoBriefResponse:
        """
        Description: 车辆资产验证简版
        Summary: 车辆资产验证简版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoBriefResponse(),
            await self.do_request_async('1.0', 'di.realperson.carinfo.brief.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_cutpayment_pre(
        self,
        request: realperson_models.BindCutpaymentPreRequest,
    ) -> realperson_models.BindCutpaymentPreResponse:
        """
        Description: 银行卡代扣预绑定
        Summary: 银行卡代扣预绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_cutpayment_pre_ex(request, headers, runtime)

    async def bind_cutpayment_pre_async(
        self,
        request: realperson_models.BindCutpaymentPreRequest,
    ) -> realperson_models.BindCutpaymentPreResponse:
        """
        Description: 银行卡代扣预绑定
        Summary: 银行卡代扣预绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_cutpayment_pre_ex_async(request, headers, runtime)

    def bind_cutpayment_pre_ex(
        self,
        request: realperson_models.BindCutpaymentPreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.BindCutpaymentPreResponse:
        """
        Description: 银行卡代扣预绑定
        Summary: 银行卡代扣预绑定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.BindCutpaymentPreResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.pre.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_cutpayment_pre_ex_async(
        self,
        request: realperson_models.BindCutpaymentPreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.BindCutpaymentPreResponse:
        """
        Description: 银行卡代扣预绑定
        Summary: 银行卡代扣预绑定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.BindCutpaymentPreResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.pre.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_cutpayment_sign(
        self,
        request: realperson_models.BindCutpaymentSignRequest,
    ) -> realperson_models.BindCutpaymentSignResponse:
        """
        Description: 银行卡代扣绑卡签约
        Summary: 银行卡代扣绑卡签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_cutpayment_sign_ex(request, headers, runtime)

    async def bind_cutpayment_sign_async(
        self,
        request: realperson_models.BindCutpaymentSignRequest,
    ) -> realperson_models.BindCutpaymentSignResponse:
        """
        Description: 银行卡代扣绑卡签约
        Summary: 银行卡代扣绑卡签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_cutpayment_sign_ex_async(request, headers, runtime)

    def bind_cutpayment_sign_ex(
        self,
        request: realperson_models.BindCutpaymentSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.BindCutpaymentSignResponse:
        """
        Description: 银行卡代扣绑卡签约
        Summary: 银行卡代扣绑卡签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.BindCutpaymentSignResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.sign.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_cutpayment_sign_ex_async(
        self,
        request: realperson_models.BindCutpaymentSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.BindCutpaymentSignResponse:
        """
        Description: 银行卡代扣绑卡签约
        Summary: 银行卡代扣绑卡签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.BindCutpaymentSignResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.sign.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_cutpayment_sign(
        self,
        request: realperson_models.UnbindCutpaymentSignRequest,
    ) -> realperson_models.UnbindCutpaymentSignResponse:
        """
        Description: 银行卡代扣解绑
        Summary: 银行卡代扣解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_cutpayment_sign_ex(request, headers, runtime)

    async def unbind_cutpayment_sign_async(
        self,
        request: realperson_models.UnbindCutpaymentSignRequest,
    ) -> realperson_models.UnbindCutpaymentSignResponse:
        """
        Description: 银行卡代扣解绑
        Summary: 银行卡代扣解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_cutpayment_sign_ex_async(request, headers, runtime)

    def unbind_cutpayment_sign_ex(
        self,
        request: realperson_models.UnbindCutpaymentSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.UnbindCutpaymentSignResponse:
        """
        Description: 银行卡代扣解绑
        Summary: 银行卡代扣解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.UnbindCutpaymentSignResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_cutpayment_sign_ex_async(
        self,
        request: realperson_models.UnbindCutpaymentSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.UnbindCutpaymentSignResponse:
        """
        Description: 银行卡代扣解绑
        Summary: 银行卡代扣解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.UnbindCutpaymentSignResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cutpayment_bind(
        self,
        request: realperson_models.QueryCutpaymentBindRequest,
    ) -> realperson_models.QueryCutpaymentBindResponse:
        """
        Description: 银行卡代扣绑定结果查询
        Summary: 银行卡代扣绑定结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cutpayment_bind_ex(request, headers, runtime)

    async def query_cutpayment_bind_async(
        self,
        request: realperson_models.QueryCutpaymentBindRequest,
    ) -> realperson_models.QueryCutpaymentBindResponse:
        """
        Description: 银行卡代扣绑定结果查询
        Summary: 银行卡代扣绑定结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cutpayment_bind_ex_async(request, headers, runtime)

    def query_cutpayment_bind_ex(
        self,
        request: realperson_models.QueryCutpaymentBindRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentBindResponse:
        """
        Description: 银行卡代扣绑定结果查询
        Summary: 银行卡代扣绑定结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentBindResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.bind.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cutpayment_bind_ex_async(
        self,
        request: realperson_models.QueryCutpaymentBindRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentBindResponse:
        """
        Description: 银行卡代扣绑定结果查询
        Summary: 银行卡代扣绑定结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentBindResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.bind.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_cutpayment_payment(
        self,
        request: realperson_models.ApplyCutpaymentPaymentRequest,
    ) -> realperson_models.ApplyCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账扣款
        Summary: 银行卡代扣支付分账扣款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_cutpayment_payment_ex(request, headers, runtime)

    async def apply_cutpayment_payment_async(
        self,
        request: realperson_models.ApplyCutpaymentPaymentRequest,
    ) -> realperson_models.ApplyCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账扣款
        Summary: 银行卡代扣支付分账扣款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_cutpayment_payment_ex_async(request, headers, runtime)

    def apply_cutpayment_payment_ex(
        self,
        request: realperson_models.ApplyCutpaymentPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ApplyCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账扣款
        Summary: 银行卡代扣支付分账扣款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ApplyCutpaymentPaymentResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.payment.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_cutpayment_payment_ex_async(
        self,
        request: realperson_models.ApplyCutpaymentPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ApplyCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账扣款
        Summary: 银行卡代扣支付分账扣款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ApplyCutpaymentPaymentResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.payment.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cutpayment_payment(
        self,
        request: realperson_models.QueryCutpaymentPaymentRequest,
    ) -> realperson_models.QueryCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账查询
        Summary: 银行卡代扣支付分账查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cutpayment_payment_ex(request, headers, runtime)

    async def query_cutpayment_payment_async(
        self,
        request: realperson_models.QueryCutpaymentPaymentRequest,
    ) -> realperson_models.QueryCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账查询
        Summary: 银行卡代扣支付分账查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cutpayment_payment_ex_async(request, headers, runtime)

    def query_cutpayment_payment_ex(
        self,
        request: realperson_models.QueryCutpaymentPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账查询
        Summary: 银行卡代扣支付分账查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentPaymentResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.payment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cutpayment_payment_ex_async(
        self,
        request: realperson_models.QueryCutpaymentPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentPaymentResponse:
        """
        Description: 银行卡代扣支付分账查询
        Summary: 银行卡代扣支付分账查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentPaymentResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.payment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_cutpayment_refund(
        self,
        request: realperson_models.ApplyCutpaymentRefundRequest,
    ) -> realperson_models.ApplyCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款申请
        Summary: 银行卡代扣退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_cutpayment_refund_ex(request, headers, runtime)

    async def apply_cutpayment_refund_async(
        self,
        request: realperson_models.ApplyCutpaymentRefundRequest,
    ) -> realperson_models.ApplyCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款申请
        Summary: 银行卡代扣退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_cutpayment_refund_ex_async(request, headers, runtime)

    def apply_cutpayment_refund_ex(
        self,
        request: realperson_models.ApplyCutpaymentRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ApplyCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款申请
        Summary: 银行卡代扣退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ApplyCutpaymentRefundResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.refund.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_cutpayment_refund_ex_async(
        self,
        request: realperson_models.ApplyCutpaymentRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ApplyCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款申请
        Summary: 银行卡代扣退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ApplyCutpaymentRefundResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.refund.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cutpayment_refund(
        self,
        request: realperson_models.QueryCutpaymentRefundRequest,
    ) -> realperson_models.QueryCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款查询
        Summary: 银行卡代扣退款查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cutpayment_refund_ex(request, headers, runtime)

    async def query_cutpayment_refund_async(
        self,
        request: realperson_models.QueryCutpaymentRefundRequest,
    ) -> realperson_models.QueryCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款查询
        Summary: 银行卡代扣退款查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cutpayment_refund_ex_async(request, headers, runtime)

    def query_cutpayment_refund_ex(
        self,
        request: realperson_models.QueryCutpaymentRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款查询
        Summary: 银行卡代扣退款查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentRefundResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cutpayment_refund_ex_async(
        self,
        request: realperson_models.QueryCutpaymentRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentRefundResponse:
        """
        Description: 银行卡代扣退款查询
        Summary: 银行卡代扣退款查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentRefundResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cutpayment_statement(
        self,
        request: realperson_models.QueryCutpaymentStatementRequest,
    ) -> realperson_models.QueryCutpaymentStatementResponse:
        """
        Description: 银行卡代扣对账
        Summary: 银行卡代扣对账
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cutpayment_statement_ex(request, headers, runtime)

    async def query_cutpayment_statement_async(
        self,
        request: realperson_models.QueryCutpaymentStatementRequest,
    ) -> realperson_models.QueryCutpaymentStatementResponse:
        """
        Description: 银行卡代扣对账
        Summary: 银行卡代扣对账
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cutpayment_statement_ex_async(request, headers, runtime)

    def query_cutpayment_statement_ex(
        self,
        request: realperson_models.QueryCutpaymentStatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentStatementResponse:
        """
        Description: 银行卡代扣对账
        Summary: 银行卡代扣对账
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentStatementResponse(),
            self.do_request('1.0', 'di.realperson.cutpayment.statement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cutpayment_statement_ex_async(
        self,
        request: realperson_models.QueryCutpaymentStatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCutpaymentStatementResponse:
        """
        Description: 银行卡代扣对账
        Summary: 银行卡代扣对账
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCutpaymentStatementResponse(),
            await self.do_request_async('1.0', 'di.realperson.cutpayment.statement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_face_threemeta(
        self,
        request: realperson_models.ExecFaceThreemetaRequest,
    ) -> realperson_models.ExecFaceThreemetaResponse:
        """
        Description: 人像、证件号、姓名比对接口
        Summary: 人像、证件号、姓名比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_face_threemeta_ex(request, headers, runtime)

    async def exec_face_threemeta_async(
        self,
        request: realperson_models.ExecFaceThreemetaRequest,
    ) -> realperson_models.ExecFaceThreemetaResponse:
        """
        Description: 人像、证件号、姓名比对接口
        Summary: 人像、证件号、姓名比对
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_face_threemeta_ex_async(request, headers, runtime)

    def exec_face_threemeta_ex(
        self,
        request: realperson_models.ExecFaceThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFaceThreemetaResponse:
        """
        Description: 人像、证件号、姓名比对接口
        Summary: 人像、证件号、姓名比对
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ExecFaceThreemetaResponse(),
            self.do_request('1.0', 'di.realperson.face.threemeta.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_face_threemeta_ex_async(
        self,
        request: realperson_models.ExecFaceThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.ExecFaceThreemetaResponse:
        """
        Description: 人像、证件号、姓名比对接口
        Summary: 人像、证件号、姓名比对
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.ExecFaceThreemetaResponse(),
            await self.do_request_async('1.0', 'di.realperson.face.threemeta.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_carinfo_ultimate(
        self,
        request: realperson_models.QueryCarinfoUltimateRequest,
    ) -> realperson_models.QueryCarinfoUltimateResponse:
        """
        Description: 用户资产验证-车辆资产验证旗舰版
        Summary: 用户资产验证-车辆资产验证旗舰版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_carinfo_ultimate_ex(request, headers, runtime)

    async def query_carinfo_ultimate_async(
        self,
        request: realperson_models.QueryCarinfoUltimateRequest,
    ) -> realperson_models.QueryCarinfoUltimateResponse:
        """
        Description: 用户资产验证-车辆资产验证旗舰版
        Summary: 用户资产验证-车辆资产验证旗舰版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_carinfo_ultimate_ex_async(request, headers, runtime)

    def query_carinfo_ultimate_ex(
        self,
        request: realperson_models.QueryCarinfoUltimateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoUltimateResponse:
        """
        Description: 用户资产验证-车辆资产验证旗舰版
        Summary: 用户资产验证-车辆资产验证旗舰版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoUltimateResponse(),
            self.do_request('1.0', 'di.realperson.carinfo.ultimate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_carinfo_ultimate_ex_async(
        self,
        request: realperson_models.QueryCarinfoUltimateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoUltimateResponse:
        """
        Description: 用户资产验证-车辆资产验证旗舰版
        Summary: 用户资产验证-车辆资产验证旗舰版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoUltimateResponse(),
            await self.do_request_async('1.0', 'di.realperson.carinfo.ultimate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_carinfo_plus(
        self,
        request: realperson_models.QueryCarinfoPlusRequest,
    ) -> realperson_models.QueryCarinfoPlusResponse:
        """
        Description: 用户资产验证-车辆资产验证增强版
        Summary: 用户资产验证-车辆资产验证增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_carinfo_plus_ex(request, headers, runtime)

    async def query_carinfo_plus_async(
        self,
        request: realperson_models.QueryCarinfoPlusRequest,
    ) -> realperson_models.QueryCarinfoPlusResponse:
        """
        Description: 用户资产验证-车辆资产验证增强版
        Summary: 用户资产验证-车辆资产验证增强版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_carinfo_plus_ex_async(request, headers, runtime)

    def query_carinfo_plus_ex(
        self,
        request: realperson_models.QueryCarinfoPlusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoPlusResponse:
        """
        Description: 用户资产验证-车辆资产验证增强版
        Summary: 用户资产验证-车辆资产验证增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoPlusResponse(),
            self.do_request('1.0', 'di.realperson.carinfo.plus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_carinfo_plus_ex_async(
        self,
        request: realperson_models.QueryCarinfoPlusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> realperson_models.QueryCarinfoPlusResponse:
        """
        Description: 用户资产验证-车辆资产验证增强版
        Summary: 用户资产验证-车辆资产验证增强版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            realperson_models.QueryCarinfoPlusResponse(),
            await self.do_request_async('1.0', 'di.realperson.carinfo.plus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
