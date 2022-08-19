# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_489f73e9fd5f44c2b5b730d70ea51bf2 import models as ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models
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
        config: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.Config,
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
            'ignoreSSL': runtime.ignore_ssl
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
                    'sdk_version': '1.0.3',
                    '_prod_code': 'ak_489f73e9fd5f44c2b5b730d70ea51bf2',
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
            'ignoreSSL': runtime.ignore_ssl
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
                    'sdk_version': '1.0.3',
                    '_prod_code': 'ak_489f73e9fd5f44c2b5b730d70ea51bf2',
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

    def bind_demo_aaa_bbb_ccc(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建，用于测试新建&修改功能
        Summary: 自动化测试创建，用于测试新建&修改功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_aaa_bbb_ccc_ex(request, headers, runtime)

    async def bind_demo_aaa_bbb_ccc_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建，用于测试新建&修改功能
        Summary: 自动化测试创建，用于测试新建&修改功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def bind_demo_aaa_bbb_ccc_ex(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建，用于测试新建&修改功能
        Summary: 自动化测试创建，用于测试新建&修改功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_aaa_bbb_ccc_ex_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建，用于测试新建&修改功能
        Summary: 自动化测试创建，用于测试新建&修改功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_ad_asd_asd(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_ad_asd_asd_ex(request, headers, runtime)

    async def query_demo_ad_asd_asd_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_ad_asd_asd_ex_async(request, headers, runtime)

    def query_demo_ad_asd_asd_ex(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdResponse(),
            self.do_request('1.0', 'demo.ad.asd.asd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_ad_asd_asd_ex_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAdAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.ad.asd.asd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_asd_asd_asd(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_asd_asd_asd_ex(request, headers, runtime)

    async def bind_demo_asd_asd_asd_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_asd_asd_asd_ex_async(request, headers, runtime)

    def bind_demo_asd_asd_asd_ex(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdResponse(),
            self.do_request('1.0', 'demo.asd.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_asd_asd_asd_ex_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdResponse:
        """
        Description: asd
        Summary: asd
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.asd.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_asd_asd(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_asd_asd_ex(request, headers, runtime)

    async def bind_demo_asd_asd_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_asd_asd_ex_async(request, headers, runtime)

    def bind_demo_asd_asd_ex(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdResponse(),
            self.do_request('1.0', 'demo.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_asd_asd_ex_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdResponse:
        """
        Description: 1·2
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.BindDemoAsdAsdResponse(),
            await self.do_request_async('1.0', 'demo.asd.asd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_aaa_bbb_ccc(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_aaa_bbb_ccc_ex(request, headers, runtime)

    async def query_demo_aaa_bbb_ccc_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def query_demo_aaa_bbb_ccc_ex(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_aaa_bbb_ccc_ex_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建1
        Summary: 自动化测试创建（勿动）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_abc_abc_abc(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_abc_abc_abc_ex(request, headers, runtime)

    async def query_demo_abc_abc_abc_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcRequest,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_abc_abc_abc_ex_async(request, headers, runtime)

    def query_demo_abc_abc_abc_ex(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcResponse(),
            self.do_request('1.0', 'demo.abc.abc.abc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_abc_abc_abc_ex_async(
        self,
        request: ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcResponse:
        """
        Description: 自动化测试创建,用于测试API的修改
        Summary: 自动化测试创建,用于测试API的修改勿动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__489f_73e_9fd_5f_44c_2b_5b_730d_70ea_51bf_2_models.QueryDemoAbcAbcAbcResponse(),
            await self.do_request_async('1.0', 'demo.abc.abc.abc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
