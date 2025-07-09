# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_ed7107878c564eda98e507d7451aae75 import models as ak_ed_7107878c_564eda_98e_507d_7451aae_75_models
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
        config: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.Config,
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
            # 数字人平台--角色信息
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
                    'sdk_version': '1.1.9',
                    '_prod_code': 'ak_ed7107878c564eda98e507d7451aae75',
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
            # 数字人平台--角色信息
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
                    'sdk_version': '1.1.9',
                    '_prod_code': 'ak_ed7107878c564eda98e507d7451aae75',
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

    def list_universalsaas_digitalhuman_human(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人角色列表查询接口
        Summary: 数字人角色列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_human_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_human_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人角色列表查询接口
        Summary: 数字人角色列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_human_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_human_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人角色列表查询接口
        Summary: 数字人角色列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.human.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_human_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人角色列表查询接口
        Summary: 数字人角色列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanHumanResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.human.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_library(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 知识库列表查询接口
        Summary: 知识库列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_library_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_library_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 知识库列表查询接口
        Summary: 知识库列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_library_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_library_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 知识库列表查询接口
        Summary: 知识库列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.library.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_library_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 知识库列表查询接口
        Summary: 知识库列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLibraryResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.library.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_universalsaas_digitalhuman_library(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 创建知识库接口
        Summary: 创建知识库接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_universalsaas_digitalhuman_library_ex(request, headers, runtime)

    async def add_universalsaas_digitalhuman_library_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 创建知识库接口
        Summary: 创建知识库接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_universalsaas_digitalhuman_library_ex_async(request, headers, runtime)

    def add_universalsaas_digitalhuman_library_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 创建知识库接口
        Summary: 创建知识库接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.library.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_universalsaas_digitalhuman_library_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 创建知识库接口
        Summary: 创建知识库接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLibraryResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.library.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_universalsaas_digitalhuman_library(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 编辑知识库接口
        Summary: 编辑知识库接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_universalsaas_digitalhuman_library_ex(request, headers, runtime)

    async def update_universalsaas_digitalhuman_library_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 编辑知识库接口
        Summary: 编辑知识库接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_universalsaas_digitalhuman_library_ex_async(request, headers, runtime)

    def update_universalsaas_digitalhuman_library_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 编辑知识库接口
        Summary: 编辑知识库接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.library.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_universalsaas_digitalhuman_library_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 编辑知识库接口
        Summary: 编辑知识库接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLibraryResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.library.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_universalsaas_digitalhuman_library(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 删除知识库接口
        Summary: 删除知识库接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_universalsaas_digitalhuman_library_ex(request, headers, runtime)

    async def delete_universalsaas_digitalhuman_library_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 删除知识库接口
        Summary: 删除知识库接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_universalsaas_digitalhuman_library_ex_async(request, headers, runtime)

    def delete_universalsaas_digitalhuman_library_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 删除知识库接口
        Summary: 删除知识库接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.library.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_universalsaas_digitalhuman_library_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryResponse:
        """
        Description: 删除知识库接口
        Summary: 删除知识库接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLibraryResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.library.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_universalsaas_digitalhuman_knowledge(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 新增知识点接口
        Summary: 新增知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_universalsaas_digitalhuman_knowledge_ex(request, headers, runtime)

    async def add_universalsaas_digitalhuman_knowledge_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 新增知识点接口
        Summary: 新增知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_universalsaas_digitalhuman_knowledge_ex_async(request, headers, runtime)

    def add_universalsaas_digitalhuman_knowledge_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 新增知识点接口
        Summary: 新增知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_universalsaas_digitalhuman_knowledge_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 新增知识点接口
        Summary: 新增知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanKnowledgeResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_universalsaas_digitalhuman_knowledge(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 编辑知识点接口
        Summary: 编辑知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_universalsaas_digitalhuman_knowledge_ex(request, headers, runtime)

    async def update_universalsaas_digitalhuman_knowledge_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 编辑知识点接口
        Summary: 编辑知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_universalsaas_digitalhuman_knowledge_ex_async(request, headers, runtime)

    def update_universalsaas_digitalhuman_knowledge_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 编辑知识点接口
        Summary: 编辑知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_universalsaas_digitalhuman_knowledge_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 编辑知识点接口
        Summary: 编辑知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanKnowledgeResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_universalsaas_digitalhuman_knowledge(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 发布知识点接口
        Summary: 发布知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_universalsaas_digitalhuman_knowledge_ex(request, headers, runtime)

    async def online_universalsaas_digitalhuman_knowledge_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 发布知识点接口
        Summary: 发布知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_universalsaas_digitalhuman_knowledge_ex_async(request, headers, runtime)

    def online_universalsaas_digitalhuman_knowledge_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 发布知识点接口
        Summary: 发布知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_universalsaas_digitalhuman_knowledge_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 发布知识点接口
        Summary: 发布知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanKnowledgeResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_universalsaas_digitalhuman_knowledge(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 下线知识点接口
        Summary: 下线知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_universalsaas_digitalhuman_knowledge_ex(request, headers, runtime)

    async def offline_universalsaas_digitalhuman_knowledge_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 下线知识点接口
        Summary: 下线知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_universalsaas_digitalhuman_knowledge_ex_async(request, headers, runtime)

    def offline_universalsaas_digitalhuman_knowledge_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 下线知识点接口
        Summary: 下线知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_universalsaas_digitalhuman_knowledge_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 下线知识点接口
        Summary: 下线知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanKnowledgeResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_llm_chat(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 查询大模型对话列表接口
        Summary: 查询大模型对话列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_llm_chat_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_llm_chat_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 查询大模型对话列表接口
        Summary: 查询大模型对话列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_llm_chat_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_llm_chat_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 查询大模型对话列表接口
        Summary: 查询大模型对话列表接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.chat.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_llm_chat_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 查询大模型对话列表接口
        Summary: 查询大模型对话列表接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmChatResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.chat.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_universalsaas_digitalhuman_chat_setting(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 新增交互配置接口
        Summary: 新增交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_universalsaas_digitalhuman_chat_setting_ex(request, headers, runtime)

    async def add_universalsaas_digitalhuman_chat_setting_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 新增交互配置接口
        Summary: 新增交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_universalsaas_digitalhuman_chat_setting_ex_async(request, headers, runtime)

    def add_universalsaas_digitalhuman_chat_setting_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 新增交互配置接口
        Summary: 新增交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.chat.setting.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_universalsaas_digitalhuman_chat_setting_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 新增交互配置接口
        Summary: 新增交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanChatSettingResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.chat.setting.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_universalsaas_digitalhuman_chat_setting(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 编辑交互配置接口
        Summary: 编辑交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_universalsaas_digitalhuman_chat_setting_ex(request, headers, runtime)

    async def set_universalsaas_digitalhuman_chat_setting_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 编辑交互配置接口
        Summary: 编辑交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_universalsaas_digitalhuman_chat_setting_ex_async(request, headers, runtime)

    def set_universalsaas_digitalhuman_chat_setting_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 编辑交互配置接口
        Summary: 编辑交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.chat.setting.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_universalsaas_digitalhuman_chat_setting_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 编辑交互配置接口
        Summary: 编辑交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.SetUniversalsaasDigitalhumanChatSettingResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.chat.setting.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_universalsaas_digitalhuman_chat_setting(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 删除交互配置接口
        Summary: 删除交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_universalsaas_digitalhuman_chat_setting_ex(request, headers, runtime)

    async def delete_universalsaas_digitalhuman_chat_setting_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 删除交互配置接口
        Summary: 删除交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_universalsaas_digitalhuman_chat_setting_ex_async(request, headers, runtime)

    def delete_universalsaas_digitalhuman_chat_setting_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 删除交互配置接口
        Summary: 删除交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.chat.setting.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_universalsaas_digitalhuman_chat_setting_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 删除交互配置接口
        Summary: 删除交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanChatSettingResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.chat.setting.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_universalsaas_digitalhuman_chat_setting(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 发布交互配置接口
        Summary: 发布交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_universalsaas_digitalhuman_chat_setting_ex(request, headers, runtime)

    async def online_universalsaas_digitalhuman_chat_setting_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 发布交互配置接口
        Summary: 发布交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_universalsaas_digitalhuman_chat_setting_ex_async(request, headers, runtime)

    def online_universalsaas_digitalhuman_chat_setting_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 发布交互配置接口
        Summary: 发布交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.chat.setting.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_universalsaas_digitalhuman_chat_setting_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 发布交互配置接口
        Summary: 发布交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OnlineUniversalsaasDigitalhumanChatSettingResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.chat.setting.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_universalsaas_digitalhuman_chat_setting(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 下线交互配置接口
        Summary: 下线交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_universalsaas_digitalhuman_chat_setting_ex(request, headers, runtime)

    async def offline_universalsaas_digitalhuman_chat_setting_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 下线交互配置接口
        Summary: 下线交互配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_universalsaas_digitalhuman_chat_setting_ex_async(request, headers, runtime)

    def offline_universalsaas_digitalhuman_chat_setting_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 下线交互配置接口
        Summary: 下线交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.chat.setting.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_universalsaas_digitalhuman_chat_setting_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingResponse:
        """
        Description: 下线交互配置接口
        Summary: 下线交互配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.OfflineUniversalsaasDigitalhumanChatSettingResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.chat.setting.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_model(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelResponse:
        """
        Description: 数字人形象列表接口
        Summary: 数字人形象列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_model_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_model_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelResponse:
        """
        Description: 数字人形象列表接口
        Summary: 数字人形象列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_model_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_model_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelResponse:
        """
        Description: 数字人形象列表接口
        Summary: 数字人形象列表接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_model_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelResponse:
        """
        Description: 数字人形象列表接口
        Summary: 数字人形象列表接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanModelResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_voice(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色列表
        Summary: 数字人平台音色列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_voice_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_voice_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色列表
        Summary: 数字人平台音色列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_voice_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_voice_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色列表
        Summary: 数字人平台音色列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_voice_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色列表
        Summary: 数字人平台音色列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanVoiceResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_universalsaas_digitalhuman_voice(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色试听接口
        Summary: 数字人平台音色试听接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_universalsaas_digitalhuman_voice_ex(request, headers, runtime)

    async def preview_universalsaas_digitalhuman_voice_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色试听接口
        Summary: 数字人平台音色试听接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_universalsaas_digitalhuman_voice_ex_async(request, headers, runtime)

    def preview_universalsaas_digitalhuman_voice_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色试听接口
        Summary: 数字人平台音色试听接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.voice.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_universalsaas_digitalhuman_voice_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceResponse:
        """
        Description: 数字人平台音色试听接口
        Summary: 数字人平台音色试听接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.PreviewUniversalsaasDigitalhumanVoiceResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.voice.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_universalsaas_digitalhuman_human(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人平台角色创建与更新接口
        Summary: 数字人平台角色创建与更新接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_universalsaas_digitalhuman_human_ex(request, headers, runtime)

    async def update_universalsaas_digitalhuman_human_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人平台角色创建与更新接口
        Summary: 数字人平台角色创建与更新接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_universalsaas_digitalhuman_human_ex_async(request, headers, runtime)

    def update_universalsaas_digitalhuman_human_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人平台角色创建与更新接口
        Summary: 数字人平台角色创建与更新接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.human.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_universalsaas_digitalhuman_human_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 数字人平台角色创建与更新接口
        Summary: 数字人平台角色创建与更新接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanHumanResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.human.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_universalsaas_digitalhuman_human(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 删除数字人角色接口
        Summary: 删除数字人角色接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_universalsaas_digitalhuman_human_ex(request, headers, runtime)

    async def delete_universalsaas_digitalhuman_human_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 删除数字人角色接口
        Summary: 删除数字人角色接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_universalsaas_digitalhuman_human_ex_async(request, headers, runtime)

    def delete_universalsaas_digitalhuman_human_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 删除数字人角色接口
        Summary: 删除数字人角色接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.human.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_universalsaas_digitalhuman_human_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanResponse:
        """
        Description: 删除数字人角色接口
        Summary: 删除数字人角色接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanHumanResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.human.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_universalsaas_digitalhuman_knowledge(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 删除知识点接口
        Summary: 删除知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_universalsaas_digitalhuman_knowledge_ex(request, headers, runtime)

    async def delete_universalsaas_digitalhuman_knowledge_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 删除知识点接口
        Summary: 删除知识点接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_universalsaas_digitalhuman_knowledge_ex_async(request, headers, runtime)

    def delete_universalsaas_digitalhuman_knowledge_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 删除知识点接口
        Summary: 删除知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_universalsaas_digitalhuman_knowledge_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 删除知识点接口
        Summary: 删除知识点接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanKnowledgeResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_universalsaas_digitalhuman_knowledge_importtask(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 创建批量导入任务
        Summary: 创建批量导入任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_universalsaas_digitalhuman_knowledge_importtask_ex(request, headers, runtime)

    async def create_universalsaas_digitalhuman_knowledge_importtask_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 创建批量导入任务
        Summary: 创建批量导入任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_universalsaas_digitalhuman_knowledge_importtask_ex_async(request, headers, runtime)

    def create_universalsaas_digitalhuman_knowledge_importtask_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 创建批量导入任务
        Summary: 创建批量导入任务
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='universalsaas.digitalhuman.knowledge.importtask.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_universalsaas_digitalhuman_knowledge_importtask_response = ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_universalsaas_digitalhuman_knowledge_importtask_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.importtask.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_universalsaas_digitalhuman_knowledge_importtask_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 创建批量导入任务
        Summary: 创建批量导入任务
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='universalsaas.digitalhuman.knowledge.importtask.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_universalsaas_digitalhuman_knowledge_importtask_response = ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_universalsaas_digitalhuman_knowledge_importtask_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.importtask.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_universalsaas_digitalhuman_knowledge_importtask(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 查询批量导入任务
        Summary: 查询批量导入任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_universalsaas_digitalhuman_knowledge_importtask_ex(request, headers, runtime)

    async def query_universalsaas_digitalhuman_knowledge_importtask_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 查询批量导入任务
        Summary: 查询批量导入任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_universalsaas_digitalhuman_knowledge_importtask_ex_async(request, headers, runtime)

    def query_universalsaas_digitalhuman_knowledge_importtask_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 查询批量导入任务
        Summary: 查询批量导入任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.importtask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_universalsaas_digitalhuman_knowledge_importtask_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse:
        """
        Description: 查询批量导入任务
        Summary: 查询批量导入任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.importtask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_universalsaas_digitalhuman_knowledge(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 知识点批量导出
        Summary: 知识点批量导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_universalsaas_digitalhuman_knowledge_ex(request, headers, runtime)

    async def export_universalsaas_digitalhuman_knowledge_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 知识点批量导出
        Summary: 知识点批量导出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_universalsaas_digitalhuman_knowledge_ex_async(request, headers, runtime)

    def export_universalsaas_digitalhuman_knowledge_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 知识点批量导出
        Summary: 知识点批量导出
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.knowledge.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_universalsaas_digitalhuman_knowledge_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeResponse:
        """
        Description: 知识点批量导出
        Summary: 知识点批量导出
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ExportUniversalsaasDigitalhumanKnowledgeResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.knowledge.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_stream(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 获取实时流列表接口
        Summary: 获取实时流列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_stream_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_stream_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 获取实时流列表接口
        Summary: 获取实时流列表接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_stream_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_stream_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 获取实时流列表接口
        Summary: 获取实时流列表接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.stream.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_stream_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 获取实时流列表接口
        Summary: 获取实时流列表接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanStreamResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.stream.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_universalsaas_digitalhuman_stream(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 关闭实时流接口
        Summary: 关闭实时流接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_universalsaas_digitalhuman_stream_ex(request, headers, runtime)

    async def stop_universalsaas_digitalhuman_stream_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 关闭实时流接口
        Summary: 关闭实时流接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_universalsaas_digitalhuman_stream_ex_async(request, headers, runtime)

    def stop_universalsaas_digitalhuman_stream_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 关闭实时流接口
        Summary: 关闭实时流接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.stream.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_universalsaas_digitalhuman_stream_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamResponse:
        """
        Description: 关闭实时流接口
        Summary: 关闭实时流接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.StopUniversalsaasDigitalhumanStreamResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.stream.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_universalsaas_digitalhuman_llm_chat(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 大模型对话配置明细
        Summary: 大模型对话配置明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_universalsaas_digitalhuman_llm_chat_ex(request, headers, runtime)

    async def detail_universalsaas_digitalhuman_llm_chat_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 大模型对话配置明细
        Summary: 大模型对话配置明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_universalsaas_digitalhuman_llm_chat_ex_async(request, headers, runtime)

    def detail_universalsaas_digitalhuman_llm_chat_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 大模型对话配置明细
        Summary: 大模型对话配置明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.chat.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_universalsaas_digitalhuman_llm_chat_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 大模型对话配置明细
        Summary: 大模型对话配置明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmChatResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.chat.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_universalsaas_digitalhuman_llm_chat(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 新增大模型对话配置
        Summary: 新增大模型对话配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_universalsaas_digitalhuman_llm_chat_ex(request, headers, runtime)

    async def add_universalsaas_digitalhuman_llm_chat_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 新增大模型对话配置
        Summary: 新增大模型对话配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_universalsaas_digitalhuman_llm_chat_ex_async(request, headers, runtime)

    def add_universalsaas_digitalhuman_llm_chat_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 新增大模型对话配置
        Summary: 新增大模型对话配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.chat.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_universalsaas_digitalhuman_llm_chat_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 新增大模型对话配置
        Summary: 新增大模型对话配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmChatResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.chat.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_universalsaas_digitalhuman_llm_chat(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 更新大模型对话配置
        Summary: 更新大模型对话配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_universalsaas_digitalhuman_llm_chat_ex(request, headers, runtime)

    async def update_universalsaas_digitalhuman_llm_chat_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 更新大模型对话配置
        Summary: 更新大模型对话配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_universalsaas_digitalhuman_llm_chat_ex_async(request, headers, runtime)

    def update_universalsaas_digitalhuman_llm_chat_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 更新大模型对话配置
        Summary: 更新大模型对话配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.chat.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_universalsaas_digitalhuman_llm_chat_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 更新大模型对话配置
        Summary: 更新大模型对话配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmChatResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.chat.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_universalsaas_digitalhuman_llm_chat(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 删除大模型对话配置
        Summary: 删除大模型对话配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_universalsaas_digitalhuman_llm_chat_ex(request, headers, runtime)

    async def delete_universalsaas_digitalhuman_llm_chat_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 删除大模型对话配置
        Summary: 删除大模型对话配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_universalsaas_digitalhuman_llm_chat_ex_async(request, headers, runtime)

    def delete_universalsaas_digitalhuman_llm_chat_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 删除大模型对话配置
        Summary: 删除大模型对话配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.chat.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_universalsaas_digitalhuman_llm_chat_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatResponse:
        """
        Description: 删除大模型对话配置
        Summary: 删除大模型对话配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmChatResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.chat.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_universalsaas_digitalhuman_llm_model(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 新增模型配置
        Summary: 新增模型配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_universalsaas_digitalhuman_llm_model_ex(request, headers, runtime)

    async def add_universalsaas_digitalhuman_llm_model_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 新增模型配置
        Summary: 新增模型配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_universalsaas_digitalhuman_llm_model_ex_async(request, headers, runtime)

    def add_universalsaas_digitalhuman_llm_model_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 新增模型配置
        Summary: 新增模型配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.model.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_universalsaas_digitalhuman_llm_model_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 新增模型配置
        Summary: 新增模型配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.AddUniversalsaasDigitalhumanLlmModelResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.model.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_universalsaas_digitalhuman_llm_model(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 删除模型配置
        Summary: 删除模型配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_universalsaas_digitalhuman_llm_model_ex(request, headers, runtime)

    async def delete_universalsaas_digitalhuman_llm_model_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 删除模型配置
        Summary: 删除模型配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_universalsaas_digitalhuman_llm_model_ex_async(request, headers, runtime)

    def delete_universalsaas_digitalhuman_llm_model_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 删除模型配置
        Summary: 删除模型配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.model.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_universalsaas_digitalhuman_llm_model_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 删除模型配置
        Summary: 删除模型配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DeleteUniversalsaasDigitalhumanLlmModelResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.model.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_universalsaas_digitalhuman_llm_model(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 更新模型配置
        Summary: 更新模型配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_universalsaas_digitalhuman_llm_model_ex(request, headers, runtime)

    async def update_universalsaas_digitalhuman_llm_model_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 更新模型配置
        Summary: 更新模型配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_universalsaas_digitalhuman_llm_model_ex_async(request, headers, runtime)

    def update_universalsaas_digitalhuman_llm_model_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 更新模型配置
        Summary: 更新模型配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.model.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_universalsaas_digitalhuman_llm_model_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 更新模型配置
        Summary: 更新模型配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.UpdateUniversalsaasDigitalhumanLlmModelResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.model.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_universalsaas_digitalhuman_llm_model(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 获取模型配置列表
        Summary: 获取模型配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_universalsaas_digitalhuman_llm_model_ex(request, headers, runtime)

    async def list_universalsaas_digitalhuman_llm_model_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 获取模型配置列表
        Summary: 获取模型配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_universalsaas_digitalhuman_llm_model_ex_async(request, headers, runtime)

    def list_universalsaas_digitalhuman_llm_model_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 获取模型配置列表
        Summary: 获取模型配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_universalsaas_digitalhuman_llm_model_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 获取模型配置列表
        Summary: 获取模型配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.ListUniversalsaasDigitalhumanLlmModelResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.model.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_universalsaas_digitalhuman_llm_model(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 查询模型配置明细
        Summary: 查询模型配置明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_universalsaas_digitalhuman_llm_model_ex(request, headers, runtime)

    async def detail_universalsaas_digitalhuman_llm_model_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 查询模型配置明细
        Summary: 查询模型配置明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_universalsaas_digitalhuman_llm_model_ex_async(request, headers, runtime)

    def detail_universalsaas_digitalhuman_llm_model_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 查询模型配置明细
        Summary: 查询模型配置明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelResponse(),
            self.do_request('1.0', 'universalsaas.digitalhuman.llm.model.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_universalsaas_digitalhuman_llm_model_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelResponse:
        """
        Description: 查询模型配置明细
        Summary: 查询模型配置明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.DetailUniversalsaasDigitalhumanLlmModelResponse(),
            await self.do_request_async('1.0', 'universalsaas.digitalhuman.llm.model.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ed_7107878c_564eda_98e_507d_7451aae_75_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
