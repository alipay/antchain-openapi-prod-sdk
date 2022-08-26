# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_122342269ba34053ab6e5304d82e7358 import models as ak__122342269ba_34053ab_6e_5304d_82e_7358_models
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
        config: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.Config,
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
            # 可访问数据关系信息
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_122342269ba34053ab6e5304d82e7358',
                    '_prod_channel': 'saas'
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
            # 可访问数据关系信息
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_122342269ba34053ab6e5304d82e7358',
                    '_prod_channel': 'saas'
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

    def start_baas_odats_accesschain_authorize(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 授权跨链数据访问
        Summary: 授权跨链数据访问
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_odats_accesschain_authorize_ex(request, headers, runtime)

    async def start_baas_odats_accesschain_authorize_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 授权跨链数据访问
        Summary: 授权跨链数据访问
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_odats_accesschain_authorize_ex_async(request, headers, runtime)

    def start_baas_odats_accesschain_authorize_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 授权跨链数据访问
        Summary: 授权跨链数据访问
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeResponse(),
            self.do_request('1.0', 'baas.odats.accesschain.authorize.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_odats_accesschain_authorize_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 授权跨链数据访问
        Summary: 授权跨链数据访问
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsAccesschainAuthorizeResponse(),
            await self.do_request_async('1.0', 'baas.odats.accesschain.authorize.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baas_odats_accesschain_authorize(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 更新跨链数据访问权限
        Summary: 更新跨链数据访问权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baas_odats_accesschain_authorize_ex(request, headers, runtime)

    async def update_baas_odats_accesschain_authorize_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 更新跨链数据访问权限
        Summary: 更新跨链数据访问权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baas_odats_accesschain_authorize_ex_async(request, headers, runtime)

    def update_baas_odats_accesschain_authorize_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 更新跨链数据访问权限
        Summary: 更新跨链数据访问权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeResponse(),
            self.do_request('1.0', 'baas.odats.accesschain.authorize.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baas_odats_accesschain_authorize_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeResponse:
        """
        Description: 更新跨链数据访问权限
        Summary: 更新跨链数据访问权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsAccesschainAuthorizeResponse(),
            await self.do_request_async('1.0', 'baas.odats.accesschain.authorize.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_baas_odats_accesschain_authorized(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedResponse:
        """
        Description: 获取链授权访问的链列表
        Summary: 获取链授权访问的链列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_baas_odats_accesschain_authorized_ex(request, headers, runtime)

    async def list_baas_odats_accesschain_authorized_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedResponse:
        """
        Description: 获取链授权访问的链列表
        Summary: 获取链授权访问的链列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_baas_odats_accesschain_authorized_ex_async(request, headers, runtime)

    def list_baas_odats_accesschain_authorized_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedResponse:
        """
        Description: 获取链授权访问的链列表
        Summary: 获取链授权访问的链列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedResponse(),
            self.do_request('1.0', 'baas.odats.accesschain.authorized.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_baas_odats_accesschain_authorized_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedResponse:
        """
        Description: 获取链授权访问的链列表
        Summary: 获取链授权访问的链列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainAuthorizedResponse(),
            await self.do_request_async('1.0', 'baas.odats.accesschain.authorized.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_baas_odats_accesschain_granted(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedResponse:
        """
        Description: 查询被授权访问数据的映射关系列表
        Summary: 查询被授权访问数据的映射关系列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_baas_odats_accesschain_granted_ex(request, headers, runtime)

    async def list_baas_odats_accesschain_granted_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedResponse:
        """
        Description: 查询被授权访问数据的映射关系列表
        Summary: 查询被授权访问数据的映射关系列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_baas_odats_accesschain_granted_ex_async(request, headers, runtime)

    def list_baas_odats_accesschain_granted_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedResponse:
        """
        Description: 查询被授权访问数据的映射关系列表
        Summary: 查询被授权访问数据的映射关系列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedResponse(),
            self.do_request('1.0', 'baas.odats.accesschain.granted.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_baas_odats_accesschain_granted_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedResponse:
        """
        Description: 查询被授权访问数据的映射关系列表
        Summary: 查询被授权访问数据的映射关系列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainGrantedResponse(),
            await self.do_request_async('1.0', 'baas.odats.accesschain.granted.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_baas_odats_accesschain_resourcetype(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeResponse:
        """
        Description: 获取指定链提供的可访问的资源类型
        Summary: 获取指定链提供的可访问的资源类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_baas_odats_accesschain_resourcetype_ex(request, headers, runtime)

    async def list_baas_odats_accesschain_resourcetype_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeResponse:
        """
        Description: 获取指定链提供的可访问的资源类型
        Summary: 获取指定链提供的可访问的资源类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_baas_odats_accesschain_resourcetype_ex_async(request, headers, runtime)

    def list_baas_odats_accesschain_resourcetype_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeResponse:
        """
        Description: 获取指定链提供的可访问的资源类型
        Summary: 获取指定链提供的可访问的资源类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeResponse(),
            self.do_request('1.0', 'baas.odats.accesschain.resourcetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_baas_odats_accesschain_resourcetype_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeResponse:
        """
        Description: 获取指定链提供的可访问的资源类型
        Summary: 获取指定链提供的可访问的资源类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsAccesschainResourcetypeResponse(),
            await self.do_request_async('1.0', 'baas.odats.accesschain.resourcetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_baas_odats_acl(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclResponse:
        """
        Description: 撤销跨链访问数据/调用权限
        Summary: 撤销跨链访问数据/调用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_baas_odats_acl_ex(request, headers, runtime)

    async def disable_baas_odats_acl_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclResponse:
        """
        Description: 撤销跨链访问数据/调用权限
        Summary: 撤销跨链访问数据/调用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_baas_odats_acl_ex_async(request, headers, runtime)

    def disable_baas_odats_acl_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclResponse:
        """
        Description: 撤销跨链访问数据/调用权限
        Summary: 撤销跨链访问数据/调用权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclResponse(),
            self.do_request('1.0', 'baas.odats.acl.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_baas_odats_acl_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclResponse:
        """
        Description: 撤销跨链访问数据/调用权限
        Summary: 撤销跨链访问数据/调用权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.DisableBaasOdatsAclResponse(),
            await self.do_request_async('1.0', 'baas.odats.acl.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_activestatus(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusResponse:
        """
        Description: 查询用户是否已经开通odats服务
        Summary: 查询用户是否已经开通odats服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_activestatus_ex(request, headers, runtime)

    async def query_baas_odats_activestatus_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusResponse:
        """
        Description: 查询用户是否已经开通odats服务
        Summary: 查询用户是否已经开通odats服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_activestatus_ex_async(request, headers, runtime)

    def query_baas_odats_activestatus_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusResponse:
        """
        Description: 查询用户是否已经开通odats服务
        Summary: 查询用户是否已经开通odats服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusResponse(),
            self.do_request('1.0', 'baas.odats.activestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_activestatus_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusResponse:
        """
        Description: 查询用户是否已经开通odats服务
        Summary: 查询用户是否已经开通odats服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsActivestatusResponse(),
            await self.do_request_async('1.0', 'baas.odats.activestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_agreement(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementResponse:
        """
        Description: 查询用户是否已经同意odats服务协议
        Summary: 查询用户是否已经同意odats服务协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_agreement_ex(request, headers, runtime)

    async def query_baas_odats_agreement_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementResponse:
        """
        Description: 查询用户是否已经同意odats服务协议
        Summary: 查询用户是否已经同意odats服务协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_agreement_ex_async(request, headers, runtime)

    def query_baas_odats_agreement_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementResponse:
        """
        Description: 查询用户是否已经同意odats服务协议
        Summary: 查询用户是否已经同意odats服务协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementResponse(),
            self.do_request('1.0', 'baas.odats.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_agreement_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementResponse:
        """
        Description: 查询用户是否已经同意odats服务协议
        Summary: 查询用户是否已经同意odats服务协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsAgreementResponse(),
            await self.do_request_async('1.0', 'baas.odats.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_baas_odats_agreement(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementResponse:
        """
        Description: 用户同意授权之后保持状态
        Summary: 用户同意授权之后保持状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_baas_odats_agreement_ex(request, headers, runtime)

    async def save_baas_odats_agreement_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementResponse:
        """
        Description: 用户同意授权之后保持状态
        Summary: 用户同意授权之后保持状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_baas_odats_agreement_ex_async(request, headers, runtime)

    def save_baas_odats_agreement_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementResponse:
        """
        Description: 用户同意授权之后保持状态
        Summary: 用户同意授权之后保持状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementResponse(),
            self.do_request('1.0', 'baas.odats.agreement.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_baas_odats_agreement_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementResponse:
        """
        Description: 用户同意授权之后保持状态
        Summary: 用户同意授权之后保持状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.SaveBaasOdatsAgreementResponse(),
            await self.do_request_async('1.0', 'baas.odats.agreement.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_blockchain_baseinfo(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoResponse:
        """
        Description: 查询注册的链的基本信息
        Summary: 查询注册的链的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_blockchain_baseinfo_ex(request, headers, runtime)

    async def query_baas_odats_blockchain_baseinfo_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoResponse:
        """
        Description: 查询注册的链的基本信息
        Summary: 查询注册的链的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_blockchain_baseinfo_ex_async(request, headers, runtime)

    def query_baas_odats_blockchain_baseinfo_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoResponse:
        """
        Description: 查询注册的链的基本信息
        Summary: 查询注册的链的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoResponse(),
            self.do_request('1.0', 'baas.odats.blockchain.baseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_blockchain_baseinfo_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoResponse:
        """
        Description: 查询注册的链的基本信息
        Summary: 查询注册的链的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainBaseinfoResponse(),
            await self.do_request_async('1.0', 'baas.odats.blockchain.baseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_blockchain_contractinfo(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoResponse:
        """
        Description: 获取跨链合约信息
        Summary: 获取跨链合约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_blockchain_contractinfo_ex(request, headers, runtime)

    async def query_baas_odats_blockchain_contractinfo_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoResponse:
        """
        Description: 获取跨链合约信息
        Summary: 获取跨链合约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_blockchain_contractinfo_ex_async(request, headers, runtime)

    def query_baas_odats_blockchain_contractinfo_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoResponse:
        """
        Description: 获取跨链合约信息
        Summary: 获取跨链合约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoResponse(),
            self.do_request('1.0', 'baas.odats.blockchain.contractinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_blockchain_contractinfo_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoResponse:
        """
        Description: 获取跨链合约信息
        Summary: 获取跨链合约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsBlockchainContractinfoResponse(),
            await self.do_request_async('1.0', 'baas.odats.blockchain.contractinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_baas_odats_crosschaim_authorize(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeResponse:
        """
        Description: 更新跨链访问权限
        Summary: 更新跨链访问权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_baas_odats_crosschaim_authorize_ex(request, headers, runtime)

    async def update_baas_odats_crosschaim_authorize_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeResponse:
        """
        Description: 更新跨链访问权限
        Summary: 更新跨链访问权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_baas_odats_crosschaim_authorize_ex_async(request, headers, runtime)

    def update_baas_odats_crosschaim_authorize_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeResponse:
        """
        Description: 更新跨链访问权限
        Summary: 更新跨链访问权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeResponse(),
            self.do_request('1.0', 'baas.odats.crosschaim.authorize.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_baas_odats_crosschaim_authorize_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeResponse:
        """
        Description: 更新跨链访问权限
        Summary: 更新跨链访问权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.UpdateBaasOdatsCrosschaimAuthorizeResponse(),
            await self.do_request_async('1.0', 'baas.odats.crosschaim.authorize.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_odats_crosschain_authorize(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeResponse:
        """
        Description: 授权跨链合约调用权限
        Summary: 授权跨链合约调用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_odats_crosschain_authorize_ex(request, headers, runtime)

    async def start_baas_odats_crosschain_authorize_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeResponse:
        """
        Description: 授权跨链合约调用权限
        Summary: 授权跨链合约调用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_odats_crosschain_authorize_ex_async(request, headers, runtime)

    def start_baas_odats_crosschain_authorize_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeResponse:
        """
        Description: 授权跨链合约调用权限
        Summary: 授权跨链合约调用权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeResponse(),
            self.do_request('1.0', 'baas.odats.crosschain.authorize.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_odats_crosschain_authorize_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeResponse:
        """
        Description: 授权跨链合约调用权限
        Summary: 授权跨链合约调用权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsCrosschainAuthorizeResponse(),
            await self.do_request_async('1.0', 'baas.odats.crosschain.authorize.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_baas_odats_crosschain_authorized(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedResponse:
        """
        Description: 获取指定自有链已授权的信息列表
        Summary: 获取指定自有链已授权的信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_baas_odats_crosschain_authorized_ex(request, headers, runtime)

    async def list_baas_odats_crosschain_authorized_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedResponse:
        """
        Description: 获取指定自有链已授权的信息列表
        Summary: 获取指定自有链已授权的信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_baas_odats_crosschain_authorized_ex_async(request, headers, runtime)

    def list_baas_odats_crosschain_authorized_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedResponse:
        """
        Description: 获取指定自有链已授权的信息列表
        Summary: 获取指定自有链已授权的信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedResponse(),
            self.do_request('1.0', 'baas.odats.crosschain.authorized.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_baas_odats_crosschain_authorized_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedResponse:
        """
        Description: 获取指定自有链已授权的信息列表
        Summary: 获取指定自有链已授权的信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainAuthorizedResponse(),
            await self.do_request_async('1.0', 'baas.odats.crosschain.authorized.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_baas_odats_crosschain_granted(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedResponse:
        """
        Description: 获取目标链被授权的映射关系列表
        Summary: 获取目标链被授权的映射关系列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_baas_odats_crosschain_granted_ex(request, headers, runtime)

    async def list_baas_odats_crosschain_granted_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedResponse:
        """
        Description: 获取目标链被授权的映射关系列表
        Summary: 获取目标链被授权的映射关系列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_baas_odats_crosschain_granted_ex_async(request, headers, runtime)

    def list_baas_odats_crosschain_granted_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedResponse:
        """
        Description: 获取目标链被授权的映射关系列表
        Summary: 获取目标链被授权的映射关系列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedResponse(),
            self.do_request('1.0', 'baas.odats.crosschain.granted.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_baas_odats_crosschain_granted_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedResponse:
        """
        Description: 获取目标链被授权的映射关系列表
        Summary: 获取目标链被授权的映射关系列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsCrosschainGrantedResponse(),
            await self.do_request_async('1.0', 'baas.odats.crosschain.granted.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_domaincert(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertResponse:
        """
        Description: 获取域名证书
        Summary: 获取域名证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_domaincert_ex(request, headers, runtime)

    async def query_baas_odats_domaincert_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertResponse:
        """
        Description: 获取域名证书
        Summary: 获取域名证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_domaincert_ex_async(request, headers, runtime)

    def query_baas_odats_domaincert_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertResponse:
        """
        Description: 获取域名证书
        Summary: 获取域名证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertResponse(),
            self.do_request('1.0', 'baas.odats.domaincert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_domaincert_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertResponse:
        """
        Description: 获取域名证书
        Summary: 获取域名证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsDomaincertResponse(),
            await self.do_request_async('1.0', 'baas.odats.domaincert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_fabric_cc(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcResponse:
        """
        Description: 查询跨链合约
        Summary: 查询跨链CC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_fabric_cc_ex(request, headers, runtime)

    async def query_baas_odats_fabric_cc_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcResponse:
        """
        Description: 查询跨链合约
        Summary: 查询跨链CC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_fabric_cc_ex_async(request, headers, runtime)

    def query_baas_odats_fabric_cc_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcResponse:
        """
        Description: 查询跨链合约
        Summary: 查询跨链CC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcResponse(),
            self.do_request('1.0', 'baas.odats.fabric.cc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_fabric_cc_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcResponse:
        """
        Description: 查询跨链合约
        Summary: 查询跨链CC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricCcResponse(),
            await self.do_request_async('1.0', 'baas.odats.fabric.cc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_fabric_chaincodepath(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathResponse:
        """
        Description: 查询fabric CC的oss路径
        Summary: 查询fabric CC的oss路径
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_fabric_chaincodepath_ex(request, headers, runtime)

    async def query_baas_odats_fabric_chaincodepath_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathResponse:
        """
        Description: 查询fabric CC的oss路径
        Summary: 查询fabric CC的oss路径
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_fabric_chaincodepath_ex_async(request, headers, runtime)

    def query_baas_odats_fabric_chaincodepath_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathResponse:
        """
        Description: 查询fabric CC的oss路径
        Summary: 查询fabric CC的oss路径
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathResponse(),
            self.do_request('1.0', 'baas.odats.fabric.chaincodepath.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_fabric_chaincodepath_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathResponse:
        """
        Description: 查询fabric CC的oss路径
        Summary: 查询fabric CC的oss路径
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsFabricChaincodepathResponse(),
            await self.do_request_async('1.0', 'baas.odats.fabric.chaincodepath.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_odats_fabric_configyaml(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlResponse:
        """
        Description: 处理fabric配置文件
        Summary: 处理fabric配置文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_odats_fabric_configyaml_ex(request, headers, runtime)

    async def start_baas_odats_fabric_configyaml_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlResponse:
        """
        Description: 处理fabric配置文件
        Summary: 处理fabric配置文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_odats_fabric_configyaml_ex_async(request, headers, runtime)

    def start_baas_odats_fabric_configyaml_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlResponse:
        """
        Description: 处理fabric配置文件
        Summary: 处理fabric配置文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlResponse(),
            self.do_request('1.0', 'baas.odats.fabric.configyaml.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_odats_fabric_configyaml_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlResponse:
        """
        Description: 处理fabric配置文件
        Summary: 处理fabric配置文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricConfigyamlResponse(),
            await self.do_request_async('1.0', 'baas.odats.fabric.configyaml.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_odats_fabric(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricResponse:
        """
        Description: 注册fabric链
        Summary: 注册fabric链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_odats_fabric_ex(request, headers, runtime)

    async def start_baas_odats_fabric_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricResponse:
        """
        Description: 注册fabric链
        Summary: 注册fabric链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_odats_fabric_ex_async(request, headers, runtime)

    def start_baas_odats_fabric_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricResponse:
        """
        Description: 注册fabric链
        Summary: 注册fabric链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricResponse(),
            self.do_request('1.0', 'baas.odats.fabric.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_odats_fabric_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricResponse:
        """
        Description: 注册fabric链
        Summary: 注册fabric链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsFabricResponse(),
            await self.do_request_async('1.0', 'baas.odats.fabric.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_baas_odats_mychain(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainResponse:
        """
        Description: 向odats注册mychain链
        Summary: 向odats注册mychain链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_baas_odats_mychain_ex(request, headers, runtime)

    async def start_baas_odats_mychain_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainResponse:
        """
        Description: 向odats注册mychain链
        Summary: 向odats注册mychain链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_baas_odats_mychain_ex_async(request, headers, runtime)

    def start_baas_odats_mychain_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainResponse:
        """
        Description: 向odats注册mychain链
        Summary: 向odats注册mychain链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainResponse(),
            self.do_request('1.0', 'baas.odats.mychain.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_baas_odats_mychain_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainResponse:
        """
        Description: 向odats注册mychain链
        Summary: 向odats注册mychain链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.StartBaasOdatsMychainResponse(),
            await self.do_request_async('1.0', 'baas.odats.mychain.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_baas_odats_registeredblockchain(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainResponse:
        """
        Description: 查询注册的blockchain列表
        Summary: 查询注册的blockchain列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_baas_odats_registeredblockchain_ex(request, headers, runtime)

    async def list_baas_odats_registeredblockchain_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainResponse:
        """
        Description: 查询注册的blockchain列表
        Summary: 查询注册的blockchain列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_baas_odats_registeredblockchain_ex_async(request, headers, runtime)

    def list_baas_odats_registeredblockchain_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainResponse:
        """
        Description: 查询注册的blockchain列表
        Summary: 查询注册的blockchain列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainResponse(),
            self.do_request('1.0', 'baas.odats.registeredblockchain.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_baas_odats_registeredblockchain_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainResponse:
        """
        Description: 查询注册的blockchain列表
        Summary: 查询注册的blockchain列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.ListBaasOdatsRegisteredblockchainResponse(),
            await self.do_request_async('1.0', 'baas.odats.registeredblockchain.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baas_odats_udnscert(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertResponse:
        """
        Description: 获取udns证书
        Summary: 获取udns证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baas_odats_udnscert_ex(request, headers, runtime)

    async def query_baas_odats_udnscert_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertRequest,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertResponse:
        """
        Description: 获取udns证书
        Summary: 获取udns证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baas_odats_udnscert_ex_async(request, headers, runtime)

    def query_baas_odats_udnscert_ex(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertResponse:
        """
        Description: 获取udns证书
        Summary: 获取udns证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertResponse(),
            self.do_request('1.0', 'baas.odats.udnscert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baas_odats_udnscert_ex_async(
        self,
        request: ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertResponse:
        """
        Description: 获取udns证书
        Summary: 获取udns证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__122342269ba_34053ab_6e_5304d_82e_7358_models.QueryBaasOdatsUdnscertResponse(),
            await self.do_request_async('1.0', 'baas.odats.udnscert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
