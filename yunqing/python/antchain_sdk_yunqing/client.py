# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_yunqing import models as yunqing_models
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
        config: yunqing_models.Config,
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
            # 资源池信息
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
                    'sdk_version': '3.14.18',
                    '_prod_code': 'YUNQING',
                    '_prod_channel': 'undefined'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'prodapigw-sofastack.cloud.alipay.com'),
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
            # 资源池信息
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
                    'sdk_version': '3.14.18',
                    '_prod_code': 'YUNQING',
                    '_prod_channel': 'undefined'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'prodapigw-sofastack.cloud.alipay.com'),
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

    def create_appops(
        self,
        request: yunqing_models.CreateAppopsRequest,
    ) -> yunqing_models.CreateAppopsResponse:
        """
        Description: 创建一个运维单。
        Summary: 创建一个运维单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appops_ex(request, headers, runtime)

    async def create_appops_async(
        self,
        request: yunqing_models.CreateAppopsRequest,
    ) -> yunqing_models.CreateAppopsResponse:
        """
        Description: 创建一个运维单。
        Summary: 创建一个运维单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appops_ex_async(request, headers, runtime)

    def create_appops_ex(
        self,
        request: yunqing_models.CreateAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateAppopsResponse:
        """
        Description: 创建一个运维单。
        Summary: 创建一个运维单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appops_ex_async(
        self,
        request: yunqing_models.CreateAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateAppopsResponse:
        """
        Description: 创建一个运维单。
        Summary: 创建一个运维单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_appops(
        self,
        request: yunqing_models.GetAppopsRequest,
    ) -> yunqing_models.GetAppopsResponse:
        """
        Description: 查询一个运维单详情。
        Summary: 查询一个运维单详情。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_appops_ex(request, headers, runtime)

    async def get_appops_async(
        self,
        request: yunqing_models.GetAppopsRequest,
    ) -> yunqing_models.GetAppopsResponse:
        """
        Description: 查询一个运维单详情。
        Summary: 查询一个运维单详情。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_appops_ex_async(request, headers, runtime)

    def get_appops_ex(
        self,
        request: yunqing_models.GetAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetAppopsResponse:
        """
        Description: 查询一个运维单详情。
        Summary: 查询一个运维单详情。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_appops_ex_async(
        self,
        request: yunqing_models.GetAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetAppopsResponse:
        """
        Description: 查询一个运维单详情。
        Summary: 查询一个运维单详情。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_appops(
        self,
        request: yunqing_models.RetryAppopsRequest,
    ) -> yunqing_models.RetryAppopsResponse:
        """
        Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
        Summary: 重试一个运维单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_appops_ex(request, headers, runtime)

    async def retry_appops_async(
        self,
        request: yunqing_models.RetryAppopsRequest,
    ) -> yunqing_models.RetryAppopsResponse:
        """
        Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
        Summary: 重试一个运维单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_appops_ex_async(request, headers, runtime)

    def retry_appops_ex(
        self,
        request: yunqing_models.RetryAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RetryAppopsResponse:
        """
        Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
        Summary: 重试一个运维单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RetryAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_appops_ex_async(
        self,
        request: yunqing_models.RetryAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RetryAppopsResponse:
        """
        Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
        Summary: 重试一个运维单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RetryAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_appops(
        self,
        request: yunqing_models.CancelAppopsRequest,
    ) -> yunqing_models.CancelAppopsResponse:
        """
        Description: 取消一个发布单。
        Summary: 取消一个发布单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_appops_ex(request, headers, runtime)

    async def cancel_appops_async(
        self,
        request: yunqing_models.CancelAppopsRequest,
    ) -> yunqing_models.CancelAppopsResponse:
        """
        Description: 取消一个发布单。
        Summary: 取消一个发布单。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_appops_ex_async(request, headers, runtime)

    def cancel_appops_ex(
        self,
        request: yunqing_models.CancelAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CancelAppopsResponse:
        """
        Description: 取消一个发布单。
        Summary: 取消一个发布单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CancelAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_appops_ex_async(
        self,
        request: yunqing_models.CancelAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CancelAppopsResponse:
        """
        Description: 取消一个发布单。
        Summary: 取消一个发布单。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CancelAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scale_prodinstance_appservice(
        self,
        request: yunqing_models.ScaleProdinstanceAppserviceRequest,
    ) -> yunqing_models.ScaleProdinstanceAppserviceResponse:
        """
        Description: 变更应用服务实例集群大小。
        Summary: 已废弃，勿用！！！
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scale_prodinstance_appservice_ex(request, headers, runtime)

    async def scale_prodinstance_appservice_async(
        self,
        request: yunqing_models.ScaleProdinstanceAppserviceRequest,
    ) -> yunqing_models.ScaleProdinstanceAppserviceResponse:
        """
        Description: 变更应用服务实例集群大小。
        Summary: 已废弃，勿用！！！
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scale_prodinstance_appservice_ex_async(request, headers, runtime)

    def scale_prodinstance_appservice_ex(
        self,
        request: yunqing_models.ScaleProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleProdinstanceAppserviceResponse:
        """
        Description: 变更应用服务实例集群大小。
        Summary: 已废弃，勿用！！！
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.scale', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scale_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.ScaleProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleProdinstanceAppserviceResponse:
        """
        Description: 变更应用服务实例集群大小。
        Summary: 已废弃，勿用！！！
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.scale', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_env(
        self,
        request: yunqing_models.ListEnvRequest,
    ) -> yunqing_models.ListEnvResponse:
        """
        Description: 获取环境列表。
        Summary: 获取环境列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_env_ex(request, headers, runtime)

    async def list_env_async(
        self,
        request: yunqing_models.ListEnvRequest,
    ) -> yunqing_models.ListEnvResponse:
        """
        Description: 获取环境列表。
        Summary: 获取环境列表。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_env_ex_async(request, headers, runtime)

    def list_env_ex(
        self,
        request: yunqing_models.ListEnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ListEnvResponse:
        """
        Description: 获取环境列表。
        Summary: 获取环境列表。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ListEnvResponse(),
            self.do_request('1.0', 'yunyou.yunqing.env.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_env_ex_async(
        self,
        request: yunqing_models.ListEnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ListEnvResponse:
        """
        Description: 获取环境列表。
        Summary: 获取环境列表。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ListEnvResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.env.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_prodinstance_appservice(
        self,
        request: yunqing_models.GetProdinstanceAppserviceRequest,
    ) -> yunqing_models.GetProdinstanceAppserviceResponse:
        """
        Description: 获取应用服务实例详情信息。
        Summary: 获取应用服务实例详情信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_prodinstance_appservice_ex(request, headers, runtime)

    async def get_prodinstance_appservice_async(
        self,
        request: yunqing_models.GetProdinstanceAppserviceRequest,
    ) -> yunqing_models.GetProdinstanceAppserviceResponse:
        """
        Description: 获取应用服务实例详情信息。
        Summary: 获取应用服务实例详情信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_prodinstance_appservice_ex_async(request, headers, runtime)

    def get_prodinstance_appservice_ex(
        self,
        request: yunqing_models.GetProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetProdinstanceAppserviceResponse:
        """
        Description: 获取应用服务实例详情信息。
        Summary: 获取应用服务实例详情信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.GetProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetProdinstanceAppserviceResponse:
        """
        Description: 获取应用服务实例详情信息。
        Summary: 获取应用服务实例详情信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_prodinstance(
        self,
        request: yunqing_models.QueryProdinstanceRequest,
    ) -> yunqing_models.QueryProdinstanceResponse:
        """
        Description: 查询产品实例。
        Summary: 查询产品实例。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_prodinstance_ex(request, headers, runtime)

    async def query_prodinstance_async(
        self,
        request: yunqing_models.QueryProdinstanceRequest,
    ) -> yunqing_models.QueryProdinstanceResponse:
        """
        Description: 查询产品实例。
        Summary: 查询产品实例。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_prodinstance_ex_async(request, headers, runtime)

    def query_prodinstance_ex(
        self,
        request: yunqing_models.QueryProdinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryProdinstanceResponse:
        """
        Description: 查询产品实例。
        Summary: 查询产品实例。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryProdinstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_prodinstance_ex_async(
        self,
        request: yunqing_models.QueryProdinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryProdinstanceResponse:
        """
        Description: 查询产品实例。
        Summary: 查询产品实例。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryProdinstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def uninstall_prodinstance_appservice(
        self,
        request: yunqing_models.UninstallProdinstanceAppserviceRequest,
    ) -> yunqing_models.UninstallProdinstanceAppserviceResponse:
        """
        Description: 卸载基线产品实例
        Summary: 卸载基线产品实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.uninstall_prodinstance_appservice_ex(request, headers, runtime)

    async def uninstall_prodinstance_appservice_async(
        self,
        request: yunqing_models.UninstallProdinstanceAppserviceRequest,
    ) -> yunqing_models.UninstallProdinstanceAppserviceResponse:
        """
        Description: 卸载基线产品实例
        Summary: 卸载基线产品实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.uninstall_prodinstance_appservice_ex_async(request, headers, runtime)

    def uninstall_prodinstance_appservice_ex(
        self,
        request: yunqing_models.UninstallProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.UninstallProdinstanceAppserviceResponse:
        """
        Description: 卸载基线产品实例
        Summary: 卸载基线产品实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.UninstallProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.uninstall', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def uninstall_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.UninstallProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.UninstallProdinstanceAppserviceResponse:
        """
        Description: 卸载基线产品实例
        Summary: 卸载基线产品实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.UninstallProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.uninstall', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_prodinstance_deployunit(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitRequest,
    ) -> yunqing_models.CreateProdinstanceDeployunitResponse:
        """
        Description: 创建部署单元实例
        Summary: 创建部署单元实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_prodinstance_deployunit_ex(request, headers, runtime)

    async def create_prodinstance_deployunit_async(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitRequest,
    ) -> yunqing_models.CreateProdinstanceDeployunitResponse:
        """
        Description: 创建部署单元实例
        Summary: 创建部署单元实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_prodinstance_deployunit_ex_async(request, headers, runtime)

    def create_prodinstance_deployunit_ex(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateProdinstanceDeployunitResponse:
        """
        Description: 创建部署单元实例
        Summary: 创建部署单元实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateProdinstanceDeployunitResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.deployunit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_prodinstance_deployunit_ex_async(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateProdinstanceDeployunitResponse:
        """
        Description: 创建部署单元实例
        Summary: 创建部署单元实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateProdinstanceDeployunitResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.deployunit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unitinstance_creation(
        self,
        request: yunqing_models.QueryUnitinstanceCreationRequest,
    ) -> yunqing_models.QueryUnitinstanceCreationResponse:
        """
        Description: 查询部署单元实例创建状态
        Summary: 废弃，勿用！！！
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unitinstance_creation_ex(request, headers, runtime)

    async def query_unitinstance_creation_async(
        self,
        request: yunqing_models.QueryUnitinstanceCreationRequest,
    ) -> yunqing_models.QueryUnitinstanceCreationResponse:
        """
        Description: 查询部署单元实例创建状态
        Summary: 废弃，勿用！！！
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unitinstance_creation_ex_async(request, headers, runtime)

    def query_unitinstance_creation_ex(
        self,
        request: yunqing_models.QueryUnitinstanceCreationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryUnitinstanceCreationResponse:
        """
        Description: 查询部署单元实例创建状态
        Summary: 废弃，勿用！！！
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryUnitinstanceCreationResponse(),
            self.do_request('1.0', 'yunyou.yunqing.unitinstance.creation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unitinstance_creation_ex_async(
        self,
        request: yunqing_models.QueryUnitinstanceCreationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryUnitinstanceCreationResponse:
        """
        Description: 查询部署单元实例创建状态
        Summary: 废弃，勿用！！！
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryUnitinstanceCreationResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.unitinstance.creation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_unit_detail(
        self,
        request: yunqing_models.GetUnitDetailRequest,
    ) -> yunqing_models.GetUnitDetailResponse:
        """
        Description: 获取部署单元详情
        Summary: 废弃，勿用！！！
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_unit_detail_ex(request, headers, runtime)

    async def get_unit_detail_async(
        self,
        request: yunqing_models.GetUnitDetailRequest,
    ) -> yunqing_models.GetUnitDetailResponse:
        """
        Description: 获取部署单元详情
        Summary: 废弃，勿用！！！
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_unit_detail_ex_async(request, headers, runtime)

    def get_unit_detail_ex(
        self,
        request: yunqing_models.GetUnitDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetUnitDetailResponse:
        """
        Description: 获取部署单元详情
        Summary: 废弃，勿用！！！
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetUnitDetailResponse(),
            self.do_request('1.0', 'yunyou.yunqing.unit.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_unit_detail_ex_async(
        self,
        request: yunqing_models.GetUnitDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetUnitDetailResponse:
        """
        Description: 获取部署单元详情
        Summary: 废弃，勿用！！！
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetUnitDetailResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.unit.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_prodinstance_appservice(
        self,
        request: yunqing_models.QueryProdinstanceAppserviceRequest,
    ) -> yunqing_models.QueryProdinstanceAppserviceResponse:
        """
        Description: 查询应用服务实例信息。
        Summary: 查询应用服务实例信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_prodinstance_appservice_ex(request, headers, runtime)

    async def query_prodinstance_appservice_async(
        self,
        request: yunqing_models.QueryProdinstanceAppserviceRequest,
    ) -> yunqing_models.QueryProdinstanceAppserviceResponse:
        """
        Description: 查询应用服务实例信息。
        Summary: 查询应用服务实例信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_prodinstance_appservice_ex_async(request, headers, runtime)

    def query_prodinstance_appservice_ex(
        self,
        request: yunqing_models.QueryProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryProdinstanceAppserviceResponse:
        """
        Description: 查询应用服务实例信息。
        Summary: 查询应用服务实例信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.QueryProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryProdinstanceAppserviceResponse:
        """
        Description: 查询应用服务实例信息。
        Summary: 查询应用服务实例信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_prodinstance_deployunit(
        self,
        request: yunqing_models.GetProdinstanceDeployunitRequest,
    ) -> yunqing_models.GetProdinstanceDeployunitResponse:
        """
        Description: 获取单元实例信息
        Summary: 获取单元实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_prodinstance_deployunit_ex(request, headers, runtime)

    async def get_prodinstance_deployunit_async(
        self,
        request: yunqing_models.GetProdinstanceDeployunitRequest,
    ) -> yunqing_models.GetProdinstanceDeployunitResponse:
        """
        Description: 获取单元实例信息
        Summary: 获取单元实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_prodinstance_deployunit_ex_async(request, headers, runtime)

    def get_prodinstance_deployunit_ex(
        self,
        request: yunqing_models.GetProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetProdinstanceDeployunitResponse:
        """
        Description: 获取单元实例信息
        Summary: 获取单元实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetProdinstanceDeployunitResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.deployunit.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_prodinstance_deployunit_ex_async(
        self,
        request: yunqing_models.GetProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetProdinstanceDeployunitResponse:
        """
        Description: 获取单元实例信息
        Summary: 获取单元实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetProdinstanceDeployunitResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.deployunit.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_prodinstance_deployunit(
        self,
        request: yunqing_models.ListProdinstanceDeployunitRequest,
    ) -> yunqing_models.ListProdinstanceDeployunitResponse:
        """
        Description: 获取产品实例下的部署单元列表。
        Summary: 获取产品实例下的部署单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_prodinstance_deployunit_ex(request, headers, runtime)

    async def list_prodinstance_deployunit_async(
        self,
        request: yunqing_models.ListProdinstanceDeployunitRequest,
    ) -> yunqing_models.ListProdinstanceDeployunitResponse:
        """
        Description: 获取产品实例下的部署单元列表。
        Summary: 获取产品实例下的部署单元列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_prodinstance_deployunit_ex_async(request, headers, runtime)

    def list_prodinstance_deployunit_ex(
        self,
        request: yunqing_models.ListProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ListProdinstanceDeployunitResponse:
        """
        Description: 获取产品实例下的部署单元列表。
        Summary: 获取产品实例下的部署单元列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ListProdinstanceDeployunitResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.deployunit.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_prodinstance_deployunit_ex_async(
        self,
        request: yunqing_models.ListProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ListProdinstanceDeployunitResponse:
        """
        Description: 获取产品实例下的部署单元列表。
        Summary: 获取产品实例下的部署单元列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ListProdinstanceDeployunitResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.deployunit.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scaleout_prodinstance_appservice(
        self,
        request: yunqing_models.ScaleoutProdinstanceAppserviceRequest,
    ) -> yunqing_models.ScaleoutProdinstanceAppserviceResponse:
        """
        Description: 指定应用服务扩容。
        Summary: 指定应用服务扩容。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scaleout_prodinstance_appservice_ex(request, headers, runtime)

    async def scaleout_prodinstance_appservice_async(
        self,
        request: yunqing_models.ScaleoutProdinstanceAppserviceRequest,
    ) -> yunqing_models.ScaleoutProdinstanceAppserviceResponse:
        """
        Description: 指定应用服务扩容。
        Summary: 指定应用服务扩容。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scaleout_prodinstance_appservice_ex_async(request, headers, runtime)

    def scaleout_prodinstance_appservice_ex(
        self,
        request: yunqing_models.ScaleoutProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleoutProdinstanceAppserviceResponse:
        """
        Description: 指定应用服务扩容。
        Summary: 指定应用服务扩容。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleoutProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.scaleout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scaleout_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.ScaleoutProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleoutProdinstanceAppserviceResponse:
        """
        Description: 指定应用服务扩容。
        Summary: 指定应用服务扩容。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleoutProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.scaleout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_auth(
        self,
        request: yunqing_models.QueryAuthRequest,
    ) -> yunqing_models.QueryAuthResponse:
        """
        Description: 查询用户授权信息
        Summary: 查询用户授权信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_auth_ex(request, headers, runtime)

    async def query_auth_async(
        self,
        request: yunqing_models.QueryAuthRequest,
    ) -> yunqing_models.QueryAuthResponse:
        """
        Description: 查询用户授权信息
        Summary: 查询用户授权信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_auth_ex_async(request, headers, runtime)

    def query_auth_ex(
        self,
        request: yunqing_models.QueryAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryAuthResponse:
        """
        Description: 查询用户授权信息
        Summary: 查询用户授权信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryAuthResponse(),
            self.do_request('1.0', 'yunyou.yunqing.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_auth_ex_async(
        self,
        request: yunqing_models.QueryAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryAuthResponse:
        """
        Description: 查询用户授权信息
        Summary: 查询用户授权信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryAuthResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_auth(
        self,
        request: yunqing_models.ImportAuthRequest,
    ) -> yunqing_models.ImportAuthResponse:
        """
        Description: 导入用户授权
        Summary: 导入用户授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_auth_ex(request, headers, runtime)

    async def import_auth_async(
        self,
        request: yunqing_models.ImportAuthRequest,
    ) -> yunqing_models.ImportAuthResponse:
        """
        Description: 导入用户授权
        Summary: 导入用户授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_auth_ex_async(request, headers, runtime)

    def import_auth_ex(
        self,
        request: yunqing_models.ImportAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportAuthResponse:
        """
        Description: 导入用户授权
        Summary: 导入用户授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportAuthResponse(),
            self.do_request('1.0', 'yunyou.yunqing.auth.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_auth_ex_async(
        self,
        request: yunqing_models.ImportAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportAuthResponse:
        """
        Description: 导入用户授权
        Summary: 导入用户授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportAuthResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.auth.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_system(
        self,
        request: yunqing_models.GetSystemRequest,
    ) -> yunqing_models.GetSystemResponse:
        """
        Description: 系统信息
        Summary: 获取Local系统信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_system_ex(request, headers, runtime)

    async def get_system_async(
        self,
        request: yunqing_models.GetSystemRequest,
    ) -> yunqing_models.GetSystemResponse:
        """
        Description: 系统信息
        Summary: 获取Local系统信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_system_ex_async(request, headers, runtime)

    def get_system_ex(
        self,
        request: yunqing_models.GetSystemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetSystemResponse:
        """
        Description: 系统信息
        Summary: 获取Local系统信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetSystemResponse(),
            self.do_request('1.0', 'yunyou.yunqing.system.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_system_ex_async(
        self,
        request: yunqing_models.GetSystemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetSystemResponse:
        """
        Description: 系统信息
        Summary: 获取Local系统信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetSystemResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.system.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scalein_prodinstance_appservice(
        self,
        request: yunqing_models.ScaleinProdinstanceAppserviceRequest,
    ) -> yunqing_models.ScaleinProdinstanceAppserviceResponse:
        """
        Description: 应用服务缩容。
        Summary: 应用服务缩容。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scalein_prodinstance_appservice_ex(request, headers, runtime)

    async def scalein_prodinstance_appservice_async(
        self,
        request: yunqing_models.ScaleinProdinstanceAppserviceRequest,
    ) -> yunqing_models.ScaleinProdinstanceAppserviceResponse:
        """
        Description: 应用服务缩容。
        Summary: 应用服务缩容。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scalein_prodinstance_appservice_ex_async(request, headers, runtime)

    def scalein_prodinstance_appservice_ex(
        self,
        request: yunqing_models.ScaleinProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleinProdinstanceAppserviceResponse:
        """
        Description: 应用服务缩容。
        Summary: 应用服务缩容。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleinProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scalein_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.ScaleinProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleinProdinstanceAppserviceResponse:
        """
        Description: 应用服务缩容。
        Summary: 应用服务缩容。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleinProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_prodinstance_appservice(
        self,
        request: yunqing_models.AllProdinstanceAppserviceRequest,
    ) -> yunqing_models.AllProdinstanceAppserviceResponse:
        """
        Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
        Summary: 查询一个环境内的全部应用服务实例信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_prodinstance_appservice_ex(request, headers, runtime)

    async def all_prodinstance_appservice_async(
        self,
        request: yunqing_models.AllProdinstanceAppserviceRequest,
    ) -> yunqing_models.AllProdinstanceAppserviceResponse:
        """
        Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
        Summary: 查询一个环境内的全部应用服务实例信息。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_prodinstance_appservice_ex_async(request, headers, runtime)

    def all_prodinstance_appservice_ex(
        self,
        request: yunqing_models.AllProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.AllProdinstanceAppserviceResponse:
        """
        Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
        Summary: 查询一个环境内的全部应用服务实例信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.AllProdinstanceAppserviceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.appservice.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_prodinstance_appservice_ex_async(
        self,
        request: yunqing_models.AllProdinstanceAppserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.AllProdinstanceAppserviceResponse:
        """
        Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
        Summary: 查询一个环境内的全部应用服务实例信息。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.AllProdinstanceAppserviceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.appservice.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_autotestops(
        self,
        request: yunqing_models.CreateAutotestopsRequest,
    ) -> yunqing_models.CreateAutotestopsResponse:
        """
        Description: 输入产品码，自动创建一个测试单，并开始执行
        Summary: 创建一个自动巡检测试单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_autotestops_ex(request, headers, runtime)

    async def create_autotestops_async(
        self,
        request: yunqing_models.CreateAutotestopsRequest,
    ) -> yunqing_models.CreateAutotestopsResponse:
        """
        Description: 输入产品码，自动创建一个测试单，并开始执行
        Summary: 创建一个自动巡检测试单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_autotestops_ex_async(request, headers, runtime)

    def create_autotestops_ex(
        self,
        request: yunqing_models.CreateAutotestopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateAutotestopsResponse:
        """
        Description: 输入产品码，自动创建一个测试单，并开始执行
        Summary: 创建一个自动巡检测试单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateAutotestopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.autotestops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_autotestops_ex_async(
        self,
        request: yunqing_models.CreateAutotestopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateAutotestopsResponse:
        """
        Description: 输入产品码，自动创建一个测试单，并开始执行
        Summary: 创建一个自动巡检测试单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateAutotestopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.autotestops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_autotestops(
        self,
        request: yunqing_models.GetAutotestopsRequest,
    ) -> yunqing_models.GetAutotestopsResponse:
        """
        Description: 获取测试单状态和case
        Summary: 获取测试单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_autotestops_ex(request, headers, runtime)

    async def get_autotestops_async(
        self,
        request: yunqing_models.GetAutotestopsRequest,
    ) -> yunqing_models.GetAutotestopsResponse:
        """
        Description: 获取测试单状态和case
        Summary: 获取测试单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_autotestops_ex_async(request, headers, runtime)

    def get_autotestops_ex(
        self,
        request: yunqing_models.GetAutotestopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetAutotestopsResponse:
        """
        Description: 获取测试单状态和case
        Summary: 获取测试单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetAutotestopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.autotestops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_autotestops_ex_async(
        self,
        request: yunqing_models.GetAutotestopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetAutotestopsResponse:
        """
        Description: 获取测试单状态和case
        Summary: 获取测试单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetAutotestopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.autotestops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_baseline(
        self,
        request: yunqing_models.ExportBaselineRequest,
    ) -> yunqing_models.ExportBaselineResponse:
        """
        Description: 基线数据回流
        Summary: 基线数据回流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_baseline_ex(request, headers, runtime)

    async def export_baseline_async(
        self,
        request: yunqing_models.ExportBaselineRequest,
    ) -> yunqing_models.ExportBaselineResponse:
        """
        Description: 基线数据回流
        Summary: 基线数据回流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_baseline_ex_async(request, headers, runtime)

    def export_baseline_ex(
        self,
        request: yunqing_models.ExportBaselineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ExportBaselineResponse:
        """
        Description: 基线数据回流
        Summary: 基线数据回流
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ExportBaselineResponse(),
            self.do_request('1.0', 'yunyou.yunqing.baseline.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_baseline_ex_async(
        self,
        request: yunqing_models.ExportBaselineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ExportBaselineResponse:
        """
        Description: 基线数据回流
        Summary: 基线数据回流
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ExportBaselineResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.baseline.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_appdeploy(
        self,
        request: yunqing_models.CreateAppdeployRequest,
    ) -> yunqing_models.CreateAppdeployResponse:
        """
        Description: 创建一个发布单
        Summary: 创建一个发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_appdeploy_ex(request, headers, runtime)

    async def create_appdeploy_async(
        self,
        request: yunqing_models.CreateAppdeployRequest,
    ) -> yunqing_models.CreateAppdeployResponse:
        """
        Description: 创建一个发布单
        Summary: 创建一个发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_appdeploy_ex_async(request, headers, runtime)

    def create_appdeploy_ex(
        self,
        request: yunqing_models.CreateAppdeployRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateAppdeployResponse:
        """
        Description: 创建一个发布单
        Summary: 创建一个发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateAppdeployResponse(),
            self.do_request('1.0', 'yunyou.yunqing.appdeploy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_appdeploy_ex_async(
        self,
        request: yunqing_models.CreateAppdeployRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateAppdeployResponse:
        """
        Description: 创建一个发布单
        Summary: 创建一个发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateAppdeployResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.appdeploy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_solutioninstance(
        self,
        request: yunqing_models.QuerySolutioninstanceRequest,
    ) -> yunqing_models.QuerySolutioninstanceResponse:
        """
        Description: 查询环境中的解决方案实例
        Summary: 查询环境中的解决方案实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_solutioninstance_ex(request, headers, runtime)

    async def query_solutioninstance_async(
        self,
        request: yunqing_models.QuerySolutioninstanceRequest,
    ) -> yunqing_models.QuerySolutioninstanceResponse:
        """
        Description: 查询环境中的解决方案实例
        Summary: 查询环境中的解决方案实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_solutioninstance_ex_async(request, headers, runtime)

    def query_solutioninstance_ex(
        self,
        request: yunqing_models.QuerySolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QuerySolutioninstanceResponse:
        """
        Description: 查询环境中的解决方案实例
        Summary: 查询环境中的解决方案实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QuerySolutioninstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_solutioninstance_ex_async(
        self,
        request: yunqing_models.QuerySolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QuerySolutioninstanceResponse:
        """
        Description: 查询环境中的解决方案实例
        Summary: 查询环境中的解决方案实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QuerySolutioninstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_solutioninstance(
        self,
        request: yunqing_models.ImportSolutioninstanceRequest,
    ) -> yunqing_models.ImportSolutioninstanceResponse:
        """
        Description: 导入解决方案
        Summary: 导入解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_solutioninstance_ex(request, headers, runtime)

    async def import_solutioninstance_async(
        self,
        request: yunqing_models.ImportSolutioninstanceRequest,
    ) -> yunqing_models.ImportSolutioninstanceResponse:
        """
        Description: 导入解决方案
        Summary: 导入解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_solutioninstance_ex_async(request, headers, runtime)

    def import_solutioninstance_ex(
        self,
        request: yunqing_models.ImportSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportSolutioninstanceResponse:
        """
        Description: 导入解决方案
        Summary: 导入解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportSolutioninstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_solutioninstance_ex_async(
        self,
        request: yunqing_models.ImportSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportSolutioninstanceResponse:
        """
        Description: 导入解决方案
        Summary: 导入解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportSolutioninstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_solutioninstance_import(
        self,
        request: yunqing_models.CheckSolutioninstanceImportRequest,
    ) -> yunqing_models.CheckSolutioninstanceImportResponse:
        """
        Description: 检查解决方案是否可以导入
        Summary: 检查解决方案是否可以导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_solutioninstance_import_ex(request, headers, runtime)

    async def check_solutioninstance_import_async(
        self,
        request: yunqing_models.CheckSolutioninstanceImportRequest,
    ) -> yunqing_models.CheckSolutioninstanceImportResponse:
        """
        Description: 检查解决方案是否可以导入
        Summary: 检查解决方案是否可以导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_solutioninstance_import_ex_async(request, headers, runtime)

    def check_solutioninstance_import_ex(
        self,
        request: yunqing_models.CheckSolutioninstanceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CheckSolutioninstanceImportResponse:
        """
        Description: 检查解决方案是否可以导入
        Summary: 检查解决方案是否可以导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CheckSolutioninstanceImportResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.import.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_solutioninstance_import_ex_async(
        self,
        request: yunqing_models.CheckSolutioninstanceImportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CheckSolutioninstanceImportResponse:
        """
        Description: 检查解决方案是否可以导入
        Summary: 检查解决方案是否可以导入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CheckSolutioninstanceImportResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.import.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_solutioninstance(
        self,
        request: yunqing_models.DescribeSolutioninstanceRequest,
    ) -> yunqing_models.DescribeSolutioninstanceResponse:
        """
        Description: 返回解决方案支持的操作列表
        Summary: 返回解决方案支持的操作列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_solutioninstance_ex(request, headers, runtime)

    async def describe_solutioninstance_async(
        self,
        request: yunqing_models.DescribeSolutioninstanceRequest,
    ) -> yunqing_models.DescribeSolutioninstanceResponse:
        """
        Description: 返回解决方案支持的操作列表
        Summary: 返回解决方案支持的操作列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_solutioninstance_ex_async(request, headers, runtime)

    def describe_solutioninstance_ex(
        self,
        request: yunqing_models.DescribeSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.DescribeSolutioninstanceResponse:
        """
        Description: 返回解决方案支持的操作列表
        Summary: 返回解决方案支持的操作列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.DescribeSolutioninstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_solutioninstance_ex_async(
        self,
        request: yunqing_models.DescribeSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.DescribeSolutioninstanceResponse:
        """
        Description: 返回解决方案支持的操作列表
        Summary: 返回解决方案支持的操作列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.DescribeSolutioninstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deprecate_solutioninstance(
        self,
        request: yunqing_models.DeprecateSolutioninstanceRequest,
    ) -> yunqing_models.DeprecateSolutioninstanceResponse:
        """
        Description: 废弃一个解决方案
        Summary: 废弃一个解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deprecate_solutioninstance_ex(request, headers, runtime)

    async def deprecate_solutioninstance_async(
        self,
        request: yunqing_models.DeprecateSolutioninstanceRequest,
    ) -> yunqing_models.DeprecateSolutioninstanceResponse:
        """
        Description: 废弃一个解决方案
        Summary: 废弃一个解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deprecate_solutioninstance_ex_async(request, headers, runtime)

    def deprecate_solutioninstance_ex(
        self,
        request: yunqing_models.DeprecateSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.DeprecateSolutioninstanceResponse:
        """
        Description: 废弃一个解决方案
        Summary: 废弃一个解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.DeprecateSolutioninstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.deprecate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deprecate_solutioninstance_ex_async(
        self,
        request: yunqing_models.DeprecateSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.DeprecateSolutioninstanceResponse:
        """
        Description: 废弃一个解决方案
        Summary: 废弃一个解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.DeprecateSolutioninstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.deprecate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_solutioninstance(
        self,
        request: yunqing_models.FinishSolutioninstanceRequest,
    ) -> yunqing_models.FinishSolutioninstanceResponse:
        """
        Description: 完成一个解决方案
        Summary: 完成一个解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_solutioninstance_ex(request, headers, runtime)

    async def finish_solutioninstance_async(
        self,
        request: yunqing_models.FinishSolutioninstanceRequest,
    ) -> yunqing_models.FinishSolutioninstanceResponse:
        """
        Description: 完成一个解决方案
        Summary: 完成一个解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_solutioninstance_ex_async(request, headers, runtime)

    def finish_solutioninstance_ex(
        self,
        request: yunqing_models.FinishSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.FinishSolutioninstanceResponse:
        """
        Description: 完成一个解决方案
        Summary: 完成一个解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.FinishSolutioninstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_solutioninstance_ex_async(
        self,
        request: yunqing_models.FinishSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.FinishSolutioninstanceResponse:
        """
        Description: 完成一个解决方案
        Summary: 完成一个解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.FinishSolutioninstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reopen_solutioninstance(
        self,
        request: yunqing_models.ReopenSolutioninstanceRequest,
    ) -> yunqing_models.ReopenSolutioninstanceResponse:
        """
        Description: reopen一个解决方案
        Summary: reopen一个解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reopen_solutioninstance_ex(request, headers, runtime)

    async def reopen_solutioninstance_async(
        self,
        request: yunqing_models.ReopenSolutioninstanceRequest,
    ) -> yunqing_models.ReopenSolutioninstanceResponse:
        """
        Description: reopen一个解决方案
        Summary: reopen一个解决方案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reopen_solutioninstance_ex_async(request, headers, runtime)

    def reopen_solutioninstance_ex(
        self,
        request: yunqing_models.ReopenSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ReopenSolutioninstanceResponse:
        """
        Description: reopen一个解决方案
        Summary: reopen一个解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ReopenSolutioninstanceResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solutioninstance.reopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reopen_solutioninstance_ex_async(
        self,
        request: yunqing_models.ReopenSolutioninstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ReopenSolutioninstanceResponse:
        """
        Description: reopen一个解决方案
        Summary: reopen一个解决方案
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ReopenSolutioninstanceResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solutioninstance.reopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_env_meta(
        self,
        request: yunqing_models.ImportEnvMetaRequest,
    ) -> yunqing_models.ImportEnvMetaResponse:
        """
        Description: 导入一个云架构
        Summary: 导入一个云架构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_env_meta_ex(request, headers, runtime)

    async def import_env_meta_async(
        self,
        request: yunqing_models.ImportEnvMetaRequest,
    ) -> yunqing_models.ImportEnvMetaResponse:
        """
        Description: 导入一个云架构
        Summary: 导入一个云架构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_env_meta_ex_async(request, headers, runtime)

    def import_env_meta_ex(
        self,
        request: yunqing_models.ImportEnvMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportEnvMetaResponse:
        """
        Description: 导入一个云架构
        Summary: 导入一个云架构
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportEnvMetaResponse(),
            self.do_request('1.0', 'yunyou.yunqing.env.meta.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_env_meta_ex_async(
        self,
        request: yunqing_models.ImportEnvMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportEnvMetaResponse:
        """
        Description: 导入一个云架构
        Summary: 导入一个云架构
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportEnvMetaResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.env.meta.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_prod_meta(
        self,
        request: yunqing_models.ImportProdMetaRequest,
    ) -> yunqing_models.ImportProdMetaResponse:
        """
        Description: 导入产品元数据
        Summary: 导入产品元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_prod_meta_ex(request, headers, runtime)

    async def import_prod_meta_async(
        self,
        request: yunqing_models.ImportProdMetaRequest,
    ) -> yunqing_models.ImportProdMetaResponse:
        """
        Description: 导入产品元数据
        Summary: 导入产品元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_prod_meta_ex_async(request, headers, runtime)

    def import_prod_meta_ex(
        self,
        request: yunqing_models.ImportProdMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportProdMetaResponse:
        """
        Description: 导入产品元数据
        Summary: 导入产品元数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportProdMetaResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prod.meta.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_prod_meta_ex_async(
        self,
        request: yunqing_models.ImportProdMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ImportProdMetaResponse:
        """
        Description: 导入产品元数据
        Summary: 导入产品元数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ImportProdMetaResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prod.meta.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def uninstall_prodinstance_deployunit(
        self,
        request: yunqing_models.UninstallProdinstanceDeployunitRequest,
    ) -> yunqing_models.UninstallProdinstanceDeployunitResponse:
        """
        Description: 卸载部署单元实例
        Summary: 卸载部署单元实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.uninstall_prodinstance_deployunit_ex(request, headers, runtime)

    async def uninstall_prodinstance_deployunit_async(
        self,
        request: yunqing_models.UninstallProdinstanceDeployunitRequest,
    ) -> yunqing_models.UninstallProdinstanceDeployunitResponse:
        """
        Description: 卸载部署单元实例
        Summary: 卸载部署单元实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.uninstall_prodinstance_deployunit_ex_async(request, headers, runtime)

    def uninstall_prodinstance_deployunit_ex(
        self,
        request: yunqing_models.UninstallProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.UninstallProdinstanceDeployunitResponse:
        """
        Description: 卸载部署单元实例
        Summary: 卸载部署单元实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.UninstallProdinstanceDeployunitResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.deployunit.uninstall', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def uninstall_prodinstance_deployunit_ex_async(
        self,
        request: yunqing_models.UninstallProdinstanceDeployunitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.UninstallProdinstanceDeployunitResponse:
        """
        Description: 卸载部署单元实例
        Summary: 卸载部署单元实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.UninstallProdinstanceDeployunitResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.deployunit.uninstall', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_pods(
        self,
        request: yunqing_models.QueryClusterPodsRequest,
    ) -> yunqing_models.QueryClusterPodsResponse:
        """
        Description: 集群内部pod信息查询，巡检使用
        Summary: 集群内部pod信息查询，巡检使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_pods_ex(request, headers, runtime)

    async def query_cluster_pods_async(
        self,
        request: yunqing_models.QueryClusterPodsRequest,
    ) -> yunqing_models.QueryClusterPodsResponse:
        """
        Description: 集群内部pod信息查询，巡检使用
        Summary: 集群内部pod信息查询，巡检使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_pods_ex_async(request, headers, runtime)

    def query_cluster_pods_ex(
        self,
        request: yunqing_models.QueryClusterPodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryClusterPodsResponse:
        """
        Description: 集群内部pod信息查询，巡检使用
        Summary: 集群内部pod信息查询，巡检使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryClusterPodsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.cluster.pods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_pods_ex_async(
        self,
        request: yunqing_models.QueryClusterPodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryClusterPodsResponse:
        """
        Description: 集群内部pod信息查询，巡检使用
        Summary: 集群内部pod信息查询，巡检使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryClusterPodsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.cluster.pods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_kubeconfig(
        self,
        request: yunqing_models.QueryClusterKubeconfigRequest,
    ) -> yunqing_models.QueryClusterKubeconfigResponse:
        """
        Description: 集群内部kubeconfig查询巡检使用
        Summary: 集群内部kubeconfig查询巡检使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_kubeconfig_ex(request, headers, runtime)

    async def query_cluster_kubeconfig_async(
        self,
        request: yunqing_models.QueryClusterKubeconfigRequest,
    ) -> yunqing_models.QueryClusterKubeconfigResponse:
        """
        Description: 集群内部kubeconfig查询巡检使用
        Summary: 集群内部kubeconfig查询巡检使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_kubeconfig_ex_async(request, headers, runtime)

    def query_cluster_kubeconfig_ex(
        self,
        request: yunqing_models.QueryClusterKubeconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryClusterKubeconfigResponse:
        """
        Description: 集群内部kubeconfig查询巡检使用
        Summary: 集群内部kubeconfig查询巡检使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryClusterKubeconfigResponse(),
            self.do_request('1.0', 'yunyou.yunqing.cluster.kubeconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_kubeconfig_ex_async(
        self,
        request: yunqing_models.QueryClusterKubeconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryClusterKubeconfigResponse:
        """
        Description: 集群内部kubeconfig查询巡检使用
        Summary: 集群内部kubeconfig查询巡检使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryClusterKubeconfigResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.cluster.kubeconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_dynamicslb(
        self,
        request: yunqing_models.EnableDynamicslbRequest,
    ) -> yunqing_models.EnableDynamicslbResponse:
        """
        Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
        Summary: 生成公网访问的slb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_dynamicslb_ex(request, headers, runtime)

    async def enable_dynamicslb_async(
        self,
        request: yunqing_models.EnableDynamicslbRequest,
    ) -> yunqing_models.EnableDynamicslbResponse:
        """
        Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
        Summary: 生成公网访问的slb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_dynamicslb_ex_async(request, headers, runtime)

    def enable_dynamicslb_ex(
        self,
        request: yunqing_models.EnableDynamicslbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.EnableDynamicslbResponse:
        """
        Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
        Summary: 生成公网访问的slb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.EnableDynamicslbResponse(),
            self.do_request('1.0', 'yunyou.yunqing.dynamicslb.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_dynamicslb_ex_async(
        self,
        request: yunqing_models.EnableDynamicslbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.EnableDynamicslbResponse:
        """
        Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
        Summary: 生成公网访问的slb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.EnableDynamicslbResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.dynamicslb.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_dynamicslb(
        self,
        request: yunqing_models.DisableDynamicslbRequest,
    ) -> yunqing_models.DisableDynamicslbResponse:
        """
        Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
        Summary: 移除公网访问的slb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_dynamicslb_ex(request, headers, runtime)

    async def disable_dynamicslb_async(
        self,
        request: yunqing_models.DisableDynamicslbRequest,
    ) -> yunqing_models.DisableDynamicslbResponse:
        """
        Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
        Summary: 移除公网访问的slb
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_dynamicslb_ex_async(request, headers, runtime)

    def disable_dynamicslb_ex(
        self,
        request: yunqing_models.DisableDynamicslbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.DisableDynamicslbResponse:
        """
        Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
        Summary: 移除公网访问的slb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.DisableDynamicslbResponse(),
            self.do_request('1.0', 'yunyou.yunqing.dynamicslb.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_dynamicslb_ex_async(
        self,
        request: yunqing_models.DisableDynamicslbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.DisableDynamicslbResponse:
        """
        Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
        Summary: 移除公网访问的slb
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.DisableDynamicslbResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.dynamicslb.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_cluster_dns(
        self,
        request: yunqing_models.ExecClusterDnsRequest,
    ) -> yunqing_models.ExecClusterDnsResponse:
        """
        Description: 云游环境下应用dns的上下线
        Summary: 云游环境下应用dns的上下线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_cluster_dns_ex(request, headers, runtime)

    async def exec_cluster_dns_async(
        self,
        request: yunqing_models.ExecClusterDnsRequest,
    ) -> yunqing_models.ExecClusterDnsResponse:
        """
        Description: 云游环境下应用dns的上下线
        Summary: 云游环境下应用dns的上下线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_cluster_dns_ex_async(request, headers, runtime)

    def exec_cluster_dns_ex(
        self,
        request: yunqing_models.ExecClusterDnsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ExecClusterDnsResponse:
        """
        Description: 云游环境下应用dns的上下线
        Summary: 云游环境下应用dns的上下线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ExecClusterDnsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.cluster.dns.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_cluster_dns_ex_async(
        self,
        request: yunqing_models.ExecClusterDnsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ExecClusterDnsResponse:
        """
        Description: 云游环境下应用dns的上下线
        Summary: 云游环境下应用dns的上下线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ExecClusterDnsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.cluster.dns.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_cluster_container(
        self,
        request: yunqing_models.OfflineClusterContainerRequest,
    ) -> yunqing_models.OfflineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的下线
        Summary: 云游环境下应用容器的下线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_cluster_container_ex(request, headers, runtime)

    async def offline_cluster_container_async(
        self,
        request: yunqing_models.OfflineClusterContainerRequest,
    ) -> yunqing_models.OfflineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的下线
        Summary: 云游环境下应用容器的下线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_cluster_container_ex_async(request, headers, runtime)

    def offline_cluster_container_ex(
        self,
        request: yunqing_models.OfflineClusterContainerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.OfflineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的下线
        Summary: 云游环境下应用容器的下线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.OfflineClusterContainerResponse(),
            self.do_request('1.0', 'yunyou.yunqing.cluster.container.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_cluster_container_ex_async(
        self,
        request: yunqing_models.OfflineClusterContainerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.OfflineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的下线
        Summary: 云游环境下应用容器的下线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.OfflineClusterContainerResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.cluster.container.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_cluster_container(
        self,
        request: yunqing_models.OnlineClusterContainerRequest,
    ) -> yunqing_models.OnlineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的上线
        Summary: 云游环境下应用容器的上线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_cluster_container_ex(request, headers, runtime)

    async def online_cluster_container_async(
        self,
        request: yunqing_models.OnlineClusterContainerRequest,
    ) -> yunqing_models.OnlineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的上线
        Summary: 云游环境下应用容器的上线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_cluster_container_ex_async(request, headers, runtime)

    def online_cluster_container_ex(
        self,
        request: yunqing_models.OnlineClusterContainerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.OnlineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的上线
        Summary: 云游环境下应用容器的上线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.OnlineClusterContainerResponse(),
            self.do_request('1.0', 'yunyou.yunqing.cluster.container.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_cluster_container_ex_async(
        self,
        request: yunqing_models.OnlineClusterContainerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.OnlineClusterContainerResponse:
        """
        Description: 云游环境下应用容器的上线
        Summary: 云游环境下应用容器的上线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.OnlineClusterContainerResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.cluster.container.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_appparam(
        self,
        request: yunqing_models.QueryAppparamRequest,
    ) -> yunqing_models.QueryAppparamResponse:
        """
        Description: 查询应用启动参数
        Summary: 查询应用启动参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_appparam_ex(request, headers, runtime)

    async def query_appparam_async(
        self,
        request: yunqing_models.QueryAppparamRequest,
    ) -> yunqing_models.QueryAppparamResponse:
        """
        Description: 查询应用启动参数
        Summary: 查询应用启动参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_appparam_ex_async(request, headers, runtime)

    def query_appparam_ex(
        self,
        request: yunqing_models.QueryAppparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryAppparamResponse:
        """
        Description: 查询应用启动参数
        Summary: 查询应用启动参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryAppparamResponse(),
            self.do_request('1.0', 'yunyou.yunqing.appparam.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_appparam_ex_async(
        self,
        request: yunqing_models.QueryAppparamRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryAppparamResponse:
        """
        Description: 查询应用启动参数
        Summary: 查询应用启动参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryAppparamResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.appparam.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_solution_opsplan(
        self,
        request: yunqing_models.PagequerySolutionOpsplanRequest,
    ) -> yunqing_models.PagequerySolutionOpsplanResponse:
        """
        Description: 查询产品解决方案的所有发布单
        Summary: 查询产品解决方案的所有发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_solution_opsplan_ex(request, headers, runtime)

    async def pagequery_solution_opsplan_async(
        self,
        request: yunqing_models.PagequerySolutionOpsplanRequest,
    ) -> yunqing_models.PagequerySolutionOpsplanResponse:
        """
        Description: 查询产品解决方案的所有发布单
        Summary: 查询产品解决方案的所有发布单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_solution_opsplan_ex_async(request, headers, runtime)

    def pagequery_solution_opsplan_ex(
        self,
        request: yunqing_models.PagequerySolutionOpsplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequerySolutionOpsplanResponse:
        """
        Description: 查询产品解决方案的所有发布单
        Summary: 查询产品解决方案的所有发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequerySolutionOpsplanResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solution.opsplan.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_solution_opsplan_ex_async(
        self,
        request: yunqing_models.PagequerySolutionOpsplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequerySolutionOpsplanResponse:
        """
        Description: 查询产品解决方案的所有发布单
        Summary: 查询产品解决方案的所有发布单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequerySolutionOpsplanResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solution.opsplan.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_solution_plan(
        self,
        request: yunqing_models.ConfirmSolutionPlanRequest,
    ) -> yunqing_models.ConfirmSolutionPlanResponse:
        """
        Description: 确认解决方案的各种规划
        Summary: 确认解决方案规划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_solution_plan_ex(request, headers, runtime)

    async def confirm_solution_plan_async(
        self,
        request: yunqing_models.ConfirmSolutionPlanRequest,
    ) -> yunqing_models.ConfirmSolutionPlanResponse:
        """
        Description: 确认解决方案的各种规划
        Summary: 确认解决方案规划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_solution_plan_ex_async(request, headers, runtime)

    def confirm_solution_plan_ex(
        self,
        request: yunqing_models.ConfirmSolutionPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ConfirmSolutionPlanResponse:
        """
        Description: 确认解决方案的各种规划
        Summary: 确认解决方案规划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ConfirmSolutionPlanResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solution.plan.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_solution_plan_ex_async(
        self,
        request: yunqing_models.ConfirmSolutionPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ConfirmSolutionPlanResponse:
        """
        Description: 确认解决方案的各种规划
        Summary: 确认解决方案规划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ConfirmSolutionPlanResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solution.plan.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_solution_planstatus(
        self,
        request: yunqing_models.GetSolutionPlanstatusRequest,
    ) -> yunqing_models.GetSolutionPlanstatusResponse:
        """
        Description: 解决方案是否完成规划
        Summary: 解决方案是否完成规划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_solution_planstatus_ex(request, headers, runtime)

    async def get_solution_planstatus_async(
        self,
        request: yunqing_models.GetSolutionPlanstatusRequest,
    ) -> yunqing_models.GetSolutionPlanstatusResponse:
        """
        Description: 解决方案是否完成规划
        Summary: 解决方案是否完成规划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_solution_planstatus_ex_async(request, headers, runtime)

    def get_solution_planstatus_ex(
        self,
        request: yunqing_models.GetSolutionPlanstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetSolutionPlanstatusResponse:
        """
        Description: 解决方案是否完成规划
        Summary: 解决方案是否完成规划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetSolutionPlanstatusResponse(),
            self.do_request('1.0', 'yunyou.yunqing.solution.planstatus.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_solution_planstatus_ex_async(
        self,
        request: yunqing_models.GetSolutionPlanstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetSolutionPlanstatusResponse:
        """
        Description: 解决方案是否完成规划
        Summary: 解决方案是否完成规划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetSolutionPlanstatusResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.solution.planstatus.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_proditeration(
        self,
        request: yunqing_models.PagequeryProditerationRequest,
    ) -> yunqing_models.PagequeryProditerationResponse:
        """
        Description: 分页查询迭代详情
        Summary: 分页查询迭代详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_proditeration_ex(request, headers, runtime)

    async def pagequery_proditeration_async(
        self,
        request: yunqing_models.PagequeryProditerationRequest,
    ) -> yunqing_models.PagequeryProditerationResponse:
        """
        Description: 分页查询迭代详情
        Summary: 分页查询迭代详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_proditeration_ex_async(request, headers, runtime)

    def pagequery_proditeration_ex(
        self,
        request: yunqing_models.PagequeryProditerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProditerationResponse:
        """
        Description: 分页查询迭代详情
        Summary: 分页查询迭代详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProditerationResponse(),
            self.do_request('1.0', 'yunyou.yunqing.proditeration.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_proditeration_ex_async(
        self,
        request: yunqing_models.PagequeryProditerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProditerationResponse:
        """
        Description: 分页查询迭代详情
        Summary: 分页查询迭代详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProditerationResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.proditeration.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_prodinstance_deployunitbatch(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitbatchRequest,
    ) -> yunqing_models.CreateProdinstanceDeployunitbatchResponse:
        """
        Description: 部署单元批量创建
        Summary: 部署单元批量创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_prodinstance_deployunitbatch_ex(request, headers, runtime)

    async def create_prodinstance_deployunitbatch_async(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitbatchRequest,
    ) -> yunqing_models.CreateProdinstanceDeployunitbatchResponse:
        """
        Description: 部署单元批量创建
        Summary: 部署单元批量创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_prodinstance_deployunitbatch_ex_async(request, headers, runtime)

    def create_prodinstance_deployunitbatch_ex(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateProdinstanceDeployunitbatchResponse:
        """
        Description: 部署单元批量创建
        Summary: 部署单元批量创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateProdinstanceDeployunitbatchResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prodinstance.deployunitbatch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_prodinstance_deployunitbatch_ex_async(
        self,
        request: yunqing_models.CreateProdinstanceDeployunitbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateProdinstanceDeployunitbatchResponse:
        """
        Description: 部署单元批量创建
        Summary: 部署单元批量创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateProdinstanceDeployunitbatchResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prodinstance.deployunitbatch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_ops_app(
        self,
        request: yunqing_models.RollbackOpsAppRequest,
    ) -> yunqing_models.RollbackOpsAppResponse:
        """
        Description: 发布单应用回滚
        Summary: 发布单应用回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_ops_app_ex(request, headers, runtime)

    async def rollback_ops_app_async(
        self,
        request: yunqing_models.RollbackOpsAppRequest,
    ) -> yunqing_models.RollbackOpsAppResponse:
        """
        Description: 发布单应用回滚
        Summary: 发布单应用回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_ops_app_ex_async(request, headers, runtime)

    def rollback_ops_app_ex(
        self,
        request: yunqing_models.RollbackOpsAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RollbackOpsAppResponse:
        """
        Description: 发布单应用回滚
        Summary: 发布单应用回滚
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RollbackOpsAppResponse(),
            self.do_request('1.0', 'yunyou.yunqing.ops.app.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_ops_app_ex_async(
        self,
        request: yunqing_models.RollbackOpsAppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RollbackOpsAppResponse:
        """
        Description: 发布单应用回滚
        Summary: 发布单应用回滚
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RollbackOpsAppResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.ops.app.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def rollback_ops_product(
        self,
        request: yunqing_models.RollbackOpsProductRequest,
    ) -> yunqing_models.RollbackOpsProductResponse:
        """
        Description: 发布单产品回滚
        Summary: 发布单产品回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.rollback_ops_product_ex(request, headers, runtime)

    async def rollback_ops_product_async(
        self,
        request: yunqing_models.RollbackOpsProductRequest,
    ) -> yunqing_models.RollbackOpsProductResponse:
        """
        Description: 发布单产品回滚
        Summary: 发布单产品回滚
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.rollback_ops_product_ex_async(request, headers, runtime)

    def rollback_ops_product_ex(
        self,
        request: yunqing_models.RollbackOpsProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RollbackOpsProductResponse:
        """
        Description: 发布单产品回滚
        Summary: 发布单产品回滚
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RollbackOpsProductResponse(),
            self.do_request('1.0', 'yunyou.yunqing.ops.product.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def rollback_ops_product_ex_async(
        self,
        request: yunqing_models.RollbackOpsProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RollbackOpsProductResponse:
        """
        Description: 发布单产品回滚
        Summary: 发布单产品回滚
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RollbackOpsProductResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.ops.product.rollback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cluster_nativepod(
        self,
        request: yunqing_models.QueryClusterNativepodRequest,
    ) -> yunqing_models.QueryClusterNativepodResponse:
        """
        Description: 直接查询集群的pod信息，不是查询云游的基线！
        Summary: 查询集群pod信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cluster_nativepod_ex(request, headers, runtime)

    async def query_cluster_nativepod_async(
        self,
        request: yunqing_models.QueryClusterNativepodRequest,
    ) -> yunqing_models.QueryClusterNativepodResponse:
        """
        Description: 直接查询集群的pod信息，不是查询云游的基线！
        Summary: 查询集群pod信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cluster_nativepod_ex_async(request, headers, runtime)

    def query_cluster_nativepod_ex(
        self,
        request: yunqing_models.QueryClusterNativepodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryClusterNativepodResponse:
        """
        Description: 直接查询集群的pod信息，不是查询云游的基线！
        Summary: 查询集群pod信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryClusterNativepodResponse(),
            self.do_request('1.0', 'yunyou.yunqing.cluster.nativepod.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cluster_nativepod_ex_async(
        self,
        request: yunqing_models.QueryClusterNativepodRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryClusterNativepodResponse:
        """
        Description: 直接查询集群的pod信息，不是查询云游的基线！
        Summary: 查询集群pod信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryClusterNativepodResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.cluster.nativepod.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_baseline_appcontainers(
        self,
        request: yunqing_models.PagequeryBaselineAppcontainersRequest,
    ) -> yunqing_models.PagequeryBaselineAppcontainersResponse:
        """
        Description: 查询基线应用容器
        Summary: 查询基线应用容器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_baseline_appcontainers_ex(request, headers, runtime)

    async def pagequery_baseline_appcontainers_async(
        self,
        request: yunqing_models.PagequeryBaselineAppcontainersRequest,
    ) -> yunqing_models.PagequeryBaselineAppcontainersResponse:
        """
        Description: 查询基线应用容器
        Summary: 查询基线应用容器
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_baseline_appcontainers_ex_async(request, headers, runtime)

    def pagequery_baseline_appcontainers_ex(
        self,
        request: yunqing_models.PagequeryBaselineAppcontainersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryBaselineAppcontainersResponse:
        """
        Description: 查询基线应用容器
        Summary: 查询基线应用容器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryBaselineAppcontainersResponse(),
            self.do_request('1.0', 'yunyou.yunqing.baseline.appcontainers.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_baseline_appcontainers_ex_async(
        self,
        request: yunqing_models.PagequeryBaselineAppcontainersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryBaselineAppcontainersResponse:
        """
        Description: 查询基线应用容器
        Summary: 查询基线应用容器
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryBaselineAppcontainersResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.baseline.appcontainers.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_rollback_snapshotversion(
        self,
        request: yunqing_models.PagequeryRollbackSnapshotversionRequest,
    ) -> yunqing_models.PagequeryRollbackSnapshotversionResponse:
        """
        Description: 回滚快照查询
        Summary: 回滚快照查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_rollback_snapshotversion_ex(request, headers, runtime)

    async def pagequery_rollback_snapshotversion_async(
        self,
        request: yunqing_models.PagequeryRollbackSnapshotversionRequest,
    ) -> yunqing_models.PagequeryRollbackSnapshotversionResponse:
        """
        Description: 回滚快照查询
        Summary: 回滚快照查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_rollback_snapshotversion_ex_async(request, headers, runtime)

    def pagequery_rollback_snapshotversion_ex(
        self,
        request: yunqing_models.PagequeryRollbackSnapshotversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryRollbackSnapshotversionResponse:
        """
        Description: 回滚快照查询
        Summary: 回滚快照查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryRollbackSnapshotversionResponse(),
            self.do_request('1.0', 'yunyou.yunqing.rollback.snapshotversion.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_rollback_snapshotversion_ex_async(
        self,
        request: yunqing_models.PagequeryRollbackSnapshotversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryRollbackSnapshotversionResponse:
        """
        Description: 回滚快照查询
        Summary: 回滚快照查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryRollbackSnapshotversionResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.rollback.snapshotversion.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_envs(
        self,
        request: yunqing_models.AllEnvsRequest,
    ) -> yunqing_models.AllEnvsResponse:
        """
        Description: 云游纳管的所有环境基本信息查询
        Summary: 云游纳管的所有环境基本信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_envs_ex(request, headers, runtime)

    async def all_envs_async(
        self,
        request: yunqing_models.AllEnvsRequest,
    ) -> yunqing_models.AllEnvsResponse:
        """
        Description: 云游纳管的所有环境基本信息查询
        Summary: 云游纳管的所有环境基本信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_envs_ex_async(request, headers, runtime)

    def all_envs_ex(
        self,
        request: yunqing_models.AllEnvsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.AllEnvsResponse:
        """
        Description: 云游纳管的所有环境基本信息查询
        Summary: 云游纳管的所有环境基本信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.AllEnvsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.envs.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_envs_ex_async(
        self,
        request: yunqing_models.AllEnvsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.AllEnvsResponse:
        """
        Description: 云游纳管的所有环境基本信息查询
        Summary: 云游纳管的所有环境基本信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.AllEnvsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.envs.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_prods(
        self,
        request: yunqing_models.PagequeryProdsRequest,
    ) -> yunqing_models.PagequeryProdsResponse:
        """
        Description: 产品基线基本信息分页查询
        Summary: 产品基线基本信息分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_prods_ex(request, headers, runtime)

    async def pagequery_prods_async(
        self,
        request: yunqing_models.PagequeryProdsRequest,
    ) -> yunqing_models.PagequeryProdsResponse:
        """
        Description: 产品基线基本信息分页查询
        Summary: 产品基线基本信息分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_prods_ex_async(request, headers, runtime)

    def pagequery_prods_ex(
        self,
        request: yunqing_models.PagequeryProdsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProdsResponse:
        """
        Description: 产品基线基本信息分页查询
        Summary: 产品基线基本信息分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProdsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_prods_ex_async(
        self,
        request: yunqing_models.PagequeryProdsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProdsResponse:
        """
        Description: 产品基线基本信息分页查询
        Summary: 产品基线基本信息分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProdsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_prods_resources(
        self,
        request: yunqing_models.PagequeryProdsResourcesRequest,
    ) -> yunqing_models.PagequeryProdsResourcesResponse:
        """
        Description: 产品基线资源元数据查询
        Summary: 产品基线资源元数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_prods_resources_ex(request, headers, runtime)

    async def pagequery_prods_resources_async(
        self,
        request: yunqing_models.PagequeryProdsResourcesRequest,
    ) -> yunqing_models.PagequeryProdsResourcesResponse:
        """
        Description: 产品基线资源元数据查询
        Summary: 产品基线资源元数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_prods_resources_ex_async(request, headers, runtime)

    def pagequery_prods_resources_ex(
        self,
        request: yunqing_models.PagequeryProdsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProdsResourcesResponse:
        """
        Description: 产品基线资源元数据查询
        Summary: 产品基线资源元数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProdsResourcesResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.resources.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_prods_resources_ex_async(
        self,
        request: yunqing_models.PagequeryProdsResourcesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProdsResourcesResponse:
        """
        Description: 产品基线资源元数据查询
        Summary: 产品基线资源元数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProdsResourcesResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.resources.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_resourceinstances_containers(
        self,
        request: yunqing_models.PagequeryResourceinstancesContainersRequest,
    ) -> yunqing_models.PagequeryResourceinstancesContainersResponse:
        """
        Description: 产品基线容器实例详情分页查询
        Summary: 产品基线容器实例详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_resourceinstances_containers_ex(request, headers, runtime)

    async def pagequery_resourceinstances_containers_async(
        self,
        request: yunqing_models.PagequeryResourceinstancesContainersRequest,
    ) -> yunqing_models.PagequeryResourceinstancesContainersResponse:
        """
        Description: 产品基线容器实例详情分页查询
        Summary: 产品基线容器实例详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_resourceinstances_containers_ex_async(request, headers, runtime)

    def pagequery_resourceinstances_containers_ex(
        self,
        request: yunqing_models.PagequeryResourceinstancesContainersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryResourceinstancesContainersResponse:
        """
        Description: 产品基线容器实例详情分页查询
        Summary: 产品基线容器实例详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryResourceinstancesContainersResponse(),
            self.do_request('1.0', 'yunyou.yunqing.resourceinstances.containers.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_resourceinstances_containers_ex_async(
        self,
        request: yunqing_models.PagequeryResourceinstancesContainersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryResourceinstancesContainersResponse:
        """
        Description: 产品基线容器实例详情分页查询
        Summary: 产品基线容器实例详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryResourceinstancesContainersResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.resourceinstances.containers.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_prods_apps(
        self,
        request: yunqing_models.PagequeryProdsAppsRequest,
    ) -> yunqing_models.PagequeryProdsAppsResponse:
        """
        Description: 产品所属应用基线元数据分页查询
        Summary: 产品所属应用基线元数据分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_prods_apps_ex(request, headers, runtime)

    async def pagequery_prods_apps_async(
        self,
        request: yunqing_models.PagequeryProdsAppsRequest,
    ) -> yunqing_models.PagequeryProdsAppsResponse:
        """
        Description: 产品所属应用基线元数据分页查询
        Summary: 产品所属应用基线元数据分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_prods_apps_ex_async(request, headers, runtime)

    def pagequery_prods_apps_ex(
        self,
        request: yunqing_models.PagequeryProdsAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProdsAppsResponse:
        """
        Description: 产品所属应用基线元数据分页查询
        Summary: 产品所属应用基线元数据分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProdsAppsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.apps.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_prods_apps_ex_async(
        self,
        request: yunqing_models.PagequeryProdsAppsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryProdsAppsResponse:
        """
        Description: 产品所属应用基线元数据分页查询
        Summary: 产品所属应用基线元数据分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryProdsAppsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.apps.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_prods_deploymentunits(
        self,
        request: yunqing_models.QueryProdsDeploymentunitsRequest,
    ) -> yunqing_models.QueryProdsDeploymentunitsResponse:
        """
        Description: 产品部署单元实例列表查询
        Summary: 产品部署单元实例列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_prods_deploymentunits_ex(request, headers, runtime)

    async def query_prods_deploymentunits_async(
        self,
        request: yunqing_models.QueryProdsDeploymentunitsRequest,
    ) -> yunqing_models.QueryProdsDeploymentunitsResponse:
        """
        Description: 产品部署单元实例列表查询
        Summary: 产品部署单元实例列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_prods_deploymentunits_ex_async(request, headers, runtime)

    def query_prods_deploymentunits_ex(
        self,
        request: yunqing_models.QueryProdsDeploymentunitsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryProdsDeploymentunitsResponse:
        """
        Description: 产品部署单元实例列表查询
        Summary: 产品部署单元实例列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryProdsDeploymentunitsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.deploymentunits.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_prods_deploymentunits_ex_async(
        self,
        request: yunqing_models.QueryProdsDeploymentunitsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.QueryProdsDeploymentunitsResponse:
        """
        Description: 产品部署单元实例列表查询
        Summary: 产品部署单元实例列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.QueryProdsDeploymentunitsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.deploymentunits.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_resourceinstances_lbs(
        self,
        request: yunqing_models.PagequeryResourceinstancesLbsRequest,
    ) -> yunqing_models.PagequeryResourceinstancesLbsResponse:
        """
        Description: 产品基线应用所属lb资源分页查询
        Summary: 产品基线应用所属lb资源分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_resourceinstances_lbs_ex(request, headers, runtime)

    async def pagequery_resourceinstances_lbs_async(
        self,
        request: yunqing_models.PagequeryResourceinstancesLbsRequest,
    ) -> yunqing_models.PagequeryResourceinstancesLbsResponse:
        """
        Description: 产品基线应用所属lb资源分页查询
        Summary: 产品基线应用所属lb资源分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_resourceinstances_lbs_ex_async(request, headers, runtime)

    def pagequery_resourceinstances_lbs_ex(
        self,
        request: yunqing_models.PagequeryResourceinstancesLbsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryResourceinstancesLbsResponse:
        """
        Description: 产品基线应用所属lb资源分页查询
        Summary: 产品基线应用所属lb资源分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryResourceinstancesLbsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.resourceinstances.lbs.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_resourceinstances_lbs_ex_async(
        self,
        request: yunqing_models.PagequeryResourceinstancesLbsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.PagequeryResourceinstancesLbsResponse:
        """
        Description: 产品基线应用所属lb资源分页查询
        Summary: 产品基线应用所属lb资源分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.PagequeryResourceinstancesLbsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.resourceinstances.lbs.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_prods_appops(
        self,
        request: yunqing_models.CreateProdsAppopsRequest,
    ) -> yunqing_models.CreateProdsAppopsResponse:
        """
        Description: 产品所属应用运维发布单创建
        Summary: 产品所属应用运维发布单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_prods_appops_ex(request, headers, runtime)

    async def create_prods_appops_async(
        self,
        request: yunqing_models.CreateProdsAppopsRequest,
    ) -> yunqing_models.CreateProdsAppopsResponse:
        """
        Description: 产品所属应用运维发布单创建
        Summary: 产品所属应用运维发布单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_prods_appops_ex_async(request, headers, runtime)

    def create_prods_appops_ex(
        self,
        request: yunqing_models.CreateProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateProdsAppopsResponse:
        """
        Description: 产品所属应用运维发布单创建
        Summary: 产品所属应用运维发布单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateProdsAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_prods_appops_ex_async(
        self,
        request: yunqing_models.CreateProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CreateProdsAppopsResponse:
        """
        Description: 产品所属应用运维发布单创建
        Summary: 产品所属应用运维发布单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CreateProdsAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.appops.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_prods_appops(
        self,
        request: yunqing_models.GetProdsAppopsRequest,
    ) -> yunqing_models.GetProdsAppopsResponse:
        """
        Description: 运维发布单查询
        Summary: 运维发布单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_prods_appops_ex(request, headers, runtime)

    async def get_prods_appops_async(
        self,
        request: yunqing_models.GetProdsAppopsRequest,
    ) -> yunqing_models.GetProdsAppopsResponse:
        """
        Description: 运维发布单查询
        Summary: 运维发布单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_prods_appops_ex_async(request, headers, runtime)

    def get_prods_appops_ex(
        self,
        request: yunqing_models.GetProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetProdsAppopsResponse:
        """
        Description: 运维发布单查询
        Summary: 运维发布单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetProdsAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_prods_appops_ex_async(
        self,
        request: yunqing_models.GetProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.GetProdsAppopsResponse:
        """
        Description: 运维发布单查询
        Summary: 运维发布单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.GetProdsAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.appops.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_prods_appops(
        self,
        request: yunqing_models.CancelProdsAppopsRequest,
    ) -> yunqing_models.CancelProdsAppopsResponse:
        """
        Description: 发布单取消
        Summary: 发布单取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_prods_appops_ex(request, headers, runtime)

    async def cancel_prods_appops_async(
        self,
        request: yunqing_models.CancelProdsAppopsRequest,
    ) -> yunqing_models.CancelProdsAppopsResponse:
        """
        Description: 发布单取消
        Summary: 发布单取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_prods_appops_ex_async(request, headers, runtime)

    def cancel_prods_appops_ex(
        self,
        request: yunqing_models.CancelProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CancelProdsAppopsResponse:
        """
        Description: 发布单取消
        Summary: 发布单取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CancelProdsAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_prods_appops_ex_async(
        self,
        request: yunqing_models.CancelProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.CancelProdsAppopsResponse:
        """
        Description: 发布单取消
        Summary: 发布单取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.CancelProdsAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.appops.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_prods_appops(
        self,
        request: yunqing_models.RetryProdsAppopsRequest,
    ) -> yunqing_models.RetryProdsAppopsResponse:
        """
        Description: 发布单重试
        Summary: 发布单重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_prods_appops_ex(request, headers, runtime)

    async def retry_prods_appops_async(
        self,
        request: yunqing_models.RetryProdsAppopsRequest,
    ) -> yunqing_models.RetryProdsAppopsResponse:
        """
        Description: 发布单重试
        Summary: 发布单重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_prods_appops_ex_async(request, headers, runtime)

    def retry_prods_appops_ex(
        self,
        request: yunqing_models.RetryProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RetryProdsAppopsResponse:
        """
        Description: 发布单重试
        Summary: 发布单重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RetryProdsAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_prods_appops_ex_async(
        self,
        request: yunqing_models.RetryProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.RetryProdsAppopsResponse:
        """
        Description: 发布单重试
        Summary: 发布单重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.RetryProdsAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.appops.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scalein_prods_appops(
        self,
        request: yunqing_models.ScaleinProdsAppopsRequest,
    ) -> yunqing_models.ScaleinProdsAppopsResponse:
        """
        Description: 应用缩容
        Summary: 应用缩容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scalein_prods_appops_ex(request, headers, runtime)

    async def scalein_prods_appops_async(
        self,
        request: yunqing_models.ScaleinProdsAppopsRequest,
    ) -> yunqing_models.ScaleinProdsAppopsResponse:
        """
        Description: 应用缩容
        Summary: 应用缩容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scalein_prods_appops_ex_async(request, headers, runtime)

    def scalein_prods_appops_ex(
        self,
        request: yunqing_models.ScaleinProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleinProdsAppopsResponse:
        """
        Description: 应用缩容
        Summary: 应用缩容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleinProdsAppopsResponse(),
            self.do_request('1.0', 'yunyou.yunqing.prods.appops.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scalein_prods_appops_ex_async(
        self,
        request: yunqing_models.ScaleinProdsAppopsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> yunqing_models.ScaleinProdsAppopsResponse:
        """
        Description: 应用缩容
        Summary: 应用缩容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            yunqing_models.ScaleinProdsAppopsResponse(),
            await self.do_request_async('1.0', 'yunyou.yunqing.prods.appops.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
