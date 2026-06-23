# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_dd import models as dd_models
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
        config: dd_models.Config,
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
                    'sdk_version': '1.0.9',
                    '_prod_code': 'DD',
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
                    'sdk_version': '1.0.9',
                    '_prod_code': 'DD',
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

    def query_demo_test_jltest(
        self,
        request: dd_models.QueryDemoTestJltestRequest,
    ) -> dd_models.QueryDemoTestJltestResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_test_jltest_ex(request, headers, runtime)

    async def query_demo_test_jltest_async(
        self,
        request: dd_models.QueryDemoTestJltestRequest,
    ) -> dd_models.QueryDemoTestJltestResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_test_jltest_ex_async(request, headers, runtime)

    def query_demo_test_jltest_ex(
        self,
        request: dd_models.QueryDemoTestJltestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryDemoTestJltestResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryDemoTestJltestResponse(),
            self.do_request('1.0', 'demo.test.jltest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_test_jltest_ex_async(
        self,
        request: dd_models.QueryDemoTestJltestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryDemoTestJltestResponse:
        """
        Description: 测试使用
        Summary: 测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryDemoTestJltestResponse(),
            await self.do_request_async('1.0', 'demo.test.jltest.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderx(
        self,
        request: dd_models.CreateDemoBusinessOrderxRequest,
    ) -> dd_models.CreateDemoBusinessOrderxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderx_ex(request, headers, runtime)

    async def create_demo_business_orderx_async(
        self,
        request: dd_models.CreateDemoBusinessOrderxRequest,
    ) -> dd_models.CreateDemoBusinessOrderxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderx_ex_async(request, headers, runtime)

    def create_demo_business_orderx_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderxResponse(),
            self.do_request('1.0', 'demo.business.orderx.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderx_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderxResponse(),
            await self.do_request_async('1.0', 'demo.business.orderx.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderz(
        self,
        request: dd_models.CreateDemoBusinessOrderzRequest,
    ) -> dd_models.CreateDemoBusinessOrderzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderz_ex(request, headers, runtime)

    async def create_demo_business_orderz_async(
        self,
        request: dd_models.CreateDemoBusinessOrderzRequest,
    ) -> dd_models.CreateDemoBusinessOrderzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderz_ex_async(request, headers, runtime)

    def create_demo_business_orderz_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderzResponse(),
            self.do_request('1.0', 'demo.business.orderz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderz_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderzResponse(),
            await self.do_request_async('1.0', 'demo.business.orderz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_ordery(
        self,
        request: dd_models.CreateDemoBusinessOrderyRequest,
    ) -> dd_models.CreateDemoBusinessOrderyResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_ordery_ex(request, headers, runtime)

    async def create_demo_business_ordery_async(
        self,
        request: dd_models.CreateDemoBusinessOrderyRequest,
    ) -> dd_models.CreateDemoBusinessOrderyResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_ordery_ex_async(request, headers, runtime)

    def create_demo_business_ordery_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderyResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderyResponse(),
            self.do_request('1.0', 'demo.business.ordery.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_ordery_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderyResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderyResponse(),
            await self.do_request_async('1.0', 'demo.business.ordery.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_ordern(
        self,
        request: dd_models.CreateDemoBusinessOrdernRequest,
    ) -> dd_models.CreateDemoBusinessOrdernResponse:
        """
        Description: 创建订单N
        Summary: 创建订单N
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_ordern_ex(request, headers, runtime)

    async def create_demo_business_ordern_async(
        self,
        request: dd_models.CreateDemoBusinessOrdernRequest,
    ) -> dd_models.CreateDemoBusinessOrdernResponse:
        """
        Description: 创建订单N
        Summary: 创建订单N
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_ordern_ex_async(request, headers, runtime)

    def create_demo_business_ordern_ex(
        self,
        request: dd_models.CreateDemoBusinessOrdernRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrdernResponse:
        """
        Description: 创建订单N
        Summary: 创建订单N
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrdernResponse(),
            self.do_request('1.0', 'demo.business.ordern.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_ordern_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrdernRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrdernResponse:
        """
        Description: 创建订单N
        Summary: 创建订单N
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrdernResponse(),
            await self.do_request_async('1.0', 'demo.business.ordern.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderaa(
        self,
        request: dd_models.CreateDemoBusinessOrderaaRequest,
    ) -> dd_models.CreateDemoBusinessOrderaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderaa_ex(request, headers, runtime)

    async def create_demo_business_orderaa_async(
        self,
        request: dd_models.CreateDemoBusinessOrderaaRequest,
    ) -> dd_models.CreateDemoBusinessOrderaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderaa_ex_async(request, headers, runtime)

    def create_demo_business_orderaa_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderaaResponse(),
            self.do_request('1.0', 'demo.business.orderaa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderaa_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderaaResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderaaResponse(),
            await self.do_request_async('1.0', 'demo.business.orderaa.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderq(
        self,
        request: dd_models.CreateDemoBusinessOrderqRequest,
    ) -> dd_models.CreateDemoBusinessOrderqResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderq_ex(request, headers, runtime)

    async def create_demo_business_orderq_async(
        self,
        request: dd_models.CreateDemoBusinessOrderqRequest,
    ) -> dd_models.CreateDemoBusinessOrderqResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderq_ex_async(request, headers, runtime)

    def create_demo_business_orderq_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderqResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderqResponse(),
            self.do_request('1.0', 'demo.business.orderq.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderq_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderqResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderqResponse(),
            await self.do_request_async('1.0', 'demo.business.orderq.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderb(
        self,
        request: dd_models.CreateDemoBusinessOrderbRequest,
    ) -> dd_models.CreateDemoBusinessOrderbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderb_ex(request, headers, runtime)

    async def create_demo_business_orderb_async(
        self,
        request: dd_models.CreateDemoBusinessOrderbRequest,
    ) -> dd_models.CreateDemoBusinessOrderbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderb_ex_async(request, headers, runtime)

    def create_demo_business_orderb_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderbResponse(),
            self.do_request('1.0', 'demo.business.orderb.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderb_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderbResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderbResponse(),
            await self.do_request_async('1.0', 'demo.business.orderb.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def test_demo_test_api(
        self,
        request: dd_models.TestDemoTestApiRequest,
    ) -> dd_models.TestDemoTestApiResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.test_demo_test_api_ex(request, headers, runtime)

    async def test_demo_test_api_async(
        self,
        request: dd_models.TestDemoTestApiRequest,
    ) -> dd_models.TestDemoTestApiResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.test_demo_test_api_ex_async(request, headers, runtime)

    def test_demo_test_api_ex(
        self,
        request: dd_models.TestDemoTestApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.TestDemoTestApiResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.TestDemoTestApiResponse(),
            self.do_request('1.0', 'demo.test.api.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def test_demo_test_api_ex_async(
        self,
        request: dd_models.TestDemoTestApiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.TestDemoTestApiResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.TestDemoTestApiResponse(),
            await self.do_request_async('1.0', 'demo.test.api.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderc(
        self,
        request: dd_models.CreateDemoBusinessOrdercRequest,
    ) -> dd_models.CreateDemoBusinessOrdercResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderc_ex(request, headers, runtime)

    async def create_demo_business_orderc_async(
        self,
        request: dd_models.CreateDemoBusinessOrdercRequest,
    ) -> dd_models.CreateDemoBusinessOrdercResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderc_ex_async(request, headers, runtime)

    def create_demo_business_orderc_ex(
        self,
        request: dd_models.CreateDemoBusinessOrdercRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrdercResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrdercResponse(),
            self.do_request('1.0', 'demo.business.orderc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderc_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrdercRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrdercResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrdercResponse(),
            await self.do_request_async('1.0', 'demo.business.orderc.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderd(
        self,
        request: dd_models.CreateDemoBusinessOrderdRequest,
    ) -> dd_models.CreateDemoBusinessOrderdResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderd_ex(request, headers, runtime)

    async def create_demo_business_orderd_async(
        self,
        request: dd_models.CreateDemoBusinessOrderdRequest,
    ) -> dd_models.CreateDemoBusinessOrderdResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderd_ex_async(request, headers, runtime)

    def create_demo_business_orderd_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderdResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderdResponse(),
            self.do_request('1.0', 'demo.business.orderd.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderd_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderdResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderdResponse(),
            await self.do_request_async('1.0', 'demo.business.orderd.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_acm_user_project(
        self,
        request: dd_models.QueryAntcloudAcmUserProjectRequest,
    ) -> dd_models.QueryAntcloudAcmUserProjectResponse:
        """
        Description: 查询用户所属项目列表
        Summary: 查询用户所属项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_acm_user_project_ex(request, headers, runtime)

    async def query_antcloud_acm_user_project_async(
        self,
        request: dd_models.QueryAntcloudAcmUserProjectRequest,
    ) -> dd_models.QueryAntcloudAcmUserProjectResponse:
        """
        Description: 查询用户所属项目列表
        Summary: 查询用户所属项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_acm_user_project_ex_async(request, headers, runtime)

    def query_antcloud_acm_user_project_ex(
        self,
        request: dd_models.QueryAntcloudAcmUserProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmUserProjectResponse:
        """
        Description: 查询用户所属项目列表
        Summary: 查询用户所属项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmUserProjectResponse(),
            self.do_request('1.0', 'antcloud.acm.user.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_acm_user_project_ex_async(
        self,
        request: dd_models.QueryAntcloudAcmUserProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmUserProjectResponse:
        """
        Description: 查询用户所属项目列表
        Summary: 查询用户所属项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmUserProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.user.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_antcloud_billing_config_pre(
        self,
        request: dd_models.CheckAntcloudBillingConfigPreRequest,
    ) -> dd_models.CheckAntcloudBillingConfigPreResponse:
        """
        Description: 线上对比线下计量计费资源包配置接口
        Summary: 线上对比线下计量计费资源包配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_antcloud_billing_config_pre_ex(request, headers, runtime)

    async def check_antcloud_billing_config_pre_async(
        self,
        request: dd_models.CheckAntcloudBillingConfigPreRequest,
    ) -> dd_models.CheckAntcloudBillingConfigPreResponse:
        """
        Description: 线上对比线下计量计费资源包配置接口
        Summary: 线上对比线下计量计费资源包配置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_antcloud_billing_config_pre_ex_async(request, headers, runtime)

    def check_antcloud_billing_config_pre_ex(
        self,
        request: dd_models.CheckAntcloudBillingConfigPreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CheckAntcloudBillingConfigPreResponse:
        """
        Description: 线上对比线下计量计费资源包配置接口
        Summary: 线上对比线下计量计费资源包配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CheckAntcloudBillingConfigPreResponse(),
            self.do_request('1.0', 'antcloud.billing.config.pre.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_antcloud_billing_config_pre_ex_async(
        self,
        request: dd_models.CheckAntcloudBillingConfigPreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CheckAntcloudBillingConfigPreResponse:
        """
        Description: 线上对比线下计量计费资源包配置接口
        Summary: 线上对比线下计量计费资源包配置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CheckAntcloudBillingConfigPreResponse(),
            await self.do_request_async('1.0', 'antcloud.billing.config.pre.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_antcloud_marketing_partner_coupon(
        self,
        request: dd_models.SendAntcloudMarketingPartnerCouponRequest,
    ) -> dd_models.SendAntcloudMarketingPartnerCouponResponse:
        """
        Description: 外部发券
        Summary: 外部发券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_antcloud_marketing_partner_coupon_ex(request, headers, runtime)

    async def send_antcloud_marketing_partner_coupon_async(
        self,
        request: dd_models.SendAntcloudMarketingPartnerCouponRequest,
    ) -> dd_models.SendAntcloudMarketingPartnerCouponResponse:
        """
        Description: 外部发券
        Summary: 外部发券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_antcloud_marketing_partner_coupon_ex_async(request, headers, runtime)

    def send_antcloud_marketing_partner_coupon_ex(
        self,
        request: dd_models.SendAntcloudMarketingPartnerCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.SendAntcloudMarketingPartnerCouponResponse:
        """
        Description: 外部发券
        Summary: 外部发券
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.SendAntcloudMarketingPartnerCouponResponse(),
            self.do_request('1.0', 'antcloud.marketing.partner.coupon.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_antcloud_marketing_partner_coupon_ex_async(
        self,
        request: dd_models.SendAntcloudMarketingPartnerCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.SendAntcloudMarketingPartnerCouponResponse:
        """
        Description: 外部发券
        Summary: 外部发券
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.SendAntcloudMarketingPartnerCouponResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.partner.coupon.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_marketing_partner_couponstock(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponstockRequest,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponstockResponse:
        """
        Description: 外部客户查询券余量
        Summary: 外部客户查询券余量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_marketing_partner_couponstock_ex(request, headers, runtime)

    async def query_antcloud_marketing_partner_couponstock_async(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponstockRequest,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponstockResponse:
        """
        Description: 外部客户查询券余量
        Summary: 外部客户查询券余量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_marketing_partner_couponstock_ex_async(request, headers, runtime)

    def query_antcloud_marketing_partner_couponstock_ex(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponstockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponstockResponse:
        """
        Description: 外部客户查询券余量
        Summary: 外部客户查询券余量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudMarketingPartnerCouponstockResponse(),
            self.do_request('1.0', 'antcloud.marketing.partner.couponstock.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_marketing_partner_couponstock_ex_async(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponstockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponstockResponse:
        """
        Description: 外部客户查询券余量
        Summary: 外部客户查询券余量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudMarketingPartnerCouponstockResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.partner.couponstock.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_trade_combo_options(
        self,
        request: dd_models.QueryAntcloudTradeComboOptionsRequest,
    ) -> dd_models.QueryAntcloudTradeComboOptionsResponse:
        """
        Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_trade_combo_options_ex(request, headers, runtime)

    async def query_antcloud_trade_combo_options_async(
        self,
        request: dd_models.QueryAntcloudTradeComboOptionsRequest,
    ) -> dd_models.QueryAntcloudTradeComboOptionsResponse:
        """
        Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_trade_combo_options_ex_async(request, headers, runtime)

    def query_antcloud_trade_combo_options_ex(
        self,
        request: dd_models.QueryAntcloudTradeComboOptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudTradeComboOptionsResponse:
        """
        Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudTradeComboOptionsResponse(),
            self.do_request('1.0', 'antcloud.trade.combo.options.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_trade_combo_options_ex_async(
        self,
        request: dd_models.QueryAntcloudTradeComboOptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudTradeComboOptionsResponse:
        """
        Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudTradeComboOptionsResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.combo.options.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def createwithoptions_antcloud_trade_combo(
        self,
        request: dd_models.CreatewithoptionsAntcloudTradeComboRequest,
    ) -> dd_models.CreatewithoptionsAntcloudTradeComboResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.createwithoptions_antcloud_trade_combo_ex(request, headers, runtime)

    async def createwithoptions_antcloud_trade_combo_async(
        self,
        request: dd_models.CreatewithoptionsAntcloudTradeComboRequest,
    ) -> dd_models.CreatewithoptionsAntcloudTradeComboResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.createwithoptions_antcloud_trade_combo_ex_async(request, headers, runtime)

    def createwithoptions_antcloud_trade_combo_ex(
        self,
        request: dd_models.CreatewithoptionsAntcloudTradeComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreatewithoptionsAntcloudTradeComboResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreatewithoptionsAntcloudTradeComboResponse(),
            self.do_request('1.0', 'antcloud.trade.combo.createwithoptions', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def createwithoptions_antcloud_trade_combo_ex_async(
        self,
        request: dd_models.CreatewithoptionsAntcloudTradeComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreatewithoptionsAntcloudTradeComboResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreatewithoptionsAntcloudTradeComboResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.combo.createwithoptions', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antcloud_trade_combo(
        self,
        request: dd_models.CancelAntcloudTradeComboRequest,
    ) -> dd_models.CancelAntcloudTradeComboResponse:
        """
        Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antcloud_trade_combo_ex(request, headers, runtime)

    async def cancel_antcloud_trade_combo_async(
        self,
        request: dd_models.CancelAntcloudTradeComboRequest,
    ) -> dd_models.CancelAntcloudTradeComboResponse:
        """
        Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antcloud_trade_combo_ex_async(request, headers, runtime)

    def cancel_antcloud_trade_combo_ex(
        self,
        request: dd_models.CancelAntcloudTradeComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CancelAntcloudTradeComboResponse:
        """
        Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CancelAntcloudTradeComboResponse(),
            self.do_request('1.0', 'antcloud.trade.combo.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antcloud_trade_combo_ex_async(
        self,
        request: dd_models.CancelAntcloudTradeComboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CancelAntcloudTradeComboResponse:
        """
        Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CancelAntcloudTradeComboResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.combo.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_trade_combo_options(
        self,
        request: dd_models.CreateAntcloudTradeComboOptionsRequest,
    ) -> dd_models.CreateAntcloudTradeComboOptionsResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_trade_combo_options_ex(request, headers, runtime)

    async def create_antcloud_trade_combo_options_async(
        self,
        request: dd_models.CreateAntcloudTradeComboOptionsRequest,
    ) -> dd_models.CreateAntcloudTradeComboOptionsResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_trade_combo_options_ex_async(request, headers, runtime)

    def create_antcloud_trade_combo_options_ex(
        self,
        request: dd_models.CreateAntcloudTradeComboOptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudTradeComboOptionsResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudTradeComboOptionsResponse(),
            self.do_request('1.0', 'antcloud.trade.combo.options.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_trade_combo_options_ex_async(
        self,
        request: dd_models.CreateAntcloudTradeComboOptionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudTradeComboOptionsResponse:
        """
        Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudTradeComboOptionsResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.combo.options.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_pcc_commodity_price(
        self,
        request: dd_models.QueryAntcloudPccCommodityPriceRequest,
    ) -> dd_models.QueryAntcloudPccCommodityPriceResponse:
        """
        Description: 商品定价查询
        Summary: 商品定价查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_pcc_commodity_price_ex(request, headers, runtime)

    async def query_antcloud_pcc_commodity_price_async(
        self,
        request: dd_models.QueryAntcloudPccCommodityPriceRequest,
    ) -> dd_models.QueryAntcloudPccCommodityPriceResponse:
        """
        Description: 商品定价查询
        Summary: 商品定价查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_pcc_commodity_price_ex_async(request, headers, runtime)

    def query_antcloud_pcc_commodity_price_ex(
        self,
        request: dd_models.QueryAntcloudPccCommodityPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudPccCommodityPriceResponse:
        """
        Description: 商品定价查询
        Summary: 商品定价查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudPccCommodityPriceResponse(),
            self.do_request('1.0', 'antcloud.pcc.commodity.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_pcc_commodity_price_ex_async(
        self,
        request: dd_models.QueryAntcloudPccCommodityPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudPccCommodityPriceResponse:
        """
        Description: 商品定价查询
        Summary: 商品定价查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudPccCommodityPriceResponse(),
            await self.do_request_async('1.0', 'antcloud.pcc.commodity.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
