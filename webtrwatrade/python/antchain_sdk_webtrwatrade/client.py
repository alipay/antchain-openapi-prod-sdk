# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_webtrwatrade import models as webtrwatrade_models
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
        config: webtrwatrade_models.Config,
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
            # 机构联系人信息
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
                    'sdk_version': '1.0.25',
                    '_prod_code': 'WEBTRWATRADE',
                    '_prod_channel': 'default'
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
            # 机构联系人信息
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
                    'sdk_version': '1.0.25',
                    '_prod_code': 'WEBTRWATRADE',
                    '_prod_channel': 'default'
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

    def create_issuer_project(
        self,
        request: webtrwatrade_models.CreateIssuerProjectRequest,
    ) -> webtrwatrade_models.CreateIssuerProjectResponse:
        """
        Description: 发行机构创建资产项目
        Summary: 发行机构创建资产项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_issuer_project_ex(request, headers, runtime)

    async def create_issuer_project_async(
        self,
        request: webtrwatrade_models.CreateIssuerProjectRequest,
    ) -> webtrwatrade_models.CreateIssuerProjectResponse:
        """
        Description: 发行机构创建资产项目
        Summary: 发行机构创建资产项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_issuer_project_ex_async(request, headers, runtime)

    def create_issuer_project_ex(
        self,
        request: webtrwatrade_models.CreateIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CreateIssuerProjectResponse:
        """
        Description: 发行机构创建资产项目
        Summary: 发行机构创建资产项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CreateIssuerProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_issuer_project_ex_async(
        self,
        request: webtrwatrade_models.CreateIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CreateIssuerProjectResponse:
        """
        Description: 发行机构创建资产项目
        Summary: 发行机构创建资产项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CreateIssuerProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_issuer_project(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectRequest,
    ) -> webtrwatrade_models.PagequeryIssuerProjectResponse:
        """
        Description: 分页查询发行机构持有的资产项目信息
        Summary: 分页查询发行机构项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_issuer_project_ex(request, headers, runtime)

    async def pagequery_issuer_project_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectRequest,
    ) -> webtrwatrade_models.PagequeryIssuerProjectResponse:
        """
        Description: 分页查询发行机构持有的资产项目信息
        Summary: 分页查询发行机构项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_issuer_project_ex_async(request, headers, runtime)

    def pagequery_issuer_project_ex(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerProjectResponse:
        """
        Description: 分页查询发行机构持有的资产项目信息
        Summary: 分页查询发行机构项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.project.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_issuer_project_ex_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerProjectResponse:
        """
        Description: 分页查询发行机构持有的资产项目信息
        Summary: 分页查询发行机构项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.project.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_distributor_project(
        self,
        request: webtrwatrade_models.PagequeryDistributorProjectRequest,
    ) -> webtrwatrade_models.PagequeryDistributorProjectResponse:
        """
        Description: 分页查询代销机构代销的资产项目信息
        Summary: 分页查询代销机构项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_distributor_project_ex(request, headers, runtime)

    async def pagequery_distributor_project_async(
        self,
        request: webtrwatrade_models.PagequeryDistributorProjectRequest,
    ) -> webtrwatrade_models.PagequeryDistributorProjectResponse:
        """
        Description: 分页查询代销机构代销的资产项目信息
        Summary: 分页查询代销机构项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_distributor_project_ex_async(request, headers, runtime)

    def pagequery_distributor_project_ex(
        self,
        request: webtrwatrade_models.PagequeryDistributorProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryDistributorProjectResponse:
        """
        Description: 分页查询代销机构代销的资产项目信息
        Summary: 分页查询代销机构项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryDistributorProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.project.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_distributor_project_ex_async(
        self,
        request: webtrwatrade_models.PagequeryDistributorProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryDistributorProjectResponse:
        """
        Description: 分页查询代销机构代销的资产项目信息
        Summary: 分页查询代销机构项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryDistributorProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.project.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pause_issuer_project(
        self,
        request: webtrwatrade_models.PauseIssuerProjectRequest,
    ) -> webtrwatrade_models.PauseIssuerProjectResponse:
        """
        Description: 发行机构暂停项目
        Summary: 发行机构暂停项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pause_issuer_project_ex(request, headers, runtime)

    async def pause_issuer_project_async(
        self,
        request: webtrwatrade_models.PauseIssuerProjectRequest,
    ) -> webtrwatrade_models.PauseIssuerProjectResponse:
        """
        Description: 发行机构暂停项目
        Summary: 发行机构暂停项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pause_issuer_project_ex_async(request, headers, runtime)

    def pause_issuer_project_ex(
        self,
        request: webtrwatrade_models.PauseIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PauseIssuerProjectResponse:
        """
        Description: 发行机构暂停项目
        Summary: 发行机构暂停项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PauseIssuerProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.project.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pause_issuer_project_ex_async(
        self,
        request: webtrwatrade_models.PauseIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PauseIssuerProjectResponse:
        """
        Description: 发行机构暂停项目
        Summary: 发行机构暂停项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PauseIssuerProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.project.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_issuer_project(
        self,
        request: webtrwatrade_models.EnableIssuerProjectRequest,
    ) -> webtrwatrade_models.EnableIssuerProjectResponse:
        """
        Description: 发行机构激活项目(使项目生效)
        Summary: 发行机构激活项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_issuer_project_ex(request, headers, runtime)

    async def enable_issuer_project_async(
        self,
        request: webtrwatrade_models.EnableIssuerProjectRequest,
    ) -> webtrwatrade_models.EnableIssuerProjectResponse:
        """
        Description: 发行机构激活项目(使项目生效)
        Summary: 发行机构激活项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_issuer_project_ex_async(request, headers, runtime)

    def enable_issuer_project_ex(
        self,
        request: webtrwatrade_models.EnableIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.EnableIssuerProjectResponse:
        """
        Description: 发行机构激活项目(使项目生效)
        Summary: 发行机构激活项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.EnableIssuerProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.project.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_issuer_project_ex_async(
        self,
        request: webtrwatrade_models.EnableIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.EnableIssuerProjectResponse:
        """
        Description: 发行机构激活项目(使项目生效)
        Summary: 发行机构激活项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.EnableIssuerProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.project.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_issuer_project(
        self,
        request: webtrwatrade_models.DetailIssuerProjectRequest,
    ) -> webtrwatrade_models.DetailIssuerProjectResponse:
        """
        Description: 发行机构查询项目详情
        Summary: 发行机构查询项目详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_issuer_project_ex(request, headers, runtime)

    async def detail_issuer_project_async(
        self,
        request: webtrwatrade_models.DetailIssuerProjectRequest,
    ) -> webtrwatrade_models.DetailIssuerProjectResponse:
        """
        Description: 发行机构查询项目详情
        Summary: 发行机构查询项目详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_issuer_project_ex_async(request, headers, runtime)

    def detail_issuer_project_ex(
        self,
        request: webtrwatrade_models.DetailIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailIssuerProjectResponse:
        """
        Description: 发行机构查询项目详情
        Summary: 发行机构查询项目详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailIssuerProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.project.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_issuer_project_ex_async(
        self,
        request: webtrwatrade_models.DetailIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailIssuerProjectResponse:
        """
        Description: 发行机构查询项目详情
        Summary: 发行机构查询项目详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailIssuerProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.project.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_distributor_project(
        self,
        request: webtrwatrade_models.DetailDistributorProjectRequest,
    ) -> webtrwatrade_models.DetailDistributorProjectResponse:
        """
        Description: 代销机构查询项目详情
        Summary: 代销机构查询项目详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_distributor_project_ex(request, headers, runtime)

    async def detail_distributor_project_async(
        self,
        request: webtrwatrade_models.DetailDistributorProjectRequest,
    ) -> webtrwatrade_models.DetailDistributorProjectResponse:
        """
        Description: 代销机构查询项目详情
        Summary: 代销机构查询项目详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_distributor_project_ex_async(request, headers, runtime)

    def detail_distributor_project_ex(
        self,
        request: webtrwatrade_models.DetailDistributorProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailDistributorProjectResponse:
        """
        Description: 代销机构查询项目详情
        Summary: 代销机构查询项目详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailDistributorProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.project.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_distributor_project_ex_async(
        self,
        request: webtrwatrade_models.DetailDistributorProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailDistributorProjectResponse:
        """
        Description: 代销机构查询项目详情
        Summary: 代销机构查询项目详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailDistributorProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.project.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_platform_project(
        self,
        request: webtrwatrade_models.PagequeryPlatformProjectRequest,
    ) -> webtrwatrade_models.PagequeryPlatformProjectResponse:
        """
        Description: 平台管理员分页查询所有项目
        Summary: 平台管理分页查询项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_platform_project_ex(request, headers, runtime)

    async def pagequery_platform_project_async(
        self,
        request: webtrwatrade_models.PagequeryPlatformProjectRequest,
    ) -> webtrwatrade_models.PagequeryPlatformProjectResponse:
        """
        Description: 平台管理员分页查询所有项目
        Summary: 平台管理分页查询项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_platform_project_ex_async(request, headers, runtime)

    def pagequery_platform_project_ex(
        self,
        request: webtrwatrade_models.PagequeryPlatformProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryPlatformProjectResponse:
        """
        Description: 平台管理员分页查询所有项目
        Summary: 平台管理分页查询项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryPlatformProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.platform.project.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_platform_project_ex_async(
        self,
        request: webtrwatrade_models.PagequeryPlatformProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryPlatformProjectResponse:
        """
        Description: 平台管理员分页查询所有项目
        Summary: 平台管理分页查询项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryPlatformProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.platform.project.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_issuer_projectwithrole(
        self,
        request: webtrwatrade_models.DetailIssuerProjectwithroleRequest,
    ) -> webtrwatrade_models.DetailIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_issuer_projectwithrole_ex(request, headers, runtime)

    async def detail_issuer_projectwithrole_async(
        self,
        request: webtrwatrade_models.DetailIssuerProjectwithroleRequest,
    ) -> webtrwatrade_models.DetailIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_issuer_projectwithrole_ex_async(request, headers, runtime)

    def detail_issuer_projectwithrole_ex(
        self,
        request: webtrwatrade_models.DetailIssuerProjectwithroleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailIssuerProjectwithroleResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.projectwithrole.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_issuer_projectwithrole_ex_async(
        self,
        request: webtrwatrade_models.DetailIssuerProjectwithroleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailIssuerProjectwithroleResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.projectwithrole.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_crossaccount(
        self,
        request: webtrwatrade_models.ListIssuerCrossaccountRequest,
    ) -> webtrwatrade_models.ListIssuerCrossaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_crossaccount_ex(request, headers, runtime)

    async def list_issuer_crossaccount_async(
        self,
        request: webtrwatrade_models.ListIssuerCrossaccountRequest,
    ) -> webtrwatrade_models.ListIssuerCrossaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_crossaccount_ex_async(request, headers, runtime)

    def list_issuer_crossaccount_ex(
        self,
        request: webtrwatrade_models.ListIssuerCrossaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerCrossaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerCrossaccountResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.crossaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_crossaccount_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerCrossaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerCrossaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerCrossaccountResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.crossaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributor_crossaccount(
        self,
        request: webtrwatrade_models.ListDistributorCrossaccountRequest,
    ) -> webtrwatrade_models.ListDistributorCrossaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributor_crossaccount_ex(request, headers, runtime)

    async def list_distributor_crossaccount_async(
        self,
        request: webtrwatrade_models.ListDistributorCrossaccountRequest,
    ) -> webtrwatrade_models.ListDistributorCrossaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributor_crossaccount_ex_async(request, headers, runtime)

    def list_distributor_crossaccount_ex(
        self,
        request: webtrwatrade_models.ListDistributorCrossaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorCrossaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorCrossaccountResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.crossaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributor_crossaccount_ex_async(
        self,
        request: webtrwatrade_models.ListDistributorCrossaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorCrossaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorCrossaccountResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.crossaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_issuer_datasummary(
        self,
        request: webtrwatrade_models.CountIssuerDatasummaryRequest,
    ) -> webtrwatrade_models.CountIssuerDatasummaryResponse:
        """
        Description: 发行机构获取总览统计数据项
        Summary: 发行机构获取总览统计数据项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_issuer_datasummary_ex(request, headers, runtime)

    async def count_issuer_datasummary_async(
        self,
        request: webtrwatrade_models.CountIssuerDatasummaryRequest,
    ) -> webtrwatrade_models.CountIssuerDatasummaryResponse:
        """
        Description: 发行机构获取总览统计数据项
        Summary: 发行机构获取总览统计数据项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_issuer_datasummary_ex_async(request, headers, runtime)

    def count_issuer_datasummary_ex(
        self,
        request: webtrwatrade_models.CountIssuerDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CountIssuerDatasummaryResponse:
        """
        Description: 发行机构获取总览统计数据项
        Summary: 发行机构获取总览统计数据项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CountIssuerDatasummaryResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.datasummary.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_issuer_datasummary_ex_async(
        self,
        request: webtrwatrade_models.CountIssuerDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CountIssuerDatasummaryResponse:
        """
        Description: 发行机构获取总览统计数据项
        Summary: 发行机构获取总览统计数据项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CountIssuerDatasummaryResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.datasummary.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_distributor_datasummary(
        self,
        request: webtrwatrade_models.CountDistributorDatasummaryRequest,
    ) -> webtrwatrade_models.CountDistributorDatasummaryResponse:
        """
        Description: 代销机构获取总览统计数据项
        Summary: 代销机构获取总览统计数据项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_distributor_datasummary_ex(request, headers, runtime)

    async def count_distributor_datasummary_async(
        self,
        request: webtrwatrade_models.CountDistributorDatasummaryRequest,
    ) -> webtrwatrade_models.CountDistributorDatasummaryResponse:
        """
        Description: 代销机构获取总览统计数据项
        Summary: 代销机构获取总览统计数据项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_distributor_datasummary_ex_async(request, headers, runtime)

    def count_distributor_datasummary_ex(
        self,
        request: webtrwatrade_models.CountDistributorDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CountDistributorDatasummaryResponse:
        """
        Description: 代销机构获取总览统计数据项
        Summary: 代销机构获取总览统计数据项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CountDistributorDatasummaryResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.datasummary.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_distributor_datasummary_ex_async(
        self,
        request: webtrwatrade_models.CountDistributorDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CountDistributorDatasummaryResponse:
        """
        Description: 代销机构获取总览统计数据项
        Summary: 代销机构获取总览统计数据项
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CountDistributorDatasummaryResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.datasummary.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_datasummary(
        self,
        request: webtrwatrade_models.ListIssuerDatasummaryRequest,
    ) -> webtrwatrade_models.ListIssuerDatasummaryResponse:
        """
        Description: 发行机构获取历史资产价值
        Summary: 发行机构获取历史资产价值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_datasummary_ex(request, headers, runtime)

    async def list_issuer_datasummary_async(
        self,
        request: webtrwatrade_models.ListIssuerDatasummaryRequest,
    ) -> webtrwatrade_models.ListIssuerDatasummaryResponse:
        """
        Description: 发行机构获取历史资产价值
        Summary: 发行机构获取历史资产价值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_datasummary_ex_async(request, headers, runtime)

    def list_issuer_datasummary_ex(
        self,
        request: webtrwatrade_models.ListIssuerDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerDatasummaryResponse:
        """
        Description: 发行机构获取历史资产价值
        Summary: 发行机构获取历史资产价值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerDatasummaryResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.datasummary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_datasummary_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerDatasummaryResponse:
        """
        Description: 发行机构获取历史资产价值
        Summary: 发行机构获取历史资产价值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerDatasummaryResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.datasummary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributor_datasummary(
        self,
        request: webtrwatrade_models.ListDistributorDatasummaryRequest,
    ) -> webtrwatrade_models.ListDistributorDatasummaryResponse:
        """
        Description: 代销机构获取历史资产价值
        Summary: 代销机构获取历史资产价值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributor_datasummary_ex(request, headers, runtime)

    async def list_distributor_datasummary_async(
        self,
        request: webtrwatrade_models.ListDistributorDatasummaryRequest,
    ) -> webtrwatrade_models.ListDistributorDatasummaryResponse:
        """
        Description: 代销机构获取历史资产价值
        Summary: 代销机构获取历史资产价值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributor_datasummary_ex_async(request, headers, runtime)

    def list_distributor_datasummary_ex(
        self,
        request: webtrwatrade_models.ListDistributorDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorDatasummaryResponse:
        """
        Description: 代销机构获取历史资产价值
        Summary: 代销机构获取历史资产价值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorDatasummaryResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.datasummary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributor_datasummary_ex_async(
        self,
        request: webtrwatrade_models.ListDistributorDatasummaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorDatasummaryResponse:
        """
        Description: 代销机构获取历史资产价值
        Summary: 代销机构获取历史资产价值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorDatasummaryResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.datasummary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_institution(
        self,
        request: webtrwatrade_models.ListIssuerInstitutionRequest,
    ) -> webtrwatrade_models.ListIssuerInstitutionResponse:
        """
        Description: 查询代销机构列表
        Summary: 查询代销机构列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_institution_ex(request, headers, runtime)

    async def list_issuer_institution_async(
        self,
        request: webtrwatrade_models.ListIssuerInstitutionRequest,
    ) -> webtrwatrade_models.ListIssuerInstitutionResponse:
        """
        Description: 查询代销机构列表
        Summary: 查询代销机构列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_institution_ex_async(request, headers, runtime)

    def list_issuer_institution_ex(
        self,
        request: webtrwatrade_models.ListIssuerInstitutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerInstitutionResponse:
        """
        Description: 查询代销机构列表
        Summary: 查询代销机构列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerInstitutionResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.institution.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_institution_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerInstitutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerInstitutionResponse:
        """
        Description: 查询代销机构列表
        Summary: 查询代销机构列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerInstitutionResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.institution.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_issuer_key(
        self,
        request: webtrwatrade_models.PagequeryIssuerKeyRequest,
    ) -> webtrwatrade_models.PagequeryIssuerKeyResponse:
        """
        Description: 分页查询密钥
        Summary: 分页查询密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_issuer_key_ex(request, headers, runtime)

    async def pagequery_issuer_key_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerKeyRequest,
    ) -> webtrwatrade_models.PagequeryIssuerKeyResponse:
        """
        Description: 分页查询密钥
        Summary: 分页查询密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_issuer_key_ex_async(request, headers, runtime)

    def pagequery_issuer_key_ex(
        self,
        request: webtrwatrade_models.PagequeryIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerKeyResponse:
        """
        Description: 分页查询密钥
        Summary: 分页查询密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerKeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.key.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_issuer_key_ex_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerKeyResponse:
        """
        Description: 分页查询密钥
        Summary: 分页查询密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerKeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.key.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_issuer_key(
        self,
        request: webtrwatrade_models.DetailIssuerKeyRequest,
    ) -> webtrwatrade_models.DetailIssuerKeyResponse:
        """
        Description: 查询密钥详情
        Summary: 查询密钥详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_issuer_key_ex(request, headers, runtime)

    async def detail_issuer_key_async(
        self,
        request: webtrwatrade_models.DetailIssuerKeyRequest,
    ) -> webtrwatrade_models.DetailIssuerKeyResponse:
        """
        Description: 查询密钥详情
        Summary: 查询密钥详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_issuer_key_ex_async(request, headers, runtime)

    def detail_issuer_key_ex(
        self,
        request: webtrwatrade_models.DetailIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailIssuerKeyResponse:
        """
        Description: 查询密钥详情
        Summary: 查询密钥详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailIssuerKeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.key.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_issuer_key_ex_async(
        self,
        request: webtrwatrade_models.DetailIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DetailIssuerKeyResponse:
        """
        Description: 查询密钥详情
        Summary: 查询密钥详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DetailIssuerKeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.key.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_issuer_key(
        self,
        request: webtrwatrade_models.CreateIssuerKeyRequest,
    ) -> webtrwatrade_models.CreateIssuerKeyResponse:
        """
        Description: 创建密钥
        Summary: 创建密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_issuer_key_ex(request, headers, runtime)

    async def create_issuer_key_async(
        self,
        request: webtrwatrade_models.CreateIssuerKeyRequest,
    ) -> webtrwatrade_models.CreateIssuerKeyResponse:
        """
        Description: 创建密钥
        Summary: 创建密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_issuer_key_ex_async(request, headers, runtime)

    def create_issuer_key_ex(
        self,
        request: webtrwatrade_models.CreateIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CreateIssuerKeyResponse:
        """
        Description: 创建密钥
        Summary: 创建密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CreateIssuerKeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.key.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_issuer_key_ex_async(
        self,
        request: webtrwatrade_models.CreateIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CreateIssuerKeyResponse:
        """
        Description: 创建密钥
        Summary: 创建密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CreateIssuerKeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.key.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_issuer_key(
        self,
        request: webtrwatrade_models.DeleteIssuerKeyRequest,
    ) -> webtrwatrade_models.DeleteIssuerKeyResponse:
        """
        Description: 删除密钥
        Summary: 删除密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_issuer_key_ex(request, headers, runtime)

    async def delete_issuer_key_async(
        self,
        request: webtrwatrade_models.DeleteIssuerKeyRequest,
    ) -> webtrwatrade_models.DeleteIssuerKeyResponse:
        """
        Description: 删除密钥
        Summary: 删除密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_issuer_key_ex_async(request, headers, runtime)

    def delete_issuer_key_ex(
        self,
        request: webtrwatrade_models.DeleteIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DeleteIssuerKeyResponse:
        """
        Description: 删除密钥
        Summary: 删除密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DeleteIssuerKeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.key.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_issuer_key_ex_async(
        self,
        request: webtrwatrade_models.DeleteIssuerKeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DeleteIssuerKeyResponse:
        """
        Description: 删除密钥
        Summary: 删除密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DeleteIssuerKeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.key.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_operationlog(
        self,
        request: webtrwatrade_models.ListIssuerOperationlogRequest,
    ) -> webtrwatrade_models.ListIssuerOperationlogResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_operationlog_ex(request, headers, runtime)

    async def list_issuer_operationlog_async(
        self,
        request: webtrwatrade_models.ListIssuerOperationlogRequest,
    ) -> webtrwatrade_models.ListIssuerOperationlogResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_operationlog_ex_async(request, headers, runtime)

    def list_issuer_operationlog_ex(
        self,
        request: webtrwatrade_models.ListIssuerOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerOperationlogResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerOperationlogResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_operationlog_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerOperationlogResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerOperationlogResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributor_operationlog(
        self,
        request: webtrwatrade_models.ListDistributorOperationlogRequest,
    ) -> webtrwatrade_models.ListDistributorOperationlogResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributor_operationlog_ex(request, headers, runtime)

    async def list_distributor_operationlog_async(
        self,
        request: webtrwatrade_models.ListDistributorOperationlogRequest,
    ) -> webtrwatrade_models.ListDistributorOperationlogResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributor_operationlog_ex_async(request, headers, runtime)

    def list_distributor_operationlog_ex(
        self,
        request: webtrwatrade_models.ListDistributorOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorOperationlogResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorOperationlogResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributor_operationlog_ex_async(
        self,
        request: webtrwatrade_models.ListDistributorOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorOperationlogResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorOperationlogResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_issuer_projectkey(
        self,
        request: webtrwatrade_models.AddIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.AddIssuerProjectkeyResponse:
        """
        Description: 发行机构添加项目密钥
        Summary: 发行机构添加项目密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_issuer_projectkey_ex(request, headers, runtime)

    async def add_issuer_projectkey_async(
        self,
        request: webtrwatrade_models.AddIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.AddIssuerProjectkeyResponse:
        """
        Description: 发行机构添加项目密钥
        Summary: 发行机构添加项目密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_issuer_projectkey_ex_async(request, headers, runtime)

    def add_issuer_projectkey_ex(
        self,
        request: webtrwatrade_models.AddIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.AddIssuerProjectkeyResponse:
        """
        Description: 发行机构添加项目密钥
        Summary: 发行机构添加项目密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.AddIssuerProjectkeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.projectkey.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_issuer_projectkey_ex_async(
        self,
        request: webtrwatrade_models.AddIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.AddIssuerProjectkeyResponse:
        """
        Description: 发行机构添加项目密钥
        Summary: 发行机构添加项目密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.AddIssuerProjectkeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.projectkey.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_issuer_projectkey(
        self,
        request: webtrwatrade_models.DeleteIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.DeleteIssuerProjectkeyResponse:
        """
        Description: 发行机构删除项目密钥
        Summary: 发行机构删除项目密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_issuer_projectkey_ex(request, headers, runtime)

    async def delete_issuer_projectkey_async(
        self,
        request: webtrwatrade_models.DeleteIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.DeleteIssuerProjectkeyResponse:
        """
        Description: 发行机构删除项目密钥
        Summary: 发行机构删除项目密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_issuer_projectkey_ex_async(request, headers, runtime)

    def delete_issuer_projectkey_ex(
        self,
        request: webtrwatrade_models.DeleteIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DeleteIssuerProjectkeyResponse:
        """
        Description: 发行机构删除项目密钥
        Summary: 发行机构删除项目密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DeleteIssuerProjectkeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.projectkey.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_issuer_projectkey_ex_async(
        self,
        request: webtrwatrade_models.DeleteIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DeleteIssuerProjectkeyResponse:
        """
        Description: 发行机构删除项目密钥
        Summary: 发行机构删除项目密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DeleteIssuerProjectkeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.projectkey.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_projectkey(
        self,
        request: webtrwatrade_models.ListIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.ListIssuerProjectkeyResponse:
        """
        Description: 发行机构获取项目密钥列表
        Summary: 发行机构获取项目密钥列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_projectkey_ex(request, headers, runtime)

    async def list_issuer_projectkey_async(
        self,
        request: webtrwatrade_models.ListIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.ListIssuerProjectkeyResponse:
        """
        Description: 发行机构获取项目密钥列表
        Summary: 发行机构获取项目密钥列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_projectkey_ex_async(request, headers, runtime)

    def list_issuer_projectkey_ex(
        self,
        request: webtrwatrade_models.ListIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerProjectkeyResponse:
        """
        Description: 发行机构获取项目密钥列表
        Summary: 发行机构获取项目密钥列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerProjectkeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.projectkey.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_projectkey_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerProjectkeyResponse:
        """
        Description: 发行机构获取项目密钥列表
        Summary: 发行机构获取项目密钥列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerProjectkeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.projectkey.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_issuer_projectkey(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.PagequeryIssuerProjectkeyResponse:
        """
        Description: 发行机构分页查询密钥关联的项目
        Summary: 发行机构分页查询密钥关联的项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_issuer_projectkey_ex(request, headers, runtime)

    async def pagequery_issuer_projectkey_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectkeyRequest,
    ) -> webtrwatrade_models.PagequeryIssuerProjectkeyResponse:
        """
        Description: 发行机构分页查询密钥关联的项目
        Summary: 发行机构分页查询密钥关联的项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_issuer_projectkey_ex_async(request, headers, runtime)

    def pagequery_issuer_projectkey_ex(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerProjectkeyResponse:
        """
        Description: 发行机构分页查询密钥关联的项目
        Summary: 发行机构分页查询密钥关联的项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerProjectkeyResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.projectkey.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_issuer_projectkey_ex_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerProjectkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerProjectkeyResponse:
        """
        Description: 发行机构分页查询密钥关联的项目
        Summary: 发行机构分页查询密钥关联的项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerProjectkeyResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.projectkey.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_issuer_netvalue(
        self,
        request: webtrwatrade_models.UpdateIssuerNetvalueRequest,
    ) -> webtrwatrade_models.UpdateIssuerNetvalueResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_issuer_netvalue_ex(request, headers, runtime)

    async def update_issuer_netvalue_async(
        self,
        request: webtrwatrade_models.UpdateIssuerNetvalueRequest,
    ) -> webtrwatrade_models.UpdateIssuerNetvalueResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_issuer_netvalue_ex_async(request, headers, runtime)

    def update_issuer_netvalue_ex(
        self,
        request: webtrwatrade_models.UpdateIssuerNetvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.UpdateIssuerNetvalueResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.UpdateIssuerNetvalueResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.netvalue.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_issuer_netvalue_ex_async(
        self,
        request: webtrwatrade_models.UpdateIssuerNetvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.UpdateIssuerNetvalueResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.UpdateIssuerNetvalueResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.netvalue.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_netvalue(
        self,
        request: webtrwatrade_models.ListIssuerNetvalueRequest,
    ) -> webtrwatrade_models.ListIssuerNetvalueResponse:
        """
        Description: 获取净值列表
        Summary: 获取净值列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_netvalue_ex(request, headers, runtime)

    async def list_issuer_netvalue_async(
        self,
        request: webtrwatrade_models.ListIssuerNetvalueRequest,
    ) -> webtrwatrade_models.ListIssuerNetvalueResponse:
        """
        Description: 获取净值列表
        Summary: 获取净值列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_netvalue_ex_async(request, headers, runtime)

    def list_issuer_netvalue_ex(
        self,
        request: webtrwatrade_models.ListIssuerNetvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerNetvalueResponse:
        """
        Description: 获取净值列表
        Summary: 获取净值列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerNetvalueResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.netvalue.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_netvalue_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerNetvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerNetvalueResponse:
        """
        Description: 获取净值列表
        Summary: 获取净值列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerNetvalueResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.netvalue.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_issuer_report(
        self,
        request: webtrwatrade_models.UploadIssuerReportRequest,
    ) -> webtrwatrade_models.UploadIssuerReportResponse:
        """
        Description: 上传项目报告
        Summary: 上传项目报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_issuer_report_ex(request, headers, runtime)

    async def upload_issuer_report_async(
        self,
        request: webtrwatrade_models.UploadIssuerReportRequest,
    ) -> webtrwatrade_models.UploadIssuerReportResponse:
        """
        Description: 上传项目报告
        Summary: 上传项目报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_issuer_report_ex_async(request, headers, runtime)

    def upload_issuer_report_ex(
        self,
        request: webtrwatrade_models.UploadIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.UploadIssuerReportResponse:
        """
        Description: 上传项目报告
        Summary: 上传项目报告
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.UploadIssuerReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.report.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_issuer_report_ex_async(
        self,
        request: webtrwatrade_models.UploadIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.UploadIssuerReportResponse:
        """
        Description: 上传项目报告
        Summary: 上传项目报告
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.UploadIssuerReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.report.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_issuer_report(
        self,
        request: webtrwatrade_models.ListIssuerReportRequest,
    ) -> webtrwatrade_models.ListIssuerReportResponse:
        """
        Description: 发行机构获取历史报告列表
        Summary: 发行机构获取历史报告列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_issuer_report_ex(request, headers, runtime)

    async def list_issuer_report_async(
        self,
        request: webtrwatrade_models.ListIssuerReportRequest,
    ) -> webtrwatrade_models.ListIssuerReportResponse:
        """
        Description: 发行机构获取历史报告列表
        Summary: 发行机构获取历史报告列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_issuer_report_ex_async(request, headers, runtime)

    def list_issuer_report_ex(
        self,
        request: webtrwatrade_models.ListIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerReportResponse:
        """
        Description: 发行机构获取历史报告列表
        Summary: 发行机构获取历史报告列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.report.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_issuer_report_ex_async(
        self,
        request: webtrwatrade_models.ListIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListIssuerReportResponse:
        """
        Description: 发行机构获取历史报告列表
        Summary: 发行机构获取历史报告列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListIssuerReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.report.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributor_report(
        self,
        request: webtrwatrade_models.ListDistributorReportRequest,
    ) -> webtrwatrade_models.ListDistributorReportResponse:
        """
        Description: 代销机构获取历史项目报告
        Summary: 代销机构获取历史项目报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributor_report_ex(request, headers, runtime)

    async def list_distributor_report_async(
        self,
        request: webtrwatrade_models.ListDistributorReportRequest,
    ) -> webtrwatrade_models.ListDistributorReportResponse:
        """
        Description: 代销机构获取历史项目报告
        Summary: 代销机构获取历史项目报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributor_report_ex_async(request, headers, runtime)

    def list_distributor_report_ex(
        self,
        request: webtrwatrade_models.ListDistributorReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorReportResponse:
        """
        Description: 代销机构获取历史项目报告
        Summary: 代销机构获取历史项目报告
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.report.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributor_report_ex_async(
        self,
        request: webtrwatrade_models.ListDistributorReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.ListDistributorReportResponse:
        """
        Description: 代销机构获取历史项目报告
        Summary: 代销机构获取历史项目报告
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.ListDistributorReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.report.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_issuer_report(
        self,
        request: webtrwatrade_models.DownloadIssuerReportRequest,
    ) -> webtrwatrade_models.DownloadIssuerReportResponse:
        """
        Description: 发行机构获取报告文件下载URL
        Summary: 发行机构获取报告文件下载URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_issuer_report_ex(request, headers, runtime)

    async def download_issuer_report_async(
        self,
        request: webtrwatrade_models.DownloadIssuerReportRequest,
    ) -> webtrwatrade_models.DownloadIssuerReportResponse:
        """
        Description: 发行机构获取报告文件下载URL
        Summary: 发行机构获取报告文件下载URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_issuer_report_ex_async(request, headers, runtime)

    def download_issuer_report_ex(
        self,
        request: webtrwatrade_models.DownloadIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DownloadIssuerReportResponse:
        """
        Description: 发行机构获取报告文件下载URL
        Summary: 发行机构获取报告文件下载URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DownloadIssuerReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.report.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_issuer_report_ex_async(
        self,
        request: webtrwatrade_models.DownloadIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DownloadIssuerReportResponse:
        """
        Description: 发行机构获取报告文件下载URL
        Summary: 发行机构获取报告文件下载URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DownloadIssuerReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.report.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_issuer_report(
        self,
        request: webtrwatrade_models.PreviewIssuerReportRequest,
    ) -> webtrwatrade_models.PreviewIssuerReportResponse:
        """
        Description: 发行机构获取报告文件预览URL
        Summary: 发行机构获取报告文件预览URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_issuer_report_ex(request, headers, runtime)

    async def preview_issuer_report_async(
        self,
        request: webtrwatrade_models.PreviewIssuerReportRequest,
    ) -> webtrwatrade_models.PreviewIssuerReportResponse:
        """
        Description: 发行机构获取报告文件预览URL
        Summary: 发行机构获取报告文件预览URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_issuer_report_ex_async(request, headers, runtime)

    def preview_issuer_report_ex(
        self,
        request: webtrwatrade_models.PreviewIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PreviewIssuerReportResponse:
        """
        Description: 发行机构获取报告文件预览URL
        Summary: 发行机构获取报告文件预览URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PreviewIssuerReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.report.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_issuer_report_ex_async(
        self,
        request: webtrwatrade_models.PreviewIssuerReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PreviewIssuerReportResponse:
        """
        Description: 发行机构获取报告文件预览URL
        Summary: 发行机构获取报告文件预览URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PreviewIssuerReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.report.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_distributor_report(
        self,
        request: webtrwatrade_models.DownloadDistributorReportRequest,
    ) -> webtrwatrade_models.DownloadDistributorReportResponse:
        """
        Description: 代销机构获取报告文件下载URL
        Summary: 代销机构获取报告文件下载URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_distributor_report_ex(request, headers, runtime)

    async def download_distributor_report_async(
        self,
        request: webtrwatrade_models.DownloadDistributorReportRequest,
    ) -> webtrwatrade_models.DownloadDistributorReportResponse:
        """
        Description: 代销机构获取报告文件下载URL
        Summary: 代销机构获取报告文件下载URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_distributor_report_ex_async(request, headers, runtime)

    def download_distributor_report_ex(
        self,
        request: webtrwatrade_models.DownloadDistributorReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DownloadDistributorReportResponse:
        """
        Description: 代销机构获取报告文件下载URL
        Summary: 代销机构获取报告文件下载URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DownloadDistributorReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.report.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_distributor_report_ex_async(
        self,
        request: webtrwatrade_models.DownloadDistributorReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DownloadDistributorReportResponse:
        """
        Description: 代销机构获取报告文件下载URL
        Summary: 代销机构获取报告文件下载URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DownloadDistributorReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.report.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_distributor_report(
        self,
        request: webtrwatrade_models.PreviewDistributorReportRequest,
    ) -> webtrwatrade_models.PreviewDistributorReportResponse:
        """
        Description: 代销机构获取报告文件预览URL
        Summary: 代销机构获取报告文件预览URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_distributor_report_ex(request, headers, runtime)

    async def preview_distributor_report_async(
        self,
        request: webtrwatrade_models.PreviewDistributorReportRequest,
    ) -> webtrwatrade_models.PreviewDistributorReportResponse:
        """
        Description: 代销机构获取报告文件预览URL
        Summary: 代销机构获取报告文件预览URL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_distributor_report_ex_async(request, headers, runtime)

    def preview_distributor_report_ex(
        self,
        request: webtrwatrade_models.PreviewDistributorReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PreviewDistributorReportResponse:
        """
        Description: 代销机构获取报告文件预览URL
        Summary: 代销机构获取报告文件预览URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PreviewDistributorReportResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.report.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_distributor_report_ex_async(
        self,
        request: webtrwatrade_models.PreviewDistributorReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PreviewDistributorReportResponse:
        """
        Description: 代销机构获取报告文件预览URL
        Summary: 代销机构获取报告文件预览URL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PreviewDistributorReportResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.report.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_issuer_subuser(
        self,
        request: webtrwatrade_models.PagequeryIssuerSubuserRequest,
    ) -> webtrwatrade_models.PagequeryIssuerSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_issuer_subuser_ex(request, headers, runtime)

    async def pagequery_issuer_subuser_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerSubuserRequest,
    ) -> webtrwatrade_models.PagequeryIssuerSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_issuer_subuser_ex_async(request, headers, runtime)

    def pagequery_issuer_subuser_ex(
        self,
        request: webtrwatrade_models.PagequeryIssuerSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subuser.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_issuer_subuser_ex_async(
        self,
        request: webtrwatrade_models.PagequeryIssuerSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryIssuerSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryIssuerSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subuser.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_distributor_subuser(
        self,
        request: webtrwatrade_models.PagequeryDistributorSubuserRequest,
    ) -> webtrwatrade_models.PagequeryDistributorSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_distributor_subuser_ex(request, headers, runtime)

    async def pagequery_distributor_subuser_async(
        self,
        request: webtrwatrade_models.PagequeryDistributorSubuserRequest,
    ) -> webtrwatrade_models.PagequeryDistributorSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_distributor_subuser_ex_async(request, headers, runtime)

    def pagequery_distributor_subuser_ex(
        self,
        request: webtrwatrade_models.PagequeryDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryDistributorSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryDistributorSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuser.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_distributor_subuser_ex_async(
        self,
        request: webtrwatrade_models.PagequeryDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.PagequeryDistributorSubuserResponse:
        """
        Description: 分页查询二级用户列表
        Summary: 分页查询二级用户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.PagequeryDistributorSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuser.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_issuer_subuser(
        self,
        request: webtrwatrade_models.QueryIssuerSubuserRequest,
    ) -> webtrwatrade_models.QueryIssuerSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_issuer_subuser_ex(request, headers, runtime)

    async def query_issuer_subuser_async(
        self,
        request: webtrwatrade_models.QueryIssuerSubuserRequest,
    ) -> webtrwatrade_models.QueryIssuerSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_issuer_subuser_ex_async(request, headers, runtime)

    def query_issuer_subuser_ex(
        self,
        request: webtrwatrade_models.QueryIssuerSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryIssuerSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryIssuerSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subuser.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_issuer_subuser_ex_async(
        self,
        request: webtrwatrade_models.QueryIssuerSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryIssuerSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryIssuerSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subuser.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_distributor_subuser(
        self,
        request: webtrwatrade_models.QueryDistributorSubuserRequest,
    ) -> webtrwatrade_models.QueryDistributorSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_distributor_subuser_ex(request, headers, runtime)

    async def query_distributor_subuser_async(
        self,
        request: webtrwatrade_models.QueryDistributorSubuserRequest,
    ) -> webtrwatrade_models.QueryDistributorSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_distributor_subuser_ex_async(request, headers, runtime)

    def query_distributor_subuser_ex(
        self,
        request: webtrwatrade_models.QueryDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryDistributorSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryDistributorSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuser.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_distributor_subuser_ex_async(
        self,
        request: webtrwatrade_models.QueryDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryDistributorSubuserResponse:
        """
        Description: 查询单个二级用户
        Summary: 查询单个二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryDistributorSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuser.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_distributor_subuser(
        self,
        request: webtrwatrade_models.UpdateDistributorSubuserRequest,
    ) -> webtrwatrade_models.UpdateDistributorSubuserResponse:
        """
        Description: 更新二级用户
        Summary: 更新二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_distributor_subuser_ex(request, headers, runtime)

    async def update_distributor_subuser_async(
        self,
        request: webtrwatrade_models.UpdateDistributorSubuserRequest,
    ) -> webtrwatrade_models.UpdateDistributorSubuserResponse:
        """
        Description: 更新二级用户
        Summary: 更新二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_distributor_subuser_ex_async(request, headers, runtime)

    def update_distributor_subuser_ex(
        self,
        request: webtrwatrade_models.UpdateDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.UpdateDistributorSubuserResponse:
        """
        Description: 更新二级用户
        Summary: 更新二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.UpdateDistributorSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuser.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_distributor_subuser_ex_async(
        self,
        request: webtrwatrade_models.UpdateDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.UpdateDistributorSubuserResponse:
        """
        Description: 更新二级用户
        Summary: 更新二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.UpdateDistributorSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuser.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributor_subuser(
        self,
        request: webtrwatrade_models.CreateDistributorSubuserRequest,
    ) -> webtrwatrade_models.CreateDistributorSubuserResponse:
        """
        Description: 添加二级用户
        Summary: 添加二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributor_subuser_ex(request, headers, runtime)

    async def create_distributor_subuser_async(
        self,
        request: webtrwatrade_models.CreateDistributorSubuserRequest,
    ) -> webtrwatrade_models.CreateDistributorSubuserResponse:
        """
        Description: 添加二级用户
        Summary: 添加二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributor_subuser_ex_async(request, headers, runtime)

    def create_distributor_subuser_ex(
        self,
        request: webtrwatrade_models.CreateDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CreateDistributorSubuserResponse:
        """
        Description: 添加二级用户
        Summary: 添加二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CreateDistributorSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuser.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributor_subuser_ex_async(
        self,
        request: webtrwatrade_models.CreateDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CreateDistributorSubuserResponse:
        """
        Description: 添加二级用户
        Summary: 添加二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CreateDistributorSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuser.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_distributor_subuser(
        self,
        request: webtrwatrade_models.DeleteDistributorSubuserRequest,
    ) -> webtrwatrade_models.DeleteDistributorSubuserResponse:
        """
        Description: 删除二级用户
        Summary: 删除二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_distributor_subuser_ex(request, headers, runtime)

    async def delete_distributor_subuser_async(
        self,
        request: webtrwatrade_models.DeleteDistributorSubuserRequest,
    ) -> webtrwatrade_models.DeleteDistributorSubuserResponse:
        """
        Description: 删除二级用户
        Summary: 删除二级用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_distributor_subuser_ex_async(request, headers, runtime)

    def delete_distributor_subuser_ex(
        self,
        request: webtrwatrade_models.DeleteDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DeleteDistributorSubuserResponse:
        """
        Description: 删除二级用户
        Summary: 删除二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DeleteDistributorSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuser.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_distributor_subuser_ex_async(
        self,
        request: webtrwatrade_models.DeleteDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.DeleteDistributorSubuserResponse:
        """
        Description: 删除二级用户
        Summary: 删除二级用户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.DeleteDistributorSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuser.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_distributor_subusertarget(
        self,
        request: webtrwatrade_models.CountDistributorSubusertargetRequest,
    ) -> webtrwatrade_models.CountDistributorSubusertargetResponse:
        """
        Description: 获取二级用户配额
        Summary: 获取二级用户配额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_distributor_subusertarget_ex(request, headers, runtime)

    async def count_distributor_subusertarget_async(
        self,
        request: webtrwatrade_models.CountDistributorSubusertargetRequest,
    ) -> webtrwatrade_models.CountDistributorSubusertargetResponse:
        """
        Description: 获取二级用户配额
        Summary: 获取二级用户配额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_distributor_subusertarget_ex_async(request, headers, runtime)

    def count_distributor_subusertarget_ex(
        self,
        request: webtrwatrade_models.CountDistributorSubusertargetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CountDistributorSubusertargetResponse:
        """
        Description: 获取二级用户配额
        Summary: 获取二级用户配额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CountDistributorSubusertargetResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subusertarget.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_distributor_subusertarget_ex_async(
        self,
        request: webtrwatrade_models.CountDistributorSubusertargetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.CountDistributorSubusertargetResponse:
        """
        Description: 获取二级用户配额
        Summary: 获取二级用户配额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.CountDistributorSubusertargetResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subusertarget.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_issuer(
        self,
        request: webtrwatrade_models.QueryIssuerRequest,
    ) -> webtrwatrade_models.QueryIssuerResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_issuer_ex(request, headers, runtime)

    async def query_issuer_async(
        self,
        request: webtrwatrade_models.QueryIssuerRequest,
    ) -> webtrwatrade_models.QueryIssuerResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_issuer_ex_async(request, headers, runtime)

    def query_issuer_ex(
        self,
        request: webtrwatrade_models.QueryIssuerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryIssuerResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryIssuerResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_issuer_ex_async(
        self,
        request: webtrwatrade_models.QueryIssuerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryIssuerResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryIssuerResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_distributor(
        self,
        request: webtrwatrade_models.QueryDistributorRequest,
    ) -> webtrwatrade_models.QueryDistributorResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_distributor_ex(request, headers, runtime)

    async def query_distributor_async(
        self,
        request: webtrwatrade_models.QueryDistributorRequest,
    ) -> webtrwatrade_models.QueryDistributorResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_distributor_ex_async(request, headers, runtime)

    def query_distributor_ex(
        self,
        request: webtrwatrade_models.QueryDistributorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryDistributorResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryDistributorResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_distributor_ex_async(
        self,
        request: webtrwatrade_models.QueryDistributorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.QueryDistributorResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.QueryDistributorResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def issue_issuer_subusertrade(
        self,
        request: webtrwatrade_models.IssueIssuerSubusertradeRequest,
    ) -> webtrwatrade_models.IssueIssuerSubusertradeResponse:
        """
        Description: 发行token
        Summary: 发行token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.issue_issuer_subusertrade_ex(request, headers, runtime)

    async def issue_issuer_subusertrade_async(
        self,
        request: webtrwatrade_models.IssueIssuerSubusertradeRequest,
    ) -> webtrwatrade_models.IssueIssuerSubusertradeResponse:
        """
        Description: 发行token
        Summary: 发行token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.issue_issuer_subusertrade_ex_async(request, headers, runtime)

    def issue_issuer_subusertrade_ex(
        self,
        request: webtrwatrade_models.IssueIssuerSubusertradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.IssueIssuerSubusertradeResponse:
        """
        Description: 发行token
        Summary: 发行token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.IssueIssuerSubusertradeResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.issue', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def issue_issuer_subusertrade_ex_async(
        self,
        request: webtrwatrade_models.IssueIssuerSubusertradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.IssueIssuerSubusertradeResponse:
        """
        Description: 发行token
        Summary: 发行token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.IssueIssuerSubusertradeResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.issue', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def redeem_issuer_subusertrade(
        self,
        request: webtrwatrade_models.RedeemIssuerSubusertradeRequest,
    ) -> webtrwatrade_models.RedeemIssuerSubusertradeResponse:
        """
        Description: 赎回token
        Summary: 赎回token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.redeem_issuer_subusertrade_ex(request, headers, runtime)

    async def redeem_issuer_subusertrade_async(
        self,
        request: webtrwatrade_models.RedeemIssuerSubusertradeRequest,
    ) -> webtrwatrade_models.RedeemIssuerSubusertradeResponse:
        """
        Description: 赎回token
        Summary: 赎回token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.redeem_issuer_subusertrade_ex_async(request, headers, runtime)

    def redeem_issuer_subusertrade_ex(
        self,
        request: webtrwatrade_models.RedeemIssuerSubusertradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.RedeemIssuerSubusertradeResponse:
        """
        Description: 赎回token
        Summary: 赎回token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.RedeemIssuerSubusertradeResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.redeem', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def redeem_issuer_subusertrade_ex_async(
        self,
        request: webtrwatrade_models.RedeemIssuerSubusertradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.RedeemIssuerSubusertradeResponse:
        """
        Description: 赎回token
        Summary: 赎回token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.RedeemIssuerSubusertradeResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.redeem', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def transfer_issuer_subusertrade(
        self,
        request: webtrwatrade_models.TransferIssuerSubusertradeRequest,
    ) -> webtrwatrade_models.TransferIssuerSubusertradeResponse:
        """
        Description: 转移token
        Summary: 转移token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.transfer_issuer_subusertrade_ex(request, headers, runtime)

    async def transfer_issuer_subusertrade_async(
        self,
        request: webtrwatrade_models.TransferIssuerSubusertradeRequest,
    ) -> webtrwatrade_models.TransferIssuerSubusertradeResponse:
        """
        Description: 转移token
        Summary: 转移token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.transfer_issuer_subusertrade_ex_async(request, headers, runtime)

    def transfer_issuer_subusertrade_ex(
        self,
        request: webtrwatrade_models.TransferIssuerSubusertradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.TransferIssuerSubusertradeResponse:
        """
        Description: 转移token
        Summary: 转移token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.TransferIssuerSubusertradeResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def transfer_issuer_subusertrade_ex_async(
        self,
        request: webtrwatrade_models.TransferIssuerSubusertradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> webtrwatrade_models.TransferIssuerSubusertradeResponse:
        """
        Description: 转移token
        Summary: 转移token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            webtrwatrade_models.TransferIssuerSubusertradeResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.transfer', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
