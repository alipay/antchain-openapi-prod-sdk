# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ldc import models as ldc_models
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
        config: ldc_models.Config,
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
            # label selector requirement struct
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
                    'sdk_version': '1.12.83',
                    '_prod_code': 'ldc',
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
            # label selector requirement struct
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
                    'sdk_version': '1.12.83',
                    '_prod_code': 'ldc',
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

    def bind_appservice(
        self,
        request: ldc_models.BindAppserviceRequest,
    ) -> ldc_models.BindAppserviceResponse:
        """
        Description: 关联单元化应用服务实例
        Summary: 关联单元化应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_appservice_ex(request, headers, runtime)

    async def bind_appservice_async(
        self,
        request: ldc_models.BindAppserviceRequest,
    ) -> ldc_models.BindAppserviceResponse:
        """
        Description: 关联单元化应用服务实例
        Summary: 关联单元化应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_appservice_ex_async(request, headers, runtime)

    def bind_appservice_ex(
        self,
        request: ldc_models.BindAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.BindAppserviceResponse:
        """
        Description: 关联单元化应用服务实例
        Summary: 关联单元化应用服务实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.BindAppserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.appservice.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_appservice_ex_async(
        self,
        request: ldc_models.BindAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.BindAppserviceResponse:
        """
        Description: 关联单元化应用服务实例
        Summary: 关联单元化应用服务实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.BindAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appservice.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_appservice(
        self,
        request: ldc_models.UnbindAppserviceRequest,
    ) -> ldc_models.UnbindAppserviceResponse:
        """
        Description: 解除关联的单元化应用服务实例
        Summary: 解除关联的单元化应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_appservice_ex(request, headers, runtime)

    async def unbind_appservice_async(
        self,
        request: ldc_models.UnbindAppserviceRequest,
    ) -> ldc_models.UnbindAppserviceResponse:
        """
        Description: 解除关联的单元化应用服务实例
        Summary: 解除关联的单元化应用服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_appservice_ex_async(request, headers, runtime)

    def unbind_appservice_ex(
        self,
        request: ldc_models.UnbindAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UnbindAppserviceResponse:
        """
        Description: 解除关联的单元化应用服务实例
        Summary: 解除关联的单元化应用服务实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UnbindAppserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.appservice.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_appservice_ex_async(
        self,
        request: ldc_models.UnbindAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UnbindAppserviceResponse:
        """
        Description: 解除关联的单元化应用服务实例
        Summary: 解除关联的单元化应用服务实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UnbindAppserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appservice.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_appops(
        self,
        request: ldc_models.CreateAppopsRequest,
    ) -> ldc_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用执行一次运维操作
        Summary: 创建一个应用运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appops_ex(request, headers, runtime)

    async def create_appops_async(
        self,
        request: ldc_models.CreateAppopsRequest,
    ) -> ldc_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用执行一次运维操作
        Summary: 创建一个应用运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appops_ex_async(request, headers, runtime)

    def create_appops_ex(
        self,
        request: ldc_models.CreateAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用执行一次运维操作
        Summary: 创建一个应用运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appops_ex_async(
        self,
        request: ldc_models.CreateAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateAppopsResponse:
        """
        Description: 创建一个应用运维单，以对一组应用执行一次运维操作
        Summary: 创建一个应用运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appops(
        self,
        request: ldc_models.GetAppopsRequest,
    ) -> ldc_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的部署操作
        Summary: 查询一个已经创建成功的部署操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appops_ex(request, headers, runtime)

    async def get_appops_async(
        self,
        request: ldc_models.GetAppopsRequest,
    ) -> ldc_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的部署操作
        Summary: 查询一个已经创建成功的部署操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appops_ex_async(request, headers, runtime)

    def get_appops_ex(
        self,
        request: ldc_models.GetAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的部署操作
        Summary: 查询一个已经创建成功的部署操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appops_ex_async(
        self,
        request: ldc_models.GetAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetAppopsResponse:
        """
        Description: 查询一个已经创建成功的部署操作
        Summary: 查询一个已经创建成功的部署操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appops_application(
        self,
        request: ldc_models.GetAppopsApplicationRequest,
    ) -> ldc_models.GetAppopsApplicationResponse:
        """
        Description: 查询一个运维操作中某个应用的详情
        Summary: 查询一个运维操作中某个应用的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appops_application_ex(request, headers, runtime)

    async def get_appops_application_async(
        self,
        request: ldc_models.GetAppopsApplicationRequest,
    ) -> ldc_models.GetAppopsApplicationResponse:
        """
        Description: 查询一个运维操作中某个应用的详情
        Summary: 查询一个运维操作中某个应用的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appops_application_ex_async(request, headers, runtime)

    def get_appops_application_ex(
        self,
        request: ldc_models.GetAppopsApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetAppopsApplicationResponse:
        """
        Description: 查询一个运维操作中某个应用的详情
        Summary: 查询一个运维操作中某个应用的详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetAppopsApplicationResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appops_application_ex_async(
        self,
        request: ldc_models.GetAppopsApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetAppopsApplicationResponse:
        """
        Description: 查询一个运维操作中某个应用的详情
        Summary: 查询一个运维操作中某个应用的详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetAppopsApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_appops(
        self,
        request: ldc_models.StartAppopsRequest,
    ) -> ldc_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始执行一个已经创建成功的运维操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_appops_ex(request, headers, runtime)

    async def start_appops_async(
        self,
        request: ldc_models.StartAppopsRequest,
    ) -> ldc_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始执行一个已经创建成功的运维操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_appops_ex_async(request, headers, runtime)

    def start_appops_ex(
        self,
        request: ldc_models.StartAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始执行一个已经创建成功的运维操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.StartAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_appops_ex_async(
        self,
        request: ldc_models.StartAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.StartAppopsResponse:
        """
        Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
        Summary: 开始执行一个已经创建成功的运维操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.StartAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reinit_appops(
        self,
        request: ldc_models.ReinitAppopsRequest,
    ) -> ldc_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化一个初始化失败的运维单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reinit_appops_ex(request, headers, runtime)

    async def reinit_appops_async(
        self,
        request: ldc_models.ReinitAppopsRequest,
    ) -> ldc_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化一个初始化失败的运维单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reinit_appops_ex_async(request, headers, runtime)

    def reinit_appops_ex(
        self,
        request: ldc_models.ReinitAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化一个初始化失败的运维单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ReinitAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reinit_appops_ex_async(
        self,
        request: ldc_models.ReinitAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ReinitAppopsResponse:
        """
        Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
        Summary: 重新初始化一个初始化失败的运维单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ReinitAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.reinit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_appops(
        self,
        request: ldc_models.CancelAppopsRequest,
    ) -> ldc_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
        Summary: 对一个运维单执行取消操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_appops_ex(request, headers, runtime)

    async def cancel_appops_async(
        self,
        request: ldc_models.CancelAppopsRequest,
    ) -> ldc_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
        Summary: 对一个运维单执行取消操作。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_appops_ex_async(request, headers, runtime)

    def cancel_appops_ex(
        self,
        request: ldc_models.CancelAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
        Summary: 对一个运维单执行取消操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_appops_ex_async(
        self,
        request: ldc_models.CancelAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelAppopsResponse:
        """
        Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
        Summary: 对一个运维单执行取消操作。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_appops(
        self,
        request: ldc_models.RetryAppopsRequest,
    ) -> ldc_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
        Summary: 重试运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_appops_ex(request, headers, runtime)

    async def retry_appops_async(
        self,
        request: ldc_models.RetryAppopsRequest,
    ) -> ldc_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
        Summary: 重试运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_appops_ex_async(request, headers, runtime)

    def retry_appops_ex(
        self,
        request: ldc_models.RetryAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
        Summary: 重试运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RetryAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_appops_ex_async(
        self,
        request: ldc_models.RetryAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RetryAppopsResponse:
        """
        Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
        Summary: 重试运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RetryAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_deployment(
        self,
        request: ldc_models.GetDeploymentRequest,
    ) -> ldc_models.GetDeploymentResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_deployment_ex(request, headers, runtime)

    async def get_deployment_async(
        self,
        request: ldc_models.GetDeploymentRequest,
    ) -> ldc_models.GetDeploymentResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_deployment_ex_async(request, headers, runtime)

    def get_deployment_ex(
        self,
        request: ldc_models.GetDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetDeploymentResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_deployment_ex_async(
        self,
        request: ldc_models.GetDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetDeploymentResponse:
        """
        Description: 查询发布单
        Summary: 查询发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_deployment_application(
        self,
        request: ldc_models.GetDeploymentApplicationRequest,
    ) -> ldc_models.GetDeploymentApplicationResponse:
        """
        Description: 查询部署单中某个应用的详情
        Summary: 查询部署单中某个应用的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_deployment_application_ex(request, headers, runtime)

    async def get_deployment_application_async(
        self,
        request: ldc_models.GetDeploymentApplicationRequest,
    ) -> ldc_models.GetDeploymentApplicationResponse:
        """
        Description: 查询部署单中某个应用的详情
        Summary: 查询部署单中某个应用的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_deployment_application_ex_async(request, headers, runtime)

    def get_deployment_application_ex(
        self,
        request: ldc_models.GetDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetDeploymentApplicationResponse:
        """
        Description: 查询部署单中某个应用的详情
        Summary: 查询部署单中某个应用的详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetDeploymentApplicationResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_deployment_application_ex_async(
        self,
        request: ldc_models.GetDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetDeploymentApplicationResponse:
        """
        Description: 查询部署单中某个应用的详情
        Summary: 查询部署单中某个应用的详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetDeploymentApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.application.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_deployment_rollback(
        self,
        request: ldc_models.GetDeploymentRollbackRequest,
    ) -> ldc_models.GetDeploymentRollbackResponse:
        """
        Description: 查询部署单中某个应用的回滚详情
        Summary: 查询部署单中某个应用的回滚详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_deployment_rollback_ex(request, headers, runtime)

    async def get_deployment_rollback_async(
        self,
        request: ldc_models.GetDeploymentRollbackRequest,
    ) -> ldc_models.GetDeploymentRollbackResponse:
        """
        Description: 查询部署单中某个应用的回滚详情
        Summary: 查询部署单中某个应用的回滚详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_deployment_rollback_ex_async(request, headers, runtime)

    def get_deployment_rollback_ex(
        self,
        request: ldc_models.GetDeploymentRollbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetDeploymentRollbackResponse:
        """
        Description: 查询部署单中某个应用的回滚详情
        Summary: 查询部署单中某个应用的回滚详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetDeploymentRollbackResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.rollback.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_deployment_rollback_ex_async(
        self,
        request: ldc_models.GetDeploymentRollbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetDeploymentRollbackResponse:
        """
        Description: 查询部署单中某个应用的回滚详情
        Summary: 查询部署单中某个应用的回滚详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetDeploymentRollbackResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.rollback.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deployment_rollbackable(
        self,
        request: ldc_models.QueryDeploymentRollbackableRequest,
    ) -> ldc_models.QueryDeploymentRollbackableResponse:
        """
        Description: 查询可回滚的版本信息
        Summary: 查询可回滚的版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deployment_rollbackable_ex(request, headers, runtime)

    async def query_deployment_rollbackable_async(
        self,
        request: ldc_models.QueryDeploymentRollbackableRequest,
    ) -> ldc_models.QueryDeploymentRollbackableResponse:
        """
        Description: 查询可回滚的版本信息
        Summary: 查询可回滚的版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deployment_rollbackable_ex_async(request, headers, runtime)

    def query_deployment_rollbackable_ex(
        self,
        request: ldc_models.QueryDeploymentRollbackableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryDeploymentRollbackableResponse:
        """
        Description: 查询可回滚的版本信息
        Summary: 查询可回滚的版本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryDeploymentRollbackableResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.rollbackable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deployment_rollbackable_ex_async(
        self,
        request: ldc_models.QueryDeploymentRollbackableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryDeploymentRollbackableResponse:
        """
        Description: 查询可回滚的版本信息
        Summary: 查询可回滚的版本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryDeploymentRollbackableResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.rollbackable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_deployment_application(
        self,
        request: ldc_models.RollbackDeploymentApplicationRequest,
    ) -> ldc_models.RollbackDeploymentApplicationResponse:
        """
        Description: 回滚指定的应用
        Summary: 回滚指定的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_deployment_application_ex(request, headers, runtime)

    async def rollback_deployment_application_async(
        self,
        request: ldc_models.RollbackDeploymentApplicationRequest,
    ) -> ldc_models.RollbackDeploymentApplicationResponse:
        """
        Description: 回滚指定的应用
        Summary: 回滚指定的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_deployment_application_ex_async(request, headers, runtime)

    def rollback_deployment_application_ex(
        self,
        request: ldc_models.RollbackDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RollbackDeploymentApplicationResponse:
        """
        Description: 回滚指定的应用
        Summary: 回滚指定的应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RollbackDeploymentApplicationResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.application.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_deployment_application_ex_async(
        self,
        request: ldc_models.RollbackDeploymentApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RollbackDeploymentApplicationResponse:
        """
        Description: 回滚指定的应用
        Summary: 回滚指定的应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RollbackDeploymentApplicationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.application.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_flow_routeclient(
        self,
        request: ldc_models.PushFlowRouteclientRequest,
    ) -> ldc_models.PushFlowRouteclientResponse:
        """
        Description: 推送 LDC 流量规则
        Summary: 推送 LDC 流量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_flow_routeclient_ex(request, headers, runtime)

    async def push_flow_routeclient_async(
        self,
        request: ldc_models.PushFlowRouteclientRequest,
    ) -> ldc_models.PushFlowRouteclientResponse:
        """
        Description: 推送 LDC 流量规则
        Summary: 推送 LDC 流量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_flow_routeclient_ex_async(request, headers, runtime)

    def push_flow_routeclient_ex(
        self,
        request: ldc_models.PushFlowRouteclientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.PushFlowRouteclientResponse:
        """
        Description: 推送 LDC 流量规则
        Summary: 推送 LDC 流量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.PushFlowRouteclientResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.routeclient.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_flow_routeclient_ex_async(
        self,
        request: ldc_models.PushFlowRouteclientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.PushFlowRouteclientResponse:
        """
        Description: 推送 LDC 流量规则
        Summary: 推送 LDC 流量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.PushFlowRouteclientResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.routeclient.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_federation_namespace(
        self,
        request: ldc_models.CreateFederationNamespaceRequest,
    ) -> ldc_models.CreateFederationNamespaceResponse:
        """
        Description: fedNamespace创建
        Summary: FedNamespace创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_federation_namespace_ex(request, headers, runtime)

    async def create_federation_namespace_async(
        self,
        request: ldc_models.CreateFederationNamespaceRequest,
    ) -> ldc_models.CreateFederationNamespaceResponse:
        """
        Description: fedNamespace创建
        Summary: FedNamespace创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_federation_namespace_ex_async(request, headers, runtime)

    def create_federation_namespace_ex(
        self,
        request: ldc_models.CreateFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationNamespaceResponse:
        """
        Description: fedNamespace创建
        Summary: FedNamespace创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.namespace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_federation_namespace_ex_async(
        self,
        request: ldc_models.CreateFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationNamespaceResponse:
        """
        Description: fedNamespace创建
        Summary: FedNamespace创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.namespace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_federation_namespace(
        self,
        request: ldc_models.UpdateFederationNamespaceRequest,
    ) -> ldc_models.UpdateFederationNamespaceResponse:
        """
        Description: FedNamespace更新API
        Summary: FedNamespace更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_federation_namespace_ex(request, headers, runtime)

    async def update_federation_namespace_async(
        self,
        request: ldc_models.UpdateFederationNamespaceRequest,
    ) -> ldc_models.UpdateFederationNamespaceResponse:
        """
        Description: FedNamespace更新API
        Summary: FedNamespace更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_federation_namespace_ex_async(request, headers, runtime)

    def update_federation_namespace_ex(
        self,
        request: ldc_models.UpdateFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFederationNamespaceResponse:
        """
        Description: FedNamespace更新API
        Summary: FedNamespace更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFederationNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.namespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_federation_namespace_ex_async(
        self,
        request: ldc_models.UpdateFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFederationNamespaceResponse:
        """
        Description: FedNamespace更新API
        Summary: FedNamespace更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFederationNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.namespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_federation_namespace(
        self,
        request: ldc_models.GetFederationNamespaceRequest,
    ) -> ldc_models.GetFederationNamespaceResponse:
        """
        Description: 获取单个FedNamespace
        Summary: FedNamespace get
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_federation_namespace_ex(request, headers, runtime)

    async def get_federation_namespace_async(
        self,
        request: ldc_models.GetFederationNamespaceRequest,
    ) -> ldc_models.GetFederationNamespaceResponse:
        """
        Description: 获取单个FedNamespace
        Summary: FedNamespace get
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_federation_namespace_ex_async(request, headers, runtime)

    def get_federation_namespace_ex(
        self,
        request: ldc_models.GetFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationNamespaceResponse:
        """
        Description: 获取单个FedNamespace
        Summary: FedNamespace get
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.namespace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_federation_namespace_ex_async(
        self,
        request: ldc_models.GetFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationNamespaceResponse:
        """
        Description: 获取单个FedNamespace
        Summary: FedNamespace get
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.namespace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_federation_namespace(
        self,
        request: ldc_models.DeleteFederationNamespaceRequest,
    ) -> ldc_models.DeleteFederationNamespaceResponse:
        """
        Description: FedNamespace 删除
        Summary: FedNamespace 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_federation_namespace_ex(request, headers, runtime)

    async def delete_federation_namespace_async(
        self,
        request: ldc_models.DeleteFederationNamespaceRequest,
    ) -> ldc_models.DeleteFederationNamespaceResponse:
        """
        Description: FedNamespace 删除
        Summary: FedNamespace 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_federation_namespace_ex_async(request, headers, runtime)

    def delete_federation_namespace_ex(
        self,
        request: ldc_models.DeleteFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationNamespaceResponse:
        """
        Description: FedNamespace 删除
        Summary: FedNamespace 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.namespace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_federation_namespace_ex_async(
        self,
        request: ldc_models.DeleteFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationNamespaceResponse:
        """
        Description: FedNamespace 删除
        Summary: FedNamespace 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.namespace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_federation_configmap(
        self,
        request: ldc_models.CreateFederationConfigmapRequest,
    ) -> ldc_models.CreateFederationConfigmapResponse:
        """
        Description: 创建FedConfigMap
        Summary: 创建FedConfigMap
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_federation_configmap_ex(request, headers, runtime)

    async def create_federation_configmap_async(
        self,
        request: ldc_models.CreateFederationConfigmapRequest,
    ) -> ldc_models.CreateFederationConfigmapResponse:
        """
        Description: 创建FedConfigMap
        Summary: 创建FedConfigMap
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_federation_configmap_ex_async(request, headers, runtime)

    def create_federation_configmap_ex(
        self,
        request: ldc_models.CreateFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationConfigmapResponse:
        """
        Description: 创建FedConfigMap
        Summary: 创建FedConfigMap
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationConfigmapResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.configmap.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_federation_configmap_ex_async(
        self,
        request: ldc_models.CreateFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationConfigmapResponse:
        """
        Description: 创建FedConfigMap
        Summary: 创建FedConfigMap
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationConfigmapResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.configmap.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_federation_configmap(
        self,
        request: ldc_models.UpdateFederationConfigmapRequest,
    ) -> ldc_models.UpdateFederationConfigmapResponse:
        """
        Description: FedConfigMap更新
        Summary: FedConfigMap更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_federation_configmap_ex(request, headers, runtime)

    async def update_federation_configmap_async(
        self,
        request: ldc_models.UpdateFederationConfigmapRequest,
    ) -> ldc_models.UpdateFederationConfigmapResponse:
        """
        Description: FedConfigMap更新
        Summary: FedConfigMap更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_federation_configmap_ex_async(request, headers, runtime)

    def update_federation_configmap_ex(
        self,
        request: ldc_models.UpdateFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFederationConfigmapResponse:
        """
        Description: FedConfigMap更新
        Summary: FedConfigMap更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFederationConfigmapResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.configmap.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_federation_configmap_ex_async(
        self,
        request: ldc_models.UpdateFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFederationConfigmapResponse:
        """
        Description: FedConfigMap更新
        Summary: FedConfigMap更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFederationConfigmapResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.configmap.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_federation_configmap(
        self,
        request: ldc_models.GetFederationConfigmapRequest,
    ) -> ldc_models.GetFederationConfigmapResponse:
        """
        Description: FedConfigMap Get
        Summary: FedConfigMap Get
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_federation_configmap_ex(request, headers, runtime)

    async def get_federation_configmap_async(
        self,
        request: ldc_models.GetFederationConfigmapRequest,
    ) -> ldc_models.GetFederationConfigmapResponse:
        """
        Description: FedConfigMap Get
        Summary: FedConfigMap Get
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_federation_configmap_ex_async(request, headers, runtime)

    def get_federation_configmap_ex(
        self,
        request: ldc_models.GetFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationConfigmapResponse:
        """
        Description: FedConfigMap Get
        Summary: FedConfigMap Get
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationConfigmapResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.configmap.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_federation_configmap_ex_async(
        self,
        request: ldc_models.GetFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationConfigmapResponse:
        """
        Description: FedConfigMap Get
        Summary: FedConfigMap Get
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationConfigmapResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.configmap.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_federation_configmap(
        self,
        request: ldc_models.DeleteFederationConfigmapRequest,
    ) -> ldc_models.DeleteFederationConfigmapResponse:
        """
        Description: FedConfigMap 删除
        Summary: FedConfigMap 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_federation_configmap_ex(request, headers, runtime)

    async def delete_federation_configmap_async(
        self,
        request: ldc_models.DeleteFederationConfigmapRequest,
    ) -> ldc_models.DeleteFederationConfigmapResponse:
        """
        Description: FedConfigMap 删除
        Summary: FedConfigMap 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_federation_configmap_ex_async(request, headers, runtime)

    def delete_federation_configmap_ex(
        self,
        request: ldc_models.DeleteFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationConfigmapResponse:
        """
        Description: FedConfigMap 删除
        Summary: FedConfigMap 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationConfigmapResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.configmap.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_federation_configmap_ex_async(
        self,
        request: ldc_models.DeleteFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationConfigmapResponse:
        """
        Description: FedConfigMap 删除
        Summary: FedConfigMap 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationConfigmapResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.configmap.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_federation_configmap(
        self,
        request: ldc_models.ListFederationConfigmapRequest,
    ) -> ldc_models.ListFederationConfigmapResponse:
        """
        Description: FedConfigMap List
        Summary: FedConfigMap List
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_federation_configmap_ex(request, headers, runtime)

    async def list_federation_configmap_async(
        self,
        request: ldc_models.ListFederationConfigmapRequest,
    ) -> ldc_models.ListFederationConfigmapResponse:
        """
        Description: FedConfigMap List
        Summary: FedConfigMap List
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_federation_configmap_ex_async(request, headers, runtime)

    def list_federation_configmap_ex(
        self,
        request: ldc_models.ListFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationConfigmapResponse:
        """
        Description: FedConfigMap List
        Summary: FedConfigMap List
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationConfigmapResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.configmap.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_federation_configmap_ex_async(
        self,
        request: ldc_models.ListFederationConfigmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationConfigmapResponse:
        """
        Description: FedConfigMap List
        Summary: FedConfigMap List
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationConfigmapResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.configmap.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_federation_namespace(
        self,
        request: ldc_models.ListFederationNamespaceRequest,
    ) -> ldc_models.ListFederationNamespaceResponse:
        """
        Description: List FeNamespace
        Summary: List FeNamespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_federation_namespace_ex(request, headers, runtime)

    async def list_federation_namespace_async(
        self,
        request: ldc_models.ListFederationNamespaceRequest,
    ) -> ldc_models.ListFederationNamespaceResponse:
        """
        Description: List FeNamespace
        Summary: List FeNamespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_federation_namespace_ex_async(request, headers, runtime)

    def list_federation_namespace_ex(
        self,
        request: ldc_models.ListFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationNamespaceResponse:
        """
        Description: List FeNamespace
        Summary: List FeNamespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.namespace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_federation_namespace_ex_async(
        self,
        request: ldc_models.ListFederationNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationNamespaceResponse:
        """
        Description: List FeNamespace
        Summary: List FeNamespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.namespace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_containerservice(
        self,
        request: ldc_models.QueryContainerserviceRequest,
    ) -> ldc_models.QueryContainerserviceResponse:
        """
        Description: 查询容器应用服务OpenAPI
        Summary: 查询容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_containerservice_ex(request, headers, runtime)

    async def query_containerservice_async(
        self,
        request: ldc_models.QueryContainerserviceRequest,
    ) -> ldc_models.QueryContainerserviceResponse:
        """
        Description: 查询容器应用服务OpenAPI
        Summary: 查询容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_containerservice_ex_async(request, headers, runtime)

    def query_containerservice_ex(
        self,
        request: ldc_models.QueryContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserviceResponse:
        """
        Description: 查询容器应用服务OpenAPI
        Summary: 查询容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_containerservice_ex_async(
        self,
        request: ldc_models.QueryContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserviceResponse:
        """
        Description: 查询容器应用服务OpenAPI
        Summary: 查询容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_multicluster_mastercluster(
        self,
        request: ldc_models.ListMulticlusterMasterclusterRequest,
    ) -> ldc_models.ListMulticlusterMasterclusterResponse:
        """
        Description: get master clusters for each zone
        Summary: getMasterClusters
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_multicluster_mastercluster_ex(request, headers, runtime)

    async def list_multicluster_mastercluster_async(
        self,
        request: ldc_models.ListMulticlusterMasterclusterRequest,
    ) -> ldc_models.ListMulticlusterMasterclusterResponse:
        """
        Description: get master clusters for each zone
        Summary: getMasterClusters
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_multicluster_mastercluster_ex_async(request, headers, runtime)

    def list_multicluster_mastercluster_ex(
        self,
        request: ldc_models.ListMulticlusterMasterclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterMasterclusterResponse:
        """
        Description: get master clusters for each zone
        Summary: getMasterClusters
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterMasterclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.multicluster.mastercluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_multicluster_mastercluster_ex_async(
        self,
        request: ldc_models.ListMulticlusterMasterclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterMasterclusterResponse:
        """
        Description: get master clusters for each zone
        Summary: getMasterClusters
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterMasterclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.multicluster.mastercluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_multicluster_cluster(
        self,
        request: ldc_models.InitMulticlusterClusterRequest,
    ) -> ldc_models.InitMulticlusterClusterResponse:
        """
        Description: import master clusters
        Summary: importMasterCluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_multicluster_cluster_ex(request, headers, runtime)

    async def init_multicluster_cluster_async(
        self,
        request: ldc_models.InitMulticlusterClusterRequest,
    ) -> ldc_models.InitMulticlusterClusterResponse:
        """
        Description: import master clusters
        Summary: importMasterCluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_multicluster_cluster_ex_async(request, headers, runtime)

    def init_multicluster_cluster_ex(
        self,
        request: ldc_models.InitMulticlusterClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.InitMulticlusterClusterResponse:
        """
        Description: import master clusters
        Summary: importMasterCluster
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.InitMulticlusterClusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.multicluster.cluster.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_multicluster_cluster_ex_async(
        self,
        request: ldc_models.InitMulticlusterClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.InitMulticlusterClusterResponse:
        """
        Description: import master clusters
        Summary: importMasterCluster
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.InitMulticlusterClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.multicluster.cluster.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_multicluster(
        self,
        request: ldc_models.ListMulticlusterRequest,
    ) -> ldc_models.ListMulticlusterResponse:
        """
        Description: list multi clusters
        Summary: list MultiCluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_multicluster_ex(request, headers, runtime)

    async def list_multicluster_async(
        self,
        request: ldc_models.ListMulticlusterRequest,
    ) -> ldc_models.ListMulticlusterResponse:
        """
        Description: list multi clusters
        Summary: list MultiCluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_multicluster_ex_async(request, headers, runtime)

    def list_multicluster_ex(
        self,
        request: ldc_models.ListMulticlusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterResponse:
        """
        Description: list multi clusters
        Summary: list MultiCluster
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.multicluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_multicluster_ex_async(
        self,
        request: ldc_models.ListMulticlusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterResponse:
        """
        Description: list multi clusters
        Summary: list MultiCluster
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.multicluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_containerservice(
        self,
        request: ldc_models.DeleteContainerserviceRequest,
    ) -> ldc_models.DeleteContainerserviceResponse:
        """
        Description: 删除容器应用服务
        Summary: 删除容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_containerservice_ex(request, headers, runtime)

    async def delete_containerservice_async(
        self,
        request: ldc_models.DeleteContainerserviceRequest,
    ) -> ldc_models.DeleteContainerserviceResponse:
        """
        Description: 删除容器应用服务
        Summary: 删除容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_containerservice_ex_async(request, headers, runtime)

    def delete_containerservice_ex(
        self,
        request: ldc_models.DeleteContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteContainerserviceResponse:
        """
        Description: 删除容器应用服务
        Summary: 删除容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteContainerserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_containerservice_ex_async(
        self,
        request: ldc_models.DeleteContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteContainerserviceResponse:
        """
        Description: 删除容器应用服务
        Summary: 删除容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteContainerserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_containerservice_deployment(
        self,
        request: ldc_models.CreateContainerserviceDeploymentRequest,
    ) -> ldc_models.CreateContainerserviceDeploymentResponse:
        """
        Description: 创建一个部署单
        Summary: 创建一个部署单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_containerservice_deployment_ex(request, headers, runtime)

    async def create_containerservice_deployment_async(
        self,
        request: ldc_models.CreateContainerserviceDeploymentRequest,
    ) -> ldc_models.CreateContainerserviceDeploymentResponse:
        """
        Description: 创建一个部署单
        Summary: 创建一个部署单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_containerservice_deployment_ex_async(request, headers, runtime)

    def create_containerservice_deployment_ex(
        self,
        request: ldc_models.CreateContainerserviceDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateContainerserviceDeploymentResponse:
        """
        Description: 创建一个部署单
        Summary: 创建一个部署单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateContainerserviceDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.deployment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_containerservice_deployment_ex_async(
        self,
        request: ldc_models.CreateContainerserviceDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateContainerserviceDeploymentResponse:
        """
        Description: 创建一个部署单
        Summary: 创建一个部署单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateContainerserviceDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.deployment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_federation_secret(
        self,
        request: ldc_models.CreateFederationSecretRequest,
    ) -> ldc_models.CreateFederationSecretResponse:
        """
        Description: 创建FedSecret
        Summary: 创建FedSecret
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_federation_secret_ex(request, headers, runtime)

    async def create_federation_secret_async(
        self,
        request: ldc_models.CreateFederationSecretRequest,
    ) -> ldc_models.CreateFederationSecretResponse:
        """
        Description: 创建FedSecret
        Summary: 创建FedSecret
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_federation_secret_ex_async(request, headers, runtime)

    def create_federation_secret_ex(
        self,
        request: ldc_models.CreateFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationSecretResponse:
        """
        Description: 创建FedSecret
        Summary: 创建FedSecret
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationSecretResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.secret.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_federation_secret_ex_async(
        self,
        request: ldc_models.CreateFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationSecretResponse:
        """
        Description: 创建FedSecret
        Summary: 创建FedSecret
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationSecretResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.secret.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_federation_secret(
        self,
        request: ldc_models.GetFederationSecretRequest,
    ) -> ldc_models.GetFederationSecretResponse:
        """
        Description: FedSecret Get
        Summary: FedSecret Get
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_federation_secret_ex(request, headers, runtime)

    async def get_federation_secret_async(
        self,
        request: ldc_models.GetFederationSecretRequest,
    ) -> ldc_models.GetFederationSecretResponse:
        """
        Description: FedSecret Get
        Summary: FedSecret Get
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_federation_secret_ex_async(request, headers, runtime)

    def get_federation_secret_ex(
        self,
        request: ldc_models.GetFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationSecretResponse:
        """
        Description: FedSecret Get
        Summary: FedSecret Get
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationSecretResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.secret.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_federation_secret_ex_async(
        self,
        request: ldc_models.GetFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationSecretResponse:
        """
        Description: FedSecret Get
        Summary: FedSecret Get
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationSecretResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.secret.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_federation_secret(
        self,
        request: ldc_models.DeleteFederationSecretRequest,
    ) -> ldc_models.DeleteFederationSecretResponse:
        """
        Description: FedSecret 删除
        Summary: FedSecret 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_federation_secret_ex(request, headers, runtime)

    async def delete_federation_secret_async(
        self,
        request: ldc_models.DeleteFederationSecretRequest,
    ) -> ldc_models.DeleteFederationSecretResponse:
        """
        Description: FedSecret 删除
        Summary: FedSecret 删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_federation_secret_ex_async(request, headers, runtime)

    def delete_federation_secret_ex(
        self,
        request: ldc_models.DeleteFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationSecretResponse:
        """
        Description: FedSecret 删除
        Summary: FedSecret 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationSecretResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.secret.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_federation_secret_ex_async(
        self,
        request: ldc_models.DeleteFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationSecretResponse:
        """
        Description: FedSecret 删除
        Summary: FedSecret 删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationSecretResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.secret.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_federation_secret(
        self,
        request: ldc_models.UpdateFederationSecretRequest,
    ) -> ldc_models.UpdateFederationSecretResponse:
        """
        Description: FedSecret 更新
        Summary: FedSecret 更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_federation_secret_ex(request, headers, runtime)

    async def update_federation_secret_async(
        self,
        request: ldc_models.UpdateFederationSecretRequest,
    ) -> ldc_models.UpdateFederationSecretResponse:
        """
        Description: FedSecret 更新
        Summary: FedSecret 更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_federation_secret_ex_async(request, headers, runtime)

    def update_federation_secret_ex(
        self,
        request: ldc_models.UpdateFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFederationSecretResponse:
        """
        Description: FedSecret 更新
        Summary: FedSecret 更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFederationSecretResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.secret.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_federation_secret_ex_async(
        self,
        request: ldc_models.UpdateFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFederationSecretResponse:
        """
        Description: FedSecret 更新
        Summary: FedSecret 更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFederationSecretResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.secret.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_federation_secret(
        self,
        request: ldc_models.ListFederationSecretRequest,
    ) -> ldc_models.ListFederationSecretResponse:
        """
        Description: FedSecret List
        Summary: FedSecret List
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_federation_secret_ex(request, headers, runtime)

    async def list_federation_secret_async(
        self,
        request: ldc_models.ListFederationSecretRequest,
    ) -> ldc_models.ListFederationSecretResponse:
        """
        Description: FedSecret List
        Summary: FedSecret List
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_federation_secret_ex_async(request, headers, runtime)

    def list_federation_secret_ex(
        self,
        request: ldc_models.ListFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationSecretResponse:
        """
        Description: FedSecret List
        Summary: FedSecret List
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationSecretResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.secret.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_federation_secret_ex_async(
        self,
        request: ldc_models.ListFederationSecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationSecretResponse:
        """
        Description: FedSecret List
        Summary: FedSecret List
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationSecretResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.secret.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_containerservice_revision(
        self,
        request: ldc_models.DescribeContainerserviceRevisionRequest,
    ) -> ldc_models.DescribeContainerserviceRevisionResponse:
        """
        Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
        Summary: 获取容器服务最新发布的版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_containerservice_revision_ex(request, headers, runtime)

    async def describe_containerservice_revision_async(
        self,
        request: ldc_models.DescribeContainerserviceRevisionRequest,
    ) -> ldc_models.DescribeContainerserviceRevisionResponse:
        """
        Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
        Summary: 获取容器服务最新发布的版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_containerservice_revision_ex_async(request, headers, runtime)

    def describe_containerservice_revision_ex(
        self,
        request: ldc_models.DescribeContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DescribeContainerserviceRevisionResponse:
        """
        Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
        Summary: 获取容器服务最新发布的版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DescribeContainerserviceRevisionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revision.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_containerservice_revision_ex_async(
        self,
        request: ldc_models.DescribeContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DescribeContainerserviceRevisionResponse:
        """
        Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
        Summary: 获取容器服务最新发布的版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DescribeContainerserviceRevisionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revision.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_containerservice_revision(
        self,
        request: ldc_models.GetContainerserviceRevisionRequest,
    ) -> ldc_models.GetContainerserviceRevisionResponse:
        """
        Description: 获取某一个版本的配置信息
        Summary: 获取某一个版本的配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_containerservice_revision_ex(request, headers, runtime)

    async def get_containerservice_revision_async(
        self,
        request: ldc_models.GetContainerserviceRevisionRequest,
    ) -> ldc_models.GetContainerserviceRevisionResponse:
        """
        Description: 获取某一个版本的配置信息
        Summary: 获取某一个版本的配置信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_containerservice_revision_ex_async(request, headers, runtime)

    def get_containerservice_revision_ex(
        self,
        request: ldc_models.GetContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetContainerserviceRevisionResponse:
        """
        Description: 获取某一个版本的配置信息
        Summary: 获取某一个版本的配置信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetContainerserviceRevisionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revision.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_containerservice_revision_ex_async(
        self,
        request: ldc_models.GetContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetContainerserviceRevisionResponse:
        """
        Description: 获取某一个版本的配置信息
        Summary: 获取某一个版本的配置信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetContainerserviceRevisionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revision.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_containerservice_revision(
        self,
        request: ldc_models.QueryContainerserviceRevisionRequest,
    ) -> ldc_models.QueryContainerserviceRevisionResponse:
        """
        Description: 查询容器服务版本列表
        Summary: 查询容器服务版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_containerservice_revision_ex(request, headers, runtime)

    async def query_containerservice_revision_async(
        self,
        request: ldc_models.QueryContainerserviceRevisionRequest,
    ) -> ldc_models.QueryContainerserviceRevisionResponse:
        """
        Description: 查询容器服务版本列表
        Summary: 查询容器服务版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_containerservice_revision_ex_async(request, headers, runtime)

    def query_containerservice_revision_ex(
        self,
        request: ldc_models.QueryContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserviceRevisionResponse:
        """
        Description: 查询容器服务版本列表
        Summary: 查询容器服务版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserviceRevisionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revision.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_containerservice_revision_ex_async(
        self,
        request: ldc_models.QueryContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserviceRevisionResponse:
        """
        Description: 查询容器服务版本列表
        Summary: 查询容器服务版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserviceRevisionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revision.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_revision(
        self,
        request: ldc_models.UpdateContainerserviceRevisionRequest,
    ) -> ldc_models.UpdateContainerserviceRevisionResponse:
        """
        Description: 为某一版本加上备注
        Summary: 为某一版本加上备注
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_revision_ex(request, headers, runtime)

    async def update_containerservice_revision_async(
        self,
        request: ldc_models.UpdateContainerserviceRevisionRequest,
    ) -> ldc_models.UpdateContainerserviceRevisionResponse:
        """
        Description: 为某一版本加上备注
        Summary: 为某一版本加上备注
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_revision_ex_async(request, headers, runtime)

    def update_containerservice_revision_ex(
        self,
        request: ldc_models.UpdateContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceRevisionResponse:
        """
        Description: 为某一版本加上备注
        Summary: 为某一版本加上备注
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceRevisionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revision.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_revision_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceRevisionResponse:
        """
        Description: 为某一版本加上备注
        Summary: 为某一版本加上备注
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceRevisionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revision.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_image(
        self,
        request: ldc_models.UpdateContainerserviceImageRequest,
    ) -> ldc_models.UpdateContainerserviceImageResponse:
        """
        Description: 快速更新镜像
        Summary: 快速更新镜像
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_image_ex(request, headers, runtime)

    async def update_containerservice_image_async(
        self,
        request: ldc_models.UpdateContainerserviceImageRequest,
    ) -> ldc_models.UpdateContainerserviceImageResponse:
        """
        Description: 快速更新镜像
        Summary: 快速更新镜像
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_image_ex_async(request, headers, runtime)

    def update_containerservice_image_ex(
        self,
        request: ldc_models.UpdateContainerserviceImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceImageResponse:
        """
        Description: 快速更新镜像
        Summary: 快速更新镜像
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceImageResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.image.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_image_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceImageResponse:
        """
        Description: 快速更新镜像
        Summary: 快速更新镜像
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceImageResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.image.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_replicas(
        self,
        request: ldc_models.UpdateContainerserviceReplicasRequest,
    ) -> ldc_models.UpdateContainerserviceReplicasResponse:
        """
        Description: 快速更新容器服务副本数
        Summary: 快速更新容器服务副本数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_replicas_ex(request, headers, runtime)

    async def update_containerservice_replicas_async(
        self,
        request: ldc_models.UpdateContainerserviceReplicasRequest,
    ) -> ldc_models.UpdateContainerserviceReplicasResponse:
        """
        Description: 快速更新容器服务副本数
        Summary: 快速更新容器服务副本数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_replicas_ex_async(request, headers, runtime)

    def update_containerservice_replicas_ex(
        self,
        request: ldc_models.UpdateContainerserviceReplicasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceReplicasResponse:
        """
        Description: 快速更新容器服务副本数
        Summary: 快速更新容器服务副本数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceReplicasResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.replicas.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_replicas_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceReplicasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceReplicasResponse:
        """
        Description: 快速更新容器服务副本数
        Summary: 快速更新容器服务副本数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceReplicasResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.replicas.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_containerservice(
        self,
        request: ldc_models.CreateContainerserviceRequest,
    ) -> ldc_models.CreateContainerserviceResponse:
        """
        Description: 创建容器应用服务。
        Summary: 创建容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_containerservice_ex(request, headers, runtime)

    async def create_containerservice_async(
        self,
        request: ldc_models.CreateContainerserviceRequest,
    ) -> ldc_models.CreateContainerserviceResponse:
        """
        Description: 创建容器应用服务。
        Summary: 创建容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_containerservice_ex_async(request, headers, runtime)

    def create_containerservice_ex(
        self,
        request: ldc_models.CreateContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateContainerserviceResponse:
        """
        Description: 创建容器应用服务。
        Summary: 创建容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateContainerserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_containerservice_ex_async(
        self,
        request: ldc_models.CreateContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateContainerserviceResponse:
        """
        Description: 创建容器应用服务。
        Summary: 创建容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateContainerserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_containerservice_revision(
        self,
        request: ldc_models.SaveContainerserviceRevisionRequest,
    ) -> ldc_models.SaveContainerserviceRevisionResponse:
        """
        Description: 保存容器服务草稿。
        Summary: 保存容器服务草稿
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_containerservice_revision_ex(request, headers, runtime)

    async def save_containerservice_revision_async(
        self,
        request: ldc_models.SaveContainerserviceRevisionRequest,
    ) -> ldc_models.SaveContainerserviceRevisionResponse:
        """
        Description: 保存容器服务草稿。
        Summary: 保存容器服务草稿
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_containerservice_revision_ex_async(request, headers, runtime)

    def save_containerservice_revision_ex(
        self,
        request: ldc_models.SaveContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SaveContainerserviceRevisionResponse:
        """
        Description: 保存容器服务草稿。
        Summary: 保存容器服务草稿
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SaveContainerserviceRevisionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revision.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_containerservice_revision_ex_async(
        self,
        request: ldc_models.SaveContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SaveContainerserviceRevisionResponse:
        """
        Description: 保存容器服务草稿。
        Summary: 保存容器服务草稿
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SaveContainerserviceRevisionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revision.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice(
        self,
        request: ldc_models.UpdateContainerserviceRequest,
    ) -> ldc_models.UpdateContainerserviceResponse:
        """
        Description: container service 更新
        Summary: container service 更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_ex(request, headers, runtime)

    async def update_containerservice_async(
        self,
        request: ldc_models.UpdateContainerserviceRequest,
    ) -> ldc_models.UpdateContainerserviceResponse:
        """
        Description: container service 更新
        Summary: container service 更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_ex_async(request, headers, runtime)

    def update_containerservice_ex(
        self,
        request: ldc_models.UpdateContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceResponse:
        """
        Description: container service 更新
        Summary: container service 更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceResponse:
        """
        Description: container service 更新
        Summary: container service 更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_containerservice(
        self,
        request: ldc_models.ExistContainerserviceRequest,
    ) -> ldc_models.ExistContainerserviceResponse:
        """
        Description: 检查对应容器服务是否存在。
        Summary: 检查对应容器服务是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_containerservice_ex(request, headers, runtime)

    async def exist_containerservice_async(
        self,
        request: ldc_models.ExistContainerserviceRequest,
    ) -> ldc_models.ExistContainerserviceResponse:
        """
        Description: 检查对应容器服务是否存在。
        Summary: 检查对应容器服务是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_containerservice_ex_async(request, headers, runtime)

    def exist_containerservice_ex(
        self,
        request: ldc_models.ExistContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExistContainerserviceResponse:
        """
        Description: 检查对应容器服务是否存在。
        Summary: 检查对应容器服务是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExistContainerserviceResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_containerservice_ex_async(
        self,
        request: ldc_models.ExistContainerserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExistContainerserviceResponse:
        """
        Description: 检查对应容器服务是否存在。
        Summary: 检查对应容器服务是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExistContainerserviceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cluster_basicinfo(
        self,
        request: ldc_models.GetClusterBasicinfoRequest,
    ) -> ldc_models.GetClusterBasicinfoResponse:
        """
        Description: get cluster basic info by name
        Summary: getClusterBasicInfo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cluster_basicinfo_ex(request, headers, runtime)

    async def get_cluster_basicinfo_async(
        self,
        request: ldc_models.GetClusterBasicinfoRequest,
    ) -> ldc_models.GetClusterBasicinfoResponse:
        """
        Description: get cluster basic info by name
        Summary: getClusterBasicInfo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cluster_basicinfo_ex_async(request, headers, runtime)

    def get_cluster_basicinfo_ex(
        self,
        request: ldc_models.GetClusterBasicinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterBasicinfoResponse:
        """
        Description: get cluster basic info by name
        Summary: getClusterBasicInfo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterBasicinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.basicinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cluster_basicinfo_ex_async(
        self,
        request: ldc_models.GetClusterBasicinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterBasicinfoResponse:
        """
        Description: get cluster basic info by name
        Summary: getClusterBasicInfo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterBasicinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.basicinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cluster_overviewinfo(
        self,
        request: ldc_models.GetClusterOverviewinfoRequest,
    ) -> ldc_models.GetClusterOverviewinfoResponse:
        """
        Description: get cluster overview info
        Summary: getClusterOverview
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cluster_overviewinfo_ex(request, headers, runtime)

    async def get_cluster_overviewinfo_async(
        self,
        request: ldc_models.GetClusterOverviewinfoRequest,
    ) -> ldc_models.GetClusterOverviewinfoResponse:
        """
        Description: get cluster overview info
        Summary: getClusterOverview
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cluster_overviewinfo_ex_async(request, headers, runtime)

    def get_cluster_overviewinfo_ex(
        self,
        request: ldc_models.GetClusterOverviewinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterOverviewinfoResponse:
        """
        Description: get cluster overview info
        Summary: getClusterOverview
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterOverviewinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.overviewinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cluster_overviewinfo_ex_async(
        self,
        request: ldc_models.GetClusterOverviewinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterOverviewinfoResponse:
        """
        Description: get cluster overview info
        Summary: getClusterOverview
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterOverviewinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.overviewinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cell(
        self,
        request: ldc_models.QueryCellRequest,
    ) -> ldc_models.QueryCellResponse:
        """
        Description: 查询部署单元。
        Summary: 查询部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cell_ex(request, headers, runtime)

    async def query_cell_async(
        self,
        request: ldc_models.QueryCellRequest,
    ) -> ldc_models.QueryCellResponse:
        """
        Description: 查询部署单元。
        Summary: 查询部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cell_ex_async(request, headers, runtime)

    def query_cell_ex(
        self,
        request: ldc_models.QueryCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryCellResponse:
        """
        Description: 查询部署单元。
        Summary: 查询部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cell_ex_async(
        self,
        request: ldc_models.QueryCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryCellResponse:
        """
        Description: 查询部署单元。
        Summary: 查询部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cluster_podoverview(
        self,
        request: ldc_models.GetClusterPodoverviewRequest,
    ) -> ldc_models.GetClusterPodoverviewResponse:
        """
        Description: get pod overview infos of specific cluster
        Summary: getPodOverviewInfo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cluster_podoverview_ex(request, headers, runtime)

    async def get_cluster_podoverview_async(
        self,
        request: ldc_models.GetClusterPodoverviewRequest,
    ) -> ldc_models.GetClusterPodoverviewResponse:
        """
        Description: get pod overview infos of specific cluster
        Summary: getPodOverviewInfo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cluster_podoverview_ex_async(request, headers, runtime)

    def get_cluster_podoverview_ex(
        self,
        request: ldc_models.GetClusterPodoverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterPodoverviewResponse:
        """
        Description: get pod overview infos of specific cluster
        Summary: getPodOverviewInfo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterPodoverviewResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.podoverview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cluster_podoverview_ex_async(
        self,
        request: ldc_models.GetClusterPodoverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterPodoverviewResponse:
        """
        Description: get pod overview infos of specific cluster
        Summary: getPodOverviewInfo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterPodoverviewResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.podoverview.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_nodeinfo(
        self,
        request: ldc_models.ListClusterNodeinfoRequest,
    ) -> ldc_models.ListClusterNodeinfoResponse:
        """
        Description: list all nodes info of specific cluster
        Summary: listNodeInfo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_nodeinfo_ex(request, headers, runtime)

    async def list_cluster_nodeinfo_async(
        self,
        request: ldc_models.ListClusterNodeinfoRequest,
    ) -> ldc_models.ListClusterNodeinfoResponse:
        """
        Description: list all nodes info of specific cluster
        Summary: listNodeInfo
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_nodeinfo_ex_async(request, headers, runtime)

    def list_cluster_nodeinfo_ex(
        self,
        request: ldc_models.ListClusterNodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNodeinfoResponse:
        """
        Description: list all nodes info of specific cluster
        Summary: listNodeInfo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNodeinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.nodeinfo.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_nodeinfo_ex_async(
        self,
        request: ldc_models.ListClusterNodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNodeinfoResponse:
        """
        Description: list all nodes info of specific cluster
        Summary: listNodeInfo
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNodeinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.nodeinfo.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cluster_namespace(
        self,
        request: ldc_models.CreateClusterNamespaceRequest,
    ) -> ldc_models.CreateClusterNamespaceResponse:
        """
        Description: create namespace of a specific cluster
        Summary: createNamespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cluster_namespace_ex(request, headers, runtime)

    async def create_cluster_namespace_async(
        self,
        request: ldc_models.CreateClusterNamespaceRequest,
    ) -> ldc_models.CreateClusterNamespaceResponse:
        """
        Description: create namespace of a specific cluster
        Summary: createNamespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cluster_namespace_ex_async(request, headers, runtime)

    def create_cluster_namespace_ex(
        self,
        request: ldc_models.CreateClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateClusterNamespaceResponse:
        """
        Description: create namespace of a specific cluster
        Summary: createNamespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateClusterNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.namespace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cluster_namespace_ex_async(
        self,
        request: ldc_models.CreateClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateClusterNamespaceResponse:
        """
        Description: create namespace of a specific cluster
        Summary: createNamespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateClusterNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.namespace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_namespace(
        self,
        request: ldc_models.ListClusterNamespaceRequest,
    ) -> ldc_models.ListClusterNamespaceResponse:
        """
        Description: list namespace
        Summary: list namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_namespace_ex(request, headers, runtime)

    async def list_cluster_namespace_async(
        self,
        request: ldc_models.ListClusterNamespaceRequest,
    ) -> ldc_models.ListClusterNamespaceResponse:
        """
        Description: list namespace
        Summary: list namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_namespace_ex_async(request, headers, runtime)

    def list_cluster_namespace_ex(
        self,
        request: ldc_models.ListClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNamespaceResponse:
        """
        Description: list namespace
        Summary: list namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.namespace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_namespace_ex_async(
        self,
        request: ldc_models.ListClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNamespaceResponse:
        """
        Description: list namespace
        Summary: list namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.namespace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_namespace(
        self,
        request: ldc_models.QueryClusterNamespaceRequest,
    ) -> ldc_models.QueryClusterNamespaceResponse:
        """
        Description: query namespace detail info
        Summary: query namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_namespace_ex(request, headers, runtime)

    async def query_cluster_namespace_async(
        self,
        request: ldc_models.QueryClusterNamespaceRequest,
    ) -> ldc_models.QueryClusterNamespaceResponse:
        """
        Description: query namespace detail info
        Summary: query namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_namespace_ex_async(request, headers, runtime)

    def query_cluster_namespace_ex(
        self,
        request: ldc_models.QueryClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryClusterNamespaceResponse:
        """
        Description: query namespace detail info
        Summary: query namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryClusterNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.namespace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_namespace_ex_async(
        self,
        request: ldc_models.QueryClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryClusterNamespaceResponse:
        """
        Description: query namespace detail info
        Summary: query namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryClusterNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.namespace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_cluster_namespace(
        self,
        request: ldc_models.DeleteClusterNamespaceRequest,
    ) -> ldc_models.DeleteClusterNamespaceResponse:
        """
        Description: delete namespace of specific cluster
        Summary: delete namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_cluster_namespace_ex(request, headers, runtime)

    async def delete_cluster_namespace_async(
        self,
        request: ldc_models.DeleteClusterNamespaceRequest,
    ) -> ldc_models.DeleteClusterNamespaceResponse:
        """
        Description: delete namespace of specific cluster
        Summary: delete namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_cluster_namespace_ex_async(request, headers, runtime)

    def delete_cluster_namespace_ex(
        self,
        request: ldc_models.DeleteClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteClusterNamespaceResponse:
        """
        Description: delete namespace of specific cluster
        Summary: delete namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteClusterNamespaceResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.namespace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_cluster_namespace_ex_async(
        self,
        request: ldc_models.DeleteClusterNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteClusterNamespaceResponse:
        """
        Description: delete namespace of specific cluster
        Summary: delete namespace
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteClusterNamespaceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.namespace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cluster_nodeinfo(
        self,
        request: ldc_models.GetClusterNodeinfoRequest,
    ) -> ldc_models.GetClusterNodeinfoResponse:
        """
        Description: get node detail info by name
        Summary: get node detail info
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cluster_nodeinfo_ex(request, headers, runtime)

    async def get_cluster_nodeinfo_async(
        self,
        request: ldc_models.GetClusterNodeinfoRequest,
    ) -> ldc_models.GetClusterNodeinfoResponse:
        """
        Description: get node detail info by name
        Summary: get node detail info
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cluster_nodeinfo_ex_async(request, headers, runtime)

    def get_cluster_nodeinfo_ex(
        self,
        request: ldc_models.GetClusterNodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterNodeinfoResponse:
        """
        Description: get node detail info by name
        Summary: get node detail info
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterNodeinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.nodeinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cluster_nodeinfo_ex_async(
        self,
        request: ldc_models.GetClusterNodeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetClusterNodeinfoResponse:
        """
        Description: get node detail info by name
        Summary: get node detail info
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetClusterNodeinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.nodeinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_federation_imagepullsecret(
        self,
        request: ldc_models.CreateFederationImagepullsecretRequest,
    ) -> ldc_models.CreateFederationImagepullsecretResponse:
        """
        Description: ImagePullSecret创建
        Summary: ImagePullSecret创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_federation_imagepullsecret_ex(request, headers, runtime)

    async def create_federation_imagepullsecret_async(
        self,
        request: ldc_models.CreateFederationImagepullsecretRequest,
    ) -> ldc_models.CreateFederationImagepullsecretResponse:
        """
        Description: ImagePullSecret创建
        Summary: ImagePullSecret创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_federation_imagepullsecret_ex_async(request, headers, runtime)

    def create_federation_imagepullsecret_ex(
        self,
        request: ldc_models.CreateFederationImagepullsecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationImagepullsecretResponse:
        """
        Description: ImagePullSecret创建
        Summary: ImagePullSecret创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationImagepullsecretResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.imagepullsecret.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_federation_imagepullsecret_ex_async(
        self,
        request: ldc_models.CreateFederationImagepullsecretRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationImagepullsecretResponse:
        """
        Description: ImagePullSecret创建
        Summary: ImagePullSecret创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationImagepullsecretResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.imagepullsecret.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_nodepod(
        self,
        request: ldc_models.ListClusterNodepodRequest,
    ) -> ldc_models.ListClusterNodepodResponse:
        """
        Description: list all pods of specific node
        Summary: listtPodsOfNode
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_nodepod_ex(request, headers, runtime)

    async def list_cluster_nodepod_async(
        self,
        request: ldc_models.ListClusterNodepodRequest,
    ) -> ldc_models.ListClusterNodepodResponse:
        """
        Description: list all pods of specific node
        Summary: listtPodsOfNode
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_nodepod_ex_async(request, headers, runtime)

    def list_cluster_nodepod_ex(
        self,
        request: ldc_models.ListClusterNodepodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNodepodResponse:
        """
        Description: list all pods of specific node
        Summary: listtPodsOfNode
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNodepodResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.nodepod.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_nodepod_ex_async(
        self,
        request: ldc_models.ListClusterNodepodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNodepodResponse:
        """
        Description: list all pods of specific node
        Summary: listtPodsOfNode
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNodepodResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.nodepod.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_nodeevent(
        self,
        request: ldc_models.ListClusterNodeeventRequest,
    ) -> ldc_models.ListClusterNodeeventResponse:
        """
        Description: list all events of specific node
        Summary: listEventOfNode
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_nodeevent_ex(request, headers, runtime)

    async def list_cluster_nodeevent_async(
        self,
        request: ldc_models.ListClusterNodeeventRequest,
    ) -> ldc_models.ListClusterNodeeventResponse:
        """
        Description: list all events of specific node
        Summary: listEventOfNode
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_nodeevent_ex_async(request, headers, runtime)

    def list_cluster_nodeevent_ex(
        self,
        request: ldc_models.ListClusterNodeeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNodeeventResponse:
        """
        Description: list all events of specific node
        Summary: listEventOfNode
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNodeeventResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.nodeevent.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_nodeevent_ex_async(
        self,
        request: ldc_models.ListClusterNodeeventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterNodeeventResponse:
        """
        Description: list all events of specific node
        Summary: listEventOfNode
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterNodeeventResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.nodeevent.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_opsplan(
        self,
        request: ldc_models.QueryOpsplanRequest,
    ) -> ldc_models.QueryOpsplanResponse:
        """
        Description: 分页查询发布单列表
        Summary: 分页查询发布单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_opsplan_ex(request, headers, runtime)

    async def query_opsplan_async(
        self,
        request: ldc_models.QueryOpsplanRequest,
    ) -> ldc_models.QueryOpsplanResponse:
        """
        Description: 分页查询发布单列表
        Summary: 分页查询发布单列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_opsplan_ex_async(request, headers, runtime)

    def query_opsplan_ex(
        self,
        request: ldc_models.QueryOpsplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanResponse:
        """
        Description: 分页查询发布单列表
        Summary: 分页查询发布单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_opsplan_ex_async(
        self,
        request: ldc_models.QueryOpsplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanResponse:
        """
        Description: 分页查询发布单列表
        Summary: 分页查询发布单列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_opsplan_statesummary(
        self,
        request: ldc_models.QueryOpsplanStatesummaryRequest,
    ) -> ldc_models.QueryOpsplanStatesummaryResponse:
        """
        Description: 分页查询发布单状态概要列表
        Summary: 分页查询发布单状态概要列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_opsplan_statesummary_ex(request, headers, runtime)

    async def query_opsplan_statesummary_async(
        self,
        request: ldc_models.QueryOpsplanStatesummaryRequest,
    ) -> ldc_models.QueryOpsplanStatesummaryResponse:
        """
        Description: 分页查询发布单状态概要列表
        Summary: 分页查询发布单状态概要列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_opsplan_statesummary_ex_async(request, headers, runtime)

    def query_opsplan_statesummary_ex(
        self,
        request: ldc_models.QueryOpsplanStatesummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanStatesummaryResponse:
        """
        Description: 分页查询发布单状态概要列表
        Summary: 分页查询发布单状态概要列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanStatesummaryResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.statesummary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_opsplan_statesummary_ex_async(
        self,
        request: ldc_models.QueryOpsplanStatesummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanStatesummaryResponse:
        """
        Description: 分页查询发布单状态概要列表
        Summary: 分页查询发布单状态概要列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanStatesummaryResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.statesummary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_opsplan_detail(
        self,
        request: ldc_models.QueryOpsplanDetailRequest,
    ) -> ldc_models.QueryOpsplanDetailResponse:
        """
        Description: 发布/运维单详情查询
        Summary: 发布/运维单详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_opsplan_detail_ex(request, headers, runtime)

    async def query_opsplan_detail_async(
        self,
        request: ldc_models.QueryOpsplanDetailRequest,
    ) -> ldc_models.QueryOpsplanDetailResponse:
        """
        Description: 发布/运维单详情查询
        Summary: 发布/运维单详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_opsplan_detail_ex_async(request, headers, runtime)

    def query_opsplan_detail_ex(
        self,
        request: ldc_models.QueryOpsplanDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanDetailResponse:
        """
        Description: 发布/运维单详情查询
        Summary: 发布/运维单详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanDetailResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_opsplan_detail_ex_async(
        self,
        request: ldc_models.QueryOpsplanDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanDetailResponse:
        """
        Description: 发布/运维单详情查询
        Summary: 发布/运维单详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanDetailResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_techstack(
        self,
        request: ldc_models.QueryBuildpackTechstackRequest,
    ) -> ldc_models.QueryBuildpackTechstackResponse:
        """
        Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
        Summary: 查询公共的以及租户内自定义技术栈分类
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_techstack_ex(request, headers, runtime)

    async def query_buildpack_techstack_async(
        self,
        request: ldc_models.QueryBuildpackTechstackRequest,
    ) -> ldc_models.QueryBuildpackTechstackResponse:
        """
        Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
        Summary: 查询公共的以及租户内自定义技术栈分类
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_techstack_ex_async(request, headers, runtime)

    def query_buildpack_techstack_ex(
        self,
        request: ldc_models.QueryBuildpackTechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryBuildpackTechstackResponse:
        """
        Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
        Summary: 查询公共的以及租户内自定义技术栈分类
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryBuildpackTechstackResponse(),
            self.do_request('1.0', 'antcloud.ldc.buildpack.techstack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_techstack_ex_async(
        self,
        request: ldc_models.QueryBuildpackTechstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryBuildpackTechstackResponse:
        """
        Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
        Summary: 查询公共的以及租户内自定义技术栈分类
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryBuildpackTechstackResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.buildpack.techstack.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_buildpack_nativetechstackversion(
        self,
        request: ldc_models.QueryBuildpackNativetechstackversionRequest,
    ) -> ldc_models.QueryBuildpackNativetechstackversionResponse:
        """
        Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
        Summary: 获取云原生技术栈小版本列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_buildpack_nativetechstackversion_ex(request, headers, runtime)

    async def query_buildpack_nativetechstackversion_async(
        self,
        request: ldc_models.QueryBuildpackNativetechstackversionRequest,
    ) -> ldc_models.QueryBuildpackNativetechstackversionResponse:
        """
        Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
        Summary: 获取云原生技术栈小版本列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_buildpack_nativetechstackversion_ex_async(request, headers, runtime)

    def query_buildpack_nativetechstackversion_ex(
        self,
        request: ldc_models.QueryBuildpackNativetechstackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryBuildpackNativetechstackversionResponse:
        """
        Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
        Summary: 获取云原生技术栈小版本列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryBuildpackNativetechstackversionResponse(),
            self.do_request('1.0', 'antcloud.ldc.buildpack.nativetechstackversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_buildpack_nativetechstackversion_ex_async(
        self,
        request: ldc_models.QueryBuildpackNativetechstackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryBuildpackNativetechstackversionResponse:
        """
        Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
        Summary: 获取云原生技术栈小版本列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryBuildpackNativetechstackversionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.buildpack.nativetechstackversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_nativebpversion(
        self,
        request: ldc_models.UpdateContainerserviceNativebpversionRequest,
    ) -> ldc_models.UpdateContainerserviceNativebpversionResponse:
        """
        Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
        Summary: 更新容器应用服务对应的云原生技术栈版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_nativebpversion_ex(request, headers, runtime)

    async def update_containerservice_nativebpversion_async(
        self,
        request: ldc_models.UpdateContainerserviceNativebpversionRequest,
    ) -> ldc_models.UpdateContainerserviceNativebpversionResponse:
        """
        Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
        Summary: 更新容器应用服务对应的云原生技术栈版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_nativebpversion_ex_async(request, headers, runtime)

    def update_containerservice_nativebpversion_ex(
        self,
        request: ldc_models.UpdateContainerserviceNativebpversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceNativebpversionResponse:
        """
        Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
        Summary: 更新容器应用服务对应的云原生技术栈版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceNativebpversionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.nativebpversion.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_nativebpversion_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceNativebpversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceNativebpversionResponse:
        """
        Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
        Summary: 更新容器应用服务对应的云原生技术栈版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceNativebpversionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.nativebpversion.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_containerservice_dockerfile(
        self,
        request: ldc_models.LoadContainerserviceDockerfileRequest,
    ) -> ldc_models.LoadContainerserviceDockerfileResponse:
        """
        Description: 生成Dockerfile命令列表并获取
        Summary: 获取容器服务对应的Dockerfile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_containerservice_dockerfile_ex(request, headers, runtime)

    async def load_containerservice_dockerfile_async(
        self,
        request: ldc_models.LoadContainerserviceDockerfileRequest,
    ) -> ldc_models.LoadContainerserviceDockerfileResponse:
        """
        Description: 生成Dockerfile命令列表并获取
        Summary: 获取容器服务对应的Dockerfile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_containerservice_dockerfile_ex_async(request, headers, runtime)

    def load_containerservice_dockerfile_ex(
        self,
        request: ldc_models.LoadContainerserviceDockerfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.LoadContainerserviceDockerfileResponse:
        """
        Description: 生成Dockerfile命令列表并获取
        Summary: 获取容器服务对应的Dockerfile
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.LoadContainerserviceDockerfileResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.dockerfile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_containerservice_dockerfile_ex_async(
        self,
        request: ldc_models.LoadContainerserviceDockerfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.LoadContainerserviceDockerfileResponse:
        """
        Description: 生成Dockerfile命令列表并获取
        Summary: 获取容器服务对应的Dockerfile
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.LoadContainerserviceDockerfileResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.dockerfile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_buildpack_nativetechstackversion(
        self,
        request: ldc_models.CreateBuildpackNativetechstackversionRequest,
    ) -> ldc_models.CreateBuildpackNativetechstackversionResponse:
        """
        Description: 创建云原生技术栈版本
        Summary: 创建云原生技术栈版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_buildpack_nativetechstackversion_ex(request, headers, runtime)

    async def create_buildpack_nativetechstackversion_async(
        self,
        request: ldc_models.CreateBuildpackNativetechstackversionRequest,
    ) -> ldc_models.CreateBuildpackNativetechstackversionResponse:
        """
        Description: 创建云原生技术栈版本
        Summary: 创建云原生技术栈版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_buildpack_nativetechstackversion_ex_async(request, headers, runtime)

    def create_buildpack_nativetechstackversion_ex(
        self,
        request: ldc_models.CreateBuildpackNativetechstackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateBuildpackNativetechstackversionResponse:
        """
        Description: 创建云原生技术栈版本
        Summary: 创建云原生技术栈版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateBuildpackNativetechstackversionResponse(),
            self.do_request('1.0', 'antcloud.ldc.buildpack.nativetechstackversion.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_buildpack_nativetechstackversion_ex_async(
        self,
        request: ldc_models.CreateBuildpackNativetechstackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateBuildpackNativetechstackversionResponse:
        """
        Description: 创建云原生技术栈版本
        Summary: 创建云原生技术栈版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateBuildpackNativetechstackversionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.buildpack.nativetechstackversion.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_multicluster_zone(
        self,
        request: ldc_models.ListMulticlusterZoneRequest,
    ) -> ldc_models.ListMulticlusterZoneResponse:
        """
        Description: get zonelist of each workspace in a workspace group
        Summary: getZoneListOfWSG
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_multicluster_zone_ex(request, headers, runtime)

    async def list_multicluster_zone_async(
        self,
        request: ldc_models.ListMulticlusterZoneRequest,
    ) -> ldc_models.ListMulticlusterZoneResponse:
        """
        Description: get zonelist of each workspace in a workspace group
        Summary: getZoneListOfWSG
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_multicluster_zone_ex_async(request, headers, runtime)

    def list_multicluster_zone_ex(
        self,
        request: ldc_models.ListMulticlusterZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterZoneResponse:
        """
        Description: get zonelist of each workspace in a workspace group
        Summary: getZoneListOfWSG
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterZoneResponse(),
            self.do_request('1.0', 'antcloud.ldc.multicluster.zone.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_multicluster_zone_ex_async(
        self,
        request: ldc_models.ListMulticlusterZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterZoneResponse:
        """
        Description: get zonelist of each workspace in a workspace group
        Summary: getZoneListOfWSG
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterZoneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.multicluster.zone.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_opsplan_appopstask(
        self,
        request: ldc_models.ExecOpsplanAppopstaskRequest,
    ) -> ldc_models.ExecOpsplanAppopstaskResponse:
        """
        Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
        Summary: 发布/运维单发布任务操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_opsplan_appopstask_ex(request, headers, runtime)

    async def exec_opsplan_appopstask_async(
        self,
        request: ldc_models.ExecOpsplanAppopstaskRequest,
    ) -> ldc_models.ExecOpsplanAppopstaskResponse:
        """
        Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
        Summary: 发布/运维单发布任务操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_opsplan_appopstask_ex_async(request, headers, runtime)

    def exec_opsplan_appopstask_ex(
        self,
        request: ldc_models.ExecOpsplanAppopstaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecOpsplanAppopstaskResponse:
        """
        Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
        Summary: 发布/运维单发布任务操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecOpsplanAppopstaskResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.appopstask.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_opsplan_appopstask_ex_async(
        self,
        request: ldc_models.ExecOpsplanAppopstaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecOpsplanAppopstaskResponse:
        """
        Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
        Summary: 发布/运维单发布任务操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecOpsplanAppopstaskResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.appopstask.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_opsplan_progress(
        self,
        request: ldc_models.QueryOpsplanProgressRequest,
    ) -> ldc_models.QueryOpsplanProgressResponse:
        """
        Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
        Summary: 发布单进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_opsplan_progress_ex(request, headers, runtime)

    async def query_opsplan_progress_async(
        self,
        request: ldc_models.QueryOpsplanProgressRequest,
    ) -> ldc_models.QueryOpsplanProgressResponse:
        """
        Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
        Summary: 发布单进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_opsplan_progress_ex_async(request, headers, runtime)

    def query_opsplan_progress_ex(
        self,
        request: ldc_models.QueryOpsplanProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanProgressResponse:
        """
        Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
        Summary: 发布单进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanProgressResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_opsplan_progress_ex_async(
        self,
        request: ldc_models.QueryOpsplanProgressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanProgressResponse:
        """
        Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
        Summary: 发布单进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanProgressResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.progress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_opsplan_appprogress(
        self,
        request: ldc_models.QueryOpsplanAppprogressRequest,
    ) -> ldc_models.QueryOpsplanAppprogressResponse:
        """
        Description: 发布(运维)单应进度查询
        Summary: 发布(运维)单应进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_opsplan_appprogress_ex(request, headers, runtime)

    async def query_opsplan_appprogress_async(
        self,
        request: ldc_models.QueryOpsplanAppprogressRequest,
    ) -> ldc_models.QueryOpsplanAppprogressResponse:
        """
        Description: 发布(运维)单应进度查询
        Summary: 发布(运维)单应进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_opsplan_appprogress_ex_async(request, headers, runtime)

    def query_opsplan_appprogress_ex(
        self,
        request: ldc_models.QueryOpsplanAppprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanAppprogressResponse:
        """
        Description: 发布(运维)单应进度查询
        Summary: 发布(运维)单应进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanAppprogressResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.appprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_opsplan_appprogress_ex_async(
        self,
        request: ldc_models.QueryOpsplanAppprogressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOpsplanAppprogressResponse:
        """
        Description: 发布(运维)单应进度查询
        Summary: 发布(运维)单应进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOpsplanAppprogressResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.appprogress.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_containerservice_pod(
        self,
        request: ldc_models.ListContainerservicePodRequest,
    ) -> ldc_models.ListContainerservicePodResponse:
        """
        Description: 容器服务pod列表
        Summary: 容器服务pod列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_containerservice_pod_ex(request, headers, runtime)

    async def list_containerservice_pod_async(
        self,
        request: ldc_models.ListContainerservicePodRequest,
    ) -> ldc_models.ListContainerservicePodResponse:
        """
        Description: 容器服务pod列表
        Summary: 容器服务pod列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_containerservice_pod_ex_async(request, headers, runtime)

    def list_containerservice_pod_ex(
        self,
        request: ldc_models.ListContainerservicePodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerservicePodResponse:
        """
        Description: 容器服务pod列表
        Summary: 容器服务pod列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerservicePodResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.pod.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_containerservice_pod_ex_async(
        self,
        request: ldc_models.ListContainerservicePodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerservicePodResponse:
        """
        Description: 容器服务pod列表
        Summary: 容器服务pod列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerservicePodResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.pod.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_containerservice_kubeevents(
        self,
        request: ldc_models.ListContainerserviceKubeeventsRequest,
    ) -> ldc_models.ListContainerserviceKubeeventsResponse:
        """
        Description: To list kubeevents
        Summary: To list kubeevents
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_containerservice_kubeevents_ex(request, headers, runtime)

    async def list_containerservice_kubeevents_async(
        self,
        request: ldc_models.ListContainerserviceKubeeventsRequest,
    ) -> ldc_models.ListContainerserviceKubeeventsResponse:
        """
        Description: To list kubeevents
        Summary: To list kubeevents
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_containerservice_kubeevents_ex_async(request, headers, runtime)

    def list_containerservice_kubeevents_ex(
        self,
        request: ldc_models.ListContainerserviceKubeeventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerserviceKubeeventsResponse:
        """
        Description: To list kubeevents
        Summary: To list kubeevents
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerserviceKubeeventsResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.kubeevents.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_containerservice_kubeevents_ex_async(
        self,
        request: ldc_models.ListContainerserviceKubeeventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerserviceKubeeventsResponse:
        """
        Description: To list kubeevents
        Summary: To list kubeevents
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerserviceKubeeventsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.kubeevents.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_pod_events(
        self,
        request: ldc_models.ListPodEventsRequest,
    ) -> ldc_models.ListPodEventsResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod事件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_pod_events_ex(request, headers, runtime)

    async def list_pod_events_async(
        self,
        request: ldc_models.ListPodEventsRequest,
    ) -> ldc_models.ListPodEventsResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod事件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_pod_events_ex_async(request, headers, runtime)

    def list_pod_events_ex(
        self,
        request: ldc_models.ListPodEventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListPodEventsResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod事件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListPodEventsResponse(),
            self.do_request('1.0', 'antcloud.ldc.pod.events.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_pod_events_ex_async(
        self,
        request: ldc_models.ListPodEventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListPodEventsResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod事件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListPodEventsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.pod.events.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_pod_containers(
        self,
        request: ldc_models.ListPodContainersRequest,
    ) -> ldc_models.ListPodContainersResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod容器列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_pod_containers_ex(request, headers, runtime)

    async def list_pod_containers_async(
        self,
        request: ldc_models.ListPodContainersRequest,
    ) -> ldc_models.ListPodContainersResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod容器列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_pod_containers_ex_async(request, headers, runtime)

    def list_pod_containers_ex(
        self,
        request: ldc_models.ListPodContainersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListPodContainersResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod容器列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListPodContainersResponse(),
            self.do_request('1.0', 'antcloud.ldc.pod.containers.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_pod_containers_ex_async(
        self,
        request: ldc_models.ListPodContainersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListPodContainersResponse:
        """
        Description: 查询Pod事件列表
        Summary: 查询Pod容器列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListPodContainersResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.pod.containers.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_containerservice_cell(
        self,
        request: ldc_models.QueryContainerserviceCellRequest,
    ) -> ldc_models.QueryContainerserviceCellResponse:
        """
        Description: query replica cell
        Summary: query replica cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_containerservice_cell_ex(request, headers, runtime)

    async def query_containerservice_cell_async(
        self,
        request: ldc_models.QueryContainerserviceCellRequest,
    ) -> ldc_models.QueryContainerserviceCellResponse:
        """
        Description: query replica cell
        Summary: query replica cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_containerservice_cell_ex_async(request, headers, runtime)

    def query_containerservice_cell_ex(
        self,
        request: ldc_models.QueryContainerserviceCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserviceCellResponse:
        """
        Description: query replica cell
        Summary: query replica cell
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserviceCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_containerservice_cell_ex_async(
        self,
        request: ldc_models.QueryContainerserviceCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserviceCellResponse:
        """
        Description: query replica cell
        Summary: query replica cell
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserviceCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cellgroup(
        self,
        request: ldc_models.CreateCellgroupRequest,
    ) -> ldc_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cellgroup_ex(request, headers, runtime)

    async def create_cellgroup_async(
        self,
        request: ldc_models.CreateCellgroupRequest,
    ) -> ldc_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cellgroup_ex_async(request, headers, runtime)

    def create_cellgroup_ex(
        self,
        request: ldc_models.CreateCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateCellgroupResponse(),
            self.do_request('1.0', 'antcloud.ldc.cellgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cellgroup_ex_async(
        self,
        request: ldc_models.CreateCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateCellgroupResponse:
        """
        Description: 创建逻辑单元
        Summary: 创建逻辑单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateCellgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cellgroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cellgroup(
        self,
        request: ldc_models.ListCellgroupRequest,
    ) -> ldc_models.ListCellgroupResponse:
        """
        Description: 获取cellgroup列表
        Summary: 获取cellgroup列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cellgroup_ex(request, headers, runtime)

    async def list_cellgroup_async(
        self,
        request: ldc_models.ListCellgroupRequest,
    ) -> ldc_models.ListCellgroupResponse:
        """
        Description: 获取cellgroup列表
        Summary: 获取cellgroup列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cellgroup_ex_async(request, headers, runtime)

    def list_cellgroup_ex(
        self,
        request: ldc_models.ListCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCellgroupResponse:
        """
        Description: 获取cellgroup列表
        Summary: 获取cellgroup列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCellgroupResponse(),
            self.do_request('1.0', 'antcloud.ldc.cellgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cellgroup_ex_async(
        self,
        request: ldc_models.ListCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCellgroupResponse:
        """
        Description: 获取cellgroup列表
        Summary: 获取cellgroup列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCellgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cellgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cellgroup_disasterinfo(
        self,
        request: ldc_models.UpdateCellgroupDisasterinfoRequest,
    ) -> ldc_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cellgroup_disasterinfo_ex(request, headers, runtime)

    async def update_cellgroup_disasterinfo_async(
        self,
        request: ldc_models.UpdateCellgroupDisasterinfoRequest,
    ) -> ldc_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cellgroup_disasterinfo_ex_async(request, headers, runtime)

    def update_cellgroup_disasterinfo_ex(
        self,
        request: ldc_models.UpdateCellgroupDisasterinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateCellgroupDisasterinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.cellgroup.disasterinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cellgroup_disasterinfo_ex_async(
        self,
        request: ldc_models.UpdateCellgroupDisasterinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateCellgroupDisasterinfoResponse:
        """
        Description: 配置逻辑单元灾备信息
        Summary: 配置逻辑单元灾备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateCellgroupDisasterinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cellgroup.disasterinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_cellgroup(
        self,
        request: ldc_models.DeleteCellgroupRequest,
    ) -> ldc_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_cellgroup_ex(request, headers, runtime)

    async def delete_cellgroup_async(
        self,
        request: ldc_models.DeleteCellgroupRequest,
    ) -> ldc_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_cellgroup_ex_async(request, headers, runtime)

    def delete_cellgroup_ex(
        self,
        request: ldc_models.DeleteCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteCellgroupResponse(),
            self.do_request('1.0', 'antcloud.ldc.cellgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_cellgroup_ex_async(
        self,
        request: ldc_models.DeleteCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteCellgroupResponse:
        """
        Description: 删除逻辑单元
        Summary: 删除逻辑单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteCellgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cellgroup.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cell(
        self,
        request: ldc_models.ListCellRequest,
    ) -> ldc_models.ListCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cell_ex(request, headers, runtime)

    async def list_cell_async(
        self,
        request: ldc_models.ListCellRequest,
    ) -> ldc_models.ListCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cell_ex_async(request, headers, runtime)

    def list_cell_ex(
        self,
        request: ldc_models.ListCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cell_ex_async(
        self,
        request: ldc_models.ListCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCellResponse:
        """
        Description: 查询部署单元列表
        Summary: 查询部署单元列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cell(
        self,
        request: ldc_models.CreateCellRequest,
    ) -> ldc_models.CreateCellResponse:
        """
        Description: 创建部署单元。
        Summary: 创建部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cell_ex(request, headers, runtime)

    async def create_cell_async(
        self,
        request: ldc_models.CreateCellRequest,
    ) -> ldc_models.CreateCellResponse:
        """
        Description: 创建部署单元。
        Summary: 创建部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cell_ex_async(request, headers, runtime)

    def create_cell_ex(
        self,
        request: ldc_models.CreateCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateCellResponse:
        """
        Description: 创建部署单元。
        Summary: 创建部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cell_ex_async(
        self,
        request: ldc_models.CreateCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateCellResponse:
        """
        Description: 创建部署单元。
        Summary: 创建部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_cell(
        self,
        request: ldc_models.DeleteCellRequest,
    ) -> ldc_models.DeleteCellResponse:
        """
        Description: 删除部署单元。
        Summary: 删除部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_cell_ex(request, headers, runtime)

    async def delete_cell_async(
        self,
        request: ldc_models.DeleteCellRequest,
    ) -> ldc_models.DeleteCellResponse:
        """
        Description: 删除部署单元。
        Summary: 删除部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_cell_ex_async(request, headers, runtime)

    def delete_cell_ex(
        self,
        request: ldc_models.DeleteCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteCellResponse:
        """
        Description: 删除部署单元。
        Summary: 删除部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_cell_ex_async(
        self,
        request: ldc_models.DeleteCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteCellResponse:
        """
        Description: 删除部署单元。
        Summary: 删除部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_pod(
        self,
        request: ldc_models.DeletePodRequest,
    ) -> ldc_models.DeletePodResponse:
        """
        Description: 删除pod
        Summary: 删除pod
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_pod_ex(request, headers, runtime)

    async def delete_pod_async(
        self,
        request: ldc_models.DeletePodRequest,
    ) -> ldc_models.DeletePodResponse:
        """
        Description: 删除pod
        Summary: 删除pod
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_pod_ex_async(request, headers, runtime)

    def delete_pod_ex(
        self,
        request: ldc_models.DeletePodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeletePodResponse:
        """
        Description: 删除pod
        Summary: 删除pod
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeletePodResponse(),
            self.do_request('1.0', 'antcloud.ldc.pod.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_pod_ex_async(
        self,
        request: ldc_models.DeletePodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeletePodResponse:
        """
        Description: 删除pod
        Summary: 删除pod
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeletePodResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.pod.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspacegroup_topology(
        self,
        request: ldc_models.GetWorkspacegroupTopologyRequest,
    ) -> ldc_models.GetWorkspacegroupTopologyResponse:
        """
        Description: 查询环境部署单元拓扑
        Summary: 查询环境部署单元拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspacegroup_topology_ex(request, headers, runtime)

    async def get_workspacegroup_topology_async(
        self,
        request: ldc_models.GetWorkspacegroupTopologyRequest,
    ) -> ldc_models.GetWorkspacegroupTopologyResponse:
        """
        Description: 查询环境部署单元拓扑
        Summary: 查询环境部署单元拓扑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspacegroup_topology_ex_async(request, headers, runtime)

    def get_workspacegroup_topology_ex(
        self,
        request: ldc_models.GetWorkspacegroupTopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetWorkspacegroupTopologyResponse:
        """
        Description: 查询环境部署单元拓扑
        Summary: 查询环境部署单元拓扑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetWorkspacegroupTopologyResponse(),
            self.do_request('1.0', 'antcloud.ldc.workspacegroup.topology.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspacegroup_topology_ex_async(
        self,
        request: ldc_models.GetWorkspacegroupTopologyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetWorkspacegroupTopologyResponse:
        """
        Description: 查询环境部署单元拓扑
        Summary: 查询环境部署单元拓扑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetWorkspacegroupTopologyResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.workspacegroup.topology.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_flow_cellweight(
        self,
        request: ldc_models.UpdateFlowCellweightRequest,
    ) -> ldc_models.UpdateFlowCellweightResponse:
        """
        Description: 修改 cell 权重
        Summary: 修改 cell 权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_flow_cellweight_ex(request, headers, runtime)

    async def update_flow_cellweight_async(
        self,
        request: ldc_models.UpdateFlowCellweightRequest,
    ) -> ldc_models.UpdateFlowCellweightResponse:
        """
        Description: 修改 cell 权重
        Summary: 修改 cell 权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_flow_cellweight_ex_async(request, headers, runtime)

    def update_flow_cellweight_ex(
        self,
        request: ldc_models.UpdateFlowCellweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowCellweightResponse:
        """
        Description: 修改 cell 权重
        Summary: 修改 cell 权重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowCellweightResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.cellweight.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_flow_cellweight_ex_async(
        self,
        request: ldc_models.UpdateFlowCellweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowCellweightResponse:
        """
        Description: 修改 cell 权重
        Summary: 修改 cell 权重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowCellweightResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.cellweight.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_flow_uidrange(
        self,
        request: ldc_models.UpdateFlowUidrangeRequest,
    ) -> ldc_models.UpdateFlowUidrangeResponse:
        """
        Description: uid 分片调整
        Summary: uid 分片调整
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_flow_uidrange_ex(request, headers, runtime)

    async def update_flow_uidrange_async(
        self,
        request: ldc_models.UpdateFlowUidrangeRequest,
    ) -> ldc_models.UpdateFlowUidrangeResponse:
        """
        Description: uid 分片调整
        Summary: uid 分片调整
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_flow_uidrange_ex_async(request, headers, runtime)

    def update_flow_uidrange_ex(
        self,
        request: ldc_models.UpdateFlowUidrangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowUidrangeResponse:
        """
        Description: uid 分片调整
        Summary: uid 分片调整
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowUidrangeResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.uidrange.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_flow_uidrange_ex_async(
        self,
        request: ldc_models.UpdateFlowUidrangeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowUidrangeResponse:
        """
        Description: uid 分片调整
        Summary: uid 分片调整
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowUidrangeResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.uidrange.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_flow_elasticuid(
        self,
        request: ldc_models.EnableFlowElasticuidRequest,
    ) -> ldc_models.EnableFlowElasticuidResponse:
        """
        Description: 弹出 UID 到弹性部署单元
        Summary: 弹出 UID 到弹性部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_flow_elasticuid_ex(request, headers, runtime)

    async def enable_flow_elasticuid_async(
        self,
        request: ldc_models.EnableFlowElasticuidRequest,
    ) -> ldc_models.EnableFlowElasticuidResponse:
        """
        Description: 弹出 UID 到弹性部署单元
        Summary: 弹出 UID 到弹性部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_flow_elasticuid_ex_async(request, headers, runtime)

    def enable_flow_elasticuid_ex(
        self,
        request: ldc_models.EnableFlowElasticuidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.EnableFlowElasticuidResponse:
        """
        Description: 弹出 UID 到弹性部署单元
        Summary: 弹出 UID 到弹性部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.EnableFlowElasticuidResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticuid.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_flow_elasticuid_ex_async(
        self,
        request: ldc_models.EnableFlowElasticuidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.EnableFlowElasticuidResponse:
        """
        Description: 弹出 UID 到弹性部署单元
        Summary: 弹出 UID 到弹性部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.EnableFlowElasticuidResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticuid.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_flow_elasticuid(
        self,
        request: ldc_models.DisableFlowElasticuidRequest,
    ) -> ldc_models.DisableFlowElasticuidResponse:
        """
        Description: 弹回 UID 分片
        Summary: 弹回 UID 分片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_flow_elasticuid_ex(request, headers, runtime)

    async def disable_flow_elasticuid_async(
        self,
        request: ldc_models.DisableFlowElasticuidRequest,
    ) -> ldc_models.DisableFlowElasticuidResponse:
        """
        Description: 弹回 UID 分片
        Summary: 弹回 UID 分片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_flow_elasticuid_ex_async(request, headers, runtime)

    def disable_flow_elasticuid_ex(
        self,
        request: ldc_models.DisableFlowElasticuidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DisableFlowElasticuidResponse:
        """
        Description: 弹回 UID 分片
        Summary: 弹回 UID 分片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DisableFlowElasticuidResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticuid.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_flow_elasticuid_ex_async(
        self,
        request: ldc_models.DisableFlowElasticuidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DisableFlowElasticuidResponse:
        """
        Description: 弹回 UID 分片
        Summary: 弹回 UID 分片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DisableFlowElasticuidResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticuid.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_flow_rule(
        self,
        request: ldc_models.ExportFlowRuleRequest,
    ) -> ldc_models.ExportFlowRuleResponse:
        """
        Description: 导出当前的流量规则
        Summary: 导出当前的流量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_flow_rule_ex(request, headers, runtime)

    async def export_flow_rule_async(
        self,
        request: ldc_models.ExportFlowRuleRequest,
    ) -> ldc_models.ExportFlowRuleResponse:
        """
        Description: 导出当前的流量规则
        Summary: 导出当前的流量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_flow_rule_ex_async(request, headers, runtime)

    def export_flow_rule_ex(
        self,
        request: ldc_models.ExportFlowRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExportFlowRuleResponse:
        """
        Description: 导出当前的流量规则
        Summary: 导出当前的流量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExportFlowRuleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.rule.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_flow_rule_ex_async(
        self,
        request: ldc_models.ExportFlowRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExportFlowRuleResponse:
        """
        Description: 导出当前的流量规则
        Summary: 导出当前的流量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExportFlowRuleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.rule.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_flow_rule(
        self,
        request: ldc_models.PushFlowRuleRequest,
    ) -> ldc_models.PushFlowRuleResponse:
        """
        Description: 推送流量规则
        Summary: 推送流量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_flow_rule_ex(request, headers, runtime)

    async def push_flow_rule_async(
        self,
        request: ldc_models.PushFlowRuleRequest,
    ) -> ldc_models.PushFlowRuleResponse:
        """
        Description: 推送流量规则
        Summary: 推送流量规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_flow_rule_ex_async(request, headers, runtime)

    def push_flow_rule_ex(
        self,
        request: ldc_models.PushFlowRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.PushFlowRuleResponse:
        """
        Description: 推送流量规则
        Summary: 推送流量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.PushFlowRuleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.rule.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_flow_rule_ex_async(
        self,
        request: ldc_models.PushFlowRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.PushFlowRuleResponse:
        """
        Description: 推送流量规则
        Summary: 推送流量规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.PushFlowRuleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.rule.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_flow_elasticrule(
        self,
        request: ldc_models.AddFlowElasticruleRequest,
    ) -> ldc_models.AddFlowElasticruleResponse:
        """
        Description: 创建弹性规则
        Summary: 创建弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_flow_elasticrule_ex(request, headers, runtime)

    async def add_flow_elasticrule_async(
        self,
        request: ldc_models.AddFlowElasticruleRequest,
    ) -> ldc_models.AddFlowElasticruleResponse:
        """
        Description: 创建弹性规则
        Summary: 创建弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_flow_elasticrule_ex_async(request, headers, runtime)

    def add_flow_elasticrule_ex(
        self,
        request: ldc_models.AddFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddFlowElasticruleResponse:
        """
        Description: 创建弹性规则
        Summary: 创建弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddFlowElasticruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_flow_elasticrule_ex_async(
        self,
        request: ldc_models.AddFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddFlowElasticruleResponse:
        """
        Description: 创建弹性规则
        Summary: 创建弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddFlowElasticruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_flow_elasticrule(
        self,
        request: ldc_models.UpdateFlowElasticruleRequest,
    ) -> ldc_models.UpdateFlowElasticruleResponse:
        """
        Description: 更新弹性规则
        Summary: 更新弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_flow_elasticrule_ex(request, headers, runtime)

    async def update_flow_elasticrule_async(
        self,
        request: ldc_models.UpdateFlowElasticruleRequest,
    ) -> ldc_models.UpdateFlowElasticruleResponse:
        """
        Description: 更新弹性规则
        Summary: 更新弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_flow_elasticrule_ex_async(request, headers, runtime)

    def update_flow_elasticrule_ex(
        self,
        request: ldc_models.UpdateFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowElasticruleResponse:
        """
        Description: 更新弹性规则
        Summary: 更新弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowElasticruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_flow_elasticrule_ex_async(
        self,
        request: ldc_models.UpdateFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowElasticruleResponse:
        """
        Description: 更新弹性规则
        Summary: 更新弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowElasticruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticrule.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_flow_elasticrule(
        self,
        request: ldc_models.DeleteFlowElasticruleRequest,
    ) -> ldc_models.DeleteFlowElasticruleResponse:
        """
        Description: 删除弹性规则
        Summary: 删除弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_flow_elasticrule_ex(request, headers, runtime)

    async def delete_flow_elasticrule_async(
        self,
        request: ldc_models.DeleteFlowElasticruleRequest,
    ) -> ldc_models.DeleteFlowElasticruleResponse:
        """
        Description: 删除弹性规则
        Summary: 删除弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_flow_elasticrule_ex_async(request, headers, runtime)

    def delete_flow_elasticrule_ex(
        self,
        request: ldc_models.DeleteFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowElasticruleResponse:
        """
        Description: 删除弹性规则
        Summary: 删除弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowElasticruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_flow_elasticrule_ex_async(
        self,
        request: ldc_models.DeleteFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowElasticruleResponse:
        """
        Description: 删除弹性规则
        Summary: 删除弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowElasticruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_flow_elasticsubrule(
        self,
        request: ldc_models.AddFlowElasticsubruleRequest,
    ) -> ldc_models.AddFlowElasticsubruleResponse:
        """
        Description: 添加弹性子规则
        Summary: 添加弹性子规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_flow_elasticsubrule_ex(request, headers, runtime)

    async def add_flow_elasticsubrule_async(
        self,
        request: ldc_models.AddFlowElasticsubruleRequest,
    ) -> ldc_models.AddFlowElasticsubruleResponse:
        """
        Description: 添加弹性子规则
        Summary: 添加弹性子规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_flow_elasticsubrule_ex_async(request, headers, runtime)

    def add_flow_elasticsubrule_ex(
        self,
        request: ldc_models.AddFlowElasticsubruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddFlowElasticsubruleResponse:
        """
        Description: 添加弹性子规则
        Summary: 添加弹性子规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddFlowElasticsubruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticsubrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_flow_elasticsubrule_ex_async(
        self,
        request: ldc_models.AddFlowElasticsubruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddFlowElasticsubruleResponse:
        """
        Description: 添加弹性子规则
        Summary: 添加弹性子规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddFlowElasticsubruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticsubrule.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_flow_elasticsubrule(
        self,
        request: ldc_models.DeleteFlowElasticsubruleRequest,
    ) -> ldc_models.DeleteFlowElasticsubruleResponse:
        """
        Description: 删除子弹性规则
        Summary: 删除子弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_flow_elasticsubrule_ex(request, headers, runtime)

    async def delete_flow_elasticsubrule_async(
        self,
        request: ldc_models.DeleteFlowElasticsubruleRequest,
    ) -> ldc_models.DeleteFlowElasticsubruleResponse:
        """
        Description: 删除子弹性规则
        Summary: 删除子弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_flow_elasticsubrule_ex_async(request, headers, runtime)

    def delete_flow_elasticsubrule_ex(
        self,
        request: ldc_models.DeleteFlowElasticsubruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowElasticsubruleResponse:
        """
        Description: 删除子弹性规则
        Summary: 删除子弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowElasticsubruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticsubrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_flow_elasticsubrule_ex_async(
        self,
        request: ldc_models.DeleteFlowElasticsubruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowElasticsubruleResponse:
        """
        Description: 删除子弹性规则
        Summary: 删除子弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowElasticsubruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticsubrule.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_flow_elasticrulestatus(
        self,
        request: ldc_models.UpdateFlowElasticrulestatusRequest,
    ) -> ldc_models.UpdateFlowElasticrulestatusResponse:
        """
        Description: 批量更新弹性规则状态
        Summary: 批量更新弹性规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_flow_elasticrulestatus_ex(request, headers, runtime)

    async def update_flow_elasticrulestatus_async(
        self,
        request: ldc_models.UpdateFlowElasticrulestatusRequest,
    ) -> ldc_models.UpdateFlowElasticrulestatusResponse:
        """
        Description: 批量更新弹性规则状态
        Summary: 批量更新弹性规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_flow_elasticrulestatus_ex_async(request, headers, runtime)

    def update_flow_elasticrulestatus_ex(
        self,
        request: ldc_models.UpdateFlowElasticrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowElasticrulestatusResponse:
        """
        Description: 批量更新弹性规则状态
        Summary: 批量更新弹性规则状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowElasticrulestatusResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_flow_elasticrulestatus_ex_async(
        self,
        request: ldc_models.UpdateFlowElasticrulestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowElasticrulestatusResponse:
        """
        Description: 批量更新弹性规则状态
        Summary: 批量更新弹性规则状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowElasticrulestatusResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticrulestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_flow_elasticrule(
        self,
        request: ldc_models.BatchdeleteFlowElasticruleRequest,
    ) -> ldc_models.BatchdeleteFlowElasticruleResponse:
        """
        Description: 批量删除弹性规则
        Summary: 批量删除弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_flow_elasticrule_ex(request, headers, runtime)

    async def batchdelete_flow_elasticrule_async(
        self,
        request: ldc_models.BatchdeleteFlowElasticruleRequest,
    ) -> ldc_models.BatchdeleteFlowElasticruleResponse:
        """
        Description: 批量删除弹性规则
        Summary: 批量删除弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_flow_elasticrule_ex_async(request, headers, runtime)

    def batchdelete_flow_elasticrule_ex(
        self,
        request: ldc_models.BatchdeleteFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.BatchdeleteFlowElasticruleResponse:
        """
        Description: 批量删除弹性规则
        Summary: 批量删除弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.BatchdeleteFlowElasticruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticrule.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_flow_elasticrule_ex_async(
        self,
        request: ldc_models.BatchdeleteFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.BatchdeleteFlowElasticruleResponse:
        """
        Description: 批量删除弹性规则
        Summary: 批量删除弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.BatchdeleteFlowElasticruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticrule.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_flow_elasticscene(
        self,
        request: ldc_models.CreateFlowElasticsceneRequest,
    ) -> ldc_models.CreateFlowElasticsceneResponse:
        """
        Description: 创建弹性场景
        Summary: 创建弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_flow_elasticscene_ex(request, headers, runtime)

    async def create_flow_elasticscene_async(
        self,
        request: ldc_models.CreateFlowElasticsceneRequest,
    ) -> ldc_models.CreateFlowElasticsceneResponse:
        """
        Description: 创建弹性场景
        Summary: 创建弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_flow_elasticscene_ex_async(request, headers, runtime)

    def create_flow_elasticscene_ex(
        self,
        request: ldc_models.CreateFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFlowElasticsceneResponse:
        """
        Description: 创建弹性场景
        Summary: 创建弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFlowElasticsceneResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticscene.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_flow_elasticscene_ex_async(
        self,
        request: ldc_models.CreateFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFlowElasticsceneResponse:
        """
        Description: 创建弹性场景
        Summary: 创建弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFlowElasticsceneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticscene.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_flow_elasticscene(
        self,
        request: ldc_models.UpdateFlowElasticsceneRequest,
    ) -> ldc_models.UpdateFlowElasticsceneResponse:
        """
        Description: 修改弹性场景
        Summary: 修改弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_flow_elasticscene_ex(request, headers, runtime)

    async def update_flow_elasticscene_async(
        self,
        request: ldc_models.UpdateFlowElasticsceneRequest,
    ) -> ldc_models.UpdateFlowElasticsceneResponse:
        """
        Description: 修改弹性场景
        Summary: 修改弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_flow_elasticscene_ex_async(request, headers, runtime)

    def update_flow_elasticscene_ex(
        self,
        request: ldc_models.UpdateFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowElasticsceneResponse:
        """
        Description: 修改弹性场景
        Summary: 修改弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowElasticsceneResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticscene.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_flow_elasticscene_ex_async(
        self,
        request: ldc_models.UpdateFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowElasticsceneResponse:
        """
        Description: 修改弹性场景
        Summary: 修改弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowElasticsceneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticscene.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_flow_elasticscene(
        self,
        request: ldc_models.DeleteFlowElasticsceneRequest,
    ) -> ldc_models.DeleteFlowElasticsceneResponse:
        """
        Description: 删除弹性场景
        Summary: 删除弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_flow_elasticscene_ex(request, headers, runtime)

    async def delete_flow_elasticscene_async(
        self,
        request: ldc_models.DeleteFlowElasticsceneRequest,
    ) -> ldc_models.DeleteFlowElasticsceneResponse:
        """
        Description: 删除弹性场景
        Summary: 删除弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_flow_elasticscene_ex_async(request, headers, runtime)

    def delete_flow_elasticscene_ex(
        self,
        request: ldc_models.DeleteFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowElasticsceneResponse:
        """
        Description: 删除弹性场景
        Summary: 删除弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowElasticsceneResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticscene.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_flow_elasticscene_ex_async(
        self,
        request: ldc_models.DeleteFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowElasticsceneResponse:
        """
        Description: 删除弹性场景
        Summary: 删除弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowElasticsceneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticscene.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_flow_elasticvalue(
        self,
        request: ldc_models.SetFlowElasticvalueRequest,
    ) -> ldc_models.SetFlowElasticvalueResponse:
        """
        Description: 配置弹性值
        Summary: 配置弹性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_flow_elasticvalue_ex(request, headers, runtime)

    async def set_flow_elasticvalue_async(
        self,
        request: ldc_models.SetFlowElasticvalueRequest,
    ) -> ldc_models.SetFlowElasticvalueResponse:
        """
        Description: 配置弹性值
        Summary: 配置弹性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_flow_elasticvalue_ex_async(request, headers, runtime)

    def set_flow_elasticvalue_ex(
        self,
        request: ldc_models.SetFlowElasticvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SetFlowElasticvalueResponse:
        """
        Description: 配置弹性值
        Summary: 配置弹性值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SetFlowElasticvalueResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticvalue.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_flow_elasticvalue_ex_async(
        self,
        request: ldc_models.SetFlowElasticvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SetFlowElasticvalueResponse:
        """
        Description: 配置弹性值
        Summary: 配置弹性值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SetFlowElasticvalueResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticvalue.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_flow_elasticvalue(
        self,
        request: ldc_models.DisableFlowElasticvalueRequest,
    ) -> ldc_models.DisableFlowElasticvalueResponse:
        """
        Description: 恢复弹性值
        Summary: 恢复弹性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_flow_elasticvalue_ex(request, headers, runtime)

    async def disable_flow_elasticvalue_async(
        self,
        request: ldc_models.DisableFlowElasticvalueRequest,
    ) -> ldc_models.DisableFlowElasticvalueResponse:
        """
        Description: 恢复弹性值
        Summary: 恢复弹性值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_flow_elasticvalue_ex_async(request, headers, runtime)

    def disable_flow_elasticvalue_ex(
        self,
        request: ldc_models.DisableFlowElasticvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DisableFlowElasticvalueResponse:
        """
        Description: 恢复弹性值
        Summary: 恢复弹性值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DisableFlowElasticvalueResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticvalue.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_flow_elasticvalue_ex_async(
        self,
        request: ldc_models.DisableFlowElasticvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DisableFlowElasticvalueResponse:
        """
        Description: 恢复弹性值
        Summary: 恢复弹性值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DisableFlowElasticvalueResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticvalue.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_flow_site(
        self,
        request: ldc_models.CreateFlowSiteRequest,
    ) -> ldc_models.CreateFlowSiteResponse:
        """
        Description: 创建站点
        Summary: 创建站点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_flow_site_ex(request, headers, runtime)

    async def create_flow_site_async(
        self,
        request: ldc_models.CreateFlowSiteRequest,
    ) -> ldc_models.CreateFlowSiteResponse:
        """
        Description: 创建站点
        Summary: 创建站点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_flow_site_ex_async(request, headers, runtime)

    def create_flow_site_ex(
        self,
        request: ldc_models.CreateFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFlowSiteResponse:
        """
        Description: 创建站点
        Summary: 创建站点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFlowSiteResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.site.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_flow_site_ex_async(
        self,
        request: ldc_models.CreateFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFlowSiteResponse:
        """
        Description: 创建站点
        Summary: 创建站点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFlowSiteResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.site.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_flow_site(
        self,
        request: ldc_models.UpdateFlowSiteRequest,
    ) -> ldc_models.UpdateFlowSiteResponse:
        """
        Description: 修改站点信息
        Summary: 修改站点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_flow_site_ex(request, headers, runtime)

    async def update_flow_site_async(
        self,
        request: ldc_models.UpdateFlowSiteRequest,
    ) -> ldc_models.UpdateFlowSiteResponse:
        """
        Description: 修改站点信息
        Summary: 修改站点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_flow_site_ex_async(request, headers, runtime)

    def update_flow_site_ex(
        self,
        request: ldc_models.UpdateFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowSiteResponse:
        """
        Description: 修改站点信息
        Summary: 修改站点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowSiteResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.site.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_flow_site_ex_async(
        self,
        request: ldc_models.UpdateFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFlowSiteResponse:
        """
        Description: 修改站点信息
        Summary: 修改站点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFlowSiteResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.site.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_flow_site(
        self,
        request: ldc_models.DeleteFlowSiteRequest,
    ) -> ldc_models.DeleteFlowSiteResponse:
        """
        Description: 删除站点
        Summary: 删除站点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_flow_site_ex(request, headers, runtime)

    async def delete_flow_site_async(
        self,
        request: ldc_models.DeleteFlowSiteRequest,
    ) -> ldc_models.DeleteFlowSiteResponse:
        """
        Description: 删除站点
        Summary: 删除站点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_flow_site_ex_async(request, headers, runtime)

    def delete_flow_site_ex(
        self,
        request: ldc_models.DeleteFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowSiteResponse:
        """
        Description: 删除站点
        Summary: 删除站点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowSiteResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.site.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_flow_site_ex_async(
        self,
        request: ldc_models.DeleteFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowSiteResponse:
        """
        Description: 删除站点
        Summary: 删除站点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowSiteResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.site.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_opsplan_restart(
        self,
        request: ldc_models.CreateOpsplanRestartRequest,
    ) -> ldc_models.CreateOpsplanRestartResponse:
        """
        Description: 指定应用或指定pods创建重启运维单
        Summary: 创建重启运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_opsplan_restart_ex(request, headers, runtime)

    async def create_opsplan_restart_async(
        self,
        request: ldc_models.CreateOpsplanRestartRequest,
    ) -> ldc_models.CreateOpsplanRestartResponse:
        """
        Description: 指定应用或指定pods创建重启运维单
        Summary: 创建重启运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_opsplan_restart_ex_async(request, headers, runtime)

    def create_opsplan_restart_ex(
        self,
        request: ldc_models.CreateOpsplanRestartRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateOpsplanRestartResponse:
        """
        Description: 指定应用或指定pods创建重启运维单
        Summary: 创建重启运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateOpsplanRestartResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.restart.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_opsplan_restart_ex_async(
        self,
        request: ldc_models.CreateOpsplanRestartRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateOpsplanRestartResponse:
        """
        Description: 指定应用或指定pods创建重启运维单
        Summary: 创建重启运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateOpsplanRestartResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.restart.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_comment(
        self,
        request: ldc_models.UpdateContainerserviceCommentRequest,
    ) -> ldc_models.UpdateContainerserviceCommentResponse:
        """
        Description: 容器应用服务revision添加备注
        Summary: 容器应用服务revision添加备注
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_comment_ex(request, headers, runtime)

    async def update_containerservice_comment_async(
        self,
        request: ldc_models.UpdateContainerserviceCommentRequest,
    ) -> ldc_models.UpdateContainerserviceCommentResponse:
        """
        Description: 容器应用服务revision添加备注
        Summary: 容器应用服务revision添加备注
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_comment_ex_async(request, headers, runtime)

    def update_containerservice_comment_ex(
        self,
        request: ldc_models.UpdateContainerserviceCommentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceCommentResponse:
        """
        Description: 容器应用服务revision添加备注
        Summary: 容器应用服务revision添加备注
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceCommentResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.comment.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_comment_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceCommentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceCommentResponse:
        """
        Description: 容器应用服务revision添加备注
        Summary: 容器应用服务revision添加备注
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceCommentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.comment.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_containerservice_deployment(
        self,
        request: ldc_models.RollbackContainerserviceDeploymentRequest,
    ) -> ldc_models.RollbackContainerserviceDeploymentResponse:
        """
        Description: 回滚容器服务到指定版本
        Summary: 回滚容器服务到指定版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_containerservice_deployment_ex(request, headers, runtime)

    async def rollback_containerservice_deployment_async(
        self,
        request: ldc_models.RollbackContainerserviceDeploymentRequest,
    ) -> ldc_models.RollbackContainerserviceDeploymentResponse:
        """
        Description: 回滚容器服务到指定版本
        Summary: 回滚容器服务到指定版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_containerservice_deployment_ex_async(request, headers, runtime)

    def rollback_containerservice_deployment_ex(
        self,
        request: ldc_models.RollbackContainerserviceDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RollbackContainerserviceDeploymentResponse:
        """
        Description: 回滚容器服务到指定版本
        Summary: 回滚容器服务到指定版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RollbackContainerserviceDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.deployment.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_containerservice_deployment_ex_async(
        self,
        request: ldc_models.RollbackContainerserviceDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RollbackContainerserviceDeploymentResponse:
        """
        Description: 回滚容器服务到指定版本
        Summary: 回滚容器服务到指定版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RollbackContainerserviceDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.deployment.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_uidinfo(
        self,
        request: ldc_models.QueryFlowUidinfoRequest,
    ) -> ldc_models.QueryFlowUidinfoResponse:
        """
        Description: 查询 uid 信息
        Summary: 查询 uid 信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_uidinfo_ex(request, headers, runtime)

    async def query_flow_uidinfo_async(
        self,
        request: ldc_models.QueryFlowUidinfoRequest,
    ) -> ldc_models.QueryFlowUidinfoResponse:
        """
        Description: 查询 uid 信息
        Summary: 查询 uid 信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_uidinfo_ex_async(request, headers, runtime)

    def query_flow_uidinfo_ex(
        self,
        request: ldc_models.QueryFlowUidinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowUidinfoResponse:
        """
        Description: 查询 uid 信息
        Summary: 查询 uid 信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowUidinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.uidinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_uidinfo_ex_async(
        self,
        request: ldc_models.QueryFlowUidinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowUidinfoResponse:
        """
        Description: 查询 uid 信息
        Summary: 查询 uid 信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowUidinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.uidinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_site(
        self,
        request: ldc_models.QueryFlowSiteRequest,
    ) -> ldc_models.QueryFlowSiteResponse:
        """
        Description: 查询站点
        Summary: 查询站点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_site_ex(request, headers, runtime)

    async def query_flow_site_async(
        self,
        request: ldc_models.QueryFlowSiteRequest,
    ) -> ldc_models.QueryFlowSiteResponse:
        """
        Description: 查询站点
        Summary: 查询站点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_site_ex_async(request, headers, runtime)

    def query_flow_site_ex(
        self,
        request: ldc_models.QueryFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowSiteResponse:
        """
        Description: 查询站点
        Summary: 查询站点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowSiteResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.site.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_site_ex_async(
        self,
        request: ldc_models.QueryFlowSiteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowSiteResponse:
        """
        Description: 查询站点
        Summary: 查询站点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowSiteResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.site.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cell(
        self,
        request: ldc_models.GetCellRequest,
    ) -> ldc_models.GetCellResponse:
        """
        Description: 查询部署单元信息
        Summary: 查询部署单元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cell_ex(request, headers, runtime)

    async def get_cell_async(
        self,
        request: ldc_models.GetCellRequest,
    ) -> ldc_models.GetCellResponse:
        """
        Description: 查询部署单元信息
        Summary: 查询部署单元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cell_ex_async(request, headers, runtime)

    def get_cell_ex(
        self,
        request: ldc_models.GetCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetCellResponse:
        """
        Description: 查询部署单元信息
        Summary: 查询部署单元信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.cell.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cell_ex_async(
        self,
        request: ldc_models.GetCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetCellResponse:
        """
        Description: 查询部署单元信息
        Summary: 查询部署单元信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cell.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cellgroup(
        self,
        request: ldc_models.GetCellgroupRequest,
    ) -> ldc_models.GetCellgroupResponse:
        """
        Description: 查询逻辑单元信息。
        Summary: 查询逻辑单元信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cellgroup_ex(request, headers, runtime)

    async def get_cellgroup_async(
        self,
        request: ldc_models.GetCellgroupRequest,
    ) -> ldc_models.GetCellgroupResponse:
        """
        Description: 查询逻辑单元信息。
        Summary: 查询逻辑单元信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cellgroup_ex_async(request, headers, runtime)

    def get_cellgroup_ex(
        self,
        request: ldc_models.GetCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetCellgroupResponse:
        """
        Description: 查询逻辑单元信息。
        Summary: 查询逻辑单元信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetCellgroupResponse(),
            self.do_request('1.0', 'antcloud.ldc.cellgroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cellgroup_ex_async(
        self,
        request: ldc_models.GetCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetCellgroupResponse:
        """
        Description: 查询逻辑单元信息。
        Summary: 查询逻辑单元信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetCellgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cellgroup.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cell(
        self,
        request: ldc_models.UpdateCellRequest,
    ) -> ldc_models.UpdateCellResponse:
        """
        Description: 更新部署单元信息。
        Summary: 更新部署单元信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cell_ex(request, headers, runtime)

    async def update_cell_async(
        self,
        request: ldc_models.UpdateCellRequest,
    ) -> ldc_models.UpdateCellResponse:
        """
        Description: 更新部署单元信息。
        Summary: 更新部署单元信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cell_ex_async(request, headers, runtime)

    def update_cell_ex(
        self,
        request: ldc_models.UpdateCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateCellResponse:
        """
        Description: 更新部署单元信息。
        Summary: 更新部署单元信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateCellResponse(),
            self.do_request('1.0', 'antcloud.ldc.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cell_ex_async(
        self,
        request: ldc_models.UpdateCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateCellResponse:
        """
        Description: 更新部署单元信息。
        Summary: 更新部署单元信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateCellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cell.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_events(
        self,
        request: ldc_models.ListEventsRequest,
    ) -> ldc_models.ListEventsResponse:
        """
        Description: 查询Pod/容器事件列表
        Summary: 查询Pod/容器事件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_events_ex(request, headers, runtime)

    async def list_events_async(
        self,
        request: ldc_models.ListEventsRequest,
    ) -> ldc_models.ListEventsResponse:
        """
        Description: 查询Pod/容器事件列表
        Summary: 查询Pod/容器事件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_events_ex_async(request, headers, runtime)

    def list_events_ex(
        self,
        request: ldc_models.ListEventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListEventsResponse:
        """
        Description: 查询Pod/容器事件列表
        Summary: 查询Pod/容器事件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListEventsResponse(),
            self.do_request('1.0', 'antcloud.ldc.events.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_events_ex_async(
        self,
        request: ldc_models.ListEventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListEventsResponse:
        """
        Description: 查询Pod/容器事件列表
        Summary: 查询Pod/容器事件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListEventsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.events.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_region(
        self,
        request: ldc_models.ListRegionRequest,
    ) -> ldc_models.ListRegionResponse:
        """
        Description: 获取地域信息
        Summary: 获取地域信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_region_ex(request, headers, runtime)

    async def list_region_async(
        self,
        request: ldc_models.ListRegionRequest,
    ) -> ldc_models.ListRegionResponse:
        """
        Description: 获取地域信息
        Summary: 获取地域信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_region_ex_async(request, headers, runtime)

    def list_region_ex(
        self,
        request: ldc_models.ListRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListRegionResponse:
        """
        Description: 获取地域信息
        Summary: 获取地域信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListRegionResponse(),
            self.do_request('1.0', 'antcloud.ldc.region.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_region_ex_async(
        self,
        request: ldc_models.ListRegionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListRegionResponse:
        """
        Description: 获取地域信息
        Summary: 获取地域信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListRegionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.region.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_zone(
        self,
        request: ldc_models.ListZoneRequest,
    ) -> ldc_models.ListZoneResponse:
        """
        Description: 可用区列表
        Summary: 可用区列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_zone_ex(request, headers, runtime)

    async def list_zone_async(
        self,
        request: ldc_models.ListZoneRequest,
    ) -> ldc_models.ListZoneResponse:
        """
        Description: 可用区列表
        Summary: 可用区列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_zone_ex_async(request, headers, runtime)

    def list_zone_ex(
        self,
        request: ldc_models.ListZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListZoneResponse:
        """
        Description: 可用区列表
        Summary: 可用区列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListZoneResponse(),
            self.do_request('1.0', 'antcloud.ldc.zone.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_zone_ex_async(
        self,
        request: ldc_models.ListZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListZoneResponse:
        """
        Description: 可用区列表
        Summary: 可用区列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListZoneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.zone.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pod_log(
        self,
        request: ldc_models.QueryPodLogRequest,
    ) -> ldc_models.QueryPodLogResponse:
        """
        Description: 查询pod下container 日志
        Summary: 查询pod日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pod_log_ex(request, headers, runtime)

    async def query_pod_log_async(
        self,
        request: ldc_models.QueryPodLogRequest,
    ) -> ldc_models.QueryPodLogResponse:
        """
        Description: 查询pod下container 日志
        Summary: 查询pod日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pod_log_ex_async(request, headers, runtime)

    def query_pod_log_ex(
        self,
        request: ldc_models.QueryPodLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryPodLogResponse:
        """
        Description: 查询pod下container 日志
        Summary: 查询pod日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryPodLogResponse(),
            self.do_request('1.0', 'antcloud.ldc.pod.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pod_log_ex_async(
        self,
        request: ldc_models.QueryPodLogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryPodLogResponse:
        """
        Description: 查询pod下container 日志
        Summary: 查询pod日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryPodLogResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.pod.log.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_spanner_cluster(
        self,
        request: ldc_models.CreateSpannerClusterRequest,
    ) -> ldc_models.CreateSpannerClusterResponse:
        """
        Description: 创建spanner集群
        Summary: 创建spanner集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_spanner_cluster_ex(request, headers, runtime)

    async def create_spanner_cluster_async(
        self,
        request: ldc_models.CreateSpannerClusterRequest,
    ) -> ldc_models.CreateSpannerClusterResponse:
        """
        Description: 创建spanner集群
        Summary: 创建spanner集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_spanner_cluster_ex_async(request, headers, runtime)

    def create_spanner_cluster_ex(
        self,
        request: ldc_models.CreateSpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateSpannerClusterResponse:
        """
        Description: 创建spanner集群
        Summary: 创建spanner集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateSpannerClusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.spanner.cluster.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_spanner_cluster_ex_async(
        self,
        request: ldc_models.CreateSpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateSpannerClusterResponse:
        """
        Description: 创建spanner集群
        Summary: 创建spanner集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateSpannerClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.spanner.cluster.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_spanner_cluster(
        self,
        request: ldc_models.GetSpannerClusterRequest,
    ) -> ldc_models.GetSpannerClusterResponse:
        """
        Description: 获取集群详情
        Summary: 获取集群详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_spanner_cluster_ex(request, headers, runtime)

    async def get_spanner_cluster_async(
        self,
        request: ldc_models.GetSpannerClusterRequest,
    ) -> ldc_models.GetSpannerClusterResponse:
        """
        Description: 获取集群详情
        Summary: 获取集群详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_spanner_cluster_ex_async(request, headers, runtime)

    def get_spanner_cluster_ex(
        self,
        request: ldc_models.GetSpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetSpannerClusterResponse:
        """
        Description: 获取集群详情
        Summary: 获取集群详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetSpannerClusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.spanner.cluster.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_spanner_cluster_ex_async(
        self,
        request: ldc_models.GetSpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetSpannerClusterResponse:
        """
        Description: 获取集群详情
        Summary: 获取集群详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetSpannerClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.spanner.cluster.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scale_spanner_cluster(
        self,
        request: ldc_models.ScaleSpannerClusterRequest,
    ) -> ldc_models.ScaleSpannerClusterResponse:
        """
        Description: 扩容spanner集群
        Summary: 扩容spanner集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scale_spanner_cluster_ex(request, headers, runtime)

    async def scale_spanner_cluster_async(
        self,
        request: ldc_models.ScaleSpannerClusterRequest,
    ) -> ldc_models.ScaleSpannerClusterResponse:
        """
        Description: 扩容spanner集群
        Summary: 扩容spanner集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scale_spanner_cluster_ex_async(request, headers, runtime)

    def scale_spanner_cluster_ex(
        self,
        request: ldc_models.ScaleSpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ScaleSpannerClusterResponse:
        """
        Description: 扩容spanner集群
        Summary: 扩容spanner集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ScaleSpannerClusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.spanner.cluster.scale', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scale_spanner_cluster_ex_async(
        self,
        request: ldc_models.ScaleSpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ScaleSpannerClusterResponse:
        """
        Description: 扩容spanner集群
        Summary: 扩容spanner集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ScaleSpannerClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.spanner.cluster.scale', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_spanner_cluster(
        self,
        request: ldc_models.QuerySpannerClusterRequest,
    ) -> ldc_models.QuerySpannerClusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_spanner_cluster_ex(request, headers, runtime)

    async def query_spanner_cluster_async(
        self,
        request: ldc_models.QuerySpannerClusterRequest,
    ) -> ldc_models.QuerySpannerClusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_spanner_cluster_ex_async(request, headers, runtime)

    def query_spanner_cluster_ex(
        self,
        request: ldc_models.QuerySpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySpannerClusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySpannerClusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.spanner.cluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_spanner_cluster_ex_async(
        self,
        request: ldc_models.QuerySpannerClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySpannerClusterResponse:
        """
        Description: 查询集群列表
        Summary: 查询集群列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySpannerClusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.spanner.cluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_spanner_clusterstatus(
        self,
        request: ldc_models.UpdateSpannerClusterstatusRequest,
    ) -> ldc_models.UpdateSpannerClusterstatusResponse:
        """
        Description: 更新spanner集群状态
        Summary: 更新spanner集群状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_spanner_clusterstatus_ex(request, headers, runtime)

    async def update_spanner_clusterstatus_async(
        self,
        request: ldc_models.UpdateSpannerClusterstatusRequest,
    ) -> ldc_models.UpdateSpannerClusterstatusResponse:
        """
        Description: 更新spanner集群状态
        Summary: 更新spanner集群状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_spanner_clusterstatus_ex_async(request, headers, runtime)

    def update_spanner_clusterstatus_ex(
        self,
        request: ldc_models.UpdateSpannerClusterstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSpannerClusterstatusResponse:
        """
        Description: 更新spanner集群状态
        Summary: 更新spanner集群状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSpannerClusterstatusResponse(),
            self.do_request('1.0', 'antcloud.ldc.spanner.clusterstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_spanner_clusterstatus_ex_async(
        self,
        request: ldc_models.UpdateSpannerClusterstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSpannerClusterstatusResponse:
        """
        Description: 更新spanner集群状态
        Summary: 更新spanner集群状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSpannerClusterstatusResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.spanner.clusterstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_spanner_unitstatus(
        self,
        request: ldc_models.UpdateSpannerUnitstatusRequest,
    ) -> ldc_models.UpdateSpannerUnitstatusResponse:
        """
        Description: 更新集群单元状态
        Summary: 更新集群单元状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_spanner_unitstatus_ex(request, headers, runtime)

    async def update_spanner_unitstatus_async(
        self,
        request: ldc_models.UpdateSpannerUnitstatusRequest,
    ) -> ldc_models.UpdateSpannerUnitstatusResponse:
        """
        Description: 更新集群单元状态
        Summary: 更新集群单元状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_spanner_unitstatus_ex_async(request, headers, runtime)

    def update_spanner_unitstatus_ex(
        self,
        request: ldc_models.UpdateSpannerUnitstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSpannerUnitstatusResponse:
        """
        Description: 更新集群单元状态
        Summary: 更新集群单元状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSpannerUnitstatusResponse(),
            self.do_request('1.0', 'antcloud.ldc.spanner.unitstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_spanner_unitstatus_ex_async(
        self,
        request: ldc_models.UpdateSpannerUnitstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSpannerUnitstatusResponse:
        """
        Description: 更新集群单元状态
        Summary: 更新集群单元状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSpannerUnitstatusResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.spanner.unitstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_opsplan_service(
        self,
        request: ldc_models.CancelOpsplanServiceRequest,
    ) -> ldc_models.CancelOpsplanServiceResponse:
        """
        Description: 取消应用服务发布|运维
        Summary: 取消应用服务发布|运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_opsplan_service_ex(request, headers, runtime)

    async def cancel_opsplan_service_async(
        self,
        request: ldc_models.CancelOpsplanServiceRequest,
    ) -> ldc_models.CancelOpsplanServiceResponse:
        """
        Description: 取消应用服务发布|运维
        Summary: 取消应用服务发布|运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_opsplan_service_ex_async(request, headers, runtime)

    def cancel_opsplan_service_ex(
        self,
        request: ldc_models.CancelOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelOpsplanServiceResponse:
        """
        Description: 取消应用服务发布|运维
        Summary: 取消应用服务发布|运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelOpsplanServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.service.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_opsplan_service_ex_async(
        self,
        request: ldc_models.CancelOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelOpsplanServiceResponse:
        """
        Description: 取消应用服务发布|运维
        Summary: 取消应用服务发布|运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelOpsplanServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.service.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_system_url(
        self,
        request: ldc_models.ListSystemUrlRequest,
    ) -> ldc_models.ListSystemUrlResponse:
        """
        Description: 查询系统配置url
        Summary: 系统url查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_system_url_ex(request, headers, runtime)

    async def list_system_url_async(
        self,
        request: ldc_models.ListSystemUrlRequest,
    ) -> ldc_models.ListSystemUrlResponse:
        """
        Description: 查询系统配置url
        Summary: 系统url查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_system_url_ex_async(request, headers, runtime)

    def list_system_url_ex(
        self,
        request: ldc_models.ListSystemUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSystemUrlResponse:
        """
        Description: 查询系统配置url
        Summary: 系统url查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSystemUrlResponse(),
            self.do_request('1.0', 'antcloud.ldc.system.url.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_system_url_ex_async(
        self,
        request: ldc_models.ListSystemUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSystemUrlResponse:
        """
        Description: 查询系统配置url
        Summary: 系统url查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSystemUrlResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.system.url.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_record(
        self,
        request: ldc_models.QueryFlowRecordRequest,
    ) -> ldc_models.QueryFlowRecordResponse:
        """
        Description: 查询流量推送记录
        Summary: 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_record_ex(request, headers, runtime)

    async def query_flow_record_async(
        self,
        request: ldc_models.QueryFlowRecordRequest,
    ) -> ldc_models.QueryFlowRecordResponse:
        """
        Description: 查询流量推送记录
        Summary: 查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_record_ex_async(request, headers, runtime)

    def query_flow_record_ex(
        self,
        request: ldc_models.QueryFlowRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowRecordResponse:
        """
        Description: 查询流量推送记录
        Summary: 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowRecordResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.record.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_record_ex_async(
        self,
        request: ldc_models.QueryFlowRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowRecordResponse:
        """
        Description: 查询流量推送记录
        Summary: 查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowRecordResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.record.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_flow_envrel(
        self,
        request: ldc_models.SaveFlowEnvrelRequest,
    ) -> ldc_models.SaveFlowEnvrelResponse:
        """
        Description: 保存环境关联
        Summary: 保存环境关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_flow_envrel_ex(request, headers, runtime)

    async def save_flow_envrel_async(
        self,
        request: ldc_models.SaveFlowEnvrelRequest,
    ) -> ldc_models.SaveFlowEnvrelResponse:
        """
        Description: 保存环境关联
        Summary: 保存环境关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_flow_envrel_ex_async(request, headers, runtime)

    def save_flow_envrel_ex(
        self,
        request: ldc_models.SaveFlowEnvrelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SaveFlowEnvrelResponse:
        """
        Description: 保存环境关联
        Summary: 保存环境关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SaveFlowEnvrelResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.envrel.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_flow_envrel_ex_async(
        self,
        request: ldc_models.SaveFlowEnvrelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SaveFlowEnvrelResponse:
        """
        Description: 保存环境关联
        Summary: 保存环境关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SaveFlowEnvrelResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.envrel.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_flow_envrel(
        self,
        request: ldc_models.DeleteFlowEnvrelRequest,
    ) -> ldc_models.DeleteFlowEnvrelResponse:
        """
        Description: 删除环境关联
        Summary: 删除环境关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_flow_envrel_ex(request, headers, runtime)

    async def delete_flow_envrel_async(
        self,
        request: ldc_models.DeleteFlowEnvrelRequest,
    ) -> ldc_models.DeleteFlowEnvrelResponse:
        """
        Description: 删除环境关联
        Summary: 删除环境关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_flow_envrel_ex_async(request, headers, runtime)

    def delete_flow_envrel_ex(
        self,
        request: ldc_models.DeleteFlowEnvrelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowEnvrelResponse:
        """
        Description: 删除环境关联
        Summary: 删除环境关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowEnvrelResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.envrel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_flow_envrel_ex_async(
        self,
        request: ldc_models.DeleteFlowEnvrelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowEnvrelResponse:
        """
        Description: 删除环境关联
        Summary: 删除环境关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowEnvrelResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.envrel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_envrel(
        self,
        request: ldc_models.QueryFlowEnvrelRequest,
    ) -> ldc_models.QueryFlowEnvrelResponse:
        """
        Description: 查询关联
        Summary: 查询关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_envrel_ex(request, headers, runtime)

    async def query_flow_envrel_async(
        self,
        request: ldc_models.QueryFlowEnvrelRequest,
    ) -> ldc_models.QueryFlowEnvrelResponse:
        """
        Description: 查询关联
        Summary: 查询关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_envrel_ex_async(request, headers, runtime)

    def query_flow_envrel_ex(
        self,
        request: ldc_models.QueryFlowEnvrelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowEnvrelResponse:
        """
        Description: 查询关联
        Summary: 查询关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowEnvrelResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.envrel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_envrel_ex_async(
        self,
        request: ldc_models.QueryFlowEnvrelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowEnvrelResponse:
        """
        Description: 查询关联
        Summary: 查询关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowEnvrelResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.envrel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_flow_sitecell(
        self,
        request: ldc_models.CreateFlowSitecellRequest,
    ) -> ldc_models.CreateFlowSitecellResponse:
        """
        Description: 创建异构机房部署单元
        Summary: 创建异构机房部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_flow_sitecell_ex(request, headers, runtime)

    async def create_flow_sitecell_async(
        self,
        request: ldc_models.CreateFlowSitecellRequest,
    ) -> ldc_models.CreateFlowSitecellResponse:
        """
        Description: 创建异构机房部署单元
        Summary: 创建异构机房部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_flow_sitecell_ex_async(request, headers, runtime)

    def create_flow_sitecell_ex(
        self,
        request: ldc_models.CreateFlowSitecellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFlowSitecellResponse:
        """
        Description: 创建异构机房部署单元
        Summary: 创建异构机房部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFlowSitecellResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.sitecell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_flow_sitecell_ex_async(
        self,
        request: ldc_models.CreateFlowSitecellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFlowSitecellResponse:
        """
        Description: 创建异构机房部署单元
        Summary: 创建异构机房部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFlowSitecellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.sitecell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_flow_sitecell(
        self,
        request: ldc_models.DeleteFlowSitecellRequest,
    ) -> ldc_models.DeleteFlowSitecellResponse:
        """
        Description: 删除异构机房部署单元
        Summary: 删除异构机房部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_flow_sitecell_ex(request, headers, runtime)

    async def delete_flow_sitecell_async(
        self,
        request: ldc_models.DeleteFlowSitecellRequest,
    ) -> ldc_models.DeleteFlowSitecellResponse:
        """
        Description: 删除异构机房部署单元
        Summary: 删除异构机房部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_flow_sitecell_ex_async(request, headers, runtime)

    def delete_flow_sitecell_ex(
        self,
        request: ldc_models.DeleteFlowSitecellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowSitecellResponse:
        """
        Description: 删除异构机房部署单元
        Summary: 删除异构机房部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowSitecellResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.sitecell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_flow_sitecell_ex_async(
        self,
        request: ldc_models.DeleteFlowSitecellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFlowSitecellResponse:
        """
        Description: 删除异构机房部署单元
        Summary: 删除异构机房部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFlowSitecellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.sitecell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_sitecell(
        self,
        request: ldc_models.QueryFlowSitecellRequest,
    ) -> ldc_models.QueryFlowSitecellResponse:
        """
        Description: 查询异构机房部署单元
        Summary: 查询异构机房部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_sitecell_ex(request, headers, runtime)

    async def query_flow_sitecell_async(
        self,
        request: ldc_models.QueryFlowSitecellRequest,
    ) -> ldc_models.QueryFlowSitecellResponse:
        """
        Description: 查询异构机房部署单元
        Summary: 查询异构机房部署单元
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_sitecell_ex_async(request, headers, runtime)

    def query_flow_sitecell_ex(
        self,
        request: ldc_models.QueryFlowSitecellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowSitecellResponse:
        """
        Description: 查询异构机房部署单元
        Summary: 查询异构机房部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowSitecellResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.sitecell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_sitecell_ex_async(
        self,
        request: ldc_models.QueryFlowSitecellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowSitecellResponse:
        """
        Description: 查询异构机房部署单元
        Summary: 查询异构机房部署单元
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowSitecellResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.sitecell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_opsplan_service(
        self,
        request: ldc_models.GetOpsplanServiceRequest,
    ) -> ldc_models.GetOpsplanServiceResponse:
        """
        Description: 获取发布单下应用服务详情
        Summary: 获取发布单下应用服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_opsplan_service_ex(request, headers, runtime)

    async def get_opsplan_service_async(
        self,
        request: ldc_models.GetOpsplanServiceRequest,
    ) -> ldc_models.GetOpsplanServiceResponse:
        """
        Description: 获取发布单下应用服务详情
        Summary: 获取发布单下应用服务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_opsplan_service_ex_async(request, headers, runtime)

    def get_opsplan_service_ex(
        self,
        request: ldc_models.GetOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetOpsplanServiceResponse:
        """
        Description: 获取发布单下应用服务详情
        Summary: 获取发布单下应用服务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetOpsplanServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.service.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_opsplan_service_ex_async(
        self,
        request: ldc_models.GetOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetOpsplanServiceResponse:
        """
        Description: 获取发布单下应用服务详情
        Summary: 获取发布单下应用服务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetOpsplanServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.service.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_rule(
        self,
        request: ldc_models.QueryFlowRuleRequest,
    ) -> ldc_models.QueryFlowRuleResponse:
        """
        Description: 获取当前生效的路由规则
        Summary: 获取当前生效的路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_rule_ex(request, headers, runtime)

    async def query_flow_rule_async(
        self,
        request: ldc_models.QueryFlowRuleRequest,
    ) -> ldc_models.QueryFlowRuleResponse:
        """
        Description: 获取当前生效的路由规则
        Summary: 获取当前生效的路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_rule_ex_async(request, headers, runtime)

    def query_flow_rule_ex(
        self,
        request: ldc_models.QueryFlowRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowRuleResponse:
        """
        Description: 获取当前生效的路由规则
        Summary: 获取当前生效的路由规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowRuleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_rule_ex_async(
        self,
        request: ldc_models.QueryFlowRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowRuleResponse:
        """
        Description: 获取当前生效的路由规则
        Summary: 获取当前生效的路由规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowRuleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.rule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_federation_deployment(
        self,
        request: ldc_models.CreateFederationDeploymentRequest,
    ) -> ldc_models.CreateFederationDeploymentResponse:
        """
        Description: 创建FedDeployment
        Summary: 创建FedDeployment
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_federation_deployment_ex(request, headers, runtime)

    async def create_federation_deployment_async(
        self,
        request: ldc_models.CreateFederationDeploymentRequest,
    ) -> ldc_models.CreateFederationDeploymentResponse:
        """
        Description: 创建FedDeployment
        Summary: 创建FedDeployment
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_federation_deployment_ex_async(request, headers, runtime)

    def create_federation_deployment_ex(
        self,
        request: ldc_models.CreateFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationDeploymentResponse:
        """
        Description: 创建FedDeployment
        Summary: 创建FedDeployment
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.deployment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_federation_deployment_ex_async(
        self,
        request: ldc_models.CreateFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFederationDeploymentResponse:
        """
        Description: 创建FedDeployment
        Summary: 创建FedDeployment
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFederationDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.deployment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_loadbalancer(
        self,
        request: ldc_models.QueryLoadbalancerRequest,
    ) -> ldc_models.QueryLoadbalancerResponse:
        """
        Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
        Summary: 查询负责均衡实例。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_loadbalancer_ex(request, headers, runtime)

    async def query_loadbalancer_async(
        self,
        request: ldc_models.QueryLoadbalancerRequest,
    ) -> ldc_models.QueryLoadbalancerResponse:
        """
        Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
        Summary: 查询负责均衡实例。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_loadbalancer_ex_async(request, headers, runtime)

    def query_loadbalancer_ex(
        self,
        request: ldc_models.QueryLoadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryLoadbalancerResponse:
        """
        Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
        Summary: 查询负责均衡实例。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryLoadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.loadbalancer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_loadbalancer_ex_async(
        self,
        request: ldc_models.QueryLoadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryLoadbalancerResponse:
        """
        Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
        Summary: 查询负责均衡实例。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryLoadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.loadbalancer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_containerservice_service(
        self,
        request: ldc_models.ListContainerserviceServiceRequest,
    ) -> ldc_models.ListContainerserviceServiceResponse:
        """
        Description: 查询容器服务 Service 列表。
        Summary: 查询容器服务 Service 列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_containerservice_service_ex(request, headers, runtime)

    async def list_containerservice_service_async(
        self,
        request: ldc_models.ListContainerserviceServiceRequest,
    ) -> ldc_models.ListContainerserviceServiceResponse:
        """
        Description: 查询容器服务 Service 列表。
        Summary: 查询容器服务 Service 列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_containerservice_service_ex_async(request, headers, runtime)

    def list_containerservice_service_ex(
        self,
        request: ldc_models.ListContainerserviceServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerserviceServiceResponse:
        """
        Description: 查询容器服务 Service 列表。
        Summary: 查询容器服务 Service 列表。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerserviceServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.service.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_containerservice_service_ex_async(
        self,
        request: ldc_models.ListContainerserviceServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerserviceServiceResponse:
        """
        Description: 查询容器服务 Service 列表。
        Summary: 查询容器服务 Service 列表。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerserviceServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.service.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecar(
        self,
        request: ldc_models.ListSidecarRequest,
    ) -> ldc_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecar_ex(request, headers, runtime)

    async def list_sidecar_async(
        self,
        request: ldc_models.ListSidecarRequest,
    ) -> ldc_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecar_ex_async(request, headers, runtime)

    def list_sidecar_ex(
        self,
        request: ldc_models.ListSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSidecarResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecar_ex_async(
        self,
        request: ldc_models.ListSidecarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSidecarResponse:
        """
        Description: 查询sidecar元信息列表
        Summary: 查询sidecar元信息列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSidecarResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecar_template(
        self,
        request: ldc_models.ListSidecarTemplateRequest,
    ) -> ldc_models.ListSidecarTemplateResponse:
        """
        Description: list template
        Summary: list template
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecar_template_ex(request, headers, runtime)

    async def list_sidecar_template_async(
        self,
        request: ldc_models.ListSidecarTemplateRequest,
    ) -> ldc_models.ListSidecarTemplateResponse:
        """
        Description: list template
        Summary: list template
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecar_template_ex_async(request, headers, runtime)

    def list_sidecar_template_ex(
        self,
        request: ldc_models.ListSidecarTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSidecarTemplateResponse:
        """
        Description: list template
        Summary: list template
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSidecarTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecar_template_ex_async(
        self,
        request: ldc_models.ListSidecarTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSidecarTemplateResponse:
        """
        Description: list template
        Summary: list template
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSidecarTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sidecar_template(
        self,
        request: ldc_models.GetSidecarTemplateRequest,
    ) -> ldc_models.GetSidecarTemplateResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sidecar_template_ex(request, headers, runtime)

    async def get_sidecar_template_async(
        self,
        request: ldc_models.GetSidecarTemplateRequest,
    ) -> ldc_models.GetSidecarTemplateResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sidecar_template_ex_async(request, headers, runtime)

    def get_sidecar_template_ex(
        self,
        request: ldc_models.GetSidecarTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetSidecarTemplateResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 版本详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetSidecarTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.template.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sidecar_template_ex_async(
        self,
        request: ldc_models.GetSidecarTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetSidecarTemplateResponse:
        """
        Description: 获取sidecar版本详情
        Summary: 版本详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetSidecarTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.template.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_federation_deployment(
        self,
        request: ldc_models.GetFederationDeploymentRequest,
    ) -> ldc_models.GetFederationDeploymentResponse:
        """
        Description: 获取FedDeployment详情
        Summary: 获取FedDeployment详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_federation_deployment_ex(request, headers, runtime)

    async def get_federation_deployment_async(
        self,
        request: ldc_models.GetFederationDeploymentRequest,
    ) -> ldc_models.GetFederationDeploymentResponse:
        """
        Description: 获取FedDeployment详情
        Summary: 获取FedDeployment详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_federation_deployment_ex_async(request, headers, runtime)

    def get_federation_deployment_ex(
        self,
        request: ldc_models.GetFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationDeploymentResponse:
        """
        Description: 获取FedDeployment详情
        Summary: 获取FedDeployment详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.deployment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_federation_deployment_ex_async(
        self,
        request: ldc_models.GetFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFederationDeploymentResponse:
        """
        Description: 获取FedDeployment详情
        Summary: 获取FedDeployment详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFederationDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.deployment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_federation_deployment(
        self,
        request: ldc_models.ListFederationDeploymentRequest,
    ) -> ldc_models.ListFederationDeploymentResponse:
        """
        Description: 获取FederatedDeployment列表信息
        Summary: 获取FedDeploy列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_federation_deployment_ex(request, headers, runtime)

    async def list_federation_deployment_async(
        self,
        request: ldc_models.ListFederationDeploymentRequest,
    ) -> ldc_models.ListFederationDeploymentResponse:
        """
        Description: 获取FederatedDeployment列表信息
        Summary: 获取FedDeploy列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_federation_deployment_ex_async(request, headers, runtime)

    def list_federation_deployment_ex(
        self,
        request: ldc_models.ListFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationDeploymentResponse:
        """
        Description: 获取FederatedDeployment列表信息
        Summary: 获取FedDeploy列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.deployment.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_federation_deployment_ex_async(
        self,
        request: ldc_models.ListFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationDeploymentResponse:
        """
        Description: 获取FederatedDeployment列表信息
        Summary: 获取FedDeploy列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.deployment.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_federation_deployment(
        self,
        request: ldc_models.DeleteFederationDeploymentRequest,
    ) -> ldc_models.DeleteFederationDeploymentResponse:
        """
        Description: 删除FedDeployment
        Summary: 删除FedDeployment
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_federation_deployment_ex(request, headers, runtime)

    async def delete_federation_deployment_async(
        self,
        request: ldc_models.DeleteFederationDeploymentRequest,
    ) -> ldc_models.DeleteFederationDeploymentResponse:
        """
        Description: 删除FedDeployment
        Summary: 删除FedDeployment
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_federation_deployment_ex_async(request, headers, runtime)

    def delete_federation_deployment_ex(
        self,
        request: ldc_models.DeleteFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationDeploymentResponse:
        """
        Description: 删除FedDeployment
        Summary: 删除FedDeployment
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.deployment.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_federation_deployment_ex_async(
        self,
        request: ldc_models.DeleteFederationDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFederationDeploymentResponse:
        """
        Description: 删除FedDeployment
        Summary: 删除FedDeployment
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFederationDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.deployment.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_flow_defaultuid(
        self,
        request: ldc_models.SetFlowDefaultuidRequest,
    ) -> ldc_models.SetFlowDefaultuidResponse:
        """
        Description: 设置当前uid规则为默认uid规则
        Summary: 设置当前uid规则为默认uid规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_flow_defaultuid_ex(request, headers, runtime)

    async def set_flow_defaultuid_async(
        self,
        request: ldc_models.SetFlowDefaultuidRequest,
    ) -> ldc_models.SetFlowDefaultuidResponse:
        """
        Description: 设置当前uid规则为默认uid规则
        Summary: 设置当前uid规则为默认uid规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_flow_defaultuid_ex_async(request, headers, runtime)

    def set_flow_defaultuid_ex(
        self,
        request: ldc_models.SetFlowDefaultuidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SetFlowDefaultuidResponse:
        """
        Description: 设置当前uid规则为默认uid规则
        Summary: 设置当前uid规则为默认uid规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SetFlowDefaultuidResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.defaultuid.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_flow_defaultuid_ex_async(
        self,
        request: ldc_models.SetFlowDefaultuidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SetFlowDefaultuidResponse:
        """
        Description: 设置当前uid规则为默认uid规则
        Summary: 设置当前uid规则为默认uid规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SetFlowDefaultuidResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.defaultuid.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_opsplan_service(
        self,
        request: ldc_models.StartOpsplanServiceRequest,
    ) -> ldc_models.StartOpsplanServiceResponse:
        """
        Description: 开始执行应用服务发布|运维
        Summary: 开始执行应用服务发布|运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_opsplan_service_ex(request, headers, runtime)

    async def start_opsplan_service_async(
        self,
        request: ldc_models.StartOpsplanServiceRequest,
    ) -> ldc_models.StartOpsplanServiceResponse:
        """
        Description: 开始执行应用服务发布|运维
        Summary: 开始执行应用服务发布|运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_opsplan_service_ex_async(request, headers, runtime)

    def start_opsplan_service_ex(
        self,
        request: ldc_models.StartOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.StartOpsplanServiceResponse:
        """
        Description: 开始执行应用服务发布|运维
        Summary: 开始执行应用服务发布|运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.StartOpsplanServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.service.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_opsplan_service_ex_async(
        self,
        request: ldc_models.StartOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.StartOpsplanServiceResponse:
        """
        Description: 开始执行应用服务发布|运维
        Summary: 开始执行应用服务发布|运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.StartOpsplanServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.service.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_opsplan_servicerollback(
        self,
        request: ldc_models.ConfirmOpsplanServicerollbackRequest,
    ) -> ldc_models.ConfirmOpsplanServicerollbackResponse:
        """
        Description: 回滚确认应用服务
        Summary: 回滚确认应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_opsplan_servicerollback_ex(request, headers, runtime)

    async def confirm_opsplan_servicerollback_async(
        self,
        request: ldc_models.ConfirmOpsplanServicerollbackRequest,
    ) -> ldc_models.ConfirmOpsplanServicerollbackResponse:
        """
        Description: 回滚确认应用服务
        Summary: 回滚确认应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_opsplan_servicerollback_ex_async(request, headers, runtime)

    def confirm_opsplan_servicerollback_ex(
        self,
        request: ldc_models.ConfirmOpsplanServicerollbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ConfirmOpsplanServicerollbackResponse:
        """
        Description: 回滚确认应用服务
        Summary: 回滚确认应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ConfirmOpsplanServicerollbackResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.servicerollback.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_opsplan_servicerollback_ex_async(
        self,
        request: ldc_models.ConfirmOpsplanServicerollbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ConfirmOpsplanServicerollbackResponse:
        """
        Description: 回滚确认应用服务
        Summary: 回滚确认应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ConfirmOpsplanServicerollbackResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.servicerollback.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_opsplan_service(
        self,
        request: ldc_models.RetryOpsplanServiceRequest,
    ) -> ldc_models.RetryOpsplanServiceResponse:
        """
        Description: 重试发布服务
        Summary: 重试发布服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_opsplan_service_ex(request, headers, runtime)

    async def retry_opsplan_service_async(
        self,
        request: ldc_models.RetryOpsplanServiceRequest,
    ) -> ldc_models.RetryOpsplanServiceResponse:
        """
        Description: 重试发布服务
        Summary: 重试发布服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_opsplan_service_ex_async(request, headers, runtime)

    def retry_opsplan_service_ex(
        self,
        request: ldc_models.RetryOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RetryOpsplanServiceResponse:
        """
        Description: 重试发布服务
        Summary: 重试发布服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RetryOpsplanServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.service.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_opsplan_service_ex_async(
        self,
        request: ldc_models.RetryOpsplanServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RetryOpsplanServiceResponse:
        """
        Description: 重试发布服务
        Summary: 重试发布服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RetryOpsplanServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.service.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_elasticscene(
        self,
        request: ldc_models.QueryFlowElasticsceneRequest,
    ) -> ldc_models.QueryFlowElasticsceneResponse:
        """
        Description: 查询弹性场景
        Summary: 查询弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_elasticscene_ex(request, headers, runtime)

    async def query_flow_elasticscene_async(
        self,
        request: ldc_models.QueryFlowElasticsceneRequest,
    ) -> ldc_models.QueryFlowElasticsceneResponse:
        """
        Description: 查询弹性场景
        Summary: 查询弹性场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_elasticscene_ex_async(request, headers, runtime)

    def query_flow_elasticscene_ex(
        self,
        request: ldc_models.QueryFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticsceneResponse:
        """
        Description: 查询弹性场景
        Summary: 查询弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticsceneResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticscene.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_elasticscene_ex_async(
        self,
        request: ldc_models.QueryFlowElasticsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticsceneResponse:
        """
        Description: 查询弹性场景
        Summary: 查询弹性场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticsceneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticscene.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_elasticrule(
        self,
        request: ldc_models.QueryFlowElasticruleRequest,
    ) -> ldc_models.QueryFlowElasticruleResponse:
        """
        Description: 查询弹性规则
        Summary: 查询弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_elasticrule_ex(request, headers, runtime)

    async def query_flow_elasticrule_async(
        self,
        request: ldc_models.QueryFlowElasticruleRequest,
    ) -> ldc_models.QueryFlowElasticruleResponse:
        """
        Description: 查询弹性规则
        Summary: 查询弹性规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_elasticrule_ex_async(request, headers, runtime)

    def query_flow_elasticrule_ex(
        self,
        request: ldc_models.QueryFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticruleResponse:
        """
        Description: 查询弹性规则
        Summary: 查询弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticrule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_elasticrule_ex_async(
        self,
        request: ldc_models.QueryFlowElasticruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticruleResponse:
        """
        Description: 查询弹性规则
        Summary: 查询弹性规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticrule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_elasticsubrule(
        self,
        request: ldc_models.QueryFlowElasticsubruleRequest,
    ) -> ldc_models.QueryFlowElasticsubruleResponse:
        """
        Description: 查询弹性子规则
        Summary: 查询弹性子规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_elasticsubrule_ex(request, headers, runtime)

    async def query_flow_elasticsubrule_async(
        self,
        request: ldc_models.QueryFlowElasticsubruleRequest,
    ) -> ldc_models.QueryFlowElasticsubruleResponse:
        """
        Description: 查询弹性子规则
        Summary: 查询弹性子规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_elasticsubrule_ex_async(request, headers, runtime)

    def query_flow_elasticsubrule_ex(
        self,
        request: ldc_models.QueryFlowElasticsubruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticsubruleResponse:
        """
        Description: 查询弹性子规则
        Summary: 查询弹性子规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticsubruleResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticsubrule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_elasticsubrule_ex_async(
        self,
        request: ldc_models.QueryFlowElasticsubruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticsubruleResponse:
        """
        Description: 查询弹性子规则
        Summary: 查询弹性子规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticsubruleResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticsubrule.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_elasticvalue(
        self,
        request: ldc_models.QueryFlowElasticvalueRequest,
    ) -> ldc_models.QueryFlowElasticvalueResponse:
        """
        Description: 查询当前弹性状态
        Summary: 查询当前弹性状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_elasticvalue_ex(request, headers, runtime)

    async def query_flow_elasticvalue_async(
        self,
        request: ldc_models.QueryFlowElasticvalueRequest,
    ) -> ldc_models.QueryFlowElasticvalueResponse:
        """
        Description: 查询当前弹性状态
        Summary: 查询当前弹性状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_elasticvalue_ex_async(request, headers, runtime)

    def query_flow_elasticvalue_ex(
        self,
        request: ldc_models.QueryFlowElasticvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticvalueResponse:
        """
        Description: 查询当前弹性状态
        Summary: 查询当前弹性状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticvalueResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.elasticvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_elasticvalue_ex_async(
        self,
        request: ldc_models.QueryFlowElasticvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFlowElasticvalueResponse:
        """
        Description: 查询当前弹性状态
        Summary: 查询当前弹性状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFlowElasticvalueResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.elasticvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_system_switch(
        self,
        request: ldc_models.ListSystemSwitchRequest,
    ) -> ldc_models.ListSystemSwitchResponse:
        """
        Description: 开关配置
        Summary: 开关配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_system_switch_ex(request, headers, runtime)

    async def list_system_switch_async(
        self,
        request: ldc_models.ListSystemSwitchRequest,
    ) -> ldc_models.ListSystemSwitchResponse:
        """
        Description: 开关配置
        Summary: 开关配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_system_switch_ex_async(request, headers, runtime)

    def list_system_switch_ex(
        self,
        request: ldc_models.ListSystemSwitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSystemSwitchResponse:
        """
        Description: 开关配置
        Summary: 开关配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSystemSwitchResponse(),
            self.do_request('1.0', 'antcloud.ldc.system.switch.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_system_switch_ex_async(
        self,
        request: ldc_models.ListSystemSwitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSystemSwitchResponse:
        """
        Description: 开关配置
        Summary: 开关配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSystemSwitchResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.system.switch.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_buildpack_dockerfile(
        self,
        request: ldc_models.LoadBuildpackDockerfileRequest,
    ) -> ldc_models.LoadBuildpackDockerfileResponse:
        """
        Description: 获取云原生技术栈对应的Dockerfile
        Summary: 获取技术栈对应的Dockerfile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_buildpack_dockerfile_ex(request, headers, runtime)

    async def load_buildpack_dockerfile_async(
        self,
        request: ldc_models.LoadBuildpackDockerfileRequest,
    ) -> ldc_models.LoadBuildpackDockerfileResponse:
        """
        Description: 获取云原生技术栈对应的Dockerfile
        Summary: 获取技术栈对应的Dockerfile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_buildpack_dockerfile_ex_async(request, headers, runtime)

    def load_buildpack_dockerfile_ex(
        self,
        request: ldc_models.LoadBuildpackDockerfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.LoadBuildpackDockerfileResponse:
        """
        Description: 获取云原生技术栈对应的Dockerfile
        Summary: 获取技术栈对应的Dockerfile
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.LoadBuildpackDockerfileResponse(),
            self.do_request('1.0', 'antcloud.ldc.buildpack.dockerfile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_buildpack_dockerfile_ex_async(
        self,
        request: ldc_models.LoadBuildpackDockerfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.LoadBuildpackDockerfileResponse:
        """
        Description: 获取云原生技术栈对应的Dockerfile
        Summary: 获取技术栈对应的Dockerfile
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.LoadBuildpackDockerfileResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.buildpack.dockerfile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_opsplan_podoffline(
        self,
        request: ldc_models.CreateOpsplanPodofflineRequest,
    ) -> ldc_models.CreateOpsplanPodofflineResponse:
        """
        Description: 指定pod创建缩容运维单
        Summary: 创建pod缩容运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_opsplan_podoffline_ex(request, headers, runtime)

    async def create_opsplan_podoffline_async(
        self,
        request: ldc_models.CreateOpsplanPodofflineRequest,
    ) -> ldc_models.CreateOpsplanPodofflineResponse:
        """
        Description: 指定pod创建缩容运维单
        Summary: 创建pod缩容运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_opsplan_podoffline_ex_async(request, headers, runtime)

    def create_opsplan_podoffline_ex(
        self,
        request: ldc_models.CreateOpsplanPodofflineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateOpsplanPodofflineResponse:
        """
        Description: 指定pod创建缩容运维单
        Summary: 创建pod缩容运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateOpsplanPodofflineResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.podoffline.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_opsplan_podoffline_ex_async(
        self,
        request: ldc_models.CreateOpsplanPodofflineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateOpsplanPodofflineResponse:
        """
        Description: 指定pod创建缩容运维单
        Summary: 创建pod缩容运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateOpsplanPodofflineResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.podoffline.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dbflow_obtenant(
        self,
        request: ldc_models.CreateDbflowObtenantRequest,
    ) -> ldc_models.CreateDbflowObtenantResponse:
        """
        Description: 添加OB租户信息以及对应的uid分片段
        Summary: 添加OB租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dbflow_obtenant_ex(request, headers, runtime)

    async def create_dbflow_obtenant_async(
        self,
        request: ldc_models.CreateDbflowObtenantRequest,
    ) -> ldc_models.CreateDbflowObtenantResponse:
        """
        Description: 添加OB租户信息以及对应的uid分片段
        Summary: 添加OB租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dbflow_obtenant_ex_async(request, headers, runtime)

    def create_dbflow_obtenant_ex(
        self,
        request: ldc_models.CreateDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateDbflowObtenantResponse:
        """
        Description: 添加OB租户信息以及对应的uid分片段
        Summary: 添加OB租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateDbflowObtenantResponse(),
            self.do_request('1.0', 'antcloud.ldc.dbflow.obtenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dbflow_obtenant_ex_async(
        self,
        request: ldc_models.CreateDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateDbflowObtenantResponse:
        """
        Description: 添加OB租户信息以及对应的uid分片段
        Summary: 添加OB租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateDbflowObtenantResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.dbflow.obtenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dbflow_obtenant(
        self,
        request: ldc_models.QueryDbflowObtenantRequest,
    ) -> ldc_models.QueryDbflowObtenantResponse:
        """
        Description: 分页查询ob租户列表
        Summary: 分页查询ob租户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dbflow_obtenant_ex(request, headers, runtime)

    async def query_dbflow_obtenant_async(
        self,
        request: ldc_models.QueryDbflowObtenantRequest,
    ) -> ldc_models.QueryDbflowObtenantResponse:
        """
        Description: 分页查询ob租户列表
        Summary: 分页查询ob租户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dbflow_obtenant_ex_async(request, headers, runtime)

    def query_dbflow_obtenant_ex(
        self,
        request: ldc_models.QueryDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryDbflowObtenantResponse:
        """
        Description: 分页查询ob租户列表
        Summary: 分页查询ob租户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryDbflowObtenantResponse(),
            self.do_request('1.0', 'antcloud.ldc.dbflow.obtenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dbflow_obtenant_ex_async(
        self,
        request: ldc_models.QueryDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryDbflowObtenantResponse:
        """
        Description: 分页查询ob租户列表
        Summary: 分页查询ob租户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryDbflowObtenantResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.dbflow.obtenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dbflow_obtenant(
        self,
        request: ldc_models.UpdateDbflowObtenantRequest,
    ) -> ldc_models.UpdateDbflowObtenantResponse:
        """
        Description: 更新OB租户信息，包括uid映射
        Summary: 更新OB租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dbflow_obtenant_ex(request, headers, runtime)

    async def update_dbflow_obtenant_async(
        self,
        request: ldc_models.UpdateDbflowObtenantRequest,
    ) -> ldc_models.UpdateDbflowObtenantResponse:
        """
        Description: 更新OB租户信息，包括uid映射
        Summary: 更新OB租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dbflow_obtenant_ex_async(request, headers, runtime)

    def update_dbflow_obtenant_ex(
        self,
        request: ldc_models.UpdateDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateDbflowObtenantResponse:
        """
        Description: 更新OB租户信息，包括uid映射
        Summary: 更新OB租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateDbflowObtenantResponse(),
            self.do_request('1.0', 'antcloud.ldc.dbflow.obtenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dbflow_obtenant_ex_async(
        self,
        request: ldc_models.UpdateDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateDbflowObtenantResponse:
        """
        Description: 更新OB租户信息，包括uid映射
        Summary: 更新OB租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateDbflowObtenantResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.dbflow.obtenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dbflow_obtenant(
        self,
        request: ldc_models.DeleteDbflowObtenantRequest,
    ) -> ldc_models.DeleteDbflowObtenantResponse:
        """
        Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
        Summary: 删除PaaS中记录的OB租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dbflow_obtenant_ex(request, headers, runtime)

    async def delete_dbflow_obtenant_async(
        self,
        request: ldc_models.DeleteDbflowObtenantRequest,
    ) -> ldc_models.DeleteDbflowObtenantResponse:
        """
        Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
        Summary: 删除PaaS中记录的OB租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dbflow_obtenant_ex_async(request, headers, runtime)

    def delete_dbflow_obtenant_ex(
        self,
        request: ldc_models.DeleteDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteDbflowObtenantResponse:
        """
        Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
        Summary: 删除PaaS中记录的OB租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteDbflowObtenantResponse(),
            self.do_request('1.0', 'antcloud.ldc.dbflow.obtenant.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dbflow_obtenant_ex_async(
        self,
        request: ldc_models.DeleteDbflowObtenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteDbflowObtenantResponse:
        """
        Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
        Summary: 删除PaaS中记录的OB租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteDbflowObtenantResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.dbflow.obtenant.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_buildpack_nativetechstackversion(
        self,
        request: ldc_models.UpdateBuildpackNativetechstackversionRequest,
    ) -> ldc_models.UpdateBuildpackNativetechstackversionResponse:
        """
        Description: 更新原生技术栈版本信息（Dockerfile模板信息）
        Summary: 更新原生技术栈版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_buildpack_nativetechstackversion_ex(request, headers, runtime)

    async def update_buildpack_nativetechstackversion_async(
        self,
        request: ldc_models.UpdateBuildpackNativetechstackversionRequest,
    ) -> ldc_models.UpdateBuildpackNativetechstackversionResponse:
        """
        Description: 更新原生技术栈版本信息（Dockerfile模板信息）
        Summary: 更新原生技术栈版本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_buildpack_nativetechstackversion_ex_async(request, headers, runtime)

    def update_buildpack_nativetechstackversion_ex(
        self,
        request: ldc_models.UpdateBuildpackNativetechstackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateBuildpackNativetechstackversionResponse:
        """
        Description: 更新原生技术栈版本信息（Dockerfile模板信息）
        Summary: 更新原生技术栈版本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateBuildpackNativetechstackversionResponse(),
            self.do_request('1.0', 'antcloud.ldc.buildpack.nativetechstackversion.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_buildpack_nativetechstackversion_ex_async(
        self,
        request: ldc_models.UpdateBuildpackNativetechstackversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateBuildpackNativetechstackversionResponse:
        """
        Description: 更新原生技术栈版本信息（Dockerfile模板信息）
        Summary: 更新原生技术栈版本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateBuildpackNativetechstackversionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.buildpack.nativetechstackversion.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_workspacegroup_regions(
        self,
        request: ldc_models.ListWorkspacegroupRegionsRequest,
    ) -> ldc_models.ListWorkspacegroupRegionsResponse:
        """
        Description: 获取当前环境组的region列表信息
        Summary: 获取环境组region信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_workspacegroup_regions_ex(request, headers, runtime)

    async def list_workspacegroup_regions_async(
        self,
        request: ldc_models.ListWorkspacegroupRegionsRequest,
    ) -> ldc_models.ListWorkspacegroupRegionsResponse:
        """
        Description: 获取当前环境组的region列表信息
        Summary: 获取环境组region信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_workspacegroup_regions_ex_async(request, headers, runtime)

    def list_workspacegroup_regions_ex(
        self,
        request: ldc_models.ListWorkspacegroupRegionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListWorkspacegroupRegionsResponse:
        """
        Description: 获取当前环境组的region列表信息
        Summary: 获取环境组region信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListWorkspacegroupRegionsResponse(),
            self.do_request('1.0', 'antcloud.ldc.workspacegroup.regions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_workspacegroup_regions_ex_async(
        self,
        request: ldc_models.ListWorkspacegroupRegionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListWorkspacegroupRegionsResponse:
        """
        Description: 获取当前环境组的region列表信息
        Summary: 获取环境组region信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListWorkspacegroupRegionsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.workspacegroup.regions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_info(
        self,
        request: ldc_models.ListClusterInfoRequest,
    ) -> ldc_models.ListClusterInfoResponse:
        """
        Description: 获取集群列表信息
        Summary: 获取集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_info_ex(request, headers, runtime)

    async def list_cluster_info_async(
        self,
        request: ldc_models.ListClusterInfoRequest,
    ) -> ldc_models.ListClusterInfoResponse:
        """
        Description: 获取集群列表信息
        Summary: 获取集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_info_ex_async(request, headers, runtime)

    def list_cluster_info_ex(
        self,
        request: ldc_models.ListClusterInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterInfoResponse:
        """
        Description: 获取集群列表信息
        Summary: 获取集群列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterInfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.info.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_info_ex_async(
        self,
        request: ldc_models.ListClusterInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterInfoResponse:
        """
        Description: 获取集群列表信息
        Summary: 获取集群列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterInfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.info.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cluster_overview(
        self,
        request: ldc_models.ListClusterOverviewRequest,
    ) -> ldc_models.ListClusterOverviewResponse:
        """
        Description: 获取集群资源状态信息
        Summary: 获取集群资源状态信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cluster_overview_ex(request, headers, runtime)

    async def list_cluster_overview_async(
        self,
        request: ldc_models.ListClusterOverviewRequest,
    ) -> ldc_models.ListClusterOverviewResponse:
        """
        Description: 获取集群资源状态信息
        Summary: 获取集群资源状态信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cluster_overview_ex_async(request, headers, runtime)

    def list_cluster_overview_ex(
        self,
        request: ldc_models.ListClusterOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterOverviewResponse:
        """
        Description: 获取集群资源状态信息
        Summary: 获取集群资源状态信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterOverviewResponse(),
            self.do_request('1.0', 'antcloud.ldc.cluster.overview.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cluster_overview_ex_async(
        self,
        request: ldc_models.ListClusterOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListClusterOverviewResponse:
        """
        Description: 获取集群资源状态信息
        Summary: 获取集群资源状态信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListClusterOverviewResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cluster.overview.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_certificates(
        self,
        request: ldc_models.ListCertificatesRequest,
    ) -> ldc_models.ListCertificatesResponse:
        """
        Description: 查询ALB证书信息。
        Summary: 查询ALB证书信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_certificates_ex(request, headers, runtime)

    async def list_certificates_async(
        self,
        request: ldc_models.ListCertificatesRequest,
    ) -> ldc_models.ListCertificatesResponse:
        """
        Description: 查询ALB证书信息。
        Summary: 查询ALB证书信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_certificates_ex_async(request, headers, runtime)

    def list_certificates_ex(
        self,
        request: ldc_models.ListCertificatesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCertificatesResponse:
        """
        Description: 查询ALB证书信息。
        Summary: 查询ALB证书信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCertificatesResponse(),
            self.do_request('1.0', 'antcloud.ldc.certificates.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_certificates_ex_async(
        self,
        request: ldc_models.ListCertificatesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCertificatesResponse:
        """
        Description: 查询ALB证书信息。
        Summary: 查询ALB证书信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCertificatesResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.certificates.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_loadbalancer(
        self,
        request: ldc_models.ListLoadbalancerRequest,
    ) -> ldc_models.ListLoadbalancerResponse:
        """
        Description: 获取所有已被使用的lb iaas id。
        Summary: 获取所有已被使用的lb iaas id。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_loadbalancer_ex(request, headers, runtime)

    async def list_loadbalancer_async(
        self,
        request: ldc_models.ListLoadbalancerRequest,
    ) -> ldc_models.ListLoadbalancerResponse:
        """
        Description: 获取所有已被使用的lb iaas id。
        Summary: 获取所有已被使用的lb iaas id。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_loadbalancer_ex_async(request, headers, runtime)

    def list_loadbalancer_ex(
        self,
        request: ldc_models.ListLoadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListLoadbalancerResponse:
        """
        Description: 获取所有已被使用的lb iaas id。
        Summary: 获取所有已被使用的lb iaas id。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListLoadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.loadbalancer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_loadbalancer_ex_async(
        self,
        request: ldc_models.ListLoadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListLoadbalancerResponse:
        """
        Description: 获取所有已被使用的lb iaas id。
        Summary: 获取所有已被使用的lb iaas id。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListLoadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.loadbalancer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cloudconfig(
        self,
        request: ldc_models.GetCloudconfigRequest,
    ) -> ldc_models.GetCloudconfigResponse:
        """
        Description: 获取cloudconfig当前配置
        Summary: 获取cloudconfig当前配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cloudconfig_ex(request, headers, runtime)

    async def get_cloudconfig_async(
        self,
        request: ldc_models.GetCloudconfigRequest,
    ) -> ldc_models.GetCloudconfigResponse:
        """
        Description: 获取cloudconfig当前配置
        Summary: 获取cloudconfig当前配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cloudconfig_ex_async(request, headers, runtime)

    def get_cloudconfig_ex(
        self,
        request: ldc_models.GetCloudconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetCloudconfigResponse:
        """
        Description: 获取cloudconfig当前配置
        Summary: 获取cloudconfig当前配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetCloudconfigResponse(),
            self.do_request('1.0', 'antcloud.ldc.cloudconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cloudconfig_ex_async(
        self,
        request: ldc_models.GetCloudconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetCloudconfigResponse:
        """
        Description: 获取cloudconfig当前配置
        Summary: 获取cloudconfig当前配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetCloudconfigResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cloudconfig.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cloudconfig(
        self,
        request: ldc_models.UpdateCloudconfigRequest,
    ) -> ldc_models.UpdateCloudconfigResponse:
        """
        Description: 更新cloudconfig
        Summary: 更新cloudconfig
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cloudconfig_ex(request, headers, runtime)

    async def update_cloudconfig_async(
        self,
        request: ldc_models.UpdateCloudconfigRequest,
    ) -> ldc_models.UpdateCloudconfigResponse:
        """
        Description: 更新cloudconfig
        Summary: 更新cloudconfig
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cloudconfig_ex_async(request, headers, runtime)

    def update_cloudconfig_ex(
        self,
        request: ldc_models.UpdateCloudconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateCloudconfigResponse:
        """
        Description: 更新cloudconfig
        Summary: 更新cloudconfig
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateCloudconfigResponse(),
            self.do_request('1.0', 'antcloud.ldc.cloudconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cloudconfig_ex_async(
        self,
        request: ldc_models.UpdateCloudconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateCloudconfigResponse:
        """
        Description: 更新cloudconfig
        Summary: 更新cloudconfig
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateCloudconfigResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cloudconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cloudconfig_history(
        self,
        request: ldc_models.ListCloudconfigHistoryRequest,
    ) -> ldc_models.ListCloudconfigHistoryResponse:
        """
        Description: 版本历史
        Summary: 版本历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cloudconfig_history_ex(request, headers, runtime)

    async def list_cloudconfig_history_async(
        self,
        request: ldc_models.ListCloudconfigHistoryRequest,
    ) -> ldc_models.ListCloudconfigHistoryResponse:
        """
        Description: 版本历史
        Summary: 版本历史
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cloudconfig_history_ex_async(request, headers, runtime)

    def list_cloudconfig_history_ex(
        self,
        request: ldc_models.ListCloudconfigHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCloudconfigHistoryResponse:
        """
        Description: 版本历史
        Summary: 版本历史
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCloudconfigHistoryResponse(),
            self.do_request('1.0', 'antcloud.ldc.cloudconfig.history.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cloudconfig_history_ex_async(
        self,
        request: ldc_models.ListCloudconfigHistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListCloudconfigHistoryResponse:
        """
        Description: 版本历史
        Summary: 版本历史
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListCloudconfigHistoryResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.cloudconfig.history.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sidecar_operation(
        self,
        request: ldc_models.CreateSidecarOperationRequest,
    ) -> ldc_models.CreateSidecarOperationResponse:
        """
        Description: sidecar运维能力创建（接入|升级）
        Summary: sidecar运维创建（接入|升级）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sidecar_operation_ex(request, headers, runtime)

    async def create_sidecar_operation_async(
        self,
        request: ldc_models.CreateSidecarOperationRequest,
    ) -> ldc_models.CreateSidecarOperationResponse:
        """
        Description: sidecar运维能力创建（接入|升级）
        Summary: sidecar运维创建（接入|升级）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sidecar_operation_ex_async(request, headers, runtime)

    def create_sidecar_operation_ex(
        self,
        request: ldc_models.CreateSidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateSidecarOperationResponse:
        """
        Description: sidecar运维能力创建（接入|升级）
        Summary: sidecar运维创建（接入|升级）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateSidecarOperationResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.operation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sidecar_operation_ex_async(
        self,
        request: ldc_models.CreateSidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateSidecarOperationResponse:
        """
        Description: sidecar运维能力创建（接入|升级）
        Summary: sidecar运维创建（接入|升级）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateSidecarOperationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.operation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_sidecar_operation(
        self,
        request: ldc_models.RetrySidecarOperationRequest,
    ) -> ldc_models.RetrySidecarOperationResponse:
        """
        Description: 指定operationId重试sidecar运维
        Summary: 重试sidecar运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_sidecar_operation_ex(request, headers, runtime)

    async def retry_sidecar_operation_async(
        self,
        request: ldc_models.RetrySidecarOperationRequest,
    ) -> ldc_models.RetrySidecarOperationResponse:
        """
        Description: 指定operationId重试sidecar运维
        Summary: 重试sidecar运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_sidecar_operation_ex_async(request, headers, runtime)

    def retry_sidecar_operation_ex(
        self,
        request: ldc_models.RetrySidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RetrySidecarOperationResponse:
        """
        Description: 指定operationId重试sidecar运维
        Summary: 重试sidecar运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RetrySidecarOperationResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.operation.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_sidecar_operation_ex_async(
        self,
        request: ldc_models.RetrySidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RetrySidecarOperationResponse:
        """
        Description: 指定operationId重试sidecar运维
        Summary: 重试sidecar运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RetrySidecarOperationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.operation.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_sidecar_operation(
        self,
        request: ldc_models.CancelSidecarOperationRequest,
    ) -> ldc_models.CancelSidecarOperationResponse:
        """
        Description: 取消sidecar运维
        Summary: 取消sidecar运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_sidecar_operation_ex(request, headers, runtime)

    async def cancel_sidecar_operation_async(
        self,
        request: ldc_models.CancelSidecarOperationRequest,
    ) -> ldc_models.CancelSidecarOperationResponse:
        """
        Description: 取消sidecar运维
        Summary: 取消sidecar运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_sidecar_operation_ex_async(request, headers, runtime)

    def cancel_sidecar_operation_ex(
        self,
        request: ldc_models.CancelSidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelSidecarOperationResponse:
        """
        Description: 取消sidecar运维
        Summary: 取消sidecar运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelSidecarOperationResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.operation.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_sidecar_operation_ex_async(
        self,
        request: ldc_models.CancelSidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelSidecarOperationResponse:
        """
        Description: 取消sidecar运维
        Summary: 取消sidecar运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelSidecarOperationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.operation.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_service(
        self,
        request: ldc_models.UpdateServiceRequest,
    ) -> ldc_models.UpdateServiceResponse:
        """
        Description: create or update a service
        Summary: patch a service
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_service_ex(request, headers, runtime)

    async def update_service_async(
        self,
        request: ldc_models.UpdateServiceRequest,
    ) -> ldc_models.UpdateServiceResponse:
        """
        Description: create or update a service
        Summary: patch a service
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_service_ex_async(request, headers, runtime)

    def update_service_ex(
        self,
        request: ldc_models.UpdateServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateServiceResponse:
        """
        Description: create or update a service
        Summary: patch a service
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.service.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_service_ex_async(
        self,
        request: ldc_models.UpdateServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateServiceResponse:
        """
        Description: create or update a service
        Summary: patch a service
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.service.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_gpaas_release(
        self,
        request: ldc_models.CreateGpaasReleaseRequest,
    ) -> ldc_models.CreateGpaasReleaseResponse:
        """
        Description: 九州通过LHC创建发布单
        Summary: 九州通过LHC创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_gpaas_release_ex(request, headers, runtime)

    async def create_gpaas_release_async(
        self,
        request: ldc_models.CreateGpaasReleaseRequest,
    ) -> ldc_models.CreateGpaasReleaseResponse:
        """
        Description: 九州通过LHC创建发布单
        Summary: 九州通过LHC创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_gpaas_release_ex_async(request, headers, runtime)

    def create_gpaas_release_ex(
        self,
        request: ldc_models.CreateGpaasReleaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateGpaasReleaseResponse:
        """
        Description: 九州通过LHC创建发布单
        Summary: 九州通过LHC创建发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateGpaasReleaseResponse(),
            self.do_request('1.0', 'antcloud.ldc.gpaas.release.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_gpaas_release_ex_async(
        self,
        request: ldc_models.CreateGpaasReleaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateGpaasReleaseResponse:
        """
        Description: 九州通过LHC创建发布单
        Summary: 九州通过LHC创建发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateGpaasReleaseResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.gpaas.release.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sidecar_operation(
        self,
        request: ldc_models.QuerySidecarOperationRequest,
    ) -> ldc_models.QuerySidecarOperationResponse:
        """
        Description: 查询sidecar运维进度
        Summary: 查询sidecar运维进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sidecar_operation_ex(request, headers, runtime)

    async def query_sidecar_operation_async(
        self,
        request: ldc_models.QuerySidecarOperationRequest,
    ) -> ldc_models.QuerySidecarOperationResponse:
        """
        Description: 查询sidecar运维进度
        Summary: 查询sidecar运维进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sidecar_operation_ex_async(request, headers, runtime)

    def query_sidecar_operation_ex(
        self,
        request: ldc_models.QuerySidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecarOperationResponse:
        """
        Description: 查询sidecar运维进度
        Summary: 查询sidecar运维进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecarOperationResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecar.operation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sidecar_operation_ex_async(
        self,
        request: ldc_models.QuerySidecarOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecarOperationResponse:
        """
        Description: 查询sidecar运维进度
        Summary: 查询sidecar运维进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecarOperationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecar.operation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_kubernetes_resources(
        self,
        request: ldc_models.ListKubernetesResourcesRequest,
    ) -> ldc_models.ListKubernetesResourcesResponse:
        """
        Description: 查询Kubernetes原生资源
        Summary: 查询Kubernetes原生资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_kubernetes_resources_ex(request, headers, runtime)

    async def list_kubernetes_resources_async(
        self,
        request: ldc_models.ListKubernetesResourcesRequest,
    ) -> ldc_models.ListKubernetesResourcesResponse:
        """
        Description: 查询Kubernetes原生资源
        Summary: 查询Kubernetes原生资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_kubernetes_resources_ex_async(request, headers, runtime)

    def list_kubernetes_resources_ex(
        self,
        request: ldc_models.ListKubernetesResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListKubernetesResourcesResponse:
        """
        Description: 查询Kubernetes原生资源
        Summary: 查询Kubernetes原生资源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListKubernetesResourcesResponse(),
            self.do_request('1.0', 'antcloud.ldc.kubernetes.resources.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_kubernetes_resources_ex_async(
        self,
        request: ldc_models.ListKubernetesResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListKubernetesResourcesResponse:
        """
        Description: 查询Kubernetes原生资源
        Summary: 查询Kubernetes原生资源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListKubernetesResourcesResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.kubernetes.resources.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_releasepipelinestage_event(
        self,
        request: ldc_models.QueryReleasepipelinestageEventRequest,
    ) -> ldc_models.QueryReleasepipelinestageEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_releasepipelinestage_event_ex(request, headers, runtime)

    async def query_releasepipelinestage_event_async(
        self,
        request: ldc_models.QueryReleasepipelinestageEventRequest,
    ) -> ldc_models.QueryReleasepipelinestageEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_releasepipelinestage_event_ex_async(request, headers, runtime)

    def query_releasepipelinestage_event_ex(
        self,
        request: ldc_models.QueryReleasepipelinestageEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryReleasepipelinestageEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryReleasepipelinestageEventResponse(),
            self.do_request('1.0', 'antcloud.ldc.releasepipelinestage.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_releasepipelinestage_event_ex_async(
        self,
        request: ldc_models.QueryReleasepipelinestageEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryReleasepipelinestageEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryReleasepipelinestageEventResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.releasepipelinestage.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sls_projectname(
        self,
        request: ldc_models.GetSlsProjectnameRequest,
    ) -> ldc_models.GetSlsProjectnameResponse:
        """
        Description: 获取projectname
        Summary: 获取projectname
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sls_projectname_ex(request, headers, runtime)

    async def get_sls_projectname_async(
        self,
        request: ldc_models.GetSlsProjectnameRequest,
    ) -> ldc_models.GetSlsProjectnameResponse:
        """
        Description: 获取projectname
        Summary: 获取projectname
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sls_projectname_ex_async(request, headers, runtime)

    def get_sls_projectname_ex(
        self,
        request: ldc_models.GetSlsProjectnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetSlsProjectnameResponse:
        """
        Description: 获取projectname
        Summary: 获取projectname
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetSlsProjectnameResponse(),
            self.do_request('1.0', 'antcloud.ldc.sls.projectname.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sls_projectname_ex_async(
        self,
        request: ldc_models.GetSlsProjectnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetSlsProjectnameResponse:
        """
        Description: 获取projectname
        Summary: 获取projectname
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetSlsProjectnameResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sls.projectname.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_releasepipeline_event(
        self,
        request: ldc_models.QueryReleasepipelineEventRequest,
    ) -> ldc_models.QueryReleasepipelineEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_releasepipeline_event_ex(request, headers, runtime)

    async def query_releasepipeline_event_async(
        self,
        request: ldc_models.QueryReleasepipelineEventRequest,
    ) -> ldc_models.QueryReleasepipelineEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_releasepipeline_event_ex_async(request, headers, runtime)

    def query_releasepipeline_event_ex(
        self,
        request: ldc_models.QueryReleasepipelineEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryReleasepipelineEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryReleasepipelineEventResponse(),
            self.do_request('1.0', 'antcloud.ldc.releasepipeline.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_releasepipeline_event_ex_async(
        self,
        request: ldc_models.QueryReleasepipelineEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryReleasepipelineEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryReleasepipelineEventResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.releasepipeline.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pod_event(
        self,
        request: ldc_models.QueryPodEventRequest,
    ) -> ldc_models.QueryPodEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pod_event_ex(request, headers, runtime)

    async def query_pod_event_async(
        self,
        request: ldc_models.QueryPodEventRequest,
    ) -> ldc_models.QueryPodEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pod_event_ex_async(request, headers, runtime)

    def query_pod_event_ex(
        self,
        request: ldc_models.QueryPodEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryPodEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryPodEventResponse(),
            self.do_request('1.0', 'antcloud.ldc.pod.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pod_event_ex_async(
        self,
        request: ldc_models.QueryPodEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryPodEventResponse:
        """
        Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
        Summary: ldc发布单相关k8s事件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryPodEventResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.pod.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_service_processlog(
        self,
        request: ldc_models.QueryServiceProcesslogRequest,
    ) -> ldc_models.QueryServiceProcesslogResponse:
        """
        Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
        Summary: ldc发布单相关logs查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_service_processlog_ex(request, headers, runtime)

    async def query_service_processlog_async(
        self,
        request: ldc_models.QueryServiceProcesslogRequest,
    ) -> ldc_models.QueryServiceProcesslogResponse:
        """
        Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
        Summary: ldc发布单相关logs查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_service_processlog_ex_async(request, headers, runtime)

    def query_service_processlog_ex(
        self,
        request: ldc_models.QueryServiceProcesslogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryServiceProcesslogResponse:
        """
        Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
        Summary: ldc发布单相关logs查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryServiceProcesslogResponse(),
            self.do_request('1.0', 'antcloud.ldc.service.processlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_service_processlog_ex_async(
        self,
        request: ldc_models.QueryServiceProcesslogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryServiceProcesslogResponse:
        """
        Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
        Summary: ldc发布单相关logs查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryServiceProcesslogResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.service.processlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_service(
        self,
        request: ldc_models.QueryAppServiceRequest,
    ) -> ldc_models.QueryAppServiceResponse:
        """
        Description: 应用管理-在应用维度查询容器应用服务
        Summary: 应用管理-在应用维度查询容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_service_ex(request, headers, runtime)

    async def query_app_service_async(
        self,
        request: ldc_models.QueryAppServiceRequest,
    ) -> ldc_models.QueryAppServiceResponse:
        """
        Description: 应用管理-在应用维度查询容器应用服务
        Summary: 应用管理-在应用维度查询容器应用服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_service_ex_async(request, headers, runtime)

    def query_app_service_ex(
        self,
        request: ldc_models.QueryAppServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryAppServiceResponse:
        """
        Description: 应用管理-在应用维度查询容器应用服务
        Summary: 应用管理-在应用维度查询容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryAppServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.app.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_service_ex_async(
        self,
        request: ldc_models.QueryAppServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryAppServiceResponse:
        """
        Description: 应用管理-在应用维度查询容器应用服务
        Summary: 应用管理-在应用维度查询容器应用服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryAppServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.app.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_app_plan(
        self,
        request: ldc_models.QueryAppPlanRequest,
    ) -> ldc_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询容器应用服务发布单
        Summary: 应用管理-应用维度查询容器应用服务发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_app_plan_ex(request, headers, runtime)

    async def query_app_plan_async(
        self,
        request: ldc_models.QueryAppPlanRequest,
    ) -> ldc_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询容器应用服务发布单
        Summary: 应用管理-应用维度查询容器应用服务发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_app_plan_ex_async(request, headers, runtime)

    def query_app_plan_ex(
        self,
        request: ldc_models.QueryAppPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询容器应用服务发布单
        Summary: 应用管理-应用维度查询容器应用服务发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryAppPlanResponse(),
            self.do_request('1.0', 'antcloud.ldc.app.plan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_app_plan_ex_async(
        self,
        request: ldc_models.QueryAppPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryAppPlanResponse:
        """
        Description: 应用管理-应用维度查询容器应用服务发布单
        Summary: 应用管理-应用维度查询容器应用服务发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryAppPlanResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.app.plan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_unifiedaccessinstance(
        self,
        request: ldc_models.CreateUnifiedaccessinstanceRequest,
    ) -> ldc_models.CreateUnifiedaccessinstanceResponse:
        """
        Description: 创建统一接入实例，支持单元化和非单元化两种模式
        Summary: 创建统一接入实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_unifiedaccessinstance_ex(request, headers, runtime)

    async def create_unifiedaccessinstance_async(
        self,
        request: ldc_models.CreateUnifiedaccessinstanceRequest,
    ) -> ldc_models.CreateUnifiedaccessinstanceResponse:
        """
        Description: 创建统一接入实例，支持单元化和非单元化两种模式
        Summary: 创建统一接入实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_unifiedaccessinstance_ex_async(request, headers, runtime)

    def create_unifiedaccessinstance_ex(
        self,
        request: ldc_models.CreateUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateUnifiedaccessinstanceResponse:
        """
        Description: 创建统一接入实例，支持单元化和非单元化两种模式
        Summary: 创建统一接入实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateUnifiedaccessinstanceResponse(),
            self.do_request('1.0', 'antcloud.ldc.unifiedaccessinstance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_unifiedaccessinstance_ex_async(
        self,
        request: ldc_models.CreateUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateUnifiedaccessinstanceResponse:
        """
        Description: 创建统一接入实例，支持单元化和非单元化两种模式
        Summary: 创建统一接入实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateUnifiedaccessinstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unifiedaccessinstance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedaccessinstance(
        self,
        request: ldc_models.QueryUnifiedaccessinstanceRequest,
    ) -> ldc_models.QueryUnifiedaccessinstanceResponse:
        """
        Description: 查询统一接入实例列表信息
        Summary: 查询统一接入实例列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedaccessinstance_ex(request, headers, runtime)

    async def query_unifiedaccessinstance_async(
        self,
        request: ldc_models.QueryUnifiedaccessinstanceRequest,
    ) -> ldc_models.QueryUnifiedaccessinstanceResponse:
        """
        Description: 查询统一接入实例列表信息
        Summary: 查询统一接入实例列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedaccessinstance_ex_async(request, headers, runtime)

    def query_unifiedaccessinstance_ex(
        self,
        request: ldc_models.QueryUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryUnifiedaccessinstanceResponse:
        """
        Description: 查询统一接入实例列表信息
        Summary: 查询统一接入实例列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryUnifiedaccessinstanceResponse(),
            self.do_request('1.0', 'antcloud.ldc.unifiedaccessinstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedaccessinstance_ex_async(
        self,
        request: ldc_models.QueryUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryUnifiedaccessinstanceResponse:
        """
        Description: 查询统一接入实例列表信息
        Summary: 查询统一接入实例列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryUnifiedaccessinstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unifiedaccessinstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unifiedaccessinstance(
        self,
        request: ldc_models.GetUnifiedaccessinstanceRequest,
    ) -> ldc_models.GetUnifiedaccessinstanceResponse:
        """
        Description: 获取统一接入单个实例信息
        Summary: 获取统一接入单个实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unifiedaccessinstance_ex(request, headers, runtime)

    async def get_unifiedaccessinstance_async(
        self,
        request: ldc_models.GetUnifiedaccessinstanceRequest,
    ) -> ldc_models.GetUnifiedaccessinstanceResponse:
        """
        Description: 获取统一接入单个实例信息
        Summary: 获取统一接入单个实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unifiedaccessinstance_ex_async(request, headers, runtime)

    def get_unifiedaccessinstance_ex(
        self,
        request: ldc_models.GetUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnifiedaccessinstanceResponse:
        """
        Description: 获取统一接入单个实例信息
        Summary: 获取统一接入单个实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnifiedaccessinstanceResponse(),
            self.do_request('1.0', 'antcloud.ldc.unifiedaccessinstance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unifiedaccessinstance_ex_async(
        self,
        request: ldc_models.GetUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnifiedaccessinstanceResponse:
        """
        Description: 获取统一接入单个实例信息
        Summary: 获取统一接入单个实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnifiedaccessinstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unifiedaccessinstance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_unifiedaccessinstance(
        self,
        request: ldc_models.DeleteUnifiedaccessinstanceRequest,
    ) -> ldc_models.DeleteUnifiedaccessinstanceResponse:
        """
        Description: 删除统一接入实例
        Summary: 删除统一接入实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_unifiedaccessinstance_ex(request, headers, runtime)

    async def delete_unifiedaccessinstance_async(
        self,
        request: ldc_models.DeleteUnifiedaccessinstanceRequest,
    ) -> ldc_models.DeleteUnifiedaccessinstanceResponse:
        """
        Description: 删除统一接入实例
        Summary: 删除统一接入实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_unifiedaccessinstance_ex_async(request, headers, runtime)

    def delete_unifiedaccessinstance_ex(
        self,
        request: ldc_models.DeleteUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteUnifiedaccessinstanceResponse:
        """
        Description: 删除统一接入实例
        Summary: 删除统一接入实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteUnifiedaccessinstanceResponse(),
            self.do_request('1.0', 'antcloud.ldc.unifiedaccessinstance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_unifiedaccessinstance_ex_async(
        self,
        request: ldc_models.DeleteUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteUnifiedaccessinstanceResponse:
        """
        Description: 删除统一接入实例
        Summary: 删除统一接入实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteUnifiedaccessinstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unifiedaccessinstance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_unifiedaccessinstance(
        self,
        request: ldc_models.UpdateUnifiedaccessinstanceRequest,
    ) -> ldc_models.UpdateUnifiedaccessinstanceResponse:
        """
        Description: 更新统一接入实例信息
        Summary: 更新统一接入实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_unifiedaccessinstance_ex(request, headers, runtime)

    async def update_unifiedaccessinstance_async(
        self,
        request: ldc_models.UpdateUnifiedaccessinstanceRequest,
    ) -> ldc_models.UpdateUnifiedaccessinstanceResponse:
        """
        Description: 更新统一接入实例信息
        Summary: 更新统一接入实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_unifiedaccessinstance_ex_async(request, headers, runtime)

    def update_unifiedaccessinstance_ex(
        self,
        request: ldc_models.UpdateUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateUnifiedaccessinstanceResponse:
        """
        Description: 更新统一接入实例信息
        Summary: 更新统一接入实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateUnifiedaccessinstanceResponse(),
            self.do_request('1.0', 'antcloud.ldc.unifiedaccessinstance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_unifiedaccessinstance_ex_async(
        self,
        request: ldc_models.UpdateUnifiedaccessinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateUnifiedaccessinstanceResponse:
        """
        Description: 更新统一接入实例信息
        Summary: 更新统一接入实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateUnifiedaccessinstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unifiedaccessinstance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_unireleasespi(
        self,
        request: ldc_models.ExecUnireleasespiRequest,
    ) -> ldc_models.ExecUnireleasespiResponse:
        """
        Description: ldc 对接统一发布 openAPI
        Summary: ldc 对接统一发布 openAPI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_unireleasespi_ex(request, headers, runtime)

    async def exec_unireleasespi_async(
        self,
        request: ldc_models.ExecUnireleasespiRequest,
    ) -> ldc_models.ExecUnireleasespiResponse:
        """
        Description: ldc 对接统一发布 openAPI
        Summary: ldc 对接统一发布 openAPI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_unireleasespi_ex_async(request, headers, runtime)

    def exec_unireleasespi_ex(
        self,
        request: ldc_models.ExecUnireleasespiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecUnireleasespiResponse:
        """
        Description: ldc 对接统一发布 openAPI
        Summary: ldc 对接统一发布 openAPI
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecUnireleasespiResponse(),
            self.do_request('1.0', 'antcloud.ldc.unireleasespi.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_unireleasespi_ex_async(
        self,
        request: ldc_models.ExecUnireleasespiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecUnireleasespiResponse:
        """
        Description: ldc 对接统一发布 openAPI
        Summary: ldc 对接统一发布 openAPI
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecUnireleasespiResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unireleasespi.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_fedspannercluster(
        self,
        request: ldc_models.CreateFedspannerclusterRequest,
    ) -> ldc_models.CreateFedspannerclusterResponse:
        """
        Description: 用于创建 fed spanner 集群
        Summary: 创建 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_fedspannercluster_ex(request, headers, runtime)

    async def create_fedspannercluster_async(
        self,
        request: ldc_models.CreateFedspannerclusterRequest,
    ) -> ldc_models.CreateFedspannerclusterResponse:
        """
        Description: 用于创建 fed spanner 集群
        Summary: 创建 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_fedspannercluster_ex_async(request, headers, runtime)

    def create_fedspannercluster_ex(
        self,
        request: ldc_models.CreateFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFedspannerclusterResponse:
        """
        Description: 用于创建 fed spanner 集群
        Summary: 创建 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_fedspannercluster_ex_async(
        self,
        request: ldc_models.CreateFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFedspannerclusterResponse:
        """
        Description: 用于创建 fed spanner 集群
        Summary: 创建 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fedspannercluster(
        self,
        request: ldc_models.QueryFedspannerclusterRequest,
    ) -> ldc_models.QueryFedspannerclusterResponse:
        """
        Description: 查询联邦fed spanner 集群状态信息
        Summary: 查询 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fedspannercluster_ex(request, headers, runtime)

    async def query_fedspannercluster_async(
        self,
        request: ldc_models.QueryFedspannerclusterRequest,
    ) -> ldc_models.QueryFedspannerclusterResponse:
        """
        Description: 查询联邦fed spanner 集群状态信息
        Summary: 查询 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fedspannercluster_ex_async(request, headers, runtime)

    def query_fedspannercluster_ex(
        self,
        request: ldc_models.QueryFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFedspannerclusterResponse:
        """
        Description: 查询联邦fed spanner 集群状态信息
        Summary: 查询 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fedspannercluster_ex_async(
        self,
        request: ldc_models.QueryFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryFedspannerclusterResponse:
        """
        Description: 查询联邦fed spanner 集群状态信息
        Summary: 查询 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fedspannercluster(
        self,
        request: ldc_models.GetFedspannerclusterRequest,
    ) -> ldc_models.GetFedspannerclusterResponse:
        """
        Description: 通过fed集群 name 获取单个集群详细信息
        Summary: 获取单个fed spanner 集群信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fedspannercluster_ex(request, headers, runtime)

    async def get_fedspannercluster_async(
        self,
        request: ldc_models.GetFedspannerclusterRequest,
    ) -> ldc_models.GetFedspannerclusterResponse:
        """
        Description: 通过fed集群 name 获取单个集群详细信息
        Summary: 获取单个fed spanner 集群信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fedspannercluster_ex_async(request, headers, runtime)

    def get_fedspannercluster_ex(
        self,
        request: ldc_models.GetFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFedspannerclusterResponse:
        """
        Description: 通过fed集群 name 获取单个集群详细信息
        Summary: 获取单个fed spanner 集群信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fedspannercluster_ex_async(
        self,
        request: ldc_models.GetFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFedspannerclusterResponse:
        """
        Description: 通过fed集群 name 获取单个集群详细信息
        Summary: 获取单个fed spanner 集群信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_fedspannercluster(
        self,
        request: ldc_models.ListFedspannerclusterRequest,
    ) -> ldc_models.ListFedspannerclusterResponse:
        """
        Description: 展示所有联邦 spanner 集群
        Summary: 展示所有联邦 spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_fedspannercluster_ex(request, headers, runtime)

    async def list_fedspannercluster_async(
        self,
        request: ldc_models.ListFedspannerclusterRequest,
    ) -> ldc_models.ListFedspannerclusterResponse:
        """
        Description: 展示所有联邦 spanner 集群
        Summary: 展示所有联邦 spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_fedspannercluster_ex_async(request, headers, runtime)

    def list_fedspannercluster_ex(
        self,
        request: ldc_models.ListFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFedspannerclusterResponse:
        """
        Description: 展示所有联邦 spanner 集群
        Summary: 展示所有联邦 spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_fedspannercluster_ex_async(
        self,
        request: ldc_models.ListFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFedspannerclusterResponse:
        """
        Description: 展示所有联邦 spanner 集群
        Summary: 展示所有联邦 spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_fedspannercluster(
        self,
        request: ldc_models.DeleteFedspannerclusterRequest,
    ) -> ldc_models.DeleteFedspannerclusterResponse:
        """
        Description: 删除指定fed spanner集群
        Summary: 删除 联邦spanner集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_fedspannercluster_ex(request, headers, runtime)

    async def delete_fedspannercluster_async(
        self,
        request: ldc_models.DeleteFedspannerclusterRequest,
    ) -> ldc_models.DeleteFedspannerclusterResponse:
        """
        Description: 删除指定fed spanner集群
        Summary: 删除 联邦spanner集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_fedspannercluster_ex_async(request, headers, runtime)

    def delete_fedspannercluster_ex(
        self,
        request: ldc_models.DeleteFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFedspannerclusterResponse:
        """
        Description: 删除指定fed spanner集群
        Summary: 删除 联邦spanner集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_fedspannercluster_ex_async(
        self,
        request: ldc_models.DeleteFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFedspannerclusterResponse:
        """
        Description: 删除指定fed spanner集群
        Summary: 删除 联邦spanner集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_fedspannercluster(
        self,
        request: ldc_models.BatchdeleteFedspannerclusterRequest,
    ) -> ldc_models.BatchdeleteFedspannerclusterResponse:
        """
        Description: 批量删除指定集群
        Summary: 批量删除 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_fedspannercluster_ex(request, headers, runtime)

    async def batchdelete_fedspannercluster_async(
        self,
        request: ldc_models.BatchdeleteFedspannerclusterRequest,
    ) -> ldc_models.BatchdeleteFedspannerclusterResponse:
        """
        Description: 批量删除指定集群
        Summary: 批量删除 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_fedspannercluster_ex_async(request, headers, runtime)

    def batchdelete_fedspannercluster_ex(
        self,
        request: ldc_models.BatchdeleteFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.BatchdeleteFedspannerclusterResponse:
        """
        Description: 批量删除指定集群
        Summary: 批量删除 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.BatchdeleteFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_fedspannercluster_ex_async(
        self,
        request: ldc_models.BatchdeleteFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.BatchdeleteFedspannerclusterResponse:
        """
        Description: 批量删除指定集群
        Summary: 批量删除 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.BatchdeleteFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_fedspannercluster(
        self,
        request: ldc_models.UpdateFedspannerclusterRequest,
    ) -> ldc_models.UpdateFedspannerclusterResponse:
        """
        Description: 更新 fed spanner 集群
        Summary: 更新 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_fedspannercluster_ex(request, headers, runtime)

    async def update_fedspannercluster_async(
        self,
        request: ldc_models.UpdateFedspannerclusterRequest,
    ) -> ldc_models.UpdateFedspannerclusterResponse:
        """
        Description: 更新 fed spanner 集群
        Summary: 更新 fed spanner 集群
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_fedspannercluster_ex_async(request, headers, runtime)

    def update_fedspannercluster_ex(
        self,
        request: ldc_models.UpdateFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFedspannerclusterResponse:
        """
        Description: 更新 fed spanner 集群
        Summary: 更新 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFedspannerclusterResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_fedspannercluster_ex_async(
        self,
        request: ldc_models.UpdateFedspannerclusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFedspannerclusterResponse:
        """
        Description: 更新 fed spanner 集群
        Summary: 更新 fed spanner 集群
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFedspannerclusterResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_releaseplan(
        self,
        request: ldc_models.CreateReleaseplanRequest,
    ) -> ldc_models.CreateReleaseplanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_releaseplan_ex(request, headers, runtime)

    async def create_releaseplan_async(
        self,
        request: ldc_models.CreateReleaseplanRequest,
    ) -> ldc_models.CreateReleaseplanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_releaseplan_ex_async(request, headers, runtime)

    def create_releaseplan_ex(
        self,
        request: ldc_models.CreateReleaseplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateReleaseplanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateReleaseplanResponse(),
            self.do_request('1.0', 'antcloud.ldc.releaseplan.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_releaseplan_ex_async(
        self,
        request: ldc_models.CreateReleaseplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateReleaseplanResponse:
        """
        Description: 创建发布单
        Summary: 创建发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateReleaseplanResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.releaseplan.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_fedspannercluster_status(
        self,
        request: ldc_models.UpdateFedspannerclusterStatusRequest,
    ) -> ldc_models.UpdateFedspannerclusterStatusResponse:
        """
        Description: 需要指定fed spanner cluster name 和期望的合法状态
        Summary: 更新 spanner 集群 状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_fedspannercluster_status_ex(request, headers, runtime)

    async def update_fedspannercluster_status_async(
        self,
        request: ldc_models.UpdateFedspannerclusterStatusRequest,
    ) -> ldc_models.UpdateFedspannerclusterStatusResponse:
        """
        Description: 需要指定fed spanner cluster name 和期望的合法状态
        Summary: 更新 spanner 集群 状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_fedspannercluster_status_ex_async(request, headers, runtime)

    def update_fedspannercluster_status_ex(
        self,
        request: ldc_models.UpdateFedspannerclusterStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFedspannerclusterStatusResponse:
        """
        Description: 需要指定fed spanner cluster name 和期望的合法状态
        Summary: 更新 spanner 集群 状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFedspannerclusterStatusResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_fedspannercluster_status_ex_async(
        self,
        request: ldc_models.UpdateFedspannerclusterStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFedspannerclusterStatusResponse:
        """
        Description: 需要指定fed spanner cluster name 和期望的合法状态
        Summary: 更新 spanner 集群 状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFedspannerclusterStatusResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_antvip_domain(
        self,
        request: ldc_models.AddAntvipDomainRequest,
    ) -> ldc_models.AddAntvipDomainResponse:
        """
        Description: 添加antvip域名
        Summary: 添加antvip域名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_antvip_domain_ex(request, headers, runtime)

    async def add_antvip_domain_async(
        self,
        request: ldc_models.AddAntvipDomainRequest,
    ) -> ldc_models.AddAntvipDomainResponse:
        """
        Description: 添加antvip域名
        Summary: 添加antvip域名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_antvip_domain_ex_async(request, headers, runtime)

    def add_antvip_domain_ex(
        self,
        request: ldc_models.AddAntvipDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddAntvipDomainResponse:
        """
        Description: 添加antvip域名
        Summary: 添加antvip域名
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddAntvipDomainResponse(),
            self.do_request('1.0', 'antcloud.ldc.antvip.domain.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_antvip_domain_ex_async(
        self,
        request: ldc_models.AddAntvipDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddAntvipDomainResponse:
        """
        Description: 添加antvip域名
        Summary: 添加antvip域名
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddAntvipDomainResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.antvip.domain.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_antvip_domain(
        self,
        request: ldc_models.DeleteAntvipDomainRequest,
    ) -> ldc_models.DeleteAntvipDomainResponse:
        """
        Description: 删除antvip域名
        Summary: 删除antvip域名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_antvip_domain_ex(request, headers, runtime)

    async def delete_antvip_domain_async(
        self,
        request: ldc_models.DeleteAntvipDomainRequest,
    ) -> ldc_models.DeleteAntvipDomainResponse:
        """
        Description: 删除antvip域名
        Summary: 删除antvip域名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_antvip_domain_ex_async(request, headers, runtime)

    def delete_antvip_domain_ex(
        self,
        request: ldc_models.DeleteAntvipDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteAntvipDomainResponse:
        """
        Description: 删除antvip域名
        Summary: 删除antvip域名
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteAntvipDomainResponse(),
            self.do_request('1.0', 'antcloud.ldc.antvip.domain.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_antvip_domain_ex_async(
        self,
        request: ldc_models.DeleteAntvipDomainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteAntvipDomainResponse:
        """
        Description: 删除antvip域名
        Summary: 删除antvip域名
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteAntvipDomainResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.antvip.domain.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_containerservice_ingress(
        self,
        request: ldc_models.ListContainerserviceIngressRequest,
    ) -> ldc_models.ListContainerserviceIngressResponse:
        """
        Description: 查询容器服务 Ingress 列表。
        Summary: 查询容器服务 Ingress 列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_containerservice_ingress_ex(request, headers, runtime)

    async def list_containerservice_ingress_async(
        self,
        request: ldc_models.ListContainerserviceIngressRequest,
    ) -> ldc_models.ListContainerserviceIngressResponse:
        """
        Description: 查询容器服务 Ingress 列表。
        Summary: 查询容器服务 Ingress 列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_containerservice_ingress_ex_async(request, headers, runtime)

    def list_containerservice_ingress_ex(
        self,
        request: ldc_models.ListContainerserviceIngressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerserviceIngressResponse:
        """
        Description: 查询容器服务 Ingress 列表。
        Summary: 查询容器服务 Ingress 列表。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerserviceIngressResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.ingress.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_containerservice_ingress_ex_async(
        self,
        request: ldc_models.ListContainerserviceIngressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListContainerserviceIngressResponse:
        """
        Description: 查询容器服务 Ingress 列表。
        Summary: 查询容器服务 Ingress 列表。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListContainerserviceIngressResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.ingress.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_containerservice_operation(
        self,
        request: ldc_models.CreateContainerserviceOperationRequest,
    ) -> ldc_models.CreateContainerserviceOperationResponse:
        """
        Description: 创建一个运维单
        Summary: 创建一个运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_containerservice_operation_ex(request, headers, runtime)

    async def create_containerservice_operation_async(
        self,
        request: ldc_models.CreateContainerserviceOperationRequest,
    ) -> ldc_models.CreateContainerserviceOperationResponse:
        """
        Description: 创建一个运维单
        Summary: 创建一个运维单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_containerservice_operation_ex_async(request, headers, runtime)

    def create_containerservice_operation_ex(
        self,
        request: ldc_models.CreateContainerserviceOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateContainerserviceOperationResponse:
        """
        Description: 创建一个运维单
        Summary: 创建一个运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateContainerserviceOperationResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.operation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_containerservice_operation_ex_async(
        self,
        request: ldc_models.CreateContainerserviceOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateContainerserviceOperationResponse:
        """
        Description: 创建一个运维单
        Summary: 创建一个运维单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateContainerserviceOperationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.operation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_multicluster_events(
        self,
        request: ldc_models.ListMulticlusterEventsRequest,
    ) -> ldc_models.ListMulticlusterEventsResponse:
        """
        Description: 查询多集群k8s事件
        Summary: 查询多集群k8s event
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_multicluster_events_ex(request, headers, runtime)

    async def list_multicluster_events_async(
        self,
        request: ldc_models.ListMulticlusterEventsRequest,
    ) -> ldc_models.ListMulticlusterEventsResponse:
        """
        Description: 查询多集群k8s事件
        Summary: 查询多集群k8s event
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_multicluster_events_ex_async(request, headers, runtime)

    def list_multicluster_events_ex(
        self,
        request: ldc_models.ListMulticlusterEventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterEventsResponse:
        """
        Description: 查询多集群k8s事件
        Summary: 查询多集群k8s event
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterEventsResponse(),
            self.do_request('1.0', 'antcloud.ldc.multicluster.events.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_multicluster_events_ex_async(
        self,
        request: ldc_models.ListMulticlusterEventsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListMulticlusterEventsResponse:
        """
        Description: 查询多集群k8s事件
        Summary: 查询多集群k8s event
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListMulticlusterEventsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.multicluster.events.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_containerservice_deployment(
        self,
        request: ldc_models.ApplyContainerserviceDeploymentRequest,
    ) -> ldc_models.ApplyContainerserviceDeploymentResponse:
        """
        Description: 部署单提交审批申请
        Summary: 部署单提交审批申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_containerservice_deployment_ex(request, headers, runtime)

    async def apply_containerservice_deployment_async(
        self,
        request: ldc_models.ApplyContainerserviceDeploymentRequest,
    ) -> ldc_models.ApplyContainerserviceDeploymentResponse:
        """
        Description: 部署单提交审批申请
        Summary: 部署单提交审批申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_containerservice_deployment_ex_async(request, headers, runtime)

    def apply_containerservice_deployment_ex(
        self,
        request: ldc_models.ApplyContainerserviceDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ApplyContainerserviceDeploymentResponse:
        """
        Description: 部署单提交审批申请
        Summary: 部署单提交审批申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ApplyContainerserviceDeploymentResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.deployment.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_containerservice_deployment_ex_async(
        self,
        request: ldc_models.ApplyContainerserviceDeploymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ApplyContainerserviceDeploymentResponse:
        """
        Description: 部署单提交审批申请
        Summary: 部署单提交审批申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ApplyContainerserviceDeploymentResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.deployment.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ingress_trafficweight(
        self,
        request: ldc_models.UpdateIngressTrafficweightRequest,
    ) -> ldc_models.UpdateIngressTrafficweightResponse:
        """
        Description: 蓝绿发布调整Ingress流量权重比例
        Summary: 蓝绿发布调整Ingress流量权重比例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ingress_trafficweight_ex(request, headers, runtime)

    async def update_ingress_trafficweight_async(
        self,
        request: ldc_models.UpdateIngressTrafficweightRequest,
    ) -> ldc_models.UpdateIngressTrafficweightResponse:
        """
        Description: 蓝绿发布调整Ingress流量权重比例
        Summary: 蓝绿发布调整Ingress流量权重比例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ingress_trafficweight_ex_async(request, headers, runtime)

    def update_ingress_trafficweight_ex(
        self,
        request: ldc_models.UpdateIngressTrafficweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateIngressTrafficweightResponse:
        """
        Description: 蓝绿发布调整Ingress流量权重比例
        Summary: 蓝绿发布调整Ingress流量权重比例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateIngressTrafficweightResponse(),
            self.do_request('1.0', 'antcloud.ldc.ingress.trafficweight.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ingress_trafficweight_ex_async(
        self,
        request: ldc_models.UpdateIngressTrafficweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateIngressTrafficweightResponse:
        """
        Description: 蓝绿发布调整Ingress流量权重比例
        Summary: 蓝绿发布调整Ingress流量权重比例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateIngressTrafficweightResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.ingress.trafficweight.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_opsplan_bluedetail(
        self,
        request: ldc_models.GetOpsplanBluedetailRequest,
    ) -> ldc_models.GetOpsplanBluedetailResponse:
        """
        Description: 蓝绿发布查询单蓝区信息
        Summary: 蓝绿发布查询单蓝区信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_opsplan_bluedetail_ex(request, headers, runtime)

    async def get_opsplan_bluedetail_async(
        self,
        request: ldc_models.GetOpsplanBluedetailRequest,
    ) -> ldc_models.GetOpsplanBluedetailResponse:
        """
        Description: 蓝绿发布查询单蓝区信息
        Summary: 蓝绿发布查询单蓝区信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_opsplan_bluedetail_ex_async(request, headers, runtime)

    def get_opsplan_bluedetail_ex(
        self,
        request: ldc_models.GetOpsplanBluedetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetOpsplanBluedetailResponse:
        """
        Description: 蓝绿发布查询单蓝区信息
        Summary: 蓝绿发布查询单蓝区信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetOpsplanBluedetailResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.bluedetail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_opsplan_bluedetail_ex_async(
        self,
        request: ldc_models.GetOpsplanBluedetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetOpsplanBluedetailResponse:
        """
        Description: 蓝绿发布查询单蓝区信息
        Summary: 蓝绿发布查询单蓝区信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetOpsplanBluedetailResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.bluedetail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_ingress_trafficweight(
        self,
        request: ldc_models.ListIngressTrafficweightRequest,
    ) -> ldc_models.ListIngressTrafficweightResponse:
        """
        Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
        Summary: 蓝绿发布查询Ingress流量权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_ingress_trafficweight_ex(request, headers, runtime)

    async def list_ingress_trafficweight_async(
        self,
        request: ldc_models.ListIngressTrafficweightRequest,
    ) -> ldc_models.ListIngressTrafficweightResponse:
        """
        Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
        Summary: 蓝绿发布查询Ingress流量权重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_ingress_trafficweight_ex_async(request, headers, runtime)

    def list_ingress_trafficweight_ex(
        self,
        request: ldc_models.ListIngressTrafficweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListIngressTrafficweightResponse:
        """
        Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
        Summary: 蓝绿发布查询Ingress流量权重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListIngressTrafficweightResponse(),
            self.do_request('1.0', 'antcloud.ldc.ingress.trafficweight.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_ingress_trafficweight_ex_async(
        self,
        request: ldc_models.ListIngressTrafficweightRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListIngressTrafficweightResponse:
        """
        Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
        Summary: 蓝绿发布查询Ingress流量权重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListIngressTrafficweightResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.ingress.trafficweight.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_oamservice_applicationconfiguration(
        self,
        request: ldc_models.CreateOamserviceApplicationconfigurationRequest,
    ) -> ldc_models.CreateOamserviceApplicationconfigurationResponse:
        """
        Description: 基于OAM模型创建包含多应用服务的应用
        Summary: 创建包含多应用服务的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_oamservice_applicationconfiguration_ex(request, headers, runtime)

    async def create_oamservice_applicationconfiguration_async(
        self,
        request: ldc_models.CreateOamserviceApplicationconfigurationRequest,
    ) -> ldc_models.CreateOamserviceApplicationconfigurationResponse:
        """
        Description: 基于OAM模型创建包含多应用服务的应用
        Summary: 创建包含多应用服务的应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_oamservice_applicationconfiguration_ex_async(request, headers, runtime)

    def create_oamservice_applicationconfiguration_ex(
        self,
        request: ldc_models.CreateOamserviceApplicationconfigurationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateOamserviceApplicationconfigurationResponse:
        """
        Description: 基于OAM模型创建包含多应用服务的应用
        Summary: 创建包含多应用服务的应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateOamserviceApplicationconfigurationResponse(),
            self.do_request('1.0', 'antcloud.ldc.oamservice.applicationconfiguration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_oamservice_applicationconfiguration_ex_async(
        self,
        request: ldc_models.CreateOamserviceApplicationconfigurationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateOamserviceApplicationconfigurationResponse:
        """
        Description: 基于OAM模型创建包含多应用服务的应用
        Summary: 创建包含多应用服务的应用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateOamserviceApplicationconfigurationResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.oamservice.applicationconfiguration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_fedloadbalancer(
        self,
        request: ldc_models.CreateFedloadbalancerRequest,
    ) -> ldc_models.CreateFedloadbalancerResponse:
        """
        Description: 用于创建联邦负载均衡实例
        Summary: 创建联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_fedloadbalancer_ex(request, headers, runtime)

    async def create_fedloadbalancer_async(
        self,
        request: ldc_models.CreateFedloadbalancerRequest,
    ) -> ldc_models.CreateFedloadbalancerResponse:
        """
        Description: 用于创建联邦负载均衡实例
        Summary: 创建联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_fedloadbalancer_ex_async(request, headers, runtime)

    def create_fedloadbalancer_ex(
        self,
        request: ldc_models.CreateFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFedloadbalancerResponse:
        """
        Description: 用于创建联邦负载均衡实例
        Summary: 创建联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFedloadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedloadbalancer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_fedloadbalancer_ex_async(
        self,
        request: ldc_models.CreateFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateFedloadbalancerResponse:
        """
        Description: 用于创建联邦负载均衡实例
        Summary: 创建联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateFedloadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedloadbalancer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_fedloadbalancer(
        self,
        request: ldc_models.UpdateFedloadbalancerRequest,
    ) -> ldc_models.UpdateFedloadbalancerResponse:
        """
        Description: 更新联邦负载均衡实例
        Summary: 更新联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_fedloadbalancer_ex(request, headers, runtime)

    async def update_fedloadbalancer_async(
        self,
        request: ldc_models.UpdateFedloadbalancerRequest,
    ) -> ldc_models.UpdateFedloadbalancerResponse:
        """
        Description: 更新联邦负载均衡实例
        Summary: 更新联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_fedloadbalancer_ex_async(request, headers, runtime)

    def update_fedloadbalancer_ex(
        self,
        request: ldc_models.UpdateFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFedloadbalancerResponse:
        """
        Description: 更新联邦负载均衡实例
        Summary: 更新联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFedloadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedloadbalancer.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_fedloadbalancer_ex_async(
        self,
        request: ldc_models.UpdateFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateFedloadbalancerResponse:
        """
        Description: 更新联邦负载均衡实例
        Summary: 更新联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateFedloadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedloadbalancer.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_fedloadbalancer(
        self,
        request: ldc_models.ListFedloadbalancerRequest,
    ) -> ldc_models.ListFedloadbalancerResponse:
        """
        Description: list联邦负载均衡实例
        Summary: list联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_fedloadbalancer_ex(request, headers, runtime)

    async def list_fedloadbalancer_async(
        self,
        request: ldc_models.ListFedloadbalancerRequest,
    ) -> ldc_models.ListFedloadbalancerResponse:
        """
        Description: list联邦负载均衡实例
        Summary: list联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_fedloadbalancer_ex_async(request, headers, runtime)

    def list_fedloadbalancer_ex(
        self,
        request: ldc_models.ListFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFedloadbalancerResponse:
        """
        Description: list联邦负载均衡实例
        Summary: list联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFedloadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedloadbalancer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_fedloadbalancer_ex_async(
        self,
        request: ldc_models.ListFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFedloadbalancerResponse:
        """
        Description: list联邦负载均衡实例
        Summary: list联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFedloadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedloadbalancer.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_fedloadbalancer(
        self,
        request: ldc_models.DeleteFedloadbalancerRequest,
    ) -> ldc_models.DeleteFedloadbalancerResponse:
        """
        Description: 删除联邦负载均衡
        Summary: 删除联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_fedloadbalancer_ex(request, headers, runtime)

    async def delete_fedloadbalancer_async(
        self,
        request: ldc_models.DeleteFedloadbalancerRequest,
    ) -> ldc_models.DeleteFedloadbalancerResponse:
        """
        Description: 删除联邦负载均衡
        Summary: 删除联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_fedloadbalancer_ex_async(request, headers, runtime)

    def delete_fedloadbalancer_ex(
        self,
        request: ldc_models.DeleteFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFedloadbalancerResponse:
        """
        Description: 删除联邦负载均衡
        Summary: 删除联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFedloadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedloadbalancer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_fedloadbalancer_ex_async(
        self,
        request: ldc_models.DeleteFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteFedloadbalancerResponse:
        """
        Description: 删除联邦负载均衡
        Summary: 删除联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteFedloadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedloadbalancer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fedloadbalancer(
        self,
        request: ldc_models.GetFedloadbalancerRequest,
    ) -> ldc_models.GetFedloadbalancerResponse:
        """
        Description: 查询单个联邦负载均衡实例
        Summary: 查询单个联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fedloadbalancer_ex(request, headers, runtime)

    async def get_fedloadbalancer_async(
        self,
        request: ldc_models.GetFedloadbalancerRequest,
    ) -> ldc_models.GetFedloadbalancerResponse:
        """
        Description: 查询单个联邦负载均衡实例
        Summary: 查询单个联邦负载均衡实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fedloadbalancer_ex_async(request, headers, runtime)

    def get_fedloadbalancer_ex(
        self,
        request: ldc_models.GetFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFedloadbalancerResponse:
        """
        Description: 查询单个联邦负载均衡实例
        Summary: 查询单个联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFedloadbalancerResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedloadbalancer.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fedloadbalancer_ex_async(
        self,
        request: ldc_models.GetFedloadbalancerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetFedloadbalancerResponse:
        """
        Description: 查询单个联邦负载均衡实例
        Summary: 查询单个联邦负载均衡实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetFedloadbalancerResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedloadbalancer.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_unirelease_solution(
        self,
        request: ldc_models.ImportUnireleaseSolutionRequest,
    ) -> ldc_models.ImportUnireleaseSolutionResponse:
        """
        Description: 导入统一解决方案
        Summary: 导入统一解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_unirelease_solution_ex(request, headers, runtime)

    async def import_unirelease_solution_async(
        self,
        request: ldc_models.ImportUnireleaseSolutionRequest,
    ) -> ldc_models.ImportUnireleaseSolutionResponse:
        """
        Description: 导入统一解决方案
        Summary: 导入统一解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_unirelease_solution_ex_async(request, headers, runtime)

    def import_unirelease_solution_ex(
        self,
        request: ldc_models.ImportUnireleaseSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ImportUnireleaseSolutionResponse:
        """
        Description: 导入统一解决方案
        Summary: 导入统一解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ImportUnireleaseSolutionResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.solution.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_unirelease_solution_ex_async(
        self,
        request: ldc_models.ImportUnireleaseSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ImportUnireleaseSolutionResponse:
        """
        Description: 导入统一解决方案
        Summary: 导入统一解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ImportUnireleaseSolutionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.solution.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_unirelease_solutions(
        self,
        request: ldc_models.ListUnireleaseSolutionsRequest,
    ) -> ldc_models.ListUnireleaseSolutionsResponse:
        """
        Description: 查询解决方案列表
        Summary: 查询解决方案列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_unirelease_solutions_ex(request, headers, runtime)

    async def list_unirelease_solutions_async(
        self,
        request: ldc_models.ListUnireleaseSolutionsRequest,
    ) -> ldc_models.ListUnireleaseSolutionsResponse:
        """
        Description: 查询解决方案列表
        Summary: 查询解决方案列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_unirelease_solutions_ex_async(request, headers, runtime)

    def list_unirelease_solutions_ex(
        self,
        request: ldc_models.ListUnireleaseSolutionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListUnireleaseSolutionsResponse:
        """
        Description: 查询解决方案列表
        Summary: 查询解决方案列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListUnireleaseSolutionsResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.solutions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_unirelease_solutions_ex_async(
        self,
        request: ldc_models.ListUnireleaseSolutionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListUnireleaseSolutionsResponse:
        """
        Description: 查询解决方案列表
        Summary: 查询解决方案列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListUnireleaseSolutionsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.solutions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unirelease_solution(
        self,
        request: ldc_models.GetUnireleaseSolutionRequest,
    ) -> ldc_models.GetUnireleaseSolutionResponse:
        """
        Description: 查询解决方案发布详情
        Summary: 查询解决方案发布详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unirelease_solution_ex(request, headers, runtime)

    async def get_unirelease_solution_async(
        self,
        request: ldc_models.GetUnireleaseSolutionRequest,
    ) -> ldc_models.GetUnireleaseSolutionResponse:
        """
        Description: 查询解决方案发布详情
        Summary: 查询解决方案发布详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unirelease_solution_ex_async(request, headers, runtime)

    def get_unirelease_solution_ex(
        self,
        request: ldc_models.GetUnireleaseSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleaseSolutionResponse:
        """
        Description: 查询解决方案发布详情
        Summary: 查询解决方案发布详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleaseSolutionResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.solution.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unirelease_solution_ex_async(
        self,
        request: ldc_models.GetUnireleaseSolutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleaseSolutionResponse:
        """
        Description: 查询解决方案发布详情
        Summary: 查询解决方案发布详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleaseSolutionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.solution.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unirelease_pipeline(
        self,
        request: ldc_models.GetUnireleasePipelineRequest,
    ) -> ldc_models.GetUnireleasePipelineResponse:
        """
        Description: 查询解决方案发布状态
        Summary: 查询解决方案发布状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unirelease_pipeline_ex(request, headers, runtime)

    async def get_unirelease_pipeline_async(
        self,
        request: ldc_models.GetUnireleasePipelineRequest,
    ) -> ldc_models.GetUnireleasePipelineResponse:
        """
        Description: 查询解决方案发布状态
        Summary: 查询解决方案发布状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unirelease_pipeline_ex_async(request, headers, runtime)

    def get_unirelease_pipeline_ex(
        self,
        request: ldc_models.GetUnireleasePipelineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleasePipelineResponse:
        """
        Description: 查询解决方案发布状态
        Summary: 查询解决方案发布状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleasePipelineResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.pipeline.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unirelease_pipeline_ex_async(
        self,
        request: ldc_models.GetUnireleasePipelineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleasePipelineResponse:
        """
        Description: 查询解决方案发布状态
        Summary: 查询解决方案发布状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleasePipelineResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.pipeline.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_unirelease_pipelines(
        self,
        request: ldc_models.ExecUnireleasePipelinesRequest,
    ) -> ldc_models.ExecUnireleasePipelinesResponse:
        """
        Description: 执行机构发布单
        Summary: 执行机构发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_unirelease_pipelines_ex(request, headers, runtime)

    async def exec_unirelease_pipelines_async(
        self,
        request: ldc_models.ExecUnireleasePipelinesRequest,
    ) -> ldc_models.ExecUnireleasePipelinesResponse:
        """
        Description: 执行机构发布单
        Summary: 执行机构发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_unirelease_pipelines_ex_async(request, headers, runtime)

    def exec_unirelease_pipelines_ex(
        self,
        request: ldc_models.ExecUnireleasePipelinesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecUnireleasePipelinesResponse:
        """
        Description: 执行机构发布单
        Summary: 执行机构发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecUnireleasePipelinesResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.pipelines.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_unirelease_pipelines_ex_async(
        self,
        request: ldc_models.ExecUnireleasePipelinesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecUnireleasePipelinesResponse:
        """
        Description: 执行机构发布单
        Summary: 执行机构发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecUnireleasePipelinesResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.pipelines.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unirelease_tenants(
        self,
        request: ldc_models.GetUnireleaseTenantsRequest,
    ) -> ldc_models.GetUnireleaseTenantsResponse:
        """
        Description: 根据解决方案反查相关租户信息
        Summary: 根据解决方案反查相关租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unirelease_tenants_ex(request, headers, runtime)

    async def get_unirelease_tenants_async(
        self,
        request: ldc_models.GetUnireleaseTenantsRequest,
    ) -> ldc_models.GetUnireleaseTenantsResponse:
        """
        Description: 根据解决方案反查相关租户信息
        Summary: 根据解决方案反查相关租户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unirelease_tenants_ex_async(request, headers, runtime)

    def get_unirelease_tenants_ex(
        self,
        request: ldc_models.GetUnireleaseTenantsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleaseTenantsResponse:
        """
        Description: 根据解决方案反查相关租户信息
        Summary: 根据解决方案反查相关租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleaseTenantsResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.tenants.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unirelease_tenants_ex_async(
        self,
        request: ldc_models.GetUnireleaseTenantsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleaseTenantsResponse:
        """
        Description: 根据解决方案反查相关租户信息
        Summary: 根据解决方案反查相关租户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleaseTenantsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.tenants.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_containerservice_middlewareconfig(
        self,
        request: ldc_models.AddContainerserviceMiddlewareconfigRequest,
    ) -> ldc_models.AddContainerserviceMiddlewareconfigResponse:
        """
        Description: 添加中间接变更配置
        Summary: 添加中间接变更配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_containerservice_middlewareconfig_ex(request, headers, runtime)

    async def add_containerservice_middlewareconfig_async(
        self,
        request: ldc_models.AddContainerserviceMiddlewareconfigRequest,
    ) -> ldc_models.AddContainerserviceMiddlewareconfigResponse:
        """
        Description: 添加中间接变更配置
        Summary: 添加中间接变更配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_containerservice_middlewareconfig_ex_async(request, headers, runtime)

    def add_containerservice_middlewareconfig_ex(
        self,
        request: ldc_models.AddContainerserviceMiddlewareconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddContainerserviceMiddlewareconfigResponse:
        """
        Description: 添加中间接变更配置
        Summary: 添加中间接变更配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddContainerserviceMiddlewareconfigResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.middlewareconfig.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_containerservice_middlewareconfig_ex_async(
        self,
        request: ldc_models.AddContainerserviceMiddlewareconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddContainerserviceMiddlewareconfigResponse:
        """
        Description: 添加中间接变更配置
        Summary: 添加中间接变更配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddContainerserviceMiddlewareconfigResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.middlewareconfig.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_opsplan_stages(
        self,
        request: ldc_models.ExportOpsplanStagesRequest,
    ) -> ldc_models.ExportOpsplanStagesResponse:
        """
        Description: 根据选中的单元、pods计算以及分批策略计算分批结果
        Summary: 计算分批结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_opsplan_stages_ex(request, headers, runtime)

    async def export_opsplan_stages_async(
        self,
        request: ldc_models.ExportOpsplanStagesRequest,
    ) -> ldc_models.ExportOpsplanStagesResponse:
        """
        Description: 根据选中的单元、pods计算以及分批策略计算分批结果
        Summary: 计算分批结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_opsplan_stages_ex_async(request, headers, runtime)

    def export_opsplan_stages_ex(
        self,
        request: ldc_models.ExportOpsplanStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExportOpsplanStagesResponse:
        """
        Description: 根据选中的单元、pods计算以及分批策略计算分批结果
        Summary: 计算分批结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExportOpsplanStagesResponse(),
            self.do_request('1.0', 'antcloud.ldc.opsplan.stages.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_opsplan_stages_ex_async(
        self,
        request: ldc_models.ExportOpsplanStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExportOpsplanStagesResponse:
        """
        Description: 根据选中的单元、pods计算以及分批策略计算分批结果
        Summary: 计算分批结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExportOpsplanStagesResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.opsplan.stages.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_app_metainfo(
        self,
        request: ldc_models.DetailAppMetainfoRequest,
    ) -> ldc_models.DetailAppMetainfoResponse:
        """
        Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
        Summary: 应用（服务）基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_app_metainfo_ex(request, headers, runtime)

    async def detail_app_metainfo_async(
        self,
        request: ldc_models.DetailAppMetainfoRequest,
    ) -> ldc_models.DetailAppMetainfoResponse:
        """
        Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
        Summary: 应用（服务）基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_app_metainfo_ex_async(request, headers, runtime)

    def detail_app_metainfo_ex(
        self,
        request: ldc_models.DetailAppMetainfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DetailAppMetainfoResponse:
        """
        Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
        Summary: 应用（服务）基础信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DetailAppMetainfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.app.metainfo.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_app_metainfo_ex_async(
        self,
        request: ldc_models.DetailAppMetainfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DetailAppMetainfoResponse:
        """
        Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
        Summary: 应用（服务）基础信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DetailAppMetainfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.app.metainfo.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecarops(
        self,
        request: ldc_models.UpdateSidecaropsRequest,
    ) -> ldc_models.UpdateSidecaropsResponse:
        """
        Description: 为指定sidecar更新版本信息，如镜像，feature等
        Summary: 更新sidecar版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecarops_ex(request, headers, runtime)

    async def update_sidecarops_async(
        self,
        request: ldc_models.UpdateSidecaropsRequest,
    ) -> ldc_models.UpdateSidecaropsResponse:
        """
        Description: 为指定sidecar更新版本信息，如镜像，feature等
        Summary: 更新sidecar版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecarops_ex_async(request, headers, runtime)

    def update_sidecarops_ex(
        self,
        request: ldc_models.UpdateSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSidecaropsResponse:
        """
        Description: 为指定sidecar更新版本信息，如镜像，feature等
        Summary: 更新sidecar版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSidecaropsResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecarops_ex_async(
        self,
        request: ldc_models.UpdateSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSidecaropsResponse:
        """
        Description: 为指定sidecar更新版本信息，如镜像，feature等
        Summary: 更新sidecar版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSidecaropsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_containerservice_cellreplicas(
        self,
        request: ldc_models.CountContainerserviceCellreplicasRequest,
    ) -> ldc_models.CountContainerserviceCellreplicasResponse:
        """
        Description: 查询应用服务当前的部署单元，及部署副本数
        Summary: 查询应用服务当前的部署单元，及部署副本数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_containerservice_cellreplicas_ex(request, headers, runtime)

    async def count_containerservice_cellreplicas_async(
        self,
        request: ldc_models.CountContainerserviceCellreplicasRequest,
    ) -> ldc_models.CountContainerserviceCellreplicasResponse:
        """
        Description: 查询应用服务当前的部署单元，及部署副本数
        Summary: 查询应用服务当前的部署单元，及部署副本数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_containerservice_cellreplicas_ex_async(request, headers, runtime)

    def count_containerservice_cellreplicas_ex(
        self,
        request: ldc_models.CountContainerserviceCellreplicasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CountContainerserviceCellreplicasResponse:
        """
        Description: 查询应用服务当前的部署单元，及部署副本数
        Summary: 查询应用服务当前的部署单元，及部署副本数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CountContainerserviceCellreplicasResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.cellreplicas.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_containerservice_cellreplicas_ex_async(
        self,
        request: ldc_models.CountContainerserviceCellreplicasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CountContainerserviceCellreplicasResponse:
        """
        Description: 查询应用服务当前的部署单元，及部署副本数
        Summary: 查询应用服务当前的部署单元，及部署副本数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CountContainerserviceCellreplicasResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.cellreplicas.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sidecarops_template(
        self,
        request: ldc_models.ListSidecaropsTemplateRequest,
    ) -> ldc_models.ListSidecaropsTemplateResponse:
        """
        Description: 获取指定类型sidecar的template列表，最多20条。
        Summary: 获取sidecar的template列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sidecarops_template_ex(request, headers, runtime)

    async def list_sidecarops_template_async(
        self,
        request: ldc_models.ListSidecaropsTemplateRequest,
    ) -> ldc_models.ListSidecaropsTemplateResponse:
        """
        Description: 获取指定类型sidecar的template列表，最多20条。
        Summary: 获取sidecar的template列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sidecarops_template_ex_async(request, headers, runtime)

    def list_sidecarops_template_ex(
        self,
        request: ldc_models.ListSidecaropsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSidecaropsTemplateResponse:
        """
        Description: 获取指定类型sidecar的template列表，最多20条。
        Summary: 获取sidecar的template列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSidecaropsTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sidecarops_template_ex_async(
        self,
        request: ldc_models.ListSidecaropsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListSidecaropsTemplateResponse:
        """
        Description: 获取指定类型sidecar的template列表，最多20条。
        Summary: 获取sidecar的template列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListSidecaropsTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecarops_consistency(
        self,
        request: ldc_models.UpdateSidecaropsConsistencyRequest,
    ) -> ldc_models.UpdateSidecaropsConsistencyResponse:
        """
        Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
        Summary: 应用sidecar更新的一致性拉齐
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecarops_consistency_ex(request, headers, runtime)

    async def update_sidecarops_consistency_async(
        self,
        request: ldc_models.UpdateSidecaropsConsistencyRequest,
    ) -> ldc_models.UpdateSidecaropsConsistencyResponse:
        """
        Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
        Summary: 应用sidecar更新的一致性拉齐
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecarops_consistency_ex_async(request, headers, runtime)

    def update_sidecarops_consistency_ex(
        self,
        request: ldc_models.UpdateSidecaropsConsistencyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSidecaropsConsistencyResponse:
        """
        Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
        Summary: 应用sidecar更新的一致性拉齐
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSidecaropsConsistencyResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.consistency.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecarops_consistency_ex_async(
        self,
        request: ldc_models.UpdateSidecaropsConsistencyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSidecaropsConsistencyResponse:
        """
        Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
        Summary: 应用sidecar更新的一致性拉齐
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSidecaropsConsistencyResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.consistency.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_sidecarops(
        self,
        request: ldc_models.FinishSidecaropsRequest,
    ) -> ldc_models.FinishSidecaropsResponse:
        """
        Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
        Summary: 版本清理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_sidecarops_ex(request, headers, runtime)

    async def finish_sidecarops_async(
        self,
        request: ldc_models.FinishSidecaropsRequest,
    ) -> ldc_models.FinishSidecaropsResponse:
        """
        Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
        Summary: 版本清理
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_sidecarops_ex_async(request, headers, runtime)

    def finish_sidecarops_ex(
        self,
        request: ldc_models.FinishSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.FinishSidecaropsResponse:
        """
        Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
        Summary: 版本清理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.FinishSidecaropsResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_sidecarops_ex_async(
        self,
        request: ldc_models.FinishSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.FinishSidecaropsResponse:
        """
        Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
        Summary: 版本清理
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.FinishSidecaropsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sidecarops_state(
        self,
        request: ldc_models.QuerySidecaropsStateRequest,
    ) -> ldc_models.QuerySidecaropsStateResponse:
        """
        Description: 查询rd的当前状态。
        Summary: 查询更新状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sidecarops_state_ex(request, headers, runtime)

    async def query_sidecarops_state_async(
        self,
        request: ldc_models.QuerySidecaropsStateRequest,
    ) -> ldc_models.QuerySidecaropsStateResponse:
        """
        Description: 查询rd的当前状态。
        Summary: 查询更新状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sidecarops_state_ex_async(request, headers, runtime)

    def query_sidecarops_state_ex(
        self,
        request: ldc_models.QuerySidecaropsStateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecaropsStateResponse:
        """
        Description: 查询rd的当前状态。
        Summary: 查询更新状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecaropsStateResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.state.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sidecarops_state_ex_async(
        self,
        request: ldc_models.QuerySidecaropsStateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecaropsStateResponse:
        """
        Description: 查询rd的当前状态。
        Summary: 查询更新状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecaropsStateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.state.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sidecarops_template(
        self,
        request: ldc_models.AddSidecaropsTemplateRequest,
    ) -> ldc_models.AddSidecaropsTemplateResponse:
        """
        Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
        Summary: 添加sidecar基础模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sidecarops_template_ex(request, headers, runtime)

    async def add_sidecarops_template_async(
        self,
        request: ldc_models.AddSidecaropsTemplateRequest,
    ) -> ldc_models.AddSidecaropsTemplateResponse:
        """
        Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
        Summary: 添加sidecar基础模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sidecarops_template_ex_async(request, headers, runtime)

    def add_sidecarops_template_ex(
        self,
        request: ldc_models.AddSidecaropsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddSidecaropsTemplateResponse:
        """
        Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
        Summary: 添加sidecar基础模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddSidecaropsTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.template.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sidecarops_template_ex_async(
        self,
        request: ldc_models.AddSidecaropsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddSidecaropsTemplateResponse:
        """
        Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
        Summary: 添加sidecar基础模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddSidecaropsTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.template.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sidecarops_releaseinfo(
        self,
        request: ldc_models.QuerySidecaropsReleaseinfoRequest,
    ) -> ldc_models.QuerySidecaropsReleaseinfoResponse:
        """
        Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
        Summary: 查询应用发布sidecar升级的相关记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sidecarops_releaseinfo_ex(request, headers, runtime)

    async def query_sidecarops_releaseinfo_async(
        self,
        request: ldc_models.QuerySidecaropsReleaseinfoRequest,
    ) -> ldc_models.QuerySidecaropsReleaseinfoResponse:
        """
        Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
        Summary: 查询应用发布sidecar升级的相关记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sidecarops_releaseinfo_ex_async(request, headers, runtime)

    def query_sidecarops_releaseinfo_ex(
        self,
        request: ldc_models.QuerySidecaropsReleaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecaropsReleaseinfoResponse:
        """
        Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
        Summary: 查询应用发布sidecar升级的相关记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecaropsReleaseinfoResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.releaseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sidecarops_releaseinfo_ex_async(
        self,
        request: ldc_models.QuerySidecaropsReleaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecaropsReleaseinfoResponse:
        """
        Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
        Summary: 查询应用发布sidecar升级的相关记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecaropsReleaseinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.releaseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_sidecarops(
        self,
        request: ldc_models.InitSidecaropsRequest,
    ) -> ldc_models.InitSidecaropsResponse:
        """
        Description: 给存量应用服务注入sidecar，应用服务需已经创建
        Summary: 初始化注入sidecar
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_sidecarops_ex(request, headers, runtime)

    async def init_sidecarops_async(
        self,
        request: ldc_models.InitSidecaropsRequest,
    ) -> ldc_models.InitSidecaropsResponse:
        """
        Description: 给存量应用服务注入sidecar，应用服务需已经创建
        Summary: 初始化注入sidecar
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_sidecarops_ex_async(request, headers, runtime)

    def init_sidecarops_ex(
        self,
        request: ldc_models.InitSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.InitSidecaropsResponse:
        """
        Description: 给存量应用服务注入sidecar，应用服务需已经创建
        Summary: 初始化注入sidecar
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.InitSidecaropsResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_sidecarops_ex_async(
        self,
        request: ldc_models.InitSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.InitSidecaropsResponse:
        """
        Description: 给存量应用服务注入sidecar，应用服务需已经创建
        Summary: 初始化注入sidecar
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.InitSidecaropsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reboot_sidecarops(
        self,
        request: ldc_models.RebootSidecaropsRequest,
    ) -> ldc_models.RebootSidecaropsResponse:
        """
        Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
        Summary: 重启sidecar容器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reboot_sidecarops_ex(request, headers, runtime)

    async def reboot_sidecarops_async(
        self,
        request: ldc_models.RebootSidecaropsRequest,
    ) -> ldc_models.RebootSidecaropsResponse:
        """
        Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
        Summary: 重启sidecar容器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reboot_sidecarops_ex_async(request, headers, runtime)

    def reboot_sidecarops_ex(
        self,
        request: ldc_models.RebootSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RebootSidecaropsResponse:
        """
        Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
        Summary: 重启sidecar容器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RebootSidecaropsResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.reboot', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reboot_sidecarops_ex_async(
        self,
        request: ldc_models.RebootSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RebootSidecaropsResponse:
        """
        Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
        Summary: 重启sidecar容器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RebootSidecaropsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.reboot', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_containerservice_revision(
        self,
        request: ldc_models.DeleteContainerserviceRevisionRequest,
    ) -> ldc_models.DeleteContainerserviceRevisionResponse:
        """
        Description: 删除应用服务服务指定版本，lks1.25.0开始支持
        Summary: 删除指定版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_containerservice_revision_ex(request, headers, runtime)

    async def delete_containerservice_revision_async(
        self,
        request: ldc_models.DeleteContainerserviceRevisionRequest,
    ) -> ldc_models.DeleteContainerserviceRevisionResponse:
        """
        Description: 删除应用服务服务指定版本，lks1.25.0开始支持
        Summary: 删除指定版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_containerservice_revision_ex_async(request, headers, runtime)

    def delete_containerservice_revision_ex(
        self,
        request: ldc_models.DeleteContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteContainerserviceRevisionResponse:
        """
        Description: 删除应用服务服务指定版本，lks1.25.0开始支持
        Summary: 删除指定版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteContainerserviceRevisionResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revision.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_containerservice_revision_ex_async(
        self,
        request: ldc_models.DeleteContainerserviceRevisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteContainerserviceRevisionResponse:
        """
        Description: 删除应用服务服务指定版本，lks1.25.0开始支持
        Summary: 删除指定版本
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteContainerserviceRevisionResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revision.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_containerservice_apihook(
        self,
        request: ldc_models.ExecContainerserviceApihookRequest,
    ) -> ldc_models.ExecContainerserviceApihookResponse:
        """
        Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
        Summary: 手动执行 hook 配置的 api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_containerservice_apihook_ex(request, headers, runtime)

    async def exec_containerservice_apihook_async(
        self,
        request: ldc_models.ExecContainerserviceApihookRequest,
    ) -> ldc_models.ExecContainerserviceApihookResponse:
        """
        Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
        Summary: 手动执行 hook 配置的 api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_containerservice_apihook_ex_async(request, headers, runtime)

    def exec_containerservice_apihook_ex(
        self,
        request: ldc_models.ExecContainerserviceApihookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecContainerserviceApihookResponse:
        """
        Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
        Summary: 手动执行 hook 配置的 api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecContainerserviceApihookResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.apihook.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_containerservice_apihook_ex_async(
        self,
        request: ldc_models.ExecContainerserviceApihookRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecContainerserviceApihookResponse:
        """
        Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
        Summary: 手动执行 hook 配置的 api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecContainerserviceApihookResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.apihook.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sidecarops_allservices(
        self,
        request: ldc_models.QuerySidecaropsAllservicesRequest,
    ) -> ldc_models.QuerySidecaropsAllservicesResponse:
        """
        Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
        Summary: 获取已发布应用服务配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sidecarops_allservices_ex(request, headers, runtime)

    async def query_sidecarops_allservices_async(
        self,
        request: ldc_models.QuerySidecaropsAllservicesRequest,
    ) -> ldc_models.QuerySidecaropsAllservicesResponse:
        """
        Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
        Summary: 获取已发布应用服务配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sidecarops_allservices_ex_async(request, headers, runtime)

    def query_sidecarops_allservices_ex(
        self,
        request: ldc_models.QuerySidecaropsAllservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecaropsAllservicesResponse:
        """
        Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
        Summary: 获取已发布应用服务配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecaropsAllservicesResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.allservices.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sidecarops_allservices_ex_async(
        self,
        request: ldc_models.QuerySidecaropsAllservicesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QuerySidecaropsAllservicesResponse:
        """
        Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
        Summary: 获取已发布应用服务配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QuerySidecaropsAllservicesResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.allservices.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sidecarops_template(
        self,
        request: ldc_models.UpdateSidecaropsTemplateRequest,
    ) -> ldc_models.UpdateSidecaropsTemplateResponse:
        """
        Description: 可用于更新基线模板的作用范围等
        Summary: 更新sidecar基线模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sidecarops_template_ex(request, headers, runtime)

    async def update_sidecarops_template_async(
        self,
        request: ldc_models.UpdateSidecaropsTemplateRequest,
    ) -> ldc_models.UpdateSidecaropsTemplateResponse:
        """
        Description: 可用于更新基线模板的作用范围等
        Summary: 更新sidecar基线模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sidecarops_template_ex_async(request, headers, runtime)

    def update_sidecarops_template_ex(
        self,
        request: ldc_models.UpdateSidecaropsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSidecaropsTemplateResponse:
        """
        Description: 可用于更新基线模板的作用范围等
        Summary: 更新sidecar基线模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSidecaropsTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sidecarops_template_ex_async(
        self,
        request: ldc_models.UpdateSidecaropsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateSidecaropsTemplateResponse:
        """
        Description: 可用于更新基线模板的作用范围等
        Summary: 更新sidecar基线模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateSidecaropsTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_deployment_template(
        self,
        request: ldc_models.CreateDeploymentTemplateRequest,
    ) -> ldc_models.CreateDeploymentTemplateResponse:
        """
        Description: 创建发布模板
        Summary: 创建发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deployment_template_ex(request, headers, runtime)

    async def create_deployment_template_async(
        self,
        request: ldc_models.CreateDeploymentTemplateRequest,
    ) -> ldc_models.CreateDeploymentTemplateResponse:
        """
        Description: 创建发布模板
        Summary: 创建发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deployment_template_ex_async(request, headers, runtime)

    def create_deployment_template_ex(
        self,
        request: ldc_models.CreateDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateDeploymentTemplateResponse:
        """
        Description: 创建发布模板
        Summary: 创建发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateDeploymentTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deployment_template_ex_async(
        self,
        request: ldc_models.CreateDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CreateDeploymentTemplateResponse:
        """
        Description: 创建发布模板
        Summary: 创建发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CreateDeploymentTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unirelease_solutionfiles(
        self,
        request: ldc_models.QueryUnireleaseSolutionfilesRequest,
    ) -> ldc_models.QueryUnireleaseSolutionfilesResponse:
        """
        Description: 查询发布方案文件列表
        Summary: 查询发布方案文件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unirelease_solutionfiles_ex(request, headers, runtime)

    async def query_unirelease_solutionfiles_async(
        self,
        request: ldc_models.QueryUnireleaseSolutionfilesRequest,
    ) -> ldc_models.QueryUnireleaseSolutionfilesResponse:
        """
        Description: 查询发布方案文件列表
        Summary: 查询发布方案文件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unirelease_solutionfiles_ex_async(request, headers, runtime)

    def query_unirelease_solutionfiles_ex(
        self,
        request: ldc_models.QueryUnireleaseSolutionfilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryUnireleaseSolutionfilesResponse:
        """
        Description: 查询发布方案文件列表
        Summary: 查询发布方案文件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryUnireleaseSolutionfilesResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.solutionfiles.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unirelease_solutionfiles_ex_async(
        self,
        request: ldc_models.QueryUnireleaseSolutionfilesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryUnireleaseSolutionfilesResponse:
        """
        Description: 查询发布方案文件列表
        Summary: 查询发布方案文件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryUnireleaseSolutionfilesResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.solutionfiles.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unirelease_solutionfile(
        self,
        request: ldc_models.GetUnireleaseSolutionfileRequest,
    ) -> ldc_models.GetUnireleaseSolutionfileResponse:
        """
        Description: 获取发布方案文件内容
        Summary: 获取发布方案文件内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unirelease_solutionfile_ex(request, headers, runtime)

    async def get_unirelease_solutionfile_async(
        self,
        request: ldc_models.GetUnireleaseSolutionfileRequest,
    ) -> ldc_models.GetUnireleaseSolutionfileResponse:
        """
        Description: 获取发布方案文件内容
        Summary: 获取发布方案文件内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unirelease_solutionfile_ex_async(request, headers, runtime)

    def get_unirelease_solutionfile_ex(
        self,
        request: ldc_models.GetUnireleaseSolutionfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleaseSolutionfileResponse:
        """
        Description: 获取发布方案文件内容
        Summary: 获取发布方案文件内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleaseSolutionfileResponse(),
            self.do_request('1.0', 'antcloud.ldc.unirelease.solutionfile.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unirelease_solutionfile_ex_async(
        self,
        request: ldc_models.GetUnireleaseSolutionfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetUnireleaseSolutionfileResponse:
        """
        Description: 获取发布方案文件内容
        Summary: 获取发布方案文件内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetUnireleaseSolutionfileResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unirelease.solutionfile.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_deployment_template(
        self,
        request: ldc_models.UpdateDeploymentTemplateRequest,
    ) -> ldc_models.UpdateDeploymentTemplateResponse:
        """
        Description: 更新发布模板
        Summary: 更新发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_deployment_template_ex(request, headers, runtime)

    async def update_deployment_template_async(
        self,
        request: ldc_models.UpdateDeploymentTemplateRequest,
    ) -> ldc_models.UpdateDeploymentTemplateResponse:
        """
        Description: 更新发布模板
        Summary: 更新发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_deployment_template_ex_async(request, headers, runtime)

    def update_deployment_template_ex(
        self,
        request: ldc_models.UpdateDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateDeploymentTemplateResponse:
        """
        Description: 更新发布模板
        Summary: 更新发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateDeploymentTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_deployment_template_ex_async(
        self,
        request: ldc_models.UpdateDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateDeploymentTemplateResponse:
        """
        Description: 更新发布模板
        Summary: 更新发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateDeploymentTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_deployment_template(
        self,
        request: ldc_models.ListDeploymentTemplateRequest,
    ) -> ldc_models.ListDeploymentTemplateResponse:
        """
        Description: 查询发布模板
        Summary: 查询发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_deployment_template_ex(request, headers, runtime)

    async def list_deployment_template_async(
        self,
        request: ldc_models.ListDeploymentTemplateRequest,
    ) -> ldc_models.ListDeploymentTemplateResponse:
        """
        Description: 查询发布模板
        Summary: 查询发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_deployment_template_ex_async(request, headers, runtime)

    def list_deployment_template_ex(
        self,
        request: ldc_models.ListDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListDeploymentTemplateResponse:
        """
        Description: 查询发布模板
        Summary: 查询发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListDeploymentTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_deployment_template_ex_async(
        self,
        request: ldc_models.ListDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListDeploymentTemplateResponse:
        """
        Description: 查询发布模板
        Summary: 查询发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListDeploymentTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_deployment_template(
        self,
        request: ldc_models.DeleteDeploymentTemplateRequest,
    ) -> ldc_models.DeleteDeploymentTemplateResponse:
        """
        Description: 删除发布模板
        Summary: 删除发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_deployment_template_ex(request, headers, runtime)

    async def delete_deployment_template_async(
        self,
        request: ldc_models.DeleteDeploymentTemplateRequest,
    ) -> ldc_models.DeleteDeploymentTemplateResponse:
        """
        Description: 删除发布模板
        Summary: 删除发布模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_deployment_template_ex_async(request, headers, runtime)

    def delete_deployment_template_ex(
        self,
        request: ldc_models.DeleteDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteDeploymentTemplateResponse:
        """
        Description: 删除发布模板
        Summary: 删除发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteDeploymentTemplateResponse(),
            self.do_request('1.0', 'antcloud.ldc.deployment.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_deployment_template_ex_async(
        self,
        request: ldc_models.DeleteDeploymentTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DeleteDeploymentTemplateResponse:
        """
        Description: 删除发布模板
        Summary: 删除发布模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DeleteDeploymentTemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.deployment.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_emergency_plans(
        self,
        request: ldc_models.ListEmergencyPlansRequest,
    ) -> ldc_models.ListEmergencyPlansResponse:
        """
        Description: 查询守夜人预案列表
        Summary: 查询守夜人预案列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_emergency_plans_ex(request, headers, runtime)

    async def list_emergency_plans_async(
        self,
        request: ldc_models.ListEmergencyPlansRequest,
    ) -> ldc_models.ListEmergencyPlansResponse:
        """
        Description: 查询守夜人预案列表
        Summary: 查询守夜人预案列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_emergency_plans_ex_async(request, headers, runtime)

    def list_emergency_plans_ex(
        self,
        request: ldc_models.ListEmergencyPlansRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListEmergencyPlansResponse:
        """
        Description: 查询守夜人预案列表
        Summary: 查询守夜人预案列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListEmergencyPlansResponse(),
            self.do_request('1.0', 'antcloud.ldc.emergency.plans.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_emergency_plans_ex_async(
        self,
        request: ldc_models.ListEmergencyPlansRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListEmergencyPlansResponse:
        """
        Description: 查询守夜人预案列表
        Summary: 查询守夜人预案列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListEmergencyPlansResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.emergency.plans.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_grayreleaseconfig(
        self,
        request: ldc_models.UpdateContainerserviceGrayreleaseconfigRequest,
    ) -> ldc_models.UpdateContainerserviceGrayreleaseconfigResponse:
        """
        Description: 修改灰度发布规则
        Summary: 修改灰度发布规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_grayreleaseconfig_ex(request, headers, runtime)

    async def update_containerservice_grayreleaseconfig_async(
        self,
        request: ldc_models.UpdateContainerserviceGrayreleaseconfigRequest,
    ) -> ldc_models.UpdateContainerserviceGrayreleaseconfigResponse:
        """
        Description: 修改灰度发布规则
        Summary: 修改灰度发布规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_grayreleaseconfig_ex_async(request, headers, runtime)

    def update_containerservice_grayreleaseconfig_ex(
        self,
        request: ldc_models.UpdateContainerserviceGrayreleaseconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceGrayreleaseconfigResponse:
        """
        Description: 修改灰度发布规则
        Summary: 修改灰度发布规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceGrayreleaseconfigResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.grayreleaseconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_grayreleaseconfig_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceGrayreleaseconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceGrayreleaseconfigResponse:
        """
        Description: 修改灰度发布规则
        Summary: 修改灰度发布规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceGrayreleaseconfigResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.grayreleaseconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_containerserivce_grayreleaseconfig(
        self,
        request: ldc_models.QueryContainerserivceGrayreleaseconfigRequest,
    ) -> ldc_models.QueryContainerserivceGrayreleaseconfigResponse:
        """
        Description: 查询（灰度）发布单的灰度发布配置
        Summary: 查询（灰度）发布单的灰度发布配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_containerserivce_grayreleaseconfig_ex(request, headers, runtime)

    async def query_containerserivce_grayreleaseconfig_async(
        self,
        request: ldc_models.QueryContainerserivceGrayreleaseconfigRequest,
    ) -> ldc_models.QueryContainerserivceGrayreleaseconfigResponse:
        """
        Description: 查询（灰度）发布单的灰度发布配置
        Summary: 查询（灰度）发布单的灰度发布配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_containerserivce_grayreleaseconfig_ex_async(request, headers, runtime)

    def query_containerserivce_grayreleaseconfig_ex(
        self,
        request: ldc_models.QueryContainerserivceGrayreleaseconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserivceGrayreleaseconfigResponse:
        """
        Description: 查询（灰度）发布单的灰度发布配置
        Summary: 查询（灰度）发布单的灰度发布配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserivceGrayreleaseconfigResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerserivce.grayreleaseconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_containerserivce_grayreleaseconfig_ex_async(
        self,
        request: ldc_models.QueryContainerserivceGrayreleaseconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryContainerserivceGrayreleaseconfigResponse:
        """
        Description: 查询（灰度）发布单的灰度发布配置
        Summary: 查询（灰度）发布单的灰度发布配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryContainerserivceGrayreleaseconfigResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerserivce.grayreleaseconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_containerservice_revisiondiff(
        self,
        request: ldc_models.DetailContainerserviceRevisiondiffRequest,
    ) -> ldc_models.DetailContainerserviceRevisiondiffResponse:
        """
        Description: 应用服务版本diff
        Summary: 应用服务版本diff
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_containerservice_revisiondiff_ex(request, headers, runtime)

    async def detail_containerservice_revisiondiff_async(
        self,
        request: ldc_models.DetailContainerserviceRevisiondiffRequest,
    ) -> ldc_models.DetailContainerserviceRevisiondiffResponse:
        """
        Description: 应用服务版本diff
        Summary: 应用服务版本diff
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_containerservice_revisiondiff_ex_async(request, headers, runtime)

    def detail_containerservice_revisiondiff_ex(
        self,
        request: ldc_models.DetailContainerserviceRevisiondiffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DetailContainerserviceRevisiondiffResponse:
        """
        Description: 应用服务版本diff
        Summary: 应用服务版本diff
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DetailContainerserviceRevisiondiffResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.revisiondiff.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_containerservice_revisiondiff_ex_async(
        self,
        request: ldc_models.DetailContainerserviceRevisiondiffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.DetailContainerserviceRevisiondiffResponse:
        """
        Description: 应用服务版本diff
        Summary: 应用服务版本diff
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.DetailContainerserviceRevisiondiffResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.revisiondiff.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_sidecarops(
        self,
        request: ldc_models.RollbackSidecaropsRequest,
    ) -> ldc_models.RollbackSidecaropsResponse:
        """
        Description: 可用于huanyu升级sidecar时，回滚变更单的执行，回滚到执行前的sidecar状态。
        Summary: 回滚sidecar升级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_sidecarops_ex(request, headers, runtime)

    async def rollback_sidecarops_async(
        self,
        request: ldc_models.RollbackSidecaropsRequest,
    ) -> ldc_models.RollbackSidecaropsResponse:
        """
        Description: 可用于huanyu升级sidecar时，回滚变更单的执行，回滚到执行前的sidecar状态。
        Summary: 回滚sidecar升级
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_sidecarops_ex_async(request, headers, runtime)

    def rollback_sidecarops_ex(
        self,
        request: ldc_models.RollbackSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RollbackSidecaropsResponse:
        """
        Description: 可用于huanyu升级sidecar时，回滚变更单的执行，回滚到执行前的sidecar状态。
        Summary: 回滚sidecar升级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RollbackSidecaropsResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_sidecarops_ex_async(
        self,
        request: ldc_models.RollbackSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.RollbackSidecaropsResponse:
        """
        Description: 可用于huanyu升级sidecar时，回滚变更单的执行，回滚到执行前的sidecar状态。
        Summary: 回滚sidecar升级
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.RollbackSidecaropsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_appops(
        self,
        request: ldc_models.ConfirmAppopsRequest,
    ) -> ldc_models.ConfirmAppopsResponse:
        """
        Description: 对一个运维操作中所有暂停的分组进行确认操作，lks1.36.0才支持
        Summary: 确认运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_appops_ex(request, headers, runtime)

    async def confirm_appops_async(
        self,
        request: ldc_models.ConfirmAppopsRequest,
    ) -> ldc_models.ConfirmAppopsResponse:
        """
        Description: 对一个运维操作中所有暂停的分组进行确认操作，lks1.36.0才支持
        Summary: 确认运维
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_appops_ex_async(request, headers, runtime)

    def confirm_appops_ex(
        self,
        request: ldc_models.ConfirmAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ConfirmAppopsResponse:
        """
        Description: 对一个运维操作中所有暂停的分组进行确认操作，lks1.36.0才支持
        Summary: 确认运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ConfirmAppopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.appops.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_appops_ex_async(
        self,
        request: ldc_models.ConfirmAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ConfirmAppopsResponse:
        """
        Description: 对一个运维操作中所有暂停的分组进行确认操作，lks1.36.0才支持
        Summary: 确认运维
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ConfirmAppopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.appops.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_containerservice_logpv(
        self,
        request: ldc_models.AddContainerserviceLogpvRequest,
    ) -> ldc_models.AddContainerserviceLogpvResponse:
        """
        Description: 批量添加应用服务PVC和init Container
        Summary: 批量添加应用服务PVC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_containerservice_logpv_ex(request, headers, runtime)

    async def add_containerservice_logpv_async(
        self,
        request: ldc_models.AddContainerserviceLogpvRequest,
    ) -> ldc_models.AddContainerserviceLogpvResponse:
        """
        Description: 批量添加应用服务PVC和init Container
        Summary: 批量添加应用服务PVC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_containerservice_logpv_ex_async(request, headers, runtime)

    def add_containerservice_logpv_ex(
        self,
        request: ldc_models.AddContainerserviceLogpvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddContainerserviceLogpvResponse:
        """
        Description: 批量添加应用服务PVC和init Container
        Summary: 批量添加应用服务PVC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddContainerserviceLogpvResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.logpv.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_containerservice_logpv_ex_async(
        self,
        request: ldc_models.AddContainerserviceLogpvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddContainerserviceLogpvResponse:
        """
        Description: 批量添加应用服务PVC和init Container
        Summary: 批量添加应用服务PVC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddContainerserviceLogpvResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.logpv.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_federation_service(
        self,
        request: ldc_models.ListFederationServiceRequest,
    ) -> ldc_models.ListFederationServiceResponse:
        """
        Description: 查询 fedservice 列表
        Summary: 查询 fedservice 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_federation_service_ex(request, headers, runtime)

    async def list_federation_service_async(
        self,
        request: ldc_models.ListFederationServiceRequest,
    ) -> ldc_models.ListFederationServiceResponse:
        """
        Description: 查询 fedservice 列表
        Summary: 查询 fedservice 列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_federation_service_ex_async(request, headers, runtime)

    def list_federation_service_ex(
        self,
        request: ldc_models.ListFederationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationServiceResponse:
        """
        Description: 查询 fedservice 列表
        Summary: 查询 fedservice 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationServiceResponse(),
            self.do_request('1.0', 'antcloud.ldc.federation.service.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_federation_service_ex_async(
        self,
        request: ldc_models.ListFederationServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFederationServiceResponse:
        """
        Description: 查询 fedservice 列表
        Summary: 查询 fedservice 列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFederationServiceResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.federation.service.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_operationlog(
        self,
        request: ldc_models.QueryOperationlogRequest,
    ) -> ldc_models.QueryOperationlogResponse:
        """
        Description: 查询操作日志OpenAPI
        Summary: 查询操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_operationlog_ex(request, headers, runtime)

    async def query_operationlog_async(
        self,
        request: ldc_models.QueryOperationlogRequest,
    ) -> ldc_models.QueryOperationlogResponse:
        """
        Description: 查询操作日志OpenAPI
        Summary: 查询操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_operationlog_ex_async(request, headers, runtime)

    def query_operationlog_ex(
        self,
        request: ldc_models.QueryOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOperationlogResponse:
        """
        Description: 查询操作日志OpenAPI
        Summary: 查询操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOperationlogResponse(),
            self.do_request('1.0', 'antcloud.ldc.operationlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_operationlog_ex_async(
        self,
        request: ldc_models.QueryOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.QueryOperationlogResponse:
        """
        Description: 查询操作日志OpenAPI
        Summary: 查询操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.QueryOperationlogResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.operationlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_emergency_plans(
        self,
        request: ldc_models.GetEmergencyPlansRequest,
    ) -> ldc_models.GetEmergencyPlansResponse:
        """
        Description: 查询守夜人预案详情
        Summary: 查询守夜人预案详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_emergency_plans_ex(request, headers, runtime)

    async def get_emergency_plans_async(
        self,
        request: ldc_models.GetEmergencyPlansRequest,
    ) -> ldc_models.GetEmergencyPlansResponse:
        """
        Description: 查询守夜人预案详情
        Summary: 查询守夜人预案详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_emergency_plans_ex_async(request, headers, runtime)

    def get_emergency_plans_ex(
        self,
        request: ldc_models.GetEmergencyPlansRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetEmergencyPlansResponse:
        """
        Description: 查询守夜人预案详情
        Summary: 查询守夜人预案详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetEmergencyPlansResponse(),
            self.do_request('1.0', 'antcloud.ldc.emergency.plans.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_emergency_plans_ex_async(
        self,
        request: ldc_models.GetEmergencyPlansRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.GetEmergencyPlansResponse:
        """
        Description: 查询守夜人预案详情
        Summary: 查询守夜人预案详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.GetEmergencyPlansResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.emergency.plans.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_fedspannercluster_zone(
        self,
        request: ldc_models.AddFedspannerclusterZoneRequest,
    ) -> ldc_models.AddFedspannerclusterZoneResponse:
        """
        Description: 为统一接入集群添加可用区，必须是当前工作空间组下已规划的可用区。待添加的可用区内应有规划用于部署spanner容器的节点资源。
        Summary: 为统一接入集群添加可用区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_fedspannercluster_zone_ex(request, headers, runtime)

    async def add_fedspannercluster_zone_async(
        self,
        request: ldc_models.AddFedspannerclusterZoneRequest,
    ) -> ldc_models.AddFedspannerclusterZoneResponse:
        """
        Description: 为统一接入集群添加可用区，必须是当前工作空间组下已规划的可用区。待添加的可用区内应有规划用于部署spanner容器的节点资源。
        Summary: 为统一接入集群添加可用区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_fedspannercluster_zone_ex_async(request, headers, runtime)

    def add_fedspannercluster_zone_ex(
        self,
        request: ldc_models.AddFedspannerclusterZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddFedspannerclusterZoneResponse:
        """
        Description: 为统一接入集群添加可用区，必须是当前工作空间组下已规划的可用区。待添加的可用区内应有规划用于部署spanner容器的节点资源。
        Summary: 为统一接入集群添加可用区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddFedspannerclusterZoneResponse(),
            self.do_request('1.0', 'antcloud.ldc.fedspannercluster.zone.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_fedspannercluster_zone_ex_async(
        self,
        request: ldc_models.AddFedspannerclusterZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddFedspannerclusterZoneResponse:
        """
        Description: 为统一接入集群添加可用区，必须是当前工作空间组下已规划的可用区。待添加的可用区内应有规划用于部署spanner容器的节点资源。
        Summary: 为统一接入集群添加可用区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddFedspannerclusterZoneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.fedspannercluster.zone.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_unifiedaccessinstance_zone(
        self,
        request: ldc_models.AddUnifiedaccessinstanceZoneRequest,
    ) -> ldc_models.AddUnifiedaccessinstanceZoneResponse:
        """
        Description: 为统一接入实例添加可用区，统一接入实例在新增的可用区内将增加一个入口（LVS VIP）。
        Summary: 为统一接入实例添加可用区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_unifiedaccessinstance_zone_ex(request, headers, runtime)

    async def add_unifiedaccessinstance_zone_async(
        self,
        request: ldc_models.AddUnifiedaccessinstanceZoneRequest,
    ) -> ldc_models.AddUnifiedaccessinstanceZoneResponse:
        """
        Description: 为统一接入实例添加可用区，统一接入实例在新增的可用区内将增加一个入口（LVS VIP）。
        Summary: 为统一接入实例添加可用区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_unifiedaccessinstance_zone_ex_async(request, headers, runtime)

    def add_unifiedaccessinstance_zone_ex(
        self,
        request: ldc_models.AddUnifiedaccessinstanceZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddUnifiedaccessinstanceZoneResponse:
        """
        Description: 为统一接入实例添加可用区，统一接入实例在新增的可用区内将增加一个入口（LVS VIP）。
        Summary: 为统一接入实例添加可用区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddUnifiedaccessinstanceZoneResponse(),
            self.do_request('1.0', 'antcloud.ldc.unifiedaccessinstance.zone.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_unifiedaccessinstance_zone_ex_async(
        self,
        request: ldc_models.AddUnifiedaccessinstanceZoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.AddUnifiedaccessinstanceZoneResponse:
        """
        Description: 为统一接入实例添加可用区，统一接入实例在新增的可用区内将增加一个入口（LVS VIP）。
        Summary: 为统一接入实例添加可用区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.AddUnifiedaccessinstanceZoneResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.unifiedaccessinstance.zone.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_containerservice_jsonpatch(
        self,
        request: ldc_models.UpdateContainerserviceJsonpatchRequest,
    ) -> ldc_models.UpdateContainerserviceJsonpatchResponse:
        """
        Description: 通过jsonpatch方式更新应用服务配置
        Summary: 通过jsonpatch更新应用服务配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_containerservice_jsonpatch_ex(request, headers, runtime)

    async def update_containerservice_jsonpatch_async(
        self,
        request: ldc_models.UpdateContainerserviceJsonpatchRequest,
    ) -> ldc_models.UpdateContainerserviceJsonpatchResponse:
        """
        Description: 通过jsonpatch方式更新应用服务配置
        Summary: 通过jsonpatch更新应用服务配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_containerservice_jsonpatch_ex_async(request, headers, runtime)

    def update_containerservice_jsonpatch_ex(
        self,
        request: ldc_models.UpdateContainerserviceJsonpatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceJsonpatchResponse:
        """
        Description: 通过jsonpatch方式更新应用服务配置
        Summary: 通过jsonpatch更新应用服务配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceJsonpatchResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.jsonpatch.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_containerservice_jsonpatch_ex_async(
        self,
        request: ldc_models.UpdateContainerserviceJsonpatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.UpdateContainerserviceJsonpatchResponse:
        """
        Description: 通过jsonpatch方式更新应用服务配置
        Summary: 通过jsonpatch更新应用服务配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.UpdateContainerserviceJsonpatchResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.jsonpatch.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_flow_cellgroup(
        self,
        request: ldc_models.ListFlowCellgroupRequest,
    ) -> ldc_models.ListFlowCellgroupResponse:
        """
        Description: 查看单元化管理中的单元组元数据
        Summary: 查看单元化管理中的单元组元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_flow_cellgroup_ex(request, headers, runtime)

    async def list_flow_cellgroup_async(
        self,
        request: ldc_models.ListFlowCellgroupRequest,
    ) -> ldc_models.ListFlowCellgroupResponse:
        """
        Description: 查看单元化管理中的单元组元数据
        Summary: 查看单元化管理中的单元组元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_flow_cellgroup_ex_async(request, headers, runtime)

    def list_flow_cellgroup_ex(
        self,
        request: ldc_models.ListFlowCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFlowCellgroupResponse:
        """
        Description: 查看单元化管理中的单元组元数据
        Summary: 查看单元化管理中的单元组元数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFlowCellgroupResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.cellgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_flow_cellgroup_ex_async(
        self,
        request: ldc_models.ListFlowCellgroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ListFlowCellgroupResponse:
        """
        Description: 查看单元化管理中的单元组元数据
        Summary: 查看单元化管理中的单元组元数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ListFlowCellgroupResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.cellgroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_flow_metadata(
        self,
        request: ldc_models.SyncFlowMetadataRequest,
    ) -> ldc_models.SyncFlowMetadataResponse:
        """
        Description: 同步单元化元数据
        Summary: 同步单元化元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_flow_metadata_ex(request, headers, runtime)

    async def sync_flow_metadata_async(
        self,
        request: ldc_models.SyncFlowMetadataRequest,
    ) -> ldc_models.SyncFlowMetadataResponse:
        """
        Description: 同步单元化元数据
        Summary: 同步单元化元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_flow_metadata_ex_async(request, headers, runtime)

    def sync_flow_metadata_ex(
        self,
        request: ldc_models.SyncFlowMetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SyncFlowMetadataResponse:
        """
        Description: 同步单元化元数据
        Summary: 同步单元化元数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SyncFlowMetadataResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.metadata.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_flow_metadata_ex_async(
        self,
        request: ldc_models.SyncFlowMetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.SyncFlowMetadataResponse:
        """
        Description: 同步单元化元数据
        Summary: 同步单元化元数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.SyncFlowMetadataResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.metadata.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_containerservice_conflictops(
        self,
        request: ldc_models.CheckContainerserviceConflictopsRequest,
    ) -> ldc_models.CheckContainerserviceConflictopsResponse:
        """
        Description: 发布单冲突检测
        Summary: 发布单冲突检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_containerservice_conflictops_ex(request, headers, runtime)

    async def check_containerservice_conflictops_async(
        self,
        request: ldc_models.CheckContainerserviceConflictopsRequest,
    ) -> ldc_models.CheckContainerserviceConflictopsResponse:
        """
        Description: 发布单冲突检测
        Summary: 发布单冲突检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_containerservice_conflictops_ex_async(request, headers, runtime)

    def check_containerservice_conflictops_ex(
        self,
        request: ldc_models.CheckContainerserviceConflictopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CheckContainerserviceConflictopsResponse:
        """
        Description: 发布单冲突检测
        Summary: 发布单冲突检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CheckContainerserviceConflictopsResponse(),
            self.do_request('1.0', 'antcloud.ldc.containerservice.conflictops.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_containerservice_conflictops_ex_async(
        self,
        request: ldc_models.CheckContainerserviceConflictopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CheckContainerserviceConflictopsResponse:
        """
        Description: 发布单冲突检测
        Summary: 发布单冲突检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CheckContainerserviceConflictopsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.containerservice.conflictops.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_flow_disasterswitch(
        self,
        request: ldc_models.ExecFlowDisasterswitchRequest,
    ) -> ldc_models.ExecFlowDisasterswitchResponse:
        """
        Description: 单元化流量规则的容灾切换
        Summary: 单元化流量规则的容灾切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_flow_disasterswitch_ex(request, headers, runtime)

    async def exec_flow_disasterswitch_async(
        self,
        request: ldc_models.ExecFlowDisasterswitchRequest,
    ) -> ldc_models.ExecFlowDisasterswitchResponse:
        """
        Description: 单元化流量规则的容灾切换
        Summary: 单元化流量规则的容灾切换
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_flow_disasterswitch_ex_async(request, headers, runtime)

    def exec_flow_disasterswitch_ex(
        self,
        request: ldc_models.ExecFlowDisasterswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecFlowDisasterswitchResponse:
        """
        Description: 单元化流量规则的容灾切换
        Summary: 单元化流量规则的容灾切换
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecFlowDisasterswitchResponse(),
            self.do_request('1.0', 'antcloud.ldc.flow.disasterswitch.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_flow_disasterswitch_ex_async(
        self,
        request: ldc_models.ExecFlowDisasterswitchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.ExecFlowDisasterswitchResponse:
        """
        Description: 单元化流量规则的容灾切换
        Summary: 单元化流量规则的容灾切换
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.ExecFlowDisasterswitchResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.flow.disasterswitch.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_sidecarops(
        self,
        request: ldc_models.CancelSidecaropsRequest,
    ) -> ldc_models.CancelSidecaropsResponse:
        """
        Description: 取消sidecar工单，租户应用+sidecar type维度
        Summary: 取消sidecar工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_sidecarops_ex(request, headers, runtime)

    async def cancel_sidecarops_async(
        self,
        request: ldc_models.CancelSidecaropsRequest,
    ) -> ldc_models.CancelSidecaropsResponse:
        """
        Description: 取消sidecar工单，租户应用+sidecar type维度
        Summary: 取消sidecar工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_sidecarops_ex_async(request, headers, runtime)

    def cancel_sidecarops_ex(
        self,
        request: ldc_models.CancelSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelSidecaropsResponse:
        """
        Description: 取消sidecar工单，租户应用+sidecar type维度
        Summary: 取消sidecar工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelSidecaropsResponse(),
            self.do_request('1.0', 'antcloud.ldc.sidecarops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_sidecarops_ex_async(
        self,
        request: ldc_models.CancelSidecaropsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ldc_models.CancelSidecaropsResponse:
        """
        Description: 取消sidecar工单，租户应用+sidecar type维度
        Summary: 取消sidecar工单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ldc_models.CancelSidecaropsResponse(),
            await self.do_request_async('1.0', 'antcloud.ldc.sidecarops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
