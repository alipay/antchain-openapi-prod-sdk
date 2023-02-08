# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_cas import models as cas_models
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
        config: cas_models.Config,
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
            # 资源所属的App
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
                    'sdk_version': '1.4.59'
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
            # 资源所属的App
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
                    'sdk_version': '1.4.59'
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

    def batchdelete_application_build(
        self,
        request: cas_models.BatchdeleteApplicationBuildRequest,
    ) -> cas_models.BatchdeleteApplicationBuildResponse:
        """
        Description: 批量删除构建记录
        Summary: 批量删除构建记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_application_build_ex(request, headers, runtime)

    async def batchdelete_application_build_async(
        self,
        request: cas_models.BatchdeleteApplicationBuildRequest,
    ) -> cas_models.BatchdeleteApplicationBuildResponse:
        """
        Description: 批量删除构建记录
        Summary: 批量删除构建记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_application_build_ex_async(request, headers, runtime)

    def batchdelete_application_build_ex(
        self,
        request: cas_models.BatchdeleteApplicationBuildRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchdeleteApplicationBuildResponse:
        """
        Description: 批量删除构建记录
        Summary: 批量删除构建记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchdeleteApplicationBuildResponse(),
            self.do_request('1.0', 'antcloud.cas.application.build.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_application_build_ex_async(
        self,
        request: cas_models.BatchdeleteApplicationBuildRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchdeleteApplicationBuildResponse:
        """
        Description: 批量删除构建记录
        Summary: 批量删除构建记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchdeleteApplicationBuildResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.build.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_application_manifest(
        self,
        request: cas_models.ListApplicationManifestRequest,
    ) -> cas_models.ListApplicationManifestResponse:
        """
        Description: 批量查询应用明细
        Summary: 批量查询应用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_application_manifest_ex(request, headers, runtime)

    async def list_application_manifest_async(
        self,
        request: cas_models.ListApplicationManifestRequest,
    ) -> cas_models.ListApplicationManifestResponse:
        """
        Description: 批量查询应用明细
        Summary: 批量查询应用明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_application_manifest_ex_async(request, headers, runtime)

    def list_application_manifest_ex(
        self,
        request: cas_models.ListApplicationManifestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplicationManifestResponse:
        """
        Description: 批量查询应用明细
        Summary: 批量查询应用明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplicationManifestResponse(),
            self.do_request('1.0', 'antcloud.cas.application.manifest.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_application_manifest_ex_async(
        self,
        request: cas_models.ListApplicationManifestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplicationManifestResponse:
        """
        Description: 批量查询应用明细
        Summary: 批量查询应用明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplicationManifestResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.manifest.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_application_package(
        self,
        request: cas_models.BatchdeleteApplicationPackageRequest,
    ) -> cas_models.BatchdeleteApplicationPackageResponse:
        """
        Description: 批量删除应用发布包
        Summary: 批量删除应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_application_package_ex(request, headers, runtime)

    async def batchdelete_application_package_async(
        self,
        request: cas_models.BatchdeleteApplicationPackageRequest,
    ) -> cas_models.BatchdeleteApplicationPackageResponse:
        """
        Description: 批量删除应用发布包
        Summary: 批量删除应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_application_package_ex_async(request, headers, runtime)

    def batchdelete_application_package_ex(
        self,
        request: cas_models.BatchdeleteApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchdeleteApplicationPackageResponse:
        """
        Description: 批量删除应用发布包
        Summary: 批量删除应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchdeleteApplicationPackageResponse(),
            self.do_request('1.0', 'antcloud.cas.application.package.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_application_package_ex_async(
        self,
        request: cas_models.BatchdeleteApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchdeleteApplicationPackageResponse:
        """
        Description: 批量删除应用发布包
        Summary: 批量删除应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchdeleteApplicationPackageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.package.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_application_package(
        self,
        request: cas_models.CreateApplicationPackageRequest,
    ) -> cas_models.CreateApplicationPackageResponse:
        """
        Description: 创建应用发布包
        Summary: 创建应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_application_package_ex(request, headers, runtime)

    async def create_application_package_async(
        self,
        request: cas_models.CreateApplicationPackageRequest,
    ) -> cas_models.CreateApplicationPackageResponse:
        """
        Description: 创建应用发布包
        Summary: 创建应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_application_package_ex_async(request, headers, runtime)

    def create_application_package_ex(
        self,
        request: cas_models.CreateApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateApplicationPackageResponse:
        """
        Description: 创建应用发布包
        Summary: 创建应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateApplicationPackageResponse(),
            self.do_request('1.0', 'antcloud.cas.application.package.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_application_package_ex_async(
        self,
        request: cas_models.CreateApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateApplicationPackageResponse:
        """
        Description: 创建应用发布包
        Summary: 创建应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateApplicationPackageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.package.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_application_package(
        self,
        request: cas_models.DeleteApplicationPackageRequest,
    ) -> cas_models.DeleteApplicationPackageResponse:
        """
        Description: 删除应用发布包
        Summary: 删除应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_application_package_ex(request, headers, runtime)

    async def delete_application_package_async(
        self,
        request: cas_models.DeleteApplicationPackageRequest,
    ) -> cas_models.DeleteApplicationPackageResponse:
        """
        Description: 删除应用发布包
        Summary: 删除应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_application_package_ex_async(request, headers, runtime)

    def delete_application_package_ex(
        self,
        request: cas_models.DeleteApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteApplicationPackageResponse:
        """
        Description: 删除应用发布包
        Summary: 删除应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteApplicationPackageResponse(),
            self.do_request('1.0', 'antcloud.cas.application.package.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_application_package_ex_async(
        self,
        request: cas_models.DeleteApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteApplicationPackageResponse:
        """
        Description: 删除应用发布包
        Summary: 删除应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteApplicationPackageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.package.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_application_package(
        self,
        request: cas_models.ListApplicationPackageRequest,
    ) -> cas_models.ListApplicationPackageResponse:
        """
        Description: 批量获取应用发布包
        Summary: 批量获取应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_application_package_ex(request, headers, runtime)

    async def list_application_package_async(
        self,
        request: cas_models.ListApplicationPackageRequest,
    ) -> cas_models.ListApplicationPackageResponse:
        """
        Description: 批量获取应用发布包
        Summary: 批量获取应用发布包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_application_package_ex_async(request, headers, runtime)

    def list_application_package_ex(
        self,
        request: cas_models.ListApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplicationPackageResponse:
        """
        Description: 批量获取应用发布包
        Summary: 批量获取应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplicationPackageResponse(),
            self.do_request('1.0', 'antcloud.cas.application.package.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_application_package_ex_async(
        self,
        request: cas_models.ListApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplicationPackageResponse:
        """
        Description: 批量获取应用发布包
        Summary: 批量获取应用发布包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplicationPackageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.package.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_application_packageconfig(
        self,
        request: cas_models.UploadApplicationPackageconfigRequest,
    ) -> cas_models.UploadApplicationPackageconfigResponse:
        """
        Description: 获取上传应用发布包下载配置
        Summary: 获取上传应用发布包下载配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_application_packageconfig_ex(request, headers, runtime)

    async def upload_application_packageconfig_async(
        self,
        request: cas_models.UploadApplicationPackageconfigRequest,
    ) -> cas_models.UploadApplicationPackageconfigResponse:
        """
        Description: 获取上传应用发布包下载配置
        Summary: 获取上传应用发布包下载配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_application_packageconfig_ex_async(request, headers, runtime)

    def upload_application_packageconfig_ex(
        self,
        request: cas_models.UploadApplicationPackageconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UploadApplicationPackageconfigResponse:
        """
        Description: 获取上传应用发布包下载配置
        Summary: 获取上传应用发布包下载配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UploadApplicationPackageconfigResponse(),
            self.do_request('1.0', 'antcloud.cas.application.packageconfig.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_application_packageconfig_ex_async(
        self,
        request: cas_models.UploadApplicationPackageconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UploadApplicationPackageconfigResponse:
        """
        Description: 获取上传应用发布包下载配置
        Summary: 获取上传应用发布包下载配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UploadApplicationPackageconfigResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.packageconfig.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appservice_cell(
        self,
        request: cas_models.ListAppserviceCellRequest,
    ) -> cas_models.ListAppserviceCellResponse:
        """
        Description: 批量获取应用实例的 cell
        Summary: 批量获取应用实例的 cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appservice_cell_ex(request, headers, runtime)

    async def list_appservice_cell_async(
        self,
        request: cas_models.ListAppserviceCellRequest,
    ) -> cas_models.ListAppserviceCellResponse:
        """
        Description: 批量获取应用实例的 cell
        Summary: 批量获取应用实例的 cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appservice_cell_ex_async(request, headers, runtime)

    def list_appservice_cell_ex(
        self,
        request: cas_models.ListAppserviceCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppserviceCellResponse:
        """
        Description: 批量获取应用实例的 cell
        Summary: 批量获取应用实例的 cell
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppserviceCellResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appservice_cell_ex_async(
        self,
        request: cas_models.ListAppserviceCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppserviceCellResponse:
        """
        Description: 批量获取应用实例的 cell
        Summary: 批量获取应用实例的 cell
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppserviceCellResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_appservice(
        self,
        request: cas_models.CreateAppserviceRequest,
    ) -> cas_models.CreateAppserviceResponse:
        """
        Description: 创建应用实例
        Summary: 创建应用实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appservice_ex(request, headers, runtime)

    async def create_appservice_async(
        self,
        request: cas_models.CreateAppserviceRequest,
    ) -> cas_models.CreateAppserviceResponse:
        """
        Description: 创建应用实例
        Summary: 创建应用实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appservice_ex_async(request, headers, runtime)

    def create_appservice_ex(
        self,
        request: cas_models.CreateAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateAppserviceResponse:
        """
        Description: 创建应用实例
        Summary: 创建应用实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appservice_ex_async(
        self,
        request: cas_models.CreateAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateAppserviceResponse:
        """
        Description: 创建应用实例
        Summary: 创建应用实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appservice_default(
        self,
        request: cas_models.GetAppserviceDefaultRequest,
    ) -> cas_models.GetAppserviceDefaultResponse:
        """
        Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
        Summary: 旧版应用管理-获取默认的应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appservice_default_ex(request, headers, runtime)

    async def get_appservice_default_async(
        self,
        request: cas_models.GetAppserviceDefaultRequest,
    ) -> cas_models.GetAppserviceDefaultResponse:
        """
        Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
        Summary: 旧版应用管理-获取默认的应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appservice_default_ex_async(request, headers, runtime)

    def get_appservice_default_ex(
        self,
        request: cas_models.GetAppserviceDefaultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppserviceDefaultResponse:
        """
        Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
        Summary: 旧版应用管理-获取默认的应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppserviceDefaultResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.default.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appservice_default_ex_async(
        self,
        request: cas_models.GetAppserviceDefaultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppserviceDefaultResponse:
        """
        Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
        Summary: 旧版应用管理-获取默认的应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppserviceDefaultResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.default.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_appservice(
        self,
        request: cas_models.ExistAppserviceRequest,
    ) -> cas_models.ExistAppserviceResponse:
        """
        Description: 判断应用实例是否存在
        Summary: 判断应用实例是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_appservice_ex(request, headers, runtime)

    async def exist_appservice_async(
        self,
        request: cas_models.ExistAppserviceRequest,
    ) -> cas_models.ExistAppserviceResponse:
        """
        Description: 判断应用实例是否存在
        Summary: 判断应用实例是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_appservice_ex_async(request, headers, runtime)

    def exist_appservice_ex(
        self,
        request: cas_models.ExistAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistAppserviceResponse:
        """
        Description: 判断应用实例是否存在
        Summary: 判断应用实例是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_appservice_ex_async(
        self,
        request: cas_models.ExistAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistAppserviceResponse:
        """
        Description: 判断应用实例是否存在
        Summary: 判断应用实例是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_appservice(
        self,
        request: cas_models.UpdateAppserviceRequest,
    ) -> cas_models.UpdateAppserviceResponse:
        """
        Description: 更新应用实例
        Summary: 更新应用实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_appservice_ex(request, headers, runtime)

    async def update_appservice_async(
        self,
        request: cas_models.UpdateAppserviceRequest,
    ) -> cas_models.UpdateAppserviceResponse:
        """
        Description: 更新应用实例
        Summary: 更新应用实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_appservice_ex_async(request, headers, runtime)

    def update_appservice_ex(
        self,
        request: cas_models.UpdateAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateAppserviceResponse:
        """
        Description: 更新应用实例
        Summary: 更新应用实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_appservice_ex_async(
        self,
        request: cas_models.UpdateAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateAppserviceResponse:
        """
        Description: 更新应用实例
        Summary: 更新应用实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack(
        self,
        request: cas_models.QueryBuildpackRequest,
    ) -> cas_models.QueryBuildpackResponse:
        """
        Description: 技术栈1.0查询（opsware）
        Summary: 技术栈查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_ex(request, headers, runtime)

    async def query_buildpack_async(
        self,
        request: cas_models.QueryBuildpackRequest,
    ) -> cas_models.QueryBuildpackResponse:
        """
        Description: 技术栈1.0查询（opsware）
        Summary: 技术栈查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_ex_async(request, headers, runtime)

    def query_buildpack_ex(
        self,
        request: cas_models.QueryBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryBuildpackResponse:
        """
        Description: 技术栈1.0查询（opsware）
        Summary: 技术栈查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryBuildpackResponse(),
            self.do_request('1.0', 'antcloud.cas.buildpack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_ex_async(
        self,
        request: cas_models.QueryBuildpackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryBuildpackResponse:
        """
        Description: 技术栈1.0查询（opsware）
        Summary: 技术栈查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryBuildpackResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.buildpack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_detail(
        self,
        request: cas_models.GetApplicationDetailRequest,
    ) -> cas_models.GetApplicationDetailResponse:
        """
        Description: 旧版应用管理-获取指定应用详情
        Summary: 旧版应用管理-获取应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_detail_ex(request, headers, runtime)

    async def get_application_detail_async(
        self,
        request: cas_models.GetApplicationDetailRequest,
    ) -> cas_models.GetApplicationDetailResponse:
        """
        Description: 旧版应用管理-获取指定应用详情
        Summary: 旧版应用管理-获取应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_detail_ex_async(request, headers, runtime)

    def get_application_detail_ex(
        self,
        request: cas_models.GetApplicationDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetApplicationDetailResponse:
        """
        Description: 旧版应用管理-获取指定应用详情
        Summary: 旧版应用管理-获取应用详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetApplicationDetailResponse(),
            self.do_request('1.0', 'antcloud.cas.application.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_detail_ex_async(
        self,
        request: cas_models.GetApplicationDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetApplicationDetailResponse:
        """
        Description: 旧版应用管理-获取指定应用详情
        Summary: 旧版应用管理-获取应用详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetApplicationDetailResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user(
        self,
        request: cas_models.QueryUserRequest,
    ) -> cas_models.QueryUserResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_ex(request, headers, runtime)

    async def query_user_async(
        self,
        request: cas_models.QueryUserRequest,
    ) -> cas_models.QueryUserResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_ex_async(request, headers, runtime)

    def query_user_ex(
        self,
        request: cas_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryUserResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryUserResponse(),
            self.do_request('1.0', 'antcloud.cas.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_ex_async(
        self,
        request: cas_models.QueryUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryUserResponse:
        """
        Description: 查询用户信息
        Summary: 查询用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryUserResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appgroup(
        self,
        request: cas_models.ListAppgroupRequest,
    ) -> cas_models.ListAppgroupResponse:
        """
        Description: 获取应用分组列表
        Summary: 获取应用分组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appgroup_ex(request, headers, runtime)

    async def list_appgroup_async(
        self,
        request: cas_models.ListAppgroupRequest,
    ) -> cas_models.ListAppgroupResponse:
        """
        Description: 获取应用分组列表
        Summary: 获取应用分组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appgroup_ex_async(request, headers, runtime)

    def list_appgroup_ex(
        self,
        request: cas_models.ListAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppgroupResponse:
        """
        Description: 获取应用分组列表
        Summary: 获取应用分组列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppgroupResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appgroup_ex_async(
        self,
        request: cas_models.ListAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppgroupResponse:
        """
        Description: 获取应用分组列表
        Summary: 获取应用分组列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_appgroup(
        self,
        request: cas_models.ExistAppgroupRequest,
    ) -> cas_models.ExistAppgroupResponse:
        """
        Description: 检查应用分组是否存在
        Summary: 检查应用分组是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_appgroup_ex(request, headers, runtime)

    async def exist_appgroup_async(
        self,
        request: cas_models.ExistAppgroupRequest,
    ) -> cas_models.ExistAppgroupResponse:
        """
        Description: 检查应用分组是否存在
        Summary: 检查应用分组是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_appgroup_ex_async(request, headers, runtime)

    def exist_appgroup_ex(
        self,
        request: cas_models.ExistAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistAppgroupResponse:
        """
        Description: 检查应用分组是否存在
        Summary: 检查应用分组是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistAppgroupResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_appgroup_ex_async(
        self,
        request: cas_models.ExistAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistAppgroupResponse:
        """
        Description: 检查应用分组是否存在
        Summary: 检查应用分组是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistAppgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_appgroup(
        self,
        request: cas_models.CreateAppgroupRequest,
    ) -> cas_models.CreateAppgroupResponse:
        """
        Description: 创建应用分组
        Summary: 创建应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appgroup_ex(request, headers, runtime)

    async def create_appgroup_async(
        self,
        request: cas_models.CreateAppgroupRequest,
    ) -> cas_models.CreateAppgroupResponse:
        """
        Description: 创建应用分组
        Summary: 创建应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appgroup_ex_async(request, headers, runtime)

    def create_appgroup_ex(
        self,
        request: cas_models.CreateAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateAppgroupResponse:
        """
        Description: 创建应用分组
        Summary: 创建应用分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateAppgroupResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appgroup_ex_async(
        self,
        request: cas_models.CreateAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateAppgroupResponse:
        """
        Description: 创建应用分组
        Summary: 创建应用分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateAppgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appgroup_owner(
        self,
        request: cas_models.ListAppgroupOwnerRequest,
    ) -> cas_models.ListAppgroupOwnerResponse:
        """
        Description: 获取应用owner列表
        Summary: 获取应用owner列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appgroup_owner_ex(request, headers, runtime)

    async def list_appgroup_owner_async(
        self,
        request: cas_models.ListAppgroupOwnerRequest,
    ) -> cas_models.ListAppgroupOwnerResponse:
        """
        Description: 获取应用owner列表
        Summary: 获取应用owner列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appgroup_owner_ex_async(request, headers, runtime)

    def list_appgroup_owner_ex(
        self,
        request: cas_models.ListAppgroupOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppgroupOwnerResponse:
        """
        Description: 获取应用owner列表
        Summary: 获取应用owner列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppgroupOwnerResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.owner.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appgroup_owner_ex_async(
        self,
        request: cas_models.ListAppgroupOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppgroupOwnerResponse:
        """
        Description: 获取应用owner列表
        Summary: 获取应用owner列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppgroupOwnerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.owner.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appgroup_tree(
        self,
        request: cas_models.GetAppgroupTreeRequest,
    ) -> cas_models.GetAppgroupTreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appgroup_tree_ex(request, headers, runtime)

    async def get_appgroup_tree_async(
        self,
        request: cas_models.GetAppgroupTreeRequest,
    ) -> cas_models.GetAppgroupTreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appgroup_tree_ex_async(request, headers, runtime)

    def get_appgroup_tree_ex(
        self,
        request: cas_models.GetAppgroupTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppgroupTreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppgroupTreeResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.tree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appgroup_tree_ex_async(
        self,
        request: cas_models.GetAppgroupTreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppgroupTreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppgroupTreeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.tree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appgroup_systemtree(
        self,
        request: cas_models.GetAppgroupSystemtreeRequest,
    ) -> cas_models.GetAppgroupSystemtreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appgroup_systemtree_ex(request, headers, runtime)

    async def get_appgroup_systemtree_async(
        self,
        request: cas_models.GetAppgroupSystemtreeRequest,
    ) -> cas_models.GetAppgroupSystemtreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appgroup_systemtree_ex_async(request, headers, runtime)

    def get_appgroup_systemtree_ex(
        self,
        request: cas_models.GetAppgroupSystemtreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppgroupSystemtreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppgroupSystemtreeResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.systemtree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appgroup_systemtree_ex_async(
        self,
        request: cas_models.GetAppgroupSystemtreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppgroupSystemtreeResponse:
        """
        Description: 应用分组结构查询
        Summary: 应用分组结构查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppgroupSystemtreeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.systemtree.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_appgroup(
        self,
        request: cas_models.DeleteAppgroupRequest,
    ) -> cas_models.DeleteAppgroupResponse:
        """
        Description: 删除分组
        Summary: 删除分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_appgroup_ex(request, headers, runtime)

    async def delete_appgroup_async(
        self,
        request: cas_models.DeleteAppgroupRequest,
    ) -> cas_models.DeleteAppgroupResponse:
        """
        Description: 删除分组
        Summary: 删除分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_appgroup_ex_async(request, headers, runtime)

    def delete_appgroup_ex(
        self,
        request: cas_models.DeleteAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteAppgroupResponse:
        """
        Description: 删除分组
        Summary: 删除分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteAppgroupResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_appgroup_ex_async(
        self,
        request: cas_models.DeleteAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteAppgroupResponse:
        """
        Description: 删除分组
        Summary: 删除分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteAppgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_appgroup(
        self,
        request: cas_models.UpdateAppgroupRequest,
    ) -> cas_models.UpdateAppgroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_appgroup_ex(request, headers, runtime)

    async def update_appgroup_async(
        self,
        request: cas_models.UpdateAppgroupRequest,
    ) -> cas_models.UpdateAppgroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_appgroup_ex_async(request, headers, runtime)

    def update_appgroup_ex(
        self,
        request: cas_models.UpdateAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateAppgroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateAppgroupResponse(),
            self.do_request('1.0', 'antcloud.cas.appgroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_appgroup_ex_async(
        self,
        request: cas_models.UpdateAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateAppgroupResponse:
        """
        Description: 更新分组
        Summary: 更新分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateAppgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_applevel(
        self,
        request: cas_models.ListApplevelRequest,
    ) -> cas_models.ListApplevelResponse:
        """
        Description: 列出所有应用等级
        Summary: 列出所有应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_applevel_ex(request, headers, runtime)

    async def list_applevel_async(
        self,
        request: cas_models.ListApplevelRequest,
    ) -> cas_models.ListApplevelResponse:
        """
        Description: 列出所有应用等级
        Summary: 列出所有应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_applevel_ex_async(request, headers, runtime)

    def list_applevel_ex(
        self,
        request: cas_models.ListApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplevelResponse:
        """
        Description: 列出所有应用等级
        Summary: 列出所有应用等级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplevelResponse(),
            self.do_request('1.0', 'antcloud.cas.applevel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_applevel_ex_async(
        self,
        request: cas_models.ListApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplevelResponse:
        """
        Description: 列出所有应用等级
        Summary: 列出所有应用等级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplevelResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.applevel.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_applevel(
        self,
        request: cas_models.ExistApplevelRequest,
    ) -> cas_models.ExistApplevelResponse:
        """
        Description: 应用等级是否存在
        Summary: 应用等级是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_applevel_ex(request, headers, runtime)

    async def exist_applevel_async(
        self,
        request: cas_models.ExistApplevelRequest,
    ) -> cas_models.ExistApplevelResponse:
        """
        Description: 应用等级是否存在
        Summary: 应用等级是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_applevel_ex_async(request, headers, runtime)

    def exist_applevel_ex(
        self,
        request: cas_models.ExistApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistApplevelResponse:
        """
        Description: 应用等级是否存在
        Summary: 应用等级是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistApplevelResponse(),
            self.do_request('1.0', 'antcloud.cas.applevel.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_applevel_ex_async(
        self,
        request: cas_models.ExistApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistApplevelResponse:
        """
        Description: 应用等级是否存在
        Summary: 应用等级是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistApplevelResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.applevel.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_applevel(
        self,
        request: cas_models.CreateApplevelRequest,
    ) -> cas_models.CreateApplevelResponse:
        """
        Description: 创建应用等级
        Summary: 创建应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_applevel_ex(request, headers, runtime)

    async def create_applevel_async(
        self,
        request: cas_models.CreateApplevelRequest,
    ) -> cas_models.CreateApplevelResponse:
        """
        Description: 创建应用等级
        Summary: 创建应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_applevel_ex_async(request, headers, runtime)

    def create_applevel_ex(
        self,
        request: cas_models.CreateApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateApplevelResponse:
        """
        Description: 创建应用等级
        Summary: 创建应用等级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateApplevelResponse(),
            self.do_request('1.0', 'antcloud.cas.applevel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_applevel_ex_async(
        self,
        request: cas_models.CreateApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateApplevelResponse:
        """
        Description: 创建应用等级
        Summary: 创建应用等级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateApplevelResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.applevel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_applevel(
        self,
        request: cas_models.DeleteApplevelRequest,
    ) -> cas_models.DeleteApplevelResponse:
        """
        Description: 删除应用分组
        Summary: 删除应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_applevel_ex(request, headers, runtime)

    async def delete_applevel_async(
        self,
        request: cas_models.DeleteApplevelRequest,
    ) -> cas_models.DeleteApplevelResponse:
        """
        Description: 删除应用分组
        Summary: 删除应用分组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_applevel_ex_async(request, headers, runtime)

    def delete_applevel_ex(
        self,
        request: cas_models.DeleteApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteApplevelResponse:
        """
        Description: 删除应用分组
        Summary: 删除应用分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteApplevelResponse(),
            self.do_request('1.0', 'antcloud.cas.applevel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_applevel_ex_async(
        self,
        request: cas_models.DeleteApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteApplevelResponse:
        """
        Description: 删除应用分组
        Summary: 删除应用分组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteApplevelResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.applevel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_applevel(
        self,
        request: cas_models.UpdateApplevelRequest,
    ) -> cas_models.UpdateApplevelResponse:
        """
        Description: 更新应用等级
        Summary: 更新应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_applevel_ex(request, headers, runtime)

    async def update_applevel_async(
        self,
        request: cas_models.UpdateApplevelRequest,
    ) -> cas_models.UpdateApplevelResponse:
        """
        Description: 更新应用等级
        Summary: 更新应用等级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_applevel_ex_async(request, headers, runtime)

    def update_applevel_ex(
        self,
        request: cas_models.UpdateApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateApplevelResponse:
        """
        Description: 更新应用等级
        Summary: 更新应用等级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateApplevelResponse(),
            self.do_request('1.0', 'antcloud.cas.applevel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_applevel_ex_async(
        self,
        request: cas_models.UpdateApplevelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateApplevelResponse:
        """
        Description: 更新应用等级
        Summary: 更新应用等级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateApplevelResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.applevel.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_application(
        self,
        request: cas_models.ListApplicationRequest,
    ) -> cas_models.ListApplicationResponse:
        """
        Description: 旧版应用管理-获取应用列表
        Summary: 旧版应用管理-获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_application_ex(request, headers, runtime)

    async def list_application_async(
        self,
        request: cas_models.ListApplicationRequest,
    ) -> cas_models.ListApplicationResponse:
        """
        Description: 旧版应用管理-获取应用列表
        Summary: 旧版应用管理-获取应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_application_ex_async(request, headers, runtime)

    def list_application_ex(
        self,
        request: cas_models.ListApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplicationResponse:
        """
        Description: 旧版应用管理-获取应用列表
        Summary: 旧版应用管理-获取应用列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplicationResponse(),
            self.do_request('1.0', 'antcloud.cas.application.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_application_ex_async(
        self,
        request: cas_models.ListApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListApplicationResponse:
        """
        Description: 旧版应用管理-获取应用列表
        Summary: 旧版应用管理-获取应用列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_application(
        self,
        request: cas_models.UpdateApplicationRequest,
    ) -> cas_models.UpdateApplicationResponse:
        """
        Description: 旧版应用管理-更新应用
        Summary: 旧版应用管理-更新应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_application_ex(request, headers, runtime)

    async def update_application_async(
        self,
        request: cas_models.UpdateApplicationRequest,
    ) -> cas_models.UpdateApplicationResponse:
        """
        Description: 旧版应用管理-更新应用
        Summary: 旧版应用管理-更新应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_application_ex_async(request, headers, runtime)

    def update_application_ex(
        self,
        request: cas_models.UpdateApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateApplicationResponse:
        """
        Description: 旧版应用管理-更新应用
        Summary: 旧版应用管理-更新应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateApplicationResponse(),
            self.do_request('1.0', 'antcloud.cas.application.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_application_ex_async(
        self,
        request: cas_models.UpdateApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateApplicationResponse:
        """
        Description: 旧版应用管理-更新应用
        Summary: 旧版应用管理-更新应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appservice(
        self,
        request: cas_models.ListAppserviceRequest,
    ) -> cas_models.ListAppserviceResponse:
        """
        Description: 旧版应用管理-批量查询应用服务
        Summary: 旧版应用管理-批量查询应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appservice_ex(request, headers, runtime)

    async def list_appservice_async(
        self,
        request: cas_models.ListAppserviceRequest,
    ) -> cas_models.ListAppserviceResponse:
        """
        Description: 旧版应用管理-批量查询应用服务
        Summary: 旧版应用管理-批量查询应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appservice_ex_async(request, headers, runtime)

    def list_appservice_ex(
        self,
        request: cas_models.ListAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppserviceResponse:
        """
        Description: 旧版应用管理-批量查询应用服务
        Summary: 旧版应用管理-批量查询应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appservice_ex_async(
        self,
        request: cas_models.ListAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppserviceResponse:
        """
        Description: 旧版应用管理-批量查询应用服务
        Summary: 旧版应用管理-批量查询应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_appservice(
        self,
        request: cas_models.DeleteAppserviceRequest,
    ) -> cas_models.DeleteAppserviceResponse:
        """
        Description: 旧版应用管理-删除应用服务
        Summary: 旧版应用管理-删除应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_appservice_ex(request, headers, runtime)

    async def delete_appservice_async(
        self,
        request: cas_models.DeleteAppserviceRequest,
    ) -> cas_models.DeleteAppserviceResponse:
        """
        Description: 旧版应用管理-删除应用服务
        Summary: 旧版应用管理-删除应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_appservice_ex_async(request, headers, runtime)

    def delete_appservice_ex(
        self,
        request: cas_models.DeleteAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteAppserviceResponse:
        """
        Description: 旧版应用管理-删除应用服务
        Summary: 旧版应用管理-删除应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_appservice_ex_async(
        self,
        request: cas_models.DeleteAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteAppserviceResponse:
        """
        Description: 旧版应用管理-删除应用服务
        Summary: 旧版应用管理-删除应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appservice_detail(
        self,
        request: cas_models.GetAppserviceDetailRequest,
    ) -> cas_models.GetAppserviceDetailResponse:
        """
        Description: 旧版应用管理-获取应用服务详情
        Summary: 旧版应用管理-获取应用服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appservice_detail_ex(request, headers, runtime)

    async def get_appservice_detail_async(
        self,
        request: cas_models.GetAppserviceDetailRequest,
    ) -> cas_models.GetAppserviceDetailResponse:
        """
        Description: 旧版应用管理-获取应用服务详情
        Summary: 旧版应用管理-获取应用服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appservice_detail_ex_async(request, headers, runtime)

    def get_appservice_detail_ex(
        self,
        request: cas_models.GetAppserviceDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppserviceDetailResponse:
        """
        Description: 旧版应用管理-获取应用服务详情
        Summary: 旧版应用管理-获取应用服务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppserviceDetailResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appservice_detail_ex_async(
        self,
        request: cas_models.GetAppserviceDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppserviceDetailResponse:
        """
        Description: 旧版应用管理-获取应用服务详情
        Summary: 旧版应用管理-获取应用服务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppserviceDetailResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_application_package(
        self,
        request: cas_models.ExistApplicationPackageRequest,
    ) -> cas_models.ExistApplicationPackageResponse:
        """
        Description: 旧版应用管理-检查应用发布包是否存在
        Summary: 旧版应用管理-检查应用发布包是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_application_package_ex(request, headers, runtime)

    async def exist_application_package_async(
        self,
        request: cas_models.ExistApplicationPackageRequest,
    ) -> cas_models.ExistApplicationPackageResponse:
        """
        Description: 旧版应用管理-检查应用发布包是否存在
        Summary: 旧版应用管理-检查应用发布包是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_application_package_ex_async(request, headers, runtime)

    def exist_application_package_ex(
        self,
        request: cas_models.ExistApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistApplicationPackageResponse:
        """
        Description: 旧版应用管理-检查应用发布包是否存在
        Summary: 旧版应用管理-检查应用发布包是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistApplicationPackageResponse(),
            self.do_request('1.0', 'antcloud.cas.application.package.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_application_package_ex_async(
        self,
        request: cas_models.ExistApplicationPackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistApplicationPackageResponse:
        """
        Description: 旧版应用管理-检查应用发布包是否存在
        Summary: 旧版应用管理-检查应用发布包是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistApplicationPackageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.package.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_packageuploadpolicy(
        self,
        request: cas_models.GetApplicationPackageuploadpolicyRequest,
    ) -> cas_models.GetApplicationPackageuploadpolicyResponse:
        """
        Description: 旧版应用管理-获取应用包上传策略
        Summary: 旧版应用管理-获取应用包上传策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_packageuploadpolicy_ex(request, headers, runtime)

    async def get_application_packageuploadpolicy_async(
        self,
        request: cas_models.GetApplicationPackageuploadpolicyRequest,
    ) -> cas_models.GetApplicationPackageuploadpolicyResponse:
        """
        Description: 旧版应用管理-获取应用包上传策略
        Summary: 旧版应用管理-获取应用包上传策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_packageuploadpolicy_ex_async(request, headers, runtime)

    def get_application_packageuploadpolicy_ex(
        self,
        request: cas_models.GetApplicationPackageuploadpolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetApplicationPackageuploadpolicyResponse:
        """
        Description: 旧版应用管理-获取应用包上传策略
        Summary: 旧版应用管理-获取应用包上传策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetApplicationPackageuploadpolicyResponse(),
            self.do_request('1.0', 'antcloud.cas.application.packageuploadpolicy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_packageuploadpolicy_ex_async(
        self,
        request: cas_models.GetApplicationPackageuploadpolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetApplicationPackageuploadpolicyResponse:
        """
        Description: 旧版应用管理-获取应用包上传策略
        Summary: 旧版应用管理-获取应用包上传策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetApplicationPackageuploadpolicyResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.packageuploadpolicy.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_packagedownloadurl(
        self,
        request: cas_models.GetApplicationPackagedownloadurlRequest,
    ) -> cas_models.GetApplicationPackagedownloadurlResponse:
        """
        Description: 旧版应用管理-获取发布包下载链接
        Summary: 旧版应用管理-获取发布包下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_packagedownloadurl_ex(request, headers, runtime)

    async def get_application_packagedownloadurl_async(
        self,
        request: cas_models.GetApplicationPackagedownloadurlRequest,
    ) -> cas_models.GetApplicationPackagedownloadurlResponse:
        """
        Description: 旧版应用管理-获取发布包下载链接
        Summary: 旧版应用管理-获取发布包下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_packagedownloadurl_ex_async(request, headers, runtime)

    def get_application_packagedownloadurl_ex(
        self,
        request: cas_models.GetApplicationPackagedownloadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetApplicationPackagedownloadurlResponse:
        """
        Description: 旧版应用管理-获取发布包下载链接
        Summary: 旧版应用管理-获取发布包下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetApplicationPackagedownloadurlResponse(),
            self.do_request('1.0', 'antcloud.cas.application.packagedownloadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_packagedownloadurl_ex_async(
        self,
        request: cas_models.GetApplicationPackagedownloadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetApplicationPackagedownloadurlResponse:
        """
        Description: 旧版应用管理-获取发布包下载链接
        Summary: 旧版应用管理-获取发布包下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetApplicationPackagedownloadurlResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.packagedownloadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_application(
        self,
        request: cas_models.ExistApplicationRequest,
    ) -> cas_models.ExistApplicationResponse:
        """
        Description: 旧版应用管理-判断应用是否存在
        Summary: 旧版应用管理-判断应用是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_application_ex(request, headers, runtime)

    async def exist_application_async(
        self,
        request: cas_models.ExistApplicationRequest,
    ) -> cas_models.ExistApplicationResponse:
        """
        Description: 旧版应用管理-判断应用是否存在
        Summary: 旧版应用管理-判断应用是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_application_ex_async(request, headers, runtime)

    def exist_application_ex(
        self,
        request: cas_models.ExistApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistApplicationResponse:
        """
        Description: 旧版应用管理-判断应用是否存在
        Summary: 旧版应用管理-判断应用是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistApplicationResponse(),
            self.do_request('1.0', 'antcloud.cas.application.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_application_ex_async(
        self,
        request: cas_models.ExistApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExistApplicationResponse:
        """
        Description: 旧版应用管理-判断应用是否存在
        Summary: 旧版应用管理-判断应用是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExistApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appservice(
        self,
        request: cas_models.QueryAppserviceRequest,
    ) -> cas_models.QueryAppserviceResponse:
        """
        Description: 旧版应用管理-根据 appServiceIds 查询应用服务
        Summary: 根据应用服务ids查询应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appservice_ex(request, headers, runtime)

    async def query_appservice_async(
        self,
        request: cas_models.QueryAppserviceRequest,
    ) -> cas_models.QueryAppserviceResponse:
        """
        Description: 旧版应用管理-根据 appServiceIds 查询应用服务
        Summary: 根据应用服务ids查询应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appservice_ex_async(request, headers, runtime)

    def query_appservice_ex(
        self,
        request: cas_models.QueryAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppserviceResponse:
        """
        Description: 旧版应用管理-根据 appServiceIds 查询应用服务
        Summary: 根据应用服务ids查询应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.appservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appservice_ex_async(
        self,
        request: cas_models.QueryAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppserviceResponse:
        """
        Description: 旧版应用管理-根据 appServiceIds 查询应用服务
        Summary: 根据应用服务ids查询应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appgrayconfigs(
        self,
        request: cas_models.GetAppgrayconfigsRequest,
    ) -> cas_models.GetAppgrayconfigsResponse:
        """
        Description: 历史遗留接口-获取开关配置清单
        Summary: 历史遗留接口-获取开关配置清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appgrayconfigs_ex(request, headers, runtime)

    async def get_appgrayconfigs_async(
        self,
        request: cas_models.GetAppgrayconfigsRequest,
    ) -> cas_models.GetAppgrayconfigsResponse:
        """
        Description: 历史遗留接口-获取开关配置清单
        Summary: 历史遗留接口-获取开关配置清单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appgrayconfigs_ex_async(request, headers, runtime)

    def get_appgrayconfigs_ex(
        self,
        request: cas_models.GetAppgrayconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppgrayconfigsResponse:
        """
        Description: 历史遗留接口-获取开关配置清单
        Summary: 历史遗留接口-获取开关配置清单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppgrayconfigsResponse(),
            self.do_request('1.0', 'antcloud.cas.appgrayconfigs.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appgrayconfigs_ex_async(
        self,
        request: cas_models.GetAppgrayconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppgrayconfigsResponse:
        """
        Description: 历史遗留接口-获取开关配置清单
        Summary: 历史遗留接口-获取开关配置清单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppgrayconfigsResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appgrayconfigs.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_optest(
        self,
        request: cas_models.QueryOptestRequest,
    ) -> cas_models.QueryOptestResponse:
        """
        Description: 测试api元数据自动录入
        Summary: 测试api元数据自动录入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_optest_ex(request, headers, runtime)

    async def query_optest_async(
        self,
        request: cas_models.QueryOptestRequest,
    ) -> cas_models.QueryOptestResponse:
        """
        Description: 测试api元数据自动录入
        Summary: 测试api元数据自动录入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_optest_ex_async(request, headers, runtime)

    def query_optest_ex(
        self,
        request: cas_models.QueryOptestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryOptestResponse:
        """
        Description: 测试api元数据自动录入
        Summary: 测试api元数据自动录入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryOptestResponse(),
            self.do_request('1.0', 'antcloud.cas.optest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_optest_ex_async(
        self,
        request: cas_models.QueryOptestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryOptestResponse:
        """
        Description: 测试api元数据自动录入
        Summary: 测试api元数据自动录入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryOptestResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.optest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_optestplus(
        self,
        request: cas_models.BindOptestplusRequest,
    ) -> cas_models.BindOptestplusResponse:
        """
        Description: optestplus
        Summary: optestplus
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_optestplus_ex(request, headers, runtime)

    async def bind_optestplus_async(
        self,
        request: cas_models.BindOptestplusRequest,
    ) -> cas_models.BindOptestplusResponse:
        """
        Description: optestplus
        Summary: optestplus
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_optestplus_ex_async(request, headers, runtime)

    def bind_optestplus_ex(
        self,
        request: cas_models.BindOptestplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BindOptestplusResponse:
        """
        Description: optestplus
        Summary: optestplus
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BindOptestplusResponse(),
            self.do_request('1.0', 'antcloud.cas.optestplus.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_optestplus_ex_async(
        self,
        request: cas_models.BindOptestplusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BindOptestplusResponse:
        """
        Description: optestplus
        Summary: optestplus
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BindOptestplusResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.optestplus.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_app(
        self,
        request: cas_models.ListAppportraitAppRequest,
    ) -> cas_models.ListAppportraitAppResponse:
        """
        Description: 应用画像获取应用名称列表
        Summary: 应用画像获取应用名称列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_app_ex(request, headers, runtime)

    async def list_appportrait_app_async(
        self,
        request: cas_models.ListAppportraitAppRequest,
    ) -> cas_models.ListAppportraitAppResponse:
        """
        Description: 应用画像获取应用名称列表
        Summary: 应用画像获取应用名称列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_app_ex_async(request, headers, runtime)

    def list_appportrait_app_ex(
        self,
        request: cas_models.ListAppportraitAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitAppResponse:
        """
        Description: 应用画像获取应用名称列表
        Summary: 应用画像获取应用名称列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitAppResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.app.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_app_ex_async(
        self,
        request: cas_models.ListAppportraitAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitAppResponse:
        """
        Description: 应用画像获取应用名称列表
        Summary: 应用画像获取应用名称列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitAppResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.app.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appportrait_app(
        self,
        request: cas_models.GetAppportraitAppRequest,
    ) -> cas_models.GetAppportraitAppResponse:
        """
        Description: 获取应用详情信息
        Summary: 获取应用详情信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appportrait_app_ex(request, headers, runtime)

    async def get_appportrait_app_async(
        self,
        request: cas_models.GetAppportraitAppRequest,
    ) -> cas_models.GetAppportraitAppResponse:
        """
        Description: 获取应用详情信息
        Summary: 获取应用详情信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appportrait_app_ex_async(request, headers, runtime)

    def get_appportrait_app_ex(
        self,
        request: cas_models.GetAppportraitAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitAppResponse:
        """
        Description: 获取应用详情信息
        Summary: 获取应用详情信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitAppResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appportrait_app_ex_async(
        self,
        request: cas_models.GetAppportraitAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitAppResponse:
        """
        Description: 获取应用详情信息
        Summary: 获取应用详情信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitAppResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.app.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appportrait_yearusability(
        self,
        request: cas_models.GetAppportraitYearusabilityRequest,
    ) -> cas_models.GetAppportraitYearusabilityResponse:
        """
        Description: 年维度应用可用性查询
        Summary: 年维度应用可用性查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appportrait_yearusability_ex(request, headers, runtime)

    async def get_appportrait_yearusability_async(
        self,
        request: cas_models.GetAppportraitYearusabilityRequest,
    ) -> cas_models.GetAppportraitYearusabilityResponse:
        """
        Description: 年维度应用可用性查询
        Summary: 年维度应用可用性查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appportrait_yearusability_ex_async(request, headers, runtime)

    def get_appportrait_yearusability_ex(
        self,
        request: cas_models.GetAppportraitYearusabilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitYearusabilityResponse:
        """
        Description: 年维度应用可用性查询
        Summary: 年维度应用可用性查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitYearusabilityResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.yearusability.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appportrait_yearusability_ex_async(
        self,
        request: cas_models.GetAppportraitYearusabilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitYearusabilityResponse:
        """
        Description: 年维度应用可用性查询
        Summary: 年维度应用可用性查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitYearusabilityResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.yearusability.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appportrait_monthusability(
        self,
        request: cas_models.GetAppportraitMonthusabilityRequest,
    ) -> cas_models.GetAppportraitMonthusabilityResponse:
        """
        Description: 月维度应用可用性查询
        Summary: 月维度应用可用性查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appportrait_monthusability_ex(request, headers, runtime)

    async def get_appportrait_monthusability_async(
        self,
        request: cas_models.GetAppportraitMonthusabilityRequest,
    ) -> cas_models.GetAppportraitMonthusabilityResponse:
        """
        Description: 月维度应用可用性查询
        Summary: 月维度应用可用性查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appportrait_monthusability_ex_async(request, headers, runtime)

    def get_appportrait_monthusability_ex(
        self,
        request: cas_models.GetAppportraitMonthusabilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitMonthusabilityResponse:
        """
        Description: 月维度应用可用性查询
        Summary: 月维度应用可用性查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitMonthusabilityResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.monthusability.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appportrait_monthusability_ex_async(
        self,
        request: cas_models.GetAppportraitMonthusabilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitMonthusabilityResponse:
        """
        Description: 月维度应用可用性查询
        Summary: 月维度应用可用性查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitMonthusabilityResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.monthusability.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appportrait_usabilitytrend(
        self,
        request: cas_models.QueryAppportraitUsabilitytrendRequest,
    ) -> cas_models.QueryAppportraitUsabilitytrendResponse:
        """
        Description: 可用性趋势
        Summary: 可用性趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appportrait_usabilitytrend_ex(request, headers, runtime)

    async def query_appportrait_usabilitytrend_async(
        self,
        request: cas_models.QueryAppportraitUsabilitytrendRequest,
    ) -> cas_models.QueryAppportraitUsabilitytrendResponse:
        """
        Description: 可用性趋势
        Summary: 可用性趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appportrait_usabilitytrend_ex_async(request, headers, runtime)

    def query_appportrait_usabilitytrend_ex(
        self,
        request: cas_models.QueryAppportraitUsabilitytrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitUsabilitytrendResponse:
        """
        Description: 可用性趋势
        Summary: 可用性趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitUsabilitytrendResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.usabilitytrend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appportrait_usabilitytrend_ex_async(
        self,
        request: cas_models.QueryAppportraitUsabilitytrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitUsabilitytrendResponse:
        """
        Description: 可用性趋势
        Summary: 可用性趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitUsabilitytrendResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.usabilitytrend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appportrait_healthscore(
        self,
        request: cas_models.QueryAppportraitHealthscoreRequest,
    ) -> cas_models.QueryAppportraitHealthscoreResponse:
        """
        Description: 应用画像健康分
        Summary: 应用画像健康分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appportrait_healthscore_ex(request, headers, runtime)

    async def query_appportrait_healthscore_async(
        self,
        request: cas_models.QueryAppportraitHealthscoreRequest,
    ) -> cas_models.QueryAppportraitHealthscoreResponse:
        """
        Description: 应用画像健康分
        Summary: 应用画像健康分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appportrait_healthscore_ex_async(request, headers, runtime)

    def query_appportrait_healthscore_ex(
        self,
        request: cas_models.QueryAppportraitHealthscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitHealthscoreResponse:
        """
        Description: 应用画像健康分
        Summary: 应用画像健康分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitHealthscoreResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.healthscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appportrait_healthscore_ex_async(
        self,
        request: cas_models.QueryAppportraitHealthscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitHealthscoreResponse:
        """
        Description: 应用画像健康分
        Summary: 应用画像健康分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitHealthscoreResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.healthscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appportrait_healthscoretrend(
        self,
        request: cas_models.QueryAppportraitHealthscoretrendRequest,
    ) -> cas_models.QueryAppportraitHealthscoretrendResponse:
        """
        Description: 应用健康分趋势查询
        Summary: 应用健康分趋势查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appportrait_healthscoretrend_ex(request, headers, runtime)

    async def query_appportrait_healthscoretrend_async(
        self,
        request: cas_models.QueryAppportraitHealthscoretrendRequest,
    ) -> cas_models.QueryAppportraitHealthscoretrendResponse:
        """
        Description: 应用健康分趋势查询
        Summary: 应用健康分趋势查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appportrait_healthscoretrend_ex_async(request, headers, runtime)

    def query_appportrait_healthscoretrend_ex(
        self,
        request: cas_models.QueryAppportraitHealthscoretrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitHealthscoretrendResponse:
        """
        Description: 应用健康分趋势查询
        Summary: 应用健康分趋势查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitHealthscoretrendResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.healthscoretrend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appportrait_healthscoretrend_ex_async(
        self,
        request: cas_models.QueryAppportraitHealthscoretrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitHealthscoretrendResponse:
        """
        Description: 应用健康分趋势查询
        Summary: 应用健康分趋势查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitHealthscoretrendResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.healthscoretrend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appportrait_alertcounttrend(
        self,
        request: cas_models.QueryAppportraitAlertcounttrendRequest,
    ) -> cas_models.QueryAppportraitAlertcounttrendResponse:
        """
        Description: 应用画像告警数趋势查询
        Summary: 应用画像告警数趋势查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appportrait_alertcounttrend_ex(request, headers, runtime)

    async def query_appportrait_alertcounttrend_async(
        self,
        request: cas_models.QueryAppportraitAlertcounttrendRequest,
    ) -> cas_models.QueryAppportraitAlertcounttrendResponse:
        """
        Description: 应用画像告警数趋势查询
        Summary: 应用画像告警数趋势查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appportrait_alertcounttrend_ex_async(request, headers, runtime)

    def query_appportrait_alertcounttrend_ex(
        self,
        request: cas_models.QueryAppportraitAlertcounttrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitAlertcounttrendResponse:
        """
        Description: 应用画像告警数趋势查询
        Summary: 应用画像告警数趋势查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitAlertcounttrendResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.alertcounttrend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appportrait_alertcounttrend_ex_async(
        self,
        request: cas_models.QueryAppportraitAlertcounttrendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitAlertcounttrendResponse:
        """
        Description: 应用画像告警数趋势查询
        Summary: 应用画像告警数趋势查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitAlertcounttrendResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.alertcounttrend.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_alert(
        self,
        request: cas_models.ListAppportraitAlertRequest,
    ) -> cas_models.ListAppportraitAlertResponse:
        """
        Description: 查询应用画像告警明细列表
        Summary: 应用画像告警明细列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_alert_ex(request, headers, runtime)

    async def list_appportrait_alert_async(
        self,
        request: cas_models.ListAppportraitAlertRequest,
    ) -> cas_models.ListAppportraitAlertResponse:
        """
        Description: 查询应用画像告警明细列表
        Summary: 应用画像告警明细列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_alert_ex_async(request, headers, runtime)

    def list_appportrait_alert_ex(
        self,
        request: cas_models.ListAppportraitAlertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitAlertResponse:
        """
        Description: 查询应用画像告警明细列表
        Summary: 应用画像告警明细列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitAlertResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.alert.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_alert_ex_async(
        self,
        request: cas_models.ListAppportraitAlertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitAlertResponse:
        """
        Description: 查询应用画像告警明细列表
        Summary: 应用画像告警明细列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitAlertResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.alert.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appportrait_ecsusage(
        self,
        request: cas_models.GetAppportraitEcsusageRequest,
    ) -> cas_models.GetAppportraitEcsusageResponse:
        """
        Description: 应用画像应用ecs利用率
        Summary: 应用画像应用ecs利用率
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appportrait_ecsusage_ex(request, headers, runtime)

    async def get_appportrait_ecsusage_async(
        self,
        request: cas_models.GetAppportraitEcsusageRequest,
    ) -> cas_models.GetAppportraitEcsusageResponse:
        """
        Description: 应用画像应用ecs利用率
        Summary: 应用画像应用ecs利用率
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appportrait_ecsusage_ex_async(request, headers, runtime)

    def get_appportrait_ecsusage_ex(
        self,
        request: cas_models.GetAppportraitEcsusageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitEcsusageResponse:
        """
        Description: 应用画像应用ecs利用率
        Summary: 应用画像应用ecs利用率
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitEcsusageResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.ecsusage.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appportrait_ecsusage_ex_async(
        self,
        request: cas_models.GetAppportraitEcsusageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetAppportraitEcsusageResponse:
        """
        Description: 应用画像应用ecs利用率
        Summary: 应用画像应用ecs利用率
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetAppportraitEcsusageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.ecsusage.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appportrait_containerusage(
        self,
        request: cas_models.QueryAppportraitContainerusageRequest,
    ) -> cas_models.QueryAppportraitContainerusageResponse:
        """
        Description: 查询应用画像容器利用率
        Summary: 应用画像容器利用率
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appportrait_containerusage_ex(request, headers, runtime)

    async def query_appportrait_containerusage_async(
        self,
        request: cas_models.QueryAppportraitContainerusageRequest,
    ) -> cas_models.QueryAppportraitContainerusageResponse:
        """
        Description: 查询应用画像容器利用率
        Summary: 应用画像容器利用率
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appportrait_containerusage_ex_async(request, headers, runtime)

    def query_appportrait_containerusage_ex(
        self,
        request: cas_models.QueryAppportraitContainerusageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitContainerusageResponse:
        """
        Description: 查询应用画像容器利用率
        Summary: 应用画像容器利用率
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitContainerusageResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.containerusage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appportrait_containerusage_ex_async(
        self,
        request: cas_models.QueryAppportraitContainerusageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryAppportraitContainerusageResponse:
        """
        Description: 查询应用画像容器利用率
        Summary: 应用画像容器利用率
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryAppportraitContainerusageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.containerusage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_actiontrail(
        self,
        request: cas_models.ListAppportraitActiontrailRequest,
    ) -> cas_models.ListAppportraitActiontrailResponse:
        """
        Description: 应用画像应用操作记录
        Summary: 应用画像应用操作记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_actiontrail_ex(request, headers, runtime)

    async def list_appportrait_actiontrail_async(
        self,
        request: cas_models.ListAppportraitActiontrailRequest,
    ) -> cas_models.ListAppportraitActiontrailResponse:
        """
        Description: 应用画像应用操作记录
        Summary: 应用画像应用操作记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_actiontrail_ex_async(request, headers, runtime)

    def list_appportrait_actiontrail_ex(
        self,
        request: cas_models.ListAppportraitActiontrailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitActiontrailResponse:
        """
        Description: 应用画像应用操作记录
        Summary: 应用画像应用操作记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitActiontrailResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.actiontrail.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_actiontrail_ex_async(
        self,
        request: cas_models.ListAppportraitActiontrailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitActiontrailResponse:
        """
        Description: 应用画像应用操作记录
        Summary: 应用画像应用操作记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitActiontrailResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.actiontrail.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_node(
        self,
        request: cas_models.ListAppportraitNodeRequest,
    ) -> cas_models.ListAppportraitNodeResponse:
        """
        Description: 应用画像应用服务关联资源节点信息
        Summary: 应用画像应用服务关联资源节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_node_ex(request, headers, runtime)

    async def list_appportrait_node_async(
        self,
        request: cas_models.ListAppportraitNodeRequest,
    ) -> cas_models.ListAppportraitNodeResponse:
        """
        Description: 应用画像应用服务关联资源节点信息
        Summary: 应用画像应用服务关联资源节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_node_ex_async(request, headers, runtime)

    def list_appportrait_node_ex(
        self,
        request: cas_models.ListAppportraitNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitNodeResponse:
        """
        Description: 应用画像应用服务关联资源节点信息
        Summary: 应用画像应用服务关联资源节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitNodeResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.node.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_node_ex_async(
        self,
        request: cas_models.ListAppportraitNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitNodeResponse:
        """
        Description: 应用画像应用服务关联资源节点信息
        Summary: 应用画像应用服务关联资源节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitNodeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.node.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_appgroup(
        self,
        request: cas_models.ListAppportraitAppgroupRequest,
    ) -> cas_models.ListAppportraitAppgroupResponse:
        """
        Description: 查询应用画像应用分组列表
        Summary: 应用画像应用分组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_appgroup_ex(request, headers, runtime)

    async def list_appportrait_appgroup_async(
        self,
        request: cas_models.ListAppportraitAppgroupRequest,
    ) -> cas_models.ListAppportraitAppgroupResponse:
        """
        Description: 查询应用画像应用分组列表
        Summary: 应用画像应用分组列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_appgroup_ex_async(request, headers, runtime)

    def list_appportrait_appgroup_ex(
        self,
        request: cas_models.ListAppportraitAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitAppgroupResponse:
        """
        Description: 查询应用画像应用分组列表
        Summary: 应用画像应用分组列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitAppgroupResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.appgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_appgroup_ex_async(
        self,
        request: cas_models.ListAppportraitAppgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitAppgroupResponse:
        """
        Description: 查询应用画像应用分组列表
        Summary: 应用画像应用分组列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitAppgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.appgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_ecs(
        self,
        request: cas_models.ListAppportraitEcsRequest,
    ) -> cas_models.ListAppportraitEcsResponse:
        """
        Description: 111
        Summary: ece列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_ecs_ex(request, headers, runtime)

    async def list_appportrait_ecs_async(
        self,
        request: cas_models.ListAppportraitEcsRequest,
    ) -> cas_models.ListAppportraitEcsResponse:
        """
        Description: 111
        Summary: ece列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_ecs_ex_async(request, headers, runtime)

    def list_appportrait_ecs_ex(
        self,
        request: cas_models.ListAppportraitEcsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitEcsResponse:
        """
        Description: 111
        Summary: ece列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitEcsResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.ecs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_ecs_ex_async(
        self,
        request: cas_models.ListAppportraitEcsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitEcsResponse:
        """
        Description: 111
        Summary: ece列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitEcsResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.ecs.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_rds(
        self,
        request: cas_models.ListAppportraitRdsRequest,
    ) -> cas_models.ListAppportraitRdsResponse:
        """
        Description: 1
        Summary: rds列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_rds_ex(request, headers, runtime)

    async def list_appportrait_rds_async(
        self,
        request: cas_models.ListAppportraitRdsRequest,
    ) -> cas_models.ListAppportraitRdsResponse:
        """
        Description: 1
        Summary: rds列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_rds_ex_async(request, headers, runtime)

    def list_appportrait_rds_ex(
        self,
        request: cas_models.ListAppportraitRdsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitRdsResponse:
        """
        Description: 1
        Summary: rds列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitRdsResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.rds.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_rds_ex_async(
        self,
        request: cas_models.ListAppportraitRdsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitRdsResponse:
        """
        Description: 1
        Summary: rds列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitRdsResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.rds.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_slb(
        self,
        request: cas_models.ListAppportraitSlbRequest,
    ) -> cas_models.ListAppportraitSlbResponse:
        """
        Description: 1
        Summary: slb列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_slb_ex(request, headers, runtime)

    async def list_appportrait_slb_async(
        self,
        request: cas_models.ListAppportraitSlbRequest,
    ) -> cas_models.ListAppportraitSlbResponse:
        """
        Description: 1
        Summary: slb列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_slb_ex_async(request, headers, runtime)

    def list_appportrait_slb_ex(
        self,
        request: cas_models.ListAppportraitSlbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitSlbResponse:
        """
        Description: 1
        Summary: slb列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitSlbResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.slb.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_slb_ex_async(
        self,
        request: cas_models.ListAppportraitSlbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitSlbResponse:
        """
        Description: 1
        Summary: slb列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitSlbResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.slb.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_appportrait_pod(
        self,
        request: cas_models.ListAppportraitPodRequest,
    ) -> cas_models.ListAppportraitPodResponse:
        """
        Description: 1
        Summary: pod列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_appportrait_pod_ex(request, headers, runtime)

    async def list_appportrait_pod_async(
        self,
        request: cas_models.ListAppportraitPodRequest,
    ) -> cas_models.ListAppportraitPodResponse:
        """
        Description: 1
        Summary: pod列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_appportrait_pod_ex_async(request, headers, runtime)

    def list_appportrait_pod_ex(
        self,
        request: cas_models.ListAppportraitPodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitPodResponse:
        """
        Description: 1
        Summary: pod列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitPodResponse(),
            self.do_request('1.0', 'antcloud.cas.appportrait.pod.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_appportrait_pod_ex_async(
        self,
        request: cas_models.ListAppportraitPodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAppportraitPodResponse:
        """
        Description: 1
        Summary: pod列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAppportraitPodResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.appportrait.pod.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_computer(
        self,
        request: cas_models.CreateComputerRequest,
    ) -> cas_models.CreateComputerResponse:
        """
        Description: 创建 computer 实例
        Summary: 创建 computer 实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_computer_ex(request, headers, runtime)

    async def create_computer_async(
        self,
        request: cas_models.CreateComputerRequest,
    ) -> cas_models.CreateComputerResponse:
        """
        Description: 创建 computer 实例
        Summary: 创建 computer 实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_computer_ex_async(request, headers, runtime)

    def create_computer_ex(
        self,
        request: cas_models.CreateComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateComputerResponse:
        """
        Description: 创建 computer 实例
        Summary: 创建 computer 实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_computer_ex_async(
        self,
        request: cas_models.CreateComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateComputerResponse:
        """
        Description: 创建 computer 实例
        Summary: 创建 computer 实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_computer(
        self,
        request: cas_models.DeleteComputerRequest,
    ) -> cas_models.DeleteComputerResponse:
        """
        Description: computer 删除
        Summary: computer 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_computer_ex(request, headers, runtime)

    async def delete_computer_async(
        self,
        request: cas_models.DeleteComputerRequest,
    ) -> cas_models.DeleteComputerResponse:
        """
        Description: computer 删除
        Summary: computer 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_computer_ex_async(request, headers, runtime)

    def delete_computer_ex(
        self,
        request: cas_models.DeleteComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteComputerResponse:
        """
        Description: computer 删除
        Summary: computer 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_computer_ex_async(
        self,
        request: cas_models.DeleteComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteComputerResponse:
        """
        Description: computer 删除
        Summary: computer 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_computer(
        self,
        request: cas_models.ImportComputerRequest,
    ) -> cas_models.ImportComputerResponse:
        """
        Description: computer 导入
        Summary: computer 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_computer_ex(request, headers, runtime)

    async def import_computer_async(
        self,
        request: cas_models.ImportComputerRequest,
    ) -> cas_models.ImportComputerResponse:
        """
        Description: computer 导入
        Summary: computer 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_computer_ex_async(request, headers, runtime)

    def import_computer_ex(
        self,
        request: cas_models.ImportComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportComputerResponse:
        """
        Description: computer 导入
        Summary: computer 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_computer_ex_async(
        self,
        request: cas_models.ImportComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportComputerResponse:
        """
        Description: computer 导入
        Summary: computer 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_database(
        self,
        request: cas_models.CreateDatabaseRequest,
    ) -> cas_models.CreateDatabaseResponse:
        """
        Description: database 创建
        Summary: database 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_database_ex(request, headers, runtime)

    async def create_database_async(
        self,
        request: cas_models.CreateDatabaseRequest,
    ) -> cas_models.CreateDatabaseResponse:
        """
        Description: database 创建
        Summary: database 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_database_ex_async(request, headers, runtime)

    def create_database_ex(
        self,
        request: cas_models.CreateDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateDatabaseResponse:
        """
        Description: database 创建
        Summary: database 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_database_ex_async(
        self,
        request: cas_models.CreateDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateDatabaseResponse:
        """
        Description: database 创建
        Summary: database 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_database(
        self,
        request: cas_models.ImportDatabaseRequest,
    ) -> cas_models.ImportDatabaseResponse:
        """
        Description: database 导入
        Summary: database 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_database_ex(request, headers, runtime)

    async def import_database_async(
        self,
        request: cas_models.ImportDatabaseRequest,
    ) -> cas_models.ImportDatabaseResponse:
        """
        Description: database 导入
        Summary: database 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_database_ex_async(request, headers, runtime)

    def import_database_ex(
        self,
        request: cas_models.ImportDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportDatabaseResponse:
        """
        Description: database 导入
        Summary: database 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_database_ex_async(
        self,
        request: cas_models.ImportDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportDatabaseResponse:
        """
        Description: database 导入
        Summary: database 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_database(
        self,
        request: cas_models.DeleteDatabaseRequest,
    ) -> cas_models.DeleteDatabaseResponse:
        """
        Description: database 删除
        Summary: database 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_database_ex(request, headers, runtime)

    async def delete_database_async(
        self,
        request: cas_models.DeleteDatabaseRequest,
    ) -> cas_models.DeleteDatabaseResponse:
        """
        Description: database 删除
        Summary: database 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_database_ex_async(request, headers, runtime)

    def delete_database_ex(
        self,
        request: cas_models.DeleteDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDatabaseResponse:
        """
        Description: database 删除
        Summary: database 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_database_ex_async(
        self,
        request: cas_models.DeleteDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDatabaseResponse:
        """
        Description: database 删除
        Summary: database 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_loadbalance(
        self,
        request: cas_models.CreateLoadbalanceRequest,
    ) -> cas_models.CreateLoadbalanceResponse:
        """
        Description: loadbalance 创建
        Summary: loadbalance 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_loadbalance_ex(request, headers, runtime)

    async def create_loadbalance_async(
        self,
        request: cas_models.CreateLoadbalanceRequest,
    ) -> cas_models.CreateLoadbalanceResponse:
        """
        Description: loadbalance 创建
        Summary: loadbalance 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_loadbalance_ex_async(request, headers, runtime)

    def create_loadbalance_ex(
        self,
        request: cas_models.CreateLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceResponse:
        """
        Description: loadbalance 创建
        Summary: loadbalance 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_loadbalance_ex_async(
        self,
        request: cas_models.CreateLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceResponse:
        """
        Description: loadbalance 创建
        Summary: loadbalance 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_loadbalance(
        self,
        request: cas_models.DeleteLoadbalanceRequest,
    ) -> cas_models.DeleteLoadbalanceResponse:
        """
        Description: loadbalance 删除
        Summary: loadbalance 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_loadbalance_ex(request, headers, runtime)

    async def delete_loadbalance_async(
        self,
        request: cas_models.DeleteLoadbalanceRequest,
    ) -> cas_models.DeleteLoadbalanceResponse:
        """
        Description: loadbalance 删除
        Summary: loadbalance 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_loadbalance_ex_async(request, headers, runtime)

    def delete_loadbalance_ex(
        self,
        request: cas_models.DeleteLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceResponse:
        """
        Description: loadbalance 删除
        Summary: loadbalance 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_loadbalance_ex_async(
        self,
        request: cas_models.DeleteLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceResponse:
        """
        Description: loadbalance 删除
        Summary: loadbalance 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_loadbalance(
        self,
        request: cas_models.ImportLoadbalanceRequest,
    ) -> cas_models.ImportLoadbalanceResponse:
        """
        Description: loadbalance 导入
        Summary: loadbalance 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_loadbalance_ex(request, headers, runtime)

    async def import_loadbalance_async(
        self,
        request: cas_models.ImportLoadbalanceRequest,
    ) -> cas_models.ImportLoadbalanceResponse:
        """
        Description: loadbalance 导入
        Summary: loadbalance 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_loadbalance_ex_async(request, headers, runtime)

    def import_loadbalance_ex(
        self,
        request: cas_models.ImportLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportLoadbalanceResponse:
        """
        Description: loadbalance 导入
        Summary: loadbalance 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_loadbalance_ex_async(
        self,
        request: cas_models.ImportLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportLoadbalanceResponse:
        """
        Description: loadbalance 导入
        Summary: loadbalance 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_vpc(
        self,
        request: cas_models.CreateVpcRequest,
    ) -> cas_models.CreateVpcResponse:
        """
        Description: vpc 创建
        Summary: vpc 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_vpc_ex(request, headers, runtime)

    async def create_vpc_async(
        self,
        request: cas_models.CreateVpcRequest,
    ) -> cas_models.CreateVpcResponse:
        """
        Description: vpc 创建
        Summary: vpc 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_vpc_ex_async(request, headers, runtime)

    def create_vpc_ex(
        self,
        request: cas_models.CreateVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateVpcResponse:
        """
        Description: vpc 创建
        Summary: vpc 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_vpc_ex_async(
        self,
        request: cas_models.CreateVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateVpcResponse:
        """
        Description: vpc 创建
        Summary: vpc 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_vpc(
        self,
        request: cas_models.DeleteVpcRequest,
    ) -> cas_models.DeleteVpcResponse:
        """
        Description: vpc 删除
        Summary: vpc 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_vpc_ex(request, headers, runtime)

    async def delete_vpc_async(
        self,
        request: cas_models.DeleteVpcRequest,
    ) -> cas_models.DeleteVpcResponse:
        """
        Description: vpc 删除
        Summary: vpc 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_vpc_ex_async(request, headers, runtime)

    def delete_vpc_ex(
        self,
        request: cas_models.DeleteVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteVpcResponse:
        """
        Description: vpc 删除
        Summary: vpc 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_vpc_ex_async(
        self,
        request: cas_models.DeleteVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteVpcResponse:
        """
        Description: vpc 删除
        Summary: vpc 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def release_computer(
        self,
        request: cas_models.ReleaseComputerRequest,
    ) -> cas_models.ReleaseComputerResponse:
        """
        Description: computer 从应用中释放
        Summary: computer 从应用中释放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.release_computer_ex(request, headers, runtime)

    async def release_computer_async(
        self,
        request: cas_models.ReleaseComputerRequest,
    ) -> cas_models.ReleaseComputerResponse:
        """
        Description: computer 从应用中释放
        Summary: computer 从应用中释放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.release_computer_ex_async(request, headers, runtime)

    def release_computer_ex(
        self,
        request: cas_models.ReleaseComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReleaseComputerResponse:
        """
        Description: computer 从应用中释放
        Summary: computer 从应用中释放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReleaseComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def release_computer_ex_async(
        self,
        request: cas_models.ReleaseComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReleaseComputerResponse:
        """
        Description: computer 从应用中释放
        Summary: computer 从应用中释放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReleaseComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_computer_password(
        self,
        request: cas_models.ReinitComputerPasswordRequest,
    ) -> cas_models.ReinitComputerPasswordResponse:
        """
        Description: 重置 computer 密码
        Summary: 重置 computer 密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_computer_password_ex(request, headers, runtime)

    async def reinit_computer_password_async(
        self,
        request: cas_models.ReinitComputerPasswordRequest,
    ) -> cas_models.ReinitComputerPasswordResponse:
        """
        Description: 重置 computer 密码
        Summary: 重置 computer 密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_computer_password_ex_async(request, headers, runtime)

    def reinit_computer_password_ex(
        self,
        request: cas_models.ReinitComputerPasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReinitComputerPasswordResponse:
        """
        Description: 重置 computer 密码
        Summary: 重置 computer 密码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReinitComputerPasswordResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.password.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_computer_password_ex_async(
        self,
        request: cas_models.ReinitComputerPasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReinitComputerPasswordResponse:
        """
        Description: 重置 computer 密码
        Summary: 重置 computer 密码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReinitComputerPasswordResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.password.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def release_database(
        self,
        request: cas_models.ReleaseDatabaseRequest,
    ) -> cas_models.ReleaseDatabaseResponse:
        """
        Description: database 从应用中释放
        Summary: database 从应用中释放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.release_database_ex(request, headers, runtime)

    async def release_database_async(
        self,
        request: cas_models.ReleaseDatabaseRequest,
    ) -> cas_models.ReleaseDatabaseResponse:
        """
        Description: database 从应用中释放
        Summary: database 从应用中释放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.release_database_ex_async(request, headers, runtime)

    def release_database_ex(
        self,
        request: cas_models.ReleaseDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReleaseDatabaseResponse:
        """
        Description: database 从应用中释放
        Summary: database 从应用中释放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReleaseDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def release_database_ex_async(
        self,
        request: cas_models.ReleaseDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReleaseDatabaseResponse:
        """
        Description: database 从应用中释放
        Summary: database 从应用中释放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReleaseDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_computer(
        self,
        request: cas_models.RemoveComputerRequest,
    ) -> cas_models.RemoveComputerResponse:
        """
        Description: 移除 computer
        Summary: 移除 computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_computer_ex(request, headers, runtime)

    async def remove_computer_async(
        self,
        request: cas_models.RemoveComputerRequest,
    ) -> cas_models.RemoveComputerResponse:
        """
        Description: 移除 computer
        Summary: 移除 computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_computer_ex_async(request, headers, runtime)

    def remove_computer_ex(
        self,
        request: cas_models.RemoveComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveComputerResponse:
        """
        Description: 移除 computer
        Summary: 移除 computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_computer_ex_async(
        self,
        request: cas_models.RemoveComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveComputerResponse:
        """
        Description: 移除 computer
        Summary: 移除 computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_loadbalance(
        self,
        request: cas_models.RemoveLoadbalanceRequest,
    ) -> cas_models.RemoveLoadbalanceResponse:
        """
        Description: loadbalance 移除
        Summary: loadbalance 移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_loadbalance_ex(request, headers, runtime)

    async def remove_loadbalance_async(
        self,
        request: cas_models.RemoveLoadbalanceRequest,
    ) -> cas_models.RemoveLoadbalanceResponse:
        """
        Description: loadbalance 移除
        Summary: loadbalance 移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_loadbalance_ex_async(request, headers, runtime)

    def remove_loadbalance_ex(
        self,
        request: cas_models.RemoveLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveLoadbalanceResponse:
        """
        Description: loadbalance 移除
        Summary: loadbalance 移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_loadbalance_ex_async(
        self,
        request: cas_models.RemoveLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveLoadbalanceResponse:
        """
        Description: loadbalance 移除
        Summary: loadbalance 移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_database(
        self,
        request: cas_models.RemoveDatabaseRequest,
    ) -> cas_models.RemoveDatabaseResponse:
        """
        Description: database 移除
        Summary: database 移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_database_ex(request, headers, runtime)

    async def remove_database_async(
        self,
        request: cas_models.RemoveDatabaseRequest,
    ) -> cas_models.RemoveDatabaseResponse:
        """
        Description: database 移除
        Summary: database 移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_database_ex_async(request, headers, runtime)

    def remove_database_ex(
        self,
        request: cas_models.RemoveDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveDatabaseResponse:
        """
        Description: database 移除
        Summary: database 移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_database_ex_async(
        self,
        request: cas_models.RemoveDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveDatabaseResponse:
        """
        Description: database 移除
        Summary: database 移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def release_loadbalance(
        self,
        request: cas_models.ReleaseLoadbalanceRequest,
    ) -> cas_models.ReleaseLoadbalanceResponse:
        """
        Description: loadbalance 从应用中释放
        Summary: loadbalance 从应用中释放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.release_loadbalance_ex(request, headers, runtime)

    async def release_loadbalance_async(
        self,
        request: cas_models.ReleaseLoadbalanceRequest,
    ) -> cas_models.ReleaseLoadbalanceResponse:
        """
        Description: loadbalance 从应用中释放
        Summary: loadbalance 从应用中释放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.release_loadbalance_ex_async(request, headers, runtime)

    def release_loadbalance_ex(
        self,
        request: cas_models.ReleaseLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReleaseLoadbalanceResponse:
        """
        Description: loadbalance 从应用中释放
        Summary: loadbalance 从应用中释放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReleaseLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def release_loadbalance_ex_async(
        self,
        request: cas_models.ReleaseLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReleaseLoadbalanceResponse:
        """
        Description: loadbalance 从应用中释放
        Summary: loadbalance 从应用中释放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReleaseLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_database_account(
        self,
        request: cas_models.CreateDatabaseAccountRequest,
    ) -> cas_models.CreateDatabaseAccountResponse:
        """
        Description: database account 创建
        Summary: database account 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_database_account_ex(request, headers, runtime)

    async def create_database_account_async(
        self,
        request: cas_models.CreateDatabaseAccountRequest,
    ) -> cas_models.CreateDatabaseAccountResponse:
        """
        Description: database account 创建
        Summary: database account 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_database_account_ex_async(request, headers, runtime)

    def create_database_account_ex(
        self,
        request: cas_models.CreateDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateDatabaseAccountResponse:
        """
        Description: database account 创建
        Summary: database account 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateDatabaseAccountResponse(),
            self.do_request('1.0', 'antcloud.cas.database.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_database_account_ex_async(
        self,
        request: cas_models.CreateDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateDatabaseAccountResponse:
        """
        Description: database account 创建
        Summary: database account 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateDatabaseAccountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_securitygroup(
        self,
        request: cas_models.CreateSecuritygroupRequest,
    ) -> cas_models.CreateSecuritygroupResponse:
        """
        Description: 安全域/组 创建
        Summary: 安全域/组 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_securitygroup_ex(request, headers, runtime)

    async def create_securitygroup_async(
        self,
        request: cas_models.CreateSecuritygroupRequest,
    ) -> cas_models.CreateSecuritygroupResponse:
        """
        Description: 安全域/组 创建
        Summary: 安全域/组 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_securitygroup_ex_async(request, headers, runtime)

    def create_securitygroup_ex(
        self,
        request: cas_models.CreateSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSecuritygroupResponse:
        """
        Description: 安全域/组 创建
        Summary: 安全域/组 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_securitygroup_ex_async(
        self,
        request: cas_models.CreateSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSecuritygroupResponse:
        """
        Description: 安全域/组 创建
        Summary: 安全域/组 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_securitygroup(
        self,
        request: cas_models.ImportSecuritygroupRequest,
    ) -> cas_models.ImportSecuritygroupResponse:
        """
        Description: securitygroup 导入
        Summary: securitygroup 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_securitygroup_ex(request, headers, runtime)

    async def import_securitygroup_async(
        self,
        request: cas_models.ImportSecuritygroupRequest,
    ) -> cas_models.ImportSecuritygroupResponse:
        """
        Description: securitygroup 导入
        Summary: securitygroup 导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_securitygroup_ex_async(request, headers, runtime)

    def import_securitygroup_ex(
        self,
        request: cas_models.ImportSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportSecuritygroupResponse:
        """
        Description: securitygroup 导入
        Summary: securitygroup 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_securitygroup_ex_async(
        self,
        request: cas_models.ImportSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportSecuritygroupResponse:
        """
        Description: securitygroup 导入
        Summary: securitygroup 导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_securitygroup(
        self,
        request: cas_models.RemoveSecuritygroupRequest,
    ) -> cas_models.RemoveSecuritygroupResponse:
        """
        Description: securitygroup 移除
        Summary: securitygroup 移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_securitygroup_ex(request, headers, runtime)

    async def remove_securitygroup_async(
        self,
        request: cas_models.RemoveSecuritygroupRequest,
    ) -> cas_models.RemoveSecuritygroupResponse:
        """
        Description: securitygroup 移除
        Summary: securitygroup 移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_securitygroup_ex_async(request, headers, runtime)

    def remove_securitygroup_ex(
        self,
        request: cas_models.RemoveSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveSecuritygroupResponse:
        """
        Description: securitygroup 移除
        Summary: securitygroup 移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_securitygroup_ex_async(
        self,
        request: cas_models.RemoveSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveSecuritygroupResponse:
        """
        Description: securitygroup 移除
        Summary: securitygroup 移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_securitygroup(
        self,
        request: cas_models.DeleteSecuritygroupRequest,
    ) -> cas_models.DeleteSecuritygroupResponse:
        """
        Description: securitygroup 删除
        Summary: securitygroup 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_securitygroup_ex(request, headers, runtime)

    async def delete_securitygroup_async(
        self,
        request: cas_models.DeleteSecuritygroupRequest,
    ) -> cas_models.DeleteSecuritygroupResponse:
        """
        Description: securitygroup 删除
        Summary: securitygroup 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_securitygroup_ex_async(request, headers, runtime)

    def delete_securitygroup_ex(
        self,
        request: cas_models.DeleteSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteSecuritygroupResponse:
        """
        Description: securitygroup 删除
        Summary: securitygroup 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_securitygroup_ex_async(
        self,
        request: cas_models.DeleteSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteSecuritygroupResponse:
        """
        Description: securitygroup 删除
        Summary: securitygroup 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_database_schema(
        self,
        request: cas_models.DeleteDatabaseSchemaRequest,
    ) -> cas_models.DeleteDatabaseSchemaResponse:
        """
        Description: schema 删除
        Summary: schema 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_database_schema_ex(request, headers, runtime)

    async def delete_database_schema_async(
        self,
        request: cas_models.DeleteDatabaseSchemaRequest,
    ) -> cas_models.DeleteDatabaseSchemaResponse:
        """
        Description: schema 删除
        Summary: schema 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_database_schema_ex_async(request, headers, runtime)

    def delete_database_schema_ex(
        self,
        request: cas_models.DeleteDatabaseSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDatabaseSchemaResponse:
        """
        Description: schema 删除
        Summary: schema 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDatabaseSchemaResponse(),
            self.do_request('1.0', 'antcloud.cas.database.schema.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_database_schema_ex_async(
        self,
        request: cas_models.DeleteDatabaseSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDatabaseSchemaResponse:
        """
        Description: schema 删除
        Summary: schema 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDatabaseSchemaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.schema.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_database_account(
        self,
        request: cas_models.DeleteDatabaseAccountRequest,
    ) -> cas_models.DeleteDatabaseAccountResponse:
        """
        Description: account 删除
        Summary: account 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_database_account_ex(request, headers, runtime)

    async def delete_database_account_async(
        self,
        request: cas_models.DeleteDatabaseAccountRequest,
    ) -> cas_models.DeleteDatabaseAccountResponse:
        """
        Description: account 删除
        Summary: account 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_database_account_ex_async(request, headers, runtime)

    def delete_database_account_ex(
        self,
        request: cas_models.DeleteDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDatabaseAccountResponse:
        """
        Description: account 删除
        Summary: account 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDatabaseAccountResponse(),
            self.do_request('1.0', 'antcloud.cas.database.account.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_database_account_ex_async(
        self,
        request: cas_models.DeleteDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDatabaseAccountResponse:
        """
        Description: account 删除
        Summary: account 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDatabaseAccountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.account.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_vpc_vswitch(
        self,
        request: cas_models.DeleteVpcVswitchRequest,
    ) -> cas_models.DeleteVpcVswitchResponse:
        """
        Description: vswitch 删除
        Summary: vswitch 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_vpc_vswitch_ex(request, headers, runtime)

    async def delete_vpc_vswitch_async(
        self,
        request: cas_models.DeleteVpcVswitchRequest,
    ) -> cas_models.DeleteVpcVswitchResponse:
        """
        Description: vswitch 删除
        Summary: vswitch 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_vpc_vswitch_ex_async(request, headers, runtime)

    def delete_vpc_vswitch_ex(
        self,
        request: cas_models.DeleteVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteVpcVswitchResponse:
        """
        Description: vswitch 删除
        Summary: vswitch 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteVpcVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vswitch.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_vpc_vswitch_ex_async(
        self,
        request: cas_models.DeleteVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteVpcVswitchResponse:
        """
        Description: vswitch 删除
        Summary: vswitch 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteVpcVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vswitch.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_loadbalance_listener(
        self,
        request: cas_models.DeleteLoadbalanceListenerRequest,
    ) -> cas_models.DeleteLoadbalanceListenerResponse:
        """
        Description: listener 删除
        Summary: listener 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_loadbalance_listener_ex(request, headers, runtime)

    async def delete_loadbalance_listener_async(
        self,
        request: cas_models.DeleteLoadbalanceListenerRequest,
    ) -> cas_models.DeleteLoadbalanceListenerResponse:
        """
        Description: listener 删除
        Summary: listener 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_loadbalance_listener_ex_async(request, headers, runtime)

    def delete_loadbalance_listener_ex(
        self,
        request: cas_models.DeleteLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceListenerResponse:
        """
        Description: listener 删除
        Summary: listener 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_loadbalance_listener_ex_async(
        self,
        request: cas_models.DeleteLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceListenerResponse:
        """
        Description: listener 删除
        Summary: listener 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_vpc_vroutertable(
        self,
        request: cas_models.DeleteVpcVroutertableRequest,
    ) -> cas_models.DeleteVpcVroutertableResponse:
        """
        Description: 路由表删除
        Summary: 路由表删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_vpc_vroutertable_ex(request, headers, runtime)

    async def delete_vpc_vroutertable_async(
        self,
        request: cas_models.DeleteVpcVroutertableRequest,
    ) -> cas_models.DeleteVpcVroutertableResponse:
        """
        Description: 路由表删除
        Summary: 路由表删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_vpc_vroutertable_ex_async(request, headers, runtime)

    def delete_vpc_vroutertable_ex(
        self,
        request: cas_models.DeleteVpcVroutertableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteVpcVroutertableResponse:
        """
        Description: 路由表删除
        Summary: 路由表删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteVpcVroutertableResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vroutertable.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_vpc_vroutertable_ex_async(
        self,
        request: cas_models.DeleteVpcVroutertableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteVpcVroutertableResponse:
        """
        Description: 路由表删除
        Summary: 路由表删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteVpcVroutertableResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vroutertable.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_securitygroup_instance(
        self,
        request: cas_models.RemoveSecuritygroupInstanceRequest,
    ) -> cas_models.RemoveSecuritygroupInstanceResponse:
        """
        Description: 安全组中实例移除
        Summary: 安全组中实例移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_securitygroup_instance_ex(request, headers, runtime)

    async def remove_securitygroup_instance_async(
        self,
        request: cas_models.RemoveSecuritygroupInstanceRequest,
    ) -> cas_models.RemoveSecuritygroupInstanceResponse:
        """
        Description: 安全组中实例移除
        Summary: 安全组中实例移除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_securitygroup_instance_ex_async(request, headers, runtime)

    def remove_securitygroup_instance_ex(
        self,
        request: cas_models.RemoveSecuritygroupInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveSecuritygroupInstanceResponse:
        """
        Description: 安全组中实例移除
        Summary: 安全组中实例移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveSecuritygroupInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.instance.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_securitygroup_instance_ex_async(
        self,
        request: cas_models.RemoveSecuritygroupInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveSecuritygroupInstanceResponse:
        """
        Description: 安全组中实例移除
        Summary: 安全组中实例移除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveSecuritygroupInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.instance.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_securitygroup_permission(
        self,
        request: cas_models.DeleteSecuritygroupPermissionRequest,
    ) -> cas_models.DeleteSecuritygroupPermissionResponse:
        """
        Description: 安全组 permission 删除
        Summary: 安全组 permission 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_securitygroup_permission_ex(request, headers, runtime)

    async def delete_securitygroup_permission_async(
        self,
        request: cas_models.DeleteSecuritygroupPermissionRequest,
    ) -> cas_models.DeleteSecuritygroupPermissionResponse:
        """
        Description: 安全组 permission 删除
        Summary: 安全组 permission 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_securitygroup_permission_ex_async(request, headers, runtime)

    def delete_securitygroup_permission_ex(
        self,
        request: cas_models.DeleteSecuritygroupPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteSecuritygroupPermissionResponse:
        """
        Description: 安全组 permission 删除
        Summary: 安全组 permission 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteSecuritygroupPermissionResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.permission.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_securitygroup_permission_ex_async(
        self,
        request: cas_models.DeleteSecuritygroupPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteSecuritygroupPermissionResponse:
        """
        Description: 安全组 permission 删除
        Summary: 安全组 permission 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteSecuritygroupPermissionResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.permission.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_loadbalance_securityip(
        self,
        request: cas_models.RemoveLoadbalanceSecurityipRequest,
    ) -> cas_models.RemoveLoadbalanceSecurityipResponse:
        """
        Description: lb 监听器访问 ip 删除
        Summary: lb 监听器访问 ip 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_loadbalance_securityip_ex(request, headers, runtime)

    async def remove_loadbalance_securityip_async(
        self,
        request: cas_models.RemoveLoadbalanceSecurityipRequest,
    ) -> cas_models.RemoveLoadbalanceSecurityipResponse:
        """
        Description: lb 监听器访问 ip 删除
        Summary: lb 监听器访问 ip 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_loadbalance_securityip_ex_async(request, headers, runtime)

    def remove_loadbalance_securityip_ex(
        self,
        request: cas_models.RemoveLoadbalanceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveLoadbalanceSecurityipResponse:
        """
        Description: lb 监听器访问 ip 删除
        Summary: lb 监听器访问 ip 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveLoadbalanceSecurityipResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.securityip.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_loadbalance_securityip_ex_async(
        self,
        request: cas_models.RemoveLoadbalanceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveLoadbalanceSecurityipResponse:
        """
        Description: lb 监听器访问 ip 删除
        Summary: lb 监听器访问 ip 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveLoadbalanceSecurityipResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.securityip.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_application(
        self,
        request: cas_models.CreateApplicationRequest,
    ) -> cas_models.CreateApplicationResponse:
        """
        Description: 应用创建
        Summary: 应用创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_application_ex(request, headers, runtime)

    async def create_application_async(
        self,
        request: cas_models.CreateApplicationRequest,
    ) -> cas_models.CreateApplicationResponse:
        """
        Description: 应用创建
        Summary: 应用创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_application_ex_async(request, headers, runtime)

    def create_application_ex(
        self,
        request: cas_models.CreateApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateApplicationResponse:
        """
        Description: 应用创建
        Summary: 应用创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateApplicationResponse(),
            self.do_request('1.0', 'antcloud.cas.application.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_application_ex_async(
        self,
        request: cas_models.CreateApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateApplicationResponse:
        """
        Description: 应用创建
        Summary: 应用创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_application(
        self,
        request: cas_models.DeleteApplicationRequest,
    ) -> cas_models.DeleteApplicationResponse:
        """
        Description: 应用删除
        Summary: 应用删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_application_ex(request, headers, runtime)

    async def delete_application_async(
        self,
        request: cas_models.DeleteApplicationRequest,
    ) -> cas_models.DeleteApplicationResponse:
        """
        Description: 应用删除
        Summary: 应用删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_application_ex_async(request, headers, runtime)

    def delete_application_ex(
        self,
        request: cas_models.DeleteApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteApplicationResponse:
        """
        Description: 应用删除
        Summary: 应用删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteApplicationResponse(),
            self.do_request('1.0', 'antcloud.cas.application.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_application_ex_async(
        self,
        request: cas_models.DeleteApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteApplicationResponse:
        """
        Description: 应用删除
        Summary: 应用删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.application.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_vpc_vswitch(
        self,
        request: cas_models.CreateVpcVswitchRequest,
    ) -> cas_models.CreateVpcVswitchResponse:
        """
        Description: vswitch 创建
        Summary: vswitch 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_vpc_vswitch_ex(request, headers, runtime)

    async def create_vpc_vswitch_async(
        self,
        request: cas_models.CreateVpcVswitchRequest,
    ) -> cas_models.CreateVpcVswitchResponse:
        """
        Description: vswitch 创建
        Summary: vswitch 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_vpc_vswitch_ex_async(request, headers, runtime)

    def create_vpc_vswitch_ex(
        self,
        request: cas_models.CreateVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateVpcVswitchResponse:
        """
        Description: vswitch 创建
        Summary: vswitch 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateVpcVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vswitch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_vpc_vswitch_ex_async(
        self,
        request: cas_models.CreateVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateVpcVswitchResponse:
        """
        Description: vswitch 创建
        Summary: vswitch 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateVpcVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vswitch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_vpc_vroutertable(
        self,
        request: cas_models.CreateVpcVroutertableRequest,
    ) -> cas_models.CreateVpcVroutertableResponse:
        """
        Description: vRouterTable 创建
        Summary: vRouterTable 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_vpc_vroutertable_ex(request, headers, runtime)

    async def create_vpc_vroutertable_async(
        self,
        request: cas_models.CreateVpcVroutertableRequest,
    ) -> cas_models.CreateVpcVroutertableResponse:
        """
        Description: vRouterTable 创建
        Summary: vRouterTable 创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_vpc_vroutertable_ex_async(request, headers, runtime)

    def create_vpc_vroutertable_ex(
        self,
        request: cas_models.CreateVpcVroutertableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateVpcVroutertableResponse:
        """
        Description: vRouterTable 创建
        Summary: vRouterTable 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateVpcVroutertableResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vroutertable.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_vpc_vroutertable_ex_async(
        self,
        request: cas_models.CreateVpcVroutertableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateVpcVroutertableResponse:
        """
        Description: vRouterTable 创建
        Summary: vRouterTable 创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateVpcVroutertableResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vroutertable.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_securitygroup_instance(
        self,
        request: cas_models.AddSecuritygroupInstanceRequest,
    ) -> cas_models.AddSecuritygroupInstanceResponse:
        """
        Description: 安全组添加实例
        Summary: 安全组添加实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_securitygroup_instance_ex(request, headers, runtime)

    async def add_securitygroup_instance_async(
        self,
        request: cas_models.AddSecuritygroupInstanceRequest,
    ) -> cas_models.AddSecuritygroupInstanceResponse:
        """
        Description: 安全组添加实例
        Summary: 安全组添加实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_securitygroup_instance_ex_async(request, headers, runtime)

    def add_securitygroup_instance_ex(
        self,
        request: cas_models.AddSecuritygroupInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddSecuritygroupInstanceResponse:
        """
        Description: 安全组添加实例
        Summary: 安全组添加实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddSecuritygroupInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.instance.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_securitygroup_instance_ex_async(
        self,
        request: cas_models.AddSecuritygroupInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddSecuritygroupInstanceResponse:
        """
        Description: 安全组添加实例
        Summary: 安全组添加实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddSecuritygroupInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.instance.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_database_spec(
        self,
        request: cas_models.UpdateDatabaseSpecRequest,
    ) -> cas_models.UpdateDatabaseSpecResponse:
        """
        Description: db 规格修改
        Summary: db 规格修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_database_spec_ex(request, headers, runtime)

    async def update_database_spec_async(
        self,
        request: cas_models.UpdateDatabaseSpecRequest,
    ) -> cas_models.UpdateDatabaseSpecResponse:
        """
        Description: db 规格修改
        Summary: db 规格修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_database_spec_ex_async(request, headers, runtime)

    def update_database_spec_ex(
        self,
        request: cas_models.UpdateDatabaseSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseSpecResponse:
        """
        Description: db 规格修改
        Summary: db 规格修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseSpecResponse(),
            self.do_request('1.0', 'antcloud.cas.database.spec.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_database_spec_ex_async(
        self,
        request: cas_models.UpdateDatabaseSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseSpecResponse:
        """
        Description: db 规格修改
        Summary: db 规格修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseSpecResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.spec.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalance_accesscontrol(
        self,
        request: cas_models.UpdateLoadbalanceAccesscontrolRequest,
    ) -> cas_models.UpdateLoadbalanceAccesscontrolResponse:
        """
        Description: lb 访问控制修改
        Summary: lb 访问控制修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalance_accesscontrol_ex(request, headers, runtime)

    async def update_loadbalance_accesscontrol_async(
        self,
        request: cas_models.UpdateLoadbalanceAccesscontrolRequest,
    ) -> cas_models.UpdateLoadbalanceAccesscontrolResponse:
        """
        Description: lb 访问控制修改
        Summary: lb 访问控制修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalance_accesscontrol_ex_async(request, headers, runtime)

    def update_loadbalance_accesscontrol_ex(
        self,
        request: cas_models.UpdateLoadbalanceAccesscontrolRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceAccesscontrolResponse:
        """
        Description: lb 访问控制修改
        Summary: lb 访问控制修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceAccesscontrolResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.accesscontrol.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalance_accesscontrol_ex_async(
        self,
        request: cas_models.UpdateLoadbalanceAccesscontrolRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceAccesscontrolResponse:
        """
        Description: lb 访问控制修改
        Summary: lb 访问控制修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceAccesscontrolResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.accesscontrol.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalance_spec(
        self,
        request: cas_models.UpdateLoadbalanceSpecRequest,
    ) -> cas_models.UpdateLoadbalanceSpecResponse:
        """
        Description: lb 规格修改
        Summary: lb 规格修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalance_spec_ex(request, headers, runtime)

    async def update_loadbalance_spec_async(
        self,
        request: cas_models.UpdateLoadbalanceSpecRequest,
    ) -> cas_models.UpdateLoadbalanceSpecResponse:
        """
        Description: lb 规格修改
        Summary: lb 规格修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalance_spec_ex_async(request, headers, runtime)

    def update_loadbalance_spec_ex(
        self,
        request: cas_models.UpdateLoadbalanceSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceSpecResponse:
        """
        Description: lb 规格修改
        Summary: lb 规格修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceSpecResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.spec.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalance_spec_ex_async(
        self,
        request: cas_models.UpdateLoadbalanceSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceSpecResponse:
        """
        Description: lb 规格修改
        Summary: lb 规格修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceSpecResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.spec.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_vpc_vswitch(
        self,
        request: cas_models.UpdateVpcVswitchRequest,
    ) -> cas_models.UpdateVpcVswitchResponse:
        """
        Description: vswitch 信息修改
        Summary: vswitch 信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_vpc_vswitch_ex(request, headers, runtime)

    async def update_vpc_vswitch_async(
        self,
        request: cas_models.UpdateVpcVswitchRequest,
    ) -> cas_models.UpdateVpcVswitchResponse:
        """
        Description: vswitch 信息修改
        Summary: vswitch 信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_vpc_vswitch_ex_async(request, headers, runtime)

    def update_vpc_vswitch_ex(
        self,
        request: cas_models.UpdateVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateVpcVswitchResponse:
        """
        Description: vswitch 信息修改
        Summary: vswitch 信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateVpcVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vswitch.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_vpc_vswitch_ex_async(
        self,
        request: cas_models.UpdateVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateVpcVswitchResponse:
        """
        Description: vswitch 信息修改
        Summary: vswitch 信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateVpcVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vswitch.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_workspace(
        self,
        request: cas_models.CreateWorkspaceRequest,
    ) -> cas_models.CreateWorkspaceResponse:
        """
        Description: 创建 workspace
        Summary: 创建 workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_workspace_ex(request, headers, runtime)

    async def create_workspace_async(
        self,
        request: cas_models.CreateWorkspaceRequest,
    ) -> cas_models.CreateWorkspaceResponse:
        """
        Description: 创建 workspace
        Summary: 创建 workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_workspace_ex_async(request, headers, runtime)

    def create_workspace_ex(
        self,
        request: cas_models.CreateWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateWorkspaceResponse:
        """
        Description: 创建 workspace
        Summary: 创建 workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateWorkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_workspace_ex_async(
        self,
        request: cas_models.CreateWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateWorkspaceResponse:
        """
        Description: 创建 workspace
        Summary: 创建 workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateWorkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_meta_workspace(
        self,
        request: cas_models.CreateMetaWorkspaceRequest,
    ) -> cas_models.CreateMetaWorkspaceResponse:
        """
        Description: 元数据workspace创建
        Summary: 元数据workspace创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_meta_workspace_ex(request, headers, runtime)

    async def create_meta_workspace_async(
        self,
        request: cas_models.CreateMetaWorkspaceRequest,
    ) -> cas_models.CreateMetaWorkspaceResponse:
        """
        Description: 元数据workspace创建
        Summary: 元数据workspace创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_meta_workspace_ex_async(request, headers, runtime)

    def create_meta_workspace_ex(
        self,
        request: cas_models.CreateMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateMetaWorkspaceResponse:
        """
        Description: 元数据workspace创建
        Summary: 元数据workspace创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateMetaWorkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.meta.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_meta_workspace_ex_async(
        self,
        request: cas_models.CreateMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateMetaWorkspaceResponse:
        """
        Description: 元数据workspace创建
        Summary: 元数据workspace创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateMetaWorkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.meta.workspace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_meta_workspace(
        self,
        request: cas_models.QueryMetaWorkspaceRequest,
    ) -> cas_models.QueryMetaWorkspaceResponse:
        """
        Description: workspace查询
        Summary: workspace查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_meta_workspace_ex(request, headers, runtime)

    async def query_meta_workspace_async(
        self,
        request: cas_models.QueryMetaWorkspaceRequest,
    ) -> cas_models.QueryMetaWorkspaceResponse:
        """
        Description: workspace查询
        Summary: workspace查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_meta_workspace_ex_async(request, headers, runtime)

    def query_meta_workspace_ex(
        self,
        request: cas_models.QueryMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryMetaWorkspaceResponse:
        """
        Description: workspace查询
        Summary: workspace查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryMetaWorkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.meta.workspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_meta_workspace_ex_async(
        self,
        request: cas_models.QueryMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryMetaWorkspaceResponse:
        """
        Description: workspace查询
        Summary: workspace查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryMetaWorkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.meta.workspace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_meta_workspace(
        self,
        request: cas_models.DeleteMetaWorkspaceRequest,
    ) -> cas_models.DeleteMetaWorkspaceResponse:
        """
        Description: 元数据workspace删除
        Summary: 元数据workspace删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_meta_workspace_ex(request, headers, runtime)

    async def delete_meta_workspace_async(
        self,
        request: cas_models.DeleteMetaWorkspaceRequest,
    ) -> cas_models.DeleteMetaWorkspaceResponse:
        """
        Description: 元数据workspace删除
        Summary: 元数据workspace删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_meta_workspace_ex_async(request, headers, runtime)

    def delete_meta_workspace_ex(
        self,
        request: cas_models.DeleteMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteMetaWorkspaceResponse:
        """
        Description: 元数据workspace删除
        Summary: 元数据workspace删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteMetaWorkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.meta.workspace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_meta_workspace_ex_async(
        self,
        request: cas_models.DeleteMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteMetaWorkspaceResponse:
        """
        Description: 元数据workspace删除
        Summary: 元数据workspace删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteMetaWorkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.meta.workspace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_resource_vpc(
        self,
        request: cas_models.CreateResourceVpcRequest,
    ) -> cas_models.CreateResourceVpcResponse:
        """
        Description: 资源VPC创建
        Summary: 资源VPC创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_resource_vpc_ex(request, headers, runtime)

    async def create_resource_vpc_async(
        self,
        request: cas_models.CreateResourceVpcRequest,
    ) -> cas_models.CreateResourceVpcResponse:
        """
        Description: 资源VPC创建
        Summary: 资源VPC创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_resource_vpc_ex_async(request, headers, runtime)

    def create_resource_vpc_ex(
        self,
        request: cas_models.CreateResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceVpcResponse:
        """
        Description: 资源VPC创建
        Summary: 资源VPC创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vpc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_resource_vpc_ex_async(
        self,
        request: cas_models.CreateResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceVpcResponse:
        """
        Description: 资源VPC创建
        Summary: 资源VPC创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vpc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_vpc(
        self,
        request: cas_models.QueryResourceVpcRequest,
    ) -> cas_models.QueryResourceVpcResponse:
        """
        Description: 资源VPC查询
        Summary: 资源VPC查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_vpc_ex(request, headers, runtime)

    async def query_resource_vpc_async(
        self,
        request: cas_models.QueryResourceVpcRequest,
    ) -> cas_models.QueryResourceVpcResponse:
        """
        Description: 资源VPC查询
        Summary: 资源VPC查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_vpc_ex_async(request, headers, runtime)

    def query_resource_vpc_ex(
        self,
        request: cas_models.QueryResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceVpcResponse:
        """
        Description: 资源VPC查询
        Summary: 资源VPC查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vpc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_vpc_ex_async(
        self,
        request: cas_models.QueryResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceVpcResponse:
        """
        Description: 资源VPC查询
        Summary: 资源VPC查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vpc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_resource_vpc(
        self,
        request: cas_models.DeleteResourceVpcRequest,
    ) -> cas_models.DeleteResourceVpcResponse:
        """
        Description: 资源VPC删除
        Summary: 资源VPC删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_resource_vpc_ex(request, headers, runtime)

    async def delete_resource_vpc_async(
        self,
        request: cas_models.DeleteResourceVpcRequest,
    ) -> cas_models.DeleteResourceVpcResponse:
        """
        Description: 资源VPC删除
        Summary: 资源VPC删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_resource_vpc_ex_async(request, headers, runtime)

    def delete_resource_vpc_ex(
        self,
        request: cas_models.DeleteResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceVpcResponse:
        """
        Description: 资源VPC删除
        Summary: 资源VPC删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vpc.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_resource_vpc_ex_async(
        self,
        request: cas_models.DeleteResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceVpcResponse:
        """
        Description: 资源VPC删除
        Summary: 资源VPC删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vpc.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_resource_vswitch(
        self,
        request: cas_models.CreateResourceVswitchRequest,
    ) -> cas_models.CreateResourceVswitchResponse:
        """
        Description: 资源vswitch创建
        Summary: 资源vswitch创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_resource_vswitch_ex(request, headers, runtime)

    async def create_resource_vswitch_async(
        self,
        request: cas_models.CreateResourceVswitchRequest,
    ) -> cas_models.CreateResourceVswitchResponse:
        """
        Description: 资源vswitch创建
        Summary: 资源vswitch创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_resource_vswitch_ex_async(request, headers, runtime)

    def create_resource_vswitch_ex(
        self,
        request: cas_models.CreateResourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceVswitchResponse:
        """
        Description: 资源vswitch创建
        Summary: 资源vswitch创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vswitch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_resource_vswitch_ex_async(
        self,
        request: cas_models.CreateResourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceVswitchResponse:
        """
        Description: 资源vswitch创建
        Summary: 资源vswitch创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vswitch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_vswitch(
        self,
        request: cas_models.QueryResourceVswitchRequest,
    ) -> cas_models.QueryResourceVswitchResponse:
        """
        Description: 资源vswitch查询
        Summary: 资源vswitch查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_vswitch_ex(request, headers, runtime)

    async def query_resource_vswitch_async(
        self,
        request: cas_models.QueryResourceVswitchRequest,
    ) -> cas_models.QueryResourceVswitchResponse:
        """
        Description: 资源vswitch查询
        Summary: 资源vswitch查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_vswitch_ex_async(request, headers, runtime)

    def query_resource_vswitch_ex(
        self,
        request: cas_models.QueryResourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceVswitchResponse:
        """
        Description: 资源vswitch查询
        Summary: 资源vswitch查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vswitch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_vswitch_ex_async(
        self,
        request: cas_models.QueryResourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceVswitchResponse:
        """
        Description: 资源vswitch查询
        Summary: 资源vswitch查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vswitch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_resource_vswitch(
        self,
        request: cas_models.DeleteResourceVswitchRequest,
    ) -> cas_models.DeleteResourceVswitchResponse:
        """
        Description: 资源vswitch删除
        Summary: 资源vswitch删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_resource_vswitch_ex(request, headers, runtime)

    async def delete_resource_vswitch_async(
        self,
        request: cas_models.DeleteResourceVswitchRequest,
    ) -> cas_models.DeleteResourceVswitchResponse:
        """
        Description: 资源vswitch删除
        Summary: 资源vswitch删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_resource_vswitch_ex_async(request, headers, runtime)

    def delete_resource_vswitch_ex(
        self,
        request: cas_models.DeleteResourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceVswitchResponse:
        """
        Description: 资源vswitch删除
        Summary: 资源vswitch删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vswitch.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_resource_vswitch_ex_async(
        self,
        request: cas_models.DeleteResourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceVswitchResponse:
        """
        Description: 资源vswitch删除
        Summary: 资源vswitch删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vswitch.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_securitygroup(
        self,
        request: cas_models.QueryResourceSecuritygroupRequest,
    ) -> cas_models.QueryResourceSecuritygroupResponse:
        """
        Description: 资源securitygroup查询
        Summary: 资源securitygroup查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_securitygroup_ex(request, headers, runtime)

    async def query_resource_securitygroup_async(
        self,
        request: cas_models.QueryResourceSecuritygroupRequest,
    ) -> cas_models.QueryResourceSecuritygroupResponse:
        """
        Description: 资源securitygroup查询
        Summary: 资源securitygroup查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_securitygroup_ex_async(request, headers, runtime)

    def query_resource_securitygroup_ex(
        self,
        request: cas_models.QueryResourceSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceSecuritygroupResponse:
        """
        Description: 资源securitygroup查询
        Summary: 资源securitygroup查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.securitygroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_securitygroup_ex_async(
        self,
        request: cas_models.QueryResourceSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceSecuritygroupResponse:
        """
        Description: 资源securitygroup查询
        Summary: 资源securitygroup查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.securitygroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_meta_workspace(
        self,
        request: cas_models.ListMetaWorkspaceRequest,
    ) -> cas_models.ListMetaWorkspaceResponse:
        """
        Description: workspace 列表
        Summary: workspace 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_meta_workspace_ex(request, headers, runtime)

    async def list_meta_workspace_async(
        self,
        request: cas_models.ListMetaWorkspaceRequest,
    ) -> cas_models.ListMetaWorkspaceResponse:
        """
        Description: workspace 列表
        Summary: workspace 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_meta_workspace_ex_async(request, headers, runtime)

    def list_meta_workspace_ex(
        self,
        request: cas_models.ListMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListMetaWorkspaceResponse:
        """
        Description: workspace 列表
        Summary: workspace 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListMetaWorkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.meta.workspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_meta_workspace_ex_async(
        self,
        request: cas_models.ListMetaWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListMetaWorkspaceResponse:
        """
        Description: workspace 列表
        Summary: workspace 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListMetaWorkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.meta.workspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_resource_securitygroup(
        self,
        request: cas_models.CreateResourceSecuritygroupRequest,
    ) -> cas_models.CreateResourceSecuritygroupResponse:
        """
        Description: 创建安全组资源
        Summary: 创建安全组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_resource_securitygroup_ex(request, headers, runtime)

    async def create_resource_securitygroup_async(
        self,
        request: cas_models.CreateResourceSecuritygroupRequest,
    ) -> cas_models.CreateResourceSecuritygroupResponse:
        """
        Description: 创建安全组资源
        Summary: 创建安全组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_resource_securitygroup_ex_async(request, headers, runtime)

    def create_resource_securitygroup_ex(
        self,
        request: cas_models.CreateResourceSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceSecuritygroupResponse:
        """
        Description: 创建安全组资源
        Summary: 创建安全组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.securitygroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_resource_securitygroup_ex_async(
        self,
        request: cas_models.CreateResourceSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceSecuritygroupResponse:
        """
        Description: 创建安全组资源
        Summary: 创建安全组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.securitygroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_resource_securitygroup(
        self,
        request: cas_models.DeleteResourceSecuritygroupRequest,
    ) -> cas_models.DeleteResourceSecuritygroupResponse:
        """
        Description: 删除安全组
        Summary: 删除安全组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_resource_securitygroup_ex(request, headers, runtime)

    async def delete_resource_securitygroup_async(
        self,
        request: cas_models.DeleteResourceSecuritygroupRequest,
    ) -> cas_models.DeleteResourceSecuritygroupResponse:
        """
        Description: 删除安全组
        Summary: 删除安全组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_resource_securitygroup_ex_async(request, headers, runtime)

    def delete_resource_securitygroup_ex(
        self,
        request: cas_models.DeleteResourceSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceSecuritygroupResponse:
        """
        Description: 删除安全组
        Summary: 删除安全组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.securitygroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_resource_securitygroup_ex_async(
        self,
        request: cas_models.DeleteResourceSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceSecuritygroupResponse:
        """
        Description: 删除安全组
        Summary: 删除安全组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.securitygroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_resource_computer(
        self,
        request: cas_models.CreateResourceComputerRequest,
    ) -> cas_models.CreateResourceComputerResponse:
        """
        Description: 创建云主机instance
        Summary: 创建云主机instance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_resource_computer_ex(request, headers, runtime)

    async def create_resource_computer_async(
        self,
        request: cas_models.CreateResourceComputerRequest,
    ) -> cas_models.CreateResourceComputerResponse:
        """
        Description: 创建云主机instance
        Summary: 创建云主机instance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_resource_computer_ex_async(request, headers, runtime)

    def create_resource_computer_ex(
        self,
        request: cas_models.CreateResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceComputerResponse:
        """
        Description: 创建云主机instance
        Summary: 创建云主机instance
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_resource_computer_ex_async(
        self,
        request: cas_models.CreateResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateResourceComputerResponse:
        """
        Description: 创建云主机instance
        Summary: 创建云主机instance
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateResourceComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_computer(
        self,
        request: cas_models.QueryResourceComputerRequest,
    ) -> cas_models.QueryResourceComputerResponse:
        """
        Description: computer 查询
        Summary: computer 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_computer_ex(request, headers, runtime)

    async def query_resource_computer_async(
        self,
        request: cas_models.QueryResourceComputerRequest,
    ) -> cas_models.QueryResourceComputerResponse:
        """
        Description: computer 查询
        Summary: computer 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_computer_ex_async(request, headers, runtime)

    def query_resource_computer_ex(
        self,
        request: cas_models.QueryResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceComputerResponse:
        """
        Description: computer 查询
        Summary: computer 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_computer_ex_async(
        self,
        request: cas_models.QueryResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceComputerResponse:
        """
        Description: computer 查询
        Summary: computer 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_computerspec(
        self,
        request: cas_models.QueryResourceComputerspecRequest,
    ) -> cas_models.QueryResourceComputerspecResponse:
        """
        Description: 根据CPU内存机器规格查询api
        Summary: 机器规格查询api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_computerspec_ex(request, headers, runtime)

    async def query_resource_computerspec_async(
        self,
        request: cas_models.QueryResourceComputerspecRequest,
    ) -> cas_models.QueryResourceComputerspecResponse:
        """
        Description: 根据CPU内存机器规格查询api
        Summary: 机器规格查询api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_computerspec_ex_async(request, headers, runtime)

    def query_resource_computerspec_ex(
        self,
        request: cas_models.QueryResourceComputerspecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceComputerspecResponse:
        """
        Description: 根据CPU内存机器规格查询api
        Summary: 机器规格查询api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceComputerspecResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computerspec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_computerspec_ex_async(
        self,
        request: cas_models.QueryResourceComputerspecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourceComputerspecResponse:
        """
        Description: 根据CPU内存机器规格查询api
        Summary: 机器规格查询api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourceComputerspecResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computerspec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_resource_computer(
        self,
        request: cas_models.DeleteResourceComputerRequest,
    ) -> cas_models.DeleteResourceComputerResponse:
        """
        Description: 删除computer
        Summary: 删除computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_resource_computer_ex(request, headers, runtime)

    async def delete_resource_computer_async(
        self,
        request: cas_models.DeleteResourceComputerRequest,
    ) -> cas_models.DeleteResourceComputerResponse:
        """
        Description: 删除computer
        Summary: 删除computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_resource_computer_ex_async(request, headers, runtime)

    def delete_resource_computer_ex(
        self,
        request: cas_models.DeleteResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceComputerResponse:
        """
        Description: 删除computer
        Summary: 删除computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_resource_computer_ex_async(
        self,
        request: cas_models.DeleteResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceComputerResponse:
        """
        Description: 删除computer
        Summary: 删除computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_resource_computerpassword(
        self,
        request: cas_models.ReinitResourceComputerpasswordRequest,
    ) -> cas_models.ReinitResourceComputerpasswordResponse:
        """
        Description: 重置computer密码
        Summary: 重置computer密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_resource_computerpassword_ex(request, headers, runtime)

    async def reinit_resource_computerpassword_async(
        self,
        request: cas_models.ReinitResourceComputerpasswordRequest,
    ) -> cas_models.ReinitResourceComputerpasswordResponse:
        """
        Description: 重置computer密码
        Summary: 重置computer密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_resource_computerpassword_ex_async(request, headers, runtime)

    def reinit_resource_computerpassword_ex(
        self,
        request: cas_models.ReinitResourceComputerpasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReinitResourceComputerpasswordResponse:
        """
        Description: 重置computer密码
        Summary: 重置computer密码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReinitResourceComputerpasswordResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computerpassword.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_resource_computerpassword_ex_async(
        self,
        request: cas_models.ReinitResourceComputerpasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReinitResourceComputerpasswordResponse:
        """
        Description: 重置computer密码
        Summary: 重置computer密码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReinitResourceComputerpasswordResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computerpassword.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_resource_computer(
        self,
        request: cas_models.StartResourceComputerRequest,
    ) -> cas_models.StartResourceComputerResponse:
        """
        Description: 启动computer
        Summary: 启动computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_resource_computer_ex(request, headers, runtime)

    async def start_resource_computer_async(
        self,
        request: cas_models.StartResourceComputerRequest,
    ) -> cas_models.StartResourceComputerResponse:
        """
        Description: 启动computer
        Summary: 启动computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_resource_computer_ex_async(request, headers, runtime)

    def start_resource_computer_ex(
        self,
        request: cas_models.StartResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartResourceComputerResponse:
        """
        Description: 启动computer
        Summary: 启动computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartResourceComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computer.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_resource_computer_ex_async(
        self,
        request: cas_models.StartResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartResourceComputerResponse:
        """
        Description: 启动computer
        Summary: 启动computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartResourceComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computer.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_resource_computer(
        self,
        request: cas_models.StopResourceComputerRequest,
    ) -> cas_models.StopResourceComputerResponse:
        """
        Description: 停止机器
        Summary: 停止机器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_resource_computer_ex(request, headers, runtime)

    async def stop_resource_computer_async(
        self,
        request: cas_models.StopResourceComputerRequest,
    ) -> cas_models.StopResourceComputerResponse:
        """
        Description: 停止机器
        Summary: 停止机器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_resource_computer_ex_async(request, headers, runtime)

    def stop_resource_computer_ex(
        self,
        request: cas_models.StopResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopResourceComputerResponse:
        """
        Description: 停止机器
        Summary: 停止机器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopResourceComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computer.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_resource_computer_ex_async(
        self,
        request: cas_models.StopResourceComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopResourceComputerResponse:
        """
        Description: 停止机器
        Summary: 停止机器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopResourceComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computer.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sls_project(
        self,
        request: cas_models.CreateSlsProjectRequest,
    ) -> cas_models.CreateSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志项目
        Summary: 创建日志项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sls_project_ex(request, headers, runtime)

    async def create_sls_project_async(
        self,
        request: cas_models.CreateSlsProjectRequest,
    ) -> cas_models.CreateSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志项目
        Summary: 创建日志项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sls_project_ex_async(request, headers, runtime)

    def create_sls_project_ex(
        self,
        request: cas_models.CreateSlsProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志项目
        Summary: 创建日志项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSlsProjectResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sls_project_ex_async(
        self,
        request: cas_models.CreateSlsProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志项目
        Summary: 创建日志项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSlsProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sls_project(
        self,
        request: cas_models.ListSlsProjectRequest,
    ) -> cas_models.ListSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志项目列表
        Summary: 获取日志项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sls_project_ex(request, headers, runtime)

    async def list_sls_project_async(
        self,
        request: cas_models.ListSlsProjectRequest,
    ) -> cas_models.ListSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志项目列表
        Summary: 获取日志项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sls_project_ex_async(request, headers, runtime)

    def list_sls_project_ex(
        self,
        request: cas_models.ListSlsProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志项目列表
        Summary: 获取日志项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListSlsProjectResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sls_project_ex_async(
        self,
        request: cas_models.ListSlsProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListSlsProjectResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志项目列表
        Summary: 获取日志项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListSlsProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sls_logstore(
        self,
        request: cas_models.CreateSlsLogstoreRequest,
    ) -> cas_models.CreateSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志库
        Summary: 创建日志库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sls_logstore_ex(request, headers, runtime)

    async def create_sls_logstore_async(
        self,
        request: cas_models.CreateSlsLogstoreRequest,
    ) -> cas_models.CreateSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志库
        Summary: 创建日志库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sls_logstore_ex_async(request, headers, runtime)

    def create_sls_logstore_ex(
        self,
        request: cas_models.CreateSlsLogstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志库
        Summary: 创建日志库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSlsLogstoreResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.logstore.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sls_logstore_ex_async(
        self,
        request: cas_models.CreateSlsLogstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志库
        Summary: 创建日志库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSlsLogstoreResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.logstore.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sls_logstore(
        self,
        request: cas_models.ListSlsLogstoreRequest,
    ) -> cas_models.ListSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志库列表
        Summary: 获取日志库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sls_logstore_ex(request, headers, runtime)

    async def list_sls_logstore_async(
        self,
        request: cas_models.ListSlsLogstoreRequest,
    ) -> cas_models.ListSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志库列表
        Summary: 获取日志库列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sls_logstore_ex_async(request, headers, runtime)

    def list_sls_logstore_ex(
        self,
        request: cas_models.ListSlsLogstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志库列表
        Summary: 获取日志库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListSlsLogstoreResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.logstore.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sls_logstore_ex_async(
        self,
        request: cas_models.ListSlsLogstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志库列表
        Summary: 获取日志库列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListSlsLogstoreResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.logstore.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sls_logstore(
        self,
        request: cas_models.GetSlsLogstoreRequest,
    ) -> cas_models.GetSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取单个日志库
        Summary: 获取单个日志库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sls_logstore_ex(request, headers, runtime)

    async def get_sls_logstore_async(
        self,
        request: cas_models.GetSlsLogstoreRequest,
    ) -> cas_models.GetSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取单个日志库
        Summary: 获取单个日志库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sls_logstore_ex_async(request, headers, runtime)

    def get_sls_logstore_ex(
        self,
        request: cas_models.GetSlsLogstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取单个日志库
        Summary: 获取单个日志库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetSlsLogstoreResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.logstore.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sls_logstore_ex_async(
        self,
        request: cas_models.GetSlsLogstoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetSlsLogstoreResponse:
        """
        Description: 阿里云日志服务(SLS)-获取单个日志库
        Summary: 获取单个日志库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetSlsLogstoreResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.logstore.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sls_config(
        self,
        request: cas_models.CreateSlsConfigRequest,
    ) -> cas_models.CreateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志配置
        Summary: 创建日志配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sls_config_ex(request, headers, runtime)

    async def create_sls_config_async(
        self,
        request: cas_models.CreateSlsConfigRequest,
    ) -> cas_models.CreateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志配置
        Summary: 创建日志配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sls_config_ex_async(request, headers, runtime)

    def create_sls_config_ex(
        self,
        request: cas_models.CreateSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志配置
        Summary: 创建日志配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSlsConfigResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.config.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sls_config_ex_async(
        self,
        request: cas_models.CreateSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-创建日志配置
        Summary: 创建日志配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSlsConfigResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.config.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sls_config(
        self,
        request: cas_models.ListSlsConfigRequest,
    ) -> cas_models.ListSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志配置列表
        Summary: 获取日志配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sls_config_ex(request, headers, runtime)

    async def list_sls_config_async(
        self,
        request: cas_models.ListSlsConfigRequest,
    ) -> cas_models.ListSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志配置列表
        Summary: 获取日志配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sls_config_ex_async(request, headers, runtime)

    def list_sls_config_ex(
        self,
        request: cas_models.ListSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志配置列表
        Summary: 获取日志配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListSlsConfigResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.config.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sls_config_ex_async(
        self,
        request: cas_models.ListSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-获取日志配置列表
        Summary: 获取日志配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListSlsConfigResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.config.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sls_config(
        self,
        request: cas_models.UpdateSlsConfigRequest,
    ) -> cas_models.UpdateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-更新日志配置
        Summary: 更新日志配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sls_config_ex(request, headers, runtime)

    async def update_sls_config_async(
        self,
        request: cas_models.UpdateSlsConfigRequest,
    ) -> cas_models.UpdateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-更新日志配置
        Summary: 更新日志配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sls_config_ex_async(request, headers, runtime)

    def update_sls_config_ex(
        self,
        request: cas_models.UpdateSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-更新日志配置
        Summary: 更新日志配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateSlsConfigResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sls_config_ex_async(
        self,
        request: cas_models.UpdateSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-更新日志配置
        Summary: 更新日志配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateSlsConfigResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sls_config(
        self,
        request: cas_models.DeleteSlsConfigRequest,
    ) -> cas_models.DeleteSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-删除日志配置
        Summary: 删除日志配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sls_config_ex(request, headers, runtime)

    async def delete_sls_config_async(
        self,
        request: cas_models.DeleteSlsConfigRequest,
    ) -> cas_models.DeleteSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-删除日志配置
        Summary: 删除日志配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sls_config_ex_async(request, headers, runtime)

    def delete_sls_config_ex(
        self,
        request: cas_models.DeleteSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-删除日志配置
        Summary: 删除日志配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteSlsConfigResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sls_config_ex_async(
        self,
        request: cas_models.DeleteSlsConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteSlsConfigResponse:
        """
        Description: 阿里云日志服务(SLS)-删除日志配置
        Summary: 删除日志配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteSlsConfigResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sls_log(
        self,
        request: cas_models.QuerySlsLogRequest,
    ) -> cas_models.QuerySlsLogResponse:
        """
        Description: 阿里云日志服务(SLS) - 查询日志
        Summary: 查询日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sls_log_ex(request, headers, runtime)

    async def query_sls_log_async(
        self,
        request: cas_models.QuerySlsLogRequest,
    ) -> cas_models.QuerySlsLogResponse:
        """
        Description: 阿里云日志服务(SLS) - 查询日志
        Summary: 查询日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sls_log_ex_async(request, headers, runtime)

    def query_sls_log_ex(
        self,
        request: cas_models.QuerySlsLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySlsLogResponse:
        """
        Description: 阿里云日志服务(SLS) - 查询日志
        Summary: 查询日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySlsLogResponse(),
            self.do_request('1.0', 'antcloud.cas.sls.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sls_log_ex_async(
        self,
        request: cas_models.QuerySlsLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySlsLogResponse:
        """
        Description: 阿里云日志服务(SLS) - 查询日志
        Summary: 查询日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySlsLogResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.sls.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_resource_ingressrules(
        self,
        request: cas_models.BatchcreateResourceIngressrulesRequest,
    ) -> cas_models.BatchcreateResourceIngressrulesResponse:
        """
        Description: 批量添加安全组入规则
        Summary: 批量添加安全组规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_resource_ingressrules_ex(request, headers, runtime)

    async def batchcreate_resource_ingressrules_async(
        self,
        request: cas_models.BatchcreateResourceIngressrulesRequest,
    ) -> cas_models.BatchcreateResourceIngressrulesResponse:
        """
        Description: 批量添加安全组入规则
        Summary: 批量添加安全组规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_resource_ingressrules_ex_async(request, headers, runtime)

    def batchcreate_resource_ingressrules_ex(
        self,
        request: cas_models.BatchcreateResourceIngressrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchcreateResourceIngressrulesResponse:
        """
        Description: 批量添加安全组入规则
        Summary: 批量添加安全组规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchcreateResourceIngressrulesResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.ingressrules.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_resource_ingressrules_ex_async(
        self,
        request: cas_models.BatchcreateResourceIngressrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchcreateResourceIngressrulesResponse:
        """
        Description: 批量添加安全组入规则
        Summary: 批量添加安全组规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchcreateResourceIngressrulesResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.ingressrules.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_resource_egressrules(
        self,
        request: cas_models.BatchcreateResourceEgressrulesRequest,
    ) -> cas_models.BatchcreateResourceEgressrulesResponse:
        """
        Description: 批量添加安全组出方向规则
        Summary: 批量添加安全组出方向规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_resource_egressrules_ex(request, headers, runtime)

    async def batchcreate_resource_egressrules_async(
        self,
        request: cas_models.BatchcreateResourceEgressrulesRequest,
    ) -> cas_models.BatchcreateResourceEgressrulesResponse:
        """
        Description: 批量添加安全组出方向规则
        Summary: 批量添加安全组出方向规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_resource_egressrules_ex_async(request, headers, runtime)

    def batchcreate_resource_egressrules_ex(
        self,
        request: cas_models.BatchcreateResourceEgressrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchcreateResourceEgressrulesResponse:
        """
        Description: 批量添加安全组出方向规则
        Summary: 批量添加安全组出方向规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchcreateResourceEgressrulesResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.egressrules.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_resource_egressrules_ex_async(
        self,
        request: cas_models.BatchcreateResourceEgressrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BatchcreateResourceEgressrulesResponse:
        """
        Description: 批量添加安全组出方向规则
        Summary: 批量添加安全组出方向规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BatchcreateResourceEgressrulesResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.egressrules.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance(
        self,
        request: cas_models.QueryLoadbalanceRequest,
    ) -> cas_models.QueryLoadbalanceResponse:
        """
        Description: loadbalance查询
        Summary: loadbalance查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_ex(request, headers, runtime)

    async def query_loadbalance_async(
        self,
        request: cas_models.QueryLoadbalanceRequest,
    ) -> cas_models.QueryLoadbalanceResponse:
        """
        Description: loadbalance查询
        Summary: loadbalance查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_ex_async(request, headers, runtime)

    def query_loadbalance_ex(
        self,
        request: cas_models.QueryLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceResponse:
        """
        Description: loadbalance查询
        Summary: loadbalance查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_ex_async(
        self,
        request: cas_models.QueryLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceResponse:
        """
        Description: loadbalance查询
        Summary: loadbalance查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_loadbalance_health(
        self,
        request: cas_models.GetLoadbalanceHealthRequest,
    ) -> cas_models.GetLoadbalanceHealthResponse:
        """
        Description: 获取单个LB的健康状态
        Summary: 获取单个LB的健康状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_loadbalance_health_ex(request, headers, runtime)

    async def get_loadbalance_health_async(
        self,
        request: cas_models.GetLoadbalanceHealthRequest,
    ) -> cas_models.GetLoadbalanceHealthResponse:
        """
        Description: 获取单个LB的健康状态
        Summary: 获取单个LB的健康状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_loadbalance_health_ex_async(request, headers, runtime)

    def get_loadbalance_health_ex(
        self,
        request: cas_models.GetLoadbalanceHealthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceHealthResponse:
        """
        Description: 获取单个LB的健康状态
        Summary: 获取单个LB的健康状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceHealthResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.health.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_loadbalance_health_ex_async(
        self,
        request: cas_models.GetLoadbalanceHealthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceHealthResponse:
        """
        Description: 获取单个LB的健康状态
        Summary: 获取单个LB的健康状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceHealthResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.health.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_loadbalance_viptype(
        self,
        request: cas_models.AllLoadbalanceViptypeRequest,
    ) -> cas_models.AllLoadbalanceViptypeResponse:
        """
        Description: 获取所有的vip类型
        Summary: 获取所有的vip类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_loadbalance_viptype_ex(request, headers, runtime)

    async def all_loadbalance_viptype_async(
        self,
        request: cas_models.AllLoadbalanceViptypeRequest,
    ) -> cas_models.AllLoadbalanceViptypeResponse:
        """
        Description: 获取所有的vip类型
        Summary: 获取所有的vip类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_loadbalance_viptype_ex_async(request, headers, runtime)

    def all_loadbalance_viptype_ex(
        self,
        request: cas_models.AllLoadbalanceViptypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceViptypeResponse:
        """
        Description: 获取所有的vip类型
        Summary: 获取所有的vip类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceViptypeResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.viptype.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_loadbalance_viptype_ex_async(
        self,
        request: cas_models.AllLoadbalanceViptypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceViptypeResponse:
        """
        Description: 获取所有的vip类型
        Summary: 获取所有的vip类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceViptypeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.viptype.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_loadbalance_cluster(
        self,
        request: cas_models.AllLoadbalanceClusterRequest,
    ) -> cas_models.AllLoadbalanceClusterResponse:
        """
        Description: 获取所有的LB集群
        Summary: 获取所有的LB集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_loadbalance_cluster_ex(request, headers, runtime)

    async def all_loadbalance_cluster_async(
        self,
        request: cas_models.AllLoadbalanceClusterRequest,
    ) -> cas_models.AllLoadbalanceClusterResponse:
        """
        Description: 获取所有的LB集群
        Summary: 获取所有的LB集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_loadbalance_cluster_ex_async(request, headers, runtime)

    def all_loadbalance_cluster_ex(
        self,
        request: cas_models.AllLoadbalanceClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceClusterResponse:
        """
        Description: 获取所有的LB集群
        Summary: 获取所有的LB集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceClusterResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.cluster.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_loadbalance_cluster_ex_async(
        self,
        request: cas_models.AllLoadbalanceClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceClusterResponse:
        """
        Description: 获取所有的LB集群
        Summary: 获取所有的LB集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.cluster.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_vpc(
        self,
        request: cas_models.QueryVpcRequest,
    ) -> cas_models.QueryVpcResponse:
        """
        Description: 查询vpc详细信息
        Summary: 查询vpc详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_vpc_ex(request, headers, runtime)

    async def query_vpc_async(
        self,
        request: cas_models.QueryVpcRequest,
    ) -> cas_models.QueryVpcResponse:
        """
        Description: 查询vpc详细信息
        Summary: 查询vpc详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_vpc_ex_async(request, headers, runtime)

    def query_vpc_ex(
        self,
        request: cas_models.QueryVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryVpcResponse:
        """
        Description: 查询vpc详细信息
        Summary: 查询vpc详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_vpc_ex_async(
        self,
        request: cas_models.QueryVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryVpcResponse:
        """
        Description: 查询vpc详细信息
        Summary: 查询vpc详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_vpc_import(
        self,
        request: cas_models.ListVpcImportRequest,
    ) -> cas_models.ListVpcImportResponse:
        """
        Description: 查询已导入workspace的vpc
        Summary: 查询已导入workspace的vpc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_vpc_import_ex(request, headers, runtime)

    async def list_vpc_import_async(
        self,
        request: cas_models.ListVpcImportRequest,
    ) -> cas_models.ListVpcImportResponse:
        """
        Description: 查询已导入workspace的vpc
        Summary: 查询已导入workspace的vpc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_vpc_import_ex_async(request, headers, runtime)

    def list_vpc_import_ex(
        self,
        request: cas_models.ListVpcImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListVpcImportResponse:
        """
        Description: 查询已导入workspace的vpc
        Summary: 查询已导入workspace的vpc
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListVpcImportResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.import.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_vpc_import_ex_async(
        self,
        request: cas_models.ListVpcImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListVpcImportResponse:
        """
        Description: 查询已导入workspace的vpc
        Summary: 查询已导入workspace的vpc
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListVpcImportResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.import.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_vpc_cidrblock(
        self,
        request: cas_models.ListVpcCidrblockRequest,
    ) -> cas_models.ListVpcCidrblockResponse:
        """
        Description: 查询vpc cidrblock信息
        Summary: 查询vpc cidrblock信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_vpc_cidrblock_ex(request, headers, runtime)

    async def list_vpc_cidrblock_async(
        self,
        request: cas_models.ListVpcCidrblockRequest,
    ) -> cas_models.ListVpcCidrblockResponse:
        """
        Description: 查询vpc cidrblock信息
        Summary: 查询vpc cidrblock信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_vpc_cidrblock_ex_async(request, headers, runtime)

    def list_vpc_cidrblock_ex(
        self,
        request: cas_models.ListVpcCidrblockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListVpcCidrblockResponse:
        """
        Description: 查询vpc cidrblock信息
        Summary: 查询vpc cidrblock信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListVpcCidrblockResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.cidrblock.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_vpc_cidrblock_ex_async(
        self,
        request: cas_models.ListVpcCidrblockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListVpcCidrblockResponse:
        """
        Description: 查询vpc cidrblock信息
        Summary: 查询vpc cidrblock信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListVpcCidrblockResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.cidrblock.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_vpc_vswitch(
        self,
        request: cas_models.QueryVpcVswitchRequest,
    ) -> cas_models.QueryVpcVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_vpc_vswitch_ex(request, headers, runtime)

    async def query_vpc_vswitch_async(
        self,
        request: cas_models.QueryVpcVswitchRequest,
    ) -> cas_models.QueryVpcVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_vpc_vswitch_ex_async(request, headers, runtime)

    def query_vpc_vswitch_ex(
        self,
        request: cas_models.QueryVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryVpcVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryVpcVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vswitch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_vpc_vswitch_ex_async(
        self,
        request: cas_models.QueryVpcVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryVpcVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryVpcVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vswitch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_vpc_vroutertable(
        self,
        request: cas_models.QueryVpcVroutertableRequest,
    ) -> cas_models.QueryVpcVroutertableResponse:
        """
        Description: 查询路由表信息
        Summary: 查询路由表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_vpc_vroutertable_ex(request, headers, runtime)

    async def query_vpc_vroutertable_async(
        self,
        request: cas_models.QueryVpcVroutertableRequest,
    ) -> cas_models.QueryVpcVroutertableResponse:
        """
        Description: 查询路由表信息
        Summary: 查询路由表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_vpc_vroutertable_ex_async(request, headers, runtime)

    def query_vpc_vroutertable_ex(
        self,
        request: cas_models.QueryVpcVroutertableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryVpcVroutertableResponse:
        """
        Description: 查询路由表信息
        Summary: 查询路由表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryVpcVroutertableResponse(),
            self.do_request('1.0', 'antcloud.cas.vpc.vroutertable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_vpc_vroutertable_ex_async(
        self,
        request: cas_models.QueryVpcVroutertableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryVpcVroutertableResponse:
        """
        Description: 查询路由表信息
        Summary: 查询路由表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryVpcVroutertableResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.vpc.vroutertable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_loadbalance_rule(
        self,
        request: cas_models.GetLoadbalanceRuleRequest,
    ) -> cas_models.GetLoadbalanceRuleResponse:
        """
        Description: 获取单个rule
        Summary: 获取单个rule
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_loadbalance_rule_ex(request, headers, runtime)

    async def get_loadbalance_rule_async(
        self,
        request: cas_models.GetLoadbalanceRuleRequest,
    ) -> cas_models.GetLoadbalanceRuleResponse:
        """
        Description: 获取单个rule
        Summary: 获取单个rule
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_loadbalance_rule_ex_async(request, headers, runtime)

    def get_loadbalance_rule_ex(
        self,
        request: cas_models.GetLoadbalanceRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceRuleResponse:
        """
        Description: 获取单个rule
        Summary: 获取单个rule
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceRuleResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_loadbalance_rule_ex_async(
        self,
        request: cas_models.GetLoadbalanceRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceRuleResponse:
        """
        Description: 获取单个rule
        Summary: 获取单个rule
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceRuleResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_rule(
        self,
        request: cas_models.QueryLoadbalanceRuleRequest,
    ) -> cas_models.QueryLoadbalanceRuleResponse:
        """
        Description: 批量查询Lb rule
        Summary: 批量查询Lb rule
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_rule_ex(request, headers, runtime)

    async def query_loadbalance_rule_async(
        self,
        request: cas_models.QueryLoadbalanceRuleRequest,
    ) -> cas_models.QueryLoadbalanceRuleResponse:
        """
        Description: 批量查询Lb rule
        Summary: 批量查询Lb rule
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_rule_ex_async(request, headers, runtime)

    def query_loadbalance_rule_ex(
        self,
        request: cas_models.QueryLoadbalanceRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceRuleResponse:
        """
        Description: 批量查询Lb rule
        Summary: 批量查询Lb rule
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceRuleResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_rule_ex_async(
        self,
        request: cas_models.QueryLoadbalanceRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceRuleResponse:
        """
        Description: 批量查询Lb rule
        Summary: 批量查询Lb rule
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceRuleResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_loadbalance(
        self,
        request: cas_models.GetLoadbalanceRequest,
    ) -> cas_models.GetLoadbalanceResponse:
        """
        Description: 获取单个Lb ById
        Summary: 获取单个Lb ById
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_loadbalance_ex(request, headers, runtime)

    async def get_loadbalance_async(
        self,
        request: cas_models.GetLoadbalanceRequest,
    ) -> cas_models.GetLoadbalanceResponse:
        """
        Description: 获取单个Lb ById
        Summary: 获取单个Lb ById
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_loadbalance_ex_async(request, headers, runtime)

    def get_loadbalance_ex(
        self,
        request: cas_models.GetLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceResponse:
        """
        Description: 获取单个Lb ById
        Summary: 获取单个Lb ById
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_loadbalance_ex_async(
        self,
        request: cas_models.GetLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceResponse:
        """
        Description: 获取单个Lb ById
        Summary: 获取单个Lb ById
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_loadbalance_mount(
        self,
        request: cas_models.AllLoadbalanceMountRequest,
    ) -> cas_models.AllLoadbalanceMountResponse:
        """
        Description: 获取LB后端所有主机
        Summary: 获取LB后端所有主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_loadbalance_mount_ex(request, headers, runtime)

    async def all_loadbalance_mount_async(
        self,
        request: cas_models.AllLoadbalanceMountRequest,
    ) -> cas_models.AllLoadbalanceMountResponse:
        """
        Description: 获取LB后端所有主机
        Summary: 获取LB后端所有主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_loadbalance_mount_ex_async(request, headers, runtime)

    def all_loadbalance_mount_ex(
        self,
        request: cas_models.AllLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceMountResponse:
        """
        Description: 获取LB后端所有主机
        Summary: 获取LB后端所有主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceMountResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.mount.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_loadbalance_mount_ex_async(
        self,
        request: cas_models.AllLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceMountResponse:
        """
        Description: 获取LB后端所有主机
        Summary: 获取LB后端所有主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceMountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.mount.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_mount(
        self,
        request: cas_models.QueryLoadbalanceMountRequest,
    ) -> cas_models.QueryLoadbalanceMountResponse:
        """
        Description: 根据条件查询后端的主机
        Summary: 根据条件查询后端的主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_mount_ex(request, headers, runtime)

    async def query_loadbalance_mount_async(
        self,
        request: cas_models.QueryLoadbalanceMountRequest,
    ) -> cas_models.QueryLoadbalanceMountResponse:
        """
        Description: 根据条件查询后端的主机
        Summary: 根据条件查询后端的主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_mount_ex_async(request, headers, runtime)

    def query_loadbalance_mount_ex(
        self,
        request: cas_models.QueryLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceMountResponse:
        """
        Description: 根据条件查询后端的主机
        Summary: 根据条件查询后端的主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceMountResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.mount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_mount_ex_async(
        self,
        request: cas_models.QueryLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceMountResponse:
        """
        Description: 根据条件查询后端的主机
        Summary: 根据条件查询后端的主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceMountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.mount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_loadbalance_vcomputergroup(
        self,
        request: cas_models.GetLoadbalanceVcomputergroupRequest,
    ) -> cas_models.GetLoadbalanceVcomputergroupResponse:
        """
        Description: 获取单个vcomputergroup
        Summary: 获取单个vcomputergroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def get_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.GetLoadbalanceVcomputergroupRequest,
    ) -> cas_models.GetLoadbalanceVcomputergroupResponse:
        """
        Description: 获取单个vcomputergroup
        Summary: 获取单个vcomputergroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def get_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.GetLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceVcomputergroupResponse:
        """
        Description: 获取单个vcomputergroup
        Summary: 获取单个vcomputergroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.GetLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetLoadbalanceVcomputergroupResponse:
        """
        Description: 获取单个vcomputergroup
        Summary: 获取单个vcomputergroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_vcomputergroup(
        self,
        request: cas_models.QueryLoadbalanceVcomputergroupRequest,
    ) -> cas_models.QueryLoadbalanceVcomputergroupResponse:
        """
        Description: 查询vcomputergroup
        Summary: 查询vcomputergroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def query_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.QueryLoadbalanceVcomputergroupRequest,
    ) -> cas_models.QueryLoadbalanceVcomputergroupResponse:
        """
        Description: 查询vcomputergroup
        Summary: 查询vcomputergroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def query_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.QueryLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceVcomputergroupResponse:
        """
        Description: 查询vcomputergroup
        Summary: 查询vcomputergroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.QueryLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceVcomputergroupResponse:
        """
        Description: 查询vcomputergroup
        Summary: 查询vcomputergroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_loadbalance_vcomputergroup(
        self,
        request: cas_models.AllLoadbalanceVcomputergroupRequest,
    ) -> cas_models.AllLoadbalanceVcomputergroupResponse:
        """
        Description: 获取所有vcomputergroup
        Summary: 获取所有vcomputergroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def all_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.AllLoadbalanceVcomputergroupRequest,
    ) -> cas_models.AllLoadbalanceVcomputergroupResponse:
        """
        Description: 获取所有vcomputergroup
        Summary: 获取所有vcomputergroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def all_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.AllLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceVcomputergroupResponse:
        """
        Description: 获取所有vcomputergroup
        Summary: 获取所有vcomputergroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.AllLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceVcomputergroupResponse:
        """
        Description: 获取所有vcomputergroup
        Summary: 获取所有vcomputergroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_vcomputer(
        self,
        request: cas_models.QueryLoadbalanceVcomputerRequest,
    ) -> cas_models.QueryLoadbalanceVcomputerResponse:
        """
        Description: 获取vcomputer
        Summary: 获取vcomputer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_vcomputer_ex(request, headers, runtime)

    async def query_loadbalance_vcomputer_async(
        self,
        request: cas_models.QueryLoadbalanceVcomputerRequest,
    ) -> cas_models.QueryLoadbalanceVcomputerResponse:
        """
        Description: 获取vcomputer
        Summary: 获取vcomputer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_vcomputer_ex_async(request, headers, runtime)

    def query_loadbalance_vcomputer_ex(
        self,
        request: cas_models.QueryLoadbalanceVcomputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceVcomputerResponse:
        """
        Description: 获取vcomputer
        Summary: 获取vcomputer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceVcomputerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_vcomputer_ex_async(
        self,
        request: cas_models.QueryLoadbalanceVcomputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceVcomputerResponse:
        """
        Description: 获取vcomputer
        Summary: 获取vcomputer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceVcomputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_listener(
        self,
        request: cas_models.QueryLoadbalanceListenerRequest,
    ) -> cas_models.QueryLoadbalanceListenerResponse:
        """
        Description: 查询listener
        Summary: 查询listener
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_listener_ex(request, headers, runtime)

    async def query_loadbalance_listener_async(
        self,
        request: cas_models.QueryLoadbalanceListenerRequest,
    ) -> cas_models.QueryLoadbalanceListenerResponse:
        """
        Description: 查询listener
        Summary: 查询listener
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_listener_ex_async(request, headers, runtime)

    def query_loadbalance_listener_ex(
        self,
        request: cas_models.QueryLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceListenerResponse:
        """
        Description: 查询listener
        Summary: 查询listener
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_listener_ex_async(
        self,
        request: cas_models.QueryLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceListenerResponse:
        """
        Description: 查询listener
        Summary: 查询listener
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_loadbalance_listener(
        self,
        request: cas_models.AllLoadbalanceListenerRequest,
    ) -> cas_models.AllLoadbalanceListenerResponse:
        """
        Description: 获取所有listener
        Summary: 获取所有listener
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_loadbalance_listener_ex(request, headers, runtime)

    async def all_loadbalance_listener_async(
        self,
        request: cas_models.AllLoadbalanceListenerRequest,
    ) -> cas_models.AllLoadbalanceListenerResponse:
        """
        Description: 获取所有listener
        Summary: 获取所有listener
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_loadbalance_listener_ex_async(request, headers, runtime)

    def all_loadbalance_listener_ex(
        self,
        request: cas_models.AllLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceListenerResponse:
        """
        Description: 获取所有listener
        Summary: 获取所有listener
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_loadbalance_listener_ex_async(
        self,
        request: cas_models.AllLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceListenerResponse:
        """
        Description: 获取所有listener
        Summary: 获取所有listener
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_securityip(
        self,
        request: cas_models.QueryLoadbalanceSecurityipRequest,
    ) -> cas_models.QueryLoadbalanceSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_securityip_ex(request, headers, runtime)

    async def query_loadbalance_securityip_async(
        self,
        request: cas_models.QueryLoadbalanceSecurityipRequest,
    ) -> cas_models.QueryLoadbalanceSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_securityip_ex_async(request, headers, runtime)

    def query_loadbalance_securityip_ex(
        self,
        request: cas_models.QueryLoadbalanceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceSecurityipResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.securityip.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_securityip_ex_async(
        self,
        request: cas_models.QueryLoadbalanceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceSecurityipResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.securityip.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_database(
        self,
        request: cas_models.GetDatabaseRequest,
    ) -> cas_models.GetDatabaseResponse:
        """
        Description: 获取单个database
        Summary: 获取单个database
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_database_ex(request, headers, runtime)

    async def get_database_async(
        self,
        request: cas_models.GetDatabaseRequest,
    ) -> cas_models.GetDatabaseResponse:
        """
        Description: 获取单个database
        Summary: 获取单个database
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_database_ex_async(request, headers, runtime)

    def get_database_ex(
        self,
        request: cas_models.GetDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetDatabaseResponse:
        """
        Description: 获取单个database
        Summary: 获取单个database
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_database_ex_async(
        self,
        request: cas_models.GetDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetDatabaseResponse:
        """
        Description: 获取单个database
        Summary: 获取单个database
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_database_masterzone(
        self,
        request: cas_models.AllDatabaseMasterzoneRequest,
    ) -> cas_models.AllDatabaseMasterzoneResponse:
        """
        Description: 获取所有masterzone
        Summary: 获取所有masterzone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_database_masterzone_ex(request, headers, runtime)

    async def all_database_masterzone_async(
        self,
        request: cas_models.AllDatabaseMasterzoneRequest,
    ) -> cas_models.AllDatabaseMasterzoneResponse:
        """
        Description: 获取所有masterzone
        Summary: 获取所有masterzone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_database_masterzone_ex_async(request, headers, runtime)

    def all_database_masterzone_ex(
        self,
        request: cas_models.AllDatabaseMasterzoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseMasterzoneResponse:
        """
        Description: 获取所有masterzone
        Summary: 获取所有masterzone
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseMasterzoneResponse(),
            self.do_request('1.0', 'antcloud.cas.database.masterzone.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_database_masterzone_ex_async(
        self,
        request: cas_models.AllDatabaseMasterzoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseMasterzoneResponse:
        """
        Description: 获取所有masterzone
        Summary: 获取所有masterzone
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseMasterzoneResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.masterzone.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database(
        self,
        request: cas_models.QueryDatabaseRequest,
    ) -> cas_models.QueryDatabaseResponse:
        """
        Description: 查询数据库
        Summary: 查询数据库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_ex(request, headers, runtime)

    async def query_database_async(
        self,
        request: cas_models.QueryDatabaseRequest,
    ) -> cas_models.QueryDatabaseResponse:
        """
        Description: 查询数据库
        Summary: 查询数据库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_ex_async(request, headers, runtime)

    def query_database_ex(
        self,
        request: cas_models.QueryDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseResponse:
        """
        Description: 查询数据库
        Summary: 查询数据库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_ex_async(
        self,
        request: cas_models.QueryDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseResponse:
        """
        Description: 查询数据库
        Summary: 查询数据库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_spec(
        self,
        request: cas_models.QueryDatabaseSpecRequest,
    ) -> cas_models.QueryDatabaseSpecResponse:
        """
        Description: 查询数据库规格
        Summary: 查询数据库规格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_spec_ex(request, headers, runtime)

    async def query_database_spec_async(
        self,
        request: cas_models.QueryDatabaseSpecRequest,
    ) -> cas_models.QueryDatabaseSpecResponse:
        """
        Description: 查询数据库规格
        Summary: 查询数据库规格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_spec_ex_async(request, headers, runtime)

    def query_database_spec_ex(
        self,
        request: cas_models.QueryDatabaseSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSpecResponse:
        """
        Description: 查询数据库规格
        Summary: 查询数据库规格
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSpecResponse(),
            self.do_request('1.0', 'antcloud.cas.database.spec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_spec_ex_async(
        self,
        request: cas_models.QueryDatabaseSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSpecResponse:
        """
        Description: 查询数据库规格
        Summary: 查询数据库规格
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSpecResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.spec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_database_engine(
        self,
        request: cas_models.AllDatabaseEngineRequest,
    ) -> cas_models.AllDatabaseEngineResponse:
        """
        Description: 查询数据引擎
        Summary: 查询数据引擎
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_database_engine_ex(request, headers, runtime)

    async def all_database_engine_async(
        self,
        request: cas_models.AllDatabaseEngineRequest,
    ) -> cas_models.AllDatabaseEngineResponse:
        """
        Description: 查询数据引擎
        Summary: 查询数据引擎
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_database_engine_ex_async(request, headers, runtime)

    def all_database_engine_ex(
        self,
        request: cas_models.AllDatabaseEngineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseEngineResponse:
        """
        Description: 查询数据引擎
        Summary: 查询数据引擎
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseEngineResponse(),
            self.do_request('1.0', 'antcloud.cas.database.engine.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_database_engine_ex_async(
        self,
        request: cas_models.AllDatabaseEngineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseEngineResponse:
        """
        Description: 查询数据引擎
        Summary: 查询数据引擎
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseEngineResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.engine.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_database_quota(
        self,
        request: cas_models.AllDatabaseQuotaRequest,
    ) -> cas_models.AllDatabaseQuotaResponse:
        """
        Description: 查询数据库quota
        Summary: 查询数据库quota
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_database_quota_ex(request, headers, runtime)

    async def all_database_quota_async(
        self,
        request: cas_models.AllDatabaseQuotaRequest,
    ) -> cas_models.AllDatabaseQuotaResponse:
        """
        Description: 查询数据库quota
        Summary: 查询数据库quota
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_database_quota_ex_async(request, headers, runtime)

    def all_database_quota_ex(
        self,
        request: cas_models.AllDatabaseQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseQuotaResponse:
        """
        Description: 查询数据库quota
        Summary: 查询数据库quota
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseQuotaResponse(),
            self.do_request('1.0', 'antcloud.cas.database.quota.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_database_quota_ex_async(
        self,
        request: cas_models.AllDatabaseQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseQuotaResponse:
        """
        Description: 查询数据库quota
        Summary: 查询数据库quota
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseQuotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.quota.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_database_securityip(
        self,
        request: cas_models.AllDatabaseSecurityipRequest,
    ) -> cas_models.AllDatabaseSecurityipResponse:
        """
        Description: 查询数据库所有securityip
        Summary: 查询数据库所有securityip
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_database_securityip_ex(request, headers, runtime)

    async def all_database_securityip_async(
        self,
        request: cas_models.AllDatabaseSecurityipRequest,
    ) -> cas_models.AllDatabaseSecurityipResponse:
        """
        Description: 查询数据库所有securityip
        Summary: 查询数据库所有securityip
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_database_securityip_ex_async(request, headers, runtime)

    def all_database_securityip_ex(
        self,
        request: cas_models.AllDatabaseSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseSecurityipResponse:
        """
        Description: 查询数据库所有securityip
        Summary: 查询数据库所有securityip
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseSecurityipResponse(),
            self.do_request('1.0', 'antcloud.cas.database.securityip.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_database_securityip_ex_async(
        self,
        request: cas_models.AllDatabaseSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseSecurityipResponse:
        """
        Description: 查询数据库所有securityip
        Summary: 查询数据库所有securityip
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseSecurityipResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.securityip.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_scheme(
        self,
        request: cas_models.QueryDatabaseSchemeRequest,
    ) -> cas_models.QueryDatabaseSchemeResponse:
        """
        Description: ！！！！不要用，typo
        Summary: ！！！！不要用，typo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_scheme_ex(request, headers, runtime)

    async def query_database_scheme_async(
        self,
        request: cas_models.QueryDatabaseSchemeRequest,
    ) -> cas_models.QueryDatabaseSchemeResponse:
        """
        Description: ！！！！不要用，typo
        Summary: ！！！！不要用，typo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_scheme_ex_async(request, headers, runtime)

    def query_database_scheme_ex(
        self,
        request: cas_models.QueryDatabaseSchemeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSchemeResponse:
        """
        Description: ！！！！不要用，typo
        Summary: ！！！！不要用，typo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSchemeResponse(),
            self.do_request('1.0', 'antcloud.cas.database.scheme.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_scheme_ex_async(
        self,
        request: cas_models.QueryDatabaseSchemeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSchemeResponse:
        """
        Description: ！！！！不要用，typo
        Summary: ！！！！不要用，typo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSchemeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.scheme.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_database_import(
        self,
        request: cas_models.AllDatabaseImportRequest,
    ) -> cas_models.AllDatabaseImportResponse:
        """
        Description: 获取数据库导入记录
        Summary: 获取数据库导入记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_database_import_ex(request, headers, runtime)

    async def all_database_import_async(
        self,
        request: cas_models.AllDatabaseImportRequest,
    ) -> cas_models.AllDatabaseImportResponse:
        """
        Description: 获取数据库导入记录
        Summary: 获取数据库导入记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_database_import_ex_async(request, headers, runtime)

    def all_database_import_ex(
        self,
        request: cas_models.AllDatabaseImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseImportResponse:
        """
        Description: 获取数据库导入记录
        Summary: 获取数据库导入记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseImportResponse(),
            self.do_request('1.0', 'antcloud.cas.database.import.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_database_import_ex_async(
        self,
        request: cas_models.AllDatabaseImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllDatabaseImportResponse:
        """
        Description: 获取数据库导入记录
        Summary: 获取数据库导入记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllDatabaseImportResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.import.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer_agentstatus(
        self,
        request: cas_models.QueryComputerAgentstatusRequest,
    ) -> cas_models.QueryComputerAgentstatusResponse:
        """
        Description: 查询computer agent状态
        Summary: 查询computer agent状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_agentstatus_ex(request, headers, runtime)

    async def query_computer_agentstatus_async(
        self,
        request: cas_models.QueryComputerAgentstatusRequest,
    ) -> cas_models.QueryComputerAgentstatusResponse:
        """
        Description: 查询computer agent状态
        Summary: 查询computer agent状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_agentstatus_ex_async(request, headers, runtime)

    def query_computer_agentstatus_ex(
        self,
        request: cas_models.QueryComputerAgentstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerAgentstatusResponse:
        """
        Description: 查询computer agent状态
        Summary: 查询computer agent状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerAgentstatusResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.agentstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_agentstatus_ex_async(
        self,
        request: cas_models.QueryComputerAgentstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerAgentstatusResponse:
        """
        Description: 查询computer agent状态
        Summary: 查询computer agent状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerAgentstatusResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.agentstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer_agentsetupcommand(
        self,
        request: cas_models.QueryComputerAgentsetupcommandRequest,
    ) -> cas_models.QueryComputerAgentsetupcommandResponse:
        """
        Description: 查询computer staragent 启动命令
        Summary: 查询 staragent 启动命令
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_agentsetupcommand_ex(request, headers, runtime)

    async def query_computer_agentsetupcommand_async(
        self,
        request: cas_models.QueryComputerAgentsetupcommandRequest,
    ) -> cas_models.QueryComputerAgentsetupcommandResponse:
        """
        Description: 查询computer staragent 启动命令
        Summary: 查询 staragent 启动命令
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_agentsetupcommand_ex_async(request, headers, runtime)

    def query_computer_agentsetupcommand_ex(
        self,
        request: cas_models.QueryComputerAgentsetupcommandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerAgentsetupcommandResponse:
        """
        Description: 查询computer staragent 启动命令
        Summary: 查询 staragent 启动命令
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerAgentsetupcommandResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.agentsetupcommand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_agentsetupcommand_ex_async(
        self,
        request: cas_models.QueryComputerAgentsetupcommandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerAgentsetupcommandResponse:
        """
        Description: 查询computer staragent 启动命令
        Summary: 查询 staragent 启动命令
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerAgentsetupcommandResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.agentsetupcommand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer_import(
        self,
        request: cas_models.QueryComputerImportRequest,
    ) -> cas_models.QueryComputerImportResponse:
        """
        Description: 查询可以导入的computer信息
        Summary: 查询可以导入的computer信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_import_ex(request, headers, runtime)

    async def query_computer_import_async(
        self,
        request: cas_models.QueryComputerImportRequest,
    ) -> cas_models.QueryComputerImportResponse:
        """
        Description: 查询可以导入的computer信息
        Summary: 查询可以导入的computer信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_import_ex_async(request, headers, runtime)

    def query_computer_import_ex(
        self,
        request: cas_models.QueryComputerImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerImportResponse:
        """
        Description: 查询可以导入的computer信息
        Summary: 查询可以导入的computer信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerImportResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.import.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_import_ex_async(
        self,
        request: cas_models.QueryComputerImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerImportResponse:
        """
        Description: 查询可以导入的computer信息
        Summary: 查询可以导入的computer信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerImportResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.import.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_computer(
        self,
        request: cas_models.ListComputerRequest,
    ) -> cas_models.ListComputerResponse:
        """
        Description: list computers
        Summary: list computers
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_computer_ex(request, headers, runtime)

    async def list_computer_async(
        self,
        request: cas_models.ListComputerRequest,
    ) -> cas_models.ListComputerResponse:
        """
        Description: list computers
        Summary: list computers
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_computer_ex_async(request, headers, runtime)

    def list_computer_ex(
        self,
        request: cas_models.ListComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListComputerResponse:
        """
        Description: list computers
        Summary: list computers
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_computer_ex_async(
        self,
        request: cas_models.ListComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListComputerResponse:
        """
        Description: list computers
        Summary: list computers
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer_spec(
        self,
        request: cas_models.QueryComputerSpecRequest,
    ) -> cas_models.QueryComputerSpecResponse:
        """
        Description: query computer specs
        Summary: query computer specs
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_spec_ex(request, headers, runtime)

    async def query_computer_spec_async(
        self,
        request: cas_models.QueryComputerSpecRequest,
    ) -> cas_models.QueryComputerSpecResponse:
        """
        Description: query computer specs
        Summary: query computer specs
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_spec_ex_async(request, headers, runtime)

    def query_computer_spec_ex(
        self,
        request: cas_models.QueryComputerSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerSpecResponse:
        """
        Description: query computer specs
        Summary: query computer specs
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerSpecResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.spec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_spec_ex_async(
        self,
        request: cas_models.QueryComputerSpecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerSpecResponse:
        """
        Description: query computer specs
        Summary: query computer specs
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerSpecResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.spec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer_commonimage(
        self,
        request: cas_models.QueryComputerCommonimageRequest,
    ) -> cas_models.QueryComputerCommonimageResponse:
        """
        Description: query computer common image
        Summary: query common image
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_commonimage_ex(request, headers, runtime)

    async def query_computer_commonimage_async(
        self,
        request: cas_models.QueryComputerCommonimageRequest,
    ) -> cas_models.QueryComputerCommonimageResponse:
        """
        Description: query computer common image
        Summary: query common image
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_commonimage_ex_async(request, headers, runtime)

    def query_computer_commonimage_ex(
        self,
        request: cas_models.QueryComputerCommonimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerCommonimageResponse:
        """
        Description: query computer common image
        Summary: query common image
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerCommonimageResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.commonimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_commonimage_ex_async(
        self,
        request: cas_models.QueryComputerCommonimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerCommonimageResponse:
        """
        Description: query computer common image
        Summary: query common image
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerCommonimageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.commonimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_loadbalance(
        self,
        request: cas_models.AllLoadbalanceRequest,
    ) -> cas_models.AllLoadbalanceResponse:
        """
        Description: 获取所有loadbalance
        Summary: 获取所有loadbalance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_loadbalance_ex(request, headers, runtime)

    async def all_loadbalance_async(
        self,
        request: cas_models.AllLoadbalanceRequest,
    ) -> cas_models.AllLoadbalanceResponse:
        """
        Description: 获取所有loadbalance
        Summary: 获取所有loadbalance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_loadbalance_ex_async(request, headers, runtime)

    def all_loadbalance_ex(
        self,
        request: cas_models.AllLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceResponse:
        """
        Description: 获取所有loadbalance
        Summary: 获取所有loadbalance
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_loadbalance_ex_async(
        self,
        request: cas_models.AllLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AllLoadbalanceResponse:
        """
        Description: 获取所有loadbalance
        Summary: 获取所有loadbalance
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AllLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalance_import(
        self,
        request: cas_models.QueryLoadbalanceImportRequest,
    ) -> cas_models.QueryLoadbalanceImportResponse:
        """
        Description: 查询导入信息
        Summary: 查询导入信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalance_import_ex(request, headers, runtime)

    async def query_loadbalance_import_async(
        self,
        request: cas_models.QueryLoadbalanceImportRequest,
    ) -> cas_models.QueryLoadbalanceImportResponse:
        """
        Description: 查询导入信息
        Summary: 查询导入信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalance_import_ex_async(request, headers, runtime)

    def query_loadbalance_import_ex(
        self,
        request: cas_models.QueryLoadbalanceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceImportResponse:
        """
        Description: 查询导入信息
        Summary: 查询导入信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceImportResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.import.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalance_import_ex_async(
        self,
        request: cas_models.QueryLoadbalanceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryLoadbalanceImportResponse:
        """
        Description: 查询导入信息
        Summary: 查询导入信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryLoadbalanceImportResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.import.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_import(
        self,
        request: cas_models.QueryDatabaseImportRequest,
    ) -> cas_models.QueryDatabaseImportResponse:
        """
        Description: 查询数据库导入记录
        Summary: 查询数据库导入记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_import_ex(request, headers, runtime)

    async def query_database_import_async(
        self,
        request: cas_models.QueryDatabaseImportRequest,
    ) -> cas_models.QueryDatabaseImportResponse:
        """
        Description: 查询数据库导入记录
        Summary: 查询数据库导入记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_import_ex_async(request, headers, runtime)

    def query_database_import_ex(
        self,
        request: cas_models.QueryDatabaseImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseImportResponse:
        """
        Description: 查询数据库导入记录
        Summary: 查询数据库导入记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseImportResponse(),
            self.do_request('1.0', 'antcloud.cas.database.import.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_import_ex_async(
        self,
        request: cas_models.QueryDatabaseImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseImportResponse:
        """
        Description: 查询数据库导入记录
        Summary: 查询数据库导入记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseImportResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.import.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_masterzone(
        self,
        request: cas_models.QueryDatabaseMasterzoneRequest,
    ) -> cas_models.QueryDatabaseMasterzoneResponse:
        """
        Description: 查询masterzone
        Summary: 查询masterzone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_masterzone_ex(request, headers, runtime)

    async def query_database_masterzone_async(
        self,
        request: cas_models.QueryDatabaseMasterzoneRequest,
    ) -> cas_models.QueryDatabaseMasterzoneResponse:
        """
        Description: 查询masterzone
        Summary: 查询masterzone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_masterzone_ex_async(request, headers, runtime)

    def query_database_masterzone_ex(
        self,
        request: cas_models.QueryDatabaseMasterzoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseMasterzoneResponse:
        """
        Description: 查询masterzone
        Summary: 查询masterzone
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseMasterzoneResponse(),
            self.do_request('1.0', 'antcloud.cas.database.masterzone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_masterzone_ex_async(
        self,
        request: cas_models.QueryDatabaseMasterzoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseMasterzoneResponse:
        """
        Description: 查询masterzone
        Summary: 查询masterzone
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseMasterzoneResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.masterzone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_quota(
        self,
        request: cas_models.QueryDatabaseQuotaRequest,
    ) -> cas_models.QueryDatabaseQuotaResponse:
        """
        Description: 查询数据库额度
        Summary: 查询数据库额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_quota_ex(request, headers, runtime)

    async def query_database_quota_async(
        self,
        request: cas_models.QueryDatabaseQuotaRequest,
    ) -> cas_models.QueryDatabaseQuotaResponse:
        """
        Description: 查询数据库额度
        Summary: 查询数据库额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_quota_ex_async(request, headers, runtime)

    def query_database_quota_ex(
        self,
        request: cas_models.QueryDatabaseQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseQuotaResponse:
        """
        Description: 查询数据库额度
        Summary: 查询数据库额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseQuotaResponse(),
            self.do_request('1.0', 'antcloud.cas.database.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_quota_ex_async(
        self,
        request: cas_models.QueryDatabaseQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseQuotaResponse:
        """
        Description: 查询数据库额度
        Summary: 查询数据库额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseQuotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_securityip(
        self,
        request: cas_models.QueryDatabaseSecurityipRequest,
    ) -> cas_models.QueryDatabaseSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_securityip_ex(request, headers, runtime)

    async def query_database_securityip_async(
        self,
        request: cas_models.QueryDatabaseSecurityipRequest,
    ) -> cas_models.QueryDatabaseSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_securityip_ex_async(request, headers, runtime)

    def query_database_securityip_ex(
        self,
        request: cas_models.QueryDatabaseSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSecurityipResponse(),
            self.do_request('1.0', 'antcloud.cas.database.securityip.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_securityip_ex_async(
        self,
        request: cas_models.QueryDatabaseSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSecurityipResponse:
        """
        Description: 查询securityip
        Summary: 查询securityip
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSecurityipResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.securityip.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_schema(
        self,
        request: cas_models.QueryDatabaseSchemaRequest,
    ) -> cas_models.QueryDatabaseSchemaResponse:
        """
        Description: 查询当前数据库的schema
        Summary: 查询当前数据库的schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_schema_ex(request, headers, runtime)

    async def query_database_schema_async(
        self,
        request: cas_models.QueryDatabaseSchemaRequest,
    ) -> cas_models.QueryDatabaseSchemaResponse:
        """
        Description: 查询当前数据库的schema
        Summary: 查询当前数据库的schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_schema_ex_async(request, headers, runtime)

    def query_database_schema_ex(
        self,
        request: cas_models.QueryDatabaseSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSchemaResponse:
        """
        Description: 查询当前数据库的schema
        Summary: 查询当前数据库的schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSchemaResponse(),
            self.do_request('1.0', 'antcloud.cas.database.schema.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_schema_ex_async(
        self,
        request: cas_models.QueryDatabaseSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseSchemaResponse:
        """
        Description: 查询当前数据库的schema
        Summary: 查询当前数据库的schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseSchemaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.schema.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_database_account(
        self,
        request: cas_models.QueryDatabaseAccountRequest,
    ) -> cas_models.QueryDatabaseAccountResponse:
        """
        Description: 查询数据库的账号
        Summary: 查询数据库的账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_database_account_ex(request, headers, runtime)

    async def query_database_account_async(
        self,
        request: cas_models.QueryDatabaseAccountRequest,
    ) -> cas_models.QueryDatabaseAccountResponse:
        """
        Description: 查询数据库的账号
        Summary: 查询数据库的账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_database_account_ex_async(request, headers, runtime)

    def query_database_account_ex(
        self,
        request: cas_models.QueryDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseAccountResponse:
        """
        Description: 查询数据库的账号
        Summary: 查询数据库的账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseAccountResponse(),
            self.do_request('1.0', 'antcloud.cas.database.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_database_account_ex_async(
        self,
        request: cas_models.QueryDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDatabaseAccountResponse:
        """
        Description: 查询数据库的账号
        Summary: 查询数据库的账号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDatabaseAccountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspace(
        self,
        request: cas_models.GetWorkspaceRequest,
    ) -> cas_models.GetWorkspaceResponse:
        """
        Description: 查询workspace
        Summary: 查询workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspace_ex(request, headers, runtime)

    async def get_workspace_async(
        self,
        request: cas_models.GetWorkspaceRequest,
    ) -> cas_models.GetWorkspaceResponse:
        """
        Description: 查询workspace
        Summary: 查询workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspace_ex_async(request, headers, runtime)

    def get_workspace_ex(
        self,
        request: cas_models.GetWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetWorkspaceResponse:
        """
        Description: 查询workspace
        Summary: 查询workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetWorkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspace_ex_async(
        self,
        request: cas_models.GetWorkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetWorkspaceResponse:
        """
        Description: 查询workspace
        Summary: 查询workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetWorkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.workspace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_region(
        self,
        request: cas_models.ListRegionRequest,
    ) -> cas_models.ListRegionResponse:
        """
        Description: 查询region
        Summary: 查询region
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_region_ex(request, headers, runtime)

    async def list_region_async(
        self,
        request: cas_models.ListRegionRequest,
    ) -> cas_models.ListRegionResponse:
        """
        Description: 查询region
        Summary: 查询region
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_region_ex_async(request, headers, runtime)

    def list_region_ex(
        self,
        request: cas_models.ListRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRegionResponse:
        """
        Description: 查询region
        Summary: 查询region
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRegionResponse(),
            self.do_request('1.0', 'antcloud.cas.region.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_region_ex_async(
        self,
        request: cas_models.ListRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRegionResponse:
        """
        Description: 查询region
        Summary: 查询region
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRegionResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.region.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_region_accessible(
        self,
        request: cas_models.ListRegionAccessibleRequest,
    ) -> cas_models.ListRegionAccessibleResponse:
        """
        Description: 租户可用region
        Summary: 租户可用region
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_region_accessible_ex(request, headers, runtime)

    async def list_region_accessible_async(
        self,
        request: cas_models.ListRegionAccessibleRequest,
    ) -> cas_models.ListRegionAccessibleResponse:
        """
        Description: 租户可用region
        Summary: 租户可用region
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_region_accessible_ex_async(request, headers, runtime)

    def list_region_accessible_ex(
        self,
        request: cas_models.ListRegionAccessibleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRegionAccessibleResponse:
        """
        Description: 租户可用region
        Summary: 租户可用region
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRegionAccessibleResponse(),
            self.do_request('1.0', 'antcloud.cas.region.accessible.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_region_accessible_ex_async(
        self,
        request: cas_models.ListRegionAccessibleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRegionAccessibleResponse:
        """
        Description: 租户可用region
        Summary: 租户可用region
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRegionAccessibleResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.region.accessible.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_database_info(
        self,
        request: cas_models.UpdateDatabaseInfoRequest,
    ) -> cas_models.UpdateDatabaseInfoResponse:
        """
        Description: 更新基本信息
        Summary: 更新基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_database_info_ex(request, headers, runtime)

    async def update_database_info_async(
        self,
        request: cas_models.UpdateDatabaseInfoRequest,
    ) -> cas_models.UpdateDatabaseInfoResponse:
        """
        Description: 更新基本信息
        Summary: 更新基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_database_info_ex_async(request, headers, runtime)

    def update_database_info_ex(
        self,
        request: cas_models.UpdateDatabaseInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseInfoResponse:
        """
        Description: 更新基本信息
        Summary: 更新基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseInfoResponse(),
            self.do_request('1.0', 'antcloud.cas.database.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_database_info_ex_async(
        self,
        request: cas_models.UpdateDatabaseInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseInfoResponse:
        """
        Description: 更新基本信息
        Summary: 更新基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseInfoResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_database_assign(
        self,
        request: cas_models.SetDatabaseAssignRequest,
    ) -> cas_models.SetDatabaseAssignResponse:
        """
        Description: 把数据库分配给应用
        Summary: 把数据库分配给应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_database_assign_ex(request, headers, runtime)

    async def set_database_assign_async(
        self,
        request: cas_models.SetDatabaseAssignRequest,
    ) -> cas_models.SetDatabaseAssignResponse:
        """
        Description: 把数据库分配给应用
        Summary: 把数据库分配给应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_database_assign_ex_async(request, headers, runtime)

    def set_database_assign_ex(
        self,
        request: cas_models.SetDatabaseAssignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetDatabaseAssignResponse:
        """
        Description: 把数据库分配给应用
        Summary: 把数据库分配给应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetDatabaseAssignResponse(),
            self.do_request('1.0', 'antcloud.cas.database.assign.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_database_assign_ex_async(
        self,
        request: cas_models.SetDatabaseAssignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetDatabaseAssignResponse:
        """
        Description: 把数据库分配给应用
        Summary: 把数据库分配给应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetDatabaseAssignResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.assign.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_database_share(
        self,
        request: cas_models.SetDatabaseShareRequest,
    ) -> cas_models.SetDatabaseShareResponse:
        """
        Description: 共享数据库给其他workspace
        Summary: 共享数据库给其他workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_database_share_ex(request, headers, runtime)

    async def set_database_share_async(
        self,
        request: cas_models.SetDatabaseShareRequest,
    ) -> cas_models.SetDatabaseShareResponse:
        """
        Description: 共享数据库给其他workspace
        Summary: 共享数据库给其他workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_database_share_ex_async(request, headers, runtime)

    def set_database_share_ex(
        self,
        request: cas_models.SetDatabaseShareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetDatabaseShareResponse:
        """
        Description: 共享数据库给其他workspace
        Summary: 共享数据库给其他workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetDatabaseShareResponse(),
            self.do_request('1.0', 'antcloud.cas.database.share.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_database_share_ex_async(
        self,
        request: cas_models.SetDatabaseShareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetDatabaseShareResponse:
        """
        Description: 共享数据库给其他workspace
        Summary: 共享数据库给其他workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetDatabaseShareResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.share.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reboot_database(
        self,
        request: cas_models.RebootDatabaseRequest,
    ) -> cas_models.RebootDatabaseResponse:
        """
        Description: 重启数据库
        Summary: 重启数据库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reboot_database_ex(request, headers, runtime)

    async def reboot_database_async(
        self,
        request: cas_models.RebootDatabaseRequest,
    ) -> cas_models.RebootDatabaseResponse:
        """
        Description: 重启数据库
        Summary: 重启数据库
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reboot_database_ex_async(request, headers, runtime)

    def reboot_database_ex(
        self,
        request: cas_models.RebootDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RebootDatabaseResponse:
        """
        Description: 重启数据库
        Summary: 重启数据库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RebootDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.reboot', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reboot_database_ex_async(
        self,
        request: cas_models.RebootDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RebootDatabaseResponse:
        """
        Description: 重启数据库
        Summary: 重启数据库
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RebootDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.reboot', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_database_account(
        self,
        request: cas_models.UpdateDatabaseAccountRequest,
    ) -> cas_models.UpdateDatabaseAccountResponse:
        """
        Description: 更新账户信息
        Summary: 更新账户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_database_account_ex(request, headers, runtime)

    async def update_database_account_async(
        self,
        request: cas_models.UpdateDatabaseAccountRequest,
    ) -> cas_models.UpdateDatabaseAccountResponse:
        """
        Description: 更新账户信息
        Summary: 更新账户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_database_account_ex_async(request, headers, runtime)

    def update_database_account_ex(
        self,
        request: cas_models.UpdateDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseAccountResponse:
        """
        Description: 更新账户信息
        Summary: 更新账户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseAccountResponse(),
            self.do_request('1.0', 'antcloud.cas.database.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_database_account_ex_async(
        self,
        request: cas_models.UpdateDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseAccountResponse:
        """
        Description: 更新账户信息
        Summary: 更新账户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseAccountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_database_accountpassword(
        self,
        request: cas_models.SetDatabaseAccountpasswordRequest,
    ) -> cas_models.SetDatabaseAccountpasswordResponse:
        """
        Description: 重设databaseaccount密码
        Summary: 重设databaseaccount密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_database_accountpassword_ex(request, headers, runtime)

    async def set_database_accountpassword_async(
        self,
        request: cas_models.SetDatabaseAccountpasswordRequest,
    ) -> cas_models.SetDatabaseAccountpasswordResponse:
        """
        Description: 重设databaseaccount密码
        Summary: 重设databaseaccount密码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_database_accountpassword_ex_async(request, headers, runtime)

    def set_database_accountpassword_ex(
        self,
        request: cas_models.SetDatabaseAccountpasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetDatabaseAccountpasswordResponse:
        """
        Description: 重设databaseaccount密码
        Summary: 重设databaseaccount密码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetDatabaseAccountpasswordResponse(),
            self.do_request('1.0', 'antcloud.cas.database.accountpassword.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_database_accountpassword_ex_async(
        self,
        request: cas_models.SetDatabaseAccountpasswordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetDatabaseAccountpasswordResponse:
        """
        Description: 重设databaseaccount密码
        Summary: 重设databaseaccount密码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetDatabaseAccountpasswordResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.accountpassword.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_database_account(
        self,
        request: cas_models.AuthDatabaseAccountRequest,
    ) -> cas_models.AuthDatabaseAccountResponse:
        """
        Description: 数据库账户授权schema
        Summary: 数据库账户授权schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_database_account_ex(request, headers, runtime)

    async def auth_database_account_async(
        self,
        request: cas_models.AuthDatabaseAccountRequest,
    ) -> cas_models.AuthDatabaseAccountResponse:
        """
        Description: 数据库账户授权schema
        Summary: 数据库账户授权schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_database_account_ex_async(request, headers, runtime)

    def auth_database_account_ex(
        self,
        request: cas_models.AuthDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AuthDatabaseAccountResponse:
        """
        Description: 数据库账户授权schema
        Summary: 数据库账户授权schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AuthDatabaseAccountResponse(),
            self.do_request('1.0', 'antcloud.cas.database.account.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_database_account_ex_async(
        self,
        request: cas_models.AuthDatabaseAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AuthDatabaseAccountResponse:
        """
        Description: 数据库账户授权schema
        Summary: 数据库账户授权schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AuthDatabaseAccountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.account.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_region_tenant(
        self,
        request: cas_models.GetRegionTenantRequest,
    ) -> cas_models.GetRegionTenantResponse:
        """
        Description: 查询tenantRegion
        Summary: 查询tenantRegion
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_region_tenant_ex(request, headers, runtime)

    async def get_region_tenant_async(
        self,
        request: cas_models.GetRegionTenantRequest,
    ) -> cas_models.GetRegionTenantResponse:
        """
        Description: 查询tenantRegion
        Summary: 查询tenantRegion
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_region_tenant_ex_async(request, headers, runtime)

    def get_region_tenant_ex(
        self,
        request: cas_models.GetRegionTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetRegionTenantResponse:
        """
        Description: 查询tenantRegion
        Summary: 查询tenantRegion
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetRegionTenantResponse(),
            self.do_request('1.0', 'antcloud.cas.region.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_region_tenant_ex_async(
        self,
        request: cas_models.GetRegionTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetRegionTenantResponse:
        """
        Description: 查询tenantRegion
        Summary: 查询tenantRegion
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetRegionTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.region.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_region_aliasbyid(
        self,
        request: cas_models.GetRegionAliasbyidRequest,
    ) -> cas_models.GetRegionAliasbyidResponse:
        """
        Description: getRegionAliasById
        Summary: getRegionAliasById
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_region_aliasbyid_ex(request, headers, runtime)

    async def get_region_aliasbyid_async(
        self,
        request: cas_models.GetRegionAliasbyidRequest,
    ) -> cas_models.GetRegionAliasbyidResponse:
        """
        Description: getRegionAliasById
        Summary: getRegionAliasById
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_region_aliasbyid_ex_async(request, headers, runtime)

    def get_region_aliasbyid_ex(
        self,
        request: cas_models.GetRegionAliasbyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetRegionAliasbyidResponse:
        """
        Description: getRegionAliasById
        Summary: getRegionAliasById
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetRegionAliasbyidResponse(),
            self.do_request('1.0', 'antcloud.cas.region.aliasbyid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_region_aliasbyid_ex_async(
        self,
        request: cas_models.GetRegionAliasbyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetRegionAliasbyidResponse:
        """
        Description: getRegionAliasById
        Summary: getRegionAliasById
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetRegionAliasbyidResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.region.aliasbyid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_disk(
        self,
        request: cas_models.QueryDiskRequest,
    ) -> cas_models.QueryDiskResponse:
        """
        Description: 查询disk信息
        Summary: 查询disk信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_disk_ex(request, headers, runtime)

    async def query_disk_async(
        self,
        request: cas_models.QueryDiskRequest,
    ) -> cas_models.QueryDiskResponse:
        """
        Description: 查询disk信息
        Summary: 查询disk信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_disk_ex_async(request, headers, runtime)

    def query_disk_ex(
        self,
        request: cas_models.QueryDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDiskResponse:
        """
        Description: 查询disk信息
        Summary: 查询disk信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDiskResponse(),
            self.do_request('1.0', 'antcloud.cas.disk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_disk_ex_async(
        self,
        request: cas_models.QueryDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDiskResponse:
        """
        Description: 查询disk信息
        Summary: 查询disk信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDiskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.disk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_image(
        self,
        request: cas_models.QueryImageRequest,
    ) -> cas_models.QueryImageResponse:
        """
        Description: 查询computer image信息
        Summary: 查询computer image信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_image_ex(request, headers, runtime)

    async def query_image_async(
        self,
        request: cas_models.QueryImageRequest,
    ) -> cas_models.QueryImageResponse:
        """
        Description: 查询computer image信息
        Summary: 查询computer image信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_image_ex_async(request, headers, runtime)

    def query_image_ex(
        self,
        request: cas_models.QueryImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryImageResponse:
        """
        Description: 查询computer image信息
        Summary: 查询computer image信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryImageResponse(),
            self.do_request('1.0', 'antcloud.cas.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_image_ex_async(
        self,
        request: cas_models.QueryImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryImageResponse:
        """
        Description: 查询computer image信息
        Summary: 查询computer image信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryImageResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_database_schema(
        self,
        request: cas_models.CreateDatabaseSchemaRequest,
    ) -> cas_models.CreateDatabaseSchemaResponse:
        """
        Description: 创建数据库schema
        Summary: 创建数据库schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_database_schema_ex(request, headers, runtime)

    async def create_database_schema_async(
        self,
        request: cas_models.CreateDatabaseSchemaRequest,
    ) -> cas_models.CreateDatabaseSchemaResponse:
        """
        Description: 创建数据库schema
        Summary: 创建数据库schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_database_schema_ex_async(request, headers, runtime)

    def create_database_schema_ex(
        self,
        request: cas_models.CreateDatabaseSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateDatabaseSchemaResponse:
        """
        Description: 创建数据库schema
        Summary: 创建数据库schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateDatabaseSchemaResponse(),
            self.do_request('1.0', 'antcloud.cas.database.schema.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_database_schema_ex_async(
        self,
        request: cas_models.CreateDatabaseSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateDatabaseSchemaResponse:
        """
        Description: 创建数据库schema
        Summary: 创建数据库schema
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateDatabaseSchemaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.schema.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_loadbalance_mount(
        self,
        request: cas_models.CreateLoadbalanceMountRequest,
    ) -> cas_models.CreateLoadbalanceMountResponse:
        """
        Description: LB挂载后端主机
        Summary: LB挂载后端主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_loadbalance_mount_ex(request, headers, runtime)

    async def create_loadbalance_mount_async(
        self,
        request: cas_models.CreateLoadbalanceMountRequest,
    ) -> cas_models.CreateLoadbalanceMountResponse:
        """
        Description: LB挂载后端主机
        Summary: LB挂载后端主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_loadbalance_mount_ex_async(request, headers, runtime)

    def create_loadbalance_mount_ex(
        self,
        request: cas_models.CreateLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceMountResponse:
        """
        Description: LB挂载后端主机
        Summary: LB挂载后端主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceMountResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.mount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_loadbalance_mount_ex_async(
        self,
        request: cas_models.CreateLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceMountResponse:
        """
        Description: LB挂载后端主机
        Summary: LB挂载后端主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceMountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.mount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_loadbalance_listener(
        self,
        request: cas_models.CreateLoadbalanceListenerRequest,
    ) -> cas_models.CreateLoadbalanceListenerResponse:
        """
        Description: 创建监听器
        Summary: 创建监听器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_loadbalance_listener_ex(request, headers, runtime)

    async def create_loadbalance_listener_async(
        self,
        request: cas_models.CreateLoadbalanceListenerRequest,
    ) -> cas_models.CreateLoadbalanceListenerResponse:
        """
        Description: 创建监听器
        Summary: 创建监听器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_loadbalance_listener_ex_async(request, headers, runtime)

    def create_loadbalance_listener_ex(
        self,
        request: cas_models.CreateLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceListenerResponse:
        """
        Description: 创建监听器
        Summary: 创建监听器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_loadbalance_listener_ex_async(
        self,
        request: cas_models.CreateLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceListenerResponse:
        """
        Description: 创建监听器
        Summary: 创建监听器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_loadbalance_listener(
        self,
        request: cas_models.StopLoadbalanceListenerRequest,
    ) -> cas_models.StopLoadbalanceListenerResponse:
        """
        Description: 停止监听器
        Summary: 停止监听器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_loadbalance_listener_ex(request, headers, runtime)

    async def stop_loadbalance_listener_async(
        self,
        request: cas_models.StopLoadbalanceListenerRequest,
    ) -> cas_models.StopLoadbalanceListenerResponse:
        """
        Description: 停止监听器
        Summary: 停止监听器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_loadbalance_listener_ex_async(request, headers, runtime)

    def stop_loadbalance_listener_ex(
        self,
        request: cas_models.StopLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopLoadbalanceListenerResponse:
        """
        Description: 停止监听器
        Summary: 停止监听器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_loadbalance_listener_ex_async(
        self,
        request: cas_models.StopLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopLoadbalanceListenerResponse:
        """
        Description: 停止监听器
        Summary: 停止监听器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_loadbalance_listener(
        self,
        request: cas_models.StartLoadbalanceListenerRequest,
    ) -> cas_models.StartLoadbalanceListenerResponse:
        """
        Description: 启动lb
        Summary: 启动lb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_loadbalance_listener_ex(request, headers, runtime)

    async def start_loadbalance_listener_async(
        self,
        request: cas_models.StartLoadbalanceListenerRequest,
    ) -> cas_models.StartLoadbalanceListenerResponse:
        """
        Description: 启动lb
        Summary: 启动lb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_loadbalance_listener_ex_async(request, headers, runtime)

    def start_loadbalance_listener_ex(
        self,
        request: cas_models.StartLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartLoadbalanceListenerResponse:
        """
        Description: 启动lb
        Summary: 启动lb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_loadbalance_listener_ex_async(
        self,
        request: cas_models.StartLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartLoadbalanceListenerResponse:
        """
        Description: 启动lb
        Summary: 启动lb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalance_listener(
        self,
        request: cas_models.UpdateLoadbalanceListenerRequest,
    ) -> cas_models.UpdateLoadbalanceListenerResponse:
        """
        Description: 更新listener配置
        Summary: 更新listener配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalance_listener_ex(request, headers, runtime)

    async def update_loadbalance_listener_async(
        self,
        request: cas_models.UpdateLoadbalanceListenerRequest,
    ) -> cas_models.UpdateLoadbalanceListenerResponse:
        """
        Description: 更新listener配置
        Summary: 更新listener配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalance_listener_ex_async(request, headers, runtime)

    def update_loadbalance_listener_ex(
        self,
        request: cas_models.UpdateLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceListenerResponse:
        """
        Description: 更新listener配置
        Summary: 更新listener配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceListenerResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.listener.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalance_listener_ex_async(
        self,
        request: cas_models.UpdateLoadbalanceListenerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceListenerResponse:
        """
        Description: 更新listener配置
        Summary: 更新listener配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceListenerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.listener.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_diskspec(
        self,
        request: cas_models.QueryDiskspecRequest,
    ) -> cas_models.QueryDiskspecResponse:
        """
        Description: 查询disk spec信息
        Summary: 查询disk spec信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_diskspec_ex(request, headers, runtime)

    async def query_diskspec_async(
        self,
        request: cas_models.QueryDiskspecRequest,
    ) -> cas_models.QueryDiskspecResponse:
        """
        Description: 查询disk spec信息
        Summary: 查询disk spec信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_diskspec_ex_async(request, headers, runtime)

    def query_diskspec_ex(
        self,
        request: cas_models.QueryDiskspecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDiskspecResponse:
        """
        Description: 查询disk spec信息
        Summary: 查询disk spec信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDiskspecResponse(),
            self.do_request('1.0', 'antcloud.cas.diskspec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_diskspec_ex_async(
        self,
        request: cas_models.QueryDiskspecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDiskspecResponse:
        """
        Description: 查询disk spec信息
        Summary: 查询disk spec信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDiskspecResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.diskspec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computerquota(
        self,
        request: cas_models.QueryComputerquotaRequest,
    ) -> cas_models.QueryComputerquotaResponse:
        """
        Description: 查询computer quota
        Summary: 查询computer quota
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computerquota_ex(request, headers, runtime)

    async def query_computerquota_async(
        self,
        request: cas_models.QueryComputerquotaRequest,
    ) -> cas_models.QueryComputerquotaResponse:
        """
        Description: 查询computer quota
        Summary: 查询computer quota
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computerquota_ex_async(request, headers, runtime)

    def query_computerquota_ex(
        self,
        request: cas_models.QueryComputerquotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerquotaResponse:
        """
        Description: 查询computer quota
        Summary: 查询computer quota
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerquotaResponse(),
            self.do_request('1.0', 'antcloud.cas.computerquota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computerquota_ex_async(
        self,
        request: cas_models.QueryComputerquotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerquotaResponse:
        """
        Description: 查询computer quota
        Summary: 查询computer quota
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerquotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computerquota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_computer(
        self,
        request: cas_models.StopComputerRequest,
    ) -> cas_models.StopComputerResponse:
        """
        Description: 停止computer
        Summary: 停止computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_computer_ex(request, headers, runtime)

    async def stop_computer_async(
        self,
        request: cas_models.StopComputerRequest,
    ) -> cas_models.StopComputerResponse:
        """
        Description: 停止computer
        Summary: 停止computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_computer_ex_async(request, headers, runtime)

    def stop_computer_ex(
        self,
        request: cas_models.StopComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopComputerResponse:
        """
        Description: 停止computer
        Summary: 停止computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_computer_ex_async(
        self,
        request: cas_models.StopComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopComputerResponse:
        """
        Description: 停止computer
        Summary: 停止computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reboot_computer(
        self,
        request: cas_models.RebootComputerRequest,
    ) -> cas_models.RebootComputerResponse:
        """
        Description: 重启computer
        Summary: 重启computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reboot_computer_ex(request, headers, runtime)

    async def reboot_computer_async(
        self,
        request: cas_models.RebootComputerRequest,
    ) -> cas_models.RebootComputerResponse:
        """
        Description: 重启computer
        Summary: 重启computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reboot_computer_ex_async(request, headers, runtime)

    def reboot_computer_ex(
        self,
        request: cas_models.RebootComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RebootComputerResponse:
        """
        Description: 重启computer
        Summary: 重启computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RebootComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.reboot', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reboot_computer_ex_async(
        self,
        request: cas_models.RebootComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RebootComputerResponse:
        """
        Description: 重启computer
        Summary: 重启computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RebootComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.reboot', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer_securitygroup(
        self,
        request: cas_models.QueryComputerSecuritygroupRequest,
    ) -> cas_models.QueryComputerSecuritygroupResponse:
        """
        Description: 查询computer所属安全组
        Summary: 查询computer所属安全组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_securitygroup_ex(request, headers, runtime)

    async def query_computer_securitygroup_async(
        self,
        request: cas_models.QueryComputerSecuritygroupRequest,
    ) -> cas_models.QueryComputerSecuritygroupResponse:
        """
        Description: 查询computer所属安全组
        Summary: 查询computer所属安全组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_securitygroup_ex_async(request, headers, runtime)

    def query_computer_securitygroup_ex(
        self,
        request: cas_models.QueryComputerSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerSecuritygroupResponse:
        """
        Description: 查询computer所属安全组
        Summary: 查询computer所属安全组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerSecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.securitygroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_securitygroup_ex_async(
        self,
        request: cas_models.QueryComputerSecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerSecuritygroupResponse:
        """
        Description: 查询computer所属安全组
        Summary: 查询computer所属安全组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerSecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.securitygroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_securitygroup(
        self,
        request: cas_models.QuerySecuritygroupRequest,
    ) -> cas_models.QuerySecuritygroupResponse:
        """
        Description: 查询安全组信息
        Summary: 查询安全组信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_securitygroup_ex(request, headers, runtime)

    async def query_securitygroup_async(
        self,
        request: cas_models.QuerySecuritygroupRequest,
    ) -> cas_models.QuerySecuritygroupResponse:
        """
        Description: 查询安全组信息
        Summary: 查询安全组信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_securitygroup_ex_async(request, headers, runtime)

    def query_securitygroup_ex(
        self,
        request: cas_models.QuerySecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySecuritygroupResponse:
        """
        Description: 查询安全组信息
        Summary: 查询安全组信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySecuritygroupResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_securitygroup_ex_async(
        self,
        request: cas_models.QuerySecuritygroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySecuritygroupResponse:
        """
        Description: 查询安全组信息
        Summary: 查询安全组信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySecuritygroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_securitygroup_permission(
        self,
        request: cas_models.CreateSecuritygroupPermissionRequest,
    ) -> cas_models.CreateSecuritygroupPermissionResponse:
        """
        Description: 创建安全组规则
        Summary: 创建安全组规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_securitygroup_permission_ex(request, headers, runtime)

    async def create_securitygroup_permission_async(
        self,
        request: cas_models.CreateSecuritygroupPermissionRequest,
    ) -> cas_models.CreateSecuritygroupPermissionResponse:
        """
        Description: 创建安全组规则
        Summary: 创建安全组规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_securitygroup_permission_ex_async(request, headers, runtime)

    def create_securitygroup_permission_ex(
        self,
        request: cas_models.CreateSecuritygroupPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSecuritygroupPermissionResponse:
        """
        Description: 创建安全组规则
        Summary: 创建安全组规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSecuritygroupPermissionResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.permission.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_securitygroup_permission_ex_async(
        self,
        request: cas_models.CreateSecuritygroupPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateSecuritygroupPermissionResponse:
        """
        Description: 创建安全组规则
        Summary: 创建安全组规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateSecuritygroupPermissionResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.permission.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_securitygroup_permission(
        self,
        request: cas_models.QuerySecuritygroupPermissionRequest,
    ) -> cas_models.QuerySecuritygroupPermissionResponse:
        """
        Description: 查询安全组规则信息
        Summary: 查询安全组规则信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_securitygroup_permission_ex(request, headers, runtime)

    async def query_securitygroup_permission_async(
        self,
        request: cas_models.QuerySecuritygroupPermissionRequest,
    ) -> cas_models.QuerySecuritygroupPermissionResponse:
        """
        Description: 查询安全组规则信息
        Summary: 查询安全组规则信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_securitygroup_permission_ex_async(request, headers, runtime)

    def query_securitygroup_permission_ex(
        self,
        request: cas_models.QuerySecuritygroupPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySecuritygroupPermissionResponse:
        """
        Description: 查询安全组规则信息
        Summary: 查询安全组规则信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySecuritygroupPermissionResponse(),
            self.do_request('1.0', 'antcloud.cas.securitygroup.permission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_securitygroup_permission_ex_async(
        self,
        request: cas_models.QuerySecuritygroupPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySecuritygroupPermissionResponse:
        """
        Description: 查询安全组规则信息
        Summary: 查询安全组规则信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySecuritygroupPermissionResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.securitygroup.permission.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalanace_securityip(
        self,
        request: cas_models.UpdateLoadbalanaceSecurityipRequest,
    ) -> cas_models.UpdateLoadbalanaceSecurityipResponse:
        """
        Description: 更新监听器的安全控制
        Summary: 更新监听器的安全控制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalanace_securityip_ex(request, headers, runtime)

    async def update_loadbalanace_securityip_async(
        self,
        request: cas_models.UpdateLoadbalanaceSecurityipRequest,
    ) -> cas_models.UpdateLoadbalanaceSecurityipResponse:
        """
        Description: 更新监听器的安全控制
        Summary: 更新监听器的安全控制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalanace_securityip_ex_async(request, headers, runtime)

    def update_loadbalanace_securityip_ex(
        self,
        request: cas_models.UpdateLoadbalanaceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanaceSecurityipResponse:
        """
        Description: 更新监听器的安全控制
        Summary: 更新监听器的安全控制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanaceSecurityipResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalanace.securityip.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalanace_securityip_ex_async(
        self,
        request: cas_models.UpdateLoadbalanaceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanaceSecurityipResponse:
        """
        Description: 更新监听器的安全控制
        Summary: 更新监听器的安全控制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanaceSecurityipResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalanace.securityip.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_loadbalance_securityip(
        self,
        request: cas_models.CreateLoadbalanceSecurityipRequest,
    ) -> cas_models.CreateLoadbalanceSecurityipResponse:
        """
        Description: 创建lb监听器的安全控制
        Summary: 创建lb监听器的安全控制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_loadbalance_securityip_ex(request, headers, runtime)

    async def create_loadbalance_securityip_async(
        self,
        request: cas_models.CreateLoadbalanceSecurityipRequest,
    ) -> cas_models.CreateLoadbalanceSecurityipResponse:
        """
        Description: 创建lb监听器的安全控制
        Summary: 创建lb监听器的安全控制
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_loadbalance_securityip_ex_async(request, headers, runtime)

    def create_loadbalance_securityip_ex(
        self,
        request: cas_models.CreateLoadbalanceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceSecurityipResponse:
        """
        Description: 创建lb监听器的安全控制
        Summary: 创建lb监听器的安全控制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceSecurityipResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.securityip.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_loadbalance_securityip_ex_async(
        self,
        request: cas_models.CreateLoadbalanceSecurityipRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceSecurityipResponse:
        """
        Description: 创建lb监听器的安全控制
        Summary: 创建lb监听器的安全控制
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceSecurityipResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.securityip.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_database(
        self,
        request: cas_models.UpdateDatabaseRequest,
    ) -> cas_models.UpdateDatabaseResponse:
        """
        Description: 编辑数据库的基本属性
        Summary: 编辑数据库的基本属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_database_ex(request, headers, runtime)

    async def update_database_async(
        self,
        request: cas_models.UpdateDatabaseRequest,
    ) -> cas_models.UpdateDatabaseResponse:
        """
        Description: 编辑数据库的基本属性
        Summary: 编辑数据库的基本属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_database_ex_async(request, headers, runtime)

    def update_database_ex(
        self,
        request: cas_models.UpdateDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseResponse:
        """
        Description: 编辑数据库的基本属性
        Summary: 编辑数据库的基本属性
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseResponse(),
            self.do_request('1.0', 'antcloud.cas.database.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_database_ex_async(
        self,
        request: cas_models.UpdateDatabaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDatabaseResponse:
        """
        Description: 编辑数据库的基本属性
        Summary: 编辑数据库的基本属性
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDatabaseResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.database.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalance_mount(
        self,
        request: cas_models.UpdateLoadbalanceMountRequest,
    ) -> cas_models.UpdateLoadbalanceMountResponse:
        """
        Description: 更新后端权重
        Summary: 更新后端权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalance_mount_ex(request, headers, runtime)

    async def update_loadbalance_mount_async(
        self,
        request: cas_models.UpdateLoadbalanceMountRequest,
    ) -> cas_models.UpdateLoadbalanceMountResponse:
        """
        Description: 更新后端权重
        Summary: 更新后端权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalance_mount_ex_async(request, headers, runtime)

    def update_loadbalance_mount_ex(
        self,
        request: cas_models.UpdateLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceMountResponse:
        """
        Description: 更新后端权重
        Summary: 更新后端权重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceMountResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.mount.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalance_mount_ex_async(
        self,
        request: cas_models.UpdateLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceMountResponse:
        """
        Description: 更新后端权重
        Summary: 更新后端权重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceMountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.mount.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_loadbalance_mount(
        self,
        request: cas_models.DeleteLoadbalanceMountRequest,
    ) -> cas_models.DeleteLoadbalanceMountResponse:
        """
        Description: 删除LB后端挂载主机
        Summary: 删除LB后端挂载主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_loadbalance_mount_ex(request, headers, runtime)

    async def delete_loadbalance_mount_async(
        self,
        request: cas_models.DeleteLoadbalanceMountRequest,
    ) -> cas_models.DeleteLoadbalanceMountResponse:
        """
        Description: 删除LB后端挂载主机
        Summary: 删除LB后端挂载主机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_loadbalance_mount_ex_async(request, headers, runtime)

    def delete_loadbalance_mount_ex(
        self,
        request: cas_models.DeleteLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceMountResponse:
        """
        Description: 删除LB后端挂载主机
        Summary: 删除LB后端挂载主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceMountResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.mount.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_loadbalance_mount_ex_async(
        self,
        request: cas_models.DeleteLoadbalanceMountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceMountResponse:
        """
        Description: 删除LB后端挂载主机
        Summary: 删除LB后端挂载主机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceMountResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.mount.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_request(
        self,
        request: cas_models.QueryRequestRequest,
    ) -> cas_models.QueryRequestResponse:
        """
        Description: 查询任务记录
        Summary: 查询任务记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_request_ex(request, headers, runtime)

    async def query_request_async(
        self,
        request: cas_models.QueryRequestRequest,
    ) -> cas_models.QueryRequestResponse:
        """
        Description: 查询任务记录
        Summary: 查询任务记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_request_ex_async(request, headers, runtime)

    def query_request_ex(
        self,
        request: cas_models.QueryRequestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryRequestResponse:
        """
        Description: 查询任务记录
        Summary: 查询任务记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryRequestResponse(),
            self.do_request('1.0', 'antcloud.cas.request.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_request_ex_async(
        self,
        request: cas_models.QueryRequestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryRequestResponse:
        """
        Description: 查询任务记录
        Summary: 查询任务记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryRequestResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.request.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_request(
        self,
        request: cas_models.GetRequestRequest,
    ) -> cas_models.GetRequestResponse:
        """
        Description: 获取单个request
        Summary: 获取单个request
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_request_ex(request, headers, runtime)

    async def get_request_async(
        self,
        request: cas_models.GetRequestRequest,
    ) -> cas_models.GetRequestResponse:
        """
        Description: 获取单个request
        Summary: 获取单个request
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_request_ex_async(request, headers, runtime)

    def get_request_ex(
        self,
        request: cas_models.GetRequestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetRequestResponse:
        """
        Description: 获取单个request
        Summary: 获取单个request
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetRequestResponse(),
            self.do_request('1.0', 'antcloud.cas.request.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_request_ex_async(
        self,
        request: cas_models.GetRequestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetRequestResponse:
        """
        Description: 获取单个request
        Summary: 获取单个request
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetRequestResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.request.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_request_task(
        self,
        request: cas_models.QueryRequestTaskRequest,
    ) -> cas_models.QueryRequestTaskResponse:
        """
        Description: 查询task
        Summary: 查询task
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_request_task_ex(request, headers, runtime)

    async def query_request_task_async(
        self,
        request: cas_models.QueryRequestTaskRequest,
    ) -> cas_models.QueryRequestTaskResponse:
        """
        Description: 查询task
        Summary: 查询task
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_request_task_ex_async(request, headers, runtime)

    def query_request_task_ex(
        self,
        request: cas_models.QueryRequestTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryRequestTaskResponse:
        """
        Description: 查询task
        Summary: 查询task
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryRequestTaskResponse(),
            self.do_request('1.0', 'antcloud.cas.request.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_request_task_ex_async(
        self,
        request: cas_models.QueryRequestTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryRequestTaskResponse:
        """
        Description: 查询task
        Summary: 查询task
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryRequestTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.request.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_task_log(
        self,
        request: cas_models.QueryTaskLogRequest,
    ) -> cas_models.QueryTaskLogResponse:
        """
        Description: 查询任务日志
        Summary: 查询任务日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_task_log_ex(request, headers, runtime)

    async def query_task_log_async(
        self,
        request: cas_models.QueryTaskLogRequest,
    ) -> cas_models.QueryTaskLogResponse:
        """
        Description: 查询任务日志
        Summary: 查询任务日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_task_log_ex_async(request, headers, runtime)

    def query_task_log_ex(
        self,
        request: cas_models.QueryTaskLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryTaskLogResponse:
        """
        Description: 查询任务日志
        Summary: 查询任务日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryTaskLogResponse(),
            self.do_request('1.0', 'antcloud.cas.task.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_task_log_ex_async(
        self,
        request: cas_models.QueryTaskLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryTaskLogResponse:
        """
        Description: 查询任务日志
        Summary: 查询任务日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryTaskLogResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.task.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_tenantworkspace(
        self,
        request: cas_models.ListTenantworkspaceRequest,
    ) -> cas_models.ListTenantworkspaceResponse:
        """
        Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
        Summary: 列出 tenant workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_tenantworkspace_ex(request, headers, runtime)

    async def list_tenantworkspace_async(
        self,
        request: cas_models.ListTenantworkspaceRequest,
    ) -> cas_models.ListTenantworkspaceResponse:
        """
        Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
        Summary: 列出 tenant workspace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_tenantworkspace_ex_async(request, headers, runtime)

    def list_tenantworkspace_ex(
        self,
        request: cas_models.ListTenantworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListTenantworkspaceResponse:
        """
        Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
        Summary: 列出 tenant workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListTenantworkspaceResponse(),
            self.do_request('1.0', 'antcloud.cas.tenantworkspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_tenantworkspace_ex_async(
        self,
        request: cas_models.ListTenantworkspaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListTenantworkspaceResponse:
        """
        Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
        Summary: 列出 tenant workspace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListTenantworkspaceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.tenantworkspace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tenantworkspace_filter(
        self,
        request: cas_models.QueryTenantworkspaceFilterRequest,
    ) -> cas_models.QueryTenantworkspaceFilterResponse:
        """
        Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
        Summary: 环境filterStatus
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tenantworkspace_filter_ex(request, headers, runtime)

    async def query_tenantworkspace_filter_async(
        self,
        request: cas_models.QueryTenantworkspaceFilterRequest,
    ) -> cas_models.QueryTenantworkspaceFilterResponse:
        """
        Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
        Summary: 环境filterStatus
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tenantworkspace_filter_ex_async(request, headers, runtime)

    def query_tenantworkspace_filter_ex(
        self,
        request: cas_models.QueryTenantworkspaceFilterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryTenantworkspaceFilterResponse:
        """
        Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
        Summary: 环境filterStatus
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryTenantworkspaceFilterResponse(),
            self.do_request('1.0', 'antcloud.cas.tenantworkspace.filter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tenantworkspace_filter_ex_async(
        self,
        request: cas_models.QueryTenantworkspaceFilterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryTenantworkspaceFilterResponse:
        """
        Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
        Summary: 环境filterStatus
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryTenantworkspaceFilterResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.tenantworkspace.filter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_region_groupby(
        self,
        request: cas_models.ListRegionGroupbyRequest,
    ) -> cas_models.ListRegionGroupbyResponse:
        """
        Description: group by region列表
        Summary: group by region列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_region_groupby_ex(request, headers, runtime)

    async def list_region_groupby_async(
        self,
        request: cas_models.ListRegionGroupbyRequest,
    ) -> cas_models.ListRegionGroupbyResponse:
        """
        Description: group by region列表
        Summary: group by region列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_region_groupby_ex_async(request, headers, runtime)

    def list_region_groupby_ex(
        self,
        request: cas_models.ListRegionGroupbyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRegionGroupbyResponse:
        """
        Description: group by region列表
        Summary: group by region列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRegionGroupbyResponse(),
            self.do_request('1.0', 'antcloud.cas.region.groupby.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_region_groupby_ex_async(
        self,
        request: cas_models.ListRegionGroupbyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRegionGroupbyResponse:
        """
        Description: group by region列表
        Summary: group by region列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRegionGroupbyResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.region.groupby.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_request_finaltask(
        self,
        request: cas_models.QueryRequestFinaltaskRequest,
    ) -> cas_models.QueryRequestFinaltaskResponse:
        """
        Description: 查询任务最后的步骤
        Summary: 查询任务最后的步骤
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_request_finaltask_ex(request, headers, runtime)

    async def query_request_finaltask_async(
        self,
        request: cas_models.QueryRequestFinaltaskRequest,
    ) -> cas_models.QueryRequestFinaltaskResponse:
        """
        Description: 查询任务最后的步骤
        Summary: 查询任务最后的步骤
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_request_finaltask_ex_async(request, headers, runtime)

    def query_request_finaltask_ex(
        self,
        request: cas_models.QueryRequestFinaltaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryRequestFinaltaskResponse:
        """
        Description: 查询任务最后的步骤
        Summary: 查询任务最后的步骤
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryRequestFinaltaskResponse(),
            self.do_request('1.0', 'antcloud.cas.request.finaltask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_request_finaltask_ex_async(
        self,
        request: cas_models.QueryRequestFinaltaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryRequestFinaltaskResponse:
        """
        Description: 查询任务最后的步骤
        Summary: 查询任务最后的步骤
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryRequestFinaltaskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.request.finaltask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_feature(
        self,
        request: cas_models.QueryFeatureRequest,
    ) -> cas_models.QueryFeatureResponse:
        """
        Description: 查询当前支持的功能
        Summary: 查询当前支持的功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_feature_ex(request, headers, runtime)

    async def query_feature_async(
        self,
        request: cas_models.QueryFeatureRequest,
    ) -> cas_models.QueryFeatureResponse:
        """
        Description: 查询当前支持的功能
        Summary: 查询当前支持的功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_feature_ex_async(request, headers, runtime)

    def query_feature_ex(
        self,
        request: cas_models.QueryFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryFeatureResponse:
        """
        Description: 查询当前支持的功能
        Summary: 查询当前支持的功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryFeatureResponse(),
            self.do_request('1.0', 'antcloud.cas.feature.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_feature_ex_async(
        self,
        request: cas_models.QueryFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryFeatureResponse:
        """
        Description: 查询当前支持的功能
        Summary: 查询当前支持的功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryFeatureResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.feature.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_computer(
        self,
        request: cas_models.StartComputerRequest,
    ) -> cas_models.StartComputerResponse:
        """
        Description: start computer
        Summary: start computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_computer_ex(request, headers, runtime)

    async def start_computer_async(
        self,
        request: cas_models.StartComputerRequest,
    ) -> cas_models.StartComputerResponse:
        """
        Description: start computer
        Summary: start computer
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_computer_ex_async(request, headers, runtime)

    def start_computer_ex(
        self,
        request: cas_models.StartComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartComputerResponse:
        """
        Description: start computer
        Summary: start computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_computer_ex_async(
        self,
        request: cas_models.StartComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartComputerResponse:
        """
        Description: start computer
        Summary: start computer
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_loadbalance(
        self,
        request: cas_models.StartLoadbalanceRequest,
    ) -> cas_models.StartLoadbalanceResponse:
        """
        Description: 开启lb
        Summary: 开启lb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_loadbalance_ex(request, headers, runtime)

    async def start_loadbalance_async(
        self,
        request: cas_models.StartLoadbalanceRequest,
    ) -> cas_models.StartLoadbalanceResponse:
        """
        Description: 开启lb
        Summary: 开启lb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_loadbalance_ex_async(request, headers, runtime)

    def start_loadbalance_ex(
        self,
        request: cas_models.StartLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartLoadbalanceResponse:
        """
        Description: 开启lb
        Summary: 开启lb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_loadbalance_ex_async(
        self,
        request: cas_models.StartLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StartLoadbalanceResponse:
        """
        Description: 开启lb
        Summary: 开启lb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StartLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_loadbalance(
        self,
        request: cas_models.StopLoadbalanceRequest,
    ) -> cas_models.StopLoadbalanceResponse:
        """
        Description: 停止lb
        Summary: 停止lb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_loadbalance_ex(request, headers, runtime)

    async def stop_loadbalance_async(
        self,
        request: cas_models.StopLoadbalanceRequest,
    ) -> cas_models.StopLoadbalanceResponse:
        """
        Description: 停止lb
        Summary: 停止lb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_loadbalance_ex_async(request, headers, runtime)

    def stop_loadbalance_ex(
        self,
        request: cas_models.StopLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopLoadbalanceResponse:
        """
        Description: 停止lb
        Summary: 停止lb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_loadbalance_ex_async(
        self,
        request: cas_models.StopLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.StopLoadbalanceResponse:
        """
        Description: 停止lb
        Summary: 停止lb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.StopLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalance(
        self,
        request: cas_models.UpdateLoadbalanceRequest,
    ) -> cas_models.UpdateLoadbalanceResponse:
        """
        Description: 更新lb信息
        Summary: 更新lb信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalance_ex(request, headers, runtime)

    async def update_loadbalance_async(
        self,
        request: cas_models.UpdateLoadbalanceRequest,
    ) -> cas_models.UpdateLoadbalanceResponse:
        """
        Description: 更新lb信息
        Summary: 更新lb信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalance_ex_async(request, headers, runtime)

    def update_loadbalance_ex(
        self,
        request: cas_models.UpdateLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceResponse:
        """
        Description: 更新lb信息
        Summary: 更新lb信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalance_ex_async(
        self,
        request: cas_models.UpdateLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceResponse:
        """
        Description: 更新lb信息
        Summary: 更新lb信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_loadbalance_assign(
        self,
        request: cas_models.AddLoadbalanceAssignRequest,
    ) -> cas_models.AddLoadbalanceAssignResponse:
        """
        Description: 把LB分配给应用
        Summary: 把LB分配给应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_loadbalance_assign_ex(request, headers, runtime)

    async def add_loadbalance_assign_async(
        self,
        request: cas_models.AddLoadbalanceAssignRequest,
    ) -> cas_models.AddLoadbalanceAssignResponse:
        """
        Description: 把LB分配给应用
        Summary: 把LB分配给应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_loadbalance_assign_ex_async(request, headers, runtime)

    def add_loadbalance_assign_ex(
        self,
        request: cas_models.AddLoadbalanceAssignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddLoadbalanceAssignResponse:
        """
        Description: 把LB分配给应用
        Summary: 把LB分配给应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddLoadbalanceAssignResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.assign.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_loadbalance_assign_ex_async(
        self,
        request: cas_models.AddLoadbalanceAssignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddLoadbalanceAssignResponse:
        """
        Description: 把LB分配给应用
        Summary: 把LB分配给应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddLoadbalanceAssignResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.assign.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_certificate(
        self,
        request: cas_models.QueryCertificateRequest,
    ) -> cas_models.QueryCertificateResponse:
        """
        Description: 证书查询
        Summary: 证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_certificate_ex(request, headers, runtime)

    async def query_certificate_async(
        self,
        request: cas_models.QueryCertificateRequest,
    ) -> cas_models.QueryCertificateResponse:
        """
        Description: 证书查询
        Summary: 证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_certificate_ex_async(request, headers, runtime)

    def query_certificate_ex(
        self,
        request: cas_models.QueryCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryCertificateResponse:
        """
        Description: 证书查询
        Summary: 证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryCertificateResponse(),
            self.do_request('1.0', 'antcloud.cas.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_certificate_ex_async(
        self,
        request: cas_models.QueryCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryCertificateResponse:
        """
        Description: 证书查询
        Summary: 证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryCertificateResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_certificate(
        self,
        request: cas_models.CreateCertificateRequest,
    ) -> cas_models.CreateCertificateResponse:
        """
        Description: 创建证书
        Summary: 创建证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_certificate_ex(request, headers, runtime)

    async def create_certificate_async(
        self,
        request: cas_models.CreateCertificateRequest,
    ) -> cas_models.CreateCertificateResponse:
        """
        Description: 创建证书
        Summary: 创建证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_certificate_ex_async(request, headers, runtime)

    def create_certificate_ex(
        self,
        request: cas_models.CreateCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateCertificateResponse:
        """
        Description: 创建证书
        Summary: 创建证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateCertificateResponse(),
            self.do_request('1.0', 'antcloud.cas.certificate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_certificate_ex_async(
        self,
        request: cas_models.CreateCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateCertificateResponse:
        """
        Description: 创建证书
        Summary: 创建证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateCertificateResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.certificate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_certificate(
        self,
        request: cas_models.DeleteCertificateRequest,
    ) -> cas_models.DeleteCertificateResponse:
        """
        Description: 删除证书
        Summary: 删除证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_certificate_ex(request, headers, runtime)

    async def delete_certificate_async(
        self,
        request: cas_models.DeleteCertificateRequest,
    ) -> cas_models.DeleteCertificateResponse:
        """
        Description: 删除证书
        Summary: 删除证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_certificate_ex_async(request, headers, runtime)

    def delete_certificate_ex(
        self,
        request: cas_models.DeleteCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteCertificateResponse:
        """
        Description: 删除证书
        Summary: 删除证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteCertificateResponse(),
            self.do_request('1.0', 'antcloud.cas.certificate.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_certificate_ex_async(
        self,
        request: cas_models.DeleteCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteCertificateResponse:
        """
        Description: 删除证书
        Summary: 删除证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteCertificateResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.certificate.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_unifiedresource_vpc(
        self,
        request: cas_models.DescribeUnifiedresourceVpcRequest,
    ) -> cas_models.DescribeUnifiedresourceVpcResponse:
        """
        Description: 查询已创建的VPC
        Summary: 查询已创建的VPC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_unifiedresource_vpc_ex(request, headers, runtime)

    async def describe_unifiedresource_vpc_async(
        self,
        request: cas_models.DescribeUnifiedresourceVpcRequest,
    ) -> cas_models.DescribeUnifiedresourceVpcResponse:
        """
        Description: 查询已创建的VPC
        Summary: 查询已创建的VPC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_unifiedresource_vpc_ex_async(request, headers, runtime)

    def describe_unifiedresource_vpc_ex(
        self,
        request: cas_models.DescribeUnifiedresourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DescribeUnifiedresourceVpcResponse:
        """
        Description: 查询已创建的VPC
        Summary: 查询已创建的VPC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DescribeUnifiedresourceVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.unifiedresource.vpc.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_unifiedresource_vpc_ex_async(
        self,
        request: cas_models.DescribeUnifiedresourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DescribeUnifiedresourceVpcResponse:
        """
        Description: 查询已创建的VPC
        Summary: 查询已创建的VPC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DescribeUnifiedresourceVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.unifiedresource.vpc.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_unifiedresource_instancefamilies(
        self,
        request: cas_models.ListUnifiedresourceInstancefamiliesRequest,
    ) -> cas_models.ListUnifiedresourceInstancefamiliesResponse:
        """
        Description: 查询实例规格族列表
        Summary: 查询实例规格族列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_unifiedresource_instancefamilies_ex(request, headers, runtime)

    async def list_unifiedresource_instancefamilies_async(
        self,
        request: cas_models.ListUnifiedresourceInstancefamiliesRequest,
    ) -> cas_models.ListUnifiedresourceInstancefamiliesResponse:
        """
        Description: 查询实例规格族列表
        Summary: 查询实例规格族列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_unifiedresource_instancefamilies_ex_async(request, headers, runtime)

    def list_unifiedresource_instancefamilies_ex(
        self,
        request: cas_models.ListUnifiedresourceInstancefamiliesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceInstancefamiliesResponse:
        """
        Description: 查询实例规格族列表
        Summary: 查询实例规格族列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceInstancefamiliesResponse(),
            self.do_request('1.0', 'antcloud.cas.unifiedresource.instancefamilies.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_unifiedresource_instancefamilies_ex_async(
        self,
        request: cas_models.ListUnifiedresourceInstancefamiliesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceInstancefamiliesResponse:
        """
        Description: 查询实例规格族列表
        Summary: 查询实例规格族列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceInstancefamiliesResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.unifiedresource.instancefamilies.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_unifiedresource_instancetype(
        self,
        request: cas_models.ListUnifiedresourceInstancetypeRequest,
    ) -> cas_models.ListUnifiedresourceInstancetypeResponse:
        """
        Description: 查询所有实例规格详细信息
        Summary: 查询实例规格资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_unifiedresource_instancetype_ex(request, headers, runtime)

    async def list_unifiedresource_instancetype_async(
        self,
        request: cas_models.ListUnifiedresourceInstancetypeRequest,
    ) -> cas_models.ListUnifiedresourceInstancetypeResponse:
        """
        Description: 查询所有实例规格详细信息
        Summary: 查询实例规格资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_unifiedresource_instancetype_ex_async(request, headers, runtime)

    def list_unifiedresource_instancetype_ex(
        self,
        request: cas_models.ListUnifiedresourceInstancetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceInstancetypeResponse:
        """
        Description: 查询所有实例规格详细信息
        Summary: 查询实例规格资源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceInstancetypeResponse(),
            self.do_request('1.0', 'antcloud.cas.unifiedresource.instancetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_unifiedresource_instancetype_ex_async(
        self,
        request: cas_models.ListUnifiedresourceInstancetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceInstancetypeResponse:
        """
        Description: 查询所有实例规格详细信息
        Summary: 查询实例规格资源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceInstancetypeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.unifiedresource.instancetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_computer(
        self,
        request: cas_models.QueryComputerRequest,
    ) -> cas_models.QueryComputerResponse:
        """
        Description: query cas computer detail info by id
        Summary: 获取单个computer的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_computer_ex(request, headers, runtime)

    async def query_computer_async(
        self,
        request: cas_models.QueryComputerRequest,
    ) -> cas_models.QueryComputerResponse:
        """
        Description: query cas computer detail info by id
        Summary: 获取单个computer的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_computer_ex_async(request, headers, runtime)

    def query_computer_ex(
        self,
        request: cas_models.QueryComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerResponse:
        """
        Description: query cas computer detail info by id
        Summary: 获取单个computer的详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_computer_ex_async(
        self,
        request: cas_models.QueryComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryComputerResponse:
        """
        Description: query cas computer detail info by id
        Summary: 获取单个computer的详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_resource_computertype(
        self,
        request: cas_models.ListResourceComputertypeRequest,
    ) -> cas_models.ListResourceComputertypeResponse:
        """
        Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
        Summary: 查询可用实例类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_resource_computertype_ex(request, headers, runtime)

    async def list_resource_computertype_async(
        self,
        request: cas_models.ListResourceComputertypeRequest,
    ) -> cas_models.ListResourceComputertypeResponse:
        """
        Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
        Summary: 查询可用实例类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_resource_computertype_ex_async(request, headers, runtime)

    def list_resource_computertype_ex(
        self,
        request: cas_models.ListResourceComputertypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListResourceComputertypeResponse:
        """
        Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
        Summary: 查询可用实例类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListResourceComputertypeResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computertype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_resource_computertype_ex_async(
        self,
        request: cas_models.ListResourceComputertypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListResourceComputertypeResponse:
        """
        Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
        Summary: 查询可用实例类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListResourceComputertypeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computertype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_resource_disk(
        self,
        request: cas_models.ListResourceDiskRequest,
    ) -> cas_models.ListResourceDiskResponse:
        """
        Description: 查询ecs disk 列表
        Summary: 查询ecs disk info
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_resource_disk_ex(request, headers, runtime)

    async def list_resource_disk_async(
        self,
        request: cas_models.ListResourceDiskRequest,
    ) -> cas_models.ListResourceDiskResponse:
        """
        Description: 查询ecs disk 列表
        Summary: 查询ecs disk info
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_resource_disk_ex_async(request, headers, runtime)

    def list_resource_disk_ex(
        self,
        request: cas_models.ListResourceDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListResourceDiskResponse:
        """
        Description: 查询ecs disk 列表
        Summary: 查询ecs disk info
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListResourceDiskResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.disk.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_resource_disk_ex_async(
        self,
        request: cas_models.ListResourceDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListResourceDiskResponse:
        """
        Description: 查询ecs disk 列表
        Summary: 查询ecs disk info
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListResourceDiskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.disk.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_resource_computertypefamily(
        self,
        request: cas_models.ListResourceComputertypefamilyRequest,
    ) -> cas_models.ListResourceComputertypefamilyResponse:
        """
        Description: 查询云服务器规格族列表
        Summary: 查询云服务器规格族列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_resource_computertypefamily_ex(request, headers, runtime)

    async def list_resource_computertypefamily_async(
        self,
        request: cas_models.ListResourceComputertypefamilyRequest,
    ) -> cas_models.ListResourceComputertypefamilyResponse:
        """
        Description: 查询云服务器规格族列表
        Summary: 查询云服务器规格族列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_resource_computertypefamily_ex_async(request, headers, runtime)

    def list_resource_computertypefamily_ex(
        self,
        request: cas_models.ListResourceComputertypefamilyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListResourceComputertypefamilyResponse:
        """
        Description: 查询云服务器规格族列表
        Summary: 查询云服务器规格族列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListResourceComputertypefamilyResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.computertypefamily.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_resource_computertypefamily_ex_async(
        self,
        request: cas_models.ListResourceComputertypefamilyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListResourceComputertypefamilyResponse:
        """
        Description: 查询云服务器规格族列表
        Summary: 查询云服务器规格族列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListResourceComputertypefamilyResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.computertypefamily.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_unifiedresource_vswitch(
        self,
        request: cas_models.ListUnifiedresourceVswitchRequest,
    ) -> cas_models.ListUnifiedresourceVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_unifiedresource_vswitch_ex(request, headers, runtime)

    async def list_unifiedresource_vswitch_async(
        self,
        request: cas_models.ListUnifiedresourceVswitchRequest,
    ) -> cas_models.ListUnifiedresourceVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_unifiedresource_vswitch_ex_async(request, headers, runtime)

    def list_unifiedresource_vswitch_ex(
        self,
        request: cas_models.ListUnifiedresourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceVswitchResponse(),
            self.do_request('1.0', 'antcloud.cas.unifiedresource.vswitch.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_unifiedresource_vswitch_ex_async(
        self,
        request: cas_models.ListUnifiedresourceVswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceVswitchResponse:
        """
        Description: 查询交换机信息
        Summary: 查询交换机信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceVswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.unifiedresource.vswitch.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_unifiedresource_vpc(
        self,
        request: cas_models.ListUnifiedresourceVpcRequest,
    ) -> cas_models.ListUnifiedresourceVpcResponse:
        """
        Description: 查询当前region的vpc列表
        Summary: 查询region vpc列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_unifiedresource_vpc_ex(request, headers, runtime)

    async def list_unifiedresource_vpc_async(
        self,
        request: cas_models.ListUnifiedresourceVpcRequest,
    ) -> cas_models.ListUnifiedresourceVpcResponse:
        """
        Description: 查询当前region的vpc列表
        Summary: 查询region vpc列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_unifiedresource_vpc_ex_async(request, headers, runtime)

    def list_unifiedresource_vpc_ex(
        self,
        request: cas_models.ListUnifiedresourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceVpcResponse:
        """
        Description: 查询当前region的vpc列表
        Summary: 查询region vpc列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.unifiedresource.vpc.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_unifiedresource_vpc_ex_async(
        self,
        request: cas_models.ListUnifiedresourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListUnifiedresourceVpcResponse:
        """
        Description: 查询当前region的vpc列表
        Summary: 查询region vpc列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListUnifiedresourceVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.unifiedresource.vpc.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_resource_vpc(
        self,
        request: cas_models.ImportResourceVpcRequest,
    ) -> cas_models.ImportResourceVpcResponse:
        """
        Description: 导入vpc到workspace
        Summary: 导入vpc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_resource_vpc_ex(request, headers, runtime)

    async def import_resource_vpc_async(
        self,
        request: cas_models.ImportResourceVpcRequest,
    ) -> cas_models.ImportResourceVpcResponse:
        """
        Description: 导入vpc到workspace
        Summary: 导入vpc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_resource_vpc_ex_async(request, headers, runtime)

    def import_resource_vpc_ex(
        self,
        request: cas_models.ImportResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportResourceVpcResponse:
        """
        Description: 导入vpc到workspace
        Summary: 导入vpc
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportResourceVpcResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.vpc.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_resource_vpc_ex_async(
        self,
        request: cas_models.ImportResourceVpcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportResourceVpcResponse:
        """
        Description: 导入vpc到workspace
        Summary: 导入vpc
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportResourceVpcResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.vpc.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_resource_rule(
        self,
        request: cas_models.DeleteResourceRuleRequest,
    ) -> cas_models.DeleteResourceRuleResponse:
        """
        Description: 删除安全组规则
        Summary: 删除安全组规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_resource_rule_ex(request, headers, runtime)

    async def delete_resource_rule_async(
        self,
        request: cas_models.DeleteResourceRuleRequest,
    ) -> cas_models.DeleteResourceRuleResponse:
        """
        Description: 删除安全组规则
        Summary: 删除安全组规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_resource_rule_ex_async(request, headers, runtime)

    def delete_resource_rule_ex(
        self,
        request: cas_models.DeleteResourceRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceRuleResponse:
        """
        Description: 删除安全组规则
        Summary: 删除安全组规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceRuleResponse(),
            self.do_request('1.0', 'antcloud.cas.resource.rule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_resource_rule_ex_async(
        self,
        request: cas_models.DeleteResourceRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteResourceRuleResponse:
        """
        Description: 删除安全组规则
        Summary: 删除安全组规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteResourceRuleResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resource.rule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_route_entry(
        self,
        request: cas_models.ListRouteEntryRequest,
    ) -> cas_models.ListRouteEntryResponse:
        """
        Description: 查询路由表条目列表
        Summary: 查询路由表条目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_route_entry_ex(request, headers, runtime)

    async def list_route_entry_async(
        self,
        request: cas_models.ListRouteEntryRequest,
    ) -> cas_models.ListRouteEntryResponse:
        """
        Description: 查询路由表条目列表
        Summary: 查询路由表条目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_route_entry_ex_async(request, headers, runtime)

    def list_route_entry_ex(
        self,
        request: cas_models.ListRouteEntryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRouteEntryResponse:
        """
        Description: 查询路由表条目列表
        Summary: 查询路由表条目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRouteEntryResponse(),
            self.do_request('1.0', 'antcloud.cas.route.entry.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_route_entry_ex_async(
        self,
        request: cas_models.ListRouteEntryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListRouteEntryResponse:
        """
        Description: 查询路由表条目列表
        Summary: 查询路由表条目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListRouteEntryResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.route.entry.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_available_disk(
        self,
        request: cas_models.ListAvailableDiskRequest,
    ) -> cas_models.ListAvailableDiskResponse:
        """
        Description: 查询可用disk资源详细信息
        Summary: 查询可用disk资源详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_available_disk_ex(request, headers, runtime)

    async def list_available_disk_async(
        self,
        request: cas_models.ListAvailableDiskRequest,
    ) -> cas_models.ListAvailableDiskResponse:
        """
        Description: 查询可用disk资源详细信息
        Summary: 查询可用disk资源详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_available_disk_ex_async(request, headers, runtime)

    def list_available_disk_ex(
        self,
        request: cas_models.ListAvailableDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAvailableDiskResponse:
        """
        Description: 查询可用disk资源详细信息
        Summary: 查询可用disk资源详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAvailableDiskResponse(),
            self.do_request('1.0', 'antcloud.cas.available.disk.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_available_disk_ex_async(
        self,
        request: cas_models.ListAvailableDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAvailableDiskResponse:
        """
        Description: 查询可用disk资源详细信息
        Summary: 查询可用disk资源详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAvailableDiskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.available.disk.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_available_instancetype(
        self,
        request: cas_models.ListAvailableInstancetypeRequest,
    ) -> cas_models.ListAvailableInstancetypeResponse:
        """
        Description: 查询可用实例类型信息
        Summary: 查询可用实例类型信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_available_instancetype_ex(request, headers, runtime)

    async def list_available_instancetype_async(
        self,
        request: cas_models.ListAvailableInstancetypeRequest,
    ) -> cas_models.ListAvailableInstancetypeResponse:
        """
        Description: 查询可用实例类型信息
        Summary: 查询可用实例类型信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_available_instancetype_ex_async(request, headers, runtime)

    def list_available_instancetype_ex(
        self,
        request: cas_models.ListAvailableInstancetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAvailableInstancetypeResponse:
        """
        Description: 查询可用实例类型信息
        Summary: 查询可用实例类型信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAvailableInstancetypeResponse(),
            self.do_request('1.0', 'antcloud.cas.available.instancetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_available_instancetype_ex_async(
        self,
        request: cas_models.ListAvailableInstancetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListAvailableInstancetypeResponse:
        """
        Description: 查询可用实例类型信息
        Summary: 查询可用实例类型信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListAvailableInstancetypeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.available.instancetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resourcemeta_node(
        self,
        request: cas_models.QueryResourcemetaNodeRequest,
    ) -> cas_models.QueryResourcemetaNodeResponse:
        """
        Description: 查询node meta数据
        Summary: 查询node meta数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resourcemeta_node_ex(request, headers, runtime)

    async def query_resourcemeta_node_async(
        self,
        request: cas_models.QueryResourcemetaNodeRequest,
    ) -> cas_models.QueryResourcemetaNodeResponse:
        """
        Description: 查询node meta数据
        Summary: 查询node meta数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resourcemeta_node_ex_async(request, headers, runtime)

    def query_resourcemeta_node_ex(
        self,
        request: cas_models.QueryResourcemetaNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourcemetaNodeResponse:
        """
        Description: 查询node meta数据
        Summary: 查询node meta数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourcemetaNodeResponse(),
            self.do_request('1.0', 'antcloud.cas.resourcemeta.node.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resourcemeta_node_ex_async(
        self,
        request: cas_models.QueryResourcemetaNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourcemetaNodeResponse:
        """
        Description: 查询node meta数据
        Summary: 查询node meta数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourcemetaNodeResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resourcemeta.node.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resourcemeta_appservice(
        self,
        request: cas_models.QueryResourcemetaAppserviceRequest,
    ) -> cas_models.QueryResourcemetaAppserviceResponse:
        """
        Description: 查询应用服务meta数据
        Summary: 查询应用服务meta数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resourcemeta_appservice_ex(request, headers, runtime)

    async def query_resourcemeta_appservice_async(
        self,
        request: cas_models.QueryResourcemetaAppserviceRequest,
    ) -> cas_models.QueryResourcemetaAppserviceResponse:
        """
        Description: 查询应用服务meta数据
        Summary: 查询应用服务meta数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resourcemeta_appservice_ex_async(request, headers, runtime)

    def query_resourcemeta_appservice_ex(
        self,
        request: cas_models.QueryResourcemetaAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourcemetaAppserviceResponse:
        """
        Description: 查询应用服务meta数据
        Summary: 查询应用服务meta数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourcemetaAppserviceResponse(),
            self.do_request('1.0', 'antcloud.cas.resourcemeta.appservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resourcemeta_appservice_ex_async(
        self,
        request: cas_models.QueryResourcemetaAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryResourcemetaAppserviceResponse:
        """
        Description: 查询应用服务meta数据
        Summary: 查询应用服务meta数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryResourcemetaAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.resourcemeta.appservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_computer(
        self,
        request: cas_models.SyncComputerRequest,
    ) -> cas_models.SyncComputerResponse:
        """
        Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
        Summary: 同步机器状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_computer_ex(request, headers, runtime)

    async def sync_computer_async(
        self,
        request: cas_models.SyncComputerRequest,
    ) -> cas_models.SyncComputerResponse:
        """
        Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
        Summary: 同步机器状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_computer_ex_async(request, headers, runtime)

    def sync_computer_ex(
        self,
        request: cas_models.SyncComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SyncComputerResponse:
        """
        Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
        Summary: 同步机器状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SyncComputerResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_computer_ex_async(
        self,
        request: cas_models.SyncComputerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SyncComputerResponse:
        """
        Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
        Summary: 同步机器状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SyncComputerResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_loadbalance(
        self,
        request: cas_models.SyncLoadbalanceRequest,
    ) -> cas_models.SyncLoadbalanceResponse:
        """
        Description: 同步LB状态
        Summary: 同步LB状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_loadbalance_ex(request, headers, runtime)

    async def sync_loadbalance_async(
        self,
        request: cas_models.SyncLoadbalanceRequest,
    ) -> cas_models.SyncLoadbalanceResponse:
        """
        Description: 同步LB状态
        Summary: 同步LB状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_loadbalance_ex_async(request, headers, runtime)

    def sync_loadbalance_ex(
        self,
        request: cas_models.SyncLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SyncLoadbalanceResponse:
        """
        Description: 同步LB状态
        Summary: 同步LB状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SyncLoadbalanceResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_loadbalance_ex_async(
        self,
        request: cas_models.SyncLoadbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SyncLoadbalanceResponse:
        """
        Description: 同步LB状态
        Summary: 同步LB状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SyncLoadbalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_computer_info(
        self,
        request: cas_models.UpdateComputerInfoRequest,
    ) -> cas_models.UpdateComputerInfoResponse:
        """
        Description: 更新机器基本信息
        Summary: 更新机器基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_computer_info_ex(request, headers, runtime)

    async def update_computer_info_async(
        self,
        request: cas_models.UpdateComputerInfoRequest,
    ) -> cas_models.UpdateComputerInfoResponse:
        """
        Description: 更新机器基本信息
        Summary: 更新机器基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_computer_info_ex_async(request, headers, runtime)

    def update_computer_info_ex(
        self,
        request: cas_models.UpdateComputerInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateComputerInfoResponse:
        """
        Description: 更新机器基本信息
        Summary: 更新机器基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateComputerInfoResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_computer_info_ex_async(
        self,
        request: cas_models.UpdateComputerInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateComputerInfoResponse:
        """
        Description: 更新机器基本信息
        Summary: 更新机器基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateComputerInfoResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_computer_assign(
        self,
        request: cas_models.SetComputerAssignRequest,
    ) -> cas_models.SetComputerAssignResponse:
        """
        Description: 将机器分配给应用
        Summary: 将机器分配给应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_computer_assign_ex(request, headers, runtime)

    async def set_computer_assign_async(
        self,
        request: cas_models.SetComputerAssignRequest,
    ) -> cas_models.SetComputerAssignResponse:
        """
        Description: 将机器分配给应用
        Summary: 将机器分配给应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_computer_assign_ex_async(request, headers, runtime)

    def set_computer_assign_ex(
        self,
        request: cas_models.SetComputerAssignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetComputerAssignResponse:
        """
        Description: 将机器分配给应用
        Summary: 将机器分配给应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetComputerAssignResponse(),
            self.do_request('1.0', 'antcloud.cas.computer.assign.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_computer_assign_ex_async(
        self,
        request: cas_models.SetComputerAssignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SetComputerAssignResponse:
        """
        Description: 将机器分配给应用
        Summary: 将机器分配给应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SetComputerAssignResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.computer.assign.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_request_task(
        self,
        request: cas_models.ExecRequestTaskRequest,
    ) -> cas_models.ExecRequestTaskResponse:
        """
        Description: 执行任务
        Summary: 执行任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_request_task_ex(request, headers, runtime)

    async def exec_request_task_async(
        self,
        request: cas_models.ExecRequestTaskRequest,
    ) -> cas_models.ExecRequestTaskResponse:
        """
        Description: 执行任务
        Summary: 执行任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_request_task_ex_async(request, headers, runtime)

    def exec_request_task_ex(
        self,
        request: cas_models.ExecRequestTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExecRequestTaskResponse:
        """
        Description: 执行任务
        Summary: 执行任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExecRequestTaskResponse(),
            self.do_request('1.0', 'antcloud.cas.request.task.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_request_task_ex_async(
        self,
        request: cas_models.ExecRequestTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ExecRequestTaskResponse:
        """
        Description: 执行任务
        Summary: 执行任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ExecRequestTaskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.request.task.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_disk(
        self,
        request: cas_models.ReinitDiskRequest,
    ) -> cas_models.ReinitDiskResponse:
        """
        Description: 重新初始化机器
        Summary: 重新初始化机器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_disk_ex(request, headers, runtime)

    async def reinit_disk_async(
        self,
        request: cas_models.ReinitDiskRequest,
    ) -> cas_models.ReinitDiskResponse:
        """
        Description: 重新初始化机器
        Summary: 重新初始化机器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_disk_ex_async(request, headers, runtime)

    def reinit_disk_ex(
        self,
        request: cas_models.ReinitDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReinitDiskResponse:
        """
        Description: 重新初始化机器
        Summary: 重新初始化机器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReinitDiskResponse(),
            self.do_request('1.0', 'antcloud.cas.disk.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_disk_ex_async(
        self,
        request: cas_models.ReinitDiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ReinitDiskResponse:
        """
        Description: 重新初始化机器
        Summary: 重新初始化机器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ReinitDiskResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.disk.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_disk_strategy(
        self,
        request: cas_models.UpdateDiskStrategyRequest,
    ) -> cas_models.UpdateDiskStrategyResponse:
        """
        Description: 修改磁盘策略
        Summary: 修改磁盘策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_disk_strategy_ex(request, headers, runtime)

    async def update_disk_strategy_async(
        self,
        request: cas_models.UpdateDiskStrategyRequest,
    ) -> cas_models.UpdateDiskStrategyResponse:
        """
        Description: 修改磁盘策略
        Summary: 修改磁盘策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_disk_strategy_ex_async(request, headers, runtime)

    def update_disk_strategy_ex(
        self,
        request: cas_models.UpdateDiskStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDiskStrategyResponse:
        """
        Description: 修改磁盘策略
        Summary: 修改磁盘策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDiskStrategyResponse(),
            self.do_request('1.0', 'antcloud.cas.disk.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_disk_strategy_ex_async(
        self,
        request: cas_models.UpdateDiskStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateDiskStrategyResponse:
        """
        Description: 修改磁盘策略
        Summary: 修改磁盘策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateDiskStrategyResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.disk.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_loadbalance_vcomputergroup(
        self,
        request: cas_models.CreateLoadbalanceVcomputergroupRequest,
    ) -> cas_models.CreateLoadbalanceVcomputergroupResponse:
        """
        Description: 创建虚拟服务器组
        Summary: 创建虚拟服务器组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def create_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.CreateLoadbalanceVcomputergroupRequest,
    ) -> cas_models.CreateLoadbalanceVcomputergroupResponse:
        """
        Description: 创建虚拟服务器组
        Summary: 创建虚拟服务器组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def create_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.CreateLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceVcomputergroupResponse:
        """
        Description: 创建虚拟服务器组
        Summary: 创建虚拟服务器组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.CreateLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateLoadbalanceVcomputergroupResponse:
        """
        Description: 创建虚拟服务器组
        Summary: 创建虚拟服务器组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_loadbalance_vcomputergroup(
        self,
        request: cas_models.UpdateLoadbalanceVcomputergroupRequest,
    ) -> cas_models.UpdateLoadbalanceVcomputergroupResponse:
        """
        Description: 在VComputerGroup里更新后端服务器
        Summary: 增加VCompute
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def update_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.UpdateLoadbalanceVcomputergroupRequest,
    ) -> cas_models.UpdateLoadbalanceVcomputergroupResponse:
        """
        Description: 在VComputerGroup里更新后端服务器
        Summary: 增加VCompute
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def update_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.UpdateLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceVcomputergroupResponse:
        """
        Description: 在VComputerGroup里更新后端服务器
        Summary: 增加VCompute
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.UpdateLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateLoadbalanceVcomputergroupResponse:
        """
        Description: 在VComputerGroup里更新后端服务器
        Summary: 增加VCompute
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_loadbalance_vcomputergroup(
        self,
        request: cas_models.DeleteLoadbalanceVcomputergroupRequest,
    ) -> cas_models.DeleteLoadbalanceVcomputergroupResponse:
        """
        Description: 删除VComputerGroup
        Summary: 删除VComputerGroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def delete_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.DeleteLoadbalanceVcomputergroupRequest,
    ) -> cas_models.DeleteLoadbalanceVcomputergroupResponse:
        """
        Description: 删除VComputerGroup
        Summary: 删除VComputerGroup
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def delete_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.DeleteLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceVcomputergroupResponse:
        """
        Description: 删除VComputerGroup
        Summary: 删除VComputerGroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.DeleteLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteLoadbalanceVcomputergroupResponse:
        """
        Description: 删除VComputerGroup
        Summary: 删除VComputerGroup
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_loadbalance_vcomputergroup(
        self,
        request: cas_models.AddLoadbalanceVcomputergroupRequest,
    ) -> cas_models.AddLoadbalanceVcomputergroupResponse:
        """
        Description: 在虚拟服务器组中增加服务器
        Summary: 在虚拟服务器组中增加服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def add_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.AddLoadbalanceVcomputergroupRequest,
    ) -> cas_models.AddLoadbalanceVcomputergroupResponse:
        """
        Description: 在虚拟服务器组中增加服务器
        Summary: 在虚拟服务器组中增加服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def add_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.AddLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddLoadbalanceVcomputergroupResponse:
        """
        Description: 在虚拟服务器组中增加服务器
        Summary: 在虚拟服务器组中增加服务器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.AddLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddLoadbalanceVcomputergroupResponse:
        """
        Description: 在虚拟服务器组中增加服务器
        Summary: 在虚拟服务器组中增加服务器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_loadbalance_vcomputergroup(
        self,
        request: cas_models.RemoveLoadbalanceVcomputergroupRequest,
    ) -> cas_models.RemoveLoadbalanceVcomputergroupResponse:
        """
        Description: 从虚拟服务器组中删除服务器
        Summary: 从虚拟服务器组中删除服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_loadbalance_vcomputergroup_ex(request, headers, runtime)

    async def remove_loadbalance_vcomputergroup_async(
        self,
        request: cas_models.RemoveLoadbalanceVcomputergroupRequest,
    ) -> cas_models.RemoveLoadbalanceVcomputergroupResponse:
        """
        Description: 从虚拟服务器组中删除服务器
        Summary: 从虚拟服务器组中删除服务器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_loadbalance_vcomputergroup_ex_async(request, headers, runtime)

    def remove_loadbalance_vcomputergroup_ex(
        self,
        request: cas_models.RemoveLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveLoadbalanceVcomputergroupResponse:
        """
        Description: 从虚拟服务器组中删除服务器
        Summary: 从虚拟服务器组中删除服务器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveLoadbalanceVcomputergroupResponse(),
            self.do_request('1.0', 'antcloud.cas.loadbalance.vcomputergroup.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_loadbalance_vcomputergroup_ex_async(
        self,
        request: cas_models.RemoveLoadbalanceVcomputergroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveLoadbalanceVcomputergroupResponse:
        """
        Description: 从虚拟服务器组中删除服务器
        Summary: 从虚拟服务器组中删除服务器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveLoadbalanceVcomputergroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.loadbalance.vcomputergroup.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dns_recordset(
        self,
        request: cas_models.AddDnsRecordsetRequest,
    ) -> cas_models.AddDnsRecordsetResponse:
        """
        Description: 添加域名记录
        Summary: 添加域名记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dns_recordset_ex(request, headers, runtime)

    async def add_dns_recordset_async(
        self,
        request: cas_models.AddDnsRecordsetRequest,
    ) -> cas_models.AddDnsRecordsetResponse:
        """
        Description: 添加域名记录
        Summary: 添加域名记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dns_recordset_ex_async(request, headers, runtime)

    def add_dns_recordset_ex(
        self,
        request: cas_models.AddDnsRecordsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddDnsRecordsetResponse:
        """
        Description: 添加域名记录
        Summary: 添加域名记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddDnsRecordsetResponse(),
            self.do_request('1.0', 'antcloud.cas.dns.recordset.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dns_recordset_ex_async(
        self,
        request: cas_models.AddDnsRecordsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.AddDnsRecordsetResponse:
        """
        Description: 添加域名记录
        Summary: 添加域名记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.AddDnsRecordsetResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.dns.recordset.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dns_record(
        self,
        request: cas_models.DeleteDnsRecordRequest,
    ) -> cas_models.DeleteDnsRecordResponse:
        """
        Description: 删除一条DNS记录
        Summary: 删除一条DNS记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dns_record_ex(request, headers, runtime)

    async def delete_dns_record_async(
        self,
        request: cas_models.DeleteDnsRecordRequest,
    ) -> cas_models.DeleteDnsRecordResponse:
        """
        Description: 删除一条DNS记录
        Summary: 删除一条DNS记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dns_record_ex_async(request, headers, runtime)

    def delete_dns_record_ex(
        self,
        request: cas_models.DeleteDnsRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDnsRecordResponse:
        """
        Description: 删除一条DNS记录
        Summary: 删除一条DNS记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDnsRecordResponse(),
            self.do_request('1.0', 'antcloud.cas.dns.record.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dns_record_ex_async(
        self,
        request: cas_models.DeleteDnsRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.DeleteDnsRecordResponse:
        """
        Description: 删除一条DNS记录
        Summary: 删除一条DNS记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.DeleteDnsRecordResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.dns.record.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dns_recordset(
        self,
        request: cas_models.QueryDnsRecordsetRequest,
    ) -> cas_models.QueryDnsRecordsetResponse:
        """
        Description: 查询当前recordset
        Summary: 查询当前recordset
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dns_recordset_ex(request, headers, runtime)

    async def query_dns_recordset_async(
        self,
        request: cas_models.QueryDnsRecordsetRequest,
    ) -> cas_models.QueryDnsRecordsetResponse:
        """
        Description: 查询当前recordset
        Summary: 查询当前recordset
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dns_recordset_ex_async(request, headers, runtime)

    def query_dns_recordset_ex(
        self,
        request: cas_models.QueryDnsRecordsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDnsRecordsetResponse:
        """
        Description: 查询当前recordset
        Summary: 查询当前recordset
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDnsRecordsetResponse(),
            self.do_request('1.0', 'antcloud.cas.dns.recordset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dns_recordset_ex_async(
        self,
        request: cas_models.QueryDnsRecordsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryDnsRecordsetResponse:
        """
        Description: 查询当前recordset
        Summary: 查询当前recordset
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryDnsRecordsetResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.dns.recordset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_dns_provider(
        self,
        request: cas_models.BindDnsProviderRequest,
    ) -> cas_models.BindDnsProviderResponse:
        """
        Description: workspace绑定指定DNS服务商
        Summary: workspace绑定指定DNS服务商
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_dns_provider_ex(request, headers, runtime)

    async def bind_dns_provider_async(
        self,
        request: cas_models.BindDnsProviderRequest,
    ) -> cas_models.BindDnsProviderResponse:
        """
        Description: workspace绑定指定DNS服务商
        Summary: workspace绑定指定DNS服务商
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_dns_provider_ex_async(request, headers, runtime)

    def bind_dns_provider_ex(
        self,
        request: cas_models.BindDnsProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BindDnsProviderResponse:
        """
        Description: workspace绑定指定DNS服务商
        Summary: workspace绑定指定DNS服务商
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BindDnsProviderResponse(),
            self.do_request('1.0', 'antcloud.cas.dns.provider.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_dns_provider_ex_async(
        self,
        request: cas_models.BindDnsProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.BindDnsProviderResponse:
        """
        Description: workspace绑定指定DNS服务商
        Summary: workspace绑定指定DNS服务商
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.BindDnsProviderResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.dns.provider.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dns_provider(
        self,
        request: cas_models.ListDnsProviderRequest,
    ) -> cas_models.ListDnsProviderResponse:
        """
        Description: 获取当前环境的DNS provider
        Summary: 获取当前环境的DNS provider
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dns_provider_ex(request, headers, runtime)

    async def list_dns_provider_async(
        self,
        request: cas_models.ListDnsProviderRequest,
    ) -> cas_models.ListDnsProviderResponse:
        """
        Description: 获取当前环境的DNS provider
        Summary: 获取当前环境的DNS provider
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dns_provider_ex_async(request, headers, runtime)

    def list_dns_provider_ex(
        self,
        request: cas_models.ListDnsProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListDnsProviderResponse:
        """
        Description: 获取当前环境的DNS provider
        Summary: 获取当前环境的DNS provider
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListDnsProviderResponse(),
            self.do_request('1.0', 'antcloud.cas.dns.provider.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dns_provider_ex_async(
        self,
        request: cas_models.ListDnsProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListDnsProviderResponse:
        """
        Description: 获取当前环境的DNS provider
        Summary: 获取当前环境的DNS provider
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListDnsProviderResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.dns.provider.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_provider(
        self,
        request: cas_models.QueryProviderRequest,
    ) -> cas_models.QueryProviderResponse:
        """
        Description: 查询当前环境资源供应商信息
        Summary: 查询当前环境资源供应商信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_provider_ex(request, headers, runtime)

    async def query_provider_async(
        self,
        request: cas_models.QueryProviderRequest,
    ) -> cas_models.QueryProviderResponse:
        """
        Description: 查询当前环境资源供应商信息
        Summary: 查询当前环境资源供应商信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_provider_ex_async(request, headers, runtime)

    def query_provider_ex(
        self,
        request: cas_models.QueryProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryProviderResponse:
        """
        Description: 查询当前环境资源供应商信息
        Summary: 查询当前环境资源供应商信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryProviderResponse(),
            self.do_request('1.0', 'antcloud.cas.provider.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_provider_ex_async(
        self,
        request: cas_models.QueryProviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryProviderResponse:
        """
        Description: 查询当前环境资源供应商信息
        Summary: 查询当前环境资源供应商信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryProviderResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.provider.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dns_workspaceprovider(
        self,
        request: cas_models.GetDnsWorkspaceproviderRequest,
    ) -> cas_models.GetDnsWorkspaceproviderResponse:
        """
        Description: 获取当前工作空间的DNSProvider
        Summary: 获取当前工作空间的DNSProvider
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dns_workspaceprovider_ex(request, headers, runtime)

    async def get_dns_workspaceprovider_async(
        self,
        request: cas_models.GetDnsWorkspaceproviderRequest,
    ) -> cas_models.GetDnsWorkspaceproviderResponse:
        """
        Description: 获取当前工作空间的DNSProvider
        Summary: 获取当前工作空间的DNSProvider
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dns_workspaceprovider_ex_async(request, headers, runtime)

    def get_dns_workspaceprovider_ex(
        self,
        request: cas_models.GetDnsWorkspaceproviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetDnsWorkspaceproviderResponse:
        """
        Description: 获取当前工作空间的DNSProvider
        Summary: 获取当前工作空间的DNSProvider
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetDnsWorkspaceproviderResponse(),
            self.do_request('1.0', 'antcloud.cas.dns.workspaceprovider.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dns_workspaceprovider_ex_async(
        self,
        request: cas_models.GetDnsWorkspaceproviderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.GetDnsWorkspaceproviderResponse:
        """
        Description: 获取当前工作空间的DNSProvider
        Summary: 获取当前工作空间的DNSProvider
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.GetDnsWorkspaceproviderResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.dns.workspaceprovider.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_uniworkspacegroup(
        self,
        request: cas_models.CreateUniworkspacegroupRequest,
    ) -> cas_models.CreateUniworkspacegroupResponse:
        """
        Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
        Summary: [异步]创建工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_uniworkspacegroup_ex(request, headers, runtime)

    async def create_uniworkspacegroup_async(
        self,
        request: cas_models.CreateUniworkspacegroupRequest,
    ) -> cas_models.CreateUniworkspacegroupResponse:
        """
        Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
        Summary: [异步]创建工作空间组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_uniworkspacegroup_ex_async(request, headers, runtime)

    def create_uniworkspacegroup_ex(
        self,
        request: cas_models.CreateUniworkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateUniworkspacegroupResponse:
        """
        Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
        Summary: [异步]创建工作空间组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateUniworkspacegroupResponse(),
            self.do_request('1.0', 'antcloud.cas.uniworkspacegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_uniworkspacegroup_ex_async(
        self,
        request: cas_models.CreateUniworkspacegroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateUniworkspacegroupResponse:
        """
        Description: [异步]创建工作空间组，包括了VPC，交换机，单元化架构的一体化创建
        Summary: [异步]创建工作空间组
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateUniworkspacegroupResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.uniworkspacegroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_middlewarecluster(
        self,
        request: cas_models.ImportMiddlewareclusterRequest,
    ) -> cas_models.ImportMiddlewareclusterResponse:
        """
        Description: 导入一个中间件集群
        Summary: 导入一个中间件集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_middlewarecluster_ex(request, headers, runtime)

    async def import_middlewarecluster_async(
        self,
        request: cas_models.ImportMiddlewareclusterRequest,
    ) -> cas_models.ImportMiddlewareclusterResponse:
        """
        Description: 导入一个中间件集群
        Summary: 导入一个中间件集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_middlewarecluster_ex_async(request, headers, runtime)

    def import_middlewarecluster_ex(
        self,
        request: cas_models.ImportMiddlewareclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportMiddlewareclusterResponse:
        """
        Description: 导入一个中间件集群
        Summary: 导入一个中间件集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportMiddlewareclusterResponse(),
            self.do_request('1.0', 'antcloud.cas.middlewarecluster.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_middlewarecluster_ex_async(
        self,
        request: cas_models.ImportMiddlewareclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ImportMiddlewareclusterResponse:
        """
        Description: 导入一个中间件集群
        Summary: 导入一个中间件集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ImportMiddlewareclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.middlewarecluster.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_middlewarecluster(
        self,
        request: cas_models.QueryMiddlewareclusterRequest,
    ) -> cas_models.QueryMiddlewareclusterResponse:
        """
        Description: 查询当前工作空间中间件集群
        Summary: 查询当前工作空间中间件集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_middlewarecluster_ex(request, headers, runtime)

    async def query_middlewarecluster_async(
        self,
        request: cas_models.QueryMiddlewareclusterRequest,
    ) -> cas_models.QueryMiddlewareclusterResponse:
        """
        Description: 查询当前工作空间中间件集群
        Summary: 查询当前工作空间中间件集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_middlewarecluster_ex_async(request, headers, runtime)

    def query_middlewarecluster_ex(
        self,
        request: cas_models.QueryMiddlewareclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryMiddlewareclusterResponse:
        """
        Description: 查询当前工作空间中间件集群
        Summary: 查询当前工作空间中间件集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryMiddlewareclusterResponse(),
            self.do_request('1.0', 'antcloud.cas.middlewarecluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_middlewarecluster_ex_async(
        self,
        request: cas_models.QueryMiddlewareclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryMiddlewareclusterResponse:
        """
        Description: 查询当前工作空间中间件集群
        Summary: 查询当前工作空间中间件集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryMiddlewareclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.middlewarecluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_middlewarecluster(
        self,
        request: cas_models.RemoveMiddlewareclusterRequest,
    ) -> cas_models.RemoveMiddlewareclusterResponse:
        """
        Description: 移除一个中间件集群
        Summary: 移除一个中间件集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_middlewarecluster_ex(request, headers, runtime)

    async def remove_middlewarecluster_async(
        self,
        request: cas_models.RemoveMiddlewareclusterRequest,
    ) -> cas_models.RemoveMiddlewareclusterResponse:
        """
        Description: 移除一个中间件集群
        Summary: 移除一个中间件集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_middlewarecluster_ex_async(request, headers, runtime)

    def remove_middlewarecluster_ex(
        self,
        request: cas_models.RemoveMiddlewareclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveMiddlewareclusterResponse:
        """
        Description: 移除一个中间件集群
        Summary: 移除一个中间件集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveMiddlewareclusterResponse(),
            self.do_request('1.0', 'antcloud.cas.middlewarecluster.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_middlewarecluster_ex_async(
        self,
        request: cas_models.RemoveMiddlewareclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.RemoveMiddlewareclusterResponse:
        """
        Description: 移除一个中间件集群
        Summary: 移除一个中间件集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.RemoveMiddlewareclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.middlewarecluster.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_quota_instance(
        self,
        request: cas_models.QueryQuotaInstanceRequest,
    ) -> cas_models.QueryQuotaInstanceResponse:
        """
        Description: 配额实例指的就是某个工作空间或者某个APP的关于某个资源的额度
        Summary: 查询当前配额实例的额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_quota_instance_ex(request, headers, runtime)

    async def query_quota_instance_async(
        self,
        request: cas_models.QueryQuotaInstanceRequest,
    ) -> cas_models.QueryQuotaInstanceResponse:
        """
        Description: 配额实例指的就是某个工作空间或者某个APP的关于某个资源的额度
        Summary: 查询当前配额实例的额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_quota_instance_ex_async(request, headers, runtime)

    def query_quota_instance_ex(
        self,
        request: cas_models.QueryQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryQuotaInstanceResponse:
        """
        Description: 配额实例指的就是某个工作空间或者某个APP的关于某个资源的额度
        Summary: 查询当前配额实例的额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryQuotaInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_quota_instance_ex_async(
        self,
        request: cas_models.QueryQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryQuotaInstanceResponse:
        """
        Description: 配额实例指的就是某个工作空间或者某个APP的关于某个资源的额度
        Summary: 查询当前配额实例的额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryQuotaInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_singledimquota_instance(
        self,
        request: cas_models.QuerySingledimquotaInstanceRequest,
    ) -> cas_models.QuerySingledimquotaInstanceResponse:
        """
        Description: 查询单实例维度的配额实例信息,如果没有该维度实例时则会先创建该维度实例
        Summary: 查询单实例维度的配额实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_singledimquota_instance_ex(request, headers, runtime)

    async def query_singledimquota_instance_async(
        self,
        request: cas_models.QuerySingledimquotaInstanceRequest,
    ) -> cas_models.QuerySingledimquotaInstanceResponse:
        """
        Description: 查询单实例维度的配额实例信息,如果没有该维度实例时则会先创建该维度实例
        Summary: 查询单实例维度的配额实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_singledimquota_instance_ex_async(request, headers, runtime)

    def query_singledimquota_instance_ex(
        self,
        request: cas_models.QuerySingledimquotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySingledimquotaInstanceResponse:
        """
        Description: 查询单实例维度的配额实例信息,如果没有该维度实例时则会先创建该维度实例
        Summary: 查询单实例维度的配额实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySingledimquotaInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.singledimquota.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_singledimquota_instance_ex_async(
        self,
        request: cas_models.QuerySingledimquotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QuerySingledimquotaInstanceResponse:
        """
        Description: 查询单实例维度的配额实例信息,如果没有该维度实例时则会先创建该维度实例
        Summary: 查询单实例维度的配额实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QuerySingledimquotaInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.singledimquota.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_quota(
        self,
        request: cas_models.QueryQuotaRequest,
    ) -> cas_models.QueryQuotaResponse:
        """
        Description: 查询限额对象，非限额实例。限额对象仅仅包含资源组合描述信息。请根据返回的QuotaId查询具体的实例信息
        Summary: 查询限额对象
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_quota_ex(request, headers, runtime)

    async def query_quota_async(
        self,
        request: cas_models.QueryQuotaRequest,
    ) -> cas_models.QueryQuotaResponse:
        """
        Description: 查询限额对象，非限额实例。限额对象仅仅包含资源组合描述信息。请根据返回的QuotaId查询具体的实例信息
        Summary: 查询限额对象
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_quota_ex_async(request, headers, runtime)

    def query_quota_ex(
        self,
        request: cas_models.QueryQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryQuotaResponse:
        """
        Description: 查询限额对象，非限额实例。限额对象仅仅包含资源组合描述信息。请根据返回的QuotaId查询具体的实例信息
        Summary: 查询限额对象
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryQuotaResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_quota_ex_async(
        self,
        request: cas_models.QueryQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.QueryQuotaResponse:
        """
        Description: 查询限额对象，非限额实例。限额对象仅仅包含资源组合描述信息。请根据返回的QuotaId查询具体的实例信息
        Summary: 查询限额对象
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.QueryQuotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_quota(
        self,
        request: cas_models.CreateQuotaRequest,
    ) -> cas_models.CreateQuotaResponse:
        """
        Description: 注意概念，额度对某个资源从哪些维度限定的数量，举个例子，给所有workspace都配置一个默认值，而非某个单独实例
        Summary: 创建一个额度，用于某个维度的默认额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_quota_ex(request, headers, runtime)

    async def create_quota_async(
        self,
        request: cas_models.CreateQuotaRequest,
    ) -> cas_models.CreateQuotaResponse:
        """
        Description: 注意概念，额度对某个资源从哪些维度限定的数量，举个例子，给所有workspace都配置一个默认值，而非某个单独实例
        Summary: 创建一个额度，用于某个维度的默认额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_quota_ex_async(request, headers, runtime)

    def create_quota_ex(
        self,
        request: cas_models.CreateQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateQuotaResponse:
        """
        Description: 注意概念，额度对某个资源从哪些维度限定的数量，举个例子，给所有workspace都配置一个默认值，而非某个单独实例
        Summary: 创建一个额度，用于某个维度的默认额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateQuotaResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_quota_ex_async(
        self,
        request: cas_models.CreateQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CreateQuotaResponse:
        """
        Description: 注意概念，额度对某个资源从哪些维度限定的数量，举个例子，给所有workspace都配置一个默认值，而非某个单独实例
        Summary: 创建一个额度，用于某个维度的默认额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CreateQuotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_quota(
        self,
        request: cas_models.UpdateQuotaRequest,
    ) -> cas_models.UpdateQuotaResponse:
        """
        Description: 更新维度配额，非维度实例，这个一般是全站级别的额度。
        Summary: 更新维度配额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_quota_ex(request, headers, runtime)

    async def update_quota_async(
        self,
        request: cas_models.UpdateQuotaRequest,
    ) -> cas_models.UpdateQuotaResponse:
        """
        Description: 更新维度配额，非维度实例，这个一般是全站级别的额度。
        Summary: 更新维度配额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_quota_ex_async(request, headers, runtime)

    def update_quota_ex(
        self,
        request: cas_models.UpdateQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateQuotaResponse:
        """
        Description: 更新维度配额，非维度实例，这个一般是全站级别的额度。
        Summary: 更新维度配额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateQuotaResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_quota_ex_async(
        self,
        request: cas_models.UpdateQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateQuotaResponse:
        """
        Description: 更新维度配额，非维度实例，这个一般是全站级别的额度。
        Summary: 更新维度配额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateQuotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def findcreate_quota_instance(
        self,
        request: cas_models.FindcreateQuotaInstanceRequest,
    ) -> cas_models.FindcreateQuotaInstanceResponse:
        """
        Description: 创建一个额度实例，用于某个维度实例，如果已经存在。返回已经存在。请用用这个接口查询当前额度
        Summary: 创建一个额度实例，用于某个维度实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.findcreate_quota_instance_ex(request, headers, runtime)

    async def findcreate_quota_instance_async(
        self,
        request: cas_models.FindcreateQuotaInstanceRequest,
    ) -> cas_models.FindcreateQuotaInstanceResponse:
        """
        Description: 创建一个额度实例，用于某个维度实例，如果已经存在。返回已经存在。请用用这个接口查询当前额度
        Summary: 创建一个额度实例，用于某个维度实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.findcreate_quota_instance_ex_async(request, headers, runtime)

    def findcreate_quota_instance_ex(
        self,
        request: cas_models.FindcreateQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.FindcreateQuotaInstanceResponse:
        """
        Description: 创建一个额度实例，用于某个维度实例，如果已经存在。返回已经存在。请用用这个接口查询当前额度
        Summary: 创建一个额度实例，用于某个维度实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.FindcreateQuotaInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.instance.findcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def findcreate_quota_instance_ex_async(
        self,
        request: cas_models.FindcreateQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.FindcreateQuotaInstanceResponse:
        """
        Description: 创建一个额度实例，用于某个维度实例，如果已经存在。返回已经存在。请用用这个接口查询当前额度
        Summary: 创建一个额度实例，用于某个维度实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.FindcreateQuotaInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.instance.findcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_quota_instance(
        self,
        request: cas_models.UpdateQuotaInstanceRequest,
    ) -> cas_models.UpdateQuotaInstanceResponse:
        """
        Description: 更新一个额度实例，用于某个维度实例
        Summary: 更新一个额度实例，用于某个维度实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_quota_instance_ex(request, headers, runtime)

    async def update_quota_instance_async(
        self,
        request: cas_models.UpdateQuotaInstanceRequest,
    ) -> cas_models.UpdateQuotaInstanceResponse:
        """
        Description: 更新一个额度实例，用于某个维度实例
        Summary: 更新一个额度实例，用于某个维度实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_quota_instance_ex_async(request, headers, runtime)

    def update_quota_instance_ex(
        self,
        request: cas_models.UpdateQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateQuotaInstanceResponse:
        """
        Description: 更新一个额度实例，用于某个维度实例
        Summary: 更新一个额度实例，用于某个维度实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateQuotaInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_quota_instance_ex_async(
        self,
        request: cas_models.UpdateQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateQuotaInstanceResponse:
        """
        Description: 更新一个额度实例，用于某个维度实例
        Summary: 更新一个额度实例，用于某个维度实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateQuotaInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_quota(
        self,
        request: cas_models.CheckQuotaRequest,
    ) -> cas_models.CheckQuotaResponse:
        """
        Description: 检查额度是否够
        Summary: 检查额度是否够
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_quota_ex(request, headers, runtime)

    async def check_quota_async(
        self,
        request: cas_models.CheckQuotaRequest,
    ) -> cas_models.CheckQuotaResponse:
        """
        Description: 检查额度是否够
        Summary: 检查额度是否够
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_quota_ex_async(request, headers, runtime)

    def check_quota_ex(
        self,
        request: cas_models.CheckQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CheckQuotaResponse:
        """
        Description: 检查额度是否够
        Summary: 检查额度是否够
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CheckQuotaResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_quota_ex_async(
        self,
        request: cas_models.CheckQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.CheckQuotaResponse:
        """
        Description: 检查额度是否够
        Summary: 检查额度是否够
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.CheckQuotaResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_token(
        self,
        request: cas_models.OpenTokenRequest,
    ) -> cas_models.OpenTokenResponse:
        """
        Description: 创建一个任务用Token，用于保证任务的幂等性
        Summary: 创建一个任务用Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_token_ex(request, headers, runtime)

    async def open_token_async(
        self,
        request: cas_models.OpenTokenRequest,
    ) -> cas_models.OpenTokenResponse:
        """
        Description: 创建一个任务用Token，用于保证任务的幂等性
        Summary: 创建一个任务用Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_token_ex_async(request, headers, runtime)

    def open_token_ex(
        self,
        request: cas_models.OpenTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.OpenTokenResponse:
        """
        Description: 创建一个任务用Token，用于保证任务的幂等性
        Summary: 创建一个任务用Token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.OpenTokenResponse(),
            self.do_request('1.0', 'antcloud.cas.token.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_token_ex_async(
        self,
        request: cas_models.OpenTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.OpenTokenResponse:
        """
        Description: 创建一个任务用Token，用于保证任务的幂等性
        Summary: 创建一个任务用Token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.OpenTokenResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.token.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_quota_instance(
        self,
        request: cas_models.SyncQuotaInstanceRequest,
    ) -> cas_models.SyncQuotaInstanceResponse:
        """
        Description: 同步当前数据库记录的额度与实际使用的额度
        Summary: 同步当前数据库记录的额度与实际使用的额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_quota_instance_ex(request, headers, runtime)

    async def sync_quota_instance_async(
        self,
        request: cas_models.SyncQuotaInstanceRequest,
    ) -> cas_models.SyncQuotaInstanceResponse:
        """
        Description: 同步当前数据库记录的额度与实际使用的额度
        Summary: 同步当前数据库记录的额度与实际使用的额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_quota_instance_ex_async(request, headers, runtime)

    def sync_quota_instance_ex(
        self,
        request: cas_models.SyncQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SyncQuotaInstanceResponse:
        """
        Description: 同步当前数据库记录的额度与实际使用的额度
        Summary: 同步当前数据库记录的额度与实际使用的额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SyncQuotaInstanceResponse(),
            self.do_request('1.0', 'antcloud.cas.quota.instance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_quota_instance_ex_async(
        self,
        request: cas_models.SyncQuotaInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.SyncQuotaInstanceResponse:
        """
        Description: 同步当前数据库记录的额度与实际使用的额度
        Summary: 同步当前数据库记录的额度与实际使用的额度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.SyncQuotaInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.quota.instance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_feature(
        self,
        request: cas_models.UpdateFeatureRequest,
    ) -> cas_models.UpdateFeatureResponse:
        """
        Description: 更新某个开关
        Summary: 更新某个开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_feature_ex(request, headers, runtime)

    async def update_feature_async(
        self,
        request: cas_models.UpdateFeatureRequest,
    ) -> cas_models.UpdateFeatureResponse:
        """
        Description: 更新某个开关
        Summary: 更新某个开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_feature_ex_async(request, headers, runtime)

    def update_feature_ex(
        self,
        request: cas_models.UpdateFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateFeatureResponse:
        """
        Description: 更新某个开关
        Summary: 更新某个开关
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateFeatureResponse(),
            self.do_request('1.0', 'antcloud.cas.feature.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_feature_ex_async(
        self,
        request: cas_models.UpdateFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.UpdateFeatureResponse:
        """
        Description: 更新某个开关
        Summary: 更新某个开关
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.UpdateFeatureResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.feature.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_feature(
        self,
        request: cas_models.ListFeatureRequest,
    ) -> cas_models.ListFeatureResponse:
        """
        Description: 获取当前系统配置项
        Summary: 获取当前系统配置项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_feature_ex(request, headers, runtime)

    async def list_feature_async(
        self,
        request: cas_models.ListFeatureRequest,
    ) -> cas_models.ListFeatureResponse:
        """
        Description: 获取当前系统配置项
        Summary: 获取当前系统配置项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_feature_ex_async(request, headers, runtime)

    def list_feature_ex(
        self,
        request: cas_models.ListFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListFeatureResponse:
        """
        Description: 获取当前系统配置项
        Summary: 获取当前系统配置项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListFeatureResponse(),
            self.do_request('1.0', 'antcloud.cas.feature.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_feature_ex_async(
        self,
        request: cas_models.ListFeatureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cas_models.ListFeatureResponse:
        """
        Description: 获取当前系统配置项
        Summary: 获取当前系统配置项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cas_models.ListFeatureResponse(),
            await self.do_request_async('1.0', 'antcloud.cas.feature.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
