# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_20ab7e4471e24e8fbfaa7df4ba0613c8 import models as ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models
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
        config: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.Config,
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
            # Did Doc中的服务字段描述
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
                    'sdk_version': '1.0.3'
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
            # Did Doc中的服务字段描述
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
                    'sdk_version': '1.0.3'
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

    def start_baas_did_corporate_agentcreate(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateResponse:
        """
        Description: 通过代理模式为企业创建did
        Summary: 通过代理模式为企业创建did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_corporate_agentcreate_ex(request, headers, runtime)

    async def start_baas_did_corporate_agentcreate_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateResponse:
        """
        Description: 通过代理模式为企业创建did
        Summary: 通过代理模式为企业创建did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_corporate_agentcreate_ex_async(request, headers, runtime)

    def start_baas_did_corporate_agentcreate_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateResponse:
        """
        Description: 通过代理模式为企业创建did
        Summary: 通过代理模式为企业创建did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateResponse(),
            self.do_request('1.0', 'baas.did.corporate.agentcreate.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_corporate_agentcreate_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateResponse:
        """
        Description: 通过代理模式为企业创建did
        Summary: 通过代理模式为企业创建did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateAgentcreateResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.agentcreate.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_person_agentcreate(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateResponse:
        """
        Description: 通过代理模式为个人创建did
        Summary: 通过代理模式为个人创建did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_person_agentcreate_ex(request, headers, runtime)

    async def start_baas_did_person_agentcreate_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateResponse:
        """
        Description: 通过代理模式为个人创建did
        Summary: 通过代理模式为个人创建did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_person_agentcreate_ex_async(request, headers, runtime)

    def start_baas_did_person_agentcreate_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateResponse:
        """
        Description: 通过代理模式为个人创建did
        Summary: 通过代理模式为个人创建did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateResponse(),
            self.do_request('1.0', 'baas.did.person.agentcreate.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_person_agentcreate_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateResponse:
        """
        Description: 通过代理模式为个人创建did
        Summary: 通过代理模式为个人创建did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidPersonAgentcreateResponse(),
            await self.do_request_async('1.0', 'baas.did.person.agentcreate.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_corporate_selfcreate(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateResponse:
        """
        Description: 直接创建自己的企业did
        Summary: 直接创建自己的企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_corporate_selfcreate_ex(request, headers, runtime)

    async def start_baas_did_corporate_selfcreate_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateResponse:
        """
        Description: 直接创建自己的企业did
        Summary: 直接创建自己的企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_corporate_selfcreate_ex_async(request, headers, runtime)

    def start_baas_did_corporate_selfcreate_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateResponse:
        """
        Description: 直接创建自己的企业did
        Summary: 直接创建自己的企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateResponse(),
            self.do_request('1.0', 'baas.did.corporate.selfcreate.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_corporate_selfcreate_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateResponse:
        """
        Description: 直接创建自己的企业did
        Summary: 直接创建自己的企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateSelfcreateResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.selfcreate.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_verifiableclaim_issure(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书
        Summary: 为指定did颁发证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_verifiableclaim_issure_ex(request, headers, runtime)

    async def start_baas_did_verifiableclaim_issure_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书
        Summary: 为指定did颁发证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_verifiableclaim_issure_ex_async(request, headers, runtime)

    def start_baas_did_verifiableclaim_issure_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书
        Summary: 为指定did颁发证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureResponse(),
            self.do_request('1.0', 'baas.did.verifiableclaim.issure.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_verifiableclaim_issure_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书
        Summary: 为指定did颁发证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimIssureResponse(),
            await self.do_request_async('1.0', 'baas.did.verifiableclaim.issure.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_verifiableclaim_verifier(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierResponse:
        """
        Description: 验证可验证声明
        Summary: 验证可验证声明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_verifiableclaim_verifier_ex(request, headers, runtime)

    async def start_baas_did_verifiableclaim_verifier_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierResponse:
        """
        Description: 验证可验证声明
        Summary: 验证可验证声明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_verifiableclaim_verifier_ex_async(request, headers, runtime)

    def start_baas_did_verifiableclaim_verifier_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierResponse:
        """
        Description: 验证可验证声明
        Summary: 验证可验证声明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierResponse(),
            self.do_request('1.0', 'baas.did.verifiableclaim.verifier.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_verifiableclaim_verifier_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierResponse:
        """
        Description: 验证可验证声明
        Summary: 验证可验证声明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVerifiableclaimVerifierResponse(),
            await self.do_request_async('1.0', 'baas.did.verifiableclaim.verifier.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_did_vc(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcResponse:
        """
        Description: 通过vcid查询vc内容
        Summary: 通过vcid查询vc内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_did_vc_ex(request, headers, runtime)

    async def query_baas_did_vc_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcResponse:
        """
        Description: 通过vcid查询vc内容
        Summary: 通过vcid查询vc内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_did_vc_ex_async(request, headers, runtime)

    def query_baas_did_vc_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcResponse:
        """
        Description: 通过vcid查询vc内容
        Summary: 通过vcid查询vc内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcResponse(),
            self.do_request('1.0', 'baas.did.vc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_did_vc_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcResponse:
        """
        Description: 通过vcid查询vc内容
        Summary: 通过vcid查询vc内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidVcResponse(),
            await self.do_request_async('1.0', 'baas.did.vc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_identification_faceauth(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthResponse:
        """
        Description: 开始实人认证
        Summary: 开始实人认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_identification_faceauth_ex(request, headers, runtime)

    async def start_baas_did_identification_faceauth_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthResponse:
        """
        Description: 开始实人认证
        Summary: 开始实人认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_identification_faceauth_ex_async(request, headers, runtime)

    def start_baas_did_identification_faceauth_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthResponse:
        """
        Description: 开始实人认证
        Summary: 开始实人认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthResponse(),
            self.do_request('1.0', 'baas.did.identification.faceauth.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_identification_faceauth_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthResponse:
        """
        Description: 开始实人认证
        Summary: 开始实人认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidIdentificationFaceauthResponse(),
            await self.do_request_async('1.0', 'baas.did.identification.faceauth.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_did_identification_faceauth(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_did_identification_faceauth_ex(request, headers, runtime)

    async def query_baas_did_identification_faceauth_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_did_identification_faceauth_ex_async(request, headers, runtime)

    def query_baas_did_identification_faceauth_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthResponse(),
            self.do_request('1.0', 'baas.did.identification.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_did_identification_faceauth_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidIdentificationFaceauthResponse(),
            await self.do_request_async('1.0', 'baas.did.identification.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_did_person_withthreemeta(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaResponse:
        """
        Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
        Summary: 通过个人三要素验证后创建个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_did_person_withthreemeta_ex(request, headers, runtime)

    async def create_baas_did_person_withthreemeta_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaResponse:
        """
        Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
        Summary: 通过个人三要素验证后创建个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_did_person_withthreemeta_ex_async(request, headers, runtime)

    def create_baas_did_person_withthreemeta_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaResponse:
        """
        Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
        Summary: 通过个人三要素验证后创建个人did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaResponse(),
            self.do_request('1.0', 'baas.did.person.withthreemeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_did_person_withthreemeta_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaResponse:
        """
        Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
        Summary: 通过个人三要素验证后创建个人did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWiththreemetaResponse(),
            await self.do_request_async('1.0', 'baas.did.person.withthreemeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_did_corporate_withthreemeta(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaResponse:
        """
        Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
        Summary: 通过企业三要素验证后创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_did_corporate_withthreemeta_ex(request, headers, runtime)

    async def create_baas_did_corporate_withthreemeta_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaResponse:
        """
        Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
        Summary: 通过企业三要素验证后创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_did_corporate_withthreemeta_ex_async(request, headers, runtime)

    def create_baas_did_corporate_withthreemeta_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaResponse:
        """
        Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
        Summary: 通过企业三要素验证后创建企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaResponse(),
            self.do_request('1.0', 'baas.did.corporate.withthreemeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_did_corporate_withthreemeta_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaResponse:
        """
        Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
        Summary: 通过企业三要素验证后创建企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWiththreemetaResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.withthreemeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_vcrepository_issue(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
        Summary: 指定did颁发证书，并存储
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_vcrepository_issue_ex(request, headers, runtime)

    async def start_baas_did_vcrepository_issue_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
        Summary: 指定did颁发证书，并存储
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_vcrepository_issue_ex_async(request, headers, runtime)

    def start_baas_did_vcrepository_issue_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
        Summary: 指定did颁发证书，并存储
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueResponse(),
            self.do_request('1.0', 'baas.did.vcrepository.issue.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_vcrepository_issue_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueResponse:
        """
        Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
        支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
        Summary: 指定did颁发证书，并存储
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidVcrepositoryIssueResponse(),
            await self.do_request_async('1.0', 'baas.did.vcrepository.issue.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_agent_servicetype(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeResponse:
        """
        Description: 注册自定义的服务类型，目前只有租户did可以调用
        Summary: 注册自定义服务类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_agent_servicetype_ex(request, headers, runtime)

    async def start_baas_did_agent_servicetype_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeResponse:
        """
        Description: 注册自定义的服务类型，目前只有租户did可以调用
        Summary: 注册自定义服务类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_agent_servicetype_ex_async(request, headers, runtime)

    def start_baas_did_agent_servicetype_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeResponse:
        """
        Description: 注册自定义的服务类型，目前只有租户did可以调用
        Summary: 注册自定义服务类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeResponse(),
            self.do_request('1.0', 'baas.did.agent.servicetype.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_agent_servicetype_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeResponse:
        """
        Description: 注册自定义的服务类型，目前只有租户did可以调用
        Summary: 注册自定义服务类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidAgentServicetypeResponse(),
            await self.do_request_async('1.0', 'baas.did.agent.servicetype.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_did_agent_servicetype(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeResponse:
        """
        Description: 查询指定服务类型的定义，不支持全量查询
        Summary: 查询指定服务类型的定义
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_did_agent_servicetype_ex(request, headers, runtime)

    async def query_baas_did_agent_servicetype_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeResponse:
        """
        Description: 查询指定服务类型的定义，不支持全量查询
        Summary: 查询指定服务类型的定义
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_did_agent_servicetype_ex_async(request, headers, runtime)

    def query_baas_did_agent_servicetype_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeResponse:
        """
        Description: 查询指定服务类型的定义，不支持全量查询
        Summary: 查询指定服务类型的定义
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeResponse(),
            self.do_request('1.0', 'baas.did.agent.servicetype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_did_agent_servicetype_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeResponse:
        """
        Description: 查询指定服务类型的定义，不支持全量查询
        Summary: 查询指定服务类型的定义
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidAgentServicetypeResponse(),
            await self.do_request_async('1.0', 'baas.did.agent.servicetype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baas_did_services(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesResponse:
        """
        Description: 代理模式下更新企业did doc中service中的字段
        Summary: 代理更新企业did中的services
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baas_did_services_ex(request, headers, runtime)

    async def update_baas_did_services_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesResponse:
        """
        Description: 代理模式下更新企业did doc中service中的字段
        Summary: 代理更新企业did中的services
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baas_did_services_ex_async(request, headers, runtime)

    def update_baas_did_services_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesResponse:
        """
        Description: 代理模式下更新企业did doc中service中的字段
        Summary: 代理更新企业did中的services
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesResponse(),
            self.do_request('1.0', 'baas.did.services.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baas_did_services_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesResponse:
        """
        Description: 代理模式下更新企业did doc中service中的字段
        Summary: 代理更新企业did中的services
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.UpdateBaasDidServicesResponse(),
            await self.do_request_async('1.0', 'baas.did.services.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_did_person_withtwometa(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaResponse:
        """
        Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
        Summary: 通过个人二要素验证后创建个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_did_person_withtwometa_ex(request, headers, runtime)

    async def create_baas_did_person_withtwometa_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaResponse:
        """
        Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
        Summary: 通过个人二要素验证后创建个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_did_person_withtwometa_ex_async(request, headers, runtime)

    def create_baas_did_person_withtwometa_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaResponse:
        """
        Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
        Summary: 通过个人二要素验证后创建个人did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaResponse(),
            self.do_request('1.0', 'baas.did.person.withtwometa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_did_person_withtwometa_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaResponse:
        """
        Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
        Summary: 通过个人二要素验证后创建个人did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithtwometaResponse(),
            await self.do_request_async('1.0', 'baas.did.person.withtwometa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_did_corporate_withtwometa(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaResponse:
        """
        Description: 通过企业二要素验证后创建企业did
        Summary: 通过企业二要素验证后创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_did_corporate_withtwometa_ex(request, headers, runtime)

    async def create_baas_did_corporate_withtwometa_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaResponse:
        """
        Description: 通过企业二要素验证后创建企业did
        Summary: 通过企业二要素验证后创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_did_corporate_withtwometa_ex_async(request, headers, runtime)

    def create_baas_did_corporate_withtwometa_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaResponse:
        """
        Description: 通过企业二要素验证后创建企业did
        Summary: 通过企业二要素验证后创建企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaResponse(),
            self.do_request('1.0', 'baas.did.corporate.withtwometa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_did_corporate_withtwometa_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaResponse:
        """
        Description: 通过企业二要素验证后创建企业did
        Summary: 通过企业二要素验证后创建企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithtwometaResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.withtwometa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_did_corporate_withfourmeta(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaResponse:
        """
        Description: 通过企业四要素验证后创建企业did
        Summary: 通过企业四要素验证后创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_did_corporate_withfourmeta_ex(request, headers, runtime)

    async def create_baas_did_corporate_withfourmeta_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaResponse:
        """
        Description: 通过企业四要素验证后创建企业did
        Summary: 通过企业四要素验证后创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_did_corporate_withfourmeta_ex_async(request, headers, runtime)

    def create_baas_did_corporate_withfourmeta_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaResponse:
        """
        Description: 通过企业四要素验证后创建企业did
        Summary: 通过企业四要素验证后创建企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaResponse(),
            self.do_request('1.0', 'baas.did.corporate.withfourmeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_did_corporate_withfourmeta_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaResponse:
        """
        Description: 通过企业四要素验证后创建企业did
        Summary: 通过企业四要素验证后创建企业did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidCorporateWithfourmetaResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.withfourmeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baas_did_person_withfourmeta(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaResponse:
        """
        Description: 通过个人四要素验证后创建个人did
        Summary: 通过个人四要素验证后创建个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baas_did_person_withfourmeta_ex(request, headers, runtime)

    async def create_baas_did_person_withfourmeta_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaResponse:
        """
        Description: 通过个人四要素验证后创建个人did
        Summary: 通过个人四要素验证后创建个人did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baas_did_person_withfourmeta_ex_async(request, headers, runtime)

    def create_baas_did_person_withfourmeta_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaResponse:
        """
        Description: 通过个人四要素验证后创建个人did
        Summary: 通过个人四要素验证后创建个人did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaResponse(),
            self.do_request('1.0', 'baas.did.person.withfourmeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baas_did_person_withfourmeta_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaResponse:
        """
        Description: 通过个人四要素验证后创建个人did
        Summary: 通过个人四要素验证后创建个人did
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.CreateBaasDidPersonWithfourmetaResponse(),
            await self.do_request_async('1.0', 'baas.did.person.withfourmeta.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_did_corporate_faceauth(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthResponse:
        """
        Description: 企业法人刷脸认证
        Summary: 企业法人刷脸认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_did_corporate_faceauth_ex(request, headers, runtime)

    async def start_baas_did_corporate_faceauth_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthResponse:
        """
        Description: 企业法人刷脸认证
        Summary: 企业法人刷脸认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_did_corporate_faceauth_ex_async(request, headers, runtime)

    def start_baas_did_corporate_faceauth_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthResponse:
        """
        Description: 企业法人刷脸认证
        Summary: 企业法人刷脸认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthResponse(),
            self.do_request('1.0', 'baas.did.corporate.faceauth.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_did_corporate_faceauth_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthResponse:
        """
        Description: 企业法人刷脸认证
        Summary: 企业法人刷脸认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.StartBaasDidCorporateFaceauthResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.faceauth.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_did_corporate_faceauth(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthResponse:
        """
        Description: 查询企业法人实人结果
        Summary: 查询企业法人实人结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_did_corporate_faceauth_ex(request, headers, runtime)

    async def query_baas_did_corporate_faceauth_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthRequest,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthResponse:
        """
        Description: 查询企业法人实人结果
        Summary: 查询企业法人实人结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_did_corporate_faceauth_ex_async(request, headers, runtime)

    def query_baas_did_corporate_faceauth_ex(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthResponse:
        """
        Description: 查询企业法人实人结果
        Summary: 查询企业法人实人结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthResponse(),
            self.do_request('1.0', 'baas.did.corporate.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_did_corporate_faceauth_ex_async(
        self,
        request: ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthResponse:
        """
        Description: 查询企业法人实人结果
        Summary: 查询企业法人实人结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__20ab_7e_4471e_24e_8fbfaa_7df_4ba_0613c_8_models.QueryBaasDidCorporateFaceauthResponse(),
            await self.do_request_async('1.0', 'baas.did.corporate.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
