# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from typing import Dict

from antchain_sdk_deps import models as deps_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from antchain_alipay_util.client import Client as AntchainUtilClient
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

    def __init__(
        self, 
        config: deps_models.Config,
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
        self._read_timeout = config.read_timeout
        self._connect_timeout = config.connect_timeout
        self._http_proxy = config.http_proxy
        self._https_proxy = config.https_proxy
        self._no_proxy = config.no_proxy
        self._socks_5proxy = config.socks_5proxy
        self._socks_5net_work = config.socks_5net_work
        self._max_idle_conns = config.max_idle_conns

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
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl,
            # 键值对
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '3.2.1'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'undefined'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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
            'retry': {
                'retryable': runtime.autoretry,
                'maxAttempts': UtilClient.default_number(runtime.max_attempts, 3)
            },
            'backoff': {
                'policy': UtilClient.default_string(runtime.backoff_policy, 'no'),
                'period': UtilClient.default_number(runtime.backoff_period, 1)
            },
            'ignoreSSL': runtime.ignore_ssl,
            # 键值对
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '3.2.1'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'undefined'),
                    'user-agent': UtilClient.get_user_agent(self._user_agent)
                }, headers)
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers['content-type'] = 'application/x-www-form-urlencoded'
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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

    def create_application(
        self,
        request: deps_models.CreateApplicationRequest,
    ) -> deps_models.CreateApplicationResponse:
        """
        Description: 创建一个应用。
        Summary: 创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_application_ex(request, headers, runtime)

    async def create_application_async(
        self,
        request: deps_models.CreateApplicationRequest,
    ) -> deps_models.CreateApplicationResponse:
        """
        Description: 创建一个应用。
        Summary: 创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_application_ex_async(request, headers, runtime)

    def create_application_ex(
        self,
        request: deps_models.CreateApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateApplicationResponse:
        """
        Description: 创建一个应用。
        Summary: 创建应用
        """
        UtilClient.validate_model(request)
        return deps_models.CreateApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_application_ex_async(
        self,
        request: deps_models.CreateApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateApplicationResponse:
        """
        Description: 创建一个应用。
        Summary: 创建应用
        """
        UtilClient.validate_model(request)
        return deps_models.CreateApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_application_service(
        self,
        request: deps_models.CreateApplicationServiceRequest,
    ) -> deps_models.CreateApplicationServiceResponse:
        """
        Description: 创建一个应用服务实例。
        Summary: 创建应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_application_service_ex(request, headers, runtime)

    async def create_application_service_async(
        self,
        request: deps_models.CreateApplicationServiceRequest,
    ) -> deps_models.CreateApplicationServiceResponse:
        """
        Description: 创建一个应用服务实例。
        Summary: 创建应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_application_service_ex_async(request, headers, runtime)

    def create_application_service_ex(
        self,
        request: deps_models.CreateApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateApplicationServiceResponse:
        """
        Description: 创建一个应用服务实例。
        Summary: 创建应用服务实例
        """
        UtilClient.validate_model(request)
        return deps_models.CreateApplicationServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.service.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_application_service_ex_async(
        self,
        request: deps_models.CreateApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateApplicationServiceResponse:
        """
        Description: 创建一个应用服务实例。
        Summary: 创建应用服务实例
        """
        UtilClient.validate_model(request)
        return deps_models.CreateApplicationServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.service.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enabled_application_service(
        self,
        request: deps_models.EnabledApplicationServiceRequest,
    ) -> deps_models.EnabledApplicationServiceResponse:
        """
        Description: 查询是否启用应用服务实例。
        Summary: 查询是否启用应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enabled_application_service_ex(request, headers, runtime)

    async def enabled_application_service_async(
        self,
        request: deps_models.EnabledApplicationServiceRequest,
    ) -> deps_models.EnabledApplicationServiceResponse:
        """
        Description: 查询是否启用应用服务实例。
        Summary: 查询是否启用应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enabled_application_service_ex_async(request, headers, runtime)

    def enabled_application_service_ex(
        self,
        request: deps_models.EnabledApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.EnabledApplicationServiceResponse:
        """
        Description: 查询是否启用应用服务实例。
        Summary: 查询是否启用应用服务实例
        """
        UtilClient.validate_model(request)
        return deps_models.EnabledApplicationServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.service.enabled', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enabled_application_service_ex_async(
        self,
        request: deps_models.EnabledApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.EnabledApplicationServiceResponse:
        """
        Description: 查询是否启用应用服务实例。
        Summary: 查询是否启用应用服务实例
        """
        UtilClient.validate_model(request)
        return deps_models.EnabledApplicationServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.service.enabled', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application(
        self,
        request: deps_models.GetApplicationRequest,
    ) -> deps_models.GetApplicationResponse:
        """
        Description: 获取一个应用详情。
        Summary: 获取应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_ex(request, headers, runtime)

    async def get_application_async(
        self,
        request: deps_models.GetApplicationRequest,
    ) -> deps_models.GetApplicationResponse:
        """
        Description: 获取一个应用详情。
        Summary: 获取应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_ex_async(request, headers, runtime)

    def get_application_ex(
        self,
        request: deps_models.GetApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationResponse:
        """
        Description: 获取一个应用详情。
        Summary: 获取应用
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_ex_async(
        self,
        request: deps_models.GetApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationResponse:
        """
        Description: 获取一个应用详情。
        Summary: 获取应用
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_service(
        self,
        request: deps_models.GetApplicationServiceRequest,
    ) -> deps_models.GetApplicationServiceResponse:
        """
        Description: 获取一个应用服务详情。
        Summary: 获取应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_service_ex(request, headers, runtime)

    async def get_application_service_async(
        self,
        request: deps_models.GetApplicationServiceRequest,
    ) -> deps_models.GetApplicationServiceResponse:
        """
        Description: 获取一个应用服务详情。
        Summary: 获取应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_service_ex_async(request, headers, runtime)

    def get_application_service_ex(
        self,
        request: deps_models.GetApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationServiceResponse:
        """
        Description: 获取一个应用服务详情。
        Summary: 获取应用服务
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.service.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_service_ex_async(
        self,
        request: deps_models.GetApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationServiceResponse:
        """
        Description: 获取一个应用服务详情。
        Summary: 获取应用服务
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.service.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_service(
        self,
        request: deps_models.QueryApplicationServiceRequest,
    ) -> deps_models.QueryApplicationServiceResponse:
        """
        Description: 查询应用服务实例列表。
        Summary: 查询应用服务实例列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_service_ex(request, headers, runtime)

    async def query_application_service_async(
        self,
        request: deps_models.QueryApplicationServiceRequest,
    ) -> deps_models.QueryApplicationServiceResponse:
        """
        Description: 查询应用服务实例列表。
        Summary: 查询应用服务实例列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_service_ex_async(request, headers, runtime)

    def query_application_service_ex(
        self,
        request: deps_models.QueryApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationServiceResponse:
        """
        Description: 查询应用服务实例列表。
        Summary: 查询应用服务实例列表
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_service_ex_async(
        self,
        request: deps_models.QueryApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationServiceResponse:
        """
        Description: 查询应用服务实例列表。
        Summary: 查询应用服务实例列表
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_application_service(
        self,
        request: deps_models.DeleteApplicationServiceRequest,
    ) -> deps_models.DeleteApplicationServiceResponse:
        """
        Description: 删除一个应用服务实例
        Summary: 删除一个应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_application_service_ex(request, headers, runtime)

    async def delete_application_service_async(
        self,
        request: deps_models.DeleteApplicationServiceRequest,
    ) -> deps_models.DeleteApplicationServiceResponse:
        """
        Description: 删除一个应用服务实例
        Summary: 删除一个应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_application_service_ex_async(request, headers, runtime)

    def delete_application_service_ex(
        self,
        request: deps_models.DeleteApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteApplicationServiceResponse:
        """
        Description: 删除一个应用服务实例
        Summary: 删除一个应用服务实例
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteApplicationServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.service.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_application_service_ex_async(
        self,
        request: deps_models.DeleteApplicationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteApplicationServiceResponse:
        """
        Description: 删除一个应用服务实例
        Summary: 删除一个应用服务实例
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteApplicationServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.service.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_package(
        self,
        request: deps_models.GetApplicationPackageRequest,
    ) -> deps_models.GetApplicationPackageResponse:
        """
        Description: 获取应用发布包详情包括下载地址、校验码等。
        Summary: 获取应用发布包详情包括下载地址、校验码等。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_package_ex(request, headers, runtime)

    async def get_application_package_async(
        self,
        request: deps_models.GetApplicationPackageRequest,
    ) -> deps_models.GetApplicationPackageResponse:
        """
        Description: 获取应用发布包详情包括下载地址、校验码等。
        Summary: 获取应用发布包详情包括下载地址、校验码等。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_package_ex_async(request, headers, runtime)

    def get_application_package_ex(
        self,
        request: deps_models.GetApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationPackageResponse:
        """
        Description: 获取应用发布包详情包括下载地址、校验码等。
        Summary: 获取应用发布包详情包括下载地址、校验码等。
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationPackageResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.package.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_package_ex_async(
        self,
        request: deps_models.GetApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationPackageResponse:
        """
        Description: 获取应用发布包详情包括下载地址、校验码等。
        Summary: 获取应用发布包详情包括下载地址、校验码等。
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationPackageResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.package.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_version(
        self,
        request: deps_models.QueryAppVersionRequest,
    ) -> deps_models.QueryAppVersionResponse:
        """
        Description: 查询应用发布包版本详情
        Summary: 查询应用发布包版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_version_ex(request, headers, runtime)

    async def query_app_version_async(
        self,
        request: deps_models.QueryAppVersionRequest,
    ) -> deps_models.QueryAppVersionResponse:
        """
        Description: 查询应用发布包版本详情
        Summary: 查询应用发布包版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_version_ex_async(request, headers, runtime)

    def query_app_version_ex(
        self,
        request: deps_models.QueryAppVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppVersionResponse:
        """
        Description: 查询应用发布包版本详情
        Summary: 查询应用发布包版本详情
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.version.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_version_ex_async(
        self,
        request: deps_models.QueryAppVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppVersionResponse:
        """
        Description: 查询应用发布包版本详情
        Summary: 查询应用发布包版本详情
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.version.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_application(
        self,
        request: deps_models.DeleteApplicationRequest,
    ) -> deps_models.DeleteApplicationResponse:
        """
        Description: 删除一个应用。
        Summary: 删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_application_ex(request, headers, runtime)

    async def delete_application_async(
        self,
        request: deps_models.DeleteApplicationRequest,
    ) -> deps_models.DeleteApplicationResponse:
        """
        Description: 删除一个应用。
        Summary: 删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_application_ex_async(request, headers, runtime)

    def delete_application_ex(
        self,
        request: deps_models.DeleteApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteApplicationResponse:
        """
        Description: 删除一个应用。
        Summary: 删除应用
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_application_ex_async(
        self,
        request: deps_models.DeleteApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteApplicationResponse:
        """
        Description: 删除一个应用。
        Summary: 删除应用
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_application(
        self,
        request: deps_models.ListApplicationRequest,
    ) -> deps_models.ListApplicationResponse:
        """
        Description: 获取租户应用列表。
        Summary: 列出应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_application_ex(request, headers, runtime)

    async def list_application_async(
        self,
        request: deps_models.ListApplicationRequest,
    ) -> deps_models.ListApplicationResponse:
        """
        Description: 获取租户应用列表。
        Summary: 列出应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_application_ex_async(request, headers, runtime)

    def list_application_ex(
        self,
        request: deps_models.ListApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListApplicationResponse:
        """
        Description: 获取租户应用列表。
        Summary: 列出应用
        """
        UtilClient.validate_model(request)
        return deps_models.ListApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_application_ex_async(
        self,
        request: deps_models.ListApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListApplicationResponse:
        """
        Description: 获取租户应用列表。
        Summary: 列出应用
        """
        UtilClient.validate_model(request)
        return deps_models.ListApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appgroup(
        self,
        request: deps_models.ListAppgroupRequest,
    ) -> deps_models.ListAppgroupResponse:
        """
        Description: 获取租户应用分组列表。
        Summary: 列出应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appgroup_ex(request, headers, runtime)

    async def list_appgroup_async(
        self,
        request: deps_models.ListAppgroupRequest,
    ) -> deps_models.ListAppgroupResponse:
        """
        Description: 获取租户应用分组列表。
        Summary: 列出应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appgroup_ex_async(request, headers, runtime)

    def list_appgroup_ex(
        self,
        request: deps_models.ListAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListAppgroupResponse:
        """
        Description: 获取租户应用分组列表。
        Summary: 列出应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.ListAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appgroup_ex_async(
        self,
        request: deps_models.ListAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListAppgroupResponse:
        """
        Description: 获取租户应用分组列表。
        Summary: 列出应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.ListAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_computer(
        self,
        request: deps_models.QueryApplicationComputerRequest,
    ) -> deps_models.QueryApplicationComputerResponse:
        """
        Description: 根据指定的查询条件查询属于某个应用计算资源列表。
        Summary: 查询应用计算资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_computer_ex(request, headers, runtime)

    async def query_application_computer_async(
        self,
        request: deps_models.QueryApplicationComputerRequest,
    ) -> deps_models.QueryApplicationComputerResponse:
        """
        Description: 根据指定的查询条件查询属于某个应用计算资源列表。
        Summary: 查询应用计算资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_computer_ex_async(request, headers, runtime)

    def query_application_computer_ex(
        self,
        request: deps_models.QueryApplicationComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationComputerResponse:
        """
        Description: 根据指定的查询条件查询属于某个应用计算资源列表。
        Summary: 查询应用计算资源
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationComputerResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.computer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_computer_ex_async(
        self,
        request: deps_models.QueryApplicationComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationComputerResponse:
        """
        Description: 根据指定的查询条件查询属于某个应用计算资源列表。
        Summary: 查询应用计算资源
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationComputerResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.computer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_repository(
        self,
        request: deps_models.GetApplicationRepositoryRequest,
    ) -> deps_models.GetApplicationRepositoryResponse:
        """
        Description: 获取一个应用的代码库信息。
        Summary: 获取一个应用的代码库信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_repository_ex(request, headers, runtime)

    async def get_application_repository_async(
        self,
        request: deps_models.GetApplicationRepositoryRequest,
    ) -> deps_models.GetApplicationRepositoryResponse:
        """
        Description: 获取一个应用的代码库信息。
        Summary: 获取一个应用的代码库信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_repository_ex_async(request, headers, runtime)

    def get_application_repository_ex(
        self,
        request: deps_models.GetApplicationRepositoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationRepositoryResponse:
        """
        Description: 获取一个应用的代码库信息。
        Summary: 获取一个应用的代码库信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationRepositoryResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.repository.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_repository_ex_async(
        self,
        request: deps_models.GetApplicationRepositoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationRepositoryResponse:
        """
        Description: 获取一个应用的代码库信息。
        Summary: 获取一个应用的代码库信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationRepositoryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.repository.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appgroup(
        self,
        request: deps_models.QueryAppgroupRequest,
    ) -> deps_models.QueryAppgroupResponse:
        """
        Description: 根据名称查询应用分组信息
        Summary: 应用分组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appgroup_ex(request, headers, runtime)

    async def query_appgroup_async(
        self,
        request: deps_models.QueryAppgroupRequest,
    ) -> deps_models.QueryAppgroupResponse:
        """
        Description: 根据名称查询应用分组信息
        Summary: 应用分组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appgroup_ex_async(request, headers, runtime)

    def query_appgroup_ex(
        self,
        request: deps_models.QueryAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppgroupResponse:
        """
        Description: 根据名称查询应用分组信息
        Summary: 应用分组查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appgroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appgroup_ex_async(
        self,
        request: deps_models.QueryAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppgroupResponse:
        """
        Description: 根据名称查询应用分组信息
        Summary: 应用分组查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appgroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_applevel(
        self,
        request: deps_models.QueryApplevelRequest,
    ) -> deps_models.QueryApplevelResponse:
        """
        Description: 根据条件查询应用等级
        Summary: 查询应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_applevel_ex(request, headers, runtime)

    async def query_applevel_async(
        self,
        request: deps_models.QueryApplevelRequest,
    ) -> deps_models.QueryApplevelResponse:
        """
        Description: 根据条件查询应用等级
        Summary: 查询应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_applevel_ex_async(request, headers, runtime)

    def query_applevel_ex(
        self,
        request: deps_models.QueryApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplevelResponse:
        """
        Description: 根据条件查询应用等级
        Summary: 查询应用等级
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplevelResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.applevel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_applevel_ex_async(
        self,
        request: deps_models.QueryApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplevelResponse:
        """
        Description: 根据条件查询应用等级
        Summary: 查询应用等级
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplevelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.applevel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application(
        self,
        request: deps_models.QueryApplicationRequest,
    ) -> deps_models.QueryApplicationResponse:
        """
        Description: 根据查询条件查询应用列表。
        Summary: 查询应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_ex(request, headers, runtime)

    async def query_application_async(
        self,
        request: deps_models.QueryApplicationRequest,
    ) -> deps_models.QueryApplicationResponse:
        """
        Description: 根据查询条件查询应用列表。
        Summary: 查询应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_ex_async(request, headers, runtime)

    def query_application_ex(
        self,
        request: deps_models.QueryApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationResponse:
        """
        Description: 根据查询条件查询应用列表。
        Summary: 查询应用
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_ex_async(
        self,
        request: deps_models.QueryApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationResponse:
        """
        Description: 根据查询条件查询应用列表。
        Summary: 查询应用
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_app_version(
        self,
        request: deps_models.CreateAppVersionRequest,
    ) -> deps_models.CreateAppVersionResponse:
        """
        Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
        Summary: 创建应用版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_app_version_ex(request, headers, runtime)

    async def create_app_version_async(
        self,
        request: deps_models.CreateAppVersionRequest,
    ) -> deps_models.CreateAppVersionResponse:
        """
        Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
        Summary: 创建应用版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_app_version_ex_async(request, headers, runtime)

    def create_app_version_ex(
        self,
        request: deps_models.CreateAppVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppVersionResponse:
        """
        Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
        Summary: 创建应用版本
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.version.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_app_version_ex_async(
        self,
        request: deps_models.CreateAppVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppVersionResponse:
        """
        Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
        Summary: 创建应用版本
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.version.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_delta(
        self,
        request: deps_models.QueryAppDeltaRequest,
    ) -> deps_models.QueryAppDeltaResponse:
        """
        Description: 查询应用增量统计信息
        Summary: 查询应用增量统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_delta_ex(request, headers, runtime)

    async def query_app_delta_async(
        self,
        request: deps_models.QueryAppDeltaRequest,
    ) -> deps_models.QueryAppDeltaResponse:
        """
        Description: 查询应用增量统计信息
        Summary: 查询应用增量统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_delta_ex_async(request, headers, runtime)

    def query_app_delta_ex(
        self,
        request: deps_models.QueryAppDeltaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppDeltaResponse:
        """
        Description: 查询应用增量统计信息
        Summary: 查询应用增量统计信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppDeltaResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.delta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_delta_ex_async(
        self,
        request: deps_models.QueryAppDeltaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppDeltaResponse:
        """
        Description: 查询应用增量统计信息
        Summary: 查询应用增量统计信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppDeltaResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.delta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_loadbalancer(
        self,
        request: deps_models.QueryApplicationLoadbalancerRequest,
    ) -> deps_models.QueryApplicationLoadbalancerResponse:
        """
        Description: 根据指定的查询条件查询负载均衡资源列表
        Summary: loadbalancer查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_loadbalancer_ex(request, headers, runtime)

    async def query_application_loadbalancer_async(
        self,
        request: deps_models.QueryApplicationLoadbalancerRequest,
    ) -> deps_models.QueryApplicationLoadbalancerResponse:
        """
        Description: 根据指定的查询条件查询负载均衡资源列表
        Summary: loadbalancer查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_loadbalancer_ex_async(request, headers, runtime)

    def query_application_loadbalancer_ex(
        self,
        request: deps_models.QueryApplicationLoadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationLoadbalancerResponse:
        """
        Description: 根据指定的查询条件查询负载均衡资源列表
        Summary: loadbalancer查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationLoadbalancerResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.loadbalancer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_loadbalancer_ex_async(
        self,
        request: deps_models.QueryApplicationLoadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationLoadbalancerResponse:
        """
        Description: 根据指定的查询条件查询负载均衡资源列表
        Summary: loadbalancer查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationLoadbalancerResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.loadbalancer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_database(
        self,
        request: deps_models.QueryApplicationDatabaseRequest,
    ) -> deps_models.QueryApplicationDatabaseResponse:
        """
        Description: 根据指定的查询条件查询数据库资源列表
        Summary: database查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_database_ex(request, headers, runtime)

    async def query_application_database_async(
        self,
        request: deps_models.QueryApplicationDatabaseRequest,
    ) -> deps_models.QueryApplicationDatabaseResponse:
        """
        Description: 根据指定的查询条件查询数据库资源列表
        Summary: database查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_database_ex_async(request, headers, runtime)

    def query_application_database_ex(
        self,
        request: deps_models.QueryApplicationDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationDatabaseResponse:
        """
        Description: 根据指定的查询条件查询数据库资源列表
        Summary: database查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationDatabaseResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.database.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_database_ex_async(
        self,
        request: deps_models.QueryApplicationDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApplicationDatabaseResponse:
        """
        Description: 根据指定的查询条件查询数据库资源列表
        Summary: database查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApplicationDatabaseResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.database.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_application_package(
        self,
        request: deps_models.UploadApplicationPackageRequest,
    ) -> deps_models.UploadApplicationPackageResponse:
        """
        Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
        Summary: 获取上传应用发布包临时签名地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_application_package_ex(request, headers, runtime)

    async def upload_application_package_async(
        self,
        request: deps_models.UploadApplicationPackageRequest,
    ) -> deps_models.UploadApplicationPackageResponse:
        """
        Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
        Summary: 获取上传应用发布包临时签名地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_application_package_ex_async(request, headers, runtime)

    def upload_application_package_ex(
        self,
        request: deps_models.UploadApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UploadApplicationPackageResponse:
        """
        Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
        Summary: 获取上传应用发布包临时签名地址
        """
        UtilClient.validate_model(request)
        return deps_models.UploadApplicationPackageResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.package.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_application_package_ex_async(
        self,
        request: deps_models.UploadApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UploadApplicationPackageResponse:
        """
        Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
        Summary: 获取上传应用发布包临时签名地址
        """
        UtilClient.validate_model(request)
        return deps_models.UploadApplicationPackageResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.package.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def syncreate_application_version(
        self,
        request: deps_models.SyncreateApplicationVersionRequest,
    ) -> deps_models.SyncreateApplicationVersionResponse:
        """
        Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
        Summary: 同步创建对应的发布包版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.syncreate_application_version_ex(request, headers, runtime)

    async def syncreate_application_version_async(
        self,
        request: deps_models.SyncreateApplicationVersionRequest,
    ) -> deps_models.SyncreateApplicationVersionResponse:
        """
        Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
        Summary: 同步创建对应的发布包版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.syncreate_application_version_ex_async(request, headers, runtime)

    def syncreate_application_version_ex(
        self,
        request: deps_models.SyncreateApplicationVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SyncreateApplicationVersionResponse:
        """
        Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
        Summary: 同步创建对应的发布包版本信息
        """
        UtilClient.validate_model(request)
        return deps_models.SyncreateApplicationVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.version.syncreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def syncreate_application_version_ex_async(
        self,
        request: deps_models.SyncreateApplicationVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SyncreateApplicationVersionResponse:
        """
        Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
        Summary: 同步创建对应的发布包版本信息
        """
        UtilClient.validate_model(request)
        return deps_models.SyncreateApplicationVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.version.syncreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cloudconnector_connection(
        self,
        request: deps_models.ListCloudconnectorConnectionRequest,
    ) -> deps_models.ListCloudconnectorConnectionResponse:
        """
        Description: 获取connection
        Summary: 获取connection
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cloudconnector_connection_ex(request, headers, runtime)

    async def list_cloudconnector_connection_async(
        self,
        request: deps_models.ListCloudconnectorConnectionRequest,
    ) -> deps_models.ListCloudconnectorConnectionResponse:
        """
        Description: 获取connection
        Summary: 获取connection
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cloudconnector_connection_ex_async(request, headers, runtime)

    def list_cloudconnector_connection_ex(
        self,
        request: deps_models.ListCloudconnectorConnectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListCloudconnectorConnectionResponse:
        """
        Description: 获取connection
        Summary: 获取connection
        """
        UtilClient.validate_model(request)
        return deps_models.ListCloudconnectorConnectionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconnector.connection.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cloudconnector_connection_ex_async(
        self,
        request: deps_models.ListCloudconnectorConnectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListCloudconnectorConnectionResponse:
        """
        Description: 获取connection
        Summary: 获取connection
        """
        UtilClient.validate_model(request)
        return deps_models.ListCloudconnectorConnectionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconnector.connection.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appservicebuildpackrelation(
        self,
        request: deps_models.QueryAppservicebuildpackrelationRequest,
    ) -> deps_models.QueryAppservicebuildpackrelationResponse:
        """
        Description: 查询技术栈关系
        Summary: 查询技术栈关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appservicebuildpackrelation_ex(request, headers, runtime)

    async def query_appservicebuildpackrelation_async(
        self,
        request: deps_models.QueryAppservicebuildpackrelationRequest,
    ) -> deps_models.QueryAppservicebuildpackrelationResponse:
        """
        Description: 查询技术栈关系
        Summary: 查询技术栈关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appservicebuildpackrelation_ex_async(request, headers, runtime)

    def query_appservicebuildpackrelation_ex(
        self,
        request: deps_models.QueryAppservicebuildpackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppservicebuildpackrelationResponse:
        """
        Description: 查询技术栈关系
        Summary: 查询技术栈关系
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppservicebuildpackrelationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appservicebuildpackrelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appservicebuildpackrelation_ex_async(
        self,
        request: deps_models.QueryAppservicebuildpackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppservicebuildpackrelationResponse:
        """
        Description: 查询技术栈关系
        Summary: 查询技术栈关系
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppservicebuildpackrelationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appservicebuildpackrelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_appservicebuildpackrelation(
        self,
        request: deps_models.UpdateAppservicebuildpackrelationRequest,
    ) -> deps_models.UpdateAppservicebuildpackrelationResponse:
        """
        Description: 更新应用关系
        Summary: 更新应用关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_appservicebuildpackrelation_ex(request, headers, runtime)

    async def update_appservicebuildpackrelation_async(
        self,
        request: deps_models.UpdateAppservicebuildpackrelationRequest,
    ) -> deps_models.UpdateAppservicebuildpackrelationResponse:
        """
        Description: 更新应用关系
        Summary: 更新应用关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_appservicebuildpackrelation_ex_async(request, headers, runtime)

    def update_appservicebuildpackrelation_ex(
        self,
        request: deps_models.UpdateAppservicebuildpackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppservicebuildpackrelationResponse:
        """
        Description: 更新应用关系
        Summary: 更新应用关系
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppservicebuildpackrelationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appservicebuildpackrelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_appservicebuildpackrelation_ex_async(
        self,
        request: deps_models.UpdateAppservicebuildpackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppservicebuildpackrelationResponse:
        """
        Description: 更新应用关系
        Summary: 更新应用关系
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppservicebuildpackrelationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appservicebuildpackrelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appserviceenvparam(
        self,
        request: deps_models.QueryAppserviceenvparamRequest,
    ) -> deps_models.QueryAppserviceenvparamResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appserviceenvparam_ex(request, headers, runtime)

    async def query_appserviceenvparam_async(
        self,
        request: deps_models.QueryAppserviceenvparamRequest,
    ) -> deps_models.QueryAppserviceenvparamResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appserviceenvparam_ex_async(request, headers, runtime)

    def query_appserviceenvparam_ex(
        self,
        request: deps_models.QueryAppserviceenvparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppserviceenvparamResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppserviceenvparamResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appserviceenvparam.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appserviceenvparam_ex_async(
        self,
        request: deps_models.QueryAppserviceenvparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppserviceenvparamResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppserviceenvparamResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appserviceenvparam.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appserviceenvparam_groupbyappservices(
        self,
        request: deps_models.QueryAppserviceenvparamGroupbyappservicesRequest,
    ) -> deps_models.QueryAppserviceenvparamGroupbyappservicesResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appserviceenvparam_groupbyappservices_ex(request, headers, runtime)

    async def query_appserviceenvparam_groupbyappservices_async(
        self,
        request: deps_models.QueryAppserviceenvparamGroupbyappservicesRequest,
    ) -> deps_models.QueryAppserviceenvparamGroupbyappservicesResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appserviceenvparam_groupbyappservices_ex_async(request, headers, runtime)

    def query_appserviceenvparam_groupbyappservices_ex(
        self,
        request: deps_models.QueryAppserviceenvparamGroupbyappservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppserviceenvparamGroupbyappservicesResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppserviceenvparamGroupbyappservicesResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appserviceenvparam.groupbyappservices.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appserviceenvparam_groupbyappservices_ex_async(
        self,
        request: deps_models.QueryAppserviceenvparamGroupbyappservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppserviceenvparamGroupbyappservicesResponse:
        """
        Description: 查询环境变量
        Summary: 查询环境变量
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppserviceenvparamGroupbyappservicesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appserviceenvparam.groupbyappservices.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appserviceenvparam_querywithdiff(
        self,
        request: deps_models.QueryAppserviceenvparamQuerywithdiffRequest,
    ) -> deps_models.QueryAppserviceenvparamQuerywithdiffResponse:
        """
        Description: 和修改点比较查询
        Summary: 和修改点比较查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appserviceenvparam_querywithdiff_ex(request, headers, runtime)

    async def query_appserviceenvparam_querywithdiff_async(
        self,
        request: deps_models.QueryAppserviceenvparamQuerywithdiffRequest,
    ) -> deps_models.QueryAppserviceenvparamQuerywithdiffResponse:
        """
        Description: 和修改点比较查询
        Summary: 和修改点比较查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appserviceenvparam_querywithdiff_ex_async(request, headers, runtime)

    def query_appserviceenvparam_querywithdiff_ex(
        self,
        request: deps_models.QueryAppserviceenvparamQuerywithdiffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppserviceenvparamQuerywithdiffResponse:
        """
        Description: 和修改点比较查询
        Summary: 和修改点比较查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppserviceenvparamQuerywithdiffResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appserviceenvparam.querywithdiff.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appserviceenvparam_querywithdiff_ex_async(
        self,
        request: deps_models.QueryAppserviceenvparamQuerywithdiffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppserviceenvparamQuerywithdiffResponse:
        """
        Description: 和修改点比较查询
        Summary: 和修改点比较查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppserviceenvparamQuerywithdiffResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appserviceenvparam.querywithdiff.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_appserviceenvparam_updateparams(
        self,
        request: deps_models.UpdateAppserviceenvparamUpdateparamsRequest,
    ) -> deps_models.UpdateAppserviceenvparamUpdateparamsResponse:
        """
        Description: 更新参数
        Summary: 更新参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_appserviceenvparam_updateparams_ex(request, headers, runtime)

    async def update_appserviceenvparam_updateparams_async(
        self,
        request: deps_models.UpdateAppserviceenvparamUpdateparamsRequest,
    ) -> deps_models.UpdateAppserviceenvparamUpdateparamsResponse:
        """
        Description: 更新参数
        Summary: 更新参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_appserviceenvparam_updateparams_ex_async(request, headers, runtime)

    def update_appserviceenvparam_updateparams_ex(
        self,
        request: deps_models.UpdateAppserviceenvparamUpdateparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppserviceenvparamUpdateparamsResponse:
        """
        Description: 更新参数
        Summary: 更新参数
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppserviceenvparamUpdateparamsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appserviceenvparam.updateparams.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_appserviceenvparam_updateparams_ex_async(
        self,
        request: deps_models.UpdateAppserviceenvparamUpdateparamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppserviceenvparamUpdateparamsResponse:
        """
        Description: 更新参数
        Summary: 更新参数
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppserviceenvparamUpdateparamsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appserviceenvparam.updateparams.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_apptechstackrelation(
        self,
        request: deps_models.QueryApptechstackrelationRequest,
    ) -> deps_models.QueryApptechstackrelationResponse:
        """
        Description: 根据应用查询技术栈关系
        Summary: 查询技术栈关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_apptechstackrelation_ex(request, headers, runtime)

    async def query_apptechstackrelation_async(
        self,
        request: deps_models.QueryApptechstackrelationRequest,
    ) -> deps_models.QueryApptechstackrelationResponse:
        """
        Description: 根据应用查询技术栈关系
        Summary: 查询技术栈关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_apptechstackrelation_ex_async(request, headers, runtime)

    def query_apptechstackrelation_ex(
        self,
        request: deps_models.QueryApptechstackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApptechstackrelationResponse:
        """
        Description: 根据应用查询技术栈关系
        Summary: 查询技术栈关系
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApptechstackrelationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.apptechstackrelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_apptechstackrelation_ex_async(
        self,
        request: deps_models.QueryApptechstackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryApptechstackrelationResponse:
        """
        Description: 根据应用查询技术栈关系
        Summary: 查询技术栈关系
        """
        UtilClient.validate_model(request)
        return deps_models.QueryApptechstackrelationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.apptechstackrelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_apptechstackrelation(
        self,
        request: deps_models.UpdateApptechstackrelationRequest,
    ) -> deps_models.UpdateApptechstackrelationResponse:
        """
        Description: 更新应用技术栈关系
        Summary: 更新技术栈关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_apptechstackrelation_ex(request, headers, runtime)

    async def update_apptechstackrelation_async(
        self,
        request: deps_models.UpdateApptechstackrelationRequest,
    ) -> deps_models.UpdateApptechstackrelationResponse:
        """
        Description: 更新应用技术栈关系
        Summary: 更新技术栈关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_apptechstackrelation_ex_async(request, headers, runtime)

    def update_apptechstackrelation_ex(
        self,
        request: deps_models.UpdateApptechstackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateApptechstackrelationResponse:
        """
        Description: 更新应用技术栈关系
        Summary: 更新技术栈关系
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateApptechstackrelationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.apptechstackrelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_apptechstackrelation_ex_async(
        self,
        request: deps_models.UpdateApptechstackrelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateApptechstackrelationResponse:
        """
        Description: 更新应用技术栈关系
        Summary: 更新技术栈关系
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateApptechstackrelationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.apptechstackrelation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_app(
        self,
        request: deps_models.CreateAppRequest,
    ) -> deps_models.CreateAppResponse:
        """
        Description: 应用管理-创建应用
        Summary: 应用管理-创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_app_ex(request, headers, runtime)

    async def create_app_async(
        self,
        request: deps_models.CreateAppRequest,
    ) -> deps_models.CreateAppResponse:
        """
        Description: 应用管理-创建应用
        Summary: 应用管理-创建应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_app_ex_async(request, headers, runtime)

    def create_app_ex(
        self,
        request: deps_models.CreateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppResponse:
        """
        Description: 应用管理-创建应用
        Summary: 应用管理-创建应用
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_app_ex_async(
        self,
        request: deps_models.CreateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppResponse:
        """
        Description: 应用管理-创建应用
        Summary: 应用管理-创建应用
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_app_group(
        self,
        request: deps_models.CreateAppGroupRequest,
    ) -> deps_models.CreateAppGroupResponse:
        """
        Description: 应用管理-应用分组创建
        Summary: 应用管理-应用分组创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_app_group_ex(request, headers, runtime)

    async def create_app_group_async(
        self,
        request: deps_models.CreateAppGroupRequest,
    ) -> deps_models.CreateAppGroupResponse:
        """
        Description: 应用管理-应用分组创建
        Summary: 应用管理-应用分组创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_app_group_ex_async(request, headers, runtime)

    def create_app_group_ex(
        self,
        request: deps_models.CreateAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppGroupResponse:
        """
        Description: 应用管理-应用分组创建
        Summary: 应用管理-应用分组创建
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_app_group_ex_async(
        self,
        request: deps_models.CreateAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppGroupResponse:
        """
        Description: 应用管理-应用分组创建
        Summary: 应用管理-应用分组创建
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_app(
        self,
        request: deps_models.GetAppRequest,
    ) -> deps_models.GetAppResponse:
        """
        Description: 应用管理-获取应用基本信息
        Summary: 应用管理-获取应用基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_app_ex(request, headers, runtime)

    async def get_app_async(
        self,
        request: deps_models.GetAppRequest,
    ) -> deps_models.GetAppResponse:
        """
        Description: 应用管理-获取应用基本信息
        Summary: 应用管理-获取应用基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_app_ex_async(request, headers, runtime)

    def get_app_ex(
        self,
        request: deps_models.GetAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetAppResponse:
        """
        Description: 应用管理-获取应用基本信息
        Summary: 应用管理-获取应用基本信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_app_ex_async(
        self,
        request: deps_models.GetAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetAppResponse:
        """
        Description: 应用管理-获取应用基本信息
        Summary: 应用管理-获取应用基本信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_app_service(
        self,
        request: deps_models.CountAppServiceRequest,
    ) -> deps_models.CountAppServiceResponse:
        """
        Description: 应用管理-查看应用所有应用服务数量
        Summary: 应用管理-查看应用所有应用服务数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_app_service_ex(request, headers, runtime)

    async def count_app_service_async(
        self,
        request: deps_models.CountAppServiceRequest,
    ) -> deps_models.CountAppServiceResponse:
        """
        Description: 应用管理-查看应用所有应用服务数量
        Summary: 应用管理-查看应用所有应用服务数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_app_service_ex_async(request, headers, runtime)

    def count_app_service_ex(
        self,
        request: deps_models.CountAppServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountAppServiceResponse:
        """
        Description: 应用管理-查看应用所有应用服务数量
        Summary: 应用管理-查看应用所有应用服务数量
        """
        UtilClient.validate_model(request)
        return deps_models.CountAppServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.service.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_app_service_ex_async(
        self,
        request: deps_models.CountAppServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountAppServiceResponse:
        """
        Description: 应用管理-查看应用所有应用服务数量
        Summary: 应用管理-查看应用所有应用服务数量
        """
        UtilClient.validate_model(request)
        return deps_models.CountAppServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.service.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_app_deployview(
        self,
        request: deps_models.AllAppDeployviewRequest,
    ) -> deps_models.AllAppDeployviewResponse:
        """
        Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
        Summary: (废弃)获取应用所有环境的部署图(经典)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_app_deployview_ex(request, headers, runtime)

    async def all_app_deployview_async(
        self,
        request: deps_models.AllAppDeployviewRequest,
    ) -> deps_models.AllAppDeployviewResponse:
        """
        Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
        Summary: (废弃)获取应用所有环境的部署图(经典)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_app_deployview_ex_async(request, headers, runtime)

    def all_app_deployview_ex(
        self,
        request: deps_models.AllAppDeployviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AllAppDeployviewResponse:
        """
        Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
        Summary: (废弃)获取应用所有环境的部署图(经典)
        """
        UtilClient.validate_model(request)
        return deps_models.AllAppDeployviewResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.deployview.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_app_deployview_ex_async(
        self,
        request: deps_models.AllAppDeployviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AllAppDeployviewResponse:
        """
        Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
        Summary: (废弃)获取应用所有环境的部署图(经典)
        """
        UtilClient.validate_model(request)
        return deps_models.AllAppDeployviewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.deployview.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app(
        self,
        request: deps_models.QueryAppRequest,
    ) -> deps_models.QueryAppResponse:
        """
        Description: 应用管理-批量查询应用
        Summary: 应用管理-批量查询应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_ex(request, headers, runtime)

    async def query_app_async(
        self,
        request: deps_models.QueryAppRequest,
    ) -> deps_models.QueryAppResponse:
        """
        Description: 应用管理-批量查询应用
        Summary: 应用管理-批量查询应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_ex_async(request, headers, runtime)

    def query_app_ex(
        self,
        request: deps_models.QueryAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppResponse:
        """
        Description: 应用管理-批量查询应用
        Summary: 应用管理-批量查询应用
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_ex_async(
        self,
        request: deps_models.QueryAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppResponse:
        """
        Description: 应用管理-批量查询应用
        Summary: 应用管理-批量查询应用
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_app_group(
        self,
        request: deps_models.GetAppGroupRequest,
    ) -> deps_models.GetAppGroupResponse:
        """
        Description: 应用管理-获取应用分组
        Summary: 应用管理-获取单个应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_app_group_ex(request, headers, runtime)

    async def get_app_group_async(
        self,
        request: deps_models.GetAppGroupRequest,
    ) -> deps_models.GetAppGroupResponse:
        """
        Description: 应用管理-获取应用分组
        Summary: 应用管理-获取单个应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_app_group_ex_async(request, headers, runtime)

    def get_app_group_ex(
        self,
        request: deps_models.GetAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetAppGroupResponse:
        """
        Description: 应用管理-获取应用分组
        Summary: 应用管理-获取单个应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.GetAppGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.group.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_app_group_ex_async(
        self,
        request: deps_models.GetAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetAppGroupResponse:
        """
        Description: 应用管理-获取应用分组
        Summary: 应用管理-获取单个应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.GetAppGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.group.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_group(
        self,
        request: deps_models.QueryAppGroupRequest,
    ) -> deps_models.QueryAppGroupResponse:
        """
        Description: 应用管理-批量查询应用分组
        Summary: 应用管理-批量查询应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_group_ex(request, headers, runtime)

    async def query_app_group_async(
        self,
        request: deps_models.QueryAppGroupRequest,
    ) -> deps_models.QueryAppGroupResponse:
        """
        Description: 应用管理-批量查询应用分组
        Summary: 应用管理-批量查询应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_group_ex_async(request, headers, runtime)

    def query_app_group_ex(
        self,
        request: deps_models.QueryAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppGroupResponse:
        """
        Description: 应用管理-批量查询应用分组
        Summary: 应用管理-批量查询应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.group.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_group_ex_async(
        self,
        request: deps_models.QueryAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppGroupResponse:
        """
        Description: 应用管理-批量查询应用分组
        Summary: 应用管理-批量查询应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.group.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_service(
        self,
        request: deps_models.QueryAppServiceRequest,
    ) -> deps_models.QueryAppServiceResponse:
        """
        Description: 应用管理-查询当前应用的所有应用服务
        Summary: 应用管理-查询当前应用的所有应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_service_ex(request, headers, runtime)

    async def query_app_service_async(
        self,
        request: deps_models.QueryAppServiceRequest,
    ) -> deps_models.QueryAppServiceResponse:
        """
        Description: 应用管理-查询当前应用的所有应用服务
        Summary: 应用管理-查询当前应用的所有应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_service_ex_async(request, headers, runtime)

    def query_app_service_ex(
        self,
        request: deps_models.QueryAppServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppServiceResponse:
        """
        Description: 应用管理-查询当前应用的所有应用服务
        Summary: 应用管理-查询当前应用的所有应用服务
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_service_ex_async(
        self,
        request: deps_models.QueryAppServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppServiceResponse:
        """
        Description: 应用管理-查询当前应用的所有应用服务
        Summary: 应用管理-查询当前应用的所有应用服务
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_app_favourite(
        self,
        request: deps_models.CreateAppFavouriteRequest,
    ) -> deps_models.CreateAppFavouriteResponse:
        """
        Description: 应用管理-用户收藏应用
        Summary: 应用管理-用户收藏应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_app_favourite_ex(request, headers, runtime)

    async def create_app_favourite_async(
        self,
        request: deps_models.CreateAppFavouriteRequest,
    ) -> deps_models.CreateAppFavouriteResponse:
        """
        Description: 应用管理-用户收藏应用
        Summary: 应用管理-用户收藏应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_app_favourite_ex_async(request, headers, runtime)

    def create_app_favourite_ex(
        self,
        request: deps_models.CreateAppFavouriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppFavouriteResponse:
        """
        Description: 应用管理-用户收藏应用
        Summary: 应用管理-用户收藏应用
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppFavouriteResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.favourite.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_app_favourite_ex_async(
        self,
        request: deps_models.CreateAppFavouriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppFavouriteResponse:
        """
        Description: 应用管理-用户收藏应用
        Summary: 应用管理-用户收藏应用
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppFavouriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.favourite.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_app_favourite(
        self,
        request: deps_models.DeleteAppFavouriteRequest,
    ) -> deps_models.DeleteAppFavouriteResponse:
        """
        Description: 应用管理-用户取消收藏某应用
        Summary: 应用管理-用户取消收藏某应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_app_favourite_ex(request, headers, runtime)

    async def delete_app_favourite_async(
        self,
        request: deps_models.DeleteAppFavouriteRequest,
    ) -> deps_models.DeleteAppFavouriteResponse:
        """
        Description: 应用管理-用户取消收藏某应用
        Summary: 应用管理-用户取消收藏某应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_app_favourite_ex_async(request, headers, runtime)

    def delete_app_favourite_ex(
        self,
        request: deps_models.DeleteAppFavouriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppFavouriteResponse:
        """
        Description: 应用管理-用户取消收藏某应用
        Summary: 应用管理-用户取消收藏某应用
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppFavouriteResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.favourite.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_app_favourite_ex_async(
        self,
        request: deps_models.DeleteAppFavouriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppFavouriteResponse:
        """
        Description: 应用管理-用户取消收藏某应用
        Summary: 应用管理-用户取消收藏某应用
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppFavouriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.favourite.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_app(
        self,
        request: deps_models.UpdateAppRequest,
    ) -> deps_models.UpdateAppResponse:
        """
        Description: 应用管理-更新应用信息
        Summary: 应用管理-更新应用信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_app_ex(request, headers, runtime)

    async def update_app_async(
        self,
        request: deps_models.UpdateAppRequest,
    ) -> deps_models.UpdateAppResponse:
        """
        Description: 应用管理-更新应用信息
        Summary: 应用管理-更新应用信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_app_ex_async(request, headers, runtime)

    def update_app_ex(
        self,
        request: deps_models.UpdateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppResponse:
        """
        Description: 应用管理-更新应用信息
        Summary: 应用管理-更新应用信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_app_ex_async(
        self,
        request: deps_models.UpdateAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppResponse:
        """
        Description: 应用管理-更新应用信息
        Summary: 应用管理-更新应用信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_app_group(
        self,
        request: deps_models.UpdateAppGroupRequest,
    ) -> deps_models.UpdateAppGroupResponse:
        """
        Description: 应用管理-更新应用分组信息
        Summary: 应用管理-更新应用分组信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_app_group_ex(request, headers, runtime)

    async def update_app_group_async(
        self,
        request: deps_models.UpdateAppGroupRequest,
    ) -> deps_models.UpdateAppGroupResponse:
        """
        Description: 应用管理-更新应用分组信息
        Summary: 应用管理-更新应用分组信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_app_group_ex_async(request, headers, runtime)

    def update_app_group_ex(
        self,
        request: deps_models.UpdateAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppGroupResponse:
        """
        Description: 应用管理-更新应用分组信息
        Summary: 应用管理-更新应用分组信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.group.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_app_group_ex_async(
        self,
        request: deps_models.UpdateAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppGroupResponse:
        """
        Description: 应用管理-更新应用分组信息
        Summary: 应用管理-更新应用分组信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.group.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_app_favourite(
        self,
        request: deps_models.ListAppFavouriteRequest,
    ) -> deps_models.ListAppFavouriteResponse:
        """
        Description: 应用管理-列出当前用户收藏的应用
        Summary: 应用管理-列出当前用户收藏的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_app_favourite_ex(request, headers, runtime)

    async def list_app_favourite_async(
        self,
        request: deps_models.ListAppFavouriteRequest,
    ) -> deps_models.ListAppFavouriteResponse:
        """
        Description: 应用管理-列出当前用户收藏的应用
        Summary: 应用管理-列出当前用户收藏的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_app_favourite_ex_async(request, headers, runtime)

    def list_app_favourite_ex(
        self,
        request: deps_models.ListAppFavouriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListAppFavouriteResponse:
        """
        Description: 应用管理-列出当前用户收藏的应用
        Summary: 应用管理-列出当前用户收藏的应用
        """
        UtilClient.validate_model(request)
        return deps_models.ListAppFavouriteResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.favourite.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_app_favourite_ex_async(
        self,
        request: deps_models.ListAppFavouriteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListAppFavouriteResponse:
        """
        Description: 应用管理-列出当前用户收藏的应用
        Summary: 应用管理-列出当前用户收藏的应用
        """
        UtilClient.validate_model(request)
        return deps_models.ListAppFavouriteResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.favourite.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_app(
        self,
        request: deps_models.DeleteAppRequest,
    ) -> deps_models.DeleteAppResponse:
        """
        Description: 应用管理-删除应用
        Summary: 应用管理-删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_app_ex(request, headers, runtime)

    async def delete_app_async(
        self,
        request: deps_models.DeleteAppRequest,
    ) -> deps_models.DeleteAppResponse:
        """
        Description: 应用管理-删除应用
        Summary: 应用管理-删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_app_ex_async(request, headers, runtime)

    def delete_app_ex(
        self,
        request: deps_models.DeleteAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppResponse:
        """
        Description: 应用管理-删除应用
        Summary: 应用管理-删除应用
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_app_ex_async(
        self,
        request: deps_models.DeleteAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppResponse:
        """
        Description: 应用管理-删除应用
        Summary: 应用管理-删除应用
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_app_group(
        self,
        request: deps_models.DeleteAppGroupRequest,
    ) -> deps_models.DeleteAppGroupResponse:
        """
        Description: 应用管理-删除应用分组
        Summary: 应用管理-删除应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_app_group_ex(request, headers, runtime)

    async def delete_app_group_async(
        self,
        request: deps_models.DeleteAppGroupRequest,
    ) -> deps_models.DeleteAppGroupResponse:
        """
        Description: 应用管理-删除应用分组
        Summary: 应用管理-删除应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_app_group_ex_async(request, headers, runtime)

    def delete_app_group_ex(
        self,
        request: deps_models.DeleteAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppGroupResponse:
        """
        Description: 应用管理-删除应用分组
        Summary: 应用管理-删除应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.group.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_app_group_ex_async(
        self,
        request: deps_models.DeleteAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppGroupResponse:
        """
        Description: 应用管理-删除应用分组
        Summary: 应用管理-删除应用分组
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.group.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_plan(
        self,
        request: deps_models.QueryAppPlanRequest,
    ) -> deps_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询经典应用服务发布单
        Summary: 应用管理-应用维度查询经典应用服务发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_plan_ex(request, headers, runtime)

    async def query_app_plan_async(
        self,
        request: deps_models.QueryAppPlanRequest,
    ) -> deps_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询经典应用服务发布单
        Summary: 应用管理-应用维度查询经典应用服务发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_plan_ex_async(request, headers, runtime)

    def query_app_plan_ex(
        self,
        request: deps_models.QueryAppPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询经典应用服务发布单
        Summary: 应用管理-应用维度查询经典应用服务发布单
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.plan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_plan_ex_async(
        self,
        request: deps_models.QueryAppPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询经典应用服务发布单
        Summary: 应用管理-应用维度查询经典应用服务发布单
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.plan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_app_group(
        self,
        request: deps_models.ExistAppGroupRequest,
    ) -> deps_models.ExistAppGroupResponse:
        """
        Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
        Summary: 应用管理-判断应用分组是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_app_group_ex(request, headers, runtime)

    async def exist_app_group_async(
        self,
        request: deps_models.ExistAppGroupRequest,
    ) -> deps_models.ExistAppGroupResponse:
        """
        Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
        Summary: 应用管理-判断应用分组是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_app_group_ex_async(request, headers, runtime)

    def exist_app_group_ex(
        self,
        request: deps_models.ExistAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistAppGroupResponse:
        """
        Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
        Summary: 应用管理-判断应用分组是否存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistAppGroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.group.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_app_group_ex_async(
        self,
        request: deps_models.ExistAppGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistAppGroupResponse:
        """
        Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
        Summary: 应用管理-判断应用分组是否存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistAppGroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.group.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user(
        self,
        request: deps_models.QueryUserRequest,
    ) -> deps_models.QueryUserResponse:
        """
        Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
        Summary: 应用管理-当前登录用户信息查询（已废弃）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_ex(request, headers, runtime)

    async def query_user_async(
        self,
        request: deps_models.QueryUserRequest,
    ) -> deps_models.QueryUserResponse:
        """
        Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
        Summary: 应用管理-当前登录用户信息查询（已废弃）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_ex_async(request, headers, runtime)

    def query_user_ex(
        self,
        request: deps_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryUserResponse:
        """
        Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
        Summary: 应用管理-当前登录用户信息查询（已废弃）
        """
        UtilClient.validate_model(request)
        return deps_models.QueryUserResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_ex_async(
        self,
        request: deps_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryUserResponse:
        """
        Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
        Summary: 应用管理-当前登录用户信息查询（已废弃）
        """
        UtilClient.validate_model(request)
        return deps_models.QueryUserResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_app(
        self,
        request: deps_models.ExistAppRequest,
    ) -> deps_models.ExistAppResponse:
        """
        Description: 应用管理-判断应用是否存在
        Summary: 应用管理-判断应用是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_app_ex(request, headers, runtime)

    async def exist_app_async(
        self,
        request: deps_models.ExistAppRequest,
    ) -> deps_models.ExistAppResponse:
        """
        Description: 应用管理-判断应用是否存在
        Summary: 应用管理-判断应用是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_app_ex_async(request, headers, runtime)

    def exist_app_ex(
        self,
        request: deps_models.ExistAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistAppResponse:
        """
        Description: 应用管理-判断应用是否存在
        Summary: 应用管理-判断应用是否存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_app_ex_async(
        self,
        request: deps_models.ExistAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistAppResponse:
        """
        Description: 应用管理-判断应用是否存在
        Summary: 应用管理-判断应用是否存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_buildpack(
        self,
        request: deps_models.GetApplicationBuildpackRequest,
    ) -> deps_models.GetApplicationBuildpackResponse:
        """
        Description: 根据应用服务实例查询对应的技术栈信息
        Summary: 查询技术栈信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_buildpack_ex(request, headers, runtime)

    async def get_application_buildpack_async(
        self,
        request: deps_models.GetApplicationBuildpackRequest,
    ) -> deps_models.GetApplicationBuildpackResponse:
        """
        Description: 根据应用服务实例查询对应的技术栈信息
        Summary: 查询技术栈信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_buildpack_ex_async(request, headers, runtime)

    def get_application_buildpack_ex(
        self,
        request: deps_models.GetApplicationBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationBuildpackResponse:
        """
        Description: 根据应用服务实例查询对应的技术栈信息
        Summary: 查询技术栈信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.buildpack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_buildpack_ex_async(
        self,
        request: deps_models.GetApplicationBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationBuildpackResponse:
        """
        Description: 根据应用服务实例查询对应的技术栈信息
        Summary: 查询技术栈信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.buildpack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_techstack(
        self,
        request: deps_models.GetApplicationTechstackRequest,
    ) -> deps_models.GetApplicationTechstackResponse:
        """
        Description: 查询指定应用的技术栈框架信息
        Summary: 查询指定应用的技术栈框架信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_techstack_ex(request, headers, runtime)

    async def get_application_techstack_async(
        self,
        request: deps_models.GetApplicationTechstackRequest,
    ) -> deps_models.GetApplicationTechstackResponse:
        """
        Description: 查询指定应用的技术栈框架信息
        Summary: 查询指定应用的技术栈框架信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_techstack_ex_async(request, headers, runtime)

    def get_application_techstack_ex(
        self,
        request: deps_models.GetApplicationTechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationTechstackResponse:
        """
        Description: 查询指定应用的技术栈框架信息
        Summary: 查询指定应用的技术栈框架信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationTechstackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.application.techstack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_techstack_ex_async(
        self,
        request: deps_models.GetApplicationTechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetApplicationTechstackResponse:
        """
        Description: 查询指定应用的技术栈框架信息
        Summary: 查询指定应用的技术栈框架信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetApplicationTechstackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.application.techstack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_buildpack(
        self,
        request: deps_models.GetBuildpackRequest,
    ) -> deps_models.GetBuildpackResponse:
        """
        Description: 获取技术栈信息
        Summary: 获取技术栈信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_buildpack_ex(request, headers, runtime)

    async def get_buildpack_async(
        self,
        request: deps_models.GetBuildpackRequest,
    ) -> deps_models.GetBuildpackResponse:
        """
        Description: 获取技术栈信息
        Summary: 获取技术栈信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_buildpack_ex_async(request, headers, runtime)

    def get_buildpack_ex(
        self,
        request: deps_models.GetBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBuildpackResponse:
        """
        Description: 获取技术栈信息
        Summary: 获取技术栈信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_buildpack_ex_async(
        self,
        request: deps_models.GetBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBuildpackResponse:
        """
        Description: 获取技术栈信息
        Summary: 获取技术栈信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_techstack(
        self,
        request: deps_models.ListTechstackRequest,
    ) -> deps_models.ListTechstackResponse:
        """
        Description: 列出系统支持的所有技术栈框架
        Summary: 列出系统支持的所有技术栈框架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_techstack_ex(request, headers, runtime)

    async def list_techstack_async(
        self,
        request: deps_models.ListTechstackRequest,
    ) -> deps_models.ListTechstackResponse:
        """
        Description: 列出系统支持的所有技术栈框架
        Summary: 列出系统支持的所有技术栈框架
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_techstack_ex_async(request, headers, runtime)

    def list_techstack_ex(
        self,
        request: deps_models.ListTechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListTechstackResponse:
        """
        Description: 列出系统支持的所有技术栈框架
        Summary: 列出系统支持的所有技术栈框架
        """
        UtilClient.validate_model(request)
        return deps_models.ListTechstackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.techstack.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_techstack_ex_async(
        self,
        request: deps_models.ListTechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListTechstackResponse:
        """
        Description: 列出系统支持的所有技术栈框架
        Summary: 列出系统支持的所有技术栈框架
        """
        UtilClient.validate_model(request)
        return deps_models.ListTechstackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.techstack.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack(
        self,
        request: deps_models.QueryBuildpackRequest,
    ) -> deps_models.QueryBuildpackResponse:
        """
        Description: 搜索技术栈
        Summary: 搜索技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_ex(request, headers, runtime)

    async def query_buildpack_async(
        self,
        request: deps_models.QueryBuildpackRequest,
    ) -> deps_models.QueryBuildpackResponse:
        """
        Description: 搜索技术栈
        Summary: 搜索技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_ex_async(request, headers, runtime)

    def query_buildpack_ex(
        self,
        request: deps_models.QueryBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackResponse:
        """
        Description: 搜索技术栈
        Summary: 搜索技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_ex_async(
        self,
        request: deps_models.QueryBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackResponse:
        """
        Description: 搜索技术栈
        Summary: 搜索技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_buildpack(
        self,
        request: deps_models.CreateBuildpackRequest,
    ) -> deps_models.CreateBuildpackResponse:
        """
        Description: 创建一个技术栈
        Summary: 创建一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_buildpack_ex(request, headers, runtime)

    async def create_buildpack_async(
        self,
        request: deps_models.CreateBuildpackRequest,
    ) -> deps_models.CreateBuildpackResponse:
        """
        Description: 创建一个技术栈
        Summary: 创建一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_buildpack_ex_async(request, headers, runtime)

    def create_buildpack_ex(
        self,
        request: deps_models.CreateBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateBuildpackResponse:
        """
        Description: 创建一个技术栈
        Summary: 创建一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.CreateBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_buildpack_ex_async(
        self,
        request: deps_models.CreateBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateBuildpackResponse:
        """
        Description: 创建一个技术栈
        Summary: 创建一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.CreateBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def uploadfinish_buildpack(
        self,
        request: deps_models.UploadfinishBuildpackRequest,
    ) -> deps_models.UploadfinishBuildpackResponse:
        """
        Description: 更新技术栈包状态
        Summary: 更新技术栈包状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.uploadfinish_buildpack_ex(request, headers, runtime)

    async def uploadfinish_buildpack_async(
        self,
        request: deps_models.UploadfinishBuildpackRequest,
    ) -> deps_models.UploadfinishBuildpackResponse:
        """
        Description: 更新技术栈包状态
        Summary: 更新技术栈包状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.uploadfinish_buildpack_ex_async(request, headers, runtime)

    def uploadfinish_buildpack_ex(
        self,
        request: deps_models.UploadfinishBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UploadfinishBuildpackResponse:
        """
        Description: 更新技术栈包状态
        Summary: 更新技术栈包状态
        """
        UtilClient.validate_model(request)
        return deps_models.UploadfinishBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.uploadfinish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def uploadfinish_buildpack_ex_async(
        self,
        request: deps_models.UploadfinishBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UploadfinishBuildpackResponse:
        """
        Description: 更新技术栈包状态
        Summary: 更新技术栈包状态
        """
        UtilClient.validate_model(request)
        return deps_models.UploadfinishBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.uploadfinish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_buildpack(
        self,
        request: deps_models.PublishBuildpackRequest,
    ) -> deps_models.PublishBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_buildpack_ex(request, headers, runtime)

    async def publish_buildpack_async(
        self,
        request: deps_models.PublishBuildpackRequest,
    ) -> deps_models.PublishBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_buildpack_ex_async(request, headers, runtime)

    def publish_buildpack_ex(
        self,
        request: deps_models.PublishBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.PublishBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.PublishBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_buildpack_ex_async(
        self,
        request: deps_models.PublishBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.PublishBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.PublishBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_buildpack(
        self,
        request: deps_models.UpdateBuildpackRequest,
    ) -> deps_models.UpdateBuildpackResponse:
        """
        Description: 更新一个技术栈
        Summary: 更新一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_buildpack_ex(request, headers, runtime)

    async def update_buildpack_async(
        self,
        request: deps_models.UpdateBuildpackRequest,
    ) -> deps_models.UpdateBuildpackResponse:
        """
        Description: 更新一个技术栈
        Summary: 更新一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_buildpack_ex_async(request, headers, runtime)

    def update_buildpack_ex(
        self,
        request: deps_models.UpdateBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpackResponse:
        """
        Description: 更新一个技术栈
        Summary: 更新一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_buildpack_ex_async(
        self,
        request: deps_models.UpdateBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpackResponse:
        """
        Description: 更新一个技术栈
        Summary: 更新一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findbynames(
        self,
        request: deps_models.QueryBuildpackFindbynamesRequest,
    ) -> deps_models.QueryBuildpackFindbynamesResponse:
        """
        Description: 根据名称查询
        Summary: 根据名称查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findbynames_ex(request, headers, runtime)

    async def query_buildpack_findbynames_async(
        self,
        request: deps_models.QueryBuildpackFindbynamesRequest,
    ) -> deps_models.QueryBuildpackFindbynamesResponse:
        """
        Description: 根据名称查询
        Summary: 根据名称查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findbynames_ex_async(request, headers, runtime)

    def query_buildpack_findbynames_ex(
        self,
        request: deps_models.QueryBuildpackFindbynamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbynamesResponse:
        """
        Description: 根据名称查询
        Summary: 根据名称查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbynamesResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findbynames.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findbynames_ex_async(
        self,
        request: deps_models.QueryBuildpackFindbynamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbynamesResponse:
        """
        Description: 根据名称查询
        Summary: 根据名称查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbynamesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findbynames.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_buildpack(
        self,
        request: deps_models.CountBuildpackRequest,
    ) -> deps_models.CountBuildpackResponse:
        """
        Description: 计算
        Summary: 计算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_buildpack_ex(request, headers, runtime)

    async def count_buildpack_async(
        self,
        request: deps_models.CountBuildpackRequest,
    ) -> deps_models.CountBuildpackResponse:
        """
        Description: 计算
        Summary: 计算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_buildpack_ex_async(request, headers, runtime)

    def count_buildpack_ex(
        self,
        request: deps_models.CountBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountBuildpackResponse:
        """
        Description: 计算
        Summary: 计算
        """
        UtilClient.validate_model(request)
        return deps_models.CountBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_buildpack_ex_async(
        self,
        request: deps_models.CountBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountBuildpackResponse:
        """
        Description: 计算
        Summary: 计算
        """
        UtilClient.validate_model(request)
        return deps_models.CountBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deprecate_buildpack(
        self,
        request: deps_models.DeprecateBuildpackRequest,
    ) -> deps_models.DeprecateBuildpackResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deprecate_buildpack_ex(request, headers, runtime)

    async def deprecate_buildpack_async(
        self,
        request: deps_models.DeprecateBuildpackRequest,
    ) -> deps_models.DeprecateBuildpackResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deprecate_buildpack_ex_async(request, headers, runtime)

    def deprecate_buildpack_ex(
        self,
        request: deps_models.DeprecateBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeprecateBuildpackResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        UtilClient.validate_model(request)
        return deps_models.DeprecateBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.deprecate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deprecate_buildpack_ex_async(
        self,
        request: deps_models.DeprecateBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeprecateBuildpackResponse:
        """
        Description: 废弃
        Summary: 废弃
        """
        UtilClient.validate_model(request)
        return deps_models.DeprecateBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.deprecate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_buildpack(
        self,
        request: deps_models.BatchdeleteBuildpackRequest,
    ) -> deps_models.BatchdeleteBuildpackResponse:
        """
        Description: 批量删除
        Summary: 批量删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_buildpack_ex(request, headers, runtime)

    async def batchdelete_buildpack_async(
        self,
        request: deps_models.BatchdeleteBuildpackRequest,
    ) -> deps_models.BatchdeleteBuildpackResponse:
        """
        Description: 批量删除
        Summary: 批量删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_buildpack_ex_async(request, headers, runtime)

    def batchdelete_buildpack_ex(
        self,
        request: deps_models.BatchdeleteBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchdeleteBuildpackResponse:
        """
        Description: 批量删除
        Summary: 批量删除
        """
        UtilClient.validate_model(request)
        return deps_models.BatchdeleteBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_buildpack_ex_async(
        self,
        request: deps_models.BatchdeleteBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchdeleteBuildpackResponse:
        """
        Description: 批量删除
        Summary: 批量删除
        """
        UtilClient.validate_model(request)
        return deps_models.BatchdeleteBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_buildpack(
        self,
        request: deps_models.ExistBuildpackRequest,
    ) -> deps_models.ExistBuildpackResponse:
        """
        Description: 查询是否存在
        Summary: 查询是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_buildpack_ex(request, headers, runtime)

    async def exist_buildpack_async(
        self,
        request: deps_models.ExistBuildpackRequest,
    ) -> deps_models.ExistBuildpackResponse:
        """
        Description: 查询是否存在
        Summary: 查询是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_buildpack_ex_async(request, headers, runtime)

    def exist_buildpack_ex(
        self,
        request: deps_models.ExistBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistBuildpackResponse:
        """
        Description: 查询是否存在
        Summary: 查询是否存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_buildpack_ex_async(
        self,
        request: deps_models.ExistBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistBuildpackResponse:
        """
        Description: 查询是否存在
        Summary: 查询是否存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_buildpack_updatepackagesstatus(
        self,
        request: deps_models.UpdateBuildpackUpdatepackagesstatusRequest,
    ) -> deps_models.UpdateBuildpackUpdatepackagesstatusResponse:
        """
        Description: 更新打包状态
        Summary: 更新打包状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_buildpack_updatepackagesstatus_ex(request, headers, runtime)

    async def update_buildpack_updatepackagesstatus_async(
        self,
        request: deps_models.UpdateBuildpackUpdatepackagesstatusRequest,
    ) -> deps_models.UpdateBuildpackUpdatepackagesstatusResponse:
        """
        Description: 更新打包状态
        Summary: 更新打包状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_buildpack_updatepackagesstatus_ex_async(request, headers, runtime)

    def update_buildpack_updatepackagesstatus_ex(
        self,
        request: deps_models.UpdateBuildpackUpdatepackagesstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpackUpdatepackagesstatusResponse:
        """
        Description: 更新打包状态
        Summary: 更新打包状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpackUpdatepackagesstatusResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.updatepackagesstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_buildpack_updatepackagesstatus_ex_async(
        self,
        request: deps_models.UpdateBuildpackUpdatepackagesstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpackUpdatepackagesstatusResponse:
        """
        Description: 更新打包状态
        Summary: 更新打包状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpackUpdatepackagesstatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.updatepackagesstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findidversionpairsbyversion(
        self,
        request: deps_models.QueryBuildpackFindidversionpairsbyversionRequest,
    ) -> deps_models.QueryBuildpackFindidversionpairsbyversionResponse:
        """
        Description: 查询版本
        Summary: 查询版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findidversionpairsbyversion_ex(request, headers, runtime)

    async def query_buildpack_findidversionpairsbyversion_async(
        self,
        request: deps_models.QueryBuildpackFindidversionpairsbyversionRequest,
    ) -> deps_models.QueryBuildpackFindidversionpairsbyversionResponse:
        """
        Description: 查询版本
        Summary: 查询版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findidversionpairsbyversion_ex_async(request, headers, runtime)

    def query_buildpack_findidversionpairsbyversion_ex(
        self,
        request: deps_models.QueryBuildpackFindidversionpairsbyversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindidversionpairsbyversionResponse:
        """
        Description: 查询版本
        Summary: 查询版本
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindidversionpairsbyversionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findidversionpairsbyversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findidversionpairsbyversion_ex_async(
        self,
        request: deps_models.QueryBuildpackFindidversionpairsbyversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindidversionpairsbyversionResponse:
        """
        Description: 查询版本
        Summary: 查询版本
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindidversionpairsbyversionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findidversionpairsbyversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_groupbytechstack(
        self,
        request: deps_models.QueryBuildpackGroupbytechstackRequest,
    ) -> deps_models.QueryBuildpackGroupbytechstackResponse:
        """
        Description: 根据技术栈分组查询
        Summary: 根据技术栈分组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_groupbytechstack_ex(request, headers, runtime)

    async def query_buildpack_groupbytechstack_async(
        self,
        request: deps_models.QueryBuildpackGroupbytechstackRequest,
    ) -> deps_models.QueryBuildpackGroupbytechstackResponse:
        """
        Description: 根据技术栈分组查询
        Summary: 根据技术栈分组查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_groupbytechstack_ex_async(request, headers, runtime)

    def query_buildpack_groupbytechstack_ex(
        self,
        request: deps_models.QueryBuildpackGroupbytechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackGroupbytechstackResponse:
        """
        Description: 根据技术栈分组查询
        Summary: 根据技术栈分组查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackGroupbytechstackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.groupbytechstack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_groupbytechstack_ex_async(
        self,
        request: deps_models.QueryBuildpackGroupbytechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackGroupbytechstackResponse:
        """
        Description: 根据技术栈分组查询
        Summary: 根据技术栈分组查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackGroupbytechstackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.groupbytechstack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findvisibletechstacks(
        self,
        request: deps_models.QueryBuildpackFindvisibletechstacksRequest,
    ) -> deps_models.QueryBuildpackFindvisibletechstacksResponse:
        """
        Description: 查询可见技术栈
        Summary: 查询可见技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findvisibletechstacks_ex(request, headers, runtime)

    async def query_buildpack_findvisibletechstacks_async(
        self,
        request: deps_models.QueryBuildpackFindvisibletechstacksRequest,
    ) -> deps_models.QueryBuildpackFindvisibletechstacksResponse:
        """
        Description: 查询可见技术栈
        Summary: 查询可见技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findvisibletechstacks_ex_async(request, headers, runtime)

    def query_buildpack_findvisibletechstacks_ex(
        self,
        request: deps_models.QueryBuildpackFindvisibletechstacksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindvisibletechstacksResponse:
        """
        Description: 查询可见技术栈
        Summary: 查询可见技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindvisibletechstacksResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findvisibletechstacks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findvisibletechstacks_ex_async(
        self,
        request: deps_models.QueryBuildpackFindvisibletechstacksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindvisibletechstacksResponse:
        """
        Description: 查询可见技术栈
        Summary: 查询可见技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindvisibletechstacksResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findvisibletechstacks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findwritabletechstacks(
        self,
        request: deps_models.QueryBuildpackFindwritabletechstacksRequest,
    ) -> deps_models.QueryBuildpackFindwritabletechstacksResponse:
        """
        Description: 查询可写技术栈
        Summary: 查询可写技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findwritabletechstacks_ex(request, headers, runtime)

    async def query_buildpack_findwritabletechstacks_async(
        self,
        request: deps_models.QueryBuildpackFindwritabletechstacksRequest,
    ) -> deps_models.QueryBuildpackFindwritabletechstacksResponse:
        """
        Description: 查询可写技术栈
        Summary: 查询可写技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findwritabletechstacks_ex_async(request, headers, runtime)

    def query_buildpack_findwritabletechstacks_ex(
        self,
        request: deps_models.QueryBuildpackFindwritabletechstacksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindwritabletechstacksResponse:
        """
        Description: 查询可写技术栈
        Summary: 查询可写技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindwritabletechstacksResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findwritabletechstacks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findwritabletechstacks_ex_async(
        self,
        request: deps_models.QueryBuildpackFindwritabletechstacksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindwritabletechstacksResponse:
        """
        Description: 查询可写技术栈
        Summary: 查询可写技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindwritabletechstacksResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findwritabletechstacks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findosbycurrentcloud(
        self,
        request: deps_models.QueryBuildpackFindosbycurrentcloudRequest,
    ) -> deps_models.QueryBuildpackFindosbycurrentcloudResponse:
        """
        Description: 查询os通过当前云
        Summary: 查询os通过当前云
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findosbycurrentcloud_ex(request, headers, runtime)

    async def query_buildpack_findosbycurrentcloud_async(
        self,
        request: deps_models.QueryBuildpackFindosbycurrentcloudRequest,
    ) -> deps_models.QueryBuildpackFindosbycurrentcloudResponse:
        """
        Description: 查询os通过当前云
        Summary: 查询os通过当前云
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findosbycurrentcloud_ex_async(request, headers, runtime)

    def query_buildpack_findosbycurrentcloud_ex(
        self,
        request: deps_models.QueryBuildpackFindosbycurrentcloudRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindosbycurrentcloudResponse:
        """
        Description: 查询os通过当前云
        Summary: 查询os通过当前云
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindosbycurrentcloudResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findosbycurrentcloud.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findosbycurrentcloud_ex_async(
        self,
        request: deps_models.QueryBuildpackFindosbycurrentcloudRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindosbycurrentcloudResponse:
        """
        Description: 查询os通过当前云
        Summary: 查询os通过当前云
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindosbycurrentcloudResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findosbycurrentcloud.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findbyappsv(
        self,
        request: deps_models.QueryBuildpackFindbyappsvRequest,
    ) -> deps_models.QueryBuildpackFindbyappsvResponse:
        """
        Description: 通过appv1查询buildpack
        Summary: 查询buildpack
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findbyappsv_ex(request, headers, runtime)

    async def query_buildpack_findbyappsv_async(
        self,
        request: deps_models.QueryBuildpackFindbyappsvRequest,
    ) -> deps_models.QueryBuildpackFindbyappsvResponse:
        """
        Description: 通过appv1查询buildpack
        Summary: 查询buildpack
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findbyappsv_ex_async(request, headers, runtime)

    def query_buildpack_findbyappsv_ex(
        self,
        request: deps_models.QueryBuildpackFindbyappsvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappsvResponse:
        """
        Description: 通过appv1查询buildpack
        Summary: 查询buildpack
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappsvResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findbyappsv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findbyappsv_ex_async(
        self,
        request: deps_models.QueryBuildpackFindbyappsvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappsvResponse:
        """
        Description: 通过appv1查询buildpack
        Summary: 查询buildpack
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappsvResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findbyappsv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findbyapps(
        self,
        request: deps_models.QueryBuildpackFindbyappsRequest,
    ) -> deps_models.QueryBuildpackFindbyappsResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findbyapps_ex(request, headers, runtime)

    async def query_buildpack_findbyapps_async(
        self,
        request: deps_models.QueryBuildpackFindbyappsRequest,
    ) -> deps_models.QueryBuildpackFindbyappsResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findbyapps_ex_async(request, headers, runtime)

    def query_buildpack_findbyapps_ex(
        self,
        request: deps_models.QueryBuildpackFindbyappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappsResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findbyapps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findbyapps_ex_async(
        self,
        request: deps_models.QueryBuildpackFindbyappsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappsResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findbyapps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findbyappservices(
        self,
        request: deps_models.QueryBuildpackFindbyappservicesRequest,
    ) -> deps_models.QueryBuildpackFindbyappservicesResponse:
        """
        Description: 通过app服务查询
        Summary: 通过app服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findbyappservices_ex(request, headers, runtime)

    async def query_buildpack_findbyappservices_async(
        self,
        request: deps_models.QueryBuildpackFindbyappservicesRequest,
    ) -> deps_models.QueryBuildpackFindbyappservicesResponse:
        """
        Description: 通过app服务查询
        Summary: 通过app服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findbyappservices_ex_async(request, headers, runtime)

    def query_buildpack_findbyappservices_ex(
        self,
        request: deps_models.QueryBuildpackFindbyappservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappservicesResponse:
        """
        Description: 通过app服务查询
        Summary: 通过app服务查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappservicesResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findbyappservices.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findbyappservices_ex_async(
        self,
        request: deps_models.QueryBuildpackFindbyappservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappservicesResponse:
        """
        Description: 通过app服务查询
        Summary: 通过app服务查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappservicesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findbyappservices.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findbyappv(
        self,
        request: deps_models.QueryBuildpackFindbyappvRequest,
    ) -> deps_models.QueryBuildpackFindbyappvResponse:
        """
        Description: 通过appv1查询
        Summary: 通过appv1查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findbyappv_ex(request, headers, runtime)

    async def query_buildpack_findbyappv_async(
        self,
        request: deps_models.QueryBuildpackFindbyappvRequest,
    ) -> deps_models.QueryBuildpackFindbyappvResponse:
        """
        Description: 通过appv1查询
        Summary: 通过appv1查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findbyappv_ex_async(request, headers, runtime)

    def query_buildpack_findbyappv_ex(
        self,
        request: deps_models.QueryBuildpackFindbyappvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappvResponse:
        """
        Description: 通过appv1查询
        Summary: 通过appv1查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappvResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findbyappv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findbyappv_ex_async(
        self,
        request: deps_models.QueryBuildpackFindbyappvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappvResponse:
        """
        Description: 通过appv1查询
        Summary: 通过appv1查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappvResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findbyappv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findbyapp(
        self,
        request: deps_models.QueryBuildpackFindbyappRequest,
    ) -> deps_models.QueryBuildpackFindbyappResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findbyapp_ex(request, headers, runtime)

    async def query_buildpack_findbyapp_async(
        self,
        request: deps_models.QueryBuildpackFindbyappRequest,
    ) -> deps_models.QueryBuildpackFindbyappResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findbyapp_ex_async(request, headers, runtime)

    def query_buildpack_findbyapp_ex(
        self,
        request: deps_models.QueryBuildpackFindbyappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findbyapp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findbyapp_ex_async(
        self,
        request: deps_models.QueryBuildpackFindbyappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindbyappResponse:
        """
        Description: 通过app查询
        Summary: 通过app查询
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindbyappResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findbyapp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_buildpack_generatesignurl(
        self,
        request: deps_models.CreateBuildpackGeneratesignurlRequest,
    ) -> deps_models.CreateBuildpackGeneratesignurlResponse:
        """
        Description: 生成url
        Summary: 生成url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_buildpack_generatesignurl_ex(request, headers, runtime)

    async def create_buildpack_generatesignurl_async(
        self,
        request: deps_models.CreateBuildpackGeneratesignurlRequest,
    ) -> deps_models.CreateBuildpackGeneratesignurlResponse:
        """
        Description: 生成url
        Summary: 生成url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_buildpack_generatesignurl_ex_async(request, headers, runtime)

    def create_buildpack_generatesignurl_ex(
        self,
        request: deps_models.CreateBuildpackGeneratesignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateBuildpackGeneratesignurlResponse:
        """
        Description: 生成url
        Summary: 生成url
        """
        UtilClient.validate_model(request)
        return deps_models.CreateBuildpackGeneratesignurlResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.generatesignurl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_buildpack_generatesignurl_ex_async(
        self,
        request: deps_models.CreateBuildpackGeneratesignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateBuildpackGeneratesignurlResponse:
        """
        Description: 生成url
        Summary: 生成url
        """
        UtilClient.validate_model(request)
        return deps_models.CreateBuildpackGeneratesignurlResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.generatesignurl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_sumpackagessize(
        self,
        request: deps_models.QueryBuildpackSumpackagessizeRequest,
    ) -> deps_models.QueryBuildpackSumpackagessizeResponse:
        """
        Description: 查询pagessize
        Summary: 查询pagessize
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_sumpackagessize_ex(request, headers, runtime)

    async def query_buildpack_sumpackagessize_async(
        self,
        request: deps_models.QueryBuildpackSumpackagessizeRequest,
    ) -> deps_models.QueryBuildpackSumpackagessizeResponse:
        """
        Description: 查询pagessize
        Summary: 查询pagessize
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_sumpackagessize_ex_async(request, headers, runtime)

    def query_buildpack_sumpackagessize_ex(
        self,
        request: deps_models.QueryBuildpackSumpackagessizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackSumpackagessizeResponse:
        """
        Description: 查询pagessize
        Summary: 查询pagessize
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackSumpackagessizeResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.sumpackagessize.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_sumpackagessize_ex_async(
        self,
        request: deps_models.QueryBuildpackSumpackagessizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackSumpackagessizeResponse:
        """
        Description: 查询pagessize
        Summary: 查询pagessize
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackSumpackagessizeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.sumpackagessize.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_supportcoderepo(
        self,
        request: deps_models.QueryBuildpackSupportcoderepoRequest,
    ) -> deps_models.QueryBuildpackSupportcoderepoResponse:
        """
        Description: 查询是否supportcode
        Summary: 查询是否supportcode
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_supportcoderepo_ex(request, headers, runtime)

    async def query_buildpack_supportcoderepo_async(
        self,
        request: deps_models.QueryBuildpackSupportcoderepoRequest,
    ) -> deps_models.QueryBuildpackSupportcoderepoResponse:
        """
        Description: 查询是否supportcode
        Summary: 查询是否supportcode
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_supportcoderepo_ex_async(request, headers, runtime)

    def query_buildpack_supportcoderepo_ex(
        self,
        request: deps_models.QueryBuildpackSupportcoderepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackSupportcoderepoResponse:
        """
        Description: 查询是否supportcode
        Summary: 查询是否supportcode
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackSupportcoderepoResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.supportcoderepo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_supportcoderepo_ex_async(
        self,
        request: deps_models.QueryBuildpackSupportcoderepoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackSupportcoderepoResponse:
        """
        Description: 查询是否supportcode
        Summary: 查询是否supportcode
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackSupportcoderepoResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.supportcoderepo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_findavailablebyappserviceids(
        self,
        request: deps_models.QueryBuildpackFindavailablebyappserviceidsRequest,
    ) -> deps_models.QueryBuildpackFindavailablebyappserviceidsResponse:
        """
        Description: 通过可用的app服务id查询Composite信息
        Summary: 查询Composite信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_findavailablebyappserviceids_ex(request, headers, runtime)

    async def query_buildpack_findavailablebyappserviceids_async(
        self,
        request: deps_models.QueryBuildpackFindavailablebyappserviceidsRequest,
    ) -> deps_models.QueryBuildpackFindavailablebyappserviceidsResponse:
        """
        Description: 通过可用的app服务id查询Composite信息
        Summary: 查询Composite信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_findavailablebyappserviceids_ex_async(request, headers, runtime)

    def query_buildpack_findavailablebyappserviceids_ex(
        self,
        request: deps_models.QueryBuildpackFindavailablebyappserviceidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindavailablebyappserviceidsResponse:
        """
        Description: 通过可用的app服务id查询Composite信息
        Summary: 查询Composite信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindavailablebyappserviceidsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.findavailablebyappserviceids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_findavailablebyappserviceids_ex_async(
        self,
        request: deps_models.QueryBuildpackFindavailablebyappserviceidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpackFindavailablebyappserviceidsResponse:
        """
        Description: 通过可用的app服务id查询Composite信息
        Summary: 查询Composite信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpackFindavailablebyappserviceidsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.findavailablebyappserviceids.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpacknew(
        self,
        request: deps_models.QueryBuildpacknewRequest,
    ) -> deps_models.QueryBuildpacknewResponse:
        """
        Description: pageQuery
        Summary: pageQuery
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpacknew_ex(request, headers, runtime)

    async def query_buildpacknew_async(
        self,
        request: deps_models.QueryBuildpacknewRequest,
    ) -> deps_models.QueryBuildpacknewResponse:
        """
        Description: pageQuery
        Summary: pageQuery
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpacknew_ex_async(request, headers, runtime)

    def query_buildpacknew_ex(
        self,
        request: deps_models.QueryBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpacknewResponse:
        """
        Description: pageQuery
        Summary: pageQuery
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpacknewResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpacknew.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpacknew_ex_async(
        self,
        request: deps_models.QueryBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBuildpacknewResponse:
        """
        Description: pageQuery
        Summary: pageQuery
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBuildpacknewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpacknew.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_buildpacknew(
        self,
        request: deps_models.GetBuildpacknewRequest,
    ) -> deps_models.GetBuildpacknewResponse:
        """
        Description: buildpacknewget
        Summary: buildpacknewget
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_buildpacknew_ex(request, headers, runtime)

    async def get_buildpacknew_async(
        self,
        request: deps_models.GetBuildpacknewRequest,
    ) -> deps_models.GetBuildpacknewResponse:
        """
        Description: buildpacknewget
        Summary: buildpacknewget
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_buildpacknew_ex_async(request, headers, runtime)

    def get_buildpacknew_ex(
        self,
        request: deps_models.GetBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBuildpacknewResponse:
        """
        Description: buildpacknewget
        Summary: buildpacknewget
        """
        UtilClient.validate_model(request)
        return deps_models.GetBuildpacknewResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpacknew.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_buildpacknew_ex_async(
        self,
        request: deps_models.GetBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBuildpacknewResponse:
        """
        Description: buildpacknewget
        Summary: buildpacknewget
        """
        UtilClient.validate_model(request)
        return deps_models.GetBuildpacknewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpacknew.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_buildpacknew_uploadfinish(
        self,
        request: deps_models.UpdateBuildpacknewUploadfinishRequest,
    ) -> deps_models.UpdateBuildpacknewUploadfinishResponse:
        """
        Description: update
        Summary: update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_buildpacknew_uploadfinish_ex(request, headers, runtime)

    async def update_buildpacknew_uploadfinish_async(
        self,
        request: deps_models.UpdateBuildpacknewUploadfinishRequest,
    ) -> deps_models.UpdateBuildpacknewUploadfinishResponse:
        """
        Description: update
        Summary: update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_buildpacknew_uploadfinish_ex_async(request, headers, runtime)

    def update_buildpacknew_uploadfinish_ex(
        self,
        request: deps_models.UpdateBuildpacknewUploadfinishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpacknewUploadfinishResponse:
        """
        Description: update
        Summary: update
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpacknewUploadfinishResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpacknew.uploadfinish.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_buildpacknew_uploadfinish_ex_async(
        self,
        request: deps_models.UpdateBuildpacknewUploadfinishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpacknewUploadfinishResponse:
        """
        Description: update
        Summary: update
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpacknewUploadfinishResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpacknew.uploadfinish.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_buildpacknew(
        self,
        request: deps_models.UpdateBuildpacknewRequest,
    ) -> deps_models.UpdateBuildpacknewResponse:
        """
        Description: update
        Summary: update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_buildpacknew_ex(request, headers, runtime)

    async def update_buildpacknew_async(
        self,
        request: deps_models.UpdateBuildpacknewRequest,
    ) -> deps_models.UpdateBuildpacknewResponse:
        """
        Description: update
        Summary: update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_buildpacknew_ex_async(request, headers, runtime)

    def update_buildpacknew_ex(
        self,
        request: deps_models.UpdateBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpacknewResponse:
        """
        Description: update
        Summary: update
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpacknewResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpacknew.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_buildpacknew_ex_async(
        self,
        request: deps_models.UpdateBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateBuildpacknewResponse:
        """
        Description: update
        Summary: update
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateBuildpacknewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpacknew.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_buildpacknew(
        self,
        request: deps_models.CreateBuildpacknewRequest,
    ) -> deps_models.CreateBuildpacknewResponse:
        """
        Description: 创建技术栈
        Summary: 创建技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_buildpacknew_ex(request, headers, runtime)

    async def create_buildpacknew_async(
        self,
        request: deps_models.CreateBuildpacknewRequest,
    ) -> deps_models.CreateBuildpacknewResponse:
        """
        Description: 创建技术栈
        Summary: 创建技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_buildpacknew_ex_async(request, headers, runtime)

    def create_buildpacknew_ex(
        self,
        request: deps_models.CreateBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateBuildpacknewResponse:
        """
        Description: 创建技术栈
        Summary: 创建技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.CreateBuildpacknewResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpacknew.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_buildpacknew_ex_async(
        self,
        request: deps_models.CreateBuildpacknewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateBuildpacknewResponse:
        """
        Description: 创建技术栈
        Summary: 创建技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.CreateBuildpacknewResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpacknew.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_buildpack(
        self,
        request: deps_models.OnlineBuildpackRequest,
    ) -> deps_models.OnlineBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_buildpack_ex(request, headers, runtime)

    async def online_buildpack_async(
        self,
        request: deps_models.OnlineBuildpackRequest,
    ) -> deps_models.OnlineBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_buildpack_ex_async(request, headers, runtime)

    def online_buildpack_ex(
        self,
        request: deps_models.OnlineBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.OnlineBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.OnlineBuildpackResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.buildpack.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_buildpack_ex_async(
        self,
        request: deps_models.OnlineBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.OnlineBuildpackResponse:
        """
        Description: 发布一个技术栈
        Summary: 发布一个技术栈
        """
        UtilClient.validate_model(request)
        return deps_models.OnlineBuildpackResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.buildpack.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_config_global(
        self,
        request: deps_models.CreateConfigGlobalRequest,
    ) -> deps_models.CreateConfigGlobalResponse:
        """
        Description: 创建一个全局参数
        Summary: 创建一个全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_config_global_ex(request, headers, runtime)

    async def create_config_global_async(
        self,
        request: deps_models.CreateConfigGlobalRequest,
    ) -> deps_models.CreateConfigGlobalResponse:
        """
        Description: 创建一个全局参数
        Summary: 创建一个全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_config_global_ex_async(request, headers, runtime)

    def create_config_global_ex(
        self,
        request: deps_models.CreateConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateConfigGlobalResponse:
        """
        Description: 创建一个全局参数
        Summary: 创建一个全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.CreateConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_config_global_ex_async(
        self,
        request: deps_models.CreateConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateConfigGlobalResponse:
        """
        Description: 创建一个全局参数
        Summary: 创建一个全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.CreateConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_config_global(
        self,
        request: deps_models.DeleteConfigGlobalRequest,
    ) -> deps_models.DeleteConfigGlobalResponse:
        """
        Description: 删除一个全局参数
        Summary: 删除一个全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_config_global_ex(request, headers, runtime)

    async def delete_config_global_async(
        self,
        request: deps_models.DeleteConfigGlobalRequest,
    ) -> deps_models.DeleteConfigGlobalResponse:
        """
        Description: 删除一个全局参数
        Summary: 删除一个全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_config_global_ex_async(request, headers, runtime)

    def delete_config_global_ex(
        self,
        request: deps_models.DeleteConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteConfigGlobalResponse:
        """
        Description: 删除一个全局参数
        Summary: 删除一个全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_config_global_ex_async(
        self,
        request: deps_models.DeleteConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteConfigGlobalResponse:
        """
        Description: 删除一个全局参数
        Summary: 删除一个全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_config_global(
        self,
        request: deps_models.UpdateConfigGlobalRequest,
    ) -> deps_models.UpdateConfigGlobalResponse:
        """
        Description: 更新指定的全局参数
        Summary: 更新指定的全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_config_global_ex(request, headers, runtime)

    async def update_config_global_async(
        self,
        request: deps_models.UpdateConfigGlobalRequest,
    ) -> deps_models.UpdateConfigGlobalResponse:
        """
        Description: 更新指定的全局参数
        Summary: 更新指定的全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_config_global_ex_async(request, headers, runtime)

    def update_config_global_ex(
        self,
        request: deps_models.UpdateConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateConfigGlobalResponse:
        """
        Description: 更新指定的全局参数
        Summary: 更新指定的全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_config_global_ex_async(
        self,
        request: deps_models.UpdateConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateConfigGlobalResponse:
        """
        Description: 更新指定的全局参数
        Summary: 更新指定的全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_config_global(
        self,
        request: deps_models.QueryConfigGlobalRequest,
    ) -> deps_models.QueryConfigGlobalResponse:
        """
        Description: 根据条件查询符合条件的全局参数
        Summary: 根据条件查询符合条件的全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_config_global_ex(request, headers, runtime)

    async def query_config_global_async(
        self,
        request: deps_models.QueryConfigGlobalRequest,
    ) -> deps_models.QueryConfigGlobalResponse:
        """
        Description: 根据条件查询符合条件的全局参数
        Summary: 根据条件查询符合条件的全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_config_global_ex_async(request, headers, runtime)

    def query_config_global_ex(
        self,
        request: deps_models.QueryConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryConfigGlobalResponse:
        """
        Description: 根据条件查询符合条件的全局参数
        Summary: 根据条件查询符合条件的全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.QueryConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_config_global_ex_async(
        self,
        request: deps_models.QueryConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryConfigGlobalResponse:
        """
        Description: 根据条件查询符合条件的全局参数
        Summary: 根据条件查询符合条件的全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.QueryConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_config_global(
        self,
        request: deps_models.GetConfigGlobalRequest,
    ) -> deps_models.GetConfigGlobalResponse:
        """
        Description: 获取单个全局参数
        Summary: 获取单个全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_config_global_ex(request, headers, runtime)

    async def get_config_global_async(
        self,
        request: deps_models.GetConfigGlobalRequest,
    ) -> deps_models.GetConfigGlobalResponse:
        """
        Description: 获取单个全局参数
        Summary: 获取单个全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_config_global_ex_async(request, headers, runtime)

    def get_config_global_ex(
        self,
        request: deps_models.GetConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigGlobalResponse:
        """
        Description: 获取单个全局参数
        Summary: 获取单个全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_config_global_ex_async(
        self,
        request: deps_models.GetConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigGlobalResponse:
        """
        Description: 获取单个全局参数
        Summary: 获取单个全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_config_app(
        self,
        request: deps_models.CreateConfigAppRequest,
    ) -> deps_models.CreateConfigAppResponse:
        """
        Description: 创建一个应用参数
        Summary: 创建一个应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_config_app_ex(request, headers, runtime)

    async def create_config_app_async(
        self,
        request: deps_models.CreateConfigAppRequest,
    ) -> deps_models.CreateConfigAppResponse:
        """
        Description: 创建一个应用参数
        Summary: 创建一个应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_config_app_ex_async(request, headers, runtime)

    def create_config_app_ex(
        self,
        request: deps_models.CreateConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateConfigAppResponse:
        """
        Description: 创建一个应用参数
        Summary: 创建一个应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.CreateConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_config_app_ex_async(
        self,
        request: deps_models.CreateConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateConfigAppResponse:
        """
        Description: 创建一个应用参数
        Summary: 创建一个应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.CreateConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_config_app(
        self,
        request: deps_models.DeleteConfigAppRequest,
    ) -> deps_models.DeleteConfigAppResponse:
        """
        Description: 删除一个应用参数
        Summary: 删除一个应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_config_app_ex(request, headers, runtime)

    async def delete_config_app_async(
        self,
        request: deps_models.DeleteConfigAppRequest,
    ) -> deps_models.DeleteConfigAppResponse:
        """
        Description: 删除一个应用参数
        Summary: 删除一个应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_config_app_ex_async(request, headers, runtime)

    def delete_config_app_ex(
        self,
        request: deps_models.DeleteConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteConfigAppResponse:
        """
        Description: 删除一个应用参数
        Summary: 删除一个应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_config_app_ex_async(
        self,
        request: deps_models.DeleteConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteConfigAppResponse:
        """
        Description: 删除一个应用参数
        Summary: 删除一个应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_config_app(
        self,
        request: deps_models.UpdateConfigAppRequest,
    ) -> deps_models.UpdateConfigAppResponse:
        """
        Description: 更新指定的应用参数
        Summary: 更新指定的应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_config_app_ex(request, headers, runtime)

    async def update_config_app_async(
        self,
        request: deps_models.UpdateConfigAppRequest,
    ) -> deps_models.UpdateConfigAppResponse:
        """
        Description: 更新指定的应用参数
        Summary: 更新指定的应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_config_app_ex_async(request, headers, runtime)

    def update_config_app_ex(
        self,
        request: deps_models.UpdateConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateConfigAppResponse:
        """
        Description: 更新指定的应用参数
        Summary: 更新指定的应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_config_app_ex_async(
        self,
        request: deps_models.UpdateConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateConfigAppResponse:
        """
        Description: 更新指定的应用参数
        Summary: 更新指定的应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_config_app(
        self,
        request: deps_models.GetConfigAppRequest,
    ) -> deps_models.GetConfigAppResponse:
        """
        Description: 获取指定的应用参数
        Summary: 获取指定的应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_config_app_ex(request, headers, runtime)

    async def get_config_app_async(
        self,
        request: deps_models.GetConfigAppRequest,
    ) -> deps_models.GetConfigAppResponse:
        """
        Description: 获取指定的应用参数
        Summary: 获取指定的应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_config_app_ex_async(request, headers, runtime)

    def get_config_app_ex(
        self,
        request: deps_models.GetConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigAppResponse:
        """
        Description: 获取指定的应用参数
        Summary: 获取指定的应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_config_app_ex_async(
        self,
        request: deps_models.GetConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigAppResponse:
        """
        Description: 获取指定的应用参数
        Summary: 获取指定的应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_config_app(
        self,
        request: deps_models.QueryConfigAppRequest,
    ) -> deps_models.QueryConfigAppResponse:
        """
        Description: 查询符合条件的应用参数
        Summary: 查询符合条件的应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_config_app_ex(request, headers, runtime)

    async def query_config_app_async(
        self,
        request: deps_models.QueryConfigAppRequest,
    ) -> deps_models.QueryConfigAppResponse:
        """
        Description: 查询符合条件的应用参数
        Summary: 查询符合条件的应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_config_app_ex_async(request, headers, runtime)

    def query_config_app_ex(
        self,
        request: deps_models.QueryConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryConfigAppResponse:
        """
        Description: 查询符合条件的应用参数
        Summary: 查询符合条件的应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.QueryConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_config_app_ex_async(
        self,
        request: deps_models.QueryConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryConfigAppResponse:
        """
        Description: 查询符合条件的应用参数
        Summary: 查询符合条件的应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.QueryConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_config_template(
        self,
        request: deps_models.SaveConfigTemplateRequest,
    ) -> deps_models.SaveConfigTemplateResponse:
        """
        Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
        Summary: 将一个应用参数模板保存为草稿
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_config_template_ex(request, headers, runtime)

    async def save_config_template_async(
        self,
        request: deps_models.SaveConfigTemplateRequest,
    ) -> deps_models.SaveConfigTemplateResponse:
        """
        Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
        Summary: 将一个应用参数模板保存为草稿
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_config_template_ex_async(request, headers, runtime)

    def save_config_template_ex(
        self,
        request: deps_models.SaveConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SaveConfigTemplateResponse:
        """
        Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
        Summary: 将一个应用参数模板保存为草稿
        """
        UtilClient.validate_model(request)
        return deps_models.SaveConfigTemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_config_template_ex_async(
        self,
        request: deps_models.SaveConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SaveConfigTemplateResponse:
        """
        Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
        Summary: 将一个应用参数模板保存为草稿
        """
        UtilClient.validate_model(request)
        return deps_models.SaveConfigTemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_config_template(
        self,
        request: deps_models.CreateConfigTemplateRequest,
    ) -> deps_models.CreateConfigTemplateResponse:
        """
        Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
        Summary: 发布一个应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_config_template_ex(request, headers, runtime)

    async def create_config_template_async(
        self,
        request: deps_models.CreateConfigTemplateRequest,
    ) -> deps_models.CreateConfigTemplateResponse:
        """
        Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
        Summary: 发布一个应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_config_template_ex_async(request, headers, runtime)

    def create_config_template_ex(
        self,
        request: deps_models.CreateConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateConfigTemplateResponse:
        """
        Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
        Summary: 发布一个应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.CreateConfigTemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_config_template_ex_async(
        self,
        request: deps_models.CreateConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateConfigTemplateResponse:
        """
        Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
        Summary: 发布一个应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.CreateConfigTemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_config_template(
        self,
        request: deps_models.PullConfigTemplateRequest,
    ) -> deps_models.PullConfigTemplateResponse:
        """
        Description: 获取某个应用最新版本的应用参数模板
        Summary: 获取某个应用最新版本的应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_config_template_ex(request, headers, runtime)

    async def pull_config_template_async(
        self,
        request: deps_models.PullConfigTemplateRequest,
    ) -> deps_models.PullConfigTemplateResponse:
        """
        Description: 获取某个应用最新版本的应用参数模板
        Summary: 获取某个应用最新版本的应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_config_template_ex_async(request, headers, runtime)

    def pull_config_template_ex(
        self,
        request: deps_models.PullConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.PullConfigTemplateResponse:
        """
        Description: 获取某个应用最新版本的应用参数模板
        Summary: 获取某个应用最新版本的应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.PullConfigTemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.template.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_config_template_ex_async(
        self,
        request: deps_models.PullConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.PullConfigTemplateResponse:
        """
        Description: 获取某个应用最新版本的应用参数模板
        Summary: 获取某个应用最新版本的应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.PullConfigTemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.template.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_config_templatedraft(
        self,
        request: deps_models.DeleteConfigTemplatedraftRequest,
    ) -> deps_models.DeleteConfigTemplatedraftResponse:
        """
        Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
        Summary: 删除一个应用参数模板草稿
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_config_templatedraft_ex(request, headers, runtime)

    async def delete_config_templatedraft_async(
        self,
        request: deps_models.DeleteConfigTemplatedraftRequest,
    ) -> deps_models.DeleteConfigTemplatedraftResponse:
        """
        Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
        Summary: 删除一个应用参数模板草稿
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_config_templatedraft_ex_async(request, headers, runtime)

    def delete_config_templatedraft_ex(
        self,
        request: deps_models.DeleteConfigTemplatedraftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteConfigTemplatedraftResponse:
        """
        Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
        Summary: 删除一个应用参数模板草稿
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteConfigTemplatedraftResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.templatedraft.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_config_templatedraft_ex_async(
        self,
        request: deps_models.DeleteConfigTemplatedraftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteConfigTemplatedraftResponse:
        """
        Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
        Summary: 删除一个应用参数模板草稿
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteConfigTemplatedraftResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.templatedraft.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_config_template(
        self,
        request: deps_models.GetConfigTemplateRequest,
    ) -> deps_models.GetConfigTemplateResponse:
        """
        Description: 获取某个指定的应用参数模板
        Summary: 获取某个指定的应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_config_template_ex(request, headers, runtime)

    async def get_config_template_async(
        self,
        request: deps_models.GetConfigTemplateRequest,
    ) -> deps_models.GetConfigTemplateResponse:
        """
        Description: 获取某个指定的应用参数模板
        Summary: 获取某个指定的应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_config_template_ex_async(request, headers, runtime)

    def get_config_template_ex(
        self,
        request: deps_models.GetConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigTemplateResponse:
        """
        Description: 获取某个指定的应用参数模板
        Summary: 获取某个指定的应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigTemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.template.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_config_template_ex_async(
        self,
        request: deps_models.GetConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigTemplateResponse:
        """
        Description: 获取某个指定的应用参数模板
        Summary: 获取某个指定的应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigTemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.template.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_config_template(
        self,
        request: deps_models.QueryConfigTemplateRequest,
    ) -> deps_models.QueryConfigTemplateResponse:
        """
        Description: 查询符合条件的应用参数模板
        Summary: 查询符合条件的应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_config_template_ex(request, headers, runtime)

    async def query_config_template_async(
        self,
        request: deps_models.QueryConfigTemplateRequest,
    ) -> deps_models.QueryConfigTemplateResponse:
        """
        Description: 查询符合条件的应用参数模板
        Summary: 查询符合条件的应用参数模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_config_template_ex_async(request, headers, runtime)

    def query_config_template_ex(
        self,
        request: deps_models.QueryConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryConfigTemplateResponse:
        """
        Description: 查询符合条件的应用参数模板
        Summary: 查询符合条件的应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.QueryConfigTemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_config_template_ex_async(
        self,
        request: deps_models.QueryConfigTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryConfigTemplateResponse:
        """
        Description: 查询符合条件的应用参数模板
        Summary: 查询符合条件的应用参数模板
        """
        UtilClient.validate_model(request)
        return deps_models.QueryConfigTemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_config_parse(
        self,
        request: deps_models.ExecConfigParseRequest,
    ) -> deps_models.ExecConfigParseResponse:
        """
        Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
        Summary: 渲染一个指定的参数列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_config_parse_ex(request, headers, runtime)

    async def exec_config_parse_async(
        self,
        request: deps_models.ExecConfigParseRequest,
    ) -> deps_models.ExecConfigParseResponse:
        """
        Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
        Summary: 渲染一个指定的参数列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_config_parse_ex_async(request, headers, runtime)

    def exec_config_parse_ex(
        self,
        request: deps_models.ExecConfigParseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecConfigParseResponse:
        """
        Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
        Summary: 渲染一个指定的参数列表
        """
        UtilClient.validate_model(request)
        return deps_models.ExecConfigParseResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.parse.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_config_parse_ex_async(
        self,
        request: deps_models.ExecConfigParseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecConfigParseResponse:
        """
        Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
        Summary: 渲染一个指定的参数列表
        """
        UtilClient.validate_model(request)
        return deps_models.ExecConfigParseResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.parse.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_config_global(
        self,
        request: deps_models.BatchcreateConfigGlobalRequest,
    ) -> deps_models.BatchcreateConfigGlobalResponse:
        """
        Description: 批量创建全局参数
        Summary: 批量创建全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_config_global_ex(request, headers, runtime)

    async def batchcreate_config_global_async(
        self,
        request: deps_models.BatchcreateConfigGlobalRequest,
    ) -> deps_models.BatchcreateConfigGlobalResponse:
        """
        Description: 批量创建全局参数
        Summary: 批量创建全局参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_config_global_ex_async(request, headers, runtime)

    def batchcreate_config_global_ex(
        self,
        request: deps_models.BatchcreateConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchcreateConfigGlobalResponse:
        """
        Description: 批量创建全局参数
        Summary: 批量创建全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.BatchcreateConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_config_global_ex_async(
        self,
        request: deps_models.BatchcreateConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchcreateConfigGlobalResponse:
        """
        Description: 批量创建全局参数
        Summary: 批量创建全局参数
        """
        UtilClient.validate_model(request)
        return deps_models.BatchcreateConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_config_app(
        self,
        request: deps_models.BatchcreateConfigAppRequest,
    ) -> deps_models.BatchcreateConfigAppResponse:
        """
        Description: 批量创建应用参数
        Summary: 批量创建应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_config_app_ex(request, headers, runtime)

    async def batchcreate_config_app_async(
        self,
        request: deps_models.BatchcreateConfigAppRequest,
    ) -> deps_models.BatchcreateConfigAppResponse:
        """
        Description: 批量创建应用参数
        Summary: 批量创建应用参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_config_app_ex_async(request, headers, runtime)

    def batchcreate_config_app_ex(
        self,
        request: deps_models.BatchcreateConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchcreateConfigAppResponse:
        """
        Description: 批量创建应用参数
        Summary: 批量创建应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.BatchcreateConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_config_app_ex_async(
        self,
        request: deps_models.BatchcreateConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchcreateConfigAppResponse:
        """
        Description: 批量创建应用参数
        Summary: 批量创建应用参数
        """
        UtilClient.validate_model(request)
        return deps_models.BatchcreateConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_config_sitetree(
        self,
        request: deps_models.GetConfigSitetreeRequest,
    ) -> deps_models.GetConfigSitetreeResponse:
        """
        Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
        Summary: 获取当前租户下的站点管理员视角的树形结构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_config_sitetree_ex(request, headers, runtime)

    async def get_config_sitetree_async(
        self,
        request: deps_models.GetConfigSitetreeRequest,
    ) -> deps_models.GetConfigSitetreeResponse:
        """
        Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
        Summary: 获取当前租户下的站点管理员视角的树形结构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_config_sitetree_ex_async(request, headers, runtime)

    def get_config_sitetree_ex(
        self,
        request: deps_models.GetConfigSitetreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigSitetreeResponse:
        """
        Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
        Summary: 获取当前租户下的站点管理员视角的树形结构
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigSitetreeResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.sitetree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_config_sitetree_ex_async(
        self,
        request: deps_models.GetConfigSitetreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigSitetreeResponse:
        """
        Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
        Summary: 获取当前租户下的站点管理员视角的树形结构
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigSitetreeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.sitetree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_config_tenanttree(
        self,
        request: deps_models.GetConfigTenanttreeRequest,
    ) -> deps_models.GetConfigTenanttreeResponse:
        """
        Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
        Summary: 获取当前租户下的租户管理员视角的树形结构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_config_tenanttree_ex(request, headers, runtime)

    async def get_config_tenanttree_async(
        self,
        request: deps_models.GetConfigTenanttreeRequest,
    ) -> deps_models.GetConfigTenanttreeResponse:
        """
        Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
        Summary: 获取当前租户下的租户管理员视角的树形结构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_config_tenanttree_ex_async(request, headers, runtime)

    def get_config_tenanttree_ex(
        self,
        request: deps_models.GetConfigTenanttreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigTenanttreeResponse:
        """
        Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
        Summary: 获取当前租户下的租户管理员视角的树形结构
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigTenanttreeResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.tenanttree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_config_tenanttree_ex_async(
        self,
        request: deps_models.GetConfigTenanttreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetConfigTenanttreeResponse:
        """
        Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
        Summary: 获取当前租户下的租户管理员视角的树形结构
        """
        UtilClient.validate_model(request)
        return deps_models.GetConfigTenanttreeResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.tenanttree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_config_app(
        self,
        request: deps_models.ExistConfigAppRequest,
    ) -> deps_models.ExistConfigAppResponse:
        """
        Description: 检查应用参数是否已存在
        Summary: 检查应用参数是否已存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_config_app_ex(request, headers, runtime)

    async def exist_config_app_async(
        self,
        request: deps_models.ExistConfigAppRequest,
    ) -> deps_models.ExistConfigAppResponse:
        """
        Description: 检查应用参数是否已存在
        Summary: 检查应用参数是否已存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_config_app_ex_async(request, headers, runtime)

    def exist_config_app_ex(
        self,
        request: deps_models.ExistConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistConfigAppResponse:
        """
        Description: 检查应用参数是否已存在
        Summary: 检查应用参数是否已存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistConfigAppResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.app.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_config_app_ex_async(
        self,
        request: deps_models.ExistConfigAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistConfigAppResponse:
        """
        Description: 检查应用参数是否已存在
        Summary: 检查应用参数是否已存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistConfigAppResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.app.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_config_global(
        self,
        request: deps_models.ExistConfigGlobalRequest,
    ) -> deps_models.ExistConfigGlobalResponse:
        """
        Description: 检查全局参数是否已存在
        Summary: 检查全局参数是否已存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_config_global_ex(request, headers, runtime)

    async def exist_config_global_async(
        self,
        request: deps_models.ExistConfigGlobalRequest,
    ) -> deps_models.ExistConfigGlobalResponse:
        """
        Description: 检查全局参数是否已存在
        Summary: 检查全局参数是否已存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_config_global_ex_async(request, headers, runtime)

    def exist_config_global_ex(
        self,
        request: deps_models.ExistConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistConfigGlobalResponse:
        """
        Description: 检查全局参数是否已存在
        Summary: 检查全局参数是否已存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistConfigGlobalResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.config.global.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_config_global_ex_async(
        self,
        request: deps_models.ExistConfigGlobalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExistConfigGlobalResponse:
        """
        Description: 检查全局参数是否已存在
        Summary: 检查全局参数是否已存在
        """
        UtilClient.validate_model(request)
        return deps_models.ExistConfigGlobalResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.config.global.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_workspacegroup(
        self,
        request: deps_models.ListWorkspacegroupRequest,
    ) -> deps_models.ListWorkspacegroupResponse:
        """
        Description: 列出指定租户下所有环境
        Summary: 列出指定租户下所有环境
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_workspacegroup_ex(request, headers, runtime)

    async def list_workspacegroup_async(
        self,
        request: deps_models.ListWorkspacegroupRequest,
    ) -> deps_models.ListWorkspacegroupResponse:
        """
        Description: 列出指定租户下所有环境
        Summary: 列出指定租户下所有环境
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_workspacegroup_ex_async(request, headers, runtime)

    def list_workspacegroup_ex(
        self,
        request: deps_models.ListWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListWorkspacegroupResponse:
        """
        Description: 列出指定租户下所有环境
        Summary: 列出指定租户下所有环境
        """
        UtilClient.validate_model(request)
        return deps_models.ListWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspacegroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_workspacegroup_ex_async(
        self,
        request: deps_models.ListWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListWorkspacegroupResponse:
        """
        Description: 列出指定租户下所有环境
        Summary: 列出指定租户下所有环境
        """
        UtilClient.validate_model(request)
        return deps_models.ListWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspacegroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspacegroup(
        self,
        request: deps_models.GetWorkspacegroupRequest,
    ) -> deps_models.GetWorkspacegroupResponse:
        """
        Description: 查询指定环境信息
        Summary: 查询指定环境信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspacegroup_ex(request, headers, runtime)

    async def get_workspacegroup_async(
        self,
        request: deps_models.GetWorkspacegroupRequest,
    ) -> deps_models.GetWorkspacegroupResponse:
        """
        Description: 查询指定环境信息
        Summary: 查询指定环境信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspacegroup_ex_async(request, headers, runtime)

    def get_workspacegroup_ex(
        self,
        request: deps_models.GetWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetWorkspacegroupResponse:
        """
        Description: 查询指定环境信息
        Summary: 查询指定环境信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspacegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspacegroup_ex_async(
        self,
        request: deps_models.GetWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetWorkspacegroupResponse:
        """
        Description: 查询指定环境信息
        Summary: 查询指定环境信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspacegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cell(
        self,
        request: deps_models.QueryCellRequest,
    ) -> deps_models.QueryCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cell_ex(request, headers, runtime)

    async def query_cell_async(
        self,
        request: deps_models.QueryCellRequest,
    ) -> deps_models.QueryCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cell_ex_async(request, headers, runtime)

    def query_cell_ex(
        self,
        request: deps_models.QueryCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cell_ex_async(
        self,
        request: deps_models.QueryCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_workspace_delta(
        self,
        request: deps_models.QueryWorkspaceDeltaRequest,
    ) -> deps_models.QueryWorkspaceDeltaResponse:
        """
        Description: 查询环境增量统计信息
        Summary: 查询环境增量统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_workspace_delta_ex(request, headers, runtime)

    async def query_workspace_delta_async(
        self,
        request: deps_models.QueryWorkspaceDeltaRequest,
    ) -> deps_models.QueryWorkspaceDeltaResponse:
        """
        Description: 查询环境增量统计信息
        Summary: 查询环境增量统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_workspace_delta_ex_async(request, headers, runtime)

    def query_workspace_delta_ex(
        self,
        request: deps_models.QueryWorkspaceDeltaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryWorkspaceDeltaResponse:
        """
        Description: 查询环境增量统计信息
        Summary: 查询环境增量统计信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryWorkspaceDeltaResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspace.delta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_workspace_delta_ex_async(
        self,
        request: deps_models.QueryWorkspaceDeltaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryWorkspaceDeltaResponse:
        """
        Description: 查询环境增量统计信息
        Summary: 查询环境增量统计信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryWorkspaceDeltaResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspace.delta.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_workspacegroup(
        self,
        request: deps_models.CreateWorkspacegroupRequest,
    ) -> deps_models.CreateWorkspacegroupResponse:
        """
        Description: 创建工作空间组。
        Summary: 创建工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_workspacegroup_ex(request, headers, runtime)

    async def create_workspacegroup_async(
        self,
        request: deps_models.CreateWorkspacegroupRequest,
    ) -> deps_models.CreateWorkspacegroupResponse:
        """
        Description: 创建工作空间组。
        Summary: 创建工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_workspacegroup_ex_async(request, headers, runtime)

    def create_workspacegroup_ex(
        self,
        request: deps_models.CreateWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateWorkspacegroupResponse:
        """
        Description: 创建工作空间组。
        Summary: 创建工作空间组
        """
        UtilClient.validate_model(request)
        return deps_models.CreateWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspacegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_workspacegroup_ex_async(
        self,
        request: deps_models.CreateWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateWorkspacegroupResponse:
        """
        Description: 创建工作空间组。
        Summary: 创建工作空间组
        """
        UtilClient.validate_model(request)
        return deps_models.CreateWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspacegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_workspacegroup(
        self,
        request: deps_models.QueryWorkspacegroupRequest,
    ) -> deps_models.QueryWorkspacegroupResponse:
        """
        Description: 查询环境组详细信息
        Summary: 查询环境组详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_workspacegroup_ex(request, headers, runtime)

    async def query_workspacegroup_async(
        self,
        request: deps_models.QueryWorkspacegroupRequest,
    ) -> deps_models.QueryWorkspacegroupResponse:
        """
        Description: 查询环境组详细信息
        Summary: 查询环境组详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_workspacegroup_ex_async(request, headers, runtime)

    def query_workspacegroup_ex(
        self,
        request: deps_models.QueryWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryWorkspacegroupResponse:
        """
        Description: 查询环境组详细信息
        Summary: 查询环境组详细信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspacegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_workspacegroup_ex_async(
        self,
        request: deps_models.QueryWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryWorkspacegroupResponse:
        """
        Description: 查询环境组详细信息
        Summary: 查询环境组详细信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspacegroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_workspacegroup(
        self,
        request: deps_models.DeleteWorkspacegroupRequest,
    ) -> deps_models.DeleteWorkspacegroupResponse:
        """
        Description: 删除指定工作空间组。
        Summary: 删除指定工作空间组。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_workspacegroup_ex(request, headers, runtime)

    async def delete_workspacegroup_async(
        self,
        request: deps_models.DeleteWorkspacegroupRequest,
    ) -> deps_models.DeleteWorkspacegroupResponse:
        """
        Description: 删除指定工作空间组。
        Summary: 删除指定工作空间组。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_workspacegroup_ex_async(request, headers, runtime)

    def delete_workspacegroup_ex(
        self,
        request: deps_models.DeleteWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteWorkspacegroupResponse:
        """
        Description: 删除指定工作空间组。
        Summary: 删除指定工作空间组。
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspacegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_workspacegroup_ex_async(
        self,
        request: deps_models.DeleteWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteWorkspacegroupResponse:
        """
        Description: 删除指定工作空间组。
        Summary: 删除指定工作空间组。
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspacegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_singleworkspace(
        self,
        request: deps_models.GetSingleworkspaceRequest,
    ) -> deps_models.GetSingleworkspaceResponse:
        """
        Description: 查询workspace信息(V2)。
        Summary: 查询workspace信息(V2)。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_singleworkspace_ex(request, headers, runtime)

    async def get_singleworkspace_async(
        self,
        request: deps_models.GetSingleworkspaceRequest,
    ) -> deps_models.GetSingleworkspaceResponse:
        """
        Description: 查询workspace信息(V2)。
        Summary: 查询workspace信息(V2)。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_singleworkspace_ex_async(request, headers, runtime)

    def get_singleworkspace_ex(
        self,
        request: deps_models.GetSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSingleworkspaceResponse:
        """
        Description: 查询workspace信息(V2)。
        Summary: 查询workspace信息(V2)。
        """
        UtilClient.validate_model(request)
        return deps_models.GetSingleworkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.singleworkspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_singleworkspace_ex_async(
        self,
        request: deps_models.GetSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSingleworkspaceResponse:
        """
        Description: 查询workspace信息(V2)。
        Summary: 查询workspace信息(V2)。
        """
        UtilClient.validate_model(request)
        return deps_models.GetSingleworkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.singleworkspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_singleworkspacegroup(
        self,
        request: deps_models.GetSingleworkspacegroupRequest,
    ) -> deps_models.GetSingleworkspacegroupResponse:
        """
        Description: 查询指定环境信息。
        Summary: 查询指定环境信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_singleworkspacegroup_ex(request, headers, runtime)

    async def get_singleworkspacegroup_async(
        self,
        request: deps_models.GetSingleworkspacegroupRequest,
    ) -> deps_models.GetSingleworkspacegroupResponse:
        """
        Description: 查询指定环境信息。
        Summary: 查询指定环境信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_singleworkspacegroup_ex_async(request, headers, runtime)

    def get_singleworkspacegroup_ex(
        self,
        request: deps_models.GetSingleworkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSingleworkspacegroupResponse:
        """
        Description: 查询指定环境信息。
        Summary: 查询指定环境信息。
        """
        UtilClient.validate_model(request)
        return deps_models.GetSingleworkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.singleworkspacegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_singleworkspacegroup_ex_async(
        self,
        request: deps_models.GetSingleworkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSingleworkspacegroupResponse:
        """
        Description: 查询指定环境信息。
        Summary: 查询指定环境信息。
        """
        UtilClient.validate_model(request)
        return deps_models.GetSingleworkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.singleworkspacegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cell(
        self,
        request: deps_models.ListCellRequest,
    ) -> deps_models.ListCellResponse:
        """
        Description: 查询部署单元列表。
        Summary: 查询部署单元列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cell_ex(request, headers, runtime)

    async def list_cell_async(
        self,
        request: deps_models.ListCellRequest,
    ) -> deps_models.ListCellResponse:
        """
        Description: 查询部署单元列表。
        Summary: 查询部署单元列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cell_ex_async(request, headers, runtime)

    def list_cell_ex(
        self,
        request: deps_models.ListCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListCellResponse:
        """
        Description: 查询部署单元列表。
        Summary: 查询部署单元列表。
        """
        UtilClient.validate_model(request)
        return deps_models.ListCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cell_ex_async(
        self,
        request: deps_models.ListCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListCellResponse:
        """
        Description: 查询部署单元列表。
        Summary: 查询部署单元列表。
        """
        UtilClient.validate_model(request)
        return deps_models.ListCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_singleworkspace(
        self,
        request: deps_models.CreateSingleworkspaceRequest,
    ) -> deps_models.CreateSingleworkspaceResponse:
        """
        Description: 创建workspace信息(V2)
        Summary: 创建workspace信息(V2)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_singleworkspace_ex(request, headers, runtime)

    async def create_singleworkspace_async(
        self,
        request: deps_models.CreateSingleworkspaceRequest,
    ) -> deps_models.CreateSingleworkspaceResponse:
        """
        Description: 创建workspace信息(V2)
        Summary: 创建workspace信息(V2)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_singleworkspace_ex_async(request, headers, runtime)

    def create_singleworkspace_ex(
        self,
        request: deps_models.CreateSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSingleworkspaceResponse:
        """
        Description: 创建workspace信息(V2)
        Summary: 创建workspace信息(V2)
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSingleworkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.singleworkspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_singleworkspace_ex_async(
        self,
        request: deps_models.CreateSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSingleworkspaceResponse:
        """
        Description: 创建workspace信息(V2)
        Summary: 创建workspace信息(V2)
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSingleworkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.singleworkspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_singleworkspace(
        self,
        request: deps_models.DeleteSingleworkspaceRequest,
    ) -> deps_models.DeleteSingleworkspaceResponse:
        """
        Description: 删除workspace信息(V2)
        Summary: 删除workspace信息(V2)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_singleworkspace_ex(request, headers, runtime)

    async def delete_singleworkspace_async(
        self,
        request: deps_models.DeleteSingleworkspaceRequest,
    ) -> deps_models.DeleteSingleworkspaceResponse:
        """
        Description: 删除workspace信息(V2)
        Summary: 删除workspace信息(V2)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_singleworkspace_ex_async(request, headers, runtime)

    def delete_singleworkspace_ex(
        self,
        request: deps_models.DeleteSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSingleworkspaceResponse:
        """
        Description: 删除workspace信息(V2)
        Summary: 删除workspace信息(V2)
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSingleworkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.singleworkspace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_singleworkspace_ex_async(
        self,
        request: deps_models.DeleteSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSingleworkspaceResponse:
        """
        Description: 删除workspace信息(V2)
        Summary: 删除workspace信息(V2)
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSingleworkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.singleworkspace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_vpc(
        self,
        request: deps_models.CreateVpcRequest,
    ) -> deps_models.CreateVpcResponse:
        """
        Description: 创建专有网络vpc
        Summary: 创建专有网络vpc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_vpc_ex(request, headers, runtime)

    async def create_vpc_async(
        self,
        request: deps_models.CreateVpcRequest,
    ) -> deps_models.CreateVpcResponse:
        """
        Description: 创建专有网络vpc
        Summary: 创建专有网络vpc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_vpc_ex_async(request, headers, runtime)

    def create_vpc_ex(
        self,
        request: deps_models.CreateVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateVpcResponse:
        """
        Description: 创建专有网络vpc
        Summary: 创建专有网络vpc
        """
        UtilClient.validate_model(request)
        return deps_models.CreateVpcResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.vpc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_vpc_ex_async(
        self,
        request: deps_models.CreateVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateVpcResponse:
        """
        Description: 创建专有网络vpc
        Summary: 创建专有网络vpc
        """
        UtilClient.validate_model(request)
        return deps_models.CreateVpcResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.vpc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_workspacegroup(
        self,
        request: deps_models.UpdateWorkspacegroupRequest,
    ) -> deps_models.UpdateWorkspacegroupResponse:
        """
        Description: 更新workspacegroup。
        Summary: 更新workspacegroup。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_workspacegroup_ex(request, headers, runtime)

    async def update_workspacegroup_async(
        self,
        request: deps_models.UpdateWorkspacegroupRequest,
    ) -> deps_models.UpdateWorkspacegroupResponse:
        """
        Description: 更新workspacegroup。
        Summary: 更新workspacegroup。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_workspacegroup_ex_async(request, headers, runtime)

    def update_workspacegroup_ex(
        self,
        request: deps_models.UpdateWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateWorkspacegroupResponse:
        """
        Description: 更新workspacegroup。
        Summary: 更新workspacegroup。
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateWorkspacegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspacegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_workspacegroup_ex_async(
        self,
        request: deps_models.UpdateWorkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateWorkspacegroupResponse:
        """
        Description: 更新workspacegroup。
        Summary: 更新workspacegroup。
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateWorkspacegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspacegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_singleworkspace(
        self,
        request: deps_models.UpdateSingleworkspaceRequest,
    ) -> deps_models.UpdateSingleworkspaceResponse:
        """
        Description: update workspace meta data
        Summary: update workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_singleworkspace_ex(request, headers, runtime)

    async def update_singleworkspace_async(
        self,
        request: deps_models.UpdateSingleworkspaceRequest,
    ) -> deps_models.UpdateSingleworkspaceResponse:
        """
        Description: update workspace meta data
        Summary: update workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_singleworkspace_ex_async(request, headers, runtime)

    def update_singleworkspace_ex(
        self,
        request: deps_models.UpdateSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSingleworkspaceResponse:
        """
        Description: update workspace meta data
        Summary: update workspace
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSingleworkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.singleworkspace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_singleworkspace_ex_async(
        self,
        request: deps_models.UpdateSingleworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSingleworkspaceResponse:
        """
        Description: update workspace meta data
        Summary: update workspace
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSingleworkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.singleworkspace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_region(
        self,
        request: deps_models.ListRegionRequest,
    ) -> deps_models.ListRegionResponse:
        """
        Description: list regions
        Summary: list regions
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_region_ex(request, headers, runtime)

    async def list_region_async(
        self,
        request: deps_models.ListRegionRequest,
    ) -> deps_models.ListRegionResponse:
        """
        Description: list regions
        Summary: list regions
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_region_ex_async(request, headers, runtime)

    def list_region_ex(
        self,
        request: deps_models.ListRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListRegionResponse:
        """
        Description: list regions
        Summary: list regions
        """
        UtilClient.validate_model(request)
        return deps_models.ListRegionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.region.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_region_ex_async(
        self,
        request: deps_models.ListRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListRegionResponse:
        """
        Description: list regions
        Summary: list regions
        """
        UtilClient.validate_model(request)
        return deps_models.ListRegionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.region.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_zone(
        self,
        request: deps_models.ListZoneRequest,
    ) -> deps_models.ListZoneResponse:
        """
        Description: zone list
        Summary: zone list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_zone_ex(request, headers, runtime)

    async def list_zone_async(
        self,
        request: deps_models.ListZoneRequest,
    ) -> deps_models.ListZoneResponse:
        """
        Description: zone list
        Summary: zone list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_zone_ex_async(request, headers, runtime)

    def list_zone_ex(
        self,
        request: deps_models.ListZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListZoneResponse:
        """
        Description: zone list
        Summary: zone list
        """
        UtilClient.validate_model(request)
        return deps_models.ListZoneResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.zone.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_zone_ex_async(
        self,
        request: deps_models.ListZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListZoneResponse:
        """
        Description: zone list
        Summary: zone list
        """
        UtilClient.validate_model(request)
        return deps_models.ListZoneResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.zone.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cellgroup(
        self,
        request: deps_models.CreateCellgroupRequest,
    ) -> deps_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cellgroup_ex(request, headers, runtime)

    async def create_cellgroup_async(
        self,
        request: deps_models.CreateCellgroupRequest,
    ) -> deps_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cellgroup_ex_async(request, headers, runtime)

    def create_cellgroup_ex(
        self,
        request: deps_models.CreateCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        UtilClient.validate_model(request)
        return deps_models.CreateCellgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cellgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cellgroup_ex_async(
        self,
        request: deps_models.CreateCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        UtilClient.validate_model(request)
        return deps_models.CreateCellgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cellgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_cellgroup(
        self,
        request: deps_models.DeleteCellgroupRequest,
    ) -> deps_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_cellgroup_ex(request, headers, runtime)

    async def delete_cellgroup_async(
        self,
        request: deps_models.DeleteCellgroupRequest,
    ) -> deps_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_cellgroup_ex_async(request, headers, runtime)

    def delete_cellgroup_ex(
        self,
        request: deps_models.DeleteCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteCellgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cellgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_cellgroup_ex_async(
        self,
        request: deps_models.DeleteCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteCellgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cellgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cellgroup(
        self,
        request: deps_models.QueryCellgroupRequest,
    ) -> deps_models.QueryCellgroupResponse:
        """
        Description: 查询逻辑单元
        Summary: 查询逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cellgroup_ex(request, headers, runtime)

    async def query_cellgroup_async(
        self,
        request: deps_models.QueryCellgroupRequest,
    ) -> deps_models.QueryCellgroupResponse:
        """
        Description: 查询逻辑单元
        Summary: 查询逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cellgroup_ex_async(request, headers, runtime)

    def query_cellgroup_ex(
        self,
        request: deps_models.QueryCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCellgroupResponse:
        """
        Description: 查询逻辑单元
        Summary: 查询逻辑单元
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCellgroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cellgroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cellgroup_ex_async(
        self,
        request: deps_models.QueryCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCellgroupResponse:
        """
        Description: 查询逻辑单元
        Summary: 查询逻辑单元
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCellgroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cellgroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cellgroup_disasterinfo(
        self,
        request: deps_models.UpdateCellgroupDisasterinfoRequest,
    ) -> deps_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cellgroup_disasterinfo_ex(request, headers, runtime)

    async def update_cellgroup_disasterinfo_async(
        self,
        request: deps_models.UpdateCellgroupDisasterinfoRequest,
    ) -> deps_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cellgroup_disasterinfo_ex_async(request, headers, runtime)

    def update_cellgroup_disasterinfo_ex(
        self,
        request: deps_models.UpdateCellgroupDisasterinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateCellgroupDisasterinfoResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cellgroup.disasterinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cellgroup_disasterinfo_ex_async(
        self,
        request: deps_models.UpdateCellgroupDisasterinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateCellgroupDisasterinfoResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cellgroup.disasterinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_deployment_cell(
        self,
        request: deps_models.CreateDeploymentCellRequest,
    ) -> deps_models.CreateDeploymentCellResponse:
        """
        Description: 创建部署单元
        Summary: 创建部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deployment_cell_ex(request, headers, runtime)

    async def create_deployment_cell_async(
        self,
        request: deps_models.CreateDeploymentCellRequest,
    ) -> deps_models.CreateDeploymentCellResponse:
        """
        Description: 创建部署单元
        Summary: 创建部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deployment_cell_ex_async(request, headers, runtime)

    def create_deployment_cell_ex(
        self,
        request: deps_models.CreateDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateDeploymentCellResponse:
        """
        Description: 创建部署单元
        Summary: 创建部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.CreateDeploymentCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deployment_cell_ex_async(
        self,
        request: deps_models.CreateDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateDeploymentCellResponse:
        """
        Description: 创建部署单元
        Summary: 创建部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.CreateDeploymentCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_deployment_cell(
        self,
        request: deps_models.DeleteDeploymentCellRequest,
    ) -> deps_models.DeleteDeploymentCellResponse:
        """
        Description: 删除部署单元
        Summary: 删除部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_deployment_cell_ex(request, headers, runtime)

    async def delete_deployment_cell_async(
        self,
        request: deps_models.DeleteDeploymentCellRequest,
    ) -> deps_models.DeleteDeploymentCellResponse:
        """
        Description: 删除部署单元
        Summary: 删除部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_deployment_cell_ex_async(request, headers, runtime)

    def delete_deployment_cell_ex(
        self,
        request: deps_models.DeleteDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteDeploymentCellResponse:
        """
        Description: 删除部署单元
        Summary: 删除部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteDeploymentCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_deployment_cell_ex_async(
        self,
        request: deps_models.DeleteDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteDeploymentCellResponse:
        """
        Description: 删除部署单元
        Summary: 删除部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteDeploymentCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deployment_cell(
        self,
        request: deps_models.QueryDeploymentCellRequest,
    ) -> deps_models.QueryDeploymentCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deployment_cell_ex(request, headers, runtime)

    async def query_deployment_cell_async(
        self,
        request: deps_models.QueryDeploymentCellRequest,
    ) -> deps_models.QueryDeploymentCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deployment_cell_ex_async(request, headers, runtime)

    def query_deployment_cell_ex(
        self,
        request: deps_models.QueryDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryDeploymentCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.QueryDeploymentCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deployment_cell_ex_async(
        self,
        request: deps_models.QueryDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryDeploymentCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.QueryDeploymentCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_deployment_cell(
        self,
        request: deps_models.UpdateDeploymentCellRequest,
    ) -> deps_models.UpdateDeploymentCellResponse:
        """
        Description: 更新部署单元
        Summary: 更新部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_deployment_cell_ex(request, headers, runtime)

    async def update_deployment_cell_async(
        self,
        request: deps_models.UpdateDeploymentCellRequest,
    ) -> deps_models.UpdateDeploymentCellResponse:
        """
        Description: 更新部署单元
        Summary: 更新部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_deployment_cell_ex_async(request, headers, runtime)

    def update_deployment_cell_ex(
        self,
        request: deps_models.UpdateDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateDeploymentCellResponse:
        """
        Description: 更新部署单元
        Summary: 更新部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateDeploymentCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_deployment_cell_ex_async(
        self,
        request: deps_models.UpdateDeploymentCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateDeploymentCellResponse:
        """
        Description: 更新部署单元
        Summary: 更新部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateDeploymentCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deployment(
        self,
        request: deps_models.QueryDeploymentRequest,
    ) -> deps_models.QueryDeploymentResponse:
        """
        Description: 批量查询部署单基础信息
        Summary: 批量查询部署单基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deployment_ex(request, headers, runtime)

    async def query_deployment_async(
        self,
        request: deps_models.QueryDeploymentRequest,
    ) -> deps_models.QueryDeploymentResponse:
        """
        Description: 批量查询部署单基础信息
        Summary: 批量查询部署单基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deployment_ex_async(request, headers, runtime)

    def query_deployment_ex(
        self,
        request: deps_models.QueryDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryDeploymentResponse:
        """
        Description: 批量查询部署单基础信息
        Summary: 批量查询部署单基础信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deployment_ex_async(
        self,
        request: deps_models.QueryDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryDeploymentResponse:
        """
        Description: 批量查询部署单基础信息
        Summary: 批量查询部署单基础信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_deployment(
        self,
        request: deps_models.CancelDeploymentRequest,
    ) -> deps_models.CancelDeploymentResponse:
        """
        Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_deployment_ex(request, headers, runtime)

    async def cancel_deployment_async(
        self,
        request: deps_models.CancelDeploymentRequest,
    ) -> deps_models.CancelDeploymentResponse:
        """
        Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_deployment_ex_async(request, headers, runtime)

    def cancel_deployment_ex(
        self,
        request: deps_models.CancelDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelDeploymentResponse:
        """
        Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_deployment_ex_async(
        self,
        request: deps_models.CancelDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelDeploymentResponse:
        """
        Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_deployment(
        self,
        request: deps_models.CreateDeploymentRequest,
    ) -> deps_models.CreateDeploymentResponse:
        """
        Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
        Summary: 创建发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deployment_ex(request, headers, runtime)

    async def create_deployment_async(
        self,
        request: deps_models.CreateDeploymentRequest,
    ) -> deps_models.CreateDeploymentResponse:
        """
        Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
        Summary: 创建发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deployment_ex_async(request, headers, runtime)

    def create_deployment_ex(
        self,
        request: deps_models.CreateDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateDeploymentResponse:
        """
        Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
        Summary: 创建发布
        """
        UtilClient.validate_model(request)
        return deps_models.CreateDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deployment_ex_async(
        self,
        request: deps_models.CreateDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateDeploymentResponse:
        """
        Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
        Summary: 创建发布
        """
        UtilClient.validate_model(request)
        return deps_models.CreateDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_deployment(
        self,
        request: deps_models.GetDeploymentRequest,
    ) -> deps_models.GetDeploymentResponse:
        """
        Description: 查询一个已经创建成功的部署操作。
        Summary: 获取部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_deployment_ex(request, headers, runtime)

    async def get_deployment_async(
        self,
        request: deps_models.GetDeploymentRequest,
    ) -> deps_models.GetDeploymentResponse:
        """
        Description: 查询一个已经创建成功的部署操作。
        Summary: 获取部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_deployment_ex_async(request, headers, runtime)

    def get_deployment_ex(
        self,
        request: deps_models.GetDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetDeploymentResponse:
        """
        Description: 查询一个已经创建成功的部署操作。
        Summary: 获取部署
        """
        UtilClient.validate_model(request)
        return deps_models.GetDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_deployment_ex_async(
        self,
        request: deps_models.GetDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetDeploymentResponse:
        """
        Description: 查询一个已经创建成功的部署操作。
        Summary: 获取部署
        """
        UtilClient.validate_model(request)
        return deps_models.GetDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_deployment(
        self,
        request: deps_models.RetryDeploymentRequest,
    ) -> deps_models.RetryDeploymentResponse:
        """
        Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_deployment_ex(request, headers, runtime)

    async def retry_deployment_async(
        self,
        request: deps_models.RetryDeploymentRequest,
    ) -> deps_models.RetryDeploymentResponse:
        """
        Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_deployment_ex_async(request, headers, runtime)

    def retry_deployment_ex(
        self,
        request: deps_models.RetryDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryDeploymentResponse:
        """
        Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试部署
        """
        UtilClient.validate_model(request)
        return deps_models.RetryDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_deployment_ex_async(
        self,
        request: deps_models.RetryDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryDeploymentResponse:
        """
        Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试部署
        """
        UtilClient.validate_model(request)
        return deps_models.RetryDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_deployment(
        self,
        request: deps_models.StartDeploymentRequest,
    ) -> deps_models.StartDeploymentResponse:
        """
        Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_deployment_ex(request, headers, runtime)

    async def start_deployment_async(
        self,
        request: deps_models.StartDeploymentRequest,
    ) -> deps_models.StartDeploymentResponse:
        """
        Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_deployment_ex_async(request, headers, runtime)

    def start_deployment_ex(
        self,
        request: deps_models.StartDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartDeploymentResponse:
        """
        Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始部署
        """
        UtilClient.validate_model(request)
        return deps_models.StartDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_deployment_ex_async(
        self,
        request: deps_models.StartDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartDeploymentResponse:
        """
        Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始部署
        """
        UtilClient.validate_model(request)
        return deps_models.StartDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_deployment_application(
        self,
        request: deps_models.GetDeploymentApplicationRequest,
    ) -> deps_models.GetDeploymentApplicationResponse:
        """
        Description: 查询一个部署操作中某个应用（服务）的详情。
        Summary: 获取部署应用（服务）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_deployment_application_ex(request, headers, runtime)

    async def get_deployment_application_async(
        self,
        request: deps_models.GetDeploymentApplicationRequest,
    ) -> deps_models.GetDeploymentApplicationResponse:
        """
        Description: 查询一个部署操作中某个应用（服务）的详情。
        Summary: 获取部署应用（服务）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_deployment_application_ex_async(request, headers, runtime)

    def get_deployment_application_ex(
        self,
        request: deps_models.GetDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetDeploymentApplicationResponse:
        """
        Description: 查询一个部署操作中某个应用（服务）的详情。
        Summary: 获取部署应用（服务）
        """
        UtilClient.validate_model(request)
        return deps_models.GetDeploymentApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_deployment_application_ex_async(
        self,
        request: deps_models.GetDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetDeploymentApplicationResponse:
        """
        Description: 查询一个部署操作中某个应用（服务）的详情。
        Summary: 获取部署应用（服务）
        """
        UtilClient.validate_model(request)
        return deps_models.GetDeploymentApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_deployment_application(
        self,
        request: deps_models.RollbackDeploymentApplicationRequest,
    ) -> deps_models.RollbackDeploymentApplicationResponse:
        """
        Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
        Summary: 回滚部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_deployment_application_ex(request, headers, runtime)

    async def rollback_deployment_application_async(
        self,
        request: deps_models.RollbackDeploymentApplicationRequest,
    ) -> deps_models.RollbackDeploymentApplicationResponse:
        """
        Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
        Summary: 回滚部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_deployment_application_ex_async(request, headers, runtime)

    def rollback_deployment_application_ex(
        self,
        request: deps_models.RollbackDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackDeploymentApplicationResponse:
        """
        Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
        Summary: 回滚部署
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackDeploymentApplicationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.application.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_deployment_application_ex_async(
        self,
        request: deps_models.RollbackDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackDeploymentApplicationResponse:
        """
        Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
        Summary: 回滚部署
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackDeploymentApplicationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.application.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_deployment(
        self,
        request: deps_models.ReinitDeploymentRequest,
    ) -> deps_models.ReinitDeploymentResponse:
        """
        Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_deployment_ex(request, headers, runtime)

    async def reinit_deployment_async(
        self,
        request: deps_models.ReinitDeploymentRequest,
    ) -> deps_models.ReinitDeploymentResponse:
        """
        Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_deployment_ex_async(request, headers, runtime)

    def reinit_deployment_ex(
        self,
        request: deps_models.ReinitDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitDeploymentResponse:
        """
        Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化部署
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitDeploymentResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.deployment.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_deployment_ex_async(
        self,
        request: deps_models.ReinitDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitDeploymentResponse:
        """
        Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化部署
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitDeploymentResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.deployment.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cmdtemplate(
        self,
        request: deps_models.QueryCmdtemplateRequest,
    ) -> deps_models.QueryCmdtemplateResponse:
        """
        Description: 根据查询条件查询指令模板。
        Summary: 查询指令模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cmdtemplate_ex(request, headers, runtime)

    async def query_cmdtemplate_async(
        self,
        request: deps_models.QueryCmdtemplateRequest,
    ) -> deps_models.QueryCmdtemplateResponse:
        """
        Description: 根据查询条件查询指令模板。
        Summary: 查询指令模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cmdtemplate_ex_async(request, headers, runtime)

    def query_cmdtemplate_ex(
        self,
        request: deps_models.QueryCmdtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCmdtemplateResponse:
        """
        Description: 根据查询条件查询指令模板。
        Summary: 查询指令模板
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCmdtemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cmdtemplate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cmdtemplate_ex_async(
        self,
        request: deps_models.QueryCmdtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCmdtemplateResponse:
        """
        Description: 根据查询条件查询指令模板。
        Summary: 查询指令模板
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCmdtemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cmdtemplate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cmdtemplate(
        self,
        request: deps_models.GetCmdtemplateRequest,
    ) -> deps_models.GetCmdtemplateResponse:
        """
        Description: 获取指令模板详情。
        Summary: 获取指令模板详情。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cmdtemplate_ex(request, headers, runtime)

    async def get_cmdtemplate_async(
        self,
        request: deps_models.GetCmdtemplateRequest,
    ) -> deps_models.GetCmdtemplateResponse:
        """
        Description: 获取指令模板详情。
        Summary: 获取指令模板详情。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cmdtemplate_ex_async(request, headers, runtime)

    def get_cmdtemplate_ex(
        self,
        request: deps_models.GetCmdtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetCmdtemplateResponse:
        """
        Description: 获取指令模板详情。
        Summary: 获取指令模板详情。
        """
        UtilClient.validate_model(request)
        return deps_models.GetCmdtemplateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cmdtemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cmdtemplate_ex_async(
        self,
        request: deps_models.GetCmdtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetCmdtemplateResponse:
        """
        Description: 获取指令模板详情。
        Summary: 获取指令模板详情。
        """
        UtilClient.validate_model(request)
        return deps_models.GetCmdtemplateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cmdtemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def syncexecute_cmd_task(
        self,
        request: deps_models.SyncexecuteCmdTaskRequest,
    ) -> deps_models.SyncexecuteCmdTaskResponse:
        """
        Description: 同步执行指令。
        Summary: 同步执行指令。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.syncexecute_cmd_task_ex(request, headers, runtime)

    async def syncexecute_cmd_task_async(
        self,
        request: deps_models.SyncexecuteCmdTaskRequest,
    ) -> deps_models.SyncexecuteCmdTaskResponse:
        """
        Description: 同步执行指令。
        Summary: 同步执行指令。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.syncexecute_cmd_task_ex_async(request, headers, runtime)

    def syncexecute_cmd_task_ex(
        self,
        request: deps_models.SyncexecuteCmdTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SyncexecuteCmdTaskResponse:
        """
        Description: 同步执行指令。
        Summary: 同步执行指令。
        """
        UtilClient.validate_model(request)
        return deps_models.SyncexecuteCmdTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cmd.task.syncexecute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def syncexecute_cmd_task_ex_async(
        self,
        request: deps_models.SyncexecuteCmdTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SyncexecuteCmdTaskResponse:
        """
        Description: 同步执行指令。
        Summary: 同步执行指令。
        """
        UtilClient.validate_model(request)
        return deps_models.SyncexecuteCmdTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cmd.task.syncexecute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def asyncexecute_cmd_task(
        self,
        request: deps_models.AsyncexecuteCmdTaskRequest,
    ) -> deps_models.AsyncexecuteCmdTaskResponse:
        """
        Description: 异步执行指令。
        Summary: 异步执行指令。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.asyncexecute_cmd_task_ex(request, headers, runtime)

    async def asyncexecute_cmd_task_async(
        self,
        request: deps_models.AsyncexecuteCmdTaskRequest,
    ) -> deps_models.AsyncexecuteCmdTaskResponse:
        """
        Description: 异步执行指令。
        Summary: 异步执行指令。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.asyncexecute_cmd_task_ex_async(request, headers, runtime)

    def asyncexecute_cmd_task_ex(
        self,
        request: deps_models.AsyncexecuteCmdTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AsyncexecuteCmdTaskResponse:
        """
        Description: 异步执行指令。
        Summary: 异步执行指令。
        """
        UtilClient.validate_model(request)
        return deps_models.AsyncexecuteCmdTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cmd.task.asyncexecute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def asyncexecute_cmd_task_ex_async(
        self,
        request: deps_models.AsyncexecuteCmdTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AsyncexecuteCmdTaskResponse:
        """
        Description: 异步执行指令。
        Summary: 异步执行指令。
        """
        UtilClient.validate_model(request)
        return deps_models.AsyncexecuteCmdTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cmd.task.asyncexecute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cmd_task(
        self,
        request: deps_models.GetCmdTaskRequest,
    ) -> deps_models.GetCmdTaskResponse:
        """
        Description: 查询执行指令任务结果。
        Summary: 查询执行指令任务结果。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cmd_task_ex(request, headers, runtime)

    async def get_cmd_task_async(
        self,
        request: deps_models.GetCmdTaskRequest,
    ) -> deps_models.GetCmdTaskResponse:
        """
        Description: 查询执行指令任务结果。
        Summary: 查询执行指令任务结果。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cmd_task_ex_async(request, headers, runtime)

    def get_cmd_task_ex(
        self,
        request: deps_models.GetCmdTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetCmdTaskResponse:
        """
        Description: 查询执行指令任务结果。
        Summary: 查询执行指令任务结果。
        """
        UtilClient.validate_model(request)
        return deps_models.GetCmdTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cmd.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cmd_task_ex_async(
        self,
        request: deps_models.GetCmdTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetCmdTaskResponse:
        """
        Description: 查询执行指令任务结果。
        Summary: 查询执行指令任务结果。
        """
        UtilClient.validate_model(request)
        return deps_models.GetCmdTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cmd.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_appops(
        self,
        request: deps_models.CreateAppopsRequest,
    ) -> deps_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
        Summary: 创建一个应用（服务）运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appops_ex(request, headers, runtime)

    async def create_appops_async(
        self,
        request: deps_models.CreateAppopsRequest,
    ) -> deps_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
        Summary: 创建一个应用（服务）运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appops_ex_async(request, headers, runtime)

    def create_appops_ex(
        self,
        request: deps_models.CreateAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
        Summary: 创建一个应用（服务）运维单
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appops_ex_async(
        self,
        request: deps_models.CreateAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
        Summary: 创建一个应用（服务）运维单
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appops(
        self,
        request: deps_models.GetAppopsRequest,
    ) -> deps_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的运维操作。
        Summary: 获取运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appops_ex(request, headers, runtime)

    async def get_appops_async(
        self,
        request: deps_models.GetAppopsRequest,
    ) -> deps_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的运维操作。
        Summary: 获取运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appops_ex_async(request, headers, runtime)

    def get_appops_ex(
        self,
        request: deps_models.GetAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的运维操作。
        Summary: 获取运维单
        """
        UtilClient.validate_model(request)
        return deps_models.GetAppopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appops_ex_async(
        self,
        request: deps_models.GetAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的运维操作。
        Summary: 获取运维单
        """
        UtilClient.validate_model(request)
        return deps_models.GetAppopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_appops(
        self,
        request: deps_models.StartAppopsRequest,
    ) -> deps_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_appops_ex(request, headers, runtime)

    async def start_appops_async(
        self,
        request: deps_models.StartAppopsRequest,
    ) -> deps_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_appops_ex_async(request, headers, runtime)

    def start_appops_ex(
        self,
        request: deps_models.StartAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        UtilClient.validate_model(request)
        return deps_models.StartAppopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appops.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_appops_ex_async(
        self,
        request: deps_models.StartAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        UtilClient.validate_model(request)
        return deps_models.StartAppopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appops.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_appops(
        self,
        request: deps_models.ReinitAppopsRequest,
    ) -> deps_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_appops_ex(request, headers, runtime)

    async def reinit_appops_async(
        self,
        request: deps_models.ReinitAppopsRequest,
    ) -> deps_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_appops_ex_async(request, headers, runtime)

    def reinit_appops_ex(
        self,
        request: deps_models.ReinitAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitAppopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appops.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_appops_ex_async(
        self,
        request: deps_models.ReinitAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitAppopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appops.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_appops(
        self,
        request: deps_models.CancelAppopsRequest,
    ) -> deps_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_appops_ex(request, headers, runtime)

    async def cancel_appops_async(
        self,
        request: deps_models.CancelAppopsRequest,
    ) -> deps_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_appops_ex_async(request, headers, runtime)

    def cancel_appops_ex(
        self,
        request: deps_models.CancelAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelAppopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_appops_ex_async(
        self,
        request: deps_models.CancelAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelAppopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_appops(
        self,
        request: deps_models.RetryAppopsRequest,
    ) -> deps_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_appops_ex(request, headers, runtime)

    async def retry_appops_async(
        self,
        request: deps_models.RetryAppopsRequest,
    ) -> deps_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_appops_ex_async(request, headers, runtime)

    def retry_appops_ex(
        self,
        request: deps_models.RetryAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        UtilClient.validate_model(request)
        return deps_models.RetryAppopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_appops_ex_async(
        self,
        request: deps_models.RetryAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        UtilClient.validate_model(request)
        return deps_models.RetryAppopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_computerops(
        self,
        request: deps_models.CreateComputeropsRequest,
    ) -> deps_models.CreateComputeropsResponse:
        """
        Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
        Summary: 创建一个机器运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_computerops_ex(request, headers, runtime)

    async def create_computerops_async(
        self,
        request: deps_models.CreateComputeropsRequest,
    ) -> deps_models.CreateComputeropsResponse:
        """
        Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
        Summary: 创建一个机器运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_computerops_ex_async(request, headers, runtime)

    def create_computerops_ex(
        self,
        request: deps_models.CreateComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateComputeropsResponse:
        """
        Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
        Summary: 创建一个机器运维单
        """
        UtilClient.validate_model(request)
        return deps_models.CreateComputeropsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computerops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_computerops_ex_async(
        self,
        request: deps_models.CreateComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateComputeropsResponse:
        """
        Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
        Summary: 创建一个机器运维单
        """
        UtilClient.validate_model(request)
        return deps_models.CreateComputeropsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computerops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_computerops(
        self,
        request: deps_models.GetComputeropsRequest,
    ) -> deps_models.GetComputeropsResponse:
        """
        Description: 查询一个已经创建成功的机器运维操作。
        Summary: 获取运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_computerops_ex(request, headers, runtime)

    async def get_computerops_async(
        self,
        request: deps_models.GetComputeropsRequest,
    ) -> deps_models.GetComputeropsResponse:
        """
        Description: 查询一个已经创建成功的机器运维操作。
        Summary: 获取运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_computerops_ex_async(request, headers, runtime)

    def get_computerops_ex(
        self,
        request: deps_models.GetComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetComputeropsResponse:
        """
        Description: 查询一个已经创建成功的机器运维操作。
        Summary: 获取运维单
        """
        UtilClient.validate_model(request)
        return deps_models.GetComputeropsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computerops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_computerops_ex_async(
        self,
        request: deps_models.GetComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetComputeropsResponse:
        """
        Description: 查询一个已经创建成功的机器运维操作。
        Summary: 获取运维单
        """
        UtilClient.validate_model(request)
        return deps_models.GetComputeropsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computerops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_computerops(
        self,
        request: deps_models.StartComputeropsRequest,
    ) -> deps_models.StartComputeropsResponse:
        """
        Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_computerops_ex(request, headers, runtime)

    async def start_computerops_async(
        self,
        request: deps_models.StartComputeropsRequest,
    ) -> deps_models.StartComputeropsResponse:
        """
        Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_computerops_ex_async(request, headers, runtime)

    def start_computerops_ex(
        self,
        request: deps_models.StartComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartComputeropsResponse:
        """
        Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        UtilClient.validate_model(request)
        return deps_models.StartComputeropsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computerops.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_computerops_ex_async(
        self,
        request: deps_models.StartComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartComputeropsResponse:
        """
        Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始运维
        """
        UtilClient.validate_model(request)
        return deps_models.StartComputeropsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computerops.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_computerops(
        self,
        request: deps_models.ReinitComputeropsRequest,
    ) -> deps_models.ReinitComputeropsResponse:
        """
        Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_computerops_ex(request, headers, runtime)

    async def reinit_computerops_async(
        self,
        request: deps_models.ReinitComputeropsRequest,
    ) -> deps_models.ReinitComputeropsResponse:
        """
        Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_computerops_ex_async(request, headers, runtime)

    def reinit_computerops_ex(
        self,
        request: deps_models.ReinitComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitComputeropsResponse:
        """
        Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitComputeropsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computerops.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_computerops_ex_async(
        self,
        request: deps_models.ReinitComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitComputeropsResponse:
        """
        Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化运维
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitComputeropsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computerops.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_computerops(
        self,
        request: deps_models.CancelComputeropsRequest,
    ) -> deps_models.CancelComputeropsResponse:
        """
        Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_computerops_ex(request, headers, runtime)

    async def cancel_computerops_async(
        self,
        request: deps_models.CancelComputeropsRequest,
    ) -> deps_models.CancelComputeropsResponse:
        """
        Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_computerops_ex_async(request, headers, runtime)

    def cancel_computerops_ex(
        self,
        request: deps_models.CancelComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelComputeropsResponse:
        """
        Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelComputeropsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computerops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_computerops_ex_async(
        self,
        request: deps_models.CancelComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelComputeropsResponse:
        """
        Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelComputeropsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computerops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_computerops(
        self,
        request: deps_models.RetryComputeropsRequest,
    ) -> deps_models.RetryComputeropsResponse:
        """
        Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_computerops_ex(request, headers, runtime)

    async def retry_computerops_async(
        self,
        request: deps_models.RetryComputeropsRequest,
    ) -> deps_models.RetryComputeropsResponse:
        """
        Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_computerops_ex_async(request, headers, runtime)

    def retry_computerops_ex(
        self,
        request: deps_models.RetryComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryComputeropsResponse:
        """
        Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        UtilClient.validate_model(request)
        return deps_models.RetryComputeropsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computerops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_computerops_ex_async(
        self,
        request: deps_models.RetryComputeropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryComputeropsResponse:
        """
        Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
        Summary: 重试运维
        """
        UtilClient.validate_model(request)
        return deps_models.RetryComputeropsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computerops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_opsappsvc(
        self,
        request: deps_models.QueryOpsappsvcRequest,
    ) -> deps_models.QueryOpsappsvcResponse:
        """
        Description: 查询应用服务的运维历史。
        Summary: 查询应用服务的运维历史。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_opsappsvc_ex(request, headers, runtime)

    async def query_opsappsvc_async(
        self,
        request: deps_models.QueryOpsappsvcRequest,
    ) -> deps_models.QueryOpsappsvcResponse:
        """
        Description: 查询应用服务的运维历史。
        Summary: 查询应用服务的运维历史。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_opsappsvc_ex_async(request, headers, runtime)

    def query_opsappsvc_ex(
        self,
        request: deps_models.QueryOpsappsvcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOpsappsvcResponse:
        """
        Description: 查询应用服务的运维历史。
        Summary: 查询应用服务的运维历史。
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOpsappsvcResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.opsappsvc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_opsappsvc_ex_async(
        self,
        request: deps_models.QueryOpsappsvcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOpsappsvcResponse:
        """
        Description: 查询应用服务的运维历史。
        Summary: 查询应用服务的运维历史。
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOpsappsvcResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.opsappsvc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def asyncexecute_bashcmd(
        self,
        request: deps_models.AsyncexecuteBashcmdRequest,
    ) -> deps_models.AsyncexecuteBashcmdResponse:
        """
        Description: 异步执行Bash命令。
        Summary: 异步执行Bash命令。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.asyncexecute_bashcmd_ex(request, headers, runtime)

    async def asyncexecute_bashcmd_async(
        self,
        request: deps_models.AsyncexecuteBashcmdRequest,
    ) -> deps_models.AsyncexecuteBashcmdResponse:
        """
        Description: 异步执行Bash命令。
        Summary: 异步执行Bash命令。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.asyncexecute_bashcmd_ex_async(request, headers, runtime)

    def asyncexecute_bashcmd_ex(
        self,
        request: deps_models.AsyncexecuteBashcmdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AsyncexecuteBashcmdResponse:
        """
        Description: 异步执行Bash命令。
        Summary: 异步执行Bash命令。
        """
        UtilClient.validate_model(request)
        return deps_models.AsyncexecuteBashcmdResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bashcmd.asyncexecute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def asyncexecute_bashcmd_ex_async(
        self,
        request: deps_models.AsyncexecuteBashcmdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AsyncexecuteBashcmdResponse:
        """
        Description: 异步执行Bash命令。
        Summary: 异步执行Bash命令。
        """
        UtilClient.validate_model(request)
        return deps_models.AsyncexecuteBashcmdResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bashcmd.asyncexecute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_bashcmd_result(
        self,
        request: deps_models.GetBashcmdResultRequest,
    ) -> deps_models.GetBashcmdResultResponse:
        """
        Description: 根据异步执行bash命令的任务ID查询结果。
        Summary: 根据异步执行bash命令的任务ID查询结果。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_bashcmd_result_ex(request, headers, runtime)

    async def get_bashcmd_result_async(
        self,
        request: deps_models.GetBashcmdResultRequest,
    ) -> deps_models.GetBashcmdResultResponse:
        """
        Description: 根据异步执行bash命令的任务ID查询结果。
        Summary: 根据异步执行bash命令的任务ID查询结果。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_bashcmd_result_ex_async(request, headers, runtime)

    def get_bashcmd_result_ex(
        self,
        request: deps_models.GetBashcmdResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBashcmdResultResponse:
        """
        Description: 根据异步执行bash命令的任务ID查询结果。
        Summary: 根据异步执行bash命令的任务ID查询结果。
        """
        UtilClient.validate_model(request)
        return deps_models.GetBashcmdResultResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bashcmd.result.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_bashcmd_result_ex_async(
        self,
        request: deps_models.GetBashcmdResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBashcmdResultResponse:
        """
        Description: 根据异步执行bash命令的任务ID查询结果。
        Summary: 根据异步执行bash命令的任务ID查询结果。
        """
        UtilClient.validate_model(request)
        return deps_models.GetBashcmdResultResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bashcmd.result.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_bgrelease(
        self,
        request: deps_models.CheckCloudconfigBgreleaseRequest,
    ) -> deps_models.CheckCloudconfigBgreleaseResponse:
        """
        Description: 查询当前环境是否已开通蓝绿发布
        Summary: 查询当前环境是否已开通蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_bgrelease_ex(request, headers, runtime)

    async def check_cloudconfig_bgrelease_async(
        self,
        request: deps_models.CheckCloudconfigBgreleaseRequest,
    ) -> deps_models.CheckCloudconfigBgreleaseResponse:
        """
        Description: 查询当前环境是否已开通蓝绿发布
        Summary: 查询当前环境是否已开通蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_bgrelease_ex_async(request, headers, runtime)

    def check_cloudconfig_bgrelease_ex(
        self,
        request: deps_models.CheckCloudconfigBgreleaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigBgreleaseResponse:
        """
        Description: 查询当前环境是否已开通蓝绿发布
        Summary: 查询当前环境是否已开通蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigBgreleaseResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.bgrelease.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_bgrelease_ex_async(
        self,
        request: deps_models.CheckCloudconfigBgreleaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigBgreleaseResponse:
        """
        Description: 查询当前环境是否已开通蓝绿发布
        Summary: 查询当前环境是否已开通蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigBgreleaseResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.bgrelease.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_bgdeploymentcell(
        self,
        request: deps_models.CheckCloudconfigBgdeploymentcellRequest,
    ) -> deps_models.CheckCloudconfigBgdeploymentcellResponse:
        """
        Description: 查询是否已开通蓝绿发布部署单元
        Summary: 查询是否已开通蓝绿发布部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_bgdeploymentcell_ex(request, headers, runtime)

    async def check_cloudconfig_bgdeploymentcell_async(
        self,
        request: deps_models.CheckCloudconfigBgdeploymentcellRequest,
    ) -> deps_models.CheckCloudconfigBgdeploymentcellResponse:
        """
        Description: 查询是否已开通蓝绿发布部署单元
        Summary: 查询是否已开通蓝绿发布部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_bgdeploymentcell_ex_async(request, headers, runtime)

    def check_cloudconfig_bgdeploymentcell_ex(
        self,
        request: deps_models.CheckCloudconfigBgdeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigBgdeploymentcellResponse:
        """
        Description: 查询是否已开通蓝绿发布部署单元
        Summary: 查询是否已开通蓝绿发布部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigBgdeploymentcellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.bgdeploymentcell.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_bgdeploymentcell_ex_async(
        self,
        request: deps_models.CheckCloudconfigBgdeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigBgdeploymentcellResponse:
        """
        Description: 查询是否已开通蓝绿发布部署单元
        Summary: 查询是否已开通蓝绿发布部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigBgdeploymentcellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.bgdeploymentcell.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_appservice(
        self,
        request: deps_models.CheckCloudconfigAppserviceRequest,
    ) -> deps_models.CheckCloudconfigAppserviceResponse:
        """
        Description: 查询是否已开通应用服务
        Summary: 查询是否已开通应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_appservice_ex(request, headers, runtime)

    async def check_cloudconfig_appservice_async(
        self,
        request: deps_models.CheckCloudconfigAppserviceRequest,
    ) -> deps_models.CheckCloudconfigAppserviceResponse:
        """
        Description: 查询是否已开通应用服务
        Summary: 查询是否已开通应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_appservice_ex_async(request, headers, runtime)

    def check_cloudconfig_appservice_ex(
        self,
        request: deps_models.CheckCloudconfigAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigAppserviceResponse:
        """
        Description: 查询是否已开通应用服务
        Summary: 查询是否已开通应用服务
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigAppserviceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.appservice.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_appservice_ex_async(
        self,
        request: deps_models.CheckCloudconfigAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigAppserviceResponse:
        """
        Description: 查询是否已开通应用服务
        Summary: 查询是否已开通应用服务
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigAppserviceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.appservice.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_sharedmw(
        self,
        request: deps_models.CheckCloudconfigSharedmwRequest,
    ) -> deps_models.CheckCloudconfigSharedmwResponse:
        """
        Description: 查询是否已开通共享中间件
        Summary: 查询是否已开通共享中间件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_sharedmw_ex(request, headers, runtime)

    async def check_cloudconfig_sharedmw_async(
        self,
        request: deps_models.CheckCloudconfigSharedmwRequest,
    ) -> deps_models.CheckCloudconfigSharedmwResponse:
        """
        Description: 查询是否已开通共享中间件
        Summary: 查询是否已开通共享中间件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_sharedmw_ex_async(request, headers, runtime)

    def check_cloudconfig_sharedmw_ex(
        self,
        request: deps_models.CheckCloudconfigSharedmwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigSharedmwResponse:
        """
        Description: 查询是否已开通共享中间件
        Summary: 查询是否已开通共享中间件
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigSharedmwResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.sharedmw.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_sharedmw_ex_async(
        self,
        request: deps_models.CheckCloudconfigSharedmwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigSharedmwResponse:
        """
        Description: 查询是否已开通共享中间件
        Summary: 查询是否已开通共享中间件
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigSharedmwResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.sharedmw.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_vonerelease(
        self,
        request: deps_models.CheckCloudconfigVonereleaseRequest,
    ) -> deps_models.CheckCloudconfigVonereleaseResponse:
        """
        Description: 查询是否使用 v1 发布策略
        Summary: 查询是否使用 v1 发布策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_vonerelease_ex(request, headers, runtime)

    async def check_cloudconfig_vonerelease_async(
        self,
        request: deps_models.CheckCloudconfigVonereleaseRequest,
    ) -> deps_models.CheckCloudconfigVonereleaseResponse:
        """
        Description: 查询是否使用 v1 发布策略
        Summary: 查询是否使用 v1 发布策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_vonerelease_ex_async(request, headers, runtime)

    def check_cloudconfig_vonerelease_ex(
        self,
        request: deps_models.CheckCloudconfigVonereleaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigVonereleaseResponse:
        """
        Description: 查询是否使用 v1 发布策略
        Summary: 查询是否使用 v1 发布策略
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigVonereleaseResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.vonerelease.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_vonerelease_ex_async(
        self,
        request: deps_models.CheckCloudconfigVonereleaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigVonereleaseResponse:
        """
        Description: 查询是否使用 v1 发布策略
        Summary: 查询是否使用 v1 发布策略
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigVonereleaseResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.vonerelease.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_voneappops(
        self,
        request: deps_models.CheckCloudconfigVoneappopsRequest,
    ) -> deps_models.CheckCloudconfigVoneappopsResponse:
        """
        Description: 查询是否使用 v1 应用运维策略
        Summary: 查询是否使用 v1 应用运维策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_voneappops_ex(request, headers, runtime)

    async def check_cloudconfig_voneappops_async(
        self,
        request: deps_models.CheckCloudconfigVoneappopsRequest,
    ) -> deps_models.CheckCloudconfigVoneappopsResponse:
        """
        Description: 查询是否使用 v1 应用运维策略
        Summary: 查询是否使用 v1 应用运维策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_voneappops_ex_async(request, headers, runtime)

    def check_cloudconfig_voneappops_ex(
        self,
        request: deps_models.CheckCloudconfigVoneappopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigVoneappopsResponse:
        """
        Description: 查询是否使用 v1 应用运维策略
        Summary: 查询是否使用 v1 应用运维策略
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigVoneappopsResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.voneappops.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_voneappops_ex_async(
        self,
        request: deps_models.CheckCloudconfigVoneappopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigVoneappopsResponse:
        """
        Description: 查询是否使用 v1 应用运维策略
        Summary: 查询是否使用 v1 应用运维策略
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigVoneappopsResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.voneappops.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_oldui(
        self,
        request: deps_models.CheckCloudconfigOlduiRequest,
    ) -> deps_models.CheckCloudconfigOlduiResponse:
        """
        Description: 查询是否使用老版本界面
        Summary: 查询是否使用老版本界面
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_oldui_ex(request, headers, runtime)

    async def check_cloudconfig_oldui_async(
        self,
        request: deps_models.CheckCloudconfigOlduiRequest,
    ) -> deps_models.CheckCloudconfigOlduiResponse:
        """
        Description: 查询是否使用老版本界面
        Summary: 查询是否使用老版本界面
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_oldui_ex_async(request, headers, runtime)

    def check_cloudconfig_oldui_ex(
        self,
        request: deps_models.CheckCloudconfigOlduiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigOlduiResponse:
        """
        Description: 查询是否使用老版本界面
        Summary: 查询是否使用老版本界面
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigOlduiResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.oldui.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_oldui_ex_async(
        self,
        request: deps_models.CheckCloudconfigOlduiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigOlduiResponse:
        """
        Description: 查询是否使用老版本界面
        Summary: 查询是否使用老版本界面
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigOlduiResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.oldui.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cloudconfig_xdclbforbidden(
        self,
        request: deps_models.CheckCloudconfigXdclbforbiddenRequest,
    ) -> deps_models.CheckCloudconfigXdclbforbiddenResponse:
        """
        Description: 是否禁用 XDC LB
        Summary: 是否禁用 XDC LB
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cloudconfig_xdclbforbidden_ex(request, headers, runtime)

    async def check_cloudconfig_xdclbforbidden_async(
        self,
        request: deps_models.CheckCloudconfigXdclbforbiddenRequest,
    ) -> deps_models.CheckCloudconfigXdclbforbiddenResponse:
        """
        Description: 是否禁用 XDC LB
        Summary: 是否禁用 XDC LB
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cloudconfig_xdclbforbidden_ex_async(request, headers, runtime)

    def check_cloudconfig_xdclbforbidden_ex(
        self,
        request: deps_models.CheckCloudconfigXdclbforbiddenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigXdclbforbiddenResponse:
        """
        Description: 是否禁用 XDC LB
        Summary: 是否禁用 XDC LB
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigXdclbforbiddenResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.xdclbforbidden.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cloudconfig_xdclbforbidden_ex_async(
        self,
        request: deps_models.CheckCloudconfigXdclbforbiddenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckCloudconfigXdclbforbiddenResponse:
        """
        Description: 是否禁用 XDC LB
        Summary: 是否禁用 XDC LB
        """
        UtilClient.validate_model(request)
        return deps_models.CheckCloudconfigXdclbforbiddenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.xdclbforbidden.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cloudconfig_openapiconfig(
        self,
        request: deps_models.QueryCloudconfigOpenapiconfigRequest,
    ) -> deps_models.QueryCloudconfigOpenapiconfigResponse:
        """
        Description: 查询 openapi 配置信息
        Summary: 查询 openapi 配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cloudconfig_openapiconfig_ex(request, headers, runtime)

    async def query_cloudconfig_openapiconfig_async(
        self,
        request: deps_models.QueryCloudconfigOpenapiconfigRequest,
    ) -> deps_models.QueryCloudconfigOpenapiconfigResponse:
        """
        Description: 查询 openapi 配置信息
        Summary: 查询 openapi 配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cloudconfig_openapiconfig_ex_async(request, headers, runtime)

    def query_cloudconfig_openapiconfig_ex(
        self,
        request: deps_models.QueryCloudconfigOpenapiconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCloudconfigOpenapiconfigResponse:
        """
        Description: 查询 openapi 配置信息
        Summary: 查询 openapi 配置信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCloudconfigOpenapiconfigResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.cloudconfig.openapiconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cloudconfig_openapiconfig_ex_async(
        self,
        request: deps_models.QueryCloudconfigOpenapiconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryCloudconfigOpenapiconfigResponse:
        """
        Description: 查询 openapi 配置信息
        Summary: 查询 openapi 配置信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryCloudconfigOpenapiconfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.cloudconfig.openapiconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_apps_pkg(
        self,
        request: deps_models.CountAppsPkgRequest,
    ) -> deps_models.CountAppsPkgResponse:
        """
        Description: 查询应用包个数
        Summary: 查询应用包个数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_apps_pkg_ex(request, headers, runtime)

    async def count_apps_pkg_async(
        self,
        request: deps_models.CountAppsPkgRequest,
    ) -> deps_models.CountAppsPkgResponse:
        """
        Description: 查询应用包个数
        Summary: 查询应用包个数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_apps_pkg_ex_async(request, headers, runtime)

    def count_apps_pkg_ex(
        self,
        request: deps_models.CountAppsPkgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountAppsPkgResponse:
        """
        Description: 查询应用包个数
        Summary: 查询应用包个数
        """
        UtilClient.validate_model(request)
        return deps_models.CountAppsPkgResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.apps.pkg.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_apps_pkg_ex_async(
        self,
        request: deps_models.CountAppsPkgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountAppsPkgResponse:
        """
        Description: 查询应用包个数
        Summary: 查询应用包个数
        """
        UtilClient.validate_model(request)
        return deps_models.CountAppsPkgResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.apps.pkg.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_unitresources(
        self,
        request: deps_models.QueryAppUnitresourcesRequest,
    ) -> deps_models.QueryAppUnitresourcesResponse:
        """
        Description: 查询app下的资源统计
        Summary: 查询app下的资源统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_unitresources_ex(request, headers, runtime)

    async def query_app_unitresources_async(
        self,
        request: deps_models.QueryAppUnitresourcesRequest,
    ) -> deps_models.QueryAppUnitresourcesResponse:
        """
        Description: 查询app下的资源统计
        Summary: 查询app下的资源统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_unitresources_ex_async(request, headers, runtime)

    def query_app_unitresources_ex(
        self,
        request: deps_models.QueryAppUnitresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppUnitresourcesResponse:
        """
        Description: 查询app下的资源统计
        Summary: 查询app下的资源统计
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppUnitresourcesResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.app.unitresources.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_unitresources_ex_async(
        self,
        request: deps_models.QueryAppUnitresourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryAppUnitresourcesResponse:
        """
        Description: 查询app下的资源统计
        Summary: 查询app下的资源统计
        """
        UtilClient.validate_model(request)
        return deps_models.QueryAppUnitresourcesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.app.unitresources.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_oauth_token(
        self,
        request: deps_models.QueryOauthTokenRequest,
    ) -> deps_models.QueryOauthTokenResponse:
        """
        Description: 查询认证 token
        Summary: 查询认证 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_oauth_token_ex(request, headers, runtime)

    async def query_oauth_token_async(
        self,
        request: deps_models.QueryOauthTokenRequest,
    ) -> deps_models.QueryOauthTokenResponse:
        """
        Description: 查询认证 token
        Summary: 查询认证 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_oauth_token_ex_async(request, headers, runtime)

    def query_oauth_token_ex(
        self,
        request: deps_models.QueryOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOauthTokenResponse:
        """
        Description: 查询认证 token
        Summary: 查询认证 token
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOauthTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.oauth.token.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_oauth_token_ex_async(
        self,
        request: deps_models.QueryOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOauthTokenResponse:
        """
        Description: 查询认证 token
        Summary: 查询认证 token
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOauthTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.oauth.token.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_oauth_token(
        self,
        request: deps_models.UpdateOauthTokenRequest,
    ) -> deps_models.UpdateOauthTokenResponse:
        """
        Description: 创建或更新 token
        Summary: 创建或更新 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_oauth_token_ex(request, headers, runtime)

    async def update_oauth_token_async(
        self,
        request: deps_models.UpdateOauthTokenRequest,
    ) -> deps_models.UpdateOauthTokenResponse:
        """
        Description: 创建或更新 token
        Summary: 创建或更新 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_oauth_token_ex_async(request, headers, runtime)

    def update_oauth_token_ex(
        self,
        request: deps_models.UpdateOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateOauthTokenResponse:
        """
        Description: 创建或更新 token
        Summary: 创建或更新 token
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateOauthTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.oauth.token.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_oauth_token_ex_async(
        self,
        request: deps_models.UpdateOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateOauthTokenResponse:
        """
        Description: 创建或更新 token
        Summary: 创建或更新 token
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateOauthTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.oauth.token.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_oauth_token(
        self,
        request: deps_models.DeleteOauthTokenRequest,
    ) -> deps_models.DeleteOauthTokenResponse:
        """
        Description: 删除 token
        Summary: 删除 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_oauth_token_ex(request, headers, runtime)

    async def delete_oauth_token_async(
        self,
        request: deps_models.DeleteOauthTokenRequest,
    ) -> deps_models.DeleteOauthTokenResponse:
        """
        Description: 删除 token
        Summary: 删除 token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_oauth_token_ex_async(request, headers, runtime)

    def delete_oauth_token_ex(
        self,
        request: deps_models.DeleteOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteOauthTokenResponse:
        """
        Description: 删除 token
        Summary: 删除 token
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteOauthTokenResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.oauth.token.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_oauth_token_ex_async(
        self,
        request: deps_models.DeleteOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteOauthTokenResponse:
        """
        Description: 删除 token
        Summary: 删除 token
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteOauthTokenResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.oauth.token.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_baseinfo_deploymentzones(
        self,
        request: deps_models.QueryBaseinfoDeploymentzonesRequest,
    ) -> deps_models.QueryBaseinfoDeploymentzonesResponse:
        """
        Description: 查询 DZ
        Summary: 查询 DZ
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_baseinfo_deploymentzones_ex(request, headers, runtime)

    async def query_baseinfo_deploymentzones_async(
        self,
        request: deps_models.QueryBaseinfoDeploymentzonesRequest,
    ) -> deps_models.QueryBaseinfoDeploymentzonesResponse:
        """
        Description: 查询 DZ
        Summary: 查询 DZ
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_baseinfo_deploymentzones_ex_async(request, headers, runtime)

    def query_baseinfo_deploymentzones_ex(
        self,
        request: deps_models.QueryBaseinfoDeploymentzonesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBaseinfoDeploymentzonesResponse:
        """
        Description: 查询 DZ
        Summary: 查询 DZ
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBaseinfoDeploymentzonesResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.baseinfo.deploymentzones.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_baseinfo_deploymentzones_ex_async(
        self,
        request: deps_models.QueryBaseinfoDeploymentzonesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBaseinfoDeploymentzonesResponse:
        """
        Description: 查询 DZ
        Summary: 查询 DZ
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBaseinfoDeploymentzonesResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.baseinfo.deploymentzones.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_bgrelease_arrangement(
        self,
        request: deps_models.GetBgreleaseArrangementRequest,
    ) -> deps_models.GetBgreleaseArrangementResponse:
        """
        Description: 获取蓝绿发布概览
        Summary: 获取蓝绿发布概览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_bgrelease_arrangement_ex(request, headers, runtime)

    async def get_bgrelease_arrangement_async(
        self,
        request: deps_models.GetBgreleaseArrangementRequest,
    ) -> deps_models.GetBgreleaseArrangementResponse:
        """
        Description: 获取蓝绿发布概览
        Summary: 获取蓝绿发布概览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_bgrelease_arrangement_ex_async(request, headers, runtime)

    def get_bgrelease_arrangement_ex(
        self,
        request: deps_models.GetBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBgreleaseArrangementResponse:
        """
        Description: 获取蓝绿发布概览
        Summary: 获取蓝绿发布概览
        """
        UtilClient.validate_model(request)
        return deps_models.GetBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.GetBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetBgreleaseArrangementResponse:
        """
        Description: 获取蓝绿发布概览
        Summary: 获取蓝绿发布概览
        """
        UtilClient.validate_model(request)
        return deps_models.GetBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bgrelease_arrangement(
        self,
        request: deps_models.QueryBgreleaseArrangementRequest,
    ) -> deps_models.QueryBgreleaseArrangementResponse:
        """
        Description: 查询蓝绿发布概览
        Summary: 查询蓝绿发布概览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bgrelease_arrangement_ex(request, headers, runtime)

    async def query_bgrelease_arrangement_async(
        self,
        request: deps_models.QueryBgreleaseArrangementRequest,
    ) -> deps_models.QueryBgreleaseArrangementResponse:
        """
        Description: 查询蓝绿发布概览
        Summary: 查询蓝绿发布概览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bgrelease_arrangement_ex_async(request, headers, runtime)

    def query_bgrelease_arrangement_ex(
        self,
        request: deps_models.QueryBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseArrangementResponse:
        """
        Description: 查询蓝绿发布概览
        Summary: 查询蓝绿发布概览
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.QueryBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseArrangementResponse:
        """
        Description: 查询蓝绿发布概览
        Summary: 查询蓝绿发布概览
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bgrelease_arrangementprogress(
        self,
        request: deps_models.QueryBgreleaseArrangementprogressRequest,
    ) -> deps_models.QueryBgreleaseArrangementprogressResponse:
        """
        Description: 查询蓝绿发布进度
        Summary: 查询蓝绿发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bgrelease_arrangementprogress_ex(request, headers, runtime)

    async def query_bgrelease_arrangementprogress_async(
        self,
        request: deps_models.QueryBgreleaseArrangementprogressRequest,
    ) -> deps_models.QueryBgreleaseArrangementprogressResponse:
        """
        Description: 查询蓝绿发布进度
        Summary: 查询蓝绿发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bgrelease_arrangementprogress_ex_async(request, headers, runtime)

    def query_bgrelease_arrangementprogress_ex(
        self,
        request: deps_models.QueryBgreleaseArrangementprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseArrangementprogressResponse:
        """
        Description: 查询蓝绿发布进度
        Summary: 查询蓝绿发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseArrangementprogressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangementprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bgrelease_arrangementprogress_ex_async(
        self,
        request: deps_models.QueryBgreleaseArrangementprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseArrangementprogressResponse:
        """
        Description: 查询蓝绿发布进度
        Summary: 查询蓝绿发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseArrangementprogressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangementprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bgrelease_taskprogress(
        self,
        request: deps_models.QueryBgreleaseTaskprogressRequest,
    ) -> deps_models.QueryBgreleaseTaskprogressResponse:
        """
        Description: 查询蓝绿发布任务进度
        Summary: 查询蓝绿发布任务进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bgrelease_taskprogress_ex(request, headers, runtime)

    async def query_bgrelease_taskprogress_async(
        self,
        request: deps_models.QueryBgreleaseTaskprogressRequest,
    ) -> deps_models.QueryBgreleaseTaskprogressResponse:
        """
        Description: 查询蓝绿发布任务进度
        Summary: 查询蓝绿发布任务进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bgrelease_taskprogress_ex_async(request, headers, runtime)

    def query_bgrelease_taskprogress_ex(
        self,
        request: deps_models.QueryBgreleaseTaskprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseTaskprogressResponse:
        """
        Description: 查询蓝绿发布任务进度
        Summary: 查询蓝绿发布任务进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseTaskprogressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.taskprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bgrelease_taskprogress_ex_async(
        self,
        request: deps_models.QueryBgreleaseTaskprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseTaskprogressResponse:
        """
        Description: 查询蓝绿发布任务进度
        Summary: 查询蓝绿发布任务进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseTaskprogressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.taskprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_bgrelease_arrangement(
        self,
        request: deps_models.ExecBgreleaseArrangementRequest,
    ) -> deps_models.ExecBgreleaseArrangementResponse:
        """
        Description: 执行蓝绿发布
        Summary: 执行蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_bgrelease_arrangement_ex(request, headers, runtime)

    async def exec_bgrelease_arrangement_async(
        self,
        request: deps_models.ExecBgreleaseArrangementRequest,
    ) -> deps_models.ExecBgreleaseArrangementResponse:
        """
        Description: 执行蓝绿发布
        Summary: 执行蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_bgrelease_arrangement_ex_async(request, headers, runtime)

    def exec_bgrelease_arrangement_ex(
        self,
        request: deps_models.ExecBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecBgreleaseArrangementResponse:
        """
        Description: 执行蓝绿发布
        Summary: 执行蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.ExecBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.ExecBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecBgreleaseArrangementResponse:
        """
        Description: 执行蓝绿发布
        Summary: 执行蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.ExecBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_bgrelease_arrangement(
        self,
        request: deps_models.ConfirmBgreleaseArrangementRequest,
    ) -> deps_models.ConfirmBgreleaseArrangementResponse:
        """
        Description: 验证确认蓝绿发布
        Summary: 验证确认蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_bgrelease_arrangement_ex(request, headers, runtime)

    async def confirm_bgrelease_arrangement_async(
        self,
        request: deps_models.ConfirmBgreleaseArrangementRequest,
    ) -> deps_models.ConfirmBgreleaseArrangementResponse:
        """
        Description: 验证确认蓝绿发布
        Summary: 验证确认蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_bgrelease_arrangement_ex_async(request, headers, runtime)

    def confirm_bgrelease_arrangement_ex(
        self,
        request: deps_models.ConfirmBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmBgreleaseArrangementResponse:
        """
        Description: 验证确认蓝绿发布
        Summary: 验证确认蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.ConfirmBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmBgreleaseArrangementResponse:
        """
        Description: 验证确认蓝绿发布
        Summary: 验证确认蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_bgrelease_arrangementvalidation(
        self,
        request: deps_models.ConfirmBgreleaseArrangementvalidationRequest,
    ) -> deps_models.ConfirmBgreleaseArrangementvalidationResponse:
        """
        Description: 蓝绿验证确认
        Summary: 蓝绿验证确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_bgrelease_arrangementvalidation_ex(request, headers, runtime)

    async def confirm_bgrelease_arrangementvalidation_async(
        self,
        request: deps_models.ConfirmBgreleaseArrangementvalidationRequest,
    ) -> deps_models.ConfirmBgreleaseArrangementvalidationResponse:
        """
        Description: 蓝绿验证确认
        Summary: 蓝绿验证确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_bgrelease_arrangementvalidation_ex_async(request, headers, runtime)

    def confirm_bgrelease_arrangementvalidation_ex(
        self,
        request: deps_models.ConfirmBgreleaseArrangementvalidationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmBgreleaseArrangementvalidationResponse:
        """
        Description: 蓝绿验证确认
        Summary: 蓝绿验证确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmBgreleaseArrangementvalidationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangementvalidation.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_bgrelease_arrangementvalidation_ex_async(
        self,
        request: deps_models.ConfirmBgreleaseArrangementvalidationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmBgreleaseArrangementvalidationResponse:
        """
        Description: 蓝绿验证确认
        Summary: 蓝绿验证确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmBgreleaseArrangementvalidationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangementvalidation.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_bgrelease_arrangement(
        self,
        request: deps_models.RetryBgreleaseArrangementRequest,
    ) -> deps_models.RetryBgreleaseArrangementResponse:
        """
        Description: 重试蓝绿发布
        Summary: 重试蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_bgrelease_arrangement_ex(request, headers, runtime)

    async def retry_bgrelease_arrangement_async(
        self,
        request: deps_models.RetryBgreleaseArrangementRequest,
    ) -> deps_models.RetryBgreleaseArrangementResponse:
        """
        Description: 重试蓝绿发布
        Summary: 重试蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_bgrelease_arrangement_ex_async(request, headers, runtime)

    def retry_bgrelease_arrangement_ex(
        self,
        request: deps_models.RetryBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryBgreleaseArrangementResponse:
        """
        Description: 重试蓝绿发布
        Summary: 重试蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.RetryBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.RetryBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryBgreleaseArrangementResponse:
        """
        Description: 重试蓝绿发布
        Summary: 重试蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.RetryBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_bgrelease_task(
        self,
        request: deps_models.RetryBgreleaseTaskRequest,
    ) -> deps_models.RetryBgreleaseTaskResponse:
        """
        Description: 重试蓝绿发布任务
        Summary: 重试蓝绿发布任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_bgrelease_task_ex(request, headers, runtime)

    async def retry_bgrelease_task_async(
        self,
        request: deps_models.RetryBgreleaseTaskRequest,
    ) -> deps_models.RetryBgreleaseTaskResponse:
        """
        Description: 重试蓝绿发布任务
        Summary: 重试蓝绿发布任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_bgrelease_task_ex_async(request, headers, runtime)

    def retry_bgrelease_task_ex(
        self,
        request: deps_models.RetryBgreleaseTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryBgreleaseTaskResponse:
        """
        Description: 重试蓝绿发布任务
        Summary: 重试蓝绿发布任务
        """
        UtilClient.validate_model(request)
        return deps_models.RetryBgreleaseTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.task.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_bgrelease_task_ex_async(
        self,
        request: deps_models.RetryBgreleaseTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryBgreleaseTaskResponse:
        """
        Description: 重试蓝绿发布任务
        Summary: 重试蓝绿发布任务
        """
        UtilClient.validate_model(request)
        return deps_models.RetryBgreleaseTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.task.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_bgrelease_task(
        self,
        request: deps_models.SkipBgreleaseTaskRequest,
    ) -> deps_models.SkipBgreleaseTaskResponse:
        """
        Description: 跳过蓝绿发布任务
        Summary: 跳过蓝绿发布任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_bgrelease_task_ex(request, headers, runtime)

    async def skip_bgrelease_task_async(
        self,
        request: deps_models.SkipBgreleaseTaskRequest,
    ) -> deps_models.SkipBgreleaseTaskResponse:
        """
        Description: 跳过蓝绿发布任务
        Summary: 跳过蓝绿发布任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_bgrelease_task_ex_async(request, headers, runtime)

    def skip_bgrelease_task_ex(
        self,
        request: deps_models.SkipBgreleaseTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipBgreleaseTaskResponse:
        """
        Description: 跳过蓝绿发布任务
        Summary: 跳过蓝绿发布任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipBgreleaseTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.task.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_bgrelease_task_ex_async(
        self,
        request: deps_models.SkipBgreleaseTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipBgreleaseTaskResponse:
        """
        Description: 跳过蓝绿发布任务
        Summary: 跳过蓝绿发布任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipBgreleaseTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.task.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_bgrelease_arrangement(
        self,
        request: deps_models.SkipBgreleaseArrangementRequest,
    ) -> deps_models.SkipBgreleaseArrangementResponse:
        """
        Description: 跳过蓝绿发布
        Summary: 跳过蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_bgrelease_arrangement_ex(request, headers, runtime)

    async def skip_bgrelease_arrangement_async(
        self,
        request: deps_models.SkipBgreleaseArrangementRequest,
    ) -> deps_models.SkipBgreleaseArrangementResponse:
        """
        Description: 跳过蓝绿发布
        Summary: 跳过蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_bgrelease_arrangement_ex_async(request, headers, runtime)

    def skip_bgrelease_arrangement_ex(
        self,
        request: deps_models.SkipBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipBgreleaseArrangementResponse:
        """
        Description: 跳过蓝绿发布
        Summary: 跳过蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.SkipBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.SkipBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipBgreleaseArrangementResponse:
        """
        Description: 跳过蓝绿发布
        Summary: 跳过蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.SkipBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_bgrelease_arrangement(
        self,
        request: deps_models.CancelBgreleaseArrangementRequest,
    ) -> deps_models.CancelBgreleaseArrangementResponse:
        """
        Description: 取消蓝绿发布
        Summary: 取消蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_bgrelease_arrangement_ex(request, headers, runtime)

    async def cancel_bgrelease_arrangement_async(
        self,
        request: deps_models.CancelBgreleaseArrangementRequest,
    ) -> deps_models.CancelBgreleaseArrangementResponse:
        """
        Description: 取消蓝绿发布
        Summary: 取消蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_bgrelease_arrangement_ex_async(request, headers, runtime)

    def cancel_bgrelease_arrangement_ex(
        self,
        request: deps_models.CancelBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelBgreleaseArrangementResponse:
        """
        Description: 取消蓝绿发布
        Summary: 取消蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.CancelBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelBgreleaseArrangementResponse:
        """
        Description: 取消蓝绿发布
        Summary: 取消蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_bgrelease_arrangement(
        self,
        request: deps_models.RollbackBgreleaseArrangementRequest,
    ) -> deps_models.RollbackBgreleaseArrangementResponse:
        """
        Description: 回滚蓝绿发布
        Summary: 回滚蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_bgrelease_arrangement_ex(request, headers, runtime)

    async def rollback_bgrelease_arrangement_async(
        self,
        request: deps_models.RollbackBgreleaseArrangementRequest,
    ) -> deps_models.RollbackBgreleaseArrangementResponse:
        """
        Description: 回滚蓝绿发布
        Summary: 回滚蓝绿发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_bgrelease_arrangement_ex_async(request, headers, runtime)

    def rollback_bgrelease_arrangement_ex(
        self,
        request: deps_models.RollbackBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackBgreleaseArrangementResponse:
        """
        Description: 回滚蓝绿发布
        Summary: 回滚蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.RollbackBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackBgreleaseArrangementResponse:
        """
        Description: 回滚蓝绿发布
        Summary: 回滚蓝绿发布
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retryrollback_bgrelease_arrangement(
        self,
        request: deps_models.RetryrollbackBgreleaseArrangementRequest,
    ) -> deps_models.RetryrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚重试
        Summary: 蓝绿发布回滚重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retryrollback_bgrelease_arrangement_ex(request, headers, runtime)

    async def retryrollback_bgrelease_arrangement_async(
        self,
        request: deps_models.RetryrollbackBgreleaseArrangementRequest,
    ) -> deps_models.RetryrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚重试
        Summary: 蓝绿发布回滚重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retryrollback_bgrelease_arrangement_ex_async(request, headers, runtime)

    def retryrollback_bgrelease_arrangement_ex(
        self,
        request: deps_models.RetryrollbackBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚重试
        Summary: 蓝绿发布回滚重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryrollbackBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.retryrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retryrollback_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.RetryrollbackBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚重试
        Summary: 蓝绿发布回滚重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryrollbackBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.retryrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirmrollback_bgrelease_arrangement(
        self,
        request: deps_models.ConfirmrollbackBgreleaseArrangementRequest,
    ) -> deps_models.ConfirmrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚确认
        Summary: 蓝绿发布回滚确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirmrollback_bgrelease_arrangement_ex(request, headers, runtime)

    async def confirmrollback_bgrelease_arrangement_async(
        self,
        request: deps_models.ConfirmrollbackBgreleaseArrangementRequest,
    ) -> deps_models.ConfirmrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚确认
        Summary: 蓝绿发布回滚确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirmrollback_bgrelease_arrangement_ex_async(request, headers, runtime)

    def confirmrollback_bgrelease_arrangement_ex(
        self,
        request: deps_models.ConfirmrollbackBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚确认
        Summary: 蓝绿发布回滚确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmrollbackBgreleaseArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.arrangement.confirmrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirmrollback_bgrelease_arrangement_ex_async(
        self,
        request: deps_models.ConfirmrollbackBgreleaseArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmrollbackBgreleaseArrangementResponse:
        """
        Description: 蓝绿发布回滚确认
        Summary: 蓝绿发布回滚确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmrollbackBgreleaseArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.arrangement.confirmrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_bgrelease_graytraffic(
        self,
        request: deps_models.SwitchBgreleaseGraytrafficRequest,
    ) -> deps_models.SwitchBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量迁移
        Summary: 蓝绿发布灰度流量迁移
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_bgrelease_graytraffic_ex(request, headers, runtime)

    async def switch_bgrelease_graytraffic_async(
        self,
        request: deps_models.SwitchBgreleaseGraytrafficRequest,
    ) -> deps_models.SwitchBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量迁移
        Summary: 蓝绿发布灰度流量迁移
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_bgrelease_graytraffic_ex_async(request, headers, runtime)

    def switch_bgrelease_graytraffic_ex(
        self,
        request: deps_models.SwitchBgreleaseGraytrafficRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SwitchBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量迁移
        Summary: 蓝绿发布灰度流量迁移
        """
        UtilClient.validate_model(request)
        return deps_models.SwitchBgreleaseGraytrafficResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.graytraffic.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_bgrelease_graytraffic_ex_async(
        self,
        request: deps_models.SwitchBgreleaseGraytrafficRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SwitchBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量迁移
        Summary: 蓝绿发布灰度流量迁移
        """
        UtilClient.validate_model(request)
        return deps_models.SwitchBgreleaseGraytrafficResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.graytraffic.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_bgrelease_graytraffic(
        self,
        request: deps_models.RollbackBgreleaseGraytrafficRequest,
    ) -> deps_models.RollbackBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量回滚
        Summary: 蓝绿发布灰度流量回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_bgrelease_graytraffic_ex(request, headers, runtime)

    async def rollback_bgrelease_graytraffic_async(
        self,
        request: deps_models.RollbackBgreleaseGraytrafficRequest,
    ) -> deps_models.RollbackBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量回滚
        Summary: 蓝绿发布灰度流量回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_bgrelease_graytraffic_ex_async(request, headers, runtime)

    def rollback_bgrelease_graytraffic_ex(
        self,
        request: deps_models.RollbackBgreleaseGraytrafficRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量回滚
        Summary: 蓝绿发布灰度流量回滚
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackBgreleaseGraytrafficResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.graytraffic.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_bgrelease_graytraffic_ex_async(
        self,
        request: deps_models.RollbackBgreleaseGraytrafficRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackBgreleaseGraytrafficResponse:
        """
        Description: 蓝绿发布灰度流量回滚
        Summary: 蓝绿发布灰度流量回滚
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackBgreleaseGraytrafficResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.graytraffic.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bgrelease_grayprogress(
        self,
        request: deps_models.QueryBgreleaseGrayprogressRequest,
    ) -> deps_models.QueryBgreleaseGrayprogressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bgrelease_grayprogress_ex(request, headers, runtime)

    async def query_bgrelease_grayprogress_async(
        self,
        request: deps_models.QueryBgreleaseGrayprogressRequest,
    ) -> deps_models.QueryBgreleaseGrayprogressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bgrelease_grayprogress_ex_async(request, headers, runtime)

    def query_bgrelease_grayprogress_ex(
        self,
        request: deps_models.QueryBgreleaseGrayprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseGrayprogressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseGrayprogressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.bgrelease.grayprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bgrelease_grayprogress_ex_async(
        self,
        request: deps_models.QueryBgreleaseGrayprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryBgreleaseGrayprogressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryBgreleaseGrayprogressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.bgrelease.grayprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_gray_process(
        self,
        request: deps_models.GetGrayProcessRequest,
    ) -> deps_models.GetGrayProcessResponse:
        """
        Description: 获取灰度引流进度
        Summary: 获取灰度引流进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_gray_process_ex(request, headers, runtime)

    async def get_gray_process_async(
        self,
        request: deps_models.GetGrayProcessRequest,
    ) -> deps_models.GetGrayProcessResponse:
        """
        Description: 获取灰度引流进度
        Summary: 获取灰度引流进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_gray_process_ex_async(request, headers, runtime)

    def get_gray_process_ex(
        self,
        request: deps_models.GetGrayProcessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetGrayProcessResponse:
        """
        Description: 获取灰度引流进度
        Summary: 获取灰度引流进度
        """
        UtilClient.validate_model(request)
        return deps_models.GetGrayProcessResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.gray.process.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_gray_process_ex_async(
        self,
        request: deps_models.GetGrayProcessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetGrayProcessResponse:
        """
        Description: 获取灰度引流进度
        Summary: 获取灰度引流进度
        """
        UtilClient.validate_model(request)
        return deps_models.GetGrayProcessResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.gray.process.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gray_progress(
        self,
        request: deps_models.QueryGrayProgressRequest,
    ) -> deps_models.QueryGrayProgressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gray_progress_ex(request, headers, runtime)

    async def query_gray_progress_async(
        self,
        request: deps_models.QueryGrayProgressRequest,
    ) -> deps_models.QueryGrayProgressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gray_progress_ex_async(request, headers, runtime)

    def query_gray_progress_ex(
        self,
        request: deps_models.QueryGrayProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryGrayProgressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryGrayProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.gray.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gray_progress_ex_async(
        self,
        request: deps_models.QueryGrayProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryGrayProgressResponse:
        """
        Description: 查询灰度引流进度
        Summary: 查询灰度引流进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryGrayProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.gray.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_gray_process(
        self,
        request: deps_models.ReinitGrayProcessRequest,
    ) -> deps_models.ReinitGrayProcessResponse:
        """
        Description: 重新初始化灰度发布
        Summary: 重新初始化灰度发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_gray_process_ex(request, headers, runtime)

    async def reinit_gray_process_async(
        self,
        request: deps_models.ReinitGrayProcessRequest,
    ) -> deps_models.ReinitGrayProcessResponse:
        """
        Description: 重新初始化灰度发布
        Summary: 重新初始化灰度发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_gray_process_ex_async(request, headers, runtime)

    def reinit_gray_process_ex(
        self,
        request: deps_models.ReinitGrayProcessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitGrayProcessResponse:
        """
        Description: 重新初始化灰度发布
        Summary: 重新初始化灰度发布
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitGrayProcessResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.gray.process.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_gray_process_ex_async(
        self,
        request: deps_models.ReinitGrayProcessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitGrayProcessResponse:
        """
        Description: 重新初始化灰度发布
        Summary: 重新初始化灰度发布
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitGrayProcessResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.gray.process.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_gray_task(
        self,
        request: deps_models.RetryGrayTaskRequest,
    ) -> deps_models.RetryGrayTaskResponse:
        """
        Description: 重试灰度发布子任务
        Summary: 重试灰度发布子任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_gray_task_ex(request, headers, runtime)

    async def retry_gray_task_async(
        self,
        request: deps_models.RetryGrayTaskRequest,
    ) -> deps_models.RetryGrayTaskResponse:
        """
        Description: 重试灰度发布子任务
        Summary: 重试灰度发布子任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_gray_task_ex_async(request, headers, runtime)

    def retry_gray_task_ex(
        self,
        request: deps_models.RetryGrayTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryGrayTaskResponse:
        """
        Description: 重试灰度发布子任务
        Summary: 重试灰度发布子任务
        """
        UtilClient.validate_model(request)
        return deps_models.RetryGrayTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.gray.task.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_gray_task_ex_async(
        self,
        request: deps_models.RetryGrayTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryGrayTaskResponse:
        """
        Description: 重试灰度发布子任务
        Summary: 重试灰度发布子任务
        """
        UtilClient.validate_model(request)
        return deps_models.RetryGrayTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.gray.task.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_gray_task(
        self,
        request: deps_models.SkipGrayTaskRequest,
    ) -> deps_models.SkipGrayTaskResponse:
        """
        Description: 跳过灰度发布子任务
        Summary: 跳过灰度发布子任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_gray_task_ex(request, headers, runtime)

    async def skip_gray_task_async(
        self,
        request: deps_models.SkipGrayTaskRequest,
    ) -> deps_models.SkipGrayTaskResponse:
        """
        Description: 跳过灰度发布子任务
        Summary: 跳过灰度发布子任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_gray_task_ex_async(request, headers, runtime)

    def skip_gray_task_ex(
        self,
        request: deps_models.SkipGrayTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipGrayTaskResponse:
        """
        Description: 跳过灰度发布子任务
        Summary: 跳过灰度发布子任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipGrayTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.gray.task.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_gray_task_ex_async(
        self,
        request: deps_models.SkipGrayTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipGrayTaskResponse:
        """
        Description: 跳过灰度发布子任务
        Summary: 跳过灰度发布子任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipGrayTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.gray.task.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_machine(
        self,
        request: deps_models.QueryMachineRequest,
    ) -> deps_models.QueryMachineResponse:
        """
        Description: 查询发布机器信息
        Summary: 查询发布机器信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_machine_ex(request, headers, runtime)

    async def query_machine_async(
        self,
        request: deps_models.QueryMachineRequest,
    ) -> deps_models.QueryMachineResponse:
        """
        Description: 查询发布机器信息
        Summary: 查询发布机器信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_machine_ex_async(request, headers, runtime)

    def query_machine_ex(
        self,
        request: deps_models.QueryMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachineResponse:
        """
        Description: 查询发布机器信息
        Summary: 查询发布机器信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_machine_ex_async(
        self,
        request: deps_models.QueryMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachineResponse:
        """
        Description: 查询发布机器信息
        Summary: 查询发布机器信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_machine(
        self,
        request: deps_models.GetMachineRequest,
    ) -> deps_models.GetMachineResponse:
        """
        Description: 获取发布机器信息
        Summary: 获取发布机器信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_machine_ex(request, headers, runtime)

    async def get_machine_async(
        self,
        request: deps_models.GetMachineRequest,
    ) -> deps_models.GetMachineResponse:
        """
        Description: 获取发布机器信息
        Summary: 获取发布机器信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_machine_ex_async(request, headers, runtime)

    def get_machine_ex(
        self,
        request: deps_models.GetMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetMachineResponse:
        """
        Description: 获取发布机器信息
        Summary: 获取发布机器信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetMachineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_machine_ex_async(
        self,
        request: deps_models.GetMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetMachineResponse:
        """
        Description: 获取发布机器信息
        Summary: 获取发布机器信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetMachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_machine_progress(
        self,
        request: deps_models.QueryMachineProgressRequest,
    ) -> deps_models.QueryMachineProgressResponse:
        """
        Description: 查询机器发布进度
        Summary: 查询机器发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_machine_progress_ex(request, headers, runtime)

    async def query_machine_progress_async(
        self,
        request: deps_models.QueryMachineProgressRequest,
    ) -> deps_models.QueryMachineProgressResponse:
        """
        Description: 查询机器发布进度
        Summary: 查询机器发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_machine_progress_ex_async(request, headers, runtime)

    def query_machine_progress_ex(
        self,
        request: deps_models.QueryMachineProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachineProgressResponse:
        """
        Description: 查询机器发布进度
        Summary: 查询机器发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachineProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_machine_progress_ex_async(
        self,
        request: deps_models.QueryMachineProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachineProgressResponse:
        """
        Description: 查询机器发布进度
        Summary: 查询机器发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachineProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_machine(
        self,
        request: deps_models.RetryMachineRequest,
    ) -> deps_models.RetryMachineResponse:
        """
        Description: 重试发布机器
        Summary: 重试发布机器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_machine_ex(request, headers, runtime)

    async def retry_machine_async(
        self,
        request: deps_models.RetryMachineRequest,
    ) -> deps_models.RetryMachineResponse:
        """
        Description: 重试发布机器
        Summary: 重试发布机器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_machine_ex_async(request, headers, runtime)

    def retry_machine_ex(
        self,
        request: deps_models.RetryMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryMachineResponse:
        """
        Description: 重试发布机器
        Summary: 重试发布机器
        """
        UtilClient.validate_model(request)
        return deps_models.RetryMachineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_machine_ex_async(
        self,
        request: deps_models.RetryMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryMachineResponse:
        """
        Description: 重试发布机器
        Summary: 重试发布机器
        """
        UtilClient.validate_model(request)
        return deps_models.RetryMachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_machine(
        self,
        request: deps_models.SkipMachineRequest,
    ) -> deps_models.SkipMachineResponse:
        """
        Description: 忽略机器发布
        Summary: 忽略机器发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_machine_ex(request, headers, runtime)

    async def skip_machine_async(
        self,
        request: deps_models.SkipMachineRequest,
    ) -> deps_models.SkipMachineResponse:
        """
        Description: 忽略机器发布
        Summary: 忽略机器发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_machine_ex_async(request, headers, runtime)

    def skip_machine_ex(
        self,
        request: deps_models.SkipMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipMachineResponse:
        """
        Description: 忽略机器发布
        Summary: 忽略机器发布
        """
        UtilClient.validate_model(request)
        return deps_models.SkipMachineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_machine_ex_async(
        self,
        request: deps_models.SkipMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipMachineResponse:
        """
        Description: 忽略机器发布
        Summary: 忽略机器发布
        """
        UtilClient.validate_model(request)
        return deps_models.SkipMachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_machine(
        self,
        request: deps_models.CancelMachineRequest,
    ) -> deps_models.CancelMachineResponse:
        """
        Description: 取消机器发布
        Summary: 取消机器发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_machine_ex(request, headers, runtime)

    async def cancel_machine_async(
        self,
        request: deps_models.CancelMachineRequest,
    ) -> deps_models.CancelMachineResponse:
        """
        Description: 取消机器发布
        Summary: 取消机器发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_machine_ex_async(request, headers, runtime)

    def cancel_machine_ex(
        self,
        request: deps_models.CancelMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelMachineResponse:
        """
        Description: 取消机器发布
        Summary: 取消机器发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelMachineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_machine_ex_async(
        self,
        request: deps_models.CancelMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelMachineResponse:
        """
        Description: 取消机器发布
        Summary: 取消机器发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelMachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_machine(
        self,
        request: deps_models.ExecMachineRequest,
    ) -> deps_models.ExecMachineResponse:
        """
        Description: 触发执行机器发布
        Summary: 触发执行机器发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_machine_ex(request, headers, runtime)

    async def exec_machine_async(
        self,
        request: deps_models.ExecMachineRequest,
    ) -> deps_models.ExecMachineResponse:
        """
        Description: 触发执行机器发布
        Summary: 触发执行机器发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_machine_ex_async(request, headers, runtime)

    def exec_machine_ex(
        self,
        request: deps_models.ExecMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecMachineResponse:
        """
        Description: 触发执行机器发布
        Summary: 触发执行机器发布
        """
        UtilClient.validate_model(request)
        return deps_models.ExecMachineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machine.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_machine_ex_async(
        self,
        request: deps_models.ExecMachineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecMachineResponse:
        """
        Description: 触发执行机器发布
        Summary: 触发执行机器发布
        """
        UtilClient.validate_model(request)
        return deps_models.ExecMachineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machine.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_machinegroup_progress(
        self,
        request: deps_models.QueryMachinegroupProgressRequest,
    ) -> deps_models.QueryMachinegroupProgressResponse:
        """
        Description: 查询机器分组发布进度
        Summary: 查询机器分组发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_machinegroup_progress_ex(request, headers, runtime)

    async def query_machinegroup_progress_async(
        self,
        request: deps_models.QueryMachinegroupProgressRequest,
    ) -> deps_models.QueryMachinegroupProgressResponse:
        """
        Description: 查询机器分组发布进度
        Summary: 查询机器分组发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_machinegroup_progress_ex_async(request, headers, runtime)

    def query_machinegroup_progress_ex(
        self,
        request: deps_models.QueryMachinegroupProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachinegroupProgressResponse:
        """
        Description: 查询机器分组发布进度
        Summary: 查询机器分组发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachinegroupProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_machinegroup_progress_ex_async(
        self,
        request: deps_models.QueryMachinegroupProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachinegroupProgressResponse:
        """
        Description: 查询机器分组发布进度
        Summary: 查询机器分组发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachinegroupProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_machinegroup(
        self,
        request: deps_models.RetryMachinegroupRequest,
    ) -> deps_models.RetryMachinegroupResponse:
        """
        Description: 重试机器分组
        Summary: 重试机器分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_machinegroup_ex(request, headers, runtime)

    async def retry_machinegroup_async(
        self,
        request: deps_models.RetryMachinegroupRequest,
    ) -> deps_models.RetryMachinegroupResponse:
        """
        Description: 重试机器分组
        Summary: 重试机器分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_machinegroup_ex_async(request, headers, runtime)

    def retry_machinegroup_ex(
        self,
        request: deps_models.RetryMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryMachinegroupResponse:
        """
        Description: 重试机器分组
        Summary: 重试机器分组
        """
        UtilClient.validate_model(request)
        return deps_models.RetryMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_machinegroup_ex_async(
        self,
        request: deps_models.RetryMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryMachinegroupResponse:
        """
        Description: 重试机器分组
        Summary: 重试机器分组
        """
        UtilClient.validate_model(request)
        return deps_models.RetryMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_machinegroup(
        self,
        request: deps_models.SkipMachinegroupRequest,
    ) -> deps_models.SkipMachinegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_machinegroup_ex(request, headers, runtime)

    async def skip_machinegroup_async(
        self,
        request: deps_models.SkipMachinegroupRequest,
    ) -> deps_models.SkipMachinegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_machinegroup_ex_async(request, headers, runtime)

    def skip_machinegroup_ex(
        self,
        request: deps_models.SkipMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipMachinegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        UtilClient.validate_model(request)
        return deps_models.SkipMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_machinegroup_ex_async(
        self,
        request: deps_models.SkipMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipMachinegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        UtilClient.validate_model(request)
        return deps_models.SkipMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_machinegroup(
        self,
        request: deps_models.CancelMachinegroupRequest,
    ) -> deps_models.CancelMachinegroupResponse:
        """
        Description: 分组取消
        Summary: 分组取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_machinegroup_ex(request, headers, runtime)

    async def cancel_machinegroup_async(
        self,
        request: deps_models.CancelMachinegroupRequest,
    ) -> deps_models.CancelMachinegroupResponse:
        """
        Description: 分组取消
        Summary: 分组取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_machinegroup_ex_async(request, headers, runtime)

    def cancel_machinegroup_ex(
        self,
        request: deps_models.CancelMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelMachinegroupResponse:
        """
        Description: 分组取消
        Summary: 分组取消
        """
        UtilClient.validate_model(request)
        return deps_models.CancelMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_machinegroup_ex_async(
        self,
        request: deps_models.CancelMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelMachinegroupResponse:
        """
        Description: 分组取消
        Summary: 分组取消
        """
        UtilClient.validate_model(request)
        return deps_models.CancelMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_machinegroup(
        self,
        request: deps_models.DeleteMachinegroupRequest,
    ) -> deps_models.DeleteMachinegroupResponse:
        """
        Description: 分组删除
        Summary: 分组删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_machinegroup_ex(request, headers, runtime)

    async def delete_machinegroup_async(
        self,
        request: deps_models.DeleteMachinegroupRequest,
    ) -> deps_models.DeleteMachinegroupResponse:
        """
        Description: 分组删除
        Summary: 分组删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_machinegroup_ex_async(request, headers, runtime)

    def delete_machinegroup_ex(
        self,
        request: deps_models.DeleteMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteMachinegroupResponse:
        """
        Description: 分组删除
        Summary: 分组删除
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_machinegroup_ex_async(
        self,
        request: deps_models.DeleteMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteMachinegroupResponse:
        """
        Description: 分组删除
        Summary: 分组删除
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_machinegroup(
        self,
        request: deps_models.UpdateMachinegroupRequest,
    ) -> deps_models.UpdateMachinegroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_machinegroup_ex(request, headers, runtime)

    async def update_machinegroup_async(
        self,
        request: deps_models.UpdateMachinegroupRequest,
    ) -> deps_models.UpdateMachinegroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_machinegroup_ex_async(request, headers, runtime)

    def update_machinegroup_ex(
        self,
        request: deps_models.UpdateMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMachinegroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_machinegroup_ex_async(
        self,
        request: deps_models.UpdateMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMachinegroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_machinegroup(
        self,
        request: deps_models.ConfirmMachinegroupRequest,
    ) -> deps_models.ConfirmMachinegroupResponse:
        """
        Description: 机器分组确认
        Summary: 机器分组确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_machinegroup_ex(request, headers, runtime)

    async def confirm_machinegroup_async(
        self,
        request: deps_models.ConfirmMachinegroupRequest,
    ) -> deps_models.ConfirmMachinegroupResponse:
        """
        Description: 机器分组确认
        Summary: 机器分组确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_machinegroup_ex_async(request, headers, runtime)

    def confirm_machinegroup_ex(
        self,
        request: deps_models.ConfirmMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmMachinegroupResponse:
        """
        Description: 机器分组确认
        Summary: 机器分组确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_machinegroup_ex_async(
        self,
        request: deps_models.ConfirmMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmMachinegroupResponse:
        """
        Description: 机器分组确认
        Summary: 机器分组确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_machinegroup_progress(
        self,
        request: deps_models.BatchqueryMachinegroupProgressRequest,
    ) -> deps_models.BatchqueryMachinegroupProgressResponse:
        """
        Description: 机器分组进度批量查询
        Summary: 机器分组进度批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_machinegroup_progress_ex(request, headers, runtime)

    async def batchquery_machinegroup_progress_async(
        self,
        request: deps_models.BatchqueryMachinegroupProgressRequest,
    ) -> deps_models.BatchqueryMachinegroupProgressResponse:
        """
        Description: 机器分组进度批量查询
        Summary: 机器分组进度批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_machinegroup_progress_ex_async(request, headers, runtime)

    def batchquery_machinegroup_progress_ex(
        self,
        request: deps_models.BatchqueryMachinegroupProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchqueryMachinegroupProgressResponse:
        """
        Description: 机器分组进度批量查询
        Summary: 机器分组进度批量查询
        """
        UtilClient.validate_model(request)
        return deps_models.BatchqueryMachinegroupProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.progress.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_machinegroup_progress_ex_async(
        self,
        request: deps_models.BatchqueryMachinegroupProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchqueryMachinegroupProgressResponse:
        """
        Description: 机器分组进度批量查询
        Summary: 机器分组进度批量查询
        """
        UtilClient.validate_model(request)
        return deps_models.BatchqueryMachinegroupProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.progress.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_machinegroup_reserve(
        self,
        request: deps_models.ConfirmMachinegroupReserveRequest,
    ) -> deps_models.ConfirmMachinegroupReserveResponse:
        """
        Description: 分区预确认
        Summary: 分区预确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_machinegroup_reserve_ex(request, headers, runtime)

    async def confirm_machinegroup_reserve_async(
        self,
        request: deps_models.ConfirmMachinegroupReserveRequest,
    ) -> deps_models.ConfirmMachinegroupReserveResponse:
        """
        Description: 分区预确认
        Summary: 分区预确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_machinegroup_reserve_ex_async(request, headers, runtime)

    def confirm_machinegroup_reserve_ex(
        self,
        request: deps_models.ConfirmMachinegroupReserveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmMachinegroupReserveResponse:
        """
        Description: 分区预确认
        Summary: 分区预确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmMachinegroupReserveResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.reserve.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_machinegroup_reserve_ex_async(
        self,
        request: deps_models.ConfirmMachinegroupReserveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmMachinegroupReserveResponse:
        """
        Description: 分区预确认
        Summary: 分区预确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmMachinegroupReserveResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.reserve.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_machinegroup_slbmountweight(
        self,
        request: deps_models.UpdateMachinegroupSlbmountweightRequest,
    ) -> deps_models.UpdateMachinegroupSlbmountweightResponse:
        """
        Description: 修改分组 SLB 权重
        Summary: 修改分组 SLB 权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_machinegroup_slbmountweight_ex(request, headers, runtime)

    async def update_machinegroup_slbmountweight_async(
        self,
        request: deps_models.UpdateMachinegroupSlbmountweightRequest,
    ) -> deps_models.UpdateMachinegroupSlbmountweightResponse:
        """
        Description: 修改分组 SLB 权重
        Summary: 修改分组 SLB 权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_machinegroup_slbmountweight_ex_async(request, headers, runtime)

    def update_machinegroup_slbmountweight_ex(
        self,
        request: deps_models.UpdateMachinegroupSlbmountweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMachinegroupSlbmountweightResponse:
        """
        Description: 修改分组 SLB 权重
        Summary: 修改分组 SLB 权重
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMachinegroupSlbmountweightResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.slbmountweight.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_machinegroup_slbmountweight_ex_async(
        self,
        request: deps_models.UpdateMachinegroupSlbmountweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMachinegroupSlbmountweightResponse:
        """
        Description: 修改分组 SLB 权重
        Summary: 修改分组 SLB 权重
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMachinegroupSlbmountweightResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.slbmountweight.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_machinegroup_slbmountprogress(
        self,
        request: deps_models.QueryMachinegroupSlbmountprogressRequest,
    ) -> deps_models.QueryMachinegroupSlbmountprogressResponse:
        """
        Description: 查询分组 SLB 挂载进度
        Summary: 查询分组 SLB 挂载进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_machinegroup_slbmountprogress_ex(request, headers, runtime)

    async def query_machinegroup_slbmountprogress_async(
        self,
        request: deps_models.QueryMachinegroupSlbmountprogressRequest,
    ) -> deps_models.QueryMachinegroupSlbmountprogressResponse:
        """
        Description: 查询分组 SLB 挂载进度
        Summary: 查询分组 SLB 挂载进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_machinegroup_slbmountprogress_ex_async(request, headers, runtime)

    def query_machinegroup_slbmountprogress_ex(
        self,
        request: deps_models.QueryMachinegroupSlbmountprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachinegroupSlbmountprogressResponse:
        """
        Description: 查询分组 SLB 挂载进度
        Summary: 查询分组 SLB 挂载进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachinegroupSlbmountprogressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.slbmountprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_machinegroup_slbmountprogress_ex_async(
        self,
        request: deps_models.QueryMachinegroupSlbmountprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachinegroupSlbmountprogressResponse:
        """
        Description: 查询分组 SLB 挂载进度
        Summary: 查询分组 SLB 挂载进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachinegroupSlbmountprogressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.slbmountprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_machinegroup_slbmount(
        self,
        request: deps_models.QueryMachinegroupSlbmountRequest,
    ) -> deps_models.QueryMachinegroupSlbmountResponse:
        """
        Description: 查询 slb 挂载状态
        Summary: 查询 slb 挂载状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_machinegroup_slbmount_ex(request, headers, runtime)

    async def query_machinegroup_slbmount_async(
        self,
        request: deps_models.QueryMachinegroupSlbmountRequest,
    ) -> deps_models.QueryMachinegroupSlbmountResponse:
        """
        Description: 查询 slb 挂载状态
        Summary: 查询 slb 挂载状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_machinegroup_slbmount_ex_async(request, headers, runtime)

    def query_machinegroup_slbmount_ex(
        self,
        request: deps_models.QueryMachinegroupSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachinegroupSlbmountResponse:
        """
        Description: 查询 slb 挂载状态
        Summary: 查询 slb 挂载状态
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachinegroupSlbmountResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.slbmount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_machinegroup_slbmount_ex_async(
        self,
        request: deps_models.QueryMachinegroupSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMachinegroupSlbmountResponse:
        """
        Description: 查询 slb 挂载状态
        Summary: 查询 slb 挂载状态
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMachinegroupSlbmountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.slbmount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_machinegroup(
        self,
        request: deps_models.GetMachinegroupRequest,
    ) -> deps_models.GetMachinegroupResponse:
        """
        Description: 获取分组信息
        Summary: 获取分组信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_machinegroup_ex(request, headers, runtime)

    async def get_machinegroup_async(
        self,
        request: deps_models.GetMachinegroupRequest,
    ) -> deps_models.GetMachinegroupResponse:
        """
        Description: 获取分组信息
        Summary: 获取分组信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_machinegroup_ex_async(request, headers, runtime)

    def get_machinegroup_ex(
        self,
        request: deps_models.GetMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetMachinegroupResponse:
        """
        Description: 获取分组信息
        Summary: 获取分组信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_machinegroup_ex_async(
        self,
        request: deps_models.GetMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetMachinegroupResponse:
        """
        Description: 获取分组信息
        Summary: 获取分组信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinegroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_machinetask(
        self,
        request: deps_models.SkipMachinetaskRequest,
    ) -> deps_models.SkipMachinetaskResponse:
        """
        Description: 忽略分组任务
        Summary: 忽略分组任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_machinetask_ex(request, headers, runtime)

    async def skip_machinetask_async(
        self,
        request: deps_models.SkipMachinetaskRequest,
    ) -> deps_models.SkipMachinetaskResponse:
        """
        Description: 忽略分组任务
        Summary: 忽略分组任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_machinetask_ex_async(request, headers, runtime)

    def skip_machinetask_ex(
        self,
        request: deps_models.SkipMachinetaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipMachinetaskResponse:
        """
        Description: 忽略分组任务
        Summary: 忽略分组任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipMachinetaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinetask.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_machinetask_ex_async(
        self,
        request: deps_models.SkipMachinetaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipMachinetaskResponse:
        """
        Description: 忽略分组任务
        Summary: 忽略分组任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipMachinetaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinetask.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_machinetask(
        self,
        request: deps_models.RetryMachinetaskRequest,
    ) -> deps_models.RetryMachinetaskResponse:
        """
        Description: 机器任务重试
        Summary: 机器任务重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_machinetask_ex(request, headers, runtime)

    async def retry_machinetask_async(
        self,
        request: deps_models.RetryMachinetaskRequest,
    ) -> deps_models.RetryMachinetaskResponse:
        """
        Description: 机器任务重试
        Summary: 机器任务重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_machinetask_ex_async(request, headers, runtime)

    def retry_machinetask_ex(
        self,
        request: deps_models.RetryMachinetaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryMachinetaskResponse:
        """
        Description: 机器任务重试
        Summary: 机器任务重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryMachinetaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.machinetask.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_machinetask_ex_async(
        self,
        request: deps_models.RetryMachinetaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryMachinetaskResponse:
        """
        Description: 机器任务重试
        Summary: 机器任务重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryMachinetaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.machinetask.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meta_cell(
        self,
        request: deps_models.QueryMetaCellRequest,
    ) -> deps_models.QueryMetaCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meta_cell_ex(request, headers, runtime)

    async def query_meta_cell_async(
        self,
        request: deps_models.QueryMetaCellRequest,
    ) -> deps_models.QueryMetaCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meta_cell_ex_async(request, headers, runtime)

    def query_meta_cell_ex(
        self,
        request: deps_models.QueryMetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMetaCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meta_cell_ex_async(
        self,
        request: deps_models.QueryMetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMetaCellResponse:
        """
        Description: 查询部署单元
        Summary: 查询部署单元
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_meta_deploymentcell(
        self,
        request: deps_models.CreateMetaDeploymentcellRequest,
    ) -> deps_models.CreateMetaDeploymentcellResponse:
        """
        Description: 创建 deployment cell
        Summary: 创建 deployment cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_meta_deploymentcell_ex(request, headers, runtime)

    async def create_meta_deploymentcell_async(
        self,
        request: deps_models.CreateMetaDeploymentcellRequest,
    ) -> deps_models.CreateMetaDeploymentcellResponse:
        """
        Description: 创建 deployment cell
        Summary: 创建 deployment cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_meta_deploymentcell_ex_async(request, headers, runtime)

    def create_meta_deploymentcell_ex(
        self,
        request: deps_models.CreateMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateMetaDeploymentcellResponse:
        """
        Description: 创建 deployment cell
        Summary: 创建 deployment cell
        """
        UtilClient.validate_model(request)
        return deps_models.CreateMetaDeploymentcellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.deploymentcell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_meta_deploymentcell_ex_async(
        self,
        request: deps_models.CreateMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateMetaDeploymentcellResponse:
        """
        Description: 创建 deployment cell
        Summary: 创建 deployment cell
        """
        UtilClient.validate_model(request)
        return deps_models.CreateMetaDeploymentcellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.deploymentcell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_meta_deploymentcell(
        self,
        request: deps_models.UpdateMetaDeploymentcellRequest,
    ) -> deps_models.UpdateMetaDeploymentcellResponse:
        """
        Description: 更新 deployment zone
        Summary: 更新 deployment zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_meta_deploymentcell_ex(request, headers, runtime)

    async def update_meta_deploymentcell_async(
        self,
        request: deps_models.UpdateMetaDeploymentcellRequest,
    ) -> deps_models.UpdateMetaDeploymentcellResponse:
        """
        Description: 更新 deployment zone
        Summary: 更新 deployment zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_meta_deploymentcell_ex_async(request, headers, runtime)

    def update_meta_deploymentcell_ex(
        self,
        request: deps_models.UpdateMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMetaDeploymentcellResponse:
        """
        Description: 更新 deployment zone
        Summary: 更新 deployment zone
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMetaDeploymentcellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.deploymentcell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_meta_deploymentcell_ex_async(
        self,
        request: deps_models.UpdateMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMetaDeploymentcellResponse:
        """
        Description: 更新 deployment zone
        Summary: 更新 deployment zone
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMetaDeploymentcellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.deploymentcell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_meta_deploymentcell(
        self,
        request: deps_models.GetMetaDeploymentcellRequest,
    ) -> deps_models.GetMetaDeploymentcellResponse:
        """
        Description: 获取 deployment cell
        Summary: 获取 deployment cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_meta_deploymentcell_ex(request, headers, runtime)

    async def get_meta_deploymentcell_async(
        self,
        request: deps_models.GetMetaDeploymentcellRequest,
    ) -> deps_models.GetMetaDeploymentcellResponse:
        """
        Description: 获取 deployment cell
        Summary: 获取 deployment cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_meta_deploymentcell_ex_async(request, headers, runtime)

    def get_meta_deploymentcell_ex(
        self,
        request: deps_models.GetMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetMetaDeploymentcellResponse:
        """
        Description: 获取 deployment cell
        Summary: 获取 deployment cell
        """
        UtilClient.validate_model(request)
        return deps_models.GetMetaDeploymentcellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.deploymentcell.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_meta_deploymentcell_ex_async(
        self,
        request: deps_models.GetMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetMetaDeploymentcellResponse:
        """
        Description: 获取 deployment cell
        Summary: 获取 deployment cell
        """
        UtilClient.validate_model(request)
        return deps_models.GetMetaDeploymentcellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.deploymentcell.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meta_deploymentcell(
        self,
        request: deps_models.QueryMetaDeploymentcellRequest,
    ) -> deps_models.QueryMetaDeploymentcellResponse:
        """
        Description: 批量获取 deployment cell
        Summary: 批量获取 deployment cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meta_deploymentcell_ex(request, headers, runtime)

    async def query_meta_deploymentcell_async(
        self,
        request: deps_models.QueryMetaDeploymentcellRequest,
    ) -> deps_models.QueryMetaDeploymentcellResponse:
        """
        Description: 批量获取 deployment cell
        Summary: 批量获取 deployment cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meta_deploymentcell_ex_async(request, headers, runtime)

    def query_meta_deploymentcell_ex(
        self,
        request: deps_models.QueryMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMetaDeploymentcellResponse:
        """
        Description: 批量获取 deployment cell
        Summary: 批量获取 deployment cell
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMetaDeploymentcellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.deploymentcell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meta_deploymentcell_ex_async(
        self,
        request: deps_models.QueryMetaDeploymentcellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryMetaDeploymentcellResponse:
        """
        Description: 批量获取 deployment cell
        Summary: 批量获取 deployment cell
        """
        UtilClient.validate_model(request)
        return deps_models.QueryMetaDeploymentcellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.deploymentcell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_notification_config(
        self,
        request: deps_models.CreateNotificationConfigRequest,
    ) -> deps_models.CreateNotificationConfigResponse:
        """
        Description: 创建通知配置
        Summary: 创建通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_notification_config_ex(request, headers, runtime)

    async def create_notification_config_async(
        self,
        request: deps_models.CreateNotificationConfigRequest,
    ) -> deps_models.CreateNotificationConfigResponse:
        """
        Description: 创建通知配置
        Summary: 创建通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_notification_config_ex_async(request, headers, runtime)

    def create_notification_config_ex(
        self,
        request: deps_models.CreateNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateNotificationConfigResponse:
        """
        Description: 创建通知配置
        Summary: 创建通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.CreateNotificationConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.notification.config.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_notification_config_ex_async(
        self,
        request: deps_models.CreateNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateNotificationConfigResponse:
        """
        Description: 创建通知配置
        Summary: 创建通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.CreateNotificationConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.notification.config.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_notification_config(
        self,
        request: deps_models.UpdateNotificationConfigRequest,
    ) -> deps_models.UpdateNotificationConfigResponse:
        """
        Description: 更新通知配置
        Summary: 更新通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_notification_config_ex(request, headers, runtime)

    async def update_notification_config_async(
        self,
        request: deps_models.UpdateNotificationConfigRequest,
    ) -> deps_models.UpdateNotificationConfigResponse:
        """
        Description: 更新通知配置
        Summary: 更新通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_notification_config_ex_async(request, headers, runtime)

    def update_notification_config_ex(
        self,
        request: deps_models.UpdateNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateNotificationConfigResponse:
        """
        Description: 更新通知配置
        Summary: 更新通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateNotificationConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.notification.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_notification_config_ex_async(
        self,
        request: deps_models.UpdateNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateNotificationConfigResponse:
        """
        Description: 更新通知配置
        Summary: 更新通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateNotificationConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.notification.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_notification_config(
        self,
        request: deps_models.QueryNotificationConfigRequest,
    ) -> deps_models.QueryNotificationConfigResponse:
        """
        Description: 查询通知配置
        Summary: 查询通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_notification_config_ex(request, headers, runtime)

    async def query_notification_config_async(
        self,
        request: deps_models.QueryNotificationConfigRequest,
    ) -> deps_models.QueryNotificationConfigResponse:
        """
        Description: 查询通知配置
        Summary: 查询通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_notification_config_ex_async(request, headers, runtime)

    def query_notification_config_ex(
        self,
        request: deps_models.QueryNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryNotificationConfigResponse:
        """
        Description: 查询通知配置
        Summary: 查询通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.QueryNotificationConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.notification.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_notification_config_ex_async(
        self,
        request: deps_models.QueryNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryNotificationConfigResponse:
        """
        Description: 查询通知配置
        Summary: 查询通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.QueryNotificationConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.notification.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_notification_config(
        self,
        request: deps_models.DeleteNotificationConfigRequest,
    ) -> deps_models.DeleteNotificationConfigResponse:
        """
        Description: 删除通知配置
        Summary: 删除通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_notification_config_ex(request, headers, runtime)

    async def delete_notification_config_async(
        self,
        request: deps_models.DeleteNotificationConfigRequest,
    ) -> deps_models.DeleteNotificationConfigResponse:
        """
        Description: 删除通知配置
        Summary: 删除通知配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_notification_config_ex_async(request, headers, runtime)

    def delete_notification_config_ex(
        self,
        request: deps_models.DeleteNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteNotificationConfigResponse:
        """
        Description: 删除通知配置
        Summary: 删除通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteNotificationConfigResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.notification.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_notification_config_ex_async(
        self,
        request: deps_models.DeleteNotificationConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteNotificationConfigResponse:
        """
        Description: 删除通知配置
        Summary: 删除通知配置
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteNotificationConfigResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.notification.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_operator(
        self,
        request: deps_models.QueryOperatorRequest,
    ) -> deps_models.QueryOperatorResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_operator_ex(request, headers, runtime)

    async def query_operator_async(
        self,
        request: deps_models.QueryOperatorRequest,
    ) -> deps_models.QueryOperatorResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_operator_ex_async(request, headers, runtime)

    def query_operator_ex(
        self,
        request: deps_models.QueryOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOperatorResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOperatorResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.operator.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_operator_ex_async(
        self,
        request: deps_models.QueryOperatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOperatorResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOperatorResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.operator.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_plan_service(
        self,
        request: deps_models.RollbackPlanServiceRequest,
    ) -> deps_models.RollbackPlanServiceResponse:
        """
        Description: 回滚
        Summary: 回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_plan_service_ex(request, headers, runtime)

    async def rollback_plan_service_async(
        self,
        request: deps_models.RollbackPlanServiceRequest,
    ) -> deps_models.RollbackPlanServiceResponse:
        """
        Description: 回滚
        Summary: 回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_plan_service_ex_async(request, headers, runtime)

    def rollback_plan_service_ex(
        self,
        request: deps_models.RollbackPlanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackPlanServiceResponse:
        """
        Description: 回滚
        Summary: 回滚
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackPlanServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.service.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_plan_service_ex_async(
        self,
        request: deps_models.RollbackPlanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackPlanServiceResponse:
        """
        Description: 回滚
        Summary: 回滚
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackPlanServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.service.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_plan(
        self,
        request: deps_models.CreatePlanRequest,
    ) -> deps_models.CreatePlanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_plan_ex(request, headers, runtime)

    async def create_plan_async(
        self,
        request: deps_models.CreatePlanRequest,
    ) -> deps_models.CreatePlanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_plan_ex_async(request, headers, runtime)

    def create_plan_ex(
        self,
        request: deps_models.CreatePlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreatePlanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        UtilClient.validate_model(request)
        return deps_models.CreatePlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_plan_ex_async(
        self,
        request: deps_models.CreatePlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreatePlanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        UtilClient.validate_model(request)
        return deps_models.CreatePlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_plan(
        self,
        request: deps_models.CheckPlanRequest,
    ) -> deps_models.CheckPlanResponse:
        """
        Description: 发布单校验
        Summary: 发布单校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_plan_ex(request, headers, runtime)

    async def check_plan_async(
        self,
        request: deps_models.CheckPlanRequest,
    ) -> deps_models.CheckPlanResponse:
        """
        Description: 发布单校验
        Summary: 发布单校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_plan_ex_async(request, headers, runtime)

    def check_plan_ex(
        self,
        request: deps_models.CheckPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckPlanResponse:
        """
        Description: 发布单校验
        Summary: 发布单校验
        """
        UtilClient.validate_model(request)
        return deps_models.CheckPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_plan_ex_async(
        self,
        request: deps_models.CheckPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckPlanResponse:
        """
        Description: 发布单校验
        Summary: 发布单校验
        """
        UtilClient.validate_model(request)
        return deps_models.CheckPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_plan_operation(
        self,
        request: deps_models.CheckPlanOperationRequest,
    ) -> deps_models.CheckPlanOperationResponse:
        """
        Description: 校验运维单请求
        Summary: 校验运维单请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_plan_operation_ex(request, headers, runtime)

    async def check_plan_operation_async(
        self,
        request: deps_models.CheckPlanOperationRequest,
    ) -> deps_models.CheckPlanOperationResponse:
        """
        Description: 校验运维单请求
        Summary: 校验运维单请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_plan_operation_ex_async(request, headers, runtime)

    def check_plan_operation_ex(
        self,
        request: deps_models.CheckPlanOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckPlanOperationResponse:
        """
        Description: 校验运维单请求
        Summary: 校验运维单请求
        """
        UtilClient.validate_model(request)
        return deps_models.CheckPlanOperationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.operation.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_plan_operation_ex_async(
        self,
        request: deps_models.CheckPlanOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CheckPlanOperationResponse:
        """
        Description: 校验运维单请求
        Summary: 校验运维单请求
        """
        UtilClient.validate_model(request)
        return deps_models.CheckPlanOperationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.operation.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_plan_operation(
        self,
        request: deps_models.CreatePlanOperationRequest,
    ) -> deps_models.CreatePlanOperationResponse:
        """
        Description: 创建运维单
        Summary: 创建运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_plan_operation_ex(request, headers, runtime)

    async def create_plan_operation_async(
        self,
        request: deps_models.CreatePlanOperationRequest,
    ) -> deps_models.CreatePlanOperationResponse:
        """
        Description: 创建运维单
        Summary: 创建运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_plan_operation_ex_async(request, headers, runtime)

    def create_plan_operation_ex(
        self,
        request: deps_models.CreatePlanOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreatePlanOperationResponse:
        """
        Description: 创建运维单
        Summary: 创建运维单
        """
        UtilClient.validate_model(request)
        return deps_models.CreatePlanOperationResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.operation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_plan_operation_ex_async(
        self,
        request: deps_models.CreatePlanOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreatePlanOperationResponse:
        """
        Description: 创建运维单
        Summary: 创建运维单
        """
        UtilClient.validate_model(request)
        return deps_models.CreatePlanOperationResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.operation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_plan_advanced(
        self,
        request: deps_models.CreatePlanAdvancedRequest,
    ) -> deps_models.CreatePlanAdvancedResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_plan_advanced_ex(request, headers, runtime)

    async def create_plan_advanced_async(
        self,
        request: deps_models.CreatePlanAdvancedRequest,
    ) -> deps_models.CreatePlanAdvancedResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_plan_advanced_ex_async(request, headers, runtime)

    def create_plan_advanced_ex(
        self,
        request: deps_models.CreatePlanAdvancedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreatePlanAdvancedResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        UtilClient.validate_model(request)
        return deps_models.CreatePlanAdvancedResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.advanced.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_plan_advanced_ex_async(
        self,
        request: deps_models.CreatePlanAdvancedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreatePlanAdvancedResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        UtilClient.validate_model(request)
        return deps_models.CreatePlanAdvancedResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.advanced.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_plan(
        self,
        request: deps_models.ReinitPlanRequest,
    ) -> deps_models.ReinitPlanResponse:
        """
        Description: 重新初始化发布单
        Summary: 重新初始化发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_plan_ex(request, headers, runtime)

    async def reinit_plan_async(
        self,
        request: deps_models.ReinitPlanRequest,
    ) -> deps_models.ReinitPlanResponse:
        """
        Description: 重新初始化发布单
        Summary: 重新初始化发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_plan_ex_async(request, headers, runtime)

    def reinit_plan_ex(
        self,
        request: deps_models.ReinitPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitPlanResponse:
        """
        Description: 重新初始化发布单
        Summary: 重新初始化发布单
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_plan_ex_async(
        self,
        request: deps_models.ReinitPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitPlanResponse:
        """
        Description: 重新初始化发布单
        Summary: 重新初始化发布单
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_plan(
        self,
        request: deps_models.GetPlanRequest,
    ) -> deps_models.GetPlanResponse:
        """
        Description: 获取发布单信息
        Summary: 获取发布单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_plan_ex(request, headers, runtime)

    async def get_plan_async(
        self,
        request: deps_models.GetPlanRequest,
    ) -> deps_models.GetPlanResponse:
        """
        Description: 获取发布单信息
        Summary: 获取发布单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_plan_ex_async(request, headers, runtime)

    def get_plan_ex(
        self,
        request: deps_models.GetPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetPlanResponse:
        """
        Description: 获取发布单信息
        Summary: 获取发布单信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_plan_ex_async(
        self,
        request: deps_models.GetPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetPlanResponse:
        """
        Description: 获取发布单信息
        Summary: 获取发布单信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_plan_basic(
        self,
        request: deps_models.GetPlanBasicRequest,
    ) -> deps_models.GetPlanBasicResponse:
        """
        Description: 获取发布单基本信息
        Summary: 获取发布单基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_plan_basic_ex(request, headers, runtime)

    async def get_plan_basic_async(
        self,
        request: deps_models.GetPlanBasicRequest,
    ) -> deps_models.GetPlanBasicResponse:
        """
        Description: 获取发布单基本信息
        Summary: 获取发布单基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_plan_basic_ex_async(request, headers, runtime)

    def get_plan_basic_ex(
        self,
        request: deps_models.GetPlanBasicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetPlanBasicResponse:
        """
        Description: 获取发布单基本信息
        Summary: 获取发布单基本信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetPlanBasicResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.basic.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_plan_basic_ex_async(
        self,
        request: deps_models.GetPlanBasicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetPlanBasicResponse:
        """
        Description: 获取发布单基本信息
        Summary: 获取发布单基本信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetPlanBasicResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.basic.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_plan_progress(
        self,
        request: deps_models.GetPlanProgressRequest,
    ) -> deps_models.GetPlanProgressResponse:
        """
        Description: 获取发布进度
        Summary: 获取发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_plan_progress_ex(request, headers, runtime)

    async def get_plan_progress_async(
        self,
        request: deps_models.GetPlanProgressRequest,
    ) -> deps_models.GetPlanProgressResponse:
        """
        Description: 获取发布进度
        Summary: 获取发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_plan_progress_ex_async(request, headers, runtime)

    def get_plan_progress_ex(
        self,
        request: deps_models.GetPlanProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetPlanProgressResponse:
        """
        Description: 获取发布进度
        Summary: 获取发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.GetPlanProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.progress.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_plan_progress_ex_async(
        self,
        request: deps_models.GetPlanProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetPlanProgressResponse:
        """
        Description: 获取发布进度
        Summary: 获取发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.GetPlanProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.progress.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_plan(
        self,
        request: deps_models.QueryPlanRequest,
    ) -> deps_models.QueryPlanResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_plan_ex(request, headers, runtime)

    async def query_plan_async(
        self,
        request: deps_models.QueryPlanRequest,
    ) -> deps_models.QueryPlanResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_plan_ex_async(request, headers, runtime)

    def query_plan_ex(
        self,
        request: deps_models.QueryPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryPlanResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        UtilClient.validate_model(request)
        return deps_models.QueryPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_plan_ex_async(
        self,
        request: deps_models.QueryPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryPlanResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        UtilClient.validate_model(request)
        return deps_models.QueryPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_plan_state(
        self,
        request: deps_models.CountPlanStateRequest,
    ) -> deps_models.CountPlanStateResponse:
        """
        Description: 发布单状态统计
        Summary: 发布单状态统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_plan_state_ex(request, headers, runtime)

    async def count_plan_state_async(
        self,
        request: deps_models.CountPlanStateRequest,
    ) -> deps_models.CountPlanStateResponse:
        """
        Description: 发布单状态统计
        Summary: 发布单状态统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_plan_state_ex_async(request, headers, runtime)

    def count_plan_state_ex(
        self,
        request: deps_models.CountPlanStateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountPlanStateResponse:
        """
        Description: 发布单状态统计
        Summary: 发布单状态统计
        """
        UtilClient.validate_model(request)
        return deps_models.CountPlanStateResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.state.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_plan_state_ex_async(
        self,
        request: deps_models.CountPlanStateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CountPlanStateResponse:
        """
        Description: 发布单状态统计
        Summary: 发布单状态统计
        """
        UtilClient.validate_model(request)
        return deps_models.CountPlanStateResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.state.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_plan(
        self,
        request: deps_models.ExecPlanRequest,
    ) -> deps_models.ExecPlanResponse:
        """
        Description:  执行
        Summary:  执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_plan_ex(request, headers, runtime)

    async def exec_plan_async(
        self,
        request: deps_models.ExecPlanRequest,
    ) -> deps_models.ExecPlanResponse:
        """
        Description:  执行
        Summary:  执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_plan_ex_async(request, headers, runtime)

    def exec_plan_ex(
        self,
        request: deps_models.ExecPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecPlanResponse:
        """
        Description:  执行
        Summary:  执行
        """
        UtilClient.validate_model(request)
        return deps_models.ExecPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_plan_ex_async(
        self,
        request: deps_models.ExecPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecPlanResponse:
        """
        Description:  执行
        Summary:  执行
        """
        UtilClient.validate_model(request)
        return deps_models.ExecPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_plan(
        self,
        request: deps_models.RetryPlanRequest,
    ) -> deps_models.RetryPlanResponse:
        """
        Description: 重试
        Summary: 重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_plan_ex(request, headers, runtime)

    async def retry_plan_async(
        self,
        request: deps_models.RetryPlanRequest,
    ) -> deps_models.RetryPlanResponse:
        """
        Description: 重试
        Summary: 重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_plan_ex_async(request, headers, runtime)

    def retry_plan_ex(
        self,
        request: deps_models.RetryPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryPlanResponse:
        """
        Description: 重试
        Summary: 重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_plan_ex_async(
        self,
        request: deps_models.RetryPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryPlanResponse:
        """
        Description: 重试
        Summary: 重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_plan(
        self,
        request: deps_models.CancelPlanRequest,
    ) -> deps_models.CancelPlanResponse:
        """
        Description: 取消发布
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_plan_ex(request, headers, runtime)

    async def cancel_plan_async(
        self,
        request: deps_models.CancelPlanRequest,
    ) -> deps_models.CancelPlanResponse:
        """
        Description: 取消发布
        Summary: 取消发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_plan_ex_async(request, headers, runtime)

    def cancel_plan_ex(
        self,
        request: deps_models.CancelPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelPlanResponse:
        """
        Description: 取消发布
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_plan_ex_async(
        self,
        request: deps_models.CancelPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelPlanResponse:
        """
        Description: 取消发布
        Summary: 取消发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_plan(
        self,
        request: deps_models.RollbackPlanRequest,
    ) -> deps_models.RollbackPlanResponse:
        """
        Description: 回滚发布单
        Summary: 回滚发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_plan_ex(request, headers, runtime)

    async def rollback_plan_async(
        self,
        request: deps_models.RollbackPlanRequest,
    ) -> deps_models.RollbackPlanResponse:
        """
        Description: 回滚发布单
        Summary: 回滚发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_plan_ex_async(request, headers, runtime)

    def rollback_plan_ex(
        self,
        request: deps_models.RollbackPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackPlanResponse:
        """
        Description: 回滚发布单
        Summary: 回滚发布单
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackPlanResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.plan.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_plan_ex_async(
        self,
        request: deps_models.RollbackPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackPlanResponse:
        """
        Description: 回滚发布单
        Summary: 回滚发布单
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackPlanResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.plan.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_task_summary(
        self,
        request: deps_models.GetTaskSummaryRequest,
    ) -> deps_models.GetTaskSummaryResponse:
        """
        Description: 获取任务详情
        Summary: 获取任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_task_summary_ex(request, headers, runtime)

    async def get_task_summary_async(
        self,
        request: deps_models.GetTaskSummaryRequest,
    ) -> deps_models.GetTaskSummaryResponse:
        """
        Description: 获取任务详情
        Summary: 获取任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_task_summary_ex_async(request, headers, runtime)

    def get_task_summary_ex(
        self,
        request: deps_models.GetTaskSummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetTaskSummaryResponse:
        """
        Description: 获取任务详情
        Summary: 获取任务详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetTaskSummaryResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.task.summary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_task_summary_ex_async(
        self,
        request: deps_models.GetTaskSummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetTaskSummaryResponse:
        """
        Description: 获取任务详情
        Summary: 获取任务详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetTaskSummaryResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.task.summary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_task(
        self,
        request: deps_models.SkipTaskRequest,
    ) -> deps_models.SkipTaskResponse:
        """
        Description: 忽略任务
        Summary: 忽略任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_task_ex(request, headers, runtime)

    async def skip_task_async(
        self,
        request: deps_models.SkipTaskRequest,
    ) -> deps_models.SkipTaskResponse:
        """
        Description: 忽略任务
        Summary: 忽略任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_task_ex_async(request, headers, runtime)

    def skip_task_ex(
        self,
        request: deps_models.SkipTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipTaskResponse:
        """
        Description: 忽略任务
        Summary: 忽略任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.task.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_task_ex_async(
        self,
        request: deps_models.SkipTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipTaskResponse:
        """
        Description: 忽略任务
        Summary: 忽略任务
        """
        UtilClient.validate_model(request)
        return deps_models.SkipTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.task.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_task(
        self,
        request: deps_models.RetryTaskRequest,
    ) -> deps_models.RetryTaskResponse:
        """
        Description: 重试任务
        Summary: 重试任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_task_ex(request, headers, runtime)

    async def retry_task_async(
        self,
        request: deps_models.RetryTaskRequest,
    ) -> deps_models.RetryTaskResponse:
        """
        Description: 重试任务
        Summary: 重试任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_task_ex_async(request, headers, runtime)

    def retry_task_ex(
        self,
        request: deps_models.RetryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryTaskResponse:
        """
        Description: 重试任务
        Summary: 重试任务
        """
        UtilClient.validate_model(request)
        return deps_models.RetryTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.task.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_task_ex_async(
        self,
        request: deps_models.RetryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryTaskResponse:
        """
        Description: 重试任务
        Summary: 重试任务
        """
        UtilClient.validate_model(request)
        return deps_models.RetryTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.task.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_role(
        self,
        request: deps_models.QueryRoleRequest,
    ) -> deps_models.QueryRoleResponse:
        """
        Description: 查询角色信息
        Summary: 查询角色信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_role_ex(request, headers, runtime)

    async def query_role_async(
        self,
        request: deps_models.QueryRoleRequest,
    ) -> deps_models.QueryRoleResponse:
        """
        Description: 查询角色信息
        Summary: 查询角色信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_role_ex_async(request, headers, runtime)

    def query_role_ex(
        self,
        request: deps_models.QueryRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryRoleResponse:
        """
        Description: 查询角色信息
        Summary: 查询角色信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryRoleResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.role.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_role_ex_async(
        self,
        request: deps_models.QueryRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryRoleResponse:
        """
        Description: 查询角色信息
        Summary: 查询角色信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryRoleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.role.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_servicegroupcollection(
        self,
        request: deps_models.CreateServicegroupcollectionRequest,
    ) -> deps_models.CreateServicegroupcollectionResponse:
        """
        Description: 创建应用服务分组集合
        Summary: 创建应用服务分组集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_servicegroupcollection_ex(request, headers, runtime)

    async def create_servicegroupcollection_async(
        self,
        request: deps_models.CreateServicegroupcollectionRequest,
    ) -> deps_models.CreateServicegroupcollectionResponse:
        """
        Description: 创建应用服务分组集合
        Summary: 创建应用服务分组集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_servicegroupcollection_ex_async(request, headers, runtime)

    def create_servicegroupcollection_ex(
        self,
        request: deps_models.CreateServicegroupcollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateServicegroupcollectionResponse:
        """
        Description: 创建应用服务分组集合
        Summary: 创建应用服务分组集合
        """
        UtilClient.validate_model(request)
        return deps_models.CreateServicegroupcollectionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroupcollection.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_servicegroupcollection_ex_async(
        self,
        request: deps_models.CreateServicegroupcollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateServicegroupcollectionResponse:
        """
        Description: 创建应用服务分组集合
        Summary: 创建应用服务分组集合
        """
        UtilClient.validate_model(request)
        return deps_models.CreateServicegroupcollectionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroupcollection.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_servicegroupcollection(
        self,
        request: deps_models.DeleteServicegroupcollectionRequest,
    ) -> deps_models.DeleteServicegroupcollectionResponse:
        """
        Description: 清除应用服务发布分组集合
        Summary: 清除应用服务发布分组集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_servicegroupcollection_ex(request, headers, runtime)

    async def delete_servicegroupcollection_async(
        self,
        request: deps_models.DeleteServicegroupcollectionRequest,
    ) -> deps_models.DeleteServicegroupcollectionResponse:
        """
        Description: 清除应用服务发布分组集合
        Summary: 清除应用服务发布分组集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_servicegroupcollection_ex_async(request, headers, runtime)

    def delete_servicegroupcollection_ex(
        self,
        request: deps_models.DeleteServicegroupcollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteServicegroupcollectionResponse:
        """
        Description: 清除应用服务发布分组集合
        Summary: 清除应用服务发布分组集合
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteServicegroupcollectionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroupcollection.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_servicegroupcollection_ex_async(
        self,
        request: deps_models.DeleteServicegroupcollectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteServicegroupcollectionResponse:
        """
        Description: 清除应用服务发布分组集合
        Summary: 清除应用服务发布分组集合
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteServicegroupcollectionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroupcollection.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_servicegroup(
        self,
        request: deps_models.RetryServicegroupRequest,
    ) -> deps_models.RetryServicegroupResponse:
        """
        Description: 重试分组
        Summary: 重试分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_servicegroup_ex(request, headers, runtime)

    async def retry_servicegroup_async(
        self,
        request: deps_models.RetryServicegroupRequest,
    ) -> deps_models.RetryServicegroupResponse:
        """
        Description: 重试分组
        Summary: 重试分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_servicegroup_ex_async(request, headers, runtime)

    def retry_servicegroup_ex(
        self,
        request: deps_models.RetryServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryServicegroupResponse:
        """
        Description: 重试分组
        Summary: 重试分组
        """
        UtilClient.validate_model(request)
        return deps_models.RetryServicegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroup.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_servicegroup_ex_async(
        self,
        request: deps_models.RetryServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryServicegroupResponse:
        """
        Description: 重试分组
        Summary: 重试分组
        """
        UtilClient.validate_model(request)
        return deps_models.RetryServicegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroup.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_servicegroup(
        self,
        request: deps_models.ExecServicegroupRequest,
    ) -> deps_models.ExecServicegroupResponse:
        """
        Description: 执行发布分组
        Summary: 执行发布分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_servicegroup_ex(request, headers, runtime)

    async def exec_servicegroup_async(
        self,
        request: deps_models.ExecServicegroupRequest,
    ) -> deps_models.ExecServicegroupResponse:
        """
        Description: 执行发布分组
        Summary: 执行发布分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_servicegroup_ex_async(request, headers, runtime)

    def exec_servicegroup_ex(
        self,
        request: deps_models.ExecServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecServicegroupResponse:
        """
        Description: 执行发布分组
        Summary: 执行发布分组
        """
        UtilClient.validate_model(request)
        return deps_models.ExecServicegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroup.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_servicegroup_ex_async(
        self,
        request: deps_models.ExecServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecServicegroupResponse:
        """
        Description: 执行发布分组
        Summary: 执行发布分组
        """
        UtilClient.validate_model(request)
        return deps_models.ExecServicegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroup.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_servicegroup(
        self,
        request: deps_models.SkipServicegroupRequest,
    ) -> deps_models.SkipServicegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_servicegroup_ex(request, headers, runtime)

    async def skip_servicegroup_async(
        self,
        request: deps_models.SkipServicegroupRequest,
    ) -> deps_models.SkipServicegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_servicegroup_ex_async(request, headers, runtime)

    def skip_servicegroup_ex(
        self,
        request: deps_models.SkipServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipServicegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        UtilClient.validate_model(request)
        return deps_models.SkipServicegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroup.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_servicegroup_ex_async(
        self,
        request: deps_models.SkipServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipServicegroupResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        UtilClient.validate_model(request)
        return deps_models.SkipServicegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroup.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_servicegroup(
        self,
        request: deps_models.CreateServicegroupRequest,
    ) -> deps_models.CreateServicegroupResponse:
        """
        Description: 创建发布分组
        Summary: 创建发布分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_servicegroup_ex(request, headers, runtime)

    async def create_servicegroup_async(
        self,
        request: deps_models.CreateServicegroupRequest,
    ) -> deps_models.CreateServicegroupResponse:
        """
        Description: 创建发布分组
        Summary: 创建发布分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_servicegroup_ex_async(request, headers, runtime)

    def create_servicegroup_ex(
        self,
        request: deps_models.CreateServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateServicegroupResponse:
        """
        Description: 创建发布分组
        Summary: 创建发布分组
        """
        UtilClient.validate_model(request)
        return deps_models.CreateServicegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_servicegroup_ex_async(
        self,
        request: deps_models.CreateServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateServicegroupResponse:
        """
        Description: 创建发布分组
        Summary: 创建发布分组
        """
        UtilClient.validate_model(request)
        return deps_models.CreateServicegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_servicegroup(
        self,
        request: deps_models.DeleteServicegroupRequest,
    ) -> deps_models.DeleteServicegroupResponse:
        """
        Description: 删除发布分组
        Summary: 删除发布分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_servicegroup_ex(request, headers, runtime)

    async def delete_servicegroup_async(
        self,
        request: deps_models.DeleteServicegroupRequest,
    ) -> deps_models.DeleteServicegroupResponse:
        """
        Description: 删除发布分组
        Summary: 删除发布分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_servicegroup_ex_async(request, headers, runtime)

    def delete_servicegroup_ex(
        self,
        request: deps_models.DeleteServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteServicegroupResponse:
        """
        Description: 删除发布分组
        Summary: 删除发布分组
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteServicegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_servicegroup_ex_async(
        self,
        request: deps_models.DeleteServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteServicegroupResponse:
        """
        Description: 删除发布分组
        Summary: 删除发布分组
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteServicegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_servicegroup(
        self,
        request: deps_models.SwitchServicegroupRequest,
    ) -> deps_models.SwitchServicegroupResponse:
        """
        Description: 转换分组
        Summary: 转换分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_servicegroup_ex(request, headers, runtime)

    async def switch_servicegroup_async(
        self,
        request: deps_models.SwitchServicegroupRequest,
    ) -> deps_models.SwitchServicegroupResponse:
        """
        Description: 转换分组
        Summary: 转换分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_servicegroup_ex_async(request, headers, runtime)

    def switch_servicegroup_ex(
        self,
        request: deps_models.SwitchServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SwitchServicegroupResponse:
        """
        Description: 转换分组
        Summary: 转换分组
        """
        UtilClient.validate_model(request)
        return deps_models.SwitchServicegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.servicegroup.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_servicegroup_ex_async(
        self,
        request: deps_models.SwitchServicegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SwitchServicegroupResponse:
        """
        Description: 转换分组
        Summary: 转换分组
        """
        UtilClient.validate_model(request)
        return deps_models.SwitchServicegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.servicegroup.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_service(
        self,
        request: deps_models.GetServiceRequest,
    ) -> deps_models.GetServiceResponse:
        """
        Description: 获取发布服务详情
        Summary: 获取发布服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_service_ex(request, headers, runtime)

    async def get_service_async(
        self,
        request: deps_models.GetServiceRequest,
    ) -> deps_models.GetServiceResponse:
        """
        Description: 获取发布服务详情
        Summary: 获取发布服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_service_ex_async(request, headers, runtime)

    def get_service_ex(
        self,
        request: deps_models.GetServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceResponse:
        """
        Description: 获取发布服务详情
        Summary: 获取发布服务详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_service_ex_async(
        self,
        request: deps_models.GetServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceResponse:
        """
        Description: 获取发布服务详情
        Summary: 获取发布服务详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_service_progress(
        self,
        request: deps_models.GetServiceProgressRequest,
    ) -> deps_models.GetServiceProgressResponse:
        """
        Description: 获取应用发布信息
        Summary: 获取应用发布信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_service_progress_ex(request, headers, runtime)

    async def get_service_progress_async(
        self,
        request: deps_models.GetServiceProgressRequest,
    ) -> deps_models.GetServiceProgressResponse:
        """
        Description: 获取应用发布信息
        Summary: 获取应用发布信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_service_progress_ex_async(request, headers, runtime)

    def get_service_progress_ex(
        self,
        request: deps_models.GetServiceProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceProgressResponse:
        """
        Description: 获取应用发布信息
        Summary: 获取应用发布信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.progress.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_service_progress_ex_async(
        self,
        request: deps_models.GetServiceProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceProgressResponse:
        """
        Description: 获取应用发布信息
        Summary: 获取应用发布信息
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.progress.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_progress(
        self,
        request: deps_models.QueryServiceProgressRequest,
    ) -> deps_models.QueryServiceProgressResponse:
        """
        Description: 查询发布进度
        Summary: 查询发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_progress_ex(request, headers, runtime)

    async def query_service_progress_async(
        self,
        request: deps_models.QueryServiceProgressRequest,
    ) -> deps_models.QueryServiceProgressResponse:
        """
        Description: 查询发布进度
        Summary: 查询发布进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_progress_ex_async(request, headers, runtime)

    def query_service_progress_ex(
        self,
        request: deps_models.QueryServiceProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceProgressResponse:
        """
        Description: 查询发布进度
        Summary: 查询发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceProgressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_progress_ex_async(
        self,
        request: deps_models.QueryServiceProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceProgressResponse:
        """
        Description: 查询发布进度
        Summary: 查询发布进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceProgressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_slbmount(
        self,
        request: deps_models.QueryServiceSlbmountRequest,
    ) -> deps_models.QueryServiceSlbmountResponse:
        """
        Description: 查询SLB挂载信息
        Summary: 查询SLB挂载信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_slbmount_ex(request, headers, runtime)

    async def query_service_slbmount_async(
        self,
        request: deps_models.QueryServiceSlbmountRequest,
    ) -> deps_models.QueryServiceSlbmountResponse:
        """
        Description: 查询SLB挂载信息
        Summary: 查询SLB挂载信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_slbmount_ex_async(request, headers, runtime)

    def query_service_slbmount_ex(
        self,
        request: deps_models.QueryServiceSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceSlbmountResponse:
        """
        Description: 查询SLB挂载信息
        Summary: 查询SLB挂载信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceSlbmountResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.slbmount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_slbmount_ex_async(
        self,
        request: deps_models.QueryServiceSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceSlbmountResponse:
        """
        Description: 查询SLB挂载信息
        Summary: 查询SLB挂载信息
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceSlbmountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.slbmount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_service_slbmount(
        self,
        request: deps_models.BatchqueryServiceSlbmountRequest,
    ) -> deps_models.BatchqueryServiceSlbmountResponse:
        """
        Description: 批量查询 SLB 挂载信息
        Summary: 批量查询 SLB 挂载信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_service_slbmount_ex(request, headers, runtime)

    async def batchquery_service_slbmount_async(
        self,
        request: deps_models.BatchqueryServiceSlbmountRequest,
    ) -> deps_models.BatchqueryServiceSlbmountResponse:
        """
        Description: 批量查询 SLB 挂载信息
        Summary: 批量查询 SLB 挂载信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_service_slbmount_ex_async(request, headers, runtime)

    def batchquery_service_slbmount_ex(
        self,
        request: deps_models.BatchqueryServiceSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchqueryServiceSlbmountResponse:
        """
        Description: 批量查询 SLB 挂载信息
        Summary: 批量查询 SLB 挂载信息
        """
        UtilClient.validate_model(request)
        return deps_models.BatchqueryServiceSlbmountResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.slbmount.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_service_slbmount_ex_async(
        self,
        request: deps_models.BatchqueryServiceSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.BatchqueryServiceSlbmountResponse:
        """
        Description: 批量查询 SLB 挂载信息
        Summary: 批量查询 SLB 挂载信息
        """
        UtilClient.validate_model(request)
        return deps_models.BatchqueryServiceSlbmountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.slbmount.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_service_slbmount(
        self,
        request: deps_models.UpdateServiceSlbmountRequest,
    ) -> deps_models.UpdateServiceSlbmountResponse:
        """
        Description: 更新slb挂载权重
        Summary: 更新slb挂载权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_service_slbmount_ex(request, headers, runtime)

    async def update_service_slbmount_async(
        self,
        request: deps_models.UpdateServiceSlbmountRequest,
    ) -> deps_models.UpdateServiceSlbmountResponse:
        """
        Description: 更新slb挂载权重
        Summary: 更新slb挂载权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_service_slbmount_ex_async(request, headers, runtime)

    def update_service_slbmount_ex(
        self,
        request: deps_models.UpdateServiceSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateServiceSlbmountResponse:
        """
        Description: 更新slb挂载权重
        Summary: 更新slb挂载权重
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateServiceSlbmountResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.slbmount.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_service_slbmount_ex_async(
        self,
        request: deps_models.UpdateServiceSlbmountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateServiceSlbmountResponse:
        """
        Description: 更新slb挂载权重
        Summary: 更新slb挂载权重
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateServiceSlbmountResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.slbmount.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_slbmountprogress(
        self,
        request: deps_models.QueryServiceSlbmountprogressRequest,
    ) -> deps_models.QueryServiceSlbmountprogressResponse:
        """
        Description: 查询挂载进度
        Summary: 查询挂载进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_slbmountprogress_ex(request, headers, runtime)

    async def query_service_slbmountprogress_async(
        self,
        request: deps_models.QueryServiceSlbmountprogressRequest,
    ) -> deps_models.QueryServiceSlbmountprogressResponse:
        """
        Description: 查询挂载进度
        Summary: 查询挂载进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_slbmountprogress_ex_async(request, headers, runtime)

    def query_service_slbmountprogress_ex(
        self,
        request: deps_models.QueryServiceSlbmountprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceSlbmountprogressResponse:
        """
        Description: 查询挂载进度
        Summary: 查询挂载进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceSlbmountprogressResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.slbmountprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_slbmountprogress_ex_async(
        self,
        request: deps_models.QueryServiceSlbmountprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceSlbmountprogressResponse:
        """
        Description: 查询挂载进度
        Summary: 查询挂载进度
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceSlbmountprogressResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.slbmountprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_latestsuccess(
        self,
        request: deps_models.QueryServiceLatestsuccessRequest,
    ) -> deps_models.QueryServiceLatestsuccessResponse:
        """
        Description: 查询最近一次发布成功的应用记录
        Summary: 查询最近一次发布成功的应用记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_latestsuccess_ex(request, headers, runtime)

    async def query_service_latestsuccess_async(
        self,
        request: deps_models.QueryServiceLatestsuccessRequest,
    ) -> deps_models.QueryServiceLatestsuccessResponse:
        """
        Description: 查询最近一次发布成功的应用记录
        Summary: 查询最近一次发布成功的应用记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_latestsuccess_ex_async(request, headers, runtime)

    def query_service_latestsuccess_ex(
        self,
        request: deps_models.QueryServiceLatestsuccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceLatestsuccessResponse:
        """
        Description: 查询最近一次发布成功的应用记录
        Summary: 查询最近一次发布成功的应用记录
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceLatestsuccessResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.latestsuccess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_latestsuccess_ex_async(
        self,
        request: deps_models.QueryServiceLatestsuccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceLatestsuccessResponse:
        """
        Description: 查询最近一次发布成功的应用记录
        Summary: 查询最近一次发布成功的应用记录
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceLatestsuccessResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.latestsuccess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_service(
        self,
        request: deps_models.ReinitServiceRequest,
    ) -> deps_models.ReinitServiceResponse:
        """
        Description: 重新初始化
        Summary: 重新初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_service_ex(request, headers, runtime)

    async def reinit_service_async(
        self,
        request: deps_models.ReinitServiceRequest,
    ) -> deps_models.ReinitServiceResponse:
        """
        Description: 重新初始化
        Summary: 重新初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_service_ex_async(request, headers, runtime)

    def reinit_service_ex(
        self,
        request: deps_models.ReinitServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitServiceResponse:
        """
        Description: 重新初始化
        Summary: 重新初始化
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_service_ex_async(
        self,
        request: deps_models.ReinitServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitServiceResponse:
        """
        Description: 重新初始化
        Summary: 重新初始化
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_service(
        self,
        request: deps_models.ExecServiceRequest,
    ) -> deps_models.ExecServiceResponse:
        """
        Description: 执行发布单
        Summary: 执行发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_service_ex(request, headers, runtime)

    async def exec_service_async(
        self,
        request: deps_models.ExecServiceRequest,
    ) -> deps_models.ExecServiceResponse:
        """
        Description: 执行发布单
        Summary: 执行发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_service_ex_async(request, headers, runtime)

    def exec_service_ex(
        self,
        request: deps_models.ExecServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecServiceResponse:
        """
        Description: 执行发布单
        Summary: 执行发布单
        """
        UtilClient.validate_model(request)
        return deps_models.ExecServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_service_ex_async(
        self,
        request: deps_models.ExecServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ExecServiceResponse:
        """
        Description: 执行发布单
        Summary: 执行发布单
        """
        UtilClient.validate_model(request)
        return deps_models.ExecServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_service(
        self,
        request: deps_models.CancelServiceRequest,
    ) -> deps_models.CancelServiceResponse:
        """
        Description: 取消应用发布
        Summary: 取消应用发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_service_ex(request, headers, runtime)

    async def cancel_service_async(
        self,
        request: deps_models.CancelServiceRequest,
    ) -> deps_models.CancelServiceResponse:
        """
        Description: 取消应用发布
        Summary: 取消应用发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_service_ex_async(request, headers, runtime)

    def cancel_service_ex(
        self,
        request: deps_models.CancelServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelServiceResponse:
        """
        Description: 取消应用发布
        Summary: 取消应用发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_service_ex_async(
        self,
        request: deps_models.CancelServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CancelServiceResponse:
        """
        Description: 取消应用发布
        Summary: 取消应用发布
        """
        UtilClient.validate_model(request)
        return deps_models.CancelServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_service(
        self,
        request: deps_models.SkipServiceRequest,
    ) -> deps_models.SkipServiceResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_service_ex(request, headers, runtime)

    async def skip_service_async(
        self,
        request: deps_models.SkipServiceRequest,
    ) -> deps_models.SkipServiceResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_service_ex_async(request, headers, runtime)

    def skip_service_ex(
        self,
        request: deps_models.SkipServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipServiceResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        UtilClient.validate_model(request)
        return deps_models.SkipServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_service_ex_async(
        self,
        request: deps_models.SkipServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipServiceResponse:
        """
        Description: 忽略分组
        Summary: 忽略分组
        """
        UtilClient.validate_model(request)
        return deps_models.SkipServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_service(
        self,
        request: deps_models.StartServiceRequest,
    ) -> deps_models.StartServiceResponse:
        """
        Description: 触发服务发布
        Summary: 触发服务发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_service_ex(request, headers, runtime)

    async def start_service_async(
        self,
        request: deps_models.StartServiceRequest,
    ) -> deps_models.StartServiceResponse:
        """
        Description: 触发服务发布
        Summary: 触发服务发布
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_service_ex_async(request, headers, runtime)

    def start_service_ex(
        self,
        request: deps_models.StartServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartServiceResponse:
        """
        Description: 触发服务发布
        Summary: 触发服务发布
        """
        UtilClient.validate_model(request)
        return deps_models.StartServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_service_ex_async(
        self,
        request: deps_models.StartServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.StartServiceResponse:
        """
        Description: 触发服务发布
        Summary: 触发服务发布
        """
        UtilClient.validate_model(request)
        return deps_models.StartServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_service(
        self,
        request: deps_models.ConfirmServiceRequest,
    ) -> deps_models.ConfirmServiceResponse:
        """
        Description: 发布确认
        Summary: 发布确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_service_ex(request, headers, runtime)

    async def confirm_service_async(
        self,
        request: deps_models.ConfirmServiceRequest,
    ) -> deps_models.ConfirmServiceResponse:
        """
        Description: 发布确认
        Summary: 发布确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_service_ex_async(request, headers, runtime)

    def confirm_service_ex(
        self,
        request: deps_models.ConfirmServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmServiceResponse:
        """
        Description: 发布确认
        Summary: 发布确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_service_ex_async(
        self,
        request: deps_models.ConfirmServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmServiceResponse:
        """
        Description: 发布确认
        Summary: 发布确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_service_machinegroup(
        self,
        request: deps_models.SetServiceMachinegroupRequest,
    ) -> deps_models.SetServiceMachinegroupResponse:
        """
        Description: 配置机器分组
        Summary: 配置机器分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_service_machinegroup_ex(request, headers, runtime)

    async def set_service_machinegroup_async(
        self,
        request: deps_models.SetServiceMachinegroupRequest,
    ) -> deps_models.SetServiceMachinegroupResponse:
        """
        Description: 配置机器分组
        Summary: 配置机器分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_service_machinegroup_ex_async(request, headers, runtime)

    def set_service_machinegroup_ex(
        self,
        request: deps_models.SetServiceMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SetServiceMachinegroupResponse:
        """
        Description: 配置机器分组
        Summary: 配置机器分组
        """
        UtilClient.validate_model(request)
        return deps_models.SetServiceMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.machinegroup.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_service_machinegroup_ex_async(
        self,
        request: deps_models.SetServiceMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SetServiceMachinegroupResponse:
        """
        Description: 配置机器分组
        Summary: 配置机器分组
        """
        UtilClient.validate_model(request)
        return deps_models.SetServiceMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.machinegroup.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_service_machinegroup(
        self,
        request: deps_models.ReinitServiceMachinegroupRequest,
    ) -> deps_models.ReinitServiceMachinegroupResponse:
        """
        Description: 重新初始化机器分组
        Summary: 重新初始化机器分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_service_machinegroup_ex(request, headers, runtime)

    async def reinit_service_machinegroup_async(
        self,
        request: deps_models.ReinitServiceMachinegroupRequest,
    ) -> deps_models.ReinitServiceMachinegroupResponse:
        """
        Description: 重新初始化机器分组
        Summary: 重新初始化机器分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_service_machinegroup_ex_async(request, headers, runtime)

    def reinit_service_machinegroup_ex(
        self,
        request: deps_models.ReinitServiceMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitServiceMachinegroupResponse:
        """
        Description: 重新初始化机器分组
        Summary: 重新初始化机器分组
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitServiceMachinegroupResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.machinegroup.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_service_machinegroup_ex_async(
        self,
        request: deps_models.ReinitServiceMachinegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReinitServiceMachinegroupResponse:
        """
        Description: 重新初始化机器分组
        Summary: 重新初始化机器分组
        """
        UtilClient.validate_model(request)
        return deps_models.ReinitServiceMachinegroupResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.machinegroup.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_service_rollbackversion(
        self,
        request: deps_models.ListServiceRollbackversionRequest,
    ) -> deps_models.ListServiceRollbackversionResponse:
        """
        Description: 查询可回滚服务
        Summary: 查询可回滚服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_service_rollbackversion_ex(request, headers, runtime)

    async def list_service_rollbackversion_async(
        self,
        request: deps_models.ListServiceRollbackversionRequest,
    ) -> deps_models.ListServiceRollbackversionResponse:
        """
        Description: 查询可回滚服务
        Summary: 查询可回滚服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_service_rollbackversion_ex_async(request, headers, runtime)

    def list_service_rollbackversion_ex(
        self,
        request: deps_models.ListServiceRollbackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListServiceRollbackversionResponse:
        """
        Description: 查询可回滚服务
        Summary: 查询可回滚服务
        """
        UtilClient.validate_model(request)
        return deps_models.ListServiceRollbackversionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.rollbackversion.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_service_rollbackversion_ex_async(
        self,
        request: deps_models.ListServiceRollbackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListServiceRollbackversionResponse:
        """
        Description: 查询可回滚服务
        Summary: 查询可回滚服务
        """
        UtilClient.validate_model(request)
        return deps_models.ListServiceRollbackversionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.rollbackversion.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_rollbackversion(
        self,
        request: deps_models.QueryServiceRollbackversionRequest,
    ) -> deps_models.QueryServiceRollbackversionResponse:
        """
        Description: 查询可回滚版本
        Summary: 查询可回滚版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_rollbackversion_ex(request, headers, runtime)

    async def query_service_rollbackversion_async(
        self,
        request: deps_models.QueryServiceRollbackversionRequest,
    ) -> deps_models.QueryServiceRollbackversionResponse:
        """
        Description: 查询可回滚版本
        Summary: 查询可回滚版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_rollbackversion_ex_async(request, headers, runtime)

    def query_service_rollbackversion_ex(
        self,
        request: deps_models.QueryServiceRollbackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceRollbackversionResponse:
        """
        Description: 查询可回滚版本
        Summary: 查询可回滚版本
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceRollbackversionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.rollbackversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_rollbackversion_ex_async(
        self,
        request: deps_models.QueryServiceRollbackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryServiceRollbackversionResponse:
        """
        Description: 查询可回滚版本
        Summary: 查询可回滚版本
        """
        UtilClient.validate_model(request)
        return deps_models.QueryServiceRollbackversionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.rollbackversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_service(
        self,
        request: deps_models.RollbackServiceRequest,
    ) -> deps_models.RollbackServiceResponse:
        """
        Description: 回滚应用
        Summary: 回滚应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_service_ex(request, headers, runtime)

    async def rollback_service_async(
        self,
        request: deps_models.RollbackServiceRequest,
    ) -> deps_models.RollbackServiceResponse:
        """
        Description: 回滚应用
        Summary: 回滚应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_service_ex_async(request, headers, runtime)

    def rollback_service_ex(
        self,
        request: deps_models.RollbackServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackServiceResponse:
        """
        Description: 回滚应用
        Summary: 回滚应用
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_service_ex_async(
        self,
        request: deps_models.RollbackServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RollbackServiceResponse:
        """
        Description: 回滚应用
        Summary: 回滚应用
        """
        UtilClient.validate_model(request)
        return deps_models.RollbackServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirmrollback_service(
        self,
        request: deps_models.ConfirmrollbackServiceRequest,
    ) -> deps_models.ConfirmrollbackServiceResponse:
        """
        Description: 回滚确认
        Summary: 回滚确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirmrollback_service_ex(request, headers, runtime)

    async def confirmrollback_service_async(
        self,
        request: deps_models.ConfirmrollbackServiceRequest,
    ) -> deps_models.ConfirmrollbackServiceResponse:
        """
        Description: 回滚确认
        Summary: 回滚确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirmrollback_service_ex_async(request, headers, runtime)

    def confirmrollback_service_ex(
        self,
        request: deps_models.ConfirmrollbackServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmrollbackServiceResponse:
        """
        Description: 回滚确认
        Summary: 回滚确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmrollbackServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.confirmrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirmrollback_service_ex_async(
        self,
        request: deps_models.ConfirmrollbackServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ConfirmrollbackServiceResponse:
        """
        Description: 回滚确认
        Summary: 回滚确认
        """
        UtilClient.validate_model(request)
        return deps_models.ConfirmrollbackServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.confirmrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retryrollback_service(
        self,
        request: deps_models.RetryrollbackServiceRequest,
    ) -> deps_models.RetryrollbackServiceResponse:
        """
        Description: 回滚重试
        Summary: 回滚重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retryrollback_service_ex(request, headers, runtime)

    async def retryrollback_service_async(
        self,
        request: deps_models.RetryrollbackServiceRequest,
    ) -> deps_models.RetryrollbackServiceResponse:
        """
        Description: 回滚重试
        Summary: 回滚重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retryrollback_service_ex_async(request, headers, runtime)

    def retryrollback_service_ex(
        self,
        request: deps_models.RetryrollbackServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryrollbackServiceResponse:
        """
        Description: 回滚重试
        Summary: 回滚重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryrollbackServiceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.retryrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retryrollback_service_ex_async(
        self,
        request: deps_models.RetryrollbackServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryrollbackServiceResponse:
        """
        Description: 回滚重试
        Summary: 回滚重试
        """
        UtilClient.validate_model(request)
        return deps_models.RetryrollbackServiceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.retryrollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_service_arrangement(
        self,
        request: deps_models.GetServiceArrangementRequest,
    ) -> deps_models.GetServiceArrangementResponse:
        """
        Description: 获取子流程进度
        Summary: 获取子流程进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_service_arrangement_ex(request, headers, runtime)

    async def get_service_arrangement_async(
        self,
        request: deps_models.GetServiceArrangementRequest,
    ) -> deps_models.GetServiceArrangementResponse:
        """
        Description: 获取子流程进度
        Summary: 获取子流程进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_service_arrangement_ex_async(request, headers, runtime)

    def get_service_arrangement_ex(
        self,
        request: deps_models.GetServiceArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceArrangementResponse:
        """
        Description: 获取子流程进度
        Summary: 获取子流程进度
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.arrangement.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_service_arrangement_ex_async(
        self,
        request: deps_models.GetServiceArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceArrangementResponse:
        """
        Description: 获取子流程进度
        Summary: 获取子流程进度
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.arrangement.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_service_arrangement(
        self,
        request: deps_models.RetryServiceArrangementRequest,
    ) -> deps_models.RetryServiceArrangementResponse:
        """
        Description: 重试子流程
        Summary: 重试子流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_service_arrangement_ex(request, headers, runtime)

    async def retry_service_arrangement_async(
        self,
        request: deps_models.RetryServiceArrangementRequest,
    ) -> deps_models.RetryServiceArrangementResponse:
        """
        Description: 重试子流程
        Summary: 重试子流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_service_arrangement_ex_async(request, headers, runtime)

    def retry_service_arrangement_ex(
        self,
        request: deps_models.RetryServiceArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryServiceArrangementResponse:
        """
        Description: 重试子流程
        Summary: 重试子流程
        """
        UtilClient.validate_model(request)
        return deps_models.RetryServiceArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.arrangement.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_service_arrangement_ex_async(
        self,
        request: deps_models.RetryServiceArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.RetryServiceArrangementResponse:
        """
        Description: 重试子流程
        Summary: 重试子流程
        """
        UtilClient.validate_model(request)
        return deps_models.RetryServiceArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.arrangement.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def skip_service_arrangement(
        self,
        request: deps_models.SkipServiceArrangementRequest,
    ) -> deps_models.SkipServiceArrangementResponse:
        """
        Description: 忽略子流程
        Summary: 忽略子流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.skip_service_arrangement_ex(request, headers, runtime)

    async def skip_service_arrangement_async(
        self,
        request: deps_models.SkipServiceArrangementRequest,
    ) -> deps_models.SkipServiceArrangementResponse:
        """
        Description: 忽略子流程
        Summary: 忽略子流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.skip_service_arrangement_ex_async(request, headers, runtime)

    def skip_service_arrangement_ex(
        self,
        request: deps_models.SkipServiceArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipServiceArrangementResponse:
        """
        Description: 忽略子流程
        Summary: 忽略子流程
        """
        UtilClient.validate_model(request)
        return deps_models.SkipServiceArrangementResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.arrangement.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def skip_service_arrangement_ex_async(
        self,
        request: deps_models.SkipServiceArrangementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SkipServiceArrangementResponse:
        """
        Description: 忽略子流程
        Summary: 忽略子流程
        """
        UtilClient.validate_model(request)
        return deps_models.SkipServiceArrangementResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.arrangement.skip', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_operationlog(
        self,
        request: deps_models.QueryOperationlogRequest,
    ) -> deps_models.QueryOperationlogResponse:
        """
        Description: query op log
        Summary: query op log
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_operationlog_ex(request, headers, runtime)

    async def query_operationlog_async(
        self,
        request: deps_models.QueryOperationlogRequest,
    ) -> deps_models.QueryOperationlogResponse:
        """
        Description: query op log
        Summary: query op log
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_operationlog_ex_async(request, headers, runtime)

    def query_operationlog_ex(
        self,
        request: deps_models.QueryOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOperationlogResponse:
        """
        Description: query op log
        Summary: query op log
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOperationlogResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.operationlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_operationlog_ex_async(
        self,
        request: deps_models.QueryOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOperationlogResponse:
        """
        Description: query op log
        Summary: query op log
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOperationlogResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.operationlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_operationlog_timeline(
        self,
        request: deps_models.QueryOperationlogTimelineRequest,
    ) -> deps_models.QueryOperationlogTimelineResponse:
        """
        Description: operation time line
        Summary: operation time line
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_operationlog_timeline_ex(request, headers, runtime)

    async def query_operationlog_timeline_async(
        self,
        request: deps_models.QueryOperationlogTimelineRequest,
    ) -> deps_models.QueryOperationlogTimelineResponse:
        """
        Description: operation time line
        Summary: operation time line
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_operationlog_timeline_ex_async(request, headers, runtime)

    def query_operationlog_timeline_ex(
        self,
        request: deps_models.QueryOperationlogTimelineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOperationlogTimelineResponse:
        """
        Description: operation time line
        Summary: operation time line
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOperationlogTimelineResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.operationlog.timeline.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_operationlog_timeline_ex_async(
        self,
        request: deps_models.QueryOperationlogTimelineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryOperationlogTimelineResponse:
        """
        Description: operation time line
        Summary: operation time line
        """
        UtilClient.validate_model(request)
        return deps_models.QueryOperationlogTimelineResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.operationlog.timeline.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_service_detail(
        self,
        request: deps_models.GetServiceDetailRequest,
    ) -> deps_models.GetServiceDetailResponse:
        """
        Description: 获取发布应用详情
        Summary: 获取发布应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_service_detail_ex(request, headers, runtime)

    async def get_service_detail_async(
        self,
        request: deps_models.GetServiceDetailRequest,
    ) -> deps_models.GetServiceDetailResponse:
        """
        Description: 获取发布应用详情
        Summary: 获取发布应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_service_detail_ex_async(request, headers, runtime)

    def get_service_detail_ex(
        self,
        request: deps_models.GetServiceDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceDetailResponse:
        """
        Description: 获取发布应用详情
        Summary: 获取发布应用详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceDetailResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.service.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_service_detail_ex_async(
        self,
        request: deps_models.GetServiceDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetServiceDetailResponse:
        """
        Description: 获取发布应用详情
        Summary: 获取发布应用详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetServiceDetailResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.service.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_meta_cell(
        self,
        request: deps_models.CreateMetaCellRequest,
    ) -> deps_models.CreateMetaCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_meta_cell_ex(request, headers, runtime)

    async def create_meta_cell_async(
        self,
        request: deps_models.CreateMetaCellRequest,
    ) -> deps_models.CreateMetaCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_meta_cell_ex_async(request, headers, runtime)

    def create_meta_cell_ex(
        self,
        request: deps_models.CreateMetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateMetaCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        UtilClient.validate_model(request)
        return deps_models.CreateMetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_meta_cell_ex_async(
        self,
        request: deps_models.CreateMetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateMetaCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        UtilClient.validate_model(request)
        return deps_models.CreateMetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_meta_cell(
        self,
        request: deps_models.UpdateMetaCellRequest,
    ) -> deps_models.UpdateMetaCellResponse:
        """
        Description: update cell
        Summary: update cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_meta_cell_ex(request, headers, runtime)

    async def update_meta_cell_async(
        self,
        request: deps_models.UpdateMetaCellRequest,
    ) -> deps_models.UpdateMetaCellResponse:
        """
        Description: update cell
        Summary: update cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_meta_cell_ex_async(request, headers, runtime)

    def update_meta_cell_ex(
        self,
        request: deps_models.UpdateMetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMetaCellResponse:
        """
        Description: update cell
        Summary: update cell
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMetaCellResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_meta_cell_ex_async(
        self,
        request: deps_models.UpdateMetaCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateMetaCellResponse:
        """
        Description: update cell
        Summary: update cell
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateMetaCellResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_meta_masterzonerel(
        self,
        request: deps_models.AddMetaMasterzonerelRequest,
    ) -> deps_models.AddMetaMasterzonerelResponse:
        """
        Description: 关联 master zone
        Summary: 关联 master zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_meta_masterzonerel_ex(request, headers, runtime)

    async def add_meta_masterzonerel_async(
        self,
        request: deps_models.AddMetaMasterzonerelRequest,
    ) -> deps_models.AddMetaMasterzonerelResponse:
        """
        Description: 关联 master zone
        Summary: 关联 master zone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_meta_masterzonerel_ex_async(request, headers, runtime)

    def add_meta_masterzonerel_ex(
        self,
        request: deps_models.AddMetaMasterzonerelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AddMetaMasterzonerelResponse:
        """
        Description: 关联 master zone
        Summary: 关联 master zone
        """
        UtilClient.validate_model(request)
        return deps_models.AddMetaMasterzonerelResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.meta.masterzonerel.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_meta_masterzonerel_ex_async(
        self,
        request: deps_models.AddMetaMasterzonerelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AddMetaMasterzonerelResponse:
        """
        Description: 关联 master zone
        Summary: 关联 master zone
        """
        UtilClient.validate_model(request)
        return deps_models.AddMetaMasterzonerelResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.meta.masterzonerel.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def assign_computer(
        self,
        request: deps_models.AssignComputerRequest,
    ) -> deps_models.AssignComputerResponse:
        """
        Description: 分配指定的一个或者多个计算资源到指定的应用
        Summary: 分配应用计算资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.assign_computer_ex(request, headers, runtime)

    async def assign_computer_async(
        self,
        request: deps_models.AssignComputerRequest,
    ) -> deps_models.AssignComputerResponse:
        """
        Description: 分配指定的一个或者多个计算资源到指定的应用
        Summary: 分配应用计算资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.assign_computer_ex_async(request, headers, runtime)

    def assign_computer_ex(
        self,
        request: deps_models.AssignComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AssignComputerResponse:
        """
        Description: 分配指定的一个或者多个计算资源到指定的应用
        Summary: 分配应用计算资源
        """
        UtilClient.validate_model(request)
        return deps_models.AssignComputerResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computer.assign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def assign_computer_ex_async(
        self,
        request: deps_models.AssignComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.AssignComputerResponse:
        """
        Description: 分配指定的一个或者多个计算资源到指定的应用
        Summary: 分配应用计算资源
        """
        UtilClient.validate_model(request)
        return deps_models.AssignComputerResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computer.assign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def release_computer(
        self,
        request: deps_models.ReleaseComputerRequest,
    ) -> deps_models.ReleaseComputerResponse:
        """
        Description: 从指定应用释放一个或者多个计算资源
        Summary: 释放应用计算资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.release_computer_ex(request, headers, runtime)

    async def release_computer_async(
        self,
        request: deps_models.ReleaseComputerRequest,
    ) -> deps_models.ReleaseComputerResponse:
        """
        Description: 从指定应用释放一个或者多个计算资源
        Summary: 释放应用计算资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.release_computer_ex_async(request, headers, runtime)

    def release_computer_ex(
        self,
        request: deps_models.ReleaseComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReleaseComputerResponse:
        """
        Description: 从指定应用释放一个或者多个计算资源
        Summary: 释放应用计算资源
        """
        UtilClient.validate_model(request)
        return deps_models.ReleaseComputerResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computer.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def release_computer_ex_async(
        self,
        request: deps_models.ReleaseComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ReleaseComputerResponse:
        """
        Description: 从指定应用释放一个或者多个计算资源
        Summary: 释放应用计算资源
        """
        UtilClient.validate_model(request)
        return deps_models.ReleaseComputerResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computer.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_task(
        self,
        request: deps_models.GetTaskRequest,
    ) -> deps_models.GetTaskResponse:
        """
        Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
        Summary: 获取异步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_task_ex(request, headers, runtime)

    async def get_task_async(
        self,
        request: deps_models.GetTaskRequest,
    ) -> deps_models.GetTaskResponse:
        """
        Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
        Summary: 获取异步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_task_ex_async(request, headers, runtime)

    def get_task_ex(
        self,
        request: deps_models.GetTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetTaskResponse:
        """
        Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
        Summary: 获取异步任务
        """
        UtilClient.validate_model(request)
        return deps_models.GetTaskResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_task_ex_async(
        self,
        request: deps_models.GetTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetTaskResponse:
        """
        Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
        Summary: 获取异步任务
        """
        UtilClient.validate_model(request)
        return deps_models.GetTaskResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.task.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_computer(
        self,
        request: deps_models.CreateComputerRequest,
    ) -> deps_models.CreateComputerResponse:
        """
        Description: 创建 ecs 实例
        Summary: 创建 ecs 实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_computer_ex(request, headers, runtime)

    async def create_computer_async(
        self,
        request: deps_models.CreateComputerRequest,
    ) -> deps_models.CreateComputerResponse:
        """
        Description: 创建 ecs 实例
        Summary: 创建 ecs 实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_computer_ex_async(request, headers, runtime)

    def create_computer_ex(
        self,
        request: deps_models.CreateComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateComputerResponse:
        """
        Description: 创建 ecs 实例
        Summary: 创建 ecs 实例
        """
        UtilClient.validate_model(request)
        return deps_models.CreateComputerResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.computer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_computer_ex_async(
        self,
        request: deps_models.CreateComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateComputerResponse:
        """
        Description: 创建 ecs 实例
        Summary: 创建 ecs 实例
        """
        UtilClient.validate_model(request)
        return deps_models.CreateComputerResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.computer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sidecar(
        self,
        request: deps_models.CreateSidecarRequest,
    ) -> deps_models.CreateSidecarResponse:
        """
        Description: 创建sidecar元数据信息
        Summary: 创建sidecar元数据信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sidecar_ex(request, headers, runtime)

    async def create_sidecar_async(
        self,
        request: deps_models.CreateSidecarRequest,
    ) -> deps_models.CreateSidecarResponse:
        """
        Description: 创建sidecar元数据信息
        Summary: 创建sidecar元数据信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sidecar_ex_async(request, headers, runtime)

    def create_sidecar_ex(
        self,
        request: deps_models.CreateSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarResponse:
        """
        Description: 创建sidecar元数据信息
        Summary: 创建sidecar元数据信息
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sidecar_ex_async(
        self,
        request: deps_models.CreateSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarResponse:
        """
        Description: 创建sidecar元数据信息
        Summary: 创建sidecar元数据信息
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecar(
        self,
        request: deps_models.ListSidecarRequest,
    ) -> deps_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecar_ex(request, headers, runtime)

    async def list_sidecar_async(
        self,
        request: deps_models.ListSidecarRequest,
    ) -> deps_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecar_ex_async(request, headers, runtime)

    def list_sidecar_ex(
        self,
        request: deps_models.ListSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecar_ex_async(
        self,
        request: deps_models.ListSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sidecar_version(
        self,
        request: deps_models.CreateSidecarVersionRequest,
    ) -> deps_models.CreateSidecarVersionResponse:
        """
        Description: 创建sidecar模板
        Summary: 创建sidecar版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sidecar_version_ex(request, headers, runtime)

    async def create_sidecar_version_async(
        self,
        request: deps_models.CreateSidecarVersionRequest,
    ) -> deps_models.CreateSidecarVersionResponse:
        """
        Description: 创建sidecar模板
        Summary: 创建sidecar版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sidecar_version_ex_async(request, headers, runtime)

    def create_sidecar_version_ex(
        self,
        request: deps_models.CreateSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarVersionResponse:
        """
        Description: 创建sidecar模板
        Summary: 创建sidecar版本
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.version.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sidecar_version_ex_async(
        self,
        request: deps_models.CreateSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarVersionResponse:
        """
        Description: 创建sidecar模板
        Summary: 创建sidecar版本
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.version.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecar_version(
        self,
        request: deps_models.ListSidecarVersionRequest,
    ) -> deps_models.ListSidecarVersionResponse:
        """
        Description: 查询sidecar模板列表
        Summary: 查询sidecar模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecar_version_ex(request, headers, runtime)

    async def list_sidecar_version_async(
        self,
        request: deps_models.ListSidecarVersionRequest,
    ) -> deps_models.ListSidecarVersionResponse:
        """
        Description: 查询sidecar模板列表
        Summary: 查询sidecar模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecar_version_ex_async(request, headers, runtime)

    def list_sidecar_version_ex(
        self,
        request: deps_models.ListSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarVersionResponse:
        """
        Description: 查询sidecar模板列表
        Summary: 查询sidecar模板列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.version.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecar_version_ex_async(
        self,
        request: deps_models.ListSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarVersionResponse:
        """
        Description: 查询sidecar模板列表
        Summary: 查询sidecar模板列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.version.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sidecar_version(
        self,
        request: deps_models.GetSidecarVersionRequest,
    ) -> deps_models.GetSidecarVersionResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 获取sidecar版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sidecar_version_ex(request, headers, runtime)

    async def get_sidecar_version_async(
        self,
        request: deps_models.GetSidecarVersionRequest,
    ) -> deps_models.GetSidecarVersionResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 获取sidecar版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sidecar_version_ex_async(request, headers, runtime)

    def get_sidecar_version_ex(
        self,
        request: deps_models.GetSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarVersionResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 获取sidecar版本详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.version.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sidecar_version_ex_async(
        self,
        request: deps_models.GetSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarVersionResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 获取sidecar版本详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.version.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sidecar_rule(
        self,
        request: deps_models.CreateSidecarRuleRequest,
    ) -> deps_models.CreateSidecarRuleResponse:
        """
        Description: 创建sidecar规则
        Summary: 创建sidecar规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sidecar_rule_ex(request, headers, runtime)

    async def create_sidecar_rule_async(
        self,
        request: deps_models.CreateSidecarRuleRequest,
    ) -> deps_models.CreateSidecarRuleResponse:
        """
        Description: 创建sidecar规则
        Summary: 创建sidecar规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sidecar_rule_ex_async(request, headers, runtime)

    def create_sidecar_rule_ex(
        self,
        request: deps_models.CreateSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarRuleResponse:
        """
        Description: 创建sidecar规则
        Summary: 创建sidecar规则
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.rule.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sidecar_rule_ex_async(
        self,
        request: deps_models.CreateSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarRuleResponse:
        """
        Description: 创建sidecar规则
        Summary: 创建sidecar规则
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.rule.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sidecar_rule(
        self,
        request: deps_models.GetSidecarRuleRequest,
    ) -> deps_models.GetSidecarRuleResponse:
        """
        Description: 获取sidecar单个规则详情
        Summary: 获取sidecar单个规则详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sidecar_rule_ex(request, headers, runtime)

    async def get_sidecar_rule_async(
        self,
        request: deps_models.GetSidecarRuleRequest,
    ) -> deps_models.GetSidecarRuleResponse:
        """
        Description: 获取sidecar单个规则详情
        Summary: 获取sidecar单个规则详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sidecar_rule_ex_async(request, headers, runtime)

    def get_sidecar_rule_ex(
        self,
        request: deps_models.GetSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarRuleResponse:
        """
        Description: 获取sidecar单个规则详情
        Summary: 获取sidecar单个规则详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sidecar_rule_ex_async(
        self,
        request: deps_models.GetSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarRuleResponse:
        """
        Description: 获取sidecar单个规则详情
        Summary: 获取sidecar单个规则详情
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecar_rule(
        self,
        request: deps_models.ListSidecarRuleRequest,
    ) -> deps_models.ListSidecarRuleResponse:
        """
        Description: 获取sidecar规则列表
        Summary: 获取sidecar规则列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecar_rule_ex(request, headers, runtime)

    async def list_sidecar_rule_async(
        self,
        request: deps_models.ListSidecarRuleRequest,
    ) -> deps_models.ListSidecarRuleResponse:
        """
        Description: 获取sidecar规则列表
        Summary: 获取sidecar规则列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecar_rule_ex_async(request, headers, runtime)

    def list_sidecar_rule_ex(
        self,
        request: deps_models.ListSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarRuleResponse:
        """
        Description: 获取sidecar规则列表
        Summary: 获取sidecar规则列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.rule.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecar_rule_ex_async(
        self,
        request: deps_models.ListSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarRuleResponse:
        """
        Description: 获取sidecar规则列表
        Summary: 获取sidecar规则列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.rule.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sidecar_instance(
        self,
        request: deps_models.CreateSidecarInstanceRequest,
    ) -> deps_models.CreateSidecarInstanceResponse:
        """
        Description: 创建sidecar版本实例
        Summary: 创建sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sidecar_instance_ex(request, headers, runtime)

    async def create_sidecar_instance_async(
        self,
        request: deps_models.CreateSidecarInstanceRequest,
    ) -> deps_models.CreateSidecarInstanceResponse:
        """
        Description: 创建sidecar版本实例
        Summary: 创建sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sidecar_instance_ex_async(request, headers, runtime)

    def create_sidecar_instance_ex(
        self,
        request: deps_models.CreateSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarInstanceResponse:
        """
        Description: 创建sidecar版本实例
        Summary: 创建sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarInstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.instance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sidecar_instance_ex_async(
        self,
        request: deps_models.CreateSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateSidecarInstanceResponse:
        """
        Description: 创建sidecar版本实例
        Summary: 创建sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.CreateSidecarInstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.instance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecar_instance(
        self,
        request: deps_models.ListSidecarInstanceRequest,
    ) -> deps_models.ListSidecarInstanceResponse:
        """
        Description: 查询sidecar版本实例列表
        Summary: 查询sidecar版本实例列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecar_instance_ex(request, headers, runtime)

    async def list_sidecar_instance_async(
        self,
        request: deps_models.ListSidecarInstanceRequest,
    ) -> deps_models.ListSidecarInstanceResponse:
        """
        Description: 查询sidecar版本实例列表
        Summary: 查询sidecar版本实例列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecar_instance_ex_async(request, headers, runtime)

    def list_sidecar_instance_ex(
        self,
        request: deps_models.ListSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarInstanceResponse:
        """
        Description: 查询sidecar版本实例列表
        Summary: 查询sidecar版本实例列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarInstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecar_instance_ex_async(
        self,
        request: deps_models.ListSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListSidecarInstanceResponse:
        """
        Description: 查询sidecar版本实例列表
        Summary: 查询sidecar版本实例列表
        """
        UtilClient.validate_model(request)
        return deps_models.ListSidecarInstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sidecar_instance(
        self,
        request: deps_models.GetSidecarInstanceRequest,
    ) -> deps_models.GetSidecarInstanceResponse:
        """
        Description: 获取sidecar版本实例
        Summary: 获取sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sidecar_instance_ex(request, headers, runtime)

    async def get_sidecar_instance_async(
        self,
        request: deps_models.GetSidecarInstanceRequest,
    ) -> deps_models.GetSidecarInstanceResponse:
        """
        Description: 获取sidecar版本实例
        Summary: 获取sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sidecar_instance_ex_async(request, headers, runtime)

    def get_sidecar_instance_ex(
        self,
        request: deps_models.GetSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarInstanceResponse:
        """
        Description: 获取sidecar版本实例
        Summary: 获取sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarInstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sidecar_instance_ex_async(
        self,
        request: deps_models.GetSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarInstanceResponse:
        """
        Description: 获取sidecar版本实例
        Summary: 获取sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarInstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sidecar(
        self,
        request: deps_models.GetSidecarRequest,
    ) -> deps_models.GetSidecarResponse:
        """
        Description: 获取sidecar类型
        Summary: 获取sidecar类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sidecar_ex(request, headers, runtime)

    async def get_sidecar_async(
        self,
        request: deps_models.GetSidecarRequest,
    ) -> deps_models.GetSidecarResponse:
        """
        Description: 获取sidecar类型
        Summary: 获取sidecar类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sidecar_ex_async(request, headers, runtime)

    def get_sidecar_ex(
        self,
        request: deps_models.GetSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarResponse:
        """
        Description: 获取sidecar类型
        Summary: 获取sidecar类型
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sidecar_ex_async(
        self,
        request: deps_models.GetSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetSidecarResponse:
        """
        Description: 获取sidecar类型
        Summary: 获取sidecar类型
        """
        UtilClient.validate_model(request)
        return deps_models.GetSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar(
        self,
        request: deps_models.UpdateSidecarRequest,
    ) -> deps_models.UpdateSidecarResponse:
        """
        Description: 更新sidecar类型信息
        Summary: 更新sidecar类型信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_ex(request, headers, runtime)

    async def update_sidecar_async(
        self,
        request: deps_models.UpdateSidecarRequest,
    ) -> deps_models.UpdateSidecarResponse:
        """
        Description: 更新sidecar类型信息
        Summary: 更新sidecar类型信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_ex_async(request, headers, runtime)

    def update_sidecar_ex(
        self,
        request: deps_models.UpdateSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarResponse:
        """
        Description: 更新sidecar类型信息
        Summary: 更新sidecar类型信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_ex_async(
        self,
        request: deps_models.UpdateSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarResponse:
        """
        Description: 更新sidecar类型信息
        Summary: 更新sidecar类型信息
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sidecar(
        self,
        request: deps_models.DeleteSidecarRequest,
    ) -> deps_models.DeleteSidecarResponse:
        """
        Description: 删除sidecar类型
        Summary: 删除sidecar类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sidecar_ex(request, headers, runtime)

    async def delete_sidecar_async(
        self,
        request: deps_models.DeleteSidecarRequest,
    ) -> deps_models.DeleteSidecarResponse:
        """
        Description: 删除sidecar类型
        Summary: 删除sidecar类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sidecar_ex_async(request, headers, runtime)

    def delete_sidecar_ex(
        self,
        request: deps_models.DeleteSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarResponse:
        """
        Description: 删除sidecar类型
        Summary: 删除sidecar类型
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sidecar_ex_async(
        self,
        request: deps_models.DeleteSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarResponse:
        """
        Description: 删除sidecar类型
        Summary: 删除sidecar类型
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar_version(
        self,
        request: deps_models.UpdateSidecarVersionRequest,
    ) -> deps_models.UpdateSidecarVersionResponse:
        """
        Description: 更新sidecar版本
        Summary: 更新sidecar版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_version_ex(request, headers, runtime)

    async def update_sidecar_version_async(
        self,
        request: deps_models.UpdateSidecarVersionRequest,
    ) -> deps_models.UpdateSidecarVersionResponse:
        """
        Description: 更新sidecar版本
        Summary: 更新sidecar版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_version_ex_async(request, headers, runtime)

    def update_sidecar_version_ex(
        self,
        request: deps_models.UpdateSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarVersionResponse:
        """
        Description: 更新sidecar版本
        Summary: 更新sidecar版本
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.version.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_version_ex_async(
        self,
        request: deps_models.UpdateSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarVersionResponse:
        """
        Description: 更新sidecar版本
        Summary: 更新sidecar版本
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.version.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sidecar_version(
        self,
        request: deps_models.DeleteSidecarVersionRequest,
    ) -> deps_models.DeleteSidecarVersionResponse:
        """
        Description: 删除sidecar模板
        Summary: 删除sidecar模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sidecar_version_ex(request, headers, runtime)

    async def delete_sidecar_version_async(
        self,
        request: deps_models.DeleteSidecarVersionRequest,
    ) -> deps_models.DeleteSidecarVersionResponse:
        """
        Description: 删除sidecar模板
        Summary: 删除sidecar模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sidecar_version_ex_async(request, headers, runtime)

    def delete_sidecar_version_ex(
        self,
        request: deps_models.DeleteSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarVersionResponse:
        """
        Description: 删除sidecar模板
        Summary: 删除sidecar模板
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarVersionResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.version.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sidecar_version_ex_async(
        self,
        request: deps_models.DeleteSidecarVersionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarVersionResponse:
        """
        Description: 删除sidecar模板
        Summary: 删除sidecar模板
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarVersionResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.version.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar_instance(
        self,
        request: deps_models.UpdateSidecarInstanceRequest,
    ) -> deps_models.UpdateSidecarInstanceResponse:
        """
        Description: 更新sidecar版本实例
        Summary: 更新sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_instance_ex(request, headers, runtime)

    async def update_sidecar_instance_async(
        self,
        request: deps_models.UpdateSidecarInstanceRequest,
    ) -> deps_models.UpdateSidecarInstanceResponse:
        """
        Description: 更新sidecar版本实例
        Summary: 更新sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_instance_ex_async(request, headers, runtime)

    def update_sidecar_instance_ex(
        self,
        request: deps_models.UpdateSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarInstanceResponse:
        """
        Description: 更新sidecar版本实例
        Summary: 更新sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarInstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_instance_ex_async(
        self,
        request: deps_models.UpdateSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarInstanceResponse:
        """
        Description: 更新sidecar版本实例
        Summary: 更新sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarInstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sidecar_instance(
        self,
        request: deps_models.DeleteSidecarInstanceRequest,
    ) -> deps_models.DeleteSidecarInstanceResponse:
        """
        Description: 删除sidecar版本实例
        Summary: 删除sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sidecar_instance_ex(request, headers, runtime)

    async def delete_sidecar_instance_async(
        self,
        request: deps_models.DeleteSidecarInstanceRequest,
    ) -> deps_models.DeleteSidecarInstanceResponse:
        """
        Description: 删除sidecar版本实例
        Summary: 删除sidecar版本实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sidecar_instance_ex_async(request, headers, runtime)

    def delete_sidecar_instance_ex(
        self,
        request: deps_models.DeleteSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarInstanceResponse:
        """
        Description: 删除sidecar版本实例
        Summary: 删除sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarInstanceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.instance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sidecar_instance_ex_async(
        self,
        request: deps_models.DeleteSidecarInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarInstanceResponse:
        """
        Description: 删除sidecar版本实例
        Summary: 删除sidecar版本实例
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarInstanceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.instance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar_rule(
        self,
        request: deps_models.UpdateSidecarRuleRequest,
    ) -> deps_models.UpdateSidecarRuleResponse:
        """
        Description: 更新sidecar规则
        Summary: 更新sidecar规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_rule_ex(request, headers, runtime)

    async def update_sidecar_rule_async(
        self,
        request: deps_models.UpdateSidecarRuleRequest,
    ) -> deps_models.UpdateSidecarRuleResponse:
        """
        Description: 更新sidecar规则
        Summary: 更新sidecar规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_rule_ex_async(request, headers, runtime)

    def update_sidecar_rule_ex(
        self,
        request: deps_models.UpdateSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarRuleResponse:
        """
        Description: 更新sidecar规则
        Summary: 更新sidecar规则
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.rule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_rule_ex_async(
        self,
        request: deps_models.UpdateSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarRuleResponse:
        """
        Description: 更新sidecar规则
        Summary: 更新sidecar规则
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.rule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sidecar_rule(
        self,
        request: deps_models.DeleteSidecarRuleRequest,
    ) -> deps_models.DeleteSidecarRuleResponse:
        """
        Description: 删除sidecar规则
        Summary: 删除sidecar规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sidecar_rule_ex(request, headers, runtime)

    async def delete_sidecar_rule_async(
        self,
        request: deps_models.DeleteSidecarRuleRequest,
    ) -> deps_models.DeleteSidecarRuleResponse:
        """
        Description: 删除sidecar规则
        Summary: 删除sidecar规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sidecar_rule_ex_async(request, headers, runtime)

    def delete_sidecar_rule_ex(
        self,
        request: deps_models.DeleteSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarRuleResponse:
        """
        Description: 删除sidecar规则
        Summary: 删除sidecar规则
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarRuleResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.rule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sidecar_rule_ex_async(
        self,
        request: deps_models.DeleteSidecarRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteSidecarRuleResponse:
        """
        Description: 删除sidecar规则
        Summary: 删除sidecar规则
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteSidecarRuleResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.rule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar_versionstatus(
        self,
        request: deps_models.UpdateSidecarVersionstatusRequest,
    ) -> deps_models.UpdateSidecarVersionstatusResponse:
        """
        Description: 更新sidecar版本状态
        Summary: 更新sidecar版本状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_versionstatus_ex(request, headers, runtime)

    async def update_sidecar_versionstatus_async(
        self,
        request: deps_models.UpdateSidecarVersionstatusRequest,
    ) -> deps_models.UpdateSidecarVersionstatusResponse:
        """
        Description: 更新sidecar版本状态
        Summary: 更新sidecar版本状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_versionstatus_ex_async(request, headers, runtime)

    def update_sidecar_versionstatus_ex(
        self,
        request: deps_models.UpdateSidecarVersionstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarVersionstatusResponse:
        """
        Description: 更新sidecar版本状态
        Summary: 更新sidecar版本状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarVersionstatusResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.versionstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_versionstatus_ex_async(
        self,
        request: deps_models.UpdateSidecarVersionstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarVersionstatusResponse:
        """
        Description: 更新sidecar版本状态
        Summary: 更新sidecar版本状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarVersionstatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.versionstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar_instancestatus(
        self,
        request: deps_models.UpdateSidecarInstancestatusRequest,
    ) -> deps_models.UpdateSidecarInstancestatusResponse:
        """
        Description: 更新sidecar版本实例状态
        Summary: 更新sidecar版本实例状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_instancestatus_ex(request, headers, runtime)

    async def update_sidecar_instancestatus_async(
        self,
        request: deps_models.UpdateSidecarInstancestatusRequest,
    ) -> deps_models.UpdateSidecarInstancestatusResponse:
        """
        Description: 更新sidecar版本实例状态
        Summary: 更新sidecar版本实例状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_instancestatus_ex_async(request, headers, runtime)

    def update_sidecar_instancestatus_ex(
        self,
        request: deps_models.UpdateSidecarInstancestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarInstancestatusResponse:
        """
        Description: 更新sidecar版本实例状态
        Summary: 更新sidecar版本实例状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarInstancestatusResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.instancestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_instancestatus_ex_async(
        self,
        request: deps_models.UpdateSidecarInstancestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarInstancestatusResponse:
        """
        Description: 更新sidecar版本实例状态
        Summary: 更新sidecar版本实例状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarInstancestatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.instancestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecar_rulestatus(
        self,
        request: deps_models.UpdateSidecarRulestatusRequest,
    ) -> deps_models.UpdateSidecarRulestatusResponse:
        """
        Description: 更新sidecar规则状态
        Summary: 更新sidecar规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecar_rulestatus_ex(request, headers, runtime)

    async def update_sidecar_rulestatus_async(
        self,
        request: deps_models.UpdateSidecarRulestatusRequest,
    ) -> deps_models.UpdateSidecarRulestatusResponse:
        """
        Description: 更新sidecar规则状态
        Summary: 更新sidecar规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecar_rulestatus_ex_async(request, headers, runtime)

    def update_sidecar_rulestatus_ex(
        self,
        request: deps_models.UpdateSidecarRulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarRulestatusResponse:
        """
        Description: 更新sidecar规则状态
        Summary: 更新sidecar规则状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarRulestatusResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.sidecar.rulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecar_rulestatus_ex_async(
        self,
        request: deps_models.UpdateSidecarRulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateSidecarRulestatusResponse:
        """
        Description: 更新sidecar规则状态
        Summary: 更新sidecar规则状态
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateSidecarRulestatusResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.sidecar.rulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_appbaseline_sidecar(
        self,
        request: deps_models.CreateAppbaselineSidecarRequest,
    ) -> deps_models.CreateAppbaselineSidecarResponse:
        """
        Description: 创建应用sidecar基线
        Summary: 创建应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appbaseline_sidecar_ex(request, headers, runtime)

    async def create_appbaseline_sidecar_async(
        self,
        request: deps_models.CreateAppbaselineSidecarRequest,
    ) -> deps_models.CreateAppbaselineSidecarResponse:
        """
        Description: 创建应用sidecar基线
        Summary: 创建应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appbaseline_sidecar_ex_async(request, headers, runtime)

    def create_appbaseline_sidecar_ex(
        self,
        request: deps_models.CreateAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppbaselineSidecarResponse:
        """
        Description: 创建应用sidecar基线
        Summary: 创建应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppbaselineSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appbaseline.sidecar.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appbaseline_sidecar_ex_async(
        self,
        request: deps_models.CreateAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateAppbaselineSidecarResponse:
        """
        Description: 创建应用sidecar基线
        Summary: 创建应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.CreateAppbaselineSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appbaseline.sidecar.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appbaseline_sidecar(
        self,
        request: deps_models.ListAppbaselineSidecarRequest,
    ) -> deps_models.ListAppbaselineSidecarResponse:
        """
        Description: 查询应用sidecar基线
        Summary: 查询应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appbaseline_sidecar_ex(request, headers, runtime)

    async def list_appbaseline_sidecar_async(
        self,
        request: deps_models.ListAppbaselineSidecarRequest,
    ) -> deps_models.ListAppbaselineSidecarResponse:
        """
        Description: 查询应用sidecar基线
        Summary: 查询应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appbaseline_sidecar_ex_async(request, headers, runtime)

    def list_appbaseline_sidecar_ex(
        self,
        request: deps_models.ListAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListAppbaselineSidecarResponse:
        """
        Description: 查询应用sidecar基线
        Summary: 查询应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.ListAppbaselineSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appbaseline.sidecar.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appbaseline_sidecar_ex_async(
        self,
        request: deps_models.ListAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListAppbaselineSidecarResponse:
        """
        Description: 查询应用sidecar基线
        Summary: 查询应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.ListAppbaselineSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appbaseline.sidecar.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_appbaseline_sidecar(
        self,
        request: deps_models.DeleteAppbaselineSidecarRequest,
    ) -> deps_models.DeleteAppbaselineSidecarResponse:
        """
        Description: 删除应用sidecar基线
        Summary: 删除应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_appbaseline_sidecar_ex(request, headers, runtime)

    async def delete_appbaseline_sidecar_async(
        self,
        request: deps_models.DeleteAppbaselineSidecarRequest,
    ) -> deps_models.DeleteAppbaselineSidecarResponse:
        """
        Description: 删除应用sidecar基线
        Summary: 删除应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_appbaseline_sidecar_ex_async(request, headers, runtime)

    def delete_appbaseline_sidecar_ex(
        self,
        request: deps_models.DeleteAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppbaselineSidecarResponse:
        """
        Description: 删除应用sidecar基线
        Summary: 删除应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppbaselineSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appbaseline.sidecar.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_appbaseline_sidecar_ex_async(
        self,
        request: deps_models.DeleteAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.DeleteAppbaselineSidecarResponse:
        """
        Description: 删除应用sidecar基线
        Summary: 删除应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.DeleteAppbaselineSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appbaseline.sidecar.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_appbaseline_sidecar(
        self,
        request: deps_models.UpdateAppbaselineSidecarRequest,
    ) -> deps_models.UpdateAppbaselineSidecarResponse:
        """
        Description: 更新应用sidecar基线
        Summary: 更新应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_appbaseline_sidecar_ex(request, headers, runtime)

    async def update_appbaseline_sidecar_async(
        self,
        request: deps_models.UpdateAppbaselineSidecarRequest,
    ) -> deps_models.UpdateAppbaselineSidecarResponse:
        """
        Description: 更新应用sidecar基线
        Summary: 更新应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_appbaseline_sidecar_ex_async(request, headers, runtime)

    def update_appbaseline_sidecar_ex(
        self,
        request: deps_models.UpdateAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppbaselineSidecarResponse:
        """
        Description: 更新应用sidecar基线
        Summary: 更新应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppbaselineSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appbaseline.sidecar.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_appbaseline_sidecar_ex_async(
        self,
        request: deps_models.UpdateAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.UpdateAppbaselineSidecarResponse:
        """
        Description: 更新应用sidecar基线
        Summary: 更新应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.UpdateAppbaselineSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appbaseline.sidecar.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_appbaseline_sidecar(
        self,
        request: deps_models.SaveAppbaselineSidecarRequest,
    ) -> deps_models.SaveAppbaselineSidecarResponse:
        """
        Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
        Summary: 创建或更新应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_appbaseline_sidecar_ex(request, headers, runtime)

    async def save_appbaseline_sidecar_async(
        self,
        request: deps_models.SaveAppbaselineSidecarRequest,
    ) -> deps_models.SaveAppbaselineSidecarResponse:
        """
        Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
        Summary: 创建或更新应用sidecar基线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_appbaseline_sidecar_ex_async(request, headers, runtime)

    def save_appbaseline_sidecar_ex(
        self,
        request: deps_models.SaveAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SaveAppbaselineSidecarResponse:
        """
        Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
        Summary: 创建或更新应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.SaveAppbaselineSidecarResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.appbaseline.sidecar.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_appbaseline_sidecar_ex_async(
        self,
        request: deps_models.SaveAppbaselineSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.SaveAppbaselineSidecarResponse:
        """
        Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
        Summary: 创建或更新应用sidecar基线
        """
        UtilClient.validate_model(request)
        return deps_models.SaveAppbaselineSidecarResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.appbaseline.sidecar.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspace(
        self,
        request: deps_models.GetWorkspaceRequest,
    ) -> deps_models.GetWorkspaceResponse:
        """
        Description: 查询workspace详情
        Summary: 获取workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspace_ex(request, headers, runtime)

    async def get_workspace_async(
        self,
        request: deps_models.GetWorkspaceRequest,
    ) -> deps_models.GetWorkspaceResponse:
        """
        Description: 查询workspace详情
        Summary: 获取workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspace_ex_async(request, headers, runtime)

    def get_workspace_ex(
        self,
        request: deps_models.GetWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetWorkspaceResponse:
        """
        Description: 查询workspace详情
        Summary: 获取workspace
        """
        UtilClient.validate_model(request)
        return deps_models.GetWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspace_ex_async(
        self,
        request: deps_models.GetWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.GetWorkspaceResponse:
        """
        Description: 查询workspace详情
        Summary: 获取workspace
        """
        UtilClient.validate_model(request)
        return deps_models.GetWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_workspace(
        self,
        request: deps_models.QueryWorkspaceRequest,
    ) -> deps_models.QueryWorkspaceResponse:
        """
        Description: 查询workspace列表，可根据状态过滤。
        Summary: 查询workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_workspace_ex(request, headers, runtime)

    async def query_workspace_async(
        self,
        request: deps_models.QueryWorkspaceRequest,
    ) -> deps_models.QueryWorkspaceResponse:
        """
        Description: 查询workspace列表，可根据状态过滤。
        Summary: 查询workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_workspace_ex_async(request, headers, runtime)

    def query_workspace_ex(
        self,
        request: deps_models.QueryWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryWorkspaceResponse:
        """
        Description: 查询workspace列表，可根据状态过滤。
        Summary: 查询workspace
        """
        UtilClient.validate_model(request)
        return deps_models.QueryWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_workspace_ex_async(
        self,
        request: deps_models.QueryWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.QueryWorkspaceResponse:
        """
        Description: 查询workspace列表，可根据状态过滤。
        Summary: 查询workspace
        """
        UtilClient.validate_model(request)
        return deps_models.QueryWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_workspace(
        self,
        request: deps_models.CreateWorkspaceRequest,
    ) -> deps_models.CreateWorkspaceResponse:
        """
        Description: 创建workspace
        Summary: 创建workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_workspace_ex(request, headers, runtime)

    async def create_workspace_async(
        self,
        request: deps_models.CreateWorkspaceRequest,
    ) -> deps_models.CreateWorkspaceResponse:
        """
        Description: 创建workspace
        Summary: 创建workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_workspace_ex_async(request, headers, runtime)

    def create_workspace_ex(
        self,
        request: deps_models.CreateWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateWorkspaceResponse:
        """
        Description: 创建workspace
        Summary: 创建workspace
        """
        UtilClient.validate_model(request)
        return deps_models.CreateWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_workspace_ex_async(
        self,
        request: deps_models.CreateWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.CreateWorkspaceResponse:
        """
        Description: 创建workspace
        Summary: 创建workspace
        """
        UtilClient.validate_model(request)
        return deps_models.CreateWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_workspace(
        self,
        request: deps_models.ListWorkspaceRequest,
    ) -> deps_models.ListWorkspaceResponse:
        """
        Description: 查询workspace列表2.0。
        Summary: 查询workspace列表2.0
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_workspace_ex(request, headers, runtime)

    async def list_workspace_async(
        self,
        request: deps_models.ListWorkspaceRequest,
    ) -> deps_models.ListWorkspaceResponse:
        """
        Description: 查询workspace列表2.0。
        Summary: 查询workspace列表2.0
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_workspace_ex_async(request, headers, runtime)

    def list_workspace_ex(
        self,
        request: deps_models.ListWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListWorkspaceResponse:
        """
        Description: 查询workspace列表2.0。
        Summary: 查询workspace列表2.0
        """
        UtilClient.validate_model(request)
        return deps_models.ListWorkspaceResponse().from_map(
            self.do_request('1.0', 'antcloud.deps.workspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_workspace_ex_async(
        self,
        request: deps_models.ListWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> deps_models.ListWorkspaceResponse:
        """
        Description: 查询workspace列表2.0。
        Summary: 查询workspace列表2.0
        """
        UtilClient.validate_model(request)
        return deps_models.ListWorkspaceResponse().from_map(
            await self.do_request_async('1.0', 'antcloud.deps.workspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
