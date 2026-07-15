# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_cliproduct import models as cliproduct_models
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
        config: cliproduct_models.Config,
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
            # 商品明细
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
                    '_prod_code': 'CLIPRODUCT',
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
            # 商品明细
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
                    '_prod_code': 'CLIPRODUCT',
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

    def create_business_orderzzz(
        self,
        request: cliproduct_models.CreateBusinessOrderzzzRequest,
    ) -> cliproduct_models.CreateBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderzzz_ex(request, headers, runtime)

    async def create_business_orderzzz_async(
        self,
        request: cliproduct_models.CreateBusinessOrderzzzRequest,
    ) -> cliproduct_models.CreateBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderzzz_ex_async(request, headers, runtime)

    def create_business_orderzzz_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderzzzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderzzzResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderzzz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderzzz_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderzzzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderzzzResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderzzz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderppp(
        self,
        request: cliproduct_models.CreateBusinessOrderpppRequest,
    ) -> cliproduct_models.CreateBusinessOrderpppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderppp_ex(request, headers, runtime)

    async def create_business_orderppp_async(
        self,
        request: cliproduct_models.CreateBusinessOrderpppRequest,
    ) -> cliproduct_models.CreateBusinessOrderpppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderppp_ex_async(request, headers, runtime)

    def create_business_orderppp_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderpppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderpppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderpppResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderppp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderppp_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderpppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderpppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderpppResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderppp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apia_cli_create(
        self,
        request: cliproduct_models.ApiaCliCreateRequest,
    ) -> cliproduct_models.ApiaCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apia_cli_create_ex(request, headers, runtime)

    async def apia_cli_create_async(
        self,
        request: cliproduct_models.ApiaCliCreateRequest,
    ) -> cliproduct_models.ApiaCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apia_cli_create_ex_async(request, headers, runtime)

    def apia_cli_create_ex(
        self,
        request: cliproduct_models.ApiaCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApiaCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApiaCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apia_cli_create_ex_async(
        self,
        request: cliproduct_models.ApiaCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApiaCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApiaCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apib_cli_create(
        self,
        request: cliproduct_models.ApibCliCreateRequest,
    ) -> cliproduct_models.ApibCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apib_cli_create_ex(request, headers, runtime)

    async def apib_cli_create_async(
        self,
        request: cliproduct_models.ApibCliCreateRequest,
    ) -> cliproduct_models.ApibCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apib_cli_create_ex_async(request, headers, runtime)

    def apib_cli_create_ex(
        self,
        request: cliproduct_models.ApibCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApibCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApibCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apib', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apib_cli_create_ex_async(
        self,
        request: cliproduct_models.ApibCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApibCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApibCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apib', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apic_cli_create(
        self,
        request: cliproduct_models.ApicCliCreateRequest,
    ) -> cliproduct_models.ApicCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apic_cli_create_ex(request, headers, runtime)

    async def apic_cli_create_async(
        self,
        request: cliproduct_models.ApicCliCreateRequest,
    ) -> cliproduct_models.ApicCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apic_cli_create_ex_async(request, headers, runtime)

    def apic_cli_create_ex(
        self,
        request: cliproduct_models.ApicCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApicCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApicCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apic', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apic_cli_create_ex_async(
        self,
        request: cliproduct_models.ApicCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApicCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApicCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apic', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apie_cli_create(
        self,
        request: cliproduct_models.ApieCliCreateRequest,
    ) -> cliproduct_models.ApieCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apie_cli_create_ex(request, headers, runtime)

    async def apie_cli_create_async(
        self,
        request: cliproduct_models.ApieCliCreateRequest,
    ) -> cliproduct_models.ApieCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apie_cli_create_ex_async(request, headers, runtime)

    def apie_cli_create_ex(
        self,
        request: cliproduct_models.ApieCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApieCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApieCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apie', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apie_cli_create_ex_async(
        self,
        request: cliproduct_models.ApieCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApieCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApieCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apie', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderaaa(
        self,
        request: cliproduct_models.CreateBusinessOrderaaaRequest,
    ) -> cliproduct_models.CreateBusinessOrderaaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderaaa_ex(request, headers, runtime)

    async def create_business_orderaaa_async(
        self,
        request: cliproduct_models.CreateBusinessOrderaaaRequest,
    ) -> cliproduct_models.CreateBusinessOrderaaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderaaa_ex_async(request, headers, runtime)

    def create_business_orderaaa_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderaaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderaaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderaaaResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderaaa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderaaa_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderaaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderaaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderaaaResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderaaa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderbbb(
        self,
        request: cliproduct_models.CreateBusinessOrderbbbRequest,
    ) -> cliproduct_models.CreateBusinessOrderbbbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderbbb_ex(request, headers, runtime)

    async def create_business_orderbbb_async(
        self,
        request: cliproduct_models.CreateBusinessOrderbbbRequest,
    ) -> cliproduct_models.CreateBusinessOrderbbbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderbbb_ex_async(request, headers, runtime)

    def create_business_orderbbb_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderbbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderbbbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderbbbResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderbbb.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderbbb_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderbbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderbbbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderbbbResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderbbb.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_ordereee(
        self,
        request: cliproduct_models.CreateBusinessOrdereeeRequest,
    ) -> cliproduct_models.CreateBusinessOrdereeeResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_ordereee_ex(request, headers, runtime)

    async def create_business_ordereee_async(
        self,
        request: cliproduct_models.CreateBusinessOrdereeeRequest,
    ) -> cliproduct_models.CreateBusinessOrdereeeResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_ordereee_ex_async(request, headers, runtime)

    def create_business_ordereee_ex(
        self,
        request: cliproduct_models.CreateBusinessOrdereeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrdereeeResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrdereeeResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.ordereee.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_ordereee_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrdereeeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrdereeeResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrdereeeResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.ordereee.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderddd(
        self,
        request: cliproduct_models.CreateBusinessOrderdddRequest,
    ) -> cliproduct_models.CreateBusinessOrderdddResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderddd_ex(request, headers, runtime)

    async def create_business_orderddd_async(
        self,
        request: cliproduct_models.CreateBusinessOrderdddRequest,
    ) -> cliproduct_models.CreateBusinessOrderdddResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderddd_ex_async(request, headers, runtime)

    def create_business_orderddd_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderdddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderdddResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderdddResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderddd.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderddd_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderdddRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderdddResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderdddResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderddd.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderabc(
        self,
        request: cliproduct_models.CreateBusinessOrderabcRequest,
    ) -> cliproduct_models.CreateBusinessOrderabcResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderabc_ex(request, headers, runtime)

    async def create_business_orderabc_async(
        self,
        request: cliproduct_models.CreateBusinessOrderabcRequest,
    ) -> cliproduct_models.CreateBusinessOrderabcResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderabc_ex_async(request, headers, runtime)

    def create_business_orderabc_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderabcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderabcResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderabcResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderabc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderabc_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderabcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderabcResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderabcResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderabc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderfff(
        self,
        request: cliproduct_models.CreateBusinessOrderfffRequest,
    ) -> cliproduct_models.CreateBusinessOrderfffResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderfff_ex(request, headers, runtime)

    async def create_business_orderfff_async(
        self,
        request: cliproduct_models.CreateBusinessOrderfffRequest,
    ) -> cliproduct_models.CreateBusinessOrderfffResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderfff_ex_async(request, headers, runtime)

    def create_business_orderfff_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderfffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderfffResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderfffResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderfff.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderfff_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderfffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderfffResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderfffResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderfff.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderggg(
        self,
        request: cliproduct_models.CreateBusinessOrdergggRequest,
    ) -> cliproduct_models.CreateBusinessOrdergggResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderggg_ex(request, headers, runtime)

    async def create_business_orderggg_async(
        self,
        request: cliproduct_models.CreateBusinessOrdergggRequest,
    ) -> cliproduct_models.CreateBusinessOrdergggResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderggg_ex_async(request, headers, runtime)

    def create_business_orderggg_ex(
        self,
        request: cliproduct_models.CreateBusinessOrdergggRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrdergggResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrdergggResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderggg.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderggg_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrdergggRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrdergggResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrdergggResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderggg.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderh(
        self,
        request: cliproduct_models.CreateBusinessOrderhRequest,
    ) -> cliproduct_models.CreateBusinessOrderhResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderh_ex(request, headers, runtime)

    async def create_business_orderh_async(
        self,
        request: cliproduct_models.CreateBusinessOrderhRequest,
    ) -> cliproduct_models.CreateBusinessOrderhResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderh_ex_async(request, headers, runtime)

    def create_business_orderh_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderhResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderhResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderh_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderhResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderhResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderi(
        self,
        request: cliproduct_models.CreateBusinessOrderiRequest,
    ) -> cliproduct_models.CreateBusinessOrderiResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderi_ex(request, headers, runtime)

    async def create_business_orderi_async(
        self,
        request: cliproduct_models.CreateBusinessOrderiRequest,
    ) -> cliproduct_models.CreateBusinessOrderiResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderi_ex_async(request, headers, runtime)

    def create_business_orderi_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderiResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderiResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderi_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderiResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderiResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderj(
        self,
        request: cliproduct_models.CreateBusinessOrderjRequest,
    ) -> cliproduct_models.CreateBusinessOrderjResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderj_ex(request, headers, runtime)

    async def create_business_orderj_async(
        self,
        request: cliproduct_models.CreateBusinessOrderjRequest,
    ) -> cliproduct_models.CreateBusinessOrderjResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderj_ex_async(request, headers, runtime)

    def create_business_orderj_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderjResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderjResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderj.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderj_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderjResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderjResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderj.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderk(
        self,
        request: cliproduct_models.CreateBusinessOrderkRequest,
    ) -> cliproduct_models.CreateBusinessOrderkResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderk_ex(request, headers, runtime)

    async def create_business_orderk_async(
        self,
        request: cliproduct_models.CreateBusinessOrderkRequest,
    ) -> cliproduct_models.CreateBusinessOrderkResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderk_ex_async(request, headers, runtime)

    def create_business_orderk_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderkResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderkResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderk.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderk_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderkResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderkResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderk.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderl(
        self,
        request: cliproduct_models.CreateBusinessOrderlRequest,
    ) -> cliproduct_models.CreateBusinessOrderlResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderl_ex(request, headers, runtime)

    async def create_business_orderl_async(
        self,
        request: cliproduct_models.CreateBusinessOrderlRequest,
    ) -> cliproduct_models.CreateBusinessOrderlResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderl_ex_async(request, headers, runtime)

    def create_business_orderl_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderlResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderlResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderl_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderlResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderlResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderl.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_ordero(
        self,
        request: cliproduct_models.CreateBusinessOrderoRequest,
    ) -> cliproduct_models.CreateBusinessOrderoResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_ordero_ex(request, headers, runtime)

    async def create_business_ordero_async(
        self,
        request: cliproduct_models.CreateBusinessOrderoRequest,
    ) -> cliproduct_models.CreateBusinessOrderoResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_ordero_ex_async(request, headers, runtime)

    def create_business_ordero_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderoResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderoResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.ordero.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_ordero_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderoResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderoResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.ordero.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orderr(
        self,
        request: cliproduct_models.CreateBusinessOrderrRequest,
    ) -> cliproduct_models.CreateBusinessOrderrResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orderr_ex(request, headers, runtime)

    async def create_business_orderr_async(
        self,
        request: cliproduct_models.CreateBusinessOrderrRequest,
    ) -> cliproduct_models.CreateBusinessOrderrResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orderr_ex_async(request, headers, runtime)

    def create_business_orderr_ex(
        self,
        request: cliproduct_models.CreateBusinessOrderrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderrResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderrResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orderr.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orderr_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrderrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrderrResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrderrResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orderr.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_business_orders(
        self,
        request: cliproduct_models.CreateBusinessOrdersRequest,
    ) -> cliproduct_models.CreateBusinessOrdersResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_business_orders_ex(request, headers, runtime)

    async def create_business_orders_async(
        self,
        request: cliproduct_models.CreateBusinessOrdersRequest,
    ) -> cliproduct_models.CreateBusinessOrdersResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_business_orders_ex_async(request, headers, runtime)

    def create_business_orders_ex(
        self,
        request: cliproduct_models.CreateBusinessOrdersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrdersResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrdersResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.business.orders.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_business_orders_ex_async(
        self,
        request: cliproduct_models.CreateBusinessOrdersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.CreateBusinessOrdersResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.CreateBusinessOrdersResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.business.orders.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apif_cli_create(
        self,
        request: cliproduct_models.ApifCliCreateRequest,
    ) -> cliproduct_models.ApifCliCreateResponse:
        """
        Description: cli创建测试接口D
        Summary: cli创建测试接口D
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apif_cli_create_ex(request, headers, runtime)

    async def apif_cli_create_async(
        self,
        request: cliproduct_models.ApifCliCreateRequest,
    ) -> cliproduct_models.ApifCliCreateResponse:
        """
        Description: cli创建测试接口D
        Summary: cli创建测试接口D
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apif_cli_create_ex_async(request, headers, runtime)

    def apif_cli_create_ex(
        self,
        request: cliproduct_models.ApifCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApifCliCreateResponse:
        """
        Description: cli创建测试接口D
        Summary: cli创建测试接口D
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApifCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apif', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apif_cli_create_ex_async(
        self,
        request: cliproduct_models.ApifCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApifCliCreateResponse:
        """
        Description: cli创建测试接口D
        Summary: cli创建测试接口D
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApifCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apif', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apig_cli_create(
        self,
        request: cliproduct_models.ApigCliCreateRequest,
    ) -> cliproduct_models.ApigCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apig_cli_create_ex(request, headers, runtime)

    async def apig_cli_create_async(
        self,
        request: cliproduct_models.ApigCliCreateRequest,
    ) -> cliproduct_models.ApigCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apig_cli_create_ex_async(request, headers, runtime)

    def apig_cli_create_ex(
        self,
        request: cliproduct_models.ApigCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApigCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApigCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apig', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apig_cli_create_ex_async(
        self,
        request: cliproduct_models.ApigCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApigCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApigCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apig', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_cli_create(
        self,
        request: cliproduct_models.ApiCliCreateRequest,
    ) -> cliproduct_models.ApiCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_cli_create_ex(request, headers, runtime)

    async def api_cli_create_async(
        self,
        request: cliproduct_models.ApiCliCreateRequest,
    ) -> cliproduct_models.ApiCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_cli_create_ex_async(request, headers, runtime)

    def api_cli_create_ex(
        self,
        request: cliproduct_models.ApiCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApiCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApiCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_cli_create_ex_async(
        self,
        request: cliproduct_models.ApiCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApiCliCreateResponse:
        """
        Description: cli创建测试接口G
        Summary: cli创建测试接口G
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApiCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apih_cli_create(
        self,
        request: cliproduct_models.ApihCliCreateRequest,
    ) -> cliproduct_models.ApihCliCreateResponse:
        """
        Description: cli创建测试接口h
        Summary: cli创建测试接口h
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apih_cli_create_ex(request, headers, runtime)

    async def apih_cli_create_async(
        self,
        request: cliproduct_models.ApihCliCreateRequest,
    ) -> cliproduct_models.ApihCliCreateResponse:
        """
        Description: cli创建测试接口h
        Summary: cli创建测试接口h
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apih_cli_create_ex_async(request, headers, runtime)

    def apih_cli_create_ex(
        self,
        request: cliproduct_models.ApihCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApihCliCreateResponse:
        """
        Description: cli创建测试接口h
        Summary: cli创建测试接口h
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApihCliCreateResponse(),
            self.do_request('1.0', 'antdigital.cliproduct.cli.create.apih', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apih_cli_create_ex_async(
        self,
        request: cliproduct_models.ApihCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> cliproduct_models.ApihCliCreateResponse:
        """
        Description: cli创建测试接口h
        Summary: cli创建测试接口h
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            cliproduct_models.ApihCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.cliproduct.cli.create.apih', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
