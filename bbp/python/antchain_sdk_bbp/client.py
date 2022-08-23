# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_bbp import models as bbp_models
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
        config: bbp_models.Config,
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
            # 键值对，兼容map用
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
                    'sdk_version': '1.7.29',
                    '_prod_code': 'BBP',
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
            # 键值对，兼容map用
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
                    'sdk_version': '1.7.29',
                    '_prod_code': 'BBP',
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

    def auth_customer(
        self,
        request: bbp_models.AuthCustomerRequest,
    ) -> bbp_models.AuthCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_customer_ex(request, headers, runtime)

    async def auth_customer_async(
        self,
        request: bbp_models.AuthCustomerRequest,
    ) -> bbp_models.AuthCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_customer_ex_async(request, headers, runtime)

    def auth_customer_ex(
        self,
        request: bbp_models.AuthCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.AuthCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.AuthCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_customer_ex_async(
        self,
        request: bbp_models.AuthCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.AuthCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.AuthCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_customer(
        self,
        request: bbp_models.CreateCustomerRequest,
    ) -> bbp_models.CreateCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_customer_ex(request, headers, runtime)

    async def create_customer_async(
        self,
        request: bbp_models.CreateCustomerRequest,
    ) -> bbp_models.CreateCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_customer_ex_async(request, headers, runtime)

    def create_customer_ex(
        self,
        request: bbp_models.CreateCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_customer_ex_async(
        self,
        request: bbp_models.CreateCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateCustomerResponse:
        """
        Description: 智科统一客户注册
        Summary: 统一客户注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_customer(
        self,
        request: bbp_models.QueryCustomerRequest,
    ) -> bbp_models.QueryCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_ex(request, headers, runtime)

    async def query_customer_async(
        self,
        request: bbp_models.QueryCustomerRequest,
    ) -> bbp_models.QueryCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_ex_async(request, headers, runtime)

    def query_customer_ex(
        self,
        request: bbp_models.QueryCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_ex_async(
        self,
        request: bbp_models.QueryCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryCustomerResponse:
        """
        Description: 客户信息查询
        Summary: 客户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_verify(
        self,
        request: bbp_models.InitVerifyRequest,
    ) -> bbp_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_verify_ex(request, headers, runtime)

    async def init_verify_async(
        self,
        request: bbp_models.InitVerifyRequest,
    ) -> bbp_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_verify_ex_async(request, headers, runtime)

    def init_verify_ex(
        self,
        request: bbp_models.InitVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.InitVerifyResponse(),
            self.do_request('1.0', 'antchain.bbp.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_verify_ex_async(
        self,
        request: bbp_models.InitVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.InitVerifyResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_verify(
        self,
        request: bbp_models.StartVerifyRequest,
    ) -> bbp_models.StartVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_verify_ex(request, headers, runtime)

    async def start_verify_async(
        self,
        request: bbp_models.StartVerifyRequest,
    ) -> bbp_models.StartVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_verify_ex_async(request, headers, runtime)

    def start_verify_ex(
        self,
        request: bbp_models.StartVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.StartVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.StartVerifyResponse(),
            self.do_request('1.0', 'antchain.bbp.verify.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_verify_ex_async(
        self,
        request: bbp_models.StartVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.StartVerifyResponse:
        """
        Description: 核身产品渲染接口
        Summary: 核身产品渲染接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.StartVerifyResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.verify.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_verify(
        self,
        request: bbp_models.CheckVerifyRequest,
    ) -> bbp_models.CheckVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_verify_ex(request, headers, runtime)

    async def check_verify_async(
        self,
        request: bbp_models.CheckVerifyRequest,
    ) -> bbp_models.CheckVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_verify_ex_async(request, headers, runtime)

    def check_verify_ex(
        self,
        request: bbp_models.CheckVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CheckVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CheckVerifyResponse(),
            self.do_request('1.0', 'antchain.bbp.verify.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_verify_ex_async(
        self,
        request: bbp_models.CheckVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CheckVerifyResponse:
        """
        Description: 核身结果查询
        Summary: 核身结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CheckVerifyResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.verify.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_meta(
        self,
        request: bbp_models.VerifyMetaRequest,
    ) -> bbp_models.VerifyMetaResponse:
        """
        Description: 对企业身份进行认证
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_meta_ex(request, headers, runtime)

    async def verify_meta_async(
        self,
        request: bbp_models.VerifyMetaRequest,
    ) -> bbp_models.VerifyMetaResponse:
        """
        Description: 对企业身份进行认证
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_meta_ex_async(request, headers, runtime)

    def verify_meta_ex(
        self,
        request: bbp_models.VerifyMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.VerifyMetaResponse:
        """
        Description: 对企业身份进行认证
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.VerifyMetaResponse(),
            self.do_request('1.0', 'antchain.bbp.meta.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_meta_ex_async(
        self,
        request: bbp_models.VerifyMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.VerifyMetaResponse:
        """
        Description: 对企业身份进行认证
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.VerifyMetaResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.meta.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterprise_businessinfo(
        self,
        request: bbp_models.QueryEnterpriseBusinessinfoRequest,
    ) -> bbp_models.QueryEnterpriseBusinessinfoResponse:
        """
        Description: 经营信息查询
        Summary: 经营信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterprise_businessinfo_ex(request, headers, runtime)

    async def query_enterprise_businessinfo_async(
        self,
        request: bbp_models.QueryEnterpriseBusinessinfoRequest,
    ) -> bbp_models.QueryEnterpriseBusinessinfoResponse:
        """
        Description: 经营信息查询
        Summary: 经营信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterprise_businessinfo_ex_async(request, headers, runtime)

    def query_enterprise_businessinfo_ex(
        self,
        request: bbp_models.QueryEnterpriseBusinessinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryEnterpriseBusinessinfoResponse:
        """
        Description: 经营信息查询
        Summary: 经营信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryEnterpriseBusinessinfoResponse(),
            self.do_request('1.0', 'antchain.bbp.enterprise.businessinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterprise_businessinfo_ex_async(
        self,
        request: bbp_models.QueryEnterpriseBusinessinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryEnterpriseBusinessinfoResponse:
        """
        Description: 经营信息查询
        Summary: 经营信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryEnterpriseBusinessinfoResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.enterprise.businessinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gwtest(
        self,
        request: bbp_models.QueryGwtestRequest,
    ) -> bbp_models.QueryGwtestResponse:
        """
        Description: 网关测试
        Summary: 网关测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gwtest_ex(request, headers, runtime)

    async def query_gwtest_async(
        self,
        request: bbp_models.QueryGwtestRequest,
    ) -> bbp_models.QueryGwtestResponse:
        """
        Description: 网关测试
        Summary: 网关测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gwtest_ex_async(request, headers, runtime)

    def query_gwtest_ex(
        self,
        request: bbp_models.QueryGwtestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryGwtestResponse:
        """
        Description: 网关测试
        Summary: 网关测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryGwtestResponse(),
            self.do_request('1.0', 'antchain.bbp.gwtest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gwtest_ex_async(
        self,
        request: bbp_models.QueryGwtestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryGwtestResponse:
        """
        Description: 网关测试
        Summary: 网关测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryGwtestResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.gwtest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_contract_rule(
        self,
        request: bbp_models.ApplyContractRuleRequest,
    ) -> bbp_models.ApplyContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_contract_rule_ex(request, headers, runtime)

    async def apply_contract_rule_async(
        self,
        request: bbp_models.ApplyContractRuleRequest,
    ) -> bbp_models.ApplyContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_contract_rule_ex_async(request, headers, runtime)

    def apply_contract_rule_ex(
        self,
        request: bbp_models.ApplyContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.ApplyContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.ApplyContractRuleResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.rule.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_contract_rule_ex_async(
        self,
        request: bbp_models.ApplyContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.ApplyContractRuleResponse:
        """
        Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
        Summary: 外包薪资规则合约发布接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.ApplyContractRuleResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.rule.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_rule(
        self,
        request: bbp_models.GetContractRuleRequest,
    ) -> bbp_models.GetContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_rule_ex(request, headers, runtime)

    async def get_contract_rule_async(
        self,
        request: bbp_models.GetContractRuleRequest,
    ) -> bbp_models.GetContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_rule_ex_async(request, headers, runtime)

    def get_contract_rule_ex(
        self,
        request: bbp_models.GetContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.GetContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.GetContractRuleResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_rule_ex_async(
        self,
        request: bbp_models.GetContractRuleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.GetContractRuleResponse:
        """
        Description: 调用链上合约接口，查询外包的薪资方案
        Summary: 外包薪资规则合约查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.GetContractRuleResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.rule.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_staff_attendance(
        self,
        request: bbp_models.UploadStaffAttendanceRequest,
    ) -> bbp_models.UploadStaffAttendanceResponse:
        """
        Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
        Summary: 长城汽车的考勤信息上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_staff_attendance_ex(request, headers, runtime)

    async def upload_staff_attendance_async(
        self,
        request: bbp_models.UploadStaffAttendanceRequest,
    ) -> bbp_models.UploadStaffAttendanceResponse:
        """
        Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
        Summary: 长城汽车的考勤信息上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_staff_attendance_ex_async(request, headers, runtime)

    def upload_staff_attendance_ex(
        self,
        request: bbp_models.UploadStaffAttendanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.UploadStaffAttendanceResponse:
        """
        Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
        Summary: 长城汽车的考勤信息上传接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.UploadStaffAttendanceResponse(),
            self.do_request('1.0', 'antchain.bbp.staff.attendance.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_staff_attendance_ex_async(
        self,
        request: bbp_models.UploadStaffAttendanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.UploadStaffAttendanceResponse:
        """
        Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
        Summary: 长城汽车的考勤信息上传接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.UploadStaffAttendanceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.staff.attendance.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_staff_attendance(
        self,
        request: bbp_models.QueryStaffAttendanceRequest,
    ) -> bbp_models.QueryStaffAttendanceResponse:
        """
        Description: 基于人的维度，入参：{用户id,考勤月份}
        Summary: 长城汽车的考勤信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_staff_attendance_ex(request, headers, runtime)

    async def query_staff_attendance_async(
        self,
        request: bbp_models.QueryStaffAttendanceRequest,
    ) -> bbp_models.QueryStaffAttendanceResponse:
        """
        Description: 基于人的维度，入参：{用户id,考勤月份}
        Summary: 长城汽车的考勤信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_staff_attendance_ex_async(request, headers, runtime)

    def query_staff_attendance_ex(
        self,
        request: bbp_models.QueryStaffAttendanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryStaffAttendanceResponse:
        """
        Description: 基于人的维度，入参：{用户id,考勤月份}
        Summary: 长城汽车的考勤信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryStaffAttendanceResponse(),
            self.do_request('1.0', 'antchain.bbp.staff.attendance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_staff_attendance_ex_async(
        self,
        request: bbp_models.QueryStaffAttendanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryStaffAttendanceResponse:
        """
        Description: 基于人的维度，入参：{用户id,考勤月份}
        Summary: 长城汽车的考勤信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryStaffAttendanceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.staff.attendance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_staff_assessment(
        self,
        request: bbp_models.UploadStaffAssessmentRequest,
    ) -> bbp_models.UploadStaffAssessmentResponse:
        """
        Description: 长城汽车的考核信息
        Summary: 长城汽车的考核信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_staff_assessment_ex(request, headers, runtime)

    async def upload_staff_assessment_async(
        self,
        request: bbp_models.UploadStaffAssessmentRequest,
    ) -> bbp_models.UploadStaffAssessmentResponse:
        """
        Description: 长城汽车的考核信息
        Summary: 长城汽车的考核信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_staff_assessment_ex_async(request, headers, runtime)

    def upload_staff_assessment_ex(
        self,
        request: bbp_models.UploadStaffAssessmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.UploadStaffAssessmentResponse:
        """
        Description: 长城汽车的考核信息
        Summary: 长城汽车的考核信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.UploadStaffAssessmentResponse(),
            self.do_request('1.0', 'antchain.bbp.staff.assessment.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_staff_assessment_ex_async(
        self,
        request: bbp_models.UploadStaffAssessmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.UploadStaffAssessmentResponse:
        """
        Description: 长城汽车的考核信息
        Summary: 长城汽车的考核信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.UploadStaffAssessmentResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.staff.assessment.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_staff_assessment(
        self,
        request: bbp_models.QueryStaffAssessmentRequest,
    ) -> bbp_models.QueryStaffAssessmentResponse:
        """
        Description: 考核信息查询
        Summary: 考核信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_staff_assessment_ex(request, headers, runtime)

    async def query_staff_assessment_async(
        self,
        request: bbp_models.QueryStaffAssessmentRequest,
    ) -> bbp_models.QueryStaffAssessmentResponse:
        """
        Description: 考核信息查询
        Summary: 考核信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_staff_assessment_ex_async(request, headers, runtime)

    def query_staff_assessment_ex(
        self,
        request: bbp_models.QueryStaffAssessmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryStaffAssessmentResponse:
        """
        Description: 考核信息查询
        Summary: 考核信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryStaffAssessmentResponse(),
            self.do_request('1.0', 'antchain.bbp.staff.assessment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_staff_assessment_ex_async(
        self,
        request: bbp_models.QueryStaffAssessmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryStaffAssessmentResponse:
        """
        Description: 考核信息查询
        Summary: 考核信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryStaffAssessmentResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.staff.assessment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_reconciliation(
        self,
        request: bbp_models.ExecContractReconciliationRequest,
    ) -> bbp_models.ExecContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_reconciliation_ex(request, headers, runtime)

    async def exec_contract_reconciliation_async(
        self,
        request: bbp_models.ExecContractReconciliationRequest,
    ) -> bbp_models.ExecContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_reconciliation_ex_async(request, headers, runtime)

    def exec_contract_reconciliation_ex(
        self,
        request: bbp_models.ExecContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.ExecContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.ExecContractReconciliationResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.reconciliation.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_reconciliation_ex_async(
        self,
        request: bbp_models.ExecContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.ExecContractReconciliationResponse:
        """
        Description: 对账单执行
        Summary: 对账单执行接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.ExecContractReconciliationResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.reconciliation.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_contract_reconciliation(
        self,
        request: bbp_models.ConfirmContractReconciliationRequest,
    ) -> bbp_models.ConfirmContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_contract_reconciliation_ex(request, headers, runtime)

    async def confirm_contract_reconciliation_async(
        self,
        request: bbp_models.ConfirmContractReconciliationRequest,
    ) -> bbp_models.ConfirmContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_contract_reconciliation_ex_async(request, headers, runtime)

    def confirm_contract_reconciliation_ex(
        self,
        request: bbp_models.ConfirmContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.ConfirmContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.ConfirmContractReconciliationResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.reconciliation.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_contract_reconciliation_ex_async(
        self,
        request: bbp_models.ConfirmContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.ConfirmContractReconciliationResponse:
        """
        Description: 结算单确认
        Summary: 结算单确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.ConfirmContractReconciliationResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.reconciliation.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_reconciliation(
        self,
        request: bbp_models.QueryContractReconciliationRequest,
    ) -> bbp_models.QueryContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_reconciliation_ex(request, headers, runtime)

    async def query_contract_reconciliation_async(
        self,
        request: bbp_models.QueryContractReconciliationRequest,
    ) -> bbp_models.QueryContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_reconciliation_ex_async(request, headers, runtime)

    def query_contract_reconciliation_ex(
        self,
        request: bbp_models.QueryContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryContractReconciliationResponse(),
            self.do_request('1.0', 'antchain.bbp.contract.reconciliation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_reconciliation_ex_async(
        self,
        request: bbp_models.QueryContractReconciliationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryContractReconciliationResponse:
        """
        Description: 查询结算单
        Summary: 查询结算单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryContractReconciliationResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.contract.reconciliation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_customer(
        self,
        request: bbp_models.VerifyCustomerRequest,
    ) -> bbp_models.VerifyCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_customer_ex(request, headers, runtime)

    async def verify_customer_async(
        self,
        request: bbp_models.VerifyCustomerRequest,
    ) -> bbp_models.VerifyCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_customer_ex_async(request, headers, runtime)

    def verify_customer_ex(
        self,
        request: bbp_models.VerifyCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.VerifyCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.VerifyCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_customer_ex_async(
        self,
        request: bbp_models.VerifyCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.VerifyCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.VerifyCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_did_account(
        self,
        request: bbp_models.MatchDidAccountRequest,
    ) -> bbp_models.MatchDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_did_account_ex(request, headers, runtime)

    async def match_did_account_async(
        self,
        request: bbp_models.MatchDidAccountRequest,
    ) -> bbp_models.MatchDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_did_account_ex_async(request, headers, runtime)

    def match_did_account_ex(
        self,
        request: bbp_models.MatchDidAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.MatchDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.MatchDidAccountResponse(),
            self.do_request('1.0', 'antchain.bbp.did.account.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_did_account_ex_async(
        self,
        request: bbp_models.MatchDidAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.MatchDidAccountResponse:
        """
        Description: 身份关联链上账户
        Summary: 身份关联链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.MatchDidAccountResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.did.account.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def match_did_assets(
        self,
        request: bbp_models.MatchDidAssetsRequest,
    ) -> bbp_models.MatchDidAssetsResponse:
        """
        Description: 身份关数字资产
        Summary: 身份关数字资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.match_did_assets_ex(request, headers, runtime)

    async def match_did_assets_async(
        self,
        request: bbp_models.MatchDidAssetsRequest,
    ) -> bbp_models.MatchDidAssetsResponse:
        """
        Description: 身份关数字资产
        Summary: 身份关数字资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.match_did_assets_ex_async(request, headers, runtime)

    def match_did_assets_ex(
        self,
        request: bbp_models.MatchDidAssetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.MatchDidAssetsResponse:
        """
        Description: 身份关数字资产
        Summary: 身份关数字资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.MatchDidAssetsResponse(),
            self.do_request('1.0', 'antchain.bbp.did.assets.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def match_did_assets_ex_async(
        self,
        request: bbp_models.MatchDidAssetsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.MatchDidAssetsResponse:
        """
        Description: 身份关数字资产
        Summary: 身份关数字资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.MatchDidAssetsResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.did.assets.match', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_customer(
        self,
        request: bbp_models.CreateDidCustomerRequest,
    ) -> bbp_models.CreateDidCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_customer_ex(request, headers, runtime)

    async def create_did_customer_async(
        self,
        request: bbp_models.CreateDidCustomerRequest,
    ) -> bbp_models.CreateDidCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_customer_ex_async(request, headers, runtime)

    def create_did_customer_ex(
        self,
        request: bbp_models.CreateDidCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateDidCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateDidCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.did.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_customer_ex_async(
        self,
        request: bbp_models.CreateDidCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateDidCustomerResponse:
        """
        Description: DID创建及核验
        Summary: DID创建及核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateDidCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.did.customer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_enterprise(
        self,
        request: bbp_models.CreateDidEnterpriseRequest,
    ) -> bbp_models.CreateDidEnterpriseResponse:
        """
        Description: 企业DID创建及核验
        Summary: 企业DID创建及核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_enterprise_ex(request, headers, runtime)

    async def create_did_enterprise_async(
        self,
        request: bbp_models.CreateDidEnterpriseRequest,
    ) -> bbp_models.CreateDidEnterpriseResponse:
        """
        Description: 企业DID创建及核验
        Summary: 企业DID创建及核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_enterprise_ex_async(request, headers, runtime)

    def create_did_enterprise_ex(
        self,
        request: bbp_models.CreateDidEnterpriseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateDidEnterpriseResponse:
        """
        Description: 企业DID创建及核验
        Summary: 企业DID创建及核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateDidEnterpriseResponse(),
            self.do_request('1.0', 'antchain.bbp.did.enterprise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_enterprise_ex_async(
        self,
        request: bbp_models.CreateDidEnterpriseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateDidEnterpriseResponse:
        """
        Description: 企业DID创建及核验
        Summary: 企业DID创建及核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateDidEnterpriseResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.did.enterprise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_insurance_user(
        self,
        request: bbp_models.InitInsuranceUserRequest,
    ) -> bbp_models.InitInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_insurance_user_ex(request, headers, runtime)

    async def init_insurance_user_async(
        self,
        request: bbp_models.InitInsuranceUserRequest,
    ) -> bbp_models.InitInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_insurance_user_ex_async(request, headers, runtime)

    def init_insurance_user_ex(
        self,
        request: bbp_models.InitInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.InitInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.InitInsuranceUserResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_insurance_user_ex_async(
        self,
        request: bbp_models.InitInsuranceUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.InitInsuranceUserResponse:
        """
        Description: 记录用户登录保司小程序信息
        Summary: 用户登陆页面埋点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.InitInsuranceUserResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.user.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insurance(
        self,
        request: bbp_models.QueryInsuranceRequest,
    ) -> bbp_models.QueryInsuranceResponse:
        """
        Description: 保司方获取授权信息
        Summary: 获取授权信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insurance_ex(request, headers, runtime)

    async def query_insurance_async(
        self,
        request: bbp_models.QueryInsuranceRequest,
    ) -> bbp_models.QueryInsuranceResponse:
        """
        Description: 保司方获取授权信息
        Summary: 获取授权信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insurance_ex_async(request, headers, runtime)

    def query_insurance_ex(
        self,
        request: bbp_models.QueryInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryInsuranceResponse:
        """
        Description: 保司方获取授权信息
        Summary: 获取授权信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insurance_ex_async(
        self,
        request: bbp_models.QueryInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryInsuranceResponse:
        """
        Description: 保司方获取授权信息
        Summary: 获取授权信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_insurance(
        self,
        request: bbp_models.OperateInsuranceRequest,
    ) -> bbp_models.OperateInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_insurance_ex(request, headers, runtime)

    async def operate_insurance_async(
        self,
        request: bbp_models.OperateInsuranceRequest,
    ) -> bbp_models.OperateInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_insurance_ex_async(request, headers, runtime)

    def operate_insurance_ex(
        self,
        request: bbp_models.OperateInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.OperateInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.OperateInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_insurance_ex_async(
        self,
        request: bbp_models.OperateInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.OperateInsuranceResponse:
        """
        Description: 保单信息上链，保单信息同步
        Summary: 保单信息上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.OperateInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_insurance(
        self,
        request: bbp_models.UploadInsuranceRequest,
    ) -> bbp_models.UploadInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_insurance_ex(request, headers, runtime)

    async def upload_insurance_async(
        self,
        request: bbp_models.UploadInsuranceRequest,
    ) -> bbp_models.UploadInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_insurance_ex_async(request, headers, runtime)

    def upload_insurance_ex(
        self,
        request: bbp_models.UploadInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.UploadInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = bbp_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.bbp.insurance.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_insurance_response = bbp_models.UploadInsuranceResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_insurance_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.UploadInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_insurance_ex_async(
        self,
        request: bbp_models.UploadInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.UploadInsuranceResponse:
        """
        Description: 上传保单附件至阿里云OSS
        Summary: 上传保单附件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = bbp_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.bbp.insurance.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_insurance_response = bbp_models.UploadInsuranceResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_insurance_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.UploadInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_insurance(
        self,
        request: bbp_models.SyncInsuranceRequest,
    ) -> bbp_models.SyncInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_insurance_ex(request, headers, runtime)

    async def sync_insurance_async(
        self,
        request: bbp_models.SyncInsuranceRequest,
    ) -> bbp_models.SyncInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_insurance_ex_async(request, headers, runtime)

    def sync_insurance_ex(
        self,
        request: bbp_models.SyncInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.SyncInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.SyncInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_insurance_ex_async(
        self,
        request: bbp_models.SyncInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.SyncInsuranceResponse:
        """
        Description: 保险理赔受理信息同步到蚂蚁链
        Summary: 理赔受理上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.SyncInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_insurance(
        self,
        request: bbp_models.CancelInsuranceRequest,
    ) -> bbp_models.CancelInsuranceResponse:
        """
        Description: 同步用户退保信息上链
        Summary: 保单退保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_insurance_ex(request, headers, runtime)

    async def cancel_insurance_async(
        self,
        request: bbp_models.CancelInsuranceRequest,
    ) -> bbp_models.CancelInsuranceResponse:
        """
        Description: 同步用户退保信息上链
        Summary: 保单退保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_insurance_ex_async(request, headers, runtime)

    def cancel_insurance_ex(
        self,
        request: bbp_models.CancelInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CancelInsuranceResponse:
        """
        Description: 同步用户退保信息上链
        Summary: 保单退保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CancelInsuranceResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_insurance_ex_async(
        self,
        request: bbp_models.CancelInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CancelInsuranceResponse:
        """
        Description: 同步用户退保信息上链
        Summary: 保单退保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CancelInsuranceResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insurance_records(
        self,
        request: bbp_models.QueryInsuranceRecordsRequest,
    ) -> bbp_models.QueryInsuranceRecordsResponse:
        """
        Description: 查询用户的数据库保单记录
        Summary: 用户保单信息列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insurance_records_ex(request, headers, runtime)

    async def query_insurance_records_async(
        self,
        request: bbp_models.QueryInsuranceRecordsRequest,
    ) -> bbp_models.QueryInsuranceRecordsResponse:
        """
        Description: 查询用户的数据库保单记录
        Summary: 用户保单信息列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insurance_records_ex_async(request, headers, runtime)

    def query_insurance_records_ex(
        self,
        request: bbp_models.QueryInsuranceRecordsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryInsuranceRecordsResponse:
        """
        Description: 查询用户的数据库保单记录
        Summary: 用户保单信息列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryInsuranceRecordsResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.records.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insurance_records_ex_async(
        self,
        request: bbp_models.QueryInsuranceRecordsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryInsuranceRecordsResponse:
        """
        Description: 查询用户的数据库保单记录
        Summary: 用户保单信息列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryInsuranceRecordsResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.records.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insurance_chain(
        self,
        request: bbp_models.QueryInsuranceChainRequest,
    ) -> bbp_models.QueryInsuranceChainResponse:
        """
        Description: 保单链上信息查询
        Summary: 保单链上信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insurance_chain_ex(request, headers, runtime)

    async def query_insurance_chain_async(
        self,
        request: bbp_models.QueryInsuranceChainRequest,
    ) -> bbp_models.QueryInsuranceChainResponse:
        """
        Description: 保单链上信息查询
        Summary: 保单链上信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insurance_chain_ex_async(request, headers, runtime)

    def query_insurance_chain_ex(
        self,
        request: bbp_models.QueryInsuranceChainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryInsuranceChainResponse:
        """
        Description: 保单链上信息查询
        Summary: 保单链上信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryInsuranceChainResponse(),
            self.do_request('1.0', 'antchain.bbp.insurance.chain.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insurance_chain_ex_async(
        self,
        request: bbp_models.QueryInsuranceChainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.QueryInsuranceChainResponse:
        """
        Description: 保单链上信息查询
        Summary: 保单链上信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.QueryInsuranceChainResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.insurance.chain.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: bbp_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> bbp_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: bbp_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> bbp_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: bbp_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: bbp_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bbp_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bbp_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
