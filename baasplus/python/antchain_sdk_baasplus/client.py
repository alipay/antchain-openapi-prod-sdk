# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_baasplus import models as baasplus_models
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
        config: baasplus_models.Config,
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
            # 区块信息
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
                    'sdk_version': '1.1.2'
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
            # 区块信息
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
                    'sdk_version': '1.1.2'
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

    def update_bmpbrowser_privilege(
        self,
        request: baasplus_models.UpdateBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.UpdateBmpbrowserPrivilegeResponse:
        """
        Description: 链上交易移动端权限修改
        Summary: 链上交易移动端权限修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_bmpbrowser_privilege_ex(request, headers, runtime)

    async def update_bmpbrowser_privilege_async(
        self,
        request: baasplus_models.UpdateBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.UpdateBmpbrowserPrivilegeResponse:
        """
        Description: 链上交易移动端权限修改
        Summary: 链上交易移动端权限修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_bmpbrowser_privilege_ex_async(request, headers, runtime)

    def update_bmpbrowser_privilege_ex(
        self,
        request: baasplus_models.UpdateBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateBmpbrowserPrivilegeResponse:
        """
        Description: 链上交易移动端权限修改
        Summary: 链上交易移动端权限修改
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBmpbrowserPrivilegeResponse().from_map(
            self.do_request('1.0', 'baas.plus.bmpbrowser.privilege.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_bmpbrowser_privilege_ex_async(
        self,
        request: baasplus_models.UpdateBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateBmpbrowserPrivilegeResponse:
        """
        Description: 链上交易移动端权限修改
        Summary: 链上交易移动端权限修改
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBmpbrowserPrivilegeResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.bmpbrowser.privilege.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_individualid_internalmask(
        self,
        request: baasplus_models.QueryIndividualidInternalmaskRequest,
    ) -> baasplus_models.QueryIndividualidInternalmaskResponse:
        """
        Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
        Summary: 个人脱敏信息身份核验（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_individualid_internalmask_ex(request, headers, runtime)

    async def query_individualid_internalmask_async(
        self,
        request: baasplus_models.QueryIndividualidInternalmaskRequest,
    ) -> baasplus_models.QueryIndividualidInternalmaskResponse:
        """
        Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
        Summary: 个人脱敏信息身份核验（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_individualid_internalmask_ex_async(request, headers, runtime)

    def query_individualid_internalmask_ex(
        self,
        request: baasplus_models.QueryIndividualidInternalmaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternalmaskResponse:
        """
        Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
        Summary: 个人脱敏信息身份核验（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternalmaskResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.internalmask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_individualid_internalmask_ex_async(
        self,
        request: baasplus_models.QueryIndividualidInternalmaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternalmaskResponse:
        """
        Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
        Summary: 个人脱敏信息身份核验（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternalmaskResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.internalmask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterpriseid_internalfourmeta(
        self,
        request: baasplus_models.QueryEnterpriseidInternalfourmetaRequest,
    ) -> baasplus_models.QueryEnterpriseidInternalfourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterpriseid_internalfourmeta_ex(request, headers, runtime)

    async def query_enterpriseid_internalfourmeta_async(
        self,
        request: baasplus_models.QueryEnterpriseidInternalfourmetaRequest,
    ) -> baasplus_models.QueryEnterpriseidInternalfourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterpriseid_internalfourmeta_ex_async(request, headers, runtime)

    def query_enterpriseid_internalfourmeta_ex(
        self,
        request: baasplus_models.QueryEnterpriseidInternalfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidInternalfourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidInternalfourmetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.internalfourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterpriseid_internalfourmeta_ex_async(
        self,
        request: baasplus_models.QueryEnterpriseidInternalfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidInternalfourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidInternalfourmetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.internalfourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterpriseid_internalthreemeta(
        self,
        request: baasplus_models.QueryEnterpriseidInternalthreemetaRequest,
    ) -> baasplus_models.QueryEnterpriseidInternalthreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterpriseid_internalthreemeta_ex(request, headers, runtime)

    async def query_enterpriseid_internalthreemeta_async(
        self,
        request: baasplus_models.QueryEnterpriseidInternalthreemetaRequest,
    ) -> baasplus_models.QueryEnterpriseidInternalthreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterpriseid_internalthreemeta_ex_async(request, headers, runtime)

    def query_enterpriseid_internalthreemeta_ex(
        self,
        request: baasplus_models.QueryEnterpriseidInternalthreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidInternalthreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidInternalthreemetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.internalthreemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterpriseid_internalthreemeta_ex_async(
        self,
        request: baasplus_models.QueryEnterpriseidInternalthreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidInternalthreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidInternalthreemetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.internalthreemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterpriseid_internaltwometa(
        self,
        request: baasplus_models.QueryEnterpriseidInternaltwometaRequest,
    ) -> baasplus_models.QueryEnterpriseidInternaltwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterpriseid_internaltwometa_ex(request, headers, runtime)

    async def query_enterpriseid_internaltwometa_async(
        self,
        request: baasplus_models.QueryEnterpriseidInternaltwometaRequest,
    ) -> baasplus_models.QueryEnterpriseidInternaltwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterpriseid_internaltwometa_ex_async(request, headers, runtime)

    def query_enterpriseid_internaltwometa_ex(
        self,
        request: baasplus_models.QueryEnterpriseidInternaltwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidInternaltwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidInternaltwometaResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.internaltwometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterpriseid_internaltwometa_ex_async(
        self,
        request: baasplus_models.QueryEnterpriseidInternaltwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidInternaltwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidInternaltwometaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.internaltwometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_enterpriseid_faceauth(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthRequest,
    ) -> baasplus_models.InitEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_enterpriseid_faceauth_ex(request, headers, runtime)

    async def init_enterpriseid_faceauth_async(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthRequest,
    ) -> baasplus_models.InitEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_enterpriseid_faceauth_ex_async(request, headers, runtime)

    def init_enterpriseid_faceauth_ex(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitEnterpriseidFaceauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_enterpriseid_faceauth_ex_async(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitEnterpriseidFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterpriseid_faceauth(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthRequest,
    ) -> baasplus_models.QueryEnterpriseidFaceauthResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterpriseid_faceauth_ex(request, headers, runtime)

    async def query_enterpriseid_faceauth_async(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthRequest,
    ) -> baasplus_models.QueryEnterpriseidFaceauthResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterpriseid_faceauth_ex_async(request, headers, runtime)

    def query_enterpriseid_faceauth_ex(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidFaceauthResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidFaceauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterpriseid_faceauth_ex_async(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidFaceauthResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_individualid_internalfourmeta(
        self,
        request: baasplus_models.QueryIndividualidInternalfourmetaRequest,
    ) -> baasplus_models.QueryIndividualidInternalfourmetaResponse:
        """
        Description: 个人实名认证四要素
        Summary: 个人实名认证四要素（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_individualid_internalfourmeta_ex(request, headers, runtime)

    async def query_individualid_internalfourmeta_async(
        self,
        request: baasplus_models.QueryIndividualidInternalfourmetaRequest,
    ) -> baasplus_models.QueryIndividualidInternalfourmetaResponse:
        """
        Description: 个人实名认证四要素
        Summary: 个人实名认证四要素（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_individualid_internalfourmeta_ex_async(request, headers, runtime)

    def query_individualid_internalfourmeta_ex(
        self,
        request: baasplus_models.QueryIndividualidInternalfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternalfourmetaResponse:
        """
        Description: 个人实名认证四要素
        Summary: 个人实名认证四要素（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternalfourmetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.internalfourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_individualid_internalfourmeta_ex_async(
        self,
        request: baasplus_models.QueryIndividualidInternalfourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternalfourmetaResponse:
        """
        Description: 个人实名认证四要素
        Summary: 个人实名认证四要素（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternalfourmetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.internalfourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_individualid_internalthreemeta(
        self,
        request: baasplus_models.QueryIndividualidInternalthreemetaRequest,
    ) -> baasplus_models.QueryIndividualidInternalthreemetaResponse:
        """
        Description: 个人实名认证三要素
        Summary: 个人实名认证三要素（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_individualid_internalthreemeta_ex(request, headers, runtime)

    async def query_individualid_internalthreemeta_async(
        self,
        request: baasplus_models.QueryIndividualidInternalthreemetaRequest,
    ) -> baasplus_models.QueryIndividualidInternalthreemetaResponse:
        """
        Description: 个人实名认证三要素
        Summary: 个人实名认证三要素（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_individualid_internalthreemeta_ex_async(request, headers, runtime)

    def query_individualid_internalthreemeta_ex(
        self,
        request: baasplus_models.QueryIndividualidInternalthreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternalthreemetaResponse:
        """
        Description: 个人实名认证三要素
        Summary: 个人实名认证三要素（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternalthreemetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.internalthreemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_individualid_internalthreemeta_ex_async(
        self,
        request: baasplus_models.QueryIndividualidInternalthreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternalthreemetaResponse:
        """
        Description: 个人实名认证三要素
        Summary: 个人实名认证三要素（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternalthreemetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.internalthreemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_individualid_internaltwometa(
        self,
        request: baasplus_models.QueryIndividualidInternaltwometaRequest,
    ) -> baasplus_models.QueryIndividualidInternaltwometaResponse:
        """
        Description: 个人实名认证二要素
        Summary: 个人实名认证二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_individualid_internaltwometa_ex(request, headers, runtime)

    async def query_individualid_internaltwometa_async(
        self,
        request: baasplus_models.QueryIndividualidInternaltwometaRequest,
    ) -> baasplus_models.QueryIndividualidInternaltwometaResponse:
        """
        Description: 个人实名认证二要素
        Summary: 个人实名认证二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_individualid_internaltwometa_ex_async(request, headers, runtime)

    def query_individualid_internaltwometa_ex(
        self,
        request: baasplus_models.QueryIndividualidInternaltwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternaltwometaResponse:
        """
        Description: 个人实名认证二要素
        Summary: 个人实名认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternaltwometaResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.internaltwometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_individualid_internaltwometa_ex_async(
        self,
        request: baasplus_models.QueryIndividualidInternaltwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidInternaltwometaResponse:
        """
        Description: 个人实名认证二要素
        Summary: 个人实名认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidInternaltwometaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.internaltwometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baicorp_internalevaluationasync(
        self,
        request: baasplus_models.CreateBaicorpInternalevaluationasyncRequest,
    ) -> baasplus_models.CreateBaicorpInternalevaluationasyncResponse:
        """
        Description: 发起内容评估（BAI），仅内部调用
        Summary: 发起内容评估
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baicorp_internalevaluationasync_ex(request, headers, runtime)

    async def create_baicorp_internalevaluationasync_async(
        self,
        request: baasplus_models.CreateBaicorpInternalevaluationasyncRequest,
    ) -> baasplus_models.CreateBaicorpInternalevaluationasyncResponse:
        """
        Description: 发起内容评估（BAI），仅内部调用
        Summary: 发起内容评估
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baicorp_internalevaluationasync_ex_async(request, headers, runtime)

    def create_baicorp_internalevaluationasync_ex(
        self,
        request: baasplus_models.CreateBaicorpInternalevaluationasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CreateBaicorpInternalevaluationasyncResponse:
        """
        Description: 发起内容评估（BAI），仅内部调用
        Summary: 发起内容评估
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaicorpInternalevaluationasyncResponse().from_map(
            self.do_request('1.0', 'baas.plus.baicorp.internalevaluationasync.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baicorp_internalevaluationasync_ex_async(
        self,
        request: baasplus_models.CreateBaicorpInternalevaluationasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CreateBaicorpInternalevaluationasyncResponse:
        """
        Description: 发起内容评估（BAI），仅内部调用
        Summary: 发起内容评估
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaicorpInternalevaluationasyncResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.baicorp.internalevaluationasync.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_baicorp_internalmonitorasync(
        self,
        request: baasplus_models.CreateBaicorpInternalmonitorasyncRequest,
    ) -> baasplus_models.CreateBaicorpInternalmonitorasyncResponse:
        """
        Description: 提交内容监测任务
        Summary: 提交内容监测任务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_baicorp_internalmonitorasync_ex(request, headers, runtime)

    async def create_baicorp_internalmonitorasync_async(
        self,
        request: baasplus_models.CreateBaicorpInternalmonitorasyncRequest,
    ) -> baasplus_models.CreateBaicorpInternalmonitorasyncResponse:
        """
        Description: 提交内容监测任务
        Summary: 提交内容监测任务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_baicorp_internalmonitorasync_ex_async(request, headers, runtime)

    def create_baicorp_internalmonitorasync_ex(
        self,
        request: baasplus_models.CreateBaicorpInternalmonitorasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CreateBaicorpInternalmonitorasyncResponse:
        """
        Description: 提交内容监测任务
        Summary: 提交内容监测任务接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaicorpInternalmonitorasyncResponse().from_map(
            self.do_request('1.0', 'baas.plus.baicorp.internalmonitorasync.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_baicorp_internalmonitorasync_ex_async(
        self,
        request: baasplus_models.CreateBaicorpInternalmonitorasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CreateBaicorpInternalmonitorasyncResponse:
        """
        Description: 提交内容监测任务
        Summary: 提交内容监测任务接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaicorpInternalmonitorasyncResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.baicorp.internalmonitorasync.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baicorp_internalevaluationasync(
        self,
        request: baasplus_models.QueryBaicorpInternalevaluationasyncRequest,
    ) -> baasplus_models.QueryBaicorpInternalevaluationasyncResponse:
        """
        Description: 查询内容评估结果
        Summary: 查询内容评估结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baicorp_internalevaluationasync_ex(request, headers, runtime)

    async def query_baicorp_internalevaluationasync_async(
        self,
        request: baasplus_models.QueryBaicorpInternalevaluationasyncRequest,
    ) -> baasplus_models.QueryBaicorpInternalevaluationasyncResponse:
        """
        Description: 查询内容评估结果
        Summary: 查询内容评估结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baicorp_internalevaluationasync_ex_async(request, headers, runtime)

    def query_baicorp_internalevaluationasync_ex(
        self,
        request: baasplus_models.QueryBaicorpInternalevaluationasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBaicorpInternalevaluationasyncResponse:
        """
        Description: 查询内容评估结果
        Summary: 查询内容评估结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaicorpInternalevaluationasyncResponse().from_map(
            self.do_request('1.0', 'baas.plus.baicorp.internalevaluationasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baicorp_internalevaluationasync_ex_async(
        self,
        request: baasplus_models.QueryBaicorpInternalevaluationasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBaicorpInternalevaluationasyncResponse:
        """
        Description: 查询内容评估结果
        Summary: 查询内容评估结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaicorpInternalevaluationasyncResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.baicorp.internalevaluationasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baicorp_internalmonitorasync(
        self,
        request: baasplus_models.QueryBaicorpInternalmonitorasyncRequest,
    ) -> baasplus_models.QueryBaicorpInternalmonitorasyncResponse:
        """
        Description: 查询内容监测任务结果
        Summary: 查询内容监测任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baicorp_internalmonitorasync_ex(request, headers, runtime)

    async def query_baicorp_internalmonitorasync_async(
        self,
        request: baasplus_models.QueryBaicorpInternalmonitorasyncRequest,
    ) -> baasplus_models.QueryBaicorpInternalmonitorasyncResponse:
        """
        Description: 查询内容监测任务结果
        Summary: 查询内容监测任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baicorp_internalmonitorasync_ex_async(request, headers, runtime)

    def query_baicorp_internalmonitorasync_ex(
        self,
        request: baasplus_models.QueryBaicorpInternalmonitorasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBaicorpInternalmonitorasyncResponse:
        """
        Description: 查询内容监测任务结果
        Summary: 查询内容监测任务结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaicorpInternalmonitorasyncResponse().from_map(
            self.do_request('1.0', 'baas.plus.baicorp.internalmonitorasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baicorp_internalmonitorasync_ex_async(
        self,
        request: baasplus_models.QueryBaicorpInternalmonitorasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBaicorpInternalmonitorasyncResponse:
        """
        Description: 查询内容监测任务结果
        Summary: 查询内容监测任务结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaicorpInternalmonitorasyncResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.baicorp.internalmonitorasync.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_enterpriseid_faceauth(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthRequest,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_enterpriseid_faceauth_ex(request, headers, runtime)

    async def certify_enterpriseid_faceauth_async(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthRequest,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_enterpriseid_faceauth_ex_async(request, headers, runtime)

    def certify_enterpriseid_faceauth_ex(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyEnterpriseidFaceauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_enterpriseid_faceauth_ex_async(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyEnterpriseidFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_individualid_faceauth(
        self,
        request: baasplus_models.InitIndividualidFaceauthRequest,
    ) -> baasplus_models.InitIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_individualid_faceauth_ex(request, headers, runtime)

    async def init_individualid_faceauth_async(
        self,
        request: baasplus_models.InitIndividualidFaceauthRequest,
    ) -> baasplus_models.InitIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_individualid_faceauth_ex_async(request, headers, runtime)

    def init_individualid_faceauth_ex(
        self,
        request: baasplus_models.InitIndividualidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitIndividualidFaceauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_individualid_faceauth_ex_async(
        self,
        request: baasplus_models.InitIndividualidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitIndividualidFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_individualid_faceauth(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthRequest,
    ) -> baasplus_models.CertifyIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_individualid_faceauth_ex(request, headers, runtime)

    async def certify_individualid_faceauth_async(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthRequest,
    ) -> baasplus_models.CertifyIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_individualid_faceauth_ex_async(request, headers, runtime)

    def certify_individualid_faceauth_ex(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyIndividualidFaceauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_individualid_faceauth_ex_async(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyIndividualidFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_individualid_faceauth(
        self,
        request: baasplus_models.QueryIndividualidFaceauthRequest,
    ) -> baasplus_models.QueryIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_individualid_faceauth_ex(request, headers, runtime)

    async def query_individualid_faceauth_async(
        self,
        request: baasplus_models.QueryIndividualidFaceauthRequest,
    ) -> baasplus_models.QueryIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_individualid_faceauth_ex_async(request, headers, runtime)

    def query_individualid_faceauth_ex(
        self,
        request: baasplus_models.QueryIndividualidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidFaceauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_individualid_faceauth_ex_async(
        self,
        request: baasplus_models.QueryIndividualidFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidFaceauthResponse:
        """
        Description: 个人实人刷脸认证——查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dataservice_blockchainheight(
        self,
        request: baasplus_models.GetDataserviceBlockchainheightRequest,
    ) -> baasplus_models.GetDataserviceBlockchainheightResponse:
        """
        Description: 获取区块链当前块高
        Summary: 区块链数据服务-获取区块链当前块高
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dataservice_blockchainheight_ex(request, headers, runtime)

    async def get_dataservice_blockchainheight_async(
        self,
        request: baasplus_models.GetDataserviceBlockchainheightRequest,
    ) -> baasplus_models.GetDataserviceBlockchainheightResponse:
        """
        Description: 获取区块链当前块高
        Summary: 区块链数据服务-获取区块链当前块高
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dataservice_blockchainheight_ex_async(request, headers, runtime)

    def get_dataservice_blockchainheight_ex(
        self,
        request: baasplus_models.GetDataserviceBlockchainheightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetDataserviceBlockchainheightResponse:
        """
        Description: 获取区块链当前块高
        Summary: 区块链数据服务-获取区块链当前块高
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetDataserviceBlockchainheightResponse().from_map(
            self.do_request('1.0', 'baas.plus.dataservice.blockchainheight.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dataservice_blockchainheight_ex_async(
        self,
        request: baasplus_models.GetDataserviceBlockchainheightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetDataserviceBlockchainheightResponse:
        """
        Description: 获取区块链当前块高
        Summary: 区块链数据服务-获取区块链当前块高
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetDataserviceBlockchainheightResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.dataservice.blockchainheight.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dataservice_transactioncount(
        self,
        request: baasplus_models.GetDataserviceTransactioncountRequest,
    ) -> baasplus_models.GetDataserviceTransactioncountResponse:
        """
        Description: 获取链交易总数
        Summary: 区块链数据服务-获取链交易总数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dataservice_transactioncount_ex(request, headers, runtime)

    async def get_dataservice_transactioncount_async(
        self,
        request: baasplus_models.GetDataserviceTransactioncountRequest,
    ) -> baasplus_models.GetDataserviceTransactioncountResponse:
        """
        Description: 获取链交易总数
        Summary: 区块链数据服务-获取链交易总数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dataservice_transactioncount_ex_async(request, headers, runtime)

    def get_dataservice_transactioncount_ex(
        self,
        request: baasplus_models.GetDataserviceTransactioncountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetDataserviceTransactioncountResponse:
        """
        Description: 获取链交易总数
        Summary: 区块链数据服务-获取链交易总数
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetDataserviceTransactioncountResponse().from_map(
            self.do_request('1.0', 'baas.plus.dataservice.transactioncount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dataservice_transactioncount_ex_async(
        self,
        request: baasplus_models.GetDataserviceTransactioncountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetDataserviceTransactioncountResponse:
        """
        Description: 获取链交易总数
        Summary: 区块链数据服务-获取链交易总数
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetDataserviceTransactioncountResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.dataservice.transactioncount.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dataservice_transactioninfo(
        self,
        request: baasplus_models.GetDataserviceTransactioninfoRequest,
    ) -> baasplus_models.GetDataserviceTransactioninfoResponse:
        """
        Description: 根据交易hash获取交易详情
        Summary: 区块链数据服务-获取交易详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dataservice_transactioninfo_ex(request, headers, runtime)

    async def get_dataservice_transactioninfo_async(
        self,
        request: baasplus_models.GetDataserviceTransactioninfoRequest,
    ) -> baasplus_models.GetDataserviceTransactioninfoResponse:
        """
        Description: 根据交易hash获取交易详情
        Summary: 区块链数据服务-获取交易详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dataservice_transactioninfo_ex_async(request, headers, runtime)

    def get_dataservice_transactioninfo_ex(
        self,
        request: baasplus_models.GetDataserviceTransactioninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetDataserviceTransactioninfoResponse:
        """
        Description: 根据交易hash获取交易详情
        Summary: 区块链数据服务-获取交易详情
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetDataserviceTransactioninfoResponse().from_map(
            self.do_request('1.0', 'baas.plus.dataservice.transactioninfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dataservice_transactioninfo_ex_async(
        self,
        request: baasplus_models.GetDataserviceTransactioninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetDataserviceTransactioninfoResponse:
        """
        Description: 根据交易hash获取交易详情
        Summary: 区块链数据服务-获取交易详情
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetDataserviceTransactioninfoResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.dataservice.transactioninfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dataservice_lastblocks(
        self,
        request: baasplus_models.ListDataserviceLastblocksRequest,
    ) -> baasplus_models.ListDataserviceLastblocksResponse:
        """
        Description: 获取链最近n条块信息
        Summary: 区块链数据服务-获取链最近n条块信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dataservice_lastblocks_ex(request, headers, runtime)

    async def list_dataservice_lastblocks_async(
        self,
        request: baasplus_models.ListDataserviceLastblocksRequest,
    ) -> baasplus_models.ListDataserviceLastblocksResponse:
        """
        Description: 获取链最近n条块信息
        Summary: 区块链数据服务-获取链最近n条块信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dataservice_lastblocks_ex_async(request, headers, runtime)

    def list_dataservice_lastblocks_ex(
        self,
        request: baasplus_models.ListDataserviceLastblocksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.ListDataserviceLastblocksResponse:
        """
        Description: 获取链最近n条块信息
        Summary: 区块链数据服务-获取链最近n条块信息
        """
        UtilClient.validate_model(request)
        return baasplus_models.ListDataserviceLastblocksResponse().from_map(
            self.do_request('1.0', 'baas.plus.dataservice.lastblocks.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dataservice_lastblocks_ex_async(
        self,
        request: baasplus_models.ListDataserviceLastblocksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.ListDataserviceLastblocksResponse:
        """
        Description: 获取链最近n条块信息
        Summary: 区块链数据服务-获取链最近n条块信息
        """
        UtilClient.validate_model(request)
        return baasplus_models.ListDataserviceLastblocksResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.dataservice.lastblocks.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tas_attestation(
        self,
        request: baasplus_models.GetTasAttestationRequest,
    ) -> baasplus_models.GetTasAttestationResponse:
        """
        Description: 可信时间服务——获取时间凭证
        Summary: 可信时间凭证服务-获取时间凭证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tas_attestation_ex(request, headers, runtime)

    async def get_tas_attestation_async(
        self,
        request: baasplus_models.GetTasAttestationRequest,
    ) -> baasplus_models.GetTasAttestationResponse:
        """
        Description: 可信时间服务——获取时间凭证
        Summary: 可信时间凭证服务-获取时间凭证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tas_attestation_ex_async(request, headers, runtime)

    def get_tas_attestation_ex(
        self,
        request: baasplus_models.GetTasAttestationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetTasAttestationResponse:
        """
        Description: 可信时间服务——获取时间凭证
        Summary: 可信时间凭证服务-获取时间凭证
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetTasAttestationResponse().from_map(
            self.do_request('1.0', 'baas.plus.tas.attestation.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tas_attestation_ex_async(
        self,
        request: baasplus_models.GetTasAttestationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetTasAttestationResponse:
        """
        Description: 可信时间服务——获取时间凭证
        Summary: 可信时间凭证服务-获取时间凭证
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetTasAttestationResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.tas.attestation.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_tas_ctsr(
        self,
        request: baasplus_models.VerifyTasCtsrRequest,
    ) -> baasplus_models.VerifyTasCtsrResponse:
        """
        Description: 可信时间 ——校验时间凭证接口
        Summary: 可信时间凭证服务-校验时间凭证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_tas_ctsr_ex(request, headers, runtime)

    async def verify_tas_ctsr_async(
        self,
        request: baasplus_models.VerifyTasCtsrRequest,
    ) -> baasplus_models.VerifyTasCtsrResponse:
        """
        Description: 可信时间 ——校验时间凭证接口
        Summary: 可信时间凭证服务-校验时间凭证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_tas_ctsr_ex_async(request, headers, runtime)

    def verify_tas_ctsr_ex(
        self,
        request: baasplus_models.VerifyTasCtsrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.VerifyTasCtsrResponse:
        """
        Description: 可信时间 ——校验时间凭证接口
        Summary: 可信时间凭证服务-校验时间凭证接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.VerifyTasCtsrResponse().from_map(
            self.do_request('1.0', 'baas.plus.tas.ctsr.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_tas_ctsr_ex_async(
        self,
        request: baasplus_models.VerifyTasCtsrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.VerifyTasCtsrResponse:
        """
        Description: 可信时间 ——校验时间凭证接口
        Summary: 可信时间凭证服务-校验时间凭证接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.VerifyTasCtsrResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.tas.ctsr.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tas_certificate(
        self,
        request: baasplus_models.GetTasCertificateRequest,
    ) -> baasplus_models.GetTasCertificateResponse:
        """
        Description: 通过sn下载时间凭证证书（pdf格式）
        Summary: 可信时间凭证服务-下载时间凭证证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tas_certificate_ex(request, headers, runtime)

    async def get_tas_certificate_async(
        self,
        request: baasplus_models.GetTasCertificateRequest,
    ) -> baasplus_models.GetTasCertificateResponse:
        """
        Description: 通过sn下载时间凭证证书（pdf格式）
        Summary: 可信时间凭证服务-下载时间凭证证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tas_certificate_ex_async(request, headers, runtime)

    def get_tas_certificate_ex(
        self,
        request: baasplus_models.GetTasCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetTasCertificateResponse:
        """
        Description: 通过sn下载时间凭证证书（pdf格式）
        Summary: 可信时间凭证服务-下载时间凭证证书
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetTasCertificateResponse().from_map(
            self.do_request('1.0', 'baas.plus.tas.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tas_certificate_ex_async(
        self,
        request: baasplus_models.GetTasCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetTasCertificateResponse:
        """
        Description: 通过sn下载时间凭证证书（pdf格式）
        Summary: 可信时间凭证服务-下载时间凭证证书
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetTasCertificateResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.tas.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tas_transactionattestation(
        self,
        request: baasplus_models.GetTasTransactionattestationRequest,
    ) -> baasplus_models.GetTasTransactionattestationResponse:
        """
        Description: 可信时间——获取带事务的时间凭证
        Summary: 可信时间——获取带事务的时间凭证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tas_transactionattestation_ex(request, headers, runtime)

    async def get_tas_transactionattestation_async(
        self,
        request: baasplus_models.GetTasTransactionattestationRequest,
    ) -> baasplus_models.GetTasTransactionattestationResponse:
        """
        Description: 可信时间——获取带事务的时间凭证
        Summary: 可信时间——获取带事务的时间凭证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tas_transactionattestation_ex_async(request, headers, runtime)

    def get_tas_transactionattestation_ex(
        self,
        request: baasplus_models.GetTasTransactionattestationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetTasTransactionattestationResponse:
        """
        Description: 可信时间——获取带事务的时间凭证
        Summary: 可信时间——获取带事务的时间凭证
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetTasTransactionattestationResponse().from_map(
            self.do_request('1.0', 'baas.plus.tas.transactionattestation.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tas_transactionattestation_ex_async(
        self,
        request: baasplus_models.GetTasTransactionattestationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.GetTasTransactionattestationResponse:
        """
        Description: 可信时间——获取带事务的时间凭证
        Summary: 可信时间——获取带事务的时间凭证
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetTasTransactionattestationResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.tas.transactionattestation.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_everify_fourmeta(
        self,
        request: baasplus_models.QueryEverifyFourmetaRequest,
    ) -> baasplus_models.QueryEverifyFourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_everify_fourmeta_ex(request, headers, runtime)

    async def query_everify_fourmeta_async(
        self,
        request: baasplus_models.QueryEverifyFourmetaRequest,
    ) -> baasplus_models.QueryEverifyFourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_everify_fourmeta_ex_async(request, headers, runtime)

    def query_everify_fourmeta_ex(
        self,
        request: baasplus_models.QueryEverifyFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyFourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyFourmetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.everify.fourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_everify_fourmeta_ex_async(
        self,
        request: baasplus_models.QueryEverifyFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyFourmetaResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyFourmetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.everify.fourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_everify_threemeta(
        self,
        request: baasplus_models.QueryEverifyThreemetaRequest,
    ) -> baasplus_models.QueryEverifyThreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_everify_threemeta_ex(request, headers, runtime)

    async def query_everify_threemeta_async(
        self,
        request: baasplus_models.QueryEverifyThreemetaRequest,
    ) -> baasplus_models.QueryEverifyThreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_everify_threemeta_ex_async(request, headers, runtime)

    def query_everify_threemeta_ex(
        self,
        request: baasplus_models.QueryEverifyThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyThreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyThreemetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.everify.threemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_everify_threemeta_ex_async(
        self,
        request: baasplus_models.QueryEverifyThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyThreemetaResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyThreemetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.everify.threemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_everify_twometa(
        self,
        request: baasplus_models.QueryEverifyTwometaRequest,
    ) -> baasplus_models.QueryEverifyTwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_everify_twometa_ex(request, headers, runtime)

    async def query_everify_twometa_async(
        self,
        request: baasplus_models.QueryEverifyTwometaRequest,
    ) -> baasplus_models.QueryEverifyTwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_everify_twometa_ex_async(request, headers, runtime)

    def query_everify_twometa_ex(
        self,
        request: baasplus_models.QueryEverifyTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyTwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyTwometaResponse().from_map(
            self.do_request('1.0', 'baas.plus.everify.twometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_everify_twometa_ex_async(
        self,
        request: baasplus_models.QueryEverifyTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyTwometaResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyTwometaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.everify.twometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baicorp_internalsearchlibrary(
        self,
        request: baasplus_models.QueryBaicorpInternalsearchlibraryRequest,
    ) -> baasplus_models.QueryBaicorpInternalsearchlibraryResponse:
        """
        Description: 内容搜索查询接口
        Summary: 内容搜索查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baicorp_internalsearchlibrary_ex(request, headers, runtime)

    async def query_baicorp_internalsearchlibrary_async(
        self,
        request: baasplus_models.QueryBaicorpInternalsearchlibraryRequest,
    ) -> baasplus_models.QueryBaicorpInternalsearchlibraryResponse:
        """
        Description: 内容搜索查询接口
        Summary: 内容搜索查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baicorp_internalsearchlibrary_ex_async(request, headers, runtime)

    def query_baicorp_internalsearchlibrary_ex(
        self,
        request: baasplus_models.QueryBaicorpInternalsearchlibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBaicorpInternalsearchlibraryResponse:
        """
        Description: 内容搜索查询接口
        Summary: 内容搜索查询接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaicorpInternalsearchlibraryResponse().from_map(
            self.do_request('1.0', 'baas.plus.baicorp.internalsearchlibrary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baicorp_internalsearchlibrary_ex_async(
        self,
        request: baasplus_models.QueryBaicorpInternalsearchlibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBaicorpInternalsearchlibraryResponse:
        """
        Description: 内容搜索查询接口
        Summary: 内容搜索查询接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaicorpInternalsearchlibraryResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.baicorp.internalsearchlibrary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baicorp_internalsearchlibrary(
        self,
        request: baasplus_models.UpdateBaicorpInternalsearchlibraryRequest,
    ) -> baasplus_models.UpdateBaicorpInternalsearchlibraryResponse:
        """
        Description: 更新检索
        Summary: 更新检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baicorp_internalsearchlibrary_ex(request, headers, runtime)

    async def update_baicorp_internalsearchlibrary_async(
        self,
        request: baasplus_models.UpdateBaicorpInternalsearchlibraryRequest,
    ) -> baasplus_models.UpdateBaicorpInternalsearchlibraryResponse:
        """
        Description: 更新检索
        Summary: 更新检索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baicorp_internalsearchlibrary_ex_async(request, headers, runtime)

    def update_baicorp_internalsearchlibrary_ex(
        self,
        request: baasplus_models.UpdateBaicorpInternalsearchlibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateBaicorpInternalsearchlibraryResponse:
        """
        Description: 更新检索
        Summary: 更新检索
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBaicorpInternalsearchlibraryResponse().from_map(
            self.do_request('1.0', 'baas.plus.baicorp.internalsearchlibrary.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baicorp_internalsearchlibrary_ex_async(
        self,
        request: baasplus_models.UpdateBaicorpInternalsearchlibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateBaicorpInternalsearchlibraryResponse:
        """
        Description: 更新检索
        Summary: 更新检索
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBaicorpInternalsearchlibraryResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.baicorp.internalsearchlibrary.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_epayauth_rootbank(
        self,
        request: baasplus_models.QueryEpayauthRootbankRequest,
    ) -> baasplus_models.QueryEpayauthRootbankResponse:
        """
        Description: 对公打款-总行查询
        Summary: 对公打款-总行查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_epayauth_rootbank_ex(request, headers, runtime)

    async def query_epayauth_rootbank_async(
        self,
        request: baasplus_models.QueryEpayauthRootbankRequest,
    ) -> baasplus_models.QueryEpayauthRootbankResponse:
        """
        Description: 对公打款-总行查询
        Summary: 对公打款-总行查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_epayauth_rootbank_ex_async(request, headers, runtime)

    def query_epayauth_rootbank_ex(
        self,
        request: baasplus_models.QueryEpayauthRootbankRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthRootbankResponse:
        """
        Description: 对公打款-总行查询
        Summary: 对公打款-总行查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthRootbankResponse().from_map(
            self.do_request('1.0', 'baas.plus.epayauth.rootbank.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_epayauth_rootbank_ex_async(
        self,
        request: baasplus_models.QueryEpayauthRootbankRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthRootbankResponse:
        """
        Description: 对公打款-总行查询
        Summary: 对公打款-总行查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthRootbankResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.epayauth.rootbank.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydapplyprot_ecapply(
        self,
        request: baasplus_models.QueryYdapplyprotEcapplyRequest,
    ) -> baasplus_models.QueryYdapplyprotEcapplyResponse:
        """
        Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
        Summary: 业务申请保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydapplyprot_ecapply_ex(request, headers, runtime)

    async def query_ydapplyprot_ecapply_async(
        self,
        request: baasplus_models.QueryYdapplyprotEcapplyRequest,
    ) -> baasplus_models.QueryYdapplyprotEcapplyResponse:
        """
        Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
        Summary: 业务申请保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydapplyprot_ecapply_ex_async(request, headers, runtime)

    def query_ydapplyprot_ecapply_ex(
        self,
        request: baasplus_models.QueryYdapplyprotEcapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdapplyprotEcapplyResponse:
        """
        Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
        Summary: 业务申请保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdapplyprotEcapplyResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydapplyprot.ecapply.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydapplyprot_ecapply_ex_async(
        self,
        request: baasplus_models.QueryYdapplyprotEcapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdapplyprotEcapplyResponse:
        """
        Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
        Summary: 业务申请保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdapplyprotEcapplyResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydapplyprot.ecapply.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydpacprot_ecpac(
        self,
        request: baasplus_models.QueryYdpacprotEcpacRequest,
    ) -> baasplus_models.QueryYdpacprotEcpacResponse:
        """
        Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
        Summary: 先享后付保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydpacprot_ecpac_ex(request, headers, runtime)

    async def query_ydpacprot_ecpac_async(
        self,
        request: baasplus_models.QueryYdpacprotEcpacRequest,
    ) -> baasplus_models.QueryYdpacprotEcpacResponse:
        """
        Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
        Summary: 先享后付保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydpacprot_ecpac_ex_async(request, headers, runtime)

    def query_ydpacprot_ecpac_ex(
        self,
        request: baasplus_models.QueryYdpacprotEcpacRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdpacprotEcpacResponse:
        """
        Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
        Summary: 先享后付保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdpacprotEcpacResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydpacprot.ecpac.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydpacprot_ecpac_ex_async(
        self,
        request: baasplus_models.QueryYdpacprotEcpacRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdpacprotEcpacResponse:
        """
        Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
        Summary: 先享后付保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdpacprotEcpacResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydpacprot.ecpac.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydauthprot_twometa(
        self,
        request: baasplus_models.QueryYdauthprotTwometaRequest,
    ) -> baasplus_models.QueryYdauthprotTwometaResponse:
        """
        Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydauthprot_twometa_ex(request, headers, runtime)

    async def query_ydauthprot_twometa_async(
        self,
        request: baasplus_models.QueryYdauthprotTwometaRequest,
    ) -> baasplus_models.QueryYdauthprotTwometaResponse:
        """
        Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydauthprot_twometa_ex_async(request, headers, runtime)

    def query_ydauthprot_twometa_ex(
        self,
        request: baasplus_models.QueryYdauthprotTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdauthprotTwometaResponse:
        """
        Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdauthprotTwometaResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydauthprot.twometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydauthprot_twometa_ex_async(
        self,
        request: baasplus_models.QueryYdauthprotTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdauthprotTwometaResponse:
        """
        Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdauthprotTwometaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydauthprot.twometa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydauthprot_threemeta(
        self,
        request: baasplus_models.QueryYdauthprotThreemetaRequest,
    ) -> baasplus_models.QueryYdauthprotThreemetaResponse:
        """
        Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydauthprot_threemeta_ex(request, headers, runtime)

    async def query_ydauthprot_threemeta_async(
        self,
        request: baasplus_models.QueryYdauthprotThreemetaRequest,
    ) -> baasplus_models.QueryYdauthprotThreemetaResponse:
        """
        Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydauthprot_threemeta_ex_async(request, headers, runtime)

    def query_ydauthprot_threemeta_ex(
        self,
        request: baasplus_models.QueryYdauthprotThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdauthprotThreemetaResponse:
        """
        Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdauthprotThreemetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydauthprot.threemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydauthprot_threemeta_ex_async(
        self,
        request: baasplus_models.QueryYdauthprotThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdauthprotThreemetaResponse:
        """
        Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdauthprotThreemetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydauthprot.threemeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydauthprot_fourmeta(
        self,
        request: baasplus_models.QueryYdauthprotFourmetaRequest,
    ) -> baasplus_models.QueryYdauthprotFourmetaResponse:
        """
        Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydauthprot_fourmeta_ex(request, headers, runtime)

    async def query_ydauthprot_fourmeta_async(
        self,
        request: baasplus_models.QueryYdauthprotFourmetaRequest,
    ) -> baasplus_models.QueryYdauthprotFourmetaResponse:
        """
        Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydauthprot_fourmeta_ex_async(request, headers, runtime)

    def query_ydauthprot_fourmeta_ex(
        self,
        request: baasplus_models.QueryYdauthprotFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdauthprotFourmetaResponse:
        """
        Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdauthprotFourmetaResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydauthprot.fourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydauthprot_fourmeta_ex_async(
        self,
        request: baasplus_models.QueryYdauthprotFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdauthprotFourmetaResponse:
        """
        Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdauthprotFourmetaResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydauthprot.fourmeta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydmktprot_ecmarketcampaign(
        self,
        request: baasplus_models.QueryYdmktprotEcmarketcampaignRequest,
    ) -> baasplus_models.QueryYdmktprotEcmarketcampaignResponse:
        """
        Description: 营销保护
        Summary: 营销保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydmktprot_ecmarketcampaign_ex(request, headers, runtime)

    async def query_ydmktprot_ecmarketcampaign_async(
        self,
        request: baasplus_models.QueryYdmktprotEcmarketcampaignRequest,
    ) -> baasplus_models.QueryYdmktprotEcmarketcampaignResponse:
        """
        Description: 营销保护
        Summary: 营销保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydmktprot_ecmarketcampaign_ex_async(request, headers, runtime)

    def query_ydmktprot_ecmarketcampaign_ex(
        self,
        request: baasplus_models.QueryYdmktprotEcmarketcampaignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdmktprotEcmarketcampaignResponse:
        """
        Description: 营销保护
        Summary: 营销保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdmktprotEcmarketcampaignResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydmktprot.ecmarketcampaign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydmktprot_ecmarketcampaign_ex_async(
        self,
        request: baasplus_models.QueryYdmktprotEcmarketcampaignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdmktprotEcmarketcampaignResponse:
        """
        Description: 营销保护
        Summary: 营销保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdmktprotEcmarketcampaignResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydmktprot.ecmarketcampaign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ydregprot_ecregister(
        self,
        request: baasplus_models.QueryYdregprotEcregisterRequest,
    ) -> baasplus_models.QueryYdregprotEcregisterResponse:
        """
        Description: 注册保护
        Summary: 注册保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ydregprot_ecregister_ex(request, headers, runtime)

    async def query_ydregprot_ecregister_async(
        self,
        request: baasplus_models.QueryYdregprotEcregisterRequest,
    ) -> baasplus_models.QueryYdregprotEcregisterResponse:
        """
        Description: 注册保护
        Summary: 注册保护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ydregprot_ecregister_ex_async(request, headers, runtime)

    def query_ydregprot_ecregister_ex(
        self,
        request: baasplus_models.QueryYdregprotEcregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdregprotEcregisterResponse:
        """
        Description: 注册保护
        Summary: 注册保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdregprotEcregisterResponse().from_map(
            self.do_request('1.0', 'baas.plus.ydregprot.ecregister.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ydregprot_ecregister_ex_async(
        self,
        request: baasplus_models.QueryYdregprotEcregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryYdregprotEcregisterResponse:
        """
        Description: 注册保护
        Summary: 注册保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryYdregprotEcregisterResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ydregprot.ecregister.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_epayauth_branchbank(
        self,
        request: baasplus_models.QueryEpayauthBranchbankRequest,
    ) -> baasplus_models.QueryEpayauthBranchbankResponse:
        """
        Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
        Summary: 支行查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_epayauth_branchbank_ex(request, headers, runtime)

    async def query_epayauth_branchbank_async(
        self,
        request: baasplus_models.QueryEpayauthBranchbankRequest,
    ) -> baasplus_models.QueryEpayauthBranchbankResponse:
        """
        Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
        Summary: 支行查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_epayauth_branchbank_ex_async(request, headers, runtime)

    def query_epayauth_branchbank_ex(
        self,
        request: baasplus_models.QueryEpayauthBranchbankRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthBranchbankResponse:
        """
        Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
        Summary: 支行查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthBranchbankResponse().from_map(
            self.do_request('1.0', 'baas.plus.epayauth.branchbank.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_epayauth_branchbank_ex_async(
        self,
        request: baasplus_models.QueryEpayauthBranchbankRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthBranchbankResponse:
        """
        Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
        Summary: 支行查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthBranchbankResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.epayauth.branchbank.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_epayauth_district(
        self,
        request: baasplus_models.QueryEpayauthDistrictRequest,
    ) -> baasplus_models.QueryEpayauthDistrictResponse:
        """
        Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
        Summary: 行政地区编码查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_epayauth_district_ex(request, headers, runtime)

    async def query_epayauth_district_async(
        self,
        request: baasplus_models.QueryEpayauthDistrictRequest,
    ) -> baasplus_models.QueryEpayauthDistrictResponse:
        """
        Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
        Summary: 行政地区编码查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_epayauth_district_ex_async(request, headers, runtime)

    def query_epayauth_district_ex(
        self,
        request: baasplus_models.QueryEpayauthDistrictRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthDistrictResponse:
        """
        Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
        Summary: 行政地区编码查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthDistrictResponse().from_map(
            self.do_request('1.0', 'baas.plus.epayauth.district.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_epayauth_district_ex_async(
        self,
        request: baasplus_models.QueryEpayauthDistrictRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthDistrictResponse:
        """
        Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
        Summary: 行政地区编码查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthDistrictResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.epayauth.district.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_epayauth_verify(
        self,
        request: baasplus_models.InitEpayauthVerifyRequest,
    ) -> baasplus_models.InitEpayauthVerifyResponse:
        """
        Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
        Summary: 发起打款验证申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_epayauth_verify_ex(request, headers, runtime)

    async def init_epayauth_verify_async(
        self,
        request: baasplus_models.InitEpayauthVerifyRequest,
    ) -> baasplus_models.InitEpayauthVerifyResponse:
        """
        Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
        Summary: 发起打款验证申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_epayauth_verify_ex_async(request, headers, runtime)

    def init_epayauth_verify_ex(
        self,
        request: baasplus_models.InitEpayauthVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitEpayauthVerifyResponse:
        """
        Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
        Summary: 发起打款验证申请
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitEpayauthVerifyResponse().from_map(
            self.do_request('1.0', 'baas.plus.epayauth.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_epayauth_verify_ex_async(
        self,
        request: baasplus_models.InitEpayauthVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitEpayauthVerifyResponse:
        """
        Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
        Summary: 发起打款验证申请
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitEpayauthVerifyResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.epayauth.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_epayauth_verify(
        self,
        request: baasplus_models.QueryEpayauthVerifyRequest,
    ) -> baasplus_models.QueryEpayauthVerifyResponse:
        """
        Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
        Summary: 打款验证金额校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_epayauth_verify_ex(request, headers, runtime)

    async def query_epayauth_verify_async(
        self,
        request: baasplus_models.QueryEpayauthVerifyRequest,
    ) -> baasplus_models.QueryEpayauthVerifyResponse:
        """
        Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
        Summary: 打款验证金额校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_epayauth_verify_ex_async(request, headers, runtime)

    def query_epayauth_verify_ex(
        self,
        request: baasplus_models.QueryEpayauthVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthVerifyResponse:
        """
        Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
        Summary: 打款验证金额校验
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthVerifyResponse().from_map(
            self.do_request('1.0', 'baas.plus.epayauth.verify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_epayauth_verify_ex_async(
        self,
        request: baasplus_models.QueryEpayauthVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEpayauthVerifyResponse:
        """
        Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
        Summary: 打款验证金额校验
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEpayauthVerifyResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.epayauth.verify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bmpbrowser_transactionqrcode(
        self,
        request: baasplus_models.QueryBmpbrowserTransactionqrcodeRequest,
    ) -> baasplus_models.QueryBmpbrowserTransactionqrcodeResponse:
        """
        Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
        Summary: 链上交易二维码生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bmpbrowser_transactionqrcode_ex(request, headers, runtime)

    async def query_bmpbrowser_transactionqrcode_async(
        self,
        request: baasplus_models.QueryBmpbrowserTransactionqrcodeRequest,
    ) -> baasplus_models.QueryBmpbrowserTransactionqrcodeResponse:
        """
        Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
        Summary: 链上交易二维码生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bmpbrowser_transactionqrcode_ex_async(request, headers, runtime)

    def query_bmpbrowser_transactionqrcode_ex(
        self,
        request: baasplus_models.QueryBmpbrowserTransactionqrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBmpbrowserTransactionqrcodeResponse:
        """
        Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
        Summary: 链上交易二维码生成
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBmpbrowserTransactionqrcodeResponse().from_map(
            self.do_request('1.0', 'baas.plus.bmpbrowser.transactionqrcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bmpbrowser_transactionqrcode_ex_async(
        self,
        request: baasplus_models.QueryBmpbrowserTransactionqrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBmpbrowserTransactionqrcodeResponse:
        """
        Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
        Summary: 链上交易二维码生成
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBmpbrowserTransactionqrcodeResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.bmpbrowser.transactionqrcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_bmpbrowser_privilege(
        self,
        request: baasplus_models.AddBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.AddBmpbrowserPrivilegeResponse:
        """
        Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
        Summary: 批量开通 链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_bmpbrowser_privilege_ex(request, headers, runtime)

    async def add_bmpbrowser_privilege_async(
        self,
        request: baasplus_models.AddBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.AddBmpbrowserPrivilegeResponse:
        """
        Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
        Summary: 批量开通 链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_bmpbrowser_privilege_ex_async(request, headers, runtime)

    def add_bmpbrowser_privilege_ex(
        self,
        request: baasplus_models.AddBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.AddBmpbrowserPrivilegeResponse:
        """
        Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
        Summary: 批量开通 链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddBmpbrowserPrivilegeResponse().from_map(
            self.do_request('1.0', 'baas.plus.bmpbrowser.privilege.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_bmpbrowser_privilege_ex_async(
        self,
        request: baasplus_models.AddBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.AddBmpbrowserPrivilegeResponse:
        """
        Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
        Summary: 批量开通 链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddBmpbrowserPrivilegeResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.bmpbrowser.privilege.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_idcocr_idcard(
        self,
        request: baasplus_models.QueryIdcocrIdcardRequest,
    ) -> baasplus_models.QueryIdcocrIdcardResponse:
        """
        Description: 身份证信息识别
        Summary: 身份证信息识别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_idcocr_idcard_ex(request, headers, runtime)

    async def query_idcocr_idcard_async(
        self,
        request: baasplus_models.QueryIdcocrIdcardRequest,
    ) -> baasplus_models.QueryIdcocrIdcardResponse:
        """
        Description: 身份证信息识别
        Summary: 身份证信息识别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_idcocr_idcard_ex_async(request, headers, runtime)

    def query_idcocr_idcard_ex(
        self,
        request: baasplus_models.QueryIdcocrIdcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIdcocrIdcardResponse:
        """
        Description: 身份证信息识别
        Summary: 身份证信息识别
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIdcocrIdcardResponse().from_map(
            self.do_request('1.0', 'baas.plus.idcocr.idcard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_idcocr_idcard_ex_async(
        self,
        request: baasplus_models.QueryIdcocrIdcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIdcocrIdcardResponse:
        """
        Description: 身份证信息识别
        Summary: 身份证信息识别
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIdcocrIdcardResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.idcocr.idcard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_ca_certificate(
        self,
        request: baasplus_models.InitCaCertificateRequest,
    ) -> baasplus_models.InitCaCertificateResponse:
        """
        Description: 申请证书
        Summary: 申请证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_ca_certificate_ex(request, headers, runtime)

    async def init_ca_certificate_async(
        self,
        request: baasplus_models.InitCaCertificateRequest,
    ) -> baasplus_models.InitCaCertificateResponse:
        """
        Description: 申请证书
        Summary: 申请证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_ca_certificate_ex_async(request, headers, runtime)

    def init_ca_certificate_ex(
        self,
        request: baasplus_models.InitCaCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitCaCertificateResponse:
        """
        Description: 申请证书
        Summary: 申请证书
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitCaCertificateResponse().from_map(
            self.do_request('1.0', 'baas.plus.ca.certificate.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_ca_certificate_ex_async(
        self,
        request: baasplus_models.InitCaCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitCaCertificateResponse:
        """
        Description: 申请证书
        Summary: 申请证书
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitCaCertificateResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.ca.certificate.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_contentrisk_internal(
        self,
        request: baasplus_models.InitContentriskInternalRequest,
    ) -> baasplus_models.InitContentriskInternalResponse:
        """
        Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
        Summary: 内容风险识别接口服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_contentrisk_internal_ex(request, headers, runtime)

    async def init_contentrisk_internal_async(
        self,
        request: baasplus_models.InitContentriskInternalRequest,
    ) -> baasplus_models.InitContentriskInternalResponse:
        """
        Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
        Summary: 内容风险识别接口服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_contentrisk_internal_ex_async(request, headers, runtime)

    def init_contentrisk_internal_ex(
        self,
        request: baasplus_models.InitContentriskInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitContentriskInternalResponse:
        """
        Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
        Summary: 内容风险识别接口服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitContentriskInternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.contentrisk.internal.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_contentrisk_internal_ex_async(
        self,
        request: baasplus_models.InitContentriskInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitContentriskInternalResponse:
        """
        Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
        Summary: 内容风险识别接口服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitContentriskInternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.contentrisk.internal.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contentrisk_internal(
        self,
        request: baasplus_models.QueryContentriskInternalRequest,
    ) -> baasplus_models.QueryContentriskInternalResponse:
        """
        Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
        Summary: 内容风险识别结果查询接口服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contentrisk_internal_ex(request, headers, runtime)

    async def query_contentrisk_internal_async(
        self,
        request: baasplus_models.QueryContentriskInternalRequest,
    ) -> baasplus_models.QueryContentriskInternalResponse:
        """
        Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
        Summary: 内容风险识别结果查询接口服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contentrisk_internal_ex_async(request, headers, runtime)

    def query_contentrisk_internal_ex(
        self,
        request: baasplus_models.QueryContentriskInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryContentriskInternalResponse:
        """
        Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
        Summary: 内容风险识别结果查询接口服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryContentriskInternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.contentrisk.internal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contentrisk_internal_ex_async(
        self,
        request: baasplus_models.QueryContentriskInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryContentriskInternalResponse:
        """
        Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
        Summary: 内容风险识别结果查询接口服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryContentriskInternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.contentrisk.internal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_individualid_imageauth(
        self,
        request: baasplus_models.InitIndividualidImageauthRequest,
    ) -> baasplus_models.InitIndividualidImageauthResponse:
        """
        Description: 个人实人认证服务端比对-认证开始
        Summary: 个人实人认证服务端比对-认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_individualid_imageauth_ex(request, headers, runtime)

    async def init_individualid_imageauth_async(
        self,
        request: baasplus_models.InitIndividualidImageauthRequest,
    ) -> baasplus_models.InitIndividualidImageauthResponse:
        """
        Description: 个人实人认证服务端比对-认证开始
        Summary: 个人实人认证服务端比对-认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_individualid_imageauth_ex_async(request, headers, runtime)

    def init_individualid_imageauth_ex(
        self,
        request: baasplus_models.InitIndividualidImageauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitIndividualidImageauthResponse:
        """
        Description: 个人实人认证服务端比对-认证开始
        Summary: 个人实人认证服务端比对-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitIndividualidImageauthResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.imageauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_individualid_imageauth_ex_async(
        self,
        request: baasplus_models.InitIndividualidImageauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitIndividualidImageauthResponse:
        """
        Description: 个人实人认证服务端比对-认证开始
        Summary: 个人实人认证服务端比对-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitIndividualidImageauthResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.imageauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_iotcse_account(
        self,
        request: baasplus_models.AddIotcseAccountRequest,
    ) -> baasplus_models.AddIotcseAccountResponse:
        """
        Description: 访问账户生成
        Summary: 访问账户生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_iotcse_account_ex(request, headers, runtime)

    async def add_iotcse_account_async(
        self,
        request: baasplus_models.AddIotcseAccountRequest,
    ) -> baasplus_models.AddIotcseAccountResponse:
        """
        Description: 访问账户生成
        Summary: 访问账户生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_iotcse_account_ex_async(request, headers, runtime)

    def add_iotcse_account_ex(
        self,
        request: baasplus_models.AddIotcseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.AddIotcseAccountResponse:
        """
        Description: 访问账户生成
        Summary: 访问账户生成
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddIotcseAccountResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.account.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_iotcse_account_ex_async(
        self,
        request: baasplus_models.AddIotcseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.AddIotcseAccountResponse:
        """
        Description: 访问账户生成
        Summary: 访问账户生成
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddIotcseAccountResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.account.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_iotcse_evidence(
        self,
        request: baasplus_models.SaveIotcseEvidenceRequest,
    ) -> baasplus_models.SaveIotcseEvidenceResponse:
        """
        Description: 存证上链
        Summary: 存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_iotcse_evidence_ex(request, headers, runtime)

    async def save_iotcse_evidence_async(
        self,
        request: baasplus_models.SaveIotcseEvidenceRequest,
    ) -> baasplus_models.SaveIotcseEvidenceResponse:
        """
        Description: 存证上链
        Summary: 存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_iotcse_evidence_ex_async(request, headers, runtime)

    def save_iotcse_evidence_ex(
        self,
        request: baasplus_models.SaveIotcseEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.SaveIotcseEvidenceResponse:
        """
        Description: 存证上链
        Summary: 存证上链
        """
        UtilClient.validate_model(request)
        return baasplus_models.SaveIotcseEvidenceResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.evidence.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_iotcse_evidence_ex_async(
        self,
        request: baasplus_models.SaveIotcseEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.SaveIotcseEvidenceResponse:
        """
        Description: 存证上链
        Summary: 存证上链
        """
        UtilClient.validate_model(request)
        return baasplus_models.SaveIotcseEvidenceResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.evidence.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_evidence(
        self,
        request: baasplus_models.QueryIotcseEvidenceRequest,
    ) -> baasplus_models.QueryIotcseEvidenceResponse:
        """
        Description: 存证上链查询
        Summary: 存证上链查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_evidence_ex(request, headers, runtime)

    async def query_iotcse_evidence_async(
        self,
        request: baasplus_models.QueryIotcseEvidenceRequest,
    ) -> baasplus_models.QueryIotcseEvidenceResponse:
        """
        Description: 存证上链查询
        Summary: 存证上链查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_evidence_ex_async(request, headers, runtime)

    def query_iotcse_evidence_ex(
        self,
        request: baasplus_models.QueryIotcseEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseEvidenceResponse:
        """
        Description: 存证上链查询
        Summary: 存证上链查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseEvidenceResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.evidence.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_evidence_ex_async(
        self,
        request: baasplus_models.QueryIotcseEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseEvidenceResponse:
        """
        Description: 存证上链查询
        Summary: 存证上链查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseEvidenceResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.evidence.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_corporatedidagent(
        self,
        request: baasplus_models.CreateDidCorporatedidagentRequest,
    ) -> baasplus_models.CreateDidCorporatedidagentResponse:
        """
        Description: 代理创建企业did
        Summary: 代理创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_corporatedidagent_ex(request, headers, runtime)

    async def create_did_corporatedidagent_async(
        self,
        request: baasplus_models.CreateDidCorporatedidagentRequest,
    ) -> baasplus_models.CreateDidCorporatedidagentResponse:
        """
        Description: 代理创建企业did
        Summary: 代理创建企业did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_corporatedidagent_ex_async(request, headers, runtime)

    def create_did_corporatedidagent_ex(
        self,
        request: baasplus_models.CreateDidCorporatedidagentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CreateDidCorporatedidagentResponse:
        """
        Description: 代理创建企业did
        Summary: 代理创建企业did
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateDidCorporatedidagentResponse().from_map(
            self.do_request('1.0', 'baas.plus.did.corporatedidagent.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_corporatedidagent_ex_async(
        self,
        request: baasplus_models.CreateDidCorporatedidagentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CreateDidCorporatedidagentResponse:
        """
        Description: 代理创建企业did
        Summary: 代理创建企业did
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateDidCorporatedidagentResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.did.corporatedidagent.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_individualid_faceauthinternal(
        self,
        request: baasplus_models.InitIndividualidFaceauthinternalRequest,
    ) -> baasplus_models.InitIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_individualid_faceauthinternal_ex(request, headers, runtime)

    async def init_individualid_faceauthinternal_async(
        self,
        request: baasplus_models.InitIndividualidFaceauthinternalRequest,
    ) -> baasplus_models.InitIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_individualid_faceauthinternal_ex_async(request, headers, runtime)

    def init_individualid_faceauthinternal_ex(
        self,
        request: baasplus_models.InitIndividualidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitIndividualidFaceauthinternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.faceauthinternal.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_individualid_faceauthinternal_ex_async(
        self,
        request: baasplus_models.InitIndividualidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitIndividualidFaceauthinternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.faceauthinternal.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_individualid_faceauthinternal(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthinternalRequest,
    ) -> baasplus_models.CertifyIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_individualid_faceauthinternal_ex(request, headers, runtime)

    async def certify_individualid_faceauthinternal_async(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthinternalRequest,
    ) -> baasplus_models.CertifyIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_individualid_faceauthinternal_ex_async(request, headers, runtime)

    def certify_individualid_faceauthinternal_ex(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyIndividualidFaceauthinternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.faceauthinternal.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_individualid_faceauthinternal_ex_async(
        self,
        request: baasplus_models.CertifyIndividualidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyIndividualidFaceauthinternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.faceauthinternal.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_individualid_faceauthinternal(
        self,
        request: baasplus_models.QueryIndividualidFaceauthinternalRequest,
    ) -> baasplus_models.QueryIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_individualid_faceauthinternal_ex(request, headers, runtime)

    async def query_individualid_faceauthinternal_async(
        self,
        request: baasplus_models.QueryIndividualidFaceauthinternalRequest,
    ) -> baasplus_models.QueryIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_individualid_faceauthinternal_ex_async(request, headers, runtime)

    def query_individualid_faceauthinternal_ex(
        self,
        request: baasplus_models.QueryIndividualidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidFaceauthinternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.individualid.faceauthinternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_individualid_faceauthinternal_ex_async(
        self,
        request: baasplus_models.QueryIndividualidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIndividualidFaceauthinternalResponse:
        """
        Description: 个人实人刷脸认证-查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIndividualidFaceauthinternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.individualid.faceauthinternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_enterpriseid_faceauthinternal(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthinternalRequest,
    ) -> baasplus_models.InitEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_enterpriseid_faceauthinternal_ex(request, headers, runtime)

    async def init_enterpriseid_faceauthinternal_async(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthinternalRequest,
    ) -> baasplus_models.InitEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_enterpriseid_faceauthinternal_ex_async(request, headers, runtime)

    def init_enterpriseid_faceauthinternal_ex(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitEnterpriseidFaceauthinternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.faceauthinternal.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_enterpriseid_faceauthinternal_ex_async(
        self,
        request: baasplus_models.InitEnterpriseidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.InitEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitEnterpriseidFaceauthinternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.faceauthinternal.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_enterpriseid_faceauthinternal(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthinternalRequest,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_enterpriseid_faceauthinternal_ex(request, headers, runtime)

    async def certify_enterpriseid_faceauthinternal_async(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthinternalRequest,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_enterpriseid_faceauthinternal_ex_async(request, headers, runtime)

    def certify_enterpriseid_faceauthinternal_ex(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyEnterpriseidFaceauthinternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.faceauthinternal.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_enterpriseid_faceauthinternal_ex_async(
        self,
        request: baasplus_models.CertifyEnterpriseidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CertifyEnterpriseidFaceauthinternalResponse:
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyEnterpriseidFaceauthinternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.faceauthinternal.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_everify_twometainternal(
        self,
        request: baasplus_models.QueryEverifyTwometainternalRequest,
    ) -> baasplus_models.QueryEverifyTwometainternalResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_everify_twometainternal_ex(request, headers, runtime)

    async def query_everify_twometainternal_async(
        self,
        request: baasplus_models.QueryEverifyTwometainternalRequest,
    ) -> baasplus_models.QueryEverifyTwometainternalResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_everify_twometainternal_ex_async(request, headers, runtime)

    def query_everify_twometainternal_ex(
        self,
        request: baasplus_models.QueryEverifyTwometainternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyTwometainternalResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyTwometainternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.everify.twometainternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_everify_twometainternal_ex_async(
        self,
        request: baasplus_models.QueryEverifyTwometainternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyTwometainternalResponse:
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyTwometainternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.everify.twometainternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_everify_threemetainternal(
        self,
        request: baasplus_models.QueryEverifyThreemetainternalRequest,
    ) -> baasplus_models.QueryEverifyThreemetainternalResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_everify_threemetainternal_ex(request, headers, runtime)

    async def query_everify_threemetainternal_async(
        self,
        request: baasplus_models.QueryEverifyThreemetainternalRequest,
    ) -> baasplus_models.QueryEverifyThreemetainternalResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_everify_threemetainternal_ex_async(request, headers, runtime)

    def query_everify_threemetainternal_ex(
        self,
        request: baasplus_models.QueryEverifyThreemetainternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyThreemetainternalResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyThreemetainternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.everify.threemetainternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_everify_threemetainternal_ex_async(
        self,
        request: baasplus_models.QueryEverifyThreemetainternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyThreemetainternalResponse:
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyThreemetainternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.everify.threemetainternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_everify_fourmetainternal(
        self,
        request: baasplus_models.QueryEverifyFourmetainternalRequest,
    ) -> baasplus_models.QueryEverifyFourmetainternalResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_everify_fourmetainternal_ex(request, headers, runtime)

    async def query_everify_fourmetainternal_async(
        self,
        request: baasplus_models.QueryEverifyFourmetainternalRequest,
    ) -> baasplus_models.QueryEverifyFourmetainternalResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_everify_fourmetainternal_ex_async(request, headers, runtime)

    def query_everify_fourmetainternal_ex(
        self,
        request: baasplus_models.QueryEverifyFourmetainternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyFourmetainternalResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyFourmetainternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.everify.fourmetainternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_everify_fourmetainternal_ex_async(
        self,
        request: baasplus_models.QueryEverifyFourmetainternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEverifyFourmetainternalResponse:
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEverifyFourmetainternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.everify.fourmetainternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterpriseid_faceauthinternal(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthinternalRequest,
    ) -> baasplus_models.QueryEnterpriseidFaceauthinternalResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterpriseid_faceauthinternal_ex(request, headers, runtime)

    async def query_enterpriseid_faceauthinternal_async(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthinternalRequest,
    ) -> baasplus_models.QueryEnterpriseidFaceauthinternalResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterpriseid_faceauthinternal_ex_async(request, headers, runtime)

    def query_enterpriseid_faceauthinternal_ex(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidFaceauthinternalResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidFaceauthinternalResponse().from_map(
            self.do_request('1.0', 'baas.plus.enterpriseid.faceauthinternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterpriseid_faceauthinternal_ex_async(
        self,
        request: baasplus_models.QueryEnterpriseidFaceauthinternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryEnterpriseidFaceauthinternalResponse:
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryEnterpriseidFaceauthinternalResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.enterpriseid.faceauthinternal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_iotcse_thingsdid(
        self,
        request: baasplus_models.AddIotcseThingsdidRequest,
    ) -> baasplus_models.AddIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份注册
        Summary: 物联网区块链身份注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_iotcse_thingsdid_ex(request, headers, runtime)

    async def add_iotcse_thingsdid_async(
        self,
        request: baasplus_models.AddIotcseThingsdidRequest,
    ) -> baasplus_models.AddIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份注册
        Summary: 物联网区块链身份注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_iotcse_thingsdid_ex_async(request, headers, runtime)

    def add_iotcse_thingsdid_ex(
        self,
        request: baasplus_models.AddIotcseThingsdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.AddIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份注册
        Summary: 物联网区块链身份注册
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddIotcseThingsdidResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.thingsdid.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_iotcse_thingsdid_ex_async(
        self,
        request: baasplus_models.AddIotcseThingsdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.AddIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份注册
        Summary: 物联网区块链身份注册
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddIotcseThingsdidResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.thingsdid.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_iotcse_thingsdid(
        self,
        request: baasplus_models.UpdateIotcseThingsdidRequest,
    ) -> baasplus_models.UpdateIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份更新
        Summary: 物联网区块链身份更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_iotcse_thingsdid_ex(request, headers, runtime)

    async def update_iotcse_thingsdid_async(
        self,
        request: baasplus_models.UpdateIotcseThingsdidRequest,
    ) -> baasplus_models.UpdateIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份更新
        Summary: 物联网区块链身份更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_iotcse_thingsdid_ex_async(request, headers, runtime)

    def update_iotcse_thingsdid_ex(
        self,
        request: baasplus_models.UpdateIotcseThingsdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份更新
        Summary: 物联网区块链身份更新
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateIotcseThingsdidResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.thingsdid.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_iotcse_thingsdid_ex_async(
        self,
        request: baasplus_models.UpdateIotcseThingsdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份更新
        Summary: 物联网区块链身份更新
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateIotcseThingsdidResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.thingsdid.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_thingsdid(
        self,
        request: baasplus_models.QueryIotcseThingsdidRequest,
    ) -> baasplus_models.QueryIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份查询
        Summary: 物联网区块链身份查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_thingsdid_ex(request, headers, runtime)

    async def query_iotcse_thingsdid_async(
        self,
        request: baasplus_models.QueryIotcseThingsdidRequest,
    ) -> baasplus_models.QueryIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份查询
        Summary: 物联网区块链身份查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_thingsdid_ex_async(request, headers, runtime)

    def query_iotcse_thingsdid_ex(
        self,
        request: baasplus_models.QueryIotcseThingsdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份查询
        Summary: 物联网区块链身份查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseThingsdidResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.thingsdid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_thingsdid_ex_async(
        self,
        request: baasplus_models.QueryIotcseThingsdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseThingsdidResponse:
        """
        Description: 物联网区块链身份查询
        Summary: 物联网区块链身份查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseThingsdidResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.thingsdid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_asyncprocess(
        self,
        request: baasplus_models.QueryIotcseAsyncprocessRequest,
    ) -> baasplus_models.QueryIotcseAsyncprocessResponse:
        """
        Description: 异步轮询请求
        智能合约执行完后异步轮询
        Summary: 异步轮询请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_asyncprocess_ex(request, headers, runtime)

    async def query_iotcse_asyncprocess_async(
        self,
        request: baasplus_models.QueryIotcseAsyncprocessRequest,
    ) -> baasplus_models.QueryIotcseAsyncprocessResponse:
        """
        Description: 异步轮询请求
        智能合约执行完后异步轮询
        Summary: 异步轮询请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_asyncprocess_ex_async(request, headers, runtime)

    def query_iotcse_asyncprocess_ex(
        self,
        request: baasplus_models.QueryIotcseAsyncprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseAsyncprocessResponse:
        """
        Description: 异步轮询请求
        智能合约执行完后异步轮询
        Summary: 异步轮询请求
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseAsyncprocessResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.asyncprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_asyncprocess_ex_async(
        self,
        request: baasplus_models.QueryIotcseAsyncprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseAsyncprocessResponse:
        """
        Description: 异步轮询请求
        智能合约执行完后异步轮询
        Summary: 异步轮询请求
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseAsyncprocessResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.asyncprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_iotcse_group(
        self,
        request: baasplus_models.ExecIotcseGroupRequest,
    ) -> baasplus_models.ExecIotcseGroupResponse:
        """
        Description: 物联网区块链身份分组
        Summary: 物联网区块链身份分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_iotcse_group_ex(request, headers, runtime)

    async def exec_iotcse_group_async(
        self,
        request: baasplus_models.ExecIotcseGroupRequest,
    ) -> baasplus_models.ExecIotcseGroupResponse:
        """
        Description: 物联网区块链身份分组
        Summary: 物联网区块链身份分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_iotcse_group_ex_async(request, headers, runtime)

    def exec_iotcse_group_ex(
        self,
        request: baasplus_models.ExecIotcseGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.ExecIotcseGroupResponse:
        """
        Description: 物联网区块链身份分组
        Summary: 物联网区块链身份分组
        """
        UtilClient.validate_model(request)
        return baasplus_models.ExecIotcseGroupResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.group.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_iotcse_group_ex_async(
        self,
        request: baasplus_models.ExecIotcseGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.ExecIotcseGroupResponse:
        """
        Description: 物联网区块链身份分组
        Summary: 物联网区块链身份分组
        """
        UtilClient.validate_model(request)
        return baasplus_models.ExecIotcseGroupResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.group.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_groupdevice(
        self,
        request: baasplus_models.QueryIotcseGroupdeviceRequest,
    ) -> baasplus_models.QueryIotcseGroupdeviceResponse:
        """
        Description: 物联网区块链分组设备查询
        Summary: 物联网区块链分组设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_groupdevice_ex(request, headers, runtime)

    async def query_iotcse_groupdevice_async(
        self,
        request: baasplus_models.QueryIotcseGroupdeviceRequest,
    ) -> baasplus_models.QueryIotcseGroupdeviceResponse:
        """
        Description: 物联网区块链分组设备查询
        Summary: 物联网区块链分组设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_groupdevice_ex_async(request, headers, runtime)

    def query_iotcse_groupdevice_ex(
        self,
        request: baasplus_models.QueryIotcseGroupdeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseGroupdeviceResponse:
        """
        Description: 物联网区块链分组设备查询
        Summary: 物联网区块链分组设备查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseGroupdeviceResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.groupdevice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_groupdevice_ex_async(
        self,
        request: baasplus_models.QueryIotcseGroupdeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseGroupdeviceResponse:
        """
        Description: 物联网区块链分组设备查询
        Summary: 物联网区块链分组设备查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseGroupdeviceResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.groupdevice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_devicegroup(
        self,
        request: baasplus_models.QueryIotcseDevicegroupRequest,
    ) -> baasplus_models.QueryIotcseDevicegroupResponse:
        """
        Description: 物联网区块链身份设备分组查询
        Summary: 物联网区块链身份设备分组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_devicegroup_ex(request, headers, runtime)

    async def query_iotcse_devicegroup_async(
        self,
        request: baasplus_models.QueryIotcseDevicegroupRequest,
    ) -> baasplus_models.QueryIotcseDevicegroupResponse:
        """
        Description: 物联网区块链身份设备分组查询
        Summary: 物联网区块链身份设备分组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_devicegroup_ex_async(request, headers, runtime)

    def query_iotcse_devicegroup_ex(
        self,
        request: baasplus_models.QueryIotcseDevicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseDevicegroupResponse:
        """
        Description: 物联网区块链身份设备分组查询
        Summary: 物联网区块链身份设备分组查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseDevicegroupResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.devicegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_devicegroup_ex_async(
        self,
        request: baasplus_models.QueryIotcseDevicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseDevicegroupResponse:
        """
        Description: 物联网区块链身份设备分组查询
        Summary: 物联网区块链身份设备分组查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseDevicegroupResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.devicegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_tenantdevice(
        self,
        request: baasplus_models.QueryIotcseTenantdeviceRequest,
    ) -> baasplus_models.QueryIotcseTenantdeviceResponse:
        """
        Description: 物联网区块链身份租户设备查询
        Summary: 物联网区块链身份租户设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_tenantdevice_ex(request, headers, runtime)

    async def query_iotcse_tenantdevice_async(
        self,
        request: baasplus_models.QueryIotcseTenantdeviceRequest,
    ) -> baasplus_models.QueryIotcseTenantdeviceResponse:
        """
        Description: 物联网区块链身份租户设备查询
        Summary: 物联网区块链身份租户设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_tenantdevice_ex_async(request, headers, runtime)

    def query_iotcse_tenantdevice_ex(
        self,
        request: baasplus_models.QueryIotcseTenantdeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseTenantdeviceResponse:
        """
        Description: 物联网区块链身份租户设备查询
        Summary: 物联网区块链身份租户设备查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseTenantdeviceResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.tenantdevice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_tenantdevice_ex_async(
        self,
        request: baasplus_models.QueryIotcseTenantdeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseTenantdeviceResponse:
        """
        Description: 物联网区块链身份租户设备查询
        Summary: 物联网区块链身份租户设备查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseTenantdeviceResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.tenantdevice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_iotcse_devicestatus(
        self,
        request: baasplus_models.UpdateIotcseDevicestatusRequest,
    ) -> baasplus_models.UpdateIotcseDevicestatusResponse:
        """
        Description: 物联网区块链身份设备状态更新
        Summary: 物联网区块链身份设备状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_iotcse_devicestatus_ex(request, headers, runtime)

    async def update_iotcse_devicestatus_async(
        self,
        request: baasplus_models.UpdateIotcseDevicestatusRequest,
    ) -> baasplus_models.UpdateIotcseDevicestatusResponse:
        """
        Description: 物联网区块链身份设备状态更新
        Summary: 物联网区块链身份设备状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_iotcse_devicestatus_ex_async(request, headers, runtime)

    def update_iotcse_devicestatus_ex(
        self,
        request: baasplus_models.UpdateIotcseDevicestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateIotcseDevicestatusResponse:
        """
        Description: 物联网区块链身份设备状态更新
        Summary: 物联网区块链身份设备状态更新
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateIotcseDevicestatusResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.devicestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_iotcse_devicestatus_ex_async(
        self,
        request: baasplus_models.UpdateIotcseDevicestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateIotcseDevicestatusResponse:
        """
        Description: 物联网区块链身份设备状态更新
        Summary: 物联网区块链身份设备状态更新
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateIotcseDevicestatusResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.devicestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_devicemodel(
        self,
        request: baasplus_models.QueryIotcseDevicemodelRequest,
    ) -> baasplus_models.QueryIotcseDevicemodelResponse:
        """
        Description: 物联网区块链身份设备物模型查询
        Summary: 物联网区块链身份设备物模型查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_devicemodel_ex(request, headers, runtime)

    async def query_iotcse_devicemodel_async(
        self,
        request: baasplus_models.QueryIotcseDevicemodelRequest,
    ) -> baasplus_models.QueryIotcseDevicemodelResponse:
        """
        Description: 物联网区块链身份设备物模型查询
        Summary: 物联网区块链身份设备物模型查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_devicemodel_ex_async(request, headers, runtime)

    def query_iotcse_devicemodel_ex(
        self,
        request: baasplus_models.QueryIotcseDevicemodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseDevicemodelResponse:
        """
        Description: 物联网区块链身份设备物模型查询
        Summary: 物联网区块链身份设备物模型查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseDevicemodelResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.devicemodel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_devicemodel_ex_async(
        self,
        request: baasplus_models.QueryIotcseDevicemodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseDevicemodelResponse:
        """
        Description: 物联网区块链身份设备物模型查询
        Summary: 物联网区块链身份设备物模型查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseDevicemodelResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.devicemodel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_iotcse_devicespace(
        self,
        request: baasplus_models.UpdateIotcseDevicespaceRequest,
    ) -> baasplus_models.UpdateIotcseDevicespaceResponse:
        """
        Description: 物联网区块链身份设备空间关联
        Summary: 物联网区块链身份设备空间关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_iotcse_devicespace_ex(request, headers, runtime)

    async def update_iotcse_devicespace_async(
        self,
        request: baasplus_models.UpdateIotcseDevicespaceRequest,
    ) -> baasplus_models.UpdateIotcseDevicespaceResponse:
        """
        Description: 物联网区块链身份设备空间关联
        Summary: 物联网区块链身份设备空间关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_iotcse_devicespace_ex_async(request, headers, runtime)

    def update_iotcse_devicespace_ex(
        self,
        request: baasplus_models.UpdateIotcseDevicespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateIotcseDevicespaceResponse:
        """
        Description: 物联网区块链身份设备空间关联
        Summary: 物联网区块链身份设备空间关联
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateIotcseDevicespaceResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.devicespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_iotcse_devicespace_ex_async(
        self,
        request: baasplus_models.UpdateIotcseDevicespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.UpdateIotcseDevicespaceResponse:
        """
        Description: 物联网区块链身份设备空间关联
        Summary: 物联网区块链身份设备空间关联
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateIotcseDevicespaceResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.devicespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotcse_evidencebatch(
        self,
        request: baasplus_models.QueryIotcseEvidencebatchRequest,
    ) -> baasplus_models.QueryIotcseEvidencebatchResponse:
        """
        Description: 物联网区块链身份批量存证数据读取
        Summary: 物联网区块链身份批量存证数据读取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotcse_evidencebatch_ex(request, headers, runtime)

    async def query_iotcse_evidencebatch_async(
        self,
        request: baasplus_models.QueryIotcseEvidencebatchRequest,
    ) -> baasplus_models.QueryIotcseEvidencebatchResponse:
        """
        Description: 物联网区块链身份批量存证数据读取
        Summary: 物联网区块链身份批量存证数据读取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotcse_evidencebatch_ex_async(request, headers, runtime)

    def query_iotcse_evidencebatch_ex(
        self,
        request: baasplus_models.QueryIotcseEvidencebatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseEvidencebatchResponse:
        """
        Description: 物联网区块链身份批量存证数据读取
        Summary: 物联网区块链身份批量存证数据读取
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseEvidencebatchResponse().from_map(
            self.do_request('1.0', 'baas.plus.iotcse.evidencebatch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotcse_evidencebatch_ex_async(
        self,
        request: baasplus_models.QueryIotcseEvidencebatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryIotcseEvidencebatchResponse:
        """
        Description: 物联网区块链身份批量存证数据读取
        Summary: 物联网区块链身份批量存证数据读取
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryIotcseEvidencebatchResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.iotcse.evidencebatch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blocr_businesslicense(
        self,
        request: baasplus_models.QueryBlocrBusinesslicenseRequest,
    ) -> baasplus_models.QueryBlocrBusinesslicenseResponse:
        """
        Description: AI认知服务营业执照ocr服务
        Summary: AI认知服务营业执照ocr服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blocr_businesslicense_ex(request, headers, runtime)

    async def query_blocr_businesslicense_async(
        self,
        request: baasplus_models.QueryBlocrBusinesslicenseRequest,
    ) -> baasplus_models.QueryBlocrBusinesslicenseResponse:
        """
        Description: AI认知服务营业执照ocr服务
        Summary: AI认知服务营业执照ocr服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blocr_businesslicense_ex_async(request, headers, runtime)

    def query_blocr_businesslicense_ex(
        self,
        request: baasplus_models.QueryBlocrBusinesslicenseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBlocrBusinesslicenseResponse:
        """
        Description: AI认知服务营业执照ocr服务
        Summary: AI认知服务营业执照ocr服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBlocrBusinesslicenseResponse().from_map(
            self.do_request('1.0', 'baas.plus.blocr.businesslicense.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blocr_businesslicense_ex_async(
        self,
        request: baasplus_models.QueryBlocrBusinesslicenseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBlocrBusinesslicenseResponse:
        """
        Description: AI认知服务营业执照ocr服务
        Summary: AI认知服务营业执照ocr服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBlocrBusinesslicenseResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.blocr.businesslicense.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_invoicesocr_vatinvoice(
        self,
        request: baasplus_models.QueryInvoicesocrVatinvoiceRequest,
    ) -> baasplus_models.QueryInvoicesocrVatinvoiceResponse:
        """
        Description: AI认知服务增值税发票ocr识别
        Summary: AI认知服务增值税发票ocr识别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_invoicesocr_vatinvoice_ex(request, headers, runtime)

    async def query_invoicesocr_vatinvoice_async(
        self,
        request: baasplus_models.QueryInvoicesocrVatinvoiceRequest,
    ) -> baasplus_models.QueryInvoicesocrVatinvoiceResponse:
        """
        Description: AI认知服务增值税发票ocr识别
        Summary: AI认知服务增值税发票ocr识别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_invoicesocr_vatinvoice_ex_async(request, headers, runtime)

    def query_invoicesocr_vatinvoice_ex(
        self,
        request: baasplus_models.QueryInvoicesocrVatinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryInvoicesocrVatinvoiceResponse:
        """
        Description: AI认知服务增值税发票ocr识别
        Summary: AI认知服务增值税发票ocr识别
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryInvoicesocrVatinvoiceResponse().from_map(
            self.do_request('1.0', 'baas.plus.invoicesocr.vatinvoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_invoicesocr_vatinvoice_ex_async(
        self,
        request: baasplus_models.QueryInvoicesocrVatinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryInvoicesocrVatinvoiceResponse:
        """
        Description: AI认知服务增值税发票ocr识别
        Summary: AI认知服务增值税发票ocr识别
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryInvoicesocrVatinvoiceResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.invoicesocr.vatinvoice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bmpbrowser_privilege(
        self,
        request: baasplus_models.QueryBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.QueryBmpbrowserPrivilegeResponse:
        """
        Description: 查询用户链上交易移动端查看权限
        Summary: 查询用户链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bmpbrowser_privilege_ex(request, headers, runtime)

    async def query_bmpbrowser_privilege_async(
        self,
        request: baasplus_models.QueryBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.QueryBmpbrowserPrivilegeResponse:
        """
        Description: 查询用户链上交易移动端查看权限
        Summary: 查询用户链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bmpbrowser_privilege_ex_async(request, headers, runtime)

    def query_bmpbrowser_privilege_ex(
        self,
        request: baasplus_models.QueryBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBmpbrowserPrivilegeResponse:
        """
        Description: 查询用户链上交易移动端查看权限
        Summary: 查询用户链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBmpbrowserPrivilegeResponse().from_map(
            self.do_request('1.0', 'baas.plus.bmpbrowser.privilege.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bmpbrowser_privilege_ex_async(
        self,
        request: baasplus_models.QueryBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.QueryBmpbrowserPrivilegeResponse:
        """
        Description: 查询用户链上交易移动端查看权限
        Summary: 查询用户链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBmpbrowserPrivilegeResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.bmpbrowser.privilege.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_bmpbrowser_privilege(
        self,
        request: baasplus_models.CancelBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.CancelBmpbrowserPrivilegeResponse:
        """
        Description: 批量取消 链上交易移动端查看权限
        Summary: 批量取消 链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_bmpbrowser_privilege_ex(request, headers, runtime)

    async def cancel_bmpbrowser_privilege_async(
        self,
        request: baasplus_models.CancelBmpbrowserPrivilegeRequest,
    ) -> baasplus_models.CancelBmpbrowserPrivilegeResponse:
        """
        Description: 批量取消 链上交易移动端查看权限
        Summary: 批量取消 链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_bmpbrowser_privilege_ex_async(request, headers, runtime)

    def cancel_bmpbrowser_privilege_ex(
        self,
        request: baasplus_models.CancelBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CancelBmpbrowserPrivilegeResponse:
        """
        Description: 批量取消 链上交易移动端查看权限
        Summary: 批量取消 链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.CancelBmpbrowserPrivilegeResponse().from_map(
            self.do_request('1.0', 'baas.plus.bmpbrowser.privilege.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_bmpbrowser_privilege_ex_async(
        self,
        request: baasplus_models.CancelBmpbrowserPrivilegeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasplus_models.CancelBmpbrowserPrivilegeResponse:
        """
        Description: 批量取消 链上交易移动端查看权限
        Summary: 批量取消 链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.CancelBmpbrowserPrivilegeResponse().from_map(
            await self.do_request_async('1.0', 'baas.plus.bmpbrowser.privilege.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
